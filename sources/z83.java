// default package

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class z83 extends n01 {
    public fm4 a;
    public final o33 b = new o33();
    public ByteBuffer c;
    public boolean d;
    public long e;
    public ByteBuffer f;
    public final byte h;
    public final int n;

    static {
        cr6.a("media3.decoder");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public z83(int i, int i2) {
        this.h = i;
        this.n = i2;
    }

    public final ByteBuffer a(int i) {
        byte b = this.h;
        if (b == 1) {
            return ByteBuffer.allocate(i);
        }
        if (b == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.c;
        throw new y83("Buffer too small (" + (byteBuffer == null ? 0 : byteBuffer.capacity()) + " < " + i + ")");
    }

    public final void c(int i) {
        int i2 = i + this.n;
        ByteBuffer byteBuffer = this.c;
        if (byteBuffer == null) {
            this.c = a(i2);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i3 = i2 + position;
        if (capacity >= i3) {
            this.c = byteBuffer;
            return;
        }
        ByteBuffer a = a(i3);
        a.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            a.put(byteBuffer);
        }
        this.c = a;
    }

    @Override // n01
    public void clear() {
        super.clear();
        ByteBuffer byteBuffer = this.c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.d = false;
    }

    public final void d() {
        ByteBuffer byteBuffer = this.c;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
