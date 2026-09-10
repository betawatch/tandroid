package zh;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.jh;
import org.telegram.ui.Components.wi;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class x1 implements wi {
    public final /* synthetic */ a3 a;

    public x1(a3 a3Var) {
        this.a = a3Var;
    }

    @Override // org.telegram.ui.Components.wi
    public final void A1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        TL_stories.StoryItem storyItem;
        AccountInstance accountInstance;
        String str;
        a3 a3Var = this.a;
        if (!a3Var.J0.m0 || (storyItem = a3Var.O1.a) == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        if (i10 != 8 && i10 != 7 && (i10 != 4 || a3Var.I2.j0.getSelectedPhotos().isEmpty())) {
            gg.m mVar = a3Var.I2;
            if (mVar != null) {
                mVar.dismissWithButtonClick(i10);
                return;
            }
            return;
        }
        if (i10 != 8) {
            a3Var.I2.dismiss(true);
        }
        HashMap<Object, Object> selectedPhotos = a3Var.I2.j0.getSelectedPhotos();
        ArrayList<Object> selectedPhotosOrder = a3Var.I2.j0.getSelectedPhotosOrder();
        if (selectedPhotos.isEmpty()) {
            return;
        }
        int i13 = 0;
        int i14 = 0;
        while (i14 < Math.ceil(selectedPhotos.size() / 10.0f)) {
            int i15 = i14 * 10;
            int min = Math.min(10, selectedPhotos.size() - i15);
            ArrayList arrayList = new ArrayList();
            for (int i16 = 0; i16 < min; i16++) {
                int i17 = i15 + i16;
                if (i17 < selectedPhotosOrder.size()) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) selectedPhotos.get(selectedPhotosOrder.get(i17));
                    SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                    boolean z14 = photoEntry.isVideo;
                    if (z14 || (str = photoEntry.imagePath) == null) {
                        String str2 = photoEntry.path;
                        if (str2 != null) {
                            sendingMediaInfo.path = str2;
                        }
                    } else {
                        sendingMediaInfo.path = str;
                    }
                    sendingMediaInfo.thumbPath = photoEntry.thumbPath;
                    sendingMediaInfo.coverPath = photoEntry.coverPath;
                    sendingMediaInfo.isVideo = z14;
                    CharSequence charSequence = photoEntry.caption;
                    sendingMediaInfo.caption = charSequence != null ? charSequence.toString() : null;
                    sendingMediaInfo.entities = photoEntry.entities;
                    sendingMediaInfo.masks = photoEntry.stickers;
                    sendingMediaInfo.ttl = photoEntry.ttl;
                    sendingMediaInfo.videoEditedInfo = photoEntry.editedInfo;
                    sendingMediaInfo.canDeleteAfter = photoEntry.canDeleteAfter;
                    sendingMediaInfo.updateStickersOrder = SendMessagesHelper.checkUpdateStickersOrder(photoEntry.caption);
                    sendingMediaInfo.hasMediaSpoilers = photoEntry.hasSpoiler;
                    arrayList.add(sendingMediaInfo);
                    photoEntry.reset();
                }
            }
            boolean z15 = i14 == 0 ? ((SendMessagesHelper.SendingMediaInfo) arrayList.get(i13)).updateStickersOrder : false;
            HashMap<Object, Object> hashMap = selectedPhotos;
            accountInstance = a3Var.getAccountInstance();
            ArrayList<Object> arrayList2 = selectedPhotosOrder;
            SendMessagesHelper.prepareSendingMedia(accountInstance, arrayList, a3Var.B1, null, null, storyItem, null, i10 == 4 || z13, z10, null, z11, i11, i12, 0, z15, null, null, 0L, false, 0L, a3Var.b2.getSendMonoForumPeerId(), a3Var.b2.getSendMessageSuggestionParams());
            i14++;
            selectedPhotos = hashMap;
            selectedPhotosOrder = arrayList2;
            i13 = 0;
        }
        a3Var.b2.setFieldText("");
        a3Var.k0(j10 <= 0);
    }

    @Override // org.telegram.ui.Components.wi
    public final void K0() {
        this.a.b2.P();
    }

    @Override // org.telegram.ui.Components.wi
    public final /* synthetic */ boolean R1() {
        return false;
    }

    @Override // org.telegram.ui.Components.wi
    public final void W1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
        AccountInstance accountInstance;
        a3 a3Var = this.a;
        TL_stories.StoryItem storyItem = a3Var.O1.a;
        if (storyItem == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        accountInstance = a3Var.getAccountInstance();
        SendMessagesHelper.prepareSendingAudioDocuments(accountInstance, arrayList, charSequence != null ? charSequence : null, a3Var.B1, null, null, storyItem, z10, i10, i11, null, null, j3, z11, j10);
        a3Var.k0(j10 <= 0);
    }

    @Override // org.telegram.ui.Components.wi
    public final boolean e0() {
        return this.a.N0();
    }

    @Override // org.telegram.ui.Components.wi
    public final void y0(jh jhVar) {
        NotificationCenter.getInstance(this.a.C2).doOnIdle(jhVar);
    }

    @Override // org.telegram.ui.Components.wi
    public final /* synthetic */ void U0(Object obj) {
    }

    @Override // org.telegram.ui.Components.wi
    public final /* synthetic */ void i1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.wi
    public final /* synthetic */ void v0() {
    }
}
