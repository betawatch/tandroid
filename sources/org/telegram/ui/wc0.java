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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class wc0 extends org.telegram.ui.Components.zu0 {
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
    public final vc0 Q;
    public boolean R;
    public final qc0 S;
    public final qc0 T;
    public final qc0 U;
    public boolean V;
    public final /* synthetic */ hf0 W;
    public final uc0 a;
    public final TextView b;
    public final nh.p c;
    public final TextView d;
    public final FrameLayout e;
    public final TextView f;
    public final FrameLayout h;
    public final ag.j3 n;
    public final ag.j3 r;
    public final TextView s;
    public final org.telegram.ui.Components.w80 w;
    public final org.telegram.ui.Components.ei0 x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public wc0(hf0 hf0Var, Context context, boolean z10) {
        super(context);
        int i10;
        this.W = hf0Var;
        this.S = new qc0(this, 4);
        this.T = new qc0(this, 6);
        this.U = new qc0(this, 7);
        this.P = z10;
        final int i11 = 1;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.ei0 ei0Var = new org.telegram.ui.Components.ei0(context);
        this.x = ei0Var;
        if (!z10 || hf0Var.F == 3) {
            ei0Var.f(R.raw.email_check_inbox, 120, 120, null);
        } else {
            ei0Var.f(R.raw.email_setup_heart, 120, 120, null);
        }
        final int i12 = 0;
        ei0Var.setAutoRepeat(false);
        frameLayout.addView(ei0Var, w7.b6.e(120, 120, 1));
        if (!org.telegram.messenger.i0.O1()) {
            Point point = org.telegram.messenger.i0.q;
            if (point.x <= point.y || org.telegram.messenger.i0.Q1()) {
                i10 = 0;
                frameLayout.setVisibility(i10);
                addView(frameLayout, w7.b6.e(-1, -2, 1));
                TextView textView = new TextView(context);
                this.b = textView;
                sc.e.t(textView, 1, 18.0f);
                textView.setText(org.telegram.messenger.cd.L0(hf0Var.F != 3 ? 2131752143 : z10 ? 2131743645 : 2131752145, null));
                textView.setGravity(17);
                textView.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
                addView(textView, w7.b6.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
                nh.p pVar = new nh.p(context, null, false);
                this.c = pVar;
                pVar.setTextSize(1, 14.0f);
                pVar.setGravity(17);
                pVar.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
                addView(pVar, w7.b6.t(-2, -2, 1, 24, 8, 24, 0));
                uc0 uc0Var = new uc0(this, context, 0);
                this.a = uc0Var;
                addView(uc0Var, w7.b6.t(-2, 42, 1, 0, !z10 ? 48 : 32, 0, 0));
                TextView textView2 = new TextView(context);
                this.d = textView2;
                textView2.setGravity(17);
                textView2.setTextSize(1, 14.0f);
                textView2.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
                textView2.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f));
                final int i13 = 2;
                textView2.setMaxLines(2);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d ");
                Drawable drawable = context.getDrawable(R.drawable.googleg_standard_color_18);
                drawable.setBounds(0, org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(27.0f));
                spannableStringBuilder.setSpan(new ImageSpan(drawable, 0), 0, 1, 33);
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.wy(i13), 1, 2, 33);
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.cd.L0(2131745339, null));
                textView2.setText(spannableStringBuilder);
                textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.tc0
                    public final /* synthetic */ wc0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i14;
                        switch (i12) {
                            case 0:
                                org.telegram.messenger.zs e = org.telegram.messenger.zs.e();
                                wc0 wc0Var = this.b;
                                e.b(new w4(wc0Var, 1), org.telegram.messenger.zs.c5);
                                Context context2 = wc0Var.getContext();
                                HashSet hashSet = new HashSet();
                                HashMap hashMap = new HashMap();
                                String str = org.telegram.messenger.v2.h;
                                n6.l.e(str);
                                hashSet.add(GoogleSignInOptions.x);
                                if (hashSet.contains(GoogleSignInOptions.E)) {
                                    Scope scope = GoogleSignInOptions.D;
                                    if (hashSet.contains(scope)) {
                                        hashSet.remove(scope);
                                    }
                                }
                                hashSet.add(GoogleSignInOptions.y);
                                com.google.android.gms.internal.clearcut.v0 a2 = w7.n9.a(context2, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                                a2.g().addOnCompleteListener(new rv(19, wc0Var, a2));
                                break;
                            case 1:
                                this.b.o();
                                break;
                            default:
                                wc0 wc0Var2 = this.b;
                                TextView textView3 = wc0Var2.f;
                                if (textView3.getVisibility() == 0 && textView3.getAlpha() == 1.0f) {
                                    wc0Var2.p(false);
                                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                    tL_auth_resendCode.phone_number = wc0Var2.L;
                                    tL_auth_resendCode.phone_code_hash = wc0Var2.M;
                                    Bundle bundle = new Bundle();
                                    bundle.putString("phone", wc0Var2.I);
                                    bundle.putString("ephone", wc0Var2.J);
                                    bundle.putString("phoneFormated", wc0Var2.L);
                                    i14 = ((org.telegram.ui.ActionBar.k2) wc0Var2.W).currentAccount;
                                    ConnectionsManager.getInstance(i14).sendRequest(tL_auth_resendCode, new aa(wc0Var2, bundle, tL_auth_resendCode, 20), 10);
                                    break;
                                }
                                break;
                        }
                    }
                });
                FrameLayout frameLayout2 = new FrameLayout(context);
                this.h = frameLayout2;
                org.telegram.messenger.i0.Y3(frameLayout2, hf0Var.F == 3 && !z10, 1.0f, true, false);
                ag.j3 j3Var = new ag.j3(context, 27);
                this.n = j3Var;
                j3Var.setText(org.telegram.messenger.cd.L0(2131748748, null));
                j3Var.setGravity(17);
                j3Var.setTextSize(1, 14.0f);
                j3Var.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f));
                j3Var.setMaxLines(2);
                j3Var.setOnClickListener(new wu(18, this, context));
                frameLayout2.addView(j3Var);
                ag.j3 j3Var2 = new ag.j3(context, 28);
                this.r = j3Var2;
                j3Var2.setGravity(17);
                j3Var2.setTextSize(1, 14.0f);
                j3Var2.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
                j3Var2.setMaxLines(3);
                j3Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.tc0
                    public final /* synthetic */ wc0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i14;
                        switch (i11) {
                            case 0:
                                org.telegram.messenger.zs e = org.telegram.messenger.zs.e();
                                wc0 wc0Var = this.b;
                                e.b(new w4(wc0Var, 1), org.telegram.messenger.zs.c5);
                                Context context2 = wc0Var.getContext();
                                HashSet hashSet = new HashSet();
                                HashMap hashMap = new HashMap();
                                String str = org.telegram.messenger.v2.h;
                                n6.l.e(str);
                                hashSet.add(GoogleSignInOptions.x);
                                if (hashSet.contains(GoogleSignInOptions.E)) {
                                    Scope scope = GoogleSignInOptions.D;
                                    if (hashSet.contains(scope)) {
                                        hashSet.remove(scope);
                                    }
                                }
                                hashSet.add(GoogleSignInOptions.y);
                                com.google.android.gms.internal.clearcut.v0 a2 = w7.n9.a(context2, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                                a2.g().addOnCompleteListener(new rv(19, wc0Var, a2));
                                break;
                            case 1:
                                this.b.o();
                                break;
                            default:
                                wc0 wc0Var2 = this.b;
                                TextView textView3 = wc0Var2.f;
                                if (textView3.getVisibility() == 0 && textView3.getAlpha() == 1.0f) {
                                    wc0Var2.p(false);
                                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                    tL_auth_resendCode.phone_number = wc0Var2.L;
                                    tL_auth_resendCode.phone_code_hash = wc0Var2.M;
                                    Bundle bundle = new Bundle();
                                    bundle.putString("phone", wc0Var2.I);
                                    bundle.putString("ephone", wc0Var2.J);
                                    bundle.putString("phoneFormated", wc0Var2.L);
                                    i14 = ((org.telegram.ui.ActionBar.k2) wc0Var2.W).currentAccount;
                                    ConnectionsManager.getInstance(i14).sendRequest(tL_auth_resendCode, new aa(wc0Var2, bundle, tL_auth_resendCode, 20), 10);
                                    break;
                                }
                                break;
                        }
                    }
                });
                j3Var2.setPadding(0, org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f));
                j3Var2.setVisibility(8);
                frameLayout2.addView(j3Var2);
                TextView textView3 = new TextView(context);
                this.f = textView3;
                textView3.setGravity(17);
                textView3.setTextSize(1, 14.0f);
                textView3.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
                textView3.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f));
                textView3.setMaxLines(2);
                textView3.setText(org.telegram.messenger.cd.L0(2131746138, null));
                textView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.tc0
                    public final /* synthetic */ wc0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i14;
                        switch (i13) {
                            case 0:
                                org.telegram.messenger.zs e = org.telegram.messenger.zs.e();
                                wc0 wc0Var = this.b;
                                e.b(new w4(wc0Var, 1), org.telegram.messenger.zs.c5);
                                Context context2 = wc0Var.getContext();
                                HashSet hashSet = new HashSet();
                                HashMap hashMap = new HashMap();
                                String str = org.telegram.messenger.v2.h;
                                n6.l.e(str);
                                hashSet.add(GoogleSignInOptions.x);
                                if (hashSet.contains(GoogleSignInOptions.E)) {
                                    Scope scope = GoogleSignInOptions.D;
                                    if (hashSet.contains(scope)) {
                                        hashSet.remove(scope);
                                    }
                                }
                                hashSet.add(GoogleSignInOptions.y);
                                com.google.android.gms.internal.clearcut.v0 a2 = w7.n9.a(context2, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                                a2.g().addOnCompleteListener(new rv(19, wc0Var, a2));
                                break;
                            case 1:
                                this.b.o();
                                break;
                            default:
                                wc0 wc0Var2 = this.b;
                                TextView textView32 = wc0Var2.f;
                                if (textView32.getVisibility() == 0 && textView32.getAlpha() == 1.0f) {
                                    wc0Var2.p(false);
                                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                    tL_auth_resendCode.phone_number = wc0Var2.L;
                                    tL_auth_resendCode.phone_code_hash = wc0Var2.M;
                                    Bundle bundle = new Bundle();
                                    bundle.putString("phone", wc0Var2.I);
                                    bundle.putString("ephone", wc0Var2.J);
                                    bundle.putString("phoneFormated", wc0Var2.L);
                                    i14 = ((org.telegram.ui.ActionBar.k2) wc0Var2.W).currentAccount;
                                    ConnectionsManager.getInstance(i14).sendRequest(tL_auth_resendCode, new aa(wc0Var2, bundle, tL_auth_resendCode, 20), 10);
                                    break;
                                }
                                break;
                        }
                    }
                });
                org.telegram.messenger.i0.Y3(textView3, false, 1.0f, true, false);
                org.telegram.ui.Components.w80 w80Var = new org.telegram.ui.Components.w80(context);
                this.w = w80Var;
                li.k.i(w80Var);
                vc0 vc0Var = new vc0(context, i12);
                this.Q = vc0Var;
                Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.text_in);
                org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.vs.e;
                loadAnimation.setInterpolator(grVar);
                vc0Var.setInAnimation(loadAnimation);
                Animation loadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.text_out);
                loadAnimation2.setInterpolator(grVar);
                vc0Var.setOutAnimation(loadAnimation2);
                FrameLayout frameLayout3 = new FrameLayout(context);
                this.e = frameLayout3;
                frameLayout3.addView(textView3, w7.b6.e(-2, -2, 17));
                vc0Var.addView(frameLayout3);
                TextView textView4 = new TextView(context);
                this.s = textView4;
                textView4.setText(org.telegram.messenger.cd.L0(2131742886, "WrongCode"));
                textView4.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
                textView4.setTextSize(1, 15.0f);
                textView4.setGravity(49);
                textView4.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f));
                vc0Var.addView(textView4);
                FrameLayout frameLayout4 = new FrameLayout(context);
                if (z10) {
                    frameLayout4.addView(vc0Var, w7.b6.e(-1, -2, 48));
                    frameLayout4.addView(frameLayout2, w7.b6.e(-1, -2, 48));
                    frameLayout4.addView(w80Var, w7.b6.d(-1, 16.0f, 17, 0.0f, 0.0f, 0.0f, 16.0f));
                    frameLayout4.addView(textView2, w7.b6.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
                } else {
                    frameLayout4.addView(vc0Var, w7.b6.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 32.0f));
                }
                addView(frameLayout4, w7.b6.l(1.0f, -1, 0));
            }
        }
        i10 = 8;
        frameLayout.setVisibility(i10);
        addView(frameLayout, w7.b6.e(-1, -2, 1));
        TextView textView5 = new TextView(context);
        this.b = textView5;
        sc.e.t(textView5, 1, 18.0f);
        textView5.setText(org.telegram.messenger.cd.L0(hf0Var.F != 3 ? 2131752143 : z10 ? 2131743645 : 2131752145, null));
        textView5.setGravity(17);
        textView5.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
        addView(textView5, w7.b6.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
        nh.p pVar2 = new nh.p(context, null, false);
        this.c = pVar2;
        pVar2.setTextSize(1, 14.0f);
        pVar2.setGravity(17);
        pVar2.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
        addView(pVar2, w7.b6.t(-2, -2, 1, 24, 8, 24, 0));
        uc0 uc0Var2 = new uc0(this, context, 0);
        this.a = uc0Var2;
        addView(uc0Var2, w7.b6.t(-2, 42, 1, 0, !z10 ? 48 : 32, 0, 0));
        TextView textView22 = new TextView(context);
        this.d = textView22;
        textView22.setGravity(17);
        textView22.setTextSize(1, 14.0f);
        textView22.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
        textView22.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f));
        final int i132 = 2;
        textView22.setMaxLines(2);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("d ");
        Drawable drawable2 = context.getDrawable(R.drawable.googleg_standard_color_18);
        drawable2.setBounds(0, org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(27.0f));
        spannableStringBuilder2.setSpan(new ImageSpan(drawable2, 0), 0, 1, 33);
        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.wy(i132), 1, 2, 33);
        spannableStringBuilder2.append((CharSequence) org.telegram.messenger.cd.L0(2131745339, null));
        textView22.setText(spannableStringBuilder2);
        textView22.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.tc0
            public final /* synthetic */ wc0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i14;
                switch (i12) {
                    case 0:
                        org.telegram.messenger.zs e = org.telegram.messenger.zs.e();
                        wc0 wc0Var = this.b;
                        e.b(new w4(wc0Var, 1), org.telegram.messenger.zs.c5);
                        Context context2 = wc0Var.getContext();
                        HashSet hashSet = new HashSet();
                        HashMap hashMap = new HashMap();
                        String str = org.telegram.messenger.v2.h;
                        n6.l.e(str);
                        hashSet.add(GoogleSignInOptions.x);
                        if (hashSet.contains(GoogleSignInOptions.E)) {
                            Scope scope = GoogleSignInOptions.D;
                            if (hashSet.contains(scope)) {
                                hashSet.remove(scope);
                            }
                        }
                        hashSet.add(GoogleSignInOptions.y);
                        com.google.android.gms.internal.clearcut.v0 a2 = w7.n9.a(context2, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                        a2.g().addOnCompleteListener(new rv(19, wc0Var, a2));
                        break;
                    case 1:
                        this.b.o();
                        break;
                    default:
                        wc0 wc0Var2 = this.b;
                        TextView textView32 = wc0Var2.f;
                        if (textView32.getVisibility() == 0 && textView32.getAlpha() == 1.0f) {
                            wc0Var2.p(false);
                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                            tL_auth_resendCode.phone_number = wc0Var2.L;
                            tL_auth_resendCode.phone_code_hash = wc0Var2.M;
                            Bundle bundle = new Bundle();
                            bundle.putString("phone", wc0Var2.I);
                            bundle.putString("ephone", wc0Var2.J);
                            bundle.putString("phoneFormated", wc0Var2.L);
                            i14 = ((org.telegram.ui.ActionBar.k2) wc0Var2.W).currentAccount;
                            ConnectionsManager.getInstance(i14).sendRequest(tL_auth_resendCode, new aa(wc0Var2, bundle, tL_auth_resendCode, 20), 10);
                            break;
                        }
                        break;
                }
            }
        });
        FrameLayout frameLayout22 = new FrameLayout(context);
        this.h = frameLayout22;
        org.telegram.messenger.i0.Y3(frameLayout22, hf0Var.F == 3 && !z10, 1.0f, true, false);
        ag.j3 j3Var3 = new ag.j3(context, 27);
        this.n = j3Var3;
        j3Var3.setText(org.telegram.messenger.cd.L0(2131748748, null));
        j3Var3.setGravity(17);
        j3Var3.setTextSize(1, 14.0f);
        j3Var3.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f));
        j3Var3.setMaxLines(2);
        j3Var3.setOnClickListener(new wu(18, this, context));
        frameLayout22.addView(j3Var3);
        ag.j3 j3Var22 = new ag.j3(context, 28);
        this.r = j3Var22;
        j3Var22.setGravity(17);
        j3Var22.setTextSize(1, 14.0f);
        j3Var22.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
        j3Var22.setMaxLines(3);
        j3Var22.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.tc0
            public final /* synthetic */ wc0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i14;
                switch (i11) {
                    case 0:
                        org.telegram.messenger.zs e = org.telegram.messenger.zs.e();
                        wc0 wc0Var = this.b;
                        e.b(new w4(wc0Var, 1), org.telegram.messenger.zs.c5);
                        Context context2 = wc0Var.getContext();
                        HashSet hashSet = new HashSet();
                        HashMap hashMap = new HashMap();
                        String str = org.telegram.messenger.v2.h;
                        n6.l.e(str);
                        hashSet.add(GoogleSignInOptions.x);
                        if (hashSet.contains(GoogleSignInOptions.E)) {
                            Scope scope = GoogleSignInOptions.D;
                            if (hashSet.contains(scope)) {
                                hashSet.remove(scope);
                            }
                        }
                        hashSet.add(GoogleSignInOptions.y);
                        com.google.android.gms.internal.clearcut.v0 a2 = w7.n9.a(context2, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                        a2.g().addOnCompleteListener(new rv(19, wc0Var, a2));
                        break;
                    case 1:
                        this.b.o();
                        break;
                    default:
                        wc0 wc0Var2 = this.b;
                        TextView textView32 = wc0Var2.f;
                        if (textView32.getVisibility() == 0 && textView32.getAlpha() == 1.0f) {
                            wc0Var2.p(false);
                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                            tL_auth_resendCode.phone_number = wc0Var2.L;
                            tL_auth_resendCode.phone_code_hash = wc0Var2.M;
                            Bundle bundle = new Bundle();
                            bundle.putString("phone", wc0Var2.I);
                            bundle.putString("ephone", wc0Var2.J);
                            bundle.putString("phoneFormated", wc0Var2.L);
                            i14 = ((org.telegram.ui.ActionBar.k2) wc0Var2.W).currentAccount;
                            ConnectionsManager.getInstance(i14).sendRequest(tL_auth_resendCode, new aa(wc0Var2, bundle, tL_auth_resendCode, 20), 10);
                            break;
                        }
                        break;
                }
            }
        });
        j3Var22.setPadding(0, org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f));
        j3Var22.setVisibility(8);
        frameLayout22.addView(j3Var22);
        TextView textView32 = new TextView(context);
        this.f = textView32;
        textView32.setGravity(17);
        textView32.setTextSize(1, 14.0f);
        textView32.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
        textView32.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f));
        textView32.setMaxLines(2);
        textView32.setText(org.telegram.messenger.cd.L0(2131746138, null));
        textView32.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.tc0
            public final /* synthetic */ wc0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i14;
                switch (i132) {
                    case 0:
                        org.telegram.messenger.zs e = org.telegram.messenger.zs.e();
                        wc0 wc0Var = this.b;
                        e.b(new w4(wc0Var, 1), org.telegram.messenger.zs.c5);
                        Context context2 = wc0Var.getContext();
                        HashSet hashSet = new HashSet();
                        HashMap hashMap = new HashMap();
                        String str = org.telegram.messenger.v2.h;
                        n6.l.e(str);
                        hashSet.add(GoogleSignInOptions.x);
                        if (hashSet.contains(GoogleSignInOptions.E)) {
                            Scope scope = GoogleSignInOptions.D;
                            if (hashSet.contains(scope)) {
                                hashSet.remove(scope);
                            }
                        }
                        hashSet.add(GoogleSignInOptions.y);
                        com.google.android.gms.internal.clearcut.v0 a2 = w7.n9.a(context2, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                        a2.g().addOnCompleteListener(new rv(19, wc0Var, a2));
                        break;
                    case 1:
                        this.b.o();
                        break;
                    default:
                        wc0 wc0Var2 = this.b;
                        TextView textView322 = wc0Var2.f;
                        if (textView322.getVisibility() == 0 && textView322.getAlpha() == 1.0f) {
                            wc0Var2.p(false);
                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                            tL_auth_resendCode.phone_number = wc0Var2.L;
                            tL_auth_resendCode.phone_code_hash = wc0Var2.M;
                            Bundle bundle = new Bundle();
                            bundle.putString("phone", wc0Var2.I);
                            bundle.putString("ephone", wc0Var2.J);
                            bundle.putString("phoneFormated", wc0Var2.L);
                            i14 = ((org.telegram.ui.ActionBar.k2) wc0Var2.W).currentAccount;
                            ConnectionsManager.getInstance(i14).sendRequest(tL_auth_resendCode, new aa(wc0Var2, bundle, tL_auth_resendCode, 20), 10);
                            break;
                        }
                        break;
                }
            }
        });
        org.telegram.messenger.i0.Y3(textView32, false, 1.0f, true, false);
        org.telegram.ui.Components.w80 w80Var2 = new org.telegram.ui.Components.w80(context);
        this.w = w80Var2;
        li.k.i(w80Var2);
        vc0 vc0Var2 = new vc0(context, i12);
        this.Q = vc0Var2;
        Animation loadAnimation3 = AnimationUtils.loadAnimation(context, R.anim.text_in);
        org.telegram.ui.Components.gr grVar2 = org.telegram.ui.Components.vs.e;
        loadAnimation3.setInterpolator(grVar2);
        vc0Var2.setInAnimation(loadAnimation3);
        Animation loadAnimation22 = AnimationUtils.loadAnimation(context, R.anim.text_out);
        loadAnimation22.setInterpolator(grVar2);
        vc0Var2.setOutAnimation(loadAnimation22);
        FrameLayout frameLayout32 = new FrameLayout(context);
        this.e = frameLayout32;
        frameLayout32.addView(textView32, w7.b6.e(-2, -2, 17));
        vc0Var2.addView(frameLayout32);
        TextView textView42 = new TextView(context);
        this.s = textView42;
        textView42.setText(org.telegram.messenger.cd.L0(2131742886, "WrongCode"));
        textView42.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
        textView42.setTextSize(1, 15.0f);
        textView42.setGravity(49);
        textView42.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f));
        vc0Var2.addView(textView42);
        FrameLayout frameLayout42 = new FrameLayout(context);
        if (z10) {
        }
        addView(frameLayout42, w7.b6.l(1.0f, -1, 0));
    }

    @Override // org.telegram.ui.Components.zu0
    public final void g() {
        if (this.H != 0) {
            org.telegram.messenger.i0.r(this.U);
        }
    }

    @Override // org.telegram.ui.Components.zu0
    public String getHeaderName() {
        return org.telegram.messenger.cd.L0(2131743645, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.zu0
    public final void h(String str) {
        TLRPC.TL_auth_signIn tL_auth_signIn;
        int i10;
        if (this.E) {
            return;
        }
        org.telegram.messenger.i0.r(this.T);
        uc0 uc0Var = this.a;
        uc0Var.e = true;
        bs[] bsVarArr = uc0Var.f;
        if (bsVarArr != null) {
            for (bs bsVar : bsVarArr) {
                bsVar.A(0.0f);
            }
        }
        String code = uc0Var.getCode();
        int length = code.length();
        hf0 hf0Var = this.W;
        if (length == 0 && this.F == null) {
            if (hf0Var.getParentActivity() == null) {
                return;
            }
            try {
                uc0Var.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            for (bs bsVar2 : uc0Var.f) {
                bsVar2.z(1.0f);
            }
            uc0Var.f[0].requestFocus();
            org.telegram.messenger.i0.F3(10.0f, uc0Var, new qc0(this, 1));
            return;
        }
        this.E = true;
        hf0Var.v1(0, true);
        if (hf0Var.F == 3) {
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
                tL_emailVerificationGoogle.token = this.F.c;
                tL_auth_signIn2.email_verification = tL_emailVerificationGoogle;
            } else {
                TLRPC.TL_emailVerificationCode tL_emailVerificationCode3 = new TLRPC.TL_emailVerificationCode();
                tL_emailVerificationCode3.code = code;
                tL_auth_signIn2.email_verification = tL_emailVerificationCode3;
            }
            tL_auth_signIn2.flags = 2 | tL_auth_signIn2.flags;
            tL_auth_signIn = tL_auth_signIn2;
        }
        uc0Var.e = true;
        bs[] bsVarArr2 = uc0Var.f;
        if (bsVarArr2 != null) {
            for (bs bsVar3 : bsVarArr2) {
                bsVar3.A(0.0f);
            }
        }
        i10 = ((org.telegram.ui.ActionBar.k2) hf0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_signIn, new nc0(this, code, 0), 10);
    }

    @Override // org.telegram.ui.Components.zu0
    public final void j() {
        if (this.y) {
            this.y = false;
        } else {
            org.telegram.messenger.i0.h3(new qc0(this, 8), hf0.y0);
        }
    }

    @Override // org.telegram.ui.Components.zu0
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

    @Override // org.telegram.ui.Components.zu0
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

    @Override // org.telegram.ui.Components.zu0
    public final void m(Bundle bundle, boolean z10) {
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
        hf0 hf0Var = this.W;
        int i10 = hf0Var.F;
        int i11 = 8;
        FrameLayout frameLayout = this.h;
        nh.p pVar = this.c;
        if (i10 == 3) {
            pVar.setText(org.telegram.messenger.cd.a0(null, null, 2131752142, this.K));
            org.telegram.messenger.i0.Y3(frameLayout, false, 1.0f, true, false);
        } else if (this.P) {
            pVar.setText(org.telegram.messenger.cd.a0(null, null, 2131743644, this.K));
            org.telegram.messenger.i0.Y3(frameLayout, false, 1.0f, true, false);
        } else {
            org.telegram.messenger.i0.Y3(frameLayout, true, 1.0f, true, false);
            this.n.setVisibility(this.H == 0 ? 0 : 8);
            this.r.setVisibility(this.H != 0 ? 0 : 8);
            if (this.H != 0) {
                q();
            }
        }
        int i12 = this.O;
        uc0 uc0Var = this.a;
        uc0Var.b(i12, 1);
        for (bs bsVar : uc0Var.f) {
            bsVar.setShowSoftInputOnFocusCompat(org.telegram.messenger.i0.C1());
            bsVar.addTextChangedListener(new n0(this, 9));
            bsVar.setOnFocusChangeListener(new od(this, 2));
        }
        uc0Var.setText("");
        if (!this.N && hf0Var.F != 3) {
            String string = this.D.getString("emailPattern");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            int indexOf = string.indexOf(42);
            int lastIndexOf = string.lastIndexOf(42);
            if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                org.telegram.ui.Components.yz0 yz0Var = new org.telegram.ui.Components.yz0();
                yz0Var.a |= 256;
                yz0Var.b = indexOf;
                int i13 = lastIndexOf + 1;
                yz0Var.c = i13;
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.zz0(yz0Var, 0), indexOf, i13, 0);
            }
            pVar.setText(org.telegram.messenger.i0.m0(org.telegram.messenger.cd.L0(2131752144, null), spannableStringBuilder));
        }
        if (bundle.getBoolean("googleSignInAllowed") && org.telegram.messenger.eu.b.hasServices()) {
            i11 = 0;
        }
        this.w.setVisibility(i11);
        this.d.setVisibility(i11);
        hf0.Z0(hf0Var, uc0Var.f[0]);
        uc0Var.requestFocus();
        if (!z10 && bundle.containsKey("nextType")) {
            org.telegram.messenger.i0.h3(this.T, bundle.getInt("timeout"));
        }
        if (this.H != 0) {
            org.telegram.messenger.i0.h3(this.U, 1000L);
        }
    }

    public final void n(Runnable runnable) {
        if (this.F != null) {
            runnable.run();
            return;
        }
        int i10 = 0;
        while (true) {
            uc0 uc0Var = this.a;
            if (i10 >= uc0Var.f.length) {
                uc0Var.postDelayed(new f70(17, this, runnable), (r2.length * 75) + 400);
                return;
            } else {
                uc0Var.postDelayed(new org.telegram.ui.Components.qq(this, i10, 13), i10 * 75);
                i10++;
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
        this.W.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new oc0(this, bundle, tL_auth_resetLoginEmail, 0), 10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.S);
        removeCallbacks(this.T);
    }

    public final void p(boolean z10) {
        org.telegram.messenger.i0.W3(this.f, z10);
        org.telegram.messenger.i0.W3(this.h, (z10 || this.W.F == 3 || this.P) ? false : true);
        org.telegram.ui.Components.w80 w80Var = this.w;
        if (w80Var.getVisibility() != 8) {
            w80Var.setLayoutParams(w7.b6.d(-1, 16.0f, 17, 0.0f, 0.0f, 0.0f, z10 ? 8.0f : 16.0f));
            w80Var.requestLayout();
        }
    }

    public final void q() {
        String a02;
        int currentTimeMillis = (int) (this.H - (System.currentTimeMillis() / 1000));
        int i10 = this.H;
        int i11 = 0;
        ag.j3 j3Var = this.r;
        if (i10 <= 0 || currentTimeMillis <= 0) {
            j3Var.setVisibility(0);
            j3Var.setText(org.telegram.messenger.cd.L0(2131748742, null));
            org.telegram.messenger.i0.h3(new qc0(this, i11), 1000L);
            return;
        }
        int i12 = currentTimeMillis / 86400;
        int i13 = currentTimeMillis % 86400;
        int i14 = i13 / 3600;
        int i15 = i13 % 3600;
        int i16 = i15 / 60;
        int i17 = i15 % 60;
        if (i14 >= 16) {
            i12++;
        }
        if (i12 != 0) {
            a02 = org.telegram.messenger.cd.a0(null, null, 2131748745, org.telegram.messenger.cd.G(i12, "Days", new Object[0]));
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i14 != 0 ? String.format(Locale.ROOT, "%02d:", Integer.valueOf(i14)) : "");
            Locale locale = Locale.ROOT;
            sb2.append(String.format(locale, "%02d:", Integer.valueOf(i16)));
            sb2.append(String.format(locale, "%02d", Integer.valueOf(i17)));
            a02 = org.telegram.messenger.cd.a0(null, null, 2131748745, sb2.toString());
        }
        String a03 = org.telegram.messenger.cd.a0(null, null, 2131748744, a02);
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(a03);
        int indexOf = a03.indexOf(42);
        int lastIndexOf = a03.lastIndexOf(42);
        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
            valueOf.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
            valueOf.replace(indexOf, indexOf + 1, (CharSequence) "");
            valueOf.setSpan(new org.telegram.ui.Components.l00(org.telegram.ui.ActionBar.t6.q6, this.W.getResourceProvider()), indexOf, lastIndexOf - 1, 33);
        }
        j3Var.setText(valueOf);
        org.telegram.messenger.i0.h3(this.U, 1000L);
    }

    @Override // org.telegram.ui.Components.zu0
    public final void updateColors() {
        this.b.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false));
        int i10 = org.telegram.ui.ActionBar.t6.D6;
        this.c.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i10, false));
        int i11 = org.telegram.ui.ActionBar.t6.q6;
        this.d.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i11, false));
        this.w.updateColors();
        this.f.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i11, false));
        this.n.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i11, false));
        this.r.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i10, false));
        this.s.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.q7, false));
        this.a.invalidate();
    }
}
