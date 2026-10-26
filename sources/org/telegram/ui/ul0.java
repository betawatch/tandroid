package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ul0 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ in0 b;

    public /* synthetic */ ul0(in0 in0Var, int i10) {
        this.a = i10;
        this.b = in0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10 = this.a;
        int i11 = 2;
        int i12 = 3;
        in0 in0Var = this.b;
        switch (i10) {
            case 0:
                if (in0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        ot otVar = new ot(null, false);
                        otVar.r = new af0(4, in0Var, view);
                        in0Var.presentFragment(otVar);
                    }
                    break;
                }
                break;
            case 1:
                if (in0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(in0Var.getParentActivity());
                        String string = LocaleController.getString(R.string.PassportSelectGender);
                        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                        e2Var.R = string;
                        alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.PassportMale), LocaleController.getString(R.string.PassportFemale)}, new n4(in0Var, i12));
                        alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
                        in0Var.showDialog(e2Var);
                    }
                    break;
                }
                break;
            case 2:
                if (in0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        ot otVar2 = new ot(null, false);
                        otVar2.r = new vl0(in0Var, i11);
                        in0Var.presentFragment(otVar2);
                    }
                    break;
                }
                break;
            default:
                if (in0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        ot otVar3 = new ot(null, false);
                        otVar3.r = new vl0(in0Var, i12);
                        in0Var.presentFragment(otVar3);
                    }
                    break;
                }
                break;
        }
        return true;
    }
}
