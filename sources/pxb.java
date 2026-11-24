// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class pxb extends hg3 {
    public boolean b5;
    public int c5;
    public TLRPC.TL_forumTopic d5;
    public vm e5;
    public Drawable f5;
    public boolean g5;
    public boolean h5;
    public boolean i5;
    public Boolean j5;
    public float k5;
    public ValueAnimator l5;
    public final /* synthetic */ sxb m5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pxb(sxb sxbVar, Context context, boolean z) {
        super(context, z);
        this.m5 = sxbVar;
        this.c5 = -1;
        this.y = false;
        this.J = sxbVar.isInPreviewMode() ? (byte) 11 : (byte) 50;
        this.V = 24.0f;
        this.K = (byte) 64;
        this.L = (byte) 76;
        this.o1 = true;
    }

    @Override // hg3
    public final boolean J() {
        return this.i5;
    }

    public final void n0() {
        Drawable drawable = this.f5;
        boolean z = drawable instanceof mo4;
        sxb sxbVar = this.m5;
        if (z) {
            ((mo4) drawable).a(on2.f(this.k5, sxbVar.getThemedColor(cmb.Q9), sxbVar.getThemedColor(cmb.K7)));
        }
        Drawable[] drawableArr = this.i0;
        if (drawableArr != null) {
            Drawable drawable2 = drawableArr[0];
            if (drawable2 instanceof mo4) {
                ((mo4) drawable2).a(on2.f(this.k5, sxbVar.getThemedColor(cmb.Q9), sxbVar.getThemedColor(cmb.K7)));
            }
        }
        invalidate();
    }

    public final void o0(boolean z) {
        byte b = 0;
        boolean z2 = this.j5 != null;
        ValueAnimator valueAnimator = this.l5;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.l5 = null;
        }
        this.j5 = Boolean.valueOf(z);
        if (!z2) {
            this.k5 = z ? 1.0f : 0.0f;
            n0();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.k5, z ? 1.0f : 0.0f);
        this.l5 = ofFloat;
        ofFloat.addUpdateListener(new oxb(this, b));
        this.l5.setInterpolator(d53.g);
        this.l5.start();
    }

    @Override // hg3, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.g5 = true;
        vm vmVar = this.e5;
        if (vmVar != null) {
            vmVar.b(this);
        }
    }

    @Override // hg3, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.g5 = false;
        vm vmVar = this.e5;
        if (vmVar != null) {
            vmVar.o(this);
        }
    }

    @Override // hg3, android.view.View
    public final void onDraw(Canvas canvas) {
        ww8 ww8Var;
        ya yaVar;
        sxb sxbVar = this.m5;
        if (sxbVar.getMessagesController().y2(-sxbVar.a)) {
            super.onDraw(canvas);
            return;
        }
        this.G3 = (!this.l0 || (yaVar = this.r2) == null) ? 0.0f : yaVar.getProgress() * gm.L(30.0f);
        canvas.save();
        float f = this.G3;
        int i = -gm.L(4.0f);
        this.F3 = i;
        canvas.translate(f, i);
        canvas.drawColor(sxbVar.getThemedColor(cmb.c6));
        super.onDraw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(this.x1, 0.0f);
        if (this.b5) {
            int L = this.u2 ? 0 : gm.L(this.J);
            boolean z = jb6.a0;
            float f2 = this.x1;
            if (z) {
                canvas.drawLine(0.0f - f2, getMeasuredHeight() - 1, getMeasuredWidth() - L, getMeasuredHeight() - 1, cmb.j0);
            } else {
                canvas.drawLine(L - f2, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, cmb.j0);
            }
        }
        if ((!this.h5 || (ww8Var = this.f2) == null || ww8Var.C != 0.0f) && (this.e5 != null || this.f5 != null)) {
            int L2 = gm.L(10.0f);
            int L3 = gm.L(10.0f);
            int L4 = gm.L(28.0f);
            vm vmVar = this.e5;
            boolean z2 = jb6.a0;
            if (vmVar != null) {
                if (z2) {
                    vmVar.setBounds((getWidth() - L2) - L4, L3, getWidth() - L2, L4 + L3);
                } else {
                    vmVar.setBounds(L2, L3, L2 + L4, L4 + L3);
                }
                this.e5.draw(canvas);
            } else {
                Drawable drawable = this.f5;
                if (z2) {
                    drawable.setBounds((getWidth() - L2) - L4, L3, getWidth() - L2, L4 + L3);
                } else {
                    drawable.setBounds(L2, L3, L2 + L4, L4 + L3);
                }
                this.f5.draw(canvas);
            }
        }
        canvas.restore();
    }

    public void setAnimatedEmojiDrawable(vm vmVar) {
        vm vmVar2 = this.e5;
        if (vmVar2 != vmVar) {
            if (vmVar2 != null && this.g5) {
                vmVar2.o(this);
            }
            if (vmVar != null) {
                vmVar.setColorFilter(cmb.u3);
            }
            this.e5 = vmVar;
            if (vmVar == null || !this.g5) {
                return;
            }
            vmVar.b(this);
        }
    }

    public void setForumIcon(Drawable drawable) {
        this.f5 = drawable;
    }

    public void setTopicIcon(TLRPC.TL_forumTopic tL_forumTopic) {
        int i;
        this.d5 = tL_forumTopic;
        boolean z = false;
        this.i5 = tL_forumTopic != null && tL_forumTopic.closed;
        if (this.l0) {
            o0(tL_forumTopic != null && tL_forumTopic.hidden);
        }
        this.h5 = tL_forumTopic != null && tL_forumTopic.id == 1;
        sxb sxbVar = this.m5;
        if (tL_forumTopic != null && this != sxbVar.d1) {
            if (tL_forumTopic.hidden) {
                this.M1 = true;
                this.N1 = cmb.c9;
                this.O1 = cmb.b9;
                this.P1 = "Unhide";
                this.Q1 = 2131743571;
                this.R1 = cmb.x1;
            } else {
                this.M1 = true;
                this.N1 = cmb.b9;
                this.O1 = cmb.c9;
                this.P1 = "Hide";
                this.Q1 = 2131749082;
                this.R1 = cmb.w1;
            }
            invalidate();
        }
        if (this.l0) {
            return;
        }
        if (tL_forumTopic != null) {
            if (tL_forumTopic.id == 1) {
                setAnimatedEmojiDrawable(null);
                setForumIcon(no4.d(getContext(), 1.0f, sxbVar.getThemedColor(cmb.qd), false));
            } else if (tL_forumTopic.icon_emoji_id != 0) {
                setForumIcon(null);
                vm vmVar = this.e5;
                if (vmVar == null || vmVar.h() != tL_forumTopic.icon_emoji_id) {
                    int i2 = sxbVar.v0 ? 13 : 10;
                    i = ((d) sxbVar).currentAccount;
                    setAnimatedEmojiDrawable(new vm(i2, i, tL_forumTopic.icon_emoji_id));
                }
            }
            if (tL_forumTopic != null && tL_forumTopic.hidden) {
                z = true;
            }
            o0(z);
            x();
        }
        setAnimatedEmojiDrawable(null);
        setForumIcon(no4.f(tL_forumTopic));
        if (tL_forumTopic != null) {
            z = true;
        }
        o0(z);
        x();
    }

    @Override // hg3, vlb
    public final void updateColors() {
        super.updateColors();
        try {
            if (this.j5 != null) {
                n0();
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // hg3
    public final void x() {
        super.x();
        n0();
    }
}
