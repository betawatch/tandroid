package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
                        us usVar = new us(null, false);
                        usVar.r = new aj0(i12, hk0Var, view);
                        hk0Var.presentFragment(usVar);
                    }
                    break;
                }
                break;
            case 1:
                if (hk0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hk0Var.getParentActivity());
                        String N0 = org.telegram.messenger.gd.N0(2131747272, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                        t1Var.S = N0;
                        alertDialog$Builder.f(new CharSequence[]{org.telegram.messenger.gd.N0(2131747314, null), org.telegram.messenger.gd.N0(2131747375, null)}, new k4(hk0Var, i11));
                        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131752577, null), null);
                        hk0Var.showDialog(t1Var);
                    }
                    break;
                }
                break;
            case 2:
                if (hk0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        us usVar2 = new us(null, false);
                        usVar2.r = new xi0(hk0Var, i10);
                        hk0Var.presentFragment(usVar2);
                    }
                    break;
                }
                break;
            default:
                if (hk0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        us usVar3 = new us(null, false);
                        usVar3.r = new xi0(hk0Var, i11);
                        hk0Var.presentFragment(usVar3);
                    }
                    break;
                }
                break;
        }
        return true;
    }
}
