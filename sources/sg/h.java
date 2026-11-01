package sg;

import org.telegram.messenger.at;
import org.telegram.messenger.dd;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
                    at.e().k(98, 512);
                    oVar.c.setVisibility(0);
                    oVar.c.setLayerType(2, null);
                    oVar.j0(oVar.P.e);
                    oVar.P.a(true, true);
                    break;
                }
                break;
            case 4:
                gf.f.r(oVar.getParentActivity(), "https://t.me/stickers");
                break;
            case 5:
                gf.f.r(oVar.getParentActivity(), dd.L0(2131752409, null));
                break;
            default:
                oVar.e0(false);
                break;
        }
    }
}
