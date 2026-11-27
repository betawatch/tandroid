// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class xoc extends va6 {
    public final Paint M;
    public final /* synthetic */ zoc N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xoc(zoc zocVar, vnb vnbVar) {
        super(vnbVar);
        this.N = zocVar;
        Paint paint = new Paint(1);
        this.M = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    @Override // va6
    public final void b(Canvas canvas, Path path) {
        super.b(canvas, path);
        zoc zocVar = this.N;
        RectF rectF = zocVar.f;
        if (zocVar.o0 != null) {
            canvas.saveLayer(rectF, null);
            zocVar.o0.c((hl.L(206.0f) - zocVar.o0.j()) / 2.0f, (rectF.bottom - hl.L(7.0f)) - zocVar.o0.h(), 1.0f, -1, canvas);
            Shader shader = this.x.getShader();
            Paint paint = this.M;
            paint.setShader(shader);
            canvas.drawRect(rectF, paint);
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.N.a.invalidate();
    }
}
