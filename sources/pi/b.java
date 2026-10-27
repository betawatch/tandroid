package pi;

import a8.lf;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.support.v4.media.session.x;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class b extends lf {
    public final RenderNode a = x.n();
    public final Paint b = new Paint(1);
    public final /* synthetic */ e c;

    public b(e eVar) {
        this.c = eVar;
    }

    @Override // a8.lf
    public final void a(Rect rect, RectF rectF) {
        e eVar = this.c;
        if (eVar.v || !this.a.hasDisplayList()) {
            int width = rect.width();
            int height = rect.height();
            int i10 = eVar.w;
            float f7 = (i10 == 1 || i10 == 4) ? height : width;
            f fVar = eVar.E;
            fVar.getClass();
            LinearGradient l4 = e.l(eVar, fVar, f7, 0, eVar.I, 1);
            Paint paint = this.b;
            paint.setShader(l4);
            this.a.setPosition(0, 0, width, height);
            this.a.beginRecording().drawRect(0.0f, 0.0f, width, height, paint);
            this.a.endRecording();
            paint.setShader(null);
            eVar.v = false;
        }
    }

    @Override // a8.lf
    public final void b() {
        this.a.discardDisplayList();
    }

    @Override // a8.lf
    public final void c(Canvas canvas) {
        canvas.drawRenderNode(this.a);
    }

    @Override // a8.lf
    public final boolean d() {
        return this.a.hasDisplayList();
    }

    @Override // a8.lf
    public final void e(float f7) {
        this.a.setAlpha(f7);
    }
}
