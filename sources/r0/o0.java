package r0;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import j$.util.Objects;
import java.util.WeakHashMap;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.iw0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class o0 implements View.OnApplyWindowInsetsListener {
    public final hh.e a;
    public j1 b;

    public o0(FrameLayout frameLayout, hh.e eVar) {
        j1 j1Var;
        this.a = eVar;
        WeakHashMap weakHashMap = h0.a;
        j1 a2 = a0.a(frameLayout);
        if (a2 != null) {
            int i10 = Build.VERSION.SDK_INT;
            j1Var = (i10 >= 34 ? new y0(a2) : i10 >= 30 ? new x0(a2) : i10 >= 29 ? new w0(a2) : new v0(a2)).b();
        } else {
            j1Var = null;
        }
        this.b = j1Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int[] iArr;
        boolean z10;
        if (!view.isLaidOut()) {
            this.b = j1.h(view, windowInsets);
            return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }
        j1 h = j1.h(view, windowInsets);
        g1 g1Var = h.a;
        if (this.b == null) {
            WeakHashMap weakHashMap = h0.a;
            this.b = a0.a(view);
        }
        if (this.b == null) {
            this.b = h;
            if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        } else {
            b2.h i10 = p0.i(view);
            if (i10 == null || !Objects.equals((j1) i10.a, h)) {
                int[] iArr2 = new int[1];
                int[] iArr3 = new int[1];
                j1 j1Var = this.b;
                int i11 = 1;
                while (i11 <= 512) {
                    i0.c f7 = g1Var.f(i11);
                    i0.c f10 = j1Var.a.f(i11);
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
                    j1 j1Var2 = this.b;
                    u0 u0Var = new u0(i22, (i22 & 8) != 0 ? 160L : 250L, (i20 & 8) != 0 ? p0.e : (i21 & 8) != 0 ? p0.f : (i20 & 519) != 0 ? p0.g : (i21 & 519) != 0 ? p0.h : null);
                    u0Var.a.d(0.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(u0Var.a.a());
                    i0.c f11 = g1Var.f(i22);
                    i0.c f12 = j1Var2.a.f(i22);
                    int min = Math.min(f11.a, f12.a);
                    int i23 = f11.b;
                    int i24 = f12.b;
                    int min2 = Math.min(i23, i24);
                    int i25 = f11.c;
                    int i26 = f12.c;
                    int min3 = Math.min(i25, i26);
                    int i27 = f11.d;
                    int i28 = f12.d;
                    m5.e eVar = new m5.e(20, i0.c.b(min, min2, min3, Math.min(i27, i28)), i0.c.b(Math.max(f11.a, f12.a), Math.max(i23, i24), Math.max(i25, i26), Math.max(i27, i28)));
                    p0.f(view, h, false);
                    duration.addUpdateListener(new n0(u0Var, h, j1Var2, i22, view));
                    duration.addListener(new iw0(15, view, (Object) u0Var));
                    o.a(view, new com.google.android.gms.internal.cast.o(view, u0Var, eVar, duration, 5));
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
