// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class yba extends FrameLayout {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tca b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yba(tca tcaVar, Context context, byte b) {
        super(context);
        this.a = b;
        this.b = tcaVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                tca tcaVar = this.b;
                im0 im0Var = tcaVar.R2;
                im0Var.setBounds(0, (int) tcaVar.p2, getMeasuredWidth(), getMeasuredHeight());
                im0Var.draw(canvas);
                canvas.save();
                canvas.clipRect(0.0f, tcaVar.p2, getMeasuredWidth(), getMeasuredHeight());
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
                tca tcaVar = this.b;
                yba ybaVar = tcaVar.m1;
                float f = tcaVar.q2;
                if (f != 0.0f && f != ybaVar.getTop() + tcaVar.q2) {
                    ValueAnimator valueAnimator = tcaVar.r2;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float top = tcaVar.q2 - (ybaVar.getTop() + tcaVar.p2);
                    tcaVar.p2 = top;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                    tcaVar.r2 = ofFloat;
                    ofFloat.addUpdateListener(new p29(this, (byte) 26));
                    tcaVar.r2.setInterpolator(d53.f);
                    tcaVar.r2.setDuration(200L);
                    tcaVar.r2.start();
                    tcaVar.q2 = 0.0f;
                }
                tcaVar.N1[1].setTranslationY((-(ybaVar.getMeasuredHeight() - gm.L(48.0f))) + tcaVar.p2 + tcaVar.o2 + ((1.0f - getAlpha()) * (ybaVar.getMeasuredHeight() - gm.L(48.0f))));
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
                accessibilityNodeInfo.setText(jb6.G(this.b.P1.m(), "AccDescrShareInChats", new Object[0]));
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
