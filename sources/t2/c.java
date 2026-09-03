package t2;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class c extends a {
    public int h;
    public int n;
    public double r;
    public double s;
    public int v;
    public String w;
    public int x;
    public final long[] y;

    public c(String str) {
        super(str);
        this.r = 72.0d;
        this.s = 72.0d;
        this.v = 1;
        this.w = "";
        this.x = 24;
        this.y = new long[3];
    }

    @Override // com.googlecode.mp4parser.b, s2.b
    public final void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(d());
        ByteBuffer allocate = ByteBuffer.allocate(78);
        allocate.position(6);
        r2.b.p(this.f, allocate);
        r2.b.p(0, allocate);
        r2.b.p(0, allocate);
        long[] jArr = this.y;
        allocate.putInt((int) jArr[0]);
        allocate.putInt((int) jArr[1]);
        allocate.putInt((int) jArr[2]);
        r2.b.p(this.h, allocate);
        r2.b.p(this.n, allocate);
        r2.b.n(allocate, this.r);
        r2.b.n(allocate, this.s);
        allocate.putInt((int) 0);
        r2.b.p(this.v, allocate);
        allocate.put((byte) (r2.b.l(this.w) & 255));
        allocate.put(r2.b.b(this.w));
        int l10 = r2.b.l(this.w);
        while (l10 < 31) {
            l10++;
            allocate.put((byte) 0);
        }
        r2.b.p(this.x, allocate);
        r2.b.p(65535, allocate);
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        c(writableByteChannel);
    }

    @Override // com.googlecode.mp4parser.b, s2.b
    public final long getSize() {
        long b10 = b();
        return 78 + b10 + (b10 + 86 >= 4294967296L ? 16 : 8);
    }
}
