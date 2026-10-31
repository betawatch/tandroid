package vh;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class y7 extends View {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Canvas b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ Paint f;
    public final /* synthetic */ Bitmap h;
    public final /* synthetic */ Paint n;
    public final /* synthetic */ float r;
    public final /* synthetic */ float s;
    public final /* synthetic */ o8 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y7(o8 o8Var, Context context, boolean z10, Canvas canvas, float f7, float f10, float f11, Paint paint, Bitmap bitmap, Paint paint2, float f12, float f13) {
        super(context);
        this.w = o8Var;
        this.a = z10;
        this.b = canvas;
        this.c = f7;
        this.d = f10;
        this.e = f11;
        this.f = paint;
        this.h = bitmap;
        this.n = paint2;
        this.r = f12;
        this.s = f13;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        boolean z10 = this.a;
        Paint paint = this.n;
        float f7 = this.e;
        float f10 = this.d;
        float f11 = this.c;
        o8 o8Var = this.w;
        if (z10) {
            float f12 = o8Var.D2;
            if (f12 > 0.0f) {
                this.b.drawCircle(f11, f10, f7 * f12, this.f);
            }
            canvas.drawBitmap(this.h, 0.0f, 0.0f, paint);
        } else {
            canvas.drawCircle(f11, f10, (1.0f - o8Var.D2) * f7, paint);
        }
        canvas.save();
        canvas.translate(this.r, this.s);
        o8Var.i1.draw(canvas);
        canvas.restore();
    }
}
