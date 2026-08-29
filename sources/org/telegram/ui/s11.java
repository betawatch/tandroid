package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v11 b;

    public /* synthetic */ s11(v11 v11Var, int i10) {
        this.a = i10;
        this.b = v11Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                v11 v11Var = this.b;
                AndroidUtilities.cancelRunOnUIThread(v11Var.J);
                boolean z10 = v11Var.r;
                if (z10) {
                    if (z10 && v11Var.B == null) {
                        org.telegram.ui.Components.xi0 xi0Var = new org.telegram.ui.Components.xi0(R.raw.qr_matrix, AndroidUtilities.dp(200.0f), "qr_matrix", AndroidUtilities.dp(200.0f));
                        v11Var.B = xi0Var;
                        xi0Var.r0 = v11Var;
                        xi0Var.getPaint().setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                        v11Var.B.I(1);
                        v11Var.B.start();
                    }
                    if (v11Var.F == 0 || System.currentTimeMillis() / 1000 >= v11Var.F) {
                        if (v11Var.F != 0) {
                            v11Var.E = null;
                            Utilities.themeQueue.postRunnable(new t11(v11Var, v11Var.getWidth(), v11Var.getHeight(), 2));
                            v11Var.s.q("", true, true);
                        }
                        MessagesController.getInstance(UserConfig.selectedAccount).requestContactToken(v11Var.F == 0 ? 750L : 1750L, new x3(v11Var, 18));
                    }
                    int i10 = v11Var.F;
                    if (i10 > 0 && v11Var.E != null) {
                        long max = Math.max(0L, (i10 - (System.currentTimeMillis() / 1000)) - 1);
                        int i11 = (int) (max % 60);
                        int min = Math.min(99, (int) (max / 60));
                        org.telegram.ui.Components.do0 do0Var = v11Var.s;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(min < 10 ? "0" : "");
                        sb2.append(min);
                        sb2.append(":");
                        sb2.append(i11 < 10 ? "0" : "");
                        sb2.append(i11);
                        do0Var.q(sb2.toString(), true, false);
                    }
                    if (v11Var.isAttachedToWindow()) {
                        AndroidUtilities.runOnUIThread(v11Var.J, 1000L);
                        break;
                    }
                }
                break;
            default:
                v11 v11Var2 = this.b;
                v11Var2.O = false;
                Bitmap bitmap = v11Var2.h;
                if (bitmap != null) {
                    v11Var2.h = null;
                    v11Var2.x.d(0.0f, true);
                    Bitmap bitmap2 = v11Var2.n;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                    }
                    v11Var2.n = bitmap;
                    v11Var2.invalidate();
                    break;
                }
                break;
        }
    }
}
