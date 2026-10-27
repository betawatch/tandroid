package w3;

import c3.f0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
