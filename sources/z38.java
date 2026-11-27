// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class z38 extends FrameLayout implements snb {
    public final TextView a;
    public pkb b;
    public final ul c;
    public final /* synthetic */ a48 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z38(a48 a48Var, Context context) {
        super(context);
        this.d = a48Var;
        int i = aob.d6;
        h48 h48Var = a48Var.q0;
        yob.h(i, h48Var.getResourceProvider(), this);
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setTextSize(1, 16.0f);
        yob.X(textView, aob.G6, h48Var.getResourceProvider());
        boolean z = a48Var.n0;
        boolean z2 = h48Var.a;
        if (z) {
            textView.setText(ob6.M0(z2 ? 2131752278 : 2131743385, null));
        } else {
            textView.setText(ob6.M0(z2 ? 2131752291 : 2131743388, null));
        }
        addView(textView, tre.d(-1, -2.0f, 23, 20.0f, 0.0f, 20.0f, 0.0f));
        this.c = new ul(hl.L(24.0f), 13, this, false);
    }

    public final int a() {
        int i;
        lc7 lc7Var;
        kc7 d;
        int i2;
        vnb vnbVar;
        vnb vnbVar2;
        vnb vnbVar3;
        vnb vnbVar4;
        a48 a48Var = this.d;
        h48 h48Var = a48Var.q0;
        int i3 = a48Var.h;
        if (i3 >= 0) {
            if (i3 < 7) {
                return h48Var.getThemedColor(aob.r8[i3]);
            }
            if (a48Var.n0) {
                i2 = ((e) h48Var).currentAccount;
                lc7Var = uc7.s1(i2).E3;
            } else {
                i = ((e) h48Var).currentAccount;
                lc7Var = uc7.s1(i).F3;
            }
            return (lc7Var == null || (d = lc7Var.d(a48Var.h)) == null) ? h48Var.getThemedColor(aob.r8[0]) : d.f();
        }
        int i4 = aob.s8;
        if (hl.B(h48Var.getThemedColor(i4)) > 0.8f) {
            int i5 = aob.n6;
            vnbVar4 = ((e) h48Var).resourceProvider;
            return aob.v0(i5, vnbVar4);
        }
        if (hl.B(h48Var.getThemedColor(i4)) < 0.2f) {
            int i6 = aob.A8;
            vnbVar3 = ((e) h48Var).resourceProvider;
            return aob.p1(0.5f, aob.v0(i6, vnbVar3));
        }
        int i7 = aob.d6;
        vnbVar = ((e) h48Var).resourceProvider;
        int v0 = aob.v0(i7, vnbVar);
        vnbVar2 = ((e) h48Var).resourceProvider;
        return aob.v(v0, aob.p1(0.7f, h48.z0(aob.v0(i4, vnbVar2))));
    }

    public final void b(boolean z) {
        a48 a48Var = this.d;
        long j = a48Var.n;
        ul ulVar = this.c;
        if (j != 0) {
            ulVar.j(j, z);
            this.b = null;
        } else {
            ulVar.g(null, z);
            if (this.b == null) {
                this.b = new pkb(ob6.M0(a48Var.q0.a ? 2131752277 : 2131743384, null), 16.0f, null);
            }
        }
    }

    public final void c() {
        boolean z = ob6.a0;
        ul ulVar = this.c;
        int L = z ? hl.L(21.0f) : (getWidth() - ulVar.s) - hl.L(21.0f);
        int height = getHeight();
        int i = ulVar.s;
        int i2 = ulVar.s;
        ulVar.setBounds(L, (height - i) / 2, ob6.a0 ? hl.L(21.0f) + i2 : getWidth() - hl.L(21.0f), (getHeight() + i2) / 2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        c();
        Integer valueOf = Integer.valueOf(a());
        ul ulVar = this.c;
        ulVar.k(valueOf);
        pkb pkbVar = this.b;
        if (pkbVar != null) {
            pkbVar.c((getMeasuredWidth() - this.b.j()) - hl.L(19.0f), getMeasuredHeight() / 2.0f, 1.0f, this.d.q0.getThemedColor(aob.q6), canvas);
        } else {
            ulVar.draw(canvas);
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(50.0f), TLObject.FLAG_30));
    }

    @Override // snb
    public final void updateColors() {
        h48 h48Var = this.d.q0;
        setBackgroundColor(h48Var.getThemedColor(aob.d6));
        this.a.setTextColor(h48Var.getThemedColor(aob.G6));
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }
}
