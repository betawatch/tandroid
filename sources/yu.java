// default package

import android.app.Activity;
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
import org.telegram.ui.o;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class yu extends ViewGroup implements zlb, ew {
    public CheckBoxBase E;
    public final xi5 a;
    public final ex b;
    public cw c;
    public n69 d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;
    public boolean s;
    public int w;
    public ww x;
    public boolean y;

    public yu(Activity activity, xi5 xi5Var, ex exVar) {
        super(activity);
        this.a = xi5Var;
        this.b = exVar;
        setWillNotDraw(false);
    }

    public final int a() {
        ww wwVar = this.x;
        if ((wwVar != null ? wwVar.i : null) == null) {
            return 0;
        }
        xi5 xi5Var = this.a;
        ex exVar = this.b;
        if (exVar == null || !exVar.H) {
            xi5Var.getClass();
            return uh9.y(12.0f, this.x.c.f, (hl.L(15.0f) + this.x.c.c) - ((int) Math.ceil(r0.d.getLineWidth(0))));
        }
        int h = ik8.h(xi5Var, 15.0f, getMeasuredWidth());
        xw xwVar = this.x.c;
        return (h - xwVar.c) - (hl.L(12.0f) * xwVar.f);
    }

    @Override // ew
    public int getBoundLeft() {
        int boundLeft;
        this.a.getClass();
        int L = hl.L(18.0f);
        int min = this.E != null ? Math.min(ConnectionsManager.DEFAULT_DATACENTER_ID, (this.e - hl.L(26.0f)) - L) : Integer.MAX_VALUE;
        ww wwVar = this.x;
        if (wwVar != null && wwVar.i != null) {
            min = Math.min(min, (this.x.i.k() + a()) - L);
        }
        cw cwVar = this.c;
        if (cwVar != null) {
            min = Math.min(min, (cwVar.k() + cwVar.s) - L);
        }
        n69 n69Var = this.d;
        if (n69Var != null) {
            KeyEvent.Callback callback = n69Var.a;
            if ((callback instanceof ew) && (boundLeft = ((ew) callback).getBoundLeft()) != -1) {
                min = Math.min(min, this.n + boundLeft);
            }
        }
        if (min == Integer.MAX_VALUE) {
            return -1;
        }
        return min;
    }

    @Override // ew
    public int getBoundRight() {
        int boundRight;
        this.a.getClass();
        int L = hl.L(18.0f);
        ww wwVar = this.x;
        int max = (wwVar == null || wwVar.i == null) ? Integer.MIN_VALUE : Math.max(TLObject.FLAG_31, this.x.i.l() + a() + L);
        cw cwVar = this.c;
        if (cwVar != null) {
            max = Math.max(max, cwVar.l() + cwVar.s + L);
        }
        n69 n69Var = this.d;
        if (n69Var != null) {
            KeyEvent.Callback callback = n69Var.a;
            if ((callback instanceof ew) && (boundRight = ((ew) callback).getBoundRight()) != -1) {
                max = Math.max(max, this.n + boundRight);
            }
        }
        if (max == Integer.MIN_VALUE) {
            return -1;
        }
        return max;
    }

    @Override // ew
    public int getLastLineBoundRight() {
        int lastLineBoundRight;
        cw cwVar = this.c;
        if (cwVar != null) {
            return ik8.C(this.a, 18.0f, cwVar.m() + cwVar.s);
        }
        n69 n69Var = this.d;
        if (n69Var != null) {
            KeyEvent.Callback callback = n69Var.a;
            if ((callback instanceof ew) && (lastLineBoundRight = ((ew) callback).getLastLineBoundRight()) != -1) {
                return this.n + lastLineBoundRight;
            }
        }
        return -1;
    }

    public /* bridge */ /* synthetic */ int getMinWidth() {
        return ik8.a(this);
    }

    @Override // android.view.View, hmb
    public final void invalidate() {
        super.invalidate();
        n69 n69Var = this.d;
        if (n69Var != null) {
            n69Var.a.invalidate();
        }
    }

    @Override // zlb
    public final void k(ArrayList arrayList) {
        n69 n69Var = this.d;
        if (n69Var != null) {
            KeyEvent.Callback callback = n69Var.a;
            if (callback instanceof zlb) {
                ((zlb) callback).k(arrayList);
            }
        }
        cw cwVar = this.c;
        if (cwVar != null) {
            arrayList.add(cwVar);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        cw cwVar = this.c;
        if (cwVar != null) {
            cwVar.i(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cw cwVar = this.c;
        if (cwVar != null) {
            cwVar.f(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.x != null) {
            int measuredWidth = getMeasuredWidth();
            cw cwVar = this.x.i;
            xi5 xi5Var = this.a;
            if (cwVar != null) {
                canvas.save();
                ex exVar = this.b;
                if (exVar == null || !exVar.H) {
                    xi5Var.getClass();
                    int L = hl.L(15.0f);
                    ww wwVar = this.x;
                    canvas.translate(uh9.y(12.0f, this.x.c.f, (L + wwVar.c.c) - ((int) Math.ceil(wwVar.i.d.getLineWidth(0)))), (this.f + this.h) - (this.y ? hl.L(1.0f) : 0));
                } else {
                    int h = ik8.h(xi5Var, 15.0f, measuredWidth);
                    xw xwVar = this.x.c;
                    canvas.translate((h - xwVar.c) - (hl.L(12.0f) * xwVar.f), (this.f + this.h) - (this.y ? hl.L(1.0f) : 0));
                }
                this.x.i.d(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.E;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.e - hl.L(26.0f), this.f, hl.L(20.0f), hl.L(20.0f));
                this.E.a(canvas);
            }
            if (this.c != null) {
                canvas.save();
                canvas.translate(this.e, this.f);
                o.s(xi5Var, canvas, this, 0);
                this.c.d(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        cw cwVar = this.c;
        if (cwVar == null) {
            return;
        }
        accessibilityNodeInfo.setText(o.g(this.a, this.b, cwVar));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        n69 n69Var = this.d;
        if (n69Var != null) {
            View view = n69Var.a;
            int i5 = this.n;
            view.layout(i5, this.r, view.getMeasuredWidth() + i5, this.d.a.getMeasuredHeight() + this.r);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0392  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        int i3;
        xi5 xi5Var;
        int i4;
        int L;
        int L2;
        int i5;
        cw cwVar;
        cv cvVar;
        cw cwVar2;
        cw cwVar3;
        n69 n69Var;
        amb ambVar;
        int size;
        int size2 = View.MeasureSpec.getSize(i);
        ww wwVar = this.x;
        int i6 = 1;
        if (wwVar != null) {
            this.c = null;
            int i7 = wwVar.j;
            xi5 xi5Var2 = this.a;
            int i8 = 0;
            if (i7 == 0 && wwVar.c.f == 0) {
                xi5Var2.getClass();
                i3 = hl.L(10.0f);
            } else {
                i3 = 0;
            }
            this.f = i3;
            this.h = 0;
            xw xwVar = this.x.c;
            if (xwVar.d != size2 || xwVar.e != xea.V0) {
                xwVar.d = size2;
                xwVar.e = xea.V0;
                xwVar.c = 0;
                int size3 = xwVar.b.size();
                boolean z = true;
                for (int i9 = 0; i9 < size3; i9++) {
                    ww wwVar2 = (ww) this.x.c.b.get(i9);
                    String str = wwVar2.f;
                    if (str != null) {
                        if (wwVar2.a && "•".equalsIgnoreCase(str)) {
                            wwVar2.i = null;
                        } else {
                            xi5 xi5Var3 = xi5Var2;
                            cw m = o.m(xi5Var3, this, wwVar2.f, null, ik8.h(xi5Var2, 54.0f, size2), this.f, this.x, this.b);
                            xi5Var2 = xi5Var3;
                            wwVar2.i = m;
                            xw xwVar2 = this.x.c;
                            xwVar2.c = Math.max(xwVar2.c, (int) Math.ceil(m.d.getLineWidth(0)));
                            z = false;
                        }
                    }
                }
                if (o.p1 != null && !z) {
                    xw xwVar3 = this.x.c;
                    xwVar3.c = Math.max(xwVar3.c, (int) Math.ceil(r2.measureText("00.")));
                }
            }
            ww wwVar3 = this.x;
            this.y = !wwVar3.c.a.ordered;
            if (wwVar3.a) {
                if (this.E == null) {
                    xi5Var2.getClass();
                    CheckBoxBase checkBoxBase = new CheckBoxBase(20, null, this);
                    this.E = checkBoxBase;
                    checkBoxBase.h(aob.Yl, aob.z5, aob.k7);
                    this.E.d(10);
                    this.E.k(true);
                    this.E.i(hl.L(5.0f));
                }
                this.E.f(-1, this.x.b, false);
            } else {
                this.E = null;
            }
            ex exVar = this.b;
            if (exVar == null || !exVar.H) {
                xi5Var2.getClass();
                int L3 = hl.L((this.E == null ? 0 : 26) + 24);
                xw xwVar4 = this.x.c;
                this.e = uh9.y(12.0f, xwVar4.f, L3 + xwVar4.c);
            } else {
                xi5Var2.getClass();
                this.e = hl.L(18 + (this.E == null ? 0 : 26));
            }
            int h = ik8.h(xi5Var2, 18.0f, size2) - this.e;
            if (exVar != null && exVar.H) {
                int L4 = hl.L(6.0f);
                xw xwVar5 = this.x.c;
                h -= (hl.L(12.0f) * xwVar5.f) + (L4 + xwVar5.c);
            }
            ww wwVar4 = this.x;
            xi5 xi5Var4 = xi5Var2;
            TL_iv.RichText richText = wwVar4.e;
            if (richText != null) {
                xi5Var = xi5Var4;
                cw n = o.n(this.a, this, null, richText, h, 0, wwVar4, (exVar == null || !exVar.H) ? Layout.Alignment.ALIGN_NORMAL : o0b.a(), 0, this.b);
                this.c = n;
                if (n != null && n.d.getLineCount() > 0) {
                    cw cwVar4 = this.x.i;
                    if (cwVar4 != null && cwVar4.d.getLineCount() > 0) {
                        this.h = (hl.L(2.5f) + this.x.i.d.getLineAscent(0)) - this.c.d.getLineAscent(0);
                    }
                    L = hl.L(8.0f) + this.c.d.getHeight();
                    if (c00.g(1, this.x.c.b) == this.x) {
                        L += hl.L(8.0f);
                    }
                    ww wwVar5 = this.x;
                    i6 = (wwVar5.j == 0 || wwVar5.c.f != 0) ? L : hl.L(10.0f) + L;
                    cwVar3 = this.c;
                    if (cwVar3 != null) {
                        cwVar3.s = this.e;
                        cwVar3.w = this.f;
                    }
                    n69Var = this.d;
                    if (n69Var != null && (n69Var.a instanceof zlb) && (ambVar = ((o) xi5Var).Q0) != null) {
                        ArrayList arrayList = ambVar.A0;
                        arrayList.clear();
                        ((zlb) this.d.a).k(arrayList);
                        size = arrayList.size();
                        while (i8 < size) {
                            Object obj = arrayList.get(i8);
                            i8++;
                            kmb kmbVar = (kmb) obj;
                            if (kmbVar instanceof cw) {
                                cw cwVar5 = (cw) kmbVar;
                                cwVar5.s += this.n;
                                cwVar5.w += this.r;
                            }
                        }
                    }
                }
                L = 0;
                if (c00.g(1, this.x.c.b) == this.x) {
                }
                ww wwVar52 = this.x;
                if (wwVar52.j == 0) {
                }
                cwVar3 = this.c;
                if (cwVar3 != null) {
                }
                n69Var = this.d;
                if (n69Var != null) {
                    ArrayList arrayList2 = ambVar.A0;
                    arrayList2.clear();
                    ((zlb) this.d.a).k(arrayList2);
                    size = arrayList2.size();
                    while (i8 < size) {
                    }
                }
            } else {
                xi5Var = xi5Var4;
                TL_iv.PageBlock pageBlock = wwVar4.d;
                if (pageBlock != null) {
                    int i10 = this.e;
                    this.n = i10;
                    int i11 = this.f;
                    this.r = i11;
                    n69 n69Var2 = this.d;
                    if (n69Var2 != null) {
                        View view = n69Var2.a;
                        if (view instanceof cv) {
                            this.r = i11 - hl.L(8.0f);
                            if (exVar == null || !exVar.H) {
                                this.n -= hl.L(18.0f);
                            }
                            h += hl.L(18.0f);
                            i5 = 0 - hl.L(8.0f);
                        } else {
                            if ((view instanceof wu) || (view instanceof rv) || (view instanceof wv) || (view instanceof sv)) {
                                if (exVar == null || !exVar.H) {
                                    this.n = i10 - hl.L(18.0f);
                                }
                                L2 = hl.L(18.0f);
                            } else if (o.I(pageBlock)) {
                                this.n = 0;
                                this.r = 0;
                                this.f = 0;
                                ww wwVar6 = this.x;
                                i5 = ((wwVar6.j == 0 && wwVar6.c.f == 0) ? 0 - hl.L(10.0f) : 0) - hl.L(8.0f);
                                h = size2;
                            } else {
                                if (this.d.a instanceof vv) {
                                    this.n -= hl.L(18.0f);
                                    L2 = hl.L(36.0f);
                                }
                                i5 = 0;
                            }
                            h += L2;
                            i5 = 0;
                        }
                        this.d.a.measure(View.MeasureSpec.makeMeasureSpec(h, TLObject.FLAG_30), 0);
                        if ((this.d.a instanceof cv) && (cwVar = this.x.i) != null && cwVar.d.getLineCount() > 0 && (cwVar2 = (cvVar = (cv) this.d.a).c) != null && cwVar2.d.getLineCount() > 0) {
                            this.h = (hl.L(2.5f) + this.x.i.d.getLineAscent(0)) - cvVar.c.d.getLineAscent(0);
                        }
                        ww wwVar7 = this.x;
                        if (wwVar7.d instanceof TL_iv.pageBlockDetails) {
                            this.s = true;
                            this.r = 0;
                            if (wwVar7.j == 0 && wwVar7.c.f == 0) {
                                i5 -= hl.L(10.0f);
                            }
                            i5 -= hl.L(8.0f);
                        } else {
                            View view2 = this.d.a;
                            if (view2 instanceof bv) {
                                this.s = ((bv) view2).w;
                            } else if (view2 instanceof yu) {
                                this.s = ((yu) view2).s;
                            }
                        }
                        if (this.s && this.x.i != null) {
                            this.f = ((this.d.a.getMeasuredHeight() - this.x.i.d.getHeight()) / 2) - hl.L(4.0f);
                            this.y = false;
                        }
                        i4 = this.d.a.getMeasuredHeight() + i5;
                    } else {
                        i4 = 0;
                    }
                    L = i4 + hl.L(8.0f);
                    if (c00.g(1, this.x.c.b) == this.x) {
                    }
                    ww wwVar522 = this.x;
                    if (wwVar522.j == 0) {
                    }
                    cwVar3 = this.c;
                    if (cwVar3 != null) {
                    }
                    n69Var = this.d;
                    if (n69Var != null) {
                    }
                }
                L = 0;
                if (c00.g(1, this.x.c.b) == this.x) {
                }
                ww wwVar5222 = this.x;
                if (wwVar5222.j == 0) {
                }
                cwVar3 = this.c;
                if (cwVar3 != null) {
                }
                n69Var = this.d;
                if (n69Var != null) {
                }
            }
        }
        setMeasuredDimension(size2, i6);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (o.i(this.a, this.b, motionEvent, this, this.c, this.e, this.f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(ww wwVar) {
        ww wwVar2 = this.x;
        ex exVar = this.b;
        if (wwVar2 != wwVar) {
            this.x = wwVar;
            n69 n69Var = this.d;
            if (n69Var != null) {
                removeView(n69Var.a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.x.d;
            if (pageBlock != null && exVar != null) {
                int I = ex.I(pageBlock);
                this.w = I;
                f89 x = exVar.x(this, I);
                this.d = (n69) x;
                addView(x.a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.x.d;
        if (pageBlock2 != null && exVar != null) {
            exVar.H(this.w, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
