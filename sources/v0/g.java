package v0;

import android.os.CancellationSignal;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class g implements ld.l {
    public final /* synthetic */ CancellationSignal a;

    public g(CancellationSignal cancellationSignal) {
        this.a = cancellationSignal;
    }

    @Override // ld.l
    public final Object invoke(Object obj) {
        this.a.cancel();
        return ad.j.a;
    }
}
