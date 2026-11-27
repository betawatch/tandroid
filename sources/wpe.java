// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class wpe {
    public static final npe a = new npe();
    public static final npe b;

    static {
        npe npeVar = null;
        try {
            npeVar = (npe) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = npeVar;
    }
}
