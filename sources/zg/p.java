package zg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.yn;
import w7.z5;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r b;

    public /* synthetic */ p(r rVar, int i10) {
        this.a = i10;
        this.b = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.c(true);
                break;
            default:
                r rVar = this.b;
                rVar.e = rVar.b();
                int i10 = rVar.f;
                int i11 = rVar.h;
                yn ynVar = rVar.a;
                if (rVar.b == null) {
                    q qVar = new q((ynVar.getUserConfig().getClientUserId() > ynVar.a() ? 1 : (ynVar.getUserConfig().getClientUserId() == ynVar.a() ? 0 : -1)) == 0 ? 3 : 0, ynVar.getCurrentAccount(), rVar.getContext(), rVar.a, ynVar.getResourceProvider());
                    qVar.l1 = 1.0f;
                    qVar.setWillNotDraw(false);
                    rVar.b = qVar;
                    int dp = AndroidUtilities.dp(4.0f) + (LocaleController.isRTL ? 0 : i11);
                    int dp2 = AndroidUtilities.dp(4.0f);
                    int dp3 = AndroidUtilities.dp(4.0f);
                    if (!LocaleController.isRTL) {
                        i11 = 0;
                    }
                    qVar.setPadding(dp, dp2, dp3 + i11, AndroidUtilities.dp(i10));
                    rVar.b.setDelegate(new l2.g(rVar, 25));
                    rVar.b.setClipChildren(false);
                    rVar.b.setClipToPadding(false);
                    rVar.addView(rVar.b, z5.e(-2, i10 + 70, 5));
                }
                rVar.c(false);
                if (!rVar.b.isEnabled()) {
                    rVar.x = false;
                    rVar.b.setTransitionProgress(1.0f);
                    break;
                } else {
                    rVar.x = true;
                    rVar.b.p(rVar.e, ynVar.X7, true);
                    rVar.b.r(false);
                    break;
                }
        }
    }
}
