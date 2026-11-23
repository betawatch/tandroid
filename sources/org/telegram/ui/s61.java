package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class s61 extends FrameLayout {
    public final /* synthetic */ int a;
    public final RectF b;
    public final /* synthetic */ v71 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s61(v71 v71Var, Context context, int i7) {
        super(context);
        this.a = i7;
        switch (i7) {
            case 1:
                this.c = v71Var;
                super(context);
                this.b = new RectF();
                break;
            default:
                this.c = v71Var;
                this.b = new RectF();
                break;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                float measuredWidth = getMeasuredWidth();
                float measuredHeight = getMeasuredHeight();
                RectF rectF = this.b;
                rectF.set(0.0f, 0.0f, measuredWidth, measuredHeight);
                v71 v71Var = this.c;
                s61 s61Var = v71Var.F0;
                l71 l71Var = v71Var.z0;
                u61 u61Var = v71Var.a;
                org.telegram.ui.ActionBar.n6.t(s61Var, l71Var, u61Var);
                canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, u61Var.e("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.n6.d1()) {
                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, u61Var.e("paintChatActionBackgroundDarken"));
                    break;
                }
                break;
            default:
                float measuredWidth2 = getMeasuredWidth();
                float measuredHeight2 = getMeasuredHeight();
                RectF rectF2 = this.b;
                rectF2.set(0.0f, 0.0f, measuredWidth2, measuredHeight2);
                v71 v71Var2 = this.c;
                s61 s61Var2 = v71Var2.G0;
                l71 l71Var2 = v71Var2.z0;
                u61 u61Var2 = v71Var2.a;
                org.telegram.ui.ActionBar.n6.t(s61Var2, l71Var2, u61Var2);
                canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, u61Var2.e("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.n6.d1()) {
                    canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, u61Var2.e("paintChatActionBackgroundDarken"));
                    break;
                }
                break;
        }
    }
}
