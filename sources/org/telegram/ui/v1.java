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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class v1 extends ViewGroup implements org.telegram.ui.Cells.h9, c3 {
    public CheckBoxBase D;
    public final o50 a;
    public final e4 b;
    public z2 c;
    public org.telegram.ui.Components.xi0 d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;
    public boolean s;
    public int w;
    public w3 x;
    public boolean y;

    public v1(Context context, o50 o50Var, e4 e4Var) {
        super(context);
        this.a = o50Var;
        this.b = e4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        w3 w3Var = this.x;
        if ((w3Var != null ? w3Var.i : null) == null) {
            return 0;
        }
        o50 o50Var = this.a;
        e4 e4Var = this.b;
        if (e4Var == null || !e4Var.G) {
            o50Var.getClass();
            return org.telegram.messenger.k5.D(12.0f, this.x.c.f, (org.telegram.messenger.g0.L(15) + this.x.c.c) - ((int) Math.ceil(r0.d.getLineWidth(0))));
        }
        int measuredWidth = getMeasuredWidth();
        o50Var.getClass();
        int L = measuredWidth - org.telegram.messenger.g0.L(15);
        x3 x3Var = this.x.c;
        return org.telegram.messenger.camera.q.A(12.0f, x3Var.f, L - x3Var.c);
    }

    @Override // org.telegram.ui.c3
    public int getBoundLeft() {
        int boundLeft;
        this.a.getClass();
        int L = org.telegram.messenger.g0.L(18);
        int min = this.D != null ? Math.min(ConnectionsManager.DEFAULT_DATACENTER_ID, (this.e - org.telegram.messenger.g0.L(26.0f)) - L) : Integer.MAX_VALUE;
        w3 w3Var = this.x;
        if (w3Var != null && w3Var.i != null) {
            min = Math.min(min, (this.x.i.k() + a()) - L);
        }
        z2 z2Var = this.c;
        if (z2Var != null) {
            min = Math.min(min, (z2Var.k() + z2Var.s) - L);
        }
        org.telegram.ui.Components.xi0 xi0Var = this.d;
        if (xi0Var != null) {
            KeyEvent.Callback callback = xi0Var.a;
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
        w3 w3Var = this.x;
        int max = (w3Var == null || w3Var.i == null) ? Integer.MIN_VALUE : Math.max(TLObject.FLAG_31, this.x.i.l() + a() + L);
        z2 z2Var = this.c;
        if (z2Var != null) {
            max = Math.max(max, z2Var.l() + z2Var.s + L);
        }
        org.telegram.ui.Components.xi0 xi0Var = this.d;
        if (xi0Var != null) {
            KeyEvent.Callback callback = xi0Var.a;
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
            org.telegram.ui.Components.xi0 xi0Var = this.d;
            if (xi0Var != null) {
                KeyEvent.Callback callback = xi0Var.a;
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
        org.telegram.ui.Components.xi0 xi0Var = this.d;
        if (xi0Var != null) {
            xi0Var.a.invalidate();
        }
    }

    @Override // org.telegram.ui.Cells.h9
    public final void k(ArrayList arrayList) {
        org.telegram.ui.Components.xi0 xi0Var = this.d;
        if (xi0Var != null) {
            KeyEvent.Callback callback = xi0Var.a;
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
        o50 o50Var = this.a;
        if (z2Var != null) {
            canvas.save();
            e4 e4Var = this.b;
            if (e4Var == null || !e4Var.G) {
                o50Var.getClass();
                int L = org.telegram.messenger.g0.L(15);
                w3 w3Var = this.x;
                canvas.translate(org.telegram.messenger.k5.D(12.0f, this.x.c.f, (L + w3Var.c.c) - ((int) Math.ceil(w3Var.i.d.getLineWidth(0)))), (this.f + this.h) - (this.y ? org.telegram.messenger.g0.L(1.0f) : 0));
            } else {
                o50Var.getClass();
                int L2 = measuredWidth - org.telegram.messenger.g0.L(15);
                x3 x3Var = this.x.c;
                canvas.translate(org.telegram.messenger.camera.q.A(12.0f, x3Var.f, L2 - x3Var.c), (this.f + this.h) - (this.y ? org.telegram.messenger.g0.L(1.0f) : 0));
            }
            this.x.i.d(canvas, this);
            canvas.restore();
        }
        CheckBoxBase checkBoxBase = this.D;
        if (checkBoxBase != null) {
            checkBoxBase.e(this.e - org.telegram.messenger.g0.L(26.0f), this.f, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f));
            this.D.a(canvas);
        }
        if (this.c != null) {
            canvas.save();
            canvas.translate(this.e, this.f);
            g4.t(o50Var, canvas, this, 0);
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
        org.telegram.ui.Components.xi0 xi0Var = this.d;
        if (xi0Var != null) {
            View view = xi0Var.a;
            int i13 = this.n;
            view.layout(i13, this.r, view.getMeasuredWidth() + i13, this.d.a.getMeasuredHeight() + this.r);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11;
        o50 o50Var;
        o50 o50Var2;
        int i12;
        int L;
        int L2;
        int i13;
        int i14;
        z2 z2Var;
        z1 z1Var;
        z2 z2Var2;
        int i15;
        org.telegram.ui.Cells.i9 i9Var;
        int size = View.MeasureSpec.getSize(i7);
        w3 w3Var = this.x;
        int i16 = 1;
        if (w3Var != null) {
            this.c = null;
            int i17 = w3Var.j;
            o50 o50Var3 = this.a;
            int i18 = 0;
            if (i17 == 0 && w3Var.c.f == 0) {
                o50Var3.getClass();
                i11 = org.telegram.messenger.g0.L(10);
            } else {
                i11 = 0;
            }
            this.f = i11;
            this.h = 0;
            x3 x3Var = this.x.c;
            if (x3Var.d == size && x3Var.e == org.telegram.messenger.iz.Z0) {
                o50Var = o50Var3;
            } else {
                x3Var.d = size;
                x3Var.e = org.telegram.messenger.iz.Z0;
                x3Var.c = 0;
                int size2 = x3Var.b.size();
                boolean z9 = true;
                int i19 = 0;
                while (i19 < size2) {
                    w3 w3Var2 = (w3) this.x.c.b.get(i19);
                    String str = w3Var2.f;
                    if (str != null) {
                        if (w3Var2.a && "•".equalsIgnoreCase(str)) {
                            w3Var2.i = null;
                        } else {
                            String str2 = w3Var2.f;
                            o50Var3.getClass();
                            o50 o50Var4 = o50Var3;
                            o50Var2 = o50Var4;
                            w3Var2.i = g4.o(o50Var4, this, str2, null, size - org.telegram.messenger.g0.L(54), this.f, this.x, this.b);
                            x3 x3Var2 = this.x.c;
                            x3Var2.c = Math.max(x3Var2.c, (int) Math.ceil(r2.d.getLineWidth(0)));
                            z9 = false;
                            i19++;
                            o50Var3 = o50Var2;
                        }
                    }
                    o50Var2 = o50Var3;
                    i19++;
                    o50Var3 = o50Var2;
                }
                o50Var = o50Var3;
                if (g4.o1 != null && !z9) {
                    x3 x3Var3 = this.x.c;
                    x3Var3.c = Math.max(x3Var3.c, (int) Math.ceil(r2.measureText("00.")));
                }
            }
            w3 w3Var3 = this.x;
            this.y = !w3Var3.c.a.ordered;
            if (w3Var3.a) {
                if (this.D == null) {
                    o50Var.getClass();
                    CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, null);
                    this.D = checkBoxBase;
                    checkBoxBase.h(org.telegram.ui.ActionBar.k6.Vl, org.telegram.ui.ActionBar.k6.z5, org.telegram.ui.ActionBar.k6.k7);
                    this.D.d(10);
                    this.D.k(true);
                    this.D.i(org.telegram.messenger.g0.L(5.0f));
                }
                this.D.f(-1, this.x.b, false);
            } else {
                this.D = null;
            }
            e4 e4Var = this.b;
            if (e4Var == null || !e4Var.G) {
                o50Var.getClass();
                int L3 = org.telegram.messenger.g0.L((this.D == null ? 0 : 26) + 24);
                x3 x3Var4 = this.x.c;
                this.e = org.telegram.messenger.k5.D(12.0f, x3Var4.f, L3 + x3Var4.c);
            } else {
                o50Var.getClass();
                this.e = org.telegram.messenger.g0.L((this.D == null ? 0 : 26) + 18);
            }
            o50Var.getClass();
            float f10 = 18;
            int L4 = (size - org.telegram.messenger.g0.L(f10)) - this.e;
            if (e4Var != null && e4Var.G) {
                int L5 = org.telegram.messenger.g0.L(6.0f);
                x3 x3Var5 = this.x.c;
                L4 -= (org.telegram.messenger.g0.L(12.0f) * x3Var5.f) + (L5 + x3Var5.c);
            }
            w3 w3Var4 = this.x;
            int i20 = L4;
            TL_iv.RichText richText = w3Var4.e;
            if (richText != null) {
                z2 n10 = g4.n(this.a, this, null, richText, i20, 0, w3Var4, (e4Var == null || !e4Var.G) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.mu0.a(), 0, this.b);
                this.c = n10;
                if (n10 != null && n10.d.getLineCount() > 0) {
                    z2 z2Var3 = this.x.i;
                    if (z2Var3 != null && z2Var3.d.getLineCount() > 0) {
                        this.h = (org.telegram.messenger.g0.L(2.5f) + this.x.i.d.getLineAscent(0)) - this.c.d.getLineAscent(0);
                    }
                    i12 = this.c.d.getHeight();
                    L = org.telegram.messenger.g0.L(8);
                    i15 = L + i12;
                }
                i15 = 0;
            } else {
                TL_iv.PageBlock pageBlock = w3Var4.d;
                if (pageBlock != null) {
                    int i21 = this.e;
                    this.n = i21;
                    int i22 = this.f;
                    this.r = i22;
                    org.telegram.ui.Components.xi0 xi0Var = this.d;
                    if (xi0Var != null) {
                        View view = xi0Var.a;
                        if (view instanceof z1) {
                            float f11 = 8;
                            this.r = i22 - org.telegram.messenger.g0.L(f11);
                            if (e4Var == null || !e4Var.G) {
                                this.n -= org.telegram.messenger.g0.L(f10);
                            }
                            int L6 = i20 + org.telegram.messenger.g0.L(f10);
                            i14 = 0 - org.telegram.messenger.g0.L(f11);
                            i13 = L6;
                        } else {
                            if ((view instanceof t1) || (view instanceof p2) || (view instanceof t2) || (view instanceof q2)) {
                                if (e4Var == null || !e4Var.G) {
                                    this.n = i21 - org.telegram.messenger.g0.L(f10);
                                }
                                L2 = org.telegram.messenger.g0.L(f10);
                            } else if (g4.J(pageBlock)) {
                                this.n = 0;
                                this.r = 0;
                                this.f = 0;
                                w3 w3Var5 = this.x;
                                i14 = ((w3Var5.j == 0 && w3Var5.c.f == 0) ? 0 - org.telegram.messenger.g0.L(10) : 0) - org.telegram.messenger.g0.L(8);
                                i13 = size;
                            } else if (this.d.a instanceof s2) {
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
                        if ((this.d.a instanceof z1) && (z2Var = this.x.i) != null && z2Var.d.getLineCount() > 0 && (z2Var2 = (z1Var = (z1) this.d.a).c) != null && z2Var2.d.getLineCount() > 0) {
                            this.h = (org.telegram.messenger.g0.L(2.5f) + this.x.i.d.getLineAscent(0)) - z1Var.c.d.getLineAscent(0);
                        }
                        w3 w3Var6 = this.x;
                        if (w3Var6.d instanceof TL_iv.pageBlockDetails) {
                            this.s = true;
                            this.r = 0;
                            if (w3Var6.j == 0 && w3Var6.c.f == 0) {
                                i14 -= org.telegram.messenger.g0.L(10);
                            }
                            i14 -= org.telegram.messenger.g0.L(8);
                        } else {
                            View view2 = this.d.a;
                            if (view2 instanceof y1) {
                                this.s = ((y1) view2).w;
                            } else if (view2 instanceof v1) {
                                this.s = ((v1) view2).s;
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
            if (jg.g.i(1, this.x.c.b) == this.x) {
                i15 += org.telegram.messenger.g0.L(8);
            }
            w3 w3Var7 = this.x;
            i16 = (w3Var7.j == 0 && w3Var7.c.f == 0) ? org.telegram.messenger.g0.L(10) + i15 : i15;
            z2 z2Var4 = this.c;
            if (z2Var4 != null) {
                z2Var4.s = this.e;
                z2Var4.w = this.f;
            }
            org.telegram.ui.Components.xi0 xi0Var2 = this.d;
            if (xi0Var2 != null && (xi0Var2.a instanceof org.telegram.ui.Cells.h9) && (i9Var = ((g4) o50Var).P0) != null) {
                ArrayList arrayList = i9Var.A0;
                arrayList.clear();
                ((org.telegram.ui.Cells.h9) this.d.a).k(arrayList);
                int size3 = arrayList.size();
                while (i18 < size3) {
                    Object obj = arrayList.get(i18);
                    i18++;
                    org.telegram.ui.Cells.t9 t9Var = (org.telegram.ui.Cells.t9) obj;
                    if (t9Var instanceof z2) {
                        z2 z2Var5 = (z2) t9Var;
                        z2Var5.s += this.n;
                        z2Var5.w += this.r;
                    }
                }
            }
        }
        setMeasuredDimension(size, i16);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (g4.j(this.a, this.b, motionEvent, this, this.c, this.e, this.f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(w3 w3Var) {
        w3 w3Var2 = this.x;
        e4 e4Var = this.b;
        if (w3Var2 != w3Var) {
            this.x = w3Var;
            org.telegram.ui.Components.xi0 xi0Var = this.d;
            if (xi0Var != null) {
                removeView(xi0Var.a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.x.d;
            if (pageBlock != null && e4Var != null) {
                int I = e4.I(pageBlock);
                this.w = I;
                v4.d1 x10 = e4Var.x(this, I);
                this.d = (org.telegram.ui.Components.xi0) x10;
                addView(x10.a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.x.d;
        if (pageBlock2 != null && e4Var != null) {
            e4Var.H(this.w, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
