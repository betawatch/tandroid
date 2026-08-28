package v0;

import android.os.CancellationSignal;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class g implements zc.l {
    public final /* synthetic */ CancellationSignal a;

    public g(CancellationSignal cancellationSignal) {
        this.a = cancellationSignal;
    }

    @Override // zc.l
    public final Object invoke(Object obj) {
        this.a.cancel();
        return oc.i.a;
    }
}
