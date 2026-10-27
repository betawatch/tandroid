package sa;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class g implements i {
    public final TaskCompletionSource a;

    public g(TaskCompletionSource taskCompletionSource) {
        this.a = taskCompletionSource;
    }

    @Override // sa.i
    public final boolean a(Exception exc) {
        return false;
    }

    @Override // sa.i
    public final boolean b(ta.a aVar) {
        int i10 = aVar.b;
        if (i10 != 3 && i10 != 4 && i10 != 5) {
            return false;
        }
        this.a.trySetResult(aVar.a);
        return true;
    }
}
