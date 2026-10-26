package th;

import android.graphics.Canvas;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.y6;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class h extends sh.e {
    public final TLRPC.Document b;
    public final Object c;

    public h(TLRPC.Document document, Object obj) {
        this.b = document;
        this.c = obj;
        MessageObject.isAnimatedEmoji(document);
        ImageReceiver imageReceiver = this.a;
        boolean z10 = MessageObject.isStickerDocument(document) || MessageObject.isVideoSticker(document);
        MessageObject.isAnimatedStickerDocument(document, true);
        imageReceiver.setImage(ImageLocation.getForDocument(document), "38_38", DocumentObject.getSvgThumb(document, y6.lc, 1.0f), document.size, z10 ? "webp" : null, obj, 0);
    }

    @Override // sh.e
    public final void c(Canvas canvas, int i10, int i11) {
        ImageReceiver imageReceiver = this.a;
        imageReceiver.setImageCoords(0.0f, 0.0f, i10, i11);
        imageReceiver.draw(canvas);
    }
}
