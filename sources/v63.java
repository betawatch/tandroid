// default package

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class v63 extends b2 {
    public final /* synthetic */ byte f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v63(String str, byte b) {
        super(str);
        this.f = b;
    }

    @Override // b2, qy0
    public final void getBox(WritableByteChannel writableByteChannel) {
        switch (this.f) {
            case 1:
                writableByteChannel.write(d());
                ByteBuffer allocate = ByteBuffer.allocate(8);
                aqe.f(0, allocate);
                aqe.e(0, allocate);
                allocate.putInt(this.b.size());
                writableByteChannel.write((ByteBuffer) allocate.rewind());
                c(writableByteChannel);
                break;
            default:
                super.getBox(writableByteChannel);
                break;
        }
    }

    @Override // b2, qy0
    public final long getSize() {
        switch (this.f) {
            case 1:
                long b = b();
                return 8 + b + (b + 16 >= 4294967296L ? 16 : 8);
            default:
                return super.getSize();
        }
    }
}
