package pc;

import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class b implements ByteChannel {
    public ByteBuffer a;

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        ByteBuffer byteBuffer2 = this.a;
        if (byteBuffer2.remaining() <= 0) {
            return -1;
        }
        byteBuffer.put((ByteBuffer) byteBuffer2.duplicate().limit(byteBuffer.remaining() + byteBuffer2.position()));
        byteBuffer2.position(byteBuffer2.position() + remaining);
        return remaining;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        this.a.put(byteBuffer);
        return remaining;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
