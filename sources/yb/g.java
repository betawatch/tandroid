package yb;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.logging.Logger;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class g extends b {
    public static final Logger p = Logger.getLogger(g.class.getName());
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public String j;
    public int k;
    public int l;
    public d m;
    public m n;
    public ArrayList o;

    @Override // yb.b
    public final void b(ByteBuffer byteBuffer) {
        this.d = r2.b.h(byteBuffer);
        int a2 = r2.b.a(byteBuffer.get());
        int i10 = a2 >>> 7;
        this.e = i10;
        this.f = (a2 >>> 6) & 1;
        this.g = (a2 >>> 5) & 1;
        this.h = a2 & 31;
        if (i10 == 1) {
            this.k = r2.b.h(byteBuffer);
        }
        if (this.f == 1) {
            int a10 = r2.b.a(byteBuffer.get());
            this.i = a10;
            byte[] bArr = new byte[a10];
            byteBuffer.get(bArr);
            try {
                this.j = new String(bArr, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                throw new Error(e);
            }
        }
        if (this.g == 1) {
            this.l = r2.b.h(byteBuffer);
        }
        int i11 = this.c + 4 + (this.e == 1 ? 2 : 0) + (this.f == 1 ? this.i + 1 : 0) + (this.g == 1 ? 2 : 0);
        int position = byteBuffer.position();
        int a11 = a();
        int i12 = i11 + 2;
        Logger logger = p;
        if (a11 > i12) {
            b a12 = k.a(-1, byteBuffer);
            logger.finer(a12 + " - ESDescriptor1 read: " + (byteBuffer.position() - position) + ", size: " + Integer.valueOf(a12.a()));
            int a13 = a12.a();
            byteBuffer.position(position + a13);
            i11 += a13;
            if (a12 instanceof d) {
                this.m = (d) a12;
            }
        }
        int position2 = byteBuffer.position();
        if (a() > i11 + 2) {
            b a14 = k.a(-1, byteBuffer);
            logger.finer(a14 + " - ESDescriptor2 read: " + (byteBuffer.position() - position2) + ", size: " + Integer.valueOf(a14.a()));
            int a15 = a14.a();
            byteBuffer.position(position2 + a15);
            i11 += a15;
            if (a14 instanceof m) {
                this.n = (m) a14;
            }
        } else {
            logger.warning("SLConfigDescriptor is missing!");
        }
        while (a() - i11 > 2) {
            int position3 = byteBuffer.position();
            b a16 = k.a(-1, byteBuffer);
            logger.finer(a16 + " - ESDescriptor3 read: " + (byteBuffer.position() - position3) + ", size: " + Integer.valueOf(a16.a()));
            int a17 = a16.a();
            byteBuffer.position(position3 + a17);
            i11 += a17;
            this.o.add(a16);
        }
    }

    public final int c() {
        int i10;
        int i11 = this.e > 0 ? 7 : 5;
        if (this.f > 0) {
            i11 += this.i + 1;
        }
        if (this.g > 0) {
            i11 += 2;
        }
        a aVar = this.m.j;
        if (aVar == null) {
            i10 = 0;
        } else {
            if (aVar.e != 2) {
                throw new UnsupportedOperationException("can't serialize that yet");
            }
            i10 = 4;
        }
        int i12 = i10 + 15 + i11;
        this.n.getClass();
        return i12 + 3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        ArrayList arrayList = gVar.o;
        if (this.f != gVar.f || this.i != gVar.i || this.k != gVar.k || this.d != gVar.d || this.l != gVar.l || this.g != gVar.g || this.e != gVar.e || this.h != gVar.h) {
            return false;
        }
        String str = this.j;
        if (str != null) {
            if (!str.equals(gVar.j)) {
                return false;
            }
        } else if (gVar.j != null) {
            return false;
        }
        d dVar = this.m;
        if (dVar != null) {
            if (!dVar.equals(gVar.m)) {
                return false;
            }
        } else if (gVar.m != null) {
            return false;
        }
        ArrayList arrayList2 = this.o;
        if (arrayList2 != null) {
            if (!arrayList2.equals(arrayList)) {
                return false;
            }
        } else if (arrayList != null) {
            return false;
        }
        m mVar = this.n;
        m mVar2 = gVar.n;
        return mVar != null ? mVar.equals(mVar2) : mVar2 == null;
    }

    public final int hashCode() {
        int i10 = ((((((((((this.d * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31;
        String str = this.j;
        int hashCode = (((((i10 + (str != null ? str.hashCode() : 0)) * 961) + this.k) * 31) + this.l) * 31;
        d dVar = this.m;
        int hashCode2 = (hashCode + (dVar != null ? dVar.hashCode() : 0)) * 31;
        m mVar = this.n;
        int i11 = (hashCode2 + (mVar != null ? mVar.d : 0)) * 31;
        ArrayList arrayList = this.o;
        return i11 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final String toString() {
        return "ESDescriptor{esId=" + this.d + ", streamDependenceFlag=" + this.e + ", URLFlag=" + this.f + ", oCRstreamFlag=" + this.g + ", streamPriority=" + this.h + ", URLLength=" + this.i + ", URLString='" + this.j + "', remoteODFlag=0, dependsOnEsId=" + this.k + ", oCREsId=" + this.l + ", decoderConfigDescriptor=" + this.m + ", slConfigDescriptor=" + this.n + '}';
    }
}
