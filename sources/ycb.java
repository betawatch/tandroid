// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class ycb {
    public static final ycb e;
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;

    static {
        ycb ycbVar = new ycb();
        ycbVar.a = true;
        ycbVar.b = true;
        ycbVar.c = false;
        ycbVar.d = false;
        e = ycbVar;
        ycbVar.a = true;
        ycbVar.b = true;
        ycbVar.c = false;
        ycbVar.d = false;
    }

    public static String a(String str, Class cls, boolean z) {
        if (cls == null) {
            return "ANONYMOUS";
        }
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(a(componentType.getName(), componentType, z));
            stringBuffer.append("[]");
            return stringBuffer.toString();
        }
        if (!z) {
            return str.replace('$', '.');
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf != -1) {
            str = str.substring(lastIndexOf + 1);
        }
        return str.replace('$', '.');
    }
}
