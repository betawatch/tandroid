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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ul implements org.telegram.ui.Cells.t0 {
    public final /* synthetic */ dm a;

    public ul(dm dmVar) {
        this.a = dmVar;
    }

    @Override // org.telegram.ui.Cells.t0
    public final void A1(org.telegram.ui.Cells.v0 v0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
        int i10;
        rn rnVar = this.a.M;
        if (str != null) {
            c(v0Var);
            we.d dVar = rnVar.wb;
            cg.k1 k1Var = cg.k1.O0;
            cg.g1.T(LaunchActivity.R(), str, dVar);
            return;
        }
        i10 = ((org.telegram.ui.ActionBar.n2) rnVar).currentAccount;
        ag.y2 y2Var = new ag.y2(rnVar, i10, rnVar.i(), new ag.p(tL_premiumGiftOption), null, rnVar.aa);
        y2Var.F0 = false;
        y2Var.Y = v0Var.getMessageObject().isOut();
        rnVar.showDialog(y2Var);
    }

    @Override // org.telegram.ui.Cells.t0
    public final void C(org.telegram.ui.Cells.v0 v0Var, int i10) {
        d5.i iVar = new d5.i(this, v0Var, i10, 29);
        rn rnVar = this.a.M;
        if (!rnVar.w0.J) {
            iVar.run();
        } else {
            rnVar.lb(false, true, true);
            AndroidUtilities.runOnUIThread(iVar, 80L);
        }
    }

    @Override // org.telegram.ui.Cells.t0
    public final void I(org.telegram.ui.Cells.v0 v0Var) {
        nj njVar;
        rn rnVar = this.a.M;
        MessageObject messageObject = v0Var.getMessageObject();
        if (messageObject == null) {
            return;
        }
        messageObject.forceUpdate = true;
        kj kjVar = rnVar.t0;
        if (kjVar != null && (njVar = rnVar.v0) != null && njVar.y < 0) {
            int childCount = kjVar.getChildCount() - 1;
            while (true) {
                if (childCount < 0) {
                    break;
                }
                View childAt = rnVar.t0.getChildAt(childCount);
                rnVar.t0.getClass();
                if (RecyclerView.R(childAt) >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.s1) {
                        if (((org.telegram.ui.Cells.s1) childAt).getCurrentMessagesGroup() == null) {
                            rnVar.L8(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                        rnVar.L8(childAt);
                        break;
                    }
                }
                childCount--;
            }
        }
        rnVar.rc(messageObject, false);
    }

    @Override // org.telegram.ui.Cells.t0
    public final void J(org.telegram.ui.Cells.v0 v0Var, int i10, int i11) {
        h3.f0 f0Var = new h3.f0(this, v0Var, i10, i11, 3);
        rn rnVar = this.a.M;
        if (!rnVar.w0.J) {
            f0Var.run();
        } else {
            rnVar.lb(false, true, true);
            AndroidUtilities.runOnUIThread(f0Var, 80L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Cells.t0
    public final void K(org.telegram.ui.Cells.v0 v0Var) {
        TLRPC.VideoSize videoSize;
        TLRPC.VideoSize videoSize2;
        int i10;
        TLRPC.WallPaper wallPaper;
        String str;
        MessageObject messageObject = v0Var.getMessageObject();
        PhotoViewer t12 = PhotoViewer.t1();
        rn rnVar = this.a.M;
        t12.K2(null, rnVar, rnVar.aa);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 640);
        if (v0Var.getMessageObject().type == 24) {
            jh.i9 orCreateStoryViewer = rnVar.getOrCreateStoryViewer();
            kj kjVar = rnVar.t0;
            orCreateStoryViewer.getClass();
            MessageObject messageObject2 = v0Var.getMessageObject();
            if (rnVar.getParentActivity() != null && messageObject2.type == 24) {
                TLRPC.MessageMedia messageMedia = messageObject2.messageOwner.media;
                TL_stories.StoryItem storyItem = messageMedia.storyItem;
                storyItem.dialogId = DialogObject.getPeerDialogId(messageMedia.peer);
                storyItem.messageId = messageObject2.getId();
                orCreateStoryViewer.G(rnVar.getParentActivity(), messageObject2.messageOwner.media.storyItem, jh.b7.a(kjVar));
                return;
            }
            return;
        }
        if (v0Var.getMessageObject().type == 22) {
            i10 = ((org.telegram.ui.ActionBar.n2) rnVar).currentAccount;
            MessagesController messagesController = MessagesController.getInstance(i10);
            RadialProgress2 radialProgress2 = v0Var.x1;
            if (radialProgress2 != null && radialProgress2.i.q == 3 && messageObject.getId() < 0 && (str = messagesController.uploadingWallpaper) != null && TextUtils.equals(messageObject.messageOwner.action.wallpaper.uploadingImage, str)) {
                messagesController.cancelUploadWallpaper();
                rnVar.Ga(messageObject);
                return;
            }
            MessageObject messageObject3 = v0Var.D0;
            if (messageObject3 == null || !v0Var.L(messageObject3) || v0Var.l1 == null) {
                rnVar.xb();
                return;
            }
            TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
            if (messageAction instanceof TLRPC.TL_messageActionSetChatWallPaper) {
                TLRPC.WallPaper wallPaper2 = ((TLRPC.TL_messageActionSetChatWallPaper) messageAction).wallpaper;
                if (wallPaper2.pattern || wallPaper2.document == null) {
                    String str2 = wallPaper2.slug;
                    TLRPC.WallPaperSettings wallPaperSettings = wallPaper2.settings;
                    wh1 wh1Var = new wh1(str2, wallPaperSettings.background_color, wallPaperSettings.second_background_color, wallPaperSettings.third_background_color, wallPaperSettings.fourth_background_color, AndroidUtilities.getWallpaperRotation(wallPaperSettings.rotation, false), r3.intensity / 100.0f, wallPaper2.settings.motion, null);
                    wallPaper = wh1Var;
                    if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                        wh1Var.g = (TLRPC.TL_wallPaper) wallPaper2;
                        wallPaper = wh1Var;
                    }
                } else {
                    wallPaper = wallPaper2;
                }
                boolean q6 = org.telegram.ui.ActionBar.g6.I.q();
                vb1 vb1Var = new vb1(wallPaper, rnVar, q6);
                TLRPC.WallPaperSettings wallPaperSettings2 = wallPaper2.settings;
                if (wallPaperSettings2 != null) {
                    boolean z10 = wallPaperSettings2.blur;
                    boolean z11 = wallPaperSettings2.motion;
                    vb1Var.B1 = z10;
                    vb1Var.A1 = z11;
                    vb1Var.j1 = wallPaperSettings2.intensity / 100.0f;
                }
                vb1Var.m0 = messageObject;
                vb1Var.c1(messageObject.getDialogId());
                vb1Var.a.a = rnVar.aa;
                vb1Var.l1 = new wb1(rnVar, q6);
                rnVar.presentFragment(vb1Var);
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
                PhotoViewer.t1().d2(videoSize.location, ImageLocation.getForPhoto(videoSize, messageObject.messageOwner.action.photo), rnVar.Ba);
                if (v0Var.getMessageObject().type == 21) {
                    PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedVideo));
                    return;
                }
                return;
            }
            if (closestPhotoSizeWithSize == null) {
                PhotoViewer.t1().c2(messageObject, null, 0L, 0L, 0L, rnVar.Ba);
                return;
            }
            PhotoViewer.t1().d2(closestPhotoSizeWithSize.location, ImageLocation.getForPhoto(closestPhotoSizeWithSize, messageObject.messageOwner.action.photo), rnVar.Ba);
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
            org.telegram.ui.Components.j40 j40Var = new org.telegram.ui.Components.j40(0, true, true);
            j40Var.a = rnVar;
            j40Var.f();
            j40Var.c.f0.r0(null, videoSize2, 0L);
            j40Var.b = new a9.d(rnVar, new TLRPC.FileLocation[1], new TLRPC.FileLocation[1], rnVar.getUserConfig().getClientUserId(), 3);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        ImageLocation.getForPhoto(videoSize, messageObject.messageOwner.action.photo);
        FileLoader fileLoader = rnVar.getFileLoader();
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
        photoEntry.caption = rnVar.U.getFieldText();
        photoEntry.isVideo = videoSize != null;
        arrayList2.add(photoEntry);
        PhotoViewer.t1().f2(arrayList2, 0, 1, false, new tl(this, messageObject, photoEntry), null);
        if (photoEntry.isVideo) {
            PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedVideo));
        } else {
            PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedPhoto));
        }
        org.telegram.ui.Components.h40 h40Var = new org.telegram.ui.Components.h40(1, rnVar.getUserConfig().getCurrentUser());
        h40Var.e = videoSize != null;
        h40Var.b = rnVar.getMessagesController().getUser(Long.valueOf(rnVar.P5));
        PhotoViewer.t1().x2(h40Var);
    }

    @Override // org.telegram.ui.Cells.t0
    public final void S(org.telegram.ui.Cells.v0 v0Var) {
        rn rnVar = this.a.M;
        MessageObject messageObject = v0Var.getMessageObject();
        if (messageObject != null && messageObject.type == 22 && !v0Var.getMessageObject().isOutOwner() && v0Var.getMessageObject().isWallpaperForBoth() && v0Var.getMessageObject().isCurrentWallpaper()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rnVar.getParentActivity(), 0, rnVar.getResourceProvider());
            alertDialog$Builder.a.N = LocaleController.getString(R.string.RemoveWallpaperTitle);
            alertDialog$Builder.a.P = LocaleController.getString(R.string.RemoveWallpaperMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new c1(this, 21));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
            rnVar.showDialog(b2Var);
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(rnVar.getThemedColor(org.telegram.ui.ActionBar.g6.q7));
            }
        }
    }

    @Override // org.telegram.ui.Cells.t0
    public final void T1(org.telegram.ui.Cells.v0 v0Var, String str) {
        c(v0Var);
        rn rnVar = this.a.M;
        cg.g1.T(rnVar, str, rnVar.wb);
    }

    @Override // org.telegram.ui.Cells.t0
    public final void Z0(org.telegram.ui.Cells.v0 v0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
        int i10;
        nk nkVar = this.a.M.ta;
        FrameLayout frameLayout = nkVar.C;
        HashMap hashMap = nkVar.f;
        Random random = nkVar.h;
        ArrayList arrayList = nkVar.B;
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
                if (((ry) arrayList.get(i11)).p == v0Var.getMessageObject().getId()) {
                    i12++;
                    if (((ry) arrayList.get(i11)).r.getLottieAnimation() == null || ((ry) arrayList.get(i11)).r.getLottieAnimation().w()) {
                        return;
                    }
                }
                if (((ry) arrayList.get(i11)).q == null || document == null) {
                    i10 = i11;
                } else {
                    i10 = i11;
                    if (((ry) arrayList.get(i11)).q.id == document.id) {
                        i13++;
                    }
                }
                i11 = i10 + 1;
            }
            if (i12 >= 4) {
                return;
            }
            ry ryVar = new ry();
            ryVar.h = true;
            if (!ryVar.i) {
                ryVar.f = ((random.nextInt() % 101) / 100.0f) * (imageWidth / 4.0f);
                ryVar.g = ((random.nextInt() % 101) / 100.0f) * (imageHeight / 4.0f);
            }
            ryVar.p = v0Var.getMessageObject().getId();
            ryVar.m = true;
            ryVar.r.setAllowStartAnimation(true);
            int f10 = sy.f();
            if (i13 > 0) {
                Integer num = (Integer) hashMap.get(Long.valueOf(document.id));
                int intValue = num == null ? 0 : num.intValue();
                hashMap.put(Long.valueOf(document.id), Integer.valueOf((intValue + 1) % 4));
                ryVar.r.setUniqKeyPrefix(intValue + "_" + ryVar.p + "_");
            }
            ryVar.q = document;
            ryVar.r.setImage(ImageLocation.getForDocument(videoSize, document), com.google.android.recaptcha.internal.a.l(f10, "_", f10), null, "tgs", nkVar.c, 1);
            ryVar.r.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
            ryVar.r.setAutoRepeat(0);
            if (ryVar.r.getLottieAnimation() != null) {
                if (ryVar.h) {
                    ryVar.r.getLottieAnimation().L(0, false, true);
                }
                ryVar.r.getLottieAnimation().start();
            }
            arrayList.add(ryVar);
            if (nkVar.n) {
                ryVar.r.onAttachedToWindow();
                ryVar.r.setParentView(frameLayout);
            }
            frameLayout.invalidate();
        }
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ long a() {
        return 0L;
    }

    @Override // org.telegram.ui.Cells.t0
    public final long b() {
        return this.a.M.b();
    }

    public final void c(org.telegram.ui.Cells.v0 v0Var) {
        rn rnVar = this.a.M;
        we.d dVar = rnVar.wb;
        if (dVar != null) {
            dVar.a(true);
        }
        rnVar.wb = v0Var.getMessageObject() == null ? null : new wm(this, v0Var, 6);
    }

    @Override // org.telegram.ui.Cells.t0
    public final boolean f() {
        return false;
    }

    @Override // org.telegram.ui.Cells.t0
    public final boolean g2(org.telegram.ui.Cells.v0 v0Var, float f10, float f11) {
        boolean z10;
        rn rnVar = this.a.M;
        z10 = ((org.telegram.ui.ActionBar.n2) rnVar).inPreviewMode;
        if (z10) {
            return false;
        }
        return rnVar.I7(v0Var, false, false, f10, f11, true, true, false);
    }

    @Override // org.telegram.ui.Cells.t0
    public final void j2(org.telegram.ui.Cells.v0 v0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
        this.a.M.W7(v0Var, reactionCount, z10, f10, f11);
    }

    @Override // org.telegram.ui.Cells.t0
    public final void p1(long j10) {
        rn rnVar = this.a.M;
        int i10 = rn.Dc;
        rnVar.na(j10);
    }

    @Override // org.telegram.ui.Cells.t0
    public final void q1(org.telegram.ui.Cells.v0 v0Var) {
        rn rnVar = this.a.M;
        MessageObject messageObject = v0Var.getMessageObject();
        if (messageObject == null || rnVar.N1 == null) {
            return;
        }
        if (ChatObject.isMonoForum(rnVar.e)) {
            rnVar.N1.m(messageObject.getMonoForumTopicId(), true);
        } else {
            rnVar.N1.m(messageObject.getTopicId(), true);
        }
    }

    @Override // org.telegram.ui.Cells.t0
    public final org.telegram.ui.ActionBar.n2 y0() {
        return this.a.M;
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void z0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }
}
