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

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class s2 extends FrameLayout implements org.telegram.ui.Components.lx0, org.telegram.ui.Cells.h9 {
    public final o50 a;
    public final e4 b;
    public final r2 c;
    public z2 d;
    public final org.telegram.ui.Components.mx0 e;
    public int f;
    public int h;
    public int n;
    public boolean r;
    public TL_iv.pageBlockTable s;
    public final androidx.emoji2.text.n w;

    public s2(Context context, o50 o50Var, e4 e4Var) {
        super(context);
        this.w = new androidx.emoji2.text.n(this);
        this.a = o50Var;
        this.b = e4Var;
        r2 r2Var = new r2(this, context, o50Var);
        this.c = r2Var;
        float f10 = 18;
        r2Var.setPadding(org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(f10), 0);
        r2Var.setClipToPadding(false);
        addView(r2Var, c8.ha.c(-2.0f, -1));
        org.telegram.ui.Components.mx0 mx0Var = new org.telegram.ui.Components.mx0(context, this, ((g4) o50Var).P0);
        this.e = mx0Var;
        mx0Var.setOrientation(0);
        mx0Var.setRowOrderPreserved(true);
        r2Var.addView(mx0Var, new FrameLayout.LayoutParams(-2, -2));
        setWillNotDraw(false);
    }

    public final void a() {
        int i7 = this.d == null ? 0 : 1;
        org.telegram.ui.Components.mx0 mx0Var = this.e;
        int childCount = mx0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            org.telegram.ui.Components.fx0 d = mx0Var.d(i10);
            org.telegram.ui.Components.ex0 ex0Var = d.b;
            if (ex0Var != null) {
                ex0Var.j((org.telegram.messenger.g0.L(18.0f) + (d.b() + this.f)) - this.c.getScrollX());
                d.b.h(d.c() + this.h);
                d.b.g(d.j + 10);
                d.r = i7;
                i7++;
            }
        }
    }

    @Override // org.telegram.ui.Components.lx0
    public final org.telegram.ui.Components.ex0 c(TL_iv.pageTableCell pagetablecell, int i7) {
        if (pagetablecell == null) {
            return null;
        }
        return g4.n(this.a, this, null, pagetablecell.text, i7, -1, this.s, pagetablecell.align_right ? Layout.Alignment.ALIGN_OPPOSITE : pagetablecell.align_center ? Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_NORMAL, 0, this.b);
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

    @Override // org.telegram.ui.Components.lx0
    public final void g(org.telegram.ui.Components.ex0 ex0Var, int i7) {
        if (!(ex0Var instanceof z2)) {
            return;
        }
        o50 o50Var = this.a;
        if (o50Var.E.isEmpty() || o50Var.F == null) {
            return;
        }
        z2 z2Var = (z2) ex0Var;
        String lowerCase = z2Var.d.getText().toString().toLowerCase();
        int i10 = 0;
        while (true) {
            int indexOf = lowerCase.indexOf(o50Var.F, i10);
            if (indexOf < 0) {
                return;
            }
            int length = o50Var.F.length() + indexOf;
            if (indexOf == 0 || org.telegram.messenger.g0.K1(lowerCase.charAt(indexOf - 1))) {
                HashMap hashMap = this.b.D;
                String str = o50Var.F + this.s + z2Var.r + indexOf;
                StaticLayout staticLayout = z2Var.d;
                hashMap.put(str, Integer.valueOf(staticLayout.getLineTop(staticLayout.getLineForOffset(indexOf)) + i7));
            }
            i10 = length;
        }
    }

    public Paint getHalfLinePaint() {
        return g4.u1;
    }

    @Override // org.telegram.ui.Components.lx0
    public Paint getHeaderPaint() {
        return g4.v1;
    }

    @Override // org.telegram.ui.Components.lx0
    public Paint getLinePaint() {
        return g4.t1;
    }

    @Override // org.telegram.ui.Components.lx0
    public Paint getStripPaint() {
        return g4.w1;
    }

    @Override // android.view.View, org.telegram.ui.Cells.q9
    public final void invalidate() {
        super.invalidate();
        this.e.invalidate();
    }

    @Override // org.telegram.ui.Cells.h9
    public final void k(ArrayList arrayList) {
        z2 z2Var = this.d;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
        org.telegram.ui.Components.mx0 mx0Var = this.e;
        int childCount = mx0Var.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            org.telegram.ui.Components.ex0 ex0Var = mx0Var.d(i7).b;
            if (ex0Var != null) {
                arrayList.add(ex0Var);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.d;
        if (z2Var != null) {
            z2Var.i(this);
        }
        org.telegram.ui.Components.mx0 mx0Var = this.e;
        int childCount = mx0Var.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            org.telegram.ui.Components.ex0 ex0Var = mx0Var.d(i7).b;
            if (ex0Var != null) {
                ex0Var.i(this);
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
        org.telegram.ui.Components.mx0 mx0Var = this.e;
        int childCount = mx0Var.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            org.telegram.ui.Components.ex0 ex0Var = mx0Var.d(i7).b;
            if (ex0Var != null) {
                ex0Var.f(this);
            }
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.s == null) {
            return;
        }
        z2 z2Var = this.d;
        o50 o50Var = this.a;
        if (z2Var != null) {
            canvas.save();
            canvas.translate(this.n, 0);
            g4.t(o50Var, canvas, this, 0);
            this.d.d(canvas, this);
            canvas.restore();
        }
        g4.s(canvas, o50Var, this.s, getMeasuredHeight());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(org.telegram.messenger.id.M0(2131754855, null));
        if (this.d != null) {
            sb2.append(", ");
            sb2.append(this.d.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13 = this.f;
        int i14 = this.h;
        r2 r2Var = this.c;
        r2Var.layout(i13, i14, r2Var.getMeasuredWidth() + i13, r2Var.getMeasuredHeight() + this.h);
        if (this.r) {
            e4 e4Var = this.b;
            if (e4Var == null || !e4Var.G) {
                r2Var.setScrollX(0);
            } else {
                r2Var.setScrollX(org.telegram.messenger.g0.L(36.0f) + (this.e.getMeasuredWidth() - r2Var.getMeasuredWidth()));
            }
            this.r = false;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11;
        int L;
        int i12;
        int size = View.MeasureSpec.getSize(i7);
        TL_iv.pageBlockTable pageblocktable = this.s;
        if (pageblocktable != null) {
            int i13 = pageblocktable.level;
            o50 o50Var = this.a;
            if (i13 > 0) {
                int L2 = org.telegram.messenger.g0.L(i13 * 14);
                this.f = L2;
                o50Var.getClass();
                int L3 = org.telegram.messenger.g0.L(18) + L2;
                this.n = L3;
                L = size - L3;
            } else {
                this.f = 0;
                o50Var.getClass();
                this.n = org.telegram.messenger.g0.L(18);
                L = size - org.telegram.messenger.g0.L(36);
            }
            int i14 = L;
            TL_iv.pageBlockTable pageblocktable2 = this.s;
            z2 n10 = g4.n(this.a, this, null, pageblocktable2.title, i14, 0, pageblocktable2, Layout.Alignment.ALIGN_CENTER, 0, this.b);
            this.d = n10;
            if (n10 != null) {
                i12 = org.telegram.messenger.g0.L(8.0f) + n10.d.getHeight();
                this.h = i12;
                z2 z2Var = this.d;
                z2Var.s = this.n;
                z2Var.w = 0;
            } else {
                this.h = org.telegram.messenger.g0.L(8.0f);
                i12 = 0;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - this.f, TLObject.FLAG_30);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            r2 r2Var = this.c;
            r2Var.measure(makeMeasureSpec, makeMeasureSpec2);
            i11 = org.telegram.messenger.k5.C(8.0f, r2Var.getMeasuredHeight(), i12);
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
        org.telegram.ui.Components.mx0 mx0Var = this.e;
        int childCount = mx0Var.getChildCount();
        int i7 = 0;
        while (i7 < childCount) {
            org.telegram.ui.Components.fx0 d = mx0Var.d(i7);
            org.telegram.ui.Components.ex0 ex0Var = d.b;
            if (ex0Var instanceof z2) {
                z2 z2Var = (z2) ex0Var;
                r2 r2Var = this.c;
                MotionEvent motionEvent3 = motionEvent;
                motionEvent2 = motionEvent3;
                if (g4.j(this.a, this.b, motionEvent3, this, z2Var, d.b() + (r2Var.getPaddingLeft() - r2Var.getScrollX()) + this.f, d.c() + this.h)) {
                    return true;
                }
            } else {
                motionEvent2 = motionEvent;
            }
            i7++;
            motionEvent = motionEvent2;
        }
        MotionEvent motionEvent4 = motionEvent;
        return g4.j(this.a, this.b, motionEvent4, this, this.d, this.n, 0) || super.onTouchEvent(motionEvent4);
    }

    public void setBlock(TL_iv.pageBlockTable pageblocktable) {
        int i7;
        this.s = pageblocktable;
        int i10 = org.telegram.ui.ActionBar.k6.d6;
        ((g4) this.a).getClass();
        org.telegram.messenger.g0.A3(this.c, org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        org.telegram.ui.Components.mx0 mx0Var = this.e;
        mx0Var.P.clear();
        mx0Var.K.clear();
        mx0Var.h();
        mx0Var.setDrawLines(this.s.bordered);
        mx0Var.setStriped(this.s.striped);
        e4 e4Var = this.b;
        mx0Var.setRtl(e4Var != null && e4Var.G);
        if (this.s.rows.isEmpty()) {
            i7 = 0;
        } else {
            TL_iv.pageTableRow pagetablerow = this.s.rows.get(0);
            int size = pagetablerow.cells.size();
            i7 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                int i12 = pagetablerow.cells.get(i11).colspan;
                if (i12 == 0) {
                    i12 = 1;
                }
                i7 += i12;
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
                    mx0Var.b(pagetablecell, i14, i13, i16);
                } else {
                    mx0Var.a(i14, i13, i16, i17);
                }
                i14 += i16;
            }
        }
        mx0Var.setColumnCount(i7);
        this.r = true;
        requestLayout();
    }
}
