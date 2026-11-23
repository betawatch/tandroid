package q6;

import a8.l8;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class v implements com.google.android.gms.common.api.o {
    public final /* synthetic */ l8 a;
    public final /* synthetic */ TaskCompletionSource b;
    public final /* synthetic */ l c;

    public v(l8 l8Var, TaskCompletionSource taskCompletionSource, l lVar) {
        this.a = l8Var;
        this.b = taskCompletionSource;
        this.c = lVar;
    }

    @Override // com.google.android.gms.common.api.o
    public final void a(Status status) {
        if (!status.b()) {
            this.b.setException(m.m(status));
            return;
        }
        l8 l8Var = this.a;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        BasePendingResult basePendingResult = (BasePendingResult) l8Var;
        m.j("Result has already been consumed.", !basePendingResult.j);
        try {
            if (!basePendingResult.d.await(0L, timeUnit)) {
                basePendingResult.e(Status.n);
            }
        } catch (InterruptedException unused) {
            basePendingResult.e(Status.f);
        }
        m.j("Result is not ready.", basePendingResult.g());
        this.b.setResult(this.c.n(basePendingResult.j()));
    }
}
