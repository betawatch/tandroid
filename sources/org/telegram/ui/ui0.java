package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class ui0 implements org.telegram.ui.ActionBar.q1, ss, tj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ek0 b;

    public /* synthetic */ ui0(ek0 ek0Var, int i7) {
        this.a = i7;
        this.b = ek0Var;
    }

    @Override // org.telegram.ui.tj0
    public void d(String str, String str2) {
        this.b.B1();
    }

    @Override // org.telegram.ui.ss
    public void e(ps psVar) {
        switch (this.a) {
            case 2:
                ek0 ek0Var = this.b;
                ek0Var.Z[5].setText(psVar.a);
                ek0Var.s = psVar.d;
                break;
            default:
                ek0 ek0Var2 = this.b;
                ek0Var2.Z[0].setText(psVar.a);
                if (ek0Var2.V0.indexOf(psVar.a) != -1) {
                    ek0Var2.a1 = true;
                    String str = (String) ek0Var2.W0.get(psVar.a);
                    ek0Var2.Z[1].setText(str);
                    String str2 = (String) ek0Var2.Y0.get(str);
                    ek0Var2.Z[2].setHintText(str2 != null ? str2.replace('X', (char) 8211) : null);
                    ek0Var2.a1 = false;
                }
                org.telegram.messenger.g0.i3(new ri0(ek0Var2, 3), 300L);
                ek0Var2.Z[2].requestFocus();
                EditTextBoldCursor editTextBoldCursor = ek0Var2.Z[2];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 0:
                ek0 ek0Var = this.b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.b.getPackageName()));
                    ek0Var.getParentActivity().startActivity(intent);
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
                ek0.f0(this.b);
                break;
            case 4:
                vf.c.t(r3.getParentActivity(), "https://telegram.org/deactivate?phone=" + org.telegram.messenger.m10.i(this.b.currentAccount).d());
                break;
        }
    }
}
