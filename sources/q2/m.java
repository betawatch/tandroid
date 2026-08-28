package q2;

import g7.v8;
import java.nio.ByteBuffer;
import java.util.Date;
import org.telegram.ui.Cells.j2;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class m extends com.googlecode.mp4parser.c {
    public static final /* synthetic */ zd.b E;
    public static final /* synthetic */ zd.b F;
    public static final /* synthetic */ zd.b G;
    public static final /* synthetic */ zd.b H;
    public static final /* synthetic */ zd.b I;
    public static final /* synthetic */ zd.b J;
    public static final /* synthetic */ zd.b K;
    public static final /* synthetic */ zd.b L;
    public static final /* synthetic */ zd.b M;
    public static final /* synthetic */ zd.b N;
    public static final /* synthetic */ zd.b O;
    public static final /* synthetic */ zd.b P;
    public static final /* synthetic */ zd.b Q;
    public static final /* synthetic */ zd.b R;
    public int A;
    public int B;
    public int C;
    public int D;
    public Date e;
    public Date f;
    public long h;
    public long n;
    public double r;
    public float s;
    public yb.d v;
    public long w;
    public int x;
    public int y;

    static {
        zd.a aVar = new zd.a(m.class, "MovieHeaderBox.java");
        E = aVar.e(aVar.d("getCreationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "java.util.Date"));
        F = aVar.e(aVar.d("getModificationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "java.util.Date"));
        N = aVar.e(aVar.d("setModificationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "java.util.Date", "modificationTime", "void"));
        O = aVar.e(aVar.d("setTimescale", "com.coremedia.iso.boxes.MovieHeaderBox", "long", "timescale", "void"));
        P = aVar.e(aVar.d("setDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "long", "duration", "void"));
        aVar.e(aVar.d("setRate", "com.coremedia.iso.boxes.MovieHeaderBox", "double", "rate", "void"));
        aVar.e(aVar.d("setVolume", "com.coremedia.iso.boxes.MovieHeaderBox", "float", "volume", "void"));
        Q = aVar.e(aVar.d("setMatrix", "com.coremedia.iso.boxes.MovieHeaderBox", "com.googlecode.mp4parser.util.Matrix", "matrix", "void"));
        R = aVar.e(aVar.d("setNextTrackId", "com.coremedia.iso.boxes.MovieHeaderBox", "long", "nextTrackId", "void"));
        aVar.e(aVar.d("getPreviewTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "int"));
        aVar.e(aVar.d("setPreviewTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "previewTime", "void"));
        aVar.e(aVar.d("getPreviewDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "int"));
        G = aVar.e(aVar.d("getTimescale", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "long"));
        aVar.e(aVar.d("setPreviewDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "previewDuration", "void"));
        aVar.e(aVar.d("getPosterTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "int"));
        aVar.e(aVar.d("setPosterTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "posterTime", "void"));
        aVar.e(aVar.d("getSelectionTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "int"));
        aVar.e(aVar.d("setSelectionTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "selectionTime", "void"));
        aVar.e(aVar.d("getSelectionDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "int"));
        aVar.e(aVar.d("setSelectionDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "selectionDuration", "void"));
        aVar.e(aVar.d("getCurrentTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "int"));
        aVar.e(aVar.d("setCurrentTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "currentTime", "void"));
        H = aVar.e(aVar.d("getDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "long"));
        I = aVar.e(aVar.d("getRate", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "double"));
        J = aVar.e(aVar.d("getVolume", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "float"));
        aVar.e(aVar.d("getMatrix", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "com.googlecode.mp4parser.util.Matrix"));
        K = aVar.e(aVar.d("getNextTrackId", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "long"));
        L = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "java.lang.String"));
        M = aVar.e(aVar.d("setCreationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "java.util.Date", "creationTime", "void"));
    }

    @Override // com.googlecode.mp4parser.c, com.googlecode.mp4parser.a
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        if (e() == 1) {
            this.e = v8.b(p2.b.j(byteBuffer));
            this.f = v8.b(p2.b.j(byteBuffer));
            this.h = p2.b.i(byteBuffer);
            this.n = p2.b.j(byteBuffer);
        } else {
            this.e = v8.b(p2.b.i(byteBuffer));
            this.f = v8.b(p2.b.i(byteBuffer));
            this.h = p2.b.i(byteBuffer);
            this.n = p2.b.i(byteBuffer);
        }
        this.r = p2.b.f(byteBuffer);
        this.s = p2.b.g(byteBuffer);
        p2.b.h(byteBuffer);
        p2.b.i(byteBuffer);
        p2.b.i(byteBuffer);
        this.v = yb.d.a(byteBuffer);
        this.x = byteBuffer.getInt();
        this.y = byteBuffer.getInt();
        this.A = byteBuffer.getInt();
        this.B = byteBuffer.getInt();
        this.C = byteBuffer.getInt();
        this.D = byteBuffer.getInt();
        this.w = p2.b.i(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.c, com.googlecode.mp4parser.a
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        if (e() == 1) {
            byteBuffer.putLong(v8.a(this.e));
            byteBuffer.putLong(v8.a(this.f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putLong(this.n);
        } else {
            byteBuffer.putInt((int) v8.a(this.e));
            byteBuffer.putInt((int) v8.a(this.f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) this.n);
        }
        p2.b.n(byteBuffer, this.r);
        p2.b.o(byteBuffer, this.s);
        p2.b.p(0, byteBuffer);
        int i9 = (int) 0;
        byteBuffer.putInt(i9);
        byteBuffer.putInt(i9);
        this.v.b(byteBuffer);
        byteBuffer.putInt(this.x);
        byteBuffer.putInt(this.y);
        byteBuffer.putInt(this.A);
        byteBuffer.putInt(this.B);
        byteBuffer.putInt(this.C);
        byteBuffer.putInt(this.D);
        byteBuffer.putInt((int) this.w);
    }

    @Override // com.googlecode.mp4parser.a
    public final long getContentSize() {
        return (e() == 1 ? 32L : 20L) + 80;
    }

    public final String toString() {
        com.google.firebase.messaging.t b10 = zd.a.b(L, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("MovieHeaderBox[creationTime=");
        j2.t(zd.a.b(E, this, this));
        sb2.append(this.e);
        sb2.append(";modificationTime=");
        j2.t(zd.a.b(F, this, this));
        sb2.append(this.f);
        sb2.append(";timescale=");
        j2.t(zd.a.b(G, this, this));
        sb2.append(this.h);
        sb2.append(";duration=");
        j2.t(zd.a.b(H, this, this));
        sb2.append(this.n);
        sb2.append(";rate=");
        j2.t(zd.a.b(I, this, this));
        sb2.append(this.r);
        sb2.append(";volume=");
        j2.t(zd.a.b(J, this, this));
        sb2.append(this.s);
        sb2.append(";matrix=");
        sb2.append(this.v);
        sb2.append(";nextTrackId=");
        j2.t(zd.a.b(K, this, this));
        return aa.d.q(sb2, this.w, "]");
    }
}
