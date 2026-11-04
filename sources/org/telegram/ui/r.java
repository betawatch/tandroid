package org.telegram.ui;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import android.widget.Toast;
import org.telegram.ui.Components.RadioButton;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ i4 b;

    public /* synthetic */ r(i4 i4Var, int i3) {
        this.a = i3;
        this.b = i4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i3 = 0;
        switch (this.a) {
            case 0:
                i4 i4Var = this.b;
                if (i4Var.v0[0].f()) {
                    if (i4Var.v0[0].getWebView() != null) {
                        i4Var.v0[0].getWebView().findNext(false);
                        break;
                    }
                } else {
                    i4Var.U(i4Var.H - 1);
                    break;
                }
                break;
            case 1:
                i4 i4Var2 = this.b;
                if (i4Var2.v0[0].f()) {
                    if (i4Var2.v0[0].getWebView() != null) {
                        i4Var2.v0[0].getWebView().findNext(true);
                        break;
                    }
                } else {
                    i4Var2.U(i4Var2.H + 1);
                    break;
                }
                break;
            case 2:
                i4 i4Var3 = this.b;
                m0 m0Var = i4Var3.i0;
                if (m0Var.U) {
                    m0Var.h(false);
                    break;
                } else if (m0Var.a0) {
                    m0Var.k(false);
                    break;
                } else {
                    if (i4Var3.H()) {
                        l3 l3Var = i4Var3.v0[0];
                        if (l3Var.s) {
                            if (l3Var.f() && l3Var.getWebView() != null) {
                                l3Var.getWebView().goBack();
                                break;
                            }
                        }
                    }
                    if (i4Var3.e0.size() > 1) {
                        i4Var3.E();
                        break;
                    } else {
                        u3 u3Var = i4Var3.L;
                        if (u3Var != null) {
                            u3Var.a(false);
                            break;
                        } else {
                            i4Var3.m(true, true);
                            break;
                        }
                    }
                }
                break;
            case 3:
                u3 u3Var2 = this.b.L;
                if (u3Var2 != null) {
                    u3Var2.a(true);
                    break;
                }
                break;
            case 4:
                i4 i4Var4 = this.b;
                int intValue = ((Integer) view.getTag()).intValue();
                i4Var4.a = intValue;
                int i10 = 0;
                while (i10 < 2) {
                    ((RadioButton) i4Var4.U0[i10].b).a(i10 == intValue, true);
                    i10++;
                }
                p3 p3Var = i4.h1;
                int i11 = i4Var4.a;
                p3Var.getClass();
                org.telegram.messenger.t0.b.getSharedPreferences("articles", 0).edit().putInt("font_type", i11).commit();
                Typeface typeface = i11 == 0 ? Typeface.DEFAULT : Typeface.SERIF;
                Typeface o12 = i11 == 0 ? org.telegram.messenger.g0.o1("fonts/ritalic.ttf") : Typeface.create("serif", 2);
                Typeface o10 = i11 == 0 ? org.telegram.messenger.g0.o() : Typeface.create("serif", 1);
                Typeface o13 = i11 == 0 ? org.telegram.messenger.g0.o1("fonts/rmediumitalic.ttf") : Typeface.create("serif", 3);
                for (int i12 = 0; i12 < p3Var.t.size(); i12++) {
                    p3.b(p3Var.t.keyAt(i12), (TextPaint) p3Var.t.valueAt(i12), typeface, o13, o10, o12);
                }
                for (int i13 = 0; i13 < p3Var.s.size(); i13++) {
                    p3.b(p3Var.s.keyAt(i13), (TextPaint) p3Var.s.valueAt(i13), typeface, o13, o10, o12);
                }
                for (int i14 = 0; i14 < p3Var.q.size(); i14++) {
                    p3.b(p3Var.q.keyAt(i14), (TextPaint) p3Var.q.valueAt(i14), typeface, o13, o10, o12);
                }
                for (int i15 = 0; i15 < p3Var.r.size(); i15++) {
                    p3.b(p3Var.r.keyAt(i15), (TextPaint) p3Var.r.valueAt(i15), typeface, o13, o10, o12);
                }
                for (int i16 = 0; i16 < p3Var.u.size(); i16++) {
                    p3.b(p3Var.u.keyAt(i16), (TextPaint) p3Var.u.valueAt(i16), typeface, o13, o10, o12);
                }
                for (int i17 = 0; i17 < p3Var.w.size(); i17++) {
                    p3.b(p3Var.w.keyAt(i17), (TextPaint) p3Var.w.valueAt(i17), typeface, o13, o10, o12);
                }
                for (int i18 = 0; i18 < p3Var.x.size(); i18++) {
                    p3.b(p3Var.x.keyAt(i18), (TextPaint) p3Var.x.valueAt(i18), typeface, o13, o10, o12);
                }
                for (int i19 = 0; i19 < p3Var.b.size(); i19++) {
                    p3.b(p3Var.b.keyAt(i19), (TextPaint) p3Var.b.valueAt(i19), typeface, o13, o10, o12);
                }
                for (int i20 = 0; i20 < p3Var.c.size(); i20++) {
                    p3.b(p3Var.c.keyAt(i20), (TextPaint) p3Var.c.valueAt(i20), typeface, o13, o10, o12);
                }
                for (int i21 = 0; i21 < p3Var.o.size(); i21++) {
                    p3.b(p3Var.o.keyAt(i21), (TextPaint) p3Var.o.valueAt(i21), typeface, o13, o10, o12);
                }
                for (int i22 = 0; i22 < p3Var.p.size(); i22++) {
                    p3.b(p3Var.p.keyAt(i22), (TextPaint) p3Var.p.valueAt(i22), typeface, o13, o10, o12);
                }
                for (int i23 = 0; i23 < p3Var.v.size(); i23++) {
                    p3.b(p3Var.v.keyAt(i23), (TextPaint) p3Var.v.valueAt(i23), typeface, o13, o10, o12);
                }
                for (int i24 = 0; i24 < p3Var.y.size(); i24++) {
                    p3.b(p3Var.y.keyAt(i24), (TextPaint) p3Var.y.valueAt(i24), typeface, o13, o10, o12);
                }
                for (int i25 = 0; i25 < p3Var.z.size(); i25++) {
                    p3.b(p3Var.z.keyAt(i25), (TextPaint) p3Var.z.valueAt(i25), typeface, o13, o10, o12);
                }
                for (int i26 = 0; i26 < p3Var.A.size(); i26++) {
                    p3.b(p3Var.A.keyAt(i26), (TextPaint) p3Var.A.valueAt(i26), typeface, o13, o10, o12);
                }
                while (true) {
                    l3[] l3VarArr = i4Var4.v0;
                    if (i3 >= l3VarArr.length) {
                        break;
                    } else {
                        l3VarArr[i3].c.f();
                        i3++;
                    }
                }
            default:
                i4 i4Var5 = this.b;
                a3 a3Var = i4Var5.d;
                if (a3Var != null) {
                    org.telegram.messenger.g0.g(a3Var.d.getText());
                    if (org.telegram.messenger.g0.I3()) {
                        Toast.makeText(i4Var5.M, org.telegram.messenger.bd.M0(2131744204, null), 0).show();
                    }
                }
                org.telegram.ui.ActionBar.f1 f1Var = i4Var5.I;
                if (f1Var != null && f1Var.isShowing()) {
                    i4Var5.I.d(true);
                    break;
                }
                break;
        }
    }
}
