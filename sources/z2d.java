// default package

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class z2d extends z0d {
    public final /* synthetic */ byte c;
    public final /* synthetic */ TaskCompletionSource d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z2d(u84 u84Var, TaskCompletionSource taskCompletionSource, byte b) {
        super((byte) 0);
        this.c = b;
        this.d = taskCompletionSource;
    }

    @Override // z0d
    public final void T(Status status, me7 me7Var) {
        switch (this.c) {
            case 0:
                dve.b(status, me7Var, this.d);
                break;
            default:
                super.T(status, me7Var);
                break;
        }
    }

    @Override // z0d
    public final void V(Status status, oe7 oe7Var) {
        switch (this.c) {
            case 1:
                dve.b(status, oe7Var, this.d);
                break;
            default:
                super.V(status, oe7Var);
                break;
        }
    }
}
