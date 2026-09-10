package zh;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class g1 implements org.telegram.ui.ActionBar.c2, ih.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ a3 b;

    public /* synthetic */ g1(a3 a3Var, int i10) {
        this.a = i10;
        this.b = a3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8, types: [org.telegram.tgnet.TLRPC$UserFull] */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v8, types: [org.telegram.messenger.MessagesStorage] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Object, org.telegram.tgnet.tl.TL_stories$PeerStories] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // org.telegram.ui.ActionBar.c2
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        long j3;
        TLRPC.ChatFull chatFull;
        ?? r92;
        ?? r12;
        boolean z10;
        boolean z11;
        TL_stories.StoryItem storyItem;
        int i11 = this.a;
        a3 a3Var = this.b;
        switch (i11) {
            case 0:
                t1 t1Var = a3Var.b2;
                if (t1Var != null) {
                    t1Var.A();
                    break;
                }
                break;
            default:
                z2 z2Var = a3Var.O1;
                boolean z12 = true;
                TLRPC.ChatFull chatFull2 = null;
                if (z2Var.f && (storyItem = z2Var.a) != null) {
                    TLRPC.MessageMedia messageMedia = storyItem.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                        TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                        t0 t0Var = t0.W;
                        if (t0Var != null && t0Var.f(inputGroupCall)) {
                            t0.W.e();
                            if (t0.W != null) {
                                t0.W = null;
                                NotificationCenter.getInstance(a3Var.C2).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(t0.W.g()));
                            }
                        }
                    }
                }
                TL_stories.StoryItem storyItem2 = z2Var.a;
                if (storyItem2 instanceof r4) {
                    s4 s4Var = ((r4) storyItem2).a;
                    TLRPC.MessageMedia messageMedia2 = storyItem2.media;
                    s4Var.getClass();
                    s4Var.F(new ArrayList(Arrays.asList(messageMedia2)));
                } else if (storyItem2 != null) {
                    a3 a3Var2 = z2Var.k;
                    i5 i5Var = a3Var2.S1;
                    long j10 = a3Var2.B1;
                    a0.i iVar = i5Var.i;
                    int i12 = i5Var.a;
                    if (!(storyItem2 instanceof TL_stories.TL_storyItemDeleted)) {
                        int i13 = 0;
                        while (i13 < 2) {
                            if (i13 == 0) {
                                j3 = 0;
                                TLRPC.ChatFull chatFull3 = chatFull2;
                                chatFull = chatFull3;
                                r92 = (TL_stories.PeerStories) iVar.f(j10);
                                r12 = chatFull3;
                            } else if (j10 >= 0) {
                                TLRPC.UserFull userFull = MessagesController.getInstance(i12).getUserFull(j10);
                                if (userFull != null) {
                                    j3 = 0;
                                    chatFull = chatFull2;
                                    r12 = userFull;
                                    r92 = userFull.stories;
                                } else {
                                    j3 = 0;
                                    chatFull = chatFull2;
                                    r12 = userFull;
                                    r92 = chatFull;
                                }
                            } else {
                                j3 = 0;
                                TLRPC.ChatFull chatFull4 = MessagesController.getInstance(i12).getChatFull(-j10);
                                if (chatFull4 != null) {
                                    chatFull = chatFull4;
                                    r92 = chatFull4.stories;
                                    r12 = chatFull2;
                                } else {
                                    TLRPC.ChatFull chatFull5 = chatFull2;
                                    chatFull = chatFull4;
                                    r92 = chatFull5;
                                    r12 = chatFull5;
                                }
                            }
                            if (r92 != 0) {
                                int i14 = 0;
                                while (true) {
                                    if (i14 < r92.stories.size()) {
                                        if (r92.stories.get(i14).id == storyItem2.id) {
                                            r92.stories.remove(i14);
                                            if (r92.stories.size() == 0) {
                                                if (!i5Var.K(j10)) {
                                                    iVar.l(j10);
                                                    i5Var.g.remove(r92);
                                                    i5Var.h.remove(r92);
                                                }
                                                if (j10 > j3) {
                                                    TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(j10));
                                                    if (user != null) {
                                                        user.stories_unavailable = z12;
                                                    }
                                                } else {
                                                    TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-j10));
                                                    if (chat != null) {
                                                        chat.stories_unavailable = true;
                                                    }
                                                }
                                            }
                                        } else {
                                            i14++;
                                            z12 = true;
                                        }
                                    }
                                }
                            }
                            if (chatFull != null) {
                                z10 = false;
                                MessagesStorage.getInstance(i12).updateChatInfo(chatFull, false);
                            } else {
                                z10 = false;
                            }
                            if (r12 != 0) {
                                MessagesStorage.getInstance(i12).updateUserInfo(r12, z10);
                            }
                            i13++;
                            z12 = true;
                            chatFull2 = null;
                        }
                        TL_stories.TL_stories_deleteStories tL_stories_deleteStories = new TL_stories.TL_stories_deleteStories();
                        tL_stories_deleteStories.peer = MessagesController.getInstance(i12).getInputPeer(j10);
                        tL_stories_deleteStories.id.add(Integer.valueOf(storyItem2.id));
                        ConnectionsManager.getInstance(i12).sendRequest(tL_stories_deleteStories, new j4(i5Var, 5));
                        v5 v5Var = i5Var.k;
                        v5Var.b.getStorageQueue().postRunnable(new u5(v5Var, j10, storyItem2.id, 0));
                        NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                        MessagesController.getInstance(i12).checkArchiveFolder();
                        i5Var.k0(j10, Arrays.asList(storyItem2));
                    }
                } else {
                    h5 h5Var = z2Var.b;
                    if (h5Var != null) {
                        h5Var.a();
                    }
                }
                a3Var.j1();
                if (!a3Var.K1 || a3Var.A1 != 0) {
                    int i15 = a3Var.J1;
                    int i16 = a3Var.A1;
                    if (i15 >= i16) {
                        a3Var.J1 = i16 - 1;
                        z11 = false;
                    } else {
                        z11 = false;
                        if (i15 < 0) {
                            a3Var.J1 = 0;
                        }
                    }
                    a3Var.f1(z11);
                    u7 u7Var = a3Var.J0;
                    if (u7Var != null) {
                        u7Var.p();
                        break;
                    }
                } else {
                    ((l7) a3Var.Q1).j();
                    break;
                }
                break;
        }
    }

    @Override // ih.a
    public void i(int i10) {
        if (i10 == 0) {
            this.b.P0();
        }
    }
}
