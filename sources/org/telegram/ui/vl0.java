package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vl0 implements org.telegram.ui.ActionBar.b2, nt, wm0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ in0 b;

    public /* synthetic */ vl0(in0 in0Var, int i10) {
        this.a = i10;
        this.b = in0Var;
    }

    @Override // org.telegram.ui.nt
    public void Y0(jt jtVar) {
        switch (this.a) {
            case 2:
                in0 in0Var = this.b;
                in0Var.Y[5].setText(jtVar.a);
                in0Var.s = jtVar.d;
                break;
            default:
                in0 in0Var2 = this.b;
                in0Var2.Y[0].setText(jtVar.a);
                if (in0Var2.U0.indexOf(jtVar.a) != -1) {
                    in0Var2.Z0 = true;
                    String str = (String) in0Var2.V0.get(jtVar.a);
                    in0Var2.Y[1].setText(str);
                    String str2 = (String) in0Var2.X0.get(str);
                    in0Var2.Y[2].setHintText(str2 != null ? str2.replace('X', (char) 8211) : null);
                    in0Var2.Z0 = false;
                }
                AndroidUtilities.runOnUIThread(new sl0(in0Var2, 3), 300L);
                in0Var2.Y[2].requestFocus();
                EditTextBoldCursor editTextBoldCursor = in0Var2.Y[2];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                break;
        }
    }

    @Override // org.telegram.ui.wm0
    public void d(String str, String str2) {
        this.b.x1();
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.a) {
            case 0:
                in0 in0Var = this.b;
                in0Var.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    in0Var.getParentActivity().startActivity(intent);
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
                in0.b0(this.b);
                break;
            case 4:
                qf.d.r(r3.getParentActivity(), "https://telegram.org/deactivate?phone=" + UserConfig.getInstance(this.b.currentAccount).getClientPhone());
                break;
        }
    }
}
