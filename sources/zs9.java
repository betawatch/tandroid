// default package

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class zs9 extends h2 {
    public static final /* synthetic */ xh4 n;
    public static final /* synthetic */ xh4 r;
    public static final /* synthetic */ xh4 s;
    public static final /* synthetic */ xh4 w;
    public long e;
    public long[] f;
    public int h;

    static {
        u84 u84Var = new u84(zs9.class, "SampleSizeBox.java");
        n = u84Var.e(u84Var.d("getSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "long"));
        u84Var.e(u84Var.d("setSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", "long", "sampleSize", "void"));
        u84Var.e(u84Var.d("getSampleSizeAtIndex", "com.coremedia.iso.boxes.SampleSizeBox", "int", "index", "long"));
        r = u84Var.e(u84Var.d("getSampleCount", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "long"));
        u84Var.e(u84Var.d("getSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "[J"));
        s = u84Var.e(u84Var.d("setSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "[J", "sampleSizes", "void"));
        w = u84Var.e(u84Var.d("toString", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "java.lang.String"));
    }

    @Override // h2, z1
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        this.e = zpe.g(byteBuffer);
        int a = cvd.a(zpe.g(byteBuffer));
        this.h = a;
        if (this.e == 0) {
            this.f = new long[a];
            for (int i = 0; i < this.h; i++) {
                this.f[i] = zpe.g(byteBuffer);
            }
        }
    }

    @Override // h2, z1
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt((int) this.e);
        if (this.e != 0) {
            byteBuffer.putInt(this.h);
            return;
        }
        byteBuffer.putInt(this.f.length);
        long[] jArr = this.f;
        for (long j : jArr) {
            byteBuffer.putInt((int) j);
        }
    }

    @Override // z1
    public final long getContentSize() {
        return (this.e == 0 ? this.f.length << 2 : 0) + 12;
    }

    public final String toString() {
        lyc b = u84.b(w, this, this);
        zb9.a().getClass();
        zb9.b(b);
        StringBuilder sb = new StringBuilder("SampleSizeBox[sampleSize=");
        bp1.r(u84.b(n, this, this));
        sb.append(this.e);
        sb.append(";sampleCount=");
        bp1.r(u84.b(r, this, this));
        return qu6.p(sb, this.e > 0 ? this.h : this.f.length, "]");
    }
}
