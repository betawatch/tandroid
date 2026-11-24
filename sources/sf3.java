// default package

import android.content.Context;
import android.util.LongSparseArray;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class sf3 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sf3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        kh3 kh3Var;
        TL_chatlists.TL_chatlists_joinChatlistInvite tL_chatlists_joinChatlistInvite;
        sj3 sj3Var;
        d Q;
        byte b = this.a;
        byte b2 = 6;
        UndoView undoView = null;
        final byte b3 = 1;
        Object obj = this.b;
        switch (b) {
            case 0:
                final wf3 wf3Var = (wf3) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wf3Var.getContext());
                String M0 = jb6.M0(2131752035, null);
                he heVar = alertDialog$Builder.a;
                heVar.S = M0;
                heVar.U = jb6.M0(2131752033, null);
                final byte b4 = 0;
                alertDialog$Builder.g(jb6.M0(2131752542, null), new ee() { // from class: uf3
                    @Override // ee
                    public final void r(he heVar2, int i) {
                        byte b5 = b4;
                        wf3 wf3Var2 = wf3Var;
                        switch (b5) {
                            case 0:
                                wf3Var2.dismiss();
                                break;
                            default:
                                wf3Var2.dismiss();
                                hi2 hi2Var = wf3Var2.U1;
                                ((y71) hi2Var.c).f0(wf3Var2.T1, wf3Var2.W1, wf3Var2.b2);
                                break;
                        }
                    }
                });
                alertDialog$Builder.j(jb6.M0(2131752038, null), new ee() { // from class: uf3
                    @Override // ee
                    public final void r(he heVar2, int i) {
                        byte b5 = b3;
                        wf3 wf3Var2 = wf3Var;
                        switch (b5) {
                            case 0:
                                wf3Var2.dismiss();
                                break;
                            default:
                                wf3Var2.dismiss();
                                hi2 hi2Var = wf3Var2.U1;
                                ((y71) hi2Var.c).f0(wf3Var2.T1, wf3Var2.W1, wf3Var2.b2);
                                break;
                        }
                    }
                });
                heVar.show();
                heVar.h();
                break;
            case 1:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = ((ActionBarPopupWindow$ActionBarPopupWindowLayout[]) obj)[0];
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                    break;
                }
                break;
            case 2:
                zk3 zk3Var = (zk3) obj;
                oc7.r1(zk3Var.G).s.clear();
                oc7.d1().edit().remove("installReferer").commit();
                zk3Var.f();
                break;
            case 3:
                s09 s09Var = ((ml3) obj).f;
                if (!s09Var.b()) {
                    s09Var.setProgress(0.0f);
                    s09Var.d();
                    break;
                }
                break;
            case 4:
                ((bi3) obj).run();
                break;
            case 5:
                ((yq3) obj).a();
                break;
            case 6:
                ((az3) obj).H0();
                break;
            case 7:
                Runnable runnable = ((mz3) obj).R;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 8:
                o14 o14Var = (o14) obj;
                e34 e34Var = o14Var.G;
                ArrayList arrayList = e34Var.o1;
                if (arrayList != null && !arrayList.isEmpty() && ((TLRPC.StickerSetCovered) arrayList.get(0)).set != null) {
                    oc7.r1(e34Var.d1).Y3.edit().putLong("emoji_featured_hidden", ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id).commit();
                    o14 o14Var2 = e34Var.S;
                    if (o14Var2 != null) {
                        o14Var2.q(1, 3);
                    }
                    j14 j14Var = e34Var.J;
                    if (j14Var != null) {
                        j14Var.p(e34Var.getEmojipacks());
                    }
                    o14Var.H();
                    break;
                }
                break;
            case 9:
                v94 v94Var = (v94) view.getParent();
                TLRPC.StickerSetCovered stickerSet = v94Var.getStickerSet();
                e34 e34Var2 = ((z24) obj).R;
                LongSparseArray longSparseArray = e34Var2.z1;
                LongSparseArray longSparseArray2 = e34Var2.A1;
                if (longSparseArray.indexOfKey(stickerSet.set.id) < 0 && longSparseArray2.indexOfKey(stickerSet.set.id) < 0) {
                    if (v94Var.r) {
                        longSparseArray2.put(stickerSet.set.id, stickerSet);
                        e34Var2.u1.i(v94Var.getStickerSet());
                        break;
                    } else {
                        v94Var.b(true, true);
                        longSparseArray.put(stickerSet.set.id, stickerSet);
                        e34Var2.u1.q(v94Var.getStickerSet());
                        break;
                    }
                }
                break;
            case 10:
                ((ud5) obj).dismiss();
                break;
            case 11:
                ((yb0) obj).D0();
                break;
            case 12:
                ((cf4) obj).Y0();
                break;
            case 13:
                ((cf4) ((yd) obj).b).dismiss();
                break;
            case 14:
                s09 s09Var2 = (s09) ((yd) obj).b;
                if (!s09Var2.b()) {
                    s09Var2.setProgress(0.0f);
                    s09Var2.d();
                    break;
                }
                break;
            case 15:
                ((kf4) obj).c();
                break;
            case 16:
                ig4 ig4Var = (ig4) ((jp0) obj).e;
                if (ig4Var.A0 && (kh3Var = ig4Var.D0) != null) {
                    kh3Var.run();
                    break;
                }
                break;
            case 17:
                hh4 hh4Var = (hh4) obj;
                qa6 qa6Var = hh4Var.s;
                if ((!hh4Var.r || qa6Var.c()) && hh4Var.y != null) {
                    hh4Var.r = true;
                    qa6Var.b = -1L;
                    qa6Var.c = -1L;
                    hh4Var.n.invalidate();
                    cf4.a1(hh4Var.I, hh4Var.y, new a14((Object) hh4Var, (byte) 21));
                    break;
                }
                break;
            case 18:
                s09 s09Var3 = ((ih4) obj).a;
                if (!s09Var3.b()) {
                    s09Var3.setProgress(0.0f);
                    s09Var3.d();
                    break;
                }
                break;
            case 19:
                final lh4 lh4Var = (lh4) obj;
                hh4 hh4Var2 = (hh4) view.getParent();
                final ub7 currentFilter = hh4Var2.getCurrentFilter();
                FiltersSetupActivity filtersSetupActivity = lh4Var.e;
                bu5 I = bu5.I(filtersSetupActivity, hh4Var2);
                final byte b5 = 0;
                I.b(R.drawable.msg_edit, jb6.M0(2131750716, null), new Runnable() { // from class: kh4
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i;
                        byte b6 = b5;
                        ub7 ub7Var = currentFilter;
                        lh4 lh4Var2 = lh4Var;
                        switch (b6) {
                            case 0:
                                boolean z = ub7Var.p;
                                FiltersSetupActivity filtersSetupActivity2 = lh4Var2.e;
                                if (!z) {
                                    filtersSetupActivity2.presentFragment(new qf4(ub7Var, null));
                                    break;
                                } else {
                                    Context context = lh4Var2.d;
                                    i = ((d) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new i46(3, i, null, context, filtersSetupActivity2));
                                    break;
                                }
                            default:
                                boolean c = ub7Var.c();
                                FiltersSetupActivity filtersSetupActivity3 = lh4Var2.e;
                                if (!c) {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                    String M02 = jb6.M0(2131750727, null);
                                    he heVar2 = alertDialog$Builder2.a;
                                    heVar2.S = M02;
                                    heVar2.U = jb6.M0(2131750726, null);
                                    alertDialog$Builder2.g(jb6.M0(2131752542, null), null);
                                    alertDialog$Builder2.j(jb6.M0(2131751535, null), new x92(lh4Var2, ub7Var, (byte) 29));
                                    filtersSetupActivity3.showDialog(heVar2);
                                    TextView textView = (TextView) heVar2.c(-1);
                                    if (textView != null) {
                                        anb.X(textView, cmb.p7, null);
                                        break;
                                    }
                                } else {
                                    ln4.b1(filtersSetupActivity3, ub7Var.a, new sk3(lh4Var2, (byte) 8));
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
                I.b(R.drawable.msg_delete, jb6.M0(2131750724, null), new Runnable() { // from class: kh4
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i;
                        byte b6 = b3;
                        ub7 ub7Var = currentFilter;
                        lh4 lh4Var2 = lh4Var;
                        switch (b6) {
                            case 0:
                                boolean z = ub7Var.p;
                                FiltersSetupActivity filtersSetupActivity2 = lh4Var2.e;
                                if (!z) {
                                    filtersSetupActivity2.presentFragment(new qf4(ub7Var, null));
                                    break;
                                } else {
                                    Context context = lh4Var2.d;
                                    i = ((d) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new i46(3, i, null, context, filtersSetupActivity2));
                                    break;
                                }
                            default:
                                boolean c = ub7Var.c();
                                FiltersSetupActivity filtersSetupActivity3 = lh4Var2.e;
                                if (!c) {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                    String M02 = jb6.M0(2131750727, null);
                                    he heVar2 = alertDialog$Builder2.a;
                                    heVar2.S = M02;
                                    heVar2.U = jb6.M0(2131750726, null);
                                    alertDialog$Builder2.g(jb6.M0(2131752542, null), null);
                                    alertDialog$Builder2.j(jb6.M0(2131751535, null), new x92(lh4Var2, ub7Var, (byte) 29));
                                    filtersSetupActivity3.showDialog(heVar2);
                                    TextView textView = (TextView) heVar2.c(-1);
                                    if (textView != null) {
                                        anb.X(textView, cmb.p7, null);
                                        break;
                                    }
                                } else {
                                    ln4.b1(filtersSetupActivity3, ub7Var.a, new sk3(lh4Var2, (byte) 8));
                                    break;
                                }
                                break;
                        }
                    }
                }, true);
                if (jb6.a0) {
                    I.i = (byte) 3;
                }
                I.X(filtersSetupActivity.a.V0(hh4Var2, false));
                I.a0();
                break;
            case 20:
                ln4 ln4Var = (ln4) obj;
                TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates = ln4Var.V1;
                TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = ln4Var.U1;
                ArrayList arrayList2 = ln4Var.d2;
                boolean z = ln4Var.W1;
                ArrayList arrayList3 = ln4Var.b2;
                int i = ln4Var.T1;
                d dVar = ln4Var.r1;
                hn4 hn4Var = ln4Var.g2;
                if (hn4Var == null || !hn4Var.r) {
                    if (arrayList3 == null) {
                        ln4Var.dismiss();
                        break;
                    } else if (!arrayList3.isEmpty() || z) {
                        if (!arrayList2.isEmpty() || !(chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite)) {
                            ArrayList arrayList4 = new ArrayList();
                            for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                                long n = pg3.n((TLRPC.Peer) arrayList3.get(i2));
                                if (arrayList2.contains(Long.valueOf(n))) {
                                    arrayList4.add(dVar.getMessagesController().i1(n));
                                }
                            }
                            if (z) {
                                TL_chatlists.TL_chatlists_leaveChatlist tL_chatlists_leaveChatlist = new TL_chatlists.TL_chatlists_leaveChatlist();
                                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                                tL_chatlists_leaveChatlist.chatlist = tL_inputChatlistDialogFilter;
                                tL_inputChatlistDialogFilter.filter_id = i;
                                tL_chatlists_leaveChatlist.peers.addAll(arrayList4);
                                tL_chatlists_joinChatlistInvite = tL_chatlists_leaveChatlist;
                            } else if (tL_chatlists_chatlistUpdates == null) {
                                if ((chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) && arrayList4.isEmpty()) {
                                    ln4Var.dismiss();
                                    break;
                                } else {
                                    TL_chatlists.TL_chatlists_joinChatlistInvite tL_chatlists_joinChatlistInvite2 = new TL_chatlists.TL_chatlists_joinChatlistInvite();
                                    tL_chatlists_joinChatlistInvite2.slug = ln4Var.S1;
                                    tL_chatlists_joinChatlistInvite2.peers.addAll(arrayList4);
                                    tL_chatlists_joinChatlistInvite = tL_chatlists_joinChatlistInvite2;
                                }
                            } else if (arrayList4.isEmpty()) {
                                TL_chatlists.TL_chatlists_hideChatlistUpdates tL_chatlists_hideChatlistUpdates = new TL_chatlists.TL_chatlists_hideChatlistUpdates();
                                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter2 = new TL_chatlists.TL_inputChatlistDialogFilter();
                                tL_chatlists_hideChatlistUpdates.chatlist = tL_inputChatlistDialogFilter2;
                                tL_inputChatlistDialogFilter2.filter_id = i;
                                dVar.getConnectionsManager().sendRequest(tL_chatlists_hideChatlistUpdates, null);
                                dVar.getMessagesController().h2(i);
                                ln4Var.dismiss();
                                break;
                            } else {
                                TL_chatlists.TL_chatlists_joinChatlistUpdates tL_chatlists_joinChatlistUpdates = new TL_chatlists.TL_chatlists_joinChatlistUpdates();
                                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter3 = new TL_chatlists.TL_inputChatlistDialogFilter();
                                tL_chatlists_joinChatlistUpdates.chatlist = tL_inputChatlistDialogFilter3;
                                tL_inputChatlistDialogFilter3.filter_id = i;
                                tL_chatlists_joinChatlistUpdates.peers.addAll(arrayList4);
                                tL_chatlists_joinChatlistInvite = tL_chatlists_joinChatlistUpdates;
                            }
                            tk5 parentLayout = dVar.getParentLayout();
                            if (z) {
                                if (parentLayout != null) {
                                    d lastFragment = parentLayout.getLastFragment();
                                    byte b6 = 2;
                                    if (lastFragment instanceof yv1) {
                                        yv1 yv1Var = (yv1) lastFragment;
                                        yv1Var.i6();
                                        undoView = yv1Var.N3;
                                    } else if (lastFragment instanceof nk3) {
                                        undoView = ((nk3) lastFragment).w3();
                                    } else if (lastFragment instanceof FiltersSetupActivity) {
                                        undoView = ((FiltersSetupActivity) lastFragment).d0();
                                    } else if (lastFragment instanceof qf4) {
                                        List fragmentStack = parentLayout.getFragmentStack();
                                        if (fragmentStack.size() >= 2 && (aq1.m(2, fragmentStack) instanceof FiltersSetupActivity)) {
                                            FiltersSetupActivity filtersSetupActivity2 = (FiltersSetupActivity) aq1.m(2, fragmentStack);
                                            lastFragment.finishFragment();
                                            undoView = filtersSetupActivity2.d0();
                                        }
                                    }
                                    UndoView undoView2 = undoView;
                                    if (undoView2 == null) {
                                        ln4Var.g2.a(true);
                                        ln4Var.u2 = dVar.getConnectionsManager().sendRequest(tL_chatlists_joinChatlistInvite, new eo0((Object) ln4Var, (Object) lastFragment, (Object) arrayList4, (byte) 26));
                                        break;
                                    } else {
                                        ArrayList arrayList5 = new ArrayList();
                                        for (int i3 = 0; i3 < arrayList4.size(); i3++) {
                                            arrayList5.add(Long.valueOf(pg3.m((TLRPC.InputPeer) arrayList4.get(i3))));
                                        }
                                        oc7 messagesController = dVar.getMessagesController();
                                        ArrayList arrayList6 = messagesController.I0;
                                        messagesController.H0 = new ArrayList(messagesController.G0);
                                        int i4 = 0;
                                        while (i4 < messagesController.H0.size()) {
                                            if (((ub7) messagesController.H0.get(i4)).a == i) {
                                                messagesController.H0.remove(i4);
                                                i4--;
                                            }
                                            i4++;
                                        }
                                        arrayList6.clear();
                                        arrayList6.addAll(arrayList5);
                                        boolean isEmpty = arrayList6.isEmpty();
                                        boolean z2 = !isEmpty;
                                        messagesController.getNotificationCenter().k(nm7.O2, new Object[0]);
                                        if (!isEmpty) {
                                            messagesController.getNotificationCenter().k(3, new Object[0]);
                                        }
                                        Pair pair = new Pair(new i74(messagesController, i, z2, b6), new y8c((byte) 28, messagesController, z2));
                                        undoView2.k(0L, 88, ln4Var.X1, Integer.valueOf(arrayList4.size()), new if4((Object) ln4Var, (Object) tL_chatlists_joinChatlistInvite, (Object) pair, (byte) 4), (Runnable) pair.second);
                                        ln4Var.v2 = true;
                                        ln4Var.dismiss();
                                        dVar.getMessagesController().h2(i);
                                        break;
                                    }
                                }
                            } else if (parentLayout != null) {
                                qy1 qy1Var = new qy1((Object) ln4Var, (Object) arrayList4, (byte) 22);
                                dn4 dn4Var = tL_chatlists_chatlistUpdates != null ? new dn4(qy1Var, parentLayout) : new dn4(parentLayout, qy1Var);
                                int i5 = 0;
                                while (true) {
                                    if (i5 < arrayList4.size()) {
                                        if (ln4Var.c2.contains(Long.valueOf(pg3.m((TLRPC.InputPeer) arrayList4.get(i5))))) {
                                            i5++;
                                        } else {
                                            boolean[] zArr = new boolean[1];
                                            dVar.getMessagesController().o0(1, zArr);
                                            if (zArr[0]) {
                                                dVar.getNotificationCenter().k(3, new Object[0]);
                                            }
                                        }
                                    }
                                }
                                ln4Var.g2.a(true);
                                ln4Var.u2 = dVar.getConnectionsManager().sendRequest(tL_chatlists_joinChatlistInvite, new cx3(ln4Var, dn4Var, b2));
                                break;
                            }
                        } else {
                            hn4 hn4Var2 = ln4Var.g2;
                            int i6 = -ln4Var.x2;
                            ln4Var.x2 = i6;
                            gm.A3(i6, hn4Var2, null);
                            xx0.E.a();
                            break;
                        }
                    } else {
                        ln4Var.dismiss();
                        break;
                    }
                }
                break;
            case 21:
                oq4 oq4Var = (oq4) obj;
                ArrayList arrayList7 = oq4Var.G;
                if (oq4Var.d()) {
                    nq4 nq4Var = oq4Var.I;
                    if (nq4Var != null && (sj3Var = ((pj3) nq4Var).a.D0) != null) {
                        sj3Var.R(false);
                    }
                    for (int i7 = 0; i7 < arrayList7.size(); i7++) {
                        if (oq4Var.I != null && ((sh4) arrayList7.get(i7)).h) {
                            ((pj3) oq4Var.I).a((sh4) arrayList7.get(i7));
                        }
                    }
                    oq4Var.c();
                    break;
                } else {
                    Runnable runnable2 = oq4Var.E;
                    if (runnable2 != null) {
                        runnable2.run();
                        break;
                    } else {
                        oq4Var.r.getText().clear();
                        break;
                    }
                }
                break;
            case 22:
                ((u52) obj).run();
                break;
            case 23:
                ((u52) obj).run();
                break;
            case 24:
                ((qv4) ((pv4) obj)).r.dismiss();
                break;
            case 25:
                mw4 mw4Var = (mw4) obj;
                TextView textView = mw4Var.t1;
                bu5 G = bu5.G(mw4Var.c, mw4Var.J0, textView);
                int[] iArr = mw4.G1;
                for (int i8 = 0; i8 < 6; i8++) {
                    int i9 = iArr[i8];
                    G.h(new bm3((Object) mw4Var, i9, (byte) 10), jb6.G(i9 / 3600, "GiftOfferHours", new Object[0]), i9 == mw4Var.B1);
                }
                G.W(5);
                mw4Var.B0(textView, G, true);
                break;
            case 26:
                yw4 yw4Var = (yw4) obj;
                LinkedHashMap linkedHashMap = yw4Var.Z1;
                if (!linkedHashMap.isEmpty()) {
                    ArrayList arrayList8 = new ArrayList(linkedHashMap.values());
                    yw4Var.dismiss();
                    yw4Var.U1.c.a(arrayList8);
                    break;
                }
                break;
            case 27:
                if (((fb9) obj).n > 0 && (Q = LaunchActivity.Q()) != null) {
                    bh0 bh0Var = new bh0();
                    bh0Var.a = true;
                    Q.showAsSheet(new nxa(), bh0Var);
                    break;
                }
                break;
            case 28:
                yx4 yx4Var = (yx4) obj;
                yx4Var.D0();
                yx4Var.dismiss();
                break;
            default:
                ((t85) obj).dismiss();
                break;
        }
    }
}
