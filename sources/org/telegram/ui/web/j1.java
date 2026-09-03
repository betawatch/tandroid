package org.telegram.ui.web;

import android.util.Base64InputStream;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FilterInputStream;
import java.util.HashMap;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
