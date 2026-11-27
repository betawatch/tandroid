// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class pda extends FrameLayout {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kea b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pda(kea keaVar, Context context, byte b) {
        super(context);
        this.a = b;
        this.b = keaVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                kea keaVar = this.b;
                jl0 jl0Var = keaVar.R2;
                jl0Var.setBounds(0, (int) keaVar.p2, getMeasuredWidth(), getMeasuredHeight());
                jl0Var.draw(canvas);
                canvas.save();
                canvas.clipRect(0.0f, keaVar.p2, getMeasuredWidth(), getMeasuredHeight());
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
            case 0:
                kea keaVar = this.b;
                pda pdaVar = keaVar.m1;
                float f = keaVar.q2;
                if (f != 0.0f && f != pdaVar.getTop() + keaVar.q2) {
                    ValueAnimator valueAnimator = keaVar.r2;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float top = keaVar.q2 - (pdaVar.getTop() + keaVar.p2);
                    keaVar.p2 = top;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                    keaVar.r2 = ofFloat;
                    ofFloat.addUpdateListener(new b49(this, (byte) 26));
                    keaVar.r2.setInterpolator(k43.f);
                    keaVar.r2.setDuration(200L);
                    keaVar.r2.start();
                    keaVar.q2 = 0.0f;
                }
                keaVar.N1[1].setTranslationY((-(pdaVar.getMeasuredHeight() - hl.L(48.0f))) + keaVar.p2 + keaVar.o2 + ((1.0f - getAlpha()) * (pdaVar.getMeasuredHeight() - hl.L(48.0f))));
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(ob6.G(this.b.P1.m(), "AccDescrShareInChats", new Object[0]));
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                break;
        }
    }

    @Override // android.view.View
    public final void setAlpha(float f) {
        switch (this.a) {
            case 0:
                super.setAlpha(f);
                invalidate();
                break;
            default:
                super.setAlpha(f);
                break;
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        switch (this.a) {
            case 0:
                super.setVisibility(i);
                if (i != 0) {
                    this.b.N1[1].setTranslationY(0.0f);
                    break;
                }
                break;
            default:
                super.setVisibility(i);
                break;
        }
    }
}
