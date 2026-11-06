package pi;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.support.v4.media.session.w;
import c8.ob;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public final class c extends ob {
    public final RenderNode a = w.n();
    public final Paint b = new Paint(1);
    public final /* synthetic */ f c;

    public c(f fVar) {
        this.c = fVar;
    }

    @Override // c8.ob
    public final void a(Rect rect, RectF rectF) {
        f fVar = this.c;
        if (fVar.x || !this.a.hasDisplayList()) {
            int width = rect.width();
            int height = rect.height();
            int i7 = fVar.y;
            float f10 = (i7 == 1 || i7 == 4) ? height : width;
            g gVar = fVar.F;
            gVar.getClass();
            LinearGradient k10 = f.k(fVar, gVar, f10, 0, fVar.J, 1);
            Paint paint = this.b;
            paint.setShader(k10);
            this.a.setPosition(0, 0, width, height);
            this.a.beginRecording().drawRect(0.0f, 0.0f, width, height, paint);
            this.a.endRecording();
            paint.setShader(null);
            fVar.x = false;
        }
    }

    @Override // c8.ob
    public final void b() {
        this.a.discardDisplayList();
    }

    @Override // c8.ob
    public final void c(Canvas canvas) {
        canvas.drawRenderNode(this.a);
    }

    @Override // c8.ob
    public final boolean d() {
        return this.a.hasDisplayList();
    }

    @Override // c8.ob
    public final void e(float f10) {
        this.a.setAlpha(f10);
    }
}
