package q2;

import h7.x8;
import java.nio.ByteBuffer;
import java.util.Date;
import org.telegram.ui.Cells.pa;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class y extends com.googlecode.mp4parser.c {
    public static final /* synthetic */ ae.b A;
    public static final /* synthetic */ ae.b B;
    public static final /* synthetic */ ae.b C;
    public static final /* synthetic */ ae.b D;
    public static final /* synthetic */ ae.b E;
    public static final /* synthetic */ ae.b F;
    public static final /* synthetic */ ae.b G;
    public static final /* synthetic */ ae.b H;
    public static final /* synthetic */ ae.b I;
    public static final /* synthetic */ ae.b J;
    public static final /* synthetic */ ae.b K;
    public static final /* synthetic */ ae.b L;
    public static final /* synthetic */ ae.b M;
    public static final /* synthetic */ ae.b N;
    public static final /* synthetic */ ae.b O;
    public static final /* synthetic */ ae.b P;
    public static final /* synthetic */ ae.b Q;
    public static final /* synthetic */ ae.b R;
    public static final /* synthetic */ ae.b S;
    public static final /* synthetic */ ae.b T;
    public static final /* synthetic */ ae.b U;
    public static final /* synthetic */ ae.b V;
    public static final /* synthetic */ ae.b W;
    public static final /* synthetic */ ae.b X;
    public Date e;
    public Date f;
    public long h;
    public long n;
    public int r;
    public int s;
    public float v;
    public zb.d w;
    public double x;
    public double y;

    static {
        ae.a aVar = new ae.a(y.class, "TrackHeaderBox.java");
        A = aVar.e(aVar.d("getCreationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "java.util.Date"));
        B = aVar.e(aVar.d("getModificationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "java.util.Date"));
        J = aVar.e(aVar.d("getContent", "com.coremedia.iso.boxes.TrackHeaderBox", "java.nio.ByteBuffer", "byteBuffer", "void"));
        K = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "java.lang.String"));
        L = aVar.e(aVar.d("setCreationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "java.util.Date", "creationTime", "void"));
        M = aVar.e(aVar.d("setModificationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "java.util.Date", "modificationTime", "void"));
        N = aVar.e(aVar.d("setTrackId", "com.coremedia.iso.boxes.TrackHeaderBox", "long", "trackId", "void"));
        O = aVar.e(aVar.d("setDuration", "com.coremedia.iso.boxes.TrackHeaderBox", "long", "duration", "void"));
        P = aVar.e(aVar.d("setLayer", "com.coremedia.iso.boxes.TrackHeaderBox", "int", "layer", "void"));
        Q = aVar.e(aVar.d("setAlternateGroup", "com.coremedia.iso.boxes.TrackHeaderBox", "int", "alternateGroup", "void"));
        R = aVar.e(aVar.d("setVolume", "com.coremedia.iso.boxes.TrackHeaderBox", "float", "volume", "void"));
        S = aVar.e(aVar.d("setMatrix", "com.coremedia.iso.boxes.TrackHeaderBox", "com.googlecode.mp4parser.util.Matrix", "matrix", "void"));
        C = aVar.e(aVar.d("getTrackId", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "long"));
        T = aVar.e(aVar.d("setWidth", "com.coremedia.iso.boxes.TrackHeaderBox", "double", "width", "void"));
        U = aVar.e(aVar.d("setHeight", "com.coremedia.iso.boxes.TrackHeaderBox", "double", "height", "void"));
        aVar.e(aVar.d("isEnabled", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "boolean"));
        aVar.e(aVar.d("isInMovie", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "boolean"));
        aVar.e(aVar.d("isInPreview", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "boolean"));
        aVar.e(aVar.d("isInPoster", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "boolean"));
        V = aVar.e(aVar.d("setEnabled", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "enabled", "void"));
        W = aVar.e(aVar.d("setInMovie", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inMovie", "void"));
        X = aVar.e(aVar.d("setInPreview", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inPreview", "void"));
        aVar.e(aVar.d("setInPoster", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inPoster", "void"));
        D = aVar.e(aVar.d("getDuration", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "long"));
        E = aVar.e(aVar.d("getLayer", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "int"));
        F = aVar.e(aVar.d("getAlternateGroup", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "int"));
        G = aVar.e(aVar.d("getVolume", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "float"));
        aVar.e(aVar.d("getMatrix", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "com.googlecode.mp4parser.util.Matrix"));
        H = aVar.e(aVar.d("getWidth", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "double"));
        I = aVar.e(aVar.d("getHeight", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "double"));
    }

    @Override // com.googlecode.mp4parser.c, com.googlecode.mp4parser.a
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        if (e() == 1) {
            this.e = x8.b(p2.b.j(byteBuffer));
            this.f = x8.b(p2.b.j(byteBuffer));
            this.h = p2.b.i(byteBuffer);
            p2.b.i(byteBuffer);
            long j10 = byteBuffer.getLong();
            this.n = j10;
            if (j10 < -1) {
                throw new RuntimeException("The tracks duration is bigger than Long.MAX_VALUE");
            }
        } else {
            this.e = x8.b(p2.b.i(byteBuffer));
            this.f = x8.b(p2.b.i(byteBuffer));
            this.h = p2.b.i(byteBuffer);
            p2.b.i(byteBuffer);
            this.n = p2.b.i(byteBuffer);
        }
        p2.b.i(byteBuffer);
        p2.b.i(byteBuffer);
        this.r = p2.b.h(byteBuffer);
        this.s = p2.b.h(byteBuffer);
        this.v = p2.b.g(byteBuffer);
        p2.b.h(byteBuffer);
        this.w = zb.d.a(byteBuffer);
        this.x = p2.b.f(byteBuffer);
        this.y = p2.b.f(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.c, com.googlecode.mp4parser.a
    public final void getContent(ByteBuffer byteBuffer) {
        com.google.firebase.messaging.t c10 = ae.a.c(J, this, this, byteBuffer);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(c10);
        i(byteBuffer);
        if (e() == 1) {
            byteBuffer.putLong(x8.a(this.e));
            byteBuffer.putLong(x8.a(this.f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) 0);
            byteBuffer.putLong(this.n);
        } else {
            byteBuffer.putInt((int) x8.a(this.e));
            byteBuffer.putInt((int) x8.a(this.f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) 0);
            byteBuffer.putInt((int) this.n);
        }
        int i10 = (int) 0;
        byteBuffer.putInt(i10);
        byteBuffer.putInt(i10);
        p2.b.p(this.r, byteBuffer);
        p2.b.p(this.s, byteBuffer);
        p2.b.o(byteBuffer, this.v);
        p2.b.p(0, byteBuffer);
        this.w.b(byteBuffer);
        p2.b.n(byteBuffer, this.x);
        p2.b.n(byteBuffer, this.y);
    }

    @Override // com.googlecode.mp4parser.a
    public final long getContentSize() {
        return (e() == 1 ? 36L : 24L) + 60;
    }

    public final String toString() {
        com.google.firebase.messaging.t b10 = ae.a.b(K, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("TrackHeaderBox[creationTime=");
        pa.u(ae.a.b(A, this, this));
        sb2.append(this.e);
        sb2.append(";modificationTime=");
        pa.u(ae.a.b(B, this, this));
        sb2.append(this.f);
        sb2.append(";trackId=");
        pa.u(ae.a.b(C, this, this));
        sb2.append(this.h);
        sb2.append(";duration=");
        pa.u(ae.a.b(D, this, this));
        sb2.append(this.n);
        sb2.append(";layer=");
        pa.u(ae.a.b(E, this, this));
        sb2.append(this.r);
        sb2.append(";alternateGroup=");
        pa.u(ae.a.b(F, this, this));
        sb2.append(this.s);
        sb2.append(";volume=");
        pa.u(ae.a.b(G, this, this));
        sb2.append(this.v);
        sb2.append(";matrix=");
        sb2.append(this.w);
        sb2.append(";width=");
        pa.u(ae.a.b(H, this, this));
        sb2.append(this.x);
        sb2.append(";height=");
        pa.u(ae.a.b(I, this, this));
        sb2.append(this.y);
        sb2.append("]");
        return sb2.toString();
    }
}
