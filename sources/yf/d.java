package yf;

import bi.j0;
import java.io.File;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class d implements ls {
    public final int a;
    public final String b;
    public boolean c;

    public d(String str, int i7) {
        this.a = i7;
        this.b = str;
        qs.f(i7).b(this, qs.U1);
        qs.f(i7).b(this, qs.V1);
        w7.G(i7).i0(false, ConnectionsManager.FileTypeAudio, str, true);
    }

    public final void a() {
        int i7 = this.a;
        qs.f(i7).n(this, qs.U1);
        qs.f(i7).n(this, qs.V1);
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.U1) {
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
                ConnectionsManager.getInstance(this.a).sendRequest(uploadringtone, new j0(this, 27));
            }
        }
    }
}
