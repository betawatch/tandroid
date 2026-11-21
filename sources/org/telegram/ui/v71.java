package org.telegram.ui;

import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.Paint;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.os.Build;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class v71 extends org.telegram.ui.Components.dk0 {
    public final Context c;
    public final /* synthetic */ x71 d;

    public v71(Context context, x71 x71Var) {
        this.d = x71Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        return false;
    }

    @Override // v4.i0
    public final int b() {
        ArrayList arrayList = this.d.W0;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // v4.i0
    public final int d(int i7) {
        return 0;
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        BlendMode blendMode;
        org.telegram.ui.Cells.k5 k5Var = (org.telegram.ui.Cells.k5) f1Var.a;
        x71 x71Var = this.d;
        k5Var.setPattern((TLRPC.TL_wallPaper) x71Var.W0.get(i7));
        k5Var.getImageReceiver().p1 = new PorterDuffColorFilter(x71Var.l1, x71Var.u1);
        if (Build.VERSION.SDK_INT >= 29) {
            int i10 = 0;
            if (x71Var.b == 1) {
                int E0 = org.telegram.ui.ActionBar.m6.E0(org.telegram.ui.ActionBar.m6.Ge);
                long j3 = x71Var.w.l;
                int i11 = (int) j3;
                if (i11 != 0 || j3 == 0) {
                    i10 = i11 != 0 ? i11 : E0;
                }
            } else if (x71Var.D1 instanceof rc1) {
                i10 = x71Var.e1;
            }
            if (i10 == 0 || x71Var.n1 < 0.0f) {
                k5Var.getImageReceiver().Z(null);
                return;
            }
            ImageReceiver imageReceiver = x71Var.z0.getImageReceiver();
            blendMode = BlendMode.SOFT_LIGHT;
            imageReceiver.Z(blendMode);
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        int i10 = this.d.J1;
        u71 u71Var = new u71(this);
        org.telegram.ui.Cells.k5 k5Var = new org.telegram.ui.Cells.k5(this.c);
        k5Var.H = new RectF();
        int i11 = org.telegram.messenger.j10.t0;
        k5Var.K = i11;
        k5Var.setRoundRadius(org.telegram.messenger.g0.L(6.0f));
        k5Var.V = i10;
        k5Var.U = u71Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(k5Var, null);
        k5Var.I = radialProgress2;
        radialProgress2.r(org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(70.0f), org.telegram.messenger.g0.L(70.0f));
        k5Var.R = new Paint(3);
        k5Var.T = org.telegram.messenger.a6.q(i11).k();
        k5Var.setOutlineProvider(new bg.q0(8));
        k5Var.setClipToOutline(true);
        return new org.telegram.ui.Components.mj0(k5Var);
    }
}
