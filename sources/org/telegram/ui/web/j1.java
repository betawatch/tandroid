package org.telegram.ui.web;

import android.util.Base64InputStream;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FilterInputStream;
import java.util.HashMap;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class j1 {
    public final HashMap a = new HashMap();
    public File b;
    public long c;
    public long d;

    public final FilterInputStream a() {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new i1(this.b, this.c, this.d));
        HashMap hashMap = this.a;
        k1 k1Var = (k1) hashMap.get("content-transfer-encoding");
        if ("base64".equals(k1Var == null ? null : k1Var.a)) {
            return new Base64InputStream(bufferedInputStream, 0);
        }
        k1 k1Var2 = (k1) hashMap.get("content-transfer-encoding");
        return "quoted-printable".equalsIgnoreCase(k1Var2 != null ? k1Var2.a : null) ? new l1(bufferedInputStream) : bufferedInputStream;
    }
}
