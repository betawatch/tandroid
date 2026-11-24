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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class qib extends View {
    public final Paint a;
    public float b;
    public float c;
    public long d;
    public final Path e;
    public final ArrayList f;
    public float h;
    public float n;
    public final /* synthetic */ rib r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qib(rib ribVar, Context context) {
        super(context);
        this.r = ribVar;
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
        rib ribVar = this.r;
        if (ribVar.w() && !ribVar.i) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.b = motionEvent.getX();
                this.c = motionEvent.getY();
                this.d = System.currentTimeMillis();
            } else if (action == 1 && System.currentTimeMillis() - this.d < 200 && loe.b((int) this.b, (int) this.c, (int) motionEvent.getX(), (int) motionEvent.getY()) < ribVar.m) {
                ribVar.J(motionEvent.getRawX(), motionEvent.getRawY());
                ribVar.t();
                ribVar.e(false);
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
        rib ribVar = this.r;
        if (!ribVar.i0 || (viewGroup = ribVar.F) == null) {
            return;
        }
        viewGroup.invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        kya kyaVar;
        int i;
        char c;
        float f;
        int i2;
        boolean isRtlCharAt;
        float f2;
        boolean z;
        int i3;
        rib ribVar = this.r;
        kya kyaVar2 = ribVar.m0;
        OvershootInterpolator overshootInterpolator = ribVar.c0;
        RectF rectF = ribVar.S;
        RectF rectF2 = ribVar.T;
        hi2 hi2Var = ribVar.a0;
        if (ribVar.w()) {
            int L = gl.L(22.0f);
            int i4 = ribVar.x;
            ribVar.M();
            mib mibVar = ribVar.W;
            Paint paint = this.a;
            Path path = this.e;
            if (mibVar != null) {
                canvas.save();
                int[] k = ribVar.k();
                c = 1;
                float f3 = k[1] + ribVar.b;
                f = 8.0f;
                float f4 = k[0] + ribVar.a;
                canvas.translate(f4, f3);
                mib mibVar2 = ribVar.W;
                k27 messageObject = mibVar2 instanceof gb2 ? ((gb2) mibVar2).getMessageObject() : null;
                if (messageObject == null || !messageObject.O3()) {
                    paint.setColor(ribVar.s(bkb.lg));
                } else {
                    paint.setColor(ribVar.s(bkb.Mc));
                }
                int length = ribVar.r(ribVar.W, false).length();
                int i5 = ribVar.v;
                if (i5 >= 0 && i5 <= length) {
                    ribVar.h(i5, hi2Var, false);
                    Layout layout = (Layout) hi2Var.d;
                    if (layout != null) {
                        kyaVar = kyaVar2;
                        int i6 = ribVar.v - hi2Var.a;
                        int length2 = layout.getText().length();
                        if (i6 > length2) {
                            i6 = length2;
                        }
                        int lineForOffset = layout.getLineForOffset(i6);
                        float primaryHorizontal = layout.getPrimaryHorizontal(i6);
                        int lineBottom = (int) (layout.getLineBottom(lineForOffset) + hi2Var.b);
                        float f5 = primaryHorizontal + hi2Var.c;
                        Rect rect = (Rect) hi2Var.e;
                        if (rect != null) {
                            float f6 = rect.right - ribVar.a;
                            i3 = rect.bottom - ribVar.b;
                            f2 = f6;
                            z = false;
                        } else {
                            boolean isRtlCharAt2 = layout.isRtlCharAt(ribVar.v);
                            f2 = f5;
                            z = isRtlCharAt2;
                            i3 = lineBottom;
                        }
                        float f7 = i3;
                        float f8 = f3 + f7;
                        i = i4;
                        if (f8 <= i + ribVar.d0 || f8 >= ribVar.F.getMeasuredHeight()) {
                            rectF2.setEmpty();
                        } else if (z) {
                            canvas.save();
                            float f9 = L;
                            canvas.translate(f2 - f9, f7);
                            float interpolation = overshootInterpolator.getInterpolation(ribVar.V);
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
                            rectF2.inset(-gl.L(8.0f), -gl.L(8.0f));
                        } else {
                            canvas.save();
                            canvas.translate(f2, f7);
                            float interpolation2 = overshootInterpolator.getInterpolation(ribVar.V);
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
                            rectF2.inset(-gl.L(8.0f), -gl.L(8.0f));
                            i2 = 1;
                            canvas.restore();
                        }
                        i2 = 0;
                        canvas.restore();
                    }
                }
                kyaVar = kyaVar2;
                i = i4;
                i2 = 0;
                canvas.restore();
            } else {
                kyaVar = kyaVar2;
                i = i4;
                c = 1;
                f = 8.0f;
                i2 = 0;
            }
            ribVar.N();
            if (ribVar.W != null) {
                canvas.save();
                int[] k2 = ribVar.k();
                float f15 = k2[c] + ribVar.b;
                float f16 = k2[0] + ribVar.a;
                canvas.translate(f16, f15);
                int length3 = ribVar.r(ribVar.W, false).length();
                int i7 = ribVar.u;
                if (i7 >= 0 && i7 <= length3) {
                    ribVar.h(i7, hi2Var, false);
                    Layout layout2 = (Layout) hi2Var.d;
                    if (layout2 != null) {
                        int i8 = ribVar.u - hi2Var.a;
                        int lineForOffset2 = layout2.getLineForOffset(i8);
                        float primaryHorizontal2 = layout2.getPrimaryHorizontal(i8);
                        int lineBottom2 = (int) (layout2.getLineBottom(lineForOffset2) + hi2Var.b);
                        float f17 = primaryHorizontal2 + hi2Var.c;
                        Rect rect2 = (Rect) hi2Var.e;
                        if (rect2 != null) {
                            f17 = rect2.left - ribVar.a;
                            lineBottom2 = rect2.bottom - ribVar.b;
                            isRtlCharAt = false;
                        } else {
                            isRtlCharAt = layout2.isRtlCharAt(ribVar.u);
                        }
                        float f18 = lineBottom2;
                        float f19 = f15 + f18;
                        if (f19 <= i + ribVar.d0 || f19 >= ribVar.F.getMeasuredHeight()) {
                            if (f19 > 0.0f && f19 - ribVar.l() < ribVar.F.getMeasuredHeight()) {
                                i2++;
                            }
                            rectF.setEmpty();
                        } else if (isRtlCharAt) {
                            canvas.save();
                            canvas.translate(f17, f18);
                            float interpolation3 = overshootInterpolator.getInterpolation(ribVar.V);
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
                            rectF.inset(-gl.L(f), -gl.L(f));
                        } else {
                            canvas.save();
                            float f23 = L;
                            canvas.translate(f17 - f23, f18);
                            float interpolation4 = overshootInterpolator.getInterpolation(ribVar.V);
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
                            rectF.inset(-gl.L(f), -gl.L(f));
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
            if (i2 != 0 && ribVar.i) {
                if (!ribVar.j) {
                    ribVar.M();
                }
                ribVar.T(ribVar.b0);
                if (ribVar.I != ribVar.H || ribVar.L != ribVar.K) {
                    invalidate();
                }
            }
            if (!ribVar.Q) {
                gl.r(kyaVar);
                gl.d3(kyaVar);
            }
            yi4 yi4Var = ribVar.Y;
            if (yi4Var != null) {
                yi4Var.invalidateContentRect();
                yi4 yi4Var2 = ribVar.Y;
                if (yi4Var2 != null) {
                    yi4Var2.c();
                }
            }
            if (ribVar.k) {
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
        rib ribVar = this.r;
        kya kyaVar = ribVar.m0;
        bib bibVar = ribVar.e0;
        hi2 hi2Var = ribVar.a0;
        boolean z2 = false;
        if (ribVar.w()) {
            if (motionEvent.getPointerCount() > 1) {
                return ribVar.i;
            }
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int i = ribVar.b0 - x;
            ribVar.b0 = x;
            int action = motionEvent.getAction();
            if (action == 0) {
                if (!ribVar.i) {
                    float f3 = x;
                    float f4 = y;
                    if (ribVar.S.contains(f3, f4)) {
                        ribVar.N();
                        if (ribVar.W != null) {
                            ribVar.i = true;
                            ribVar.j = true;
                            ViewParent parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            int[] A = ribVar.A(ribVar.u);
                            float l = ribVar.l() / 2;
                            int[] k = ribVar.k();
                            if (ribVar.h0) {
                                ribVar.f = ((A[0] + ribVar.a) + k[0]) - x;
                            } else {
                                ribVar.f = 0.0f;
                            }
                            ribVar.g = (((A[1] + ribVar.b) + k[1]) - y) - l;
                            ribVar.t();
                            ribVar.C.invalidate();
                            return true;
                        }
                    } else {
                        if (!ribVar.T.contains(f3, f4)) {
                            ribVar.i = false;
                            ribVar.e = true;
                            return ribVar.i;
                        }
                        ribVar.M();
                        if (ribVar.W != null) {
                            ribVar.i = true;
                            ribVar.j = false;
                            ViewParent parent3 = getParent();
                            if (parent3 != null) {
                                parent3.requestDisallowInterceptTouchEvent(true);
                            }
                            int[] A2 = ribVar.A(ribVar.v);
                            float l2 = ribVar.l() / 2;
                            int[] k2 = ribVar.k();
                            ribVar.f = ((A2[0] + ribVar.a) + k2[0]) - x;
                            ribVar.g = (((A2[1] + ribVar.b) + k2[1]) - y) - l2;
                            ribVar.T(ribVar.b0);
                            ribVar.t();
                            ribVar.C.invalidate();
                            return true;
                        }
                    }
                }
                return true;
            }
            if (action != 1) {
                if (action == 2) {
                    if (ribVar.i) {
                        if (ribVar.j) {
                            ribVar.N();
                        } else {
                            ribVar.M();
                        }
                        if (ribVar.W == null) {
                            return ribVar.i;
                        }
                        int i2 = (int) (x + ribVar.f);
                        int i3 = (int) (y + ribVar.g);
                        boolean O = ribVar.O(i2, i3);
                        if (ribVar.W != null) {
                            if (ribVar.j) {
                                ribVar.h(ribVar.u, hi2Var, false);
                            } else {
                                ribVar.h(ribVar.v, hi2Var, false);
                            }
                            if (((Layout) hi2Var.d) != null) {
                                float f5 = hi2Var.b;
                                mib mibVar = ribVar.W;
                                int[] k3 = ribVar.k();
                                int i4 = i3 - k3[1];
                                int i5 = i2 - k3[0];
                                boolean z3 = ribVar.E != null;
                                boolean z4 = z3 && y - ribVar.m > ribVar.F.getMeasuredHeight() - ribVar.n() && (ribVar.j0 || ribVar.Z || ribVar.W.getBottom() > ribVar.F.getMeasuredHeight() - ribVar.n());
                                if (z3) {
                                    if (y < ribVar.o() + ((View) ribVar.F.getParent()).getTop() && (ribVar.Z || ribVar.W.getTop() < ribVar.o())) {
                                        z = true;
                                        if (!z4 || z) {
                                            if (!ribVar.N) {
                                                ribVar.N = true;
                                                gl.d3(bibVar);
                                            }
                                            ribVar.O = z4;
                                            if (z4) {
                                                f = -ribVar.W.getTop();
                                                f2 = ribVar.g;
                                            } else {
                                                f = ribVar.F.getMeasuredHeight() - ribVar.W.getTop();
                                                f2 = ribVar.g;
                                            }
                                            i4 = (int) (f + f2);
                                        } else if (ribVar.N) {
                                            ribVar.N = false;
                                            gl.r(bibVar);
                                        }
                                        j = ribVar.j(i5, i4, ribVar.a, ribVar.b, ribVar.W, false);
                                        if (j >= 0) {
                                            if (ribVar.R) {
                                                if (!O) {
                                                    if (j < ribVar.u) {
                                                        ribVar.R = false;
                                                        ribVar.j = true;
                                                        ribVar.t();
                                                    } else if (j > ribVar.v) {
                                                        ribVar.R = false;
                                                        ribVar.j = false;
                                                        ribVar.t();
                                                    }
                                                }
                                            }
                                            if (ribVar.j) {
                                                if (ribVar.u != j && ribVar.b(j)) {
                                                    CharSequence r = ribVar.r(ribVar.W, false);
                                                    ribVar.h(j, hi2Var, false);
                                                    Layout layout = (Layout) hi2Var.d;
                                                    ribVar.h(ribVar.u, hi2Var, false);
                                                    Layout layout2 = (Layout) hi2Var.d;
                                                    if (layout != null && layout2 != null) {
                                                        int i6 = j;
                                                        while (true) {
                                                            int i7 = i6 - 1;
                                                            if (i7 < 0 || !rib.x(r.charAt(i7))) {
                                                                break;
                                                            }
                                                            i6--;
                                                        }
                                                        int lineForOffset = layout2.getLineForOffset(i6);
                                                        int lineForOffset2 = layout2.getLineForOffset(ribVar.u);
                                                        int lineForOffset3 = layout2.getLineForOffset(j);
                                                        if (O || layout != layout2 || (lineForOffset3 != layout2.getLineForOffset(ribVar.u) && lineForOffset3 == lineForOffset)) {
                                                            ribVar.z(j, i6, O, ribVar.a0.b, f5, mibVar);
                                                            gl.X3(ribVar.C);
                                                            ribVar.v();
                                                        } else if (-1 == layout2.getParagraphDirection(layout2.getLineForOffset(j)) || layout2.isRtlCharAt(j) || lineForOffset != lineForOffset2 || lineForOffset3 != lineForOffset) {
                                                            ribVar.u = j;
                                                            int i8 = ribVar.v;
                                                            if (j > i8) {
                                                                ribVar.v = j;
                                                                ribVar.u = i8;
                                                                ribVar.j = false;
                                                            }
                                                            gl.X3(ribVar.C);
                                                            ribVar.v();
                                                        } else {
                                                            int i9 = j;
                                                            while (true) {
                                                                int i10 = i9 + 1;
                                                                if (i10 >= r.length() || !rib.x(r.charAt(i10))) {
                                                                    break;
                                                                }
                                                                i9 = i10;
                                                            }
                                                            int abs = Math.abs(j - i6);
                                                            int abs2 = Math.abs(j - i9);
                                                            if (ribVar.y) {
                                                                ribVar.y = i >= 0;
                                                            }
                                                            int i11 = j - 1;
                                                            boolean z5 = i11 > 0 && rib.x(r.charAt(i11));
                                                            if (j >= r.length()) {
                                                                j = r.length();
                                                                charAt = '\n';
                                                            } else {
                                                                charAt = r.charAt(j);
                                                            }
                                                            if (ribVar.u >= r.length()) {
                                                                ribVar.u = r.length();
                                                                charAt2 = '\n';
                                                            } else {
                                                                charAt2 = r.charAt(ribVar.u);
                                                            }
                                                            int i12 = ribVar.u;
                                                            if ((j < i12 && abs < abs2) || ((j > i12 && i < 0) || !rib.x(charAt) || ((rib.x(charAt2) && !ribVar.y) || j == 0 || !z5 || charAt2 == '\n'))) {
                                                                if (!ribVar.y || j != 1) {
                                                                    if (j >= ribVar.u || !rib.x(charAt) || ((rib.x(charAt2) && !ribVar.y) || charAt2 == '\n')) {
                                                                        ribVar.u = j;
                                                                        i6 = j;
                                                                    } else {
                                                                        ribVar.u = i6;
                                                                        ribVar.y = true;
                                                                    }
                                                                    int i13 = ribVar.v;
                                                                    if (i6 > i13) {
                                                                        ribVar.v = i6;
                                                                        ribVar.u = i13;
                                                                        ribVar.j = false;
                                                                    }
                                                                    gl.X3(ribVar.C);
                                                                    ribVar.v();
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                ribVar.E();
                                            } else {
                                                if (j != ribVar.v && ribVar.b(j)) {
                                                    CharSequence r2 = ribVar.r(ribVar.W, false);
                                                    int i14 = j;
                                                    while (i14 < r2.length() && rib.x(r2.charAt(i14))) {
                                                        i14++;
                                                    }
                                                    ribVar.h(j, hi2Var, false);
                                                    Layout layout3 = (Layout) hi2Var.d;
                                                    ribVar.h(ribVar.v, hi2Var, false);
                                                    Layout layout4 = (Layout) hi2Var.d;
                                                    if (layout3 != null && layout4 != null) {
                                                        if (j > r2.length()) {
                                                            j = r2.length();
                                                        }
                                                        int lineForOffset4 = layout4.getLineForOffset(i14);
                                                        int lineForOffset5 = layout4.getLineForOffset(ribVar.v);
                                                        int lineForOffset6 = layout4.getLineForOffset(j);
                                                        if (O || layout3 != layout4 || (lineForOffset6 != layout4.getLineForOffset(ribVar.v) && lineForOffset6 == lineForOffset4)) {
                                                            ribVar.z(j, i14, O, ribVar.a0.b, f5, mibVar);
                                                            gl.X3(ribVar.C);
                                                            ribVar.v();
                                                        } else if (-1 == layout4.getParagraphDirection(layout4.getLineForOffset(j)) || layout4.isRtlCharAt(j) || lineForOffset5 != lineForOffset4 || lineForOffset6 != lineForOffset4) {
                                                            ribVar.v = j;
                                                            int i15 = ribVar.u;
                                                            if (i15 > j) {
                                                                ribVar.v = i15;
                                                                ribVar.u = j;
                                                                ribVar.j = true;
                                                            }
                                                            gl.X3(ribVar.C);
                                                            ribVar.v();
                                                        } else {
                                                            int i16 = j;
                                                            while (true) {
                                                                int i17 = i16 - 1;
                                                                if (i17 < 0 || !rib.x(r2.charAt(i17))) {
                                                                    break;
                                                                }
                                                                i16--;
                                                            }
                                                            int abs3 = Math.abs(j - i14);
                                                            int abs4 = Math.abs(j - i16);
                                                            int i18 = j - 1;
                                                            boolean z6 = i18 > 0 && rib.x(r2.charAt(i18));
                                                            if (ribVar.y) {
                                                                ribVar.y = i <= 0;
                                                            }
                                                            int i19 = ribVar.v;
                                                            if (i19 > 0 && rib.x(r2.charAt(i19 - 1))) {
                                                                z2 = true;
                                                            }
                                                            int i20 = ribVar.v;
                                                            if ((j > i20 && abs3 <= abs4) || ((j < i20 && i > 0) || !z6 || (z2 && !ribVar.y))) {
                                                                if (j <= i20 || !z6 || (z2 && !ribVar.y)) {
                                                                    ribVar.v = j;
                                                                    i14 = j;
                                                                } else {
                                                                    ribVar.v = i14;
                                                                    ribVar.y = true;
                                                                }
                                                                int i21 = ribVar.u;
                                                                if (i21 > i14) {
                                                                    ribVar.v = i21;
                                                                    ribVar.u = i14;
                                                                    ribVar.j = true;
                                                                }
                                                                gl.X3(ribVar.C);
                                                                ribVar.v();
                                                            }
                                                        }
                                                    }
                                                }
                                                ribVar.E();
                                            }
                                        }
                                        ribVar.T(ribVar.b0);
                                    }
                                }
                                z = false;
                                if (z4) {
                                }
                                if (!ribVar.N) {
                                }
                                ribVar.O = z4;
                                if (z4) {
                                }
                                i4 = (int) (f + f2);
                                j = ribVar.j(i5, i4, ribVar.a, ribVar.b, ribVar.W, false);
                                if (j >= 0) {
                                }
                                ribVar.T(ribVar.b0);
                            }
                        }
                        return true;
                    }
                }
                return ribVar.i;
            }
            ribVar.u();
            if (ribVar.i && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(false);
            }
            ribVar.i = false;
            ribVar.R = false;
            ribVar.k = false;
            if (ribVar.w()) {
                ribVar.C.invalidate();
                gl.r(kyaVar);
                gl.d3(kyaVar);
                ribVar.S();
            }
            if (ribVar.N) {
                ribVar.N = false;
                gl.r(bibVar);
            }
            return ribVar.i;
        }
        return false;
    }
}
