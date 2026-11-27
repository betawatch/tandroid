// default package

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class sod extends gl5 {
    public final /* synthetic */ Boolean b;
    public final /* synthetic */ TaskCompletionSource c;

    public sod(Boolean bool, TaskCompletionSource taskCompletionSource) {
        this.b = bool;
        this.c = taskCompletionSource;
    }

    @Override // gl5
    public final void T(Status status) {
        vze.a(status, this.b, this.c);
    }
}
