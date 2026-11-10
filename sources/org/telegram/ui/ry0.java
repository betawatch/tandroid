package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ry0 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public int a;
    public TLRPC.TL_channels_sponsoredMessageReportResultChooseOption b;
    public TLRPC.TL_reportResultChooseOption c;
    public TLRPC.TL_reportResultAddComment d;
    public final FrameLayout e;
    public final org.telegram.ui.Components.r41 f;
    public final bi.m5 h;
    public py0 n;
    public FrameLayout r;
    public fi.d s;
    public final /* synthetic */ sy0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ry0(sy0 sy0Var, Context context) {
        super(context);
        this.w = sy0Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setPadding(0, org.telegram.messenger.g0.m, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, c8.ha.e(-1, -1, org.telegram.messenger.qs.E1));
        int i7 = sy0.v1;
        bi.m5 m5Var = new bi.m5(context, sy0Var.I0);
        TextView textView = (TextView) m5Var.c;
        this.h = m5Var;
        m5Var.e = new oy0(this, 0);
        if (sy0Var.o1) {
            textView.setText(org.telegram.messenger.id.M0(2131746234, null));
        } else if (sy0Var.p1) {
            textView.setText(org.telegram.messenger.id.M0(2131746195, null));
        } else {
            textView.setText(org.telegram.messenger.id.M0(2131746243, null));
        }
        ((org.telegram.ui.ActionBar.y1) m5Var.d).a(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G6, sy0Var.I0));
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.h5, m5Var, sy0Var.I0);
        addView(m5Var, c8.ha.e(-1, -2, 55));
        org.telegram.ui.Components.r41 r41Var = new org.telegram.ui.Components.r41(context, sy0Var.a, 0, true, new a5(this, 20), new oi0(this, 14), null, sy0Var.I0);
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
            org.telegram.messenger.g0.i3(new oy0(this, 1), 120L);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        org.telegram.ui.ActionBar.y1 y1Var;
        try {
            bi.m5 m5Var = this.h;
            if (m5Var == null || (y1Var = (org.telegram.ui.ActionBar.y1) m5Var.d) == null) {
                return;
            }
            int i7 = org.telegram.ui.ActionBar.m6.G6;
            sy0 sy0Var = this.w;
            int i10 = sy0.v1;
            y1Var.a(org.telegram.ui.ActionBar.m6.w0(i7, sy0Var.I0));
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
