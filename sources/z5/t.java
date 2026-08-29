package z5;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import h7.n5;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class t implements com.google.android.gms.common.api.o {
    public final /* synthetic */ n5 a;
    public final /* synthetic */ TaskCompletionSource b;
    public final /* synthetic */ k c;

    public t(n5 n5Var, TaskCompletionSource taskCompletionSource, k kVar) {
        this.a = n5Var;
        this.b = taskCompletionSource;
        this.c = kVar;
    }

    @Override // com.google.android.gms.common.api.o
    public final void a(Status status) {
        if (!status.b()) {
            this.b.setException(l.m(status));
            return;
        }
        n5 n5Var = this.a;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        BasePendingResult basePendingResult = (BasePendingResult) n5Var;
        l.j("Result has already been consumed.", !basePendingResult.j);
        try {
            if (!basePendingResult.d.await(0L, timeUnit)) {
                basePendingResult.e(Status.n);
            }
        } catch (InterruptedException unused) {
            basePendingResult.e(Status.f);
        }
        l.j("Result is not ready.", basePendingResult.g());
        this.b.setResult(this.c.l(basePendingResult.j()));
    }
}
