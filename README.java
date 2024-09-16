ldapmodify -x -D "cn=admin,dc=interne,dc=cartes,dc=com" -W -H ldap:/// << EOF
dn: olcDatabase={1}mdb,cn=config
changetype: modify
replace: olcAccess
olcAccess: {0}to * by dn.exact=gidNumber=0+uidNumber=0,cn=peercred,cn=external,cn=auth manage by * break
olcAccess: {1}to * by self write by anonymous auth by * read
EOF
