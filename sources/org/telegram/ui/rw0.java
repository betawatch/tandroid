package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class rw0 implements org.telegram.ui.ActionBar.a2, Utilities.Callback5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tw0 b;

    public /* synthetic */ rw0(tw0 tw0Var, int i10) {
        this.a = i10;
        this.b = tw0Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
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
        tw0 tw0Var = this.b;
        tw0Var.getClass();
        if (((org.telegram.ui.Components.h51) obj).d == 1) {
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
            boolean z10 = !w8Var.e.h;
            tw0Var.r = z10;
            w8Var.setChecked(z10);
            tw0Var.d.Y2.N(true);
            tw0Var.V(true);
        }
    }
}
