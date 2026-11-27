// default package

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class q7d extends q5d {
    public final /* synthetic */ byte c;
    public final /* synthetic */ TaskCompletionSource d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q7d(qa4 qa4Var, TaskCompletionSource taskCompletionSource, byte b) {
        super((byte) 0);
        this.c = b;
        this.d = taskCompletionSource;
    }

    @Override // q5d
    public final void T(Status status, vg7 vg7Var) {
        switch (this.c) {
            case 0:
                vze.b(status, vg7Var, this.d);
                break;
            default:
                super.T(status, vg7Var);
                break;
        }
    }

    @Override // q5d
    public final void V(Status status, xg7 xg7Var) {
        switch (this.c) {
            case 1:
                vze.b(status, xg7Var, this.d);
                break;
            default:
                super.V(status, xg7Var);
                break;
        }
    }
}
