package r2;

import c8.s0;
import java.util.Arrays;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class d extends y2.f {
    public byte[] s;
    public volatile boolean w;
    public byte[] x;

    @Override // b3.m
    public final void A() {
        this.w = true;
    }

    @Override // b3.m
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
            s0.a(this.r);
        } catch (Throwable th2) {
            s0.a(this.r);
            throw th2;
        }
    }
}
