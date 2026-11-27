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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Components.b0;
import org.telegram.ui.Components.c0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.WallpapersListActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class t39 implements r69 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t39(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void a(int i, View view) {
        n0c n0cVar = (n0c) this.b;
        ArrayList arrayList = n0cVar.U;
        if (i < 0 || i >= arrayList.size()) {
            return;
        }
        k0c k0cVar = (k0c) arrayList.get(i);
        long j = k0cVar.a;
        if (j != 0) {
            if (n0cVar.V == j) {
                j = 0;
            }
            n0cVar.V = j;
        } else {
            n0cVar.W = k0cVar.b.equals(n0cVar.W) ? null : k0cVar.b;
        }
        hl.d0(n0cVar.S, new b0c((byte) 0));
        n0cVar.l(false);
        n0cVar.n();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:170|(3:172|(1:174)|175)|176|(2:178|(5:180|(1:182)(1:224)|(1:184)|(1:223)(5:188|189|190|(1:192)(1:220)|193)|(5:200|201|202|203|(2:205|206)(1:207))(3:210|(3:212|(2:215|213)|216)(1:218)|217))(6:225|226|201|202|203|(0)(0)))|227|226|201|202|203|(0)(0)) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:205:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:207:? A[RETURN, SYNTHETIC] */
    @Override // r69
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(int i, View view) {
        b8c G;
        b8c G2;
        b8c G3;
        b8c G4;
        q2b[] q2bVarArr;
        TLRPC.StickerSet stickerSet;
        xeb xebVar;
        int intValue;
        int intValue2;
        int i2;
        h8b h8bVar;
        CharSequence m;
        hm[] hmVarArr;
        ArrayList arrayList;
        f89 L;
        TLRPC.StickerSetCovered stickerSetCovered;
        byte b = 14;
        int i3 = 3;
        Paint.FontMetricsInt fontMetricsInt = null;
        byte b2 = 0;
        byte b3 = 1;
        switch (this.a) {
            case 0:
                i49 i49Var = (i49) this.b;
                h49 h49Var = i49Var.h0;
                if (h49Var == null || !(view instanceof g49)) {
                    return;
                }
                h49Var.e(i49Var, ((g49) view).e, false, false);
                return;
            case 1:
                ((n49) this.b).f0(view);
                return;
            case 2:
                ((ee9) this.b).c0(i, view);
                return;
            case 3:
                kp9 kp9Var = (kp9) this.b;
                if (i == 1) {
                    kp9Var.c0(2131745713, new CharSequence[]{"480p", "360p"}, new iy8((byte) 14));
                    return;
                }
                if (i == 2) {
                    kp9Var.c0(2131745723, new CharSequence[]{ob6.M0(2131745722, null), ob6.M0(2131745720, null), ob6.M0(2131745721, null)}, new iy8((byte) 15));
                    return;
                }
                if (i == 3) {
                    kp9Var.c0(2131745716, new CharSequence[]{"30 FPS", "60 FPS"}, new iy8((byte) 16));
                    return;
                }
                if (i != 4) {
                    if (i == 7) {
                        im0 im0Var = phd.h;
                        im0Var.a();
                        boolean z = !im0Var.d;
                        synchronized (im0Var) {
                            im0Var.d = z;
                            im0Var.c = true;
                            im0Var.b = true;
                            zba.a.edit().putBoolean("round_video_composition", z).apply();
                        }
                        ((ox0) kp9Var.c).g(i);
                        return;
                    }
                    return;
                }
                CharSequence[] charSequenceArr = new CharSequence[4];
                while (true) {
                    int[] iArr = kp9.d;
                    if (b2 >= 3) {
                        kp9Var.c0(2131745724, charSequenceArr, new iy8((byte) 17));
                        return;
                    } else {
                        charSequenceArr[b2] = kp9.a0(iArr[b2]);
                        b2++;
                    }
                }
            case 4:
                b2a b2aVar = (b2a) this.b;
                b8c G5 = b2aVar.d2.G(i - 1);
                if (G5 != null) {
                    Object obj = G5.H;
                    if ((obj instanceof TLRPC.User) || (obj instanceof TLRPC.Chat)) {
                        ((bv8) view).A(true, true);
                        b2aVar.V1 = (TLObject) G5.H;
                        b2aVar.a1(true);
                        b2aVar.d2.O(true);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                h2a h2aVar = (h2a) this.b;
                c51 c51Var = h2aVar.X1;
                HashSet hashSet = h2aVar.U1;
                l9c l9cVar = h2aVar.b2;
                if (l9cVar == null || (G = l9cVar.G(i - 1)) == null) {
                    return;
                }
                Object obj2 = G.H;
                if (obj2 instanceof TL_stars.SavedStarGift) {
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj2;
                    int i4 = savedStarGift.msg_id;
                    long j = i4 == 0 ? savedStarGift.saved_id : i4;
                    if (hashSet.contains(Long.valueOf(j))) {
                        hashSet.remove(Long.valueOf(j));
                        ((sx4) view).c(false, true);
                        G.e = false;
                    } else {
                        hashSet.add(Long.valueOf(j));
                        ((sx4) view).c(true, true);
                        G.e = true;
                    }
                    c51Var.setEnabled(hashSet.size() > 0);
                    c51Var.c(hashSet.size(), true);
                    return;
                }
                return;
            case 6:
                ((k2a) this.b).a1(i, view);
                return;
            case 7:
                ((SessionsActivity) this.b).k0(i);
                return;
            case 8:
                fg5 fg5Var = (fg5) view;
                kea keaVar = ((hea) this.b).L;
                TLRPC.TL_topPeer tL_topPeer = (TLRPC.TL_topPeer) ls6.d0(keaVar.a).j1.get(i);
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
                if (fg5Var.F) {
                    keaVar.T0(j2, fg5Var);
                    return;
                }
                tL_dialog.id = j2;
                keaVar.P0(null, tL_dialog);
                boolean z2 = keaVar.P1.h(j2) >= 0;
                if (fg5Var.x) {
                    fg5Var.w.a(z2, true);
                    return;
                }
                return;
            case 9:
                dka dkaVar = (dka) this.b;
                int i5 = i - 1;
                if (i5 < 0 || i5 >= id6.g()) {
                    return;
                }
                dkaVar.r1.a(dka.E0(i5));
                dkaVar.dismiss();
                return;
            case 10:
                wqa wqaVar = (wqa) this.b;
                b8c G6 = wqaVar.S1.G(i - 1);
                Object obj3 = G6 != null ? G6.H : null;
                if (obj3 instanceof TLRPC.User) {
                    uc7.s1(wqaVar.a).G3(wqaVar.i1, (TLRPC.User) obj3, null, 0, null, false, false);
                    return;
                }
                return;
            case 11:
                ((nza) this.b).M0(i);
                return;
            case 12:
                zya zyaVar = (zya) this.b;
                l9c l9cVar2 = zyaVar.W1;
                if (l9cVar2 == null || (G2 = l9cVar2.G(i - 1)) == null) {
                    return;
                }
                l9c l9cVar3 = zyaVar.W1;
                if (G2.d == -1) {
                    zyaVar.X1 = !zyaVar.X1;
                    l9cVar3.O(true);
                    zyaVar.n1.y0(0, hl.L(200.0f), k43.g);
                    return;
                }
                if (G2.H(aza.class) && (G2.H instanceof TL_stars.TL_starsGiftOption)) {
                    Context W = hl.W(zyaVar.getContext());
                    if (W == null) {
                        W = LaunchActivity.H1;
                    }
                    Context context = W;
                    if (context != null) {
                        long j4 = zyaVar.U1.id;
                        jxa v = jxa.v(zyaVar.a, false);
                        TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) G2.H;
                        iv4 iv4Var = new iv4((Object) zyaVar, (Object) G2, j4, (byte) 6);
                        int i6 = v.a;
                        if (!uc7.s1(i6).i5()) {
                            e Q = LaunchActivity.Q();
                            if (Q == null || Q.getContext() == null) {
                                jxa.d0(context, null);
                                return;
                            } else {
                                jxa.d0(Q.getContext(), Q.getResourceProvider());
                                return;
                            }
                        }
                        if (!f11.b() && di0.h().j()) {
                            TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = new TLRPC.TL_inputStorePaymentStarsGift();
                            tL_inputStorePaymentStarsGift.stars = tL_starsGiftOption.stars;
                            tL_inputStorePaymentStarsGift.currency = tL_starsGiftOption.currency;
                            tL_inputStorePaymentStarsGift.amount = tL_starsGiftOption.amount;
                            tL_inputStorePaymentStarsGift.user_id = uc7.s1(i6).o1(j4);
                            we3 we3Var = new we3();
                            we3Var.b = "inapp";
                            we3Var.a = tL_starsGiftOption.store_product;
                            di0.h().o(Arrays.asList(we3Var.a()), new xg(v, iv4Var, tL_inputStorePaymentStarsGift, tL_starsGiftOption, context));
                            return;
                        }
                        TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift2 = new TLRPC.TL_inputStorePaymentStarsGift();
                        tL_inputStorePaymentStarsGift2.stars = tL_starsGiftOption.stars;
                        tL_inputStorePaymentStarsGift2.amount = tL_starsGiftOption.amount;
                        tL_inputStorePaymentStarsGift2.currency = tL_starsGiftOption.currency;
                        tL_inputStorePaymentStarsGift2.user_id = uc7.s1(i6).o1(j4);
                        TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
                        tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsGift2;
                        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                        JSONObject u = xw0.u(jxa.F(), false);
                        if (u != null) {
                            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                            tL_dataJSON.data = u.toString();
                            tL_payments_getPaymentForm.flags |= 1;
                        }
                        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
                        ConnectionsManager.getInstance(i6).sendRequest(tL_payments_getPaymentForm, new qn8((Object) v, (Object) iv4Var, (Object) tL_inputInvoiceStars, (byte) 18));
                        return;
                    }
                    return;
                }
                return;
            case 13:
                dza dzaVar = (dza) this.b;
                l9c l9cVar4 = dzaVar.Z1;
                if (l9cVar4 == null || (G3 = l9cVar4.G(i - 1)) == null) {
                    return;
                }
                l9c l9cVar5 = dzaVar.Z1;
                if (G3.d == -1) {
                    dzaVar.a2 = !dzaVar.a2;
                    l9cVar5.O(true);
                    return;
                } else {
                    if (G3.H(aza.class) && (G3.H instanceof TL_stars.TL_starsTopupOption)) {
                        Activity W2 = hl.W(dzaVar.getContext());
                        if (W2 == null) {
                            W2 = LaunchActivity.H1;
                        }
                        if (W2 != null) {
                            jxa.v(dzaVar.a, false).d(W2, (TL_stars.TL_starsTopupOption) G3.H, new ia7(dzaVar, G3, (byte) 13), dzaVar.X1);
                            return;
                        }
                        return;
                    }
                    return;
                }
            case 14:
                eza ezaVar = (eza) this.b;
                l9c l9cVar6 = ezaVar.T1;
                if (l9cVar6 == null || (G4 = l9cVar6.G(i - 1)) == null) {
                    return;
                }
                l9c l9cVar7 = ezaVar.T1;
                if (G4.d == -1) {
                    ezaVar.U1 = !ezaVar.U1;
                    l9cVar7.O(true);
                    ezaVar.n1.y0(0, hl.L(300.0f), null);
                    return;
                } else {
                    if (G4.H(aza.class) && (G4.H instanceof TL_stars.TL_starsTopupOption)) {
                        Activity W3 = hl.W(ezaVar.getContext());
                        if (W3 == null) {
                            W3 = LaunchActivity.H1;
                        }
                        if (W3 != null) {
                            jxa.v(ezaVar.a, false).d(W3, (TL_stars.TL_starsTopupOption) G4.H, new ia7(ezaVar, G4, b), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
            case 15:
                w1b w1bVar = (w1b) this.b;
                ArrayList arrayList2 = w1bVar.O;
                ArrayList arrayList3 = w1bVar.P;
                b1b b1bVar = w1bVar.X;
                int i7 = b1bVar.J;
                if (i >= i7 && i <= b1bVar.K) {
                    t1b t1bVar = (t1b) w1bVar.z0.get(i - i7);
                    z67 z67Var = new z67(w1bVar.b, t1bVar.b, true);
                    z67Var.f0 = t1bVar;
                    w1bVar.presentFragment(z67Var);
                    return;
                }
                int i8 = b1bVar.V;
                if (i >= i8 && i <= b1bVar.W) {
                    ((p1b) w1bVar.R.get(i - i8)).b(w1bVar);
                    return;
                }
                int i9 = b1bVar.S;
                if (i >= i9 && i <= b1bVar.T) {
                    ((p1b) arrayList3.get(i - i9)).b(w1bVar);
                    return;
                }
                int i10 = b1bVar.Y;
                if (i >= i10 && i <= b1bVar.Z) {
                    ((p1b) w1bVar.Q.get(i - i10)).b(w1bVar);
                    return;
                }
                if (i == b1bVar.a0) {
                    int size = arrayList2.size() - arrayList3.size();
                    int i11 = w1bVar.X.a0;
                    arrayList3.clear();
                    arrayList3.addAll(arrayList2);
                    b1b b1bVar2 = w1bVar.X;
                    if (b1bVar2 != null) {
                        b1bVar2.E();
                        w1bVar.T.setItemAnimator(w1bVar.Y);
                        w1bVar.X.p(i11 + 1, size);
                        w1bVar.X.s(i11);
                        return;
                    }
                    return;
                }
                return;
            case 16:
                t2b t2bVar = (t2b) this.b;
                if (i < 1 || (q2bVarArr = t2bVar.g3) == null) {
                    return;
                }
                q2b q2bVar = q2bVarArr[i - 1];
                int L2 = hl.L(64.0f);
                if (t2bVar.getMeasuredWidth() - view.getRight() < L2) {
                    t2bVar.y0(L2 - (t2bVar.getMeasuredWidth() - view.getRight()), 0, k43.h);
                } else if (view.getLeft() < L2) {
                    t2bVar.y0(-(L2 - view.getLeft()), 0, k43.h);
                }
                pcc pccVar = t2bVar.v3;
                if (pccVar != null) {
                    pccVar.a(q2bVar);
                    return;
                }
                return;
            case 17:
                s4b s4bVar = (s4b) this.b;
                if (view instanceof m4b) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = s4bVar.M1;
                    e eVar = s4bVar.F1;
                    vnb vnbVar = s4bVar.J0;
                    if (eVar != null) {
                        Context context2 = eVar.getContext();
                        if (!(eVar instanceof zu1)) {
                            x4b.a(tL_messages_stickerSet, eVar, vnbVar);
                            return;
                        }
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert3, 0, vnbVar, context2);
                        ArrayList arrayList4 = new ArrayList();
                        ArrayList arrayList5 = new ArrayList();
                        ArrayList arrayList6 = new ArrayList();
                        c00.s(null, 2131744519, arrayList4, R.drawable.menu_sticker_add, arrayList6);
                        arrayList5.add(0);
                        arrayList4.add(ob6.M0(2131744526, null));
                        arrayList6.add(Integer.valueOf(R.drawable.menu_sticker_select));
                        arrayList5.add(1);
                        n8 n8Var = new n8(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        vnb vnbVar2 = vnbVar;
                        nh nhVar = new nh(n8Var, arrayList5, tL_messages_stickerSet, eVar, vnbVar2);
                        int i12 = 0;
                        while (i12 < arrayList4.size()) {
                            vnb vnbVar3 = vnbVar2;
                            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            b8 c = s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, ((Integer) arrayList6.get(i12)).intValue(), (CharSequence) arrayList4.get(i12), false, vnbVar3);
                            vnbVar2 = vnbVar3;
                            c.setTag(Integer.valueOf(i12));
                            c.setOnClickListener(nhVar);
                            i12++;
                            actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                        }
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                        n8Var.c = (short) 100;
                        n8Var.g = true;
                        n8Var.setOutsideTouchable(true);
                        n8Var.setClippingEnabled(true);
                        n8Var.setAnimationStyle(R.style.PopupContextAnimation);
                        n8Var.setFocusable(true);
                        actionBarPopupWindow$ActionBarPopupWindowLayout3.measure(View.MeasureSpec.makeMeasureSpec(hl.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(hl.L(1000.0f), TLObject.FLAG_31));
                        n8Var.setInputMethodMode(2);
                        n8Var.getContentView().setFocusableInTouchMode(true);
                        int[] iArr2 = new int[2];
                        view.getLocationInWindow(iArr2);
                        n8Var.showAtLocation(view, 0, ((view.getMeasuredWidth() / 2) + iArr2[0]) - (actionBarPopupWindow$ActionBarPopupWindowLayout3.getMeasuredWidth() / 2), ((view.getMeasuredHeight() / 2) + iArr2[1]) - (actionBarPopupWindow$ActionBarPopupWindowLayout3.getMeasuredHeight() / 2));
                        n8Var.b();
                        return;
                    }
                    return;
                }
                if (s4bVar.L1) {
                    return;
                }
                if (s4bVar.Q1 != null) {
                    TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) s4bVar.n1.f.get(i);
                    if (stickerSetCovered2 != null) {
                        s4bVar.dismiss();
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet2 = stickerSetCovered2.set;
                        tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                        tL_inputStickerSetID.id = stickerSet2.id;
                        new s4b(s4bVar.H1, s4bVar.F1, tL_inputStickerSetID, null, null, s4bVar.J0).show();
                        return;
                    }
                    return;
                }
                ArrayList arrayList7 = s4bVar.S1;
                if (arrayList7 != null) {
                    if (i < 0 || i >= arrayList7.size()) {
                        return;
                    }
                    k7a k7aVar = (k7a) s4bVar.S1.get(i);
                    s4bVar.O1 = k7aVar;
                    if (k7aVar.c) {
                        TextView textView = s4bVar.A1;
                        textView.setText(pv3.m(k7aVar.b, textView.getPaint().getFontMetricsInt(), false, null, 0));
                        s4bVar.z1.k(jn5.g(s4bVar.O1.a), null, null, null, null, s4bVar.O1.e ? "tgs" : null, 0, null);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) s4bVar.w1.getLayoutParams();
                        layoutParams.topMargin = s4bVar.Y1;
                        s4bVar.w1.setLayoutParams(layoutParams);
                        s4bVar.w1.setVisibility(0);
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(ObjectAnimator.ofFloat(s4bVar.w1, (Property<FrameLayout, Float>) View.ALPHA, 0.0f, 1.0f));
                        animatorSet.setDuration(200L);
                        animatorSet.start();
                        return;
                    }
                    return;
                }
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = s4bVar.M1;
                if (tL_messages_stickerSet2 == null || i < 0 || i >= tL_messages_stickerSet2.documents.size()) {
                    return;
                }
                s4bVar.N1 = s4bVar.M1.documents.get(i);
                int i13 = 0;
                while (true) {
                    if (i13 < s4bVar.N1.attributes.size()) {
                        TLRPC.DocumentAttribute documentAttribute = s4bVar.N1.attributes.get(i13);
                        if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                            String str = documentAttribute.alt;
                            if (str != null && str.length() > 0) {
                                TextView textView2 = s4bVar.A1;
                                textView2.setText(pv3.m(documentAttribute.alt, textView2.getPaint().getFontMetricsInt(), false, null, 0));
                            }
                        } else {
                            i13++;
                        }
                    }
                }
                TextView textView3 = s4bVar.A1;
                String str2 = (String) ls6.d0(s4bVar.a).d0.f(s4bVar.N1.id);
                if (str2 == null) {
                    str2 = "";
                }
                textView3.setText(pv3.m(str2, s4bVar.A1.getPaint().getFontMetricsInt(), false, null, 0));
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = s4bVar.M1;
                if ((tL_messages_stickerSet3 == null || (stickerSet = tL_messages_stickerSet3.set) == null || !stickerSet.emojis) && !rw2.e().m(view)) {
                    s4bVar.z1.getImageReceiver().b0(jn5.b(s4bVar.N1), null, jn5.c(xb4.w(s4bVar.N1.thumbs, 90, false, null, false), s4bVar.N1), null, "webp", s4bVar.M1, 1);
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) s4bVar.w1.getLayoutParams();
                    layoutParams2.topMargin = s4bVar.Y1;
                    s4bVar.w1.setLayoutParams(layoutParams2);
                    s4bVar.w1.setVisibility(0);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(s4bVar.w1, (Property<FrameLayout, Float>) View.ALPHA, 0.0f, 1.0f));
                    animatorSet2.setDuration(200L);
                    animatorSet2.start();
                    return;
                }
                return;
            case 18:
                zeb zebVar = (zeb) this.b;
                String str3 = ((yeb) view).a;
                if (!zebVar.s || (xebVar = zebVar.c) == null || !(xebVar.getFieldText() instanceof Spanned)) {
                    return;
                }
                if (zebVar.W != null) {
                    intValue = ((Spanned) zebVar.c.getFieldText()).getSpanStart(zebVar.W);
                    intValue2 = ((Spanned) zebVar.c.getFieldText()).getSpanEnd(zebVar.W);
                } else {
                    Integer num = zebVar.b0;
                    if (num == null || zebVar.c0 == null) {
                        return;
                    }
                    intValue = num.intValue();
                    intValue2 = zebVar.c0.intValue();
                    zebVar.c0 = null;
                    zebVar.b0 = null;
                }
                Editable editText = zebVar.c.getEditText();
                if (editText == null || intValue < 0 || intValue2 < 0 || intValue > editText.length() || intValue2 > editText.length()) {
                    return;
                }
                if (zebVar.W != null) {
                    if (zebVar.c.getFieldText() instanceof Spannable) {
                        ((Spannable) zebVar.c.getFieldText()).removeSpan(zebVar.W);
                    }
                    zebVar.W = null;
                }
                String obj4 = editText.toString();
                String substring = obj4.substring(intValue, intValue2);
                int length = substring.length();
                int i14 = intValue2 - length;
                while (i14 >= 0) {
                    int i15 = i14 + length;
                    if (obj4.substring(i14, i15).equals(substring)) {
                        Paint.FontMetricsInt fontMetricsInt2 = zebVar.c.getEditField() != null ? zebVar.c.getEditField().getPaint().getFontMetricsInt() : fontMetricsInt;
                        if (fontMetricsInt2 == null) {
                            Paint paint = new Paint();
                            paint.setTextSize(hl.L(18.0f));
                            fontMetricsInt2 = paint.getFontMetricsInt();
                        }
                        if (str3 == null || !str3.startsWith("animated_")) {
                            m = pv3.m(str3, fontMetricsInt2, true, fontMetricsInt, 0);
                        } else {
                            try {
                                long parseLong = Long.parseLong(str3.substring(9));
                                TLRPC.Document e = wl.e(zebVar.a, parseLong);
                                SpannableString spannableString = new SpannableString(r47.U(e));
                                spannableString.setSpan(e == null ? new hm(parseLong, fontMetricsInt2) : new hm(e, fontMetricsInt2), 0, spannableString.length(), 33);
                                m = spannableString;
                            } catch (Exception unused) {
                                m = null;
                            }
                        }
                        if (m == null || ((hmVarArr = (hm[]) editText.getSpans(i14, i15, hm.class)) != null && hmVarArr.length > 0)) {
                            i2 = 3;
                            zebVar.performHapticFeedback(i2, 1);
                            pv3.a(str3);
                            zebVar.s = false;
                            zebVar.w = true;
                            zebVar.J = (byte) 0;
                            h8bVar = zebVar.d;
                            if (h8bVar != null) {
                                h8bVar.invalidate();
                                return;
                            }
                            return;
                        }
                        mv3[] mv3VarArr = (mv3[]) editText.getSpans(i14, i15, mv3.class);
                        if (mv3VarArr != null) {
                            for (mv3 mv3Var : mv3VarArr) {
                                editText.removeSpan(mv3Var);
                            }
                        }
                        editText.replace(i14, i15, "");
                        editText.insert(i14, m);
                        i14 -= length;
                        i3 = 3;
                        fontMetricsInt = null;
                    } else {
                        i2 = i3;
                        zebVar.performHapticFeedback(i2, 1);
                        pv3.a(str3);
                        zebVar.s = false;
                        zebVar.w = true;
                        zebVar.J = (byte) 0;
                        h8bVar = zebVar.d;
                        if (h8bVar != null) {
                        }
                    }
                }
                i2 = i3;
                zebVar.performHapticFeedback(i2, 1);
                pv3.a(str3);
                zebVar.s = false;
                zebVar.w = true;
                zebVar.J = (byte) 0;
                h8bVar = zebVar.d;
                if (h8bVar != null) {
                }
                break;
            case 19:
                ((thb) this.b).E0(i);
                return;
            case 20:
                l9c l9cVar8 = ((shb) this.b).X1;
                if (l9cVar8 != null) {
                    l9cVar8.G(i - 1);
                    return;
                }
                return;
            case 21:
                ThemeEditorView.EditorAlert editorAlert = (ThemeEditorView.EditorAlert) this.b;
                int i16 = ThemeEditorView.EditorAlert.G1;
                ThemeEditorView themeEditorView = ThemeEditorView.this;
                if (i != 0) {
                    j79 adapter = editorAlert.m1.getAdapter();
                    b0 b0Var = editorAlert.r1;
                    if (adapter == b0Var) {
                        int i17 = i - 1;
                        ArrayList arrayList8 = b0Var.d;
                        themeEditorView.e = (i17 < 0 || i17 >= arrayList8.size()) ? null : (ArrayList) arrayList8.get(i17);
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
                        apb apbVar = (apb) themeEditorView.e.get(i19);
                        int i20 = apbVar.e;
                        if (i20 == aob.Ee) {
                            am2 am2Var = themeEditorView.m;
                            nx0 i21 = ik8.i((Activity) am2Var.c, false, 1, null);
                            i21.P = ob6.M0(2131752088, null);
                            i21.Q = true;
                            CharSequence[] charSequenceArr2 = {ob6.M0(2131752078, null), ob6.M0(2131745384, null), ob6.M0(2131745391, null), ob6.M0(2131751565, null)};
                            s20 s20Var = new s20(am2Var, (byte) 5);
                            i21.M = charSequenceArr2;
                            i21.N = null;
                            i21.L = s20Var;
                            i21.show();
                            return;
                        }
                        int w0 = aob.w0(apbVar.i, i20, false);
                        apbVar.h = w0;
                        if (i19 == 0) {
                            editorAlert.l1.c(w0);
                        }
                    }
                    editorAlert.G0(true);
                    return;
                }
                return;
            case 22:
                pqb pqbVar = (pqb) this.b;
                boolean z3 = pqbVar.Y0 != null;
                pqbVar.e1(i);
                if (z3 == (pqbVar.Y0 == null)) {
                    pqbVar.N0();
                    pqbVar.q1();
                }
                pqbVar.s1();
                pqbVar.L0[1].a(pqbVar.Y0 != null, true);
                pqbVar.R0.i1();
                int left = view.getLeft();
                int right = view.getRight();
                int L3 = hl.L(52.0f);
                int i22 = left - L3;
                qob qobVar = pqbVar.R0;
                if (i22 < 0) {
                    qobVar.y0(i22, 0, null);
                    return;
                }
                int i23 = right + L3;
                if (i23 > qobVar.getMeasuredWidth()) {
                    qob qobVar2 = pqbVar.R0;
                    qobVar2.y0(i23 - qobVar2.getMeasuredWidth(), 0, null);
                    return;
                }
                return;
            case 23:
                axb axbVar = (axb) this.b;
                int i24 = axbVar.I;
                HashSet hashSet2 = axbVar.x;
                if (view instanceof bd5) {
                    bd5 bd5Var = (bd5) view;
                    TLRPC.Chat chat = (TLRPC.Chat) bd5Var.getObject();
                    boolean contains = hashSet2.contains(Long.valueOf(chat.id));
                    long j5 = chat.id;
                    if (contains) {
                        hashSet2.remove(Long.valueOf(j5));
                        bd5Var.c(false, true);
                    } else {
                        hashSet2.add(Long.valueOf(j5));
                        bd5Var.c(true, true);
                    }
                    if (hashSet2.isEmpty() && axbVar.w != -1 && axbVar.n.getVisibility() == 0) {
                        axbVar.w = -1;
                        axbVar.n.animate().setListener(null).cancel();
                        axbVar.n.animate().translationY(i24).setDuration(200L).setListener(new wwb(axbVar, b2)).start();
                        d79 d79Var = axbVar.s.getVisibility() == 0 ? axbVar.b : axbVar.a;
                        d79Var.f1(false);
                        int M0 = ((x46) d79Var.getLayoutManager()).M0();
                        if ((M0 == d79Var.getAdapter().b() - 1 || (M0 == d79Var.getAdapter().b() - 2 && d79Var == axbVar.a)) && (L = d79Var.L(M0)) != null) {
                            int bottom = L.a.getBottom();
                            if (M0 == axbVar.d.c - 2) {
                                bottom += hl.L(12.0f);
                            }
                            if (d79Var.getMeasuredHeight() - bottom <= i24) {
                                d79Var.setTranslationY(-(d79Var.getMeasuredHeight() - bottom));
                                d79Var.animate().translationY(0.0f).setDuration(200L).start();
                            }
                        }
                        axbVar.a.setPadding(0, 0, 0, 0);
                        axbVar.b.setPadding(0, 0, 0, 0);
                    }
                    if (!hashSet2.isEmpty() && axbVar.n.getVisibility() == 8 && axbVar.w != 1) {
                        axbVar.w = 1;
                        axbVar.n.setVisibility(0);
                        axbVar.n.setTranslationY(i24);
                        axbVar.n.animate().setListener(null).cancel();
                        axbVar.n.animate().translationY(0.0f).setDuration(200L).setListener(new wwb(axbVar, b3)).start();
                        axbVar.a.setPadding(0, 0, 0, i24 - hl.L(12.0f));
                        axbVar.b.setPadding(0, 0, 0, i24);
                    }
                    if (!hashSet2.isEmpty()) {
                        axbVar.c.setText(ob6.a0("LeaveChats", null, 2131748753, ob6.G(hashSet2.size(), "Chats", new Object[0])));
                    }
                    if (hashSet2.isEmpty()) {
                        return;
                    }
                    d79 d79Var2 = axbVar.s.getVisibility() == 0 ? axbVar.b : axbVar.a;
                    int height = d79Var2.getHeight() - view.getBottom();
                    if (height < i24) {
                        d79Var2.y0(0, i24 - height, null);
                        return;
                    }
                    return;
                }
                return;
            case 24:
                ((tzb) this.b).I0(view);
                return;
            case 25:
                tzb tzbVar = ((ozb) this.b).w0;
                long j6 = tzbVar.a;
                if (view instanceof zxb) {
                    ro4.n(tzbVar, j6, ((zxb) view).getTopic(), 0);
                    return;
                } else {
                    if (view instanceof qzb) {
                        qzb qzbVar = (qzb) view;
                        ro4.n(tzbVar, j6, qzbVar.O, qzbVar.getMessageId());
                        return;
                    }
                    return;
                }
            case 26:
                a(i, view);
                return;
            case 27:
                d6c d6cVar = (d6c) this.b;
                j79 adapter2 = d6cVar.n.getAdapter();
                z4b z4bVar = d6cVar.w;
                if (adapter2 == z4bVar) {
                    stickerSetCovered = (TLRPC.StickerSetCovered) z4bVar.L.get(i);
                } else {
                    c6c c6cVar = d6cVar.s;
                    stickerSetCovered = i < c6cVar.x ? (TLRPC.StickerSetCovered) c6cVar.f.get(i) : null;
                }
                if (stickerSetCovered != null) {
                    d6cVar.b(stickerSetCovered.set, null);
                    return;
                }
                return;
            case 28:
                ((TwoStepVerificationActivity) this.b).j0(i);
                return;
            default:
                ((WallpapersListActivity) this.b).D0(i);
                return;
        }
    }
}
