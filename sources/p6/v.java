package p6;

import b8.x9;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class v implements com.google.android.gms.common.api.o {
    public final /* synthetic */ x9 a;
    public final /* synthetic */ TaskCompletionSource b;
    public final /* synthetic */ l c;

    public v(x9 x9Var, TaskCompletionSource taskCompletionSource, l lVar) {
        this.a = x9Var;
        this.b = taskCompletionSource;
        this.c = lVar;
    }

    @Override // com.google.android.gms.common.api.o
    public final void a(Status status) {
        if (!status.b()) {
            this.b.setException(m.l(status));
            return;
        }
        x9 x9Var = this.a;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        BasePendingResult basePendingResult = (BasePendingResult) x9Var;
        m.i("Result has already been consumed.", !basePendingResult.j);
        try {
            if (!basePendingResult.d.await(0L, timeUnit)) {
                basePendingResult.e(Status.n);
            }
        } catch (InterruptedException unused) {
            basePendingResult.e(Status.f);
        }
        m.i("Result is not ready.", basePendingResult.g());
        this.b.setResult(this.c.m(basePendingResult.j()));
    }
}
