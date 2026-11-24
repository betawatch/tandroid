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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class xv extends ViewGroup implements fkb, dx {
    public CheckBoxBase E;
    public final ui5 a;
    public final ey b;
    public bx c;
    public b59 d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;
    public boolean s;
    public int w;
    public vx x;
    public boolean y;

    public xv(Activity activity, ui5 ui5Var, ey eyVar) {
        super(activity);
        this.a = ui5Var;
        this.b = eyVar;
        setWillNotDraw(false);
    }

    public final int a() {
        vx vxVar = this.x;
        if ((vxVar != null ? vxVar.i : null) == null) {
            return 0;
        }
        ui5 ui5Var = this.a;
        ey eyVar = this.b;
        if (eyVar == null || !eyVar.H) {
            ui5Var.getClass();
            return hg9.y(12.0f, this.x.c.f, (gm.L(15.0f) + this.x.c.c) - ((int) Math.ceil(r0.d.getLineWidth(0))));
        }
        int h = wi8.h(ui5Var, 15.0f, getMeasuredWidth());
        wx wxVar = this.x.c;
        return (h - wxVar.c) - (gm.L(12.0f) * wxVar.f);
    }

    @Override // dx
    public int getBoundLeft() {
        int boundLeft;
        this.a.getClass();
        int L = gm.L(18.0f);
        int min = this.E != null ? Math.min(ConnectionsManager.DEFAULT_DATACENTER_ID, (this.e - gm.L(26.0f)) - L) : Integer.MAX_VALUE;
        vx vxVar = this.x;
        if (vxVar != null && vxVar.i != null) {
            min = Math.min(min, (this.x.i.k() + a()) - L);
        }
        bx bxVar = this.c;
        if (bxVar != null) {
            min = Math.min(min, (bxVar.k() + bxVar.s) - L);
        }
        b59 b59Var = this.d;
        if (b59Var != null) {
            KeyEvent.Callback callback = b59Var.a;
            if ((callback instanceof dx) && (boundLeft = ((dx) callback).getBoundLeft()) != -1) {
                min = Math.min(min, this.n + boundLeft);
            }
        }
        if (min == Integer.MAX_VALUE) {
            return -1;
        }
        return min;
    }

    @Override // dx
    public int getBoundRight() {
        int boundRight;
        this.a.getClass();
        int L = gm.L(18.0f);
        vx vxVar = this.x;
        int max = (vxVar == null || vxVar.i == null) ? Integer.MIN_VALUE : Math.max(TLObject.FLAG_31, this.x.i.l() + a() + L);
        bx bxVar = this.c;
        if (bxVar != null) {
            max = Math.max(max, bxVar.l() + bxVar.s + L);
        }
        b59 b59Var = this.d;
        if (b59Var != null) {
            KeyEvent.Callback callback = b59Var.a;
            if ((callback instanceof dx) && (boundRight = ((dx) callback).getBoundRight()) != -1) {
                max = Math.max(max, this.n + boundRight);
            }
        }
        if (max == Integer.MIN_VALUE) {
            return -1;
        }
        return max;
    }

    @Override // dx
    public int getLastLineBoundRight() {
        int lastLineBoundRight;
        bx bxVar = this.c;
        if (bxVar != null) {
            return wi8.C(this.a, 18.0f, bxVar.m() + bxVar.s);
        }
        b59 b59Var = this.d;
        if (b59Var != null) {
            KeyEvent.Callback callback = b59Var.a;
            if ((callback instanceof dx) && (lastLineBoundRight = ((dx) callback).getLastLineBoundRight()) != -1) {
                return this.n + lastLineBoundRight;
            }
        }
        return -1;
    }

    public /* bridge */ /* synthetic */ int getMinWidth() {
        return wi8.a(this);
    }

    @Override // android.view.View, nkb
    public final void invalidate() {
        super.invalidate();
        b59 b59Var = this.d;
        if (b59Var != null) {
            b59Var.a.invalidate();
        }
    }

    @Override // fkb
    public final void k(ArrayList arrayList) {
        b59 b59Var = this.d;
        if (b59Var != null) {
            KeyEvent.Callback callback = b59Var.a;
            if (callback instanceof fkb) {
                ((fkb) callback).k(arrayList);
            }
        }
        bx bxVar = this.c;
        if (bxVar != null) {
            arrayList.add(bxVar);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bx bxVar = this.c;
        if (bxVar != null) {
            bxVar.i(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bx bxVar = this.c;
        if (bxVar != null) {
            bxVar.f(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.x != null) {
            int measuredWidth = getMeasuredWidth();
            bx bxVar = this.x.i;
            ui5 ui5Var = this.a;
            if (bxVar != null) {
                canvas.save();
                ey eyVar = this.b;
                if (eyVar == null || !eyVar.H) {
                    ui5Var.getClass();
                    int L = gm.L(15.0f);
                    vx vxVar = this.x;
                    canvas.translate(hg9.y(12.0f, this.x.c.f, (L + vxVar.c.c) - ((int) Math.ceil(vxVar.i.d.getLineWidth(0)))), (this.f + this.h) - (this.y ? gm.L(1.0f) : 0));
                } else {
                    int h = wi8.h(ui5Var, 15.0f, measuredWidth);
                    wx wxVar = this.x.c;
                    canvas.translate((h - wxVar.c) - (gm.L(12.0f) * wxVar.f), (this.f + this.h) - (this.y ? gm.L(1.0f) : 0));
                }
                this.x.i.d(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.E;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.e - gm.L(26.0f), this.f, gm.L(20.0f), gm.L(20.0f));
                this.E.a(canvas);
            }
            if (this.c != null) {
                canvas.save();
                canvas.translate(this.e, this.f);
                o.s(ui5Var, canvas, this, 0);
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
        bx bxVar = this.c;
        if (bxVar == null) {
            return;
        }
        accessibilityNodeInfo.setText(o.g(this.a, this.b, bxVar));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        b59 b59Var = this.d;
        if (b59Var != null) {
            View view = b59Var.a;
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
        ui5 ui5Var;
        int i4;
        int L;
        int L2;
        int i5;
        bx bxVar;
        bw bwVar;
        bx bxVar2;
        bx bxVar3;
        b59 b59Var;
        gkb gkbVar;
        int size;
        int size2 = View.MeasureSpec.getSize(i);
        vx vxVar = this.x;
        int i6 = 1;
        if (vxVar != null) {
            this.c = null;
            int i7 = vxVar.j;
            ui5 ui5Var2 = this.a;
            int i8 = 0;
            if (i7 == 0 && vxVar.c.f == 0) {
                ui5Var2.getClass();
                i3 = gm.L(10.0f);
            } else {
                i3 = 0;
            }
            this.f = i3;
            this.h = 0;
            wx wxVar = this.x.c;
            if (wxVar.d != size2 || wxVar.e != gda.V0) {
                wxVar.d = size2;
                wxVar.e = gda.V0;
                wxVar.c = 0;
                int size3 = wxVar.b.size();
                boolean z = true;
                for (int i9 = 0; i9 < size3; i9++) {
                    vx vxVar2 = (vx) this.x.c.b.get(i9);
                    String str = vxVar2.f;
                    if (str != null) {
                        if (vxVar2.a && "•".equalsIgnoreCase(str)) {
                            vxVar2.i = null;
                        } else {
                            ui5 ui5Var3 = ui5Var2;
                            bx m = o.m(ui5Var3, this, vxVar2.f, null, wi8.h(ui5Var2, 54.0f, size2), this.f, this.x, this.b);
                            ui5Var2 = ui5Var3;
                            vxVar2.i = m;
                            wx wxVar2 = this.x.c;
                            wxVar2.c = Math.max(wxVar2.c, (int) Math.ceil(m.d.getLineWidth(0)));
                            z = false;
                        }
                    }
                }
                if (o.p1 != null && !z) {
                    wx wxVar3 = this.x.c;
                    wxVar3.c = Math.max(wxVar3.c, (int) Math.ceil(r2.measureText("00.")));
                }
            }
            vx vxVar3 = this.x;
            this.y = !vxVar3.c.a.ordered;
            if (vxVar3.a) {
                if (this.E == null) {
                    ui5Var2.getClass();
                    CheckBoxBase checkBoxBase = new CheckBoxBase(20, null, this);
                    this.E = checkBoxBase;
                    checkBoxBase.h(cmb.Xl, cmb.y5, cmb.j7);
                    this.E.d(10);
                    this.E.k(true);
                    this.E.i(gm.L(5.0f));
                }
                this.E.f(-1, this.x.b, false);
            } else {
                this.E = null;
            }
            ey eyVar = this.b;
            if (eyVar == null || !eyVar.H) {
                ui5Var2.getClass();
                int L3 = gm.L((this.E == null ? 0 : 26) + 24);
                wx wxVar4 = this.x.c;
                this.e = hg9.y(12.0f, wxVar4.f, L3 + wxVar4.c);
            } else {
                ui5Var2.getClass();
                this.e = gm.L(18 + (this.E == null ? 0 : 26));
            }
            int h = wi8.h(ui5Var2, 18.0f, size2) - this.e;
            if (eyVar != null && eyVar.H) {
                int L4 = gm.L(6.0f);
                wx wxVar5 = this.x.c;
                h -= (gm.L(12.0f) * wxVar5.f) + (L4 + wxVar5.c);
            }
            vx vxVar4 = this.x;
            ui5 ui5Var4 = ui5Var2;
            TL_iv.RichText richText = vxVar4.e;
            if (richText != null) {
                ui5Var = ui5Var4;
                bx n = o.n(this.a, this, null, richText, h, 0, vxVar4, (eyVar == null || !eyVar.H) ? Layout.Alignment.ALIGN_NORMAL : oya.a(), 0, this.b);
                this.c = n;
                if (n != null && n.d.getLineCount() > 0) {
                    bx bxVar4 = this.x.i;
                    if (bxVar4 != null && bxVar4.d.getLineCount() > 0) {
                        this.h = (gm.L(2.5f) + this.x.i.d.getLineAscent(0)) - this.c.d.getLineAscent(0);
                    }
                    L = gm.L(8.0f) + this.c.d.getHeight();
                    if (b10.f(1, this.x.c.b) == this.x) {
                        L += gm.L(8.0f);
                    }
                    vx vxVar5 = this.x;
                    i6 = (vxVar5.j == 0 || vxVar5.c.f != 0) ? L : gm.L(10.0f) + L;
                    bxVar3 = this.c;
                    if (bxVar3 != null) {
                        bxVar3.s = this.e;
                        bxVar3.w = this.f;
                    }
                    b59Var = this.d;
                    if (b59Var != null && (b59Var.a instanceof fkb) && (gkbVar = ((o) ui5Var).Q0) != null) {
                        ArrayList arrayList = gkbVar.A0;
                        arrayList.clear();
                        ((fkb) this.d.a).k(arrayList);
                        size = arrayList.size();
                        while (i8 < size) {
                            Object obj = arrayList.get(i8);
                            i8++;
                            qkb qkbVar = (qkb) obj;
                            if (qkbVar instanceof bx) {
                                bx bxVar5 = (bx) qkbVar;
                                bxVar5.s += this.n;
                                bxVar5.w += this.r;
                            }
                        }
                    }
                }
                L = 0;
                if (b10.f(1, this.x.c.b) == this.x) {
                }
                vx vxVar52 = this.x;
                if (vxVar52.j == 0) {
                }
                bxVar3 = this.c;
                if (bxVar3 != null) {
                }
                b59Var = this.d;
                if (b59Var != null) {
                    ArrayList arrayList2 = gkbVar.A0;
                    arrayList2.clear();
                    ((fkb) this.d.a).k(arrayList2);
                    size = arrayList2.size();
                    while (i8 < size) {
                    }
                }
            } else {
                ui5Var = ui5Var4;
                TL_iv.PageBlock pageBlock = vxVar4.d;
                if (pageBlock != null) {
                    int i10 = this.e;
                    this.n = i10;
                    int i11 = this.f;
                    this.r = i11;
                    b59 b59Var2 = this.d;
                    if (b59Var2 != null) {
                        View view = b59Var2.a;
                        if (view instanceof bw) {
                            this.r = i11 - gm.L(8.0f);
                            if (eyVar == null || !eyVar.H) {
                                this.n -= gm.L(18.0f);
                            }
                            h += gm.L(18.0f);
                            i5 = 0 - gm.L(8.0f);
                        } else {
                            if ((view instanceof vv) || (view instanceof qw) || (view instanceof vw) || (view instanceof rw)) {
                                if (eyVar == null || !eyVar.H) {
                                    this.n = i10 - gm.L(18.0f);
                                }
                                L2 = gm.L(18.0f);
                            } else if (o.I(pageBlock)) {
                                this.n = 0;
                                this.r = 0;
                                this.f = 0;
                                vx vxVar6 = this.x;
                                i5 = ((vxVar6.j == 0 && vxVar6.c.f == 0) ? 0 - gm.L(10.0f) : 0) - gm.L(8.0f);
                                h = size2;
                            } else {
                                if (this.d.a instanceof uw) {
                                    this.n -= gm.L(18.0f);
                                    L2 = gm.L(36.0f);
                                }
                                i5 = 0;
                            }
                            h += L2;
                            i5 = 0;
                        }
                        this.d.a.measure(View.MeasureSpec.makeMeasureSpec(h, TLObject.FLAG_30), 0);
                        if ((this.d.a instanceof bw) && (bxVar = this.x.i) != null && bxVar.d.getLineCount() > 0 && (bxVar2 = (bwVar = (bw) this.d.a).c) != null && bxVar2.d.getLineCount() > 0) {
                            this.h = (gm.L(2.5f) + this.x.i.d.getLineAscent(0)) - bwVar.c.d.getLineAscent(0);
                        }
                        vx vxVar7 = this.x;
                        if (vxVar7.d instanceof TL_iv.pageBlockDetails) {
                            this.s = true;
                            this.r = 0;
                            if (vxVar7.j == 0 && vxVar7.c.f == 0) {
                                i5 -= gm.L(10.0f);
                            }
                            i5 -= gm.L(8.0f);
                        } else {
                            View view2 = this.d.a;
                            if (view2 instanceof aw) {
                                this.s = ((aw) view2).w;
                            } else if (view2 instanceof xv) {
                                this.s = ((xv) view2).s;
                            }
                        }
                        if (this.s && this.x.i != null) {
                            this.f = ((this.d.a.getMeasuredHeight() - this.x.i.d.getHeight()) / 2) - gm.L(4.0f);
                            this.y = false;
                        }
                        i4 = this.d.a.getMeasuredHeight() + i5;
                    } else {
                        i4 = 0;
                    }
                    L = i4 + gm.L(8.0f);
                    if (b10.f(1, this.x.c.b) == this.x) {
                    }
                    vx vxVar522 = this.x;
                    if (vxVar522.j == 0) {
                    }
                    bxVar3 = this.c;
                    if (bxVar3 != null) {
                    }
                    b59Var = this.d;
                    if (b59Var != null) {
                    }
                }
                L = 0;
                if (b10.f(1, this.x.c.b) == this.x) {
                }
                vx vxVar5222 = this.x;
                if (vxVar5222.j == 0) {
                }
                bxVar3 = this.c;
                if (bxVar3 != null) {
                }
                b59Var = this.d;
                if (b59Var != null) {
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

    public void setBlock(vx vxVar) {
        vx vxVar2 = this.x;
        ey eyVar = this.b;
        if (vxVar2 != vxVar) {
            this.x = vxVar;
            b59 b59Var = this.d;
            if (b59Var != null) {
                removeView(b59Var.a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.x.d;
            if (pageBlock != null && eyVar != null) {
                int I = ey.I(pageBlock);
                this.w = I;
                u69 x = eyVar.x(this, I);
                this.d = (b59) x;
                addView(x.a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.x.d;
        if (pageBlock2 != null && eyVar != null) {
            eyVar.H(this.w, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
