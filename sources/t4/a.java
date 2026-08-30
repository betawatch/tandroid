package t4;

import android.net.Uri;
import g5.v0;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class a implements g5.m {
    public final g5.m a;
    public final byte[] b;
    public final byte[] c;
    public CipherInputStream d;

    public a(g5.m mVar, byte[] bArr, byte[] bArr2) {
        this.a = mVar;
        this.b = bArr;
        this.c = bArr2;
    }

    @Override // g5.m
    public final void addTransferListener(v0 v0Var) {
        v0Var.getClass();
        this.a.addTransferListener(v0Var);
    }

    @Override // g5.m
    public final void close() {
        if (this.d != null) {
            this.d = null;
            this.a.close();
        }
    }

    @Override // g5.m
    public final Map getResponseHeaders() {
        return this.a.getResponseHeaders();
    }

    @Override // g5.m
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // g5.m
    public final long open(g5.p pVar) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.b, "AES"), new IvParameterSpec(this.c));
                g5.o oVar = new g5.o(this.a, pVar);
                this.d = new CipherInputStream(oVar, cipher);
                oVar.a();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e6) {
            throw new RuntimeException(e6);
        }
    }

    @Override // g5.j
    public final int read(byte[] bArr, int i10, int i11) {
        this.d.getClass();
        int read = this.d.read(bArr, i10, i11);
        if (read < 0) {
            return -1;
        }
        return read;
    }
}
