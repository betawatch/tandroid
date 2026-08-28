package zf;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ka;
import org.telegram.ui.gw0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class v0 implements m2.e {
    public final /* synthetic */ ka a;
    public final /* synthetic */ x0 b;

    public v0(x0 x0Var, ka kaVar) {
        this.b = x0Var;
        this.a = kaVar;
    }

    public final void a() {
        int i9;
        int i10;
        x0 x0Var = this.b;
        u0 u0Var = x0Var.n;
        ArrayList arrayList = x0Var.d;
        int i11 = 0;
        while (true) {
            float f10 = 0.0f;
            if (i11 >= u0Var.getChildCount()) {
                break;
            }
            w0 w0Var = (w0) u0Var.getChildAt(i11);
            if (!x0Var.w || !(w0Var.f instanceof n0)) {
                int i12 = w0Var.a;
                l0 l0Var = w0Var.e;
                if (i12 == x0Var.C) {
                    f10 = (-w0Var.getMeasuredWidth()) * x0Var.E;
                    l0Var.setOffset(f10);
                } else if (i12 == x0Var.D) {
                    f10 = ((-w0Var.getMeasuredWidth()) * x0Var.E) + w0Var.getMeasuredWidth();
                    l0Var.setOffset(f10);
                } else {
                    l0Var.setOffset(w0Var.getMeasuredWidth());
                }
            }
            if (w0Var.f instanceof n0) {
                w0Var.setTranslationX(-f10);
                w0Var.b.setTranslationX(f10);
                w0Var.c.setTranslationX(f10);
            }
            i11++;
        }
        int i13 = x0Var.C;
        boolean z10 = i13 >= 0 && i13 < arrayList.size() && ((i10 = ((gw0) arrayList.get(x0Var.C)).a) == 0 || i10 == 14 || i10 == 28);
        int i14 = x0Var.D;
        boolean z11 = i14 >= 0 && i14 < arrayList.size() && ((i9 = ((gw0) arrayList.get(x0Var.D)).a) == 0 || i9 == 14 || i9 == 28);
        if (z10 && z11) {
            x0Var.f = 1.0f;
            float f11 = x0Var.E;
            if (f11 == 0.0f) {
                f11 = 1.0f;
            }
            x0Var.e = f11;
            x0Var.h = true;
        } else if (z10) {
            float f12 = 1.0f - x0Var.E;
            x0Var.e = f12;
            x0Var.f = f12;
            x0Var.h = true;
        } else if (z11) {
            float f13 = x0Var.E;
            x0Var.e = f13;
            x0Var.f = f13;
            x0Var.h = false;
        } else {
            x0Var.e = 0.0f;
            x0Var.f = 0.0f;
            x0Var.h = true;
        }
        int i15 = (int) ((1.0f - x0Var.e) * 255.0f);
        if (i15 != x0Var.G) {
            x0Var.G = i15;
            x0Var.r.invalidate();
            AndroidUtilities.runOnUIThread(new pf.o1(this, 28));
        }
    }

    @Override // m2.e
    public final void b(int i9) {
        x0 x0Var = this.b;
        ArrayList arrayList = x0Var.d;
        if (((gw0) arrayList.get(i9)).a == 0) {
            x0Var.J.setTitle(LocaleController.getString(R.string.DoubledLimits));
            x0Var.J.requestLayout();
        } else if (((gw0) arrayList.get(i9)).a == 14) {
            x0Var.J.setTitle(LocaleController.getString(R.string.UpgradedStories));
            x0Var.J.requestLayout();
        } else if (((gw0) arrayList.get(i9)).a == 40) {
            x0Var.J.setTitle(LocaleController.getString(R.string.FeaturePreviewGifts));
            x0Var.J.requestLayout();
        } else if (((gw0) arrayList.get(i9)).a == 28) {
            x0Var.J.setTitle(LocaleController.getString(R.string.TelegramBusiness));
            x0Var.J.requestLayout();
        }
        a();
    }

    @Override // m2.e
    public final void c(float f10, int i9, int i10) {
        ka kaVar = this.a;
        kaVar.b = f10;
        kaVar.c = i9;
        kaVar.invalidate();
        x0 x0Var = this.b;
        x0Var.C = i9;
        x0Var.D = i10 > 0 ? i9 + 1 : i9 - 1;
        x0Var.E = f10;
        a();
    }

    @Override // m2.e
    public final void d(int i9) {
    }
}
