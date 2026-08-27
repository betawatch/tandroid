package org.telegram.ui;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class s20 extends f2.w {
    public final /* synthetic */ s50 c;

    public s20(s50 s50Var) {
        this.c = s50Var;
    }

    @Override // f2.w
    public final int i(int i10) {
        int size = this.c.k2.e.size();
        if (size > 1 && size != 2) {
            return (size != 3 || i10 == 0 || i10 == 1) ? 3 : 6;
        }
        return 6;
    }
}
