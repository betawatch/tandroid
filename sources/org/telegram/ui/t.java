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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ j4 b;

    public /* synthetic */ t(j4 j4Var, int i10) {
        this.a = i10;
        this.b = j4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                j4 j4Var = this.b;
                if (j4Var.u0[0].f()) {
                    if (j4Var.u0[0].getWebView() != null) {
                        j4Var.u0[0].getWebView().findNext(false);
                        break;
                    }
                } else {
                    j4Var.W(j4Var.G - 1);
                    break;
                }
                break;
            case 1:
                j4 j4Var2 = this.b;
                if (j4Var2.u0[0].f()) {
                    if (j4Var2.u0[0].getWebView() != null) {
                        j4Var2.u0[0].getWebView().findNext(true);
                        break;
                    }
                } else {
                    j4Var2.W(j4Var2.G + 1);
                    break;
                }
                break;
            case 2:
                j4 j4Var3 = this.b;
                l0 l0Var = j4Var3.h0;
                if (l0Var.T) {
                    l0Var.h(false);
                    break;
                } else if (l0Var.W) {
                    l0Var.k(false);
                    break;
                } else {
                    if (j4Var3.J()) {
                        n3 n3Var = j4Var3.u0[0];
                        if (n3Var.s) {
                            if (n3Var.f() && n3Var.getWebView() != null) {
                                n3Var.getWebView().goBack();
                                break;
                            }
                        }
                    }
                    if (j4Var3.d0.size() > 1) {
                        j4Var3.G();
                        break;
                    } else {
                        w3 w3Var = j4Var3.K;
                        if (w3Var != null) {
                            w3Var.dismiss(false);
                            break;
                        } else {
                            j4Var3.o(true, true);
                            break;
                        }
                    }
                }
                break;
            case 3:
                w3 w3Var2 = this.b.K;
                if (w3Var2 != null) {
                    w3Var2.dismiss(true);
                    break;
                }
                break;
            case 4:
                j4 j4Var4 = this.b;
                int intValue = ((Integer) view.getTag()).intValue();
                j4Var4.a = intValue;
                int i10 = 0;
                int i11 = 0;
                while (i11 < 2) {
                    ((RadioButton) j4Var4.S0[i11].b).a(i11 == intValue, true);
                    i11++;
                }
                r3 r3Var = j4.f1;
                int i12 = j4Var4.a;
                r3Var.getClass();
                ApplicationLoader.applicationContext.getSharedPreferences("articles", 0).edit().putInt("font_type", i12).commit();
                Typeface typeface = i12 == 0 ? Typeface.DEFAULT : Typeface.SERIF;
                Typeface typeface2 = i12 == 0 ? AndroidUtilities.getTypeface("fonts/ritalic.ttf") : Typeface.create("serif", 2);
                Typeface bold = i12 == 0 ? AndroidUtilities.bold() : Typeface.create("serif", 1);
                Typeface typeface3 = i12 == 0 ? AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM_ITALIC) : Typeface.create("serif", 3);
                for (int i13 = 0; i13 < r3Var.t.size(); i13++) {
                    r3.b(r3Var.t.keyAt(i13), (TextPaint) r3Var.t.valueAt(i13), typeface, typeface3, bold, typeface2);
                }
                for (int i14 = 0; i14 < r3Var.s.size(); i14++) {
                    r3.b(r3Var.s.keyAt(i14), (TextPaint) r3Var.s.valueAt(i14), typeface, typeface3, bold, typeface2);
                }
                for (int i15 = 0; i15 < r3Var.q.size(); i15++) {
                    r3.b(r3Var.q.keyAt(i15), (TextPaint) r3Var.q.valueAt(i15), typeface, typeface3, bold, typeface2);
                }
                for (int i16 = 0; i16 < r3Var.r.size(); i16++) {
                    r3.b(r3Var.r.keyAt(i16), (TextPaint) r3Var.r.valueAt(i16), typeface, typeface3, bold, typeface2);
                }
                for (int i17 = 0; i17 < r3Var.u.size(); i17++) {
                    r3.b(r3Var.u.keyAt(i17), (TextPaint) r3Var.u.valueAt(i17), typeface, typeface3, bold, typeface2);
                }
                for (int i18 = 0; i18 < r3Var.w.size(); i18++) {
                    r3.b(r3Var.w.keyAt(i18), (TextPaint) r3Var.w.valueAt(i18), typeface, typeface3, bold, typeface2);
                }
                for (int i19 = 0; i19 < r3Var.x.size(); i19++) {
                    r3.b(r3Var.x.keyAt(i19), (TextPaint) r3Var.x.valueAt(i19), typeface, typeface3, bold, typeface2);
                }
                for (int i20 = 0; i20 < r3Var.b.size(); i20++) {
                    r3.b(r3Var.b.keyAt(i20), (TextPaint) r3Var.b.valueAt(i20), typeface, typeface3, bold, typeface2);
                }
                for (int i21 = 0; i21 < r3Var.c.size(); i21++) {
                    r3.b(r3Var.c.keyAt(i21), (TextPaint) r3Var.c.valueAt(i21), typeface, typeface3, bold, typeface2);
                }
                for (int i22 = 0; i22 < r3Var.o.size(); i22++) {
                    r3.b(r3Var.o.keyAt(i22), (TextPaint) r3Var.o.valueAt(i22), typeface, typeface3, bold, typeface2);
                }
                for (int i23 = 0; i23 < r3Var.p.size(); i23++) {
                    r3.b(r3Var.p.keyAt(i23), (TextPaint) r3Var.p.valueAt(i23), typeface, typeface3, bold, typeface2);
                }
                for (int i24 = 0; i24 < r3Var.v.size(); i24++) {
                    r3.b(r3Var.v.keyAt(i24), (TextPaint) r3Var.v.valueAt(i24), typeface, typeface3, bold, typeface2);
                }
                for (int i25 = 0; i25 < r3Var.y.size(); i25++) {
                    r3.b(r3Var.y.keyAt(i25), (TextPaint) r3Var.y.valueAt(i25), typeface, typeface3, bold, typeface2);
                }
                for (int i26 = 0; i26 < r3Var.z.size(); i26++) {
                    r3.b(r3Var.z.keyAt(i26), (TextPaint) r3Var.z.valueAt(i26), typeface, typeface3, bold, typeface2);
                }
                for (int i27 = 0; i27 < r3Var.A.size(); i27++) {
                    r3.b(r3Var.A.keyAt(i27), (TextPaint) r3Var.A.valueAt(i27), typeface, typeface3, bold, typeface2);
                }
                while (true) {
                    n3[] n3VarArr = j4Var4.u0;
                    if (i10 >= n3VarArr.length) {
                        break;
                    } else {
                        n3VarArr[i10].c.l();
                        i10++;
                    }
                }
            default:
                j4 j4Var5 = this.b;
                c3 c3Var = j4Var5.d;
                if (c3Var != null) {
                    AndroidUtilities.addToClipboard(c3Var.d.getText());
                    if (AndroidUtilities.shouldShowClipboardToast()) {
                        Toast.makeText(j4Var5.L, LocaleController.getString(R.string.TextCopied), 0).show();
                    }
                }
                org.telegram.ui.ActionBar.p1 p1Var = j4Var5.H;
                if (p1Var != null && p1Var.isShowing()) {
                    j4Var5.H.d(true);
                    break;
                }
                break;
        }
    }
}
