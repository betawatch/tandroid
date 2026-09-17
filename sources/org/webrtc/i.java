package org.webrtc;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((HardwareVideoEncoder) this.c).lambda$deliverEncodedImage$0(this.b);
                break;
            default:
                ((SurfaceTextureHelper) this.c).lambda$setFrameRotation$4(this.b);
                break;
        }
    }
}
