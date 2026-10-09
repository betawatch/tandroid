package r0;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import j$.util.Objects;
import java.util.WeakHashMap;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.Components.ul0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class p0 implements View.OnApplyWindowInsetsListener {
    public final ph.e a;
    public k1 b;

    public p0(ViewGroup viewGroup, ph.e eVar) {
        k1 k1Var;
        this.a = eVar;
        WeakHashMap weakHashMap = i0.a;
        k1 a2 = b0.a(viewGroup);
        if (a2 != null) {
            int i10 = Build.VERSION.SDK_INT;
            k1Var = (i10 >= 34 ? new z0(a2) : i10 >= 30 ? new y0(a2) : i10 >= 29 ? new x0(a2) : new w0(a2)).b();
        } else {
            k1Var = null;
        }
        this.b = k1Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int[] iArr;
        boolean z10;
        if (!view.isLaidOut()) {
            this.b = k1.h(view, windowInsets);
            return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }
        k1 h = k1.h(view, windowInsets);
        h1 h1Var = h.a;
        if (this.b == null) {
            WeakHashMap weakHashMap = i0.a;
            this.b = b0.a(view);
        }
        if (this.b == null) {
            this.b = h;
            if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        } else {
            b2.g i10 = q0.i(view);
            if (i10 == null || !Objects.equals((k1) i10.a, h)) {
                int[] iArr2 = new int[1];
                int[] iArr3 = new int[1];
                k1 k1Var = this.b;
                int i11 = 1;
                while (i11 <= 512) {
                    i0.b f7 = h1Var.f(i11);
                    i0.b f10 = k1Var.a.f(i11);
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
                boolean z11 = false;
                int i20 = iArr2[0];
                int i21 = iArr3[0];
                int i22 = i20 | i21;
                if (i22 == 0) {
                    this.b = h;
                    if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                } else {
                    k1 k1Var2 = this.b;
                    v0 v0Var = new v0(i22, (i22 & 8) != 0 ? 160L : 250L, (i20 & 8) != 0 ? q0.e : (i21 & 8) != 0 ? q0.f : (i20 & 519) != 0 ? q0.g : (i21 & 519) != 0 ? q0.h : null);
                    v0Var.a.d(0.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(v0Var.a.a());
                    i0.b f11 = h1Var.f(i22);
                    i0.b f12 = k1Var2.a.f(i22);
                    int min = Math.min(f11.a, f12.a);
                    int i23 = f11.b;
                    int i24 = f12.b;
                    int min2 = Math.min(i23, i24);
                    int i25 = f11.c;
                    int i26 = f12.c;
                    int min3 = Math.min(i25, i26);
                    int i27 = f11.d;
                    int i28 = f12.d;
                    b5 b5Var = new b5(i0.b.b(min, min2, min3, Math.min(i27, i28)), i0.b.b(Math.max(f11.a, f12.a), Math.max(i23, i24), Math.max(i25, i26), Math.max(i27, i28)), z11, 12);
                    q0.f(view, h, false);
                    duration.addUpdateListener(new o0(v0Var, h, k1Var2, i22, view));
                    duration.addListener(new ul0(v0Var, view, 20));
                    p.a(view, new com.google.android.gms.internal.cast.p(view, v0Var, b5Var, duration, 4));
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
