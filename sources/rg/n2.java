package rg;

import ai.zd;
import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.Components.dw0;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class n2 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n2(Object obj, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.a) {
            case 1:
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
            case 1:
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
                o2 o2Var = (o2) this.b;
                ImageReceiver imageReceiver = o2Var.x0;
                dw0 dw0Var = o2Var.v0;
                if (o2Var.w0 != null) {
                    canvas.save();
                    float e = o2Var.u0.e(o2Var.t0);
                    canvas.scale(1.0f - (e * 2.0f), 1.0f, dw0Var.a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.g0.z(1.0f, e, 4.0f * e, 0.25f));
                    imageReceiver.setImageCoords(0.0f, 0.0f, (int) dw0Var.a, (int) dw0Var.b);
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
        sg.o0 o0Var;
        sg.o0 o0Var2;
        switch (this.a) {
            case 2:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                sg.p0 p0Var = (sg.p0) this.b;
                CharSequence text = (!p0Var.h || (o0Var2 = p0Var.e) == null) ? null : o0Var2.getText();
                if (text == null && (o0Var = p0Var.d) != null) {
                    text = o0Var.getText();
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
            case 3:
                sg.x0 x0Var = (sg.x0) this.b;
                z10 = ((f3) x0Var).isPortrait;
                if (z10) {
                    x0Var.s = View.MeasureSpec.getSize(i10);
                } else {
                    x0Var.s = (int) (Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11)) * 0.8f);
                }
                super.onMeasure(i10, i11);
                break;
            case 4:
                super.onMeasure(i10, i11);
                sg.l1 l1Var = ((sg.k1) this.b).c;
                zd zdVar = l1Var.r0;
                if (zdVar == null) {
                    View view = l1Var.B0;
                    if (view == null) {
                        f7 = 0.0f;
                        l1Var.q0.setTranslationY(f7 - (r4.getMeasuredHeight() / 2.0f));
                        break;
                    } else {
                        top = view.getTop();
                        measuredHeight = l1Var.B0.getMeasuredHeight();
                    }
                } else {
                    top = zdVar.getTop();
                    measuredHeight = l1Var.r0.getMeasuredHeight();
                }
                f7 = (measuredHeight / 2.0f) + top;
                l1Var.q0.setTranslationY(f7 - (r4.getMeasuredHeight() / 2.0f));
            case 5:
                super.onMeasure(i10, i11);
                ((yh.h1) this.b).K.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(o2 o2Var, Context context) {
        super(context);
        this.a = 0;
        this.b = o2Var;
        setWillNotDraw(false);
    }
}
