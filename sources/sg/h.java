package sg;

import org.telegram.messenger.cd;
import org.telegram.messenger.zs;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o b;

    public /* synthetic */ h(o oVar, int i10) {
        this.a = i10;
        this.b = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        o oVar = this.b;
        switch (i10) {
            case 0:
                oVar.h.requestFocus();
                break;
            case 1:
                oVar.h.setFocusableInTouchMode(true);
                break;
            case 2:
                oVar.finishFragment();
                break;
            case 3:
                if (oVar.O && !oVar.N) {
                    oVar.N = true;
                    zs.e().k(98, 512);
                    oVar.c.setVisibility(0);
                    oVar.c.setLayerType(2, null);
                    oVar.i0(oVar.P.e);
                    oVar.P.a(true, true);
                    break;
                }
                break;
            case 4:
                gf.f.r(oVar.getParentActivity(), "https://t.me/stickers");
                break;
            case 5:
                gf.f.r(oVar.getParentActivity(), cd.L0(2131752409, null));
                break;
            default:
                oVar.d0(false);
                break;
        }
    }
}
