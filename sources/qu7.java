// default package

import java.io.RandomAccessFile;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class qu7 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public qu7(RandomAccessFile randomAccessFile) {
        randomAccessFile.readUnsignedShort();
        this.a = randomAccessFile.readUnsignedShort();
        randomAccessFile.readUnsignedShort();
        this.b = randomAccessFile.readUnsignedShort();
        this.c = randomAccessFile.readUnsignedShort();
        this.d = randomAccessFile.readUnsignedShort();
    }
}
