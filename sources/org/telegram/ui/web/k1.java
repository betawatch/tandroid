package org.telegram.ui.web;

import android.util.Base64InputStream;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FilterInputStream;
import java.util.HashMap;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final class k1 {
    public final HashMap a = new HashMap();
    public File b;
    public long c;
    public long d;

    public final FilterInputStream a() {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new j1(this.b, this.c, this.d));
        HashMap hashMap = this.a;
        l1 l1Var = (l1) hashMap.get("content-transfer-encoding");
        if ("base64".equals(l1Var == null ? null : l1Var.a)) {
            return new Base64InputStream(bufferedInputStream, 0);
        }
        l1 l1Var2 = (l1) hashMap.get("content-transfer-encoding");
        return "quoted-printable".equalsIgnoreCase(l1Var2 != null ? l1Var2.a : null) ? new m1(bufferedInputStream) : bufferedInputStream;
    }
}
