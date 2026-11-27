// default package

import org.telegram.messenger.voip.NativeInstance;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class wp9 implements f01, NativeInstance.BroadcastStateCallback {
    public final /* synthetic */ dq9 a;
    public final /* synthetic */ NativeInstance b;

    public /* synthetic */ wp9(dq9 dq9Var, NativeInstance nativeInstance) {
        this.a = dq9Var;
        this.b = nativeInstance;
    }

    @Override // org.telegram.messenger.voip.NativeInstance.BroadcastStateCallback
    public final void onBroadcastStateChanged(boolean z, boolean z2) {
        hl.c3(new ba1((Object) this.a, (Object) this.b, z2, z, (byte) 4));
    }

    @Override // f01
    public final void onRejoinRequested() {
        hl.c3(new en9(this.a, this.b, (byte) 4));
    }
}
