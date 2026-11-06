package r0;

import a8.pa;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import j$.util.Objects;
import java.util.WeakHashMap;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.v50;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class p0 implements View.OnApplyWindowInsetsListener {
    public final rh.d a;
    public k1 b;

    public p0(FrameLayout frameLayout, rh.d dVar) {
        k1 k1Var;
        this.a = dVar;
        WeakHashMap weakHashMap = i0.a;
        k1 a10 = b0.a(frameLayout);
        if (a10 != null) {
            int i7 = Build.VERSION.SDK_INT;
            k1Var = (i7 >= 34 ? new z0(a10) : i7 >= 30 ? new y0(a10) : i7 >= 29 ? new x0(a10) : new w0(a10)).b();
        } else {
            k1Var = null;
        }
        this.b = k1Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int[] iArr;
        boolean z9;
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
            bi.b1 i7 = q0.i(view);
            if (i7 == null || !Objects.equals((k1) i7.a, h)) {
                int[] iArr2 = new int[1];
                int[] iArr3 = new int[1];
                k1 k1Var = this.b;
                int i10 = 1;
                while (i10 <= 512) {
                    i0.b f10 = h1Var.f(i10);
                    i0.b f11 = k1Var.a.f(i10);
                    int i11 = f10.a;
                    int i12 = f10.d;
                    int i13 = f10.c;
                    int i14 = f10.b;
                    int i15 = f11.a;
                    int i16 = f11.d;
                    int i17 = f11.c;
                    int i18 = f11.b;
                    if (i11 > i15 || i14 > i18 || i13 > i17 || i12 > i16) {
                        iArr = iArr2;
                        z9 = true;
                    } else {
                        iArr = iArr2;
                        z9 = false;
                    }
                    if (z9 != (i11 < i15 || i14 < i18 || i13 < i17 || i12 < i16)) {
                        if (z9) {
                            iArr[0] = iArr[0] | i10;
                        } else {
                            iArr3[0] = iArr3[0] | i10;
                        }
                    }
                    i10 <<= 1;
                    iArr2 = iArr;
                }
                boolean z10 = false;
                int i19 = iArr2[0];
                int i20 = iArr3[0];
                int i21 = i19 | i20;
                if (i21 == 0) {
                    this.b = h;
                    if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                } else {
                    k1 k1Var2 = this.b;
                    v0 v0Var = new v0(i21, (i21 & 8) != 0 ? 160L : 250L, (i19 & 8) != 0 ? q0.e : (i20 & 8) != 0 ? q0.f : (i19 & 519) != 0 ? q0.g : (i20 & 519) != 0 ? q0.h : null);
                    v0Var.a.d(0.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(v0Var.a.a());
                    i0.b f12 = h1Var.f(i21);
                    i0.b f13 = k1Var2.a.f(i21);
                    int min = Math.min(f12.a, f13.a);
                    int i22 = f12.b;
                    int i23 = f13.b;
                    int min2 = Math.min(i22, i23);
                    int i24 = f12.c;
                    int i25 = f13.c;
                    int min3 = Math.min(i24, i25);
                    int i26 = f12.d;
                    int i27 = f13.d;
                    j2.n nVar = new j2.n(i0.b.b(min, min2, min3, Math.min(i26, i27)), i0.b.b(Math.max(f12.a, f13.a), Math.max(i22, i23), Math.max(i24, i25), Math.max(i26, i27)), z10, 28);
                    q0.f(view, h, false);
                    duration.addUpdateListener(new o0(v0Var, h, k1Var2, i21, view));
                    duration.addListener(new v50(v0Var, view, 19));
                    o.a(view, new pa(view, v0Var, nVar, duration, 4));
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
