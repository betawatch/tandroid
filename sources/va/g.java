package va;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
