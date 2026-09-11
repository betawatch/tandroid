package rg;

import android.animation.ValueAnimator;
import android.os.Bundle;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.d5;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.pr;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.zt0;
import zh.s5;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f(int i10, d5 d5Var) {
        this.a = 4;
        this.b = i10;
        this.c = d5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        int i11 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                k kVar = (k) obj;
                kVar.L = i11;
                kVar.K = true;
                int i12 = 2;
                try {
                    kVar.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                ValueAnimator valueAnimator = kVar.P;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimator2 = kVar.Q;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                kVar.P = duration;
                duration.setInterpolator(pr.f);
                kVar.P.addUpdateListener(new g(kVar, 5));
                kVar.P.addListener(new h(kVar, i12));
                kVar.P.start();
                break;
            case 1:
                zt0 zt0Var = (zt0) obj;
                qg.q1 q1Var = zt0Var.K1;
                zt0Var.s0(q1Var, null);
                qg.s0.e(i11).j(q1Var.c);
                break;
            case 2:
                o2 o2Var = (o2) obj;
                o2Var.getClass();
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.customStickerCreated, Boolean.FALSE);
                o2Var.h();
                break;
            case 3:
                d90 d90Var = ((ug.s0) obj).e;
                try {
                    if (d90Var.getLayout().getLineForOffset(i11) == 0) {
                        d90Var.getEditableText().insert(i11, "\n");
                        break;
                    }
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
                break;
            case 4:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(i11).clientUserId);
                ((d5) obj).getLastFragment().presentFragment(new ProfileActivity(bundle, null));
                break;
            case 5:
                of.f.s(((zh.g) obj).getParentActivity(), LocaleController.getString(i11));
                break;
            default:
                ConnectionsManager.getInstance(((s5) obj).a).cancelRequest(i11, true);
                break;
        }
    }

    public /* synthetic */ f(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }
}
