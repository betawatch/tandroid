// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
