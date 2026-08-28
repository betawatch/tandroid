package y9;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class g implements i {
    public final TaskCompletionSource a;

    public g(TaskCompletionSource taskCompletionSource) {
        this.a = taskCompletionSource;
    }

    @Override // y9.i
    public final boolean a(z9.a aVar) {
        int i9 = aVar.b;
        if (i9 != 3 && i9 != 4 && i9 != 5) {
            return false;
        }
        this.a.trySetResult(aVar.a);
        return true;
    }

    @Override // y9.i
    public final boolean b(Exception exc) {
        return false;
    }
}
