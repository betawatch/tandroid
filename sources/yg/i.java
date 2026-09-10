package yg;

import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.wr;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s b;

    public /* synthetic */ i(s sVar, int i10) {
        this.a = i10;
        this.b = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        s sVar = this.b;
        switch (i10) {
            case 0:
                sVar.n.requestFocus();
                break;
            case 1:
                sVar.finishFragment();
                break;
            case 2:
                if (!sVar.K) {
                    sVar.K = true;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                    int measuredHeight = sVar.c.getMeasuredHeight();
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) sVar.y.getLayoutParams();
                    marginLayoutParams.bottomMargin = measuredHeight;
                    sVar.y.setLayoutParams(marginLayoutParams);
                    sVar.c.setVisibility(0);
                    sVar.c.setTranslationY(r3.getMeasuredHeight());
                    sVar.c.animate().setListener(null).cancel();
                    sVar.c.animate().translationY(0.0f).withLayer().setDuration(350L).setInterpolator(wr.f).setUpdateListener(new j(sVar, 0)).setListener(new f10(1)).start();
                    break;
                }
                break;
            case 3:
                nf.f.s(sVar.getParentActivity(), "https://t.me/stickers");
                break;
            case 4:
                nf.f.s(sVar.getParentActivity(), LocaleController.getString(R.string.ChannelEnablePaidReactionsInfoLink));
                break;
            default:
                sVar.Y(false);
                break;
        }
    }
}
