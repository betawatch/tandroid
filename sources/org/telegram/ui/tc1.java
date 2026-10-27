package org.telegram.ui;

import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.Paint;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.os.Build;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class tc1 extends org.telegram.ui.Components.mm0 {
    public final Context c;
    public final /* synthetic */ vc1 d;

    public tc1(Context context, vc1 vc1Var) {
        this.d = vc1Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(s4.e1 e1Var) {
        return false;
    }

    @Override // s4.h0
    public final int h() {
        ArrayList arrayList = this.d.V0;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // s4.h0
    public final int j(int i10) {
        return 0;
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        BlendMode blendMode;
        org.telegram.ui.Cells.o5 o5Var = (org.telegram.ui.Cells.o5) e1Var.a;
        vc1 vc1Var = this.d;
        o5Var.setPattern((TLRPC.TL_wallPaper) vc1Var.V0.get(i10));
        o5Var.getImageReceiver().setColorFilter(new PorterDuffColorFilter(vc1Var.k1, vc1Var.t1));
        if (Build.VERSION.SDK_INT >= 29) {
            int i11 = 0;
            if (vc1Var.b == 1) {
                int D0 = org.telegram.ui.ActionBar.y6.D0(org.telegram.ui.ActionBar.y6.Pd);
                long j10 = vc1Var.v.l;
                int i12 = (int) j10;
                if (i12 != 0 || j10 == 0) {
                    i11 = i12 != 0 ? i12 : D0;
                }
            } else if (vc1Var.C1 instanceof di1) {
                i11 = vc1Var.d1;
            }
            if (i11 == 0 || vc1Var.m1 < 0.0f) {
                o5Var.getImageReceiver().setBlendMode(null);
                return;
            }
            ImageReceiver imageReceiver = vc1Var.y0.getImageReceiver();
            blendMode = BlendMode.SOFT_LIGHT;
            imageReceiver.setBlendMode(blendMode);
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        int i11 = this.d.I1;
        sc1 sc1Var = new sc1(this);
        org.telegram.ui.Cells.o5 o5Var = new org.telegram.ui.Cells.o5(this.c);
        o5Var.G = new RectF();
        int i12 = UserConfig.selectedAccount;
        o5Var.J = i12;
        o5Var.setRoundRadius(AndroidUtilities.dp(6.0f));
        o5Var.U = i11;
        o5Var.T = sc1Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(o5Var, null);
        o5Var.H = radialProgress2;
        radialProgress2.r(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f));
        o5Var.Q = new Paint(3);
        o5Var.S = DownloadController.getInstance(i12).generateObserverTag();
        o5Var.setOutlineProvider(new ag.v0(9));
        o5Var.setClipToOutline(true);
        return new org.telegram.ui.Components.wl0(o5Var);
    }
}
