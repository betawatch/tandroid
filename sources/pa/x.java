package pa;

import h7.w6;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class x implements ma.v {
    public final g5.b a;
    public final oa.f b;
    public final j c;
    public final ArrayList d;

    public x(g5.b bVar, oa.f fVar, j jVar, ArrayList arrayList) {
        this.a = bVar;
        this.b = fVar;
        this.c = jVar;
        this.d = arrayList;
    }

    public static void a(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + ra.c.c(field) + " and " + ra.c.c(field2) + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("duplicate-fields"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0123  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final v b(ma.g gVar, ta.a aVar, Class cls, boolean z10) {
        boolean z11;
        Method method;
        List list;
        List singletonList;
        String str;
        na.a aVar2;
        ma.g gVar2;
        Field field;
        List<String> list2;
        ma.u uVar;
        Field field2;
        s sVar;
        if (cls.isInterface()) {
            return v.c;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ta.a aVar3 = aVar;
        Class cls2 = cls;
        while (cls2 != Object.class) {
            Field[] declaredFields = cls2.getDeclaredFields();
            if (cls2 != cls && declaredFields.length > 0) {
                oa.d.f(this.d);
            }
            int length = declaredFields.length;
            ?? r14 = 0;
            int i10 = 0;
            while (i10 < length) {
                Field field3 = declaredFields[i10];
                boolean c10 = c(field3, true);
                boolean c11 = c(field3, r14);
                if (c10 || c11) {
                    if (!z10) {
                        z11 = c11;
                        method = null;
                    } else if (Modifier.isStatic(field3.getModifiers())) {
                        method = null;
                        z11 = false;
                    } else {
                        Method a2 = ra.c.a.a(cls2, field3);
                        ra.c.f(a2);
                        if (a2.getAnnotation(na.b.class) != null && field3.getAnnotation(na.b.class) == null) {
                            throw new ma.j(a9.p.m("@SerializedName on ", ra.c.d(a2, r14), " is not supported"));
                        }
                        z11 = c11;
                        method = a2;
                    }
                    if (method == null) {
                        ra.c.f(field3);
                    }
                    Type j10 = oa.d.j(aVar3.b, cls2, field3.getGenericType(), new HashMap());
                    na.b bVar = (na.b) field3.getAnnotation(na.b.class);
                    if (bVar == null) {
                        singletonList = Collections.singletonList(field3.getName());
                    } else {
                        String value = bVar.value();
                        String[] alternate = bVar.alternate();
                        if (alternate.length == 0) {
                            singletonList = Collections.singletonList(value);
                        } else {
                            ArrayList arrayList = new ArrayList(alternate.length + 1);
                            arrayList.add(value);
                            Collections.addAll(arrayList, alternate);
                            list = arrayList;
                            str = (String) list.get(r14);
                            ta.a aVar4 = new ta.a(j10);
                            Class cls3 = aVar4.a;
                            boolean z12 = cls3 == null && cls3.isPrimitive();
                            int modifiers = field3.getModifiers();
                            boolean z13 = !Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers);
                            aVar2 = (na.a) field3.getAnnotation(na.a.class);
                            if (aVar2 == null) {
                                field = field3;
                                list2 = list;
                                gVar2 = gVar;
                                uVar = this.c.a(this.a, gVar2, aVar4, aVar2, false);
                            } else {
                                gVar2 = gVar;
                                field = field3;
                                list2 = list;
                                uVar = null;
                            }
                            boolean z14 = uVar == null;
                            if (uVar == null) {
                                uVar = gVar2.b(aVar4);
                            }
                            s sVar2 = new s(str, field, method, c10 ? uVar : z14 ? uVar : new o(gVar2, uVar, aVar4.b), uVar, z12, z13);
                            field2 = field;
                            if (z11) {
                                for (String str2 : list2) {
                                    s sVar3 = (s) linkedHashMap.put(str2, sVar2);
                                    if (sVar3 != null) {
                                        a(cls, str2, sVar3.b, field2);
                                        throw null;
                                    }
                                }
                            }
                            if (c10 && (sVar = (s) linkedHashMap2.put(str, sVar2)) != null) {
                                a(cls, str, sVar.b, field2);
                                throw null;
                            }
                        }
                    }
                    list = singletonList;
                    str = (String) list.get(r14);
                    ta.a aVar42 = new ta.a(j10);
                    Class cls32 = aVar42.a;
                    if (cls32 == null) {
                    }
                    int modifiers2 = field3.getModifiers();
                    if (Modifier.isStatic(modifiers2)) {
                    }
                    aVar2 = (na.a) field3.getAnnotation(na.a.class);
                    if (aVar2 == null) {
                    }
                    if (uVar == null) {
                    }
                    if (uVar == null) {
                    }
                    if (c10) {
                    }
                    s sVar22 = new s(str, field, method, c10 ? uVar : z14 ? uVar : new o(gVar2, uVar, aVar42.b), uVar, z12, z13);
                    field2 = field;
                    if (z11) {
                    }
                    if (c10) {
                        a(cls, str, sVar.b, field2);
                        throw null;
                    }
                    continue;
                }
                i10++;
                r14 = 0;
            }
            aVar3 = new ta.a(oa.d.j(aVar3.b, cls2, cls2.getGenericSuperclass(), new HashMap()));
            cls2 = aVar3.a;
        }
        return new v(linkedHashMap, new ArrayList(linkedHashMap2.values()));
    }

    public final boolean c(Field field, boolean z10) {
        boolean z11;
        oa.f fVar = this.b;
        fVar.getClass();
        if ((136 & field.getModifiers()) == 0 && !field.isSynthetic() && !fVar.b(field.getType(), z10)) {
            List list = z10 ? fVar.a : fVar.b;
            if (!list.isEmpty()) {
                ma.b bVar = new ma.b(field);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((ma.a) it.next()).shouldSkipField(bVar)) {
                    }
                }
            }
            z11 = false;
            return !z11;
        }
        z11 = true;
        return !z11;
    }

    @Override // ma.v
    public final ma.u create(ma.g gVar, ta.a aVar) {
        Class cls = aVar.a;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        w6 w6Var = ra.c.a;
        if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
            return new ma.d(2);
        }
        oa.d.f(this.d);
        return ra.c.a.d(cls) ? new w(cls, b(gVar, aVar, cls, true)) : new u(this.a.l(aVar), b(gVar, aVar, cls, false));
    }
}
