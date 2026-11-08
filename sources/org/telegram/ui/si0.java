package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class si0 implements org.telegram.ui.ActionBar.r1, ps, qj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bk0 b;

    public /* synthetic */ si0(bk0 bk0Var, int i7) {
        this.a = i7;
        this.b = bk0Var;
    }

    @Override // org.telegram.ui.qj0
    public void a(String str, String str2) {
        this.b.B1();
    }

    @Override // org.telegram.ui.ps
    public void b(ms msVar) {
        switch (this.a) {
            case 2:
                bk0 bk0Var = this.b;
                bk0Var.Y[5].setText(msVar.a);
                bk0Var.s = msVar.d;
                break;
            default:
                bk0 bk0Var2 = this.b;
                bk0Var2.Y[0].setText(msVar.a);
                if (bk0Var2.U0.indexOf(msVar.a) != -1) {
                    bk0Var2.Z0 = true;
                    String str = (String) bk0Var2.V0.get(msVar.a);
                    bk0Var2.Y[1].setText(str);
                    String str2 = (String) bk0Var2.X0.get(str);
                    bk0Var2.Y[2].setHintText(str2 != null ? str2.replace('X', (char) 8211) : null);
                    bk0Var2.Z0 = false;
                }
                org.telegram.messenger.g0.i3(new pi0(bk0Var2, 3), 300L);
                bk0Var2.Y[2].requestFocus();
                EditTextBoldCursor editTextBoldCursor = bk0Var2.Y[2];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 0:
                bk0 bk0Var = this.b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.b.getPackageName()));
                    bk0Var.getParentActivity().startActivity(intent);
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
                bk0.f0(this.b);
                break;
            case 4:
                vf.c.t(r3.getParentActivity(), "https://telegram.org/deactivate?phone=" + org.telegram.messenger.p10.i(this.b.currentAccount).d());
                break;
        }
    }
}
