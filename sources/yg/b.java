package yg;

import android.content.Context;
import android.os.Build;
import jf.q0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.jr;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class b extends nh.d implements vd.b {
    public final vd.a d0;
    public final c6 e0;

    public b(Context context, c6 c6Var) {
        super(context, c6Var, true);
        this.d0 = new vd.a(0, this, jr.h, 320L, true);
        this.e0 = c6Var;
        e();
        setOutlineProvider(q0.b);
    }

    @Override // vd.b
    public final void N(int i10, float f9, float f10, vd.c cVar) {
        c6 c6Var = this.e0;
        boolean a2 = c6Var != null ? c6Var.a() : g6.I.q();
        float f11 = this.d0.e;
        setElevation((1.0f - f11) * AndroidUtilities.dp(1.0f));
        setColor(i0.a.d(f11, m(g6.d6), m(g6.Oh)));
        setTextColor(i0.a.d(f11, m(g6.q7), m(g6.Sh)));
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
        c6 c6Var = this.e0;
        return c6Var != null ? c6Var.C0(i10) : g6.w0(null, i10, false);
    }

    @Override // vd.b
    public final /* synthetic */ void z(float f9, int i10) {
    }
}
