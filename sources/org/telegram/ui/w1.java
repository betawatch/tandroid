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
public final class w1 extends ViewGroup implements org.telegram.ui.Cells.g9, d3 {
    public CheckBoxBase E;
    public final i50 a;
    public final g4 b;
    public a3 c;
    public org.telegram.ui.Components.bj0 d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;
    public boolean s;
    public int w;
    public x3 x;
    public boolean y;

    public w1(Context context, i50 i50Var, g4 g4Var) {
        super(context);
        this.a = i50Var;
        this.b = g4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        x3 x3Var = this.x;
        if ((x3Var != null ? x3Var.i : null) == null) {
            return 0;
        }
        i50 i50Var = this.a;
        g4 g4Var = this.b;
        if (g4Var == null || !g4Var.H) {
            i50Var.getClass();
            return org.telegram.messenger.k5.D(12.0f, this.x.c.f, (org.telegram.messenger.g0.L(15) + this.x.c.c) - ((int) Math.ceil(r0.d.getLineWidth(0))));
        }
        int measuredWidth = getMeasuredWidth();
        i50Var.getClass();
        int L = measuredWidth - org.telegram.messenger.g0.L(15);
        y3 y3Var = this.x.c;
        return org.telegram.messenger.camera.q.A(12.0f, y3Var.f, L - y3Var.c);
    }

