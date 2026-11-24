// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class v28 extends FrameLayout implements vlb {
    public final TextView a;
    public uib b;
    public final tm c;
    public final /* synthetic */ w28 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v28(w28 w28Var, Context context) {
        super(context);
        this.d = w28Var;
        int i = cmb.c6;
        d38 d38Var = w28Var.q0;
        anb.h(i, d38Var.getResourceProvider(), this);
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setTextSize(1, 16.0f);
        anb.X(textView, cmb.F6, d38Var.getResourceProvider());
        boolean z = w28Var.n0;
        boolean z2 = d38Var.a;
        if (z) {
            textView.setText(jb6.M0(z2 ? 2131752250 : 2131743417, null));
        } else {
            textView.setText(jb6.M0(z2 ? 2131752263 : 2131743420, null));
        }
        addView(textView, qoe.d(-1, -2.0f, 23, 20.0f, 0.0f, 20.0f, 0.0f));
        this.c = new tm(gm.L(24.0f), 13, this, false);
    }

    public final int a() {
        int i;
        fc7 fc7Var;
        ec7 d;
        int i2;
        ylb ylbVar;
        ylb ylbVar2;
        ylb ylbVar3;
        ylb ylbVar4;
        w28 w28Var = this.d;
        d38 d38Var = w28Var.q0;
        int i3 = w28Var.h;
        if (i3 >= 0) {
            if (i3 < 7) {
                return d38Var.getThemedColor(cmb.q8[i3]);
            }
            if (w28Var.n0) {
                i2 = ((d) d38Var).currentAccount;
                fc7Var = oc7.r1(i2).E3;
            } else {
                i = ((d) d38Var).currentAccount;
                fc7Var = oc7.r1(i).F3;
            }
            return (fc7Var == null || (d = fc7Var.d(w28Var.h)) == null) ? d38Var.getThemedColor(cmb.q8[0]) : d.f();
        }
        int i4 = cmb.r8;
        if (gm.B(d38Var.getThemedColor(i4)) > 0.8f) {
            int i5 = cmb.m6;
            ylbVar4 = ((d) d38Var).resourceProvider;
            return cmb.v0(i5, ylbVar4);
        }
        if (gm.B(d38Var.getThemedColor(i4)) < 0.2f) {
            int i6 = cmb.z8;
            ylbVar3 = ((d) d38Var).resourceProvider;
            return cmb.p1(0.5f, cmb.v0(i6, ylbVar3));
        }
        int i7 = cmb.c6;
        ylbVar = ((d) d38Var).resourceProvider;
        int v0 = cmb.v0(i7, ylbVar);
        ylbVar2 = ((d) d38Var).resourceProvider;
        return cmb.v(v0, cmb.p1(0.7f, d38.z0(cmb.v0(i4, ylbVar2))));
    }

    public final void b(boolean z) {
        w28 w28Var = this.d;
        long j = w28Var.n;
        tm tmVar = this.c;
        if (j != 0) {
            tmVar.j(j, z);
            this.b = null;
        } else {
            tmVar.g(null, z);
            if (this.b == null) {
                this.b = new uib(jb6.M0(w28Var.q0.a ? 2131752249 : 2131743416, null), 16.0f, null);
            }
        }
    }

    public final void c() {
        boolean z = jb6.a0;
        tm tmVar = this.c;
        int L = z ? gm.L(21.0f) : (getWidth() - tmVar.s) - gm.L(21.0f);
        int height = getHeight();
        int i = tmVar.s;
        int i2 = tmVar.s;
        tmVar.setBounds(L, (height - i) / 2, jb6.a0 ? gm.L(21.0f) + i2 : getWidth() - gm.L(21.0f), (getHeight() + i2) / 2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        c();
        Integer valueOf = Integer.valueOf(a());
        tm tmVar = this.c;
        tmVar.k(valueOf);
        uib uibVar = this.b;
        if (uibVar != null) {
            uibVar.c((getMeasuredWidth() - this.b.j()) - gm.L(19.0f), getMeasuredHeight() / 2.0f, 1.0f, this.d.q0.getThemedColor(cmb.p6), canvas);
        } else {
            tmVar.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.c.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c.b();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(50.0f), TLObject.FLAG_30));
    }

    @Override // vlb
    public final void updateColors() {
        d38 d38Var = this.d.q0;
        setBackgroundColor(d38Var.getThemedColor(cmb.c6));
        this.a.setTextColor(d38Var.getThemedColor(cmb.F6));
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }
}
