// default package

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
