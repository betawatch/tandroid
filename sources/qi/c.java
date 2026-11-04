package qi;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.support.v4.media.session.w;
import v7.q;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class c extends q {
    public final RenderNode b = w.n();
    public final Paint c = new Paint(1);
    public final /* synthetic */ f d;

    public c(f fVar) {
        this.d = fVar;
    }

    @Override // v7.q
    public final void a(Rect rect, RectF rectF) {
        f fVar = this.d;
        if (fVar.x || !this.b.hasDisplayList()) {
            int width = rect.width();
            int height = rect.height();
            int i3 = fVar.y;
            float f10 = (i3 == 1 || i3 == 4) ? height : width;
            g gVar = fVar.G;
            gVar.getClass();
            LinearGradient k10 = f.k(fVar, gVar, f10, 0, fVar.K, 1);
            Paint paint = this.c;
            paint.setShader(k10);
            this.b.setPosition(0, 0, width, height);
            this.b.beginRecording().drawRect(0.0f, 0.0f, width, height, paint);
            this.b.endRecording();
            paint.setShader(null);
            fVar.x = false;
        }
    }

    @Override // v7.q
    public final void b() {
        this.b.discardDisplayList();
    }

    @Override // v7.q
    public final void c(Canvas canvas) {
        canvas.drawRenderNode(this.b);
    }

    @Override // v7.q
    public final boolean d() {
        return this.b.hasDisplayList();
    }

    @Override // v7.q
    public final void e(float f10) {
        this.b.setAlpha(f10);
    }
}
