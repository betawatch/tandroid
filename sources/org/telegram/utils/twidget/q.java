package org.telegram.utils.twidget;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q implements m0d, a0d {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;

    public /* synthetic */ q(Object obj, int i, byte b) {
        this.a = b;
        this.b = obj;
        this.c = i;
    }

    @Override // a0d
    public final void a(byte[] bArr) {
        ((WidgetEngineBackend) this.b).lambda$signal$3(this.c, bArr);
    }

    @Override // m0d
    public final Object run() {
        byte b = this.a;
        int i = this.c;
        w wVar = (w) this.b;
        switch (b) {
            case 0:
                wVar.b.deleteFont(i);
                break;
            default:
                wVar.b.canvasRelease(i);
                break;
        }
        return null;
    }
}
