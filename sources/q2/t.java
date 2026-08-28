package q2;

import g7.u8;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class t extends c {
    public static final /* synthetic */ zd.b h;
    public static final /* synthetic */ zd.b n;
    public long[] f;

    static {
        zd.a aVar = new zd.a(t.class, "StaticChunkOffsetBox.java");
        h = aVar.e(aVar.d("getChunkOffsets", "com.coremedia.iso.boxes.StaticChunkOffsetBox", "", "", "[J"));
        n = aVar.e(aVar.d("setChunkOffsets", "com.coremedia.iso.boxes.StaticChunkOffsetBox", "[J", "chunkOffsets", "void"));
    }

    @Override // com.googlecode.mp4parser.c, com.googlecode.mp4parser.a
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a2 = u8.a(p2.b.i(byteBuffer));
        this.f = new long[a2];
        for (int i9 = 0; i9 < a2; i9++) {
            this.f[i9] = p2.b.i(byteBuffer);
        }
    }

    @Override // com.googlecode.mp4parser.c, com.googlecode.mp4parser.a
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.f.length);
        for (long j10 : this.f) {
            byteBuffer.putInt((int) j10);
        }
    }

    @Override // com.googlecode.mp4parser.a
    public final long getContentSize() {
        return (this.f.length * 4) + 8;
    }
}
