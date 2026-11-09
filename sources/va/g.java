package va;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class g implements i {
    public final TaskCompletionSource a;

    public g(TaskCompletionSource taskCompletionSource) {
        this.a = taskCompletionSource;
    }

    @Override // va.i
    public final boolean a(Exception exc) {
        return false;
    }

    @Override // va.i
    public final boolean b(wa.b bVar) {
        int i7 = bVar.b;
        if (i7 != 3 && i7 != 4 && i7 != 5) {
            return false;
        }
        this.a.trySetResult(bVar.a);
        return true;
    }
}
