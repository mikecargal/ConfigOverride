import yaml

y = yaml.load("""
mike:cargal: me
mikecargal: another me
another key : is this value
99.6: Mike Cargal
"me" : Mike Cargal
""")

print(y)