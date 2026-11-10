package tg;

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
import fi.e5;
import fi.x5;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.ba;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class r0 extends org.telegram.ui.Cells.q1 {
    public final ba ld;
    public final float[] md;
    public final Path nd;
    public final Paint od;
    public final Rect pd;
    public final RectF qd;
    public final /* synthetic */ s0 rd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(s0 s0Var, Context context, int i7, t0 t0Var) {
        super(context, i7, false, null, t0Var);
        this.rd = s0Var;
        this.ld = new ba(s0Var.d, this, 10, false);
        this.md = new float[8];
        this.nd = new Path();
        Paint paint = new Paint();
        this.od = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.pd = new Rect();
        this.qd = new RectF();
    }

    @Override // org.telegram.ui.Cells.q1
    public final Paint Z1(String str) {
        if ("paintChatActionBackground".equals(str)) {
            this.rd.h.v0 = true;
            Paint c10 = this.ld.c(1.0f);
            if (c10 != null) {
                return c10;
            }
        }
        return super.Z1(str);
    }

    @Override // org.telegram.ui.Cells.q1
    public final boolean l1(Canvas canvas) {
        x5 x5Var;
        float[] fArr;
        ImageReceiver photoImage = getPhotoImage();
        s0 s0Var = this.rd;
        e5 e5Var = s0Var.h;
        if (!s0Var.f || photoImage == null || (((x5Var = s0Var.e) == null || !x5Var.g || !x5Var.d || !e5Var.x0) && !e5Var.u0 && (e5Var.w0 == null || !e5Var.M0.r0))) {
            return super.l1(canvas);
        }
        int i7 = 0;
        while (true) {
            int[] iArr = photoImage.W0;
            int length = iArr.length;
            fArr = this.md;
            if (i7 >= length) {
                break;
            }
            int i10 = i7 * 2;
            float f10 = iArr[i7];
            fArr[i10] = f10;
            fArr[i10 + 1] = f10;
            i7++;
        }
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(photoImage.K0, photoImage.L0, photoImage.y(), photoImage.A());
        Path path = this.nd;
        path.rewind();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        TextureView textureView = e5Var.w0;
        if (textureView == null || !e5Var.M0.r0) {
            canvas.drawPath(path, this.od);
            return true;
        }
        Bitmap bitmap = textureView.getBitmap();
        if (bitmap == null) {
            return super.l1(canvas);
        }
        canvas.save();
        canvas.clipPath(path);
        canvas.translate(-getX(), -getY());
        float max = Math.max(photoImage.M0 / e5Var.y0, photoImage.N0 / e5Var.z0);
        canvas.translate(photoImage.r() - ((e5Var.y0 * max) / 2.0f), photoImage.s() - ((e5Var.z0 * max) / 2.0f));
        canvas.scale((e5Var.y0 / e5Var.w0.getWidth()) * max, (e5Var.z0 / e5Var.w0.getHeight()) * max);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Rect rect = this.pd;
        rect.set(0, 0, width, height);
        float width2 = e5Var.w0.getWidth();
        float height2 = e5Var.w0.getHeight();
        RectF rectF2 = this.qd;
        rectF2.set(0.0f, 0.0f, width2, height2);
        canvas.drawBitmap(bitmap, rect, rectF2, (Paint) null);
        canvas.restore();
        return true;
    }

    @Override // org.telegram.ui.Cells.q1, android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        s0 s0Var = this.rd;
        x5 x5Var = s0Var.e;
        if ((x5Var != null && x5Var.g && x5Var.d) || s0Var.h.u0) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), qs.e4, 31);
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
