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
import di.c6;
import di.c7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.na;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class b1 extends org.telegram.ui.Cells.t1 {
    public final na Fe;
    public final float[] Ge;
    public final Path He;
    public final Paint Ie;
    public final Rect Je;
    public final RectF Ke;
    public final /* synthetic */ c1 Le;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(c1 c1Var, Context context, int i10, com.google.firebase.messaging.n nVar) {
        super(context, i10, false, null, nVar);
        this.Le = c1Var;
        this.Fe = new na(c1Var.d, this, 10, false);
        this.Ge = new float[8];
        this.He = new Path();
        Paint paint = new Paint();
        this.Ie = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.Je = new Rect();
        this.Ke = new RectF();
    }

    @Override // org.telegram.ui.Cells.t1
    public final Paint M2(String str) {
        if ("paintChatActionBackground".equals(str)) {
            this.Le.h.v0 = true;
            Paint c10 = this.Fe.c(1.0f);
            if (c10 != null) {
                return c10;
            }
        }
        return super.M2(str);
    }

    @Override // org.telegram.ui.Cells.t1
    public final boolean a2(Canvas canvas) {
        c7 c7Var;
        float[] fArr;
        ImageReceiver photoImage = getPhotoImage();
        c1 c1Var = this.Le;
        c6 c6Var = c1Var.h;
        if (!c1Var.f || photoImage == null || (((c7Var = c1Var.e) == null || !c7Var.g || !c7Var.d || !c6Var.x0) && !c6Var.u0 && (c6Var.w0 == null || !c6Var.M0.I0))) {
            return super.a2(canvas);
        }
        int i10 = 0;
        while (true) {
            int length = photoImage.getRoundRadius().length;
            fArr = this.Ge;
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
        Path path = this.He;
        path.rewind();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        TextureView textureView = c6Var.w0;
        if (textureView == null || !c6Var.M0.I0) {
            canvas.drawPath(path, this.Ie);
            return true;
        }
        Bitmap bitmap = textureView.getBitmap();
        if (bitmap == null) {
            return super.a2(canvas);
        }
        canvas.save();
        canvas.clipPath(path);
        canvas.translate(-getX(), -getY());
        float max = Math.max(photoImage.getImageWidth() / c6Var.y0, photoImage.getImageHeight() / c6Var.z0);
        canvas.translate(photoImage.getCenterX() - ((c6Var.y0 * max) / 2.0f), photoImage.getCenterY() - ((c6Var.z0 * max) / 2.0f));
        canvas.scale((c6Var.y0 / c6Var.w0.getWidth()) * max, (c6Var.z0 / c6Var.w0.getHeight()) * max);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Rect rect = this.Je;
        rect.set(0, 0, width, height);
        float width2 = c6Var.w0.getWidth();
        float height2 = c6Var.w0.getHeight();
        RectF rectF2 = this.Ke;
        rectF2.set(0.0f, 0.0f, width2, height2);
        canvas.drawBitmap(bitmap, rect, rectF2, (Paint) null);
        canvas.restore();
        return true;
    }

    @Override // org.telegram.ui.Cells.t1, android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        c1 c1Var = this.Le;
        c7 c7Var = c1Var.e;
        if ((c7Var != null && c7Var.g && c7Var.d) || c1Var.h.u0) {
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
