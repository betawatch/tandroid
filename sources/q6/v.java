package q6;

import a8.j8;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class v implements com.google.android.gms.common.api.o {
    public final /* synthetic */ j8 a;
    public final /* synthetic */ TaskCompletionSource b;
    public final /* synthetic */ l c;

    public v(j8 j8Var, TaskCompletionSource taskCompletionSource, l lVar) {
        this.a = j8Var;
        this.b = taskCompletionSource;
        this.c = lVar;
    }

    @Override // com.google.android.gms.common.api.o
    public final void a(Status status) {
        if (!status.b()) {
            this.b.setException(m.l(status));
            return;
        }
        j8 j8Var = this.a;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        BasePendingResult basePendingResult = (BasePendingResult) j8Var;
        m.i("Result has already been consumed.", !basePendingResult.j);
        try {
            if (!basePendingResult.d.await(0L, timeUnit)) {
                basePendingResult.e(Status.n);
            }
        } catch (InterruptedException unused) {
            basePendingResult.e(Status.f);
        }
        m.i("Result is not ready.", basePendingResult.g());
        this.b.setResult(this.c.b(basePendingResult.j()));
    }
}
