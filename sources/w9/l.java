package w9;

import android.os.Bundle;
import java.util.concurrent.Callable;
import org.telegram.ui.Cells.p6;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
        Bundle e7 = p6.e(1, "fatal");
        e7.putLong("timestamp", this.a);
        this.b.k.b0(e7);
        return null;
    }
}
