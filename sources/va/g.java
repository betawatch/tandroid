package va;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
