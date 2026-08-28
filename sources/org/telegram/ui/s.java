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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l4 b;

    public /* synthetic */ s(l4 l4Var, int i9) {
        this.a = i9;
        this.b = l4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                l4 l4Var = this.b;
                if (l4Var.q0[0].f()) {
                    if (l4Var.q0[0].getWebView() != null) {
                        l4Var.q0[0].getWebView().findNext(false);
                        break;
                    }
                } else {
                    l4Var.W(l4Var.C - 1);
                    break;
                }
                break;
            case 1:
                l4 l4Var2 = this.b;
                if (l4Var2.q0[0].f()) {
                    if (l4Var2.q0[0].getWebView() != null) {
                        l4Var2.q0[0].getWebView().findNext(true);
                        break;
                    }
                } else {
                    l4Var2.W(l4Var2.C + 1);
                    break;
                }
                break;
            case 2:
                l4 l4Var3 = this.b;
                n0 n0Var = l4Var3.d0;
                if (n0Var.P) {
                    n0Var.h(false);
                    break;
                } else if (n0Var.S) {
                    n0Var.k(false);
                    break;
                } else {
                    if (l4Var3.J()) {
                        p3 p3Var = l4Var3.q0[0];
                        if (p3Var.s) {
                            if (p3Var.f() && p3Var.getWebView() != null) {
                                p3Var.getWebView().goBack();
                                break;
                            }
                        }
                    }
                    if (l4Var3.Z.size() > 1) {
                        l4Var3.G();
                        break;
                    } else {
                        y3 y3Var = l4Var3.G;
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
                y3 y3Var2 = this.b.G;
                if (y3Var2 != null) {
                    y3Var2.dismiss(true);
                    break;
                }
                break;
            case 4:
                l4 l4Var4 = this.b;
                int intValue = ((Integer) view.getTag()).intValue();
                l4Var4.a = intValue;
                int i9 = 0;
                int i10 = 0;
                while (i10 < 2) {
                    ((RadioButton) l4Var4.O0[i10].b).a(i10 == intValue, true);
                    i10++;
                }
                t3 t3Var = l4.b1;
                int i11 = l4Var4.a;
                t3Var.getClass();
                ApplicationLoader.applicationContext.getSharedPreferences("articles", 0).edit().putInt("font_type", i11).commit();
                Typeface typeface = i11 == 0 ? Typeface.DEFAULT : Typeface.SERIF;
                Typeface typeface2 = i11 == 0 ? AndroidUtilities.getTypeface("fonts/ritalic.ttf") : Typeface.create("serif", 2);
                Typeface bold = i11 == 0 ? AndroidUtilities.bold() : Typeface.create("serif", 1);
                Typeface typeface3 = i11 == 0 ? AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM_ITALIC) : Typeface.create("serif", 3);
                for (int i12 = 0; i12 < t3Var.t.size(); i12++) {
                    t3.b(t3Var.t.keyAt(i12), (TextPaint) t3Var.t.valueAt(i12), typeface, typeface3, bold, typeface2);
                }
                for (int i13 = 0; i13 < t3Var.s.size(); i13++) {
                    t3.b(t3Var.s.keyAt(i13), (TextPaint) t3Var.s.valueAt(i13), typeface, typeface3, bold, typeface2);
                }
                for (int i14 = 0; i14 < t3Var.q.size(); i14++) {
                    t3.b(t3Var.q.keyAt(i14), (TextPaint) t3Var.q.valueAt(i14), typeface, typeface3, bold, typeface2);
                }
                for (int i15 = 0; i15 < t3Var.r.size(); i15++) {
                    t3.b(t3Var.r.keyAt(i15), (TextPaint) t3Var.r.valueAt(i15), typeface, typeface3, bold, typeface2);
                }
                for (int i16 = 0; i16 < t3Var.u.size(); i16++) {
                    t3.b(t3Var.u.keyAt(i16), (TextPaint) t3Var.u.valueAt(i16), typeface, typeface3, bold, typeface2);
                }
                for (int i17 = 0; i17 < t3Var.w.size(); i17++) {
                    t3.b(t3Var.w.keyAt(i17), (TextPaint) t3Var.w.valueAt(i17), typeface, typeface3, bold, typeface2);
                }
                for (int i18 = 0; i18 < t3Var.x.size(); i18++) {
                    t3.b(t3Var.x.keyAt(i18), (TextPaint) t3Var.x.valueAt(i18), typeface, typeface3, bold, typeface2);
                }
                for (int i19 = 0; i19 < t3Var.b.size(); i19++) {
                    t3.b(t3Var.b.keyAt(i19), (TextPaint) t3Var.b.valueAt(i19), typeface, typeface3, bold, typeface2);
                }
                for (int i20 = 0; i20 < t3Var.c.size(); i20++) {
                    t3.b(t3Var.c.keyAt(i20), (TextPaint) t3Var.c.valueAt(i20), typeface, typeface3, bold, typeface2);
                }
                for (int i21 = 0; i21 < t3Var.o.size(); i21++) {
                    t3.b(t3Var.o.keyAt(i21), (TextPaint) t3Var.o.valueAt(i21), typeface, typeface3, bold, typeface2);
                }
                for (int i22 = 0; i22 < t3Var.p.size(); i22++) {
                    t3.b(t3Var.p.keyAt(i22), (TextPaint) t3Var.p.valueAt(i22), typeface, typeface3, bold, typeface2);
                }
                for (int i23 = 0; i23 < t3Var.v.size(); i23++) {
                    t3.b(t3Var.v.keyAt(i23), (TextPaint) t3Var.v.valueAt(i23), typeface, typeface3, bold, typeface2);
                }
                for (int i24 = 0; i24 < t3Var.y.size(); i24++) {
                    t3.b(t3Var.y.keyAt(i24), (TextPaint) t3Var.y.valueAt(i24), typeface, typeface3, bold, typeface2);
                }
                for (int i25 = 0; i25 < t3Var.z.size(); i25++) {
                    t3.b(t3Var.z.keyAt(i25), (TextPaint) t3Var.z.valueAt(i25), typeface, typeface3, bold, typeface2);
                }
                for (int i26 = 0; i26 < t3Var.A.size(); i26++) {
                    t3.b(t3Var.A.keyAt(i26), (TextPaint) t3Var.A.valueAt(i26), typeface, typeface3, bold, typeface2);
                }
                while (true) {
                    p3[] p3VarArr = l4Var4.q0;
                    if (i9 >= p3VarArr.length) {
                        break;
                    } else {
                        p3VarArr[i9].c.l();
                        i9++;
                    }
                }
            default:
                l4 l4Var5 = this.b;
                e3 e3Var = l4Var5.d;
                if (e3Var != null) {
                    AndroidUtilities.addToClipboard(e3Var.d.getText());
                    if (AndroidUtilities.shouldShowClipboardToast()) {
                        Toast.makeText(l4Var5.H, LocaleController.getString(R.string.TextCopied), 0).show();
                    }
                }
                org.telegram.ui.ActionBar.o1 o1Var = l4Var5.D;
                if (o1Var != null && o1Var.isShowing()) {
                    l4Var5.D.d(true);
                    break;
                }
                break;
        }
    }
}
