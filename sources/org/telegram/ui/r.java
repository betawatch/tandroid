package org.telegram.ui;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import android.widget.Toast;
import org.telegram.ui.Components.RadioButton;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ g4 b;

    public /* synthetic */ r(g4 g4Var, int i7) {
        this.a = i7;
        this.b = g4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = 0;
        switch (this.a) {
            case 0:
                g4 g4Var = this.b;
                if (g4Var.u0[0].f()) {
                    if (g4Var.u0[0].getWebView() != null) {
                        g4Var.u0[0].getWebView().findNext(false);
                        break;
                    }
                } else {
                    g4Var.U(g4Var.G - 1);
                    break;
                }
                break;
            case 1:
                g4 g4Var2 = this.b;
                if (g4Var2.u0[0].f()) {
                    if (g4Var2.u0[0].getWebView() != null) {
                        g4Var2.u0[0].getWebView().findNext(true);
                        break;
                    }
                } else {
                    g4Var2.U(g4Var2.G + 1);
                    break;
                }
                break;
            case 2:
                g4 g4Var3 = this.b;
                l0 l0Var = g4Var3.h0;
                if (l0Var.T) {
                    l0Var.h(false);
                    break;
                } else if (l0Var.W) {
                    l0Var.k(false);
                    break;
                } else {
                    if (g4Var3.H()) {
                        k3 k3Var = g4Var3.u0[0];
                        if (k3Var.s) {
                            if (k3Var.f() && k3Var.getWebView() != null) {
                                k3Var.getWebView().goBack();
                                break;
                            }
                        }
                    }
                    if (g4Var3.d0.size() > 1) {
                        g4Var3.E();
                        break;
                    } else {
                        t3 t3Var = g4Var3.K;
                        if (t3Var != null) {
                            t3Var.a(false);
                            break;
                        } else {
                            g4Var3.m(true, true);
                            break;
                        }
                    }
                }
                break;
            case 3:
                t3 t3Var2 = this.b.K;
                if (t3Var2 != null) {
                    t3Var2.a(true);
                    break;
                }
                break;
            case 4:
                g4 g4Var4 = this.b;
                int intValue = ((Integer) view.getTag()).intValue();
                g4Var4.a = intValue;
                int i10 = 0;
                while (i10 < 2) {
                    ((RadioButton) g4Var4.T0[i10].b).a(i10 == intValue, true);
                    i10++;
                }
                o3 o3Var = g4.g1;
                int i11 = g4Var4.a;
                o3Var.getClass();
                org.telegram.messenger.t0.b.getSharedPreferences("articles", 0).edit().putInt("font_type", i11).commit();
                Typeface typeface = i11 == 0 ? Typeface.DEFAULT : Typeface.SERIF;
                Typeface o12 = i11 == 0 ? org.telegram.messenger.g0.o1("fonts/ritalic.ttf") : Typeface.create("serif", 2);
                Typeface o4 = i11 == 0 ? org.telegram.messenger.g0.o() : Typeface.create("serif", 1);
                Typeface o13 = i11 == 0 ? org.telegram.messenger.g0.o1("fonts/rmediumitalic.ttf") : Typeface.create("serif", 3);
                for (int i12 = 0; i12 < o3Var.t.size(); i12++) {
                    o3.b(o3Var.t.keyAt(i12), (TextPaint) o3Var.t.valueAt(i12), typeface, o13, o4, o12);
                }
                for (int i13 = 0; i13 < o3Var.s.size(); i13++) {
                    o3.b(o3Var.s.keyAt(i13), (TextPaint) o3Var.s.valueAt(i13), typeface, o13, o4, o12);
                }
                for (int i14 = 0; i14 < o3Var.q.size(); i14++) {
                    o3.b(o3Var.q.keyAt(i14), (TextPaint) o3Var.q.valueAt(i14), typeface, o13, o4, o12);
                }
                for (int i15 = 0; i15 < o3Var.r.size(); i15++) {
                    o3.b(o3Var.r.keyAt(i15), (TextPaint) o3Var.r.valueAt(i15), typeface, o13, o4, o12);
                }
                for (int i16 = 0; i16 < o3Var.u.size(); i16++) {
                    o3.b(o3Var.u.keyAt(i16), (TextPaint) o3Var.u.valueAt(i16), typeface, o13, o4, o12);
                }
                for (int i17 = 0; i17 < o3Var.w.size(); i17++) {
                    o3.b(o3Var.w.keyAt(i17), (TextPaint) o3Var.w.valueAt(i17), typeface, o13, o4, o12);
                }
                for (int i18 = 0; i18 < o3Var.x.size(); i18++) {
                    o3.b(o3Var.x.keyAt(i18), (TextPaint) o3Var.x.valueAt(i18), typeface, o13, o4, o12);
                }
                for (int i19 = 0; i19 < o3Var.b.size(); i19++) {
                    o3.b(o3Var.b.keyAt(i19), (TextPaint) o3Var.b.valueAt(i19), typeface, o13, o4, o12);
                }
                for (int i20 = 0; i20 < o3Var.c.size(); i20++) {
                    o3.b(o3Var.c.keyAt(i20), (TextPaint) o3Var.c.valueAt(i20), typeface, o13, o4, o12);
                }
                for (int i21 = 0; i21 < o3Var.o.size(); i21++) {
                    o3.b(o3Var.o.keyAt(i21), (TextPaint) o3Var.o.valueAt(i21), typeface, o13, o4, o12);
                }
                for (int i22 = 0; i22 < o3Var.p.size(); i22++) {
                    o3.b(o3Var.p.keyAt(i22), (TextPaint) o3Var.p.valueAt(i22), typeface, o13, o4, o12);
                }
                for (int i23 = 0; i23 < o3Var.v.size(); i23++) {
                    o3.b(o3Var.v.keyAt(i23), (TextPaint) o3Var.v.valueAt(i23), typeface, o13, o4, o12);
                }
                for (int i24 = 0; i24 < o3Var.y.size(); i24++) {
                    o3.b(o3Var.y.keyAt(i24), (TextPaint) o3Var.y.valueAt(i24), typeface, o13, o4, o12);
                }
                for (int i25 = 0; i25 < o3Var.z.size(); i25++) {
                    o3.b(o3Var.z.keyAt(i25), (TextPaint) o3Var.z.valueAt(i25), typeface, o13, o4, o12);
                }
                for (int i26 = 0; i26 < o3Var.A.size(); i26++) {
                    o3.b(o3Var.A.keyAt(i26), (TextPaint) o3Var.A.valueAt(i26), typeface, o13, o4, o12);
                }
                while (true) {
                    k3[] k3VarArr = g4Var4.u0;
                    if (i7 >= k3VarArr.length) {
                        break;
                    } else {
                        k3VarArr[i7].c.f();
                        i7++;
                    }
                }
            default:
                g4 g4Var5 = this.b;
                z2 z2Var = g4Var5.d;
                if (z2Var != null) {
                    org.telegram.messenger.g0.g(z2Var.d.getText());
                    if (org.telegram.messenger.g0.I3()) {
                        Toast.makeText(g4Var5.L, org.telegram.messenger.id.M0(2131744194, null), 0).show();
                    }
                }
                org.telegram.ui.ActionBar.g1 g1Var = g4Var5.H;
                if (g1Var != null && g1Var.isShowing()) {
                    g4Var5.H.d(true);
                    break;
                }
                break;
        }
    }
}
