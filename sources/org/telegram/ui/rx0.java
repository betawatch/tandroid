package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class rx0 extends FrameLayout {
    public final org.telegram.ui.Components.e5 a;
    public final /* synthetic */ sx0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rx0(sx0 sx0Var, Context context) {
        super(context);
        this.b = sx0Var;
        TextView g7 = org.telegram.messenger.k5.g(context, 1, 16.0f);
        org.telegram.ui.ActionBar.r6.V(g7, org.telegram.ui.ActionBar.k6.G6, sx0Var.getResourceProvider());
        g7.setText(org.telegram.messenger.bd.M0(2131751351, null));
        addView(g7, b8.mf.d(-1, -2.0f, 23, 20.0f, 0.0f, 48.0f, 0.0f));
        this.a = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(24.0f), this);
    }

    public final void a(boolean z10) {
        int i3;
        int i10;
        sx0 sx0Var = this.b;
        i3 = ((org.telegram.ui.ActionBar.d2) sx0Var).currentAccount;
        String Q = org.telegram.messenger.li.b0(i3).Q();
        org.telegram.ui.Components.e5 e5Var = this.a;
        if (Q != null && Q.startsWith("animated_")) {
            try {
                e5Var.j(Long.parseLong(Q.substring(9)), z10);
                return;
            } catch (Exception unused) {
            }
        }
        i10 = ((org.telegram.ui.ActionBar.d2) sx0Var).currentAccount;
        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.li.b0(i10).r.get(Q);
        if (tL_availableReaction != null) {
            e5Var.i(tL_availableReaction.static_icon, z10);
        }
    }

    public final void b() {
        int width = getWidth();
        org.telegram.ui.Components.e5 e5Var = this.a;
        e5Var.setBounds((width - e5Var.s) - org.telegram.messenger.g0.L(21.0f), (getHeight() - e5Var.s) / 2, getWidth() - org.telegram.messenger.g0.L(21.0f), (getHeight() + e5Var.s) / 2);
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
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), TLObject.FLAG_30));
    }
}
