package zg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.zn;
import w7.y5;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class r implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u b;

    public /* synthetic */ r(u uVar, int i10) {
        this.a = i10;
        this.b = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.c(true);
                break;
            default:
                u uVar = this.b;
                uVar.e = uVar.b();
                int i10 = uVar.f;
                int i11 = uVar.h;
                zn znVar = uVar.a;
                if (uVar.b == null) {
                    s sVar = new s((znVar.getUserConfig().getClientUserId() > znVar.a() ? 1 : (znVar.getUserConfig().getClientUserId() == znVar.a() ? 0 : -1)) == 0 ? 3 : 0, znVar.getCurrentAccount(), uVar.getContext(), uVar.a, znVar.getResourceProvider());
                    sVar.l1 = 1.0f;
                    sVar.setWillNotDraw(false);
                    uVar.b = sVar;
                    int dp = AndroidUtilities.dp(4.0f) + (LocaleController.isRTL ? 0 : i11);
                    int dp2 = AndroidUtilities.dp(4.0f);
                    int dp3 = AndroidUtilities.dp(4.0f);
                    if (!LocaleController.isRTL) {
                        i11 = 0;
                    }
                    sVar.setPadding(dp, dp2, dp3 + i11, AndroidUtilities.dp(i10));
                    uVar.b.setDelegate(new t(uVar));
                    uVar.b.setClipChildren(false);
                    uVar.b.setClipToPadding(false);
                    uVar.addView(uVar.b, y5.e(-2, i10 + 70, 5));
                }
                uVar.c(false);
                if (!uVar.b.isEnabled()) {
                    uVar.x = false;
                    uVar.b.setTransitionProgress(1.0f);
                    break;
                } else {
                    uVar.x = true;
                    uVar.b.p(uVar.e, znVar.Z7, true);
                    uVar.b.r(false);
                    break;
                }
        }
    }
}
