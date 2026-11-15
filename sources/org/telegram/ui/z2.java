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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class z2 implements org.telegram.ui.Cells.s9, rg0, org.telegram.ui.Components.hx0 {
    public SpannableStringBuilder E;
    public int F = -1;
    public int G = -1;
    public int H = -1;
    public org.telegram.ui.Components.l5 I;
    public ArrayList J;
    public Stack K;
    public AtomicReference L;
    public View M;
    public final n50 a;
    public View b;
    public boolean c;
    public StaticLayout d;
    public org.telegram.ui.Components.u70 e;
    public org.telegram.ui.Components.u70 f;
    public org.telegram.ui.Components.u70 h;
    public TL_iv.PageBlock n;
    public TL_iv.RichText r;
    public int s;
    public int w;
    public int x;
    public CharSequence y;

    public z2(n50 n50Var) {
        this.a = n50Var;
    }

    @Override // org.telegram.ui.Cells.s9
    public final Layout a() {
        return this.d;
    }

    @Override // org.telegram.ui.Components.hx0
    public final /* synthetic */ int b() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.s9
    public final /* synthetic */ Rect c() {
        return null;
    }

    @Override // org.telegram.ui.Components.hx0
    public final void d(Canvas canvas, View view) {
        float width;
        Object obj;
        TL_iv.RichText richText;
        this.c = true;
        this.b = view;
        n50 n50Var = this.a;
        float f10 = 0.0f;
        if (n50Var.F.isEmpty()) {
            this.h = null;
        } else {
            p3 p3Var = (p3) n50Var.F.get(n50Var.H);
            if (p3Var.c != this.n || ((obj = p3Var.b) != (richText = this.r) && (!(obj instanceof String) || richText != null))) {
                this.h = null;
            } else if (-1 != p3Var.a) {
                org.telegram.ui.Components.u70 u70Var = new org.telegram.ui.Components.u70(0);
                this.h = u70Var;
                u70Var.n = false;
                u70Var.d(this.d, p3Var.a, 0.0f);
                this.h.o = 0;
                StaticLayout staticLayout = this.d;
                int i7 = p3Var.a;
                staticLayout.getSelectionPath(i7, n50Var.G.length() + i7, this.h);
                this.h.n = true;
            }
        }
        org.telegram.ui.Components.u70 u70Var2 = this.h;
        if (u70Var2 != null) {
            canvas.drawPath(u70Var2, g4.A1);
        }
        org.telegram.ui.Components.u70 u70Var3 = this.e;
        if (u70Var3 != null) {
            canvas.drawPath(u70Var3, g4.z1);
        }
        org.telegram.ui.Components.u70 u70Var4 = this.f;
        if (u70Var4 != null) {
            canvas.drawPath(u70Var4, g4.B1);
        }
        if (n50Var.c.i(canvas, this)) {
            view.invalidate();
        }
        if (n50Var.d == this && n50Var.b == null && n50Var.h) {
            if (this.d.getLineCount() == 1) {
                width = this.d.getLineWidth(0);
                f10 = this.d.getLineLeft(0);
            } else {
                width = this.d.getWidth();
            }
            canvas.drawRect((-org.telegram.messenger.g0.L(2.0f)) + f10, 0.0f, f10 + width + org.telegram.messenger.g0.L(2.0f), this.d.getHeight(), g4.y1);
        }
        ArrayList arrayList = this.J;
        if (arrayList == null || arrayList.isEmpty()) {
            this.d.draw(canvas);
        } else {
            xh.f.g(view, false, this.d.getPaint().getColor(), 0, this.L, 0, this.d, this.J, canvas, false);
        }
        this.c = false;
    }

    @Override // org.telegram.ui.rg0
    public final View e() {
        View view = this.M;
        return view != null ? view : this.b;
    }

    @Override // org.telegram.ui.Components.hx0
    public final void f(View view) {
        if (view == null) {
            view = this.M;
        }
        org.telegram.ui.Components.p5.release(view, this.I);
        this.M = null;
    }

    @Override // org.telegram.ui.Components.hx0
    public final void g(int i7) {
        this.x = i7;
    }

    @Override // org.telegram.ui.Cells.s9
    public final CharSequence getPrefix() {
        return this.y;
    }

    @Override // org.telegram.ui.Cells.s9
    public final int getRow() {
        return this.x;
    }

    @Override // org.telegram.ui.Cells.s9
    public final CharSequence getText() {
        return this.d.getText();
    }

    @Override // org.telegram.ui.Cells.s9
    public final int getX() {
        return this.s;
    }

    @Override // org.telegram.ui.Cells.s9
    public final int getY() {
        return this.w;
    }

    @Override // org.telegram.ui.Components.hx0
    public final void h(int i7) {
        this.w = i7;
    }

    @Override // org.telegram.ui.Components.hx0
    public final void i(View view) {
        this.M = view;
        StaticLayout staticLayout = this.d;
        if (staticLayout != null) {
            this.I = org.telegram.ui.Components.p5.update(0, view, false, this.I, staticLayout);
        }
    }

    @Override // org.telegram.ui.Components.hx0
    public final void j(int i7) {
        this.s = i7;
    }

    public final int k() {
        int i7 = this.F;
        if (i7 != -1) {
            return i7;
        }
        this.F = this.d.getWidth();
        for (int i10 = 0; i10 < this.d.getLineCount(); i10++) {
            this.F = Math.min(this.F, (int) this.d.getLineLeft(i10));
        }
        return this.F;
    }

    public final int l() {
        int i7 = this.G;
        if (i7 != -1) {
            return i7;
        }
        this.G = 0;
        for (int i10 = 0; i10 < this.d.getLineCount(); i10++) {
            this.G = Math.max(this.G, (int) this.d.getLineRight(i10));
        }
        return this.G;
    }

    public final int m() {
        int i7 = this.H;
        if (i7 != -1) {
            return i7;
        }
        this.H = 0;
        if (this.d.getLineCount() > 0) {
            this.H = Math.max(this.H, (int) this.d.getLineRight(r1.getLineCount() - 1));
        }
        return this.H;
    }
}
