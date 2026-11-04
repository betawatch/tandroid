package qh;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import cg.t0;
import gi.d;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class a extends d implements qe.b {
    public final qe.a l0;
    public final e6 m0;
    public boolean n0;

    public a(Context context, e6 e6Var) {
        super(context, e6Var, true);
        this.l0 = new qe.a(0, this, xq.h, 320L, true);
        this.m0 = e6Var;
        f();
        setOutlineProvider(t0.b);
    }

    @Override // qe.b
    public final void Y(int i3, float f10, float f11, qe.c cVar) {
        this.n0 = true;
        e6 e6Var = this.m0;
        boolean a10 = e6Var != null ? e6Var.a() : k6.I.q();
        float f12 = this.l0.e;
        setElevation((1.0f - f12) * g0.L(1.0f));
        setColor(i0.a.f(f12, m(k6.d6), m(k6.Ci)));
        setTextColor(i0.a.f(f12, m(k6.q7), m(k6.Gi)));
        if (Build.VERSION.SDK_INT >= 28) {
            if (a10) {
                setOutlineAmbientShadowColor(553648127);
                setOutlineSpotShadowColor(553648127);
            } else {
                setOutlineAmbientShadowColor(1610612736);
                setOutlineSpotShadowColor(1610612736);
            }
        }
    }

    public final int m(int i3) {
        e6 e6Var = this.m0;
        return e6Var != null ? e6Var.h(i3) : k6.x0(null, i3, false);
    }

    @Override // gi.d, org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        super.updateColors();
        qe.a aVar = this.l0;
        if (aVar == null || !this.n0) {
            return;
        }
        try {
            float f10 = aVar.e;
            int f11 = i0.a.f(f10, m(k6.d6), m(k6.Ci));
            Drawable background = getBackground();
            if ((background instanceof ShapeDrawable) && ((ShapeDrawable) background).getPaint().getColor() != f11) {
                ((ShapeDrawable) background).getPaint().setColor(f11);
                background.invalidateSelf();
            }
            setTextColor(i0.a.f(f10, m(k6.q7), m(k6.Gi)));
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // qe.b
    public final /* synthetic */ void F(float f10, int i3) {
    }
}
