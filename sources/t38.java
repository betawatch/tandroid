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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class t38 extends ChatActivityEnterView {
    public ValueAnimator A7;
    public int B7;
    public int C7;
    public int D7;
    public final /* synthetic */ a58 E7;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t38(a58 a58Var, Activity activity, a58 a58Var2, pv0 pv0Var) {
        super(activity, a58Var2, null, true, pv0Var);
        this.E7 = a58Var;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void A2(boolean z) {
        a58 a58Var = this.E7;
        B2(a58Var.v1 || a58Var.w1, z);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void B0(Menu menu) {
        yv1.E6(menu, null, false, !this.E7.E1.f, true, true);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void L1(float f, float f2, float f3, boolean z) {
        LinearLayout linearLayout = this.E7.W1;
        if (linearLayout != null) {
            linearLayout.setTranslationX((1.0f - f3) * f);
        }
        super.L1(f, f2, f3, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M2() {
        boolean z;
        px1 px1Var;
        a58 a58Var = this.E7;
        boolean z2 = a58Var.w2;
        if (!a58Var.R1.U0()) {
            t38 t38Var = a58Var.R1;
            if ((t38Var.a3 || t38Var.e5 <= 0.0f) && ((px1Var = this.f1) == null || px1Var.getVisibility() != 0)) {
                z = false;
                a58Var.w2 = z;
                if (z2 == z) {
                    if (a58Var.A1) {
                        oab oabVar = ((fab) a58Var.G1).d;
                        oabVar.I0 = z;
                        oabVar.U();
                    }
                    invalidate();
                    a58Var.S0.invalidate();
                    return;
                }
                return;
            }
        }
        z = true;
        a58Var.w2 = z;
        if (z2 == z) {
        }
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void V0() {
        M2();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean X1(Runnable runnable) {
        this.E7.d0(runnable);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        TextView textView;
        TextView textView2;
        if (isEnabled()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        RectF rectF = gm.P;
        float width = getWidth();
        a58 a58Var = this.E7;
        rectF.set(0.0f, 0.0f, width + (a58Var.Y1 != null ? this.E * 1.5f : 0.0f), getHeight());
        boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() == 0) {
            if (contains && (textView2 = a58Var.Y1) != null) {
                textView2.setPressed(true);
            }
        } else if (motionEvent.getAction() == 1) {
            TextView textView3 = a58Var.Y1;
            if (textView3 != null) {
                if (contains && textView3.isPressed()) {
                    a58Var.Y0();
                }
                a58Var.Y1.setPressed(false);
            }
        } else if (motionEvent.getAction() == 3 && (textView = a58Var.Y1) != null) {
            textView.setPressed(false);
        }
        TextView textView4 = a58Var.Y1;
        return textView4 != null && textView4.isPressed();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void e1(int i, int i2) {
        a58 a58Var = this.E7;
        if (a58Var.R1 != null) {
            this.d4 = true;
            this.C7 = this.F0.getMeasuredHeight();
            this.D7 = this.F0.getScrollY();
            invalidate();
            a58Var.invalidate();
            this.B7 = a58Var.R1.getBackgroundTop();
        }
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final int getMessagesCount() {
        if (this.E7.E1.f) {
            return 1;
        }
        return super.getMessagesCount();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final long getStarsPrice() {
        long messageMinPrice;
        a58 a58Var = this.E7;
        if (!a58Var.E1.f) {
            return super.getStarsPrice();
        }
        messageMinPrice = a58Var.getMessageMinPrice();
        return Math.max(messageMinPrice, a58Var.A3);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean v() {
        return this.E7.v0(true);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean w1() {
        long messageMinPrice;
        int i;
        if (this.q2.getAlpha() < 0.5f) {
            j1();
            return false;
        }
        a58 a58Var = this.E7;
        if (!a58Var.E1.f) {
            return super.w1();
        }
        long j = a58Var.A3;
        messageMinPrice = a58Var.getMessageMinPrice();
        long max = Math.max(j, messageMinPrice);
        TLRPC.TL_textWithEntities textWithEntities = getTextWithEntities();
        CharSequence j0 = k47.j0(textWithEntities, false, false, new TextPaint());
        int length = j0.length();
        int[] iArr = oc7.r1(a58Var.s2).T3;
        if (length > ((iArr == null || iArr.length <= 2) ? 400 : iArr[2])) {
            NumberTextView numberTextView = this.c0;
            if (numberTextView != null) {
                gm.A3(3.5f, numberTextView, null);
                try {
                    this.c0.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
            }
            return false;
        }
        if (!a58Var.v0(true)) {
            if (j0 instanceof Spannable) {
                Spannable spannable = (Spannable) j0;
                i = ((gn[]) spannable.getSpans(0, j0.length(), gn.class)).length + ((dw3[]) spannable.getSpans(0, j0.length(), dw3.class)).length;
            } else {
                i = 0;
            }
            int i2 = (int) max;
            if (i > bg5.b(a58Var.s2, i2, 2) || j0.length() > bg5.b(a58Var.s2, i2, 1)) {
                a58Var.H0();
                return false;
            }
        }
        a58Var.B0.n(textWithEntities, max);
        this.F0.setText("");
        gm.t1(this);
        a58Var.A3 = 0L;
        a58Var.h0(true);
        M(true);
        return true;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void w2(int i, boolean z) {
        super.w2(i, z);
        M2();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean x1(boolean z, int i, int i2, long j, boolean z2) {
        a58 a58Var = this.E7;
        if (!oc7.r1(a58Var.s2).u2()) {
            return super.x1(z, i, i2, j, z2);
        }
        h5.b(a58Var.s2);
        return false;
    }
}
