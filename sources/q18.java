// default package

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.RectF;
import android.text.Spannable;
import android.text.TextPaint;
import android.view.Menu;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.NumberTextView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class q18 extends ChatActivityEnterView {
    public ValueAnimator s7;
    public int t7;
    public int u7;
    public int v7;
    public final /* synthetic */ y28 w7;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q18(y28 y28Var, Activity activity, y28 y28Var2, gu0 gu0Var) {
        super(activity, y28Var2, null, true, gu0Var);
        this.w7 = y28Var;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void B0(Menu menu) {
        mu1.x6(menu, null, false, !this.w7.E1.f, true, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H2() {
        boolean z;
        cw1 cw1Var;
        y28 y28Var = this.w7;
        boolean z2 = y28Var.w2;
        if (!y28Var.R1.T0()) {
            q18 q18Var = y28Var.R1;
            if ((q18Var.a3 || q18Var.e5 <= 0.0f) && ((cw1Var = this.f1) == null || cw1Var.getVisibility() != 0)) {
                z = false;
                y28Var.w2 = z;
                if (z2 == z) {
                    if (y28Var.A1) {
                        m8b m8bVar = ((d8b) y28Var.G1).d;
                        m8bVar.I0 = z;
                        m8bVar.U();
                    }
                    invalidate();
                    y28Var.S0.invalidate();
                    return;
                }
                return;
            }
        }
        z = true;
        y28Var.w2 = z;
        if (z2 == z) {
        }
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void I1(float f, float f2, float f3, boolean z) {
        LinearLayout linearLayout = this.w7.W1;
        if (linearLayout != null) {
            linearLayout.setTranslationX((1.0f - f3) * f);
        }
        super.I1(f, f2, f3, z);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void U0() {
        H2();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean U1(Runnable runnable) {
        this.w7.d0(runnable);
        return true;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void c1(int i, int i2) {
        y28 y28Var = this.w7;
        if (y28Var.R1 != null) {
            this.d4 = true;
            this.u7 = this.F0.getMeasuredHeight();
            this.v7 = this.F0.getScrollY();
            invalidate();
            y28Var.invalidate();
            this.t7 = y28Var.R1.getBackgroundTop();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        TextView textView;
        TextView textView2;
        if (isEnabled()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        RectF rectF = gl.P;
        float width = getWidth();
        y28 y28Var = this.w7;
        rectF.set(0.0f, 0.0f, width + (y28Var.Y1 != null ? this.E * 1.5f : 0.0f), getHeight());
        boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() == 0) {
            if (contains && (textView2 = y28Var.Y1) != null) {
                textView2.setPressed(true);
            }
        } else if (motionEvent.getAction() == 1) {
            TextView textView3 = y28Var.Y1;
            if (textView3 != null) {
                if (contains && textView3.isPressed()) {
                    y28Var.Y0();
                }
                y28Var.Y1.setPressed(false);
            }
        } else if (motionEvent.getAction() == 3 && (textView = y28Var.Y1) != null) {
            textView.setPressed(false);
        }
        TextView textView4 = y28Var.Y1;
        return textView4 != null && textView4.isPressed();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final int getMessagesCount() {
        if (this.w7.E1.f) {
            return 1;
        }
        return super.getMessagesCount();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final long getStarsPrice() {
        long messageMinPrice;
        y28 y28Var = this.w7;
        if (!y28Var.E1.f) {
            return super.getStarsPrice();
        }
        messageMinPrice = y28Var.getMessageMinPrice();
        return Math.max(messageMinPrice, y28Var.A3);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void r2(int i, boolean z) {
        super.r2(i, z);
        H2();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean u1() {
        long messageMinPrice;
        int i;
        if (this.q2.getAlpha() < 0.5f) {
            h1();
            return false;
        }
        y28 y28Var = this.w7;
        if (!y28Var.E1.f) {
            return super.u1();
        }
        long j = y28Var.A3;
        messageMinPrice = y28Var.getMessageMinPrice();
        long max = Math.max(j, messageMinPrice);
        TLRPC.TL_textWithEntities textWithEntities = getTextWithEntities();
        CharSequence j0 = k27.j0(textWithEntities, false, false, new TextPaint());
        int length = j0.length();
        int[] iArr = na7.q1(y28Var.s2).T3;
        if (length > ((iArr == null || iArr.length <= 2) ? 400 : iArr[2])) {
            NumberTextView numberTextView = this.c0;
            if (numberTextView != null) {
                gl.A3(3.5f, numberTextView, null);
                try {
                    this.c0.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
            }
            return false;
        }
        if (!y28Var.v0(true)) {
            if (j0 instanceof Spannable) {
                Spannable spannable = (Spannable) j0;
                i = ((gm[]) spannable.getSpans(0, j0.length(), gm.class)).length + ((su3[]) spannable.getSpans(0, j0.length(), su3.class)).length;
            } else {
                i = 0;
            }
            int i2 = (int) max;
            if (i > de5.b(y28Var.s2, i2, 2) || j0.length() > de5.b(y28Var.s2, i2, 1)) {
                y28Var.H0();
                return false;
            }
        }
        y28Var.B0.n(textWithEntities, max);
        this.F0.setText("");
        gl.t1(this);
        y28Var.A3 = 0L;
        y28Var.h0(true);
        N(true);
        return true;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean v1(boolean z, int i, int i2, long j, boolean z2) {
        y28 y28Var = this.w7;
        if (!na7.q1(y28Var.s2).t2()) {
            return super.v1(z, i, i2, j, z2);
        }
        h5.b(y28Var.s2);
        return false;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void v2(boolean z) {
        y28 y28Var = this.w7;
        w2(y28Var.v1 || y28Var.w1, z);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean w() {
        return this.w7.v0(true);
    }
}
