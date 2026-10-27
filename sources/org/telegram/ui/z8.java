package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z8 implements Utilities.Callback5, Utilities.Callback5Return, r0.n {
    public final /* synthetic */ o9 a;

    public /* synthetic */ z8(o9 o9Var) {
        this.a = o9Var;
    }

    @Override // r0.n
    public r0.k1 P0(View view, r0.k1 k1Var) {
        return this.a.onInsetsInternal(view, k1Var);
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        o9.W(this.a, (org.telegram.ui.Components.u61) obj, (View) obj2);
    }

    @Override // org.telegram.messenger.Utilities.Callback5Return
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z10;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        Object obj6 = ((org.telegram.ui.Components.u61) obj).G;
        if (obj6 instanceof k9) {
            this.a.b0(((k9) obj6).c, (j9) view);
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
