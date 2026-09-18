package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y21 b;

    public /* synthetic */ v21(y21 y21Var, int i10) {
        this.a = i10;
        this.b = y21Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                y21 y21Var = this.b;
                AndroidUtilities.cancelRunOnUIThread(y21Var.N);
                boolean z10 = y21Var.r;
                if (z10) {
                    if (z10 && y21Var.F == null) {
                        org.telegram.ui.Components.ij0 ij0Var = new org.telegram.ui.Components.ij0(R.raw.qr_matrix, AndroidUtilities.dp(200.0f), AndroidUtilities.dp(200.0f));
                        y21Var.F = ij0Var;
                        ij0Var.R(y21Var);
                        y21Var.F.getPaint().setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                        y21Var.F.K(1);
                        y21Var.F.start();
                    }
                    if (y21Var.J == 0 || System.currentTimeMillis() / 1000 >= y21Var.J) {
                        if (y21Var.J != 0) {
                            y21Var.I = null;
                            Utilities.themeQueue.postRunnable(new w21(y21Var, y21Var.getWidth(), y21Var.getHeight(), 2));
                            y21Var.s.q("", true, true);
                        }
                        MessagesController.getInstance(UserConfig.selectedAccount).requestContactToken(y21Var.J == 0 ? 750L : 1750L, new s3(y21Var, 18));
                    }
                    int i10 = y21Var.J;
                    if (i10 > 0 && y21Var.I != null) {
                        long max = Math.max(0L, (i10 - (System.currentTimeMillis() / 1000)) - 1);
                        int i11 = (int) (max % 60);
                        int min = Math.min(99, (int) (max / 60));
                        org.telegram.ui.Components.xo0 xo0Var = y21Var.s;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(min < 10 ? "0" : "");
                        sb2.append(min);
                        sb2.append(":");
                        sb2.append(i11 < 10 ? "0" : "");
                        sb2.append(i11);
                        xo0Var.q(sb2.toString(), true, false);
                    }
                    if (y21Var.isAttachedToWindow()) {
                        AndroidUtilities.runOnUIThread(y21Var.N, 1000L);
                        break;
                    }
                }
                break;
            default:
                y21 y21Var2 = this.b;
                y21Var2.S = false;
                Bitmap bitmap = y21Var2.h;
                if (bitmap != null) {
                    y21Var2.h = null;
                    y21Var2.x.d(0.0f, true);
                    Bitmap bitmap2 = y21Var2.n;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                    }
                    y21Var2.n = bitmap;
                    y21Var2.invalidate();
                    break;
                }
                break;
        }
    }
}
