// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
