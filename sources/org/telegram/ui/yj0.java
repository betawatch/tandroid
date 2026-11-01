package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yj0 implements org.telegram.ui.ActionBar.u1, pt, xk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jl0 b;

    public /* synthetic */ yj0(jl0 jl0Var, int i10) {
        this.a = i10;
        this.b = jl0Var;
    }

    @Override // org.telegram.ui.pt
    public void c(mt mtVar) {
        switch (this.a) {
            case 2:
                jl0 jl0Var = this.b;
                jl0Var.Y[5].setText(mtVar.a);
                jl0Var.s = mtVar.d;
                break;
            default:
                jl0 jl0Var2 = this.b;
                jl0Var2.Y[0].setText(mtVar.a);
                if (jl0Var2.U0.indexOf(mtVar.a) != -1) {
                    jl0Var2.Z0 = true;
                    String str = (String) jl0Var2.V0.get(mtVar.a);
                    jl0Var2.Y[1].setText(str);
                    String str2 = (String) jl0Var2.X0.get(str);
                    jl0Var2.Y[2].setHintText(str2 != null ? str2.replace('X', (char) 8211) : null);
                    jl0Var2.Z0 = false;
                }
                org.telegram.messenger.i0.h3(new vj0(jl0Var2, 3), 300L);
                jl0Var2.Y[2].requestFocus();
                EditTextBoldCursor editTextBoldCursor = jl0Var2.Y[2];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                break;
        }
    }

    @Override // org.telegram.ui.xk0
    public void d(String str, String str2) {
        this.b.B1();
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.a) {
            case 0:
                jl0 jl0Var = this.b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.w0.b.getPackageName()));
                    jl0Var.getParentActivity().startActivity(intent);
                    break;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
            case 1:
                this.b.finishFragment();
                break;
            case 2:
            case 3:
            default:
                jl0.f0(this.b);
                break;
            case 4:
                gf.f.r(r3.getParentActivity(), "https://telegram.org/deactivate?phone=" + org.telegram.messenger.e20.i(this.b.currentAccount).d());
                break;
        }
    }
}
