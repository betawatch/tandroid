package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class w21 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public int a;
    public TLRPC.TL_channels_sponsoredMessageReportResultChooseOption b;
    public TLRPC.TL_reportResultChooseOption c;
    public TLRPC.TL_reportResultAddComment d;
    public final FrameLayout e;
    public final org.telegram.ui.Components.s71 f;
    public final bi.j5 h;
    public u21 n;
    public FrameLayout r;
    public fi.d s;
    public final /* synthetic */ x21 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w21(x21 x21Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.u6 u6Var;
        org.telegram.ui.ActionBar.u6 u6Var2;
        org.telegram.ui.ActionBar.u6 u6Var3;
        int i10;
        org.telegram.ui.ActionBar.u6 u6Var4;
        this.v = x21Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, org.telegram.ui.Components.kb1.i(-1, -1, 119));
        u6Var = ((org.telegram.ui.ActionBar.k3) x21Var).resourcesProvider;
        bi.j5 j5Var = new bi.j5(context, u6Var);
        TextView textView = (TextView) j5Var.c;
        this.h = j5Var;
        j5Var.e = new t21(this, 0);
        if (x21Var.e) {
            textView.setText(LocaleController.getString(R.string.ReportAd));
        } else if (x21Var.f) {
            textView.setText(LocaleController.getString(R.string.ReportStory));
        } else {
            textView.setText(LocaleController.getString(R.string.Report2));
        }
        org.telegram.ui.ActionBar.j2 j2Var = (org.telegram.ui.ActionBar.j2) j5Var.d;
        int i11 = org.telegram.ui.ActionBar.y6.G6;
        u6Var2 = ((org.telegram.ui.ActionBar.k3) x21Var).resourcesProvider;
        j2Var.a(org.telegram.ui.ActionBar.y6.w0(i11, u6Var2));
        int i12 = org.telegram.ui.ActionBar.y6.h5;
        u6Var3 = ((org.telegram.ui.ActionBar.k3) x21Var).resourcesProvider;
        org.telegram.ui.ActionBar.f7.i(i12, j5Var, u6Var3);
        addView(j5Var, org.telegram.ui.Components.kb1.i(-1, -2, 55));
        i10 = ((org.telegram.ui.ActionBar.k3) x21Var).currentAccount;
        e5 e5Var = new e5(this, 19);
        jl0 jl0Var = new jl0(this, 16);
        u6Var4 = ((org.telegram.ui.ActionBar.k3) x21Var).resourcesProvider;
        org.telegram.ui.Components.s71 s71Var = new org.telegram.ui.Components.s71(context, i10, 0, true, e5Var, jl0Var, null, u6Var4);
        this.f = s71Var;
        s71Var.setClipToPadding(false);
        s71Var.f3.l1(true);
        s71Var.setOnScrollListener(new i3(this, 27));
        frameLayout.addView(s71Var, org.telegram.ui.Components.kb1.g(-1.0f, -1));
    }

    public final void a(int i10) {
        this.a = i10;
        this.h.b(i10 != 0);
        org.telegram.ui.Components.s71 s71Var = this.f;
        if (s71Var != null) {
            s71Var.g3.O(true);
        }
    }

    public final void b(TLRPC.TL_reportResultAddComment tL_reportResultAddComment) {
        this.b = null;
        this.c = null;
        this.d = tL_reportResultAddComment;
        this.f.g3.O(false);
        if (this.n != null) {
            AndroidUtilities.runOnUIThread(new t21(this, 1), 120L);
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        org.telegram.ui.ActionBar.j2 j2Var;
        org.telegram.ui.ActionBar.u6 u6Var;
        try {
            bi.j5 j5Var = this.h;
            if (j5Var == null || (j2Var = (org.telegram.ui.ActionBar.j2) j5Var.d) == null) {
                return;
            }
            int i10 = org.telegram.ui.ActionBar.y6.G6;
            u6Var = ((org.telegram.ui.ActionBar.k3) this.v).resourcesProvider;
            j2Var.a(org.telegram.ui.ActionBar.y6.w0(i10, u6Var));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
