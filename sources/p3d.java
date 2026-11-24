// default package

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class p3d extends ej5 {
    public final /* synthetic */ TaskCompletionSource b;

    public p3d(TaskCompletionSource taskCompletionSource) {
        this.b = taskCompletionSource;
    }

    @Override // ej5
    public final void T(Status status) {
        dve.a(status, null, this.b);
    }
}
