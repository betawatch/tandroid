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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class s2 extends FrameLayout implements org.telegram.ui.Components.oy0, org.telegram.ui.Cells.j9 {
    public final m60 a;
    public final f4 b;
    public final r2 c;
    public z2 d;
    public final org.telegram.ui.Components.py0 e;
    public int f;
    public int h;
    public int n;
    public boolean r;
    public TL_iv.pageBlockTable s;
    public final androidx.emoji2.text.n w;

    public s2(Context context, m60 m60Var, f4 f4Var) {
        super(context);
        this.w = new androidx.emoji2.text.n(this);
        this.a = m60Var;
        this.b = f4Var;
        r2 r2Var = new r2(this, context, m60Var);
        this.c = r2Var;
        float f7 = 18;
        r2Var.setPadding(org.telegram.messenger.i0.L(f7), 0, org.telegram.messenger.i0.L(f7), 0);
        r2Var.setClipToPadding(false);
        addView(r2Var, w7.b6.c(-2.0f, -1));
        org.telegram.ui.Components.py0 py0Var = new org.telegram.ui.Components.py0(context, this, ((h4) m60Var).P0);
        this.e = py0Var;
        py0Var.setOrientation(0);
        py0Var.setRowOrderPreserved(true);
        r2Var.addView(py0Var, new FrameLayout.LayoutParams(-2, -2));
        setWillNotDraw(false);
    }

    public final void a() {
        int i10 = this.d == null ? 0 : 1;
        org.telegram.ui.Components.py0 py0Var = this.e;
        int childCount = py0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            org.telegram.ui.Components.iy0 d = py0Var.d(i11);
            org.telegram.ui.Components.hy0 hy0Var = d.b;
            if (hy0Var != null) {
                hy0Var.j((org.telegram.messenger.i0.L(18.0f) + (d.b() + this.f)) - this.c.getScrollX());
                d.b.h(d.c() + this.h);
                d.b.g(d.j + 10);
                d.r = i10;
                i10++;
            }
        }
    }

    @Override // org.telegram.ui.Components.oy0
    public final org.telegram.ui.Components.hy0 c(TL_iv.pageTableCell pagetablecell, int i10) {
        if (pagetablecell == null) {
            return null;
        }
        return h4.n(this.a, this, null, pagetablecell.text, i10, -1, this.s, pagetablecell.align_right ? Layout.Alignment.ALIGN_OPPOSITE : pagetablecell.align_center ? Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_NORMAL, 0, this.b);
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

    @Override // org.telegram.ui.Components.oy0
    public final void g(org.telegram.ui.Components.hy0 hy0Var, int i10) {
        if (!(hy0Var instanceof z2)) {
            return;
        }
        m60 m60Var = this.a;
        if (m60Var.E.isEmpty() || m60Var.F == null) {
            return;
        }
        z2 z2Var = (z2) hy0Var;
        String lowerCase = z2Var.d.getText().toString().toLowerCase();
        int i11 = 0;
        while (true) {
            int indexOf = lowerCase.indexOf(m60Var.F, i11);
            if (indexOf < 0) {
                return;
            }
            int length = m60Var.F.length() + indexOf;
            if (indexOf == 0 || org.telegram.messenger.i0.K1(lowerCase.charAt(indexOf - 1))) {
                HashMap hashMap = this.b.D;
                String str = m60Var.F + this.s + z2Var.r + indexOf;
                StaticLayout staticLayout = z2Var.d;
                hashMap.put(str, Integer.valueOf(staticLayout.getLineTop(staticLayout.getLineForOffset(indexOf)) + i10));
            }
            i11 = length;
        }
    }

    public Paint getHalfLinePaint() {
        return h4.u1;
    }

    @Override // org.telegram.ui.Components.oy0
    public Paint getHeaderPaint() {
        return h4.v1;
    }

    @Override // org.telegram.ui.Components.oy0
    public Paint getLinePaint() {
        return h4.t1;
    }

    @Override // org.telegram.ui.Components.oy0
    public Paint getStripPaint() {
        return h4.w1;
    }

    @Override // org.telegram.ui.Cells.j9
    public final void h(ArrayList arrayList) {
        z2 z2Var = this.d;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
        org.telegram.ui.Components.py0 py0Var = this.e;
        int childCount = py0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            org.telegram.ui.Components.hy0 hy0Var = py0Var.d(i10).b;
            if (hy0Var != null) {
                arrayList.add(hy0Var);
            }
        }
    }

    @Override // android.view.View, org.telegram.ui.Cells.r9
    public final void invalidate() {
        super.invalidate();
        this.e.invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.d;
        if (z2Var != null) {
            z2Var.i(this);
        }
        org.telegram.ui.Components.py0 py0Var = this.e;
        int childCount = py0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            org.telegram.ui.Components.hy0 hy0Var = py0Var.d(i10).b;
            if (hy0Var != null) {
                hy0Var.i(this);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.d;
        if (z2Var != null) {
            z2Var.f(this);
        }
        org.telegram.ui.Components.py0 py0Var = this.e;
        int childCount = py0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            org.telegram.ui.Components.hy0 hy0Var = py0Var.d(i10).b;
            if (hy0Var != null) {
                hy0Var.f(this);
            }
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.s == null) {
            return;
        }
        z2 z2Var = this.d;
        m60 m60Var = this.a;
        if (z2Var != null) {
            canvas.save();
            canvas.translate(this.n, 0);
            h4.t(m60Var, canvas, this, 0);
            this.d.d(canvas, this);
            canvas.restore();
        }
        h4.s(canvas, m60Var, this.s, getMeasuredHeight());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(org.telegram.messenger.cd.L0(2131754855, null));
        if (this.d != null) {
            sb2.append(", ");
            sb2.append(this.d.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = this.f;
        int i15 = this.h;
        r2 r2Var = this.c;
        r2Var.layout(i14, i15, r2Var.getMeasuredWidth() + i14, r2Var.getMeasuredHeight() + this.h);
        if (this.r) {
            f4 f4Var = this.b;
            if (f4Var == null || !f4Var.G) {
                r2Var.setScrollX(0);
            } else {
                r2Var.setScrollX(org.telegram.messenger.i0.L(36.0f) + (this.e.getMeasuredWidth() - r2Var.getMeasuredWidth()));
            }
            this.r = false;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int L;
        int i13;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockTable pageblocktable = this.s;
        if (pageblocktable != null) {
            int i14 = pageblocktable.level;
            m60 m60Var = this.a;
            if (i14 > 0) {
                int L2 = org.telegram.messenger.i0.L(i14 * 14);
                this.f = L2;
                m60Var.getClass();
                int L3 = org.telegram.messenger.i0.L(18) + L2;
                this.n = L3;
                L = size - L3;
            } else {
                this.f = 0;
                m60Var.getClass();
                this.n = org.telegram.messenger.i0.L(18);
                L = size - org.telegram.messenger.i0.L(36);
            }
            int i15 = L;
            TL_iv.pageBlockTable pageblocktable2 = this.s;
            z2 n10 = h4.n(this.a, this, null, pageblocktable2.title, i15, 0, pageblocktable2, Layout.Alignment.ALIGN_CENTER, 0, this.b);
            this.d = n10;
            if (n10 != null) {
                i13 = org.telegram.messenger.i0.L(8.0f) + n10.d.getHeight();
                this.h = i13;
                z2 z2Var = this.d;
                z2Var.s = this.n;
                z2Var.w = 0;
            } else {
                this.h = org.telegram.messenger.i0.L(8.0f);
                i13 = 0;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - this.f, TLObject.FLAG_30);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            r2 r2Var = this.c;
            r2Var.measure(makeMeasureSpec, makeMeasureSpec2);
            i12 = org.telegram.messenger.m5.C(8.0f, r2Var.getMeasuredHeight(), i13);
            TL_iv.pageBlockTable pageblocktable3 = this.s;
            if (pageblocktable3.level > 0 && !pageblocktable3.bottom) {
                i12 += org.telegram.messenger.i0.L(8.0f);
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
        a();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        org.telegram.ui.Components.py0 py0Var = this.e;
        int childCount = py0Var.getChildCount();
        int i10 = 0;
        while (i10 < childCount) {
            org.telegram.ui.Components.iy0 d = py0Var.d(i10);
            org.telegram.ui.Components.hy0 hy0Var = d.b;
            if (hy0Var instanceof z2) {
                z2 z2Var = (z2) hy0Var;
                r2 r2Var = this.c;
                MotionEvent motionEvent3 = motionEvent;
                motionEvent2 = motionEvent3;
                if (h4.j(this.a, this.b, motionEvent3, this, z2Var, d.b() + (r2Var.getPaddingLeft() - r2Var.getScrollX()) + this.f, d.c() + this.h)) {
                    return true;
                }
            } else {
                motionEvent2 = motionEvent;
            }
            i10++;
            motionEvent = motionEvent2;
        }
        MotionEvent motionEvent4 = motionEvent;
        return h4.j(this.a, this.b, motionEvent4, this, this.d, this.n, 0) || super.onTouchEvent(motionEvent4);
    }

    public void setBlock(TL_iv.pageBlockTable pageblocktable) {
        int i10;
        this.s = pageblocktable;
        int i11 = org.telegram.ui.ActionBar.t6.d6;
        ((h4) this.a).getClass();
        org.telegram.messenger.i0.z3(this.c, org.telegram.ui.ActionBar.t6.x0(null, i11, false));
        org.telegram.ui.Components.py0 py0Var = this.e;
        py0Var.P.clear();
        py0Var.K.clear();
        py0Var.h();
        py0Var.setDrawLines(this.s.bordered);
        py0Var.setStriped(this.s.striped);
        f4 f4Var = this.b;
        py0Var.setRtl(f4Var != null && f4Var.G);
        if (this.s.rows.isEmpty()) {
            i10 = 0;
        } else {
            TL_iv.pageTableRow pagetablerow = this.s.rows.get(0);
            int size = pagetablerow.cells.size();
            i10 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int i13 = pagetablerow.cells.get(i12).colspan;
                if (i13 == 0) {
                    i13 = 1;
                }
                i10 += i13;
            }
        }
        int size2 = this.s.rows.size();
        for (int i14 = 0; i14 < size2; i14++) {
            TL_iv.pageTableRow pagetablerow2 = this.s.rows.get(i14);
            int size3 = pagetablerow2.cells.size();
            int i15 = 0;
            for (int i16 = 0; i16 < size3; i16++) {
                TL_iv.pageTableCell pagetablecell = pagetablerow2.cells.get(i16);
                int i17 = pagetablecell.colspan;
                if (i17 == 0) {
                    i17 = 1;
                }
                int i18 = pagetablecell.rowspan;
                if (i18 == 0) {
                    i18 = 1;
                }
                if (pagetablecell.text != null) {
                    py0Var.b(pagetablecell, i15, i14, i17);
                } else {
                    py0Var.a(i15, i14, i17, i18);
                }
                i15 += i17;
            }
        }
        py0Var.setColumnCount(i10);
        this.r = true;
        requestLayout();
    }
}
