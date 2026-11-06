package org.telegram.ui;

import android.view.View;
import java.io.Serializable;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u8 implements org.telegram.messenger.a20, org.telegram.messenger.b20, r0.m {
    public final /* synthetic */ i9 a;

    public /* synthetic */ u8(i9 i9Var) {
        this.a = i9Var;
    }

    @Override // r0.m
    public r0.k1 S0(View view, r0.k1 k1Var) {
        return this.a.onInsetsInternal(view, k1Var);
    }

    @Override // org.telegram.messenger.b20
    public Boolean a(org.telegram.ui.Components.x31 x31Var, View view, Integer num, Float f10, Float f11) {
        boolean z9;
        Object obj = x31Var.G;
        if (obj instanceof f9) {
            this.a.f0(((f9) obj).c, (e9) view);
            z9 = true;
        } else {
            z9 = false;
        }
        return Boolean.valueOf(z9);
    }

    @Override // org.telegram.messenger.a20
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        i9.a0(this.a, (org.telegram.ui.Components.x31) obj, (View) obj2);
    }
}
