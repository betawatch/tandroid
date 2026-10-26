package y9;

import android.content.ComponentName;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
