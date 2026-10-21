package rh;

import android.text.TextUtils;
import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final class a {
    public final int a;
    public final TLRPC.Document b;
    public final String c;
    public final MessageObject d;
    public final String e;
    public boolean f;
    public boolean g;

    public a(int i10, MessageObject messageObject, TLRPC.Document document, String str) {
        this.a = i10;
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
        int i10 = this.a;
        if (!exists) {
            exists = FileLoader.getInstance(i10).getPathToAttach(this.b).exists();
        }
        this.f = exists;
        String str2 = this.e;
        if (!TextUtils.isEmpty(str2) && FileLoader.getInstance(i10).isLoadingFile(str2)) {
            z10 = true;
        }
        this.g = z10;
    }
}
