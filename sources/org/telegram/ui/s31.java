package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class s31 extends FrameLayout {
    public int a;
    public TLRPC.TL_channels_sponsoredMessageReportResultChooseOption b;
    public TLRPC.TL_reportResultChooseOption c;
    public TLRPC.TL_reportResultAddComment d;
    public final FrameLayout e;
    public final org.telegram.ui.Components.e71 f;
    public final u5 h;
    public r31 n;
    public FrameLayout r;
    public ci.d s;
    public final /* synthetic */ t31 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s31(t31 t31Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        org.telegram.ui.ActionBar.d6 d6Var3;
        int i10;
        org.telegram.ui.ActionBar.d6 d6Var4;
        this.v = t31Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, w7.z5.e(-1, -1, 119));
        d6Var = ((org.telegram.ui.ActionBar.f3) t31Var).resourcesProvider;
        u5 u5Var = new u5(context, d6Var);
        TextView textView = (TextView) u5Var.d;
        this.h = u5Var;
        u5Var.e = new q31(this, 0);
        if (t31Var.d) {
            textView.setText(LocaleController.getString(R.string.ReportAd));
        } else if (t31Var.e) {
            textView.setText(LocaleController.getString(R.string.ReportStory));
        } else {
            textView.setText(LocaleController.getString(R.string.Report2));
        }
        org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) u5Var.b;
        int i11 = org.telegram.ui.ActionBar.i6.G6;
        d6Var2 = ((org.telegram.ui.ActionBar.f3) t31Var).resourcesProvider;
        g2Var.a(org.telegram.ui.ActionBar.i6.v0(i11, d6Var2));
        int i12 = org.telegram.ui.ActionBar.i6.h5;
        d6Var3 = ((org.telegram.ui.ActionBar.f3) t31Var).resourcesProvider;
        u5Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(i12, d6Var3));
        addView(u5Var, w7.z5.e(-1, -2, 55));
        i10 = ((org.telegram.ui.ActionBar.f3) t31Var).currentAccount;
        c5 c5Var = new c5(this, 19);
        jl0 jl0Var = new jl0(this, 16);
        d6Var4 = ((org.telegram.ui.ActionBar.f3) t31Var).resourcesProvider;
        org.telegram.ui.Components.e71 e71Var = new org.telegram.ui.Components.e71(context, i10, 0, true, c5Var, jl0Var, null, d6Var4);
        this.f = e71Var;
        e71Var.setClipToPadding(false);
        e71Var.e3.k1(true);
        e71Var.setOnScrollListener(new i3(this, 27));
        frameLayout.addView(e71Var, w7.z5.c(-1.0f, -1));
    }

    public final void a(int i10) {
        this.a = i10;
        this.h.b(i10 != 0);
        org.telegram.ui.Components.e71 e71Var = this.f;
        if (e71Var != null) {
            e71Var.f3.N(true);
        }
    }

    public final void b(TLRPC.TL_reportResultAddComment tL_reportResultAddComment) {
        this.b = null;
        this.c = null;
        this.d = tL_reportResultAddComment;
        this.f.f3.N(false);
        if (this.n != null) {
            AndroidUtilities.runOnUIThread(new q31(this, 1), 120L);
        }
    }
}
