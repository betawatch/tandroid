package org.telegram.ui.web;

import android.util.Base64InputStream;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FilterInputStream;
import java.util.HashMap;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final class c1 {
    public final HashMap a = new HashMap();
    public File b;
    public long c;
    public long d;

    public final FilterInputStream a() {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new b1(this.c, this.d, this.b));
        HashMap hashMap = this.a;
        d1 d1Var = (d1) hashMap.get("content-transfer-encoding");
        if ("base64".equals(d1Var == null ? null : d1Var.a)) {
            return new Base64InputStream(bufferedInputStream, 0);
        }
        d1 d1Var2 = (d1) hashMap.get("content-transfer-encoding");
        return "quoted-printable".equalsIgnoreCase(d1Var2 != null ? d1Var2.a : null) ? new e1(bufferedInputStream, 0) : bufferedInputStream;
    }
}
