package u9;

import aa.b0;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import org.telegram.ui.Components.ny0;
import u4.f;
import y9.p;
import y9.x;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class b implements Callable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ p b;
    public final /* synthetic */ b0 c;

    public b(boolean z10, p pVar, b0 b0Var) {
        this.a = z10;
        this.b = pVar;
        this.c = b0Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (!this.a) {
            return null;
        }
        p pVar = this.b;
        ExecutorService executorService = pVar.k;
        f fVar = new f(3, pVar, this.c);
        ExecutorService executorService2 = x.a;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executorService.execute(new ny0(fVar, executorService, taskCompletionSource, 29));
        taskCompletionSource.getTask();
        return null;
    }
}
