package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ql0 implements org.telegram.ui.ActionBar.c2, xt, rm0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dn0 b;

    public /* synthetic */ ql0(dn0 dn0Var, int i10) {
        this.a = i10;
        this.b = dn0Var;
    }

    @Override // org.telegram.ui.rm0
    public void D(String str, String str2) {
        this.b.x1();
    }

    @Override // org.telegram.ui.xt
    public void b1(st stVar) {
        switch (this.a) {
            case 2:
                dn0 dn0Var = this.b;
                dn0Var.V[5].setText(stVar.a);
                dn0Var.s = stVar.d;
                break;
            default:
                dn0 dn0Var2 = this.b;
                dn0Var2.V[0].setText(stVar.a);
                if (dn0Var2.R0.indexOf(stVar.a) != -1) {
                    dn0Var2.W0 = true;
                    String str = (String) dn0Var2.S0.get(stVar.a);
                    dn0Var2.V[1].setText(str);
                    String str2 = (String) dn0Var2.U0.get(str);
                    dn0Var2.V[2].setHintText(str2 != null ? str2.replace('X', (char) 8211) : null);
                    dn0Var2.W0 = false;
                }
                AndroidUtilities.runOnUIThread(new nl0(dn0Var2, 3), 300L);
                dn0Var2.V[2].requestFocus();
                EditTextBoldCursor editTextBoldCursor = dn0Var2.V[2];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 0:
                dn0 dn0Var = this.b;
                dn0Var.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    dn0Var.getParentActivity().startActivity(intent);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                this.b.finishFragment();
                break;
            case 2:
            case 3:
            default:
                dn0.a0(this.b);
                break;
            case 4:
                af.g.s(r3.getParentActivity(), "https://telegram.org/deactivate?phone=" + UserConfig.getInstance(this.b.currentAccount).getClientPhone());
                break;
        }
    }
}
