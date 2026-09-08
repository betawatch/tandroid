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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class ud1 extends org.telegram.ui.Components.kl0 {
    public final Context c;
    public final /* synthetic */ wd1 d;

    public ud1(Context context, wd1 wd1Var) {
        this.d = wd1Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override // s4.h0
    public final int h() {
        ArrayList arrayList = this.d.U0;
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
    public final void v(s4.c1 c1Var, int i10) {
        BlendMode blendMode;
        org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) c1Var.a;
        wd1 wd1Var = this.d;
        j5Var.setPattern((TLRPC.TL_wallPaper) wd1Var.U0.get(i10));
        j5Var.getImageReceiver().setColorFilter(new PorterDuffColorFilter(wd1Var.j1, wd1Var.s1));
        if (Build.VERSION.SDK_INT >= 29) {
            int i11 = 0;
            if (wd1Var.b == 1) {
                int B0 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Pd);
                long j3 = wd1Var.s.l;
                int i12 = (int) j3;
                if (i12 != 0 || j3 == 0) {
                    i11 = i12 != 0 ? i12 : B0;
                }
            } else if (wd1Var.B1 instanceof gj1) {
                i11 = wd1Var.c1;
            }
            if (i11 == 0 || wd1Var.l1 < 0.0f) {
                j5Var.getImageReceiver().setBlendMode(null);
                return;
            }
            ImageReceiver imageReceiver = wd1Var.x0.getImageReceiver();
            blendMode = BlendMode.SOFT_LIGHT;
            imageReceiver.setBlendMode(blendMode);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        int i11 = this.d.H1;
        td1 td1Var = new td1(this);
        org.telegram.ui.Cells.j5 j5Var = new org.telegram.ui.Cells.j5(this.c);
        j5Var.G = new RectF();
        int i12 = UserConfig.selectedAccount;
        j5Var.J = i12;
        j5Var.setRoundRadius(AndroidUtilities.dp(6.0f));
        j5Var.U = i11;
        j5Var.T = td1Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(j5Var, null);
        j5Var.H = radialProgress2;
        radialProgress2.q(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f));
        j5Var.Q = new Paint(3);
        j5Var.S = DownloadController.getInstance(i12).generateObserverTag();
        j5Var.setOutlineProvider(new bi.z1(7));
        j5Var.setClipToOutline(true);
        return new org.telegram.ui.Components.vk0(j5Var);
    }
}
