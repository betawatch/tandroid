package org.telegram.ui;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class wm implements wu0 {
    public final TL_iv.RichMessage a;
    public final ArrayList b;
    public final MessageObject c;

    public wm(TL_iv.RichMessage richMessage, ArrayList arrayList, MessageObject messageObject) {
        this.a = richMessage;
        this.b = arrayList;
        this.c = messageObject;
    }

    @Override // org.telegram.ui.wu0
    public final boolean a(int i10) {
        if (i10 < 0) {
            return false;
        }
        ArrayList arrayList = this.b;
        if (i10 >= arrayList.size()) {
            return false;
        }
        TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i10);
        if (!(pageBlock instanceof TL_iv.pageBlockVideo)) {
            return false;
        }
        TLRPC.Document b10 = f4.b(this.a, ((TL_iv.pageBlockVideo) pageBlock).video_id);
        if (b10 != null) {
            return MessageObject.isVideoDocument(b10);
        }
        return false;
    }

    @Override // org.telegram.ui.wu0
    public final File b(int i10) {
        TLRPC.Document b10;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        if (i10 < 0) {
            return null;
        }
        ArrayList arrayList = this.b;
        if (i10 >= arrayList.size()) {
            return null;
        }
        TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i10);
        boolean z10 = pageBlock instanceof TL_iv.pageBlockPhoto;
        TL_iv.RichMessage richMessage = this.a;
        if (!z10) {
            if (!(pageBlock instanceof TL_iv.pageBlockVideo) || (b10 = f4.b(richMessage, ((TL_iv.pageBlockVideo) pageBlock).video_id)) == null) {
                return null;
            }
            return f4.c(b10);
        }
        TLRPC.Photo f7 = f4.f(richMessage, ((TL_iv.pageBlockPhoto) pageBlock).photo_id);
        if (f7 == null || (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(f7.sizes, AndroidUtilities.getPhotoSize())) == null) {
            return null;
        }
        return f4.c(closestPhotoSizeWithSize);
    }

    @Override // org.telegram.ui.wu0
    public final String c(int i10) {
        TLObject d = d(i10);
        if (d instanceof TLRPC.Photo) {
            d = FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Photo) d).sizes, AndroidUtilities.getPhotoSize());
        }
        return FileLoader.getAttachFileName(d);
    }

    @Override // org.telegram.ui.wu0
    public final TLObject d(int i10) {
        if (i10 < 0) {
            return null;
        }
        ArrayList arrayList = this.b;
        if (i10 >= arrayList.size()) {
            return null;
        }
        TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i10);
        boolean z10 = pageBlock instanceof TL_iv.pageBlockPhoto;
        TL_iv.RichMessage richMessage = this.a;
        if (z10) {
            return f4.f(richMessage, ((TL_iv.pageBlockPhoto) pageBlock).photo_id);
        }
        if (pageBlock instanceof TL_iv.pageBlockVideo) {
            return f4.b(richMessage, ((TL_iv.pageBlockVideo) pageBlock).video_id);
        }
        return null;
    }

    @Override // org.telegram.ui.wu0
    public final boolean e(int i10) {
        return false;
    }

    @Override // org.telegram.ui.wu0
    public final TLRPC.PhotoSize f(TLObject tLObject, int[] iArr) {
        if (tLObject instanceof TLRPC.Photo) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Photo) tLObject).sizes, AndroidUtilities.getPhotoSize());
            if (closestPhotoSizeWithSize == null) {
                iArr[0] = -1;
                return null;
            }
            int i10 = closestPhotoSizeWithSize.size;
            iArr[0] = i10;
            if (i10 == 0) {
                iArr[0] = -1;
            }
            return closestPhotoSizeWithSize;
        }
        if (tLObject instanceof TLRPC.Document) {
            TLRPC.Document document = (TLRPC.Document) tLObject;
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 320, false, null, true);
            if (closestPhotoSizeWithSize2 == null) {
                closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            }
            if (closestPhotoSizeWithSize2 != null) {
                int i11 = closestPhotoSizeWithSize2.size;
                iArr[0] = i11;
                if (i11 == 0) {
                    iArr[0] = -1;
                }
                return closestPhotoSizeWithSize2;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.wu0
    public final Object g() {
        MessageObject messageObject = this.c;
        return messageObject != null ? messageObject : this.a;
    }

    @Override // org.telegram.ui.wu0
    public final TL_iv.PageBlock get(int i10) {
        return (TL_iv.PageBlock) this.b.get(i10);
    }

    @Override // org.telegram.ui.wu0
    public final List getAll() {
        return this.b;
    }

    @Override // org.telegram.ui.wu0
    public final void h(TL_iv.PageBlock pageBlock) {
        RichMessageLayout richMessageLayout;
        MessageObject messageObject = this.c;
        if (messageObject == null || (richMessageLayout = messageObject.richLayout) == null) {
            return;
        }
        richMessageLayout.setSlideshowPage(pageBlock);
    }

    @Override // org.telegram.ui.wu0
    public final CharSequence i(int i10) {
        return null;
    }

    @Override // org.telegram.ui.wu0
    public final int j() {
        return this.b.size();
    }
}
