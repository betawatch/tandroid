package zg;

import ai.m2;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.Components.hs;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q b;

    public /* synthetic */ h(q qVar, int i10) {
        this.a = i10;
        this.b = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        q qVar = this.b;
        switch (i10) {
            case 0:
                qVar.n.requestFocus();
                break;
            case 1:
                qVar.finishFragment();
                break;
            case 2:
                if (!qVar.K) {
                    qVar.K = true;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                    int measuredHeight = qVar.c.getMeasuredHeight();
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) qVar.y.getLayoutParams();
                    marginLayoutParams.bottomMargin = measuredHeight;
                    qVar.y.setLayoutParams(marginLayoutParams);
                    qVar.c.setVisibility(0);
                    qVar.c.setTranslationY(r0.getMeasuredHeight());
                    qVar.c.animate().setListener(null).cancel();
                    qVar.c.animate().translationY(0.0f).withLayer().setDuration(350L).setInterpolator(hs.f).setUpdateListener(new j(qVar, 0)).setListener(new m2(2)).start();
                    break;
                }
                break;
            case 3:
                of.f.s(qVar.getParentActivity(), "https://t.me/stickers");
                break;
            case 4:
                of.f.s(qVar.getParentActivity(), LocaleController.getString(R.string.ChannelEnablePaidReactionsInfoLink));
                break;
            default:
                qVar.Y(false);
                break;
        }
    }
}
