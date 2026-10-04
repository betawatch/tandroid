package rg;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ta;
import org.telegram.ui.ex0;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class w0 implements z4.e {
    public final /* synthetic */ ta a;
    public final /* synthetic */ y0 b;

    public w0(y0 y0Var, ta taVar) {
        this.b = y0Var;
        this.a = taVar;
    }

    @Override // z4.e
    public final void a(int i10) {
        y0 y0Var = this.b;
        ArrayList arrayList = y0Var.d;
        if (((ex0) arrayList.get(i10)).a == 0) {
            y0Var.N.setTitle(LocaleController.getString(R.string.DoubledLimits));
            y0Var.N.requestLayout();
        } else if (((ex0) arrayList.get(i10)).a == 14) {
            y0Var.N.setTitle(LocaleController.getString(R.string.UpgradedStories));
            y0Var.N.requestLayout();
        } else if (((ex0) arrayList.get(i10)).a == 40) {
            y0Var.N.setTitle(LocaleController.getString(R.string.FeaturePreviewGifts));
            y0Var.N.requestLayout();
        } else if (((ex0) arrayList.get(i10)).a == 28) {
            y0Var.N.setTitle(LocaleController.getString(R.string.TelegramBusiness));
            y0Var.N.requestLayout();
        }
        d();
    }

    @Override // z4.e
    public final void b(float f7, int i10, int i11) {
        ta taVar = this.a;
        taVar.b = f7;
        taVar.c = i10;
        taVar.invalidate();
        y0 y0Var = this.b;
        y0Var.G = i10;
        y0Var.H = i11 > 0 ? i10 + 1 : i10 - 1;
        y0Var.I = f7;
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
            if (!y0Var.w || !(x0Var.f instanceof o0)) {
                int i13 = x0Var.a;
                m0 m0Var = x0Var.e;
                if (i13 == y0Var.G) {
                    f7 = (-x0Var.getMeasuredWidth()) * y0Var.I;
                    m0Var.setOffset(f7);
                } else if (i13 == y0Var.H) {
                    f7 = ((-x0Var.getMeasuredWidth()) * y0Var.I) + x0Var.getMeasuredWidth();
                    m0Var.setOffset(f7);
                } else {
                    m0Var.setOffset(x0Var.getMeasuredWidth());
                }
            }
            if (x0Var.f instanceof o0) {
                x0Var.setTranslationX(-f7);
                x0Var.b.setTranslationX(f7);
                x0Var.c.setTranslationX(f7);
            }
            i12++;
        }
        int i14 = y0Var.G;
        boolean z10 = i14 >= 0 && i14 < arrayList.size() && ((i11 = ((ex0) arrayList.get(y0Var.G)).a) == 0 || i11 == 14 || i11 == 28);
        int i15 = y0Var.H;
        boolean z11 = i15 >= 0 && i15 < arrayList.size() && ((i10 = ((ex0) arrayList.get(y0Var.H)).a) == 0 || i10 == 14 || i10 == 28);
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
            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.u0(this, 28));
        }
    }

    @Override // z4.e
    public final void c(int i10) {
    }
}
