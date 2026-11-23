package org.telegram.ui;

import android.view.View;
import java.io.Serializable;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class v8 implements org.telegram.messenger.u10, org.telegram.messenger.v10, r0.m {
    public final /* synthetic */ j9 a;

    public /* synthetic */ v8(j9 j9Var) {
        this.a = j9Var;
    }

    @Override // org.telegram.messenger.v10
    public Boolean a(org.telegram.ui.Components.n41 n41Var, View view, Integer num, Float f10, Float f11) {
        boolean z10;
        Object obj = n41Var.H;
        if (obj instanceof g9) {
            this.a.f0(((g9) obj).c, (f9) view);
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    @Override // org.telegram.messenger.u10
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        j9.a0(this.a, (org.telegram.ui.Components.n41) obj, (View) obj2);
    }

    @Override // r0.m
    public r0.l1 l1(View view, r0.l1 l1Var) {
        return this.a.onInsetsInternal(view, l1Var);
    }
}
