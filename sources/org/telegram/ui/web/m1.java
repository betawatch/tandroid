package org.telegram.ui.web;

import android.util.Base64InputStream;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FilterInputStream;
import java.util.HashMap;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class m1 {
    public final HashMap a = new HashMap();
    public File b;
    public long c;
    public long d;

    public final FilterInputStream a() {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new l1(this.b, this.c, this.d));
        HashMap hashMap = this.a;
        n1 n1Var = (n1) hashMap.get("content-transfer-encoding");
        if ("base64".equals(n1Var == null ? null : n1Var.a)) {
            return new Base64InputStream(bufferedInputStream, 0);
        }
        n1 n1Var2 = (n1) hashMap.get("content-transfer-encoding");
        return "quoted-printable".equalsIgnoreCase(n1Var2 != null ? n1Var2.a : null) ? new o1(bufferedInputStream) : bufferedInputStream;
    }
}
