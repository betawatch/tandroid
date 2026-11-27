// default package

import org.telegram.messenger.voip.NativeInstance;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
        hl.c3(new dn9(this.a, this.b, (byte) 5));
    }
}
