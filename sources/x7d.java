// default package

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class x7d implements r68 {
    public final /* synthetic */ BasePendingResult a;
    public final /* synthetic */ TaskCompletionSource b;
    public final /* synthetic */ s68 c;

    public x7d(BasePendingResult basePendingResult, TaskCompletionSource taskCompletionSource, s68 s68Var) {
        this.a = basePendingResult;
        this.b = taskCompletionSource;
        this.c = s68Var;
    }

    @Override // r68
    public final void a(Status status) {
        if (!status.b()) {
            this.b.setException(sqd.a(status));
            return;
        }
        BasePendingResult basePendingResult = this.a;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        xve.j("Result has already been consumed.", !basePendingResult.j);
        try {
            if (!basePendingResult.d.await(0L, timeUnit)) {
                basePendingResult.e(Status.n);
            }
        } catch (InterruptedException unused) {
            basePendingResult.e(Status.f);
        }
        xve.j("Result is not ready.", basePendingResult.g());
        this.b.setResult(this.c.J(basePendingResult.j()));
    }
}
