// default package

import android.app.Activity;
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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class sx8 extends HorizontalScrollView {
    public xr8 a;
    public ay8 b;
    public final qmb c;
    public final Paint d;
    public int e;
    public float f;
    public final /* synthetic */ gy8 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sx8(gy8 gy8Var, Activity activity) {
        super(activity);
        this.h = gy8Var;
        Paint paint = new Paint(1);
        this.d = paint;
        this.e = -1;
        this.f = Float.NaN;
        setHorizontalScrollBarEnabled(false);
        setOverScrollMode(2);
        setFillViewport(true);
        setWillNotDraw(false);
        qmb qmbVar = new qmb((byte) 12, activity, this);
        this.c = qmbVar;
        qmbVar.setOrientation(0);
        qmbVar.setGravity(16);
        qmbVar.setPadding(gm.L(3.0f), 0, gm.L(3.0f), 0);
        addView(qmbVar, new FrameLayout.LayoutParams(-2, -1));
        paint.setColor(1560281087);
    }

    public final void a(int i, boolean z) {
        if (i == this.e || i < 0) {
            return;
        }
        qmb qmbVar = this.c;
        if (i < qmbVar.getChildCount()) {
            this.e = i;
            if (!z) {
                this.f = Float.NaN;
            }
            View childAt = qmbVar.getChildAt(i);
            int left = childAt.getLeft() - gm.L(30.0f);
            int L = gm.L(30.0f) + childAt.getRight();
            if (left >= getScrollX()) {
                if (L > getWidth() + getScrollX()) {
                    if (z) {
                        smoothScrollTo(L - getWidth(), 0);
                    } else {
                        scrollTo(L - getWidth(), 0);
                    }
                }
            } else if (z) {
                smoothScrollTo(left, 0);
            } else {
                scrollTo(left, 0);
            }
            qmbVar.invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.HorizontalScrollView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        float f;
        ay8 ay8Var;
        xr8 xr8Var = this.a;
        if (xr8Var != null) {
            float scrollX = getScrollX();
            float width = getWidth() + getScrollX();
            float height = getHeight();
            iy8 iy8Var = (iy8) xr8Var.b;
            sx8 sx8Var = (sx8) xr8Var.c;
            RectF rectF = iy8Var.n0;
            int[] iArr = iy8Var.l0;
            int[] iArr2 = iy8Var.j0;
            Path path = iy8Var.m0;
            RectF rectF2 = iy8Var.i0;
            if (iy8Var.a0 != null && iy8Var.d != null) {
                float f2 = iy8Var.b0;
                f = 2.0f;
                rectF2.set(scrollX + f2, iy8Var.c0 + 0.0f, width - f2, height - iy8Var.d0);
                canvas.save();
                path.rewind();
                path.addRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, Path.Direction.CW);
                canvas.clipPath(path);
                sx8Var.getLocationOnScreen(iArr2);
                iy8Var.d.getLocationOnScreen(iArr);
                float max = Math.max(0.01f, sx8Var.getScaleX());
                canvas.translate(scrollX, 0.0f);
                float f3 = 1.0f / max;
                canvas.scale(f3, f3);
                rectF.set((rectF2.left - scrollX) * max, (rectF2.top - 0.0f) * max, (rectF2.right - scrollX) * max, (rectF2.bottom - 0.0f) * max);
                wy8 wy8Var = iy8Var.d;
                int i = iArr2[0];
                int i2 = iArr[0];
                int i3 = iArr2[1];
                int i4 = iArr[1];
                Paint paint = wy8Var.A1;
                paint.setColor(wy8Var.t0());
                canvas.drawRect(rectF, paint);
                canvas.restore();
                Paint paint2 = iy8Var.o0;
                if (paint2 == null) {
                    paint2 = new Paint(1);
                    iy8Var.o0 = paint2;
                }
                uy8 uy8Var = iy8Var.d.n;
                paint2.setColor(uy8Var != null ? uy8Var.h : 872415231);
                canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, iy8Var.o0);
                super.draw(canvas);
                ay8Var = this.b;
                if (ay8Var == null) {
                    float scrollX2 = getScrollX();
                    float width2 = getWidth() + getScrollX();
                    float height2 = getHeight();
                    iy8 iy8Var2 = ay8Var.a;
                    RectF rectF3 = iy8Var2.q0;
                    float f4 = iy8Var2.b0;
                    rectF3.set(scrollX2 + f4, 0.0f + iy8Var2.c0, width2 - f4, height2 - iy8Var2.d0);
                    iy8Var2.p0.a(rectF3.height() / f, 1.0f, 0, canvas, rectF3);
                    return;
                }
                return;
            }
        }
        f = 2.0f;
        super.draw(canvas);
        ay8Var = this.b;
        if (ay8Var == null) {
        }
    }

    public void setSections(ArrayList<qx8> arrayList) {
        qmb qmbVar = this.c;
        qmbVar.removeAllViews();
        for (int i = 0; i < arrayList.size(); i++) {
            qx8 qx8Var = arrayList.get(i);
            Context context = getContext();
            byte b = qx8Var.a;
            rx8 rx8Var = new rx8(this.h, context, b, b == 2 ? (TLRPC.Document) qx8Var.c.get(0) : null);
            rx8Var.setOnClickListener(new v0(this, i, (byte) 19));
            rx8Var.setContentDescription(qx8Var.b);
            qmbVar.addView(rx8Var, new LinearLayout.LayoutParams(gm.L(34.0f), gm.L(30.0f)));
        }
        this.e = -1;
        this.f = Float.NaN;
    }
}
