package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class u31 extends FrameLayout {
    public int a;
    public TLRPC.TL_channels_sponsoredMessageReportResultChooseOption b;
    public TLRPC.TL_reportResultChooseOption c;
    public TLRPC.TL_reportResultAddComment d;
    public final FrameLayout e;
    public final org.telegram.ui.Components.c71 f;
    public final u5 h;
    public t31 n;
    public FrameLayout r;
    public ci.d s;
    public final /* synthetic */ v31 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u31(v31 v31Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        org.telegram.ui.ActionBar.d6 d6Var3;
        int i10;
        org.telegram.ui.ActionBar.d6 d6Var4;
        this.v = v31Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, w7.z5.e(-1, -1, 119));
        d6Var = ((org.telegram.ui.ActionBar.f3) v31Var).resourcesProvider;
        u5 u5Var = new u5(context, d6Var);
        TextView textView = (TextView) u5Var.d;
        this.h = u5Var;
        u5Var.e = new s31(this, 0);
        if (v31Var.d) {
            textView.setText(LocaleController.getString(R.string.ReportAd));
        } else if (v31Var.e) {
            textView.setText(LocaleController.getString(R.string.ReportStory));
        } else {
            textView.setText(LocaleController.getString(R.string.Report2));
        }
        org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) u5Var.b;
        int i11 = org.telegram.ui.ActionBar.i6.G6;
        d6Var2 = ((org.telegram.ui.ActionBar.f3) v31Var).resourcesProvider;
        g2Var.a(org.telegram.ui.ActionBar.i6.v0(i11, d6Var2));
        int i12 = org.telegram.ui.ActionBar.i6.h5;
        d6Var3 = ((org.telegram.ui.ActionBar.f3) v31Var).resourcesProvider;
        u5Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(i12, d6Var3));
        addView(u5Var, w7.z5.e(-1, -2, 55));
        i10 = ((org.telegram.ui.ActionBar.f3) v31Var).currentAccount;
        c5 c5Var = new c5(this, 19);
        jl0 jl0Var = new jl0(this, 16);
        d6Var4 = ((org.telegram.ui.ActionBar.f3) v31Var).resourcesProvider;
        org.telegram.ui.Components.c71 c71Var = new org.telegram.ui.Components.c71(context, i10, 0, true, c5Var, jl0Var, null, d6Var4);
        this.f = c71Var;
        c71Var.setClipToPadding(false);
        c71Var.e3.k1(true);
        c71Var.setOnScrollListener(new i3(this, 27));
        frameLayout.addView(c71Var, w7.z5.c(-1.0f, -1));
    }

    public final void a(int i10) {
        this.a = i10;
        this.h.b(i10 != 0);
        org.telegram.ui.Components.c71 c71Var = this.f;
        if (c71Var != null) {
            c71Var.f3.N(true);
        }
    }

    public final void b(TLRPC.TL_reportResultAddComment tL_reportResultAddComment) {
        this.b = null;
        this.c = null;
        this.d = tL_reportResultAddComment;
        this.f.f3.N(false);
        if (this.n != null) {
            AndroidUtilities.runOnUIThread(new s31(this, 1), 120L);
        }
    }
}
