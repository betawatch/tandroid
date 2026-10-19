package rg;

import ai.zd;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.Components.ew0;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class x1 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x1(Object obj, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.a) {
            case 2:
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
            case 2:
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
            case 0:
                y1 y1Var = (y1) this.b;
                Rect rect = y1Var.E0;
                Rect rect2 = y1Var.D0;
                Paint paint = y1Var.F0;
                ew0 ew0Var = y1Var.v0;
                Bitmap bitmap = y1Var.A0;
                if (y1Var.z0 != null) {
                    canvas.save();
                    float e = y1Var.u0.e(y1Var.t0);
                    canvas.scale(1.0f - (e * 2.0f), 1.0f, ew0Var.a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.g0.z(1.0f, e, 4.0f * e, 0.25f));
                    float e7 = y1Var.y0.e(y1Var.x0);
                    if (!y1Var.x0) {
                        canvas.save();
                        paint.setAlpha((int) ((1.0f - e7) * 255.0f));
                        if (bitmap != null) {
                            canvas.translate(r6.getWidth() / 2.0f, r6.getHeight() / 2.0f);
                            canvas.rotate(y1Var.w0);
                            float max = Math.max(ew0Var.a / bitmap.getWidth(), ew0Var.b / bitmap.getHeight());
                            canvas.scale(max, max);
                            if (y1Var.G0 != null) {
                                canvas.rotate(-y1Var.getOrientation());
                                int contentWidth = y1Var.getContentWidth();
                                int contentHeight = y1Var.getContentHeight();
                                if (((y1Var.getOrientation() + y1Var.G0.transformRotation) / 90) % 2 == 1) {
                                    contentWidth = y1Var.getContentHeight();
                                    contentHeight = y1Var.getContentWidth();
                                }
                                MediaController.CropState cropState = y1Var.G0;
                                float f7 = cropState.cropPw;
                                float f10 = cropState.cropPh;
                                float f11 = contentWidth;
                                float f12 = contentHeight;
                                canvas.clipRect(((-contentWidth) * f7) / 2.0f, ((-contentHeight) * f10) / 2.0f, (f7 * f11) / 2.0f, (f10 * f12) / 2.0f);
                                float f13 = y1Var.G0.cropScale;
                                canvas.scale(f13, f13);
                                MediaController.CropState cropState2 = y1Var.G0;
                                canvas.translate(cropState2.cropPx * f11, cropState2.cropPy * f12);
                                canvas.rotate(y1Var.G0.cropRotate + r4.transformRotation);
                                if (y1Var.G0.mirrored) {
                                    canvas.scale(-1.0f, 1.0f);
                                }
                                canvas.rotate(y1Var.getOrientation());
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
            case 1:
                o2 o2Var = (o2) this.b;
                ImageReceiver imageReceiver = o2Var.x0;
                ew0 ew0Var2 = o2Var.v0;
                if (o2Var.w0 != null) {
                    canvas.save();
                    float e10 = o2Var.u0.e(o2Var.t0);
                    canvas.scale(1.0f - (e10 * 2.0f), 1.0f, ew0Var2.a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.g0.z(1.0f, e10, 4.0f * e10, 0.25f));
                    imageReceiver.setImageCoords(0.0f, 0.0f, (int) ew0Var2.a, (int) ew0Var2.b);
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

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        sg.p0 p0Var;
        sg.p0 p0Var2;
        switch (this.a) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                sg.q0 q0Var = (sg.q0) this.b;
                CharSequence text = (!q0Var.h || (p0Var2 = q0Var.e) == null) ? null : p0Var2.getText();
                if (text == null && (p0Var = q0Var.d) != null) {
                    text = p0Var.getText();
                }
                if (text != null) {
                    accessibilityNodeInfo.setText(text);
                    if (getContentDescription() == null) {
                        accessibilityNodeInfo.setContentDescription(text);
                        break;
                    }
                }
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        boolean z10;
        float f7;
        float top;
        int measuredHeight;
        switch (this.a) {
            case 4:
                sg.y0 y0Var = (sg.y0) this.b;
                z10 = ((f3) y0Var).isPortrait;
                if (z10) {
                    y0Var.s = View.MeasureSpec.getSize(i10);
                } else {
                    y0Var.s = (int) (Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11)) * 0.8f);
                }
                super.onMeasure(i10, i11);
                break;
            case 5:
                super.onMeasure(i10, i11);
                sg.m1 m1Var = ((sg.l1) this.b).c;
                zd zdVar = m1Var.r0;
                if (zdVar == null) {
                    View view = m1Var.B0;
                    if (view == null) {
                        f7 = 0.0f;
                        m1Var.q0.setTranslationY(f7 - (r4.getMeasuredHeight() / 2.0f));
                        break;
                    } else {
                        top = view.getTop();
                        measuredHeight = m1Var.B0.getMeasuredHeight();
                    }
                } else {
                    top = zdVar.getTop();
                    measuredHeight = m1Var.r0.getMeasuredHeight();
                }
                f7 = (measuredHeight / 2.0f) + top;
                m1Var.q0.setTranslationY(f7 - (r4.getMeasuredHeight() / 2.0f));
            case 6:
                super.onMeasure(i10, i11);
                ((yh.g1) this.b).K.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(o2 o2Var, Context context) {
        super(context);
        this.a = 1;
        this.b = o2Var;
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(y1 y1Var, Context context) {
        super(context);
        this.a = 0;
        this.b = y1Var;
        setWillNotDraw(false);
    }
}
