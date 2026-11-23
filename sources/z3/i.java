package z3;

import f3.g0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class i implements g0 {
    public static final i b = new i(true);
    public static final i c = new i(false);
    public final boolean a;

    public i(boolean z10) {
        this.a = z10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IncorrectFragmentation{expected=");
        sb2.append(!this.a);
        sb2.append("}");
        return sb2.toString();
    }
}
