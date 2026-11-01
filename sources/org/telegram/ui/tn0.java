package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class tn0 implements io0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ HashMap b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ wn0 d;

    public /* synthetic */ tn0(wn0 wn0Var, HashMap hashMap, ArrayList arrayList, int i10) {
        this.a = i10;
        this.d = wn0Var;
        this.b = hashMap;
        this.c = arrayList;
    }

    @Override // org.telegram.ui.io0
    public final void B(Editable editable) {
        switch (this.a) {
            case 0:
                wn0 wn0Var = this.d;
                org.telegram.ui.Components.wt wtVar = wn0Var.M;
                wn0Var.a = editable;
                wtVar.setText(editable);
                break;
            default:
                wn0 wn0Var2 = this.d;
                org.telegram.ui.Components.wt wtVar2 = wn0Var2.M;
                wn0Var2.a = editable;
                wtVar2.setText(editable);
                break;
        }
    }

    @Override // org.telegram.ui.io0
    public final /* synthetic */ boolean e() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.io0
    public final /* synthetic */ void h0() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.io0
    public final void u0(int i10, boolean z10, boolean z11) {
        switch (this.a) {
            case 0:
                wn0 wn0Var = this.d;
                wn0Var.removeSelfFromStack();
                if (!z10) {
                    wn0Var.a0(this.b, this.c, z11, i10);
                    break;
                }
                break;
            default:
                wn0 wn0Var2 = this.d;
                wn0Var2.removeSelfFromStack();
                if (!z10) {
                    wn0Var2.a0(this.b, this.c, z11, i10);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.io0
    public final void y() {
        int i10 = this.a;
    }

    private final /* synthetic */ void a() {
    }

    private final /* synthetic */ void b() {
    }

    private final void c() {
    }

    private final void d() {
    }
}
