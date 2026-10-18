package org.telegram.ui;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class t20 extends g.o {
    public final /* synthetic */ s50 c;

    public t20(s50 s50Var) {
        this.c = s50Var;
    }

    @Override // g.o
    public final int i(int i10) {
        int size = this.c.o2.e.size();
        if (size > 1 && size != 2) {
            return (size != 3 || i10 == 0 || i10 == 1) ? 3 : 6;
        }
        return 6;
    }
}
