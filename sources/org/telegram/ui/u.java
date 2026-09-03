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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ n4 b;

    public /* synthetic */ u(n4 n4Var, int i10) {
        this.a = i10;
        this.b = n4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                n4 n4Var = this.b;
                if (n4Var.r0[0].f()) {
                    if (n4Var.r0[0].getWebView() != null) {
                        n4Var.r0[0].getWebView().findNext(false);
                        break;
                    }
                } else {
                    n4Var.W(n4Var.D - 1);
                    break;
                }
                break;
            case 1:
                n4 n4Var2 = this.b;
                if (n4Var2.r0[0].f()) {
                    if (n4Var2.r0[0].getWebView() != null) {
                        n4Var2.r0[0].getWebView().findNext(true);
                        break;
                    }
                } else {
                    n4Var2.W(n4Var2.D + 1);
                    break;
                }
                break;
            case 2:
                n4 n4Var3 = this.b;
                o0 o0Var = n4Var3.e0;
                if (o0Var.Q) {
                    o0Var.h(false);
                    break;
                } else if (o0Var.T) {
                    o0Var.k(false);
                    break;
                } else {
                    if (n4Var3.J()) {
                        r3 r3Var = n4Var3.r0[0];
                        if (r3Var.s) {
                            if (r3Var.f() && r3Var.getWebView() != null) {
                                r3Var.getWebView().goBack();
                                break;
                            }
                        }
                    }
                    if (n4Var3.a0.size() > 1) {
                        n4Var3.G();
                        break;
                    } else {
                        a4 a4Var = n4Var3.H;
                        if (a4Var != null) {
                            a4Var.dismiss(false);
                            break;
                        } else {
                            n4Var3.o(true, true);
                            break;
                        }
                    }
                }
                break;
            case 3:
                a4 a4Var2 = this.b.H;
                if (a4Var2 != null) {
                    a4Var2.dismiss(true);
                    break;
                }
                break;
            case 4:
                n4 n4Var4 = this.b;
                int intValue = ((Integer) view.getTag()).intValue();
                n4Var4.a = intValue;
                int i10 = 0;
                int i11 = 0;
                while (i11 < 2) {
                    ((RadioButton) n4Var4.P0[i11].b).a(i11 == intValue, true);
                    i11++;
                }
                v3 v3Var = n4.c1;
                int i12 = n4Var4.a;
                v3Var.getClass();
                ApplicationLoader.applicationContext.getSharedPreferences("articles", 0).edit().putInt("font_type", i12).commit();
                Typeface typeface = i12 == 0 ? Typeface.DEFAULT : Typeface.SERIF;
                Typeface typeface2 = i12 == 0 ? AndroidUtilities.getTypeface("fonts/ritalic.ttf") : Typeface.create("serif", 2);
                Typeface bold = i12 == 0 ? AndroidUtilities.bold() : Typeface.create("serif", 1);
                Typeface typeface3 = i12 == 0 ? AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM_ITALIC) : Typeface.create("serif", 3);
                for (int i13 = 0; i13 < v3Var.t.size(); i13++) {
                    v3.b(v3Var.t.keyAt(i13), (TextPaint) v3Var.t.valueAt(i13), typeface, typeface3, bold, typeface2);
                }
                for (int i14 = 0; i14 < v3Var.s.size(); i14++) {
                    v3.b(v3Var.s.keyAt(i14), (TextPaint) v3Var.s.valueAt(i14), typeface, typeface3, bold, typeface2);
                }
                for (int i15 = 0; i15 < v3Var.q.size(); i15++) {
                    v3.b(v3Var.q.keyAt(i15), (TextPaint) v3Var.q.valueAt(i15), typeface, typeface3, bold, typeface2);
                }
                for (int i16 = 0; i16 < v3Var.r.size(); i16++) {
                    v3.b(v3Var.r.keyAt(i16), (TextPaint) v3Var.r.valueAt(i16), typeface, typeface3, bold, typeface2);
                }
                for (int i17 = 0; i17 < v3Var.u.size(); i17++) {
                    v3.b(v3Var.u.keyAt(i17), (TextPaint) v3Var.u.valueAt(i17), typeface, typeface3, bold, typeface2);
                }
                for (int i18 = 0; i18 < v3Var.w.size(); i18++) {
                    v3.b(v3Var.w.keyAt(i18), (TextPaint) v3Var.w.valueAt(i18), typeface, typeface3, bold, typeface2);
                }
                for (int i19 = 0; i19 < v3Var.x.size(); i19++) {
                    v3.b(v3Var.x.keyAt(i19), (TextPaint) v3Var.x.valueAt(i19), typeface, typeface3, bold, typeface2);
                }
                for (int i20 = 0; i20 < v3Var.b.size(); i20++) {
                    v3.b(v3Var.b.keyAt(i20), (TextPaint) v3Var.b.valueAt(i20), typeface, typeface3, bold, typeface2);
                }
                for (int i21 = 0; i21 < v3Var.c.size(); i21++) {
                    v3.b(v3Var.c.keyAt(i21), (TextPaint) v3Var.c.valueAt(i21), typeface, typeface3, bold, typeface2);
                }
                for (int i22 = 0; i22 < v3Var.o.size(); i22++) {
                    v3.b(v3Var.o.keyAt(i22), (TextPaint) v3Var.o.valueAt(i22), typeface, typeface3, bold, typeface2);
                }
                for (int i23 = 0; i23 < v3Var.p.size(); i23++) {
                    v3.b(v3Var.p.keyAt(i23), (TextPaint) v3Var.p.valueAt(i23), typeface, typeface3, bold, typeface2);
                }
                for (int i24 = 0; i24 < v3Var.v.size(); i24++) {
                    v3.b(v3Var.v.keyAt(i24), (TextPaint) v3Var.v.valueAt(i24), typeface, typeface3, bold, typeface2);
                }
                for (int i25 = 0; i25 < v3Var.y.size(); i25++) {
                    v3.b(v3Var.y.keyAt(i25), (TextPaint) v3Var.y.valueAt(i25), typeface, typeface3, bold, typeface2);
                }
                for (int i26 = 0; i26 < v3Var.z.size(); i26++) {
                    v3.b(v3Var.z.keyAt(i26), (TextPaint) v3Var.z.valueAt(i26), typeface, typeface3, bold, typeface2);
                }
                for (int i27 = 0; i27 < v3Var.A.size(); i27++) {
                    v3.b(v3Var.A.keyAt(i27), (TextPaint) v3Var.A.valueAt(i27), typeface, typeface3, bold, typeface2);
                }
                while (true) {
                    r3[] r3VarArr = n4Var4.r0;
                    if (i10 >= r3VarArr.length) {
                        break;
                    } else {
                        r3VarArr[i10].c.l();
                        i10++;
                    }
                }
            default:
                n4 n4Var5 = this.b;
                f3 f3Var = n4Var5.d;
                if (f3Var != null) {
                    AndroidUtilities.addToClipboard(f3Var.d.getText());
                    if (AndroidUtilities.shouldShowClipboardToast()) {
                        Toast.makeText(n4Var5.I, LocaleController.getString(R.string.TextCopied), 0).show();
                    }
                }
                org.telegram.ui.ActionBar.p1 p1Var = n4Var5.E;
                if (p1Var != null && p1Var.isShowing()) {
                    n4Var5.E.d(true);
                    break;
                }
                break;
        }
    }
}
