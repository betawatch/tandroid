package q2;

import b8.uc;
import java.util.Arrays;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class e extends x2.f {
    public byte[] s;
    public volatile boolean w;
    public byte[] x;

    @Override // a3.m
    public final void X1() {
        this.w = true;
    }

    @Override // a3.m
    public final void a() {
        try {
            this.r.open(this.b);
            int i3 = 0;
            int i10 = 0;
            while (i3 != -1 && !this.w) {
                byte[] bArr = this.s;
                if (bArr.length < i10 + TLObject.FLAG_14) {
                    this.s = Arrays.copyOf(bArr, bArr.length + TLObject.FLAG_14);
                }
                i3 = this.r.read(this.s, i10, TLObject.FLAG_14);
                if (i3 != -1) {
                    i10 += i3;
                }
            }
            if (!this.w) {
                this.x = Arrays.copyOf(this.s, i10);
            }
            uc.a(this.r);
        } catch (Throwable th2) {
            uc.a(this.r);
            throw th2;
        }
    }
}
