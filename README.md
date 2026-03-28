# 1. Establish the explicit physical directories
`mkdir -p src bin`

# 2. Generate the properly cased Java files
`touch src/Main.java src/<name>.java src/<name>.java`

# 3. Inject the Classpath routing data
``` zsh
cat << 'EOF' > .classpath
<?xml version="1.0" encoding="UTF-8"?>
<classpath>
    <classpathentry kind="src" path="src"/>
    <classpathentry kind="con" path="org.eclipse.jdt.launching.JRE_CONTAINER"/>
    <classpathentry kind="output" path="bin"/>
</classpath>
EOF
```

# 4. Inject the Project nature definition
``` zsh
cat << 'EOF' > .project
<?xml version="1.0" encoding="UTF-8"?>
<projectDescription>
    <name>quick-run-sandbox</name>
    <comment></comment>
    <projects></projects>
    <buildSpec>
        <buildCommand>
            <name>org.eclipse.jdt.core.javabuilder</name>
            <arguments></arguments>
        </buildCommand>
    </buildSpec>
    <natures>
        <nature>org.eclipse.jdt.core.javanature</nature>
    </natures>
</projectDescription>
EOF
```
