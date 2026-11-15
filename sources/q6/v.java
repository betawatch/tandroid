package q6;

import a8.k8;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class v implements com.google.android.gms.common.api.o {
    public final /* synthetic */ k8 a;
    public final /* synthetic */ TaskCompletionSource b;
    public final /* synthetic */ l c;

    public v(k8 k8Var, TaskCompletionSource taskCompletionSource, l lVar) {
        this.a = k8Var;
        this.b = taskCompletionSource;
        this.c = lVar;
    }

    @Override // com.google.android.gms.common.api.o
    public final void a(Status status) {
        if (!status.b()) {
            this.b.setException(m.l(status));
            return;
        }
        k8 k8Var = this.a;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        BasePendingResult basePendingResult = (BasePendingResult) k8Var;
        m.i("Result has already been consumed.", !basePendingResult.j);
        try {
            if (!basePendingResult.d.await(0L, timeUnit)) {
                basePendingResult.e(Status.n);
            }
        } catch (InterruptedException unused) {
            basePendingResult.e(Status.f);
        }
        m.i("Result is not ready.", basePendingResult.g());
        this.b.setResult(this.c.q(basePendingResult.j()));
    }
}
