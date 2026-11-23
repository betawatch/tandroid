package va;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
