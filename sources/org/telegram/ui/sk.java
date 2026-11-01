package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class sk extends org.telegram.ui.Components.wj0 {
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
