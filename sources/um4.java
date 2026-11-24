// default package

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class um4 extends u41 implements x74 {
    public final fm0 m0;
    public final wjb n0;
    public boolean o0;

    public um4(Context context, wjb wjbVar) {
        super(wjbVar, context, true);
        this.m0 = new fm0(0, this, s33.h, 320L, true);
        this.n0 = wjbVar;
        f();
        setOutlineProvider(zdc.b);
    }

    public final int m(int i) {
        wjb wjbVar = this.n0;
        return wjbVar != null ? wjbVar.h(i) : bkb.w0(null, i, false);
    }

    @Override // x74
    public final void p(int i, float f, float f2, y74 y74Var) {
        this.o0 = true;
        wjb wjbVar = this.n0;
        boolean a = wjbVar != null ? wjbVar.a() : bkb.I.o();
        float f3 = this.m0.e;
        setElevation((1.0f - f3) * gl.L(1.0f));
        setColor(bm2.f(f3, m(bkb.c6), m(bkb.Ei)));
        setTextColor(bm2.f(f3, m(bkb.p7), m(bkb.Ii)));
        if (Build.VERSION.SDK_INT >= 28) {
            if (a) {
                setOutlineAmbientShadowColor(553648127);
                setOutlineSpotShadowColor(553648127);
            } else {
                setOutlineAmbientShadowColor(1610612736);
                setOutlineSpotShadowColor(1610612736);
            }
        }
    }

    @Override // u41, tjb
    public final void updateColors() {
        super.updateColors();
        fm0 fm0Var = this.m0;
        if (fm0Var == null || !this.o0) {
            return;
        }
        try {
            float f = fm0Var.e;
            int f2 = bm2.f(f, m(bkb.c6), m(bkb.Ei));
            Drawable background = getBackground();
            if ((background instanceof ShapeDrawable) && ((ShapeDrawable) background).getPaint().getColor() != f2) {
                ((ShapeDrawable) background).getPaint().setColor(f2);
                background.invalidateSelf();
            }
            setTextColor(bm2.f(f, m(bkb.p7), m(bkb.Ii)));
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // x74
    public final void D(float f, int i) {
    }
}
