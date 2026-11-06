package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class zx0 extends FrameLayout {
    public final org.telegram.ui.Components.g5 a;
    public final /* synthetic */ ay0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zx0(ay0 ay0Var, Context context) {
        super(context);
        this.b = ay0Var;
        TextView g10 = org.telegram.messenger.k5.g(context, 1, 16.0f);
        org.telegram.ui.ActionBar.r6.V(g10, org.telegram.ui.ActionBar.k6.G6, ay0Var.getResourceProvider());
        g10.setText(org.telegram.messenger.hd.M0(2131751351, null));
        addView(g10, c8.ha.d(-1, -2.0f, 23, 20.0f, 0.0f, 48.0f, 0.0f));
        this.a = new org.telegram.ui.Components.g5(org.telegram.messenger.g0.L(24.0f), this);
    }

    public final void a(boolean z9) {
        int i7;
        int i10;
        ay0 ay0Var = this.b;
        i7 = ((org.telegram.ui.ActionBar.f2) ay0Var).currentAccount;
        String Q = org.telegram.messenger.ui.b0(i7).Q();
        org.telegram.ui.Components.g5 g5Var = this.a;
        if (Q != null && Q.startsWith("animated_")) {
            try {
                g5Var.j(Long.parseLong(Q.substring(9)), z9);
                return;
            } catch (Exception unused) {
            }
        }
        i10 = ((org.telegram.ui.ActionBar.f2) ay0Var).currentAccount;
        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.ui.b0(i10).r.get(Q);
        if (tL_availableReaction != null) {
            g5Var.i(tL_availableReaction.static_icon, z9);
        }
    }

    public final void b() {
        int width = getWidth();
        org.telegram.ui.Components.g5 g5Var = this.a;
        g5Var.setBounds((width - g5Var.s) - org.telegram.messenger.g0.L(21.0f), (getHeight() - g5Var.s) / 2, getWidth() - org.telegram.messenger.g0.L(21.0f), (getHeight() + g5Var.s) / 2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        b();
        this.a.draw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.b();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), TLObject.FLAG_30));
    }
}
