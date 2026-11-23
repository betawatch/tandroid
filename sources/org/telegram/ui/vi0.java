package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class vi0 implements org.telegram.ui.ActionBar.q1, ss, uj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fk0 b;

    public /* synthetic */ vi0(fk0 fk0Var, int i7) {
        this.a = i7;
        this.b = fk0Var;
    }

    @Override // org.telegram.ui.ss
    public void d(ps psVar) {
        switch (this.a) {
            case 2:
                fk0 fk0Var = this.b;
                fk0Var.Z[5].setText(psVar.a);
                fk0Var.s = psVar.d;
                break;
            default:
                fk0 fk0Var2 = this.b;
                fk0Var2.Z[0].setText(psVar.a);
                if (fk0Var2.V0.indexOf(psVar.a) != -1) {
                    fk0Var2.a1 = true;
                    String str = (String) fk0Var2.W0.get(psVar.a);
                    fk0Var2.Z[1].setText(str);
                    String str2 = (String) fk0Var2.Y0.get(str);
                    fk0Var2.Z[2].setHintText(str2 != null ? str2.replace('X', (char) 8211) : null);
                    fk0Var2.a1 = false;
                }
                org.telegram.messenger.g0.h3(new si0(fk0Var2, 3), 300L);
                fk0Var2.Z[2].requestFocus();
                EditTextBoldCursor editTextBoldCursor = fk0Var2.Z[2];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                break;
        }
    }

    @Override // org.telegram.ui.uj0
    public void f(String str, String str2) {
        this.b.B1();
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 0:
                fk0 fk0Var = this.b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.b.getPackageName()));
                    fk0Var.getParentActivity().startActivity(intent);
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
                fk0.f0(this.b);
                break;
            case 4:
                vf.c.t(r3.getParentActivity(), "https://telegram.org/deactivate?phone=" + org.telegram.messenger.i10.i(this.b.currentAccount).d());
                break;
        }
    }
}
