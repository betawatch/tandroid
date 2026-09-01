package org.telegram.ui.web;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import fg.s2;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.b61;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.og0;
import org.telegram.ui.Components.rv0;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.xn0;
import org.telegram.ui.Components.y61;
import org.telegram.ui.mg1;
import org.telegram.ui.py;
import org.telegram.ui.xn;
import org.telegram.ui.yx;
import qh.a3;
import qh.b5;
import qh.b7;
import qh.ca;
import qh.f9;
import qh.j5;
import qh.r6;
import qh.s6;
import qh.t7;
import qh.y8;
import wh.f3;
import wh.i3;
import wh.r3;
import wh.v5;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d1 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        x51 x51Var;
        int i10;
        x51 x51Var2;
        x51 x51Var3;
        switch (this.a) {
            case 0:
                f1 f1Var = (f1) this.b;
                f1Var.e = (ArrayList) obj;
                b61 b61Var = f1Var.a;
                if (b61Var.D) {
                    b61Var.V2.N(true);
                    break;
                }
                break;
            case 1:
                y1 y1Var = (y1) this.b;
                y1Var.n = ((ArrayList) obj).size();
                b61 b61Var2 = y1Var.a;
                if (b61Var2 != null && (x51Var = b61Var2.V2) != null && b61Var2.D) {
                    x51Var.N(true);
                    break;
                }
                break;
            case 2:
                ph.p pVar = (ph.p) this.b;
                String str = (String) obj;
                ArrayList arrayList = pVar.h;
                if (!arrayList.contains(str)) {
                    arrayList.add(str);
                    pVar.i(true);
                }
                AndroidUtilities.runOnUIThread(new mg1(16, pVar, str), 120L);
                break;
            case 3:
                ((qh.k) this.b).x(((Integer) obj).intValue());
                break;
            case 4:
                qh.y yVar = (qh.y) this.b;
                yVar.g0.n.P = ((Float) obj).floatValue();
                qh.x xVar = yVar.g0;
                s2 s2Var = xVar.d;
                if (s2Var != null) {
                    s2Var.setVolume(xVar.n.P);
                    break;
                }
                break;
            case 5:
                qh.k0 k0Var = (qh.k0) this.b;
                VideoEditedInfo videoEditedInfo = (VideoEditedInfo) obj;
                MessageObject messageObject = k0Var.c;
                if (messageObject != null) {
                    messageObject.videoEditedInfo = videoEditedInfo;
                    MediaController.getInstance().scheduleVideoConvert(k0Var.c);
                    break;
                }
                break;
            case 6:
                qh.d2 d2Var = (qh.d2) this.b;
                d2Var.h(-1.0f);
                AndroidUtilities.runOnUIThread(new mg1(20, d2Var, (Runnable) obj), 80L);
                break;
            case 7:
                ((a3) this.b).s.animate().translationY(((-((Integer) obj).intValue()) / 2.0f) + AndroidUtilities.dp(80.0f)).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.r1.w).start();
                break;
            case 8:
                f9 f9Var = (f9) ((b5) this.b);
                ca caVar = f9Var.x2;
                caVar.U0.p((MessageObject) obj);
                s6 s6Var = caVar.H1;
                int i11 = 0;
                if (s6Var != null && caVar.L1 != 1) {
                    boolean isEmpty = TextUtils.isEmpty(s6Var.y);
                    boolean z4 = !isEmpty;
                    ((og0) caVar.g1.c).a(!caVar.U0.k(), false);
                    caVar.g1.setVisibility(0);
                    caVar.g1.animate().alpha(!isEmpty ? 1.0f : 0.0f).withEndAction(new rv0(15, f9Var, z4)).start();
                }
                if (caVar.x0.j()) {
                    ArrayList arrayList2 = caVar.x0.h;
                    int size = arrayList2.size();
                    while (true) {
                        if (i11 < size) {
                            Object obj2 = arrayList2.get(i11);
                            i11++;
                            s6 s6Var2 = ((qh.x) obj2).n;
                            if (s6Var2 != null && s6Var2.K) {
                                i10 = TextUtils.isEmpty(caVar.H1.y) ? -1 : 2;
                            }
                        }
                    }
                }
                caVar.l0(i10, true, true);
                break;
            case 9:
                r6 r6Var = (r6) obj;
                y61 y61Var = ((j5) this.b).n;
                if (y61Var != null) {
                    y61Var.setHDRInfo(r6Var);
                    break;
                }
                break;
            case 10:
                b7 b7Var = (b7) this.b;
                eg.d1 d1Var = (eg.d1) obj;
                if (d1Var == null) {
                    b7Var.U();
                    break;
                } else {
                    b7Var.l0 = d1Var.e;
                    b7Var.k0 = d1Var.f;
                    break;
                }
            case 11:
                ((t7) this.b).n.T.E = ((Integer) obj).intValue();
                break;
            case 12:
                ((y8) this.b).g((Utilities.Callback) obj);
                break;
            case 13:
                sh.r rVar = (sh.r) this.b;
                ArrayList arrayList3 = rVar.b;
                arrayList3.clear();
                arrayList3.addAll((ArrayList) obj);
                i61 i61Var = rVar.a;
                if (i61Var != null && (x51Var2 = i61Var.V2) != null) {
                    x51Var2.N(true);
                    break;
                }
                break;
            case 14:
                th.g gVar = (th.g) this.b;
                ArrayList arrayList4 = (ArrayList) obj;
                ArrayList arrayList5 = gVar.h;
                boolean z10 = arrayList5 == null || arrayList5.isEmpty();
                gVar.h = arrayList4;
                i61 i61Var2 = gVar.e;
                if (i61Var2 != null) {
                    i61Var2.V2.N(z10);
                    break;
                }
                break;
            case 15:
                ((uf.k) this.b).L((TLRPC.User) obj);
                break;
            case 16:
                TLRPC.User user = (TLRPC.User) obj;
                xn0 xn0Var = (xn0) ((uf.z) this.b);
                yx yxVar = xn0Var.H0;
                if (user != null) {
                    py pyVar = yxVar.G0;
                    if (pyVar != null) {
                        pyVar.K3();
                    }
                    MessagesController.getInstance(yxVar.E0).openApp(user, 0);
                    xn0Var.R(user.id, user);
                    break;
                }
                break;
            case 17:
                vf.k kVar = (vf.k) this.b;
                boolean z11 = ((Integer) obj).intValue() > AndroidUtilities.dp(20.0f);
                if (kVar.C != z11) {
                    kVar.C = z11;
                    if (!z11) {
                        kVar.a.x0(0);
                        break;
                    }
                }
                break;
            case 18:
                AndroidUtilities.forEachViews((RecyclerView) ((vf.c0) this.b).s, (h5.d) new ag.d(18));
                break;
            case 19:
                vf.l0 l0Var = (vf.l0) this.b;
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                l0Var.D = connectedbots;
                TL_account.TL_connectedBot tL_connectedBot = (connectedbots == null || connectedbots.connected_bots.isEmpty()) ? null : l0Var.D.connected_bots.get(0);
                l0Var.E = tL_connectedBot;
                l0Var.J = tL_connectedBot == null ? null : l0Var.getMessagesController().getUser(Long.valueOf(l0Var.E.bot_id));
                TL_account.TL_connectedBot tL_connectedBot2 = l0Var.E;
                l0Var.G = tL_connectedBot2 != null ? TL_account.TL_businessBotRights.clone(tL_connectedBot2.rights) : TL_account.TL_businessBotRights.makeDefault();
                TL_account.TL_connectedBot tL_connectedBot3 = l0Var.E;
                l0Var.F = tL_connectedBot3 != null ? tL_connectedBot3.recipients.exclude_selected : true;
                vf.v vVar = l0Var.v;
                if (vVar != null) {
                    vVar.i(tL_connectedBot3 != null ? tL_connectedBot3.recipients : null);
                }
                i61 i61Var3 = l0Var.c;
                if (i61Var3 != null && (x51Var3 = i61Var3.V2) != null) {
                    x51Var3.N(true);
                }
                l0Var.Y(true);
                l0Var.Q = true;
                break;
            case 20:
                vf.n0 n0Var = (vf.n0) this.b;
                n0Var.w = n0Var.e[((Integer) obj).intValue()];
                n0Var.V(true);
                break;
            case 21:
                vf.m1 m1Var = (vf.m1) this.b;
                m1Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putInt("chatMode", 5);
                bundle.putLong("user_id", m1Var.getUserConfig().getClientUserId());
                bundle.putString("quick_reply", (String) obj);
                xn xnVar = new xn(bundle);
                xnVar.z9 = true;
                m1Var.presentFragment(xnVar);
                break;
            case 22:
                AndroidUtilities.hideKeyboard((vf.g1) this.b);
                AndroidUtilities.runOnUIThread((Runnable) obj, 80L);
                break;
            case 23:
                i3 i3Var = (i3) this.b;
                TL_iv.RichMessage richMessage = (TL_iv.RichMessage) obj;
                int i12 = i3Var.b;
                int i13 = i3Var.a;
                r3 r3Var = i3Var.e;
                if (richMessage != null) {
                    ArrayList arrayList6 = r3Var.i3;
                    ArrayList arrayList7 = r3Var.i3;
                    if (i13 < arrayList6.size() && i12 < arrayList7.size()) {
                        wh.d2 d2Var2 = r3Var.G3;
                        if (d2Var2 != null) {
                            d2Var2.d();
                        }
                        f3 f3Var = r3Var.k3;
                        if (f3Var != null) {
                            f3Var.f(false);
                        }
                        wh.a aVar = (wh.a) arrayList7.get(i13);
                        wh.a aVar2 = (wh.a) arrayList7.get(i12);
                        String M4 = r3.A3(aVar.b) ? r3Var.M4(aVar) : "";
                        CharSequence M42 = r3.A3(aVar2.b) ? r3Var.M4(aVar2) : "";
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M4.subSequence(0, Math.max(0, Math.min(i3Var.c, M4.length()))));
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(M42.subSequence(Math.max(0, Math.min(i3Var.d, M42.length())), M42.length()));
                        ArrayList arrayList8 = new ArrayList();
                        r3.W2(arrayList8, richMessage.blocks, null);
                        if (arrayList8.isEmpty()) {
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder);
                            spannableStringBuilder3.append((CharSequence) spannableStringBuilder2);
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            v5.d(pageblockparagraph, spannableStringBuilder3);
                            arrayList8.add(new wh.a(pageblockparagraph, aVar.c, aVar.d));
                        } else {
                            if (spannableStringBuilder.length() > 0) {
                                wh.a aVar3 = (wh.a) arrayList8.get(0);
                                if (r3.A3(aVar3.b)) {
                                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(spannableStringBuilder);
                                    spannableStringBuilder4.append((CharSequence) v5.A(aVar3.b));
                                    v5.d(aVar3.b, spannableStringBuilder4);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                                    v5.d(pageblockparagraph2, spannableStringBuilder);
                                    arrayList8.add(0, new wh.a(pageblockparagraph2, aVar.c, aVar.d));
                                }
                            }
                            if (spannableStringBuilder2.length() > 0) {
                                wh.a aVar4 = (wh.a) l.d.i(1, arrayList8);
                                if (r3.A3(aVar4.b)) {
                                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(v5.A(aVar4.b));
                                    spannableStringBuilder5.append((CharSequence) spannableStringBuilder2);
                                    v5.d(aVar4.b, spannableStringBuilder5);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph3 = new TL_iv.pageBlockParagraph();
                                    v5.d(pageblockparagraph3, spannableStringBuilder2);
                                    arrayList8.add(new wh.a(pageblockparagraph3, aVar2.c, aVar2.d));
                                }
                            }
                        }
                        TL_iv.RichMessage richMessage2 = r3Var.h3;
                        if (richMessage2 == null) {
                            r3Var.h3 = richMessage;
                        } else {
                            ArrayList<TLRPC.Photo> arrayList9 = richMessage.photos;
                            if (arrayList9 != null) {
                                richMessage2.photos.addAll(arrayList9);
                            }
                            ArrayList<TLRPC.Document> arrayList10 = richMessage.documents;
                            if (arrayList10 != null) {
                                r3Var.h3.documents.addAll(arrayList10);
                            }
                        }
                        for (int i14 = 0; i14 < arrayList8.size(); i14++) {
                            r3Var.v4((wh.a) arrayList8.get(i14));
                        }
                        while (i12 >= i13) {
                            arrayList7.remove(i12);
                            i12--;
                        }
                        arrayList7.addAll(i13, arrayList8);
                        r3Var.s4();
                        r3Var.V2.N(false);
                        wh.d2 d2Var3 = r3Var.G3;
                        if (d2Var3 != null) {
                            d2Var3.h();
                        }
                        r3Var.e3.onContentChanged();
                        r3Var.post(new vf.d0(11, i3Var, arrayList8.isEmpty() ? null : (wh.a) l.d.i(1, arrayList8)));
                        break;
                    }
                }
                break;
            case 24:
                ((wh.l) this.b).a.r.U1((TL_iv.RichMessage) obj);
                break;
            case 25:
                ((wh.z1) this.b).M.U1((TL_iv.RichMessage) obj);
                break;
            default:
                r3 r3Var2 = (r3) this.b;
                String str2 = (String) obj;
                r3Var2.getClass();
                if (!TextUtils.isEmpty(str2)) {
                    TL_iv.pageBlockMath pageblockmath = new TL_iv.pageBlockMath();
                    pageblockmath.source = str2;
                    r3Var2.R1(pageblockmath);
                    break;
                }
                break;
        }
    }
}
