package org.telegram.ui;

import android.view.View;
import java.io.Serializable;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u8 implements org.telegram.messenger.p20, org.telegram.messenger.q20, r0.m {
    public final /* synthetic */ j9 a;

    public /* synthetic */ u8(j9 j9Var) {
        this.a = j9Var;
    }

    @Override // r0.m
    public r0.j1 R0(View view, r0.j1 j1Var) {
        return this.a.onInsetsInternal(view, j1Var);
    }

    @Override // org.telegram.messenger.q20
    public Boolean a(org.telegram.ui.Components.b51 b51Var, View view, Integer num, Float f7, Float f10) {
        boolean z10;
        Object obj = b51Var.G;
        if (obj instanceof g9) {
            this.a.f0(((g9) obj).c, (f9) view);
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    @Override // org.telegram.messenger.p20
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        j9.a0(this.a, (org.telegram.ui.Components.b51) obj, (View) obj2);
    }
}
