package tg;

import android.content.Context;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.cb0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class j1 extends ci.d {
    public final /* synthetic */ m1 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(m1 m1Var, Context context, f6 f6Var) {
        super(context, f6Var, true);
        this.h0 = m1Var;
    }

    @Override // ci.d
    public final float a(float f7, float f10) {
        m1 m1Var = this.h0;
        boolean z10 = m1Var.t0 == 0.0f;
        m1Var.t0 = f7;
        if (z10) {
            m1Var.u0 = new cb0(m1Var, 2);
            m1Var.g0(false);
        }
        return f7;
    }
}
