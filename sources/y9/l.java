package y9;

import android.content.ComponentName;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class l implements SuccessContinuation {
    public final Object a;
    public final Object b;

    public l() {
        this.a = new AtomicInteger();
        this.b = new AtomicInteger();
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return ((n) this.b).e.G(new u4.f(1, this, (Boolean) obj));
    }

    public l(yf.b bVar, ComponentName componentName) {
        this.a = bVar;
        this.b = componentName;
    }

    public l(n nVar, Task task) {
        this.b = nVar;
        this.a = task;
    }
}
