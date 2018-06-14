name := "sbt-revolver"

organization := "io.spray"

version := "0.9.2-ues.li"

description := "An SBT plugin for dangerously fast development turnaround in Scala"

startYear := Some(2011)

homepage := Some(url("http://github.com/spray/sbt-revolver"))

organizationHomepage := Some(url("http://spray.io"))

licenses in GlobalScope += "Apache License 2.0" -> url("https://github.com/spray/sbt-revolver/raw/master/LICENSE")

publishTo := Some("S3" at "s3://s3-us-west-2.amazonaws.com/microsistec-redpill-packages/repo")