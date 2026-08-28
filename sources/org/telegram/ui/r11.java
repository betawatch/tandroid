package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u11 b;

    public /* synthetic */ r11(u11 u11Var, int i9) {
        this.a = i9;
        this.b = u11Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u11 u11Var = this.b;
                AndroidUtilities.cancelRunOnUIThread(u11Var.J);
                boolean z10 = u11Var.r;
                if (z10) {
                    if (z10 && u11Var.B == null) {
                        org.telegram.ui.Components.mi0 mi0Var = new org.telegram.ui.Components.mi0(R.raw.qr_matrix, AndroidUtilities.dp(200.0f), "qr_matrix", AndroidUtilities.dp(200.0f));
                        u11Var.B = mi0Var;
                        mi0Var.r0 = u11Var;
                        mi0Var.getPaint().setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                        u11Var.B.I(1);
                        u11Var.B.start();
                    }
                    if (u11Var.F == 0 || System.currentTimeMillis() / 1000 >= u11Var.F) {
                        if (u11Var.F != 0) {
                            u11Var.E = null;
                            Utilities.themeQueue.postRunnable(new s11(u11Var, u11Var.getWidth(), u11Var.getHeight(), 2));
                            u11Var.s.q("", true, true);
                        }
                        MessagesController.getInstance(UserConfig.selectedAccount).requestContactToken(u11Var.F == 0 ? 750L : 1750L, new w3(u11Var, 18));
                    }
                    int i9 = u11Var.F;
                    if (i9 > 0 && u11Var.E != null) {
                        long max = Math.max(0L, (i9 - (System.currentTimeMillis() / 1000)) - 1);
                        int i10 = (int) (max % 60);
                        int min = Math.min(99, (int) (max / 60));
                        org.telegram.ui.Components.sn0 sn0Var = u11Var.s;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(min < 10 ? "0" : "");
                        sb2.append(min);
                        sb2.append(":");
                        sb2.append(i10 < 10 ? "0" : "");
                        sb2.append(i10);
                        sn0Var.q(sb2.toString(), true, false);
                    }
                    if (u11Var.isAttachedToWindow()) {
                        AndroidUtilities.runOnUIThread(u11Var.J, 1000L);
                        break;
                    }
                }
                break;
            default:
                u11 u11Var2 = this.b;
                u11Var2.O = false;
                Bitmap bitmap = u11Var2.h;
                if (bitmap != null) {
                    u11Var2.h = null;
                    u11Var2.x.d(0.0f, true);
                    Bitmap bitmap2 = u11Var2.n;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                    }
                    u11Var2.n = bitmap;
                    u11Var2.invalidate();
                    break;
                }
                break;
        }
    }
}
