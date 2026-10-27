package y9;

import android.os.Bundle;
import java.util.concurrent.Callable;
import org.telegram.ui.Components.b10;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
        Bundle g7 = b10.g(1, "fatal");
        g7.putLong("timestamp", this.a);
        this.b.k.b(g7);
        return null;
    }
}
