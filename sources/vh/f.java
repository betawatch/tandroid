package vh;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.nc;
import org.telegram.ui.Components.s9;
import org.telegram.ui.Components.st;
import org.telegram.ui.Components.uu0;
import org.telegram.ui.Components.vy;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.wt;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class f extends wt {
    public w9 V;
    public vg.f W;
    public final /* synthetic */ org.telegram.ui.ActionBar.p6 a0;
    public final /* synthetic */ s9 b0;
    public final /* synthetic */ k c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(k kVar, Context context, uu0 uu0Var, int i10, th.b bVar, org.telegram.ui.ActionBar.p6 p6Var, s9 s9Var) {
        super(context, uu0Var, null, i10, true, bVar);
        this.c0 = kVar;
        this.a0 = p6Var;
        this.b0 = s9Var;
    }

    @Override // org.telegram.ui.Components.wt
    public final boolean b() {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        k kVar = this.c0;
        if ((kVar instanceof p) && ((p) kVar).N1) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.wt
    public final void f() {
        super.f();
        vy emojiView = getEmojiView();
        if (emojiView != null) {
            k kVar = this.c0;
            if (kVar.getEditTextStyle() == 2 || kVar.getEditTextStyle() == 3) {
                emojiView.w0 = false;
                emojiView.x2 = false;
                emojiView.setShouldDrawBackground(false);
                if (kVar instanceof nc) {
                    emojiView.setPadding(0, 0, 0, org.telegram.messenger.i0.n);
                    emojiView.c = 3;
                }
                emojiView.updateColors();
            }
        }
        if (emojiView != null) {
            emojiView.L2 = true;
            emojiView.setClipToOutline(true);
            emojiView.setOutlineProvider(new bi.d2(25));
        }
    }

    @Override // org.telegram.ui.Components.wt
    public final void g(Canvas canvas, st stVar) {
        Bitmap bitmap;
        int i10;
        int i11;
        WindowInsets rootWindowInsets;
        View view = stVar;
        k kVar = this.c0;
        tg.i iVar = kVar.d;
        RectF rectF = kVar.y0;
        rectF.set(0.0f, 0.0f, view.getWidth(), org.telegram.messenger.i0.L(29.0f) + view.getHeight());
        if (kVar.g0 != null) {
            if (this.W == null) {
                if (Build.VERSION.SDK_INT < 31 || (rootWindowInsets = getRootWindowInsets()) == null) {
                    i10 = 0;
                    i11 = 0;
                } else {
                    RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(3);
                    RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(2);
                    i11 = roundedCorner == null ? 0 : roundedCorner.getRadius();
                    i10 = roundedCorner2 == null ? 0 : roundedCorner2.getRadius();
                }
                vg.f c10 = kVar.g0.c(view, null, false);
                c10.o(w7.b9.i(this.a0));
                this.W = c10;
                c10.s(org.telegram.messenger.i0.L(29.0f), org.telegram.messenger.i0.L(29.0f), i10, i11, true);
                vg.f fVar = this.W;
                fVar.O = true;
                fVar.t(org.telegram.messenger.i0.L(32.0f));
                vg.f fVar2 = this.W;
                fVar2.M.g = 0.4f;
                fVar2.m();
            }
            Rect rect = org.telegram.messenger.i0.Q;
            rectF.round(rect);
            this.W.setBounds(rect);
            this.W.draw(canvas);
            return;
        }
        if (kVar.g()) {
            if (this.V == null) {
                this.V = new w9(this.b0, view, 7, false);
            }
            kVar.h(this.V, canvas, kVar.y0, org.telegram.messenger.i0.L(29.0f), false, 0.0f, -view.getY(), false);
            iVar.m = org.telegram.messenger.i0.L(29.0f);
            iVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, org.telegram.messenger.i0.L(29.0f) + ((int) rectF.bottom));
            iVar.draw(canvas);
            return;
        }
        Paint paint = kVar.e;
        FrameLayout frameLayout = kVar.J;
        if (kVar.n0 > 0.0f && kVar.t0 != null && kVar.r0 != null && (bitmap = kVar.q0) != null && !bitmap.isRecycled()) {
            kVar.s0.reset();
            kVar.s0.postScale(frameLayout.getWidth() / kVar.q0.getWidth(), frameLayout.getHeight() / kVar.q0.getHeight());
            float f7 = 0.0f;
            float f10 = 0.0f;
            for (int i12 = 0; i12 < 8 && view != null; i12++) {
                f7 += view.getX();
                f10 += view.getY();
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            kVar.s0.postTranslate(-f7, -f10);
            kVar.r0.setLocalMatrix(kVar.s0);
            kVar.t0.setAlpha((int) (kVar.n0 * 255.0f * 0.95f));
            canvas.drawRoundRect(rectF, 0.0f, 0.0f, kVar.t0);
        }
        paint.setAlpha((int) (kVar.t0 == null ? 128.0f : org.telegram.messenger.i0.W1(kVar.n0, 128, zs.j2) * 0.95f));
        canvas.drawRoundRect(rectF, 0.0f, 0.0f, paint);
    }

    @Override // org.telegram.ui.Components.wt
    public final void p() {
        this.c0.L.a();
    }

    @Override // org.telegram.ui.Components.wt
    public final void q(int i10, int i11) {
        this.c0.s(i10, i11);
    }

    @Override // org.telegram.ui.Components.wt
    public final boolean t(int i10) {
        k kVar = this.c0;
        f fVar = kVar.f;
        ObjectAnimator objectAnimator = kVar.f0;
        if (objectAnimator != null && objectAnimator.isRunning() && i10 == kVar.b0) {
            return false;
        }
        kVar.invalidate();
        if (!kVar.W) {
            return true;
        }
        kVar.W = false;
        if (kVar.a0 == i10) {
            return true;
        }
        ObjectAnimator objectAnimator2 = kVar.f0;
        if (objectAnimator2 != null && objectAnimator2.isRunning() && i10 == kVar.b0) {
            return true;
        }
        ObjectAnimator objectAnimator3 = kVar.f0;
        if (objectAnimator3 != null) {
            objectAnimator3.cancel();
        }
        fVar.getEditText().setScrollY(kVar.a0);
        mt editText = fVar.getEditText();
        int i11 = kVar.a0;
        kVar.b0 = i10;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(editText, "scrollY", i11, i10);
        kVar.f0 = ofInt;
        ofInt.setDuration(240L);
        kVar.f0.setInterpolator(gr.h);
        kVar.f0.addListener(new sg.r(this, 13));
        kVar.f0.start();
        return false;
    }

    @Override // org.telegram.ui.Components.wt
    public final void u() {
        this.c0.L.e = true;
    }

    @Override // org.telegram.ui.Components.wt
    public final void y() {
        this.c0.L.a();
    }
}
