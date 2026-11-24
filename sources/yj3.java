// default package

import android.content.Context;
import android.content.Intent;
import android.util.LongSparseArray;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class yj3 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yj3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        wf3 wf3Var;
        TL_chatlists.TL_chatlists_joinChatlistInvite tL_chatlists_joinChatlistInvite;
        hi3 hi3Var;
        d Q;
        byte b = this.a;
        UndoView undoView = null;
        boolean z = false;
        final byte b2 = 1;
        Object obj = this.b;
        switch (b) {
            case 0:
                ry8 ry8Var = ((ck3) obj).f;
                if (!ry8Var.b()) {
                    ry8Var.setProgress(0.0f);
                    ry8Var.d();
                    break;
                }
                break;
            case 1:
                ((li3) obj).run();
                break;
            case 2:
                ((op3) obj).a();
                break;
            case 3:
                ((qx3) obj).H0();
                break;
            case 4:
                Runnable runnable = ((cy3) obj).R;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 5:
                d04 d04Var = (d04) obj;
                t14 t14Var = d04Var.G;
                ArrayList arrayList = t14Var.o1;
                if (arrayList != null && !arrayList.isEmpty() && ((TLRPC.StickerSetCovered) arrayList.get(0)).set != null) {
                    na7.q1(t14Var.d1).Y3.edit().putLong("emoji_featured_hidden", ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id).commit();
                    d04 d04Var2 = t14Var.S;
                    if (d04Var2 != null) {
                        d04Var2.q(1, 3);
                    }
                    yz3 yz3Var = t14Var.J;
                    if (yz3Var != null) {
                        yz3Var.p(t14Var.getEmojipacks());
                    }
                    d04Var.H();
                    break;
                }
                break;
            case 6:
                m84 m84Var = (m84) view.getParent();
                TLRPC.StickerSetCovered stickerSet = m84Var.getStickerSet();
                t14 t14Var2 = ((o14) obj).R;
                LongSparseArray longSparseArray = t14Var2.z1;
                LongSparseArray longSparseArray2 = t14Var2.A1;
                if (longSparseArray.indexOfKey(stickerSet.set.id) < 0 && longSparseArray2.indexOfKey(stickerSet.set.id) < 0) {
                    if (m84Var.r) {
                        longSparseArray2.put(stickerSet.set.id, stickerSet);
                        t14Var2.u1.i(m84Var.getStickerSet());
                        break;
                    } else {
                        m84Var.b(true, true);
                        longSparseArray.put(stickerSet.set.id, stickerSet);
                        t14Var2.u1.q(m84Var.getStickerSet());
                        break;
                    }
                }
                break;
            case 7:
                ((wb5) obj).dismiss();
                break;
            case 8:
                ((ya0) obj).D0();
                break;
            case 9:
                ((cd4) obj).Y0();
                break;
            case 10:
                ((cd4) ((yc) obj).b).dismiss();
                break;
            case 11:
                ry8 ry8Var2 = (ry8) ((yc) obj).b;
                if (!ry8Var2.b()) {
                    ry8Var2.setProgress(0.0f);
                    ry8Var2.d();
                    break;
                }
                break;
            case 12:
                ((jd4) obj).c();
                break;
            case 13:
                he4 he4Var = (he4) ((jo0) obj).e;
                if (he4Var.A0 && (wf3Var = he4Var.D0) != null) {
                    wf3Var.run();
                    break;
                }
                break;
            case 14:
                ff4 ff4Var = (ff4) obj;
                r86 r86Var = ff4Var.s;
                if ((!ff4Var.r || r86Var.c()) && ff4Var.y != null) {
                    ff4Var.r = true;
                    r86Var.b = -1L;
                    r86Var.c = -1L;
                    ff4Var.n.invalidate();
                    cd4.a1(ff4Var.I, ff4Var.y, new s54((Object) ff4Var, (byte) 14));
                    break;
                }
                break;
            case 15:
                ry8 ry8Var3 = ((gf4) obj).a;
                if (!ry8Var3.b()) {
                    ry8Var3.setProgress(0.0f);
                    ry8Var3.d();
                    break;
                }
                break;
            case 16:
                final kf4 kf4Var = (kf4) obj;
                ff4 ff4Var2 = (ff4) view.getParent();
                final t97 currentFilter = ff4Var2.getCurrentFilter();
                FiltersSetupActivity filtersSetupActivity = kf4Var.e;
                cs5 I = cs5.I(filtersSetupActivity, ff4Var2);
                String M0 = k96.M0(2131750767, null);
                final boolean z2 = z ? 1 : 0;
                I.b(R.drawable.msg_edit, M0, new Runnable() { // from class: if4
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i;
                        byte b3 = z2;
                        t97 t97Var = currentFilter;
                        kf4 kf4Var2 = kf4Var;
                        switch (b3) {
                            case 0:
                                boolean z3 = t97Var.p;
                                FiltersSetupActivity filtersSetupActivity2 = kf4Var2.e;
                                if (!z3) {
                                    filtersSetupActivity2.presentFragment(new pd4(t97Var, null));
                                    break;
                                } else {
                                    Context context = kf4Var2.d;
                                    i = ((d) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new h26(3, i, null, context, filtersSetupActivity2));
                                    break;
                                }
                            default:
                                boolean c = t97Var.c();
                                FiltersSetupActivity filtersSetupActivity3 = kf4Var2.e;
                                if (!c) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                    String M02 = k96.M0(2131750778, null);
                                    hd hdVar = alertDialog$Builder.a;
                                    hdVar.S = M02;
                                    hdVar.U = k96.M0(2131750777, null);
                                    alertDialog$Builder.g(k96.M0(2131752577, null), null);
                                    alertDialog$Builder.j(k96.M0(2131751586, null), new v82(kf4Var2, t97Var, (byte) 28));
                                    filtersSetupActivity3.showDialog(hdVar);
                                    TextView textView = (TextView) hdVar.c(-1);
                                    if (textView != null) {
                                        zkb.X(textView, bkb.p7, null);
                                        break;
                                    }
                                } else {
                                    ll4.b1(filtersSetupActivity3, t97Var.a, new hj3(kf4Var2, (byte) 8));
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
                I.b(R.drawable.msg_delete, k96.M0(2131750775, null), new Runnable() { // from class: if4
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i;
                        byte b3 = b2;
                        t97 t97Var = currentFilter;
                        kf4 kf4Var2 = kf4Var;
                        switch (b3) {
                            case 0:
                                boolean z3 = t97Var.p;
                                FiltersSetupActivity filtersSetupActivity2 = kf4Var2.e;
                                if (!z3) {
                                    filtersSetupActivity2.presentFragment(new pd4(t97Var, null));
                                    break;
                                } else {
                                    Context context = kf4Var2.d;
                                    i = ((d) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new h26(3, i, null, context, filtersSetupActivity2));
                                    break;
                                }
                            default:
                                boolean c = t97Var.c();
                                FiltersSetupActivity filtersSetupActivity3 = kf4Var2.e;
                                if (!c) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                    String M02 = k96.M0(2131750778, null);
                                    hd hdVar = alertDialog$Builder.a;
                                    hdVar.S = M02;
                                    hdVar.U = k96.M0(2131750777, null);
                                    alertDialog$Builder.g(k96.M0(2131752577, null), null);
                                    alertDialog$Builder.j(k96.M0(2131751586, null), new v82(kf4Var2, t97Var, (byte) 28));
                                    filtersSetupActivity3.showDialog(hdVar);
                                    TextView textView = (TextView) hdVar.c(-1);
                                    if (textView != null) {
                                        zkb.X(textView, bkb.p7, null);
                                        break;
                                    }
                                } else {
                                    ll4.b1(filtersSetupActivity3, t97Var.a, new hj3(kf4Var2, (byte) 8));
                                    break;
                                }
                                break;
                        }
                    }
                }, true);
                if (k96.a0) {
                    I.i = (byte) 3;
                }
                I.X(filtersSetupActivity.a.V0(ff4Var2, false));
                I.a0();
                break;
            case 17:
                ll4 ll4Var = (ll4) obj;
                TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates = ll4Var.V1;
                TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = ll4Var.U1;
                ArrayList arrayList2 = ll4Var.d2;
                boolean z3 = ll4Var.W1;
                ArrayList arrayList3 = ll4Var.b2;
                int i = ll4Var.T1;
                d dVar = ll4Var.r1;
                hl4 hl4Var = ll4Var.g2;
                if (hl4Var == null || !hl4Var.r) {
                    if (arrayList3 == null) {
                        ll4Var.dismiss();
                        break;
                    } else if (!arrayList3.isEmpty() || z3) {
                        if (!arrayList2.isEmpty() || !(chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite)) {
                            ArrayList arrayList4 = new ArrayList();
                            for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                                long n = cf3.n((TLRPC.Peer) arrayList3.get(i2));
                                if (arrayList2.contains(Long.valueOf(n))) {
                                    arrayList4.add(dVar.getMessagesController().h1(n));
                                }
                            }
                            if (z3) {
                                TL_chatlists.TL_chatlists_leaveChatlist tL_chatlists_leaveChatlist = new TL_chatlists.TL_chatlists_leaveChatlist();
                                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                                tL_chatlists_leaveChatlist.chatlist = tL_inputChatlistDialogFilter;
                                tL_inputChatlistDialogFilter.filter_id = i;
                                tL_chatlists_leaveChatlist.peers.addAll(arrayList4);
                                tL_chatlists_joinChatlistInvite = tL_chatlists_leaveChatlist;
                            } else if (tL_chatlists_chatlistUpdates == null) {
                                if ((chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) && arrayList4.isEmpty()) {
                                    ll4Var.dismiss();
                                    break;
                                } else {
                                    TL_chatlists.TL_chatlists_joinChatlistInvite tL_chatlists_joinChatlistInvite2 = new TL_chatlists.TL_chatlists_joinChatlistInvite();
                                    tL_chatlists_joinChatlistInvite2.slug = ll4Var.S1;
                                    tL_chatlists_joinChatlistInvite2.peers.addAll(arrayList4);
                                    tL_chatlists_joinChatlistInvite = tL_chatlists_joinChatlistInvite2;
                                }
                            } else if (arrayList4.isEmpty()) {
                                TL_chatlists.TL_chatlists_hideChatlistUpdates tL_chatlists_hideChatlistUpdates = new TL_chatlists.TL_chatlists_hideChatlistUpdates();
                                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter2 = new TL_chatlists.TL_inputChatlistDialogFilter();
                                tL_chatlists_hideChatlistUpdates.chatlist = tL_inputChatlistDialogFilter2;
                                tL_inputChatlistDialogFilter2.filter_id = i;
                                dVar.getConnectionsManager().sendRequest(tL_chatlists_hideChatlistUpdates, null);
                                dVar.getMessagesController().g2(i);
                                ll4Var.dismiss();
                                break;
                            } else {
                                TL_chatlists.TL_chatlists_joinChatlistUpdates tL_chatlists_joinChatlistUpdates = new TL_chatlists.TL_chatlists_joinChatlistUpdates();
                                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter3 = new TL_chatlists.TL_inputChatlistDialogFilter();
                                tL_chatlists_joinChatlistUpdates.chatlist = tL_inputChatlistDialogFilter3;
                                tL_inputChatlistDialogFilter3.filter_id = i;
                                tL_chatlists_joinChatlistUpdates.peers.addAll(arrayList4);
                                tL_chatlists_joinChatlistInvite = tL_chatlists_joinChatlistUpdates;
                            }
                            ui5 parentLayout = dVar.getParentLayout();
                            if (z3) {
                                if (parentLayout != null) {
                                    d lastFragment = parentLayout.getLastFragment();
                                    byte b3 = 2;
                                    if (lastFragment instanceof mu1) {
                                        mu1 mu1Var = (mu1) lastFragment;
                                        mu1Var.Z5();
                                        undoView = mu1Var.N3;
                                    } else if (lastFragment instanceof cj3) {
                                        undoView = ((cj3) lastFragment).u3();
                                    } else if (lastFragment instanceof FiltersSetupActivity) {
                                        undoView = ((FiltersSetupActivity) lastFragment).c0();
                                    } else if (lastFragment instanceof pd4) {
                                        List fragmentStack = parentLayout.getFragmentStack();
                                        if (fragmentStack.size() >= 2 && (oo1.m(2, fragmentStack) instanceof FiltersSetupActivity)) {
                                            FiltersSetupActivity filtersSetupActivity2 = (FiltersSetupActivity) oo1.m(2, fragmentStack);
                                            lastFragment.finishFragment();
                                            undoView = filtersSetupActivity2.c0();
                                        }
                                    }
                                    UndoView undoView2 = undoView;
                                    if (undoView2 == null) {
                                        ll4Var.g2.a(true);
                                        ll4Var.u2 = dVar.getConnectionsManager().sendRequest(tL_chatlists_joinChatlistInvite, new en0((Object) ll4Var, (Object) lastFragment, (Object) arrayList4, (byte) 26));
                                        break;
                                    } else {
                                        ArrayList arrayList5 = new ArrayList();
                                        for (int i3 = 0; i3 < arrayList4.size(); i3++) {
                                            arrayList5.add(Long.valueOf(cf3.m((TLRPC.InputPeer) arrayList4.get(i3))));
                                        }
                                        na7 messagesController = dVar.getMessagesController();
                                        ArrayList arrayList6 = messagesController.I0;
                                        messagesController.H0 = new ArrayList(messagesController.G0);
                                        int i4 = 0;
                                        while (i4 < messagesController.H0.size()) {
                                            if (((t97) messagesController.H0.get(i4)).a == i) {
                                                messagesController.H0.remove(i4);
                                                i4--;
                                            }
                                            i4++;
                                        }
                                        arrayList6.clear();
                                        arrayList6.addAll(arrayList5);
                                        boolean isEmpty = arrayList6.isEmpty();
                                        boolean z4 = !isEmpty;
                                        messagesController.getNotificationCenter().k(kk7.N2, new Object[0]);
                                        if (!isEmpty) {
                                            messagesController.getNotificationCenter().k(3, new Object[0]);
                                        }
                                        Pair pair = new Pair(new z54(messagesController, i, z4, b3), new x6c((byte) 28, messagesController, z4));
                                        undoView2.k(0L, 88, ll4Var.X1, Integer.valueOf(arrayList4.size()), new jf4(ll4Var, tL_chatlists_joinChatlistInvite, pair, b3), (Runnable) pair.second);
                                        ll4Var.v2 = true;
                                        ll4Var.dismiss();
                                        dVar.getMessagesController().g2(i);
                                        break;
                                    }
                                }
                            } else if (parentLayout != null) {
                                pz1 pz1Var = new pz1((Object) ll4Var, (Object) arrayList4, (byte) 21);
                                dl4 dl4Var = tL_chatlists_chatlistUpdates != null ? new dl4(pz1Var, parentLayout) : new dl4(parentLayout, pz1Var);
                                int i5 = 0;
                                while (true) {
                                    if (i5 < arrayList4.size()) {
                                        if (ll4Var.c2.contains(Long.valueOf(cf3.m((TLRPC.InputPeer) arrayList4.get(i5))))) {
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
                                ll4Var.g2.a(true);
                                ll4Var.u2 = dVar.getConnectionsManager().sendRequest(tL_chatlists_joinChatlistInvite, new rv3(ll4Var, dl4Var, (byte) 6));
                                break;
                            }
                        } else {
                            hl4 hl4Var2 = ll4Var.g2;
                            int i6 = -ll4Var.x2;
                            ll4Var.x2 = i6;
                            gl.B3(i6, hl4Var2, null);
                            pw0.E.a();
                            break;
                        }
                    } else {
                        ll4Var.dismiss();
                        break;
                    }
                }
                break;
            case 18:
                no4 no4Var = (no4) obj;
                ArrayList arrayList7 = no4Var.G;
                if (no4Var.d()) {
                    mo4 mo4Var = no4Var.I;
                    if (mo4Var != null && (hi3Var = ((di3) mo4Var).a.D0) != null) {
                        hi3Var.R(false);
                    }
                    for (int i7 = 0; i7 < arrayList7.size(); i7++) {
                        if (no4Var.I != null && ((rf4) arrayList7.get(i7)).h) {
                            ((di3) no4Var.I).a((rf4) arrayList7.get(i7));
                        }
                    }
                    no4Var.c();
                    break;
                } else {
                    Runnable runnable2 = no4Var.E;
                    if (runnable2 != null) {
                        runnable2.run();
                        break;
                    } else {
                        no4Var.r.getText().clear();
                        break;
                    }
                }
                break;
            case 19:
                ((j42) obj).run();
                break;
            case 20:
                ((j42) obj).run();
                break;
            case 21:
                ((ot4) ((nt4) obj)).r.dismiss();
                break;
            case 22:
                lu4 lu4Var = (lu4) obj;
                TextView textView = lu4Var.t1;
                cs5 G = cs5.G(lu4Var.c, lu4Var.J0, textView);
                int[] iArr = lu4.G1;
                for (int i8 = 0; i8 < 6; i8++) {
                    int i9 = iArr[i8];
                    G.h(new sm3((Object) lu4Var, i9, (byte) 8), k96.G(i9 / 3600, "GiftOfferHours", new Object[0]), i9 == lu4Var.B1);
                }
                G.W(5);
                lu4Var.B0(textView, G, true);
                break;
            case 23:
                xu4 xu4Var = (xu4) obj;
                LinkedHashMap linkedHashMap = xu4Var.Z1;
                if (!linkedHashMap.isEmpty()) {
                    ArrayList arrayList8 = new ArrayList(linkedHashMap.values());
                    xu4Var.dismiss();
                    xu4Var.U1.c.a(arrayList8);
                    break;
                }
                break;
            case 24:
                if (((f99) obj).n > 0 && (Q = LaunchActivity.Q()) != null) {
                    ag0 ag0Var = new ag0();
                    ag0Var.a = true;
                    Q.showAsSheet(new jva(), ag0Var);
                    break;
                }
                break;
            case 25:
                wv4 wv4Var = (wv4) obj;
                wv4Var.D0();
                wv4Var.dismiss();
                break;
            case 26:
                ((v65) obj).dismiss();
                break;
            case 27:
                h85 h85Var = (h85) obj;
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().stopScreenCapture();
                }
                h85Var.O.animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setDuration(180L).start();
                break;
            case 28:
                ((o85) obj).f(false);
                break;
            default:
                r85 r85Var = (r85) obj;
                if (VoIPService.getSharedInstance() != null) {
                    Intent action = new Intent(r85Var.getContext(), (Class<?>) LaunchActivity.class).setAction("voip_chat");
                    action.putExtra("currentAccount", VoIPService.getSharedInstance().getAccount());
                    r85Var.getContext().startActivity(action);
                    break;
                }
                break;
        }
    }
}
