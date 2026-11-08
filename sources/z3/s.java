package z3;

import a8.ia;
import f3.i0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class s {
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
    public s(boolean z9, String str, int i7, byte[] bArr, int i10, int i11, byte[] bArr2) {
        char c10 = 0;
        int i12 = 1;
        ia.f((i7 == 0) ^ (bArr2 == null));
        this.a = z9;
        this.b = str;
        this.d = i7;
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
                    i12 = 2;
                    break;
                case 2:
                case 3:
                    break;
                default:
                    h2.a.l("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                    break;
            }
        }
        this.c = new i0(i12, i10, i11, bArr);
    }
}
