package pg;

import java.io.RandomAccessFile;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class j0 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public j0(RandomAccessFile randomAccessFile) {
        randomAccessFile.readUnsignedShort();
        this.a = randomAccessFile.readUnsignedShort();
        randomAccessFile.readUnsignedShort();
        this.b = randomAccessFile.readUnsignedShort();
        this.c = randomAccessFile.readUnsignedShort();
        this.d = randomAccessFile.readUnsignedShort();
    }
}
