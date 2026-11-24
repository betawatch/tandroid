// default package

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
