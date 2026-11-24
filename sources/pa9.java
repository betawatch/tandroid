// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class pa9 {
    public static final /* synthetic */ Throwable a;
    public static final /* synthetic */ pa9 b;

    static {
        try {
            b = new pa9();
        } catch (Throwable th) {
            a = th;
        }
    }

    public static pa9 a() {
        String stringBuffer;
        pa9 pa9Var = b;
        if (pa9Var != null) {
            return pa9Var;
        }
        Throwable th = a;
        if (th == null) {
            stringBuffer = "com.googlecode.mp4parser.RequiresParseDetailAspect";
        } else {
            StringBuffer stringBuffer2 = new StringBuffer("Exception while initializing com.googlecode.mp4parser.RequiresParseDetailAspect: ");
            stringBuffer2.append(th);
            stringBuffer = stringBuffer2.toString();
        }
        ql7 ql7Var = new ql7(stringBuffer);
        ql7Var.a = th;
        throw ql7Var;
    }

    public static void b(xvc xvcVar) {
        Object obj = xvcVar.c;
        if (obj instanceof y1) {
            if (((y1) obj).isParsed()) {
                return;
            }
            ((y1) obj).parseDetails();
        } else {
            throw new RuntimeException("Only methods in subclasses of " + y1.class.getName() + " can  be annotated with ParseDetail");
        }
    }
}
