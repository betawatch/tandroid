package th;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.b8;
import org.telegram.messenger.hc;
import org.telegram.messenger.ic;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.r8;
import org.telegram.ui.Components.u10;
import org.telegram.ui.Stories.ProfileStoriesView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class c3 {
    public final int a;
    public final ImageReceiver b;
    public int c;
    public boolean d;
    public float e;
    public final org.telegram.ui.Components.t5 f;
    public final org.telegram.ui.Components.t5 g;
    public final org.telegram.ui.Components.t5 h;
    public float i;
    public float j;
    public float k;
    public final boolean l;
    public final RectF m;
    public final RectF n;

    public c3(ProfileStoriesView profileStoriesView, TL_stories.StoryItem storyItem) {
        ArrayList<TLRPC.PhotoSize> arrayList;
        TLRPC.Document document;
        r8 r8Var = new r8((org.telegram.ui.ActionBar.p6) null);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.b = imageReceiver;
        this.c = 0;
        this.d = false;
        this.e = 1.0f;
        gr grVar = gr.h;
        this.f = new org.telegram.ui.Components.t5(profileStoriesView, 420L, grVar);
        this.g = new org.telegram.ui.Components.t5(profileStoriesView, 420L, grVar);
        this.h = new org.telegram.ui.Components.t5(profileStoriesView, 420L, grVar);
        this.m = new RectF();
        this.n = new RectF();
        this.a = storyItem.id;
        imageReceiver.J0(org.telegram.messenger.i0.L(200.0f));
        imageReceiver.H0(profileStoriesView);
        this.l = storyItem.media instanceof TLRPC.TL_messageMediaVideoStream;
        if (profileStoriesView.y) {
            imageReceiver.P();
        }
        u10[] u10VarArr = w5.a;
        TLRPC.MessageMedia messageMedia = storyItem.media;
        if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
            TLObject d22 = vp.r1(imageReceiver.d).d2(storyItem.dialogId);
            r8Var.l(d22);
            imageReceiver.i0(d22, r8Var, null);
        } else {
            if (messageMedia != null && (document = messageMedia.document) != null) {
                imageReceiver.r0(ic.c(b8.w(document.thumbs, org.telegram.messenger.i0.L(Math.max(25, 25)), false, null, true), storyItem.media.document), "25_25", null, null, hc.m(storyItem.media.document.thumbs), 0L, null, storyItem, 0);
                return;
            }
            TLRPC.Photo photo = messageMedia != null ? messageMedia.photo : null;
            if (photo == null || (arrayList = photo.sizes) == null) {
                imageReceiver.f();
            } else {
                imageReceiver.u0(null, null, ic.i(b8.w(arrayList, org.telegram.messenger.i0.L(Math.max(25, 25)), false, null, true), photo), "25_25", null, null, hc.m(photo.sizes), 0L, null, storyItem, 0);
            }
        }
    }
}
