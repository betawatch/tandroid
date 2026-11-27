// default package

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import java.util.ArrayList;
import org.telegram.messenger.a;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class wk9 extends dk9 implements yib {
    public final ki7 A0;
    public final TL_iv.pageBlockTable X;
    public final zib Y;
    public final ArrayList Z;
    public final kmb[] a0;
    public final gl9 b0;
    public final int c0;
    public final ArrayList d0;
    public final int e0;
    public final int f0;
    public int g0;
    public int h0;
    public final int i0;
    public int j0;
    public Paint k0;
    public Paint l0;
    public Paint m0;
    public Paint n0;
    public float o0;
    public int p0;
    public boolean q0;
    public gl9 r0;
    public float s0;
    public float t0;
    public boolean u0;
    public int v0;
    public int w0;
    public int x0;
    public VelocityTracker y0;
    public OverScroller z0;

    public wk9(hl9 hl9Var, Rect rect, int i, TL_iv.pageBlockTable pageblocktable) {
        super(hl9Var, rect, i);
        int i2;
        this.Z = new ArrayList();
        this.d0 = new ArrayList();
        this.A0 = new ki7(this, (byte) 20);
        Rect rect2 = this.b;
        rect2.top = hl.L(10.0f) + rect2.top;
        this.X = pageblocktable;
        this.e0 = this.c;
        gl9 gl9Var = null;
        zib zibVar = new zib(a.b, this, null);
        this.Y = zibVar;
        zibVar.setOrientation(0);
        zibVar.setRowOrderPreserved(true);
        zibVar.setDrawLines(pageblocktable.bordered);
        zibVar.setStriped(pageblocktable.striped);
        zibVar.setRtl(hl9Var.H());
        zibVar.setFillWidth(false);
        zibVar.setBalancedColumns(true);
        if (pageblocktable.compact) {
            int L = hl.L(5.0f);
            int L2 = hl.L(5.0f);
            int L3 = hl.L(5.0f);
            if (zibVar.w != L || zibVar.r != L2 || zibVar.s != L3) {
                zibVar.w = L;
                zibVar.r = L2;
                zibVar.s = L3;
                zibVar.requestLayout();
            }
        }
        zibVar.setMinimumCellHeight(hl.L(pageblocktable.compact ? 18.0f : 36.0f));
        if (pageblocktable.rows.isEmpty()) {
            i2 = 0;
        } else {
            TL_iv.pageTableRow pagetablerow = pageblocktable.rows.get(0);
            i2 = 0;
            for (int i3 = 0; i3 < pagetablerow.cells.size(); i3++) {
                int i4 = pagetablerow.cells.get(i3).colspan;
                if (i4 == 0) {
                    i4 = 1;
                }
                i2 += i4;
            }
        }
        for (int i5 = 0; i5 < pageblocktable.rows.size(); i5++) {
            TL_iv.pageTableRow pagetablerow2 = pageblocktable.rows.get(i5);
            int i6 = 0;
            for (int i7 = 0; i7 < pagetablerow2.cells.size(); i7++) {
                TL_iv.pageTableCell pagetablecell = pagetablerow2.cells.get(i7);
                int i8 = pagetablecell.colspan;
                i8 = i8 == 0 ? 1 : i8;
                int i9 = pagetablecell.rowspan;
                i9 = i9 == 0 ? 1 : i9;
                TL_iv.RichText richText = pagetablecell.text;
                zib zibVar2 = this.Y;
                if (richText != null) {
                    zibVar2.b(pagetablecell, i6, i5, i8);
                } else {
                    zibVar2.a(i6, i5, i8, i9);
                }
                i6 += i8;
            }
        }
        this.Y.setColumnCount(i2);
        this.Y.measure(View.MeasureSpec.makeMeasureSpec(this.c, 0), 0);
        int measuredWidth = this.Y.getMeasuredWidth();
        this.h0 = this.Y.getMeasuredHeight();
        this.i0 = Math.max(0, measuredWidth - this.e0);
        TL_iv.RichText richText2 = pageblocktable.title;
        if (richText2 == null || (richText2 instanceof TL_iv.textEmpty) || TextUtils.isEmpty(hl9.w(richText2))) {
            this.b0 = null;
            this.c0 = 0;
        } else {
            gl9 gl9Var2 = new gl9(hl9Var, hl9Var.l(pageblocktable.title, hl9.Q(0, 15)), this.e0, Layout.Alignment.ALIGN_CENTER);
            this.b0 = gl9Var2;
            gl9Var2.r = true;
            this.c0 = hl.L(9.0f) + gl9Var2.b.getHeight();
            gl9Var = gl9Var2;
        }
        int r = gl9Var != null ? gl9Var.r() : 0;
        boolean C = hl9Var.C();
        int i10 = this.e0;
        int max = C ? Math.max(0, i10) : Math.max(0, Math.min(i10, Math.max(measuredWidth, r)));
        this.f0 = max;
        this.g0 = max;
        for (int i11 = 0; i11 < this.Y.getChildCount(); i11++) {
            sib d = this.Y.d(i11);
            rib ribVar = d.b;
            if (ribVar instanceof gl9) {
                this.Z.add((gl9) ribVar);
                this.d0.add(new vk9(d));
            }
        }
        ArrayList arrayList = new ArrayList();
        gl9 gl9Var3 = this.b0;
        if (gl9Var3 != null) {
            arrayList.add(gl9Var3);
        }
        arrayList.addAll(this.Z);
        this.a0 = (kmb[]) arrayList.toArray(new kmb[0]);
    }

    @Override // dk9
    public final int H() {
        Rect rect = this.b;
        return hl.L(10.0f) + rect.top + this.c0 + this.h0 + rect.bottom;
    }

    @Override // dk9
    public final int I() {
        return J();
    }

    @Override // dk9
    public final int J() {
        Rect rect = this.b;
        return rect.left + this.f0 + rect.right;
    }

    @Override // dk9
    public final kmb[] K() {
        return this.a0;
    }

    @Override // dk9
    public final boolean P() {
        if (this.q0) {
            return true;
        }
        OverScroller overScroller = this.z0;
        return (overScroller == null || overScroller.isFinished()) ? false : true;
    }

    @Override // dk9
    public final void S() {
        gl9 gl9Var = this.b0;
        if (gl9Var != null) {
            gl9Var.i(this.W);
        }
        ArrayList arrayList = this.Z;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((gl9) obj).i(this.W);
        }
    }

    @Override // dk9
    public final void U() {
        gl9 gl9Var = this.b0;
        if (gl9Var != null) {
            gl9Var.f(this.W);
        }
        ArrayList arrayList = this.Z;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((gl9) obj).f(this.W);
        }
    }

    @Override // dk9
    public final void V(Canvas canvas) {
        gl9 gl9Var = this.b0;
        if (gl9Var != null) {
            canvas.save();
            canvas.translate(i0(), 0.0f);
            gl9Var.d(canvas, gl9Var.T);
            canvas.restore();
        }
        canvas.save();
        canvas.translate(0.0f, this.c0);
        hl9 hl9Var = this.a;
        int i = hl9Var.S;
        pm3 pm3Var = hl9Var.z;
        float f = -i;
        int i2 = hl9Var.C + hl9Var.T;
        Rect rect = this.b;
        canvas.saveLayerAlpha(f, 0.0f, (i2 - rect.left) - rect.right, this.h0, jn7.d4, 31);
        canvas.save();
        canvas.translate(-this.j0, 0.0f);
        zib zibVar = this.Y;
        int childCount = zibVar.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            zibVar.d(i3).a(canvas, this.W, true);
        }
        canvas.restore();
        RectF rectF = hl.P;
        rectF.set(-hl9Var.S, 0.0f, hl.L(12.0f) + r2, this.h0);
        pm3Var.r(canvas, rectF, 0, 1.0f);
        rectF.set(r5 - hl.L(12.0f), 0.0f, ((hl9Var.C + hl9Var.T) - rect.left) - rect.right, this.h0);
        pm3Var.r(canvas, rectF, 2, 1.0f);
        canvas.restore();
        canvas.restore();
    }

    @Override // dk9
    public final boolean X(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        View view;
        int actionMasked = motionEvent.getActionMasked();
        int i = this.i0;
        sib sibVar = null;
        if (actionMasked != 0) {
            if (actionMasked != 2) {
                if (actionMasked == 1 || actionMasked == 3) {
                    boolean z = this.q0;
                    this.q0 = false;
                    if (z) {
                        Z(false);
                        if (actionMasked == 1 && (velocityTracker = this.y0) != null && this.z0 != null && this.W != null) {
                            velocityTracker.addMovement(motionEvent);
                            this.y0.computeCurrentVelocity(1000, this.x0);
                            float f = -this.y0.getXVelocity();
                            if (Math.abs(f) > this.w0) {
                                this.z0.fling(this.j0, 0, (int) f, 0, 0, this.i0, 0, 0);
                                this.W.postOnAnimation(this.A0);
                            }
                        }
                    }
                    if (!z && this.u0 && this.r0 != null) {
                        motionEvent.offsetLocation(-this.s0, -this.t0);
                        this.r0.t(motionEvent);
                        motionEvent.offsetLocation(this.s0, this.t0);
                    }
                    boolean z2 = this.u0;
                    this.u0 = false;
                    this.r0 = null;
                    VelocityTracker velocityTracker2 = this.y0;
                    if (velocityTracker2 != null) {
                        velocityTracker2.recycle();
                        this.y0 = null;
                    }
                    if (z || z2) {
                    }
                }
            }
            VelocityTracker velocityTracker3 = this.y0;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
            }
            float x = motionEvent.getX() - this.o0;
            if (!this.q0 && i > 0 && Math.abs(x) > this.v0) {
                this.q0 = true;
                Z(true);
                if (this.u0 && this.r0 != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.setAction(3);
                    obtain.offsetLocation(-this.s0, -this.t0);
                    this.r0.t(obtain);
                    obtain.recycle();
                    this.u0 = false;
                }
            }
            if (!this.q0) {
                return this.u0;
            }
            int i2 = (int) (this.p0 - x);
            int i3 = i2 >= 0 ? i2 : 0;
            if (i3 <= i) {
                i = i3;
            }
            if (i != this.j0) {
                this.j0 = i;
                Y(this.T, this.U, this.V);
                View view2 = this.W;
                if (view2 != null) {
                    view2.invalidate();
                    return true;
                }
            }
        }
        if (this.v0 == 0 && (view = this.W) != null) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
            this.v0 = viewConfiguration.getScaledTouchSlop();
            this.w0 = viewConfiguration.getScaledMinimumFlingVelocity();
            this.x0 = viewConfiguration.getScaledMaximumFlingVelocity();
        }
        OverScroller overScroller = this.z0;
        if (overScroller == null && this.W != null) {
            overScroller = new OverScroller(this.W.getContext());
            this.z0 = overScroller;
        }
        if (overScroller != null && !overScroller.isFinished()) {
            this.z0.forceFinished(true);
        }
        this.o0 = motionEvent.getX();
        motionEvent.getY();
        this.p0 = this.j0;
        this.q0 = false;
        VelocityTracker velocityTracker4 = this.y0;
        if (velocityTracker4 == null) {
            this.y0 = VelocityTracker.obtain();
        } else {
            velocityTracker4.clear();
        }
        this.y0.addMovement(motionEvent);
        this.r0 = null;
        this.u0 = false;
        int i4 = this.c0;
        gl9 gl9Var = this.b0;
        if (gl9Var != null && motionEvent.getY() < i4) {
            float i0 = i0();
            motionEvent.offsetLocation(-i0, 0.0f);
            boolean t = gl9Var.t(motionEvent);
            motionEvent.offsetLocation(i0, 0.0f);
            if (t) {
                this.r0 = gl9Var;
                this.s0 = i0;
                this.t0 = 0.0f;
                this.u0 = true;
            }
        }
        if (!this.u0) {
            float x2 = motionEvent.getX();
            float f2 = x2 + this.j0;
            float y = motionEvent.getY() - i4;
            zib zibVar = this.Y;
            int childCount = zibVar.getChildCount();
            int i5 = 0;
            while (true) {
                if (i5 >= childCount) {
                    break;
                }
                sib d = zibVar.d(i5);
                if (d.b instanceof gl9) {
                    if (f2 >= d.p && f2 < r13 + d.k) {
                        if (y >= d.q && y < r13 + d.l) {
                            sibVar = d;
                            break;
                        }
                    }
                }
                i5++;
            }
            if (sibVar != null) {
                this.r0 = (gl9) sibVar.b;
                this.s0 = sibVar.b() - this.j0;
                this.t0 = sibVar.c() + i4;
                this.r0.S.set(sibVar.p - sibVar.b(), sibVar.q - sibVar.c(), (sibVar.p + sibVar.k) - sibVar.b(), (sibVar.q + sibVar.l) - sibVar.c());
                motionEvent.offsetLocation(-this.s0, -this.t0);
                this.u0 = this.r0.t(motionEvent);
                motionEvent.offsetLocation(this.s0, this.t0);
            }
        }
        return this.u0 || i > 0;
    }

    @Override // dk9
    public final void Y(int i, int i2, int i3) {
        this.T = i;
        this.U = i2;
        this.V = i3;
        gl9 gl9Var = this.b0;
        if (gl9Var != null) {
            gl9Var.c = (i0() + i) - gl9Var.n();
            gl9Var.d = i2;
            gl9Var.e = i3;
        }
        zib zibVar = this.Y;
        int childCount = zibVar.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            sib d = zibVar.d(i4);
            rib ribVar = d.b;
            if (ribVar instanceof gl9) {
                gl9 gl9Var2 = (gl9) ribVar;
                gl9Var2.c = ((d.b() + i) - this.j0) - gl9Var2.n();
                gl9Var2.d = d.c() + this.c0 + i2;
                gl9Var2.e = i3;
            }
        }
    }

    @Override // yib
    public final rib c(TL_iv.pageTableCell pagetablecell, int i) {
        if (pagetablecell == null) {
            return null;
        }
        int Q = hl9.Q(0, 14);
        TL_iv.RichText richText = pagetablecell.text;
        hl9 hl9Var = this.a;
        gl9 gl9Var = new gl9(hl9Var, hl9Var.l(richText, Q), i, pagetablecell.align_right ? Layout.Alignment.ALIGN_OPPOSITE : pagetablecell.align_center ? Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_NORMAL);
        gl9Var.r = true;
        return gl9Var;
    }

    @Override // yib
    public final Paint getHeaderPaint() {
        h0();
        return this.m0;
    }

    @Override // yib
    public final Paint getLinePaint() {
        h0();
        return this.k0;
    }

    @Override // yib
    public final Paint getStripPaint() {
        h0();
        return this.n0;
    }

    public final void h0() {
        if (this.k0 == null) {
            Paint paint = new Paint(1);
            this.k0 = paint;
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            this.k0.setStrokeWidth(hl.N(0.66f));
            Paint paint2 = new Paint();
            this.l0 = paint2;
            paint2.setStyle(style);
            this.l0.setStrokeWidth(hl.N(0.66f));
            this.m0 = new Paint();
            this.n0 = new Paint();
        }
        hl9 hl9Var = this.a;
        int v0 = aob.v0(hl9Var.D() ? aob.ll : aob.kl, hl9Var.D);
        this.k0.setColor(v0);
        this.l0.setColor(v0);
        this.m0.setColor(aob.v0(hl9Var.D() ? aob.jl : aob.il, hl9Var.D));
        this.n0.setColor(167772160);
    }

    public final int i0() {
        gl9 gl9Var = this.b0;
        if (gl9Var == null) {
            return 0;
        }
        int i = this.g0;
        int i2 = gl9Var.h;
        return Math.round(((i - (i2 - r0)) / 2.0f) - gl9Var.f);
    }

    @Override // dk9
    public final void j(SpannableStringBuilder spannableStringBuilder) {
        StaticLayout staticLayout;
        dk9.k(spannableStringBuilder, this.b0, null);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.Z;
            if (i >= arrayList.size()) {
                return;
            }
            gl9 gl9Var = (gl9) arrayList.get(i);
            if (gl9Var != null && (staticLayout = gl9Var.b) != null && !TextUtils.isEmpty(staticLayout.getText())) {
                if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
                    spannableStringBuilder.append(", ");
                }
                spannableStringBuilder.append(staticLayout.getText());
            }
            i++;
        }
    }

    @Override // dk9
    public final void o(ArrayList arrayList) {
        ArrayList arrayList2 = this.d0;
        if (arrayList2.isEmpty()) {
            arrayList.add(this);
        } else {
            arrayList.addAll(arrayList2);
        }
    }

    @Override // dk9
    public final boolean r(Canvas canvas, ColorFilter colorFilter) {
        boolean z;
        boolean z2;
        int i;
        zib zibVar;
        int i2;
        int i3;
        pm3 pm3Var;
        gl9 gl9Var;
        dm dmVar;
        dm dmVar2;
        canvas.save();
        Rect rect = this.b;
        canvas.translate(rect.left, rect.top);
        gl9 gl9Var2 = this.b0;
        if (gl9Var2 == null || (dmVar2 = gl9Var2.F) == null || dmVar2.a.isEmpty()) {
            z = false;
        } else {
            canvas.save();
            canvas.translate(i0(), 0.0f);
            hm.drawAnimatedEmojis(canvas, gl9Var2.b, gl9Var2.F, 0.0f, gl9Var2.x, 0.0f, 0.0f, 0.0f, 1.0f, colorFilter);
            canvas.restore();
            z = true;
        }
        canvas.translate(0.0f, this.c0);
        ArrayList arrayList = this.Z;
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                z2 = z;
                break;
            }
            dm dmVar3 = ((gl9) arrayList.get(i4)).F;
            if (dmVar3 == null || dmVar3.a.isEmpty()) {
                i4++;
            } else {
                hl9 hl9Var = this.a;
                int i5 = hl9Var.S;
                pm3 pm3Var2 = hl9Var.z;
                int saveLayerAlpha = canvas.saveLayerAlpha(-i5, 0.0f, ((hl9Var.C + hl9Var.T) - rect.left) - rect.right, this.h0, jn7.d4, 31);
                canvas.save();
                canvas.translate(-this.j0, 0.0f);
                zib zibVar2 = this.Y;
                int childCount = zibVar2.getChildCount();
                int i6 = 0;
                while (i6 < childCount) {
                    rib ribVar = zibVar2.d(i6).b;
                    if (!(ribVar instanceof gl9) || (dmVar = (gl9Var = (gl9) ribVar).F) == null || dmVar.a.isEmpty()) {
                        i = saveLayerAlpha;
                        zibVar = zibVar2;
                        i2 = childCount;
                        i3 = i6;
                        pm3Var = pm3Var2;
                    } else {
                        canvas.save();
                        canvas.translate(r6.b(), r6.c());
                        zibVar = zibVar2;
                        i2 = childCount;
                        i3 = i6;
                        pm3Var = pm3Var2;
                        i = saveLayerAlpha;
                        hm.drawAnimatedEmojis(canvas, gl9Var.b, gl9Var.F, 0.0f, gl9Var.x, 0.0f, 0.0f, 0.0f, 1.0f, colorFilter);
                        canvas.restore();
                    }
                    i6 = i3 + 1;
                    pm3Var2 = pm3Var;
                    zibVar2 = zibVar;
                    childCount = i2;
                    saveLayerAlpha = i;
                }
                int i7 = saveLayerAlpha;
                pm3 pm3Var3 = pm3Var2;
                canvas.restore();
                RectF rectF = hl.P;
                rectF.set(-hl9Var.S, 0.0f, hl.L(12.0f) + r3, this.h0);
                pm3Var3.r(canvas, rectF, 0, 1.0f);
                rectF.set(r4 - hl.L(12.0f), 0.0f, ((hl9Var.C + hl9Var.T) - rect.left) - rect.right, this.h0);
                pm3Var3.r(canvas, rectF, 2, 1.0f);
                canvas.restoreToCount(i7);
                z2 = true;
            }
        }
        canvas.restore();
        return z2;
    }

    @Override // dk9
    public final void s(Canvas canvas) {
        vk9 vk9Var;
        float f;
        int i;
        zib zibVar;
        int i2;
        int i3;
        ui7 ui7Var = this.L;
        if (ui7Var != null && ui7Var.h) {
            ArrayList arrayList = this.d0;
            if (!arrayList.isEmpty() && ui7Var.d((si7) arrayList.get(0)) >= 0) {
                float c = ui7Var.c((si7) arrayList.get(0));
                float f2 = 0.0f;
                if (c <= 0.0f) {
                    return;
                }
                canvas.save();
                Rect rect = this.b;
                canvas.translate(rect.left, rect.top);
                gl9 gl9Var = this.b0;
                if (gl9Var != null) {
                    canvas.save();
                    canvas.translate(i0(), 0.0f);
                    gl9Var.d(canvas, gl9Var.T);
                    canvas.restore();
                }
                canvas.translate(0.0f, this.c0);
                hl9 hl9Var = this.a;
                int i4 = hl9Var.S;
                pm3 pm3Var = hl9Var.z;
                float f3 = 255.0f;
                int saveLayerAlpha = canvas.saveLayerAlpha(-i4, 0.0f, ((hl9Var.C + hl9Var.T) - rect.left) - rect.right, this.h0, (int) (c * 255.0f), 31);
                canvas.save();
                canvas.translate(-this.j0, 0.0f);
                zib zibVar2 = this.Y;
                int childCount = zibVar2.getChildCount();
                int i5 = 0;
                int i6 = 0;
                while (i5 < childCount) {
                    float f4 = f3;
                    sib d = zibVar2.d(i5);
                    if (i6 >= arrayList.size() || ((vk9) arrayList.get(i6)).a != d) {
                        vk9Var = null;
                    } else {
                        vk9Var = (vk9) arrayList.get(i6);
                        i6++;
                    }
                    int i7 = i6;
                    if (vk9Var == null) {
                        d.a(canvas, this.W, true);
                    } else if (ui7Var.i(vk9Var)) {
                        if (ui7Var.g(vk9Var)) {
                            d.a(canvas, this.W, false);
                            if (d.b instanceof gl9) {
                                canvas.save();
                                f = f2;
                                canvas.translate(d.b(), d.c());
                                ((gl9) d.b).m(canvas, ui7Var.g(vk9Var) ? ui7Var.e : -1, ui7Var.g(vk9Var) ? ui7Var.f : f);
                                canvas.restore();
                            } else {
                                f = f2;
                            }
                        } else {
                            f = f2;
                            float c2 = ui7Var.c(vk9Var);
                            if (c2 >= 1.0f) {
                                d.a(canvas, this.W, true);
                            } else {
                                if (c2 <= f || d.b == null) {
                                    i = saveLayerAlpha;
                                    zibVar = zibVar2;
                                    i2 = childCount;
                                    i3 = i5;
                                    d.a(canvas, this.W, false);
                                } else {
                                    d.a(canvas, this.W, false);
                                    canvas.save();
                                    canvas.translate(d.b(), d.c());
                                    zibVar = zibVar2;
                                    i3 = i5;
                                    i = saveLayerAlpha;
                                    i2 = childCount;
                                    int saveLayerAlpha2 = canvas.saveLayerAlpha(0.0f, 0.0f, d.k, d.l, (int) (c2 * f4), 31);
                                    d.b.d(canvas, this.W);
                                    canvas.restoreToCount(saveLayerAlpha2);
                                    canvas.restore();
                                }
                                i5 = i3 + 1;
                                saveLayerAlpha = i;
                                f3 = f4;
                                i6 = i7;
                                f2 = f;
                                childCount = i2;
                                zibVar2 = zibVar;
                            }
                        }
                        i = saveLayerAlpha;
                        zibVar = zibVar2;
                        i2 = childCount;
                        i3 = i5;
                        i5 = i3 + 1;
                        saveLayerAlpha = i;
                        f3 = f4;
                        i6 = i7;
                        f2 = f;
                        childCount = i2;
                        zibVar2 = zibVar;
                    } else {
                        d.a(canvas, this.W, false);
                    }
                    zibVar = zibVar2;
                    i2 = childCount;
                    i3 = i5;
                    f = f2;
                    i = saveLayerAlpha;
                    i5 = i3 + 1;
                    saveLayerAlpha = i;
                    f3 = f4;
                    i6 = i7;
                    f2 = f;
                    childCount = i2;
                    zibVar2 = zibVar;
                }
                float f5 = f2;
                int i8 = saveLayerAlpha;
                canvas.restore();
                RectF rectF = hl.P;
                rectF.set(-hl9Var.S, f5, hl.L(12.0f) + r3, this.h0);
                pm3Var.r(canvas, rectF, 0, 1.0f);
                rectF.set(r3 - hl.L(12.0f), 0.0f, ((hl9Var.C + hl9Var.T) - rect.left) - rect.right, this.h0);
                pm3Var.r(canvas, rectF, 2, 1.0f);
                canvas.restoreToCount(i8);
                canvas.restore();
                return;
            }
        }
        p(canvas);
    }

    @Override // dk9
    public final boolean t(CharacterStyle characterStyle, int i, vj9 vj9Var) {
        Rect rect = this.b;
        gl9 gl9Var = this.b0;
        if (gl9Var != null && gl9Var.o(characterStyle, vj9Var)) {
            vj9Var.e = (i0() + rect.left) - gl9Var.n();
            vj9Var.f = i + rect.top;
            return true;
        }
        zib zibVar = this.Y;
        int childCount = zibVar.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            rib ribVar = zibVar.d(i2).b;
            if (ribVar instanceof gl9) {
                if (((gl9) ribVar).o(characterStyle, vj9Var)) {
                    vj9Var.e = ((r6.b() + rect.left) - this.j0) - r7.n();
                    vj9Var.f = r6.c() + i + rect.top + this.c0;
                    return true;
                }
            }
        }
        return false;
    }

    @Override // yib
    public final void g(rib ribVar, int i) {
    }
}
