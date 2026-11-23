package z3;

import f3.f0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
