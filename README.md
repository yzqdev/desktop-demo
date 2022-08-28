# 开发桌面软件的技术

## 可以开发exe桌面程序的技术

### wpf

微软官方文档这样说的: Windows Presentation Foundation 是一个可创建桌面客户端应用程序的 UI 框架。 WPF 开发平台支持广泛的应用开发功能，包括应用模型、资源、控件、图形、布局、数据绑定、文档和安全性.

开发windows软件,首选wpf,效率高,性能好

<https://docs.microsoft.com/zh-cn/visualstudio/designers/getting-started-with-wpf?view=vs-2022>

### winform

其实就是对mfc的封装,拖拖拽拽就可以写出一个界面了,适合写小软件.如果需要花里胡哨的界面,那推荐使用wpf

### maui或者windows app sdk

windows app sdk,跟uwp差不多,是一种新的开发人员组件和工具,好久好在winui的默认样式挺好看的(对比wpf) 而maui(Multi-platform App UI) 是一个跨平台 UI 框架（前身是 Xamarin.Forms）可以写android,ios,windows,macos等系统的应用,前些天刚GA,除了linux不支持(社区支持,约等于不支持),android很多功能没实现,貌似还可以 (昨天vs17.3正式支持了maui,可以尝试一下)

<https://docs.microsoft.com/zh-cn/dotnet/maui/>

### flutter desktop

flutter大家都知道,现在可以开发桌面应用了,我现在开发桌面应用首选flutter,前提是不要太多与系统的交互

<https://flutter.dev/multi-platform/desktop>

### electron/tauri

Electron,使用 JavaScript，HTML 和 CSS 构建跨平台的桌面应用程序,对于前端开发很友好,因为使用Web 技术,所以开发花里胡哨的界面很舒服,缺点就是要打包一个chrome进去

<https://www.electronjs.org/>

而tauri跟electron有点像,也是使用web技术开发界面,区别在于tauri使用了rust,不需要打包chrome进去,使用的是系统的webview,比如windows上用的webview2,打包体积很小

<https://tauri.app/>

### neutralinojs

跟electron有点类似,也是用web技术开发app,不过Neutralinojs 不捆绑 Chromium，而是使用操作系统中现有的 Web 浏览器库

<https://github.com/neutralinojs/neutralinojs>

### sciter

也是一个用 HTML/CSS 来渲染现代应用程序 UI 的脚本引擎,很小众

<https://sciter.com/>

### wails

使用 Go和web技术构建漂亮的跨平台桌面应用,有点像tauri,不过他比tauri出来的早 <https://github.com/wailsapp/wails>

### qt

Qt 是一个跨平台的C++应用程序开发框架,使用c++开发,既可以开发GUI程序，也可用于开发非GUI程序.(使用的是c++,所以相对要求较高)

<https://doc.qt.io/>

### unity

Unity3d,使用里面的UGUI框架，同样可以做桌面开发

<https://unity.com/cn>

### autoit和autohotkey

其实这两个也可以开发gui的,dropit就是用autoit开发的 <https://www.autoitscript.com/site/autoit/>

### Golang + Fyne

go语言的一个ui库

<https://github.com/fyne-io/fyne>

### pyside6

PySide6是在Python环境下的一套Qt6 API库。使用PySide6可以轻松创建基于Qt6的GUI程序,跟pyqt不一样,pyside6是qt官方维护的 <https://doc.qt.io/qtforpython/PySide6/QtWidgets/index.html>

### aardio

一个小众的windows桌面软件开发,开发个小工具还是蛮不错的

<https://www.aardio.com/>

### javafx

javafx是用可以来替代awt,swing的库,用于java桌面开发,体验还不错

<https://openjfx.io/>

### kotlin compose desktop

jetbrains官方这样描述: Compose for Desktop 为使用 Kotlin 创建桌面用户界面提供了一种声明和反应式方法。结合可组合的功能来构建您的用户界面，并从您的 IDE 和构建系统中享受完整的工具支持 – 无需 XML 或模板语言

<https://www.jetbrains.com/zh-cn/lp/compose-mpp/>

### delphi/Lazarus

非常好用的跨平台桌面开发,可是用的人很少,使用的pascal语言

<https://www.lazarus-ide.org/>

## 可以生成独立exe的有

- wpf,winform   使用-p:PublishSingleFile=true就可以生成独立exe
- tauri,neutralinojs,wails,aardio,Lazarus,Fyne     打包出来就是独立exe
- pyside6  用pyinstaller或者nutika打包为独立exe
- autohotkey  可以用Ahk2Exe编译为独立exe
- javafx  可以使用exe4j等工具把生成的jar转为独立exe
