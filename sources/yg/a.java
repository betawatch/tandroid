package yg;

import android.text.TextUtils;
import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class a {
    public final int a;
    public final TLRPC.Document b;
    public final String c;
    public final MessageObject d;
    public final String e;
    public boolean f;
    public boolean g;

    public a(int i9, MessageObject messageObject, TLRPC.Document document, String str) {
        this.a = i9;
        this.d = messageObject;
        this.b = document;
        this.c = str;
        this.e = TextUtils.isEmpty(str) ? FileLoader.getAttachFileName(document) : str;
        a();
    }

    public final void a() {
        boolean z10 = false;
        String str = this.c;
        boolean exists = str != null ? new File(str).exists() : false;
        int i9 = this.a;
        if (!exists) {
            exists = FileLoader.getInstance(i9).getPathToAttach(this.b).exists();
        }
        this.f = exists;
        String str2 = this.e;
        if (!TextUtils.isEmpty(str2) && FileLoader.getInstance(i9).isLoadingFile(str2)) {
            z10 = true;
        }
        this.g = z10;
    }
}
