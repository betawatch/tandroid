package ua;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class h implements j {
    public final TaskCompletionSource a;

    public h(TaskCompletionSource taskCompletionSource) {
        this.a = taskCompletionSource;
    }

    @Override // ua.j
    public final boolean a(va.b bVar) {
        int i3 = bVar.b;
        if (i3 != 3 && i3 != 4 && i3 != 5) {
            return false;
        }
        this.a.trySetResult(bVar.a);
        return true;
    }

    @Override // ua.j
    public final boolean b(Exception exc) {
        return false;
    }
}
