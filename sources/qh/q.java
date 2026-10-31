package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.u71;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class q extends HorizontalScrollView {
    public org.telegram.ui.web.k0 a;
    public z b;
    public final u71 c;
    public final Paint d;
    public int e;
    public float f;
    public final /* synthetic */ g0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(g0 g0Var, Context context) {
        super(context);
        this.h = g0Var;
        Paint paint = new Paint(1);
        this.d = paint;
        this.e = -1;
        this.f = Float.NaN;
        setHorizontalScrollBarEnabled(false);
        setOverScrollMode(2);
        setFillViewport(true);
        setWillNotDraw(false);
        u71 u71Var = new u71(this, context, 21);
        this.c = u71Var;
        u71Var.setOrientation(0);
        u71Var.setGravity(16);
        u71Var.setPadding(org.telegram.messenger.i0.L(3.0f), 0, org.telegram.messenger.i0.L(3.0f), 0);
        addView(u71Var, new FrameLayout.LayoutParams(-2, -1));
        paint.setColor(1560281087);
    }

    public final void a(int i10, boolean z10) {
        if (i10 == this.e || i10 < 0) {
            return;
        }
        u71 u71Var = this.c;
        if (i10 >= u71Var.getChildCount()) {
            return;
        }
        this.e = i10;
        if (!z10) {
            this.f = Float.NaN;
        }
        View childAt = u71Var.getChildAt(i10);
        int left = childAt.getLeft() - org.telegram.messenger.i0.L(30.0f);
        int L = org.telegram.messenger.i0.L(30.0f) + childAt.getRight();
        if (left >= getScrollX()) {
            if (L > getWidth() + getScrollX()) {
                if (z10) {
                    smoothScrollTo(L - getWidth(), 0);
                } else {
                    scrollTo(L - getWidth(), 0);
                }
            }
        } else if (z10) {
            smoothScrollTo(left, 0);
        } else {
            scrollTo(left, 0);
        }
        u71Var.invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.HorizontalScrollView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        float f7;
        z zVar;
        org.telegram.ui.web.k0 k0Var = this.a;
        if (k0Var != null) {
            float scrollX = getScrollX();
            float width = getWidth() + getScrollX();
            float height = getHeight();
            i0 i0Var = (i0) k0Var.b;
            q qVar = (q) k0Var.c;
            RectF rectF = i0Var.m0;
            int[] iArr = i0Var.k0;
            int[] iArr2 = i0Var.i0;
            Path path = i0Var.l0;
            RectF rectF2 = i0Var.h0;
            if (i0Var.Z != null && i0Var.d != null) {
                float f10 = i0Var.a0;
                f7 = 2.0f;
                rectF2.set(scrollX + f10, i0Var.b0 + 0.0f, width - f10, height - i0Var.c0);
                canvas.save();
                path.rewind();
                path.addRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, Path.Direction.CW);
                canvas.clipPath(path);
                qVar.getLocationOnScreen(iArr2);
                i0Var.d.getLocationOnScreen(iArr);
                float max = Math.max(0.01f, qVar.getScaleX());
                canvas.translate(scrollX, 0.0f);
                float f11 = 1.0f / max;
                canvas.scale(f11, f11);
                rectF.set((rectF2.left - scrollX) * max, (rectF2.top - 0.0f) * max, (rectF2.right - scrollX) * max, (rectF2.bottom - 0.0f) * max);
                x0 x0Var = i0Var.d;
                int i10 = iArr2[0];
                int i11 = iArr[0];
                int i12 = iArr2[1];
                int i13 = iArr[1];
                Paint paint = x0Var.z1;
                paint.setColor(x0Var.t0());
                canvas.drawRect(rectF, paint);
                canvas.restore();
                if (i0Var.n0 == null) {
                    i0Var.n0 = new Paint(1);
                }
                Paint paint2 = i0Var.n0;
                v0 v0Var = i0Var.d.n;
                paint2.setColor(v0Var != null ? v0Var.h : 872415231);
                canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, i0Var.n0);
                super.draw(canvas);
                zVar = this.b;
                if (zVar == null) {
                    float scrollX2 = getScrollX();
                    float width2 = getWidth() + getScrollX();
                    float height2 = getHeight();
                    i0 i0Var2 = zVar.a;
                    RectF rectF3 = i0Var2.p0;
                    float f12 = i0Var2.a0;
                    rectF3.set(scrollX2 + f12, 0.0f + i0Var2.b0, width2 - f12, height2 - i0Var2.c0);
                    i0Var2.o0.a(canvas, rectF3, rectF3.height() / f7, 0, 1.0f);
                    return;
                }
                return;
            }
        }
        f7 = 2.0f;
        super.draw(canvas);
        zVar = this.b;
        if (zVar == null) {
        }
    }

    public void setSections(ArrayList<o> arrayList) {
        u71 u71Var = this.c;
        u71Var.removeAllViews();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            o oVar = arrayList.get(i10);
            Context context = getContext();
            int i11 = oVar.a;
            p pVar = new p(this.h, context, i11, i11 == 2 ? (TLRPC.Document) oVar.c.get(0) : null);
            pVar.setOnClickListener(new bh.f(this, i10, 28));
            pVar.setContentDescription(oVar.b);
            u71Var.addView(pVar, new LinearLayout.LayoutParams(org.telegram.messenger.i0.L(34.0f), org.telegram.messenger.i0.L(30.0f)));
        }
        this.e = -1;
        this.f = Float.NaN;
    }
}
