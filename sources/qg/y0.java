package qg;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ra;
import org.telegram.ui.mx0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class y0 implements z4.e {
    public final /* synthetic */ ra a;
    public final /* synthetic */ a1 b;

    public y0(a1 a1Var, ra raVar) {
        this.b = a1Var;
        this.a = raVar;
    }

    @Override // z4.e
    public final void a(int i10) {
        a1 a1Var = this.b;
        ArrayList arrayList = a1Var.d;
        if (((mx0) arrayList.get(i10)).a == 0) {
            a1Var.N.setTitle(LocaleController.getString(R.string.DoubledLimits));
            a1Var.N.requestLayout();
        } else if (((mx0) arrayList.get(i10)).a == 14) {
            a1Var.N.setTitle(LocaleController.getString(R.string.UpgradedStories));
            a1Var.N.requestLayout();
        } else if (((mx0) arrayList.get(i10)).a == 40) {
            a1Var.N.setTitle(LocaleController.getString(R.string.FeaturePreviewGifts));
            a1Var.N.requestLayout();
        } else if (((mx0) arrayList.get(i10)).a == 28) {
            a1Var.N.setTitle(LocaleController.getString(R.string.TelegramBusiness));
            a1Var.N.requestLayout();
        }
        d();
    }

    @Override // z4.e
    public final void b(float f7, int i10, int i11) {
        ra raVar = this.a;
        raVar.b = f7;
        raVar.c = i10;
        raVar.invalidate();
        a1 a1Var = this.b;
        a1Var.G = i10;
        a1Var.H = i11 > 0 ? i10 + 1 : i10 - 1;
        a1Var.I = f7;
        d();
    }

    public final void d() {
        int i10;
        int i11;
        a1 a1Var = this.b;
        x0 x0Var = a1Var.n;
        ArrayList arrayList = a1Var.d;
        int i12 = 0;
        while (true) {
            float f7 = 0.0f;
            if (i12 >= x0Var.getChildCount()) {
                break;
            }
            z0 z0Var = (z0) x0Var.getChildAt(i12);
            if (!a1Var.w || !(z0Var.f instanceof p0)) {
                int i13 = z0Var.a;
                n0 n0Var = z0Var.e;
                if (i13 == a1Var.G) {
                    f7 = (-z0Var.getMeasuredWidth()) * a1Var.I;
                    n0Var.setOffset(f7);
                } else if (i13 == a1Var.H) {
                    f7 = ((-z0Var.getMeasuredWidth()) * a1Var.I) + z0Var.getMeasuredWidth();
                    n0Var.setOffset(f7);
                } else {
                    n0Var.setOffset(z0Var.getMeasuredWidth());
                }
            }
            if (z0Var.f instanceof p0) {
                z0Var.setTranslationX(-f7);
                z0Var.b.setTranslationX(f7);
                z0Var.c.setTranslationX(f7);
            }
            i12++;
        }
        int i14 = a1Var.G;
        boolean z10 = i14 >= 0 && i14 < arrayList.size() && ((i11 = ((mx0) arrayList.get(a1Var.G)).a) == 0 || i11 == 14 || i11 == 28);
        int i15 = a1Var.H;
        boolean z11 = i15 >= 0 && i15 < arrayList.size() && ((i10 = ((mx0) arrayList.get(a1Var.H)).a) == 0 || i10 == 14 || i10 == 28);
        if (z10 && z11) {
            a1Var.f = 1.0f;
            float f10 = a1Var.I;
            if (f10 == 0.0f) {
                f10 = 1.0f;
            }
            a1Var.e = f10;
            a1Var.h = true;
        } else if (z10) {
            float f11 = 1.0f - a1Var.I;
            a1Var.e = f11;
            a1Var.f = f11;
            a1Var.h = true;
        } else if (z11) {
            float f12 = a1Var.I;
            a1Var.e = f12;
            a1Var.f = f12;
            a1Var.h = false;
        } else {
            a1Var.e = 0.0f;
            a1Var.f = 0.0f;
            a1Var.h = true;
        }
        int i16 = (int) ((1.0f - a1Var.e) * 255.0f);
        if (i16 != a1Var.K) {
            a1Var.K = i16;
            a1Var.r.invalidate();
            AndroidUtilities.runOnUIThread(new q0(this, 1));
        }
    }

    @Override // z4.e
    public final void c(int i10) {
    }
}
