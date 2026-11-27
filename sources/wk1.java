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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class wk1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dl1 b;

    public /* synthetic */ wk1(dl1 dl1Var, byte b) {
        this.a = b;
        this.b = dl1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x016d  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        r47 r47Var;
        TL_wallet.walletTransaction wallettransaction;
        TL_wallet.walletTransaction wallettransaction2;
        wk1 wk1Var;
        switch (this.a) {
            case 0:
                al1 al1Var = this.b.g1;
                e w = al1Var != null ? al1Var.w() : null;
                if (w == null) {
                    w = LaunchActivity.S();
                }
                if (w != null) {
                    w.presentFragment(new uqc());
                    break;
                }
                break;
            case 1:
                dl1 dl1Var = this.b;
                if (dl1Var.U() && (r47Var = dl1Var.Q0) != null && r47Var.k != null) {
                    c C = c.C(dl1Var.I);
                    TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = (TLRPC.TL_messageActionGramTransfer) r47Var.k.action;
                    boolean z = r47Var.O3() && r47Var.k.send_state == 2;
                    boolean z2 = r47Var.O3() && r47Var.k.send_state == 1;
                    dl1Var.playSoundEffect(0);
                    TLRPC.Message message = r47Var.k;
                    if (message != null) {
                        TLRPC.MessageAction messageAction = message.action;
                        if (messageAction instanceof TLRPC.TL_messageActionGramTransfer) {
                            TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer2 = (TLRPC.TL_messageActionGramTransfer) messageAction;
                            if (!TextUtils.isEmpty(tL_messageActionGramTransfer2.transaction_id) && C.n != null) {
                                for (int i = 0; i < C.n.c.size(); i++) {
                                    wallettransaction = (TL_wallet.walletTransaction) C.n.c.get(i);
                                    if (TextUtils.equals(wallettransaction.id, tL_messageActionGramTransfer2.transaction_id)) {
                                        if (wallettransaction == null) {
                                            if ((!z2 && !TextUtils.isEmpty(tL_messageActionGramTransfer.transaction_id)) || tL_messageActionGramTransfer.comment_encrypted_preparing) {
                                                wallettransaction = new TL_wallet.walletTransaction();
                                                wallettransaction.id = tL_messageActionGramTransfer.transaction_id;
                                                wallettransaction.failed = z;
                                                wallettransaction.pending = z2;
                                                wallettransaction.incoming = !r47Var.O3();
                                                wallettransaction.comment = tL_messageActionGramTransfer.comment;
                                                wallettransaction.comment_encrypted = tL_messageActionGramTransfer.comment_encrypted;
                                                wallettransaction.comment_encrypted_preparing = tL_messageActionGramTransfer.comment_encrypted_preparing;
                                                wallettransaction.amount = tL_messageActionGramTransfer.amount;
                                                if (TextUtils.isEmpty(tL_messageActionGramTransfer.onramp_provider_name) || !lbc.C(r47.B0(r47Var.k))) {
                                                    TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = new TL_wallet.walletTransactionPeerUser();
                                                    wallettransaction.peer = wallettransactionpeeruser;
                                                    wallettransactionpeeruser.address = tL_messageActionGramTransfer.peer_address;
                                                    wallettransactionpeeruser.user_id = r47.B0(r47Var.k);
                                                } else {
                                                    TL_wallet.walletTransactionPeerOnramp wallettransactionpeeronramp = new TL_wallet.walletTransactionPeerOnramp();
                                                    wallettransactionpeeronramp.provider_name = tL_messageActionGramTransfer.onramp_provider_name;
                                                    wallettransactionpeeronramp.address = tL_messageActionGramTransfer.peer_address;
                                                    wallettransaction.peer = wallettransactionpeeronramp;
                                                }
                                                wallettransaction.preview = true;
                                                wallettransaction.date = r47Var.k.date;
                                            }
                                        }
                                        wallettransaction2 = wallettransaction;
                                        wk1Var = new wk1(dl1Var, (byte) 0);
                                        if (!dl1Var.Q0.O3() || !uc7.s1(dl1Var.I).u3.contains("WALLET_FIRST_INCOMING_TRANSFER")) {
                                            uqc.I0(dl1Var.getContext(), dl1Var.I, wallettransaction2, null, null, null, wk1Var, dl1Var.h1);
                                            break;
                                        } else {
                                            uc7.s1(dl1Var.I).v4(0L, "WALLET_FIRST_INCOMING_TRANSFER");
                                            Context context = dl1Var.getContext();
                                            int i2 = dl1Var.I;
                                            vnb vnbVar = dl1Var.h1;
                                            nx0 h = uh9.h(1, vnbVar, context, false);
                                            FrameLayout frameLayout = new FrameLayout(context);
                                            int L = hl.L(16.0f);
                                            int i3 = aob.h5;
                                            Drawable b0 = aob.b0(L, aob.v0(i3, vnbVar));
                                            uob M = yob.M(i3);
                                            frameLayout.setBackground(b0);
                                            yob.j(frameLayout, b0, M, null, vnbVar);
                                            frameLayout.setPadding(hl.L(36.0f), 0, hl.L(36.0f), hl.L(14.0f));
                                            LinearLayout linearLayout = new LinearLayout(context);
                                            linearLayout.setOrientation(1);
                                            linearLayout.setGravity(1);
                                            frameLayout.addView(linearLayout, tre.c(-2.0f, -1));
                                            linearLayout.addView(new yrc(jn7.E1, context, false), tre.t(jn7.E1, jn7.E1, 1, 0, 0, 0, -8));
                                            TextView textView = new TextView(context);
                                            textView.setText(ob6.M0(2131742766, null));
                                            yob.X(textView, aob.j5, vnbVar);
                                            textView.setTextSize(1, 17.0f);
                                            textView.setTypeface(hl.n1("fonts/rmedium.ttf"));
                                            textView.setGravity(17);
                                            TextView m = ik8.m(linearLayout, textView, tre.t(-1, -2, 1, 0, 0, 0, 6), context);
                                            double d = uc7.s1(i2).k4.k.i;
                                            m.setText((d <= 0.0d || Double.isNaN(d) || Double.isInfinite(d)) ? ob6.M0(2131742765, null) : ob6.a0(null, null, 2131742764, c.w(1000000000L, false), String.format(ob6.D0().y, "%.2f", Double.valueOf(d))));
                                            yob.X(m, aob.r5, vnbVar);
                                            m.setTextSize(1, 14.0f);
                                            m.setGravity(17);
                                            m.setLineSpacing(hl.L(1.0f), 1.0f);
                                            linearLayout.addView(m, tre.t(-1, -2, 1, 0, 0, 0, 24));
                                            nqc nqcVar = new nqc(context, vnbVar);
                                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ob6.M0(2131742763, null));
                                            wm2 wm2Var = new wm2(R.drawable.mini_attach, 2);
                                            wm2Var.c(hl.L(14.0f));
                                            int indexOf = spannableStringBuilder.toString().indexOf("📎");
                                            spannableStringBuilder.setSpan(wm2Var, indexOf, indexOf + 2, 33);
                                            int indexOf2 = spannableStringBuilder.toString().indexOf("→");
                                            spannableStringBuilder.setSpan(new wm2(R.drawable.wallet_intro_arrow, 2), indexOf2, indexOf2 + 1, 33);
                                            nqcVar.setPadding(hl.L(0.0f), hl.L(8.0f), hl.L(0.0f), hl.L(8.0f));
                                            nqcVar.a(R.drawable.wallet_intro_telegram, ob6.M0(2131742653, null), spannableStringBuilder);
                                            ImageView imageView = nqcVar.b;
                                            int i4 = aob.n6;
                                            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                                            yob.s(imageView, i4, vnbVar, mode);
                                            linearLayout.addView(nqcVar, tre.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
                                            nqc nqcVar2 = new nqc(context, vnbVar);
                                            nqcVar2.setPadding(hl.L(0.0f), hl.L(8.0f), hl.L(0.0f), hl.L(8.0f));
                                            nqcVar2.a(R.drawable.wallet_intro_trade, ob6.M0(2131742619, null), ob6.M0(2131742761, null));
                                            yob.s(nqcVar2.b, i4, vnbVar, mode);
                                            linearLayout.addView(nqcVar2, tre.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
                                            nqc nqcVar3 = new nqc(context, vnbVar);
                                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(ob6.M0(2131742762, null));
                                            wm2 wm2Var2 = new wm2(R.drawable.wallet_intro_chats, 2);
                                            int indexOf3 = spannableStringBuilder2.toString().indexOf("💬");
                                            spannableStringBuilder2.setSpan(wm2Var2, indexOf3, indexOf3 + 2, 33);
                                            int indexOf4 = spannableStringBuilder2.toString().indexOf("⋮");
                                            spannableStringBuilder2.setSpan(new wm2(R.drawable.wallet_intro_options, 2), indexOf4, indexOf4 + 1, 33);
                                            int indexOf5 = TextUtils.indexOf(spannableStringBuilder2, "→");
                                            while (indexOf5 >= 0) {
                                                int i5 = indexOf5 + 1;
                                                spannableStringBuilder2.setSpan(new wm2(R.drawable.wallet_intro_arrow, 2), indexOf5, i5, 33);
                                                indexOf5 = TextUtils.indexOf(spannableStringBuilder2, "→", i5);
                                            }
                                            nqcVar3.setPadding(hl.L(0.0f), hl.L(8.0f), hl.L(0.0f), hl.L(8.0f));
                                            nqcVar3.a(R.drawable.wallet_intro_store, ob6.M0(2131742639, null), spannableStringBuilder2);
                                            yob.s(nqcVar3.b, aob.n6, vnbVar, PorterDuff.Mode.SRC_IN);
                                            linearLayout.addView(nqcVar3, tre.k(0.0f, 0.0f, 0.0f, 14.0f, -1, -2));
                                            c51 i6 = xnb.i(24, vnbVar, context, true);
                                            i6.setText(ob6.M0(2131742751, null));
                                            linearLayout.addView(i6, tre.t(-1, 48, 1, 0, 0, 0, 0));
                                            iye.b(i6, 0.02f, 1.1f);
                                            h.O = frameLayout;
                                            nx0[] nx0VarArr = {h};
                                            nx0VarArr[0].r0(true);
                                            nx0VarArr[0].J();
                                            i6.setOnClickListener(new g5(nx0VarArr, (byte) 8));
                                            nx0VarArr[0].show();
                                            nx0VarArr[0].n(new tu0(dl1Var, wallettransaction2, wk1Var, (byte) 23));
                                            break;
                                        }
                                    }
                                }
                            }
                            if (r47Var.k.random_id != 0) {
                                ArrayList arrayList = C.p;
                                int size = arrayList.size();
                                int i7 = 0;
                                while (i7 < size) {
                                    Object obj = arrayList.get(i7);
                                    i7++;
                                    wallettransaction = (TL_wallet.walletTransaction) obj;
                                    ArrayList arrayList2 = arrayList;
                                    if (wallettransaction.random_id != r47Var.k.random_id) {
                                        arrayList = arrayList2;
                                    } else {
                                        if (wallettransaction == null) {
                                        }
                                        wallettransaction2 = wallettransaction;
                                        wk1Var = new wk1(dl1Var, (byte) 0);
                                        if (!dl1Var.Q0.O3()) {
                                        }
                                        uqc.I0(dl1Var.getContext(), dl1Var.I, wallettransaction2, null, null, null, wk1Var, dl1Var.h1);
                                    }
                                }
                            }
                        }
                    }
                    wallettransaction = null;
                    if (wallettransaction == null) {
                    }
                    wallettransaction2 = wallettransaction;
                    wk1Var = new wk1(dl1Var, (byte) 0);
                    if (!dl1Var.Q0.O3()) {
                    }
                    uqc.I0(dl1Var.getContext(), dl1Var.I, wallettransaction2, null, null, null, wk1Var, dl1Var.h1);
                }
                break;
            case 2:
                this.b.V();
                break;
            case 3:
                dl1 dl1Var2 = this.b;
                al1 al1Var2 = dl1Var2.g1;
                if (al1Var2 != null) {
                    al1Var2.X(dl1Var2);
                    break;
                }
                break;
            case 4:
                dl1 dl1Var3 = this.b;
                dl1Var3.post(new wk1(dl1Var3, (byte) 6));
                break;
            case 5:
                this.b.requestLayout();
                break;
            case 6:
                dl1 dl1Var4 = this.b;
                dl1Var4.H = false;
                dl1Var4.getMessageObject().N0 = true;
                dl1Var4.t1.f.clear();
                dl1Var4.invalidate();
                break;
            default:
                this.b.invalidate();
                break;
        }
    }
}
