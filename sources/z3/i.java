package z3;

import f3.f0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class i implements f0 {
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
