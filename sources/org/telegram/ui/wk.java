package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class wk extends mq0 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ an c;

    public wk(an anVar, ArrayList arrayList, boolean[] zArr) {
        this.c = anVar;
        this.a = arrayList;
        this.b = zArr;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final boolean T() {
        return false;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final org.telegram.messenger.ic j(int i7) {
        return null;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final void o(int i7, org.telegram.messenger.g20 g20Var, boolean z10, int i10, int i11, boolean z11) {
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!this.b[size]) {
                arrayList.remove(size);
            }
        }
        this.c.Kb(i10, arrayList, z10, z11);
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final boolean x(int i7) {
        return this.b[i7];
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final int k(int i7, org.telegram.messenger.g20 g20Var) {
        return i7;
    }
}
