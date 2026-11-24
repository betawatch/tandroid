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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class px1 extends FrameLayout {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ChatActivityEnterView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ px1(ChatActivityEnterView chatActivityEnterView, Context context, byte b) {
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
        im0 im0Var;
        switch (this.a) {
            case 3:
                ChatActivityEnterView chatActivityEnterView = this.b;
                if (chatActivityEnterView.K1) {
                    float f3 = chatActivityEnterView.P1;
                    float f4 = 0.0f;
                    if (f3 > 0.0f) {
                        Paint paint = chatActivityEnterView.O1;
                        int[] iArr = chatActivityEnterView.S1;
                        int[] iArr2 = chatActivityEnterView.R1;
                        float f5 = 1.0f;
                        float i = Utilities.i(f3 * 1.25f, 1.0f, 0.0f);
                        float i2 = Utilities.i((f3 - 0.18f) * 1.25f, 1.0f, 0.0f);
                        float height = getHeight();
                        float min = Math.min(height - gm.L(44.0f), chatActivityEnterView.b1(this));
                        float width = getWidth() - gm.L(2.5f);
                        by1 by1Var = chatActivityEnterView.K0;
                        int i3 = 0;
                        if (by1Var == null || by1Var.getVisibility() != 0) {
                            f = 44.0f;
                        } else {
                            f = 44.0f;
                            RectF rectF2 = gm.P;
                            by1Var.e(rectF2);
                            by1Var.getLocationInWindow(iArr2);
                            getLocationInWindow(iArr);
                            float f6 = (iArr2[0] - iArr[0]) + rectF2.left;
                            if (f6 > gm.L(120.0f)) {
                                width = f6 - gm.L(6.0f);
                            }
                        }
                        float f7 = 22.0f;
                        if (chatActivityEnterView.M1 == null && chatActivityEnterView.L1 != null) {
                            va2 C0 = chatActivityEnterView.C0();
                            am0 am0Var = (C0 == null || (im0Var = C0.n) == null) ? null : im0Var.w;
                            if (am0Var != null) {
                                im0 c = chatActivityEnterView.L1.c(this, am0Var, false);
                                chatActivityEnterView.M1 = c;
                                c.r(gm.L(22.0f));
                                im0 c2 = chatActivityEnterView.L1.c(this, am0Var, false);
                                chatActivityEnterView.N1 = c2;
                                c2.r(gm.L(22.0f));
                            }
                        }
                        while (i3 < 2) {
                            float f8 = i3 == 0 ? i : i2;
                            if (f8 <= f4) {
                                f2 = f7;
                            } else {
                                if (i3 == 0) {
                                    rectF = gm.P;
                                    f2 = f7;
                                    rectF.set(f4, height - gm.L(f), gm.L(f), height);
                                } else {
                                    f2 = f7;
                                    rectF = gm.P;
                                    rectF.set(gm.L(48.0f), min, width, height);
                                }
                                float R1 = gm.R1(0.92f, f5, f8);
                                canvas.save();
                                canvas.scale(R1, R1, rectF.centerX(), height - (gm.L(f) / 2.0f));
                                im0 im0Var2 = i3 == 0 ? chatActivityEnterView.M1 : chatActivityEnterView.N1;
                                if (im0Var2 != null) {
                                    im0Var2.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                                    im0Var2.setAlpha((int) (f8 * 255.0f));
                                    im0Var2.draw(canvas);
                                } else {
                                    paint.setColor(cmb.p1(f8, chatActivityEnterView.F0(cmb.Ie)));
                                    canvas.drawRoundRect(rectF, gm.L(f2), gm.L(f2), paint);
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
                cw1 cw1Var = chatActivityEnterView.l0;
                return (cw1Var == null || cw1Var.getVisibility() != 0) ? super.dispatchTouchEvent(motionEvent) : chatActivityEnterView.l0.dispatchTouchEvent(motionEvent);
            case 1:
            default:
                return super.dispatchTouchEvent(motionEvent);
            case 2:
                if (!chatActivityEnterView.K || chatActivityEnterView.y7 == 2) {
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
                    return chatActivityEnterView.v0(canvas, new iac() { // from class: qx1
                        @Override // iac
                        public final Object run() {
                            return px1.this.a(canvas, view, j);
                        }
                    });
                }
                if (chatActivityEnterView.Y5 && view == chatActivityEnterView.f1) {
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
                return !this.b.K1 && super.hasOverlappingRendering();
            default:
                return super.hasOverlappingRendering();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 1:
                super.onLayout(z, i, i2, i3, i4);
                ChatActivityEnterView chatActivityEnterView = this.b;
                HashMap hashMap = chatActivityEnterView.C0;
                if (chatActivityEnterView.O0()) {
                    qmb qmbVar = chatActivityEnterView.f2;
                    int width = chatActivityEnterView.o2.getWidth();
                    tx1 tx1Var = chatActivityEnterView.h2;
                    if (chatActivityEnterView.W0(tx1Var)) {
                        width = Math.min(width, tx1Var.getLeft());
                    }
                    if (chatActivityEnterView.W0(chatActivityEnterView.z2)) {
                        width = Math.min(width, chatActivityEnterView.z2.getLeft());
                    }
                    if (chatActivityEnterView.W0(qmbVar)) {
                        for (int i5 = 0; i5 < qmbVar.getChildCount(); i5++) {
                            View childAt = qmbVar.getChildAt(i5);
                            if (chatActivityEnterView.W0(childAt) && childAt.getWidth() > 0) {
                                width = Math.min(width, childAt.getLeft() + qmbVar.getLeft());
                            }
                        }
                    }
                    tc tcVar = chatActivityEnterView.K6;
                    tcVar.setChipMaxWidth((width - tcVar.getLeft()) - gm.L(4.0f));
                }
                if (!hashMap.isEmpty()) {
                    for (int i6 = 0; i6 < getChildCount(); i6++) {
                        View childAt2 = getChildAt(i6);
                        Float f = (Float) hashMap.get(childAt2);
                        if (f != null) {
                            childAt2.setTranslationX(f.floatValue() - childAt2.getLeft());
                            childAt2.animate().translationX(0.0f).setDuration(150L).setInterpolator(d53.f).start();
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
        d53 d53Var;
        switch (this.a) {
            case 1:
                super.onMeasure(i, i2);
                int max = Math.max(gm.L(44.0f), getMeasuredHeight());
                ChatActivityEnterView chatActivityEnterView = this.b;
                h94 h94Var = chatActivityEnterView.n7;
                float f = h94Var.f;
                if (f > 0.0f) {
                    if (h94Var.h) {
                        f = h94Var.g;
                    }
                    float f2 = max;
                    if (f != f2) {
                        h94Var.d = chatActivityEnterView.D0();
                        h94Var.e = (byte) 0;
                        d53 d53Var2 = wb2.V;
                        if (chatActivityEnterView.G1 > 0 && SystemClock.uptimeMillis() < chatActivityEnterView.G1 && (d53Var = chatActivityEnterView.H1) != null) {
                            d53Var2 = d53Var;
                        }
                        h94Var.c = d53Var2;
                    }
                    h94Var.a(f2);
                } else {
                    h94Var.c(max);
                }
                chatActivityEnterView.P();
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
                setPivotX(i - gm.L(22.0f));
                setPivotY(i2 - gm.L(22.0f));
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
                if (!chatActivityEnterView.K || chatActivityEnterView.y7 == 2) {
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
                this.b.A2(true);
                break;
            default:
                super.setVisibility(i);
                break;
        }
    }
}
