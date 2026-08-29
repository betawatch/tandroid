package s2;

import java.nio.ByteBuffer;
import org.telegram.ui.th;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class z extends a {
    public static final /* synthetic */ m5.i h;
    public static final /* synthetic */ m5.i n;
    public static final /* synthetic */ m5.i r;
    public int e;
    public int[] f;

    static {
        be.a aVar = new be.a(z.class, "VideoMediaHeaderBox.java");
        h = aVar.e(aVar.d("getGraphicsmode", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "int"));
        n = aVar.e(aVar.d("getOpcolor", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "[I"));
        r = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("setOpcolor", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "[I", "opcolor", "void"));
        aVar.e(aVar.d("setGraphicsmode", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "int", "graphicsmode", "void"));
    }

    @Override // com.googlecode.mp4parser.c, com.googlecode.mp4parser.a
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        this.e = r2.b.h(byteBuffer);
        this.f = new int[3];
        for (int i10 = 0; i10 < 3; i10++) {
            this.f[i10] = r2.b.h(byteBuffer);
        }
    }

    @Override // com.googlecode.mp4parser.c, com.googlecode.mp4parser.a
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        r2.b.p(this.e, byteBuffer);
        for (int i10 : this.f) {
            r2.b.p(i10, byteBuffer);
        }
    }

    @Override // com.googlecode.mp4parser.a
    public final long getContentSize() {
        return 12L;
    }

    public final String toString() {
        com.google.firebase.messaging.s b10 = be.a.b(r, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("VideoMediaHeaderBox[graphicsmode=");
        th.u(be.a.b(h, this, this));
        sb2.append(this.e);
        sb2.append(";opcolor0=");
        m5.i iVar = n;
        th.u(be.a.b(iVar, this, this));
        sb2.append(this.f[0]);
        sb2.append(";opcolor1=");
        th.u(be.a.b(iVar, this, this));
        sb2.append(this.f[1]);
        sb2.append(";opcolor2=");
        th.u(be.a.b(iVar, this, this));
        return a4.w.l(this.f[2], "]", sb2);
    }
}
