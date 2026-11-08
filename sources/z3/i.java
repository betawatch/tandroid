package z3;

import f3.g0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class i implements g0 {
    public static final i b = new i(true);
    public static final i c = new i(false);
    public final boolean a;

    public i(boolean z9) {
        this.a = z9;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IncorrectFragmentation{expected=");
        sb2.append(!this.a);
        sb2.append("}");
        return sb2.toString();
    }
}
