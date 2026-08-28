package q2;

import g7.u8;
import java.nio.ByteBuffer;
import org.telegram.ui.Cells.j2;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class o extends com.googlecode.mp4parser.c {
    public static final /* synthetic */ zd.b n;
    public static final /* synthetic */ zd.b r;
    public static final /* synthetic */ zd.b s;
    public static final /* synthetic */ zd.b v;
    public long e;
    public long[] f;
    public int h;

    static {
        zd.a aVar = new zd.a(o.class, "SampleSizeBox.java");
        n = aVar.e(aVar.d("getSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "long"));
        aVar.e(aVar.d("setSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", "long", "sampleSize", "void"));
        aVar.e(aVar.d("getSampleSizeAtIndex", "com.coremedia.iso.boxes.SampleSizeBox", "int", "index", "long"));
        r = aVar.e(aVar.d("getSampleCount", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "long"));
        aVar.e(aVar.d("getSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "[J"));
        s = aVar.e(aVar.d("setSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "[J", "sampleSizes", "void"));
        v = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "java.lang.String"));
    }

    @Override // com.googlecode.mp4parser.c, com.googlecode.mp4parser.a
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        this.e = p2.b.i(byteBuffer);
        int a2 = u8.a(p2.b.i(byteBuffer));
        this.h = a2;
        if (this.e == 0) {
            this.f = new long[a2];
            for (int i9 = 0; i9 < this.h; i9++) {
                this.f[i9] = p2.b.i(byteBuffer);
            }
        }
    }

    @Override // com.googlecode.mp4parser.c, com.googlecode.mp4parser.a
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt((int) this.e);
        if (this.e != 0) {
            byteBuffer.putInt(this.h);
            return;
        }
        byteBuffer.putInt(this.f.length);
        for (long j10 : this.f) {
            byteBuffer.putInt((int) j10);
        }
    }

    @Override // com.googlecode.mp4parser.a
    public final long getContentSize() {
        return (this.e == 0 ? this.f.length * 4 : 0) + 12;
    }

    public final String toString() {
        com.google.firebase.messaging.t b10 = zd.a.b(v, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("SampleSizeBox[sampleSize=");
        j2.t(zd.a.b(n, this, this));
        sb2.append(this.e);
        sb2.append(";sampleCount=");
        j2.t(zd.a.b(r, this, this));
        return aa.d.q(sb2, this.e > 0 ? this.h : this.f.length, "]");
    }
}
