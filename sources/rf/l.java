package rf;

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
import f2.n1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import lh.b7;
import lh.s6;
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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.f6;
import org.telegram.ui.Cells.k2;
import org.telegram.ui.Cells.k4;
import org.telegram.ui.Cells.l2;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Cells.o6;
import org.telegram.ui.Cells.p2;
import org.telegram.ui.Cells.q2;
import org.telegram.ui.Cells.s3;
import org.telegram.ui.Cells.sa;
import org.telegram.ui.Cells.t2;
import org.telegram.ui.Cells.u2;
import org.telegram.ui.Cells.v2;
import org.telegram.ui.Cells.x2;
import org.telegram.ui.Cells.x6;
import org.telegram.ui.Cells.y8;
import org.telegram.ui.Cells.z2;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.ct;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.ei0;
import org.telegram.ui.Components.fn;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.j01;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.k30;
import org.telegram.ui.Components.mx;
import org.telegram.ui.Components.p00;
import org.telegram.ui.Components.u6;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.y80;
import org.telegram.ui.ay;
import org.telegram.ui.ef0;
import org.telegram.ui.ey;
import org.telegram.ui.fy;
import org.telegram.ui.lx0;
import org.telegram.ui.n31;
import org.telegram.ui.th;
import org.telegram.ui.zx;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class l extends il0 implements l2 {
    public static final boolean Y = BuildVars.DEBUG_PRIVATE_VERSION;
    public boolean A;
    public final int B;
    public boolean C;
    public boolean D;
    public long E;
    public boolean F;
    public jl0 G;
    public ei0 H;
    public Drawable K;
    public final i L;
    public boolean M;
    public final fy N;
    public boolean O;
    public final TLRPC.RequestPeerType P;
    public boolean Q;
    public final long R;
    public boolean V;
    public boolean W;
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
    public ArrayList I = new ArrayList();
    public ArrayList J = new ArrayList();
    public int S = 10;
    public final LongSparseIntArray T = new LongSparseIntArray();
    public final HashMap U = new HashMap();
    public int X = -1;

    public l(fy fyVar, Context context, int i10, int i11, boolean z10, ArrayList arrayList, int i12, TLRPC.RequestPeerType requestPeerType) {
        this.c = context;
        this.N = fyVar;
        this.h = i10;
        this.r = i11;
        this.w = z10;
        this.y = i11 == 0 && i10 == 0 && !z10;
        this.x = arrayList;
        this.B = i12;
        this.R = fyVar.T2;
        if (i11 == 0) {
            i iVar = new i();
            iVar.a = new HashSet();
            iVar.b = new HashSet();
            iVar.c = new HashSet();
            iVar.d = new ArrayList();
            iVar.e = new ef0(iVar, 16);
            this.L = iVar;
        }
        this.P = requestPeerType;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(n1 n1Var) {
        int i10 = n1Var.f;
        return (i10 == 1 || i10 == 5 || i10 == 3 || i10 == 8 || i10 == 7 || i10 == 10 || i10 == 11 || i10 == 13 || i10 == 15 || i10 == 16 || i10 == 18 || i10 == 19 || i10 == 20) ? false : true;
    }

    public final int E() {
        int i10 = this.h;
        int i11 = this.r;
        if (i10 == 7 || i10 == 8) {
            return MessagesController.getInstance(this.B).isDialogsEndReached(i11) ? 2 : 3;
        }
        if (i11 == 1) {
            return 2;
        }
        return this.d != null ? 1 : 0;
    }

    public final int F(long j10) {
        for (int i10 = 0; i10 < this.I.size(); i10++) {
            if (((j) this.I.get(i10)).c != null && ((j) this.I.get(i10)).c.id == j10) {
                return i10;
            }
        }
        return -1;
    }

    public final int G(int i10) {
        if (this.A) {
            i10--;
        }
        if (this.y) {
            i10 = th.e(2, i10, MessagesController.getInstance(this.B).hintDialogs);
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
            return MessagesController.getInstance(this.B).selectedDialogFilter[this.h - 7];
        }
        return null;
    }

    public final Object I(int i10) {
        if (i10 >= 0 && i10 < this.I.size()) {
            j jVar = (j) this.I.get(i10);
            String str = jVar.l;
            TLRPC.TL_contact tL_contact = jVar.e;
            if (str != null) {
                return str;
            }
            TLRPC.Chat chat = jVar.m;
            if (chat != null) {
                return chat;
            }
            TLRPC.User user = jVar.n;
            if (user != null) {
                return user;
            }
            TLRPC.Dialog dialog = jVar.c;
            if (dialog != null) {
                return dialog;
            }
            if (tL_contact != null) {
                return MessagesController.getInstance(this.B).getUser(Long.valueOf(tL_contact.user_id));
            }
            TLRPC.RecentMeUrl recentMeUrl = jVar.d;
            if (recentMeUrl != null) {
                return recentMeUrl;
            }
        }
        return null;
    }

    public final void M(boolean z10) {
        this.n = z10;
    }

    public final void N(ei0 ei0Var) {
        this.H = ei0Var;
    }

    public final void O(jl0 jl0Var, boolean z10) {
        this.F = z10;
        for (int i10 = 0; i10 < jl0Var.getChildCount(); i10++) {
            if (jl0Var.getChildAt(i10) instanceof p2) {
                ((p2) jl0Var.getChildAt(i10)).f = z10;
            }
        }
        for (int i11 = 0; i11 < jl0Var.getCachedChildCount(); i11++) {
            if (jl0Var.P(i11) instanceof p2) {
                ((p2) jl0Var.P(i11)).f = z10;
            }
        }
        for (int i12 = 0; i12 < jl0Var.getHiddenChildCount(); i12++) {
            if (jl0Var.V(i12) instanceof p2) {
                ((p2) jl0Var.V(i12)).f = z10;
            }
        }
        for (int i13 = 0; i13 < jl0Var.getAttachedScrapChildCount(); i13++) {
            if (jl0Var.O(i13) instanceof p2) {
                ((p2) jl0Var.O(i13)).f = z10;
            }
        }
    }

    public final void P(boolean z10) {
        this.M = z10;
    }

    public final void Q(long j10) {
        this.s = j10;
    }

    public final void R(ay ayVar) {
        this.G = ayVar;
    }

    public boolean S() {
        return false;
    }

    public final void T(boolean z10) {
        int i10 = this.B;
        if (this.d != null) {
            if (!z10 || SystemClock.elapsedRealtime() - this.E >= 2000) {
                this.E = SystemClock.elapsedRealtime();
                try {
                    int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
                    Collections.sort(this.d, new k30(MessagesController.getInstance(i10), currentTime, 2));
                    if (z10) {
                        l();
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
        }
    }

    public final void U() {
        this.y = this.r == 0 && this.h == 0 && !this.w && !MessagesController.getInstance(this.B).hintDialogs.isEmpty();
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
        boolean z10;
        int i10;
        TL_chatlists.TL_chatlists_chatlistUpdates chatlistFolderUpdates;
        TLRPC.RequestPeerType requestPeerType;
        int i11;
        int i12;
        boolean z11;
        TLRPC.Dialog dialog2;
        int i13;
        TLRPC.Dialog dialog3;
        ArrayList<MessagesController.CommunityPeerDialog> arrayList;
        String string;
        int i14 = this.B;
        long j11 = this.R;
        if (j11 != 0) {
            this.I.clear();
            U();
            MessagesController.CommunityPeersDialog buildCommunityPeers = MessagesController.getInstance(i14).buildCommunityPeers(j11);
            this.f = buildCommunityPeers.getDialogsCount();
            this.Q = false;
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
                    this.I.add(new j(this, string));
                    for (int i17 = 0; i17 < arrayList.size(); i17++) {
                        MessagesController.CommunityPeerDialog communityPeerDialog = arrayList.get(i17);
                        TLRPC.Dialog dialog4 = communityPeerDialog.dialog;
                        if (dialog4 != null) {
                            this.I.add(new j(this, 0, dialog4));
                        } else {
                            TLRPC.Chat chat = communityPeerDialog.chat;
                            if (chat != null) {
                                this.I.add(new j(this, chat));
                            } else {
                                TLRPC.User user = communityPeerDialog.user;
                                if (user != null) {
                                    this.I.add(new j(this, user));
                                }
                            }
                        }
                    }
                }
            }
            return;
        }
        this.I.clear();
        U();
        MessagesController messagesController = MessagesController.getInstance(i14);
        int i18 = this.r;
        fy fyVar = this.N;
        if (j11 != 0) {
            R3 = messagesController.getDialogsByCommunity(j11);
        } else {
            R3 = fyVar.R3(i14, this.h, i18, this.C);
            if (R3 == null) {
                R3 = new ArrayList();
            }
        }
        int size = R3.size();
        this.f = size;
        this.Q = false;
        if (size == 0 && fyVar.e4()) {
            th.x(this, 19, this.I);
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
        if ((H == null || H.isDefault()) && fyVar != null && fyVar.J0 && fyVar.L0 != j10) {
            th.x(this, 20, this.I);
            int i20 = 0;
            while (true) {
                if (i20 >= R3.size()) {
                    dialog = null;
                    break;
                } else {
                    if (R3.get(i20).id == fyVar.L0) {
                        dialog = R3.get(i20);
                        break;
                    }
                    i20++;
                }
            }
            if (dialog == null) {
                dialog = new TLRPC.TL_dialog();
                dialog.id = fyVar.L0;
            }
            this.I.add(new j(this, 0, dialog));
            th.x(this, 20, this.I);
        } else if ((H == null || H.isDefault()) && fyVar != null && this.h == 3 && fyVar.M0 != j10) {
            th.x(this, 20, this.I);
            int i21 = 0;
            while (true) {
                if (i21 >= R3.size()) {
                    dialog3 = null;
                    break;
                } else {
                    if (R3.get(i21).id == fyVar.M0) {
                        dialog3 = R3.get(i21);
                        break;
                    }
                    i21++;
                }
            }
            if (dialog3 == null) {
                dialog3 = new TLRPC.TL_dialog();
                dialog3.id = fyVar.M0;
            }
            z10 = false;
            this.I.add(new j(this, 0, dialog3));
            th.x(this, 20, this.I);
            this.A = z10;
            i10 = this.h;
            if ((i10 != 7 || i10 == 8) && H != null && H.isChatlist()) {
                messagesController.checkChatlistFolderUpdate(H.id, false);
                chatlistFolderUpdates = messagesController.getChatlistFolderUpdates(H.id);
                if (chatlistFolderUpdates != null && chatlistFolderUpdates.missing_peers.size() > 0) {
                    this.A = true;
                    this.I.add(new j(this, chatlistFolderUpdates));
                }
            }
            requestPeerType = this.P;
            if (requestPeerType != null) {
                th.x(this, 15, this.I);
            }
            if (!this.F || this.O) {
                for (i11 = 0; i11 < R3.size(); i11++) {
                    if (this.h == 2 && (R3.get(i11) instanceof zx)) {
                        this.I.add(new j(this, 14, R3.get(i11)));
                    } else {
                        this.I.add(new j(this, 0, R3.get(i11)));
                    }
                }
                th.x(this, 10, this.I);
            }
            if (this.f == 0 && this.e) {
                this.Q = true;
                if (requestPeerType != null) {
                    th.x(this, 16, this.I);
                } else {
                    this.I.add(new j(this, E(), 0));
                }
                th.x(this, 8, this.I);
                th.x(this, 7, this.I);
                th.x(this, 13, this.I);
            } else {
                ArrayList arrayList2 = this.d;
                if (arrayList2 != null && !arrayList2.isEmpty() && (i12 = this.h) != 7 && i12 != 8) {
                    if (this.f == 0) {
                        this.Q = true;
                        if (requestPeerType != null) {
                            th.x(this, 16, this.I);
                        } else {
                            this.I.add(new j(this, E(), 0));
                        }
                        th.x(this, 8, this.I);
                        th.x(this, 7, this.I);
                    } else {
                        for (int i22 = 0; i22 < R3.size(); i22++) {
                            this.I.add(new j(this, 0, R3.get(i22)));
                        }
                        th.x(this, 8, this.I);
                        th.x(this, 7, this.I);
                    }
                    for (int i23 = 0; i23 < this.d.size(); i23++) {
                        this.I.add(new j(this, (TLRPC.TL_contact) this.d.get(i23)));
                    }
                    th.x(this, 10, this.I);
                    z11 = true;
                    if ((!(requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) || (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat)) && this.f > 0) {
                        th.x(this, 12, this.I);
                    }
                    if (this.n && this.h == 3) {
                        th.x(this, 21, this.I);
                    }
                    if (!z11) {
                        for (int i24 = 0; i24 < R3.size(); i24++) {
                            if (this.h == 2 && (R3.get(i24) instanceof zx)) {
                                this.I.add(new j(this, 14, R3.get(i24)));
                            } else {
                                this.I.add(new j(this, 0, R3.get(i24)));
                            }
                        }
                        if (j11 != 0 || this.M || (i13 = this.h) == 7 || i13 == 8 || MessagesController.getInstance(i14).isDialogsEndReached(i18)) {
                            int i25 = this.f;
                            if (i25 == 0) {
                                this.Q = true;
                                if (requestPeerType != null) {
                                    th.x(this, 16, this.I);
                                } else {
                                    this.I.add(new j(this, E(), 0));
                                }
                            } else {
                                if (i18 == 0 && i25 > 10 && this.h == 0) {
                                    th.x(this, 11, this.I);
                                }
                                th.x(this, 10, this.I);
                            }
                        } else {
                            if (this.f != 0) {
                                th.x(this, 1, this.I);
                            }
                            th.x(this, 10, this.I);
                        }
                    }
                    if (messagesController.hiddenUndoChats.isEmpty()) {
                        int i26 = 0;
                        while (i26 < this.I.size()) {
                            j jVar = (j) this.I.get(i26);
                            if (jVar.a == 0 && (dialog2 = jVar.c) != null && messagesController.isHiddenByUndo(dialog2.id)) {
                                this.I.remove(i26);
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
                    th.x(this, 2, this.I);
                    for (int i27 = 0; i27 < size3; i27++) {
                        this.I.add(new j(this, MessagesController.getInstance(i14).hintDialogs.get(i27)));
                    }
                    th.x(this, 3, this.I);
                } else {
                    int i28 = this.h;
                    if (i28 == 11 || i28 == 13) {
                        th.x(this, 7, this.I);
                        th.x(this, 12, this.I);
                    } else if (i28 == 12) {
                        th.x(this, 7, this.I);
                    }
                }
            }
            z11 = false;
            if (!(requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast)) {
            }
            th.x(this, 12, this.I);
            if (this.n) {
                th.x(this, 21, this.I);
            }
            if (!z11) {
            }
            if (messagesController.hiddenUndoChats.isEmpty()) {
            }
        }
        z10 = false;
        this.A = z10;
        i10 = this.h;
        if (i10 != 7) {
        }
        messagesController.checkChatlistFolderUpdate(H.id, false);
        chatlistFolderUpdates = messagesController.getChatlistFolderUpdates(H.id);
        if (chatlistFolderUpdates != null) {
            this.A = true;
            this.I.add(new j(this, chatlistFolderUpdates));
        }
        requestPeerType = this.P;
        if (requestPeerType != null) {
        }
        if (this.F) {
        }
        while (i11 < R3.size()) {
        }
        th.x(this, 10, this.I);
    }

    public final void W(Runnable runnable) {
        if (this.V) {
            this.W = true;
            return;
        }
        this.V = true;
        ArrayList arrayList = new ArrayList();
        this.J = arrayList;
        arrayList.addAll(this.I);
        V();
        ArrayList arrayList2 = new ArrayList(this.I);
        ArrayList arrayList3 = this.J;
        this.I = arrayList3;
        mx mxVar = new mx(this, arrayList2, 3);
        if (arrayList3.size() >= 50 && Y) {
            Utilities.searchQueue.postRunnable(new lx0(this, mxVar, runnable, arrayList2, 21));
            return;
        }
        f2.m c3 = f2.q.c(mxVar, true);
        this.V = false;
        if (runnable != null) {
            runnable.run();
        }
        this.I = arrayList2;
        c3.b(this);
    }

    @Override // org.telegram.ui.Cells.l2
    public final boolean b() {
        return this.x.isEmpty();
    }

    @Override // org.telegram.ui.Cells.l2
    public final void c() {
        s6 storiesController = MessagesController.getInstance(this.B).getStoriesController();
        ArrayList arrayList = storiesController.h;
        if (arrayList.isEmpty()) {
            return;
        }
        boolean z10 = storiesController.D(0, DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(0)).peer)) != 0;
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            long peerDialogId = DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(i10)).peer);
            if (!z10 || storiesController.D(0, peerDialogId) != 0) {
                arrayList2.add(Long.valueOf(peerDialogId));
            }
        }
        this.N.getOrCreateStoryViewer().F(this.c, null, arrayList2, 0, null, null, new b7(this.G, true), false);
    }

    @Override // org.telegram.ui.Cells.l2
    public final void e(p2 p2Var) {
        int i10 = this.B;
        MessagesController.getInstance(i10);
        if (MessagesController.getInstance(i10).getStoriesController().I(p2Var.getDialogId())) {
            fy fyVar = this.N;
            fyVar.getOrCreateStoryViewer().getClass();
            fyVar.getOrCreateStoryViewer().D(fyVar.getParentActivity(), p2Var.getDialogId(), b7.a((jl0) p2Var.getParent()));
        }
    }

    @Override // org.telegram.ui.Cells.l2
    public final void f(p2 p2Var) {
        this.N.H4(p2Var);
    }

    @Override // f2.p0
    public final int h() {
        int size = this.I.size();
        this.v = size;
        return size;
    }

    @Override // f2.p0
    public final long i(int i10) {
        return ((j) this.I.get(i10)).k;
    }

    @Override // f2.p0
    public final int j(int i10) {
        return ((j) this.I.get(i10)).a;
    }

    @Override // f2.p0
    public void l() {
        if (this.V) {
            this.I = new ArrayList();
        }
        this.V = false;
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
    public final void v(n1 n1Var, int i10) {
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        String str;
        String str2;
        String userName;
        String formatPluralStringComma;
        TLRPC.Chat chat3;
        int i11;
        String string;
        int i12 = n1Var.f;
        View view = n1Var.a;
        int i13 = this.B;
        fy fyVar = this.N;
        if (i12 == 0) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) I(i10);
            Object I = I(i10 + 1);
            TLRPC.Dialog dialog2 = I instanceof TLRPC.Dialog ? (TLRPC.Dialog) I : null;
            int i14 = this.h;
            ArrayList arrayList = this.x;
            if (i14 == 2 || i14 == 15) {
                f6 f6Var = (f6) view;
                long dialogId = f6Var.getDialogId();
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
                        f6Var.I = dialog2 == null;
                        f6Var.t(chat2, null, str, str2, false, false);
                        f6Var.s(arrayList.contains(Long.valueOf(f6Var.getDialogId())), dialogId == f6Var.getDialogId());
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
                f6Var.I = dialog2 == null;
                f6Var.t(chat2, null, str, str2, false, false);
                f6Var.s(arrayList.contains(Long.valueOf(f6Var.getDialogId())), dialogId == f6Var.getDialogId());
                if (i10 >= this.f + 1) {
                }
            } else {
                p2 p2Var = (p2) view;
                p2Var.M0 = this.R != 0 && ChatObject.isHiddenInCommunity(i13, dialog.id);
                p2Var.o2 = false;
                p2Var.p2 = false;
                if (this.h == 0 && AndroidUtilities.isTablet()) {
                    p2Var.setDialogSelected(dialog.id == this.s);
                }
                p2Var.V(arrayList.contains(Long.valueOf(dialog.id)), false);
                if (i10 == 1 && fyVar != null && fyVar.J0 && fyVar.L0 != 0 && dialog.top_message == 0) {
                    MessagesController.DialogFilter H = H();
                    if (H == null || H.isDefault()) {
                        p2Var.setCustomMessage(DialogObject.getStatus(fyVar.L0));
                    } else {
                        p2Var.setCustomMessage(null);
                    }
                } else if (i10 == 1 && fyVar != null && this.h == 3 && fyVar.M0 != 0 && dialog.top_message == 0) {
                    MessagesController.DialogFilter H2 = H();
                    if (H2 == null || H2.isDefault()) {
                        p2Var.setCustomMessage(DialogObject.getStatus(fyVar.M0));
                    } else {
                        p2Var.setCustomMessage(null);
                    }
                } else {
                    p2Var.setCustomMessage(null);
                }
                p2Var.X(dialog, this.h, this.r);
                if (p2Var.getMeasuredHeight() > 0 && p2Var.getMeasuredHeight() != p2Var.y()) {
                    p2Var.requestLayout();
                }
                boolean z10 = p2Var.f;
                boolean z11 = this.F;
                if (z10 != z11) {
                    p2Var.f = z11;
                    p2Var.requestLayout();
                }
                i iVar = this.L;
                if (iVar != null && i10 < 10) {
                    long j10 = dialog.id;
                    ArrayList arrayList2 = iVar.d;
                    if (!iVar.a.contains(Long.valueOf(j10)) && !iVar.b.contains(Long.valueOf(j10)) && !iVar.c.contains(Long.valueOf(j10)) && !arrayList2.contains(Long.valueOf(j10))) {
                        arrayList2.add(Long.valueOf(j10));
                    }
                }
            }
        } else if (i12 == 4) {
            ((q2) view).setRecentMeUrl((TLRPC.RecentMeUrl) I(i10));
        } else if (i12 == 5) {
            v2 v2Var = (v2) view;
            int i17 = this.X;
            int E = E();
            this.X = E;
            j01 j01Var = v2Var.n;
            TextView textView = v2Var.h;
            aj0 aj0Var = v2Var.f;
            if (v2Var.r != E) {
                v2Var.r = E;
                if (E == 0 || E == 1) {
                    i11 = R.raw.utyan_newborn;
                    string = LocaleController.getString(R.string.NoChatsHelp);
                    textView.setText(LocaleController.getString(R.string.NoChats));
                } else if (E != 2) {
                    aj0Var.setAutoRepeat(true);
                    i11 = R.raw.filter_new;
                    string = LocaleController.getString(R.string.FilterAddingChatsInfo);
                    textView.setText(LocaleController.getString(R.string.FilterAddingChats));
                } else {
                    aj0Var.setAutoRepeat(false);
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
                    aj0Var.setVisibility(0);
                    if (v2Var.r == 1) {
                        if (v2Var.d) {
                            v2Var.a = 1.0f;
                            String string2 = LocaleController.getString(R.string.NoChatsContactsHelp);
                            if (AndroidUtilities.isTablet() && !AndroidUtilities.isSmallTablet()) {
                                string2 = string2.replace('\n', ' ');
                            }
                            j01Var.a(string2, true, false);
                            v2Var.requestLayout();
                        } else {
                            v2Var.a(true);
                        }
                    }
                    if (v2Var.s != i11) {
                        aj0Var.f(i11, 100, 100, null);
                        aj0Var.d();
                        v2Var.s = i11;
                    }
                } else {
                    aj0Var.setVisibility(8);
                }
                if (AndroidUtilities.isTablet() && !AndroidUtilities.isSmallTablet()) {
                    string = string.replace('\n', ' ');
                }
                j01Var.a(string, false, false);
            }
            int i18 = this.h;
            if (i18 != 7 && i18 != 8) {
                v2Var.setOnUtyanAnimationEndListener(new f(this, r13 ? 1 : 0));
                v2Var.setOnUtyanAnimationUpdateListener(new ag.p(this, 6));
                if (!v2Var.d && this.f == 0) {
                    fyVar.z4(0.0f);
                    for (ey eyVar : fyVar.a0) {
                        ((f2.j0) eyVar.a.getLayoutManager()).u = true;
                    }
                }
                if (this.d == null || i17 != 0) {
                    if (this.e) {
                        if (this.f == 0) {
                            v2Var.a(false);
                        }
                    } else if (v2Var.d && this.X == 0) {
                        ValueAnimator valueAnimator = v2Var.e;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        v2Var.d = false;
                        ValueAnimator duration = ValueAnimator.ofFloat(v2Var.a, 0.0f).setDuration(250L);
                        v2Var.e = duration;
                        duration.setInterpolator(ct.d);
                        v2Var.e.addUpdateListener(new t2(v2Var, 1));
                        v2Var.e.addListener(new u2(v2Var, 0));
                        v2Var.e.start();
                    }
                } else if (!v2Var.d) {
                    v2Var.a(true);
                }
            }
        } else if (i12 == 6) {
            ((sa) view).d((TLRPC.User) I(i10), null, null, false);
        } else if (i12 == 7) {
            k4 k4Var = (k4) view;
            int i19 = this.h;
            if (i19 != 11 && i19 != 12 && i19 != 13) {
                k4Var.setText(LocaleController.getString((this.f == 0 && this.e) ? R.string.ConnectingYourContacts : R.string.YourContacts));
            } else if (i10 == 0) {
                k4Var.setText(LocaleController.getString(R.string.ImportHeader));
            } else {
                k4Var.setText(LocaleController.getString(R.string.ImportHeaderContacts));
            }
        } else if (i12 != 11) {
            TLRPC.RequestPeerType requestPeerType = this.P;
            if (i12 != 12) {
                switch (i12) {
                    case 14:
                        k4 k4Var2 = (k4) view;
                        k4Var2.setTextSize(14.0f);
                        k4Var2.setTextColor(g6.w0(null, g6.y6, false));
                        k4Var2.setBackgroundColor(g6.w0(null, g6.e7, false));
                        int i20 = ((zx) I(i10)).a;
                        if (i20 != 0) {
                            if (i20 != 1) {
                                if (i20 == 2) {
                                    k4Var2.setText(LocaleController.getString(R.string.FilterGroups));
                                    break;
                                }
                            } else {
                                k4Var2.setText(LocaleController.getString(R.string.MyGroups));
                                break;
                            }
                        } else {
                            k4Var2.setText(LocaleController.getString(R.string.MyChannels));
                            break;
                        }
                        break;
                    case 15:
                        ((o6) view).set(requestPeerType);
                        break;
                    case 16:
                        ((z2) view).set(requestPeerType);
                        break;
                    case 17:
                        x2 x2Var = (x2) view;
                        TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates = ((j) this.I.get(i10)).i;
                        if (tL_chatlists_chatlistUpdates != null) {
                            int size = tL_chatlists_chatlistUpdates.missing_peers.size();
                            x2Var.b(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("FolderUpdatesTitle", size, new Object[0]), g6.I6, 0, null), LocaleController.formatPluralString("FolderUpdatesSubtitle", size, new Object[0]));
                            break;
                        }
                        break;
                    default:
                        switch (i12) {
                            case 20:
                                s3 s3Var = (s3) view;
                                if (fyVar == null || !fyVar.J0) {
                                    if (this.h == 3) {
                                        if (i10 == 0) {
                                            s3Var.setText(LocaleController.getString(R.string.ForwardDialogYourChannel));
                                            break;
                                        } else {
                                            s3Var.setText(LocaleController.getString(R.string.ReplyDialogYourChats));
                                            break;
                                        }
                                    }
                                } else if (i10 == 0) {
                                    s3Var.setText(LocaleController.getString(R.string.ReplyDialogMessageAuthor));
                                    break;
                                } else {
                                    s3Var.setText(LocaleController.getString(R.string.ReplyDialogYourChats));
                                    break;
                                }
                                break;
                            case 21:
                                p2 p2Var2 = (p2) view;
                                k2 k2Var = new k2();
                                k2Var.a = LocaleController.getString(R.string.StoriesForwardTitle);
                                k2Var.b = LocaleController.getString(R.string.StoriesForwardText);
                                p2Var2.o2 = false;
                                p2Var2.p2 = false;
                                p2Var2.setDialog(k2Var);
                                if (p2Var2.getMeasuredHeight() > 0 && p2Var2.getMeasuredHeight() != p2Var2.y()) {
                                    p2Var2.requestLayout();
                                    break;
                                }
                                break;
                            case 22:
                                ((k4) view).setText((String) I(i10));
                                break;
                            case 23:
                                Object I2 = I(i10);
                                p2 p2Var3 = (p2) view;
                                if (I2 instanceof TLRPC.Chat) {
                                    TLRPC.Chat chat4 = (TLRPC.Chat) I2;
                                    p2Var3.M0 = ChatObject.isHiddenInCommunity(i13, chat4);
                                    p2Var3.setCustomMessageWithoutRebuild(LocaleController.formatPluralString("Members", chat4.participants_count, new Object[0]));
                                    p2Var3.W(-chat4.id, null, 0, false, false);
                                    break;
                                } else {
                                    TLRPC.User user2 = (TLRPC.User) I2;
                                    p2Var3.M0 = ChatObject.isHiddenInCommunity(i13, user2);
                                    p2Var3.setCustomMessageWithoutRebuild(LocaleController.getString(R.string.Bot));
                                    p2Var3.W(user2.id, null, 0, false, false);
                                    break;
                                }
                        }
                }
            } else {
                if (!(view instanceof m8)) {
                    return;
                }
                m8 m8Var = (m8) view;
                int i21 = g6.q6;
                m8Var.e(i21, i21);
                if (requestPeerType == null) {
                    m8Var.m(R.drawable.msg_groups_create, LocaleController.getString(R.string.CreateGroupForImport), this.f != 0);
                } else if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
                    m8Var.m(R.drawable.msg_channel_create, LocaleController.getString(R.string.CreateChannelForThis), true);
                } else {
                    m8Var.m(R.drawable.msg_groups_create, LocaleController.getString(R.string.CreateGroupForThis), true);
                }
                m8Var.x = true;
                m8Var.setOffsetFromImage(75);
            }
        } else {
            y8 y8Var = (y8) view;
            y8Var.setText(LocaleController.getString(R.string.TapOnThePencilButton));
            if (this.K == null) {
                Drawable drawable = this.c.getResources().getDrawable(R.drawable.arrow_newchat);
                this.K = drawable;
                drawable.setColorFilter(new PorterDuffColorFilter(g6.w0(null, g6.B6, false), PorterDuff.Mode.MULTIPLY));
            }
            y80 textView2 = y8Var.getTextView();
            textView2.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
            textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (fyVar == null || !fyVar.K3) ? this.K : null, (Drawable) null);
            textView2.getLayoutParams().width = -2;
        }
        if (i10 >= this.f + 1) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [android.view.View, org.telegram.ui.Cells.k4] */
    /* JADX WARN: Type inference failed for: r2v11, types: [android.view.View, org.telegram.ui.Cells.x6] */
    /* JADX WARN: Type inference failed for: r2v12, types: [rf.k] */
    /* JADX WARN: Type inference failed for: r2v13, types: [android.view.View, rf.h] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16, types: [android.view.View, android.widget.LinearLayout, org.telegram.ui.Cells.o6] */
    /* JADX WARN: Type inference failed for: r2v17, types: [rf.g] */
    /* JADX WARN: Type inference failed for: r2v18, types: [org.telegram.ui.Cells.x2] */
    /* JADX WARN: Type inference failed for: r2v19, types: [org.telegram.ui.Components.fn] */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v20, types: [android.view.ViewGroup, rf.k] */
    /* JADX WARN: Type inference failed for: r2v21, types: [org.telegram.ui.Cells.s3] */
    /* JADX WARN: Type inference failed for: r2v22, types: [org.telegram.ui.Cells.k4] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v25, types: [android.view.View, org.telegram.ui.Cells.m8] */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [org.telegram.ui.Components.p00] */
    /* JADX WARN: Type inference failed for: r2v5, types: [android.view.ViewGroup, org.telegram.ui.Cells.k4] */
    /* JADX WARN: Type inference failed for: r2v6, types: [android.view.View, android.view.ViewGroup, org.telegram.ui.n31] */
    /* JADX WARN: Type inference failed for: r2v7, types: [android.view.View, org.telegram.ui.Cells.a0, org.telegram.ui.Cells.q2] */
    /* JADX WARN: Type inference failed for: r2v8, types: [org.telegram.ui.Cells.v2] */
    /* JADX WARN: Type inference failed for: r2v9, types: [org.telegram.ui.Cells.sa] */
    @Override // f2.p0
    public final n1 x(ViewGroup viewGroup, int i10) {
        ?? r22;
        long j10 = this.R;
        Context context = this.c;
        switch (i10) {
            case 0:
            case 21:
                int i11 = this.h;
                if (i11 == 2 || i11 == 15) {
                    r22 = new f6(context, null);
                } else {
                    p2 p2Var = new p2(this.N, this.c, false, this.B, null);
                    if (S()) {
                        nh.b0 b0Var = new nh.b0(this, 15);
                        p2Var.F1 = true;
                        p2Var.G1 = b0Var;
                    }
                    p2Var.setArchivedPullAnimation(this.H);
                    p2Var.setPreloader(this.L);
                    p2Var.setDialogCellDelegate(this);
                    p2Var.setIsTransitionSupport(this.O);
                    if (i10 == 21) {
                        org.telegram.ui.Cells.b7 b7Var = new org.telegram.ui.Cells.b7(p2Var.getContext(), p2Var, false, R.drawable.forward_to_stories, p2Var.B4);
                        p2Var = p2Var;
                        p2Var.C = b7Var;
                        p2Var.B = true;
                    }
                    if (j10 != 0) {
                        p2Var.K0 = true;
                    }
                    r22 = p2Var;
                }
                if (this.h == 15) {
                    r22.setBackgroundColor(g6.w0(null, g6.d6, false));
                    break;
                }
                break;
            case 1:
            case 13:
                r22 = new p00(context, null);
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
                r22 = new k4(context);
                r22.setText(LocaleController.getString(R.string.RecentlyViewed));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 15.0f);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setTextColor(g6.w0(null, g6.L6, false));
                textView.setText(LocaleController.getString(R.string.RecentlyViewedHide));
                textView.setGravity((LocaleController.isRTL ? 3 : 5) | 16);
                r22.addView(textView, i7.f6.d(-1, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 17.0f, 15.0f, 17.0f, 0.0f));
                textView.setOnClickListener(new mh.n(this, 19));
                break;
            case 3:
                r22 = new n31(context, 9);
                r22.setBackgroundColor(g6.w0(null, g6.a7, false));
                View view = new View(context);
                view.setBackgroundDrawable(g6.V0(context, R.drawable.greydivider, g6.b7));
                r22.addView(view, i7.f6.c(-1.0f, -1));
                break;
            case 4:
                r22 = new q2(context);
                ImageReceiver imageReceiver = new ImageReceiver(r22);
                r22.h = imageReceiver;
                r22.n = new e9((c6) null);
                r22.w = AndroidUtilities.dp(40.0f);
                r22.B = AndroidUtilities.dp(10.0f);
                r22.D = UserConfig.selectedAccount;
                g6.R(context);
                imageReceiver.setRoundRadius(AndroidUtilities.dp(26.0f));
                break;
            case 5:
                r22 = new v2(context);
                break;
            case 6:
                r22 = new sa(context, 8, 0, false);
                break;
            case 7:
                r22 = new k4(context);
                fy fyVar = this.N;
                if (fyVar == null || !fyVar.J0) {
                    r22.setPadding(0, 0, 0, AndroidUtilities.dp(12.0f));
                    break;
                }
                break;
            case 8:
                r22 = new x6(context, (org.telegram.ui.b) null);
                jq jqVar = new jq(new ColorDrawable(g6.w0(null, g6.a7, false)), g6.V0(context, R.drawable.greydivider, g6.b7));
                jqVar.w = true;
                r22.setBackgroundDrawable(jqVar);
                break;
            case 9:
            case 12:
            default:
                r22 = new m8(context);
                if (this.h == 15) {
                    r22.setBackgroundColor(g6.w0(null, g6.d6, false));
                    break;
                }
                break;
            case 10:
                r22 = new k(this, context);
                break;
            case 11:
                r22 = new h(this, context);
                jq jqVar2 = new jq(new ColorDrawable(g6.w0(null, g6.a7, false)), g6.V0(context, R.drawable.greydivider, g6.b7));
                jqVar2.w = true;
                r22.setBackgroundDrawable(jqVar2);
                break;
            case 14:
                k4 k4Var = new k4(this.c, g6.f7, 16, 0, false, null);
                k4Var.setHeight(32);
                k4Var.setClickable(false);
                r22 = k4Var;
                break;
            case 15:
                r22 = new o6(context);
                r22.b = new ArrayList();
                r22.setOrientation(1);
                r22.setBackgroundColor(g6.w0(null, g6.a7, false));
                break;
            case 16:
                r22 = new g(this, context);
                break;
            case 17:
                r22 = new x2(context);
                break;
            case 18:
                r22 = new fn(context, 29);
                break;
            case 19:
                r22 = new k(this, context);
                r22.addView(new u6(this.c, this.B, null, new f(this, 1), null), i7.f6.d(-1, -1.0f, 17, 0.0f, -40.0f, 0.0f, 0.0f));
                break;
            case 20:
                r22 = new s3(context, null);
                break;
            case 22:
                r22 = new k4(context);
                break;
            case 23:
                p2 p2Var2 = new p2(this.N, this.c, false, this.B, null);
                if (j10 != 0) {
                    p2Var2.K0 = true;
                    p2Var2.L0 = true;
                }
                r22 = p2Var2;
                break;
        }
        r22.setLayoutParams(new f2.x0(-1, (i10 == 5 || i10 == 19) ? -1 : -2));
        return new vk0(r22);
    }

    @Override // f2.p0
    public final void y(n1 n1Var) {
        View view = n1Var.a;
        if (view instanceof p2) {
            p2 p2Var = (p2) view;
            p2Var.T(this.D, false);
            p2Var.V(this.x.contains(Long.valueOf(p2Var.getDialogId())), false);
        }
    }

    public void J() {
    }

    public void K() {
    }

    public void L(TLRPC.User user) {
    }

    public void a(p2 p2Var) {
    }

    public void d(p2 p2Var) {
    }
}
