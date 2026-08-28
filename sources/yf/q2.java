package yf;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.f3;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class q2 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q2(Object obj, Context context, int i9) {
        super(context);
        this.a = i9;
        this.b = obj;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.a) {
            case 0:
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
            case 0:
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
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        zf.o0 o0Var;
        zf.o0 o0Var2;
        switch (this.a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                zf.p0 p0Var = (zf.p0) this.b;
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
    public void onMeasure(int i9, int i10) {
        boolean z10;
        float f10;
        float top;
        int measuredHeight;
        switch (this.a) {
            case 2:
                zf.x0 x0Var = (zf.x0) this.b;
                z10 = ((f3) x0Var).isPortrait;
                if (z10) {
                    x0Var.s = View.MeasureSpec.getSize(i9);
                } else {
                    x0Var.s = (int) (Math.min(View.MeasureSpec.getSize(i9), View.MeasureSpec.getSize(i10)) * 0.8f);
                }
                super.onMeasure(i9, i10);
                break;
            case 3:
                super.onMeasure(i9, i10);
                zf.k1 k1Var = ((zf.j1) this.b).c;
                dg.q qVar = k1Var.n0;
                if (qVar == null) {
                    View view = k1Var.x0;
                    if (view == null) {
                        f10 = 0.0f;
                        k1Var.m0.setTranslationY(f10 - (r4.getMeasuredHeight() / 2.0f));
                        break;
                    } else {
                        top = view.getTop();
                        measuredHeight = k1Var.x0.getMeasuredHeight();
                    }
                } else {
                    top = qVar.getTop();
                    measuredHeight = k1Var.n0.getMeasuredHeight();
                }
                f10 = (measuredHeight / 2.0f) + top;
                k1Var.m0.setTranslationY(f10 - (r4.getMeasuredHeight() / 2.0f));
            default:
                super.onMeasure(i9, i10);
                break;
        }
    }
}
