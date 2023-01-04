package org.devops

//构建类型
def Build(buildType,buildShell){
  def buildTools ["mvn":"M2","ant":"ANT","gradle":"GRADLE","nmp","NMP"]
  
  println("当前的构建类型为：${buildType}")
  buildHome = tool buildTools[buildType]
  
  sh "${buildHome}/bin/${buildType} ${buildShell}"
}
