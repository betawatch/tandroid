package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class qt0 extends fu0 {
    public final ImageReceiver.BitmapHolder a;
    public final /* synthetic */ ou0 b;
    public final /* synthetic */ MessageObject c;
    public final /* synthetic */ MediaController.PhotoEntry d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ PhotoViewer g;

    public qt0(PhotoViewer photoViewer, ou0 ou0Var, MessageObject messageObject, MediaController.PhotoEntry photoEntry, boolean z4, boolean z10) {
        this.g = photoViewer;
        this.b = ou0Var;
        this.c = messageObject;
        this.d = photoEntry;
        this.e = z4;
        this.f = z10;
        this.a = photoViewer.z4.getBitmapSafe();
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        ou0 ou0Var = this.b;
        if (ou0Var != null) {
            return ou0Var.E(this.c, null, 0, z4, false);
        }
        return null;
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final void L(VideoEditedInfo videoEditedInfo) {
        MediaController.PhotoEntry photoEntry = this.d;
        if (photoEntry.isCropped || photoEntry.isPainted || photoEntry.isFiltered || videoEditedInfo != null || !TextUtils.isEmpty(photoEntry.caption)) {
            c0(videoEditedInfo, false, 0, true, false);
        }
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final MessageObject U() {
        return this.c;
    }

    public final void c0(VideoEditedInfo videoEditedInfo, boolean z4, int i10, boolean z10, boolean z11) {
        PhotoViewer photoViewer = this.g;
        if (photoViewer.i4 != null) {
            nn nnVar = null;
            MessageObject messageObject = this.c;
            MessageObject messageObject2 = z10 ? messageObject : null;
            MediaController.PhotoEntry photoEntry = this.d;
            if (messageObject2 != null && !TextUtils.isEmpty(photoEntry.caption)) {
                messageObject2.editingMessage = photoEntry.caption;
                messageObject2.editingMessageEntities = photoEntry.entities;
            }
            if (z10 || messageObject == null) {
                xn xnVar = photoViewer.i4;
                messageObject = xnVar.k5;
                nnVar = xnVar.i5;
            }
            nn nnVar2 = nnVar;
            MessageObject messageObject3 = messageObject;
            if (photoEntry.isVideo) {
                if (videoEditedInfo != null) {
                    AccountInstance accountInstance = photoViewer.i4.getAccountInstance();
                    String str = photoEntry.path;
                    long a2 = photoViewer.i4.a();
                    xn xnVar2 = photoViewer.i4;
                    SendMessagesHelper.prepareSendingVideo(accountInstance, str, videoEditedInfo, null, null, a2, messageObject3, xnVar2.U3, null, nnVar2, photoEntry.entities, photoEntry.ttl, messageObject2, z4, i10, 0, z11, photoEntry.hasSpoiler, photoEntry.caption, xnVar2.C8(), 0L, 0L, photoViewer.i4.N8(), photoViewer.i4.d5);
                    return;
                }
                MessageObject messageObject4 = messageObject2;
                AccountInstance accountInstance2 = photoViewer.i4.getAccountInstance();
                String str2 = photoEntry.path;
                long a10 = photoViewer.i4.a();
                xn xnVar3 = photoViewer.i4;
                SendMessagesHelper.prepareSendingVideo(accountInstance2, str2, null, null, null, a10, messageObject3, xnVar3.U3, null, nnVar2, photoEntry.entities, photoEntry.ttl, messageObject4, z4, i10, 0, z11, photoEntry.hasSpoiler, photoEntry.caption, xnVar3.C8(), 0L, 0L, photoViewer.i4.N8(), photoViewer.i4.d5);
                return;
            }
            MessageObject messageObject5 = messageObject2;
            if (photoEntry.imagePath != null) {
                AccountInstance accountInstance3 = photoViewer.i4.getAccountInstance();
                String str3 = photoEntry.imagePath;
                String str4 = photoEntry.thumbPath;
                long a11 = photoViewer.i4.a();
                xn xnVar4 = photoViewer.i4;
                SendMessagesHelper.prepareSendingPhoto(accountInstance3, str3, str4, null, a11, messageObject3, xnVar4.U3, null, nnVar2, photoEntry.entities, photoEntry.stickers, null, photoEntry.ttl, messageObject5, videoEditedInfo, z4, i10, 0, 0, z11, photoEntry.caption, xnVar4.C8(), 0L, 0L, photoViewer.i4.N8(), photoViewer.i4.d5);
                return;
            }
            if (photoEntry.path != null) {
                AccountInstance accountInstance4 = photoViewer.i4.getAccountInstance();
                String str5 = photoEntry.path;
                String str6 = photoEntry.thumbPath;
                long a12 = photoViewer.i4.a();
                xn xnVar5 = photoViewer.i4;
                SendMessagesHelper.prepareSendingPhoto(accountInstance4, str5, str6, null, a12, messageObject3, xnVar5.U3, null, nnVar2, photoEntry.entities, photoEntry.stickers, null, photoEntry.ttl, messageObject5, videoEditedInfo, z4, i10, 0, 0, z11, photoEntry.caption, xnVar5.C8(), 0L, 0L, photoViewer.i4.N8(), photoViewer.i4.d5);
            }
        }
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final boolean g() {
        return false;
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final ImageReceiver.BitmapHolder j(int i10) {
        return this.a;
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z4, int i11, int i12, boolean z10) {
        c0(videoEditedInfo, z4, i11, false, z10);
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final boolean p() {
        return this.b != null && this.e;
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final boolean r() {
        return this.b != null && this.f;
    }
}
