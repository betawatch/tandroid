// default package

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class z2d extends e1d {
    public final /* synthetic */ TaskCompletionSource b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2d(TaskCompletionSource taskCompletionSource) {
        super((byte) 0, false);
        this.b = taskCompletionSource;
        attachInterface(this, "com.google.firebase.pnv.internal.IFpnvCallbacks");
    }
}
