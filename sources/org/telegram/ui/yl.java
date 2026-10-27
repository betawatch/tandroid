package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class yl implements org.telegram.ui.Cells.s0 {
    public final /* synthetic */ hm a;

    public yl(hm hmVar) {
        this.a = hmVar;
    }

    @Override // org.telegram.ui.Cells.s0
    public final void G(org.telegram.ui.Cells.v0 v0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
        int i10;
        tk tkVar = this.a.Q.Na;
        FrameLayout frameLayout = tkVar.G;
        HashMap hashMap = tkVar.f;
        Random random = tkVar.h;
        ArrayList arrayList = tkVar.F;
        if (arrayList.size() <= 12 && v0Var.getPhotoImage().hasNotThumb()) {
            float imageHeight = v0Var.getPhotoImage().getImageHeight();
            float imageWidth = v0Var.getPhotoImage().getImageWidth();
            if (imageHeight <= 0.0f || imageWidth <= 0.0f) {
                return;
            }
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (i11 < arrayList.size()) {
                if (((py) arrayList.get(i11)).p == v0Var.getMessageObject().getId()) {
                    i12++;
                    if (((py) arrayList.get(i11)).r.getLottieAnimation() == null || ((py) arrayList.get(i11)).r.getLottieAnimation().y()) {
                        return;
                    }
                }
                if (((py) arrayList.get(i11)).q == null || document == null) {
                    i10 = i11;
                } else {
                    i10 = i11;
                    if (((py) arrayList.get(i11)).q.id == document.id) {
                        i13++;
                    }
                }
                i11 = i10 + 1;
            }
            if (i12 >= 4) {
                return;
            }
            py pyVar = new py();
            pyVar.h = true;
            if (!pyVar.i) {
                pyVar.f = ((random.nextInt() % 101) / 100.0f) * (imageWidth / 4.0f);
                pyVar.g = ((random.nextInt() % 101) / 100.0f) * (imageHeight / 4.0f);
            }
            pyVar.p = v0Var.getMessageObject().getId();
            pyVar.m = true;
            pyVar.r.setAllowStartAnimation(true);
            int f7 = qy.f();
            if (i13 > 0) {
                Integer num = (Integer) hashMap.get(Long.valueOf(document.id));
                int intValue = num == null ? 0 : num.intValue();
                hashMap.put(Long.valueOf(document.id), Integer.valueOf((intValue + 1) % 4));
                pyVar.r.setUniqKeyPrefix(intValue + "_" + pyVar.p + "_");
            }
            pyVar.q = document;
            pyVar.r.setImage(ImageLocation.getForDocument(videoSize, document), a1.g.k(f7, f7, "_"), null, "tgs", tkVar.c, 1);
            pyVar.r.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
            pyVar.r.setAutoRepeat(0);
            if (pyVar.r.getLottieAnimation() != null) {
                if (pyVar.h) {
                    pyVar.r.getLottieAnimation().N(0, false, true);
                }
                pyVar.r.getLottieAnimation().start();
            }
            arrayList.add(pyVar);
            if (tkVar.n) {
                pyVar.r.onAttachedToWindow();
                pyVar.r.setParentView(frameLayout);
            }
            frameLayout.invalidate();
        }
    }

    @Override // org.telegram.ui.Cells.s0
    public final void H0(org.telegram.ui.Cells.v0 v0Var, String str) {
        c(v0Var);
        wn wnVar = this.a.Q;
        vg.c0.T(wnVar, str, wnVar.ac);
    }

    @Override // org.telegram.ui.Cells.s0
    public final boolean M0(org.telegram.ui.Cells.v0 v0Var, float f7, float f10) {
        boolean z10;
        wn wnVar = this.a.Q;
        z10 = ((org.telegram.ui.ActionBar.r2) wnVar).inPreviewMode;
        if (z10) {
            return false;
        }
        return wnVar.R7(v0Var, false, false, f7, f10, true, true, false);
    }

    @Override // org.telegram.ui.Cells.s0
    public final void P0(org.telegram.ui.Cells.v0 v0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        this.a.Q.f8(v0Var, reactionCount, z10, f7, f10);
    }

    @Override // org.telegram.ui.Cells.s0
    public final /* synthetic */ long a() {
        return 0L;
    }

    @Override // org.telegram.ui.Cells.s0
    public final long b() {
        return this.a.Q.b();
    }

    public final void c(org.telegram.ui.Cells.v0 v0Var) {
        wn wnVar = this.a.Q;
        qf.c cVar = wnVar.ac;
        if (cVar != null) {
            cVar.a(true);
        }
        wnVar.ac = v0Var.getMessageObject() == null ? null : new an(this, v0Var, 6);
    }

    @Override // org.telegram.ui.Cells.s0
    public final boolean d() {
        return false;
    }

    @Override // org.telegram.ui.Cells.s0
    public final void e(org.telegram.ui.Cells.v0 v0Var, int i10) {
        g4 g4Var = new g4(this, v0Var, i10, 4);
        wn wnVar = this.a.Q;
        if (!wnVar.A0.N) {
            g4Var.run();
        } else {
            wnVar.Ab(false, true, true);
            AndroidUtilities.runOnUIThread(g4Var, 80L);
        }
    }

    @Override // org.telegram.ui.Cells.s0
    public final void f(org.telegram.ui.Cells.v0 v0Var) {
        uj ujVar;
        wn wnVar = this.a.Q;
        MessageObject messageObject = v0Var.getMessageObject();
        if (messageObject == null) {
            return;
        }
        messageObject.forceUpdate = true;
        rj rjVar = wnVar.x0;
        if (rjVar != null && (ujVar = wnVar.z0) != null && ujVar.y < 0) {
            int childCount = rjVar.getChildCount() - 1;
            while (true) {
                if (childCount < 0) {
                    break;
                }
                View childAt = wnVar.x0.getChildAt(childCount);
                wnVar.x0.getClass();
                if (RecyclerView.R(childAt) >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.s1) {
                        if (((org.telegram.ui.Cells.s1) childAt).getCurrentMessagesGroup() == null) {
                            wnVar.Y8(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                        wnVar.Y8(childAt);
                        break;
                    }
                }
                childCount--;
            }
        }
        wnVar.Ic(messageObject, false);
    }

    @Override // org.telegram.ui.Cells.s0
    public final void g(org.telegram.ui.Cells.v0 v0Var, int i10, int i11) {
        i2.b0 b0Var = new i2.b0(this, v0Var, i10, i11, 3);
        wn wnVar = this.a.Q;
        if (!wnVar.A0.N) {
            b0Var.run();
        } else {
            wnVar.Ab(false, true, true);
            AndroidUtilities.runOnUIThread(b0Var, 80L);
        }
    }

    @Override // org.telegram.ui.Cells.s0
    public final void i0(long j10) {
        wn wnVar = this.a.Q;
        int i10 = wn.fd;
        wnVar.Aa(j10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Cells.s0
    public final void k(org.telegram.ui.Cells.v0 v0Var) {
        TLRPC.VideoSize videoSize;
        TLRPC.VideoSize videoSize2;
        int i10;
        TLRPC.WallPaper wallPaper;
        String str;
        MessageObject messageObject = v0Var.getMessageObject();
        PhotoViewer v12 = PhotoViewer.v1();
        wn wnVar = this.a.Q;
        v12.N2(null, wnVar, wnVar.ua);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 640);
        if (v0Var.getMessageObject().type == 24) {
            di.y9 orCreateStoryViewer = wnVar.getOrCreateStoryViewer();
            rj rjVar = wnVar.x0;
            orCreateStoryViewer.getClass();
            MessageObject messageObject2 = v0Var.getMessageObject();
            if (wnVar.getParentActivity() != null && messageObject2.type == 24) {
                TLRPC.MessageMedia messageMedia = messageObject2.messageOwner.media;
                TL_stories.StoryItem storyItem = messageMedia.storyItem;
                storyItem.dialogId = DialogObject.getPeerDialogId(messageMedia.peer);
                storyItem.messageId = messageObject2.getId();
                orCreateStoryViewer.G(wnVar.getParentActivity(), messageObject2.messageOwner.media.storyItem, di.q7.a(rjVar));
                return;
            }
            return;
        }
        if (v0Var.getMessageObject().type == 22) {
            i10 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
            MessagesController messagesController = MessagesController.getInstance(i10);
            RadialProgress2 radialProgress2 = v0Var.J1;
            if (radialProgress2 != null && radialProgress2.i.q == 3 && messageObject.getId() < 0 && (str = messagesController.uploadingWallpaper) != null && TextUtils.equals(messageObject.messageOwner.action.wallpaper.uploadingImage, str)) {
                messagesController.cancelUploadWallpaper();
                wnVar.Sa(messageObject);
                return;
            }
            MessageObject messageObject3 = v0Var.P0;
            if (messageObject3 == null || !v0Var.N(messageObject3) || v0Var.x1 == null) {
                wnVar.Nb();
                return;
            }
            TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
            if (messageAction instanceof TLRPC.TL_messageActionSetChatWallPaper) {
                TLRPC.WallPaper wallPaper2 = ((TLRPC.TL_messageActionSetChatWallPaper) messageAction).wallpaper;
                if (wallPaper2.pattern || wallPaper2.document == null) {
                    String str2 = wallPaper2.slug;
                    TLRPC.WallPaperSettings wallPaperSettings = wallPaper2.settings;
                    di1 di1Var = new di1(str2, wallPaperSettings.background_color, wallPaperSettings.second_background_color, wallPaperSettings.third_background_color, wallPaperSettings.fourth_background_color, AndroidUtilities.getWallpaperRotation(wallPaperSettings.rotation, false), r3.intensity / 100.0f, wallPaper2.settings.motion, null);
                    wallPaper = di1Var;
                    if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                        di1Var.g = (TLRPC.TL_wallPaper) wallPaper2;
                        wallPaper = di1Var;
                    }
                } else {
                    wallPaper = wallPaper2;
                }
                boolean q5 = org.telegram.ui.ActionBar.y6.I.q();
                dc1 dc1Var = new dc1(wallPaper, wnVar, q5);
                TLRPC.WallPaperSettings wallPaperSettings2 = wallPaper2.settings;
                if (wallPaperSettings2 != null) {
                    boolean z10 = wallPaperSettings2.blur;
                    boolean z11 = wallPaperSettings2.motion;
                    dc1Var.G1 = z10;
                    dc1Var.F1 = z11;
                    dc1Var.o1 = wallPaperSettings2.intensity / 100.0f;
                }
                dc1Var.r0 = messageObject;
                dc1Var.d1(messageObject.getDialogId());
                dc1Var.a.a = wnVar.ua;
                dc1Var.q1 = new ec1(wnVar, q5);
                wnVar.presentFragment(dc1Var);
                return;
            }
            return;
        }
        ArrayList<TLRPC.VideoSize> arrayList = messageObject.messageOwner.action.photo.video_sizes;
        if (arrayList == null || arrayList.isEmpty()) {
            videoSize = null;
            videoSize2 = null;
        } else {
            videoSize = FileLoader.getClosestVideoSizeWithSize(messageObject.messageOwner.action.photo.video_sizes, MediaDataController.MAX_STYLE_RUNS_COUNT);
            videoSize2 = FileLoader.getEmojiMarkup(messageObject.messageOwner.action.photo.video_sizes);
        }
        if (v0Var.getMessageObject().type != 21 || messageObject.isOutOwner()) {
            if (videoSize != null) {
                PhotoViewer.v1().g2(videoSize.location, ImageLocation.getForPhoto(videoSize, messageObject.messageOwner.action.photo), wnVar.Wa);
                if (v0Var.getMessageObject().type == 21) {
                    PhotoViewer.v1().R2(LocaleController.getString(R.string.SuggestedVideo));
                    return;
                }
                return;
            }
            if (closestPhotoSizeWithSize == null) {
                PhotoViewer.v1().i2(messageObject, null, 0L, 0L, 0L, wnVar.Wa);
                return;
            }
            PhotoViewer.v1().g2(closestPhotoSizeWithSize.location, ImageLocation.getForPhoto(closestPhotoSizeWithSize, messageObject.messageOwner.action.photo), wnVar.Wa);
            if (v0Var.getMessageObject().type == 21) {
                PhotoViewer.v1().R2(LocaleController.getString(R.string.SuggestedPhoto));
                return;
            }
            return;
        }
        if (messageObject.settingAvatar) {
            return;
        }
        if (videoSize2 != null) {
            org.telegram.ui.Components.g50 g50Var = new org.telegram.ui.Components.g50(0, true, true);
            g50Var.a = wnVar;
            g50Var.e();
            g50Var.c.j0.s0(null, videoSize2, 0L);
            g50Var.b = new ag.j0(wnVar, new TLRPC.FileLocation[1], new TLRPC.FileLocation[1], wnVar.getUserConfig().getClientUserId(), 0);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        ImageLocation.getForPhoto(videoSize, messageObject.messageOwner.action.photo);
        FileLoader fileLoader = wnVar.getFileLoader();
        File pathToAttach = videoSize == null ? fileLoader.getPathToAttach(messageObject.messageOwner.action.photo) : fileLoader.getPathToAttach(videoSize);
        File file = new File(FileLoader.getDirectory(4), pathToAttach.getName());
        if (!pathToAttach.exists()) {
            if (!file.exists()) {
                return;
            } else {
                pathToAttach = file;
            }
        }
        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, pathToAttach.getAbsolutePath(), 0, false, 0, 0, 0L);
        photoEntry.caption = wnVar.Y.getFieldText();
        photoEntry.isVideo = videoSize != null;
        arrayList2.add(photoEntry);
        PhotoViewer.v1().j2(arrayList2, 0, 1, false, new xl(this, messageObject, photoEntry), null);
        if (photoEntry.isVideo) {
            PhotoViewer.v1().R2(LocaleController.getString(R.string.SuggestedVideo));
        } else {
            PhotoViewer.v1().R2(LocaleController.getString(R.string.SuggestedPhoto));
        }
        org.telegram.ui.Components.e50 e50Var = new org.telegram.ui.Components.e50(1, wnVar.getUserConfig().getCurrentUser());
        e50Var.e = videoSize != null;
        e50Var.b = wnVar.getMessagesController().getUser(Long.valueOf(wnVar.j6));
        PhotoViewer.v1().A2(e50Var);
    }

    @Override // org.telegram.ui.Cells.s0
    public final void l0(org.telegram.ui.Cells.v0 v0Var) {
        wn wnVar = this.a.Q;
        MessageObject messageObject = v0Var.getMessageObject();
        if (messageObject == null || wnVar.d2 == null) {
            return;
        }
        if (ChatObject.isMonoForum(wnVar.e)) {
            wnVar.d2.n(messageObject.getMonoForumTopicId(), true);
        } else {
            wnVar.d2.n(messageObject.getTopicId(), true);
        }
    }

    @Override // org.telegram.ui.Cells.s0
    public final void t(org.telegram.ui.Cells.v0 v0Var) {
        wn wnVar = this.a.Q;
        MessageObject messageObject = v0Var.getMessageObject();
        if (messageObject != null && messageObject.type == 22 && !v0Var.getMessageObject().isOutOwner() && v0Var.getMessageObject().isWallpaperForBoth() && v0Var.getMessageObject().isCurrentWallpaper()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wnVar.getParentActivity(), 0, wnVar.getResourceProvider());
            alertDialog$Builder.a.R = LocaleController.getString(R.string.RemoveWallpaperTitle);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.RemoveWallpaperMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new y0(this, 23));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
            wnVar.showDialog(e2Var);
            TextView textView = (TextView) e2Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.q7, wnVar.getResourceProvider());
            }
        }
    }

    @Override // org.telegram.ui.Cells.s0
    public final void v0(org.telegram.ui.Cells.v0 v0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
        int i10;
        wn wnVar = this.a.Q;
        if (str != null) {
            c(v0Var);
            qf.c cVar = wnVar.ac;
            vg.g0 g0Var = vg.g0.S0;
            vg.c0.T(LaunchActivity.R(), str, cVar);
            return;
        }
        i10 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
        tg.m1 m1Var = new tg.m1(wnVar, i10, wnVar.i(), new tg.k(tL_premiumGiftOption), null, wnVar.ua);
        m1Var.J0 = false;
        m1Var.c0 = v0Var.getMessageObject().isOut();
        wnVar.showDialog(m1Var);
    }

    @Override // org.telegram.ui.Cells.s0
    public final org.telegram.ui.ActionBar.r2 y() {
        return this.a.Q;
    }

    @Override // org.telegram.ui.Cells.s0
    public final /* synthetic */ void z(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }
}
