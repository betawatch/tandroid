// default package

import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class toc implements qs3 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zoc b;

    public /* synthetic */ toc(zoc zocVar, byte b) {
        this.a = b;
        this.b = zocVar;
    }

    @Override // qs3
    public final void a(vpa vpaVar, float f, float f2) {
        byte b = this.a;
        zoc zocVar = this.b;
        switch (b) {
            case 0:
                zocVar.C = f;
                zocVar.a.invalidate();
                break;
            case 1:
                zocVar.c0 = f;
                dl1 dl1Var = zocVar.a;
                dl1Var.invalidate();
                if (dl1Var.getParent() instanceof View) {
                    ((View) dl1Var.getParent()).invalidate();
                    break;
                }
                break;
            default:
                zocVar.a0 = f;
                dl1 dl1Var2 = zocVar.a;
                dl1Var2.invalidate();
                if (dl1Var2.getParent() instanceof View) {
                    ((View) dl1Var2.getParent()).invalidate();
                    break;
                }
                break;
        }
    }
}
