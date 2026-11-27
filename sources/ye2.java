// default package

import java.util.Iterator;
import java.util.List;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class ye2 implements ResultCallback {
    public final /* synthetic */ dpb a;
    public final /* synthetic */ el1 b;

    public ye2(dpb dpbVar, el1 el1Var) {
        this.a = dpbVar;
        this.b = el1Var;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onComplete(Object obj) {
        el1 el1Var;
        ez3 ez3Var;
        Iterator it = ((List) obj).iterator();
        do {
            boolean hasNext = it.hasNext();
            el1Var = this.b;
            if (!hasNext) {
                el1Var.onComplete(null);
                return;
            }
            ez3Var = (ez3) it.next();
        } while (!this.a.equals(ez3Var.c));
        ez3Var.k();
        el1Var.onComplete(ez3Var);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onError(TLRPC.TL_error tL_error) {
        this.b.onComplete(null);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onError(Throwable th) {
    }
}
