package qa;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.security.AccessController;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class o extends na.u {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public o(Class cls) {
        this.a = 2;
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        try {
            for (Field field : (Field[]) AccessController.doPrivileged(new g1(cls))) {
                Enum r42 = (Enum) field.get(null);
                String name = r42.name();
                String str = r42.toString();
                oa.b bVar = (oa.b) field.getAnnotation(oa.b.class);
                if (bVar != null) {
                    name = bVar.value();
                    for (String str2 : bVar.alternate()) {
                        ((HashMap) this.b).put(str2, r42);
                    }
                }
                ((HashMap) this.b).put(name, r42);
                ((HashMap) this.c).put(str, r42);
                ((HashMap) this.d).put(r42, name);
            }
        } catch (IllegalAccessException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // na.u
    public final Object read(va.a aVar) {
        switch (this.a) {
            case 0:
                int x4 = aVar.x();
                if (x4 == 9) {
                    aVar.t();
                    return null;
                }
                Map map = (Map) ((pa.m) this.d).p2();
                if (x4 == 1) {
                    aVar.a();
                    while (aVar.k()) {
                        aVar.a();
                        Object read = ((na.u) ((o) this.b).c).read(aVar);
                        if (map.put(read, ((na.u) ((o) this.c).c).read(aVar)) != null) {
                            throw new na.j("duplicate key: " + read);
                        }
                        aVar.e();
                    }
                    aVar.e();
                } else {
                    aVar.b();
                    while (aVar.k()) {
                        x9.d.b.getClass();
                        if (aVar instanceof l) {
                            l lVar = (l) aVar;
                            lVar.F(5);
                            Map.Entry entry = (Map.Entry) ((Iterator) lVar.J()).next();
                            lVar.L(entry.getValue());
                            lVar.L(new na.m((String) entry.getKey()));
                        } else {
                            int i10 = aVar.h;
                            if (i10 == 0) {
                                i10 = aVar.d();
                            }
                            if (i10 == 13) {
                                aVar.h = 9;
                            } else if (i10 == 12) {
                                aVar.h = 8;
                            } else {
                                if (i10 != 14) {
                                    throw aVar.E("a name");
                                }
                                aVar.h = 10;
                            }
                        }
                        Object read2 = ((na.u) ((o) this.b).c).read(aVar);
                        if (map.put(read2, ((na.u) ((o) this.c).c).read(aVar)) != null) {
                            throw new na.j("duplicate key: " + read2);
                        }
                    }
                    aVar.f();
                }
                return map;
            case 1:
                return ((na.u) this.c).read(aVar);
            default:
                if (aVar.x() == 9) {
                    aVar.t();
                    return null;
                }
                String v = aVar.v();
                Enum r02 = (Enum) ((HashMap) this.b).get(v);
                return r02 == null ? (Enum) ((HashMap) this.c).get(v) : r02;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0058, code lost:
    
        if ((r2 instanceof qa.t) == false) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.reflect.Type] */
    @Override // na.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void write(va.b bVar, Object obj) {
        na.u a2;
        switch (this.a) {
            case 0:
                Map map = (Map) obj;
                o oVar = (o) this.c;
                if (map == null) {
                    bVar.i();
                    break;
                } else {
                    bVar.c();
                    for (Map.Entry entry : map.entrySet()) {
                        bVar.g(String.valueOf(entry.getKey()));
                        oVar.write(bVar, entry.getValue());
                    }
                    bVar.f();
                    break;
                }
            case 1:
                na.u uVar = (na.u) this.c;
                ?? r12 = (Type) this.d;
                Class<?> cls = (obj == null || !((r12 instanceof Class) || (r12 instanceof TypeVariable))) ? r12 : obj.getClass();
                if (cls != r12) {
                    na.u b10 = ((na.g) this.b).b(new ua.a(cls));
                    if (b10 instanceof t) {
                        na.u uVar2 = uVar;
                        while ((uVar2 instanceof y) && (a2 = ((y) uVar2).a()) != uVar2) {
                            uVar2 = a2;
                        }
                        break;
                    }
                    uVar = b10;
                }
                uVar.write(bVar, obj);
                break;
            default:
                Enum r6 = (Enum) obj;
                bVar.r(r6 == null ? null : (String) ((HashMap) this.d).get(r6));
                break;
        }
    }

    public o(na.g gVar, na.u uVar, Type type) {
        this.a = 1;
        this.b = gVar;
        this.c = uVar;
        this.d = type;
    }

    public o(d dVar, na.g gVar, Type type, na.u uVar, Type type2, na.u uVar2, pa.m mVar) {
        this.a = 0;
        this.b = new o(gVar, uVar, type);
        this.c = new o(gVar, uVar2, type2);
        this.d = mVar;
    }
}
