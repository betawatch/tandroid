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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class w2 extends FrameLayout implements org.telegram.ui.Components.h01, org.telegram.ui.Cells.n9 {
    public final z70 a;
    public final i4 b;
    public final v2 c;
    public d3 d;
    public final org.telegram.ui.Components.i01 e;
    public int f;
    public int h;
    public int n;
    public boolean r;
    public TL_iv.pageBlockTable s;
    public final androidx.emoji2.text.n v;

    public w2(Context context, z70 z70Var, i4 i4Var) {
        super(context);
        this.v = new androidx.emoji2.text.n(this);
        this.a = z70Var;
        this.b = i4Var;
        v2 v2Var = new v2(this, context, z70Var);
        this.c = v2Var;
        float f7 = 18;
        v2Var.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(f7), 0);
        v2Var.setClipToPadding(false);
        addView(v2Var, w7.z5.d(-2.0f, -1));
        org.telegram.ui.Components.i01 i01Var = new org.telegram.ui.Components.i01(context, this, ((k4) z70Var).O0);
        this.e = i01Var;
        i01Var.setOrientation(0);
        i01Var.setRowOrderPreserved(true);
        v2Var.addView(i01Var, new FrameLayout.LayoutParams(-2, -2));
        setWillNotDraw(false);
    }

    public final void a() {
        int i10 = this.d == null ? 0 : 1;
        org.telegram.ui.Components.i01 i01Var = this.e;
        int childCount = i01Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            org.telegram.ui.Components.b01 d = i01Var.d(i11);
            org.telegram.ui.Components.a01 a01Var = d.b;
            if (a01Var != null) {
                a01Var.setX((AndroidUtilities.dp(18.0f) + (d.b() + this.f)) - this.c.getScrollX());
                d.b.setY(d.c() + this.h);
                d.b.setRow(d.j + 10);
                d.r = i10;
                i10++;
            }
        }
    }

    @Override // org.telegram.ui.Components.h01
    public final org.telegram.ui.Components.a01 createTextLayout(TL_iv.pageTableCell pagetablecell, int i10) {
        if (pagetablecell == null) {
            return null;
        }
        return k4.p(this.a, this, null, pagetablecell.text, i10, -1, this.s, pagetablecell.align_right ? Layout.Alignment.ALIGN_OPPOSITE : pagetablecell.align_center ? Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_NORMAL, 0, this.b);
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

    @Override // org.telegram.ui.Cells.n9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d3 d3Var = this.d;
        if (d3Var != null) {
            arrayList.add(d3Var);
        }
        org.telegram.ui.Components.i01 i01Var = this.e;
        int childCount = i01Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            org.telegram.ui.Components.a01 a01Var = i01Var.d(i10).b;
            if (a01Var != null) {
                arrayList.add(a01Var);
            }
        }
    }

    public Paint getHalfLinePaint() {
        return k4.t1;
    }

    @Override // org.telegram.ui.Components.h01
    public Paint getHeaderPaint() {
        return k4.u1;
    }

    @Override // org.telegram.ui.Components.h01
    public Paint getLinePaint() {
        return k4.s1;
    }

    @Override // org.telegram.ui.Components.h01
    public Paint getStripPaint() {
        return k4.v1;
    }

    @Override // android.view.View, org.telegram.ui.Cells.w9
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
        org.telegram.ui.Components.i01 i01Var = this.e;
        int childCount = i01Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            org.telegram.ui.Components.a01 a01Var = i01Var.d(i10).b;
            if (a01Var != null) {
                a01Var.attach(this);
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
        org.telegram.ui.Components.i01 i01Var = this.e;
        int childCount = i01Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            org.telegram.ui.Components.a01 a01Var = i01Var.d(i10).b;
            if (a01Var != null) {
                a01Var.detach(this);
            }
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.s == null) {
            return;
        }
        d3 d3Var = this.d;
        z70 z70Var = this.a;
        if (d3Var != null) {
            canvas.save();
            canvas.translate(this.n, 0);
            k4.v(z70Var, canvas, this, 0);
            this.d.draw(canvas, this);
            canvas.restore();
        }
        k4.u(canvas, z70Var, this.s, getMeasuredHeight());
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
        v2 v2Var = this.c;
        v2Var.layout(i14, i15, v2Var.getMeasuredWidth() + i14, v2Var.getMeasuredHeight() + this.h);
        if (this.r) {
            i4 i4Var = this.b;
            if (i4Var == null || !i4Var.G) {
                v2Var.setScrollX(0);
            } else {
                v2Var.setScrollX(AndroidUtilities.dp(36.0f) + (this.e.getMeasuredWidth() - v2Var.getMeasuredWidth()));
            }
            this.r = false;
        }
    }

    @Override // org.telegram.ui.Components.h01
    public final void onLayoutChild(org.telegram.ui.Components.a01 a01Var, int i10, int i11) {
        if (!(a01Var instanceof d3)) {
            return;
        }
        z70 z70Var = this.a;
        if (z70Var.E.isEmpty() || z70Var.F == null) {
            return;
        }
        d3 d3Var = (d3) a01Var;
        String lowerCase = d3Var.d.getText().toString().toLowerCase();
        int i12 = 0;
        while (true) {
            int indexOf = lowerCase.indexOf(z70Var.F, i12);
            if (indexOf < 0) {
                return;
            }
            int length = z70Var.F.length() + indexOf;
            if (indexOf == 0 || AndroidUtilities.isPunctuationCharacter(lowerCase.charAt(indexOf - 1))) {
                HashMap hashMap = this.b.y;
                String str = z70Var.F + this.s + d3Var.r + indexOf;
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
            z70 z70Var = this.a;
            if (i14 > 0) {
                int dp2 = AndroidUtilities.dp(i14 * 14);
                this.f = dp2;
                z70Var.getClass();
                int dp3 = AndroidUtilities.dp(18) + dp2;
                this.n = dp3;
                dp = size - dp3;
            } else {
                this.f = 0;
                z70Var.getClass();
                this.n = AndroidUtilities.dp(18);
                dp = size - AndroidUtilities.dp(36);
            }
            int i15 = dp;
            TL_iv.pageBlockTable pageblocktable2 = this.s;
            d3 p5 = k4.p(this.a, this, null, pageblocktable2.title, i15, 0, pageblocktable2, Layout.Alignment.ALIGN_CENTER, 0, this.b);
            this.d = p5;
            if (p5 != null) {
                i13 = AndroidUtilities.dp(8.0f) + p5.d.getHeight();
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
            i12 = org.telegram.messenger.g0.C(8.0f, v2Var.getMeasuredHeight(), i13);
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
        org.telegram.ui.Components.i01 i01Var = this.e;
        int childCount = i01Var.getChildCount();
        int i10 = 0;
        while (i10 < childCount) {
            org.telegram.ui.Components.b01 d = i01Var.d(i10);
            org.telegram.ui.Components.a01 a01Var = d.b;
            if (a01Var instanceof d3) {
                d3 d3Var = (d3) a01Var;
                v2 v2Var = this.c;
                MotionEvent motionEvent3 = motionEvent;
                motionEvent2 = motionEvent3;
                if (k4.l(this.a, this.b, motionEvent3, this, d3Var, d.b() + (v2Var.getPaddingLeft() - v2Var.getScrollX()) + this.f, d.c() + this.h)) {
                    return true;
                }
            } else {
                motionEvent2 = motionEvent;
            }
            i10++;
            motionEvent = motionEvent2;
        }
        MotionEvent motionEvent4 = motionEvent;
        return k4.l(this.a, this.b, motionEvent4, this, this.d, this.n, 0) || super.onTouchEvent(motionEvent4);
    }

    public void setBlock(TL_iv.pageBlockTable pageblocktable) {
        int i10;
        this.s = pageblocktable;
        int i11 = org.telegram.ui.ActionBar.g6.d6;
        ((k4) this.a).getClass();
        AndroidUtilities.setScrollViewEdgeEffectColor(this.c, org.telegram.ui.ActionBar.g6.x0(null, i11, false));
        org.telegram.ui.Components.i01 i01Var = this.e;
        i01Var.P.clear();
        i01Var.K.clear();
        i01Var.h();
        i01Var.setDrawLines(this.s.bordered);
        i01Var.setStriped(this.s.striped);
        i4 i4Var = this.b;
        i01Var.setRtl(i4Var != null && i4Var.G);
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
                    i01Var.b(pagetablecell, i15, i14, i17);
                } else {
                    i01Var.a(i15, i14, i17, i18);
                }
                i15 += i17;
            }
        }
        i01Var.setColumnCount(i10);
        this.r = true;
        requestLayout();
    }
}
