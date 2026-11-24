// default package

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.logging.Logger;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class st3 extends rg0 {
    public static final Logger p = Logger.getLogger(st3.class.getName());
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public String j;
    public int k;
    public int l;
    public ha3 m;
    public hq9 n;
    public ArrayList o;

    @Override // rg0
    public final void b(ByteBuffer byteBuffer) {
        this.d = jne.f(byteBuffer);
        int a = jne.a(byteBuffer.get());
        int i = a >>> 7;
        this.e = i;
        this.f = (a >>> 6) & 1;
        this.g = (a >>> 5) & 1;
        this.h = a & 31;
        if (i == 1) {
            this.k = jne.f(byteBuffer);
        }
        if (this.f == 1) {
            int a2 = jne.a(byteBuffer.get());
            this.i = a2;
            byte[] bArr = new byte[a2];
            byteBuffer.get(bArr);
            try {
                this.j = new String(bArr, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                throw new Error(e);
            }
        }
        if (this.g == 1) {
            this.l = jne.f(byteBuffer);
        }
        int i2 = this.c + 4 + (this.e == 1 ? 2 : 0) + (this.f == 1 ? this.i + 1 : 0) + (this.g == 1 ? 2 : 0);
        int position = byteBuffer.position();
        int a3 = a();
        int i3 = i2 + 2;
        Logger logger = p;
        if (a3 > i3) {
            rg0 a4 = bq7.a(-1, byteBuffer);
            logger.finer(a4 + " - ESDescriptor1 read: " + (byteBuffer.position() - position) + ", size: " + Integer.valueOf(a4.a()));
            int a5 = a4.a();
            byteBuffer.position(position + a5);
            i2 += a5;
            if (a4 instanceof ha3) {
                this.m = (ha3) a4;
            }
        }
        int position2 = byteBuffer.position();
        if (a() > i2 + 2) {
            rg0 a6 = bq7.a(-1, byteBuffer);
            logger.finer(a6 + " - ESDescriptor2 read: " + (byteBuffer.position() - position2) + ", size: " + Integer.valueOf(a6.a()));
            int a7 = a6.a();
            byteBuffer.position(position2 + a7);
            i2 += a7;
            if (a6 instanceof hq9) {
                this.n = (hq9) a6;
            }
        } else {
            logger.warning("SLConfigDescriptor is missing!");
        }
        while (a() - i2 > 2) {
            int position3 = byteBuffer.position();
            rg0 a8 = bq7.a(-1, byteBuffer);
            logger.finer(a8 + " - ESDescriptor3 read: " + (byteBuffer.position() - position3) + ", size: " + Integer.valueOf(a8.a()));
            int a9 = a8.a();
            byteBuffer.position(position3 + a9);
            i2 += a9;
            this.o.add(a8);
        }
    }

    public final int c() {
        int i = this.e > 0 ? 7 : 5;
        if (this.f > 0) {
            i += this.i + 1;
        }
        if (this.g > 0) {
            i += 2;
        }
        y40 y40Var = this.m.j;
        int i2 = 0;
        if (y40Var != null) {
            if (y40Var.e != 2) {
                rjb.j("can't serialize that yet");
                return 0;
            }
            i2 = 4;
        }
        this.n.getClass();
        return i2 + 15 + i + 3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0057, code lost:
    
        if (r2 == null) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && st3.class == obj.getClass()) {
            st3 st3Var = (st3) obj;
            if (this.f == st3Var.f && this.i == st3Var.i && this.k == st3Var.k && this.d == st3Var.d && this.l == st3Var.l && this.g == st3Var.g && this.e == st3Var.e && this.h == st3Var.h) {
                String str = this.j;
                String str2 = st3Var.j;
                if (str == null ? str2 == null : str.equals(str2)) {
                    ha3 ha3Var = this.m;
                    ha3 ha3Var2 = st3Var.m;
                    if (ha3Var != null) {
                        if (ha3Var != ha3Var2) {
                            return false;
                        }
                    }
                    ArrayList arrayList = this.o;
                    ArrayList arrayList2 = st3Var.o;
                    if (arrayList == null ? arrayList2 == null : arrayList.equals(arrayList2)) {
                        hq9 hq9Var = this.n;
                        hq9 hq9Var2 = st3Var.n;
                        if (hq9Var != null) {
                            if (hq9Var.equals(hq9Var2)) {
                                return true;
                            }
                        } else if (hq9Var2 == null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((((((((((this.d * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31;
        String str = this.j;
        int hashCode = (((((i + (str != null ? str.hashCode() : 0)) * 961) + this.k) * 31) + this.l) * 31;
        ha3 ha3Var = this.m;
        int hashCode2 = (hashCode + (ha3Var != null ? ha3Var.hashCode() : 0)) * 31;
        hq9 hq9Var = this.n;
        int i2 = (hashCode2 + (hq9Var != null ? hq9Var.d : 0)) * 31;
        ArrayList arrayList = this.o;
        return i2 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final String toString() {
        return "ESDescriptor{esId=" + this.d + ", streamDependenceFlag=" + this.e + ", URLFlag=" + this.f + ", oCRstreamFlag=" + this.g + ", streamPriority=" + this.h + ", URLLength=" + this.i + ", URLString='" + this.j + "', remoteODFlag=0, dependsOnEsId=" + this.k + ", oCREsId=" + this.l + ", decoderConfigDescriptor=" + this.m + ", slConfigDescriptor=" + this.n + '}';
    }
}
