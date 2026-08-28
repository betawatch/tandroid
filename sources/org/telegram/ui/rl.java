package org.telegram.ui;

import android.app.Activity;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.messenger.camera.Size;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ rl(int i9, Object obj, Object obj2, int i10) {
        this.a = i10;
        this.b = i9;
        this.c = obj;
        this.d = obj2;
    }

    private final void a() {
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.y01((org.telegram.ui.Components.a11) this.c, (org.telegram.ui.Components.bp) this.d, this.b, SvgHelper.getBitmap(R.raw.default_pattern, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(140.0f), -16777216, AndroidUtilities.density), 0));
    }

    private final void b() {
        MessageObject messageObject = (MessageObject) this.c;
        org.telegram.ui.Cells.k1 k1Var = (org.telegram.ui.Cells.k1) this.d;
        HashMap hashMap = org.telegram.ui.Components.i21.P;
        if (hashMap != null) {
            hashMap.remove(Integer.valueOf(org.telegram.ui.Components.i21.o(messageObject)));
        }
        if (k1Var != null) {
            k1Var.i0(3);
        }
        int i9 = this.b;
        NotificationCenter.getInstance(i9).lambda$postNotificationNameOnUIThread$1(NotificationCenter.voiceTranscriptionUpdate, messageObject);
        NotificationCenter.getInstance(i9).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateTranscriptionLock, new Object[0]);
    }

    private final void c() {
        int i9;
        hx hxVar = (hx) this.c;
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.d;
        dy dyVar = hxVar.b0;
        ArrayList arrayList = dyVar.N1;
        if (arrayList == null || (i9 = this.b) < 0 || i9 >= arrayList.size()) {
            return;
        }
        dyVar.N1.add(i9, dialog);
        dyVar.a0[0].q(true);
    }

    private final void e() {
        ay ayVar = (ay) this.c;
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.d;
        cy cyVar = ayVar.g;
        dy dyVar = ayVar.h;
        dyVar.O1 = true;
        dyVar.getMessagesController().addDialogToFolder(dialog.id, 0, this.b, 0L);
        dyVar.O1 = false;
        ArrayList<TLRPC.Dialog> dialogs = dyVar.getMessagesController().getDialogs(0);
        int indexOf = dialogs.indexOf(dialog);
        if (indexOf < 0) {
            cyVar.q(false);
            return;
        }
        ArrayList<TLRPC.Dialog> dialogs2 = dyVar.getMessagesController().getDialogs(1);
        if (!dialogs2.isEmpty() || indexOf != 1) {
            dyVar.A4(true, true);
            cyVar.x.D();
            cyVar.q(true);
            dyVar.o3();
        }
        if (dialogs2.isEmpty()) {
            dialogs.remove(0);
            if (indexOf == 1) {
                dyVar.A4(true, true);
                cyVar.q(true);
                dyVar.o3();
            } else {
                if (!dyVar.N1.isEmpty()) {
                    dyVar.N1.remove(0);
                }
                cyVar.x.D();
                cyVar.q(true);
            }
        }
    }

    private final void f() {
        o50 o50Var = (o50) this.c;
        org.telegram.ui.ActionBar.c2[] c2VarArr = (org.telegram.ui.ActionBar.c2[]) this.d;
        org.telegram.ui.ActionBar.c2 c2Var = c2VarArr[0];
        if (c2Var == null) {
            return;
        }
        c2Var.setOnCancelListener(new gh.x(o50Var, this.b, 6));
        c2VarArr[0].show();
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bb, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x05e3  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x062b  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0635  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0657  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0662  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x0a86  */
    /* JADX WARN: Removed duplicated region for block: B:496:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        UndoView undoView;
        UndoView undoView2;
        ?? r92;
        int i9;
        long j10;
        String formatPluralString;
        ArrayList arrayList;
        int size;
        int i10;
        int size2;
        int i11;
        int i12;
        int size3;
        int dp;
        float f10;
        int i13;
        int i14;
        int i15;
        int i16;
        SQLiteCursor sQLiteCursor;
        TLRPC.messages_EmojiGroups messages_emojigroups;
        NativeByteBuffer byteBufferValue;
        int i17 = 6;
        UndoView undoView3 = null;
        r10 = null;
        String str = null;
        UndoView undoView4 = null;
        SQLiteCursor sQLiteCursor2 = null;
        SQLiteCursor sQLiteCursor3 = 0;
        switch (this.a) {
            case 0:
                tl tlVar = (tl) this.c;
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) this.d;
                int i18 = this.b;
                tlVar.getClass();
                MessageObject messageObject = w0Var.getMessageObject();
                bm bmVar = tlVar.a;
                bmVar.M.j(i18, messageObject.getId(), true, messageObject.getDialogId() == bmVar.M.H6 ? 1 : 0, true, 0);
                return;
            case 1:
                org.telegram.ui.Components.jn jnVar = (org.telegram.ui.Components.jn) this.c;
                int i19 = this.b;
                View view = (View) this.d;
                jnVar.R = 0;
                jnVar.Q = i19;
                if (view instanceof org.telegram.ui.Cells.p8) {
                    jnVar.T((org.telegram.ui.Cells.p8) view, true);
                    return;
                } else {
                    jnVar.r.m(jnVar.E0);
                    return;
                }
            case 2:
                org.telegram.ui.Components.qu quVar = (org.telegram.ui.Components.qu) this.c;
                a0.h hVar = (a0.h) this.d;
                int i20 = this.b;
                org.telegram.ui.ActionBar.o2 o2Var = quVar.X0.c;
                if (o2Var instanceof qn) {
                    qn qnVar = (qn) o2Var;
                    qnVar.Q7();
                    undoView2 = qnVar.u3;
                } else {
                    if (!(o2Var instanceof ProfileActivity)) {
                        undoView = null;
                        if (undoView == null) {
                            if (hVar.m() == 1) {
                                undoView.m(((TLRPC.Dialog) hVar.n(0)).id, Integer.valueOf(i20), 53);
                                return;
                            } else {
                                undoView.k(0L, 53, Integer.valueOf(i20), Integer.valueOf(hVar.m()), null, null);
                                return;
                            }
                        }
                        return;
                    }
                    undoView2 = ((ProfileActivity) o2Var).I;
                }
                undoView = undoView2;
                if (undoView == null) {
                }
            case 3:
                org.telegram.ui.Components.rx rxVar = (org.telegram.ui.Components.rx) this.c;
                org.telegram.ui.ActionBar.c2[] c2VarArr = (org.telegram.ui.ActionBar.c2[]) this.d;
                int i21 = this.b;
                org.telegram.ui.ActionBar.c2 c2Var = c2VarArr[0];
                if (c2Var == null) {
                    return;
                }
                c2Var.setOnCancelListener(new gh.x(rxVar, i21, 5));
                c2VarArr[0].show();
                return;
            case 4:
                int i22 = this.b;
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) this.c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                TL_chatlists.TL_chatlists_getLeaveChatlistSuggestions tL_chatlists_getLeaveChatlistSuggestions = new TL_chatlists.TL_chatlists_getLeaveChatlistSuggestions();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_getLeaveChatlistSuggestions.chatlist = tL_inputChatlistDialogFilter;
                tL_inputChatlistDialogFilter.filter_id = i22;
                o2Var2.getConnectionsManager().sendRequest(tL_chatlists_getLeaveChatlistSuggestions, new bg.q0(o2Var2, i22, callback, i17));
                return;
            case 5:
                org.telegram.ui.Components.a30 a30Var = (org.telegram.ui.Components.a30) this.c;
                int i23 = this.b;
                ArrayList arrayList2 = (ArrayList) this.d;
                of.v1 v1Var = a30Var.d;
                org.telegram.ui.Components.b30 b30Var = a30Var.w;
                if (i23 != a30Var.n) {
                    return;
                }
                a30Var.h = false;
                TLRPC.Chat chat = b30Var.R;
                org.telegram.ui.Components.gw0 gw0Var = b30Var.s;
                if (!ChatObject.isChannel(chat)) {
                    a0.h hVar2 = v1Var.h;
                    ArrayList arrayList3 = v1Var.g;
                    arrayList3.clear();
                    arrayList3.addAll(arrayList2);
                    int size4 = arrayList2.size();
                    for (int i24 = 0; i24 < size4; i24++) {
                        TLObject tLObject = (TLObject) arrayList2.get(i24);
                        if (tLObject instanceof TLRPC.ChatParticipant) {
                            hVar2.k(tLObject, ((TLRPC.ChatParticipant) tLObject).user_id);
                        } else if (tLObject instanceof TLRPC.ChannelParticipant) {
                            hVar2.k(tLObject, MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer));
                        }
                    }
                    v1Var.i();
                }
                int i25 = a30Var.f - 1;
                boolean z10 = gw0Var.getVisibility() == 0;
                a30Var.l();
                if (a30Var.f > i25) {
                    b30Var.I(i25);
                }
                if (a30Var.h || v1Var.e() || !b30Var.d.S0()) {
                    return;
                }
                gw0Var.e(false, z10);
                return;
            case 6:
                org.telegram.ui.Components.o30 o30Var = (org.telegram.ui.Components.o30) this.c;
                int i26 = this.b;
                String str2 = (String) this.d;
                ArrayList arrayList4 = o30Var.K;
                int i27 = o30Var.J;
                if (i26 != o30Var.P) {
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(o30Var.X[0] ? "$" : "#");
                sb2.append(o30Var.U);
                String sb3 = sb2.toString();
                ih.h6 h6Var = o30Var.M;
                if (h6Var == null || !TextUtils.equals(h6Var.C, sb3)) {
                    o30Var.M = new ih.h6(i27, null, sb3);
                }
                if (o30Var.M.i.size() <= 0) {
                    r92 = 1;
                    o30Var.M.p(4, true);
                } else {
                    r92 = 1;
                }
                o30Var.L = r92;
                TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                tL_channels_searchPosts.flags |= r92;
                o30Var.U = str2;
                tL_channels_searchPosts.hashtag = str2;
                tL_channels_searchPosts.limit = 10;
                if (arrayList4.isEmpty()) {
                    tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                } else {
                    MessageObject messageObject2 = (MessageObject) j3.r0.j(r92, arrayList4);
                    tL_channels_searchPosts.offset_rate = o30Var.V;
                    tL_channels_searchPosts.offset_peer = MessagesController.getInstance(i27).getInputPeer(messageObject2.messageOwner.peer_id);
                }
                o30Var.Q = ConnectionsManager.getInstance(i27).sendRequest(tL_channels_searchPosts, new bg.q0(o30Var, i26, sb3, 7));
                return;
            case 7:
                org.telegram.ui.Components.f50 f50Var = (org.telegram.ui.Components.f50) this.c;
                int i28 = this.b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.d;
                Size[] sizeArr = f50Var.e0;
                if (f50Var.d0 == null) {
                    return;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera create camera session " + i28);
                }
                if (!f50Var.j0) {
                    if (i28 == 1) {
                        return;
                    }
                    surfaceTexture.setDefaultBufferSize(sizeArr[0].getWidth(), sizeArr[0].getHeight());
                    f50Var.k0 = new CameraSession(f50Var.y, sizeArr[0], f50Var.f0, 256, true);
                    f50Var.r();
                    org.telegram.ui.Components.w40 w40Var = f50Var.d0;
                    CameraSession cameraSession = f50Var.k0;
                    Handler handler = w40Var.getHandler();
                    if (handler != null) {
                        w40Var.sendMessage(handler.obtainMessage(3, cameraSession), 0);
                    }
                    CameraController.getInstance().openRound(f50Var.k0, surfaceTexture, new org.telegram.ui.Components.n40(f50Var, 1), new org.telegram.ui.Components.n40(f50Var, 2));
                    return;
                }
                if (f50Var.l0) {
                    Camera2Session camera2Session = f50Var.m0[i28];
                    if (camera2Session != null) {
                        camera2Session.open(surfaceTexture);
                        return;
                    }
                    return;
                }
                if (i28 == 1) {
                    return;
                }
                org.telegram.ui.Components.w40 w40Var2 = f50Var.d0;
                Camera2Session camera2Session2 = f50Var.n0;
                Handler handler2 = w40Var2.getHandler();
                if (handler2 != null) {
                    w40Var2.sendMessage(handler2.obtainMessage(3, camera2Session2), 0);
                }
                f50Var.n0.open(surfaceTexture);
                return;
            case 8:
                org.telegram.ui.Components.e50 e50Var = (org.telegram.ui.Components.e50) this.c;
                int i29 = this.b;
                org.telegram.ui.Components.z40 z40Var = (org.telegram.ui.Components.z40) this.d;
                org.telegram.ui.Components.f50 f50Var2 = e50Var.D0;
                VideoEditedInfo videoEditedInfo = f50Var2.J;
                int i30 = f50Var2.a;
                org.telegram.ui.Components.x40 x40Var = f50Var2.c;
                if (videoEditedInfo == null) {
                    VideoEditedInfo videoEditedInfo2 = new VideoEditedInfo();
                    f50Var2.J = videoEditedInfo2;
                    videoEditedInfo2.startTime = -1L;
                    videoEditedInfo2.endTime = -1L;
                }
                if (f50Var2.J.needConvert()) {
                    f50Var2.D = null;
                    f50Var2.E = null;
                    f50Var2.F = null;
                    f50Var2.G = null;
                    VideoEditedInfo videoEditedInfo3 = f50Var2.J;
                    long j11 = videoEditedInfo3.estimatedDuration;
                    j10 = 0;
                    double d = j11;
                    i9 = i29;
                    long j12 = videoEditedInfo3.startTime;
                    if (j12 < 0) {
                        j12 = 0;
                    }
                    long j13 = videoEditedInfo3.endTime;
                    if (j13 >= 0) {
                        j11 = j13;
                    }
                    long j14 = j11 - j12;
                    videoEditedInfo3.estimatedDuration = j14;
                    videoEditedInfo3.estimatedSize = Math.max(1L, (long) ((j14 / d) * f50Var2.H));
                    VideoEditedInfo videoEditedInfo4 = f50Var2.J;
                    videoEditedInfo4.bitrate = MediaController.VIDEO_BITRATE_480;
                    long j15 = videoEditedInfo4.startTime;
                    if (j15 > 0) {
                        videoEditedInfo4.startTime = j15 * 1000;
                    }
                    long j16 = videoEditedInfo4.endTime;
                    if (j16 > 0) {
                        videoEditedInfo4.endTime = j16 * 1000;
                    }
                    FileLoader.getInstance(i30).cancelFileUpload(f50Var2.T.getAbsolutePath(), false);
                } else {
                    i9 = i29;
                    j10 = 0;
                    f50Var2.J.estimatedSize = Math.max(1L, f50Var2.H);
                }
                VideoEditedInfo videoEditedInfo5 = f50Var2.J;
                videoEditedInfo5.roundVideo = true;
                videoEditedInfo5.file = f50Var2.D;
                videoEditedInfo5.encryptedFile = f50Var2.E;
                videoEditedInfo5.key = f50Var2.F;
                videoEditedInfo5.iv = f50Var2.G;
                videoEditedInfo5.framerate = 25;
                videoEditedInfo5.originalWidth = 360;
                videoEditedInfo5.resultWidth = 360;
                videoEditedInfo5.originalHeight = 360;
                videoEditedInfo5.resultHeight = 360;
                videoEditedInfo5.originalPath = e50Var.a.getAbsolutePath();
                VideoEditedInfo videoEditedInfo6 = f50Var2.J;
                if (i9 != 1) {
                    e50Var.h(e50Var.a);
                    videoEditedInfo6.estimatedDuration = f50Var2.b0;
                    NotificationCenter.getInstance(i30).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioDidSent, Integer.valueOf(f50Var2.M), videoEditedInfo6, e50Var.a.getAbsolutePath(), e50Var.w0);
                    return;
                }
                if (x40Var.c()) {
                    Activity parentActivity = x40Var.getParentActivity();
                    long a2 = x40Var.a();
                    androidx.car.app.utils.a aVar = new androidx.car.app.utils.a(e50Var, z40Var, videoEditedInfo6, 29);
                    org.telegram.ui.Components.b50 b50Var = new org.telegram.ui.Components.b50(e50Var, 0);
                    org.telegram.ui.ActionBar.b6 b6Var = f50Var2.L0;
                    Pattern pattern = org.telegram.ui.Components.y4.a;
                    org.telegram.ui.Components.y4.K(parentActivity, a2, -1L, 0, false, aVar, b50Var, new org.telegram.ui.Components.w4(b6Var), b6Var);
                } else {
                    MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, e50Var.a.getAbsolutePath(), 0, true, 0, 0, 0L);
                    if (z40Var != null) {
                        photoEntry.ttl = z40Var.c;
                        photoEntry.effectId = z40Var.d;
                    }
                    f50Var2.c.r(photoEntry, videoEditedInfo6, z40Var == null || z40Var.a, z40Var != null ? z40Var.b : 0, 0, false, z40Var != null ? z40Var.e : j10);
                }
                f50Var2.J = null;
                return;
            case 9:
                org.telegram.ui.Components.ui0 ui0Var = (org.telegram.ui.Components.ui0) this.c;
                int i31 = this.b;
                TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) this.d;
                int i32 = ui0Var.f;
                TextView textView = ui0Var.b;
                MessageObject messageObject3 = ui0Var.s;
                ImageView imageView = ui0Var.d;
                org.telegram.ui.Components.o9 o9Var = ui0Var.e;
                ArrayList arrayList5 = ui0Var.r;
                ArrayList arrayList6 = ui0Var.n;
                if (arrayList6.isEmpty() || arrayList6.size() < i31) {
                    formatPluralString = LocaleController.formatPluralString("ReactionsCount", i31, new Object[0]);
                } else {
                    formatPluralString = String.format(LocaleController.getPluralString("Reacted", i31), i31 == arrayList6.size() ? String.valueOf(i31) : i31 + "/" + arrayList6.size());
                }
                if (ui0Var.getMeasuredWidth() > 0) {
                    ui0Var.v = ui0Var.getMeasuredWidth();
                }
                textView.setText(formatPluralString);
                TLRPC.TL_messageReactions tL_messageReactions = messageObject3.messageOwner.reactions;
                if (tL_messageReactions != null && tL_messageReactions.results.size() == 1 && !tL_messages_messageReactionsList.reactions.isEmpty()) {
                    for (TLRPC.TL_availableReaction tL_availableReaction : MediaDataController.getInstance(i32).getReactionsList()) {
                        if (tL_availableReaction.reaction.equals(tL_messages_messageReactionsList.reactions.get(0).reaction)) {
                            arrayList = arrayList5;
                            o9Var.i(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", "webp", null, tL_availableReaction);
                            o9Var.setVisibility(0);
                            o9Var.setAlpha(0.0f);
                            o9Var.animate().alpha(1.0f).start();
                            imageView.setVisibility(8);
                            ArrayList<TLRPC.User> arrayList7 = tL_messages_messageReactionsList.users;
                            size = arrayList7.size();
                            i10 = 0;
                            while (i10 < size) {
                                TLRPC.User user = arrayList7.get(i10);
                                int i33 = i10 + 1;
                                TLRPC.User user2 = user;
                                TLRPC.Peer peer = messageObject3.messageOwner.from_id;
                                if (peer != null) {
                                    i14 = i33;
                                    if (user2.id != peer.user_id) {
                                        int i34 = 0;
                                        while (true) {
                                            if (i34 < arrayList.size()) {
                                                i13 = size;
                                                int i35 = i34;
                                                if (((org.telegram.ui.Components.ti0) arrayList.get(i34)).b == user2.id) {
                                                    break;
                                                }
                                                i34 = i35 + 1;
                                                size = i13;
                                            } else {
                                                i13 = size;
                                                arrayList.add(new org.telegram.ui.Components.ti0(0, user2));
                                            }
                                        }
                                    } else {
                                        i13 = size;
                                    }
                                } else {
                                    i13 = size;
                                    i14 = i33;
                                }
                                size = i13;
                                i10 = i14;
                            }
                            ArrayList<TLRPC.Chat> arrayList8 = tL_messages_messageReactionsList.chats;
                            size2 = arrayList8.size();
                            i11 = 0;
                            while (i11 < size2) {
                                TLRPC.Chat chat2 = arrayList8.get(i11);
                                i11++;
                                TLRPC.Chat chat3 = chat2;
                                TLRPC.Peer peer2 = messageObject3.messageOwner.from_id;
                                if (peer2 != null && chat3.id != peer2.user_id) {
                                    int i36 = 0;
                                    while (true) {
                                        if (i36 >= arrayList.size()) {
                                            arrayList.add(new org.telegram.ui.Components.ti0(0, chat3));
                                        } else if (((org.telegram.ui.Components.ti0) arrayList.get(i36)).b == (-chat3.id)) {
                                            break;
                                        } else {
                                            i36++;
                                        }
                                    }
                                }
                            }
                            org.telegram.ui.Components.e00 e00Var = ui0Var.a;
                            org.telegram.ui.Components.c9 c9Var = ui0Var.c;
                            ui0Var.setEnabled(arrayList.size() <= 0);
                            for (i12 = 0; i12 < 3; i12++) {
                                if (i12 < arrayList.size()) {
                                    c9Var.b(i12, ((org.telegram.ui.Components.ti0) arrayList.get(i12)).a, i32);
                                } else {
                                    c9Var.b(i12, null, i32);
                                }
                            }
                            size3 = arrayList.size();
                            if (size3 != 1) {
                                dp = AndroidUtilities.dp(24.0f);
                            } else {
                                if (size3 != 2) {
                                    f10 = 0.0f;
                                    if (LocaleController.isRTL) {
                                        f10 = AndroidUtilities.dp(12.0f);
                                    }
                                    c9Var.setTranslationX(f10);
                                    c9Var.a(false);
                                    textView.animate().alpha(1.0f).setDuration(220L).start();
                                    c9Var.animate().alpha(1.0f).setDuration(220L).start();
                                    e00Var.animate().alpha(0.0f).setDuration(220L).setListener(new org.telegram.ui.Components.u9(e00Var)).start();
                                    return;
                                }
                                dp = AndroidUtilities.dp(12.0f);
                            }
                            f10 = dp;
                            if (LocaleController.isRTL) {
                            }
                            c9Var.setTranslationX(f10);
                            c9Var.a(false);
                            textView.animate().alpha(1.0f).setDuration(220L).start();
                            c9Var.animate().alpha(1.0f).setDuration(220L).start();
                            e00Var.animate().alpha(0.0f).setDuration(220L).setListener(new org.telegram.ui.Components.u9(e00Var)).start();
                            return;
                        }
                    }
                }
                arrayList = arrayList5;
                imageView.setVisibility(0);
                imageView.setAlpha(0.0f);
                imageView.animate().alpha(1.0f).start();
                ArrayList<TLRPC.User> arrayList72 = tL_messages_messageReactionsList.users;
                size = arrayList72.size();
                i10 = 0;
                while (i10 < size) {
                }
                ArrayList<TLRPC.Chat> arrayList82 = tL_messages_messageReactionsList.chats;
                size2 = arrayList82.size();
                i11 = 0;
                while (i11 < size2) {
                }
                org.telegram.ui.Components.e00 e00Var2 = ui0Var.a;
                org.telegram.ui.Components.c9 c9Var2 = ui0Var.c;
                ui0Var.setEnabled(arrayList.size() <= 0);
                while (i12 < 3) {
                }
                size3 = arrayList.size();
                if (size3 != 1) {
                }
                f10 = dp;
                if (LocaleController.isRTL) {
                }
                c9Var2.setTranslationX(f10);
                c9Var2.a(false);
                textView.animate().alpha(1.0f).setDuration(220L).start();
                c9Var2.animate().alpha(1.0f).setDuration(220L).start();
                e00Var2.animate().alpha(0.0f).setDuration(220L).setListener(new org.telegram.ui.Components.u9(e00Var2)).start();
                return;
            case 10:
                org.telegram.ui.Components.np0 np0Var = (org.telegram.ui.Components.np0) this.c;
                int i37 = this.b;
                ArrayList arrayList9 = (ArrayList) this.d;
                org.telegram.ui.Components.lp0 lp0Var = np0Var.e;
                org.telegram.ui.Components.rp0 rp0Var = np0Var.G;
                if (i37 != np0Var.r) {
                    return;
                }
                np0Var.h();
                np0Var.E = false;
                np0Var.v = i37;
                if (np0Var.s != i37) {
                    lp0Var.b();
                }
                org.telegram.ui.Components.so0 so0Var = rp0Var.B;
                org.telegram.ui.Components.np0 np0Var2 = rp0Var.I;
                if (so0Var.getAdapter() != np0Var2) {
                    org.telegram.ui.Components.rp0.E0(rp0Var);
                    np0Var2.l();
                }
                for (int i38 = 0; i38 < arrayList9.size(); i38++) {
                    TLObject tLObject2 = ((org.telegram.ui.Components.fp0) arrayList9.get(i38)).b;
                    if (tLObject2 instanceof TLRPC.User) {
                        i16 = ((org.telegram.ui.ActionBar.f3) rp0Var).currentAccount;
                        MessagesController.getInstance(i16).putUser((TLRPC.User) tLObject2, true);
                    } else if (tLObject2 instanceof TLRPC.Chat) {
                        i15 = ((org.telegram.ui.ActionBar.f3) rp0Var).currentAccount;
                        MessagesController.getInstance(i15).putChat((TLRPC.Chat) tLObject2, true);
                    }
                }
                boolean z11 = !np0Var.d.isEmpty() && arrayList9.isEmpty();
                if (np0Var.d.isEmpty()) {
                    arrayList9.isEmpty();
                }
                if (z11) {
                    org.telegram.ui.Components.rp0.E0(rp0Var);
                }
                np0Var.d = arrayList9;
                lp0Var.f(arrayList9, null);
                int i39 = np0Var.F;
                if (np0Var.h() != 0 || lp0Var.e() || np0Var.E) {
                    rp0Var.t0.b(i39);
                } else {
                    rp0Var.M.e(false, true);
                }
                np0Var.l();
                rp0Var.K0(true);
                return;
            case 11:
                r0.getStoriesController().c(this.b, ((org.telegram.ui.Components.eu0) this.c).f1, (TL_stories.StoryItem) this.d);
                return;
            case 12:
                org.telegram.ui.Components.eu0 eu0Var = (org.telegram.ui.Components.eu0) this.c;
                int i40 = this.b;
                org.telegram.ui.Components.x60 x60Var = (org.telegram.ui.Components.x60) this.d;
                eu0Var.d1(i40);
                x60Var.u();
                return;
            case 13:
                org.telegram.ui.Components.eu0 eu0Var2 = (org.telegram.ui.Components.eu0) this.c;
                eu0Var2.S(this.b, (org.telegram.ui.Components.wk0) this.d, false);
                eu0Var2.F1 = null;
                return;
            case 14:
                org.telegram.ui.Components.is0 is0Var = (org.telegram.ui.Components.is0) this.c;
                int i41 = this.b;
                org.telegram.ui.Components.x60 x60Var2 = (org.telegram.ui.Components.x60) this.d;
                is0Var.d.c1(i41, false);
                x60Var2.u();
                return;
            case 15:
                org.telegram.ui.ActionBar.o2 o2Var3 = (org.telegram.ui.ActionBar.o2) this.c;
                a0.h hVar3 = (a0.h) this.d;
                int i42 = this.b;
                if (o2Var3 instanceof qn) {
                    qn qnVar2 = (qn) o2Var3;
                    qnVar2.Q7();
                    undoView3 = qnVar2.u3;
                } else if (o2Var3 instanceof ProfileActivity) {
                    undoView3 = ((ProfileActivity) o2Var3).I;
                }
                UndoView undoView5 = undoView3;
                if (undoView5 != null) {
                    if (hVar3.m() == 1) {
                        undoView5.m(((TLRPC.Dialog) hVar3.n(0)).id, Integer.valueOf(i42), 53);
                        return;
                    } else {
                        undoView5.k(0L, 53, Integer.valueOf(i42), Integer.valueOf(hVar3.m()), null, null);
                        return;
                    }
                }
                return;
            case 16:
                org.telegram.ui.Components.pt0 pt0Var = (org.telegram.ui.Components.pt0) this.c;
                int i43 = this.b;
                TLRPC.TL_messages_search tL_messages_search = (TLRPC.TL_messages_search) this.d;
                if (i43 != pt0Var.A) {
                    return;
                }
                pt0Var.y = ConnectionsManager.getInstance(pt0Var.d).sendRequest(tL_messages_search, new gh.u1(pt0Var, i43, i17));
                return;
            case 17:
                org.telegram.ui.Components.pt0 pt0Var2 = (org.telegram.ui.Components.pt0) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                int i44 = this.b;
                ArrayList arrayList10 = pt0Var2.h;
                int i45 = pt0Var2.d;
                if ((tLObject3 instanceof TLRPC.messages_Messages) && i44 == pt0Var2.A) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject3;
                    MessagesController.getInstance(i45).putUsers(messages_messages.users, false);
                    MessagesController.getInstance(i45).putChats(messages_messages.chats, false);
                    MessagesStorage.getInstance(i45).putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                    for (int i46 = 0; i46 < messages_messages.messages.size(); i46++) {
                        MessageObject messageObject4 = new MessageObject(i45, messages_messages.messages.get(i46), false, true);
                        if (messageObject4.hasValidGroupId()) {
                            messageObject4.isPrimaryGroupMessage = true;
                        }
                        messageObject4.setQuery(pt0Var2.w);
                        arrayList10.add(messageObject4);
                    }
                    pt0Var2.v = messages_messages.count;
                    if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                        pt0Var2.s = arrayList10.size() >= messages_messages.count;
                    } else if (messages_messages instanceof TLRPC.TL_messages_messages) {
                        pt0Var2.s = true;
                    }
                    pt0Var2.G(false);
                    pt0Var2.r = false;
                    pt0Var2.y = -1;
                    return;
                }
                return;
            case 18:
                org.telegram.ui.Components.fv0 fv0Var = (org.telegram.ui.Components.fv0) this.c;
                int i47 = this.b;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.d;
                fv0Var.U0 = false;
                if (!fv0Var.R0 && fv0Var.S0) {
                    fv0Var.A(true);
                    return;
                }
                fv0Var.j0 = fv0Var.b1[0];
                fv0Var.j();
                DownloadController.getInstance(i47).removeLoadingFileObserver(t1Var);
                fv0Var.G();
                fv0Var.v();
                return;
            case 19:
                int i48 = this.b;
                TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) this.c;
                Integer num = (Integer) this.d;
                try {
                    SQLiteDatabase database = MessagesStorage.getInstance(i48).getDatabase();
                    if (database != null) {
                        if (tL_messages_emojiGroups == null) {
                            database.executeFast("DELETE FROM emoji_groups WHERE type = " + num).stepThis().dispose();
                        } else {
                            SQLitePreparedStatement executeFast = database.executeFast("REPLACE INTO emoji_groups VALUES(?, ?)");
                            executeFast.requery();
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_messages_emojiGroups.getObjectSize());
                            tL_messages_emojiGroups.serializeToStream(nativeByteBuffer);
                            executeFast.bindInteger(1, num.intValue());
                            executeFast.bindByteBuffer(2, nativeByteBuffer);
                            executeFast.step();
                            nativeByteBuffer.reuse();
                            executeFast.dispose();
                        }
                    }
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 20:
                int i49 = this.b;
                Integer num2 = (Integer) this.c;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.d;
                try {
                    try {
                        SQLiteDatabase database2 = MessagesStorage.getInstance(i49).getDatabase();
                        if (database2 != null) {
                            sQLiteCursor = database2.queryFinalized("SELECT data FROM emoji_groups WHERE type = ?", num2);
                            try {
                                if (!sQLiteCursor.next() || (byteBufferValue = sQLiteCursor.byteBufferValue(0)) == null) {
                                    messages_emojigroups = null;
                                } else {
                                    messages_emojigroups = TLRPC.messages_EmojiGroups.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), true);
                                    byteBufferValue.reuse();
                                }
                                if (messages_emojigroups instanceof TLRPC.TL_messages_emojiGroups) {
                                    callback2.run(Long.valueOf(r5.hash), (TLRPC.TL_messages_emojiGroups) messages_emojigroups);
                                } else {
                                    callback2.run(0L, null);
                                }
                                sQLiteCursor2 = sQLiteCursor;
                            } catch (Exception e11) {
                                e = e11;
                                FileLog.e(e);
                                callback2.run(0L, null);
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                    return;
                                }
                                return;
                            }
                        }
                        if (sQLiteCursor2 != null) {
                            sQLiteCursor2.dispose();
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        th = th;
                        sQLiteCursor3 = num2;
                        if (sQLiteCursor3 != 0) {
                            sQLiteCursor3.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e12) {
                    e = e12;
                    sQLiteCursor = null;
                } catch (Throwable th2) {
                    th = th2;
                    if (sQLiteCursor3 != 0) {
                    }
                    throw th;
                }
                break;
            case 21:
                org.telegram.ui.Components.pw0 pw0Var = (org.telegram.ui.Components.pw0) this.c;
                a0.h hVar4 = (a0.h) this.d;
                int i50 = this.b;
                org.telegram.ui.ActionBar.o2 o2Var4 = pw0Var.X0.H;
                if (o2Var4 instanceof qn) {
                    qn qnVar3 = (qn) o2Var4;
                    qnVar3.Q7();
                    undoView4 = qnVar3.u3;
                } else if (o2Var4 instanceof ProfileActivity) {
                    undoView4 = ((ProfileActivity) o2Var4).I;
                }
                UndoView undoView6 = undoView4;
                if (undoView6 != null) {
                    if (hVar4.m() == 1) {
                        undoView6.m(((TLRPC.Dialog) hVar4.n(0)).id, Integer.valueOf(i50), 53);
                        return;
                    } else {
                        undoView6.k(0L, 53, Integer.valueOf(i50), Integer.valueOf(hVar4.m()), null, null);
                        return;
                    }
                }
                return;
            case 22:
                org.telegram.ui.Components.ux0 ux0Var = (org.telegram.ui.Components.ux0) this.c;
                String str3 = (String) this.d;
                int i51 = this.b;
                ArrayList<MediaDataController.KeywordResult> arrayList11 = new ArrayList<>(1);
                arrayList11.add(new MediaDataController.KeywordResult(str3, null));
                MediaDataController.getInstance(ux0Var.a).fillWithAnimatedEmoji(arrayList11, 15, false, false, false, new c3.d(ux0Var, i51, str3, arrayList11, 28));
                return;
            case 23:
                org.telegram.ui.Components.r01 r01Var = (org.telegram.ui.Components.r01) this.c;
                String str4 = (String) this.d;
                int i52 = this.b;
                org.telegram.ui.Components.q01 q01Var = r01Var.r.n;
                try {
                    String lowerCase = str4.trim().toLowerCase();
                    if (lowerCase.length() == 0) {
                        r01Var.d = -1;
                        AndroidUtilities.runOnUIThread(new c3.d(r01Var, r01Var.d, new ArrayList(), new ArrayList(), 29));
                        return;
                    }
                    String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                    if (!lowerCase.equals(translitString) && translitString.length() != 0) {
                        str = translitString;
                        break;
                    }
                    int i53 = 0;
                    int i54 = i53 + 1;
                    String[] strArr = new String[i54];
                    strArr[0] = lowerCase;
                    if (str != null) {
                        strArr[1] = str;
                    }
                    ArrayList arrayList12 = new ArrayList();
                    ArrayList arrayList13 = new ArrayList();
                    int size5 = q01Var.d.size();
                    for (int i55 = 0; i55 < size5; i55++) {
                        ArrayList arrayList14 = (ArrayList) q01Var.d.get(i55);
                        String i56 = org.telegram.ui.ActionBar.e5.i(((org.telegram.ui.ActionBar.h6) arrayList14.get(0)).f);
                        String lowerCase2 = i56.toLowerCase();
                        int i57 = 0;
                        while (true) {
                            if (i57 < i54) {
                                String str5 = strArr[i57];
                                if (lowerCase2.contains(str5)) {
                                    arrayList12.add(arrayList14);
                                    arrayList13.add(org.telegram.ui.Components.r01.E(i56, str5));
                                } else {
                                    i57++;
                                }
                            }
                        }
                    }
                    AndroidUtilities.runOnUIThread(new c3.d(r01Var, i52, arrayList12, arrayList13, 29));
                    return;
                } catch (Exception e13) {
                    FileLog.e(e13);
                    return;
                }
            case 24:
                a();
                return;
            case 25:
                b();
                return;
            case 26:
                c();
                return;
            case 27:
                e();
                return;
            case 28:
                f();
                return;
            default:
                LaunchActivity launchActivity = (LaunchActivity) this.c;
                TLRPC.TL_help_appUpdate tL_help_appUpdate = (TLRPC.TL_help_appUpdate) this.d;
                int i58 = this.b;
                Pattern pattern2 = LaunchActivity.x1;
                TLRPC.TL_help_appUpdate tL_help_appUpdate2 = SharedConfig.pendingAppUpdate;
                if ((tL_help_appUpdate2 == null || !tL_help_appUpdate2.version.equals(tL_help_appUpdate.version)) && SharedConfig.setNewAppVersionAvailable(tL_help_appUpdate)) {
                    if (tL_help_appUpdate.can_not_skip) {
                        launchActivity.I0(i58, tL_help_appUpdate, false);
                    } else if (ApplicationLoader.isStandaloneBuild() || BuildVars.DEBUG_VERSION) {
                        ApplicationLoader.applicationLoaderInstance.showUpdateAppPopup(launchActivity, tL_help_appUpdate, i58);
                    }
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.appUpdateAvailable, new Object[0]);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ rl(Object obj, int i9, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i9;
        this.d = obj2;
    }

    public /* synthetic */ rl(Object obj, Object obj2, int i9, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = i9;
    }
}
