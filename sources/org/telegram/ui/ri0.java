package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ri0 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ bk0 b;

    public /* synthetic */ ri0(bk0 bk0Var, int i7) {
        this.a = i7;
        this.b = bk0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i7 = this.a;
        int i10 = 2;
        int i11 = 3;
        bk0 bk0Var = this.b;
        switch (i7) {
            case 0:
                if (bk0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        qs qsVar = new qs(null, false);
                        qsVar.r = new pu(28, bk0Var, view);
                        bk0Var.presentFragment(qsVar);
                    }
                    break;
                }
                break;
            case 1:
                if (bk0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bk0Var.getParentActivity());
                        String M0 = org.telegram.messenger.id.M0(2131747467, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                        u1Var.R = M0;
                        alertDialog$Builder.f(new CharSequence[]{org.telegram.messenger.id.M0(2131747509, null), org.telegram.messenger.id.M0(2131747570, null)}, new k4(bk0Var, i11));
                        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131752589, null), null);
                        bk0Var.showDialog(u1Var);
                    }
                    break;
                }
                break;
            case 2:
                if (bk0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        qs qsVar2 = new qs(null, false);
                        qsVar2.r = new si0(bk0Var, i10);
                        bk0Var.presentFragment(qsVar2);
                    }
                    break;
                }
                break;
            default:
                if (bk0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        qs qsVar3 = new qs(null, false);
                        qsVar3.r = new si0(bk0Var, i11);
                        bk0Var.presentFragment(qsVar3);
                    }
                    break;
                }
                break;
        }
        return true;
    }
}
