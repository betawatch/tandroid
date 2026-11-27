// default package

import android.view.View;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final /* synthetic */ class voc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zoc b;

    public /* synthetic */ voc(zoc zocVar, byte b) {
        this.a = b;
        this.b = zocVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        zoc zocVar = this.b;
        switch (b) {
            case 0:
                dl1 dl1Var = zocVar.a;
                if (dl1Var.getParent() instanceof View) {
                    ((View) dl1Var.getParent()).invalidate();
                    break;
                }
                break;
            default:
                zocVar.p();
                break;
        }
    }
}
