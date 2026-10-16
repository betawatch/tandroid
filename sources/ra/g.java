package ra;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class g implements i {
    public final TaskCompletionSource a;

    public g(TaskCompletionSource taskCompletionSource) {
        this.a = taskCompletionSource;
    }

    @Override // ra.i
    public final boolean a(Exception exc) {
        return false;
    }

    @Override // ra.i
    public final boolean b(sa.a aVar) {
        int i10 = aVar.b;
        if (i10 != 3 && i10 != 4 && i10 != 5) {
            return false;
        }
        this.a.trySetResult(aVar.a);
        return true;
    }
}
