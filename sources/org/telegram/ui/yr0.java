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

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class yr0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ org.telegram.ui.ActionBar.d6 a;
    public final /* synthetic */ PhotoViewer b;

    public yr0(PhotoViewer photoViewer, org.telegram.ui.ActionBar.d6 d6Var) {
        this.b = photoViewer;
        this.a = d6Var;
    }

    @Override // org.telegram.ui.ActionBar.j
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

    /* JADX WARN: Code restructure failed: missing block: B:198:0x0404, code lost:
    
        if (r4.c.t(r3) != false) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x07f9, code lost:
    
        if (r9 == org.telegram.messenger.UserConfig.getInstance(r16).getClientUserId()) goto L349;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x07fd, code lost:
    
        if (r8 == null) goto L354;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x07ff, code lost:
    
        r9 = r7.T;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x0809, code lost:
    
        if (org.telegram.messenger.MessagesController.getInstance(r9).canRevokePmInbox == false) goto L354;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x080b, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x080e, code lost:
    
        r10 = r7.T4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x0816, code lost:
    
        if (r10.messageOwner.action == null) goto L361;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x0818, code lost:
    
        r10 = r7.T4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x0822, code lost:
    
        if ((r10.messageOwner.action instanceof org.telegram.tgnet.TLRPC.TL_messageActionEmpty) == false) goto L360;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x0825, code lost:
    
        r6 = "Cancel";
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x0828, code lost:
    
        r10 = r7.T4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x0830, code lost:
    
        if (r10.isOut() != false) goto L366;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x0832, code lost:
    
        if (r9 != false) goto L366;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x0838, code lost:
    
        if (org.telegram.messenger.ChatObject.hasAdminRights(r11) == false) goto L360;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x083a, code lost:
    
        r9 = r7.T4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x0843, code lost:
    
        if ((r12 - r9.messageOwner.date) > r13) goto L360;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x0845, code lost:
    
        r10 = r7.y;
        r9 = new android.widget.FrameLayout(r10);
        r10 = r8;
        r12 = r7.y;
        r8 = new org.telegram.ui.Cells.a2(r12, 1, r2);
        r8.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.L0(false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x0861, code lost:
    
        if (r11 == null) goto L371;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x0863, code lost:
    
        r2 = r9;
        r11 = 0;
        r5 = 5;
        r15 = null;
        r8.e(org.telegram.messenger.LocaleController.getString("DeleteForAll", org.telegram.messenger.R.string.DeleteForAll), "", false, false, false);
        r6 = "Cancel";
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x08a5, code lost:
    
        if (org.telegram.messenger.LocaleController.isRTL == false) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x08a7, code lost:
    
        r9 = org.telegram.messenger.AndroidUtilities.dp(16.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x08b2, code lost:
    
        if (org.telegram.messenger.LocaleController.isRTL == false) goto L379;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x08b4, code lost:
    
        r10 = org.telegram.messenger.AndroidUtilities.dp(8.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x08bd, code lost:
    
        r8.setPadding(r9, r11, r10, r11);
        r2.addView(r8, w7.z5.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        r8.setOnClickListener(new org.telegram.ui.o8(r5, r0));
        r3.n(r2);
        r3.a.G = 9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x08b9, code lost:
    
        r10 = org.telegram.messenger.AndroidUtilities.dp(16.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x08ac, code lost:
    
        r9 = org.telegram.messenger.AndroidUtilities.dp(8.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x087d, code lost:
    
        r2 = r9;
        r15 = null;
        r5 = 5;
        r6 = "Cancel";
        r11 = 0;
        r8.e(org.telegram.messenger.LocaleController.formatString("DeleteForUser", org.telegram.messenger.R.string.DeleteForUser, org.telegram.messenger.UserObject.getFirstName(r10)), "", false, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x080d, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x07fb, code lost:
    
        if (r11 != null) goto L350;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x06cb, code lost:
    
        if (r8 == r12) goto L304;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x06db, code lost:
    
        if (r8.isVideo() != false) goto L321;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x06ab  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0774  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x090d  */
    /* JADX WARN: Removed duplicated region for block: B:338:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:364:0x06b9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x0ddc  */
    /* JADX WARN: Removed duplicated region for block: B:536:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x015a  */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v9 */
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
        org.telegram.ui.Components.py0 py0Var;
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
        qn qnVar;
        int i38;
        int i39;
        MessageObject messageObject21;
        qn qnVar2;
        qn qnVar3;
        MessageObject messageObject22;
        int i40;
        MessageObject messageObject23;
        org.telegram.ui.ActionBar.u0 u0Var;
        View findViewWithTag;
        org.telegram.ui.Components.kg0 kg0Var;
        PhotoViewer photoViewer;
        Activity activity9;
        hu0 hu0Var2;
        MessageObject messageObject24;
        boolean z10;
        Activity activity10;
        hu0 hu0Var3;
        CharSequence b02;
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
        boolean z11;
        Activity activity13;
        MessageObject messageObject36;
        ArrayList arrayList;
        qn qnVar4;
        String str2;
        MessageObject.GroupedMessages groupedMessages;
        MessageObject messageObject37;
        MessageObject messageObject38;
        qn qnVar5;
        Activity activity14;
        boolean z13;
        Activity activity15;
        int z14;
        int z15;
        int z16;
        int z17;
        qn qnVar6;
        MessageObject messageObject39;
        MessageObject messageObject40;
        int i49;
        hu0 hu0Var6;
        MessageObject messageObject41;
        MessageObject messageObject42;
        MessageObject messageObject43;
        String str3;
        qn qnVar7;
        int i50;
        MessageObject messageObject44;
        MessageObject messageObject45;
        qn qnVar8;
        Activity activity16;
        Activity activity17;
        qn qnVar9;
        qf.g m12;
        org.telegram.ui.Components.u7 u7Var;
        Activity activity18;
        Activity activity19;
        qn qnVar10;
        String str4;
        MessageObject.GroupedMessages groupedMessages2;
        MessageObject messageObject46;
        Activity activity20;
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
        du0 du0Var6;
        ?? r14;
        File file;
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
        Object[] objArr;
        File file2;
        Activity activity21;
        Activity activity22;
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
        qn qnVar11;
        MessageObject messageObject60;
        boolean I1;
        org.telegram.ui.ActionBar.d6 d6Var = this.a;
        boolean z22 = true;
        z22 = true;
        z22 = true;
        PhotoViewer photoViewer2 = this.b;
        if (i10 == -1) {
            gt0 gt0Var = photoViewer2.L1;
            if (gt0Var == null || !gt0Var.p0()) {
                I1 = photoViewer2.I1();
                if (I1) {
                    photoViewer2.E0(false);
                    return;
                } else {
                    photoViewer2.G0(true, false);
                    return;
                }
            }
            return;
        }
        final int i60 = 0;
        if (i10 == 2) {
            if (Build.VERSION.SDK_INT <= 28 || BuildVars.NO_SCOPED_STORAGE) {
                activity18 = photoViewer2.y;
                if (activity18.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                    activity19 = photoViewer2.y;
                    activity19.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                    return;
                }
            }
            final ArrayList arrayList2 = new ArrayList(1);
            qnVar10 = photoViewer2.l4;
            if (qnVar10 != null) {
                qnVar11 = photoViewer2.l4;
                messageObject60 = photoViewer2.T4;
                str4 = "Cancel";
                groupedMessages2 = qnVar11.D8(messageObject60.getGroupId());
            } else {
                str4 = "Cancel";
                groupedMessages2 = null;
            }
            if (groupedMessages2 != null) {
                arrayList2.addAll(groupedMessages2.messages);
            } else {
                messageObject46 = photoViewer2.T4;
                arrayList2.add(messageObject46);
            }
            if (arrayList2.size() > 1) {
                boolean z23 = false;
                boolean z24 = false;
                boolean z25 = false;
                for (int i61 = 0; i61 < arrayList2.size(); i61++) {
                    MessageObject messageObject61 = (MessageObject) arrayList2.get(i61);
                    if (messageObject61.isLivePhoto()) {
                        z25 = true;
                    } else if (messageObject61.isVideo()) {
                        z23 = true;
                    } else {
                        z24 = true;
                    }
                }
                activity20 = photoViewer2.y;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity20, d6Var);
                alertDialog$Builder.l(LocaleController.getString("SaveGroupMedia", R.string.SaveGroupMedia));
                alertDialog$Builder.g(LocaleController.getString("SaveGroupMediaMessage", R.string.SaveGroupMediaMessage));
                alertDialog$Builder.a.I = org.telegram.ui.ActionBar.h6.pg;
                messageObject47 = photoViewer2.T4;
                if (messageObject47 != null) {
                    messageObject48 = photoViewer2.T4;
                    if (messageObject48.isVideo()) {
                        messageObject49 = photoViewer2.T4;
                        if (!messageObject49.isLivePhoto()) {
                            string = LocaleController.getString("ThisMedia", R.string.ThisMedia);
                            final int i62 = true ? 1 : 0;
                            alertDialog$Builder.h(string, new org.telegram.ui.ActionBar.a2(this) { // from class: org.telegram.ui.qr0
                                public final /* synthetic */ yr0 b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.ui.ActionBar.a2
                                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i63) {
                                    switch (i62) {
                                        case 0:
                                            yr0 yr0Var = this.b;
                                            yr0Var.getClass();
                                            ArrayList arrayList3 = new ArrayList(1);
                                            PhotoViewer photoViewer3 = yr0Var.b;
                                            arrayList3.add(photoViewer3.T4);
                                            PhotoViewer.C(photoViewer3, arrayList3);
                                            break;
                                        default:
                                            yr0 yr0Var2 = this.b;
                                            PhotoViewer photoViewer4 = yr0Var2.b;
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
                                                        MediaController.saveFile(pathToAttach2.toString(), photoViewer4.y, isVideo ? 1 : 0, null, null, new sr0(yr0Var2, isVideo, 0));
                                                        break;
                                                    } else {
                                                        photoViewer4.U2();
                                                        break;
                                                    }
                                                } else if (pathToAttach2 != null && pathToAttach2.exists() && file3 != null && file3.exists()) {
                                                    MediaController.saveFile(pathToAttach2.toString(), file3.toString(), photoViewer4.y, new pr0(yr0Var2, 1));
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
                            String formatPluralString = (!z23 || z25) ? LocaleController.formatPluralString("AllNMedia", arrayList2.size(), new Object[0]) : LocaleController.formatPluralString("AllNPhotos", arrayList2.size(), new Object[0]);
                            final boolean z26 = z24;
                            final boolean z27 = z23;
                            final boolean z28 = z25;
                            alertDialog$Builder.k(formatPluralString, new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.vr0
                                @Override // org.telegram.ui.ActionBar.a2
                                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i63) {
                                    yr0 yr0Var = yr0.this;
                                    PhotoViewer photoViewer3 = yr0Var.b;
                                    int[] iArr = new int[1];
                                    final ar0 ar0Var = new ar0(yr0Var, new int[1], iArr, z27, z26, z28);
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
                                                    MediaController.saveFile(pathToAttach2.toString(), photoViewer3.y, 0, null, null, new Utilities.Callback() { // from class: org.telegram.ui.rr0
                                                        @Override // org.telegram.messenger.Utilities.Callback
                                                        public final void run(Object obj) {
                                                            switch (i65) {
                                                                case 0:
                                                                    AndroidUtilities.runOnUIThread(ar0Var);
                                                                    break;
                                                                case 1:
                                                                    AndroidUtilities.runOnUIThread(ar0Var);
                                                                    break;
                                                                default:
                                                                    AndroidUtilities.runOnUIThread(ar0Var);
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                } else {
                                                    final int i66 = 0;
                                                    MediaController.saveFile(pathToAttach2.toString(), file3.toString(), photoViewer3.y, new Utilities.Callback() { // from class: org.telegram.ui.rr0
                                                        @Override // org.telegram.messenger.Utilities.Callback
                                                        public final void run(Object obj) {
                                                            switch (i66) {
                                                                case 0:
                                                                    AndroidUtilities.runOnUIThread(ar0Var);
                                                                    break;
                                                                case 1:
                                                                    AndroidUtilities.runOnUIThread(ar0Var);
                                                                    break;
                                                                default:
                                                                    AndroidUtilities.runOnUIThread(ar0Var);
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                }
                                            } else if (!isLivePhoto && pathToAttach2 != null && pathToAttach2.exists()) {
                                                iArr[0] = iArr[0] + 1;
                                                final int i67 = 2;
                                                MediaController.saveFile(pathToAttach2.toString(), photoViewer3.y, isVideo ? 1 : 0, null, null, new Utilities.Callback() { // from class: org.telegram.ui.rr0
                                                    @Override // org.telegram.messenger.Utilities.Callback
                                                    public final void run(Object obj) {
                                                        switch (i67) {
                                                            case 0:
                                                                AndroidUtilities.runOnUIThread(ar0Var);
                                                                break;
                                                            case 1:
                                                                AndroidUtilities.runOnUIThread(ar0Var);
                                                                break;
                                                            default:
                                                                AndroidUtilities.runOnUIThread(ar0Var);
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
                            alertDialog$Builder.i(LocaleController.getString(str4, R.string.Cancel), new fk0(3));
                            org.telegram.ui.ActionBar.b2 a10 = alertDialog$Builder.a();
                            z18 = photoViewer2.z1(org.telegram.ui.ActionBar.h6.ug);
                            a10.j(z18);
                            a10.show();
                            d = a10.d(-3);
                            if (d instanceof TextView) {
                                int i63 = org.telegram.ui.ActionBar.h6.q7;
                                z110 = photoViewer2.z1(i63);
                                ((TextView) d).setTextColor(z110);
                                z111 = photoViewer2.z1(i63);
                                d.setBackground(org.telegram.ui.ActionBar.h6.H0(AndroidUtilities.dp(3.0f), z111));
                                ViewGroup viewGroup = a10.t0;
                                if ((viewGroup instanceof LinearLayout) && ((LinearLayout) viewGroup).getOrientation() == 1) {
                                    d.bringToFront();
                                }
                            }
                            z19 = photoViewer2.z1(org.telegram.ui.ActionBar.h6.hg);
                            a10.p(z19);
                            return;
                        }
                    }
                }
                string = LocaleController.getString("ThisPhoto", R.string.ThisPhoto);
                final int i622 = true ? 1 : 0;
                alertDialog$Builder.h(string, new org.telegram.ui.ActionBar.a2(this) { // from class: org.telegram.ui.qr0
                    public final /* synthetic */ yr0 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.ui.ActionBar.a2
                    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i632) {
                        switch (i622) {
                            case 0:
                                yr0 yr0Var = this.b;
                                yr0Var.getClass();
                                ArrayList arrayList3 = new ArrayList(1);
                                PhotoViewer photoViewer3 = yr0Var.b;
                                arrayList3.add(photoViewer3.T4);
                                PhotoViewer.C(photoViewer3, arrayList3);
                                break;
                            default:
                                yr0 yr0Var2 = this.b;
                                PhotoViewer photoViewer4 = yr0Var2.b;
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
                                            MediaController.saveFile(pathToAttach2.toString(), photoViewer4.y, isVideo ? 1 : 0, null, null, new sr0(yr0Var2, isVideo, 0));
                                            break;
                                        } else {
                                            photoViewer4.U2();
                                            break;
                                        }
                                    } else if (pathToAttach2 != null && pathToAttach2.exists() && file3 != null && file3.exists()) {
                                        MediaController.saveFile(pathToAttach2.toString(), file3.toString(), photoViewer4.y, new pr0(yr0Var2, 1));
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
                String formatPluralString2 = (!z23 || z25) ? LocaleController.formatPluralString("AllNMedia", arrayList2.size(), new Object[0]) : LocaleController.formatPluralString("AllNPhotos", arrayList2.size(), new Object[0]);
                final boolean z262 = z24;
                final boolean z272 = z23;
                final boolean z282 = z25;
                alertDialog$Builder.k(formatPluralString2, new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.vr0
                    @Override // org.telegram.ui.ActionBar.a2
                    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i632) {
                        yr0 yr0Var = yr0.this;
                        PhotoViewer photoViewer3 = yr0Var.b;
                        int[] iArr = new int[1];
                        final ar0 ar0Var = new ar0(yr0Var, new int[1], iArr, z272, z262, z282);
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
                                        MediaController.saveFile(pathToAttach2.toString(), photoViewer3.y, 0, null, null, new Utilities.Callback() { // from class: org.telegram.ui.rr0
                                            @Override // org.telegram.messenger.Utilities.Callback
                                            public final void run(Object obj) {
                                                switch (i65) {
                                                    case 0:
                                                        AndroidUtilities.runOnUIThread(ar0Var);
                                                        break;
                                                    case 1:
                                                        AndroidUtilities.runOnUIThread(ar0Var);
                                                        break;
                                                    default:
                                                        AndroidUtilities.runOnUIThread(ar0Var);
                                                        break;
                                                }
                                            }
                                        });
                                    } else {
                                        final int i66 = 0;
                                        MediaController.saveFile(pathToAttach2.toString(), file3.toString(), photoViewer3.y, new Utilities.Callback() { // from class: org.telegram.ui.rr0
                                            @Override // org.telegram.messenger.Utilities.Callback
                                            public final void run(Object obj) {
                                                switch (i66) {
                                                    case 0:
                                                        AndroidUtilities.runOnUIThread(ar0Var);
                                                        break;
                                                    case 1:
                                                        AndroidUtilities.runOnUIThread(ar0Var);
                                                        break;
                                                    default:
                                                        AndroidUtilities.runOnUIThread(ar0Var);
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                } else if (!isLivePhoto && pathToAttach2 != null && pathToAttach2.exists()) {
                                    iArr[0] = iArr[0] + 1;
                                    final int i67 = 2;
                                    MediaController.saveFile(pathToAttach2.toString(), photoViewer3.y, isVideo ? 1 : 0, null, null, new Utilities.Callback() { // from class: org.telegram.ui.rr0
                                        @Override // org.telegram.messenger.Utilities.Callback
                                        public final void run(Object obj) {
                                            switch (i67) {
                                                case 0:
                                                    AndroidUtilities.runOnUIThread(ar0Var);
                                                    break;
                                                case 1:
                                                    AndroidUtilities.runOnUIThread(ar0Var);
                                                    break;
                                                default:
                                                    AndroidUtilities.runOnUIThread(ar0Var);
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
                alertDialog$Builder.i(LocaleController.getString(str4, R.string.Cancel), new fk0(3));
                org.telegram.ui.ActionBar.b2 a102 = alertDialog$Builder.a();
                z18 = photoViewer2.z1(org.telegram.ui.ActionBar.h6.ug);
                a102.j(z18);
                a102.show();
                d = a102.d(-3);
                if (d instanceof TextView) {
                }
                z19 = photoViewer2.z1(org.telegram.ui.ActionBar.h6.hg);
                a102.p(z19);
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
                    j15 = photoViewer2.z5;
                    if (j15 == 0) {
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
                    du0Var6 = photoViewer2.j7;
                    if (du0Var6 != null) {
                        du0Var7 = photoViewer2.j7;
                        i51 = photoViewer2.P4;
                        file = du0Var7.b(i51);
                        du0Var8 = photoViewer2.j7;
                        i52 = photoViewer2.P4;
                        a2 = du0Var8.a(i52);
                    } else {
                        r14 = 0;
                        file = null;
                    }
                }
                if (file != null && !file.exists()) {
                    file = new File(FileLoader.getDirectory(4), file.getName());
                }
                messageObject51 = photoViewer2.T4;
                if (messageObject51 != null) {
                    messageObject54 = photoViewer2.T4;
                    if (messageObject54.isLivePhoto()) {
                        objArr = true;
                        if (objArr != false) {
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
                                if (objArr == true) {
                                    if (file == null || !file.exists()) {
                                        photoViewer2.U2();
                                        return;
                                    }
                                    String file3 = file.toString();
                                    activity21 = photoViewer2.y;
                                    MediaController.saveFile(file3, activity21, r14, null, null, new sr0(this, r14, 1));
                                    return;
                                }
                                if (file == null || !file.exists() || file2 == null || !file2.exists()) {
                                    photoViewer2.U2();
                                    return;
                                }
                                String file4 = file.toString();
                                String file5 = file2.toString();
                                activity22 = photoViewer2.y;
                                MediaController.saveFile(file4, file5, activity22, new pr0(this, 0));
                                return;
                            }
                        }
                        file2 = null;
                        if (objArr == true) {
                        }
                    }
                }
                objArr = false;
                if (objArr != false) {
                }
                file2 = null;
                if (objArr == true) {
                }
            }
            r14 = a2;
            if (file != null) {
                file = new File(FileLoader.getDirectory(4), file.getName());
            }
            messageObject51 = photoViewer2.T4;
            if (messageObject51 != null) {
            }
            objArr = false;
            if (objArr != false) {
            }
            file2 = null;
            if (objArr == true) {
            }
        } else {
            if (i10 == 24) {
                qf.b Y = qf.b.Y();
                m12 = photoViewer2.m1();
                Y.d0(m12);
                u7Var = photoViewer2.G0;
                u7Var.performClick();
                return;
            }
            if (i10 == 3) {
                if (photoViewer2.E5 != 0) {
                    photoViewer2.s4 = true;
                    Bundle bundle = new Bundle();
                    bundle.putLong("dialog_id", photoViewer2.E5);
                    org.telegram.ui.Components.wa0 wa0Var = new org.telegram.ui.Components.wa0(bundle, null);
                    qnVar8 = photoViewer2.l4;
                    if (qnVar8 != null) {
                        qnVar9 = photoViewer2.l4;
                        wa0Var.X(qnVar9.A8());
                    }
                    photoViewer2.G0(false, false);
                    activity16 = photoViewer2.y;
                    if (activity16 instanceof LaunchActivity) {
                        activity17 = photoViewer2.y;
                        ((LaunchActivity) activity17).u0(wa0Var, false, true);
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
                long j16 = photoViewer2.E5;
                messageObject2 = photoViewer2.T4;
                if (messageObject2 != null) {
                    messageObject5 = photoViewer2.T4;
                    j16 = messageObject5.getDialogId();
                }
                if (DialogObject.isEncryptedDialog(j16)) {
                    bundle2.putInt("enc_id", DialogObject.getEncryptedChatId(j16));
                } else if (DialogObject.isUserDialog(j16)) {
                    bundle2.putLong("user_id", j16);
                } else {
                    i11 = photoViewer2.T;
                    TLRPC.Chat chat2 = MessagesController.getInstance(i11).getChat(Long.valueOf(-j16));
                    if (chat2 != null && chat2.migrated_to != null) {
                        bundle2.putLong("migrated_to", j16);
                        j16 = -chat2.migrated_to.channel_id;
                    }
                    bundle2.putLong("chat_id", -j16);
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
                    launchActivity.u0(new qn(bundle2), launchActivity.S() > 1 || AndroidUtilities.isTablet(), true);
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
                    hu0Var6 = photoViewer2.d;
                    if (hu0Var6 == null) {
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
                            str3 = messageObject45.messageOwner.attachPath;
                            if (!TextUtils.isEmpty(str3)) {
                            }
                        }
                        str3 = null;
                        if (TextUtils.isEmpty(str3)) {
                            i50 = photoViewer2.T;
                            FileLoader fileLoader4 = FileLoader.getInstance(i50);
                            messageObject44 = photoViewer2.T4;
                            File pathToMessage = fileLoader4.getPathToMessage(messageObject44.messageOwner, true);
                            if (pathToMessage != null && pathToMessage.exists()) {
                                str3 = pathToMessage.getAbsolutePath();
                            }
                        }
                        String str5 = str3;
                        if (TextUtils.isEmpty(str5)) {
                            return;
                        }
                        qnVar7 = photoViewer2.l4;
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add(new MediaController.PhotoEntry(0, 0, 0L, str5, 0, false, 0, 0, 0L));
                        this.b.g2(arrayList3, 0, 11, false, new wr0(), qnVar7);
                        photoViewer2.Y0(null, null, false, null);
                        photoViewer2.m2();
                        et.q().x();
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
                        ((LaunchActivity) activity13).O0(messageObject36.currentAccount);
                        arrayList = new ArrayList(1);
                        qnVar4 = photoViewer2.l4;
                        if (qnVar4 == null) {
                            qnVar6 = photoViewer2.l4;
                            messageObject39 = photoViewer2.T4;
                            str2 = "AllNMedia";
                            groupedMessages = qnVar6.D8(messageObject39.getGroupId());
                        } else {
                            str2 = "AllNMedia";
                            groupedMessages = null;
                        }
                        if (groupedMessages == null) {
                            arrayList.addAll(groupedMessages.messages);
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
                            cy cyVar = new cy(bundle3);
                            ArrayList arrayList4 = new ArrayList();
                            messageObject38 = photoViewer2.T4;
                            arrayList4.add(messageObject38);
                            qnVar5 = photoViewer2.l4;
                            cyVar.C2 = new e7(this, arrayList4, qnVar5, 18);
                            activity14 = photoViewer2.y;
                            ((LaunchActivity) activity14).u0(cyVar, false, true);
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
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(activity15, d6Var);
                        alertDialog$Builder2.l(LocaleController.getString("ForwardGroupMedia", R.string.ForwardGroupMedia));
                        alertDialog$Builder2.g(LocaleController.getString("ForwardGroupMediaMessage", R.string.ForwardGroupMediaMessage));
                        alertDialog$Builder2.a.I = org.telegram.ui.ActionBar.h6.pg;
                        alertDialog$Builder2.h(z13 ? LocaleController.getString("ThisPhoto", R.string.ThisPhoto) : LocaleController.getString("ThisMedia", R.string.ThisMedia), new org.telegram.ui.ActionBar.a2(this) { // from class: org.telegram.ui.qr0
                            public final /* synthetic */ yr0 b;

                            {
                                this.b = this;
                            }

                            @Override // org.telegram.ui.ActionBar.a2
                            public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i632) {
                                switch (i60) {
                                    case 0:
                                        yr0 yr0Var = this.b;
                                        yr0Var.getClass();
                                        ArrayList arrayList32 = new ArrayList(1);
                                        PhotoViewer photoViewer3 = yr0Var.b;
                                        arrayList32.add(photoViewer3.T4);
                                        PhotoViewer.C(photoViewer3, arrayList32);
                                        break;
                                    default:
                                        yr0 yr0Var2 = this.b;
                                        PhotoViewer photoViewer4 = yr0Var2.b;
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
                                                    MediaController.saveFile(pathToAttach2.toString(), photoViewer4.y, isVideo ? 1 : 0, null, null, new sr0(yr0Var2, isVideo, 0));
                                                    break;
                                                } else {
                                                    photoViewer4.U2();
                                                    break;
                                                }
                                            } else if (pathToAttach2 != null && pathToAttach2.exists() && file32 != null && file32.exists()) {
                                                MediaController.saveFile(pathToAttach2.toString(), file32.toString(), photoViewer4.y, new pr0(yr0Var2, 1));
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
                        alertDialog$Builder2.k(z13 ? LocaleController.formatPluralString("AllNPhotos", arrayList.size(), new Object[0]) : LocaleController.formatPluralString(str2, arrayList.size(), new Object[0]), new en0(3, this, arrayList));
                        alertDialog$Builder2.i(LocaleController.getString("Cancel", R.string.Cancel), new fk0(4));
                        org.telegram.ui.ActionBar.b2 a11 = alertDialog$Builder2.a();
                        z14 = photoViewer2.z1(org.telegram.ui.ActionBar.h6.ug);
                        a11.j(z14);
                        a11.show();
                        View d10 = a11.d(-3);
                        if (d10 instanceof TextView) {
                            int i65 = org.telegram.ui.ActionBar.h6.q7;
                            z16 = photoViewer2.z1(i65);
                            ((TextView) d10).setTextColor(z16);
                            z17 = photoViewer2.z1(i65);
                            d10.setBackground(org.telegram.ui.ActionBar.h6.H0(AndroidUtilities.dp(3.0f), z17));
                            ViewGroup viewGroup2 = a11.t0;
                            if ((viewGroup2 instanceof LinearLayout) && ((LinearLayout) viewGroup2).getOrientation() == 1) {
                                d10.bringToFront();
                            }
                        }
                        z15 = photoViewer2.z1(org.telegram.ui.ActionBar.h6.hg);
                        a11.p(z15);
                        return;
                    }
                }
                z11 = false;
                activity13 = photoViewer2.y;
                messageObject36 = photoViewer2.T4;
                ((LaunchActivity) activity13).O0(messageObject36.currentAccount);
                arrayList = new ArrayList(1);
                qnVar4 = photoViewer2.l4;
                if (qnVar4 == null) {
                }
                if (groupedMessages == null) {
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
                        hu0Var4 = photoViewer2.d;
                        if (hu0Var4 == null) {
                            return;
                        }
                        hu0Var5 = photoViewer2.d;
                        hu0Var5.J();
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
                                hu0Var3 = photoViewer2.d;
                                b02 = hu0Var3.b0();
                                if (b02 == null) {
                                    alertDialog$Builder3.l(LocaleController.getString("AreYouSureDeletePhotoTitle", R.string.AreYouSureDeletePhotoTitle));
                                    alertDialog$Builder3.g(b02);
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
                                                    long j17 = user.id;
                                                    i45 = photoViewer2.T;
                                                }
                                            }
                                        }
                                    }
                                }
                                String str6 = "Cancel";
                                org.telegram.ui.ActionBar.a2 a2Var = null;
                                alertDialog$Builder3.k(LocaleController.getString("Delete", R.string.Delete), new en0(4, this, zArr));
                                alertDialog$Builder3.h(LocaleController.getString(str6, R.string.Cancel), a2Var);
                                org.telegram.ui.ActionBar.b2 a12 = alertDialog$Builder3.a();
                                photoViewer2.S2(alertDialog$Builder3);
                                textView = (TextView) a12.d(-1);
                                if (textView == null) {
                                    z12 = photoViewer2.z1(org.telegram.ui.ActionBar.h6.q7);
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
                    hu0Var3 = photoViewer2.d;
                    b02 = hu0Var3.b0();
                    if (b02 == null) {
                    }
                    boolean[] zArr2 = new boolean[1];
                    messageObject29 = photoViewer2.T4;
                    if (messageObject29 != null) {
                    }
                    String str62 = "Cancel";
                    org.telegram.ui.ActionBar.a2 a2Var2 = null;
                    alertDialog$Builder32.k(LocaleController.getString("Delete", R.string.Delete), new en0(4, this, zArr2));
                    alertDialog$Builder32.h(LocaleController.getString(str62, R.string.Cancel), a2Var2);
                    org.telegram.ui.ActionBar.b2 a122 = alertDialog$Builder32.a();
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
                                pf.d.r(activity5, MessageObject.getMedia(messageObject11.messageOwner).webpage.url);
                                photoViewer2.G0(false, false);
                                return;
                            }
                            messageObject6 = photoViewer2.T4;
                            if (messageObject6 == null) {
                                du0Var = photoViewer2.j7;
                                if (du0Var != null) {
                                    du0Var2 = photoViewer2.j7;
                                    i13 = photoViewer2.P4;
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
                            messageObject7 = photoViewer2.T4;
                            activity4 = photoViewer2.y;
                            messageObject8 = photoViewer2.T4;
                            if (!messageObject8.isVideo()) {
                                messageObject9 = photoViewer2.T4;
                                if (!messageObject9.isPhoto()) {
                                    messageObject10 = photoViewer2.T4;
                                    if (!messageObject10.isSticker()) {
                                        z22 = false;
                                    }
                                }
                            }
                            if (AndroidUtilities.openForView(messageObject7, activity4, d6Var, z22)) {
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
                            photoViewer2.U3 = new xr0(this, activity7, messageObject16, tLObject3, this.a);
                            py0Var = photoViewer2.U3;
                            py0Var.show();
                            return;
                        }
                        return;
                    }
                    if (i10 == 6) {
                        u0Var = photoViewer2.o0;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = u0Var.b;
                        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null || (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(6)) == null || findViewWithTag.getVisibility() != 0) {
                            return;
                        }
                        if (!photoViewer2.t4) {
                            photoViewer2.h3();
                            return;
                        }
                        kg0Var = photoViewer2.f0;
                        if (kg0Var.e()) {
                            if (PhotoViewer.b9 != null) {
                                PhotoViewer.b9.Q0();
                            }
                            photoViewer2.J3 = true;
                            photoViewer = PhotoViewer.a9;
                            PhotoViewer.b9 = photoViewer;
                            PhotoViewer.a9 = null;
                            photoViewer2.e = false;
                            photoViewer2.f = false;
                            ju0 ju0Var = photoViewer2.d5;
                            if (ju0Var != null && !ju0Var.a.getVisible()) {
                                photoViewer2.d5.a.setVisible(true, true);
                            }
                            photoViewer2.m6 = 1.0f;
                            photoViewer2.e0.invalidate();
                            photoViewer2.T0();
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
                        photoViewer2.o2(false);
                        photoViewer2.i0.setTag(r3);
                        photoViewer2.i0.setVisibility(0);
                        return;
                    }
                    if (i10 == 12) {
                        messageObject19 = photoViewer2.T4;
                        if (messageObject19 != null) {
                            messageObject20 = photoViewer2.T4;
                            TLRPC.Document document2 = messageObject20.getDocument();
                            qnVar = photoViewer2.l4;
                            if (qnVar != null) {
                                qnVar2 = photoViewer2.l4;
                                if (qnVar2.Y != null) {
                                    qnVar3 = photoViewer2.l4;
                                    qnVar3.Y.l(document2);
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
                            du0Var3 = photoViewer2.j7;
                            if (du0Var3 == null) {
                                return;
                            }
                            du0Var4 = photoViewer2.j7;
                            i35 = photoViewer2.P4;
                            TLObject d12 = du0Var4.d(i35);
                            if (d12 instanceof TLRPC.Document) {
                                TLRPC.Document document3 = (TLRPC.Document) d12;
                                i36 = photoViewer2.T;
                                MediaDataController.getInstance(i36).addRecentGif(document3, (int) (System.currentTimeMillis() / 1000), true);
                                i37 = photoViewer2.T;
                                MessagesController messagesController3 = MessagesController.getInstance(i37);
                                du0Var5 = photoViewer2.j7;
                                messagesController3.saveGif(du0Var5.g(), document3);
                            }
                        }
                        bu0 bu0Var = photoViewer2.e0;
                        if (bu0Var != null) {
                            org.telegram.ui.Components.xc.Z(bu0Var, d6Var).o(org.telegram.ui.Components.wc.y, d6Var).j();
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
                        j11 = photoViewer2.z5;
                        if (j11 == userConfig.clientUserId) {
                            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
                            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                            tL_photos_updateProfilePhoto.id = tL_inputPhoto;
                            tL_inputPhoto.id = photo3.id;
                            tL_inputPhoto.access_hash = photo3.access_hash;
                            tL_inputPhoto.file_reference = photo3.file_reference;
                            i32 = photoViewer2.T;
                            ConnectionsManager.getInstance(i32).sendRequest(tL_photos_updateProfilePhoto, new tr0(this, userConfig, photo3, i60));
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
                            j12 = photoViewer2.z5;
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
                            i21 = photoViewer2.T;
                            MessagesController messagesController5 = MessagesController.getInstance(i21);
                            j13 = photoViewer2.z5;
                            messagesController5.changeChatAvatar(-j13, tL_inputChatPhoto, null, null, null, 0.0d, null, null, null, null);
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
                        org.telegram.ui.Components.e40 e40Var = photoViewer2.l1;
                        e40Var.d.clear();
                        e40Var.e.clear();
                        e40Var.c.clear();
                        photoViewer2.l1.b();
                        undoView = photoViewer2.n1;
                        j14 = photoViewer2.z5;
                        imageLocation12 = photoViewer2.a5;
                        imageLocation13 = photoViewer2.Z4;
                        undoView.m(j14, imageLocation12 == imageLocation13 ? null : 1, 22);
                        AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.ur0
                            public final /* synthetic */ yr0 b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i60) {
                                    case 0:
                                        org.telegram.ui.ActionBar.u0 u0Var2 = this.b.b.o0;
                                        if (u0Var2 != null) {
                                            u0Var2.r(14);
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
                            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = imageLocation10 == null ? null : imageLocation10.location;
                            imageLocation11 = photoViewer2.Z4;
                            str = fileLoader7.getPathToAttach(tL_fileLocationToBeDeprecated2, PhotoViewer.q1(imageLocation11), true).getAbsolutePath();
                        } else {
                            str = null;
                        }
                        hu0Var = photoViewer2.d;
                        hu0Var.f(pathToAttach2.getAbsolutePath(), str, z29);
                        return;
                    }
                    if (i10 == 19) {
                        int i66 = photoViewer2.Q4;
                        if (i66 < 0 || i66 >= photoViewer2.Y6.size()) {
                            return;
                        }
                        MessageObject messageObject62 = (MessageObject) photoViewer2.Y6.get(photoViewer2.Q4);
                        photoViewer2.n5 = true;
                        final int i67 = true ? 1 : 0;
                        AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.ur0
                            public final /* synthetic */ yr0 b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i67) {
                                    case 0:
                                        org.telegram.ui.ActionBar.u0 u0Var2 = this.b.b.o0;
                                        if (u0Var2 != null) {
                                            u0Var2.r(14);
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
                        MessagesController.getInstance(i15).getTranslateController().translatePhoto(messageObject62, new ir0(photoViewer2, 3));
                        return;
                    }
                    if (i10 == 20) {
                        photoViewer2.n5 = false;
                        final int i68 = 2;
                        AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.ur0
                            public final /* synthetic */ yr0 b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i68) {
                                    case 0:
                                        org.telegram.ui.ActionBar.u0 u0Var2 = this.b.b.o0;
                                        if (u0Var2 != null) {
                                            u0Var2.r(14);
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
                        org.telegram.ui.Components.b81.I(messageObject18, z30);
                        org.telegram.ui.Components.b81 b81Var = photoViewer2.F2;
                        if (b81Var != null) {
                            b81Var.N(photoViewer2.Z2);
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
                            if (photo == null) {
                                return;
                            }
                            i14 = photoViewer2.T;
                            activity8 = photoViewer2.y;
                            j10 = photoViewer2.z5;
                            org.telegram.ui.Components.f5.I(i14, activity8, j10, photo, new ci.b());
                            return;
                        }
                    }
                    imageLocation2 = photoViewer2.a5;
                    if (imageLocation2 != null) {
                        imageLocation3 = photoViewer2.a5;
                        if (imageLocation3.photo != null) {
                            imageLocation4 = photoViewer2.a5;
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
