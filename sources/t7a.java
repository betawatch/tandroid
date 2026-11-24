// default package

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class t7a implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t7a(gta gtaVar, boolean[] zArr, i8c i8cVar) {
        this.a = (byte) 26;
        this.b = zArr;
        this.c = i8cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b;
        TLRPC.Chat K0;
        k27 messageObject;
        TLRPC.TL_messageReactions tL_messageReactions;
        TLRPC.TL_messageReactions tL_messageReactions2;
        byte b2 = 9;
        byte b3 = 2;
        ArrayList<TLRPC.MessageReactor> arrayList = null;
        byte b4 = 1;
        switch (this.a) {
            case 0:
                ((d8a) this.b).f0((TLRPC.TL_attachMenuBot) this.c);
                break;
            case 1:
                taa taaVar = (taa) this.b;
                TLObject tLObject = (TLObject) this.c;
                if (tLObject != null) {
                    taaVar.f2 = (TLRPC.TL_exportedMessageLink) tLObject;
                    taaVar.V0();
                    if (taaVar.h2) {
                        taaVar.F0();
                    }
                }
                taaVar.g2 = false;
                break;
            case 2:
                nfa nfaVar = (nfa) this.b;
                z1b z1bVar = (z1b) this.c;
                oca ocaVar = nfaVar.c0;
                if (ocaVar != null) {
                    int i = z1bVar.a;
                    ocaVar.b.e(i, ocaVar.d.i(i));
                    break;
                }
                break;
            case 3:
                iea ieaVar = (iea) this.b;
                ar8 ar8Var = (ar8) this.c;
                ieaVar.G = null;
                ieaVar.H = null;
                ar8Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new ng9((Object) ar8Var, (byte) 13)).start();
                break;
            case 4:
                xsa xsaVar = (xsa) this.b;
                Runnable[] runnableArr = (Runnable[]) this.c;
                xsaVar.e = !xsaVar.e;
                runnableArr[0].run();
                xsaVar.k(true);
                break;
            case 5:
                u21.b0(((zda) this.b).f.y1).Q(R.raw.contact_check, 36, k96.a0(null, null, 2131742573, ((TLRPC.Chat) this.c).title)).k(true);
                break;
            case 6:
                kea keaVar = (kea) this.b;
                String str = (String) this.c;
                if (!keaVar.w.w1[keaVar.r].a.isEmpty() && ((b = keaVar.r) == 1 || b == 4)) {
                    k27 k27Var = (k27) b00.f(1, keaVar.w.w1[b].a);
                    int e1 = k27Var.e1();
                    long B0 = k27.B0(k27Var.k);
                    nfa nfaVar2 = keaVar.w;
                    keaVar.F(e1, B0, nfaVar2.m1 == nfaVar2.y1.getUserConfig().e() ? k27Var.P1() : 0L, str);
                } else if (keaVar.r == 3) {
                    nfa nfaVar3 = keaVar.w;
                    keaVar.F(0, nfaVar3.m1, nfaVar3.G, str);
                }
                byte b5 = keaVar.r;
                if (b5 == 1 || b5 == 4) {
                    ArrayList arrayList2 = new ArrayList(keaVar.w.w1[keaVar.r].a);
                    keaVar.s++;
                    Utilities.g.c(new q3a(keaVar, str, arrayList2, b2));
                    break;
                }
                break;
            case 7:
                kea keaVar2 = (kea) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                nfa nfaVar4 = keaVar2.w;
                boolean z = nfaVar4.Y0;
                iea[] ieaVarArr = nfaVar4.n0;
                if (z) {
                    keaVar2.s--;
                    int b6 = keaVar2.b();
                    keaVar2.d = arrayList3;
                    int b7 = keaVar2.b();
                    if (keaVar2.s == 0 || b7 != 0) {
                        nfaVar4.z1(false);
                    }
                    for (int i2 = 0; i2 < ieaVarArr.length; i2++) {
                        iea ieaVar2 = ieaVarArr[i2];
                        if (ieaVar2.F == keaVar2.r) {
                            if (keaVar2.s == 0 && b7 == 0) {
                                ieaVar2.w.d.setText(k96.M0(2131747975, "NoResult"));
                                ieaVarArr[i2].w.f.setVisibility(8);
                                ieaVarArr[i2].w.e(false, true);
                            } else if (b6 == 0) {
                                nfaVar4.i(ieaVar2.h, 0, null);
                            }
                        }
                    }
                    keaVar2.f();
                    break;
                }
                break;
            case 8:
                zka zkaVar = (zka) this.b;
                yka ykaVar = (yka) this.c;
                View view = ykaVar.W;
                View view2 = zkaVar.fragmentView;
                if ((view2 instanceof ViewGroup) && view != null) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    vt4 vt4Var = new vt4(zkaVar.getParentActivity(), view, zkaVar.getResourceProvider(), new wh9(zkaVar, (byte) 20));
                    vt4Var.M = gl.L(220.0f);
                    vt4Var.n = gl.L(292.0f);
                    vt4Var.L = 0;
                    vt4Var.S = true;
                    int v0 = bkb.v0(bkb.F6, zkaVar.getResourceProvider());
                    String g0 = DictationAsr.g0(ykaVar.f, ykaVar.a);
                    for (String str2 : ykaVar.V) {
                        vt4Var.a(new k7(zkaVar.getParentActivity(), jm3.N(str2), null, v0, str2.equals(g0)), 44, new t7a(ykaVar, str2, b2));
                    }
                    vt4Var.setFocusableInTouchMode(true);
                    vt4Var.setOnKeyListener(new fm3(vt4Var, (byte) 3));
                    viewGroup.addView(vt4Var, new FrameLayout.LayoutParams(-1, -1));
                    vt4Var.requestFocus();
                    vt4Var.f();
                    break;
                }
                break;
            case 9:
                yka ykaVar2 = (yka) this.b;
                DictationAsr.b0(ykaVar2.a, (String) this.c);
                ykaVar2.c();
                break;
            case 10:
                d dVar = (d) this.b;
                new vma(dVar.getContext(), dVar.getCurrentAccount(), dVar.getResourceProvider(), (x0) this.c).show();
                break;
            case 11:
                vqa vqaVar = (vqa) this.b;
                Long l = (Long) this.c;
                String str3 = (l.longValue() >= 0 || (K0 = na7.q1(vqaVar.a).K0(Long.valueOf(-l.longValue()))) == null) ? "" : K0.title;
                m21 Q = vqaVar.j().Q(R.raw.contact_check, 36, gl.T2(TextUtils.isEmpty(str3) ? k96.M0(2131749444, null) : k96.a0(null, null, 2131749445, str3)));
                Q.t = true;
                Q.j();
                break;
            case 12:
                vqa vqaVar2 = (vqa) this.b;
                du4 du4Var = (du4) this.c;
                if (du4Var != null) {
                    du4Var.dismiss();
                    vqaVar2.O0 = true;
                }
                vqaVar2.dismiss();
                break;
            case 13:
                ysa ysaVar = (ysa) this.b;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.c;
                if (ysaVar instanceof q99) {
                    ((q99) ysaVar).n(tL_starGiftUnique);
                    break;
                }
                break;
            case 14:
                Runnable[] runnableArr2 = (Runnable[]) this.b;
                jq5 jq5Var = (jq5) this.c;
                Runnable runnable = runnableArr2[0];
                if (runnable != null) {
                    runnable.run();
                }
                jq5Var.a(0L);
                break;
            case 15:
                vqa vqaVar3 = (vqa) this.b;
                if (((gta) this.c).e) {
                    vqaVar3.f2.setLoading(false);
                    vqaVar3.l1();
                    break;
                } else {
                    m21 Q2 = vqaVar3.j().Q(R.raw.error, 36, k96.a0(null, null, 2131743639, "NO_BALANCE"));
                    Q2.t = true;
                    Q2.j();
                    break;
                }
            case 16:
                ((vqa) this.b).j().g0((TLRPC.TL_error) this.c, false);
                break;
            case 17:
                na7.q1(((vqa) this.b).a).Q3((TLRPC.Updates) ((TLObject) this.c), false);
                break;
            case 18:
                vqa vqaVar4 = (vqa) this.b;
                u21.b0((mu1) this.c).L(R.raw.gift, k96.M0(2131744859, null), gl.T2(k96.a0(null, null, 2131744857, cf3.s(vqaVar4.S1))), k96.M0(2131744858, null), new nna(vqaVar4, (byte) 12)).k(true);
                break;
            case 19:
                vqa vqaVar5 = (vqa) this.b;
                ((boolean[]) this.c)[0] = true;
                vqaVar5.f2.setLoading(false);
                vqaVar5.l1();
                break;
            case 20:
                vqa vqaVar6 = (vqa) this.b;
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) this.c;
                b00.u(k96.a0(null, null, 2131749446, tL_starGiftUnique2.title + " #" + tL_starGiftUnique2.num), vqaVar6.j(), R.raw.ic_delete, 36);
                break;
            case 21:
                ((vqa) this.b).t2((CharSequence) this.c);
                break;
            case 22:
                ((vqa) this.b).J1((TL_stars.TL_payments_uniqueStarGift) this.c);
                break;
            case 23:
                hd hdVar = (hd) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                hdVar.dismiss();
                d S = LaunchActivity.S();
                if (S != null) {
                    if (tL_error == null || !"STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error.text)) {
                        ir2.v(null, 2131743642, u21.b0(S), R.raw.error, 36);
                        break;
                    } else {
                        ir2.v(null, 2131743641, u21.b0(S), R.raw.fire_on, 36);
                        break;
                    }
                }
                break;
            case 24:
                jra jraVar = (jra) this.b;
                mu1 mu1Var = (mu1) this.c;
                hf0 hf0Var = jraVar.b;
                if (hf0Var != null) {
                    try {
                        hf0Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    jraVar.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                    hf0 hf0Var2 = jraVar.b;
                    if (hf0Var2 instanceof gb2) {
                        messageObject = ((gb2) hf0Var2).getPrimaryMessageObject();
                        if (messageObject != null) {
                            TLRPC.Message message = messageObject.k;
                            if (message != null && (tL_messageReactions2 = message.reactions) != null) {
                                arrayList = tL_messageReactions2.top_reactors;
                            }
                        }
                    } else if ((hf0Var2 instanceof uk1) && (messageObject = ((uk1) hf0Var2).getMessageObject()) != null) {
                        TLRPC.Message message2 = messageObject.k;
                        if (message2 != null && (tL_messageReactions = message2.reactions) != null) {
                            arrayList = tL_messageReactions.top_reactors;
                        }
                    }
                    ArrayList<TLRPC.MessageReactor> arrayList4 = arrayList;
                    eta etaVar = gta.v(messageObject.K1, false).B;
                    if (etaVar != null) {
                        etaVar.b();
                    }
                    TLRPC.ChatFull chatFull = mu1Var.r8;
                    k27 k27Var2 = messageObject;
                    bwa bwaVar = new bwa(jraVar.getContext(), mu1Var.getCurrentAccount(), mu1Var.a(), mu1Var, k27Var2, arrayList4, chatFull == null || chatFull.paid_reactions_available, false, 0L, mu1Var.getResourceProvider());
                    k27Var2.e1();
                    hf0 hf0Var3 = jraVar.b;
                    bwaVar.P1 = mu1Var;
                    bwaVar.Q1 = hf0Var3;
                    bwaVar.show();
                    break;
                }
                break;
            case 25:
                TLObject tLObject2 = (TLObject) this.b;
                ae9 ae9Var = (ae9) this.c;
                if (tLObject2 instanceof TL_stars.StarGifts) {
                    ae9Var.a((TL_stars.StarGifts) tLObject2);
                    break;
                } else {
                    ae9Var.a(null);
                    break;
                }
            case 26:
                boolean[] zArr = (boolean[]) this.b;
                i8c i8cVar = (i8c) this.c;
                if (!zArr[0]) {
                    i8cVar.a("cancelled", 0L);
                    zArr[0] = true;
                    break;
                }
                break;
            case 27:
                xsa xsaVar2 = (xsa) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                ArrayList arrayList5 = xsaVar2.l;
                int i3 = xsaVar2.a;
                if (tLObject3 instanceof TL_stars.TL_payments_savedStarGifts) {
                    TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject3;
                    na7.q1(i3).a4(tL_payments_savedStarGifts.users, false);
                    na7.q1(i3).U3(tL_payments_savedStarGifts.chats, false);
                    if (tL_payments_savedStarGifts.gifts.size() > 0) {
                        TL_stars.SavedStarGift savedStarGift = tL_payments_savedStarGifts.gifts.get(0);
                        int i4 = 0;
                        while (i4 < arrayList5.size() && ((TL_stars.SavedStarGift) arrayList5.get(i4)).pinned_to_top) {
                            i4++;
                        }
                        arrayList5.add(i4, savedStarGift);
                        kk7.f(i3).k(kk7.H3, Long.valueOf(xsaVar2.b), xsaVar2);
                        break;
                    }
                }
                break;
            case 28:
                new u21(((fx0[]) this.b)[0].F, (wjb) this.c).Q(R.raw.copy, 36, k96.M0(2131744710, null)).k(false);
                break;
            default:
                bwa bwaVar2 = (bwa) this.b;
                eta etaVar2 = (eta) this.c;
                bwaVar2.N1 = true;
                bwaVar2.E0(new cta(etaVar2, b3));
                gl.e3(new kva(bwaVar2, b4), 240L);
                break;
        }
    }

    public /* synthetic */ t7a(taa taaVar, TLObject tLObject, Context context) {
        this.a = (byte) 1;
        this.b = taaVar;
        this.c = tLObject;
    }

    public /* synthetic */ t7a(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
