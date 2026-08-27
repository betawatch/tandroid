package q2;

import java.nio.ByteBuffer;
import org.telegram.ui.Cells.pa;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class z extends a {
    public static final /* synthetic */ ae.b h;
    public static final /* synthetic */ ae.b n;
    public static final /* synthetic */ ae.b r;
    public int e;
    public int[] f;

    static {
        ae.a aVar = new ae.a(z.class, "VideoMediaHeaderBox.java");
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
        for (int i10 = 0; i10 < 3; i10++) {
            this.f[i10] = p2.b.h(byteBuffer);
        }
    }

    @Override // com.googlecode.mp4parser.c, com.googlecode.mp4parser.a
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        p2.b.p(this.e, byteBuffer);
        for (int i10 : this.f) {
            p2.b.p(i10, byteBuffer);
        }
    }

    @Override // com.googlecode.mp4parser.a
    public final long getContentSize() {
        return 12L;
    }

    public final String toString() {
        com.google.firebase.messaging.t b10 = ae.a.b(r, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("VideoMediaHeaderBox[graphicsmode=");
        pa.u(ae.a.b(h, this, this));
        sb2.append(this.e);
        sb2.append(";opcolor0=");
        ae.b bVar = n;
        pa.u(ae.a.b(bVar, this, this));
        sb2.append(this.f[0]);
        sb2.append(";opcolor1=");
        pa.u(ae.a.b(bVar, this, this));
        sb2.append(this.f[1]);
        sb2.append(";opcolor2=");
        pa.u(ae.a.b(bVar, this, this));
        return a9.p.k(this.f[2], "]", sb2);
    }
}
