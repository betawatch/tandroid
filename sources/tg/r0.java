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
import hi.c5;
import hi.w5;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ns;
import org.telegram.ui.Components.y9;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class r0 extends org.telegram.ui.Cells.q1 {
    public final float[] Ad;
    public final Path Bd;
    public final Paint Cd;
    public final Rect Dd;
    public final RectF Ed;
    public final /* synthetic */ s0 Fd;
    public final y9 zd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(s0 s0Var, Context context, int i7, t0 t0Var) {
        super(context, i7, false, null, t0Var);
        this.Fd = s0Var;
        this.zd = new y9(s0Var.d, this, 10, false);
        this.Ad = new float[8];
        this.Bd = new Path();
        Paint paint = new Paint();
        this.Cd = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.Dd = new Rect();
        this.Ed = new RectF();
    }

    @Override // org.telegram.ui.Cells.q1
    public final Paint a2(String str) {
        if ("paintChatActionBackground".equals(str)) {
            this.Fd.h.w0 = true;
            Paint c10 = this.zd.c(1.0f);
            if (c10 != null) {
                return c10;
            }
        }
        return super.a2(str);
    }

    @Override // org.telegram.ui.Cells.q1
    public final boolean l1(Canvas canvas) {
        w5 w5Var;
        float[] fArr;
        ImageReceiver photoImage = getPhotoImage();
        s0 s0Var = this.Fd;
        c5 c5Var = s0Var.h;
        if (!s0Var.f || photoImage == null || (((w5Var = s0Var.e) == null || !w5Var.g || !w5Var.d || !c5Var.y0) && !c5Var.v0 && (c5Var.x0 == null || !c5Var.N0.s0))) {
            return super.l1(canvas);
        }
        int i7 = 0;
        while (true) {
            int[] iArr = photoImage.X0;
            int length = iArr.length;
            fArr = this.Ad;
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
        rectF.set(photoImage.L0, photoImage.M0, photoImage.y(), photoImage.A());
        Path path = this.Bd;
        path.rewind();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        TextureView textureView = c5Var.x0;
        if (textureView == null || !c5Var.N0.s0) {
            canvas.drawPath(path, this.Cd);
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
        Rect rect = this.Dd;
        rect.set(0, 0, width, height);
        float width2 = c5Var.x0.getWidth();
        float height2 = c5Var.x0.getHeight();
        RectF rectF2 = this.Ed;
        rectF2.set(0.0f, 0.0f, width2, height2);
        canvas.drawBitmap(bitmap, rect, rectF2, (Paint) null);
        canvas.restore();
        return true;
    }

    @Override // org.telegram.ui.Cells.q1, android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        s0 s0Var = this.Fd;
        w5 w5Var = s0Var.e;
        if ((w5Var != null && w5Var.g && w5Var.d) || s0Var.h.v0) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), ns.e4, 31);
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
