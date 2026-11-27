// default package

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.DataAutoDownloadActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class u implements r69 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // r69
    public final void e(int i, View view) {
        TLRPC.InputStickerSet tL_inputStickerSetShortName;
        TLRPC.StickerSet stickerSet;
        byte b;
        jb0 jb0Var;
        TLRPC.Chat chat;
        String M0;
        String a0;
        s8b s8bVar;
        jy2 jy2Var;
        a aVar;
        TLRPC.Document document;
        wl wlVar;
        TLRPC.StickerSet stickerSet2;
        ef4 ef4Var;
        d31 b0;
        int i2;
        byte b2 = this.a;
        byte b3 = 2;
        int i3 = -1;
        Object obj = null;
        TLRPC.BotInlineResult botInlineResult = null;
        r11 = null;
        r11 = null;
        gy2 O = null;
        obj = null;
        int i4 = 0;
        Object obj2 = this.b;
        switch (b2) {
            case 0:
                ((b1) obj2).Q2.G(i - 1);
                break;
            case 1:
                ((f0) obj2).b2.G(i - 1);
                break;
            case 2:
                ((cc) obj2).H0(i);
                break;
            case 3:
                ds dsVar = (ds) obj2;
                if (i >= 0 && i < dsVar.h.size()) {
                    byte b4 = ((bs) dsVar.h.get(i)).d;
                    if (b4 == 1) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings = dsVar.d;
                        boolean z = !globalPrivacySettings.keep_archived_unmuted;
                        globalPrivacySettings.keep_archived_unmuted = z;
                        ((wkb) view).setChecked(z);
                        dsVar.c = true;
                        break;
                    } else if (b4 == 4) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings2 = dsVar.d;
                        boolean z2 = !globalPrivacySettings2.keep_archived_folders;
                        globalPrivacySettings2.keep_archived_folders = z2;
                        ((wkb) view).setChecked(z2);
                        dsVar.c = true;
                        break;
                    } else if (b4 == 7) {
                        if (!dsVar.getUserConfig().p() && !dsVar.getMessagesController().l4.T0.f && !dsVar.d.archive_and_mute_new_noncontact_peers) {
                            n21 n21Var = new n21(dsVar.getParentActivity(), dsVar.getResourceProvider());
                            n21Var.b.setText(hl.N2(ob6.M0(2131743521, null), aob.xj, 0, new c1(dsVar, (byte) 18), null));
                            n21Var.b.setSingleLine(false);
                            n21Var.b.setPadding(0, hl.L(4.0f), 0, hl.L(4.0f));
                            n21Var.a.setImageResource(R.drawable.msg_settings_premium);
                            v21.g(dsVar, n21Var, 3500).j();
                            int i5 = -dsVar.e;
                            dsVar.e = i5;
                            hl.A3(i5, view, null);
                            yw0.E.a();
                            break;
                        } else {
                            TLRPC.GlobalPrivacySettings globalPrivacySettings3 = dsVar.d;
                            boolean z3 = !globalPrivacySettings3.archive_and_mute_new_noncontact_peers;
                            globalPrivacySettings3.archive_and_mute_new_noncontact_peers = z3;
                            ((wkb) view).setChecked(z3);
                            dsVar.c = true;
                            break;
                        }
                    }
                }
                break;
            case 4:
                is isVar = (is) obj2;
                if (i >= isVar.y && i < isVar.E && isVar.getParentActivity() != null) {
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) isVar.h.get(i - isVar.y);
                    if (stickerSetCovered.set.id != 0) {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetID();
                        stickerSet = stickerSetCovered.set;
                        tL_inputStickerSetShortName.id = stickerSet.id;
                    } else {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                        stickerSet = stickerSetCovered.set;
                        tL_inputStickerSetShortName.short_name = stickerSet.short_name;
                    }
                    TLRPC.InputStickerSet inputStickerSet = tL_inputStickerSetShortName;
                    inputStickerSet.access_hash = stickerSet.access_hash;
                    s4b s4bVar = new s4b(isVar.getParentActivity(), isVar, inputStickerSet, null, null, null);
                    s4bVar.W1 = new gs(isVar, view, stickerSetCovered);
                    isVar.showDialog(s4bVar);
                    break;
                }
                break;
            case 5:
                ((kp9) obj2).b0(i);
                break;
            case 6:
                kb0 kb0Var = (kb0) obj2;
                kr krVar = kb0Var.i3;
                ob0 ob0Var = kb0Var.k3;
                if (view instanceof lb0) {
                    lb0 lb0Var = (lb0) view;
                    if (!lb0Var.d) {
                        jb0 jb0Var2 = lb0Var.a;
                        kb0Var.h3 = jb0Var2.a;
                        ob0Var.a.b(jb0Var2, false);
                        if (krVar != null) {
                            krVar.f();
                        }
                        ob0Var.r0();
                        break;
                    }
                }
                if (kb0Var.h3 != 1 && (jb0Var = kb0Var.j3) != null) {
                    kb0Var.h3 = 1;
                    ob0Var.a.b(jb0Var, true);
                    if (krVar != null) {
                        krVar.f();
                    }
                    ob0Var.r0();
                    break;
                } else if (ob0Var.T == null) {
                    if (!ob0Var.a.w) {
                        ob0Var.k0(true, true, true);
                    }
                    jb0 jb0Var3 = ob0Var.a.h;
                    boolean[] zArr = {false};
                    hl.U2(ob0Var.getParentActivity(), ob0Var.getClassGuid());
                    ab0 ab0Var = new ab0(ob0Var, ob0Var.getParentActivity());
                    ob0Var.T = ab0Var;
                    ab0Var.J();
                    ob0Var.T.L0 = false;
                    ob0Var.h = true;
                    ob0Var.e.setBackground(new BitmapDrawable(ob0Var.getParentActivity().getResources(), hl.h2(12.0f, 10, ob0Var.fragmentView)));
                    ob0Var.h = false;
                    ob0Var.e.setVisibility(0);
                    ob0Var.e.setAlpha(0.0f);
                    ob0Var.f = true;
                    ob0Var.fragmentView.invalidate();
                    ob0Var.e.animate().setListener(new bb0(ob0Var, (byte) 0)).alpha(1.0f).setDuration(200L).start();
                    ob0Var.Z = new jb0();
                    cb0 cb0Var = new cb0(ob0Var.getParentActivity(), false, new za0(ob0Var, b3));
                    jb0 jb0Var4 = ob0Var.a.h;
                    if (jb0Var4 != null) {
                        jb0 jb0Var5 = ob0Var.Z;
                        int i6 = jb0Var4.f;
                        jb0Var5.f = i6;
                        b = 3;
                        cb0Var.e(i6, 3);
                        jb0 jb0Var6 = ob0Var.Z;
                        int i7 = ob0Var.a.h.e;
                        jb0Var6.e = i7;
                        cb0Var.e(i7, 2);
                        jb0 jb0Var7 = ob0Var.Z;
                        int i8 = ob0Var.a.h.d;
                        jb0Var7.d = i8;
                        cb0Var.e(i8, 1);
                        jb0 jb0Var8 = ob0Var.Z;
                        int i9 = ob0Var.a.h.c;
                        jb0Var8.c = i9;
                        cb0Var.e(i9, 0);
                    } else {
                        b = 3;
                    }
                    jb0 jb0Var9 = ob0Var.Z;
                    if (jb0Var9.f != 0) {
                        b3 = 4;
                    } else if (jb0Var9.e != 0) {
                        b3 = b;
                    } else if (jb0Var9.d == 0) {
                        b3 = 1;
                    }
                    cb0Var.f(-1, 4, b3, false);
                    ob0Var.a.b(ob0Var.Z, true);
                    ob0Var.r0();
                    LinearLayout linearLayout = new LinearLayout(ob0Var.getParentActivity());
                    linearLayout.setOrientation(1);
                    linearLayout.setPadding(0, hl.L(8.0f), 0, 0);
                    linearLayout.addView(cb0Var);
                    FrameLayout frameLayout = new FrameLayout(ob0Var.getParentActivity());
                    frameLayout.setBackground(rnb.f(aob.Fi, 8.0f));
                    TextView textView = new TextView(ob0Var.getParentActivity());
                    bs2.r(14.0f, 1, 2131745266, textView, null);
                    textView.setGravity(17);
                    textView.setTypeface(hl.o());
                    yob.X(textView, aob.Ji, null);
                    frameLayout.addView(textView, tre.e(-2, -2, 17));
                    linearLayout.addView(frameLayout, tre.d(-1, 48.0f, 0, 16.0f, -8.0f, 16.0f, 16.0f));
                    frameLayout.setOnClickListener(new t(ob0Var, zArr, (byte) 22));
                    ab0 ab0Var2 = ob0Var.T;
                    ab0Var2.O = linearLayout;
                    ab0Var2.Q0 = true;
                    ab0Var2.p0 = false;
                    ab0Var2.show();
                    ob0Var.isLightStatusBar();
                    break;
                }
                break;
            case 7:
                gr0 gr0Var = (gr0) obj2;
                bga bgaVar = gr0Var.a0;
                e eVar = bgaVar.a;
                if (view instanceof jja) {
                    r47 messageObject = ((jja) view).getMessageObject();
                    if (bgaVar.H.F1) {
                        if (bgaVar.c(messageObject)) {
                            bgaVar.g(messageObject);
                            break;
                        } else {
                            bgaVar.e(messageObject);
                            break;
                        }
                    } else {
                        lcb orCreateStoryViewer = eVar.getOrCreateStoryViewer();
                        Context context = gr0Var.getContext();
                        int e1 = messageObject.e1();
                        p5b p5bVar = gr0Var.a;
                        l6b a = l6b.a(gr0Var.f);
                        if ((eVar instanceof ProfileActivity) && ((ProfileActivity) eVar).s1) {
                            i4 = hl.L(68.0f);
                        }
                        a.s += i4;
                        orCreateStoryViewer.G(context, e1, p5bVar, a);
                        break;
                    }
                }
                break;
            case 8:
                uh1 uh1Var = (uh1) obj2;
                ArrayList arrayList = uh1Var.c;
                qob qobVar = uh1Var.d;
                if (i >= 0 && i < arrayList.size()) {
                    ne2 ne2Var = (ne2) arrayList.get(i);
                    uh1Var.a(ne2Var.a(), true);
                    if (view.getLeft() < hl.L(24.0f) + qobVar.getPaddingLeft()) {
                        qobVar.y0(-((hl.L(48.0f) + qobVar.getPaddingLeft()) - view.getLeft()), 0, null);
                    } else if (view.getWidth() + view.getLeft() > (qobVar.getMeasuredWidth() - qobVar.getPaddingRight()) - hl.L(24.0f)) {
                        qobVar.y0(uh9.f(48.0f, qobVar.getMeasuredWidth() - qobVar.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                    }
                    pcc pccVar = uh1Var.r;
                    if (pccVar != null) {
                        pccVar.a(ne2Var.a());
                        break;
                    }
                }
                break;
            case 9:
                f72 f72Var = (f72) obj2;
                c72 c72Var = f72Var.y;
                n12 n12Var = f72Var.b;
                j79 adapter = f72Var.s.getAdapter();
                d72 d72Var = f72Var.E;
                if (adapter == d72Var) {
                    ArrayList arrayList2 = d72Var.d;
                    int i10 = i - 1;
                    if (i10 >= 0 && i10 < arrayList2.size()) {
                        obj = arrayList2.get(i10);
                    }
                } else {
                    int S = c72Var.S(i);
                    int Q = c72Var.Q(i);
                    if (Q >= 0 && S >= 0) {
                        obj = c72Var.O(S, Q);
                    }
                }
                if (obj instanceof a19) {
                    if (yac.h(n12Var.G3).p()) {
                        a19 a19Var = (a19) obj;
                        jj.X(n12Var.G3, n12Var.W0(), a19Var.a(), new rx1((Object) f72Var, (Object) a19Var, (byte) 5));
                        break;
                    } else if (n12Var.Z1 != null) {
                        new xk8(n12Var.Z1, f72Var.getContext(), n12Var.G3, true, 31, false, null).show();
                        break;
                    }
                }
                break;
            case 10:
                na2 na2Var = (na2) obj2;
                boolean z4 = na2Var.s;
                if (na2Var.getParentActivity() != null) {
                    j79 adapter2 = na2Var.b.getAdapter();
                    ma2 ma2Var = na2Var.e;
                    if (adapter2 == ma2Var) {
                        chat = (TLRPC.Chat) ma2Var.d.get(i);
                    } else {
                        int i11 = na2Var.H;
                        chat = (i < i11 || i >= na2Var.I) ? null : (TLRPC.Chat) na2Var.w.get(i - i11);
                    }
                    if (chat != null) {
                        if (!z4 || na2Var.h.linked_chat_id != 0) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", chat.id);
                            na2Var.presentFragment(new zu1(bundle));
                            break;
                        } else {
                            na2Var.e0(chat, true);
                            break;
                        }
                    } else if (i == na2Var.G) {
                        if (!z4 || na2Var.h.linked_chat_id != 0) {
                            if (!na2Var.w.isEmpty()) {
                                TLRPC.Chat chat2 = (TLRPC.Chat) na2Var.w.get(0);
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(na2Var.getParentActivity());
                                if (z4) {
                                    M0 = ob6.M0(2131751336, null);
                                    a0 = ob6.a0("DiscussionUnlinkChannelAlert", null, 2131751337, chat2.title);
                                } else {
                                    M0 = ob6.M0(2131751338, null);
                                    a0 = ob6.a0("DiscussionUnlinkGroupAlert", null, 2131751335, chat2.title);
                                }
                                alertDialog$Builder.a.S = M0;
                                alertDialog$Builder.a.U = hl.S2(a0);
                                alertDialog$Builder.j(ob6.M0(2131751339, null), new rd1((Object) na2Var, (byte) 23));
                                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                                id idVar = alertDialog$Builder.a;
                                na2Var.showDialog(idVar);
                                TextView textView2 = (TextView) idVar.c(-1);
                                if (textView2 != null) {
                                    yob.X(textView2, aob.q7, null);
                                    break;
                                }
                            }
                        } else {
                            Bundle bundle2 = new Bundle();
                            bundle2.putLongArray("result", new long[]{na2Var.getUserConfig().e()});
                            bundle2.putInt("chatType", 4);
                            TLRPC.Chat chat3 = na2Var.f;
                            if (chat3 != null) {
                                bundle2.putString("title", ob6.a0("GroupCreateDiscussionDefaultName", null, 2131749208, chat3.title));
                            }
                            xc5 xc5Var = new xc5(bundle2);
                            xc5Var.Z = new fa2(na2Var);
                            na2Var.presentFragment(xc5Var);
                            break;
                        }
                    }
                }
                break;
            case 11:
                ed2 ed2Var = (ed2) obj2;
                ArrayList arrayList3 = ed2Var.n;
                if (i > 2) {
                    xa0 xa0Var = (xa0) view;
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) arrayList3.get(i - 3);
                    boolean contains = ed2Var.d.contains(tL_availableReaction.reaction);
                    boolean z5 = !contains;
                    ArrayList arrayList4 = ed2Var.d;
                    String str = tL_availableReaction.reaction;
                    if (contains) {
                        arrayList4.remove(str);
                        if (ed2Var.d.isEmpty()) {
                            dd2 dd2Var = ed2Var.h;
                            if (dd2Var != null) {
                                dd2Var.q(2, arrayList3.size() + 1);
                            }
                            ed2Var.Z(2, true);
                        }
                    } else {
                        arrayList4.add(str);
                    }
                    Switch r0 = xa0Var.c;
                    if (r0 != null) {
                        r0.c(z5, true);
                    }
                    og2 og2Var = xa0Var.d;
                    if (og2Var != null) {
                        og2Var.a(z5, true);
                        break;
                    }
                }
                break;
            case 12:
                oe2 oe2Var = (oe2) obj2;
                d79 d79Var = oe2Var.v1;
                me2 me2Var = oe2Var.q1;
                if (me2Var.d.get(i) != oe2Var.F1 && oe2Var.K1 == null) {
                    oe2Var.F1 = (ne2) me2Var.d.get(i);
                    oe2Var.N0();
                    me2Var.E(i);
                    oe2Var.b.postDelayed(new gf0(oe2Var, i, b3), 100L);
                    while (i4 < d79Var.getChildCount()) {
                        zqb zqbVar = (zqb) d79Var.getChildAt(i4);
                        if (zqbVar != view && (s8bVar = zqbVar.K) != null) {
                            hl.r(s8bVar);
                            zqbVar.K.run();
                        }
                        i4++;
                    }
                    if (!((ne2) me2Var.d.get(i)).a.a) {
                        ((zqb) view).d();
                    }
                    oe2Var.V0(true);
                    break;
                }
                break;
            case 13:
                dg2 dg2Var = (dg2) obj2;
                b8c G = dg2Var.Z1.G(i - 1);
                if (G != null) {
                    u41 u41Var = dg2Var.U1;
                    if (!u41Var.h(G)) {
                        int i12 = G.d;
                        if (i12 == -1) {
                            dg2Var.a2 = true;
                            u41Var.h = true;
                            dg2Var.Z1.O(true);
                            dg2Var.Z0(true);
                            break;
                        } else {
                            int i13 = dg2.f2;
                            if (i12 == -2) {
                                dg2Var.a2 = false;
                                u41Var.h = false;
                                dg2Var.Z1.O(true);
                                dg2Var.Z0(true);
                                break;
                            }
                        }
                    }
                }
                break;
            case 14:
                pcc pccVar2 = ((el2) obj2).c;
                if (pccVar2 != null) {
                    pccVar2.a((al2) al2.a().get(i));
                    break;
                }
                break;
            case 15:
                kn2 kn2Var = (kn2) obj2;
                int i14 = kn2Var.S1.G(i - 1).d;
                if (i14 == 151) {
                    kn2Var.a1(false);
                    break;
                } else if (i14 == 150) {
                    kn2Var.a1(true);
                    break;
                }
                break;
            case 16:
                nw2 nw2Var = (nw2) obj2;
                TLRPC.StickerSetCovered stickerSetCovered2 = ((qw2) view).d;
                rw2 rw2Var = nw2Var.a;
                e53 reactionsWindow = rw2Var.P.getReactionsWindow();
                if (reactionsWindow != null && !reactionsWindow.q) {
                    reactionsWindow.d();
                }
                if (stickerSetCovered2 instanceof TLRPC.TL_stickerSetNoCovered) {
                    x4b.c(null, rw2Var.c0, rw2Var.z.getContext(), new n82(nw2Var, (byte) 12));
                    break;
                } else {
                    pw2 pw2Var = rw2Var.l;
                    if (pw2Var != null) {
                        pw2Var.t(stickerSetCovered2.set, TextUtils.join("", rw2Var.o));
                    }
                    rw2Var.d();
                    break;
                }
                break;
            case 17:
                ky2 ky2Var = (ky2) obj2;
                if (ky2Var.f && ky2Var.e) {
                    m32 m32Var = ky2Var.d;
                    ArrayList arrayList5 = m32Var.e;
                    if (arrayList5 != null && i >= 0 && i < arrayList5.size()) {
                        O = (gy2) m32Var.e.get(i);
                    }
                } else {
                    int S2 = ky2Var.c.S(i);
                    int Q2 = ky2Var.c.Q(i);
                    if (Q2 >= 0 && S2 >= 0) {
                        O = ky2Var.c.O(S2, Q2);
                    }
                }
                if (i >= 0) {
                    ky2Var.finishFragment();
                    if (O != null && (jy2Var = ky2Var.r) != null) {
                        jy2Var.B(O);
                        break;
                    }
                }
                break;
            case 18:
                h13 h13Var = (h13) obj2;
                d79 d79Var2 = h13Var.n1;
                if (i > 3) {
                    h13Var.Y1 = (TLRPC.Peer) h13Var.T1.get(i - 4);
                    if (view instanceof bd5) {
                        ((bd5) view).c(true, true);
                    }
                    for (int i15 = 0; i15 < d79Var2.getChildCount(); i15++) {
                        View childAt = d79Var2.getChildAt(i15);
                        if (childAt != view && (childAt instanceof bd5)) {
                            ((bd5) childAt).c(false, true);
                        }
                    }
                    break;
                }
                break;
            case 19:
                x83 x83Var = (x83) obj2;
                ArrayList arrayList6 = x83Var.k3;
                a93 a93Var = x83Var.w3;
                if (!(view instanceof q83) || i < 0 || i >= arrayList6.size()) {
                    if (view instanceof skb) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(a93Var.getParentActivity());
                        alertDialog$Builder2.a.S = ob6.M0(2131745816, null);
                        alertDialog$Builder2.a.U = ob6.M0(2131745817, null);
                        alertDialog$Builder2.j(ob6.M0(2131745845, null), new t83(x83Var));
                        alertDialog$Builder2.g(ob6.M0(2131752570, null), null);
                        id idVar2 = alertDialog$Builder2.a;
                        a93Var.showDialog(idVar2);
                        TextView textView3 = (TextView) idVar2.c(-1);
                        if (textView3 != null) {
                            yob.X(textView3, aob.q7, null);
                            break;
                        }
                    }
                } else {
                    s83 s83Var = (s83) arrayList6.get(i);
                    if (s83Var != null) {
                        int i16 = s83Var.h;
                        if (i16 >= 0) {
                            x83Var.q3[i16] = !r2[i16];
                            x83Var.E1(true);
                            break;
                        } else if (i16 == -2) {
                            a93Var.presentFragment(new DataAutoDownloadActivity(x83Var.g3 - 1));
                            break;
                        }
                    }
                }
                break;
            case 20:
                ((ii3) obj2).i((og3) view, false);
                break;
            case 21:
                tl3 tl3Var = (tl3) obj2;
                if (view instanceof fg5) {
                    fg5 fg5Var = (fg5) view;
                    if (fg5Var.F) {
                        dj3 dj3Var = tl3Var.V;
                        if (dj3Var != null) {
                            dj3Var.a.i5(fg5Var.getDialogId(), view);
                            break;
                        }
                    }
                }
                dj3 dj3Var2 = tl3Var.V;
                if (dj3Var2 != null) {
                    uj3 uj3Var = dj3Var2.a;
                    long longValue = ((Long) view.getTag()).longValue();
                    if (uj3Var.n2) {
                        if (uj3Var.H5(longValue)) {
                            if (uj3Var.K2.isEmpty()) {
                                uj3Var.k3(longValue, 0L, true, null);
                                break;
                            } else {
                                uj3Var.m3(longValue, uj3Var.A2(longValue, null));
                                uj3Var.y5();
                                aVar = ((e) uj3Var).actionBar;
                                aVar.o(true);
                                break;
                            }
                        }
                    } else {
                        Bundle bundle3 = new Bundle();
                        if (wf3.D(longValue)) {
                            bundle3.putLong("user_id", longValue);
                        } else {
                            bundle3.putLong("chat_id", -longValue);
                        }
                        uj3Var.f3();
                        if (hl.O1() && uj3Var.f0 != null) {
                            int i17 = 0;
                            while (true) {
                                tj3[] tj3VarArr = uj3Var.f0;
                                if (i17 < tj3VarArr.length) {
                                    yh3 yh3Var = tj3VarArr[i17].d;
                                    uj3Var.r2.a = longValue;
                                    yh3Var.s = longValue;
                                    i17++;
                                } else {
                                    int i18 = uc7.s5;
                                    uj3Var.G5(512, true);
                                }
                            }
                        }
                        if (uj3Var.p2 != null) {
                            if (uj3Var.getMessagesController().C(bundle3, uj3Var, null, null)) {
                                uj3Var.getNotificationCenter().k(4, new Object[0]);
                                uj3Var.presentFragment(new zu1(bundle3));
                                break;
                            }
                        } else if (uj3Var.getMessagesController().C(bundle3, uj3Var, null, null)) {
                            uj3Var.presentFragment(new zu1(bundle3));
                            break;
                        }
                    }
                }
                break;
            case 22:
                hw3 hw3Var = (hw3) obj2;
                zw3 zw3Var = hw3Var.r;
                Object E = hw3Var.c.E(i);
                if (E instanceof TLRPC.BotInlineResult) {
                    botInlineResult = (TLRPC.BotInlineResult) E;
                    document = botInlineResult.document;
                } else if (E instanceof TLRPC.Document) {
                    document = (TLRPC.Document) E;
                }
                lcc lccVar = zw3Var.y1;
                if (lccVar != null) {
                    lccVar.h(botInlineResult, document, Boolean.TRUE);
                }
                zw3Var.dismiss();
                break;
            case 23:
                ow3 ow3Var = (ow3) obj2;
                zw3 zw3Var2 = ow3Var.s;
                nw3 nw3Var = ow3Var.c;
                if (i >= 0) {
                    ow3Var.d.getClass();
                    if (RecyclerView.V(view).f != 4) {
                        ArrayList arrayList7 = nw3Var.s;
                        ArrayList arrayList8 = nw3Var.w;
                        TLRPC.Document document2 = i < arrayList7.size() ? (TLRPC.Document) nw3Var.s.get(i) : null;
                        if (document2 == zw3Var2.o1) {
                            z31 z31Var = zw3Var2.z1;
                            if (z31Var != null) {
                                z31Var.run();
                            }
                            zw3Var2.dismiss();
                            break;
                        } else {
                            long longValue2 = i >= arrayList8.size() ? 0L : ((Long) arrayList8.get(i)).longValue();
                            if (document2 == null && (view instanceof cw3) && (wlVar = ((cw3) view).d) != null) {
                                document2 = wlVar.e;
                            }
                            if (document2 == null && longValue2 != 0) {
                                document2 = wl.e(zw3Var2.a, longValue2);
                            }
                            if (document2 != null) {
                                lcc lccVar2 = zw3Var2.y1;
                                if (lccVar2 != null) {
                                    lccVar2.h(nw3Var.f.get(Long.valueOf(document2.id)), document2, Boolean.FALSE);
                                }
                                zw3Var2.dismiss();
                                break;
                            }
                        }
                    }
                }
                break;
            case 24:
                o24 o24Var = ((y04) obj2).G;
                int i19 = o24Var.d1;
                if (view.getTag() instanceof TLRPC.StickerSetCovered) {
                    TLRPC.StickerSetCovered stickerSetCovered3 = (TLRPC.StickerSetCovered) view.getTag();
                    ArrayList arrayList9 = new ArrayList();
                    e eVar2 = o24Var.Z1;
                    ArrayList arrayList10 = ls6.d0(i19).t0[1];
                    while (i4 < arrayList10.size()) {
                        TLRPC.StickerSetCovered stickerSetCovered4 = (TLRPC.StickerSetCovered) arrayList10.get(i4);
                        if (stickerSetCovered4 != null && stickerSetCovered4.set != null) {
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                            TLRPC.StickerSet stickerSet3 = stickerSetCovered4.set;
                            tL_inputStickerSetID.id = stickerSet3.id;
                            tL_inputStickerSetID.access_hash = stickerSet3.access_hash;
                            arrayList9.add(tL_inputStickerSetID);
                            if (stickerSetCovered3 != null && (stickerSet2 = stickerSetCovered3.set) != null && stickerSet2.id == stickerSetCovered4.set.id) {
                                i3 = i4;
                            }
                        }
                        i4++;
                    }
                    ls6.d0(i19).e1(true, true);
                    ly3 ly3Var = new ly3(eVar2, o24Var.getContext(), eVar2 == null ? o24Var.a2 : eVar2.getResourceProvider(), arrayList9);
                    if (i3 >= 0) {
                        ly3Var.I1 = i3;
                    }
                    if (eVar2 != null) {
                        eVar2.showDialog(ly3Var);
                        break;
                    } else {
                        ly3Var.show();
                        break;
                    }
                }
                break;
            case 25:
                o24 o24Var2 = ((g24) obj2).w;
                o24Var2.u1.g(new d6c(o24Var2.getContext(), new j04(o24Var2), o24Var2.y1, o24Var2.z1, o24Var2.A1, (TLRPC.StickerSetCovered) view.getTag(), o24Var2.a2));
                break;
            case 26:
                ((je4) obj2).e0(i, view);
                break;
            case 27:
                nf4 nf4Var = (nf4) obj2;
                if (nf4Var.getParentActivity() != null && (ef4Var = (ef4) nf4Var.Q.get(i)) != null) {
                    View.OnClickListener onClickListener = ef4Var.c;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                        break;
                    } else {
                        int i20 = ef4Var.a;
                        if (i20 == 1) {
                            vac vacVar = (vac) view;
                            nf4Var.B0(ef4Var, vacVar.getName(), vacVar.getCurrentObject(), ef4Var.g);
                            break;
                        } else if (i20 == 7) {
                            vx3 vx3Var = new vx3(nf4Var, ef4Var, (byte) 26);
                            if (nf4Var.c.x.f) {
                                nf4Var.y0(vx3Var, false);
                                break;
                            } else {
                                vx3Var.run();
                                break;
                            }
                        } else if (i20 == 8 || (i20 == 4 && ef4Var.k == R.drawable.msg2_link2)) {
                            ac7 ac7Var = nf4Var.r;
                            yw0 yw0Var = yw0.E;
                            if (!nf4Var.s || !nf4Var.c.x.f) {
                                if (!TextUtils.isEmpty(nf4Var.x) || !TextUtils.isEmpty(ac7Var.b)) {
                                    int i21 = nf4Var.E;
                                    int i22 = uc7.s5;
                                    if ((i21 & (-1537)) == 0 && nf4Var.H.isEmpty() && !nf4Var.G.isEmpty()) {
                                        nf4Var.y0(new oe4(nf4Var, (byte) 1), false);
                                        break;
                                    }
                                }
                                float f = -nf4Var.R;
                                nf4Var.R = f;
                                hl.A3(f, view, null);
                                yw0Var.a();
                                if (TextUtils.isEmpty(nf4Var.x) && TextUtils.isEmpty(ac7Var.b)) {
                                    b0 = d31.b0(nf4Var);
                                    i2 = 2131750727;
                                } else {
                                    int i23 = nf4Var.E;
                                    int i24 = uc7.s5;
                                    if ((i23 & (-1537)) != 0) {
                                        if (nf4Var.H.isEmpty()) {
                                            b0 = d31.b0(nf4Var);
                                            i2 = 2131750725;
                                        } else {
                                            b0 = d31.b0(nf4Var);
                                            i2 = 2131750724;
                                        }
                                    } else if (nf4Var.G.isEmpty()) {
                                        b0 = d31.b0(nf4Var);
                                        i2 = 2131750728;
                                    } else {
                                        b0 = d31.b0(nf4Var);
                                        i2 = 2131750726;
                                    }
                                }
                                xnb.x(null, i2, b0, null);
                                break;
                            } else {
                                float f2 = -nf4Var.R;
                                nf4Var.R = f2;
                                hl.A3(f2, view, null);
                                yw0Var.a();
                                nf4Var.w = true;
                                kg5 kg5Var = nf4Var.S;
                                if ((kg5Var == null || !kg5Var.W) && (nf4Var.fragmentView instanceof FrameLayout)) {
                                    kg5 kg5Var2 = new kg5(nf4Var.getParentActivity(), 1);
                                    kg5Var2.p(true);
                                    kg5Var2.d = 2300L;
                                    kg5Var2.U = true;
                                    kg5Var2.e = true;
                                    kg5Var2.m(11.0f, 6.0f, 11.0f, 7.0f);
                                    kg5Var2.v0 = -hl.L(10.0f);
                                    nf4Var.S = kg5Var2;
                                    kg5Var2.setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
                                    kg5Var2.k(nf4Var.getBaseSimpleGlass().c);
                                    kg5Var2.t(ob6.M0(2131750740, null));
                                    kg5Var2.r0 = new ug(kg5Var2, b3);
                                    ((FrameLayout) nf4Var.fragmentView).addView(kg5Var2, tre.e(-1, jn7.f2, 55));
                                    kg5Var2.x(nf4Var.c, true);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            default:
                af4 af4Var = (af4) obj2;
                ArrayList arrayList11 = af4Var.Z1;
                int i25 = i - 1;
                if (i25 >= 0 && i25 < arrayList11.size()) {
                    ef4 ef4Var2 = (ef4) arrayList11.get(i25);
                    int i26 = ef4Var2.a;
                    if (i26 == 7) {
                        af4Var.dismiss();
                        af4Var.r1.presentFragment(new je4(af4Var.T1, ef4Var2.m));
                        break;
                    } else if (i26 == 8) {
                        af4Var.Z0();
                        break;
                    }
                }
                break;
        }
    }
}
