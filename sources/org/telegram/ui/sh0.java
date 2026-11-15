package org.telegram.ui;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class sh0 {
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
            str = a8.p0.E(str, ".", lowerCase);
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
