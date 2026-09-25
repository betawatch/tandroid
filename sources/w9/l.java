package w9;

import android.os.Bundle;
import java.util.concurrent.Callable;
import org.telegram.ui.Cells.c1;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final class l implements Callable {
    public final /* synthetic */ long a;
    public final /* synthetic */ m b;

    public l(m mVar, long j3) {
        this.b = mVar;
        this.a = j3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle g10 = c1.g(1, "fatal");
        g10.putLong("timestamp", this.a);
        this.b.k.J(g10);
        return null;
    }
}
