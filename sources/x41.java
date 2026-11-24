// default package

import android.net.Uri;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class x41 extends qf0 {
    public final w41 a;
    public Uri b;
    public byte[] c;
    public int d;
    public int e;
    public boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x41(byte[] bArr) {
        super(false);
        w41 w41Var = new w41(bArr);
        this.a = w41Var;
        gre.f(bArr.length > 0);
    }

    @Override // o63
    public final void close() {
        if (this.f) {
            this.f = false;
            transferEnded();
        }
        this.b = null;
        this.c = null;
    }

    @Override // o63
    public final Uri getUri() {
        return this.b;
    }

    @Override // o63
    public final long open(u63 u63Var) {
        transferInitializing(u63Var);
        Uri uri = u63Var.a;
        long j = u63Var.f;
        this.b = uri;
        byte[] bArr = this.a.a;
        this.c = bArr;
        long j2 = u63Var.e;
        if (j2 > bArr.length) {
            throw new r63(2008);
        }
        int i = (int) j2;
        this.d = i;
        int length = bArr.length - i;
        this.e = length;
        if (j != -1) {
            this.e = (int) Math.min(length, j);
        }
        this.f = true;
        transferStarted(u63Var);
        return j != -1 ? j : this.e;
    }

    @Override // g63
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.e;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        byte[] bArr2 = this.c;
        bArr2.getClass();
        System.arraycopy(bArr2, this.d, bArr, i, min);
        this.d += min;
        this.e -= min;
        bytesTransferred(min);
        return min;
    }
}
