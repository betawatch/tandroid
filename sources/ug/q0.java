package ug;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.TextureView;
import gi.c5;
import gi.x5;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.hs;
import org.telegram.ui.Components.ba;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class q0 extends org.telegram.ui.Cells.q1 {
    public final ba kd;
    public final float[] ld;
    public final Path md;
    public final Paint nd;
    public final Rect od;
    public final RectF pd;
    public final /* synthetic */ r0 qd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(r0 r0Var, Context context, int i3, s0 s0Var) {
        super(context, i3, false, null, s0Var);
        this.qd = r0Var;
        this.kd = new ba(r0Var.d, this, 10, false);
        this.ld = new float[8];
        this.md = new Path();
        Paint paint = new Paint();
        this.nd = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.od = new Rect();
        this.pd = new RectF();
    }

    @Override // org.telegram.ui.Cells.q1
    public final Paint Z1(String str) {
        if ("paintChatActionBackground".equals(str)) {
            this.qd.h.w0 = true;
            Paint c2 = this.kd.c(1.0f);
            if (c2 != null) {
                return c2;
            }
        }
        return super.Z1(str);
    }

    @Override // org.telegram.ui.Cells.q1
    public final boolean l1(Canvas canvas) {
        x5 x5Var;
        float[] fArr;
        ImageReceiver photoImage = getPhotoImage();
        r0 r0Var = this.qd;
        c5 c5Var = r0Var.h;
        if (!r0Var.f || photoImage == null || (((x5Var = r0Var.e) == null || !x5Var.g || !x5Var.d || !c5Var.y0) && !c5Var.v0 && (c5Var.x0 == null || !c5Var.N0.s0))) {
            return super.l1(canvas);
        }
        int i3 = 0;
        while (true) {
            int[] iArr = photoImage.X0;
            int length = iArr.length;
            fArr = this.ld;
            if (i3 >= length) {
                break;
            }
            int i10 = i3 * 2;
            float f10 = iArr[i3];
            fArr[i10] = f10;
            fArr[i10 + 1] = f10;
            i3++;
        }
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(photoImage.L0, photoImage.M0, photoImage.y(), photoImage.A());
        Path path = this.md;
        path.rewind();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        TextureView textureView = c5Var.x0;
        if (textureView == null || !c5Var.N0.s0) {
            canvas.drawPath(path, this.nd);
            return true;
        }
        Bitmap bitmap = textureView.getBitmap();
        if (bitmap == null) {
            return super.l1(canvas);
        }
        canvas.save();
        canvas.clipPath(path);
        canvas.translate(-getX(), -getY());
        float max = Math.max(photoImage.N0 / c5Var.z0, photoImage.O0 / c5Var.A0);
        canvas.translate(photoImage.r() - ((c5Var.z0 * max) / 2.0f), photoImage.s() - ((c5Var.A0 * max) / 2.0f));
        canvas.scale((c5Var.z0 / c5Var.x0.getWidth()) * max, (c5Var.A0 / c5Var.x0.getHeight()) * max);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Rect rect = this.od;
        rect.set(0, 0, width, height);
        float width2 = c5Var.x0.getWidth();
        float height2 = c5Var.x0.getHeight();
        RectF rectF2 = this.pd;
        rectF2.set(0.0f, 0.0f, width2, height2);
        canvas.drawBitmap(bitmap, rect, rectF2, (Paint) null);
        canvas.restore();
        return true;
    }

    @Override // org.telegram.ui.Cells.q1, android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        r0 r0Var = this.qd;
        x5 x5Var = r0Var.e;
        if ((x5Var != null && x5Var.g && x5Var.d) || r0Var.h.v0) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), hs.e4, 31);
        } else {
            canvas2 = canvas;
            canvas2.save();
        }
        d1(canvas2);
        canvas2.restore();
    }

    @Override // org.telegram.ui.Cells.q1, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
