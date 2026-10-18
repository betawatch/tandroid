package org.telegram.ui.web;

import android.util.Base64InputStream;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FilterInputStream;
import java.util.HashMap;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
