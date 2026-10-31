package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.CheckBoxBase;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class w1 extends ViewGroup implements org.telegram.ui.Cells.j9, c3 {
    public CheckBoxBase D;
    public final m60 a;
    public final f4 b;
    public z2 c;
    public org.telegram.ui.Components.ck0 d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;
    public boolean s;
    public int w;
    public x3 x;
    public boolean y;

    public w1(Context context, m60 m60Var, f4 f4Var) {
        super(context);
        this.a = m60Var;
        this.b = f4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        x3 x3Var = this.x;
        if ((x3Var != null ? x3Var.i : null) == null) {
            return 0;
        }
        m60 m60Var = this.a;
        f4 f4Var = this.b;
        if (f4Var == null || !f4Var.G) {
            m60Var.getClass();
            return org.telegram.messenger.m5.D(12.0f, this.x.c.f, (org.telegram.messenger.i0.L(15) + this.x.c.c) - ((int) Math.ceil(r0.d.getLineWidth(0))));
        }
        int measuredWidth = getMeasuredWidth();
        m60Var.getClass();
        int L = measuredWidth - org.telegram.messenger.i0.L(15);
        y3 y3Var = this.x.c;
        return org.telegram.messenger.z20.A(12.0f, y3Var.f, L - y3Var.c);
    }

    @Override // org.telegram.ui.c3
    public int getBoundLeft() {
        int boundLeft;
        this.a.getClass();
        int L = org.telegram.messenger.i0.L(18);
        int min = this.D != null ? Math.min(ConnectionsManager.DEFAULT_DATACENTER_ID, (this.e - org.telegram.messenger.i0.L(26.0f)) - L) : Integer.MAX_VALUE;
        x3 x3Var = this.x;
        if (x3Var != null && x3Var.i != null) {
            min = Math.min(min, (this.x.i.k() + a()) - L);
        }
        z2 z2Var = this.c;
        if (z2Var != null) {
            min = Math.min(min, (z2Var.k() + z2Var.s) - L);
        }
        org.telegram.ui.Components.ck0 ck0Var = this.d;
        if (ck0Var != null) {
            KeyEvent.Callback callback = ck0Var.a;
            if ((callback instanceof c3) && (boundLeft = ((c3) callback).getBoundLeft()) != -1) {
                min = Math.min(min, this.n + boundLeft);
            }
        }
        if (min == Integer.MAX_VALUE) {
            return -1;
        }
        return min;
    }

    @Override // org.telegram.ui.c3
    public int getBoundRight() {
        int boundRight;
        this.a.getClass();
        int L = org.telegram.messenger.i0.L(18);
        x3 x3Var = this.x;
        int max = (x3Var == null || x3Var.i == null) ? Integer.MIN_VALUE : Math.max(TLObject.FLAG_31, this.x.i.l() + a() + L);
        z2 z2Var = this.c;
        if (z2Var != null) {
            max = Math.max(max, z2Var.l() + z2Var.s + L);
        }
        org.telegram.ui.Components.ck0 ck0Var = this.d;
        if (ck0Var != null) {
            KeyEvent.Callback callback = ck0Var.a;
            if ((callback instanceof c3) && (boundRight = ((c3) callback).getBoundRight()) != -1) {
                max = Math.max(max, this.n + boundRight);
            }
        }
        if (max == Integer.MIN_VALUE) {
            return -1;
        }
        return max;
    }

    @Override // org.telegram.ui.c3
    public int getLastLineBoundRight() {
        int lastLineBoundRight;
        int i10;
        z2 z2Var = this.c;
        if (z2Var == null) {
            org.telegram.ui.Components.ck0 ck0Var = this.d;
            if (ck0Var != null) {
                KeyEvent.Callback callback = ck0Var.a;
                if ((callback instanceof c3) && (lastLineBoundRight = ((c3) callback).getLastLineBoundRight()) != -1) {
                    i10 = this.n;
                }
            }
            return -1;
        }
        lastLineBoundRight = z2Var.m() + z2Var.s;
        this.a.getClass();
        i10 = org.telegram.messenger.i0.L(18);
        return i10 + lastLineBoundRight;
    }

    public /* bridge */ /* synthetic */ int getMinWidth() {
        return org.telegram.messenger.z20.a(this);
    }

    @Override // org.telegram.ui.Cells.j9
    public final void h(ArrayList arrayList) {
        org.telegram.ui.Components.ck0 ck0Var = this.d;
        if (ck0Var != null) {
            KeyEvent.Callback callback = ck0Var.a;
            if (callback instanceof org.telegram.ui.Cells.j9) {
                ((org.telegram.ui.Cells.j9) callback).h(arrayList);
            }
        }
        z2 z2Var = this.c;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
    }

    @Override // android.view.View, org.telegram.ui.Cells.r9
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.ck0 ck0Var = this.d;
        if (ck0Var != null) {
            ck0Var.a.invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.c;
        if (z2Var != null) {
            z2Var.i(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.c;
        if (z2Var != null) {
            z2Var.f(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.x == null) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        z2 z2Var = this.x.i;
        m60 m60Var = this.a;
        if (z2Var != null) {
            canvas.save();
            f4 f4Var = this.b;
            if (f4Var == null || !f4Var.G) {
                m60Var.getClass();
                int L = org.telegram.messenger.i0.L(15);
                x3 x3Var = this.x;
                canvas.translate(org.telegram.messenger.m5.D(12.0f, this.x.c.f, (L + x3Var.c.c) - ((int) Math.ceil(x3Var.i.d.getLineWidth(0)))), (this.f + this.h) - (this.y ? org.telegram.messenger.i0.L(1.0f) : 0));
            } else {
                m60Var.getClass();
                int L2 = measuredWidth - org.telegram.messenger.i0.L(15);
                y3 y3Var = this.x.c;
                canvas.translate(org.telegram.messenger.z20.A(12.0f, y3Var.f, L2 - y3Var.c), (this.f + this.h) - (this.y ? org.telegram.messenger.i0.L(1.0f) : 0));
            }
            this.x.i.d(canvas, this);
            canvas.restore();
        }
        CheckBoxBase checkBoxBase = this.D;
        if (checkBoxBase != null) {
            checkBoxBase.e(this.e - org.telegram.messenger.i0.L(26.0f), this.f, org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(20.0f));
            this.D.a(canvas);
        }
        if (this.c != null) {
            canvas.save();
            canvas.translate(this.e, this.f);
            h4.t(m60Var, canvas, this, 0);
            this.c.d(canvas, this);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        z2 z2Var = this.c;
        if (z2Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(h4.h(this.a, this.b, z2Var));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.ck0 ck0Var = this.d;
        if (ck0Var != null) {
            View view = ck0Var.a;
            int i14 = this.n;
            view.layout(i14, this.r, view.getMeasuredWidth() + i14, this.d.a.getMeasuredHeight() + this.r);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        m60 m60Var;
        m60 m60Var2;
        int i13;
        int L;
        int L2;
        int i14;
        int i15;
        z2 z2Var;
        a2 a2Var;
        z2 z2Var2;
        int i16;
        org.telegram.ui.Cells.k9 k9Var;
        int size = View.MeasureSpec.getSize(i10);
        x3 x3Var = this.x;
        int i17 = 1;
        if (x3Var != null) {
            this.c = null;
            int i18 = x3Var.j;
            m60 m60Var3 = this.a;
            int i19 = 0;
            if (i18 == 0 && x3Var.c.f == 0) {
                m60Var3.getClass();
                i12 = org.telegram.messenger.i0.L(10);
            } else {
                i12 = 0;
            }
            this.f = i12;
            this.h = 0;
            y3 y3Var = this.x.c;
            if (y3Var.d == size && y3Var.e == org.telegram.messenger.tz.Z0) {
                m60Var = m60Var3;
            } else {
                y3Var.d = size;
                y3Var.e = org.telegram.messenger.tz.Z0;
                y3Var.c = 0;
                int size2 = y3Var.b.size();
                boolean z10 = true;
                int i20 = 0;
                while (i20 < size2) {
                    x3 x3Var2 = (x3) this.x.c.b.get(i20);
                    String str = x3Var2.f;
                    if (str != null) {
                        if (x3Var2.a && "•".equalsIgnoreCase(str)) {
                            x3Var2.i = null;
                        } else {
                            String str2 = x3Var2.f;
                            m60Var3.getClass();
                            m60 m60Var4 = m60Var3;
                            m60Var2 = m60Var4;
                            x3Var2.i = h4.o(m60Var4, this, str2, null, size - org.telegram.messenger.i0.L(54), this.f, this.x, this.b);
                            y3 y3Var2 = this.x.c;
                            y3Var2.c = Math.max(y3Var2.c, (int) Math.ceil(r2.d.getLineWidth(0)));
                            z10 = false;
                            i20++;
                            m60Var3 = m60Var2;
                        }
                    }
                    m60Var2 = m60Var3;
                    i20++;
                    m60Var3 = m60Var2;
                }
                m60Var = m60Var3;
                if (h4.o1 != null && !z10) {
                    y3 y3Var3 = this.x.c;
                    y3Var3.c = Math.max(y3Var3.c, (int) Math.ceil(r2.measureText("00.")));
                }
            }
            x3 x3Var3 = this.x;
            this.y = !x3Var3.c.a.ordered;
            if (x3Var3.a) {
                if (this.D == null) {
                    m60Var.getClass();
                    CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, null);
                    this.D = checkBoxBase;
                    checkBoxBase.h(org.telegram.ui.ActionBar.t6.Vl, org.telegram.ui.ActionBar.t6.z5, org.telegram.ui.ActionBar.t6.k7);
                    this.D.d(10);
                    this.D.k(true);
                    this.D.i(org.telegram.messenger.i0.L(5.0f));
                }
                this.D.f(-1, this.x.b, false);
            } else {
                this.D = null;
            }
            f4 f4Var = this.b;
            if (f4Var == null || !f4Var.G) {
                m60Var.getClass();
                int L3 = org.telegram.messenger.i0.L((this.D == null ? 0 : 26) + 24);
                y3 y3Var4 = this.x.c;
                this.e = org.telegram.messenger.m5.D(12.0f, y3Var4.f, L3 + y3Var4.c);
            } else {
                m60Var.getClass();
                this.e = org.telegram.messenger.i0.L((this.D == null ? 0 : 26) + 18);
            }
            m60Var.getClass();
            float f7 = 18;
            int L4 = (size - org.telegram.messenger.i0.L(f7)) - this.e;
            if (f4Var != null && f4Var.G) {
                int L5 = org.telegram.messenger.i0.L(6.0f);
                y3 y3Var5 = this.x.c;
                L4 -= (org.telegram.messenger.i0.L(12.0f) * y3Var5.f) + (L5 + y3Var5.c);
            }
            x3 x3Var4 = this.x;
            int i21 = L4;
            TL_iv.RichText richText = x3Var4.e;
            if (richText != null) {
                z2 n10 = h4.n(this.a, this, null, richText, i21, 0, x3Var4, (f4Var == null || !f4Var.G) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.ov0.a(), 0, this.b);
                this.c = n10;
                if (n10 != null && n10.d.getLineCount() > 0) {
                    z2 z2Var3 = this.x.i;
                    if (z2Var3 != null && z2Var3.d.getLineCount() > 0) {
                        this.h = (org.telegram.messenger.i0.L(2.5f) + this.x.i.d.getLineAscent(0)) - this.c.d.getLineAscent(0);
                    }
                    i13 = this.c.d.getHeight();
                    L = org.telegram.messenger.i0.L(8);
                    i16 = L + i13;
                }
                i16 = 0;
            } else {
                TL_iv.PageBlock pageBlock = x3Var4.d;
                if (pageBlock != null) {
                    int i22 = this.e;
                    this.n = i22;
                    int i23 = this.f;
                    this.r = i23;
                    org.telegram.ui.Components.ck0 ck0Var = this.d;
                    if (ck0Var != null) {
                        View view = ck0Var.a;
                        if (view instanceof a2) {
                            float f10 = 8;
                            this.r = i23 - org.telegram.messenger.i0.L(f10);
                            if (f4Var == null || !f4Var.G) {
                                this.n -= org.telegram.messenger.i0.L(f7);
                            }
                            int L6 = i21 + org.telegram.messenger.i0.L(f7);
                            i15 = 0 - org.telegram.messenger.i0.L(f10);
                            i14 = L6;
                        } else {
                            if ((view instanceof u1) || (view instanceof p2) || (view instanceof t2) || (view instanceof q2)) {
                                if (f4Var == null || !f4Var.G) {
                                    this.n = i22 - org.telegram.messenger.i0.L(f7);
                                }
                                L2 = org.telegram.messenger.i0.L(f7);
                            } else if (h4.J(pageBlock)) {
                                this.n = 0;
                                this.r = 0;
                                this.f = 0;
                                x3 x3Var5 = this.x;
                                i15 = ((x3Var5.j == 0 && x3Var5.c.f == 0) ? 0 - org.telegram.messenger.i0.L(10) : 0) - org.telegram.messenger.i0.L(8);
                                i14 = size;
                            } else if (this.d.a instanceof s2) {
                                this.n -= org.telegram.messenger.i0.L(f7);
                                L2 = org.telegram.messenger.i0.L(36);
                            } else {
                                i14 = i21;
                                i15 = 0;
                            }
                            i14 = L2 + i21;
                            i15 = 0;
                        }
                        this.d.a.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
                        if ((this.d.a instanceof a2) && (z2Var = this.x.i) != null && z2Var.d.getLineCount() > 0 && (z2Var2 = (a2Var = (a2) this.d.a).c) != null && z2Var2.d.getLineCount() > 0) {
                            this.h = (org.telegram.messenger.i0.L(2.5f) + this.x.i.d.getLineAscent(0)) - a2Var.c.d.getLineAscent(0);
                        }
                        x3 x3Var6 = this.x;
                        if (x3Var6.d instanceof TL_iv.pageBlockDetails) {
                            this.s = true;
                            this.r = 0;
                            if (x3Var6.j == 0 && x3Var6.c.f == 0) {
                                i15 -= org.telegram.messenger.i0.L(10);
                            }
                            i15 -= org.telegram.messenger.i0.L(8);
                        } else {
                            View view2 = this.d.a;
                            if (view2 instanceof z1) {
                                this.s = ((z1) view2).w;
                            } else if (view2 instanceof w1) {
                                this.s = ((w1) view2).s;
                            }
                        }
                        if (this.s && this.x.i != null) {
                            this.f = ((this.d.a.getMeasuredHeight() - this.x.i.d.getHeight()) / 2) - org.telegram.messenger.i0.L(4.0f);
                            this.y = false;
                        }
                        i13 = this.d.a.getMeasuredHeight() + i15;
                    } else {
                        i13 = 0;
                    }
                    L = org.telegram.messenger.i0.L(8);
                    i16 = L + i13;
                }
                i16 = 0;
            }
            if (i0.a.g(1, this.x.c.b) == this.x) {
                i16 += org.telegram.messenger.i0.L(8);
            }
            x3 x3Var7 = this.x;
            i17 = (x3Var7.j == 0 && x3Var7.c.f == 0) ? org.telegram.messenger.i0.L(10) + i16 : i16;
            z2 z2Var4 = this.c;
            if (z2Var4 != null) {
                z2Var4.s = this.e;
                z2Var4.w = this.f;
            }
            org.telegram.ui.Components.ck0 ck0Var2 = this.d;
            if (ck0Var2 != null && (ck0Var2.a instanceof org.telegram.ui.Cells.j9) && (k9Var = ((h4) m60Var).P0) != null) {
                ArrayList arrayList = k9Var.A0;
                arrayList.clear();
                ((org.telegram.ui.Cells.j9) this.d.a).h(arrayList);
                int size3 = arrayList.size();
                while (i19 < size3) {
                    Object obj = arrayList.get(i19);
                    i19++;
                    org.telegram.ui.Cells.u9 u9Var = (org.telegram.ui.Cells.u9) obj;
                    if (u9Var instanceof z2) {
                        z2 z2Var5 = (z2) u9Var;
                        z2Var5.s += this.n;
                        z2Var5.w += this.r;
                    }
                }
            }
        }
        setMeasuredDimension(size, i17);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (h4.j(this.a, this.b, motionEvent, this, this.c, this.e, this.f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(x3 x3Var) {
        x3 x3Var2 = this.x;
        f4 f4Var = this.b;
        if (x3Var2 != x3Var) {
            this.x = x3Var;
            org.telegram.ui.Components.ck0 ck0Var = this.d;
            if (ck0Var != null) {
                removeView(ck0Var.a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.x.d;
            if (pageBlock != null && f4Var != null) {
                int I = f4.I(pageBlock);
                this.w = I;
                s4.c1 w9 = f4Var.w(this, I);
                this.d = (org.telegram.ui.Components.ck0) w9;
                addView(w9.a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.x.d;
        if (pageBlock2 != null && f4Var != null) {
            f4Var.H(this.w, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
