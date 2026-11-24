// default package

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class v35 implements jac {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ v35(he heVar, jac jacVar, uk0 uk0Var, Context context, int i) {
        this.d = heVar;
        this.e = jacVar;
        this.f = uk0Var;
        this.c = context;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v24 */
    @Override // jac
    public final void a(Object obj, Object obj2) {
        t56 t56Var;
        w45 w45Var;
        boolean z;
        LinearLayout linearLayout;
        final int i;
        CharSequence V;
        String str;
        int i2;
        String M0;
        int i3;
        int i4;
        int i5;
        TL_wallet.tonConnectSession tonconnectsession;
        d S;
        byte b = this.a;
        byte b2 = 12;
        byte b3 = 3;
        int i6 = this.b;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        int i7 = 0;
        byte b4 = 1;
        switch (b) {
            case 0:
                Context context = (Context) obj6;
                c cVar = (c) obj5;
                ylb ylbVar = (ylb) obj4;
                final t56 t56Var2 = (t56) obj3;
                final s45 s45Var = (s45) obj;
                String str2 = (String) obj2;
                if (s45Var != null) {
                    int i8 = s45Var.c;
                    TL_wallet.tonConnectSession tonconnectsession2 = s45Var.a;
                    String str3 = s45Var.e;
                    if (context instanceof Activity) {
                        Activity activity = (Activity) context;
                        if (activity.isFinishing() || activity.isDestroyed() || !LaunchActivity.G1 || gda.w || gda.B || z8c.t0 != i6) {
                            cVar.g.u(s45Var);
                            break;
                        }
                    }
                    if (!"signData".equals(str3)) {
                        c C = c.C(i6);
                        w45 w45Var2 = C.g;
                        v45 v45Var = s45Var.f;
                        boolean equals = "signMessage".equals(str3);
                        final mk7 mk7Var = new mk7(context, ylbVar, new View[0]);
                        mk7Var.E0(cmb.v0(cmb.Z6, ylbVar));
                        LinearLayout linearLayout2 = new LinearLayout(context);
                        linearLayout2.setOrientation(1);
                        bf0 bf0Var = new bf0(context);
                        bf0Var.setRoundRadius(gm.L(38.0f));
                        TLRPC.WebDocument webDocument = tonconnectsession2.manifest.icon;
                        if (webDocument != null) {
                            t56Var = t56Var2;
                            w45Var = w45Var2;
                            z = equals;
                            bf0Var.p(gn5.p(vuc.c(webDocument)), "76_76", null, tonconnectsession2.manifest);
                        } else {
                            t56Var = t56Var2;
                            w45Var = w45Var2;
                            z = equals;
                        }
                        linearLayout2.addView(bf0Var, qoe.t(76, 76, 1, 0, 24, 0, 0));
                        TextView v = w45.v(context, jb6.V(null, null, z ? 2131742879 : 2131742878, tonconnectsession2.manifest.name), 20, ylbVar);
                        v.setTypeface(gm.o());
                        linearLayout2.addView(v, qoe.k(24.0f, 12.0f, 24.0f, 0.0f, -1, -2));
                        String J0 = gm.J0(tonconnectsession2.manifest.url, false);
                        if (!TextUtils.isEmpty(J0)) {
                            linearLayout2.addView(w45.g(context, J0, ylbVar), qoe.t(-2, -2, 1, 36, 6, 36, 12));
                        }
                        soc socVar = new soc(context, R.drawable.wallet_card_info, 24);
                        socVar.getCardHolderView().setMaxLines(2);
                        socVar.getCardHolderView().setSingleLine(false);
                        List<u45> list = v45Var.b;
                        long j = v45Var.c;
                        socVar.setCardHolder(pqc.a0(((u45) list.get(0)).a));
                        socVar.getBalanceView().setText(w45.j(j));
                        socVar.getUsdBalanceView().setText(C.q(j, false));
                        linearLayout2.addView(socVar, qoe.o(-1, -2));
                        final byte b5 = 0;
                        socVar.setCardOnClickListener(new View.OnClickListener() { // from class: y35
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                byte b6 = b5;
                                mk7 mk7Var2 = mk7Var;
                                switch (b6) {
                                    case 0:
                                        hs1 hs1Var = mk7Var2.l1;
                                        if (1 < mk7Var2.m1.size() && 1 != hs1Var.getCurrentPosition()) {
                                            for (View view2 : hs1Var.getViewPages()) {
                                                if (view2 != null) {
                                                    gm.t1(view2);
                                                }
                                            }
                                            hs1Var.E(1);
                                            break;
                                        }
                                        break;
                                    default:
                                        hs1 hs1Var2 = mk7Var2.l1;
                                        if (mk7Var2.m1.size() > 0 && hs1Var2.getCurrentPosition() != 0) {
                                            for (View view3 : hs1Var2.getViewPages()) {
                                                if (view3 != null) {
                                                    gm.t1(view3);
                                                }
                                            }
                                            hs1Var2.E(0);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        lk7 lk7Var = new lk7(context);
                        lk7Var.getContent().addView(linearLayout2, qoe.c(-2.0f, -1));
                        mk7Var.D0(lk7Var);
                        LinearLayout i9 = hg9.i(context, 1);
                        LinearLayout i10 = hg9.i(context, 0);
                        i9.addView(i10, qoe.o(-1, 56));
                        ImageView imageView = new ImageView(context);
                        imageView.setImageResource(R.drawable.ic_ab_back);
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        int i11 = cmb.h6;
                        fg0 f0 = cmb.f0(cmb.v0(i11, ylbVar), 1, -1);
                        wmb M = anb.M(i11);
                        imageView.setBackground(f0);
                        anb.j(imageView, f0, null, M, ylbVar);
                        int i12 = cmb.F6;
                        anb.s(imageView, i12, ylbVar, PorterDuff.Mode.SRC_IN);
                        rve.a(imageView);
                        i10.addView(imageView, qoe.q(48, 48, 0.0f, 19, 4, 0, 0, 0));
                        bf0 bf0Var2 = new bf0(context);
                        bf0Var2.setRoundRadius(gm.L(22.0f));
                        TLRPC.WebDocument webDocument2 = tonconnectsession2.manifest.icon;
                        if (webDocument2 != null) {
                            linearLayout = i9;
                            bf0Var2.p(gn5.p(vuc.c(webDocument2)), "44_44", null, tonconnectsession2.manifest);
                        } else {
                            linearLayout = i9;
                        }
                        i10.addView(bf0Var2, qoe.t(44, 44, 19, 12, 0, 11, 0));
                        LinearLayout linearLayout3 = new LinearLayout(context);
                        linearLayout3.setOrientation(1);
                        i10.addView(linearLayout3, qoe.q(0, 44, 1.0f, 23, 0, 0, 12, 0));
                        TextView textView = new TextView(context);
                        textView.setTypeface(gm.o());
                        anb.X(textView, i12, ylbVar);
                        textView.setTextSize(1, 18.0f);
                        linearLayout3.addView(textView, qoe.o(-1, -2));
                        textView.setText(jb6.M0(2131742850, null));
                        if (TextUtils.isEmpty(J0)) {
                            i = 1;
                        } else {
                            TextView textView2 = new TextView(context);
                            anb.X(textView2, cmb.y6, ylbVar);
                            i = 1;
                            textView2.setTextSize(1, 14.0f);
                            linearLayout3.addView(textView2, qoe.o(-1, -2));
                            textView2.setText(J0);
                        }
                        imageView.setOnClickListener(new View.OnClickListener() { // from class: y35
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                byte b6 = i;
                                mk7 mk7Var2 = mk7Var;
                                switch (b6) {
                                    case 0:
                                        hs1 hs1Var = mk7Var2.l1;
                                        if (1 < mk7Var2.m1.size() && 1 != hs1Var.getCurrentPosition()) {
                                            for (View view2 : hs1Var.getViewPages()) {
                                                if (view2 != null) {
                                                    gm.t1(view2);
                                                }
                                            }
                                            hs1Var.E(1);
                                            break;
                                        }
                                        break;
                                    default:
                                        hs1 hs1Var2 = mk7Var2.l1;
                                        if (mk7Var2.m1.size() > 0 && hs1Var2.getCurrentPosition() != 0) {
                                            for (View view3 : hs1Var2.getViewPages()) {
                                                if (view3 != null) {
                                                    gm.t1(view3);
                                                }
                                            }
                                            hs1Var2.E(0);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        LinearLayout linearLayout4 = new LinearLayout(context);
                        linearLayout4.setOrientation(i);
                        LinearLayout F = w45.F(context, jb6.M0(2131742714, null), ylbVar);
                        String C2 = w45.C(((u45) list.get(0)).a);
                        SpannableStringBuilder w = c.w(j, i);
                        if (list.size() > i) {
                            Integer valueOf = Integer.valueOf(list.size() - i);
                            Object[] objArr = new Object[2];
                            objArr[0] = C2;
                            objArr[i] = valueOf;
                            V = jb6.V(null, null, 2131742638, objArr);
                        } else {
                            Object[] objArr2 = new Object[i];
                            objArr2[0] = C2;
                            V = jb6.V(null, null, 2131742639, objArr2);
                        }
                        F.addView(w45.b(context, w, V, null, null, ylbVar), qoe.o(-1, -2));
                        linearLayout4.addView(F, qoe.k(12.0f, 4.0f, 12.0f, 6.0f, -1, -2));
                        LinearLayout F2 = w45.F(context, jb6.M0(2131742890, null), ylbVar);
                        for (u45 u45Var : list) {
                            if (u45Var.b == null || u45Var.d != null) {
                                str = null;
                                i2 = 2131742644;
                            } else {
                                i2 = 2131742836;
                                str = null;
                            }
                            F2.addView(w45.b(context, jb6.M0(i2, str), jb6.V(str, str, 2131742639, w45.C(u45Var.a)), w45.a(-u45Var.e), u45Var.d, ylbVar), qoe.o(-1, -2));
                        }
                        linearLayout4.addView(F2, qoe.k(12.0f, 6.0f, 12.0f, 12.0f, -1, -2));
                        lj3 lj3Var = new lj3(context, (byte) 2);
                        lj3Var.setFillViewport(false);
                        lj3Var.addView(linearLayout4);
                        LinearLayout linearLayout5 = linearLayout;
                        linearLayout5.addView(lj3Var, qoe.o(-1, -2));
                        lk7 lk7Var2 = new lk7(context);
                        lk7Var2.getContent().addView(linearLayout5, qoe.c(-2.0f, -1));
                        mk7Var.D0(lk7Var2);
                        LinearLayout i13 = hg9.i(context, 1);
                        TextView v2 = w45.v(context, null, 14, ylbVar);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
                        spannableStringBuilder.setSpan(new ta6(gm.L(80.0f), v2), 0, spannableStringBuilder.length(), 33);
                        v2.setText(jb6.V(null, null, 2131742802, spannableStringBuilder));
                        v2.setVisibility(z ? 8 : 0);
                        anb.X(v2, cmb.y6, ylbVar);
                        i13.addView(v2, qoe.k(20.0f, 16.0f, 20.0f, 16.0f, -1, -2));
                        LinearLayout linearLayout6 = new LinearLayout(context);
                        linearLayout6.setPadding(gm.L(16.0f), 0, gm.L(16.0f), gm.L(16.0f));
                        b61 b61Var = new b61(ylbVar, context, true);
                        b61Var.setRoundRadius(24);
                        b61Var.e();
                        b61Var.setText(jb6.M0(2131742826, null));
                        linearLayout6.addView(b61Var, qoe.m(1.0f, 0, 44, 0, 6, 0));
                        b61 i14 = mlb.i(24, ylbVar, context, true);
                        i14.setText(jb6.M0(z ? 2131742675 : 2131742851, null));
                        i14.setEnabled(false);
                        linearLayout6.addView(i14, qoe.m(1.0f, 0, 44, 6, 0, 0));
                        i13.addView(linearLayout6);
                        mk7Var.F0(i13);
                        final byte b6 = 1;
                        final byte b7 = 0;
                        final boolean[] zArr = {false};
                        boolean[] zArr2 = {false};
                        final w45 w45Var3 = w45Var;
                        final z35 z35Var = new z35(s45Var, zArr2, i14, b61Var, w45Var3, mk7Var, zArr, ylbVar);
                        i14.setOnClickListener(new View.OnClickListener() { // from class: a45
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                byte b8 = b7;
                                z35 z35Var2 = z35Var;
                                switch (b8) {
                                    case 0:
                                        z35Var2.a(Boolean.FALSE);
                                        break;
                                    default:
                                        z35Var2.a(Boolean.TRUE);
                                        break;
                                }
                            }
                        });
                        b61Var.setOnClickListener(new View.OnClickListener() { // from class: a45
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                byte b8 = b6;
                                z35 z35Var2 = z35Var;
                                switch (b8) {
                                    case 0:
                                        z35Var2.a(Boolean.FALSE);
                                        break;
                                    default:
                                        z35Var2.a(Boolean.TRUE);
                                        break;
                                }
                            }
                        });
                        final q45 q45Var = new q45(zArr, s45Var, mk7Var, b6);
                        long j2 = i8;
                        long j3 = v45Var.a;
                        if (j3 == 0) {
                            j3 = Long.MAX_VALUE;
                        }
                        long max = Math.max(0L, Math.min(j2, j3) - ConnectionsManager.getInstance(i6).getCurrentTime()) * 1000;
                        s45Var.r = new qn4(mk7Var, (byte) 17);
                        final byte b8 = 0;
                        final t56 t56Var3 = t56Var;
                        mk7Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: b45
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                byte b9 = b8;
                                t56 t56Var4 = t56Var3;
                                s45 s45Var2 = s45Var;
                                w45 w45Var4 = w45Var3;
                                Runnable runnable = q45Var;
                                boolean[] zArr3 = zArr;
                                q45 q45Var2 = (q45) runnable;
                                switch (b9) {
                                    case 0:
                                        zArr3[0] = true;
                                        gm.r(q45Var2);
                                        w45Var4.u(s45Var2);
                                        if (t56Var4 != null) {
                                            t56Var4.run();
                                            break;
                                        }
                                        break;
                                    default:
                                        zArr3[0] = true;
                                        gm.r(q45Var2);
                                        w45Var4.u(s45Var2);
                                        if (t56Var4 != null) {
                                            t56Var4.run();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        mk7Var.show();
                        gm.d3(q45Var, max);
                        d82 d82Var = new d82(zArr, s45Var, zArr2, i14, z, C, v2, mk7Var, ylbVar);
                        WalletEngine2 walletEngine2 = w45Var3.b.b;
                        if (!s45Var.n && !w45Var3.i(s45Var) && w45Var3.A(s45Var) && walletEngine2 != null) {
                            if ("signMessage".equals(str3)) {
                                walletEngine2.previewSignMessage(v45Var, new iu(w45Var3, s45Var, d82Var, (byte) 20));
                                break;
                            } else {
                                walletEngine2.previewTonConnect(v45Var, new p((Object) w45Var3, (Object) s45Var, (Object) d82Var, (byte) 21));
                                break;
                            }
                        } else {
                            d82Var.a(null, "Request expired, was processed, or the wallet changed");
                            break;
                        }
                    } else {
                        final w45 w45Var4 = c.C(i6).g;
                        try {
                            JSONObject jSONObject = new JSONObject(s45Var.k);
                            boolean equals2 = "text".equals(jSONObject.optString(TeXSymbolParser.TYPE_ATTR));
                            mk7 mk7Var2 = new mk7(context, ylbVar, new View[0]);
                            mk7Var2.E0(cmb.v0(cmb.Z6, ylbVar));
                            LinearLayout linearLayout7 = new LinearLayout(context);
                            linearLayout7.setOrientation(1);
                            LinearLayout linearLayout8 = new LinearLayout(context);
                            linearLayout8.setGravity(16);
                            ImageView k = td4.k(context, R.drawable.ic_ab_close);
                            k.setScaleType(ImageView.ScaleType.CENTER);
                            anb.s(k, cmb.F6, ylbVar, PorterDuff.Mode.SRC_IN);
                            int i15 = cmb.h6;
                            fg0 f02 = cmb.f0(cmb.v0(i15, ylbVar), 1, -1);
                            wmb M2 = anb.M(i15);
                            k.setBackground(f02);
                            anb.j(k, f02, null, M2, ylbVar);
                            k.setContentDescription(jb6.M0(2131751978, null));
                            k.setOnClickListener(new tf3(s45Var, mk7Var2, (byte) 19));
                            linearLayout8.addView(k, qoe.q(48, 48, 0.0f, 16, 4, 0, 12, 0));
                            bf0 bf0Var3 = new bf0(context);
                            bf0Var3.setRoundRadius(gm.L(22.0f));
                            TLRPC.WebDocument webDocument3 = tonconnectsession2.manifest.icon;
                            if (webDocument3 != null) {
                                bf0Var3.p(gn5.p(vuc.c(webDocument3)), "44_44", null, tonconnectsession2.manifest);
                            }
                            linearLayout8.addView(bf0Var3, qoe.q(44, 44, 0.0f, 16, 0, 0, 12, 0));
                            LinearLayout linearLayout9 = new LinearLayout(context);
                            linearLayout9.setOrientation(1);
                            TextView v3 = w45.v(context, jb6.M0(2131742674, null), 18, ylbVar);
                            v3.setTypeface(gm.o());
                            v3.setGravity(3);
                            linearLayout9.addView(v3, qoe.o(-1, -2));
                            TextView v4 = w45.v(context, gm.J0(tonconnectsession2.manifest.url, false), 14, ylbVar);
                            int i16 = cmb.y6;
                            anb.X(v4, i16, ylbVar);
                            v4.setGravity(3);
                            v4.setSingleLine(true);
                            v4.setEllipsize(TextUtils.TruncateAt.END);
                            linearLayout9.addView(v4, qoe.o(-1, -2));
                            linearLayout8.addView(linearLayout9, qoe.m(1.0f, 0, -2, 0, 16, 0));
                            linearLayout7.addView(linearLayout8, qoe.o(-1, 56));
                            LinearLayout linearLayout10 = new LinearLayout(context);
                            linearLayout10.setOrientation(1);
                            linearLayout10.setPadding(gm.L(20.0f), gm.L(16.0f), gm.L(20.0f), gm.L(16.0f));
                            int L = gm.L(16.0f);
                            int i17 = cmb.c6;
                            ShapeDrawable b0 = cmb.b0(L, cmb.v0(i17, ylbVar));
                            wmb M3 = anb.M(i17);
                            linearLayout10.setBackground(b0);
                            anb.j(linearLayout10, b0, M3, null, ylbVar);
                            if (equals2) {
                                M0 = jSONObject.optString("text");
                                i3 = 14;
                            } else {
                                M0 = jb6.M0(2131742866, null);
                                i3 = 16;
                            }
                            TextView v5 = w45.v(context, M0, i3, ylbVar);
                            v5.setGravity(3);
                            v5.setTextIsSelectable(equals2);
                            if (equals2) {
                                TextView v6 = w45.v(context, jb6.M0(2131742673, null), 14, ylbVar);
                                v6.setGravity(3);
                                v6.setTypeface(gm.o());
                                anb.X(v6, cmb.K6, ylbVar);
                                linearLayout10.addView(v6, qoe.k(0.0f, 0.0f, 0.0f, 12.0f, -1, -2));
                                v5.setTypeface(Typeface.MONOSPACE);
                                i4 = -2;
                                i5 = -1;
                            } else {
                                LinearLayout linearLayout11 = new LinearLayout(context);
                                linearLayout11.setGravity(16);
                                TextView v7 = w45.v(context, "!", 12, ylbVar);
                                v7.setTypeface(gm.o());
                                v7.setTextColor(-1);
                                int L2 = gm.L(8.0f);
                                int i18 = cmb.p7;
                                ShapeDrawable b02 = cmb.b0(L2, cmb.v0(i18, ylbVar));
                                wmb M4 = anb.M(i18);
                                v7.setBackground(b02);
                                anb.j(v7, b02, M4, null, ylbVar);
                                linearLayout11.addView(v7, qoe.q(16, 16, 0.0f, 16, 0, 0, 6, 0));
                                TextView v8 = w45.v(context, jb6.M0(2131742867, null), 14, ylbVar);
                                v8.setGravity(3);
                                v8.setTypeface(gm.o());
                                i4 = -2;
                                i5 = -1;
                                linearLayout11.addView(v8, qoe.o(-1, -2));
                                linearLayout10.addView(linearLayout11, qoe.k(0.0f, 0.0f, 0.0f, 4.0f, -1, -2));
                            }
                            linearLayout10.addView(v5, qoe.o(i5, i4));
                            if (equals2) {
                                v5.setOnClickListener(new jw4(jSONObject, mk7Var2, ylbVar, (byte) 2));
                            }
                            lj3 lj3Var2 = new lj3(context, (byte) 1);
                            lj3Var2.addView(linearLayout10);
                            linearLayout7.addView(lj3Var2, qoe.k(12.0f, 4.0f, 12.0f, 0.0f, -1, -2));
                            lk7 lk7Var3 = new lk7(context);
                            lk7Var3.getContent().addView(linearLayout7, qoe.c(-2.0f, -1));
                            mk7Var2.D0(lk7Var3);
                            LinearLayout i19 = hg9.i(context, 1);
                            if (equals2) {
                                TextView v9 = w45.v(context, jb6.M0(2131742692, null), 14, ylbVar);
                                v9.setGravity(3);
                                anb.X(v9, i16, ylbVar);
                                i19.addView(v9, qoe.k(36.0f, 12.0f, 36.0f, 0.0f, -1, -2));
                            }
                            LinearLayout linearLayout12 = new LinearLayout(context);
                            linearLayout12.setPadding(gm.L(16.0f), gm.L(16.0f), gm.L(16.0f), gm.L(16.0f));
                            b61 b61Var2 = new b61(ylbVar, context, true);
                            b61Var2.setRoundRadius(24);
                            b61Var2.e();
                            b61Var2.setText(jb6.M0(2131752542, null));
                            b61 i20 = mlb.i(24, ylbVar, context, true);
                            i20.setText(jb6.M0(2131742675, null));
                            i20.setEnabled(false);
                            linearLayout12.addView(b61Var2, qoe.m(1.0f, 0, 44, 0, 6, 0));
                            linearLayout12.addView(i20, qoe.m(1.0f, 0, 44, 6, 0, 0));
                            i19.addView(linearLayout12);
                            mk7Var2.F0(i19);
                            byte b9 = 1;
                            mk7Var2.z0 = new tu(s45Var, b9);
                            if4 if4Var = new if4((Object) lj3Var2, (Object) s45Var, (Object) i20, (byte) 13);
                            lj3Var2.getViewTreeObserver().addOnScrollChangedListener(new be(if4Var, b9));
                            final byte b10 = 0;
                            lj3Var2.getViewTreeObserver().addOnGlobalLayoutListener(new c45(if4Var, b10));
                            final d45 d45Var = new d45(i20, b61Var2, w45Var4, s45Var, mk7Var2, ylbVar, if4Var);
                            i20.setOnClickListener(new View.OnClickListener() { // from class: e45
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    byte b11 = b10;
                                    d45 d45Var2 = d45Var;
                                    switch (b11) {
                                        case 0:
                                            d45Var2.a(Boolean.FALSE);
                                            break;
                                        default:
                                            d45Var2.a(Boolean.TRUE);
                                            break;
                                    }
                                }
                            });
                            final byte b11 = 1;
                            b61Var2.setOnClickListener(new View.OnClickListener() { // from class: e45
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    byte b112 = b11;
                                    d45 d45Var2 = d45Var;
                                    switch (b112) {
                                        case 0:
                                            d45Var2.a(Boolean.FALSE);
                                            break;
                                        default:
                                            d45Var2.a(Boolean.TRUE);
                                            break;
                                    }
                                }
                            });
                            final boolean[] zArr3 = {false};
                            final q45 q45Var2 = new q45(zArr3, s45Var, mk7Var2, b10);
                            s45Var.r = new qn4(mk7Var2, (byte) 17);
                            final byte b12 = 1;
                            mk7Var2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: b45
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    byte b92 = b12;
                                    t56 t56Var4 = t56Var2;
                                    s45 s45Var2 = s45Var;
                                    w45 w45Var42 = w45Var4;
                                    Runnable runnable = q45Var2;
                                    boolean[] zArr32 = zArr3;
                                    q45 q45Var22 = (q45) runnable;
                                    switch (b92) {
                                        case 0:
                                            zArr32[0] = true;
                                            gm.r(q45Var22);
                                            w45Var42.u(s45Var2);
                                            if (t56Var4 != null) {
                                                t56Var4.run();
                                                break;
                                            }
                                            break;
                                        default:
                                            zArr32[0] = true;
                                            gm.r(q45Var22);
                                            w45Var42.u(s45Var2);
                                            if (t56Var4 != null) {
                                                t56Var4.run();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            mk7Var2.show();
                            gm.d3(q45Var2, Math.max(0L, i8 - w45Var4.f.getCurrentTime()) * 1000);
                            break;
                        } catch (JSONException e) {
                            w45Var4.u(s45Var);
                            c41.c0(w45.h("display signing data", e));
                            return;
                        }
                    }
                } else if (str2 != null) {
                    c41.c0(str2);
                    break;
                }
                break;
            case 1:
                LaunchActivity launchActivity = (LaunchActivity) obj6;
                k11 k11Var = (k11) obj5;
                oc7 oc7Var = (oc7) obj4;
                TLRPC.User user = (TLRPC.User) obj3;
                TLRPC.User user2 = (TLRPC.User) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                String str4 = LaunchActivity.C1;
                if (k11Var != null) {
                    k11Var.b();
                }
                if (user2 != null) {
                    oc7Var.c4(user2, false, false);
                    oc7Var.b3(user2, 0, true, null);
                }
                launchActivity.m0(i6, user.id, tL_error);
                break;
            case 2:
                a66 a66Var = (a66) obj6;
                String str5 = (String) obj5;
                String str6 = (String) obj4;
                String str7 = (String) obj3;
                TL_wallet.tonConnectPending tonconnectpending = (TL_wallet.tonConnectPending) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                LaunchActivity launchActivity2 = a66Var.a;
                a66Var.h = -1;
                if (!a66Var.j && !launchActivity2.isFinishing() && !launchActivity2.isDestroyed()) {
                    if (tL_error2 != null) {
                        a66Var.c();
                        if (a66Var.a()) {
                            a66.d().g0(tL_error2, false);
                            break;
                        }
                    } else {
                        if (tonconnectpending != null && (tonconnectsession = tonconnectpending.session) != null && !tonconnectsession.closed && !tonconnectsession.closing && !tonconnectsession.pending && str5.equals(tonconnectsession.dapp_client_id)) {
                            ArrayList<TL_wallet.tonConnectRequest> arrayList = tonconnectpending.requests;
                            int size = arrayList.size();
                            while (true) {
                                if (i7 < size) {
                                    TL_wallet.tonConnectRequest tonconnectrequest = arrayList.get(i7);
                                    i7++;
                                    TL_wallet.tonConnectRequest tonconnectrequest2 = tonconnectrequest;
                                    if (str6.equals(tonconnectrequest2.trace_id) && tonconnectrequest2.session_id == tonconnectpending.session.id && tonconnectrequest2.expires > ConnectionsManager.getInstance(a66Var.b).getCurrentTime()) {
                                        if (a66Var.a() && (S = LaunchActivity.S()) != null && S.getContext() != null) {
                                            a66Var.c();
                                            w45.q(a66Var.a, a66Var.b, tonconnectrequest2.session_id, tonconnectrequest2.msg_id, S.getResourceProvider(), new t56(a66Var, str7, (byte) 3));
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        int i21 = this.b;
                        if (i21 < 10) {
                            i77 i77Var = new i77((Object) a66Var, (Object) str5, (Object) str6, (Object) str7, i21, (byte) 19);
                            a66Var.i = i77Var;
                            gm.d3(i77Var, 500L);
                            break;
                        } else {
                            a66Var.c();
                            if (a66Var.a()) {
                                c41.c0(jb6.M0(2131742656, null));
                                break;
                            }
                        }
                    }
                } else {
                    a66Var.c();
                    break;
                }
                break;
            case 3:
                jac jacVar = (jac) obj4;
                uk0 uk0Var = (uk0) obj3;
                Context context2 = (Context) obj6;
                TL_account.passkeyRegistrationOptions passkeyregistrationoptions = (TL_account.passkeyRegistrationOptions) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                ((he) obj5).dismiss();
                if (tL_error3 != null) {
                    jacVar.a(null, tL_error3.text);
                    break;
                } else {
                    try {
                        try {
                            uk0Var.d(context2, new m23(new JSONObject(passkeyregistrationoptions.options.data).getJSONObject("publicKey").toString()), new ky7(new ro1(jacVar, context2, i6, b3)));
                            break;
                        } catch (Exception e2) {
                            fc4.g(e2, true);
                            gm.c3(new d25(jacVar, e2, (byte) 2));
                            return;
                        }
                    } catch (Exception e3) {
                        fc4.g(e3, true);
                        jacVar.a(null, e3.getMessage());
                        return;
                    }
                }
            default:
                b61 b61Var3 = (b61) obj6;
                my0 my0Var = (my0) obj5;
                View view = (View) obj4;
                sm2 sm2Var = (sm2) obj3;
                TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                b61Var3.setLoading(false);
                if (!(urlAuthResult instanceof TLRPC.TL_urlAuthResultAccepted)) {
                    FrameLayout frameLayout = my0Var.F;
                    if (tL_error4 != null) {
                        wi8.u(frameLayout, my0Var.J0, tL_error4, false);
                        break;
                    } else {
                        new c41(frameLayout, my0Var.J0).f0("NO_TOKEN", false);
                        break;
                    }
                } else {
                    String queryParameter = Uri.parse("?" + Uri.parse(((TLRPC.TL_urlAuthResultAccepted) urlAuthResult).url).getFragment()).getQueryParameter("tgWebAuthToken");
                    if (queryParameter == null) {
                        new c41(my0Var.F, my0Var.J0).f0("NO_TOKEN", false);
                        break;
                    } else {
                        int currentDatacenterId = ConnectionsManager.getInstance(i6).getCurrentDatacenterId();
                        boolean isTestBackend = ConnectionsManager.getInstance(i6).isTestBackend();
                        StringBuilder o = ts2.o("wear-auth: sending /token account=", i6, " dcId=", currentDatacenterId, " isTest=");
                        o.append(isTestBackend);
                        fc4.b(o.toString());
                        Context applicationContext = view.getContext().getApplicationContext();
                        try {
                            byte[] a = auc.a(sm2Var, queryParameter, currentDatacenterId, isTestBackend);
                            ua4 ua4Var = new ua4(applicationContext, b05.c);
                            String str8 = (String) sm2Var.e;
                            z3d z3dVar = ua4Var.i;
                            t2e t2eVar = new t2e(z3dVar, str8, "/tg-wear-auth/token", a);
                            z3dVar.b.d(0, t2eVar);
                            ydd.a(t2eVar, nf5.f).addOnSuccessListener(new uxb(sm2Var, b61Var3, b2)).addOnFailureListener(new ytc(b61Var3, b4));
                            my0Var.dismiss();
                            break;
                        } catch (Exception e4) {
                            fc4.g(e4, true);
                            new c41(my0Var.F, my0Var.J0).f0(e4.getMessage(), false);
                            return;
                        }
                    }
                }
        }
    }

    public /* synthetic */ v35(b61 b61Var, my0 my0Var, int i, View view, sm2 sm2Var) {
        this.c = b61Var;
        this.d = my0Var;
        this.b = i;
        this.e = view;
        this.f = sm2Var;
    }

    public /* synthetic */ v35(a66 a66Var, String str, String str2, String str3, int i) {
        this.c = a66Var;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.b = i;
    }

    public /* synthetic */ v35(Context context, int i, c cVar, ylb ylbVar, t56 t56Var) {
        this.c = context;
        this.b = i;
        this.d = cVar;
        this.e = ylbVar;
        this.f = t56Var;
    }

    public /* synthetic */ v35(LaunchActivity launchActivity, k11 k11Var, oc7 oc7Var, int i, TLRPC.User user) {
        this.c = launchActivity;
        this.d = k11Var;
        this.e = oc7Var;
        this.b = i;
        this.f = user;
    }
}
