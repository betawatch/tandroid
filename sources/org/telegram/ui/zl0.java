package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zl0 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ on0 b;

    public /* synthetic */ zl0(on0 on0Var, int i10) {
        this.a = i10;
        this.b = on0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10 = this.a;
        int i11 = 2;
        on0 on0Var = this.b;
        switch (i10) {
            case 0:
                if (on0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        au auVar = new au(null, false);
                        auVar.r = new d20(22, on0Var, view);
                        on0Var.presentFragment(auVar);
                        break;
                    }
                }
                break;
            case 1:
                if (on0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(on0Var.getParentActivity());
                        String string = LocaleController.getString(R.string.PassportSelectGender);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                        b2Var.R = string;
                        alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.PassportMale), LocaleController.getString(R.string.PassportFemale)}, new uv(on0Var, i11));
                        alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
                        on0Var.showDialog(b2Var);
                        break;
                    }
                }
                break;
            case 2:
                if (on0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        au auVar2 = new au(null, false);
                        auVar2.r = new am0(on0Var, i11);
                        on0Var.presentFragment(auVar2);
                        break;
                    }
                }
                break;
            default:
                if (on0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        au auVar3 = new au(null, false);
                        auVar3.r = new am0(on0Var, 3);
                        on0Var.presentFragment(auVar3);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
