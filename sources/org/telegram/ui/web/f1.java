package org.telegram.ui.web;

import java.io.File;
import java.io.FileInputStream;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class f1 extends FileInputStream {
    public final long a;

    public f1(File file, long j10, long j11) {
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
    public final int read(byte[] bArr, int i9, int i10) {
        long position = getChannel().position();
        long j10 = this.a;
        if (position >= j10) {
            return -1;
        }
        long position2 = j10 - getChannel().position();
        if (i10 > position2) {
            i10 = (int) position2;
        }
        return super.read(bArr, i9, i10);
    }
}
