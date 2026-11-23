package yf;

import java.io.File;
import org.telegram.messenger.gs;
import org.telegram.messenger.ls;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class e implements gs {
    public final int a;
    public final String b;
    public boolean c;

    public e(String str, int i7) {
        this.a = i7;
        this.b = str;
        ls.f(i7).b(this, ls.U1);
        ls.f(i7).b(this, ls.V1);
        w7.G(i7).h0(false, ConnectionsManager.FileTypeAudio, str, true);
    }

    public final void a() {
        int i7 = this.a;
        ls.f(i7).n(this, ls.U1);
        ls.f(i7).n(this, ls.V1);
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ls.U1) {
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
                ConnectionsManager.getInstance(this.a).sendRequest(uploadringtone, new d(this, 0));
            }
        }
    }
}
