package org.telegram.ui;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class qh0 {
    public boolean a;
    public boolean b;
    public int c;
    public int d;
    public TLRPC.Document e;
    public String f;
    public String g;

    public final Uri a(int i7) {
        if (!TextUtils.isEmpty(this.g)) {
            return Uri.fromFile(new File(this.g));
        }
        TLRPC.Document document = this.e;
        if (document == null) {
            return null;
        }
        String str = document.file_name_fixed;
        String A = org.telegram.messenger.w7.A(document);
        if (A == null) {
            return null;
        }
        String lowerCase = A.toLowerCase();
        if (!str.endsWith(lowerCase)) {
            str = a8.p0.D(str, ".", lowerCase);
        }
        File file = new File(org.telegram.messenger.g0.E0(), str);
        if (!file.exists()) {
            try {
                org.telegram.messenger.w7.G(i7);
                org.telegram.messenger.g0.E(org.telegram.messenger.w7.I(this.e), file);
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        }
        return Uri.fromFile(file);
    }
}
