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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l4 b;

    public /* synthetic */ u(l4 l4Var, int i10) {
        this.a = i10;
        this.b = l4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                l4 l4Var = this.b;
                if (l4Var.r0[0].f()) {
                    if (l4Var.r0[0].getWebView() != null) {
                        l4Var.r0[0].getWebView().findNext(false);
                        break;
                    }
                } else {
                    l4Var.W(l4Var.D - 1);
                    break;
                }
                break;
            case 1:
                l4 l4Var2 = this.b;
                if (l4Var2.r0[0].f()) {
                    if (l4Var2.r0[0].getWebView() != null) {
                        l4Var2.r0[0].getWebView().findNext(true);
                        break;
                    }
                } else {
                    l4Var2.W(l4Var2.D + 1);
                    break;
                }
                break;
            case 2:
                l4 l4Var3 = this.b;
                m0 m0Var = l4Var3.e0;
                if (m0Var.Q) {
                    m0Var.h(false);
                    break;
                } else if (m0Var.T) {
                    m0Var.k(false);
                    break;
                } else {
                    if (l4Var3.J()) {
                        p3 p3Var = l4Var3.r0[0];
                        if (p3Var.s) {
                            if (p3Var.f() && p3Var.getWebView() != null) {
                                p3Var.getWebView().goBack();
                                break;
                            }
                        }
                    }
                    if (l4Var3.a0.size() > 1) {
                        l4Var3.G();
                        break;
                    } else {
                        y3 y3Var = l4Var3.H;
                        if (y3Var != null) {
                            y3Var.dismiss(false);
                            break;
                        } else {
                            l4Var3.o(true, true);
                            break;
                        }
                    }
                }
                break;
            case 3:
                y3 y3Var2 = this.b.H;
                if (y3Var2 != null) {
                    y3Var2.dismiss(true);
                    break;
                }
                break;
            case 4:
                l4 l4Var4 = this.b;
                int intValue = ((Integer) view.getTag()).intValue();
                l4Var4.a = intValue;
                int i10 = 0;
                int i11 = 0;
                while (i11 < 2) {
                    ((RadioButton) l4Var4.P0[i11].b).a(i11 == intValue, true);
                    i11++;
                }
                t3 t3Var = l4.c1;
                int i12 = l4Var4.a;
                t3Var.getClass();
                ApplicationLoader.applicationContext.getSharedPreferences("articles", 0).edit().putInt("font_type", i12).commit();
                Typeface typeface = i12 == 0 ? Typeface.DEFAULT : Typeface.SERIF;
                Typeface typeface2 = i12 == 0 ? AndroidUtilities.getTypeface("fonts/ritalic.ttf") : Typeface.create("serif", 2);
                Typeface bold = i12 == 0 ? AndroidUtilities.bold() : Typeface.create("serif", 1);
                Typeface typeface3 = i12 == 0 ? AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM_ITALIC) : Typeface.create("serif", 3);
                for (int i13 = 0; i13 < t3Var.t.size(); i13++) {
                    t3.b(t3Var.t.keyAt(i13), (TextPaint) t3Var.t.valueAt(i13), typeface, typeface3, bold, typeface2);
                }
                for (int i14 = 0; i14 < t3Var.s.size(); i14++) {
                    t3.b(t3Var.s.keyAt(i14), (TextPaint) t3Var.s.valueAt(i14), typeface, typeface3, bold, typeface2);
                }
                for (int i15 = 0; i15 < t3Var.q.size(); i15++) {
                    t3.b(t3Var.q.keyAt(i15), (TextPaint) t3Var.q.valueAt(i15), typeface, typeface3, bold, typeface2);
                }
                for (int i16 = 0; i16 < t3Var.r.size(); i16++) {
                    t3.b(t3Var.r.keyAt(i16), (TextPaint) t3Var.r.valueAt(i16), typeface, typeface3, bold, typeface2);
                }
                for (int i17 = 0; i17 < t3Var.u.size(); i17++) {
                    t3.b(t3Var.u.keyAt(i17), (TextPaint) t3Var.u.valueAt(i17), typeface, typeface3, bold, typeface2);
                }
                for (int i18 = 0; i18 < t3Var.w.size(); i18++) {
                    t3.b(t3Var.w.keyAt(i18), (TextPaint) t3Var.w.valueAt(i18), typeface, typeface3, bold, typeface2);
                }
                for (int i19 = 0; i19 < t3Var.x.size(); i19++) {
                    t3.b(t3Var.x.keyAt(i19), (TextPaint) t3Var.x.valueAt(i19), typeface, typeface3, bold, typeface2);
                }
                for (int i20 = 0; i20 < t3Var.b.size(); i20++) {
                    t3.b(t3Var.b.keyAt(i20), (TextPaint) t3Var.b.valueAt(i20), typeface, typeface3, bold, typeface2);
                }
                for (int i21 = 0; i21 < t3Var.c.size(); i21++) {
                    t3.b(t3Var.c.keyAt(i21), (TextPaint) t3Var.c.valueAt(i21), typeface, typeface3, bold, typeface2);
                }
                for (int i22 = 0; i22 < t3Var.o.size(); i22++) {
                    t3.b(t3Var.o.keyAt(i22), (TextPaint) t3Var.o.valueAt(i22), typeface, typeface3, bold, typeface2);
                }
                for (int i23 = 0; i23 < t3Var.p.size(); i23++) {
                    t3.b(t3Var.p.keyAt(i23), (TextPaint) t3Var.p.valueAt(i23), typeface, typeface3, bold, typeface2);
                }
                for (int i24 = 0; i24 < t3Var.v.size(); i24++) {
                    t3.b(t3Var.v.keyAt(i24), (TextPaint) t3Var.v.valueAt(i24), typeface, typeface3, bold, typeface2);
                }
                for (int i25 = 0; i25 < t3Var.y.size(); i25++) {
                    t3.b(t3Var.y.keyAt(i25), (TextPaint) t3Var.y.valueAt(i25), typeface, typeface3, bold, typeface2);
                }
                for (int i26 = 0; i26 < t3Var.z.size(); i26++) {
                    t3.b(t3Var.z.keyAt(i26), (TextPaint) t3Var.z.valueAt(i26), typeface, typeface3, bold, typeface2);
                }
                for (int i27 = 0; i27 < t3Var.A.size(); i27++) {
                    t3.b(t3Var.A.keyAt(i27), (TextPaint) t3Var.A.valueAt(i27), typeface, typeface3, bold, typeface2);
                }
                while (true) {
                    p3[] p3VarArr = l4Var4.r0;
                    if (i10 >= p3VarArr.length) {
                        break;
                    } else {
                        p3VarArr[i10].c.l();
                        i10++;
                    }
                }
            default:
                l4 l4Var5 = this.b;
                d3 d3Var = l4Var5.d;
                if (d3Var != null) {
                    AndroidUtilities.addToClipboard(d3Var.d.getText());
                    if (AndroidUtilities.shouldShowClipboardToast()) {
                        Toast.makeText(l4Var5.I, LocaleController.getString(R.string.TextCopied), 0).show();
                    }
                }
                org.telegram.ui.ActionBar.p1 p1Var = l4Var5.E;
                if (p1Var != null && p1Var.isShowing()) {
                    l4Var5.E.d(true);
                    break;
                }
                break;
        }
    }
}
