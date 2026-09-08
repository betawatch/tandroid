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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class u2 extends FrameLayout implements org.telegram.ui.Components.iz0, org.telegram.ui.Cells.p9 {
    public final v70 a;
    public final g4 b;
    public final t2 c;
    public b3 d;
    public final org.telegram.ui.Components.jz0 e;
    public int f;
    public int h;
    public int n;
    public boolean r;
    public TL_iv.pageBlockTable s;
    public final androidx.emoji2.text.n v;

    public u2(Context context, v70 v70Var, g4 g4Var) {
        super(context);
        this.v = new androidx.emoji2.text.n(this);
        this.a = v70Var;
        this.b = g4Var;
        t2 t2Var = new t2(this, context, v70Var);
        this.c = t2Var;
        float f7 = 18;
        t2Var.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(f7), 0);
        t2Var.setClipToPadding(false);
        addView(t2Var, w7.x5.c(-2.0f, -1));
        org.telegram.ui.Components.jz0 jz0Var = new org.telegram.ui.Components.jz0(context, this, ((i4) v70Var).O0);
        this.e = jz0Var;
        jz0Var.setOrientation(0);
        jz0Var.setRowOrderPreserved(true);
        t2Var.addView(jz0Var, new FrameLayout.LayoutParams(-2, -2));
        setWillNotDraw(false);
    }

    public final void a() {
        int i10 = this.d == null ? 0 : 1;
        org.telegram.ui.Components.jz0 jz0Var = this.e;
        int childCount = jz0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            org.telegram.ui.Components.cz0 d = jz0Var.d(i11);
            org.telegram.ui.Components.bz0 bz0Var = d.b;
            if (bz0Var != null) {
                bz0Var.setX((AndroidUtilities.dp(18.0f) + (d.b() + this.f)) - this.c.getScrollX());
                d.b.setY(d.c() + this.h);
                d.b.setRow(d.j + 10);
                d.r = i10;
                i10++;
            }
        }
    }

    @Override // org.telegram.ui.Components.iz0
    public final org.telegram.ui.Components.bz0 createTextLayout(TL_iv.pageTableCell pagetablecell, int i10) {
        if (pagetablecell == null) {
            return null;
        }
        return i4.p(this.a, this, null, pagetablecell.text, i10, -1, this.s, pagetablecell.align_right ? Layout.Alignment.ALIGN_OPPOSITE : pagetablecell.align_center ? Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_NORMAL, 0, this.b);
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

    @Override // org.telegram.ui.Cells.p9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        b3 b3Var = this.d;
        if (b3Var != null) {
            arrayList.add(b3Var);
        }
        org.telegram.ui.Components.jz0 jz0Var = this.e;
        int childCount = jz0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            org.telegram.ui.Components.bz0 bz0Var = jz0Var.d(i10).b;
            if (bz0Var != null) {
                arrayList.add(bz0Var);
            }
        }
    }

    public Paint getHalfLinePaint() {
        return i4.t1;
    }

    @Override // org.telegram.ui.Components.iz0
    public Paint getHeaderPaint() {
        return i4.u1;
    }

    @Override // org.telegram.ui.Components.iz0
    public Paint getLinePaint() {
        return i4.s1;
    }

    @Override // org.telegram.ui.Components.iz0
    public Paint getStripPaint() {
        return i4.v1;
    }

    @Override // android.view.View, org.telegram.ui.Cells.y9
    public final void invalidate() {
        super.invalidate();
        this.e.invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b3 b3Var = this.d;
        if (b3Var != null) {
            b3Var.attach(this);
        }
        org.telegram.ui.Components.jz0 jz0Var = this.e;
        int childCount = jz0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            org.telegram.ui.Components.bz0 bz0Var = jz0Var.d(i10).b;
            if (bz0Var != null) {
                bz0Var.attach(this);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b3 b3Var = this.d;
        if (b3Var != null) {
            b3Var.detach(this);
        }
        org.telegram.ui.Components.jz0 jz0Var = this.e;
        int childCount = jz0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            org.telegram.ui.Components.bz0 bz0Var = jz0Var.d(i10).b;
            if (bz0Var != null) {
                bz0Var.detach(this);
            }
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.s == null) {
            return;
        }
        b3 b3Var = this.d;
        v70 v70Var = this.a;
        if (b3Var != null) {
            canvas.save();
            canvas.translate(this.n, 0);
            i4.v(v70Var, canvas, this, 0);
            this.d.draw(canvas, this);
            canvas.restore();
        }
        i4.u(canvas, v70Var, this.s, getMeasuredHeight());
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
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = this.f;
        int i15 = this.h;
        t2 t2Var = this.c;
        t2Var.layout(i14, i15, t2Var.getMeasuredWidth() + i14, t2Var.getMeasuredHeight() + this.h);
        if (this.r) {
            g4 g4Var = this.b;
            if (g4Var == null || !g4Var.G) {
                t2Var.setScrollX(0);
            } else {
                t2Var.setScrollX(AndroidUtilities.dp(36.0f) + (this.e.getMeasuredWidth() - t2Var.getMeasuredWidth()));
            }
            this.r = false;
        }
    }

    @Override // org.telegram.ui.Components.iz0
    public final void onLayoutChild(org.telegram.ui.Components.bz0 bz0Var, int i10, int i11) {
        if (!(bz0Var instanceof b3)) {
            return;
        }
        v70 v70Var = this.a;
        if (v70Var.E.isEmpty() || v70Var.F == null) {
            return;
        }
        b3 b3Var = (b3) bz0Var;
        String lowerCase = b3Var.d.getText().toString().toLowerCase();
        int i12 = 0;
        while (true) {
            int indexOf = lowerCase.indexOf(v70Var.F, i12);
            if (indexOf < 0) {
                return;
            }
            int length = v70Var.F.length() + indexOf;
            if (indexOf == 0 || AndroidUtilities.isPunctuationCharacter(lowerCase.charAt(indexOf - 1))) {
                HashMap hashMap = this.b.y;
                String str = v70Var.F + this.s + b3Var.r + indexOf;
                StaticLayout staticLayout = b3Var.d;
                hashMap.put(str, Integer.valueOf(staticLayout.getLineTop(staticLayout.getLineForOffset(indexOf)) + i11));
            }
            i12 = length;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int dp;
        int i13;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockTable pageblocktable = this.s;
        if (pageblocktable != null) {
            int i14 = pageblocktable.level;
            v70 v70Var = this.a;
            if (i14 > 0) {
                int dp2 = AndroidUtilities.dp(i14 * 14);
                this.f = dp2;
                v70Var.getClass();
                int dp3 = AndroidUtilities.dp(18) + dp2;
                this.n = dp3;
                dp = size - dp3;
            } else {
                this.f = 0;
                v70Var.getClass();
                this.n = AndroidUtilities.dp(18);
                dp = size - AndroidUtilities.dp(36);
            }
            int i15 = dp;
            TL_iv.pageBlockTable pageblocktable2 = this.s;
            b3 p5 = i4.p(this.a, this, null, pageblocktable2.title, i15, 0, pageblocktable2, Layout.Alignment.ALIGN_CENTER, 0, this.b);
            this.d = p5;
            if (p5 != null) {
                i13 = AndroidUtilities.dp(8.0f) + p5.d.getHeight();
                this.h = i13;
                b3 b3Var = this.d;
                b3Var.s = this.n;
                b3Var.v = 0;
            } else {
                this.h = AndroidUtilities.dp(8.0f);
                i13 = 0;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - this.f, TLObject.FLAG_30);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            t2 t2Var = this.c;
            t2Var.measure(makeMeasureSpec, makeMeasureSpec2);
            i12 = org.telegram.messenger.w1.C(8.0f, t2Var.getMeasuredHeight(), i13);
            TL_iv.pageBlockTable pageblocktable3 = this.s;
            if (pageblocktable3.level > 0 && !pageblocktable3.bottom) {
                i12 += AndroidUtilities.dp(8.0f);
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
        org.telegram.ui.Components.jz0 jz0Var = this.e;
        int childCount = jz0Var.getChildCount();
        int i10 = 0;
        while (i10 < childCount) {
            org.telegram.ui.Components.cz0 d = jz0Var.d(i10);
            org.telegram.ui.Components.bz0 bz0Var = d.b;
            if (bz0Var instanceof b3) {
                b3 b3Var = (b3) bz0Var;
                t2 t2Var = this.c;
                MotionEvent motionEvent3 = motionEvent;
                motionEvent2 = motionEvent3;
                if (i4.l(this.a, this.b, motionEvent3, this, b3Var, d.b() + (t2Var.getPaddingLeft() - t2Var.getScrollX()) + this.f, d.c() + this.h)) {
                    return true;
                }
            } else {
                motionEvent2 = motionEvent;
            }
            i10++;
            motionEvent = motionEvent2;
        }
        MotionEvent motionEvent4 = motionEvent;
        return i4.l(this.a, this.b, motionEvent4, this, this.d, this.n, 0) || super.onTouchEvent(motionEvent4);
    }

    public void setBlock(TL_iv.pageBlockTable pageblocktable) {
        int i10;
        this.s = pageblocktable;
        int i11 = org.telegram.ui.ActionBar.j6.d6;
        ((i4) this.a).getClass();
        AndroidUtilities.setScrollViewEdgeEffectColor(this.c, org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        org.telegram.ui.Components.jz0 jz0Var = this.e;
        jz0Var.P.clear();
        jz0Var.K.clear();
        jz0Var.g();
        jz0Var.setDrawLines(this.s.bordered);
        jz0Var.setStriped(this.s.striped);
        g4 g4Var = this.b;
        jz0Var.setRtl(g4Var != null && g4Var.G);
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
                    jz0Var.b(pagetablecell, i15, i14, i17);
                } else {
                    jz0Var.a(i15, i14, i17, i18);
                }
                i15 += i17;
            }
        }
        jz0Var.setColumnCount(i10);
        this.r = true;
        requestLayout();
    }
}
