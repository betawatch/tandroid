// default package

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class zxa implements o63 {
    public final o63 a;
    public long b;
    public Uri c;
    public Map d;

    public zxa(o63 o63Var) {
        o63Var.getClass();
        this.a = o63Var;
        this.c = Uri.EMPTY;
        this.d = Collections.EMPTY_MAP;
    }

    @Override // o63
    public final void addTransferListener(vyb vybVar) {
        vybVar.getClass();
        this.a.addTransferListener(vybVar);
    }

    @Override // o63
    public final void close() {
        this.a.close();
    }

    @Override // o63
    public final Map getResponseHeaders() {
        return this.a.getResponseHeaders();
    }

    @Override // o63
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // o63
    public final long open(u63 u63Var) {
        o63 o63Var = this.a;
        this.c = u63Var.a;
        this.d = Collections.EMPTY_MAP;
        try {
            return o63Var.open(u63Var);
        } finally {
            Uri uri = o63Var.getUri();
            if (uri != null) {
                this.c = uri;
            }
            this.d = o63Var.getResponseHeaders();
        }
    }

    @Override // g63
    public final int read(byte[] bArr, int i, int i2) {
        int read = this.a.read(bArr, i, i2);
        if (read != -1) {
            this.b += read;
        }
        return read;
    }
}
