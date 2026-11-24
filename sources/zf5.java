// default package

import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class zf5 implements qac {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ View d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ ViewGroup h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public /* synthetic */ zf5(LinearLayout linearLayout, knc kncVar, ylb ylbVar, int i, TextView textView, el7[] el7VarArr, mhb mhbVar, lac lacVar, Context context, TextView[] textViewArr, SpannableString[] spannableStringArr) {
        this.c = linearLayout;
        this.d = kncVar;
        this.e = ylbVar;
        this.b = i;
        this.f = textView;
        this.g = el7VarArr;
        this.h = mhbVar;
        this.i = lacVar;
        this.j = context;
        this.k = textViewArr;
        this.l = spannableStringArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x04d1, code lost:
    
        if (r1.preview == false) goto L205;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x04f4  */
    /* JADX WARN: Type inference failed for: r11v7, types: [zmc] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9, types: [java.lang.String, lhb[], x51[]] */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5, types: [mhb] */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r3v18, types: [ymc] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.lang.String, lhb[], x51[]] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7, types: [mhb] */
    /* JADX WARN: Type inference failed for: r9v8, types: [mhb] */
    @Override // qac
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        Context context;
        SpannableString[] spannableStringArr;
        long j;
        boolean z;
        el7 el7Var;
        iz0 iz0Var;
        int i;
        zmc zmcVar;
        ?? r9;
        ?? r16;
        long j2;
        Context context2;
        long j3;
        ?? r7;
        gs7 c;
        ?? r15;
        el7 el7Var2;
        iz0 iz0Var2;
        int i2;
        char c2;
        el7 el7Var3;
        iz0 iz0Var3;
        byte b = this.a;
        Object obj2 = this.l;
        Object obj3 = this.k;
        Object obj4 = this.j;
        Object obj5 = this.i;
        ViewGroup viewGroup = this.h;
        Object obj6 = this.g;
        Object obj7 = this.f;
        Object obj8 = this.e;
        View view = this.d;
        Object obj9 = this.c;
        switch (b) {
            case 0:
                long[] jArr = (long[]) obj9;
                i96 i96Var = (i96) obj7;
                yd ydVar = (yd) viewGroup;
                yd ydVar2 = (yd) obj5;
                yd ydVar3 = (yd) obj4;
                ag5 ag5Var = (ag5) obj3;
                boolean[] zArr = (boolean[]) obj2;
                Integer num = (Integer) obj;
                long intValue = num.intValue();
                jArr[0] = intValue;
                ((b61) view).i(nxa.Z0(false, jb6.a0(null, null, 2131744845, jb6.E(intValue, ',')), (pn2[]) obj8), true, true);
                i96Var.g = jArr[0];
                ((d96) obj6).set(i96Var);
                int intValue2 = num.intValue();
                int i3 = this.b;
                int b2 = bg5.b(i3, intValue2, 0);
                int b3 = bg5.b(i3, num.intValue(), 1);
                int b4 = bg5.b(i3, num.intValue(), 2);
                ((io) ydVar.b).c(b2 >= 60 ? jb6.a0(null, null, 2131745040, Integer.valueOf(b2 / 60)) : jb6.a0(null, null, 2131745038, Integer.valueOf(b2)), true, true);
                ((io) ydVar2.b).c(jb6.E(b3, ','), true, true);
                ((io) ydVar3.b).c(jb6.E(b4, ','), true, true);
                ag5Var.f(bg5.b(i3, num.intValue(), 3), bg5.b(i3, num.intValue(), 4), !zArr[0]);
                zArr[0] = false;
                break;
            default:
                LinearLayout linearLayout = (LinearLayout) obj9;
                knc kncVar = (knc) view;
                final ylb ylbVar = (ylb) obj8;
                TextView textView = (TextView) obj7;
                final el7[] el7VarArr = (el7[]) obj6;
                mhb mhbVar = (mhb) viewGroup;
                lac lacVar = (lac) obj5;
                Context context3 = (Context) obj4;
                TextView[] textViewArr = (TextView[]) obj3;
                SpannableString[] spannableStringArr2 = (SpannableString[]) obj2;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                long abs = Math.abs(wallettransaction.amount);
                final byte b5 = 1;
                boolean z2 = wallettransaction.incoming;
                long abs2 = Math.abs(wallettransaction.fee);
                boolean z3 = wallettransaction.pending || wallettransaction.failed;
                boolean z4 = ((linearLayout.getParent() instanceof View) && (linearLayout.getParent().getParent() instanceof wgc) && ((wgc) linearLayout.getParent().getParent()).getViewPages()[0] != linearLayout.getParent()) ? false : true;
                boolean z5 = wallettransaction.key_change;
                int i4 = this.b;
                boolean z6 = z4;
                if (z5) {
                    context = context3;
                    spannableStringArr = spannableStringArr2;
                    j = abs2;
                    z = z2;
                    if (z6 && (el7Var = el7VarArr[0]) != null && (iz0Var = el7Var.o1) != null) {
                        iz0Var.setTitle(c.p("Grams", c.u(c.s(abs, false), 0.75f), 2131749264));
                    }
                } else {
                    TL_wallet.nftItem nftitem = wallettransaction.nft;
                    if (nftitem == null) {
                        anb.X(kncVar, z3 ? cmb.y6 : cmb.Ei, ylbVar);
                        SpannableStringBuilder u = c.u(c.s(abs, false), 0.75f);
                        context = context3;
                        u.insert(0, (CharSequence) (z2 ? "+" : "–"));
                        if (z3) {
                            spannableStringArr = spannableStringArr2;
                            j = abs2;
                        } else {
                            spannableStringArr = spannableStringArr2;
                            j = abs2;
                            u.setSpan(new ForegroundColorSpan(cmb.v0(z2 ? cmb.kk : cmb.F6, ylbVar)), 0, u.length(), 33);
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append((CharSequence) c.p("Grams", u, 2131749264));
                        int indexOf = TextUtils.indexOf(spannableStringBuilder, u);
                        int length = u.length() + indexOf;
                        if (indexOf > 0) {
                            z = z2;
                            i2 = 33;
                            spannableStringBuilder.setSpan(new RelativeSizeSpan(0.75f), 0, indexOf, 33);
                        } else {
                            z = z2;
                            i2 = 33;
                        }
                        if (indexOf >= 0 && length < spannableStringBuilder.length()) {
                            spannableStringBuilder.setSpan(new RelativeSizeSpan(0.75f), length, spannableStringBuilder.length(), i2);
                        }
                        kncVar.setText(spannableStringBuilder);
                        CharSequence q = c.C(i4).q(abs, false);
                        if (z3) {
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(wallettransaction.failed ? jb6.M0(2131742805, null) : r8c.a(textView, jb6.M0(2131742677, null)));
                            c2 = 0;
                            spannableStringBuilder2.setSpan(new ForegroundColorSpan(cmb.v0(wallettransaction.failed ? cmb.o7 : cmb.m6, ylbVar)), 0, spannableStringBuilder2.length(), 33);
                            textView.setText(jb6.V(null, null, 2131742650, q, spannableStringBuilder2));
                        } else {
                            c2 = 0;
                            textView.setText(q);
                        }
                        if (z6 && (el7Var3 = el7VarArr[c2]) != null && (iz0Var3 = el7Var3.o1) != null) {
                            iz0Var3.setTitle(c.p("Grams", u, 2131749264));
                        }
                    } else {
                        context = context3;
                        spannableStringArr = spannableStringArr2;
                        j = abs2;
                        z = z2;
                        if (z6 && (el7Var2 = el7VarArr[0]) != null && (iz0Var2 = el7Var2.o1) != null) {
                            iz0Var2.setTitle(TextUtils.isEmpty(nftitem.name) ? jb6.M0(2131742859, null) : wallettransaction.nft.name);
                        }
                    }
                }
                mhbVar.removeAllViews();
                final TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction.peer;
                if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerUser) {
                    TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = (TL_wallet.walletTransactionPeerUser) walletTransactionPeer;
                    TLRPC.User W1 = oc7.r1(i4).W1(Long.valueOf(wallettransactionpeeruser.user_id));
                    if (W1 != null && !m9c.C(W1.id)) {
                        mhbVar.m(z ? jb6.M0(2131742678, null) : jb6.M0(2131742703, null), i4, wallettransactionpeeruser.user_id, new gcc(lacVar, el7VarArr, wallettransactionpeeruser, (byte) 11), jb6.M0(2131742685, null), lacVar != null ? null : new qhc((Object) el7VarArr, (Object) W1, (byte) 15));
                    }
                    mhb mhbVar2 = mhbVar;
                    if (!TextUtils.isEmpty(wallettransactionpeeruser.domain) && !TextUtils.isEmpty(wallettransactionpeeruser.address)) {
                        mhbVar2.i(jb6.M0(2131742812, null), wallettransactionpeeruser.domain, new gcc(el7VarArr, W1, wallettransactionpeeruser, (byte) 12));
                    }
                    i = i4;
                    r9 = mhbVar2;
                } else {
                    mhb mhbVar3 = mhbVar;
                    if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerChannel) {
                        if (oc7.r1(i4).L0(Long.valueOf(walletTransactionPeer.channel_id)) != null) {
                            mhbVar3.n(z ? jb6.M0(2131742678, null) : jb6.M0(2131742703, null), i4, -walletTransactionPeer.channel_id, new gcc(lacVar, el7VarArr, walletTransactionPeer, (byte) 13));
                        }
                        i = i4;
                        r9 = mhbVar3;
                        if (!TextUtils.isEmpty(walletTransactionPeer.domain)) {
                            r9 = mhbVar3;
                            if (!TextUtils.isEmpty(walletTransactionPeer.address)) {
                                mhbVar3.i(jb6.M0(2131742812, null), walletTransactionPeer.domain, new Runnable() { // from class: ymc
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b6 = b5;
                                        final TL_wallet.WalletTransactionPeer walletTransactionPeer2 = walletTransactionPeer;
                                        el7[] el7VarArr2 = el7VarArr;
                                        final byte b7 = 0;
                                        switch (b6) {
                                            case 0:
                                                final byte b8 = 1;
                                                el7VarArr2[0].setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: dnc
                                                    @Override // android.content.DialogInterface.OnDismissListener
                                                    public final void onDismiss(DialogInterface dialogInterface) {
                                                        byte b9 = b8;
                                                        TL_wallet.WalletTransactionPeer walletTransactionPeer3 = walletTransactionPeer2;
                                                        switch (b9) {
                                                            case 0:
                                                                d S = LaunchActivity.S();
                                                                if (S != null) {
                                                                    rrc rrcVar = new rrc(walletTransactionPeer3.address);
                                                                    rrcVar.A0(walletTransactionPeer3.domain);
                                                                    S.presentFragment(rrcVar);
                                                                    break;
                                                                }
                                                                break;
                                                            default:
                                                                d S2 = LaunchActivity.S();
                                                                if (S2 != null) {
                                                                    S2.presentFragment(new rrc(walletTransactionPeer3.address));
                                                                    break;
                                                                }
                                                                break;
                                                        }
                                                    }
                                                });
                                                el7VarArr2[0].dismiss();
                                                break;
                                            default:
                                                el7VarArr2[0].setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: dnc
                                                    @Override // android.content.DialogInterface.OnDismissListener
                                                    public final void onDismiss(DialogInterface dialogInterface) {
                                                        byte b9 = b7;
                                                        TL_wallet.WalletTransactionPeer walletTransactionPeer3 = walletTransactionPeer2;
                                                        switch (b9) {
                                                            case 0:
                                                                d S = LaunchActivity.S();
                                                                if (S != null) {
                                                                    rrc rrcVar = new rrc(walletTransactionPeer3.address);
                                                                    rrcVar.A0(walletTransactionPeer3.domain);
                                                                    S.presentFragment(rrcVar);
                                                                    break;
                                                                }
                                                                break;
                                                            default:
                                                                d S2 = LaunchActivity.S();
                                                                if (S2 != null) {
                                                                    S2.presentFragment(new rrc(walletTransactionPeer3.address));
                                                                    break;
                                                                }
                                                                break;
                                                        }
                                                    }
                                                });
                                                el7VarArr2[0].dismiss();
                                                break;
                                        }
                                    }
                                });
                                r9 = mhbVar3;
                            }
                        }
                    } else {
                        i = i4;
                        r9 = mhbVar3;
                        if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerAddress) {
                            final TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress = (TL_wallet.walletTransactionPeerAddress) walletTransactionPeer;
                            r9 = mhbVar3;
                            if (!TextUtils.isEmpty(wallettransactionpeeraddress.domain)) {
                                if (TextUtils.isEmpty(wallettransactionpeeraddress.address)) {
                                    mhbVar3.i(z ? jb6.M0(2131742678, null) : jb6.M0(2131742703, null), wallettransactionpeeraddress.domain, new jd((byte) 10));
                                    r9 = mhbVar3;
                                } else {
                                    String M0 = z ? jb6.M0(2131742678, null) : jb6.M0(2131742703, null);
                                    String str = wallettransactionpeeraddress.domain;
                                    final byte b6 = 0;
                                    Runnable runnable = new Runnable() { // from class: zmc
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            byte b7 = b6;
                                            final TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress2 = wallettransactionpeeraddress;
                                            el7[] el7VarArr2 = el7VarArr;
                                            final byte b8 = 0;
                                            switch (b7) {
                                                case 0:
                                                    el7VarArr2[0].setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: cnc
                                                        @Override // android.content.DialogInterface.OnDismissListener
                                                        public final void onDismiss(DialogInterface dialogInterface) {
                                                            byte b9 = b8;
                                                            TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress3 = wallettransactionpeeraddress2;
                                                            switch (b9) {
                                                                case 0:
                                                                    d S = LaunchActivity.S();
                                                                    if (S != null) {
                                                                        rrc rrcVar = new rrc(wallettransactionpeeraddress3.address);
                                                                        rrcVar.A0(wallettransactionpeeraddress3.domain);
                                                                        S.presentFragment(rrcVar);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    d S2 = LaunchActivity.S();
                                                                    if (S2 != null) {
                                                                        rrc rrcVar2 = new rrc(wallettransactionpeeraddress3.address);
                                                                        rrcVar2.A0(wallettransactionpeeraddress3.domain);
                                                                        S2.presentFragment(rrcVar2);
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    el7VarArr2[0].dismiss();
                                                    break;
                                                default:
                                                    final byte b9 = 1;
                                                    el7VarArr2[0].setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: cnc
                                                        @Override // android.content.DialogInterface.OnDismissListener
                                                        public final void onDismiss(DialogInterface dialogInterface) {
                                                            byte b92 = b9;
                                                            TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress3 = wallettransactionpeeraddress2;
                                                            switch (b92) {
                                                                case 0:
                                                                    d S = LaunchActivity.S();
                                                                    if (S != null) {
                                                                        rrc rrcVar = new rrc(wallettransactionpeeraddress3.address);
                                                                        rrcVar.A0(wallettransactionpeeraddress3.domain);
                                                                        S.presentFragment(rrcVar);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    d S2 = LaunchActivity.S();
                                                                    if (S2 != null) {
                                                                        rrc rrcVar2 = new rrc(wallettransactionpeeraddress3.address);
                                                                        rrcVar2.A0(wallettransactionpeeraddress3.domain);
                                                                        S2.presentFragment(rrcVar2);
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    el7VarArr2[0].dismiss();
                                                    break;
                                            }
                                        }
                                    };
                                    String M02 = jb6.M0(2131742685, null);
                                    if (lacVar != null) {
                                        zmcVar = null;
                                    } else {
                                        final byte b7 = 1;
                                        zmcVar = new Runnable() { // from class: zmc
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                byte b72 = b7;
                                                final TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress2 = wallettransactionpeeraddress;
                                                el7[] el7VarArr2 = el7VarArr;
                                                final byte b8 = 0;
                                                switch (b72) {
                                                    case 0:
                                                        el7VarArr2[0].setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: cnc
                                                            @Override // android.content.DialogInterface.OnDismissListener
                                                            public final void onDismiss(DialogInterface dialogInterface) {
                                                                byte b92 = b8;
                                                                TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress3 = wallettransactionpeeraddress2;
                                                                switch (b92) {
                                                                    case 0:
                                                                        d S = LaunchActivity.S();
                                                                        if (S != null) {
                                                                            rrc rrcVar = new rrc(wallettransactionpeeraddress3.address);
                                                                            rrcVar.A0(wallettransactionpeeraddress3.domain);
                                                                            S.presentFragment(rrcVar);
                                                                            break;
                                                                        }
                                                                        break;
                                                                    default:
                                                                        d S2 = LaunchActivity.S();
                                                                        if (S2 != null) {
                                                                            rrc rrcVar2 = new rrc(wallettransactionpeeraddress3.address);
                                                                            rrcVar2.A0(wallettransactionpeeraddress3.domain);
                                                                            S2.presentFragment(rrcVar2);
                                                                            break;
                                                                        }
                                                                        break;
                                                                }
                                                            }
                                                        });
                                                        el7VarArr2[0].dismiss();
                                                        break;
                                                    default:
                                                        final byte b9 = 1;
                                                        el7VarArr2[0].setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: cnc
                                                            @Override // android.content.DialogInterface.OnDismissListener
                                                            public final void onDismiss(DialogInterface dialogInterface) {
                                                                byte b92 = b9;
                                                                TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress3 = wallettransactionpeeraddress2;
                                                                switch (b92) {
                                                                    case 0:
                                                                        d S = LaunchActivity.S();
                                                                        if (S != null) {
                                                                            rrc rrcVar = new rrc(wallettransactionpeeraddress3.address);
                                                                            rrcVar.A0(wallettransactionpeeraddress3.domain);
                                                                            S.presentFragment(rrcVar);
                                                                            break;
                                                                        }
                                                                        break;
                                                                    default:
                                                                        d S2 = LaunchActivity.S();
                                                                        if (S2 != null) {
                                                                            rrc rrcVar2 = new rrc(wallettransactionpeeraddress3.address);
                                                                            rrcVar2.A0(wallettransactionpeeraddress3.domain);
                                                                            S2.presentFragment(rrcVar2);
                                                                            break;
                                                                        }
                                                                        break;
                                                                }
                                                            }
                                                        });
                                                        el7VarArr2[0].dismiss();
                                                        break;
                                                }
                                            }
                                        };
                                    }
                                    mhbVar3.h(M0, str, runnable, M02, zmcVar);
                                    r9 = mhbVar3;
                                }
                            }
                        }
                    }
                }
                if (!(wallettransaction.peer instanceof TL_wallet.walletTransactionPeerOnchainGift) || (c = gs7.c(wallettransaction)) == null) {
                    r16 = r9;
                    j2 = 0;
                } else {
                    String str2 = c.l;
                    int i5 = c.j;
                    long j4 = c.f;
                    j2 = 0;
                    r9.f(jb6.M0(2131742733, null), c.e(), null, null);
                    boolean z7 = c.a == 9;
                    if (j4 > 0) {
                        r15 = 0;
                        r9.f(jb6.M0(z7 ? 2131749486 : 2131749484, null), fs7.i(j4), null, null);
                    } else {
                        r15 = 0;
                    }
                    if (z7 && c.i > 0) {
                        r9.f(jb6.M0(2131749485, r15), fs7.j(c.i), r15, r15);
                    }
                    if (i5 > 0) {
                        r9.f(jb6.M0(2131749488, r15), jb6.Q(i5), r15, r15);
                    }
                    if (c.k) {
                        r9.f(jb6.M0(2131749490, r15), fs7.i(c.h), r15, r15);
                    }
                    if (str2 != null) {
                        final byte b8 = 0;
                        mhb mhbVar4 = r9;
                        mhbVar4.j(jb6.M0(c.m, r15), goc.o0(str2, new Runnable() { // from class: anc
                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b9 = b8;
                                ylb ylbVar2 = ylbVar;
                                el7[] el7VarArr2 = el7VarArr;
                                switch (b9) {
                                    case 0:
                                        new c41(el7VarArr2[0].F, ylbVar2).Q(R.raw.copy, 36, jb6.M0(2131742884, null)).k(false);
                                        break;
                                    default:
                                        new c41(el7VarArr2[0].F, ylbVar2).Q(R.raw.copy, 36, jb6.M0(2131742884, null)).k(false);
                                        break;
                                }
                            }
                        }), 14, null, null, null);
                        r16 = mhbVar4;
                    } else {
                        r16 = r9;
                    }
                }
                final TL_wallet.WalletTransactionPeer walletTransactionPeer2 = wallettransaction.peer;
                boolean z8 = walletTransactionPeer2 instanceof TL_wallet.walletTransactionPeerUser;
                if (z8 || (walletTransactionPeer2 instanceof TL_wallet.walletTransactionPeerChannel) || (walletTransactionPeer2 instanceof TL_wallet.walletTransactionPeerAddress)) {
                    final byte b9 = 1;
                    final byte b10 = 0;
                    r16.j(jb6.M0(2131742886, null), goc.o0(walletTransactionPeer2.address, new Runnable() { // from class: anc
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b92 = b9;
                            ylb ylbVar2 = ylbVar;
                            el7[] el7VarArr2 = el7VarArr;
                            switch (b92) {
                                case 0:
                                    new c41(el7VarArr2[0].F, ylbVar2).Q(R.raw.copy, 36, jb6.M0(2131742884, null)).k(false);
                                    break;
                                default:
                                    new c41(el7VarArr2[0].F, ylbVar2).Q(R.raw.copy, 36, jb6.M0(2131742884, null)).k(false);
                                    break;
                            }
                        }
                    }), 14, null, lacVar == null && !(z8 && oc7.r1(i).W1(Long.valueOf(walletTransactionPeer2.user_id)) != null && !m9c.C(walletTransactionPeer2.user_id)) && TextUtils.isEmpty(walletTransactionPeer2.domain) && !TextUtils.isEmpty(walletTransactionPeer2.address) ? jb6.M0(2131742685, null) : null, new Runnable() { // from class: ymc
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b62 = b10;
                            final TL_wallet.WalletTransactionPeer walletTransactionPeer22 = walletTransactionPeer2;
                            el7[] el7VarArr2 = el7VarArr;
                            final byte b72 = 0;
                            switch (b62) {
                                case 0:
                                    final byte b82 = 1;
                                    el7VarArr2[0].setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: dnc
                                        @Override // android.content.DialogInterface.OnDismissListener
                                        public final void onDismiss(DialogInterface dialogInterface) {
                                            byte b92 = b82;
                                            TL_wallet.WalletTransactionPeer walletTransactionPeer3 = walletTransactionPeer22;
                                            switch (b92) {
                                                case 0:
                                                    d S = LaunchActivity.S();
                                                    if (S != null) {
                                                        rrc rrcVar = new rrc(walletTransactionPeer3.address);
                                                        rrcVar.A0(walletTransactionPeer3.domain);
                                                        S.presentFragment(rrcVar);
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    d S2 = LaunchActivity.S();
                                                    if (S2 != null) {
                                                        S2.presentFragment(new rrc(walletTransactionPeer3.address));
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    el7VarArr2[0].dismiss();
                                    break;
                                default:
                                    el7VarArr2[0].setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: dnc
                                        @Override // android.content.DialogInterface.OnDismissListener
                                        public final void onDismiss(DialogInterface dialogInterface) {
                                            byte b92 = b72;
                                            TL_wallet.WalletTransactionPeer walletTransactionPeer3 = walletTransactionPeer22;
                                            switch (b92) {
                                                case 0:
                                                    d S = LaunchActivity.S();
                                                    if (S != null) {
                                                        rrc rrcVar = new rrc(walletTransactionPeer3.address);
                                                        rrcVar.A0(walletTransactionPeer3.domain);
                                                        S.presentFragment(rrcVar);
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    d S2 = LaunchActivity.S();
                                                    if (S2 != null) {
                                                        S2.presentFragment(new rrc(walletTransactionPeer3.address));
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    el7VarArr2[0].dismiss();
                                    break;
                            }
                        }
                    });
                }
                ?? r92 = r16;
                if (j <= j2) {
                    context2 = context;
                    j3 = j;
                    if (wallettransaction.nft == null) {
                        break;
                    }
                    TextView textView2 = new TextView(context2);
                    textViewArr[0] = textView2;
                    textView2.setGravity(16);
                    textViewArr[0].setIncludeFontPadding(false);
                    textViewArr[0].setTextSize(1, 14.0f);
                    anb.X(textViewArr[0], !z3 ? cmb.y6 : cmb.F6, ylbVar);
                    if (wallettransaction.preview) {
                    }
                    textViewArr[0].setText(goc.p0(i, j3, ylbVar));
                    r7 = 0;
                    r92.c(textViewArr[0], jb6.M0(2131742803, null));
                } else if (wallettransaction.gasless) {
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("x ");
                    pn2 pn2Var = new pn2(R.drawable.wallet_gram_small, 2);
                    pn2Var.d = false;
                    pn2Var.c(gm.L(16.0f));
                    float L = gm.L(1.0f);
                    pn2Var.r = 0.0f;
                    pn2Var.s = L;
                    spannableStringBuilder3.setSpan(pn2Var, 0, 1, 33);
                    spannableStringBuilder3.append((CharSequence) jb6.M0(2131742800, null));
                    r92.e(jb6.M0(2131742803, null), spannableStringBuilder3, "?", new o77((Object) context, (Object) ylbVar, i, j, (byte) 21), null);
                    r7 = 0;
                } else {
                    context2 = context;
                    j3 = j;
                    TextView textView22 = new TextView(context2);
                    textViewArr[0] = textView22;
                    textView22.setGravity(16);
                    textViewArr[0].setIncludeFontPadding(false);
                    textViewArr[0].setTextSize(1, 14.0f);
                    anb.X(textViewArr[0], !z3 ? cmb.y6 : cmb.F6, ylbVar);
                    if (wallettransaction.preview || j > j2) {
                        textViewArr[0].setText(goc.p0(i, j3, ylbVar));
                    } else {
                        if (spannableStringArr[0] == null) {
                            SpannableString spannableString = new SpannableString(jb6.M0(2131748536, null));
                            spannableStringArr[0] = spannableString;
                            spannableString.setSpan(new ta6(gm.L(150.0f), textViewArr[0]), 0, spannableStringArr[0].length(), 33);
                        }
                        textViewArr[0].setText(spannableStringArr[0]);
                    }
                    r7 = 0;
                    r92.c(textViewArr[0], jb6.M0(2131742803, null));
                }
                if (wallettransaction.date != 0) {
                    r92.f(jb6.M0(2131742827, r7), jb6.Q(wallettransaction.date), r7, r7);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ zf5(long[] jArr, b61 b61Var, pn2[] pn2VarArr, i96 i96Var, d96 d96Var, int i, yd ydVar, yd ydVar2, yd ydVar3, ag5 ag5Var, boolean[] zArr) {
        this.c = jArr;
        this.d = b61Var;
        this.e = pn2VarArr;
        this.f = i96Var;
        this.g = d96Var;
        this.b = i;
        this.h = ydVar;
        this.i = ydVar2;
        this.j = ydVar3;
        this.k = ag5Var;
        this.l = zArr;
    }
}
