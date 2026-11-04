package y3;

import b8.zb;
import e3.h0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class s {
    public final boolean a;
    public final String b;
    public final h0 c;
    public final int d;
    public final byte[] e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        if (r6.equals("cbc1") == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s(boolean z10, String str, int i3, byte[] bArr, int i10, int i11, byte[] bArr2) {
        char c2 = 0;
        int i12 = 1;
        zb.f((i3 == 0) ^ (bArr2 == null));
        this.a = z10;
        this.b = str;
        this.d = i3;
        this.e = bArr2;
        if (str != null) {
            switch (str.hashCode()) {
                case 3046605:
                    break;
                case 3046671:
                    if (str.equals("cbcs")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3049879:
                    if (str.equals("cenc")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3049895:
                    if (str.equals("cens")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            switch (c2) {
                case 0:
                case 1:
                    i12 = 2;
                    break;
                case 2:
                case 3:
                    break;
                default:
                    g2.a.l("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                    break;
            }
        }
        this.c = new h0(i12, i10, i11, bArr);
    }
}
