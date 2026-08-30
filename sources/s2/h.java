package s2;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class h extends com.googlecode.mp4parser.b {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(String str, int i10) {
        super(str);
        this.f = i10;
    }

    @Override // com.googlecode.mp4parser.b, s2.b
    public void getBox(WritableByteChannel writableByteChannel) {
        switch (this.f) {
            case 1:
                writableByteChannel.write(d());
                ByteBuffer allocate = ByteBuffer.allocate(8);
                r2.b.r(0, allocate);
                r2.b.q(0, allocate);
                allocate.putInt(this.b.size());
                writableByteChannel.write((ByteBuffer) allocate.rewind());
                c(writableByteChannel);
                break;
            default:
                super.getBox(writableByteChannel);
                break;
        }
    }

    @Override // com.googlecode.mp4parser.b, s2.b
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
