package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
        int i12 = 3;
        kn0 kn0Var = this.b;
        switch (i10) {
            case 0:
                if (kn0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        qt qtVar = new qt(null, false);
                        qtVar.r = new cf0(4, kn0Var, view);
                        kn0Var.presentFragment(qtVar);
                    }
                    break;
                }
                break;
            case 1:
                if (kn0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kn0Var.getParentActivity());
                        String string = LocaleController.getString(R.string.PassportSelectGender);
                        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                        e2Var.R = string;
                        alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.PassportMale), LocaleController.getString(R.string.PassportFemale)}, new n4(kn0Var, i12));
                        alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
                        kn0Var.showDialog(e2Var);
                    }
                    break;
                }
                break;
            case 2:
                if (kn0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        qt qtVar2 = new qt(null, false);
                        qtVar2.r = new xl0(kn0Var, i11);
                        kn0Var.presentFragment(qtVar2);
                    }
                    break;
                }
                break;
            default:
                if (kn0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        qt qtVar3 = new qt(null, false);
                        qtVar3.r = new xl0(kn0Var, i12);
                        kn0Var.presentFragment(qtVar3);
                    }
                    break;
                }
                break;
        }
        return true;
    }
}
