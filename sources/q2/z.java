package q2;

import java.nio.ByteBuffer;
import org.telegram.ui.Cells.j2;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class z extends a {
    public static final /* synthetic */ zd.b h;
    public static final /* synthetic */ zd.b n;
    public static final /* synthetic */ zd.b r;
    public int e;
    public int[] f;

    static {
        zd.a aVar = new zd.a(z.class, "VideoMediaHeaderBox.java");
        h = aVar.e(aVar.d("getGraphicsmode", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "int"));
        n = aVar.e(aVar.d("getOpcolor", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "[I"));
        r = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("setOpcolor", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "[I", "opcolor", "void"));
        aVar.e(aVar.d("setGraphicsmode", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "int", "graphicsmode", "void"));
    }

    @Override // com.googlecode.mp4parser.c, com.googlecode.mp4parser.a
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        this.e = p2.b.h(byteBuffer);
        this.f = new int[3];
        for (int i9 = 0; i9 < 3; i9++) {
            this.f[i9] = p2.b.h(byteBuffer);
        }
    }

    @Override // com.googlecode.mp4parser.c, com.googlecode.mp4parser.a
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        p2.b.p(this.e, byteBuffer);
        for (int i9 : this.f) {
            p2.b.p(i9, byteBuffer);
        }
    }

    @Override // com.googlecode.mp4parser.a
    public final long getContentSize() {
        return 12L;
    }

    public final String toString() {
        com.google.firebase.messaging.t b10 = zd.a.b(r, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("VideoMediaHeaderBox[graphicsmode=");
        j2.t(zd.a.b(h, this, this));
        sb2.append(this.e);
        sb2.append(";opcolor0=");
        zd.b bVar = n;
        j2.t(zd.a.b(bVar, this, this));
        sb2.append(this.f[0]);
        sb2.append(";opcolor1=");
        j2.t(zd.a.b(bVar, this, this));
        sb2.append(this.f[1]);
        sb2.append(";opcolor2=");
        j2.t(zd.a.b(bVar, this, this));
        return aa.d.l(this.f[2], "]", sb2);
    }
}
