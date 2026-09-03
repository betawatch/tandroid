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
import org.telegram.ui.Components.ng0;
import org.telegram.ui.Components.vn0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.w61;
import org.telegram.ui.qy;
import org.telegram.ui.sg1;
import org.telegram.ui.zn;
import org.telegram.ui.zx;
import ph.a3;
import ph.a9;
import ph.c5;
import ph.c7;
import ph.da;
import ph.h9;
import ph.k5;
import ph.s6;
import ph.t6;
import ph.u7;
import vh.g3;
import vh.j3;
import vh.s3;
import vh.w5;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a1 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a1(Object obj, int i10) {
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
                y0 y0Var = ((BotWebViewContainer$WebViewProxy) this.b).b;
                StringBuilder sb = new StringBuilder("window.navigator.__share__receive(");
                sb.append(((Boolean) obj).booleanValue() ? "" : "'abort'");
                sb.append(")");
                y0Var.d(sb.toString());
                break;
            case 1:
                g1 g1Var = (g1) this.b;
                g1Var.e = (ArrayList) obj;
                a61 a61Var = g1Var.a;
                if (a61Var.D) {
                    a61Var.V2.N(true);
                    break;
                }
                break;
            case 2:
                y1 y1Var = (y1) this.b;
                y1Var.n = ((ArrayList) obj).size();
                a61 a61Var2 = y1Var.a;
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
                AndroidUtilities.runOnUIThread(new sg1(20, d2Var, (Runnable) obj), 80L);
                break;
            case 7:
                ((a3) this.b).s.animate().translationY(((-((Integer) obj).intValue()) / 2.0f) + AndroidUtilities.dp(80.0f)).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.r1.w).start();
                break;
            case 8:
                h9 h9Var = (h9) ((c5) this.b);
                da daVar = h9Var.x2;
                daVar.U0.p((MessageObject) obj);
                t6 t6Var = daVar.H1;
                int i11 = 0;
                if (t6Var != null && daVar.L1 != 1) {
                    boolean isEmpty = TextUtils.isEmpty(t6Var.y);
                    boolean z4 = !isEmpty;
                    ((ng0) daVar.g1.c).a(!daVar.U0.k(), false);
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
                            t6 t6Var2 = ((ph.x) obj2).n;
                            if (t6Var2 != null && t6Var2.K) {
                                i10 = TextUtils.isEmpty(daVar.H1.y) ? -1 : 2;
                            }
                        }
                    }
                }
                daVar.l0(i10, true, true);
                break;
            case 9:
                s6 s6Var = (s6) obj;
                w61 w61Var = ((k5) this.b).n;
                if (w61Var != null) {
                    w61Var.setHDRInfo(s6Var);
                    break;
                }
                break;
            case 10:
                c7 c7Var = (c7) this.b;
                dg.f1 f1Var = (dg.f1) obj;
                if (f1Var == null) {
                    c7Var.U();
                    break;
                } else {
                    c7Var.l0 = f1Var.e;
                    c7Var.k0 = f1Var.f;
                    break;
                }
            case 11:
                ((u7) this.b).n.T.E = ((Integer) obj).intValue();
                break;
            case 12:
                ((a9) this.b).g((Utilities.Callback) obj);
                break;
            case 13:
                rh.r rVar = (rh.r) this.b;
                ArrayList arrayList2 = rVar.b;
                arrayList2.clear();
                arrayList2.addAll((ArrayList) obj);
                g61 g61Var = rVar.a;
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
                vn0 vn0Var = (vn0) ((tf.z) this.b);
                zx zxVar = vn0Var.H0;
                if (user != null) {
                    qy qyVar = zxVar.G0;
                    if (qyVar != null) {
                        qyVar.K3();
                    }
                    MessagesController.getInstance(zxVar.E0).openApp(user, 0);
                    vn0Var.R(user.id, user);
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
                uf.l0 l0Var = (uf.l0) this.b;
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                l0Var.D = connectedbots;
                TL_account.TL_connectedBot tL_connectedBot = (connectedbots == null || connectedbots.connected_bots.isEmpty()) ? null : l0Var.D.connected_bots.get(0);
                l0Var.E = tL_connectedBot;
                l0Var.J = tL_connectedBot == null ? null : l0Var.getMessagesController().getUser(Long.valueOf(l0Var.E.bot_id));
                TL_account.TL_connectedBot tL_connectedBot2 = l0Var.E;
                l0Var.G = tL_connectedBot2 != null ? TL_account.TL_businessBotRights.clone(tL_connectedBot2.rights) : TL_account.TL_businessBotRights.makeDefault();
                TL_account.TL_connectedBot tL_connectedBot3 = l0Var.E;
                l0Var.F = tL_connectedBot3 != null ? tL_connectedBot3.recipients.exclude_selected : true;
                uf.v vVar = l0Var.v;
                if (vVar != null) {
                    vVar.i(tL_connectedBot3 != null ? tL_connectedBot3.recipients : null);
                }
                g61 g61Var3 = l0Var.c;
                if (g61Var3 != null && (w51Var3 = g61Var3.V2) != null) {
                    w51Var3.N(true);
                }
                l0Var.Y(true);
                l0Var.Q = true;
                break;
            case 20:
                uf.n0 n0Var = (uf.n0) this.b;
                n0Var.w = n0Var.e[((Integer) obj).intValue()];
                n0Var.V(true);
                break;
            case 21:
                uf.m1 m1Var = (uf.m1) this.b;
                m1Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putInt("chatMode", 5);
                bundle.putLong("user_id", m1Var.getUserConfig().getClientUserId());
                bundle.putString("quick_reply", (String) obj);
                zn znVar = new zn(bundle);
                znVar.z9 = true;
                m1Var.presentFragment(znVar);
                break;
            case 22:
                AndroidUtilities.hideKeyboard((uf.g1) this.b);
                AndroidUtilities.runOnUIThread((Runnable) obj, 80L);
                break;
            case 23:
                j3 j3Var = (j3) this.b;
                TL_iv.RichMessage richMessage = (TL_iv.RichMessage) obj;
                int i12 = j3Var.b;
                int i13 = j3Var.a;
                s3 s3Var = j3Var.e;
                if (richMessage != null) {
                    ArrayList arrayList5 = s3Var.i3;
                    ArrayList arrayList6 = s3Var.i3;
                    if (i13 < arrayList5.size() && i12 < arrayList6.size()) {
                        vh.d2 d2Var2 = s3Var.G3;
                        if (d2Var2 != null) {
                            d2Var2.d();
                        }
                        g3 g3Var = s3Var.k3;
                        if (g3Var != null) {
                            g3Var.f(false);
                        }
                        vh.a aVar = (vh.a) arrayList6.get(i13);
                        vh.a aVar2 = (vh.a) arrayList6.get(i12);
                        String L4 = s3.z3(aVar.b) ? s3Var.L4(aVar) : "";
                        CharSequence L42 = s3.z3(aVar2.b) ? s3Var.L4(aVar2) : "";
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(L4.subSequence(0, Math.max(0, Math.min(j3Var.c, L4.length()))));
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(L42.subSequence(Math.max(0, Math.min(j3Var.d, L42.length())), L42.length()));
                        ArrayList arrayList7 = new ArrayList();
                        s3.V2(arrayList7, richMessage.blocks, null);
                        if (arrayList7.isEmpty()) {
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder);
                            spannableStringBuilder3.append((CharSequence) spannableStringBuilder2);
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            w5.d(pageblockparagraph, spannableStringBuilder3);
                            arrayList7.add(new vh.a(pageblockparagraph, aVar.c, aVar.d));
                        } else {
                            if (spannableStringBuilder.length() > 0) {
                                vh.a aVar3 = (vh.a) arrayList7.get(0);
                                if (s3.z3(aVar3.b)) {
                                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(spannableStringBuilder);
                                    spannableStringBuilder4.append((CharSequence) w5.A(aVar3.b));
                                    w5.d(aVar3.b, spannableStringBuilder4);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                                    w5.d(pageblockparagraph2, spannableStringBuilder);
                                    arrayList7.add(0, new vh.a(pageblockparagraph2, aVar.c, aVar.d));
                                }
                            }
                            if (spannableStringBuilder2.length() > 0) {
                                vh.a aVar4 = (vh.a) kf.k0.i(1, arrayList7);
                                if (s3.z3(aVar4.b)) {
                                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(w5.A(aVar4.b));
                                    spannableStringBuilder5.append((CharSequence) spannableStringBuilder2);
                                    w5.d(aVar4.b, spannableStringBuilder5);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph3 = new TL_iv.pageBlockParagraph();
                                    w5.d(pageblockparagraph3, spannableStringBuilder2);
                                    arrayList7.add(new vh.a(pageblockparagraph3, aVar2.c, aVar2.d));
                                }
                            }
                        }
                        TL_iv.RichMessage richMessage2 = s3Var.h3;
                        if (richMessage2 == null) {
                            s3Var.h3 = richMessage;
                        } else {
                            ArrayList<TLRPC.Photo> arrayList8 = richMessage.photos;
                            if (arrayList8 != null) {
                                richMessage2.photos.addAll(arrayList8);
                            }
                            ArrayList<TLRPC.Document> arrayList9 = richMessage.documents;
                            if (arrayList9 != null) {
                                s3Var.h3.documents.addAll(arrayList9);
                            }
                        }
                        for (int i14 = 0; i14 < arrayList7.size(); i14++) {
                            s3Var.u4((vh.a) arrayList7.get(i14));
                        }
                        while (i12 >= i13) {
                            arrayList6.remove(i12);
                            i12--;
                        }
                        arrayList6.addAll(i13, arrayList7);
                        s3Var.r4();
                        s3Var.V2.N(false);
                        vh.d2 d2Var3 = s3Var.G3;
                        if (d2Var3 != null) {
                            d2Var3.h();
                        }
                        s3Var.e3.onContentChanged();
                        s3Var.post(new uf.d0(11, j3Var, arrayList7.isEmpty() ? null : (vh.a) kf.k0.i(1, arrayList7)));
                        break;
                    }
                }
                break;
            case 24:
                ((vh.l) this.b).a.r.T1((TL_iv.RichMessage) obj);
                break;
            case 25:
                ((vh.y1) this.b).M.T1((TL_iv.RichMessage) obj);
                break;
            default:
                s3 s3Var2 = (s3) this.b;
                String str = (String) obj;
                s3Var2.getClass();
                if (!TextUtils.isEmpty(str)) {
                    TL_iv.pageBlockMath pageblockmath = new TL_iv.pageBlockMath();
                    pageblockmath.source = str;
                    s3Var2.Q1(pageblockmath);
                    break;
                }
                break;
        }
    }
}
