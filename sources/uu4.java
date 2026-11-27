// default package

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class uu4 implements m0b {
    public final tcc a;
    public final TaskCompletionSource b;

    public uu4(tcc tccVar, TaskCompletionSource taskCompletionSource) {
        this.a = tccVar;
        this.b = taskCompletionSource;
    }

    @Override // m0b
    public final boolean a(Exception exc) {
        this.b.trySetException(exc);
        return true;
    }

    @Override // m0b
    public final boolean b(ia0 ia0Var) {
        if (ia0Var.b == 4 && !this.a.a(ia0Var)) {
            String str = ia0Var.c;
            if (str != null) {
                this.b.setResult(new z90(ia0Var.e, ia0Var.f, str));
                return true;
            }
            p3d.h("Null token");
        }
        return false;
    }
}
