package tf;

import java.nio.ShortBuffer;
import org.telegram.messenger.video.AudioBufferConverter;
import org.telegram.messenger.video.AudioConversions;
import org.telegram.messenger.video.AudioDecoder;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class c extends a {
    public final AudioDecoder b;
    public final AudioBufferConverter c = new AudioBufferConverter();
    public long d;
    public int e;
    public int f;
    public int g;
    public int h;
    public ShortBuffer i;
    public boolean j;

    public c(String str) {
        this.b = new AudioDecoder(str);
    }

    @Override // tf.a
    public final short a() {
        if (!this.j) {
            throw new RuntimeException("Audio input has no remaining value.");
        }
        int i10 = this.f;
        if (i10 < this.e) {
            this.f = i10 + 1;
            return (short) 0;
        }
        f();
        ShortBuffer shortBuffer = this.i;
        short s10 = (shortBuffer == null || shortBuffer.remaining() <= 0) ? (short) 0 : this.i.get();
        f();
        ShortBuffer shortBuffer2 = this.i;
        if (shortBuffer2 != null && shortBuffer2.remaining() >= 1) {
            return s10;
        }
        this.j = false;
        return s10;
    }

    @Override // tf.a
    public final int b() {
        return this.b.getSampleRate();
    }

    @Override // tf.a
    public final boolean c() {
        return this.j;
    }

    @Override // tf.a
    public final void d() {
        this.i = null;
        this.j = false;
        AudioDecoder audioDecoder = this.b;
        audioDecoder.stop();
        audioDecoder.release();
    }

    @Override // tf.a
    public final void e(int i10, int i11) {
        this.g = i10;
        this.h = i11;
        this.j = true;
        this.b.start();
        this.e = AudioConversions.usToShorts(this.d, this.g, this.h);
        this.f = 0;
    }

    public final void f() {
        ShortBuffer shortBuffer = this.i;
        if (shortBuffer == null || shortBuffer.remaining() <= 0) {
            AudioDecoder audioDecoder = this.b;
            AudioDecoder.DecodedBufferData decode = audioDecoder.decode();
            if (decode.index < 0) {
                this.i = null;
                return;
            }
            this.i = this.c.convert(decode.byteBuffer.asShortBuffer(), audioDecoder.getSampleRate(), audioDecoder.getChannelCount(), this.g, this.h);
            audioDecoder.releaseOutputBuffer(decode.index);
        }
    }

    public c(String str, int i10) {
        this.b = new AudioDecoder(str, i10);
    }
}
