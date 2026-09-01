package s2;

import androidx.biometric.f0;
import j7.m5;
import java.nio.ByteBuffer;
import java.util.Date;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class k extends com.googlecode.mp4parser.c {
    public static final /* synthetic */ f0 B;
    public static final /* synthetic */ f0 C;
    public static final /* synthetic */ f0 D;
    public static final /* synthetic */ f0 E;
    public static final /* synthetic */ f0 F;
    public static final /* synthetic */ f0 s;
    public static final /* synthetic */ f0 v;
    public static final /* synthetic */ f0 w;
    public static final /* synthetic */ f0 x;
    public static final /* synthetic */ f0 y;
    public Date e;
    public Date f;
    public long h;
    public long n;
    public String r;

    static {
        de.a aVar = new de.a(k.class, "MediaHeaderBox.java");
        s = aVar.e(aVar.d("getCreationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.util.Date"));
        v = aVar.e(aVar.d("getModificationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.util.Date"));
        F = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.lang.String"));
        w = aVar.e(aVar.d("getTimescale", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "long"));
        x = aVar.e(aVar.d("getDuration", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "long"));
        y = aVar.e(aVar.d("getLanguage", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.lang.String"));
        B = aVar.e(aVar.d("setCreationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "java.util.Date", "creationTime", "void"));
        aVar.e(aVar.d("setModificationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "java.util.Date", "modificationTime", "void"));
        C = aVar.e(aVar.d("setTimescale", "com.coremedia.iso.boxes.MediaHeaderBox", "long", "timescale", "void"));
        D = aVar.e(aVar.d("setDuration", "com.coremedia.iso.boxes.MediaHeaderBox", "long", "duration", "void"));
        E = aVar.e(aVar.d("setLanguage", "com.coremedia.iso.boxes.MediaHeaderBox", "java.lang.String", "language", "void"));
    }

    @Override // com.googlecode.mp4parser.c, com.googlecode.mp4parser.a
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        if (e() == 1) {
            this.e = m5.b(r2.b.j(byteBuffer));
            this.f = m5.b(r2.b.j(byteBuffer));
            this.h = r2.b.i(byteBuffer);
            this.n = r2.b.j(byteBuffer);
        } else {
            this.e = m5.b(r2.b.i(byteBuffer));
            this.f = m5.b(r2.b.i(byteBuffer));
            this.h = r2.b.i(byteBuffer);
            this.n = r2.b.i(byteBuffer);
        }
        int h = r2.b.h(byteBuffer);
        StringBuilder sb = new StringBuilder();
        for (int i10 = 0; i10 < 3; i10++) {
            sb.append((char) (((h >> ((2 - i10) * 5)) & 31) + 96));
        }
        this.r = sb.toString();
        r2.b.h(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.c, com.googlecode.mp4parser.a
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        if (e() == 1) {
            byteBuffer.putLong(m5.a(this.e));
            byteBuffer.putLong(m5.a(this.f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putLong(this.n);
        } else {
            byteBuffer.putInt((int) m5.a(this.e));
            byteBuffer.putInt((int) m5.a(this.f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) this.n);
        }
        String str = this.r;
        if (str.getBytes().length != 3) {
            throw new IllegalArgumentException(android.support.v4.media.a.o("\"", str, "\" language string isn't exactly 3 characters long!"));
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
        sf.e b10 = de.a.b(F, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb = new StringBuilder("MediaHeaderBox[creationTime=");
        yh.x(de.a.b(s, this, this));
        sb.append(this.e);
        sb.append(";modificationTime=");
        yh.x(de.a.b(v, this, this));
        sb.append(this.f);
        sb.append(";timescale=");
        yh.x(de.a.b(w, this, this));
        sb.append(this.h);
        sb.append(";duration=");
        yh.x(de.a.b(x, this, this));
        sb.append(this.n);
        sb.append(";language=");
        yh.x(de.a.b(y, this, this));
        return android.support.v4.media.a.r(sb, this.r, "]");
    }
}
