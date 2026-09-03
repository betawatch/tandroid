package yb;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;
import org.telegram.messenger.BuildConfig;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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

    @Override // yb.b
    public final void b(ByteBuffer byteBuffer) {
        this.d = r2.b.a(byteBuffer.get());
        int a2 = r2.b.a(byteBuffer.get());
        this.e = a2 >>> 2;
        this.f = (a2 >> 1) & 1;
        this.g = r2.b.a(byteBuffer.get()) + (r2.b.h(byteBuffer) << 8);
        this.h = r2.b.i(byteBuffer);
        this.i = r2.b.i(byteBuffer);
        int remaining = byteBuffer.remaining();
        Logger logger = m;
        if (remaining > 2) {
            int position = byteBuffer.position();
            b a10 = k.a(this.d, byteBuffer);
            int position2 = byteBuffer.position() - position;
            logger.finer(a10 + " - DecoderConfigDescr1 read: " + position2 + ", size: " + Integer.valueOf(a10.a()));
            int a11 = a10.a();
            if (position2 < a11) {
                byte[] bArr = new byte[a11 - position2];
                this.l = bArr;
                byteBuffer.get(bArr);
            }
            if (a10 instanceof a) {
                this.j = (a) a10;
            }
        }
        while (byteBuffer.remaining() > 2) {
            long position3 = byteBuffer.position();
            b a12 = k.a(this.d, byteBuffer);
            logger.finer(a12 + " - DecoderConfigDescr2 read: " + (byteBuffer.position() - position3) + ", size: " + Integer.valueOf(a12.a()));
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DecoderConfigDescriptor{objectTypeIndication=");
        sb.append(this.d);
        sb.append(", streamType=");
        sb.append(this.e);
        sb.append(", upStream=");
        sb.append(this.f);
        sb.append(", bufferSizeDB=");
        sb.append(this.g);
        sb.append(", maxBitRate=");
        sb.append(this.h);
        sb.append(", avgBitRate=");
        sb.append(this.i);
        sb.append(", decoderSpecificInfo=null, audioSpecificInfo=");
        sb.append(this.j);
        sb.append(", configDescriptorDeadBytes=");
        byte[] bArr = this.l;
        if (bArr == null) {
            bArr = new byte[0];
        }
        sb.append(r2.b.c(0, bArr));
        sb.append(", profileLevelIndicationDescriptors=");
        ArrayList arrayList = this.k;
        sb.append(arrayList == null ? BuildConfig.BETA_URL : Arrays.asList(arrayList).toString());
        sb.append('}');
        return sb.toString();
    }
}
