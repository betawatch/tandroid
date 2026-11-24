// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class qy9 extends FrameLayout {
    public final Path a;
    public final Paint b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ ylb e;
    public final /* synthetic */ Integer f;
    public final /* synthetic */ vz9 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qy9(vz9 vz9Var, Context context, boolean z, boolean z2, ylb ylbVar, Integer num) {
        super(context);
        this.h = vz9Var;
        this.c = z;
        this.d = z2;
        this.e = ylbVar;
        this.f = num;
        this.a = new Path();
        this.b = new Paint(1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF;
        vz9 vz9Var = this.h;
        if (!vz9Var.R0) {
            super.dispatchDraw(canvas);
            return;
        }
        if (!this.c) {
            super.dispatchDraw(canvas);
            return;
        }
        canvas.save();
        boolean z = this.d;
        Paint paint = this.b;
        if (z) {
            cmb.m(paint);
        }
        paint.setColor(cmb.v0(cmb.F8, this.e));
        paint.setAlpha((int) (getAlpha() * 255.0f));
        float width = (this.f == null ? getWidth() / 2.0f : r1.intValue()) + gm.L(20.0f);
        float width2 = (getWidth() - getPaddingLeft()) - getPaddingRight();
        float height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (vz9Var.m()) {
            rectF = gm.P;
            rectF.set((width - (vz9Var.b1 * width)) + getPaddingLeft(), td4.A(1.0f, vz9Var.c1, height, getPaddingTop()), ((width2 - width) * vz9Var.b1) + getPaddingLeft() + width, getPaddingTop() + height);
        } else {
            rectF = gm.P;
            rectF.set((width - (vz9Var.b1 * width)) + getPaddingLeft(), getPaddingTop(), ((width2 - width) * vz9Var.b1) + getPaddingLeft() + width, (height * vz9Var.c1) + getPaddingTop());
        }
        Path path = this.a;
        path.rewind();
        path.addRoundRect(rectF, gm.L(12.0f), gm.L(12.0f), Path.Direction.CW);
        canvas.drawPath(path, paint);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }
}
