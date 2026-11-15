package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class ti0 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ek0 b;

    public /* synthetic */ ti0(ek0 ek0Var, int i7) {
        this.a = i7;
        this.b = ek0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i7 = this.a;
        int i10 = 3;
        int i11 = 2;
        ek0 ek0Var = this.b;
        switch (i7) {
            case 0:
                if (ek0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        ts tsVar = new ts(null, false);
                        tsVar.r = new xi0(i11, ek0Var, view);
                        ek0Var.presentFragment(tsVar);
                    }
                    break;
                }
                break;
            case 1:
                if (ek0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ek0Var.getParentActivity());
                        String M0 = org.telegram.messenger.hd.M0(2131747466, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                        t1Var.S = M0;
                        alertDialog$Builder.f(new CharSequence[]{org.telegram.messenger.hd.M0(2131747508, null), org.telegram.messenger.hd.M0(2131747569, null)}, new k4(ek0Var, i10));
                        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752589, null), null);
                        ek0Var.showDialog(t1Var);
                    }
                    break;
                }
                break;
            case 2:
                if (ek0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        ts tsVar2 = new ts(null, false);
                        tsVar2.r = new ui0(ek0Var, i11);
                        ek0Var.presentFragment(tsVar2);
                    }
                    break;
                }
                break;
            default:
                if (ek0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        ts tsVar3 = new ts(null, false);
                        tsVar3.r = new ui0(ek0Var, i10);
                        ek0Var.presentFragment(tsVar3);
                    }
                    break;
                }
                break;
        }
        return true;
    }
}
