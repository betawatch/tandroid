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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class tl implements org.telegram.ui.Cells.t0 {
    public final /* synthetic */ bm a;

    public tl(bm bmVar) {
        this.a = bmVar;
    }

    @Override // org.telegram.ui.Cells.t0
    public final void E(org.telegram.ui.Cells.w0 w0Var, int i9) {
        rl rlVar = new rl(this, w0Var, i9, 0);
        qn qnVar = this.a.M;
        if (!qnVar.w0.J) {
            rlVar.run();
        } else {
            qnVar.lb(false, true, true);
            AndroidUtilities.runOnUIThread(rlVar, 80L);
        }
    }

    @Override // org.telegram.ui.Cells.t0
    public final void I(org.telegram.ui.Cells.w0 w0Var) {
        lj ljVar;
        qn qnVar = this.a.M;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject == null) {
            return;
        }
        messageObject.forceUpdate = true;
        ij ijVar = qnVar.t0;
        if (ijVar != null && (ljVar = qnVar.v0) != null && ljVar.y < 0) {
            int childCount = ijVar.getChildCount() - 1;
            while (true) {
                if (childCount < 0) {
                    break;
                }
                View childAt = qnVar.t0.getChildAt(childCount);
                qnVar.t0.getClass();
                if (RecyclerView.R(childAt) >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        if (((org.telegram.ui.Cells.t1) childAt).getCurrentMessagesGroup() == null) {
                            qnVar.L8(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                        qnVar.L8(childAt);
                        break;
                    }
                }
                childCount--;
            }
        }
        qnVar.rc(messageObject, false);
    }

    @Override // org.telegram.ui.Cells.t0
    public final void L(org.telegram.ui.Cells.w0 w0Var, int i9, int i10) {
        h3.e0 e0Var = new h3.e0(this, w0Var, i9, i10, 3);
        qn qnVar = this.a.M;
        if (!qnVar.w0.J) {
            e0Var.run();
        } else {
            qnVar.lb(false, true, true);
            AndroidUtilities.runOnUIThread(e0Var, 80L);
        }
    }

    @Override // org.telegram.ui.Cells.t0
    public final void N1(org.telegram.ui.Cells.w0 w0Var, String str) {
        c(w0Var);
        qn qnVar = this.a.M;
        bg.l1.S(qnVar, str, qnVar.wb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Cells.t0
    public final void O(org.telegram.ui.Cells.w0 w0Var) {
        TLRPC.VideoSize videoSize;
        TLRPC.VideoSize videoSize2;
        int i9;
        TLRPC.WallPaper wallPaper;
        String str;
        MessageObject messageObject = w0Var.getMessageObject();
        PhotoViewer t12 = PhotoViewer.t1();
        qn qnVar = this.a.M;
        t12.K2(null, qnVar, qnVar.aa);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 640);
        if (w0Var.getMessageObject().type == 24) {
            ih.m9 orCreateStoryViewer = qnVar.getOrCreateStoryViewer();
            ij ijVar = qnVar.t0;
            orCreateStoryViewer.getClass();
            MessageObject messageObject2 = w0Var.getMessageObject();
            if (qnVar.getParentActivity() != null && messageObject2.type == 24) {
                TLRPC.MessageMedia messageMedia = messageObject2.messageOwner.media;
                TL_stories.StoryItem storyItem = messageMedia.storyItem;
                storyItem.dialogId = DialogObject.getPeerDialogId(messageMedia.peer);
                storyItem.messageId = messageObject2.getId();
                orCreateStoryViewer.F(qnVar.getParentActivity(), messageObject2.messageOwner.media.storyItem, ih.e7.a(ijVar));
                return;
            }
            return;
        }
        if (w0Var.getMessageObject().type == 22) {
            i9 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
            MessagesController messagesController = MessagesController.getInstance(i9);
            RadialProgress2 radialProgress2 = w0Var.x1;
            if (radialProgress2 != null && radialProgress2.i.q == 3 && messageObject.getId() < 0 && (str = messagesController.uploadingWallpaper) != null && TextUtils.equals(messageObject.messageOwner.action.wallpaper.uploadingImage, str)) {
                messagesController.cancelUploadWallpaper();
                qnVar.Ga(messageObject);
                return;
            }
            MessageObject messageObject3 = w0Var.D0;
            if (messageObject3 == null || !w0Var.K(messageObject3) || w0Var.l1 == null) {
                qnVar.xb();
                return;
            }
            TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
            if (messageAction instanceof TLRPC.TL_messageActionSetChatWallPaper) {
                TLRPC.WallPaper wallPaper2 = ((TLRPC.TL_messageActionSetChatWallPaper) messageAction).wallpaper;
                if (wallPaper2.pattern || wallPaper2.document == null) {
                    String str2 = wallPaper2.slug;
                    TLRPC.WallPaperSettings wallPaperSettings = wallPaper2.settings;
                    xh1 xh1Var = new xh1(str2, wallPaperSettings.background_color, wallPaperSettings.second_background_color, wallPaperSettings.third_background_color, wallPaperSettings.fourth_background_color, AndroidUtilities.getWallpaperRotation(wallPaperSettings.rotation, false), r3.intensity / 100.0f, wallPaper2.settings.motion, null);
                    wallPaper = xh1Var;
                    if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                        xh1Var.g = (TLRPC.TL_wallPaper) wallPaper2;
                        wallPaper = xh1Var;
                    }
                } else {
                    wallPaper = wallPaper2;
                }
                boolean q10 = org.telegram.ui.ActionBar.f6.I.q();
                xb1 xb1Var = new xb1(wallPaper, qnVar, q10);
                TLRPC.WallPaperSettings wallPaperSettings2 = wallPaper2.settings;
                if (wallPaperSettings2 != null) {
                    boolean z10 = wallPaperSettings2.blur;
                    boolean z11 = wallPaperSettings2.motion;
                    xb1Var.B1 = z10;
                    xb1Var.A1 = z11;
                    xb1Var.j1 = wallPaperSettings2.intensity / 100.0f;
                }
                xb1Var.m0 = messageObject;
                xb1Var.c1(messageObject.getDialogId());
                xb1Var.a.a = qnVar.aa;
                xb1Var.l1 = new yb1(qnVar, q10);
                qnVar.presentFragment(xb1Var);
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
        if (w0Var.getMessageObject().type != 21 || messageObject.isOutOwner()) {
            if (videoSize != null) {
                PhotoViewer.t1().d2(videoSize.location, ImageLocation.getForPhoto(videoSize, messageObject.messageOwner.action.photo), qnVar.Ba);
                if (w0Var.getMessageObject().type == 21) {
                    PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedVideo));
                    return;
                }
                return;
            }
            if (closestPhotoSizeWithSize == null) {
                PhotoViewer.t1().c2(messageObject, null, 0L, 0L, 0L, qnVar.Ba);
                return;
            }
            PhotoViewer.t1().d2(closestPhotoSizeWithSize.location, ImageLocation.getForPhoto(closestPhotoSizeWithSize, messageObject.messageOwner.action.photo), qnVar.Ba);
            if (w0Var.getMessageObject().type == 21) {
                PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedPhoto));
                return;
            }
            return;
        }
        if (messageObject.settingAvatar) {
            return;
        }
        if (videoSize2 != null) {
            org.telegram.ui.Components.e40 e40Var = new org.telegram.ui.Components.e40(0, true, true);
            e40Var.a = qnVar;
            e40Var.f();
            e40Var.c.f0.q0(null, videoSize2, 0L);
            e40Var.b = new c3.g(qnVar, new TLRPC.FileLocation[1], new TLRPC.FileLocation[1], qnVar.getUserConfig().getClientUserId(), 1);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        ImageLocation.getForPhoto(videoSize, messageObject.messageOwner.action.photo);
        FileLoader fileLoader = qnVar.getFileLoader();
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
        photoEntry.caption = qnVar.U.getFieldText();
        photoEntry.isVideo = videoSize != null;
        arrayList2.add(photoEntry);
        PhotoViewer.t1().f2(arrayList2, 0, 1, false, new sl(this, messageObject, photoEntry), null);
        if (photoEntry.isVideo) {
            PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedVideo));
        } else {
            PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedPhoto));
        }
        org.telegram.ui.Components.c40 c40Var = new org.telegram.ui.Components.c40(1, qnVar.getUserConfig().getCurrentUser());
        c40Var.e = videoSize != null;
        c40Var.b = qnVar.getMessagesController().getUser(Long.valueOf(qnVar.P5));
        PhotoViewer.t1().x2(c40Var);
    }

    @Override // org.telegram.ui.Cells.t0
    public final void V0(org.telegram.ui.Cells.w0 w0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
        int i9;
        lk lkVar = this.a.M.ta;
        FrameLayout frameLayout = lkVar.C;
        HashMap hashMap = lkVar.f;
        Random random = lkVar.h;
        ArrayList arrayList = lkVar.B;
        if (arrayList.size() <= 12 && w0Var.getPhotoImage().hasNotThumb()) {
            float imageHeight = w0Var.getPhotoImage().getImageHeight();
            float imageWidth = w0Var.getPhotoImage().getImageWidth();
            if (imageHeight <= 0.0f || imageWidth <= 0.0f) {
                return;
            }
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (i10 < arrayList.size()) {
                if (((oy) arrayList.get(i10)).p == w0Var.getMessageObject().getId()) {
                    i11++;
                    if (((oy) arrayList.get(i10)).r.getLottieAnimation() == null || ((oy) arrayList.get(i10)).r.getLottieAnimation().w()) {
                        return;
                    }
                }
                if (((oy) arrayList.get(i10)).q == null || document == null) {
                    i9 = i10;
                } else {
                    i9 = i10;
                    if (((oy) arrayList.get(i10)).q.id == document.id) {
                        i12++;
                    }
                }
                i10 = i9 + 1;
            }
            if (i11 >= 4) {
                return;
            }
            oy oyVar = new oy();
            oyVar.h = true;
            if (!oyVar.i) {
                oyVar.f = ((random.nextInt() % 101) / 100.0f) * (imageWidth / 4.0f);
                oyVar.g = ((random.nextInt() % 101) / 100.0f) * (imageHeight / 4.0f);
            }
            oyVar.p = w0Var.getMessageObject().getId();
            oyVar.m = true;
            oyVar.r.setAllowStartAnimation(true);
            int f10 = py.f();
            if (i12 > 0) {
                Integer num = (Integer) hashMap.get(Long.valueOf(document.id));
                int intValue = num == null ? 0 : num.intValue();
                hashMap.put(Long.valueOf(document.id), Integer.valueOf((intValue + 1) % 4));
                oyVar.r.setUniqKeyPrefix(intValue + "_" + oyVar.p + "_");
            }
            oyVar.q = document;
            oyVar.r.setImage(ImageLocation.getForDocument(videoSize, document), e2.c.l(f10, "_", f10), null, "tgs", lkVar.c, 1);
            oyVar.r.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
            oyVar.r.setAutoRepeat(0);
            if (oyVar.r.getLottieAnimation() != null) {
                if (oyVar.h) {
                    oyVar.r.getLottieAnimation().L(0, false, true);
                }
                oyVar.r.getLottieAnimation().start();
            }
            arrayList.add(oyVar);
            if (lkVar.n) {
                oyVar.r.onAttachedToWindow();
                oyVar.r.setParentView(frameLayout);
            }
            frameLayout.invalidate();
        }
    }

    @Override // org.telegram.ui.Cells.t0
    public final boolean Z1(org.telegram.ui.Cells.w0 w0Var, float f10, float f11) {
        boolean z10;
        qn qnVar = this.a.M;
        z10 = ((org.telegram.ui.ActionBar.o2) qnVar).inPreviewMode;
        if (z10) {
            return false;
        }
        return qnVar.I7(w0Var, false, false, f10, f11, true, true, false);
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ long a() {
        return 0L;
    }

    @Override // org.telegram.ui.Cells.t0
    public final void a2(org.telegram.ui.Cells.w0 w0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
        this.a.M.W7(w0Var, reactionCount, z10, f10, f11);
    }

    @Override // org.telegram.ui.Cells.t0
    public final long b() {
        return this.a.M.b();
    }

    public final void c(org.telegram.ui.Cells.w0 w0Var) {
        qn qnVar = this.a.M;
        ve.d dVar = qnVar.wb;
        if (dVar != null) {
            dVar.a(true);
        }
        qnVar.wb = w0Var.getMessageObject() == null ? null : new vm(this, w0Var, 6);
    }

    @Override // org.telegram.ui.Cells.t0
    public final void c0(org.telegram.ui.Cells.w0 w0Var) {
        qn qnVar = this.a.M;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject != null && messageObject.type == 22 && !w0Var.getMessageObject().isOutOwner() && w0Var.getMessageObject().isWallpaperForBoth() && w0Var.getMessageObject().isCurrentWallpaper()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qnVar.getParentActivity(), 0, qnVar.getResourceProvider());
            alertDialog$Builder.a.N = LocaleController.getString(R.string.RemoveWallpaperTitle);
            alertDialog$Builder.a.P = LocaleController.getString(R.string.RemoveWallpaperMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new b1(this, 21));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
            qnVar.showDialog(c2Var);
            TextView textView = (TextView) c2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(qnVar.getThemedColor(org.telegram.ui.ActionBar.f6.q7));
            }
        }
    }

    @Override // org.telegram.ui.Cells.t0
    public final boolean h() {
        return false;
    }

    @Override // org.telegram.ui.Cells.t0
    public final void o1(long j10) {
        qn qnVar = this.a.M;
        int i9 = qn.Dc;
        qnVar.na(j10);
    }

    @Override // org.telegram.ui.Cells.t0
    public final void p1(org.telegram.ui.Cells.w0 w0Var) {
        qn qnVar = this.a.M;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject == null || qnVar.N1 == null) {
            return;
        }
        if (ChatObject.isMonoForum(qnVar.e)) {
            qnVar.N1.m(messageObject.getMonoForumTopicId(), true);
        } else {
            qnVar.N1.m(messageObject.getTopicId(), true);
        }
    }

    @Override // org.telegram.ui.Cells.t0
    public final void v1(org.telegram.ui.Cells.w0 w0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
        int i9;
        qn qnVar = this.a.M;
        if (str != null) {
            c(w0Var);
            ve.d dVar = qnVar.wb;
            bg.p1 p1Var = bg.p1.O0;
            bg.l1.S(LaunchActivity.R(), str, dVar);
            return;
        }
        i9 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
        zf.k1 k1Var = new zf.k1(qnVar, i9, qnVar.i(), new zf.k(tL_premiumGiftOption), null, qnVar.aa);
        k1Var.F0 = false;
        k1Var.Y = w0Var.getMessageObject().isOut();
        qnVar.showDialog(k1Var);
    }

    @Override // org.telegram.ui.Cells.t0
    public final org.telegram.ui.ActionBar.o2 y0() {
        return this.a.M;
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void C0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }
}
