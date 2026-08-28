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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class to0 extends FrameLayout {
    public final TextView a;
    public org.telegram.ui.Components.nz0 b;
    public final org.telegram.ui.Components.i5 c;
    public final /* synthetic */ uo0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public to0(uo0 uo0Var, Context context) {
        super(context);
        this.d = uo0Var;
        zo0 zo0Var = uo0Var.f0;
        setBackgroundColor(zo0Var.getThemedColor(org.telegram.ui.ActionBar.f6.d6));
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setTextSize(1, 16.0f);
        boolean z10 = zo0Var.a;
        textView.setTextColor(zo0Var.getThemedColor(org.telegram.ui.ActionBar.f6.G6));
        if (uo0Var.c0 == 1) {
            textView.setText(LocaleController.getString(z10 ? R.string.ChannelReplyIcon : R.string.UserReplyIcon));
        } else {
            textView.setText(LocaleController.getString(z10 ? R.string.ChannelProfileIcon : R.string.UserProfileIcon));
        }
        addView(textView, g7.e6.d(-1, -2.0f, 23, 20.0f, 0.0f, 20.0f, 0.0f));
        this.c = new org.telegram.ui.Components.i5(AndroidUtilities.dp(24.0f), 13, this, false);
    }

    public final int a() {
        int i9;
        MessagesController.PeerColors peerColors;
        MessagesController.PeerColor color;
        int i10;
        org.telegram.ui.ActionBar.b6 b6Var;
        org.telegram.ui.ActionBar.b6 b6Var2;
        org.telegram.ui.ActionBar.b6 b6Var3;
        org.telegram.ui.ActionBar.b6 b6Var4;
        uo0 uo0Var = this.d;
        zo0 zo0Var = uo0Var.f0;
        int i11 = uo0Var.n;
        if (i11 >= 0) {
            if (i11 < 7) {
                return zo0Var.getThemedColor(org.telegram.ui.ActionBar.f6.r8[i11]);
            }
            if (uo0Var.c0 == 1) {
                i10 = ((org.telegram.ui.ActionBar.o2) zo0Var).currentAccount;
                peerColors = MessagesController.getInstance(i10).peerColors;
            } else {
                i9 = ((org.telegram.ui.ActionBar.o2) zo0Var).currentAccount;
                peerColors = MessagesController.getInstance(i9).profilePeerColors;
            }
            return (peerColors == null || (color = peerColors.getColor(uo0Var.n)) == null) ? zo0Var.getThemedColor(org.telegram.ui.ActionBar.f6.r8[0]) : color.getColor1();
        }
        int i12 = org.telegram.ui.ActionBar.f6.s8;
        if (AndroidUtilities.computePerceivedBrightness(zo0Var.getThemedColor(i12)) > 0.8f) {
            int i13 = org.telegram.ui.ActionBar.f6.n6;
            b6Var4 = ((org.telegram.ui.ActionBar.o2) zo0Var).resourceProvider;
            return org.telegram.ui.ActionBar.f6.v0(i13, b6Var4);
        }
        if (AndroidUtilities.computePerceivedBrightness(zo0Var.getThemedColor(i12)) < 0.2f) {
            int i14 = org.telegram.ui.ActionBar.f6.A8;
            b6Var3 = ((org.telegram.ui.ActionBar.o2) zo0Var).resourceProvider;
            return org.telegram.ui.ActionBar.f6.l1(0.5f, org.telegram.ui.ActionBar.f6.v0(i14, b6Var3));
        }
        int i15 = org.telegram.ui.ActionBar.f6.d6;
        b6Var = ((org.telegram.ui.ActionBar.o2) zo0Var).resourceProvider;
        int v02 = org.telegram.ui.ActionBar.f6.v0(i15, b6Var);
        b6Var2 = ((org.telegram.ui.ActionBar.o2) zo0Var).resourceProvider;
        return org.telegram.ui.ActionBar.f6.v(v02, org.telegram.ui.ActionBar.f6.l1(0.7f, zo0.t0(org.telegram.ui.ActionBar.f6.v0(i12, b6Var2))));
    }

    public final void b(boolean z10) {
        uo0 uo0Var = this.d;
        long j10 = uo0Var.r;
        org.telegram.ui.Components.i5 i5Var = this.c;
        if (j10 != 0) {
            i5Var.j(j10, z10);
            this.b = null;
        } else {
            i5Var.g(null, z10);
            if (this.b == null) {
                this.b = new org.telegram.ui.Components.nz0(LocaleController.getString(uo0Var.f0.a ? R.string.ChannelReplyIconOff : R.string.UserReplyIconOff), 16.0f, null);
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
        org.telegram.ui.Components.nz0 nz0Var = this.b;
        if (nz0Var != null) {
            nz0Var.c((getMeasuredWidth() - this.b.l()) - AndroidUtilities.dp(19.0f), getMeasuredHeight() / 2.0f, 1.0f, this.d.f0.getThemedColor(org.telegram.ui.ActionBar.f6.q6), canvas);
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
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), TLObject.FLAG_30));
    }
}
