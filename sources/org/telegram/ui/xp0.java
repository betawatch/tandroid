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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class xp0 extends FrameLayout {
    public final TextView a;
    public org.telegram.ui.Components.i11 b;
    public final org.telegram.ui.Components.q5 c;
    public final /* synthetic */ yp0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xp0(yp0 yp0Var, Context context) {
        super(context);
        this.d = yp0Var;
        eq0 eq0Var = yp0Var.p0;
        setBackgroundColor(eq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setTextSize(1, 16.0f);
        boolean z10 = eq0Var.a;
        textView.setTextColor(eq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.G6));
        if (yp0Var.m0 == 1) {
            textView.setText(LocaleController.getString(z10 ? R.string.ChannelReplyIcon : R.string.UserReplyIcon));
        } else {
            textView.setText(LocaleController.getString(z10 ? R.string.ChannelProfileIcon : R.string.UserProfileIcon));
        }
        addView(textView, w7.z5.a(-2.0f, 20.0f, 0.0f, 20.0f, 0.0f, -1, 23));
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
        yp0 yp0Var = this.d;
        eq0 eq0Var = yp0Var.p0;
        int i12 = yp0Var.h;
        if (i12 >= 0) {
            if (i12 < 7) {
                return eq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.r8[i12]);
            }
            if (yp0Var.m0 == 1) {
                i11 = ((org.telegram.ui.ActionBar.m2) eq0Var).currentAccount;
                peerColors = MessagesController.getInstance(i11).peerColors;
            } else {
                i10 = ((org.telegram.ui.ActionBar.m2) eq0Var).currentAccount;
                peerColors = MessagesController.getInstance(i10).profilePeerColors;
            }
            return (peerColors == null || (color = peerColors.getColor(yp0Var.h)) == null) ? eq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.r8[0]) : color.getColor1();
        }
        int i13 = org.telegram.ui.ActionBar.g6.s8;
        if (AndroidUtilities.computePerceivedBrightness(eq0Var.getThemedColor(i13)) > 0.8f) {
            int i14 = org.telegram.ui.ActionBar.g6.n6;
            c6Var4 = ((org.telegram.ui.ActionBar.m2) eq0Var).resourceProvider;
            return org.telegram.ui.ActionBar.g6.w0(i14, c6Var4);
        }
        if (AndroidUtilities.computePerceivedBrightness(eq0Var.getThemedColor(i13)) < 0.2f) {
            int i15 = org.telegram.ui.ActionBar.g6.A8;
            c6Var3 = ((org.telegram.ui.ActionBar.m2) eq0Var).resourceProvider;
            return org.telegram.ui.ActionBar.g6.m1(0.5f, org.telegram.ui.ActionBar.g6.w0(i15, c6Var3));
        }
        int i16 = org.telegram.ui.ActionBar.g6.d6;
        c6Var = ((org.telegram.ui.ActionBar.m2) eq0Var).resourceProvider;
        int w02 = org.telegram.ui.ActionBar.g6.w0(i16, c6Var);
        c6Var2 = ((org.telegram.ui.ActionBar.m2) eq0Var).resourceProvider;
        return org.telegram.ui.ActionBar.g6.v(w02, org.telegram.ui.ActionBar.g6.m1(0.7f, eq0.w0(org.telegram.ui.ActionBar.g6.w0(i13, c6Var2))));
    }

    public final void b(boolean z10) {
        yp0 yp0Var = this.d;
        long j10 = yp0Var.n;
        org.telegram.ui.Components.q5 q5Var = this.c;
        if (j10 != 0) {
            q5Var.j(j10, z10);
            this.b = null;
        } else {
            q5Var.g(null, z10);
            if (this.b == null) {
                this.b = new org.telegram.ui.Components.i11(LocaleController.getString(yp0Var.p0.a ? R.string.ChannelReplyIconOff : R.string.UserReplyIconOff), 16.0f, null);
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
        org.telegram.ui.Components.i11 i11Var = this.b;
        if (i11Var != null) {
            i11Var.c((getMeasuredWidth() - this.b.l()) - AndroidUtilities.dp(19.0f), getMeasuredHeight() / 2.0f, 1.0f, this.d.p0.getThemedColor(org.telegram.ui.ActionBar.g6.q6), canvas);
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
