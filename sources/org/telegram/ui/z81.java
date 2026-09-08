package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class z81 implements Utilities.Callback5, Utilities.Callback5Return, r0.n {
    public final /* synthetic */ i91 a;

    public /* synthetic */ z81(i91 i91Var) {
        this.a = i91Var;
    }

    @Override // r0.n
    public r0.l1 T0(View view, r0.l1 l1Var) {
        i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        int i10 = defaultWindowInsets.d;
        i91 i91Var = this.a;
        i91Var.S = i10;
        i91Var.c.setPadding(0, AndroidUtilities.dp(12.0f) + defaultWindowInsets.b, 0, i91Var.S + i91Var.T);
        return r0.l1.b;
    }

    @Override // org.telegram.messenger.Utilities.Callback5Return
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        return Boolean.valueOf(i91.U(this.a, (org.telegram.ui.Components.h51) obj, (View) obj2));
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        i91.f0(this.a, (org.telegram.ui.Components.h51) obj);
    }
}
