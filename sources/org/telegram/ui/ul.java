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

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class ul implements org.telegram.ui.Cells.t0 {
    public final /* synthetic */ dm a;

    public ul(dm dmVar) {
        this.a = dmVar;
    }

    @Override // org.telegram.ui.Cells.t0
    public final void C1(org.telegram.ui.Cells.w0 w0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
        int i10;
        qn qnVar = this.a.Q;
        if (str != null) {
            b(w0Var);
            pf.c cVar = qnVar.Ab;
            ug.f0 f0Var = ug.f0.S0;
            ug.b0.U(LaunchActivity.R(), str, cVar);
            return;
        }
        i10 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
        sg.m1 m1Var = new sg.m1(qnVar, i10, qnVar.i(), new sg.k(tL_premiumGiftOption), null, qnVar.ea);
        m1Var.J0 = false;
        m1Var.c0 = w0Var.getMessageObject().isOut();
        qnVar.showDialog(m1Var);
    }

    @Override // org.telegram.ui.Cells.t0
    public final org.telegram.ui.ActionBar.n2 L0() {
        return this.a.Q;
    }

    @Override // org.telegram.ui.Cells.t0
    public final void X(org.telegram.ui.Cells.w0 w0Var, int i10) {
        i4 i4Var = new i4(this, w0Var, i10, 4);
        qn qnVar = this.a.Q;
        if (!qnVar.A0.N) {
            i4Var.run();
        } else {
            qnVar.pb(false, true, true);
            AndroidUtilities.runOnUIThread(i4Var, 80L);
        }
    }

    @Override // org.telegram.ui.Cells.t0
    public final void X1(org.telegram.ui.Cells.w0 w0Var, String str) {
        b(w0Var);
        qn qnVar = this.a.Q;
        ug.b0.U(qnVar, str, qnVar.Ab);
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ long a() {
        return 0L;
    }

    public final void b(org.telegram.ui.Cells.w0 w0Var) {
        qn qnVar = this.a.Q;
        pf.c cVar = qnVar.Ab;
        if (cVar != null) {
            cVar.a(true);
        }
        qnVar.Ab = w0Var.getMessageObject() == null ? null : new vm(this, w0Var, 6);
    }

    @Override // org.telegram.ui.Cells.t0
    public final void b0(org.telegram.ui.Cells.w0 w0Var) {
        qj qjVar;
        qn qnVar = this.a.Q;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject == null) {
            return;
        }
        messageObject.forceUpdate = true;
        nj njVar = qnVar.x0;
        if (njVar != null && (qjVar = qnVar.z0) != null && qjVar.y < 0) {
            int childCount = njVar.getChildCount() - 1;
            while (true) {
                if (childCount < 0) {
                    break;
                }
                View childAt = qnVar.x0.getChildAt(childCount);
                qnVar.x0.getClass();
                if (RecyclerView.R(childAt) >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.u1) {
                        if (((org.telegram.ui.Cells.u1) childAt).getCurrentMessagesGroup() == null) {
                            qnVar.Q8(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                        qnVar.Q8(childAt);
                        break;
                    }
                }
                childCount--;
            }
        }
        qnVar.vc(messageObject, false);
    }

    @Override // org.telegram.ui.Cells.t0
    public final void c1(org.telegram.ui.Cells.w0 w0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
        int i10;
        pk pkVar = this.a.Q.xa;
        FrameLayout frameLayout = pkVar.G;
        HashMap hashMap = pkVar.f;
        Random random = pkVar.h;
        ArrayList arrayList = pkVar.F;
        if (arrayList.size() <= 12 && w0Var.getPhotoImage().hasNotThumb()) {
            float imageHeight = w0Var.getPhotoImage().getImageHeight();
            float imageWidth = w0Var.getPhotoImage().getImageWidth();
            if (imageHeight <= 0.0f || imageWidth <= 0.0f) {
                return;
            }
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (i11 < arrayList.size()) {
                if (((ny) arrayList.get(i11)).p == w0Var.getMessageObject().getId()) {
                    i12++;
                    if (((ny) arrayList.get(i11)).r.getLottieAnimation() == null || ((ny) arrayList.get(i11)).r.getLottieAnimation().y()) {
                        return;
                    }
                }
                if (((ny) arrayList.get(i11)).q == null || document == null) {
                    i10 = i11;
                } else {
                    i10 = i11;
                    if (((ny) arrayList.get(i11)).q.id == document.id) {
                        i13++;
                    }
                }
                i11 = i10 + 1;
            }
            if (i12 >= 4) {
                return;
            }
            ny nyVar = new ny();
            nyVar.h = true;
            if (!nyVar.i) {
                nyVar.f = ((random.nextInt() % 101) / 100.0f) * (imageWidth / 4.0f);
                nyVar.g = ((random.nextInt() % 101) / 100.0f) * (imageHeight / 4.0f);
            }
            nyVar.p = w0Var.getMessageObject().getId();
            nyVar.m = true;
            nyVar.r.setAllowStartAnimation(true);
            int f7 = oy.f();
            if (i13 > 0) {
                Integer num = (Integer) hashMap.get(Long.valueOf(document.id));
                int intValue = num == null ? 0 : num.intValue();
                hashMap.put(Long.valueOf(document.id), Integer.valueOf((intValue + 1) % 4));
                nyVar.r.setUniqKeyPrefix(intValue + "_" + nyVar.p + "_");
            }
            nyVar.q = document;
            nyVar.r.setImage(ImageLocation.getForDocument(videoSize, document), a1.g.k(f7, f7, "_"), null, "tgs", pkVar.c, 1);
            nyVar.r.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
            nyVar.r.setAutoRepeat(0);
            if (nyVar.r.getLottieAnimation() != null) {
                if (nyVar.h) {
                    nyVar.r.getLottieAnimation().N(0, false, true);
                }
                nyVar.r.getLottieAnimation().start();
            }
            arrayList.add(nyVar);
            if (pkVar.n) {
                nyVar.r.onAttachedToWindow();
                nyVar.r.setParentView(frameLayout);
            }
            frameLayout.invalidate();
        }
    }

    @Override // org.telegram.ui.Cells.t0
    public final long d() {
        return this.a.Q.d();
    }

    @Override // org.telegram.ui.Cells.t0
    public final boolean e() {
        return false;
    }

    @Override // org.telegram.ui.Cells.t0
    public final void g0(org.telegram.ui.Cells.w0 w0Var, int i10, int i11) {
        i2.a0 a0Var = new i2.a0(this, w0Var, i10, i11, 3);
        qn qnVar = this.a.Q;
        if (!qnVar.A0.N) {
            a0Var.run();
        } else {
            qnVar.pb(false, true, true);
            AndroidUtilities.runOnUIThread(a0Var, 80L);
        }
    }

    @Override // org.telegram.ui.Cells.t0
    public final boolean h2(org.telegram.ui.Cells.w0 w0Var, float f7, float f10) {
        boolean z10;
        qn qnVar = this.a.Q;
        z10 = ((org.telegram.ui.ActionBar.n2) qnVar).inPreviewMode;
        if (z10) {
            return false;
        }
        return qnVar.L7(w0Var, false, false, f7, f10, true, true, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Cells.t0
    public final void k0(org.telegram.ui.Cells.w0 w0Var) {
        TLRPC.VideoSize videoSize;
        TLRPC.VideoSize videoSize2;
        int i10;
        TLRPC.WallPaper wallPaper;
        String str;
        MessageObject messageObject = w0Var.getMessageObject();
        PhotoViewer t12 = PhotoViewer.t1();
        qn qnVar = this.a.Q;
        t12.K2(null, qnVar, qnVar.ea);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 640);
        if (w0Var.getMessageObject().type == 24) {
            ci.aa orCreateStoryViewer = qnVar.getOrCreateStoryViewer();
            nj njVar = qnVar.x0;
            orCreateStoryViewer.getClass();
            MessageObject messageObject2 = w0Var.getMessageObject();
            if (qnVar.getParentActivity() != null && messageObject2.type == 24) {
                TLRPC.MessageMedia messageMedia = messageObject2.messageOwner.media;
                TL_stories.StoryItem storyItem = messageMedia.storyItem;
                storyItem.dialogId = DialogObject.getPeerDialogId(messageMedia.peer);
                storyItem.messageId = messageObject2.getId();
                orCreateStoryViewer.F(qnVar.getParentActivity(), messageObject2.messageOwner.media.storyItem, ci.r7.a(njVar));
                return;
            }
            return;
        }
        if (w0Var.getMessageObject().type == 22) {
            i10 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
            MessagesController messagesController = MessagesController.getInstance(i10);
            RadialProgress2 radialProgress2 = w0Var.J1;
            if (radialProgress2 != null && radialProgress2.i.q == 3 && messageObject.getId() < 0 && (str = messagesController.uploadingWallpaper) != null && TextUtils.equals(messageObject.messageOwner.action.wallpaper.uploadingImage, str)) {
                messagesController.cancelUploadWallpaper();
                qnVar.Ka(messageObject);
                return;
            }
            MessageObject messageObject3 = w0Var.P0;
            if (messageObject3 == null || !w0Var.O(messageObject3) || w0Var.x1 == null) {
                qnVar.Bb();
                return;
            }
            TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
            if (messageAction instanceof TLRPC.TL_messageActionSetChatWallPaper) {
                TLRPC.WallPaper wallPaper2 = ((TLRPC.TL_messageActionSetChatWallPaper) messageAction).wallpaper;
                if (wallPaper2.pattern || wallPaper2.document == null) {
                    String str2 = wallPaper2.slug;
                    TLRPC.WallPaperSettings wallPaperSettings = wallPaper2.settings;
                    sh1 sh1Var = new sh1(str2, wallPaperSettings.background_color, wallPaperSettings.second_background_color, wallPaperSettings.third_background_color, wallPaperSettings.fourth_background_color, AndroidUtilities.getWallpaperRotation(wallPaperSettings.rotation, false), r3.intensity / 100.0f, wallPaper2.settings.motion, null);
                    wallPaper = sh1Var;
                    if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                        sh1Var.g = (TLRPC.TL_wallPaper) wallPaper2;
                        wallPaper = sh1Var;
                    }
                } else {
                    wallPaper = wallPaper2;
                }
                boolean q6 = org.telegram.ui.ActionBar.h6.I.q();
                tb1 tb1Var = new tb1(wallPaper, qnVar, q6);
                TLRPC.WallPaperSettings wallPaperSettings2 = wallPaper2.settings;
                if (wallPaperSettings2 != null) {
                    boolean z10 = wallPaperSettings2.blur;
                    boolean z11 = wallPaperSettings2.motion;
                    tb1Var.F1 = z10;
                    tb1Var.E1 = z11;
                    tb1Var.n1 = wallPaperSettings2.intensity / 100.0f;
                }
                tb1Var.q0 = messageObject;
                tb1Var.c1(messageObject.getDialogId());
                tb1Var.a.a = qnVar.ea;
                tb1Var.p1 = new ub1(qnVar, q6);
                qnVar.presentFragment(tb1Var);
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
                PhotoViewer.t1().e2(videoSize.location, ImageLocation.getForPhoto(videoSize, messageObject.messageOwner.action.photo), qnVar.Ga);
                if (w0Var.getMessageObject().type == 21) {
                    PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedVideo));
                    return;
                }
                return;
            }
            if (closestPhotoSizeWithSize == null) {
                PhotoViewer.t1().d2(messageObject, null, 0L, 0L, 0L, qnVar.Ga);
                return;
            }
            PhotoViewer.t1().e2(closestPhotoSizeWithSize.location, ImageLocation.getForPhoto(closestPhotoSizeWithSize, messageObject.messageOwner.action.photo), qnVar.Ga);
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
            org.telegram.ui.Components.e50 e50Var = new org.telegram.ui.Components.e50(0, true, true);
            e50Var.a = qnVar;
            e50Var.e();
            e50Var.c.j0.r0(null, videoSize2, 0L);
            e50Var.b = new ai.y3(qnVar, new TLRPC.FileLocation[1], new TLRPC.FileLocation[1], qnVar.getUserConfig().getClientUserId(), 8);
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
        photoEntry.caption = qnVar.Y.getFieldText();
        photoEntry.isVideo = videoSize != null;
        arrayList2.add(photoEntry);
        PhotoViewer.t1().g2(arrayList2, 0, 1, false, new tl(this, messageObject, photoEntry), null);
        if (photoEntry.isVideo) {
            PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedVideo));
        } else {
            PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedPhoto));
        }
        org.telegram.ui.Components.c50 c50Var = new org.telegram.ui.Components.c50(1, qnVar.getUserConfig().getCurrentUser());
        c50Var.e = videoSize != null;
        c50Var.b = qnVar.getMessagesController().getUser(Long.valueOf(qnVar.T5));
        PhotoViewer.t1().x2(c50Var);
    }

    @Override // org.telegram.ui.Cells.t0
    public final void k2(org.telegram.ui.Cells.w0 w0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        this.a.Q.Z7(w0Var, reactionCount, z10, f7, f10);
    }

    @Override // org.telegram.ui.Cells.t0
    public final void r0(org.telegram.ui.Cells.w0 w0Var) {
        qn qnVar = this.a.Q;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject != null && messageObject.type == 22 && !w0Var.getMessageObject().isOutOwner() && w0Var.getMessageObject().isWallpaperForBoth() && w0Var.getMessageObject().isCurrentWallpaper()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qnVar.getParentActivity(), 0, qnVar.getResourceProvider());
            alertDialog$Builder.a.R = LocaleController.getString(R.string.RemoveWallpaperTitle);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.RemoveWallpaperMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new b1(this, 21));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
            qnVar.showDialog(b2Var);
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(qnVar.getThemedColor(org.telegram.ui.ActionBar.h6.q7));
            }
        }
    }

    @Override // org.telegram.ui.Cells.t0
    public final void s1(long j10) {
        qn qnVar = this.a.Q;
        int i10 = qn.Ic;
        qnVar.sa(j10);
    }

    @Override // org.telegram.ui.Cells.t0
    public final void t1(org.telegram.ui.Cells.w0 w0Var) {
        qn qnVar = this.a.Q;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject == null || qnVar.R1 == null) {
            return;
        }
        if (ChatObject.isMonoForum(qnVar.e)) {
            qnVar.R1.m(messageObject.getMonoForumTopicId(), true);
        } else {
            qnVar.R1.m(messageObject.getTopicId(), true);
        }
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void N0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }
}
