// default package

import java.util.Iterator;
import java.util.List;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class sf2 implements ResultCallback {
    public final /* synthetic */ fnb a;
    public final /* synthetic */ gm1 b;

    public sf2(fnb fnbVar, gm1 gm1Var) {
        this.a = fnbVar;
        this.b = gm1Var;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onComplete(Object obj) {
        gm1 gm1Var;
        tz3 tz3Var;
        Iterator it = ((List) obj).iterator();
        do {
            boolean hasNext = it.hasNext();
            gm1Var = this.b;
            if (!hasNext) {
                gm1Var.onComplete(null);
                return;
            }
            tz3Var = (tz3) it.next();
        } while (!this.a.equals(tz3Var.c));
        tz3Var.k();
        gm1Var.onComplete(tz3Var);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onError(TLRPC.TL_error tL_error) {
        this.b.onComplete(null);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onError(Throwable th) {
    }
}
