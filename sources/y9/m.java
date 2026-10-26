package y9;

import android.os.Bundle;
import java.util.concurrent.Callable;
import org.telegram.ui.Components.b10;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
