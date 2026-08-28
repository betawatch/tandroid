package q2;

import java.nio.ByteBuffer;
import org.telegram.ui.Cells.j2;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class s extends a {
    public static final /* synthetic */ zd.b f;
    public static final /* synthetic */ zd.b h;
    public float e;

    static {
        zd.a aVar = new zd.a(s.class, "SoundMediaHeaderBox.java");
        f = aVar.e(aVar.d("getBalance", "com.coremedia.iso.boxes.SoundMediaHeaderBox", "", "", "float"));
        h = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.SoundMediaHeaderBox", "", "", "java.lang.String"));
    }

    @Override // com.googlecode.mp4parser.c, com.googlecode.mp4parser.a
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        this.e = p2.b.g(byteBuffer);
        p2.b.h(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.c, com.googlecode.mp4parser.a
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        p2.b.o(byteBuffer, this.e);
        p2.b.p(0, byteBuffer);
    }

    @Override // com.googlecode.mp4parser.a
    public final long getContentSize() {
        return 8L;
    }

    public final String toString() {
        com.google.firebase.messaging.t b10 = zd.a.b(h, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("SoundMediaHeaderBox[balance=");
        j2.t(zd.a.b(f, this, this));
        sb2.append(this.e);
        sb2.append("]");
        return sb2.toString();
    }
}
