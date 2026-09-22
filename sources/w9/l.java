package w9;

import android.os.Bundle;
import java.util.concurrent.Callable;
import org.telegram.ui.Cells.q3;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
        Bundle e = q3.e(1, "fatal");
        e.putLong("timestamp", this.a);
        this.b.k.J(e);
        return null;
    }
}
