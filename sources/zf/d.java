package zf;

import ci.d0;
import java.io.File;
import org.telegram.messenger.cs;
import org.telegram.messenger.hs;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class d implements cs {
    public final int a;
    public final String b;
    public boolean c;

    public d(String str, int i3) {
        this.a = i3;
        this.b = str;
        hs.f(i3).b(this, hs.U1);
        hs.f(i3).b(this, hs.V1);
        w7.G(i3).i0(false, ConnectionsManager.FileTypeAudio, str, true);
    }

    public final void a() {
        int i3 = this.a;
        hs.f(i3).n(this, hs.U1);
        hs.f(i3).n(this, hs.V1);
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.U1) {
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
                ConnectionsManager.getInstance(this.a).sendRequest(uploadringtone, new d0(this, 27));
            }
        }
    }
}
