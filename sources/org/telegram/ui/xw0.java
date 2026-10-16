package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xw0 implements org.telegram.ui.ActionBar.z1, Utilities.Callback5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zw0 b;

    public /* synthetic */ xw0(zw0 zw0Var, int i10) {
        this.a = i10;
        this.b = zw0Var;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
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
        zw0 zw0Var = this.b;
        zw0Var.getClass();
        if (((org.telegram.ui.Components.m61) obj).d == 1) {
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
            boolean z10 = !w8Var.e.h;
            zw0Var.r = z10;
            w8Var.setChecked(z10);
            zw0Var.d.W2.N(true);
            zw0Var.V(true);
        }
    }
}
