// default package

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class r5d extends dl5 {
    public final /* synthetic */ TaskCompletionSource b;

    public r5d(TaskCompletionSource taskCompletionSource) {
        this.b = taskCompletionSource;
    }

    @Override // dl5
    public final void T(Status status) {
        fxe.a(status, null, this.b);
    }
}
