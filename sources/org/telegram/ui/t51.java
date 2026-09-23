package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class t51 extends FrameLayout {
    public final Path a;
    public final Paint b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ org.telegram.ui.ActionBar.d6 e;
    public final /* synthetic */ Integer f;
    public final /* synthetic */ z61 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t51(z61 z61Var, Context context, boolean z10, boolean z11, org.telegram.ui.ActionBar.d6 d6Var, Integer num) {
        super(context);
        this.h = z61Var;
        this.c = z10;
        this.d = z11;
        this.e = d6Var;
        this.f = num;
        this.a = new Path();
        this.b = new Paint(1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        z61 z61Var = this.h;
        if (!z61Var.Q0) {
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
            org.telegram.ui.ActionBar.h6.m(paint);
        }
        paint.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G8, this.e));
        paint.setAlpha((int) (getAlpha() * 255.0f));
        float width = (this.f == null ? getWidth() / 2.0f : r1.intValue()) + AndroidUtilities.dp(20.0f);
        float width2 = (getWidth() - getPaddingLeft()) - getPaddingRight();
        float height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (z61Var.n()) {
            AndroidUtilities.rectTmp.set((width - (z61Var.a1 * width)) + getPaddingLeft(), com.google.android.gms.internal.vision.e2.z(1.0f, z61Var.b1, height, getPaddingTop()), ((width2 - width) * z61Var.a1) + getPaddingLeft() + width, getPaddingTop() + height);
        } else {
            AndroidUtilities.rectTmp.set((width - (z61Var.a1 * width)) + getPaddingLeft(), getPaddingTop(), ((width2 - width) * z61Var.a1) + getPaddingLeft() + width, (height * z61Var.b1) + getPaddingTop());
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
