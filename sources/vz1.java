// default package

import org.telegram.ui.Components.l;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class vz1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ l b;
    public final /* synthetic */ hg5 c;

    public /* synthetic */ vz1(l lVar, hg5 hg5Var, byte b) {
        this.a = b;
        this.b = lVar;
        this.c = hg5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        hg5 hg5Var = this.c;
        l lVar = this.b;
        switch (b) {
            case 0:
                lVar.removeView(hg5Var);
                if (lVar.b == hg5Var) {
                    lVar.b = null;
                    break;
                }
                break;
            case 1:
                lVar.removeView(hg5Var);
                break;
            case 2:
                lVar.removeView(hg5Var);
                break;
            default:
                lVar.removeView(hg5Var);
                if (lVar.a == hg5Var) {
                    lVar.a = null;
                    break;
                }
                break;
        }
    }
}
