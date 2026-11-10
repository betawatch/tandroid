package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ui0 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ek0 b;

    public /* synthetic */ ui0(ek0 ek0Var, int i7) {
        this.a = i7;
        this.b = ek0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i7 = this.a;
        int i10 = 2;
        int i11 = 3;
        ek0 ek0Var = this.b;
        switch (i7) {
            case 0:
                if (ek0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        ts tsVar = new ts(null, false);
                        tsVar.r = new su(28, ek0Var, view);
                        ek0Var.presentFragment(tsVar);
                    }
                    break;
                }
                break;
            case 1:
                if (ek0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ek0Var.getParentActivity());
                        String M0 = org.telegram.messenger.id.M0(2131747466, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                        u1Var.R = M0;
                        alertDialog$Builder.f(new CharSequence[]{org.telegram.messenger.id.M0(2131747508, null), org.telegram.messenger.id.M0(2131747569, null)}, new k4(ek0Var, i11));
                        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131752589, null), null);
                        ek0Var.showDialog(u1Var);
                    }
                    break;
                }
                break;
            case 2:
                if (ek0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        ts tsVar2 = new ts(null, false);
                        tsVar2.r = new vi0(ek0Var, i10);
                        ek0Var.presentFragment(tsVar2);
                    }
                    break;
                }
                break;
            default:
                if (ek0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        ts tsVar3 = new ts(null, false);
                        tsVar3.r = new vi0(ek0Var, i11);
                        ek0Var.presentFragment(tsVar3);
                    }
                    break;
                }
                break;
        }
        return true;
    }
}
