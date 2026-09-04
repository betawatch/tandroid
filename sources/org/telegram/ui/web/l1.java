package org.telegram.ui.web;

import java.io.File;
import java.io.FileInputStream;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class l1 extends FileInputStream {
    public final long a;

    public l1(File file, long j3, long j10) {
        super(file);
        this.a = j10;
        if (j3 > 0 && skip(j3) != j3) {
            throw new RuntimeException("BoundedInputStream failed to skip");
        }
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public final int read() {
        if (getChannel().position() >= this.a) {
            return -1;
        }
        return super.read();
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        long position = getChannel().position();
        long j3 = this.a;
        if (position >= j3) {
            return -1;
        }
        long position2 = j3 - getChannel().position();
        if (i11 > position2) {
            i11 = (int) position2;
        }
        return super.read(bArr, i10, i11);
    }
}
