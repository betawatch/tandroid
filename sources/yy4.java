// default package

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class yy4 extends rne {
    public final RenderNode a = vk1.o();
    public final Paint b = new Paint(1);
    public final /* synthetic */ bz4 c;

    public yy4(bz4 bz4Var) {
        this.c = bz4Var;
    }

    @Override // rne
    public final void a(Rect rect, RectF rectF) {
        bz4 bz4Var = this.c;
        if (bz4Var.x || !this.a.hasDisplayList()) {
            int width = rect.width();
            int height = rect.height();
            int i = bz4Var.y;
            float f = (i == 1 || i == 4) ? height : width;
            cz4 cz4Var = bz4Var.G;
            cz4Var.getClass();
            LinearGradient l = bz4Var.l(cz4Var, f, 0.0f, bz4Var.K, 1);
            Paint paint = this.b;
            paint.setShader(l);
            this.a.setPosition(0, 0, width, height);
            this.a.beginRecording().drawRect(0.0f, 0.0f, width, height, paint);
            this.a.endRecording();
            paint.setShader(null);
            bz4Var.x = false;
        }
    }

    @Override // rne
    public final void b() {
        this.a.discardDisplayList();
    }

    @Override // rne
    public final void c(Canvas canvas) {
        canvas.drawRenderNode(this.a);
    }

    @Override // rne
    public final boolean d() {
        return this.a.hasDisplayList();
    }

    @Override // rne
    public final void e(float f) {
        this.a.setAlpha(f);
    }
}
