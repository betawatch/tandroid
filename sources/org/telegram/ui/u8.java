package org.telegram.ui;

import android.view.View;
import java.io.Serializable;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u8 implements org.telegram.messenger.s10, org.telegram.messenger.t10, r0.m {
    public final /* synthetic */ h9 a;

    public /* synthetic */ u8(h9 h9Var) {
        this.a = h9Var;
    }

    @Override // r0.m
    public r0.k1 R0(View view, r0.k1 k1Var) {
        return this.a.onInsetsInternal(view, k1Var);
    }

    @Override // org.telegram.messenger.t10
    public Boolean a(org.telegram.ui.Components.r31 r31Var, View view, Integer num, Float f10, Float f11) {
        boolean z10;
        Object obj = r31Var.G;
        if (obj instanceof e9) {
            this.a.f0(((e9) obj).c, (d9) view);
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    @Override // org.telegram.messenger.s10
    public void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        h9.a0(this.a, (org.telegram.ui.Components.r31) obj, (View) obj2);
    }
}
