package sg;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ua;
import org.telegram.ui.qx0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class w0 implements z4.e {
    public final /* synthetic */ ua a;
    public final /* synthetic */ y0 b;

    public w0(y0 y0Var, ua uaVar) {
        this.b = y0Var;
        this.a = uaVar;
    }

    @Override // z4.e
    public final void a(float f7, int i10, int i11) {
        ua uaVar = this.a;
        uaVar.b = f7;
        uaVar.c = i10;
        uaVar.invalidate();
        y0 y0Var = this.b;
        y0Var.G = i10;
        y0Var.H = i11 > 0 ? i10 + 1 : i10 - 1;
        y0Var.I = f7;
        d();
    }

    @Override // z4.e
    public final void b(int i10) {
        y0 y0Var = this.b;
        ArrayList arrayList = y0Var.d;
        if (((qx0) arrayList.get(i10)).a == 0) {
            y0Var.N.setTitle(LocaleController.getString(R.string.DoubledLimits));
            y0Var.N.requestLayout();
        } else if (((qx0) arrayList.get(i10)).a == 14) {
            y0Var.N.setTitle(LocaleController.getString(R.string.UpgradedStories));
            y0Var.N.requestLayout();
        } else if (((qx0) arrayList.get(i10)).a == 40) {
            y0Var.N.setTitle(LocaleController.getString(R.string.FeaturePreviewGifts));
            y0Var.N.requestLayout();
        } else if (((qx0) arrayList.get(i10)).a == 28) {
            y0Var.N.setTitle(LocaleController.getString(R.string.TelegramBusiness));
            y0Var.N.requestLayout();
        }
        d();
    }

    public final void d() {
        int i10;
        int i11;
        y0 y0Var = this.b;
        v0 v0Var = y0Var.n;
        ArrayList arrayList = y0Var.d;
        int i12 = 0;
        while (true) {
            float f7 = 0.0f;
            if (i12 >= v0Var.getChildCount()) {
                break;
            }
            x0 x0Var = (x0) v0Var.getChildAt(i12);
            if (!y0Var.w || !(x0Var.f instanceof n0)) {
                int i13 = x0Var.a;
                l0 l0Var = x0Var.e;
                if (i13 == y0Var.G) {
                    f7 = (-x0Var.getMeasuredWidth()) * y0Var.I;
                    l0Var.setOffset(f7);
                } else if (i13 == y0Var.H) {
                    f7 = ((-x0Var.getMeasuredWidth()) * y0Var.I) + x0Var.getMeasuredWidth();
                    l0Var.setOffset(f7);
                } else {
                    l0Var.setOffset(x0Var.getMeasuredWidth());
                }
            }
            if (x0Var.f instanceof n0) {
                x0Var.setTranslationX(-f7);
                x0Var.b.setTranslationX(f7);
                x0Var.c.setTranslationX(f7);
            }
            i12++;
        }
        int i14 = y0Var.G;
        boolean z10 = i14 >= 0 && i14 < arrayList.size() && ((i11 = ((qx0) arrayList.get(y0Var.G)).a) == 0 || i11 == 14 || i11 == 28);
        int i15 = y0Var.H;
        boolean z11 = i15 >= 0 && i15 < arrayList.size() && ((i10 = ((qx0) arrayList.get(y0Var.H)).a) == 0 || i10 == 14 || i10 == 28);
        if (z10 && z11) {
            y0Var.f = 1.0f;
            float f10 = y0Var.I;
            if (f10 == 0.0f) {
                f10 = 1.0f;
            }
            y0Var.e = f10;
            y0Var.h = true;
        } else if (z10) {
            float f11 = 1.0f - y0Var.I;
            y0Var.e = f11;
            y0Var.f = f11;
            y0Var.h = true;
        } else if (z11) {
            float f12 = y0Var.I;
            y0Var.e = f12;
            y0Var.f = f12;
            y0Var.h = false;
        } else {
            y0Var.e = 0.0f;
            y0Var.f = 0.0f;
            y0Var.h = true;
        }
        int i16 = (int) ((1.0f - y0Var.e) * 255.0f);
        if (i16 != y0Var.K) {
            y0Var.K = i16;
            y0Var.r.invalidate();
            AndroidUtilities.runOnUIThread(new ri.h0(this, 4));
        }
    }

    @Override // z4.e
    public final void c(int i10) {
    }
}
