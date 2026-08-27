package qg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.y1;
import org.telegram.ui.Components.tu0;
import zf.o2;
import zf.t2;
import zf.x1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class f extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(KeyEvent.Callback callback, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = callback;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, int i11) {
        switch (this.a) {
            case 0:
                super.addView(view, i10, i11);
                ((g) this.b).e();
                break;
            default:
                super.addView(view, i10, i11);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.a) {
            case 3:
                t2 t2Var = (t2) this.b;
                if (t2Var.y <= 0.0f || t2Var.s == null) {
                    canvas2 = canvas;
                } else {
                    t2Var.v.reset();
                    float width = getWidth() / t2Var.n.getWidth();
                    t2Var.v.postScale(width, width);
                    t2Var.r.setLocalMatrix(t2Var.v);
                    t2Var.s.setAlpha((int) (t2Var.y * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), t2Var.s);
                }
                super.dispatchDraw(canvas2);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.a) {
            case 3:
                if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
                    return super.dispatchKeyEventPreIme(keyEvent);
                }
                ((t2) this.b).onBackPressed();
                return true;
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                x1 x1Var = (x1) this.b;
                Rect rect = x1Var.A0;
                Rect rect2 = x1Var.z0;
                Paint paint = x1Var.B0;
                tu0 tu0Var = x1Var.r0;
                Bitmap bitmap = x1Var.w0;
                if (x1Var.v0 != null) {
                    canvas.save();
                    float e9 = x1Var.q0.e(x1Var.p0);
                    canvas.scale(1.0f - (e9 * 2.0f), 1.0f, tu0Var.a / 2.0f, 0.0f);
                    canvas.skew(0.0f, y1.z(1.0f, e9, 4.0f * e9, 0.25f));
                    float e10 = x1Var.u0.e(x1Var.t0);
                    if (!x1Var.t0) {
                        canvas.save();
                        paint.setAlpha((int) ((1.0f - e10) * 255.0f));
                        if (bitmap != null) {
                            canvas.translate(r6.getWidth() / 2.0f, r6.getHeight() / 2.0f);
                            canvas.rotate(x1Var.s0);
                            float max = Math.max(tu0Var.a / bitmap.getWidth(), tu0Var.b / bitmap.getHeight());
                            canvas.scale(max, max);
                            if (x1Var.C0 != null) {
                                canvas.rotate(-x1Var.getOrientation());
                                int contentWidth = x1Var.getContentWidth();
                                int contentHeight = x1Var.getContentHeight();
                                if (((x1Var.getOrientation() + x1Var.C0.transformRotation) / 90) % 2 == 1) {
                                    contentWidth = x1Var.getContentHeight();
                                    contentHeight = x1Var.getContentWidth();
                                }
                                MediaController.CropState cropState = x1Var.C0;
                                float f10 = cropState.cropPw;
                                float f11 = cropState.cropPh;
                                float f12 = contentWidth;
                                float f13 = contentHeight;
                                canvas.clipRect(((-contentWidth) * f10) / 2.0f, ((-contentHeight) * f11) / 2.0f, (f10 * f12) / 2.0f, (f11 * f13) / 2.0f);
                                float f14 = x1Var.C0.cropScale;
                                canvas.scale(f14, f14);
                                MediaController.CropState cropState2 = x1Var.C0;
                                canvas.translate(cropState2.cropPx * f12, cropState2.cropPy * f13);
                                canvas.rotate(x1Var.C0.cropRotate + r4.transformRotation);
                                if (x1Var.C0.mirrored) {
                                    canvas.scale(-1.0f, 1.0f);
                                }
                                canvas.rotate(x1Var.getOrientation());
                            }
                            canvas.translate((-bitmap.getWidth()) / 2.0f, (-bitmap.getHeight()) / 2.0f);
                            rect2.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
                            rect.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
                            canvas.drawBitmap(bitmap, rect2, rect, paint);
                        }
                        canvas.restore();
                    }
                    canvas.restore();
                    break;
                }
                break;
            case 2:
                o2 o2Var = (o2) this.b;
                ImageReceiver imageReceiver = o2Var.t0;
                tu0 tu0Var2 = o2Var.r0;
                if (o2Var.s0 != null) {
                    canvas.save();
                    float e11 = o2Var.q0.e(o2Var.p0);
                    canvas.scale(1.0f - (e11 * 2.0f), 1.0f, tu0Var2.a / 2.0f, 0.0f);
                    canvas.skew(0.0f, y1.z(1.0f, e11, 4.0f * e11, 0.25f));
                    imageReceiver.setImageCoords(0.0f, 0.0f, (int) tu0Var2.a, (int) tu0Var2.b);
                    imageReceiver.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(o2 o2Var, Context context) {
        super(context);
        this.a = 2;
        this.b = o2Var;
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(x1 x1Var, Context context) {
        super(context);
        this.a = 1;
        this.b = x1Var;
        setWillNotDraw(false);
    }
}
