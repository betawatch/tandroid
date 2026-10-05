package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wl0 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ kn0 b;

    public /* synthetic */ wl0(kn0 kn0Var, int i10) {
        this.a = i10;
        this.b = kn0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10 = this.a;
        int i11 = 2;
        kn0 kn0Var = this.b;
        switch (i10) {
            case 0:
                if (kn0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        zt ztVar = new zt(null, false);
                        ztVar.r = new pw(25, kn0Var, view);
                        kn0Var.presentFragment(ztVar);
                        break;
                    }
                }
                break;
            case 1:
                if (kn0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kn0Var.getParentActivity());
                        String string = LocaleController.getString(R.string.PassportSelectGender);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                        b2Var.R = string;
                        alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.PassportMale), LocaleController.getString(R.string.PassportFemale)}, new vv(kn0Var, i11));
                        alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
                        kn0Var.showDialog(b2Var);
                        break;
                    }
                }
                break;
            case 2:
                if (kn0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        zt ztVar2 = new zt(null, false);
                        ztVar2.r = new xl0(kn0Var, i11);
                        kn0Var.presentFragment(ztVar2);
                        break;
                    }
                }
                break;
            default:
                if (kn0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        zt ztVar3 = new zt(null, false);
                        ztVar3.r = new xl0(kn0Var, 3);
                        kn0Var.presentFragment(ztVar3);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
