// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
