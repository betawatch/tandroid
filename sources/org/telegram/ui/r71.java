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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class r71 extends org.telegram.ui.Components.tj0 {
    public final Context c;
    public final /* synthetic */ t71 d;

    public r71(Context context, t71 t71Var) {
        this.d = t71Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        return false;
    }

    @Override // v4.h0
    public final int b() {
        ArrayList arrayList = this.d.W0;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // v4.h0
    public final int d(int i7) {
        return 0;
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        BlendMode blendMode;
        org.telegram.ui.Cells.i5 i5Var = (org.telegram.ui.Cells.i5) e1Var.a;
        t71 t71Var = this.d;
        i5Var.setPattern((TLRPC.TL_wallPaper) t71Var.W0.get(i7));
        i5Var.getImageReceiver().p1 = new PorterDuffColorFilter(t71Var.l1, t71Var.u1);
        if (Build.VERSION.SDK_INT >= 29) {
            int i10 = 0;
            if (t71Var.b == 1) {
                int E0 = org.telegram.ui.ActionBar.j6.E0(org.telegram.ui.ActionBar.j6.Ge);
                long j3 = t71Var.w.l;
                int i11 = (int) j3;
                if (i11 != 0 || j3 == 0) {
                    i10 = i11 != 0 ? i11 : E0;
                }
            } else if (t71Var.D1 instanceof oc1) {
                i10 = t71Var.e1;
            }
            if (i10 == 0 || t71Var.n1 < 0.0f) {
                i5Var.getImageReceiver().Z(null);
                return;
            }
            ImageReceiver imageReceiver = t71Var.z0.getImageReceiver();
            blendMode = BlendMode.SOFT_LIGHT;
            imageReceiver.Z(blendMode);
        }
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        int i10 = this.d.J1;
        q71 q71Var = new q71(this);
        org.telegram.ui.Cells.i5 i5Var = new org.telegram.ui.Cells.i5(this.c);
        i5Var.H = new RectF();
        int i11 = org.telegram.messenger.m10.t0;
        i5Var.K = i11;
        i5Var.setRoundRadius(org.telegram.messenger.g0.L(6.0f));
        i5Var.V = i10;
        i5Var.U = q71Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(i5Var, null);
        i5Var.I = radialProgress2;
        radialProgress2.r(org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(70.0f), org.telegram.messenger.g0.L(70.0f));
        i5Var.R = new Paint(3);
        i5Var.T = org.telegram.messenger.z5.q(i11).k();
        i5Var.setOutlineProvider(new bg.p0(8));
        i5Var.setClipToOutline(true);
        return new org.telegram.ui.Components.cj0(i5Var);
    }
}
