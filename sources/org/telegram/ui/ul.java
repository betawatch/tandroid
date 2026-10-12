package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class ul implements org.telegram.ui.Components.ti {
    public final /* synthetic */ fo a;

    public ul(fo foVar) {
        this.a = foVar;
    }

    @Override // org.telegram.ui.Components.ti
    public final void H() {
        this.a.Y.N();
    }

    @Override // org.telegram.ui.Components.ti
    public final void W(TLRPC.User user) {
        String publicUsername = UserObject.getPublicUsername(user);
        fo foVar = this.a;
        if (foVar.Y == null || user == null || TextUtils.isEmpty(publicUsername)) {
            return;
        }
        foVar.Y.setFieldText("@" + publicUsername + " ");
        foVar.Y.F0();
    }

    @Override // org.telegram.ui.Components.ti
    public final void g0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        bi.w3 w3Var;
        HashMap<Object, Object> hashMap;
        boolean z14;
        int i13;
        int i14;
        boolean z15;
        ArrayList arrayList;
        boolean z16;
        HashMap<Object, Object> hashMap2;
        boolean z17;
        String str;
        TLRPC.Message message;
        fo foVar = this.a;
        if (foVar.getParentActivity() == null || (w3Var = foVar.J1) == null) {
            return;
        }
        boolean z18 = w3Var.G;
        MessageObject messageObject = w3Var.K1;
        foVar.p5 = messageObject;
        if (messageObject != null && (message = messageObject.messageOwner) != null) {
            message.invert_media = z12;
        }
        if (i10 != 8 && i10 != 7 && (i10 != 4 || w3Var.j0.getSelectedPhotos().isEmpty())) {
            bi.w3 w3Var2 = foVar.J1;
            if (w3Var2 != null) {
                w3Var2.dismissWithButtonClick(i10);
            }
            foVar.Ea(i10);
            return;
        }
        bi.w3 w3Var3 = foVar.J1;
        if (w3Var3 != null && i10 != 8) {
            w3Var3.dismiss(true);
        }
        HashMap<Object, Object> selectedPhotos = foVar.J1.j0.getSelectedPhotos();
        ArrayList<Object> selectedPhotosOrder = foVar.J1.j0.getSelectedPhotosOrder();
        if (selectedPhotos.isEmpty()) {
            hashMap = selectedPhotos;
        } else {
            int ceil = (int) Math.ceil(selectedPhotos.size() / 10.0f);
            int i15 = 0;
            while (i15 < ceil) {
                int i16 = i15 * 10;
                int min = Math.min(10, selectedPhotos.size() - i16);
                ArrayList arrayList2 = new ArrayList();
                int i17 = 0;
                while (i17 < min) {
                    int i18 = i16 + i17;
                    if (i18 >= selectedPhotosOrder.size()) {
                        hashMap2 = selectedPhotos;
                        z17 = z18;
                    } else {
                        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) selectedPhotos.get(selectedPhotosOrder.get(i18));
                        SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                        sendingMediaInfo.imagePath = photoEntry.imagePath;
                        boolean isLivePhoto = photoEntry.isLivePhoto();
                        sendingMediaInfo.isLivePhoto = isLivePhoto;
                        boolean z19 = photoEntry.isVideo;
                        if (z18 && isLivePhoto) {
                            sendingMediaInfo.isLivePhoto = false;
                            z19 = false;
                        }
                        if (z19 || (str = photoEntry.imagePath) == null) {
                            String str2 = photoEntry.path;
                            if (str2 != null) {
                                sendingMediaInfo.path = str2;
                            }
                        } else {
                            sendingMediaInfo.path = str;
                            if (!z18 && photoEntry.isHighQuality()) {
                                sendingMediaInfo.originalPhotoEntry = photoEntry.clone();
                            }
                        }
                        sendingMediaInfo.thumbPath = photoEntry.thumbPath;
                        sendingMediaInfo.coverPath = photoEntry.coverPath;
                        sendingMediaInfo.coverPhoto = photoEntry.coverPhoto;
                        sendingMediaInfo.isVideo = z19;
                        sendingMediaInfo.discardLivePhoto = photoEntry.isUnalivePhoto();
                        hashMap2 = selectedPhotos;
                        z17 = z18;
                        sendingMediaInfo.livePhotoVideoOffset = photoEntry.livePhotoVideoOffset;
                        sendingMediaInfo.livePhotoTimestampUs = photoEntry.livePhotoTimestampUs;
                        CharSequence charSequence = photoEntry.caption;
                        sendingMediaInfo.caption = charSequence != null ? charSequence.toString() : null;
                        sendingMediaInfo.entities = photoEntry.entities;
                        sendingMediaInfo.masks = photoEntry.stickers;
                        sendingMediaInfo.ttl = photoEntry.ttl;
                        sendingMediaInfo.videoEditedInfo = photoEntry.editedInfo;
                        sendingMediaInfo.canDeleteAfter = photoEntry.canDeleteAfter;
                        sendingMediaInfo.updateStickersOrder = SendMessagesHelper.checkUpdateStickersOrder(photoEntry.caption);
                        sendingMediaInfo.hasMediaSpoilers = photoEntry.hasSpoiler;
                        sendingMediaInfo.stars = photoEntry.starsAmount;
                        sendingMediaInfo.highQuality = !z17 && photoEntry.isHighQuality();
                        arrayList2.add(sendingMediaInfo);
                        photoEntry.reset();
                    }
                    i17++;
                    z18 = z17;
                    selectedPhotos = hashMap2;
                }
                HashMap<Object, Object> hashMap3 = selectedPhotos;
                boolean z20 = z18;
                if (i15 == 0) {
                    foVar.o8(((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).caption, ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).entities);
                    z14 = ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).updateStickersOrder;
                } else {
                    z14 = false;
                }
                MessageObject messageObject2 = foVar.p5;
                if (messageObject2 == null || !messageObject2.needResendWhenEdit()) {
                    i13 = ceil;
                    i14 = i15;
                    SendMessagesHelper.prepareSendingMedia(foVar.getAccountInstance(), arrayList2, foVar.T5, foVar.n5, foVar.X3, null, foVar.l5, i10 == 4 || z13, z10, foVar.p5, z11, i11, i12, foVar.R3, z14, null, foVar.H8(), j10, z12, j11, foVar.S8(), foVar.g5);
                } else {
                    MessageSuggestionParams messageSuggestionParams = foVar.g5;
                    if (messageSuggestionParams == null) {
                        messageSuggestionParams = MessageSuggestionParams.of(foVar.p5.messageOwner.suggested_post);
                    }
                    MessageSuggestionParams messageSuggestionParams2 = messageSuggestionParams;
                    AccountInstance accountInstance = foVar.getAccountInstance();
                    int i19 = ceil;
                    long j12 = foVar.T5;
                    MessageObject messageObject3 = foVar.p5;
                    int i20 = i15;
                    MessageObject messageObject4 = foVar.X3;
                    un unVar = foVar.l5;
                    if (i10 == 4 || z13) {
                        z15 = 4;
                        arrayList = arrayList2;
                        z16 = true;
                    } else {
                        z15 = 4;
                        arrayList = arrayList2;
                        z16 = false;
                    }
                    i14 = i20;
                    i13 = i19;
                    SendMessagesHelper.prepareSendingMedia(accountInstance, arrayList, j12, messageObject3, messageObject4, null, unVar, z16, z10, null, z11, i11, i12, foVar.R3, z14, null, foVar.H8(), j10, z12, j11, foVar.S8(), messageSuggestionParams2);
                }
                i15 = i14 + 1;
                ceil = i13;
                selectedPhotos = hashMap3;
                z18 = z20;
            }
            hashMap = selectedPhotos;
            foVar.B6();
            foVar.Y.setFieldText("");
        }
        if (i11 != 0) {
            if (foVar.S3 == -1) {
                foVar.S3 = 0;
            }
            foVar.S3 += hashMap.size();
            foVar.Ic(true);
        }
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ boolean p0() {
        return false;
    }

    @Override // org.telegram.ui.Components.ti
    public final void v(org.telegram.ui.Components.hh hhVar) {
        this.a.k8(hhVar);
    }

    @Override // org.telegram.ui.Components.ti
    public final boolean x() {
        return this.a.U9();
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ void U(Object obj) {
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ void z() {
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ void r0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}
