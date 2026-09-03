package sa;

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
import k7.a8;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class x implements pa.v {
    public final q5.c0 a;
    public final ra.f b;
    public final j c;
    public final ArrayList d;

    public x(q5.c0 c0Var, ra.f fVar, j jVar, ArrayList arrayList) {
        this.a = c0Var;
        this.b = fVar;
        this.c = jVar;
        this.d = arrayList;
    }

    public static void a(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + ua.c.c(field) + " and " + ua.c.c(field2) + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("duplicate-fields"));
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
    public final v b(pa.g gVar, wa.a aVar, Class cls, boolean z4) {
        boolean z10;
        Method method;
        List list;
        List singletonList;
        String str;
        qa.a aVar2;
        pa.g gVar2;
        Field field;
        List<String> list2;
        pa.u uVar;
        Field field2;
        s sVar;
        if (cls.isInterface()) {
            return v.c;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        wa.a aVar3 = aVar;
        Class cls2 = cls;
        while (cls2 != Object.class) {
            Field[] declaredFields = cls2.getDeclaredFields();
            if (cls2 != cls && declaredFields.length > 0) {
                ra.d.f(this.d);
            }
            int length = declaredFields.length;
            ?? r14 = 0;
            int i10 = 0;
            while (i10 < length) {
                Field field3 = declaredFields[i10];
                boolean c3 = c(field3, true);
                boolean c10 = c(field3, r14);
                if (c3 || c10) {
                    if (!z4) {
                        z10 = c10;
                        method = null;
                    } else if (Modifier.isStatic(field3.getModifiers())) {
                        method = null;
                        z10 = false;
                    } else {
                        Method a2 = ua.c.a.a(cls2, field3);
                        ua.c.f(a2);
                        if (a2.getAnnotation(qa.b.class) != null && field3.getAnnotation(qa.b.class) == null) {
                            throw new pa.j(android.support.v4.media.a.o("@SerializedName on ", ua.c.d(a2, r14), " is not supported"));
                        }
                        z10 = c10;
                        method = a2;
                    }
                    if (method == null) {
                        ua.c.f(field3);
                    }
                    Type j10 = ra.d.j(aVar3.b, cls2, field3.getGenericType(), new HashMap());
                    qa.b bVar = (qa.b) field3.getAnnotation(qa.b.class);
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
                            wa.a aVar4 = new wa.a(j10);
                            Class cls3 = aVar4.a;
                            boolean z11 = cls3 == null && cls3.isPrimitive();
                            int modifiers = field3.getModifiers();
                            boolean z12 = !Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers);
                            aVar2 = (qa.a) field3.getAnnotation(qa.a.class);
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
                            boolean z13 = uVar == null;
                            if (uVar == null) {
                                uVar = gVar2.b(aVar4);
                            }
                            s sVar2 = new s(str, field, method, c3 ? uVar : z13 ? uVar : new o(gVar2, uVar, aVar4.b), uVar, z11, z12);
                            field2 = field;
                            if (z10) {
                                for (String str2 : list2) {
                                    s sVar3 = (s) linkedHashMap.put(str2, sVar2);
                                    if (sVar3 != null) {
                                        a(cls, str2, sVar3.b, field2);
                                        throw null;
                                    }
                                }
                            }
                            if (c3 && (sVar = (s) linkedHashMap2.put(str, sVar2)) != null) {
                                a(cls, str, sVar.b, field2);
                                throw null;
                            }
                        }
                    }
                    list = singletonList;
                    str = (String) list.get(r14);
                    wa.a aVar42 = new wa.a(j10);
                    Class cls32 = aVar42.a;
                    if (cls32 == null) {
                    }
                    int modifiers2 = field3.getModifiers();
                    if (Modifier.isStatic(modifiers2)) {
                    }
                    aVar2 = (qa.a) field3.getAnnotation(qa.a.class);
                    if (aVar2 == null) {
                    }
                    if (uVar == null) {
                    }
                    if (uVar == null) {
                    }
                    if (c3) {
                    }
                    s sVar22 = new s(str, field, method, c3 ? uVar : z13 ? uVar : new o(gVar2, uVar, aVar42.b), uVar, z11, z12);
                    field2 = field;
                    if (z10) {
                    }
                    if (c3) {
                        a(cls, str, sVar.b, field2);
                        throw null;
                    }
                    continue;
                }
                i10++;
                r14 = 0;
            }
            aVar3 = new wa.a(ra.d.j(aVar3.b, cls2, cls2.getGenericSuperclass(), new HashMap()));
            cls2 = aVar3.a;
        }
        return new v(linkedHashMap, new ArrayList(linkedHashMap2.values()));
    }

    public final boolean c(Field field, boolean z4) {
        boolean z10;
        ra.f fVar = this.b;
        fVar.getClass();
        if ((136 & field.getModifiers()) == 0 && !field.isSynthetic() && !fVar.b(field.getType(), z4)) {
            List list = z4 ? fVar.a : fVar.b;
            if (!list.isEmpty()) {
                pa.b bVar = new pa.b(field);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((pa.a) it.next()).shouldSkipField(bVar)) {
                    }
                }
            }
            z10 = false;
            return !z10;
        }
        z10 = true;
        return !z10;
    }

    @Override // pa.v
    public final pa.u create(pa.g gVar, wa.a aVar) {
        Class cls = aVar.a;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        a8 a8Var = ua.c.a;
        if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
            return new pa.d(2);
        }
        ra.d.f(this.d);
        return ua.c.a.d(cls) ? new w(cls, b(gVar, aVar, cls, true)) : new u(this.a.E(aVar), b(gVar, aVar, cls, false));
    }
}
