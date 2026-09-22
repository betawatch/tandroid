package org.telegram.ui;

import android.graphics.Bitmap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f31 b;

    public /* synthetic */ r21(f31 f31Var, int i10) {
        this.a = i10;
        this.b = f31Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                e31 e31Var = this.b.f;
                if (e31Var != null) {
                    e31Var.s.setClickable(true);
                    break;
                }
                break;
            case 1:
                f31 f31Var = this.b;
                f31Var.d0(0, f31Var.J, true);
                org.telegram.ui.Components.xi0 animatedDrawable = f31Var.F.getAnimatedDrawable();
                if (f31Var.I == null && animatedDrawable != null) {
                    f31Var.I = Bitmap.createBitmap(animatedDrawable.b, animatedDrawable.c, Bitmap.Config.ARGB_8888);
                    animatedDrawable.b();
                    animatedDrawable.C0 = 33;
                    animatedDrawable.a(f31Var.I);
                    animatedDrawable.c();
                    break;
                }
                break;
            case 2:
                int i10 = R.raw.default_pattern;
                f31 f31Var2 = this.b;
                AndroidUtilities.runOnUIThread(new iy0(14, f31Var2, SvgHelper.getBitmap(i10, f31Var2.w.getWidth(), f31Var2.w.getHeight(), -16777216)));
                break;
            case 3:
                f31 f31Var3 = this.b;
                o0.a aVar = f31Var3.a;
                aVar.b = f31Var3.J.b(((org.telegram.ui.ActionBar.n2) ((f31) aVar.c)).currentAccount, f31Var3.K ? 1 : 0);
                break;
            case 4:
                f31.X(this.b);
                break;
            default:
                f31.V(this.b);
                break;
        }
    }
}
