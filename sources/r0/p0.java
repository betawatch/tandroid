package r0;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import j$.util.Objects;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.vv0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class p0 implements View.OnApplyWindowInsetsListener {
    public final oh.e a;
    public l1 b;

    public p0(ViewGroup viewGroup, oh.e eVar) {
        l1 l1Var;
        this.a = eVar;
        l1 f7 = i0.f(viewGroup);
        if (f7 != null) {
            int i10 = Build.VERSION.SDK_INT;
            l1Var = (i10 >= 34 ? new a1(f7) : i10 >= 30 ? new z0(f7) : i10 >= 29 ? new y0(f7) : new x0(f7)).b();
        } else {
            l1Var = null;
        }
        this.b = l1Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int[] iArr;
        boolean z10;
        if (!view.isLaidOut()) {
            this.b = l1.h(view, windowInsets);
            return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }
        l1 h = l1.h(view, windowInsets);
        i1 i1Var = h.a;
        if (this.b == null) {
            this.b = i0.f(view);
        }
        if (this.b == null) {
            this.b = h;
            if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        } else {
            b2.g i10 = q0.i(view);
            if (i10 == null || !Objects.equals((l1) i10.a, h)) {
                int[] iArr2 = new int[1];
                int[] iArr3 = new int[1];
                l1 l1Var = this.b;
                int i11 = 1;
                while (i11 <= 512) {
                    i0.c f7 = i1Var.f(i11);
                    i0.c f10 = l1Var.a.f(i11);
                    int i12 = f7.a;
                    int i13 = f7.d;
                    int i14 = f7.c;
                    int i15 = f7.b;
                    int i16 = f10.a;
                    int i17 = f10.d;
                    int i18 = f10.c;
                    int i19 = f10.b;
                    if (i12 > i16 || i15 > i19 || i14 > i18 || i13 > i17) {
                        iArr = iArr2;
                        z10 = true;
                    } else {
                        iArr = iArr2;
                        z10 = false;
                    }
                    if (z10 != (i12 < i16 || i15 < i19 || i14 < i18 || i13 < i17)) {
                        if (z10) {
                            iArr[0] = iArr[0] | i11;
                        } else {
                            iArr3[0] = iArr3[0] | i11;
                        }
                    }
                    i11 <<= 1;
                    iArr2 = iArr;
                }
                int i20 = iArr2[0];
                int i21 = iArr3[0];
                int i22 = i20 | i21;
                if (i22 == 0) {
                    this.b = h;
                    if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                } else {
                    l1 l1Var2 = this.b;
                    v0 v0Var = new v0(i22, (i22 & 8) != 0 ? 160L : 250L, (i20 & 8) != 0 ? q0.e : (i21 & 8) != 0 ? q0.f : (i20 & 519) != 0 ? q0.g : (i21 & 519) != 0 ? q0.h : null);
                    v0Var.a.d(0.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(v0Var.a.a());
                    i0.c f11 = i1Var.f(i22);
                    i0.c f12 = l1Var2.a.f(i22);
                    int min = Math.min(f11.a, f12.a);
                    int i23 = f11.b;
                    int i24 = f12.b;
                    int min2 = Math.min(i23, i24);
                    int i25 = f11.c;
                    int i26 = f12.c;
                    int min3 = Math.min(i25, i26);
                    int i27 = f11.d;
                    int i28 = f12.d;
                    og.u0 u0Var = new og.u0(12, i0.c.b(min, min2, min3, Math.min(i27, i28)), i0.c.b(Math.max(f11.a, f12.a), Math.max(i23, i24), Math.max(i25, i26), Math.max(i27, i28)));
                    q0.f(view, h, false);
                    duration.addUpdateListener(new o0(v0Var, h, l1Var2, i22, view));
                    duration.addListener(new vv0(19, view, (Object) v0Var));
                    p.a(view, new com.google.android.gms.internal.cast.p(view, v0Var, u0Var, duration, 4));
                    this.b = h;
                    if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                }
            } else if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        }
        return windowInsets;
    }
}
