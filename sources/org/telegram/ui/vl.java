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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class vl implements org.telegram.ui.Cells.s0 {
    public final /* synthetic */ em a;

    public vl(em emVar) {
        this.a = emVar;
    }

    @Override // org.telegram.ui.Cells.s0
    public final void C1(org.telegram.ui.Cells.v0 v0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
        int i10;
        sn snVar = this.a.Q;
        if (str != null) {
            b(v0Var);
            pf.c cVar = snVar.Nb;
            ug.e0 e0Var = ug.e0.S0;
            ug.a0.T(LaunchActivity.R(), str, cVar);
            return;
        }
        i10 = ((org.telegram.ui.ActionBar.o2) snVar).currentAccount;
        sg.m1 m1Var = new sg.m1(snVar, i10, snVar.i(), new sg.k(tL_premiumGiftOption), null, snVar.qa);
        m1Var.J0 = false;
        m1Var.c0 = v0Var.getMessageObject().isOut();
        snVar.showDialog(m1Var);
    }

    @Override // org.telegram.ui.Cells.s0
    public final org.telegram.ui.ActionBar.o2 L0() {
        return this.a.Q;
    }

    @Override // org.telegram.ui.Cells.s0
    public final void X(org.telegram.ui.Cells.v0 v0Var, int i10) {
        h4 h4Var = new h4(this, v0Var, i10, 4);
        sn snVar = this.a.Q;
        if (!snVar.A0.N) {
            h4Var.run();
        } else {
            snVar.rb(false, true, true);
            AndroidUtilities.runOnUIThread(h4Var, 80L);
        }
    }

    @Override // org.telegram.ui.Cells.s0
    public final void X1(org.telegram.ui.Cells.v0 v0Var, String str) {
        b(v0Var);
        sn snVar = this.a.Q;
        ug.a0.T(snVar, str, snVar.Nb);
    }

    @Override // org.telegram.ui.Cells.s0
    public final /* synthetic */ long a() {
        return 0L;
    }

    public final void b(org.telegram.ui.Cells.v0 v0Var) {
        sn snVar = this.a.Q;
        pf.c cVar = snVar.Nb;
        if (cVar != null) {
            cVar.a(true);
        }
        snVar.Nb = v0Var.getMessageObject() == null ? null : new wm(this, v0Var, 6);
    }

    @Override // org.telegram.ui.Cells.s0
    public final void b0(org.telegram.ui.Cells.v0 v0Var) {
        qj qjVar;
        sn snVar = this.a.Q;
        MessageObject messageObject = v0Var.getMessageObject();
        if (messageObject == null) {
            return;
        }
        messageObject.forceUpdate = true;
        nj njVar = snVar.x0;
        if (njVar != null && (qjVar = snVar.z0) != null && qjVar.y < 0) {
            int childCount = njVar.getChildCount() - 1;
            while (true) {
                if (childCount < 0) {
                    break;
                }
                View childAt = snVar.x0.getChildAt(childCount);
                snVar.x0.getClass();
                if (RecyclerView.R(childAt) >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        if (((org.telegram.ui.Cells.t1) childAt).getCurrentMessagesGroup() == null) {
                            snVar.Q8(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                        snVar.Q8(childAt);
                        break;
                    }
                }
                childCount--;
            }
        }
        snVar.yc(messageObject, false);
    }

    @Override // org.telegram.ui.Cells.s0
    public final void c1(org.telegram.ui.Cells.v0 v0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
        int i10;
        qk qkVar = this.a.Q.Ja;
        FrameLayout frameLayout = qkVar.G;
        HashMap hashMap = qkVar.f;
        Random random = qkVar.h;
        ArrayList arrayList = qkVar.F;
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
            pyVar.r.setImage(ImageLocation.getForDocument(videoSize, document), a1.g.k(f7, f7, "_"), null, "tgs", qkVar.c, 1);
            pyVar.r.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
            pyVar.r.setAutoRepeat(0);
            if (pyVar.r.getLottieAnimation() != null) {
                if (pyVar.h) {
                    pyVar.r.getLottieAnimation().N(0, false, true);
                }
                pyVar.r.getLottieAnimation().start();
            }
            arrayList.add(pyVar);
            if (qkVar.n) {
                pyVar.r.onAttachedToWindow();
                pyVar.r.setParentView(frameLayout);
            }
            frameLayout.invalidate();
        }
    }

    @Override // org.telegram.ui.Cells.s0
    public final long d() {
        return this.a.Q.d();
    }

    @Override // org.telegram.ui.Cells.s0
    public final boolean f() {
        return false;
    }

    @Override // org.telegram.ui.Cells.s0
    public final void g0(org.telegram.ui.Cells.v0 v0Var, int i10, int i11) {
        i2.z zVar = new i2.z(this, v0Var, i10, i11, 3);
        sn snVar = this.a.Q;
        if (!snVar.A0.N) {
            zVar.run();
        } else {
            snVar.rb(false, true, true);
            AndroidUtilities.runOnUIThread(zVar, 80L);
        }
    }

    @Override // org.telegram.ui.Cells.s0
    public final boolean h2(org.telegram.ui.Cells.v0 v0Var, float f7, float f10) {
        boolean z10;
        sn snVar = this.a.Q;
        z10 = ((org.telegram.ui.ActionBar.o2) snVar).inPreviewMode;
        if (z10) {
            return false;
        }
        return snVar.L7(v0Var, false, false, f7, f10, true, true, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Cells.s0
    public final void k0(org.telegram.ui.Cells.v0 v0Var) {
        TLRPC.VideoSize videoSize;
        TLRPC.VideoSize videoSize2;
        int i10;
        TLRPC.WallPaper wallPaper;
        String str;
        MessageObject messageObject = v0Var.getMessageObject();
        PhotoViewer u12 = PhotoViewer.u1();
        sn snVar = this.a.Q;
        u12.M2(null, snVar, snVar.qa);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 640);
        if (v0Var.getMessageObject().type == 24) {
            ci.z9 orCreateStoryViewer = snVar.getOrCreateStoryViewer();
            nj njVar = snVar.x0;
            orCreateStoryViewer.getClass();
            MessageObject messageObject2 = v0Var.getMessageObject();
            if (snVar.getParentActivity() != null && messageObject2.type == 24) {
                TLRPC.MessageMedia messageMedia = messageObject2.messageOwner.media;
                TL_stories.StoryItem storyItem = messageMedia.storyItem;
                storyItem.dialogId = DialogObject.getPeerDialogId(messageMedia.peer);
                storyItem.messageId = messageObject2.getId();
                orCreateStoryViewer.F(snVar.getParentActivity(), messageObject2.messageOwner.media.storyItem, ci.q7.a(njVar));
                return;
            }
            return;
        }
        if (v0Var.getMessageObject().type == 22) {
            i10 = ((org.telegram.ui.ActionBar.o2) snVar).currentAccount;
            MessagesController messagesController = MessagesController.getInstance(i10);
            RadialProgress2 radialProgress2 = v0Var.J1;
            if (radialProgress2 != null && radialProgress2.i.q == 3 && messageObject.getId() < 0 && (str = messagesController.uploadingWallpaper) != null && TextUtils.equals(messageObject.messageOwner.action.wallpaper.uploadingImage, str)) {
                messagesController.cancelUploadWallpaper();
                snVar.Ka(messageObject);
                return;
            }
            MessageObject messageObject3 = v0Var.P0;
            if (messageObject3 == null || !v0Var.N(messageObject3) || v0Var.x1 == null) {
                snVar.Db();
                return;
            }
            TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
            if (messageAction instanceof TLRPC.TL_messageActionSetChatWallPaper) {
                TLRPC.WallPaper wallPaper2 = ((TLRPC.TL_messageActionSetChatWallPaper) messageAction).wallpaper;
                if (wallPaper2.pattern || wallPaper2.document == null) {
                    String str2 = wallPaper2.slug;
                    TLRPC.WallPaperSettings wallPaperSettings = wallPaper2.settings;
                    zh1 zh1Var = new zh1(str2, wallPaperSettings.background_color, wallPaperSettings.second_background_color, wallPaperSettings.third_background_color, wallPaperSettings.fourth_background_color, AndroidUtilities.getWallpaperRotation(wallPaperSettings.rotation, false), r3.intensity / 100.0f, wallPaper2.settings.motion, null);
                    wallPaper = zh1Var;
                    if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                        zh1Var.g = (TLRPC.TL_wallPaper) wallPaper2;
                        wallPaper = zh1Var;
                    }
                } else {
                    wallPaper = wallPaper2;
                }
                boolean q6 = org.telegram.ui.ActionBar.k6.I.q();
                zb1 zb1Var = new zb1(wallPaper, snVar, q6);
                TLRPC.WallPaperSettings wallPaperSettings2 = wallPaper2.settings;
                if (wallPaperSettings2 != null) {
                    boolean z10 = wallPaperSettings2.blur;
                    boolean z11 = wallPaperSettings2.motion;
                    zb1Var.G1 = z10;
                    zb1Var.F1 = z11;
                    zb1Var.o1 = wallPaperSettings2.intensity / 100.0f;
                }
                zb1Var.r0 = messageObject;
                zb1Var.c1(messageObject.getDialogId());
                zb1Var.a.a = snVar.qa;
                zb1Var.q1 = new ac1(snVar, q6);
                snVar.presentFragment(zb1Var);
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
                PhotoViewer.u1().f2(videoSize.location, ImageLocation.getForPhoto(videoSize, messageObject.messageOwner.action.photo), snVar.Sa);
                if (v0Var.getMessageObject().type == 21) {
                    PhotoViewer.u1().Q2(LocaleController.getString(R.string.SuggestedVideo));
                    return;
                }
                return;
            }
            if (closestPhotoSizeWithSize == null) {
                PhotoViewer.u1().h2(messageObject, null, 0L, 0L, 0L, snVar.Sa);
                return;
            }
            PhotoViewer.u1().f2(closestPhotoSizeWithSize.location, ImageLocation.getForPhoto(closestPhotoSizeWithSize, messageObject.messageOwner.action.photo), snVar.Sa);
            if (v0Var.getMessageObject().type == 21) {
                PhotoViewer.u1().Q2(LocaleController.getString(R.string.SuggestedPhoto));
                return;
            }
            return;
        }
        if (messageObject.settingAvatar) {
            return;
        }
        if (videoSize2 != null) {
            org.telegram.ui.Components.e50 e50Var = new org.telegram.ui.Components.e50(0, true, true);
            e50Var.a = snVar;
            e50Var.e();
            e50Var.c.j0.r0(null, videoSize2, 0L);
            e50Var.b = new ai.y3(snVar, new TLRPC.FileLocation[1], new TLRPC.FileLocation[1], snVar.getUserConfig().getClientUserId(), 8);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        ImageLocation.getForPhoto(videoSize, messageObject.messageOwner.action.photo);
        FileLoader fileLoader = snVar.getFileLoader();
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
        photoEntry.caption = snVar.Y.getFieldText();
        photoEntry.isVideo = videoSize != null;
        arrayList2.add(photoEntry);
        PhotoViewer.u1().i2(arrayList2, 0, 1, false, new ul(this, messageObject, photoEntry), null);
        if (photoEntry.isVideo) {
            PhotoViewer.u1().Q2(LocaleController.getString(R.string.SuggestedVideo));
        } else {
            PhotoViewer.u1().Q2(LocaleController.getString(R.string.SuggestedPhoto));
        }
        org.telegram.ui.Components.c50 c50Var = new org.telegram.ui.Components.c50(1, snVar.getUserConfig().getCurrentUser());
        c50Var.e = videoSize != null;
        c50Var.b = snVar.getMessagesController().getUser(Long.valueOf(snVar.f6));
        PhotoViewer.u1().z2(c50Var);
    }

    @Override // org.telegram.ui.Cells.s0
    public final void k2(org.telegram.ui.Cells.v0 v0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        this.a.Q.Z7(v0Var, reactionCount, z10, f7, f10);
    }

    @Override // org.telegram.ui.Cells.s0
    public final void r0(org.telegram.ui.Cells.v0 v0Var) {
        sn snVar = this.a.Q;
        MessageObject messageObject = v0Var.getMessageObject();
        if (messageObject != null && messageObject.type == 22 && !v0Var.getMessageObject().isOutOwner() && v0Var.getMessageObject().isWallpaperForBoth() && v0Var.getMessageObject().isCurrentWallpaper()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(snVar.getParentActivity(), 0, snVar.getResourceProvider());
            alertDialog$Builder.a.R = LocaleController.getString(R.string.RemoveWallpaperTitle);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.RemoveWallpaperMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new a1(this, 21));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
            snVar.showDialog(c2Var);
            TextView textView = (TextView) c2Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.q7, snVar.getResourceProvider());
            }
        }
    }

    @Override // org.telegram.ui.Cells.s0
    public final void s1(long j10) {
        sn snVar = this.a.Q;
        int i10 = sn.Vc;
        snVar.sa(j10);
    }

    @Override // org.telegram.ui.Cells.s0
    public final void t1(org.telegram.ui.Cells.v0 v0Var) {
        sn snVar = this.a.Q;
        MessageObject messageObject = v0Var.getMessageObject();
        if (messageObject == null || snVar.d2 == null) {
            return;
        }
        if (ChatObject.isMonoForum(snVar.e)) {
            snVar.d2.n(messageObject.getMonoForumTopicId(), true);
        } else {
            snVar.d2.n(messageObject.getTopicId(), true);
        }
    }

    @Override // org.telegram.ui.Cells.s0
    public final /* synthetic */ void N0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }
}
