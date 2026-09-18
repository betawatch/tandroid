package rg;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.sa;
import org.telegram.ui.kx0;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class v0 implements z4.e {
    public final /* synthetic */ sa a;
    public final /* synthetic */ x0 b;

    public v0(x0 x0Var, sa saVar) {
        this.b = x0Var;
        this.a = saVar;
    }

    @Override // z4.e
    public final void a(int i10) {
        x0 x0Var = this.b;
        ArrayList arrayList = x0Var.d;
        if (((kx0) arrayList.get(i10)).a == 0) {
            x0Var.N.setTitle(LocaleController.getString(R.string.DoubledLimits));
            x0Var.N.requestLayout();
        } else if (((kx0) arrayList.get(i10)).a == 14) {
            x0Var.N.setTitle(LocaleController.getString(R.string.UpgradedStories));
            x0Var.N.requestLayout();
        } else if (((kx0) arrayList.get(i10)).a == 40) {
            x0Var.N.setTitle(LocaleController.getString(R.string.FeaturePreviewGifts));
            x0Var.N.requestLayout();
        } else if (((kx0) arrayList.get(i10)).a == 28) {
            x0Var.N.setTitle(LocaleController.getString(R.string.TelegramBusiness));
            x0Var.N.requestLayout();
        }
        d();
    }

    @Override // z4.e
    public final void b(float f7, int i10, int i11) {
        sa saVar = this.a;
        saVar.b = f7;
        saVar.c = i10;
        saVar.invalidate();
        x0 x0Var = this.b;
        x0Var.G = i10;
        x0Var.H = i11 > 0 ? i10 + 1 : i10 - 1;
        x0Var.I = f7;
        d();
    }

    public final void d() {
        int i10;
        int i11;
        x0 x0Var = this.b;
        u0 u0Var = x0Var.n;
        ArrayList arrayList = x0Var.d;
        int i12 = 0;
        while (true) {
            float f7 = 0.0f;
            if (i12 >= u0Var.getChildCount()) {
                break;
            }
            w0 w0Var = (w0) u0Var.getChildAt(i12);
            if (!x0Var.w || !(w0Var.f instanceof n0)) {
                int i13 = w0Var.a;
                l0 l0Var = w0Var.e;
                if (i13 == x0Var.G) {
                    f7 = (-w0Var.getMeasuredWidth()) * x0Var.I;
                    l0Var.setOffset(f7);
                } else if (i13 == x0Var.H) {
                    f7 = ((-w0Var.getMeasuredWidth()) * x0Var.I) + w0Var.getMeasuredWidth();
                    l0Var.setOffset(f7);
                } else {
                    l0Var.setOffset(w0Var.getMeasuredWidth());
                }
            }
            if (w0Var.f instanceof n0) {
                w0Var.setTranslationX(-f7);
                w0Var.b.setTranslationX(f7);
                w0Var.c.setTranslationX(f7);
            }
            i12++;
        }
        int i14 = x0Var.G;
        boolean z10 = i14 >= 0 && i14 < arrayList.size() && ((i11 = ((kx0) arrayList.get(x0Var.G)).a) == 0 || i11 == 14 || i11 == 28);
        int i15 = x0Var.H;
        boolean z11 = i15 >= 0 && i15 < arrayList.size() && ((i10 = ((kx0) arrayList.get(x0Var.H)).a) == 0 || i10 == 14 || i10 == 28);
        if (z10 && z11) {
            x0Var.f = 1.0f;
            float f10 = x0Var.I;
            if (f10 == 0.0f) {
                f10 = 1.0f;
            }
            x0Var.e = f10;
            x0Var.h = true;
        } else if (z10) {
            float f11 = 1.0f - x0Var.I;
            x0Var.e = f11;
            x0Var.f = f11;
            x0Var.h = true;
        } else if (z11) {
            float f12 = x0Var.I;
            x0Var.e = f12;
            x0Var.f = f12;
            x0Var.h = false;
        } else {
            x0Var.e = 0.0f;
            x0Var.f = 0.0f;
            x0Var.h = true;
        }
        int i16 = (int) ((1.0f - x0Var.e) * 255.0f);
        if (i16 != x0Var.K) {
            x0Var.K = i16;
            x0Var.r.invalidate();
            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.u0(this, 27));
        }
    }

    @Override // z4.e
    public final void c(int i10) {
    }
}
