package th;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.hs;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class f1 implements org.telegram.ui.ActionBar.u1, bh.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ z2 b;

    public /* synthetic */ f1(z2 z2Var, int i10) {
        this.a = i10;
        this.b = z2Var;
    }

    @Override // bh.a
    public void d(int i10) {
        if (i10 == 0) {
            this.b.N0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8, types: [org.telegram.tgnet.TLRPC$UserFull] */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v22, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v9, types: [org.telegram.messenger.hs] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Object, org.telegram.tgnet.tl.TL_stories$PeerStories] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        long j10;
        TLRPC.ChatFull chatFull;
        ?? r92;
        ?? r12;
        boolean z10;
        boolean z11;
        TL_stories.StoryItem storyItem;
        int i11 = this.a;
        z2 z2Var = this.b;
        switch (i11) {
            case 0:
                t1 t1Var = z2Var.K1;
                if (t1Var != null) {
                    t1Var.x();
                    break;
                }
                break;
            default:
                y2 y2Var = z2Var.x1;
                int i12 = 0;
                boolean z12 = true;
                TLRPC.ChatFull chatFull2 = null;
                if (y2Var.f && (storyItem = y2Var.a) != null) {
                    TLRPC.MessageMedia messageMedia = storyItem.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                        TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                        s0 s0Var = s0.W;
                        if (s0Var != null && s0Var.f(inputGroupCall)) {
                            s0.W.e();
                            if (s0.W != null) {
                                s0.W = null;
                                zs.f(z2Var.l2).k(zs.G2, Long.valueOf(s0.W.g()));
                            }
                        }
                    }
                }
                TL_stories.StoryItem storyItem2 = y2Var.a;
                if (storyItem2 instanceof p4) {
                    q4 q4Var = ((p4) storyItem2).a;
                    TLRPC.MessageMedia messageMedia2 = storyItem2.media;
                    q4Var.getClass();
                    q4Var.F(new ArrayList(Arrays.asList(messageMedia2)));
                } else if (storyItem2 != null) {
                    z2 z2Var2 = y2Var.k;
                    e5 e5Var = z2Var2.B1;
                    long j11 = z2Var2.k1;
                    a0.h hVar = e5Var.i;
                    int i13 = e5Var.a;
                    if (!(storyItem2 instanceof TL_stories.TL_storyItemDeleted)) {
                        int i14 = 0;
                        while (i14 < 2) {
                            if (i14 == 0) {
                                j10 = 0;
                                TLRPC.ChatFull chatFull3 = chatFull2;
                                chatFull = chatFull3;
                                r92 = (TL_stories.PeerStories) hVar.f(j11);
                                r12 = chatFull3;
                            } else if (j11 >= 0) {
                                TLRPC.UserFull a2 = vp.r1(i13).a2(j11);
                                if (a2 != null) {
                                    j10 = 0;
                                    chatFull = chatFull2;
                                    r12 = a2;
                                    r92 = a2.stories;
                                } else {
                                    j10 = 0;
                                    chatFull = chatFull2;
                                    r12 = a2;
                                    r92 = chatFull;
                                }
                            } else {
                                j10 = 0;
                                TLRPC.ChatFull M0 = vp.r1(i13).M0(-j11);
                                if (M0 != null) {
                                    chatFull = M0;
                                    r92 = M0.stories;
                                    r12 = chatFull2;
                                } else {
                                    TLRPC.ChatFull chatFull4 = chatFull2;
                                    chatFull = M0;
                                    r92 = chatFull4;
                                    r12 = chatFull4;
                                }
                            }
                            if (r92 != 0) {
                                int i15 = i12;
                                while (true) {
                                    if (i15 < r92.stories.size()) {
                                        if (r92.stories.get(i15).id == storyItem2.id) {
                                            r92.stories.remove(i15);
                                            if (r92.stories.size() == 0) {
                                                if (!e5Var.M(j11)) {
                                                    hVar.l(j11);
                                                    e5Var.g.remove(r92);
                                                    e5Var.h.remove(r92);
                                                }
                                                if (j11 > j10) {
                                                    TLRPC.User Z1 = vp.r1(i13).Z1(Long.valueOf(j11));
                                                    if (Z1 != null) {
                                                        Z1.stories_unavailable = z12;
                                                    }
                                                } else {
                                                    TLRPC.Chat L0 = vp.r1(i13).L0(Long.valueOf(-j11));
                                                    if (L0 != null) {
                                                        L0.stories_unavailable = true;
                                                    }
                                                }
                                            }
                                        } else {
                                            i15++;
                                            z12 = true;
                                        }
                                    }
                                }
                            }
                            if (chatFull != null) {
                                z10 = false;
                                hs.a0(i13).N1(chatFull, false);
                            } else {
                                z10 = false;
                            }
                            if (r12 != 0) {
                                hs.a0(i13).j2(r12, z10);
                            }
                            i14++;
                            i12 = 0;
                            z12 = true;
                            chatFull2 = null;
                        }
                        TL_stories.TL_stories_deleteStories tL_stories_deleteStories = new TL_stories.TL_stories_deleteStories();
                        tL_stories_deleteStories.peer = vp.r1(i13).i1(j11);
                        tL_stories_deleteStories.id.add(Integer.valueOf(storyItem2.id));
                        ConnectionsManager.getInstance(i13).sendRequest(tL_stories_deleteStories, new i4(e5Var, 4));
                        r5 r5Var = e5Var.k;
                        r5Var.b.a.c(new o5(r5Var, j11, storyItem2.id, 1));
                        zs.f(i13).k(zs.v5, new Object[0]);
                        vp.r1(i13).D();
                        e5Var.n0(j11, Arrays.asList(storyItem2));
                    }
                } else {
                    d5 d5Var = y2Var.b;
                    if (d5Var != null) {
                        d5Var.a();
                    }
                }
                z2Var.h1();
                if (!z2Var.t1 || z2Var.j1 != 0) {
                    int i16 = z2Var.s1;
                    int i17 = z2Var.j1;
                    if (i16 >= i17) {
                        z2Var.s1 = i17 - 1;
                        z11 = false;
                    } else {
                        z11 = false;
                        if (i16 < 0) {
                            z2Var.s1 = 0;
                        }
                    }
                    z2Var.d1(z11);
                    o7 o7Var = z2Var.s0;
                    if (o7Var != null) {
                        o7Var.C();
                        break;
                    }
                } else {
                    ((f7) z2Var.z1).j();
                    break;
                }
                break;
        }
    }
}
