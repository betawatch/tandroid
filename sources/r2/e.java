package r2;

import c8.p0;
import java.util.Arrays;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class e extends y2.f {
    public byte[] s;
    public volatile boolean w;
    public byte[] x;

    @Override // b3.l
    public final void a() {
        try {
            this.r.open(this.b);
            int i7 = 0;
            int i10 = 0;
            while (i7 != -1 && !this.w) {
                byte[] bArr = this.s;
                if (bArr.length < i10 + TLObject.FLAG_14) {
                    this.s = Arrays.copyOf(bArr, bArr.length + TLObject.FLAG_14);
                }
                i7 = this.r.read(this.s, i10, TLObject.FLAG_14);
                if (i7 != -1) {
                    i10 += i7;
                }
            }
            if (!this.w) {
                this.x = Arrays.copyOf(this.s, i10);
            }
            p0.a(this.r);
        } catch (Throwable th2) {
            p0.a(this.r);
            throw th2;
        }
    }

    @Override // b3.l
    public final void q0() {
        this.w = true;
    }
}
