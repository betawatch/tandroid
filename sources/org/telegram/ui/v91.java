package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class v91 extends org.telegram.ui.Cells.u2 {
    public boolean b5;
    public int c5;
    public TLRPC.TL_forumTopic d5;
    public org.telegram.ui.Components.o5 e5;
    public Drawable f5;
    public boolean g5;
    public boolean h5;
    public boolean i5;
    public Boolean j5;
    public float k5;
    public ValueAnimator l5;
    public final /* synthetic */ y91 m5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v91(y91 y91Var, Context context, boolean z10) {
        super(context, z10);
        this.m5 = y91Var;
        this.c5 = -1;
        this.y = false;
        this.J = y91Var.isInPreviewMode() ? 11 : 50;
        this.V = 24.0f;
        this.K = 64;
        this.L = 76;
        this.o1 = true;
    }

    @Override // org.telegram.ui.Cells.u2
    public final boolean K() {
        return this.i5;
    }

    public final void n0() {
        Drawable drawable = this.f5;
        boolean z10 = drawable instanceof qg.b;
        y91 y91Var = this.m5;
        if (z10) {
            ((qg.b) drawable).a(i0.a.f(this.k5, y91Var.getThemedColor(org.telegram.ui.ActionBar.n6.R9), y91Var.getThemedColor(org.telegram.ui.ActionBar.n6.L7)));
        }
        Drawable[] drawableArr = this.i0;
        if (drawableArr != null) {
            Drawable drawable2 = drawableArr[0];
            if (drawable2 instanceof qg.b) {
                ((qg.b) drawable2).a(i0.a.f(this.k5, y91Var.getThemedColor(org.telegram.ui.ActionBar.n6.R9), y91Var.getThemedColor(org.telegram.ui.ActionBar.n6.L7)));
            }
        }
        invalidate();
    }

    public final void o0(boolean z10) {
        boolean z11 = this.j5 != null;
        ValueAnimator valueAnimator = this.l5;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.l5 = null;
        }
        this.j5 = Boolean.valueOf(z10);
        if (!z11) {
            this.k5 = z10 ? 1.0f : 0.0f;
            n0();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.k5, z10 ? 1.0f : 0.0f);
        this.l5 = ofFloat;
        ofFloat.addUpdateListener(new iz0(this, 14));
        this.l5.setInterpolator(org.telegram.ui.Components.lr.g);
        this.l5.start();
    }

    @Override // org.telegram.ui.Cells.u2, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.g5 = true;
        org.telegram.ui.Components.o5 o5Var = this.e5;
        if (o5Var != null) {
            o5Var.a(this);
        }
    }

    @Override // org.telegram.ui.Cells.u2, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.g5 = false;
        org.telegram.ui.Components.o5 o5Var = this.e5;
        if (o5Var != null) {
            o5Var.n(this);
        }
    }

    @Override // org.telegram.ui.Cells.u2, android.view.View
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.Components.xg0 xg0Var;
        hi.z2 z2Var;
        y91 y91Var = this.m5;
        if (y91Var.getMessagesController().E2(-y91Var.a)) {
            super.onDraw(canvas);
            return;
        }
        this.G3 = (!this.l0 || (z2Var = this.r2) == null) ? 0.0f : z2Var.getProgress() * org.telegram.messenger.g0.L(30.0f);
        canvas.save();
        float f10 = this.G3;
        int i7 = -org.telegram.messenger.g0.L(4.0f);
        this.F3 = i7;
        canvas.translate(f10, i7);
        canvas.drawColor(y91Var.getThemedColor(org.telegram.ui.ActionBar.n6.d6));
        super.onDraw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(this.x1, 0.0f);
        if (this.b5) {
            int L = this.u2 ? 0 : org.telegram.messenger.g0.L(this.J);
            if (org.telegram.messenger.gd.a0) {
                canvas.drawLine(0.0f - this.x1, getMeasuredHeight() - 1, getMeasuredWidth() - L, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.n6.k0);
            } else {
                canvas.drawLine(L - this.x1, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.n6.k0);
            }
        }
        if ((!this.h5 || (xg0Var = this.f2) == null || xg0Var.C != 0.0f) && (this.e5 != null || this.f5 != null)) {
            int L2 = org.telegram.messenger.g0.L(10.0f);
            int L3 = org.telegram.messenger.g0.L(10.0f);
            int L4 = org.telegram.messenger.g0.L(28.0f);
            org.telegram.ui.Components.o5 o5Var = this.e5;
            if (o5Var != null) {
                if (org.telegram.messenger.gd.a0) {
                    o5Var.setBounds((getWidth() - L2) - L4, L3, getWidth() - L2, L4 + L3);
                } else {
                    o5Var.setBounds(L2, L3, L2 + L4, L4 + L3);
                }
                this.e5.draw(canvas);
            } else {
                if (org.telegram.messenger.gd.a0) {
                    this.f5.setBounds((getWidth() - L2) - L4, L3, getWidth() - L2, L4 + L3);
                } else {
                    this.f5.setBounds(L2, L3, L2 + L4, L4 + L3);
                }
                this.f5.draw(canvas);
            }
        }
        canvas.restore();
    }

    public void setAnimatedEmojiDrawable(org.telegram.ui.Components.o5 o5Var) {
        org.telegram.ui.Components.o5 o5Var2 = this.e5;
        if (o5Var2 == o5Var) {
            return;
        }
        if (o5Var2 != null && this.g5) {
            o5Var2.n(this);
        }
        if (o5Var != null) {
            o5Var.setColorFilter(org.telegram.ui.ActionBar.n6.v3);
        }
        this.e5 = o5Var;
        if (o5Var == null || !this.g5) {
            return;
        }
        o5Var.a(this);
    }

    public void setForumIcon(Drawable drawable) {
        this.f5 = drawable;
    }

    public void setTopicIcon(TLRPC.TL_forumTopic tL_forumTopic) {
        int i7;
        this.d5 = tL_forumTopic;
        boolean z10 = false;
        this.i5 = tL_forumTopic != null && tL_forumTopic.closed;
        if (this.l0) {
            o0(tL_forumTopic != null && tL_forumTopic.hidden);
        }
        this.h5 = tL_forumTopic != null && tL_forumTopic.id == 1;
        y91 y91Var = this.m5;
        if (tL_forumTopic != null && this != y91Var.d1) {
            if (tL_forumTopic.hidden) {
                this.M1 = true;
                this.N1 = org.telegram.ui.ActionBar.n6.d9;
                this.O1 = org.telegram.ui.ActionBar.n6.c9;
                this.P1 = "Unhide";
                this.Q1 = 2131743647;
                this.R1 = org.telegram.ui.ActionBar.n6.y1;
            } else {
                this.M1 = true;
                this.N1 = org.telegram.ui.ActionBar.n6.c9;
                this.O1 = org.telegram.ui.ActionBar.n6.d9;
                this.P1 = "Hide";
                this.Q1 = 2131749133;
                this.R1 = org.telegram.ui.ActionBar.n6.x1;
            }
            invalidate();
        }
        if (this.l0) {
            return;
        }
        if (tL_forumTopic != null && tL_forumTopic.id == 1) {
            setAnimatedEmojiDrawable(null);
            setForumIcon(qg.c.d(getContext(), 1.0f, y91Var.getThemedColor(org.telegram.ui.ActionBar.n6.rd), false));
        } else if (tL_forumTopic == null || tL_forumTopic.icon_emoji_id == 0) {
            setAnimatedEmojiDrawable(null);
            setForumIcon(qg.c.f(tL_forumTopic));
        } else {
            setForumIcon(null);
            org.telegram.ui.Components.o5 o5Var = this.e5;
            if (o5Var == null || o5Var.h() != tL_forumTopic.icon_emoji_id) {
                int i10 = y91Var.v0 ? 13 : 10;
                i7 = ((org.telegram.ui.ActionBar.h2) y91Var).currentAccount;
                setAnimatedEmojiDrawable(new org.telegram.ui.Components.o5(i10, i7, tL_forumTopic.icon_emoji_id));
            }
        }
        if (tL_forumTopic != null && tL_forumTopic.hidden) {
            z10 = true;
        }
        o0(z10);
        x();
    }

    @Override // org.telegram.ui.Cells.u2, org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        super.updateColors();
        try {
            if (this.j5 != null) {
                n0();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.Cells.u2
    public final void x() {
        super.x();
        n0();
    }
}
