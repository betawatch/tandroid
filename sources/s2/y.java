package s2;

import androidx.biometric.f0;
import j7.m5;
import java.nio.ByteBuffer;
import java.util.Date;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class y extends com.googlecode.mp4parser.c {
    public static final /* synthetic */ f0 B;
    public static final /* synthetic */ f0 C;
    public static final /* synthetic */ f0 D;
    public static final /* synthetic */ f0 E;
    public static final /* synthetic */ f0 F;
    public static final /* synthetic */ f0 G;
    public static final /* synthetic */ f0 H;
    public static final /* synthetic */ f0 I;
    public static final /* synthetic */ f0 J;
    public static final /* synthetic */ f0 K;
    public static final /* synthetic */ f0 L;
    public static final /* synthetic */ f0 M;
    public static final /* synthetic */ f0 N;
    public static final /* synthetic */ f0 O;
    public static final /* synthetic */ f0 P;
    public static final /* synthetic */ f0 Q;
    public static final /* synthetic */ f0 R;
    public static final /* synthetic */ f0 S;
    public static final /* synthetic */ f0 T;
    public static final /* synthetic */ f0 U;
    public static final /* synthetic */ f0 V;
    public static final /* synthetic */ f0 W;
    public static final /* synthetic */ f0 X;
    public static final /* synthetic */ f0 Y;
    public Date e;
    public Date f;
    public long h;
    public long n;
    public int r;
    public int s;
    public float v;
    public cc.d w;
    public double x;
    public double y;

    static {
        de.a aVar = new de.a(y.class, "TrackHeaderBox.java");
        B = aVar.e(aVar.d("getCreationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "java.util.Date"));
        C = aVar.e(aVar.d("getModificationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "java.util.Date"));
        K = aVar.e(aVar.d("getContent", "com.coremedia.iso.boxes.TrackHeaderBox", "java.nio.ByteBuffer", "byteBuffer", "void"));
        L = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "java.lang.String"));
        M = aVar.e(aVar.d("setCreationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "java.util.Date", "creationTime", "void"));
        N = aVar.e(aVar.d("setModificationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "java.util.Date", "modificationTime", "void"));
        O = aVar.e(aVar.d("setTrackId", "com.coremedia.iso.boxes.TrackHeaderBox", "long", "trackId", "void"));
        P = aVar.e(aVar.d("setDuration", "com.coremedia.iso.boxes.TrackHeaderBox", "long", "duration", "void"));
        Q = aVar.e(aVar.d("setLayer", "com.coremedia.iso.boxes.TrackHeaderBox", "int", "layer", "void"));
        R = aVar.e(aVar.d("setAlternateGroup", "com.coremedia.iso.boxes.TrackHeaderBox", "int", "alternateGroup", "void"));
        S = aVar.e(aVar.d("setVolume", "com.coremedia.iso.boxes.TrackHeaderBox", "float", "volume", "void"));
        T = aVar.e(aVar.d("setMatrix", "com.coremedia.iso.boxes.TrackHeaderBox", "com.googlecode.mp4parser.util.Matrix", "matrix", "void"));
        D = aVar.e(aVar.d("getTrackId", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "long"));
        U = aVar.e(aVar.d("setWidth", "com.coremedia.iso.boxes.TrackHeaderBox", "double", "width", "void"));
        V = aVar.e(aVar.d("setHeight", "com.coremedia.iso.boxes.TrackHeaderBox", "double", "height", "void"));
        aVar.e(aVar.d("isEnabled", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "boolean"));
        aVar.e(aVar.d("isInMovie", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "boolean"));
        aVar.e(aVar.d("isInPreview", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "boolean"));
        aVar.e(aVar.d("isInPoster", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "boolean"));
        W = aVar.e(aVar.d("setEnabled", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "enabled", "void"));
        X = aVar.e(aVar.d("setInMovie", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inMovie", "void"));
        Y = aVar.e(aVar.d("setInPreview", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inPreview", "void"));
        aVar.e(aVar.d("setInPoster", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inPoster", "void"));
        E = aVar.e(aVar.d("getDuration", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "long"));
        F = aVar.e(aVar.d("getLayer", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "int"));
        G = aVar.e(aVar.d("getAlternateGroup", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "int"));
        H = aVar.e(aVar.d("getVolume", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "float"));
        aVar.e(aVar.d("getMatrix", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "com.googlecode.mp4parser.util.Matrix"));
        I = aVar.e(aVar.d("getWidth", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "double"));
        J = aVar.e(aVar.d("getHeight", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "double"));
    }

    @Override // com.googlecode.mp4parser.c, com.googlecode.mp4parser.a
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        if (e() == 1) {
            this.e = m5.b(r2.b.j(byteBuffer));
            this.f = m5.b(r2.b.j(byteBuffer));
            this.h = r2.b.i(byteBuffer);
            r2.b.i(byteBuffer);
            long j10 = byteBuffer.getLong();
            this.n = j10;
            if (j10 < -1) {
                throw new RuntimeException("The tracks duration is bigger than Long.MAX_VALUE");
            }
        } else {
            this.e = m5.b(r2.b.i(byteBuffer));
            this.f = m5.b(r2.b.i(byteBuffer));
            this.h = r2.b.i(byteBuffer);
            r2.b.i(byteBuffer);
            this.n = r2.b.i(byteBuffer);
        }
        r2.b.i(byteBuffer);
        r2.b.i(byteBuffer);
        this.r = r2.b.h(byteBuffer);
        this.s = r2.b.h(byteBuffer);
        this.v = r2.b.g(byteBuffer);
        r2.b.h(byteBuffer);
        this.w = cc.d.a(byteBuffer);
        this.x = r2.b.f(byteBuffer);
        this.y = r2.b.f(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.c, com.googlecode.mp4parser.a
    public final void getContent(ByteBuffer byteBuffer) {
        sf.f c3 = de.a.c(K, this, this, byteBuffer);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(c3);
        i(byteBuffer);
        if (e() == 1) {
            byteBuffer.putLong(m5.a(this.e));
            byteBuffer.putLong(m5.a(this.f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) 0);
            byteBuffer.putLong(this.n);
        } else {
            byteBuffer.putInt((int) m5.a(this.e));
            byteBuffer.putInt((int) m5.a(this.f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) 0);
            byteBuffer.putInt((int) this.n);
        }
        int i10 = (int) 0;
        byteBuffer.putInt(i10);
        byteBuffer.putInt(i10);
        r2.b.p(this.r, byteBuffer);
        r2.b.p(this.s, byteBuffer);
        r2.b.o(byteBuffer, this.v);
        r2.b.p(0, byteBuffer);
        this.w.b(byteBuffer);
        r2.b.n(byteBuffer, this.x);
        r2.b.n(byteBuffer, this.y);
    }

    @Override // com.googlecode.mp4parser.a
    public final long getContentSize() {
        return (e() == 1 ? 36L : 24L) + 60;
    }

    public final String toString() {
        sf.f b10 = de.a.b(L, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb = new StringBuilder("TrackHeaderBox[creationTime=");
        yh.x(de.a.b(B, this, this));
        sb.append(this.e);
        sb.append(";modificationTime=");
        yh.x(de.a.b(C, this, this));
        sb.append(this.f);
        sb.append(";trackId=");
        yh.x(de.a.b(D, this, this));
        sb.append(this.h);
        sb.append(";duration=");
        yh.x(de.a.b(E, this, this));
        sb.append(this.n);
        sb.append(";layer=");
        yh.x(de.a.b(F, this, this));
        sb.append(this.r);
        sb.append(";alternateGroup=");
        yh.x(de.a.b(G, this, this));
        sb.append(this.s);
        sb.append(";volume=");
        yh.x(de.a.b(H, this, this));
        sb.append(this.v);
        sb.append(";matrix=");
        sb.append(this.w);
        sb.append(";width=");
        yh.x(de.a.b(I, this, this));
        sb.append(this.x);
        sb.append(";height=");
        yh.x(de.a.b(J, this, this));
        sb.append(this.y);
        sb.append("]");
        return sb.toString();
    }
}
