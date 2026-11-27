// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class x74 {
    public static final w74 a = new w74();
    public static final w74 b;

    static {
        ow8 ow8Var = ow8.c;
        w74 w74Var = null;
        try {
            w74Var = (w74) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = w74Var;
    }
}
