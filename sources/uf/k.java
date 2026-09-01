package uf;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import k7.c6;
import oh.c7;
import oh.t6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.a9;
import org.telegram.ui.Cells.b3;
import org.telegram.ui.Cells.d7;
import org.telegram.ui.Cells.h6;
import org.telegram.ui.Cells.m2;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Cells.n2;
import org.telegram.ui.Cells.o8;
import org.telegram.ui.Cells.q6;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Cells.s2;
import org.telegram.ui.Cells.u3;
import org.telegram.ui.Cells.v2;
import org.telegram.ui.Cells.va;
import org.telegram.ui.Cells.w2;
import org.telegram.ui.Cells.x2;
import org.telegram.ui.Cells.z2;
import org.telegram.ui.Cells.z6;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.jt;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.q30;
import org.telegram.ui.Components.ri0;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.v01;
import org.telegram.ui.Components.z8;
import org.telegram.ui.c51;
import org.telegram.ui.ky;
import org.telegram.ui.ly;
import org.telegram.ui.oy;
import org.telegram.ui.py;
import org.telegram.ui.sj0;
import org.telegram.ui.yh;
import org.telegram.ui.yx0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public class k extends sl0 implements n2 {
    public static final boolean Z = BuildVars.DEBUG_PRIVATE_VERSION;
    public boolean B;
    public final int C;
    public boolean D;
    public boolean E;
    public long F;
    public boolean G;
    public tl0 H;
    public ri0 I;
    public Drawable L;
    public final h M;
    public boolean N;
    public final py O;
    public boolean P;
    public final TLRPC.RequestPeerType Q;
    public boolean R;
    public final long S;
    public boolean W;
    public boolean X;
    public final Context c;
    public ArrayList d;
    public boolean e;
    public int f;
    public int h;
    public boolean n;
    public final int r;
    public long s;
    public int v;
    public final boolean w;
    public final ArrayList x;
    public boolean y;
    public ArrayList J = new ArrayList();
    public ArrayList K = new ArrayList();
    public int T = 10;
    public final LongSparseIntArray U = new LongSparseIntArray();
    public final HashMap V = new HashMap();
    public int Y = -1;

    public k(py pyVar, Context context, int i10, int i11, boolean z4, ArrayList arrayList, int i12, TLRPC.RequestPeerType requestPeerType) {
        this.c = context;
        this.O = pyVar;
        this.h = i10;
        this.r = i11;
        this.w = z4;
        this.y = i11 == 0 && i10 == 0 && !z4;
        this.x = arrayList;
        this.C = i12;
        this.S = pyVar.U2;
        if (i11 == 0) {
            h hVar = new h();
            hVar.a = new HashSet();
            hVar.b = new HashSet();
            hVar.c = new HashSet();
            hVar.d = new ArrayList();
            hVar.e = new sj0(hVar, 18);
            this.M = hVar;
        }
        this.Q = requestPeerType;
    }

    @Override // org.telegram.ui.Components.sl0
    public final boolean D(f2.m1 m1Var) {
        int i10 = m1Var.f;
        return (i10 == 1 || i10 == 5 || i10 == 3 || i10 == 8 || i10 == 7 || i10 == 10 || i10 == 11 || i10 == 13 || i10 == 15 || i10 == 16 || i10 == 18 || i10 == 19 || i10 == 20) ? false : true;
    }

    public final int E() {
        int i10 = this.h;
        int i11 = this.r;
        if (i10 == 7 || i10 == 8) {
            return MessagesController.getInstance(this.C).isDialogsEndReached(i11) ? 2 : 3;
        }
        if (i11 == 1) {
            return 2;
        }
        return this.d != null ? 1 : 0;
    }

    public final int F(long j10) {
        for (int i10 = 0; i10 < this.J.size(); i10++) {
            if (((i) this.J.get(i10)).c != null && ((i) this.J.get(i10)).c.id == j10) {
                return i10;
            }
        }
        return -1;
    }

    public final int G(int i10) {
        if (this.B) {
            i10--;
        }
        if (this.y) {
            i10 = yh.e(2, i10, MessagesController.getInstance(this.C).hintDialogs);
        }
        if (this.n && this.h == 3) {
            i10--;
        }
        int i11 = this.h;
        return (i11 == 11 || i11 == 13) ? i10 - 2 : i11 == 12 ? i10 - 1 : i10;
    }

    public final MessagesController.DialogFilter H() {
        int i10 = this.h;
        if (i10 == 7 || i10 == 8) {
            return MessagesController.getInstance(this.C).selectedDialogFilter[this.h - 7];
        }
        return null;
    }

    public final Object I(int i10) {
        if (i10 >= 0 && i10 < this.J.size()) {
            i iVar = (i) this.J.get(i10);
            String str = iVar.l;
            TLRPC.TL_contact tL_contact = iVar.e;
            if (str != null) {
                return str;
            }
            TLRPC.Chat chat = iVar.m;
            if (chat != null) {
                return chat;
            }
            TLRPC.User user = iVar.n;
            if (user != null) {
                return user;
            }
            TLRPC.Dialog dialog = iVar.c;
            if (dialog != null) {
                return dialog;
            }
            if (tL_contact != null) {
                return MessagesController.getInstance(this.C).getUser(Long.valueOf(tL_contact.user_id));
            }
            TLRPC.RecentMeUrl recentMeUrl = iVar.d;
            if (recentMeUrl != null) {
                return recentMeUrl;
            }
        }
        return null;
    }

    public final void M(boolean z4) {
        this.n = z4;
    }

    public final void N(ri0 ri0Var) {
        this.I = ri0Var;
    }

    public final void O(tl0 tl0Var, boolean z4) {
        this.G = z4;
        for (int i10 = 0; i10 < tl0Var.getChildCount(); i10++) {
            if (tl0Var.getChildAt(i10) instanceof r2) {
                ((r2) tl0Var.getChildAt(i10)).f = z4;
            }
        }
        for (int i11 = 0; i11 < tl0Var.getCachedChildCount(); i11++) {
            if (tl0Var.P(i11) instanceof r2) {
                ((r2) tl0Var.P(i11)).f = z4;
            }
        }
        for (int i12 = 0; i12 < tl0Var.getHiddenChildCount(); i12++) {
            if (tl0Var.V(i12) instanceof r2) {
                ((r2) tl0Var.V(i12)).f = z4;
            }
        }
        for (int i13 = 0; i13 < tl0Var.getAttachedScrapChildCount(); i13++) {
            if (tl0Var.O(i13) instanceof r2) {
                ((r2) tl0Var.O(i13)).f = z4;
            }
        }
    }

    public final void P(boolean z4) {
        this.N = z4;
    }

    public final void Q(long j10) {
        this.s = j10;
    }

    public final void R(ly lyVar) {
        this.H = lyVar;
    }

    public boolean S() {
        return false;
    }

    public final void T(boolean z4) {
        int i10 = this.C;
        if (this.d != null) {
            if (!z4 || SystemClock.elapsedRealtime() - this.F >= 2000) {
                this.F = SystemClock.elapsedRealtime();
                try {
                    int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
                    Collections.sort(this.d, new q30(MessagesController.getInstance(i10), currentTime, 2));
                    if (z4) {
                        l();
                    }
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
            }
        }
    }

    public final void U() {
        this.y = this.r == 0 && this.h == 0 && !this.w && !MessagesController.getInstance(this.C).hintDialogs.isEmpty();
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x047d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0269  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V() {
        ArrayList R3;
        long j10;
        TLRPC.Dialog dialog;
        boolean z4;
        int i10;
        TL_chatlists.TL_chatlists_chatlistUpdates chatlistFolderUpdates;
        TLRPC.RequestPeerType requestPeerType;
        int i11;
        int i12;
        boolean z10;
        TLRPC.Dialog dialog2;
        int i13;
        TLRPC.Dialog dialog3;
        ArrayList<MessagesController.CommunityPeerDialog> arrayList;
        String string;
        int i14 = this.C;
        long j11 = this.S;
        if (j11 != 0) {
            this.J.clear();
            U();
            MessagesController.CommunityPeersDialog buildCommunityPeers = MessagesController.getInstance(i14).buildCommunityPeers(j11);
            this.f = buildCommunityPeers.getDialogsCount();
            this.R = false;
            int i15 = this.h == 3 ? 2 : 4;
            for (int i16 = 0; i16 < i15; i16++) {
                if (i16 == 0) {
                    arrayList = buildCommunityPeers.chatsYouAreIn;
                    string = LocaleController.getString(R.string.CommunitySectionChatsYouAreIn);
                } else if (i16 == 1) {
                    arrayList = buildCommunityPeers.chatsYouCanView;
                    string = LocaleController.getString(R.string.CommunitySectionChatsYouCanView);
                } else if (i16 == 2) {
                    arrayList = buildCommunityPeers.chatsYouCanJoin;
                    string = LocaleController.getString(R.string.CommunitySectionChatsYouCanRequestToJoin);
                } else {
                    arrayList = buildCommunityPeers.chatsOther;
                    string = LocaleController.getString(R.string.CommunitySectionHiddenChats);
                }
                if (!arrayList.isEmpty()) {
                    this.J.add(new i(this, string));
                    for (int i17 = 0; i17 < arrayList.size(); i17++) {
                        MessagesController.CommunityPeerDialog communityPeerDialog = arrayList.get(i17);
                        TLRPC.Dialog dialog4 = communityPeerDialog.dialog;
                        if (dialog4 != null) {
                            this.J.add(new i(this, 0, dialog4));
                        } else {
                            TLRPC.Chat chat = communityPeerDialog.chat;
                            if (chat != null) {
                                this.J.add(new i(this, chat));
                            } else {
                                TLRPC.User user = communityPeerDialog.user;
                                if (user != null) {
                                    this.J.add(new i(this, user));
                                }
                            }
                        }
                    }
                }
            }
            return;
        }
        this.J.clear();
        U();
        MessagesController messagesController = MessagesController.getInstance(i14);
        int i18 = this.r;
        py pyVar = this.O;
        if (j11 != 0) {
            R3 = messagesController.getDialogsByCommunity(j11);
        } else {
            R3 = pyVar.R3(i14, this.h, i18, this.D);
            if (R3 == null) {
                R3 = new ArrayList();
            }
        }
        int size = R3.size();
        this.f = size;
        this.R = false;
        if (size == 0 && pyVar.e4()) {
            yh.y(this, 19, this.J);
            return;
        }
        if (this.y || this.h != 0 || i18 != 0 || !messagesController.isDialogsEndReached(i18) || this.e) {
            j10 = 0;
        } else if (messagesController.getAllFoldersDialogsCount() > 10 || !ContactsController.getInstance(i14).doneLoadingContacts || ContactsController.getInstance(i14).contacts.isEmpty()) {
            j10 = 0;
            this.d = null;
        } else {
            j10 = 0;
            this.d = new ArrayList(ContactsController.getInstance(i14).contacts);
            long j12 = UserConfig.getInstance(i14).clientUserId;
            int size2 = this.d.size();
            int i19 = 0;
            while (i19 < size2) {
                long j13 = ((TLRPC.TL_contact) this.d.get(i19)).user_id;
                if (j13 == j12 || messagesController.dialogs_dict.f(j13) != null) {
                    this.d.remove(i19);
                    i19--;
                    size2--;
                }
                i19++;
            }
            if (this.d.isEmpty()) {
                this.d = null;
            } else {
                T(false);
            }
        }
        MessagesController.DialogFilter H = H();
        if ((H == null || H.isDefault()) && pyVar != null && pyVar.K0 && pyVar.M0 != j10) {
            yh.y(this, 20, this.J);
            int i20 = 0;
            while (true) {
                if (i20 >= R3.size()) {
                    dialog = null;
                    break;
                } else {
                    if (R3.get(i20).id == pyVar.M0) {
                        dialog = R3.get(i20);
                        break;
                    }
                    i20++;
                }
            }
            if (dialog == null) {
                dialog = new TLRPC.TL_dialog();
                dialog.id = pyVar.M0;
            }
            this.J.add(new i(this, 0, dialog));
            yh.y(this, 20, this.J);
        } else if ((H == null || H.isDefault()) && pyVar != null && this.h == 3 && pyVar.N0 != j10) {
            yh.y(this, 20, this.J);
            int i21 = 0;
            while (true) {
                if (i21 >= R3.size()) {
                    dialog3 = null;
                    break;
                } else {
                    if (R3.get(i21).id == pyVar.N0) {
                        dialog3 = R3.get(i21);
                        break;
                    }
                    i21++;
                }
            }
            if (dialog3 == null) {
                dialog3 = new TLRPC.TL_dialog();
                dialog3.id = pyVar.N0;
            }
            z4 = false;
            this.J.add(new i(this, 0, dialog3));
            yh.y(this, 20, this.J);
            this.B = z4;
            i10 = this.h;
            if ((i10 != 7 || i10 == 8) && H != null && H.isChatlist()) {
                messagesController.checkChatlistFolderUpdate(H.id, false);
                chatlistFolderUpdates = messagesController.getChatlistFolderUpdates(H.id);
                if (chatlistFolderUpdates != null && chatlistFolderUpdates.missing_peers.size() > 0) {
                    this.B = true;
                    this.J.add(new i(this, chatlistFolderUpdates));
                }
            }
            requestPeerType = this.Q;
            if (requestPeerType != null) {
                yh.y(this, 15, this.J);
            }
            if (!this.G || this.P) {
                for (i11 = 0; i11 < R3.size(); i11++) {
                    if (this.h == 2 && (R3.get(i11) instanceof ky)) {
                        this.J.add(new i(this, 14, R3.get(i11)));
                    } else {
                        this.J.add(new i(this, 0, R3.get(i11)));
                    }
                }
                yh.y(this, 10, this.J);
            }
            if (this.f == 0 && this.e) {
                this.R = true;
                if (requestPeerType != null) {
                    yh.y(this, 16, this.J);
                } else {
                    this.J.add(new i(this, E(), 0));
                }
                yh.y(this, 8, this.J);
                yh.y(this, 7, this.J);
                yh.y(this, 13, this.J);
            } else {
                ArrayList arrayList2 = this.d;
                if (arrayList2 != null && !arrayList2.isEmpty() && (i12 = this.h) != 7 && i12 != 8) {
                    if (this.f == 0) {
                        this.R = true;
                        if (requestPeerType != null) {
                            yh.y(this, 16, this.J);
                        } else {
                            this.J.add(new i(this, E(), 0));
                        }
                        yh.y(this, 8, this.J);
                        yh.y(this, 7, this.J);
                    } else {
                        for (int i22 = 0; i22 < R3.size(); i22++) {
                            this.J.add(new i(this, 0, R3.get(i22)));
                        }
                        yh.y(this, 8, this.J);
                        yh.y(this, 7, this.J);
                    }
                    for (int i23 = 0; i23 < this.d.size(); i23++) {
                        this.J.add(new i(this, (TLRPC.TL_contact) this.d.get(i23)));
                    }
                    yh.y(this, 10, this.J);
                    z10 = true;
                    if ((!(requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) || (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat)) && this.f > 0) {
                        yh.y(this, 12, this.J);
                    }
                    if (this.n && this.h == 3) {
                        yh.y(this, 21, this.J);
                    }
                    if (!z10) {
                        for (int i24 = 0; i24 < R3.size(); i24++) {
                            if (this.h == 2 && (R3.get(i24) instanceof ky)) {
                                this.J.add(new i(this, 14, R3.get(i24)));
                            } else {
                                this.J.add(new i(this, 0, R3.get(i24)));
                            }
                        }
                        if (j11 != 0 || this.N || (i13 = this.h) == 7 || i13 == 8 || MessagesController.getInstance(i14).isDialogsEndReached(i18)) {
                            int i25 = this.f;
                            if (i25 == 0) {
                                this.R = true;
                                if (requestPeerType != null) {
                                    yh.y(this, 16, this.J);
                                } else {
                                    this.J.add(new i(this, E(), 0));
                                }
                            } else {
                                if (i18 == 0 && i25 > 10 && this.h == 0) {
                                    yh.y(this, 11, this.J);
                                }
                                yh.y(this, 10, this.J);
                            }
                        } else {
                            if (this.f != 0) {
                                yh.y(this, 1, this.J);
                            }
                            yh.y(this, 10, this.J);
                        }
                    }
                    if (messagesController.hiddenUndoChats.isEmpty()) {
                        int i26 = 0;
                        while (i26 < this.J.size()) {
                            i iVar = (i) this.J.get(i26);
                            if (iVar.a == 0 && (dialog2 = iVar.c) != null && messagesController.isHiddenByUndo(dialog2.id)) {
                                this.J.remove(i26);
                                i26--;
                            }
                            i26++;
                        }
                        return;
                    }
                    return;
                }
                if (this.y) {
                    int size3 = MessagesController.getInstance(i14).hintDialogs.size();
                    yh.y(this, 2, this.J);
                    for (int i27 = 0; i27 < size3; i27++) {
                        this.J.add(new i(this, MessagesController.getInstance(i14).hintDialogs.get(i27)));
                    }
                    yh.y(this, 3, this.J);
                } else {
                    int i28 = this.h;
                    if (i28 == 11 || i28 == 13) {
                        yh.y(this, 7, this.J);
                        yh.y(this, 12, this.J);
                    } else if (i28 == 12) {
                        yh.y(this, 7, this.J);
                    }
                }
            }
            z10 = false;
            if (!(requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast)) {
            }
            yh.y(this, 12, this.J);
            if (this.n) {
                yh.y(this, 21, this.J);
            }
            if (!z10) {
            }
            if (messagesController.hiddenUndoChats.isEmpty()) {
            }
        }
        z4 = false;
        this.B = z4;
        i10 = this.h;
        if (i10 != 7) {
        }
        messagesController.checkChatlistFolderUpdate(H.id, false);
        chatlistFolderUpdates = messagesController.getChatlistFolderUpdates(H.id);
        if (chatlistFolderUpdates != null) {
            this.B = true;
            this.J.add(new i(this, chatlistFolderUpdates));
        }
        requestPeerType = this.Q;
        if (requestPeerType != null) {
        }
        if (this.G) {
        }
        while (i11 < R3.size()) {
        }
        yh.y(this, 10, this.J);
    }

    public final void W(Runnable runnable) {
        if (this.W) {
            this.X = true;
            return;
        }
        this.W = true;
        ArrayList arrayList = new ArrayList();
        this.K = arrayList;
        arrayList.addAll(this.J);
        V();
        ArrayList arrayList2 = new ArrayList(this.J);
        ArrayList arrayList3 = this.K;
        this.J = arrayList3;
        cg.a aVar = new cg.a(this, arrayList2, 4);
        if (arrayList3.size() >= 50 && Z) {
            Utilities.searchQueue.postRunnable(new yx0(this, aVar, runnable, arrayList2, 22));
            return;
        }
        f2.m c3 = f2.q.c(aVar, true);
        this.W = false;
        if (runnable != null) {
            runnable.run();
        }
        this.J = arrayList2;
        c3.b(this);
    }

    @Override // org.telegram.ui.Cells.n2
    public final boolean b() {
        return this.x.isEmpty();
    }

    @Override // org.telegram.ui.Cells.n2
    public final void c() {
        t6 storiesController = MessagesController.getInstance(this.C).getStoriesController();
        ArrayList arrayList = storiesController.h;
        if (arrayList.isEmpty()) {
            return;
        }
        boolean z4 = storiesController.D(0, DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(0)).peer)) != 0;
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            long peerDialogId = DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(i10)).peer);
            if (!z4 || storiesController.D(0, peerDialogId) != 0) {
                arrayList2.add(Long.valueOf(peerDialogId));
            }
        }
        this.O.getOrCreateStoryViewer().F(this.c, null, arrayList2, 0, null, null, new c7(this.H, true), false);
    }

    @Override // org.telegram.ui.Cells.n2
    public final void e(r2 r2Var) {
        int i10 = this.C;
        MessagesController.getInstance(i10);
        if (MessagesController.getInstance(i10).getStoriesController().I(r2Var.getDialogId())) {
            py pyVar = this.O;
            pyVar.getOrCreateStoryViewer().getClass();
            pyVar.getOrCreateStoryViewer().D(pyVar.getParentActivity(), r2Var.getDialogId(), c7.a((tl0) r2Var.getParent()));
        }
    }

    @Override // org.telegram.ui.Cells.n2
    public final void f(r2 r2Var) {
        this.O.H4(r2Var);
    }

    @Override // f2.p0
    public final int h() {
        int size = this.J.size();
        this.v = size;
        return size;
    }

    @Override // f2.p0
    public final long i(int i10) {
        return ((i) this.J.get(i10)).k;
    }

    @Override // f2.p0
    public final int j(int i10) {
        return ((i) this.J.get(i10)).a;
    }

    @Override // f2.p0
    public void l() {
        if (this.W) {
            this.J = new ArrayList();
        }
        this.W = false;
        V();
        super.l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0630  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0626  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0602  */
    @Override // f2.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.m1 m1Var, int i10) {
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        String str;
        String str2;
        String userName;
        String formatPluralStringComma;
        TLRPC.Chat chat3;
        int i11;
        String string;
        int i12 = m1Var.f;
        View view = m1Var.a;
        int i13 = this.C;
        py pyVar = this.O;
        if (i12 == 0) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) I(i10);
            Object I = I(i10 + 1);
            TLRPC.Dialog dialog2 = I instanceof TLRPC.Dialog ? (TLRPC.Dialog) I : null;
            int i14 = this.h;
            ArrayList arrayList = this.x;
            if (i14 == 2 || i14 == 15) {
                h6 h6Var = (h6) view;
                long dialogId = h6Var.getDialogId();
                if (dialog.id != 0) {
                    chat = MessagesController.getInstance(i13).getChat(Long.valueOf(-dialog.id));
                    if (chat != null && chat.migrated_to != null && (chat3 = MessagesController.getInstance(i13).getChat(Long.valueOf(chat.migrated_to.channel_id))) != null) {
                        chat = chat3;
                    }
                } else {
                    chat = null;
                }
                if (chat != null) {
                    userName = chat.title;
                    if (!ChatObject.isChannel(chat) || chat.megagroup) {
                        int i15 = chat.participants_count;
                        formatPluralStringComma = i15 != 0 ? LocaleController.formatPluralStringComma("Members", i15) : chat.has_geo ? LocaleController.getString(R.string.MegaLocation) : !ChatObject.isPublic(chat) ? LocaleController.getString(R.string.MegaPrivate).toLowerCase() : LocaleController.getString(R.string.MegaPublic).toLowerCase();
                    } else {
                        int i16 = chat.participants_count;
                        formatPluralStringComma = i16 != 0 ? LocaleController.formatPluralStringComma("Subscribers", i16) : !ChatObject.isPublic(chat) ? LocaleController.getString(R.string.ChannelPrivate).toLowerCase() : LocaleController.getString(R.string.ChannelPublic).toLowerCase();
                    }
                    str2 = formatPluralStringComma;
                    chat2 = chat;
                } else {
                    TLRPC.User user = MessagesController.getInstance(i13).getUser(Long.valueOf(dialog.id));
                    if (user == 0) {
                        chat2 = null;
                        str = null;
                        str2 = "";
                        h6Var.J = dialog2 == null;
                        h6Var.t(chat2, null, str, str2, false, false);
                        h6Var.s(arrayList.contains(Long.valueOf(h6Var.getDialogId())), dialogId == h6Var.getDialogId());
                        if (i10 >= this.f + 1) {
                            view.setAlpha(1.0f);
                            return;
                        }
                        return;
                    }
                    userName = UserObject.getUserName(user);
                    if (UserObject.isReplyUser(user)) {
                        chat2 = user;
                        str2 = "";
                    } else {
                        chat2 = user;
                        str2 = user.bot ? LocaleController.getString(R.string.Bot) : LocaleController.formatUserStatus(i13, user);
                    }
                }
                str = userName;
                h6Var.J = dialog2 == null;
                h6Var.t(chat2, null, str, str2, false, false);
                h6Var.s(arrayList.contains(Long.valueOf(h6Var.getDialogId())), dialogId == h6Var.getDialogId());
                if (i10 >= this.f + 1) {
                }
            } else {
                r2 r2Var = (r2) view;
                r2Var.N0 = this.S != 0 && ChatObject.isHiddenInCommunity(i13, dialog.id);
                r2Var.p2 = false;
                r2Var.q2 = false;
                if (this.h == 0 && AndroidUtilities.isTablet()) {
                    r2Var.setDialogSelected(dialog.id == this.s);
                }
                r2Var.V(arrayList.contains(Long.valueOf(dialog.id)), false);
                if (i10 == 1 && pyVar != null && pyVar.K0 && pyVar.M0 != 0 && dialog.top_message == 0) {
                    MessagesController.DialogFilter H = H();
                    if (H == null || H.isDefault()) {
                        r2Var.setCustomMessage(DialogObject.getStatus(pyVar.M0));
                    } else {
                        r2Var.setCustomMessage(null);
                    }
                } else if (i10 == 1 && pyVar != null && this.h == 3 && pyVar.N0 != 0 && dialog.top_message == 0) {
                    MessagesController.DialogFilter H2 = H();
                    if (H2 == null || H2.isDefault()) {
                        r2Var.setCustomMessage(DialogObject.getStatus(pyVar.N0));
                    } else {
                        r2Var.setCustomMessage(null);
                    }
                } else {
                    r2Var.setCustomMessage(null);
                }
                r2Var.X(dialog, this.h, this.r);
                if (r2Var.getMeasuredHeight() > 0 && r2Var.getMeasuredHeight() != r2Var.y()) {
                    r2Var.requestLayout();
                }
                boolean z4 = r2Var.f;
                boolean z10 = this.G;
                if (z4 != z10) {
                    r2Var.f = z10;
                    r2Var.requestLayout();
                }
                h hVar = this.M;
                if (hVar != null && i10 < 10) {
                    long j10 = dialog.id;
                    ArrayList arrayList2 = hVar.d;
                    if (!hVar.a.contains(Long.valueOf(j10)) && !hVar.b.contains(Long.valueOf(j10)) && !hVar.c.contains(Long.valueOf(j10)) && !arrayList2.contains(Long.valueOf(j10))) {
                        arrayList2.add(Long.valueOf(j10));
                    }
                }
            }
        } else if (i12 == 4) {
            ((s2) view).setRecentMeUrl((TLRPC.RecentMeUrl) I(i10));
        } else if (i12 == 5) {
            x2 x2Var = (x2) view;
            int i17 = this.Y;
            int E = E();
            this.Y = E;
            v01 v01Var = x2Var.n;
            TextView textView = x2Var.h;
            lj0 lj0Var = x2Var.f;
            if (x2Var.r != E) {
                x2Var.r = E;
                if (E == 0 || E == 1) {
                    i11 = R.raw.utyan_newborn;
                    string = LocaleController.getString(R.string.NoChatsHelp);
                    textView.setText(LocaleController.getString(R.string.NoChats));
                } else if (E != 2) {
                    lj0Var.setAutoRepeat(true);
                    i11 = R.raw.filter_new;
                    string = LocaleController.getString(R.string.FilterAddingChatsInfo);
                    textView.setText(LocaleController.getString(R.string.FilterAddingChats));
                } else {
                    lj0Var.setAutoRepeat(false);
                    i11 = R.raw.filter_no_chats;
                    if (this.w) {
                        textView.setText(LocaleController.getString(R.string.FilterNoChatsToForward));
                        string = LocaleController.getString(R.string.FilterNoChatsToForwardInfo);
                    } else {
                        textView.setText(LocaleController.getString(R.string.FilterNoChatsToDisplay));
                        string = LocaleController.getString(R.string.FilterNoChatsToDisplayInfo);
                    }
                }
                if (i11 != 0) {
                    lj0Var.setVisibility(0);
                    if (x2Var.r == 1) {
                        if (x2Var.d) {
                            x2Var.a = 1.0f;
                            String string2 = LocaleController.getString(R.string.NoChatsContactsHelp);
                            if (AndroidUtilities.isTablet() && !AndroidUtilities.isSmallTablet()) {
                                string2 = string2.replace('\n', ' ');
                            }
                            v01Var.a(string2, true, false);
                            x2Var.requestLayout();
                        } else {
                            x2Var.a(true);
                        }
                    }
                    if (x2Var.s != i11) {
                        lj0Var.f(i11, 100, 100, null);
                        lj0Var.d();
                        x2Var.s = i11;
                    }
                } else {
                    lj0Var.setVisibility(8);
                }
                if (AndroidUtilities.isTablet() && !AndroidUtilities.isSmallTablet()) {
                    string = string.replace('\n', ' ');
                }
                v01Var.a(string, false, false);
            }
            int i18 = this.h;
            if (i18 != 7 && i18 != 8) {
                x2Var.setOnUtyanAnimationEndListener(new e(this, r13 ? 1 : 0));
                x2Var.setOnUtyanAnimationUpdateListener(new dg.o(this, 6));
                if (!x2Var.d && this.f == 0) {
                    pyVar.z4(0.0f);
                    for (oy oyVar : pyVar.b0) {
                        ((f2.j0) oyVar.a.getLayoutManager()).u = true;
                    }
                }
                if (this.d == null || i17 != 0) {
                    if (this.e) {
                        if (this.f == 0) {
                            x2Var.a(false);
                        }
                    } else if (x2Var.d && this.Y == 0) {
                        ValueAnimator valueAnimator = x2Var.e;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        x2Var.d = false;
                        ValueAnimator duration = ValueAnimator.ofFloat(x2Var.a, 0.0f).setDuration(250L);
                        x2Var.e = duration;
                        duration.setInterpolator(jt.d);
                        x2Var.e.addUpdateListener(new v2(x2Var, 1));
                        x2Var.e.addListener(new w2(x2Var, 0));
                        x2Var.e.start();
                    }
                } else if (!x2Var.d) {
                    x2Var.a(true);
                }
            }
        } else if (i12 == 6) {
            ((va) view).d((TLRPC.User) I(i10), null, null, false);
        } else if (i12 == 7) {
            m4 m4Var = (m4) view;
            int i19 = this.h;
            if (i19 != 11 && i19 != 12 && i19 != 13) {
                m4Var.setText(LocaleController.getString((this.f == 0 && this.e) ? R.string.ConnectingYourContacts : R.string.YourContacts));
            } else if (i10 == 0) {
                m4Var.setText(LocaleController.getString(R.string.ImportHeader));
            } else {
                m4Var.setText(LocaleController.getString(R.string.ImportHeaderContacts));
            }
        } else if (i12 != 11) {
            TLRPC.RequestPeerType requestPeerType = this.Q;
            if (i12 != 12) {
                switch (i12) {
                    case 14:
                        m4 m4Var2 = (m4) view;
                        m4Var2.setTextSize(14.0f);
                        m4Var2.setTextColor(k6.w0(null, k6.y6, false));
                        m4Var2.setBackgroundColor(k6.w0(null, k6.e7, false));
                        int i20 = ((ky) I(i10)).a;
                        if (i20 != 0) {
                            if (i20 != 1) {
                                if (i20 == 2) {
                                    m4Var2.setText(LocaleController.getString(R.string.FilterGroups));
                                    break;
                                }
                            } else {
                                m4Var2.setText(LocaleController.getString(R.string.MyGroups));
                                break;
                            }
                        } else {
                            m4Var2.setText(LocaleController.getString(R.string.MyChannels));
                            break;
                        }
                        break;
                    case 15:
                        ((q6) view).set(requestPeerType);
                        break;
                    case 16:
                        ((b3) view).set(requestPeerType);
                        break;
                    case 17:
                        z2 z2Var = (z2) view;
                        TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates = ((i) this.J.get(i10)).i;
                        if (tL_chatlists_chatlistUpdates != null) {
                            int size = tL_chatlists_chatlistUpdates.missing_peers.size();
                            z2Var.b(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("FolderUpdatesTitle", size, new Object[0]), k6.I6, 0, null), LocaleController.formatPluralString("FolderUpdatesSubtitle", size, new Object[0]));
                            break;
                        }
                        break;
                    default:
                        switch (i12) {
                            case 20:
                                u3 u3Var = (u3) view;
                                if (pyVar == null || !pyVar.K0) {
                                    if (this.h == 3) {
                                        if (i10 == 0) {
                                            u3Var.setText(LocaleController.getString(R.string.ForwardDialogYourChannel));
                                            break;
                                        } else {
                                            u3Var.setText(LocaleController.getString(R.string.ReplyDialogYourChats));
                                            break;
                                        }
                                    }
                                } else if (i10 == 0) {
                                    u3Var.setText(LocaleController.getString(R.string.ReplyDialogMessageAuthor));
                                    break;
                                } else {
                                    u3Var.setText(LocaleController.getString(R.string.ReplyDialogYourChats));
                                    break;
                                }
                                break;
                            case 21:
                                r2 r2Var2 = (r2) view;
                                m2 m2Var = new m2();
                                m2Var.a = LocaleController.getString(R.string.StoriesForwardTitle);
                                m2Var.b = LocaleController.getString(R.string.StoriesForwardText);
                                r2Var2.p2 = false;
                                r2Var2.q2 = false;
                                r2Var2.setDialog(m2Var);
                                if (r2Var2.getMeasuredHeight() > 0 && r2Var2.getMeasuredHeight() != r2Var2.y()) {
                                    r2Var2.requestLayout();
                                    break;
                                }
                                break;
                            case 22:
                                ((m4) view).setText((String) I(i10));
                                break;
                            case 23:
                                Object I2 = I(i10);
                                r2 r2Var3 = (r2) view;
                                if (I2 instanceof TLRPC.Chat) {
                                    TLRPC.Chat chat4 = (TLRPC.Chat) I2;
                                    r2Var3.N0 = ChatObject.isHiddenInCommunity(i13, chat4);
                                    r2Var3.setCustomMessageWithoutRebuild(LocaleController.formatPluralString("Members", chat4.participants_count, new Object[0]));
                                    r2Var3.W(-chat4.id, null, 0, false, false);
                                    break;
                                } else {
                                    TLRPC.User user2 = (TLRPC.User) I2;
                                    r2Var3.N0 = ChatObject.isHiddenInCommunity(i13, user2);
                                    r2Var3.setCustomMessageWithoutRebuild(LocaleController.getString(R.string.Bot));
                                    r2Var3.W(user2.id, null, 0, false, false);
                                    break;
                                }
                        }
                }
            } else {
                if (!(view instanceof o8)) {
                    return;
                }
                o8 o8Var = (o8) view;
                int i21 = k6.q6;
                o8Var.e(i21, i21);
                if (requestPeerType == null) {
                    o8Var.m(R.drawable.msg_groups_create, LocaleController.getString(R.string.CreateGroupForImport), this.f != 0);
                } else if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
                    o8Var.m(R.drawable.msg_channel_create, LocaleController.getString(R.string.CreateChannelForThis), true);
                } else {
                    o8Var.m(R.drawable.msg_groups_create, LocaleController.getString(R.string.CreateGroupForThis), true);
                }
                o8Var.x = true;
                o8Var.setOffsetFromImage(75);
            }
        } else {
            a9 a9Var = (a9) view;
            a9Var.setText(LocaleController.getString(R.string.TapOnThePencilButton));
            if (this.L == null) {
                Drawable drawable = this.c.getResources().getDrawable(R.drawable.arrow_newchat);
                this.L = drawable;
                drawable.setColorFilter(new PorterDuffColorFilter(k6.w0(null, k6.B6, false), PorterDuff.Mode.MULTIPLY));
            }
            g90 textView2 = a9Var.getTextView();
            textView2.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
            textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (pyVar == null || !pyVar.L3) ? this.L : null, (Drawable) null);
            textView2.getLayoutParams().width = -2;
        }
        if (i10 >= this.f + 1) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [android.view.View, org.telegram.ui.Cells.m4] */
    /* JADX WARN: Type inference failed for: r2v11, types: [android.view.View, org.telegram.ui.Cells.z6] */
    /* JADX WARN: Type inference failed for: r2v12, types: [uf.j] */
    /* JADX WARN: Type inference failed for: r2v13, types: [android.view.View, uf.g] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16, types: [android.view.View, android.widget.LinearLayout, org.telegram.ui.Cells.q6] */
    /* JADX WARN: Type inference failed for: r2v17, types: [uf.f] */
    /* JADX WARN: Type inference failed for: r2v18, types: [org.telegram.ui.Cells.z2] */
    /* JADX WARN: Type inference failed for: r2v19, types: [org.telegram.ui.Components.jn] */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v20, types: [android.view.ViewGroup, uf.j] */
    /* JADX WARN: Type inference failed for: r2v21, types: [org.telegram.ui.Cells.u3] */
    /* JADX WARN: Type inference failed for: r2v22, types: [org.telegram.ui.Cells.m4] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v25, types: [android.view.View, org.telegram.ui.Cells.o8] */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [org.telegram.ui.Components.u00] */
    /* JADX WARN: Type inference failed for: r2v5, types: [android.view.ViewGroup, org.telegram.ui.Cells.m4] */
    /* JADX WARN: Type inference failed for: r2v6, types: [android.view.View, android.view.ViewGroup, org.telegram.ui.c51] */
    /* JADX WARN: Type inference failed for: r2v7, types: [android.view.View, org.telegram.ui.Cells.a0, org.telegram.ui.Cells.s2] */
    /* JADX WARN: Type inference failed for: r2v8, types: [org.telegram.ui.Cells.x2] */
    /* JADX WARN: Type inference failed for: r2v9, types: [org.telegram.ui.Cells.va] */
    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        ?? r22;
        long j10 = this.S;
        Context context = this.c;
        switch (i10) {
            case 0:
            case 21:
                int i11 = this.h;
                if (i11 == 2 || i11 == 15) {
                    r22 = new h6(context, null);
                } else {
                    r2 r2Var = new r2(this.O, this.c, false, this.C, null);
                    if (S()) {
                        org.telegram.ui.web.d1 d1Var = new org.telegram.ui.web.d1(this, 15);
                        r2Var.G1 = true;
                        r2Var.H1 = d1Var;
                    }
                    r2Var.setArchivedPullAnimation(this.I);
                    r2Var.setPreloader(this.M);
                    r2Var.setDialogCellDelegate(this);
                    r2Var.setIsTransitionSupport(this.P);
                    if (i10 == 21) {
                        d7 d7Var = new d7(r2Var.getContext(), r2Var, false, R.drawable.forward_to_stories, r2Var.C4);
                        r2Var = r2Var;
                        r2Var.D = d7Var;
                        r2Var.C = true;
                    }
                    if (j10 != 0) {
                        r2Var.L0 = true;
                    }
                    r22 = r2Var;
                }
                if (this.h == 15) {
                    r22.setBackgroundColor(k6.w0(null, k6.d6, false));
                    break;
                }
                break;
            case 1:
            case 13:
                r22 = new u00(context, null);
                r22.setIsSingleCell(true);
                int i12 = i10 == 13 ? 18 : 7;
                r22.setViewType(i12);
                if (i12 == 18) {
                    r22.setIgnoreHeightCheck(true);
                }
                if (i10 == 13) {
                    r22.setItemsCount((int) ((AndroidUtilities.displaySize.y * 0.5f) / AndroidUtilities.dp(64.0f)));
                    break;
                }
                break;
            case 2:
                r22 = new m4(context);
                r22.setText(LocaleController.getString(R.string.RecentlyViewed));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 15.0f);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setTextColor(k6.w0(null, k6.L6, false));
                textView.setText(LocaleController.getString(R.string.RecentlyViewedHide));
                textView.setGravity((LocaleController.isRTL ? 3 : 5) | 16);
                r22.addView(textView, c6.d(-1, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 17.0f, 15.0f, 17.0f, 0.0f));
                textView.setOnClickListener(new org.telegram.ui.Components.voip.o(this, 19));
                break;
            case 3:
                r22 = new c51(context, 9);
                r22.setBackgroundColor(k6.w0(null, k6.a7, false));
                View view = new View(context);
                view.setBackgroundDrawable(k6.V0(context, R.drawable.greydivider, k6.b7));
                r22.addView(view, c6.c(-1.0f, -1));
                break;
            case 4:
                r22 = new s2(context);
                ImageReceiver imageReceiver = new ImageReceiver(r22);
                r22.h = imageReceiver;
                r22.n = new z8((g6) null);
                r22.w = AndroidUtilities.dp(40.0f);
                r22.C = AndroidUtilities.dp(10.0f);
                r22.E = UserConfig.selectedAccount;
                k6.R(context);
                imageReceiver.setRoundRadius(AndroidUtilities.dp(26.0f));
                break;
            case 5:
                r22 = new x2(context);
                break;
            case 6:
                r22 = new va(context, 8, 0, false);
                break;
            case 7:
                r22 = new m4(context);
                py pyVar = this.O;
                if (pyVar == null || !pyVar.K0) {
                    r22.setPadding(0, 0, 0, AndroidUtilities.dp(12.0f));
                    break;
                }
                break;
            case 8:
                r22 = new z6(context, (org.telegram.ui.b) null);
                pq pqVar = new pq(new ColorDrawable(k6.w0(null, k6.a7, false)), k6.V0(context, R.drawable.greydivider, k6.b7));
                pqVar.w = true;
                r22.setBackgroundDrawable(pqVar);
                break;
            case 9:
            case 12:
            default:
                r22 = new o8(context);
                if (this.h == 15) {
                    r22.setBackgroundColor(k6.w0(null, k6.d6, false));
                    break;
                }
                break;
            case 10:
                r22 = new j(this, context);
                break;
            case 11:
                r22 = new g(this, context);
                pq pqVar2 = new pq(new ColorDrawable(k6.w0(null, k6.a7, false)), k6.V0(context, R.drawable.greydivider, k6.b7));
                pqVar2.w = true;
                r22.setBackgroundDrawable(pqVar2);
                break;
            case 14:
                m4 m4Var = new m4(this.c, k6.f7, 16, 0, false, null);
                m4Var.setHeight(32);
                m4Var.setClickable(false);
                r22 = m4Var;
                break;
            case 15:
                r22 = new q6(context);
                r22.b = new ArrayList();
                r22.setOrientation(1);
                r22.setBackgroundColor(k6.w0(null, k6.a7, false));
                break;
            case 16:
                r22 = new f(this, context);
                break;
            case 17:
                r22 = new z2(context);
                break;
            case 18:
                r22 = new jn(context, 29);
                break;
            case 19:
                r22 = new j(this, context);
                r22.addView(new org.telegram.ui.Components.q6(this.c, this.C, null, new e(this, 1), null), c6.d(-1, -1.0f, 17, 0.0f, -40.0f, 0.0f, 0.0f));
                break;
            case 20:
                r22 = new u3(context, null);
                break;
            case 22:
                r22 = new m4(context);
                break;
            case 23:
                r2 r2Var2 = new r2(this.O, this.c, false, this.C, null);
                if (j10 != 0) {
                    r2Var2.L0 = true;
                    r2Var2.M0 = true;
                }
                r22 = r2Var2;
                break;
        }
        r22.setLayoutParams(new f2.x0(-1, (i10 == 5 || i10 == 19) ? -1 : -2));
        return new fl0(r22);
    }

    @Override // f2.p0
    public final void y(f2.m1 m1Var) {
        View view = m1Var.a;
        if (view instanceof r2) {
            r2 r2Var = (r2) view;
            r2Var.T(this.E, false);
            r2Var.V(this.x.contains(Long.valueOf(r2Var.getDialogId())), false);
        }
    }

    public void J() {
    }

    public void K() {
    }

    public void L(TLRPC.User user) {
    }

    public void a(r2 r2Var) {
    }

    public void d(r2 r2Var) {
    }
}
