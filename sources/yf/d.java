package yf;

import ai.d1;
import java.io.File;
import org.telegram.messenger.is;
import org.telegram.messenger.ns;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class d implements is {
    public final int a;
    public final String b;
    public boolean c;

    public d(String str, int i7) {
        this.a = i7;
        this.b = str;
        ns.f(i7).b(this, ns.U1);
        ns.f(i7).b(this, ns.V1);
        w7.G(i7).h0(false, ConnectionsManager.FileTypeAudio, str, true);
    }

    public final void a() {
        int i7 = this.a;
        ns.f(i7).n(this, ns.U1);
        ns.f(i7).n(this, ns.V1);
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ns.U1) {
            String str = (String) objArr[0];
            if (!this.c && str.equals(this.b)) {
                TLRPC.InputFile inputFile = (TLRPC.InputFile) objArr[1];
                TL_account.uploadRingtone uploadringtone = new TL_account.uploadRingtone();
                uploadringtone.file = inputFile;
                uploadringtone.file_name = inputFile.name;
                String D = w7.D(new File(inputFile.name));
                uploadringtone.mime_type = D;
                if ("ogg".equals(D)) {
                    uploadringtone.mime_type = "audio/ogg";
                } else {
                    uploadringtone.mime_type = "audio/mpeg";
                }
                ConnectionsManager.getInstance(this.a).sendRequest(uploadringtone, new d1(this, 28));
            }
        }
    }
}
