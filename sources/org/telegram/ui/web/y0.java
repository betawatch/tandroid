package org.telegram.ui.web;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import eg.t2;
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
import org.telegram.ui.Components.a61;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.kv0;
import org.telegram.ui.Components.mg0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.wn0;
import org.telegram.ui.kg1;
import org.telegram.ui.oy;
import org.telegram.ui.xn;
import org.telegram.ui.xx;
import ph.a3;
import ph.a9;
import ph.c5;
import ph.d7;
import ph.da;
import ph.h9;
import ph.l5;
import ph.t6;
import ph.u6;
import ph.v7;
import vh.f3;
import vh.i3;
import vh.r3;
import vh.v5;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        w51 w51Var;
        int i10;
        w51 w51Var2;
        w51 w51Var3;
        switch (this.a) {
            case 0:
                w0 w0Var = ((BotWebViewContainer$WebViewProxy) this.b).b;
                StringBuilder sb = new StringBuilder("window.navigator.__share__receive(");
                sb.append(((Boolean) obj).booleanValue() ? "" : "'abort'");
                sb.append(")");
                w0Var.d(sb.toString());
                break;
            case 1:
                e1 e1Var = (e1) this.b;
                e1Var.e = (ArrayList) obj;
                a61 a61Var = e1Var.a;
                if (a61Var.D) {
                    a61Var.V2.N(true);
                    break;
                }
                break;
            case 2:
                x1 x1Var = (x1) this.b;
                x1Var.n = ((ArrayList) obj).size();
                a61 a61Var2 = x1Var.a;
                if (a61Var2 != null && (w51Var = a61Var2.V2) != null && a61Var2.D) {
                    w51Var.N(true);
                    break;
                }
                break;
            case 3:
                ((ph.k) this.b).x(((Integer) obj).intValue());
                break;
            case 4:
                ph.y yVar = (ph.y) this.b;
                yVar.g0.n.P = ((Float) obj).floatValue();
                ph.x xVar = yVar.g0;
                t2 t2Var = xVar.d;
                if (t2Var != null) {
                    t2Var.setVolume(xVar.n.P);
                    break;
                }
                break;
            case 5:
                ph.k0 k0Var = (ph.k0) this.b;
                VideoEditedInfo videoEditedInfo = (VideoEditedInfo) obj;
                MessageObject messageObject = k0Var.c;
                if (messageObject != null) {
                    messageObject.videoEditedInfo = videoEditedInfo;
                    MediaController.getInstance().scheduleVideoConvert(k0Var.c);
                    break;
                }
                break;
            case 6:
                ph.d2 d2Var = (ph.d2) this.b;
                d2Var.h(-1.0f);
                AndroidUtilities.runOnUIThread(new kg1(20, d2Var, (Runnable) obj), 80L);
                break;
            case 7:
                ((a3) this.b).s.animate().translationY(((-((Integer) obj).intValue()) / 2.0f) + AndroidUtilities.dp(80.0f)).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.r1.w).start();
                break;
            case 8:
                h9 h9Var = (h9) ((c5) this.b);
                da daVar = h9Var.x2;
                daVar.U0.p((MessageObject) obj);
                u6 u6Var = daVar.H1;
                int i11 = 0;
                if (u6Var != null && daVar.L1 != 1) {
                    boolean isEmpty = TextUtils.isEmpty(u6Var.y);
                    boolean z4 = !isEmpty;
                    ((mg0) daVar.g1.c).a(!daVar.U0.k(), false);
                    daVar.g1.setVisibility(0);
                    daVar.g1.animate().alpha(!isEmpty ? 1.0f : 0.0f).withEndAction(new kv0(15, h9Var, z4)).start();
                }
                if (daVar.x0.j()) {
                    ArrayList arrayList = daVar.x0.h;
                    int size = arrayList.size();
                    while (true) {
                        if (i11 < size) {
                            Object obj2 = arrayList.get(i11);
                            i11++;
                            u6 u6Var2 = ((ph.x) obj2).n;
                            if (u6Var2 != null && u6Var2.K) {
                                i10 = TextUtils.isEmpty(daVar.H1.y) ? -1 : 2;
                            }
                        }
                    }
                }
                daVar.l0(i10, true, true);
                break;
            case 9:
                t6 t6Var = (t6) obj;
                w61 w61Var = ((l5) this.b).n;
                if (w61Var != null) {
                    w61Var.setHDRInfo(t6Var);
                    break;
                }
                break;
            case 10:
                d7 d7Var = (d7) this.b;
                dg.f1 f1Var = (dg.f1) obj;
                if (f1Var == null) {
                    d7Var.U();
                    break;
                } else {
                    d7Var.l0 = f1Var.e;
                    d7Var.k0 = f1Var.f;
                    break;
                }
            case 11:
                ((v7) this.b).n.T.E = ((Integer) obj).intValue();
                break;
            case 12:
                ((a9) this.b).g((Utilities.Callback) obj);
                break;
            case 13:
                rh.s sVar = (rh.s) this.b;
                ArrayList arrayList2 = sVar.b;
                arrayList2.clear();
                arrayList2.addAll((ArrayList) obj);
                g61 g61Var = sVar.a;
                if (g61Var != null && (w51Var2 = g61Var.V2) != null) {
                    w51Var2.N(true);
                    break;
                }
                break;
            case 14:
                sh.g gVar = (sh.g) this.b;
                ArrayList arrayList3 = (ArrayList) obj;
                ArrayList arrayList4 = gVar.h;
                boolean z10 = arrayList4 == null || arrayList4.isEmpty();
                gVar.h = arrayList3;
                g61 g61Var2 = gVar.e;
                if (g61Var2 != null) {
                    g61Var2.V2.N(z10);
                    break;
                }
                break;
            case 15:
                ((tf.k) this.b).L((TLRPC.User) obj);
                break;
            case 16:
                TLRPC.User user = (TLRPC.User) obj;
                wn0 wn0Var = (wn0) ((tf.z) this.b);
                xx xxVar = wn0Var.H0;
                if (user != null) {
                    oy oyVar = xxVar.G0;
                    if (oyVar != null) {
                        oyVar.K3();
                    }
                    MessagesController.getInstance(xxVar.E0).openApp(user, 0);
                    wn0Var.R(user.id, user);
                    break;
                }
                break;
            case 17:
                uf.k kVar = (uf.k) this.b;
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
                AndroidUtilities.forEachViews((RecyclerView) ((uf.c0) this.b).s, (h5.d) new nh.e(17));
                break;
            case 19:
                uf.k0 k0Var2 = (uf.k0) this.b;
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                k0Var2.D = connectedbots;
                TL_account.TL_connectedBot tL_connectedBot = (connectedbots == null || connectedbots.connected_bots.isEmpty()) ? null : k0Var2.D.connected_bots.get(0);
                k0Var2.E = tL_connectedBot;
                k0Var2.J = tL_connectedBot == null ? null : k0Var2.getMessagesController().getUser(Long.valueOf(k0Var2.E.bot_id));
                TL_account.TL_connectedBot tL_connectedBot2 = k0Var2.E;
                k0Var2.G = tL_connectedBot2 != null ? TL_account.TL_businessBotRights.clone(tL_connectedBot2.rights) : TL_account.TL_businessBotRights.makeDefault();
                TL_account.TL_connectedBot tL_connectedBot3 = k0Var2.E;
                k0Var2.F = tL_connectedBot3 != null ? tL_connectedBot3.recipients.exclude_selected : true;
                uf.v vVar = k0Var2.v;
                if (vVar != null) {
                    vVar.i(tL_connectedBot3 != null ? tL_connectedBot3.recipients : null);
                }
                g61 g61Var3 = k0Var2.c;
                if (g61Var3 != null && (w51Var3 = g61Var3.V2) != null) {
                    w51Var3.N(true);
                }
                k0Var2.Y(true);
                k0Var2.Q = true;
                break;
            case 20:
                uf.m0 m0Var = (uf.m0) this.b;
                m0Var.w = m0Var.e[((Integer) obj).intValue()];
                m0Var.V(true);
                break;
            case 21:
                uf.m1 m1Var = (uf.m1) this.b;
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
                AndroidUtilities.hideKeyboard((uf.g1) this.b);
                AndroidUtilities.runOnUIThread((Runnable) obj, 80L);
                break;
            case 23:
                i3 i3Var = (i3) this.b;
                TL_iv.RichMessage richMessage = (TL_iv.RichMessage) obj;
                int i12 = i3Var.b;
                int i13 = i3Var.a;
                r3 r3Var = i3Var.e;
                if (richMessage != null) {
                    ArrayList arrayList5 = r3Var.i3;
                    ArrayList arrayList6 = r3Var.i3;
                    if (i13 < arrayList5.size() && i12 < arrayList6.size()) {
                        vh.c2 c2Var = r3Var.G3;
                        if (c2Var != null) {
                            c2Var.d();
                        }
                        f3 f3Var = r3Var.k3;
                        if (f3Var != null) {
                            f3Var.f(false);
                        }
                        vh.a aVar = (vh.a) arrayList6.get(i13);
                        vh.a aVar2 = (vh.a) arrayList6.get(i12);
                        String M4 = r3.A3(aVar.b) ? r3Var.M4(aVar) : "";
                        CharSequence M42 = r3.A3(aVar2.b) ? r3Var.M4(aVar2) : "";
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M4.subSequence(0, Math.max(0, Math.min(i3Var.c, M4.length()))));
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(M42.subSequence(Math.max(0, Math.min(i3Var.d, M42.length())), M42.length()));
                        ArrayList arrayList7 = new ArrayList();
                        r3.W2(arrayList7, richMessage.blocks, null);
                        if (arrayList7.isEmpty()) {
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder);
                            spannableStringBuilder3.append((CharSequence) spannableStringBuilder2);
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            v5.d(pageblockparagraph, spannableStringBuilder3);
                            arrayList7.add(new vh.a(pageblockparagraph, aVar.c, aVar.d));
                        } else {
                            if (spannableStringBuilder.length() > 0) {
                                vh.a aVar3 = (vh.a) arrayList7.get(0);
                                if (r3.A3(aVar3.b)) {
                                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(spannableStringBuilder);
                                    spannableStringBuilder4.append((CharSequence) v5.A(aVar3.b));
                                    v5.d(aVar3.b, spannableStringBuilder4);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                                    v5.d(pageblockparagraph2, spannableStringBuilder);
                                    arrayList7.add(0, new vh.a(pageblockparagraph2, aVar.c, aVar.d));
                                }
                            }
                            if (spannableStringBuilder2.length() > 0) {
                                vh.a aVar4 = (vh.a) kh.a2.i(1, arrayList7);
                                if (r3.A3(aVar4.b)) {
                                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(v5.A(aVar4.b));
                                    spannableStringBuilder5.append((CharSequence) spannableStringBuilder2);
                                    v5.d(aVar4.b, spannableStringBuilder5);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph3 = new TL_iv.pageBlockParagraph();
                                    v5.d(pageblockparagraph3, spannableStringBuilder2);
                                    arrayList7.add(new vh.a(pageblockparagraph3, aVar2.c, aVar2.d));
                                }
                            }
                        }
                        TL_iv.RichMessage richMessage2 = r3Var.h3;
                        if (richMessage2 == null) {
                            r3Var.h3 = richMessage;
                        } else {
                            ArrayList<TLRPC.Photo> arrayList8 = richMessage.photos;
                            if (arrayList8 != null) {
                                richMessage2.photos.addAll(arrayList8);
                            }
                            ArrayList<TLRPC.Document> arrayList9 = richMessage.documents;
                            if (arrayList9 != null) {
                                r3Var.h3.documents.addAll(arrayList9);
                            }
                        }
                        for (int i14 = 0; i14 < arrayList7.size(); i14++) {
                            r3Var.v4((vh.a) arrayList7.get(i14));
                        }
                        while (i12 >= i13) {
                            arrayList6.remove(i12);
                            i12--;
                        }
                        arrayList6.addAll(i13, arrayList7);
                        r3Var.s4();
                        r3Var.V2.N(false);
                        vh.c2 c2Var2 = r3Var.G3;
                        if (c2Var2 != null) {
                            c2Var2.h();
                        }
                        r3Var.e3.onContentChanged();
                        r3Var.post(new uf.v0(9, i3Var, arrayList7.isEmpty() ? null : (vh.a) kh.a2.i(1, arrayList7)));
                        break;
                    }
                }
                break;
            case 24:
                ((vh.k) this.b).a.r.U1((TL_iv.RichMessage) obj);
                break;
            case 25:
                ((vh.y1) this.b).M.U1((TL_iv.RichMessage) obj);
                break;
            default:
                r3 r3Var2 = (r3) this.b;
                String str = (String) obj;
                r3Var2.getClass();
                if (!TextUtils.isEmpty(str)) {
                    TL_iv.pageBlockMath pageblockmath = new TL_iv.pageBlockMath();
                    pageblockmath.source = str;
                    r3Var2.R1(pageblockmath);
                    break;
                }
                break;
        }
    }
}
