package org.telegram.ui;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import android.widget.Toast;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.RadioButton;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ h4 b;

    public /* synthetic */ s(h4 h4Var, int i10) {
        this.a = i10;
        this.b = h4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                h4 h4Var = this.b;
                if (h4Var.u0[0].f()) {
                    if (h4Var.u0[0].getWebView() != null) {
                        h4Var.u0[0].getWebView().findNext(false);
                        break;
                    }
                } else {
                    h4Var.W(h4Var.G - 1);
                    break;
                }
                break;
            case 1:
                h4 h4Var2 = this.b;
                if (h4Var2.u0[0].f()) {
                    if (h4Var2.u0[0].getWebView() != null) {
                        h4Var2.u0[0].getWebView().findNext(true);
                        break;
                    }
                } else {
                    h4Var2.W(h4Var2.G + 1);
                    break;
                }
                break;
            case 2:
                h4 h4Var3 = this.b;
                k0 k0Var = h4Var3.h0;
                if (k0Var.T) {
                    k0Var.h(false);
                    break;
                } else if (k0Var.W) {
                    k0Var.k(false);
                    break;
                } else {
                    if (h4Var3.J()) {
                        l3 l3Var = h4Var3.u0[0];
                        if (l3Var.s) {
                            if (l3Var.f() && l3Var.getWebView() != null) {
                                l3Var.getWebView().goBack();
                                break;
                            }
                        }
                    }
                    if (h4Var3.d0.size() > 1) {
                        h4Var3.G();
                        break;
                    } else {
                        u3 u3Var = h4Var3.K;
                        if (u3Var != null) {
                            u3Var.dismiss(false);
                            break;
                        } else {
                            h4Var3.o(true, true);
                            break;
                        }
                    }
                }
                break;
            case 3:
                u3 u3Var2 = this.b.K;
                if (u3Var2 != null) {
                    u3Var2.dismiss(true);
                    break;
                }
                break;
            case 4:
                h4 h4Var4 = this.b;
                int intValue = ((Integer) view.getTag()).intValue();
                h4Var4.a = intValue;
                int i10 = 0;
                int i11 = 0;
                while (i11 < 2) {
                    ((RadioButton) h4Var4.S0[i11].b).a(i11 == intValue, true);
                    i11++;
                }
                p3 p3Var = h4.f1;
                int i12 = h4Var4.a;
                p3Var.getClass();
                ApplicationLoader.applicationContext.getSharedPreferences("articles", 0).edit().putInt("font_type", i12).commit();
                Typeface typeface = i12 == 0 ? Typeface.DEFAULT : Typeface.SERIF;
                Typeface typeface2 = i12 == 0 ? AndroidUtilities.getTypeface("fonts/ritalic.ttf") : Typeface.create("serif", 2);
                Typeface bold = i12 == 0 ? AndroidUtilities.bold() : Typeface.create("serif", 1);
                Typeface typeface3 = i12 == 0 ? AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM_ITALIC) : Typeface.create("serif", 3);
                for (int i13 = 0; i13 < p3Var.t.size(); i13++) {
                    p3.b(p3Var.t.keyAt(i13), (TextPaint) p3Var.t.valueAt(i13), typeface, typeface3, bold, typeface2);
                }
                for (int i14 = 0; i14 < p3Var.s.size(); i14++) {
                    p3.b(p3Var.s.keyAt(i14), (TextPaint) p3Var.s.valueAt(i14), typeface, typeface3, bold, typeface2);
                }
                for (int i15 = 0; i15 < p3Var.q.size(); i15++) {
                    p3.b(p3Var.q.keyAt(i15), (TextPaint) p3Var.q.valueAt(i15), typeface, typeface3, bold, typeface2);
                }
                for (int i16 = 0; i16 < p3Var.r.size(); i16++) {
                    p3.b(p3Var.r.keyAt(i16), (TextPaint) p3Var.r.valueAt(i16), typeface, typeface3, bold, typeface2);
                }
                for (int i17 = 0; i17 < p3Var.u.size(); i17++) {
                    p3.b(p3Var.u.keyAt(i17), (TextPaint) p3Var.u.valueAt(i17), typeface, typeface3, bold, typeface2);
                }
                for (int i18 = 0; i18 < p3Var.w.size(); i18++) {
                    p3.b(p3Var.w.keyAt(i18), (TextPaint) p3Var.w.valueAt(i18), typeface, typeface3, bold, typeface2);
                }
                for (int i19 = 0; i19 < p3Var.x.size(); i19++) {
                    p3.b(p3Var.x.keyAt(i19), (TextPaint) p3Var.x.valueAt(i19), typeface, typeface3, bold, typeface2);
                }
                for (int i20 = 0; i20 < p3Var.b.size(); i20++) {
                    p3.b(p3Var.b.keyAt(i20), (TextPaint) p3Var.b.valueAt(i20), typeface, typeface3, bold, typeface2);
                }
                for (int i21 = 0; i21 < p3Var.c.size(); i21++) {
                    p3.b(p3Var.c.keyAt(i21), (TextPaint) p3Var.c.valueAt(i21), typeface, typeface3, bold, typeface2);
                }
                for (int i22 = 0; i22 < p3Var.o.size(); i22++) {
                    p3.b(p3Var.o.keyAt(i22), (TextPaint) p3Var.o.valueAt(i22), typeface, typeface3, bold, typeface2);
                }
                for (int i23 = 0; i23 < p3Var.p.size(); i23++) {
                    p3.b(p3Var.p.keyAt(i23), (TextPaint) p3Var.p.valueAt(i23), typeface, typeface3, bold, typeface2);
                }
                for (int i24 = 0; i24 < p3Var.v.size(); i24++) {
                    p3.b(p3Var.v.keyAt(i24), (TextPaint) p3Var.v.valueAt(i24), typeface, typeface3, bold, typeface2);
                }
                for (int i25 = 0; i25 < p3Var.y.size(); i25++) {
                    p3.b(p3Var.y.keyAt(i25), (TextPaint) p3Var.y.valueAt(i25), typeface, typeface3, bold, typeface2);
                }
                for (int i26 = 0; i26 < p3Var.z.size(); i26++) {
                    p3.b(p3Var.z.keyAt(i26), (TextPaint) p3Var.z.valueAt(i26), typeface, typeface3, bold, typeface2);
                }
                for (int i27 = 0; i27 < p3Var.A.size(); i27++) {
                    p3.b(p3Var.A.keyAt(i27), (TextPaint) p3Var.A.valueAt(i27), typeface, typeface3, bold, typeface2);
                }
                while (true) {
                    l3[] l3VarArr = h4Var4.u0;
                    if (i10 >= l3VarArr.length) {
                        break;
                    } else {
                        l3VarArr[i10].c.l();
                        i10++;
                    }
                }
            default:
                h4 h4Var5 = this.b;
                a3 a3Var = h4Var5.d;
                if (a3Var != null) {
                    AndroidUtilities.addToClipboard(a3Var.d.getText());
                    if (AndroidUtilities.shouldShowClipboardToast()) {
                        Toast.makeText(h4Var5.L, LocaleController.getString(R.string.TextCopied), 0).show();
                    }
                }
                org.telegram.ui.ActionBar.n1 n1Var = h4Var5.H;
                if (n1Var != null && n1Var.isShowing()) {
                    h4Var5.H.d(true);
                    break;
                }
                break;
        }
    }
}
