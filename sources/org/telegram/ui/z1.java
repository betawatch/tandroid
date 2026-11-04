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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class z1 extends ViewGroup implements org.telegram.ui.Cells.g9, d3 {
    public final i50 a;
    public final g4 b;
    public a3 c;
    public org.telegram.ui.Components.bj0 d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;
    public int s;
    public boolean w;
    public z3 x;
    public CheckBoxBase y;

    public z1(Context context, i50 i50Var, g4 g4Var) {
        super(context);
        this.a = i50Var;
        this.b = g4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        z3 z3Var = this.x;
        if ((z3Var != null ? z3Var.i : null) == null) {
            return 0;
        }
        i50 i50Var = this.a;
        g4 g4Var = this.b;
        if (g4Var == null || !g4Var.H) {
            i50Var.getClass();
            return org.telegram.messenger.k5.D(20.0f, this.x.c.e, (org.telegram.messenger.g0.L(18) + this.x.c.b) - ((int) Math.ceil(r0.d.getLineWidth(0))));
        }
        int measuredWidth = getMeasuredWidth();
        i50Var.getClass();
        int L = measuredWidth - org.telegram.messenger.g0.L(18);
        a4 a4Var = this.x.c;
        return org.telegram.messenger.camera.q.A(20.0f, a4Var.e, L - a4Var.b);
    }

    @Override // org.telegram.ui.d3
    public int getBoundLeft() {
        int boundLeft;
        this.a.getClass();
        int L = org.telegram.messenger.g0.L(18);
        z3 z3Var = this.x;
        int min = (z3Var == null || z3Var.i == null) ? Integer.MAX_VALUE : Math.min(ConnectionsManager.DEFAULT_DATACENTER_ID, (this.x.i.k() + a()) - L);
        a3 a3Var = this.c;
        if (a3Var != null) {
            min = Math.min(min, (a3Var.k() + a3Var.s) - L);
        }
        org.telegram.ui.Components.bj0 bj0Var = this.d;
        if (bj0Var != null) {
            KeyEvent.Callback callback = bj0Var.a;
            if ((callback instanceof d3) && (boundLeft = ((d3) callback).getBoundLeft()) != -1) {
                min = Math.min(min, this.n + boundLeft);
            }
        }
        if (min == Integer.MAX_VALUE) {
            return -1;
        }
        return min;
    }

    @Override // org.telegram.ui.d3
    public int getBoundRight() {
        int boundRight;
        this.a.getClass();
        int L = org.telegram.messenger.g0.L(18);
        z3 z3Var = this.x;
        int max = (z3Var == null || z3Var.i == null) ? Integer.MIN_VALUE : Math.max(TLObject.FLAG_31, this.x.i.l() + a() + L);
        a3 a3Var = this.c;
        if (a3Var != null) {
            max = Math.max(max, a3Var.l() + a3Var.s + L);
        }
        org.telegram.ui.Components.bj0 bj0Var = this.d;
        if (bj0Var != null) {
            KeyEvent.Callback callback = bj0Var.a;
            if ((callback instanceof d3) && (boundRight = ((d3) callback).getBoundRight()) != -1) {
                max = Math.max(max, this.n + boundRight);
            }
        }
        if (max == Integer.MIN_VALUE) {
            return -1;
        }
        return max;
    }

    @Override // org.telegram.ui.d3
    public int getLastLineBoundRight() {
        int lastLineBoundRight;
        int i3;
        a3 a3Var = this.c;
        if (a3Var == null) {
            org.telegram.ui.Components.bj0 bj0Var = this.d;
            if (bj0Var != null) {
                KeyEvent.Callback callback = bj0Var.a;
                if ((callback instanceof d3) && (lastLineBoundRight = ((d3) callback).getLastLineBoundRight()) != -1) {
                    i3 = this.n;
                }
            }
            return -1;
        }
        lastLineBoundRight = a3Var.m() + a3Var.s;
        this.a.getClass();
        i3 = org.telegram.messenger.g0.L(18);
        return i3 + lastLineBoundRight;
    }

    public /* bridge */ /* synthetic */ int getMinWidth() {
        return org.telegram.messenger.camera.q.a(this);
    }

    @Override // android.view.View, org.telegram.ui.Cells.p9
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.bj0 bj0Var = this.d;
        if (bj0Var != null) {
            bj0Var.a.invalidate();
        }
    }

    @Override // org.telegram.ui.Cells.g9
    public final void k(ArrayList arrayList) {
        org.telegram.ui.Components.bj0 bj0Var = this.d;
        if (bj0Var != null) {
            KeyEvent.Callback callback = bj0Var.a;
            if (callback instanceof org.telegram.ui.Cells.g9) {
                ((org.telegram.ui.Cells.g9) callback).k(arrayList);
            }
        }
        a3 a3Var = this.c;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.c;
        if (a3Var != null) {
            a3Var.i(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.c;
        if (a3Var != null) {
            a3Var.f(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.x == null) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        a3 a3Var = this.x.i;
        i50 i50Var = this.a;
        if (a3Var != null) {
            canvas.save();
            g4 g4Var = this.b;
            if (g4Var == null || !g4Var.H) {
                i50Var.getClass();
                int L = org.telegram.messenger.g0.L(18);
                z3 z3Var = this.x;
                canvas.translate(org.telegram.messenger.k5.D(20.0f, this.x.c.e, (L + z3Var.c.b) - ((int) Math.ceil(z3Var.i.d.getLineWidth(0)))), this.f + this.h);
            } else {
                i50Var.getClass();
                int L2 = measuredWidth - org.telegram.messenger.g0.L(18);
                a4 a4Var = this.x.c;
                canvas.translate(org.telegram.messenger.camera.q.A(20.0f, a4Var.e, L2 - a4Var.b), this.f + this.h);
            }
            this.x.i.d(canvas, this);
            canvas.restore();
        }
        CheckBoxBase checkBoxBase = this.y;
        if (checkBoxBase != null) {
            checkBoxBase.e(this.e - org.telegram.messenger.g0.L(26.0f), this.f, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f));
            this.y.a(canvas);
        }
        if (this.c != null) {
            canvas.save();
            canvas.translate(this.e, this.f);
            i4.t(i50Var, canvas, this, 0);
            this.c.d(canvas, this);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        a3 a3Var = this.c;
        if (a3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(i4.h(this.a, this.b, a3Var));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        org.telegram.ui.Components.bj0 bj0Var = this.d;
        if (bj0Var != null) {
            View view = bj0Var.a;
            int i13 = this.n;
            view.layout(i13, this.r, view.getMeasuredWidth() + i13, this.d.a.getMeasuredHeight() + this.r);
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
    public final void onMeasure(int i3, int i10) {
        i50 i50Var;
        i50 i50Var2;
        int i11;
        int L;
        int L2;
        int i12;
        int i13;
        a3 a3Var;
        a2 a2Var;
        a3 a3Var2;
        a3 a3Var3;
        org.telegram.ui.Components.bj0 bj0Var;
        org.telegram.ui.Cells.h9 h9Var;
        int size;
        int size2 = View.MeasureSpec.getSize(i3);
        z3 z3Var = this.x;
        int i14 = 1;
        if (z3Var != null) {
            this.c = null;
            int i15 = 0;
            this.f = (z3Var.j == 0 && z3Var.c.e == 0) ? org.telegram.messenger.g0.L(10.0f) : 0;
            this.h = 0;
            a4 a4Var = this.x.c;
            int i16 = a4Var.c;
            i50 i50Var3 = this.a;
            if (i16 == size2 && a4Var.d == org.telegram.messenger.az.Z0) {
                i50Var = i50Var3;
            } else {
                a4Var.c = size2;
                a4Var.d = org.telegram.messenger.az.Z0;
                a4Var.b = 0;
                int size3 = a4Var.a.size();
                int i17 = 0;
                while (i17 < size3) {
                    z3 z3Var2 = (z3) this.x.c.a.get(i17);
                    String str = z3Var2.f;
                    if (str == null) {
                        i50Var2 = i50Var3;
                    } else {
                        i50Var3.getClass();
                        i50 i50Var4 = i50Var3;
                        i50Var2 = i50Var4;
                        z3Var2.i = i4.o(i50Var4, this, str, null, size2 - org.telegram.messenger.g0.L(54), this.f, this.x, this.b);
                        a4 a4Var2 = this.x.c;
                        a4Var2.b = Math.max(a4Var2.b, (int) Math.ceil(r2.d.getLineWidth(0)));
                    }
                    i17++;
                    i50Var3 = i50Var2;
                }
                i50Var = i50Var3;
                a4 a4Var3 = this.x.c;
                a4Var3.b = Math.max(a4Var3.b, (int) Math.ceil(i4.p1.measureText("00.")));
            }
            if (this.x.a) {
                if (this.y == null) {
                    i50Var.getClass();
                    CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, null);
                    this.y = checkBoxBase;
                    checkBoxBase.h(org.telegram.ui.ActionBar.k6.Vl, org.telegram.ui.ActionBar.k6.z5, org.telegram.ui.ActionBar.k6.k7);
                    this.y.d(10);
                    this.y.k(true);
                    this.y.i(org.telegram.messenger.g0.L(5.0f));
                }
                this.y.f(-1, this.x.b, false);
            } else {
                this.y = null;
            }
            g4 g4Var = this.b;
            if (g4Var == null || !g4Var.H) {
                i50Var.getClass();
                int L3 = org.telegram.messenger.g0.L((this.y == null ? 0 : 26) + 24);
                a4 a4Var4 = this.x.c;
                this.e = org.telegram.messenger.k5.D(20.0f, a4Var4.e, L3 + a4Var4.b);
            } else {
                i50Var.getClass();
                this.e = org.telegram.messenger.g0.L((this.y == null ? 0 : 26) + 18);
            }
            this.w = false;
            i50Var.getClass();
            float f10 = 18;
            int L4 = (size2 - org.telegram.messenger.g0.L(f10)) - this.e;
            if (g4Var != null && g4Var.H) {
                int L5 = org.telegram.messenger.g0.L(6.0f);
                a4 a4Var5 = this.x.c;
                L4 -= (org.telegram.messenger.g0.L(20.0f) * a4Var5.e) + (L5 + a4Var5.b);
            }
            z3 z3Var3 = this.x;
            int i18 = L4;
            TL_iv.RichText richText = z3Var3.e;
            if (richText != null) {
                a3 n4 = i4.n(this.a, this, null, richText, i18, 0, z3Var3, (g4Var == null || !g4Var.H) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.lu0.a(), 0, this.b);
                this.c = n4;
                if (n4 != null && n4.d.getLineCount() > 0) {
                    a3 a3Var4 = this.x.i;
                    if (a3Var4 != null && a3Var4.d.getLineCount() > 0) {
                        this.h = this.x.i.d.getLineAscent(0) - this.c.d.getLineAscent(0);
                    }
                    L = org.telegram.messenger.g0.L(8.0f) + this.c.d.getHeight();
                    if (k2.p1.h(1, this.x.c.a) == this.x) {
                        L += org.telegram.messenger.g0.L(8.0f);
                    }
                    z3 z3Var4 = this.x;
                    i14 = (z3Var4.j == 0 || z3Var4.c.e != 0) ? L : org.telegram.messenger.g0.L(10.0f) + L;
                    a3Var3 = this.c;
                    if (a3Var3 != null) {
                        a3Var3.s = this.e;
                        a3Var3.w = this.f;
                        a3 a3Var5 = this.x.i;
                        if (a3Var5 != null) {
                            a3Var3.y = a3Var5.d.getText();
                        }
                    }
                    bj0Var = this.d;
                    if (bj0Var != null && (bj0Var.a instanceof org.telegram.ui.Cells.g9) && (h9Var = ((i4) i50Var).Q0) != null) {
                        ArrayList arrayList = h9Var.A0;
                        arrayList.clear();
                        ((org.telegram.ui.Cells.g9) this.d.a).k(arrayList);
                        size = arrayList.size();
                        while (i15 < size) {
                            Object obj = arrayList.get(i15);
                            i15++;
                            org.telegram.ui.Cells.s9 s9Var = (org.telegram.ui.Cells.s9) obj;
                            if (s9Var instanceof a3) {
                                a3 a3Var6 = (a3) s9Var;
                                a3Var6.s += this.n;
                                a3Var6.w += this.r;
                            }
                        }
                    }
                }
                L = 0;
                if (k2.p1.h(1, this.x.c.a) == this.x) {
                }
                z3 z3Var42 = this.x;
                if (z3Var42.j == 0) {
                }
                a3Var3 = this.c;
                if (a3Var3 != null) {
                }
                bj0Var = this.d;
                if (bj0Var != null) {
                    ArrayList arrayList2 = h9Var.A0;
                    arrayList2.clear();
                    ((org.telegram.ui.Cells.g9) this.d.a).k(arrayList2);
                    size = arrayList2.size();
                    while (i15 < size) {
                    }
                }
            } else {
                TL_iv.PageBlock pageBlock = z3Var3.d;
                if (pageBlock != null) {
                    int i19 = this.e;
                    this.n = i19;
                    int i20 = this.f;
                    this.r = i20;
                    org.telegram.ui.Components.bj0 bj0Var2 = this.d;
                    if (bj0Var2 != null) {
                        View view = bj0Var2.a;
                        if (view instanceof a2) {
                            this.r = i20 - org.telegram.messenger.g0.L(8.0f);
                            if (g4Var == null || !g4Var.H) {
                                this.n -= org.telegram.messenger.g0.L(f10);
                            }
                            i12 = org.telegram.messenger.g0.L(18.0f) + i18;
                            i13 = 0 - org.telegram.messenger.g0.L(8.0f);
                        } else {
                            if ((view instanceof u1) || (view instanceof q2) || (view instanceof u2) || (view instanceof r2)) {
                                if (g4Var == null || !g4Var.H) {
                                    this.n = i19 - org.telegram.messenger.g0.L(f10);
                                }
                                L2 = org.telegram.messenger.g0.L(f10);
                            } else if (i4.J(pageBlock)) {
                                this.n = 0;
                                this.r = 0;
                                this.f = 0;
                                i13 = 0 - org.telegram.messenger.g0.L(8.0f);
                                i12 = size2;
                            } else if (this.d.a instanceof t2) {
                                this.n -= org.telegram.messenger.g0.L(f10);
                                L2 = org.telegram.messenger.g0.L(36.0f);
                            } else {
                                i12 = i18;
                                i13 = 0;
                            }
                            i12 = L2 + i18;
                            i13 = 0;
                        }
                        this.d.a.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
                        if ((this.d.a instanceof a2) && (a3Var = this.x.i) != null && a3Var.d.getLineCount() > 0 && (a3Var2 = (a2Var = (a2) this.d.a).c) != null && a3Var2.d.getLineCount() > 0) {
                            this.h = this.x.i.d.getLineAscent(0) - a2Var.c.d.getLineAscent(0);
                        }
                        if (this.x.d instanceof TL_iv.pageBlockDetails) {
                            this.w = true;
                            this.r = 0;
                            i13 -= org.telegram.messenger.g0.L(8.0f);
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
                        i11 = this.d.a.getMeasuredHeight() + i13;
                    } else {
                        i11 = 0;
                    }
                    L = i11 + org.telegram.messenger.g0.L(8.0f);
                    if (k2.p1.h(1, this.x.c.a) == this.x) {
                    }
                    z3 z3Var422 = this.x;
                    if (z3Var422.j == 0) {
                    }
                    a3Var3 = this.c;
                    if (a3Var3 != null) {
                    }
                    bj0Var = this.d;
                    if (bj0Var != null) {
                    }
                }
                L = 0;
                if (k2.p1.h(1, this.x.c.a) == this.x) {
                }
                z3 z3Var4222 = this.x;
                if (z3Var4222.j == 0) {
                }
                a3Var3 = this.c;
                if (a3Var3 != null) {
                }
                bj0Var = this.d;
                if (bj0Var != null) {
                }
            }
        }
        setMeasuredDimension(size2, i14);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (i4.j(this.a, this.b, motionEvent, this, this.c, this.e, this.f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(z3 z3Var) {
        z3 z3Var2 = this.x;
        g4 g4Var = this.b;
        if (z3Var2 != z3Var) {
            this.x = z3Var;
            org.telegram.ui.Components.bj0 bj0Var = this.d;
            if (bj0Var != null) {
                removeView(bj0Var.a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.x.d;
            if (pageBlock != null && g4Var != null) {
                int I = g4.I(pageBlock);
                this.s = I;
                u4.d1 x10 = g4Var.x(this, I);
                this.d = (org.telegram.ui.Components.bj0) x10;
                addView(x10.a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.x.d;
        if (pageBlock2 != null && g4Var != null) {
            g4Var.H(this.s, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
