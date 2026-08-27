package zf;

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
import lh.p6;
import lh.r5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.da;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class z0 extends org.telegram.ui.Cells.s1 {
    public final da Be;
    public final float[] Ce;
    public final Path De;
    public final Paint Ee;
    public final Rect Fe;
    public final RectF Ge;
    public final /* synthetic */ a1 He;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(a1 a1Var, Context context, int i10, com.google.firebase.messaging.m mVar) {
        super(context, i10, false, null, mVar);
        this.He = a1Var;
        this.Be = new da(a1Var.d, this, 10, false);
        this.Ce = new float[8];
        this.De = new Path();
        Paint paint = new Paint();
        this.Ee = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.Fe = new Rect();
        this.Ge = new RectF();
    }

    @Override // org.telegram.ui.Cells.s1
    public final Paint L2(String str) {
        if ("paintChatActionBackground".equals(str)) {
            this.He.h.r0 = true;
            Paint c10 = this.Be.c(1.0f);
            if (c10 != null) {
                return c10;
            }
        }
        return super.L2(str);
    }

    @Override // org.telegram.ui.Cells.s1
    public final boolean Z1(Canvas canvas) {
        p6 p6Var;
        float[] fArr;
        ImageReceiver photoImage = getPhotoImage();
        a1 a1Var = this.He;
        r5 r5Var = a1Var.h;
        if (!a1Var.f || photoImage == null || (((p6Var = a1Var.e) == null || !p6Var.g || !p6Var.d || !r5Var.t0) && !r5Var.q0 && (r5Var.s0 == null || !r5Var.I0.E0))) {
            return super.Z1(canvas);
        }
        int i10 = 0;
        while (true) {
            int length = photoImage.getRoundRadius().length;
            fArr = this.Ce;
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
        Path path = this.De;
        path.rewind();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        TextureView textureView = r5Var.s0;
        if (textureView == null || !r5Var.I0.E0) {
            canvas.drawPath(path, this.Ee);
            return true;
        }
        Bitmap bitmap = textureView.getBitmap();
        if (bitmap == null) {
            return super.Z1(canvas);
        }
        canvas.save();
        canvas.clipPath(path);
        canvas.translate(-getX(), -getY());
        float max = Math.max(photoImage.getImageWidth() / r5Var.u0, photoImage.getImageHeight() / r5Var.v0);
        canvas.translate(photoImage.getCenterX() - ((r5Var.u0 * max) / 2.0f), photoImage.getCenterY() - ((r5Var.v0 * max) / 2.0f));
        canvas.scale((r5Var.u0 / r5Var.s0.getWidth()) * max, (r5Var.v0 / r5Var.s0.getHeight()) * max);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Rect rect = this.Fe;
        rect.set(0, 0, width, height);
        float width2 = r5Var.s0.getWidth();
        float height2 = r5Var.s0.getHeight();
        RectF rectF2 = this.Ge;
        rectF2.set(0.0f, 0.0f, width2, height2);
        canvas.drawBitmap(bitmap, rect, rectF2, (Paint) null);
        canvas.restore();
        return true;
    }

    @Override // org.telegram.ui.Cells.s1, android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        a1 a1Var = this.He;
        p6 p6Var = a1Var.e;
        if ((p6Var != null && p6Var.g && p6Var.d) || a1Var.h.q0) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        } else {
            canvas2 = canvas;
            canvas2.save();
        }
        R1(canvas2);
        canvas2.restore();
    }

    @Override // org.telegram.ui.Cells.s1, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
