name := "demo"

version := "1.0"

lazy val `playJava` = (project in file(".")).enablePlugins(PlayJava)

resolvers += "Akka Snapshot Repository" at "https://repo.akka.io/snapshots/"

scalaVersion := "2.13.5"

libraryDependencies ++= Seq(javaJdbc, javaWs, guice, javaForms, cacheApi)
libraryDependencies ++= Seq("org.mockito" % "mockito-core" % "4.4.0" % "test")
// https://github.com/pac4j/play-pac4j
libraryDependencies ++= Seq("org.pac4j" %% "play-pac4j" % "11.0.0-PLAY2.8")

// https://github.com/morellik/play-morphia
libraryDependencies ++= Seq(
  "org.mongodb" % "mongo-java-driver" % "3.12.10",
  "dev.morphia.morphia" % "core" % "1.6.1"
)
// http://reactivemongo.org/releases/0.1x/documentation/tutorial/play.html
// https://mvnrepository.com/artifact/org.reactivemongo/play2-reactivemongo
libraryDependencies += "org.reactivemongo" %% "play2-reactivemongo" % "1.1.0-play28-RC3"

// https://github.com/KarelCemus/play-redis
// include play-redis library
libraryDependencies += "com.github.karelcemus" %% "play-redis" % "2.7.0"

// https://github.com/mumoshu/play2-memcached
// https://mvnrepository.com/artifact/com.github.mumoshu/play2-memcached-play28
libraryDependencies += "com.github.mumoshu" %% "play2-memcached-play28" % "0.11.0"

libraryDependencies += "com.enragedginger" %% "akka-quartz-scheduler" % "1.9.2-akka-2.6.x"
libraryDependencies += "com.enragedginger" %% "akka-quartz-scheduler" % "1.9.2-akka-2.6.x"
// https://github.com/innoveit/play2-pdf
libraryDependencies += "it.innove" % "play2-pdf" % "1.10.0"

// https://adrianhurt.github.io/play-bootstrap/
// Resolver is needed only for SNAPSHOT versions
resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"
libraryDependencies ++= Seq(
  "com.adrianhurt" %% "play-bootstrap" % "1.6.1-P28-B4"
)

// https://github.com/playframework/play-mailer
libraryDependencies += "com.typesafe.play" %% "play-mailer" % "8.0.1"
libraryDependencies += "com.typesafe.play" %% "play-mailer-guice" % "8.0.1"

// https://github.com/sief/play-guard/
libraryDependencies += "com.digitaltangible" %% "play-guard" % "2.5.0"

// https://mvnrepository.com/artifact/org.jongo/jongo
libraryDependencies += "org.jongo" % "jongo" % "1.5.0"

// https://mvnrepository.com/artifact/com.typesafe.play/play-test
libraryDependencies += "com.typesafe.play" %% "play-test" % "2.8.15" % Test

// apache-commons
// https://mvnrepository.com/artifact/commons-io/commons-io
libraryDependencies += "commons-io" % "commons-io" % "2.11.0"
// https://mvnrepository.com/artifact/org.apache.commons/commons-lang3
libraryDependencies += "org.apache.commons" % "commons-lang3" % "3.12.0"
// https://mvnrepository.com/artifact/commons-codec/commons-codec
libraryDependencies += "commons-codec" % "commons-codec" % "1.15"
// https://mvnrepository.com/artifact/commons-beanutils/commons-beanutils
libraryDependencies += "commons-beanutils" % "commons-beanutils" % "1.9.4"
// https://mvnrepository.com/artifact/org.apache.commons/commons-collections4
libraryDependencies += "org.apache.commons" % "commons-collections4" % "4.4"
// https://mvnrepository.com/artifact/org.apache.commons/commons-compress
libraryDependencies += "org.apache.commons" % "commons-compress" % "1.21"
// https://mvnrepository.com/artifact/org.apache.commons/commons-math3
libraryDependencies += "org.apache.commons" % "commons-math3" % "3.6.1"
// https://mvnrepository.com/artifact/org.apache.commons/commons-text
libraryDependencies += "org.apache.commons" % "commons-text" % "1.9"


// https://mvnrepository.com/artifact/com.google.guava/guava
libraryDependencies += "com.google.guava" % "guava" % "31.1-jre"

// hutool
// https://mvnrepository.com/artifact/cn.hutool/hutool-all
libraryDependencies += "cn.hutool" % "hutool-all" % "5.8.0.M2"
// https://mvnrepository.com/artifact/cn.hutool/hutool-core
libraryDependencies += "cn.hutool" % "hutool-core" % "5.8.0.M2"
libraryDependencies += "cn.hutool" % "hutool-bloomFilter" % "5.8.0.M2"
libraryDependencies += "cn.hutool" % "hutool-cache" % "5.8.0.M2"
libraryDependencies += "cn.hutool" % "hutool-crypto" % "5.8.0.M2"
libraryDependencies += "cn.hutool" % "hutool-extra" % "5.8.0.M2"
libraryDependencies += "cn.hutool" % "hutool-script" % "5.8.0.M2"
libraryDependencies += "cn.hutool" % "hutool-captcha" % "5.8.0.M2"
libraryDependencies += "cn.hutool" % "hutool-poi" % "5.8.0.M2"


// https://mvnrepository.com/artifact/com.alibaba/easyexcel
libraryDependencies += "com.alibaba" % "easyexcel" % "3.0.5"


