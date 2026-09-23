package v0;

import android.os.CancellationSignal;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final class g implements rd.l {
    public final /* synthetic */ CancellationSignal a;

    public g(CancellationSignal cancellationSignal) {
        this.a = cancellationSignal;
    }

    @Override // rd.l
    public final Object invoke(Object obj) {
        this.a.cancel();
        return gd.i.a;
    }
}
