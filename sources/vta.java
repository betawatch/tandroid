// default package

import android.animation.LayoutTransition;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.opengl.Matrix;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Map;
import j$.util.Map$Entry$-CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class vta extends FrameLayout {
    public final lta[] E;
    public final gm F;
    public final mta G;
    public final LinearLayout H;
    public final in I;
    public final in J;
    public final e29 K;
    public final TextView L;
    public final TextView M;
    public final TextView N;
    public final LinearLayout O;
    public sx4[] P;
    public final FrameLayout Q;
    public final FrameLayout R;
    public final FrameLayout S;
    public final FrameLayout T;
    public kg5 U;
    public final int[] V;
    public final int[] W;
    public final vnb a;
    public int a0;
    public final uta b;
    public long b0;
    public final ImageView c;
    public TLRPC.Document c0;
    public final iy9[] d;
    public String d0;
    public final iy9 e;
    public ArrayList e0;
    public final rta f;
    public kcc f0;
    public icc g0;
    public final pta h;
    public Runnable h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public Runnable l0;
    public e29 m0;
    public final tta[] n;
    public SpannableStringBuilder n0;
    public final tpa r;
    public boolean s;
    public final LinearLayout w;
    public final LinearLayout x;
    public final lta[] y;

    public vta(Context context, vnb vnbVar) {
        super(context);
        iy9[] iy9VarArr;
        int i = 6;
        this.V = new int[]{-14861233, -15787732, -11327734, -14742773, -14527649, -15920861};
        this.W = new int[]{aob.p1(0.08f, -1), aob.p1(0.08f, -1), -294362, -3914963, -13519030, -12613223};
        this.a = vnbVar;
        uta utaVar = new uta();
        this.b = utaVar;
        Drawable e = c00.e(context, R.drawable.filled_forge);
        e.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN));
        utaVar.g = e;
        setBackground(utaVar);
        FrameLayout frameLayout = new FrameLayout(context);
        this.Q = frameLayout;
        addView(frameLayout, tre.e(-1, 60, 55));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setImageResource(R.drawable.outline_question_mark);
        imageView.setBackground(new jua(hl.L(24.0f), aob.p1(0.08f, -1)));
        frameLayout.addView(imageView, tre.d(32, 32.0f, 51, 14.0f, 14.0f, 14.0f, 14.0f));
        imageView.setOnClickListener(new jta(this, (byte) 0));
        iye.a(imageView);
        ImageView k = qd4.k(context, R.drawable.msg_close);
        k.setBackground(new jua(hl.L(24.0f), aob.p1(0.08f, -1)));
        frameLayout.addView(k, tre.d(32, 32.0f, 53, 14.0f, 14.0f, 14.0f, 14.0f));
        byte b = 1;
        k.setOnClickListener(new jta(this, b));
        iye.a(k);
        TextView textView = new TextView(context);
        textView.setTypeface(hl.o());
        textView.setGravity(17);
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(-1);
        textView.setText(ob6.M0(2131749704, null));
        addView(textView, tre.d(-1, -2.0f, 49, 0.0f, 20.0f, 0.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.R = frameLayout2;
        addView(frameLayout2, tre.e(-1, -1, jn7.D1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.S = frameLayout3;
        frameLayout3.setAlpha(0.0f);
        addView(frameLayout3, tre.e(-1, -1, jn7.D1));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.T = frameLayout4;
        frameLayout4.setAlpha(0.0f);
        addView(frameLayout4, tre.e(-1, -1, jn7.D1));
        tpa tpaVar = new tpa(context);
        this.r = tpaVar;
        tpaVar.setGravity(17);
        tpaVar.setTextSize(1, 13.0f);
        tpaVar.setTextColor(-1);
        frameLayout2.addView(tpaVar, tre.d(-1, -2.0f, 49, 32.0f, 244.0f, 32.0f, 84.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.w = linearLayout;
        LayoutTransition layoutTransition = new LayoutTransition();
        byte b2 = 2;
        layoutTransition.setDuration(2, 320L);
        byte b3 = 3;
        layoutTransition.setDuration(3, 320L);
        layoutTransition.setDuration(0, 320L);
        layoutTransition.setDuration(1, 320L);
        layoutTransition.setDuration(4, 320L);
        k43 k43Var = k43.h;
        layoutTransition.setInterpolator(2, k43Var);
        layoutTransition.setInterpolator(3, k43Var);
        layoutTransition.setInterpolator(0, k43Var);
        layoutTransition.setInterpolator(1, k43Var);
        layoutTransition.setInterpolator(4, k43Var);
        linearLayout.setLayoutTransition(layoutTransition);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.x = linearLayout2;
        LayoutTransition layoutTransition2 = new LayoutTransition();
        layoutTransition2.setDuration(2, 320L);
        layoutTransition2.setDuration(3, 320L);
        layoutTransition2.setDuration(0, 320L);
        layoutTransition2.setDuration(1, 320L);
        layoutTransition2.setDuration(4, 320L);
        layoutTransition2.setInterpolator(2, k43Var);
        layoutTransition2.setInterpolator(3, k43Var);
        layoutTransition2.setInterpolator(0, k43Var);
        layoutTransition2.setInterpolator(1, k43Var);
        layoutTransition2.setInterpolator(4, k43Var);
        linearLayout2.setLayoutTransition(layoutTransition2);
        linearLayout2.setOrientation(0);
        linearLayout2.setAlpha(0.0f);
        linearLayout2.setGravity(17);
        this.y = new lta[4];
        this.E = new lta[4];
        for (int i2 = 0; i2 < 4; i2++) {
            LinearLayout linearLayout3 = this.w;
            lta[] ltaVarArr = this.y;
            lta ltaVar = new lta(context);
            ltaVarArr[i2] = ltaVar;
            linearLayout3.addView(ltaVar, tre.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            this.y[i2].setOnClickListener(new jta(this, b2));
        }
        for (int i3 = 0; i3 < 4; i3++) {
            LinearLayout linearLayout4 = this.w;
            lta[] ltaVarArr2 = this.E;
            lta ltaVar2 = new lta(context);
            ltaVarArr2[i3] = ltaVar2;
            linearLayout4.addView(ltaVar2, tre.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            this.E[i3].setOnClickListener(new jta(this, b3));
        }
        this.n = new tta[4];
        this.d = new iy9[6];
        int i4 = 0;
        while (true) {
            iy9VarArr = this.d;
            if (i4 >= i) {
                break;
            }
            byte b4 = i4 == 5 ? b : (byte) 0;
            iy9 iy9Var = new iy9(context, b2);
            FrameLayout frameLayout5 = new FrameLayout(context);
            frameLayout5.setBackground(new jua(hl.L(24.0f), aob.p1(0.08f, -1)));
            iy9Var.addView(frameLayout5, tre.d(-1, -1.0f, jn7.D1, 2.0f, 2.0f, 2.0f, 2.0f));
            de0 de0Var = new de0(context);
            de0Var.setImageResource(R.drawable.large_forge);
            de0Var.setAlpha(b4 != 0 ? 1.0f : 0.45f);
            int i5 = b4 != 0 ? 42 : 64;
            frameLayout5.addView(de0Var, tre.e(i5, i5, 17));
            if (b4 != 0) {
                de0Var.setTranslationX(hl.L(-4.0f));
                qta qtaVar = new qta(context);
                iy9Var.c = qtaVar;
                qtaVar.e = hl.L(37.0f);
                qtaVar.a.setStrokeWidth(hl.N(4.66f));
                frameLayout5.addView(qtaVar, tre.e(90, 90, 17));
                in inVar = new in(context, false, false, false);
                iy9Var.b = inVar;
                inVar.getDrawable().r(false, true);
                inVar.setTypeface(hl.o());
                inVar.setTextColor(-1);
                inVar.setTextSize(hl.L(14.0f));
                inVar.setGravity(17);
                inVar.setText("0%");
                frameLayout5.addView(inVar, tre.d(-1, 16.0f, 55, 12.0f, 80.0f, 12.0f, 0.0f));
            }
            iy9VarArr[i4] = iy9Var;
            i4++;
            i = 6;
            b = 1;
            b2 = 2;
        }
        this.e = iy9VarArr[5];
        rta rtaVar = new rta(context);
        this.f = rtaVar;
        rtaVar.setVisibility(8);
        rtaVar.setAlpha(0.0f);
        addView(rtaVar, tre.d(jn7.W4, 300.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        pta ptaVar = new pta(context, this.d);
        this.h = ptaVar;
        addView(ptaVar, tre.d(-1, 300.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        gm gmVar = new gm(context);
        this.F = gmVar;
        gmVar.setTextSize(1, 12.0f);
        gmVar.setTypeface(hl.o());
        gmVar.setText(hl.E2(ob6.M0(2131749700, null), false, hl.L(1.0f), hl.L(1.0f)));
        gmVar.setPadding(hl.L(9.0f), 0, hl.L(9.0f), 0);
        gmVar.setGravity(17);
        gmVar.setTextColor(-1);
        gmVar.setAlpha(this.e0 != null ? 1.0f : 0.25f);
        gmVar.setBackground(new jua(hl.L(14.0f), aob.p1(0.08f, -1)));
        iye.b(gmVar, 0.02f, 1.2f);
        this.R.addView(gmVar, tre.d(-2, 27.0f, 49, 32.0f, 412.0f, 32.0f, 84.0f));
        gmVar.setOnClickListener(new jy8(this, vnbVar, (byte) 19));
        this.R.addView(this.w, tre.d(-2, 54.0f, 49, 32.0f, 340.0f, 32.0f, 84.0f));
        this.R.addView(this.x, tre.d(-2, 54.0f, 49, 32.0f, 394.0f, 32.0f, 84.0f));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.H = linearLayout5;
        linearLayout5.setOrientation(1);
        mta mtaVar = new mta();
        this.G = mtaVar;
        linearLayout5.setBackground(mtaVar);
        mtaVar.a(aob.p1(0.08f, -1), aob.p1(0.08f, -1));
        iye.b(linearLayout5, 0.02f, 1.2f);
        addView(linearLayout5, tre.d(-1, -2.0f, 87, 20.0f, 0.0f, 20.0f, 18.0f));
        linearLayout5.setOnClickListener(new jta(this, (byte) 4));
        in inVar2 = new in(context, false, false, false);
        this.I = inVar2;
        inVar2.setTypeface(hl.o());
        inVar2.setGravity(17);
        inVar2.setTextColor(aob.p1(0.75f, -1));
        inVar2.setText(ob6.M0(2131749743, null));
        inVar2.setTextSize(hl.L(14.0f));
        linearLayout5.addView(inVar2, tre.s(-1, 18, 55, 16.0f, 7.33f, 16.0f, 0.0f));
        in inVar3 = new in(context, false, false, false);
        this.J = inVar3;
        inVar3.getDrawable().r(true, false);
        inVar3.setGravity(17);
        inVar3.setTextColor(aob.p1(0.75f, -1));
        inVar3.setText(hl.S2(ob6.a0(null, null, 2131749712, "0%")));
        inVar3.setTextSize(hl.L(12.0f));
        linearLayout5.addView(inVar3, tre.s(-1, 14, 55, 16.0f, 2.66f, 16.0f, 7.66f));
        LinearLayout linearLayout6 = new LinearLayout(context);
        linearLayout6.setOrientation(0);
        linearLayout6.setGravity(17);
        e29 e29Var = new e29(context);
        this.K = e29Var;
        e29Var.setAutoRepeat(true);
        e29Var.f(R.raw.gift_crafting, 30, 30, null);
        linearLayout6.addView(e29Var, tre.t(30, 30, 17, 0, 0, 4, 0));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 20.0f);
        textView2.setTextColor(-1);
        textView2.setTypeface(hl.o());
        textView2.setGravity(17);
        textView2.setText(ob6.M0(2131749720, null));
        linearLayout6.addView(textView2, tre.t(-2, -2, 17, 0, 0, 0, 0));
        this.S.addView(linearLayout6, tre.d(-1, -2.0f, 49, 0.0f, 350.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.L = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(aob.p1(0.5f, -1));
        textView3.setTypeface(hl.o());
        textView3.setGravity(17);
        TextView l = ik8.l(this.S, textView3, tre.d(-1, -2.0f, 49, 0.0f, 383.0f, 0.0f, 0.0f), context);
        this.M = l;
        l.setTextSize(1, 13.0f);
        l.setTextColor(-1);
        l.setTypeface(hl.o());
        l.setGravity(17);
        l.setPadding(hl.L(9.0f), 0, hl.L(9.0f), 0);
        l.setBackground(new jua(hl.L(14.0f), aob.p1(0.08f, -1)));
        TextView l2 = ik8.l(this.S, l, tre.d(-2, 27.0f, 81, 0.0f, 0.0f, 0.0f, 74.0f), context);
        l2.setTextSize(1, 13.0f);
        l2.setTextColor(aob.p1(0.5f, -1));
        uh9.q(l2, 17, null, 2131749721);
        TextView l3 = ik8.l(this.S, l2, tre.d(-1, -2.0f, 81, 42.0f, 0.0f, 42.0f, 24.0f), context);
        l3.setText(ob6.M0(2131749734, null));
        l3.setTextColor(-505270);
        l3.setTextSize(1, 20.0f);
        l3.setTypeface(hl.o());
        l3.setGravity(17);
        TextView l4 = ik8.l(this.T, l3, tre.d(-1, -2.0f, 55, 32.0f, 352.0f, 32.0f, 0.0f), context);
        this.N = l4;
        l4.setTextColor(-17253);
        l4.setTextSize(1, 13.0f);
        l4.setGravity(17);
        this.T.addView(l4, tre.d(-1, -2.0f, 55, 32.0f, 383.0f, 32.0f, 0.0f));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.O = linearLayout7;
        linearLayout7.setOrientation(0);
        this.T.addView(linearLayout7, tre.d(-2, -2.0f, 49, 0.0f, 250.0f, 0.0f, 0.0f));
        this.P = null;
        d(true);
    }

    public final void a(int i, long j, TLRPC.Document document, String str) {
        tta[] ttaVarArr;
        this.a0 = i;
        this.b0 = j;
        this.c0 = document;
        this.d0 = str;
        this.i0 = false;
        this.k0 = false;
        int i2 = 0;
        while (true) {
            ttaVarArr = this.n;
            if (i2 >= ttaVarArr.length) {
                break;
            }
            tta ttaVar = ttaVarArr[i2];
            if (ttaVar != null) {
                hl.B2(ttaVar);
            }
            i2++;
        }
        pta ptaVar = this.h;
        View[] viewArr = ptaVar.a;
        ota otaVar = ptaVar.I;
        if (otaVar != null) {
            otaVar.e = true;
            otaVar.l = false;
            otaVar.a.I = null;
            ptaVar.I = null;
        }
        ValueAnimator valueAnimator = ptaVar.H;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            ptaVar.H = null;
        }
        ptaVar.G = -1;
        ptaVar.F = 0.0f;
        ptaVar.w.clear();
        ptaVar.x.clear();
        ptaVar.y.clear();
        for (int i3 = 0; i3 < 6; i3++) {
            ptaVar.E[i3] = 0.0f;
        }
        ptaVar.removeAllViews();
        for (int i4 = 0; i4 < viewArr.length; i4++) {
            viewArr[i4].setAlpha(1.0f);
            viewArr[i4].setVisibility(0);
            ptaVar.addView(viewArr[i4], tre.e(jn7.s1, jn7.s1, 17));
        }
        Matrix.setIdentityM(ptaVar.c, 0);
        ptaVar.e = 0.0f;
        ptaVar.d = 0.0f;
        ptaVar.f = true;
        tta ttaVar2 = new tta(getContext());
        ttaVarArr[0] = ttaVar2;
        addView(ttaVar2, tre.d(76, 76.0f, 49, -117.0f, 74.0f, 0.0f, 0.0f));
        tta ttaVar3 = new tta(getContext());
        ttaVarArr[1] = ttaVar3;
        addView(ttaVar3, tre.d(76, 76.0f, 49, -117.0f, 149.0f, 0.0f, 0.0f));
        tta ttaVar4 = new tta(getContext());
        ttaVarArr[2] = ttaVar4;
        addView(ttaVar4, tre.d(76, 76.0f, 49, 117.0f, 74.0f, 0.0f, 0.0f));
        tta ttaVar5 = new tta(getContext());
        ttaVarArr[3] = ttaVar5;
        addView(ttaVar5, tre.d(76, 76.0f, 49, 117.0f, 149.0f, 0.0f, 0.0f));
        for (int i5 = 0; i5 < ttaVarArr.length; i5++) {
            iye.a(ttaVarArr[i5]);
            ttaVarArr[i5].setClickable(true);
            ttaVarArr[i5].setOnClickListener(new jta(this, (byte) 5));
        }
        d(false);
        this.i0 = false;
        FrameLayout frameLayout = this.R;
        frameLayout.animate().cancel();
        frameLayout.setAlpha(1.0f);
        LinearLayout linearLayout = this.H;
        linearLayout.animate().cancel();
        linearLayout.setAlpha(1.0f);
        FrameLayout frameLayout2 = this.S;
        frameLayout2.animate().cancel();
        frameLayout2.setAlpha(0.0f);
        FrameLayout frameLayout3 = this.T;
        frameLayout3.animate().cancel();
        frameLayout3.setAlpha(0.0f);
        FrameLayout frameLayout4 = this.Q;
        frameLayout4.animate().cancel();
        frameLayout4.setAlpha(1.0f);
        this.F.setAlpha(this.s ? 0.0f : this.e0 != null ? 1.0f : 0.25f);
        rta rtaVar = this.f;
        rtaVar.setVisibility(8);
        rtaVar.setAlpha(0.0f);
        String M0 = ob6.M0(2131749743, null);
        in inVar = this.I;
        inVar.setText(M0);
        inVar.setTranslationY(0.0f);
        this.J.setAlpha(1.0f);
        ov4.c(i).j(j, new sm1(this, j, j, (byte) 2));
    }

    public final void b(lta ltaVar) {
        if (ltaVar.d != null) {
            c(ltaVar, hl.S2(ob6.G(Math.round(ltaVar.f * 100.0f), "GiftCraftBackdropChance", ltaVar.d.name)));
        } else if (ltaVar.e != null) {
            c(ltaVar, hl.S2(ob6.G(Math.round(ltaVar.f * 100.0f), "GiftCraftSymbolChance", ltaVar.e.name)));
        }
    }

    public final void c(lta ltaVar, SpannableStringBuilder spannableStringBuilder) {
        kg5 kg5Var = this.U;
        if (kg5Var != null) {
            kg5Var.f(true);
            this.U = null;
        }
        if (this.i0 || this.k0) {
            return;
        }
        View view = ltaVar.getParent() instanceof View ? (View) ltaVar.getParent() : null;
        float x = ltaVar.getX() + (view != null ? view.getX() : 0.0f);
        float y = ltaVar.getY() + (view != null ? view.getY() : 0.0f);
        kg5 kg5Var2 = new kg5(getContext(), 3);
        this.U = kg5Var2;
        kg5Var2.p(true);
        this.U.t(spannableStringBuilder);
        kg5 kg5Var3 = this.U;
        kg5Var3.h = kg5.a(kg5Var3.getText(), this.U.getTextPaint());
        kg5 kg5Var4 = this.U;
        kg5Var4.L = Layout.Alignment.ALIGN_CENTER;
        kg5Var4.setPadding(hl.L(2.0f), 0, hl.L(2.0f), 0);
        addView(this.U, tre.d(-1, 100.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        this.U.setTranslationY(y - hl.L(100.0f));
        this.U.o(0.0f, ((ltaVar.getWidth() / 2.0f) + x) - hl.L(2.0f));
        this.U.v();
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x04aa, code lost:
    
        if (r3 != null) goto L179;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(boolean z) {
        int i;
        tta[] ttaVarArr;
        HashMap hashMap;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop;
        int i2;
        HashMap hashMap2;
        boolean z2;
        lta[] ltaVarArr;
        TL_stars.starGiftAttributePattern stargiftattributepattern;
        LinearLayout linearLayout;
        boolean z3;
        TL_stars.StarGift starGift;
        int i3;
        int giftsSelectedCount = getGiftsSelectedCount();
        float giftsSuccessChance = getGiftsSuccessChance() / 10.0f;
        iy9 iy9Var = this.e;
        in inVar = (in) iy9Var.b;
        boolean z4 = true;
        if (inVar != null) {
            inVar.c(Math.round(giftsSuccessChance) + "%", z, true);
            qta qtaVar = (qta) iy9Var.c;
            float f = giftsSuccessChance / 100.0f;
            qtaVar.d = f;
            if (!z) {
                qtaVar.b.e(true, f);
            }
            qtaVar.invalidate();
        }
        in inVar2 = this.J;
        int i4 = 0;
        if (giftsSelectedCount <= 0) {
            if (this.n0 == null) {
                this.n0 = new SpannableStringBuilder("+");
                wm2 wm2Var = new wm2(R.drawable.filled_add_album, 0);
                wm2Var.I = 0.65f;
                wm2Var.J = 0.65f;
                SpannableStringBuilder spannableStringBuilder = this.n0;
                spannableStringBuilder.setSpan(wm2Var, 0, spannableStringBuilder.length(), 33);
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(ob6.M0(2131749742, null));
            hl.I2(spannableStringBuilder2, this.n0, "+");
            inVar2.setText(spannableStringBuilder2);
        } else {
            inVar2.setText(hl.S2(ob6.a0(null, null, 2131749712, cc.J0(getGiftsSuccessChance()))));
        }
        int i5 = (giftsSelectedCount == 0 ? 0 : giftsSelectedCount < 4 ? 1 : 2) << 1;
        int[] iArr = this.W;
        int i6 = i5 + 1;
        this.G.a(iArr[i5], iArr[i6]);
        int[] iArr2 = this.V;
        this.b.a(iArr2[i5], iArr2[i6]);
        this.f.a(iArr[i6], iArr[i5]);
        if (this.c0 != null) {
            TL_stars.StarGift firstGift = getFirstGift();
            tpa tpaVar = this.r;
            if (firstGift != null) {
                SpannableString spannableString = new SpannableString("x");
                i = 3;
                spannableString.setSpan(new hm(this.c0, tpaVar.getPaint().getFontMetricsInt()), 0, spannableString.length(), 33);
                tpaVar.setText(TextUtils.concat(hl.S2(ob6.M0(2131749708, null)), "\n", spannableString, " ", hl.S2(ob6.a0(null, null, 2131749707, this.d0, ob6.E(firstGift.num, ',')))));
            } else {
                i = 3;
                SpannableString spannableString2 = new SpannableString("x");
                spannableString2.setSpan(new hm(this.c0, tpaVar.getPaint().getFontMetricsInt()), 0, spannableString2.length(), 33);
                tpaVar.setText(TextUtils.concat(hl.S2(ob6.M0(2131749706, null)), "\n", spannableString2, " ", hl.S2(ob6.a0(null, null, 2131749705, this.d0))));
            }
        } else {
            i = 3;
        }
        int[][] iArr3 = uc7.s1(this.a0).W3;
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        int i8 = 0;
        while (true) {
            ttaVarArr = this.n;
            if (i7 >= ttaVarArr.length) {
                break;
            }
            tta ttaVar = ttaVarArr[i7];
            if (ttaVar != null) {
                TL_stars.StarGift starGift2 = ttaVar.h;
                if ((starGift2 != null ? starGift2 : null) != null) {
                    i8++;
                    if (starGift2 == null) {
                        starGift2 = null;
                    }
                    TL_stars.starGiftAttributePattern stargiftattributepattern2 = (TL_stars.starGiftAttributePattern) jxa.i(starGift2.attributes, TL_stars.starGiftAttributePattern.class);
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = (TL_stars.starGiftAttributeBackdrop) jxa.i(starGift2.attributes, TL_stars.starGiftAttributeBackdrop.class);
                    hashMap3.put(Integer.valueOf(stargiftattributebackdrop2.backdrop_id), Integer.valueOf(((Integer) Map.-EL.getOrDefault(hashMap3, Integer.valueOf(stargiftattributebackdrop2.backdrop_id), 0)).intValue() + 1));
                    hashMap4.put(Long.valueOf(stargiftattributepattern2.document.id), Integer.valueOf(((Integer) Map.-EL.getOrDefault(hashMap4, Long.valueOf(stargiftattributepattern2.document.id), 0)).intValue() + 1));
                }
            }
            i7++;
        }
        boolean isEmpty = hashMap3.isEmpty();
        lta[] ltaVarArr2 = this.y;
        if (isEmpty) {
            lta ltaVar = ltaVarArr2[0];
            ltaVar.a(null);
            ltaVar.c(true, 0.0f);
            arrayList.add(ltaVar);
            for (int i9 = 1; i9 < 4; i9++) {
                ltaVarArr2[i9].setVisibility(8);
            }
            hashMap = hashMap4;
        } else {
            ArrayList arrayList2 = new ArrayList(hashMap3.entrySet());
            Collections.sort(arrayList2, Map$Entry$-CC.comparingByValue());
            int size = arrayList2.size();
            int i10 = 0;
            int i11 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                Map.Entry entry = (Map.Entry) obj;
                int intValue = ((Integer) entry.getKey()).intValue();
                int intValue2 = ((Integer) entry.getValue()).intValue();
                int i12 = i4;
                boolean z5 = z4;
                while (true) {
                    if (i12 >= ttaVarArr.length) {
                        stargiftattributebackdrop = null;
                        break;
                    }
                    tta ttaVar2 = ttaVarArr[i12];
                    if (ttaVar2 != null) {
                        TL_stars.StarGift starGift3 = ttaVar2.h;
                        if ((starGift3 != null ? starGift3 : null) != null) {
                            if (starGift3 == null) {
                                starGift3 = null;
                            }
                            stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) jxa.i(starGift3.attributes, TL_stars.starGiftAttributeBackdrop.class);
                            if (stargiftattributebackdrop.backdrop_id == intValue) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                    i12++;
                }
                if (stargiftattributebackdrop != null) {
                    lta ltaVar2 = ltaVarArr2[i11];
                    ltaVar2.a(stargiftattributebackdrop);
                    i2 = size;
                    int[] iArr4 = iArr3[Utilities.j(i8 - 1, iArr3.length - 1, 0)];
                    int i13 = intValue2 - 1;
                    hashMap2 = hashMap4;
                    ltaVar2.c(z5, iArr4[Utilities.j(i13, iArr4.length - 1, 0)] / 1000.0f);
                    arrayList.add(ltaVar2);
                    i11++;
                } else {
                    i2 = size;
                    hashMap2 = hashMap4;
                }
                hashMap4 = hashMap2;
                size = i2;
                i4 = 0;
                z4 = true;
            }
            hashMap = hashMap4;
            for (int i14 = i11; i14 < 4; i14++) {
                ltaVarArr2[i14].setVisibility(8);
            }
        }
        boolean isEmpty2 = hashMap.isEmpty();
        lta[] ltaVarArr3 = this.E;
        if (isEmpty2) {
            lta ltaVar3 = ltaVarArr3[0];
            ltaVar3.b(null);
            ltaVar3.c(true, 0.0f);
            arrayList.add(ltaVar3);
            for (int i15 = 1; i15 < 4; i15++) {
                ltaVarArr3[i15].setVisibility(8);
            }
            z2 = true;
        } else {
            ArrayList arrayList3 = new ArrayList(hashMap.entrySet());
            Collections.sort(arrayList3, Map$Entry$-CC.comparingByValue());
            int size2 = arrayList3.size();
            int i16 = 0;
            int i17 = 0;
            while (i17 < size2) {
                Object obj2 = arrayList3.get(i17);
                i17++;
                Map.Entry entry2 = (Map.Entry) obj2;
                long longValue = ((Long) entry2.getKey()).longValue();
                int intValue3 = ((Integer) entry2.getValue()).intValue();
                int i18 = 0;
                while (true) {
                    if (i18 >= ttaVarArr.length) {
                        ltaVarArr = ltaVarArr3;
                        stargiftattributepattern = null;
                        break;
                    }
                    tta ttaVar3 = ttaVarArr[i18];
                    if (ttaVar3 != null) {
                        TL_stars.StarGift starGift4 = ttaVar3.h;
                        if ((starGift4 != null ? starGift4 : null) != null) {
                            if (starGift4 == null) {
                                starGift4 = null;
                            }
                            TL_stars.starGiftAttributePattern stargiftattributepattern3 = (TL_stars.starGiftAttributePattern) jxa.i(starGift4.attributes, TL_stars.starGiftAttributePattern.class);
                            if (stargiftattributepattern3 != null) {
                                ltaVarArr = ltaVarArr3;
                                if (stargiftattributepattern3.document.id == longValue) {
                                    stargiftattributepattern = stargiftattributepattern3;
                                    break;
                                } else {
                                    i18++;
                                    ltaVarArr3 = ltaVarArr;
                                }
                            }
                        }
                    }
                    ltaVarArr = ltaVarArr3;
                    i18++;
                    ltaVarArr3 = ltaVarArr;
                }
                if (stargiftattributepattern != null) {
                    int i19 = i16 + 1;
                    lta ltaVar4 = ltaVarArr[i16];
                    ltaVar4.b(stargiftattributepattern);
                    int[] iArr5 = iArr3[Utilities.j(i8 - 1, iArr3.length - 1, 0)];
                    ltaVar4.c(true, iArr5[Utilities.j(intValue3 - 1, iArr5.length - 1, 0)] / 1000.0f);
                    arrayList.add(ltaVar4);
                    i16 = i19;
                }
                ltaVarArr3 = ltaVarArr;
            }
            lta[] ltaVarArr4 = ltaVarArr3;
            z2 = true;
            while (i16 < 4) {
                ltaVarArr4[i16].setVisibility(8);
                i16++;
            }
        }
        this.s = arrayList.size() > 5 ? z2 : false;
        int i20 = 0;
        while (true) {
            int size3 = arrayList.size();
            linearLayout = this.x;
            if (i20 >= size3) {
                break;
            }
            lta ltaVar5 = (lta) arrayList.get(i20);
            if (!this.s || i20 < arrayList.size() / 2.0f) {
                linearLayout = this.w;
            }
            if (ltaVar5.getParent() != linearLayout) {
                ViewParent parent = ltaVar5.getParent();
                if (parent instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
                    boolean z6 = layoutTransition != null ? z2 : false;
                    i3 = i;
                    if (z6) {
                        layoutTransition.disableTransitionType(i3);
                    }
                    viewGroup.removeView(ltaVar5);
                    if (z6) {
                        layoutTransition.enableTransitionType(i3);
                    }
                    ltaVar5.animate().cancel();
                    ltaVar5.clearAnimation();
                    ltaVar5.setTranslationX(0.0f);
                    ltaVar5.setTranslationY(0.0f);
                    ltaVar5.setTranslationZ(0.0f);
                    ltaVar5.setAlpha(0.0f);
                    ltaVar5.setScaleX(1.0f);
                    ltaVar5.setScaleY(1.0f);
                    ltaVar5.setRotation(0.0f);
                    ltaVar5.setRotationX(0.0f);
                    ltaVar5.setRotationY(0.0f);
                } else {
                    i3 = i;
                }
                linearLayout.addView(ltaVar5, tre.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            } else {
                i3 = i;
            }
            ltaVar5.setVisibility(0);
            i20++;
            i = i3;
        }
        linearLayout.animate().alpha(this.s ? 1.0f : 0.0f);
        this.F.animate().alpha(this.s ? 0.0f : this.e0 != null ? 1.0f : 0.25f);
        boolean z7 = z2;
        for (int i21 = 0; i21 < ttaVarArr.length; i21++) {
            tta ttaVar4 = ttaVarArr[i21];
            if (ttaVar4 != null) {
                TL_stars.StarGift starGift5 = ttaVar4.h;
                if (starGift5 == null) {
                    starGift5 = null;
                }
                if (starGift5 != null) {
                    int i22 = R.drawable.msg_close;
                    if (z7) {
                        int i23 = i21 + 1;
                        while (true) {
                            if (i23 >= ttaVarArr.length) {
                                break;
                            }
                            tta ttaVar5 = ttaVarArr[i23];
                            if (ttaVar5 != null) {
                                starGift = ttaVar5.h;
                                if ((starGift != null ? starGift : null) != null) {
                                }
                            }
                            i23++;
                        }
                        starGift = null;
                        tta ttaVar6 = ttaVarArr[i21];
                        boolean z8 = (starGift == null || TextUtils.isEmpty(starGift.gift_address)) ? false : z2;
                        ImageView imageView = ttaVar6.f;
                        imageView.setScaleX(0.8f);
                        imageView.setScaleY(0.8f);
                        ttaVar6.n = z8;
                        if (z8) {
                            i22 = R.drawable.mini_replace2;
                        }
                        imageView.setImageResource(i22);
                        z3 = false;
                    } else {
                        ImageView imageView2 = ttaVar4.f;
                        imageView2.setScaleX(0.8f);
                        imageView2.setScaleY(0.8f);
                        z3 = false;
                        ttaVar4.n = false;
                        imageView2.setImageResource(R.drawable.msg_close);
                    }
                    z7 = z3;
                }
            }
        }
    }

    public TL_stars.StarGift getFirstGift() {
        int i = 0;
        while (true) {
            tta[] ttaVarArr = this.n;
            if (i >= ttaVarArr.length) {
                return null;
            }
            tta ttaVar = ttaVarArr[i];
            if (ttaVar != null) {
                TL_stars.StarGift starGift = ttaVar.h;
                if ((starGift != null ? starGift : null) != null) {
                    if (starGift != null) {
                        return starGift;
                    }
                    return null;
                }
            }
            i++;
        }
    }

    public int getGiftsSelectedCount() {
        int i = 0;
        int i2 = 0;
        while (true) {
            tta[] ttaVarArr = this.n;
            if (i >= ttaVarArr.length) {
                return i2;
            }
            tta ttaVar = ttaVarArr[i];
            if (ttaVar != null) {
                TL_stars.StarGift starGift = ttaVar.h;
                if (starGift == null) {
                    starGift = null;
                }
                if (starGift != null) {
                    i2++;
                }
            }
            i++;
        }
    }

    public int getGiftsSuccessChance() {
        int i = 0;
        int i2 = 0;
        while (true) {
            tta[] ttaVarArr = this.n;
            if (i >= ttaVarArr.length) {
                return i2;
            }
            tta ttaVar = ttaVarArr[i];
            if (ttaVar != null) {
                TL_stars.StarGift starGift = ttaVar.h;
                if ((starGift != null ? starGift : null) != null) {
                    if (starGift == null) {
                        starGift = null;
                    }
                    i2 += starGift.craft_chance_permille;
                }
            }
            i++;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), i2);
    }

    public void setOnAddGift(icc iccVar) {
        this.g0 = iccVar;
    }

    public void setOnClose(Runnable runnable) {
        this.h0 = runnable;
    }

    public void setOnCraft(kcc kccVar) {
        this.f0 = kccVar;
    }
}
