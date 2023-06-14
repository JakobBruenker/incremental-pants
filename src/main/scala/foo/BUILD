scala_sources()

deploy_jar(
    name="server",
    main="foo.Main",
    dependencies=[
        ":org.scala-lang_scala-library",
        ":org.scala-lang_scala-reflect",
        ":foo",
    ],
)

jvm_artifact(
  name="org.scala-lang_scala-library",
  group="org.scala-lang",
  artifact="scala-library",
  version="2.13.11",
  resolve="jvm-default",
)

jvm_artifact(
  name="org.scala-lang_scala-reflect",
  group="org.scala-lang",
  artifact="scala-reflect",
  version="2.13.11",  # use the version that matches your Scala version
  resolve="jvm-default",
)

