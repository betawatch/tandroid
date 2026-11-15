package ph;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import bg.t0;
import hi.d;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.er;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class a extends d implements te.b {
    public final te.a l0;
    public final e6 m0;
    public boolean n0;

    public a(Context context, e6 e6Var) {
        super(context, e6Var, true);
        this.l0 = new te.a(0, this, er.h, 320L, true);
        this.m0 = e6Var;
        f();
        setOutlineProvider(t0.b);
    }

    @Override // te.b
    public final void G(int i7, float f10, float f11, te.c cVar) {
        this.n0 = true;
        e6 e6Var = this.m0;
        boolean a10 = e6Var != null ? e6Var.a() : j6.I.q();
        float f12 = this.l0.e;
        setElevation((1.0f - f12) * g0.L(1.0f));
        setColor(i0.a.f(f12, m(j6.d6), m(j6.Fi)));
        setTextColor(i0.a.f(f12, m(j6.q7), m(j6.Ji)));
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
        e6 e6Var = this.m0;
        return e6Var != null ? e6Var.h(i7) : j6.x0(null, i7, false);
    }

    @Override // hi.d, org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        super.updateColors();
        te.a aVar = this.l0;
        if (aVar == null || !this.n0) {
            return;
        }
        try {
            float f10 = aVar.e;
            int f11 = i0.a.f(f10, m(j6.d6), m(j6.Fi));
            Drawable background = getBackground();
            if ((background instanceof ShapeDrawable) && ((ShapeDrawable) background).getPaint().getColor() != f11) {
                ((ShapeDrawable) background).getPaint().setColor(f11);
                background.invalidateSelf();
            }
            setTextColor(i0.a.f(f10, m(j6.q7), m(j6.Ji)));
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // te.b
    public final /* synthetic */ void E(float f10, int i7) {
    }
}
