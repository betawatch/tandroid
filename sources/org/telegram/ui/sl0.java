package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sl0 implements org.telegram.ui.ActionBar.c2, yt, tm0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fn0 b;

    public /* synthetic */ sl0(fn0 fn0Var, int i10) {
        this.a = i10;
        this.b = fn0Var;
    }

    @Override // org.telegram.ui.tm0
    public void C(String str, String str2) {
        this.b.x1();
    }

    @Override // org.telegram.ui.yt
    public void V0(tt ttVar) {
        switch (this.a) {
            case 2:
                fn0 fn0Var = this.b;
                fn0Var.V[5].setText(ttVar.a);
                fn0Var.s = ttVar.d;
                break;
            default:
                fn0 fn0Var2 = this.b;
                fn0Var2.V[0].setText(ttVar.a);
                if (fn0Var2.R0.indexOf(ttVar.a) != -1) {
                    fn0Var2.W0 = true;
                    String str = (String) fn0Var2.S0.get(ttVar.a);
                    fn0Var2.V[1].setText(str);
                    String str2 = (String) fn0Var2.U0.get(str);
                    fn0Var2.V[2].setHintText(str2 != null ? str2.replace('X', (char) 8211) : null);
                    fn0Var2.W0 = false;
                }
                AndroidUtilities.runOnUIThread(new pl0(fn0Var2, 3), 300L);
                fn0Var2.V[2].requestFocus();
                EditTextBoldCursor editTextBoldCursor = fn0Var2.V[2];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 0:
                fn0 fn0Var = this.b;
                fn0Var.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    fn0Var.getParentActivity().startActivity(intent);
                    break;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
            case 1:
                this.b.finishFragment();
                break;
            case 2:
            case 3:
            default:
                fn0.a0(this.b);
                break;
            case 4:
                af.g.s(r3.getParentActivity(), "https://telegram.org/deactivate?phone=" + UserConfig.getInstance(this.b.currentAccount).getClientPhone());
                break;
        }
    }
}
