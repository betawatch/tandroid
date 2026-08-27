package r0;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import j$.util.Objects;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.i6;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class q0 implements View.OnApplyWindowInsetsListener {
    public final yg.e a;
    public m1 b;

    public q0(ViewGroup viewGroup, yg.e eVar) {
        m1 m1Var;
        this.a = eVar;
        m1 f10 = j0.f(viewGroup);
        if (f10 != null) {
            int i10 = Build.VERSION.SDK_INT;
            m1Var = (i10 >= 34 ? new b1(f10) : i10 >= 30 ? new a1(f10) : i10 >= 29 ? new z0(f10) : new y0(f10)).b();
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
            return r0.i(view, windowInsets);
        }
        m1 h = m1.h(view, windowInsets);
        j1 j1Var = h.a;
        if (this.b == null) {
            this.b = j0.f(view);
        }
        if (this.b == null) {
            this.b = h;
            return r0.i(view, windowInsets);
        }
        b8.a j10 = r0.j(view);
        if (j10 != null && Objects.equals((m1) j10.a, h)) {
            return r0.i(view, windowInsets);
        }
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        m1 m1Var = this.b;
        int i10 = 1;
        while (i10 <= 512) {
            i0.c f10 = j1Var.f(i10);
            i0.c f11 = m1Var.a.f(i10);
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
            return r0.i(view, windowInsets);
        }
        m1 m1Var2 = this.b;
        w0 w0Var = new w0(i21, (i21 & 8) != 0 ? 160L : 250L, (i19 & 8) != 0 ? r0.e : (i20 & 8) != 0 ? r0.f : (i19 & 519) != 0 ? r0.g : (i20 & 519) != 0 ? r0.h : null);
        w0Var.a.d(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(w0Var.a.a());
        i0.c f12 = j1Var.f(i21);
        i0.c f13 = m1Var2.a.f(i21);
        int min = Math.min(f12.a, f13.a);
        int i22 = f12.b;
        int i23 = f13.b;
        int min2 = Math.min(i22, i23);
        int i24 = f12.c;
        int i25 = f13.c;
        int min3 = Math.min(i24, i25);
        int i26 = f12.d;
        int i27 = f13.d;
        i0.c b10 = i0.c.b(min, min2, min3, Math.min(i26, i27));
        i0.c b11 = i0.c.b(Math.max(f12.a, f13.a), Math.max(i22, i23), Math.max(i24, i25), Math.max(i26, i27));
        int i28 = 18;
        i6 i6Var = new i6(b10, b11, false, i28);
        r0.f(view, h, false);
        duration.addUpdateListener(new p0(w0Var, h, m1Var2, i21, view));
        duration.addListener(new fk0(w0Var, view, i28));
        q.a(view, new bf.e(view, w0Var, i6Var, duration, false, 8));
        this.b = h;
        return r0.i(view, windowInsets);
    }
}
