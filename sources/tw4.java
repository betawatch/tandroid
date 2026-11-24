// default package

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class tw4 extends xie {
    public final RenderNode a = mk1.o();
    public final Paint b = new Paint(1);
    public final /* synthetic */ ww4 c;

    public tw4(ww4 ww4Var) {
        this.c = ww4Var;
    }

    @Override // xie
    public final void a(Rect rect, RectF rectF) {
        ww4 ww4Var = this.c;
        if (ww4Var.x || !this.a.hasDisplayList()) {
            int width = rect.width();
            int height = rect.height();
            int i = ww4Var.y;
            float f = (i == 1 || i == 4) ? height : width;
            xw4 xw4Var = ww4Var.G;
            xw4Var.getClass();
            LinearGradient l = ww4Var.l(xw4Var, f, 0.0f, ww4Var.K, 1);
            Paint paint = this.b;
            paint.setShader(l);
            this.a.setPosition(0, 0, width, height);
            this.a.beginRecording().drawRect(0.0f, 0.0f, width, height, paint);
            this.a.endRecording();
            paint.setShader(null);
            ww4Var.x = false;
        }
    }

    @Override // xie
    public final void b() {
        this.a.discardDisplayList();
    }

    @Override // xie
    public final void c(Canvas canvas) {
        canvas.drawRenderNode(this.a);
    }

    @Override // xie
    public final boolean d() {
        return this.a.hasDisplayList();
    }

    @Override // xie
    public final void e(float f) {
        this.a.setAlpha(f);
    }
}
