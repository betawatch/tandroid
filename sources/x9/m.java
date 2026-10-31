package x9;

import android.os.Bundle;
import java.util.concurrent.Callable;
import org.telegram.ui.Cells.f1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class m implements Callable {
    public final /* synthetic */ long a;
    public final /* synthetic */ n b;

    public m(n nVar, long j10) {
        this.b = nVar;
        this.a = j10;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle i10 = f1.i(1, "fatal");
        i10.putLong("timestamp", this.a);
        this.b.k.I(i10);
        return null;
    }
}
