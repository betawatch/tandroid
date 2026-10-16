package rg;

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
import di.a6;
import di.z6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.pa;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class b1 extends org.telegram.ui.Cells.u1 {
    public final pa Ge;
    public final float[] He;
    public final Path Ie;
    public final Paint Je;
    public final Rect Ke;
    public final RectF Le;
    public final /* synthetic */ c1 Me;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(c1 c1Var, Context context, int i10, com.google.firebase.messaging.m mVar) {
        super(context, i10, false, null, mVar);
        this.Me = c1Var;
        this.Ge = new pa(c1Var.d, this, 10, false);
        this.He = new float[8];
        this.Ie = new Path();
        Paint paint = new Paint();
        this.Je = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.Ke = new Rect();
        this.Le = new RectF();
    }

    @Override // org.telegram.ui.Cells.u1
    public final Paint M2(String str) {
        if ("paintChatActionBackground".equals(str)) {
            this.Me.h.v0 = true;
            Paint c10 = this.Ge.c(1.0f);
            if (c10 != null) {
                return c10;
            }
        }
        return super.M2(str);
    }

    @Override // org.telegram.ui.Cells.u1
    public final boolean a2(Canvas canvas) {
        z6 z6Var;
        float[] fArr;
        ImageReceiver photoImage = getPhotoImage();
        c1 c1Var = this.Me;
        a6 a6Var = c1Var.h;
        if (!c1Var.f || photoImage == null || (((z6Var = c1Var.e) == null || !z6Var.g || !z6Var.d || !a6Var.x0) && !a6Var.u0 && (a6Var.w0 == null || !a6Var.M0.I0))) {
            return super.a2(canvas);
        }
        int i10 = 0;
        while (true) {
            int length = photoImage.getRoundRadius().length;
            fArr = this.He;
            if (i10 >= length) {
                break;
            }
            int i11 = i10 * 2;
            fArr[i11] = photoImage.getRoundRadius()[i10];
            fArr[i11 + 1] = photoImage.getRoundRadius()[i10];
            i10++;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(photoImage.getImageX(), photoImage.getImageY(), photoImage.getImageX2(), photoImage.getImageY2());
        Path path = this.Ie;
        path.rewind();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        TextureView textureView = a6Var.w0;
        if (textureView == null || !a6Var.M0.I0) {
            canvas.drawPath(path, this.Je);
            return true;
        }
        Bitmap bitmap = textureView.getBitmap();
        if (bitmap == null) {
            return super.a2(canvas);
        }
        canvas.save();
        canvas.clipPath(path);
        canvas.translate(-getX(), -getY());
        float max = Math.max(photoImage.getImageWidth() / a6Var.y0, photoImage.getImageHeight() / a6Var.z0);
        canvas.translate(photoImage.getCenterX() - ((a6Var.y0 * max) / 2.0f), photoImage.getCenterY() - ((a6Var.z0 * max) / 2.0f));
        canvas.scale((a6Var.y0 / a6Var.w0.getWidth()) * max, (a6Var.z0 / a6Var.w0.getHeight()) * max);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Rect rect = this.Ke;
        rect.set(0, 0, width, height);
        float width2 = a6Var.w0.getWidth();
        float height2 = a6Var.w0.getHeight();
        RectF rectF2 = this.Le;
        rectF2.set(0.0f, 0.0f, width2, height2);
        canvas.drawBitmap(bitmap, rect, rectF2, (Paint) null);
        canvas.restore();
        return true;
    }

    @Override // org.telegram.ui.Cells.u1, android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        c1 c1Var = this.Me;
        z6 z6Var = c1Var.e;
        if ((z6Var != null && z6Var.g && z6Var.d) || c1Var.h.u0) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        } else {
            canvas2 = canvas;
            canvas2.save();
        }
        S1(canvas2);
        canvas2.restore();
    }

    @Override // org.telegram.ui.Cells.u1, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
