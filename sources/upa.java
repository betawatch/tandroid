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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class upa extends FrameLayout {
    public final kpa[] E;
    public final fm F;
    public final lpa G;
    public final LinearLayout H;
    public final hn I;
    public final hn J;
    public final ry8 K;
    public final TextView L;
    public final TextView M;
    public final TextView N;
    public final LinearLayout O;
    public nv4[] P;
    public final FrameLayout Q;
    public final FrameLayout R;
    public final FrameLayout S;
    public final FrameLayout T;
    public je5 U;
    public final int[] V;
    public final int[] W;
    public final wjb a;
    public int a0;
    public final tpa b;
    public long b0;
    public final ImageView c;
    public TLRPC.Document c0;
    public final gw9[] d;
    public String d0;
    public final gw9 e;
    public ArrayList e0;
    public final qpa f;
    public k8c f0;
    public i8c g0;
    public final opa h;
    public Runnable h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public Runnable l0;
    public ry8 m0;
    public final spa[] n;
    public SpannableStringBuilder n0;
    public final wla r;
    public boolean s;
    public final LinearLayout w;
    public final LinearLayout x;
    public final kpa[] y;

    public upa(Context context, wjb wjbVar) {
        super(context);
        gw9[] gw9VarArr;
        int i = 6;
        this.V = new int[]{-14861233, -15787732, -11327734, -14742773, -14527649, -15920861};
        this.W = new int[]{bkb.p1(0.08f, -1), bkb.p1(0.08f, -1), -294362, -3914963, -13519030, -12613223};
        this.a = wjbVar;
        tpa tpaVar = new tpa();
        this.b = tpaVar;
        Drawable d = b00.d(context, R.drawable.filled_forge);
        d.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN));
        tpaVar.g = d;
        setBackground(tpaVar);
        FrameLayout frameLayout = new FrameLayout(context);
        this.Q = frameLayout;
        addView(frameLayout, nme.e(-1, 60, 55));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setImageResource(R.drawable.outline_question_mark);
        imageView.setBackground(new iqa(gl.L(24.0f), bkb.p1(0.08f, -1)));
        frameLayout.addView(imageView, nme.d(32, 32.0f, 51, 14.0f, 14.0f, 14.0f, 14.0f));
        imageView.setOnClickListener(new jpa(this, (byte) 0));
        ote.a(imageView);
        ImageView k = tb4.k(context, R.drawable.msg_close);
        k.setBackground(new iqa(gl.L(24.0f), bkb.p1(0.08f, -1)));
        frameLayout.addView(k, nme.d(32, 32.0f, 53, 14.0f, 14.0f, 14.0f, 14.0f));
        byte b = 1;
        k.setOnClickListener(new jpa(this, b));
        ote.a(k);
        TextView textView = new TextView(context);
        textView.setTypeface(gl.o());
        textView.setGravity(17);
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(-1);
        textView.setText(k96.M0(2131749742, null));
        addView(textView, nme.d(-1, -2.0f, 49, 0.0f, 20.0f, 0.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.R = frameLayout2;
        addView(frameLayout2, nme.e(-1, -1, kk7.D1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.S = frameLayout3;
        frameLayout3.setAlpha(0.0f);
        addView(frameLayout3, nme.e(-1, -1, kk7.D1));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.T = frameLayout4;
        frameLayout4.setAlpha(0.0f);
        addView(frameLayout4, nme.e(-1, -1, kk7.D1));
        wla wlaVar = new wla(context);
        this.r = wlaVar;
        wlaVar.setGravity(17);
        wlaVar.setTextSize(1, 13.0f);
        wlaVar.setTextColor(-1);
        frameLayout2.addView(wlaVar, nme.d(-1, -2.0f, 49, 32.0f, 244.0f, 32.0f, 84.0f));
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
        s33 s33Var = s33.h;
        layoutTransition.setInterpolator(2, s33Var);
        layoutTransition.setInterpolator(3, s33Var);
        layoutTransition.setInterpolator(0, s33Var);
        layoutTransition.setInterpolator(1, s33Var);
        layoutTransition.setInterpolator(4, s33Var);
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
        layoutTransition2.setInterpolator(2, s33Var);
        layoutTransition2.setInterpolator(3, s33Var);
        layoutTransition2.setInterpolator(0, s33Var);
        layoutTransition2.setInterpolator(1, s33Var);
        layoutTransition2.setInterpolator(4, s33Var);
        linearLayout2.setLayoutTransition(layoutTransition2);
        linearLayout2.setOrientation(0);
        linearLayout2.setAlpha(0.0f);
        linearLayout2.setGravity(17);
        this.y = new kpa[4];
        this.E = new kpa[4];
        for (int i2 = 0; i2 < 4; i2++) {
            LinearLayout linearLayout3 = this.w;
            kpa[] kpaVarArr = this.y;
            kpa kpaVar = new kpa(context);
            kpaVarArr[i2] = kpaVar;
            linearLayout3.addView(kpaVar, nme.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            this.y[i2].setOnClickListener(new jpa(this, b2));
        }
        for (int i3 = 0; i3 < 4; i3++) {
            LinearLayout linearLayout4 = this.w;
            kpa[] kpaVarArr2 = this.E;
            kpa kpaVar2 = new kpa(context);
            kpaVarArr2[i3] = kpaVar2;
            linearLayout4.addView(kpaVar2, nme.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            this.E[i3].setOnClickListener(new jpa(this, b3));
        }
        this.n = new spa[4];
        this.d = new gw9[6];
        int i4 = 0;
        while (true) {
            gw9VarArr = this.d;
            if (i4 >= i) {
                break;
            }
            byte b4 = i4 == 5 ? b : (byte) 0;
            gw9 gw9Var = new gw9(context, b);
            FrameLayout frameLayout5 = new FrameLayout(context);
            frameLayout5.setBackground(new iqa(gl.L(24.0f), bkb.p1(0.08f, -1)));
            gw9Var.addView(frameLayout5, nme.d(-1, -1.0f, kk7.D1, 2.0f, 2.0f, 2.0f, 2.0f));
            be0 be0Var = new be0(context);
            be0Var.setImageResource(R.drawable.large_forge);
            be0Var.setAlpha(b4 != 0 ? 1.0f : 0.45f);
            int i5 = b4 != 0 ? 42 : 64;
            frameLayout5.addView(be0Var, nme.e(i5, i5, 17));
            if (b4 != 0) {
                be0Var.setTranslationX(gl.L(-4.0f));
                ppa ppaVar = new ppa(context);
                gw9Var.c = ppaVar;
                ppaVar.e = gl.L(37.0f);
                ppaVar.a.setStrokeWidth(gl.N(4.66f));
                frameLayout5.addView(ppaVar, nme.e(90, 90, 17));
                hn hnVar = new hn(context, false, false, false);
                gw9Var.b = hnVar;
                hnVar.getDrawable().r(false, true);
                hnVar.setTypeface(gl.o());
                hnVar.setTextColor(-1);
                hnVar.setTextSize(gl.L(14.0f));
                hnVar.setGravity(17);
                hnVar.setText("0%");
                frameLayout5.addView(hnVar, nme.d(-1, 16.0f, 55, 12.0f, 80.0f, 12.0f, 0.0f));
            }
            gw9VarArr[i4] = gw9Var;
            i4++;
            i = 6;
            b = 1;
        }
        this.e = gw9VarArr[5];
        qpa qpaVar = new qpa(context);
        this.f = qpaVar;
        qpaVar.setVisibility(8);
        qpaVar.setAlpha(0.0f);
        addView(qpaVar, nme.d(kk7.W4, 300.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        opa opaVar = new opa(context, this.d);
        this.h = opaVar;
        addView(opaVar, nme.d(-1, 300.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        fm fmVar = new fm(context);
        this.F = fmVar;
        fmVar.setTextSize(1, 12.0f);
        fmVar.setTypeface(gl.o());
        fmVar.setText(gl.E2(k96.M0(2131749738, null), false, gl.L(1.0f), gl.L(1.0f)));
        fmVar.setPadding(gl.L(9.0f), 0, gl.L(9.0f), 0);
        fmVar.setGravity(17);
        fmVar.setTextColor(-1);
        fmVar.setAlpha(this.e0 != null ? 1.0f : 0.25f);
        fmVar.setBackground(new iqa(gl.L(14.0f), bkb.p1(0.08f, -1)));
        ote.b(fmVar, 0.02f, 1.2f);
        this.R.addView(fmVar, nme.d(-2, 27.0f, 49, 32.0f, 412.0f, 32.0f, 84.0f));
        fmVar.setOnClickListener(new b99(this, wjbVar, (byte) 16));
        this.R.addView(this.w, nme.d(-2, 54.0f, 49, 32.0f, 340.0f, 32.0f, 84.0f));
        this.R.addView(this.x, nme.d(-2, 54.0f, 49, 32.0f, 394.0f, 32.0f, 84.0f));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.H = linearLayout5;
        linearLayout5.setOrientation(1);
        lpa lpaVar = new lpa();
        this.G = lpaVar;
        linearLayout5.setBackground(lpaVar);
        lpaVar.a(bkb.p1(0.08f, -1), bkb.p1(0.08f, -1));
        ote.b(linearLayout5, 0.02f, 1.2f);
        addView(linearLayout5, nme.d(-1, -2.0f, 87, 20.0f, 0.0f, 20.0f, 18.0f));
        linearLayout5.setOnClickListener(new jpa(this, (byte) 4));
        hn hnVar2 = new hn(context, false, false, false);
        this.I = hnVar2;
        hnVar2.setTypeface(gl.o());
        hnVar2.setGravity(17);
        hnVar2.setTextColor(bkb.p1(0.75f, -1));
        hnVar2.setText(k96.M0(2131749781, null));
        hnVar2.setTextSize(gl.L(14.0f));
        linearLayout5.addView(hnVar2, nme.s(-1, 18, 55, 16.0f, 7.33f, 16.0f, 0.0f));
        hn hnVar3 = new hn(context, false, false, false);
        this.J = hnVar3;
        hnVar3.getDrawable().r(true, false);
        hnVar3.setGravity(17);
        hnVar3.setTextColor(bkb.p1(0.75f, -1));
        hnVar3.setText(gl.S2(k96.a0(null, null, 2131749750, "0%")));
        hnVar3.setTextSize(gl.L(12.0f));
        linearLayout5.addView(hnVar3, nme.s(-1, 14, 55, 16.0f, 2.66f, 16.0f, 7.66f));
        LinearLayout linearLayout6 = new LinearLayout(context);
        linearLayout6.setOrientation(0);
        linearLayout6.setGravity(17);
        ry8 ry8Var = new ry8(context);
        this.K = ry8Var;
        ry8Var.setAutoRepeat(true);
        ry8Var.f(R.raw.gift_crafting, 30, 30, null);
        linearLayout6.addView(ry8Var, nme.t(30, 30, 17, 0, 0, 4, 0));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 20.0f);
        textView2.setTextColor(-1);
        textView2.setTypeface(gl.o());
        textView2.setGravity(17);
        textView2.setText(k96.M0(2131749758, null));
        linearLayout6.addView(textView2, nme.t(-2, -2, 17, 0, 0, 0, 0));
        this.S.addView(linearLayout6, nme.d(-1, -2.0f, 49, 0.0f, 350.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.L = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(bkb.p1(0.5f, -1));
        textView3.setTypeface(gl.o());
        textView3.setGravity(17);
        TextView l = ug8.l(this.S, textView3, nme.d(-1, -2.0f, 49, 0.0f, 383.0f, 0.0f, 0.0f), context);
        this.M = l;
        l.setTextSize(1, 13.0f);
        l.setTextColor(-1);
        l.setTypeface(gl.o());
        l.setGravity(17);
        l.setPadding(gl.L(9.0f), 0, gl.L(9.0f), 0);
        l.setBackground(new iqa(gl.L(14.0f), bkb.p1(0.08f, -1)));
        TextView l2 = ug8.l(this.S, l, nme.d(-2, 27.0f, 81, 0.0f, 0.0f, 0.0f, 74.0f), context);
        l2.setTextSize(1, 13.0f);
        l2.setTextColor(bkb.p1(0.5f, -1));
        de9.q(l2, 17, null, 2131749759);
        TextView l3 = ug8.l(this.S, l2, nme.d(-1, -2.0f, 81, 42.0f, 0.0f, 42.0f, 24.0f), context);
        l3.setText(k96.M0(2131749772, null));
        l3.setTextColor(-505270);
        l3.setTextSize(1, 20.0f);
        l3.setTypeface(gl.o());
        l3.setGravity(17);
        TextView l4 = ug8.l(this.T, l3, nme.d(-1, -2.0f, 55, 32.0f, 352.0f, 32.0f, 0.0f), context);
        this.N = l4;
        l4.setTextColor(-17253);
        l4.setTextSize(1, 13.0f);
        l4.setGravity(17);
        this.T.addView(l4, nme.d(-1, -2.0f, 55, 32.0f, 383.0f, 32.0f, 0.0f));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.O = linearLayout7;
        linearLayout7.setOrientation(0);
        this.T.addView(linearLayout7, nme.d(-2, -2.0f, 49, 0.0f, 250.0f, 0.0f, 0.0f));
        this.P = null;
        d(true);
    }

    public final void a(int i, long j, TLRPC.Document document, String str) {
        spa[] spaVarArr;
        this.a0 = i;
        this.b0 = j;
        this.c0 = document;
        this.d0 = str;
        this.i0 = false;
        this.k0 = false;
        int i2 = 0;
        while (true) {
            spaVarArr = this.n;
            if (i2 >= spaVarArr.length) {
                break;
            }
            spa spaVar = spaVarArr[i2];
            if (spaVar != null) {
                gl.B2(spaVar);
            }
            i2++;
        }
        opa opaVar = this.h;
        View[] viewArr = opaVar.a;
        npa npaVar = opaVar.I;
        if (npaVar != null) {
            npaVar.e = true;
            npaVar.l = false;
            npaVar.a.I = null;
            opaVar.I = null;
        }
        ValueAnimator valueAnimator = opaVar.H;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            opaVar.H = null;
        }
        opaVar.G = -1;
        opaVar.F = 0.0f;
        opaVar.w.clear();
        opaVar.x.clear();
        opaVar.y.clear();
        for (int i3 = 0; i3 < 6; i3++) {
            opaVar.E[i3] = 0.0f;
        }
        opaVar.removeAllViews();
        for (int i4 = 0; i4 < viewArr.length; i4++) {
            viewArr[i4].setAlpha(1.0f);
            viewArr[i4].setVisibility(0);
            opaVar.addView(viewArr[i4], nme.e(kk7.s1, kk7.s1, 17));
        }
        Matrix.setIdentityM(opaVar.c, 0);
        opaVar.e = 0.0f;
        opaVar.d = 0.0f;
        opaVar.f = true;
        spa spaVar2 = new spa(getContext());
        spaVarArr[0] = spaVar2;
        addView(spaVar2, nme.d(76, 76.0f, 49, -117.0f, 74.0f, 0.0f, 0.0f));
        spa spaVar3 = new spa(getContext());
        spaVarArr[1] = spaVar3;
        addView(spaVar3, nme.d(76, 76.0f, 49, -117.0f, 149.0f, 0.0f, 0.0f));
        spa spaVar4 = new spa(getContext());
        spaVarArr[2] = spaVar4;
        addView(spaVar4, nme.d(76, 76.0f, 49, 117.0f, 74.0f, 0.0f, 0.0f));
        spa spaVar5 = new spa(getContext());
        spaVarArr[3] = spaVar5;
        addView(spaVar5, nme.d(76, 76.0f, 49, 117.0f, 149.0f, 0.0f, 0.0f));
        for (int i5 = 0; i5 < spaVarArr.length; i5++) {
            ote.a(spaVarArr[i5]);
            spaVarArr[i5].setClickable(true);
            spaVarArr[i5].setOnClickListener(new jpa(this, (byte) 5));
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
        qpa qpaVar = this.f;
        qpaVar.setVisibility(8);
        qpaVar.setAlpha(0.0f);
        String M0 = k96.M0(2131749781, null);
        hn hnVar = this.I;
        hnVar.setText(M0);
        hnVar.setTranslationY(0.0f);
        this.J.setAlpha(1.0f);
        kt4.c(i).j(j, new um1(this, j, j, (byte) 2));
    }

    public final void b(kpa kpaVar) {
        if (kpaVar.d != null) {
            c(kpaVar, gl.S2(k96.G(Math.round(kpaVar.f * 100.0f), "GiftCraftBackdropChance", kpaVar.d.name)));
        } else if (kpaVar.e != null) {
            c(kpaVar, gl.S2(k96.G(Math.round(kpaVar.f * 100.0f), "GiftCraftSymbolChance", kpaVar.e.name)));
        }
    }

    public final void c(kpa kpaVar, SpannableStringBuilder spannableStringBuilder) {
        je5 je5Var = this.U;
        if (je5Var != null) {
            je5Var.f(true);
            this.U = null;
        }
        if (this.i0 || this.k0) {
            return;
        }
        View view = kpaVar.getParent() instanceof View ? (View) kpaVar.getParent() : null;
        float x = kpaVar.getX() + (view != null ? view.getX() : 0.0f);
        float y = kpaVar.getY() + (view != null ? view.getY() : 0.0f);
        je5 je5Var2 = new je5(getContext(), 3);
        this.U = je5Var2;
        je5Var2.p(true);
        this.U.t(spannableStringBuilder);
        je5 je5Var3 = this.U;
        je5Var3.h = je5.a(je5Var3.getText(), this.U.getTextPaint());
        je5 je5Var4 = this.U;
        je5Var4.L = Layout.Alignment.ALIGN_CENTER;
        je5Var4.setPadding(gl.L(2.0f), 0, gl.L(2.0f), 0);
        addView(this.U, nme.d(-1, 100.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        this.U.setTranslationY(y - gl.L(100.0f));
        this.U.o(0.0f, ((kpaVar.getWidth() / 2.0f) + x) - gl.L(2.0f));
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
        spa[] spaVarArr;
        HashMap hashMap;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop;
        int i2;
        HashMap hashMap2;
        boolean z2;
        kpa[] kpaVarArr;
        TL_stars.starGiftAttributePattern stargiftattributepattern;
        LinearLayout linearLayout;
        boolean z3;
        TL_stars.StarGift starGift;
        int i3;
        int giftsSelectedCount = getGiftsSelectedCount();
        float giftsSuccessChance = getGiftsSuccessChance() / 10.0f;
        gw9 gw9Var = this.e;
        hn hnVar = (hn) gw9Var.b;
        boolean z4 = true;
        if (hnVar != null) {
            hnVar.c(Math.round(giftsSuccessChance) + "%", z, true);
            ppa ppaVar = (ppa) gw9Var.c;
            float f = giftsSuccessChance / 100.0f;
            ppaVar.d = f;
            if (!z) {
                ppaVar.b.e(true, f);
            }
            ppaVar.invalidate();
        }
        hn hnVar2 = this.J;
        int i4 = 0;
        if (giftsSelectedCount <= 0) {
            if (this.n0 == null) {
                this.n0 = new SpannableStringBuilder("+");
                cm2 cm2Var = new cm2(R.drawable.filled_add_album, 0);
                cm2Var.I = 0.65f;
                cm2Var.J = 0.65f;
                SpannableStringBuilder spannableStringBuilder = this.n0;
                spannableStringBuilder.setSpan(cm2Var, 0, spannableStringBuilder.length(), 33);
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(k96.M0(2131749780, null));
            gl.I2(spannableStringBuilder2, this.n0, "+");
            hnVar2.setText(spannableStringBuilder2);
        } else {
            hnVar2.setText(gl.S2(k96.a0(null, null, 2131749750, bc.I0(getGiftsSuccessChance()))));
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
            wla wlaVar = this.r;
            if (firstGift != null) {
                SpannableString spannableString = new SpannableString("x");
                i = 3;
                spannableString.setSpan(new gm(this.c0, wlaVar.getPaint().getFontMetricsInt()), 0, spannableString.length(), 33);
                wlaVar.setText(TextUtils.concat(gl.S2(k96.M0(2131749746, null)), "\n", spannableString, " ", gl.S2(k96.a0(null, null, 2131749745, this.d0, k96.E(firstGift.num, ',')))));
            } else {
                i = 3;
                SpannableString spannableString2 = new SpannableString("x");
                spannableString2.setSpan(new gm(this.c0, wlaVar.getPaint().getFontMetricsInt()), 0, spannableString2.length(), 33);
                wlaVar.setText(TextUtils.concat(gl.S2(k96.M0(2131749744, null)), "\n", spannableString2, " ", gl.S2(k96.a0(null, null, 2131749743, this.d0))));
            }
        } else {
            i = 3;
        }
        int[][] iArr3 = na7.q1(this.a0).V3;
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        int i8 = 0;
        while (true) {
            spaVarArr = this.n;
            if (i7 >= spaVarArr.length) {
                break;
            }
            spa spaVar = spaVarArr[i7];
            if (spaVar != null) {
                TL_stars.StarGift starGift2 = spaVar.h;
                if ((starGift2 != null ? starGift2 : null) != null) {
                    i8++;
                    if (starGift2 == null) {
                        starGift2 = null;
                    }
                    TL_stars.starGiftAttributePattern stargiftattributepattern2 = (TL_stars.starGiftAttributePattern) gta.i(starGift2.attributes, TL_stars.starGiftAttributePattern.class);
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = (TL_stars.starGiftAttributeBackdrop) gta.i(starGift2.attributes, TL_stars.starGiftAttributeBackdrop.class);
                    hashMap3.put(Integer.valueOf(stargiftattributebackdrop2.backdrop_id), Integer.valueOf(((Integer) Map.-EL.getOrDefault(hashMap3, Integer.valueOf(stargiftattributebackdrop2.backdrop_id), 0)).intValue() + 1));
                    hashMap4.put(Long.valueOf(stargiftattributepattern2.document.id), Integer.valueOf(((Integer) Map.-EL.getOrDefault(hashMap4, Long.valueOf(stargiftattributepattern2.document.id), 0)).intValue() + 1));
                }
            }
            i7++;
        }
        boolean isEmpty = hashMap3.isEmpty();
        kpa[] kpaVarArr2 = this.y;
        if (isEmpty) {
            kpa kpaVar = kpaVarArr2[0];
            kpaVar.a(null);
            kpaVar.c(true, 0.0f);
            arrayList.add(kpaVar);
            for (int i9 = 1; i9 < 4; i9++) {
                kpaVarArr2[i9].setVisibility(8);
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
                    if (i12 >= spaVarArr.length) {
                        stargiftattributebackdrop = null;
                        break;
                    }
                    spa spaVar2 = spaVarArr[i12];
                    if (spaVar2 != null) {
                        TL_stars.StarGift starGift3 = spaVar2.h;
                        if ((starGift3 != null ? starGift3 : null) != null) {
                            if (starGift3 == null) {
                                starGift3 = null;
                            }
                            stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) gta.i(starGift3.attributes, TL_stars.starGiftAttributeBackdrop.class);
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
                    kpa kpaVar2 = kpaVarArr2[i11];
                    kpaVar2.a(stargiftattributebackdrop);
                    i2 = size;
                    int[] iArr4 = iArr3[Utilities.j(i8 - 1, iArr3.length - 1, 0)];
                    int i13 = intValue2 - 1;
                    hashMap2 = hashMap4;
                    kpaVar2.c(z5, iArr4[Utilities.j(i13, iArr4.length - 1, 0)] / 1000.0f);
                    arrayList.add(kpaVar2);
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
                kpaVarArr2[i14].setVisibility(8);
            }
        }
        boolean isEmpty2 = hashMap.isEmpty();
        kpa[] kpaVarArr3 = this.E;
        if (isEmpty2) {
            kpa kpaVar3 = kpaVarArr3[0];
            kpaVar3.b(null);
            kpaVar3.c(true, 0.0f);
            arrayList.add(kpaVar3);
            for (int i15 = 1; i15 < 4; i15++) {
                kpaVarArr3[i15].setVisibility(8);
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
                    if (i18 >= spaVarArr.length) {
                        kpaVarArr = kpaVarArr3;
                        stargiftattributepattern = null;
                        break;
                    }
                    spa spaVar3 = spaVarArr[i18];
                    if (spaVar3 != null) {
                        TL_stars.StarGift starGift4 = spaVar3.h;
                        if ((starGift4 != null ? starGift4 : null) != null) {
                            if (starGift4 == null) {
                                starGift4 = null;
                            }
                            TL_stars.starGiftAttributePattern stargiftattributepattern3 = (TL_stars.starGiftAttributePattern) gta.i(starGift4.attributes, TL_stars.starGiftAttributePattern.class);
                            if (stargiftattributepattern3 != null) {
                                kpaVarArr = kpaVarArr3;
                                if (stargiftattributepattern3.document.id == longValue) {
                                    stargiftattributepattern = stargiftattributepattern3;
                                    break;
                                } else {
                                    i18++;
                                    kpaVarArr3 = kpaVarArr;
                                }
                            }
                        }
                    }
                    kpaVarArr = kpaVarArr3;
                    i18++;
                    kpaVarArr3 = kpaVarArr;
                }
                if (stargiftattributepattern != null) {
                    int i19 = i16 + 1;
                    kpa kpaVar4 = kpaVarArr[i16];
                    kpaVar4.b(stargiftattributepattern);
                    int[] iArr5 = iArr3[Utilities.j(i8 - 1, iArr3.length - 1, 0)];
                    kpaVar4.c(true, iArr5[Utilities.j(intValue3 - 1, iArr5.length - 1, 0)] / 1000.0f);
                    arrayList.add(kpaVar4);
                    i16 = i19;
                }
                kpaVarArr3 = kpaVarArr;
            }
            kpa[] kpaVarArr4 = kpaVarArr3;
            z2 = true;
            while (i16 < 4) {
                kpaVarArr4[i16].setVisibility(8);
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
            kpa kpaVar5 = (kpa) arrayList.get(i20);
            if (!this.s || i20 < arrayList.size() / 2.0f) {
                linearLayout = this.w;
            }
            if (kpaVar5.getParent() != linearLayout) {
                ViewParent parent = kpaVar5.getParent();
                if (parent instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
                    boolean z6 = layoutTransition != null ? z2 : false;
                    i3 = i;
                    if (z6) {
                        layoutTransition.disableTransitionType(i3);
                    }
                    viewGroup.removeView(kpaVar5);
                    if (z6) {
                        layoutTransition.enableTransitionType(i3);
                    }
                    kpaVar5.animate().cancel();
                    kpaVar5.clearAnimation();
                    kpaVar5.setTranslationX(0.0f);
                    kpaVar5.setTranslationY(0.0f);
                    kpaVar5.setTranslationZ(0.0f);
                    kpaVar5.setAlpha(0.0f);
                    kpaVar5.setScaleX(1.0f);
                    kpaVar5.setScaleY(1.0f);
                    kpaVar5.setRotation(0.0f);
                    kpaVar5.setRotationX(0.0f);
                    kpaVar5.setRotationY(0.0f);
                } else {
                    i3 = i;
                }
                linearLayout.addView(kpaVar5, nme.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            } else {
                i3 = i;
            }
            kpaVar5.setVisibility(0);
            i20++;
            i = i3;
        }
        linearLayout.animate().alpha(this.s ? 1.0f : 0.0f);
        this.F.animate().alpha(this.s ? 0.0f : this.e0 != null ? 1.0f : 0.25f);
        boolean z7 = z2;
        for (int i21 = 0; i21 < spaVarArr.length; i21++) {
            spa spaVar4 = spaVarArr[i21];
            if (spaVar4 != null) {
                TL_stars.StarGift starGift5 = spaVar4.h;
                if (starGift5 == null) {
                    starGift5 = null;
                }
                if (starGift5 != null) {
                    int i22 = R.drawable.msg_close;
                    if (z7) {
                        int i23 = i21 + 1;
                        while (true) {
                            if (i23 >= spaVarArr.length) {
                                break;
                            }
                            spa spaVar5 = spaVarArr[i23];
                            if (spaVar5 != null) {
                                starGift = spaVar5.h;
                                if ((starGift != null ? starGift : null) != null) {
                                }
                            }
                            i23++;
                        }
                        starGift = null;
                        spa spaVar6 = spaVarArr[i21];
                        boolean z8 = (starGift == null || TextUtils.isEmpty(starGift.gift_address)) ? false : z2;
                        ImageView imageView = spaVar6.f;
                        imageView.setScaleX(0.8f);
                        imageView.setScaleY(0.8f);
                        spaVar6.n = z8;
                        if (z8) {
                            i22 = R.drawable.mini_replace2;
                        }
                        imageView.setImageResource(i22);
                        z3 = false;
                    } else {
                        ImageView imageView2 = spaVar4.f;
                        imageView2.setScaleX(0.8f);
                        imageView2.setScaleY(0.8f);
                        z3 = false;
                        spaVar4.n = false;
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
            spa[] spaVarArr = this.n;
            if (i >= spaVarArr.length) {
                return null;
            }
            spa spaVar = spaVarArr[i];
            if (spaVar != null) {
                TL_stars.StarGift starGift = spaVar.h;
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
            spa[] spaVarArr = this.n;
            if (i >= spaVarArr.length) {
                return i2;
            }
            spa spaVar = spaVarArr[i];
            if (spaVar != null) {
                TL_stars.StarGift starGift = spaVar.h;
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
            spa[] spaVarArr = this.n;
            if (i >= spaVarArr.length) {
                return i2;
            }
            spa spaVar = spaVarArr[i];
            if (spaVar != null) {
                TL_stars.StarGift starGift = spaVar.h;
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

    public void setOnAddGift(i8c i8cVar) {
        this.g0 = i8cVar;
    }

    public void setOnClose(Runnable runnable) {
        this.h0 = runnable;
    }

    public void setOnCraft(k8c k8cVar) {
        this.f0 = k8cVar;
    }
}
