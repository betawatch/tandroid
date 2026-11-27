// default package

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class vs9 extends b2 {
    public vs9() {
        super("stsd");
    }

    @Override // b2, qy0
    public final void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(d());
        ByteBuffer allocate = ByteBuffer.allocate(8);
        aqe.f(0, allocate);
        aqe.e(0, allocate);
        allocate.putInt(this.b.size());
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        c(writableByteChannel);
    }

    @Override // b2, qy0
    public final long getSize() {
        long b = b();
        return 8 + b + (b + 16 >= 4294967296L ? 16 : 8);
    }
}
