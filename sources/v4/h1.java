package v4;

import org.telegram.messenger.qs;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class h1 {
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
        if ((i7 & qs.x1) != 0) {
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
