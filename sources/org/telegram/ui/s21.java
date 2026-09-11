package org.telegram.ui;

import android.graphics.Bitmap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class s21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g31 b;

    public /* synthetic */ s21(g31 g31Var, int i10) {
        this.a = i10;
        this.b = g31Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                f31 f31Var = this.b.f;
                if (f31Var != null) {
                    f31Var.s.setClickable(true);
                    break;
                }
                break;
            case 1:
                g31 g31Var = this.b;
                g31Var.d0(0, g31Var.J, true);
                org.telegram.ui.Components.xi0 animatedDrawable = g31Var.F.getAnimatedDrawable();
                if (g31Var.I == null && animatedDrawable != null) {
                    g31Var.I = Bitmap.createBitmap(animatedDrawable.b, animatedDrawable.c, Bitmap.Config.ARGB_8888);
                    animatedDrawable.b();
                    animatedDrawable.E0 = 33;
                    animatedDrawable.a(g31Var.I);
                    animatedDrawable.c();
                    break;
                }
                break;
            case 2:
                int i10 = R.raw.default_pattern;
                g31 g31Var2 = this.b;
                AndroidUtilities.runOnUIThread(new rx0(20, g31Var2, SvgHelper.getBitmap(i10, g31Var2.w.getWidth(), g31Var2.w.getHeight(), -16777216)));
                break;
            case 3:
                g31 g31Var3 = this.b;
                o0.a aVar = g31Var3.a;
                aVar.b = g31Var3.J.b(((org.telegram.ui.ActionBar.n2) ((g31) aVar.c)).currentAccount, g31Var3.K ? 1 : 0);
                break;
            case 4:
                g31.X(this.b);
                break;
            default:
                g31.V(this.b);
                break;
        }
    }
}
