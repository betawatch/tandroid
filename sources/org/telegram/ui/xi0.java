package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xi0 implements org.telegram.ui.ActionBar.q1, ts, wj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hk0 b;

    public /* synthetic */ xi0(hk0 hk0Var, int i7) {
        this.a = i7;
        this.b = hk0Var;
    }

    @Override // org.telegram.ui.ts
    public void b(ps psVar) {
        switch (this.a) {
            case 2:
                hk0 hk0Var = this.b;
                hk0Var.Z[5].setText(psVar.a);
                hk0Var.s = psVar.d;
                break;
            default:
                hk0 hk0Var2 = this.b;
                hk0Var2.Z[0].setText(psVar.a);
                if (hk0Var2.V0.indexOf(psVar.a) != -1) {
                    hk0Var2.a1 = true;
                    String str = (String) hk0Var2.W0.get(psVar.a);
                    hk0Var2.Z[1].setText(str);
                    String str2 = (String) hk0Var2.Y0.get(str);
                    hk0Var2.Z[2].setHintText(str2 != null ? str2.replace('X', (char) 8211) : null);
                    hk0Var2.a1 = false;
                }
                org.telegram.messenger.g0.h3(new ui0(hk0Var2, 3), 300L);
                hk0Var2.Z[2].requestFocus();
                EditTextBoldCursor editTextBoldCursor = hk0Var2.Z[2];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                break;
        }
    }

    @Override // org.telegram.ui.wj0
    public void d(String str, String str2) {
        this.b.B1();
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 0:
                hk0 hk0Var = this.b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.b.getPackageName()));
                    hk0Var.getParentActivity().startActivity(intent);
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
                hk0.f0(this.b);
                break;
            case 4:
                vf.c.t(r3.getParentActivity(), "https://telegram.org/deactivate?phone=" + org.telegram.messenger.j10.i(this.b.currentAccount).d());
                break;
        }
    }
}
