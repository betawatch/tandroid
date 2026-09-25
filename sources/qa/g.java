package qa;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final class g implements i {
    public final TaskCompletionSource a;

    public g(TaskCompletionSource taskCompletionSource) {
        this.a = taskCompletionSource;
    }

    @Override // qa.i
    public final boolean a(Exception exc) {
        return false;
    }

    @Override // qa.i
    public final boolean b(ra.b bVar) {
        int i10 = bVar.b;
        if (i10 != 3 && i10 != 4 && i10 != 5) {
            return false;
        }
        this.a.trySetResult(bVar.a);
        return true;
    }
}
