// default package

import android.view.ViewGroup;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
