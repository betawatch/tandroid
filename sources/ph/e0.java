package ph;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.ui.BubbleActivity;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class e0 extends View {
    public final Paint a;
    public final Path b;
    public final RectF c;
    public final /* synthetic */ f0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(f0 f0Var, Context context) {
        super(context);
        this.d = f0Var;
        this.a = new Paint(1);
        this.b = new Path();
        this.c = new RectF();
        new Matrix();
        new Matrix();
        new Matrix();
    }

    private float getContainerHeight() {
        boolean z4 = getContext() instanceof BubbleActivity;
        a0 a0Var = this.d.h;
        return ((getHeight() - (a0Var.B + (!z4 ? AndroidUtilities.statusBarHeight : 0))) - a0Var.y) - AndroidUtilities.dp(32.0f);
    }

    private float getContainerWidth() {
        return getWidth() - AndroidUtilities.dp(32.0f);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int currentWidth;
        int currentHeight;
        boolean z4;
        MediaController.CropState cropState;
        float f10;
        float f11;
        f0 f0Var = this.d;
        a0 a0Var = f0Var.h;
        int[] iArr = f0Var.x;
        l5 l5Var = f0Var.a;
        if (f0Var.b == null) {
            return;
        }
        canvas.save();
        Paint paint = this.a;
        paint.setColor(-16777216);
        paint.setAlpha((int) (f0Var.s * 255.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        if (f0Var.s < 1.0f) {
            Path path = this.b;
            path.rewind();
            float width = l5Var.getWidth();
            float height = l5Var.getHeight();
            RectF rectF = this.c;
            rectF.set(0.0f, 0.0f, width, height);
            int[] iArr2 = f0Var.w;
            rectF.offset(iArr2[0], iArr2[1]);
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
            AndroidUtilities.lerp(rectF, rectF2, f0Var.s, rectF);
            float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), 0, f0Var.s);
            path.addRoundRect(rectF, lerp, lerp, Path.Direction.CW);
            canvas.clipPath(path);
        }
        float f12 = f0Var.s;
        float f13 = 1.0f - f12;
        int[] iArr3 = f0Var.v;
        canvas.translate((-iArr3[0]) * f13, (-iArr3[1]) * f13);
        if (f13 > 0.0f) {
            if (f0Var.B) {
                f0Var.b.getLocationOnScreen(iArr);
            }
            canvas.translate(iArr[0] * f13, iArr[1] * f13);
            MediaController.CropState cropState2 = f0Var.b.D0;
            if (cropState2 != null) {
                f11 = cropState2.cropPw;
                f10 = cropState2.cropPh;
            } else {
                f10 = 1.0f;
                f11 = 1.0f;
            }
            float lerp2 = AndroidUtilities.lerp(1.0f, (f0Var.b.getScaleX() * (r9.getWidth() / f11)) / l5Var.getWidth(), f13);
            canvas.scale(lerp2, lerp2);
            canvas.rotate(f0Var.b.getRotation() * f13);
            canvas.translate(((f0Var.b.getContentWidth() * f11) / 2.0f) * f13, ((f0Var.b.getContentHeight() * f10) / 2.0f) * f13);
        }
        canvas.translate(((getContainerWidth() / 2.0f) + AndroidUtilities.dp(16.0f)) * f12, (((getContainerHeight() + AndroidUtilities.dp(32.0f)) / 2.0f) + a0Var.B + (!(getContext() instanceof BubbleActivity) ? AndroidUtilities.statusBarHeight : 0)) * f12);
        if (f13 > 0.0f) {
            float contentWidth = f0Var.b.getContentWidth();
            float contentHeight = f0Var.b.getContentHeight();
            MediaController.CropState cropState3 = f0Var.b.D0;
            float f14 = cropState3 != null ? cropState3.cropPw : 1.0f;
            float f15 = cropState3 != null ? cropState3.cropPh : 1.0f;
            float lerp3 = (AndroidUtilities.lerp(1.0f, f14, f13) * contentWidth) / 2.0f;
            float lerp4 = (AndroidUtilities.lerp(1.0f, f15, f13) * contentHeight) / 2.0f;
            float lerp5 = AndroidUtilities.lerp(1.0f, 4.0f, f12);
            canvas.clipRect((-lerp3) * lerp5, (-lerp4) * lerp5, lerp3 * lerp5, lerp4 * lerp5);
        }
        currentWidth = f0Var.getCurrentWidth();
        yf.f fVar = f0Var.y;
        currentHeight = f0Var.getCurrentHeight();
        int i10 = fVar.i;
        if (i10 == 90 || i10 == 270) {
            currentHeight = currentWidth;
            currentWidth = currentHeight;
        }
        float w10 = e2.c.w(fVar.l, 1.0f, f13, 1.0f);
        float f16 = currentWidth;
        float containerWidth = getContainerWidth() / f16;
        float f17 = currentHeight;
        if (containerWidth * f17 > getContainerHeight()) {
            containerWidth = getContainerHeight() / f17;
        }
        canvas.translate(fVar.d * 1.0f, fVar.e * 1.0f);
        float f18 = (fVar.f / w10) * containerWidth;
        dg.v2 v2Var = f0Var.b;
        float lerp6 = (v2Var == null || (cropState = v2Var.D0) == null) ? AndroidUtilities.lerp(1.0f, f18, f12) : AndroidUtilities.lerp(cropState.cropScale, f18, f12);
        canvas.scale(lerp6, lerp6);
        canvas.translate(fVar.b * f16 * 1.0f, fVar.c * f17 * 1.0f);
        float d = f0Var.d.d(i10, false) + f0Var.b.getOrientation() + fVar.g;
        MediaController.CropState cropState4 = f0Var.b.D0;
        canvas.rotate(cropState4 == null ? AndroidUtilities.lerp(0.0f, d, f0Var.s) : AndroidUtilities.lerp(cropState4.cropRotate + cropState4.transformRotation, d, f0Var.s));
        canvas.rotate(f0Var.b.getOrientation());
        org.telegram.ui.Components.z5 z5Var = f0Var.c;
        if (f0Var.B) {
            MediaController.CropState cropState5 = f0Var.b.D0;
            if (cropState5 != null && cropState5.mirrored) {
                z4 = true;
            }
            z4 = false;
        } else {
            yf.l lVar = a0Var.I;
            if (lVar != null) {
                z4 = lVar.j;
            }
            z4 = false;
        }
        canvas.scale(AndroidUtilities.lerp(1.0f, -1.0f, z5Var.e(z4)), 1.0f);
        canvas.translate((-f0Var.b.getContentWidth()) / 2.0f, (-f0Var.b.getContentHeight()) / 2.0f);
        dg.v2 v2Var2 = f0Var.b;
        Paint paint2 = v2Var2.C0;
        Bitmap bitmap = v2Var2.x0;
        if (bitmap != null) {
            paint2.setAlpha(255);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint2);
        }
        canvas.restore();
    }
}
