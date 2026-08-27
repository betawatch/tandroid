package vb;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;
import org.telegram.messenger.BuildConfig;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class d extends b {
    public static final Logger m = Logger.getLogger(d.class.getName());
    public int d;
    public int e;
    public int f;
    public int g;
    public long h;
    public long i;
    public a j;
    public ArrayList k;
    public byte[] l;

    @Override // vb.b
    public final void b(ByteBuffer byteBuffer) {
        this.d = p2.b.a(byteBuffer.get());
        int a2 = p2.b.a(byteBuffer.get());
        this.e = a2 >>> 2;
        this.f = (a2 >> 1) & 1;
        this.g = p2.b.a(byteBuffer.get()) + (p2.b.h(byteBuffer) << 8);
        this.h = p2.b.i(byteBuffer);
        this.i = p2.b.i(byteBuffer);
        int remaining = byteBuffer.remaining();
        Logger logger = m;
        if (remaining > 2) {
            int position = byteBuffer.position();
            b a3 = k.a(this.d, byteBuffer);
            int position2 = byteBuffer.position() - position;
            logger.finer(a3 + " - DecoderConfigDescr1 read: " + position2 + ", size: " + Integer.valueOf(a3.a()));
            int a10 = a3.a();
            if (position2 < a10) {
                byte[] bArr = new byte[a10 - position2];
                this.l = bArr;
                byteBuffer.get(bArr);
            }
            if (a3 instanceof a) {
                this.j = (a) a3;
            }
        }
        while (byteBuffer.remaining() > 2) {
            long position3 = byteBuffer.position();
            b a11 = k.a(this.d, byteBuffer);
            logger.finer(a11 + " - DecoderConfigDescr2 read: " + (byteBuffer.position() - position3) + ", size: " + Integer.valueOf(a11.a()));
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DecoderConfigDescriptor{objectTypeIndication=");
        sb2.append(this.d);
        sb2.append(", streamType=");
        sb2.append(this.e);
        sb2.append(", upStream=");
        sb2.append(this.f);
        sb2.append(", bufferSizeDB=");
        sb2.append(this.g);
        sb2.append(", maxBitRate=");
        sb2.append(this.h);
        sb2.append(", avgBitRate=");
        sb2.append(this.i);
        sb2.append(", decoderSpecificInfo=null, audioSpecificInfo=");
        sb2.append(this.j);
        sb2.append(", configDescriptorDeadBytes=");
        byte[] bArr = this.l;
        if (bArr == null) {
            bArr = new byte[0];
        }
        sb2.append(p2.b.c(0, bArr));
        sb2.append(", profileLevelIndicationDescriptors=");
        ArrayList arrayList = this.k;
        sb2.append(arrayList == null ? BuildConfig.BETA_URL : Arrays.asList(arrayList).toString());
        sb2.append('}');
        return sb2.toString();
    }
}
