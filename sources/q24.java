// default package

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class q24 extends EditTextBoldCursor {
    public final /* synthetic */ byte M1;
    public final /* synthetic */ s24 N1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q24(s24 s24Var, Context context, int i) {
        super(context);
        this.N1 = s24Var;
        this.M1 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        s24 s24Var;
        View view;
        u46 u46Var;
        ?? r16;
        r59 r59Var;
        s24 s24Var2;
        int i2;
        boolean z;
        f24 f24Var;
        s24 s24Var3 = this.N1;
        e34 e34Var = s24Var3.H;
        q24 q24Var = s24Var3.d;
        if (!q24Var.isEnabled()) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0) {
            int i3 = 2;
            if (e34Var.u1.z()) {
                i = 2;
            } else {
                r59 r59Var2 = e34Var.E0;
                r59 r59Var3 = e34Var.Q;
                j24 j24Var = e34Var.k0;
                r59 r59Var4 = e34Var.i0;
                AnimatorSet animatorSet = e34Var.N0;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    e34Var.N0 = null;
                }
                boolean z2 = false;
                e34Var.J0 = false;
                e34Var.r0 = false;
                e34Var.d0 = false;
                int i4 = 0;
                while (i4 < 3) {
                    if (i4 == 0) {
                        s24Var = e34Var.W;
                        view = e34Var.J;
                        u46Var = e34Var.R;
                        r16 = z2;
                        r59Var = r59Var3;
                    } else if (i4 == 1) {
                        s24Var = e34Var.p0;
                        view = e34Var.q0;
                        u46Var = e34Var.j0;
                        r16 = z2;
                        r59Var = r59Var4;
                    } else {
                        s24Var = e34Var.H0;
                        view = e34Var.C0;
                        u46Var = e34Var.F0;
                        r16 = z2;
                        r59Var = r59Var2;
                    }
                    if (s24Var == null) {
                        s24Var2 = s24Var3;
                        i2 = i3;
                        z = r16;
                    } else if (s24Var3 == s24Var && (f24Var = e34Var.u1) != null && f24Var.A()) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        e34Var.N0 = animatorSet2;
                        Property property = View.TRANSLATION_Y;
                        if (view == null || i4 == i3) {
                            s24Var2 = s24Var3;
                            float f = i4 == i3 ? 0.0f : -gm.L(36.0f);
                            float[] fArr = new float[1];
                            fArr[r16] = f;
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(r59Var, (Property<r59, Float>) property, fArr);
                            float[] fArr2 = new float[1];
                            fArr2[r16] = gm.L(0.0f);
                            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(s24Var, (Property<s24, Float>) property, fArr2);
                            Animator[] animatorArr = new Animator[2];
                            animatorArr[r16] = ofFloat;
                            animatorArr[1] = ofFloat2;
                            animatorSet2.playTogether(animatorArr);
                        } else {
                            int i5 = i3;
                            s24Var2 = s24Var3;
                            float[] fArr3 = new float[1];
                            fArr3[r16] = -gm.L(40.0f);
                            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr3);
                            float[] fArr4 = new float[1];
                            fArr4[r16] = -gm.L(36.0f);
                            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(r59Var, (Property<r59, Float>) property, fArr4);
                            float[] fArr5 = new float[1];
                            fArr5[r16] = gm.L(0.0f);
                            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(s24Var, (Property<s24, Float>) property, fArr5);
                            Animator[] animatorArr2 = new Animator[3];
                            animatorArr2[r16] = ofFloat3;
                            animatorArr2[1] = ofFloat4;
                            animatorArr2[i5] = ofFloat5;
                            animatorSet2.playTogether(animatorArr2);
                        }
                        e34Var.N0.setDuration(220L);
                        e34Var.N0.setInterpolator(d53.f);
                        e34Var.N0.addListener(new u5(e34Var, r59Var, (byte) 20));
                        e34Var.N0.start();
                        z = r16;
                        i2 = 2;
                    } else {
                        s24Var2 = s24Var3;
                        s24Var.setTranslationY(gm.L(0.0f));
                        i2 = 2;
                        if (view != null && i4 != 2) {
                            view.setTranslationY(-gm.L(40.0f));
                        }
                        if (r59Var == r59Var2) {
                            int i6 = r16;
                            r59Var.setPadding(i6, i6, i6, e34Var.q2);
                        } else {
                            int i7 = r16;
                            if (r59Var == r59Var3) {
                                r59Var.setPadding(gm.L(5.0f), i7, gm.L(5.0f), e34Var.q2);
                            } else if (r59Var == r59Var4) {
                                r59Var.setPadding(i7, e34Var.c1, i7, e34Var.q2);
                            }
                        }
                        if (r59Var == r59Var4) {
                            boolean z3 = e34Var.o0.y.size() > 0;
                            j24Var.L = z3;
                            if (z3) {
                                j24Var.G("", true);
                                if (r59Var4.getAdapter() != j24Var) {
                                    r59Var4.setAdapter(j24Var);
                                }
                            }
                        }
                        z = false;
                        u46Var.g1(0, 0);
                    }
                    i4++;
                    i3 = i2;
                    z2 = z;
                    s24Var3 = s24Var2;
                }
                i = i3;
                e34Var.L(z2);
            }
            e34Var.u1.j(this.M1 == 1 ? i : 1);
            q24Var.requestFocus();
            gm.E3(q24Var);
        }
        return super.onTouchEvent(motionEvent);
    }
}
