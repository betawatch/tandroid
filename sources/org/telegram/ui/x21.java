package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class x21 extends FrameLayout {
    public int a;
    public TLRPC.TL_channels_sponsoredMessageReportResultChooseOption b;
    public TLRPC.TL_reportResultChooseOption c;
    public TLRPC.TL_reportResultAddComment d;
    public final FrameLayout e;
    public final org.telegram.ui.Components.u51 f;
    public final bg.u1 h;
    public v21 n;
    public FrameLayout r;
    public nh.d s;
    public final /* synthetic */ y21 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x21(y21 y21Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        org.telegram.ui.ActionBar.c6 c6Var3;
        int i10;
        org.telegram.ui.ActionBar.c6 c6Var4;
        this.v = y21Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, i7.f6.e(-1, -1, 119));
        c6Var = ((org.telegram.ui.ActionBar.f3) y21Var).resourcesProvider;
        bg.u1 u1Var = new bg.u1(context, c6Var);
        TextView textView = (TextView) u1Var.c;
        this.h = u1Var;
        u1Var.e = new u21(this, 0);
        if (y21Var.d) {
            textView.setText(LocaleController.getString(R.string.ReportAd));
        } else if (y21Var.e) {
            textView.setText(LocaleController.getString(R.string.ReportStory));
        } else {
            textView.setText(LocaleController.getString(R.string.Report2));
        }
        org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) u1Var.d;
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        c6Var2 = ((org.telegram.ui.ActionBar.f3) y21Var).resourcesProvider;
        h2Var.a(org.telegram.ui.ActionBar.g6.v0(i11, c6Var2));
        int i12 = org.telegram.ui.ActionBar.g6.h5;
        c6Var3 = ((org.telegram.ui.ActionBar.f3) y21Var).resourcesProvider;
        u1Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(i12, c6Var3));
        addView(u1Var, i7.f6.e(-1, -2, 55));
        i10 = ((org.telegram.ui.ActionBar.f3) y21Var).currentAccount;
        b5 b5Var = new b5(this, 19);
        zk0 zk0Var = new zk0(this, 15);
        c6Var4 = ((org.telegram.ui.ActionBar.f3) y21Var).resourcesProvider;
        org.telegram.ui.Components.u51 u51Var = new org.telegram.ui.Components.u51(context, i10, 0, true, b5Var, zk0Var, null, c6Var4);
        this.f = u51Var;
        u51Var.setClipToPadding(false);
        u51Var.T2.k1(true);
        u51Var.setOnScrollListener(new m3(this, 27));
        frameLayout.addView(u51Var, i7.f6.c(-1.0f, -1));
    }

    public final void a(int i10) {
        this.a = i10;
        this.h.b(i10 != 0);
        org.telegram.ui.Components.u51 u51Var = this.f;
        if (u51Var != null) {
            u51Var.U2.N(true);
        }
    }

    public final void b(TLRPC.TL_reportResultAddComment tL_reportResultAddComment) {
        this.b = null;
        this.c = null;
        this.d = tL_reportResultAddComment;
        this.f.U2.N(false);
        if (this.n != null) {
            AndroidUtilities.runOnUIThread(new u21(this, 1), 120L);
        }
    }
}
