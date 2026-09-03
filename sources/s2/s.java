package s2;

import androidx.biometric.f0;
import java.nio.ByteBuffer;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class s extends a {
    public static final /* synthetic */ f0 f;
    public static final /* synthetic */ f0 h;
    public float e;

    static {
        de.a aVar = new de.a(s.class, "SoundMediaHeaderBox.java");
        f = aVar.e(aVar.d("getBalance", "com.coremedia.iso.boxes.SoundMediaHeaderBox", "", "", "float"));
        h = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.SoundMediaHeaderBox", "", "", "java.lang.String"));
    }

    @Override // com.googlecode.mp4parser.c, com.googlecode.mp4parser.a
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        this.e = r2.b.g(byteBuffer);
        r2.b.h(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.c, com.googlecode.mp4parser.a
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        r2.b.o(byteBuffer, this.e);
        r2.b.p(0, byteBuffer);
    }

    @Override // com.googlecode.mp4parser.a
    public final long getContentSize() {
        return 8L;
    }

    public final String toString() {
        sf.f b10 = de.a.b(h, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb = new StringBuilder("SoundMediaHeaderBox[balance=");
        yh.x(de.a.b(f, this, this));
        sb.append(this.e);
        sb.append("]");
        return sb.toString();
    }
}
