package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class tl0 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ in0 b;

    public /* synthetic */ tl0(in0 in0Var, int i10) {
        this.a = i10;
        this.b = in0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10 = this.a;
        int i11 = 2;
        in0 in0Var = this.b;
        switch (i10) {
            case 0:
                if (in0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        xt xtVar = new xt(null, false);
                        xtVar.r = new w10(23, in0Var, view);
                        in0Var.presentFragment(xtVar);
                        break;
                    }
                }
                break;
            case 1:
                if (in0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(in0Var.getParentActivity());
                        String string = LocaleController.getString(R.string.PassportSelectGender);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                        b2Var.R = string;
                        alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.PassportMale), LocaleController.getString(R.string.PassportFemale)}, new rv(in0Var, i11));
                        alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
                        in0Var.showDialog(b2Var);
                        break;
                    }
                }
                break;
            case 2:
                if (in0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        xt xtVar2 = new xt(null, false);
                        xtVar2.r = new ul0(in0Var, i11);
                        in0Var.presentFragment(xtVar2);
                        break;
                    }
                }
                break;
            default:
                if (in0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        xt xtVar3 = new xt(null, false);
                        xtVar3.r = new ul0(in0Var, 3);
                        in0Var.presentFragment(xtVar3);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
