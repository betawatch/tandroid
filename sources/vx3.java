// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import java.util.Map;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class vx3 extends LinearLayout {
    public final vf6 a;
    public final Paint b;
    public final RectF c;
    public final RectF d;
    public final RectF e;
    public final Path f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ cy3 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vx3(cy3 cy3Var, Context context, boolean z, boolean z2) {
        super(context);
        this.r = cy3Var;
        this.h = z;
        this.n = z2;
        this.a = new vf6();
        this.b = new Paint(1);
        this.c = new RectF();
        this.d = new RectF();
        this.e = new RectF();
        this.f = new Path();
    }

    public final void a(RectF rectF, int i) {
        View childAt = getChildAt(moe.b(i, 0, getChildCount() - 1));
        if (childAt == null) {
            return;
        }
        rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
        rectF.set(rectF.centerX() - (childAt.getScaleX() * (rectF.width() / 2.0f)), rectF.centerY() - (childAt.getScaleY() * (rectF.height() / 2.0f)), (childAt.getScaleX() * (rectF.width() / 2.0f)) + rectF.centerX(), (childAt.getScaleY() * (rectF.height() / 2.0f)) + rectF.centerY());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f;
        cy3 cy3Var = this.r;
        boolean z = cy3Var.h;
        by3 by3Var = cy3Var.G;
        for (Map.Entry entry : cy3Var.H.entrySet()) {
            View view = (View) entry.getKey();
            if (view != null) {
                Rect rect = (Rect) entry.getValue();
                canvas.save();
                canvas.translate(rect.left, rect.top);
                canvas.scale(view.getScaleX(), view.getScaleY(), rect.width() / 2.0f, rect.height() / 2.0f);
                view.draw(canvas);
                canvas.restore();
            }
        }
        lm lmVar = cy3Var.r;
        if (lmVar == null) {
            lmVar = new lm(350L, this, s33.h);
            cy3Var.r = lmVar;
        }
        float e = lmVar.e(false, cy3Var.n ? 1.0f : 0.0f);
        int floor = (int) Math.floor(cy3Var.K);
        int ceil = (int) Math.ceil(cy3Var.K);
        RectF rectF = this.c;
        a(rectF, floor);
        RectF rectF2 = this.d;
        a(rectF2, ceil);
        float f2 = cy3Var.K - floor;
        RectF rectF3 = this.e;
        gl.X1(rectF, rectF2, f2, rectF3);
        float l = by3Var != null ? 1.0f - Utilities.l(Math.abs(cy3Var.K - ((cy3Var.E != null ? 1 : 0) + 1))) : 0.0f;
        float f3 = cy3Var.L;
        float f4 = (1.0f - f3) * 4.0f * f3;
        float z2 = yjb.z(f4, 0.3f, 1.0f, rectF3.width() / 2.0f);
        float B = yjb.B(f4, 0.05f, 1.0f, rectF3.height() / 2.0f);
        rectF3.set(rectF3.centerX() - z2, rectF3.centerY() - B, rectF3.centerX() + z2, rectF3.centerY() + B);
        float L = gl.L(gl.R1(8.0f, 16.0f, l));
        int k = cy3Var.k();
        Paint paint = this.b;
        paint.setColor(k);
        if (z) {
            paint.setAlpha((int) yjb.B(l, 0.5f, 1.0f, paint.getAlpha() * e));
        } else {
            paint.setAlpha((int) (paint.getAlpha() * e));
        }
        Path path = this.f;
        path.rewind();
        if (this.n) {
            float height = rectF3.height() / 2.0f;
            L = rectF3.height() / 2.0f;
            f = height;
        } else {
            f = L;
        }
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF3, f, L, direction);
        canvas.drawPath(path, paint);
        if (z) {
            path.rewind();
            a(rectF3, 1);
            path.addRoundRect(rectF3, gl.N(16.0f), gl.N(16.0f), direction);
            paint.setColor(cy3Var.k());
            paint.setAlpha((int) (paint.getAlpha() * 0.5f));
            canvas.drawPath(path, paint);
        }
        if (by3Var != null) {
            path.addCircle(gl.L(15.0f) + by3Var.getLeft(), (by3Var.getBottom() + by3Var.getTop()) / 2.0f, gl.L(15.0f), direction);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view != this.r.G) {
            return super.drawChild(canvas, view, j);
        }
        canvas.save();
        canvas.clipPath(this.f);
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return drawChild;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        vf6 vf6Var;
        TLRPC.StickerSet stickerSet;
        cy3 cy3Var = this.r;
        zx3 zx3Var = cy3Var.F;
        int i5 = (i4 - i2) / 2;
        if (!this.h) {
            int childCount = (getChildCount() - (!cy3Var.W ? 1 : 0)) - (!cy3Var.b0 ? 1 : 0);
            int paddingLeft = (int) (((((i3 - i) - getPaddingLeft()) - getPaddingRight()) - (gl.L(30.0f) * childCount)) / Math.max(1, childCount - 1));
            int paddingLeft2 = getPaddingLeft();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt((!cy3Var.W ? 1 : 0) + (!cy3Var.b0 ? 1 : 0) + i6);
                if (childAt != null) {
                    childAt.layout(paddingLeft2, i5 - (childAt.getMeasuredHeight() / 2), childAt.getMeasuredWidth() + paddingLeft2, (childAt.getMeasuredHeight() / 2) + i5);
                    paddingLeft2 = childAt.getMeasuredWidth() + paddingLeft + paddingLeft2;
                }
            }
            return;
        }
        int paddingLeft3 = getPaddingLeft();
        int i7 = 0;
        while (true) {
            int childCount2 = getChildCount();
            vf6Var = this.a;
            if (i7 >= childCount2) {
                break;
            }
            View childAt2 = getChildAt(i7);
            if (childAt2 != zx3Var && !cy3Var.H.containsKey(childAt2) && childAt2 != null) {
                childAt2.layout(paddingLeft3, i5 - (childAt2.getMeasuredHeight() / 2), childAt2.getMeasuredWidth() + paddingLeft3, (childAt2.getMeasuredHeight() / 2) + i5);
                boolean z2 = childAt2 instanceof zx3;
                Long l = null;
                if (z2) {
                    zx3 zx3Var2 = (zx3) childAt2;
                    Long l2 = zx3Var2.a;
                    if (l2 == null) {
                        h04 h04Var = zx3Var2.w;
                        if (h04Var == null || (stickerSet = h04Var.b) == null) {
                            l2 = zx3Var2.r;
                            if (l2 == null) {
                                TLRPC.Document document = zx3Var2.s;
                                if (document != null) {
                                    l = Long.valueOf(document.id);
                                }
                            }
                        } else {
                            l = Long.valueOf(stickerSet.id);
                        }
                    }
                    l = l2;
                } else if (childAt2 instanceof by3) {
                    l = Long.valueOf(((by3) childAt2).h);
                }
                if (cy3Var.O && z2) {
                    zx3 zx3Var3 = (zx3) childAt2;
                    if (zx3Var3.b) {
                        zx3Var3.b = false;
                        childAt2.setScaleX(0.0f);
                        childAt2.setScaleY(0.0f);
                        childAt2.setAlpha(0.0f);
                        childAt2.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(pg5.d() ? 0L : 200L).setInterpolator(s33.h).start();
                    }
                }
                if (l != null) {
                    Integer num = (Integer) vf6Var.f(l.longValue());
                    if (num != null && num.intValue() != paddingLeft3 && Math.abs(num.intValue() - paddingLeft3) < gl.L(45.0f)) {
                        childAt2.setTranslationX(num.intValue() - paddingLeft3);
                        childAt2.animate().translationX(0.0f).setDuration(250L).setInterpolator(s33.h).start();
                    }
                    vf6Var.k(Integer.valueOf(paddingLeft3), l.longValue());
                }
                if ((childAt2 != cy3Var.y || cy3Var.W) && (childAt2 != cy3Var.E || cy3Var.b0)) {
                    paddingLeft3 = de9.w(3.0f, childAt2.getMeasuredWidth(), paddingLeft3);
                }
            }
            i7++;
        }
        if (zx3Var != null) {
            Long l3 = zx3Var.a;
            if (getPaddingRight() + zx3Var.getMeasuredWidth() + paddingLeft3 <= cy3Var.getMeasuredWidth()) {
                int i8 = i3 - i;
                paddingLeft3 = (i8 - getPaddingRight()) - zx3Var.getMeasuredWidth();
                zx3Var.layout(paddingLeft3, i5 - (zx3Var.getMeasuredHeight() / 2), i8 - getPaddingRight(), (zx3Var.getMeasuredHeight() / 2) + i5);
            } else {
                zx3Var.layout(paddingLeft3, i5 - (zx3Var.getMeasuredHeight() / 2), zx3Var.getMeasuredWidth() + paddingLeft3, (zx3Var.getMeasuredHeight() / 2) + i5);
            }
            if (l3 != null) {
                if (vf6Var.f(l3.longValue()) != null && ((Integer) vf6Var.f(l3.longValue())).intValue() != paddingLeft3) {
                    zx3Var.setTranslationX(((Integer) vf6Var.f(l3.longValue())).intValue() - paddingLeft3);
                    zx3Var.animate().translationX(0.0f).setDuration(350L).start();
                }
                vf6Var.k(Integer.valueOf(paddingLeft3), l3.longValue());
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        zx3 zx3Var;
        zx3 zx3Var2;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        cy3 cy3Var = this.r;
        float f = 0.0f;
        int alpha = paddingRight - ((int) ((cy3Var.W || (zx3Var2 = cy3Var.y) == null) ? 0.0f : zx3Var2.getAlpha() * gl.L(33.0f)));
        if (!cy3Var.b0 && (zx3Var = cy3Var.E) != null) {
            f = zx3Var.getAlpha() * gl.L(33.0f);
        }
        int i3 = alpha - ((int) f);
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            if (childAt != null) {
                childAt.measure(-2047483649, i2);
                i3 = childAt.getMeasuredWidth() + (i4 + 1 < getChildCount() ? gl.L(3.0f) : 0) + i3;
            }
        }
        if (this.h) {
            setMeasuredDimension(Math.max(i3, View.MeasureSpec.getSize(i)), View.MeasureSpec.getSize(i2));
        } else {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        }
    }
}
