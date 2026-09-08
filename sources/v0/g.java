package v0;

import android.os.CancellationSignal;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
