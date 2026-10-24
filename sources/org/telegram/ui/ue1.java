package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class ue1 extends org.telegram.ui.Cells.q2 {
    public boolean a5;
    public int b5;
    public TLRPC.TL_forumTopic c5;
    public org.telegram.ui.Components.r5 d5;
    public Drawable e5;
    public boolean f5;
    public boolean g5;
    public boolean h5;
    public Boolean i5;
    public float j5;
    public ValueAnimator k5;
    public final /* synthetic */ ye1 l5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ue1(ye1 ye1Var, Context context, boolean z10) {
        super(context, z10);
        this.l5 = ye1Var;
        this.b5 = -1;
        this.x = false;
        this.I = ye1Var.isInPreviewMode() ? 11 : 50;
        this.U = 24.0f;
        this.J = 64;
        this.K = 76;
        this.n1 = true;
    }

    @Override // org.telegram.ui.Cells.q2
    public final boolean D() {
        return this.h5;
    }

    public final void e0() {
        Drawable drawable = this.e5;
        boolean z10 = drawable instanceof og.c;
        ye1 ye1Var = this.l5;
        if (z10) {
            ((og.c) drawable).a(i0.a.f(this.j5, ye1Var.getThemedColor(org.telegram.ui.ActionBar.k6.R9), ye1Var.getThemedColor(org.telegram.ui.ActionBar.k6.L7)));
        }
        Drawable[] drawableArr = this.h0;
        if (drawableArr != null) {
            Drawable drawable2 = drawableArr[0];
            if (drawable2 instanceof og.c) {
                ((og.c) drawable2).a(i0.a.f(this.j5, ye1Var.getThemedColor(org.telegram.ui.ActionBar.k6.R9), ye1Var.getThemedColor(org.telegram.ui.ActionBar.k6.L7)));
            }
        }
        invalidate();
    }

    public final void f0(boolean z10) {
        boolean z11 = this.i5 != null;
        ValueAnimator valueAnimator = this.k5;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.k5 = null;
        }
        this.i5 = Boolean.valueOf(z10);
        if (!z11) {
            this.j5 = z10 ? 1.0f : 0.0f;
            e0();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.j5, z10 ? 1.0f : 0.0f);
        this.k5 = ofFloat;
        ofFloat.addUpdateListener(new g11(this, 16));
        this.k5.setInterpolator(org.telegram.ui.Components.bs.g);
        this.k5.start();
    }

    @Override // org.telegram.ui.Cells.q2, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f5 = true;
        org.telegram.ui.Components.r5 r5Var = this.d5;
        if (r5Var != null) {
            r5Var.a(this);
        }
    }

    @Override // org.telegram.ui.Cells.q2, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f5 = false;
        org.telegram.ui.Components.r5 r5Var = this.d5;
        if (r5Var != null) {
            r5Var.o(this);
        }
    }

    @Override // org.telegram.ui.Cells.q2, android.view.View
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.Components.ij0 ij0Var;
        ei.k3 k3Var;
        ye1 ye1Var = this.l5;
        if (ye1Var.getMessagesController().isMonoForum(-ye1Var.a)) {
            super.onDraw(canvas);
            return;
        }
        this.F3 = (!this.k0 || (k3Var = this.q2) == null) ? 0.0f : k3Var.getProgress() * AndroidUtilities.dp(30.0f);
        canvas.save();
        float f7 = this.F3;
        int i10 = -AndroidUtilities.dp(4.0f);
        this.E3 = i10;
        canvas.translate(f7, i10);
        canvas.drawColor(ye1Var.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
        super.onDraw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(this.w1, 0.0f);
        if (this.a5) {
            int dp = this.t2 ? 0 : AndroidUtilities.dp(this.I);
            if (LocaleController.isRTL) {
                canvas.drawLine(0.0f - this.w1, getMeasuredHeight() - 1, getMeasuredWidth() - dp, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.k0);
            } else {
                canvas.drawLine(dp - this.w1, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.k0);
            }
        }
        if ((!this.g5 || (ij0Var = this.e2) == null || ij0Var.C != 0.0f) && (this.d5 != null || this.e5 != null)) {
            int dp2 = AndroidUtilities.dp(10.0f);
            int dp3 = AndroidUtilities.dp(10.0f);
            int dp4 = AndroidUtilities.dp(28.0f);
            org.telegram.ui.Components.r5 r5Var = this.d5;
            if (r5Var != null) {
                if (LocaleController.isRTL) {
                    r5Var.setBounds((getWidth() - dp2) - dp4, dp3, getWidth() - dp2, dp4 + dp3);
                } else {
                    r5Var.setBounds(dp2, dp3, dp2 + dp4, dp4 + dp3);
                }
                this.d5.draw(canvas);
            } else {
                if (LocaleController.isRTL) {
                    this.e5.setBounds((getWidth() - dp2) - dp4, dp3, getWidth() - dp2, dp4 + dp3);
                } else {
                    this.e5.setBounds(dp2, dp3, dp2 + dp4, dp4 + dp3);
                }
                this.e5.draw(canvas);
            }
        }
        canvas.restore();
    }

    public void setAnimatedEmojiDrawable(org.telegram.ui.Components.r5 r5Var) {
        org.telegram.ui.Components.r5 r5Var2 = this.d5;
        if (r5Var2 == r5Var) {
            return;
        }
        if (r5Var2 != null && this.f5) {
            r5Var2.o(this);
        }
        if (r5Var != null) {
            r5Var.setColorFilter(org.telegram.ui.ActionBar.k6.v3);
        }
        this.d5 = r5Var;
        if (r5Var == null || !this.f5) {
            return;
        }
        r5Var.a(this);
    }

    public void setForumIcon(Drawable drawable) {
        this.e5 = drawable;
    }

    public void setTopicIcon(TLRPC.TL_forumTopic tL_forumTopic) {
        int i10;
        this.c5 = tL_forumTopic;
        boolean z10 = false;
        this.h5 = tL_forumTopic != null && tL_forumTopic.closed;
        if (this.k0) {
            f0(tL_forumTopic != null && tL_forumTopic.hidden);
        }
        this.g5 = tL_forumTopic != null && tL_forumTopic.id == 1;
        ye1 ye1Var = this.l5;
        if (tL_forumTopic != null && this != ye1Var.c1) {
            if (tL_forumTopic.hidden) {
                this.L1 = true;
                this.M1 = org.telegram.ui.ActionBar.k6.d9;
                this.N1 = org.telegram.ui.ActionBar.k6.c9;
                this.O1 = "Unhide";
                this.P1 = R.string.Unhide;
                this.Q1 = org.telegram.ui.ActionBar.k6.y1;
            } else {
                this.L1 = true;
                this.M1 = org.telegram.ui.ActionBar.k6.c9;
                this.N1 = org.telegram.ui.ActionBar.k6.d9;
                this.O1 = "Hide";
                this.P1 = R.string.Hide;
                this.Q1 = org.telegram.ui.ActionBar.k6.x1;
            }
            invalidate();
        }
        if (this.k0) {
            return;
        }
        if (tL_forumTopic != null && tL_forumTopic.id == 1) {
            setAnimatedEmojiDrawable(null);
            setForumIcon(og.d.c(getContext(), 1.0f, ye1Var.getThemedColor(org.telegram.ui.ActionBar.k6.Ac), false));
        } else if (tL_forumTopic == null || tL_forumTopic.icon_emoji_id == 0) {
            setAnimatedEmojiDrawable(null);
            setForumIcon(og.d.e(tL_forumTopic));
        } else {
            setForumIcon(null);
            org.telegram.ui.Components.r5 r5Var = this.d5;
            if (r5Var == null || r5Var.i() != tL_forumTopic.icon_emoji_id) {
                int i11 = ye1Var.u0 ? 13 : 10;
                i10 = ((org.telegram.ui.ActionBar.o2) ye1Var).currentAccount;
                setAnimatedEmojiDrawable(new org.telegram.ui.Components.r5(i11, i10, tL_forumTopic.icon_emoji_id));
            }
        }
        if (tL_forumTopic != null && tL_forumTopic.hidden) {
            z10 = true;
        }
        f0(z10);
        t();
    }

    @Override // org.telegram.ui.Cells.q2
    public final void t() {
        super.t();
        e0();
    }

    @Override // org.telegram.ui.Cells.q2, org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        super.updateColors();
        try {
            if (this.i5 != null) {
                e0();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
