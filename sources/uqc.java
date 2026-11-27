// default package

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.net.Uri;
import android.os.Build;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.Wallet.b;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class uqc extends n9c implements fn7 {
    public static Typeface Y0;
    public float A0;
    public float B0;
    public oob C0;
    public float D0;
    public View E;
    public c51 E0;
    public iy9 F;
    public c51 F0;
    public boolean G;
    public b G0;
    public x25 H0;
    public boolean I0;
    public View K0;
    public float L0;
    public float M0;
    public ValueAnimator N0;
    public sla P0;
    public jz8 Q0;
    public int R0;
    public spc S;
    public fqc T;
    public FrameLayout U;
    public SpannableString U0;
    public TextView V;
    public boolean V0;
    public FrameLayout W;
    public boolean W0;
    public TextView X;
    public hl3 X0;
    public FrameLayout Y;
    public TextView Z;
    public p66 a0;
    public gqc b0;
    public boolean c0;
    public FrameLayout d0;
    public iqc e;
    public FrameLayout e0;
    public gqc f;
    public boolean g0;
    public int h;
    public uic h0;
    public FrameLayout i0;
    public ltc j0;
    public wsc k0;
    public float m0;
    public jqc n;
    public ValueAnimator n0;
    public spc o0;
    public int p0;
    public boolean q0;
    public int r;
    public boolean r0;
    public boolean s;
    public ir1 s0;
    public qqc t0;
    public LinearLayout v0;
    public in w0;
    public in x0;
    public FrameLayout y;
    public drc y0;
    public lqc z0;
    public final bva w = new bva((Object) this, (byte) 14);
    public final gt3 x = new gt3(this, 3);
    public final Rect H = new Rect();
    public final Matrix I = new Matrix();
    public final Matrix J = new Matrix();
    public final Matrix K = new Matrix();
    public final float[] L = new float[8];
    public final float[] M = new float[8];
    public final float[] N = new float[8];
    public final int[] O = new int[2];
    public final int[] P = new int[2];
    public final int[] Q = new int[2];
    public final int[] R = new int[2];
    public int f0 = 0;
    public String l0 = "";
    public final q9c[] u0 = new q9c[2];
    public final cpc J0 = new cpc(this, 0);
    public final cpc O0 = new cpc(this, 1);
    public final CharSequence[] S0 = new CharSequence[2];
    public final HashSet T0 = new HashSet();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [vic, vpc] */
    public static void I0(Context context, int i, TL_wallet.walletTransaction wallettransaction, kcc kccVar, icc iccVar, byte[] bArr, wk1 wk1Var, vnb vnbVar) {
        TL_wallet.nftItem nftitem;
        jl7[] jl7VarArr;
        View[] viewArr;
        icc iccVar2;
        LinearLayout j0;
        if (context == null) {
            return;
        }
        TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction.peer;
        if (((walletTransactionPeer instanceof TL_wallet.walletTransactionPeerTelegramGift) || (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerOnchainGift)) && (nftitem = wallettransaction.nft) != null) {
            TL_stars.StarGift starGift = nftitem.gift;
            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                wua wuaVar = new wua(context, i, 0L, vnbVar, null);
                wuaVar.d3 = wallettransaction;
                jt7 c = jt7.c(wallettransaction);
                wuaVar.a2.setStatusPill(c != null ? c.e() : null);
                wuaVar.n2(tL_starGiftUnique.slug, tL_starGiftUnique, null);
                wuaVar.show();
                return;
            }
        }
        jl7[] jl7VarArr2 = new jl7[1];
        View[] viewArr2 = new View[1];
        b G = c.C(i).G();
        ArrayList arrayList = new ArrayList(G.c);
        int i2 = 0;
        while (true) {
            if (i2 >= arrayList.size()) {
                i2 = -1;
                break;
            } else if (arrayList.get(i2) == wallettransaction || c.w0(wallettransaction, (TL_wallet.walletTransaction) arrayList.get(i2))) {
                break;
            } else {
                i2++;
            }
        }
        if (kccVar == null && wk1Var == null && i2 >= 0) {
            Rect rect = new Rect();
            context.getResources().getDrawable(R.drawable.sheet_shadow_round).getPadding(rect);
            viewArr = viewArr2;
            ?? vpcVar = new vpc(context, vnbVar, arrayList, G, i, rect, viewArr);
            vpcVar.setPosition(i2);
            jl7VarArr = jl7VarArr2;
            vpcVar.setAdapter(new wpc(arrayList, context, vnbVar, rect, i, jl7VarArr2));
            iccVar2 = iccVar;
            j0 = vpcVar;
        } else {
            jl7VarArr = jl7VarArr2;
            viewArr = viewArr2;
            iccVar2 = iccVar;
            j0 = j0(context, i, wallettransaction, kccVar, iccVar, bArr, wk1Var, vnbVar, jl7VarArr, false);
        }
        jl7[] jl7VarArr3 = jl7VarArr;
        xpc xpcVar = new xpc(context, j0, vnbVar, j0, viewArr, context);
        jl7VarArr3[0] = xpcVar;
        if ((j0 instanceof vic) && iccVar2 != null) {
            xpcVar.n(new vlc(iccVar2, wallettransaction, (byte) 9));
        }
        jl7VarArr3[0].w0(kccVar != null);
        jl7 jl7Var = jl7VarArr3[0];
        jl7Var.T0 = false;
        jl7Var.show();
    }

    public static void K0(Context context, vnb vnbVar) {
        nx0 h = uh9.h(1, vnbVar, context, false);
        FrameLayout frameLayout = new FrameLayout(context);
        int L = hl.L(16.0f);
        int i = aob.h5;
        Drawable b0 = aob.b0(L, aob.v0(i, vnbVar));
        uob M = yob.M(i);
        frameLayout.setBackground(b0);
        yob.j(frameLayout, b0, M, null, vnbVar);
        frameLayout.setPadding(hl.L(36.0f), 0, hl.L(36.0f), hl.L(14.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        frameLayout.addView(linearLayout, tre.c(-2.0f, -1));
        linearLayout.addView(new yrc(jn7.p2, context, false), tre.t(jn7.p2, jn7.p2, 1, 0, -12, 0, -8));
        TextView textView = new TextView(context);
        textView.setText(ob6.M0(2131742747, null));
        yob.X(textView, aob.j5, vnbVar);
        textView.setTextSize(1, 17.0f);
        textView.setTypeface(hl.n1("fonts/rmedium.ttf"));
        textView.setGravity(17);
        TextView m = ik8.m(linearLayout, textView, tre.t(-1, -2, 1, 0, 0, 0, 6), context);
        m.setText(ob6.M0(2131742746, null));
        int i2 = aob.z6;
        yob.X(m, i2, vnbVar);
        m.setTextSize(1, 14.0f);
        m.setGravity(17);
        m.setLineSpacing(hl.L(1.0f), 1.0f);
        linearLayout.addView(m, tre.t(-1, -2, 1, 0, 0, 0, 24));
        nqc nqcVar = new nqc(context, vnbVar);
        nqcVar.setPadding(hl.L(0.0f), hl.L(8.0f), hl.L(0.0f), hl.L(8.0f));
        nqcVar.a(R.drawable.wallet_learn_instant, ob6.M0(2131742650, null), ob6.M0(2131742649, null));
        linearLayout.addView(nqcVar, tre.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        nqc nqcVar2 = new nqc(context, vnbVar);
        nqcVar2.setPadding(hl.L(0.0f), hl.L(8.0f), hl.L(0.0f), hl.L(8.0f));
        nqcVar2.a(R.drawable.wallet_learn_fees, ob6.M0(2131742718, null), ob6.M0(2131742717, null));
        linearLayout.addView(nqcVar2, tre.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        nqc nqcVar3 = new nqc(context, vnbVar);
        nqcVar3.setPadding(hl.L(0.0f), hl.L(8.0f), hl.L(0.0f), hl.L(8.0f));
        nqcVar3.a(R.drawable.wallet_learn_verified, ob6.M0(2131742833, null), ob6.M0(2131742832, null));
        linearLayout.addView(nqcVar3, tre.k(0.0f, 0.0f, 0.0f, 14.0f, -1, -2));
        c51 i3 = xnb.i(24, vnbVar, context, true);
        i3.setText(ob6.M0(2131742751, null));
        linearLayout.addView(i3, tre.t(-1, 48, 1, 0, 0, 0, 0));
        iye.b(i3, 0.02f, 1.1f);
        p66 p66Var = new p66(context, null);
        yob.X(p66Var, i2, vnbVar);
        p66Var.setTextSize(1, 13.0f);
        p66Var.setGravity(17);
        p66Var.setText(U0(ob6.M0(2131742637, null), aob.Xc, vnbVar, new xf1(context, (byte) 25)));
        linearLayout.addView(p66Var, tre.k(0.0f, 12.0f, 0.0f, 6.0f, -1, -2));
        h.O = frameLayout;
        nx0[] nx0VarArr = {h};
        nx0VarArr[0].r0(true);
        nx0VarArr[0].J();
        i3.setOnClickListener(new g5(nx0VarArr, (byte) 9));
        nx0VarArr[0].show();
    }

    public static void L0(int i, vnb vnbVar, Context context) {
        c C = c.C(i);
        if (C.M()) {
            String x = C.x();
            if (TextUtils.isEmpty(x)) {
                return;
            }
            M0(context, i, x, true, null, vnbVar);
        }
    }

    public static void M0(Context context, final int i, String str, final boolean z, final sa8 sa8Var, final vnb vnbVar) {
        final nx0 nx0Var = new nx0(1, vnbVar, context, false);
        nx0Var.s0(-12207881);
        nx0Var.K(-12207881);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackground(new tqc());
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        frameLayout.addView(linearLayout, tre.f(-2.0f, -1, 55, hl.L(12.0f), hl.L(30.0f), hl.L(12.0f), hl.L(12.0f) + hl.n));
        sqc sqcVar = new sqc(context, str);
        if (!z) {
            sqcVar.b.setText(ob6.M0(2131746227, null));
        }
        linearLayout.addView(sqcVar, tre.r(jn7.K4, jn7.Y4, 1));
        TextView textView = new TextView(context);
        textView.setText(ob6.M0(2131742672, null));
        textView.setTextColor(-1);
        textView.setTextSize(1, 14.0f);
        textView.setGravity(17);
        textView.setLineSpacing(hl.L(1.0f), 1.0f);
        linearLayout.addView(textView, tre.t(-1, -2, 1, 24, 0, 24, 20));
        final c51 c51Var = new c51(null, context, true);
        c51Var.setRoundRadius(24);
        c51Var.setColor(-1);
        c51Var.setTextColor(-15556886);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z) {
            spannableStringBuilder.append((CharSequence) "$");
            spannableStringBuilder.setSpan(new wm2(R.drawable.wallet_buy, 0), 0, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) ob6.M0(2131742831, null));
        } else {
            wm2 wm2Var = new wm2(R.drawable.mini_gram_24, 0);
            wm2Var.c(hl.L(20.0f));
            spannableStringBuilder.append((CharSequence) "G");
            spannableStringBuilder.setSpan(wm2Var, 0, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) ob6.M0(2131742648, null));
        }
        c51Var.setText(spannableStringBuilder);
        linearLayout.addView(c51Var, tre.t(-1, 48, 1, 0, 0, 0, 0));
        byte b = 8;
        if (!z) {
            textView.setVisibility(8);
            c51Var.setVisibility(sa8Var != null ? 0 : 8);
        }
        View k = qd4.k(context, R.drawable.ic_close_white);
        k.setPadding(hl.L(12.0f), hl.L(12.0f), hl.L(12.0f), hl.L(12.0f));
        k.setContentDescription(ob6.M0(2131752006, null));
        iye.a(k);
        frameLayout.addView(k, tre.d(48, 48.0f, 51, 4.0f, 2.0f, 0.0f, 0.0f));
        nx0Var.O = frameLayout;
        nx0Var.x = true;
        nx0Var.v0 = false;
        nx0Var.w0 = false;
        nx0Var.K(-12207881);
        k.setOnClickListener(new rg(nx0Var, (byte) 7));
        sqcVar.f = new qu2(str, b);
        nx0Var.show();
        nx0Var.y0(-12207881);
        hl.o3(nx0Var, -12207881, false, null);
        hl.i3(nx0Var, false);
        if (Build.VERSION.SDK_INT >= 29 && nx0Var.getWindow() != null) {
            nx0Var.getWindow().setNavigationBarContrastEnforced(false);
        }
        c51Var.setOnClickListener(new View.OnClickListener() { // from class: dpc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean z2 = z;
                nx0 nx0Var2 = nx0Var;
                if (!z2) {
                    nx0Var2.dismiss();
                    sa8Var.run();
                    return;
                }
                c51 c51Var2 = c51Var;
                if (c51Var2.R) {
                    return;
                }
                c51Var2.setLoading(true);
                gpc gpcVar = new gpc(c51Var2, nx0Var2, vnbVar, (byte) 0);
                int i2 = i;
                c C = c.C(i2);
                C.A0(new mpc(i2, (Object) gpcVar, (Object) C, (byte) 0));
            }
        });
    }

    public static SpannableStringBuilder U0(String str, int i, vnb vnbVar, Runnable runnable) {
        int i2;
        int i3;
        int indexOf = str.indexOf("**");
        int indexOf2 = str.indexOf("**", indexOf + 1);
        String replace = str.replace("**", "");
        if (indexOf < 0 || indexOf2 < 0 || (i3 = indexOf2 - indexOf) <= 2) {
            indexOf = -1;
            i2 = 0;
        } else {
            i2 = i3 - 2;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(replace);
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new hg1(i, vnbVar, runnable), indexOf, i2 + indexOf, 0);
        }
        return spannableStringBuilder;
    }

    public static void c1(q9c q9cVar, boolean z) {
        boolean canScrollVertically = q9cVar.canScrollVertically(-1);
        q9cVar.g3.O(z);
        q9cVar.c0();
        if (canScrollVertically) {
            return;
        }
        q9cVar.f3.g1(0, 0);
    }

    public static Uri h1(String str) {
        Uri parse = Uri.parse(str.trim());
        if (parse.getScheme() == null) {
            Uri parse2 = Uri.parse("https://" + str.trim());
            if (w0(parse2.getHost())) {
                return parse2;
            }
        }
        return parse;
    }

    public static String i1(Uri uri) {
        if (!w0(uri.getHost())) {
            return null;
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() != 1) {
            return null;
        }
        String str = pathSegments.get(0);
        if ("sendgrams".equalsIgnoreCase(str) || !str.matches("[a-zA-Z][a-zA-Z0-9_]{3,31}")) {
            return null;
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x03d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0633  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x067f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x061a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0549  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static LinearLayout j0(final Context context, int i, TL_wallet.walletTransaction wallettransaction, kcc kccVar, icc iccVar, byte[] bArr, wk1 wk1Var, vnb vnbVar, jl7[] jl7VarArr, boolean z) {
        String x;
        String str;
        ypc ypcVar;
        TextView textView;
        ImageView imageView;
        ImageView imageView2;
        float f;
        int i2;
        ImageView imageView3;
        hjb hjbVar;
        SpannableString[] spannableStringArr;
        LinearLayout linearLayout;
        final String[] strArr;
        TextView[] textViewArr;
        boolean[] zArr;
        TL_wallet.walletTransaction wallettransaction2;
        zpc zpcVar;
        int i3;
        bqc bqcVar;
        final jl7[] jl7VarArr2;
        char c;
        Object w;
        int i4;
        final FrameLayout frameLayout;
        float f2;
        final vnb vnbVar2 = vnbVar;
        boolean z2 = kccVar != null;
        final LinearLayout j = uh9.j(context, 1);
        FrameLayout frameLayout2 = new FrameLayout(context);
        j.addView(frameLayout2, tre.o(-1, 56));
        int i5 = aob.G6;
        aob.v0(i5, vnbVar2);
        int i6 = aob.i6;
        int v0 = aob.v0(i6, vnbVar2);
        ImageView imageView4 = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(R.drawable.ic_ab_close);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        yob.s(imageView4, i5, vnbVar2, mode);
        hf0 f0 = aob.f0(v0, 1, -1);
        uob M = yob.M(i6);
        imageView4.setBackground(f0);
        yob.j(imageView4, f0, null, M, vnbVar2);
        imageView4.setContentDescription(ob6.M0(2131752006, null));
        frameLayout2.addView(imageView4, tre.d(48, 48.0f, 19, 4.0f, -2.0f, 0.0f, 0.0f));
        ImageView imageView5 = new ImageView(context);
        imageView5.setScaleType(scaleType);
        imageView5.setImageResource(R.drawable.ic_ab_other);
        yob.s(imageView5, i5, vnbVar2, mode);
        hf0 f02 = aob.f0(v0, 1, -1);
        uob M2 = yob.M(i6);
        imageView5.setBackground(f02);
        yob.j(imageView5, f02, null, M2, vnbVar2);
        imageView5.setContentDescription(ob6.M0(2131754834, null));
        imageView5.setVisibility(kccVar != null ? 8 : 0);
        frameLayout2.addView(imageView5, tre.d(44, 48.0f, 21, 0.0f, 2.0f, 4.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(1);
        j.addView(linearLayout2, tre.k(14.0f, wallettransaction.key_change ? -20.0f : -40.0f, 14.0f, 24.0f, -1, -2));
        View yrcVar = new yrc(jn7.E1, context, z);
        yrcVar.setTag(yrc.class);
        linearLayout2.addView(yrcVar, tre.t(jn7.E1, jn7.E1, 1, 0, 0, 0, -8));
        ypc ypcVar2 = new ypc(context);
        ypcVar2.setSingleLine(true);
        ypcVar2.setGravity(17);
        ypcVar2.setIncludeFontPadding(false);
        ypcVar2.setTextSize(1, 40.0f);
        ypcVar2.setTypeface(hl.o());
        linearLayout2.addView(ypcVar2, tre.r(-1, 50, 1));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setIncludeFontPadding(false);
        textView2.setTextSize(1, 14.0f);
        int i7 = aob.z6;
        yob.X(textView2, i7, vnbVar2);
        linearLayout2.addView(textView2, tre.t(-1, 20, 1, 0, 3, 0, 0));
        if (wallettransaction.key_change) {
            linearLayout2.removeAllViews();
            FrameLayout frameLayout3 = new FrameLayout(context);
            frameLayout3.setBackground(aob.L(hl.L(76.0f), -7956054, -9534569));
            ImageView imageView6 = new ImageView(context);
            imageView6.setImageResource(R.drawable.wallet_transaction_key);
            imageView6.setScaleType(ImageView.ScaleType.FIT_CENTER);
            frameLayout3.addView(imageView6, tre.e(44, 44, 17));
            linearLayout2.addView(frameLayout3, tre.r(76, 76, 1));
            TextView textView3 = new TextView(context);
            textView3.setText(ob6.M0(2131742731, null));
            qd4.w(textView3, i5, vnbVar2, 1, 18.0f);
            textView3.setGravity(17);
            textView3.setIncludeFontPadding(false);
            linearLayout2.addView(textView3, tre.t(-1, 24, 1, 12, 12, 12, 0));
        } else if (wallettransaction.nft != null) {
            linearLayout2.removeAllViews();
            TL_wallet.nftItem nftitem = wallettransaction.nft;
            de0 de0Var = new de0(context);
            de0Var.setRoundRadius(hl.L(12.0f));
            de0Var.setContentDescription(nftitem.name);
            Drawable mutate = context.getResources().getDrawable(R.drawable.wallet_nft_placeholder).mutate();
            yob.x(de0Var, mutate, i7, vnbVar2, mode);
            jn5 c2 = pl2.c(nftitem, false);
            if (c2 != null) {
                de0Var.m(c2, "120_120", mutate, nftitem);
            } else {
                de0Var.setImageDrawable(mutate);
            }
            linearLayout2.addView(de0Var, tre.r(jn7.E1, jn7.E1, 1));
            TextView textView4 = new TextView(context);
            textView4.setText(TextUtils.isEmpty(nftitem.name) ? ob6.M0(2131742827, null) : nftitem.name);
            qd4.w(textView4, i5, vnbVar2, 1, 17.0f);
            textView4.setGravity(17);
            linearLayout2.addView(textView4, tre.k(12.0f, 16.0f, 12.0f, 0.0f, -1, -2));
        }
        if (wallettransaction.incoming) {
            TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction.peer;
            if (walletTransactionPeer == null) {
                str = null;
                if (kccVar != null) {
                    float f3 = 15.0f;
                    if (wallettransaction.comment_encrypted || wallettransaction.comment_encrypted_preparing) {
                        f = 11.0f;
                        if (wallettransaction.comment_encrypted_preparing || !TextUtils.isEmpty(str)) {
                            tpa tpaVar = new tpa(vnbVar2, context, false);
                            tpaVar.r = false;
                            tpaVar.setTextSize(1, 15.0f);
                            yob.X(tpaVar, i5, vnbVar2);
                            StringBuilder sb = new StringBuilder(25);
                            int i8 = 0;
                            while (true) {
                                f2 = f3;
                                if (i8 >= 25) {
                                    break;
                                }
                                sb.append("a");
                                i8++;
                                f3 = f2;
                            }
                            SpannableString spannableString = new SpannableString(sb.toString());
                            rmb rmbVar = new rmb();
                            rmbVar.a |= 256;
                            spannableString.setSpan(new smb(rmbVar, 0), 0, spannableString.length(), 33);
                            tpaVar.setText(spannableString);
                            t37 t37Var = new t37(0, false, false, null);
                            t37Var.x = false;
                            t37Var.w = Integer.valueOf(aob.v0(aob.am, vnbVar2));
                            tpaVar.setBackground(t37Var);
                            tpaVar.setPadding(hl.L(19.0f), hl.L(6.0f), hl.L(f2), hl.L(11.0f));
                            linearLayout2.addView(tpaVar, tre.t(-2, -2, 1, 32, 15, 32, 0));
                            iye.a(tpaVar);
                            i2 = 1;
                            textView = textView2;
                            ypcVar = ypcVar2;
                            imageView = imageView4;
                            imageView2 = imageView5;
                            tpaVar.setOnClickListener(new l63(new boolean[]{false}, jl7VarArr, vnbVar2, tpaVar, wallettransaction, i, str));
                            SpannableString[] spannableStringArr2 = new SpannableString[i2];
                            TextView[] textViewArr2 = new TextView[i2];
                            hjb hjbVar2 = new hjb(context, vnbVar2);
                            j.addView(hjbVar2, tre.k(14.0f, 0.0f, 14.0f, 0.0f, -1, -2));
                            String[] strArr2 = {wallettransaction.comment};
                            final boolean[] zArr2 = {(wallettransaction.comment_encrypted || (z2 && bArr == null)) ? false : true};
                            if (kccVar != null) {
                                FrameLayout frameLayout4 = new FrameLayout(context);
                                int L = hl.L(22.0f);
                                int L2 = hl.L(22.0f);
                                int i9 = aob.a7;
                                ShapeDrawable c0 = aob.c0(L, L2, aob.v0(i9, vnbVar2));
                                uob M3 = yob.M(i9);
                                frameLayout4.setBackground(c0);
                                yob.j(frameLayout4, c0, M3, null, vnbVar2);
                                final vlc vlcVar = new vlc(textViewArr2, spannableStringArr2, (byte) 10);
                                final Runnable[] runnableArr = new Runnable[1];
                                ImageView imageView7 = imageView;
                                final a84 a84Var = new a84(runnableArr, textViewArr2, i, vnbVar2, wallettransaction, strArr2, zArr2, bArr);
                                hjbVar = hjbVar2;
                                textViewArr = textViewArr2;
                                wallettransaction2 = wallettransaction;
                                zpc zpcVar2 = new zpc(context, vnbVar2);
                                zpcVar2.setHint(ob6.M0(2131742690, null));
                                zpcVar2.setText(strArr2[0]);
                                zpcVar2.setPadding(hl.L(16.0f), hl.L(f), hl.L(64.0f), hl.L(12.0f));
                                int i10 = aob.G6;
                                yob.X(zpcVar2, i10, vnbVar2);
                                uob K = yob.K(0.65f, i10);
                                spannableStringArr = spannableStringArr2;
                                yob.n(zpcVar2, 1, K.a, -1, 2, K.d, vnbVar);
                                zpcVar2.setMaxLines(4);
                                frameLayout4.addView(zpcVar2, tre.d(-1, -2.0f, jn7.D1, 0.0f, 0.0f, (wallettransaction2.nft != null || bArr == null) ? 0.0f : 44.0f, 0.0f));
                                zpcVar2.addTextChangedListener(new aqc(strArr2, vlcVar, runnableArr, a84Var));
                                if (wallettransaction2.nft != null || bArr == null) {
                                    frameLayout = frameLayout4;
                                    vnbVar2 = vnbVar;
                                    zArr = zArr2;
                                    strArr = strArr2;
                                    linearLayout = j;
                                    zpcVar = zpcVar2;
                                    imageView3 = imageView7;
                                } else {
                                    FrameLayout frameLayout5 = new FrameLayout(context);
                                    iye.a(frameLayout5);
                                    final ImageView imageView8 = new ImageView(context);
                                    frameLayout5.addView(imageView8, tre.c(-1.0f, -1));
                                    imageView8.setScaleType(ImageView.ScaleType.CENTER);
                                    yob.s(imageView8, zArr2[0] ? aob.Fi : aob.z6, vnbVar, PorterDuff.Mode.SRC_IN);
                                    imageView8.setImageResource(zArr2[0] ? R.drawable.wallet_comment_locked : R.drawable.wallet_comment_unlocked);
                                    int i11 = aob.i6;
                                    strArr = strArr2;
                                    hf0 f03 = aob.f0(aob.v0(i11, vnbVar), 1, -1);
                                    uob M4 = yob.M(i11);
                                    imageView8.setBackground(f03);
                                    yob.j(imageView8, f03, null, M4, vnbVar);
                                    final kg5[] kg5VarArr = new kg5[1];
                                    frameLayout = frameLayout4;
                                    vnbVar2 = vnbVar;
                                    zpcVar = zpcVar2;
                                    imageView3 = imageView7;
                                    zArr = zArr2;
                                    linearLayout = j;
                                    frameLayout5.setOnClickListener(new View.OnClickListener() { // from class: lpc
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            boolean[] zArr3 = zArr2;
                                            zArr3[0] = !zArr3[0];
                                            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                                            duration.addUpdateListener(new p81(imageView8, new AtomicBoolean(), zArr3, vnbVar2, (byte) 1));
                                            duration.setInterpolator(k43.h);
                                            duration.setDuration(420L);
                                            duration.start();
                                            kg5[] kg5VarArr2 = kg5VarArr;
                                            kg5 kg5Var = kg5VarArr2[0];
                                            if (kg5Var != null) {
                                                kg5Var.f(true);
                                                kg5VarArr2[0] = null;
                                            }
                                            LinearLayout linearLayout3 = j;
                                            if (linearLayout3.getParent() instanceof FrameLayout) {
                                                FrameLayout frameLayout6 = (FrameLayout) linearLayout3.getParent();
                                                kg5 kg5Var2 = new kg5(context, 3);
                                                kg5VarArr2[0] = kg5Var2;
                                                kg5Var2.r();
                                                kg5Var2.setPadding(hl.L(10.0f), 0, hl.L(10.0f), 0);
                                                kg5Var2.t(ob6.M0(zArr3[0] ? 2131742678 : 2131742673, null));
                                                kg5Var2.setTranslationY(-(hl.L(44.0f) + (linearLayout3.getHeight() - frameLayout.getBottom())));
                                                kg5Var2.o(1.0f, -hl.L(26.0f));
                                                kg5Var2.q(20.0f);
                                                kg5Var2.s(hl.L(12.0f), hl.L(4.0f), aob.p1(0.25f, -16777216));
                                                frameLayout6.addView(kg5Var2, tre.e(-1, jn7.d3, 87));
                                                kg5Var2.v();
                                                kg5Var2.r0 = new ug(kg5Var2, (byte) 10);
                                            }
                                            if (TextUtils.isEmpty(strArr[0])) {
                                                return;
                                            }
                                            vlcVar.run();
                                            Runnable[] runnableArr2 = runnableArr;
                                            Runnable runnable = runnableArr2[0];
                                            if (runnable != null) {
                                                runnable.run();
                                                runnableArr2[0] = null;
                                            }
                                            a84 a84Var2 = a84Var;
                                            hl.r(a84Var2);
                                            hl.d3(a84Var2, 1000L);
                                        }
                                    });
                                    frameLayout.addView(frameLayout5, tre.e(44, 44, 85));
                                }
                                linearLayout.addView(frameLayout, tre.k(14.0f, 12.0f, 14.0f, 8.0f, -1, -2));
                            } else {
                                imageView3 = imageView;
                                hjbVar = hjbVar2;
                                spannableStringArr = spannableStringArr2;
                                linearLayout = j;
                                strArr = strArr2;
                                textViewArr = textViewArr2;
                                zArr = zArr2;
                                wallettransaction2 = wallettransaction;
                                zpcVar = null;
                            }
                            c51 i12 = xnb.i(24, vnbVar2, context, true);
                            i12.setText(ob6.M0(2131747558, null));
                            linearLayout.addView(i12, tre.k(14.0f, 14.0f, 14.0f, 14.0f, -1, 48));
                            TL_wallet.walletTransaction[] wallettransactionArr = {wallettransaction2};
                            cg5 cg5Var = new cg5(linearLayout, ypcVar, vnbVar2, i, textView, jl7VarArr, hjbVar, kccVar, context, textViewArr, spannableStringArr);
                            LinearLayout linearLayout3 = linearLayout;
                            linearLayout3.setTag(new vlc(cg5Var, wallettransactionArr, (byte) 11));
                            cg5Var.a(wallettransaction2);
                            if (z2) {
                                i3 = i;
                                bqcVar = null;
                            } else {
                                i3 = i;
                                bqc bqcVar2 = new bqc(i3, wallettransactionArr, cg5Var);
                                if (wallettransaction2.preview) {
                                    c C = c.C(i3);
                                    String str2 = wallettransaction2.id;
                                    v58 v58Var = new v58((Object) wallettransaction2, (Object) cg5Var, (Object) wallettransactionArr, (byte) 12);
                                    HashMap hashMap = C.N;
                                    b bVar = C.n;
                                    if (bVar != null) {
                                        ArrayList arrayList = bVar.c;
                                        int size = arrayList.size();
                                        int i13 = 0;
                                        while (i13 < size) {
                                            Object obj = arrayList.get(i13);
                                            i13++;
                                            TL_wallet.walletTransaction wallettransaction3 = (TL_wallet.walletTransaction) obj;
                                            if (TextUtils.equals(wallettransaction3.id, str2)) {
                                                v58Var.a(wallettransaction3);
                                                break;
                                            }
                                        }
                                    }
                                    if (hashMap.get(str2) != null) {
                                        v58Var.a((TL_wallet.walletTransaction) hashMap.get(str2));
                                    } else {
                                        TL_wallet.getTransactionsByIDs gettransactionsbyids = new TL_wallet.getTransactionsByIDs();
                                        gettransactionsbyids.id.add(str2);
                                        ConnectionsManager.getInstance(C.a).sendRequestTyped(gettransactionsbyids, new ic((byte) 0), new p((Object) C, (Object) v58Var, (Object) str2, (byte) 15));
                                    }
                                }
                                bqcVar = bqcVar2;
                            }
                            boolean[] zArr3 = zArr;
                            String[] strArr3 = strArr;
                            linearLayout3.addOnAttachStateChangeListener(new cqc(cg5Var, wallettransactionArr, bqcVar, i3, iccVar, jl7VarArr, strArr3, zArr3));
                            if (kccVar != null) {
                                TL_wallet.nftItem nftitem2 = wallettransaction2.nft;
                                if (nftitem2 != null) {
                                    w = TextUtils.isEmpty(nftitem2.name) ? ob6.M0(2131742827, null) : wallettransaction2.nft.name;
                                    i4 = 1;
                                    c = 0;
                                } else {
                                    long abs = Math.abs(wallettransaction2.amount);
                                    c = 0;
                                    w = c.w(abs, false);
                                    i4 = 1;
                                }
                                Object[] objArr = new Object[i4];
                                objArr[c] = w;
                                i12.setText(ob6.V(null, null, 2131742652, objArr));
                                jl7VarArr2 = jl7VarArr;
                                i12.setOnClickListener(new b65(i12, zpcVar, kccVar, strArr3, zArr3, jl7VarArr2, vnbVar, (byte) 2));
                            } else {
                                jl7VarArr2 = jl7VarArr;
                                if (wk1Var != null) {
                                    i12.setText(ob6.M0(2131742691, null));
                                    i12.setOnClickListener(new jjb((Object) wk1Var, (Object) jl7VarArr2, (byte) 17));
                                } else {
                                    final byte b = 0;
                                    i12.setOnClickListener(new View.OnClickListener() { // from class: kpc
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            byte b2 = b;
                                            jl7[] jl7VarArr3 = jl7VarArr2;
                                            switch (b2) {
                                                case 0:
                                                    jl7VarArr3[0].dismiss();
                                                    break;
                                                default:
                                                    jl7VarArr3[0].dismiss();
                                                    break;
                                            }
                                        }
                                    });
                                }
                            }
                            final byte b2 = 1;
                            imageView3.setOnClickListener(new View.OnClickListener() { // from class: kpc
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    byte b22 = b2;
                                    jl7[] jl7VarArr3 = jl7VarArr2;
                                    switch (b22) {
                                        case 0:
                                            jl7VarArr3[0].dismiss();
                                            break;
                                        default:
                                            jl7VarArr3[0].dismiss();
                                            break;
                                    }
                                }
                            });
                            ImageView imageView9 = imageView2;
                            imageView9.setOnClickListener(new be(jl7VarArr2, vnbVar, imageView9, i, wallettransactionArr, context, (byte) 5));
                            return linearLayout3;
                        }
                    } else if (TextUtils.isEmpty(wallettransaction.comment)) {
                        f = 11.0f;
                    } else {
                        tpa tpaVar2 = new tpa(context);
                        tpaVar2.setTextSize(1, 15.0f);
                        yob.X(tpaVar2, i5, vnbVar2);
                        f = 11.0f;
                        tpaVar2.setText(pv3.m(wallettransaction.comment, tpaVar2.getPaint().getFontMetricsInt(), false, null, 0));
                        tpaVar2.setTextIsSelectable(true);
                        t37 t37Var2 = new t37(0, false, false, null);
                        t37Var2.x = false;
                        t37Var2.w = Integer.valueOf(aob.v0(aob.am, vnbVar2));
                        tpaVar2.setBackground(t37Var2);
                        tpaVar2.setPadding(hl.L(19.0f), hl.L(9.0f), hl.L(15.0f), hl.L(8.0f));
                        linearLayout2.addView(tpaVar2, tre.t(-2, -2, 1, 32, 16, 32, 0));
                    }
                    ypcVar = ypcVar2;
                    textView = textView2;
                    imageView = imageView4;
                    imageView2 = imageView5;
                } else {
                    ypcVar = ypcVar2;
                    textView = textView2;
                    imageView = imageView4;
                    imageView2 = imageView5;
                    f = 11.0f;
                }
                i2 = 1;
                SpannableString[] spannableStringArr22 = new SpannableString[i2];
                TextView[] textViewArr22 = new TextView[i2];
                hjb hjbVar22 = new hjb(context, vnbVar2);
                j.addView(hjbVar22, tre.k(14.0f, 0.0f, 14.0f, 0.0f, -1, -2));
                String[] strArr22 = {wallettransaction.comment};
                final boolean[] zArr22 = {(wallettransaction.comment_encrypted || (z2 && bArr == null)) ? false : true};
                if (kccVar != null) {
                }
                c51 i122 = xnb.i(24, vnbVar2, context, true);
                i122.setText(ob6.M0(2131747558, null));
                linearLayout.addView(i122, tre.k(14.0f, 14.0f, 14.0f, 14.0f, -1, 48));
                TL_wallet.walletTransaction[] wallettransactionArr2 = {wallettransaction2};
                cg5 cg5Var2 = new cg5(linearLayout, ypcVar, vnbVar2, i, textView, jl7VarArr, hjbVar, kccVar, context, textViewArr, spannableStringArr);
                LinearLayout linearLayout32 = linearLayout;
                linearLayout32.setTag(new vlc(cg5Var2, wallettransactionArr2, (byte) 11));
                cg5Var2.a(wallettransaction2);
                if (z2) {
                }
                boolean[] zArr32 = zArr;
                String[] strArr32 = strArr;
                linearLayout32.addOnAttachStateChangeListener(new cqc(cg5Var2, wallettransactionArr2, bqcVar, i3, iccVar, jl7VarArr, strArr32, zArr32));
                if (kccVar != null) {
                }
                final byte b22 = 1;
                imageView3.setOnClickListener(new View.OnClickListener() { // from class: kpc
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b222 = b22;
                        jl7[] jl7VarArr3 = jl7VarArr2;
                        switch (b222) {
                            case 0:
                                jl7VarArr3[0].dismiss();
                                break;
                            default:
                                jl7VarArr3[0].dismiss();
                                break;
                        }
                    }
                });
                ImageView imageView92 = imageView2;
                imageView92.setOnClickListener(new be(jl7VarArr2, vnbVar, imageView92, i, wallettransactionArr2, context, (byte) 5));
                return linearLayout32;
            }
            x = walletTransactionPeer.address;
        } else {
            x = c.C(i).x();
        }
        str = x;
        if (kccVar != null) {
        }
        i2 = 1;
        SpannableString[] spannableStringArr222 = new SpannableString[i2];
        TextView[] textViewArr222 = new TextView[i2];
        hjb hjbVar222 = new hjb(context, vnbVar2);
        j.addView(hjbVar222, tre.k(14.0f, 0.0f, 14.0f, 0.0f, -1, -2));
        String[] strArr222 = {wallettransaction.comment};
        final boolean[] zArr222 = {(wallettransaction.comment_encrypted || (z2 && bArr == null)) ? false : true};
        if (kccVar != null) {
        }
        c51 i1222 = xnb.i(24, vnbVar2, context, true);
        i1222.setText(ob6.M0(2131747558, null));
        linearLayout.addView(i1222, tre.k(14.0f, 14.0f, 14.0f, 14.0f, -1, 48));
        TL_wallet.walletTransaction[] wallettransactionArr22 = {wallettransaction2};
        cg5 cg5Var22 = new cg5(linearLayout, ypcVar, vnbVar2, i, textView, jl7VarArr, hjbVar, kccVar, context, textViewArr, spannableStringArr);
        LinearLayout linearLayout322 = linearLayout;
        linearLayout322.setTag(new vlc(cg5Var22, wallettransactionArr22, (byte) 11));
        cg5Var22.a(wallettransaction2);
        if (z2) {
        }
        boolean[] zArr322 = zArr;
        String[] strArr322 = strArr;
        linearLayout322.addOnAttachStateChangeListener(new cqc(cg5Var22, wallettransactionArr22, bqcVar, i3, iccVar, jl7VarArr, strArr322, zArr322));
        if (kccVar != null) {
        }
        final byte b222 = 1;
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: kpc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2222 = b222;
                jl7[] jl7VarArr3 = jl7VarArr2;
                switch (b2222) {
                    case 0:
                        jl7VarArr3[0].dismiss();
                        break;
                    default:
                        jl7VarArr3[0].dismiss();
                        break;
                }
            }
        });
        ImageView imageView922 = imageView2;
        imageView922.setOnClickListener(new be(jl7VarArr2, vnbVar, imageView922, i, wallettransactionArr22, context, (byte) 5));
        return linearLayout322;
    }

    public static String m0(String str) {
        StringBuilder sb = new StringBuilder((str.length() / 4) + str.length());
        for (int i = 0; i < str.length(); i++) {
            if (i > 0 && i % 4 == 0) {
                sb.append(' ');
            }
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static CharSequence n0(String str, Runnable runnable) {
        if (TextUtils.isEmpty(str)) {
            return ob6.M0(2131742604, null);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i = 0;
        while (true) {
            char c = '\n';
            if (i >= str.length()) {
                spannableStringBuilder.setSpan(new r1((Object) str, runnable, (byte) c), 0, spannableStringBuilder.length(), 33);
                return spannableStringBuilder;
            }
            if (i > 0 && i % 4 == 0) {
                spannableStringBuilder.append(i % 16 != 0 ? ' ' : '\n');
                spannableStringBuilder.length();
            }
            spannableStringBuilder.append(str.charAt(i));
            if (i % 4 == 3) {
                spannableStringBuilder.length();
            }
            i++;
        }
    }

    public static SpannableStringBuilder o0(int i, long j, vnb vnbVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("G ");
        wm2 wm2Var = new wm2(R.drawable.wallet_gram_small, 2);
        wm2Var.d = false;
        wm2Var.c(hl.L(16.0f));
        spannableStringBuilder.setSpan(wm2Var, 0, 1, 33);
        BigDecimal movePointLeft = new BigDecimal(j).movePointLeft(9);
        spannableStringBuilder.append((CharSequence) (movePointLeft.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : movePointLeft.stripTrailingZeros()).toPlainString());
        CharSequence q = c.C(i).q(j, true);
        if (!TextUtils.isEmpty(q)) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) "  ~\u2009").append(q);
            spannableStringBuilder.setSpan(new ho4(aob.z6, vnbVar), length, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    public static Typeface r0(Context context) {
        Typeface typeface = Y0;
        if (typeface != null) {
            return typeface;
        }
        if (Build.VERSION.SDK_INT < 26) {
            Typeface n1 = hl.n1("fonts/rmono.ttf");
            Y0 = n1;
            return n1;
        }
        gk.e();
        Typeface build = new Typeface.Builder(context.getAssets(), "fonts/rmono_var.ttf").setFontVariationSettings("'wght' 500").setWeight(500).build();
        Y0 = build;
        return build;
    }

    public static boolean w0(String str) {
        if (str != null) {
            return "t.me".equalsIgnoreCase(str) || "telegram.me".equalsIgnoreCase(str) || "telegram.dog".equalsIgnoreCase(str);
        }
        return false;
    }

    public static boolean x0(Uri uri) {
        String scheme = uri.getScheme();
        if (!"ton".equalsIgnoreCase(scheme) && !"tc".equalsIgnoreCase(scheme)) {
            if (("https".equalsIgnoreCase(scheme) || "http".equalsIgnoreCase(scheme)) && w0(uri.getHost())) {
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments.size() != 1 || (!"sendgrams".equalsIgnoreCase(pathSegments.get(0)) && i1(uri) == null)) {
                }
            }
            return false;
        }
        return true;
    }

    public final void A0() {
        L0(this.currentAccount, getResourceProvider(), getParentActivity());
    }

    public final void B0() {
        L0(this.currentAccount, getResourceProvider(), getParentActivity());
    }

    public final void C0() {
        c C = c.C(this.currentAccount);
        c51 c51Var = this.F0;
        if (c51Var.R) {
            return;
        }
        c51Var.setLoading(true);
        boolean z = false;
        C.A0(new ba1((Object) C, (Object) new ku9(this, C, (byte) 20), z, z, (byte) 3));
    }

    public final void D0(String str, c cVar, fu5 fu5Var, LinearLayout linearLayout, TL_wallet.currencyRate currencyrate) {
        if (currencyrate == null) {
            return;
        }
        b8 b8Var = new b8(2, this.resourceProvider, getParentActivity(), false, false);
        b8Var.setPadding(hl.L(18.0f), 0, hl.L(18.0f), 0);
        b8Var.setText(currencyrate.currency);
        b8Var.setSubtext(!TextUtils.isEmpty(currencyrate.translatedTitle) ? currencyrate.translatedTitle : currencyrate.title);
        boolean equals = TextUtils.equals(str, currencyrate.currency);
        b8Var.b.setPadding(0, 0, hl.L(equals ? 42.0f : 0.0f), 0);
        b8Var.setChecked(equals);
        b8Var.setOnClickListener(new lw4(cVar, currencyrate, fu5Var, (byte) 27));
        linearLayout.addView(b8Var, tre.o(jn7.d3, -2));
    }

    public final void E0(LinearLayout linearLayout, c cVar, fu5 fu5Var) {
        TL_wallet.currencyRate currencyrate;
        uqc uqcVar;
        ArrayList<TL_wallet.currencyRate> arrayList;
        LinearLayout linearLayout2 = linearLayout;
        c cVar2 = cVar;
        linearLayout2.removeAllViews();
        String g = cVar2.h.g();
        TL_wallet.currencyRates f = cVar2.h.f();
        if (f == null) {
            for (int i = 0; i < 3; i++) {
                tk4 tk4Var = new tk4(getParentActivity(), getResourceProvider());
                tk4Var.setIsSingleCell(true);
                tk4Var.setViewType(31);
                linearLayout2.addView(tk4Var, tre.o(jn7.d3, -2));
            }
            return;
        }
        s43 s43Var = cVar2.h;
        s43Var.getClass();
        ArrayList arrayList2 = new ArrayList();
        TL_wallet.currencyRates f2 = s43Var.f();
        TL_wallet.currencyRate currencyrate2 = null;
        if (f2 == null || (arrayList = f2.rates) == null) {
            currencyrate = null;
        } else {
            int size = arrayList.size();
            currencyrate = null;
            int i2 = 0;
            while (i2 < size) {
                TL_wallet.currencyRate currencyrate3 = arrayList.get(i2);
                i2++;
                TL_wallet.currencyRate currencyrate4 = currencyrate3;
                if (currencyrate4 != null) {
                    if (TextUtils.equals(currencyrate4.currency, "USD")) {
                        currencyrate2 = currencyrate4;
                    } else if (TextUtils.equals(currencyrate4.currency, "EUR")) {
                        currencyrate = currencyrate4;
                    }
                }
            }
        }
        if (currencyrate2 == null) {
            currencyrate2 = s43.e();
        }
        arrayList2.add(currencyrate2);
        if (currencyrate != null) {
            arrayList2.add(currencyrate);
        }
        if (f2 != null && f2.rates != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.add(s43Var.g());
            try {
                InputMethodManager inputMethodManager = (InputMethodManager) a.b.getSystemService("input_method");
                if (inputMethodManager != null) {
                    s43.b(linkedHashSet, inputMethodManager.getCurrentInputMethodSubtype());
                    Iterator<InputMethodInfo> it = inputMethodManager.getEnabledInputMethodList().iterator();
                    while (it.hasNext()) {
                        Iterator<InputMethodSubtype> it2 = inputMethodManager.getEnabledInputMethodSubtypeList(it.next(), true).iterator();
                        while (it2.hasNext()) {
                            s43.b(linkedHashSet, it2.next());
                        }
                    }
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
            s43.a(linkedHashSet, uc7.s1(s43Var.a).k4.Z.f);
            s43.c(linkedHashSet, ob6.D0().y);
            s43.c(linkedHashSet, ob6.D0().z);
            Iterator it3 = linkedHashSet.iterator();
            while (it3.hasNext()) {
                String str = (String) it3.next();
                if (!TextUtils.equals(str, "USD") && !TextUtils.equals(str, "EUR")) {
                    ArrayList<TL_wallet.currencyRate> arrayList3 = f2.rates;
                    int size2 = arrayList3.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 < size2) {
                            TL_wallet.currencyRate currencyrate5 = arrayList3.get(i3);
                            i3++;
                            TL_wallet.currencyRate currencyrate6 = currencyrate5;
                            if (currencyrate6 != null && TextUtils.equals(currencyrate6.currency, str)) {
                                arrayList2.add(currencyrate6);
                                break;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        int i4 = 0;
        while (i4 < arrayList2.size()) {
            TL_wallet.currencyRate currencyrate7 = (TL_wallet.currencyRate) arrayList2.get(i4);
            if (currencyrate7 != null && hashSet.add(currencyrate7.currency)) {
                D0(g, cVar2, fu5Var, linearLayout2, currencyrate7);
            }
            i4++;
            cVar2 = cVar;
        }
        if (hashSet.isEmpty() || f.rates.isEmpty()) {
            uqcVar = this;
        } else {
            uqcVar = this;
            linearLayout2.addView(new k8(getParentActivity(), uqcVar.resourceProvider), tre.o(-1, 8));
        }
        int i5 = 0;
        while (i5 < f.rates.size()) {
            TL_wallet.currencyRate currencyrate8 = f.rates.get(i5);
            if (currencyrate8 != null && !hashSet.contains(currencyrate8.currency)) {
                uqcVar.D0(g, cVar, fu5Var, linearLayout2, currencyrate8);
            }
            i5++;
            uqcVar = this;
            linearLayout2 = linearLayout;
        }
    }

    public final void F0(String str) {
        Uri h1 = h1(str);
        String i1 = i1(h1);
        if (i1 != null) {
            int i = this.currentAccount;
            uc7.s1(i).a2().a(i1, null, new jq0(i, (Object) new fpc(this, (byte) 4), (byte) 6));
        } else {
            if ((getParentActivity() instanceof LaunchActivity) && new e66((LaunchActivity) getParentActivity(), this.currentAccount, null, false).g(h1)) {
                return;
            }
            hl.c3(new cpc(this, (byte) 9));
        }
    }

    public final void G0() {
        b bVar;
        q9c q9cVar = this.u0[0];
        if (q9cVar == null || !q9cVar.H || (bVar = this.G0) == null || bVar.k || bVar.h || q9cVar.f3.M0() < q9cVar.g3.E.size() - 3) {
            return;
        }
        this.G0.h();
    }

    public final CharSequence H0(int i) {
        in inVar;
        float f;
        CharSequence[] charSequenceArr = this.S0;
        if (charSequenceArr[i] == null) {
            charSequenceArr[i] = new SpannableString("l");
            if (i == 0) {
                inVar = this.w0;
                f = 100.0f;
            } else {
                inVar = this.x0;
                f = 50.0f;
            }
            ya6 ya6Var = new ya6(hl.L(f), inVar);
            ya6Var.a(aob.p1(0.45f, -1), aob.p1(0.2f, -1));
            CharSequence charSequence = charSequenceArr[i];
            ((SpannableString) charSequence).setSpan(ya6Var, 0, charSequence.length(), 33);
        }
        return charSequenceArr[i];
    }

    public final void J0(TL_wallet.nftItem nftitem) {
        TL_stars.StarGift starGift = nftitem.gift;
        if (starGift instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
            wua wuaVar = new wua(getParentActivity(), this.currentAccount, 0L, getResourceProvider(), null);
            wuaVar.a3 = nftitem;
            if (this.k0 != null) {
                wuaVar.b3 = new dqc(this, tL_starGiftUnique, nftitem);
                wuaVar.c3 = new eqc(this, nftitem);
            }
            wuaVar.n2(tL_starGiftUnique.slug, tL_starGiftUnique, null);
            showDialog(wuaVar);
            return;
        }
        Activity parentActivity = getParentActivity();
        vnb resourceProvider = getResourceProvider();
        if (parentActivity != null) {
            int i = aob.a7;
            int v0 = aob.v0(i, resourceProvider);
            int i2 = aob.G6;
            aob.v0(i2, resourceProvider);
            tpc tpcVar = new tpc(1, resourceProvider, parentActivity, false);
            tpcVar.b0 = i;
            tpcVar.s0(v0);
            tpcVar.K(v0);
            ScrollView scrollView = new ScrollView(parentActivity);
            scrollView.setFillViewport(true);
            scrollView.setVerticalScrollBarEnabled(false);
            LinearLayout linearLayout = new LinearLayout(parentActivity);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            linearLayout.setPadding(hl.L(12.0f), hl.L(28.0f), hl.L(12.0f), hl.L(12.0f));
            scrollView.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
            de0 de0Var = new de0(parentActivity);
            de0Var.setRoundRadius(hl.L(12.0f));
            de0Var.setContentDescription(nftitem.name);
            Drawable mutate = parentActivity.getResources().getDrawable(R.drawable.wallet_nft_placeholder).mutate();
            int i3 = aob.z6;
            yob.x(de0Var, mutate, i3, resourceProvider, PorterDuff.Mode.SRC_IN);
            jn5 c = pl2.c(nftitem, false);
            if (c != null) {
                de0Var.m(c, "120_120", mutate, nftitem);
            } else {
                de0Var.setImageDrawable(mutate);
            }
            linearLayout.addView(de0Var, tre.r(jn7.E1, jn7.E1, 1));
            TextView textView = new TextView(parentActivity);
            textView.setText(TextUtils.isEmpty(nftitem.name) ? ob6.M0(2131742827, null) : nftitem.name);
            qd4.w(textView, i2, resourceProvider, 1, 17.0f);
            int i4 = 17;
            textView.setGravity(17);
            linearLayout.addView(textView, tre.k(12.0f, 16.0f, 12.0f, 0.0f, -1, -2));
            TextView textView2 = new TextView(parentActivity);
            textView2.setText(nftitem.description);
            yob.X(textView2, i3, resourceProvider);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(17);
            textView2.setVisibility(TextUtils.isEmpty(nftitem.description) ? 8 : 0);
            linearLayout.addView(textView2, tre.k(12.0f, 4.0f, 12.0f, 0.0f, -1, -2));
            LinearLayout linearLayout2 = new LinearLayout(parentActivity);
            linearLayout2.setOrientation(0);
            linearLayout.addView(linearLayout2, tre.k(0.0f, 20.0f, 0.0f, 16.0f, -1, 54));
            int i5 = 0;
            while (i5 < 2) {
                LinearLayout linearLayout3 = new LinearLayout(parentActivity);
                linearLayout3.setOrientation(1);
                linearLayout3.setGravity(i4);
                int L = hl.L(16.0f);
                int i6 = aob.d6;
                int v02 = aob.v0(i6, resourceProvider);
                int i7 = aob.i6;
                int v03 = aob.v0(i7, resourceProvider);
                hf0 i0 = aob.i0(L, L, L, L, v02, v03, v03);
                uob M = yob.M(i6);
                uob M2 = yob.M(i7);
                linearLayout3.setBackground(i0);
                yob.j(linearLayout3, i0, M, M2, resourceProvider);
                linearLayout3.setClickable(true);
                linearLayout3.setFocusable(true);
                String M0 = ob6.M0(i5 == 0 ? 2131742612 : 2131742654, null);
                linearLayout3.setContentDescription(M0);
                ImageView imageView = new ImageView(parentActivity);
                imageView.setImageResource(i5 == 0 ? R.drawable.wallet_transfer : R.drawable.wallet_sell);
                imageView.setImportantForAccessibility(2);
                int i8 = aob.G6;
                yob.s(imageView, i8, resourceProvider, PorterDuff.Mode.SRC_IN);
                linearLayout3.addView(imageView, tre.o(24, 24));
                TextView textView3 = new TextView(parentActivity);
                textView3.setText(M0);
                qd4.w(textView3, i8, resourceProvider, 1, 12.0f);
                textView3.setGravity(17);
                linearLayout3.addView(textView3, tre.k(0.0f, 2.0f, 0.0f, 0.0f, -2, -2));
                linearLayout2.addView(linearLayout3, tre.m(1.0f, 0, -1, i5 == 0 ? 0 : 4, i5 == 0 ? 4 : 0, 0));
                i5++;
                i4 = 17;
            }
            ArrayList<TL_wallet.nftAttribute> arrayList = nftitem.attributes;
            if (arrayList != null && !arrayList.isEmpty()) {
                hjb hjbVar = new hjb(parentActivity, resourceProvider);
                int L2 = hl.L(10.0f);
                int i9 = aob.d6;
                ShapeDrawable b0 = aob.b0(L2, aob.v0(i9, resourceProvider));
                uob M3 = yob.M(i9);
                hjbVar.setBackground(b0);
                yob.j(hjbVar, b0, M3, null, resourceProvider);
                ArrayList<TL_wallet.nftAttribute> arrayList2 = nftitem.attributes;
                int size = arrayList2.size();
                int i10 = 0;
                while (i10 < size) {
                    TL_wallet.nftAttribute nftattribute = arrayList2.get(i10);
                    i10++;
                    TL_wallet.nftAttribute nftattribute2 = nftattribute;
                    hjbVar.f(nftattribute2.trait_type, nftattribute2.value, null, null);
                }
                linearLayout.addView(hjbVar, tre.k(0.0f, 0.0f, 0.0f, 14.0f, -1, -2));
            }
            c51 c51Var = new c51(resourceProvider, parentActivity, true);
            c51Var.setRoundRadius(24);
            c51Var.setText(ob6.M0(2131742713, null));
            linearLayout.addView(c51Var, tre.o(-1, 48));
            tpcVar.O = scrollView;
            tpcVar.T0 = false;
            linearLayout2.getChildAt(0).setOnClickListener(new jjb((Object) tpcVar, (Object) nftitem, (byte) 16));
            linearLayout2.getChildAt(1).setOnClickListener(new kla(parentActivity, (byte) 26));
            c51Var.setOnClickListener(new kla(tpcVar, (byte) 27));
            tpcVar.show();
            tpcVar.K(v0);
            hl.o3(tpcVar, v0, false, null);
        }
    }

    public final void N0() {
        if (getParentActivity() == null || this.Q0 != null || this.P0 == null) {
            return;
        }
        if (getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
            getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 44);
        } else {
            this.Q0 = jz8.k(this, this.P0, new sb((byte) 14), new fpc(this, (byte) 3), new cpc(this, (byte) 7));
        }
    }

    public final void O0(boolean z) {
        this.g0 = z;
        if (!z) {
            this.f0 = 0;
        }
        if (this.s0 == null || this.i0 == null) {
            return;
        }
        if (!z) {
            this.j0.b(false);
            this.s0.setPosition(0);
        }
        f1();
        ValueAnimator valueAnimator = this.n0;
        if (valueAnimator != null) {
            this.n0 = null;
            valueAnimator.cancel();
        }
        float f = z ? 1.0f : 0.0f;
        boolean z2 = this.o0.isAttachedToWindow() && this.o0.isLaidOut();
        if (z) {
            this.s0.m(false);
        }
        if (!z2 || this.m0 == f) {
            P0(f);
            this.s0.m(false);
        } else {
            this.i0.setVisibility(0);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.m0, f);
            this.n0 = ofFloat;
            ofFloat.setDuration(250L);
            this.n0.setInterpolator(k43.h);
            this.n0.addUpdateListener(new epc(this, (byte) 0));
            this.n0.addListener(new u7(this, f, (byte) 8));
            this.n0.start();
        }
        if (this.a == null || this.r0 == Q0()) {
            return;
        }
        b1(false);
    }

    public final void P0(float f) {
        this.m0 = f;
        this.i0.setAlpha(f);
        e1();
        int round = Math.round(hl.L(46.0f) * f);
        if (this.p0 != round) {
            this.p0 = round;
            d1(0);
            d1(1);
        }
    }

    public final boolean Q0() {
        b bVar;
        if (this.g0 || (bVar = this.G0) == null || !bVar.c.isEmpty()) {
            return false;
        }
        b bVar2 = this.G0;
        return !bVar2.k && bVar2.h;
    }

    public final void R0(long j) {
        if (this.a != null) {
            ltc ltcVar = this.j0;
            if (ltcVar != null) {
                ltcVar.a();
            }
            if (this.M0 <= 0.0f && t0()) {
                int top = this.a.f3.m(this.h).getTop() - this.a.getPaddingTop();
                this.a.E0();
                if (top < 0) {
                    this.a.y0(0, top, k43.h);
                    return;
                }
                return;
            }
            this.a.E0();
            h0(true);
            cpc cpcVar = this.O0;
            hl.r(cpcVar);
            if (j > 0) {
                hl.d3(cpcVar, j + 260);
            }
        }
    }

    public final void S0() {
        this.I0 = false;
        ltc ltcVar = this.j0;
        if (ltcVar != null) {
            ltcVar.b(false);
        }
        this.f0 = 0;
        ir1 ir1Var = this.s0;
        if (ir1Var != null) {
            ir1Var.setPosition(0);
        }
    }

    public final void T0() {
        this.s = false;
        wa waVar = this.a;
        if (waVar != null) {
            waVar.E2.b.remove(this.x);
            this.a.removeCallbacks(this.w);
        }
        iqc iqcVar = this.e;
        if (iqcVar != null) {
            iqcVar.setAdditionalTilt(0.0f);
        }
    }

    public final void V0() {
        c C = c.C(this.currentAccount);
        g1();
        this.F0.setEnabled(C.M() && C.e());
        if (!C.M()) {
            this.w0.setText(H0(0));
            this.x0.setText(H0(1));
            return;
        }
        long z = C.z();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (this.U0 == null) {
            this.U0 = new SpannableString("G");
            iqc iqcVar = this.e;
            iqcVar.getClass();
            drc drcVar = new drc(iqcVar);
            this.y0 = drcVar;
            SpannableString spannableString = this.U0;
            spannableString.setSpan(drcVar, 0, spannableString.length(), 33);
        }
        spannableStringBuilder.append((CharSequence) this.U0);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) frc.e(z));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) ob6.M0(2131749287, null));
        lqc lqcVar = this.z0;
        if (lqcVar == null) {
            lqcVar = new lqc();
            lqcVar.a = -9577217;
            this.z0 = lqcVar;
        }
        spannableStringBuilder.setSpan(lqcVar, length, spannableStringBuilder.length(), 33);
        this.w0.setText(spannableStringBuilder);
        CharSequence q = c.C(this.currentAccount).q(z, false);
        boolean isEmpty = TextUtils.isEmpty(q);
        in inVar = this.x0;
        if (isEmpty) {
            inVar.setText(H0(1));
        } else {
            inVar.setText(q);
        }
        Y0(this.A0);
        x25 x25Var = this.H0;
        if (x25Var != null && !x25Var.h && !x25Var.i && x25Var.m == null) {
            x25Var.e();
        }
        String x = C.x();
        if (TextUtils.isEmpty(x)) {
            return;
        }
        this.e.setCardNumber(m0(x.toUpperCase()));
    }

    public final void W0() {
        float[] fArr;
        float[] fArr2;
        Rect rect = this.H;
        if (rect.isEmpty() || !this.E.isAttachedToWindow()) {
            return;
        }
        iqc iqcVar = this.e;
        iy9 iy9Var = this.F;
        Matrix matrix = this.I;
        if (iqcVar.g(iy9Var, matrix)) {
            float width = rect.width();
            float height = rect.height();
            int i = 0;
            while (true) {
                fArr = this.L;
                fArr2 = this.M;
                float f = 0.0f;
                if (i >= 4) {
                    break;
                }
                float f2 = (i == 1 || i == 2) ? width : 0.0f;
                if (i >= 2) {
                    f = height;
                }
                int i2 = i << 1;
                fArr[i2] = f2;
                int i3 = i2 + 1;
                fArr[i3] = f;
                fArr2[i2] = rect.left + f2;
                fArr2[i3] = rect.top + f;
                i++;
            }
            matrix.mapPoints(fArr2);
            iy9 iy9Var2 = this.F;
            int[] iArr = this.P;
            iy9Var2.getLocationInWindow(iArr);
            View view = this.E;
            int[] iArr2 = this.O;
            view.getLocationInWindow(iArr2);
            this.e.i(this.A0, this.y.getWidth() / 0.7826087f);
            float f3 = iArr2[0] - iArr[0];
            float v = bp1.v(height, 0.7826087f, 0.5f, iArr2[1] - iArr[1]);
            for (int i4 = 0; i4 < 4; i4++) {
                int i5 = i4 << 1;
                float R1 = hl.R1(fArr2[i5], (fArr[i5] * 0.7826087f) + f3, this.A0);
                float[] fArr3 = this.N;
                fArr3[i5] = R1;
                int i6 = i5 + 1;
                fArr3[i6] = hl.R1(fArr2[i6], (fArr[i6] * 0.7826087f) + v, this.A0);
            }
            Matrix matrix2 = this.K;
            boolean polyToPoly = matrix2.setPolyToPoly(this.L, 0, this.N, 0, 4);
            Matrix matrix3 = this.J;
            if (polyToPoly && !matrix3.equals(matrix2)) {
                matrix3.set(matrix2);
                this.F.invalidate();
            }
            iqc iqcVar2 = this.e;
            Matrix matrix4 = iqcVar2.c;
            Matrix matrix5 = iqcVar2.e;
            Matrix matrix6 = iqcVar2.d;
            if (matrix.invert(matrix6)) {
                matrix5.setConcat(matrix6, matrix3);
                if (!iqcVar2.n || !matrix4.equals(matrix5)) {
                    matrix4.set(matrix5);
                    iqcVar2.n = true;
                    iqcVar2.O.invalidate();
                }
            }
            float R12 = hl.R1(1.0f, 1.0952381f, this.A0);
            this.x0.setPivotX(0.0f);
            this.x0.setPivotY(0.0f);
            this.x0.setScaleX(R12);
            this.x0.setScaleY(R12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    public final void X0() {
        iy9 iy9Var;
        ?? r16;
        LinearLayout linearLayout;
        float min;
        float f;
        if (this.a == null || this.e == null || this.v0 == null || this.E == null || (iy9Var = this.F) == null || this.simpleActionBar == null) {
            return;
        }
        iy9Var.bringToFront();
        View m = this.a.f3.m(this.h);
        float i = m == null ? this.a.f3.K0() > this.h ? 1.0f : 0.0f : Utilities.i((r2.getPaddingTop() - m.getTop()) / m.getHeight(), 1.0f, 0.0f);
        this.B0 = i;
        float f2 = this.M0;
        boolean z = f2 > 0.0f || this.L0 > 0.0f;
        if (z) {
            i = f2 > 0.0f ? 0.0f : (1.0f - this.L0) * i;
        }
        this.A0 = i;
        a1();
        float max = m != null ? Math.max(0.0f, (m.getHeight() / 2.0f) + hl.L(24.0f)) * this.A0 : 0.0f;
        float R1 = hl.R1(1.0f, 0.8f, this.A0);
        this.e.setPivotX(r11.getWidth() * 0.5f);
        this.e.setPivotY(0.0f);
        this.e.setScaleX(R1);
        this.e.setScaleY(R1);
        this.e.setAlpha(1.0f - Utilities.l(hl.x1(i, 0.75f, 1.0f)));
        this.e.setVisibility((z || (m != null && i < 1.0f && m.getBottom() > this.a.getPaddingTop() && m.getTop() < this.a.getHeight() - this.a.getPaddingBottom())) ? 0 : 4);
        int[] iArr = this.R;
        int[] iArr2 = this.Q;
        if (m != null) {
            this.a.getLocationInWindow(iArr2);
            this.n.getLocationInWindow(iArr);
            r16 = 1;
            this.e.setTranslationX(((this.f.getWidth() - this.e.getWidth()) / 2.0f) + this.f.getX() + m.getX() + (iArr2[0] - iArr[0]));
            this.e.setTranslationY(this.f.getY() + m.getY() + (iArr2[1] - iArr[1]) + max);
        } else {
            r16 = 1;
        }
        if (z) {
            boolean z2 = this.M0 == 0.0f ? r16 : false;
            float f3 = this.L0;
            if (z2) {
                min = 0.3f * f3;
                f = 0.6f;
            } else {
                min = Math.min(1.0f, 1.8f * f3) * 0.06f;
                f = 0.84f;
            }
            float f4 = min + f;
            this.simpleActionBar.getLocationInWindow(iArr2);
            this.n.getLocationInWindow(iArr);
            float L = (hl.L(4.0f) + (this.simpleActionBar.getHeight() + (iArr2[r16] - iArr[r16]))) - ((1.0f - f3) * (z2 ? 0.0f : this.e.getHeight() * 0.35f));
            if (z2) {
                L = qu6.d(0.9f - f4, this.e.getHeight(), 2.0f, L);
            }
            float width = (this.n.getWidth() - this.e.getWidth()) / 2.0f;
            if (!z2) {
                f3 = Math.min(1.0f, f3 * 2.0f);
            }
            if (m != null) {
                this.a.getLocationInWindow(iArr2);
                float width2 = ((this.f.getWidth() - this.e.getWidth()) / 2.0f) + this.f.getX() + m.getX() + (iArr2[0] - iArr[0]);
                float y = this.f.getY() + m.getY() + (iArr2[r16] - iArr[r16]);
                float l = Utilities.l(1.0f - ((L - y) / (this.e.getHeight() * 0.5f)));
                if (l >= 1.0f) {
                    hl.r(this.O0);
                    ValueAnimator valueAnimator = this.N0;
                    if (valueAnimator != null) {
                        this.N0 = null;
                        valueAnimator.cancel();
                    }
                    this.L0 = 0.0f;
                    this.M0 = 0.0f;
                    X0();
                    return;
                }
                width = hl.R1(width, width2, l);
                L = hl.R1(L, y, l);
                f4 = hl.R1(f4, 1.0f, l);
                f3 = hl.R1(f3, 1.0f, l);
            }
            this.e.setPivotX(r1.getWidth() * 0.5f);
            this.e.setPivotY(0.0f);
            this.e.setScaleX(f4);
            this.e.setScaleY(f4);
            this.e.setTranslationX(width);
            this.e.setTranslationY(L);
            this.e.setAlpha(f3);
        }
        boolean z3 = i > 0.0f ? r16 : false;
        if (this.G != z3 && (linearLayout = this.v0) != null) {
            Rect rect = this.H;
            if (z3) {
                if (linearLayout.getWidth() != 0 && this.v0.getHeight() != 0) {
                    rect.set(this.v0.getLeft(), this.v0.getTop(), this.v0.getRight(), this.v0.getBottom());
                }
            }
            this.e.setOnFrontContentPresented(null);
            hl.B2(this.v0);
            this.G = z3;
            if (z3) {
                this.F.addView(this.v0, new FrameLayout.LayoutParams(rect.width(), rect.height(), 51));
                this.v0.layout(0, 0, rect.width(), rect.height());
                W0();
            } else {
                iqc iqcVar = this.e;
                iqcVar.i(0.0f, 0.0f);
                LinearLayout linearLayout2 = iqcVar.N;
                hl.B2(linearLayout2);
                linearLayout2.setScaleX(1.0f);
                linearLayout2.setScaleY(1.0f);
                linearLayout2.setRotationX(0.0f);
                linearLayout2.setRotationY(0.0f);
                linearLayout2.setTranslationX(0.0f);
                linearLayout2.setTranslationY(0.0f);
                crc crcVar = iqcVar.P;
                crcVar.setScaleX(1.0f);
                crcVar.setScaleY(1.0f);
                iqcVar.F.addView(linearLayout2, iqcVar.Q);
                this.v0.layout(rect.left, rect.top, rect.right, rect.bottom);
                this.e.getClass();
                W0();
            }
            this.F.invalidate();
        }
        Y0(i);
        if (this.G) {
            W0();
        }
        float f5 = 1.0f - i;
        this.simpleActionBar.setTitlesAlpha(f5);
        if (this.simpleActionBar.getTitleTextView() != null) {
            this.simpleActionBar.getTitleTextView().setTranslationY((1.0f - f5) * (-hl.L(8.0f)));
        }
    }

    @Override // n9c
    public final void Y(ArrayList arrayList, l9c l9cVar) {
        c C = c.C(this.currentAccount);
        g1();
        arrayList.add(b8c.m(this.S));
        this.h = arrayList.size();
        gqc gqcVar = this.f;
        b8c b8cVar = new b8c(-4);
        b8cVar.c = gqcVar;
        b8cVar.A = -1;
        b8cVar.e = true;
        arrayList.add(b8cVar);
        arrayList.add(b8c.m(this.C0));
        boolean Q0 = Q0();
        this.r0 = Q0;
        if (Q0) {
            String M0 = ob6.M0(2131742650, null);
            String M02 = ob6.M0(2131742649, null);
            int i = mqc.b;
            b8c K = b8c.K(mqc.class);
            K.k = R.drawable.wallet_learn_instant;
            K.m = M0;
            K.n = M02;
            arrayList.add(K);
            String M03 = ob6.M0(2131742718, null);
            String M04 = ob6.M0(2131742717, null);
            b8c K2 = b8c.K(mqc.class);
            K2.k = R.drawable.wallet_learn_fees;
            K2.m = M03;
            K2.n = M04;
            arrayList.add(K2);
            String M05 = ob6.M0(2131742833, null);
            String M06 = ob6.M0(2131742832, null);
            b8c K3 = b8c.K(mqc.class);
            K3.k = R.drawable.wallet_learn_verified;
            K3.m = M05;
            K3.n = M06;
            arrayList.add(K3);
            arrayList.add(b8c.m(this.b0));
        } else if (this.o0 != null) {
            if (this.V0 && !this.W0 && C.z() > 500000000) {
                arrayList.add(b8c.k(this.d0));
            }
            spc spcVar = this.o0;
            b8c b8cVar2 = new b8c(-3);
            b8cVar2.c = spcVar;
            b8cVar2.A = 0;
            b8cVar2.z = 1;
            arrayList.add(b8cVar2);
        }
        p66 p66Var = this.a0;
        if (p66Var != null) {
            this.c0 = false;
            p66Var.animate().cancel();
            this.a0.setAlpha(0.0f);
            this.a0.setVisibility(4);
        }
    }

    public final void Y0(float f) {
        int themedColor = getThemedColor(aob.G6);
        this.w0.setTextColor(hl.b2(f, -1, themedColor));
        in inVar = this.x0;
        float[] fArr = this.e.b0;
        int i = -7868417;
        if (fArr != null) {
            i = vm2.f(fArr[8], lsc.p(-7868417, 0, fArr), lsc.p(-7868417, 3, fArr));
        }
        inVar.setTextColor(hl.b2(f, i, vm2.o(themedColor, jn7.Y1)));
        drc drcVar = this.y0;
        if (drcVar != null) {
            drcVar.y = hl.b2(f, -1, getThemedColor(aob.Fi));
        }
        lqc lqcVar = this.z0;
        if (lqcVar != null) {
            float[] fArr2 = this.e.b0;
            int i2 = -9577217;
            if (fArr2 != null) {
                i2 = vm2.f(fArr2[8], lsc.p(-9577217, 0, fArr2), lsc.p(-9577217, 3, fArr2));
            }
            lqcVar.a = vm2.o(i2, Math.round((1.0f - f) * 255.0f));
        }
        this.w0.invalidate();
    }

    @Override // n9c
    public final CharSequence Z() {
        return ob6.M0(2131742634, null);
    }

    public final void Z0(float[] fArr) {
        float f;
        if (this.E0 == null || this.F0 == null) {
            return;
        }
        float f2 = lsc.j(getThemedColor(aob.a7))[0];
        boolean z = f2 < 0.6f;
        int themedColor = getThemedColor(aob.Fi);
        float f3 = 0.0f;
        if (fArr != null && fArr.length >= 18) {
            int[] iArr = new int[2];
            for (int i = 0; i < 2; i++) {
                int i2 = i << 2;
                float f4 = fArr[i2 + 10];
                iArr[i] = f4 < 0.0f ? themedColor : lsc.n(themedColor, (int) f4, (int) fArr[i2 + 11]);
            }
            themedColor = vm2.f(fArr[8], iArr[0], iArr[1]);
        }
        if (z) {
            f3 = f2 + 0.25f;
            f = 1.0f;
        } else {
            f = f2 - 0.2f;
        }
        float[] j = lsc.j(themedColor);
        float f5 = j[0];
        if (f5 < f3 || f5 > f) {
            themedColor = (themedColor & (-16777216)) | (lsc.l(Math.max(f3, Math.min(f, f5)), j[1], j[2]) & 16777215);
        }
        if (themedColor != this.R0) {
            this.R0 = themedColor;
            int themedColor2 = vm2.h(themedColor) <= 0.550000011920929d ? getThemedColor(aob.Ji) : -16777216;
            c51[] c51VarArr = {this.E0, this.F0};
            for (int i3 = 0; i3 < 2; i3++) {
                c51 c51Var = c51VarArr[i3];
                c51Var.setColor(themedColor);
                c51Var.setTextColor(themedColor2);
            }
        }
    }

    @Override // n9c
    public final void a0(b8c b8cVar, View view) {
        x25 x25Var;
        Object obj = b8cVar.H;
        if (obj instanceof TL_wallet.nftItem) {
            J0((TL_wallet.nftItem) obj);
            return;
        }
        if (b8cVar.d == -10001 && (x25Var = this.H0) != null) {
            x25Var.e();
        } else if (obj instanceof TL_wallet.walletTransaction) {
            I0(getParentActivity(), this.currentAccount, (TL_wallet.walletTransaction) b8cVar.H, null, null, null, null, getResourceProvider());
        }
    }

    public final void a1() {
        wa waVar = this.a;
        if (waVar == null || this.e == null) {
            return;
        }
        float b = waVar.E2.b(1);
        this.e.setAdditionalTilt(Math.max(0.0f, (this.A0 * 10.0f) + ((((float) Math.sqrt(Utilities.l(this.A0))) * 90.0f) - 10.0f)) + Math.min(10.0f, this.a.E2.b(3) * 40.0f) + (-Math.min(10.0f, b * 40.0f)));
        this.e.setUseGyroscope(1.0f - ((float) Math.pow(this.A0, 0.33000001311302185d)));
    }

    @Override // n9c
    public final boolean b0(b8c b8cVar, View view) {
        wsc wscVar;
        if (!(view instanceof ksc) || (wscVar = this.k0) == null) {
            return false;
        }
        wscVar.S((ksc) view);
        return true;
    }

    public final void b1(boolean z) {
        boolean Q0 = Q0();
        wa waVar = this.a;
        q9c[] q9cVarArr = this.u0;
        if (waVar != null && this.r0 != Q0) {
            this.r0 = Q0;
            waVar.E0();
            for (q9c q9cVar : q9cVarArr) {
                if (q9cVar != null) {
                    q9cVar.E0();
                }
            }
            this.a.g3.O(false);
            this.a.f3.g1(0, 0);
            this.a.post(new cpc(this, (byte) 6));
        }
        if (Q0) {
            return;
        }
        for (q9c q9cVar2 : q9cVarArr) {
            if (q9cVar2 != null) {
                c1(q9cVar2, z);
            }
        }
        spc spcVar = this.o0;
        if (spcVar != null) {
            spcVar.post(new cpc(this, (byte) 2));
            this.o0.post(new cpc(this, (byte) 3));
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean canBeginSlide() {
        wsc wscVar = this.k0;
        return (wscVar == null || !wscVar.q0) && super.canBeginSlide();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // n9c, org.telegram.ui.ActionBar.e
    public final View createView(Context context) {
        ValueAnimator valueAnimator = this.n0;
        if (valueAnimator != null) {
            this.n0 = null;
            valueAnimator.cancel();
        }
        T0();
        qqc qqcVar = this.t0;
        if (qqcVar != null) {
            qqcVar.b(null);
        }
        this.f = null;
        this.T = null;
        this.S = null;
        this.o0 = null;
        this.s0 = null;
        q9c[] q9cVarArr = this.u0;
        final byte b = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        q9cVarArr[0] = null;
        byte b2 = 1;
        q9cVarArr[1] = null;
        x25 x25Var = this.H0;
        boolean z = (x25Var == null || x25Var.a.isEmpty()) ? false : true;
        this.g0 = z;
        if (!z) {
            this.f0 = 0;
        } else if (this.I0) {
            this.f0 = 1;
        }
        wsc wscVar = this.k0;
        if (wscVar != null) {
            wscVar.p();
        }
        this.k0 = null;
        View createView = super.createView(context);
        sc6 sc6Var = new sc6(this, context);
        sc6Var.addView(createView, tre.c(-1.0f, -1));
        this.fragmentView = sc6Var;
        yob.h(aob.a7, getResourceProvider(), sc6Var);
        this.simpleActionBar.setClipChildren(false);
        this.simpleActionBar.setClipToPadding(false);
        rla v = this.simpleActionBar.v();
        final byte b3 = 2;
        sla a = v.a(2, R.drawable.scan_qr);
        this.P0 = a;
        a.setOnClickListener(new View.OnClickListener(this) { // from class: apc
            public final /* synthetic */ uqc b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b4 = b;
                uqc uqcVar = this.b;
                switch (b4) {
                    case 0:
                        uqcVar.N0();
                        break;
                    case 1:
                        uqcVar.presentFragment(new o7c(6, null));
                        break;
                    case 2:
                        uqcVar.A0();
                        break;
                    case 3:
                        uqcVar.B0();
                        break;
                    default:
                        uqcVar.C0();
                        break;
                }
            }
        });
        sla a2 = v.a(1, R.drawable.ic_ab_other);
        byte b4 = 26;
        a2.setOnClickListener(new lw4(this, context, a2, b4));
        spc spcVar = new spc(this, context, b2);
        this.S = spcVar;
        spcVar.setClipToPadding(false);
        this.S.setClipChildren(false);
        this.S.setPadding(hl.L(16.0f), 0, hl.L(16.0f), hl.L(4.0f));
        fqc fqcVar = new fqc(this, context);
        this.T = fqcVar;
        fqcVar.setDefaultRadiusDp(22);
        this.T.setOnAnimatedHeightChangedListener(new cpc(this, (byte) 8));
        TextView textView = new TextView(context);
        this.V = textView;
        textView.setText(ob6.M0(2131742593, null));
        this.U = k0(this.V, new cpc(this, (byte) 10));
        TextView textView2 = new TextView(context);
        this.X = textView2;
        this.W = k0(textView2, new cpc(this, (byte) 11));
        TextView textView3 = new TextView(context);
        this.Z = textView3;
        this.Y = k0(textView3, new cpc(this, (byte) 12));
        this.S.addView(this.T, tre.c(-2.0f, -1));
        p66 p66Var = new p66(context, null);
        this.a0 = p66Var;
        this.c0 = false;
        p66Var.setAlpha(0.0f);
        p66 p66Var2 = this.a0;
        int i = aob.z6;
        yob.X(p66Var2, i, this.resourceProvider);
        this.a0.setTextSize(1, 13.0f);
        this.a0.setGravity(17);
        this.a0.setText(U0(ob6.M0(2131742637, null), aob.Xc, this.resourceProvider, new xf1(context, b4)));
        final byte b5 = 4;
        this.a0.setVisibility(4);
        if (((FrameLayout) createView) != null) {
            ((FrameLayout) createView).addView(this.a0, tre.d(-1, -2.0f, 81, 12.0f, 0.0f, 12.0f, 24.0f));
        }
        gqc gqcVar = new gqc(this, context, objArr4 == true ? 1 : 0);
        this.b0 = gqcVar;
        gqcVar.setImportantForAccessibility(2);
        this.d0 = new FrameLayout(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.e0 = frameLayout;
        int i2 = aob.d6;
        int themedColor = getThemedColor(i2);
        int themedColor2 = getThemedColor(i2);
        int i3 = aob.i6;
        hf0 Z = aob.Z(themedColor, aob.v(themedColor2, getThemedColor(i3)), 16, 16);
        uob M = yob.M(i2);
        uob p = yob.p(i2, i3);
        vnb resourceProvider = getResourceProvider();
        frameLayout.setBackground(Z);
        yob.j(frameLayout, Z, M, p, resourceProvider);
        this.d0.addView(this.e0, tre.d(-1, -2.0f, 55, 12.0f, 0.0f, 12.0f, 12.0f));
        ImageView imageView = new ImageView(context);
        float N = hl.N(10.0f);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{N, N, N, N, N, N, N, N}, null, null));
        shapeDrawable.setShaderFactory(new hqc());
        imageView.setBackground(shapeDrawable);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.wallet_protect);
        this.e0.addView(imageView, tre.d(28, 28.0f, 19, 14.0f, 11.0f, 16.0f, 11.0f));
        TextView textView4 = new TextView(context);
        yob.X(textView4, aob.q7, this.resourceProvider);
        bs2.r(16.0f, 1, 2131742675, textView4, null);
        this.e0.addView(textView4, tre.d(-1, -2.0f, 19, 58.0f, 0.0f, 32.0f, 0.0f));
        final byte b6 = 1;
        this.e0.setOnClickListener(new View.OnClickListener(this) { // from class: apc
            public final /* synthetic */ uqc b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b42 = b6;
                uqc uqcVar = this.b;
                switch (b42) {
                    case 0:
                        uqcVar.N0();
                        break;
                    case 1:
                        uqcVar.presentFragment(new o7c(6, null));
                        break;
                    case 2:
                        uqcVar.A0();
                        break;
                    case 3:
                        uqcVar.B0();
                        break;
                    default:
                        uqcVar.C0();
                        break;
                }
            }
        });
        iye.b(this.e0, 0.02f, 1.2f);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.y = frameLayout2;
        frameLayout2.setClipChildren(false);
        this.y.setClipToPadding(false);
        this.simpleActionBar.addView(this.y, tre.d(-1, 56.0f, 3, 64.0f, 0.0f, 96.0f, 0.0f));
        View view = new View(context);
        this.E = view;
        this.y.addView(view, tre.e(1, 1, 19));
        this.G = false;
        this.H.setEmpty();
        this.J.reset();
        iy9 iy9Var = new iy9(this, context);
        this.F = iy9Var;
        iy9Var.setClipChildren(false);
        this.F.setClipToPadding(false);
        iqc iqcVar = new iqc(this, context);
        this.e = iqcVar;
        iqcVar.setDiamondOnCard(true);
        this.e.setCardOnClickListener(new View.OnClickListener(this) { // from class: apc
            public final /* synthetic */ uqc b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b42 = b3;
                uqc uqcVar = this.b;
                switch (b42) {
                    case 0:
                        uqcVar.N0();
                        break;
                    case 1:
                        uqcVar.presentFragment(new o7c(6, null));
                        break;
                    case 2:
                        uqcVar.A0();
                        break;
                    case 3:
                        uqcVar.B0();
                        break;
                    default:
                        uqcVar.C0();
                        break;
                }
            }
        });
        this.a.E2.b.add(this.x);
        gqc gqcVar2 = new gqc(this, context, (byte) 1);
        this.f = gqcVar2;
        gqcVar2.setImportantForAccessibility(2);
        jqc jqcVar = new jqc(this, context);
        this.n = jqcVar;
        jqcVar.setClipChildren(false);
        this.n.setClipToPadding(false);
        this.n.addView(this.e, tre.c(-2.0f, -1));
        sc6Var.addView(this.n, tre.c(-1.0f, -1));
        this.a.setClipChildren(false);
        this.a.setClipToPadding(false);
        this.v0 = this.e.getBalanceLayout();
        this.w0 = this.e.getBalanceView();
        this.x0 = this.e.getUsdBalanceView();
        this.e.setCardHolder(lbc.r(getUserConfig().f()).toUpperCase());
        this.D0 = 0.0f;
        oob oobVar = new oob((byte) 24, context, this);
        this.C0 = oobVar;
        oobVar.setOrientation(0);
        this.C0.setPadding(hl.L(16.0f), 0, hl.L(16.0f), hl.L(12.0f));
        c51 c51Var = new c51(this.resourceProvider, context, true);
        c51Var.setRoundRadius(24);
        this.E0 = c51Var;
        c51Var.setText(ob6.M0(2131742855, null));
        this.C0.addView(this.E0, tre.m(1.0f, 0, 48, 0, 4, 0));
        final byte b7 = 3;
        this.E0.setOnClickListener(new View.OnClickListener(this) { // from class: apc
            public final /* synthetic */ uqc b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b42 = b7;
                uqc uqcVar = this.b;
                switch (b42) {
                    case 0:
                        uqcVar.N0();
                        break;
                    case 1:
                        uqcVar.presentFragment(new o7c(6, null));
                        break;
                    case 2:
                        uqcVar.A0();
                        break;
                    case 3:
                        uqcVar.B0();
                        break;
                    default:
                        uqcVar.C0();
                        break;
                }
            }
        });
        c51 c51Var2 = new c51(this.resourceProvider, context, true);
        c51Var2.setRoundRadius(24);
        this.F0 = c51Var2;
        c51Var2.setText(ob6.M0(2131742653, null));
        this.F0.setEnabled(c.C(this.currentAccount).e());
        this.F0.setOnClickListener(new View.OnClickListener(this) { // from class: apc
            public final /* synthetic */ uqc b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b42 = b5;
                uqc uqcVar = this.b;
                switch (b42) {
                    case 0:
                        uqcVar.N0();
                        break;
                    case 1:
                        uqcVar.presentFragment(new o7c(6, null));
                        break;
                    case 2:
                        uqcVar.A0();
                        break;
                    case 3:
                        uqcVar.B0();
                        break;
                    default:
                        uqcVar.C0();
                        break;
                }
            }
        });
        this.C0.addView(this.F0, tre.m(1.0f, 0, 48, 4, 0, 0));
        Z0(this.e.getStickerStyle());
        this.G0 = c.C(this.currentAccount).G();
        this.a.setDescendantFocusability(131072);
        wsc wscVar2 = new wsc(this, this.e, new k7b(this, sc6Var, objArr3 == true ? 1 : 0, (byte) 7), null);
        this.k0 = wscVar2;
        sc6Var.addView(wscVar2, tre.c(-1.0f, -1));
        this.l0 = "";
        this.o0 = new spc(this, context, objArr2 == true ? 1 : 0);
        ir1 ir1Var = new ir1(this, context, this.resourceProvider, (byte) 10);
        this.s0 = ir1Var;
        ir1Var.setAllowDisallowInterceptTouch(false);
        this.s0.setAdapter(new bn0((byte) 11, context, this));
        this.glassEngine.c(this.s0);
        uic l = this.s0.l(-2, true);
        this.h0 = l;
        l.h(i, aob.G6, i, i3, i2);
        eg0 baseSimpleGlass = getBaseSimpleGlass();
        ol0 l2 = dtd.l(this.resourceProvider);
        uic uicVar = this.h0;
        jl0 c = baseSimpleGlass.c.c(uicVar, null, false);
        c.p(l2);
        c.r(hl.L(20.0f));
        uicVar.setBlurredBackground(c);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.i0 = frameLayout3;
        frameLayout3.setTranslationZ(hl.L(20.0f));
        this.i0.setClipChildren(false);
        this.i0.setClipToPadding(false);
        ltc ltcVar = new ltc(context, this.h0, this.resourceProvider, new fpc(this, objArr == true ? 1 : 0), new fpc(this, (byte) 1), new fpc(this, b3));
        this.j0 = ltcVar;
        ltcVar.setClipChildren(false);
        ltc ltcVar2 = this.j0;
        jl0 c2 = baseSimpleGlass.c.c(ltcVar2, null, false);
        c2.p(l2);
        c2.r(hl.L(20.0f));
        ltcVar2.y = c2;
        ltcVar2.invalidate();
        this.i0.addView(this.j0, tre.d(-1, 40.0f, 48, 16.0f, 0.0f, 16.0f, 0.0f));
        this.s0.setPosition(this.f0);
        f1();
        this.o0.addView(this.s0);
        ViewGroup viewGroup = (ViewGroup) this.fragmentView;
        FrameLayout frameLayout4 = this.i0;
        wsc wscVar3 = this.k0;
        viewGroup.addView(frameLayout4, wscVar3 != null ? viewGroup.indexOfChild(wscVar3) : viewGroup.getChildCount(), tre.e(-1, 40, 48));
        O0(this.g0);
        x25 x25Var2 = this.H0;
        if (x25Var2 != null) {
            this.k0.Y(x25Var2);
        }
        this.a.j(new qhb(this, (byte) 9));
        l9c l9cVar = this.a.g3;
        l9cVar.r = false;
        l9cVar.O(false);
        qqc qqcVar2 = new qqc(this);
        this.t0 = qqcVar2;
        qqcVar2.b(this.a);
        V0();
        this.G0.h();
        this.simpleActionBar.post(new cpc(this, (byte) 5));
        this.a.post(new cpc(this, (byte) 6));
        return this.fragmentView;
    }

    public final void d1(int i) {
        q9c q9cVar = this.u0[i];
        if (q9cVar != null) {
            wa waVar = this.a;
            int paddingTop = (waVar != null ? waVar.getPaddingTop() : 0) + this.p0 + (i == 1 ? hl.L(4.0f) : 0);
            wa waVar2 = this.a;
            int paddingBottom = (waVar2 != null ? waVar2.getPaddingBottom() : 0) + (i == 1 ? hl.L(12.0f) : 0);
            if (q9cVar.getPaddingTop() == paddingTop && q9cVar.getPaddingBottom() == paddingBottom) {
                return;
            }
            boolean canScrollVertically = q9cVar.canScrollVertically(-1);
            if (i == 1) {
                q9cVar.setPadding(hl.L(9.0f), paddingTop, hl.L(9.0f), paddingBottom);
            } else {
                q9cVar.setPadding(0, paddingTop, 0, paddingBottom);
            }
            if (canScrollVertically) {
                return;
            }
            q9cVar.f3.g1(0, 0);
        }
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        wa waVar;
        l9c l9cVar;
        if (i2 == this.currentAccount) {
            if (i == jn7.d4 && this.w0 != null) {
                V0();
                Iterator it = this.T0.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                return;
            }
            if (i == jn7.A3) {
                g1();
                return;
            }
            byte b = 0;
            if (i == jn7.q0) {
                if (objArr.length > 0) {
                    Object obj = objArr[0];
                    if (obj instanceof TL_account.Password) {
                        this.V0 = true;
                        this.W0 = ((TL_account.Password) obj).has_password;
                        wa waVar2 = this.a;
                        if (waVar2 == null || (l9cVar = waVar2.g3) == null) {
                            return;
                        }
                        l9cVar.O(true);
                        return;
                    }
                }
                getConnectionsManager().sendRequestTyped(new TL_account.getPassword(), new ic(b), new l8b(this, (byte) 10));
                return;
            }
            if (i != jn7.e4 || objArr.length <= 0) {
                return;
            }
            Object obj2 = objArr[0];
            b bVar = this.G0;
            if (obj2 != bVar || (waVar = this.a) == null || waVar.g3 == null) {
                return;
            }
            if (bVar.b.isEmpty()) {
                b bVar2 = this.G0;
                if (!bVar2.h) {
                    bVar2.h();
                }
            }
            b1(true);
        }
    }

    public final void e1() {
        spc spcVar;
        if (this.i0 != null) {
            boolean u0 = u0();
            if (this.q0 != u0 && (spcVar = this.o0) != null) {
                this.q0 = u0;
                spcVar.invalidate();
            }
            View view = s0() ? (View) this.o0.getParent() : null;
            boolean z = view != null && (this.m0 > 0.0f || this.n0 != null);
            this.i0.setVisibility(z ? 0 : 8);
            View view2 = (View) this.a.getParent();
            jla jlaVar = this.simpleActionBar;
            int height = jlaVar != null ? jlaVar.getHeight() : 0;
            if (z) {
                float y = this.a.getY() + view2.getY();
                float y2 = view.getY() + y + hl.L(2.0f);
                this.i0.setTranslationY(y2);
                float paddingTop = y + this.a.getPaddingTop() + hl.L(2.0f);
                float L = (hl.L(46.0f) + paddingTop) - Math.max(0.0f, y2 - paddingTop);
                float f = this.m0;
                height = Math.max(height, Math.round(((1.0f - f) * height) + (L * f)));
            }
            l0(this.S);
            l0(this.C0);
            l0(this.d0);
            View view3 = this.K0;
            if (view3 == null || view3.getLayoutParams().height == height) {
                return;
            }
            this.K0.getLayoutParams().height = height;
            this.K0.requestLayout();
        }
    }

    public final void f1() {
        ltc ltcVar = this.j0;
        if (ltcVar == null || this.s0 == null || ltcVar.x == 0.0f) {
            return;
        }
        ltcVar.x = 0.0f;
        ltcVar.c.setVisibility(8);
        ltcVar.invalidate();
    }

    public final void g1() {
        if (this.T == null) {
            return;
        }
        c C = c.C(this.currentAccount);
        boolean z = this.T.isAttachedToWindow() && this.T.isLaidOut();
        fqc fqcVar = this.T;
        FrameLayout frameLayout = this.U;
        Boolean bool = C.i;
        fqcVar.j(frameLayout, (bool == null || !bool.booleanValue() || TextUtils.isEmpty(C.j)) ? false : true, z);
        long j = 0;
        if (!TextUtils.isEmpty(C.x())) {
            ArrayList arrayList = C.J;
            int size = arrayList.size();
            int i = 0;
            long j2 = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                b35 b35Var = (b35) obj;
                if (!b35Var.e) {
                    long j3 = b35Var.c;
                    if (j3 >= 0) {
                        j2 += j3;
                    }
                }
            }
            j = j2;
        }
        boolean z2 = j > 500000000;
        if (z2) {
            this.X.setText(p0(2131742712, j));
        }
        this.T.j(this.W, z2, z);
        long j4 = jxa.v(this.currentAccount, true).m().amount;
        boolean z3 = j4 > 500000000;
        if (z3) {
            this.Z.setText(p0(2131742750, j4));
        }
        this.T.j(this.Y, z3, z);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final d79 getListViewForSimpleGlass() {
        return this.a;
    }

    public final void h0(boolean z) {
        hl.r(this.O0);
        float f = z ? 1.0f : 0.0f;
        if (this.M0 == f) {
            return;
        }
        this.M0 = f;
        ValueAnimator valueAnimator = this.N0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        X0();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.L0, f);
        this.N0 = ofFloat;
        ofFloat.setDuration(z ? 260L : 120L);
        this.N0.setInterpolator(z ? new k43(0.05d, 0.7d, 0.1d, 1.0d) : new k43(0.4d, 0.0d, 0.2d, 1.0d));
        this.N0.addUpdateListener(new epc(this, (byte) 1));
        this.N0.addListener(new omb(this, (byte) 25));
        this.N0.start();
    }

    public final void i0() {
        jla jlaVar;
        if (this.F == null || (jlaVar = this.simpleActionBar) == null || !(jlaVar.getParent() instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) this.simpleActionBar.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        if (this.F.getParent() != this.simpleActionBar) {
            hl.B2(this.F);
            this.simpleActionBar.addView(this.F, tre.c(56.0f, -1));
        }
        this.F.bringToFront();
        this.F.post(new cpc(this, (byte) 6));
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final FrameLayout k0(TextView textView, Runnable runnable) {
        Context context = textView.getContext();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(hl.L(16.0f), hl.L(14.0f), hl.L(16.0f), hl.L(14.0f));
        int i = aob.i6;
        hf0 f0 = aob.f0(getThemedColor(i), 2, -1);
        uob M = yob.M(i);
        vnb resourceProvider = getResourceProvider();
        frameLayout.setBackground(f0);
        yob.j(frameLayout, f0, null, M, resourceProvider);
        yob.X(textView, aob.G6, getResourceProvider());
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(hl.o());
        textView.setGravity(19);
        frameLayout.addView(textView, tre.d(-1, -2.0f, 3, 0.0f, 0.0f, 42.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.attach_arrow_right);
        yob.s(imageView, aob.z6, getResourceProvider(), PorterDuff.Mode.SRC_IN);
        frameLayout.addView(imageView, tre.e(-2, -2, 21));
        frameLayout.setOnClickListener(new el3(runnable, (byte) 9));
        textView.setDuplicateParentStateEnabled(true);
        iye.b(textView, 0.02f, 1.2f);
        this.T.addView(frameLayout, tre.o(-1, -2));
        return frameLayout;
    }

    public final void l0(ViewGroup viewGroup) {
        float f;
        if (viewGroup != null) {
            float f2 = 0.0f;
            View view = viewGroup;
            while (true) {
                if (view == null) {
                    break;
                }
                if (view != this.a) {
                    f2 += view.getY();
                    view = view.getParent() instanceof View ? (View) view.getParent() : null;
                } else if (viewGroup.getHeight() > 0) {
                    f = Utilities.l(((f2 + viewGroup.getHeight()) - this.a.getPaddingTop()) / viewGroup.getHeight());
                }
            }
            f = 1.0f;
            if (viewGroup.getAlpha() != f) {
                viewGroup.setAlpha(f);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onBackPressed(boolean z) {
        jz8 jz8Var = this.Q0;
        if (jz8Var != null) {
            if (z) {
                jz8Var.e();
            }
            return false;
        }
        ltc ltcVar = this.j0;
        if (ltcVar == null || !ltcVar.E) {
            return super.onBackPressed(z);
        }
        if (z) {
            ltcVar.b(false);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onBeginSlide() {
        qqc qqcVar = this.t0;
        if (qqcVar != null) {
            qqcVar.c();
        }
        wa waVar = this.a;
        if (waVar != null) {
            waVar.E0();
        }
        q9c q0 = q0();
        if (q0 != null) {
            q0.E0();
        }
        super.onBeginSlide();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onFragmentCreate() {
        Context context = a.b;
        byte b = 0;
        if (wqc.k0.compareAndSet(false, true)) {
            wqc.l0.postRunnable(new xf1(context, (byte) 27));
        }
        getNotificationCenter().b(this, jn7.d4);
        getNotificationCenter().b(this, jn7.A3);
        getNotificationCenter().b(this, jn7.e4);
        getNotificationCenter().b(this, jn7.q0);
        c C = c.C(this.currentAccount);
        x25 A = C.A();
        this.H0 = A;
        cpc cpcVar = this.J0;
        ArrayList arrayList = A.d;
        if (!arrayList.contains(cpcVar)) {
            arrayList.add(cpcVar);
        }
        hl3 hl3Var = this.X0;
        if (hl3Var != null) {
            hl3Var.run();
        }
        int i = C.F;
        C.F = i + 1;
        HashSet hashSet = C.G;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(Integer.valueOf(i));
        if (isEmpty) {
            C.a0();
        }
        this.X0 = new hl3((Object) C, i, (byte) 12);
        getConnectionsManager().sendRequestTyped(new TL_account.getPassword(), new ic(b), new l8b(this, (byte) 10));
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onFragmentDestroy() {
        jz8 jz8Var = this.Q0;
        if (jz8Var != null) {
            jz8Var.g();
            hl.B2(this.Q0);
            this.Q0 = null;
        }
        hl.r(this.O0);
        ValueAnimator valueAnimator = this.N0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        wsc wscVar = this.k0;
        if (wscVar != null) {
            wscVar.p();
        }
        iqc iqcVar = this.e;
        if (iqcVar != null) {
            iqcVar.setOnFrontContentPresented(null);
        }
        ValueAnimator valueAnimator2 = this.n0;
        if (valueAnimator2 != null) {
            this.n0 = null;
            valueAnimator2.cancel();
        }
        x25 x25Var = this.H0;
        if (x25Var != null) {
            x25Var.d.remove(this.J0);
        }
        T0();
        qqc qqcVar = this.t0;
        if (qqcVar != null) {
            qqcVar.b(null);
        }
        getNotificationCenter().n(this, jn7.d4);
        getNotificationCenter().n(this, jn7.A3);
        getNotificationCenter().n(this, jn7.e4);
        getNotificationCenter().n(this, jn7.q0);
        hl.B2(this.F);
        b bVar = this.G0;
        if (bVar != null) {
            bVar.a();
        }
        super.onFragmentDestroy();
        hl3 hl3Var = this.X0;
        if (hl3Var != null) {
            hl3Var.run();
            this.X0 = null;
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onInsets(int i, int i2, int i3, int i4) {
        if (this.o0 != null) {
            d1(0);
            d1(1);
            this.o0.requestLayout();
        }
        p66 p66Var = this.a0;
        if (p66Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) p66Var.getLayoutParams();
            layoutParams.bottomMargin = hl.L(24.0f) + i4;
            this.a0.setLayoutParams(layoutParams);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onPause() {
        super.onPause();
        jz8 jz8Var = this.Q0;
        if (jz8Var != null) {
            jz8Var.g();
            hl.B2(this.Q0);
            this.Q0 = null;
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        if (i != 44 || getParentActivity() == null) {
            return;
        }
        if (iArr.length > 0 && iArr[0] == 0) {
            N0();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.a.U = hl.S2(ob6.M0(2131746230, null));
        alertDialog$Builder.j(ob6.M0(2131747027, null), new bpc(this));
        alertDialog$Builder.g(ob6.M0(2131751737, null), null);
        int i2 = aob.L5;
        alertDialog$Builder.l(R.raw.permission_request_camera, 72, aob.w0(null, i2, false), null);
        alertDialog$Builder.m(i2, null);
        alertDialog$Builder.o();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onResume() {
        super.onResume();
        jla jlaVar = this.simpleActionBar;
        if (jlaVar != null) {
            jlaVar.post(new cpc(this, (byte) 5));
        }
        c.C(this.currentAccount).J();
        if (this.H0 != null && c.C(this.currentAccount).M()) {
            this.H0.d();
        }
        V0();
        if (this.a != null) {
            b1(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            if (this.w0 != null && this.x0 != null && this.e != null) {
                Y0(this.A0);
            }
            iqc iqcVar = this.e;
            if (iqcVar != null && this.E0 != null && this.F0 != null) {
                Z0(iqcVar.getStickerStyle());
            }
            p66 p66Var = this.a0;
            if (p66Var != null) {
                p66Var.invalidate();
            }
            TextView textView = this.X;
            if (textView != null) {
                textView.invalidate();
            }
            TextView textView2 = this.Z;
            if (textView2 != null) {
                textView2.invalidate();
            }
            fqc fqcVar = this.T;
            if (fqcVar != null) {
                fqcVar.invalidate();
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        jla jlaVar = this.simpleActionBar;
        if (jlaVar != null && jlaVar.getParent() == view) {
            FrameLayout frameLayout = (FrameLayout) view;
            View view2 = new View(view.getContext());
            this.K0 = view2;
            view2.setOutlineProvider(null);
            this.K0.setTranslationZ(hl.L(20.0f));
            int indexOfChild = frameLayout.indexOfChild(this.simpleActionBar);
            FrameLayout frameLayout2 = this.i0;
            if (frameLayout2 != null && frameLayout2.getParent() == frameLayout) {
                indexOfChild = Math.min(indexOfChild, frameLayout.indexOfChild(this.i0));
            }
            frameLayout.addView(this.K0, indexOfChild, tre.e(-1, 0, 48));
            this.K0.setBackground(getBaseSimpleGlass().a(this.K0));
            this.simpleActionBar.setBackground(null);
        }
        jla jlaVar2 = this.simpleActionBar;
        if (jlaVar2 != null) {
            jlaVar2.setOutlineProvider(null);
            this.simpleActionBar.setTranslationZ(hl.L(20.0f));
        }
        getBaseSimpleGlass().o = new mr0(this, (byte) 12);
    }

    public final CharSequence p0(int i, long j) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((char) 65532);
        wm2 wm2Var = new wm2(R.drawable.mini_gram_16, 0);
        wm2Var.d = false;
        spannableStringBuilder.setSpan(wm2Var, length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) " ");
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) c.s(j, false));
        spannableStringBuilder.setSpan(new ho4(aob.Fi, getResourceProvider()), length2, spannableStringBuilder.length(), 33);
        return ob6.V(null, null, i, spannableStringBuilder);
    }

    public final q9c q0() {
        if (s0()) {
            ir1 ir1Var = this.s0;
            View currentView = ir1Var == null ? null : ir1Var.getCurrentView();
            if (currentView instanceof q9c) {
                return (q9c) currentView;
            }
        }
        return null;
    }

    public final boolean s0() {
        spc spcVar;
        if (this.r0 || (spcVar = this.o0) == null || !spcVar.isAttachedToWindow()) {
            return false;
        }
        ViewParent parent = this.o0.getParent();
        wa waVar = this.a;
        return parent == waVar.f3.m(waVar.g3.E.size() - 1);
    }

    public final boolean t0() {
        View m;
        wa waVar = this.a;
        return waVar != null && (m = waVar.f3.m(this.h)) != null && this.B0 < 0.5f && m.getBottom() > this.a.getPaddingTop();
    }

    public final boolean u0() {
        spc spcVar = this.o0;
        return spcVar != null && this.a != null && (spcVar.getParent() instanceof View) && ((View) this.o0.getParent()).getTop() <= this.a.getPaddingTop();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean useFadeDrawableForActionBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean useSimpleActionBar() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y0(Context context, sla slaVar, View view) {
        c C = c.C(this.currentAccount);
        final fu5 J = fu5.J(this, view);
        J.b0(0.0f, -hl.L(48.0f));
        final byte b = 0;
        J.s = (short) 0;
        J.W(5);
        fu5 K = J.K();
        K.b(R.drawable.ic_ab_back, ob6.M0(2131742843, null), new vn1(J, b), false);
        K.j();
        ScrollView scrollView = new ScrollView(context);
        LinearLayout linearLayout = new LinearLayout(context);
        final byte b2 = 1;
        linearLayout.setOrientation(1);
        scrollView.addView(linearLayout);
        kta ktaVar = new kta((Object) this, (Object) linearLayout, (Object) C, (Object) J, (byte) 29);
        K.q(scrollView, tre.o(-1, jn7.U5));
        J.b(R.drawable.wallet_globe, ob6.M0(2131742799, null), new b6c(ktaVar, J, K, (byte) 17), false);
        b8 z = J.z();
        s43 s43Var = C.h;
        String i = s43Var.i();
        boolean isEmpty = TextUtils.isEmpty(i);
        String str = i;
        if (isEmpty) {
            z.setSubtext("USD");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ob6.M0(2131748533, null));
            spannableStringBuilder.setSpan(new ya6(hl.L(75.0f), z.b), 0, spannableStringBuilder.length(), 33);
            str = spannableStringBuilder;
        }
        z.setSubtext(str);
        final ipc ipcVar = new ipc(C, new boolean[]{s43Var.f() != null}, z, ktaVar, (byte) 0);
        this.T0.add(ipcVar);
        ktaVar.run();
        J.b(R.drawable.wallet_lock, ob6.M0(2131747384, null), new Runnable(this) { // from class: jpc
            public final /* synthetic */ uqc b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b3 = b;
                fu5 fu5Var = J;
                uqc uqcVar = this.b;
                uqcVar.getClass();
                switch (b3) {
                    case 0:
                        fu5Var.u();
                        uqcVar.presentFragment(PasscodeActivity.m0());
                        break;
                    case 1:
                        fu5Var.u();
                        uqcVar.presentFragment(new gtc());
                        break;
                    case 2:
                        fu5Var.u();
                        uqcVar.presentFragment(new wuc());
                        break;
                    default:
                        fu5Var.u();
                        uqc.K0(uqcVar.getParentActivity(), uqcVar.getResourceProvider());
                        break;
                }
            }
        }, false);
        J.b(R.drawable.wallet_key, ob6.M0(2131742730, null), new Runnable(this) { // from class: jpc
            public final /* synthetic */ uqc b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b3 = b2;
                fu5 fu5Var = J;
                uqc uqcVar = this.b;
                uqcVar.getClass();
                switch (b3) {
                    case 0:
                        fu5Var.u();
                        uqcVar.presentFragment(PasscodeActivity.m0());
                        break;
                    case 1:
                        fu5Var.u();
                        uqcVar.presentFragment(new gtc());
                        break;
                    case 2:
                        fu5Var.u();
                        uqcVar.presentFragment(new wuc());
                        break;
                    default:
                        fu5Var.u();
                        uqc.K0(uqcVar.getParentActivity(), uqcVar.getResourceProvider());
                        break;
                }
            }
        }, false);
        final byte b3 = 2;
        J.k(R.drawable.wallet_apps, ob6.M0(2131742807, null), new Runnable(this) { // from class: jpc
            public final /* synthetic */ uqc b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b32 = b3;
                fu5 fu5Var = J;
                uqc uqcVar = this.b;
                uqcVar.getClass();
                switch (b32) {
                    case 0:
                        fu5Var.u();
                        uqcVar.presentFragment(PasscodeActivity.m0());
                        break;
                    case 1:
                        fu5Var.u();
                        uqcVar.presentFragment(new gtc());
                        break;
                    case 2:
                        fu5Var.u();
                        uqcVar.presentFragment(new wuc());
                        break;
                    default:
                        fu5Var.u();
                        uqc.K0(uqcVar.getParentActivity(), uqcVar.getResourceProvider());
                        break;
                }
            }
        }, !C.g.d.isEmpty());
        J.j();
        final byte b4 = 3;
        J.b(R.drawable.wallet_help, ob6.M0(2131742591, null), new Runnable(this) { // from class: jpc
            public final /* synthetic */ uqc b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b32 = b4;
                fu5 fu5Var = J;
                uqc uqcVar = this.b;
                uqcVar.getClass();
                switch (b32) {
                    case 0:
                        fu5Var.u();
                        uqcVar.presentFragment(PasscodeActivity.m0());
                        break;
                    case 1:
                        fu5Var.u();
                        uqcVar.presentFragment(new gtc());
                        break;
                    case 2:
                        fu5Var.u();
                        uqcVar.presentFragment(new wuc());
                        break;
                    default:
                        fu5Var.u();
                        uqc.K0(uqcVar.getParentActivity(), uqcVar.getResourceProvider());
                        break;
                }
            }
        }, false);
        ula simpleMenuOverlay = getSimpleMenuOverlay();
        if (simpleMenuOverlay != null) {
            simpleMenuOverlay.setOutlineProvider(null);
            simpleMenuOverlay.setTranslationZ(hl.L(20.0f));
            ViewGroup viewGroup = J.A;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                jla jlaVar = this.simpleActionBar;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                ula menuOverlay = jlaVar.getMenuOverlay();
                if (menuOverlay != null && slaVar.getParent() == jlaVar.d) {
                    menuOverlay.e(jlaVar, slaVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                    J.p = new cx0(simpleMenuOverlay, (byte) 3);
                    simpleMenuOverlay.setOnClosed(new Runnable(this) { // from class: hpc
                        public final /* synthetic */ uqc b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b5 = b2;
                            ipc ipcVar2 = ipcVar;
                            uqc uqcVar = this.b;
                            switch (b5) {
                                case 0:
                                    uqcVar.T0.remove(ipcVar2);
                                    break;
                                default:
                                    uqcVar.T0.remove(ipcVar2);
                                    break;
                            }
                        }
                    });
                    return;
                }
            }
        }
        J.p = new Runnable(this) { // from class: hpc
            public final /* synthetic */ uqc b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b5 = b;
                ipc ipcVar2 = ipcVar;
                uqc uqcVar = this.b;
                switch (b5) {
                    case 0:
                        uqcVar.T0.remove(ipcVar2);
                        break;
                    default:
                        uqcVar.T0.remove(ipcVar2);
                        break;
                }
            }
        };
        J.a0();
    }

    public final void z0() {
        m01.u(getParentActivity(), c.C(this.currentAccount).j);
    }
}
