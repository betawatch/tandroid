package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class xl0 implements org.telegram.ui.ActionBar.a2, yt, ym0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kn0 b;

    public /* synthetic */ xl0(kn0 kn0Var, int i10) {
        this.a = i10;
        this.b = kn0Var;
    }

    @Override // org.telegram.ui.yt
    public void b1(ut utVar) {
        switch (this.a) {
            case 2:
                kn0 kn0Var = this.b;
                kn0Var.Y[5].setText(utVar.a);
                kn0Var.s = utVar.d;
                break;
            default:
                kn0 kn0Var2 = this.b;
                kn0Var2.Y[0].setText(utVar.a);
                if (kn0Var2.U0.indexOf(utVar.a) != -1) {
                    kn0Var2.Z0 = true;
                    String str = (String) kn0Var2.V0.get(utVar.a);
                    kn0Var2.Y[1].setText(str);
                    String str2 = (String) kn0Var2.X0.get(str);
                    kn0Var2.Y[2].setHintText(str2 != null ? str2.replace('X', (char) 8211) : null);
                    kn0Var2.Z0 = false;
                }
                AndroidUtilities.runOnUIThread(new ul0(kn0Var2, 3), 300L);
                kn0Var2.Y[2].requestFocus();
                EditTextBoldCursor editTextBoldCursor = kn0Var2.Y[2];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                break;
        }
    }

    @Override // org.telegram.ui.ym0
    public void c(String str, String str2) {
        this.b.x1();
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                kn0 kn0Var = this.b;
                kn0Var.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    kn0Var.getParentActivity().startActivity(intent);
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 1:
                this.b.finishFragment();
                break;
            case 2:
            case 3:
            default:
                kn0.Z(this.b);
                break;
            case 4:
                nf.f.s(r3.getParentActivity(), "https://telegram.org/deactivate?phone=" + UserConfig.getInstance(this.b.currentAccount).getClientPhone());
                break;
        }
    }
}
