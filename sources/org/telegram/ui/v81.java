package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v81 implements Utilities.Callback5, Utilities.Callback5Return, r0.n {
    public final /* synthetic */ f91 a;

    public /* synthetic */ v81(f91 f91Var) {
        this.a = f91Var;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        int i10 = defaultWindowInsets.d;
        f91 f91Var = this.a;
        f91Var.S = i10;
        f91Var.c.setPadding(0, AndroidUtilities.dp(12.0f) + defaultWindowInsets.b, 0, f91Var.S + f91Var.T);
        return r0.l1.b;
    }

    @Override // org.telegram.messenger.Utilities.Callback5Return
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        return Boolean.valueOf(f91.U(this.a, (org.telegram.ui.Components.i51) obj, (View) obj2));
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        f91.f0(this.a, (org.telegram.ui.Components.i51) obj);
    }
}
