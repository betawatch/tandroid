package v0;

import android.os.CancellationSignal;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
