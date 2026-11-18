package v4;

import org.telegram.messenger.ks;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class j1 {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;

    public final boolean a() {
        int i7 = this.a;
        int i10 = 2;
        if ((i7 & 7) != 0) {
            int i11 = this.d;
            int i12 = this.b;
            if (((i11 > i12 ? 1 : i11 == i12 ? 2 : 4) & i7) == 0) {
                return false;
            }
        }
        if ((i7 & ks.x1) != 0) {
            int i13 = this.d;
            int i14 = this.c;
            if ((((i13 > i14 ? 1 : i13 == i14 ? 2 : 4) << 4) & i7) == 0) {
                return false;
            }
        }
        if ((i7 & 1792) != 0) {
            int i15 = this.e;
            int i16 = this.b;
            if ((((i15 > i16 ? 1 : i15 == i16 ? 2 : 4) << 8) & i7) == 0) {
                return false;
            }
        }
        if ((i7 & 28672) != 0) {
            int i17 = this.e;
            int i18 = this.c;
            if (i17 > i18) {
                i10 = 1;
            } else if (i17 != i18) {
                i10 = 4;
            }
            if ((i7 & (i10 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
