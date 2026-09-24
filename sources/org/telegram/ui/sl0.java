package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sl0 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ gn0 b;

    public /* synthetic */ sl0(gn0 gn0Var, int i10) {
        this.a = i10;
        this.b = gn0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10 = this.a;
        int i11 = 2;
        gn0 gn0Var = this.b;
        switch (i10) {
            case 0:
                if (gn0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        wt wtVar = new wt(null, false);
                        wtVar.r = new ow(24, gn0Var, view);
                        gn0Var.presentFragment(wtVar);
                        break;
                    }
                }
                break;
            case 1:
                if (gn0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gn0Var.getParentActivity());
                        String string = LocaleController.getString(R.string.PassportSelectGender);
                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
                        a2Var.R = string;
                        alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.PassportMale), LocaleController.getString(R.string.PassportFemale)}, new qv(gn0Var, i11));
                        alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
                        gn0Var.showDialog(a2Var);
                        break;
                    }
                }
                break;
            case 2:
                if (gn0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        wt wtVar2 = new wt(null, false);
                        wtVar2.r = new tl0(gn0Var, i11);
                        gn0Var.presentFragment(wtVar2);
                        break;
                    }
                }
                break;
            default:
                if (gn0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        wt wtVar3 = new wt(null, false);
                        wtVar3.r = new tl0(gn0Var, 3);
                        gn0Var.presentFragment(wtVar3);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
