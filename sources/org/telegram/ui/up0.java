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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class up0 extends FrameLayout {
    public final TextView a;
    public org.telegram.ui.Components.f01 b;
    public final org.telegram.ui.Components.o5 c;
    public final /* synthetic */ vp0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public up0(vp0 vp0Var, Context context) {
        super(context);
        this.d = vp0Var;
        bq0 bq0Var = vp0Var.p0;
        setBackgroundColor(bq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setTextSize(1, 16.0f);
        boolean z10 = bq0Var.a;
        textView.setTextColor(bq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.G6));
        if (vp0Var.m0 == 1) {
            textView.setText(LocaleController.getString(z10 ? R.string.ChannelReplyIcon : R.string.UserReplyIcon));
        } else {
            textView.setText(LocaleController.getString(z10 ? R.string.ChannelProfileIcon : R.string.UserProfileIcon));
        }
        addView(textView, w7.x5.d(-1, -2.0f, 23, 20.0f, 0.0f, 20.0f, 0.0f));
        this.c = new org.telegram.ui.Components.o5(AndroidUtilities.dp(24.0f), 13, this, false);
    }

    public final int a() {
        int i10;
        MessagesController.PeerColors peerColors;
        MessagesController.PeerColor color;
        int i11;
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        org.telegram.ui.ActionBar.f6 f6Var3;
        org.telegram.ui.ActionBar.f6 f6Var4;
        vp0 vp0Var = this.d;
        bq0 bq0Var = vp0Var.p0;
        int i12 = vp0Var.h;
        if (i12 >= 0) {
            if (i12 < 7) {
                return bq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.r8[i12]);
            }
            if (vp0Var.m0 == 1) {
                i11 = ((org.telegram.ui.ActionBar.n2) bq0Var).currentAccount;
                peerColors = MessagesController.getInstance(i11).peerColors;
            } else {
                i10 = ((org.telegram.ui.ActionBar.n2) bq0Var).currentAccount;
                peerColors = MessagesController.getInstance(i10).profilePeerColors;
            }
            return (peerColors == null || (color = peerColors.getColor(vp0Var.h)) == null) ? bq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.r8[0]) : color.getColor1();
        }
        int i13 = org.telegram.ui.ActionBar.j6.s8;
        if (AndroidUtilities.computePerceivedBrightness(bq0Var.getThemedColor(i13)) > 0.8f) {
            int i14 = org.telegram.ui.ActionBar.j6.n6;
            f6Var4 = ((org.telegram.ui.ActionBar.n2) bq0Var).resourceProvider;
            return org.telegram.ui.ActionBar.j6.v0(i14, f6Var4);
        }
        if (AndroidUtilities.computePerceivedBrightness(bq0Var.getThemedColor(i13)) < 0.2f) {
            int i15 = org.telegram.ui.ActionBar.j6.A8;
            f6Var3 = ((org.telegram.ui.ActionBar.n2) bq0Var).resourceProvider;
            return org.telegram.ui.ActionBar.j6.l1(0.5f, org.telegram.ui.ActionBar.j6.v0(i15, f6Var3));
        }
        int i16 = org.telegram.ui.ActionBar.j6.d6;
        f6Var = ((org.telegram.ui.ActionBar.n2) bq0Var).resourceProvider;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i16, f6Var);
        f6Var2 = ((org.telegram.ui.ActionBar.n2) bq0Var).resourceProvider;
        return org.telegram.ui.ActionBar.j6.v(v02, org.telegram.ui.ActionBar.j6.l1(0.7f, bq0.w0(org.telegram.ui.ActionBar.j6.v0(i13, f6Var2))));
    }

    public final void b(boolean z10) {
        vp0 vp0Var = this.d;
        long j3 = vp0Var.n;
        org.telegram.ui.Components.o5 o5Var = this.c;
        if (j3 != 0) {
            o5Var.j(j3, z10);
            this.b = null;
        } else {
            o5Var.g(null, z10);
            if (this.b == null) {
                this.b = new org.telegram.ui.Components.f01(LocaleController.getString(vp0Var.p0.a ? R.string.ChannelReplyIconOff : R.string.UserReplyIconOff), 16.0f, null);
            }
        }
    }

    public final void c() {
        boolean z10 = LocaleController.isRTL;
        org.telegram.ui.Components.o5 o5Var = this.c;
        o5Var.setBounds(z10 ? AndroidUtilities.dp(21.0f) : (getWidth() - o5Var.s) - AndroidUtilities.dp(21.0f), (getHeight() - o5Var.s) / 2, LocaleController.isRTL ? AndroidUtilities.dp(21.0f) + o5Var.s : getWidth() - AndroidUtilities.dp(21.0f), (getHeight() + o5Var.s) / 2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        c();
        Integer valueOf = Integer.valueOf(a());
        org.telegram.ui.Components.o5 o5Var = this.c;
        o5Var.k(valueOf);
        org.telegram.ui.Components.f01 f01Var = this.b;
        if (f01Var != null) {
            f01Var.c((getMeasuredWidth() - this.b.l()) - AndroidUtilities.dp(19.0f), getMeasuredHeight() / 2.0f, 1.0f, this.d.p0.getThemedColor(org.telegram.ui.ActionBar.j6.q6), canvas);
        } else {
            o5Var.draw(canvas);
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
