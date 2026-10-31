package zg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.TextPaint;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import org.telegram.messenger.i0;
import org.telegram.messenger.jj;
import org.telegram.messenger.tz;
import org.telegram.messenger.v2;
import org.telegram.messenger.vp;
import org.telegram.messenger.z1;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.s0;
import org.telegram.ui.vj;
import w7.u;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class d extends View implements ViewTreeObserver.OnPreDrawListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {
    public static final RectF H = new RectF();
    public final b D;
    public ViewTreeObserver E;
    public boolean F;
    public TextPaint G;
    public final boolean a;
    public final RectF b;
    public final RectF c;
    public long d;
    public int e;
    public ViewGroup f;
    public ViewGroup h;
    public long n;
    public b r;
    public long s;
    public final ArrayList w;
    public final LongSparseArray x;
    public final LongSparseArray y;

    public d(Context context) {
        super(context);
        this.b = new RectF();
        this.c = new RectF();
        this.w = new ArrayList();
        this.x = new LongSparseArray();
        this.y = new LongSparseArray();
        this.D = new b(this, 1);
        this.a = tz.g1;
    }

    public final void a() {
        b bVar = this.r;
        if (bVar != null) {
            i0.r(bVar);
            this.r = null;
        }
        ArrayList arrayList = this.w;
        if (arrayList.isEmpty()) {
            return;
        }
        TLRPC.TL_messages_reportReadMetrics tL_messages_reportReadMetrics = new TLRPC.TL_messages_reportReadMetrics();
        tL_messages_reportReadMetrics.peer = vp.r1(this.e).i1(this.d);
        tL_messages_reportReadMetrics.metrics = new ArrayList<>(arrayList);
        ConnectionsManager.getInstance(this.e).sendRequestTyped(tL_messages_reportReadMetrics, null, new z1(5));
        arrayList.clear();
    }

    public final void b(int i10, long j10, ViewGroup viewGroup, vj vjVar) {
        this.d = j10;
        this.e = i10;
        this.f = viewGroup;
        this.h = vjVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02c4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        String str;
        LongSparseArray longSparseArray;
        ArrayList arrayList;
        boolean z10;
        long j10;
        String str2;
        LongSparseArray longSparseArray2;
        boolean z11;
        LongSparseArray longSparseArray3;
        boolean z12;
        RectF rectF;
        jj messageObject;
        int i10;
        RectF rectF2;
        long j11;
        if (this.f == null || this.h == null) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        long j12 = this.s;
        long j13 = 0;
        long j14 = j12 == 0 ? 0L : uptimeMillis - j12;
        this.s = uptimeMillis;
        LongSparseArray longSparseArray4 = this.y;
        int size = longSparseArray4.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((RectF) longSparseArray4.valueAt(i11)).set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        int childCount = this.h.getChildCount();
        int i12 = 0;
        while (true) {
            str = "ViewMetrics";
            longSparseArray = this.x;
            if (i12 >= childCount) {
                break;
            }
            View childAt = this.h.getChildAt(i12);
            long j15 = j13;
            ViewGroup viewGroup = this.f;
            RectF rectF3 = H;
            if (h.c(childAt, viewGroup, rectF3)) {
                if (childAt instanceof q1) {
                    messageObject = ((q1) childAt).getMessageObject();
                } else if (childAt instanceof s0) {
                    messageObject = ((s0) childAt).getMessageObject();
                }
                if (messageObject != null) {
                    long B0 = jj.B0(messageObject.k);
                    i10 = i12;
                    if (B0 == this.d) {
                        int f12 = messageObject.f1();
                        long d12 = messageObject.d1();
                        if (B0 != j15 && f12 > 0) {
                            long j16 = f12;
                            c cVar = (c) longSparseArray.get(j16);
                            if (cVar == null) {
                                rectF2 = rectF3;
                                j11 = d12;
                                cVar = new c(f12, j11);
                                longSparseArray.put(j16, cVar);
                                if (v2.a) {
                                    Log.d("ViewMetrics", f12 + " " + j11 + " in screen");
                                }
                            } else {
                                rectF2 = rectF3;
                                j11 = d12;
                            }
                            RectF rectF4 = cVar.c;
                            rectF4.set(rectF2);
                            if (j11 != j15) {
                                RectF rectF5 = (RectF) longSparseArray4.get(j11);
                                if (rectF5 == null) {
                                    rectF5 = new RectF();
                                    longSparseArray4.put(j11, rectF5);
                                }
                                rectF5.union(rectF4);
                            }
                            cVar.e = uptimeMillis;
                        }
                    }
                    i12 = i10 + 1;
                    j13 = j15;
                }
            }
            i10 = i12;
            i12 = i10 + 1;
            j13 = j15;
        }
        long j17 = j13;
        for (int size2 = longSparseArray4.size() - 1; size2 >= 0; size2--) {
            if (((RectF) longSparseArray4.valueAt(size2)).isEmpty()) {
                longSparseArray4.removeAt(size2);
            }
        }
        int size3 = longSparseArray.size();
        for (int i13 = 0; i13 < size3; i13++) {
            c cVar2 = (c) longSparseArray.valueAt(i13);
            long j18 = cVar2.b;
            if (j18 != j17 && (rectF = (RectF) longSparseArray4.get(j18)) != null) {
                cVar2.c.set(rectF);
            }
        }
        int size4 = longSparseArray.size() - 1;
        while (true) {
            arrayList = this.w;
            if (size4 < 0) {
                break;
            }
            c cVar3 = (c) longSparseArray.valueAt(size4);
            int i14 = cVar3.a;
            LongSparseArray longSparseArray5 = longSparseArray4;
            long j19 = cVar3.b;
            RectF rectF6 = cVar3.c;
            long j20 = j14;
            long j21 = i14;
            RectF rectF7 = j19 != j17 ? (RectF) longSparseArray5.get(j19) : null;
            long j22 = cVar3.e;
            RectF rectF8 = this.c;
            if (j22 == uptimeMillis || rectF7 != null) {
                if (RectF.intersects(rectF8, rectF7 != null ? rectF7 : rectF6)) {
                    z10 = true;
                    if (z10) {
                        j10 = uptimeMillis;
                        str2 = str;
                        longSparseArray2 = longSparseArray;
                        z11 = true;
                    } else {
                        String str3 = str;
                        longSparseArray2 = longSparseArray;
                        if (cVar3.f != j17) {
                            cVar3.g += j20;
                            if (uptimeMillis - this.n < 15000) {
                                cVar3.h += j20;
                            }
                        }
                        cVar3.f = uptimeMillis;
                        float height = rectF6.height();
                        j10 = uptimeMillis;
                        float f7 = rectF8.top - rectF6.top;
                        float f10 = height - (rectF6.bottom - rectF8.bottom);
                        cVar3.l = Math.min(cVar3.l, u.a(f7, 0.0f, height));
                        cVar3.m = Math.max(cVar3.m, u.a(f10, 0.0f, height));
                        cVar3.k = Math.max(cVar3.k, rectF8.height());
                        cVar3.j = Math.max(cVar3.j, height);
                        if (cVar3.i || cVar3.g <= 300) {
                            str2 = str3;
                            z11 = true;
                        } else {
                            if (v2.a) {
                                str2 = str3;
                                Log.d(str2, j21 + " " + j19 + " in viewport");
                            } else {
                                str2 = str3;
                            }
                            z11 = true;
                            cVar3.i = true;
                        }
                    }
                    if (!z10 || cVar3.g <= j17 || j10 - 300 <= cVar3.f) {
                        longSparseArray3 = longSparseArray2;
                        z12 = cVar3.i;
                        if (!z12 && cVar3.g > 300000) {
                            arrayList.add(cVar3.a());
                            longSparseArray3.removeAt(size4);
                            if (v2.a) {
                                Log.d(str2, j21 + " " + j19 + " out of time");
                            }
                        } else if (!z12 && cVar3.e != j10 && (j19 == j17 || rectF7 == null)) {
                            longSparseArray3.removeAt(size4);
                            if (!v2.a) {
                                Log.d(str2, j21 + " " + j19 + " out of screen");
                            }
                        }
                    } else {
                        if (cVar3.i) {
                            arrayList.add(cVar3.a());
                        }
                        longSparseArray3 = longSparseArray2;
                        longSparseArray3.removeAt(size4);
                        if (v2.a) {
                            Log.d(str2, j21 + " " + j19 + " out of viewport: " + cVar3.g);
                        }
                    }
                    size4--;
                    str = str2;
                    longSparseArray = longSparseArray3;
                    j14 = j20;
                    longSparseArray4 = longSparseArray5;
                    uptimeMillis = j10;
                }
            }
            z10 = false;
            if (z10) {
            }
            if (z10) {
            }
            longSparseArray3 = longSparseArray2;
            z12 = cVar3.i;
            if (!z12) {
            }
            if (!z12) {
                longSparseArray3.removeAt(size4);
                if (!v2.a) {
                }
            }
            size4--;
            str = str2;
            longSparseArray = longSparseArray3;
            j14 = j20;
            longSparseArray4 = longSparseArray5;
            uptimeMillis = j10;
        }
        if (!arrayList.isEmpty() && this.r == null) {
            b bVar = new b(this, 0);
            this.r = bVar;
            i0.h3(bVar, 5000L);
        }
        if (this.a) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.s = 0L;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        this.E = viewTreeObserver;
        viewTreeObserver.addOnPreDrawListener(this);
        this.E.addOnGlobalLayoutListener(this);
        this.E.addOnScrollChangedListener(this);
        i0.h3(this.D, 400L);
        if (v2.a) {
            Log.d("ViewMetrics", "attach");
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        ViewTreeObserver viewTreeObserver = this.E;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            this.E.removeOnPreDrawListener(this);
            this.E.removeOnGlobalLayoutListener(this);
            this.E.removeOnScrollChangedListener(this);
        }
        this.E = null;
        this.s = 0L;
        i0.r(this.D);
        if (v2.a) {
            Log.d("ViewMetrics", "detach");
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.a) {
            if (this.G == null) {
                TextPaint textPaint = new TextPaint(1);
                this.G = textPaint;
                textPaint.setColor(-16776961);
                this.G.setTextSize(i0.L(10.0f));
            }
            super.onDraw(canvas);
            Paint paint = t6.Fm;
            RectF rectF = this.c;
            canvas.drawRect(rectF, paint);
            LongSparseArray longSparseArray = this.x;
            int size = longSparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                c cVar = (c) longSparseArray.valueAt(i10);
                RectF rectF2 = cVar.c;
                canvas.drawRect(rectF2, t6.Gm);
                canvas.save();
                canvas.translate(rectF2.left, u.a(u.a(rectF2.centerY() - i0.L(20.0f), rectF.top - i0.L(40.0f), rectF.bottom), rectF2.top, rectF2.bottom - i0.L(40.0f)));
                canvas.drawRect(0.0f, 0.0f, rectF2.width(), i0.L(40.0f), t6.Em);
                canvas.translate(i0.L(10.0f), i0.L(16.0f));
                canvas.save();
                canvas.drawText("time_in_view_ms: " + cVar.g, 0.0f, 0.0f, this.G);
                canvas.translate(0.0f, (float) i0.L(16.0f));
                canvas.drawText("active_time_in_view_ms: " + cVar.h, 0.0f, 0.0f, this.G);
                canvas.restore();
                canvas.save();
                canvas.translate(getWidth() / 2.0f, 0.0f);
                StringBuilder sb2 = new StringBuilder("height_to_viewport_ratio_permille: ");
                float f7 = cVar.k;
                sb2.append(f7 == 0.0f ? 1000 : Math.round((cVar.j / f7) * 1000.0f));
                canvas.drawText(sb2.toString(), 0.0f, 0.0f, this.G);
                canvas.translate(0.0f, i0.L(16.0f));
                canvas.drawText("seen_range_ratio_permille: " + cVar.b(), 0.0f, 0.0f, this.G);
                canvas.restore();
                canvas.restore();
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.F = true;
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        RectF rectF = this.b;
        this.c.set(rectF.left, rectF.top, getMeasuredWidth() - rectF.right, getMeasuredHeight() - rectF.bottom);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        if (!this.F) {
            return true;
        }
        c();
        this.F = false;
        return true;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        this.F = true;
    }
}
