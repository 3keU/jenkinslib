package org.devops

//构建类型
def Build(buildType,buildShell){
  //def buildTools = ["mvn":"m3.8","ant":"ANT","gradle":"GRADLE","nmp","NMP"]
  def buildTools = ["mvn":"m3.8"]
  
  println("当前的构建类型为：${buildType}")
  buildHome = tool buildTools[buildType]
  
  sh  "${buildHome}/bin/${buildType} ${buildShell}"
}
