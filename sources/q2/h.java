package q2;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class h extends com.googlecode.mp4parser.b {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(String str, int i10) {
        super(str);
        this.f = i10;
    }

    @Override // com.googlecode.mp4parser.b, q2.b
    public void getBox(WritableByteChannel writableByteChannel) {
        switch (this.f) {
            case 1:
                writableByteChannel.write(d());
                ByteBuffer allocate = ByteBuffer.allocate(8);
                p2.b.r(0, allocate);
                p2.b.q(0, allocate);
                allocate.putInt(this.b.size());
                writableByteChannel.write((ByteBuffer) allocate.rewind());
                c(writableByteChannel);
                break;
            default:
                super.getBox(writableByteChannel);
                break;
        }
    }

    @Override // com.googlecode.mp4parser.b, q2.b
    public long getSize() {
        switch (this.f) {
            case 1:
                long b10 = b();
                return 8 + b10 + (b10 + 16 >= 4294967296L ? 16 : 8);
            default:
                return super.getSize();
        }
    }
}
