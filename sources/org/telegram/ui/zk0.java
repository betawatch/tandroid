package org.telegram.ui;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class zk0 {
    public boolean a;
    public boolean b;
    public int c;
    public int d;
    public TLRPC.Document e;
    public String f;
    public String g;

    public final Uri a(int i10) {
        if (!TextUtils.isEmpty(this.g)) {
            return Uri.fromFile(new File(this.g));
        }
        TLRPC.Document document = this.e;
        if (document == null) {
            return null;
        }
        String str = document.file_name_fixed;
        String documentExtension = FileLoader.getDocumentExtension(document);
        if (documentExtension == null) {
            return null;
        }
        String lowerCase = documentExtension.toLowerCase();
        if (!str.endsWith(lowerCase)) {
            str = a4.a.C(str, ".", lowerCase);
        }
        File file = new File(AndroidUtilities.getCacheDir(), str);
        if (!file.exists()) {
            try {
                AndroidUtilities.copyFile(FileLoader.getInstance(i10).getPathToAttach(this.e), file);
            } catch (IOException e7) {
                e7.printStackTrace();
            }
        }
        return Uri.fromFile(file);
    }
}
