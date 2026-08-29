package org.telegram.ui;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class t20 extends f2.v {
    public final /* synthetic */ r50 c;

    public t20(r50 r50Var) {
        this.c = r50Var;
    }

    @Override // f2.v
    public final int i(int i10) {
        int size = this.c.k2.e.size();
        if (size > 1 && size != 2) {
            return (size != 3 || i10 == 0 || i10 == 1) ? 3 : 6;
        }
        return 6;
    }
}
