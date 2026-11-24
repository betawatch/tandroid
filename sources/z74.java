// default package

import java.util.Hashtable;
import java.util.StringTokenizer;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class z74 {
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

    public z74(Class cls, String str) {
        this.a = cls.getClassLoader();
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 5 */
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
            Class<ClassNotFoundException> cls2 = d;
            if (cls2 == null) {
                cls2 = ClassNotFoundException.class;
                d = cls2;
            }
            return cls2;
        }
    }

    public static c5a b(z24 z24Var, Object obj, Object obj2) {
        boolean z = false;
        return new c5a(z24Var, obj, obj2, c, z, (byte) 6);
    }

    public static c5a c(z24 z24Var, Object obj, Object obj2, Object obj3) {
        return new c5a(z24Var, obj, obj2, new Object[]{obj3}, false, (byte) 6);
    }

    public final ha d(String str, String str2, String str3, String str4, String str5) {
        ClassLoader classLoader = this.a;
        Class a = a(classLoader, str2);
        StringTokenizer stringTokenizer = new StringTokenizer(str3, ":");
        int countTokens = stringTokenizer.countTokens();
        Class[] clsArr = new Class[countTokens];
        for (int i = 0; i < countTokens; i++) {
            clsArr[i] = a(classLoader, stringTokenizer.nextToken());
        }
        StringTokenizer stringTokenizer2 = new StringTokenizer(str4, ":");
        int countTokens2 = stringTokenizer2.countTokens();
        String[] strArr = new String[countTokens2];
        for (int i2 = 0; i2 < countTokens2; i2++) {
            strArr[i2] = stringTokenizer2.nextToken();
        }
        StringTokenizer stringTokenizer3 = new StringTokenizer("", ":");
        int countTokens3 = stringTokenizer3.countTokens();
        Class[] clsArr2 = new Class[countTokens3];
        for (int i3 = 0; i3 < countTokens3; i3++) {
            clsArr2[i3] = a(classLoader, stringTokenizer3.nextToken());
        }
        Class a2 = a(classLoader, str5);
        ha haVar = new ha((byte) 2);
        haVar.b = 1;
        haVar.c = str;
        haVar.e = a;
        haVar.g = clsArr;
        haVar.h = a2;
        return haVar;
    }

    public final z24 e(ha haVar) {
        z24 z24Var = new z24((byte) 10, false);
        z24Var.b = haVar;
        return z24Var;
    }
}
