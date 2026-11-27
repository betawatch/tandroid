// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class wie {
    public static Exception a(i1 i1Var, String str, Exception exc) {
        if (exc instanceof s13) {
            return new s13(i1Var, str);
        }
        if (exc instanceof ev4) {
            return new ev4(i1Var, str);
        }
        throw new nr4();
    }
}
