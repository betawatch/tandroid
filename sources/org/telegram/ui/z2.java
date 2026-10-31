package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.view.View;
import java.util.ArrayList;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class z2 implements org.telegram.ui.Cells.u9, xh0, org.telegram.ui.Components.hy0 {
    public SpannableStringBuilder D;
    public int E = -1;
    public int F = -1;
    public int G = -1;
    public org.telegram.ui.Components.k5 H;
    public ArrayList I;
    public Stack J;
    public AtomicReference K;
    public View L;
    public final m60 a;
    public View b;
    public boolean c;
    public StaticLayout d;
    public org.telegram.ui.Components.k80 e;
    public org.telegram.ui.Components.k80 f;
    public org.telegram.ui.Components.k80 h;
    public TL_iv.PageBlock n;
    public TL_iv.RichText r;
    public int s;
    public int w;
    public int x;
    public CharSequence y;

    public z2(m60 m60Var) {
        this.a = m60Var;
    }

    @Override // org.telegram.ui.Cells.u9
    public final Layout a() {
        return this.d;
    }

    @Override // org.telegram.ui.Components.hy0
    public final /* synthetic */ int b() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.u9
    public final /* synthetic */ Rect c() {
        return null;
    }

    @Override // org.telegram.ui.Components.hy0
    public final void d(Canvas canvas, View view) {
        float width;
        Object obj;
        TL_iv.RichText richText;
        this.c = true;
        this.b = view;
        m60 m60Var = this.a;
        float f7 = 0.0f;
        if (m60Var.E.isEmpty()) {
            this.h = null;
        } else {
            q3 q3Var = (q3) m60Var.E.get(m60Var.G);
            if (q3Var.c != this.n || ((obj = q3Var.b) != (richText = this.r) && (!(obj instanceof String) || richText != null))) {
                this.h = null;
            } else if (-1 != q3Var.a) {
                org.telegram.ui.Components.k80 k80Var = new org.telegram.ui.Components.k80(0);
                this.h = k80Var;
                k80Var.n = false;
                k80Var.d(this.d, q3Var.a, 0.0f);
                this.h.o = 0;
                StaticLayout staticLayout = this.d;
                int i10 = q3Var.a;
                staticLayout.getSelectionPath(i10, m60Var.F.length() + i10, this.h);
                this.h.n = true;
            }
        }
        org.telegram.ui.Components.k80 k80Var2 = this.h;
        if (k80Var2 != null) {
            canvas.drawPath(k80Var2, h4.z1);
        }
        org.telegram.ui.Components.k80 k80Var3 = this.e;
        if (k80Var3 != null) {
            canvas.drawPath(k80Var3, h4.y1);
        }
        org.telegram.ui.Components.k80 k80Var4 = this.f;
        if (k80Var4 != null) {
            canvas.drawPath(k80Var4, h4.A1);
        }
        if (m60Var.c.i(canvas, this)) {
            view.invalidate();
        }
        if (m60Var.d == this && m60Var.b == null && m60Var.h) {
            if (this.d.getLineCount() == 1) {
                width = this.d.getLineWidth(0);
                f7 = this.d.getLineLeft(0);
            } else {
                width = this.d.getWidth();
            }
            canvas.drawRect((-org.telegram.messenger.i0.L(2.0f)) + f7, 0.0f, f7 + width + org.telegram.messenger.i0.L(2.0f), this.d.getHeight(), h4.x1);
        }
        ArrayList arrayList = this.I;
        if (arrayList == null || arrayList.isEmpty()) {
            this.d.draw(canvas);
        } else {
            nh.i.g(view, false, this.d.getPaint().getColor(), 0, this.K, 0, this.d, this.I, canvas, false);
        }
        this.c = false;
    }

    @Override // org.telegram.ui.xh0
    public final View e() {
        View view = this.L;
        return view != null ? view : this.b;
    }

    @Override // org.telegram.ui.Components.hy0
    public final void f(View view) {
        if (view == null) {
            view = this.L;
        }
        org.telegram.ui.Components.o5.release(view, this.H);
        this.L = null;
    }

    @Override // org.telegram.ui.Components.hy0
    public final void g(int i10) {
        this.x = i10;
    }

    @Override // org.telegram.ui.Cells.u9
    public final CharSequence getPrefix() {
        return this.y;
    }

    @Override // org.telegram.ui.Cells.u9
    public final int getRow() {
        return this.x;
    }

    @Override // org.telegram.ui.Cells.u9
    public final CharSequence getText() {
        return this.d.getText();
    }

    @Override // org.telegram.ui.Cells.u9
    public final int getX() {
        return this.s;
    }

    @Override // org.telegram.ui.Cells.u9
    public final int getY() {
        return this.w;
    }

    @Override // org.telegram.ui.Components.hy0
    public final void h(int i10) {
        this.w = i10;
    }

    @Override // org.telegram.ui.Components.hy0
    public final void i(View view) {
        this.L = view;
        StaticLayout staticLayout = this.d;
        if (staticLayout != null) {
            this.H = org.telegram.ui.Components.o5.update(0, view, false, this.H, staticLayout);
        }
    }

    @Override // org.telegram.ui.Components.hy0
    public final void j(int i10) {
        this.s = i10;
    }

    public final int k() {
        int i10 = this.E;
        if (i10 != -1) {
            return i10;
        }
        this.E = this.d.getWidth();
        for (int i11 = 0; i11 < this.d.getLineCount(); i11++) {
            this.E = Math.min(this.E, (int) this.d.getLineLeft(i11));
        }
        return this.E;
    }

    public final int l() {
        int i10 = this.F;
        if (i10 != -1) {
            return i10;
        }
        this.F = 0;
        for (int i11 = 0; i11 < this.d.getLineCount(); i11++) {
            this.F = Math.max(this.F, (int) this.d.getLineRight(i11));
        }
        return this.F;
    }

    public final int m() {
        int i10 = this.G;
        if (i10 != -1) {
            return i10;
        }
        this.G = 0;
        if (this.d.getLineCount() > 0) {
            this.G = Math.max(this.G, (int) this.d.getLineRight(r1.getLineCount() - 1));
        }
        return this.G;
    }
}
