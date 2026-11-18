package org.telegram.ui;

import android.view.View;
import java.io.Serializable;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class u8 implements org.telegram.messenger.v10, org.telegram.messenger.w10, r0.m {
    public final /* synthetic */ i9 a;

    public /* synthetic */ u8(i9 i9Var) {
        this.a = i9Var;
    }

    @Override // r0.m
    public r0.l1 P0(View view, r0.l1 l1Var) {
        return this.a.onInsetsInternal(view, l1Var);
    }

    @Override // org.telegram.messenger.w10
    public Boolean a(org.telegram.ui.Components.l41 l41Var, View view, Integer num, Float f10, Float f11) {
        boolean z10;
        Object obj = l41Var.H;
        if (obj instanceof f9) {
            this.a.f0(((f9) obj).c, (e9) view);
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    @Override // org.telegram.messenger.v10
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        i9.a0(this.a, (org.telegram.ui.Components.l41) obj, (View) obj2);
    }
}
