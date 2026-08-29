package q4;

import h7.m5;
import java.util.Arrays;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class e extends n4.e {
    public byte[] s;
    public volatile boolean v;
    public byte[] w;

    @Override // com.google.android.exoplayer2.upstream.n0
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
            m5.a(this.r);
        } catch (Throwable th2) {
            m5.a(this.r);
            throw th2;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.n0
    public final void q() {
        this.v = true;
    }
}
