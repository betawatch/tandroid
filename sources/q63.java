// default package

import android.content.Context;
import android.net.Uri;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class q63 implements wj0 {
    public static final qbb d = vue.a(new k40((byte) 1));
    public final re7 a;
    public final tg2 b;
    public final int c;

    public q63(dd ddVar) {
        this.b = new tg2((Context) ddVar.c);
        re7 re7Var = (re7) d.get();
        re7Var.getClass();
        this.a = re7Var;
        this.c = ddVar.b;
    }

    @Override // wj0
    public final t56 D(jr6 jr6Var) {
        byte[] bArr = jr6Var.k;
        if (bArr != null) {
            return M(bArr);
        }
        Uri uri = jr6Var.n;
        if (uri == null) {
            return null;
        }
        return this.a.a(new p63(this, uri, (byte) 1));
    }

    @Override // wj0
    public final t56 M(byte[] bArr) {
        return this.a.a(new p63(this, bArr, (byte) 0));
    }
}
