package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.StaticLayout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class t2 extends FrameLayout implements org.telegram.ui.Components.kx0, org.telegram.ui.Cells.g9 {
    public final i50 a;
    public final g4 b;
    public final s2 c;
    public a3 d;
    public final org.telegram.ui.Components.lx0 e;
    public int f;
    public int h;
    public int n;
    public boolean r;
    public TL_iv.pageBlockTable s;
    public final androidx.emoji2.text.o w;

    public t2(Context context, i50 i50Var, g4 g4Var) {
        super(context);
        this.w = new androidx.emoji2.text.o(this);
        this.a = i50Var;
        this.b = g4Var;
        s2 s2Var = new s2(this, context, i50Var);
        this.c = s2Var;
        float f10 = 18;
        s2Var.setPadding(org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(f10), 0);
        s2Var.setClipToPadding(false);
        addView(s2Var, b8.mf.c(-2.0f, -1));
        org.telegram.ui.Components.lx0 lx0Var = new org.telegram.ui.Components.lx0(context, this, ((i4) i50Var).Q0);
        this.e = lx0Var;
        lx0Var.setOrientation(0);
        lx0Var.setRowOrderPreserved(true);
        s2Var.addView(lx0Var, new FrameLayout.LayoutParams(-2, -2));
        setWillNotDraw(false);
    }

    public final void a() {
        int i3 = this.d == null ? 0 : 1;
        org.telegram.ui.Components.lx0 lx0Var = this.e;
        int childCount = lx0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            org.telegram.ui.Components.ex0 d = lx0Var.d(i10);
            org.telegram.ui.Components.dx0 dx0Var = d.b;
            if (dx0Var != null) {
                dx0Var.j((org.telegram.messenger.g0.L(18.0f) + (d.b() + this.f)) - this.c.getScrollX());
                d.b.h(d.c() + this.h);
                d.b.g(d.j + 10);
                d.r = i3;
                i3++;
            }
        }
    }

    @Override // org.telegram.ui.Components.kx0
    public final org.telegram.ui.Components.dx0 c(TL_iv.pageTableCell pagetablecell, int i3) {
        if (pagetablecell == null) {
            return null;
        }
        return i4.n(this.a, this, null, pagetablecell.text, i3, -1, this.s, pagetablecell.align_right ? Layout.Alignment.ALIGN_OPPOSITE : pagetablecell.align_center ? Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_NORMAL, 0, this.b);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.a.getClass();
        } else if (actionMasked != 2 && (actionMasked == 1 || actionMasked == 3)) {
            removeCallbacks(this.w);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.kx0
    public final void g(org.telegram.ui.Components.dx0 dx0Var, int i3) {
        if (!(dx0Var instanceof a3)) {
            return;
        }
        i50 i50Var = this.a;
        if (i50Var.F.isEmpty() || i50Var.G == null) {
            return;
        }
        a3 a3Var = (a3) dx0Var;
        String lowerCase = a3Var.d.getText().toString().toLowerCase();
        int i10 = 0;
        while (true) {
            int indexOf = lowerCase.indexOf(i50Var.G, i10);
            if (indexOf < 0) {
                return;
            }
            int length = i50Var.G.length() + indexOf;
            if (indexOf == 0 || org.telegram.messenger.g0.K1(lowerCase.charAt(indexOf - 1))) {
                HashMap hashMap = this.b.E;
                String str = i50Var.G + this.s + a3Var.r + indexOf;
                StaticLayout staticLayout = a3Var.d;
                hashMap.put(str, Integer.valueOf(staticLayout.getLineTop(staticLayout.getLineForOffset(indexOf)) + i3));
            }
            i10 = length;
        }
    }

    public Paint getHalfLinePaint() {
        return i4.v1;
    }

    @Override // org.telegram.ui.Components.kx0
    public Paint getHeaderPaint() {
        return i4.w1;
    }

    @Override // org.telegram.ui.Components.kx0
    public Paint getLinePaint() {
        return i4.u1;
    }

    @Override // org.telegram.ui.Components.kx0
    public Paint getStripPaint() {
        return i4.x1;
    }

    @Override // android.view.View, org.telegram.ui.Cells.p9
    public final void invalidate() {
        super.invalidate();
        this.e.invalidate();
    }

    @Override // org.telegram.ui.Cells.g9
    public final void k(ArrayList arrayList) {
        a3 a3Var = this.d;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
        org.telegram.ui.Components.lx0 lx0Var = this.e;
        int childCount = lx0Var.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            org.telegram.ui.Components.dx0 dx0Var = lx0Var.d(i3).b;
            if (dx0Var != null) {
                arrayList.add(dx0Var);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.d;
        if (a3Var != null) {
            a3Var.i(this);
        }
        org.telegram.ui.Components.lx0 lx0Var = this.e;
        int childCount = lx0Var.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            org.telegram.ui.Components.dx0 dx0Var = lx0Var.d(i3).b;
            if (dx0Var != null) {
                dx0Var.i(this);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.d;
        if (a3Var != null) {
            a3Var.f(this);
        }
        org.telegram.ui.Components.lx0 lx0Var = this.e;
        int childCount = lx0Var.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            org.telegram.ui.Components.dx0 dx0Var = lx0Var.d(i3).b;
            if (dx0Var != null) {
                dx0Var.f(this);
            }
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.s == null) {
            return;
        }
        a3 a3Var = this.d;
        i50 i50Var = this.a;
        if (a3Var != null) {
            canvas.save();
            canvas.translate(this.n, 0);
            i4.t(i50Var, canvas, this, 0);
            this.d.d(canvas, this);
            canvas.restore();
        }
        i4.s(canvas, i50Var, this.s, getMeasuredHeight());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(org.telegram.messenger.bd.M0(2131754855, null));
        if (this.d != null) {
            sb2.append(", ");
            sb2.append(this.d.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int i13 = this.f;
        int i14 = this.h;
        s2 s2Var = this.c;
        s2Var.layout(i13, i14, s2Var.getMeasuredWidth() + i13, s2Var.getMeasuredHeight() + this.h);
        if (this.r) {
            g4 g4Var = this.b;
            if (g4Var == null || !g4Var.H) {
                s2Var.setScrollX(0);
            } else {
                s2Var.setScrollX(org.telegram.messenger.g0.L(36.0f) + (this.e.getMeasuredWidth() - s2Var.getMeasuredWidth()));
            }
            this.r = false;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        int i11;
        int L;
        int i12;
        int size = View.MeasureSpec.getSize(i3);
        TL_iv.pageBlockTable pageblocktable = this.s;
        if (pageblocktable != null) {
            int i13 = pageblocktable.level;
            i50 i50Var = this.a;
            if (i13 > 0) {
                int L2 = org.telegram.messenger.g0.L(i13 * 14);
                this.f = L2;
                i50Var.getClass();
                int L3 = org.telegram.messenger.g0.L(18) + L2;
                this.n = L3;
                L = size - L3;
            } else {
                this.f = 0;
                i50Var.getClass();
                this.n = org.telegram.messenger.g0.L(18);
                L = size - org.telegram.messenger.g0.L(36);
            }
            int i14 = L;
            TL_iv.pageBlockTable pageblocktable2 = this.s;
            a3 n4 = i4.n(this.a, this, null, pageblocktable2.title, i14, 0, pageblocktable2, Layout.Alignment.ALIGN_CENTER, 0, this.b);
            this.d = n4;
            if (n4 != null) {
                i12 = org.telegram.messenger.g0.L(8.0f) + n4.d.getHeight();
                this.h = i12;
                a3 a3Var = this.d;
                a3Var.s = this.n;
                a3Var.w = 0;
            } else {
                this.h = org.telegram.messenger.g0.L(8.0f);
                i12 = 0;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - this.f, TLObject.FLAG_30);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            s2 s2Var = this.c;
            s2Var.measure(makeMeasureSpec, makeMeasureSpec2);
            i11 = org.telegram.messenger.k5.C(8.0f, s2Var.getMeasuredHeight(), i12);
            TL_iv.pageBlockTable pageblocktable3 = this.s;
            if (pageblocktable3.level > 0 && !pageblocktable3.bottom) {
                i11 += org.telegram.messenger.g0.L(8.0f);
            }
        } else {
            i11 = 1;
        }
        setMeasuredDimension(size, i11);
        a();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        org.telegram.ui.Components.lx0 lx0Var = this.e;
        int childCount = lx0Var.getChildCount();
        int i3 = 0;
        while (i3 < childCount) {
            org.telegram.ui.Components.ex0 d = lx0Var.d(i3);
            org.telegram.ui.Components.dx0 dx0Var = d.b;
            if (dx0Var instanceof a3) {
                a3 a3Var = (a3) dx0Var;
                s2 s2Var = this.c;
                MotionEvent motionEvent3 = motionEvent;
                motionEvent2 = motionEvent3;
                if (i4.j(this.a, this.b, motionEvent3, this, a3Var, d.b() + (s2Var.getPaddingLeft() - s2Var.getScrollX()) + this.f, d.c() + this.h)) {
                    return true;
                }
            } else {
                motionEvent2 = motionEvent;
            }
            i3++;
            motionEvent = motionEvent2;
        }
        MotionEvent motionEvent4 = motionEvent;
        return i4.j(this.a, this.b, motionEvent4, this, this.d, this.n, 0) || super.onTouchEvent(motionEvent4);
    }

    public void setBlock(TL_iv.pageBlockTable pageblocktable) {
        int i3;
        this.s = pageblocktable;
        int i10 = org.telegram.ui.ActionBar.k6.d6;
        ((i4) this.a).getClass();
        org.telegram.messenger.g0.A3(this.c, org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        org.telegram.ui.Components.lx0 lx0Var = this.e;
        lx0Var.Q.clear();
        lx0Var.L.clear();
        lx0Var.h();
        lx0Var.setDrawLines(this.s.bordered);
        lx0Var.setStriped(this.s.striped);
        g4 g4Var = this.b;
        lx0Var.setRtl(g4Var != null && g4Var.H);
        if (this.s.rows.isEmpty()) {
            i3 = 0;
        } else {
            TL_iv.pageTableRow pagetablerow = this.s.rows.get(0);
            int size = pagetablerow.cells.size();
            i3 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                int i12 = pagetablerow.cells.get(i11).colspan;
                if (i12 == 0) {
                    i12 = 1;
                }
                i3 += i12;
            }
        }
        int size2 = this.s.rows.size();
        for (int i13 = 0; i13 < size2; i13++) {
            TL_iv.pageTableRow pagetablerow2 = this.s.rows.get(i13);
            int size3 = pagetablerow2.cells.size();
            int i14 = 0;
            for (int i15 = 0; i15 < size3; i15++) {
                TL_iv.pageTableCell pagetablecell = pagetablerow2.cells.get(i15);
                int i16 = pagetablecell.colspan;
                if (i16 == 0) {
                    i16 = 1;
                }
                int i17 = pagetablecell.rowspan;
                if (i17 == 0) {
                    i17 = 1;
                }
                if (pagetablecell.text != null) {
                    lx0Var.b(pagetablecell, i14, i13, i16);
                } else {
                    lx0Var.a(i14, i13, i16, i17);
                }
                i14 += i16;
            }
        }
        lx0Var.setColumnCount(i3);
        this.r = true;
        requestLayout();
    }
}
