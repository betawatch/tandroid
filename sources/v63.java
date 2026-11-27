// default package

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
