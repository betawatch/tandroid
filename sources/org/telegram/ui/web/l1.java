package org.telegram.ui.web;

import android.util.Base64InputStream;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FilterInputStream;
import java.util.HashMap;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes4.dex */
public final class l1 {
    public final HashMap a = new HashMap();
    public File b;
    public long c;
    public long d;

    public final FilterInputStream a() {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new k1(this.c, this.d, this.b));
        HashMap hashMap = this.a;
        m1 m1Var = (m1) hashMap.get("content-transfer-encoding");
        if ("base64".equals(m1Var == null ? null : m1Var.a)) {
            return new Base64InputStream(bufferedInputStream, 0);
        }
        m1 m1Var2 = (m1) hashMap.get("content-transfer-encoding");
        return "quoted-printable".equalsIgnoreCase(m1Var2 != null ? m1Var2.a : null) ? new n1(bufferedInputStream) : bufferedInputStream;
    }
}
