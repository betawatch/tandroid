package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xj0 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ jl0 b;

    public /* synthetic */ xj0(jl0 jl0Var, int i10) {
        this.a = i10;
        this.b = jl0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10 = this.a;
        int i11 = 2;
        int i12 = 3;
        jl0 jl0Var = this.b;
        switch (i10) {
            case 0:
                if (jl0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        qt qtVar = new qt(null, false);
                        qtVar.r = new qv(27, jl0Var, view);
                        jl0Var.presentFragment(qtVar);
                    }
                    break;
                }
                break;
            case 1:
                if (jl0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(jl0Var.getParentActivity());
                        String L0 = org.telegram.messenger.dd.L0(2131747482, null);
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                        x1Var.R = L0;
                        alertDialog$Builder.f(new CharSequence[]{org.telegram.messenger.dd.L0(2131747524, null), org.telegram.messenger.dd.L0(2131747585, null)}, new l4(jl0Var, i12));
                        alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131752589, null), null);
                        jl0Var.showDialog(x1Var);
                    }
                    break;
                }
                break;
            case 2:
                if (jl0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        qt qtVar2 = new qt(null, false);
                        qtVar2.r = new yj0(jl0Var, i11);
                        jl0Var.presentFragment(qtVar2);
                    }
                    break;
                }
                break;
            default:
                if (jl0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        qt qtVar3 = new qt(null, false);
                        qtVar3.r = new yj0(jl0Var, i12);
                        jl0Var.presentFragment(qtVar3);
                    }
                    break;
                }
                break;
        }
        return true;
    }
}
