package org.telegram.ui;

import android.graphics.Bitmap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class x21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l31 b;

    public /* synthetic */ x21(l31 l31Var, int i10) {
        this.a = i10;
        this.b = l31Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k31 k31Var = this.b.f;
                if (k31Var != null) {
                    k31Var.s.setClickable(true);
                    break;
                }
                break;
            case 1:
                l31 l31Var = this.b;
                l31Var.c0(0, l31Var.J, true);
                org.telegram.ui.Components.yj0 animatedDrawable = l31Var.F.getAnimatedDrawable();
                if (l31Var.I == null && animatedDrawable != null) {
                    l31Var.I = Bitmap.createBitmap(animatedDrawable.b, animatedDrawable.c, Bitmap.Config.ARGB_8888);
                    animatedDrawable.b();
                    animatedDrawable.C0 = 33;
                    animatedDrawable.a(l31Var.I);
                    animatedDrawable.c();
                    break;
                }
                break;
            case 2:
                int i10 = R.raw.default_pattern;
                l31 l31Var2 = this.b;
                AndroidUtilities.runOnUIThread(new hz0(9, l31Var2, SvgHelper.getBitmap(i10, l31Var2.w.getWidth(), l31Var2.w.getHeight(), -16777216)));
                break;
            case 3:
                l31 l31Var3 = this.b;
                m4.c cVar = l31Var3.a;
                cVar.b = l31Var3.J.b(((org.telegram.ui.ActionBar.m2) ((l31) cVar.c)).currentAccount, l31Var3.K ? 1 : 0);
                break;
            case 4:
                l31.W(this.b);
                break;
            default:
                l31.U(this.b);
                break;
        }
    }
}
