package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rl0 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ fn0 b;

    public /* synthetic */ rl0(fn0 fn0Var, int i10) {
        this.a = i10;
        this.b = fn0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10 = this.a;
        int i11 = 2;
        fn0 fn0Var = this.b;
        int i12 = 1;
        switch (i10) {
            case 0:
                if (fn0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        zt ztVar = new zt(null, false);
                        ztVar.r = new vl0(i12, fn0Var, view);
                        fn0Var.presentFragment(ztVar);
                        break;
                    }
                }
                break;
            case 1:
                if (fn0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fn0Var.getParentActivity());
                        String string = LocaleController.getString(R.string.PassportSelectGender);
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                        d2Var.O = string;
                        alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.PassportMale), LocaleController.getString(R.string.PassportFemale)}, new rv(fn0Var, i11));
                        alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
                        fn0Var.showDialog(d2Var);
                        break;
                    }
                }
                break;
            case 2:
                if (fn0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        zt ztVar2 = new zt(null, false);
                        ztVar2.r = new sl0(fn0Var, i11);
                        fn0Var.presentFragment(ztVar2);
                        break;
                    }
                }
                break;
            default:
                if (fn0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        zt ztVar3 = new zt(null, false);
                        ztVar3.r = new sl0(fn0Var, 3);
                        fn0Var.presentFragment(ztVar3);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
