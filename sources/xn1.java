// default package

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class xn1 implements ed, d39, cu4 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ gk7 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ xn1(Object obj, KeyEvent.Callback callback, Object obj2, long j, Object obj3, byte b) {
        this.a = b;
        this.c = (gk7) obj;
        this.d = callback;
        this.e = obj2;
        this.b = j;
        this.f = obj3;
    }

    @Override // cu4
    public final void b(TLRPC.TL_textWithEntities tL_textWithEntities, boolean z) {
        vqa vqaVar = (vqa) this.c;
        du4 du4Var = (du4) this.d;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.e;
        oj ojVar = (oj) this.f;
        vqaVar.getClass();
        if (du4Var.F1) {
            return;
        }
        vqaVar.f2.setLoading(true);
        if (!du4Var.F1) {
            du4Var.F1 = true;
            du4Var.B1.h(true);
        }
        gta u = gta.u(vqaVar.a, ojVar);
        long j = this.b;
        u.E(tL_starGiftUnique, j, tL_textWithEntities, z, new tna(vqaVar, du4Var, ojVar, tL_starGiftUnique, j, tL_textWithEntities, z));
    }

    /* JADX WARN: Removed duplicated region for block: B:172:0x0355  */
    @Override // d39
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(final float f, final float f2, int i, View view) {
        boolean z;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        long j;
        final nfa nfaVar = (nfa) this.c;
        pca pcaVar = (pca) this.d;
        final Context context = (Context) this.e;
        wjb wjbVar = (wjb) this.f;
        zda zdaVar = nfaVar.T;
        yea yeaVar = nfaVar.U;
        zea zeaVar = nfaVar.V;
        aea aeaVar = nfaVar.d0;
        d dVar = nfaVar.y1;
        int i2 = pcaVar.F;
        if (i2 == 7) {
            if (view instanceof v6c) {
                int intValue = !aeaVar.e.isEmpty() ? ((Integer) aeaVar.e.get(i)).intValue() : i;
                TLRPC.ChatParticipant chatParticipant = aeaVar.d.participants.participants.get(intValue);
                if (intValue < 0 || intValue >= aeaVar.d.participants.participants.size()) {
                    return;
                }
                nfaVar.O0(chatParticipant, false, view);
                return;
            }
            w39 adapter = pcaVar.h.getAdapter();
            gea geaVar = nfaVar.m0;
            if (adapter == geaVar) {
                TLObject E = geaVar.E(i);
                if (E instanceof TLRPC.ChannelParticipant) {
                    j = k27.B1(((TLRPC.ChannelParticipant) E).peer);
                } else if (!(E instanceof TLRPC.ChatParticipant)) {
                    return;
                } else {
                    j = ((TLRPC.ChatParticipant) E).user_id;
                }
                if (j == 0 || j == dVar.getUserConfig().e()) {
                    return;
                }
                dVar.presentFragment(new ProfileActivity(ls6.k(j, "user_id"), null));
                return;
            }
            return;
        }
        if (i2 == 6) {
            if (view instanceof dh6) {
                Bundle bundle = new Bundle();
                bundle.putLongArray("result", new long[]{nfaVar.S.F()});
                wa5 wa5Var = new wa5(bundle);
                wa5Var.Z = new xca(nfaVar);
                dVar.presentFragment(wa5Var);
                return;
            }
            if (view instanceof rr8) {
                TLRPC.Chat chat = ((rr8) view).getChat();
                Bundle bundle2 = new Bundle();
                bundle2.putLong("chat_id", chat.id);
                if (dVar.getMessagesController().A(bundle2, dVar, null, null)) {
                    if (!chat.forum) {
                        dVar.presentFragment(new mu1(bundle2));
                        return;
                    } else {
                        HashSet hashSet = qvb.s1;
                        dVar.presentFragment(qvb.E0(dVar.getMessagesController(), dVar.getMessagesStorage(), bundle2));
                        return;
                    }
                }
                return;
            }
        }
        if (i2 == 1 && (view instanceof iba)) {
            nfaVar.M0(i, view, ((iba) view).getMessage(), pcaVar.F);
            return;
        }
        if (i2 == 3 && (view instanceof lba)) {
            nfaVar.M0(i, view, ((lba) view).getMessage(), pcaVar.F);
            return;
        }
        if ((i2 == 2 || i2 == 4) && (view instanceof eba)) {
            nfaVar.M0(i, view, ((eba) view).getMessage(), pcaVar.F);
            return;
        }
        if (i2 == 5 && (view instanceof bw2)) {
            nfaVar.M0(i, view, (k27) ((bw2) view).getParentObject(), pcaVar.F);
            return;
        }
        if (i2 == 0 && (view instanceof qfa)) {
            final qfa qfaVar = (qfa) view;
            k27 messageObject = qfaVar.getMessageObject();
            if (messageObject != null && messageObject.o4()) {
                if (dVar != null) {
                    final int currentAccount = dVar.getCurrentAccount();
                    final na7 q1 = na7.q1(currentAccount);
                    final hd hdVar = new hd(3, null, context);
                    hdVar.q(200L);
                    q1.P0(new p8c() { // from class: uba
                        @Override // p8c
                        public final void a(Object obj) {
                            nfa nfaVar2 = nfa.this;
                            hd hdVar2 = hdVar;
                            final na7 na7Var = q1;
                            final Context context2 = context;
                            final qfa qfaVar2 = qfaVar;
                            final float f3 = f;
                            final float f4 = f2;
                            final int i3 = currentAccount;
                            final TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                            hdVar2.b(200L);
                            final boolean z2 = na7Var.k4.l.f && !TextUtils.isEmpty(na7Var.k4.P2.f);
                            boolean z3 = (contentsettings == null || !contentsettings.sensitive_can_change) && z2;
                            final boolean[] zArr = new boolean[1];
                            FrameLayout frameLayout = new FrameLayout(context2);
                            if (z2) {
                                zArr[0] = true;
                            } else if (contentsettings != null && contentsettings.sensitive_can_change) {
                                d dVar2 = nfaVar2.y1;
                                ag2 ag2Var = new ag2(1, dVar2 == null ? null : dVar2.getResourceProvider(), context2);
                                ag2Var.setBackground(bkb.L0(false));
                                ag2Var.e(k96.M0(2131748290, null), "", zArr[0], false, false);
                                ag2Var.setPadding(k96.a0 ? gl.L(16.0f) : gl.L(8.0f), 0, k96.a0 ? gl.L(8.0f) : gl.L(16.0f), 0);
                                frameLayout.addView(ag2Var, nme.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                                ag2Var.setOnClickListener(new ge(zArr, (byte) 14));
                            }
                            d dVar3 = nfaVar2.y1;
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, dVar3 == null ? null : dVar3.getResourceProvider(), context2);
                            alertDialog$Builder.a.S = k96.M0(2131748281, null);
                            alertDialog$Builder.a.U = k96.M0(z3 ? 2131748283 : 2131748284, null);
                            alertDialog$Builder.n(frameLayout);
                            alertDialog$Builder.a.H = (byte) 9;
                            alertDialog$Builder.g(k96.M0(z3 ? 2131748282 : 2131752577, null), null);
                            if (!z3) {
                                alertDialog$Builder.j(k96.M0(2131748289, null), new ed() { // from class: eca
                                    @Override // ed
                                    public final void u(hd hdVar3, int i4) {
                                        TL_account.contentSettings contentsettings2;
                                        yr5 yr5Var = new yr5(qfa.this, f3, f4, (byte) 1);
                                        if (!zArr[0]) {
                                            yr5Var.a(Boolean.FALSE);
                                            return;
                                        }
                                        if (!z2 && ((contentsettings2 = contentsettings) == null || !contentsettings2.sensitive_can_change)) {
                                            yr5Var.a(Boolean.TRUE);
                                            return;
                                        }
                                        d S = LaunchActivity.S();
                                        ThemeActivity.G0(i3, S == null ? null : S.getResourceProvider(), new nu9(na7Var, yr5Var, (byte) 4), context2);
                                    }
                                });
                            }
                            d dVar4 = nfaVar2.y1;
                            if (dVar4 == null || dVar4.getContext() == null) {
                                alertDialog$Builder.o();
                            } else {
                                nfaVar2.y1.showDialog(alertDialog$Builder.a);
                            }
                        }
                    });
                    return;
                }
                return;
            }
            k27 k27Var = qfaVar.n;
            if (k27Var != null && k27Var.t2() && qfaVar.j0 == 0.0f && !qfaVar.n.P0) {
                qfaVar.n(f, f2);
                return;
            } else {
                if (messageObject != null) {
                    nfaVar.M0(i, view, messageObject, pcaVar.F);
                    return;
                }
                return;
            }
        }
        if (nfa.j0(i2) && (view instanceof qfa)) {
            k27 messageObject2 = ((qfa) view).getMessageObject();
            if (messageObject2 != null) {
                nfaVar.M0(i, view, messageObject2, pcaVar.F);
                return;
            }
            return;
        }
        int i3 = pcaVar.F;
        if (i3 == 10) {
            if (((view instanceof rr8) || f2 < gl.L(60.0f)) && i >= 0 && i < zdaVar.d.size()) {
                Bundle bundle3 = new Bundle();
                TLObject tLObject = (TLObject) zdaVar.d.get(i);
                if (tLObject instanceof TLRPC.Chat) {
                    bundle3.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
                } else if (!(tLObject instanceof TLRPC.User)) {
                    return;
                } else {
                    bundle3.putLong("user_id", ((TLRPC.User) tLObject).id);
                }
                dVar.presentFragment(new mu1(bundle3));
                return;
            }
            return;
        }
        if (i3 != 11) {
            if (i3 == 15 && (view instanceof gb2)) {
                gb2 gb2Var = (gb2) view;
                k27 messageObject3 = gb2Var.getMessageObject();
                pcaVar.h.D0();
                int currentAccount2 = dVar.getCurrentAccount();
                na7 messagesController = dVar.getMessagesController();
                long j2 = this.b;
                TLRPC.Chat K0 = messagesController.K0(Long.valueOf(j2));
                cs5 G = cs5.G(pcaVar, wjbVar, gb2Var);
                G.f0 = true;
                G.W(messageObject3.O3() ? 5 : 3);
                G.b(R.drawable.msg_message, k96.M0(2131754877, null), new go6((Object) nfaVar, j2, (Object) messageObject3, (byte) 24), false);
                if (messageObject3.D == 17) {
                    TLRPC.MessageMedia n1 = k27.n1(messageObject3.k);
                    if (n1 instanceof TLRPC.TL_messageMediaPoll) {
                        z = ((TLRPC.TL_messageMediaPoll) n1).poll.closed;
                        if (!z) {
                            if (messageObject3.C()) {
                                G.b(R.drawable.msg_unvote, k96.M0(2131743585, null), new vba(nfaVar, wjbVar, currentAccount2, messageObject3), false);
                            }
                            if (!k27.l3(messageObject3.k) && ((messageObject3.N3() && (!hc2.T(K0) || K0.megagroup)) || (hc2.T(K0) && !K0.megagroup && (K0.creator || ((tL_chatAdminRights = K0.admin_rights) != null && tL_chatAdminRights.edit_messages))))) {
                                G.b(R.drawable.msg_pollstop, k96.M0(messageObject3.b4() ? 2131744589 : 2131744594, null), new vba(nfaVar, wjbVar, messageObject3, currentAccount2), false);
                            }
                        }
                        G.a0();
                        return;
                    }
                }
                z = false;
                if (!z) {
                }
                G.a0();
                return;
            }
            return;
        }
        if (pcaVar.h.getAdapter() != zeaVar) {
            if (nfaVar.F1) {
                if (yeaVar.w.E == 0) {
                    yeaVar.E(view);
                    return;
                }
                return;
            }
            Bundle bundle4 = new Bundle();
            if (i < 0 || i >= yeaVar.f.size()) {
                return;
            }
            up9 up9Var = (up9) yeaVar.f.get(i);
            bundle4.putLong("user_id", dVar.getUserConfig().e());
            bundle4.putInt("chatMode", 3);
            mu1 mu1Var = new mu1(bundle4);
            mu1Var.s4 = up9Var.a;
            dVar.presentFragment(mu1Var);
            return;
        }
        if (i >= 0) {
            ArrayList arrayList = zeaVar.e;
            ArrayList arrayList2 = zeaVar.f;
            int size = arrayList.size();
            ArrayList arrayList3 = zeaVar.e;
            if (i < size) {
                up9 up9Var2 = (up9) arrayList3.get(i);
                Bundle bundle5 = new Bundle();
                bundle5.putLong("user_id", dVar.getUserConfig().e());
                bundle5.putInt("chatMode", 3);
                mu1 mu1Var2 = new mu1(bundle5);
                mu1Var2.s4 = up9Var2.a;
                dVar.presentFragment(mu1Var2);
                return;
            }
            int size2 = i - arrayList3.size();
            if (size2 < arrayList2.size()) {
                k27 k27Var2 = (k27) arrayList2.get(size2);
                Bundle bundle6 = new Bundle();
                bundle6.putLong("user_id", dVar.getUserConfig().e());
                bundle6.putInt("message_id", k27Var2.e1());
                yca ycaVar = new yca(nfaVar, bundle6, size2);
                ycaVar.d8 = k27Var2.e1();
                dVar.presentFragment(ycaVar);
            }
        }
    }

    @Override // d39
    public final boolean q(View view) {
        return false;
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        gk7 gk7Var = this.c;
        switch (b) {
            case 0:
                ((mu1) gk7Var).t9((TLRPC.TL_game) obj3, (k27) obj2, (String) obj, this.b);
                break;
            case 1:
            default:
                kxb kxbVar = (kxb) gk7Var;
                ArrayList arrayList = (ArrayList) obj3;
                HashSet hashSet = (HashSet) obj2;
                jc jcVar = (jc) obj;
                int size = arrayList.size();
                int i2 = 0;
                while (true) {
                    long j = this.b;
                    if (i2 >= size) {
                        kxbVar.l0.addAll(hashSet);
                        kxbVar.n();
                        u21.b0(kxbVar.s).U(k96.J0(hashSet.size(), "TopicsDeleted"), false, new mx8((Object) kxbVar, (Object) hashSet, (Object) arrayList, j, (byte) 17), new a5b(kxbVar, arrayList, jcVar)).j();
                        hdVar.dismiss();
                        break;
                    } else {
                        Object obj4 = arrayList.get(i2);
                        i2++;
                        if (j == ((Integer) obj4).intValue()) {
                            kxbVar.k(0L, false);
                        }
                    }
                }
            case 2:
                ((vqa) gk7Var).j1(this.b, ((TL_stars.starGiftDepositPayload[]) obj3)[0], ((long[]) obj2)[0], hdVar.g(i, true, true), (xu4) obj);
                break;
        }
    }

    public /* synthetic */ xn1(vqa vqaVar, long j, TL_stars.starGiftDepositPayload[] stargiftdepositpayloadArr, long[] jArr, xu4 xu4Var) {
        this.a = (byte) 2;
        this.c = vqaVar;
        this.b = j;
        this.d = stargiftdepositpayloadArr;
        this.e = jArr;
        this.f = xu4Var;
    }

    public /* synthetic */ xn1(kxb kxbVar, ArrayList arrayList, long j, HashSet hashSet, jc jcVar) {
        this.a = (byte) 4;
        this.c = kxbVar;
        this.d = arrayList;
        this.b = j;
        this.e = hashSet;
        this.f = jcVar;
    }

    public /* synthetic */ xn1(mu1 mu1Var, TLRPC.TL_game tL_game, k27 k27Var, String str, long j) {
        this.a = (byte) 0;
        this.c = mu1Var;
        this.d = tL_game;
        this.e = k27Var;
        this.f = str;
        this.b = j;
    }

    @Override // d39
    public final void l(View view, float f, float f2) {
    }
}
