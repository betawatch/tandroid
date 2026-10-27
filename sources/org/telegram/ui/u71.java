package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u71 implements Utilities.Callback5, Utilities.Callback5Return, r0.n {
    public final /* synthetic */ f81 a;

    public /* synthetic */ u71(f81 f81Var) {
        this.a = f81Var;
    }

    @Override // r0.n
    public r0.k1 P0(View view, r0.k1 k1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        int i10 = defaultWindowInsets.d;
        f81 f81Var = this.a;
        f81Var.c0 = i10;
        int i11 = defaultWindowInsets.b;
        if (f81Var.P != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i11;
            ViewGroup.LayoutParams layoutParams = f81Var.P.getLayoutParams();
            if (layoutParams.height != currentActionBarHeight) {
                layoutParams.height = currentActionBarHeight;
                f81Var.P.setLayoutParams(layoutParams);
            }
        }
        oi.a.d(f81Var.c, i11, defaultWindowInsets.d, AndroidUtilities.dp(12.0f), f81Var.d0);
        return r0.k1.b;
    }

    @Override // org.telegram.messenger.Utilities.Callback5Return
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        return Boolean.valueOf(f81.V(this.a, (org.telegram.ui.Components.u61) obj, (View) obj2));
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        f81.f0(this.a, (org.telegram.ui.Components.u61) obj);
    }
}
