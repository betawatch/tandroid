package org.telegram.ui;

import android.graphics.Bitmap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m21 b;

    public /* synthetic */ y11(m21 m21Var, int i10) {
        this.a = i10;
        this.b = m21Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                l21 l21Var = this.b.f;
                if (l21Var != null) {
                    l21Var.s.setClickable(true);
                    break;
                }
                break;
            case 1:
                m21 m21Var = this.b;
                m21Var.d0(0, m21Var.G, true);
                org.telegram.ui.Components.gj0 animatedDrawable = m21Var.C.getAnimatedDrawable();
                if (m21Var.F == null && animatedDrawable != null) {
                    m21Var.F = Bitmap.createBitmap(animatedDrawable.b, animatedDrawable.c, Bitmap.Config.ARGB_8888);
                    animatedDrawable.b();
                    animatedDrawable.B0 = 33;
                    animatedDrawable.a(m21Var.F);
                    animatedDrawable.c();
                    break;
                }
                break;
            case 2:
                int i10 = R.raw.default_pattern;
                m21 m21Var2 = this.b;
                AndroidUtilities.runOnUIThread(new l01(2, m21Var2, SvgHelper.getBitmap(i10, m21Var2.w.getWidth(), m21Var2.w.getHeight(), -16777216)));
                break;
            case 3:
                m21 m21Var3 = this.b;
                n7.qa qaVar = m21Var3.a;
                qaVar.b = m21Var3.G.b(((org.telegram.ui.ActionBar.p2) ((m21) qaVar.c)).currentAccount, m21Var3.H ? 1 : 0);
                break;
            case 4:
                m21.X(this.b);
                break;
            default:
                m21.V(this.b);
                break;
        }
    }
}
