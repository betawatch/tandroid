package q2;

import android.net.Uri;
import i2.d0;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a implements i2.h {
    public final i2.h a;
    public final byte[] b;
    public final byte[] c;
    public CipherInputStream d;

    public a(i2.h hVar, byte[] bArr, byte[] bArr2) {
        this.a = hVar;
        this.b = bArr;
        this.c = bArr2;
    }

    @Override // i2.h
    public final void addTransferListener(d0 d0Var) {
        d0Var.getClass();
        this.a.addTransferListener(d0Var);
    }

    @Override // i2.h
    public final void close() {
        if (this.d != null) {
            this.d = null;
            this.a.close();
        }
    }

    @Override // i2.h
    public final Map getResponseHeaders() {
        return this.a.getResponseHeaders();
    }

    @Override // i2.h
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // i2.h
    public final long open(i2.n nVar) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.b, "AES"), new IvParameterSpec(this.c));
                i2.l lVar = new i2.l(this.a, nVar);
                this.d = new CipherInputStream(lVar, cipher);
                lVar.a();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e10) {
                throw new RuntimeException(e10);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // d2.o
    public final int read(byte[] bArr, int i3, int i10) {
        this.d.getClass();
        int read = this.d.read(bArr, i3, i10);
        if (read < 0) {
            return -1;
        }
        return read;
    }
}
