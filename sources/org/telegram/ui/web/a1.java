package org.telegram.ui.web;

import android.util.Base64InputStream;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FilterInputStream;
import java.util.HashMap;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class a1 {
    public final HashMap a = new HashMap();
    public File b;
    public long c;
    public long d;

    public final FilterInputStream a() {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new z0(this.c, this.d, this.b));
        HashMap hashMap = this.a;
        b1 b1Var = (b1) hashMap.get("content-transfer-encoding");
        if ("base64".equals(b1Var == null ? null : b1Var.a)) {
            return new Base64InputStream(bufferedInputStream, 0);
        }
        b1 b1Var2 = (b1) hashMap.get("content-transfer-encoding");
        return "quoted-printable".equalsIgnoreCase(b1Var2 != null ? b1Var2.a : null) ? new c1(bufferedInputStream, 0) : bufferedInputStream;
    }
}
