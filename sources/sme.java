// default package

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class sme extends dzc {
    public final /* synthetic */ byte b;
    public final /* synthetic */ TaskCompletionSource c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sme(TaskCompletionSource taskCompletionSource, byte b) {
        super((byte) 13);
        this.b = b;
        this.c = taskCompletionSource;
    }

    @Override // dzc
    public final void P(Status status, nn5 nn5Var) {
        switch (this.b) {
            case 0:
                break;
            default:
                status.getClass();
                dve.a(status, nn5Var, this.c);
                break;
        }
    }

    @Override // dzc
    public final void f(Status status, r44 r44Var) {
        switch (this.b) {
            case 0:
                status.getClass();
                dve.a(status, r44Var, this.c);
                break;
        }
    }

    private final void T(Status status, r44 r44Var) {
    }

    private final void U(Status status, nn5 nn5Var) {
    }
}
