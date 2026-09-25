package rh;

import android.graphics.Canvas;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class h extends qh.e {
    public final TLRPC.Document b;
    public final Object c;

    public h(TLRPC.Document document, Object obj) {
        this.b = document;
        this.c = obj;
        MessageObject.isAnimatedEmoji(document);
        ImageReceiver imageReceiver = this.a;
        boolean z10 = MessageObject.isStickerDocument(document) || MessageObject.isVideoSticker(document);
        MessageObject.isAnimatedStickerDocument(document, true);
        imageReceiver.setImage(ImageLocation.getForDocument(document), "38_38", DocumentObject.getSvgThumb(document, h6.lc, 1.0f), document.size, z10 ? "webp" : null, obj, 0);
    }

    @Override // qh.e
    public final void c(Canvas canvas, int i10, int i11) {
        ImageReceiver imageReceiver = this.a;
        imageReceiver.setImageCoords(0.0f, 0.0f, i10, i11);
        imageReceiver.draw(canvas);
    }
}
