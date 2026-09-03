package qh;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bd;
import org.telegram.ui.Components.bu;
import org.telegram.ui.Components.fu;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.xt;
import org.telegram.ui.ss0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class f extends fu {
    public org.telegram.ui.Components.fa S;
    public qg.b T;
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 U;
    public final /* synthetic */ org.telegram.ui.Components.ba V;
    public final /* synthetic */ k W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(k kVar, Context context, pv0 pv0Var, int i10, oh.b bVar, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.Components.ba baVar) {
        super(context, pv0Var, null, i10, true, bVar);
        this.W = kVar;
        this.U = g6Var;
        this.V = baVar;
    }

    @Override // org.telegram.ui.Components.fu
    public final boolean b() {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        k kVar = this.W;
        if ((kVar instanceof p) && ((p) kVar).L1) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.fu
    public final void f() {
        super.f();
        mz emojiView = getEmojiView();
        if (emojiView != null) {
            k kVar = this.W;
            if (kVar.getEditTextStyle() == 2 || kVar.getEditTextStyle() == 3) {
                emojiView.t0 = false;
                emojiView.u2 = false;
                emojiView.setShouldDrawBackground(false);
                if (kVar instanceof bd) {
                    emojiView.setPadding(0, 0, 0, AndroidUtilities.navigationBarHeight);
                    emojiView.c = 3;
                }
                emojiView.U();
            }
        }
        if (emojiView != null) {
            emojiView.F2 = true;
            emojiView.setClipToOutline(true);
            emojiView.setOutlineProvider(new hg.j1(17));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17, types: [android.view.View] */
    @Override // org.telegram.ui.Components.fu
    public final void g(Canvas canvas, bu buVar) {
        Bitmap bitmap;
        int i10;
        int i11;
        WindowInsets rootWindowInsets;
        k kVar = this.W;
        og.i iVar = kVar.d;
        RectF rectF = kVar.w0;
        rectF.set(0.0f, 0.0f, buVar.getWidth(), AndroidUtilities.dp(29.0f) + buVar.getHeight());
        int i12 = 0;
        if (kVar.e0 != null) {
            if (this.T == null) {
                if (Build.VERSION.SDK_INT < 31 || (rootWindowInsets = getRootWindowInsets()) == null) {
                    i10 = 0;
                    i11 = 0;
                } else {
                    RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(3);
                    RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(2);
                    i11 = roundedCorner == null ? 0 : roundedCorner.getRadius();
                    i10 = roundedCorner2 == null ? 0 : roundedCorner2.getRadius();
                }
                qg.b c3 = kVar.e0.c(buVar, null, false);
                c3.n(sg.b.i(this.U));
                this.T = c3;
                c3.r(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), i10, i11);
                qg.b bVar = this.T;
                bVar.k = true;
                bVar.t(AndroidUtilities.dp(32.0f));
                qg.b bVar2 = this.T;
                bVar2.h.g = 0.4f;
                bVar2.j();
            }
            Rect rect = AndroidUtilities.rectTmp2;
            rectF.round(rect);
            this.T.setBounds(rect);
            this.T.draw(canvas);
            return;
        }
        if (kVar.g()) {
            if (this.S == null) {
                this.S = new org.telegram.ui.Components.fa(this.V, buVar, 7, false);
            }
            kVar.h(this.S, canvas, kVar.w0, AndroidUtilities.dp(29.0f), false, 0.0f, -buVar.getY(), false);
            iVar.k = AndroidUtilities.dp(29.0f);
            iVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, AndroidUtilities.dp(29.0f) + ((int) rectF.bottom));
            iVar.draw(canvas);
            return;
        }
        Paint paint = kVar.e;
        FrameLayout frameLayout = kVar.G;
        if (kVar.l0 > 0.0f && kVar.r0 != null && kVar.p0 != null && (bitmap = kVar.o0) != null && !bitmap.isRecycled()) {
            kVar.q0.reset();
            kVar.q0.postScale(frameLayout.getWidth() / kVar.o0.getWidth(), frameLayout.getHeight() / kVar.o0.getHeight());
            float f10 = 0.0f;
            float f11 = 0.0f;
            bu buVar2 = buVar;
            while (i12 < 8 && buVar2 != null) {
                f10 += buVar2.getX();
                f11 += buVar2.getY();
                Object parent = buVar2.getParent();
                i12++;
                buVar2 = parent instanceof View ? (View) parent : 0;
            }
            kVar.q0.postTranslate(-f10, -f11);
            kVar.p0.setLocalMatrix(kVar.q0);
            kVar.r0.setAlpha((int) (kVar.l0 * 255.0f * 0.95f));
            canvas.drawRoundRect(rectF, 0.0f, 0.0f, kVar.r0);
        }
        paint.setAlpha((int) (kVar.r0 == null ? 128.0f : AndroidUtilities.lerp(128, 153, kVar.l0) * 0.95f));
        canvas.drawRoundRect(rectF, 0.0f, 0.0f, paint);
    }

    @Override // org.telegram.ui.Components.fu
    public final void p() {
        this.W.I.a();
    }

    @Override // org.telegram.ui.Components.fu
    public final void q(int i10, int i11) {
        this.W.s(i10, i11);
    }

    @Override // org.telegram.ui.Components.fu
    public final boolean t(int i10) {
        k kVar = this.W;
        f fVar = kVar.f;
        ObjectAnimator objectAnimator = kVar.d0;
        if (objectAnimator != null && objectAnimator.isRunning() && i10 == kVar.V) {
            return false;
        }
        kVar.invalidate();
        if (!kVar.T) {
            return true;
        }
        kVar.T = false;
        if (kVar.U == i10) {
            return true;
        }
        ObjectAnimator objectAnimator2 = kVar.d0;
        if (objectAnimator2 != null && objectAnimator2.isRunning() && i10 == kVar.V) {
            return true;
        }
        ObjectAnimator objectAnimator3 = kVar.d0;
        if (objectAnimator3 != null) {
            objectAnimator3.cancel();
        }
        fVar.getEditText().setScrollY(kVar.U);
        xt editText = fVar.getEditText();
        int i11 = kVar.U;
        kVar.V = i10;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(editText, "scrollY", i11, i10);
        kVar.d0 = ofInt;
        ofInt.setDuration(240L);
        kVar.d0.setInterpolator(pr.h);
        kVar.d0.addListener(new ss0(this, 28));
        kVar.d0.start();
        return false;
    }

    @Override // org.telegram.ui.Components.fu
    public final void u() {
        this.W.I.e = true;
    }

    @Override // org.telegram.ui.Components.fu
    public final void y() {
        this.W.I.a();
    }
}
