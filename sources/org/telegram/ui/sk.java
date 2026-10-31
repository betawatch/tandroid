package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class sk extends org.telegram.ui.Components.vj0 {
    public final /* synthetic */ un l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sk(un unVar, vj vjVar, yj yjVar) {
        super(vjVar, yjVar);
        this.l = unVar;
    }

    public final void f(int i10) {
        if (this.l.jb) {
            if (i10 == 0) {
                i10 = 1;
            } else if (i10 == 1) {
                i10 = 0;
            }
        }
        this.b = i10;
    }
}
