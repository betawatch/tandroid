package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class zj0 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ll0 b;

    public /* synthetic */ zj0(ll0 ll0Var, int i10) {
        this.a = i10;
        this.b = ll0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10 = this.a;
        int i11 = 2;
        int i12 = 3;
        ll0 ll0Var = this.b;
        switch (i10) {
            case 0:
                if (ll0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        rt rtVar = new rt(null, false);
                        rtVar.r = new rv(27, ll0Var, view);
                        ll0Var.presentFragment(rtVar);
                    }
                    break;
                }
                break;
            case 1:
                if (ll0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ll0Var.getParentActivity());
                        String L0 = org.telegram.messenger.cd.L0(2131747482, null);
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                        x1Var.R = L0;
                        alertDialog$Builder.f(new CharSequence[]{org.telegram.messenger.cd.L0(2131747524, null), org.telegram.messenger.cd.L0(2131747585, null)}, new l4(ll0Var, i12));
                        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131752589, null), null);
                        ll0Var.showDialog(x1Var);
                    }
                    break;
                }
                break;
            case 2:
                if (ll0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        rt rtVar2 = new rt(null, false);
                        rtVar2.r = new ak0(ll0Var, i11);
                        ll0Var.presentFragment(rtVar2);
                    }
                    break;
                }
                break;
            default:
                if (ll0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        rt rtVar3 = new rt(null, false);
                        rtVar3.r = new ak0(ll0Var, i12);
                        ll0Var.presentFragment(rtVar3);
                    }
                    break;
                }
                break;
        }
        return true;
    }
}
