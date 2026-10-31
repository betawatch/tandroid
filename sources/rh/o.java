package rh;

import android.content.Context;
import android.os.Process;
import android.os.StrictMode;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.j20;
import org.telegram.messenger.jj;
import org.telegram.messenger.vp;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Cells.b9;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ep;
import org.telegram.ui.Components.mj0;
import org.telegram.ui.Components.ro0;
import org.telegram.ui.Components.wb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.jo;
import org.telegram.ui.un;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        String str;
        cc a02;
        int i11;
        boolean z10;
        String a03;
        TLRPC.Chat L0;
        jj messageObject;
        TLRPC.TL_messageReactions tL_messageReactions;
        ArrayList<TLRPC.MessageReactor> arrayList;
        TLRPC.TL_messageReactions tL_messageReactions2;
        th.s0 s0Var;
        int i12 = this.a;
        int i13 = R.raw.error;
        int i14 = 3;
        final int i15 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i12) {
            case 0:
                p pVar = (p) obj2;
                TLObject tLObject = (TLObject) obj;
                int i16 = pVar.a;
                ArrayList arrayList2 = pVar.e;
                if (tLObject instanceof TL_payments.suggestedStarRefBots) {
                    TL_payments.suggestedStarRefBots suggestedstarrefbots = (TL_payments.suggestedStarRefBots) tLObject;
                    vp.r1(i16).V3(suggestedstarrefbots.users, false);
                    if (pVar.c <= 0) {
                        arrayList2.clear();
                    }
                    pVar.c = suggestedstarrefbots.count;
                    arrayList2.addAll(suggestedstarrefbots.suggested_bots);
                    pVar.j = suggestedstarrefbots.next_offset;
                    pVar.d = suggestedstarrefbots.suggested_bots.isEmpty() || arrayList2.size() >= pVar.c;
                    i10 = 1;
                } else {
                    i10 = 1;
                    pVar.i = true;
                    pVar.d = true;
                }
                pVar.h = false;
                zs f7 = zs.f(i16);
                Object[] objArr = new Object[i10];
                objArr[0] = Long.valueOf(pVar.b);
                f7.k(zs.K3, objArr);
                break;
            case 1:
                e4.g1((e4) obj2, (TL_stars.TL_payments_uniqueStarGift) obj);
                break;
            case 2:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ((org.telegram.ui.ActionBar.x1) obj2).dismiss();
                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                if (T != null) {
                    if (tL_error == null || !"STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error.text)) {
                        str = null;
                        a02 = cc.a0(T);
                        i11 = 2131743906;
                    } else {
                        a02 = cc.a0(T);
                        i13 = R.raw.fire_on;
                        i11 = 2131743905;
                        str = null;
                    }
                    org.telegram.messenger.m5.n(str, i11, a02, i13, 36);
                    break;
                }
                break;
            case 3:
                e4 e4Var = (e4) obj2;
                Long l4 = (Long) obj;
                String str2 = (l4.longValue() >= 0 || (L0 = vp.r1(e4Var.a).L0(Long.valueOf(-l4.longValue()))) == null) ? "" : L0.title;
                cc k10 = e4Var.k();
                if (TextUtils.isEmpty(str2)) {
                    a03 = cd.L0(2131749625, null);
                    z10 = true;
                } else {
                    z10 = true;
                    a03 = cd.a0(null, null, 2131749626, str2);
                }
                wb Q = k10.Q(R.raw.contact_check, 36, org.telegram.messenger.i0.W2(a03));
                Q.t = z10;
                Q.j();
                break;
            case 4:
                e4 e4Var2 = (e4) obj2;
                if (((e6) obj).e) {
                    e4Var2.c2.setLoading(false);
                    e4Var2.t1();
                    break;
                } else {
                    wb Q2 = e4Var2.k().Q(R.raw.error, 36, cd.a0(null, null, 2131743903, "NO_BALANCE"));
                    Q2.t = true;
                    Q2.j();
                    break;
                }
            case 5:
                vp.r1(((e4) obj2).a).L3((TLRPC.Updates) ((TLObject) obj), false);
                break;
            case 6:
                ((e4) obj2).k().f0((TLRPC.TL_error) obj, false);
                break;
            case 7:
                e4 e4Var3 = (e4) obj2;
                cc.a0((un) obj).L(R.raw.gift, cd.L0(2131745114, null), org.telegram.messenger.i0.W2(cd.a0(null, null, 2131745112, org.telegram.messenger.o5.t(e4Var3.P1))), cd.L0(2131745113, null), new w0(e4Var3, 8)).k(true);
                break;
            case 8:
                e4 e4Var4 = (e4) obj2;
                e4Var4.getClass();
                ((boolean[]) obj)[0] = true;
                e4Var4.c2.setLoading(false);
                e4Var4.t1();
                break;
            case 9:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
                z20.s(cd.a0(null, null, 2131749627, tL_starGiftUnique.title + " #" + tL_starGiftUnique.num), ((e4) obj2).k(), R.raw.ic_delete, 36);
                break;
            case 10:
                ((e4) obj2).o2((CharSequence) obj);
                break;
            case 11:
                i4 i4Var = (i4) obj2;
                un unVar = (un) obj;
                org.telegram.ui.Cells.z zVar = i4Var.b;
                if (zVar != null) {
                    try {
                        zVar.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    i4Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                    org.telegram.ui.Cells.z zVar2 = i4Var.b;
                    if (zVar2 instanceof org.telegram.ui.Cells.q1) {
                        messageObject = ((org.telegram.ui.Cells.q1) zVar2).getPrimaryMessageObject();
                        if (messageObject != null) {
                            TLRPC.Message message = messageObject.k;
                            if (message != null && (tL_messageReactions2 = message.reactions) != null) {
                                arrayList = tL_messageReactions2.top_reactors;
                            }
                            arrayList = null;
                        }
                    } else if ((zVar2 instanceof org.telegram.ui.Cells.s0) && (messageObject = ((org.telegram.ui.Cells.s0) zVar2).getMessageObject()) != null) {
                        TLRPC.Message message2 = messageObject.k;
                        if (message2 != null && (tL_messageReactions = message2.reactions) != null) {
                            arrayList = tL_messageReactions.top_reactors;
                        }
                        arrayList = null;
                    }
                    ArrayList<TLRPC.MessageReactor> arrayList3 = arrayList;
                    c6 c6Var = e6.y(messageObject.I1, false).B;
                    if (c6Var != null) {
                        c6Var.b();
                    }
                    TLRPC.ChatFull chatFull = unVar.p8;
                    jj jjVar = messageObject;
                    y8 y8Var = new y8(i4Var.getContext(), unVar.getCurrentAccount(), unVar.a(), unVar, jjVar, arrayList3, chatFull == null || chatFull.paid_reactions_available, false, 0L, unVar.getResourceProvider());
                    jjVar.f1();
                    org.telegram.ui.Cells.z zVar3 = i4Var.b;
                    y8Var.M1 = unVar;
                    y8Var.N1 = zVar3;
                    y8Var.show();
                    break;
                }
                break;
            case 12:
                TLObject tLObject2 = (TLObject) obj;
                ph.h1 h1Var = (ph.h1) obj2;
                if (tLObject2 instanceof TL_stars.StarGifts) {
                    h1Var.a((TL_stars.StarGifts) tLObject2);
                    break;
                } else {
                    h1Var.a(null);
                    break;
                }
            case 13:
                boolean[] zArr = (boolean[]) obj2;
                j20 j20Var = (j20) obj;
                if (!zArr[0]) {
                    j20Var.a("cancelled", 0L);
                    zArr[0] = true;
                    break;
                }
                break;
            case 14:
                v5 v5Var = (v5) obj2;
                TLObject tLObject3 = (TLObject) obj;
                ArrayList arrayList4 = v5Var.l;
                int i17 = v5Var.a;
                if (tLObject3 instanceof TL_stars.TL_payments_savedStarGifts) {
                    TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject3;
                    vp.r1(i17).V3(tL_payments_savedStarGifts.users, false);
                    vp.r1(i17).P3(tL_payments_savedStarGifts.chats, false);
                    if (tL_payments_savedStarGifts.gifts.size() > 0) {
                        TL_stars.SavedStarGift savedStarGift = tL_payments_savedStarGifts.gifts.get(0);
                        int i18 = 0;
                        while (i18 < arrayList4.size() && ((TL_stars.SavedStarGift) arrayList4.get(i18)).pinned_to_top) {
                            i18++;
                        }
                        arrayList4.add(i18, savedStarGift);
                        zs.f(i17).k(zs.G3, Long.valueOf(v5Var.b), v5Var);
                        break;
                    }
                }
                break;
            case 15:
                ((vp) obj2).L3((TLRPC.Updates) ((TLObject) obj), false);
                break;
            case 16:
                new cc(((org.telegram.ui.ActionBar.z2[]) obj2)[0].E, (org.telegram.ui.ActionBar.p6) obj).Q(R.raw.copy, 36, cd.L0(2131744965, null)).k(false);
                break;
            case 17:
                y8 y8Var2 = (y8) obj2;
                y8Var2.K1 = true;
                y8Var2.J0(new a6((c6) obj, 2));
                org.telegram.messenger.i0.h3(new i8(y8Var2, 1), 240L);
                break;
            case 18:
                s9.a aVar = (s9.a) obj2;
                Runnable runnable = (Runnable) obj;
                Process.setThreadPriority(aVar.c);
                StrictMode.ThreadPolicy threadPolicy = aVar.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
                break;
            case 19:
                Callable callable = (Callable) obj2;
                s9.i iVar = (s9.i) ((s9.g) obj).a;
                try {
                    iVar.k(callable.call());
                    break;
                } catch (Exception e) {
                    iVar.l(e);
                    return;
                }
            case 20:
                sg.o oVar = (sg.o) obj2;
                org.telegram.ui.Components.o5 o5Var = (org.telegram.ui.Components.o5) obj;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(oVar.h.getText());
                for (org.telegram.ui.Components.o5 o5Var2 : (org.telegram.ui.Components.o5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.o5.class)) {
                    if (o5Var2 == o5Var) {
                        int editTextSelectionEnd = oVar.h.getEditTextSelectionEnd();
                        int spanEnd = spannableStringBuilder.getSpanEnd(o5Var2);
                        int spanStart = spannableStringBuilder.getSpanStart(o5Var2);
                        oVar.h.getText().delete(spanStart, spanEnd);
                        int i19 = spanEnd - spanStart;
                        sg.l lVar = oVar.h;
                        if (spanEnd <= editTextSelectionEnd) {
                            editTextSelectionEnd -= i19;
                        }
                        lVar.setSelection(editTextSelectionEnd);
                        break;
                    }
                }
                break;
            case 21:
                sg.o oVar2 = (sg.o) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                if (oVar2.V == null || !tL_error2.text.equals("BOOSTS_REQUIRED")) {
                    String str3 = tL_error2.text;
                    if (str3.equals("REACTIONS_TOO_MANY")) {
                        str3 = cd.G(oVar2.M, "ReactionMaxCountError", new Object[0]);
                    }
                    cc.a0(oVar2).t(str3, null).j();
                    break;
                } else {
                    sg.q0.f(-oVar2.R, oVar2.W, oVar2.V);
                    break;
                }
            case 22:
                org.telegram.ui.Components.o5 o5Var3 = (org.telegram.ui.Components.o5) obj;
                sg.o oVar3 = ((sg.m) obj2).f2;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(oVar3.h.getText());
                for (org.telegram.ui.Components.o5 o5Var4 : (org.telegram.ui.Components.o5[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), org.telegram.ui.Components.o5.class)) {
                    if (o5Var4 == o5Var3) {
                        int editTextSelectionEnd2 = oVar3.h.getEditTextSelectionEnd();
                        int spanEnd2 = spannableStringBuilder2.getSpanEnd(o5Var4);
                        int spanStart2 = spannableStringBuilder2.getSpanStart(o5Var4);
                        oVar3.h.getText().delete(spanStart2, spanEnd2);
                        int i20 = spanEnd2 - spanStart2;
                        sg.l lVar2 = oVar3.h;
                        if (spanEnd2 <= editTextSelectionEnd2) {
                            editTextSelectionEnd2 -= i20;
                        }
                        lVar2.setSelection(editTextSelectionEnd2);
                        break;
                    }
                }
                break;
            case 23:
                sg.b0 b0Var = (sg.b0) obj2;
                mj0 mj0Var = (mj0) obj;
                b0Var.l = true;
                b0Var.a.invalidate();
                mj0Var.c1 = false;
                mj0Var.invalidate();
                b0Var.c(true);
                break;
            case 24:
                sg.d0 d0Var = (sg.d0) obj2;
                sg.b bVar = (sg.b) obj;
                d0Var.getText().delete(d0Var.getText().getSpanStart(bVar), d0Var.getText().getSpanEnd(bVar));
                d0Var.setCursorVisible(true);
                d0Var.setLongClickable(true);
                break;
            case 25:
                sg.p0 p0Var = (sg.p0) obj2;
                sg.m0 m0Var = (sg.m0) obj;
                p0Var.getClass();
                TLRPC.ReactionCount reactionCount = m0Var.a;
                ViewParent viewParent = p0Var.w;
                if (c3.i0.t(viewParent)) {
                    ((org.telegram.ui.Cells.r4) viewParent).e(reactionCount, true, 0.0f, 0.0f);
                }
                m0Var.X.c(false);
                p0Var.P = null;
                p0Var.Q = false;
                p0Var.R = null;
                break;
            case 26:
                ((th.o7) obj2).V(ProfileActivity.z4(((th.h0) obj).c));
                break;
            case 27:
                th.p1 p1Var = (th.p1) obj2;
                org.telegram.messenger.i0.g(((th.c0) obj).w);
                if (org.telegram.messenger.i0.H3()) {
                    Toast.makeText(p1Var.getContext(), cd.L0(2131744219, null), 0).show();
                    break;
                }
                break;
            case 28:
                th.p1 p1Var2 = (th.p1) obj2;
                th.h0 h0Var = (th.h0) obj;
                long j10 = h0Var.c;
                th.z2 z2Var = p1Var2.i0;
                if (j10 != d20.i(z2Var.l2).e() && ((s0Var = p1Var2.h0.A0) == null || j10 != org.telegram.messenger.o5.o(s0Var.i()))) {
                    if (z2Var.x3 != null) {
                        for (int i21 = 0; i21 < z2Var.x3.peers.size(); i21++) {
                            if (j10 != org.telegram.messenger.o5.o(z2Var.x3.peers.get(i21).peer)) {
                            }
                        }
                    }
                    Context context = p1Var2.getContext();
                    long j11 = h0Var.c;
                    jo joVar = new jo(4, p1Var2, h0Var);
                    ro0 ro0Var = new ro0(i14);
                    org.telegram.ui.ActionBar.z2 z2Var2 = new org.telegram.ui.ActionBar.z2(1, context, (org.telegram.ui.ActionBar.p6) ro0Var, false);
                    z2Var2.O();
                    LinearLayout f10 = org.telegram.messenger.m5.f(context, 1);
                    TextView g10 = org.telegram.messenger.m5.g(context, 1, 20.0f);
                    org.telegram.ui.ActionBar.a7.V(g10, org.telegram.ui.ActionBar.t6.j5, ro0Var);
                    g10.setTypeface(org.telegram.messenger.i0.o());
                    g10.setText(cd.L0(2131751497, null));
                    f10.addView(g10, w7.b6.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
                    org.telegram.ui.Cells.p4 p4Var = new org.telegram.ui.Cells.p4(context, ro0Var);
                    p4Var.setText(cd.L0(2131751594, null));
                    f10.addView(p4Var, w7.b6.k(0.0f, 0.0f, 0.0f, 4.0f, -1, -2));
                    final org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(4, 21, context, ro0Var, true);
                    ep checkBoxRound = c2Var.getCheckBoxRound();
                    int i22 = org.telegram.ui.ActionBar.t6.V6;
                    int i23 = org.telegram.ui.ActionBar.t6.g7;
                    int i24 = org.telegram.ui.ActionBar.t6.k7;
                    checkBoxRound.b(i22, i23, i24);
                    c2Var.e(cd.L0(2131751503, null), null, false, true, false);
                    c2Var.setOnClickListener(new View.OnClickListener() { // from class: th.v
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i15) {
                                case 0:
                                    c2Var.c(!r3.b(), true);
                                    break;
                                case 1:
                                    c2Var.c(!r3.b(), true);
                                    break;
                                default:
                                    c2Var.c(!r3.b(), true);
                                    break;
                            }
                        }
                    });
                    int i25 = org.telegram.ui.ActionBar.t6.i6;
                    org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i25, ro0Var), 2, -1);
                    org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i25);
                    c2Var.setBackground(h02);
                    org.telegram.ui.ActionBar.a7.k(c2Var, h02, null, N, ro0Var);
                    f10.addView(c2Var, w7.b6.o(-1, -2));
                    final org.telegram.ui.Cells.c2 c2Var2 = new org.telegram.ui.Cells.c2(4, 21, context, ro0Var, true);
                    c2Var2.getCheckBoxRound().b(i22, i23, i24);
                    final int i26 = 1;
                    c2Var2.e(cd.a0(null, null, 2131751588, org.telegram.messenger.o5.l(d20.s0, j11)), null, false, true, false);
                    c2Var2.setOnClickListener(new View.OnClickListener() { // from class: th.v
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i26) {
                                case 0:
                                    c2Var2.c(!r3.b(), true);
                                    break;
                                case 1:
                                    c2Var2.c(!r3.b(), true);
                                    break;
                                default:
                                    c2Var2.c(!r3.b(), true);
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i25, ro0Var), 2, -1);
                    org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i25);
                    c2Var2.setBackground(h03);
                    org.telegram.ui.ActionBar.a7.k(c2Var2, h03, null, N2, ro0Var);
                    f10.addView(c2Var2, w7.b6.o(-1, -2));
                    final org.telegram.ui.Cells.c2 c2Var3 = new org.telegram.ui.Cells.c2(4, 21, context, ro0Var, true);
                    c2Var3.getCheckBoxRound().b(i22, i23, i24);
                    c2Var3.e(cd.a0(null, null, 2131751569, org.telegram.messenger.o5.l(d20.s0, j11)), null, false, false, false);
                    final int i27 = 2;
                    c2Var3.setOnClickListener(new View.OnClickListener() { // from class: th.v
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i27) {
                                case 0:
                                    c2Var3.c(!r3.b(), true);
                                    break;
                                case 1:
                                    c2Var3.c(!r3.b(), true);
                                    break;
                                default:
                                    c2Var3.c(!r3.b(), true);
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i25, ro0Var), 2, -1);
                    org.telegram.ui.ActionBar.w6 N3 = org.telegram.ui.ActionBar.a7.N(i25);
                    c2Var3.setBackground(h04);
                    org.telegram.ui.ActionBar.a7.k(c2Var3, h04, null, N3, ro0Var);
                    f10.addView(c2Var3, w7.b6.o(-1, -2));
                    b9 b9Var = new b9(context, ro0Var);
                    b9Var.setBackgroundColor(-16777216);
                    b9Var.setFixedSize(12);
                    f10.addView(b9Var, w7.b6.o(-1, -2));
                    FrameLayout frameLayout = new FrameLayout(context);
                    vh.d dVar = new vh.d(context, ro0Var, true);
                    dVar.i(cd.L0(2131751514, null), false, true);
                    dVar.setOnClickListener(new bi.c(c2Var, c2Var2, c2Var3, joVar, z2Var2, 12));
                    frameLayout.addView(dVar, w7.b6.d(-1, 48.0f, zs.E1, 16.0f, 16.0f, 16.0f, 16.0f));
                    f10.addView(frameLayout, w7.b6.o(-1, -2));
                    z2Var2.N = f10;
                    z2Var2.show();
                    break;
                }
                TL_phone.deleteGroupCallMessages deletegroupcallmessages = new TL_phone.deleteGroupCallMessages();
                deletegroupcallmessages.call = p1Var2.O;
                deletegroupcallmessages.messages.add(Integer.valueOf(h0Var.a));
                ConnectionsManager.getInstance(p1Var2.N).sendRequest(deletegroupcallmessages, null);
                p1Var2.c(h0Var.a);
                break;
            default:
                th.s0 s0Var2 = (th.s0) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                int size = arrayList5.size();
                int i28 = 0;
                while (i28 < size) {
                    Object obj3 = arrayList5.get(i28);
                    i28++;
                    TL_update.TL_updateGroupCallMessage tL_updateGroupCallMessage = (TL_update.TL_updateGroupCallMessage) obj3;
                    zs.f(s0Var2.e).k(zs.H2, Long.valueOf(tL_updateGroupCallMessage.call.id), tL_updateGroupCallMessage, Boolean.TRUE);
                }
                break;
        }
    }

    public /* synthetic */ o(TLObject tLObject, ph.h1 h1Var) {
        this.a = 12;
        this.c = tLObject;
        this.b = h1Var;
    }

    public /* synthetic */ o(e6 e6Var, boolean[] zArr, j20 j20Var) {
        this.a = 13;
        this.b = zArr;
        this.c = j20Var;
    }
}
