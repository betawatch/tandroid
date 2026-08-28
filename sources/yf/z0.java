package yf;

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
import kh.q6;
import kh.s5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.fa;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class z0 extends org.telegram.ui.Cells.t1 {
    public final fa Be;
    public final float[] Ce;
    public final Path De;
    public final Paint Ee;
    public final Rect Fe;
    public final RectF Ge;
    public final /* synthetic */ a1 He;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(a1 a1Var, Context context, int i9, com.google.firebase.messaging.m mVar) {
        super(context, i9, false, null, mVar);
        this.He = a1Var;
        this.Be = new fa(a1Var.d, this, 10, false);
        this.Ce = new float[8];
        this.De = new Path();
        Paint paint = new Paint();
        this.Ee = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.Fe = new Rect();
        this.Ge = new RectF();
    }

    @Override // org.telegram.ui.Cells.t1
    public final Paint M2(String str) {
        if ("paintChatActionBackground".equals(str)) {
            this.He.h.r0 = true;
            Paint c10 = this.Be.c(1.0f);
            if (c10 != null) {
                return c10;
            }
        }
        return super.M2(str);
    }

    @Override // org.telegram.ui.Cells.t1
    public final boolean a2(Canvas canvas) {
        q6 q6Var;
        float[] fArr;
        ImageReceiver photoImage = getPhotoImage();
        a1 a1Var = this.He;
        s5 s5Var = a1Var.h;
        if (!a1Var.f || photoImage == null || (((q6Var = a1Var.e) == null || !q6Var.g || !q6Var.d || !s5Var.t0) && !s5Var.q0 && (s5Var.s0 == null || !s5Var.I0.E0))) {
            return super.a2(canvas);
        }
        int i9 = 0;
        while (true) {
            int length = photoImage.getRoundRadius().length;
            fArr = this.Ce;
            if (i9 >= length) {
                break;
            }
            int i10 = i9 * 2;
            fArr[i10] = photoImage.getRoundRadius()[i9];
            fArr[i10 + 1] = photoImage.getRoundRadius()[i9];
            i9++;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(photoImage.getImageX(), photoImage.getImageY(), photoImage.getImageX2(), photoImage.getImageY2());
        Path path = this.De;
        path.rewind();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        TextureView textureView = s5Var.s0;
        if (textureView == null || !s5Var.I0.E0) {
            canvas.drawPath(path, this.Ee);
            return true;
        }
        Bitmap bitmap = textureView.getBitmap();
        if (bitmap == null) {
            return super.a2(canvas);
        }
        canvas.save();
        canvas.clipPath(path);
        canvas.translate(-getX(), -getY());
        float max = Math.max(photoImage.getImageWidth() / s5Var.u0, photoImage.getImageHeight() / s5Var.v0);
        canvas.translate(photoImage.getCenterX() - ((s5Var.u0 * max) / 2.0f), photoImage.getCenterY() - ((s5Var.v0 * max) / 2.0f));
        canvas.scale((s5Var.u0 / s5Var.s0.getWidth()) * max, (s5Var.v0 / s5Var.s0.getHeight()) * max);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Rect rect = this.Fe;
        rect.set(0, 0, width, height);
        float width2 = s5Var.s0.getWidth();
        float height2 = s5Var.s0.getHeight();
        RectF rectF2 = this.Ge;
        rectF2.set(0.0f, 0.0f, width2, height2);
        canvas.drawBitmap(bitmap, rect, rectF2, (Paint) null);
        canvas.restore();
        return true;
    }

    @Override // org.telegram.ui.Cells.t1, android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        a1 a1Var = this.He;
        q6 q6Var = a1Var.e;
        if ((q6Var != null && q6Var.g && q6Var.d) || a1Var.h.q0) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        } else {
            canvas2 = canvas;
            canvas2.save();
        }
        S1(canvas2);
        canvas2.restore();
    }

    @Override // org.telegram.ui.Cells.t1, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
