package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z21 b;

    public /* synthetic */ w21(z21 z21Var, int i10) {
        this.a = i10;
        this.b = z21Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                z21 z21Var = this.b;
                AndroidUtilities.cancelRunOnUIThread(z21Var.N);
                boolean z10 = z21Var.r;
                if (z10) {
                    if (z10 && z21Var.F == null) {
                        org.telegram.ui.Components.xi0 xi0Var = new org.telegram.ui.Components.xi0(R.raw.qr_matrix, AndroidUtilities.dp(200.0f), AndroidUtilities.dp(200.0f));
                        z21Var.F = xi0Var;
                        xi0Var.R(z21Var);
                        z21Var.F.getPaint().setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                        z21Var.F.K(1);
                        z21Var.F.start();
                    }
                    if (z21Var.J == 0 || System.currentTimeMillis() / 1000 >= z21Var.J) {
                        if (z21Var.J != 0) {
                            z21Var.I = null;
                            Utilities.themeQueue.postRunnable(new x21(z21Var, z21Var.getWidth(), z21Var.getHeight(), 2));
                            z21Var.s.q("", true, true);
                        }
                        MessagesController.getInstance(UserConfig.selectedAccount).requestContactToken(z21Var.J == 0 ? 750L : 1750L, new s3(z21Var, 18));
                    }
                    int i10 = z21Var.J;
                    if (i10 > 0 && z21Var.I != null) {
                        long max = Math.max(0L, (i10 - (System.currentTimeMillis() / 1000)) - 1);
                        int i11 = (int) (max % 60);
                        int min = Math.min(99, (int) (max / 60));
                        org.telegram.ui.Components.jo0 jo0Var = z21Var.s;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(min < 10 ? "0" : "");
                        sb2.append(min);
                        sb2.append(":");
                        sb2.append(i11 < 10 ? "0" : "");
                        sb2.append(i11);
                        jo0Var.q(sb2.toString(), true, false);
                    }
                    if (z21Var.isAttachedToWindow()) {
                        AndroidUtilities.runOnUIThread(z21Var.N, 1000L);
                        break;
                    }
                }
                break;
            default:
                z21 z21Var2 = this.b;
                z21Var2.S = false;
                Bitmap bitmap = z21Var2.h;
                if (bitmap != null) {
                    z21Var2.h = null;
                    z21Var2.x.d(0.0f, true);
                    Bitmap bitmap2 = z21Var2.n;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                    }
                    z21Var2.n = bitmap;
                    z21Var2.invalidate();
                    break;
                }
                break;
        }
    }
}
