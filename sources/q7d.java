// default package

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
