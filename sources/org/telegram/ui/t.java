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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ m4 b;

    public /* synthetic */ t(m4 m4Var, int i10) {
        this.a = i10;
        this.b = m4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                m4 m4Var = this.b;
                if (m4Var.q0[0].f()) {
                    if (m4Var.q0[0].getWebView() != null) {
                        m4Var.q0[0].getWebView().findNext(false);
                        break;
                    }
                } else {
                    m4Var.W(m4Var.C - 1);
                    break;
                }
                break;
            case 1:
                m4 m4Var2 = this.b;
                if (m4Var2.q0[0].f()) {
                    if (m4Var2.q0[0].getWebView() != null) {
                        m4Var2.q0[0].getWebView().findNext(true);
                        break;
                    }
                } else {
                    m4Var2.W(m4Var2.C + 1);
                    break;
                }
                break;
            case 2:
                m4 m4Var3 = this.b;
                o0 o0Var = m4Var3.d0;
                if (o0Var.P) {
                    o0Var.h(false);
                    break;
                } else if (o0Var.S) {
                    o0Var.k(false);
                    break;
                } else {
                    if (m4Var3.J()) {
                        q3 q3Var = m4Var3.q0[0];
                        if (q3Var.s) {
                            if (q3Var.f() && q3Var.getWebView() != null) {
                                q3Var.getWebView().goBack();
                                break;
                            }
                        }
                    }
                    if (m4Var3.Z.size() > 1) {
                        m4Var3.G();
                        break;
                    } else {
                        z3 z3Var = m4Var3.G;
                        if (z3Var != null) {
                            z3Var.dismiss(false);
                            break;
                        } else {
                            m4Var3.o(true, true);
                            break;
                        }
                    }
                }
                break;
            case 3:
                z3 z3Var2 = this.b.G;
                if (z3Var2 != null) {
                    z3Var2.dismiss(true);
                    break;
                }
                break;
            case 4:
                m4 m4Var4 = this.b;
                int intValue = ((Integer) view.getTag()).intValue();
                m4Var4.a = intValue;
                int i10 = 0;
                int i11 = 0;
                while (i11 < 2) {
                    ((RadioButton) m4Var4.O0[i11].b).a(i11 == intValue, true);
                    i11++;
                }
                u3 u3Var = m4.b1;
                int i12 = m4Var4.a;
                u3Var.getClass();
                ApplicationLoader.applicationContext.getSharedPreferences("articles", 0).edit().putInt("font_type", i12).commit();
                Typeface typeface = i12 == 0 ? Typeface.DEFAULT : Typeface.SERIF;
                Typeface typeface2 = i12 == 0 ? AndroidUtilities.getTypeface("fonts/ritalic.ttf") : Typeface.create("serif", 2);
                Typeface bold = i12 == 0 ? AndroidUtilities.bold() : Typeface.create("serif", 1);
                Typeface typeface3 = i12 == 0 ? AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM_ITALIC) : Typeface.create("serif", 3);
                for (int i13 = 0; i13 < u3Var.t.size(); i13++) {
                    u3.b(u3Var.t.keyAt(i13), (TextPaint) u3Var.t.valueAt(i13), typeface, typeface3, bold, typeface2);
                }
                for (int i14 = 0; i14 < u3Var.s.size(); i14++) {
                    u3.b(u3Var.s.keyAt(i14), (TextPaint) u3Var.s.valueAt(i14), typeface, typeface3, bold, typeface2);
                }
                for (int i15 = 0; i15 < u3Var.q.size(); i15++) {
                    u3.b(u3Var.q.keyAt(i15), (TextPaint) u3Var.q.valueAt(i15), typeface, typeface3, bold, typeface2);
                }
                for (int i16 = 0; i16 < u3Var.r.size(); i16++) {
                    u3.b(u3Var.r.keyAt(i16), (TextPaint) u3Var.r.valueAt(i16), typeface, typeface3, bold, typeface2);
                }
                for (int i17 = 0; i17 < u3Var.u.size(); i17++) {
                    u3.b(u3Var.u.keyAt(i17), (TextPaint) u3Var.u.valueAt(i17), typeface, typeface3, bold, typeface2);
                }
                for (int i18 = 0; i18 < u3Var.w.size(); i18++) {
                    u3.b(u3Var.w.keyAt(i18), (TextPaint) u3Var.w.valueAt(i18), typeface, typeface3, bold, typeface2);
                }
                for (int i19 = 0; i19 < u3Var.x.size(); i19++) {
                    u3.b(u3Var.x.keyAt(i19), (TextPaint) u3Var.x.valueAt(i19), typeface, typeface3, bold, typeface2);
                }
                for (int i20 = 0; i20 < u3Var.b.size(); i20++) {
                    u3.b(u3Var.b.keyAt(i20), (TextPaint) u3Var.b.valueAt(i20), typeface, typeface3, bold, typeface2);
                }
                for (int i21 = 0; i21 < u3Var.c.size(); i21++) {
                    u3.b(u3Var.c.keyAt(i21), (TextPaint) u3Var.c.valueAt(i21), typeface, typeface3, bold, typeface2);
                }
                for (int i22 = 0; i22 < u3Var.o.size(); i22++) {
                    u3.b(u3Var.o.keyAt(i22), (TextPaint) u3Var.o.valueAt(i22), typeface, typeface3, bold, typeface2);
                }
                for (int i23 = 0; i23 < u3Var.p.size(); i23++) {
                    u3.b(u3Var.p.keyAt(i23), (TextPaint) u3Var.p.valueAt(i23), typeface, typeface3, bold, typeface2);
                }
                for (int i24 = 0; i24 < u3Var.v.size(); i24++) {
                    u3.b(u3Var.v.keyAt(i24), (TextPaint) u3Var.v.valueAt(i24), typeface, typeface3, bold, typeface2);
                }
                for (int i25 = 0; i25 < u3Var.y.size(); i25++) {
                    u3.b(u3Var.y.keyAt(i25), (TextPaint) u3Var.y.valueAt(i25), typeface, typeface3, bold, typeface2);
                }
                for (int i26 = 0; i26 < u3Var.z.size(); i26++) {
                    u3.b(u3Var.z.keyAt(i26), (TextPaint) u3Var.z.valueAt(i26), typeface, typeface3, bold, typeface2);
                }
                for (int i27 = 0; i27 < u3Var.A.size(); i27++) {
                    u3.b(u3Var.A.keyAt(i27), (TextPaint) u3Var.A.valueAt(i27), typeface, typeface3, bold, typeface2);
                }
                while (true) {
                    q3[] q3VarArr = m4Var4.q0;
                    if (i10 >= q3VarArr.length) {
                        break;
                    } else {
                        q3VarArr[i10].c.l();
                        i10++;
                    }
                }
            default:
                m4 m4Var5 = this.b;
                f3 f3Var = m4Var5.d;
                if (f3Var != null) {
                    AndroidUtilities.addToClipboard(f3Var.d.getText());
                    if (AndroidUtilities.shouldShowClipboardToast()) {
                        Toast.makeText(m4Var5.H, LocaleController.getString(R.string.TextCopied), 0).show();
                    }
                }
                org.telegram.ui.ActionBar.n1 n1Var = m4Var5.D;
                if (n1Var != null && n1Var.isShowing()) {
                    m4Var5.D.d(true);
                    break;
                }
                break;
        }
    }
}
