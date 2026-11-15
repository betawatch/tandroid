package org.telegram.ui;

import android.view.View;
import java.io.Serializable;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class u8 implements org.telegram.messenger.x10, org.telegram.messenger.y10, r0.m {
    public final /* synthetic */ i9 a;

    public /* synthetic */ u8(i9 i9Var) {
        this.a = i9Var;
    }

    @Override // r0.m
    public r0.k1 M0(View view, r0.k1 k1Var) {
        return this.a.onInsetsInternal(view, k1Var);
    }

    @Override // org.telegram.messenger.y10
    public Boolean a(org.telegram.ui.Components.b41 b41Var, View view, Integer num, Float f10, Float f11) {
        boolean z10;
        Object obj = b41Var.G;
        if (obj instanceof f9) {
            this.a.f0(((f9) obj).c, (e9) view);
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    @Override // org.telegram.messenger.x10
    public void m(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        i9.a0(this.a, (org.telegram.ui.Components.b41) obj, (View) obj2);
    }
}
