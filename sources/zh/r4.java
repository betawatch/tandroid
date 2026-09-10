package zh;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class r4 extends TL_stories.StoryItem {
    public final s4 a;

    public r4(s4 s4Var, long j3, TL_bots.botPreviewMedia botpreviewmedia) {
        this.a = s4Var;
        this.dialogId = j3;
        TLRPC.MessageMedia messageMedia = botpreviewmedia.media;
        this.media = messageMedia;
        TLRPC.Document document = messageMedia.document;
        if (document != null) {
            document.date = botpreviewmedia.date;
            return;
        }
        TLRPC.Photo photo = messageMedia.photo;
        if (photo != null) {
            photo.date = botpreviewmedia.date;
        }
    }
}
