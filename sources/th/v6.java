package th;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.d20;
import org.telegram.messenger.ic;
import org.telegram.messenger.jj;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ly;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class v6 extends q6 {
    public final sg.o0 I;
    public final u6 J;
    public final sg.f0 K;
    public final ImageReceiver L;
    public final org.telegram.ui.Components.t5 M;
    public final org.telegram.ui.Components.e6 N;
    public boolean O;

    public v6(Context context, s6 s6Var, TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction, ly lyVar) {
        super(context, s6Var, tL_mediaAreaSuggestedReaction);
        TLRPC.TL_availableReaction tL_availableReaction;
        ArrayList arrayList;
        u6 u6Var = new u6(this);
        this.J = u6Var;
        sg.f0 f0Var = new sg.f0(this);
        this.K = f0Var;
        this.L = new ImageReceiver(this);
        this.M = new org.telegram.ui.Components.t5(this);
        this.N = new org.telegram.ui.Components.e6(false, false, false);
        sg.o0 d = sg.o0.d(tL_mediaAreaSuggestedReaction.reaction);
        this.I = d;
        if (tL_mediaAreaSuggestedReaction.flipped) {
            u6Var.b(true, false);
        }
        u6Var.c(getScaleX());
        f0Var.e(d);
        lyVar.getClass();
        String str = d.f;
        str = str == null ? jj.U(org.telegram.ui.Components.f5.e(lyVar.b, d.g)) : str;
        if (str != null && (arrayList = (ArrayList) lyVar.e.get(str)) != null && !arrayList.isEmpty()) {
            int min = Math.min(1, arrayList.size());
            for (int i10 = 0; i10 < min; i10++) {
                lyVar.l((TLRPC.Document) arrayList.get(i10));
            }
        }
        if (this.I.f != null && (tL_availableReaction = (TLRPC.TL_availableReaction) ui.b0(d20.s0).r.get(this.I.f)) != null) {
            this.L.q0(ic.b(tL_availableReaction.center_icon), "40_40_lastreactframe", null, "webp", tL_availableReaction, 1);
        }
        org.telegram.ui.Components.e6 e6Var = this.N;
        e6Var.b = 17;
        e6Var.x(org.telegram.messenger.i0.o1("fonts/rcondensedbold.ttf"));
        this.N.w(org.telegram.messenger.i0.L(18.0f));
        this.N.M = org.telegram.messenger.i0.q.x;
        if (tL_mediaAreaSuggestedReaction.dark) {
            this.J.a();
            this.N.u(-1);
        }
    }

    @Override // th.q6
    public final void a(Canvas canvas) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        u6 u6Var = this.J;
        u6Var.setBounds(0, 0, measuredWidth, measuredHeight);
        u6Var.draw(canvas);
        float measuredWidth2 = ((int) (getMeasuredWidth() * 0.61f)) / 2.0f;
        float centerX = u6Var.getBounds().centerX() - measuredWidth2;
        float centerY = u6Var.getBounds().centerY() - measuredWidth2;
        float centerX2 = u6Var.getBounds().centerX() + measuredWidth2;
        float centerY2 = u6Var.getBounds().centerY() + measuredWidth2;
        float height = (u6Var.getBounds().height() * 0.427f) + u6Var.getBounds().top;
        float f7 = height - measuredWidth2;
        float f10 = height + measuredWidth2;
        float e = this.M.e(false, this.O ? 1.0f : 0.0f);
        Rect rect = org.telegram.messenger.i0.Q;
        rect.set((int) centerX, (int) org.telegram.messenger.i0.T1(centerY, f7, e), (int) centerX2, (int) org.telegram.messenger.i0.T1(centerY2, f10, e));
        int i10 = u6Var.a == 1 ? -1 : -16777216;
        sg.f0 f0Var = this.K;
        f0Var.d(i10);
        f0Var.c(rect);
        f0Var.a(canvas);
        float height2 = (u6Var.getBounds().height() * 0.839f) + u6Var.getBounds().top;
        org.telegram.ui.Components.e6 e6Var = this.N;
        e6Var.setBounds(u6Var.getBounds().left, (int) (height2 - org.telegram.messenger.i0.L(10.0f)), u6Var.getBounds().right, (int) (org.telegram.messenger.i0.L(10.0f) + height2));
        canvas.save();
        canvas.scale(e, e, u6Var.getBounds().centerX(), height2);
        e6Var.draw(canvas);
        canvas.restore();
    }

    public final void c(TL_stories.StoryViews storyViews, boolean z10) {
        org.telegram.ui.Components.t5 t5Var = this.M;
        if (storyViews != null) {
            for (int i10 = 0; i10 < storyViews.reactions.size(); i10++) {
                if (sg.q0.d(storyViews.reactions.get(i10).reaction, this.I)) {
                    boolean z11 = z10 && this.O;
                    this.O = storyViews.reactions.get(i10).count > 0;
                    this.N.t(org.telegram.messenger.i0.o0(storyViews.reactions.get(i10).count, 0), z11, true);
                    if (z10) {
                        return;
                    }
                    t5Var.e(true, this.O ? 1.0f : 0.0f);
                    return;
                }
            }
        }
        this.O = false;
        invalidate();
        if (z10) {
            return;
        }
        t5Var.e(true, this.O ? 1.0f : 0.0f);
    }

    public org.telegram.ui.Components.f5 getAnimatedEmojiDrawable() {
        return this.K.b;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.K.b(true);
        this.L.P();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.K.b(false);
        this.L.R();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.N.w(Math.min(org.telegram.messenger.i0.L(18.0f), getMeasuredHeight() * 0.156f));
    }

    @Override // android.view.View
    public void setScaleX(float f7) {
        if (getScaleX() != f7) {
            this.J.c(f7);
            super.setScaleX(f7);
        }
    }
}
