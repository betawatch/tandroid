package w9;

import android.os.Bundle;
import java.util.concurrent.Callable;
import org.telegram.ui.Cells.c1;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
        Bundle g10 = c1.g(1, "fatal");
        g10.putLong("timestamp", this.a);
        this.b.k.J(g10);
        return null;
    }
}
