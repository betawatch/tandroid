package th;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.RectF;
import android.text.Spannable;
import android.text.TextPaint;
import android.view.Menu;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.jj;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.pd;
import org.telegram.ui.un;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class t1 extends ChatActivityEnterView {
    public ValueAnimator t5;
    public int u5;
    public int v5;
    public int w5;
    public final /* synthetic */ z2 x5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(z2 z2Var, Activity activity, z2 z2Var2, org.telegram.ui.web.a0 a0Var) {
        super(activity, z2Var2, null, true, a0Var);
        this.x5 = z2Var;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void A0(int i10, int i11) {
        z2 z2Var = this.x5;
        if (z2Var.K1 != null) {
            this.n3 = true;
            this.v5 = this.E0.getMeasuredHeight();
            this.w5 = this.E0.getScrollY();
            invalidate();
            z2Var.invalidate();
            this.u5 = z2Var.K1.getBackgroundTop();
        }
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void K1(int i10, boolean z10) {
        super.K1(i10, z10);
        S1();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void O1(boolean z10) {
        z2 z2Var = this.x5;
        P1(z2Var.o1 || z2Var.p1, z10);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean Q0() {
        long messageMinPrice;
        if (this.A1.getAlpha() < 0.5f) {
            F0();
            return false;
        }
        z2 z2Var = this.x5;
        if (!z2Var.x1.f) {
            return super.Q0();
        }
        long j10 = z2Var.u3;
        messageMinPrice = z2Var.getMessageMinPrice();
        long max = Math.max(j10, messageMinPrice);
        TLRPC.TL_textWithEntities textWithEntities = getTextWithEntities();
        Spannable j02 = jj.j0(textWithEntities, false, false, new TextPaint());
        int length = j02.length();
        int[] iArr = vp.r1(z2Var.l2).Y6;
        if (length > ((iArr == null || iArr.length <= 2) ? 400 : iArr[2])) {
            NumberTextView numberTextView = this.b0;
            if (numberTextView != null) {
                org.telegram.messenger.i0.F3(3.5f, numberTextView, null);
                try {
                    this.b0.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
            }
            return false;
        }
        if (!z2Var.B0(true)) {
            int i10 = (int) max;
            if (((org.telegram.ui.Components.o5[]) j02.getSpans(0, j02.length(), org.telegram.ui.Components.o5.class)).length + ((org.telegram.messenger.h6[]) j02.getSpans(0, j02.length(), org.telegram.messenger.h6.class)).length > o.b(z2Var.l2, i10, 2) || j02.length() > o.b(z2Var.l2, i10, 1)) {
                z2Var.M0();
                return false;
            }
        }
        z2Var.u0.o(textWithEntities, max);
        this.E0.setText("");
        org.telegram.messenger.i0.v1(this);
        z2Var.u3 = 0L;
        z2Var.p0(true);
        F(true);
        return true;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean R0(boolean z10, int i10, int i11, long j10, boolean z11) {
        z2 z2Var = this.x5;
        if (!vp.r1(z2Var.l2).u2()) {
            return super.R0(z10, i10, i11, j10, z11);
        }
        org.telegram.ui.b.b(z2Var.l2);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void S1() {
        boolean z10;
        pd pdVar;
        z2 z2Var = this.x5;
        boolean z11 = z2Var.p2;
        if (!z2Var.K1.t0()) {
            t1 t1Var = z2Var.K1;
            if ((t1Var.k2 || t1Var.p4 <= 0.0f) && ((pdVar = this.e1) == null || pdVar.getVisibility() != 0)) {
                z10 = false;
                z2Var.p2 = z10;
                if (z11 == z10) {
                    if (z2Var.t1) {
                        o7 o7Var = ((f7) z2Var.z1).d;
                        o7Var.I0 = z10;
                        o7Var.d0();
                    }
                    invalidate();
                    z2Var.L0.invalidate();
                    return;
                }
                return;
            }
        }
        z10 = true;
        z2Var.p2 = z10;
        if (z11 == z10) {
        }
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void d0(Menu menu) {
        un.t8(menu, null, false, !this.x5.x1.f, true, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        TextView textView;
        TextView textView2;
        if (isEnabled()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        RectF rectF = org.telegram.messenger.i0.P;
        float width = getWidth();
        z2 z2Var = this.x5;
        rectF.set(0.0f, 0.0f, width + (z2Var.R1 != null ? this.D * 1.5f : 0.0f), getHeight());
        boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() == 0) {
            if (contains && (textView2 = z2Var.R1) != null) {
                textView2.setPressed(true);
            }
        } else if (motionEvent.getAction() == 1) {
            TextView textView3 = z2Var.R1;
            if (textView3 != null) {
                if (contains && textView3.isPressed()) {
                    z2.f0(z2Var);
                }
                z2Var.R1.setPressed(false);
            }
        } else if (motionEvent.getAction() == 3 && (textView = z2Var.R1) != null) {
            textView.setPressed(false);
        }
        TextView textView4 = z2Var.R1;
        return textView4 != null && textView4.isPressed();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void f1(float f7, float f10, float f11, boolean z10) {
        LinearLayout linearLayout = this.x5.P1;
        if (linearLayout != null) {
            linearLayout.setTranslationX((1.0f - f11) * f7);
        }
        super.f1(f7, f10, f11, z10);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final int getMessagesCount() {
        if (this.x5.x1.f) {
            return 1;
        }
        return super.getMessagesCount();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final long getStarsPrice() {
        long messageMinPrice;
        z2 z2Var = this.x5;
        if (!z2Var.x1.f) {
            return super.getStarsPrice();
        }
        messageMinPrice = z2Var.getMessageMinPrice();
        return Math.max(messageMinPrice, z2Var.u3);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean p() {
        return this.x5.B0(true);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean p1(Runnable runnable) {
        this.x5.l0(runnable);
        return true;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void u0() {
        S1();
    }
}
