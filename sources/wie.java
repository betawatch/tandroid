// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
