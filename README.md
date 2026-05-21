# PDA - Personal Digital Assistant

一个Android个人数字助手应用程序项目。

## 项目信息

- **项目名称**: pda-material  
- **应用ID**: cn.starhelix.material
- **最小SDK版本**: 26
- **目标SDK版本**: 33
- **编译SDK版本**: 33

## 项目结构

```
pda-material/
├── app/                          # Android应用主模块
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/cn/starhelix/material/  # Java源代码
│   │   │   │   ├── MainActivity.java        # 主页面
│   │   │   │   ├── MaterialApplication.java # 应用类
│   │   │   │   ├── LoginActivity.java       # 登录页面
│   │   │   │   ├── BatchListActivity.java   # 批量列表
│   │   │   │   ├── PremixListActivity.java  # 预混合列表
│   │   │   │   └── ...其他Activity和工具类
│   │   │   ├── res/                         # 资源文件
│   │   │   └── AndroidManifest.xml
│   │   ├── androidTest/
│   │   └── test/
│   ├── build.gradle              # 模块构建文件
│   ├── proguard-rules.pro        # ProGuard规则
│   └── libs/                     # 第三方库
├── gradle/                        # Gradle包装程序
├── build.gradle                  # 根构建文件
├── settings.gradle               # Gradle设置
├── gradle.properties             # Gradle属性
└── README.md                     # 本文件

## 技术栈

### 主要依赖库

- **UI框架**:
  - androidx.appcompat:appcompat:1.4.1
  - com.google.android.material:material:1.9.0
  - androidx.constraintlayout:constraintlayout:2.1.3

- **网络请求**:
  - com.squareup.retrofit2:retrofit:2.9.0
  - com.squareup.okhttp3:okhttp:4.11.0
  - com.squareup.retrofit2:converter-gson:2.9.0

- **响应式编程**:
  - io.reactivex.rxjava3:rxjava:3.1.6
  - io.reactivex.rxjava3:rxandroid:3.0.2
  - com.squareup.retrofit2:adapter-rxjava3:2.9.0

- **其他**:
  - com.google.code.gson:gson:2.10.1
  - com.google.guava:guava:32.1.2-android
  - io.github.scwang90:refresh-layout 系列库

## 项目状态

当前版本: 1.0.8

## 说明

此仓库目前正在上传中。由于文件众多，如需完整文件，建议通过以下方式更新：

```bash
# 使用git命令行推送完整项目
git clone https://github.com/xuyun0730/PDA.git
cd PDA
# 拉取更新
git pull
```

或者使用GitHub Desktop应用程序进行管理。

## 许可证

待定

## 联系方式

项目维护者: [@xuyun0730](https://github.com/xuyun0730)
