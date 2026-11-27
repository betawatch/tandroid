// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class zb9 {
    public static final /* synthetic */ Throwable a;
    public static final /* synthetic */ zb9 b;

    static {
        try {
            b = new zb9();
        } catch (Throwable th) {
            a = th;
        }
    }

    public static zb9 a() {
        String stringBuffer;
        zb9 zb9Var = b;
        if (zb9Var != null) {
            return zb9Var;
        }
        Throwable th = a;
        if (th == null) {
            stringBuffer = "com.googlecode.mp4parser.RequiresParseDetailAspect";
        } else {
            StringBuffer stringBuffer2 = new StringBuffer("Exception while initializing com.googlecode.mp4parser.RequiresParseDetailAspect: ");
            stringBuffer2.append(th);
            stringBuffer = stringBuffer2.toString();
        }
        mm7 mm7Var = new mm7(stringBuffer);
        mm7Var.a = th;
        throw mm7Var;
    }

    public static void b(lyc lycVar) {
        Object obj = lycVar.c;
        if (obj instanceof z1) {
            if (((z1) obj).isParsed()) {
                return;
            }
            ((z1) obj).parseDetails();
        } else {
            throw new RuntimeException("Only methods in subclasses of " + z1.class.getName() + " can  be annotated with ParseDetail");
        }
    }
}
