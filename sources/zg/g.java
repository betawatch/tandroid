package zg;

import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class g extends yg.e {
    public final MessageObject b;
    public final RadialProgress2 c;

    public g(MessageObject messageObject) {
        this.b = messageObject;
        RadialProgress2 radialProgress2 = new RadialProgress2(null, null);
        this.c = radialProgress2;
        TLRPC.Document document = messageObject.getDocument();
        if (MessageObject.isDocumentHasThumb(document)) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(22.0f), true, null, false);
            radialProgress2.j(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(44.0f), true, closestPhotoSizeWithSize, true), closestPhotoSizeWithSize, document, messageObject);
        } else {
            String artworkUrl = MessageObject.getArtworkUrl(document, true);
            if (TextUtils.isEmpty(artworkUrl)) {
                radialProgress2.i(null, null, null);
            } else {
                radialProgress2.h(artworkUrl);
            }
        }
        radialProgress2.g(f6.ie, f6.je, f6.uc, f6.vc);
    }

    @Override // yg.e
    public final void a(View view) {
        super.a(view);
        RadialProgress2 radialProgress2 = this.c;
        radialProgress2.m(view);
        radialProgress2.e();
        radialProgress2.setIcon(0, false, false);
    }

    @Override // yg.e
    public final void b() {
        super.b();
        this.c.f();
    }

    @Override // yg.e
    public final void c(Canvas canvas, int i9, int i10) {
        RadialProgress2 radialProgress2 = this.c;
        radialProgress2.setCircleRadius(i9 / 2);
        radialProgress2.q(0, 0, i9, i10);
        radialProgress2.draw(canvas);
    }
}
