// default package

import org.telegram.ui.Components.l;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class yy1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ l b;
    public final /* synthetic */ dz1 c;

    public /* synthetic */ yy1(l lVar, dz1 dz1Var, byte b) {
        this.a = b;
        this.b = lVar;
        this.c = dz1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        dz1 dz1Var = this.c;
        l lVar = this.b;
        switch (b) {
            case 0:
                lVar.removeView(dz1Var);
                break;
            case 1:
                lVar.removeView(dz1Var);
                break;
            case 2:
                lVar.removeView(dz1Var);
                if (lVar.a == dz1Var) {
                    lVar.a = null;
                    break;
                }
                break;
            default:
                lVar.removeView(dz1Var);
                if (lVar.b == dz1Var) {
                    lVar.b = null;
                    break;
                }
                break;
        }
    }
}
