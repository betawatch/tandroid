// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONObject;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Components.b0;
import org.telegram.ui.Components.c0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class s19 implements f59 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s19(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void a(int i, View view) {
        oyb oybVar = (oyb) this.b;
        ArrayList arrayList = oybVar.U;
        if (i < 0 || i >= arrayList.size()) {
            return;
        }
        lyb lybVar = (lyb) arrayList.get(i);
        long j = lybVar.a;
        if (j != 0) {
            if (oybVar.V == j) {
                j = 0;
            }
            oybVar.V = j;
        } else {
            oybVar.W = lybVar.b.equals(oybVar.W) ? null : lybVar.b;
        }
        gm.d0(oybVar.S, new byb((byte) 0));
        oybVar.l(false);
        oybVar.n();
    }

    private final void b(int i, View view) {
        TLRPC.StickerSetCovered stickerSetCovered;
        d4c d4cVar = (d4c) this.b;
        y59 adapter = d4cVar.n.getAdapter();
        e3b e3bVar = d4cVar.w;
        if (adapter == e3bVar) {
            stickerSetCovered = (TLRPC.StickerSetCovered) e3bVar.L.get(i);
        } else {
            c4c c4cVar = d4cVar.s;
            stickerSetCovered = i < c4cVar.x ? (TLRPC.StickerSetCovered) c4cVar.f.get(i) : null;
        }
        if (stickerSetCovered != null) {
            d4cVar.b(stickerSetCovered.set, null);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:159|(3:161|(1:163)|164)|165|(2:167|(5:169|(1:171)(1:213)|(1:173)|(1:212)(5:177|178|179|(1:181)(1:209)|182)|(5:189|190|191|192|(2:194|195)(1:196))(3:199|(3:201|(2:204|202)|205)(1:207)|206))(6:214|215|190|191|192|(0)(0)))|216|215|190|191|192|(0)(0)) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:196:? A[RETURN, SYNTHETIC] */
    @Override // f59
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(int i, View view) {
        z19 z19Var;
        c6c G;
        c6c G2;
        c6c G3;
        c6c G4;
        r0b[] r0bVarArr;
        TLRPC.StickerSet stickerSet;
        ddb ddbVar;
        int intValue;
        int intValue2;
        int i2;
        bdb bdbVar;
        CharSequence m;
        gn[] gnVarArr;
        ArrayList arrayList;
        u69 K;
        int i3 = 3;
        Paint.FontMetricsInt fontMetricsInt = null;
        byte b = 0;
        byte b2 = 1;
        switch (this.a) {
            case 0:
                c29 c29Var = (c29) this.b;
                ArrayList arrayList2 = c29Var.n;
                int d = c29Var.f.d(i);
                if (d == 0) {
                    b29 b29Var = c29Var.F;
                    if (b29Var != null) {
                        b29Var.i(k47.B1(((TLRPC.MessagePeerReaction) arrayList2.get(i)).peer_id), (TLRPC.MessagePeerReaction) arrayList2.get(i));
                        return;
                    }
                    return;
                }
                if (d != 1 || (z19Var = c29Var.H) == null) {
                    return;
                }
                z19Var.c(c29Var.J);
                return;
            case 1:
                v29 v29Var = (v29) this.b;
                u29 u29Var = v29Var.h0;
                if (u29Var == null || !(view instanceof t29)) {
                    return;
                }
                u29Var.g(v29Var, ((t29) view).e, false, false);
                return;
            case 2:
                ((a39) this.b).g0(view);
                return;
            case 3:
                ((qc9) this.b).d0(i, view);
                return;
            case 4:
                vn9 vn9Var = (vn9) this.b;
                if (i == 1) {
                    vn9Var.d0(2131745719, new CharSequence[]{"480p", "360p"}, new i98((byte) 24));
                    return;
                }
                if (i == 2) {
                    vn9Var.d0(2131745729, new CharSequence[]{jb6.M0(2131745728, null), jb6.M0(2131745726, null), jb6.M0(2131745727, null)}, new i98((byte) 25));
                    return;
                }
                if (i == 3) {
                    vn9Var.d0(2131745722, new CharSequence[]{"30 FPS", "60 FPS"}, new i98((byte) 26));
                    return;
                }
                if (i != 4) {
                    if (i == 7) {
                        in0 in0Var = yed.h;
                        in0Var.a();
                        boolean z = !in0Var.d;
                        synchronized (in0Var) {
                            in0Var.d = z;
                            in0Var.c = true;
                            in0Var.b = true;
                            jaa.a.edit().putBoolean("round_video_composition", z).apply();
                        }
                        ((ny0) vn9Var.c).g(i);
                        return;
                    }
                    return;
                }
                CharSequence[] charSequenceArr = new CharSequence[4];
                while (true) {
                    int[] iArr = vn9.d;
                    if (b >= 3) {
                        vn9Var.d0(2131745730, charSequenceArr, new i98((byte) 27));
                        return;
                    } else {
                        charSequenceArr[b] = vn9.b0(iArr[b]);
                        b++;
                    }
                }
            case 5:
                k0a k0aVar = (k0a) this.b;
                c6c G5 = k0aVar.d2.G(i - 1);
                if (G5 != null) {
                    Object obj = G5.H;
                    if ((obj instanceof TLRPC.User) || (obj instanceof TLRPC.Chat)) {
                        ((ut8) view).w(true, true);
                        k0aVar.V1 = (TLObject) G5.H;
                        k0aVar.Z0(true);
                        k0aVar.d2.O(true);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                p0a p0aVar = (p0a) this.b;
                b61 b61Var = p0aVar.X1;
                HashSet hashSet = p0aVar.U1;
                l7c l7cVar = p0aVar.b2;
                if (l7cVar == null || (G = l7cVar.G(i - 1)) == null) {
                    return;
                }
                Object obj2 = G.H;
                if (obj2 instanceof TL_stars.SavedStarGift) {
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj2;
                    int i4 = savedStarGift.msg_id;
                    long j = i4 == 0 ? savedStarGift.saved_id : i4;
                    if (hashSet.contains(Long.valueOf(j))) {
                        hashSet.remove(Long.valueOf(j));
                        ((ox4) view).c(false, true);
                        G.e = false;
                    } else {
                        hashSet.add(Long.valueOf(j));
                        ((ox4) view).c(true, true);
                        G.e = true;
                    }
                    b61Var.setEnabled(hashSet.size() > 0);
                    b61Var.c(hashSet.size(), true);
                    return;
                }
                return;
            case 7:
                ((s0a) this.b).Z0(i, view);
                return;
            case 8:
                ((SessionsActivity) this.b).l0(i);
                return;
            case 9:
                cg5 cg5Var = (cg5) view;
                tca tcaVar = ((qca) this.b).L;
                TLRPC.TL_topPeer tL_topPeer = (TLRPC.TL_topPeer) hs6.d0(tcaVar.a).j1.get(i);
                TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                TLRPC.Peer peer = tL_topPeer.peer;
                long j2 = peer.user_id;
                if (j2 == 0) {
                    long j3 = peer.channel_id;
                    if (j3 == 0) {
                        j3 = peer.chat_id;
                        if (j3 == 0) {
                            j2 = 0;
                        }
                    }
                    j2 = -j3;
                }
                if (cg5Var.F) {
                    tcaVar.S0(j2, cg5Var);
                    return;
                }
                tL_dialog.id = j2;
                tcaVar.O0(null, tL_dialog);
                boolean z2 = tcaVar.P1.h(j2) >= 0;
                if (cg5Var.x) {
                    cg5Var.w.a(z2, true);
                    return;
                }
                return;
            case 10:
                mia miaVar = (mia) this.b;
                int i5 = i - 1;
                if (i5 < 0 || i5 >= dd6.g()) {
                    return;
                }
                miaVar.r1.d(mia.D0(i5));
                miaVar.dismiss();
                return;
            case 11:
                apa apaVar = (apa) this.b;
                c6c G6 = apaVar.S1.G(i - 1);
                Object obj3 = G6 != null ? G6.H : null;
                if (obj3 instanceof TLRPC.User) {
                    oc7.r1(apaVar.a).B3(apaVar.i1, (TLRPC.User) obj3, null, 0, null, false, false);
                    return;
                }
                return;
            case 12:
                ((nxa) this.b).M0(i);
                return;
            case 13:
                zwa zwaVar = (zwa) this.b;
                l7c l7cVar2 = zwaVar.W1;
                if (l7cVar2 == null || (G2 = l7cVar2.G(i - 1)) == null) {
                    return;
                }
                l7c l7cVar3 = zwaVar.W1;
                if (G2.d == -1) {
                    zwaVar.X1 = !zwaVar.X1;
                    l7cVar3.O(true);
                    zwaVar.n1.x0(0, gm.L(200.0f), d53.g);
                    return;
                }
                if (G2.H(axa.class) && (G2.H instanceof TL_stars.TL_starsGiftOption)) {
                    Context W = gm.W(zwaVar.getContext());
                    if (W == null) {
                        W = LaunchActivity.H1;
                    }
                    Context context = W;
                    if (context != null) {
                        long j4 = zwaVar.U1.id;
                        jva v = jva.v(zwaVar.a, false);
                        TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) G2.H;
                        fv4 fv4Var = new fv4((Object) zwaVar, (Object) G2, j4, (byte) 6);
                        int i6 = v.a;
                        if (!oc7.r1(i6).c5()) {
                            d Q = LaunchActivity.Q();
                            if (Q == null || Q.getContext() == null) {
                                jva.c0(context, null);
                                return;
                            } else {
                                jva.c0(Q.getContext(), Q.getResourceProvider());
                                return;
                            }
                        }
                        if (!e21.b() && cj0.h().j()) {
                            TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = new TLRPC.TL_inputStorePaymentStarsGift();
                            tL_inputStorePaymentStarsGift.stars = tL_starsGiftOption.stars;
                            tL_inputStorePaymentStarsGift.currency = tL_starsGiftOption.currency;
                            tL_inputStorePaymentStarsGift.amount = tL_starsGiftOption.amount;
                            tL_inputStorePaymentStarsGift.user_id = oc7.r1(i6).n1(j4);
                            i5 i5Var = new i5();
                            i5Var.b = "inapp";
                            i5Var.a = tL_starsGiftOption.store_product;
                            cj0.h().o(Arrays.asList(i5Var.a()), new ki(v, fv4Var, tL_inputStorePaymentStarsGift, tL_starsGiftOption, context));
                            return;
                        }
                        TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift2 = new TLRPC.TL_inputStorePaymentStarsGift();
                        tL_inputStorePaymentStarsGift2.stars = tL_starsGiftOption.stars;
                        tL_inputStorePaymentStarsGift2.amount = tL_starsGiftOption.amount;
                        tL_inputStorePaymentStarsGift2.currency = tL_starsGiftOption.currency;
                        tL_inputStorePaymentStarsGift2.user_id = oc7.r1(i6).n1(j4);
                        TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
                        tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsGift2;
                        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                        JSONObject u = wx0.u(jva.F(), false);
                        if (u != null) {
                            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                            tL_dataJSON.data = u.toString();
                            tL_payments_getPaymentForm.flags |= 1;
                        }
                        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
                        ConnectionsManager.getInstance(i6).sendRequest(tL_payments_getPaymentForm, new fm8((Object) v, (Object) fv4Var, (Object) tL_inputInvoiceStars, (byte) 19));
                        return;
                    }
                    return;
                }
                return;
            case 14:
                dxa dxaVar = (dxa) this.b;
                l7c l7cVar4 = dxaVar.Z1;
                if (l7cVar4 == null || (G3 = l7cVar4.G(i - 1)) == null) {
                    return;
                }
                l7c l7cVar5 = dxaVar.Z1;
                if (G3.d == -1) {
                    dxaVar.a2 = !dxaVar.a2;
                    l7cVar5.O(true);
                    return;
                } else {
                    if (G3.H(axa.class) && (G3.H instanceof TL_stars.TL_starsTopupOption)) {
                        Activity W2 = gm.W(dxaVar.getContext());
                        if (W2 == null) {
                            W2 = LaunchActivity.H1;
                        }
                        if (W2 != null) {
                            jva.v(dxaVar.a, false).d(W2, (TL_stars.TL_starsTopupOption) G3.H, new s87(dxaVar, G3, (byte) 15), dxaVar.X1);
                            return;
                        }
                        return;
                    }
                    return;
                }
            case 15:
                exa exaVar = (exa) this.b;
                l7c l7cVar6 = exaVar.T1;
                if (l7cVar6 == null || (G4 = l7cVar6.G(i - 1)) == null) {
                    return;
                }
                l7c l7cVar7 = exaVar.T1;
                if (G4.d == -1) {
                    exaVar.U1 = !exaVar.U1;
                    l7cVar7.O(true);
                    exaVar.n1.x0(0, gm.L(300.0f), null);
                    return;
                } else {
                    if (G4.H(axa.class) && (G4.H instanceof TL_stars.TL_starsTopupOption)) {
                        Activity W3 = gm.W(exaVar.getContext());
                        if (W3 == null) {
                            W3 = LaunchActivity.H1;
                        }
                        if (W3 != null) {
                            jva.v(exaVar.a, false).d(W3, (TL_stars.TL_starsTopupOption) G4.H, new s87(exaVar, G4, (byte) 16), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
            case 16:
                xza xzaVar = (xza) this.b;
                ArrayList arrayList3 = xzaVar.O;
                ArrayList arrayList4 = xzaVar.P;
                bza bzaVar = xzaVar.X;
                int i7 = bzaVar.J;
                if (i >= i7 && i <= bzaVar.K) {
                    uza uzaVar = (uza) xzaVar.z0.get(i - i7);
                    t67 t67Var = new t67(xzaVar.b, uzaVar.b, true);
                    t67Var.f0 = uzaVar;
                    xzaVar.presentFragment(t67Var);
                    return;
                }
                int i8 = bzaVar.V;
                if (i >= i8 && i <= bzaVar.W) {
                    ((qza) xzaVar.R.get(i - i8)).b(xzaVar);
                    return;
                }
                int i9 = bzaVar.S;
                if (i >= i9 && i <= bzaVar.T) {
                    ((qza) arrayList4.get(i - i9)).b(xzaVar);
                    return;
                }
                int i10 = bzaVar.Y;
                if (i >= i10 && i <= bzaVar.Z) {
                    ((qza) xzaVar.Q.get(i - i10)).b(xzaVar);
                    return;
                }
                if (i == bzaVar.a0) {
                    int size = arrayList3.size() - arrayList4.size();
                    int i11 = xzaVar.X.a0;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    bza bzaVar2 = xzaVar.X;
                    if (bzaVar2 != null) {
                        bzaVar2.E();
                        xzaVar.T.setItemAnimator(xzaVar.Y);
                        xzaVar.X.p(i11 + 1, size);
                        xzaVar.X.s(i11);
                        return;
                    }
                    return;
                }
                return;
            case 17:
                u0b u0bVar = (u0b) this.b;
                if (i < 1 || (r0bVarArr = u0bVar.g3) == null) {
                    return;
                }
                r0b r0bVar = r0bVarArr[i - 1];
                int L = gm.L(64.0f);
                if (u0bVar.getMeasuredWidth() - view.getRight() < L) {
                    u0bVar.x0(L - (u0bVar.getMeasuredWidth() - view.getRight()), 0, d53.h);
                } else if (view.getLeft() < L) {
                    u0bVar.x0(-(L - view.getLeft()), 0, d53.h);
                }
                qac qacVar = u0bVar.v3;
                if (qacVar != null) {
                    qacVar.a(r0bVar);
                    return;
                }
                return;
            case 18:
                x2b x2bVar = (x2b) this.b;
                if (view instanceof r2b) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = x2bVar.M1;
                    d dVar = x2bVar.F1;
                    ylb ylbVar = x2bVar.J0;
                    if (dVar != null) {
                        Context context2 = dVar.getContext();
                        if (!(dVar instanceof yv1)) {
                            c3b.a(tL_messages_stickerSet, dVar, ylbVar);
                            return;
                        }
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert3, 0, ylbVar, context2);
                        ArrayList arrayList5 = new ArrayList();
                        ArrayList arrayList6 = new ArrayList();
                        ArrayList arrayList7 = new ArrayList();
                        b10.r(null, 2131744551, arrayList5, R.drawable.menu_sticker_add, arrayList7);
                        arrayList6.add(0);
                        arrayList5.add(jb6.M0(2131744558, null));
                        arrayList7.add(Integer.valueOf(R.drawable.menu_sticker_select));
                        arrayList6.add(1);
                        m8 m8Var = new m8(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        ylb ylbVar2 = ylbVar;
                        oh ohVar = new oh(m8Var, arrayList6, tL_messages_stickerSet, dVar, ylbVar2);
                        int i12 = 0;
                        while (i12 < arrayList5.size()) {
                            ylb ylbVar3 = ylbVar2;
                            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            a8 c = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, ((Integer) arrayList7.get(i12)).intValue(), (CharSequence) arrayList5.get(i12), false, ylbVar3);
                            ylbVar2 = ylbVar3;
                            c.setTag(Integer.valueOf(i12));
                            c.setOnClickListener(ohVar);
                            i12++;
                            actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                        }
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                        m8Var.c = (short) 100;
                        m8Var.g = true;
                        m8Var.setOutsideTouchable(true);
                        m8Var.setClippingEnabled(true);
                        m8Var.setAnimationStyle(R.style.PopupContextAnimation);
                        m8Var.setFocusable(true);
                        actionBarPopupWindow$ActionBarPopupWindowLayout3.measure(View.MeasureSpec.makeMeasureSpec(gm.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gm.L(1000.0f), TLObject.FLAG_31));
                        m8Var.setInputMethodMode(2);
                        m8Var.getContentView().setFocusableInTouchMode(true);
                        int[] iArr2 = new int[2];
                        view.getLocationInWindow(iArr2);
                        m8Var.showAtLocation(view, 0, ((view.getMeasuredWidth() / 2) + iArr2[0]) - (actionBarPopupWindow$ActionBarPopupWindowLayout3.getMeasuredWidth() / 2), ((view.getMeasuredHeight() / 2) + iArr2[1]) - (actionBarPopupWindow$ActionBarPopupWindowLayout3.getMeasuredHeight() / 2));
                        m8Var.b();
                        return;
                    }
                    return;
                }
                if (x2bVar.L1) {
                    return;
                }
                if (x2bVar.Q1 != null) {
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) x2bVar.n1.f.get(i);
                    if (stickerSetCovered != null) {
                        x2bVar.dismiss();
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet2 = stickerSetCovered.set;
                        tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                        tL_inputStickerSetID.id = stickerSet2.id;
                        new x2b(x2bVar.H1, x2bVar.F1, tL_inputStickerSetID, null, null, x2bVar.J0).show();
                        return;
                    }
                    return;
                }
                ArrayList arrayList8 = x2bVar.S1;
                if (arrayList8 != null) {
                    if (i < 0 || i >= arrayList8.size()) {
                        return;
                    }
                    t5a t5aVar = (t5a) x2bVar.S1.get(i);
                    x2bVar.O1 = t5aVar;
                    if (t5aVar.c) {
                        TextView textView = x2bVar.A1;
                        textView.setText(gw3.m(t5aVar.b, textView.getPaint().getFontMetricsInt(), false, null, 0));
                        x2bVar.z1.k(gn5.g(x2bVar.O1.a), null, null, null, null, x2bVar.O1.e ? "tgs" : null, 0, null);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) x2bVar.w1.getLayoutParams();
                        layoutParams.topMargin = x2bVar.Y1;
                        x2bVar.w1.setLayoutParams(layoutParams);
                        x2bVar.w1.setVisibility(0);
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(ObjectAnimator.ofFloat(x2bVar.w1, (Property<FrameLayout, Float>) View.ALPHA, 0.0f, 1.0f));
                        animatorSet.setDuration(200L);
                        animatorSet.start();
                        return;
                    }
                    return;
                }
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = x2bVar.M1;
                if (tL_messages_stickerSet2 == null || i < 0 || i >= tL_messages_stickerSet2.documents.size()) {
                    return;
                }
                x2bVar.N1 = x2bVar.M1.documents.get(i);
                int i13 = 0;
                while (true) {
                    if (i13 < x2bVar.N1.attributes.size()) {
                        TLRPC.DocumentAttribute documentAttribute = x2bVar.N1.attributes.get(i13);
                        if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                            String str = documentAttribute.alt;
                            if (str != null && str.length() > 0) {
                                TextView textView2 = x2bVar.A1;
                                textView2.setText(gw3.m(documentAttribute.alt, textView2.getPaint().getFontMetricsInt(), false, null, 0));
                            }
                        } else {
                            i13++;
                        }
                    }
                }
                TextView textView3 = x2bVar.A1;
                String str2 = (String) hs6.d0(x2bVar.a).d0.f(x2bVar.N1.id);
                if (str2 == null) {
                    str2 = "";
                }
                textView3.setText(gw3.m(str2, x2bVar.A1.getPaint().getFontMetricsInt(), false, null, 0));
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = x2bVar.M1;
                if ((tL_messages_stickerSet3 == null || (stickerSet = tL_messages_stickerSet3.set) == null || !stickerSet.emojis) && !hx2.e().m(view)) {
                    x2bVar.z1.getImageReceiver().b0(gn5.b(x2bVar.N1), null, gn5.c(bc4.w(x2bVar.N1.thumbs, 90, false, null, false), x2bVar.N1), null, "webp", x2bVar.M1, 1);
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) x2bVar.w1.getLayoutParams();
                    layoutParams2.topMargin = x2bVar.Y1;
                    x2bVar.w1.setLayoutParams(layoutParams2);
                    x2bVar.w1.setVisibility(0);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(x2bVar.w1, (Property<FrameLayout, Float>) View.ALPHA, 0.0f, 1.0f));
                    animatorSet2.setDuration(200L);
                    animatorSet2.start();
                    return;
                }
                return;
            case 19:
                fdb fdbVar = (fdb) this.b;
                String str3 = ((edb) view).a;
                if (!fdbVar.s || (ddbVar = fdbVar.c) == null || !(ddbVar.getFieldText() instanceof Spanned)) {
                    return;
                }
                if (fdbVar.W != null) {
                    intValue = ((Spanned) fdbVar.c.getFieldText()).getSpanStart(fdbVar.W);
                    intValue2 = ((Spanned) fdbVar.c.getFieldText()).getSpanEnd(fdbVar.W);
                } else {
                    Integer num = fdbVar.b0;
                    if (num == null || fdbVar.c0 == null) {
                        return;
                    }
                    intValue = num.intValue();
                    intValue2 = fdbVar.c0.intValue();
                    fdbVar.c0 = null;
                    fdbVar.b0 = null;
                }
                Editable editText = fdbVar.c.getEditText();
                if (editText == null || intValue < 0 || intValue2 < 0 || intValue > editText.length() || intValue2 > editText.length()) {
                    return;
                }
                if (fdbVar.W != null) {
                    if (fdbVar.c.getFieldText() instanceof Spannable) {
                        ((Spannable) fdbVar.c.getFieldText()).removeSpan(fdbVar.W);
                    }
                    fdbVar.W = null;
                }
                String obj4 = editText.toString();
                String substring = obj4.substring(intValue, intValue2);
                int length = substring.length();
                int i14 = intValue2 - length;
                while (i14 >= 0) {
                    int i15 = i14 + length;
                    if (obj4.substring(i14, i15).equals(substring)) {
                        Paint.FontMetricsInt fontMetricsInt2 = fdbVar.c.getEditField() != null ? fdbVar.c.getEditField().getPaint().getFontMetricsInt() : fontMetricsInt;
                        if (fontMetricsInt2 == null) {
                            Paint paint = new Paint();
                            paint.setTextSize(gm.L(18.0f));
                            fontMetricsInt2 = paint.getFontMetricsInt();
                        }
                        if (str3 == null || !str3.startsWith("animated_")) {
                            m = gw3.m(str3, fontMetricsInt2, true, fontMetricsInt, 0);
                        } else {
                            try {
                                long parseLong = Long.parseLong(str3.substring(9));
                                TLRPC.Document e = vm.e(fdbVar.a, parseLong);
                                SpannableString spannableString = new SpannableString(k47.U(e));
                                spannableString.setSpan(e == null ? new gn(parseLong, fontMetricsInt2) : new gn(e, fontMetricsInt2), 0, spannableString.length(), 33);
                                m = spannableString;
                            } catch (Exception unused) {
                                m = null;
                            }
                        }
                        if (m == null || ((gnVarArr = (gn[]) editText.getSpans(i14, i15, gn.class)) != null && gnVarArr.length > 0)) {
                            i2 = 3;
                            fdbVar.performHapticFeedback(i2, 1);
                            gw3.a(str3);
                            fdbVar.s = false;
                            fdbVar.w = true;
                            fdbVar.J = (byte) 0;
                            bdbVar = fdbVar.d;
                            if (bdbVar != null) {
                                bdbVar.invalidate();
                                return;
                            }
                            return;
                        }
                        dw3[] dw3VarArr = (dw3[]) editText.getSpans(i14, i15, dw3.class);
                        if (dw3VarArr != null) {
                            for (dw3 dw3Var : dw3VarArr) {
                                editText.removeSpan(dw3Var);
                            }
                        }
                        editText.replace(i14, i15, "");
                        editText.insert(i14, m);
                        i14 -= length;
                        i3 = 3;
                        fontMetricsInt = null;
                    } else {
                        i2 = i3;
                        fdbVar.performHapticFeedback(i2, 1);
                        gw3.a(str3);
                        fdbVar.s = false;
                        fdbVar.w = true;
                        fdbVar.J = (byte) 0;
                        bdbVar = fdbVar.d;
                        if (bdbVar != null) {
                        }
                    }
                }
                i2 = i3;
                fdbVar.performHapticFeedback(i2, 1);
                gw3.a(str3);
                fdbVar.s = false;
                fdbVar.w = true;
                fdbVar.J = (byte) 0;
                bdbVar = fdbVar.d;
                if (bdbVar != null) {
                }
                break;
            case 20:
                ((yfb) this.b).E0(i);
                return;
            case 21:
                l7c l7cVar8 = ((xfb) this.b).X1;
                if (l7cVar8 != null) {
                    l7cVar8.G(i - 1);
                    return;
                }
                return;
            case 22:
                ThemeEditorView.EditorAlert editorAlert = (ThemeEditorView.EditorAlert) this.b;
                int i16 = ThemeEditorView.EditorAlert.G1;
                ThemeEditorView themeEditorView = ThemeEditorView.this;
                if (i != 0) {
                    y59 adapter = editorAlert.m1.getAdapter();
                    b0 b0Var = editorAlert.r1;
                    if (adapter == b0Var) {
                        int i17 = i - 1;
                        ArrayList arrayList9 = b0Var.d;
                        themeEditorView.e = (i17 < 0 || i17 >= arrayList9.size()) ? null : (ArrayList) arrayList9.get(i17);
                    } else {
                        c0 c0Var = editorAlert.s1;
                        int i18 = i - 1;
                        if (i18 < 0) {
                            c0Var.getClass();
                        } else if (i18 < c0Var.e.size()) {
                            arrayList = (ArrayList) c0Var.e.get(i18);
                            themeEditorView.e = arrayList;
                        }
                        arrayList = null;
                        themeEditorView.e = arrayList;
                    }
                    themeEditorView.f = i;
                    for (int i19 = 0; i19 < themeEditorView.e.size(); i19++) {
                        cnb cnbVar = (cnb) themeEditorView.e.get(i19);
                        int i20 = cnbVar.e;
                        if (i20 == cmb.De) {
                            sm2 sm2Var = themeEditorView.m;
                            my0 i21 = wi8.i((Activity) sm2Var.c, false, 1, null);
                            i21.P = jb6.M0(2131752060, null);
                            i21.Q = true;
                            CharSequence[] charSequenceArr2 = {jb6.M0(2131752050, null), jb6.M0(2131745390, null), jb6.M0(2131745397, null), jb6.M0(2131751537, null)};
                            r30 r30Var = new r30(sm2Var, (byte) 5);
                            i21.M = charSequenceArr2;
                            i21.N = null;
                            i21.L = r30Var;
                            i21.show();
                            return;
                        }
                        int w0 = cmb.w0(cnbVar.i, i20, false);
                        cnbVar.h = w0;
                        if (i19 == 0) {
                            editorAlert.l1.c(w0);
                        }
                    }
                    editorAlert.F0(true);
                    return;
                }
                return;
            case 23:
                rob robVar = (rob) this.b;
                boolean z3 = robVar.Y0 != null;
                robVar.e1(i);
                if (z3 == (robVar.Y0 == null)) {
                    robVar.N0();
                    robVar.q1();
                }
                robVar.s1();
                robVar.L0[1].a(robVar.Y0 != null, true);
                robVar.R0.h1();
                int left = view.getLeft();
                int right = view.getRight();
                int L2 = gm.L(52.0f);
                int i22 = left - L2;
                smb smbVar = robVar.R0;
                if (i22 < 0) {
                    smbVar.x0(i22, 0, null);
                    return;
                }
                int i23 = right + L2;
                if (i23 > smbVar.getMeasuredWidth()) {
                    smb smbVar2 = robVar.R0;
                    smbVar2.x0(i23 - smbVar2.getMeasuredWidth(), 0, null);
                    return;
                }
                return;
            case 24:
                avb avbVar = (avb) this.b;
                int i24 = avbVar.I;
                HashSet hashSet2 = avbVar.x;
                if (view instanceof xc5) {
                    xc5 xc5Var = (xc5) view;
                    TLRPC.Chat chat = (TLRPC.Chat) xc5Var.getObject();
                    boolean contains = hashSet2.contains(Long.valueOf(chat.id));
                    long j5 = chat.id;
                    if (contains) {
                        hashSet2.remove(Long.valueOf(j5));
                        xc5Var.c(false, true);
                    } else {
                        hashSet2.add(Long.valueOf(j5));
                        xc5Var.c(true, true);
                    }
                    if (hashSet2.isEmpty() && avbVar.w != -1 && avbVar.n.getVisibility() == 0) {
                        avbVar.w = -1;
                        avbVar.n.animate().setListener(null).cancel();
                        avbVar.n.animate().translationY(i24).setDuration(200L).setListener(new wub(avbVar, b)).start();
                        r59 r59Var = avbVar.s.getVisibility() == 0 ? avbVar.b : avbVar.a;
                        r59Var.e1(false);
                        int M0 = ((u46) r59Var.getLayoutManager()).M0();
                        if ((M0 == r59Var.getAdapter().b() - 1 || (M0 == r59Var.getAdapter().b() - 2 && r59Var == avbVar.a)) && (K = r59Var.K(M0)) != null) {
                            int bottom = K.a.getBottom();
                            if (M0 == avbVar.d.c - 2) {
                                bottom += gm.L(12.0f);
                            }
                            if (r59Var.getMeasuredHeight() - bottom <= i24) {
                                r59Var.setTranslationY(-(r59Var.getMeasuredHeight() - bottom));
                                r59Var.animate().translationY(0.0f).setDuration(200L).start();
                            }
                        }
                        avbVar.a.setPadding(0, 0, 0, 0);
                        avbVar.b.setPadding(0, 0, 0, 0);
                    }
                    if (!hashSet2.isEmpty() && avbVar.n.getVisibility() == 8 && avbVar.w != 1) {
                        avbVar.w = 1;
                        avbVar.n.setVisibility(0);
                        avbVar.n.setTranslationY(i24);
                        avbVar.n.animate().setListener(null).cancel();
                        avbVar.n.animate().translationY(0.0f).setDuration(200L).setListener(new wub(avbVar, b2)).start();
                        avbVar.a.setPadding(0, 0, 0, i24 - gm.L(12.0f));
                        avbVar.b.setPadding(0, 0, 0, i24);
                    }
                    if (!hashSet2.isEmpty()) {
                        avbVar.c.setText(jb6.a0("LeaveChats", null, 2131748756, jb6.G(hashSet2.size(), "Chats", new Object[0])));
                    }
                    if (hashSet2.isEmpty()) {
                        return;
                    }
                    r59 r59Var2 = avbVar.s.getVisibility() == 0 ? avbVar.b : avbVar.a;
                    int height = r59Var2.getHeight() - view.getBottom();
                    if (height < i24) {
                        r59Var2.x0(0, i24 - height, null);
                        return;
                    }
                    return;
                }
                return;
            case 25:
                ((sxb) this.b).I0(view);
                return;
            case 26:
                sxb sxbVar = ((nxb) this.b).w0;
                long j6 = sxbVar.a;
                if (view instanceof zvb) {
                    no4.n(sxbVar, j6, ((zvb) view).getTopic(), 0);
                    return;
                } else {
                    if (view instanceof pxb) {
                        pxb pxbVar = (pxb) view;
                        no4.n(sxbVar, j6, pxbVar.O, pxbVar.getMessageId());
                        return;
                    }
                    return;
                }
            case 27:
                a(i, view);
                return;
            case 28:
                b(i, view);
                return;
            default:
                ((TwoStepVerificationActivity) this.b).k0(i);
                return;
        }
    }
}
