package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class sw0 implements org.telegram.ui.ActionBar.a2, Utilities.Callback5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tw0 b;

    public /* synthetic */ sw0(tw0 tw0Var, int i10) {
        this.a = i10;
        this.b = tw0Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
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
        if (((org.telegram.ui.Components.y51) obj).d == 1) {
            org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
            boolean z10 = !x8Var.e.h;
            tw0Var.r = z10;
            x8Var.setChecked(z10);
            tw0Var.d.Y2.N(true);
            tw0Var.V(true);
        }
    }
}
