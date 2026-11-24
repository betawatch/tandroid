// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.OvershootInterpolator;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class rkb extends View {
    public final Paint a;
    public float b;
    public float c;
    public long d;
    public final Path e;
    public final ArrayList f;
    public float h;
    public float n;
    public final /* synthetic */ skb r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rkb(skb skbVar, Context context) {
        super(context);
        this.r = skbVar;
        Paint paint = new Paint(1);
        this.a = paint;
        this.d = 0L;
        this.e = new Path();
        this.f = new ArrayList();
        paint.setStyle(Paint.Style.FILL);
    }

    public final void a(RectF rectF) {
        if (rectF.isEmpty()) {
            return;
        }
        this.f.add(new Rect((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom)));
    }

    public final boolean b(MotionEvent motionEvent) {
        skb skbVar = this.r;
        if (skbVar.w() && !skbVar.i) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.b = motionEvent.getX();
                this.c = motionEvent.getY();
                this.d = System.currentTimeMillis();
            } else if (action == 1 && System.currentTimeMillis() - this.d < 200 && oqe.b((int) this.b, (int) this.c, (int) motionEvent.getX(), (int) motionEvent.getY()) < skbVar.m) {
                skbVar.J(motionEvent.getRawX(), motionEvent.getRawY());
                skbVar.t();
                skbVar.e(false);
                return true;
            }
        }
        return false;
    }

    public final void c() {
        if (Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.f;
            if (arrayList.isEmpty()) {
                return;
            }
            arrayList.clear();
            setSystemGestureExclusionRects(arrayList);
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        ViewGroup viewGroup;
        super.invalidate();
        skb skbVar = this.r;
        if (!skbVar.i0 || (viewGroup = skbVar.F) == null) {
            return;
        }
        viewGroup.invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        zcb zcbVar;
        int i;
        char c;
        float f;
        int i2;
        boolean isRtlCharAt;
        float f2;
        boolean z;
        int i3;
        skb skbVar = this.r;
        zcb zcbVar2 = skbVar.m0;
        OvershootInterpolator overshootInterpolator = skbVar.c0;
        RectF rectF = skbVar.S;
        RectF rectF2 = skbVar.T;
        vj2 vj2Var = skbVar.a0;
        if (skbVar.w()) {
            int L = gm.L(22.0f);
            int i4 = skbVar.x;
            skbVar.M();
            nkb nkbVar = skbVar.W;
            Paint paint = this.a;
            Path path = this.e;
            if (nkbVar != null) {
                canvas.save();
                int[] k = skbVar.k();
                c = 1;
                float f3 = k[1] + skbVar.b;
                f = 8.0f;
                float f4 = k[0] + skbVar.a;
                canvas.translate(f4, f3);
                nkb nkbVar2 = skbVar.W;
                k47 messageObject = nkbVar2 instanceof rc2 ? ((rc2) nkbVar2).getMessageObject() : null;
                if (messageObject == null || !messageObject.O3()) {
                    paint.setColor(skbVar.s(cmb.lg));
                } else {
                    paint.setColor(skbVar.s(cmb.Mc));
                }
                int length = skbVar.r(skbVar.W, false).length();
                int i5 = skbVar.v;
                if (i5 >= 0 && i5 <= length) {
                    skbVar.h(i5, vj2Var, false);
                    Layout layout = (Layout) vj2Var.d;
                    if (layout != null) {
                        zcbVar = zcbVar2;
                        int i6 = skbVar.v - vj2Var.a;
                        int length2 = layout.getText().length();
                        if (i6 > length2) {
                            i6 = length2;
                        }
                        int lineForOffset = layout.getLineForOffset(i6);
                        float primaryHorizontal = layout.getPrimaryHorizontal(i6);
                        int lineBottom = (int) (layout.getLineBottom(lineForOffset) + vj2Var.b);
                        float f5 = primaryHorizontal + vj2Var.c;
                        Rect rect = (Rect) vj2Var.e;
                        if (rect != null) {
                            float f6 = rect.right - skbVar.a;
                            i3 = rect.bottom - skbVar.b;
                            f2 = f6;
                            z = false;
                        } else {
                            boolean isRtlCharAt2 = layout.isRtlCharAt(skbVar.v);
                            f2 = f5;
                            z = isRtlCharAt2;
                            i3 = lineBottom;
                        }
                        float f7 = i3;
                        float f8 = f3 + f7;
                        i = i4;
                        if (f8 <= i + skbVar.d0 || f8 >= skbVar.F.getMeasuredHeight()) {
                            rectF2.setEmpty();
                        } else if (z) {
                            canvas.save();
                            float f9 = L;
                            canvas.translate(f2 - f9, f7);
                            float interpolation = overshootInterpolator.getInterpolation(skbVar.V);
                            float f10 = f9 / 2.0f;
                            canvas.scale(interpolation, interpolation, f10, f10);
                            path.reset();
                            Path.Direction direction = Path.Direction.CCW;
                            path.addCircle(f10, f10, f10, direction);
                            path.addRect(f10, 0.0f, f9, f10, direction);
                            canvas.drawPath(path, paint);
                            canvas.restore();
                            float f11 = f4 + f2;
                            rectF2.set(f11 - f9, f8 - f9, f11, f8 + f9);
                            rectF2.inset(-gm.L(8.0f), -gm.L(8.0f));
                        } else {
                            canvas.save();
                            canvas.translate(f2, f7);
                            float interpolation2 = overshootInterpolator.getInterpolation(skbVar.V);
                            float f12 = L;
                            float f13 = f12 / 2.0f;
                            canvas.scale(interpolation2, interpolation2, f13, f13);
                            path.reset();
                            Path.Direction direction2 = Path.Direction.CCW;
                            path.addCircle(f13, f13, f13, direction2);
                            path.addRect(0.0f, 0.0f, f13, f13, direction2);
                            canvas.drawPath(path, paint);
                            canvas.restore();
                            float f14 = f4 + f2;
                            rectF2.set(f14, f8 - f12, f14 + f12, f8 + f12);
                            rectF2.inset(-gm.L(8.0f), -gm.L(8.0f));
                            i2 = 1;
                            canvas.restore();
                        }
                        i2 = 0;
                        canvas.restore();
                    }
                }
                zcbVar = zcbVar2;
                i = i4;
                i2 = 0;
                canvas.restore();
            } else {
                zcbVar = zcbVar2;
                i = i4;
                c = 1;
                f = 8.0f;
                i2 = 0;
            }
            skbVar.N();
            if (skbVar.W != null) {
                canvas.save();
                int[] k2 = skbVar.k();
                float f15 = k2[c] + skbVar.b;
                float f16 = k2[0] + skbVar.a;
                canvas.translate(f16, f15);
                int length3 = skbVar.r(skbVar.W, false).length();
                int i7 = skbVar.u;
                if (i7 >= 0 && i7 <= length3) {
                    skbVar.h(i7, vj2Var, false);
                    Layout layout2 = (Layout) vj2Var.d;
                    if (layout2 != null) {
                        int i8 = skbVar.u - vj2Var.a;
                        int lineForOffset2 = layout2.getLineForOffset(i8);
                        float primaryHorizontal2 = layout2.getPrimaryHorizontal(i8);
                        int lineBottom2 = (int) (layout2.getLineBottom(lineForOffset2) + vj2Var.b);
                        float f17 = primaryHorizontal2 + vj2Var.c;
                        Rect rect2 = (Rect) vj2Var.e;
                        if (rect2 != null) {
                            f17 = rect2.left - skbVar.a;
                            lineBottom2 = rect2.bottom - skbVar.b;
                            isRtlCharAt = false;
                        } else {
                            isRtlCharAt = layout2.isRtlCharAt(skbVar.u);
                        }
                        float f18 = lineBottom2;
                        float f19 = f15 + f18;
                        if (f19 <= i + skbVar.d0 || f19 >= skbVar.F.getMeasuredHeight()) {
                            if (f19 > 0.0f && f19 - skbVar.l() < skbVar.F.getMeasuredHeight()) {
                                i2++;
                            }
                            rectF.setEmpty();
                        } else if (isRtlCharAt) {
                            canvas.save();
                            canvas.translate(f17, f18);
                            float interpolation3 = overshootInterpolator.getInterpolation(skbVar.V);
                            float f20 = L;
                            float f21 = f20 / 2.0f;
                            canvas.scale(interpolation3, interpolation3, f21, f21);
                            path.reset();
                            Path.Direction direction3 = Path.Direction.CCW;
                            path.addCircle(f21, f21, f21, direction3);
                            path.addRect(0.0f, 0.0f, f21, f21, direction3);
                            canvas.drawPath(path, paint);
                            canvas.restore();
                            float f22 = f16 + f17;
                            rectF.set(f22, f19 - f20, f22 + f20, f19 + f20);
                            rectF.inset(-gm.L(f), -gm.L(f));
                        } else {
                            canvas.save();
                            float f23 = L;
                            canvas.translate(f17 - f23, f18);
                            float interpolation4 = overshootInterpolator.getInterpolation(skbVar.V);
                            float f24 = f23 / 2.0f;
                            canvas.scale(interpolation4, interpolation4, f24, f24);
                            path.reset();
                            Path.Direction direction4 = Path.Direction.CCW;
                            path.addCircle(f24, f24, f24, direction4);
                            path.addRect(f24, 0.0f, f23, f24, direction4);
                            canvas.drawPath(path, paint);
                            canvas.restore();
                            float f25 = f16 + f17;
                            rectF.set(f25 - f23, f19 - f23, f25, f19 + f23);
                            rectF.inset(-gm.L(f), -gm.L(f));
                            i2++;
                        }
                    }
                }
                canvas.restore();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                ArrayList arrayList = this.f;
                arrayList.clear();
                a(rectF);
                a(rectF2);
                setSystemGestureExclusionRects(arrayList);
            }
            if (i2 != 0 && skbVar.i) {
                if (!skbVar.j) {
                    skbVar.M();
                }
                skbVar.T(skbVar.b0);
                if (skbVar.I != skbVar.H || skbVar.L != skbVar.K) {
                    invalidate();
                }
            }
            if (!skbVar.Q) {
                gm.r(zcbVar);
                gm.c3(zcbVar);
            }
            cl4 cl4Var = skbVar.Y;
            if (cl4Var != null) {
                cl4Var.invalidateContentRect();
                cl4 cl4Var2 = skbVar.Y;
                if (cl4Var2 != null) {
                    cl4Var2.c();
                }
            }
            if (skbVar.k) {
                invalidate();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        if (r15 != 3) goto L288;
     */
    /* JADX WARN: Removed duplicated region for block: B:248:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        boolean z;
        float f;
        float f2;
        int j;
        char charAt;
        char charAt2;
        skb skbVar = this.r;
        zcb zcbVar = skbVar.m0;
        dkb dkbVar = skbVar.e0;
        vj2 vj2Var = skbVar.a0;
        boolean z2 = false;
        if (skbVar.w()) {
            if (motionEvent.getPointerCount() > 1) {
                return skbVar.i;
            }
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int i = skbVar.b0 - x;
            skbVar.b0 = x;
            int action = motionEvent.getAction();
            if (action == 0) {
                if (!skbVar.i) {
                    float f3 = x;
                    float f4 = y;
                    if (skbVar.S.contains(f3, f4)) {
                        skbVar.N();
                        if (skbVar.W != null) {
                            skbVar.i = true;
                            skbVar.j = true;
                            ViewParent parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            int[] A = skbVar.A(skbVar.u);
                            float l = skbVar.l() / 2;
                            int[] k = skbVar.k();
                            if (skbVar.h0) {
                                skbVar.f = ((A[0] + skbVar.a) + k[0]) - x;
                            } else {
                                skbVar.f = 0.0f;
                            }
                            skbVar.g = (((A[1] + skbVar.b) + k[1]) - y) - l;
                            skbVar.t();
                            skbVar.C.invalidate();
                            return true;
                        }
                    } else {
                        if (!skbVar.T.contains(f3, f4)) {
                            skbVar.i = false;
                            skbVar.e = true;
                            return skbVar.i;
                        }
                        skbVar.M();
                        if (skbVar.W != null) {
                            skbVar.i = true;
                            skbVar.j = false;
                            ViewParent parent3 = getParent();
                            if (parent3 != null) {
                                parent3.requestDisallowInterceptTouchEvent(true);
                            }
                            int[] A2 = skbVar.A(skbVar.v);
                            float l2 = skbVar.l() / 2;
                            int[] k2 = skbVar.k();
                            skbVar.f = ((A2[0] + skbVar.a) + k2[0]) - x;
                            skbVar.g = (((A2[1] + skbVar.b) + k2[1]) - y) - l2;
                            skbVar.T(skbVar.b0);
                            skbVar.t();
                            skbVar.C.invalidate();
                            return true;
                        }
                    }
                }
                return true;
            }
            if (action != 1) {
                if (action == 2) {
                    if (skbVar.i) {
                        if (skbVar.j) {
                            skbVar.N();
                        } else {
                            skbVar.M();
                        }
                        if (skbVar.W == null) {
                            return skbVar.i;
                        }
                        int i2 = (int) (x + skbVar.f);
                        int i3 = (int) (y + skbVar.g);
                        boolean O = skbVar.O(i2, i3);
                        if (skbVar.W != null) {
                            if (skbVar.j) {
                                skbVar.h(skbVar.u, vj2Var, false);
                            } else {
                                skbVar.h(skbVar.v, vj2Var, false);
                            }
                            if (((Layout) vj2Var.d) != null) {
                                float f5 = vj2Var.b;
                                nkb nkbVar = skbVar.W;
                                int[] k3 = skbVar.k();
                                int i4 = i3 - k3[1];
                                int i5 = i2 - k3[0];
                                boolean z3 = skbVar.E != null;
                                boolean z4 = z3 && y - skbVar.m > skbVar.F.getMeasuredHeight() - skbVar.n() && (skbVar.j0 || skbVar.Z || skbVar.W.getBottom() > skbVar.F.getMeasuredHeight() - skbVar.n());
                                if (z3) {
                                    if (y < skbVar.o() + ((View) skbVar.F.getParent()).getTop() && (skbVar.Z || skbVar.W.getTop() < skbVar.o())) {
                                        z = true;
                                        if (!z4 || z) {
                                            if (!skbVar.N) {
                                                skbVar.N = true;
                                                gm.c3(dkbVar);
                                            }
                                            skbVar.O = z4;
                                            if (z4) {
                                                f = -skbVar.W.getTop();
                                                f2 = skbVar.g;
                                            } else {
                                                f = skbVar.F.getMeasuredHeight() - skbVar.W.getTop();
                                                f2 = skbVar.g;
                                            }
                                            i4 = (int) (f + f2);
                                        } else if (skbVar.N) {
                                            skbVar.N = false;
                                            gm.r(dkbVar);
                                        }
                                        j = skbVar.j(i5, i4, skbVar.a, skbVar.b, skbVar.W, false);
                                        if (j >= 0) {
                                            if (skbVar.R) {
                                                if (!O) {
                                                    if (j < skbVar.u) {
                                                        skbVar.R = false;
                                                        skbVar.j = true;
                                                        skbVar.t();
                                                    } else if (j > skbVar.v) {
                                                        skbVar.R = false;
                                                        skbVar.j = false;
                                                        skbVar.t();
                                                    }
                                                }
                                            }
                                            if (skbVar.j) {
                                                if (skbVar.u != j && skbVar.b(j)) {
                                                    CharSequence r = skbVar.r(skbVar.W, false);
                                                    skbVar.h(j, vj2Var, false);
                                                    Layout layout = (Layout) vj2Var.d;
                                                    skbVar.h(skbVar.u, vj2Var, false);
                                                    Layout layout2 = (Layout) vj2Var.d;
                                                    if (layout != null && layout2 != null) {
                                                        int i6 = j;
                                                        while (true) {
                                                            int i7 = i6 - 1;
                                                            if (i7 < 0 || !skb.x(r.charAt(i7))) {
                                                                break;
                                                            }
                                                            i6--;
                                                        }
                                                        int lineForOffset = layout2.getLineForOffset(i6);
                                                        int lineForOffset2 = layout2.getLineForOffset(skbVar.u);
                                                        int lineForOffset3 = layout2.getLineForOffset(j);
                                                        if (O || layout != layout2 || (lineForOffset3 != layout2.getLineForOffset(skbVar.u) && lineForOffset3 == lineForOffset)) {
                                                            skbVar.z(j, i6, O, skbVar.a0.b, f5, nkbVar);
                                                            gm.W3(skbVar.C);
                                                            skbVar.v();
                                                        } else if (-1 == layout2.getParagraphDirection(layout2.getLineForOffset(j)) || layout2.isRtlCharAt(j) || lineForOffset != lineForOffset2 || lineForOffset3 != lineForOffset) {
                                                            skbVar.u = j;
                                                            int i8 = skbVar.v;
                                                            if (j > i8) {
                                                                skbVar.v = j;
                                                                skbVar.u = i8;
                                                                skbVar.j = false;
                                                            }
                                                            gm.W3(skbVar.C);
                                                            skbVar.v();
                                                        } else {
                                                            int i9 = j;
                                                            while (true) {
                                                                int i10 = i9 + 1;
                                                                if (i10 >= r.length() || !skb.x(r.charAt(i10))) {
                                                                    break;
                                                                }
                                                                i9 = i10;
                                                            }
                                                            int abs = Math.abs(j - i6);
                                                            int abs2 = Math.abs(j - i9);
                                                            if (skbVar.y) {
                                                                skbVar.y = i >= 0;
                                                            }
                                                            int i11 = j - 1;
                                                            boolean z5 = i11 > 0 && skb.x(r.charAt(i11));
                                                            if (j >= r.length()) {
                                                                j = r.length();
                                                                charAt = '\n';
                                                            } else {
                                                                charAt = r.charAt(j);
                                                            }
                                                            if (skbVar.u >= r.length()) {
                                                                skbVar.u = r.length();
                                                                charAt2 = '\n';
                                                            } else {
                                                                charAt2 = r.charAt(skbVar.u);
                                                            }
                                                            int i12 = skbVar.u;
                                                            if ((j < i12 && abs < abs2) || ((j > i12 && i < 0) || !skb.x(charAt) || ((skb.x(charAt2) && !skbVar.y) || j == 0 || !z5 || charAt2 == '\n'))) {
                                                                if (!skbVar.y || j != 1) {
                                                                    if (j >= skbVar.u || !skb.x(charAt) || ((skb.x(charAt2) && !skbVar.y) || charAt2 == '\n')) {
                                                                        skbVar.u = j;
                                                                        i6 = j;
                                                                    } else {
                                                                        skbVar.u = i6;
                                                                        skbVar.y = true;
                                                                    }
                                                                    int i13 = skbVar.v;
                                                                    if (i6 > i13) {
                                                                        skbVar.v = i6;
                                                                        skbVar.u = i13;
                                                                        skbVar.j = false;
                                                                    }
                                                                    gm.W3(skbVar.C);
                                                                    skbVar.v();
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                skbVar.E();
                                            } else {
                                                if (j != skbVar.v && skbVar.b(j)) {
                                                    CharSequence r2 = skbVar.r(skbVar.W, false);
                                                    int i14 = j;
                                                    while (i14 < r2.length() && skb.x(r2.charAt(i14))) {
                                                        i14++;
                                                    }
                                                    skbVar.h(j, vj2Var, false);
                                                    Layout layout3 = (Layout) vj2Var.d;
                                                    skbVar.h(skbVar.v, vj2Var, false);
                                                    Layout layout4 = (Layout) vj2Var.d;
                                                    if (layout3 != null && layout4 != null) {
                                                        if (j > r2.length()) {
                                                            j = r2.length();
                                                        }
                                                        int lineForOffset4 = layout4.getLineForOffset(i14);
                                                        int lineForOffset5 = layout4.getLineForOffset(skbVar.v);
                                                        int lineForOffset6 = layout4.getLineForOffset(j);
                                                        if (O || layout3 != layout4 || (lineForOffset6 != layout4.getLineForOffset(skbVar.v) && lineForOffset6 == lineForOffset4)) {
                                                            skbVar.z(j, i14, O, skbVar.a0.b, f5, nkbVar);
                                                            gm.W3(skbVar.C);
                                                            skbVar.v();
                                                        } else if (-1 == layout4.getParagraphDirection(layout4.getLineForOffset(j)) || layout4.isRtlCharAt(j) || lineForOffset5 != lineForOffset4 || lineForOffset6 != lineForOffset4) {
                                                            skbVar.v = j;
                                                            int i15 = skbVar.u;
                                                            if (i15 > j) {
                                                                skbVar.v = i15;
                                                                skbVar.u = j;
                                                                skbVar.j = true;
                                                            }
                                                            gm.W3(skbVar.C);
                                                            skbVar.v();
                                                        } else {
                                                            int i16 = j;
                                                            while (true) {
                                                                int i17 = i16 - 1;
                                                                if (i17 < 0 || !skb.x(r2.charAt(i17))) {
                                                                    break;
                                                                }
                                                                i16--;
                                                            }
                                                            int abs3 = Math.abs(j - i14);
                                                            int abs4 = Math.abs(j - i16);
                                                            int i18 = j - 1;
                                                            boolean z6 = i18 > 0 && skb.x(r2.charAt(i18));
                                                            if (skbVar.y) {
                                                                skbVar.y = i <= 0;
                                                            }
                                                            int i19 = skbVar.v;
                                                            if (i19 > 0 && skb.x(r2.charAt(i19 - 1))) {
                                                                z2 = true;
                                                            }
                                                            int i20 = skbVar.v;
                                                            if ((j > i20 && abs3 <= abs4) || ((j < i20 && i > 0) || !z6 || (z2 && !skbVar.y))) {
                                                                if (j <= i20 || !z6 || (z2 && !skbVar.y)) {
                                                                    skbVar.v = j;
                                                                    i14 = j;
                                                                } else {
                                                                    skbVar.v = i14;
                                                                    skbVar.y = true;
                                                                }
                                                                int i21 = skbVar.u;
                                                                if (i21 > i14) {
                                                                    skbVar.v = i21;
                                                                    skbVar.u = i14;
                                                                    skbVar.j = true;
                                                                }
                                                                gm.W3(skbVar.C);
                                                                skbVar.v();
                                                            }
                                                        }
                                                    }
                                                }
                                                skbVar.E();
                                            }
                                        }
                                        skbVar.T(skbVar.b0);
                                    }
                                }
                                z = false;
                                if (z4) {
                                }
                                if (!skbVar.N) {
                                }
                                skbVar.O = z4;
                                if (z4) {
                                }
                                i4 = (int) (f + f2);
                                j = skbVar.j(i5, i4, skbVar.a, skbVar.b, skbVar.W, false);
                                if (j >= 0) {
                                }
                                skbVar.T(skbVar.b0);
                            }
                        }
                        return true;
                    }
                }
                return skbVar.i;
            }
            skbVar.u();
            if (skbVar.i && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(false);
            }
            skbVar.i = false;
            skbVar.R = false;
            skbVar.k = false;
            if (skbVar.w()) {
                skbVar.C.invalidate();
                gm.r(zcbVar);
                gm.c3(zcbVar);
                skbVar.S();
            }
            if (skbVar.N) {
                skbVar.N = false;
                gm.r(dkbVar);
            }
            return skbVar.i;
        }
        return false;
    }
}
