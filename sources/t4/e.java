package t4;

import j7.q7;
import java.util.Arrays;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
            q7.a(this.r);
        } catch (Throwable th2) {
            q7.a(this.r);
            throw th2;
        }
    }

    @Override // g5.j0
    public final void l() {
        this.v = true;
    }
}
