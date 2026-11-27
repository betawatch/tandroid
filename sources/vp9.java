// default package

import org.telegram.messenger.voip.NativeInstance;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class vp9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ NativeInstance b;

    public /* synthetic */ vp9(NativeInstance nativeInstance, byte b) {
        this.a = b;
        this.b = nativeInstance;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        this.b.stopGroup();
    }
}
