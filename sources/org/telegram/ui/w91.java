package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class w91 extends org.telegram.ui.Cells.t2 {
    public boolean a5;
    public int b5;
    public TLRPC.TL_forumTopic c5;
    public org.telegram.ui.Components.h5 d5;
    public Drawable e5;
    public boolean f5;
    public boolean g5;
    public boolean h5;
    public Boolean i5;
    public float j5;
    public ValueAnimator k5;
    public final /* synthetic */ z91 l5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w91(z91 z91Var, Context context, boolean z9) {
        super(context, z9);
        this.l5 = z91Var;
        this.b5 = -1;
        this.y = false;
        this.I = z91Var.isInPreviewMode() ? 11 : 50;
        this.U = 24.0f;
        this.J = 64;
        this.K = 76;
        this.n1 = true;
    }

    @Override // org.telegram.ui.Cells.t2
    public final boolean J() {
        return this.h5;
    }

    public final void n0() {
        Drawable drawable = this.e5;
        boolean z9 = drawable instanceof qg.c;
        z91 z91Var = this.l5;
        if (z9) {
            ((qg.c) drawable).a(i0.a.f(this.j5, z91Var.getThemedColor(org.telegram.ui.ActionBar.m6.R9), z91Var.getThemedColor(org.telegram.ui.ActionBar.m6.L7)));
        }
        Drawable[] drawableArr = this.h0;
        if (drawableArr != null) {
            Drawable drawable2 = drawableArr[0];
            if (drawable2 instanceof qg.c) {
                ((qg.c) drawable2).a(i0.a.f(this.j5, z91Var.getThemedColor(org.telegram.ui.ActionBar.m6.R9), z91Var.getThemedColor(org.telegram.ui.ActionBar.m6.L7)));
            }
        }
        invalidate();
    }

    public final void o0(boolean z9) {
        boolean z10 = this.i5 != null;
        ValueAnimator valueAnimator = this.k5;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.k5 = null;
        }
        this.i5 = Boolean.valueOf(z9);
        if (!z10) {
            this.j5 = z9 ? 1.0f : 0.0f;
            n0();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.j5, z9 ? 1.0f : 0.0f);
        this.k5 = ofFloat;
        ofFloat.addUpdateListener(new kz0(this, 14));
        this.k5.setInterpolator(org.telegram.ui.Components.wq.g);
        this.k5.start();
    }

    @Override // org.telegram.ui.Cells.t2, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f5 = true;
        org.telegram.ui.Components.h5 h5Var = this.d5;
        if (h5Var != null) {
            h5Var.a(this);
        }
    }

    @Override // org.telegram.ui.Cells.t2, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f5 = false;
        org.telegram.ui.Components.h5 h5Var = this.d5;
        if (h5Var != null) {
            h5Var.n(this);
        }
    }

    @Override // org.telegram.ui.Cells.t2, android.view.View
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.Components.kg0 kg0Var;
        fi.a3 a3Var;
        z91 z91Var = this.l5;
        if (z91Var.getMessagesController().y2(-z91Var.a)) {
            super.onDraw(canvas);
            return;
        }
        this.F3 = (!this.k0 || (a3Var = this.q2) == null) ? 0.0f : a3Var.getProgress() * org.telegram.messenger.g0.L(30.0f);
        canvas.save();
        float f10 = this.F3;
        int i7 = -org.telegram.messenger.g0.L(4.0f);
        this.E3 = i7;
        canvas.translate(f10, i7);
        canvas.drawColor(z91Var.getThemedColor(org.telegram.ui.ActionBar.m6.d6));
        super.onDraw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(this.w1, 0.0f);
        if (this.a5) {
            int L = this.t2 ? 0 : org.telegram.messenger.g0.L(this.I);
            if (org.telegram.messenger.id.a0) {
                canvas.drawLine(0.0f - this.w1, getMeasuredHeight() - 1, getMeasuredWidth() - L, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.m6.k0);
            } else {
                canvas.drawLine(L - this.w1, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.m6.k0);
            }
        }
        if ((!this.g5 || (kg0Var = this.e2) == null || kg0Var.C != 0.0f) && (this.d5 != null || this.e5 != null)) {
            int L2 = org.telegram.messenger.g0.L(10.0f);
            int L3 = org.telegram.messenger.g0.L(10.0f);
            int L4 = org.telegram.messenger.g0.L(28.0f);
            org.telegram.ui.Components.h5 h5Var = this.d5;
            if (h5Var != null) {
                if (org.telegram.messenger.id.a0) {
                    h5Var.setBounds((getWidth() - L2) - L4, L3, getWidth() - L2, L4 + L3);
                } else {
                    h5Var.setBounds(L2, L3, L2 + L4, L4 + L3);
                }
                this.d5.draw(canvas);
            } else {
                if (org.telegram.messenger.id.a0) {
                    this.e5.setBounds((getWidth() - L2) - L4, L3, getWidth() - L2, L4 + L3);
                } else {
                    this.e5.setBounds(L2, L3, L2 + L4, L4 + L3);
                }
                this.e5.draw(canvas);
            }
        }
        canvas.restore();
    }

    public void setAnimatedEmojiDrawable(org.telegram.ui.Components.h5 h5Var) {
        org.telegram.ui.Components.h5 h5Var2 = this.d5;
        if (h5Var2 == h5Var) {
            return;
        }
        if (h5Var2 != null && this.f5) {
            h5Var2.n(this);
        }
        if (h5Var != null) {
            h5Var.setColorFilter(org.telegram.ui.ActionBar.m6.v3);
        }
        this.d5 = h5Var;
        if (h5Var == null || !this.f5) {
            return;
        }
        h5Var.a(this);
    }

    public void setForumIcon(Drawable drawable) {
        this.e5 = drawable;
    }

    public void setTopicIcon(TLRPC.TL_forumTopic tL_forumTopic) {
        int i7;
        this.c5 = tL_forumTopic;
        boolean z9 = false;
        this.h5 = tL_forumTopic != null && tL_forumTopic.closed;
        if (this.k0) {
            o0(tL_forumTopic != null && tL_forumTopic.hidden);
        }
        this.g5 = tL_forumTopic != null && tL_forumTopic.id == 1;
        z91 z91Var = this.l5;
        if (tL_forumTopic != null && this != z91Var.c1) {
            if (tL_forumTopic.hidden) {
                this.L1 = true;
                this.M1 = org.telegram.ui.ActionBar.m6.d9;
                this.N1 = org.telegram.ui.ActionBar.m6.c9;
                this.O1 = "Unhide";
                this.P1 = 2131743884;
                this.Q1 = org.telegram.ui.ActionBar.m6.y1;
            } else {
                this.L1 = true;
                this.M1 = org.telegram.ui.ActionBar.m6.c9;
                this.N1 = org.telegram.ui.ActionBar.m6.d9;
                this.O1 = "Hide";
                this.P1 = 2131749325;
                this.Q1 = org.telegram.ui.ActionBar.m6.x1;
            }
            invalidate();
        }
        if (this.k0) {
            return;
        }
        if (tL_forumTopic != null && tL_forumTopic.id == 1) {
            setAnimatedEmojiDrawable(null);
            setForumIcon(qg.d.c(getContext(), 1.0f, z91Var.getThemedColor(org.telegram.ui.ActionBar.m6.od), false));
        } else if (tL_forumTopic == null || tL_forumTopic.icon_emoji_id == 0) {
            setAnimatedEmojiDrawable(null);
            setForumIcon(qg.d.e(tL_forumTopic));
        } else {
            setForumIcon(null);
            org.telegram.ui.Components.h5 h5Var = this.d5;
            if (h5Var == null || h5Var.h() != tL_forumTopic.icon_emoji_id) {
                int i10 = z91Var.u0 ? 13 : 10;
                i7 = ((org.telegram.ui.ActionBar.f2) z91Var).currentAccount;
                setAnimatedEmojiDrawable(new org.telegram.ui.Components.h5(i10, i7, tL_forumTopic.icon_emoji_id));
            }
        }
        if (tL_forumTopic != null && tL_forumTopic.hidden) {
            z9 = true;
        }
        o0(z9);
        x();
    }

    @Override // org.telegram.ui.Cells.t2, org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        super.updateColors();
        try {
            if (this.i5 != null) {
                n0();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.Cells.t2
    public final void x() {
        super.x();
        n0();
    }
}
