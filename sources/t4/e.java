package t4;

import j7.p7;
import java.util.Arrays;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class e extends q4.e {
    public byte[] s;
    public volatile boolean v;
    public byte[] w;

    @Override // g5.j0
    public final void a() {
        try {
            this.r.open(this.b);
            int i10 = 0;
            int i11 = 0;
            while (i10 != -1 && !this.v) {
                byte[] bArr = this.s;
                if (bArr.length < i11 + 16384) {
                    this.s = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i10 = this.r.read(this.s, i11, 16384);
                if (i10 != -1) {
                    i11 += i10;
                }
            }
            if (!this.v) {
                this.w = Arrays.copyOf(this.s, i11);
            }
            p7.a(this.r);
        } catch (Throwable th2) {
            p7.a(this.r);
            throw th2;
        }
    }

    @Override // g5.j0
    public final void b() {
        this.v = true;
    }
}
