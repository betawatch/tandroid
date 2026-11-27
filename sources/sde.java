// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class sde {
    public static final void a(mx2 mx2Var, Throwable th) {
        try {
            ek ekVar = (ek) mx2Var.get(qf5.b);
            if (ekVar != null) {
                ekVar.c(th);
            } else {
                mde.a(mx2Var, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                kke.a(runtimeException, th);
                th = runtimeException;
            }
            mde.a(mx2Var, th);
        }
    }
}
