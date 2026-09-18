package qa;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
