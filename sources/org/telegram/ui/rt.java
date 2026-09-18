package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class rt extends org.telegram.ui.Components.ll0 {
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ ut d;

    public rt(ut utVar, ArrayList arrayList) {
        this.d = utVar;
        this.c = arrayList;
    }

    @Override // org.telegram.ui.Components.ll0
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override // s4.h0
    public final int h() {
        return this.c.size();
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        tt ttVar = (tt) c1Var.a;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) this.c.get(i10);
        org.telegram.ui.ActionBar.k5 k5Var = ttVar.b;
        org.telegram.ui.Components.u9 u9Var = ttVar.a;
        ttVar.d = stickerSetCovered;
        if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
            k5Var.l(LocaleController.getString(R.string.NewStickerPack), false);
            u9Var.setImageResource(R.drawable.msg_addbot);
            return;
        }
        k5Var.l(stickerSetCovered.set.title, false);
        TLRPC.Document document = stickerSetCovered.cover;
        if (document == null) {
            u9Var.l(null, null, null, null, null, 0);
            return;
        }
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(stickerSetCovered.cover, org.telegram.ui.ActionBar.j6.a7, 1.0f, 1.0f, ttVar.c);
        if (svgThumb == null) {
            u9Var.i(ImageLocation.getForDocument(closestPhotoSizeWithSize, stickerSetCovered.cover), null, "webp", null, stickerSetCovered);
        } else if (closestPhotoSizeWithSize != null) {
            u9Var.i(ImageLocation.getForDocument(closestPhotoSizeWithSize, stickerSetCovered.cover), null, "webp", svgThumb, stickerSetCovered);
        } else {
            u9Var.i(ImageLocation.getForDocument(stickerSetCovered.cover), null, "webp", svgThumb, stickerSetCovered);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        tt ttVar = new tt(viewGroup.getContext(), this.d.c0);
        ttVar.setLayoutParams(new s4.p0(-2, AndroidUtilities.dp(48.0f)));
        return new org.telegram.ui.Components.wk0(ttVar);
    }
}
