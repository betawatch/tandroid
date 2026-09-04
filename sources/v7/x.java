package v7;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public abstract class x {
    public static p1.b a(MappedByteBuffer mappedByteBuffer) {
        long j3;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i10 = duplicate.getShort() & 65535;
        if (i10 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        duplicate.position(duplicate.position() + 6);
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                j3 = -1;
                break;
            }
            int i12 = duplicate.getInt();
            duplicate.position(duplicate.position() + 4);
            j3 = duplicate.getInt() & 4294967295L;
            duplicate.position(duplicate.position() + 4);
            if (1835365473 == i12) {
                break;
            }
            i11++;
        }
        if (j3 != -1) {
            duplicate.position(duplicate.position() + ((int) (j3 - duplicate.position())));
            duplicate.position(duplicate.position() + 12);
            long j10 = duplicate.getInt() & 4294967295L;
            for (int i13 = 0; i13 < j10; i13++) {
                int i14 = duplicate.getInt();
                long j11 = duplicate.getInt() & 4294967295L;
                duplicate.getInt();
                if (1164798569 == i14 || 1701669481 == i14) {
                    duplicate.position((int) (j11 + j3));
                    p1.b bVar = new p1.b();
                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int position = duplicate.position() + duplicate.getInt(duplicate.position());
                    bVar.d = duplicate;
                    bVar.a = position;
                    int i15 = position - duplicate.getInt(position);
                    bVar.b = i15;
                    bVar.c = ((ByteBuffer) bVar.d).getShort(i15);
                    return bVar;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }
}
