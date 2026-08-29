package uf;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class c extends b {
    public float[] l;

    @Override // uf.b
    public final void e() {
        super.e();
        int size = this.d.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            long j11 = ((a) this.d.get(i10)).e;
            if (j11 > j10) {
                j10 = j11;
            }
        }
        this.l = new float[size];
        for (int i11 = 0; i11 < size; i11++) {
            if (j10 == ((a) this.d.get(i11)).e) {
                this.l[i11] = 1.0f;
            } else {
                this.l[i11] = j10 / r4;
            }
        }
    }
}
