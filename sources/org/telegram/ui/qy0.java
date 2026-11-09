package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class qy0 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public int a;
    public TLRPC.TL_channels_sponsoredMessageReportResultChooseOption b;
    public TLRPC.TL_reportResultChooseOption c;
    public TLRPC.TL_reportResultAddComment d;
    public final FrameLayout e;
    public final org.telegram.ui.Components.r41 f;
    public final bi.m5 h;
    public oy0 n;
    public FrameLayout r;
    public fi.d s;
    public final /* synthetic */ ry0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qy0(ry0 ry0Var, Context context) {
        super(context);
        this.w = ry0Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setPadding(0, org.telegram.messenger.g0.m, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, c8.ha.e(-1, -1, org.telegram.messenger.qs.E1));
        int i7 = ry0.s1;
        bi.m5 m5Var = new bi.m5(context, ry0Var.I0);
        TextView textView = (TextView) m5Var.c;
        this.h = m5Var;
        m5Var.e = new ny0(this, 0);
        if (ry0Var.l1) {
            textView.setText(org.telegram.messenger.id.M0(2131746234, null));
        } else if (ry0Var.m1) {
            textView.setText(org.telegram.messenger.id.M0(2131746195, null));
        } else {
            textView.setText(org.telegram.messenger.id.M0(2131746243, null));
        }
        ((org.telegram.ui.ActionBar.y1) m5Var.d).a(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.G6, ry0Var.I0));
        org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.h5, m5Var, ry0Var.I0);
        addView(m5Var, c8.ha.e(-1, -2, 55));
        org.telegram.ui.Components.r41 r41Var = new org.telegram.ui.Components.r41(context, ry0Var.a, 0, true, new a5(this, 20), new ni0(this, 14), null, ry0Var.I0);
        this.f = r41Var;
        r41Var.setClipToPadding(false);
        r41Var.e3.k1(true);
        r41Var.setOnScrollListener(new g3(this, 28));
        frameLayout.addView(r41Var, c8.ha.c(-1.0f, -1));
    }

    public final void a(int i7) {
        this.a = i7;
        this.h.b(i7 != 0);
        org.telegram.ui.Components.r41 r41Var = this.f;
        if (r41Var != null) {
            r41Var.f3.O(true);
        }
    }

    public final void b(TLRPC.TL_reportResultAddComment tL_reportResultAddComment) {
        this.b = null;
        this.c = null;
        this.d = tL_reportResultAddComment;
        this.f.f3.O(false);
        if (this.n != null) {
            org.telegram.messenger.g0.i3(new ny0(this, 1), 120L);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        org.telegram.ui.ActionBar.y1 y1Var;
        try {
            bi.m5 m5Var = this.h;
            if (m5Var == null || (y1Var = (org.telegram.ui.ActionBar.y1) m5Var.d) == null) {
                return;
            }
            int i7 = org.telegram.ui.ActionBar.l6.G6;
            ry0 ry0Var = this.w;
            int i10 = ry0.s1;
            y1Var.a(org.telegram.ui.ActionBar.l6.w0(i7, ry0Var.I0));
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
