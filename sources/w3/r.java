package w3;

import a8.yb;
import c3.i0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class r {
    public final boolean a;
    public final String b;
    public final i0 c;
    public final int d;
    public final byte[] e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        if (r6.equals("cbc1") == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public r(boolean z10, String str, int i10, byte[] bArr, int i11, int i12, byte[] bArr2) {
        char c10 = 0;
        int i13 = 1;
        yb.g((i10 == 0) ^ (bArr2 == null));
        this.a = z10;
        this.b = str;
        this.d = i10;
        this.e = bArr2;
        if (str != null) {
            switch (str.hashCode()) {
                case 3046605:
                    break;
                case 3046671:
                    if (str.equals("cbcs")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3049879:
                    if (str.equals("cenc")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3049895:
                    if (str.equals("cens")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            switch (c10) {
                case 0:
                case 1:
                    i13 = 2;
                    break;
                case 2:
                case 3:
                    break;
                default:
                    e2.a.l("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                    break;
            }
        }
        this.c = new i0(i13, i11, i12, bArr);
    }
}
