package org.telegram.ui.web;

import java.io.File;
import java.io.FileInputStream;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final class b1 extends FileInputStream {
    public final long a;

    public b1(long j3, long j10, File file) {
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
    public final int read(byte[] bArr, int i7, int i10) {
        long position = getChannel().position();
        long j3 = this.a;
        if (position >= j3) {
            return -1;
        }
        long position2 = j3 - getChannel().position();
        if (i10 > position2) {
            i10 = (int) position2;
        }
        return super.read(bArr, i7, i10);
    }
}
