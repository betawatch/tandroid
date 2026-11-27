// default package

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
    public final void T(Status status, wg7 wg7Var) {
        switch (this.c) {
            case 0:
                vze.b(status, wg7Var, this.d);
                break;
            default:
                super.T(status, wg7Var);
                break;
        }
    }

    @Override // q5d
    public final void V(Status status, yg7 yg7Var) {
        switch (this.c) {
            case 1:
                vze.b(status, yg7Var, this.d);
                break;
            default:
                super.V(status, yg7Var);
                break;
        }
    }
}
