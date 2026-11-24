// default package

import java.util.concurrent.TimeUnit;
import java.util.function.LongSupplier;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class ur2 extends cr2 {
    public int d;
    public fr e;
    public TimeUnit f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [tr2] */
    /* JADX WARN: Type inference failed for: r5v0, types: [cr2, ur2] */
    public final vr2 u(qr2 qr2Var) {
        if (this.e == null) {
            long j = this.d;
            r(j >= 0 && j <= Long.MAX_VALUE, Long.valueOf(j));
        }
        if (this.f == null) {
            throw new IllegalStateException("ConfigTime " + s() + " without a unit");
        }
        String s = s();
        fr frVar = this.e;
        if (frVar == null) {
            final long j2 = this.d;
            frVar = new LongSupplier(j2) { // from class: tr2
                public final /* synthetic */ int a;

                {
                    this.a = (int) j2;
                }

                @Override // java.util.function.LongSupplier
                public final long getAsLong() {
                    return this.a;
                }
            };
        }
        vr2 vr2Var = new vr2(s, frVar, this.f, this.a);
        q(qr2Var, vr2Var);
        return vr2Var;
    }

    public final void v(long j) {
        this.d = (int) j;
        this.e = null;
    }
}
