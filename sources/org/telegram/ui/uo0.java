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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class uo0 extends FrameLayout {
    public final TextView a;
    public org.telegram.ui.Components.pz0 b;
    public final org.telegram.ui.Components.i5 c;
    public final /* synthetic */ vo0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uo0(vo0 vo0Var, Context context) {
        super(context);
        this.d = vo0Var;
        ap0 ap0Var = vo0Var.f0;
        setBackgroundColor(ap0Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setTextSize(1, 16.0f);
        boolean z10 = ap0Var.a;
        textView.setTextColor(ap0Var.getThemedColor(org.telegram.ui.ActionBar.g6.G6));
        if (vo0Var.c0 == 1) {
            textView.setText(LocaleController.getString(z10 ? R.string.ChannelReplyIcon : R.string.UserReplyIcon));
        } else {
            textView.setText(LocaleController.getString(z10 ? R.string.ChannelProfileIcon : R.string.UserProfileIcon));
        }
        addView(textView, h7.z5.d(-1, -2.0f, 23, 20.0f, 0.0f, 20.0f, 0.0f));
        this.c = new org.telegram.ui.Components.i5(AndroidUtilities.dp(24.0f), 13, this, false);
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
        vo0 vo0Var = this.d;
        ap0 ap0Var = vo0Var.f0;
        int i12 = vo0Var.n;
        if (i12 >= 0) {
            if (i12 < 7) {
                return ap0Var.getThemedColor(org.telegram.ui.ActionBar.g6.r8[i12]);
            }
            if (vo0Var.c0 == 1) {
                i11 = ((org.telegram.ui.ActionBar.n2) ap0Var).currentAccount;
                peerColors = MessagesController.getInstance(i11).peerColors;
            } else {
                i10 = ((org.telegram.ui.ActionBar.n2) ap0Var).currentAccount;
                peerColors = MessagesController.getInstance(i10).profilePeerColors;
            }
            return (peerColors == null || (color = peerColors.getColor(vo0Var.n)) == null) ? ap0Var.getThemedColor(org.telegram.ui.ActionBar.g6.r8[0]) : color.getColor1();
        }
        int i13 = org.telegram.ui.ActionBar.g6.s8;
        if (AndroidUtilities.computePerceivedBrightness(ap0Var.getThemedColor(i13)) > 0.8f) {
            int i14 = org.telegram.ui.ActionBar.g6.n6;
            c6Var4 = ((org.telegram.ui.ActionBar.n2) ap0Var).resourceProvider;
            return org.telegram.ui.ActionBar.g6.v0(i14, c6Var4);
        }
        if (AndroidUtilities.computePerceivedBrightness(ap0Var.getThemedColor(i13)) < 0.2f) {
            int i15 = org.telegram.ui.ActionBar.g6.A8;
            c6Var3 = ((org.telegram.ui.ActionBar.n2) ap0Var).resourceProvider;
            return org.telegram.ui.ActionBar.g6.l1(0.5f, org.telegram.ui.ActionBar.g6.v0(i15, c6Var3));
        }
        int i16 = org.telegram.ui.ActionBar.g6.d6;
        c6Var = ((org.telegram.ui.ActionBar.n2) ap0Var).resourceProvider;
        int v02 = org.telegram.ui.ActionBar.g6.v0(i16, c6Var);
        c6Var2 = ((org.telegram.ui.ActionBar.n2) ap0Var).resourceProvider;
        return org.telegram.ui.ActionBar.g6.v(v02, org.telegram.ui.ActionBar.g6.l1(0.7f, ap0.u0(org.telegram.ui.ActionBar.g6.v0(i13, c6Var2))));
    }

    public final void b(boolean z10) {
        vo0 vo0Var = this.d;
        long j10 = vo0Var.r;
        org.telegram.ui.Components.i5 i5Var = this.c;
        if (j10 != 0) {
            i5Var.j(j10, z10);
            this.b = null;
        } else {
            i5Var.g(null, z10);
            if (this.b == null) {
                this.b = new org.telegram.ui.Components.pz0(LocaleController.getString(vo0Var.f0.a ? R.string.ChannelReplyIconOff : R.string.UserReplyIconOff), 16.0f, null);
            }
        }
    }

    public final void c() {
        boolean z10 = LocaleController.isRTL;
        org.telegram.ui.Components.i5 i5Var = this.c;
        i5Var.setBounds(z10 ? AndroidUtilities.dp(21.0f) : (getWidth() - i5Var.s) - AndroidUtilities.dp(21.0f), (getHeight() - i5Var.s) / 2, LocaleController.isRTL ? AndroidUtilities.dp(21.0f) + i5Var.s : getWidth() - AndroidUtilities.dp(21.0f), (getHeight() + i5Var.s) / 2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        c();
        Integer valueOf = Integer.valueOf(a());
        org.telegram.ui.Components.i5 i5Var = this.c;
        i5Var.k(valueOf);
        org.telegram.ui.Components.pz0 pz0Var = this.b;
        if (pz0Var != null) {
            pz0Var.c((getMeasuredWidth() - this.b.l()) - AndroidUtilities.dp(19.0f), getMeasuredHeight() / 2.0f, 1.0f, this.d.f0.getThemedColor(org.telegram.ui.ActionBar.g6.q6), canvas);
        } else {
            i5Var.draw(canvas);
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
