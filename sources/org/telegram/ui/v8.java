package org.telegram.ui;

import android.view.View;
import java.io.Serializable;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v8 implements org.telegram.messenger.w10, org.telegram.messenger.x10, r0.m {
    public final /* synthetic */ j9 a;

    public /* synthetic */ v8(j9 j9Var) {
        this.a = j9Var;
    }

    @Override // r0.m
    public r0.l1 P0(View view, r0.l1 l1Var) {
        return this.a.onInsetsInternal(view, l1Var);
    }

    @Override // org.telegram.messenger.x10
    public Boolean a(org.telegram.ui.Components.o41 o41Var, View view, Integer num, Float f10, Float f11) {
        boolean z10;
        Object obj = o41Var.H;
        if (obj instanceof g9) {
            this.a.f0(((g9) obj).c, (f9) view);
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    @Override // org.telegram.messenger.w10
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        j9.a0(this.a, (org.telegram.ui.Components.o41) obj, (View) obj2);
    }
}
