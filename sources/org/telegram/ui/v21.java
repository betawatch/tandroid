package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class v21 extends FrameLayout {
    public final org.telegram.ui.Components.j5 a;
    public final /* synthetic */ w21 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v21(w21 w21Var, Context context) {
        super(context);
        this.b = w21Var;
        TextView g10 = org.telegram.messenger.y3.g(context, 1, 16.0f);
        g10.setTextColor(w21Var.getThemedColor(org.telegram.ui.ActionBar.k6.G6));
        g10.setText(LocaleController.getString(R.string.DoubleTapSetting));
        addView(g10, k7.c6.d(-1, -2.0f, 23, 20.0f, 0.0f, 48.0f, 0.0f));
        this.a = new org.telegram.ui.Components.j5(AndroidUtilities.dp(24.0f), this);
    }

    public final void a(boolean z4) {
        int i10;
        int i11;
        w21 w21Var = this.b;
        i10 = ((org.telegram.ui.ActionBar.p2) w21Var).currentAccount;
        String doubleTapReaction = MediaDataController.getInstance(i10).getDoubleTapReaction();
        org.telegram.ui.Components.j5 j5Var = this.a;
        if (doubleTapReaction != null && doubleTapReaction.startsWith("animated_")) {
            try {
                j5Var.j(Long.parseLong(doubleTapReaction.substring(9)), z4);
                return;
            } catch (Exception unused) {
            }
        }
        i11 = ((org.telegram.ui.ActionBar.p2) w21Var).currentAccount;
        TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i11).getReactionsMap().get(doubleTapReaction);
        if (tL_availableReaction != null) {
            j5Var.i(tL_availableReaction.static_icon, z4);
        }
    }

    public final void b() {
        int width = getWidth();
        org.telegram.ui.Components.j5 j5Var = this.a;
        j5Var.setBounds((width - j5Var.s) - AndroidUtilities.dp(21.0f), (getHeight() - j5Var.s) / 2, getWidth() - AndroidUtilities.dp(21.0f), (getHeight() + j5Var.s) / 2);
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
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), TLObject.FLAG_30));
    }
}
