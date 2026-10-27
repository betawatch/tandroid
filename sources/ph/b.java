package ph;

import ag.z0;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import oe.e;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ds;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class b extends fi.d implements oe.d {
    public final oe.b k0;
    public final u6 l0;
    public boolean m0;

    public b(Context context, u6 u6Var) {
        super(context, u6Var, true);
        this.k0 = new oe.b(0, this, ds.h, 320L, true);
        this.l0 = u6Var;
        f();
        setOutlineProvider(z0.b);
    }

    @Override // oe.d
    public final void E(int i10, float f7, float f10, e eVar) {
        this.m0 = true;
        u6 u6Var = this.l0;
        boolean a2 = u6Var != null ? u6Var.a() : y6.I.q();
        float f11 = this.k0.e;
        setElevation((1.0f - f11) * AndroidUtilities.dp(1.0f));
        setColor(i0.a.f(f11, m(y6.d6), m(y6.Oh)));
        setTextColor(i0.a.f(f11, m(y6.q7), m(y6.Sh)));
        if (Build.VERSION.SDK_INT >= 28) {
            if (a2) {
                setOutlineAmbientShadowColor(553648127);
                setOutlineSpotShadowColor(553648127);
            } else {
                setOutlineAmbientShadowColor(1610612736);
                setOutlineSpotShadowColor(1610612736);
            }
        }
    }

    public final int m(int i10) {
        u6 u6Var = this.l0;
        return u6Var != null ? u6Var.g(i10) : y6.x0(null, i10, false);
    }

    @Override // fi.d, org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        super.updateColors();
        oe.b bVar = this.k0;
        if (bVar == null || !this.m0) {
            return;
        }
        try {
            float f7 = bVar.e;
            int f10 = i0.a.f(f7, m(y6.d6), m(y6.Oh));
            Drawable background = getBackground();
            if ((background instanceof ShapeDrawable) && ((ShapeDrawable) background).getPaint().getColor() != f10) {
                ((ShapeDrawable) background).getPaint().setColor(f10);
                background.invalidateSelf();
            }
            setTextColor(i0.a.f(f7, m(y6.q7), m(y6.Sh)));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // oe.d
    public final /* synthetic */ void z(float f7, int i10) {
    }
}
