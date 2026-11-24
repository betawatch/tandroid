// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class s08 extends FrameLayout implements tjb {
    public final TextView a;
    public tgb b;
    public final tl c;
    public final /* synthetic */ t08 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s08(t08 t08Var, Context context) {
        super(context);
        this.d = t08Var;
        int i = bkb.c6;
        a18 a18Var = t08Var.q0;
        zkb.h(i, a18Var.getResourceProvider(), this);
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setTextSize(1, 16.0f);
        zkb.X(textView, bkb.F6, a18Var.getResourceProvider());
        boolean z = t08Var.n0;
        boolean z2 = a18Var.a;
        if (z) {
            textView.setText(k96.M0(z2 ? 2131752300 : 2131743491, null));
        } else {
            textView.setText(k96.M0(z2 ? 2131752309 : 2131743494, null));
        }
        addView(textView, nme.d(-1, -2.0f, 23, 20.0f, 0.0f, 20.0f, 0.0f));
        this.c = new tl(gl.L(24.0f), 13, this, false);
    }

    public final int a() {
        int i;
        ea7 ea7Var;
        da7 d;
        int i2;
        wjb wjbVar;
        wjb wjbVar2;
        wjb wjbVar3;
        wjb wjbVar4;
        t08 t08Var = this.d;
        a18 a18Var = t08Var.q0;
        int i3 = t08Var.h;
        if (i3 >= 0) {
            if (i3 < 7) {
                return a18Var.getThemedColor(bkb.q8[i3]);
            }
            if (t08Var.n0) {
                i2 = ((d) a18Var).currentAccount;
                ea7Var = na7.q1(i2).E3;
            } else {
                i = ((d) a18Var).currentAccount;
                ea7Var = na7.q1(i).F3;
            }
            return (ea7Var == null || (d = ea7Var.d(t08Var.h)) == null) ? a18Var.getThemedColor(bkb.q8[0]) : d.f();
        }
        int i4 = bkb.r8;
        if (gl.B(a18Var.getThemedColor(i4)) > 0.8f) {
            int i5 = bkb.m6;
            wjbVar4 = ((d) a18Var).resourceProvider;
            return bkb.v0(i5, wjbVar4);
        }
        if (gl.B(a18Var.getThemedColor(i4)) < 0.2f) {
            int i6 = bkb.z8;
            wjbVar3 = ((d) a18Var).resourceProvider;
            return bkb.p1(0.5f, bkb.v0(i6, wjbVar3));
        }
        int i7 = bkb.c6;
        wjbVar = ((d) a18Var).resourceProvider;
        int v0 = bkb.v0(i7, wjbVar);
        wjbVar2 = ((d) a18Var).resourceProvider;
        return bkb.v(v0, bkb.p1(0.7f, a18.y0(bkb.v0(i4, wjbVar2))));
    }

    public final void b(boolean z) {
        t08 t08Var = this.d;
        long j = t08Var.n;
        tl tlVar = this.c;
        if (j != 0) {
            tlVar.j(j, z);
            this.b = null;
        } else {
            tlVar.g(null, z);
            if (this.b == null) {
                this.b = new tgb(k96.M0(t08Var.q0.a ? 2131752299 : 2131743490, null), 16.0f, null);
            }
        }
    }

    public final void c() {
        boolean z = k96.a0;
        tl tlVar = this.c;
        int L = z ? gl.L(21.0f) : (getWidth() - tlVar.s) - gl.L(21.0f);
        int height = getHeight();
        int i = tlVar.s;
        int i2 = tlVar.s;
        tlVar.setBounds(L, (height - i) / 2, k96.a0 ? gl.L(21.0f) + i2 : getWidth() - gl.L(21.0f), (getHeight() + i2) / 2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        c();
        Integer valueOf = Integer.valueOf(a());
        tl tlVar = this.c;
        tlVar.k(valueOf);
        tgb tgbVar = this.b;
        if (tgbVar != null) {
            tgbVar.c((getMeasuredWidth() - this.b.j()) - gl.L(19.0f), getMeasuredHeight() / 2.0f, 1.0f, this.d.q0.getThemedColor(bkb.p6), canvas);
        } else {
            tlVar.draw(canvas);
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(50.0f), TLObject.FLAG_30));
    }

    @Override // tjb
    public final void updateColors() {
        a18 a18Var = this.d.q0;
        setBackgroundColor(a18Var.getThemedColor(bkb.c6));
        this.a.setTextColor(a18Var.getThemedColor(bkb.F6));
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }
}
