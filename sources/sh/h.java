package sh;

import android.graphics.Canvas;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j6;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class h extends rh.e {
    public final TLRPC.Document b;
    public final Object c;

    public h(TLRPC.Document document, Object obj) {
        this.b = document;
        this.c = obj;
        MessageObject.isAnimatedEmoji(document);
        ImageReceiver imageReceiver = this.a;
        boolean z10 = MessageObject.isStickerDocument(document) || MessageObject.isVideoSticker(document);
        MessageObject.isAnimatedStickerDocument(document, true);
        imageReceiver.setImage(ImageLocation.getForDocument(document), "38_38", DocumentObject.getSvgThumb(document, j6.lc, 1.0f), document.size, z10 ? "webp" : null, obj, 0);
    }

    @Override // rh.e
    public final void c(Canvas canvas, int i10, int i11) {
        ImageReceiver imageReceiver = this.a;
        imageReceiver.setImageCoords(0.0f, 0.0f, i10, i11);
        imageReceiver.draw(canvas);
    }
}
