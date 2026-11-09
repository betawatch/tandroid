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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class y1 extends ViewGroup implements org.telegram.ui.Cells.h9, c3 {
    public final q50 a;
    public final e4 b;
    public z2 c;
    public org.telegram.ui.Components.yi0 d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;
    public int s;
    public boolean w;
    public y3 x;
    public CheckBoxBase y;

    public y1(Context context, q50 q50Var, e4 e4Var) {
        super(context);
        this.a = q50Var;
        this.b = e4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        y3 y3Var = this.x;
        if ((y3Var != null ? y3Var.i : null) == null) {
            return 0;
        }
        q50 q50Var = this.a;
        e4 e4Var = this.b;
        if (e4Var == null || !e4Var.G) {
            q50Var.getClass();
            return org.telegram.messenger.k5.D(20.0f, this.x.c.e, (org.telegram.messenger.g0.L(18) + this.x.c.b) - ((int) Math.ceil(r0.d.getLineWidth(0))));
        }
        int measuredWidth = getMeasuredWidth();
        q50Var.getClass();
        int L = measuredWidth - org.telegram.messenger.g0.L(18);
        z3 z3Var = this.x.c;
        return org.telegram.messenger.camera.q.A(20.0f, z3Var.e, L - z3Var.b);
    }

    @Override // org.telegram.ui.c3
    public int getBoundLeft() {
        int boundLeft;
        this.a.getClass();
        int L = org.telegram.messenger.g0.L(18);
        y3 y3Var = this.x;
        int min = (y3Var == null || y3Var.i == null) ? Integer.MAX_VALUE : Math.min(ConnectionsManager.DEFAULT_DATACENTER_ID, (this.x.i.k() + a()) - L);
        z2 z2Var = this.c;
        if (z2Var != null) {
            min = Math.min(min, (z2Var.k() + z2Var.s) - L);
        }
        org.telegram.ui.Components.yi0 yi0Var = this.d;
        if (yi0Var != null) {
            KeyEvent.Callback callback = yi0Var.a;
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
        int L = org.telegram.messenger.g0.L(18);
        y3 y3Var = this.x;
        int max = (y3Var == null || y3Var.i == null) ? Integer.MIN_VALUE : Math.max(TLObject.FLAG_31, this.x.i.l() + a() + L);
        z2 z2Var = this.c;
        if (z2Var != null) {
            max = Math.max(max, z2Var.l() + z2Var.s + L);
        }
        org.telegram.ui.Components.yi0 yi0Var = this.d;
        if (yi0Var != null) {
            KeyEvent.Callback callback = yi0Var.a;
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
        int i7;
        z2 z2Var = this.c;
        if (z2Var == null) {
            org.telegram.ui.Components.yi0 yi0Var = this.d;
            if (yi0Var != null) {
                KeyEvent.Callback callback = yi0Var.a;
                if ((callback instanceof c3) && (lastLineBoundRight = ((c3) callback).getLastLineBoundRight()) != -1) {
                    i7 = this.n;
                }
            }
            return -1;
        }
        lastLineBoundRight = z2Var.m() + z2Var.s;
        this.a.getClass();
        i7 = org.telegram.messenger.g0.L(18);
        return i7 + lastLineBoundRight;
    }

    public /* bridge */ /* synthetic */ int getMinWidth() {
        return org.telegram.messenger.camera.q.a(this);
    }

    @Override // android.view.View, org.telegram.ui.Cells.q9
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.yi0 yi0Var = this.d;
        if (yi0Var != null) {
            yi0Var.a.invalidate();
        }
    }

    @Override // org.telegram.ui.Cells.h9
    public final void k(ArrayList arrayList) {
        org.telegram.ui.Components.yi0 yi0Var = this.d;
        if (yi0Var != null) {
            KeyEvent.Callback callback = yi0Var.a;
            if (callback instanceof org.telegram.ui.Cells.h9) {
                ((org.telegram.ui.Cells.h9) callback).k(arrayList);
            }
        }
        z2 z2Var = this.c;
        if (z2Var != null) {
            arrayList.add(z2Var);
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
        q50 q50Var = this.a;
        if (z2Var != null) {
            canvas.save();
            e4 e4Var = this.b;
            if (e4Var == null || !e4Var.G) {
                q50Var.getClass();
                int L = org.telegram.messenger.g0.L(18);
                y3 y3Var = this.x;
                canvas.translate(org.telegram.messenger.k5.D(20.0f, this.x.c.e, (L + y3Var.c.b) - ((int) Math.ceil(y3Var.i.d.getLineWidth(0)))), this.f + this.h);
            } else {
                q50Var.getClass();
                int L2 = measuredWidth - org.telegram.messenger.g0.L(18);
                z3 z3Var = this.x.c;
                canvas.translate(org.telegram.messenger.camera.q.A(20.0f, z3Var.e, L2 - z3Var.b), this.f + this.h);
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
            g4.t(q50Var, canvas, this, 0);
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
        accessibilityNodeInfo.setText(g4.h(this.a, this.b, z2Var));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        org.telegram.ui.Components.yi0 yi0Var = this.d;
        if (yi0Var != null) {
            View view = yi0Var.a;
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
    public final void onMeasure(int i7, int i10) {
        q50 q50Var;
        q50 q50Var2;
        int i11;
        int L;
        int L2;
        int i12;
        int i13;
        z2 z2Var;
        z1 z1Var;
        z2 z2Var2;
        z2 z2Var3;
        org.telegram.ui.Components.yi0 yi0Var;
        org.telegram.ui.Cells.i9 i9Var;
        int size;
        int size2 = View.MeasureSpec.getSize(i7);
        y3 y3Var = this.x;
        int i14 = 1;
        if (y3Var != null) {
            this.c = null;
            int i15 = 0;
            this.f = (y3Var.j == 0 && y3Var.c.e == 0) ? org.telegram.messenger.g0.L(10.0f) : 0;
            this.h = 0;
            z3 z3Var = this.x.c;
            int i16 = z3Var.c;
            q50 q50Var3 = this.a;
            if (i16 == size2 && z3Var.d == org.telegram.messenger.iz.Z0) {
                q50Var = q50Var3;
            } else {
                z3Var.c = size2;
                z3Var.d = org.telegram.messenger.iz.Z0;
                z3Var.b = 0;
                int size3 = z3Var.a.size();
                int i17 = 0;
                while (i17 < size3) {
                    y3 y3Var2 = (y3) this.x.c.a.get(i17);
                    String str = y3Var2.f;
                    if (str == null) {
                        q50Var2 = q50Var3;
                    } else {
                        q50Var3.getClass();
                        q50 q50Var4 = q50Var3;
                        q50Var2 = q50Var4;
                        y3Var2.i = g4.o(q50Var4, this, str, null, size2 - org.telegram.messenger.g0.L(54), this.f, this.x, this.b);
                        z3 z3Var2 = this.x.c;
                        z3Var2.b = Math.max(z3Var2.b, (int) Math.ceil(r2.d.getLineWidth(0)));
                    }
                    i17++;
                    q50Var3 = q50Var2;
                }
                q50Var = q50Var3;
                z3 z3Var3 = this.x.c;
                z3Var3.b = Math.max(z3Var3.b, (int) Math.ceil(g4.o1.measureText("00.")));
            }
            if (this.x.a) {
                if (this.y == null) {
                    q50Var.getClass();
                    CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, null);
                    this.y = checkBoxBase;
                    checkBoxBase.h(org.telegram.ui.ActionBar.l6.Vl, org.telegram.ui.ActionBar.l6.z5, org.telegram.ui.ActionBar.l6.k7);
                    this.y.d(10);
                    this.y.k(true);
                    this.y.i(org.telegram.messenger.g0.L(5.0f));
                }
                this.y.f(-1, this.x.b, false);
            } else {
                this.y = null;
            }
            e4 e4Var = this.b;
            if (e4Var == null || !e4Var.G) {
                q50Var.getClass();
                int L3 = org.telegram.messenger.g0.L((this.y == null ? 0 : 26) + 24);
                z3 z3Var4 = this.x.c;
                this.e = org.telegram.messenger.k5.D(20.0f, z3Var4.e, L3 + z3Var4.b);
            } else {
                q50Var.getClass();
                this.e = org.telegram.messenger.g0.L((this.y == null ? 0 : 26) + 18);
            }
            this.w = false;
            q50Var.getClass();
            float f10 = 18;
            int L4 = (size2 - org.telegram.messenger.g0.L(f10)) - this.e;
            if (e4Var != null && e4Var.G) {
                int L5 = org.telegram.messenger.g0.L(6.0f);
                z3 z3Var5 = this.x.c;
                L4 -= (org.telegram.messenger.g0.L(20.0f) * z3Var5.e) + (L5 + z3Var5.b);
            }
            y3 y3Var3 = this.x;
            int i18 = L4;
            TL_iv.RichText richText = y3Var3.e;
            if (richText != null) {
                z2 n10 = g4.n(this.a, this, null, richText, i18, 0, y3Var3, (e4Var == null || !e4Var.G) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.ou0.a(), 0, this.b);
                this.c = n10;
                if (n10 != null && n10.d.getLineCount() > 0) {
                    z2 z2Var4 = this.x.i;
                    if (z2Var4 != null && z2Var4.d.getLineCount() > 0) {
                        this.h = this.x.i.d.getLineAscent(0) - this.c.d.getLineAscent(0);
                    }
                    L = org.telegram.messenger.g0.L(8.0f) + this.c.d.getHeight();
                    if (jg.g.i(1, this.x.c.a) == this.x) {
                        L += org.telegram.messenger.g0.L(8.0f);
                    }
                    y3 y3Var4 = this.x;
                    i14 = (y3Var4.j == 0 || y3Var4.c.e != 0) ? L : org.telegram.messenger.g0.L(10.0f) + L;
                    z2Var3 = this.c;
                    if (z2Var3 != null) {
                        z2Var3.s = this.e;
                        z2Var3.w = this.f;
                        z2 z2Var5 = this.x.i;
                        if (z2Var5 != null) {
                            z2Var3.y = z2Var5.d.getText();
                        }
                    }
                    yi0Var = this.d;
                    if (yi0Var != null && (yi0Var.a instanceof org.telegram.ui.Cells.h9) && (i9Var = ((g4) q50Var).P0) != null) {
                        ArrayList arrayList = i9Var.A0;
                        arrayList.clear();
                        ((org.telegram.ui.Cells.h9) this.d.a).k(arrayList);
                        size = arrayList.size();
                        while (i15 < size) {
                            Object obj = arrayList.get(i15);
                            i15++;
                            org.telegram.ui.Cells.t9 t9Var = (org.telegram.ui.Cells.t9) obj;
                            if (t9Var instanceof z2) {
                                z2 z2Var6 = (z2) t9Var;
                                z2Var6.s += this.n;
                                z2Var6.w += this.r;
                            }
                        }
                    }
                }
                L = 0;
                if (jg.g.i(1, this.x.c.a) == this.x) {
                }
                y3 y3Var42 = this.x;
                if (y3Var42.j == 0) {
                }
                z2Var3 = this.c;
                if (z2Var3 != null) {
                }
                yi0Var = this.d;
                if (yi0Var != null) {
                    ArrayList arrayList2 = i9Var.A0;
                    arrayList2.clear();
                    ((org.telegram.ui.Cells.h9) this.d.a).k(arrayList2);
                    size = arrayList2.size();
                    while (i15 < size) {
                    }
                }
            } else {
                TL_iv.PageBlock pageBlock = y3Var3.d;
                if (pageBlock != null) {
                    int i19 = this.e;
                    this.n = i19;
                    int i20 = this.f;
                    this.r = i20;
                    org.telegram.ui.Components.yi0 yi0Var2 = this.d;
                    if (yi0Var2 != null) {
                        View view = yi0Var2.a;
                        if (view instanceof z1) {
                            this.r = i20 - org.telegram.messenger.g0.L(8.0f);
                            if (e4Var == null || !e4Var.G) {
                                this.n -= org.telegram.messenger.g0.L(f10);
                            }
                            i12 = org.telegram.messenger.g0.L(18.0f) + i18;
                            i13 = 0 - org.telegram.messenger.g0.L(8.0f);
                        } else {
                            if ((view instanceof t1) || (view instanceof p2) || (view instanceof t2) || (view instanceof q2)) {
                                if (e4Var == null || !e4Var.G) {
                                    this.n = i19 - org.telegram.messenger.g0.L(f10);
                                }
                                L2 = org.telegram.messenger.g0.L(f10);
                            } else if (g4.J(pageBlock)) {
                                this.n = 0;
                                this.r = 0;
                                this.f = 0;
                                i13 = 0 - org.telegram.messenger.g0.L(8.0f);
                                i12 = size2;
                            } else if (this.d.a instanceof s2) {
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
                        if ((this.d.a instanceof z1) && (z2Var = this.x.i) != null && z2Var.d.getLineCount() > 0 && (z2Var2 = (z1Var = (z1) this.d.a).c) != null && z2Var2.d.getLineCount() > 0) {
                            this.h = this.x.i.d.getLineAscent(0) - z1Var.c.d.getLineAscent(0);
                        }
                        if (this.x.d instanceof TL_iv.pageBlockDetails) {
                            this.w = true;
                            this.r = 0;
                            i13 -= org.telegram.messenger.g0.L(8.0f);
                        } else {
                            View view2 = this.d.a;
                            if (view2 instanceof y1) {
                                this.w = ((y1) view2).w;
                            } else if (view2 instanceof v1) {
                                this.w = ((v1) view2).s;
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
                    if (jg.g.i(1, this.x.c.a) == this.x) {
                    }
                    y3 y3Var422 = this.x;
                    if (y3Var422.j == 0) {
                    }
                    z2Var3 = this.c;
                    if (z2Var3 != null) {
                    }
                    yi0Var = this.d;
                    if (yi0Var != null) {
                    }
                }
                L = 0;
                if (jg.g.i(1, this.x.c.a) == this.x) {
                }
                y3 y3Var4222 = this.x;
                if (y3Var4222.j == 0) {
                }
                z2Var3 = this.c;
                if (z2Var3 != null) {
                }
                yi0Var = this.d;
                if (yi0Var != null) {
                }
            }
        }
        setMeasuredDimension(size2, i14);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (g4.j(this.a, this.b, motionEvent, this, this.c, this.e, this.f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(y3 y3Var) {
        y3 y3Var2 = this.x;
        e4 e4Var = this.b;
        if (y3Var2 != y3Var) {
            this.x = y3Var;
            org.telegram.ui.Components.yi0 yi0Var = this.d;
            if (yi0Var != null) {
                removeView(yi0Var.a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.x.d;
            if (pageBlock != null && e4Var != null) {
                int I = e4.I(pageBlock);
                this.s = I;
                v4.d1 x10 = e4Var.x(this, I);
                this.d = (org.telegram.ui.Components.yi0) x10;
                addView(x10.a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.x.d;
        if (pageBlock2 != null && e4Var != null) {
            e4Var.H(this.s, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
