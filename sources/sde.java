// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
