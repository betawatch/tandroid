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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class vl implements org.telegram.ui.Cells.t0 {
    public final /* synthetic */ em a;

    public vl(em emVar) {
        this.a = emVar;
    }

    @Override // org.telegram.ui.Cells.t0
    public final void J(org.telegram.ui.Cells.v0 v0Var, int i10) {
        ag.v0 v0Var2 = new ag.v0(this, v0Var, i10, 29);
        tn tnVar = this.a.M;
        if (!tnVar.w0.J) {
            v0Var2.run();
        } else {
            tnVar.lb(false, true, true);
            AndroidUtilities.runOnUIThread(v0Var2, 80L);
        }
    }

    @Override // org.telegram.ui.Cells.t0
    public final void K1(org.telegram.ui.Cells.v0 v0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
        int i10;
        tn tnVar = this.a.M;
        if (str != null) {
            c(v0Var);
            ye.c cVar = tnVar.wb;
            eg.j1 j1Var = eg.j1.O0;
            eg.f1.T(LaunchActivity.R(), str, cVar);
            return;
        }
        i10 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
        cg.f2 f2Var = new cg.f2(tnVar, i10, tnVar.i(), new cg.n(tL_premiumGiftOption), null, tnVar.aa);
        f2Var.F0 = false;
        f2Var.Y = v0Var.getMessageObject().isOut();
        tnVar.showDialog(f2Var);
    }

    @Override // org.telegram.ui.Cells.t0
    public final org.telegram.ui.ActionBar.o2 O0() {
        return this.a.M;
    }

    @Override // org.telegram.ui.Cells.t0
    public final void W(org.telegram.ui.Cells.v0 v0Var) {
        oj ojVar;
        tn tnVar = this.a.M;
        MessageObject messageObject = v0Var.getMessageObject();
        if (messageObject == null) {
            return;
        }
        messageObject.forceUpdate = true;
        lj ljVar = tnVar.t0;
        if (ljVar != null && (ojVar = tnVar.v0) != null && ojVar.y < 0) {
            int childCount = ljVar.getChildCount() - 1;
            while (true) {
                if (childCount < 0) {
                    break;
                }
                View childAt = tnVar.t0.getChildAt(childCount);
                tnVar.t0.getClass();
                if (RecyclerView.R(childAt) >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.s1) {
                        if (((org.telegram.ui.Cells.s1) childAt).getCurrentMessagesGroup() == null) {
                            tnVar.L8(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                        tnVar.L8(childAt);
                        break;
                    }
                }
                childCount--;
            }
        }
        tnVar.rc(messageObject, false);
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ long a() {
        return 0L;
    }

    @Override // org.telegram.ui.Cells.t0
    public final long b() {
        return this.a.M.b();
    }

    @Override // org.telegram.ui.Cells.t0
    public final void b0(org.telegram.ui.Cells.v0 v0Var, int i10, int i11) {
        j3.f0 f0Var = new j3.f0(this, v0Var, i10, i11, 3);
        tn tnVar = this.a.M;
        if (!tnVar.w0.J) {
            f0Var.run();
        } else {
            tnVar.lb(false, true, true);
            AndroidUtilities.runOnUIThread(f0Var, 80L);
        }
    }

    public final void c(org.telegram.ui.Cells.v0 v0Var) {
        tn tnVar = this.a.M;
        ye.c cVar = tnVar.wb;
        if (cVar != null) {
            cVar.a(true);
        }
        tnVar.wb = v0Var.getMessageObject() == null ? null : new ym(this, v0Var, 6);
    }

    @Override // org.telegram.ui.Cells.t0
    public final boolean f() {
        return false;
    }

    @Override // org.telegram.ui.Cells.t0
    public final void g1(org.telegram.ui.Cells.v0 v0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
        int i10;
        ok okVar = this.a.M.ta;
        FrameLayout frameLayout = okVar.C;
        HashMap hashMap = okVar.f;
        Random random = okVar.h;
        ArrayList arrayList = okVar.B;
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
                if (((qy) arrayList.get(i11)).p == v0Var.getMessageObject().getId()) {
                    i12++;
                    if (((qy) arrayList.get(i11)).r.getLottieAnimation() == null || ((qy) arrayList.get(i11)).r.getLottieAnimation().w()) {
                        return;
                    }
                }
                if (((qy) arrayList.get(i11)).q == null || document == null) {
                    i10 = i11;
                } else {
                    i10 = i11;
                    if (((qy) arrayList.get(i11)).q.id == document.id) {
                        i13++;
                    }
                }
                i11 = i10 + 1;
            }
            if (i12 >= 4) {
                return;
            }
            qy qyVar = new qy();
            qyVar.h = true;
            if (!qyVar.i) {
                qyVar.f = ((random.nextInt() % 101) / 100.0f) * (imageWidth / 4.0f);
                qyVar.g = ((random.nextInt() % 101) / 100.0f) * (imageHeight / 4.0f);
            }
            qyVar.p = v0Var.getMessageObject().getId();
            qyVar.m = true;
            qyVar.r.setAllowStartAnimation(true);
            int f9 = ry.f();
            if (i13 > 0) {
                Integer num = (Integer) hashMap.get(Long.valueOf(document.id));
                int intValue = num == null ? 0 : num.intValue();
                hashMap.put(Long.valueOf(document.id), Integer.valueOf((intValue + 1) % 4));
                qyVar.r.setUniqKeyPrefix(intValue + "_" + qyVar.p + "_");
            }
            qyVar.q = document;
            qyVar.r.setImage(ImageLocation.getForDocument(videoSize, document), com.google.android.recaptcha.internal.a.k(f9, "_", f9), null, "tgs", okVar.c, 1);
            qyVar.r.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
            qyVar.r.setAutoRepeat(0);
            if (qyVar.r.getLottieAnimation() != null) {
                if (qyVar.h) {
                    qyVar.r.getLottieAnimation().L(0, false, true);
                }
                qyVar.r.getLottieAnimation().start();
            }
            arrayList.add(qyVar);
            if (okVar.n) {
                qyVar.r.onAttachedToWindow();
                qyVar.r.setParentView(frameLayout);
            }
            frameLayout.invalidate();
        }
    }

    @Override // org.telegram.ui.Cells.t0
    public final void h2(org.telegram.ui.Cells.v0 v0Var, String str) {
        c(v0Var);
        tn tnVar = this.a.M;
        eg.f1.T(tnVar, str, tnVar.wb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Cells.t0
    public final void i0(org.telegram.ui.Cells.v0 v0Var) {
        TLRPC.VideoSize videoSize;
        TLRPC.VideoSize videoSize2;
        int i10;
        TLRPC.WallPaper wallPaper;
        String str;
        MessageObject messageObject = v0Var.getMessageObject();
        PhotoViewer t12 = PhotoViewer.t1();
        tn tnVar = this.a.M;
        t12.K2(null, tnVar, tnVar.aa);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 640);
        if (v0Var.getMessageObject().type == 24) {
            lh.i9 orCreateStoryViewer = tnVar.getOrCreateStoryViewer();
            lj ljVar = tnVar.t0;
            orCreateStoryViewer.getClass();
            MessageObject messageObject2 = v0Var.getMessageObject();
            if (tnVar.getParentActivity() != null && messageObject2.type == 24) {
                TLRPC.MessageMedia messageMedia = messageObject2.messageOwner.media;
                TL_stories.StoryItem storyItem = messageMedia.storyItem;
                storyItem.dialogId = DialogObject.getPeerDialogId(messageMedia.peer);
                storyItem.messageId = messageObject2.getId();
                orCreateStoryViewer.G(tnVar.getParentActivity(), messageObject2.messageOwner.media.storyItem, lh.b7.a(ljVar));
                return;
            }
            return;
        }
        if (v0Var.getMessageObject().type == 22) {
            i10 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
            MessagesController messagesController = MessagesController.getInstance(i10);
            RadialProgress2 radialProgress2 = v0Var.x1;
            if (radialProgress2 != null && radialProgress2.i.q == 3 && messageObject.getId() < 0 && (str = messagesController.uploadingWallpaper) != null && TextUtils.equals(messageObject.messageOwner.action.wallpaper.uploadingImage, str)) {
                messagesController.cancelUploadWallpaper();
                tnVar.Ga(messageObject);
                return;
            }
            MessageObject messageObject3 = v0Var.D0;
            if (messageObject3 == null || !v0Var.K(messageObject3) || v0Var.l1 == null) {
                tnVar.xb();
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
                boolean q6 = org.telegram.ui.ActionBar.g6.I.q();
                yb1 yb1Var = new yb1(wallPaper, tnVar, q6);
                TLRPC.WallPaperSettings wallPaperSettings2 = wallPaper2.settings;
                if (wallPaperSettings2 != null) {
                    boolean z10 = wallPaperSettings2.blur;
                    boolean z11 = wallPaperSettings2.motion;
                    yb1Var.B1 = z10;
                    yb1Var.A1 = z11;
                    yb1Var.j1 = wallPaperSettings2.intensity / 100.0f;
                }
                yb1Var.m0 = messageObject;
                yb1Var.c1(messageObject.getDialogId());
                yb1Var.a.a = tnVar.aa;
                yb1Var.l1 = new zb1(tnVar, q6);
                tnVar.presentFragment(yb1Var);
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
                PhotoViewer.t1().d2(videoSize.location, ImageLocation.getForPhoto(videoSize, messageObject.messageOwner.action.photo), tnVar.Ba);
                if (v0Var.getMessageObject().type == 21) {
                    PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedVideo));
                    return;
                }
                return;
            }
            if (closestPhotoSizeWithSize == null) {
                PhotoViewer.t1().c2(messageObject, null, 0L, 0L, 0L, tnVar.Ba);
                return;
            }
            PhotoViewer.t1().d2(closestPhotoSizeWithSize.location, ImageLocation.getForPhoto(closestPhotoSizeWithSize, messageObject.messageOwner.action.photo), tnVar.Ba);
            if (v0Var.getMessageObject().type == 21) {
                PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedPhoto));
                return;
            }
            return;
        }
        if (messageObject.settingAvatar) {
            return;
        }
        if (videoSize2 != null) {
            org.telegram.ui.Components.s40 s40Var = new org.telegram.ui.Components.s40(0, true, true);
            s40Var.a = tnVar;
            s40Var.f();
            s40Var.c.f0.r0(null, videoSize2, 0L);
            s40Var.b = new b9.d(tnVar, new TLRPC.FileLocation[1], new TLRPC.FileLocation[1], tnVar.getUserConfig().getClientUserId(), 3);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        ImageLocation.getForPhoto(videoSize, messageObject.messageOwner.action.photo);
        FileLoader fileLoader = tnVar.getFileLoader();
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
        photoEntry.caption = tnVar.U.getFieldText();
        photoEntry.isVideo = videoSize != null;
        arrayList2.add(photoEntry);
        PhotoViewer.t1().f2(arrayList2, 0, 1, false, new ul(this, messageObject, photoEntry), null);
        if (photoEntry.isVideo) {
            PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedVideo));
        } else {
            PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedPhoto));
        }
        org.telegram.ui.Components.q40 q40Var = new org.telegram.ui.Components.q40(1, tnVar.getUserConfig().getCurrentUser());
        q40Var.e = videoSize != null;
        q40Var.b = tnVar.getMessagesController().getUser(Long.valueOf(tnVar.P5));
        PhotoViewer.t1().x2(q40Var);
    }

    @Override // org.telegram.ui.Cells.t0
    public final void q0(org.telegram.ui.Cells.v0 v0Var) {
        tn tnVar = this.a.M;
        MessageObject messageObject = v0Var.getMessageObject();
        if (messageObject != null && messageObject.type == 22 && !v0Var.getMessageObject().isOutOwner() && v0Var.getMessageObject().isWallpaperForBoth() && v0Var.getMessageObject().isCurrentWallpaper()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tnVar.getParentActivity(), 0, tnVar.getResourceProvider());
            alertDialog$Builder.a.N = LocaleController.getString(R.string.RemoveWallpaperTitle);
            alertDialog$Builder.a.P = LocaleController.getString(R.string.RemoveWallpaperMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new c1(this, 21));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
            tnVar.showDialog(c2Var);
            TextView textView = (TextView) c2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(tnVar.getThemedColor(org.telegram.ui.ActionBar.g6.q7));
            }
        }
    }

    @Override // org.telegram.ui.Cells.t0
    public final boolean r2(org.telegram.ui.Cells.v0 v0Var, float f9, float f10) {
        boolean z10;
        tn tnVar = this.a.M;
        z10 = ((org.telegram.ui.ActionBar.o2) tnVar).inPreviewMode;
        if (z10) {
            return false;
        }
        return tnVar.I7(v0Var, false, false, f9, f10, true, true, false);
    }

    @Override // org.telegram.ui.Cells.t0
    public final void t2(org.telegram.ui.Cells.v0 v0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f9, float f10) {
        this.a.M.W7(v0Var, reactionCount, z10, f9, f10);
    }

    @Override // org.telegram.ui.Cells.t0
    public final void x1(long j10) {
        tn tnVar = this.a.M;
        int i10 = tn.Dc;
        tnVar.na(j10);
    }

    @Override // org.telegram.ui.Cells.t0
    public final void y1(org.telegram.ui.Cells.v0 v0Var) {
        tn tnVar = this.a.M;
        MessageObject messageObject = v0Var.getMessageObject();
        if (messageObject == null || tnVar.N1 == null) {
            return;
        }
        if (ChatObject.isMonoForum(tnVar.e)) {
            tnVar.N1.m(messageObject.getMonoForumTopicId(), true);
        } else {
            tnVar.N1.m(messageObject.getTopicId(), true);
        }
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void Q0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }
}
