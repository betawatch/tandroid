package org.telegram.ui.web;

import android.util.Base64InputStream;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FilterInputStream;
import java.util.HashMap;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class j1 {
    public final HashMap a = new HashMap();
    public File b;
    public long c;
    public long d;

    public final FilterInputStream a() {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new i1(this.c, this.d, this.b));
        HashMap hashMap = this.a;
        k1 k1Var = (k1) hashMap.get("content-transfer-encoding");
        if ("base64".equals(k1Var == null ? null : k1Var.a)) {
            return new Base64InputStream(bufferedInputStream, 0);
        }
        k1 k1Var2 = (k1) hashMap.get("content-transfer-encoding");
        return "quoted-printable".equalsIgnoreCase(k1Var2 != null ? k1Var2.a : null) ? new l1(bufferedInputStream, 0) : bufferedInputStream;
    }
}
