// default package

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class zs4 implements jwa {
    public final TaskCompletionSource a;

    public zs4(TaskCompletionSource taskCompletionSource) {
        this.a = taskCompletionSource;
    }

    @Override // jwa
    public final boolean a(Exception exc) {
        return false;
    }

    @Override // jwa
    public final boolean b(ga0 ga0Var) {
        int i = ga0Var.b;
        if (i != 3 && i != 4 && i != 5) {
            return false;
        }
        this.a.trySetResult(ga0Var.a);
        return true;
    }
}
