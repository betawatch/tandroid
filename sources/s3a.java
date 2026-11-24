// default package

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class s3a {
    public String a;
    public String b;
    public boolean c;
    public String d;
    public boolean e;
    public TLRPC.TL_inputStickerSetItem f;
    public oac g;

    public final void a(int i, TLRPC.InputFile inputFile, Runnable runnable) {
        TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
        tL_messages_uploadMedia.peer = new TLRPC.TL_inputPeerSelf();
        TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
        tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
        tL_inputMediaUploadedDocument.file = inputFile;
        tL_inputMediaUploadedDocument.mime_type = this.d;
        ConnectionsManager.getInstance(i).sendRequest(tL_messages_uploadMedia, new r3a(this, runnable), 2);
    }
}
