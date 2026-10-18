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

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class q extends HorizontalScrollView {
    public org.telegram.ui.web.m a;
    public x b;
    public final sa1 c;
    public final Paint d;
    public int e;
    public float f;
    public final /* synthetic */ d0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(d0 d0Var, Context context) {
        super(context);
        this.h = d0Var;
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
                if (z10) {
                    smoothScrollTo(dp - getWidth(), 0);
                } else {
                    scrollTo(dp - getWidth(), 0);
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
        x xVar;
        org.telegram.ui.web.m mVar = this.a;
        if (mVar != null) {
            float scrollX = getScrollX();
            float width = getWidth() + getScrollX();
            float height = getHeight();
            f0 f0Var = (f0) mVar.b;
            q qVar = (q) mVar.c;
            RectF rectF = f0Var.k0;
            int[] iArr = f0Var.i0;
            int[] iArr2 = f0Var.g0;
            Path path = f0Var.j0;
            RectF rectF2 = f0Var.f0;
            if (f0Var.X != null && f0Var.d != null) {
                float f10 = f0Var.Y;
                f7 = 2.0f;
                rectF2.set(scrollX + f10, f0Var.Z + 0.0f, width - f10, height - f0Var.a0);
                canvas.save();
                path.rewind();
                path.addRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, Path.Direction.CW);
                canvas.clipPath(path);
                qVar.getLocationOnScreen(iArr2);
                f0Var.d.getLocationOnScreen(iArr);
                float max = Math.max(0.01f, qVar.getScaleX());
                canvas.translate(scrollX, 0.0f);
                float f11 = 1.0f / max;
                canvas.scale(f11, f11);
                rectF.set((rectF2.left - scrollX) * max, (rectF2.top - 0.0f) * max, (rectF2.right - scrollX) * max, (rectF2.bottom - 0.0f) * max);
                t0 t0Var = f0Var.d;
                int i10 = iArr2[0];
                int i11 = iArr[0];
                int i12 = iArr2[1];
                int i13 = iArr[1];
                Paint paint = t0Var.z1;
                paint.setColor(t0Var.t0());
                canvas.drawRect(rectF, paint);
                canvas.restore();
                if (f0Var.l0 == null) {
                    f0Var.l0 = new Paint(1);
                }
                Paint paint2 = f0Var.l0;
                r0 r0Var = f0Var.d.n;
                paint2.setColor(r0Var != null ? r0Var.h : 872415231);
                canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, f0Var.l0);
                super.draw(canvas);
                xVar = this.b;
                if (xVar == null) {
                    float scrollX2 = getScrollX();
                    float width2 = getWidth() + getScrollX();
                    float height2 = getHeight();
                    f0 f0Var2 = xVar.a;
                    RectF rectF3 = f0Var2.n0;
                    float f12 = f0Var2.Y;
                    rectF3.set(scrollX2 + f12, 0.0f + f0Var2.Z, width2 - f12, height2 - f0Var2.a0);
                    f0Var2.m0.a(canvas, rectF3, rectF3.height() / f7, 0, 1.0f);
                    return;
                }
                return;
            }
        }
        f7 = 2.0f;
        super.draw(canvas);
        xVar = this.b;
        if (xVar == null) {
        }
    }

    public void setSections(ArrayList<o> arrayList) {
        sa1 sa1Var = this.c;
        sa1Var.removeAllViews();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            o oVar = arrayList.get(i10);
            Context context = getContext();
            int i11 = oVar.a;
            p pVar = new p(this.h, context, i11, i11 == 2 ? (TLRPC.Document) oVar.c.get(0) : null);
            pVar.setOnClickListener(new n1(this, i10, 29));
            pVar.setContentDescription(oVar.b);
            sa1Var.addView(pVar, new LinearLayout.LayoutParams(AndroidUtilities.dp(34.0f), AndroidUtilities.dp(30.0f)));
        }
        this.e = -1;
        this.f = Float.NaN;
    }
}
