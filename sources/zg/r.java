package zg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.zn;
import w7.y5;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class r implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t b;

    public /* synthetic */ r(t tVar, int i10) {
        this.a = i10;
        this.b = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.c(true);
                break;
            default:
                t tVar = this.b;
                tVar.e = tVar.b();
                int i10 = tVar.f;
                int i11 = tVar.h;
                zn znVar = tVar.a;
                if (tVar.b == null) {
                    s sVar = new s((znVar.getUserConfig().getClientUserId() > znVar.a() ? 1 : (znVar.getUserConfig().getClientUserId() == znVar.a() ? 0 : -1)) == 0 ? 3 : 0, znVar.getCurrentAccount(), tVar.getContext(), tVar.a, znVar.getResourceProvider());
                    sVar.l1 = 1.0f;
                    sVar.setWillNotDraw(false);
                    tVar.b = sVar;
                    int dp = AndroidUtilities.dp(4.0f) + (LocaleController.isRTL ? 0 : i11);
                    int dp2 = AndroidUtilities.dp(4.0f);
                    int dp3 = AndroidUtilities.dp(4.0f);
                    if (!LocaleController.isRTL) {
                        i11 = 0;
                    }
                    sVar.setPadding(dp, dp2, dp3 + i11, AndroidUtilities.dp(i10));
                    tVar.b.setDelegate(new n2.e(tVar, 28));
                    tVar.b.setClipChildren(false);
                    tVar.b.setClipToPadding(false);
                    tVar.addView(tVar.b, y5.e(-2, i10 + 70, 5));
                }
                tVar.c(false);
                if (!tVar.b.isEnabled()) {
                    tVar.x = false;
                    tVar.b.setTransitionProgress(1.0f);
                    break;
                } else {
                    tVar.x = true;
                    tVar.b.p(tVar.e, znVar.Z7, true);
                    tVar.b.r(false);
                    break;
                }
        }
    }
}
