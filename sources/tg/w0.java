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
import hi.e6;
import hi.l5;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ks;
import org.telegram.ui.Components.fa;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class w0 extends org.telegram.ui.Cells.r1 {
    public final float[] Ad;
    public final Path Bd;
    public final Paint Cd;
    public final Rect Dd;
    public final RectF Ed;
    public final /* synthetic */ x0 Fd;
    public final fa zd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(x0 x0Var, Context context, int i7, y0 y0Var) {
        super(context, i7, false, null, y0Var);
        this.Fd = x0Var;
        this.zd = new fa(x0Var.d, this, 10, false);
        this.Ad = new float[8];
        this.Bd = new Path();
        Paint paint = new Paint();
        this.Cd = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.Dd = new Rect();
        this.Ed = new RectF();
    }

    @Override // org.telegram.ui.Cells.r1
    public final Paint a2(String str) {
        if ("paintChatActionBackground".equals(str)) {
            this.Fd.h.x0 = true;
            Paint c10 = this.zd.c(1.0f);
            if (c10 != null) {
                return c10;
            }
        }
        return super.a2(str);
    }

    @Override // org.telegram.ui.Cells.r1
    public final boolean l1(Canvas canvas) {
        e6 e6Var;
        float[] fArr;
        ImageReceiver photoImage = getPhotoImage();
        x0 x0Var = this.Fd;
        l5 l5Var = x0Var.h;
        if (!x0Var.f || photoImage == null || (((e6Var = x0Var.e) == null || !e6Var.g || !e6Var.d || !l5Var.z0) && !l5Var.w0 && (l5Var.y0 == null || !l5Var.O0.s0))) {
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
        rectF.set(photoImage.L0, photoImage.M0, photoImage.z(), photoImage.B());
        Path path = this.Bd;
        path.rewind();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        TextureView textureView = l5Var.y0;
        if (textureView == null || !l5Var.O0.s0) {
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
        float max = Math.max(photoImage.N0 / l5Var.A0, photoImage.O0 / l5Var.B0);
        canvas.translate(photoImage.r() - ((l5Var.A0 * max) / 2.0f), photoImage.s() - ((l5Var.B0 * max) / 2.0f));
        canvas.scale((l5Var.A0 / l5Var.y0.getWidth()) * max, (l5Var.B0 / l5Var.y0.getHeight()) * max);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Rect rect = this.Dd;
        rect.set(0, 0, width, height);
        float width2 = l5Var.y0.getWidth();
        float height2 = l5Var.y0.getHeight();
        RectF rectF2 = this.Ed;
        rectF2.set(0.0f, 0.0f, width2, height2);
        canvas.drawBitmap(bitmap, rect, rectF2, (Paint) null);
        canvas.restore();
        return true;
    }

    @Override // org.telegram.ui.Cells.r1, android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        x0 x0Var = this.Fd;
        e6 e6Var = x0Var.e;
        if ((e6Var != null && e6Var.g && e6Var.d) || x0Var.h.w0) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), ks.e4, 31);
        } else {
            canvas2 = canvas;
            canvas2.save();
        }
        d1(canvas2);
        canvas2.restore();
    }

    @Override // org.telegram.ui.Cells.r1, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
