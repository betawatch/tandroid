package v0;

import android.os.CancellationSignal;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public final class g implements td.l {
    public final /* synthetic */ CancellationSignal a;

    public g(CancellationSignal cancellationSignal) {
        this.a = cancellationSignal;
    }

    @Override // td.l
    public final Object invoke(Object obj) {
        this.a.cancel();
        return id.i.a;
    }
}
