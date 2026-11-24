// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class wz1 extends FrameLayout {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x02 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wz1(x02 x02Var, Context context, byte b) {
        super(context);
        this.a = b;
        this.b = x02Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 2:
                canvas.save();
                canvas.clipRect(0.0f, this.b.S3, getMeasuredWidth(), getMeasuredHeight());
                super.dispatchDraw(canvas);
                canvas.restore();
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 2:
                x02 x02Var = this.b;
                wz1 wz1Var = x02Var.A2;
                if (x02Var.z2.getAlpha() > 0.0f) {
                    float f = x02Var.T3;
                    if (f != 0.0f && f != wz1Var.getTop() + x02Var.T3) {
                        ValueAnimator valueAnimator = x02Var.U3;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        float top = x02Var.T3 - (wz1Var.getTop() + x02Var.S3);
                        x02Var.S3 = top;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                        x02Var.U3 = ofFloat;
                        ofFloat.addUpdateListener(new uz1(this, (byte) 1));
                        x02Var.U3.setInterpolator(s33.f);
                        x02Var.U3.setDuration(200L);
                        x02Var.U3.start();
                        x02Var.T3 = 0.0f;
                        break;
                    }
                }
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.a) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                x02 x02Var = this.b;
                p02 p02Var = x02Var.v2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = x02Var.d2;
                if (p02Var == chatAttachAlertPhotoLayout) {
                    accessibilityNodeInfo.setText(k96.G(chatAttachAlertPhotoLayout.getSelectedItemsCount(), "AccDescrSendPhotos", new Object[0]));
                } else {
                    d32 d32Var = x02Var.j2;
                    if (p02Var == d32Var) {
                        accessibilityNodeInfo.setText(k96.G(d32Var.getSelectedItemsCount(), "AccDescrSendFiles", new Object[0]));
                    } else {
                        h12 h12Var = x02Var.f2;
                        if (p02Var == h12Var) {
                            accessibilityNodeInfo.setText(k96.G(h12Var.getSelectedItemsCount(), "AccDescrSendAudio", new Object[0]));
                        }
                    }
                }
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                break;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                if (this.b.f3.getVisibility() != 0) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 1:
                x02 x02Var = this.b;
                if (x02Var.B1 && x02Var.C1 != 0) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), gl.L(36.0f) + (gl.L(80.0f) * Integer.bitCount(x02Var.C1))), TLObject.FLAG_30), i2);
                    break;
                } else {
                    super.onMeasure(i, i2);
                    break;
                }
            default:
                super.onMeasure(i, i2);
                break;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                if (this.b.f3.getVisibility() != 0) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public final void setAlpha(float f) {
        switch (this.a) {
            case 0:
                super.setAlpha(f);
                x02 x02Var = this.b;
                x02Var.K1(0);
                x02Var.b.invalidate();
                break;
            case 1:
            default:
                super.setAlpha(f);
                break;
            case 2:
                super.setAlpha(f);
                invalidate();
                break;
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        switch (this.a) {
            case 1:
                super.setTranslationY(f);
                this.b.v2.l();
                break;
            default:
                super.setTranslationY(f);
                break;
        }
    }
}
