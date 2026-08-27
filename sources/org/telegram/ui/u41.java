package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class u41 extends FrameLayout {
    public final Path a;
    public final Paint b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 e;
    public final /* synthetic */ Integer f;
    public final /* synthetic */ a61 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u41(a61 a61Var, Context context, boolean z10, boolean z11, org.telegram.ui.ActionBar.c6 c6Var, Integer num) {
        super(context);
        this.h = a61Var;
        this.c = z10;
        this.d = z11;
        this.e = c6Var;
        this.f = num;
        this.a = new Path();
        this.b = new Paint(1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        a61 a61Var = this.h;
        if (!a61Var.M0) {
            super.dispatchDraw(canvas);
            return;
        }
        if (!this.c) {
            super.dispatchDraw(canvas);
            return;
        }
        canvas.save();
        boolean z10 = this.d;
        Paint paint = this.b;
        if (z10) {
            org.telegram.ui.ActionBar.g6.m(paint);
        }
        paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G8, this.e));
        paint.setAlpha((int) (getAlpha() * 255.0f));
        float width = (this.f == null ? getWidth() / 2.0f : r1.intValue()) + AndroidUtilities.dp(20.0f);
        float width2 = (getWidth() - getPaddingLeft()) - getPaddingRight();
        float height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (a61Var.n()) {
            AndroidUtilities.rectTmp.set((width - (a61Var.W0 * width)) + getPaddingLeft(), com.google.android.recaptcha.internal.a.z(1.0f, a61Var.X0, height, getPaddingTop()), ((width2 - width) * a61Var.W0) + getPaddingLeft() + width, getPaddingTop() + height);
        } else {
            AndroidUtilities.rectTmp.set((width - (a61Var.W0 * width)) + getPaddingLeft(), getPaddingTop(), ((width2 - width) * a61Var.W0) + getPaddingLeft() + width, (height * a61Var.X0) + getPaddingTop());
        }
        Path path = this.a;
        path.rewind();
        path.addRoundRect(AndroidUtilities.rectTmp, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
        canvas.drawPath(path, paint);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }
}
