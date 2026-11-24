// default package

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
import org.telegram.messenger.b;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ze6 extends kla {
    public Bundle E;
    public boolean F;
    public GoogleSignInAccount G;
    public int H;
    public int I;
    public String J;
    public String K;
    public String L;
    public String M;
    public String N;
    public boolean O;
    public int P;
    public final boolean Q;
    public final ye6 R;
    public boolean S;
    public final te6 T;
    public final te6 U;
    public final te6 V;
    public boolean W;
    public final xe6 a;
    public final /* synthetic */ mh6 a0;
    public final TextView b;
    public final xna c;
    public final TextView d;
    public final FrameLayout e;
    public final TextView f;
    public final FrameLayout h;
    public final wb n;
    public final wb r;
    public final TextView s;
    public final nh6 w;
    public final s09 x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ze6(mh6 mh6Var, Context context, boolean z) {
        super(context);
        int i;
        this.a0 = mh6Var;
        this.T = new te6(this, (byte) 4);
        this.U = new te6(this, (byte) 6);
        this.V = new te6(this, (byte) 7);
        this.Q = z;
        final byte b = 1;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        s09 s09Var = new s09(context);
        this.x = s09Var;
        if (!z || mh6Var.G == 3) {
            s09Var.f(R.raw.email_check_inbox, nm7.E1, nm7.E1, null);
        } else {
            s09Var.f(R.raw.email_setup_heart, nm7.E1, nm7.E1, null);
        }
        final byte b2 = 0;
        s09Var.setAutoRepeat(false);
        frameLayout.addView(s09Var, qoe.e(nm7.E1, nm7.E1, 1));
        if (!gm.M1()) {
            Point point = gm.q;
            if (point.x <= point.y || gm.O1()) {
                i = 0;
                frameLayout.setVisibility(i);
                addView(frameLayout, qoe.e(-1, -2, 1));
                TextView textView = new TextView(context);
                this.b = textView;
                ts2.s(textView, 1, 18.0f);
                textView.setText(jb6.M0(mh6Var.G != 3 ? 2131752080 : z ? 2131743306 : 2131752082, null));
                textView.setGravity(17);
                textView.setLineSpacing(gm.L(2.0f), 1.0f);
                addView(textView, qoe.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
                xna xnaVar = new xna(null, context, false);
                this.c = xnaVar;
                xnaVar.setTextSize(1, 14.0f);
                xnaVar.setGravity(17);
                xnaVar.setLineSpacing(gm.L(2.0f), 1.0f);
                addView(xnaVar, qoe.t(-2, -2, 1, 24, 8, 24, 0));
                xe6 xe6Var = new xe6((byte) 0, context, this);
                this.a = xe6Var;
                addView(xe6Var, qoe.t(-2, 42, 1, 0, !z ? 48 : 32, 0, 0));
                TextView textView2 = new TextView(context);
                this.d = textView2;
                textView2.setGravity(17);
                textView2.setTextSize(1, 14.0f);
                textView2.setLineSpacing(gm.L(2.0f), 1.0f);
                textView2.setPadding(gm.L(16.0f), gm.L(16.0f), gm.L(16.0f), gm.L(16.0f));
                final byte b3 = 2;
                textView2.setMaxLines(2);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d ");
                Drawable drawable = context.getDrawable(R.drawable.googleg_standard_color_18);
                drawable.setBounds(0, gm.L(9.0f), gm.L(18.0f), gm.L(27.0f));
                spannableStringBuilder.setSpan(new ImageSpan(drawable, 0), 0, 1, 33);
                spannableStringBuilder.setSpan(new vy2(b3), 1, 2, 33);
                spannableStringBuilder.append((CharSequence) jb6.M0(2131745055, null));
                textView2.setText(spannableStringBuilder);
                textView2.setOnClickListener(new View.OnClickListener(this) { // from class: we6
                    public final /* synthetic */ ze6 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i2;
                        byte b4 = b2;
                        ze6 ze6Var = this.b;
                        switch (b4) {
                            case 0:
                                nm7.e().a(new xc0(ze6Var, (byte) 1), nm7.g5);
                                Context context2 = ze6Var.getContext();
                                HashSet hashSet = new HashSet();
                                HashMap hashMap = new HashMap();
                                String str = e21.h;
                                ite.f(str);
                                hashSet.add(GoogleSignInOptions.x);
                                if (hashSet.contains(GoogleSignInOptions.F)) {
                                    Scope scope = GoogleSignInOptions.E;
                                    if (hashSet.contains(scope)) {
                                        hashSet.remove(scope);
                                    }
                                }
                                hashSet.add(GoogleSignInOptions.y);
                                ua4 a = ble.a(context2, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                                a.k().addOnCompleteListener(new nv4(ze6Var, a, (byte) 18));
                                break;
                            case 1:
                                ze6Var.o();
                                break;
                            default:
                                TextView textView3 = ze6Var.f;
                                if (textView3.getVisibility() == 0 && textView3.getAlpha() == 1.0f) {
                                    ze6Var.p(false);
                                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                    tL_auth_resendCode.phone_number = ze6Var.M;
                                    tL_auth_resendCode.phone_code_hash = ze6Var.N;
                                    Bundle bundle = new Bundle();
                                    bundle.putString("phone", ze6Var.J);
                                    bundle.putString("ephone", ze6Var.K);
                                    bundle.putString("phoneFormated", ze6Var.M);
                                    i2 = ((d) ze6Var.a0).currentAccount;
                                    ConnectionsManager.getInstance(i2).sendRequest(tL_auth_resendCode, new i65(ze6Var, bundle, tL_auth_resendCode, (byte) 7), 10);
                                    break;
                                }
                                break;
                        }
                    }
                });
                FrameLayout frameLayout2 = new FrameLayout(context);
                this.h = frameLayout2;
                gm.T3(frameLayout2, mh6Var.G == 3 && !z, 1.0f, true, false);
                wb wbVar = new wb(context, (byte) 24);
                this.n = wbVar;
                wbVar.setText(jb6.M0(2131748494, null));
                wbVar.setGravity(17);
                wbVar.setTextSize(1, 14.0f);
                wbVar.setPadding(gm.L(16.0f), gm.L(16.0f), gm.L(16.0f), gm.L(16.0f));
                wbVar.setMaxLines(2);
                wbVar.setOnClickListener(new n06(this, context, (byte) 5));
                frameLayout2.addView(wbVar);
                wb wbVar2 = new wb(context, (byte) 25);
                this.r = wbVar2;
                wbVar2.setGravity(17);
                wbVar2.setTextSize(1, 14.0f);
                wbVar2.setLineSpacing(gm.L(2.0f), 1.0f);
                wbVar2.setMaxLines(3);
                wbVar2.setOnClickListener(new View.OnClickListener(this) { // from class: we6
                    public final /* synthetic */ ze6 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i2;
                        byte b4 = b;
                        ze6 ze6Var = this.b;
                        switch (b4) {
                            case 0:
                                nm7.e().a(new xc0(ze6Var, (byte) 1), nm7.g5);
                                Context context2 = ze6Var.getContext();
                                HashSet hashSet = new HashSet();
                                HashMap hashMap = new HashMap();
                                String str = e21.h;
                                ite.f(str);
                                hashSet.add(GoogleSignInOptions.x);
                                if (hashSet.contains(GoogleSignInOptions.F)) {
                                    Scope scope = GoogleSignInOptions.E;
                                    if (hashSet.contains(scope)) {
                                        hashSet.remove(scope);
                                    }
                                }
                                hashSet.add(GoogleSignInOptions.y);
                                ua4 a = ble.a(context2, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                                a.k().addOnCompleteListener(new nv4(ze6Var, a, (byte) 18));
                                break;
                            case 1:
                                ze6Var.o();
                                break;
                            default:
                                TextView textView3 = ze6Var.f;
                                if (textView3.getVisibility() == 0 && textView3.getAlpha() == 1.0f) {
                                    ze6Var.p(false);
                                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                    tL_auth_resendCode.phone_number = ze6Var.M;
                                    tL_auth_resendCode.phone_code_hash = ze6Var.N;
                                    Bundle bundle = new Bundle();
                                    bundle.putString("phone", ze6Var.J);
                                    bundle.putString("ephone", ze6Var.K);
                                    bundle.putString("phoneFormated", ze6Var.M);
                                    i2 = ((d) ze6Var.a0).currentAccount;
                                    ConnectionsManager.getInstance(i2).sendRequest(tL_auth_resendCode, new i65(ze6Var, bundle, tL_auth_resendCode, (byte) 7), 10);
                                    break;
                                }
                                break;
                        }
                    }
                });
                wbVar2.setPadding(0, gm.L(16.0f), 0, gm.L(16.0f));
                wbVar2.setVisibility(8);
                frameLayout2.addView(wbVar2);
                TextView textView3 = new TextView(context);
                this.f = textView3;
                textView3.setGravity(17);
                textView3.setTextSize(1, 14.0f);
                textView3.setLineSpacing(gm.L(2.0f), 1.0f);
                textView3.setPadding(gm.L(16.0f), gm.L(16.0f), gm.L(16.0f), gm.L(16.0f));
                textView3.setMaxLines(2);
                textView3.setText(jb6.M0(2131745854, null));
                textView3.setOnClickListener(new View.OnClickListener(this) { // from class: we6
                    public final /* synthetic */ ze6 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i2;
                        byte b4 = b3;
                        ze6 ze6Var = this.b;
                        switch (b4) {
                            case 0:
                                nm7.e().a(new xc0(ze6Var, (byte) 1), nm7.g5);
                                Context context2 = ze6Var.getContext();
                                HashSet hashSet = new HashSet();
                                HashMap hashMap = new HashMap();
                                String str = e21.h;
                                ite.f(str);
                                hashSet.add(GoogleSignInOptions.x);
                                if (hashSet.contains(GoogleSignInOptions.F)) {
                                    Scope scope = GoogleSignInOptions.E;
                                    if (hashSet.contains(scope)) {
                                        hashSet.remove(scope);
                                    }
                                }
                                hashSet.add(GoogleSignInOptions.y);
                                ua4 a = ble.a(context2, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                                a.k().addOnCompleteListener(new nv4(ze6Var, a, (byte) 18));
                                break;
                            case 1:
                                ze6Var.o();
                                break;
                            default:
                                TextView textView32 = ze6Var.f;
                                if (textView32.getVisibility() == 0 && textView32.getAlpha() == 1.0f) {
                                    ze6Var.p(false);
                                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                    tL_auth_resendCode.phone_number = ze6Var.M;
                                    tL_auth_resendCode.phone_code_hash = ze6Var.N;
                                    Bundle bundle = new Bundle();
                                    bundle.putString("phone", ze6Var.J);
                                    bundle.putString("ephone", ze6Var.K);
                                    bundle.putString("phoneFormated", ze6Var.M);
                                    i2 = ((d) ze6Var.a0).currentAccount;
                                    ConnectionsManager.getInstance(i2).sendRequest(tL_auth_resendCode, new i65(ze6Var, bundle, tL_auth_resendCode, (byte) 7), 10);
                                    break;
                                }
                                break;
                        }
                    }
                });
                gm.T3(textView3, false, 1.0f, true, false);
                nh6 nh6Var = new nh6(context);
                this.w = nh6Var;
                wm9.c(nh6Var);
                ye6 ye6Var = new ye6(context, b2);
                this.R = ye6Var;
                Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.text_in);
                d53 d53Var = vt3.e;
                loadAnimation.setInterpolator(d53Var);
                ye6Var.setInAnimation(loadAnimation);
                Animation loadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.text_out);
                loadAnimation2.setInterpolator(d53Var);
                ye6Var.setOutAnimation(loadAnimation2);
                FrameLayout frameLayout3 = new FrameLayout(context);
                this.e = frameLayout3;
                frameLayout3.addView(textView3, qoe.e(-2, -2, 17));
                ye6Var.addView(frameLayout3);
                TextView textView4 = new TextView(context);
                this.s = textView4;
                textView4.setText(jb6.M0(2131742524, "WrongCode"));
                textView4.setLineSpacing(gm.L(2.0f), 1.0f);
                textView4.setTextSize(1, 15.0f);
                textView4.setGravity(49);
                textView4.setPadding(gm.L(16.0f), gm.L(16.0f), gm.L(16.0f), gm.L(16.0f));
                ye6Var.addView(textView4);
                FrameLayout frameLayout4 = new FrameLayout(context);
                if (z) {
                    frameLayout4.addView(ye6Var, qoe.e(-1, -2, 48));
                    frameLayout4.addView(frameLayout2, qoe.e(-1, -2, 48));
                    frameLayout4.addView(nh6Var, qoe.d(-1, 16.0f, 17, 0.0f, 0.0f, 0.0f, 16.0f));
                    frameLayout4.addView(textView2, qoe.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
                } else {
                    frameLayout4.addView(ye6Var, qoe.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 32.0f));
                }
                addView(frameLayout4, qoe.l(1.0f, -1, 0));
            }
        }
        i = 8;
        frameLayout.setVisibility(i);
        addView(frameLayout, qoe.e(-1, -2, 1));
        TextView textView5 = new TextView(context);
        this.b = textView5;
        ts2.s(textView5, 1, 18.0f);
        textView5.setText(jb6.M0(mh6Var.G != 3 ? 2131752080 : z ? 2131743306 : 2131752082, null));
        textView5.setGravity(17);
        textView5.setLineSpacing(gm.L(2.0f), 1.0f);
        addView(textView5, qoe.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
        xna xnaVar2 = new xna(null, context, false);
        this.c = xnaVar2;
        xnaVar2.setTextSize(1, 14.0f);
        xnaVar2.setGravity(17);
        xnaVar2.setLineSpacing(gm.L(2.0f), 1.0f);
        addView(xnaVar2, qoe.t(-2, -2, 1, 24, 8, 24, 0));
        xe6 xe6Var2 = new xe6((byte) 0, context, this);
        this.a = xe6Var2;
        addView(xe6Var2, qoe.t(-2, 42, 1, 0, !z ? 48 : 32, 0, 0));
        TextView textView22 = new TextView(context);
        this.d = textView22;
        textView22.setGravity(17);
        textView22.setTextSize(1, 14.0f);
        textView22.setLineSpacing(gm.L(2.0f), 1.0f);
        textView22.setPadding(gm.L(16.0f), gm.L(16.0f), gm.L(16.0f), gm.L(16.0f));
        final byte b32 = 2;
        textView22.setMaxLines(2);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("d ");
        Drawable drawable2 = context.getDrawable(R.drawable.googleg_standard_color_18);
        drawable2.setBounds(0, gm.L(9.0f), gm.L(18.0f), gm.L(27.0f));
        spannableStringBuilder2.setSpan(new ImageSpan(drawable2, 0), 0, 1, 33);
        spannableStringBuilder2.setSpan(new vy2(b32), 1, 2, 33);
        spannableStringBuilder2.append((CharSequence) jb6.M0(2131745055, null));
        textView22.setText(spannableStringBuilder2);
        textView22.setOnClickListener(new View.OnClickListener(this) { // from class: we6
            public final /* synthetic */ ze6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2;
                byte b4 = b2;
                ze6 ze6Var = this.b;
                switch (b4) {
                    case 0:
                        nm7.e().a(new xc0(ze6Var, (byte) 1), nm7.g5);
                        Context context2 = ze6Var.getContext();
                        HashSet hashSet = new HashSet();
                        HashMap hashMap = new HashMap();
                        String str = e21.h;
                        ite.f(str);
                        hashSet.add(GoogleSignInOptions.x);
                        if (hashSet.contains(GoogleSignInOptions.F)) {
                            Scope scope = GoogleSignInOptions.E;
                            if (hashSet.contains(scope)) {
                                hashSet.remove(scope);
                            }
                        }
                        hashSet.add(GoogleSignInOptions.y);
                        ua4 a = ble.a(context2, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                        a.k().addOnCompleteListener(new nv4(ze6Var, a, (byte) 18));
                        break;
                    case 1:
                        ze6Var.o();
                        break;
                    default:
                        TextView textView32 = ze6Var.f;
                        if (textView32.getVisibility() == 0 && textView32.getAlpha() == 1.0f) {
                            ze6Var.p(false);
                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                            tL_auth_resendCode.phone_number = ze6Var.M;
                            tL_auth_resendCode.phone_code_hash = ze6Var.N;
                            Bundle bundle = new Bundle();
                            bundle.putString("phone", ze6Var.J);
                            bundle.putString("ephone", ze6Var.K);
                            bundle.putString("phoneFormated", ze6Var.M);
                            i2 = ((d) ze6Var.a0).currentAccount;
                            ConnectionsManager.getInstance(i2).sendRequest(tL_auth_resendCode, new i65(ze6Var, bundle, tL_auth_resendCode, (byte) 7), 10);
                            break;
                        }
                        break;
                }
            }
        });
        FrameLayout frameLayout22 = new FrameLayout(context);
        this.h = frameLayout22;
        gm.T3(frameLayout22, mh6Var.G == 3 && !z, 1.0f, true, false);
        wb wbVar3 = new wb(context, (byte) 24);
        this.n = wbVar3;
        wbVar3.setText(jb6.M0(2131748494, null));
        wbVar3.setGravity(17);
        wbVar3.setTextSize(1, 14.0f);
        wbVar3.setPadding(gm.L(16.0f), gm.L(16.0f), gm.L(16.0f), gm.L(16.0f));
        wbVar3.setMaxLines(2);
        wbVar3.setOnClickListener(new n06(this, context, (byte) 5));
        frameLayout22.addView(wbVar3);
        wb wbVar22 = new wb(context, (byte) 25);
        this.r = wbVar22;
        wbVar22.setGravity(17);
        wbVar22.setTextSize(1, 14.0f);
        wbVar22.setLineSpacing(gm.L(2.0f), 1.0f);
        wbVar22.setMaxLines(3);
        wbVar22.setOnClickListener(new View.OnClickListener(this) { // from class: we6
            public final /* synthetic */ ze6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2;
                byte b4 = b;
                ze6 ze6Var = this.b;
                switch (b4) {
                    case 0:
                        nm7.e().a(new xc0(ze6Var, (byte) 1), nm7.g5);
                        Context context2 = ze6Var.getContext();
                        HashSet hashSet = new HashSet();
                        HashMap hashMap = new HashMap();
                        String str = e21.h;
                        ite.f(str);
                        hashSet.add(GoogleSignInOptions.x);
                        if (hashSet.contains(GoogleSignInOptions.F)) {
                            Scope scope = GoogleSignInOptions.E;
                            if (hashSet.contains(scope)) {
                                hashSet.remove(scope);
                            }
                        }
                        hashSet.add(GoogleSignInOptions.y);
                        ua4 a = ble.a(context2, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                        a.k().addOnCompleteListener(new nv4(ze6Var, a, (byte) 18));
                        break;
                    case 1:
                        ze6Var.o();
                        break;
                    default:
                        TextView textView32 = ze6Var.f;
                        if (textView32.getVisibility() == 0 && textView32.getAlpha() == 1.0f) {
                            ze6Var.p(false);
                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                            tL_auth_resendCode.phone_number = ze6Var.M;
                            tL_auth_resendCode.phone_code_hash = ze6Var.N;
                            Bundle bundle = new Bundle();
                            bundle.putString("phone", ze6Var.J);
                            bundle.putString("ephone", ze6Var.K);
                            bundle.putString("phoneFormated", ze6Var.M);
                            i2 = ((d) ze6Var.a0).currentAccount;
                            ConnectionsManager.getInstance(i2).sendRequest(tL_auth_resendCode, new i65(ze6Var, bundle, tL_auth_resendCode, (byte) 7), 10);
                            break;
                        }
                        break;
                }
            }
        });
        wbVar22.setPadding(0, gm.L(16.0f), 0, gm.L(16.0f));
        wbVar22.setVisibility(8);
        frameLayout22.addView(wbVar22);
        TextView textView32 = new TextView(context);
        this.f = textView32;
        textView32.setGravity(17);
        textView32.setTextSize(1, 14.0f);
        textView32.setLineSpacing(gm.L(2.0f), 1.0f);
        textView32.setPadding(gm.L(16.0f), gm.L(16.0f), gm.L(16.0f), gm.L(16.0f));
        textView32.setMaxLines(2);
        textView32.setText(jb6.M0(2131745854, null));
        textView32.setOnClickListener(new View.OnClickListener(this) { // from class: we6
            public final /* synthetic */ ze6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2;
                byte b4 = b32;
                ze6 ze6Var = this.b;
                switch (b4) {
                    case 0:
                        nm7.e().a(new xc0(ze6Var, (byte) 1), nm7.g5);
                        Context context2 = ze6Var.getContext();
                        HashSet hashSet = new HashSet();
                        HashMap hashMap = new HashMap();
                        String str = e21.h;
                        ite.f(str);
                        hashSet.add(GoogleSignInOptions.x);
                        if (hashSet.contains(GoogleSignInOptions.F)) {
                            Scope scope = GoogleSignInOptions.E;
                            if (hashSet.contains(scope)) {
                                hashSet.remove(scope);
                            }
                        }
                        hashSet.add(GoogleSignInOptions.y);
                        ua4 a = ble.a(context2, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                        a.k().addOnCompleteListener(new nv4(ze6Var, a, (byte) 18));
                        break;
                    case 1:
                        ze6Var.o();
                        break;
                    default:
                        TextView textView322 = ze6Var.f;
                        if (textView322.getVisibility() == 0 && textView322.getAlpha() == 1.0f) {
                            ze6Var.p(false);
                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                            tL_auth_resendCode.phone_number = ze6Var.M;
                            tL_auth_resendCode.phone_code_hash = ze6Var.N;
                            Bundle bundle = new Bundle();
                            bundle.putString("phone", ze6Var.J);
                            bundle.putString("ephone", ze6Var.K);
                            bundle.putString("phoneFormated", ze6Var.M);
                            i2 = ((d) ze6Var.a0).currentAccount;
                            ConnectionsManager.getInstance(i2).sendRequest(tL_auth_resendCode, new i65(ze6Var, bundle, tL_auth_resendCode, (byte) 7), 10);
                            break;
                        }
                        break;
                }
            }
        });
        gm.T3(textView32, false, 1.0f, true, false);
        nh6 nh6Var2 = new nh6(context);
        this.w = nh6Var2;
        wm9.c(nh6Var2);
        ye6 ye6Var2 = new ye6(context, b2);
        this.R = ye6Var2;
        Animation loadAnimation3 = AnimationUtils.loadAnimation(context, R.anim.text_in);
        d53 d53Var2 = vt3.e;
        loadAnimation3.setInterpolator(d53Var2);
        ye6Var2.setInAnimation(loadAnimation3);
        Animation loadAnimation22 = AnimationUtils.loadAnimation(context, R.anim.text_out);
        loadAnimation22.setInterpolator(d53Var2);
        ye6Var2.setOutAnimation(loadAnimation22);
        FrameLayout frameLayout32 = new FrameLayout(context);
        this.e = frameLayout32;
        frameLayout32.addView(textView32, qoe.e(-2, -2, 17));
        ye6Var2.addView(frameLayout32);
        TextView textView42 = new TextView(context);
        this.s = textView42;
        textView42.setText(jb6.M0(2131742524, "WrongCode"));
        textView42.setLineSpacing(gm.L(2.0f), 1.0f);
        textView42.setTextSize(1, 15.0f);
        textView42.setGravity(49);
        textView42.setPadding(gm.L(16.0f), gm.L(16.0f), gm.L(16.0f), gm.L(16.0f));
        ye6Var2.addView(textView42);
        FrameLayout frameLayout42 = new FrameLayout(context);
        if (z) {
        }
        addView(frameLayout42, qoe.l(1.0f, -1, 0));
    }

    @Override // kla
    public final void g() {
        if (this.I != 0) {
            gm.r(this.V);
        }
    }

    @Override // kla
    public String getHeaderName() {
        return jb6.M0(2131743306, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kla
    public final void h(String str) {
        TLRPC.TL_auth_signIn tL_auth_signIn;
        int i;
        if (this.F) {
            return;
        }
        gm.r(this.U);
        xe6 xe6Var = this.a;
        byte b = 1;
        xe6Var.e = true;
        gl2[] gl2VarArr = xe6Var.f;
        byte b2 = 0;
        if (gl2VarArr != null) {
            for (gl2 gl2Var : gl2VarArr) {
                gl2Var.B(0.0f);
            }
        }
        String code = xe6Var.getCode();
        int length = code.length();
        mh6 mh6Var = this.a0;
        if (length == 0 && this.G == null) {
            if (mh6Var.getParentActivity() == null) {
                return;
            }
            try {
                xe6Var.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            for (gl2 gl2Var2 : xe6Var.f) {
                gl2Var2.A(1.0f);
            }
            xe6Var.f[0].requestFocus();
            gm.A3(10.0f, xe6Var, new te6(this, b));
            return;
        }
        this.F = true;
        mh6Var.B1(0, true);
        if (mh6Var.G == 3) {
            TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
            verifyemail.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            TLRPC.TL_emailVerificationCode tL_emailVerificationCode = new TLRPC.TL_emailVerificationCode();
            tL_emailVerificationCode.code = code;
            verifyemail.verification = tL_emailVerificationCode;
            tL_auth_signIn = verifyemail;
        } else if (this.O) {
            TL_account.verifyEmail verifyemail2 = new TL_account.verifyEmail();
            TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup = new TLRPC.TL_emailVerifyPurposeLoginSetup();
            tL_emailVerifyPurposeLoginSetup.phone_number = this.M;
            tL_emailVerifyPurposeLoginSetup.phone_code_hash = this.N;
            verifyemail2.purpose = tL_emailVerifyPurposeLoginSetup;
            TLRPC.TL_emailVerificationCode tL_emailVerificationCode2 = new TLRPC.TL_emailVerificationCode();
            tL_emailVerificationCode2.code = code;
            verifyemail2.verification = tL_emailVerificationCode2;
            tL_auth_signIn = verifyemail2;
        } else {
            TLRPC.TL_auth_signIn tL_auth_signIn2 = new TLRPC.TL_auth_signIn();
            tL_auth_signIn2.phone_number = this.M;
            tL_auth_signIn2.phone_code_hash = this.N;
            if (this.G != null) {
                TLRPC.TL_emailVerificationGoogle tL_emailVerificationGoogle = new TLRPC.TL_emailVerificationGoogle();
                tL_emailVerificationGoogle.token = this.G.b;
                tL_auth_signIn2.email_verification = tL_emailVerificationGoogle;
            } else {
                TLRPC.TL_emailVerificationCode tL_emailVerificationCode3 = new TLRPC.TL_emailVerificationCode();
                tL_emailVerificationCode3.code = code;
                tL_auth_signIn2.email_verification = tL_emailVerificationCode3;
            }
            tL_auth_signIn2.flags |= 2;
            tL_auth_signIn = tL_auth_signIn2;
        }
        xe6Var.e = true;
        gl2[] gl2VarArr2 = xe6Var.f;
        if (gl2VarArr2 != null) {
            for (gl2 gl2Var3 : gl2VarArr2) {
                gl2Var3.B(0.0f);
            }
        }
        i = ((d) mh6Var).currentAccount;
        ConnectionsManager.getInstance(i).sendRequest(tL_auth_signIn, new qe6(this, code, b2), 10);
    }

    @Override // kla
    public final void j() {
        if (this.y) {
            this.y = false;
        } else {
            gm.d3(new te6(this, (byte) 8), mh6.A0);
        }
    }

    @Override // kla
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("emailcode_params");
        this.E = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("emailcode_code");
        if (string != null) {
            this.a.setText(string);
        }
    }

    @Override // kla
    public final void l(Bundle bundle) {
        String code = this.a.getCode();
        if (code != null && code.length() != 0) {
            bundle.putString("emailcode_code", code);
        }
        Bundle bundle2 = this.E;
        if (bundle2 != null) {
            bundle.putBundle("emailcode_params", bundle2);
        }
    }

    @Override // kla
    public final void m(Bundle bundle, boolean z) {
        if (bundle != null) {
            this.E = bundle;
            this.M = bundle.getString("phoneFormated");
            this.N = this.E.getString("phoneHash");
            this.J = this.E.getString("phone");
            this.K = this.E.getString("ephone");
            this.O = this.E.getBoolean("setup");
            this.P = this.E.getInt("length");
            this.L = this.E.getString("email");
            this.H = this.E.getInt("resetAvailablePeriod");
            this.I = this.E.getInt("resetPendingDate");
            mh6 mh6Var = this.a0;
            byte b = mh6Var.G;
            int i = 8;
            FrameLayout frameLayout = this.h;
            xna xnaVar = this.c;
            if (b == 3) {
                xnaVar.setText(jb6.a0(null, null, 2131752079, this.L));
                gm.T3(frameLayout, false, 1.0f, true, false);
            } else if (this.Q) {
                xnaVar.setText(jb6.a0(null, null, 2131743305, this.L));
                gm.T3(frameLayout, false, 1.0f, true, false);
            } else {
                gm.T3(frameLayout, true, 1.0f, true, false);
                this.n.setVisibility(this.I == 0 ? 0 : 8);
                this.r.setVisibility(this.I != 0 ? 0 : 8);
                if (this.I != 0) {
                    q();
                }
            }
            int i2 = this.P;
            xe6 xe6Var = this.a;
            xe6Var.b(i2, 1);
            for (gl2 gl2Var : xe6Var.f) {
                gl2Var.setShowSoftInputOnFocusCompat(gm.A1());
                gl2Var.addTextChangedListener(new b7(this, (byte) 28));
                gl2Var.setOnFocusChangeListener(new tt0(this, (byte) 6));
            }
            xe6Var.setText("");
            if (!this.O && mh6Var.G != 3) {
                String string = this.E.getString("emailPattern");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int indexOf = string.indexOf(42);
                int lastIndexOf = string.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    wkb wkbVar = new wkb();
                    wkbVar.a |= 256;
                    wkbVar.b = indexOf;
                    int i3 = lastIndexOf + 1;
                    wkbVar.c = i3;
                    spannableStringBuilder.setSpan(new xkb(wkbVar, 0), indexOf, i3, 0);
                }
                xnaVar.setText(gm.m0(jb6.M0(2131752081, null), spannableStringBuilder));
            }
            if (bundle.getBoolean("googleSignInAllowed") && b.b.hasServices()) {
                i = 0;
            }
            this.w.setVisibility(i);
            this.d.setVisibility(i);
            mh6Var.M1(xe6Var.f[0]);
            xe6Var.requestFocus();
            if (!z && bundle.containsKey("nextType")) {
                gm.d3(this.U, bundle.getInt("timeout"));
            }
            if (this.I != 0) {
                gm.d3(this.V, 1000L);
            }
        }
    }

    public final void n(Runnable runnable) {
        if (this.G != null) {
            runnable.run();
            return;
        }
        int i = 0;
        while (true) {
            xe6 xe6Var = this.a;
            if (i >= xe6Var.f.length) {
                xe6Var.postDelayed(new k16(this, runnable, (byte) 16), (r2.length * 75) + 400);
                return;
            } else {
                xe6Var.postDelayed(new bm3((Object) this, i, (byte) 19), i * 75);
                i++;
            }
        }
    }

    public final void o() {
        if (this.W) {
            return;
        }
        this.W = true;
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.J);
        bundle.putString("ephone", this.K);
        bundle.putString("phoneFormated", this.M);
        TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = new TLRPC.TL_auth_resetLoginEmail();
        tL_auth_resetLoginEmail.phone_number = this.M;
        tL_auth_resetLoginEmail.phone_code_hash = this.N;
        this.a0.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new re6(this, bundle, tL_auth_resetLoginEmail, (byte) 0), 10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.T);
        removeCallbacks(this.U);
    }

    public final void p(boolean z) {
        gm.R3(this.f, z);
        gm.R3(this.h, (z || this.a0.G == 3 || this.Q) ? false : true);
        nh6 nh6Var = this.w;
        if (nh6Var.getVisibility() != 8) {
            nh6Var.setLayoutParams(qoe.d(-1, 16.0f, 17, 0.0f, 0.0f, 0.0f, z ? 8.0f : 16.0f));
            nh6Var.requestLayout();
        }
    }

    public final void q() {
        String a0;
        int currentTimeMillis = (int) (this.I - (System.currentTimeMillis() / 1000));
        int i = this.I;
        byte b = 0;
        wb wbVar = this.r;
        if (i <= 0 || currentTimeMillis <= 0) {
            wbVar.setVisibility(0);
            wbVar.setText(jb6.M0(2131748488, null));
            gm.d3(new te6(this, b), 1000L);
            return;
        }
        int i2 = currentTimeMillis / 86400;
        int i3 = currentTimeMillis % 86400;
        int i4 = i3 / 3600;
        int i5 = i3 % 3600;
        int i6 = i5 / 60;
        int i7 = i5 % 60;
        if (i4 >= 16) {
            i2++;
        }
        if (i2 != 0) {
            a0 = jb6.a0(null, null, 2131748491, jb6.G(i2, "Days", new Object[0]));
        } else {
            StringBuilder sb = new StringBuilder(i4 != 0 ? String.format(Locale.ROOT, "%02d:", Integer.valueOf(i4)) : "");
            Locale locale = Locale.ROOT;
            sb.append(String.format(locale, "%02d:", Integer.valueOf(i6)));
            sb.append(String.format(locale, "%02d", Integer.valueOf(i7)));
            a0 = jb6.a0(null, null, 2131748491, sb.toString());
        }
        String a02 = jb6.a0(null, null, 2131748490, a0);
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(a02);
        int indexOf = a02.indexOf(42);
        int lastIndexOf = a02.lastIndexOf(42);
        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
            valueOf.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
            valueOf.replace(indexOf, indexOf + 1, (CharSequence) "");
            valueOf.setSpan(new do4(cmb.p6, this.a0.getResourceProvider()), indexOf, lastIndexOf - 1, 33);
        }
        wbVar.setText(valueOf);
        gm.d3(this.V, 1000L);
    }

    @Override // kla
    public final void updateColors() {
        this.b.setTextColor(cmb.w0(null, cmb.F6, false));
        int i = cmb.C6;
        this.c.setTextColor(cmb.w0(null, i, false));
        int i2 = cmb.p6;
        this.d.setTextColor(cmb.w0(null, i2, false));
        this.w.updateColors();
        this.f.setTextColor(cmb.w0(null, i2, false));
        this.n.setTextColor(cmb.w0(null, i2, false));
        this.r.setTextColor(cmb.w0(null, i, false));
        this.s.setTextColor(cmb.w0(null, cmb.p7, false));
        this.a.invalidate();
    }
}
