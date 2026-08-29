package s2;

import java.nio.ByteBuffer;
import java.util.Date;
import org.telegram.ui.th;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class k extends com.googlecode.mp4parser.c {
    public static final /* synthetic */ m5.i A;
    public static final /* synthetic */ m5.i B;
    public static final /* synthetic */ m5.i C;
    public static final /* synthetic */ m5.i D;
    public static final /* synthetic */ m5.i E;
    public static final /* synthetic */ m5.i s;
    public static final /* synthetic */ m5.i v;
    public static final /* synthetic */ m5.i w;
    public static final /* synthetic */ m5.i x;
    public static final /* synthetic */ m5.i y;
    public Date e;
    public Date f;
    public long h;
    public long n;
    public String r;

    static {
        be.a aVar = new be.a(k.class, "MediaHeaderBox.java");
        s = aVar.e(aVar.d("getCreationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.util.Date"));
        v = aVar.e(aVar.d("getModificationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.util.Date"));
        E = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.lang.String"));
        w = aVar.e(aVar.d("getTimescale", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "long"));
        x = aVar.e(aVar.d("getDuration", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "long"));
        y = aVar.e(aVar.d("getLanguage", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.lang.String"));
        A = aVar.e(aVar.d("setCreationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "java.util.Date", "creationTime", "void"));
        aVar.e(aVar.d("setModificationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "java.util.Date", "modificationTime", "void"));
        B = aVar.e(aVar.d("setTimescale", "com.coremedia.iso.boxes.MediaHeaderBox", "long", "timescale", "void"));
        C = aVar.e(aVar.d("setDuration", "com.coremedia.iso.boxes.MediaHeaderBox", "long", "duration", "void"));
        D = aVar.e(aVar.d("setLanguage", "com.coremedia.iso.boxes.MediaHeaderBox", "java.lang.String", "language", "void"));
    }

    @Override // com.googlecode.mp4parser.c, com.googlecode.mp4parser.a
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        if (e() == 1) {
            this.e = h7.p.b(r2.b.j(byteBuffer));
            this.f = h7.p.b(r2.b.j(byteBuffer));
            this.h = r2.b.i(byteBuffer);
            this.n = r2.b.j(byteBuffer);
        } else {
            this.e = h7.p.b(r2.b.i(byteBuffer));
            this.f = h7.p.b(r2.b.i(byteBuffer));
            this.h = r2.b.i(byteBuffer);
            this.n = r2.b.i(byteBuffer);
        }
        int h = r2.b.h(byteBuffer);
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < 3; i10++) {
            sb2.append((char) (((h >> ((2 - i10) * 5)) & 31) + 96));
        }
        this.r = sb2.toString();
        r2.b.h(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.c, com.googlecode.mp4parser.a
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        if (e() == 1) {
            byteBuffer.putLong(h7.p.a(this.e));
            byteBuffer.putLong(h7.p.a(this.f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putLong(this.n);
        } else {
            byteBuffer.putInt((int) h7.p.a(this.e));
            byteBuffer.putInt((int) h7.p.a(this.f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) this.n);
        }
        String str = this.r;
        if (str.getBytes().length != 3) {
            throw new IllegalArgumentException(a4.w.n("\"", str, "\" language string isn't exactly 3 characters long!"));
        }
        int i10 = 0;
        for (int i11 = 0; i11 < 3; i11++) {
            i10 += (str.getBytes()[i11] - 96) << ((2 - i11) * 5);
        }
        r2.b.p(i10, byteBuffer);
        r2.b.p(0, byteBuffer);
    }

    @Override // com.googlecode.mp4parser.a
    public final long getContentSize() {
        return (e() == 1 ? 32L : 20L) + 4;
    }

    public final String toString() {
        com.google.firebase.messaging.s b10 = be.a.b(E, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("MediaHeaderBox[creationTime=");
        th.u(be.a.b(s, this, this));
        sb2.append(this.e);
        sb2.append(";modificationTime=");
        th.u(be.a.b(v, this, this));
        sb2.append(this.f);
        sb2.append(";timescale=");
        th.u(be.a.b(w, this, this));
        sb2.append(this.h);
        sb2.append(";duration=");
        th.u(be.a.b(x, this, this));
        sb2.append(this.n);
        sb2.append(";language=");
        th.u(be.a.b(y, this, this));
        return a4.w.q(sb2, this.r, "]");
    }
}
