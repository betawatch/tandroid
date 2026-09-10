package org.telegram.ui;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.video.VideoAds;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class rs0 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 a;
    public final /* synthetic */ PhotoViewer b;

    public rs0(PhotoViewer photoViewer, org.telegram.ui.ActionBar.f6 f6Var) {
        this.b = photoViewer;
        this.a = f6Var;
    }

    @Override // org.telegram.ui.ActionBar.k
    public final boolean a() {
        PhotoViewer photoViewer = this.b;
        if (photoViewer.T4 != null || photoViewer.b5 != null) {
            return true;
        }
        if (photoViewer.a5 == null) {
            return photoViewer.j7 != null;
        }
        FileLoader fileLoader = FileLoader.getInstance(photoViewer.T);
        ImageLocation imageLocation = photoViewer.a5;
        File pathToAttach = fileLoader.getPathToAttach(imageLocation == null ? null : imageLocation.location, PhotoViewer.q1(imageLocation), photoViewer.z5 != 0 || photoViewer.B5);
        File file = new File(FileLoader.getDirectory(4), pathToAttach.getName());
        FileLoader fileLoader2 = FileLoader.getInstance(photoViewer.T);
        ImageLocation imageLocation2 = photoViewer.a5;
        return pathToAttach.exists() || file.exists() || fileLoader2.getPathToAttach(imageLocation2 != null ? imageLocation2.location : null, PhotoViewer.q1(imageLocation2), false).exists();
    }

    /* JADX WARN: Code restructure failed: missing block: B:202:0x040d, code lost:
    
        if (w.f.o(r0) != false) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x07f4, code lost:
    
        if (r14 == org.telegram.messenger.UserConfig.getInstance(r13).getClientUserId()) goto L352;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x07f8, code lost:
    
        if (r4 == null) goto L357;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x07fa, code lost:
    
        r13 = r7.T;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x0804, code lost:
    
        if (org.telegram.messenger.MessagesController.getInstance(r13).canRevokePmInbox == false) goto L357;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x0806, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x0809, code lost:
    
        r14 = r7.T4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x0811, code lost:
    
        if (r14.messageOwner.action == null) goto L362;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x0813, code lost:
    
        r14 = r7.T4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x081d, code lost:
    
        if ((r14.messageOwner.action instanceof org.telegram.tgnet.TLRPC.TL_messageActionEmpty) == false) goto L344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x081f, code lost:
    
        r14 = r7.T4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x0827, code lost:
    
        if (r14.isOut() != false) goto L367;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x0829, code lost:
    
        if (r13 != false) goto L367;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x082f, code lost:
    
        if (org.telegram.messenger.ChatObject.hasAdminRights(r9) == false) goto L344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x0831, code lost:
    
        r13 = r7.T4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x083a, code lost:
    
        if ((r10 - r13.messageOwner.date) > r12) goto L344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x083c, code lost:
    
        r10 = r7.y;
        r14 = new android.widget.FrameLayout(r10);
        r10 = r7.y;
        r8 = new org.telegram.ui.Cells.z1(r10, 1, r2);
        r8.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x0857, code lost:
    
        if (r9 == null) goto L372;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x0859, code lost:
    
        r2 = "Cancel";
        r8.e(org.telegram.messenger.LocaleController.getString("DeleteForAll", org.telegram.messenger.R.string.DeleteForAll), "", false, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x088c, code lost:
    
        if (org.telegram.messenger.LocaleController.isRTL == false) goto L376;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x088e, code lost:
    
        r4 = org.telegram.messenger.AndroidUtilities.dp(16.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x0899, code lost:
    
        if (org.telegram.messenger.LocaleController.isRTL == false) goto L380;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x089b, code lost:
    
        r6 = org.telegram.messenger.AndroidUtilities.dp(8.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x08a4, code lost:
    
        r8.setPadding(r4, 0, r6, 0);
        r14.addView(r8, w7.a6.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        r8.setOnClickListener(new org.telegram.ui.m8(5, r0));
        r3.n(r14);
        r3.a.G = 9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x08a0, code lost:
    
        r6 = org.telegram.messenger.AndroidUtilities.dp(16.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x0893, code lost:
    
        r4 = org.telegram.messenger.AndroidUtilities.dp(8.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x086b, code lost:
    
        r2 = "Cancel";
        r8.e(org.telegram.messenger.LocaleController.formatString("DeleteForUser", org.telegram.messenger.R.string.DeleteForUser, org.telegram.messenger.UserObject.getFirstName(r4)), "", false, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x0808, code lost:
    
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x07f6, code lost:
    
        if (r9 != null) goto L353;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x06cf, code lost:
    
        if (r4 == r10) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x06df, code lost:
    
        if (r4.isVideo() != false) goto L326;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x05f0  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0772  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x08f9  */
    /* JADX WARN: Removed duplicated region for block: B:356:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:365:0x06bd  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x0dc1  */
    /* JADX WARN: Removed duplicated region for block: B:534:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0246  */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v18 */
    @Override // org.telegram.ui.ActionBar.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i10) {
        MessageObject messageObject;
        MessageObject messageObject2;
        int i11;
        MessageObject messageObject3;
        int i12;
        Activity activity;
        Activity activity2;
        MessageObject messageObject4;
        MessageObject messageObject5;
        MessageObject messageObject6;
        yu0 yu0Var;
        yu0 yu0Var2;
        int i13;
        Activity activity3;
        MessageObject messageObject7;
        Activity activity4;
        MessageObject messageObject8;
        MessageObject messageObject9;
        MessageObject messageObject10;
        Activity activity5;
        MessageObject messageObject11;
        Activity activity6;
        MessageObject messageObject12;
        MessageObject messageObject13;
        MessageObject messageObject14;
        MessageObject messageObject15;
        TLObject tLObject;
        Activity activity7;
        MessageObject messageObject16;
        org.telegram.ui.Components.hy0 hy0Var;
        MessageObject messageObject17;
        ImageLocation imageLocation;
        ImageLocation imageLocation2;
        ImageLocation imageLocation3;
        ImageLocation imageLocation4;
        TLRPC.Photo photo;
        int i14;
        Activity activity8;
        long j3;
        ImageLocation imageLocation5;
        ImageLocation imageLocation6;
        MessageObject messageObject18;
        int i15;
        int i16;
        ImageLocation imageLocation7;
        ImageLocation imageLocation8;
        ImageLocation imageLocation9;
        cv0 cv0Var;
        int i17;
        ImageLocation imageLocation10;
        ImageLocation imageLocation11;
        int i18;
        int i19;
        long j10;
        int i20;
        long j11;
        int i21;
        long j12;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        UndoView undoView;
        long j13;
        ImageLocation imageLocation12;
        ImageLocation imageLocation13;
        int i32;
        int i33;
        int i34;
        MessageObject messageObject19;
        yu0 yu0Var3;
        yu0 yu0Var4;
        int i35;
        int i36;
        int i37;
        yu0 yu0Var5;
        MessageObject messageObject20;
        eo eoVar;
        int i38;
        int i39;
        MessageObject messageObject21;
        eo eoVar2;
        eo eoVar3;
        MessageObject messageObject22;
        int i40;
        MessageObject messageObject23;
        org.telegram.ui.ActionBar.w0 w0Var;
        View findViewWithTag;
        org.telegram.ui.Components.zf0 zf0Var;
        PhotoViewer photoViewer;
        Activity activity9;
        cv0 cv0Var2;
        MessageObject messageObject24;
        boolean z10;
        Activity activity10;
        cv0 cv0Var3;
        CharSequence a02;
        ImageLocation imageLocation14;
        MessageObject messageObject25;
        MessageObject messageObject26;
        MessageObject messageObject27;
        MessageObject messageObject28;
        ImageLocation imageLocation15;
        ImageLocation imageLocation16;
        MessageObject messageObject29;
        TextView textView;
        int z12;
        MessageObject messageObject30;
        MessageObject messageObject31;
        int i41;
        TLRPC.Chat chat;
        TLRPC.User user;
        int i42;
        int i43;
        int i44;
        int i45;
        int i46;
        int i47;
        MessageObject messageObject32;
        MessageObject messageObject33;
        int i48;
        Activity activity11;
        cv0 cv0Var4;
        cv0 cv0Var5;
        MessageObject messageObject34;
        Activity activity12;
        MessageObject messageObject35;
        boolean z11;
        Activity activity13;
        MessageObject messageObject36;
        ArrayList arrayList;
        eo eoVar4;
        String str;
        MessageObject messageObject37;
        MessageObject messageObject38;
        eo eoVar5;
        Activity activity14;
        boolean z13;
        Activity activity15;
        int z14;
        int z15;
        int z16;
        int z17;
        eo eoVar6;
        MessageObject messageObject39;
        MessageObject messageObject40;
        int i49;
        cv0 cv0Var6;
        MessageObject messageObject41;
        MessageObject messageObject42;
        MessageObject messageObject43;
        String str2;
        eo eoVar7;
        int i50;
        MessageObject messageObject44;
        MessageObject messageObject45;
        eo eoVar8;
        Activity activity16;
        Activity activity17;
        eo eoVar9;
        of.g m12;
        org.telegram.ui.Components.t7 t7Var;
        eo eoVar10;
        MessageObject.GroupedMessages groupedMessages;
        MessageObject messageObject46;
        Activity activity18;
        MessageObject messageObject47;
        String string;
        int z18;
        View d;
        int z19;
        int z110;
        int z111;
        MessageObject messageObject48;
        MessageObject messageObject49;
        MessageObject messageObject50;
        ImageLocation imageLocation17;
        yu0 yu0Var6;
        File file;
        ?? r14;
        yu0 yu0Var7;
        int i51;
        yu0 yu0Var8;
        int i52;
        boolean a2;
        ImageLocation imageLocation18;
        int i53;
        ImageLocation imageLocation19;
        long j14;
        boolean z20;
        File pathToAttach;
        int i54;
        ImageLocation imageLocation20;
        boolean z21;
        MessageObject messageObject51;
        boolean z22;
        File file2;
        Activity activity19;
        Activity activity20;
        MessageObject messageObject52;
        TLRPC.Document document;
        int i55;
        int i56;
        MessageObject messageObject53;
        MessageObject messageObject54;
        MessageObject messageObject55;
        int i57;
        MessageObject messageObject56;
        MessageObject messageObject57;
        MessageObject messageObject58;
        MessageObject messageObject59;
        int i58;
        TLObject p12;
        int i59;
        eo eoVar11;
        MessageObject messageObject60;
        Activity activity21;
        Activity activity22;
        boolean H1;
        org.telegram.ui.ActionBar.f6 f6Var = this.a;
        boolean z23 = true;
        z23 = true;
        z23 = true;
        PhotoViewer photoViewer2 = this.b;
        if (i10 == -1) {
            zt0 zt0Var = photoViewer2.L1;
            if (zt0Var == null || !zt0Var.o0()) {
                H1 = photoViewer2.H1();
                if (H1) {
                    photoViewer2.E0(false);
                    return;
                } else {
                    photoViewer2.G0(true, false);
                    return;
                }
            }
            return;
        }
        TLRPC.Photo photo2 = null;
        MessageObject.GroupedMessages groupedMessages2 = null;
        String str3 = null;
        photo2 = null;
        if (i10 == 2) {
            int i60 = Build.VERSION.SDK_INT;
            if (i60 >= 23 && (i60 <= 28 || BuildVars.NO_SCOPED_STORAGE)) {
                activity21 = photoViewer2.y;
                if (activity21.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                    activity22 = photoViewer2.y;
                    activity22.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                    return;
                }
            }
            final ArrayList arrayList2 = new ArrayList(1);
            eoVar10 = photoViewer2.l4;
            if (eoVar10 != null) {
                eoVar11 = photoViewer2.l4;
                messageObject60 = photoViewer2.T4;
                groupedMessages = eoVar11.y8(messageObject60.getGroupId());
            } else {
                groupedMessages = null;
            }
            if (groupedMessages != null) {
                arrayList2.addAll(groupedMessages.messages);
            } else {
                messageObject46 = photoViewer2.T4;
                arrayList2.add(messageObject46);
            }
            if (arrayList2.size() > 1) {
                boolean z24 = false;
                final boolean z25 = false;
                boolean z26 = false;
                for (int i61 = 0; i61 < arrayList2.size(); i61++) {
                    MessageObject messageObject61 = (MessageObject) arrayList2.get(i61);
                    if (messageObject61.isLivePhoto()) {
                        z26 = true;
                    } else if (messageObject61.isVideo()) {
                        z24 = true;
                    } else {
                        z25 = true;
                    }
                }
                activity18 = photoViewer2.y;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity18, f6Var);
                alertDialog$Builder.l(LocaleController.getString("SaveGroupMedia", R.string.SaveGroupMedia));
                alertDialog$Builder.g(LocaleController.getString("SaveGroupMediaMessage", R.string.SaveGroupMediaMessage));
                alertDialog$Builder.a.I = org.telegram.ui.ActionBar.j6.pg;
                messageObject47 = photoViewer2.T4;
                if (messageObject47 != null) {
                    messageObject48 = photoViewer2.T4;
                    if (messageObject48.isVideo()) {
                        messageObject49 = photoViewer2.T4;
                        if (!messageObject49.isLivePhoto()) {
                            string = LocaleController.getString("ThisMedia", R.string.ThisMedia);
                            final int i62 = true ? 1 : 0;
                            alertDialog$Builder.h(string, new org.telegram.ui.ActionBar.c2(this) { // from class: org.telegram.ui.is0
                                public final /* synthetic */ rs0 b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.ui.ActionBar.c2
                                public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i63) {
                                    switch (i62) {
                                        case 0:
                                            rs0 rs0Var = this.b;
                                            rs0Var.getClass();
                                            ArrayList arrayList3 = new ArrayList(1);
                                            PhotoViewer photoViewer3 = rs0Var.b;
                                            arrayList3.add(photoViewer3.T4);
                                            PhotoViewer.C(photoViewer3, arrayList3);
                                            break;
                                        default:
                                            rs0 rs0Var2 = this.b;
                                            PhotoViewer photoViewer4 = rs0Var2.b;
                                            MessageObject messageObject62 = photoViewer4.T4;
                                            if (messageObject62 != null) {
                                                File file3 = null;
                                                File pathToAttach2 = ((MessageObject.getMedia(messageObject62.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) && MessageObject.getMedia(photoViewer4.T4.messageOwner).webpage != null && MessageObject.getMedia(photoViewer4.T4.messageOwner).webpage.document == null) ? FileLoader.getInstance(photoViewer4.T).getPathToAttach(photoViewer4.p1(photoViewer4.P4, null), true) : FileLoader.getInstance(photoViewer4.T).getPathToMessage(photoViewer4.T4.messageOwner);
                                                boolean isVideo = photoViewer4.T4.isVideo();
                                                boolean isLivePhoto = photoViewer4.T4.isLivePhoto();
                                                if (isLivePhoto) {
                                                    TLRPC.Document document2 = MessageObject.getMedia(photoViewer4.T4.messageOwner) != null ? MessageObject.getMedia(photoViewer4.T4.messageOwner).document : null;
                                                    if (document2 != null && ((file3 = FileLoader.getInstance(photoViewer4.T).getPathToAttach(document2, false)) == null || !file3.exists())) {
                                                        file3 = FileLoader.getInstance(photoViewer4.T).getPathToAttach(document2, true);
                                                    }
                                                }
                                                if (!isLivePhoto) {
                                                    if (pathToAttach2 != null && pathToAttach2.exists()) {
                                                        MediaController.saveFile(pathToAttach2.toString(), photoViewer4.y, isVideo ? 1 : 0, null, null, new ls0(rs0Var2, isVideo, 0));
                                                        break;
                                                    } else {
                                                        photoViewer4.U2();
                                                        break;
                                                    }
                                                } else if (pathToAttach2 != null && pathToAttach2.exists() && file3 != null && file3.exists()) {
                                                    MediaController.saveFile(pathToAttach2.toString(), file3.toString(), photoViewer4.y, new hs0(rs0Var2, 1));
                                                    break;
                                                } else {
                                                    photoViewer4.U2();
                                                    break;
                                                }
                                            }
                                            break;
                                    }
                                }
                            });
                            final boolean z27 = z24;
                            final boolean z28 = z26;
                            alertDialog$Builder.k((!z24 || z26) ? LocaleController.formatPluralString("AllNMedia", arrayList2.size(), new Object[0]) : LocaleController.formatPluralString("AllNPhotos", arrayList2.size(), new Object[0]), new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.os0
                                @Override // org.telegram.ui.ActionBar.c2
                                public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i63) {
                                    rs0 rs0Var = rs0.this;
                                    PhotoViewer photoViewer3 = rs0Var.b;
                                    int[] iArr = new int[1];
                                    final sr0 sr0Var = new sr0(rs0Var, new int[1], iArr, z27, z25, z28);
                                    int i64 = 0;
                                    while (true) {
                                        ArrayList arrayList3 = arrayList2;
                                        if (i64 >= arrayList3.size()) {
                                            return;
                                        }
                                        MessageObject messageObject62 = (MessageObject) arrayList3.get(i64);
                                        if (messageObject62 != null) {
                                            File file3 = null;
                                            File pathToAttach2 = ((MessageObject.getMedia(messageObject62.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) && MessageObject.getMedia(messageObject62.messageOwner).webpage != null && MessageObject.getMedia(messageObject62.messageOwner).webpage.document == null) ? FileLoader.getInstance(photoViewer3.T).getPathToAttach(photoViewer3.p1(photoViewer3.P4, null), true) : FileLoader.getInstance(photoViewer3.T).getPathToMessage(messageObject62.messageOwner);
                                            boolean isVideo = messageObject62.isVideo();
                                            boolean isLivePhoto = messageObject62.isLivePhoto();
                                            if (isLivePhoto) {
                                                TLRPC.Document document2 = MessageObject.getMedia(messageObject62.messageOwner) != null ? MessageObject.getMedia(messageObject62.messageOwner).document : null;
                                                if (document2 != null && ((file3 = FileLoader.getInstance(photoViewer3.T).getPathToAttach(document2, false)) == null || !file3.exists())) {
                                                    file3 = FileLoader.getInstance(photoViewer3.T).getPathToAttach(document2, true);
                                                }
                                            }
                                            if (isLivePhoto && pathToAttach2 != null && pathToAttach2.exists()) {
                                                iArr[0] = iArr[0] + 1;
                                                if (file3 == null || !file3.exists()) {
                                                    final int i65 = 1;
                                                    MediaController.saveFile(pathToAttach2.toString(), photoViewer3.y, 0, null, null, new Utilities.Callback() { // from class: org.telegram.ui.ks0
                                                        @Override // org.telegram.messenger.Utilities.Callback
                                                        public final void run(Object obj) {
                                                            switch (i65) {
                                                                case 0:
                                                                    AndroidUtilities.runOnUIThread(sr0Var);
                                                                    break;
                                                                case 1:
                                                                    AndroidUtilities.runOnUIThread(sr0Var);
                                                                    break;
                                                                default:
                                                                    AndroidUtilities.runOnUIThread(sr0Var);
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                } else {
                                                    final int i66 = 0;
                                                    MediaController.saveFile(pathToAttach2.toString(), file3.toString(), photoViewer3.y, new Utilities.Callback() { // from class: org.telegram.ui.ks0
                                                        @Override // org.telegram.messenger.Utilities.Callback
                                                        public final void run(Object obj) {
                                                            switch (i66) {
                                                                case 0:
                                                                    AndroidUtilities.runOnUIThread(sr0Var);
                                                                    break;
                                                                case 1:
                                                                    AndroidUtilities.runOnUIThread(sr0Var);
                                                                    break;
                                                                default:
                                                                    AndroidUtilities.runOnUIThread(sr0Var);
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                }
                                            } else if (!isLivePhoto && pathToAttach2 != null && pathToAttach2.exists()) {
                                                iArr[0] = iArr[0] + 1;
                                                final int i67 = 2;
                                                MediaController.saveFile(pathToAttach2.toString(), photoViewer3.y, isVideo ? 1 : 0, null, null, new Utilities.Callback() { // from class: org.telegram.ui.ks0
                                                    @Override // org.telegram.messenger.Utilities.Callback
                                                    public final void run(Object obj) {
                                                        switch (i67) {
                                                            case 0:
                                                                AndroidUtilities.runOnUIThread(sr0Var);
                                                                break;
                                                            case 1:
                                                                AndroidUtilities.runOnUIThread(sr0Var);
                                                                break;
                                                            default:
                                                                AndroidUtilities.runOnUIThread(sr0Var);
                                                                break;
                                                        }
                                                    }
                                                });
                                            }
                                        }
                                        i64++;
                                    }
                                }
                            });
                            alertDialog$Builder.i(LocaleController.getString("Cancel", R.string.Cancel), new org.telegram.ui.Components.gp0(29));
                            org.telegram.ui.ActionBar.d2 a10 = alertDialog$Builder.a();
                            z18 = photoViewer2.z1(org.telegram.ui.ActionBar.j6.ug);
                            a10.i(z18);
                            a10.show();
                            d = a10.d(-3);
                            if (d instanceof TextView) {
                                int i63 = org.telegram.ui.ActionBar.j6.q7;
                                z110 = photoViewer2.z1(i63);
                                ((TextView) d).setTextColor(z110);
                                z111 = photoViewer2.z1(i63);
                                d.setBackground(org.telegram.ui.ActionBar.j6.G0(AndroidUtilities.dp(3.0f), z111));
                                ViewGroup viewGroup = a10.t0;
                                if ((viewGroup instanceof LinearLayout) && ((LinearLayout) viewGroup).getOrientation() == 1) {
                                    d.bringToFront();
                                }
                            }
                            z19 = photoViewer2.z1(org.telegram.ui.ActionBar.j6.hg);
                            a10.o(z19);
                            return;
                        }
                    }
                }
                string = LocaleController.getString("ThisPhoto", R.string.ThisPhoto);
                final int i622 = true ? 1 : 0;
                alertDialog$Builder.h(string, new org.telegram.ui.ActionBar.c2(this) { // from class: org.telegram.ui.is0
                    public final /* synthetic */ rs0 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.ui.ActionBar.c2
                    public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i632) {
                        switch (i622) {
                            case 0:
                                rs0 rs0Var = this.b;
                                rs0Var.getClass();
                                ArrayList arrayList3 = new ArrayList(1);
                                PhotoViewer photoViewer3 = rs0Var.b;
                                arrayList3.add(photoViewer3.T4);
                                PhotoViewer.C(photoViewer3, arrayList3);
                                break;
                            default:
                                rs0 rs0Var2 = this.b;
                                PhotoViewer photoViewer4 = rs0Var2.b;
                                MessageObject messageObject62 = photoViewer4.T4;
                                if (messageObject62 != null) {
                                    File file3 = null;
                                    File pathToAttach2 = ((MessageObject.getMedia(messageObject62.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) && MessageObject.getMedia(photoViewer4.T4.messageOwner).webpage != null && MessageObject.getMedia(photoViewer4.T4.messageOwner).webpage.document == null) ? FileLoader.getInstance(photoViewer4.T).getPathToAttach(photoViewer4.p1(photoViewer4.P4, null), true) : FileLoader.getInstance(photoViewer4.T).getPathToMessage(photoViewer4.T4.messageOwner);
                                    boolean isVideo = photoViewer4.T4.isVideo();
                                    boolean isLivePhoto = photoViewer4.T4.isLivePhoto();
                                    if (isLivePhoto) {
                                        TLRPC.Document document2 = MessageObject.getMedia(photoViewer4.T4.messageOwner) != null ? MessageObject.getMedia(photoViewer4.T4.messageOwner).document : null;
                                        if (document2 != null && ((file3 = FileLoader.getInstance(photoViewer4.T).getPathToAttach(document2, false)) == null || !file3.exists())) {
                                            file3 = FileLoader.getInstance(photoViewer4.T).getPathToAttach(document2, true);
                                        }
                                    }
                                    if (!isLivePhoto) {
                                        if (pathToAttach2 != null && pathToAttach2.exists()) {
                                            MediaController.saveFile(pathToAttach2.toString(), photoViewer4.y, isVideo ? 1 : 0, null, null, new ls0(rs0Var2, isVideo, 0));
                                            break;
                                        } else {
                                            photoViewer4.U2();
                                            break;
                                        }
                                    } else if (pathToAttach2 != null && pathToAttach2.exists() && file3 != null && file3.exists()) {
                                        MediaController.saveFile(pathToAttach2.toString(), file3.toString(), photoViewer4.y, new hs0(rs0Var2, 1));
                                        break;
                                    } else {
                                        photoViewer4.U2();
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                final boolean z272 = z24;
                final boolean z282 = z26;
                alertDialog$Builder.k((!z24 || z26) ? LocaleController.formatPluralString("AllNMedia", arrayList2.size(), new Object[0]) : LocaleController.formatPluralString("AllNPhotos", arrayList2.size(), new Object[0]), new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.os0
                    @Override // org.telegram.ui.ActionBar.c2
                    public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i632) {
                        rs0 rs0Var = rs0.this;
                        PhotoViewer photoViewer3 = rs0Var.b;
                        int[] iArr = new int[1];
                        final sr0 sr0Var = new sr0(rs0Var, new int[1], iArr, z272, z25, z282);
                        int i64 = 0;
                        while (true) {
                            ArrayList arrayList3 = arrayList2;
                            if (i64 >= arrayList3.size()) {
                                return;
                            }
                            MessageObject messageObject62 = (MessageObject) arrayList3.get(i64);
                            if (messageObject62 != null) {
                                File file3 = null;
                                File pathToAttach2 = ((MessageObject.getMedia(messageObject62.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) && MessageObject.getMedia(messageObject62.messageOwner).webpage != null && MessageObject.getMedia(messageObject62.messageOwner).webpage.document == null) ? FileLoader.getInstance(photoViewer3.T).getPathToAttach(photoViewer3.p1(photoViewer3.P4, null), true) : FileLoader.getInstance(photoViewer3.T).getPathToMessage(messageObject62.messageOwner);
                                boolean isVideo = messageObject62.isVideo();
                                boolean isLivePhoto = messageObject62.isLivePhoto();
                                if (isLivePhoto) {
                                    TLRPC.Document document2 = MessageObject.getMedia(messageObject62.messageOwner) != null ? MessageObject.getMedia(messageObject62.messageOwner).document : null;
                                    if (document2 != null && ((file3 = FileLoader.getInstance(photoViewer3.T).getPathToAttach(document2, false)) == null || !file3.exists())) {
                                        file3 = FileLoader.getInstance(photoViewer3.T).getPathToAttach(document2, true);
                                    }
                                }
                                if (isLivePhoto && pathToAttach2 != null && pathToAttach2.exists()) {
                                    iArr[0] = iArr[0] + 1;
                                    if (file3 == null || !file3.exists()) {
                                        final int i65 = 1;
                                        MediaController.saveFile(pathToAttach2.toString(), photoViewer3.y, 0, null, null, new Utilities.Callback() { // from class: org.telegram.ui.ks0
                                            @Override // org.telegram.messenger.Utilities.Callback
                                            public final void run(Object obj) {
                                                switch (i65) {
                                                    case 0:
                                                        AndroidUtilities.runOnUIThread(sr0Var);
                                                        break;
                                                    case 1:
                                                        AndroidUtilities.runOnUIThread(sr0Var);
                                                        break;
                                                    default:
                                                        AndroidUtilities.runOnUIThread(sr0Var);
                                                        break;
                                                }
                                            }
                                        });
                                    } else {
                                        final int i66 = 0;
                                        MediaController.saveFile(pathToAttach2.toString(), file3.toString(), photoViewer3.y, new Utilities.Callback() { // from class: org.telegram.ui.ks0
                                            @Override // org.telegram.messenger.Utilities.Callback
                                            public final void run(Object obj) {
                                                switch (i66) {
                                                    case 0:
                                                        AndroidUtilities.runOnUIThread(sr0Var);
                                                        break;
                                                    case 1:
                                                        AndroidUtilities.runOnUIThread(sr0Var);
                                                        break;
                                                    default:
                                                        AndroidUtilities.runOnUIThread(sr0Var);
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                } else if (!isLivePhoto && pathToAttach2 != null && pathToAttach2.exists()) {
                                    iArr[0] = iArr[0] + 1;
                                    final int i67 = 2;
                                    MediaController.saveFile(pathToAttach2.toString(), photoViewer3.y, isVideo ? 1 : 0, null, null, new Utilities.Callback() { // from class: org.telegram.ui.ks0
                                        @Override // org.telegram.messenger.Utilities.Callback
                                        public final void run(Object obj) {
                                            switch (i67) {
                                                case 0:
                                                    AndroidUtilities.runOnUIThread(sr0Var);
                                                    break;
                                                case 1:
                                                    AndroidUtilities.runOnUIThread(sr0Var);
                                                    break;
                                                default:
                                                    AndroidUtilities.runOnUIThread(sr0Var);
                                                    break;
                                            }
                                        }
                                    });
                                }
                            }
                            i64++;
                        }
                    }
                });
                alertDialog$Builder.i(LocaleController.getString("Cancel", R.string.Cancel), new org.telegram.ui.Components.gp0(29));
                org.telegram.ui.ActionBar.d2 a102 = alertDialog$Builder.a();
                z18 = photoViewer2.z1(org.telegram.ui.ActionBar.j6.ug);
                a102.i(z18);
                a102.show();
                d = a102.d(-3);
                if (d instanceof TextView) {
                }
                z19 = photoViewer2.z1(org.telegram.ui.ActionBar.j6.hg);
                a102.o(z19);
                return;
            }
            messageObject50 = photoViewer2.T4;
            if (messageObject50 != null) {
                messageObject55 = photoViewer2.T4;
                if (MessageObject.getMedia(messageObject55.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) {
                    messageObject58 = photoViewer2.T4;
                    if (MessageObject.getMedia(messageObject58.messageOwner).webpage != null) {
                        messageObject59 = photoViewer2.T4;
                        if (MessageObject.getMedia(messageObject59.messageOwner).webpage.document == null) {
                            i58 = photoViewer2.P4;
                            p12 = photoViewer2.p1(i58, null);
                            i59 = photoViewer2.T;
                            file = FileLoader.getInstance(i59).getPathToAttach(p12, true);
                            if (!file.exists()) {
                                file = new File(FileLoader.getDirectory(4), file.getName());
                            }
                            messageObject57 = photoViewer2.T4;
                            a2 = messageObject57.isVideo();
                        }
                    }
                }
                i57 = photoViewer2.T;
                FileLoader fileLoader = FileLoader.getInstance(i57);
                messageObject56 = photoViewer2.T4;
                file = fileLoader.getPathToMessage(messageObject56.messageOwner);
                messageObject57 = photoViewer2.T4;
                a2 = messageObject57.isVideo();
            } else {
                imageLocation17 = photoViewer2.a5;
                if (imageLocation17 != null) {
                    imageLocation18 = photoViewer2.a5;
                    String q12 = PhotoViewer.q1(imageLocation18);
                    i53 = photoViewer2.T;
                    FileLoader fileLoader2 = FileLoader.getInstance(i53);
                    imageLocation19 = photoViewer2.a5;
                    TLObject tLObject2 = imageLocation19 == null ? null : imageLocation19.location;
                    j14 = photoViewer2.z5;
                    if (j14 == 0) {
                        z21 = photoViewer2.B5;
                        if (!z21) {
                            z20 = false;
                            pathToAttach = fileLoader2.getPathToAttach(tLObject2, q12, z20);
                            if (pathToAttach != null && !pathToAttach.exists()) {
                                i54 = photoViewer2.T;
                                FileLoader fileLoader3 = FileLoader.getInstance(i54);
                                imageLocation20 = photoViewer2.a5;
                                pathToAttach = fileLoader3.getPathToAttach(imageLocation20 != null ? null : imageLocation20.location, q12, false);
                            }
                            if (q12 != null) {
                                q12 = q12.toLowerCase();
                            }
                            r14 = q12 == null && (q12.equals("webm") || q12.equals("mp4") || q12.equals("gif"));
                            file = pathToAttach;
                        }
                    }
                    z20 = true;
                    pathToAttach = fileLoader2.getPathToAttach(tLObject2, q12, z20);
                    if (pathToAttach != null) {
                        i54 = photoViewer2.T;
                        FileLoader fileLoader32 = FileLoader.getInstance(i54);
                        imageLocation20 = photoViewer2.a5;
                        pathToAttach = fileLoader32.getPathToAttach(imageLocation20 != null ? null : imageLocation20.location, q12, false);
                    }
                    if (q12 != null) {
                    }
                    r14 = q12 == null && (q12.equals("webm") || q12.equals("mp4") || q12.equals("gif"));
                    file = pathToAttach;
                } else {
                    yu0Var6 = photoViewer2.j7;
                    if (yu0Var6 != null) {
                        yu0Var7 = photoViewer2.j7;
                        i51 = photoViewer2.P4;
                        file = yu0Var7.b(i51);
                        yu0Var8 = photoViewer2.j7;
                        i52 = photoViewer2.P4;
                        a2 = yu0Var8.a(i52);
                    } else {
                        file = null;
                        r14 = 0;
                    }
                }
                if (file != null && !file.exists()) {
                    file = new File(FileLoader.getDirectory(4), file.getName());
                }
                messageObject51 = photoViewer2.T4;
                if (messageObject51 != null) {
                    messageObject54 = photoViewer2.T4;
                    if (messageObject54.isLivePhoto()) {
                        z22 = true;
                        if (z22) {
                            messageObject52 = photoViewer2.T4;
                            if (MessageObject.getMedia(messageObject52.messageOwner) != null) {
                                messageObject53 = photoViewer2.T4;
                                document = MessageObject.getMedia(messageObject53.messageOwner).document;
                            } else {
                                document = null;
                            }
                            if (document != null) {
                                i55 = photoViewer2.T;
                                file2 = FileLoader.getInstance(i55).getPathToAttach(document, false);
                                if (file2 == null || !file2.exists()) {
                                    i56 = photoViewer2.T;
                                    file2 = FileLoader.getInstance(i56).getPathToAttach(document, true);
                                }
                                if (z22) {
                                    if (file == null || !file.exists()) {
                                        photoViewer2.U2();
                                        return;
                                    }
                                    String file3 = file.toString();
                                    activity19 = photoViewer2.y;
                                    MediaController.saveFile(file3, activity19, r14, null, null, new ls0(this, r14, true ? 1 : 0));
                                    return;
                                }
                                if (file == null || !file.exists() || file2 == null || !file2.exists()) {
                                    photoViewer2.U2();
                                    return;
                                }
                                String file4 = file.toString();
                                String file5 = file2.toString();
                                activity20 = photoViewer2.y;
                                MediaController.saveFile(file4, file5, activity20, new hs0(this, 0));
                                return;
                            }
                        }
                        file2 = null;
                        if (z22) {
                        }
                    }
                }
                z22 = false;
                if (z22) {
                }
                file2 = null;
                if (z22) {
                }
            }
            r14 = a2;
            if (file != null) {
                file = new File(FileLoader.getDirectory(4), file.getName());
            }
            messageObject51 = photoViewer2.T4;
            if (messageObject51 != null) {
            }
            z22 = false;
            if (z22) {
            }
            file2 = null;
            if (z22) {
            }
        } else {
            if (i10 == 24) {
                of.b d02 = of.b.d0();
                m12 = photoViewer2.m1();
                d02.o0(m12);
                t7Var = photoViewer2.G0;
                t7Var.performClick();
                return;
            }
            if (i10 == 3) {
                if (photoViewer2.E5 != 0) {
                    photoViewer2.s4 = true;
                    Bundle bundle = new Bundle();
                    bundle.putLong("dialog_id", photoViewer2.E5);
                    org.telegram.ui.Components.la0 la0Var = new org.telegram.ui.Components.la0(bundle, null);
                    eoVar8 = photoViewer2.l4;
                    if (eoVar8 != null) {
                        eoVar9 = photoViewer2.l4;
                        la0Var.X(eoVar9.v8());
                    }
                    photoViewer2.G0(false, false);
                    activity16 = photoViewer2.y;
                    if (activity16 instanceof LaunchActivity) {
                        activity17 = photoViewer2.y;
                        ((LaunchActivity) activity17).q0(la0Var, false, true);
                        return;
                    }
                    return;
                }
                return;
            }
            if (i10 == 5 || i10 == 21) {
                messageObject = photoViewer2.T4;
                if (messageObject == null) {
                    return;
                }
                Bundle bundle2 = new Bundle();
                long j15 = photoViewer2.E5;
                messageObject2 = photoViewer2.T4;
                if (messageObject2 != null) {
                    messageObject5 = photoViewer2.T4;
                    j15 = messageObject5.getDialogId();
                }
                if (DialogObject.isEncryptedDialog(j15)) {
                    bundle2.putInt("enc_id", DialogObject.getEncryptedChatId(j15));
                } else if (DialogObject.isUserDialog(j15)) {
                    bundle2.putLong("user_id", j15);
                } else {
                    i11 = photoViewer2.T;
                    TLRPC.Chat chat2 = MessagesController.getInstance(i11).getChat(Long.valueOf(-j15));
                    if (chat2 != null && chat2.migrated_to != null) {
                        bundle2.putLong("migrated_to", j15);
                        j15 = -chat2.migrated_to.channel_id;
                    }
                    bundle2.putLong("chat_id", -j15);
                }
                messageObject3 = photoViewer2.T4;
                bundle2.putInt("message_id", messageObject3.getId());
                if (i10 == 21) {
                    messageObject4 = photoViewer2.T4;
                    bundle2.putInt("reply_to", messageObject4.getId());
                }
                i12 = photoViewer2.T;
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                activity = photoViewer2.y;
                if (activity instanceof LaunchActivity) {
                    activity2 = photoViewer2.y;
                    LaunchActivity launchActivity = (LaunchActivity) activity2;
                    launchActivity.q0(new eo(bundle2), launchActivity.S() > 1 || AndroidUtilities.isTablet(), true);
                }
                photoViewer2.G0(false, false);
                photoViewer2.T4 = null;
                VideoAds videoAds = photoViewer2.U4;
                if (videoAds != null) {
                    videoAds.stop();
                    photoViewer2.U4 = null;
                    return;
                }
                return;
            }
            if (i10 == 25) {
                if (photoViewer2.m4 != null) {
                    cv0Var6 = photoViewer2.d;
                    if (cv0Var6 == null) {
                        return;
                    }
                    messageObject41 = photoViewer2.T4;
                    if (messageObject41 != null) {
                        messageObject42 = photoViewer2.T4;
                        if (messageObject42.messageOwner == null) {
                            return;
                        }
                        messageObject43 = photoViewer2.T4;
                        if (!TextUtils.isEmpty(messageObject43.messageOwner.attachPath)) {
                            messageObject45 = photoViewer2.T4;
                            str2 = messageObject45.messageOwner.attachPath;
                            if (!TextUtils.isEmpty(str2)) {
                            }
                        }
                        str2 = null;
                        if (TextUtils.isEmpty(str2)) {
                            i50 = photoViewer2.T;
                            FileLoader fileLoader4 = FileLoader.getInstance(i50);
                            messageObject44 = photoViewer2.T4;
                            File pathToMessage = fileLoader4.getPathToMessage(messageObject44.messageOwner, true);
                            if (pathToMessage != null && pathToMessage.exists()) {
                                str2 = pathToMessage.getAbsolutePath();
                            }
                        }
                        String str4 = str2;
                        if (TextUtils.isEmpty(str4)) {
                            return;
                        }
                        eoVar7 = photoViewer2.l4;
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add(new MediaController.PhotoEntry(0, 0, 0L, str4, 0, false, 0, 0, 0L));
                        this.b.f2(arrayList3, 0, 11, false, new ps0(), eoVar7);
                        photoViewer2.X0(null, null, false, null);
                        photoViewer2.l2();
                        tt.q().x();
                        return;
                    }
                    return;
                }
                return;
            }
            if (i10 == 4) {
                messageObject34 = photoViewer2.T4;
                if (messageObject34 == null) {
                    return;
                }
                activity12 = photoViewer2.y;
                if (!(activity12 instanceof LaunchActivity)) {
                    return;
                }
                messageObject35 = photoViewer2.T4;
                if (!messageObject35.scheduled) {
                    messageObject40 = photoViewer2.T4;
                    long dialogId = messageObject40.getDialogId();
                    if (DialogObject.isChatDialog(dialogId)) {
                        i49 = photoViewer2.T;
                        z11 = ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(i49).getChat(Long.valueOf(-dialogId)));
                        activity13 = photoViewer2.y;
                        messageObject36 = photoViewer2.T4;
                        ((LaunchActivity) activity13).K0(messageObject36.currentAccount);
                        arrayList = new ArrayList(1);
                        eoVar4 = photoViewer2.l4;
                        if (eoVar4 == null) {
                            eoVar6 = photoViewer2.l4;
                            messageObject39 = photoViewer2.T4;
                            str = "Cancel";
                            groupedMessages2 = eoVar6.y8(messageObject39.getGroupId());
                        } else {
                            str = "Cancel";
                        }
                        if (groupedMessages2 == null) {
                            arrayList.addAll(groupedMessages2.messages);
                        } else {
                            messageObject37 = photoViewer2.T4;
                            arrayList.add(messageObject37);
                        }
                        if (!z11 && arrayList.size() <= 1) {
                            PhotoViewer.C(photoViewer2, arrayList);
                            return;
                        }
                        if (arrayList.size() > 1) {
                            Bundle bundle3 = new Bundle();
                            bundle3.putBoolean("onlySelect", true);
                            bundle3.putBoolean("canSelectTopics", true);
                            bundle3.putInt("dialogsType", 3);
                            wy wyVar = new wy(bundle3);
                            ArrayList arrayList4 = new ArrayList();
                            messageObject38 = photoViewer2.T4;
                            arrayList4.add(messageObject38);
                            eoVar5 = photoViewer2.l4;
                            wyVar.C2 = new a7(this, arrayList4, eoVar5, 18);
                            activity14 = photoViewer2.y;
                            ((LaunchActivity) activity14).q0(wyVar, false, true);
                            photoViewer2.G0(false, false);
                            return;
                        }
                        for (int i64 = 0; i64 < arrayList.size(); i64++) {
                            if (!((MessageObject) arrayList.get(i64)).isPhoto() || ((MessageObject) arrayList.get(i64)).isVideo()) {
                                z13 = false;
                                break;
                            }
                        }
                        z13 = true;
                        activity15 = photoViewer2.y;
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(activity15, f6Var);
                        alertDialog$Builder2.l(LocaleController.getString("ForwardGroupMedia", R.string.ForwardGroupMedia));
                        alertDialog$Builder2.g(LocaleController.getString("ForwardGroupMediaMessage", R.string.ForwardGroupMediaMessage));
                        alertDialog$Builder2.a.I = org.telegram.ui.ActionBar.j6.pg;
                        final int i65 = 0;
                        alertDialog$Builder2.h(z13 ? LocaleController.getString("ThisPhoto", R.string.ThisPhoto) : LocaleController.getString("ThisMedia", R.string.ThisMedia), new org.telegram.ui.ActionBar.c2(this) { // from class: org.telegram.ui.is0
                            public final /* synthetic */ rs0 b;

                            {
                                this.b = this;
                            }

                            @Override // org.telegram.ui.ActionBar.c2
                            public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i632) {
                                switch (i65) {
                                    case 0:
                                        rs0 rs0Var = this.b;
                                        rs0Var.getClass();
                                        ArrayList arrayList32 = new ArrayList(1);
                                        PhotoViewer photoViewer3 = rs0Var.b;
                                        arrayList32.add(photoViewer3.T4);
                                        PhotoViewer.C(photoViewer3, arrayList32);
                                        break;
                                    default:
                                        rs0 rs0Var2 = this.b;
                                        PhotoViewer photoViewer4 = rs0Var2.b;
                                        MessageObject messageObject62 = photoViewer4.T4;
                                        if (messageObject62 != null) {
                                            File file32 = null;
                                            File pathToAttach2 = ((MessageObject.getMedia(messageObject62.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) && MessageObject.getMedia(photoViewer4.T4.messageOwner).webpage != null && MessageObject.getMedia(photoViewer4.T4.messageOwner).webpage.document == null) ? FileLoader.getInstance(photoViewer4.T).getPathToAttach(photoViewer4.p1(photoViewer4.P4, null), true) : FileLoader.getInstance(photoViewer4.T).getPathToMessage(photoViewer4.T4.messageOwner);
                                            boolean isVideo = photoViewer4.T4.isVideo();
                                            boolean isLivePhoto = photoViewer4.T4.isLivePhoto();
                                            if (isLivePhoto) {
                                                TLRPC.Document document2 = MessageObject.getMedia(photoViewer4.T4.messageOwner) != null ? MessageObject.getMedia(photoViewer4.T4.messageOwner).document : null;
                                                if (document2 != null && ((file32 = FileLoader.getInstance(photoViewer4.T).getPathToAttach(document2, false)) == null || !file32.exists())) {
                                                    file32 = FileLoader.getInstance(photoViewer4.T).getPathToAttach(document2, true);
                                                }
                                            }
                                            if (!isLivePhoto) {
                                                if (pathToAttach2 != null && pathToAttach2.exists()) {
                                                    MediaController.saveFile(pathToAttach2.toString(), photoViewer4.y, isVideo ? 1 : 0, null, null, new ls0(rs0Var2, isVideo, 0));
                                                    break;
                                                } else {
                                                    photoViewer4.U2();
                                                    break;
                                                }
                                            } else if (pathToAttach2 != null && pathToAttach2.exists() && file32 != null && file32.exists()) {
                                                MediaController.saveFile(pathToAttach2.toString(), file32.toString(), photoViewer4.y, new hs0(rs0Var2, 1));
                                                break;
                                            } else {
                                                photoViewer4.U2();
                                                break;
                                            }
                                        }
                                        break;
                                }
                            }
                        });
                        alertDialog$Builder2.k(z13 ? LocaleController.formatPluralString("AllNPhotos", arrayList.size(), new Object[0]) : LocaleController.formatPluralString("AllNMedia", arrayList.size(), new Object[0]), new l80(23, this, arrayList));
                        alertDialog$Builder2.i(LocaleController.getString(str, R.string.Cancel), new js0(0));
                        org.telegram.ui.ActionBar.d2 a11 = alertDialog$Builder2.a();
                        z14 = photoViewer2.z1(org.telegram.ui.ActionBar.j6.ug);
                        a11.i(z14);
                        a11.show();
                        View d10 = a11.d(-3);
                        if (d10 instanceof TextView) {
                            int i66 = org.telegram.ui.ActionBar.j6.q7;
                            z16 = photoViewer2.z1(i66);
                            ((TextView) d10).setTextColor(z16);
                            z17 = photoViewer2.z1(i66);
                            d10.setBackground(org.telegram.ui.ActionBar.j6.G0(AndroidUtilities.dp(3.0f), z17));
                            ViewGroup viewGroup2 = a11.t0;
                            if ((viewGroup2 instanceof LinearLayout) && ((LinearLayout) viewGroup2).getOrientation() == 1) {
                                d10.bringToFront();
                            }
                        }
                        z15 = photoViewer2.z1(org.telegram.ui.ActionBar.j6.hg);
                        a11.o(z15);
                        return;
                    }
                }
                z11 = false;
                activity13 = photoViewer2.y;
                messageObject36 = photoViewer2.T4;
                ((LaunchActivity) activity13).K0(messageObject36.currentAccount);
                arrayList = new ArrayList(1);
                eoVar4 = photoViewer2.l4;
                if (eoVar4 == null) {
                }
                if (groupedMessages2 == null) {
                }
                if (!z11) {
                }
                if (arrayList.size() > 1) {
                }
            } else {
                if (i10 == 18) {
                    PhotoViewer.D(photoViewer2);
                    return;
                }
                if (i10 == 26) {
                    activity11 = photoViewer2.y;
                    if (activity11 != null) {
                        cv0Var4 = photoViewer2.d;
                        if (cv0Var4 == null) {
                            return;
                        }
                        cv0Var5 = photoViewer2.d;
                        cv0Var5.I();
                        photoViewer2.G0(true, false);
                        return;
                    }
                    return;
                }
                if (i10 == 7) {
                    activity9 = photoViewer2.y;
                    if (activity9 == null) {
                        return;
                    }
                    cv0Var2 = photoViewer2.d;
                    if (cv0Var2 == null) {
                        return;
                    }
                    messageObject24 = photoViewer2.T4;
                    if (messageObject24 != null) {
                        messageObject32 = photoViewer2.T4;
                        if (!messageObject32.scheduled) {
                            messageObject33 = photoViewer2.T4;
                            long dialogId2 = messageObject33.getDialogId();
                            if (DialogObject.isChatDialog(dialogId2)) {
                                i48 = photoViewer2.T;
                                z10 = ChatObject.isChannel(MessagesController.getInstance(i48).getChat(Long.valueOf(-dialogId2)));
                                activity10 = photoViewer2.y;
                                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(activity10);
                                cv0Var3 = photoViewer2.d;
                                a02 = cv0Var3.a0();
                                if (a02 == null) {
                                    alertDialog$Builder3.l(LocaleController.getString("AreYouSureDeletePhotoTitle", R.string.AreYouSureDeletePhotoTitle));
                                    alertDialog$Builder3.g(a02);
                                } else {
                                    if (!photoViewer2.t4) {
                                        imageLocation14 = photoViewer2.a5;
                                        if (imageLocation14 != null) {
                                            imageLocation15 = photoViewer2.a5;
                                            imageLocation16 = photoViewer2.Z4;
                                        }
                                        messageObject25 = photoViewer2.T4;
                                        if (messageObject25 != null) {
                                            messageObject28 = photoViewer2.T4;
                                        }
                                        messageObject26 = photoViewer2.T4;
                                        if (messageObject26 != null) {
                                            messageObject27 = photoViewer2.T4;
                                            if (messageObject27.isGif()) {
                                                alertDialog$Builder3.l(LocaleController.getString("AreYouSureDeleteGIFTitle", R.string.AreYouSureDeleteGIFTitle));
                                                if (z10) {
                                                    alertDialog$Builder3.g(LocaleController.formatString("AreYouSureDeleteGIFEveryone", R.string.AreYouSureDeleteGIFEveryone, new Object[0]));
                                                } else {
                                                    alertDialog$Builder3.g(LocaleController.formatString("AreYouSureDeleteGIF", R.string.AreYouSureDeleteGIF, new Object[0]));
                                                }
                                            }
                                        }
                                        alertDialog$Builder3.l(LocaleController.getString("AreYouSureDeletePhotoTitle", R.string.AreYouSureDeletePhotoTitle));
                                        if (z10) {
                                            alertDialog$Builder3.g(LocaleController.formatString("AreYouSureDeletePhotoEveryone", R.string.AreYouSureDeletePhotoEveryone, new Object[0]));
                                        } else {
                                            alertDialog$Builder3.g(LocaleController.formatString("AreYouSureDeletePhoto", R.string.AreYouSureDeletePhoto, new Object[0]));
                                        }
                                    }
                                    alertDialog$Builder3.l(LocaleController.getString("AreYouSureDeleteVideoTitle", R.string.AreYouSureDeleteVideoTitle));
                                    if (z10) {
                                        alertDialog$Builder3.g(LocaleController.formatString("AreYouSureDeleteVideoEveryone", R.string.AreYouSureDeleteVideoEveryone, new Object[0]));
                                    } else {
                                        alertDialog$Builder3.g(LocaleController.formatString("AreYouSureDeleteVideo", R.string.AreYouSureDeleteVideo, new Object[0]));
                                    }
                                }
                                boolean[] zArr = new boolean[1];
                                messageObject29 = photoViewer2.T4;
                                if (messageObject29 != null) {
                                    messageObject30 = photoViewer2.T4;
                                    if (!messageObject30.scheduled) {
                                        messageObject31 = photoViewer2.T4;
                                        long dialogId3 = messageObject31.getDialogId();
                                        if (!DialogObject.isEncryptedDialog(dialogId3)) {
                                            if (DialogObject.isUserDialog(dialogId3)) {
                                                i47 = photoViewer2.T;
                                                user = MessagesController.getInstance(i47).getUser(Long.valueOf(dialogId3));
                                                chat = null;
                                            } else {
                                                i41 = photoViewer2.T;
                                                chat = MessagesController.getInstance(i41).getChat(Long.valueOf(-dialogId3));
                                                user = null;
                                            }
                                            if (user != null || !ChatObject.isChannel(chat)) {
                                                i42 = photoViewer2.T;
                                                int currentTime = ConnectionsManager.getInstance(i42).getCurrentTime();
                                                if (user != null) {
                                                    i46 = photoViewer2.T;
                                                    i44 = MessagesController.getInstance(i46).revokeTimePmLimit;
                                                } else {
                                                    i43 = photoViewer2.T;
                                                    i44 = MessagesController.getInstance(i43).revokeTimeLimit;
                                                }
                                                if (user != null) {
                                                    long j16 = user.id;
                                                    i45 = photoViewer2.T;
                                                }
                                            }
                                        }
                                    }
                                }
                                String str5 = "Cancel";
                                alertDialog$Builder3.k(LocaleController.getString("Delete", R.string.Delete), new l80(24, this, zArr));
                                alertDialog$Builder3.h(LocaleController.getString(str5, R.string.Cancel), null);
                                org.telegram.ui.ActionBar.d2 a12 = alertDialog$Builder3.a();
                                photoViewer2.S2(alertDialog$Builder3);
                                textView = (TextView) a12.d(-1);
                                if (textView == null) {
                                    z12 = photoViewer2.z1(org.telegram.ui.ActionBar.j6.q7);
                                    textView.setTextColor(z12);
                                    return;
                                }
                                return;
                            }
                        }
                    }
                    z10 = false;
                    activity10 = photoViewer2.y;
                    AlertDialog$Builder alertDialog$Builder32 = new AlertDialog$Builder(activity10);
                    cv0Var3 = photoViewer2.d;
                    a02 = cv0Var3.a0();
                    if (a02 == null) {
                    }
                    boolean[] zArr2 = new boolean[1];
                    messageObject29 = photoViewer2.T4;
                    if (messageObject29 != null) {
                    }
                    String str52 = "Cancel";
                    alertDialog$Builder32.k(LocaleController.getString("Delete", R.string.Delete), new l80(24, this, zArr2));
                    alertDialog$Builder32.h(LocaleController.getString(str52, R.string.Cancel), null);
                    org.telegram.ui.ActionBar.d2 a122 = alertDialog$Builder32.a();
                    photoViewer2.S2(alertDialog$Builder32);
                    textView = (TextView) a122.d(-1);
                    if (textView == null) {
                    }
                } else {
                    if (i10 == 9 || i10 == 16) {
                        PhotoViewer.F(photoViewer2);
                        return;
                    }
                    if (i10 == 10) {
                        try {
                            if (photoViewer2.t4) {
                                activity5 = photoViewer2.y;
                                messageObject11 = photoViewer2.T4;
                                nf.f.s(activity5, MessageObject.getMedia(messageObject11.messageOwner).webpage.url);
                                photoViewer2.G0(false, false);
                                return;
                            }
                            messageObject6 = photoViewer2.T4;
                            if (messageObject6 == null) {
                                yu0Var = photoViewer2.j7;
                                if (yu0Var != null) {
                                    yu0Var2 = photoViewer2.j7;
                                    i13 = photoViewer2.P4;
                                    TLObject d11 = yu0Var2.d(i13);
                                    activity3 = photoViewer2.y;
                                    if (AndroidUtilities.openForView(d11, activity3)) {
                                        photoViewer2.G0(false, false);
                                        return;
                                    } else {
                                        photoViewer2.U2();
                                        return;
                                    }
                                }
                                return;
                            }
                            messageObject7 = photoViewer2.T4;
                            activity4 = photoViewer2.y;
                            messageObject8 = photoViewer2.T4;
                            if (!messageObject8.isVideo()) {
                                messageObject9 = photoViewer2.T4;
                                if (!messageObject9.isPhoto()) {
                                    messageObject10 = photoViewer2.T4;
                                    if (!messageObject10.isSticker()) {
                                        z23 = false;
                                    }
                                }
                            }
                            if (AndroidUtilities.openForView(messageObject7, activity4, f6Var, z23)) {
                                photoViewer2.G0(false, false);
                                return;
                            } else {
                                photoViewer2.U2();
                                return;
                            }
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                    }
                    if (i10 == 11 || i10 == 13) {
                        activity6 = photoViewer2.y;
                        if (activity6 != null) {
                            messageObject12 = photoViewer2.T4;
                            if (messageObject12 == null) {
                                return;
                            }
                            messageObject13 = photoViewer2.T4;
                            if (MessageObject.getMedia(messageObject13.messageOwner) instanceof TLRPC.TL_messageMediaPhoto) {
                                messageObject17 = photoViewer2.T4;
                                tLObject = MessageObject.getMedia(messageObject17.messageOwner).photo;
                            } else {
                                messageObject14 = photoViewer2.T4;
                                if (!(MessageObject.getMedia(messageObject14.messageOwner) instanceof TLRPC.TL_messageMediaDocument)) {
                                    return;
                                }
                                messageObject15 = photoViewer2.T4;
                                tLObject = MessageObject.getMedia(messageObject15.messageOwner).document;
                            }
                            TLObject tLObject3 = tLObject;
                            activity7 = photoViewer2.y;
                            messageObject16 = photoViewer2.T4;
                            photoViewer2.U3 = new qs0(this, activity7, messageObject16, tLObject3, this.a);
                            hy0Var = photoViewer2.U3;
                            hy0Var.show();
                            return;
                        }
                        return;
                    }
                    if (i10 == 6) {
                        w0Var = photoViewer2.o0;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = w0Var.b;
                        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null || (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(6)) == null || findViewWithTag.getVisibility() != 0) {
                            return;
                        }
                        if (!photoViewer2.t4) {
                            photoViewer2.h3();
                            return;
                        }
                        zf0Var = photoViewer2.f0;
                        if (zf0Var.e()) {
                            if (PhotoViewer.a9 != null) {
                                PhotoViewer.a9.P0();
                            }
                            photoViewer2.J3 = true;
                            photoViewer = PhotoViewer.Z8;
                            PhotoViewer.a9 = photoViewer;
                            PhotoViewer.Z8 = null;
                            photoViewer2.e = false;
                            photoViewer2.f = false;
                            ev0 ev0Var = photoViewer2.d5;
                            if (ev0Var != null && !ev0Var.a.getVisible()) {
                                photoViewer2.d5.a.setVisible(true, true);
                            }
                            photoViewer2.m6 = 1.0f;
                            photoViewer2.e0.invalidate();
                            photoViewer2.S0();
                            return;
                        }
                        return;
                    }
                    if (i10 == 8) {
                        messageObject22 = photoViewer2.T4;
                        if (messageObject22 == null) {
                            return;
                        }
                        i40 = photoViewer2.T;
                        FileLoader fileLoader5 = FileLoader.getInstance(i40);
                        messageObject23 = photoViewer2.T4;
                        fileLoader5.cancelLoadFile(messageObject23.getDocument());
                        photoViewer2.n2(false);
                        photoViewer2.i0.setTag(r3);
                        photoViewer2.i0.setVisibility(0);
                        return;
                    }
                    if (i10 == 12) {
                        messageObject19 = photoViewer2.T4;
                        if (messageObject19 != null) {
                            messageObject20 = photoViewer2.T4;
                            TLRPC.Document document2 = messageObject20.getDocument();
                            eoVar = photoViewer2.l4;
                            if (eoVar != null) {
                                eoVar2 = photoViewer2.l4;
                                if (eoVar2.Y != null) {
                                    eoVar3 = photoViewer2.l4;
                                    eoVar3.Y.n(document2);
                                    i39 = photoViewer2.T;
                                    MessagesController messagesController = MessagesController.getInstance(i39);
                                    messageObject21 = photoViewer2.T4;
                                    messagesController.saveGif(messageObject21, document2);
                                }
                            }
                            i38 = photoViewer2.T;
                            MediaDataController.getInstance(i38).addRecentGif(document2, (int) (System.currentTimeMillis() / 1000), true);
                            i39 = photoViewer2.T;
                            MessagesController messagesController2 = MessagesController.getInstance(i39);
                            messageObject21 = photoViewer2.T4;
                            messagesController2.saveGif(messageObject21, document2);
                        } else {
                            yu0Var3 = photoViewer2.j7;
                            if (yu0Var3 == null) {
                                return;
                            }
                            yu0Var4 = photoViewer2.j7;
                            i35 = photoViewer2.P4;
                            TLObject d12 = yu0Var4.d(i35);
                            if (d12 instanceof TLRPC.Document) {
                                TLRPC.Document document3 = (TLRPC.Document) d12;
                                i36 = photoViewer2.T;
                                MediaDataController.getInstance(i36).addRecentGif(document3, (int) (System.currentTimeMillis() / 1000), true);
                                i37 = photoViewer2.T;
                                MessagesController messagesController3 = MessagesController.getInstance(i37);
                                yu0Var5 = photoViewer2.j7;
                                messagesController3.saveGif(yu0Var5.g(), document3);
                            }
                        }
                        wu0 wu0Var = photoViewer2.e0;
                        if (wu0Var != null) {
                            org.telegram.ui.Components.wc.Z(wu0Var, f6Var).o(org.telegram.ui.Components.vc.y, f6Var).j();
                            return;
                        }
                        return;
                    }
                    if (i10 == 14) {
                        ArrayList arrayList5 = photoViewer2.f7;
                        i18 = photoViewer2.P4;
                        TLRPC.Photo photo3 = (TLRPC.Photo) arrayList5.get(i18);
                        if (photo3 == null || photo3.sizes.isEmpty()) {
                            return;
                        }
                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo3.sizes, 800);
                        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo3.sizes, 90);
                        i19 = photoViewer2.T;
                        UserConfig userConfig = UserConfig.getInstance(i19);
                        j10 = photoViewer2.z5;
                        if (j10 == userConfig.clientUserId) {
                            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
                            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                            tL_photos_updateProfilePhoto.id = tL_inputPhoto;
                            tL_inputPhoto.id = photo3.id;
                            tL_inputPhoto.access_hash = photo3.access_hash;
                            tL_inputPhoto.file_reference = photo3.file_reference;
                            i32 = photoViewer2.T;
                            ConnectionsManager.getInstance(i32).sendRequest(tL_photos_updateProfilePhoto, new ms0(this, userConfig, photo3, 0));
                            i33 = photoViewer2.T;
                            TLRPC.User user2 = MessagesController.getInstance(i33).getUser(Long.valueOf(userConfig.clientUserId));
                            if (user2 != null) {
                                TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                userProfilePhoto.photo_id = photo3.id;
                                userProfilePhoto.dc_id = photo3.dc_id;
                                userProfilePhoto.photo_small = closestPhotoSizeWithSize2.location;
                                userProfilePhoto.photo_big = closestPhotoSizeWithSize.location;
                                userConfig.setCurrentUser(user2);
                                userConfig.saveConfig(true);
                                i34 = photoViewer2.T;
                                NotificationCenter.getInstance(i34).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                            }
                        } else {
                            i20 = photoViewer2.T;
                            MessagesController messagesController4 = MessagesController.getInstance(i20);
                            j11 = photoViewer2.z5;
                            TLRPC.Chat chat3 = messagesController4.getChat(Long.valueOf(-j11));
                            if (chat3 == null) {
                                return;
                            }
                            TLRPC.TL_inputChatPhoto tL_inputChatPhoto = new TLRPC.TL_inputChatPhoto();
                            TLRPC.TL_inputPhoto tL_inputPhoto2 = new TLRPC.TL_inputPhoto();
                            tL_inputChatPhoto.id = tL_inputPhoto2;
                            tL_inputPhoto2.id = photo3.id;
                            tL_inputPhoto2.access_hash = photo3.access_hash;
                            tL_inputPhoto2.file_reference = photo3.file_reference;
                            i21 = photoViewer2.T;
                            MessagesController messagesController5 = MessagesController.getInstance(i21);
                            j12 = photoViewer2.z5;
                            messagesController5.changeChatAvatar(-j12, tL_inputChatPhoto, null, null, null, 0.0d, null, null, null, null);
                            TLRPC.ChatPhoto chatPhoto = chat3.photo;
                            chatPhoto.dc_id = photo3.dc_id;
                            chatPhoto.photo_small = closestPhotoSizeWithSize2.location;
                            chatPhoto.photo_big = closestPhotoSizeWithSize.location;
                            i22 = photoViewer2.T;
                            NotificationCenter.getInstance(i22).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
                        }
                        photoViewer2.h7 = ImageLocation.getForPhoto(closestPhotoSizeWithSize, photo3);
                        ArrayList arrayList6 = photoViewer2.f7;
                        i23 = photoViewer2.P4;
                        arrayList6.remove(i23);
                        photoViewer2.f7.add(0, photo3);
                        ArrayList arrayList7 = photoViewer2.a7;
                        i24 = photoViewer2.P4;
                        ImageLocation imageLocation21 = (ImageLocation) arrayList7.get(i24);
                        ArrayList arrayList8 = photoViewer2.a7;
                        i25 = photoViewer2.P4;
                        arrayList8.remove(i25);
                        photoViewer2.a7.add(0, imageLocation21);
                        ArrayList arrayList9 = photoViewer2.b7;
                        i26 = photoViewer2.P4;
                        ImageLocation imageLocation22 = (ImageLocation) arrayList9.get(i26);
                        ArrayList arrayList10 = photoViewer2.b7;
                        i27 = photoViewer2.P4;
                        arrayList10.remove(i27);
                        photoViewer2.b7.add(0, imageLocation22);
                        ArrayList arrayList11 = photoViewer2.c7;
                        i28 = photoViewer2.P4;
                        Long l4 = (Long) arrayList11.get(i28);
                        ArrayList arrayList12 = photoViewer2.c7;
                        i29 = photoViewer2.P4;
                        arrayList12.remove(i29);
                        photoViewer2.c7.add(0, l4);
                        ArrayList arrayList13 = photoViewer2.d7;
                        i30 = photoViewer2.P4;
                        TLRPC.Message message = (TLRPC.Message) arrayList13.get(i30);
                        ArrayList arrayList14 = photoViewer2.d7;
                        i31 = photoViewer2.P4;
                        arrayList14.remove(i31);
                        photoViewer2.d7.add(0, message);
                        photoViewer2.P4 = -1;
                        photoViewer2.B2(0);
                        org.telegram.ui.Components.f40 f40Var = photoViewer2.l1;
                        f40Var.d.clear();
                        f40Var.e.clear();
                        f40Var.c.clear();
                        photoViewer2.l1.b();
                        undoView = photoViewer2.n1;
                        j13 = photoViewer2.z5;
                        imageLocation12 = photoViewer2.a5;
                        imageLocation13 = photoViewer2.Z4;
                        undoView.m(j13, imageLocation12 == imageLocation13 ? null : 1, 22);
                        final int i67 = 0;
                        AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.ns0
                            public final /* synthetic */ rs0 b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i67) {
                                    case 0:
                                        org.telegram.ui.ActionBar.w0 w0Var2 = this.b.b.o0;
                                        if (w0Var2 != null) {
                                            w0Var2.r(14);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        PhotoViewer photoViewer3 = this.b.b;
                                        photoViewer3.o0.r(19);
                                        photoViewer3.o0.K(20);
                                        break;
                                    default:
                                        PhotoViewer photoViewer4 = this.b.b;
                                        photoViewer4.o0.K(19);
                                        photoViewer4.o0.r(20);
                                        break;
                                }
                            }
                        }, 300L);
                        return;
                    }
                    if (i10 == 15) {
                        i16 = photoViewer2.T;
                        FileLoader fileLoader6 = FileLoader.getInstance(i16);
                        imageLocation7 = photoViewer2.a5;
                        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = imageLocation7 == null ? null : imageLocation7.location;
                        imageLocation8 = photoViewer2.a5;
                        File pathToAttach2 = fileLoader6.getPathToAttach(tL_fileLocationToBeDeprecated, PhotoViewer.q1(imageLocation8), true);
                        imageLocation9 = photoViewer2.a5;
                        boolean z29 = imageLocation9.imageType == 2;
                        if (z29) {
                            i17 = photoViewer2.T;
                            FileLoader fileLoader7 = FileLoader.getInstance(i17);
                            imageLocation10 = photoViewer2.Z4;
                            TLObject tLObject4 = imageLocation10 != null ? imageLocation10.location : null;
                            imageLocation11 = photoViewer2.Z4;
                            str3 = fileLoader7.getPathToAttach(tLObject4, PhotoViewer.q1(imageLocation11), true).getAbsolutePath();
                        }
                        cv0Var = photoViewer2.d;
                        cv0Var.f(pathToAttach2.getAbsolutePath(), str3, z29);
                        return;
                    }
                    if (i10 == 19) {
                        int i68 = photoViewer2.Q4;
                        if (i68 < 0 || i68 >= photoViewer2.Y6.size()) {
                            return;
                        }
                        MessageObject messageObject62 = (MessageObject) photoViewer2.Y6.get(photoViewer2.Q4);
                        photoViewer2.n5 = true;
                        final int i69 = true ? 1 : 0;
                        AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.ns0
                            public final /* synthetic */ rs0 b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i69) {
                                    case 0:
                                        org.telegram.ui.ActionBar.w0 w0Var2 = this.b.b.o0;
                                        if (w0Var2 != null) {
                                            w0Var2.r(14);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        PhotoViewer photoViewer3 = this.b.b;
                                        photoViewer3.o0.r(19);
                                        photoViewer3.o0.K(20);
                                        break;
                                    default:
                                        PhotoViewer photoViewer4 = this.b.b;
                                        photoViewer4.o0.K(19);
                                        photoViewer4.o0.r(20);
                                        break;
                                }
                            }
                        }, 32L);
                        PhotoViewer.S(photoViewer2);
                        i15 = photoViewer2.T;
                        MessagesController.getInstance(i15).getTranslateController().translatePhoto(messageObject62, new as0(photoViewer2, 3));
                        return;
                    }
                    if (i10 == 20) {
                        photoViewer2.n5 = false;
                        final int i70 = 2;
                        AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.ns0
                            public final /* synthetic */ rs0 b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i70) {
                                    case 0:
                                        org.telegram.ui.ActionBar.w0 w0Var2 = this.b.b.o0;
                                        if (w0Var2 != null) {
                                            w0Var2.r(14);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        PhotoViewer photoViewer3 = this.b.b;
                                        photoViewer3.o0.r(19);
                                        photoViewer3.o0.K(20);
                                        break;
                                    default:
                                        PhotoViewer photoViewer4 = this.b.b;
                                        photoViewer4.o0.K(19);
                                        photoViewer4.o0.r(20);
                                        break;
                                }
                            }
                        }, 32L);
                        PhotoViewer.S(photoViewer2);
                        return;
                    }
                    if (i10 == 22) {
                        photoViewer2.Z2 = !photoViewer2.Z2;
                        boolean z30 = photoViewer2.Z2;
                        messageObject18 = photoViewer2.T4;
                        org.telegram.ui.Components.t71.I(messageObject18, z30);
                        org.telegram.ui.Components.t71 t71Var = photoViewer2.F2;
                        if (t71Var != null) {
                            t71Var.N(photoViewer2.Z2);
                        }
                        photoViewer2.s0.d(photoViewer2.Z2);
                        photoViewer2.s0.setSelectorColor(photoViewer2.Z2 ? 259241196 : 268435455);
                        return;
                    }
                    if (i10 != 23) {
                        return;
                    }
                    imageLocation = photoViewer2.Z4;
                    if (imageLocation != null) {
                        imageLocation5 = photoViewer2.Z4;
                        if (imageLocation5.photo != null) {
                            imageLocation6 = photoViewer2.Z4;
                            photo2 = imageLocation6.photo;
                            photo = photo2;
                            if (photo != null) {
                                return;
                            }
                            i14 = photoViewer2.T;
                            activity8 = photoViewer2.y;
                            j3 = photoViewer2.z5;
                            org.telegram.ui.Components.d5.J(i14, activity8, j3, photo, new zh.b());
                            return;
                        }
                    }
                    imageLocation2 = photoViewer2.a5;
                    if (imageLocation2 != null) {
                        imageLocation3 = photoViewer2.a5;
                        if (imageLocation3.photo != null) {
                            imageLocation4 = photoViewer2.a5;
                            photo2 = imageLocation4.photo;
                        }
                    }
                    photo = photo2;
                    if (photo != null) {
                    }
                }
            }
        }
    }
}
