package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class s31 extends FrameLayout {
    public int a;
    public TLRPC.TL_channels_sponsoredMessageReportResultChooseOption b;
    public TLRPC.TL_reportResultChooseOption c;
    public TLRPC.TL_reportResultAddComment d;
    public final FrameLayout e;
    public final org.telegram.ui.Components.r61 f;
    public final t5 h;
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
        addView(frameLayout, w7.y5.e(-1, -1, 119));
        d6Var = ((org.telegram.ui.ActionBar.e3) t31Var).resourcesProvider;
        t5 t5Var = new t5(context, d6Var);
        TextView textView = (TextView) t5Var.d;
        this.h = t5Var;
        t5Var.e = new q31(this, 0);
        if (t31Var.d) {
            textView.setText(LocaleController.getString(R.string.ReportAd));
        } else if (t31Var.e) {
            textView.setText(LocaleController.getString(R.string.ReportStory));
        } else {
            textView.setText(LocaleController.getString(R.string.Report2));
        }
        org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) t5Var.b;
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        d6Var2 = ((org.telegram.ui.ActionBar.e3) t31Var).resourcesProvider;
        f2Var.a(org.telegram.ui.ActionBar.h6.v0(i11, d6Var2));
        int i12 = org.telegram.ui.ActionBar.h6.h5;
        d6Var3 = ((org.telegram.ui.ActionBar.e3) t31Var).resourcesProvider;
        t5Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(i12, d6Var3));
        addView(t5Var, w7.y5.e(-1, -2, 55));
        i10 = ((org.telegram.ui.ActionBar.e3) t31Var).currentAccount;
        b5 b5Var = new b5(this, 19);
        ml0 ml0Var = new ml0(this, 15);
        d6Var4 = ((org.telegram.ui.ActionBar.e3) t31Var).resourcesProvider;
        org.telegram.ui.Components.r61 r61Var = new org.telegram.ui.Components.r61(context, i10, 0, true, b5Var, ml0Var, null, d6Var4);
        this.f = r61Var;
        r61Var.setClipToPadding(false);
        r61Var.X2.k1(true);
        r61Var.setOnScrollListener(new i3(this, 26));
        frameLayout.addView(r61Var, w7.y5.c(-1.0f, -1));
    }

    public final void a(int i10) {
        this.a = i10;
        this.h.b(i10 != 0);
        org.telegram.ui.Components.r61 r61Var = this.f;
        if (r61Var != null) {
            r61Var.Y2.N(true);
        }
    }

    public final void b(TLRPC.TL_reportResultAddComment tL_reportResultAddComment) {
        this.b = null;
        this.c = null;
        this.d = tL_reportResultAddComment;
        this.f.Y2.N(false);
        if (this.n != null) {
            AndroidUtilities.runOnUIThread(new q31(this, 1), 120L);
        }
    }
}
