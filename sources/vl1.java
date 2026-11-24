// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class vl1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cm1 b;

    public /* synthetic */ vl1(cm1 cm1Var, byte b) {
        this.a = b;
        this.b = cm1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0158  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        k47 k47Var;
        byte b;
        TL_wallet.walletTransaction wallettransaction;
        vl1 vl1Var;
        byte b2 = 1;
        switch (this.a) {
            case 0:
                this.b.requestLayout();
                break;
            case 1:
                cm1 cm1Var = this.b;
                cm1Var.H = false;
                cm1Var.getMessageObject().N0 = true;
                cm1Var.t1.f.clear();
                cm1Var.invalidate();
                break;
            case 2:
                zl1 zl1Var = this.b.g1;
                d w = zl1Var != null ? zl1Var.w() : null;
                if (w == null) {
                    w = LaunchActivity.S();
                }
                if (w != null) {
                    w.presentFragment(new goc());
                    break;
                }
                break;
            case 3:
                cm1 cm1Var2 = this.b;
                if (cm1Var2.S() && (k47Var = cm1Var2.Q0) != null && k47Var.k != null) {
                    c C = c.C(cm1Var2.I);
                    TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = (TLRPC.TL_messageActionGramTransfer) k47Var.k.action;
                    byte b3 = 2;
                    boolean z = k47Var.O3() && k47Var.k.send_state == 2;
                    boolean z2 = k47Var.O3() && k47Var.k.send_state == 1;
                    cm1Var2.playSoundEffect(0);
                    TLRPC.Message message = k47Var.k;
                    if (message != null) {
                        TLRPC.MessageAction messageAction = message.action;
                        if (messageAction instanceof TLRPC.TL_messageActionGramTransfer) {
                            TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer2 = (TLRPC.TL_messageActionGramTransfer) messageAction;
                            if (!TextUtils.isEmpty(tL_messageActionGramTransfer2.transaction_id) && C.n != null) {
                                for (int i = 0; i < C.n.c.size(); i++) {
                                    wallettransaction = (TL_wallet.walletTransaction) C.n.c.get(i);
                                    if (TextUtils.equals(wallettransaction.id, tL_messageActionGramTransfer2.transaction_id)) {
                                        b = 1;
                                        if (wallettransaction == null) {
                                            if ((!z2 && !TextUtils.isEmpty(tL_messageActionGramTransfer.transaction_id)) || tL_messageActionGramTransfer.comment_encrypted_preparing) {
                                                wallettransaction = new TL_wallet.walletTransaction();
                                                wallettransaction.id = tL_messageActionGramTransfer.transaction_id;
                                                wallettransaction.failed = z;
                                                wallettransaction.pending = z2;
                                                wallettransaction.incoming = !k47Var.O3();
                                                wallettransaction.comment = tL_messageActionGramTransfer.comment;
                                                wallettransaction.comment_encrypted = tL_messageActionGramTransfer.comment_encrypted;
                                                wallettransaction.comment_encrypted_preparing = tL_messageActionGramTransfer.comment_encrypted_preparing;
                                                wallettransaction.amount = tL_messageActionGramTransfer.amount;
                                                if (TextUtils.isEmpty(tL_messageActionGramTransfer.onramp_provider_name) || !m9c.C(k47.B0(k47Var.k))) {
                                                    TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = new TL_wallet.walletTransactionPeerUser();
                                                    wallettransaction.peer = wallettransactionpeeruser;
                                                    wallettransactionpeeruser.address = tL_messageActionGramTransfer.peer_address;
                                                    wallettransactionpeeruser.user_id = k47.B0(k47Var.k);
                                                } else {
                                                    TL_wallet.walletTransactionPeerOnramp wallettransactionpeeronramp = new TL_wallet.walletTransactionPeerOnramp();
                                                    wallettransactionpeeronramp.provider_name = tL_messageActionGramTransfer.onramp_provider_name;
                                                    wallettransactionpeeronramp.address = tL_messageActionGramTransfer.peer_address;
                                                    wallettransaction.peer = wallettransactionpeeronramp;
                                                }
                                                wallettransaction.preview = b;
                                                wallettransaction.date = k47Var.k.date;
                                            }
                                        }
                                        vl1Var = new vl1(cm1Var2, b3);
                                        if (!cm1Var2.Q0.O3() || !oc7.r1(cm1Var2.I).u3.contains("WALLET_FIRST_INCOMING_TRANSFER")) {
                                            goc.J0(cm1Var2.getContext(), cm1Var2.I, wallettransaction, null, null, null, vl1Var, cm1Var2.h1);
                                            break;
                                        } else {
                                            oc7.r1(cm1Var2.I).p4(0L, "WALLET_FIRST_INCOMING_TRANSFER");
                                            Context context = cm1Var2.getContext();
                                            int i2 = cm1Var2.I;
                                            ylb ylbVar = cm1Var2.h1;
                                            my0 h = hg9.h(1, ylbVar, context, false);
                                            FrameLayout frameLayout = new FrameLayout(context);
                                            int L = gm.L(16.0f);
                                            int i3 = cmb.g5;
                                            Drawable b0 = cmb.b0(L, cmb.v0(i3, ylbVar));
                                            wmb M = anb.M(i3);
                                            frameLayout.setBackground(b0);
                                            anb.j(frameLayout, b0, M, null, ylbVar);
                                            frameLayout.setPadding(gm.L(36.0f), 0, gm.L(36.0f), gm.L(14.0f));
                                            LinearLayout linearLayout = new LinearLayout(context);
                                            linearLayout.setOrientation(1);
                                            linearLayout.setGravity(1);
                                            frameLayout.addView(linearLayout, qoe.c(-2.0f, -1));
                                            linearLayout.addView(new npc(nm7.E1, context, false), qoe.t(nm7.E1, nm7.E1, 1, 0, 0, 0, -8));
                                            TextView textView = new TextView(context);
                                            textView.setText(jb6.M0(2131742798, null));
                                            anb.X(textView, cmb.i5, ylbVar);
                                            textView.setTextSize(1, 17.0f);
                                            textView.setTypeface(gm.n1("fonts/rmedium.ttf"));
                                            textView.setGravity(17);
                                            TextView m = wi8.m(linearLayout, textView, qoe.t(-1, -2, 1, 0, 0, 0, 6), context);
                                            double d = oc7.r1(i2).l4.k.i;
                                            m.setText((d <= 0.0d || Double.isNaN(d) || Double.isInfinite(d)) ? jb6.M0(2131742797, null) : jb6.a0(null, null, 2131742796, c.w(1000000000L, false), String.format(jb6.D0().y, "%.2f", Double.valueOf(d))));
                                            anb.X(m, cmb.q5, ylbVar);
                                            m.setTextSize(1, 14.0f);
                                            m.setGravity(17);
                                            m.setLineSpacing(gm.L(1.0f), 1.0f);
                                            linearLayout.addView(m, qoe.t(-1, -2, 1, 0, 0, 0, 24));
                                            znc zncVar = new znc(context, ylbVar);
                                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(jb6.M0(2131742795, null));
                                            pn2 pn2Var = new pn2(R.drawable.mini_attach, 2);
                                            pn2Var.c(gm.L(14.0f));
                                            int indexOf = spannableStringBuilder.toString().indexOf("📎");
                                            spannableStringBuilder.setSpan(pn2Var, indexOf, indexOf + 2, 33);
                                            int indexOf2 = spannableStringBuilder.toString().indexOf("→");
                                            spannableStringBuilder.setSpan(new pn2(R.drawable.wallet_intro_arrow, 2), indexOf2, indexOf2 + 1, 33);
                                            zncVar.setPadding(gm.L(0.0f), gm.L(8.0f), gm.L(0.0f), gm.L(8.0f));
                                            zncVar.a(R.drawable.wallet_intro_telegram, jb6.M0(2131742685, null), spannableStringBuilder);
                                            ImageView imageView = zncVar.b;
                                            int i4 = cmb.m6;
                                            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                                            anb.s(imageView, i4, ylbVar, mode);
                                            linearLayout.addView(zncVar, qoe.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
                                            znc zncVar2 = new znc(context, ylbVar);
                                            zncVar2.setPadding(gm.L(0.0f), gm.L(8.0f), gm.L(0.0f), gm.L(8.0f));
                                            zncVar2.a(R.drawable.wallet_intro_trade, jb6.M0(2131742651, null), jb6.M0(2131742793, null));
                                            anb.s(zncVar2.b, i4, ylbVar, mode);
                                            linearLayout.addView(zncVar2, qoe.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
                                            znc zncVar3 = new znc(context, ylbVar);
                                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(jb6.M0(2131742794, null));
                                            pn2 pn2Var2 = new pn2(R.drawable.wallet_intro_chats, 2);
                                            int indexOf3 = spannableStringBuilder2.toString().indexOf("💬");
                                            spannableStringBuilder2.setSpan(pn2Var2, indexOf3, indexOf3 + 2, 33);
                                            int indexOf4 = spannableStringBuilder2.toString().indexOf("⋮");
                                            spannableStringBuilder2.setSpan(new pn2(R.drawable.wallet_intro_options, 2), indexOf4, indexOf4 + 1, 33);
                                            int indexOf5 = TextUtils.indexOf(spannableStringBuilder2, "→");
                                            while (indexOf5 >= 0) {
                                                int i5 = indexOf5 + 1;
                                                spannableStringBuilder2.setSpan(new pn2(R.drawable.wallet_intro_arrow, 2), indexOf5, i5, 33);
                                                indexOf5 = TextUtils.indexOf(spannableStringBuilder2, "→", i5);
                                            }
                                            zncVar3.setPadding(gm.L(0.0f), gm.L(8.0f), gm.L(0.0f), gm.L(8.0f));
                                            zncVar3.a(R.drawable.wallet_intro_store, jb6.M0(2131742671, null), spannableStringBuilder2);
                                            anb.s(zncVar3.b, cmb.m6, ylbVar, PorterDuff.Mode.SRC_IN);
                                            linearLayout.addView(zncVar3, qoe.k(0.0f, 0.0f, 0.0f, 14.0f, -1, -2));
                                            b61 i6 = mlb.i(24, ylbVar, context, true);
                                            i6.setText(jb6.M0(2131742783, null));
                                            linearLayout.addView(i6, qoe.t(-1, 48, 1, 0, 0, 0, 0));
                                            rve.b(i6, 0.02f, 1.1f);
                                            h.O = frameLayout;
                                            my0[] my0VarArr = {h};
                                            my0VarArr[0].r0(true);
                                            my0VarArr[0].J();
                                            i6.setOnClickListener(new f5(my0VarArr, (byte) 8));
                                            my0VarArr[0].show();
                                            my0VarArr[0].n(new tv0(cm1Var2, wallettransaction, vl1Var, (byte) 23));
                                            break;
                                        }
                                    }
                                }
                            }
                            if (k47Var.k.random_id != 0) {
                                ArrayList arrayList = C.p;
                                int size = arrayList.size();
                                int i7 = 0;
                                while (i7 < size) {
                                    Object obj = arrayList.get(i7);
                                    i7++;
                                    wallettransaction = (TL_wallet.walletTransaction) obj;
                                    b = b2;
                                    if (wallettransaction.random_id != k47Var.k.random_id) {
                                        b2 = b;
                                    } else {
                                        if (wallettransaction == null) {
                                        }
                                        vl1Var = new vl1(cm1Var2, b3);
                                        if (!cm1Var2.Q0.O3()) {
                                        }
                                        goc.J0(cm1Var2.getContext(), cm1Var2.I, wallettransaction, null, null, null, vl1Var, cm1Var2.h1);
                                    }
                                }
                            }
                        }
                    }
                    b = b2;
                    wallettransaction = null;
                    if (wallettransaction == null) {
                    }
                    vl1Var = new vl1(cm1Var2, b3);
                    if (!cm1Var2.Q0.O3()) {
                    }
                    goc.J0(cm1Var2.getContext(), cm1Var2.I, wallettransaction, null, null, null, vl1Var, cm1Var2.h1);
                }
                break;
            case 4:
                this.b.T();
                break;
            case 5:
                cm1 cm1Var3 = this.b;
                zl1 zl1Var2 = cm1Var3.g1;
                if (zl1Var2 != null) {
                    zl1Var2.b0(cm1Var3);
                    break;
                }
                break;
            case 6:
                cm1 cm1Var4 = this.b;
                cm1Var4.post(new vl1(cm1Var4, b2));
                break;
            default:
                this.b.invalidate();
                break;
        }
    }
}
