package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class rb0 extends org.telegram.ui.Components.xt0 {
    public Bundle D;
    public boolean E;
    public GoogleSignInAccount F;
    public int G;
    public int H;
    public String I;
    public String J;
    public String K;
    public String L;
    public String M;
    public boolean N;
    public int O;
    public final boolean P;
    public final qb0 Q;
    public boolean R;
    public final kb0 S;
    public final kb0 T;
    public final kb0 U;
    public boolean V;
    public final /* synthetic */ fe0 W;
    public final ob0 a;
    public final TextView b;
    public final xh.l c;
    public final TextView d;
    public final FrameLayout e;
    public final TextView f;
    public final FrameLayout h;
    public final pb0 n;
    public final pb0 r;
    public final TextView s;
    public final org.telegram.ui.Components.d80 w;
    public final org.telegram.ui.Components.ch0 x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public rb0(fe0 fe0Var, Context context, boolean z9) {
        super(context);
        int i7;
        this.W = fe0Var;
        this.S = new kb0(this, 4);
        this.T = new kb0(this, 6);
        this.U = new kb0(this, 7);
        this.P = z9;
        final int i10 = 1;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.ch0 ch0Var = new org.telegram.ui.Components.ch0(context);
        this.x = ch0Var;
        if (!z9 || fe0Var.F == 3) {
            ch0Var.f(R.raw.email_check_inbox, 120, 120, null);
        } else {
            ch0Var.f(R.raw.email_setup_heart, 120, 120, null);
        }
        final int i11 = 0;
        ch0Var.setAutoRepeat(false);
        frameLayout.addView(ch0Var, c8.ha.e(120, 120, 1));
        if (!org.telegram.messenger.g0.O1()) {
            Point point = org.telegram.messenger.g0.q;
            if (point.x <= point.y || org.telegram.messenger.g0.Q1()) {
                i7 = 0;
                frameLayout.setVisibility(i7);
                addView(frameLayout, c8.ha.e(-1, -2, 1));
                TextView textView = new TextView(context);
                this.b = textView;
                com.google.android.recaptcha.internal.a.q(textView, 1, 18.0f);
                textView.setText(org.telegram.messenger.id.M0(fe0Var.F != 3 ? 2131752143 : z9 ? 2131743619 : 2131752145, null));
                textView.setGravity(17);
                textView.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                addView(textView, c8.ha.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
                xh.l lVar = new xh.l(context, null, false);
                this.c = lVar;
                lVar.setTextSize(1, 14.0f);
                lVar.setGravity(17);
                lVar.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                addView(lVar, c8.ha.t(-2, -2, 1, 24, 8, 24, 0));
                ob0 ob0Var = new ob0(0, context, this);
                this.a = ob0Var;
                addView(ob0Var, c8.ha.t(-2, 42, 1, 0, !z9 ? 48 : 32, 0, 0));
                TextView textView2 = new TextView(context);
                this.d = textView2;
                textView2.setGravity(17);
                textView2.setTextSize(1, 14.0f);
                textView2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                textView2.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
                final int i12 = 2;
                textView2.setMaxLines(2);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d ");
                Drawable drawable = context.getDrawable(R.drawable.googleg_standard_color_18);
                drawable.setBounds(0, org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(27.0f));
                spannableStringBuilder.setSpan(new ImageSpan(drawable, 0), 0, 1, 33);
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.hy(i12), 1, 2, 33);
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.id.M0(2131745321, null));
                textView2.setText(spannableStringBuilder);
                textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.nb0
                    public final /* synthetic */ rb0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i13;
                        switch (i11) {
                            case 0:
                                org.telegram.messenger.qs e10 = org.telegram.messenger.qs.e();
                                rb0 rb0Var = this.b;
                                e10.b(new x4(rb0Var, 1), org.telegram.messenger.qs.c5);
                                Context context2 = rb0Var.getContext();
                                HashSet hashSet = new HashSet();
                                HashMap hashMap = new HashMap();
                                String str = org.telegram.messenger.r2.h;
                                q6.m.e(str);
                                hashSet.add(GoogleSignInOptions.x);
                                if (hashSet.contains(GoogleSignInOptions.E)) {
                                    Scope scope = GoogleSignInOptions.D;
                                    if (hashSet.contains(scope)) {
                                        hashSet.remove(scope);
                                    }
                                }
                                hashSet.add(GoogleSignInOptions.y);
                                b9.j0 a10 = a8.u7.a(context2, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                                a10.g().addOnCompleteListener(new su(18, rb0Var, a10));
                                break;
                            case 1:
                                this.b.o();
                                break;
                            default:
                                rb0 rb0Var2 = this.b;
                                TextView textView3 = rb0Var2.f;
                                if (textView3.getVisibility() == 0 && textView3.getAlpha() == 1.0f) {
                                    rb0Var2.p(false);
                                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                    tL_auth_resendCode.phone_number = rb0Var2.L;
                                    tL_auth_resendCode.phone_code_hash = rb0Var2.M;
                                    Bundle bundle = new Bundle();
                                    bundle.putString("phone", rb0Var2.I);
                                    bundle.putString("ephone", rb0Var2.J);
                                    bundle.putString("phoneFormated", rb0Var2.L);
                                    i13 = ((org.telegram.ui.ActionBar.f2) rb0Var2.W).currentAccount;
                                    ConnectionsManager.getInstance(i13).sendRequest(tL_auth_resendCode, new z9(rb0Var2, bundle, tL_auth_resendCode, 20), 10);
                                    break;
                                }
                                break;
                        }
                    }
                });
                FrameLayout frameLayout2 = new FrameLayout(context);
                this.h = frameLayout2;
                org.telegram.messenger.g0.Z3(frameLayout2, fe0Var.F == 3 && !z9, 1.0f, true, false);
                pb0 pb0Var = new pb0(context, i11);
                this.n = pb0Var;
                pb0Var.setText(org.telegram.messenger.id.M0(2131748737, null));
                pb0Var.setGravity(17);
                pb0Var.setTextSize(1, 14.0f);
                pb0Var.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
                pb0Var.setMaxLines(2);
                pb0Var.setOnClickListener(new org.telegram.ui.Components.u41(24, this, context));
                frameLayout2.addView(pb0Var);
                pb0 pb0Var2 = new pb0(context, i10);
                this.r = pb0Var2;
                pb0Var2.setGravity(17);
                pb0Var2.setTextSize(1, 14.0f);
                pb0Var2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                pb0Var2.setMaxLines(3);
                pb0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.nb0
                    public final /* synthetic */ rb0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i13;
                        switch (i10) {
                            case 0:
                                org.telegram.messenger.qs e10 = org.telegram.messenger.qs.e();
                                rb0 rb0Var = this.b;
                                e10.b(new x4(rb0Var, 1), org.telegram.messenger.qs.c5);
                                Context context2 = rb0Var.getContext();
                                HashSet hashSet = new HashSet();
                                HashMap hashMap = new HashMap();
                                String str = org.telegram.messenger.r2.h;
                                q6.m.e(str);
                                hashSet.add(GoogleSignInOptions.x);
                                if (hashSet.contains(GoogleSignInOptions.E)) {
                                    Scope scope = GoogleSignInOptions.D;
                                    if (hashSet.contains(scope)) {
                                        hashSet.remove(scope);
                                    }
                                }
                                hashSet.add(GoogleSignInOptions.y);
                                b9.j0 a10 = a8.u7.a(context2, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                                a10.g().addOnCompleteListener(new su(18, rb0Var, a10));
                                break;
                            case 1:
                                this.b.o();
                                break;
                            default:
                                rb0 rb0Var2 = this.b;
                                TextView textView3 = rb0Var2.f;
                                if (textView3.getVisibility() == 0 && textView3.getAlpha() == 1.0f) {
                                    rb0Var2.p(false);
                                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                    tL_auth_resendCode.phone_number = rb0Var2.L;
                                    tL_auth_resendCode.phone_code_hash = rb0Var2.M;
                                    Bundle bundle = new Bundle();
                                    bundle.putString("phone", rb0Var2.I);
                                    bundle.putString("ephone", rb0Var2.J);
                                    bundle.putString("phoneFormated", rb0Var2.L);
                                    i13 = ((org.telegram.ui.ActionBar.f2) rb0Var2.W).currentAccount;
                                    ConnectionsManager.getInstance(i13).sendRequest(tL_auth_resendCode, new z9(rb0Var2, bundle, tL_auth_resendCode, 20), 10);
                                    break;
                                }
                                break;
                        }
                    }
                });
                pb0Var2.setPadding(0, org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f));
                pb0Var2.setVisibility(8);
                frameLayout2.addView(pb0Var2);
                TextView textView3 = new TextView(context);
                this.f = textView3;
                textView3.setGravity(17);
                textView3.setTextSize(1, 14.0f);
                textView3.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                textView3.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
                textView3.setMaxLines(2);
                textView3.setText(org.telegram.messenger.id.M0(2131746121, null));
                textView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.nb0
                    public final /* synthetic */ rb0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i13;
                        switch (i12) {
                            case 0:
                                org.telegram.messenger.qs e10 = org.telegram.messenger.qs.e();
                                rb0 rb0Var = this.b;
                                e10.b(new x4(rb0Var, 1), org.telegram.messenger.qs.c5);
                                Context context2 = rb0Var.getContext();
                                HashSet hashSet = new HashSet();
                                HashMap hashMap = new HashMap();
                                String str = org.telegram.messenger.r2.h;
                                q6.m.e(str);
                                hashSet.add(GoogleSignInOptions.x);
                                if (hashSet.contains(GoogleSignInOptions.E)) {
                                    Scope scope = GoogleSignInOptions.D;
                                    if (hashSet.contains(scope)) {
                                        hashSet.remove(scope);
                                    }
                                }
                                hashSet.add(GoogleSignInOptions.y);
                                b9.j0 a10 = a8.u7.a(context2, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                                a10.g().addOnCompleteListener(new su(18, rb0Var, a10));
                                break;
                            case 1:
                                this.b.o();
                                break;
                            default:
                                rb0 rb0Var2 = this.b;
                                TextView textView32 = rb0Var2.f;
                                if (textView32.getVisibility() == 0 && textView32.getAlpha() == 1.0f) {
                                    rb0Var2.p(false);
                                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                    tL_auth_resendCode.phone_number = rb0Var2.L;
                                    tL_auth_resendCode.phone_code_hash = rb0Var2.M;
                                    Bundle bundle = new Bundle();
                                    bundle.putString("phone", rb0Var2.I);
                                    bundle.putString("ephone", rb0Var2.J);
                                    bundle.putString("phoneFormated", rb0Var2.L);
                                    i13 = ((org.telegram.ui.ActionBar.f2) rb0Var2.W).currentAccount;
                                    ConnectionsManager.getInstance(i13).sendRequest(tL_auth_resendCode, new z9(rb0Var2, bundle, tL_auth_resendCode, 20), 10);
                                    break;
                                }
                                break;
                        }
                    }
                });
                org.telegram.messenger.g0.Z3(textView3, false, 1.0f, true, false);
                org.telegram.ui.Components.d80 d80Var = new org.telegram.ui.Components.d80(context);
                this.w = d80Var;
                h6.m.g(d80Var);
                qb0 qb0Var = new qb0(context, i11);
                this.Q = qb0Var;
                Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.text_in);
                org.telegram.ui.Components.wq wqVar = org.telegram.ui.Components.js.e;
                loadAnimation.setInterpolator(wqVar);
                qb0Var.setInAnimation(loadAnimation);
                Animation loadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.text_out);
                loadAnimation2.setInterpolator(wqVar);
                qb0Var.setOutAnimation(loadAnimation2);
                FrameLayout frameLayout3 = new FrameLayout(context);
                this.e = frameLayout3;
                frameLayout3.addView(textView3, c8.ha.e(-2, -2, 17));
                qb0Var.addView(frameLayout3);
                TextView textView4 = new TextView(context);
                this.s = textView4;
                textView4.setText(org.telegram.messenger.id.M0(2131742861, "WrongCode"));
                textView4.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                textView4.setTextSize(1, 15.0f);
                textView4.setGravity(49);
                textView4.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
                qb0Var.addView(textView4);
                FrameLayout frameLayout4 = new FrameLayout(context);
                if (z9) {
                    frameLayout4.addView(qb0Var, c8.ha.e(-1, -2, 48));
                    frameLayout4.addView(frameLayout2, c8.ha.e(-1, -2, 48));
                    frameLayout4.addView(d80Var, c8.ha.d(-1, 16.0f, 17, 0.0f, 0.0f, 0.0f, 16.0f));
                    frameLayout4.addView(textView2, c8.ha.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
                } else {
                    frameLayout4.addView(qb0Var, c8.ha.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 32.0f));
                }
                addView(frameLayout4, c8.ha.l(1.0f, -1, 0));
            }
        }
        i7 = 8;
        frameLayout.setVisibility(i7);
        addView(frameLayout, c8.ha.e(-1, -2, 1));
        TextView textView5 = new TextView(context);
        this.b = textView5;
        com.google.android.recaptcha.internal.a.q(textView5, 1, 18.0f);
        textView5.setText(org.telegram.messenger.id.M0(fe0Var.F != 3 ? 2131752143 : z9 ? 2131743619 : 2131752145, null));
        textView5.setGravity(17);
        textView5.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        addView(textView5, c8.ha.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
        xh.l lVar2 = new xh.l(context, null, false);
        this.c = lVar2;
        lVar2.setTextSize(1, 14.0f);
        lVar2.setGravity(17);
        lVar2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        addView(lVar2, c8.ha.t(-2, -2, 1, 24, 8, 24, 0));
        ob0 ob0Var2 = new ob0(0, context, this);
        this.a = ob0Var2;
        addView(ob0Var2, c8.ha.t(-2, 42, 1, 0, !z9 ? 48 : 32, 0, 0));
        TextView textView22 = new TextView(context);
        this.d = textView22;
        textView22.setGravity(17);
        textView22.setTextSize(1, 14.0f);
        textView22.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        textView22.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        final int i122 = 2;
        textView22.setMaxLines(2);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("d ");
        Drawable drawable2 = context.getDrawable(R.drawable.googleg_standard_color_18);
        drawable2.setBounds(0, org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(27.0f));
        spannableStringBuilder2.setSpan(new ImageSpan(drawable2, 0), 0, 1, 33);
        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.hy(i122), 1, 2, 33);
        spannableStringBuilder2.append((CharSequence) org.telegram.messenger.id.M0(2131745321, null));
        textView22.setText(spannableStringBuilder2);
        textView22.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.nb0
            public final /* synthetic */ rb0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i13;
                switch (i11) {
                    case 0:
                        org.telegram.messenger.qs e10 = org.telegram.messenger.qs.e();
                        rb0 rb0Var = this.b;
                        e10.b(new x4(rb0Var, 1), org.telegram.messenger.qs.c5);
                        Context context2 = rb0Var.getContext();
                        HashSet hashSet = new HashSet();
                        HashMap hashMap = new HashMap();
                        String str = org.telegram.messenger.r2.h;
                        q6.m.e(str);
                        hashSet.add(GoogleSignInOptions.x);
                        if (hashSet.contains(GoogleSignInOptions.E)) {
                            Scope scope = GoogleSignInOptions.D;
                            if (hashSet.contains(scope)) {
                                hashSet.remove(scope);
                            }
                        }
                        hashSet.add(GoogleSignInOptions.y);
                        b9.j0 a10 = a8.u7.a(context2, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                        a10.g().addOnCompleteListener(new su(18, rb0Var, a10));
                        break;
                    case 1:
                        this.b.o();
                        break;
                    default:
                        rb0 rb0Var2 = this.b;
                        TextView textView32 = rb0Var2.f;
                        if (textView32.getVisibility() == 0 && textView32.getAlpha() == 1.0f) {
                            rb0Var2.p(false);
                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                            tL_auth_resendCode.phone_number = rb0Var2.L;
                            tL_auth_resendCode.phone_code_hash = rb0Var2.M;
                            Bundle bundle = new Bundle();
                            bundle.putString("phone", rb0Var2.I);
                            bundle.putString("ephone", rb0Var2.J);
                            bundle.putString("phoneFormated", rb0Var2.L);
                            i13 = ((org.telegram.ui.ActionBar.f2) rb0Var2.W).currentAccount;
                            ConnectionsManager.getInstance(i13).sendRequest(tL_auth_resendCode, new z9(rb0Var2, bundle, tL_auth_resendCode, 20), 10);
                            break;
                        }
                        break;
                }
            }
        });
        FrameLayout frameLayout22 = new FrameLayout(context);
        this.h = frameLayout22;
        org.telegram.messenger.g0.Z3(frameLayout22, fe0Var.F == 3 && !z9, 1.0f, true, false);
        pb0 pb0Var3 = new pb0(context, i11);
        this.n = pb0Var3;
        pb0Var3.setText(org.telegram.messenger.id.M0(2131748737, null));
        pb0Var3.setGravity(17);
        pb0Var3.setTextSize(1, 14.0f);
        pb0Var3.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        pb0Var3.setMaxLines(2);
        pb0Var3.setOnClickListener(new org.telegram.ui.Components.u41(24, this, context));
        frameLayout22.addView(pb0Var3);
        pb0 pb0Var22 = new pb0(context, i10);
        this.r = pb0Var22;
        pb0Var22.setGravity(17);
        pb0Var22.setTextSize(1, 14.0f);
        pb0Var22.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        pb0Var22.setMaxLines(3);
        pb0Var22.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.nb0
            public final /* synthetic */ rb0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i13;
                switch (i10) {
                    case 0:
                        org.telegram.messenger.qs e10 = org.telegram.messenger.qs.e();
                        rb0 rb0Var = this.b;
                        e10.b(new x4(rb0Var, 1), org.telegram.messenger.qs.c5);
                        Context context2 = rb0Var.getContext();
                        HashSet hashSet = new HashSet();
                        HashMap hashMap = new HashMap();
                        String str = org.telegram.messenger.r2.h;
                        q6.m.e(str);
                        hashSet.add(GoogleSignInOptions.x);
                        if (hashSet.contains(GoogleSignInOptions.E)) {
                            Scope scope = GoogleSignInOptions.D;
                            if (hashSet.contains(scope)) {
                                hashSet.remove(scope);
                            }
                        }
                        hashSet.add(GoogleSignInOptions.y);
                        b9.j0 a10 = a8.u7.a(context2, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                        a10.g().addOnCompleteListener(new su(18, rb0Var, a10));
                        break;
                    case 1:
                        this.b.o();
                        break;
                    default:
                        rb0 rb0Var2 = this.b;
                        TextView textView32 = rb0Var2.f;
                        if (textView32.getVisibility() == 0 && textView32.getAlpha() == 1.0f) {
                            rb0Var2.p(false);
                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                            tL_auth_resendCode.phone_number = rb0Var2.L;
                            tL_auth_resendCode.phone_code_hash = rb0Var2.M;
                            Bundle bundle = new Bundle();
                            bundle.putString("phone", rb0Var2.I);
                            bundle.putString("ephone", rb0Var2.J);
                            bundle.putString("phoneFormated", rb0Var2.L);
                            i13 = ((org.telegram.ui.ActionBar.f2) rb0Var2.W).currentAccount;
                            ConnectionsManager.getInstance(i13).sendRequest(tL_auth_resendCode, new z9(rb0Var2, bundle, tL_auth_resendCode, 20), 10);
                            break;
                        }
                        break;
                }
            }
        });
        pb0Var22.setPadding(0, org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f));
        pb0Var22.setVisibility(8);
        frameLayout22.addView(pb0Var22);
        TextView textView32 = new TextView(context);
        this.f = textView32;
        textView32.setGravity(17);
        textView32.setTextSize(1, 14.0f);
        textView32.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        textView32.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        textView32.setMaxLines(2);
        textView32.setText(org.telegram.messenger.id.M0(2131746121, null));
        textView32.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.nb0
            public final /* synthetic */ rb0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i13;
                switch (i122) {
                    case 0:
                        org.telegram.messenger.qs e10 = org.telegram.messenger.qs.e();
                        rb0 rb0Var = this.b;
                        e10.b(new x4(rb0Var, 1), org.telegram.messenger.qs.c5);
                        Context context2 = rb0Var.getContext();
                        HashSet hashSet = new HashSet();
                        HashMap hashMap = new HashMap();
                        String str = org.telegram.messenger.r2.h;
                        q6.m.e(str);
                        hashSet.add(GoogleSignInOptions.x);
                        if (hashSet.contains(GoogleSignInOptions.E)) {
                            Scope scope = GoogleSignInOptions.D;
                            if (hashSet.contains(scope)) {
                                hashSet.remove(scope);
                            }
                        }
                        hashSet.add(GoogleSignInOptions.y);
                        b9.j0 a10 = a8.u7.a(context2, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                        a10.g().addOnCompleteListener(new su(18, rb0Var, a10));
                        break;
                    case 1:
                        this.b.o();
                        break;
                    default:
                        rb0 rb0Var2 = this.b;
                        TextView textView322 = rb0Var2.f;
                        if (textView322.getVisibility() == 0 && textView322.getAlpha() == 1.0f) {
                            rb0Var2.p(false);
                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                            tL_auth_resendCode.phone_number = rb0Var2.L;
                            tL_auth_resendCode.phone_code_hash = rb0Var2.M;
                            Bundle bundle = new Bundle();
                            bundle.putString("phone", rb0Var2.I);
                            bundle.putString("ephone", rb0Var2.J);
                            bundle.putString("phoneFormated", rb0Var2.L);
                            i13 = ((org.telegram.ui.ActionBar.f2) rb0Var2.W).currentAccount;
                            ConnectionsManager.getInstance(i13).sendRequest(tL_auth_resendCode, new z9(rb0Var2, bundle, tL_auth_resendCode, 20), 10);
                            break;
                        }
                        break;
                }
            }
        });
        org.telegram.messenger.g0.Z3(textView32, false, 1.0f, true, false);
        org.telegram.ui.Components.d80 d80Var2 = new org.telegram.ui.Components.d80(context);
        this.w = d80Var2;
        h6.m.g(d80Var2);
        qb0 qb0Var2 = new qb0(context, i11);
        this.Q = qb0Var2;
        Animation loadAnimation3 = AnimationUtils.loadAnimation(context, R.anim.text_in);
        org.telegram.ui.Components.wq wqVar2 = org.telegram.ui.Components.js.e;
        loadAnimation3.setInterpolator(wqVar2);
        qb0Var2.setInAnimation(loadAnimation3);
        Animation loadAnimation22 = AnimationUtils.loadAnimation(context, R.anim.text_out);
        loadAnimation22.setInterpolator(wqVar2);
        qb0Var2.setOutAnimation(loadAnimation22);
        FrameLayout frameLayout32 = new FrameLayout(context);
        this.e = frameLayout32;
        frameLayout32.addView(textView32, c8.ha.e(-2, -2, 17));
        qb0Var2.addView(frameLayout32);
        TextView textView42 = new TextView(context);
        this.s = textView42;
        textView42.setText(org.telegram.messenger.id.M0(2131742861, "WrongCode"));
        textView42.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        textView42.setTextSize(1, 15.0f);
        textView42.setGravity(49);
        textView42.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        qb0Var2.addView(textView42);
        FrameLayout frameLayout42 = new FrameLayout(context);
        if (z9) {
        }
        addView(frameLayout42, c8.ha.l(1.0f, -1, 0));
    }

    @Override // org.telegram.ui.Components.xt0
    public final void g() {
        if (this.H != 0) {
            org.telegram.messenger.g0.r(this.U);
        }
    }

    @Override // org.telegram.ui.Components.xt0
    public String getHeaderName() {
        return org.telegram.messenger.id.M0(2131743619, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.xt0
    public final void h(String str) {
        TLRPC.TL_auth_signIn tL_auth_signIn;
        int i7;
        if (this.E) {
            return;
        }
        org.telegram.messenger.g0.r(this.T);
        ob0 ob0Var = this.a;
        ob0Var.e = true;
        er[] erVarArr = ob0Var.f;
        if (erVarArr != null) {
            for (er erVar : erVarArr) {
                erVar.A(0.0f);
            }
        }
        String code = ob0Var.getCode();
        int length = code.length();
        fe0 fe0Var = this.W;
        if (length == 0 && this.F == null) {
            if (fe0Var.getParentActivity() == null) {
                return;
            }
            try {
                ob0Var.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            for (er erVar2 : ob0Var.f) {
                erVar2.z(1.0f);
            }
            ob0Var.f[0].requestFocus();
            org.telegram.messenger.g0.G3(10.0f, ob0Var, new kb0(this, 1));
            return;
        }
        this.E = true;
        fe0Var.F1(0, true);
        if (fe0Var.F == 3) {
            TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
            verifyemail.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            TLRPC.TL_emailVerificationCode tL_emailVerificationCode = new TLRPC.TL_emailVerificationCode();
            tL_emailVerificationCode.code = code;
            verifyemail.verification = tL_emailVerificationCode;
            tL_auth_signIn = verifyemail;
        } else if (this.N) {
            TL_account.verifyEmail verifyemail2 = new TL_account.verifyEmail();
            TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup = new TLRPC.TL_emailVerifyPurposeLoginSetup();
            tL_emailVerifyPurposeLoginSetup.phone_number = this.L;
            tL_emailVerifyPurposeLoginSetup.phone_code_hash = this.M;
            verifyemail2.purpose = tL_emailVerifyPurposeLoginSetup;
            TLRPC.TL_emailVerificationCode tL_emailVerificationCode2 = new TLRPC.TL_emailVerificationCode();
            tL_emailVerificationCode2.code = code;
            verifyemail2.verification = tL_emailVerificationCode2;
            tL_auth_signIn = verifyemail2;
        } else {
            TLRPC.TL_auth_signIn tL_auth_signIn2 = new TLRPC.TL_auth_signIn();
            tL_auth_signIn2.phone_number = this.L;
            tL_auth_signIn2.phone_code_hash = this.M;
            if (this.F != null) {
                TLRPC.TL_emailVerificationGoogle tL_emailVerificationGoogle = new TLRPC.TL_emailVerificationGoogle();
                tL_emailVerificationGoogle.token = this.F.b;
                tL_auth_signIn2.email_verification = tL_emailVerificationGoogle;
            } else {
                TLRPC.TL_emailVerificationCode tL_emailVerificationCode3 = new TLRPC.TL_emailVerificationCode();
                tL_emailVerificationCode3.code = code;
                tL_auth_signIn2.email_verification = tL_emailVerificationCode3;
            }
            tL_auth_signIn2.flags = 2 | tL_auth_signIn2.flags;
            tL_auth_signIn = tL_auth_signIn2;
        }
        ob0Var.e = true;
        er[] erVarArr2 = ob0Var.f;
        if (erVarArr2 != null) {
            for (er erVar3 : erVarArr2) {
                erVar3.A(0.0f);
            }
        }
        i7 = ((org.telegram.ui.ActionBar.f2) fe0Var).currentAccount;
        ConnectionsManager.getInstance(i7).sendRequest(tL_auth_signIn, new hb0(this, code, 0), 10);
    }

    @Override // org.telegram.ui.Components.xt0
    public final void j() {
        if (this.y) {
            this.y = false;
        } else {
            org.telegram.messenger.g0.i3(new kb0(this, 8), fe0.y0);
        }
    }

    @Override // org.telegram.ui.Components.xt0
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("emailcode_params");
        this.D = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("emailcode_code");
        if (string != null) {
            this.a.setText(string);
        }
    }

    @Override // org.telegram.ui.Components.xt0
    public final void l(Bundle bundle) {
        String code = this.a.getCode();
        if (code != null && code.length() != 0) {
            bundle.putString("emailcode_code", code);
        }
        Bundle bundle2 = this.D;
        if (bundle2 != null) {
            bundle.putBundle("emailcode_params", bundle2);
        }
    }

    @Override // org.telegram.ui.Components.xt0
    public final void m(Bundle bundle, boolean z9) {
        if (bundle == null) {
            return;
        }
        this.D = bundle;
        this.L = bundle.getString("phoneFormated");
        this.M = this.D.getString("phoneHash");
        this.I = this.D.getString("phone");
        this.J = this.D.getString("ephone");
        this.N = this.D.getBoolean("setup");
        this.O = this.D.getInt("length");
        this.K = this.D.getString("email");
        this.G = this.D.getInt("resetAvailablePeriod");
        this.H = this.D.getInt("resetPendingDate");
        fe0 fe0Var = this.W;
        int i7 = fe0Var.F;
        int i10 = 8;
        FrameLayout frameLayout = this.h;
        xh.l lVar = this.c;
        if (i7 == 3) {
            lVar.setText(org.telegram.messenger.id.a0(null, null, 2131752142, this.K));
            org.telegram.messenger.g0.Z3(frameLayout, false, 1.0f, true, false);
        } else if (this.P) {
            lVar.setText(org.telegram.messenger.id.a0(null, null, 2131743618, this.K));
            org.telegram.messenger.g0.Z3(frameLayout, false, 1.0f, true, false);
        } else {
            org.telegram.messenger.g0.Z3(frameLayout, true, 1.0f, true, false);
            this.n.setVisibility(this.H == 0 ? 0 : 8);
            this.r.setVisibility(this.H != 0 ? 0 : 8);
            if (this.H != 0) {
                q();
            }
        }
        int i11 = this.O;
        ob0 ob0Var = this.a;
        ob0Var.b(i11, 1);
        for (er erVar : ob0Var.f) {
            erVar.setShowSoftInputOnFocusCompat(org.telegram.messenger.g0.C1());
            erVar.addTextChangedListener(new m0(this, 9));
            erVar.setOnFocusChangeListener(new fd(this, 2));
        }
        ob0Var.setText("");
        if (!this.N && fe0Var.F != 3) {
            String string = this.D.getString("emailPattern");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            int indexOf = string.indexOf(42);
            int lastIndexOf = string.lastIndexOf(42);
            if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                org.telegram.ui.Components.uy0 uy0Var = new org.telegram.ui.Components.uy0();
                uy0Var.a |= 256;
                uy0Var.b = indexOf;
                int i12 = lastIndexOf + 1;
                uy0Var.c = i12;
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.vy0(uy0Var, 0), indexOf, i12, 0);
            }
            lVar.setText(org.telegram.messenger.g0.m0(org.telegram.messenger.id.M0(2131752144, null), spannableStringBuilder));
        }
        if (bundle.getBoolean("googleSignInAllowed") && org.telegram.messenger.tt.b.hasServices()) {
            i10 = 0;
        }
        this.w.setVisibility(i10);
        this.d.setVisibility(i10);
        fe0.b1(fe0Var, ob0Var.f[0]);
        ob0Var.requestFocus();
        if (!z9 && bundle.containsKey("nextType")) {
            org.telegram.messenger.g0.i3(this.T, bundle.getInt("timeout"));
        }
        if (this.H != 0) {
            org.telegram.messenger.g0.i3(this.U, 1000L);
        }
    }

    public final void n(Runnable runnable) {
        if (this.F != null) {
            runnable.run();
            return;
        }
        int i7 = 0;
        while (true) {
            ob0 ob0Var = this.a;
            if (i7 >= ob0Var.f.length) {
                ob0Var.postDelayed(new f10(25, this, runnable), (r2.length * 75) + 400);
                return;
            } else {
                ob0Var.postDelayed(new org.telegram.ui.Components.q2(this, i7, 18), i7 * 75);
                i7++;
            }
        }
    }

    public final void o() {
        if (this.V) {
            return;
        }
        this.V = true;
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.I);
        bundle.putString("ephone", this.J);
        bundle.putString("phoneFormated", this.L);
        TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = new TLRPC.TL_auth_resetLoginEmail();
        tL_auth_resetLoginEmail.phone_number = this.L;
        tL_auth_resetLoginEmail.phone_code_hash = this.M;
        this.W.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new ib0(this, bundle, tL_auth_resetLoginEmail, 0), 10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.S);
        removeCallbacks(this.T);
    }

    public final void p(boolean z9) {
        org.telegram.messenger.g0.X3(this.f, z9);
        org.telegram.messenger.g0.X3(this.h, (z9 || this.W.F == 3 || this.P) ? false : true);
        org.telegram.ui.Components.d80 d80Var = this.w;
        if (d80Var.getVisibility() != 8) {
            d80Var.setLayoutParams(c8.ha.d(-1, 16.0f, 17, 0.0f, 0.0f, 0.0f, z9 ? 8.0f : 16.0f));
            d80Var.requestLayout();
        }
    }

    public final void q() {
        String a02;
        int currentTimeMillis = (int) (this.H - (System.currentTimeMillis() / 1000));
        int i7 = this.H;
        int i10 = 0;
        pb0 pb0Var = this.r;
        if (i7 <= 0 || currentTimeMillis <= 0) {
            pb0Var.setVisibility(0);
            pb0Var.setText(org.telegram.messenger.id.M0(2131748731, null));
            org.telegram.messenger.g0.i3(new kb0(this, i10), 1000L);
            return;
        }
        int i11 = currentTimeMillis / 86400;
        int i12 = currentTimeMillis % 86400;
        int i13 = i12 / 3600;
        int i14 = i12 % 3600;
        int i15 = i14 / 60;
        int i16 = i14 % 60;
        if (i13 >= 16) {
            i11++;
        }
        if (i11 != 0) {
            a02 = org.telegram.messenger.id.a0(null, null, 2131748734, org.telegram.messenger.id.G(i11, "Days", new Object[0]));
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i13 != 0 ? String.format(Locale.ROOT, "%02d:", Integer.valueOf(i13)) : "");
            Locale locale = Locale.ROOT;
            sb2.append(String.format(locale, "%02d:", Integer.valueOf(i15)));
            sb2.append(String.format(locale, "%02d", Integer.valueOf(i16)));
            a02 = org.telegram.messenger.id.a0(null, null, 2131748734, sb2.toString());
        }
        String a03 = org.telegram.messenger.id.a0(null, null, 2131748733, a02);
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(a03);
        int indexOf = a03.indexOf(42);
        int lastIndexOf = a03.lastIndexOf(42);
        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
            valueOf.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
            valueOf.replace(indexOf, indexOf + 1, (CharSequence) "");
            valueOf.setSpan(new org.telegram.ui.Components.xz(org.telegram.ui.ActionBar.m6.q6, this.W.getResourceProvider()), indexOf, lastIndexOf - 1, 33);
        }
        pb0Var.setText(valueOf);
        org.telegram.messenger.g0.i3(this.U, 1000L);
    }

    @Override // org.telegram.ui.Components.xt0
    public final void updateColors() {
        this.b.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.G6, false));
        int i7 = org.telegram.ui.ActionBar.m6.D6;
        this.c.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i7, false));
        int i10 = org.telegram.ui.ActionBar.m6.q6;
        this.d.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i10, false));
        this.w.updateColors();
        this.f.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i10, false));
        this.n.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i10, false));
        this.r.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i7, false));
        this.s.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.q7, false));
        this.a.invalidate();
    }
}
