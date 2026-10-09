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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ql implements org.telegram.ui.Components.wi {
    public final /* synthetic */ zn a;

    public ql(zn znVar) {
        this.a = znVar;
    }

    @Override // org.telegram.ui.Components.wi
    public final void I1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        ai.h4 h4Var;
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
        zn znVar = this.a;
        if (znVar.getParentActivity() == null || (h4Var = znVar.J1) == null) {
            return;
        }
        boolean z18 = h4Var.G;
        MessageObject messageObject = h4Var.K1;
        znVar.p5 = messageObject;
        if (messageObject != null && (message = messageObject.messageOwner) != null) {
            message.invert_media = z12;
        }
        if (i10 != 8 && i10 != 7 && (i10 != 4 || h4Var.j0.getSelectedPhotos().isEmpty())) {
            ai.h4 h4Var2 = znVar.J1;
            if (h4Var2 != null) {
                h4Var2.dismissWithButtonClick(i10);
            }
            znVar.Ea(i10);
            return;
        }
        ai.h4 h4Var3 = znVar.J1;
        if (h4Var3 != null && i10 != 8) {
            h4Var3.dismiss(true);
        }
        HashMap<Object, Object> selectedPhotos = znVar.J1.j0.getSelectedPhotos();
        ArrayList<Object> selectedPhotosOrder = znVar.J1.j0.getSelectedPhotosOrder();
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
                    znVar.o8(((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).caption, ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).entities);
                    z14 = ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).updateStickersOrder;
                } else {
                    z14 = false;
                }
                MessageObject messageObject2 = znVar.p5;
                if (messageObject2 == null || !messageObject2.needResendWhenEdit()) {
                    i13 = ceil;
                    i14 = i15;
                    SendMessagesHelper.prepareSendingMedia(znVar.getAccountInstance(), arrayList2, znVar.T5, znVar.n5, znVar.X3, null, znVar.l5, i10 == 4 || z13, z10, znVar.p5, z11, i11, i12, znVar.R3, z14, null, znVar.H8(), j3, z12, j10, znVar.S8(), znVar.g5);
                } else {
                    MessageSuggestionParams messageSuggestionParams = znVar.g5;
                    if (messageSuggestionParams == null) {
                        messageSuggestionParams = MessageSuggestionParams.of(znVar.p5.messageOwner.suggested_post);
                    }
                    MessageSuggestionParams messageSuggestionParams2 = messageSuggestionParams;
                    AccountInstance accountInstance = znVar.getAccountInstance();
                    int i19 = ceil;
                    long j11 = znVar.T5;
                    MessageObject messageObject3 = znVar.p5;
                    int i20 = i15;
                    MessageObject messageObject4 = znVar.X3;
                    pn pnVar = znVar.l5;
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
                    SendMessagesHelper.prepareSendingMedia(accountInstance, arrayList, j11, messageObject3, messageObject4, null, pnVar, z16, z10, null, z11, i11, i12, znVar.R3, z14, null, znVar.H8(), j3, z12, j10, znVar.S8(), messageSuggestionParams2);
                }
                i15 = i14 + 1;
                ceil = i13;
                selectedPhotos = hashMap3;
                z18 = z20;
            }
            hashMap = selectedPhotos;
            znVar.B6();
            znVar.Y.setFieldText("");
        }
        if (i11 != 0) {
            if (znVar.S3 == -1) {
                znVar.S3 = 0;
            }
            znVar.S3 += hashMap.size();
            znVar.Ic(true);
        }
    }

    @Override // org.telegram.ui.Components.wi
    public final void P0() {
        this.a.Y.N();
    }

    @Override // org.telegram.ui.Components.wi
    public final /* synthetic */ boolean Y1() {
        return false;
    }

    @Override // org.telegram.ui.Components.wi
    public final void f0(org.telegram.ui.Components.jh jhVar) {
        this.a.k8(jhVar);
    }

    @Override // org.telegram.ui.Components.wi
    public final boolean i0() {
        return this.a.U9();
    }

    @Override // org.telegram.ui.Components.wi
    public final void p1(TLRPC.User user) {
        String publicUsername = UserObject.getPublicUsername(user);
        zn znVar = this.a;
        if (znVar.Y == null || user == null || TextUtils.isEmpty(publicUsername)) {
            return;
        }
        znVar.Y.setFieldText("@" + publicUsername + " ");
        znVar.Y.F0();
    }

    @Override // org.telegram.ui.Components.wi
    public final /* synthetic */ void B0() {
    }

    @Override // org.telegram.ui.Components.wi
    public final /* synthetic */ void a1(Object obj) {
    }

    @Override // org.telegram.ui.Components.wi
    public final /* synthetic */ void c2(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }
}
