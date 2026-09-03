package org.telegram.ui.web;

import java.io.File;
import java.io.FileInputStream;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class i1 extends FileInputStream {
    public final long a;

    public i1(File file, long j10, long j11) {
        super(file);
        this.a = j11;
        if (j10 > 0 && skip(j10) != j10) {
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
        long j10 = this.a;
        if (position >= j10) {
            return -1;
        }
        long position2 = j10 - getChannel().position();
        if (i11 > position2) {
            i11 = (int) position2;
        }
        return super.read(bArr, i10, i11);
    }
}
