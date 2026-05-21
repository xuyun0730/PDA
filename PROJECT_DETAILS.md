# PDA 项目详情

## 📱 项目概览

**项目名称**: Personal Digital Assistant Material (个人数字助手)  
**仓库地址**: https://github.com/xuyun0730/PDA  
**项目类型**: Android 原生应用  
**开发语言**: Java + XML

## 🚀 快速开始

### 前置要求
- Android Studio 最新版本
- Java 1.8 或更高版本
- Gradle 8.0+
- Android SDK 33 或更高版本

### 克隆项目
```bash
git clone https://github.com/xuyun0730/PDA.git
cd PDA
```

### 构建项目
```bash
# 使用 Gradle Wrapper (推荐)
./gradlew build

# 或在 Windows 上
gradlew.bat build

# 安装到设备/模拟器
./gradlew installDebug
```

## 📦 项目架构

```
PDA (GitHub Repository)
│
├── 项目配置文件
│   ├── build.gradle                 # 根项目构建文件
│   ├── settings.gradle              # Gradle 子项目设置
│   ├── gradle.properties            # Gradle 全局属性
│   ├── gradle/                      # Gradle Wrapper
│   ├── gradlew / gradlew.bat        # Gradle 启动脚本
│   └── .gitignore                   # Git 忽略规则
│
└── app/                             # Android 应用模块
    ├── src/
    │   ├── main/
    │   │   ├── java/cn/starhelix/material/
    │   │   │   ├── Activities/              # 页面类
    │   │   │   │   ├── MainActivity.java
    │   │   │   │   ├── LoginActivity.java
    │   │   │   │   ├── BatchListActivity.java
    │   │   │   │   ├── MaterialListActivity.java
    │   │   │   │   ├── PremixListActivity.java
    │   │   │   │   ├── PremixSubListActivity.java
    │   │   │   │   ├── ChooseMixActivity.java
    │   │   │   │   ├── ConfigServerActivity.java
    │   │   │   │   ├── LoadingWidgetActivity.java
    │   │   │   │   ├── ScannerReceiverActivity.java
    │   │   │   │   └── TestScannerReceiverActivity.java
    │   │   │   ├── MaterialApplication.java # 应用类
    │   │   │   ├── data/                    # 数据模型
    │   │   │   ├── entity/                  # 实体类
    │   │   │   ├── service/                 # 网络服务接口
    │   │   │   ├── adapter/                 # 列表适配器
    │   │   │   ├── converter/               # 数据转换器
    │   │   │   ├── util/                    # 工具类
    │   │   │   └── widget/                  # 自定义控件
    │   │   ├── res/                         # 资源文件
    │   │   │   ├── layout/                  # 布局文件
    │   │   │   ├── values/                  # 字符串、颜色、样式等
    │   │   │   ├── mipmap/                  # 应用图标
    │   │   │   ├── xml/                     # XML 配置
    │   │   │   └── drawable/                # 图片资源
    │   │   └── AndroidManifest.xml          # 应用清单
    │   ├── androidTest/                     # Android 测试
    │   └── test/                            # 单元测试
    ├── build.gradle                 # 模块构建文件
    ├── proguard-rules.pro          # ProGuard 混淆规则
    ├── libs/                        # 本地 JAR 库
    │   └── platform_sdk_v4.1.0326.jar
    └── .gitignore                   # 模块 Git 忽略规则
```

## 🔧 主要功能模块

### 1. 认证模块
- **LoginActivity**: 用户登录界面
- 支持用户名/密码登录
- Token 持久化存储

### 2. 数据展示模块
- **BatchListActivity**: 批量列表展示
- **MaterialListActivity**: 物料列表
- **PremixListActivity**: 预混合配方列表
- 列表刷新和分页加载

### 3. 业务逻辑模块
- **ChooseMixActivity**: 选择混合方案
- **PremixSubListActivity**: 预混合子列表
- 配置服务器地址

### 4. 工具和资源
- 网络请求工具
- SharedPreferences 本地存储
- 字符串处理工具
- 应用信息工具

## 📚 主要技术栈

| 技术 | 版本 | 用途 |
|------|------|------|
| AndroidX AppCompat | 1.4.1 | UI 兼容性支持 |
| Material Design | 1.9.0 | Material Design 组件 |
| ConstraintLayout | 2.1.3 | 灵活的布局系统 |
| Retrofit | 2.9.0 | HTTP 客户端 |
| OkHttp | 4.11.0 | HTTP 拦截和请求 |
| RxJava | 3.1.6 | 响应式编程 |
| Gson | 2.10.1 | JSON 序列化/反序列化 |
| GuavaAndroid | 32.1.2-android | Google 工具库 |
| SmartRefresh | 2.0.6 | 下拉刷新/上拉加载 |

## 🔐 应用配置

### 应用信息
- **包名**: cn.starhelix.material
- **应用版本**: 1.0.8 (versionCode: 8)
- **最小 SDK**: API 26 (Android 8.0)
- **目标 SDK**: API 33 (Android 13)
- **编译 SDK**: API 33

### 构建配置
```gradle
namespace 'cn.starhelix.material'
compileSdk 33
minSdk 26
targetSdk 33
versionCode 8
versionName "1.0.8"
```

## 📝 编码规范

- **语言**: Java 1.8
- **包结构**: 按功能模块组织
- **命名规范**: 
  - Activity 类: `*Activity.java`
  - Service 类: `*Service.java`
  - Adapter 类: `*Adapter.java`
  - 工具类: `*Util.java`

## 🔒 安全配置

### ProGuard 混淆
- 项目已配置 ProGuard 规则
- Release 构建启用代码混淆
- 规则文件: `app/proguard-rules.pro`

### 应用签名
- 已配置 Release 签名配置
- Keystore 路径: `../keystore.jks`
- 使用自定义 Release APK 命名规则

## 📊 项目状态

- ✅ 基础项目框架已创建
- ✅ Gradle 构建配置完成
- ✅ 主要 Activity 和服务已实现
- ✅ 网络请求框架已集成
- ✅ 本地数据存储已实现
- ⏳ 完整文件上传进行中

## 📖 文档

- [README.md](README.md) - 项目简介
- [UPLOAD_INSTRUCTIONS.md](UPLOAD_INSTRUCTIONS.md) - 上传说明
- [PROJECT_DETAILS.md](PROJECT_DETAILS.md) - 本文件

## 🤝 贡献指南

如需在此项目上进行开发:

1. Fork 该仓库
2. 创建特性分支 (`git checkout -b feature/AmazingFeature`)
3. 提交更改 (`git commit -m 'Add some AmazingFeature'`)
4. 推送到分支 (`git push origin feature/AmazingFeature`)
5. 开启 Pull Request

## ⚠️ 已知问题

- 项目部分文件仍在上传中（因 API 限制）
- 建议使用 Git 命令行完整克隆最新版本

## 📞 联系方式

- GitHub: [@xuyun0730](https://github.com/xuyun0730)
- 项目维护者: 绪韵

## 📄 许可证

待定

---

**最后更新**: 2026-05-21  
**项目状态**: 积极开发中 🚀
