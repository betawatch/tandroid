package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class wi0 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ hk0 b;

    public /* synthetic */ wi0(hk0 hk0Var, int i7) {
        this.a = i7;
        this.b = hk0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i7 = this.a;
        int i10 = 2;
        int i11 = 3;
        hk0 hk0Var = this.b;
        int i12 = 1;
        switch (i7) {
            case 0:
                if (hk0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        ts tsVar = new ts(null, false);
                        tsVar.r = new aj0(i12, hk0Var, view);
                        hk0Var.presentFragment(tsVar);
                    }
                    break;
                }
                break;
            case 1:
                if (hk0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hk0Var.getParentActivity());
                        String M0 = org.telegram.messenger.gd.M0(2131747273, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                        u1Var.S = M0;
                        alertDialog$Builder.f(new CharSequence[]{org.telegram.messenger.gd.M0(2131747315, null), org.telegram.messenger.gd.M0(2131747376, null)}, new k4(hk0Var, i11));
                        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131752578, null), null);
                        hk0Var.showDialog(u1Var);
                    }
                    break;
                }
                break;
            case 2:
                if (hk0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        ts tsVar2 = new ts(null, false);
                        tsVar2.r = new xi0(hk0Var, i10);
                        hk0Var.presentFragment(tsVar2);
                    }
                    break;
                }
                break;
            default:
                if (hk0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        ts tsVar3 = new ts(null, false);
                        tsVar3.r = new xi0(hk0Var, i11);
                        hk0Var.presentFragment(tsVar3);
                    }
                    break;
                }
                break;
        }
        return true;
    }
}
