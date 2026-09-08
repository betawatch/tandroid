package sg;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.eg0;
import zh.i2;
import zh.v7;
import zh.w3;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class l1 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l1(Object obj, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 3:
                if (((v7) this.b).f0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        float f7;
        float top;
        int measuredHeight;
        switch (this.a) {
            case 0:
                super.onMeasure(i10, i11);
                o1 o1Var = ((n1) this.b).c;
                eg0 eg0Var = o1Var.r0;
                if (eg0Var == null) {
                    View view = o1Var.B0;
                    if (view == null) {
                        f7 = 0.0f;
                        o1Var.q0.setTranslationY(f7 - (r3.getMeasuredHeight() / 2.0f));
                        break;
                    } else {
                        top = view.getTop();
                        measuredHeight = o1Var.B0.getMeasuredHeight();
                    }
                } else {
                    top = eg0Var.getTop();
                    measuredHeight = o1Var.r0.getMeasuredHeight();
                }
                f7 = (measuredHeight / 2.0f) + top;
                o1Var.q0.setTranslationY(f7 - (r3.getMeasuredHeight() / 2.0f));
            case 1:
                super.onMeasure(i10, i11);
                ((yh.h1) this.b).K.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        switch (this.a) {
            case 2:
                super.setTranslationY(f7);
                w3 w3Var = (w3) this.b;
                i2 i2Var = w3Var.d0;
                if (i2Var != null && i2Var.getVisibility() == 0) {
                    w3Var.d0.invalidate();
                    break;
                }
                break;
            default:
                super.setTranslationY(f7);
                break;
        }
    }
}
