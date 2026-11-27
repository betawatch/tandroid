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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class qy3 extends LinearLayout {
    public final zh6 a;
    public final Paint b;
    public final RectF c;
    public final RectF d;
    public final RectF e;
    public final Path f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ xy3 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qy3(xy3 xy3Var, Context context, boolean z, boolean z2) {
        super(context);
        this.r = xy3Var;
        this.h = z;
        this.n = z2;
        this.a = new zh6();
        this.b = new Paint(1);
        this.c = new RectF();
        this.d = new RectF();
        this.e = new RectF();
        this.f = new Path();
    }

    public final void a(RectF rectF, int i) {
        View childAt = getChildAt(ete.b(i, 0, getChildCount() - 1));
        if (childAt == null) {
            return;
        }
        rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
        rectF.set(rectF.centerX() - (childAt.getScaleX() * (rectF.width() / 2.0f)), rectF.centerY() - (childAt.getScaleY() * (rectF.height() / 2.0f)), (childAt.getScaleX() * (rectF.width() / 2.0f)) + rectF.centerX(), (childAt.getScaleY() * (rectF.height() / 2.0f)) + rectF.centerY());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f;
        xy3 xy3Var = this.r;
        boolean z = xy3Var.h;
        wy3 wy3Var = xy3Var.G;
        for (Map.Entry entry : xy3Var.H.entrySet()) {
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
        mm mmVar = xy3Var.r;
        if (mmVar == null) {
            mmVar = new mm(350L, this, k43.h);
            xy3Var.r = mmVar;
        }
        float e = mmVar.e(false, xy3Var.n ? 1.0f : 0.0f);
        int floor = (int) Math.floor(xy3Var.K);
        int ceil = (int) Math.ceil(xy3Var.K);
        RectF rectF = this.c;
        a(rectF, floor);
        RectF rectF2 = this.d;
        a(rectF2, ceil);
        float f2 = xy3Var.K - floor;
        RectF rectF3 = this.e;
        hl.X1(rectF, rectF2, f2, rectF3);
        float l = wy3Var != null ? 1.0f - Utilities.l(Math.abs(xy3Var.K - ((xy3Var.E != null ? 1 : 0) + 1))) : 0.0f;
        float f3 = xy3Var.L;
        float f4 = (1.0f - f3) * 4.0f * f3;
        float z2 = xnb.z(f4, 0.3f, 1.0f, rectF3.width() / 2.0f);
        float B = xnb.B(f4, 0.05f, 1.0f, rectF3.height() / 2.0f);
        rectF3.set(rectF3.centerX() - z2, rectF3.centerY() - B, rectF3.centerX() + z2, rectF3.centerY() + B);
        float L = hl.L(hl.R1(8.0f, 16.0f, l));
        int k = xy3Var.k();
        Paint paint = this.b;
        paint.setColor(k);
        if (z) {
            paint.setAlpha((int) xnb.B(l, 0.5f, 1.0f, paint.getAlpha() * e));
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
            path.addRoundRect(rectF3, hl.N(16.0f), hl.N(16.0f), direction);
            paint.setColor(xy3Var.k());
            paint.setAlpha((int) (paint.getAlpha() * 0.5f));
            canvas.drawPath(path, paint);
        }
        if (wy3Var != null) {
            path.addCircle(hl.L(15.0f) + wy3Var.getLeft(), (wy3Var.getBottom() + wy3Var.getTop()) / 2.0f, hl.L(15.0f), direction);
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
        zh6 zh6Var;
        TLRPC.StickerSet stickerSet;
        xy3 xy3Var = this.r;
        uy3 uy3Var = xy3Var.F;
        int i5 = (i4 - i2) / 2;
        if (!this.h) {
            int childCount = (getChildCount() - (!xy3Var.W ? 1 : 0)) - (!xy3Var.b0 ? 1 : 0);
            int paddingLeft = (int) (((((i3 - i) - getPaddingLeft()) - getPaddingRight()) - (hl.L(30.0f) * childCount)) / Math.max(1, childCount - 1));
            int paddingLeft2 = getPaddingLeft();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt((!xy3Var.W ? 1 : 0) + (!xy3Var.b0 ? 1 : 0) + i6);
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
            zh6Var = this.a;
            if (i7 >= childCount2) {
                break;
            }
            View childAt2 = getChildAt(i7);
            if (childAt2 != uy3Var && !xy3Var.H.containsKey(childAt2) && childAt2 != null) {
                childAt2.layout(paddingLeft3, i5 - (childAt2.getMeasuredHeight() / 2), childAt2.getMeasuredWidth() + paddingLeft3, (childAt2.getMeasuredHeight() / 2) + i5);
                boolean z2 = childAt2 instanceof uy3;
                Long l = null;
                if (z2) {
                    uy3 uy3Var2 = (uy3) childAt2;
                    Long l2 = uy3Var2.a;
                    if (l2 == null) {
                        c14 c14Var = uy3Var2.w;
                        if (c14Var == null || (stickerSet = c14Var.b) == null) {
                            l2 = uy3Var2.r;
                            if (l2 == null) {
                                TLRPC.Document document = uy3Var2.s;
                                if (document != null) {
                                    l = Long.valueOf(document.id);
                                }
                            }
                        } else {
                            l = Long.valueOf(stickerSet.id);
                        }
                    }
                    l = l2;
                } else if (childAt2 instanceof wy3) {
                    l = Long.valueOf(((wy3) childAt2).h);
                }
                if (xy3Var.O && z2) {
                    uy3 uy3Var3 = (uy3) childAt2;
                    if (uy3Var3.b) {
                        uy3Var3.b = false;
                        childAt2.setScaleX(0.0f);
                        childAt2.setScaleY(0.0f);
                        childAt2.setAlpha(0.0f);
                        childAt2.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(ri5.d() ? 0L : 200L).setInterpolator(k43.h).start();
                    }
                }
                if (l != null) {
                    Integer num = (Integer) zh6Var.f(l.longValue());
                    if (num != null && num.intValue() != paddingLeft3 && Math.abs(num.intValue() - paddingLeft3) < hl.L(45.0f)) {
                        childAt2.setTranslationX(num.intValue() - paddingLeft3);
                        childAt2.animate().translationX(0.0f).setDuration(250L).setInterpolator(k43.h).start();
                    }
                    zh6Var.k(l.longValue(), Integer.valueOf(paddingLeft3));
                }
                if ((childAt2 != xy3Var.y || xy3Var.W) && (childAt2 != xy3Var.E || xy3Var.b0)) {
                    paddingLeft3 = uh9.w(3.0f, childAt2.getMeasuredWidth(), paddingLeft3);
                }
            }
            i7++;
        }
        if (uy3Var != null) {
            Long l3 = uy3Var.a;
            if (getPaddingRight() + uy3Var.getMeasuredWidth() + paddingLeft3 <= xy3Var.getMeasuredWidth()) {
                int i8 = i3 - i;
                paddingLeft3 = (i8 - getPaddingRight()) - uy3Var.getMeasuredWidth();
                uy3Var.layout(paddingLeft3, i5 - (uy3Var.getMeasuredHeight() / 2), i8 - getPaddingRight(), (uy3Var.getMeasuredHeight() / 2) + i5);
            } else {
                uy3Var.layout(paddingLeft3, i5 - (uy3Var.getMeasuredHeight() / 2), uy3Var.getMeasuredWidth() + paddingLeft3, (uy3Var.getMeasuredHeight() / 2) + i5);
            }
            if (l3 != null) {
                if (zh6Var.f(l3.longValue()) != null && ((Integer) zh6Var.f(l3.longValue())).intValue() != paddingLeft3) {
                    uy3Var.setTranslationX(((Integer) zh6Var.f(l3.longValue())).intValue() - paddingLeft3);
                    uy3Var.animate().translationX(0.0f).setDuration(350L).start();
                }
                zh6Var.k(l3.longValue(), Integer.valueOf(paddingLeft3));
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        uy3 uy3Var;
        uy3 uy3Var2;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        xy3 xy3Var = this.r;
        float f = 0.0f;
        int alpha = paddingRight - ((int) ((xy3Var.W || (uy3Var2 = xy3Var.y) == null) ? 0.0f : uy3Var2.getAlpha() * hl.L(33.0f)));
        if (!xy3Var.b0 && (uy3Var = xy3Var.E) != null) {
            f = uy3Var.getAlpha() * hl.L(33.0f);
        }
        int i3 = alpha - ((int) f);
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            if (childAt != null) {
                childAt.measure(-2047483649, i2);
                i3 = childAt.getMeasuredWidth() + (i4 + 1 < getChildCount() ? hl.L(3.0f) : 0) + i3;
            }
        }
        if (this.h) {
            setMeasuredDimension(Math.max(i3, View.MeasureSpec.getSize(i)), View.MeasureSpec.getSize(i2));
        } else {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        }
    }
}
