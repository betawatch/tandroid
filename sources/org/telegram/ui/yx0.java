package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class yx0 extends FrameLayout {
    public final org.telegram.ui.Components.e5 a;
    public final /* synthetic */ zx0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yx0(zx0 zx0Var, Context context) {
        super(context);
        this.b = zx0Var;
        TextView g10 = org.telegram.messenger.k5.g(context, 1, 16.0f);
        org.telegram.ui.ActionBar.q6.U(g10, org.telegram.ui.ActionBar.j6.G6, zx0Var.getResourceProvider());
        g10.setText(org.telegram.messenger.hd.M0(2131751350, null));
        addView(g10, c8.ja.d(-1, -2.0f, 23, 20.0f, 0.0f, 48.0f, 0.0f));
        this.a = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(24.0f), this);
    }

    public final void a(boolean z10) {
        int i7;
        int i10;
        zx0 zx0Var = this.b;
        i7 = ((org.telegram.ui.ActionBar.e2) zx0Var).currentAccount;
        String Q = org.telegram.messenger.si.b0(i7).Q();
        org.telegram.ui.Components.e5 e5Var = this.a;
        if (Q != null && Q.startsWith("animated_")) {
            try {
                e5Var.j(Long.parseLong(Q.substring(9)), z10);
                return;
            } catch (Exception unused) {
            }
        }
        i10 = ((org.telegram.ui.ActionBar.e2) zx0Var).currentAccount;
        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.si.b0(i10).r.get(Q);
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
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), TLObject.FLAG_30));
    }
}
