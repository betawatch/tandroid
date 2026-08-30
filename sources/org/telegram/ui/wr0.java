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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class wr0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 a;
    public final /* synthetic */ PhotoViewer b;

    public wr0(PhotoViewer photoViewer, org.telegram.ui.ActionBar.f6 f6Var) {
        this.b = photoViewer;
        this.a = f6Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final boolean a() {
        PhotoViewer photoViewer = this.b;
        if (photoViewer.Q4 != null || photoViewer.Y4 != null) {
            return true;
        }
        if (photoViewer.X4 == null) {
            return photoViewer.g7 != null;
        }
        FileLoader fileLoader = FileLoader.getInstance(photoViewer.Q);
        ImageLocation imageLocation = photoViewer.X4;
        File pathToAttach = fileLoader.getPathToAttach(imageLocation == null ? null : imageLocation.location, PhotoViewer.q1(imageLocation), photoViewer.w5 != 0 || photoViewer.y5);
        File file = new File(FileLoader.getDirectory(4), pathToAttach.getName());
        FileLoader fileLoader2 = FileLoader.getInstance(photoViewer.Q);
        ImageLocation imageLocation2 = photoViewer.X4;
        return pathToAttach.exists() || file.exists() || fileLoader2.getPathToAttach(imageLocation2 != null ? imageLocation2.location : null, PhotoViewer.q1(imageLocation2), false).exists();
    }

    /* JADX WARN: Code restructure failed: missing block: B:202:0x040c, code lost:
    
        if (e2.c.t(r0) != false) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x07f3, code lost:
    
        if (r14 == org.telegram.messenger.UserConfig.getInstance(r13).getClientUserId()) goto L353;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x07f7, code lost:
    
        if (r5 == null) goto L358;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x07f9, code lost:
    
        r13 = r7.Q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x0803, code lost:
    
        if (org.telegram.messenger.MessagesController.getInstance(r13).canRevokePmInbox == false) goto L358;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x0805, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x0808, code lost:
    
        r14 = r7.Q4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x0810, code lost:
    
        if (r14.messageOwner.action == null) goto L363;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x0812, code lost:
    
        r14 = r7.Q4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x081c, code lost:
    
        if ((r14.messageOwner.action instanceof org.telegram.tgnet.TLRPC.TL_messageActionEmpty) == false) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x081e, code lost:
    
        r14 = r7.Q4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x0826, code lost:
    
        if (r14.isOut() != false) goto L368;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x0828, code lost:
    
        if (r13 != false) goto L368;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x082e, code lost:
    
        if (org.telegram.messenger.ChatObject.hasAdminRights(r9) == false) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x0830, code lost:
    
        r13 = r7.Q4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x0839, code lost:
    
        if ((r10 - r13.messageOwner.date) > r12) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x083b, code lost:
    
        r10 = r7.y;
        r14 = new android.widget.FrameLayout(r10);
        r10 = r7.y;
        r8 = new org.telegram.ui.Cells.z1(r10, 1, r2);
        r8.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x0856, code lost:
    
        if (r9 == null) goto L373;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x0858, code lost:
    
        r2 = "Cancel";
        r8.e(org.telegram.messenger.LocaleController.getString("DeleteForAll", org.telegram.messenger.R.string.DeleteForAll), "", false, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x088b, code lost:
    
        if (org.telegram.messenger.LocaleController.isRTL == false) goto L377;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x088d, code lost:
    
        r5 = org.telegram.messenger.AndroidUtilities.dp(16.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x0898, code lost:
    
        if (org.telegram.messenger.LocaleController.isRTL == false) goto L381;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x089a, code lost:
    
        r6 = org.telegram.messenger.AndroidUtilities.dp(8.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x08a3, code lost:
    
        r8.setPadding(r5, 0, r6, 0);
        r14.addView(r8, k7.b6.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        r8.setOnClickListener(new org.telegram.ui.o8(5, r0));
        r3.n(r14);
        r3.a.D = 9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x089f, code lost:
    
        r6 = org.telegram.messenger.AndroidUtilities.dp(16.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x0892, code lost:
    
        r5 = org.telegram.messenger.AndroidUtilities.dp(8.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x086a, code lost:
    
        r2 = "Cancel";
        r8.e(org.telegram.messenger.LocaleController.formatString("DeleteForUser", org.telegram.messenger.R.string.DeleteForUser, org.telegram.messenger.UserObject.getFirstName(r5)), "", false, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x0807, code lost:
    
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x07f5, code lost:
    
        if (r9 != null) goto L354;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x06ce, code lost:
    
        if (r5 == r10) goto L310;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x06de, code lost:
    
        if (r5.isVideo() != false) goto L327;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x06ae  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0771  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x08f7  */
    /* JADX WARN: Removed duplicated region for block: B:357:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:366:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x0dc3  */
    /* JADX WARN: Removed duplicated region for block: B:536:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0246  */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v19 */
    @Override // org.telegram.ui.ActionBar.j
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
        du0 du0Var;
        du0 du0Var2;
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
        org.telegram.ui.Components.xx0 xx0Var;
        MessageObject messageObject17;
        ImageLocation imageLocation;
        ImageLocation imageLocation2;
        TLRPC.Photo photo;
        ImageLocation imageLocation3;
        ImageLocation imageLocation4;
        TLRPC.Photo photo2;
        int i14;
        Activity activity8;
        long j10;
        ImageLocation imageLocation5;
        ImageLocation imageLocation6;
        MessageObject messageObject18;
        int i15;
        int i16;
        ImageLocation imageLocation7;
        ImageLocation imageLocation8;
        ImageLocation imageLocation9;
        String str;
        hu0 hu0Var;
        int i17;
        ImageLocation imageLocation10;
        ImageLocation imageLocation11;
        int i18;
        int i19;
        long j11;
        int i20;
        long j12;
        int i21;
        long j13;
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
        long j14;
        ImageLocation imageLocation12;
        ImageLocation imageLocation13;
        int i32;
        int i33;
        int i34;
        MessageObject messageObject19;
        du0 du0Var3;
        du0 du0Var4;
        int i35;
        int i36;
        int i37;
        du0 du0Var5;
        MessageObject messageObject20;
        xn xnVar;
        int i38;
        int i39;
        MessageObject messageObject21;
        xn xnVar2;
        xn xnVar3;
        MessageObject messageObject22;
        int i40;
        MessageObject messageObject23;
        org.telegram.ui.ActionBar.w0 w0Var;
        View findViewWithTag;
        org.telegram.ui.Components.vf0 vf0Var;
        PhotoViewer photoViewer;
        Activity activity9;
        hu0 hu0Var2;
        MessageObject messageObject24;
        boolean z4;
        Activity activity10;
        hu0 hu0Var3;
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
        hu0 hu0Var4;
        hu0 hu0Var5;
        MessageObject messageObject34;
        Activity activity12;
        MessageObject messageObject35;
        boolean z10;
        Activity activity13;
        MessageObject messageObject36;
        ArrayList arrayList;
        xn xnVar4;
        String str2;
        MessageObject.GroupedMessages groupedMessages;
        MessageObject messageObject37;
        MessageObject messageObject38;
        xn xnVar5;
        Activity activity14;
        boolean z11;
        Activity activity15;
        int z13;
        int z14;
        int z15;
        int z16;
        xn xnVar6;
        MessageObject messageObject39;
        MessageObject messageObject40;
        int i49;
        hu0 hu0Var6;
        MessageObject messageObject41;
        MessageObject messageObject42;
        MessageObject messageObject43;
        String str3;
        xn xnVar7;
        int i50;
        MessageObject messageObject44;
        MessageObject messageObject45;
        xn xnVar8;
        Activity activity16;
        Activity activity17;
        xn xnVar9;
        bf.h m12;
        org.telegram.ui.Components.n7 n7Var;
        xn xnVar10;
        MessageObject.GroupedMessages groupedMessages2;
        MessageObject messageObject46;
        Activity activity18;
        MessageObject messageObject47;
        String string;
        int z17;
        View d;
        int z18;
        int z19;
        int z110;
        MessageObject messageObject48;
        MessageObject messageObject49;
        MessageObject messageObject50;
        ImageLocation imageLocation17;
        du0 du0Var6;
        File file;
        ?? r14;
        du0 du0Var7;
        int i51;
        du0 du0Var8;
        int i52;
        boolean a2;
        ImageLocation imageLocation18;
        int i53;
        ImageLocation imageLocation19;
        long j15;
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
        xn xnVar11;
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
            ft0 ft0Var = photoViewer2.I1;
            if (ft0Var == null || !ft0Var.o0()) {
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
            xnVar10 = photoViewer2.i4;
            if (xnVar10 != null) {
                xnVar11 = photoViewer2.i4;
                messageObject60 = photoViewer2.Q4;
                groupedMessages2 = xnVar11.y8(messageObject60.getGroupId());
            } else {
                groupedMessages2 = null;
            }
            if (groupedMessages2 != null) {
                arrayList2.addAll(groupedMessages2.messages);
            } else {
                messageObject46 = photoViewer2.Q4;
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
                alertDialog$Builder.a.F = org.telegram.ui.ActionBar.j6.pg;
                messageObject47 = photoViewer2.Q4;
                if (messageObject47 != null) {
                    messageObject48 = photoViewer2.Q4;
                    if (messageObject48.isVideo()) {
                        messageObject49 = photoViewer2.Q4;
                        if (!messageObject49.isLivePhoto()) {
                            string = LocaleController.getString("ThisMedia", R.string.ThisMedia);
                            final int i62 = true ? 1 : 0;
                            alertDialog$Builder.h(string, new org.telegram.ui.ActionBar.c2(this) { // from class: org.telegram.ui.or0
                                public final /* synthetic */ wr0 b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.ui.ActionBar.c2
                                public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i63) {
                                    switch (i62) {
                                        case 0:
                                            wr0 wr0Var = this.b;
                                            wr0Var.getClass();
                                            ArrayList arrayList3 = new ArrayList(1);
                                            PhotoViewer photoViewer3 = wr0Var.b;
                                            arrayList3.add(photoViewer3.Q4);
                                            PhotoViewer.C(photoViewer3, arrayList3);
                                            break;
                                        default:
                                            wr0 wr0Var2 = this.b;
                                            PhotoViewer photoViewer4 = wr0Var2.b;
                                            MessageObject messageObject62 = photoViewer4.Q4;
                                            if (messageObject62 != null) {
                                                File file3 = null;
                                                File pathToAttach2 = ((MessageObject.getMedia(messageObject62.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) && MessageObject.getMedia(photoViewer4.Q4.messageOwner).webpage != null && MessageObject.getMedia(photoViewer4.Q4.messageOwner).webpage.document == null) ? FileLoader.getInstance(photoViewer4.Q).getPathToAttach(photoViewer4.p1(photoViewer4.M4, null), true) : FileLoader.getInstance(photoViewer4.Q).getPathToMessage(photoViewer4.Q4.messageOwner);
                                                boolean isVideo = photoViewer4.Q4.isVideo();
                                                boolean isLivePhoto = photoViewer4.Q4.isLivePhoto();
                                                if (isLivePhoto) {
                                                    TLRPC.Document document2 = MessageObject.getMedia(photoViewer4.Q4.messageOwner) != null ? MessageObject.getMedia(photoViewer4.Q4.messageOwner).document : null;
                                                    if (document2 != null && ((file3 = FileLoader.getInstance(photoViewer4.Q).getPathToAttach(document2, false)) == null || !file3.exists())) {
                                                        file3 = FileLoader.getInstance(photoViewer4.Q).getPathToAttach(document2, true);
                                                    }
                                                }
                                                if (!isLivePhoto) {
                                                    if (pathToAttach2 != null && pathToAttach2.exists()) {
                                                        MediaController.saveFile(pathToAttach2.toString(), photoViewer4.y, isVideo ? 1 : 0, null, null, new qr0(wr0Var2, isVideo, 0));
                                                        break;
                                                    } else {
                                                        photoViewer4.U2();
                                                        break;
                                                    }
                                                } else if (pathToAttach2 != null && pathToAttach2.exists() && file3 != null && file3.exists()) {
                                                    MediaController.saveFile(pathToAttach2.toString(), file3.toString(), photoViewer4.y, new nr0(wr0Var2, 1));
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
                            alertDialog$Builder.k((!z24 || z26) ? LocaleController.formatPluralString("AllNMedia", arrayList2.size(), new Object[0]) : LocaleController.formatPluralString("AllNPhotos", arrayList2.size(), new Object[0]), new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.tr0
                                @Override // org.telegram.ui.ActionBar.c2
                                public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i63) {
                                    wr0 wr0Var = wr0.this;
                                    PhotoViewer photoViewer3 = wr0Var.b;
                                    int[] iArr = new int[1];
                                    final xq0 xq0Var = new xq0(wr0Var, new int[1], iArr, z27, z25, z28);
                                    int i64 = 0;
                                    while (true) {
                                        ArrayList arrayList3 = arrayList2;
                                        if (i64 >= arrayList3.size()) {
                                            return;
                                        }
                                        MessageObject messageObject62 = (MessageObject) arrayList3.get(i64);
                                        if (messageObject62 != null) {
                                            File file3 = null;
                                            File pathToAttach2 = ((MessageObject.getMedia(messageObject62.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) && MessageObject.getMedia(messageObject62.messageOwner).webpage != null && MessageObject.getMedia(messageObject62.messageOwner).webpage.document == null) ? FileLoader.getInstance(photoViewer3.Q).getPathToAttach(photoViewer3.p1(photoViewer3.M4, null), true) : FileLoader.getInstance(photoViewer3.Q).getPathToMessage(messageObject62.messageOwner);
                                            boolean isVideo = messageObject62.isVideo();
                                            boolean isLivePhoto = messageObject62.isLivePhoto();
                                            if (isLivePhoto) {
                                                TLRPC.Document document2 = MessageObject.getMedia(messageObject62.messageOwner) != null ? MessageObject.getMedia(messageObject62.messageOwner).document : null;
                                                if (document2 != null && ((file3 = FileLoader.getInstance(photoViewer3.Q).getPathToAttach(document2, false)) == null || !file3.exists())) {
                                                    file3 = FileLoader.getInstance(photoViewer3.Q).getPathToAttach(document2, true);
                                                }
                                            }
                                            if (isLivePhoto && pathToAttach2 != null && pathToAttach2.exists()) {
                                                iArr[0] = iArr[0] + 1;
                                                if (file3 == null || !file3.exists()) {
                                                    final int i65 = 1;
                                                    MediaController.saveFile(pathToAttach2.toString(), photoViewer3.y, 0, null, null, new Utilities.Callback() { // from class: org.telegram.ui.pr0
                                                        @Override // org.telegram.messenger.Utilities.Callback
                                                        public final void run(Object obj) {
                                                            switch (i65) {
                                                                case 0:
                                                                    AndroidUtilities.runOnUIThread(xq0Var);
                                                                    break;
                                                                case 1:
                                                                    AndroidUtilities.runOnUIThread(xq0Var);
                                                                    break;
                                                                default:
                                                                    AndroidUtilities.runOnUIThread(xq0Var);
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                } else {
                                                    final int i66 = 0;
                                                    MediaController.saveFile(pathToAttach2.toString(), file3.toString(), photoViewer3.y, new Utilities.Callback() { // from class: org.telegram.ui.pr0
                                                        @Override // org.telegram.messenger.Utilities.Callback
                                                        public final void run(Object obj) {
                                                            switch (i66) {
                                                                case 0:
                                                                    AndroidUtilities.runOnUIThread(xq0Var);
                                                                    break;
                                                                case 1:
                                                                    AndroidUtilities.runOnUIThread(xq0Var);
                                                                    break;
                                                                default:
                                                                    AndroidUtilities.runOnUIThread(xq0Var);
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                }
                                            } else if (!isLivePhoto && pathToAttach2 != null && pathToAttach2.exists()) {
                                                iArr[0] = iArr[0] + 1;
                                                final int i67 = 2;
                                                MediaController.saveFile(pathToAttach2.toString(), photoViewer3.y, isVideo ? 1 : 0, null, null, new Utilities.Callback() { // from class: org.telegram.ui.pr0
                                                    @Override // org.telegram.messenger.Utilities.Callback
                                                    public final void run(Object obj) {
                                                        switch (i67) {
                                                            case 0:
                                                                AndroidUtilities.runOnUIThread(xq0Var);
                                                                break;
                                                            case 1:
                                                                AndroidUtilities.runOnUIThread(xq0Var);
                                                                break;
                                                            default:
                                                                AndroidUtilities.runOnUIThread(xq0Var);
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
                            alertDialog$Builder.i(LocaleController.getString("Cancel", R.string.Cancel), new al0(2));
                            org.telegram.ui.ActionBar.d2 a10 = alertDialog$Builder.a();
                            z17 = photoViewer2.z1(org.telegram.ui.ActionBar.j6.ug);
                            a10.i(z17);
                            a10.show();
                            d = a10.d(-3);
                            if (d instanceof TextView) {
                                int i63 = org.telegram.ui.ActionBar.j6.q7;
                                z19 = photoViewer2.z1(i63);
                                ((TextView) d).setTextColor(z19);
                                z110 = photoViewer2.z1(i63);
                                d.setBackground(org.telegram.ui.ActionBar.j6.G0(AndroidUtilities.dp(3.0f), z110));
                                ViewGroup viewGroup = a10.q0;
                                if ((viewGroup instanceof LinearLayout) && ((LinearLayout) viewGroup).getOrientation() == 1) {
                                    d.bringToFront();
                                }
                            }
                            z18 = photoViewer2.z1(org.telegram.ui.ActionBar.j6.hg);
                            a10.o(z18);
                            return;
                        }
                    }
                }
                string = LocaleController.getString("ThisPhoto", R.string.ThisPhoto);
                final int i622 = true ? 1 : 0;
                alertDialog$Builder.h(string, new org.telegram.ui.ActionBar.c2(this) { // from class: org.telegram.ui.or0
                    public final /* synthetic */ wr0 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.ui.ActionBar.c2
                    public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i632) {
                        switch (i622) {
                            case 0:
                                wr0 wr0Var = this.b;
                                wr0Var.getClass();
                                ArrayList arrayList3 = new ArrayList(1);
                                PhotoViewer photoViewer3 = wr0Var.b;
                                arrayList3.add(photoViewer3.Q4);
                                PhotoViewer.C(photoViewer3, arrayList3);
                                break;
                            default:
                                wr0 wr0Var2 = this.b;
                                PhotoViewer photoViewer4 = wr0Var2.b;
                                MessageObject messageObject62 = photoViewer4.Q4;
                                if (messageObject62 != null) {
                                    File file3 = null;
                                    File pathToAttach2 = ((MessageObject.getMedia(messageObject62.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) && MessageObject.getMedia(photoViewer4.Q4.messageOwner).webpage != null && MessageObject.getMedia(photoViewer4.Q4.messageOwner).webpage.document == null) ? FileLoader.getInstance(photoViewer4.Q).getPathToAttach(photoViewer4.p1(photoViewer4.M4, null), true) : FileLoader.getInstance(photoViewer4.Q).getPathToMessage(photoViewer4.Q4.messageOwner);
                                    boolean isVideo = photoViewer4.Q4.isVideo();
                                    boolean isLivePhoto = photoViewer4.Q4.isLivePhoto();
                                    if (isLivePhoto) {
                                        TLRPC.Document document2 = MessageObject.getMedia(photoViewer4.Q4.messageOwner) != null ? MessageObject.getMedia(photoViewer4.Q4.messageOwner).document : null;
                                        if (document2 != null && ((file3 = FileLoader.getInstance(photoViewer4.Q).getPathToAttach(document2, false)) == null || !file3.exists())) {
                                            file3 = FileLoader.getInstance(photoViewer4.Q).getPathToAttach(document2, true);
                                        }
                                    }
                                    if (!isLivePhoto) {
                                        if (pathToAttach2 != null && pathToAttach2.exists()) {
                                            MediaController.saveFile(pathToAttach2.toString(), photoViewer4.y, isVideo ? 1 : 0, null, null, new qr0(wr0Var2, isVideo, 0));
                                            break;
                                        } else {
                                            photoViewer4.U2();
                                            break;
                                        }
                                    } else if (pathToAttach2 != null && pathToAttach2.exists() && file3 != null && file3.exists()) {
                                        MediaController.saveFile(pathToAttach2.toString(), file3.toString(), photoViewer4.y, new nr0(wr0Var2, 1));
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
                alertDialog$Builder.k((!z24 || z26) ? LocaleController.formatPluralString("AllNMedia", arrayList2.size(), new Object[0]) : LocaleController.formatPluralString("AllNPhotos", arrayList2.size(), new Object[0]), new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.tr0
                    @Override // org.telegram.ui.ActionBar.c2
                    public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i632) {
                        wr0 wr0Var = wr0.this;
                        PhotoViewer photoViewer3 = wr0Var.b;
                        int[] iArr = new int[1];
                        final xq0 xq0Var = new xq0(wr0Var, new int[1], iArr, z272, z25, z282);
                        int i64 = 0;
                        while (true) {
                            ArrayList arrayList3 = arrayList2;
                            if (i64 >= arrayList3.size()) {
                                return;
                            }
                            MessageObject messageObject62 = (MessageObject) arrayList3.get(i64);
                            if (messageObject62 != null) {
                                File file3 = null;
                                File pathToAttach2 = ((MessageObject.getMedia(messageObject62.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) && MessageObject.getMedia(messageObject62.messageOwner).webpage != null && MessageObject.getMedia(messageObject62.messageOwner).webpage.document == null) ? FileLoader.getInstance(photoViewer3.Q).getPathToAttach(photoViewer3.p1(photoViewer3.M4, null), true) : FileLoader.getInstance(photoViewer3.Q).getPathToMessage(messageObject62.messageOwner);
                                boolean isVideo = messageObject62.isVideo();
                                boolean isLivePhoto = messageObject62.isLivePhoto();
                                if (isLivePhoto) {
                                    TLRPC.Document document2 = MessageObject.getMedia(messageObject62.messageOwner) != null ? MessageObject.getMedia(messageObject62.messageOwner).document : null;
                                    if (document2 != null && ((file3 = FileLoader.getInstance(photoViewer3.Q).getPathToAttach(document2, false)) == null || !file3.exists())) {
                                        file3 = FileLoader.getInstance(photoViewer3.Q).getPathToAttach(document2, true);
                                    }
                                }
                                if (isLivePhoto && pathToAttach2 != null && pathToAttach2.exists()) {
                                    iArr[0] = iArr[0] + 1;
                                    if (file3 == null || !file3.exists()) {
                                        final int i65 = 1;
                                        MediaController.saveFile(pathToAttach2.toString(), photoViewer3.y, 0, null, null, new Utilities.Callback() { // from class: org.telegram.ui.pr0
                                            @Override // org.telegram.messenger.Utilities.Callback
                                            public final void run(Object obj) {
                                                switch (i65) {
                                                    case 0:
                                                        AndroidUtilities.runOnUIThread(xq0Var);
                                                        break;
                                                    case 1:
                                                        AndroidUtilities.runOnUIThread(xq0Var);
                                                        break;
                                                    default:
                                                        AndroidUtilities.runOnUIThread(xq0Var);
                                                        break;
                                                }
                                            }
                                        });
                                    } else {
                                        final int i66 = 0;
                                        MediaController.saveFile(pathToAttach2.toString(), file3.toString(), photoViewer3.y, new Utilities.Callback() { // from class: org.telegram.ui.pr0
                                            @Override // org.telegram.messenger.Utilities.Callback
                                            public final void run(Object obj) {
                                                switch (i66) {
                                                    case 0:
                                                        AndroidUtilities.runOnUIThread(xq0Var);
                                                        break;
                                                    case 1:
                                                        AndroidUtilities.runOnUIThread(xq0Var);
                                                        break;
                                                    default:
                                                        AndroidUtilities.runOnUIThread(xq0Var);
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                } else if (!isLivePhoto && pathToAttach2 != null && pathToAttach2.exists()) {
                                    iArr[0] = iArr[0] + 1;
                                    final int i67 = 2;
                                    MediaController.saveFile(pathToAttach2.toString(), photoViewer3.y, isVideo ? 1 : 0, null, null, new Utilities.Callback() { // from class: org.telegram.ui.pr0
                                        @Override // org.telegram.messenger.Utilities.Callback
                                        public final void run(Object obj) {
                                            switch (i67) {
                                                case 0:
                                                    AndroidUtilities.runOnUIThread(xq0Var);
                                                    break;
                                                case 1:
                                                    AndroidUtilities.runOnUIThread(xq0Var);
                                                    break;
                                                default:
                                                    AndroidUtilities.runOnUIThread(xq0Var);
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
                alertDialog$Builder.i(LocaleController.getString("Cancel", R.string.Cancel), new al0(2));
                org.telegram.ui.ActionBar.d2 a102 = alertDialog$Builder.a();
                z17 = photoViewer2.z1(org.telegram.ui.ActionBar.j6.ug);
                a102.i(z17);
                a102.show();
                d = a102.d(-3);
                if (d instanceof TextView) {
                }
                z18 = photoViewer2.z1(org.telegram.ui.ActionBar.j6.hg);
                a102.o(z18);
                return;
            }
            messageObject50 = photoViewer2.Q4;
            if (messageObject50 != null) {
                messageObject55 = photoViewer2.Q4;
                if (MessageObject.getMedia(messageObject55.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) {
                    messageObject58 = photoViewer2.Q4;
                    if (MessageObject.getMedia(messageObject58.messageOwner).webpage != null) {
                        messageObject59 = photoViewer2.Q4;
                        if (MessageObject.getMedia(messageObject59.messageOwner).webpage.document == null) {
                            i58 = photoViewer2.M4;
                            p12 = photoViewer2.p1(i58, null);
                            i59 = photoViewer2.Q;
                            file = FileLoader.getInstance(i59).getPathToAttach(p12, true);
                            if (!file.exists()) {
                                file = new File(FileLoader.getDirectory(4), file.getName());
                            }
                            messageObject57 = photoViewer2.Q4;
                            a2 = messageObject57.isVideo();
                        }
                    }
                }
                i57 = photoViewer2.Q;
                FileLoader fileLoader = FileLoader.getInstance(i57);
                messageObject56 = photoViewer2.Q4;
                file = fileLoader.getPathToMessage(messageObject56.messageOwner);
                messageObject57 = photoViewer2.Q4;
                a2 = messageObject57.isVideo();
            } else {
                imageLocation17 = photoViewer2.X4;
                if (imageLocation17 != null) {
                    imageLocation18 = photoViewer2.X4;
                    String q12 = PhotoViewer.q1(imageLocation18);
                    i53 = photoViewer2.Q;
                    FileLoader fileLoader2 = FileLoader.getInstance(i53);
                    imageLocation19 = photoViewer2.X4;
                    TLObject tLObject2 = imageLocation19 == null ? null : imageLocation19.location;
                    j15 = photoViewer2.w5;
                    if (j15 == 0) {
                        z21 = photoViewer2.y5;
                        if (!z21) {
                            z20 = false;
                            pathToAttach = fileLoader2.getPathToAttach(tLObject2, q12, z20);
                            if (pathToAttach != null && !pathToAttach.exists()) {
                                i54 = photoViewer2.Q;
                                FileLoader fileLoader3 = FileLoader.getInstance(i54);
                                imageLocation20 = photoViewer2.X4;
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
                        i54 = photoViewer2.Q;
                        FileLoader fileLoader32 = FileLoader.getInstance(i54);
                        imageLocation20 = photoViewer2.X4;
                        pathToAttach = fileLoader32.getPathToAttach(imageLocation20 != null ? null : imageLocation20.location, q12, false);
                    }
                    if (q12 != null) {
                    }
                    r14 = q12 == null && (q12.equals("webm") || q12.equals("mp4") || q12.equals("gif"));
                    file = pathToAttach;
                } else {
                    du0Var6 = photoViewer2.g7;
                    if (du0Var6 != null) {
                        du0Var7 = photoViewer2.g7;
                        i51 = photoViewer2.M4;
                        file = du0Var7.b(i51);
                        du0Var8 = photoViewer2.g7;
                        i52 = photoViewer2.M4;
                        a2 = du0Var8.a(i52);
                    } else {
                        file = null;
                        r14 = 0;
                    }
                }
                if (file != null && !file.exists()) {
                    file = new File(FileLoader.getDirectory(4), file.getName());
                }
                messageObject51 = photoViewer2.Q4;
                if (messageObject51 != null) {
                    messageObject54 = photoViewer2.Q4;
                    if (messageObject54.isLivePhoto()) {
                        z22 = true;
                        if (z22) {
                            messageObject52 = photoViewer2.Q4;
                            if (MessageObject.getMedia(messageObject52.messageOwner) != null) {
                                messageObject53 = photoViewer2.Q4;
                                document = MessageObject.getMedia(messageObject53.messageOwner).document;
                            } else {
                                document = null;
                            }
                            if (document != null) {
                                i55 = photoViewer2.Q;
                                file2 = FileLoader.getInstance(i55).getPathToAttach(document, false);
                                if (file2 == null || !file2.exists()) {
                                    i56 = photoViewer2.Q;
                                    file2 = FileLoader.getInstance(i56).getPathToAttach(document, true);
                                }
                                if (z22) {
                                    if (file == null || !file.exists()) {
                                        photoViewer2.U2();
                                        return;
                                    }
                                    String file3 = file.toString();
                                    activity19 = photoViewer2.y;
                                    MediaController.saveFile(file3, activity19, r14, null, null, new qr0(this, r14, true ? 1 : 0));
                                    return;
                                }
                                if (file == null || !file.exists() || file2 == null || !file2.exists()) {
                                    photoViewer2.U2();
                                    return;
                                }
                                String file4 = file.toString();
                                String file5 = file2.toString();
                                activity20 = photoViewer2.y;
                                MediaController.saveFile(file4, file5, activity20, new nr0(this, 0));
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
            messageObject51 = photoViewer2.Q4;
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
                bf.b O = bf.b.O();
                m12 = photoViewer2.m1();
                O.c0(m12);
                n7Var = photoViewer2.D0;
                n7Var.performClick();
                return;
            }
            if (i10 == 3) {
                if (photoViewer2.B5 != 0) {
                    photoViewer2.p4 = true;
                    Bundle bundle = new Bundle();
                    bundle.putLong("dialog_id", photoViewer2.B5);
                    org.telegram.ui.Components.da0 da0Var = new org.telegram.ui.Components.da0(bundle, null);
                    xnVar8 = photoViewer2.i4;
                    if (xnVar8 != null) {
                        xnVar9 = photoViewer2.i4;
                        da0Var.X(xnVar9.v8());
                    }
                    photoViewer2.G0(false, false);
                    activity16 = photoViewer2.y;
                    if (activity16 instanceof LaunchActivity) {
                        activity17 = photoViewer2.y;
                        ((LaunchActivity) activity17).q0(da0Var, false, true);
                        return;
                    }
                    return;
                }
                return;
            }
            if (i10 == 5 || i10 == 21) {
                messageObject = photoViewer2.Q4;
                if (messageObject == null) {
                    return;
                }
                Bundle bundle2 = new Bundle();
                long j16 = photoViewer2.B5;
                messageObject2 = photoViewer2.Q4;
                if (messageObject2 != null) {
                    messageObject5 = photoViewer2.Q4;
                    j16 = messageObject5.getDialogId();
                }
                if (DialogObject.isEncryptedDialog(j16)) {
                    bundle2.putInt("enc_id", DialogObject.getEncryptedChatId(j16));
                } else if (DialogObject.isUserDialog(j16)) {
                    bundle2.putLong("user_id", j16);
                } else {
                    i11 = photoViewer2.Q;
                    TLRPC.Chat chat2 = MessagesController.getInstance(i11).getChat(Long.valueOf(-j16));
                    if (chat2 != null && chat2.migrated_to != null) {
                        bundle2.putLong("migrated_to", j16);
                        j16 = -chat2.migrated_to.channel_id;
                    }
                    bundle2.putLong("chat_id", -j16);
                }
                messageObject3 = photoViewer2.Q4;
                bundle2.putInt("message_id", messageObject3.getId());
                if (i10 == 21) {
                    messageObject4 = photoViewer2.Q4;
                    bundle2.putInt("reply_to", messageObject4.getId());
                }
                i12 = photoViewer2.Q;
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                activity = photoViewer2.y;
                if (activity instanceof LaunchActivity) {
                    activity2 = photoViewer2.y;
                    LaunchActivity launchActivity = (LaunchActivity) activity2;
                    launchActivity.q0(new xn(bundle2), launchActivity.S() > 1 || AndroidUtilities.isTablet(), true);
                }
                photoViewer2.G0(false, false);
                photoViewer2.Q4 = null;
                VideoAds videoAds = photoViewer2.R4;
                if (videoAds != null) {
                    videoAds.stop();
                    photoViewer2.R4 = null;
                    return;
                }
                return;
            }
            if (i10 == 25) {
                if (photoViewer2.j4 != null) {
                    hu0Var6 = photoViewer2.d;
                    if (hu0Var6 == null) {
                        return;
                    }
                    messageObject41 = photoViewer2.Q4;
                    if (messageObject41 != null) {
                        messageObject42 = photoViewer2.Q4;
                        if (messageObject42.messageOwner == null) {
                            return;
                        }
                        messageObject43 = photoViewer2.Q4;
                        if (!TextUtils.isEmpty(messageObject43.messageOwner.attachPath)) {
                            messageObject45 = photoViewer2.Q4;
                            str3 = messageObject45.messageOwner.attachPath;
                            if (!TextUtils.isEmpty(str3)) {
                            }
                        }
                        str3 = null;
                        if (TextUtils.isEmpty(str3)) {
                            i50 = photoViewer2.Q;
                            FileLoader fileLoader4 = FileLoader.getInstance(i50);
                            messageObject44 = photoViewer2.Q4;
                            File pathToMessage = fileLoader4.getPathToMessage(messageObject44.messageOwner, true);
                            if (pathToMessage != null && pathToMessage.exists()) {
                                str3 = pathToMessage.getAbsolutePath();
                            }
                        }
                        String str4 = str3;
                        if (TextUtils.isEmpty(str4)) {
                            return;
                        }
                        xnVar7 = photoViewer2.i4;
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add(new MediaController.PhotoEntry(0, 0, 0L, str4, 0, false, 0, 0, 0L));
                        this.b.f2(arrayList3, 0, 11, false, new ur0(), xnVar7);
                        photoViewer2.X0(null, null, false, null);
                        photoViewer2.l2();
                        pt.q().x();
                        return;
                    }
                    return;
                }
                return;
            }
            if (i10 == 4) {
                messageObject34 = photoViewer2.Q4;
                if (messageObject34 == null) {
                    return;
                }
                activity12 = photoViewer2.y;
                if (!(activity12 instanceof LaunchActivity)) {
                    return;
                }
                messageObject35 = photoViewer2.Q4;
                if (!messageObject35.scheduled) {
                    messageObject40 = photoViewer2.Q4;
                    long dialogId = messageObject40.getDialogId();
                    if (DialogObject.isChatDialog(dialogId)) {
                        i49 = photoViewer2.Q;
                        z10 = ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(i49).getChat(Long.valueOf(-dialogId)));
                        activity13 = photoViewer2.y;
                        messageObject36 = photoViewer2.Q4;
                        ((LaunchActivity) activity13).K0(messageObject36.currentAccount);
                        arrayList = new ArrayList(1);
                        xnVar4 = photoViewer2.i4;
                        if (xnVar4 == null) {
                            xnVar6 = photoViewer2.i4;
                            messageObject39 = photoViewer2.Q4;
                            str2 = "Cancel";
                            groupedMessages = xnVar6.y8(messageObject39.getGroupId());
                        } else {
                            str2 = "Cancel";
                            groupedMessages = null;
                        }
                        if (groupedMessages == null) {
                            arrayList.addAll(groupedMessages.messages);
                        } else {
                            messageObject37 = photoViewer2.Q4;
                            arrayList.add(messageObject37);
                        }
                        if (!z10 && arrayList.size() <= 1) {
                            PhotoViewer.C(photoViewer2, arrayList);
                            return;
                        }
                        if (arrayList.size() > 1) {
                            Bundle bundle3 = new Bundle();
                            bundle3.putBoolean("onlySelect", true);
                            bundle3.putBoolean("canSelectTopics", true);
                            bundle3.putInt("dialogsType", 3);
                            oy oyVar = new oy(bundle3);
                            ArrayList arrayList4 = new ArrayList();
                            messageObject38 = photoViewer2.Q4;
                            arrayList4.add(messageObject38);
                            xnVar5 = photoViewer2.i4;
                            oyVar.z2 = new d7(this, arrayList4, xnVar5, 18);
                            activity14 = photoViewer2.y;
                            ((LaunchActivity) activity14).q0(oyVar, false, true);
                            photoViewer2.G0(false, false);
                            return;
                        }
                        for (int i64 = 0; i64 < arrayList.size(); i64++) {
                            if (!((MessageObject) arrayList.get(i64)).isPhoto() || ((MessageObject) arrayList.get(i64)).isVideo()) {
                                z11 = false;
                                break;
                            }
                        }
                        z11 = true;
                        activity15 = photoViewer2.y;
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(activity15, f6Var);
                        alertDialog$Builder2.l(LocaleController.getString("ForwardGroupMedia", R.string.ForwardGroupMedia));
                        alertDialog$Builder2.g(LocaleController.getString("ForwardGroupMediaMessage", R.string.ForwardGroupMediaMessage));
                        alertDialog$Builder2.a.F = org.telegram.ui.ActionBar.j6.pg;
                        final int i65 = 0;
                        alertDialog$Builder2.h(z11 ? LocaleController.getString("ThisPhoto", R.string.ThisPhoto) : LocaleController.getString("ThisMedia", R.string.ThisMedia), new org.telegram.ui.ActionBar.c2(this) { // from class: org.telegram.ui.or0
                            public final /* synthetic */ wr0 b;

                            {
                                this.b = this;
                            }

                            @Override // org.telegram.ui.ActionBar.c2
                            public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i632) {
                                switch (i65) {
                                    case 0:
                                        wr0 wr0Var = this.b;
                                        wr0Var.getClass();
                                        ArrayList arrayList32 = new ArrayList(1);
                                        PhotoViewer photoViewer3 = wr0Var.b;
                                        arrayList32.add(photoViewer3.Q4);
                                        PhotoViewer.C(photoViewer3, arrayList32);
                                        break;
                                    default:
                                        wr0 wr0Var2 = this.b;
                                        PhotoViewer photoViewer4 = wr0Var2.b;
                                        MessageObject messageObject62 = photoViewer4.Q4;
                                        if (messageObject62 != null) {
                                            File file32 = null;
                                            File pathToAttach2 = ((MessageObject.getMedia(messageObject62.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) && MessageObject.getMedia(photoViewer4.Q4.messageOwner).webpage != null && MessageObject.getMedia(photoViewer4.Q4.messageOwner).webpage.document == null) ? FileLoader.getInstance(photoViewer4.Q).getPathToAttach(photoViewer4.p1(photoViewer4.M4, null), true) : FileLoader.getInstance(photoViewer4.Q).getPathToMessage(photoViewer4.Q4.messageOwner);
                                            boolean isVideo = photoViewer4.Q4.isVideo();
                                            boolean isLivePhoto = photoViewer4.Q4.isLivePhoto();
                                            if (isLivePhoto) {
                                                TLRPC.Document document2 = MessageObject.getMedia(photoViewer4.Q4.messageOwner) != null ? MessageObject.getMedia(photoViewer4.Q4.messageOwner).document : null;
                                                if (document2 != null && ((file32 = FileLoader.getInstance(photoViewer4.Q).getPathToAttach(document2, false)) == null || !file32.exists())) {
                                                    file32 = FileLoader.getInstance(photoViewer4.Q).getPathToAttach(document2, true);
                                                }
                                            }
                                            if (!isLivePhoto) {
                                                if (pathToAttach2 != null && pathToAttach2.exists()) {
                                                    MediaController.saveFile(pathToAttach2.toString(), photoViewer4.y, isVideo ? 1 : 0, null, null, new qr0(wr0Var2, isVideo, 0));
                                                    break;
                                                } else {
                                                    photoViewer4.U2();
                                                    break;
                                                }
                                            } else if (pathToAttach2 != null && pathToAttach2.exists() && file32 != null && file32.exists()) {
                                                MediaController.saveFile(pathToAttach2.toString(), file32.toString(), photoViewer4.y, new nr0(wr0Var2, 1));
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
                        alertDialog$Builder2.k(z11 ? LocaleController.formatPluralString("AllNPhotos", arrayList.size(), new Object[0]) : LocaleController.formatPluralString("AllNMedia", arrayList.size(), new Object[0]), new tl0(6, this, arrayList));
                        alertDialog$Builder2.i(LocaleController.getString(str2, R.string.Cancel), new al0(3));
                        org.telegram.ui.ActionBar.d2 a11 = alertDialog$Builder2.a();
                        z13 = photoViewer2.z1(org.telegram.ui.ActionBar.j6.ug);
                        a11.i(z13);
                        a11.show();
                        View d10 = a11.d(-3);
                        if (d10 instanceof TextView) {
                            int i66 = org.telegram.ui.ActionBar.j6.q7;
                            z15 = photoViewer2.z1(i66);
                            ((TextView) d10).setTextColor(z15);
                            z16 = photoViewer2.z1(i66);
                            d10.setBackground(org.telegram.ui.ActionBar.j6.G0(AndroidUtilities.dp(3.0f), z16));
                            ViewGroup viewGroup2 = a11.q0;
                            if ((viewGroup2 instanceof LinearLayout) && ((LinearLayout) viewGroup2).getOrientation() == 1) {
                                d10.bringToFront();
                            }
                        }
                        z14 = photoViewer2.z1(org.telegram.ui.ActionBar.j6.hg);
                        a11.o(z14);
                        return;
                    }
                }
                z10 = false;
                activity13 = photoViewer2.y;
                messageObject36 = photoViewer2.Q4;
                ((LaunchActivity) activity13).K0(messageObject36.currentAccount);
                arrayList = new ArrayList(1);
                xnVar4 = photoViewer2.i4;
                if (xnVar4 == null) {
                }
                if (groupedMessages == null) {
                }
                if (!z10) {
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
                        hu0Var4 = photoViewer2.d;
                        if (hu0Var4 == null) {
                            return;
                        }
                        hu0Var5 = photoViewer2.d;
                        hu0Var5.I();
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
                    hu0Var2 = photoViewer2.d;
                    if (hu0Var2 == null) {
                        return;
                    }
                    messageObject24 = photoViewer2.Q4;
                    if (messageObject24 != null) {
                        messageObject32 = photoViewer2.Q4;
                        if (!messageObject32.scheduled) {
                            messageObject33 = photoViewer2.Q4;
                            long dialogId2 = messageObject33.getDialogId();
                            if (DialogObject.isChatDialog(dialogId2)) {
                                i48 = photoViewer2.Q;
                                z4 = ChatObject.isChannel(MessagesController.getInstance(i48).getChat(Long.valueOf(-dialogId2)));
                                activity10 = photoViewer2.y;
                                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(activity10);
                                hu0Var3 = photoViewer2.d;
                                a02 = hu0Var3.a0();
                                if (a02 == null) {
                                    alertDialog$Builder3.l(LocaleController.getString("AreYouSureDeletePhotoTitle", R.string.AreYouSureDeletePhotoTitle));
                                    alertDialog$Builder3.g(a02);
                                } else {
                                    if (!photoViewer2.q4) {
                                        imageLocation14 = photoViewer2.X4;
                                        if (imageLocation14 != null) {
                                            imageLocation15 = photoViewer2.X4;
                                            imageLocation16 = photoViewer2.W4;
                                        }
                                        messageObject25 = photoViewer2.Q4;
                                        if (messageObject25 != null) {
                                            messageObject28 = photoViewer2.Q4;
                                        }
                                        messageObject26 = photoViewer2.Q4;
                                        if (messageObject26 != null) {
                                            messageObject27 = photoViewer2.Q4;
                                            if (messageObject27.isGif()) {
                                                alertDialog$Builder3.l(LocaleController.getString("AreYouSureDeleteGIFTitle", R.string.AreYouSureDeleteGIFTitle));
                                                if (z4) {
                                                    alertDialog$Builder3.g(LocaleController.formatString("AreYouSureDeleteGIFEveryone", R.string.AreYouSureDeleteGIFEveryone, new Object[0]));
                                                } else {
                                                    alertDialog$Builder3.g(LocaleController.formatString("AreYouSureDeleteGIF", R.string.AreYouSureDeleteGIF, new Object[0]));
                                                }
                                            }
                                        }
                                        alertDialog$Builder3.l(LocaleController.getString("AreYouSureDeletePhotoTitle", R.string.AreYouSureDeletePhotoTitle));
                                        if (z4) {
                                            alertDialog$Builder3.g(LocaleController.formatString("AreYouSureDeletePhotoEveryone", R.string.AreYouSureDeletePhotoEveryone, new Object[0]));
                                        } else {
                                            alertDialog$Builder3.g(LocaleController.formatString("AreYouSureDeletePhoto", R.string.AreYouSureDeletePhoto, new Object[0]));
                                        }
                                    }
                                    alertDialog$Builder3.l(LocaleController.getString("AreYouSureDeleteVideoTitle", R.string.AreYouSureDeleteVideoTitle));
                                    if (z4) {
                                        alertDialog$Builder3.g(LocaleController.formatString("AreYouSureDeleteVideoEveryone", R.string.AreYouSureDeleteVideoEveryone, new Object[0]));
                                    } else {
                                        alertDialog$Builder3.g(LocaleController.formatString("AreYouSureDeleteVideo", R.string.AreYouSureDeleteVideo, new Object[0]));
                                    }
                                }
                                boolean[] zArr = new boolean[1];
                                messageObject29 = photoViewer2.Q4;
                                if (messageObject29 != null) {
                                    messageObject30 = photoViewer2.Q4;
                                    if (!messageObject30.scheduled) {
                                        messageObject31 = photoViewer2.Q4;
                                        long dialogId3 = messageObject31.getDialogId();
                                        if (!DialogObject.isEncryptedDialog(dialogId3)) {
                                            if (DialogObject.isUserDialog(dialogId3)) {
                                                i47 = photoViewer2.Q;
                                                user = MessagesController.getInstance(i47).getUser(Long.valueOf(dialogId3));
                                                chat = null;
                                            } else {
                                                i41 = photoViewer2.Q;
                                                chat = MessagesController.getInstance(i41).getChat(Long.valueOf(-dialogId3));
                                                user = null;
                                            }
                                            if (user != null || !ChatObject.isChannel(chat)) {
                                                i42 = photoViewer2.Q;
                                                int currentTime = ConnectionsManager.getInstance(i42).getCurrentTime();
                                                if (user != null) {
                                                    i46 = photoViewer2.Q;
                                                    i44 = MessagesController.getInstance(i46).revokeTimePmLimit;
                                                } else {
                                                    i43 = photoViewer2.Q;
                                                    i44 = MessagesController.getInstance(i43).revokeTimeLimit;
                                                }
                                                if (user != null) {
                                                    long j17 = user.id;
                                                    i45 = photoViewer2.Q;
                                                }
                                            }
                                        }
                                    }
                                }
                                String str5 = "Cancel";
                                alertDialog$Builder3.k(LocaleController.getString("Delete", R.string.Delete), new tl0(7, this, zArr));
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
                    z4 = false;
                    activity10 = photoViewer2.y;
                    AlertDialog$Builder alertDialog$Builder32 = new AlertDialog$Builder(activity10);
                    hu0Var3 = photoViewer2.d;
                    a02 = hu0Var3.a0();
                    if (a02 == null) {
                    }
                    boolean[] zArr2 = new boolean[1];
                    messageObject29 = photoViewer2.Q4;
                    if (messageObject29 != null) {
                    }
                    String str52 = "Cancel";
                    alertDialog$Builder32.k(LocaleController.getString("Delete", R.string.Delete), new tl0(7, this, zArr2));
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
                            if (photoViewer2.q4) {
                                activity5 = photoViewer2.y;
                                messageObject11 = photoViewer2.Q4;
                                af.g.s(activity5, MessageObject.getMedia(messageObject11.messageOwner).webpage.url);
                                photoViewer2.G0(false, false);
                                return;
                            }
                            messageObject6 = photoViewer2.Q4;
                            if (messageObject6 == null) {
                                du0Var = photoViewer2.g7;
                                if (du0Var != null) {
                                    du0Var2 = photoViewer2.g7;
                                    i13 = photoViewer2.M4;
                                    TLObject d11 = du0Var2.d(i13);
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
                            messageObject7 = photoViewer2.Q4;
                            activity4 = photoViewer2.y;
                            messageObject8 = photoViewer2.Q4;
                            if (!messageObject8.isVideo()) {
                                messageObject9 = photoViewer2.Q4;
                                if (!messageObject9.isPhoto()) {
                                    messageObject10 = photoViewer2.Q4;
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
                            messageObject12 = photoViewer2.Q4;
                            if (messageObject12 == null) {
                                return;
                            }
                            messageObject13 = photoViewer2.Q4;
                            if (MessageObject.getMedia(messageObject13.messageOwner) instanceof TLRPC.TL_messageMediaPhoto) {
                                messageObject17 = photoViewer2.Q4;
                                tLObject = MessageObject.getMedia(messageObject17.messageOwner).photo;
                            } else {
                                messageObject14 = photoViewer2.Q4;
                                if (!(MessageObject.getMedia(messageObject14.messageOwner) instanceof TLRPC.TL_messageMediaDocument)) {
                                    return;
                                }
                                messageObject15 = photoViewer2.Q4;
                                tLObject = MessageObject.getMedia(messageObject15.messageOwner).document;
                            }
                            TLObject tLObject3 = tLObject;
                            activity7 = photoViewer2.y;
                            messageObject16 = photoViewer2.Q4;
                            photoViewer2.R3 = new vr0(this, activity7, messageObject16, tLObject3, this.a);
                            xx0Var = photoViewer2.R3;
                            xx0Var.show();
                            return;
                        }
                        return;
                    }
                    if (i10 == 6) {
                        w0Var = photoViewer2.l0;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = w0Var.b;
                        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null || (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(6)) == null || findViewWithTag.getVisibility() != 0) {
                            return;
                        }
                        if (!photoViewer2.q4) {
                            photoViewer2.h3();
                            return;
                        }
                        vf0Var = photoViewer2.c0;
                        if (vf0Var.e()) {
                            if (PhotoViewer.X8 != null) {
                                PhotoViewer.X8.P0();
                            }
                            photoViewer2.G3 = true;
                            photoViewer = PhotoViewer.W8;
                            PhotoViewer.X8 = photoViewer;
                            PhotoViewer.W8 = null;
                            photoViewer2.e = false;
                            photoViewer2.f = false;
                            ju0 ju0Var = photoViewer2.a5;
                            if (ju0Var != null && !ju0Var.a.getVisible()) {
                                photoViewer2.a5.a.setVisible(true, true);
                            }
                            photoViewer2.j6 = 1.0f;
                            photoViewer2.b0.invalidate();
                            photoViewer2.S0();
                            return;
                        }
                        return;
                    }
                    if (i10 == 8) {
                        messageObject22 = photoViewer2.Q4;
                        if (messageObject22 == null) {
                            return;
                        }
                        i40 = photoViewer2.Q;
                        FileLoader fileLoader5 = FileLoader.getInstance(i40);
                        messageObject23 = photoViewer2.Q4;
                        fileLoader5.cancelLoadFile(messageObject23.getDocument());
                        photoViewer2.n2(false);
                        photoViewer2.f0.setTag(r3);
                        photoViewer2.f0.setVisibility(0);
                        return;
                    }
                    if (i10 == 12) {
                        messageObject19 = photoViewer2.Q4;
                        if (messageObject19 != null) {
                            messageObject20 = photoViewer2.Q4;
                            TLRPC.Document document2 = messageObject20.getDocument();
                            xnVar = photoViewer2.i4;
                            if (xnVar != null) {
                                xnVar2 = photoViewer2.i4;
                                if (xnVar2.V != null) {
                                    xnVar3 = photoViewer2.i4;
                                    xnVar3.V.n(document2);
                                    i39 = photoViewer2.Q;
                                    MessagesController messagesController = MessagesController.getInstance(i39);
                                    messageObject21 = photoViewer2.Q4;
                                    messagesController.saveGif(messageObject21, document2);
                                }
                            }
                            i38 = photoViewer2.Q;
                            MediaDataController.getInstance(i38).addRecentGif(document2, (int) (System.currentTimeMillis() / 1000), true);
                            i39 = photoViewer2.Q;
                            MessagesController messagesController2 = MessagesController.getInstance(i39);
                            messageObject21 = photoViewer2.Q4;
                            messagesController2.saveGif(messageObject21, document2);
                        } else {
                            du0Var3 = photoViewer2.g7;
                            if (du0Var3 == null) {
                                return;
                            }
                            du0Var4 = photoViewer2.g7;
                            i35 = photoViewer2.M4;
                            TLObject d12 = du0Var4.d(i35);
                            if (d12 instanceof TLRPC.Document) {
                                TLRPC.Document document3 = (TLRPC.Document) d12;
                                i36 = photoViewer2.Q;
                                MediaDataController.getInstance(i36).addRecentGif(document3, (int) (System.currentTimeMillis() / 1000), true);
                                i37 = photoViewer2.Q;
                                MessagesController messagesController3 = MessagesController.getInstance(i37);
                                du0Var5 = photoViewer2.g7;
                                messagesController3.saveGif(du0Var5.g(), document3);
                            }
                        }
                        bu0 bu0Var = photoViewer2.b0;
                        if (bu0Var != null) {
                            org.telegram.ui.Components.qc.Z(bu0Var, f6Var).o(org.telegram.ui.Components.pc.y, f6Var).j();
                            return;
                        }
                        return;
                    }
                    if (i10 == 14) {
                        ArrayList arrayList5 = photoViewer2.c7;
                        i18 = photoViewer2.M4;
                        TLRPC.Photo photo3 = (TLRPC.Photo) arrayList5.get(i18);
                        if (photo3 == null || photo3.sizes.isEmpty()) {
                            return;
                        }
                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo3.sizes, 800);
                        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo3.sizes, 90);
                        i19 = photoViewer2.Q;
                        UserConfig userConfig = UserConfig.getInstance(i19);
                        j11 = photoViewer2.w5;
                        if (j11 == userConfig.clientUserId) {
                            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
                            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                            tL_photos_updateProfilePhoto.id = tL_inputPhoto;
                            tL_inputPhoto.id = photo3.id;
                            tL_inputPhoto.access_hash = photo3.access_hash;
                            tL_inputPhoto.file_reference = photo3.file_reference;
                            i32 = photoViewer2.Q;
                            ConnectionsManager.getInstance(i32).sendRequest(tL_photos_updateProfilePhoto, new rr0(this, userConfig, photo3, 0));
                            i33 = photoViewer2.Q;
                            TLRPC.User user2 = MessagesController.getInstance(i33).getUser(Long.valueOf(userConfig.clientUserId));
                            if (user2 != null) {
                                TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                userProfilePhoto.photo_id = photo3.id;
                                userProfilePhoto.dc_id = photo3.dc_id;
                                userProfilePhoto.photo_small = closestPhotoSizeWithSize2.location;
                                userProfilePhoto.photo_big = closestPhotoSizeWithSize.location;
                                userConfig.setCurrentUser(user2);
                                userConfig.saveConfig(true);
                                i34 = photoViewer2.Q;
                                NotificationCenter.getInstance(i34).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                            }
                        } else {
                            i20 = photoViewer2.Q;
                            MessagesController messagesController4 = MessagesController.getInstance(i20);
                            j12 = photoViewer2.w5;
                            TLRPC.Chat chat3 = messagesController4.getChat(Long.valueOf(-j12));
                            if (chat3 == null) {
                                return;
                            }
                            TLRPC.TL_inputChatPhoto tL_inputChatPhoto = new TLRPC.TL_inputChatPhoto();
                            TLRPC.TL_inputPhoto tL_inputPhoto2 = new TLRPC.TL_inputPhoto();
                            tL_inputChatPhoto.id = tL_inputPhoto2;
                            tL_inputPhoto2.id = photo3.id;
                            tL_inputPhoto2.access_hash = photo3.access_hash;
                            tL_inputPhoto2.file_reference = photo3.file_reference;
                            i21 = photoViewer2.Q;
                            MessagesController messagesController5 = MessagesController.getInstance(i21);
                            j13 = photoViewer2.w5;
                            messagesController5.changeChatAvatar(-j13, tL_inputChatPhoto, null, null, null, 0.0d, null, null, null, null);
                            TLRPC.ChatPhoto chatPhoto = chat3.photo;
                            chatPhoto.dc_id = photo3.dc_id;
                            chatPhoto.photo_small = closestPhotoSizeWithSize2.location;
                            chatPhoto.photo_big = closestPhotoSizeWithSize.location;
                            i22 = photoViewer2.Q;
                            NotificationCenter.getInstance(i22).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
                        }
                        photoViewer2.e7 = ImageLocation.getForPhoto(closestPhotoSizeWithSize, photo3);
                        ArrayList arrayList6 = photoViewer2.c7;
                        i23 = photoViewer2.M4;
                        arrayList6.remove(i23);
                        photoViewer2.c7.add(0, photo3);
                        ArrayList arrayList7 = photoViewer2.X6;
                        i24 = photoViewer2.M4;
                        ImageLocation imageLocation21 = (ImageLocation) arrayList7.get(i24);
                        ArrayList arrayList8 = photoViewer2.X6;
                        i25 = photoViewer2.M4;
                        arrayList8.remove(i25);
                        photoViewer2.X6.add(0, imageLocation21);
                        ArrayList arrayList9 = photoViewer2.Y6;
                        i26 = photoViewer2.M4;
                        ImageLocation imageLocation22 = (ImageLocation) arrayList9.get(i26);
                        ArrayList arrayList10 = photoViewer2.Y6;
                        i27 = photoViewer2.M4;
                        arrayList10.remove(i27);
                        photoViewer2.Y6.add(0, imageLocation22);
                        ArrayList arrayList11 = photoViewer2.Z6;
                        i28 = photoViewer2.M4;
                        Long l10 = (Long) arrayList11.get(i28);
                        ArrayList arrayList12 = photoViewer2.Z6;
                        i29 = photoViewer2.M4;
                        arrayList12.remove(i29);
                        photoViewer2.Z6.add(0, l10);
                        ArrayList arrayList13 = photoViewer2.a7;
                        i30 = photoViewer2.M4;
                        TLRPC.Message message = (TLRPC.Message) arrayList13.get(i30);
                        ArrayList arrayList14 = photoViewer2.a7;
                        i31 = photoViewer2.M4;
                        arrayList14.remove(i31);
                        photoViewer2.a7.add(0, message);
                        photoViewer2.M4 = -1;
                        photoViewer2.B2(0);
                        org.telegram.ui.Components.x30 x30Var = photoViewer2.i1;
                        x30Var.d.clear();
                        x30Var.e.clear();
                        x30Var.c.clear();
                        photoViewer2.i1.b();
                        undoView = photoViewer2.k1;
                        j14 = photoViewer2.w5;
                        imageLocation12 = photoViewer2.X4;
                        imageLocation13 = photoViewer2.W4;
                        undoView.m(j14, imageLocation12 == imageLocation13 ? null : 1, 22);
                        final int i67 = 0;
                        AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.sr0
                            public final /* synthetic */ wr0 b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i67) {
                                    case 0:
                                        org.telegram.ui.ActionBar.w0 w0Var2 = this.b.b.l0;
                                        if (w0Var2 != null) {
                                            w0Var2.r(14);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        PhotoViewer photoViewer3 = this.b.b;
                                        photoViewer3.l0.r(19);
                                        photoViewer3.l0.K(20);
                                        break;
                                    default:
                                        PhotoViewer photoViewer4 = this.b.b;
                                        photoViewer4.l0.K(19);
                                        photoViewer4.l0.r(20);
                                        break;
                                }
                            }
                        }, 300L);
                        return;
                    }
                    if (i10 == 15) {
                        i16 = photoViewer2.Q;
                        FileLoader fileLoader6 = FileLoader.getInstance(i16);
                        imageLocation7 = photoViewer2.X4;
                        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = imageLocation7 == null ? null : imageLocation7.location;
                        imageLocation8 = photoViewer2.X4;
                        File pathToAttach2 = fileLoader6.getPathToAttach(tL_fileLocationToBeDeprecated, PhotoViewer.q1(imageLocation8), true);
                        imageLocation9 = photoViewer2.X4;
                        boolean z29 = imageLocation9.imageType == 2;
                        if (z29) {
                            i17 = photoViewer2.Q;
                            FileLoader fileLoader7 = FileLoader.getInstance(i17);
                            imageLocation10 = photoViewer2.W4;
                            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = imageLocation10 == null ? null : imageLocation10.location;
                            imageLocation11 = photoViewer2.W4;
                            str = fileLoader7.getPathToAttach(tL_fileLocationToBeDeprecated2, PhotoViewer.q1(imageLocation11), true).getAbsolutePath();
                        } else {
                            str = null;
                        }
                        hu0Var = photoViewer2.d;
                        hu0Var.f(pathToAttach2.getAbsolutePath(), str, z29);
                        return;
                    }
                    if (i10 == 19) {
                        int i68 = photoViewer2.N4;
                        if (i68 < 0 || i68 >= photoViewer2.V6.size()) {
                            return;
                        }
                        MessageObject messageObject62 = (MessageObject) photoViewer2.V6.get(photoViewer2.N4);
                        photoViewer2.k5 = true;
                        final int i69 = true ? 1 : 0;
                        AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.sr0
                            public final /* synthetic */ wr0 b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i69) {
                                    case 0:
                                        org.telegram.ui.ActionBar.w0 w0Var2 = this.b.b.l0;
                                        if (w0Var2 != null) {
                                            w0Var2.r(14);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        PhotoViewer photoViewer3 = this.b.b;
                                        photoViewer3.l0.r(19);
                                        photoViewer3.l0.K(20);
                                        break;
                                    default:
                                        PhotoViewer photoViewer4 = this.b.b;
                                        photoViewer4.l0.K(19);
                                        photoViewer4.l0.r(20);
                                        break;
                                }
                            }
                        }, 32L);
                        PhotoViewer.S(photoViewer2);
                        i15 = photoViewer2.Q;
                        MessagesController.getInstance(i15).getTranslateController().translatePhoto(messageObject62, new gr0(photoViewer2, 3));
                        return;
                    }
                    if (i10 == 20) {
                        photoViewer2.k5 = false;
                        final int i70 = 2;
                        AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.sr0
                            public final /* synthetic */ wr0 b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i70) {
                                    case 0:
                                        org.telegram.ui.ActionBar.w0 w0Var2 = this.b.b.l0;
                                        if (w0Var2 != null) {
                                            w0Var2.r(14);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        PhotoViewer photoViewer3 = this.b.b;
                                        photoViewer3.l0.r(19);
                                        photoViewer3.l0.K(20);
                                        break;
                                    default:
                                        PhotoViewer photoViewer4 = this.b.b;
                                        photoViewer4.l0.K(19);
                                        photoViewer4.l0.r(20);
                                        break;
                                }
                            }
                        }, 32L);
                        PhotoViewer.S(photoViewer2);
                        return;
                    }
                    if (i10 == 22) {
                        photoViewer2.W2 = !photoViewer2.W2;
                        boolean z30 = photoViewer2.W2;
                        messageObject18 = photoViewer2.Q4;
                        org.telegram.ui.Components.i71.I(messageObject18, z30);
                        org.telegram.ui.Components.i71 i71Var = photoViewer2.C2;
                        if (i71Var != null) {
                            i71Var.N(photoViewer2.W2);
                        }
                        photoViewer2.p0.d(photoViewer2.W2);
                        photoViewer2.p0.setSelectorColor(photoViewer2.W2 ? 259241196 : 268435455);
                        return;
                    }
                    if (i10 != 23) {
                        return;
                    }
                    imageLocation = photoViewer2.W4;
                    if (imageLocation != null) {
                        imageLocation5 = photoViewer2.W4;
                        if (imageLocation5.photo != null) {
                            imageLocation6 = photoViewer2.W4;
                            photo2 = imageLocation6.photo;
                            photo = photo2;
                            if (photo == null) {
                                return;
                            }
                            i14 = photoViewer2.Q;
                            activity8 = photoViewer2.y;
                            j10 = photoViewer2.w5;
                            org.telegram.ui.Components.z4.J(i14, activity8, j10, photo, new nh.b());
                            return;
                        }
                    }
                    imageLocation2 = photoViewer2.X4;
                    if (imageLocation2 != null) {
                        imageLocation3 = photoViewer2.X4;
                        if (imageLocation3.photo != null) {
                            imageLocation4 = photoViewer2.X4;
                            photo2 = imageLocation4.photo;
                            photo = photo2;
                            if (photo == null) {
                            }
                        }
                    }
                    photo = null;
                    if (photo == null) {
                    }
                }
            }
        }
    }
}
