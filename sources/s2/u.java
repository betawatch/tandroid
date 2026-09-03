package s2;

import androidx.biometric.f0;
import j7.l5;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class u extends com.googlecode.mp4parser.c {
    public static final /* synthetic */ f0 f;
    public static final /* synthetic */ f0 h;
    public long[] e;

    static {
        de.a aVar = new de.a(u.class, "SyncSampleBox.java");
        aVar.e(aVar.d("getSampleNumber", "com.coremedia.iso.boxes.SyncSampleBox", "", "", "[J"));
        f = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.SyncSampleBox", "", "", "java.lang.String"));
        h = aVar.e(aVar.d("setSampleNumber", "com.coremedia.iso.boxes.SyncSampleBox", "[J", "sampleNumber", "void"));
    }

    @Override // com.googlecode.mp4parser.c, com.googlecode.mp4parser.a
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a2 = l5.a(r2.b.i(byteBuffer));
        this.e = new long[a2];
        for (int i10 = 0; i10 < a2; i10++) {
            this.e[i10] = r2.b.i(byteBuffer);
        }
    }

    @Override // com.googlecode.mp4parser.c, com.googlecode.mp4parser.a
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.e.length);
        for (long j10 : this.e) {
            byteBuffer.putInt((int) j10);
        }
    }

    @Override // com.googlecode.mp4parser.a
    public final long getContentSize() {
        return (this.e.length * 4) + 8;
    }

    public final String toString() {
        sf.f b10 = de.a.b(f, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        return android.support.v4.media.a.m(this.e.length, "]", new StringBuilder("SyncSampleBox[entryCount="));
    }
}
