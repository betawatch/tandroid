// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;
import j$.util.Objects;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public class vqa extends fy0 implements gk7 {
    public TL_stars.SavedStarGift A2;
    public ysa B2;
    public k27 C2;
    public String D2;
    public TL_stars.TL_starGiftUnique E2;
    public boolean F2;
    public boolean G2;
    public boolean H2;
    public boolean I2;
    public boolean J2;
    public hqa K2;
    public boolean L2;
    public ipa M2;
    public final int[] N2;
    public gx0 O2;
    public int P2;
    public String Q2;
    public x99 R2;
    public final long S1;
    public cm2 S2;
    public final jo0 T1;
    public boolean T2;
    public final fpa U1;
    public yoa U2;
    public final qh4 V1;
    public Float V2;
    public final View W1;
    public xpa W2;
    public hv4 X1;
    public ValueAnimator X2;
    public hv4 Y1;
    public cm2 Y2;
    public final hpa Z1;
    public boolean Z2;
    public final rqa a2;
    public TL_wallet.nftItem a3;
    public final gpa b2;
    public qlc b3;
    public final l46 c2;
    public rlc c3;
    public final mfb d2;
    public TL_wallet.walletTransaction d3;
    public final l46 e2;
    public final LinearLayout e3;
    public final u41 f2;
    public final TextView f3;
    public final FrameLayout g2;
    public final TextView g3;
    public final l46 h2;
    public View h3;
    public final FrameLayout i2;
    public eq8 i3;
    public final View j2;
    public boolean j3;
    public final FrameLayout k2;
    public Boolean k3;
    public tqa l2;
    public boolean l3;
    public boolean m2;
    public ArrayList m3;
    public final gpa n2;
    public ArrayList n3;
    public final ac[] o2;
    public ArrayList o3;
    public final View p2;
    public boolean p3;
    public final LinearLayout q2;
    public TLRPC.PaymentForm q3;
    public final wf2 r2;
    public final cm2[] r3;
    public final TextView s2;
    public final nna s3;
    public final LinearLayout t2;
    public int t3;
    public final wf2 u2;
    public Boolean u3;
    public boolean v2;
    public boolean v3;
    public final gpa w2;
    public je5 w3;
    public final TextView x2;
    public View x3;
    public final gpa y2;
    public boolean z2;

    public vqa(Context context, int i, long j, wjb wjbVar, View view) {
        super(context, null, false, false, wjbVar);
        this.m2 = false;
        this.N2 = new int[2];
        this.P2 = -1;
        this.Q2 = "";
        this.W2 = new xpa(0, 0);
        this.Z2 = true;
        this.r3 = new cm2[1];
        this.s3 = new nna(this, (byte) 16);
        this.v3 = true;
        this.a = i;
        this.S1 = j;
        this.u1 = Math.max(0.05f, gl.L(82.0f) / (gl.q.y + gl.m));
        this.x = true;
        this.b = new oc6((byte) 24, context, this);
        jo0 jo0Var = new jo0(this, context);
        this.T1 = jo0Var;
        fpa fpaVar = new fpa(this, context);
        this.U1 = fpaVar;
        fpaVar.setAdapter(new bn0((byte) 6, context, this));
        C2();
        View view2 = new View(context);
        this.W1 = view2;
        int i2 = bkb.g5;
        zkb.h(i2, wjbVar, view2);
        FrameLayout.LayoutParams e = nme.e(-1, 50, 80);
        int i3 = this.u0;
        e.rightMargin = i3;
        e.leftMargin = i3;
        this.b.addView(view2, e);
        this.b.addView(fpaVar, nme.e(-1, -1, kk7.D1));
        M(i2);
        gl.B2(this.n1);
        jo0Var.addView(this.n1, nme.e(-1, -1, kk7.D1));
        if (Build.VERSION.SDK_INT >= 26) {
            this.n1.setDefaultFocusHighlightEnabled(false);
        }
        gpa gpaVar = new gpa(this, context, (byte) 0);
        this.b2 = gpaVar;
        gpaVar.setOrientation(1);
        gpaVar.setPadding(gl.L(14.0f) + this.u0, gl.L(16.0f), gl.L(14.0f) + this.u0, gl.L(68.0f));
        jo0Var.addView(gpaVar, nme.e(-1, -1, 55));
        LinearLayout linearLayout = new LinearLayout(context);
        this.e3 = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        this.f3 = textView;
        textView.setSingleLine(true);
        textView.setGravity(17);
        textView.setIncludeFontPadding(false);
        ir2.t(textView, 1, 40.0f);
        int i4 = bkb.Ei;
        zkb.X(textView, i4, wjbVar);
        linearLayout.addView(textView, nme.r(-1, 50, 1));
        TextView textView2 = new TextView(context);
        this.g3 = textView2;
        textView2.setGravity(17);
        textView2.setIncludeFontPadding(false);
        textView2.setTextSize(1, 14.0f);
        zkb.X(textView2, bkb.y6, wjbVar);
        linearLayout.addView(textView2, nme.t(-1, 20, 1, 0, 3, 0, 0));
        gpaVar.addView(linearLayout, nme.k(0.0f, 4.0f, 0.0f, 16.0f, -1, -2));
        linearLayout.setVisibility(8);
        l46 l46Var = new l46(context, wjbVar);
        this.c2 = l46Var;
        int i5 = bkb.p5;
        zkb.X(l46Var, i5, wjbVar);
        l46Var.setTextSize(1, 12.0f);
        l46Var.setGravity(17);
        l46Var.setLineSpacing(gl.L(2.0f), 1.0f);
        zkb.G(l46Var, bkb.Wc, wjbVar);
        l46Var.setDisablePaddingsOffsetY(true);
        gpaVar.addView(l46Var, nme.t(-2, -2, 1, 4, -2, 4, 16));
        l46Var.setVisibility(8);
        mfb mfbVar = new mfb(context, wjbVar);
        this.d2 = mfbVar;
        gpaVar.addView(mfbVar, nme.k(0.0f, 0.0f, 0.0f, 12.0f, -1, -2));
        l46 l46Var2 = new l46(context, wjbVar);
        this.e2 = l46Var2;
        zkb.X(l46Var2, i5, wjbVar);
        l46Var2.setTextSize(1, 12.0f);
        l46Var2.setGravity(17);
        l46Var2.setLineSpacing(gl.L(2.0f), 1.0f);
        zkb.G(l46Var2, i4, wjbVar);
        l46Var2.setDisablePaddingsOffsetY(true);
        l46Var2.setPadding(gl.L(5.0f), 0, gl.L(5.0f), 0);
        gpaVar.addView(l46Var2, nme.t(-2, -2, 1, 4, 2, 4, 8));
        l46Var2.setVisibility(8);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.t2 = linearLayout2;
        linearLayout2.setPadding(gl.L(12.0f), gl.L(8.0f), gl.L(12.0f), gl.L(8.0f));
        linearLayout2.setOrientation(0);
        int i6 = bkb.h6;
        ff0 Y = bkb.Y(bkb.v0(i6, wjbVar), 21, 21);
        vkb M = zkb.M(i6);
        linearLayout2.setBackground(Y);
        zkb.j(linearLayout2, Y, null, M, wjbVar);
        wf2 wf2Var = new wf2(24, wjbVar, context);
        this.u2 = wf2Var;
        int i7 = bkb.g7;
        int i8 = bkb.i7;
        int i9 = bkb.j7;
        wf2Var.b(i7, i8, i9);
        wf2Var.setDrawUnchecked(true);
        wf2Var.a(false, false);
        wf2Var.setDrawBackgroundAsArc(10);
        linearLayout2.addView(wf2Var, nme.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView3 = new TextView(context);
        int i10 = bkb.i5;
        zkb.X(textView3, i10, wjbVar);
        ir2.r(14.0f, 1, 2131750373, textView3, null);
        linearLayout2.addView(textView3, nme.t(-2, -2, 16, 9, 0, 0, 0));
        gpaVar.addView(linearLayout2, nme.t(-2, -2, 1, 0, -4, 0, 4));
        ote.b(linearLayout2, 0.025f, 1.5f);
        linearLayout2.setOnClickListener(new lna(this, (byte) 24));
        linearLayout2.setVisibility(8);
        gpa gpaVar2 = new gpa(this, context, (byte) 1);
        this.n2 = gpaVar2;
        gpaVar2.setOrientation(1);
        gpaVar2.setPadding(gl.L(4.0f) + this.u0, gl.L(24.0f), gl.L(4.0f) + this.u0, gl.L(66.0f));
        jo0Var.addView(gpaVar2, nme.e(-1, -1, 55));
        ac[] acVarArr = {r8, r8, r8};
        this.o2 = acVarArr;
        ac acVar = new ac(wjbVar, context, false);
        acVar.a(R.drawable.menu_feature_unique, k96.M0(2131749849, null), k96.M0(2131749400, null));
        gpaVar2.addView(acVarArr[0], nme.o(-1, -2));
        ac acVar2 = new ac(wjbVar, context, false);
        acVar2.a(R.drawable.menu_feature_tradable, k96.M0(2131749843, null), k96.M0(2131749398, null));
        gpaVar2.addView(acVarArr[1], nme.o(-1, -2));
        ac acVar3 = new ac(wjbVar, context, false);
        acVar3.a(R.drawable.menu_wear, k96.M0(2131749395, null), k96.M0(2131749396, null));
        gpaVar2.addView(acVarArr[2], nme.o(-1, -2));
        View view3 = new View(context);
        this.p2 = view3;
        int i11 = bkb.c7;
        zkb.h(i11, wjbVar, view3);
        gpaVar2.addView(view3, nme.n(1.0f / gl.p, -2, 7, 17, -4, 17, 6));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.q2 = linearLayout3;
        linearLayout3.setPadding(gl.L(12.0f), gl.L(8.0f), gl.L(12.0f), gl.L(8.0f));
        linearLayout3.setOrientation(0);
        ff0 Y2 = bkb.Y(bkb.v0(i6, wjbVar), 6, 6);
        vkb M2 = zkb.M(i6);
        linearLayout3.setBackground(Y2);
        zkb.j(linearLayout3, Y2, null, M2, wjbVar);
        wf2 wf2Var2 = new wf2(24, wjbVar, context);
        this.r2 = wf2Var2;
        wf2Var2.b(i7, i8, i9);
        wf2Var2.setDrawUnchecked(true);
        wf2Var2.a(false, false);
        wf2Var2.setDrawBackgroundAsArc(10);
        linearLayout3.addView(wf2Var2, nme.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView4 = new TextView(context);
        this.s2 = textView4;
        zkb.X(textView4, i10, wjbVar);
        ir2.r(14.0f, 1, 2131750381, textView4, null);
        linearLayout3.addView(textView4, nme.t(-2, -2, 16, 9, 0, 0, 0));
        gpaVar2.addView(linearLayout3, nme.t(-2, -2, 1, 0, 0, 0, 4));
        ote.b(linearLayout3, 0.025f, 1.5f);
        gpa gpaVar3 = new gpa(this, context, (byte) 2);
        this.w2 = gpaVar3;
        gpaVar3.setOrientation(1);
        gpaVar3.setPadding(gl.L(4.0f) + this.u0, gl.L(20.0f), gl.L(4.0f) + this.u0, gl.L(66.0f));
        jo0Var.addView(gpaVar3, nme.e(-1, -1, 55));
        TextView textView5 = new TextView(context);
        this.x2 = textView5;
        zkb.X(textView5, i10, wjbVar);
        textView5.setTextSize(1, 20.0f);
        textView5.setGravity(17);
        textView5.setTypeface(gl.o());
        gpaVar3.addView(textView5, nme.t(-1, -2, 7, 20, 0, 20, 0));
        TextView textView6 = new TextView(context);
        zkb.X(textView6, i10, wjbVar);
        textView6.setTextSize(1, 14.0f);
        de9.q(textView6, 17, null, 2131749818);
        gpaVar3.addView(textView6, nme.t(-1, -2, 7, 20, 6, 20, 24));
        ac acVar4 = new ac(wjbVar, context, false);
        acVar4.a(R.drawable.menu_feature_unique, k96.M0(2131749824, null), k96.M0(2131749825, null));
        gpaVar3.addView(r6[0], nme.o(-1, -2));
        ac acVar5 = new ac(wjbVar, context, false);
        acVar5.a(R.drawable.menu_feature_cover, k96.M0(2131749822, null), k96.M0(2131749823, null));
        gpaVar3.addView(r6[1], nme.o(-1, -2));
        ac acVar6 = new ac(wjbVar, context, false);
        ac[] acVarArr2 = {acVar4, acVar5, acVar6};
        acVar6.a(R.drawable.menu_verification, k96.M0(2131749820, null), k96.M0(2131749821, null));
        gpaVar3.addView(acVarArr2[2], nme.o(-1, -2));
        gpa gpaVar4 = new gpa(this, context, (byte) 3);
        this.y2 = gpaVar4;
        gpaVar4.setOrientation(1);
        gpaVar4.setPadding(gl.L(4.0f) + this.u0, gl.L(10.0f), gl.L(4.0f) + this.u0, gl.L(92.0f));
        jo0Var.addView(gpaVar4, nme.e(-1, -1, 55));
        ac acVar7 = new ac(wjbVar, context, false);
        acVar7.a(R.drawable.menu_feature_unique, k96.M0(2131749769, null), k96.M0(2131749770, null));
        gpaVar4.addView(r7[0], nme.o(-1, -2));
        ac acVar8 = new ac(wjbVar, context, false);
        acVar8.a(R.drawable.menu_random, k96.M0(2131749767, null), k96.M0(2131749768, null));
        gpaVar4.addView(r7[1], nme.o(-1, -2));
        ac acVar9 = new ac(wjbVar, context, false);
        ac[] acVarArr3 = {acVar7, acVar8, acVar9};
        acVar9.a(R.drawable.menu_feature_affect, k96.M0(2131749765, null), k96.M0(2131749766, null));
        gpaVar4.addView(acVarArr3[2], nme.o(-1, -2));
        gpaVar.setAlpha(1.0f);
        gpaVar2.setAlpha(0.0f);
        gpaVar3.setAlpha(0.0f);
        gpaVar4.setAlpha(0.0f);
        rqa rqaVar = new rqa(context, wjbVar, new nna(this, (byte) 17), new lna(this, (byte) 25), new lna(this, (byte) 26), new lna(this, (byte) 27), new lna(this, (byte) 28), new lna(this, (byte) 29), new roa(this, (byte) 0), new roa(this, (byte) 1));
        this.a2 = rqaVar;
        rqaVar.N.c.setOnClickListener(new lna(this, (byte) 22));
        int i12 = this.u0;
        rqaVar.setPadding(i12, 0, i12, 0);
        jo0Var.addView(rqaVar, nme.e(-1, -2, 55));
        zr zrVar = this.m1;
        this.J1 = true;
        zrVar.j1(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.g2 = frameLayout;
        zkb.h(i2, wjbVar, frameLayout);
        View view4 = new View(context);
        this.j2 = view4;
        zkb.h(i11, wjbVar, view4);
        view4.setAlpha(0.0f);
        frameLayout.addView(view4, nme.a(-1.0f, 1.0f / gl.p, 55));
        u41 i13 = yjb.i(24, wjbVar, context, true);
        this.f2 = i13;
        i13.i(k96.M0(2131747638, null), false, true);
        i13.g(null, false);
        FrameLayout.LayoutParams d = nme.d(-1, 48.0f, kk7.D1, 0.0f, 12.0f, 0.0f, 12.0f);
        d.leftMargin = gl.L(14.0f) + this.u0;
        d.rightMargin = gl.L(14.0f) + this.u0;
        frameLayout.addView(i13, d);
        jo0Var.addView(frameLayout, nme.e(-1, 72, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.i2 = frameLayout2;
        zkb.h(i2, wjbVar, frameLayout2);
        l46 l46Var3 = new l46(context, null);
        this.h2 = l46Var3;
        l46Var3.setTextSize(1, 12.0f);
        zkb.X(l46Var3, i4, wjbVar);
        zkb.G(l46Var3, i4, wjbVar);
        l46Var3.setGravity(17);
        frameLayout2.addView(l46Var3, nme.d(-1, -2.0f, 17, 16.0f, 8.0f, 16.0f, 14.0f));
        jo0Var.addView(frameLayout2, nme.e(-1, -2, 87));
        frameLayout2.setVisibility(8);
        this.n1.setOnScrollListener(new n58(this, (byte) 25));
        linearLayout3.setOnClickListener(new lna(this, (byte) 23));
        qh4 qh4Var = new qh4(context);
        this.V1 = qh4Var;
        jo0Var.addView(qh4Var, nme.c(-1.0f, -1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.k2 = frameLayout3;
        frameLayout3.setPadding(gl.L(6.0f) + this.u0, 0, gl.L(6.0f) + this.u0, 0);
        jo0Var.addView(frameLayout3, nme.d(-1, 200.0f, 87, 0.0f, 0.0f, 0.0f, 60.0f));
        gl.B2(this.o1);
        jo0Var.addView(this.o1, nme.d(-1, -2.0f, 0, 6.0f, 0.0f, 6.0f, 0.0f));
        hpa hpaVar = new hpa(context);
        this.Z1 = hpaVar;
        jo0Var.addView(hpaVar, nme.e(-1, -2, 55));
        ArrayList arrayList = new ArrayList();
        if (view != null) {
            arrayList.add(view);
        }
        gl.k2(new ae9(hpaVar, (byte) 8), 12.0f, 12, arrayList);
    }

    public static boolean D1(int i, TL_stars.StarGift starGift) {
        if (!cq7.m(starGift)) {
            return false;
        }
        if (!na7.q1(i).k4.n0.f) {
            return true;
        }
        if (((TL_stars.TL_starGiftUnique) starGift).fixed_sale) {
            return false;
        }
        return !r2.s.f;
    }

    public static boolean F1(int i, long j) {
        return j >= 0 ? y6c.h(i).e() == j : hc2.w(5, na7.q1(i).K0(Long.valueOf(-j)));
    }

    public static boolean G1(int i, long j) {
        if (j >= 0) {
            return y6c.h(i).e() == j;
        }
        TLRPC.Chat K0 = na7.q1(i).K0(Long.valueOf(-j));
        return K0 != null && K0.creator;
    }

    public static boolean I1(int i, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        if (tL_starGiftUnique == null) {
            return false;
        }
        TLRPC.Peer peer = tL_starGiftUnique.owner_id;
        if (peer == null) {
            peer = tL_starGiftUnique.host_id;
        }
        long n = cf3.n(peer);
        if (n == 0) {
            return false;
        }
        if (n > 0) {
            TLRPC.User V1 = na7.q1(i).V1(Long.valueOf(n));
            if (V1 != null) {
                TLRPC.EmojiStatus emojiStatus = V1.emoji_status;
                return (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) && ((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id == tL_starGiftUnique.id;
            }
        } else {
            TLRPC.Chat K0 = na7.q1(i).K0(Long.valueOf(-n));
            if (K0 != null) {
                TLRPC.EmojiStatus emojiStatus2 = K0.emoji_status;
                if ((emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) && ((TLRPC.TL_emojiStatusCollectible) emojiStatus2).collectible_id == tL_starGiftUnique.id) {
                    return true;
                }
            }
        }
        return false;
    }

    public static TableRow Y0(mfb mfbVar, String str, String str2, wjb wjbVar) {
        if (!WalletEngine2.isValidAddress(str2)) {
            return mfbVar.f(str, str2, null, null);
        }
        float L = gl.L(14.0f);
        TextView cpaVar = new cpa(mfbVar.getContext(), L);
        cpaVar.setTypeface(gl.n1("fonts/rmono.ttf"));
        int i = 0;
        cpaVar.setTextSize(0, L);
        cpaVar.setLineSpacing(gl.L(2.0f), 1.0f);
        zkb.X(cpaVar, bkb.F6, wjbVar);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i2 = 0;
        while (i < str2.length()) {
            int i3 = i2 / 4;
            int i4 = i2 % 4;
            if (i2 > 0) {
                spannableStringBuilder.append((CharSequence) (i4 == 0 ? "\n" : " "));
            }
            int length = spannableStringBuilder.length();
            int i5 = i + 4;
            spannableStringBuilder.append((CharSequence) str2, i, Math.min(str2.length(), i5));
            if (((i3 + i4) & 1) == 1) {
                spannableStringBuilder.setSpan(new cm4(bkb.x6, wjbVar), length, spannableStringBuilder.length(), 33);
            }
            i2++;
            i = i5;
        }
        cpaVar.setText(spannableStringBuilder);
        return mfbVar.c(cpaVar, str);
    }

    public static void Z0(mfb mfbVar, TL_stars.StarGiftAttribute starGiftAttribute) {
        String M0;
        if (starGiftAttribute instanceof TL_stars.starGiftAttributeModel) {
            M0 = k96.M0(2131750371, null);
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributePattern) {
            M0 = k96.M0(2131750364, null);
        } else if (!(starGiftAttribute instanceof TL_stars.starGiftAttributeBackdrop)) {
            return;
        } else {
            M0 = k96.M0(2131750372, null);
        }
        String str = M0;
        Integer[] numArr = new Integer[1];
        mfbVar.e(str, starGiftAttribute.name, z1(starGiftAttribute.rarity, numArr), null, numArr[0]);
    }

    public static void g2(d dVar) {
        d S = LaunchActivity.S();
        if (S == null) {
            return;
        }
        ag0 ag0Var = new ag0();
        ag0Var.a = true;
        S.showAsSheet(dVar, ag0Var);
    }

    public static SpannableStringBuilder j2(String str) {
        int i;
        int i2;
        int indexOf = str.indexOf("**");
        int indexOf2 = str.indexOf("**", indexOf + 1);
        String replace = str.replace("**", "");
        if (indexOf < 0 || indexOf2 < 0 || (i2 = indexOf2 - indexOf) <= 2) {
            indexOf = -1;
            i = 0;
        } else {
            i = i2 - 2;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(replace);
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new o82((byte) 1), indexOf, i + indexOf, 0);
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder k2(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        SpannableString spannableString = new SpannableString("👌");
        spannableString.setSpan(new cm2(R.drawable.filled_understood, 0), 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString("👍");
        spannableString2.setSpan(new cm2(R.drawable.filled_reactions, 0), 0, spannableString2.length(), 33);
        gl.J2(spannableStringBuilder, spannableString, "👌");
        gl.J2(spannableStringBuilder, spannableString2, "👍");
        return spannableStringBuilder;
    }

    public static boolean m1(TL_stars.SavedStarGift savedStarGift, TL_stars.SavedStarGift savedStarGift2) {
        if (savedStarGift == savedStarGift2) {
            return true;
        }
        if (savedStarGift == null) {
            return false;
        }
        TL_stars.StarGift starGift = savedStarGift.gift;
        TL_stars.StarGift starGift2 = savedStarGift2.gift;
        if (starGift != starGift2) {
            return ((starGift instanceof TL_stars.TL_starGiftUnique) && (starGift2 instanceof TL_stars.TL_starGiftUnique)) ? starGift.id == starGift2.id : (starGift instanceof TL_stars.TL_starGift) && (starGift2 instanceof TL_stars.TL_starGift) && starGift.id == starGift2.id && savedStarGift.date == savedStarGift2.date;
        }
        return true;
    }

    public static boolean n1(TL_stars.TL_starGiftUnique tL_starGiftUnique, TL_stars.TL_starGiftUnique tL_starGiftUnique2) {
        if (tL_starGiftUnique == tL_starGiftUnique2) {
            return true;
        }
        if (tL_starGiftUnique != null) {
            return tL_starGiftUnique.id == tL_starGiftUnique2.id || TextUtils.equals(tL_starGiftUnique.slug, tL_starGiftUnique2.slug);
        }
        return false;
    }

    public static String o1(int i) {
        Date date = new Date(i * 1000);
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar.setTime(date);
        k96 D0 = k96.D0();
        return k96.a0(null, null, 2131742520, (calendar.get(1) == calendar2.get(1) ? D0.p0() : D0.r0()).format(date), D0.o0().format(date));
    }

    public static String t1(TL_stars.StarGift starGift) {
        if (!(starGift instanceof TL_stars.TL_starGiftUnique)) {
            return (!(starGift instanceof TL_stars.TL_starGift) || TextUtils.isEmpty(starGift.title)) ? k96.M0(2131750176, null) : starGift.title;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(((TL_stars.TL_starGiftUnique) starGift).title);
        sb.append(" #");
        return ls6.m(r3.num, ',', sb);
    }

    public static String z1(TL_stars.StarGiftAttributeRarity starGiftAttributeRarity, Integer[] numArr) {
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityUncommon) {
            numArr[0] = -12539616;
            return k96.M0(2131749447, null);
        }
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityRare) {
            numArr[0] = -15619394;
            return k96.M0(2131749448, null);
        }
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityEpic) {
            numArr[0] = -6988581;
            return k96.M0(2131749450, null);
        }
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityLegendary) {
            numArr[0] = -4229632;
            return k96.M0(2131749449, null);
        }
        if (!(starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarity)) {
            return "";
        }
        int i = ((TL_stars.TL_starGiftAttributeRarity) starGiftAttributeRarity).permille;
        return i <= 0 ? "<0.1%" : bc.I0(i);
    }

    public final TL_stars.TL_starGiftUnique A1() {
        TL_stars.StarGift r1 = r1();
        if (r1 instanceof TL_stars.TL_starGiftUnique) {
            return (TL_stars.TL_starGiftUnique) r1;
        }
        return null;
    }

    public final void A2(boolean z) {
        vqa vqaVar;
        int i;
        int i2;
        TL_stars.TL_starGiftUnique A1 = A1();
        if (A1 == null) {
            return;
        }
        byte b = 3;
        na7.c1().edit().putInt("statusgiftpage", 3).apply();
        boolean I1 = I1(this.a, A1());
        boolean z2 = !I1;
        boolean I12 = I1(this.a, A1());
        u41 u41Var = this.f2;
        if (I12) {
            na7.q1(this.a).l5(q1(), new TLRPC.TL_emojiStatusEmpty(), null);
            vqaVar = this;
        } else {
            long q1 = q1();
            if (q1 >= 0) {
                if (!y6c.h(this.a).p()) {
                    m21 P = j().P(R.raw.star_premium_2, gl.O2(k96.M0(2131750407, null), -1, 2, new nna(this, b), null));
                    P.t = true;
                    P.j();
                    return;
                }
            } else if (!z) {
                na7 q12 = na7.q1(this.a);
                u41Var.setLoading(true);
                na7.q1(this.a).E0().a(q1, new p0c((Object) this, (Object) q12, q1, (byte) 8));
                return;
            }
            vqaVar = this;
            TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible = new TLRPC.TL_inputEmojiStatusCollectible();
            tL_inputEmojiStatusCollectible.collectible_id = A1.id;
            na7.q1(vqaVar.a).l5(vqaVar.q1(), tL_inputEmojiStatusCollectible, A1);
        }
        gw9 gw9Var = vqaVar.a2.J[1];
        if (I1) {
            i = R.drawable.filled_crown_on;
            i2 = 2131750409;
        } else {
            i = R.drawable.filled_crown_off;
            i2 = 2131750406;
        }
        gw9Var.a(i, k96.M0(i2, null), true);
        if (vqaVar.v2) {
            vqaVar.dismiss();
            return;
        }
        k08 k08Var = new k08((byte) 18, (Object) vqaVar, z2);
        if (vqaVar.W2.c(0)) {
            k08Var.run();
        } else {
            vqaVar.z2(0, true, k08Var);
        }
        u41Var.i(k96.M0(2131747638, null), !vqaVar.Z2, true);
        u41Var.g(null, !vqaVar.Z2);
        u41Var.setOnClickListener(new lna(vqaVar, (byte) 10));
    }

    public final boolean B1(boolean z) {
        return (x1(z) == null && y1(z) == null) ? false : true;
    }

    public final void B2() {
        FrameLayout frameLayout = this.i2;
        int visibility = frameLayout.getVisibility();
        FrameLayout frameLayout2 = this.k2;
        FrameLayout frameLayout3 = this.g2;
        if (visibility != 0) {
            frameLayout3.setTranslationY(0.0f);
            frameLayout.setTranslationY(0.0f);
            frameLayout2.setTranslationY(0.0f);
        } else {
            frameLayout3.setTranslationY(this.W2.a(1) * (-frameLayout.getMeasuredHeight()));
            frameLayout.setTranslationY((1.0f - this.W2.a(1)) * frameLayout.getMeasuredHeight());
            frameLayout2.setTranslationY(this.W2.a(1) * (-frameLayout.getMeasuredHeight()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void C1(byte[] bArr, TwoStepVerificationActivity twoStepVerificationActivity, boolean z, m25 m25Var) {
        TL_stars.getStarGiftWithdrawalUrl getstargiftwithdrawalurl;
        TL_stars.InputSavedStarGift u1 = u1();
        if (u1 == null) {
            if (m25Var != null) {
                m25Var.a(Boolean.FALSE);
                return;
            }
            return;
        }
        if (z) {
            TL_stars.withdrawStarGift withdrawstargift = new TL_stars.withdrawStarGift();
            withdrawstargift.keep_on_profile = this.v3;
            withdrawstargift.stargift = u1;
            withdrawstargift.tmp_password = bArr;
            getstargiftwithdrawalurl = withdrawstargift;
        } else {
            TL_stars.getStarGiftWithdrawalUrl getstargiftwithdrawalurl2 = new TL_stars.getStarGiftWithdrawalUrl();
            getstargiftwithdrawalurl2.stargift = u1;
            getstargiftwithdrawalurl2.tmp_password = bArr;
            getstargiftwithdrawalurl = getstargiftwithdrawalurl2;
        }
        ConnectionsManager.getInstance(this.a).sendRequest(getstargiftwithdrawalurl, new ji1(this, m25Var, twoStepVerificationActivity, z));
    }

    public final void C2() {
        boolean B1 = B1(false);
        fpa fpaVar = this.U1;
        fpaVar.setPosition(B1 ? 1 : 0);
        fpaVar.D(false);
        if (this.B2 == null || B1(true) || this.B2.e() >= this.B2.c()) {
            return;
        }
        this.B2.a();
    }

    public final void D2() {
        TL_stars.TL_starGiftUnique A1 = A1();
        TL_wallet.nftItem nftitem = this.a3;
        LinearLayout linearLayout = this.t2;
        if (nftitem == null || A1 == null) {
            linearLayout.setVisibility(8);
            return;
        }
        this.c2.setVisibility(8);
        this.e2.setVisibility(8);
        linearLayout.setVisibility(0);
        this.u2.a(A1.host_id != null, linearLayout.isAttachedToWindow());
    }

    @Override // fy0, fx0
    public final boolean E() {
        if (this.W2.c(4)) {
            boolean z = this.a2.N.i0;
        }
        return false;
    }

    public final boolean E1(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        if (tL_starGiftUnique != null && !TextUtils.isEmpty(tL_starGiftUnique.owner_address)) {
            c C = c.C(this.a);
            String x = C.x();
            if (TextUtils.isEmpty(x)) {
                TLRPC.Peer peer = tL_starGiftUnique.host_id;
                return peer != null && cf3.n(peer) == y6c.h(this.a).e();
            }
            if (c.b(tL_starGiftUnique.owner_address, x) || C.A().c(tL_starGiftUnique.gift_address)) {
                return true;
            }
        }
        return false;
    }

    public final TL_wallet.nftItem E2() {
        TL_wallet.nftItem nftitem = this.a3;
        if (nftitem != null) {
            return nftitem;
        }
        TL_stars.TL_starGiftUnique A1 = A1();
        if (!x2(A1)) {
            return null;
        }
        c C = c.C(this.a);
        if (A1 == null || TextUtils.isEmpty(A1.gift_address)) {
            return null;
        }
        ArrayList arrayList = C.A().b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            TL_wallet.nftItem nftitem2 = (TL_wallet.nftItem) obj;
            if (c.b(nftitem2.address, A1.gift_address)) {
                return nftitem2;
            }
        }
        TL_wallet.nftItem nftitem3 = new TL_wallet.nftItem();
        nftitem3.address = A1.gift_address;
        nftitem3.owner_address = C.x();
        nftitem3.index = "";
        nftitem3.name = A1.title + " #" + A1.num;
        nftitem3.gift = A1;
        return nftitem3;
    }

    @Override // fx0
    public final boolean F() {
        if (this.W2.c(4) && this.a2.N.i0) {
            return false;
        }
        return this.d0;
    }

    @Override // fx0
    public final boolean G(MotionEvent motionEvent) {
        if (this.W2.c(4)) {
            boolean z = this.a2.N.i0;
        }
        return false;
    }

    @Override // fy0
    public final n39 G0(o39 o39Var) {
        gx0 gx0Var = new gx0(this, (byte) 10);
        this.O2 = gx0Var;
        return gx0Var;
    }

    public final boolean H1(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        if (!ug8.A(tL_starGiftUnique) || !cq7.m(tL_starGiftUnique)) {
            return false;
        }
        if (tL_starGiftUnique.my_sale || this.a3 != null) {
            return true;
        }
        TLRPC.Peer peer = tL_starGiftUnique.host_id;
        if (peer == null || cf3.n(peer) != y6c.h(this.a).e()) {
            return !TextUtils.isEmpty(tL_starGiftUnique.owner_address) && c.b(tL_starGiftUnique.owner_address, c.C(this.a).x());
        }
        return true;
    }

    @Override // fy0
    public final int I0() {
        return gl.L(12.0f);
    }

    @Override // fy0
    public final CharSequence J0() {
        return this.Q2;
    }

    public final void J1(TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift) {
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) tL_payments_uniqueStarGift.gift;
        this.E2 = tL_starGiftUnique;
        o2(tL_starGiftUnique, false, null, null);
        super.show();
    }

    public final void K1(hd hdVar, k27 k27Var) {
        hdVar.dismiss();
        this.H2 = true;
        l2(k27Var, null);
        super.show();
    }

    public final void L1(hd hdVar, TL_stars.SavedStarGift savedStarGift) {
        if (savedStarGift != null) {
            hdVar.dismiss();
            this.J2 = true;
            n2(savedStarGift, null);
            super.show();
            return;
        }
        hdVar.dismiss();
        d S = LaunchActivity.S();
        if (S != null) {
            m21 Q = u21.b0(S).Q(R.raw.error, 36, k96.M0(2131748360, null));
            Q.t = true;
            Q.j();
        }
    }

    public final void M1() {
        TL_stars.TL_starGiftUnique A1 = A1();
        u41 u41Var = this.f2;
        if (u41Var.R || A1 == null || D1(this.a, A1) || H1(A1)) {
            return;
        }
        boolean m = cq7.m(A1);
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.E2;
        long j = this.S1;
        if (m) {
            if (tL_starGiftUnique == null || !this.F2 || j == 0) {
                j = y6c.h(this.a).e();
            }
            long j2 = j;
            if (this.E2 == null || !this.F2 || j2 == y6c.h(this.a).e()) {
                d1(A1, j2, null, true, null);
                return;
            }
            du4 du4Var = new du4(getContext(), this.J0, A1, j2);
            du4Var.E1 = new qm1((Object) this, (Object) du4Var, (Object) A1, j2, (byte) 8);
            du4Var.show();
            return;
        }
        if (tL_starGiftUnique == null || !this.F2 || j == 0) {
            j = y6c.h(this.a).e();
        }
        long j3 = j;
        oj ojVar = A1.resale_ton_only ? oj.b : oj.a;
        if (this.E2 == null || !this.F2 || j3 == y6c.h(this.a).e()) {
            u41Var.setLoading(true);
            gta.u(this.a, ojVar).E(A1, j3, null, true, new tna(this, null, ojVar, A1, j3, null, true));
        } else {
            du4 du4Var2 = new du4(getContext(), this.J0, A1, j3);
            du4Var2.E1 = new xn1(this, du4Var2, A1, j3, ojVar, (byte) 3);
            du4Var2.show();
        }
    }

    public final void N1() {
        yoa yoaVar = this.U2;
        if (yoaVar != null && !yoaVar.J) {
            yoaVar.dismiss();
        }
        String v1 = v1();
        yoa yoaVar2 = new yoa(this, getContext(), v1, v1, this.J0);
        this.U2 = yoaVar2;
        yoaVar2.n2 = new g29((Object) this, (byte) 13);
        yoaVar2.show();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007c, code lost:
    
        if (((org.telegram.tgnet.TLRPC.TL_messageActionStarGiftUnique) r4).can_craft_at > 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008d, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008b, code lost:
    
        if (r4.can_craft_at > 0) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O1() {
        TL_stars.TL_starGiftUnique A1;
        this.b2.setAlpha(this.W2.a(0));
        this.n2.setAlpha(this.W2.a(1));
        this.w2.setAlpha(this.W2.a(2));
        this.y2.setAlpha(this.W2.a(3));
        float a = 1.0f - this.W2.a(4);
        FrameLayout frameLayout = this.g2;
        frameLayout.setAlpha(a);
        xpa xpaVar = this.W2;
        rqa rqaVar = this.a2;
        rqaVar.d(xpaVar);
        ImageView imageView = rqaVar.R;
        if (this.W2.c(0) && (A1 = A1()) != null && !A1.crafted && G1(this.a, cf3.n(A1.owner_id))) {
            k27 k27Var = this.C2;
            if (k27Var != null) {
                TLRPC.Message message = k27Var.k;
                if (message != null) {
                    TLRPC.MessageAction messageAction = message.action;
                    if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    }
                }
            } else {
                TL_stars.SavedStarGift savedStarGift = this.A2;
                if (savedStarGift != null) {
                    if (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                    }
                }
            }
            imageView.setVisibility(r4);
            jo0 jo0Var = this.T1;
            float f = jo0Var.f();
            this.Z1.setAlpha(this.W2.a(0) * Utilities.l(gl.x1(f - r6.getHeight(), 0.0f, gl.L(32.0f))));
            jo0Var.h();
            jo0Var.invalidate();
            frameLayout.setVisibility(this.W2.c(4) ? 8 : 0);
            B2();
        }
        int i = 8;
        imageView.setVisibility(i);
        jo0 jo0Var2 = this.T1;
        float f2 = jo0Var2.f();
        this.Z1.setAlpha(this.W2.a(0) * Utilities.l(gl.x1(f2 - r6.getHeight(), 0.0f, gl.L(32.0f))));
        jo0Var2.h();
        jo0Var2.invalidate();
        frameLayout.setVisibility(this.W2.c(4) ? 8 : 0);
        B2();
    }

    public final void P1(TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, boolean z) {
        int i;
        if (getContext() == null) {
            return;
        }
        if (tL_error == null) {
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.s0();
            }
            u21.c0("NULL_ERROR");
            return;
        }
        byte b = 1;
        if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
            if ("SRP_ID_INVALID".equals(tL_error.text)) {
                ConnectionsManager.getInstance(this.a).sendRequest(new TL_account.getPassword(), new poa(this, twoStepVerificationActivity, z, b), 8);
                return;
            }
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.s0();
                twoStepVerificationActivity.finishFragment();
            }
            if (z && ("WALLET_CREATING".equals(tL_error.text) || "WALLET_UNAVAILABLE".equals(tL_error.text))) {
                cq7.q(getContext(), this.a, this.J0, null, tL_error.text, null);
                return;
            }
            String str = tL_error.text;
            if (str == null || !str.startsWith("FLOOD_WAIT")) {
                u21.e0(tL_error);
                return;
            } else {
                yjb.x(null, 2131750670, u21.Y(), null);
                return;
            }
        }
        if (twoStepVerificationActivity != null) {
            twoStepVerificationActivity.s0();
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        String M0 = k96.M0(2131749884, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setPadding(gl.L(24.0f), gl.L(2.0f), gl.L(24.0f), 0);
        linearLayout.setOrientation(1);
        alertDialog$Builder.n(linearLayout);
        TextView textView = new TextView(getContext());
        int i2 = bkb.i5;
        zkb.X(textView, i2, null);
        textView.setTextSize(1, 16.0f);
        textView.setGravity((k96.a0 ? 5 : 3) | 48);
        textView.setText(gl.T2(k96.M0(2131749888, null)));
        linearLayout.addView(textView, nme.o(-1, -2));
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, nme.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.list_circle);
        imageView.setPadding(k96.a0 ? gl.L(11.0f) : 0, gl.L(9.0f), k96.a0 ? 0 : gl.L(11.0f), 0);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        zkb.s(imageView, i2, null, mode);
        TextView textView2 = new TextView(getContext());
        zkb.X(textView2, i2, null);
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity((k96.a0 ? 5 : 3) | 48);
        textView2.setText(gl.T2(k96.M0(2131749887, null)));
        if (k96.a0) {
            linearLayout2.addView(textView2, nme.o(-1, -2));
            linearLayout2.addView(imageView, nme.r(-2, -2, 5));
        } else {
            linearLayout2.addView(imageView, nme.o(-2, -2));
            linearLayout2.addView(textView2, nme.o(-1, -2));
        }
        LinearLayout linearLayout3 = new LinearLayout(getContext());
        linearLayout3.setOrientation(0);
        linearLayout.addView(linearLayout3, nme.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setImageResource(R.drawable.list_circle);
        imageView2.setPadding(k96.a0 ? gl.L(11.0f) : 0, gl.L(9.0f), k96.a0 ? 0 : gl.L(11.0f), 0);
        zkb.s(imageView2, i2, null, mode);
        TextView textView3 = new TextView(getContext());
        zkb.X(textView3, i2, null);
        textView3.setTextSize(1, 16.0f);
        textView3.setGravity((k96.a0 ? 5 : 3) | 48);
        textView3.setText(gl.T2(k96.M0(2131749886, null)));
        if (k96.a0) {
            linearLayout3.addView(textView3, nme.o(-1, -2));
            i = 5;
            linearLayout3.addView(imageView2, nme.r(-2, -2, 5));
        } else {
            i = 5;
            linearLayout3.addView(imageView2, nme.o(-2, -2));
            linearLayout3.addView(textView3, nme.o(-1, -2));
        }
        if ("PASSWORD_MISSING".equals(tL_error.text)) {
            alertDialog$Builder.j(k96.M0(2131749883, null), new ho9(this, (byte) 23));
            alertDialog$Builder.g(k96.M0(2131752577, null), null);
        } else {
            TextView textView4 = new TextView(getContext());
            zkb.X(textView4, i2, null);
            textView4.setTextSize(1, 16.0f);
            de9.q(textView4, (k96.a0 ? i : 3) | 48, null, 2131749885);
            linearLayout.addView(textView4, nme.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            alertDialog$Builder.g(k96.M0(2131747638, null), null);
        }
        if (twoStepVerificationActivity != null) {
            twoStepVerificationActivity.showDialog(hdVar);
        } else {
            alertDialog$Builder.o();
        }
    }

    public final void Q1() {
        TL_stars.TL_starGiftUnique A1 = A1();
        if (A1 == null) {
            return;
        }
        if (!cq7.u(A1)) {
            jva.i1(getContext(), this.a, A1, new voa(this, A1, (byte) 2), this.J0);
        } else if (h1()) {
            V1();
        } else {
            cq7.q(getContext(), this.a, this.J0, j(), "STARGIFT_ONCHAIN_SALE_DISABLED", Boolean.valueOf(A1.fixed_sale));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ed A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R1() {
        int i;
        CharSequence V;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        long j;
        String str;
        String str2;
        ArrayList arrayList;
        String str3;
        long j2;
        String str4;
        TL_wallet.nftItem nftitem;
        String str5;
        qlc qlcVar = this.b3;
        if (qlcVar != null) {
            i = ((d) qlcVar.c).currentAccount;
            if (!koc.F(i, qlcVar.a.slug)) {
                qlc qlcVar2 = this.b3;
                koc kocVar = qlcVar2.c.k0;
                if (kocVar == null || (nftitem = qlcVar2.b) == null || (str5 = nftitem.address) == null || !str5.equals(kocVar.Q0)) {
                    Context context = getContext();
                    int i2 = this.a;
                    u21 j3 = j();
                    wjb wjbVar = this.J0;
                    TL_stars.TL_starGiftUnique A1 = A1();
                    ArrayList arrayList2 = new ArrayList(na7.q1(i2).k4.q0.f);
                    if (arrayList2.isEmpty()) {
                        return;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    int size = arrayList2.size();
                    boolean z = 0;
                    int i3 = 0;
                    while (i3 < size) {
                        int i4 = i3 + 1;
                        String str6 = (String) arrayList2.get(i3);
                        String str7 = "[^\\p{L}\\p{N}]";
                        String replaceAll = str6.replaceAll("[^\\p{L}\\p{N}]", "");
                        Locale locale = Locale.ROOT;
                        String lowerCase = replaceAll.toLowerCase(locale);
                        if (A1 == null || (str4 = A1.title) == null || !lowerCase.equals(str4.replaceAll("[^\\p{L}\\p{N}]", "").toLowerCase(locale))) {
                            gta v = gta.v(i2, z);
                            v.T();
                            ArrayList arrayList4 = v.H;
                            int size2 = arrayList4.size();
                            ArrayList arrayList5 = arrayList4;
                            int i5 = z;
                            while (i5 < size2) {
                                Object obj = arrayList5.get(i5);
                                int i6 = i5 + 1;
                                tL_starGiftUnique = A1;
                                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                                if (starGift != null) {
                                    arrayList = arrayList5;
                                    String str8 = starGift.title;
                                    if (str8 != null) {
                                        str2 = str7;
                                        if (lowerCase.equals(str8.replaceAll(str7, "").toLowerCase(Locale.ROOT))) {
                                            str3 = starGift.title;
                                            j2 = starGift.id;
                                        }
                                    } else {
                                        str2 = str7;
                                    }
                                } else {
                                    str2 = str7;
                                    arrayList = arrayList5;
                                }
                                arrayList5 = arrayList;
                                A1 = tL_starGiftUnique;
                                str7 = str2;
                                i5 = i6;
                            }
                            tL_starGiftUnique = A1;
                            j = 0;
                            str = null;
                            if (str != null) {
                                str = str6.replaceAll("(?<=[a-z0-9])(?=[A-Z])", " ");
                            }
                            String str9 = str;
                            SpannableString spannableString = new SpannableString(str9);
                            spannableString.setSpan(new bpa(new boolean[1], i2, context, wjbVar, j, str9, str6), 0, spannableString.length(), 33);
                            arrayList3.add(spannableString);
                            z = 0;
                            i3 = i4;
                            A1 = tL_starGiftUnique;
                        } else {
                            str3 = A1.title;
                            j2 = A1.gift_id;
                            tL_starGiftUnique = A1;
                        }
                        str = str3;
                        j = j2;
                        if (str != null) {
                        }
                        String str92 = str;
                        SpannableString spannableString2 = new SpannableString(str92);
                        spannableString2.setSpan(new bpa(new boolean[1], i2, context, wjbVar, j, str92, str6), 0, spannableString2.length(), 33);
                        arrayList3.add(spannableString2);
                        z = 0;
                        i3 = i4;
                        A1 = tL_starGiftUnique;
                    }
                    int i7 = z;
                    if (arrayList3.size() == 1) {
                        Object[] objArr = new Object[1];
                        objArr[i7] = arrayList3.get(i7);
                        V = k96.V(null, null, 2131742863, objArr);
                    } else {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        int i8 = 0;
                        for (int i9 = 1; i8 < arrayList3.size() - i9; i9 = 1) {
                            if (i8 > 0) {
                                spannableStringBuilder.append((CharSequence) ", ");
                            }
                            spannableStringBuilder.append((CharSequence) arrayList3.get(i8));
                            i8++;
                        }
                        V = k96.V(null, null, 2131742864, spannableStringBuilder, b00.f(1, arrayList3));
                    }
                    m21 M = j3.M(context.getResources().getDrawable(R.drawable.filled_card_color_28).mutate(), V);
                    q11 q11Var = M.e;
                    if (q11Var instanceof t11) {
                        TextView textView = ((t11) q11Var).b;
                        textView.setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
                        textView.setEllipsize(null);
                    }
                    M.j();
                    return;
                }
            }
            qlc qlcVar3 = this.b3;
            dismiss();
            Objects.requireNonNull(qlcVar3);
            gl.e3(new z6a(qlcVar3, (byte) 15), 250L);
        }
    }

    public final void S1() {
        if (y6c.h(this.a).p() && (I1(this.a, A1()) || this.T2)) {
            A2(false);
            return;
        }
        TL_stars.TL_starGiftUnique A1 = A1();
        if (A1 == null) {
            return;
        }
        TLRPC.Peer peer = A1.owner_id;
        if (peer == null) {
            peer = A1.host_id;
        }
        long n = cf3.n(peer);
        StringBuilder sb = new StringBuilder();
        sb.append(A1.title);
        sb.append(" #");
        this.x2.setText(k96.a0(null, null, 2131749817, ls6.m(A1.num, ',', sb)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(k96.M0(2131749819, null));
        if (!y6c.h(this.a).p()) {
            spannableStringBuilder.append((CharSequence) " l");
            cm2 cm2Var = this.S2;
            if (cm2Var == null) {
                cm2Var = new cm2(R.drawable.msg_mini_lock3, 0);
                this.S2 = cm2Var;
            }
            spannableStringBuilder.setSpan(cm2Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        u41 u41Var = this.f2;
        u41Var.i(spannableStringBuilder, true, true);
        u41Var.g(null, true);
        u41Var.setOnClickListener(new lna(this, (byte) 9));
        this.a2.setWearPreview(na7.q1(this.a).Z1(n));
        z2(2, true, null);
    }

    public final void T1(boolean z) {
        int i;
        k27 k27Var = this.C2;
        int i2 = 0;
        if (k27Var != null) {
            TLRPC.Message message = k27Var.k;
            if (message != null) {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    i = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).can_craft_at;
                }
            }
            i = 0;
        } else {
            TL_stars.SavedStarGift savedStarGift = this.A2;
            if (savedStarGift != null) {
                i = savedStarGift.can_craft_at;
            }
            i = 0;
        }
        byte b = 1;
        if (i > ConnectionsManager.getInstance(this.a).getCurrentTime()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.J0, getContext());
            alertDialog$Builder.a.S = k96.M0(2131749761, null);
            alertDialog$Builder.a.U = k96.a0(null, null, 2131749762, k96.x(i, true));
            b00.t(null, 2131747638, alertDialog$Builder, null);
            return;
        }
        TL_stars.TL_starGiftUnique A1 = A1();
        if (A1 == null) {
            return;
        }
        if (!TextUtils.isEmpty(A1.gift_address) && !na7.q1(this.a).k4.w.f) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, this.J0, getContext());
            alertDialog$Builder2.a.S = k96.M0(2131749776, null);
            alertDialog$Builder2.a.U = k96.M0(2131749777, null);
            b00.t(null, 2131747638, alertDialog$Builder2, null);
            return;
        }
        if (z) {
            this.a2.N.a(this.a, A1.gift_id, A1.getDocument(), A1.title);
            if (f1()) {
                upa upaVar = this.a2.N;
                TL_stars.TL_starGiftUnique A12 = A1();
                if (A12 == null) {
                    upaVar.getClass();
                } else {
                    while (true) {
                        spa[] spaVarArr = upaVar.n;
                        if (i2 >= spaVarArr.length) {
                            break;
                        }
                        spa spaVar = spaVarArr[i2];
                        TL_stars.StarGift starGift = spaVar.h;
                        if (starGift == null) {
                            starGift = null;
                        }
                        if (starGift == null) {
                            spaVar.a(A12, true);
                            break;
                        }
                        i2++;
                    }
                    upaVar.d(true);
                }
            }
        }
        this.a2.N.setOnCraft(new sna(this, b));
        if (this.R2 == null) {
            x99 x99Var = new x99(this.a, A1.gift_id);
            this.R2 = x99Var;
            x99Var.a();
        }
        this.a2.N.setOnAddGift(new voa(this, A1, b));
        this.a2.N.setOnClose(new toa(this, (byte) 2));
        z2(4, true, null);
    }

    @Override // fy0
    public final boolean U0() {
        return false;
    }

    public final void U1(long j) {
        byte b = 0;
        if (j <= 0 || !l7c.c(na7.q1(this.a).W1(j))) {
            new tv4(getContext(), this.a, j, null, new qna(this, b)).show();
        } else {
            j().Q(R.raw.error, 36, gl.T2(k96.a0(null, null, 2131743503, cf3.s(j)))).k(false);
        }
    }

    public final void V1() {
        TL_stars.TL_starGiftUnique A1 = A1();
        byte b = 0;
        if (A1 == null || !A1.fixed_sale) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.J0, getContext());
            String M0 = k96.M0(2131750248, null);
            hd hdVar = alertDialog$Builder.a;
            hdVar.S = M0;
            hdVar.U = k96.M0(2131749650, null);
            alertDialog$Builder.j(k96.M0(2131750416, null), new yna(this, b));
            alertDialog$Builder.g(k96.M0(2131752577, null), null);
            alertDialog$Builder.o();
            return;
        }
        if (h1()) {
            jq7 jq7Var = new jq7(this.a, this.J0, new wna(this, r5, A1, (byte) 1), getContext());
            jq7[] jq7VarArr = {jq7Var};
            oj ojVar = oj.b;
            long j = A1.getResellAmount(ojVar).b;
            jq7Var.u1 = true;
            jq7Var.v1 = j;
            jq7Var.r1.setText(k96.M0(2131750248, null));
            if (j > 0) {
                String b2 = nj.j(j, ojVar).b();
                EditTextBoldCursor editTextBoldCursor = jq7Var.n1;
                InputFilter[] filters = editTextBoldCursor.getFilters();
                editTextBoldCursor.setFilters(new InputFilter[0]);
                jq7Var.w1 = true;
                editTextBoldCursor.setText(b2);
                jq7Var.w1 = false;
                editTextBoldCursor.setFilters(filters);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            jq7Var.D0(jq7Var.s1);
            jq7VarArr[0].show();
        }
    }

    public final void W1() {
        TL_stars.TL_starGiftUnique A1 = A1();
        if (h1()) {
            jq7[] jq7VarArr = new jq7[1];
            jq7VarArr[0] = new jq7(this.a, this.J0, new wna(this, jq7VarArr, A1, (byte) 0), getContext());
            gr grVar = na7.q1(this.a).k4;
            jq7 jq7Var = jq7VarArr[0];
            boolean z = (A1 == null || !A1.onchain_sale) ? grVar.t.f : A1.fixed_sale;
            jq7Var.x1 = z;
            if (!jq7Var.u1) {
                jq7Var.r1.setText(k96.M0(z ? 2131749529 : 2131749516, null));
            }
            jq7Var.D0(jq7Var.s1);
            jq7VarArr[0].show();
        }
    }

    public final void X1() {
        TL_stars.TL_starGiftUnique A1 = A1();
        if (h1()) {
            Context context = getContext();
            int i = this.a;
            wjb wjbVar = this.J0;
            u41 u41Var = this.f2;
            Objects.requireNonNull(u41Var);
            zf7 zf7Var = new zf7(u41Var, (byte) 6);
            u21 j = j();
            nna nnaVar = new nna(this, (byte) 9);
            if (A1 == null || TextUtils.isEmpty(A1.slug)) {
                return;
            }
            TL_stars.cancelStarGiftOnchainSale cancelstargiftonchainsale = new TL_stars.cancelStarGiftOnchainSale();
            cancelstargiftonchainsale.slug = A1.slug;
            cq7.o(context, i, cancelstargiftonchainsale, Boolean.valueOf(A1.fixed_sale), wjbVar, zf7Var, j, new e35(A1, context, i, wjbVar, cq7.h(A1), nnaVar));
        }
    }

    public final void Y1(long j) {
        je5 je5Var = this.w3;
        if (je5Var != null) {
            je5Var.f(true);
            this.w3 = null;
        }
        dismiss();
        d S = LaunchActivity.S();
        if (S == null || l7c.B(j)) {
            return;
        }
        Bundle bundle = new Bundle();
        if (j > 0) {
            bundle.putLong("user_id", j);
            if (j == y6c.h(this.a).e()) {
                bundle.putBoolean("my_profile", true);
            }
        } else {
            bundle.putLong("chat_id", -j);
        }
        bundle.putBoolean("open_gifts", true);
        S.presentFragment(new ProfileActivity(bundle, null));
    }

    public final void Z1(boolean z, c01 c01Var, Runnable runnable) {
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        byte b = z ? (byte) 3 : (byte) 2;
        ch chVar = new ch((Object) this, (Object) twoStepVerificationActivity, z, (byte) 12);
        twoStepVerificationActivity.a0 = b;
        twoStepVerificationActivity.c0 = chVar;
        twoStepVerificationActivity.b0 = s1();
        twoStepVerificationActivity.w0(new q3a(this, runnable, c01Var, twoStepVerificationActivity));
    }

    public final void a1(TL_stars.StarGiftAttribute starGiftAttribute) {
        String M0;
        char c;
        hqa hqaVar;
        vqa vqaVar;
        TL_stars.StarGiftAttribute starGiftAttribute2;
        bm8 bm8Var;
        byte b = 0;
        if (starGiftAttribute instanceof TL_stars.starGiftAttributeModel) {
            M0 = k96.M0(2131750371, null);
            c = 2;
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributePattern) {
            M0 = k96.M0(2131750364, null);
            c = 1;
        } else {
            if (!(starGiftAttribute instanceof TL_stars.starGiftAttributeBackdrop)) {
                return;
            }
            M0 = k96.M0(2131750372, null);
            c = 0;
        }
        if (!this.L2 && ((hqaVar = this.K2) == null || !hqaVar.o)) {
            boolean[] zArr = new boolean[1];
            q41[] q41VarArr = new q41[1];
            Integer[] numArr = new Integer[1];
            String z1 = z1(starGiftAttribute.rarity, numArr);
            if (starGiftAttribute.rarity instanceof TL_stars.TL_starGiftAttributeRarity) {
                vqaVar = this;
                starGiftAttribute2 = starGiftAttribute;
                bm8Var = new bm8((Object) vqaVar, (Object) zArr, (Object) starGiftAttribute2, (Object) q41VarArr, (byte) 24);
            } else {
                vqaVar = this;
                starGiftAttribute2 = starGiftAttribute;
                bm8Var = null;
            }
            q41VarArr[0] = (q41) ((jfb) vqaVar.d2.e(M0, starGiftAttribute2.name, z1, bm8Var, numArr[0]).getChildAt(1)).getChildAt(0);
            return;
        }
        mqa mqaVar = new mqa(getContext(), this.J0, new sna(this, b));
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        mfb mfbVar = this.d2;
        tableRow.addView(new lfb(mfbVar, M0), layoutParams);
        tableRow.addView(new jfb(mfbVar, mqaVar, true), new TableRow.LayoutParams(0, -1, 1.0f));
        mfbVar.addView(tableRow);
        hqa hqaVar2 = this.K2;
        if (hqaVar2 != null) {
            if (c == 0) {
                hqaVar2.d = mqaVar;
            }
            if (c == 1) {
                hqaVar2.c = mqaVar;
            }
            if (c == 2) {
                hqaVar2.b = mqaVar;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a2() {
        int i;
        TLRPC.Message message;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        int i2;
        int i3;
        TLRPC.Message message2;
        TLRPC.Message message3;
        je5 je5Var = this.w3;
        if (je5Var != null) {
            je5Var.f(true);
            this.w3 = null;
        }
        if (w2()) {
            return;
        }
        k27 k27Var = this.C2;
        if (k27Var != null && (message3 = k27Var.k) != null) {
            TLRPC.MessageAction messageAction = message3.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                i = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).can_transfer_at;
                if (i <= ConnectionsManager.getInstance(this.a).getCurrentTime()) {
                    Context context = getContext();
                    k27 k27Var2 = this.C2;
                    if (k27Var2 != null && (message2 = k27Var2.k) != null) {
                        TLRPC.MessageAction messageAction2 = message2.action;
                        if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftUnique) {
                            i3 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction2).can_transfer_at;
                            v2(i3 - ConnectionsManager.getInstance(this.a).getCurrentTime(), context, false);
                            return;
                        }
                    }
                    TL_stars.SavedStarGift savedStarGift = this.A2;
                    i3 = savedStarGift != null ? savedStarGift.can_transfer_at : 0;
                    v2(i3 - ConnectionsManager.getInstance(this.a).getCurrentTime(), context, false);
                    return;
                }
                TL_stars.SavedStarGift savedStarGift2 = this.A2;
                if (savedStarGift2 != null) {
                    TL_stars.StarGift starGift = savedStarGift2.gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                        i2 = savedStarGift2.can_export_at;
                        TL_stars.TL_starGiftUnique tL_starGiftUnique2 = tL_starGiftUnique;
                        int currentTime = ConnectionsManager.getInstance(this.a).getCurrentTime();
                        int max = currentTime <= i2 ? 0 : Math.max(1, Math.round(Math.max(0, i2 - currentTime) / 86400.0f));
                        vu4 vu4Var = new vu4();
                        vu4Var.a = k96.M0(2131749898, null);
                        vu4Var.c = true;
                        vu4Var.d = max;
                        vu4Var.e = new kg(this, currentTime, i2, max, r8, tL_starGiftUnique2);
                        Context context2 = getContext();
                        int i4 = this.a;
                        xu4 xu4Var = new xu4(context2, i4, false, oj0.a(i4).b(), null, vu4Var, this.J0);
                        xu4[] xu4VarArr = {xu4Var};
                        xu4Var.show();
                        return;
                    }
                }
                k27 k27Var3 = this.C2;
                if (k27Var3 == null || (message = k27Var3.k) == null) {
                    return;
                }
                TLRPC.MessageAction messageAction3 = message.action;
                if (messageAction3 instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction3;
                    TL_stars.StarGift starGift2 = tL_messageActionStarGiftUnique.gift;
                    if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                        tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift2;
                        i2 = tL_messageActionStarGiftUnique.can_export_at;
                        TL_stars.TL_starGiftUnique tL_starGiftUnique22 = tL_starGiftUnique;
                        int currentTime2 = ConnectionsManager.getInstance(this.a).getCurrentTime();
                        if (currentTime2 <= i2) {
                        }
                        vu4 vu4Var2 = new vu4();
                        vu4Var2.a = k96.M0(2131749898, null);
                        vu4Var2.c = true;
                        vu4Var2.d = max;
                        vu4Var2.e = new kg(this, currentTime2, i2, max, xu4VarArr, tL_starGiftUnique22);
                        Context context22 = getContext();
                        int i42 = this.a;
                        xu4 xu4Var2 = new xu4(context22, i42, false, oj0.a(i42).b(), null, vu4Var2, this.J0);
                        xu4[] xu4VarArr2 = {xu4Var2};
                        xu4Var2.show();
                        return;
                    }
                    return;
                }
                return;
            }
        }
        TL_stars.SavedStarGift savedStarGift3 = this.A2;
        i = savedStarGift3 != null ? savedStarGift3.can_transfer_at : 0;
        if (i <= ConnectionsManager.getInstance(this.a).getCurrentTime()) {
        }
    }

    public final void b1(LinearLayout linearLayout, int i, int i2, int i3, String str, boolean z) {
        ImageView imageView = new ImageView(getContext());
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(i);
        wjb wjbVar = this.J0;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        zkb.s(imageView, i3, wjbVar, mode);
        linearLayout.addView(imageView, nme.t(i2, i2, 16, i2 < 15 ? 1 : 0, 0, i2 < 15 ? 1 : 0, 0));
        TextView textView = new TextView(getContext());
        textView.setTextSize(1, 13.0f);
        int i4 = bkb.q5;
        zkb.X(textView, i4, this.J0);
        textView.setText(str);
        linearLayout.addView(textView, nme.t(-2, -2, 16, 4, 0, 0, 0));
        if (z) {
            ImageView imageView2 = new ImageView(getContext());
            imageView2.setScaleType(scaleType);
            imageView2.setImageResource(R.drawable.msg_mini_topicarrow);
            zkb.s(imageView2, i4, this.J0, mode);
            linearLayout.addView(imageView2, nme.t(11, 11, 16, 5, 0, 2, 0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b2(long j, long j2, SpannableStringBuilder spannableStringBuilder, boolean z, p8c p8cVar) {
        String str;
        TLRPC.Chat chat;
        SpannableStringBuilder T2;
        TL_stars.TL_starGiftUnique A1 = A1();
        if (A1 == null) {
            return;
        }
        int i = this.a;
        if (j >= 0) {
            TLRPC.User V1 = na7.q1(i).V1(Long.valueOf(j));
            str = l7c.l(V1);
            chat = V1;
        } else {
            TLRPC.Chat K0 = na7.q1(i).K0(Long.valueOf(-j));
            if (K0 == null) {
                str = "";
                chat = K0;
            } else {
                str = K0.title;
                chat = K0;
            }
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.addView(new wpa(getContext(), A1, chat), nme.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView = new TextView(getContext());
        zkb.X(textView, bkb.i5, this.J0);
        textView.setTextSize(1, 16.0f);
        byte b = 2;
        if (spannableStringBuilder != null) {
            T2 = spannableStringBuilder;
        } else {
            T2 = gl.T2(j2 > 0 ? k96.K("Gift2TransferPriceText", (int) j2, ',', s1(), cf3.s(j)) : k96.a0(null, null, 2131749897, s1(), str));
        }
        textView.setText(T2);
        linearLayout.addView(textView, nme.t(-1, -2, 48, 24, 4, 24, 4));
        mfb mfbVar = new mfb(getContext(), this.J0);
        Z0(mfbVar, gta.i(A1.attributes, TL_stars.starGiftAttributeModel.class));
        Z0(mfbVar, gta.i(A1.attributes, TL_stars.starGiftAttributeBackdrop.class));
        Z0(mfbVar, gta.i(A1.attributes, TL_stars.starGiftAttributePattern.class));
        if (!TextUtils.isEmpty(A1.slug) && (A1.flags & 256) != 0) {
            ci0.h();
            mfbVar.f(k96.M0(2131749416, null), b00.h("~", ci0.f(A1.value_currency, ci0.h().g(A1.value_currency), A1.value_amount, true)), null, null);
        }
        linearLayout.addView(mfbVar, nme.t(-1, -2, 48, 23, 16, 23, 4));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.J0, getContext());
        alertDialog$Builder.n(linearLayout);
        alertDialog$Builder.j(j2 > 0 ? jva.S0(k96.a0(null, null, 2131749904, Integer.valueOf((int) j2))) : k96.M0(2131749905, null), new p52(p8cVar, b));
        alertDialog$Builder.g(k96.M0(2131752577, null), null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.Y0 = z;
        hdVar.show();
    }

    public final void c1(TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.Updates updates, Runnable runnable) {
        TLRPC.Message message;
        TL_stars.StarGift starGift;
        if (updates == null) {
            gta.v(this.a, false).M(q1());
            dismiss();
            return;
        }
        TLRPC.Update update = updates.update;
        if (update instanceof TL_update.TL_updateNewMessage) {
            message = ((TL_update.TL_updateNewMessage) update).message;
        } else {
            if (updates.updates != null) {
                for (int i = 0; i < updates.updates.size(); i++) {
                    TLRPC.Update update2 = updates.updates.get(i);
                    if (update2 instanceof TL_update.TL_updateNewMessage) {
                        message = ((TL_update.TL_updateNewMessage) update2).message;
                        break;
                    }
                }
            }
            message = null;
        }
        if (message == null) {
            gta.v(this.a, false).M(q1());
            dismiss();
            return;
        }
        TL_stars.SavedStarGift savedStarGift = this.A2;
        if (savedStarGift != null && (!(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftUser) ? !(!(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftChat) ? !(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftSlug) || (starGift = savedStarGift.gift) == null || !TextUtils.equals(starGift.slug, ((TL_stars.TL_inputSavedStarGiftSlug) inputSavedStarGift).slug) : savedStarGift.saved_id != ((TL_stars.TL_inputSavedStarGiftChat) inputSavedStarGift).saved_id) : savedStarGift.msg_id == ((TL_stars.TL_inputSavedStarGiftUser) inputSavedStarGift).msg_id)) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                this.L2 = true;
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                TL_stars.SavedStarGift savedStarGift2 = this.A2;
                savedStarGift2.gift = tL_messageActionStarGiftUnique.gift;
                int i2 = savedStarGift2.flags | 8;
                savedStarGift2.msg_id = message.id;
                savedStarGift2.flags = i2 & (-2049);
                savedStarGift2.saved_id = 0L;
                savedStarGift2.unsaved = !tL_messageActionStarGiftUnique.saved;
                savedStarGift2.refunded = tL_messageActionStarGiftUnique.refunded;
                savedStarGift2.can_upgrade = false;
                savedStarGift2.can_resell_at = tL_messageActionStarGiftUnique.can_resell_at;
                savedStarGift2.can_transfer_at = tL_messageActionStarGiftUnique.can_transfer_at;
                savedStarGift2.can_export_at = tL_messageActionStarGiftUnique.can_export_at;
                n2(savedStarGift2, this.B2);
                this.m3 = null;
                this.L2 = false;
                ysa ysaVar = this.B2;
                if (ysaVar != null) {
                    ysaVar.d();
                } else {
                    gta.v(this.a, false).M(this.S1);
                }
                gl.d3(runnable);
                return;
            }
        }
        if (this.B2 == null) {
            gta.v(this.a, false).M(q1());
        }
        this.L2 = true;
        this.A2 = null;
        this.z2 = false;
        k27 k27Var = new k27(this.a, message, false, false);
        k27Var.K5();
        l2(k27Var, this.B2);
        this.m3 = null;
        this.L2 = false;
        gl.d3(runnable);
    }

    public final void c2(long j, p8c p8cVar) {
        TLRPC.Message message;
        long j2;
        TL_stars.SavedStarGift savedStarGift = this.A2;
        if (savedStarGift == null || !(savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            k27 k27Var = this.C2;
            if (k27Var == null || (message = k27Var.k) == null) {
                return;
            }
            TLRPC.MessageAction messageAction = message.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                return;
            }
            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
            if (!(tL_messageActionStarGiftUnique.gift instanceof TL_stars.TL_starGiftUnique)) {
                return;
            } else {
                j2 = tL_messageActionStarGiftUnique.transfer_stars;
            }
        } else {
            j2 = savedStarGift.transfer_stars;
        }
        b2(j, j2, null, true, p8cVar);
    }

    public final void d1(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z, du4 du4Var) {
        u21 j2;
        ysa ysaVar = this.B2;
        if (du4Var != null) {
            ww0 ww0Var = du4Var.c;
            gl.t1(ww0Var.findFocus());
            j2 = new u21(ww0Var, this.J0);
        } else {
            j2 = j();
        }
        cq7.d(getContext(), this.a, tL_starGiftUnique, j, tL_textWithEntities, !z, this.J0, new nu9(this, du4Var, (byte) 7), j2, new t7a((Object) this, (Object) du4Var, (byte) 12), new t7a((Object) ysaVar, (Object) tL_starGiftUnique, (byte) 13));
    }

    public final void d2() {
        TL_stars.InputSavedStarGift u1;
        long j;
        long j2;
        long j3;
        boolean z;
        boolean z2;
        boolean z3;
        String str;
        boolean z4;
        je5 je5Var = this.w3;
        if (je5Var != null) {
            je5Var.f(true);
            this.w3 = null;
        }
        if (this.X2 != null || (u1 = u1()) == null) {
            return;
        }
        k27 k27Var = this.C2;
        long j4 = this.S1;
        if (k27Var != null) {
            TLRPC.MessageAction messageAction = k27Var.k.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGift)) {
                return;
            }
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
            j2 = tL_messageActionStarGift.gift.id;
            j3 = tL_messageActionStarGift.upgrade_stars;
            z = tL_messageActionStarGift.name_hidden;
            TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageActionStarGift.message;
            z2 = (tL_textWithEntities == null || TextUtils.isEmpty(tL_textWithEntities.text)) ? false : true;
            j = 0;
            z3 = tL_messageActionStarGift.peer instanceof TLRPC.TL_peerChannel;
            str = tL_messageActionStarGift.prepaid_upgrade_hash;
            z4 = tL_messageActionStarGift.prepaid_upgrade ? cf3.n(tL_messageActionStarGift.from_id) != this.C2.Z0() : tL_messageActionStarGift.upgrade_separate;
        } else {
            j = 0;
            TL_stars.SavedStarGift savedStarGift = this.A2;
            if (savedStarGift == null) {
                return;
            }
            TL_stars.StarGift starGift = savedStarGift.gift;
            j2 = starGift.id;
            j3 = savedStarGift.upgrade_stars;
            z = (starGift instanceof TL_stars.TL_starGift) && savedStarGift.name_hidden;
            TLRPC.TL_textWithEntities tL_textWithEntities2 = savedStarGift.message;
            z2 = (tL_textWithEntities2 == null || TextUtils.isEmpty(tL_textWithEntities2.text)) ? false : true;
            z3 = j4 < 0;
            TL_stars.SavedStarGift savedStarGift2 = this.A2;
            str = savedStarGift2.prepaid_upgrade_hash;
            z4 = savedStarGift2.upgrade_separate;
        }
        TextView textView = this.s2;
        if (z) {
            textView.setText(k96.M0(z3 ? 2131750382 : 2131750383, null));
        } else if (z2) {
            textView.setText(k96.M0(2131750380, null));
        } else {
            textView.setText(k96.M0(2131750381, null));
        }
        boolean z5 = (z || j3 <= j || z4) ? false : true;
        wf2 wf2Var = this.r2;
        wf2Var.a(z5, false);
        if (this.m3 == null) {
            gta.v(this.a, false).H(j2, new qna(this, (byte) 2));
        } else if (j3 > j || this.q3 != null) {
            e2();
            return;
        }
        if (j3 > j || this.q3 != null) {
            return;
        }
        this.p3 = true;
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        if (TextUtils.isEmpty(str)) {
            TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
            tL_inputInvoiceStarGiftUpgrade.keep_original_details = wf2Var.a.q;
            tL_inputInvoiceStarGiftUpgrade.stargift = u1;
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftUpgrade;
        } else {
            TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
            tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
            tL_inputInvoiceStarGiftPrepaidUpgrade.peer = na7.q1(this.a).h1(j4);
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
        }
        JSONObject u = ow0.u(this.J0, false);
        if (u != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = u.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getPaymentForm, new xoa(this, (byte) 0));
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = kk7.H3;
        rqa rqaVar = this.a2;
        if (i != i3) {
            if (i == kk7.c4) {
                rqaVar.setInWallet(this.d3 == null && this.a3 == null && x2(A1()));
                return;
            }
            return;
        }
        if (this.B2 == ((xsa) objArr[1])) {
            upa upaVar = rqaVar.N;
            if (upaVar == null || !upaVar.i0) {
                C2();
            }
        }
    }

    @Override // fx0, android.app.Dialog, android.content.DialogInterface, zf0
    public final void dismiss() {
        if (this.W2.c(4) && this.a2.N.i0) {
            return;
        }
        x99 x99Var = this.R2;
        if (x99Var != null) {
            x99Var.b();
            this.R2 = null;
        }
        hqa hqaVar = this.K2;
        if (hqaVar != null) {
            hqaVar.a();
        }
        super.dismiss();
    }

    public final boolean e1() {
        TLRPC.Peer peer;
        if (u1() == null) {
            return false;
        }
        k27 k27Var = this.C2;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        if (k27Var != null) {
            TLRPC.MessageAction messageAction = k27Var.k.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                return ((!(tL_messageActionStarGift.peer != null) && (!k27Var.O3() || ((k27.B0(this.C2.k) > y6c.h(this.a).e() ? 1 : (k27.B0(this.C2.k) == y6c.h(this.a).e() ? 0 : -1)) == 0))) || ((peer = tL_messageActionStarGift.peer) != null && G1(this.a, cf3.n(peer)))) && !tL_messageActionStarGift.converted && tL_messageActionStarGift.convert_stars > 0 && ((int) na7.q1(this.a).k4.v3.g(timeUnit)) - (ConnectionsManager.getInstance(this.a).getCurrentTime() - this.C2.k.date) > 0;
            }
        } else {
            TL_stars.SavedStarGift savedStarGift = this.A2;
            if (savedStarGift != null) {
                int g = ((int) na7.q1(this.a).k4.v3.g(timeUnit)) - (ConnectionsManager.getInstance(this.a).getCurrentTime() - savedStarGift.date);
                int i = this.a;
                long j = this.S1;
                if (G1(i, j)) {
                    int i2 = this.A2.flags;
                    if (((j < 0 ? 2048 : 8) & i2) != 0 && (i2 & 16) != 0 && (i2 & 2) != 0 && g > 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0031, code lost:
    
        if (android.text.TextUtils.isEmpty(r1.prepaid_upgrade_hash) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (android.text.TextUtils.isEmpty(r1.prepaid_upgrade_hash) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0033, code lost:
    
        r1 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e2() {
        long j;
        boolean z;
        boolean z2;
        byte b;
        int i;
        String M0;
        String M02;
        TL_stars.StarGiftUpgradePrice starGiftUpgradePrice;
        k27 k27Var = this.C2;
        if (k27Var != null) {
            TLRPC.MessageAction messageAction = k27Var.k.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGift)) {
                return;
            }
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
            j = tL_messageActionStarGift.upgrade_stars;
            if (j <= 0) {
            }
            z = false;
        } else {
            TL_stars.SavedStarGift savedStarGift = this.A2;
            if (savedStarGift == null) {
                return;
            }
            j = savedStarGift.upgrade_stars;
            if (j <= 0) {
            }
            z = false;
        }
        if (this.m3 != null) {
            if (j > 0 || this.q3 != null) {
                long j2 = 0;
                if (this.q3 != null) {
                    for (int i2 = 0; i2 < this.q3.invoice.prices.size(); i2++) {
                        j2 += this.q3.invoice.prices.get(i2).amount;
                    }
                }
                hqa hqaVar = this.K2;
                rqa rqaVar = this.a2;
                if (hqaVar == null) {
                    hqaVar = new hqa(rqaVar);
                    this.K2 = hqaVar;
                }
                ArrayList arrayList = this.m3;
                rqa rqaVar2 = hqaVar.a;
                ArrayList arrayList2 = hqaVar.g;
                ArrayList arrayList3 = hqaVar.f;
                ArrayList arrayList4 = hqaVar.e;
                int size = arrayList4.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList4.get(i3);
                    i3++;
                    ((fqa) obj).a();
                }
                arrayList4.clear();
                arrayList3.clear();
                arrayList2.clear();
                ArrayList j3 = gta.j(arrayList, TL_stars.starGiftAttributeModel.class);
                int size2 = j3.size();
                int i4 = 0;
                while (i4 < size2) {
                    Object obj2 = j3.get(i4);
                    i4++;
                    fqa fqaVar = new fqa(rqaVar2.c, (TL_stars.starGiftAttributeModel) obj2);
                    if (rqaVar2.isAttachedToWindow() && fqaVar.c) {
                        fqaVar.d.I();
                    }
                    arrayList4.add(fqaVar);
                }
                ArrayList j4 = gta.j(arrayList, TL_stars.starGiftAttributeBackdrop.class);
                int size3 = j4.size();
                int i5 = 0;
                while (i5 < size3) {
                    Object obj3 = j4.get(i5);
                    i5++;
                    arrayList3.add(new eqa((TL_stars.starGiftAttributeBackdrop) obj3));
                }
                ArrayList j5 = gta.j(arrayList, TL_stars.starGiftAttributePattern.class);
                int size4 = j5.size();
                int i6 = 0;
                while (i6 < size4) {
                    Object obj4 = j5.get(i6);
                    i6++;
                    arrayList2.add(new gqa((TL_stars.starGiftAttributePattern) obj4));
                }
                rqaVar.setPreviewingAttributes(this.m3);
                long j6 = this.S1;
                if (z) {
                    z2 = true;
                    rqaVar.i(1, k96.M0(2131750046, null), k96.a0(null, null, 2131750047, cf3.r(this.a, j6)), null);
                } else {
                    z2 = true;
                    rqaVar.i(1, k96.M0(2131749835, null), k96.M0(2131749836, null), null);
                }
                u41 u41Var = this.f2;
                u41Var.setFilled(z2);
                u41Var.g(null, z2);
                if (j2 > 0) {
                    int currentTime = ConnectionsManager.getInstance(this.a).getCurrentTime();
                    if (this.o3 != null) {
                        for (int i7 = 0; i7 < this.o3.size(); i7++) {
                            starGiftUpgradePrice = (TL_stars.StarGiftUpgradePrice) this.o3.get(i7);
                            if (starGiftUpgradePrice.date >= currentTime) {
                                break;
                            }
                        }
                    }
                    starGiftUpgradePrice = null;
                    ArrayList arrayList5 = this.n3;
                    FrameLayout frameLayout = this.i2;
                    if (arrayList5 == null || starGiftUpgradePrice == null || arrayList5.isEmpty()) {
                        frameLayout.setVisibility(8);
                    } else {
                        frameLayout.setVisibility(0);
                        this.h2.setText(gl.F2(gl.O2("**" + k96.M0(2131749854, null) + "**", -1, 0, new nna(this, (byte) 5), null), false, gl.L(0.6666667f), gl.L(0.66f)));
                    }
                    B2();
                    cm2[] cm2VarArr = this.r3;
                    if (z) {
                        u41Var.i(jva.T0(k96.a0(null, null, 2131750051, Long.valueOf(j2)), 1.13f, cm2VarArr), true, true);
                    } else {
                        u41Var.i(jva.T0(k96.a0(null, null, 2131749861, Long.valueOf(j2)), 1.13f, cm2VarArr), true, true);
                    }
                } else {
                    u41Var.i(k96.M0(2131751805, null), true, true);
                }
                u41Var.setOnClickListener(new lna(this, (byte) 12));
                View view = this.p2;
                ac[] acVarArr = this.o2;
                LinearLayout linearLayout = this.q2;
                if (z) {
                    linearLayout.setVisibility(8);
                    view.setVisibility(8);
                    ac acVar = acVarArr[0];
                    String M03 = k96.M0(2131749849, null);
                    if (z) {
                        i = 1;
                        b = 2;
                        M0 = k96.a0(null, null, 2131750050, cf3.r(this.a, j6));
                    } else {
                        i = 1;
                        b = 2;
                        M0 = k96.M0(2131749851, null);
                    }
                    acVar.a(R.drawable.menu_feature_unique, M03, M0);
                    ac acVar2 = acVarArr[i];
                    String M04 = k96.M0(2131749846, null);
                    if (z) {
                        Object[] objArr = new Object[i];
                        objArr[0] = cf3.r(this.a, j6);
                        M02 = k96.a0(null, null, 2131750049, objArr);
                    } else {
                        M02 = k96.M0(2131749848, null);
                    }
                    acVar2.a(R.drawable.menu_feature_transfer, M04, M02);
                    acVarArr[b].a(R.drawable.menu_feature_tradable, k96.M0(2131749843, null), z ? k96.a0(null, null, 2131750048, cf3.r(this.a, j6)) : k96.M0(2131749845, null));
                } else {
                    b = 2;
                    linearLayout.setVisibility(0);
                    view.setVisibility(0);
                    acVarArr[0].a(R.drawable.menu_feature_unique, k96.M0(2131749849, null), k96.M0(2131749400, null));
                    acVarArr[1].a(R.drawable.menu_feature_tradable, k96.M0(2131749843, null), k96.M0(2131749398, null));
                    acVarArr[2].a(R.drawable.menu_wear, k96.M0(2131749395, null), k96.M0(2131749396, null));
                }
                gl.d3(new pna(this, j2, b));
            }
        }
    }

    public final boolean f1() {
        int i;
        TL_stars.TL_starGiftUnique A1 = A1();
        if (A1 == null || A1.crafted || cq7.m(A1) || !G1(this.a, cf3.n(A1.owner_id))) {
            return false;
        }
        k27 k27Var = this.C2;
        if (k27Var == null) {
            TL_stars.SavedStarGift savedStarGift = this.A2;
            if (savedStarGift != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                i = savedStarGift.can_craft_at;
            }
        }
        TLRPC.Message message = k27Var.k;
        if (message == null) {
            return false;
        }
        TLRPC.MessageAction messageAction = message.action;
        if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
            return false;
        }
        i = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).can_craft_at;
        return i > 0 && ConnectionsManager.getInstance(this.a).getCurrentTime() >= i;
    }

    public final void f2() {
        TL_stars.TL_starGiftUnique A1 = A1();
        if (w2() || E2() == null || A1 == null || TextUtils.isEmpty(A1.slug)) {
            return;
        }
        vu4 vu4Var = new vu4();
        vu4Var.a = k96.M0(2131749898, null);
        vu4Var.b = true;
        vu4Var.e = new nu9(this, r1, (byte) 9);
        Context context = getContext();
        int i = this.a;
        xu4 xu4Var = new xu4(context, i, false, oj0.a(i).b(), null, vu4Var, this.J0);
        xu4[] xu4VarArr = {xu4Var};
        xu4Var.show();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0098 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g1() {
        if (this.a3 == null && u1() != null) {
            k27 k27Var = this.C2;
            if (k27Var != null) {
                TLRPC.Message message = k27Var.k;
                if (message != null) {
                    TLRPC.MessageAction messageAction = message.action;
                    if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                        TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                        TL_stars.StarGift starGift = tL_messageActionStarGift.gift;
                        if ((starGift instanceof TL_stars.TL_starGift) && !starGift.limited && starGift.availability_total <= 0 && !starGift.auction && !tL_messageActionStarGift.converted && !tL_messageActionStarGift.upgraded && !tL_messageActionStarGift.refunded && tL_messageActionStarGift.convert_stars > 0) {
                            boolean O3 = k27Var.O3();
                            boolean z = k27.B0(this.C2.k) == y6c.h(this.a).e();
                            TLRPC.Peer peer = tL_messageActionStarGift.peer;
                            if (peer != null) {
                                return G1(this.a, cf3.n(peer));
                            }
                            if (!O3 || z) {
                                return true;
                            }
                        }
                    }
                }
            } else {
                TL_stars.SavedStarGift savedStarGift = this.A2;
                if (savedStarGift != null) {
                    TL_stars.StarGift starGift2 = savedStarGift.gift;
                    if (!(starGift2 instanceof TL_stars.TL_starGift) || starGift2.limited || starGift2.availability_total > 0 || starGift2.auction || savedStarGift.refunded || !G1(this.a, this.S1)) {
                    }
                }
            }
        }
        return false;
    }

    public final boolean h1() {
        TL_stars.TL_starGiftUnique A1 = A1();
        if (A1 == null || TextUtils.isEmpty(A1.slug)) {
            return false;
        }
        if (this.a3 == null && !H1(A1) && !E1(A1) && (!cq7.u(A1) || !F1(this.a, cf3.n(A1.owner_id)))) {
            return false;
        }
        gr grVar = na7.q1(this.a).k4;
        if (grVar.n0.f) {
            return grVar.s.f || grVar.t.f || H1(A1);
        }
        return false;
    }

    public final SpannableStringBuilder h2(TLRPC.Peer peer) {
        if (peer != null) {
            String q = cf3.q(na7.q1(this.a).Z1(cf3.n(peer)));
            if (!TextUtils.isEmpty(q)) {
                return gl.O2(k96.a0(null, null, 2131750027, b00.h("@", q)), -1, 0, new noa(this, q, (byte) 8), null);
            }
        }
        return null;
    }

    public final void i1() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.J0, getContext());
        String M0 = k96.M0(2131750250, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        hdVar.U = k96.M0(2131750251, null);
        TL_stars.TL_starGiftUnique A1 = A1();
        if (A1 != null && !TextUtils.isEmpty(A1.slug)) {
            alertDialog$Builder.j(k96.M0(2131747612, null), new uoa(this, A1, (byte) 1));
        }
        ug8.y(null, 2131752577, alertDialog$Builder, null);
    }

    public final SpannableStringBuilder i2(TL_stars.StarGift starGift) {
        if (starGift == null || (starGift instanceof TL_stars.TL_starGiftUnique)) {
            return null;
        }
        return h2(starGift.released_by);
    }

    @Override // fx0, zf0
    public u21 j() {
        return new u21(this.k2, this.J0);
    }

    public final void j1(long j, TL_stars.starGiftDepositPayload stargiftdepositpayload, long j2, c01 c01Var, xu4 xu4Var) {
        TL_wallet.nftItem E2 = E2();
        TL_stars.TL_starGiftUnique A1 = A1();
        if (E2 == null || A1 == null || TextUtils.isEmpty(A1.slug)) {
            return;
        }
        byte b = 0;
        boolean z = this.a3 != null;
        String s1 = s1();
        c01Var.d();
        hoa hoaVar = new hoa(this, j2, c01Var, j, A1, E2, xu4Var, z, s1);
        if (stargiftdepositpayload != null) {
            hoaVar.a(stargiftdepositpayload);
            return;
        }
        TL_stars.depositStarGift depositstargift = new TL_stars.depositStarGift();
        depositstargift.peer = na7.q1(this.a).h1(j);
        depositstargift.slug = A1.slug;
        ConnectionsManager.getInstance(this.a).sendRequestTyped(depositstargift, new hc(b), new eu0((Object) this, (Object) c01Var, (Object) xu4Var, (Object) hoaVar, (byte) 15));
    }

    public final void k1(long j, p8c p8cVar) {
        TLRPC.Message message;
        long n;
        long j2;
        TL_stars.InputSavedStarGift u1 = u1();
        if (u1 != null) {
            TL_stars.SavedStarGift savedStarGift = this.A2;
            if (savedStarGift == null || !(savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                k27 k27Var = this.C2;
                if (k27Var == null || (message = k27Var.k) == null) {
                    return;
                }
                TLRPC.MessageAction messageAction = message.action;
                if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                    return;
                }
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                n = cf3.n(tL_messageActionStarGiftUnique.gift.owner_id);
                j2 = tL_messageActionStarGiftUnique.transfer_stars;
            } else {
                j2 = savedStarGift.transfer_stars;
                n = this.S1;
            }
            long j3 = n;
            if (j2 <= 0) {
                TL_stars.transferStarGift transferstargift = new TL_stars.transferStarGift();
                transferstargift.stargift = u1;
                transferstargift.to_id = na7.q1(this.a).h1(j);
                ConnectionsManager.getInstance(this.a).sendRequest(transferstargift, new pn6(this, p8cVar, j, j3, (byte) 2));
                return;
            }
            gta v = gta.v(this.a, false);
            if (!v.e) {
                v.o(new mx8((Object) this, (Object) v, j, (Object) p8cVar, (byte) 3));
                return;
            }
            TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer = new TLRPC.TL_inputInvoiceStarGiftTransfer();
            tL_inputInvoiceStarGiftTransfer.stargift = u1;
            tL_inputInvoiceStarGiftTransfer.to_id = na7.q1(this.a).h1(j);
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftTransfer;
            JSONObject u = ow0.u(this.J0, false);
            if (u != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getPaymentForm, new x75(this, tL_inputInvoiceStarGiftTransfer, j, j3, p8cVar));
        }
    }

    public final void l1() {
        TL_stars.InputSavedStarGift u1;
        long j;
        u41 u41Var = this.f2;
        if (u41Var.R || (u1 = u1()) == null) {
            return;
        }
        k27 k27Var = this.C2;
        String str = null;
        long j2 = 0;
        if (k27Var != null) {
            TLRPC.MessageAction messageAction = k27Var.k.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGift)) {
                return;
            }
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
            j = tL_messageActionStarGift.upgrade_stars;
            if (j <= 0) {
                str = tL_messageActionStarGift.prepaid_upgrade_hash;
            }
        } else {
            TL_stars.SavedStarGift savedStarGift = this.A2;
            if (savedStarGift == null) {
                return;
            }
            j = savedStarGift.upgrade_stars;
            if (j <= 0) {
                str = savedStarGift.prepaid_upgrade_hash;
            }
        }
        if (j > 0 || this.q3 != null) {
            u41Var.setLoading(true);
            wf2 wf2Var = this.r2;
            if (j > 0) {
                TL_stars.upgradeStarGift upgradestargift = new TL_stars.upgradeStarGift();
                upgradestargift.keep_original_details = wf2Var.a.q;
                upgradestargift.stargift = u1;
                ConnectionsManager.getInstance(this.a).sendRequest(upgradestargift, new hj7(this, u1, (byte) 29));
                return;
            }
            int i = 0;
            gta v = gta.v(this.a, false);
            if (!v.e) {
                v.o(new t7a((Object) this, (Object) v, (byte) 15));
                return;
            }
            TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
            tL_payments_sendStarsForm.form_id = this.q3.form_id;
            if (TextUtils.isEmpty(str)) {
                TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                tL_inputInvoiceStarGiftUpgrade.keep_original_details = wf2Var.a.q;
                tL_inputInvoiceStarGiftUpgrade.stargift = u1;
                tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftUpgrade;
            } else {
                TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
                tL_inputInvoiceStarGiftPrepaidUpgrade.peer = na7.q1(this.a).h1(this.S1);
                tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
            }
            ArrayList<TLRPC.TL_labeledPrice> arrayList = this.q3.invoice.prices;
            int size = arrayList.size();
            while (i < size) {
                TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i);
                i++;
                j2 += tL_labeledPrice.amount;
            }
            ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_sendStarsForm, new ws0((Object) this, (Object) str, (Object) u1, j2, (byte) 5));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:318:0x0366, code lost:
    
        if (G1(r60.a, cf3.n(r12)) != false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x0379, code lost:
    
        if (r8 > 0) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x03c5, code lost:
    
        if (r37 == false) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x03c7, code lost:
    
        if (r48 == false) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x03cb, code lost:
    
        if (r27 <= 0) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x03cd, code lost:
    
        r7 = null;
        r1 = k96.a0(null, null, 2131750149, r35);
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x03de, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x03e2, code lost:
    
        if (r30 == false) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x03e4, code lost:
    
        if (r25 != false) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x03e6, code lost:
    
        r1 = k96.a0(null, null, 2131750127, r35);
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x03f3, code lost:
    
        if (r25 == false) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x03f5, code lost:
    
        r1 = "Gift2InfoOutConverted";
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x03fa, code lost:
    
        r1 = k96.K(r1, (int) r9, ',', r35);
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x0408, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x03f8, code lost:
    
        r1 = "Gift2InfoOut";
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x040b, code lost:
    
        if (r25 == false) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x040d, code lost:
    
        if (r39 == false) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x040f, code lost:
    
        r1 = "Gift2InfoChannelConverted";
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x041c, code lost:
    
        r1 = k96.H(',', r1, (int) r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x0412, code lost:
    
        r1 = "Gift2InfoConverted";
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x0415, code lost:
    
        if (r39 == false) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x0417, code lost:
    
        r1 = "Gift2Info3Channel";
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x041a, code lost:
    
        r1 = "Gift2Info3";
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x03c3, code lost:
    
        if (r2 > 0) goto L179;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x07ab  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x078e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x07a8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x07b1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x07c0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0892  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0964  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x08c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x07de  */
    /* JADX WARN: Type inference failed for: r7v59 */
    /* JADX WARN: Type inference failed for: r7v60, types: [cm2[], lfb[], q41[]] */
    /* JADX WARN: Type inference failed for: r7v61 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l2(k27 k27Var, ysa ysaVar) {
        long j;
        TLRPC.Peer peer;
        boolean z;
        boolean z2;
        TL_stars.StarGift starGift;
        TLRPC.Peer peer2;
        long j2;
        long j3;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        int i;
        boolean z3;
        boolean z4;
        boolean z5;
        TLRPC.Peer peer3;
        boolean z6;
        String str;
        boolean z7;
        boolean z8;
        String M0;
        TLRPC.TL_textWithEntities tL_textWithEntities2;
        u41 u41Var;
        boolean z9;
        String str2;
        String str3;
        char c;
        CharSequence charSequence;
        int i2;
        CharSequence concat;
        mfb mfbVar;
        TLRPC.TL_textWithEntities tL_textWithEntities3;
        u41 u41Var2;
        boolean z10;
        String str4;
        int i3;
        boolean z11;
        TL_stars.StarGift starGift2;
        TLRPC.Document document;
        boolean z12;
        boolean z13;
        boolean z14;
        int i4;
        CharSequence charSequence2;
        String M02;
        ?? r7;
        CharSequence charSequence3;
        String str5;
        String M03;
        hqa hqaVar;
        String str6;
        String str7;
        boolean z15;
        float f;
        float f2;
        String M04;
        l46 l46Var;
        int i5;
        TLObject Z1;
        boolean z16;
        hqa hqaVar2;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        TL_stars.InputSavedStarGift u1;
        if (k27Var == null || k27Var.k == null) {
            return;
        }
        this.z2 = false;
        this.A2 = null;
        this.C2 = k27Var;
        this.B2 = ysaVar;
        this.Z1.set(k27Var);
        long e = y6c.h(this.a).e();
        boolean z17 = k27.B0(k27Var.k) == e;
        TLRPC.MessageAction messageAction = k27Var.k.action;
        boolean z18 = messageAction instanceof TLRPC.TL_messageActionStarGift;
        byte b = 3;
        rqa rqaVar = this.a2;
        u41 u41Var3 = this.f2;
        if (!z18) {
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                return;
            }
            if (!(((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift instanceof TL_stars.TL_starGift)) {
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                if (tL_messageActionStarGiftUnique.gift instanceof TL_stars.TL_starGiftUnique) {
                    if (tL_messageActionStarGiftUnique.name_hidden) {
                        Z1 = null;
                    } else {
                        na7 q1 = na7.q1(this.a);
                        TLRPC.Peer peer4 = tL_messageActionStarGiftUnique.from_id;
                        Z1 = q1.Z1(peer4 != null ? cf3.n(peer4) : k27Var.Z0());
                    }
                    TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) tL_messageActionStarGiftUnique.gift;
                    z14 = tL_messageActionStarGiftUnique.refunded;
                    o2(tL_starGiftUnique2, z14, Z1, tL_messageActionStarGiftUnique.message);
                    z12 = tL_messageActionStarGiftUnique.saved;
                    starGift = tL_messageActionStarGiftUnique.gift;
                    boolean z19 = (tL_messageActionStarGiftUnique.upgrade ^ true) == k27Var.O3();
                    if (k27.B0(k27Var.k) == e) {
                        z19 = false;
                    }
                    if (!this.I2 && !this.J2 && this.C2 != null && (u1 = u1()) != null) {
                        this.I2 = true;
                        gta.v(this.a, false).J(u1, new qna(this, b));
                    }
                    if (this.L2 || (hqaVar2 = this.K2) == null || !hqaVar2.o || (tL_starGiftUnique = hqaVar2.l) == null) {
                        z16 = z19;
                    } else {
                        z16 = z19;
                        if (starGift == null || tL_starGiftUnique.id != starGift.id) {
                            hqaVar2.a();
                            this.K2 = null;
                            rqaVar.b.setAlpha(1.0f);
                            rqaVar.c.setAlpha(0.0f);
                        }
                    }
                    z7 = z17;
                    u41Var2 = u41Var3;
                    z13 = z16;
                    tL_textWithEntities3 = null;
                    z10 = true;
                    str4 = null;
                    z4 = false;
                    z5 = false;
                    peer3 = null;
                    if (this.j3) {
                        u41Var2.setFilled(z10);
                        u41Var2.i(k96.M0(2131749778, str4), false, z10);
                        u41Var2.setOnClickListener(new lna(this, (byte) 20));
                    }
                    if (starGift != null) {
                        str6 = null;
                        str7 = null;
                    } else {
                        str6 = starGift.owner_address;
                        str7 = starGift.gift_address;
                    }
                    z15 = starGift == null && starGift.host_id != null;
                    l46 l46Var2 = this.c2;
                    if (!z14) {
                        l46Var2.setVisibility(0);
                        l46Var2.setText(k96.M0(2131750029, null));
                        zkb.X(l46Var2, bkb.p7, this.J0);
                        f = 0.66f;
                        f2 = 2.6666667f;
                    } else if (!z15 || TextUtils.isEmpty(str6) || TextUtils.isEmpty(str7)) {
                        f = 0.66f;
                        f2 = 2.6666667f;
                        if (TextUtils.isEmpty(str6) && TextUtils.isEmpty(str7) && z5 && !z7) {
                            l46Var2.setVisibility(0);
                            if (z13) {
                                M04 = k96.a0(null, null, (tL_textWithEntities3 == null || TextUtils.isEmpty(tL_textWithEntities3.text)) ? 2131750072 : 2131750071, cf3.s(k27.B0(k27Var.k)));
                            } else {
                                M04 = k96.M0((tL_textWithEntities3 == null || TextUtils.isEmpty(tL_textWithEntities3.text)) ? 2131750164 : 2131750163, null);
                            }
                            l46Var2.setText(M04);
                            zkb.X(l46Var2, bkb.p5, this.J0);
                        } else {
                            l46Var2.setVisibility(8);
                        }
                    } else {
                        l46Var2.setVisibility(0);
                        f = 0.66f;
                        f2 = 2.6666667f;
                        l46Var2.setText(gl.F2(gl.O2(k96.M0(2131750165, null), -1, 0, new noa(this, str7, (byte) 5), null), true, gl.L(2.6666667f), gl.L(0.66f)));
                        zkb.X(l46Var2, bkb.p5, this.J0);
                    }
                    l46Var = this.e2;
                    if (z15 && !TextUtils.isEmpty(str6) && !TextUtils.isEmpty(str7)) {
                        l46Var.setVisibility(0);
                        l46Var.setText(gl.F2(gl.O2(k96.M0(2131750165, null), -1, 0, new noa(this, str7, (byte) 6), null), true, gl.L(f2), gl.L(f)));
                    } else if (z4 && !z14 && starGift != null && F1(this.a, q1()) && peer3 == null) {
                        l46Var.setVisibility(0);
                        if (q1() >= 0) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            if (z12) {
                                i5 = 2131750039;
                            } else {
                                spannableStringBuilder.append((CharSequence) ". ");
                                spannableStringBuilder.setSpan(new cm2(R.drawable.mini_gift_hidden, 0), 0, 1, 33);
                                i5 = 2131750042;
                            }
                            spannableStringBuilder.append((CharSequence) gl.O2(k96.M0(i5, null), -1, 0, new nna(this, (byte) 8), null));
                            l46Var.setText(gl.F2(spannableStringBuilder, true, gl.L(f2), gl.L(f)));
                        } else {
                            l46Var.setText(gl.F2(gl.O2(k96.M0(z12 ? 2131750237 : 2131750238, null), -1, 0, new nna(this, (byte) 8), null), true, gl.L(f2), gl.L(f)));
                        }
                    } else {
                        l46Var.setVisibility(8);
                    }
                    if (this.Z2) {
                        z2(0, false, null);
                        this.m1.m0(1);
                        this.Z2 = false;
                    }
                    this.o1.setTitle(this.Q2);
                    C2();
                }
                return;
            }
        }
        if (!this.L2 && (hqaVar = this.K2) != null && hqaVar.o && hqaVar.l != null) {
            hqaVar.a();
            this.K2 = null;
            rqaVar.b.setVisibility(0);
            rqaVar.c.setVisibility(4);
        }
        boolean O3 = z17 ? false : k27Var.O3();
        TLRPC.Message message = k27Var.k;
        int i6 = message.date;
        TLRPC.MessageAction messageAction2 = message.action;
        if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction2;
            boolean z20 = tL_messageActionStarGift.converted;
            boolean z21 = tL_messageActionStarGift.saved;
            boolean z22 = tL_messageActionStarGift.refunded;
            boolean z23 = tL_messageActionStarGift.name_hidden;
            TL_stars.StarGift starGift3 = tL_messageActionStarGift.gift;
            boolean z24 = tL_messageActionStarGift.can_upgrade;
            j = e;
            long j4 = tL_messageActionStarGift.convert_stars;
            j3 = tL_messageActionStarGift.upgrade_stars;
            TLRPC.TL_textWithEntities tL_textWithEntities4 = tL_messageActionStarGift.message;
            TLRPC.Peer peer5 = tL_messageActionStarGift.from_id;
            TLRPC.Peer peer6 = tL_messageActionStarGift.peer;
            z6 = tL_messageActionStarGift.prepaid_upgrade;
            str = tL_messageActionStarGift.prepaid_upgrade_hash;
            TLRPC.Peer peer7 = tL_messageActionStarGift.auction_acquired ? tL_messageActionStarGift.to_id : null;
            peer2 = peer5;
            peer = peer6;
            z = z21;
            i = tL_messageActionStarGift.gift_num;
            tL_textWithEntities = tL_textWithEntities4;
            peer3 = peer7;
            z4 = z20;
            z5 = z23;
            z2 = z22;
            starGift = starGift3;
            z3 = z24;
            j2 = j4;
        } else {
            j = e;
            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique2 = (TLRPC.TL_messageActionStarGiftUnique) messageAction2;
            boolean z25 = tL_messageActionStarGiftUnique2.saved;
            boolean z26 = tL_messageActionStarGiftUnique2.refunded;
            TL_stars.StarGift starGift4 = tL_messageActionStarGiftUnique2.gift;
            TLRPC.Peer peer8 = tL_messageActionStarGiftUnique2.from_id;
            peer = tL_messageActionStarGiftUnique2.peer;
            z = z25;
            z2 = z26;
            starGift = starGift4;
            peer2 = peer8;
            j2 = 0;
            j3 = 0;
            tL_textWithEntities = null;
            i = 0;
            z3 = false;
            z4 = false;
            z5 = false;
            peer3 = null;
            z6 = false;
            str = null;
        }
        long j5 = this.S1;
        String s = cf3.s(j5);
        z7 = z17;
        boolean z27 = O3;
        boolean u = l7c.u(na7.q1(this.a).V1(Long.valueOf(j5)));
        boolean z28 = peer != null && cf3.n(peer) < 0;
        boolean I1 = I1(this.a, A1());
        v1();
        rqaVar.f(starGift, false, false, I1);
        rqaVar.setShowOptions(g1());
        if (z7) {
            if (i == 0 || starGift.title == null) {
                z8 = z2;
                str5 = null;
                M03 = k96.M0(2131749924, null);
            } else {
                StringBuilder sb = new StringBuilder();
                z8 = z2;
                sb.append(starGift.title);
                sb.append(" #");
                M03 = ls6.m(i, ',', sb);
                str5 = null;
            }
            this.Q2 = M03;
            CharSequence charSequence4 = str5;
            if (!z8) {
                if (z3) {
                    charSequence4 = gl.T2(k96.M0(2131749981, str5));
                } else if (j2 > 0) {
                    charSequence4 = gl.T2(k96.H(',', z4 ? "Gift2SelfInfoConverted" : "Gift2SelfInfoConvert", (int) j2));
                } else {
                    charSequence4 = gl.T2(k96.M0(2131749988, null));
                }
            }
            rqaVar.i(0, M03, charSequence4, i2(starGift));
        } else {
            z8 = z2;
            if (z28 && !this.z2) {
                rqaVar.i(0, k96.M0(2131749926, null), null, i2(starGift));
            } else {
                if ((!z27 && !z3) || j3 <= 0) {
                    if (i == 0 || starGift.title == null) {
                        M0 = k96.M0(z27 ? 2131749921 : 2131749925, null);
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(starGift.title);
                        sb2.append(" #");
                        M0 = ls6.m(i, ',', sb2);
                    }
                    this.Q2 = M0;
                    if (z8) {
                        tL_textWithEntities2 = tL_textWithEntities;
                        u41Var = u41Var3;
                        z9 = z3;
                        concat = null;
                        i2 = 0;
                    } else {
                        if (!u && u1() != null) {
                            k27 k27Var2 = this.C2;
                            TimeUnit timeUnit = TimeUnit.SECONDS;
                            if (k27Var2 != null) {
                                TLRPC.MessageAction messageAction3 = k27Var2.k.action;
                                if (messageAction3 instanceof TLRPC.TL_messageActionStarGift) {
                                    TLRPC.TL_messageActionStarGift tL_messageActionStarGift2 = (TLRPC.TL_messageActionStarGift) messageAction3;
                                    boolean z29 = tL_messageActionStarGift2.peer != null;
                                    k27Var2.O3();
                                    boolean z30 = z29;
                                    k27.B0(this.C2.k);
                                    y6c.h(this.a).e();
                                    u41Var = u41Var3;
                                    z9 = z3;
                                    int g = ((int) na7.q1(this.a).k4.v3.g(timeUnit)) - (ConnectionsManager.getInstance(this.a).getCurrentTime() - this.C2.k.date);
                                    if (z30) {
                                        TLRPC.Peer peer9 = tL_messageActionStarGift2.peer;
                                        if (peer9 != null) {
                                            tL_textWithEntities2 = tL_textWithEntities;
                                        } else {
                                            tL_textWithEntities2 = tL_textWithEntities;
                                        }
                                        if (z27) {
                                            str2 = null;
                                            str3 = k96.M0(!z ? z28 ? 2131750157 : 2131750162 : z28 ? 2131750156 : 2131750161, null);
                                        } else {
                                            str3 = k96.a0(null, null, (!z9 || j3 <= 0) ? 2131750150 : 2131750149, s);
                                            str2 = null;
                                        }
                                    } else {
                                        tL_textWithEntities2 = tL_textWithEntities;
                                    }
                                    if (!tL_messageActionStarGift2.converted) {
                                        if (tL_messageActionStarGift2.convert_stars > 0) {
                                        }
                                    }
                                    if (z27) {
                                    }
                                }
                            } else {
                                tL_textWithEntities2 = tL_textWithEntities;
                                u41Var = u41Var3;
                                z9 = z3;
                                TL_stars.SavedStarGift savedStarGift = this.A2;
                                if (savedStarGift != null) {
                                    int g2 = ((int) na7.q1(this.a).k4.v3.g(timeUnit)) - (ConnectionsManager.getInstance(this.a).getCurrentTime() - savedStarGift.date);
                                    if (G1(this.a, j5)) {
                                        int i7 = this.A2.flags;
                                        if (((j5 < 0 ? 2048 : 8) & i7) != 0) {
                                            if ((i7 & 16) != 0) {
                                                if ((i7 & 2) != 0) {
                                                }
                                            }
                                        }
                                    }
                                }
                                if (z27) {
                                }
                            }
                            SpannableStringBuilder T2 = gl.T2(str3);
                            if (u && e1()) {
                                c = 1;
                                charSequence = gl.E2(gl.Q2(k96.M0(2131750094, str2).replace(' ', (char) 160), new nna(this, (byte) 15)), true);
                            } else {
                                c = 1;
                                charSequence = "";
                            }
                            CharSequence[] charSequenceArr = new CharSequence[3];
                            i2 = 0;
                            charSequenceArr[0] = T2;
                            charSequenceArr[c] = " ";
                            charSequenceArr[2] = charSequence;
                            concat = TextUtils.concat(charSequenceArr);
                        }
                        tL_textWithEntities2 = tL_textWithEntities;
                        u41Var = u41Var3;
                        z9 = z3;
                        if (z27) {
                        }
                        SpannableStringBuilder T22 = gl.T2(str3);
                        if (u) {
                        }
                        c = 1;
                        charSequence = "";
                        CharSequence[] charSequenceArr2 = new CharSequence[3];
                        i2 = 0;
                        charSequenceArr2[0] = T22;
                        charSequenceArr2[c] = " ";
                        charSequenceArr2[2] = charSequence;
                        concat = TextUtils.concat(charSequenceArr2);
                    }
                    rqaVar.i(i2, M0, concat, i2(starGift));
                    mfbVar = this.d2;
                    mfbVar.removeAllViews();
                    long n = peer2 == null ? cf3.n(peer2) : z27 ? j : j5;
                    if (peer == null) {
                        j5 = cf3.n(peer);
                    } else if (!z27) {
                        j5 = j;
                    }
                    TLRPC.User V1 = na7.q1(this.a).V1(Long.valueOf(n));
                    byte b2 = 10;
                    if (peer3 == null) {
                        long n2 = cf3.n(peer3);
                        this.d2.m(k96.M0(2131749920, null), this.a, n2, new pna(this, n2, (byte) 7), null, z28 ? null : new pna(this, n2, (byte) 8));
                    } else {
                        if (n != j || z6 || z28) {
                            this.d2.m(k96.M0(2131750177, null), this.a, n, new pna(this, n, (byte) 9), (n == j || n == 2666000 || l7c.y(V1) || u || z28) ? null : k96.M0(2131750268, null), z28 ? null : new pna(this, n, b2));
                        }
                        if (j5 != j || z28) {
                            this.d2.m(k96.M0(2131749920, null), this.a, j5, new pna(this, j5, (byte) 11), null, z28 ? null : new pna(this, j5, (byte) 12));
                        }
                    }
                    mfbVar.g(i6, k96.M0(2131744723, null));
                    if (starGift.stars > 0) {
                        String M05 = k96.M0(2131749831, null);
                        String concat2 = "⭐️ ".concat(k96.E(starGift.stars + j3, ','));
                        if (!e1() || z8) {
                            r7 = 0;
                            charSequence3 = "";
                        } else {
                            r7 = 0;
                            charSequence3 = r41.b(k96.H(',', "Gift2ButtonSell", (int) j2), new nna(this, b2), this.J0, null);
                        }
                        mfbVar.f(M05, jva.a1(false, TextUtils.concat(concat2, " ", charSequence3), 0.8f, r7), r7, r7);
                    }
                    if (starGift.limited && !z8) {
                        jva.B0(mfbVar, this.a, starGift, this.J0);
                    }
                    tL_textWithEntities3 = tL_textWithEntities2;
                    if (tL_textWithEntities2 != null && !TextUtils.isEmpty(tL_textWithEntities3.text) && !z8) {
                        mfbVar.b(tL_textWithEntities3.text, tL_textWithEntities3.entities);
                    }
                    if (z27 && z9 && !z8) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("^  ");
                        cm2 cm2Var = this.Y2;
                        if (cm2Var == null) {
                            u41Var2 = u41Var;
                            i4 = 0;
                            cm2Var = new cm2(0, new sqa(u41Var2, bkb.v0(bkb.Ei, this.J0)));
                            this.Y2 = cm2Var;
                        } else {
                            u41Var2 = u41Var;
                            i4 = 0;
                        }
                        spannableStringBuilder2.setSpan(cm2Var, i4, 1, 33);
                        if (j3 > 0) {
                            charSequence2 = null;
                            M02 = k96.M0(2131749859, null);
                        } else {
                            charSequence2 = null;
                            M02 = k96.M0(2131749858, null);
                        }
                        spannableStringBuilder2.append((CharSequence) M02);
                        u41Var2.setFilled(true);
                        u41Var2.i(spannableStringBuilder2, !this.Z2, true);
                        u41Var2.g(charSequence2, !this.Z2);
                        u41Var2.setOnClickListener(new lna(this, (byte) 21));
                    } else {
                        u41Var2 = u41Var;
                        if (this.m2 || this.U1 == null || this.B2 == null || w1() < 0 || this.B2.b(w1()) < 0) {
                            if ((starGift instanceof TL_stars.TL_starGift) || TextUtils.isEmpty(str)) {
                                z10 = true;
                                str4 = null;
                                u41Var2.setFilled(true);
                                u41Var2.i(k96.M0(2131747638, null), !this.Z2, true);
                                u41Var2.g(null, !this.Z2);
                                u41Var2.setOnClickListener(new lna(this, (byte) 19));
                            } else {
                                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("^  ");
                                cm2 cm2Var2 = this.Y2;
                                if (cm2Var2 == null) {
                                    i3 = 0;
                                    cm2Var2 = new cm2(0, new sqa(u41Var2, bkb.v0(bkb.Ei, this.J0)));
                                    this.Y2 = cm2Var2;
                                } else {
                                    i3 = 0;
                                }
                                z10 = true;
                                spannableStringBuilder3.setSpan(cm2Var2, i3, 1, 33);
                                str4 = null;
                                spannableStringBuilder3.append((CharSequence) k96.M0(2131750175, null));
                                u41Var2.setFilled(true);
                                u41Var2.i(spannableStringBuilder3, !this.Z2, true);
                                u41Var2.g(null, !this.Z2);
                                u41Var2.setOnClickListener(new lna(this, (byte) 18));
                            }
                            z12 = z;
                            z13 = z27;
                            z14 = z8;
                            if (this.j3) {
                            }
                            if (starGift != null) {
                            }
                            if (starGift == null) {
                            }
                            l46 l46Var22 = this.c2;
                            if (!z14) {
                            }
                            l46Var = this.e2;
                            if (z15) {
                            }
                            if (z4) {
                            }
                            l46Var.setVisibility(8);
                            if (this.Z2) {
                            }
                            this.o1.setTitle(this.Q2);
                            C2();
                        }
                        u41Var2.setFilled(false);
                        int b3 = this.B2.b(w1());
                        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                        spannableStringBuilder4.append((CharSequence) k96.M0(2131749839, null));
                        Object obj = this.B2.get(b3);
                        if (!(obj instanceof TL_stars.SavedStarGift) || (starGift2 = ((TL_stars.SavedStarGift) obj).gift) == null || (document = starGift2.getDocument()) == null) {
                            z11 = true;
                        } else {
                            spannableStringBuilder4.append((CharSequence) " e");
                            z11 = true;
                            spannableStringBuilder4.setSpan(new gm(document, u41Var2.getTextPaint().getFontMetricsInt()), spannableStringBuilder4.length() - 1, spannableStringBuilder4.length(), 33);
                        }
                        u41Var2.i(spannableStringBuilder4, this.Z2 ^ z11, z11);
                        u41Var2.g(null, this.Z2 ^ z11);
                        u41Var2.setOnClickListener(new mna(this, b3, (byte) 3));
                    }
                    z10 = true;
                    str4 = null;
                    z12 = z;
                    z13 = z27;
                    z14 = z8;
                    if (this.j3) {
                    }
                    if (starGift != null) {
                    }
                    if (starGift == null) {
                    }
                    l46 l46Var222 = this.c2;
                    if (!z14) {
                    }
                    l46Var = this.e2;
                    if (z15) {
                    }
                    if (z4) {
                    }
                    l46Var.setVisibility(8);
                    if (this.Z2) {
                    }
                    this.o1.setTitle(this.Q2);
                    C2();
                }
                String M06 = k96.M0(z27 ? 2131749921 : 2131749925, null);
                this.Q2 = M06;
                rqaVar.i(0, M06, z8 ? null : !z27 ? k96.M0(2131750132, null) : k96.a0(null, null, 2131750133, s), i2(starGift));
            }
        }
        tL_textWithEntities2 = tL_textWithEntities;
        u41Var = u41Var3;
        z9 = z3;
        mfbVar = this.d2;
        mfbVar.removeAllViews();
        if (peer2 == null) {
        }
        if (peer == null) {
        }
        TLRPC.User V12 = na7.q1(this.a).V1(Long.valueOf(n));
        byte b22 = 10;
        if (peer3 == null) {
        }
        mfbVar.g(i6, k96.M0(2131744723, null));
        if (starGift.stars > 0) {
        }
        if (starGift.limited) {
            jva.B0(mfbVar, this.a, starGift, this.J0);
        }
        tL_textWithEntities3 = tL_textWithEntities2;
        if (tL_textWithEntities2 != null) {
            mfbVar.b(tL_textWithEntities3.text, tL_textWithEntities3.entities);
        }
        if (z27) {
        }
        u41Var2 = u41Var;
        if (this.m2) {
        }
        if (starGift instanceof TL_stars.TL_starGift) {
        }
        z10 = true;
        str4 = null;
        u41Var2.setFilled(true);
        u41Var2.i(k96.M0(2131747638, null), !this.Z2, true);
        u41Var2.g(null, !this.Z2);
        u41Var2.setOnClickListener(new lna(this, (byte) 19));
        z12 = z;
        z13 = z27;
        z14 = z8;
        if (this.j3) {
        }
        if (starGift != null) {
        }
        if (starGift == null) {
        }
        l46 l46Var2222 = this.c2;
        if (!z14) {
        }
        l46Var = this.e2;
        if (z15) {
        }
        if (z4) {
        }
        l46Var.setVisibility(8);
        if (this.Z2) {
        }
        this.o1.setTitle(this.Q2);
        C2();
    }

    public final void m2(String str, TL_stars.TL_starGiftUnique tL_starGiftUnique, ysa ysaVar) {
        float f;
        hqa hqaVar;
        TL_stars.TL_starGiftUnique tL_starGiftUnique2;
        this.D2 = str;
        this.E2 = tL_starGiftUnique;
        this.B2 = ysaVar;
        this.F2 = (this.d3 != null || tL_starGiftUnique.resell_amount == null || F1(this.a, cf3.n(tL_starGiftUnique.owner_id)) || D1(this.a, tL_starGiftUnique) || H1(tL_starGiftUnique)) ? false : true;
        if (!this.L2 && (hqaVar = this.K2) != null && hqaVar.o && (tL_starGiftUnique2 = hqaVar.l) != null && tL_starGiftUnique2.id != tL_starGiftUnique.id) {
            hqaVar.a();
            this.K2 = null;
            rqa rqaVar = this.a2;
            rqaVar.b.setAlpha(1.0f);
            rqaVar.c.setAlpha(0.0f);
        }
        this.Z1.b(this.a, this.A2);
        o2(tL_starGiftUnique, false, null, null);
        String str2 = tL_starGiftUnique.owner_address;
        String str3 = tL_starGiftUnique.gift_address;
        boolean z = tL_starGiftUnique.host_id != null;
        TL_wallet.walletTransaction wallettransaction = this.d3;
        l46 l46Var = this.c2;
        if (wallettransaction != null || !z || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            f = 0.66f;
            l46Var.setVisibility(8);
        } else {
            f = 0.66f;
            l46Var.setText(gl.F2(gl.O2(k96.M0(2131750165, null), -1, 0, new noa(this, str3, (byte) 3), null), true, gl.L(2.6666667f), gl.L(0.66f)));
            l46Var.setVisibility(0);
            zkb.X(l46Var, bkb.p5, this.J0);
        }
        TL_wallet.walletTransaction wallettransaction2 = this.d3;
        l46 l46Var2 = this.e2;
        if (wallettransaction2 != null || z || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            l46Var2.setVisibility(8);
        } else {
            l46Var2.setText(gl.F2(gl.O2(k96.M0(2131750165, null), -1, 0, new noa(this, str3, (byte) 4), null), true, gl.L(2.6666667f), gl.L(f)));
            l46Var2.setVisibility(0);
        }
        D2();
        if (this.F2) {
            p2(tL_starGiftUnique);
            this.f2.setOnClickListener(new lna(this, (byte) 17));
        }
        if (this.Z2) {
            z2(0, false, null);
            this.m1.m0(1);
            this.Z2 = false;
        }
        C2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02ed A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03ec A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0478 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0311  */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v28, types: [cm2[], lfb[], q41[]] */
    /* JADX WARN: Type inference failed for: r13v38 */
    /* JADX WARN: Type inference failed for: r14v40 */
    /* JADX WARN: Type inference failed for: r14v46, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v47 */
    /* JADX WARN: Type inference failed for: r14v49 */
    /* JADX WARN: Type inference failed for: r2v8, types: [android.view.ViewGroup, mfb] */
    /* JADX WARN: Type inference failed for: r34v0 */
    /* JADX WARN: Type inference failed for: r35v0, types: [fx0, fy0, vqa] */
    /* JADX WARN: Type inference failed for: r7v15, types: [android.view.View, u41] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n2(TL_stars.SavedStarGift savedStarGift, ysa ysaVar) {
        long j;
        int i;
        String M0;
        int i2;
        CharSequence charSequence;
        String str;
        String a0;
        int i3;
        boolean z;
        SpannableStringBuilder spannableStringBuilder;
        TL_stars.StarGift starGift;
        ?? r13;
        SpannableString spannableString;
        TL_stars.StarGift starGift2;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        boolean z2;
        ?? r7;
        int i4;
        boolean z3;
        TL_stars.StarGift starGift3;
        TLRPC.Document document;
        String str2;
        String str3;
        boolean z4;
        int i5;
        CharSequence charSequence2;
        String M02;
        String str4;
        String M03;
        TL_stars.StarGift starGift4;
        float f;
        float f2;
        ?? r14;
        boolean z5;
        hqa hqaVar;
        if (savedStarGift == null) {
            return;
        }
        int i6 = this.a;
        long j2 = this.S1;
        this.z2 = F1(i6, j2);
        this.A2 = savedStarGift;
        this.B2 = ysaVar;
        this.C2 = null;
        boolean z6 = this.L2;
        rqa rqaVar = this.a2;
        if (!z6 && (hqaVar = this.K2) != null && hqaVar.o && hqaVar.l != null) {
            hqaVar.a();
            this.K2 = null;
            rqaVar.b.setVisibility(0);
            rqaVar.c.setVisibility(4);
        }
        this.Z1.b(this.a, savedStarGift);
        String s = cf3.s(j2);
        long n = cf3.n(savedStarGift.from_id);
        boolean u = l7c.u(na7.q1(this.a).V1(Long.valueOf(n)));
        int g = ((int) na7.q1(this.a).k4.v3.g(TimeUnit.SECONDS)) - (ConnectionsManager.getInstance(this.a).getCurrentTime() - savedStarGift.date);
        long e = y6c.h(this.a).e();
        if ((savedStarGift.flags & 2) == 0) {
            n = 2666000;
        }
        int i7 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        boolean z7 = i7 < 0;
        TLRPC.TL_textWithEntities tL_textWithEntities2 = savedStarGift.message;
        boolean z8 = savedStarGift.refunded;
        TL_stars.StarGift starGift5 = savedStarGift.gift;
        if (starGift5 instanceof TL_stars.TL_starGiftUnique) {
            str2 = starGift5.owner_address;
            str3 = starGift5.gift_address;
            z4 = starGift5.host_id != null;
            o2((TL_stars.TL_starGiftUnique) starGift5, z8, !savedStarGift.name_hidden ? na7.q1(this.a).Z1(cf3.n(savedStarGift.from_id)) : null, savedStarGift.message);
            i = i7;
        } else {
            boolean z9 = this.z2 && e == n && i7 >= 0;
            boolean I1 = I1(this.a, A1());
            v1();
            rqaVar.f(starGift5, false, false, I1);
            rqaVar.setShowOptions(g1());
            ?? r2 = this.d2;
            r2.removeAllViews();
            ?? r34 = "";
            if (z9) {
                if (savedStarGift.gift_num == 0 || (starGift4 = savedStarGift.gift) == null || starGift4.title == null) {
                    j = e;
                    str4 = null;
                    M03 = k96.M0(2131749924, null);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(savedStarGift.gift.title);
                    sb.append(" #");
                    j = e;
                    M03 = ls6.m(savedStarGift.gift_num, ',', sb);
                    str4 = null;
                }
                this.Q2 = M03;
                CharSequence charSequence3 = str4;
                if (!z8) {
                    if (savedStarGift.can_upgrade) {
                        charSequence3 = gl.T2(k96.M0(2131749981, str4));
                    } else {
                        long j3 = savedStarGift.convert_stars;
                        charSequence3 = j3 > 0 ? gl.T2(k96.H(',', "Gift2SelfInfoConvert", (int) j3)) : gl.T2(k96.M0(2131749988, null));
                    }
                }
                rqaVar.i(0, M03, charSequence3, i2(savedStarGift.gift));
            } else {
                j = e;
                if (!z7 || this.z2) {
                    boolean z10 = this.z2;
                    if (!z10 || savedStarGift.can_upgrade) {
                        i = i7;
                        if (savedStarGift.upgrade_stars > 0) {
                            String M04 = k96.M0(z10 ? 2131749925 : 2131749926, null);
                            this.Q2 = M04;
                            rqaVar.i(0, M04, z8 ? null : this.z2 ? k96.M0(2131750132, null) : null, i2(savedStarGift.gift));
                            if (j == n || z7) {
                                this.d2.m(k96.M0(2131750177, null), this.a, n, new pna(this, n, (byte) 4), (n != j || n == 2666000 || u || l7c.y(na7.q1(this.a).V1(Long.valueOf(n))) || z7) ? null : k96.M0(2131750268, null), new pna(this, n, (byte) 5));
                            }
                            r2.f(k96.M0(2131744723, null), k96.a0(null, null, 2131742520, k96.D0().r0().format(new Date(savedStarGift.date * 1000)), k96.D0().o0().format(new Date(savedStarGift.date * 1000))), null, null);
                            String M05 = k96.M0(2131749831, null);
                            String concat = "⭐️ ".concat(k96.E(savedStarGift.gift.stars + savedStarGift.upgrade_stars, ','));
                            if (e1() || z8) {
                                r13 = 0;
                                spannableString = r34;
                            } else {
                                r13 = 0;
                                spannableString = r41.b(k96.H(',', "Gift2ButtonSell", (int) savedStarGift.convert_stars), new nna(this, (byte) 10), this.J0, null);
                            }
                            r2.f(M05, jva.a1(false, TextUtils.concat(concat, " ", spannableString), 0.8f, r13), r13, r13);
                            starGift2 = savedStarGift.gift;
                            if (starGift2.limited && !z8) {
                                jva.B0(r2, this.a, starGift2, this.J0);
                            }
                            tL_textWithEntities = savedStarGift.message;
                            if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text) && !z8) {
                                TLRPC.TL_textWithEntities tL_textWithEntities3 = savedStarGift.message;
                                r2.b(tL_textWithEntities3.text, tL_textWithEntities3.entities);
                            }
                            z2 = this.z2;
                            r7 = this.f2;
                            if (!z2 && savedStarGift.can_upgrade) {
                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("^  ");
                                cm2 cm2Var = this.Y2;
                                if (cm2Var == null) {
                                    i5 = 0;
                                    cm2Var = new cm2(0, new sqa(r7, bkb.v0(bkb.Ei, this.J0)));
                                    this.Y2 = cm2Var;
                                } else {
                                    i5 = 0;
                                }
                                spannableStringBuilder2.setSpan(cm2Var, i5, 1, 33);
                                if (savedStarGift.upgrade_stars > 0) {
                                    charSequence2 = null;
                                    M02 = k96.M0(2131749859, null);
                                } else {
                                    charSequence2 = null;
                                    M02 = k96.M0(2131749858, null);
                                }
                                spannableStringBuilder2.append((CharSequence) M02);
                                r7.setFilled(true);
                                r7.i(spannableStringBuilder2, !this.Z2, true);
                                r7.g(charSequence2, !this.Z2);
                                r7.setOnClickListener(new lna(this, (byte) 13));
                            } else if (!this.m2 && z2 && this.U1 != null && this.B2 != null && w1() >= 0 && this.B2.b(w1()) >= 0) {
                                r7.setFilled(false);
                                int b = this.B2.b(w1());
                                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                                spannableStringBuilder3.append((CharSequence) k96.M0(2131749839, null));
                                Object obj = this.B2.get(b);
                                if (!(obj instanceof TL_stars.SavedStarGift) || (starGift3 = ((TL_stars.SavedStarGift) obj).gift) == null || (document = starGift3.getDocument()) == null) {
                                    z3 = true;
                                } else {
                                    spannableStringBuilder3.append((CharSequence) " e");
                                    z3 = true;
                                    spannableStringBuilder3.setSpan(new gm(document, r7.getTextPaint().getFontMetricsInt()), spannableStringBuilder3.length() - 1, spannableStringBuilder3.length(), 33);
                                }
                                r7.i(spannableStringBuilder3, this.Z2 ^ z3, z3);
                                r7.g(null, this.Z2 ^ z3);
                                r7.setOnClickListener(new mna(this, b, (byte) 2));
                            } else if ((savedStarGift.gift instanceof TL_stars.TL_starGift) || TextUtils.isEmpty(savedStarGift.prepaid_upgrade_hash)) {
                                r7.setFilled(true);
                                r7.i(k96.M0(2131747638, null), !this.Z2, true);
                                r7.g(null, !this.Z2);
                                r7.setOnClickListener(new lna(this, (byte) 15));
                            } else {
                                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder("^  ");
                                cm2 cm2Var2 = this.Y2;
                                if (cm2Var2 == null) {
                                    i4 = 0;
                                    cm2Var2 = new cm2(0, new sqa(r7, bkb.v0(bkb.Ei, this.J0)));
                                    this.Y2 = cm2Var2;
                                } else {
                                    i4 = 0;
                                }
                                spannableStringBuilder4.setSpan(cm2Var2, i4, 1, 33);
                                spannableStringBuilder4.append((CharSequence) k96.M0(2131750175, null));
                                r7.setFilled(true);
                                r7.i(spannableStringBuilder4, !this.Z2, true);
                                r7.g(null, !this.Z2);
                                r7.setOnClickListener(new lna(this, (byte) 14));
                            }
                            str2 = null;
                            str3 = null;
                            z4 = false;
                        }
                    } else {
                        i = i7;
                    }
                    if (savedStarGift.gift_num == 0 || (starGift = savedStarGift.gift) == null || starGift.title == null) {
                        M0 = k96.M0(z10 ? 2131749925 : 2131749926, null);
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(savedStarGift.gift.title);
                        sb2.append(" #");
                        M0 = ls6.m(savedStarGift.gift_num, ',', sb2);
                    }
                    this.Q2 = M0;
                    if (z8 || !this.z2) {
                        i2 = 0;
                        charSequence = null;
                    } else {
                        if (!u && e1()) {
                            if (this.z2) {
                                a0 = k96.H(',', g <= 0 ? z7 ? "Gift2Info2ChannelExpired" : "Gift2Info2Expired" : z7 ? "Gift2Info3Channel" : "Gift2Info3", (int) savedStarGift.convert_stars);
                            } else {
                                a0 = k96.K("Gift2Info2Out", (int) savedStarGift.convert_stars, ',', s);
                            }
                            str = null;
                        } else if (this.z2) {
                            if (savedStarGift.unsaved) {
                                i3 = z7 ? 2131750157 : 2131750162;
                                str = null;
                            } else {
                                str = null;
                                i3 = z7 ? 2131750156 : 2131750161;
                            }
                            a0 = k96.M0(i3, str);
                        } else {
                            str = null;
                            a0 = k96.a0(null, null, (!savedStarGift.can_upgrade || savedStarGift.upgrade_stars <= 0) ? 2131750150 : 2131750149, s);
                        }
                        SpannableStringBuilder T2 = gl.T2(a0);
                        if (u || !e1()) {
                            z = true;
                            spannableStringBuilder = r34;
                        } else {
                            z = true;
                            spannableStringBuilder = gl.E2(gl.Q2(k96.M0(2131750094, str).replace(' ', (char) 160), new nna(this, (byte) 6)), true);
                        }
                        boolean z11 = z;
                        CharSequence[] charSequenceArr = new CharSequence[3];
                        i2 = 0;
                        charSequenceArr[0] = T2;
                        charSequenceArr[z11 ? 1 : 0] = " ";
                        charSequenceArr[2] = spannableStringBuilder;
                        charSequence = TextUtils.concat(charSequenceArr);
                    }
                    rqaVar.i(i2, M0, charSequence, i2(savedStarGift.gift));
                    if (j == n) {
                    }
                    this.d2.m(k96.M0(2131750177, null), this.a, n, new pna(this, n, (byte) 4), (n != j || n == 2666000 || u || l7c.y(na7.q1(this.a).V1(Long.valueOf(n))) || z7) ? null : k96.M0(2131750268, null), new pna(this, n, (byte) 5));
                    r2.f(k96.M0(2131744723, null), k96.a0(null, null, 2131742520, k96.D0().r0().format(new Date(savedStarGift.date * 1000)), k96.D0().o0().format(new Date(savedStarGift.date * 1000))), null, null);
                    String M052 = k96.M0(2131749831, null);
                    String concat2 = "⭐️ ".concat(k96.E(savedStarGift.gift.stars + savedStarGift.upgrade_stars, ','));
                    if (e1()) {
                    }
                    r13 = 0;
                    spannableString = r34;
                    r2.f(M052, jva.a1(false, TextUtils.concat(concat2, " ", spannableString), 0.8f, r13), r13, r13);
                    starGift2 = savedStarGift.gift;
                    if (starGift2.limited) {
                        jva.B0(r2, this.a, starGift2, this.J0);
                    }
                    tL_textWithEntities = savedStarGift.message;
                    if (tL_textWithEntities != null) {
                        TLRPC.TL_textWithEntities tL_textWithEntities32 = savedStarGift.message;
                        r2.b(tL_textWithEntities32.text, tL_textWithEntities32.entities);
                    }
                    z2 = this.z2;
                    r7 = this.f2;
                    if (!z2) {
                    }
                    if (!this.m2) {
                    }
                    if (savedStarGift.gift instanceof TL_stars.TL_starGift) {
                    }
                    r7.setFilled(true);
                    r7.i(k96.M0(2131747638, null), !this.Z2, true);
                    r7.g(null, !this.Z2);
                    r7.setOnClickListener(new lna(this, (byte) 15));
                    str2 = null;
                    str3 = null;
                    z4 = false;
                } else {
                    String M06 = k96.M0(2131749926, null);
                    this.Q2 = M06;
                    rqaVar.i(0, M06, null, h2(savedStarGift.gift.released_by));
                }
            }
            i = i7;
            if (j == n) {
            }
            this.d2.m(k96.M0(2131750177, null), this.a, n, new pna(this, n, (byte) 4), (n != j || n == 2666000 || u || l7c.y(na7.q1(this.a).V1(Long.valueOf(n))) || z7) ? null : k96.M0(2131750268, null), new pna(this, n, (byte) 5));
            r2.f(k96.M0(2131744723, null), k96.a0(null, null, 2131742520, k96.D0().r0().format(new Date(savedStarGift.date * 1000)), k96.D0().o0().format(new Date(savedStarGift.date * 1000))), null, null);
            String M0522 = k96.M0(2131749831, null);
            String concat22 = "⭐️ ".concat(k96.E(savedStarGift.gift.stars + savedStarGift.upgrade_stars, ','));
            if (e1()) {
            }
            r13 = 0;
            spannableString = r34;
            r2.f(M0522, jva.a1(false, TextUtils.concat(concat22, " ", spannableString), 0.8f, r13), r13, r13);
            starGift2 = savedStarGift.gift;
            if (starGift2.limited) {
            }
            tL_textWithEntities = savedStarGift.message;
            if (tL_textWithEntities != null) {
            }
            z2 = this.z2;
            r7 = this.f2;
            if (!z2) {
            }
            if (!this.m2) {
            }
            if (savedStarGift.gift instanceof TL_stars.TL_starGift) {
            }
            r7.setFilled(true);
            r7.i(k96.M0(2131747638, null), !this.Z2, true);
            r7.g(null, !this.Z2);
            r7.setOnClickListener(new lna(this, (byte) 15));
            str2 = null;
            str3 = null;
            z4 = false;
        }
        boolean z12 = savedStarGift.refunded;
        byte b2 = 8;
        l46 l46Var = this.c2;
        if (z12) {
            l46Var.setVisibility(0);
            l46Var.setText(k96.M0(2131750029, null));
            zkb.X(l46Var, bkb.p7, this.J0);
            f = 0.66f;
            f2 = 2.6666667f;
        } else if (!z4 || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            f = 0.66f;
            f2 = 2.6666667f;
            if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3) && this.z2 && (savedStarGift.gift instanceof TL_stars.TL_starGift) && savedStarGift.name_hidden) {
                l46Var.setVisibility(0);
                l46Var.setText(k96.M0((tL_textWithEntities2 == null || TextUtils.isEmpty(tL_textWithEntities2.text)) ? 2131750164 : 2131750163, null));
                zkb.X(l46Var, bkb.p5, this.J0);
            } else {
                l46Var.setVisibility(8);
            }
        } else {
            f = 0.66f;
            f2 = 2.6666667f;
            l46Var.setText(gl.F2(gl.O2(k96.M0(2131750165, null), -1, 0, new noa(this, str3, (byte) 0), null), true, gl.L(2.6666667f), gl.L(0.66f)));
            l46Var.setVisibility(0);
            zkb.X(l46Var, bkb.p5, this.J0);
        }
        l46 l46Var2 = this.e2;
        if (!z4 && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            r14 = 0;
            l46Var2.setText(gl.F2(gl.O2(k96.M0(2131750165, null), -1, 0, new noa(this, str3, (byte) 2), null), true, gl.L(f2), gl.L(f)));
            l46Var2.setVisibility(0);
        } else if (this.z2 && F1(this.a, j2)) {
            if (i >= 0) {
                SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                if (savedStarGift.unsaved) {
                    spannableStringBuilder5.append((CharSequence) ". ");
                    spannableStringBuilder5.setSpan(new cm2(R.drawable.mini_gift_hidden, 0), 0, 1, 33);
                }
                spannableStringBuilder5.append((CharSequence) gl.O2(k96.M0(!savedStarGift.unsaved ? 2131750039 : 2131750042, null), -1, 0, new nna(this, b2), null));
                l46Var2.setText(gl.F2(spannableStringBuilder5, true, gl.L(f2), gl.L(f)));
                z5 = false;
            } else {
                z5 = false;
                l46Var2.setText(gl.F2(gl.O2(k96.M0(!savedStarGift.unsaved ? 2131750237 : 2131750238, null), -1, 0, new nna(this, b2), null), true, gl.L(f2), gl.L(f)));
            }
            l46Var2.setVisibility(z5 ? 1 : 0);
            r14 = z5;
        } else {
            r14 = 0;
            l46Var2.setVisibility(8);
        }
        if (this.Z2) {
            z2(r14, r14, null);
            this.m1.m0(1);
            this.Z2 = r14;
        }
        this.o1.setTitle(this.Q2);
        C2();
    }

    @Override // fx0
    public final void o0() {
        je5 je5Var = this.w3;
        if (je5Var != null) {
            je5Var.f(true);
            this.w3 = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:369:0x05d1, code lost:
    
        if (((org.telegram.tgnet.TLRPC.TL_messageActionStarGiftUnique) r4).drop_original_details_stars >= 0) goto L203;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x06c8  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0a27  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0b65  */
    /* JADX WARN: Removed duplicated region for block: B:294:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0a36  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0a55  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0a19  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0220 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0276  */
    /* JADX WARN: Type inference failed for: r10v63 */
    /* JADX WARN: Type inference failed for: r10v67 */
    /* JADX WARN: Type inference failed for: r10v72 */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.String, lfb[], q41[]] */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [java.lang.String, lfb[], q41[]] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22, types: [java.lang.String, lfb[], q41[]] */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v53, types: [java.lang.String, lfb[], q41[]] */
    /* JADX WARN: Type inference failed for: r11v55, types: [java.lang.String, lfb[], q41[]] */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r13v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v37 */
    /* JADX WARN: Type inference failed for: r13v39 */
    /* JADX WARN: Type inference failed for: r13v40 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o2(TL_stars.TL_starGiftUnique tL_starGiftUnique, boolean z, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        final byte b;
        CharSequence charSequence;
        CharSequence charSequence2;
        String M0;
        Spannable spannable;
        byte b2;
        String str;
        byte b3;
        int i;
        int i2;
        ?? r13;
        ?? r12;
        ?? r10;
        TL_stars.starGiftAttributeOriginalDetails stargiftattributeoriginaldetails;
        float f;
        rqa rqaVar;
        Class cls;
        Class cls2;
        Class cls3;
        hqa hqaVar;
        TL_stars.TL_starGiftUnique tL_starGiftUnique2;
        boolean z2;
        TL_stars.StarGift starGift;
        TLRPC.Document document;
        hqa hqaVar2;
        boolean z3;
        ?? r11;
        int i3;
        ?? r112;
        int i4;
        Object obj;
        Object obj2;
        int i5;
        CharSequence V;
        TLRPC.Message message;
        k27 k27Var;
        byte b4;
        String str2;
        final byte b5;
        int i6;
        TL_wallet.nftItem nftitem;
        String str3;
        TL_wallet.nftItem nftitem2;
        String str4;
        joc jocVar;
        hqa hqaVar3;
        TL_stars.TL_starGiftUnique tL_starGiftUnique3;
        long n = cf3.n(tL_starGiftUnique.owner_id);
        long n2 = cf3.n(tL_starGiftUnique.host_id);
        StringBuilder sb = new StringBuilder();
        sb.append(tL_starGiftUnique.title);
        sb.append(" #");
        this.Q2 = ls6.m(tL_starGiftUnique.num, ',', sb);
        boolean z4 = this.L2;
        rqa rqaVar2 = this.a2;
        if (!z4 && (hqaVar3 = this.K2) != null && hqaVar3.o && (tL_starGiftUnique3 = hqaVar3.l) != null && tL_starGiftUnique3.id != tL_starGiftUnique.id) {
            hqaVar3.a();
            this.K2 = null;
            rqaVar2.b.setAlpha(1.0f);
            rqaVar2.c.setAlpha(0.0f);
        } else if (z4 && this.K2 == null) {
            this.K2 = new hqa(rqaVar2);
        }
        boolean z5 = this.d3 == null;
        rqaVar2.setInWallet(z5 && this.a3 == null && x2(tL_starGiftUnique));
        TextPaint textPaint = rqaVar2.H;
        boolean z6 = z5 && G1(this.a, n);
        boolean z7 = z5 && G1(this.a, n2);
        boolean I1 = I1(this.a, A1());
        v1();
        rqaVar2.f(tL_starGiftUnique, z6, z7, I1);
        rqaVar2.setShowOptions(false);
        byte b6 = 8;
        byte b7 = 5;
        byte b8 = 4;
        byte b9 = 6;
        if (this.a3 != null) {
            if (this.c3 != null) {
                rqaVar2.j(new roa(this, b8), this.b3 == null ? null : new lna(this, b8), new lna(this, b7), true);
                rlc rlcVar = this.c3;
                koc kocVar = rlcVar.b.k0;
                rqaVar2.setWalletCard((kocVar == null || (nftitem2 = rlcVar.a) == null || (str4 = nftitem2.address) == null || (jocVar = (joc) kocVar.f.get(str4)) == null || !jocVar.b()) ? false : true);
            } else {
                rqaVar2.j(new lna(this, b9), this.b3 == null ? null : new lna(this, (byte) 7), new lna(this, b6), tL_starGiftUnique.host_id != null);
            }
            qlc qlcVar = this.b3;
            if (qlcVar != null) {
                i6 = ((d) qlcVar.c).currentAccount;
                boolean F = koc.F(i6, qlcVar.a.slug);
                qlc qlcVar2 = this.b3;
                koc kocVar2 = qlcVar2.c.k0;
                boolean z8 = (kocVar2 == null || (nftitem = qlcVar2.b) == null || (str3 = nftitem.address) == null || !str3.equals(kocVar2.Q0)) ? false : true;
                gw9 gw9Var = rqaVar2.K;
                gw9Var.a(R.drawable.filled_card_color, k96.M0(z8 ? 2131742859 : 2131742865, null), false);
                gw9Var.setAlpha((F || z8) ? 1.0f : 0.5f);
            }
        }
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) gta.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) tL_starGiftUnique.title);
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) "#".concat(k96.E(tL_starGiftUnique.num, ',')));
        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85f), length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new rk((byte) 2, kk7.T2, false), length, spannableStringBuilder.length(), 33);
        TL_wallet.walletTransaction wallettransaction = this.d3;
        if (wallettransaction == null || dq7.c(wallettransaction) == null) {
            TL_wallet.walletTransaction wallettransaction2 = this.d3;
            if (wallettransaction2 != null) {
                M0 = k96.M0(wallettransaction2.incoming ? 2131742831 : 2131742830, null);
            } else {
                if (tLObject != null) {
                    b = 1;
                    charSequence2 = gl.T2(k96.a0(null, null, 2131743643, cf3.t(tLObject)));
                } else {
                    b = 1;
                    if (tL_starGiftUnique.released_by != null || stargiftattributemodel == null) {
                        charSequence = null;
                        if (tL_textWithEntities != null || textPaint == null) {
                            spannable = null;
                        } else {
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(tL_textWithEntities.text);
                            k27.b(spannableStringBuilder2, tL_textWithEntities.entities, false, false, false, false, 0);
                            spannable = k27.A5(vu3.m(spannableStringBuilder2, textPaint.getFontMetricsInt(), false, null, 0), tL_textWithEntities.entities, textPaint.getFontMetricsInt(), false);
                        }
                        rqaVar2.h(0, spannableStringBuilder, charSequence, h2(tL_starGiftUnique.released_by), null, tLObject, spannable);
                        this.h3 = null;
                        mfb mfbVar = this.d2;
                        mfbVar.removeAllViews();
                        if (z) {
                            b2 = b;
                            str = null;
                            b3 = 0;
                        } else {
                            TLRPC.Peer peer = tL_starGiftUnique.host_id;
                            String str5 = tL_starGiftUnique.owner_address;
                            if (peer != null) {
                                if (TextUtils.isEmpty(str5)) {
                                    str2 = null;
                                    b5 = 0;
                                } else {
                                    final String str6 = tL_starGiftUnique.owner_address;
                                    str2 = null;
                                    b5 = 0;
                                    Y0(mfbVar, k96.M0(2131750166, null), str6, this.J0).setOnClickListener(new View.OnClickListener(this) { // from class: ona
                                        public final /* synthetic */ vqa b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            byte b10 = b5;
                                            String str7 = str6;
                                            vqa vqaVar = this.b;
                                            switch (b10) {
                                                case 0:
                                                    gl.g(str7);
                                                    vqaVar.j().Q(R.raw.copy, 36, k96.M0(2131742959, null)).k(false);
                                                    break;
                                                case 1:
                                                    gl.g(str7);
                                                    vqaVar.j().Q(R.raw.copy, 36, k96.M0(2131742959, null)).k(false);
                                                    break;
                                                default:
                                                    gl.g(str7);
                                                    vqaVar.j().Q(R.raw.copy, 36, k96.M0(2131742959, null)).k(false);
                                                    break;
                                            }
                                        }
                                    });
                                }
                                if (n2 != 0) {
                                    b4 = b5;
                                    this.h3 = ((jfb) this.d2.o(k96.M0(2131750167, str2), this.a, n2, new pna(this, n2, b5)).getChildAt(b)).getChildAt(b4);
                                    b3 = b4;
                                    str = str2;
                                    b2 = b;
                                } else {
                                    r13 = b;
                                    r12 = b5;
                                    i2 = 33;
                                    i = 8;
                                    r10 = str2;
                                    a1(gta.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
                                    a1(gta.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
                                    a1(gta.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
                                    if (!z) {
                                        if (this.C2 == null) {
                                            ?? r113 = r10;
                                            mfbVar.f(k96.M0(2131750038, r113), k96.H(',', "Gift2QuantityIssued1", tL_starGiftUnique.availability_issued).concat(k96.H(',', "Gift2QuantityIssued2", tL_starGiftUnique.availability_total)), r113, r113);
                                        } else if (this.H2) {
                                            ?? r114 = r10;
                                            mfbVar.f(k96.M0(2131750038, r114), k96.H(',', "Gift2QuantityIssued1", tL_starGiftUnique.availability_issued).concat(k96.H(',', "Gift2QuantityIssued2", tL_starGiftUnique.availability_total)), r114, r114);
                                        } else {
                                            TextView textView = (TextView) ((jfb) mfbVar.f(k96.M0(2131750038, r10), "", r10, r10).getChildAt(r13)).getChildAt(r12);
                                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("x ");
                                            u86 u86Var = new u86(textView, gl.L(90.0f), r12, this.J0);
                                            int i7 = bkb.F6;
                                            u86Var.a(bkb.p1(0.21f, bkb.v0(i7, this.J0)), bkb.p1(0.08f, bkb.v0(i7, this.J0)));
                                            spannableStringBuilder3.setSpan(u86Var, r12, r13, i2);
                                            textView.setText(spannableStringBuilder3, TextView.BufferType.SPANNABLE);
                                            if (!this.G2 && !this.H2 && (k27Var = this.C2) != null) {
                                                this.G2 = r13;
                                                int e1 = k27Var.e1();
                                                TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                                                tL_messages_getMessages.id.add(Integer.valueOf(e1));
                                                ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_getMessages, new l12(this, e1, (byte) 5));
                                            }
                                        }
                                        if (!TextUtils.isEmpty(tL_starGiftUnique.slug) && (tL_starGiftUnique.flags & 256) != 0) {
                                            ci0.h();
                                            this.d2.e(k96.M0(2131749416, null), b00.h("~", ci0.f(tL_starGiftUnique.value_currency, ci0.h().g(tL_starGiftUnique.value_currency), tL_starGiftUnique.value_amount, r13)), k96.M0(2131749415, null), new q3a((Object) this, (Object) tL_starGiftUnique, (Object) ci0.h().e(tL_starGiftUnique.value_amount, tL_starGiftUnique.value_currency), (byte) 18), null);
                                        }
                                    }
                                    stargiftattributeoriginaldetails = (TL_stars.starGiftAttributeOriginalDetails) gta.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeOriginalDetails.class);
                                    if (stargiftattributeoriginaldetails != null) {
                                        if ((stargiftattributeoriginaldetails.flags & r13) != 0) {
                                            long n3 = cf3.n(stargiftattributeoriginaldetails.sender_id);
                                            f = 14.0f;
                                            SpannableString spannableString = new SpannableString(cf3.k(y6c.t0, n3));
                                            spannableString.setSpan(new dpa(this, n3), r12, spannableString.length(), i2);
                                            obj = spannableString;
                                        } else {
                                            f = 14.0f;
                                            obj = null;
                                        }
                                        long n4 = cf3.n(stargiftattributeoriginaldetails.recipient_id);
                                        SpannableString spannableString2 = new SpannableString(cf3.k(y6c.t0, n4));
                                        spannableString2.setSpan(new epa(this, n4), r12, spannableString2.length(), i2);
                                        if (stargiftattributeoriginaldetails.message != null) {
                                            TextPaint textPaint2 = new TextPaint((int) r13);
                                            textPaint2.setTextSize(gl.L(f));
                                            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(stargiftattributeoriginaldetails.message.text);
                                            k27.b(spannableStringBuilder4, stargiftattributeoriginaldetails.message.entities, false, false, false, false, 0);
                                            obj2 = k27.A5(vu3.m(spannableStringBuilder4, textPaint2.getFontMetricsInt(), r12, null, r12), stargiftattributeoriginaldetails.message.entities, textPaint2.getFontMetricsInt(), r12);
                                        } else {
                                            obj2 = null;
                                        }
                                        boolean z9 = r13;
                                        Object replaceAll = k96.D0().B0().format(stargiftattributeoriginaldetails.date * 1000).replaceAll("\\.", "/");
                                        if (stargiftattributeoriginaldetails.sender_id != stargiftattributeoriginaldetails.recipient_id) {
                                            if (obj == null) {
                                                i5 = r12;
                                                if (obj2 == null) {
                                                    Object[] objArr = new Object[2];
                                                    objArr[i5] = spannableString2;
                                                    objArr[z9 ? 1 : 0] = replaceAll;
                                                    V = k96.V(null, null, 2131750368, objArr);
                                                } else {
                                                    Object[] objArr2 = new Object[3];
                                                    objArr2[i5] = spannableString2;
                                                    objArr2[z9 ? 1 : 0] = replaceAll;
                                                    objArr2[2] = obj2;
                                                    V = k96.V(null, null, 2131750367, objArr2);
                                                }
                                            } else if (obj2 == null) {
                                                Object[] objArr3 = new Object[3];
                                                objArr3[r12] = obj;
                                                objArr3[z9 ? 1 : 0] = spannableString2;
                                                objArr3[2] = replaceAll;
                                                V = k96.V(null, null, 2131750370, objArr3);
                                            } else {
                                                i5 = r12;
                                                Object[] objArr4 = new Object[4];
                                                objArr4[i5] = obj;
                                                objArr4[z9 ? 1 : 0] = spannableString2;
                                                objArr4[2] = replaceAll;
                                                objArr4[3] = obj2;
                                                V = k96.V(null, null, 2131750369, objArr4);
                                            }
                                            if (F1(this.a, cf3.n(tL_starGiftUnique.owner_id))) {
                                                TL_stars.SavedStarGift savedStarGift = this.A2;
                                                if (savedStarGift == null || savedStarGift.drop_original_details_stars < 0) {
                                                    k27 k27Var2 = this.C2;
                                                    if (k27Var2 != null && (message = k27Var2.k) != null) {
                                                        TLRPC.MessageAction messageAction = message.action;
                                                        if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                                                        }
                                                    }
                                                }
                                                LinearLayout linearLayout = new LinearLayout(getContext());
                                                linearLayout.setPadding(gl.L(12.66f), gl.L(9.33f), gl.L(12.66f), gl.L(9.33f));
                                                linearLayout.setOrientation(i5);
                                                wla wlaVar = new wla(getContext());
                                                zkb.X(wlaVar, bkb.F6, this.J0);
                                                zkb.G(wlaVar, bkb.Wc, this.J0);
                                                wlaVar.setTextSize(z9 ? 1 : 0, 12.0f);
                                                wlaVar.setGravity(3);
                                                wlaVar.setText(V);
                                                linearLayout.addView(wlaVar, nme.p(-1, -2, 1.0f, 19));
                                                ImageView imageView = new ImageView(getContext());
                                                imageView.setScaleType(ImageView.ScaleType.CENTER);
                                                int i8 = bkb.Ei;
                                                ff0 Y = bkb.Y(bkb.p1(0.1f, bkb.v0(i8, this.J0)), 6, 6);
                                                vkb K = zkb.K(0.1f, i8);
                                                wjb wjbVar = this.J0;
                                                imageView.setBackground(Y);
                                                zkb.j(imageView, Y, null, K, wjbVar);
                                                imageView.setImageResource(R.drawable.menu_delete_old);
                                                zkb.s(imageView, i8, this.J0, PorterDuff.Mode.SRC_IN);
                                                ote.a(imageView);
                                                imageView.setOnClickListener(new b99(this, V, (byte) 15));
                                                linearLayout.addView(imageView, nme.q(32, 32, 0.0f, 21, 8, 0, 0, 0));
                                                TableRow tableRow = new TableRow(getContext());
                                                TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
                                                layoutParams.span = 2;
                                                tableRow.addView(new kfb(mfbVar, linearLayout, true), layoutParams);
                                                mfbVar.addView(tableRow);
                                            }
                                            kfb a = mfbVar.a(V);
                                            a.setFilled(z9);
                                            wla wlaVar2 = (wla) a.getChildAt(0);
                                            wlaVar2.setTextSize(z9 ? 1 : 0, 12.0f);
                                            wlaVar2.setGravity(17);
                                        } else if (obj2 == null) {
                                            Object[] objArr5 = new Object[2];
                                            objArr5[r12] = obj;
                                            objArr5[z9 ? 1 : 0] = replaceAll;
                                            V = k96.V(null, null, 2131750366, objArr5);
                                        } else {
                                            Object[] objArr6 = new Object[3];
                                            objArr6[r12] = obj;
                                            objArr6[z9 ? 1 : 0] = replaceAll;
                                            objArr6[2] = obj2;
                                            V = k96.V(null, null, 2131750365, objArr6);
                                        }
                                        i5 = r12;
                                        if (F1(this.a, cf3.n(tL_starGiftUnique.owner_id))) {
                                        }
                                        kfb a2 = mfbVar.a(V);
                                        a2.setFilled(z9);
                                        wla wlaVar22 = (wla) a2.getChildAt(0);
                                        wlaVar22.setTextSize(z9 ? 1 : 0, 12.0f);
                                        wlaVar22.setGravity(17);
                                    } else {
                                        f = 14.0f;
                                    }
                                    if (this.d3 != null) {
                                        this.h3 = null;
                                        mfbVar.removeAllViews();
                                        dq7 c = dq7.c(this.d3);
                                        int i9 = c != null ? 0 : i;
                                        LinearLayout linearLayout2 = this.e3;
                                        linearLayout2.setVisibility(i9);
                                        if (c != null) {
                                            long j = c.e;
                                            int i10 = c.j;
                                            byte b10 = c.a;
                                            long j2 = c.g;
                                            long j3 = c.f;
                                            long abs = Math.abs(j);
                                            rqaVar = rqaVar2;
                                            cls2 = TL_stars.starGiftAttributeBackdrop.class;
                                            SpannableStringBuilder u = c.u(c.s(abs, false), 0.75f);
                                            if (abs != 0) {
                                                cls = TL_stars.starGiftAttributePattern.class;
                                                u.insert(0, (CharSequence) (j > 0 ? "+" : "–"));
                                            } else {
                                                cls = TL_stars.starGiftAttributePattern.class;
                                            }
                                            cls3 = TL_stars.starGiftAttributeModel.class;
                                            u.setSpan(new ForegroundColorSpan(bkb.v0(j > 0 ? bkb.kk : bkb.F6, this.J0)), 0, u.length(), 33);
                                            linearLayout2.setVisibility((abs == 0 || (b10 == 9 || b10 == 4)) ? i : 0);
                                            SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(c.p("GramCapital", u, 2131749344));
                                            int indexOf = TextUtils.indexOf(spannableStringBuilder5, u);
                                            int length2 = u.length() + indexOf;
                                            if (indexOf > 0) {
                                                i3 = 33;
                                                spannableStringBuilder5.setSpan(new RelativeSizeSpan(0.75f), 0, indexOf, 33);
                                            } else {
                                                i3 = 33;
                                            }
                                            if (indexOf >= 0 && length2 < spannableStringBuilder5.length()) {
                                                spannableStringBuilder5.setSpan(new RelativeSizeSpan(0.75f), length2, spannableStringBuilder5.length(), i3);
                                            }
                                            this.f3.setText(spannableStringBuilder5);
                                            this.g3.setText(c.C(this.a).q(abs, false));
                                            boolean z10 = b10 == 0 || b10 == 1 || b10 == 2;
                                            if (b10 == 0 && j3 > 0 && j2 > 0) {
                                                mfbVar.f(k96.M0(2131749533, null), cq7.i(j3), null, null);
                                            } else if (z10 && j3 > 0) {
                                                mfbVar.f(k96.M0(2131749535, null), cq7.i(j3), null, null);
                                            }
                                            if (z10 && j2 > 0) {
                                                CharSequence i11 = cq7.i(j2);
                                                if (j3 > 0) {
                                                    double d = (j2 * 100.0d) / j3;
                                                    SpannableString spannableString3 = new SpannableString(tb4.y("(", b00.j(new StringBuilder(), Math.abs(d - ((double) Math.round(d))) < 0.05d ? String.valueOf(Math.round(d)) : String.format(Locale.US, "%.1f", Double.valueOf(d)), "%"), ")"));
                                                    spannableString3.setSpan(new cm4(bkb.y6, this.J0), 0, spannableString3.length(), 33);
                                                    i11 = TextUtils.concat(i11, " ", spannableString3);
                                                }
                                                mfbVar.f(k96.M0(2131749575, null), i11, null, null);
                                            }
                                            long j4 = this.d3.fee;
                                            if (j4 != 0) {
                                                long abs2 = Math.abs(j4);
                                                StringBuilder sb2 = new StringBuilder("⭐️ ");
                                                BigDecimal movePointLeft = new BigDecimal(abs2).movePointLeft(9);
                                                sb2.append((movePointLeft.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : movePointLeft.stripTrailingZeros()).toPlainString());
                                                SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder(jva.a1(true, sb2.toString(), 0.8f, null));
                                                CharSequence q = c.C(this.a).q(abs2, true);
                                                if (!TextUtils.isEmpty(q)) {
                                                    int length3 = spannableStringBuilder6.length();
                                                    spannableStringBuilder6.append((CharSequence) " ~").append(q);
                                                    spannableStringBuilder6.setSpan(new cm4(bkb.y6, this.J0), length3, spannableStringBuilder6.length(), 33);
                                                }
                                                mfbVar.f(k96.M0(2131749538, null), spannableStringBuilder6, null, null);
                                            }
                                            boolean z11 = b10 == 9;
                                            if ((b10 == 3 || z11) && j3 > 0) {
                                                r112 = 0;
                                                mfbVar.f(k96.M0(z11 ? 2131749537 : 2131749535, null), cq7.i(j3), null, null);
                                            } else {
                                                r112 = 0;
                                            }
                                            if (z11 && c.i > 0) {
                                                mfbVar.f(k96.M0(2131749536, r112), cq7.j(c.i), r112, r112);
                                            }
                                            if (b10 == 5 && i10 > 0) {
                                                mfbVar.f(k96.M0(2131749539, r112), o1(i10), r112, r112);
                                            }
                                            if (b10 == 6 && c.k) {
                                                mfbVar.f(k96.M0(2131749541, r112), cq7.i(c.h), r112, r112);
                                            }
                                            final String str7 = c.l;
                                            if (str7 != null && (i4 = c.m) != 0) {
                                                final byte b11 = 2;
                                                Y0(mfbVar, k96.M0(i4, r112), str7, this.J0).setOnClickListener(new View.OnClickListener(this) { // from class: ona
                                                    public final /* synthetic */ vqa b;

                                                    {
                                                        this.b = this;
                                                    }

                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view) {
                                                        byte b102 = b11;
                                                        String str72 = str7;
                                                        vqa vqaVar = this.b;
                                                        switch (b102) {
                                                            case 0:
                                                                gl.g(str72);
                                                                vqaVar.j().Q(R.raw.copy, 36, k96.M0(2131742959, null)).k(false);
                                                                break;
                                                            case 1:
                                                                gl.g(str72);
                                                                vqaVar.j().Q(R.raw.copy, 36, k96.M0(2131742959, null)).k(false);
                                                                break;
                                                            default:
                                                                gl.g(str72);
                                                                vqaVar.j().Q(R.raw.copy, 36, k96.M0(2131742959, null)).k(false);
                                                                break;
                                                        }
                                                    }
                                                });
                                            }
                                            if (this.d3.date != 0) {
                                                mfbVar.f(k96.M0(2131742901, null), o1(this.d3.date), null, null);
                                            }
                                        } else {
                                            rqaVar = rqaVar2;
                                            cls = TL_stars.starGiftAttributePattern.class;
                                            cls2 = TL_stars.starGiftAttributeBackdrop.class;
                                            cls3 = TL_stars.starGiftAttributeModel.class;
                                            long e = y6c.h(this.a).e();
                                            this.d2.n(k96.M0(this.d3.incoming ? 2131742752 : 2131742777, null), this.a, e, new pna(this, e, (byte) 3));
                                            long abs3 = Math.abs(this.d3.fee);
                                            if (abs3 > 0) {
                                                TextView textView2 = new TextView(getContext());
                                                textView2.setGravity(16);
                                                textView2.setIncludeFontPadding(false);
                                                textView2.setTextSize(1, f);
                                                zkb.X(textView2, bkb.F6, this.J0);
                                                textView2.setText(hmc.o0(this.a, abs3, this.J0));
                                                r11 = 0;
                                                mfbVar.c(textView2, k96.M0(2131742877, null));
                                            } else {
                                                r11 = 0;
                                            }
                                            if (this.d3.date != 0) {
                                                mfbVar.f(k96.M0(2131742901, r11), k96.Q(this.d3.date), r11, r11);
                                            }
                                        }
                                    } else {
                                        rqaVar = rqaVar2;
                                        cls = TL_stars.starGiftAttributePattern.class;
                                        cls2 = TL_stars.starGiftAttributeBackdrop.class;
                                        cls3 = TL_stars.starGiftAttributeModel.class;
                                    }
                                    hqaVar = this.K2;
                                    u41 u41Var = this.f2;
                                    if (hqaVar != null || !hqaVar.o) {
                                        if (this.d3 != null) {
                                            u41Var.setFilled(true);
                                            u41Var.i(k96.M0(2131747638, null), !this.Z2, true);
                                            u41Var.g(null, !this.Z2);
                                            u41Var.setOnClickListener(new roa(this, (byte) 5));
                                        } else {
                                            if (!H1(tL_starGiftUnique) || !h1()) {
                                                tL_starGiftUnique2 = tL_starGiftUnique;
                                                if (!F1(this.a, cf3.n(tL_starGiftUnique2.owner_id)) && tL_starGiftUnique2.resell_amount != null && !D1(this.a, tL_starGiftUnique2)) {
                                                    u41Var.setFilled(true);
                                                    p2(tL_starGiftUnique);
                                                    u41Var.setOnClickListener(new lna(this, (byte) 1));
                                                } else if (!this.m2 || this.U1 == null || this.B2 == null || w1() < 0 || this.B2.b(w1()) < 0) {
                                                    u41Var.setFilled(true);
                                                    u41Var.i(k96.M0(2131747638, null), !this.Z2, true);
                                                    u41Var.g(null, !this.Z2);
                                                    u41Var.setOnClickListener(new lna(this, (byte) 2));
                                                } else {
                                                    u41Var.setFilled(false);
                                                    int b12 = this.B2.b(w1());
                                                    SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder();
                                                    spannableStringBuilder7.append((CharSequence) k96.M0(2131749839, null));
                                                    Object obj3 = this.B2.get(b12);
                                                    if (!(obj3 instanceof TL_stars.SavedStarGift) || (starGift = ((TL_stars.SavedStarGift) obj3).gift) == null || (document = starGift.getDocument()) == null) {
                                                        z2 = true;
                                                    } else {
                                                        spannableStringBuilder7.append((CharSequence) " e");
                                                        z2 = true;
                                                        spannableStringBuilder7.setSpan(new gm(document, u41Var.getTextPaint().getFontMetricsInt()), spannableStringBuilder7.length() - 1, spannableStringBuilder7.length(), 33);
                                                    }
                                                    u41Var.i(spannableStringBuilder7, this.Z2 ^ z2, z2);
                                                    u41Var.g(null, this.Z2 ^ z2);
                                                    u41Var.setOnClickListener(new mna(this, b12, (byte) 0));
                                                }
                                                this.o1.setTitle(this.Q2);
                                                hqaVar2 = this.K2;
                                                if (hqaVar2 == null) {
                                                    boolean z12 = this.L2;
                                                    nna nnaVar = new nna(this, (byte) 0);
                                                    nna nnaVar2 = new nna(this, (byte) 1);
                                                    ArrayList arrayList = hqaVar2.f;
                                                    rqa rqaVar3 = hqaVar2.a;
                                                    TL_stars.TL_starGiftUnique tL_starGiftUnique4 = hqaVar2.l;
                                                    if (tL_starGiftUnique4 != null && tL_starGiftUnique4.id == tL_starGiftUnique2.id) {
                                                        z3 = hqaVar2.o;
                                                    } else if (z12) {
                                                        be0 upgradeImageView = rqaVar3.getUpgradeImageView();
                                                        kqa kqaVar = rqaVar3.c;
                                                        TL_stars.starGiftAttributeModel upgradeImageViewAttribute = rqaVar3.getUpgradeImageViewAttribute();
                                                        TL_stars.starGiftAttributePattern upgradePatternAttribute = rqaVar3.getUpgradePatternAttribute();
                                                        TL_stars.starGiftAttributeBackdrop upgradeBackdropAttribute = rqaVar3.getUpgradeBackdropAttribute();
                                                        TL_stars.starGiftAttributeModel stargiftattributemodel2 = (TL_stars.starGiftAttributeModel) gta.i(tL_starGiftUnique2.attributes, cls3);
                                                        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) gta.i(tL_starGiftUnique2.attributes, cls);
                                                        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) gta.i(tL_starGiftUnique2.attributes, cls2);
                                                        hqaVar2.o = true;
                                                        hqaVar2.l = tL_starGiftUnique2;
                                                        hqaVar2.r = nnaVar;
                                                        hqaVar2.s = nnaVar2;
                                                        hqaVar2.t = (float) Math.random();
                                                        hqaVar2.m = System.currentTimeMillis();
                                                        hqaVar2.n = 0.0f;
                                                        hqaVar2.p = false;
                                                        hqaVar2.q = false;
                                                        hqaVar2.o = true;
                                                        dqa dqaVar = hqaVar2.h;
                                                        if (dqaVar != null) {
                                                            dqaVar.a();
                                                        }
                                                        fqa fqaVar = new fqa(kqaVar, stargiftattributemodel2);
                                                        if (kqaVar.isAttachedToWindow() && fqaVar.c) {
                                                            fqaVar.d.I();
                                                        }
                                                        hqaVar2.h = new dqa(new bqa(hqaVar2, (byte) 0), hqaVar2.e, new fqa(upgradeImageView, upgradeImageViewAttribute), fqaVar, 0.9f, hqaVar2.t > 0.5f ? 3 : 2);
                                                        dqa dqaVar2 = hqaVar2.i;
                                                        if (dqaVar2 != null) {
                                                            dqaVar2.a();
                                                        }
                                                        hqaVar2.i = new dqa(new bqa(hqaVar2, (byte) 0), hqaVar2.g, new gqa(upgradePatternAttribute), new gqa(stargiftattributepattern), 1.0f, hqaVar2.t > 0.5f ? 2 : 1);
                                                        dqa dqaVar3 = hqaVar2.j;
                                                        if (dqaVar3 != null) {
                                                            dqaVar3.a();
                                                        }
                                                        hqaVar2.j = new dqa(new bqa(hqaVar2, (byte) 0), arrayList, new eqa(upgradeBackdropAttribute), new eqa(stargiftattributebackdrop), 0.5f, hqaVar2.t > 0.5f ? 2 : 1);
                                                        dqa dqaVar4 = hqaVar2.k;
                                                        if (dqaVar4 != null) {
                                                            dqaVar4.a();
                                                        }
                                                        hqaVar2.k = new dqa(new bqa(hqaVar2, (byte) 0), arrayList, new eqa(upgradeBackdropAttribute), new eqa(stargiftattributebackdrop), 1.25f, hqaVar2.t > 0.5f ? 2 : 1);
                                                        hqaVar2.b();
                                                        z3 = true;
                                                    } else {
                                                        z3 = false;
                                                    }
                                                    if (z3) {
                                                        rqa rqaVar4 = rqaVar;
                                                        rqaVar4.b.setAlpha(0.0f);
                                                        rqaVar4.c.setAlpha(1.0f);
                                                        u41Var.i(k96.M0(2131749435, null), true, true);
                                                        u41Var.setFilled(true);
                                                        u41Var.setOnClickListener(new lna(this, (byte) 3));
                                                        int length4 = ((vqa) this.O2.d).N2.length - 1;
                                                        o39 o39Var = this.n1;
                                                        o39Var.w0(length4);
                                                        o39Var.post(new nna(this, (byte) 2));
                                                        return;
                                                    }
                                                    return;
                                                }
                                                return;
                                            }
                                            u41Var.setFilled(true);
                                            u41Var.i(k96.M0(2131750416, null), !this.Z2, true);
                                            u41Var.g(null, !this.Z2);
                                            u41Var.setOnClickListener(new lna(this, (byte) 0));
                                        }
                                    }
                                    tL_starGiftUnique2 = tL_starGiftUnique;
                                    this.o1.setTitle(this.Q2);
                                    hqaVar2 = this.K2;
                                    if (hqaVar2 == null) {
                                    }
                                }
                            } else {
                                b4 = 0;
                                str2 = null;
                                if (!TextUtils.isEmpty(str5)) {
                                    final String str8 = tL_starGiftUnique.owner_address;
                                    Y0(mfbVar, k96.M0(2131750070, null), str8, this.J0).setOnClickListener(new View.OnClickListener(this) { // from class: ona
                                        public final /* synthetic */ vqa b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            byte b102 = b;
                                            String str72 = str8;
                                            vqa vqaVar = this.b;
                                            switch (b102) {
                                                case 0:
                                                    gl.g(str72);
                                                    vqaVar.j().Q(R.raw.copy, 36, k96.M0(2131742959, null)).k(false);
                                                    break;
                                                case 1:
                                                    gl.g(str72);
                                                    vqaVar.j().Q(R.raw.copy, 36, k96.M0(2131742959, null)).k(false);
                                                    break;
                                                default:
                                                    gl.g(str72);
                                                    vqaVar.j().Q(R.raw.copy, 36, k96.M0(2131742959, null)).k(false);
                                                    break;
                                            }
                                        }
                                    });
                                } else if (n != 0) {
                                    byte b13 = b;
                                    r10 = 0;
                                    r12 = 0;
                                    i2 = 33;
                                    i = 8;
                                    this.h3 = ((jfb) this.d2.o(k96.M0(2131750070, null), this.a, n, new pna(this, n, b)).getChildAt(b13 == true ? 1 : 0)).getChildAt(0);
                                    r13 = b13;
                                    a1(gta.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
                                    a1(gta.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
                                    a1(gta.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
                                    if (!z) {
                                    }
                                    stargiftattributeoriginaldetails = (TL_stars.starGiftAttributeOriginalDetails) gta.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeOriginalDetails.class);
                                    if (stargiftattributeoriginaldetails != null) {
                                    }
                                    if (this.d3 != null) {
                                    }
                                    hqaVar = this.K2;
                                    u41 u41Var2 = this.f2;
                                    if (hqaVar != null) {
                                    }
                                    if (this.d3 != null) {
                                    }
                                    tL_starGiftUnique2 = tL_starGiftUnique;
                                    this.o1.setTitle(this.Q2);
                                    hqaVar2 = this.K2;
                                    if (hqaVar2 == null) {
                                    }
                                } else if (tL_starGiftUnique.owner_name != null) {
                                    mfbVar.f(k96.M0(2131750070, null), tL_starGiftUnique.owner_name, null, null);
                                }
                                b3 = b4;
                                str = str2;
                                b2 = b;
                            }
                        }
                        i2 = 33;
                        i = 8;
                        r10 = str;
                        r12 = b3;
                        r13 = b2;
                        a1(gta.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
                        a1(gta.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
                        a1(gta.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
                        if (!z) {
                        }
                        stargiftattributeoriginaldetails = (TL_stars.starGiftAttributeOriginalDetails) gta.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeOriginalDetails.class);
                        if (stargiftattributeoriginaldetails != null) {
                        }
                        if (this.d3 != null) {
                        }
                        hqaVar = this.K2;
                        u41 u41Var22 = this.f2;
                        if (hqaVar != null) {
                        }
                        if (this.d3 != null) {
                        }
                        tL_starGiftUnique2 = tL_starGiftUnique;
                        this.o1.setTitle(this.Q2);
                        hqaVar2 = this.K2;
                        if (hqaVar2 == null) {
                        }
                    } else {
                        charSequence2 = stargiftattributemodel.name;
                    }
                }
                charSequence = charSequence2;
                if (tL_textWithEntities != null) {
                }
                spannable = null;
                rqaVar2.h(0, spannableStringBuilder, charSequence, h2(tL_starGiftUnique.released_by), null, tLObject, spannable);
                this.h3 = null;
                mfb mfbVar2 = this.d2;
                mfbVar2.removeAllViews();
                if (z) {
                }
                i2 = 33;
                i = 8;
                r10 = str;
                r12 = b3;
                r13 = b2;
                a1(gta.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
                a1(gta.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
                a1(gta.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
                if (!z) {
                }
                stargiftattributeoriginaldetails = (TL_stars.starGiftAttributeOriginalDetails) gta.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeOriginalDetails.class);
                if (stargiftattributeoriginaldetails != null) {
                }
                if (this.d3 != null) {
                }
                hqaVar = this.K2;
                u41 u41Var222 = this.f2;
                if (hqaVar != null) {
                }
                if (this.d3 != null) {
                }
                tL_starGiftUnique2 = tL_starGiftUnique;
                this.o1.setTitle(this.Q2);
                hqaVar2 = this.K2;
                if (hqaVar2 == null) {
                }
            }
        } else {
            M0 = dq7.c(this.d3).e();
        }
        charSequence = M0;
        b = 1;
        if (tL_textWithEntities != null) {
        }
        spannable = null;
        rqaVar2.h(0, spannableStringBuilder, charSequence, h2(tL_starGiftUnique.released_by), null, tLObject, spannable);
        this.h3 = null;
        mfb mfbVar22 = this.d2;
        mfbVar22.removeAllViews();
        if (z) {
        }
        i2 = 33;
        i = 8;
        r10 = str;
        r12 = b3;
        r13 = b2;
        a1(gta.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
        a1(gta.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
        a1(gta.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
        if (!z) {
        }
        stargiftattributeoriginaldetails = (TL_stars.starGiftAttributeOriginalDetails) gta.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeOriginalDetails.class);
        if (stargiftattributeoriginaldetails != null) {
        }
        if (this.d3 != null) {
        }
        hqaVar = this.K2;
        u41 u41Var2222 = this.f2;
        if (hqaVar != null) {
        }
        if (this.d3 != null) {
        }
        tL_starGiftUnique2 = tL_starGiftUnique;
        this.o1.setTitle(this.Q2);
        hqaVar2 = this.K2;
        if (hqaVar2 == null) {
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        kk7.f(this.a).b(this, kk7.H3);
        kk7.f(this.a).b(this, kk7.c4);
    }

    @Override // fx0, android.app.Dialog
    public final void onBackPressed() {
        rqa rqaVar;
        upa upaVar;
        if (this.W2.c(4) && (rqaVar = this.a2) != null && (upaVar = rqaVar.N) != null) {
            if (upaVar.i0) {
                return;
            }
            if (upaVar.j0) {
                super.onBackPressed();
                return;
            }
        }
        if (this.v2 || this.W2.b <= 0 || this.f2.R || this.l3) {
            super.onBackPressed();
            return;
        }
        k27 k27Var = this.C2;
        if (k27Var != null) {
            l2(k27Var, null);
        } else {
            TL_stars.SavedStarGift savedStarGift = this.A2;
            if (savedStarGift != null) {
                n2(savedStarGift, this.B2);
            } else {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = this.E2;
                if (tL_starGiftUnique != null) {
                    m2(this.D2, tL_starGiftUnique, this.B2);
                }
            }
        }
        z2(0, true, null);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kk7.f(this.a).n(this, kk7.H3);
        kk7.f(this.a).n(this, kk7.c4);
    }

    @Override // fx0
    public final void p0() {
        super.p0();
        try {
            M(bkb.g5);
            rqa rqaVar = this.a2;
            if (rqaVar != null) {
                rqaVar.l();
            }
            cm2 cm2Var = this.Y2;
            if (cm2Var != null) {
                Drawable drawable = cm2Var.c;
                if (drawable instanceof sqa) {
                    ((sqa) drawable).d.setColor(bkb.v0(bkb.Ei, this.J0));
                    u41 u41Var = this.f2;
                    if (u41Var != null) {
                        u41Var.invalidate();
                    }
                }
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public final int p1() {
        if (this.W2.d(1)) {
            return this.n2.getMeasuredHeight();
        }
        if (this.W2.d(2)) {
            return this.w2.getMeasuredHeight();
        }
        if (this.W2.d(3)) {
            return this.y2.getMeasuredHeight();
        }
        if (this.W2.d(4)) {
            return 0;
        }
        return this.b2.getMeasuredHeight();
    }

    public final void p2(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        nj resellAmount = tL_starGiftUnique.getResellAmount(oj.a);
        boolean z = tL_starGiftUnique.resale_ton_only;
        u41 u41Var = this.f2;
        if (z) {
            u41Var.i(jva.s1(jva.U0(k96.a0(null, null, 2131745953, tL_starGiftUnique.getResellAmount(oj.b).d()), true), true), !this.Z2, true);
            u41Var.g(cq7.m(tL_starGiftUnique) ? null : jva.S0(k96.H(',', "ResellGiftBuyEq", (int) resellAmount.a())), !this.Z2);
        } else {
            u41Var.i(jva.S0(k96.H(',', "ResellGiftBuy", (int) resellAmount.a())), !this.Z2, true);
            u41Var.g(null, !this.Z2);
        }
    }

    public final long q1() {
        TLRPC.Peer peer;
        k27 k27Var = this.C2;
        if (k27Var == null) {
            TL_stars.SavedStarGift savedStarGift = this.A2;
            if (savedStarGift != null) {
                TL_stars.StarGift starGift = savedStarGift.gift;
                return starGift instanceof TL_stars.TL_starGiftUnique ? cf3.n(((TL_stars.TL_starGiftUnique) starGift).owner_id) : this.S1;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.E2;
            if (tL_starGiftUnique != null) {
                return cf3.n(tL_starGiftUnique.owner_id);
            }
            return 0L;
        }
        TLRPC.Message message = k27Var.k;
        if (message == null) {
            return 0L;
        }
        TLRPC.MessageAction messageAction = message.action;
        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
            TLRPC.Peer peer2 = ((TLRPC.TL_messageActionStarGift) messageAction).peer;
            return peer2 != null ? cf3.n(peer2) : k27Var.O3() ? k27.B0(this.C2.k) : y6c.h(this.a).e();
        }
        if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
            return 0L;
        }
        TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
        TL_stars.StarGift starGift2 = tL_messageActionStarGiftUnique.gift;
        if ((starGift2 instanceof TL_stars.TL_starGiftUnique) && (peer = starGift2.owner_id) != null) {
            return cf3.n(peer);
        }
        TLRPC.Peer peer3 = tL_messageActionStarGiftUnique.peer;
        if (peer3 != null) {
            return cf3.n(peer3);
        }
        return 0L;
    }

    public final void q2(TL_stars.TL_starGiftUnique tL_starGiftUnique, boolean z) {
        if (z) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_peerUser.user_id = y6c.h(this.a).e();
            tL_starGiftUnique.host_id = tL_peerUser;
            tL_starGiftUnique.flags |= TLObject.FLAG_12;
        } else {
            tL_starGiftUnique.host_id = null;
            tL_starGiftUnique.flags &= -4097;
        }
        this.a2.setWalletDisplayed(z);
        D2();
    }

    public final TL_stars.StarGift r1() {
        k27 k27Var = this.C2;
        if (k27Var != null) {
            TLRPC.Message message = k27Var.k;
            if (message == null) {
                return null;
            }
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                return ((TLRPC.TL_messageActionStarGift) messageAction).gift;
            }
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                return ((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift;
            }
        } else {
            TL_stars.SavedStarGift savedStarGift = this.A2;
            if (savedStarGift != null) {
                return savedStarGift.gift;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.E2;
            if (tL_starGiftUnique != null) {
                return tL_starGiftUnique;
            }
        }
        return null;
    }

    public final void r2(boolean z) {
        int w1 = w1();
        if (w1 >= 0) {
            int i = (z ? 1 : -1) + w1;
            int i2 = this.P2;
            if (i2 >= 0 && (!z ? i2 < w1 : i2 > w1)) {
                i = i2;
            }
            ysa ysaVar = this.B2;
            Object obj = (ysaVar == null || i < 0 || i >= ysaVar.e()) ? null : this.B2.get(i);
            if (obj != null) {
                if ((z ? this.Y1 : this.X1) != null) {
                    if (obj instanceof TL_stars.SavedStarGift) {
                        if (m1((z ? this.Y1 : this.X1).A2, (TL_stars.SavedStarGift) obj)) {
                            return;
                        }
                    }
                    if (obj instanceof TL_stars.TL_starGiftUnique) {
                        if (n1((z ? this.Y1 : this.X1).E2, (TL_stars.TL_starGiftUnique) obj)) {
                            return;
                        }
                    }
                }
                hv4 hv4Var = new hv4(this, getContext(), this.a, this.S1, this.J0, this.T1.getRootView());
                if (obj instanceof TL_stars.SavedStarGift) {
                    hv4Var.n2((TL_stars.SavedStarGift) obj, this.B2);
                } else if (obj instanceof TL_stars.TL_starGiftUnique) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
                    hv4Var.m2(tL_starGiftUnique.slug, tL_starGiftUnique, this.B2);
                }
                gl.B2(hv4Var.b);
                if (z) {
                    this.Y1 = hv4Var;
                } else {
                    this.X1 = hv4Var;
                }
            }
        }
    }

    public final String s1() {
        TL_stars.StarGift r1 = r1();
        if (!(r1 instanceof TL_stars.TL_starGiftUnique)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(((TL_stars.TL_starGiftUnique) r1).title);
        sb.append(" #");
        return ls6.m(r3.num, ',', sb);
    }

    public final void s2() {
        TL_stars.TL_starGiftUnique A1 = A1();
        if (A1 == null) {
            return;
        }
        TLRPC.Peer peer = A1.owner_id;
        if (peer == null) {
            peer = A1.host_id;
        }
        long n = cf3.n(peer);
        StringBuilder sb = new StringBuilder();
        sb.append(A1.title);
        sb.append(" #");
        this.x2.setText(k96.a0(null, null, 2131749817, ls6.m(A1.num, ',', sb)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(k96.M0(2131749819, null));
        if (n == y6c.h(this.a).e() && !y6c.h(this.a).p()) {
            spannableStringBuilder.append((CharSequence) " l");
            cm2 cm2Var = this.S2;
            if (cm2Var == null) {
                cm2Var = new cm2(R.drawable.msg_mini_lock3, 0);
                this.S2 = cm2Var;
            }
            spannableStringBuilder.setSpan(cm2Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        u41 u41Var = this.f2;
        u41Var.i(spannableStringBuilder, true, true);
        u41Var.g(null, true);
        u41Var.setOnClickListener(new roa(this, (byte) 2));
        this.a2.setWearPreview(na7.q1(this.a).Z1(n));
        z2(2, false, null);
        this.v2 = true;
    }

    @Override // fx0, android.app.Dialog
    public final void show() {
        k27 k27Var;
        TLRPC.Message message;
        String str;
        if (na7.q1(this.a).t2()) {
            h5.b(this.a);
            return;
        }
        TL_wallet.nftItem nftitem = this.a3;
        if (nftitem != null && (str = this.D2) != null && this.E2 != null) {
            TL_stars.getUniqueStarGift getuniquestargift = new TL_stars.getUniqueStarGift();
            getuniquestargift.slug = str;
            ConnectionsManager.getInstance(this.a).sendRequest(getuniquestargift, new ck8((Object) this, (Object) nftitem, (Object) str, (byte) 16));
        }
        if (this.D2 != null && this.E2 == null) {
            hd hdVar = new hd(3, null, getContext());
            hdVar.q(500L);
            TL_stars.getUniqueStarGift getuniquestargift2 = new TL_stars.getUniqueStarGift();
            getuniquestargift2.slug = this.D2;
            ConnectionsManager.getInstance(this.a).sendRequest(getuniquestargift2, new hj7(this, hdVar, (byte) 27));
        } else if (this.A2 == null && (k27Var = this.C2) != null && (message = k27Var.k) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                if (tL_messageActionStarGift.upgraded) {
                    if (tL_messageActionStarGift.upgrade_msg_id != 0) {
                        hd hdVar2 = new hd(3, null, getContext());
                        hdVar2.q(500L);
                        TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                        tL_messages_getMessages.id.add(Integer.valueOf(tL_messageActionStarGift.upgrade_msg_id));
                        ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_getMessages, new ck8((Object) this, (Object) tL_messageActionStarGift, hdVar2, (byte) 14));
                        return;
                    }
                    if (u1() != null) {
                        hd hdVar3 = new hd(3, null, getContext());
                        hdVar3.q(500L);
                        gta.v(this.a, false).J(u1(), new nu9(this, hdVar3, (byte) 6));
                        return;
                    }
                }
            }
        }
        super.show();
    }

    public final void t2(CharSequence charSequence) {
        TL_stars.TL_starGiftUnique A1 = A1();
        TL_stars.InputSavedStarGift u1 = u1();
        if (u1 == null || A1 == null) {
            return;
        }
        TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails = new TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails();
        tL_inputInvoiceStarGiftDropOriginalDetails.stargift = u1;
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftDropOriginalDetails;
        JSONObject u = ow0.u(this.J0, false);
        if (u != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = u.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getPaymentForm, new rt0((Object) this, (Object) charSequence, (Object) A1, (Object) tL_inputInvoiceStarGiftDropOriginalDetails, (byte) 20));
    }

    public final TL_stars.InputSavedStarGift u1() {
        TLRPC.Message message;
        TLRPC.Message message2;
        TLRPC.Message message3;
        long j = this.S1;
        if (j < 0) {
            TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = new TL_stars.TL_inputSavedStarGiftChat();
            tL_inputSavedStarGiftChat.peer = na7.q1(this.a).h1(j);
            k27 k27Var = this.C2;
            if (k27Var == null || (message3 = k27Var.k) == null) {
                TL_stars.SavedStarGift savedStarGift = this.A2;
                if (savedStarGift != null) {
                    if ((savedStarGift.flags & 2048) == 0) {
                        return null;
                    }
                    tL_inputSavedStarGiftChat.saved_id = savedStarGift.saved_id;
                    return tL_inputSavedStarGiftChat;
                }
                if (this.E2 == null || TextUtils.isEmpty(this.D2)) {
                    return tL_inputSavedStarGiftChat;
                }
                TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug = new TL_stars.TL_inputSavedStarGiftSlug();
                tL_inputSavedStarGiftSlug.slug = this.D2;
                return tL_inputSavedStarGiftSlug;
            }
            TLRPC.MessageAction messageAction = message3.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                if ((tL_messageActionStarGift.flags & TLObject.FLAG_12) == 0) {
                    return null;
                }
                tL_inputSavedStarGiftChat.saved_id = tL_messageActionStarGift.saved_id;
                return tL_inputSavedStarGiftChat;
            }
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                return null;
            }
            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
            if ((tL_messageActionStarGiftUnique.flags & 128) == 0) {
                return null;
            }
            tL_inputSavedStarGiftChat.saved_id = tL_messageActionStarGiftUnique.saved_id;
            return tL_inputSavedStarGiftChat;
        }
        k27 k27Var2 = this.C2;
        if (k27Var2 != null && (message2 = k27Var2.k) != null) {
            TLRPC.MessageAction messageAction2 = message2.action;
            if ((messageAction2 instanceof TLRPC.TL_messageActionStarGift) && (messageAction2.flags & TLObject.FLAG_12) != 0) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift2 = (TLRPC.TL_messageActionStarGift) messageAction2;
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat2 = new TL_stars.TL_inputSavedStarGiftChat();
                na7 q1 = na7.q1(this.a);
                TLRPC.Peer peer = tL_messageActionStarGift2.peer;
                tL_inputSavedStarGiftChat2.peer = q1.h1(peer != null ? cf3.n(peer) : k27.B0(this.C2.k));
                tL_inputSavedStarGiftChat2.saved_id = tL_messageActionStarGift2.saved_id;
                return tL_inputSavedStarGiftChat2;
            }
        }
        if (k27Var2 != null && (message = k27Var2.k) != null) {
            TLRPC.MessageAction messageAction3 = message.action;
            if ((messageAction3 instanceof TLRPC.TL_messageActionStarGiftUnique) && (messageAction3.flags & 128) != 0) {
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique2 = (TLRPC.TL_messageActionStarGiftUnique) messageAction3;
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat3 = new TL_stars.TL_inputSavedStarGiftChat();
                na7 q12 = na7.q1(this.a);
                TLRPC.Peer peer2 = tL_messageActionStarGiftUnique2.peer;
                tL_inputSavedStarGiftChat3.peer = q12.h1(peer2 != null ? cf3.n(peer2) : k27.B0(this.C2.k));
                tL_inputSavedStarGiftChat3.saved_id = tL_messageActionStarGiftUnique2.saved_id;
                return tL_inputSavedStarGiftChat3;
            }
        }
        TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
        k27 k27Var3 = this.C2;
        if (k27Var3 != null) {
            TLRPC.Message message4 = k27Var3.k;
            if (message4 != null) {
                TLRPC.MessageAction messageAction4 = message4.action;
                if ((messageAction4 instanceof TLRPC.TL_messageActionStarGift) && (messageAction4.flags & 32768) != 0) {
                    tL_inputSavedStarGiftUser.msg_id = ((TLRPC.TL_messageActionStarGift) messageAction4).gift_msg_id;
                    return tL_inputSavedStarGiftUser;
                }
            }
            tL_inputSavedStarGiftUser.msg_id = k27Var3.e1();
            return tL_inputSavedStarGiftUser;
        }
        TL_stars.SavedStarGift savedStarGift2 = this.A2;
        if (savedStarGift2 != null) {
            tL_inputSavedStarGiftUser.msg_id = savedStarGift2.msg_id;
            return tL_inputSavedStarGiftUser;
        }
        if (this.E2 == null || TextUtils.isEmpty(this.D2)) {
            return tL_inputSavedStarGiftUser;
        }
        TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug2 = new TL_stars.TL_inputSavedStarGiftSlug();
        tL_inputSavedStarGiftSlug2.slug = this.D2;
        return tL_inputSavedStarGiftSlug2;
    }

    public final void u2(View view, CharSequence charSequence, boolean z) {
        Layout layout;
        float primaryHorizontal;
        je5 je5Var = this.w3;
        if ((je5Var != null && je5Var.W && this.x3 == view) || view == null) {
            return;
        }
        if (!z) {
            if (view instanceof TextView) {
                layout = ((TextView) view).getLayout();
            } else if (!(view instanceof jia)) {
                return;
            } else {
                layout = ((jia) view).getLayout();
            }
            if (layout == null) {
                return;
            }
            CharSequence text = layout.getText();
            if (!(text instanceof Spanned)) {
                return;
            }
            Spanned spanned = (Spanned) text;
            r41[] r41VarArr = (r41[]) spanned.getSpans(0, spanned.length(), r41.class);
            if (r41VarArr == null || r41VarArr.length <= 0) {
                return;
            }
            primaryHorizontal = layout.getPrimaryHorizontal(spanned.getSpanStart(r41VarArr[r41VarArr.length - 1])) + view.getPaddingLeft() + (r5.a() / 2.0f);
        } else {
            if (!(view instanceof jia)) {
                return;
            }
            jia jiaVar = (jia) view;
            primaryHorizontal = (jiaVar.getRightDrawableWidth() / 2.0f) + jiaVar.getRightDrawableX();
        }
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr);
        jo0 jo0Var = this.T1;
        jo0Var.getLocationOnScreen(iArr2);
        iArr[0] = iArr[0] - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        je5 je5Var2 = this.w3;
        if (je5Var2 != null) {
            je5Var2.f(true);
            this.w3 = null;
        }
        je5 je5Var3 = new je5(getContext(), 3);
        je5Var3.p(!z);
        je5Var3.t(charSequence);
        je5Var3.o(0.0f, (iArr[0] + primaryHorizontal) - (gl.L(16.0f) + this.u0));
        je5Var3.setTranslationY(((iArr[1] - gl.L(100.0f)) - (view.getHeight() / 2.0f)) + gl.L((z ? 18 : 0) + 4.33f));
        je5Var3.d = 3000L;
        je5Var3.setPadding(gl.L(16.0f) + this.u0, 0, gl.L(16.0f) + this.u0, 0);
        je5Var3.r0 = new hh(je5Var3, (byte) 8);
        je5Var3.v();
        jo0Var.addView(je5Var3, nme.c(100.0f, -1));
        this.w3 = je5Var3;
        this.x3 = view;
    }

    public final String v1() {
        TL_stars.StarGift r1 = r1();
        if (!(r1 instanceof TL_stars.TL_starGiftUnique) || r1.slug == null) {
            return null;
        }
        return na7.q1(this.a).N2 + "/nft/" + r1.slug;
    }

    public final void v2(int i, Context context, boolean z) {
        LinearLayout j = de9.j(context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        int L = gl.L(64.0f);
        int i2 = bkb.Ei;
        ShapeDrawable K = bkb.K(L, bkb.v0(i2, this.J0));
        vkb M = zkb.M(i2);
        wjb wjbVar = this.J0;
        frameLayout.setBackground(K);
        zkb.j(frameLayout, K, M, null, wjbVar);
        j.addView(frameLayout, nme.t(64, 64, 49, 0, 6, 0, 0));
        ry8 ry8Var = new ry8(context);
        ry8Var.setScaleType(ImageView.ScaleType.CENTER);
        ry8Var.f(R.raw.timer_3, 42, 42, null);
        frameLayout.addView(ry8Var, nme.r(64, 64, 17));
        ry8Var.d();
        TextView b = hve.b(context, 20.0f, bkb.F6, true, null);
        b.setGravity(17);
        b.setText(k96.M0(z ? 2131749989 : 2131749895, null));
        j.addView(b, nme.t(-1, -2, 48, 24, 14, 24, 0));
        TextView b2 = hve.b(context, 14.0f, bkb.E6, false, null);
        b2.setGravity(17);
        b2.setText(k96.a0(null, null, z ? 2131749990 : 2131749896, k96.c0(Math.max(10, i))));
        j.addView(b2, nme.t(-1, -2, 48, 24, 6, 24, 6));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.J0, context);
        alertDialog$Builder.n(j);
        alertDialog$Builder.j(k96.M0(2131747638, null), null);
        alertDialog$Builder.o();
    }

    public final int w1() {
        int indexOf;
        ysa ysaVar = this.B2;
        if (ysaVar == null) {
            return -1;
        }
        TL_stars.SavedStarGift savedStarGift = this.A2;
        if (savedStarGift != null) {
            indexOf = ysaVar.indexOf(savedStarGift);
        } else {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.E2;
            if (tL_starGiftUnique == null) {
                return -1;
            }
            indexOf = ysaVar.indexOf(tL_starGiftUnique);
        }
        if (indexOf >= 0) {
            return indexOf;
        }
        TL_stars.StarGift r1 = r1();
        for (int i = 0; i < this.B2.e(); i++) {
            Object obj = this.B2.get(i);
            if (obj instanceof TL_stars.SavedStarGift) {
                TL_stars.SavedStarGift savedStarGift2 = this.A2;
                if (savedStarGift2 != null) {
                    if (m1(savedStarGift2, (TL_stars.SavedStarGift) obj)) {
                        return i;
                    }
                }
                if (r1 != null) {
                    TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) obj).gift;
                    if (r1 != starGift) {
                        if ((r1 instanceof TL_stars.TL_starGiftUnique) && (starGift instanceof TL_stars.TL_starGiftUnique) && r1.id == starGift.id) {
                        }
                    }
                    return i;
                }
                continue;
            } else {
                if ((obj instanceof TL_stars.TL_starGiftUnique) && n1(this.E2, (TL_stars.TL_starGiftUnique) obj)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public final boolean w2() {
        if (!cq7.m(A1())) {
            return false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.J0, getContext());
        String M0 = k96.M0(2131749902, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        hdVar.U = k96.M0(2131749515, null);
        if (h1()) {
            alertDialog$Builder.j(k96.M0(2131750416, null), new yna(this, (byte) 2));
            alertDialog$Builder.g(k96.M0(2131752577, null), null);
        } else {
            alertDialog$Builder.j(k96.M0(2131747638, null), null);
        }
        alertDialog$Builder.o();
        return true;
    }

    @Override // fx0
    public final void x0(int i) {
        super.x0(i);
        gl.p3(this, 0, false, null);
    }

    public final TL_stars.SavedStarGift x1(boolean z) {
        int w1 = w1();
        if (w1 >= 0) {
            int i = (z ? 1 : -1) + w1;
            int i2 = this.P2;
            if (i2 >= 0 && (!z ? i2 < w1 : i2 > w1)) {
                i = i2;
            }
            ysa ysaVar = this.B2;
            Object obj = (ysaVar == null || i < 0 || i >= ysaVar.e()) ? null : this.B2.get(i);
            if (obj instanceof TL_stars.SavedStarGift) {
                return (TL_stars.SavedStarGift) obj;
            }
        }
        return null;
    }

    public final boolean x2(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        if (!ug8.A(tL_starGiftUnique) || TextUtils.isEmpty(tL_starGiftUnique.gift_address) || TextUtils.isEmpty(tL_starGiftUnique.owner_address) || cq7.m(tL_starGiftUnique)) {
            return false;
        }
        c C = c.C(this.a);
        return c.b(tL_starGiftUnique.owner_address, C.x()) || C.A().c(tL_starGiftUnique.gift_address);
    }

    public final TL_stars.TL_starGiftUnique y1(boolean z) {
        int w1 = w1();
        if (w1 >= 0) {
            int i = (z ? 1 : -1) + w1;
            int i2 = this.P2;
            if (i2 >= 0 && (!z ? i2 < w1 : i2 > w1)) {
                i = i2;
            }
            ysa ysaVar = this.B2;
            Object obj = (ysaVar == null || i < 0 || i >= ysaVar.e()) ? null : this.B2.get(i);
            if (obj instanceof TL_stars.TL_starGiftUnique) {
                return (TL_stars.TL_starGiftUnique) obj;
            }
        }
        return null;
    }

    public final void y2(boolean z, hd hdVar, c01 c01Var, Runnable runnable) {
        c01Var.d();
        y6c h = y6c.h(this.a);
        TL_account.tmpPassword tmppassword = h.y;
        if (tmppassword != null && tmppassword.valid_until < ConnectionsManager.getInstance(this.a).getCurrentTime() + 60) {
            h.y = null;
            h.u(false);
        }
        TL_account.tmpPassword tmppassword2 = h.y;
        if (tmppassword2 == null) {
            Z1(z, c01Var, runnable);
        } else {
            C1(tmppassword2.tmp_password, null, z, new m25(this, z, c01Var, runnable, hdVar));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z2(int i, boolean z, k08 k08Var) {
        int i2;
        je5 je5Var;
        hqa hqaVar;
        ValueAnimator valueAnimator = this.X2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.X2 = null;
        }
        rqa rqaVar = this.a2;
        byte b = 1;
        if (i != 1) {
            gl.r(rqaVar.p0);
        }
        if (!this.Z2) {
            this.V2 = Float.valueOf(this.T1.f());
        }
        xpa xpaVar = this.W2;
        this.W2 = new xpa(xpaVar == null ? (byte) 0 : xpaVar.b, i);
        gx0 gx0Var = this.O2;
        int finalHeight = rqaVar.getFinalHeight();
        int p1 = p1();
        if (this.W2.d(1)) {
            FrameLayout frameLayout = this.i2;
            if (frameLayout.getVisibility() == 0) {
                i2 = frameLayout.getMeasuredHeight();
                gx0Var.H(finalHeight, p1 + i2);
                if (this.W2.b == 0 && (hqaVar = this.K2) != null) {
                    hqaVar.c();
                }
                xpa xpaVar2 = this.W2;
                gpa gpaVar = this.y2;
                gpa gpaVar2 = this.w2;
                gpa gpaVar3 = this.n2;
                gpa gpaVar4 = this.b2;
                if (z) {
                    xpaVar2.c = 1.0f;
                    O1();
                    gpaVar4.setVisibility(i == 0 ? 0 : 8);
                    gpaVar3.setVisibility(i == 1 ? 0 : 8);
                    gpaVar2.setVisibility(i == 2 ? 0 : 8);
                    gpaVar.setVisibility(i != 3 ? 8 : 0);
                    B2();
                    if (k08Var != null) {
                        k08Var.run();
                    }
                } else {
                    gpaVar4.setVisibility(xpaVar2.b(0) ? 0 : 8);
                    gpaVar3.setVisibility(this.W2.b(1) ? 0 : 8);
                    gpaVar2.setVisibility(this.W2.b(2) ? 0 : 8);
                    gpaVar.setVisibility(this.W2.b(3) ? 0 : 8);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.X2 = ofFloat;
                    ofFloat.addUpdateListener(new gja(this, b));
                    this.X2.addListener(new zoa(this, i, k08Var));
                    this.X2.setInterpolator(s33.h);
                    this.X2.setDuration(320L);
                    this.X2.start();
                    xpa xpaVar3 = this.W2;
                    be0[] be0VarArr = rqaVar.d;
                    byte b2 = xpaVar3.a;
                    byte b3 = xpaVar3.b;
                    if (b2 != b3) {
                        oy8 y = be0VarArr[b2].getImageReceiver().y();
                        oy8 y2 = be0VarArr[b3].getImageReceiver().y();
                        if (y2 != null && y != null) {
                            y2.O(false, y.o());
                        }
                    }
                }
                je5Var = this.w3;
                if (je5Var == null) {
                    je5Var.f(true);
                    this.w3 = null;
                    return;
                }
                return;
            }
        }
        i2 = 0;
        gx0Var.H(finalHeight, p1 + i2);
        if (this.W2.b == 0) {
            hqaVar.c();
        }
        xpa xpaVar22 = this.W2;
        gpa gpaVar5 = this.y2;
        gpa gpaVar22 = this.w2;
        gpa gpaVar32 = this.n2;
        gpa gpaVar42 = this.b2;
        if (z) {
        }
        je5Var = this.w3;
        if (je5Var == null) {
        }
    }
}
