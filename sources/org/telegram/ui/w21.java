package org.telegram.ui;

import android.graphics.Bitmap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class w21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k31 b;

    public /* synthetic */ w21(k31 k31Var, int i10) {
        this.a = i10;
        this.b = k31Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                j31 j31Var = this.b.f;
                if (j31Var != null) {
                    j31Var.s.setClickable(true);
                    break;
                }
                break;
            case 1:
                k31 k31Var = this.b;
                k31Var.d0(0, k31Var.J, true);
                org.telegram.ui.Components.hj0 animatedDrawable = k31Var.F.getAnimatedDrawable();
                if (k31Var.I == null && animatedDrawable != null) {
                    k31Var.I = Bitmap.createBitmap(animatedDrawable.b, animatedDrawable.c, Bitmap.Config.ARGB_8888);
                    animatedDrawable.b();
                    animatedDrawable.E0 = 33;
                    animatedDrawable.a(k31Var.I);
                    animatedDrawable.c();
                    break;
                }
                break;
            case 2:
                int i10 = R.raw.default_pattern;
                k31 k31Var2 = this.b;
                AndroidUtilities.runOnUIThread(new ey0(17, k31Var2, SvgHelper.getBitmap(i10, k31Var2.w.getWidth(), k31Var2.w.getHeight(), -16777216)));
                break;
            case 3:
                k31 k31Var3 = this.b;
                n7.a1 a1Var = k31Var3.a;
                a1Var.b = k31Var3.J.b(((org.telegram.ui.ActionBar.p2) ((k31) a1Var.c)).currentAccount, k31Var3.K ? 1 : 0);
                break;
            case 4:
                k31.X(this.b);
                break;
            default:
                k31.V(this.b);
                break;
        }
    }
}
