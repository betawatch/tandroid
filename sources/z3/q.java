package z3;

import r3.u;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class q {
    public final boolean a;
    public final String b;
    public final u c;
    public final int d;
    public final byte[] e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        if (r6.equals("cbc1") == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q(boolean z4, String str, int i10, byte[] bArr, int i11, int i12, byte[] bArr2) {
        char c3 = 0;
        int i13 = 1;
        h5.a.f((i10 == 0) ^ (bArr2 == null));
        this.a = z4;
        this.b = str;
        this.d = i10;
        this.e = bArr2;
        if (str != null) {
            switch (str.hashCode()) {
                case 3046605:
                    break;
                case 3046671:
                    if (str.equals("cbcs")) {
                        c3 = 1;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 3049879:
                    if (str.equals("cenc")) {
                        c3 = 2;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 3049895:
                    if (str.equals("cens")) {
                        c3 = 3;
                        break;
                    }
                    c3 = 65535;
                    break;
                default:
                    c3 = 65535;
                    break;
            }
            switch (c3) {
                case 0:
                case 1:
                    i13 = 2;
                    break;
                case 2:
                case 3:
                    break;
                default:
                    h5.a.K("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                    break;
            }
        }
        this.c = new u(i13, i11, i12, bArr);
    }
}
