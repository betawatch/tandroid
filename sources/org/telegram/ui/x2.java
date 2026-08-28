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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class x2 extends FrameLayout implements org.telegram.ui.Components.qy0, org.telegram.ui.Cells.m9 {
    public final a70 a;
    public final j4 b;
    public final w2 c;
    public e3 d;
    public final org.telegram.ui.Components.ry0 e;
    public int f;
    public int h;
    public int n;
    public boolean r;
    public TL_iv.pageBlockTable s;
    public final androidx.emoji2.text.m v;

    public x2(Context context, a70 a70Var, j4 j4Var) {
        super(context);
        this.v = new androidx.emoji2.text.m(this);
        this.a = a70Var;
        this.b = j4Var;
        w2 w2Var = new w2(this, context, a70Var);
        this.c = w2Var;
        float f10 = 18;
        w2Var.setPadding(AndroidUtilities.dp(f10), 0, AndroidUtilities.dp(f10), 0);
        w2Var.setClipToPadding(false);
        addView(w2Var, g7.e6.c(-2.0f, -1));
        org.telegram.ui.Components.ry0 ry0Var = new org.telegram.ui.Components.ry0(context, this, ((l4) a70Var).K0);
        this.e = ry0Var;
        ry0Var.setOrientation(0);
        ry0Var.setRowOrderPreserved(true);
        w2Var.addView(ry0Var, new FrameLayout.LayoutParams(-2, -2));
        setWillNotDraw(false);
    }

    public final void a() {
        int i9 = this.d == null ? 0 : 1;
        org.telegram.ui.Components.ry0 ry0Var = this.e;
        int childCount = ry0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            org.telegram.ui.Components.ky0 d = ry0Var.d(i10);
            org.telegram.ui.Components.jy0 jy0Var = d.b;
            if (jy0Var != null) {
                jy0Var.setX((AndroidUtilities.dp(18.0f) + (d.b() + this.f)) - this.c.getScrollX());
                d.b.setY(d.c() + this.h);
                d.b.setRow(d.j + 10);
                d.r = i9;
                i9++;
            }
        }
    }

    @Override // org.telegram.ui.Components.qy0
    public final org.telegram.ui.Components.jy0 createTextLayout(TL_iv.pageTableCell pagetablecell, int i9) {
        if (pagetablecell == null) {
            return null;
        }
        return l4.p(this.a, this, null, pagetablecell.text, i9, -1, this.s, pagetablecell.align_right ? Layout.Alignment.ALIGN_OPPOSITE : pagetablecell.align_center ? Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_NORMAL, 0, this.b);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.a.getClass();
        } else if (actionMasked != 2 && (actionMasked == 1 || actionMasked == 3)) {
            removeCallbacks(this.v);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Cells.m9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        e3 e3Var = this.d;
        if (e3Var != null) {
            arrayList.add(e3Var);
        }
        org.telegram.ui.Components.ry0 ry0Var = this.e;
        int childCount = ry0Var.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            org.telegram.ui.Components.jy0 jy0Var = ry0Var.d(i9).b;
            if (jy0Var != null) {
                arrayList.add(jy0Var);
            }
        }
    }

    public Paint getHalfLinePaint() {
        return l4.p1;
    }

    @Override // org.telegram.ui.Components.qy0
    public Paint getHeaderPaint() {
        return l4.q1;
    }

    @Override // org.telegram.ui.Components.qy0
    public Paint getLinePaint() {
        return l4.o1;
    }

    @Override // org.telegram.ui.Components.qy0
    public Paint getStripPaint() {
        return l4.r1;
    }

    @Override // android.view.View, org.telegram.ui.Cells.v9
    public final void invalidate() {
        super.invalidate();
        this.e.invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        e3 e3Var = this.d;
        if (e3Var != null) {
            e3Var.attach(this);
        }
        org.telegram.ui.Components.ry0 ry0Var = this.e;
        int childCount = ry0Var.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            org.telegram.ui.Components.jy0 jy0Var = ry0Var.d(i9).b;
            if (jy0Var != null) {
                jy0Var.attach(this);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e3 e3Var = this.d;
        if (e3Var != null) {
            e3Var.detach(this);
        }
        org.telegram.ui.Components.ry0 ry0Var = this.e;
        int childCount = ry0Var.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            org.telegram.ui.Components.jy0 jy0Var = ry0Var.d(i9).b;
            if (jy0Var != null) {
                jy0Var.detach(this);
            }
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.s == null) {
            return;
        }
        e3 e3Var = this.d;
        a70 a70Var = this.a;
        if (e3Var != null) {
            canvas.save();
            canvas.translate(this.n, 0);
            l4.v(a70Var, canvas, this, 0);
            this.d.draw(canvas, this);
            canvas.restore();
        }
        l4.u(canvas, a70Var, this.s, getMeasuredHeight());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(LocaleController.getString(R.string.AccDescrIVTable));
        if (this.d != null) {
            sb2.append(", ");
            sb2.append(this.d.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int i13 = this.f;
        int i14 = this.h;
        w2 w2Var = this.c;
        w2Var.layout(i13, i14, w2Var.getMeasuredWidth() + i13, w2Var.getMeasuredHeight() + this.h);
        if (this.r) {
            j4 j4Var = this.b;
            if (j4Var == null || !j4Var.C) {
                w2Var.setScrollX(0);
            } else {
                w2Var.setScrollX(AndroidUtilities.dp(36.0f) + (this.e.getMeasuredWidth() - w2Var.getMeasuredWidth()));
            }
            this.r = false;
        }
    }

    @Override // org.telegram.ui.Components.qy0
    public final void onLayoutChild(org.telegram.ui.Components.jy0 jy0Var, int i9, int i10) {
        if (!(jy0Var instanceof e3)) {
            return;
        }
        a70 a70Var = this.a;
        if (a70Var.A.isEmpty() || a70Var.B == null) {
            return;
        }
        e3 e3Var = (e3) jy0Var;
        String lowerCase = e3Var.d.getText().toString().toLowerCase();
        int i11 = 0;
        while (true) {
            int indexOf = lowerCase.indexOf(a70Var.B, i11);
            if (indexOf < 0) {
                return;
            }
            int length = a70Var.B.length() + indexOf;
            if (indexOf == 0 || AndroidUtilities.isPunctuationCharacter(lowerCase.charAt(indexOf - 1))) {
                HashMap hashMap = this.b.y;
                String str = a70Var.B + this.s + e3Var.r + indexOf;
                StaticLayout staticLayout = e3Var.d;
                hashMap.put(str, Integer.valueOf(staticLayout.getLineTop(staticLayout.getLineForOffset(indexOf)) + i10));
            }
            i11 = length;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        int i11;
        int dp;
        int i12;
        int size = View.MeasureSpec.getSize(i9);
        TL_iv.pageBlockTable pageblocktable = this.s;
        if (pageblocktable != null) {
            int i13 = pageblocktable.level;
            a70 a70Var = this.a;
            if (i13 > 0) {
                int dp2 = AndroidUtilities.dp(i13 * 14);
                this.f = dp2;
                a70Var.getClass();
                int dp3 = AndroidUtilities.dp(18) + dp2;
                this.n = dp3;
                dp = size - dp3;
            } else {
                this.f = 0;
                a70Var.getClass();
                this.n = AndroidUtilities.dp(18);
                dp = size - AndroidUtilities.dp(36);
            }
            int i14 = dp;
            TL_iv.pageBlockTable pageblocktable2 = this.s;
            e3 p6 = l4.p(this.a, this, null, pageblocktable2.title, i14, 0, pageblocktable2, Layout.Alignment.ALIGN_CENTER, 0, this.b);
            this.d = p6;
            if (p6 != null) {
                i12 = AndroidUtilities.dp(8.0f) + p6.d.getHeight();
                this.h = i12;
                e3 e3Var = this.d;
                e3Var.s = this.n;
                e3Var.v = 0;
            } else {
                this.h = AndroidUtilities.dp(8.0f);
                i12 = 0;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - this.f, TLObject.FLAG_30);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            w2 w2Var = this.c;
            w2Var.measure(makeMeasureSpec, makeMeasureSpec2);
            i11 = org.telegram.messenger.l0.C(8.0f, w2Var.getMeasuredHeight(), i12);
            TL_iv.pageBlockTable pageblocktable3 = this.s;
            if (pageblocktable3.level > 0 && !pageblocktable3.bottom) {
                i11 += AndroidUtilities.dp(8.0f);
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
        org.telegram.ui.Components.ry0 ry0Var = this.e;
        int childCount = ry0Var.getChildCount();
        int i9 = 0;
        while (i9 < childCount) {
            org.telegram.ui.Components.ky0 d = ry0Var.d(i9);
            org.telegram.ui.Components.jy0 jy0Var = d.b;
            if (jy0Var instanceof e3) {
                e3 e3Var = (e3) jy0Var;
                w2 w2Var = this.c;
                MotionEvent motionEvent3 = motionEvent;
                motionEvent2 = motionEvent3;
                if (l4.l(this.a, this.b, motionEvent3, this, e3Var, d.b() + (w2Var.getPaddingLeft() - w2Var.getScrollX()) + this.f, d.c() + this.h)) {
                    return true;
                }
            } else {
                motionEvent2 = motionEvent;
            }
            i9++;
            motionEvent = motionEvent2;
        }
        MotionEvent motionEvent4 = motionEvent;
        return l4.l(this.a, this.b, motionEvent4, this, this.d, this.n, 0) || super.onTouchEvent(motionEvent4);
    }

    public void setBlock(TL_iv.pageBlockTable pageblocktable) {
        int i9;
        this.s = pageblocktable;
        int i10 = org.telegram.ui.ActionBar.f6.d6;
        ((l4) this.a).getClass();
        AndroidUtilities.setScrollViewEdgeEffectColor(this.c, org.telegram.ui.ActionBar.f6.w0(null, i10, false));
        org.telegram.ui.Components.ry0 ry0Var = this.e;
        ry0Var.L.clear();
        ry0Var.G.clear();
        ry0Var.g();
        ry0Var.setDrawLines(this.s.bordered);
        ry0Var.setStriped(this.s.striped);
        j4 j4Var = this.b;
        ry0Var.setRtl(j4Var != null && j4Var.C);
        if (this.s.rows.isEmpty()) {
            i9 = 0;
        } else {
            TL_iv.pageTableRow pagetablerow = this.s.rows.get(0);
            int size = pagetablerow.cells.size();
            i9 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                int i12 = pagetablerow.cells.get(i11).colspan;
                if (i12 == 0) {
                    i12 = 1;
                }
                i9 += i12;
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
                    ry0Var.b(pagetablecell, i14, i13, i16);
                } else {
                    ry0Var.a(i14, i13, i16, i17);
                }
                i14 += i16;
            }
        }
        ry0Var.setColumnCount(i9);
        this.r = true;
        requestLayout();
    }
}
