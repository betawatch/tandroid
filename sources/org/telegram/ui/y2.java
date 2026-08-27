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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class y2 extends FrameLayout implements org.telegram.ui.Components.sy0, org.telegram.ui.Cells.i9 {
    public final d70 a;
    public final k4 b;
    public final x2 c;
    public f3 d;
    public final org.telegram.ui.Components.ty0 e;
    public int f;
    public int h;
    public int n;
    public boolean r;
    public TL_iv.pageBlockTable s;
    public final androidx.emoji2.text.n v;

    public y2(Context context, d70 d70Var, k4 k4Var) {
        super(context);
        this.v = new androidx.emoji2.text.n(this);
        this.a = d70Var;
        this.b = k4Var;
        x2 x2Var = new x2(this, context, d70Var);
        this.c = x2Var;
        float f10 = 18;
        x2Var.setPadding(AndroidUtilities.dp(f10), 0, AndroidUtilities.dp(f10), 0);
        x2Var.setClipToPadding(false);
        addView(x2Var, h7.z5.c(-2.0f, -1));
        org.telegram.ui.Components.ty0 ty0Var = new org.telegram.ui.Components.ty0(context, this, ((m4) d70Var).K0);
        this.e = ty0Var;
        ty0Var.setOrientation(0);
        ty0Var.setRowOrderPreserved(true);
        x2Var.addView(ty0Var, new FrameLayout.LayoutParams(-2, -2));
        setWillNotDraw(false);
    }

    public final void a() {
        int i10 = this.d == null ? 0 : 1;
        org.telegram.ui.Components.ty0 ty0Var = this.e;
        int childCount = ty0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            org.telegram.ui.Components.my0 d = ty0Var.d(i11);
            org.telegram.ui.Components.ly0 ly0Var = d.b;
            if (ly0Var != null) {
                ly0Var.setX((AndroidUtilities.dp(18.0f) + (d.b() + this.f)) - this.c.getScrollX());
                d.b.setY(d.c() + this.h);
                d.b.setRow(d.j + 10);
                d.r = i10;
                i10++;
            }
        }
    }

    @Override // org.telegram.ui.Components.sy0
    public final org.telegram.ui.Components.ly0 createTextLayout(TL_iv.pageTableCell pagetablecell, int i10) {
        if (pagetablecell == null) {
            return null;
        }
        return m4.p(this.a, this, null, pagetablecell.text, i10, -1, this.s, pagetablecell.align_right ? Layout.Alignment.ALIGN_OPPOSITE : pagetablecell.align_center ? Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_NORMAL, 0, this.b);
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

    @Override // org.telegram.ui.Cells.i9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        f3 f3Var = this.d;
        if (f3Var != null) {
            arrayList.add(f3Var);
        }
        org.telegram.ui.Components.ty0 ty0Var = this.e;
        int childCount = ty0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            org.telegram.ui.Components.ly0 ly0Var = ty0Var.d(i10).b;
            if (ly0Var != null) {
                arrayList.add(ly0Var);
            }
        }
    }

    public Paint getHalfLinePaint() {
        return m4.p1;
    }

    @Override // org.telegram.ui.Components.sy0
    public Paint getHeaderPaint() {
        return m4.q1;
    }

    @Override // org.telegram.ui.Components.sy0
    public Paint getLinePaint() {
        return m4.o1;
    }

    @Override // org.telegram.ui.Components.sy0
    public Paint getStripPaint() {
        return m4.r1;
    }

    @Override // android.view.View, org.telegram.ui.Cells.r9
    public final void invalidate() {
        super.invalidate();
        this.e.invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f3 f3Var = this.d;
        if (f3Var != null) {
            f3Var.attach(this);
        }
        org.telegram.ui.Components.ty0 ty0Var = this.e;
        int childCount = ty0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            org.telegram.ui.Components.ly0 ly0Var = ty0Var.d(i10).b;
            if (ly0Var != null) {
                ly0Var.attach(this);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f3 f3Var = this.d;
        if (f3Var != null) {
            f3Var.detach(this);
        }
        org.telegram.ui.Components.ty0 ty0Var = this.e;
        int childCount = ty0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            org.telegram.ui.Components.ly0 ly0Var = ty0Var.d(i10).b;
            if (ly0Var != null) {
                ly0Var.detach(this);
            }
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.s == null) {
            return;
        }
        f3 f3Var = this.d;
        d70 d70Var = this.a;
        if (f3Var != null) {
            canvas.save();
            canvas.translate(this.n, 0);
            m4.v(d70Var, canvas, this, 0);
            this.d.draw(canvas, this);
            canvas.restore();
        }
        m4.u(canvas, d70Var, this.s, getMeasuredHeight());
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
        x2 x2Var = this.c;
        x2Var.layout(i14, i15, x2Var.getMeasuredWidth() + i14, x2Var.getMeasuredHeight() + this.h);
        if (this.r) {
            k4 k4Var = this.b;
            if (k4Var == null || !k4Var.C) {
                x2Var.setScrollX(0);
            } else {
                x2Var.setScrollX(AndroidUtilities.dp(36.0f) + (this.e.getMeasuredWidth() - x2Var.getMeasuredWidth()));
            }
            this.r = false;
        }
    }

    @Override // org.telegram.ui.Components.sy0
    public final void onLayoutChild(org.telegram.ui.Components.ly0 ly0Var, int i10, int i11) {
        if (!(ly0Var instanceof f3)) {
            return;
        }
        d70 d70Var = this.a;
        if (d70Var.A.isEmpty() || d70Var.B == null) {
            return;
        }
        f3 f3Var = (f3) ly0Var;
        String lowerCase = f3Var.d.getText().toString().toLowerCase();
        int i12 = 0;
        while (true) {
            int indexOf = lowerCase.indexOf(d70Var.B, i12);
            if (indexOf < 0) {
                return;
            }
            int length = d70Var.B.length() + indexOf;
            if (indexOf == 0 || AndroidUtilities.isPunctuationCharacter(lowerCase.charAt(indexOf - 1))) {
                HashMap hashMap = this.b.y;
                String str = d70Var.B + this.s + f3Var.r + indexOf;
                StaticLayout staticLayout = f3Var.d;
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
            d70 d70Var = this.a;
            if (i14 > 0) {
                int dp2 = AndroidUtilities.dp(i14 * 14);
                this.f = dp2;
                d70Var.getClass();
                int dp3 = AndroidUtilities.dp(18) + dp2;
                this.n = dp3;
                dp = size - dp3;
            } else {
                this.f = 0;
                d70Var.getClass();
                this.n = AndroidUtilities.dp(18);
                dp = size - AndroidUtilities.dp(36);
            }
            int i15 = dp;
            TL_iv.pageBlockTable pageblocktable2 = this.s;
            f3 p6 = m4.p(this.a, this, null, pageblocktable2.title, i15, 0, pageblocktable2, Layout.Alignment.ALIGN_CENTER, 0, this.b);
            this.d = p6;
            if (p6 != null) {
                i13 = AndroidUtilities.dp(8.0f) + p6.d.getHeight();
                this.h = i13;
                f3 f3Var = this.d;
                f3Var.s = this.n;
                f3Var.v = 0;
            } else {
                this.h = AndroidUtilities.dp(8.0f);
                i13 = 0;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - this.f, TLObject.FLAG_30);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            x2 x2Var = this.c;
            x2Var.measure(makeMeasureSpec, makeMeasureSpec2);
            i12 = org.telegram.messenger.y1.C(8.0f, x2Var.getMeasuredHeight(), i13);
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
        org.telegram.ui.Components.ty0 ty0Var = this.e;
        int childCount = ty0Var.getChildCount();
        int i10 = 0;
        while (i10 < childCount) {
            org.telegram.ui.Components.my0 d = ty0Var.d(i10);
            org.telegram.ui.Components.ly0 ly0Var = d.b;
            if (ly0Var instanceof f3) {
                f3 f3Var = (f3) ly0Var;
                x2 x2Var = this.c;
                MotionEvent motionEvent3 = motionEvent;
                motionEvent2 = motionEvent3;
                if (m4.l(this.a, this.b, motionEvent3, this, f3Var, d.b() + (x2Var.getPaddingLeft() - x2Var.getScrollX()) + this.f, d.c() + this.h)) {
                    return true;
                }
            } else {
                motionEvent2 = motionEvent;
            }
            i10++;
            motionEvent = motionEvent2;
        }
        MotionEvent motionEvent4 = motionEvent;
        return m4.l(this.a, this.b, motionEvent4, this, this.d, this.n, 0) || super.onTouchEvent(motionEvent4);
    }

    public void setBlock(TL_iv.pageBlockTable pageblocktable) {
        int i10;
        this.s = pageblocktable;
        int i11 = org.telegram.ui.ActionBar.g6.d6;
        ((m4) this.a).getClass();
        AndroidUtilities.setScrollViewEdgeEffectColor(this.c, org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        org.telegram.ui.Components.ty0 ty0Var = this.e;
        ty0Var.L.clear();
        ty0Var.G.clear();
        ty0Var.g();
        ty0Var.setDrawLines(this.s.bordered);
        ty0Var.setStriped(this.s.striped);
        k4 k4Var = this.b;
        ty0Var.setRtl(k4Var != null && k4Var.C);
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
                    ty0Var.b(pagetablecell, i15, i14, i17);
                } else {
                    ty0Var.a(i15, i14, i17, i18);
                }
                i15 += i17;
            }
        }
        ty0Var.setColumnCount(i10);
        this.r = true;
        requestLayout();
    }
}
