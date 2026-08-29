package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class we1 extends org.telegram.ui.Cells.p2 {
    public boolean S4;
    public int T4;
    public TLRPC.TL_forumTopic U4;
    public org.telegram.ui.Components.p5 V4;
    public Drawable W4;
    public boolean X4;
    public boolean Y4;
    public boolean Z4;
    public Boolean a5;
    public float b5;
    public ValueAnimator c5;
    public final /* synthetic */ ze1 d5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public we1(ze1 ze1Var, Context context, boolean z10) {
        super(context, z10);
        this.d5 = ze1Var;
        this.T4 = -1;
        this.x = false;
        this.E = ze1Var.isInPreviewMode() ? 11 : 50;
        this.Q = 24.0f;
        this.F = 64;
        this.G = 76;
        this.j1 = true;
    }

    @Override // org.telegram.ui.Cells.p2
    public final boolean E() {
        return this.Z4;
    }

    public final void f0() {
        Drawable drawable = this.W4;
        boolean z10 = drawable instanceof yf.c;
        ze1 ze1Var = this.d5;
        if (z10) {
            ((yf.c) drawable).a(i0.a.d(this.b5, ze1Var.getThemedColor(org.telegram.ui.ActionBar.g6.R9), ze1Var.getThemedColor(org.telegram.ui.ActionBar.g6.L7)));
        }
        Drawable[] drawableArr = this.d0;
        if (drawableArr != null) {
            Drawable drawable2 = drawableArr[0];
            if (drawable2 instanceof yf.c) {
                ((yf.c) drawable2).a(i0.a.d(this.b5, ze1Var.getThemedColor(org.telegram.ui.ActionBar.g6.R9), ze1Var.getThemedColor(org.telegram.ui.ActionBar.g6.L7)));
            }
        }
        invalidate();
    }

    public final void g0(boolean z10) {
        boolean z11 = this.a5 != null;
        ValueAnimator valueAnimator = this.c5;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.c5 = null;
        }
        this.a5 = Boolean.valueOf(z10);
        if (!z11) {
            this.b5 = z10 ? 1.0f : 0.0f;
            f0();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.b5, z10 ? 1.0f : 0.0f);
        this.c5 = ofFloat;
        ofFloat.addUpdateListener(new w01(this, 18));
        this.c5.setInterpolator(org.telegram.ui.Components.jr.g);
        this.c5.start();
    }

    @Override // org.telegram.ui.Cells.p2
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // org.telegram.ui.Cells.p2, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.X4 = true;
        org.telegram.ui.Components.p5 p5Var = this.V4;
        if (p5Var != null) {
            p5Var.a(this);
        }
    }

    @Override // org.telegram.ui.Cells.p2, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.X4 = false;
        org.telegram.ui.Components.p5 p5Var = this.V4;
        if (p5Var != null) {
            p5Var.o(this);
        }
    }

    @Override // org.telegram.ui.Cells.p2, android.view.View
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.Components.ei0 ei0Var;
        nh.h3 h3Var;
        ze1 ze1Var = this.d5;
        if (ze1Var.getMessagesController().isMonoForum(-ze1Var.a)) {
            super.onDraw(canvas);
            return;
        }
        this.B3 = (!this.g0 || (h3Var = this.m2) == null) ? 0.0f : h3Var.getProgress() * AndroidUtilities.dp(30.0f);
        canvas.save();
        float f9 = this.B3;
        int i10 = -AndroidUtilities.dp(4.0f);
        this.A3 = i10;
        canvas.translate(f9, i10);
        canvas.drawColor(ze1Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
        super.onDraw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(this.s1, 0.0f);
        if (this.S4) {
            int dp = this.p2 ? 0 : AndroidUtilities.dp(this.E);
            if (LocaleController.isRTL) {
                canvas.drawLine(0.0f - this.s1, getMeasuredHeight() - 1, getMeasuredWidth() - dp, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.k0);
            } else {
                canvas.drawLine(dp - this.s1, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.k0);
            }
        }
        if ((!this.Y4 || (ei0Var = this.a2) == null || ei0Var.C != 0.0f) && (this.V4 != null || this.W4 != null)) {
            int dp2 = AndroidUtilities.dp(10.0f);
            int dp3 = AndroidUtilities.dp(10.0f);
            int dp4 = AndroidUtilities.dp(28.0f);
            org.telegram.ui.Components.p5 p5Var = this.V4;
            if (p5Var != null) {
                if (LocaleController.isRTL) {
                    p5Var.setBounds((getWidth() - dp2) - dp4, dp3, getWidth() - dp2, dp4 + dp3);
                } else {
                    p5Var.setBounds(dp2, dp3, dp2 + dp4, dp4 + dp3);
                }
                this.V4.draw(canvas);
            } else {
                if (LocaleController.isRTL) {
                    this.W4.setBounds((getWidth() - dp2) - dp4, dp3, getWidth() - dp2, dp4 + dp3);
                } else {
                    this.W4.setBounds(dp2, dp3, dp2 + dp4, dp4 + dp3);
                }
                this.W4.draw(canvas);
            }
        }
        canvas.restore();
    }

    public void setAnimatedEmojiDrawable(org.telegram.ui.Components.p5 p5Var) {
        org.telegram.ui.Components.p5 p5Var2 = this.V4;
        if (p5Var2 == p5Var) {
            return;
        }
        if (p5Var2 != null && this.X4) {
            p5Var2.o(this);
        }
        if (p5Var != null) {
            p5Var.setColorFilter(org.telegram.ui.ActionBar.g6.v3);
        }
        this.V4 = p5Var;
        if (p5Var == null || !this.X4) {
            return;
        }
        p5Var.a(this);
    }

    public void setForumIcon(Drawable drawable) {
        this.W4 = drawable;
    }

    public void setTopicIcon(TLRPC.TL_forumTopic tL_forumTopic) {
        int i10;
        this.U4 = tL_forumTopic;
        boolean z10 = false;
        this.Z4 = tL_forumTopic != null && tL_forumTopic.closed;
        if (this.g0) {
            g0(tL_forumTopic != null && tL_forumTopic.hidden);
        }
        this.Y4 = tL_forumTopic != null && tL_forumTopic.id == 1;
        ze1 ze1Var = this.d5;
        if (tL_forumTopic != null && this != ze1Var.X0) {
            if (tL_forumTopic.hidden) {
                this.H1 = true;
                this.I1 = org.telegram.ui.ActionBar.g6.d9;
                this.J1 = org.telegram.ui.ActionBar.g6.c9;
                this.K1 = "Unhide";
                this.L1 = R.string.Unhide;
                this.M1 = org.telegram.ui.ActionBar.g6.y1;
            } else {
                this.H1 = true;
                this.I1 = org.telegram.ui.ActionBar.g6.c9;
                this.J1 = org.telegram.ui.ActionBar.g6.d9;
                this.K1 = "Hide";
                this.L1 = R.string.Hide;
                this.M1 = org.telegram.ui.ActionBar.g6.x1;
            }
            invalidate();
        }
        if (this.g0) {
            return;
        }
        if (tL_forumTopic != null && tL_forumTopic.id == 1) {
            setAnimatedEmojiDrawable(null);
            setForumIcon(yf.d.c(getContext(), 1.0f, ze1Var.getThemedColor(org.telegram.ui.ActionBar.g6.Ac), false));
        } else if (tL_forumTopic == null || tL_forumTopic.icon_emoji_id == 0) {
            setAnimatedEmojiDrawable(null);
            setForumIcon(yf.d.e(tL_forumTopic));
        } else {
            setForumIcon(null);
            org.telegram.ui.Components.p5 p5Var = this.V4;
            if (p5Var == null || p5Var.i() != tL_forumTopic.icon_emoji_id) {
                int i11 = ze1Var.q0 ? 13 : 10;
                i10 = ((org.telegram.ui.ActionBar.o2) ze1Var).currentAccount;
                setAnimatedEmojiDrawable(new org.telegram.ui.Components.p5(i11, i10, tL_forumTopic.icon_emoji_id));
            }
        }
        if (tL_forumTopic != null && tL_forumTopic.hidden) {
            z10 = true;
        }
        g0(z10);
        t();
    }

    @Override // org.telegram.ui.Cells.p2
    public final void t() {
        super.t();
        f0();
    }
}
