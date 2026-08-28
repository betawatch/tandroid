package r0;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import j$.util.Objects;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Cells.e3;
import org.telegram.ui.Components.su0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class q0 implements View.OnApplyWindowInsetsListener {
    public final xg.e a;
    public m1 b;

    public q0(ViewGroup viewGroup, xg.e eVar) {
        m1 m1Var;
        this.a = eVar;
        m1 f10 = j0.f(viewGroup);
        if (f10 != null) {
            int i9 = Build.VERSION.SDK_INT;
            m1Var = (i9 >= 34 ? new b1(f10) : i9 >= 30 ? new a1(f10) : i9 >= 29 ? new z0(f10) : new y0(f10)).b();
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
            a8.a i9 = r0.i(view);
            if (i9 == null || !Objects.equals((m1) i9.a, h)) {
                int[] iArr2 = new int[1];
                int[] iArr3 = new int[1];
                m1 m1Var = this.b;
                int i10 = 1;
                while (i10 <= 512) {
                    i0.b f10 = j1Var.f(i10);
                    i0.b f11 = m1Var.a.f(i10);
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
                        z10 = true;
                    } else {
                        iArr = iArr2;
                        z10 = false;
                    }
                    if (z10 != (i11 < i15 || i14 < i18 || i13 < i17 || i12 < i16)) {
                        if (z10) {
                            iArr[0] = iArr[0] | i10;
                        } else {
                            iArr3[0] = iArr3[0] | i10;
                        }
                    }
                    i10 <<= 1;
                    iArr2 = iArr;
                }
                int i19 = iArr2[0];
                int i20 = iArr3[0];
                int i21 = i19 | i20;
                if (i21 == 0) {
                    this.b = h;
                    if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                } else {
                    m1 m1Var2 = this.b;
                    w0 w0Var = new w0(i21, (i21 & 8) != 0 ? 160L : 250L, (i19 & 8) != 0 ? r0.e : (i20 & 8) != 0 ? r0.f : (i19 & 519) != 0 ? r0.g : (i20 & 519) != 0 ? r0.h : null);
                    w0Var.a.d(0.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(w0Var.a.a());
                    i0.b f12 = j1Var.f(i21);
                    i0.b f13 = m1Var2.a.f(i21);
                    int min = Math.min(f12.a, f13.a);
                    int i22 = f12.b;
                    int i23 = f13.b;
                    int min2 = Math.min(i22, i23);
                    int i24 = f12.c;
                    int i25 = f13.c;
                    int min3 = Math.min(i24, i25);
                    int i26 = f12.d;
                    int i27 = f13.d;
                    e3 e3Var = new e3(i0.b.b(min, min2, min3, Math.min(i26, i27)), i0.b.b(Math.max(f12.a, f13.a), Math.max(i22, i23), Math.max(i24, i25), Math.max(i26, i27)), false, 20);
                    r0.f(view, h, false);
                    duration.addUpdateListener(new p0(w0Var, h, m1Var2, i21, view));
                    duration.addListener(new su0(w0Var, view, 19));
                    q.a(view, new af.f(view, w0Var, e3Var, duration, false, 8));
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
