package zh;

import ai.n1;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.sa1;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class w extends HorizontalScrollView {
    public org.telegram.ui.web.c0 a;
    public e0 b;
    public final sa1 c;
    public final Paint d;
    public int e;
    public float f;
    public final /* synthetic */ k0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(k0 k0Var, Context context) {
        super(context);
        this.h = k0Var;
        Paint paint = new Paint(1);
        this.d = paint;
        this.e = -1;
        this.f = Float.NaN;
        setHorizontalScrollBarEnabled(false);
        setOverScrollMode(2);
        setFillViewport(true);
        setWillNotDraw(false);
        sa1 sa1Var = new sa1(this, context, 22);
        this.c = sa1Var;
        sa1Var.setOrientation(0);
        sa1Var.setGravity(16);
        sa1Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        addView(sa1Var, new FrameLayout.LayoutParams(-2, -1));
        paint.setColor(1560281087);
    }

    public final void a(int i10, boolean z10) {
        if (i10 == this.e || i10 < 0) {
            return;
        }
        sa1 sa1Var = this.c;
        if (i10 >= sa1Var.getChildCount()) {
            return;
        }
        this.e = i10;
        if (!z10) {
            this.f = Float.NaN;
        }
        View childAt = sa1Var.getChildAt(i10);
        int left = childAt.getLeft() - AndroidUtilities.dp(30.0f);
        int dp = AndroidUtilities.dp(30.0f) + childAt.getRight();
        if (left >= getScrollX()) {
            if (dp > getWidth() + getScrollX()) {
                int width = dp - getWidth();
                if (z10) {
                    smoothScrollTo(width, 0);
                } else {
                    scrollTo(width, 0);
                }
            }
        } else if (z10) {
            smoothScrollTo(left, 0);
        } else {
            scrollTo(left, 0);
        }
        sa1Var.invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.HorizontalScrollView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        float f7;
        e0 e0Var;
        org.telegram.ui.web.c0 c0Var = this.a;
        if (c0Var != null) {
            float scrollX = getScrollX();
            float width = getWidth() + getScrollX();
            float height = getHeight();
            m0 m0Var = (m0) c0Var.b;
            w wVar = (w) c0Var.c;
            RectF rectF = m0Var.f0;
            int[] iArr = m0Var.d0;
            int[] iArr2 = m0Var.b0;
            Path path = m0Var.e0;
            RectF rectF2 = m0Var.a0;
            if (m0Var.S != null && m0Var.d != null) {
                float f10 = m0Var.T;
                f7 = 2.0f;
                rectF2.set(scrollX + f10, m0Var.U + 0.0f, width - f10, height - m0Var.V);
                canvas.save();
                path.rewind();
                path.addRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, Path.Direction.CW);
                canvas.clipPath(path);
                wVar.getLocationOnScreen(iArr2);
                m0Var.d.getLocationOnScreen(iArr);
                float max = Math.max(0.01f, wVar.getScaleX());
                canvas.translate(scrollX, 0.0f);
                float f11 = 1.0f / max;
                canvas.scale(f11, f11);
                rectF.set((rectF2.left - scrollX) * max, (rectF2.top - 0.0f) * max, (rectF2.right - scrollX) * max, (rectF2.bottom - 0.0f) * max);
                b1 b1Var = m0Var.d;
                int i10 = iArr2[0];
                int i11 = iArr[0];
                int i12 = iArr2[1];
                int i13 = iArr[1];
                Paint paint = b1Var.B1;
                paint.setColor(b1Var.p0());
                canvas.drawRect(rectF, paint);
                canvas.restore();
                if (m0Var.g0 == null) {
                    m0Var.g0 = new Paint(1);
                }
                Paint paint2 = m0Var.g0;
                z0 z0Var = m0Var.d.n;
                paint2.setColor(z0Var != null ? z0Var.i : 872415231);
                canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, m0Var.g0);
                super.draw(canvas);
                e0Var = this.b;
                if (e0Var == null) {
                    float scrollX2 = getScrollX();
                    float width2 = getWidth() + getScrollX();
                    float height2 = getHeight();
                    m0 m0Var2 = e0Var.a;
                    RectF rectF3 = m0Var2.i0;
                    float f12 = m0Var2.T;
                    rectF3.set(scrollX2 + f12, 0.0f + m0Var2.U, width2 - f12, height2 - m0Var2.V);
                    m0Var2.h0.a(canvas, rectF3, rectF3.height() / f7, 0, 1.0f);
                    return;
                }
                return;
            }
        }
        f7 = 2.0f;
        super.draw(canvas);
        e0Var = this.b;
        if (e0Var == null) {
        }
    }

    public void setSections(ArrayList<u> arrayList) {
        sa1 sa1Var = this.c;
        sa1Var.removeAllViews();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            u uVar = arrayList.get(i10);
            Context context = getContext();
            int i11 = uVar.a;
            v vVar = new v(this.h, context, i11, i11 == 2 ? (TLRPC.Document) uVar.c.get(0) : null);
            vVar.setOnClickListener(new n1(this, i10, 29));
            vVar.setContentDescription(uVar.b);
            sa1Var.addView(vVar, new LinearLayout.LayoutParams(AndroidUtilities.dp(34.0f), AndroidUtilities.dp(30.0f)));
        }
        this.e = -1;
        this.f = Float.NaN;
    }
}
