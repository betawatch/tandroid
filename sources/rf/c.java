package rf;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class c extends b {
    public float[] l;

    @Override // rf.b
    public final void e() {
        super.e();
        int size = this.d.size();
        long j10 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            long j11 = ((a) this.d.get(i9)).e;
            if (j11 > j10) {
                j10 = j11;
            }
        }
        this.l = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            if (j10 == ((a) this.d.get(i10)).e) {
                this.l[i10] = 1.0f;
            } else {
                this.l[i10] = j10 / r4;
            }
        }
    }
}
