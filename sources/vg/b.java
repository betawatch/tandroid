package vg;

import android.content.Context;
import android.os.Build;
import ff.r0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class b extends kh.d implements td.b {
    public final td.a d0;
    public final b6 e0;

    public b(Context context, b6 b6Var) {
        super(context, b6Var, true);
        this.d0 = new td.a(0, this, gr.h, 320L, true);
        this.e0 = b6Var;
        e();
        setOutlineProvider(r0.b);
    }

    @Override // td.b
    public final void J0(int i9, float f10, float f11, td.c cVar) {
        b6 b6Var = this.e0;
        boolean a2 = b6Var != null ? b6Var.a() : f6.I.q();
        float f12 = this.d0.e;
        setElevation((1.0f - f12) * AndroidUtilities.dp(1.0f));
        setColor(i0.a.d(f12, m(f6.d6), m(f6.Oh)));
        setTextColor(i0.a.d(f12, m(f6.q7), m(f6.Sh)));
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

    public final int m(int i9) {
        b6 b6Var = this.e0;
        return b6Var != null ? b6Var.N0(i9) : f6.w0(null, i9, false);
    }

    @Override // td.b
    public final /* synthetic */ void B(float f10, int i9) {
    }
}
