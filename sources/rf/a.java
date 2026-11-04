package rf;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class a extends FilterInputStream {
    public final /* synthetic */ int a = 0;
    public long b;
    public long c;

    public a(FilterInputStream filterInputStream) {
        this(filterInputStream, 0L);
    }

    private final synchronized void a(int i3) {
        this.c = this.b;
        super.mark(i3);
    }

    private final synchronized void b(int i3) {
        ((FilterInputStream) this).in.mark(i3);
        this.c = this.b;
    }

    private final synchronized void c() {
        super.reset();
        this.b = this.c;
    }

    private final synchronized void d() {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.c == -1) {
            throw new IOException("Mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.b = this.c;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        switch (this.a) {
            case 1:
                return (int) Math.min(((FilterInputStream) this).in.available(), this.b);
            default:
                return super.available();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i3) {
        switch (this.a) {
            case 0:
                a(i3);
                break;
            default:
                b(i3);
                break;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        switch (this.a) {
            case 0:
                return read(bArr, 0, bArr.length);
            default:
                return super.read(bArr);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        switch (this.a) {
            case 0:
                c();
                break;
            default:
                d();
                break;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) {
        switch (this.a) {
            case 0:
                long j11 = this.b;
                long skip = super.skip(j10);
                this.b = j11 + skip;
                return skip;
            default:
                long skip2 = ((FilterInputStream) this).in.skip(Math.min(j10, this.b));
                this.b -= skip2;
                return skip2;
        }
    }

    public a(InputStream inputStream, long j10) {
        super(inputStream);
        this.b = j10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        switch (this.a) {
            case 0:
                int read = super.read();
                if (read >= 0) {
                    this.b++;
                }
                return read;
            default:
                if (this.b == 0) {
                    return -1;
                }
                int read2 = ((FilterInputStream) this).in.read();
                if (read2 != -1) {
                    this.b--;
                }
                return read2;
        }
    }

    public a(InputStream inputStream) {
        super(inputStream);
        this.c = -1L;
        this.b = 1048577L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i3, int i10) {
        switch (this.a) {
            case 0:
                long j10 = this.b;
                int read = super.read(bArr, i3, i10);
                if (read > 0) {
                    this.b = j10 + read;
                }
                return read;
            default:
                long j11 = this.b;
                if (j11 == 0) {
                    return -1;
                }
                int read2 = ((FilterInputStream) this).in.read(bArr, i3, (int) Math.min(i10, j11));
                if (read2 != -1) {
                    this.b -= read2;
                }
                return read2;
        }
    }
}
