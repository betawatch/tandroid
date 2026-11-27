// default package

import android.view.ViewGroup;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class zv3 extends cxe {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ zv3(ViewGroup viewGroup, byte b) {
        this.a = b;
        this.b = viewGroup;
    }

    @Override // cxe
    public final void a() {
        byte b = this.a;
        ViewGroup viewGroup = this.b;
        switch (b) {
            case 0:
                ((dw3) viewGroup).j3 = false;
                break;
            case 1:
                ((pz8) viewGroup).w = false;
                break;
            default:
                ((n1a) viewGroup).y1 = false;
                break;
        }
    }

    @Override // cxe
    public final void b() {
        byte b = this.a;
        ViewGroup viewGroup = this.b;
        switch (b) {
            case 0:
                ((dw3) viewGroup).j3 = true;
                break;
            case 2:
                ((n1a) viewGroup).y1 = true;
                break;
        }
    }
}
