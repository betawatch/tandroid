package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class zp0 extends FrameLayout {
    public final TextView a;
    public org.telegram.ui.Components.h11 b;
    public final org.telegram.ui.Components.q5 c;
    public final /* synthetic */ aq0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zp0(aq0 aq0Var, Context context) {
        super(context);
        this.d = aq0Var;
        gq0 gq0Var = aq0Var.p0;
        setBackgroundColor(gq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setTextSize(1, 16.0f);
        boolean z10 = gq0Var.a;
        textView.setTextColor(gq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.G6));
        if (aq0Var.m0 == 1) {
            textView.setText(LocaleController.getString(z10 ? R.string.ChannelReplyIcon : R.string.UserReplyIcon));
        } else {
            textView.setText(LocaleController.getString(z10 ? R.string.ChannelProfileIcon : R.string.UserProfileIcon));
        }
        addView(textView, w7.a6.a(-2.0f, 20.0f, 0.0f, 20.0f, 0.0f, -1, 23));
        this.c = new org.telegram.ui.Components.q5(AndroidUtilities.dp(24.0f), 13, this, false);
    }

    public final int a() {
        int i10;
        MessagesController.PeerColors peerColors;
        MessagesController.PeerColor color;
        int i11;
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        org.telegram.ui.ActionBar.c6 c6Var3;
        org.telegram.ui.ActionBar.c6 c6Var4;
        aq0 aq0Var = this.d;
        gq0 gq0Var = aq0Var.p0;
        int i12 = aq0Var.h;
        if (i12 >= 0) {
            if (i12 < 7) {
                return gq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.r8[i12]);
            }
            if (aq0Var.m0 == 1) {
                i11 = ((org.telegram.ui.ActionBar.m2) gq0Var).currentAccount;
                peerColors = MessagesController.getInstance(i11).peerColors;
            } else {
                i10 = ((org.telegram.ui.ActionBar.m2) gq0Var).currentAccount;
                peerColors = MessagesController.getInstance(i10).profilePeerColors;
            }
            return (peerColors == null || (color = peerColors.getColor(aq0Var.h)) == null) ? gq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.r8[0]) : color.getColor1();
        }
        int i13 = org.telegram.ui.ActionBar.g6.s8;
        if (AndroidUtilities.computePerceivedBrightness(gq0Var.getThemedColor(i13)) > 0.8f) {
            int i14 = org.telegram.ui.ActionBar.g6.n6;
            c6Var4 = ((org.telegram.ui.ActionBar.m2) gq0Var).resourceProvider;
            return org.telegram.ui.ActionBar.g6.w0(i14, c6Var4);
        }
        if (AndroidUtilities.computePerceivedBrightness(gq0Var.getThemedColor(i13)) < 0.2f) {
            int i15 = org.telegram.ui.ActionBar.g6.A8;
            c6Var3 = ((org.telegram.ui.ActionBar.m2) gq0Var).resourceProvider;
            return org.telegram.ui.ActionBar.g6.m1(0.5f, org.telegram.ui.ActionBar.g6.w0(i15, c6Var3));
        }
        int i16 = org.telegram.ui.ActionBar.g6.d6;
        c6Var = ((org.telegram.ui.ActionBar.m2) gq0Var).resourceProvider;
        int w02 = org.telegram.ui.ActionBar.g6.w0(i16, c6Var);
        c6Var2 = ((org.telegram.ui.ActionBar.m2) gq0Var).resourceProvider;
        return org.telegram.ui.ActionBar.g6.v(w02, org.telegram.ui.ActionBar.g6.m1(0.7f, gq0.w0(org.telegram.ui.ActionBar.g6.w0(i13, c6Var2))));
    }

    public final void b(boolean z10) {
        aq0 aq0Var = this.d;
        long j10 = aq0Var.n;
        org.telegram.ui.Components.q5 q5Var = this.c;
        if (j10 != 0) {
            q5Var.j(j10, z10);
            this.b = null;
        } else {
            q5Var.g(null, z10);
            if (this.b == null) {
                this.b = new org.telegram.ui.Components.h11(LocaleController.getString(aq0Var.p0.a ? R.string.ChannelReplyIconOff : R.string.UserReplyIconOff), 16.0f, null);
            }
        }
    }

    public final void c() {
        boolean z10 = LocaleController.isRTL;
        org.telegram.ui.Components.q5 q5Var = this.c;
        q5Var.setBounds(z10 ? AndroidUtilities.dp(21.0f) : (getWidth() - q5Var.s) - AndroidUtilities.dp(21.0f), (getHeight() - q5Var.s) / 2, LocaleController.isRTL ? AndroidUtilities.dp(21.0f) + q5Var.s : getWidth() - AndroidUtilities.dp(21.0f), (getHeight() + q5Var.s) / 2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        c();
        Integer valueOf = Integer.valueOf(a());
        org.telegram.ui.Components.q5 q5Var = this.c;
        q5Var.k(valueOf);
        org.telegram.ui.Components.h11 h11Var = this.b;
        if (h11Var != null) {
            h11Var.c((getMeasuredWidth() - this.b.l()) - AndroidUtilities.dp(19.0f), getMeasuredHeight() / 2.0f, 1.0f, this.d.p0.getThemedColor(org.telegram.ui.ActionBar.g6.q6), canvas);
        } else {
            q5Var.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.c.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c.b();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), TLObject.FLAG_30));
    }
}
