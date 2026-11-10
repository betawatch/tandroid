package ph;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import bg.u0;
import fi.d;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.wq;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class a extends d implements te.b {
    public final te.a k0;
    public final h6 l0;
    public boolean m0;

    public a(Context context, h6 h6Var) {
        super(context, h6Var, true);
        this.k0 = new te.a(0, this, wq.h, 320L, true);
        this.l0 = h6Var;
        f();
        setOutlineProvider(u0.b);
    }

    @Override // te.b
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        this.m0 = true;
        h6 h6Var = this.l0;
        boolean a10 = h6Var != null ? h6Var.a() : m6.I.q();
        float f12 = this.k0.e;
        setElevation((1.0f - f12) * g0.L(1.0f));
        setColor(i0.a.f(f12, m(m6.d6), m(m6.Ci)));
        setTextColor(i0.a.f(f12, m(m6.q7), m(m6.Gi)));
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
        h6 h6Var = this.l0;
        return h6Var != null ? h6Var.h(i7) : m6.x0(null, i7, false);
    }

    @Override // fi.d, org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        super.updateColors();
        te.a aVar = this.k0;
        if (aVar == null || !this.m0) {
            return;
        }
        try {
            float f10 = aVar.e;
            int f11 = i0.a.f(f10, m(m6.d6), m(m6.Ci));
            Drawable background = getBackground();
            if ((background instanceof ShapeDrawable) && ((ShapeDrawable) background).getPaint().getColor() != f11) {
                ((ShapeDrawable) background).getPaint().setColor(f11);
                background.invalidateSelf();
            }
            setTextColor(i0.a.f(f10, m(m6.q7), m(m6.Gi)));
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // te.b
    public final /* synthetic */ void F(float f10, int i7) {
    }
}
