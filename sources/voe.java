// default package

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class voe extends e1d {
    public final /* synthetic */ byte b;
    public final /* synthetic */ TaskCompletionSource c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ voe(TaskCompletionSource taskCompletionSource, byte b) {
        super((byte) 13);
        this.b = b;
        this.c = taskCompletionSource;
    }

    @Override // e1d
    public final void P(Status status, np5 np5Var) {
        switch (this.b) {
            case 0:
                break;
            default:
                status.getClass();
                fxe.a(status, np5Var, this.c);
                break;
        }
    }

    @Override // e1d
    public final void f(Status status, c64 c64Var) {
        switch (this.b) {
            case 0:
                status.getClass();
                fxe.a(status, c64Var, this.c);
                break;
        }
    }

    private final void T(Status status, c64 c64Var) {
    }

    private final void U(Status status, np5 np5Var) {
    }
}
