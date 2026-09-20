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

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class vd1 extends org.telegram.ui.Components.ul0 {
    public final Context c;
    public final /* synthetic */ xd1 d;

    public vd1(Context context, xd1 xd1Var) {
        this.d = xd1Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.ul0
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
        org.telegram.ui.Cells.l5 l5Var = (org.telegram.ui.Cells.l5) c1Var.a;
        xd1 xd1Var = this.d;
        l5Var.setPattern((TLRPC.TL_wallPaper) xd1Var.U0.get(i10));
        l5Var.getImageReceiver().setColorFilter(new PorterDuffColorFilter(xd1Var.j1, xd1Var.s1));
        if (Build.VERSION.SDK_INT >= 29) {
            int i11 = 0;
            if (xd1Var.b == 1) {
                int B0 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Pd);
                long j3 = xd1Var.s.l;
                int i12 = (int) j3;
                if (i12 != 0 || j3 == 0) {
                    i11 = i12 != 0 ? i12 : B0;
                }
            } else if (xd1Var.B1 instanceof fj1) {
                i11 = xd1Var.c1;
            }
            if (i11 == 0 || xd1Var.l1 < 0.0f) {
                l5Var.getImageReceiver().setBlendMode(null);
                return;
            }
            ImageReceiver imageReceiver = xd1Var.x0.getImageReceiver();
            blendMode = BlendMode.SOFT_LIGHT;
            imageReceiver.setBlendMode(blendMode);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        int i11 = this.d.H1;
        ud1 ud1Var = new ud1(this);
        org.telegram.ui.Cells.l5 l5Var = new org.telegram.ui.Cells.l5(this.c);
        l5Var.G = new RectF();
        int i12 = UserConfig.selectedAccount;
        l5Var.J = i12;
        l5Var.setRoundRadius(AndroidUtilities.dp(6.0f));
        l5Var.U = i11;
        l5Var.T = ud1Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(l5Var, null);
        l5Var.H = radialProgress2;
        radialProgress2.q(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f));
        l5Var.Q = new Paint(3);
        l5Var.S = DownloadController.getInstance(i12).generateObserverTag();
        l5Var.setOutlineProvider(new ai.k2(7));
        l5Var.setClipToOutline(true);
        return new org.telegram.ui.Components.fl0(l5Var);
    }
}
