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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class xic extends FrameLayout {
    public static final /* synthetic */ int h = 0;
    public final float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public final /* synthetic */ yic f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xic(yic yicVar, Context context) {
        super(context);
        this.f = yicVar;
        this.a = ViewConfiguration.get(context).getScaledTouchSlop();
        setOutlineProvider(new xj((byte) 23));
        setClipToOutline(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        yic yicVar = this.f;
        akc akcVar = yicVar.r;
        akc akcVar2 = yicVar.s;
        akcVar.setPivotX(akcVar2.getMeasuredWidth());
        akcVar.setPivotY(akcVar2.getMeasuredHeight());
        akcVar.setTranslationX((1.0f / getScaleX()) * (-gm.L(4.0f)) * yicVar.w);
        akcVar.setTranslationY((1.0f / getScaleY()) * (-gm.L(4.0f)) * yicVar.w);
        akcVar.setRoundCorners((1.0f / getScaleY()) * gm.L(8.0f) * yicVar.w);
        akcVar.setScaleX(((1.0f - yicVar.w) * 0.6f) + 0.4f);
        akcVar.setScaleY(((1.0f - yicVar.w) * 0.6f) + 0.4f);
        akcVar.setAlpha(Math.min(1.0f, 1.0f - yicVar.w));
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.b = gm.L(16.0f);
        this.c = gm.L(16.0f);
        this.d = gm.L(60.0f);
        this.e = gm.L(16.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        if (r4 != 3) goto L61;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        yic yicVar = this.f;
        if (yic.T || yic.U == null) {
            return false;
        }
        gm.r(yicVar.O);
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        ViewParent parent = getParent();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    yic yicVar2 = this.f;
                    float f = rawX - yicVar2.J;
                    float f2 = rawY - yicVar2.K;
                    if (!yicVar2.L) {
                        float f3 = (f2 * f2) + (f * f);
                        float f4 = this.a;
                        if (f3 > f4 * f4) {
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            yicVar2 = this.f;
                            yicVar2.L = true;
                            yicVar2.J = rawX;
                            yicVar2.K = rawY;
                            f = 0.0f;
                            f2 = 0.0f;
                        }
                    }
                    if (yicVar2.L) {
                        WindowManager.LayoutParams layoutParams = yicVar2.d;
                        layoutParams.x = (int) (layoutParams.x + f);
                        layoutParams.y = (int) (layoutParams.y + f2);
                        yicVar2.J = rawX;
                        yicVar2.K = rawY;
                        gm.N3(yicVar2.c, yicVar2.a, layoutParams);
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
                        iic.n((Activity) context, this.f.N);
                    }
                }
                this.f.L = false;
                return false;
            }
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(false);
                Point point = gm.q;
                int i = point.x;
                int i2 = point.y + yic.W;
                float f5 = this.d;
                float f6 = this.e;
                yic yicVar3 = this.f;
                float left = yicVar3.b.getLeft() + yicVar3.d.x;
                float measuredWidth = this.f.b.getMeasuredWidth() + left;
                yic yicVar4 = this.f;
                float top = yicVar4.b.getTop() + yicVar4.d.y;
                float measuredHeight = this.f.b.getMeasuredHeight() + top;
                this.f.P = new AnimatorSet();
                float f7 = this.b;
                if (left < f7) {
                    yic yicVar5 = this.f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(yicVar5.d.x, f7 - yicVar5.b.getLeft());
                    ofFloat.addUpdateListener(this.f.Q);
                    this.f.P.playTogether(ofFloat);
                } else if (measuredWidth > i - this.c) {
                    yic yicVar6 = this.f;
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(yicVar6.d.x, (i - yicVar6.b.getRight()) - this.c);
                    ofFloat2.addUpdateListener(this.f.Q);
                    this.f.P.playTogether(ofFloat2);
                }
                if (top < f5) {
                    yic yicVar7 = this.f;
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(yicVar7.d.y, f5 - yicVar7.b.getTop());
                    ofFloat3.addUpdateListener(this.f.R);
                    this.f.P.playTogether(ofFloat3);
                } else if (measuredHeight > i2 - f6) {
                    yic yicVar8 = this.f;
                    ValueAnimator ofFloat4 = ValueAnimator.ofFloat(yicVar8.d.y, (i2 - yicVar8.b.getMeasuredHeight()) - f6);
                    ofFloat4.addUpdateListener(this.f.R);
                    this.f.P.playTogether(ofFloat4);
                }
                this.f.P.setDuration(150L).setInterpolator(d53.f);
                this.f.P.start();
            }
            this.f.L = false;
            yic.U.getClass();
            return true;
        }
        yic yicVar9 = this.f;
        yicVar9.J = rawX;
        yicVar9.K = rawY;
        yicVar9.M = System.currentTimeMillis();
        AnimatorSet animatorSet2 = this.f.P;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        return true;
    }
}
