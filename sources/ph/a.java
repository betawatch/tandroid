package ph;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import bg.u0;
import fi.d;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class a extends d implements te.b {
    public final te.a k0;
    public final f6 l0;
    public boolean m0;

    public a(Context context, f6 f6Var) {
        super(context, f6Var, true);
        this.k0 = new te.a(0, this, xq.h, 320L, true);
        this.l0 = f6Var;
        f();
        setOutlineProvider(u0.b);
    }

    @Override // te.b
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        this.m0 = true;
        f6 f6Var = this.l0;
        boolean a10 = f6Var != null ? f6Var.a() : k6.I.q();
        float f12 = this.k0.e;
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

    public final int m(int i7) {
        f6 f6Var = this.l0;
        return f6Var != null ? f6Var.h(i7) : k6.x0(null, i7, false);
    }

    @Override // fi.d, org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        super.updateColors();
        te.a aVar = this.k0;
        if (aVar == null || !this.m0) {
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

    @Override // te.b
    public final /* synthetic */ void F(float f10, int i7) {
    }
}
