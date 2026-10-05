package re;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class b {
    public static final b e;
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;

    static {
        b bVar = new b();
        bVar.a = true;
        bVar.b = true;
        bVar.c = false;
        bVar.d = false;
        e = bVar;
        bVar.a = true;
        bVar.b = true;
        bVar.c = false;
        bVar.d = false;
    }

    public static String a(String str, Class cls, boolean z10) {
        if (cls == null) {
            return "ANONYMOUS";
        }
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(a(componentType.getName(), componentType, z10));
            stringBuffer.append("[]");
            return stringBuffer.toString();
        }
        if (!z10) {
            return str.replace('$', '.');
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf != -1) {
            str = str.substring(lastIndexOf + 1);
        }
        return str.replace('$', '.');
    }
}
