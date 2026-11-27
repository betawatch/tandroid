// default package

import java.io.File;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class xm9 implements fn7 {
    public final int a;
    public final String b;
    public boolean c;

    public xm9(String str, int i) {
        this.a = i;
        this.b = str;
        jn7.f(i).a(this, jn7.U1);
        jn7.f(i).a(this, jn7.V1);
        xb4.G(i).h0(false, ConnectionsManager.FileTypeAudio, str, true);
    }

    public final void a() {
        int i = this.a;
        jn7.f(i).n(this, jn7.U1);
        jn7.f(i).n(this, jn7.V1);
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.U1) {
            String str = (String) objArr[0];
            if (this.c || !str.equals(this.b)) {
                return;
            }
            TLRPC.InputFile inputFile = (TLRPC.InputFile) objArr[1];
            TL_account.uploadRingtone uploadringtone = new TL_account.uploadRingtone();
            uploadringtone.file = inputFile;
            uploadringtone.file_name = inputFile.name;
            String D = xb4.D(new File(inputFile.name));
            uploadringtone.mime_type = D;
            if ("ogg".equals(D)) {
                uploadringtone.mime_type = "audio/ogg";
            } else {
                uploadringtone.mime_type = "audio/mpeg";
            }
            ConnectionsManager.getInstance(this.a).sendRequest(uploadringtone, new w15(this, (byte) 29));
        }
    }
}
