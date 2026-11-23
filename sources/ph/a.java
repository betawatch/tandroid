package ph;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import bg.u0;
import hi.e;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.nr;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class a extends e implements te.b {
    public final te.a m0;
    public final h6 n0;
    public boolean o0;

    public a(Context context, h6 h6Var) {
        super(context, h6Var, true);
        this.m0 = new te.a(0, this, nr.h, 320L, true);
        this.n0 = h6Var;
        f();
        setOutlineProvider(u0.b);
    }

    @Override // te.b
    public final void H(int i7, float f10, float f11, te.c cVar) {
        this.o0 = true;
        h6 h6Var = this.n0;
        boolean d = h6Var != null ? h6Var.d() : m6.I.q();
        float f12 = this.m0.e;
        setElevation((1.0f - f12) * g0.L(1.0f));
        setColor(i0.a.f(f12, m(m6.d6), m(m6.Fi)));
        setTextColor(i0.a.f(f12, m(m6.q7), m(m6.Ji)));
        if (Build.VERSION.SDK_INT >= 28) {
            if (d) {
                setOutlineAmbientShadowColor(553648127);
                setOutlineSpotShadowColor(553648127);
            } else {
                setOutlineAmbientShadowColor(1610612736);
                setOutlineSpotShadowColor(1610612736);
            }
        }
    }

    public final int m(int i7) {
        h6 h6Var = this.n0;
        return h6Var != null ? h6Var.k(i7) : m6.x0(null, i7, false);
    }

    @Override // hi.e, org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        super.updateColors();
        te.a aVar = this.m0;
        if (aVar == null || !this.o0) {
            return;
        }
        try {
            float f10 = aVar.e;
            int f11 = i0.a.f(f10, m(m6.d6), m(m6.Fi));
            Drawable background = getBackground();
            if ((background instanceof ShapeDrawable) && ((ShapeDrawable) background).getPaint().getColor() != f11) {
                ((ShapeDrawable) background).getPaint().setColor(f11);
                background.invalidateSelf();
            }
            setTextColor(i0.a.f(f10, m(m6.q7), m(m6.Ji)));
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // te.b
    public final /* synthetic */ void D(float f10, int i7) {
    }
}
