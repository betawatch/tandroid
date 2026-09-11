package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class x21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a31 b;

    public /* synthetic */ x21(a31 a31Var, int i10) {
        this.a = i10;
        this.b = a31Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                a31 a31Var = this.b;
                AndroidUtilities.cancelRunOnUIThread(a31Var.N);
                boolean z10 = a31Var.r;
                if (z10) {
                    if (z10 && a31Var.F == null) {
                        org.telegram.ui.Components.xi0 xi0Var = new org.telegram.ui.Components.xi0(R.raw.qr_matrix, AndroidUtilities.dp(200.0f), AndroidUtilities.dp(200.0f));
                        a31Var.F = xi0Var;
                        xi0Var.v0 = a31Var;
                        xi0Var.getPaint().setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                        a31Var.F.I(1);
                        a31Var.F.start();
                    }
                    if (a31Var.J == 0 || System.currentTimeMillis() / 1000 >= a31Var.J) {
                        if (a31Var.J != 0) {
                            a31Var.I = null;
                            Utilities.themeQueue.postRunnable(new y21(a31Var, a31Var.getWidth(), a31Var.getHeight(), 2));
                            a31Var.s.q("", true, true);
                        }
                        MessagesController.getInstance(UserConfig.selectedAccount).requestContactToken(a31Var.J == 0 ? 750L : 1750L, new t3(a31Var, 18));
                    }
                    int i10 = a31Var.J;
                    if (i10 > 0 && a31Var.I != null) {
                        long max = Math.max(0L, (i10 - (System.currentTimeMillis() / 1000)) - 1);
                        int i11 = (int) (max % 60);
                        int min = Math.min(99, (int) (max / 60));
                        org.telegram.ui.Components.jo0 jo0Var = a31Var.s;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(min < 10 ? "0" : "");
                        sb2.append(min);
                        sb2.append(":");
                        sb2.append(i11 < 10 ? "0" : "");
                        sb2.append(i11);
                        jo0Var.q(sb2.toString(), true, false);
                    }
                    if (a31Var.isAttachedToWindow()) {
                        AndroidUtilities.runOnUIThread(a31Var.N, 1000L);
                        break;
                    }
                }
                break;
            default:
                a31 a31Var2 = this.b;
                a31Var2.S = false;
                Bitmap bitmap = a31Var2.h;
                if (bitmap != null) {
                    a31Var2.h = null;
                    a31Var2.x.d(0.0f, true);
                    Bitmap bitmap2 = a31Var2.n;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                    }
                    a31Var2.n = bitmap;
                    a31Var2.invalidate();
                    break;
                }
                break;
        }
    }
}
