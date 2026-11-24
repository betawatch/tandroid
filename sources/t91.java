// default package

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class t91 extends ug0 {
    public final z83 K;
    public final xu7 L;
    public u54 M;
    public long N;

    public t91() {
        super(6);
        this.K = new z83(1, 0);
        this.L = new xu7();
    }

    @Override // ug0
    public final void B(long j, long j2) {
        float[] fArr;
        while (!m() && this.N < 100000 + j) {
            z83 z83Var = this.K;
            z83Var.clear();
            sk4 sk4Var = this.c;
            sk4Var.m();
            if (A(sk4Var, z83Var, 0) != -4 || z83Var.isEndOfStream()) {
                return;
            }
            long j3 = z83Var.e;
            this.N = j3;
            boolean z = j3 < this.x;
            if (this.M != null && !z) {
                z83Var.d();
                ByteBuffer byteBuffer = z83Var.c;
                String str = g8c.a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] array = byteBuffer.array();
                    int limit = byteBuffer.limit();
                    xu7 xu7Var = this.L;
                    xu7Var.L(limit, array);
                    xu7Var.N(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i = 0; i < 3; i++) {
                        fArr2[i] = Float.intBitsToFloat(xu7Var.o());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.M.a();
                }
            }
        }
    }

    @Override // ug0, xc8
    public final void d(int i, Object obj) {
        if (i == 8) {
            this.M = (u54) obj;
        }
    }

    @Override // ug0
    public final void q() {
        u54 u54Var = this.M;
        if (u54Var != null) {
            u54Var.b();
        }
    }

    @Override // ug0
    public final void s(long j, boolean z, boolean z2) {
        this.N = Long.MIN_VALUE;
        u54 u54Var = this.M;
        if (u54Var != null) {
            u54Var.b();
        }
    }
}
