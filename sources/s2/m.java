package s2;

import j7.l5;
import java.nio.ByteBuffer;
import java.util.Date;
import org.telegram.ui.ai;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class m extends com.googlecode.mp4parser.c {
    public static final /* synthetic */ bb.b F;
    public static final /* synthetic */ bb.b G;
    public static final /* synthetic */ bb.b H;
    public static final /* synthetic */ bb.b I;
    public static final /* synthetic */ bb.b J;
    public static final /* synthetic */ bb.b K;
    public static final /* synthetic */ bb.b L;
    public static final /* synthetic */ bb.b M;
    public static final /* synthetic */ bb.b N;
    public static final /* synthetic */ bb.b O;
    public static final /* synthetic */ bb.b P;
    public static final /* synthetic */ bb.b Q;
    public static final /* synthetic */ bb.b R;
    public static final /* synthetic */ bb.b S;
    public int B;
    public int C;
    public int D;
    public int E;
    public Date e;
    public Date f;
    public long h;
    public long n;
    public double r;
    public float s;
    public cc.d v;
    public long w;
    public int x;
    public int y;

    static {
        de.a aVar = new de.a(m.class, "MovieHeaderBox.java");
        F = aVar.e(aVar.d("getCreationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "java.util.Date"));
        G = aVar.e(aVar.d("getModificationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "java.util.Date"));
        O = aVar.e(aVar.d("setModificationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "java.util.Date", "modificationTime", "void"));
        P = aVar.e(aVar.d("setTimescale", "com.coremedia.iso.boxes.MovieHeaderBox", "long", "timescale", "void"));
        Q = aVar.e(aVar.d("setDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "long", "duration", "void"));
        aVar.e(aVar.d("setRate", "com.coremedia.iso.boxes.MovieHeaderBox", "double", "rate", "void"));
        aVar.e(aVar.d("setVolume", "com.coremedia.iso.boxes.MovieHeaderBox", "float", "volume", "void"));
        R = aVar.e(aVar.d("setMatrix", "com.coremedia.iso.boxes.MovieHeaderBox", "com.googlecode.mp4parser.util.Matrix", "matrix", "void"));
        S = aVar.e(aVar.d("setNextTrackId", "com.coremedia.iso.boxes.MovieHeaderBox", "long", "nextTrackId", "void"));
        aVar.e(aVar.d("getPreviewTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "int"));
        aVar.e(aVar.d("setPreviewTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "previewTime", "void"));
        aVar.e(aVar.d("getPreviewDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "int"));
        H = aVar.e(aVar.d("getTimescale", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "long"));
        aVar.e(aVar.d("setPreviewDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "previewDuration", "void"));
        aVar.e(aVar.d("getPosterTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "int"));
        aVar.e(aVar.d("setPosterTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "posterTime", "void"));
        aVar.e(aVar.d("getSelectionTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "int"));
        aVar.e(aVar.d("setSelectionTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "selectionTime", "void"));
        aVar.e(aVar.d("getSelectionDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "int"));
        aVar.e(aVar.d("setSelectionDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "selectionDuration", "void"));
        aVar.e(aVar.d("getCurrentTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "int"));
        aVar.e(aVar.d("setCurrentTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "currentTime", "void"));
        I = aVar.e(aVar.d("getDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "long"));
        J = aVar.e(aVar.d("getRate", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "double"));
        K = aVar.e(aVar.d("getVolume", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "float"));
        aVar.e(aVar.d("getMatrix", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "com.googlecode.mp4parser.util.Matrix"));
        L = aVar.e(aVar.d("getNextTrackId", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "long"));
        M = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "java.lang.String"));
        N = aVar.e(aVar.d("setCreationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "java.util.Date", "creationTime", "void"));
    }

    @Override // com.googlecode.mp4parser.c, com.googlecode.mp4parser.a
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        if (e() == 1) {
            this.e = l5.b(r2.b.j(byteBuffer));
            this.f = l5.b(r2.b.j(byteBuffer));
            this.h = r2.b.i(byteBuffer);
            this.n = r2.b.j(byteBuffer);
        } else {
            this.e = l5.b(r2.b.i(byteBuffer));
            this.f = l5.b(r2.b.i(byteBuffer));
            this.h = r2.b.i(byteBuffer);
            this.n = r2.b.i(byteBuffer);
        }
        this.r = r2.b.f(byteBuffer);
        this.s = r2.b.g(byteBuffer);
        r2.b.h(byteBuffer);
        r2.b.i(byteBuffer);
        r2.b.i(byteBuffer);
        this.v = cc.d.a(byteBuffer);
        this.x = byteBuffer.getInt();
        this.y = byteBuffer.getInt();
        this.B = byteBuffer.getInt();
        this.C = byteBuffer.getInt();
        this.D = byteBuffer.getInt();
        this.E = byteBuffer.getInt();
        this.w = r2.b.i(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.c, com.googlecode.mp4parser.a
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        if (e() == 1) {
            byteBuffer.putLong(l5.a(this.e));
            byteBuffer.putLong(l5.a(this.f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putLong(this.n);
        } else {
            byteBuffer.putInt((int) l5.a(this.e));
            byteBuffer.putInt((int) l5.a(this.f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) this.n);
        }
        r2.b.n(byteBuffer, this.r);
        r2.b.o(byteBuffer, this.s);
        r2.b.p(0, byteBuffer);
        int i10 = (int) 0;
        byteBuffer.putInt(i10);
        byteBuffer.putInt(i10);
        this.v.b(byteBuffer);
        byteBuffer.putInt(this.x);
        byteBuffer.putInt(this.y);
        byteBuffer.putInt(this.B);
        byteBuffer.putInt(this.C);
        byteBuffer.putInt(this.D);
        byteBuffer.putInt(this.E);
        byteBuffer.putInt((int) this.w);
    }

    @Override // com.googlecode.mp4parser.a
    public final long getContentSize() {
        return (e() == 1 ? 32L : 20L) + 80;
    }

    public final String toString() {
        rf.f b10 = de.a.b(M, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb = new StringBuilder("MovieHeaderBox[creationTime=");
        ai.x(de.a.b(F, this, this));
        sb.append(this.e);
        sb.append(";modificationTime=");
        ai.x(de.a.b(G, this, this));
        sb.append(this.f);
        sb.append(";timescale=");
        ai.x(de.a.b(H, this, this));
        sb.append(this.h);
        sb.append(";duration=");
        ai.x(de.a.b(I, this, this));
        sb.append(this.n);
        sb.append(";rate=");
        ai.x(de.a.b(J, this, this));
        sb.append(this.r);
        sb.append(";volume=");
        ai.x(de.a.b(K, this, this));
        sb.append(this.s);
        sb.append(";matrix=");
        sb.append(this.v);
        sb.append(";nextTrackId=");
        ai.x(de.a.b(L, this, this));
        return android.support.v4.media.a.q(sb, this.w, "]");
    }
}
