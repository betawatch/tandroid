package ra;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
