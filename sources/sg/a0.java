package sg;

import java.io.RandomAccessFile;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class a0 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public a0(RandomAccessFile randomAccessFile) {
        randomAccessFile.readUnsignedShort();
        this.a = randomAccessFile.readUnsignedShort();
        randomAccessFile.readUnsignedShort();
        this.b = randomAccessFile.readUnsignedShort();
        this.c = randomAccessFile.readUnsignedShort();
        this.d = randomAccessFile.readUnsignedShort();
    }
}
