// default package

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class r30 extends d4 {
    public int f;
    public byte h;
    public long n;

    @Override // b2, qy0
    public final void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(d());
        ByteBuffer allocate = ByteBuffer.allocate(28);
        allocate.position(6);
        aqe.d(1, allocate);
        aqe.d(0, allocate);
        aqe.d(0, allocate);
        allocate.putInt(0);
        aqe.d(this.f, allocate);
        aqe.d(this.h, allocate);
        aqe.d(0, allocate);
        aqe.d(0, allocate);
        boolean equals = this.e.equals("mlpa");
        long j = this.n;
        if (equals) {
            allocate.putInt((int) j);
        } else {
            allocate.putInt((int) (j << 16));
        }
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        c(writableByteChannel);
    }

    @Override // b2, qy0
    public final long getSize() {
        long b = b();
        return 28 + b + (b + 36 >= 4294967296L ? 16 : 8);
    }

    @Override // zg0
    public final String toString() {
        return "AudioSampleEntry{bytesPerSample=0, bytesPerFrame=0, bytesPerPacket=0, samplesPerPacket=0, packetSize=0, compressionId=0, soundVersion=0, sampleRate=" + this.n + ", sampleSize=" + ((int) this.h) + ", channelCount=" + this.f + ", boxes=" + this.b + '}';
    }
}
