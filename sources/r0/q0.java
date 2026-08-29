package r0;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import j$.util.Objects;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.ok0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class q0 implements View.OnApplyWindowInsetsListener {
    public final ah.e a;
    public m1 b;

    public q0(ViewGroup viewGroup, ah.e eVar) {
        m1 m1Var;
        this.a = eVar;
        m1 f9 = j0.f(viewGroup);
        if (f9 != null) {
            int i10 = Build.VERSION.SDK_INT;
            m1Var = (i10 >= 34 ? new b1(f9) : i10 >= 30 ? new a1(f9) : i10 >= 29 ? new z0(f9) : new y0(f9)).b();
        } else {
            m1Var = null;
        }
        this.b = m1Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int[] iArr;
        boolean z10;
        if (!view.isLaidOut()) {
            this.b = m1.h(view, windowInsets);
            return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }
        m1 h = m1.h(view, windowInsets);
        j1 j1Var = h.a;
        if (this.b == null) {
            this.b = j0.f(view);
        }
        if (this.b == null) {
            this.b = h;
            if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        } else {
            ab.e i10 = r0.i(view);
            if (i10 == null || !Objects.equals((m1) i10.a, h)) {
                int[] iArr2 = new int[1];
                int[] iArr3 = new int[1];
                m1 m1Var = this.b;
                int i11 = 1;
                while (i11 <= 512) {
                    i0.b f9 = j1Var.f(i11);
                    i0.b f10 = m1Var.a.f(i11);
                    int i12 = f9.a;
                    int i13 = f9.d;
                    int i14 = f9.c;
                    int i15 = f9.b;
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
                    m1 m1Var2 = this.b;
                    w0 w0Var = new w0(i22, (i22 & 8) != 0 ? 160L : 250L, (i20 & 8) != 0 ? r0.e : (i21 & 8) != 0 ? r0.f : (i20 & 519) != 0 ? r0.g : (i21 & 519) != 0 ? r0.h : null);
                    w0Var.a.d(0.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(w0Var.a.a());
                    i0.b f11 = j1Var.f(i22);
                    i0.b f12 = m1Var2.a.f(i22);
                    int min = Math.min(f11.a, f12.a);
                    int i23 = f11.b;
                    int i24 = f12.b;
                    int min2 = Math.min(i23, i24);
                    int i25 = f11.c;
                    int i26 = f12.c;
                    int min3 = Math.min(i25, i26);
                    int i27 = f11.d;
                    int i28 = f12.d;
                    oc.i iVar = new oc.i(21, i0.b.b(min, min2, min3, Math.min(i27, i28)), i0.b.b(Math.max(f11.a, f12.a), Math.max(i23, i24), Math.max(i25, i26), Math.max(i27, i28)));
                    r0.f(view, h, false);
                    duration.addUpdateListener(new p0(w0Var, h, m1Var2, i22, view));
                    duration.addListener(new ok0(w0Var, view, 19));
                    q.a(view, new c2.p(view, w0Var, iVar, duration, false, 8));
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
