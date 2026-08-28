package zd;

import com.google.firebase.messaging.t;
import java.util.Hashtable;
import java.util.StringTokenizer;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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

    public static t b(b bVar, Object obj, Object obj2) {
        return new t(bVar, obj, obj2, c);
    }

    public static t c(b bVar, Object obj, Object obj2, Object obj3) {
        return new t(bVar, obj, obj2, new Object[]{obj3});
    }

    public final f2.b d(String str, String str2, String str3, String str4, String str5) {
        int parseInt = Integer.parseInt("1", 16);
        ClassLoader classLoader = this.a;
        Class a2 = a(classLoader, str2);
        StringTokenizer stringTokenizer = new StringTokenizer(str3, ":");
        int countTokens = stringTokenizer.countTokens();
        Class[] clsArr = new Class[countTokens];
        for (int i9 = 0; i9 < countTokens; i9++) {
            clsArr[i9] = a(classLoader, stringTokenizer.nextToken());
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
        Class a3 = a(classLoader, str5);
        f2.b bVar = new f2.b(2);
        bVar.b = parseInt;
        bVar.c = str;
        bVar.e = a2;
        bVar.g = clsArr;
        bVar.h = a3;
        return bVar;
    }

    public final b e(f2.b bVar) {
        b bVar2 = new b();
        bVar2.b = bVar;
        return bVar2;
    }
}
