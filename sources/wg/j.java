package wg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.k71;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class j extends k71 {
    public final Path W;
    public final Paint a0;
    public boolean b0;
    public boolean c0;
    public final boolean d0;
    public final /* synthetic */ v0 e0;
    public final /* synthetic */ i6 f0;
    public final /* synthetic */ z g0;
    public final /* synthetic */ l h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, Context context, v0 v0Var, i6 i6Var, z zVar) {
        super(context, null);
        this.h0 = lVar;
        this.e0 = v0Var;
        this.f0 = i6Var;
        this.g0 = zVar;
        this.W = new Path();
        this.a0 = new Paint(1);
        this.d0 = org.telegram.messenger.g0.Q1();
    }

    @Override // org.telegram.ui.Components.k71
    public final boolean b(MotionEvent motionEvent) {
        return this.h0.m1.getCurrentPosition() == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        l lVar = this.h0;
        j jVar = lVar.m1;
        int w02 = n6.w0(n6.h5, this.f0);
        Paint paint = this.a0;
        paint.setColor(w02);
        if (!this.b0) {
            if (this.d0 || lVar.o1) {
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            super.dispatchDraw(canvas);
            return;
        }
        int i7 = -org.telegram.messenger.g0.L(16.0f);
        z zVar = this.g0;
        int L = org.telegram.messenger.g0.L(10.0f) + Math.max(i7, zVar.o2 - (zVar.p1.getVisibility() == 0 ? org.telegram.messenger.g0.L(16.0f) + org.telegram.messenger.g0.m : 0));
        v0 v0Var = this.e0;
        int max = Math.max(0, v0Var.p2 - (v0Var.i2.c == 1.0f ? org.telegram.messenger.g0.m : 0));
        int abs = Math.abs(L - max);
        if (jVar.getCurrentPosition() == 0) {
            float positionAnimated = jVar.getPositionAnimated() * abs;
            f10 = L < max ? L + positionAnimated : L - positionAnimated;
        } else {
            float positionAnimated2 = (1.0f - jVar.getPositionAnimated()) * abs;
            f10 = max < L ? max + positionAnimated2 : max - positionAnimated2;
        }
        int i10 = (int) f10;
        float L2 = org.telegram.messenger.g0.L(14.0f);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, i10, getWidth(), org.telegram.messenger.g0.L(8.0f) + getHeight());
        canvas.drawRoundRect(rectF, L2, L2, paint);
        canvas.save();
        Path path = this.W;
        path.rewind();
        path.addRoundRect(rectF, L2, L2, Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.k71
    public final float getAvailableTranslationX() {
        return (this.d0 || this.h0.o1) ? getMeasuredWidth() : super.getAvailableTranslationX();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        boolean z11 = this.c0;
        boolean z12 = this.h0.d;
        if (z11 != z12) {
            this.c0 = z12;
            if (z12) {
                this.e0.k1(true);
            }
        }
    }

    @Override // org.telegram.ui.Components.k71
    public final void r() {
        this.b0 = false;
        this.h0.m1.invalidate();
    }

    @Override // org.telegram.ui.Components.k71
    public final void t(boolean z10) {
        l lVar = this.h0;
        j jVar = lVar.m1;
        float positionAnimated = jVar.getPositionAnimated();
        if (positionAnimated <= 0.0f || positionAnimated >= 1.0f) {
            this.b0 = false;
        } else if (!this.b0) {
            this.b0 = true;
            if (lVar.d) {
                org.telegram.messenger.g0.v1(lVar.n1.b);
            }
        }
        jVar.invalidate();
    }
}
