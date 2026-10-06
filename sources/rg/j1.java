package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.cg0;
import yh.j2;
import yh.y3;
import yh.z7;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class j1 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j1(Object obj, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 3:
                if (((z7) this.b).r0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.a) {
            case 4:
                super.onDraw(canvas);
                zg.o oVar = (zg.o) this.b;
                if (oVar.x > 0) {
                    canvas.drawRect(0.0f, getHeight() - oVar.x, getWidth(), getHeight(), oVar.y);
                    break;
                }
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 4:
                super.onLayout(z10, i10, i11, i12, i13);
                zg.o oVar = (zg.o) this.b;
                if (oVar.N && z10) {
                    oVar.e0(oVar.P.e);
                    break;
                }
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
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
                m1 m1Var = ((l1) this.b).c;
                cg0 cg0Var = m1Var.r0;
                if (cg0Var == null) {
                    View view = m1Var.B0;
                    if (view == null) {
                        f7 = 0.0f;
                        m1Var.q0.setTranslationY(f7 - (r3.getMeasuredHeight() / 2.0f));
                        break;
                    } else {
                        top = view.getTop();
                        measuredHeight = m1Var.B0.getMeasuredHeight();
                    }
                } else {
                    top = cg0Var.getTop();
                    measuredHeight = m1Var.r0.getMeasuredHeight();
                }
                f7 = (measuredHeight / 2.0f) + top;
                m1Var.q0.setTranslationY(f7 - (r3.getMeasuredHeight() / 2.0f));
            case 1:
                super.onMeasure(i10, i11);
                ((xh.i1) this.b).K.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
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
                y3 y3Var = (y3) this.b;
                j2 j2Var = y3Var.d0;
                if (j2Var != null && j2Var.getVisibility() == 0) {
                    y3Var.d0.invalidate();
                    break;
                }
                break;
            default:
                super.setTranslationY(f7);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(zg.o oVar, Context context) {
        super(context);
        this.a = 4;
        this.b = oVar;
        setWillNotDraw(false);
    }
}
