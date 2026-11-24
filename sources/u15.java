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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class u15 implements i8c {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ u15(hd hdVar, i8c i8cVar, p13 p13Var, Context context, int i) {
        this.d = hdVar;
        this.e = i8cVar;
        this.f = p13Var;
        this.c = context;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v29 */
    @Override // i8c
    public final void a(Object obj, Object obj2) {
        int i;
        t36 t36Var;
        boolean z;
        LinearLayout linearLayout;
        final int i2;
        CharSequence V;
        String str;
        int i3;
        String M0;
        int i4;
        int i5;
        int i6;
        TL_wallet.tonConnectSession tonconnectsession;
        d S;
        byte b = this.a;
        byte b2 = 11;
        byte b3 = 3;
        int i7 = this.b;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        int i8 = 0;
        byte b4 = 1;
        switch (b) {
            case 0:
                Context context = (Context) obj6;
                c cVar = (c) obj5;
                wjb wjbVar = (wjb) obj4;
                final t36 t36Var2 = (t36) obj3;
                final s25 s25Var = (s25) obj;
                String str2 = (String) obj2;
                if (s25Var != null) {
                    int i9 = s25Var.c;
                    TL_wallet.tonConnectSession tonconnectsession2 = s25Var.a;
                    String str3 = s25Var.e;
                    if (context instanceof Activity) {
                        Activity activity = (Activity) context;
                        if (activity.isFinishing() || activity.isDestroyed() || !LaunchActivity.G1 || gba.w || gba.B || y6c.t0 != i7) {
                            cVar.g.u(s25Var);
                            break;
                        }
                    }
                    if (!"signData".equals(str3)) {
                        c C = c.C(i7);
                        final w25 w25Var = C.g;
                        v25 v25Var = s25Var.f;
                        boolean equals = "signMessage".equals(str3);
                        final ki7 ki7Var = new ki7(context, wjbVar, new View[0]);
                        ki7Var.E0(bkb.v0(bkb.Z6, wjbVar));
                        LinearLayout linearLayout2 = new LinearLayout(context);
                        linearLayout2.setOrientation(1);
                        be0 be0Var = new be0(context);
                        be0Var.setRoundRadius(gl.L(38.0f));
                        TLRPC.WebDocument webDocument = tonconnectsession2.manifest.icon;
                        if (webDocument != null) {
                            i = i7;
                            t36Var = t36Var2;
                            z = equals;
                            be0Var.p(gl5.p(usc.c(webDocument)), "76_76", null, tonconnectsession2.manifest);
                        } else {
                            i = i7;
                            t36Var = t36Var2;
                            z = equals;
                        }
                        linearLayout2.addView(be0Var, nme.t(76, 76, 1, 0, 24, 0, 0));
                        TextView v = w25.v(context, k96.V(null, null, z ? 2131742953 : 2131742952, tonconnectsession2.manifest.name), 20, wjbVar);
                        v.setTypeface(gl.o());
                        linearLayout2.addView(v, nme.k(24.0f, 12.0f, 24.0f, 0.0f, -1, -2));
                        String J0 = gl.J0(tonconnectsession2.manifest.url, false);
                        if (!TextUtils.isEmpty(J0)) {
                            linearLayout2.addView(w25.g(context, J0, wjbVar), nme.t(-2, -2, 1, 36, 6, 36, 12));
                        }
                        smc smcVar = new smc(context, R.drawable.wallet_card_info, 24);
                        smcVar.getCardHolderView().setMaxLines(2);
                        smcVar.getCardHolderView().setSingleLine(false);
                        List<u25> list = v25Var.b;
                        long j = v25Var.c;
                        smcVar.setCardHolder(noc.Z(((u25) list.get(0)).a));
                        smcVar.getBalanceView().setText(w25.j(j));
                        smcVar.getUsdBalanceView().setText(C.q(j, false));
                        linearLayout2.addView(smcVar, nme.o(-1, -2));
                        final byte b5 = 0;
                        smcVar.setCardOnClickListener(new View.OnClickListener() { // from class: y15
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                byte b6 = b5;
                                ki7 ki7Var2 = ki7Var;
                                switch (b6) {
                                    case 0:
                                        vq1 vq1Var = ki7Var2.l1;
                                        if (1 < ki7Var2.m1.size() && 1 != vq1Var.getCurrentPosition()) {
                                            for (View view2 : vq1Var.getViewPages()) {
                                                if (view2 != null) {
                                                    gl.t1(view2);
                                                }
                                            }
                                            vq1Var.E(1);
                                            break;
                                        }
                                        break;
                                    default:
                                        vq1 vq1Var2 = ki7Var2.l1;
                                        if (ki7Var2.m1.size() > 0 && vq1Var2.getCurrentPosition() != 0) {
                                            for (View view3 : vq1Var2.getViewPages()) {
                                                if (view3 != null) {
                                                    gl.t1(view3);
                                                }
                                            }
                                            vq1Var2.E(0);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        ji7 ji7Var = new ji7(context);
                        ji7Var.getContent().addView(linearLayout2, nme.c(-2.0f, -1));
                        ki7Var.D0(ji7Var);
                        LinearLayout j2 = de9.j(context, 1);
                        LinearLayout j3 = de9.j(context, 0);
                        j2.addView(j3, nme.o(-1, 56));
                        ImageView imageView = new ImageView(context);
                        imageView.setImageResource(R.drawable.ic_ab_back);
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        int i10 = bkb.h6;
                        ff0 f0 = bkb.f0(bkb.v0(i10, wjbVar), 1, -1);
                        vkb M = zkb.M(i10);
                        imageView.setBackground(f0);
                        zkb.j(imageView, f0, null, M, wjbVar);
                        int i11 = bkb.F6;
                        zkb.s(imageView, i11, wjbVar, PorterDuff.Mode.SRC_IN);
                        ote.a(imageView);
                        j3.addView(imageView, nme.q(48, 48, 0.0f, 19, 4, 0, 0, 0));
                        be0 be0Var2 = new be0(context);
                        be0Var2.setRoundRadius(gl.L(22.0f));
                        TLRPC.WebDocument webDocument2 = tonconnectsession2.manifest.icon;
                        if (webDocument2 != null) {
                            linearLayout = j2;
                            be0Var2.p(gl5.p(usc.c(webDocument2)), "44_44", null, tonconnectsession2.manifest);
                        } else {
                            linearLayout = j2;
                        }
                        j3.addView(be0Var2, nme.t(44, 44, 19, 12, 0, 11, 0));
                        LinearLayout linearLayout3 = new LinearLayout(context);
                        linearLayout3.setOrientation(1);
                        j3.addView(linearLayout3, nme.q(0, 44, 1.0f, 23, 0, 0, 12, 0));
                        TextView textView = new TextView(context);
                        textView.setTypeface(gl.o());
                        zkb.X(textView, i11, wjbVar);
                        textView.setTextSize(1, 18.0f);
                        linearLayout3.addView(textView, nme.o(-1, -2));
                        textView.setText(k96.M0(2131742924, null));
                        if (TextUtils.isEmpty(J0)) {
                            i2 = 1;
                        } else {
                            TextView textView2 = new TextView(context);
                            zkb.X(textView2, bkb.y6, wjbVar);
                            i2 = 1;
                            textView2.setTextSize(1, 14.0f);
                            linearLayout3.addView(textView2, nme.o(-1, -2));
                            textView2.setText(J0);
                        }
                        imageView.setOnClickListener(new View.OnClickListener() { // from class: y15
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                byte b6 = i2;
                                ki7 ki7Var2 = ki7Var;
                                switch (b6) {
                                    case 0:
                                        vq1 vq1Var = ki7Var2.l1;
                                        if (1 < ki7Var2.m1.size() && 1 != vq1Var.getCurrentPosition()) {
                                            for (View view2 : vq1Var.getViewPages()) {
                                                if (view2 != null) {
                                                    gl.t1(view2);
                                                }
                                            }
                                            vq1Var.E(1);
                                            break;
                                        }
                                        break;
                                    default:
                                        vq1 vq1Var2 = ki7Var2.l1;
                                        if (ki7Var2.m1.size() > 0 && vq1Var2.getCurrentPosition() != 0) {
                                            for (View view3 : vq1Var2.getViewPages()) {
                                                if (view3 != null) {
                                                    gl.t1(view3);
                                                }
                                            }
                                            vq1Var2.E(0);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        LinearLayout linearLayout4 = new LinearLayout(context);
                        linearLayout4.setOrientation(i2);
                        LinearLayout F = w25.F(context, k96.M0(2131742788, null), wjbVar);
                        String C2 = w25.C(((u25) list.get(0)).a);
                        SpannableStringBuilder w = c.w(j, i2);
                        if (list.size() > i2) {
                            Integer valueOf = Integer.valueOf(list.size() - i2);
                            Object[] objArr = new Object[2];
                            objArr[0] = C2;
                            objArr[i2] = valueOf;
                            V = k96.V(null, null, 2131742712, objArr);
                        } else {
                            Object[] objArr2 = new Object[i2];
                            objArr2[0] = C2;
                            V = k96.V(null, null, 2131742713, objArr2);
                        }
                        F.addView(w25.b(context, w, V, null, null, wjbVar), nme.o(-1, -2));
                        linearLayout4.addView(F, nme.k(12.0f, 4.0f, 12.0f, 6.0f, -1, -2));
                        LinearLayout F2 = w25.F(context, k96.M0(2131742964, null), wjbVar);
                        for (u25 u25Var : list) {
                            if (u25Var.b == null || u25Var.d != null) {
                                str = null;
                                i3 = 2131742718;
                            } else {
                                i3 = 2131742910;
                                str = null;
                            }
                            F2.addView(w25.b(context, k96.M0(i3, str), k96.V(str, str, 2131742713, w25.C(u25Var.a)), w25.a(-u25Var.e), u25Var.d, wjbVar), nme.o(-1, -2));
                        }
                        linearLayout4.addView(F2, nme.k(12.0f, 6.0f, 12.0f, 12.0f, -1, -2));
                        zh3 zh3Var = new zh3(context, (byte) 2);
                        zh3Var.setFillViewport(false);
                        zh3Var.addView(linearLayout4);
                        LinearLayout linearLayout5 = linearLayout;
                        linearLayout5.addView(zh3Var, nme.o(-1, -2));
                        ji7 ji7Var2 = new ji7(context);
                        ji7Var2.getContent().addView(linearLayout5, nme.c(-2.0f, -1));
                        ki7Var.D0(ji7Var2);
                        LinearLayout j4 = de9.j(context, 1);
                        TextView v2 = w25.v(context, null, 14, wjbVar);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
                        spannableStringBuilder.setSpan(new u86(gl.L(80.0f), v2), 0, spannableStringBuilder.length(), 33);
                        v2.setText(k96.V(null, null, 2131742876, spannableStringBuilder));
                        v2.setVisibility(z ? 8 : 0);
                        zkb.X(v2, bkb.y6, wjbVar);
                        j4.addView(v2, nme.k(20.0f, 16.0f, 20.0f, 16.0f, -1, -2));
                        LinearLayout linearLayout6 = new LinearLayout(context);
                        linearLayout6.setPadding(gl.L(16.0f), 0, gl.L(16.0f), gl.L(16.0f));
                        u41 u41Var = new u41(wjbVar, context, true);
                        u41Var.setRoundRadius(24);
                        u41Var.e();
                        u41Var.setText(k96.M0(2131742900, null));
                        linearLayout6.addView(u41Var, nme.m(1.0f, 0, 44, 0, 6, 0));
                        u41 i12 = yjb.i(24, wjbVar, context, true);
                        i12.setText(k96.M0(z ? 2131742749 : 2131742925, null));
                        i12.setEnabled(false);
                        linearLayout6.addView(i12, nme.m(1.0f, 0, 44, 6, 0, 0));
                        j4.addView(linearLayout6);
                        ki7Var.F0(j4);
                        final byte b6 = 1;
                        final byte b7 = 0;
                        final boolean[] zArr = {false};
                        boolean[] zArr2 = {false};
                        final z15 z15Var = new z15(s25Var, zArr2, i12, u41Var, w25Var, ki7Var, zArr, wjbVar);
                        i12.setOnClickListener(new View.OnClickListener() { // from class: a25
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                byte b8 = b7;
                                z15 z15Var2 = z15Var;
                                switch (b8) {
                                    case 0:
                                        z15Var2.a(Boolean.FALSE);
                                        break;
                                    default:
                                        z15Var2.a(Boolean.TRUE);
                                        break;
                                }
                            }
                        });
                        u41Var.setOnClickListener(new View.OnClickListener() { // from class: a25
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                byte b8 = b6;
                                z15 z15Var2 = z15Var;
                                switch (b8) {
                                    case 0:
                                        z15Var2.a(Boolean.FALSE);
                                        break;
                                    default:
                                        z15Var2.a(Boolean.TRUE);
                                        break;
                                }
                            }
                        });
                        final q25 q25Var = new q25(zArr, s25Var, ki7Var, b6);
                        long j5 = i9;
                        long j6 = v25Var.a;
                        if (j6 == 0) {
                            j6 = Long.MAX_VALUE;
                        }
                        long max = Math.max(0L, Math.min(j5, j6) - ConnectionsManager.getInstance(i).getCurrentTime()) * 1000;
                        s25Var.r = new iu4(ki7Var, (byte) 10);
                        final byte b8 = 0;
                        final t36 t36Var3 = t36Var;
                        ki7Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: b25
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                byte b9 = b8;
                                t36 t36Var4 = t36Var3;
                                s25 s25Var2 = s25Var;
                                w25 w25Var2 = w25Var;
                                Runnable runnable = q25Var;
                                boolean[] zArr3 = zArr;
                                q25 q25Var2 = (q25) runnable;
                                switch (b9) {
                                    case 0:
                                        zArr3[0] = true;
                                        gl.r(q25Var2);
                                        w25Var2.u(s25Var2);
                                        if (t36Var4 != null) {
                                            t36Var4.run();
                                            break;
                                        }
                                        break;
                                    default:
                                        zArr3[0] = true;
                                        gl.r(q25Var2);
                                        w25Var2.u(s25Var2);
                                        if (t36Var4 != null) {
                                            t36Var4.run();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        ki7Var.show();
                        gl.d3(q25Var, max);
                        s62 s62Var = new s62(zArr, s25Var, zArr2, i12, z, C, v2, ki7Var, wjbVar);
                        WalletEngine2 walletEngine2 = w25Var.b.b;
                        if (!s25Var.n && !w25Var.i(s25Var) && w25Var.A(s25Var) && walletEngine2 != null) {
                            if ("signMessage".equals(str3)) {
                                walletEngine2.previewSignMessage(v25Var, new ht(w25Var, s25Var, s62Var, (byte) 20));
                                break;
                            } else {
                                walletEngine2.previewTonConnect(v25Var, new p((Object) w25Var, (Object) s25Var, (Object) s62Var, (byte) 21));
                                break;
                            }
                        } else {
                            s62Var.a(null, "Request expired, was processed, or the wallet changed");
                            break;
                        }
                    } else {
                        final w25 w25Var2 = c.C(i7).g;
                        try {
                            JSONObject jSONObject = new JSONObject(s25Var.k);
                            boolean equals2 = "text".equals(jSONObject.optString(TeXSymbolParser.TYPE_ATTR));
                            ki7 ki7Var2 = new ki7(context, wjbVar, new View[0]);
                            ki7Var2.E0(bkb.v0(bkb.Z6, wjbVar));
                            LinearLayout linearLayout7 = new LinearLayout(context);
                            linearLayout7.setOrientation(1);
                            LinearLayout linearLayout8 = new LinearLayout(context);
                            linearLayout8.setGravity(16);
                            ImageView k = tb4.k(context, R.drawable.ic_ab_close);
                            k.setScaleType(ImageView.ScaleType.CENTER);
                            zkb.s(k, bkb.F6, wjbVar, PorterDuff.Mode.SRC_IN);
                            int i13 = bkb.h6;
                            ff0 f02 = bkb.f0(bkb.v0(i13, wjbVar), 1, -1);
                            vkb M2 = zkb.M(i13);
                            k.setBackground(f02);
                            zkb.j(k, f02, null, M2, wjbVar);
                            k.setContentDescription(k96.M0(2131752029, null));
                            k.setOnClickListener(new xf3((Object) s25Var, (Object) ki7Var2, (byte) 18));
                            linearLayout8.addView(k, nme.q(48, 48, 0.0f, 16, 4, 0, 12, 0));
                            be0 be0Var3 = new be0(context);
                            be0Var3.setRoundRadius(gl.L(22.0f));
                            TLRPC.WebDocument webDocument3 = tonconnectsession2.manifest.icon;
                            if (webDocument3 != null) {
                                be0Var3.p(gl5.p(usc.c(webDocument3)), "44_44", null, tonconnectsession2.manifest);
                            }
                            linearLayout8.addView(be0Var3, nme.q(44, 44, 0.0f, 16, 0, 0, 12, 0));
                            LinearLayout linearLayout9 = new LinearLayout(context);
                            linearLayout9.setOrientation(1);
                            TextView v3 = w25.v(context, k96.M0(2131742748, null), 18, wjbVar);
                            v3.setTypeface(gl.o());
                            v3.setGravity(3);
                            linearLayout9.addView(v3, nme.o(-1, -2));
                            TextView v4 = w25.v(context, gl.J0(tonconnectsession2.manifest.url, false), 14, wjbVar);
                            int i14 = bkb.y6;
                            zkb.X(v4, i14, wjbVar);
                            v4.setGravity(3);
                            v4.setSingleLine(true);
                            v4.setEllipsize(TextUtils.TruncateAt.END);
                            linearLayout9.addView(v4, nme.o(-1, -2));
                            linearLayout8.addView(linearLayout9, nme.m(1.0f, 0, -2, 0, 16, 0));
                            linearLayout7.addView(linearLayout8, nme.o(-1, 56));
                            LinearLayout linearLayout10 = new LinearLayout(context);
                            linearLayout10.setOrientation(1);
                            linearLayout10.setPadding(gl.L(20.0f), gl.L(16.0f), gl.L(20.0f), gl.L(16.0f));
                            int L = gl.L(16.0f);
                            int i15 = bkb.c6;
                            ShapeDrawable b0 = bkb.b0(L, bkb.v0(i15, wjbVar));
                            vkb M3 = zkb.M(i15);
                            linearLayout10.setBackground(b0);
                            zkb.j(linearLayout10, b0, M3, null, wjbVar);
                            if (equals2) {
                                M0 = jSONObject.optString("text");
                                i4 = 14;
                            } else {
                                M0 = k96.M0(2131742940, null);
                                i4 = 16;
                            }
                            TextView v5 = w25.v(context, M0, i4, wjbVar);
                            v5.setGravity(3);
                            v5.setTextIsSelectable(equals2);
                            if (equals2) {
                                TextView v6 = w25.v(context, k96.M0(2131742747, null), 14, wjbVar);
                                v6.setGravity(3);
                                v6.setTypeface(gl.o());
                                zkb.X(v6, bkb.K6, wjbVar);
                                linearLayout10.addView(v6, nme.k(0.0f, 0.0f, 0.0f, 12.0f, -1, -2));
                                v5.setTypeface(Typeface.MONOSPACE);
                                i5 = -1;
                                i6 = -2;
                            } else {
                                LinearLayout linearLayout11 = new LinearLayout(context);
                                linearLayout11.setGravity(16);
                                TextView v7 = w25.v(context, "!", 12, wjbVar);
                                v7.setTypeface(gl.o());
                                v7.setTextColor(-1);
                                int L2 = gl.L(8.0f);
                                int i16 = bkb.p7;
                                ShapeDrawable b02 = bkb.b0(L2, bkb.v0(i16, wjbVar));
                                vkb M4 = zkb.M(i16);
                                v7.setBackground(b02);
                                zkb.j(v7, b02, M4, null, wjbVar);
                                linearLayout11.addView(v7, nme.q(16, 16, 0.0f, 16, 0, 0, 6, 0));
                                TextView v8 = w25.v(context, k96.M0(2131742941, null), 14, wjbVar);
                                v8.setGravity(3);
                                v8.setTypeface(gl.o());
                                i5 = -1;
                                i6 = -2;
                                linearLayout11.addView(v8, nme.o(-1, -2));
                                linearLayout10.addView(linearLayout11, nme.k(0.0f, 0.0f, 0.0f, 4.0f, -1, -2));
                            }
                            linearLayout10.addView(v5, nme.o(i5, i6));
                            if (equals2) {
                                v5.setOnClickListener(new hu4(jSONObject, ki7Var2, wjbVar, (byte) 2));
                            }
                            zh3 zh3Var2 = new zh3(context, (byte) 1);
                            zh3Var2.addView(linearLayout10);
                            linearLayout7.addView(zh3Var2, nme.k(12.0f, 4.0f, 12.0f, 0.0f, -1, -2));
                            ji7 ji7Var3 = new ji7(context);
                            ji7Var3.getContent().addView(linearLayout7, nme.c(-2.0f, -1));
                            ki7Var2.D0(ji7Var3);
                            LinearLayout j7 = de9.j(context, 1);
                            if (equals2) {
                                TextView v9 = w25.v(context, k96.M0(2131742766, null), 14, wjbVar);
                                v9.setGravity(3);
                                zkb.X(v9, i14, wjbVar);
                                j7.addView(v9, nme.k(36.0f, 12.0f, 36.0f, 0.0f, -1, -2));
                            }
                            LinearLayout linearLayout12 = new LinearLayout(context);
                            linearLayout12.setPadding(gl.L(16.0f), gl.L(16.0f), gl.L(16.0f), gl.L(16.0f));
                            u41 u41Var2 = new u41(wjbVar, context, true);
                            u41Var2.setRoundRadius(24);
                            u41Var2.e();
                            u41Var2.setText(k96.M0(2131752577, null));
                            u41 i17 = yjb.i(24, wjbVar, context, true);
                            i17.setText(k96.M0(2131742749, null));
                            i17.setEnabled(false);
                            linearLayout12.addView(u41Var2, nme.m(1.0f, 0, 44, 0, 6, 0));
                            linearLayout12.addView(i17, nme.m(1.0f, 0, 44, 6, 0, 0));
                            j7.addView(linearLayout12);
                            ki7Var2.F0(j7);
                            byte b9 = 1;
                            ki7Var2.z0 = new tt(s25Var, b9);
                            jf4 jf4Var = new jf4((Object) zh3Var2, (Object) s25Var, (Object) i17, (byte) 11);
                            zh3Var2.getViewTreeObserver().addOnScrollChangedListener(new bd(jf4Var, b9));
                            final byte b10 = 0;
                            zh3Var2.getViewTreeObserver().addOnGlobalLayoutListener(new c25(jf4Var, b10));
                            final d25 d25Var = new d25(i17, u41Var2, w25Var2, s25Var, ki7Var2, wjbVar, jf4Var);
                            i17.setOnClickListener(new View.OnClickListener() { // from class: e25
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    byte b11 = b10;
                                    d25 d25Var2 = d25Var;
                                    switch (b11) {
                                        case 0:
                                            d25Var2.a(Boolean.FALSE);
                                            break;
                                        default:
                                            d25Var2.a(Boolean.TRUE);
                                            break;
                                    }
                                }
                            });
                            final byte b11 = 1;
                            u41Var2.setOnClickListener(new View.OnClickListener() { // from class: e25
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    byte b112 = b11;
                                    d25 d25Var2 = d25Var;
                                    switch (b112) {
                                        case 0:
                                            d25Var2.a(Boolean.FALSE);
                                            break;
                                        default:
                                            d25Var2.a(Boolean.TRUE);
                                            break;
                                    }
                                }
                            });
                            final boolean[] zArr3 = {false};
                            final q25 q25Var2 = new q25(zArr3, s25Var, ki7Var2, b10);
                            s25Var.r = new iu4(ki7Var2, (byte) 10);
                            final byte b12 = 1;
                            ki7Var2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: b25
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    byte b92 = b12;
                                    t36 t36Var4 = t36Var2;
                                    s25 s25Var2 = s25Var;
                                    w25 w25Var22 = w25Var2;
                                    Runnable runnable = q25Var2;
                                    boolean[] zArr32 = zArr3;
                                    q25 q25Var22 = (q25) runnable;
                                    switch (b92) {
                                        case 0:
                                            zArr32[0] = true;
                                            gl.r(q25Var22);
                                            w25Var22.u(s25Var2);
                                            if (t36Var4 != null) {
                                                t36Var4.run();
                                                break;
                                            }
                                            break;
                                        default:
                                            zArr32[0] = true;
                                            gl.r(q25Var22);
                                            w25Var22.u(s25Var2);
                                            if (t36Var4 != null) {
                                                t36Var4.run();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            ki7Var2.show();
                            gl.d3(q25Var2, Math.max(0L, i9 - w25Var2.f.getCurrentTime()) * 1000);
                            break;
                        } catch (JSONException e) {
                            w25Var2.u(s25Var);
                            u21.c0(w25.h("display signing data", e));
                            return;
                        }
                    }
                } else if (str2 != null) {
                    u21.c0(str2);
                    break;
                }
                break;
            case 1:
                LaunchActivity launchActivity = (LaunchActivity) obj6;
                c01 c01Var = (c01) obj5;
                na7 na7Var = (na7) obj4;
                TLRPC.User user = (TLRPC.User) obj3;
                TLRPC.User user2 = (TLRPC.User) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                String str4 = LaunchActivity.C1;
                if (c01Var != null) {
                    c01Var.b();
                }
                if (user2 != null) {
                    na7Var.a4(user2, false, false);
                    na7Var.Z2(user2, 0, true, null);
                }
                launchActivity.m0(i7, user.id, tL_error);
                break;
            case 2:
                a46 a46Var = (a46) obj6;
                String str5 = (String) obj5;
                String str6 = (String) obj4;
                String str7 = (String) obj3;
                TL_wallet.tonConnectPending tonconnectpending = (TL_wallet.tonConnectPending) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                LaunchActivity launchActivity2 = a46Var.a;
                a46Var.h = -1;
                if (!a46Var.j && !launchActivity2.isFinishing() && !launchActivity2.isDestroyed()) {
                    if (tL_error2 != null) {
                        a46Var.c();
                        if (a46Var.a()) {
                            a46.d().g0(tL_error2, false);
                            break;
                        }
                    } else {
                        if (tonconnectpending != null && (tonconnectsession = tonconnectpending.session) != null && !tonconnectsession.closed && !tonconnectsession.closing && !tonconnectsession.pending && str5.equals(tonconnectsession.dapp_client_id)) {
                            ArrayList<TL_wallet.tonConnectRequest> arrayList = tonconnectpending.requests;
                            int size = arrayList.size();
                            while (true) {
                                if (i8 < size) {
                                    TL_wallet.tonConnectRequest tonconnectrequest = arrayList.get(i8);
                                    i8++;
                                    TL_wallet.tonConnectRequest tonconnectrequest2 = tonconnectrequest;
                                    if (str6.equals(tonconnectrequest2.trace_id) && tonconnectrequest2.session_id == tonconnectpending.session.id && tonconnectrequest2.expires > ConnectionsManager.getInstance(a46Var.b).getCurrentTime()) {
                                        if (a46Var.a() && (S = LaunchActivity.S()) != null && S.getContext() != null) {
                                            a46Var.c();
                                            w25.q(a46Var.a, a46Var.b, tonconnectrequest2.session_id, tonconnectrequest2.msg_id, S.getResourceProvider(), new t36(a46Var, str7, (byte) 3));
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        int i18 = this.b;
                        if (i18 < 10) {
                            i57 i57Var = new i57((Object) a46Var, (Object) str5, (Object) str6, (Object) str7, i18, (byte) 18);
                            a46Var.i = i57Var;
                            gl.d3(i57Var, 500L);
                            break;
                        } else {
                            a46Var.c();
                            if (a46Var.a()) {
                                u21.c0(k96.M0(2131742730, null));
                                break;
                            }
                        }
                    }
                } else {
                    a46Var.c();
                    break;
                }
                break;
            case 3:
                i8c i8cVar = (i8c) obj4;
                p13 p13Var = (p13) obj3;
                Context context2 = (Context) obj6;
                TL_account.passkeyRegistrationOptions passkeyregistrationoptions = (TL_account.passkeyRegistrationOptions) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                ((hd) obj5).dismiss();
                if (tL_error3 != null) {
                    i8cVar.a(null, tL_error3.text);
                    break;
                } else {
                    try {
                        try {
                            p13Var.c(context2, new a13(new JSONObject(passkeyregistrationoptions.options.data).getJSONObject("publicKey").toString()), new hw7(new wm1(i8cVar, context2, i7, b3)));
                            break;
                        } catch (Exception e2) {
                            fa4.g(e2, true);
                            gl.c3(new d05(i8cVar, e2, (byte) 2));
                            return;
                        }
                    } catch (Exception e3) {
                        fa4.g(e3, true);
                        i8cVar.a(null, e3.getMessage());
                        return;
                    }
                }
            default:
                u41 u41Var3 = (u41) obj6;
                fx0 fx0Var = (fx0) obj5;
                View view = (View) obj4;
                gl2 gl2Var = (gl2) obj3;
                TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                u41Var3.setLoading(false);
                if (!(urlAuthResult instanceof TLRPC.TL_urlAuthResultAccepted)) {
                    FrameLayout frameLayout = fx0Var.F;
                    if (tL_error4 != null) {
                        ug8.u(frameLayout, fx0Var.J0, tL_error4, false);
                        break;
                    } else {
                        new u21(frameLayout, fx0Var.J0).f0("NO_TOKEN", false);
                        break;
                    }
                } else {
                    String queryParameter = Uri.parse("?" + Uri.parse(((TLRPC.TL_urlAuthResultAccepted) urlAuthResult).url).getFragment()).getQueryParameter("tgWebAuthToken");
                    if (queryParameter == null) {
                        new u21(fx0Var.F, fx0Var.J0).f0("NO_TOKEN", false);
                        break;
                    } else {
                        int currentDatacenterId = ConnectionsManager.getInstance(i7).getCurrentDatacenterId();
                        boolean isTestBackend = ConnectionsManager.getInstance(i7).isTestBackend();
                        StringBuilder p = ir2.p("wear-auth: sending /token account=", i7, " dcId=", currentDatacenterId, " isTest=");
                        p.append(isTestBackend);
                        fa4.b(p.toString());
                        Context applicationContext = view.getContext().getApplicationContext();
                        try {
                            byte[] a = xrc.a(gl2Var, queryParameter, currentDatacenterId, isTestBackend);
                            u84 u84Var = new u84(applicationContext, ay4.c);
                            String str8 = (String) gl2Var.e;
                            x1d x1dVar = u84Var.i;
                            q0e q0eVar = new q0e(x1dVar, str8, "/tg-wear-auth/token", a);
                            x1dVar.b.d(0, q0eVar);
                            wbd.a(q0eVar, pd5.f).addOnSuccessListener(new cwb(gl2Var, u41Var3, b2)).addOnFailureListener(new vrc(u41Var3, b4));
                            fx0Var.dismiss();
                            break;
                        } catch (Exception e4) {
                            fa4.g(e4, true);
                            new u21(fx0Var.F, fx0Var.J0).f0(e4.getMessage(), false);
                            return;
                        }
                    }
                }
        }
    }

    public /* synthetic */ u15(u41 u41Var, fx0 fx0Var, int i, View view, gl2 gl2Var) {
        this.c = u41Var;
        this.d = fx0Var;
        this.b = i;
        this.e = view;
        this.f = gl2Var;
    }

    public /* synthetic */ u15(a46 a46Var, String str, String str2, String str3, int i) {
        this.c = a46Var;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.b = i;
    }

    public /* synthetic */ u15(Context context, int i, c cVar, wjb wjbVar, t36 t36Var) {
        this.c = context;
        this.b = i;
        this.d = cVar;
        this.e = wjbVar;
        this.f = t36Var;
    }

    public /* synthetic */ u15(LaunchActivity launchActivity, c01 c01Var, na7 na7Var, int i, TLRPC.User user) {
        this.c = launchActivity;
        this.d = c01Var;
        this.e = na7Var;
        this.b = i;
        this.f = user;
    }
}
