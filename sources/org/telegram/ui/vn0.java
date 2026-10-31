package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class vn0 implements ko0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ HashMap b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ yn0 d;

    public /* synthetic */ vn0(yn0 yn0Var, HashMap hashMap, ArrayList arrayList, int i10) {
        this.a = i10;
        this.d = yn0Var;
        this.b = hashMap;
        this.c = arrayList;
    }

    @Override // org.telegram.ui.ko0
    public final void B(Editable editable) {
        switch (this.a) {
            case 0:
                yn0 yn0Var = this.d;
                org.telegram.ui.Components.wt wtVar = yn0Var.M;
                yn0Var.a = editable;
                wtVar.setText(editable);
                break;
            default:
                yn0 yn0Var2 = this.d;
                org.telegram.ui.Components.wt wtVar2 = yn0Var2.M;
                yn0Var2.a = editable;
                wtVar2.setText(editable);
                break;
        }
    }

    @Override // org.telegram.ui.ko0
    public final /* synthetic */ boolean e() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.ko0
    public final /* synthetic */ void h0() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.ko0
    public final void u0(int i10, boolean z10, boolean z11) {
        switch (this.a) {
            case 0:
                yn0 yn0Var = this.d;
                yn0Var.removeSelfFromStack();
                if (!z10) {
                    yn0Var.Z(this.b, this.c, z11, i10);
                    break;
                }
                break;
            default:
                yn0 yn0Var2 = this.d;
                yn0Var2.removeSelfFromStack();
                if (!z10) {
                    yn0Var2.Z(this.b, this.c, z11, i10);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ko0
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
