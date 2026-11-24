// default package

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import j$.util.Objects;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class ww9 extends ScrollView implements vi5 {
    public boolean E;
    public float[] F;
    public int G;
    public float[] H;
    public int I;
    public boolean J;
    public ArrayList K;
    public final kf9 L;
    public final ArrayList M;
    public final ArrayList N;
    public final ylb a;
    public final t1 b;
    public final float c;
    public final Paint d;
    public final Paint e;
    public final Paint f;
    public final Rect h;
    public final RectF n;
    public final RectF r;
    public final Matrix s;
    public Bitmap w;
    public int x;
    public int y;

    public ww9(Context context, t1 t1Var, ylb ylbVar, boolean z) {
        super(context);
        this.c = gm.L(16.0f);
        this.d = new Paint();
        this.e = new Paint();
        this.f = new Paint(3);
        this.h = new Rect();
        this.n = new RectF();
        this.r = new RectF();
        this.s = new Matrix();
        this.F = new float[80];
        this.H = new float[32];
        this.L = new kf9(this, (byte) 25);
        this.M = new ArrayList();
        this.N = new ArrayList();
        this.a = ylbVar;
        this.b = t1Var;
        setWillNotDraw(false);
        t1Var.setPadding(gm.L(12.0f), gm.L(z ? 12.0f : 4.0f), gm.L(12.0f), gm.L(12.0f));
    }

    private void setOverscrolling(boolean z) {
        if (this.J != z) {
            this.J = z;
            invalidate();
            ArrayList arrayList = this.K;
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ny4 ny4Var = (ny4) this.K.get(size);
                    if (ny4Var.a != z) {
                        ny4Var.a = z;
                        sy4 sy4Var = ny4Var.b;
                        sy4Var.h++;
                        sy4Var.j += z ? 1 : -1;
                    }
                }
            }
        }
    }

    @Override // vi5
    public final void a(ucb ucbVar, RectF rectF) {
        ucbVar.b = true;
    }

    public final void b(View view, View view2) {
        if (view == null || view2 == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        ViewParent parent = view.getParent();
        float f = 0.0f;
        t1 t1Var = this.b;
        float f2 = (parent == t1Var || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) ? 0.0f : ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        float f3 = (view2.getParent() == t1Var || !(layoutParams2 instanceof ViewGroup.MarginLayoutParams)) ? 0.0f : ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
        View view3 = view2;
        while ((view3.getParent() instanceof ViewGroup) && view3.getParent() != t1Var) {
            ViewGroup viewGroup = (ViewGroup) view3.getParent();
            int childCount = viewGroup.getChildCount() - 1;
            while (true) {
                if (childCount >= 0) {
                    View childAt = viewGroup.getChildAt(childCount);
                    if (childAt.getVisibility() != 8) {
                        if (childAt != view3) {
                            break;
                        }
                    } else {
                        childCount--;
                    }
                }
            }
            f += viewGroup.getPaddingBottom();
            view3 = viewGroup;
        }
        float f4 = f3 + f;
        float i = i(view) + t1Var.getX();
        float j = (j(view) + t1Var.getY()) - f2;
        float width = view.getWidth() + i;
        float j2 = j(view2) + t1Var.getY() + view2.getHeight() + f4;
        if (width <= i || j2 <= j) {
            return;
        }
        int i2 = this.G;
        int i3 = i2 + 5;
        float[] fArr = this.F;
        if (i3 > fArr.length) {
            float[] fArr2 = new float[fArr.length << 1];
            System.arraycopy(fArr, 0, fArr2, 0, i2);
            this.F = fArr2;
            fArr = fArr2;
        }
        int i4 = this.G;
        int i5 = i4 + 1;
        this.G = i5;
        fArr[i4] = i;
        int i6 = i4 + 2;
        this.G = i6;
        fArr[i5] = j;
        int i7 = i4 + 3;
        this.G = i7;
        fArr[i6] = width;
        int i8 = i4 + 4;
        this.G = i8;
        fArr[i7] = j2;
        this.G = i4 + 5;
        fArr[i8] = view.getAlpha();
    }

    public final void c() {
        int i = 0;
        this.G = 0;
        ArrayList arrayList = this.N;
        arrayList.clear();
        h(this.b, 0.0f, 0.0f);
        int size = arrayList.size();
        while (true) {
            View view = null;
            View view2 = null;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                View view3 = (View) obj;
                if (Objects.equals(view3.getTag(), -33024) || (view3 instanceof njb) || (view3 instanceof bba) || (view3 instanceof ih4)) {
                    b(view, view2);
                } else {
                    if (view != null && Math.abs(view2.getAlpha() - view3.getAlpha()) > 0.1f) {
                        b(view, view2);
                        view = null;
                    }
                    if (view == null) {
                        view = view3;
                    }
                    view2 = view3;
                }
            }
            b(view, view2);
            return;
        }
    }

    public final void d(Canvas canvas, int i, float f, float f2, float f3, float f4, RectF rectF) {
        if (rectF.intersects(f, f2, f3, f4)) {
            int i2 = (i & 1) == 0 ? 0 : this.x;
            int i3 = i >= 2 ? this.x : 0;
            int i4 = this.x;
            Rect rect = this.h;
            rect.set(i2, i3, i2 + i4, i4 + i3);
            RectF rectF2 = this.n;
            rectF2.set(f, f2, f3, f4);
            canvas.drawBitmap(this.w, rect, rectF2, this.f);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        boolean z;
        int p = on2.p(cmb.v0(cmb.Z6, this.a), nm7.d4);
        Paint paint = this.d;
        paint.setColor(p);
        if (this.y != p) {
            this.y = p;
            this.w = null;
        }
        c();
        if (this.E) {
            float scrollX = getScrollX();
            float scrollY = getScrollY();
            float width = scrollX + getWidth();
            float height = getHeight() + scrollY;
            t1 t1Var = this.b;
            float f4 = mlb.f(t1Var.getX(), t1Var.getPaddingLeft(), width, scrollX);
            float max = Math.max(f4, Math.min(width, (t1Var.getX() + t1Var.getWidth()) - t1Var.getPaddingRight()));
            boolean z2 = false;
            this.I = 0;
            for (int i = 0; i < this.G; i += 5) {
                float max2 = Math.max(scrollY, this.F[i + 1]);
                float min = Math.min(height, this.F[i + 3]);
                if (min > max2) {
                    int i2 = this.I;
                    int i3 = i2 + 2;
                    float[] fArr = this.H;
                    if (i3 > fArr.length) {
                        float[] fArr2 = new float[fArr.length << 1];
                        System.arraycopy(fArr, 0, fArr2, 0, i2);
                        this.H = fArr2;
                        fArr = fArr2;
                    }
                    int i4 = this.I;
                    int i5 = i4 + 1;
                    this.I = i5;
                    fArr[i4] = max2;
                    this.I = i4 + 2;
                    fArr[i5] = min;
                }
            }
            for (int i6 = 2; i6 < this.I; i6 += 2) {
                float[] fArr3 = this.H;
                float f5 = fArr3[i6];
                float f6 = fArr3[i6 + 1];
                int i7 = i6 - 2;
                while (i7 >= 0) {
                    float[] fArr4 = this.H;
                    float f7 = fArr4[i7];
                    if (f7 > f5) {
                        fArr4[i7 + 2] = f7;
                        fArr4[i7 + 3] = fArr4[i7 + 1];
                        i7 -= 2;
                    }
                }
                float[] fArr5 = this.H;
                fArr5[i7 + 2] = f5;
                fArr5[i7 + 3] = f6;
            }
            int i8 = 0;
            int i9 = 0;
            while (i8 < this.I) {
                float[] fArr6 = this.H;
                float f8 = fArr6[i8];
                float f9 = fArr6[i8 + 1];
                if (i9 > 0) {
                    int i10 = i9 - 1;
                    z = z2;
                    float f10 = fArr6[i10];
                    if (f8 <= 1.0f + f10) {
                        fArr6[i10] = Math.max(f10, f9);
                        i8 += 2;
                        z2 = z;
                    }
                } else {
                    z = z2;
                }
                int i11 = i9 + 1;
                fArr6[i9] = f8;
                i9 += 2;
                fArr6[i11] = f9;
                i8 += 2;
                z2 = z;
            }
            boolean z3 = z2;
            this.I = i9;
            if (i9 == 0 || f4 >= max) {
                canvas.drawRect(scrollX, scrollY, width, height, paint);
            } else {
                float[] fArr7 = this.H;
                float f11 = fArr7[z3 ? 1 : 0];
                float f12 = fArr7[i9 - 1];
                if (f11 > scrollY) {
                    canvas.drawRect(scrollX, scrollY, width, Math.min(height, f11 + 1.0f), paint);
                }
                if (f12 < height) {
                    canvas.drawRect(scrollX, Math.max(scrollY, f12 - 1.0f), width, height, paint);
                    f = height;
                } else {
                    f = height;
                }
                float max3 = Math.max(scrollY, f11);
                float min2 = Math.min(f, f12);
                if (min2 > max3) {
                    canvas.drawRect(scrollX, max3, Math.min(width, f4 + 1.0f), min2, paint);
                    canvas.drawRect(Math.max(scrollX, max - 1.0f), max3, width, min2, paint);
                }
                int i12 = 2;
                while (i12 < this.I) {
                    float[] fArr8 = this.H;
                    float f13 = fArr8[i12 - 1];
                    float f14 = fArr8[i12];
                    if (f14 > f13) {
                        f2 = f4;
                        f3 = max;
                        canvas.drawRect(f2, Math.max(scrollY, f13 - 1.0f), f3, Math.min(f, f14 + 1.0f), paint);
                    } else {
                        f2 = f4;
                        f3 = max;
                    }
                    i12 += 2;
                    f4 = f2;
                    max = f3;
                }
            }
            f(canvas);
        } else {
            f(canvas);
        }
        super.dispatchDraw(canvas);
        float scrollX2 = getScrollX();
        float scrollY2 = getScrollY();
        float width2 = getWidth() + getScrollX();
        float height2 = getHeight() + getScrollY();
        RectF rectF = this.r;
        rectF.set(scrollX2, scrollY2, width2, height2);
        e(canvas, rectF);
    }

    public final void e(Canvas canvas, RectF rectF) {
        if (this.G != 0) {
            float f = this.c;
            if (f > 0.0f) {
                int max = Math.max(1, (int) Math.ceil(f));
                if (this.w == null || this.x != max) {
                    this.x = max;
                    int i = max << 1;
                    this.w = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(this.w);
                    canvas2.drawColor(this.d.getColor());
                    Paint paint = new Paint(1);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    float f2 = max;
                    canvas2.drawCircle(f2, f2, f, paint);
                }
                for (int i2 = 0; i2 < this.G; i2 += 5) {
                    float[] fArr = this.F;
                    float f3 = fArr[i2];
                    float f4 = fArr[i2 + 1];
                    float f5 = fArr[i2 + 2];
                    float f6 = fArr[i2 + 3];
                    float f7 = this.x;
                    d(canvas, 0, f3, f4, f3 + f7, f4 + f7, rectF);
                    float f8 = this.x;
                    d(canvas, 1, f5 - f8, f4, f5, f4 + f8, rectF);
                    float f9 = this.x;
                    d(canvas, 2, f3, f6 - f9, f3 + f9, f6, rectF);
                    float f10 = this.x;
                    d(canvas, 3, f5 - f10, f6 - f10, f5, f6, rectF);
                }
            }
        }
    }

    public final void f(Canvas canvas) {
        float scrollX = getScrollX();
        float scrollY = getScrollY();
        float width = getWidth() + getScrollX();
        float height = getHeight() + getScrollY();
        RectF rectF = this.r;
        rectF.set(scrollX, scrollY, width, height);
        for (int i = 0; i < this.G; i += 5) {
            float[] fArr = this.F;
            int i2 = i + 1;
            int i3 = i + 2;
            int i4 = i + 3;
            if (rectF.intersects(fArr[i], fArr[i2], fArr[i3], fArr[i4])) {
                float f = this.F[i + 4];
                int v0 = cmb.v0(cmb.c6, this.a);
                int round = Math.round(Math.max(0.0f, Math.min(1.0f, f)) * Color.alpha(v0));
                int p = !this.E ? on2.p(v0, round) : on2.l(on2.p(v0, round), this.d.getColor());
                Paint paint = this.e;
                paint.setColor(p);
                float[] fArr2 = this.F;
                canvas.drawRect(fArr2[i], fArr2[i2], fArr2[i3], fArr2[i4], paint);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x013b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x013f, code lost:
    
        throw r0;
     */
    @Override // vi5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(Canvas canvas, RectF rectF) {
        RectF rectF2 = this.n;
        Paint paint = this.e;
        Matrix matrix = this.s;
        t1 t1Var = this.b;
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.J && getOverScrollMode() != 2) {
            canvas.save();
            try {
                canvas.clipRect(rectF);
                if (getMatrix().invert(matrix)) {
                    canvas.concat(matrix);
                }
                canvas.translate(-getX(), -getY());
                try {
                    super.drawChild(canvas, this, uptimeMillis);
                } catch (Throwable th) {
                    fc4.g(th, true);
                }
                return;
            } finally {
            }
        }
        int i = cmb.Z6;
        ylb ylbVar = this.a;
        int p = on2.p(cmb.v0(i, ylbVar), nm7.d4);
        this.d.setColor(p);
        if (this.y != p) {
            this.y = p;
            this.w = null;
        }
        float scrollX = getScrollX();
        float scrollY = getScrollY();
        RectF rectF3 = this.r;
        rectF3.set(rectF);
        rectF3.offset(scrollX, scrollY);
        c();
        int v0 = cmb.v0(cmb.c6, ylbVar);
        canvas.save();
        try {
            canvas.clipRect(rectF);
            canvas.translate(-scrollX, -scrollY);
            for (int i2 = 0; i2 < this.G; i2 += 5) {
                float[] fArr = this.F;
                int i3 = i2 + 1;
                int i4 = i2 + 2;
                int i5 = i2 + 3;
                if (rectF3.intersects(fArr[i2], fArr[i3], fArr[i4], fArr[i5])) {
                    paint.setColor(on2.p(v0, Math.round(Color.alpha(v0) * Math.max(0.0f, Math.min(1.0f, this.F[i2 + 4])))));
                    float[] fArr2 = this.F;
                    rectF2.set(fArr2[i2], fArr2[i3], fArr2[i4], fArr2[i5]);
                    float f = this.c;
                    canvas.drawRoundRect(rectF2, f, f, paint);
                }
            }
            canvas.save();
            canvas.translate(t1Var.getX(), t1Var.getY());
            float x = t1Var.getX();
            float y = t1Var.getY();
            for (int i6 = 0; i6 < t1Var.getChildCount(); i6++) {
                View childAt = t1Var.getChildAt(i6);
                if (childAt.getVisibility() == 0) {
                    float x2 = childAt.getX() + x;
                    float y2 = childAt.getY() + y;
                    if (rectF3.intersects(x2, y2, childAt.getWidth() + x2, childAt.getHeight() + y2)) {
                        t1Var.drawChild(canvas, childAt, uptimeMillis);
                    }
                }
            }
            canvas.restore();
            e(canvas, rectF3);
        } finally {
        }
    }

    public final void h(LinearLayout linearLayout, float f, float f2) {
        for (int i = 0; i < linearLayout.getChildCount(); i++) {
            View childAt = linearLayout.getChildAt(i);
            if (childAt.getVisibility() == 0) {
                if (childAt instanceof LinearLayout) {
                    LinearLayout linearLayout2 = (LinearLayout) childAt;
                    if (linearLayout2.getOrientation() == 1) {
                        float x = childAt.getX() + f;
                        t1 t1Var = this.b;
                        if (x <= t1Var.getPaddingLeft() && childAt.getX() + f + childAt.getWidth() >= t1Var.getWidth() - t1Var.getPaddingRight()) {
                            h(linearLayout2, childAt.getX() + f, childAt.getY() + f2);
                        }
                    }
                }
                this.N.add(childAt);
            }
        }
    }

    public final float i(View view) {
        if (view == this.b) {
            return 0.0f;
        }
        if (!(view.getParent() instanceof View)) {
            return view.getX();
        }
        return view.getX() + i((View) view.getParent());
    }

    public final float j(View view) {
        if (view == this.b) {
            return 0.0f;
        }
        if (!(view.getParent() instanceof View)) {
            return view.getY();
        }
        return view.getY() + j((View) view.getParent());
    }

    public final /* synthetic */ void k() {
        setOverscrolling(false);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.L);
        setOverscrolling(false);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        ArrayList arrayList = this.M;
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            ((Runnable) obj).run();
        }
        invalidate();
        this.b.invalidate();
    }

    @Override // android.view.View
    public final boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        long j = i4 + i2;
        if (getOverScrollMode() != 2 && (j < 0 || j > i6)) {
            setOverscrolling(true);
            kf9 kf9Var = this.L;
            removeCallbacks(kf9Var);
            postDelayed(kf9Var, 500L);
        }
        return super.overScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z);
    }

    public void setDrawBackground(boolean z) {
        if (this.E == z) {
            return;
        }
        this.E = z;
        invalidate();
    }
}
