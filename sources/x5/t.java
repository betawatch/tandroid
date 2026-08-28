package x5;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import f7.g5;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class t implements com.google.android.gms.common.api.o {
    public final /* synthetic */ g5 a;
    public final /* synthetic */ TaskCompletionSource b;
    public final /* synthetic */ k c;

    public t(g5 g5Var, TaskCompletionSource taskCompletionSource, k kVar) {
        this.a = g5Var;
        this.b = taskCompletionSource;
        this.c = kVar;
    }

    @Override // com.google.android.gms.common.api.o
    public final void a(Status status) {
        if (!status.b()) {
            this.b.setException(l.m(status));
            return;
        }
        g5 g5Var = this.a;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        BasePendingResult basePendingResult = (BasePendingResult) g5Var;
        l.j("Result has already been consumed.", !basePendingResult.j);
        try {
            if (!basePendingResult.d.await(0L, timeUnit)) {
                basePendingResult.e(Status.n);
            }
        } catch (InterruptedException unused) {
            basePendingResult.e(Status.f);
        }
        l.j("Result is not ready.", basePendingResult.g());
        this.b.setResult(this.c.d(basePendingResult.j()));
    }
}
