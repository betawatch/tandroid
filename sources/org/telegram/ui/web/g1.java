package org.telegram.ui.web;

import android.util.Base64InputStream;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FilterInputStream;
import java.util.HashMap;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class g1 {
    public final HashMap a = new HashMap();
    public File b;
    public long c;
    public long d;

    public final FilterInputStream a() {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new f1(this.b, this.c, this.d));
        HashMap hashMap = this.a;
        h1 h1Var = (h1) hashMap.get("content-transfer-encoding");
        if ("base64".equals(h1Var == null ? null : h1Var.a)) {
            return new Base64InputStream(bufferedInputStream, 0);
        }
        h1 h1Var2 = (h1) hashMap.get("content-transfer-encoding");
        return "quoted-printable".equalsIgnoreCase(h1Var2 != null ? h1Var2.a : null) ? new i1(bufferedInputStream) : bufferedInputStream;
    }
}
