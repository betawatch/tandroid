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
public final class z1 extends ViewGroup implements org.telegram.ui.Cells.j9, c3 {
    public final m60 a;
    public final f4 b;
    public z2 c;
    public org.telegram.ui.Components.ck0 d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;
    public int s;
    public boolean w;
    public z3 x;
    public CheckBoxBase y;

    public z1(Context context, m60 m60Var, f4 f4Var) {
        super(context);
        this.a = m60Var;
        this.b = f4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        z3 z3Var = this.x;
        if ((z3Var != null ? z3Var.i : null) == null) {
            return 0;
        }
        m60 m60Var = this.a;
        f4 f4Var = this.b;
        if (f4Var == null || !f4Var.G) {
            m60Var.getClass();
            return org.telegram.messenger.m5.D(20.0f, this.x.c.e, (org.telegram.messenger.i0.L(18) + this.x.c.b) - ((int) Math.ceil(r0.d.getLineWidth(0))));
        }
        int measuredWidth = getMeasuredWidth();
        m60Var.getClass();
        int L = measuredWidth - org.telegram.messenger.i0.L(18);
        a4 a4Var = this.x.c;
        return org.telegram.messenger.z20.A(20.0f, a4Var.e, L - a4Var.b);
    }

    @Override // org.telegram.ui.c3
    public int getBoundLeft() {
        int boundLeft;
        this.a.getClass();
        int L = org.telegram.messenger.i0.L(18);
        z3 z3Var = this.x;
        int min = (z3Var == null || z3Var.i == null) ? Integer.MAX_VALUE : Math.min(ConnectionsManager.DEFAULT_DATACENTER_ID, (this.x.i.k() + a()) - L);
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
        z3 z3Var = this.x;
        int max = (z3Var == null || z3Var.i == null) ? Integer.MIN_VALUE : Math.max(TLObject.FLAG_31, this.x.i.l() + a() + L);
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
                int L = org.telegram.messenger.i0.L(18);
                z3 z3Var = this.x;
                canvas.translate(org.telegram.messenger.m5.D(20.0f, this.x.c.e, (L + z3Var.c.b) - ((int) Math.ceil(z3Var.i.d.getLineWidth(0)))), this.f + this.h);
            } else {
                m60Var.getClass();
                int L2 = measuredWidth - org.telegram.messenger.i0.L(18);
                a4 a4Var = this.x.c;
                canvas.translate(org.telegram.messenger.z20.A(20.0f, a4Var.e, L2 - a4Var.b), this.f + this.h);
            }
            this.x.i.d(canvas, this);
            canvas.restore();
        }
        CheckBoxBase checkBoxBase = this.y;
        if (checkBoxBase != null) {
            checkBoxBase.e(this.e - org.telegram.messenger.i0.L(26.0f), this.f, org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(20.0f));
            this.y.a(canvas);
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

    /* JADX WARN: Removed duplicated region for block: B:51:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0366  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        m60 m60Var;
        m60 m60Var2;
        int i12;
        int L;
        int L2;
        int i13;
        int i14;
        z2 z2Var;
        a2 a2Var;
        z2 z2Var2;
        z2 z2Var3;
        org.telegram.ui.Components.ck0 ck0Var;
        org.telegram.ui.Cells.k9 k9Var;
        int size;
        int size2 = View.MeasureSpec.getSize(i10);
        z3 z3Var = this.x;
        int i15 = 1;
        if (z3Var != null) {
            this.c = null;
            int i16 = 0;
            this.f = (z3Var.j == 0 && z3Var.c.e == 0) ? org.telegram.messenger.i0.L(10.0f) : 0;
            this.h = 0;
            a4 a4Var = this.x.c;
            int i17 = a4Var.c;
            m60 m60Var3 = this.a;
            if (i17 == size2 && a4Var.d == org.telegram.messenger.tz.Z0) {
                m60Var = m60Var3;
            } else {
                a4Var.c = size2;
                a4Var.d = org.telegram.messenger.tz.Z0;
                a4Var.b = 0;
                int size3 = a4Var.a.size();
                int i18 = 0;
                while (i18 < size3) {
                    z3 z3Var2 = (z3) this.x.c.a.get(i18);
                    String str = z3Var2.f;
                    if (str == null) {
                        m60Var2 = m60Var3;
                    } else {
                        m60Var3.getClass();
                        m60 m60Var4 = m60Var3;
                        m60Var2 = m60Var4;
                        z3Var2.i = h4.o(m60Var4, this, str, null, size2 - org.telegram.messenger.i0.L(54), this.f, this.x, this.b);
                        a4 a4Var2 = this.x.c;
                        a4Var2.b = Math.max(a4Var2.b, (int) Math.ceil(r2.d.getLineWidth(0)));
                    }
                    i18++;
                    m60Var3 = m60Var2;
                }
                m60Var = m60Var3;
                a4 a4Var3 = this.x.c;
                a4Var3.b = Math.max(a4Var3.b, (int) Math.ceil(h4.o1.measureText("00.")));
            }
            if (this.x.a) {
                if (this.y == null) {
                    m60Var.getClass();
                    CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, null);
                    this.y = checkBoxBase;
                    checkBoxBase.h(org.telegram.ui.ActionBar.t6.Vl, org.telegram.ui.ActionBar.t6.z5, org.telegram.ui.ActionBar.t6.k7);
                    this.y.d(10);
                    this.y.k(true);
                    this.y.i(org.telegram.messenger.i0.L(5.0f));
                }
                this.y.f(-1, this.x.b, false);
            } else {
                this.y = null;
            }
            f4 f4Var = this.b;
            if (f4Var == null || !f4Var.G) {
                m60Var.getClass();
                int L3 = org.telegram.messenger.i0.L((this.y == null ? 0 : 26) + 24);
                a4 a4Var4 = this.x.c;
                this.e = org.telegram.messenger.m5.D(20.0f, a4Var4.e, L3 + a4Var4.b);
            } else {
                m60Var.getClass();
                this.e = org.telegram.messenger.i0.L((this.y == null ? 0 : 26) + 18);
            }
            this.w = false;
            m60Var.getClass();
            float f7 = 18;
            int L4 = (size2 - org.telegram.messenger.i0.L(f7)) - this.e;
            if (f4Var != null && f4Var.G) {
                int L5 = org.telegram.messenger.i0.L(6.0f);
                a4 a4Var5 = this.x.c;
                L4 -= (org.telegram.messenger.i0.L(20.0f) * a4Var5.e) + (L5 + a4Var5.b);
            }
            z3 z3Var3 = this.x;
            int i19 = L4;
            TL_iv.RichText richText = z3Var3.e;
            if (richText != null) {
                z2 n10 = h4.n(this.a, this, null, richText, i19, 0, z3Var3, (f4Var == null || !f4Var.G) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.ov0.a(), 0, this.b);
                this.c = n10;
                if (n10 != null && n10.d.getLineCount() > 0) {
                    z2 z2Var4 = this.x.i;
                    if (z2Var4 != null && z2Var4.d.getLineCount() > 0) {
                        this.h = this.x.i.d.getLineAscent(0) - this.c.d.getLineAscent(0);
                    }
                    L = org.telegram.messenger.i0.L(8.0f) + this.c.d.getHeight();
                    if (i0.a.g(1, this.x.c.a) == this.x) {
                        L += org.telegram.messenger.i0.L(8.0f);
                    }
                    z3 z3Var4 = this.x;
                    i15 = (z3Var4.j == 0 || z3Var4.c.e != 0) ? L : org.telegram.messenger.i0.L(10.0f) + L;
                    z2Var3 = this.c;
                    if (z2Var3 != null) {
                        z2Var3.s = this.e;
                        z2Var3.w = this.f;
                        z2 z2Var5 = this.x.i;
                        if (z2Var5 != null) {
                            z2Var3.y = z2Var5.d.getText();
                        }
                    }
                    ck0Var = this.d;
                    if (ck0Var != null && (ck0Var.a instanceof org.telegram.ui.Cells.j9) && (k9Var = ((h4) m60Var).P0) != null) {
                        ArrayList arrayList = k9Var.A0;
                        arrayList.clear();
                        ((org.telegram.ui.Cells.j9) this.d.a).h(arrayList);
                        size = arrayList.size();
                        while (i16 < size) {
                            Object obj = arrayList.get(i16);
                            i16++;
                            org.telegram.ui.Cells.u9 u9Var = (org.telegram.ui.Cells.u9) obj;
                            if (u9Var instanceof z2) {
                                z2 z2Var6 = (z2) u9Var;
                                z2Var6.s += this.n;
                                z2Var6.w += this.r;
                            }
                        }
                    }
                }
                L = 0;
                if (i0.a.g(1, this.x.c.a) == this.x) {
                }
                z3 z3Var42 = this.x;
                if (z3Var42.j == 0) {
                }
                z2Var3 = this.c;
                if (z2Var3 != null) {
                }
                ck0Var = this.d;
                if (ck0Var != null) {
                    ArrayList arrayList2 = k9Var.A0;
                    arrayList2.clear();
                    ((org.telegram.ui.Cells.j9) this.d.a).h(arrayList2);
                    size = arrayList2.size();
                    while (i16 < size) {
                    }
                }
            } else {
                TL_iv.PageBlock pageBlock = z3Var3.d;
                if (pageBlock != null) {
                    int i20 = this.e;
                    this.n = i20;
                    int i21 = this.f;
                    this.r = i21;
                    org.telegram.ui.Components.ck0 ck0Var2 = this.d;
                    if (ck0Var2 != null) {
                        View view = ck0Var2.a;
                        if (view instanceof a2) {
                            this.r = i21 - org.telegram.messenger.i0.L(8.0f);
                            if (f4Var == null || !f4Var.G) {
                                this.n -= org.telegram.messenger.i0.L(f7);
                            }
                            i13 = org.telegram.messenger.i0.L(18.0f) + i19;
                            i14 = 0 - org.telegram.messenger.i0.L(8.0f);
                        } else {
                            if ((view instanceof u1) || (view instanceof p2) || (view instanceof t2) || (view instanceof q2)) {
                                if (f4Var == null || !f4Var.G) {
                                    this.n = i20 - org.telegram.messenger.i0.L(f7);
                                }
                                L2 = org.telegram.messenger.i0.L(f7);
                            } else if (h4.J(pageBlock)) {
                                this.n = 0;
                                this.r = 0;
                                this.f = 0;
                                i14 = 0 - org.telegram.messenger.i0.L(8.0f);
                                i13 = size2;
                            } else if (this.d.a instanceof s2) {
                                this.n -= org.telegram.messenger.i0.L(f7);
                                L2 = org.telegram.messenger.i0.L(36.0f);
                            } else {
                                i13 = i19;
                                i14 = 0;
                            }
                            i13 = L2 + i19;
                            i14 = 0;
                        }
                        this.d.a.measure(View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
                        if ((this.d.a instanceof a2) && (z2Var = this.x.i) != null && z2Var.d.getLineCount() > 0 && (z2Var2 = (a2Var = (a2) this.d.a).c) != null && z2Var2.d.getLineCount() > 0) {
                            this.h = this.x.i.d.getLineAscent(0) - a2Var.c.d.getLineAscent(0);
                        }
                        if (this.x.d instanceof TL_iv.pageBlockDetails) {
                            this.w = true;
                            this.r = 0;
                            i14 -= org.telegram.messenger.i0.L(8.0f);
                        } else {
                            View view2 = this.d.a;
                            if (view2 instanceof z1) {
                                this.w = ((z1) view2).w;
                            } else if (view2 instanceof w1) {
                                this.w = ((w1) view2).s;
                            }
                        }
                        if (this.w && this.x.i != null) {
                            this.f = (this.d.a.getMeasuredHeight() - this.x.i.d.getHeight()) / 2;
                        }
                        i12 = this.d.a.getMeasuredHeight() + i14;
                    } else {
                        i12 = 0;
                    }
                    L = i12 + org.telegram.messenger.i0.L(8.0f);
                    if (i0.a.g(1, this.x.c.a) == this.x) {
                    }
                    z3 z3Var422 = this.x;
                    if (z3Var422.j == 0) {
                    }
                    z2Var3 = this.c;
                    if (z2Var3 != null) {
                    }
                    ck0Var = this.d;
                    if (ck0Var != null) {
                    }
                }
                L = 0;
                if (i0.a.g(1, this.x.c.a) == this.x) {
                }
                z3 z3Var4222 = this.x;
                if (z3Var4222.j == 0) {
                }
                z2Var3 = this.c;
                if (z2Var3 != null) {
                }
                ck0Var = this.d;
                if (ck0Var != null) {
                }
            }
        }
        setMeasuredDimension(size2, i15);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (h4.j(this.a, this.b, motionEvent, this, this.c, this.e, this.f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(z3 z3Var) {
        z3 z3Var2 = this.x;
        f4 f4Var = this.b;
        if (z3Var2 != z3Var) {
            this.x = z3Var;
            org.telegram.ui.Components.ck0 ck0Var = this.d;
            if (ck0Var != null) {
                removeView(ck0Var.a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.x.d;
            if (pageBlock != null && f4Var != null) {
                int I = f4.I(pageBlock);
                this.s = I;
                s4.c1 w9 = f4Var.w(this, I);
                this.d = (org.telegram.ui.Components.ck0) w9;
                addView(w9.a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.x.d;
        if (pageBlock2 != null && f4Var != null) {
            f4Var.H(this.s, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
