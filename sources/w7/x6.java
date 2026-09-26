package w7;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public abstract class x6 {
    public static int a(int i10) {
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 4) {
            return 2;
        }
        if (i10 == 8) {
            return 3;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 == 32) {
            return 5;
        }
        if (i10 == 64) {
            return 6;
        }
        if (i10 == 128) {
            return 7;
        }
        if (i10 == 256) {
            return 8;
        }
        if (i10 == 512) {
            return 9;
        }
        throw new IllegalArgumentException(hg.c.h(i10, "type needs to be >= FIRST and <= LAST, type="));
    }
}
