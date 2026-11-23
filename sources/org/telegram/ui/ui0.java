package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ui0 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ fk0 b;

    public /* synthetic */ ui0(fk0 fk0Var, int i7) {
        this.a = i7;
        this.b = fk0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i7 = this.a;
        int i10 = 2;
        int i11 = 3;
        fk0 fk0Var = this.b;
        int i12 = 1;
        switch (i7) {
            case 0:
                if (fk0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        ts tsVar = new ts(null, false);
                        tsVar.r = new yi0(i12, fk0Var, view);
                        fk0Var.presentFragment(tsVar);
                    }
                    break;
                }
                break;
            case 1:
                if (fk0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fk0Var.getParentActivity());
                        String N0 = org.telegram.messenger.gd.N0(2131747272, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                        t1Var.S = N0;
                        alertDialog$Builder.f(new CharSequence[]{org.telegram.messenger.gd.N0(2131747314, null), org.telegram.messenger.gd.N0(2131747375, null)}, new k4(fk0Var, i11));
                        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131752577, null), null);
                        fk0Var.showDialog(t1Var);
                    }
                    break;
                }
                break;
            case 2:
                if (fk0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        ts tsVar2 = new ts(null, false);
                        tsVar2.r = new vi0(fk0Var, i10);
                        fk0Var.presentFragment(tsVar2);
                    }
                    break;
                }
                break;
            default:
                if (fk0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        ts tsVar3 = new ts(null, false);
                        tsVar3.r = new vi0(fk0Var, i11);
                        fk0Var.presentFragment(tsVar3);
                    }
                    break;
                }
                break;
        }
        return true;
    }
}
