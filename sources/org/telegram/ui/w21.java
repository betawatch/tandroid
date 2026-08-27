package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class w21 extends FrameLayout {
    public int a;
    public TLRPC.TL_channels_sponsoredMessageReportResultChooseOption b;
    public TLRPC.TL_reportResultChooseOption c;
    public TLRPC.TL_reportResultAddComment d;
    public final FrameLayout e;
    public final org.telegram.ui.Components.k51 f;
    public final ag.w h;
    public u21 n;
    public FrameLayout r;
    public lh.d s;
    public final /* synthetic */ x21 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w21(x21 x21Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        org.telegram.ui.ActionBar.c6 c6Var3;
        int i10;
        org.telegram.ui.ActionBar.c6 c6Var4;
        this.v = x21Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, h7.z5.e(-1, -1, 119));
        c6Var = ((org.telegram.ui.ActionBar.e3) x21Var).resourcesProvider;
        ag.w wVar = new ag.w(context, c6Var);
        TextView textView = (TextView) wVar.d;
        this.h = wVar;
        wVar.e = new t21(this, 0);
        if (x21Var.d) {
            textView.setText(LocaleController.getString(R.string.ReportAd));
        } else if (x21Var.e) {
            textView.setText(LocaleController.getString(R.string.ReportStory));
        } else {
            textView.setText(LocaleController.getString(R.string.Report2));
        }
        org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) wVar.c;
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        c6Var2 = ((org.telegram.ui.ActionBar.e3) x21Var).resourcesProvider;
        g2Var.a(org.telegram.ui.ActionBar.g6.v0(i11, c6Var2));
        int i12 = org.telegram.ui.ActionBar.g6.h5;
        c6Var3 = ((org.telegram.ui.ActionBar.e3) x21Var).resourcesProvider;
        wVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(i12, c6Var3));
        addView(wVar, h7.z5.e(-1, -2, 55));
        i10 = ((org.telegram.ui.ActionBar.e3) x21Var).currentAccount;
        b5 b5Var = new b5(this, 19);
        dl0 dl0Var = new dl0(this, 15);
        c6Var4 = ((org.telegram.ui.ActionBar.e3) x21Var).resourcesProvider;
        org.telegram.ui.Components.k51 k51Var = new org.telegram.ui.Components.k51(context, i10, 0, true, b5Var, dl0Var, null, c6Var4);
        this.f = k51Var;
        k51Var.setClipToPadding(false);
        k51Var.T2.k1(true);
        k51Var.setOnScrollListener(new m3(this, 27));
        frameLayout.addView(k51Var, h7.z5.c(-1.0f, -1));
    }

    public final void a(int i10) {
        this.a = i10;
        this.h.b(i10 != 0);
        org.telegram.ui.Components.k51 k51Var = this.f;
        if (k51Var != null) {
            k51Var.U2.N(true);
        }
    }

    public final void b(TLRPC.TL_reportResultAddComment tL_reportResultAddComment) {
        this.b = null;
        this.c = null;
        this.d = tL_reportResultAddComment;
        this.f.U2.N(false);
        if (this.n != null) {
            AndroidUtilities.runOnUIThread(new t21(this, 1), 120L);
        }
    }
}
