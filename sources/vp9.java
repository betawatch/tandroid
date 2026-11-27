// default package

import org.telegram.messenger.voip.NativeInstance;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
