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

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l4 b;

    public /* synthetic */ s(l4 l4Var, int i10) {
        this.a = i10;
        this.b = l4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                l4 l4Var = this.b;
                if (l4Var.u0[0].f()) {
                    if (l4Var.u0[0].getWebView() != null) {
                        l4Var.u0[0].getWebView().findNext(false);
                        break;
                    }
                } else {
                    l4Var.W(l4Var.G - 1);
                    break;
                }
                break;
            case 1:
                l4 l4Var2 = this.b;
                if (l4Var2.u0[0].f()) {
                    if (l4Var2.u0[0].getWebView() != null) {
                        l4Var2.u0[0].getWebView().findNext(true);
                        break;
                    }
                } else {
                    l4Var2.W(l4Var2.G + 1);
                    break;
                }
                break;
            case 2:
                l4 l4Var3 = this.b;
                n0 n0Var = l4Var3.h0;
                if (n0Var.T) {
                    n0Var.h(false);
                    break;
                } else if (n0Var.W) {
                    n0Var.k(false);
                    break;
                } else {
                    if (l4Var3.J()) {
                        o3 o3Var = l4Var3.u0[0];
                        if (o3Var.s) {
                            if (o3Var.f() && o3Var.getWebView() != null) {
                                o3Var.getWebView().goBack();
                                break;
                            }
                        }
                    }
                    if (l4Var3.d0.size() > 1) {
                        l4Var3.G();
                        break;
                    } else {
                        x3 x3Var = l4Var3.K;
                        if (x3Var != null) {
                            x3Var.dismiss(false);
                            break;
                        } else {
                            l4Var3.o(true, true);
                            break;
                        }
                    }
                }
                break;
            case 3:
                x3 x3Var2 = this.b.K;
                if (x3Var2 != null) {
                    x3Var2.dismiss(true);
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
                    ((RadioButton) l4Var4.S0[i11].b).a(i11 == intValue, true);
                    i11++;
                }
                s3 s3Var = l4.f1;
                int i12 = l4Var4.a;
                s3Var.getClass();
                ApplicationLoader.applicationContext.getSharedPreferences("articles", 0).edit().putInt("font_type", i12).commit();
                Typeface typeface = i12 == 0 ? Typeface.DEFAULT : Typeface.SERIF;
                Typeface typeface2 = i12 == 0 ? AndroidUtilities.getTypeface("fonts/ritalic.ttf") : Typeface.create("serif", 2);
                Typeface bold = i12 == 0 ? AndroidUtilities.bold() : Typeface.create("serif", 1);
                Typeface typeface3 = i12 == 0 ? AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM_ITALIC) : Typeface.create("serif", 3);
                for (int i13 = 0; i13 < s3Var.t.size(); i13++) {
                    s3.b(s3Var.t.keyAt(i13), (TextPaint) s3Var.t.valueAt(i13), typeface, typeface3, bold, typeface2);
                }
                for (int i14 = 0; i14 < s3Var.s.size(); i14++) {
                    s3.b(s3Var.s.keyAt(i14), (TextPaint) s3Var.s.valueAt(i14), typeface, typeface3, bold, typeface2);
                }
                for (int i15 = 0; i15 < s3Var.q.size(); i15++) {
                    s3.b(s3Var.q.keyAt(i15), (TextPaint) s3Var.q.valueAt(i15), typeface, typeface3, bold, typeface2);
                }
                for (int i16 = 0; i16 < s3Var.r.size(); i16++) {
                    s3.b(s3Var.r.keyAt(i16), (TextPaint) s3Var.r.valueAt(i16), typeface, typeface3, bold, typeface2);
                }
                for (int i17 = 0; i17 < s3Var.u.size(); i17++) {
                    s3.b(s3Var.u.keyAt(i17), (TextPaint) s3Var.u.valueAt(i17), typeface, typeface3, bold, typeface2);
                }
                for (int i18 = 0; i18 < s3Var.w.size(); i18++) {
                    s3.b(s3Var.w.keyAt(i18), (TextPaint) s3Var.w.valueAt(i18), typeface, typeface3, bold, typeface2);
                }
                for (int i19 = 0; i19 < s3Var.x.size(); i19++) {
                    s3.b(s3Var.x.keyAt(i19), (TextPaint) s3Var.x.valueAt(i19), typeface, typeface3, bold, typeface2);
                }
                for (int i20 = 0; i20 < s3Var.b.size(); i20++) {
                    s3.b(s3Var.b.keyAt(i20), (TextPaint) s3Var.b.valueAt(i20), typeface, typeface3, bold, typeface2);
                }
                for (int i21 = 0; i21 < s3Var.c.size(); i21++) {
                    s3.b(s3Var.c.keyAt(i21), (TextPaint) s3Var.c.valueAt(i21), typeface, typeface3, bold, typeface2);
                }
                for (int i22 = 0; i22 < s3Var.o.size(); i22++) {
                    s3.b(s3Var.o.keyAt(i22), (TextPaint) s3Var.o.valueAt(i22), typeface, typeface3, bold, typeface2);
                }
                for (int i23 = 0; i23 < s3Var.p.size(); i23++) {
                    s3.b(s3Var.p.keyAt(i23), (TextPaint) s3Var.p.valueAt(i23), typeface, typeface3, bold, typeface2);
                }
                for (int i24 = 0; i24 < s3Var.v.size(); i24++) {
                    s3.b(s3Var.v.keyAt(i24), (TextPaint) s3Var.v.valueAt(i24), typeface, typeface3, bold, typeface2);
                }
                for (int i25 = 0; i25 < s3Var.y.size(); i25++) {
                    s3.b(s3Var.y.keyAt(i25), (TextPaint) s3Var.y.valueAt(i25), typeface, typeface3, bold, typeface2);
                }
                for (int i26 = 0; i26 < s3Var.z.size(); i26++) {
                    s3.b(s3Var.z.keyAt(i26), (TextPaint) s3Var.z.valueAt(i26), typeface, typeface3, bold, typeface2);
                }
                for (int i27 = 0; i27 < s3Var.A.size(); i27++) {
                    s3.b(s3Var.A.keyAt(i27), (TextPaint) s3Var.A.valueAt(i27), typeface, typeface3, bold, typeface2);
                }
                while (true) {
                    o3[] o3VarArr = l4Var4.u0;
                    if (i10 >= o3VarArr.length) {
                        break;
                    } else {
                        o3VarArr[i10].c.l();
                        i10++;
                    }
                }
            default:
                l4 l4Var5 = this.b;
                d3 d3Var = l4Var5.d;
                if (d3Var != null) {
                    AndroidUtilities.addToClipboard(d3Var.d.getText());
                    if (AndroidUtilities.shouldShowClipboardToast()) {
                        Toast.makeText(l4Var5.L, LocaleController.getString(R.string.TextCopied), 0).show();
                    }
                }
                org.telegram.ui.ActionBar.m1 m1Var = l4Var5.H;
                if (m1Var != null && m1Var.isShowing()) {
                    l4Var5.H.d(true);
                    break;
                }
                break;
        }
    }
}
