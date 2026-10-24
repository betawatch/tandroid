package t9;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import org.telegram.ui.Components.fy0;
import u4.f;
import x9.o;
import x9.w;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class b implements Callable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ o b;
    public final /* synthetic */ ea.b c;

    public b(boolean z10, o oVar, ea.b bVar) {
        this.a = z10;
        this.b = oVar;
        this.c = bVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (!this.a) {
            return null;
        }
        o oVar = this.b;
        ExecutorService executorService = oVar.k;
        f fVar = new f(3, oVar, this.c);
        ExecutorService executorService2 = w.a;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executorService.execute(new fy0(fVar, executorService, taskCompletionSource, 29));
        taskCompletionSource.getTask();
        return null;
    }
}
