// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class sp3 extends ok1 {
    public float[] l;

    @Override // ok1
    public final void e() {
        super.e();
        int size = this.d.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            long j2 = ((nk1) this.d.get(i)).e;
            if (j2 > j) {
                j = j2;
            }
        }
        this.l = new float[size];
        for (int i2 = 0; i2 < size; i2++) {
            long j3 = ((nk1) this.d.get(i2)).e;
            float[] fArr = this.l;
            if (j == j3) {
                fArr[i2] = 1.0f;
            } else {
                fArr[i2] = j / j3;
            }
        }
    }
}
