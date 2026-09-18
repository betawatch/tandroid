package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w81 implements Utilities.Callback5, Utilities.Callback5Return, r0.n {
    public final /* synthetic */ g91 a;

    public /* synthetic */ w81(g91 g91Var) {
        this.a = g91Var;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        int i10 = defaultWindowInsets.d;
        g91 g91Var = this.a;
        g91Var.S = i10;
        g91Var.c.setPadding(0, AndroidUtilities.dp(12.0f) + defaultWindowInsets.b, 0, g91Var.S + g91Var.T);
        return r0.l1.b;
    }

    @Override // org.telegram.messenger.Utilities.Callback5Return
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        return Boolean.valueOf(g91.U(this.a, (org.telegram.ui.Components.j51) obj, (View) obj2));
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        g91.f0(this.a, (org.telegram.ui.Components.j51) obj);
    }
}
