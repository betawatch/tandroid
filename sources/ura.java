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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ura extends FrameLayout {
    public final kra[] E;
    public final fn F;
    public final lra G;
    public final LinearLayout H;
    public final io I;
    public final io J;
    public final s09 K;
    public final TextView L;
    public final TextView M;
    public final TextView N;
    public final LinearLayout O;
    public ox4[] P;
    public final FrameLayout Q;
    public final FrameLayout R;
    public final FrameLayout S;
    public final FrameLayout T;
    public hg5 U;
    public final int[] V;
    public final int[] W;
    public final ylb a;
    public int a0;
    public final tra b;
    public long b0;
    public final ImageView c;
    public TLRPC.Document c0;
    public final qw9[] d;
    public String d0;
    public final qw9 e;
    public ArrayList e0;
    public final qra f;
    public lac f0;
    public jac g0;
    public final ora h;
    public Runnable h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public Runnable l0;
    public s09 m0;
    public final sra[] n;
    public SpannableStringBuilder n0;
    public final xna r;
    public boolean s;
    public final LinearLayout w;
    public final LinearLayout x;
    public final kra[] y;

    public ura(Context context, ylb ylbVar) {
        super(context);
        qw9[] qw9VarArr;
        int i = 6;
        this.V = new int[]{-14861233, -15787732, -11327734, -14742773, -14527649, -15920861};
        this.W = new int[]{cmb.p1(0.08f, -1), cmb.p1(0.08f, -1), -294362, -3914963, -13519030, -12613223};
        this.a = ylbVar;
        tra traVar = new tra();
        this.b = traVar;
        Drawable d = b10.d(context, R.drawable.filled_forge);
        d.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN));
        traVar.g = d;
        setBackground(traVar);
        FrameLayout frameLayout = new FrameLayout(context);
        this.Q = frameLayout;
        addView(frameLayout, qoe.e(-1, 60, 55));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setImageResource(R.drawable.outline_question_mark);
        imageView.setBackground(new isa(gm.L(24.0f), cmb.p1(0.08f, -1)));
        frameLayout.addView(imageView, qoe.d(32, 32.0f, 51, 14.0f, 14.0f, 14.0f, 14.0f));
        imageView.setOnClickListener(new jra(this, (byte) 0));
        rve.a(imageView);
        ImageView k = td4.k(context, R.drawable.msg_close);
        k.setBackground(new isa(gm.L(24.0f), cmb.p1(0.08f, -1)));
        frameLayout.addView(k, qoe.d(32, 32.0f, 53, 14.0f, 14.0f, 14.0f, 14.0f));
        byte b = 1;
        k.setOnClickListener(new jra(this, b));
        rve.a(k);
        TextView textView = new TextView(context);
        textView.setTypeface(gm.o());
        byte b2 = 17;
        textView.setGravity(17);
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(-1);
        textView.setText(jb6.M0(2131749691, null));
        addView(textView, qoe.d(-1, -2.0f, 49, 0.0f, 20.0f, 0.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.R = frameLayout2;
        addView(frameLayout2, qoe.e(-1, -1, nm7.D1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.S = frameLayout3;
        frameLayout3.setAlpha(0.0f);
        addView(frameLayout3, qoe.e(-1, -1, nm7.D1));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.T = frameLayout4;
        frameLayout4.setAlpha(0.0f);
        addView(frameLayout4, qoe.e(-1, -1, nm7.D1));
        xna xnaVar = new xna(context);
        this.r = xnaVar;
        xnaVar.setGravity(17);
        xnaVar.setTextSize(1, 13.0f);
        xnaVar.setTextColor(-1);
        frameLayout2.addView(xnaVar, qoe.d(-1, -2.0f, 49, 32.0f, 244.0f, 32.0f, 84.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.w = linearLayout;
        LayoutTransition layoutTransition = new LayoutTransition();
        byte b3 = 2;
        layoutTransition.setDuration(2, 320L);
        byte b4 = 3;
        layoutTransition.setDuration(3, 320L);
        layoutTransition.setDuration(0, 320L);
        layoutTransition.setDuration(1, 320L);
        layoutTransition.setDuration(4, 320L);
        d53 d53Var = d53.h;
        layoutTransition.setInterpolator(2, d53Var);
        layoutTransition.setInterpolator(3, d53Var);
        layoutTransition.setInterpolator(0, d53Var);
        layoutTransition.setInterpolator(1, d53Var);
        layoutTransition.setInterpolator(4, d53Var);
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
        layoutTransition2.setInterpolator(2, d53Var);
        layoutTransition2.setInterpolator(3, d53Var);
        layoutTransition2.setInterpolator(0, d53Var);
        layoutTransition2.setInterpolator(1, d53Var);
        layoutTransition2.setInterpolator(4, d53Var);
        linearLayout2.setLayoutTransition(layoutTransition2);
        linearLayout2.setOrientation(0);
        linearLayout2.setAlpha(0.0f);
        linearLayout2.setGravity(17);
        this.y = new kra[4];
        this.E = new kra[4];
        for (int i2 = 0; i2 < 4; i2++) {
            LinearLayout linearLayout3 = this.w;
            kra[] kraVarArr = this.y;
            kra kraVar = new kra(context);
            kraVarArr[i2] = kraVar;
            linearLayout3.addView(kraVar, qoe.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            this.y[i2].setOnClickListener(new jra(this, b3));
        }
        for (int i3 = 0; i3 < 4; i3++) {
            LinearLayout linearLayout4 = this.w;
            kra[] kraVarArr2 = this.E;
            kra kraVar2 = new kra(context);
            kraVarArr2[i3] = kraVar2;
            linearLayout4.addView(kraVar2, qoe.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            this.E[i3].setOnClickListener(new jra(this, b4));
        }
        this.n = new sra[4];
        this.d = new qw9[6];
        int i4 = 0;
        while (true) {
            qw9VarArr = this.d;
            if (i4 >= i) {
                break;
            }
            byte b5 = i4 == 5 ? b : (byte) 0;
            qw9 qw9Var = new qw9(context, b3);
            FrameLayout frameLayout5 = new FrameLayout(context);
            frameLayout5.setBackground(new isa(gm.L(24.0f), cmb.p1(0.08f, -1)));
            qw9Var.addView(frameLayout5, qoe.d(-1, -1.0f, nm7.D1, 2.0f, 2.0f, 2.0f, 2.0f));
            bf0 bf0Var = new bf0(context);
            bf0Var.setImageResource(R.drawable.large_forge);
            bf0Var.setAlpha(b5 != 0 ? 1.0f : 0.45f);
            int i5 = b5 != 0 ? 42 : 64;
            frameLayout5.addView(bf0Var, qoe.e(i5, i5, 17));
            if (b5 != 0) {
                bf0Var.setTranslationX(gm.L(-4.0f));
                pra praVar = new pra(context);
                qw9Var.c = praVar;
                praVar.e = gm.L(37.0f);
                praVar.a.setStrokeWidth(gm.N(4.66f));
                frameLayout5.addView(praVar, qoe.e(90, 90, 17));
                io ioVar = new io(context, false, false, false);
                qw9Var.b = ioVar;
                ioVar.getDrawable().r(false, true);
                ioVar.setTypeface(gm.o());
                ioVar.setTextColor(-1);
                ioVar.setTextSize(gm.L(14.0f));
                ioVar.setGravity(17);
                ioVar.setText("0%");
                frameLayout5.addView(ioVar, qoe.d(-1, 16.0f, 55, 12.0f, 80.0f, 12.0f, 0.0f));
            }
            qw9VarArr[i4] = qw9Var;
            i4++;
            i = 6;
            b = 1;
            b3 = 2;
        }
        this.e = qw9VarArr[5];
        qra qraVar = new qra(context);
        this.f = qraVar;
        qraVar.setVisibility(8);
        qraVar.setAlpha(0.0f);
        addView(qraVar, qoe.d(nm7.W4, 300.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        ora oraVar = new ora(context, this.d);
        this.h = oraVar;
        addView(oraVar, qoe.d(-1, 300.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        fn fnVar = new fn(context);
        this.F = fnVar;
        fnVar.setTextSize(1, 12.0f);
        fnVar.setTypeface(gm.o());
        fnVar.setText(gm.E2(jb6.M0(2131749687, null), false, gm.L(1.0f), gm.L(1.0f)));
        fnVar.setPadding(gm.L(9.0f), 0, gm.L(9.0f), 0);
        fnVar.setGravity(17);
        fnVar.setTextColor(-1);
        fnVar.setAlpha(this.e0 != null ? 1.0f : 0.25f);
        fnVar.setBackground(new isa(gm.L(14.0f), cmb.p1(0.08f, -1)));
        rve.b(fnVar, 0.02f, 1.2f);
        this.R.addView(fnVar, qoe.d(-2, 27.0f, 49, 32.0f, 412.0f, 32.0f, 84.0f));
        fnVar.setOnClickListener(new r39(this, ylbVar, b2));
        this.R.addView(this.w, qoe.d(-2, 54.0f, 49, 32.0f, 340.0f, 32.0f, 84.0f));
        this.R.addView(this.x, qoe.d(-2, 54.0f, 49, 32.0f, 394.0f, 32.0f, 84.0f));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.H = linearLayout5;
        linearLayout5.setOrientation(1);
        lra lraVar = new lra();
        this.G = lraVar;
        linearLayout5.setBackground(lraVar);
        lraVar.a(cmb.p1(0.08f, -1), cmb.p1(0.08f, -1));
        rve.b(linearLayout5, 0.02f, 1.2f);
        addView(linearLayout5, qoe.d(-1, -2.0f, 87, 20.0f, 0.0f, 20.0f, 18.0f));
        linearLayout5.setOnClickListener(new jra(this, (byte) 4));
        io ioVar2 = new io(context, false, false, false);
        this.I = ioVar2;
        ioVar2.setTypeface(gm.o());
        ioVar2.setGravity(17);
        ioVar2.setTextColor(cmb.p1(0.75f, -1));
        ioVar2.setText(jb6.M0(2131749730, null));
        ioVar2.setTextSize(gm.L(14.0f));
        linearLayout5.addView(ioVar2, qoe.s(-1, 18, 55, 16.0f, 7.33f, 16.0f, 0.0f));
        io ioVar3 = new io(context, false, false, false);
        this.J = ioVar3;
        ioVar3.getDrawable().r(true, false);
        ioVar3.setGravity(17);
        ioVar3.setTextColor(cmb.p1(0.75f, -1));
        ioVar3.setText(gm.S2(jb6.a0(null, null, 2131749699, "0%")));
        ioVar3.setTextSize(gm.L(12.0f));
        linearLayout5.addView(ioVar3, qoe.s(-1, 14, 55, 16.0f, 2.66f, 16.0f, 7.66f));
        LinearLayout linearLayout6 = new LinearLayout(context);
        linearLayout6.setOrientation(0);
        linearLayout6.setGravity(17);
        s09 s09Var = new s09(context);
        this.K = s09Var;
        s09Var.setAutoRepeat(true);
        s09Var.f(R.raw.gift_crafting, 30, 30, null);
        linearLayout6.addView(s09Var, qoe.t(30, 30, 17, 0, 0, 4, 0));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 20.0f);
        textView2.setTextColor(-1);
        textView2.setTypeface(gm.o());
        textView2.setGravity(17);
        textView2.setText(jb6.M0(2131749707, null));
        linearLayout6.addView(textView2, qoe.t(-2, -2, 17, 0, 0, 0, 0));
        this.S.addView(linearLayout6, qoe.d(-1, -2.0f, 49, 0.0f, 350.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.L = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(cmb.p1(0.5f, -1));
        textView3.setTypeface(gm.o());
        textView3.setGravity(17);
        TextView l = wi8.l(this.S, textView3, qoe.d(-1, -2.0f, 49, 0.0f, 383.0f, 0.0f, 0.0f), context);
        this.M = l;
        l.setTextSize(1, 13.0f);
        l.setTextColor(-1);
        l.setTypeface(gm.o());
        l.setGravity(17);
        l.setPadding(gm.L(9.0f), 0, gm.L(9.0f), 0);
        l.setBackground(new isa(gm.L(14.0f), cmb.p1(0.08f, -1)));
        TextView l2 = wi8.l(this.S, l, qoe.d(-2, 27.0f, 81, 0.0f, 0.0f, 0.0f, 74.0f), context);
        l2.setTextSize(1, 13.0f);
        l2.setTextColor(cmb.p1(0.5f, -1));
        hg9.p(l2, 17, null, 2131749708);
        TextView l3 = wi8.l(this.S, l2, qoe.d(-1, -2.0f, 81, 42.0f, 0.0f, 42.0f, 24.0f), context);
        l3.setText(jb6.M0(2131749721, null));
        l3.setTextColor(-505270);
        l3.setTextSize(1, 20.0f);
        l3.setTypeface(gm.o());
        l3.setGravity(17);
        TextView l4 = wi8.l(this.T, l3, qoe.d(-1, -2.0f, 55, 32.0f, 352.0f, 32.0f, 0.0f), context);
        this.N = l4;
        l4.setTextColor(-17253);
        l4.setTextSize(1, 13.0f);
        l4.setGravity(17);
        this.T.addView(l4, qoe.d(-1, -2.0f, 55, 32.0f, 383.0f, 32.0f, 0.0f));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.O = linearLayout7;
        linearLayout7.setOrientation(0);
        this.T.addView(linearLayout7, qoe.d(-2, -2.0f, 49, 0.0f, 250.0f, 0.0f, 0.0f));
        this.P = null;
        d(true);
    }

    public final void a(int i, long j, TLRPC.Document document, String str) {
        sra[] sraVarArr;
        this.a0 = i;
        this.b0 = j;
        this.c0 = document;
        this.d0 = str;
        this.i0 = false;
        this.k0 = false;
        int i2 = 0;
        while (true) {
            sraVarArr = this.n;
            if (i2 >= sraVarArr.length) {
                break;
            }
            sra sraVar = sraVarArr[i2];
            if (sraVar != null) {
                gm.B2(sraVar);
            }
            i2++;
        }
        ora oraVar = this.h;
        View[] viewArr = oraVar.a;
        nra nraVar = oraVar.I;
        if (nraVar != null) {
            nraVar.e = true;
            nraVar.l = false;
            nraVar.a.I = null;
            oraVar.I = null;
        }
        ValueAnimator valueAnimator = oraVar.H;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            oraVar.H = null;
        }
        oraVar.G = -1;
        oraVar.F = 0.0f;
        oraVar.w.clear();
        oraVar.x.clear();
        oraVar.y.clear();
        for (int i3 = 0; i3 < 6; i3++) {
            oraVar.E[i3] = 0.0f;
        }
        oraVar.removeAllViews();
        for (int i4 = 0; i4 < viewArr.length; i4++) {
            viewArr[i4].setAlpha(1.0f);
            viewArr[i4].setVisibility(0);
            oraVar.addView(viewArr[i4], qoe.e(nm7.s1, nm7.s1, 17));
        }
        Matrix.setIdentityM(oraVar.c, 0);
        oraVar.e = 0.0f;
        oraVar.d = 0.0f;
        oraVar.f = true;
        sra sraVar2 = new sra(getContext());
        sraVarArr[0] = sraVar2;
        addView(sraVar2, qoe.d(76, 76.0f, 49, -117.0f, 74.0f, 0.0f, 0.0f));
        sra sraVar3 = new sra(getContext());
        sraVarArr[1] = sraVar3;
        addView(sraVar3, qoe.d(76, 76.0f, 49, -117.0f, 149.0f, 0.0f, 0.0f));
        sra sraVar4 = new sra(getContext());
        sraVarArr[2] = sraVar4;
        addView(sraVar4, qoe.d(76, 76.0f, 49, 117.0f, 74.0f, 0.0f, 0.0f));
        sra sraVar5 = new sra(getContext());
        sraVarArr[3] = sraVar5;
        addView(sraVar5, qoe.d(76, 76.0f, 49, 117.0f, 149.0f, 0.0f, 0.0f));
        for (int i5 = 0; i5 < sraVarArr.length; i5++) {
            rve.a(sraVarArr[i5]);
            sraVarArr[i5].setClickable(true);
            sraVarArr[i5].setOnClickListener(new jra(this, (byte) 5));
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
        qra qraVar = this.f;
        qraVar.setVisibility(8);
        qraVar.setAlpha(0.0f);
        String M0 = jb6.M0(2131749730, null);
        io ioVar = this.I;
        ioVar.setText(M0);
        ioVar.setTranslationY(0.0f);
        this.J.setAlpha(1.0f);
        lv4.c(i).j(j, new xn1(this, j, j, (byte) 2));
    }

    public final void b(kra kraVar) {
        if (kraVar.d != null) {
            c(kraVar, gm.S2(jb6.G(Math.round(kraVar.f * 100.0f), "GiftCraftBackdropChance", kraVar.d.name)));
        } else if (kraVar.e != null) {
            c(kraVar, gm.S2(jb6.G(Math.round(kraVar.f * 100.0f), "GiftCraftSymbolChance", kraVar.e.name)));
        }
    }

    public final void c(kra kraVar, SpannableStringBuilder spannableStringBuilder) {
        hg5 hg5Var = this.U;
        if (hg5Var != null) {
            hg5Var.f(true);
            this.U = null;
        }
        if (this.i0 || this.k0) {
            return;
        }
        View view = kraVar.getParent() instanceof View ? (View) kraVar.getParent() : null;
        float x = kraVar.getX() + (view != null ? view.getX() : 0.0f);
        float y = kraVar.getY() + (view != null ? view.getY() : 0.0f);
        hg5 hg5Var2 = new hg5(getContext(), 3);
        this.U = hg5Var2;
        hg5Var2.p(true);
        this.U.t(spannableStringBuilder);
        hg5 hg5Var3 = this.U;
        hg5Var3.h = hg5.a(hg5Var3.getText(), this.U.getTextPaint());
        hg5 hg5Var4 = this.U;
        hg5Var4.L = Layout.Alignment.ALIGN_CENTER;
        hg5Var4.setPadding(gm.L(2.0f), 0, gm.L(2.0f), 0);
        addView(this.U, qoe.d(-1, 100.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        this.U.setTranslationY(y - gm.L(100.0f));
        this.U.o(0.0f, ((kraVar.getWidth() / 2.0f) + x) - gm.L(2.0f));
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
        sra[] sraVarArr;
        HashMap hashMap;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop;
        int i2;
        HashMap hashMap2;
        boolean z2;
        kra[] kraVarArr;
        TL_stars.starGiftAttributePattern stargiftattributepattern;
        LinearLayout linearLayout;
        boolean z3;
        TL_stars.StarGift starGift;
        int i3;
        int giftsSelectedCount = getGiftsSelectedCount();
        float giftsSuccessChance = getGiftsSuccessChance() / 10.0f;
        qw9 qw9Var = this.e;
        io ioVar = (io) qw9Var.b;
        boolean z4 = true;
        if (ioVar != null) {
            ioVar.c(Math.round(giftsSuccessChance) + "%", z, true);
            pra praVar = (pra) qw9Var.c;
            float f = giftsSuccessChance / 100.0f;
            praVar.d = f;
            if (!z) {
                praVar.b.e(true, f);
            }
            praVar.invalidate();
        }
        io ioVar2 = this.J;
        int i4 = 0;
        if (giftsSelectedCount <= 0) {
            if (this.n0 == null) {
                this.n0 = new SpannableStringBuilder("+");
                pn2 pn2Var = new pn2(R.drawable.filled_add_album, 0);
                pn2Var.I = 0.65f;
                pn2Var.J = 0.65f;
                SpannableStringBuilder spannableStringBuilder = this.n0;
                spannableStringBuilder.setSpan(pn2Var, 0, spannableStringBuilder.length(), 33);
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(jb6.M0(2131749729, null));
            gm.I2(spannableStringBuilder2, this.n0, "+");
            ioVar2.setText(spannableStringBuilder2);
        } else {
            ioVar2.setText(gm.S2(jb6.a0(null, null, 2131749699, bc.J0(getGiftsSuccessChance()))));
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
            xna xnaVar = this.r;
            if (firstGift != null) {
                SpannableString spannableString = new SpannableString("x");
                i = 3;
                spannableString.setSpan(new gn(this.c0, xnaVar.getPaint().getFontMetricsInt()), 0, spannableString.length(), 33);
                xnaVar.setText(TextUtils.concat(gm.S2(jb6.M0(2131749695, null)), "\n", spannableString, " ", gm.S2(jb6.a0(null, null, 2131749694, this.d0, jb6.E(firstGift.num, ',')))));
            } else {
                i = 3;
                SpannableString spannableString2 = new SpannableString("x");
                spannableString2.setSpan(new gn(this.c0, xnaVar.getPaint().getFontMetricsInt()), 0, spannableString2.length(), 33);
                xnaVar.setText(TextUtils.concat(gm.S2(jb6.M0(2131749693, null)), "\n", spannableString2, " ", gm.S2(jb6.a0(null, null, 2131749692, this.d0))));
            }
        } else {
            i = 3;
        }
        int[][] iArr3 = oc7.r1(this.a0).V3;
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        int i8 = 0;
        while (true) {
            sraVarArr = this.n;
            if (i7 >= sraVarArr.length) {
                break;
            }
            sra sraVar = sraVarArr[i7];
            if (sraVar != null) {
                TL_stars.StarGift starGift2 = sraVar.h;
                if ((starGift2 != null ? starGift2 : null) != null) {
                    i8++;
                    if (starGift2 == null) {
                        starGift2 = null;
                    }
                    TL_stars.starGiftAttributePattern stargiftattributepattern2 = (TL_stars.starGiftAttributePattern) jva.i(starGift2.attributes, TL_stars.starGiftAttributePattern.class);
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = (TL_stars.starGiftAttributeBackdrop) jva.i(starGift2.attributes, TL_stars.starGiftAttributeBackdrop.class);
                    hashMap3.put(Integer.valueOf(stargiftattributebackdrop2.backdrop_id), Integer.valueOf(((Integer) Map.-EL.getOrDefault(hashMap3, Integer.valueOf(stargiftattributebackdrop2.backdrop_id), 0)).intValue() + 1));
                    hashMap4.put(Long.valueOf(stargiftattributepattern2.document.id), Integer.valueOf(((Integer) Map.-EL.getOrDefault(hashMap4, Long.valueOf(stargiftattributepattern2.document.id), 0)).intValue() + 1));
                }
            }
            i7++;
        }
        boolean isEmpty = hashMap3.isEmpty();
        kra[] kraVarArr2 = this.y;
        if (isEmpty) {
            kra kraVar = kraVarArr2[0];
            kraVar.a(null);
            kraVar.c(true, 0.0f);
            arrayList.add(kraVar);
            for (int i9 = 1; i9 < 4; i9++) {
                kraVarArr2[i9].setVisibility(8);
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
                    if (i12 >= sraVarArr.length) {
                        stargiftattributebackdrop = null;
                        break;
                    }
                    sra sraVar2 = sraVarArr[i12];
                    if (sraVar2 != null) {
                        TL_stars.StarGift starGift3 = sraVar2.h;
                        if ((starGift3 != null ? starGift3 : null) != null) {
                            if (starGift3 == null) {
                                starGift3 = null;
                            }
                            stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) jva.i(starGift3.attributes, TL_stars.starGiftAttributeBackdrop.class);
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
                    kra kraVar2 = kraVarArr2[i11];
                    kraVar2.a(stargiftattributebackdrop);
                    i2 = size;
                    int[] iArr4 = iArr3[Utilities.j(i8 - 1, iArr3.length - 1, 0)];
                    int i13 = intValue2 - 1;
                    hashMap2 = hashMap4;
                    kraVar2.c(z5, iArr4[Utilities.j(i13, iArr4.length - 1, 0)] / 1000.0f);
                    arrayList.add(kraVar2);
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
                kraVarArr2[i14].setVisibility(8);
            }
        }
        boolean isEmpty2 = hashMap.isEmpty();
        kra[] kraVarArr3 = this.E;
        if (isEmpty2) {
            kra kraVar3 = kraVarArr3[0];
            kraVar3.b(null);
            kraVar3.c(true, 0.0f);
            arrayList.add(kraVar3);
            for (int i15 = 1; i15 < 4; i15++) {
                kraVarArr3[i15].setVisibility(8);
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
                    if (i18 >= sraVarArr.length) {
                        kraVarArr = kraVarArr3;
                        stargiftattributepattern = null;
                        break;
                    }
                    sra sraVar3 = sraVarArr[i18];
                    if (sraVar3 != null) {
                        TL_stars.StarGift starGift4 = sraVar3.h;
                        if ((starGift4 != null ? starGift4 : null) != null) {
                            if (starGift4 == null) {
                                starGift4 = null;
                            }
                            TL_stars.starGiftAttributePattern stargiftattributepattern3 = (TL_stars.starGiftAttributePattern) jva.i(starGift4.attributes, TL_stars.starGiftAttributePattern.class);
                            if (stargiftattributepattern3 != null) {
                                kraVarArr = kraVarArr3;
                                if (stargiftattributepattern3.document.id == longValue) {
                                    stargiftattributepattern = stargiftattributepattern3;
                                    break;
                                } else {
                                    i18++;
                                    kraVarArr3 = kraVarArr;
                                }
                            }
                        }
                    }
                    kraVarArr = kraVarArr3;
                    i18++;
                    kraVarArr3 = kraVarArr;
                }
                if (stargiftattributepattern != null) {
                    int i19 = i16 + 1;
                    kra kraVar4 = kraVarArr[i16];
                    kraVar4.b(stargiftattributepattern);
                    int[] iArr5 = iArr3[Utilities.j(i8 - 1, iArr3.length - 1, 0)];
                    kraVar4.c(true, iArr5[Utilities.j(intValue3 - 1, iArr5.length - 1, 0)] / 1000.0f);
                    arrayList.add(kraVar4);
                    i16 = i19;
                }
                kraVarArr3 = kraVarArr;
            }
            kra[] kraVarArr4 = kraVarArr3;
            z2 = true;
            while (i16 < 4) {
                kraVarArr4[i16].setVisibility(8);
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
            kra kraVar5 = (kra) arrayList.get(i20);
            if (!this.s || i20 < arrayList.size() / 2.0f) {
                linearLayout = this.w;
            }
            if (kraVar5.getParent() != linearLayout) {
                ViewParent parent = kraVar5.getParent();
                if (parent instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
                    boolean z6 = layoutTransition != null ? z2 : false;
                    i3 = i;
                    if (z6) {
                        layoutTransition.disableTransitionType(i3);
                    }
                    viewGroup.removeView(kraVar5);
                    if (z6) {
                        layoutTransition.enableTransitionType(i3);
                    }
                    kraVar5.animate().cancel();
                    kraVar5.clearAnimation();
                    kraVar5.setTranslationX(0.0f);
                    kraVar5.setTranslationY(0.0f);
                    kraVar5.setTranslationZ(0.0f);
                    kraVar5.setAlpha(0.0f);
                    kraVar5.setScaleX(1.0f);
                    kraVar5.setScaleY(1.0f);
                    kraVar5.setRotation(0.0f);
                    kraVar5.setRotationX(0.0f);
                    kraVar5.setRotationY(0.0f);
                } else {
                    i3 = i;
                }
                linearLayout.addView(kraVar5, qoe.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            } else {
                i3 = i;
            }
            kraVar5.setVisibility(0);
            i20++;
            i = i3;
        }
        linearLayout.animate().alpha(this.s ? 1.0f : 0.0f);
        this.F.animate().alpha(this.s ? 0.0f : this.e0 != null ? 1.0f : 0.25f);
        boolean z7 = z2;
        for (int i21 = 0; i21 < sraVarArr.length; i21++) {
            sra sraVar4 = sraVarArr[i21];
            if (sraVar4 != null) {
                TL_stars.StarGift starGift5 = sraVar4.h;
                if (starGift5 == null) {
                    starGift5 = null;
                }
                if (starGift5 != null) {
                    int i22 = R.drawable.msg_close;
                    if (z7) {
                        int i23 = i21 + 1;
                        while (true) {
                            if (i23 >= sraVarArr.length) {
                                break;
                            }
                            sra sraVar5 = sraVarArr[i23];
                            if (sraVar5 != null) {
                                starGift = sraVar5.h;
                                if ((starGift != null ? starGift : null) != null) {
                                }
                            }
                            i23++;
                        }
                        starGift = null;
                        sra sraVar6 = sraVarArr[i21];
                        boolean z8 = (starGift == null || TextUtils.isEmpty(starGift.gift_address)) ? false : z2;
                        ImageView imageView = sraVar6.f;
                        imageView.setScaleX(0.8f);
                        imageView.setScaleY(0.8f);
                        sraVar6.n = z8;
                        if (z8) {
                            i22 = R.drawable.mini_replace2;
                        }
                        imageView.setImageResource(i22);
                        z3 = false;
                    } else {
                        ImageView imageView2 = sraVar4.f;
                        imageView2.setScaleX(0.8f);
                        imageView2.setScaleY(0.8f);
                        z3 = false;
                        sraVar4.n = false;
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
            sra[] sraVarArr = this.n;
            if (i >= sraVarArr.length) {
                return null;
            }
            sra sraVar = sraVarArr[i];
            if (sraVar != null) {
                TL_stars.StarGift starGift = sraVar.h;
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
            sra[] sraVarArr = this.n;
            if (i >= sraVarArr.length) {
                return i2;
            }
            sra sraVar = sraVarArr[i];
            if (sraVar != null) {
                TL_stars.StarGift starGift = sraVar.h;
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
            sra[] sraVarArr = this.n;
            if (i >= sraVarArr.length) {
                return i2;
            }
            sra sraVar = sraVarArr[i];
            if (sraVar != null) {
                TL_stars.StarGift starGift = sraVar.h;
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

    public void setOnAddGift(jac jacVar) {
        this.g0 = jacVar;
    }

    public void setOnClose(Runnable runnable) {
        this.h0 = runnable;
    }

    public void setOnCraft(lac lacVar) {
        this.f0 = lacVar;
    }
}