    @Override // org.telegram.ui.d3
    public int getBoundLeft() {
        int boundLeft;
        this.a.getClass();
        int L = org.telegram.messenger.g0.L(18);
        int min = this.E != null ? Math.min(ConnectionsManager.DEFAULT_DATACENTER_ID, (this.e - org.telegram.messenger.g0.L(26.0f)) - L) : Integer.MAX_VALUE;
        x3 x3Var = this.x;
        if (x3Var != null && x3Var.i != null) {
            min = Math.min(min, (this.x.i.k() + a()) - L);
        }
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
        x3 x3Var = this.x;
        int max = (x3Var == null || x3Var.i == null) ? Integer.MIN_VALUE : Math.max(TLObject.FLAG_31, this.x.i.l() + a() + L);
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
                int L = org.telegram.messenger.g0.L(15);
                x3 x3Var = this.x;
                canvas.translate(org.telegram.messenger.k5.D(12.0f, this.x.c.f, (L + x3Var.c.c) - ((int) Math.ceil(x3Var.i.d.getLineWidth(0)))), (this.f + this.h) - (this.y ? org.telegram.messenger.g0.L(1.0f) : 0));
            } else {
                i50Var.getClass();
                int L2 = measuredWidth - org.telegram.messenger.g0.L(15);
                y3 y3Var = this.x.c;
                canvas.translate(org.telegram.messenger.camera.q.A(12.0f, y3Var.f, L2 - y3Var.c), (this.f + this.h) - (this.y ? org.telegram.messenger.g0.L(1.0f) : 0));
            }
            this.x.i.d(canvas, this);
            canvas.restore();
        }
        CheckBoxBase checkBoxBase = this.E;
        if (checkBoxBase != null) {
            checkBoxBase.e(this.e - org.telegram.messenger.g0.L(26.0f), this.f, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f));
            this.E.a(canvas);
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

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        int i11;
        i50 i50Var;
        i50 i50Var2;
        int i12;
        int L;
        int L2;
        int i13;
        int i14;
        a3 a3Var;
        a2 a2Var;
        a3 a3Var2;
        int i15;
        org.telegram.ui.Cells.h9 h9Var;
        int size = View.MeasureSpec.getSize(i3);
        x3 x3Var = this.x;
        int i16 = 1;
        if (x3Var != null) {
            this.c = null;
            int i17 = x3Var.j;
            i50 i50Var3 = this.a;
            int i18 = 0;
            if (i17 == 0 && x3Var.c.f == 0) {
                i50Var3.getClass();
                i11 = org.telegram.messenger.g0.L(10);
            } else {
                i11 = 0;
            }
            this.f = i11;
            this.h = 0;
            y3 y3Var = this.x.c;
            if (y3Var.d == size && y3Var.e == org.telegram.messenger.az.Z0) {
                i50Var = i50Var3;
            } else {
                y3Var.d = size;
                y3Var.e = org.telegram.messenger.az.Z0;
                y3Var.c = 0;
                int size2 = y3Var.b.size();
                boolean z10 = true;
                int i19 = 0;
                while (i19 < size2) {
                    x3 x3Var2 = (x3) this.x.c.b.get(i19);
                    String str = x3Var2.f;
                    if (str != null) {
                        if (x3Var2.a && "•".equalsIgnoreCase(str)) {
                            x3Var2.i = null;
                        } else {
                            String str2 = x3Var2.f;
                            i50Var3.getClass();
                            i50 i50Var4 = i50Var3;
                            i50Var2 = i50Var4;
                            x3Var2.i = i4.o(i50Var4, this, str2, null, size - org.telegram.messenger.g0.L(54), this.f, this.x, this.b);
                            y3 y3Var2 = this.x.c;
                            y3Var2.c = Math.max(y3Var2.c, (int) Math.ceil(r2.d.getLineWidth(0)));
                            z10 = false;
                            i19++;
                            i50Var3 = i50Var2;
                        }
                    }
                    i50Var2 = i50Var3;
                    i19++;
                    i50Var3 = i50Var2;
                }
                i50Var = i50Var3;
                if (i4.p1 != null && !z10) {
                    y3 y3Var3 = this.x.c;
                    y3Var3.c = Math.max(y3Var3.c, (int) Math.ceil(r2.measureText("00.")));
                }
            }
            x3 x3Var3 = this.x;
            this.y = !x3Var3.c.a.ordered;
            if (x3Var3.a) {
                if (this.E == null) {
                    i50Var.getClass();
                    CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, null);
                    this.E = checkBoxBase;
                    checkBoxBase.h(org.telegram.ui.ActionBar.k6.Vl, org.telegram.ui.ActionBar.k6.z5, org.telegram.ui.ActionBar.k6.k7);
                    this.E.d(10);
                    this.E.k(true);
                    this.E.i(org.telegram.messenger.g0.L(5.0f));
                }
                this.E.f(-1, this.x.b, false);
            } else {
                this.E = null;
            }
            g4 g4Var = this.b;
            if (g4Var == null || !g4Var.H) {
                i50Var.getClass();
                int L3 = org.telegram.messenger.g0.L((this.E == null ? 0 : 26) + 24);
                y3 y3Var4 = this.x.c;
                this.e = org.telegram.messenger.k5.D(12.0f, y3Var4.f, L3 + y3Var4.c);
            } else {
                i50Var.getClass();
                this.e = org.telegram.messenger.g0.L((this.E == null ? 0 : 26) + 18);
            }
            i50Var.getClass();
            float f10 = 18;
            int L4 = (size - org.telegram.messenger.g0.L(f10)) - this.e;
            if (g4Var != null && g4Var.H) {
                int L5 = org.telegram.messenger.g0.L(6.0f);
                y3 y3Var5 = this.x.c;
                L4 -= (org.telegram.messenger.g0.L(12.0f) * y3Var5.f) + (L5 + y3Var5.c);
            }
            x3 x3Var4 = this.x;
            int i20 = L4;
            TL_iv.RichText richText = x3Var4.e;
            if (richText != null) {
                a3 n4 = i4.n(this.a, this, null, richText, i20, 0, x3Var4, (g4Var == null || !g4Var.H) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.lu0.a(), 0, this.b);
                this.c = n4;
                if (n4 != null && n4.d.getLineCount() > 0) {
                    a3 a3Var3 = this.x.i;
                    if (a3Var3 != null && a3Var3.d.getLineCount() > 0) {
                        this.h = (org.telegram.messenger.g0.L(2.5f) + this.x.i.d.getLineAscent(0)) - this.c.d.getLineAscent(0);
                    }
                    i12 = this.c.d.getHeight();
                    L = org.telegram.messenger.g0.L(8);
                    i15 = L + i12;
                }
                i15 = 0;
            } else {
                TL_iv.PageBlock pageBlock = x3Var4.d;
                if (pageBlock != null) {
                    int i21 = this.e;
                    this.n = i21;
                    int i22 = this.f;
                    this.r = i22;
                    org.telegram.ui.Components.bj0 bj0Var = this.d;
                    if (bj0Var != null) {
                        View view = bj0Var.a;
                        if (view instanceof a2) {
                            float f11 = 8;
                            this.r = i22 - org.telegram.messenger.g0.L(f11);
                            if (g4Var == null || !g4Var.H) {
                                this.n -= org.telegram.messenger.g0.L(f10);
                            }
                            int L6 = i20 + org.telegram.messenger.g0.L(f10);
                            i14 = 0 - org.telegram.messenger.g0.L(f11);
                            i13 = L6;
                        } else {
                            if ((view instanceof u1) || (view instanceof q2) || (view instanceof u2) || (view instanceof r2)) {
                                if (g4Var == null || !g4Var.H) {
                                    this.n = i21 - org.telegram.messenger.g0.L(f10);
                                }
                                L2 = org.telegram.messenger.g0.L(f10);
                            } else if (i4.J(pageBlock)) {
                                this.n = 0;
                                this.r = 0;
                                this.f = 0;
                                x3 x3Var5 = this.x;
                                i14 = ((x3Var5.j == 0 && x3Var5.c.f == 0) ? 0 - org.telegram.messenger.g0.L(10) : 0) - org.telegram.messenger.g0.L(8);
                                i13 = size;
                            } else if (this.d.a instanceof t2) {
                                this.n -= org.telegram.messenger.g0.L(f10);
                                L2 = org.telegram.messenger.g0.L(36);
                            } else {
                                i13 = i20;
                                i14 = 0;
                            }
                            i13 = L2 + i20;
                            i14 = 0;
                        }
                        this.d.a.measure(View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
                        if ((this.d.a instanceof a2) && (a3Var = this.x.i) != null && a3Var.d.getLineCount() > 0 && (a3Var2 = (a2Var = (a2) this.d.a).c) != null && a3Var2.d.getLineCount() > 0) {
                            this.h = (org.telegram.messenger.g0.L(2.5f) + this.x.i.d.getLineAscent(0)) - a2Var.c.d.getLineAscent(0);
                        }
                        x3 x3Var6 = this.x;
                        if (x3Var6.d instanceof TL_iv.pageBlockDetails) {
                            this.s = true;
                            this.r = 0;
                            if (x3Var6.j == 0 && x3Var6.c.f == 0) {
                                i14 -= org.telegram.messenger.g0.L(10);
                            }
                            i14 -= org.telegram.messenger.g0.L(8);
                        } else {
                            View view2 = this.d.a;
                            if (view2 instanceof z1) {
                                this.s = ((z1) view2).w;
                            } else if (view2 instanceof w1) {
                                this.s = ((w1) view2).s;
                            }
                        }
                        if (this.s && this.x.i != null) {
                            this.f = ((this.d.a.getMeasuredHeight() - this.x.i.d.getHeight()) / 2) - org.telegram.messenger.g0.L(4.0f);
                            this.y = false;
                        }
                        i12 = this.d.a.getMeasuredHeight() + i14;
                    } else {
                        i12 = 0;
                    }
                    L = org.telegram.messenger.g0.L(8);
                    i15 = L + i12;
                }
                i15 = 0;
            }
            if (k2.p1.h(1, this.x.c.b) == this.x) {
                i15 += org.telegram.messenger.g0.L(8);
            }
            x3 x3Var7 = this.x;
            i16 = (x3Var7.j == 0 && x3Var7.c.f == 0) ? org.telegram.messenger.g0.L(10) + i15 : i15;
            a3 a3Var4 = this.c;
            if (a3Var4 != null) {
                a3Var4.s = this.e;
                a3Var4.w = this.f;
            }
            org.telegram.ui.Components.bj0 bj0Var2 = this.d;
            if (bj0Var2 != null && (bj0Var2.a instanceof org.telegram.ui.Cells.g9) && (h9Var = ((i4) i50Var).Q0) != null) {
                ArrayList arrayList = h9Var.A0;
                arrayList.clear();
                ((org.telegram.ui.Cells.g9) this.d.a).k(arrayList);
                int size3 = arrayList.size();
                while (i18 < size3) {
                    Object obj = arrayList.get(i18);
                    i18++;
                    org.telegram.ui.Cells.s9 s9Var = (org.telegram.ui.Cells.s9) obj;
                    if (s9Var instanceof a3) {
                        a3 a3Var5 = (a3) s9Var;
                        a3Var5.s += this.n;
                        a3Var5.w += this.r;
                    }
                }
            }
        }
        setMeasuredDimension(size, i16);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (i4.j(this.a, this.b, motionEvent, this, this.c, this.e, this.f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(x3 x3Var) {
        x3 x3Var2 = this.x;
        g4 g4Var = this.b;
        if (x3Var2 != x3Var) {
            this.x = x3Var;
            org.telegram.ui.Components.bj0 bj0Var = this.d;
            if (bj0Var != null) {
                removeView(bj0Var.a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.x.d;
            if (pageBlock != null && g4Var != null) {
                int I = g4.I(pageBlock);
                this.w = I;
                u4.d1 x10 = g4Var.x(this, I);
                this.d = (org.telegram.ui.Components.bj0) x10;
                addView(x10.a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.x.d;
        if (pageBlock2 != null && g4Var != null) {
            g4Var.H(this.w, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
