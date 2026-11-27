// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class rw1 extends FrameLayout {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ChatActivityEnterView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rw1(ChatActivityEnterView chatActivityEnterView, Context context, byte b) {
        super(context);
        this.a = b;
        this.b = chatActivityEnterView;
    }

    public final /* synthetic */ Boolean a(Canvas canvas, View view, long j) {
        return Boolean.valueOf(super.drawChild(canvas, view, j));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f;
        float f2;
        RectF rectF;
        jl0 jl0Var;
        switch (this.a) {
            case 3:
                ChatActivityEnterView chatActivityEnterView = this.b;
                if (chatActivityEnterView.J1) {
                    float f3 = chatActivityEnterView.O1;
                    float f4 = 0.0f;
                    if (f3 > 0.0f) {
                        Paint paint = chatActivityEnterView.N1;
                        int[] iArr = chatActivityEnterView.R1;
                        int[] iArr2 = chatActivityEnterView.Q1;
                        float f5 = 1.0f;
                        float i = Utilities.i(f3 * 1.25f, 1.0f, 0.0f);
                        float i2 = Utilities.i((f3 - 0.18f) * 1.25f, 1.0f, 0.0f);
                        float height = getHeight();
                        float min = Math.min(height - hl.L(44.0f), chatActivityEnterView.e1(this));
                        float width = getWidth() - hl.L(2.5f);
                        bx1 bx1Var = chatActivityEnterView.K0;
                        int i3 = 0;
                        if (bx1Var == null || bx1Var.getVisibility() != 0) {
                            f = 44.0f;
                        } else {
                            f = 44.0f;
                            RectF rectF2 = hl.P;
                            bx1Var.e(rectF2);
                            bx1Var.getLocationInWindow(iArr2);
                            getLocationInWindow(iArr);
                            float f6 = (iArr2[0] - iArr[0]) + rectF2.left;
                            if (f6 > hl.L(120.0f)) {
                                width = f6 - hl.L(6.0f);
                            }
                        }
                        float f7 = 22.0f;
                        if (chatActivityEnterView.L1 == null && chatActivityEnterView.K1 != null) {
                            z92 G0 = chatActivityEnterView.G0();
                            bl0 bl0Var = (G0 == null || (jl0Var = G0.r) == null) ? null : jl0Var.w;
                            if (bl0Var != null) {
                                jl0 c = chatActivityEnterView.K1.c(this, bl0Var, false);
                                chatActivityEnterView.L1 = c;
                                c.r(hl.L(22.0f));
                                jl0 c2 = chatActivityEnterView.K1.c(this, bl0Var, false);
                                chatActivityEnterView.M1 = c2;
                                c2.r(hl.L(22.0f));
                            }
                        }
                        while (i3 < 2) {
                            float f8 = i3 == 0 ? i : i2;
                            if (f8 <= f4) {
                                f2 = f7;
                            } else {
                                if (i3 == 0) {
                                    rectF = hl.P;
                                    f2 = f7;
                                    rectF.set(f4, height - hl.L(f), hl.L(f), height);
                                } else {
                                    f2 = f7;
                                    rectF = hl.P;
                                    rectF.set(hl.L(48.0f), min, width, height);
                                }
                                float R1 = hl.R1(0.92f, f5, f8);
                                canvas.save();
                                canvas.scale(R1, R1, rectF.centerX(), height - (hl.L(f) / 2.0f));
                                jl0 jl0Var2 = i3 == 0 ? chatActivityEnterView.L1 : chatActivityEnterView.M1;
                                if (jl0Var2 != null) {
                                    jl0Var2.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                                    jl0Var2.setAlpha((int) (f8 * 255.0f));
                                    jl0Var2.draw(canvas);
                                } else {
                                    paint.setColor(aob.p1(f8, chatActivityEnterView.J0(aob.Je)));
                                    canvas.drawRoundRect(rectF, hl.L(f2), hl.L(f2), paint);
                                }
                                canvas.restore();
                            }
                            i3++;
                            f7 = f2;
                            f4 = 0.0f;
                            f5 = 1.0f;
                        }
                    }
                }
                super.dispatchDraw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 2:
                if (motionEvent.getAction() != 10) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    for (int i = 0; i < getChildCount(); i++) {
                        View childAt = getChildAt(i);
                        if (childAt.getVisibility() == 0 && childAt.getAlpha() > 0.0f) {
                            float x2 = childAt.getX() + childAt.getWidth();
                            if (x >= (childAt == this.b.K0 ? x2 - r6.l() : childAt.getX()) && x < x2 && y >= childAt.getY() && y < childAt.getY() + childAt.getHeight()) {
                            }
                        }
                    }
                    return false;
                }
                return super.dispatchHoverEvent(motionEvent);
            default:
                return super.dispatchHoverEvent(motionEvent);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        byte b = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (b) {
            case 0:
                dv1 dv1Var = chatActivityEnterView.l0;
                return (dv1Var == null || dv1Var.getVisibility() != 0) ? super.dispatchTouchEvent(motionEvent) : chatActivityEnterView.l0.dispatchTouchEvent(motionEvent);
            case 1:
            default:
                return super.dispatchTouchEvent(motionEvent);
            case 2:
                if (!chatActivityEnterView.K || chatActivityEnterView.V7 == 2) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(final Canvas canvas, final View view, final long j) {
        byte b = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (b) {
            case 1:
                if (view != null && view == chatActivityEnterView.F0) {
                    return chatActivityEnterView.y0(canvas, new hcc() { // from class: sw1
                        @Override // hcc
                        public final Object run() {
                            return rw1.this.a(canvas, view, j);
                        }
                    });
                }
                if (chatActivityEnterView.j6 && view == chatActivityEnterView.f1) {
                    return true;
                }
                return super.drawChild(canvas, view, j);
            case 2:
                if (view == chatActivityEnterView.K0 && chatActivityEnterView.i0) {
                    return true;
                }
                return super.drawChild(canvas, view, j);
            default:
                return super.drawChild(canvas, view, j);
        }
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        switch (this.a) {
            case 3:
                return !this.b.J1 && super.hasOverlappingRendering();
            default:
                return super.hasOverlappingRendering();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 1:
                super.onLayout(z, i, i2, i3, i4);
                HashMap hashMap = this.b.C0;
                if (!hashMap.isEmpty()) {
                    for (int i5 = 0; i5 < getChildCount(); i5++) {
                        View childAt = getChildAt(i5);
                        Float f = (Float) hashMap.get(childAt);
                        if (f != null) {
                            childAt.setTranslationX(f.floatValue() - childAt.getLeft());
                            childAt.animate().translationX(0.0f).setDuration(150L).setInterpolator(k43.f).start();
                        }
                    }
                    hashMap.clear();
                    break;
                }
                break;
            default:
                super.onLayout(z, i, i2, i3, i4);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        k43 k43Var;
        switch (this.a) {
            case 1:
                super.onMeasure(i, i2);
                int max = Math.max(hl.L(44.0f), getMeasuredHeight());
                ChatActivityEnterView chatActivityEnterView = this.b;
                t84 t84Var = chatActivityEnterView.K7;
                float f = t84Var.f;
                if (f > 0.0f) {
                    if (t84Var.h) {
                        f = t84Var.g;
                    }
                    float f2 = max;
                    if (f != f2) {
                        t84Var.d = chatActivityEnterView.H0();
                        t84Var.e = (byte) 0;
                        k43 k43Var2 = bb2.V;
                        if (chatActivityEnterView.F1 > 0 && SystemClock.uptimeMillis() < chatActivityEnterView.F1 && (k43Var = chatActivityEnterView.G1) != null) {
                            k43Var2 = k43Var;
                        }
                        t84Var.c = k43Var2;
                    }
                    t84Var.a(f2);
                } else {
                    t84Var.c(max);
                }
                chatActivityEnterView.S();
                break;
            default:
                super.onMeasure(i, i2);
                break;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 2:
                super.onSizeChanged(i, i2, i3, i4);
                setPivotX(i - hl.L(22.0f));
                setPivotY(i2 - hl.L(22.0f));
                break;
            default:
                super.onSizeChanged(i, i2, i3, i4);
                break;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 2:
                ChatActivityEnterView chatActivityEnterView = this.b;
                if (!chatActivityEnterView.K || chatActivityEnterView.V7 == 2) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        switch (this.a) {
            case 3:
                super.setVisibility(i);
                this.b.I2(true);
                break;
            default:
                super.setVisibility(i);
                break;
        }
    }
}
