// default package

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Point;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.a;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class wgc extends FrameLayout {
    public static final /* synthetic */ int h = 0;
    public final float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public final /* synthetic */ xgc f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wgc(xgc xgcVar, Context context) {
        super(context);
        this.f = xgcVar;
        this.a = ViewConfiguration.get(context).getScaledTouchSlop();
        setOutlineProvider(new xi((byte) 23));
        setClipToOutline(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        xgc xgcVar = this.f;
        aic aicVar = xgcVar.r;
        aic aicVar2 = xgcVar.s;
        aicVar.setPivotX(aicVar2.getMeasuredWidth());
        aicVar.setPivotY(aicVar2.getMeasuredHeight());
        aicVar.setTranslationX((1.0f / getScaleX()) * (-gl.L(4.0f)) * xgcVar.w);
        aicVar.setTranslationY((1.0f / getScaleY()) * (-gl.L(4.0f)) * xgcVar.w);
        aicVar.setRoundCorners((1.0f / getScaleY()) * gl.L(8.0f) * xgcVar.w);
        aicVar.setScaleX(((1.0f - xgcVar.w) * 0.6f) + 0.4f);
        aicVar.setScaleY(((1.0f - xgcVar.w) * 0.6f) + 0.4f);
        aicVar.setAlpha(Math.min(1.0f, 1.0f - xgcVar.w));
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.b = gl.L(16.0f);
        this.c = gl.L(16.0f);
        this.d = gl.L(60.0f);
        this.e = gl.L(16.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        if (r4 != 3) goto L61;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        xgc xgcVar = this.f;
        if (xgc.T || xgc.U == null) {
            return false;
        }
        gl.r(xgcVar.O);
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        ViewParent parent = getParent();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    xgc xgcVar2 = this.f;
                    float f = rawX - xgcVar2.J;
                    float f2 = rawY - xgcVar2.K;
                    if (!xgcVar2.L) {
                        float f3 = (f2 * f2) + (f * f);
                        float f4 = this.a;
                        if (f3 > f4 * f4) {
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            xgcVar2 = this.f;
                            xgcVar2.L = true;
                            xgcVar2.J = rawX;
                            xgcVar2.K = rawY;
                            f = 0.0f;
                            f2 = 0.0f;
                        }
                    }
                    if (xgcVar2.L) {
                        WindowManager.LayoutParams layoutParams = xgcVar2.d;
                        layoutParams.x = (int) (layoutParams.x + f);
                        layoutParams.y = (int) (layoutParams.y + f2);
                        xgcVar2.J = rawX;
                        xgcVar2.K = rawY;
                        gl.N3(xgcVar2.c, xgcVar2.a, layoutParams);
                        return true;
                    }
                }
            }
            AnimatorSet animatorSet = this.f.P;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            if (motionEvent.getAction() == 1 && !this.f.L && System.currentTimeMillis() - this.f.M < 150) {
                Context context = getContext();
                if (context instanceof LaunchActivity) {
                    if (a.x) {
                        Intent intent = new Intent(context, (Class<?>) LaunchActivity.class);
                        intent.setAction("voip");
                        context.startActivity(intent);
                    } else {
                        hgc.n((Activity) context, this.f.N);
                    }
                }
                this.f.L = false;
                return false;
            }
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(false);
                Point point = gl.q;
                int i = point.x;
                int i2 = point.y + xgc.W;
                float f5 = this.d;
                float f6 = this.e;
                xgc xgcVar3 = this.f;
                float left = xgcVar3.b.getLeft() + xgcVar3.d.x;
                float measuredWidth = this.f.b.getMeasuredWidth() + left;
                xgc xgcVar4 = this.f;
                float top = xgcVar4.b.getTop() + xgcVar4.d.y;
                float measuredHeight = this.f.b.getMeasuredHeight() + top;
                this.f.P = new AnimatorSet();
                float f7 = this.b;
                if (left < f7) {
                    xgc xgcVar5 = this.f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(xgcVar5.d.x, f7 - xgcVar5.b.getLeft());
                    ofFloat.addUpdateListener(this.f.Q);
                    this.f.P.playTogether(ofFloat);
                } else if (measuredWidth > i - this.c) {
                    xgc xgcVar6 = this.f;
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(xgcVar6.d.x, (i - xgcVar6.b.getRight()) - this.c);
                    ofFloat2.addUpdateListener(this.f.Q);
                    this.f.P.playTogether(ofFloat2);
                }
                if (top < f5) {
                    xgc xgcVar7 = this.f;
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(xgcVar7.d.y, f5 - xgcVar7.b.getTop());
                    ofFloat3.addUpdateListener(this.f.R);
                    this.f.P.playTogether(ofFloat3);
                } else if (measuredHeight > i2 - f6) {
                    xgc xgcVar8 = this.f;
                    ValueAnimator ofFloat4 = ValueAnimator.ofFloat(xgcVar8.d.y, (i2 - xgcVar8.b.getMeasuredHeight()) - f6);
                    ofFloat4.addUpdateListener(this.f.R);
                    this.f.P.playTogether(ofFloat4);
                }
                this.f.P.setDuration(150L).setInterpolator(s33.f);
                this.f.P.start();
            }
            this.f.L = false;
            xgc.U.getClass();
            return true;
        }
        xgc xgcVar9 = this.f;
        xgcVar9.J = rawX;
        xgcVar9.K = rawY;
        xgcVar9.M = System.currentTimeMillis();
        AnimatorSet animatorSet2 = this.f.P;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        return true;
    }
}
