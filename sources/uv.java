// default package

import android.app.Activity;
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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.o;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class uv extends FrameLayout implements dfb, eib {
    public final vg5 a;
    public final dx b;
    public final tv c;
    public bw d;
    public final efb e;
    public int f;
    public int h;
    public int n;
    public boolean r;
    public TL_iv.pageBlockTable s;
    public final sv w;

    public uv(Activity activity, vg5 vg5Var, dx dxVar) {
        super(activity);
        this.w = new sv(this, (byte) 0);
        this.a = vg5Var;
        this.b = dxVar;
        tv tvVar = new tv(this, activity, vg5Var);
        this.c = tvVar;
        tvVar.setPadding(gl.L(18.0f), 0, gl.L(18.0f), 0);
        tvVar.setClipToPadding(false);
        addView(tvVar, nme.c(-2.0f, -1));
        efb efbVar = new efb(activity, this, ((o) vg5Var).Q0);
        this.e = efbVar;
        efbVar.setOrientation(0);
        efbVar.setRowOrderPreserved(true);
        tvVar.addView(efbVar, new FrameLayout.LayoutParams(-2, -2));
        setWillNotDraw(false);
    }

    public final void a() {
        int i = this.d == null ? 0 : 1;
        efb efbVar = this.e;
        int childCount = efbVar.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            xeb d = efbVar.d(i2);
            web webVar = d.b;
            if (webVar != null) {
                webVar.j((gl.L(18.0f) + (d.b() + this.f)) - this.c.getScrollX());
                d.b.h(d.c() + this.h);
                d.b.g(d.j + 10);
                d.r = i;
                i++;
            }
        }
    }

    @Override // dfb
    public final web c(TL_iv.pageTableCell pagetablecell, int i) {
        if (pagetablecell == null) {
            return null;
        }
        return o.n(this.a, this, null, pagetablecell.text, i, -1, this.s, pagetablecell.align_right ? Layout.Alignment.ALIGN_OPPOSITE : pagetablecell.align_center ? Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_NORMAL, 0, this.b);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.a.getClass();
        } else if (actionMasked != 2 && (actionMasked == 1 || actionMasked == 3)) {
            removeCallbacks(this.w);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public Paint getHalfLinePaint() {
        return o.v1;
    }

    @Override // dfb
    public Paint getHeaderPaint() {
        return o.w1;
    }

    @Override // dfb
    public Paint getLinePaint() {
        return o.u1;
    }

    @Override // dfb
    public Paint getStripPaint() {
        return o.x1;
    }

    @Override // dfb
    public final void h(web webVar, int i) {
        if (!(webVar instanceof bw)) {
            return;
        }
        vg5 vg5Var = this.a;
        if (vg5Var.F.isEmpty() || vg5Var.G == null) {
            return;
        }
        bw bwVar = (bw) webVar;
        String lowerCase = bwVar.d.getText().toString().toLowerCase();
        int i2 = 0;
        while (true) {
            int indexOf = lowerCase.indexOf(vg5Var.G, i2);
            if (indexOf < 0) {
                return;
            }
            int length = vg5Var.G.length() + indexOf;
            if (indexOf == 0 || gl.I1(lowerCase.charAt(indexOf - 1))) {
                HashMap hashMap = this.b.E;
                String str = vg5Var.G + this.s + bwVar.r + indexOf;
                StaticLayout staticLayout = bwVar.d;
                hashMap.put(str, Integer.valueOf(staticLayout.getLineTop(staticLayout.getLineForOffset(indexOf)) + i));
            }
            i2 = length;
        }
    }

    @Override // android.view.View, mib
    public final void invalidate() {
        super.invalidate();
        this.e.invalidate();
    }

    @Override // eib
    public final void k(ArrayList arrayList) {
        bw bwVar = this.d;
        if (bwVar != null) {
            arrayList.add(bwVar);
        }
        efb efbVar = this.e;
        int childCount = efbVar.getChildCount();
        for (int i = 0; i < childCount; i++) {
            web webVar = efbVar.d(i).b;
            if (webVar != null) {
                arrayList.add(webVar);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bw bwVar = this.d;
        if (bwVar != null) {
            bwVar.i(this);
        }
        efb efbVar = this.e;
        int childCount = efbVar.getChildCount();
        for (int i = 0; i < childCount; i++) {
            web webVar = efbVar.d(i).b;
            if (webVar != null) {
                webVar.i(this);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bw bwVar = this.d;
        if (bwVar != null) {
            bwVar.f(this);
        }
        efb efbVar = this.e;
        int childCount = efbVar.getChildCount();
        for (int i = 0; i < childCount; i++) {
            web webVar = efbVar.d(i).b;
            if (webVar != null) {
                webVar.f(this);
            }
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.s == null) {
            return;
        }
        bw bwVar = this.d;
        vg5 vg5Var = this.a;
        if (bwVar != null) {
            canvas.save();
            canvas.translate(this.n, 0.0f);
            o.s(vg5Var, canvas, this, 0);
            this.d.d(canvas, this);
            canvas.restore();
        }
        o.r(canvas, vg5Var, this.s, getMeasuredHeight());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb = new StringBuilder(k96.M0(2131754854, null));
        if (this.d != null) {
            sb.append(", ");
            sb.append(this.d.d.getText());
        }
        accessibilityNodeInfo.setText(sb);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = this.f;
        int i6 = this.h;
        tv tvVar = this.c;
        tvVar.layout(i5, i6, tvVar.getMeasuredWidth() + i5, tvVar.getMeasuredHeight() + this.h);
        if (this.r) {
            dx dxVar = this.b;
            if (dxVar == null || !dxVar.H) {
                tvVar.setScrollX(0);
            } else {
                tvVar.setScrollX(gl.L(36.0f) + (this.e.getMeasuredWidth() - tvVar.getMeasuredWidth()));
            }
            this.r = false;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        uv uvVar;
        int i3;
        int L;
        int i4;
        int size = View.MeasureSpec.getSize(i);
        TL_iv.pageBlockTable pageblocktable = this.s;
        if (pageblocktable != null) {
            int i5 = pageblocktable.level;
            vg5 vg5Var = this.a;
            if (i5 > 0) {
                int L2 = gl.L(i5 * 14);
                this.f = L2;
                L = ug8.C(vg5Var, 18.0f, L2);
                this.n = L;
            } else {
                this.f = 0;
                vg5Var.getClass();
                this.n = gl.L(18.0f);
                L = gl.L(36.0f);
            }
            int i6 = size - L;
            TL_iv.pageBlockTable pageblocktable2 = this.s;
            uvVar = this;
            bw n = o.n(this.a, uvVar, null, pageblocktable2.title, i6, 0, pageblocktable2, Layout.Alignment.ALIGN_CENTER, 0, this.b);
            uvVar.d = n;
            if (n != null) {
                i4 = gl.L(8.0f) + n.d.getHeight();
                uvVar.h = i4;
                bw bwVar = uvVar.d;
                bwVar.s = uvVar.n;
                bwVar.w = 0;
            } else {
                uvVar.h = gl.L(8.0f);
                i4 = 0;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - uvVar.f, TLObject.FLAG_30);
            tv tvVar = uvVar.c;
            tvVar.measure(makeMeasureSpec, 0);
            i3 = de9.w(8.0f, tvVar.getMeasuredHeight(), i4);
            TL_iv.pageBlockTable pageblocktable3 = uvVar.s;
            if (pageblocktable3.level > 0 && !pageblocktable3.bottom) {
                i3 += gl.L(8.0f);
            }
        } else {
            uvVar = this;
            i3 = 1;
        }
        uvVar.setMeasuredDimension(size, i3);
        uvVar.a();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        uv uvVar;
        MotionEvent motionEvent2;
        efb efbVar = this.e;
        int childCount = efbVar.getChildCount();
        int i = 0;
        while (i < childCount) {
            xeb d = efbVar.d(i);
            web webVar = d.b;
            if (webVar instanceof bw) {
                bw bwVar = (bw) webVar;
                tv tvVar = this.c;
                uv uvVar2 = this;
                MotionEvent motionEvent3 = motionEvent;
                motionEvent2 = motionEvent3;
                uvVar = uvVar2;
                if (o.i(this.a, this.b, motionEvent3, uvVar2, bwVar, d.b() + (tvVar.getPaddingLeft() - tvVar.getScrollX()) + this.f, d.c() + this.h)) {
                    return true;
                }
            } else {
                uvVar = this;
                motionEvent2 = motionEvent;
            }
            i++;
            motionEvent = motionEvent2;
            this = uvVar;
        }
        uv uvVar3 = this;
        MotionEvent motionEvent4 = motionEvent;
        return o.i(uvVar3.a, uvVar3.b, motionEvent4, uvVar3, uvVar3.d, uvVar3.n, 0) || super.onTouchEvent(motionEvent4);
    }

    public void setBlock(TL_iv.pageBlockTable pageblocktable) {
        int i;
        this.s = pageblocktable;
        int i2 = bkb.c6;
        ((o) this.a).getClass();
        gl.u3(this.c, bkb.w0(null, i2, false));
        efb efbVar = this.e;
        efbVar.Q.clear();
        efbVar.L.clear();
        efbVar.h();
        efbVar.setDrawLines(this.s.bordered);
        efbVar.setStriped(this.s.striped);
        dx dxVar = this.b;
        efbVar.setRtl(dxVar != null && dxVar.H);
        if (this.s.rows.isEmpty()) {
            i = 0;
        } else {
            TL_iv.pageTableRow pagetablerow = this.s.rows.get(0);
            int size = pagetablerow.cells.size();
            i = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int i4 = pagetablerow.cells.get(i3).colspan;
                if (i4 == 0) {
                    i4 = 1;
                }
                i += i4;
            }
        }
        int size2 = this.s.rows.size();
        for (int i5 = 0; i5 < size2; i5++) {
            TL_iv.pageTableRow pagetablerow2 = this.s.rows.get(i5);
            int size3 = pagetablerow2.cells.size();
            int i6 = 0;
            for (int i7 = 0; i7 < size3; i7++) {
                TL_iv.pageTableCell pagetablecell = pagetablerow2.cells.get(i7);
                int i8 = pagetablecell.colspan;
                if (i8 == 0) {
                    i8 = 1;
                }
                int i9 = pagetablecell.rowspan;
                if (i9 == 0) {
                    i9 = 1;
                }
                if (pagetablecell.text != null) {
                    efbVar.b(pagetablecell, i6, i5, i8);
                } else {
                    efbVar.a(i6, i5, i8, i9);
                }
                i6 += i8;
            }
        }
        efbVar.setColumnCount(i);
        this.r = true;
        requestLayout();
    }
}
