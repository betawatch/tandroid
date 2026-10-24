package ra;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
