package r2;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b extends a {
    public int h;
    public int n;
    public long r;

    @Override // com.googlecode.mp4parser.b, q2.b
    public final void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(d());
        ByteBuffer allocate = ByteBuffer.allocate(28);
        allocate.position(6);
        p2.b.p(this.f, allocate);
        p2.b.p(0, allocate);
        p2.b.p(0, allocate);
        allocate.putInt((int) 0);
        p2.b.p(this.h, allocate);
        p2.b.p(this.n, allocate);
        p2.b.p(0, allocate);
        p2.b.p(0, allocate);
        if (this.e.equals("mlpa")) {
            allocate.putInt((int) this.r);
        } else {
            allocate.putInt((int) (this.r << 16));
        }
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        c(writableByteChannel);
    }

    @Override // com.googlecode.mp4parser.b, q2.b
    public final long getSize() {
        long b10 = b() + 28;
        return b10 + (8 + b10 >= 4294967296L ? 16 : 8);
    }

    @Override // com.googlecode.mp4parser.e
    public final String toString() {
        return "AudioSampleEntry{bytesPerSample=0, bytesPerFrame=0, bytesPerPacket=0, samplesPerPacket=0, packetSize=0, compressionId=0, soundVersion=0, sampleRate=" + this.r + ", sampleSize=" + this.n + ", channelCount=" + this.h + ", boxes=" + this.b + '}';
    }
}
