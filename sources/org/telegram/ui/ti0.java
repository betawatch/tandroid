package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ti0 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ dk0 b;

    public /* synthetic */ ti0(dk0 dk0Var, int i7) {
        this.a = i7;
        this.b = dk0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i7 = this.a;
        int i10 = 2;
        int i11 = 3;
        dk0 dk0Var = this.b;
        switch (i7) {
            case 0:
                if (dk0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        ss ssVar = new ss(null, false);
                        ssVar.r = new ru(28, dk0Var, view);
                        dk0Var.presentFragment(ssVar);
                    }
                    break;
                }
                break;
            case 1:
                if (dk0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dk0Var.getParentActivity());
                        String M0 = org.telegram.messenger.id.M0(2131747466, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                        u1Var.R = M0;
                        alertDialog$Builder.f(new CharSequence[]{org.telegram.messenger.id.M0(2131747508, null), org.telegram.messenger.id.M0(2131747569, null)}, new k4(dk0Var, i11));
                        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131752589, null), null);
                        dk0Var.showDialog(u1Var);
                    }
                    break;
                }
                break;
            case 2:
                if (dk0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        ss ssVar2 = new ss(null, false);
                        ssVar2.r = new ui0(dk0Var, i10);
                        dk0Var.presentFragment(ssVar2);
                    }
                    break;
                }
                break;
            default:
                if (dk0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        ss ssVar3 = new ss(null, false);
                        ssVar3.r = new ui0(dk0Var, i11);
                        dk0Var.presentFragment(ssVar3);
                    }
                    break;
                }
                break;
        }
        return true;
    }
}
