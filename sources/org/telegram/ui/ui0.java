package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ui0 implements org.telegram.ui.ActionBar.r1, rs, sj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dk0 b;

    public /* synthetic */ ui0(dk0 dk0Var, int i7) {
        this.a = i7;
        this.b = dk0Var;
    }

    @Override // org.telegram.ui.sj0
    public void a(String str, String str2) {
        this.b.B1();
    }

    @Override // org.telegram.ui.rs
    public void b(os osVar) {
        switch (this.a) {
            case 2:
                dk0 dk0Var = this.b;
                dk0Var.Y[5].setText(osVar.a);
                dk0Var.s = osVar.d;
                break;
            default:
                dk0 dk0Var2 = this.b;
                dk0Var2.Y[0].setText(osVar.a);
                if (dk0Var2.U0.indexOf(osVar.a) != -1) {
                    dk0Var2.Z0 = true;
                    String str = (String) dk0Var2.V0.get(osVar.a);
                    dk0Var2.Y[1].setText(str);
                    String str2 = (String) dk0Var2.X0.get(str);
                    dk0Var2.Y[2].setHintText(str2 != null ? str2.replace('X', (char) 8211) : null);
                    dk0Var2.Z0 = false;
                }
                org.telegram.messenger.g0.i3(new ri0(dk0Var2, 3), 300L);
                dk0Var2.Y[2].requestFocus();
                EditTextBoldCursor editTextBoldCursor = dk0Var2.Y[2];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 0:
                dk0 dk0Var = this.b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.b.getPackageName()));
                    dk0Var.getParentActivity().startActivity(intent);
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 1:
                this.b.finishFragment();
                break;
            case 2:
            case 3:
            default:
                dk0.f0(this.b);
                break;
            case 4:
                vf.c.t(r3.getParentActivity(), "https://telegram.org/deactivate?phone=" + org.telegram.messenger.p10.i(this.b.currentAccount).d());
                break;
        }
    }
}
