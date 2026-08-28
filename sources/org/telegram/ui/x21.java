package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class x21 extends FrameLayout {
    public int a;
    public TLRPC.TL_channels_sponsoredMessageReportResultChooseOption b;
    public TLRPC.TL_reportResultChooseOption c;
    public TLRPC.TL_reportResultAddComment d;
    public final FrameLayout e;
    public final org.telegram.ui.Components.i51 f;
    public final bh.g h;
    public v21 n;
    public FrameLayout r;
    public kh.d s;
    public final /* synthetic */ y21 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x21(y21 y21Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.b6 b6Var;
        org.telegram.ui.ActionBar.b6 b6Var2;
        org.telegram.ui.ActionBar.b6 b6Var3;
        int i9;
        org.telegram.ui.ActionBar.b6 b6Var4;
        this.v = y21Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, g7.e6.e(-1, -1, 119));
        b6Var = ((org.telegram.ui.ActionBar.f3) y21Var).resourcesProvider;
        bh.g gVar = new bh.g(context, b6Var);
        TextView textView = (TextView) gVar.c;
        this.h = gVar;
        gVar.e = new u21(this, 0);
        if (y21Var.d) {
            textView.setText(LocaleController.getString(R.string.ReportAd));
        } else if (y21Var.e) {
            textView.setText(LocaleController.getString(R.string.ReportStory));
        } else {
            textView.setText(LocaleController.getString(R.string.Report2));
        }
        org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) gVar.d;
        int i10 = org.telegram.ui.ActionBar.f6.G6;
        b6Var2 = ((org.telegram.ui.ActionBar.f3) y21Var).resourcesProvider;
        h2Var.a(org.telegram.ui.ActionBar.f6.v0(i10, b6Var2));
        int i11 = org.telegram.ui.ActionBar.f6.h5;
        b6Var3 = ((org.telegram.ui.ActionBar.f3) y21Var).resourcesProvider;
        gVar.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(i11, b6Var3));
        addView(gVar, g7.e6.e(-1, -2, 55));
        i9 = ((org.telegram.ui.ActionBar.f3) y21Var).currentAccount;
        a5 a5Var = new a5(this, 19);
        dl0 dl0Var = new dl0(this, 15);
        b6Var4 = ((org.telegram.ui.ActionBar.f3) y21Var).resourcesProvider;
        org.telegram.ui.Components.i51 i51Var = new org.telegram.ui.Components.i51(context, i9, 0, true, a5Var, dl0Var, null, b6Var4);
        this.f = i51Var;
        i51Var.setClipToPadding(false);
        i51Var.T2.k1(true);
        i51Var.setOnScrollListener(new l3(this, 27));
        frameLayout.addView(i51Var, g7.e6.c(-1.0f, -1));
    }

    public final void a(int i9) {
        this.a = i9;
        this.h.b(i9 != 0);
        org.telegram.ui.Components.i51 i51Var = this.f;
        if (i51Var != null) {
            i51Var.U2.N(true);
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
