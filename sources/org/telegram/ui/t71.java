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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class t71 extends org.telegram.ui.Components.dk0 {
    public final Context c;
    public final /* synthetic */ v71 d;

    public t71(Context context, v71 v71Var) {
        this.d = v71Var;
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
        org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) f1Var.a;
        v71 v71Var = this.d;
        j5Var.setPattern((TLRPC.TL_wallPaper) v71Var.W0.get(i7));
        j5Var.getImageReceiver().p1 = new PorterDuffColorFilter(v71Var.l1, v71Var.u1);
        if (Build.VERSION.SDK_INT >= 29) {
            int i10 = 0;
            if (v71Var.b == 1) {
                int E0 = org.telegram.ui.ActionBar.n6.E0(org.telegram.ui.ActionBar.n6.Ge);
                long j3 = v71Var.w.l;
                int i11 = (int) j3;
                if (i11 != 0 || j3 == 0) {
                    i10 = i11 != 0 ? i11 : E0;
                }
            } else if (v71Var.D1 instanceof pc1) {
                i10 = v71Var.e1;
            }
            if (i10 == 0 || v71Var.n1 < 0.0f) {
                j5Var.getImageReceiver().a0(null);
                return;
            }
            ImageReceiver imageReceiver = v71Var.z0.getImageReceiver();
            blendMode = BlendMode.SOFT_LIGHT;
            imageReceiver.a0(blendMode);
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        int i10 = this.d.J1;
        s71 s71Var = new s71(this);
        org.telegram.ui.Cells.j5 j5Var = new org.telegram.ui.Cells.j5(this.c);
        j5Var.H = new RectF();
        int i11 = org.telegram.messenger.i10.t0;
        j5Var.K = i11;
        j5Var.setRoundRadius(org.telegram.messenger.g0.L(6.0f));
        j5Var.V = i10;
        j5Var.U = s71Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(j5Var, null);
        j5Var.I = radialProgress2;
        radialProgress2.r(org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(70.0f), org.telegram.messenger.g0.L(70.0f));
        j5Var.R = new Paint(3);
        j5Var.T = org.telegram.messenger.a6.q(i11).k();
        j5Var.setOutlineProvider(new bg.q0(8));
        j5Var.setClipToOutline(true);
        return new org.telegram.ui.Components.mj0(j5Var);
    }
}
