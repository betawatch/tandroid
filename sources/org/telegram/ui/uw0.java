package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uw0 implements org.telegram.ui.ActionBar.b2, Utilities.Callback5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vw0 b;

    public /* synthetic */ uw0(vw0 vw0Var, int i10) {
        this.a = i10;
        this.b = vw0Var;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.Y();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        vw0 vw0Var = this.b;
        vw0Var.getClass();
        if (((org.telegram.ui.Components.j51) obj).d == 1) {
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
            boolean z10 = !w8Var.e.h;
            vw0Var.r = z10;
            w8Var.setChecked(z10);
            vw0Var.d.Y2.N(true);
            vw0Var.V(true);
        }
    }
}
