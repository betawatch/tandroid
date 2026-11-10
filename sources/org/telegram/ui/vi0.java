package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vi0 implements org.telegram.ui.ActionBar.r1, ss, tj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ek0 b;

    public /* synthetic */ vi0(ek0 ek0Var, int i7) {
        this.a = i7;
        this.b = ek0Var;
    }

    @Override // org.telegram.ui.tj0
    public void a(String str, String str2) {
        this.b.B1();
    }

    @Override // org.telegram.ui.ss
    public void b(ps psVar) {
        switch (this.a) {
            case 2:
                ek0 ek0Var = this.b;
                ek0Var.Y[5].setText(psVar.a);
                ek0Var.s = psVar.d;
                break;
            default:
                ek0 ek0Var2 = this.b;
                ek0Var2.Y[0].setText(psVar.a);
                if (ek0Var2.U0.indexOf(psVar.a) != -1) {
                    ek0Var2.Z0 = true;
                    String str = (String) ek0Var2.V0.get(psVar.a);
                    ek0Var2.Y[1].setText(str);
                    String str2 = (String) ek0Var2.X0.get(str);
                    ek0Var2.Y[2].setHintText(str2 != null ? str2.replace('X', (char) 8211) : null);
                    ek0Var2.Z0 = false;
                }
                org.telegram.messenger.g0.i3(new si0(ek0Var2, 3), 300L);
                ek0Var2.Y[2].requestFocus();
                EditTextBoldCursor editTextBoldCursor = ek0Var2.Y[2];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
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
                vf.c.t(r3.getParentActivity(), "https://telegram.org/deactivate?phone=" + org.telegram.messenger.p10.i(this.b.currentAccount).d());
                break;
        }
    }
}
