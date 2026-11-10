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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class v71 extends org.telegram.ui.Components.oj0 {
    public final Context c;
    public final /* synthetic */ x71 d;

    public v71(Context context, x71 x71Var) {
        this.d = x71Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        return false;
    }

    @Override // v4.g0
    public final int b() {
        ArrayList arrayList = this.d.V0;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // v4.g0
    public final int d(int i7) {
        return 0;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        BlendMode blendMode;
        org.telegram.ui.Cells.i5 i5Var = (org.telegram.ui.Cells.i5) d1Var.a;
        x71 x71Var = this.d;
        i5Var.setPattern((TLRPC.TL_wallPaper) x71Var.V0.get(i7));
        i5Var.getImageReceiver().o1 = new PorterDuffColorFilter(x71Var.k1, x71Var.t1);
        if (Build.VERSION.SDK_INT >= 29) {
            int i10 = 0;
            if (x71Var.b == 1) {
                int E0 = org.telegram.ui.ActionBar.m6.E0(org.telegram.ui.ActionBar.m6.De);
                long j3 = x71Var.w.l;
                int i11 = (int) j3;
                if (i11 != 0 || j3 == 0) {
                    i10 = i11 != 0 ? i11 : E0;
                }
            } else if (x71Var.C1 instanceof tc1) {
                i10 = x71Var.d1;
            }
            if (i10 == 0 || x71Var.m1 < 0.0f) {
                i5Var.getImageReceiver().Z(null);
                return;
            }
            ImageReceiver imageReceiver = x71Var.y0.getImageReceiver();
            blendMode = BlendMode.SOFT_LIGHT;
            imageReceiver.Z(blendMode);
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        int i10 = this.d.I1;
        u71 u71Var = new u71(this);
        org.telegram.ui.Cells.i5 i5Var = new org.telegram.ui.Cells.i5(this.c);
        i5Var.G = new RectF();
        int i11 = org.telegram.messenger.p10.s0;
        i5Var.J = i11;
        i5Var.setRoundRadius(org.telegram.messenger.g0.L(6.0f));
        i5Var.U = i10;
        i5Var.T = u71Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(i5Var, null);
        i5Var.H = radialProgress2;
        radialProgress2.r(org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(70.0f), org.telegram.messenger.g0.L(70.0f));
        i5Var.Q = new Paint(3);
        i5Var.S = org.telegram.messenger.z5.q(i11).k();
        i5Var.setOutlineProvider(new bg.q0(8));
        i5Var.setClipToOutline(true);
        return new org.telegram.ui.Components.xi0(i5Var);
    }
}
