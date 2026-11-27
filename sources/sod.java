// default package

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
