package xh;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.style.ForegroundColorSpan;
import android.view.Choreographer;
import android.view.View;
import android.widget.TextView;
import c8.j9;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.f6;
import org.telegram.messenger.g0;
import org.telegram.messenger.iz;
import org.telegram.messenger.qs;
import org.telegram.messenger.sc;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.i2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.z;
import org.telegram.ui.Components.pt0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.vy0;
import org.telegram.ui.Components.yo;
import org.telegram.ui.s81;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class f extends Drawable {
    public static final int A;
    public static final int B;
    public static final float[] C;
    public static final float[][] D;
    public static final Path E;
    public static Paint F;
    public static WeakHashMap G;
    public final Paint[] a;
    public final float[] b;
    public final Stack c;
    public int d;
    public final float[] e;
    public final int[] f;
    public RectF g;
    public final ArrayList h;
    public View i;
    public long j;
    public float k;
    public float l;
    public float m;
    public float n;
    public boolean o;
    public boolean p;
    public Runnable q;
    public ValueAnimator r;
    public int s;
    public TimeInterpolator t;
    public boolean u;
    public PorterDuffColorFilter v;
    public int w;
    public int x;
    public boolean y;
    public final RectF z;

    static {
        int i7 = iz.o() != 2 ? 100 : qs.g2;
        A = i7;
        B = iz.o() != 2 ? 10 : 30;
        float[] fArr = {0.3f, 0.6f, 1.0f};
        C = fArr;
        D = (float[][]) Array.newInstance((Class<?>) Float.TYPE, fArr.length, i7 * 5);
        E = new Path();
    }

    public f() {
        float[] fArr = C;
        this.a = new Paint[fArr.length];
        this.b = new float[fArr.length];
        this.c = new Stack();
        this.e = new float[14];
        this.f = new int[fArr.length];
        this.h = new ArrayList();
        this.n = -1.0f;
        this.s = qs.e4;
        this.t = new qc(1);
        this.z = new RectF();
        for (int i7 = 0; i7 < fArr.length; i7++) {
            this.a[i7] = new Paint();
            if (i7 == 0) {
                this.a[i7].setStrokeWidth(g0.L(1.4f));
                this.a[i7].setStyle(Paint.Style.STROKE);
                this.a[i7].setStrokeCap(Paint.Cap.ROUND);
            } else {
                this.a[i7].setStrokeWidth(g0.L(1.2f));
                this.a[i7].setStyle(Paint.Style.STROKE);
                this.a[i7].setStrokeCap(Paint.Cap.ROUND);
            }
            this.b[i7] = this.a[i7].getStrokeWidth() * 0.5f;
        }
        iz.o();
        h(0);
    }

    public static void a(View view, Layout layout, int i7, int i10, Spanned spanned, Stack stack, List list, ArrayList arrayList) {
        int i11;
        int i12;
        if (layout == null) {
            return;
        }
        vy0[] vy0VarArr = (vy0[]) spanned.getSpans(0, layout.getText().length(), vy0.class);
        for (int i13 = 0; i13 < Math.min(100, vy0VarArr.length); i13++) {
            if (vy0VarArr[i13].c()) {
                int spanStart = spanned.getSpanStart(vy0VarArr[i13]);
                int spanEnd = spanned.getSpanEnd(vy0VarArr[i13]);
                if (i7 == -1 && i10 == -1) {
                    int lineForOffset = layout.getLineForOffset(spanEnd);
                    int i14 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    int i15 = TLObject.FLAG_31;
                    for (int lineForOffset2 = layout.getLineForOffset(spanStart); lineForOffset2 <= lineForOffset; lineForOffset2++) {
                        i14 = Math.min(i14, (int) layout.getLineLeft(lineForOffset2));
                        i15 = Math.max(i15, (int) layout.getLineRight(lineForOffset2));
                    }
                    i11 = i14;
                    i12 = i15;
                } else {
                    i11 = i7;
                    i12 = i10;
                }
                layout.getSelectionPath(spanStart, spanEnd, new a(view, layout, stack, list, i11, i12, arrayList));
            }
        }
        if (!(view instanceof TextView) || stack == null) {
            return;
        }
        stack.clear();
    }

    public static void b(View view, Layout layout, int i7, int i10, Stack stack, List list) {
        if (layout.getText() instanceof Spanned) {
            a(view, layout, i7, i10, (Spanned) layout.getText(), stack, list, null);
        }
    }

    public static void c(View view, Layout layout, Stack stack, ArrayList arrayList) {
        if (layout.getText() instanceof Spanned) {
            a(view, layout, -1, -1, (Spanned) layout.getText(), stack, arrayList, null);
        }
    }

    public static void d(Canvas canvas, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        Path path = E;
        path.rewind();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            Rect bounds = ((f) arrayList.get(i7)).getBounds();
            path.addRect(bounds.left, bounds.top, bounds.right, bounds.bottom, Path.Direction.CW);
        }
        canvas.clipPath(path, Region.Op.DIFFERENCE);
    }

    public static void f(Canvas canvas, Layout layout) {
        if (!(canvas instanceof pt0)) {
            layout.draw(canvas);
            return;
        }
        int alpha = layout.getPaint().getAlpha();
        layout.getPaint().setAlpha((int) (alpha * 0.4f));
        if (G == null) {
            G = new WeakHashMap();
        }
        ArrayList arrayList = (ArrayList) G.get(layout);
        if (arrayList == null) {
            arrayList = new ArrayList();
            int lineCount = layout.getLineCount();
            for (int i7 = 0; i7 < lineCount; i7++) {
                arrayList.add(new RectF(layout.getLineLeft(i7), layout.getLineTop(i7), layout.getLineRight(i7), layout.getLineBottom(i7)));
            }
            G.put(layout, arrayList);
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            canvas.drawRect((RectF) arrayList.get(i10), layout.getPaint());
        }
        layout.getPaint().setAlpha(alpha);
    }

    public static void g(View view, boolean z9, int i7, int i10, AtomicReference atomicReference, int i11, Layout layout, List list, Canvas canvas, boolean z10) {
        StaticLayout staticLayout;
        AtomicReference atomicReference2;
        vy0[] vy0VarArr;
        int i12;
        if (list == null || list.isEmpty()) {
            f(canvas, layout);
            return;
        }
        Layout layout2 = (Layout) atomicReference.get();
        int i13 = 0;
        if (layout2 == null || !layout.getText().toString().equals(layout2.getText().toString()) || layout.getWidth() != layout2.getWidth() || layout.getHeight() != layout2.getHeight()) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(layout.getText());
            if (layout.getText() instanceof Spanned) {
                Spanned spanned = (Spanned) layout.getText();
                vy0[] vy0VarArr2 = (vy0[]) spanned.getSpans(0, spanned.length(), vy0.class);
                int i14 = 0;
                while (i14 < Math.min(100, vy0VarArr2.length)) {
                    vy0 vy0Var = vy0VarArr2[i14];
                    if (vy0Var.c()) {
                        int spanStart = spanned.getSpanStart(vy0Var);
                        int spanEnd = spanned.getSpanEnd(vy0Var);
                        f6[] f6VarArr = (f6[]) spanned.getSpans(spanStart, spanEnd, f6.class);
                        int length = f6VarArr.length;
                        while (i13 < length) {
                            vy0[] vy0VarArr3 = vy0VarArr2;
                            f6 f6Var = f6VarArr[i13];
                            spannableStringBuilder.setSpan(new yo(f6Var, 4), spanned.getSpanStart(f6Var), spanned.getSpanEnd(f6Var), spanned.getSpanFlags(vy0Var));
                            spannableStringBuilder.removeSpan(f6Var);
                            i13++;
                            vy0VarArr2 = vy0VarArr3;
                            i14 = i14;
                            length = length;
                            f6VarArr = f6VarArr;
                        }
                        vy0VarArr = vy0VarArr2;
                        i12 = i14;
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(0), spanStart, spanEnd, spanned.getSpanFlags(vy0Var));
                        spannableStringBuilder.removeSpan(vy0Var);
                    } else {
                        vy0VarArr = vy0VarArr2;
                        i12 = i14;
                    }
                    i14 = i12 + 1;
                    vy0VarArr2 = vy0VarArr;
                    i13 = 0;
                }
            }
            if (i11 == 1) {
                staticLayout = new StaticLayout(spannableStringBuilder, layout.getPaint(), layout.getWidth(), Layout.Alignment.ALIGN_CENTER, 1.0f, g0.L(1.66f), false);
            } else if (Build.VERSION.SDK_INT >= 24) {
                layout2 = StaticLayout.Builder.obtain(spannableStringBuilder, 0, spannableStringBuilder.length(), layout.getPaint(), layout.getWidth()).setBreakStrategy(1).setHyphenationFrequency(0).setAlignment(layout.getAlignment()).setLineSpacing(layout.getSpacingAdd(), layout.getSpacingMultiplier()).build();
                atomicReference2 = atomicReference;
                atomicReference2.set(layout2);
            } else {
                staticLayout = new StaticLayout(spannableStringBuilder, layout.getPaint(), layout.getWidth(), layout.getAlignment(), layout.getSpacingMultiplier(), layout.getSpacingAdd(), false);
            }
            atomicReference2 = atomicReference;
            layout2 = staticLayout;
            atomicReference2.set(layout2);
        }
        if (list.isEmpty()) {
            f(canvas, layout);
        } else {
            canvas.save();
            canvas.translate(0.0f, i10);
            layout2.draw(canvas);
            canvas.restore();
        }
        if (list.isEmpty()) {
            return;
        }
        Path path = E;
        path.rewind();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Rect bounds = ((f) it.next()).getBounds();
            path.addRect(bounds.left, bounds.top, bounds.right, bounds.bottom, Path.Direction.CW);
        }
        int i15 = 0;
        if (!list.isEmpty() && ((f) list.get(0)).n != -1.0f) {
            canvas.save();
            canvas.clipPath(path);
            path.rewind();
            if (!list.isEmpty()) {
                ((f) list.get(0)).e(path);
            }
            canvas.clipPath(path);
            canvas.translate(0.0f, -view.getPaddingTop());
            f(canvas, layout);
            canvas.restore();
            i15 = 0;
        }
        boolean z11 = ((f) list.get(i15)).n != -1.0f;
        if (z11) {
            int measuredWidth = view.getMeasuredWidth();
            if (z10 && (view.getParent() instanceof View)) {
                measuredWidth = ((View) view.getParent()).getMeasuredWidth();
            }
            canvas.saveLayer(0.0f, 0.0f, measuredWidth, view.getMeasuredHeight(), null, 31);
        } else {
            canvas.save();
        }
        canvas.translate(0.0f, -view.getPaddingTop());
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            f fVar = (f) it2.next();
            fVar.u = z9;
            if (fVar.i != view) {
                fVar.i = view;
            }
            boolean z12 = fVar.p;
            fVar.p = false;
            if (z12) {
                fVar.h(i0.a.f(Math.max(0.0f, fVar.n), i7, (i11 == 1 ? layout.getPaint() : k6.o2).getColor()));
            } else {
                fVar.h(i7);
            }
            fVar.draw(canvas);
        }
        if (z11) {
            path.rewind();
            ((f) list.get(0)).e(path);
            if (F == null) {
                Paint paint = new Paint(1);
                F = paint;
                paint.setColor(-16777216);
                F.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            canvas.drawPath(path, F);
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i7;
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            return;
        }
        if (h.q == null) {
            h.q = new h();
        }
        h hVar = h.q;
        int i10 = hVar.k;
        v6.e[] eVarArr = hVar.c;
        if (eVarArr[0] == null) {
            eVarArr[0] = new v6.e(i10);
            hVar.g = new Paint();
            hVar.i = new ArrayList(100);
            float f10 = i10;
            int i11 = (int) (f10 / 10.0f);
            int L = (int) ((f10 / g0.L(200.0f)) * 60.0f);
            int i12 = 0;
            while (true) {
                if (i12 >= 10) {
                    break;
                }
                int i13 = 0;
                for (int i14 = 10; i13 < i14; i14 = 10) {
                    f fVar = new f();
                    fVar.x = i10;
                    int i15 = i11 * i12;
                    int i16 = i11 * i13;
                    fVar.setBounds(i15, i16 - g0.L(5.0f), g0.L(3.0f) + i15 + i11, g0.L(5.0f) + i16 + i11);
                    int min = Math.min(A * 5, L);
                    fVar.d = min;
                    while (true) {
                        Stack stack = fVar.c;
                        if (fVar.h.size() + stack.size() < min) {
                            stack.push(new b());
                        }
                    }
                    fVar.h(-1);
                    hVar.i.add(fVar);
                    i13++;
                }
                i12++;
            }
            i7 = 128;
            hVar.a(new Canvas((Bitmap) eVarArr[0].a), new Rect(0, 0, i10, i10));
            hVar.g.setShader((BitmapShader) eVarArr[0].b);
            hVar.h = System.currentTimeMillis();
        } else {
            i7 = 128;
            if (hVar.p && !sc.e(128)) {
                hVar.d = 0;
                hVar.a(new Canvas((Bitmap) eVarArr[0].a), new Rect(0, 0, i10, i10));
                hVar.g.setShader((BitmapShader) eVarArr[0].b);
                hVar.h = System.currentTimeMillis();
                hVar.p = false;
            }
        }
        Paint paint = hVar.g;
        paint.setColorFilter(this.v);
        canvas.drawRect(bounds, paint);
        if (sc.e(i7)) {
            bg.k d = bg.k.d();
            d.getClass();
            bg.k.c();
            d.c.add(this);
            if (h.q == null) {
                h.q = new h();
            }
            h hVar2 = h.q;
            hVar2.getClass();
            int i17 = bounds.left;
            int i18 = hVar2.k;
            int i19 = ((i17 % i18) + i18) % i18;
            int i20 = ((bounds.top % i18) + i18) % i18;
            int min2 = Math.min(bounds.width(), i18) + i19;
            int min3 = Math.min(bounds.height(), i18) + i20;
            Rect rect = hVar2.m;
            rect.union(i19, i20, Math.min(min2, i18), Math.min(min3, i18));
            if (min2 > i18) {
                rect.union(0, i20, min2 - i18, Math.min(min3, i18));
            }
            if (min3 > i18) {
                rect.union(i19, 0, Math.min(min2, i18), min3 - i18);
            }
            if (min2 > i18 && min3 > i18) {
                rect.union(0, 0, min2 - i18, min3 - i18);
            }
            if (hVar2.l || rect.isEmpty()) {
                return;
            }
            hVar2.l = true;
            Choreographer.getInstance().postFrameCallback(hVar2.n);
        }
    }

    public final void e(Path path) {
        path.addCircle(this.k, this.l, j9.a(this.n, 0.0f, 1.0f) * this.m, Path.Direction.CW);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    public final void h(int i7) {
        if (this.w == i7) {
            return;
        }
        int i10 = 0;
        while (true) {
            float[] fArr = C;
            if (i10 >= fArr.length) {
                this.v = new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN);
                this.w = i7;
                return;
            } else {
                this.a[i10].setColor(i0.a.o(i7, (int) (this.s * fArr[i10])));
                i10++;
            }
        }
    }

    public final void i(float f10, float f11, float f12) {
        if (this.g == null) {
            this.g = new RectF();
        }
        RectF rectF = this.g;
        if (rectF.left == 0.0f && rectF.right == f11 && rectF.top == f10 && rectF.bottom == f12) {
            return;
        }
        rectF.left = 0.0f;
        rectF.top = f10;
        rectF.right = f11;
        rectF.bottom = f12;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        super.invalidateSelf();
        View view = this.i;
        if (view != null) {
            if (view.getParent() != null && this.u) {
                ((View) view.getParent()).invalidate();
            } else if (view instanceof z) {
                ((z) view).p();
            } else {
                view.invalidate();
            }
        }
    }

    public final void j(float f10, float f11, float f12, boolean z9) {
        this.k = f10;
        this.l = f11;
        this.m = f12;
        this.n = z9 ? 1.0f : 0.0f;
        this.o = z9;
        ValueAnimator valueAnimator = this.r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int alpha = this.o ? qs.e4 : this.a[C.length - 1].getAlpha();
        ValueAnimator duration = ValueAnimator.ofFloat(this.n, z9 ? 0.0f : 1.0f).setDuration((long) j9.a(this.m * 0.3f, 250.0f, 550.0f));
        this.r = duration;
        duration.setInterpolator(this.t);
        this.r.addUpdateListener(new i2(this, alpha, 6));
        this.r.addListener(new s81(this, 24));
        this.r.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        RectF rectF = this.z;
        rectF.set(rect);
        rectF.inset(0.0f, g0.L(2.5f));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        this.s = i7;
        int i10 = 0;
        while (true) {
            float[] fArr = C;
            if (i10 >= fArr.length) {
                return;
            }
            this.a[i10].setAlpha((int) (fArr[i10] * i7));
            i10++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i7, int i10, int i11, int i12) {
        super.setBounds(i7, i10, i11, i12);
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (!getBounds().contains((int) bVar.a, (int) bVar.b)) {
                it.remove();
            }
            Stack stack = this.c;
            if (stack.size() < this.d) {
                stack.push(bVar);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        for (Paint paint : this.a) {
            paint.setColorFilter(colorFilter);
        }
    }
}
