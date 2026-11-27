// default package

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class rv8 extends View {
    public final /* synthetic */ sv8 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rv8(sv8 sv8Var, Context context) {
        super(context);
        this.a = sv8Var;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        sv8 sv8Var = this.a;
        RectF rectF = sv8Var.E;
        Bitmap bitmap = sv8Var.H;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawBitmap(sv8Var.H, (Rect) null, rectF, sv8Var.y);
    }
}
