package ze;

import ab.c0;
import java.util.Hashtable;
import java.util.StringTokenizer;
import ug.n0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class a {
    public static final Hashtable b;
    public static final Object[] c;
    public static /* synthetic */ Class d;
    public final ClassLoader a;

    static {
        Hashtable hashtable = new Hashtable();
        b = hashtable;
        hashtable.put("void", Void.TYPE);
        hashtable.put("boolean", Boolean.TYPE);
        hashtable.put("byte", Byte.TYPE);
        hashtable.put("char", Character.TYPE);
        hashtable.put("short", Short.TYPE);
        hashtable.put("int", Integer.TYPE);
        hashtable.put("long", Long.TYPE);
        hashtable.put("float", Float.TYPE);
        hashtable.put("double", Double.TYPE);
        c = new Object[0];
    }

    public a(Class cls, String str) {
        this.a = cls.getClassLoader();
    }

    public static Class a(ClassLoader classLoader, String str) {
        if (str.equals("*")) {
            return null;
        }
        Class cls = (Class) b.get(str);
        if (cls != null) {
            return cls;
        }
        try {
            return classLoader == null ? Class.forName(str) : Class.forName(str, false, classLoader);
        } catch (ClassNotFoundException unused) {
            Class<?> cls2 = d;
            if (cls2 == null) {
                try {
                    cls2 = Class.forName("java.lang.ClassNotFoundException");
                    d = cls2;
                } catch (ClassNotFoundException e10) {
                    throw new NoClassDefFoundError(e10.getMessage());
                }
            }
            return cls2;
        }
    }

    public static c0 b(b bVar, Object obj, Object obj2) {
        boolean z10 = false;
        return new c0(bVar, obj, obj2, c, z10, 16);
    }

    public static c0 c(b bVar, Object obj, Object obj2, Object obj3) {
        return new c0(bVar, obj, obj2, new Object[]{obj3}, false, 16);
    }

    public final n0 d(String str, String str2, String str3, String str4, String str5) {
        int parseInt = Integer.parseInt("1", 16);
        ClassLoader classLoader = this.a;
        Class a10 = a(classLoader, str2);
        StringTokenizer stringTokenizer = new StringTokenizer(str3, ":");
        int countTokens = stringTokenizer.countTokens();
        Class[] clsArr = new Class[countTokens];
        for (int i7 = 0; i7 < countTokens; i7++) {
            clsArr[i7] = a(classLoader, stringTokenizer.nextToken());
        }
        StringTokenizer stringTokenizer2 = new StringTokenizer(str4, ":");
        int countTokens2 = stringTokenizer2.countTokens();
        String[] strArr = new String[countTokens2];
        for (int i10 = 0; i10 < countTokens2; i10++) {
            strArr[i10] = stringTokenizer2.nextToken();
        }
        StringTokenizer stringTokenizer3 = new StringTokenizer("", ":");
        int countTokens3 = stringTokenizer3.countTokens();
        Class[] clsArr2 = new Class[countTokens3];
        for (int i11 = 0; i11 < countTokens3; i11++) {
            clsArr2[i11] = a(classLoader, stringTokenizer3.nextToken());
        }
        Class a11 = a(classLoader, str5);
        n0 n0Var = new n0(2);
        n0Var.b = parseInt;
        n0Var.c = str;
        n0Var.e = a10;
        n0Var.g = clsArr;
        n0Var.h = a11;
        return n0Var;
    }

    public final b e(n0 n0Var) {
        b bVar = new b();
        bVar.b = n0Var;
        return bVar;
    }
}
