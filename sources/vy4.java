// default package

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class vy4 extends yke {
    public final RenderNode a = ul1.o();
    public final Paint b = new Paint(1);
    public final /* synthetic */ yy4 c;

    public vy4(yy4 yy4Var) {
        this.c = yy4Var;
    }

    @Override // yke
    public final void a(Rect rect, RectF rectF) {
        yy4 yy4Var = this.c;
        if (yy4Var.x || !this.a.hasDisplayList()) {
            int width = rect.width();
            int height = rect.height();
            int i = yy4Var.y;
            float f = (i == 1 || i == 4) ? height : width;
            zy4 zy4Var = yy4Var.G;
            zy4Var.getClass();
            LinearGradient l = yy4Var.l(zy4Var, f, 0.0f, yy4Var.K, 1);
            Paint paint = this.b;
            paint.setShader(l);
            this.a.setPosition(0, 0, width, height);
            this.a.beginRecording().drawRect(0.0f, 0.0f, width, height, paint);
            this.a.endRecording();
            paint.setShader(null);
            yy4Var.x = false;
        }
    }

    @Override // yke
    public final void b() {
        this.a.discardDisplayList();
    }

    @Override // yke
    public final void c(Canvas canvas) {
        canvas.drawRenderNode(this.a);
    }

    @Override // yke
    public final boolean d() {
        return this.a.hasDisplayList();
    }

    @Override // yke
    public final void e(float f) {
        this.a.setAlpha(f);
    }
}
