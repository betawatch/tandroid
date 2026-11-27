// default package

import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
