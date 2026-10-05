package zg;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                    oVar.c.setVisibility(0);
                    oVar.c.setLayerType(2, null);
                    oVar.e0(oVar.P.e);
                    oVar.P.a(true, true);
                    break;
                }
                break;
            case 4:
                nf.f.s(oVar.getParentActivity(), "https://t.me/stickers");
                break;
            case 5:
                nf.f.s(oVar.getParentActivity(), LocaleController.getString(R.string.ChannelEnablePaidReactionsInfoLink));
                break;
            default:
                oVar.Y(false);
                break;
        }
    }
}
