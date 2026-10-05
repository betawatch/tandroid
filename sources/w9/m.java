package w9;

import android.os.Bundle;
import java.util.concurrent.Callable;
import org.telegram.ui.Cells.c1;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class m implements Callable {
    public final /* synthetic */ long a;
    public final /* synthetic */ n b;

    public m(n nVar, long j3) {
        this.b = nVar;
        this.a = j3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle h = c1.h(1, "fatal");
        h.putLong("timestamp", this.a);
        this.b.k.H(h);
        return null;
    }
}
