package ph;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import bg.u0;
import hi.e;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.kr;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class a extends e implements te.b {
    public final te.a m0;
    public final i6 n0;
    public boolean o0;

    public a(Context context, i6 i6Var) {
        super(context, i6Var, true);
        this.m0 = new te.a(0, this, kr.h, 320L, true);
        this.n0 = i6Var;
        f();
        setOutlineProvider(u0.b);
    }

    @Override // te.b
    public final void K(int i7, float f10, float f11, te.c cVar) {
        this.o0 = true;
        i6 i6Var = this.n0;
        boolean b10 = i6Var != null ? i6Var.b() : n6.I.q();
        float f12 = this.m0.e;
        setElevation((1.0f - f12) * g0.L(1.0f));
        setColor(i0.a.f(f12, m(n6.d6), m(n6.Fi)));
        setTextColor(i0.a.f(f12, m(n6.q7), m(n6.Ji)));
        if (Build.VERSION.SDK_INT >= 28) {
            if (b10) {
                setOutlineAmbientShadowColor(553648127);
                setOutlineSpotShadowColor(553648127);
            } else {
                setOutlineAmbientShadowColor(1610612736);
                setOutlineSpotShadowColor(1610612736);
            }
        }
    }

    public final int m(int i7) {
        i6 i6Var = this.n0;
        return i6Var != null ? i6Var.i(i7) : n6.x0(null, i7, false);
    }

    @Override // hi.e, org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        super.updateColors();
        te.a aVar = this.m0;
        if (aVar == null || !this.o0) {
            return;
        }
        try {
            float f10 = aVar.e;
            int f11 = i0.a.f(f10, m(n6.d6), m(n6.Fi));
            Drawable background = getBackground();
            if ((background instanceof ShapeDrawable) && ((ShapeDrawable) background).getPaint().getColor() != f11) {
                ((ShapeDrawable) background).getPaint().setColor(f11);
                background.invalidateSelf();
            }
            setTextColor(i0.a.f(f10, m(n6.q7), m(n6.Ji)));
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // te.b
    public final /* synthetic */ void G(float f10, int i7) {
    }
}
