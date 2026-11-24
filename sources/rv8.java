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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class rv8 extends HorizontalScrollView {
    public kq8 a;
    public zv8 b;
    public final pkb c;
    public final Paint d;
    public int e;
    public float f;
    public final /* synthetic */ ew8 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rv8(ew8 ew8Var, Activity activity) {
        super(activity);
        this.h = ew8Var;
        Paint paint = new Paint(1);
        this.d = paint;
        this.e = -1;
        this.f = Float.NaN;
        setHorizontalScrollBarEnabled(false);
        setOverScrollMode(2);
        setFillViewport(true);
        setWillNotDraw(false);
        pkb pkbVar = new pkb((byte) 12, activity, this);
        this.c = pkbVar;
        pkbVar.setOrientation(0);
        pkbVar.setGravity(16);
        pkbVar.setPadding(gl.L(3.0f), 0, gl.L(3.0f), 0);
        addView(pkbVar, new FrameLayout.LayoutParams(-2, -1));
        paint.setColor(1560281087);
    }

    public final void a(int i, boolean z) {
        if (i == this.e || i < 0) {
            return;
        }
        pkb pkbVar = this.c;
        if (i < pkbVar.getChildCount()) {
            this.e = i;
            if (!z) {
                this.f = Float.NaN;
            }
            View childAt = pkbVar.getChildAt(i);
            int left = childAt.getLeft() - gl.L(30.0f);
            int L = gl.L(30.0f) + childAt.getRight();
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
            pkbVar.invalidate();
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
        zv8 zv8Var;
        kq8 kq8Var = this.a;
        if (kq8Var != null) {
            float scrollX = getScrollX();
            float width = getWidth() + getScrollX();
            float height = getHeight();
            gw8 gw8Var = (gw8) kq8Var.b;
            rv8 rv8Var = (rv8) kq8Var.c;
            RectF rectF = gw8Var.n0;
            int[] iArr = gw8Var.l0;
            int[] iArr2 = gw8Var.j0;
            Path path = gw8Var.m0;
            RectF rectF2 = gw8Var.i0;
            if (gw8Var.a0 != null && gw8Var.d != null) {
                float f2 = gw8Var.b0;
                f = 2.0f;
                rectF2.set(scrollX + f2, gw8Var.c0 + 0.0f, width - f2, height - gw8Var.d0);
                canvas.save();
                path.rewind();
                path.addRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, Path.Direction.CW);
                canvas.clipPath(path);
                rv8Var.getLocationOnScreen(iArr2);
                gw8Var.d.getLocationOnScreen(iArr);
                float max = Math.max(0.01f, rv8Var.getScaleX());
                canvas.translate(scrollX, 0.0f);
                float f3 = 1.0f / max;
                canvas.scale(f3, f3);
                rectF.set((rectF2.left - scrollX) * max, (rectF2.top - 0.0f) * max, (rectF2.right - scrollX) * max, (rectF2.bottom - 0.0f) * max);
                vw8 vw8Var = gw8Var.d;
                int i = iArr2[0];
                int i2 = iArr[0];
                int i3 = iArr2[1];
                int i4 = iArr[1];
                Paint paint = vw8Var.A1;
                paint.setColor(vw8Var.t0());
                canvas.drawRect(rectF, paint);
                canvas.restore();
                Paint paint2 = gw8Var.o0;
                if (paint2 == null) {
                    paint2 = new Paint(1);
                    gw8Var.o0 = paint2;
                }
                tw8 tw8Var = gw8Var.d.n;
                paint2.setColor(tw8Var != null ? tw8Var.h : 872415231);
                canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, gw8Var.o0);
                super.draw(canvas);
                zv8Var = this.b;
                if (zv8Var == null) {
                    float scrollX2 = getScrollX();
                    float width2 = getWidth() + getScrollX();
                    float height2 = getHeight();
                    gw8 gw8Var2 = zv8Var.a;
                    RectF rectF3 = gw8Var2.q0;
                    float f4 = gw8Var2.b0;
                    rectF3.set(scrollX2 + f4, 0.0f + gw8Var2.c0, width2 - f4, height2 - gw8Var2.d0);
                    gw8Var2.p0.a(rectF3.height() / f, 1.0f, 0, canvas, rectF3);
                    return;
                }
                return;
            }
        }
        f = 2.0f;
        super.draw(canvas);
        zv8Var = this.b;
        if (zv8Var == null) {
        }
    }

    public void setSections(ArrayList<pv8> arrayList) {
        pkb pkbVar = this.c;
        pkbVar.removeAllViews();
        for (int i = 0; i < arrayList.size(); i++) {
            pv8 pv8Var = arrayList.get(i);
            Context context = getContext();
            byte b = pv8Var.a;
            qv8 qv8Var = new qv8(this.h, context, b, b == 2 ? (TLRPC.Document) pv8Var.c.get(0) : null);
            qv8Var.setOnClickListener(new v0(this, i, (byte) 19));
            qv8Var.setContentDescription(pv8Var.b);
            pkbVar.addView(qv8Var, new LinearLayout.LayoutParams(gl.L(34.0f), gl.L(30.0f)));
        }
        this.e = -1;
        this.f = Float.NaN;
    }
}
