package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tl0 implements org.telegram.ui.ActionBar.z1, vt, um0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gn0 b;

    public /* synthetic */ tl0(gn0 gn0Var, int i10) {
        this.a = i10;
        this.b = gn0Var;
    }

    @Override // org.telegram.ui.vt
    public void a1(qt qtVar) {
        switch (this.a) {
            case 2:
                gn0 gn0Var = this.b;
                gn0Var.Y[5].setText(qtVar.a);
                gn0Var.s = qtVar.d;
                break;
            default:
                gn0 gn0Var2 = this.b;
                gn0Var2.Y[0].setText(qtVar.a);
                if (gn0Var2.U0.indexOf(qtVar.a) != -1) {
                    gn0Var2.Z0 = true;
                    String str = (String) gn0Var2.V0.get(qtVar.a);
                    gn0Var2.Y[1].setText(str);
                    String str2 = (String) gn0Var2.X0.get(str);
                    gn0Var2.Y[2].setHintText(str2 != null ? str2.replace('X', (char) 8211) : null);
                    gn0Var2.Z0 = false;
                }
                AndroidUtilities.runOnUIThread(new ql0(gn0Var2, 3), 300L);
                gn0Var2.Y[2].requestFocus();
                EditTextBoldCursor editTextBoldCursor = gn0Var2.Y[2];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                break;
        }
    }

    @Override // org.telegram.ui.um0
    public void c(String str, String str2) {
        this.b.x1();
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.a) {
            case 0:
                gn0 gn0Var = this.b;
                gn0Var.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    gn0Var.getParentActivity().startActivity(intent);
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
                gn0.a0(this.b);
                break;
            case 4:
                nf.f.s(r3.getParentActivity(), "https://telegram.org/deactivate?phone=" + UserConfig.getInstance(this.b.currentAccount).getClientPhone());
                break;
        }
    }
}
