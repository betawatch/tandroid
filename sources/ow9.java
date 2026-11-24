// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ow9 extends FrameLayout {
    public final Path a;
    public final Paint b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ wjb e;
    public final /* synthetic */ Integer f;
    public final /* synthetic */ tx9 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ow9(tx9 tx9Var, Context context, boolean z, boolean z2, wjb wjbVar, Integer num) {
        super(context);
        this.h = tx9Var;
        this.c = z;
        this.d = z2;
        this.e = wjbVar;
        this.f = num;
        this.a = new Path();
        this.b = new Paint(1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF;
        tx9 tx9Var = this.h;
        if (!tx9Var.R0) {
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
            bkb.m(paint);
        }
        paint.setColor(bkb.v0(bkb.F8, this.e));
        paint.setAlpha((int) (getAlpha() * 255.0f));
        float width = (this.f == null ? getWidth() / 2.0f : r1.intValue()) + gl.L(20.0f);
        float width2 = (getWidth() - getPaddingLeft()) - getPaddingRight();
        float height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (tx9Var.m()) {
            rectF = gl.P;
            rectF.set((width - (tx9Var.b1 * width)) + getPaddingLeft(), tb4.A(1.0f, tx9Var.c1, height, getPaddingTop()), ((width2 - width) * tx9Var.b1) + getPaddingLeft() + width, getPaddingTop() + height);
        } else {
            rectF = gl.P;
            rectF.set((width - (tx9Var.b1 * width)) + getPaddingLeft(), getPaddingTop(), ((width2 - width) * tx9Var.b1) + getPaddingLeft() + width, (height * tx9Var.c1) + getPaddingTop());
        }
        Path path = this.a;
        path.rewind();
        path.addRoundRect(rectF, gl.L(12.0f), gl.L(12.0f), Path.Direction.CW);
        canvas.drawPath(path, paint);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }
}
