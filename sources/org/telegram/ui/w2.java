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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class w2 extends FrameLayout implements org.telegram.ui.Components.mz0, org.telegram.ui.Cells.l9 {
    public final n70 a;
    public final j4 b;
    public final v2 c;
    public d3 d;
    public final org.telegram.ui.Components.nz0 e;
    public int f;
    public int h;
    public int n;
    public boolean r;
    public TL_iv.pageBlockTable s;
    public final androidx.emoji2.text.n v;

    public w2(Context context, n70 n70Var, j4 j4Var) {
        super(context);
        this.v = new androidx.emoji2.text.n(this);
        this.a = n70Var;
        this.b = j4Var;
        v2 v2Var = new v2(this, context, n70Var);
        this.c = v2Var;
        float f10 = 18;
        v2Var.setPadding(AndroidUtilities.dp(f10), 0, AndroidUtilities.dp(f10), 0);
        v2Var.setClipToPadding(false);
        addView(v2Var, k7.b6.c(-2.0f, -1));
        org.telegram.ui.Components.nz0 nz0Var = new org.telegram.ui.Components.nz0(context, this, ((l4) n70Var).L0);
        this.e = nz0Var;
        nz0Var.setOrientation(0);
        nz0Var.setRowOrderPreserved(true);
        v2Var.addView(nz0Var, new FrameLayout.LayoutParams(-2, -2));
        setWillNotDraw(false);
    }

    public final void a() {
        int i10 = this.d == null ? 0 : 1;
        org.telegram.ui.Components.nz0 nz0Var = this.e;
        int childCount = nz0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            org.telegram.ui.Components.gz0 d = nz0Var.d(i11);
            org.telegram.ui.Components.fz0 fz0Var = d.b;
            if (fz0Var != null) {
                fz0Var.setX((AndroidUtilities.dp(18.0f) + (d.b() + this.f)) - this.c.getScrollX());
                d.b.setY(d.c() + this.h);
                d.b.setRow(d.j + 10);
                d.r = i10;
                i10++;
            }
        }
    }

    @Override // org.telegram.ui.Components.mz0
    public final org.telegram.ui.Components.fz0 createTextLayout(TL_iv.pageTableCell pagetablecell, int i10) {
        if (pagetablecell == null) {
            return null;
        }
        return l4.p(this.a, this, null, pagetablecell.text, i10, -1, this.s, pagetablecell.align_right ? Layout.Alignment.ALIGN_OPPOSITE : pagetablecell.align_center ? Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_NORMAL, 0, this.b);
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

    @Override // org.telegram.ui.Cells.l9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d3 d3Var = this.d;
        if (d3Var != null) {
            arrayList.add(d3Var);
        }
        org.telegram.ui.Components.nz0 nz0Var = this.e;
        int childCount = nz0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            org.telegram.ui.Components.fz0 fz0Var = nz0Var.d(i10).b;
            if (fz0Var != null) {
                arrayList.add(fz0Var);
            }
        }
    }

    public Paint getHalfLinePaint() {
        return l4.q1;
    }

    @Override // org.telegram.ui.Components.mz0
    public Paint getHeaderPaint() {
        return l4.r1;
    }

    @Override // org.telegram.ui.Components.mz0
    public Paint getLinePaint() {
        return l4.p1;
    }

    @Override // org.telegram.ui.Components.mz0
    public Paint getStripPaint() {
        return l4.s1;
    }

    @Override // android.view.View, org.telegram.ui.Cells.u9
    public final void invalidate() {
        super.invalidate();
        this.e.invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d3 d3Var = this.d;
        if (d3Var != null) {
            d3Var.attach(this);
        }
        org.telegram.ui.Components.nz0 nz0Var = this.e;
        int childCount = nz0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            org.telegram.ui.Components.fz0 fz0Var = nz0Var.d(i10).b;
            if (fz0Var != null) {
                fz0Var.attach(this);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d3 d3Var = this.d;
        if (d3Var != null) {
            d3Var.detach(this);
        }
        org.telegram.ui.Components.nz0 nz0Var = this.e;
        int childCount = nz0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            org.telegram.ui.Components.fz0 fz0Var = nz0Var.d(i10).b;
            if (fz0Var != null) {
                fz0Var.detach(this);
            }
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.s == null) {
            return;
        }
        d3 d3Var = this.d;
        n70 n70Var = this.a;
        if (d3Var != null) {
            canvas.save();
            canvas.translate(this.n, 0);
            l4.v(n70Var, canvas, this, 0);
            this.d.draw(canvas, this);
            canvas.restore();
        }
        l4.u(canvas, n70Var, this.s, getMeasuredHeight());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb = new StringBuilder(LocaleController.getString(R.string.AccDescrIVTable));
        if (this.d != null) {
            sb.append(", ");
            sb.append(this.d.d.getText());
        }
        accessibilityNodeInfo.setText(sb);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14 = this.f;
        int i15 = this.h;
        v2 v2Var = this.c;
        v2Var.layout(i14, i15, v2Var.getMeasuredWidth() + i14, v2Var.getMeasuredHeight() + this.h);
        if (this.r) {
            j4 j4Var = this.b;
            if (j4Var == null || !j4Var.D) {
                v2Var.setScrollX(0);
            } else {
                v2Var.setScrollX(AndroidUtilities.dp(36.0f) + (this.e.getMeasuredWidth() - v2Var.getMeasuredWidth()));
            }
            this.r = false;
        }
    }

    @Override // org.telegram.ui.Components.mz0
    public final void onLayoutChild(org.telegram.ui.Components.fz0 fz0Var, int i10, int i11) {
        if (!(fz0Var instanceof d3)) {
            return;
        }
        n70 n70Var = this.a;
        if (n70Var.B.isEmpty() || n70Var.C == null) {
            return;
        }
        d3 d3Var = (d3) fz0Var;
        String lowerCase = d3Var.d.getText().toString().toLowerCase();
        int i12 = 0;
        while (true) {
            int indexOf = lowerCase.indexOf(n70Var.C, i12);
            if (indexOf < 0) {
                return;
            }
            int length = n70Var.C.length() + indexOf;
            if (indexOf == 0 || AndroidUtilities.isPunctuationCharacter(lowerCase.charAt(indexOf - 1))) {
                HashMap hashMap = this.b.y;
                String str = n70Var.C + this.s + d3Var.r + indexOf;
                StaticLayout staticLayout = d3Var.d;
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
            n70 n70Var = this.a;
            if (i14 > 0) {
                int dp2 = AndroidUtilities.dp(i14 * 14);
                this.f = dp2;
                n70Var.getClass();
                int dp3 = AndroidUtilities.dp(18) + dp2;
                this.n = dp3;
                dp = size - dp3;
            } else {
                this.f = 0;
                n70Var.getClass();
                this.n = AndroidUtilities.dp(18);
                dp = size - AndroidUtilities.dp(36);
            }
            int i15 = dp;
            TL_iv.pageBlockTable pageblocktable2 = this.s;
            d3 p10 = l4.p(this.a, this, null, pageblocktable2.title, i15, 0, pageblocktable2, Layout.Alignment.ALIGN_CENTER, 0, this.b);
            this.d = p10;
            if (p10 != null) {
                i13 = AndroidUtilities.dp(8.0f) + p10.d.getHeight();
                this.h = i13;
                d3 d3Var = this.d;
                d3Var.s = this.n;
                d3Var.v = 0;
            } else {
                this.h = AndroidUtilities.dp(8.0f);
                i13 = 0;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - this.f, TLObject.FLAG_30);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            v2 v2Var = this.c;
            v2Var.measure(makeMeasureSpec, makeMeasureSpec2);
            i12 = org.telegram.messenger.y3.C(8.0f, v2Var.getMeasuredHeight(), i13);
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
        org.telegram.ui.Components.nz0 nz0Var = this.e;
        int childCount = nz0Var.getChildCount();
        int i10 = 0;
        while (i10 < childCount) {
            org.telegram.ui.Components.gz0 d = nz0Var.d(i10);
            org.telegram.ui.Components.fz0 fz0Var = d.b;
            if (fz0Var instanceof d3) {
                d3 d3Var = (d3) fz0Var;
                v2 v2Var = this.c;
                MotionEvent motionEvent3 = motionEvent;
                motionEvent2 = motionEvent3;
                if (l4.l(this.a, this.b, motionEvent3, this, d3Var, d.b() + (v2Var.getPaddingLeft() - v2Var.getScrollX()) + this.f, d.c() + this.h)) {
                    return true;
                }
            } else {
                motionEvent2 = motionEvent;
            }
            i10++;
            motionEvent = motionEvent2;
        }
        MotionEvent motionEvent4 = motionEvent;
        return l4.l(this.a, this.b, motionEvent4, this, this.d, this.n, 0) || super.onTouchEvent(motionEvent4);
    }

    public void setBlock(TL_iv.pageBlockTable pageblocktable) {
        int i10;
        this.s = pageblocktable;
        int i11 = org.telegram.ui.ActionBar.j6.d6;
        ((l4) this.a).getClass();
        AndroidUtilities.setScrollViewEdgeEffectColor(this.c, org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        org.telegram.ui.Components.nz0 nz0Var = this.e;
        nz0Var.M.clear();
        nz0Var.H.clear();
        nz0Var.g();
        nz0Var.setDrawLines(this.s.bordered);
        nz0Var.setStriped(this.s.striped);
        j4 j4Var = this.b;
        nz0Var.setRtl(j4Var != null && j4Var.D);
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
                    nz0Var.b(pagetablecell, i15, i14, i17);
                } else {
                    nz0Var.a(i15, i14, i17, i18);
                }
                i15 += i17;
            }
        }
        nz0Var.setColumnCount(i10);
        this.r = true;
        requestLayout();
    }
}
