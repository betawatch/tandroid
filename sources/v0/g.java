package v0;

import android.os.CancellationSignal;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class g implements ud.l {
    public final /* synthetic */ CancellationSignal a;

    public g(CancellationSignal cancellationSignal) {
        this.a = cancellationSignal;
    }

    @Override // ud.l
    public final Object invoke(Object obj) {
        this.a.cancel();
        return jd.i.a;
    }
}
