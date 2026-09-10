package z2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import y2.h;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class a implements Executor {
    public final /* synthetic */ Executor a;
    public final /* synthetic */ h b;

    public a(ExecutorService executorService, h hVar) {
        this.a = executorService;
        this.b = hVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.execute(runnable);
    }
}
