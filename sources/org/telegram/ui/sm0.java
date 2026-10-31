package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.telephony.TelephonyManager;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.CookieManager;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import j$.util.Objects;
import j$.util.Optional;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class sm0 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us {
    public static final List g1 = Arrays.asList("http", "https");
    public static final List h1 = Collections.singletonList("tg");
    public nt A0;
    public String B0;
    public TLRPC.PaymentForm C0;
    public boolean D;
    public final TLRPC.PaymentReceipt D0;
    public ScrollView E;
    public TLRPC.TL_payments_validatedRequestedInfo E0;
    public boolean F;
    public TLRPC.TL_paymentFormMethod F0;
    public boolean G;
    public TLRPC.TL_shippingOption G0;
    public TextView H;
    public Long H0;
    public final org.telegram.ui.Cells.p4[] I;
    public TLRPC.TL_payments_validateRequestedInfo I0;
    public final ArrayList J;
    public TLRPC.TL_inputPaymentCredentialsGooglePay J0;
    public final org.telegram.ui.Cells.c7[] K;
    public String K0;
    public org.telegram.ui.Cells.t8 L;
    public String L0;
    public final org.telegram.ui.Cells.b9[] M;
    public JSONObject M0;
    public final org.telegram.ui.Cells.x9[] N;
    public org.telegram.messenger.jj N0;
    public FrameLayout O;
    public String O0;
    public FrameLayout P;
    public boolean P0;
    public LinearLayout Q;
    public boolean Q0;
    public org.telegram.ui.Cells.c9 R;
    public String[] R0;
    public org.telegram.ui.Cells.n3 S;
    public boolean S0;
    public qm0 T;
    public boolean T0;
    public TextView U;
    public boolean U0;
    public org.telegram.ui.Cells.r6 V;
    public boolean V0;
    public om0 W;
    public boolean W0;
    public org.telegram.ui.Cells.o5 X;
    public boolean X0;
    public final org.telegram.ui.Cells.a9[] Y;
    public org.telegram.ui.ActionBar.p6 Y0;
    public float Z;
    public rm0 Z0;
    public final ArrayList a;
    public TL_account.Password a0;
    public boolean a1;
    public final HashMap b;
    public boolean b0;
    public TLRPC.InputInvoice b1;
    public final HashMap c;
    public int c0;
    public org.telegram.messenger.q20 c1;
    public final HashMap d;
    public rl0 d0;
    public org.telegram.messenger.q20 d1;
    public com.google.android.gms.internal.clearcut.v0 e;
    public boolean e0;
    public k10 e1;
    public EditTextBoldCursor[] f;
    public sm0 f0;
    public int f1;
    public boolean g0;
    public org.telegram.ui.Cells.m6[] h;
    public boolean h0;
    public boolean i0;
    public String j0;
    public boolean k0;
    public TLRPC.User l0;
    public boolean m0;
    public org.telegram.ui.ActionBar.t0 n;
    public boolean n0;
    public boolean o0;
    public String p0;
    public String q0;
    public org.telegram.ui.Components.iq r;
    public org.telegram.ui.ActionBar.k2 r0;
    public org.telegram.ui.Components.iq s;
    public xl0 s0;
    public ArrayList t0;
    public int u0;
    public boolean v0;
    public AnimatorSet w;
    public String w0;
    public WebView x;
    public String x0;
    public String y;
    public TLRPC.TL_paymentSavedCredentialsCard y0;
    public boolean z0;

    public sm0(TLRPC.InputInvoice inputInvoice, TLRPC.PaymentForm paymentForm, org.telegram.messenger.jj jjVar, String str, int i10, TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo, TLRPC.TL_shippingOption tL_shippingOption, Long l4, String str2, String str3, TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, org.telegram.ui.ActionBar.k2 k2Var, boolean z11) {
        super(null);
        this.a = new ArrayList();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.G = true;
        this.I = new org.telegram.ui.Cells.p4[3];
        this.J = new ArrayList();
        this.K = new org.telegram.ui.Cells.c7[3];
        this.M = new org.telegram.ui.Cells.b9[3];
        this.N = new org.telegram.ui.Cells.x9[2];
        this.Y = new org.telegram.ui.Cells.a9[7];
        this.Z = -4.5f;
        this.c0 = 6;
        z0(inputInvoice, paymentForm, jjVar, str, i10, tL_payments_validatedRequestedInfo, tL_shippingOption, l4, str2, str3, tL_payments_validateRequestedInfo, z10, tL_inputPaymentCredentialsGooglePay, k2Var, z11);
    }

    public static /* synthetic */ void Y(sm0 sm0Var, TL_account.Password password, byte[] bArr) {
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        byte[] c10 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow ? org.telegram.messenger.aw.c(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
        TL_account.getTmpPassword gettmppassword = new TL_account.getTmpPassword();
        gettmppassword.period = 1800;
        ul0 ul0Var = new ul0(1, sm0Var, gettmppassword);
        TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = password.current_algo;
        if (!(passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.text = "PASSWORD_HASH_INVALID";
            ul0Var.run(null, tL_error);
            return;
        }
        TLRPC.TL_inputCheckPasswordSRP d = org.telegram.messenger.aw.d(c10, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
        gettmppassword.password = d;
        if (d != null) {
            ConnectionsManager.getInstance(sm0Var.currentAccount).sendRequest(gettmppassword, ul0Var, 10);
            return;
        }
        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
        tL_error2.text = "ALGO_INVALID";
        ul0Var.run(null, tL_error2);
    }

    public static /* synthetic */ void Z(sm0 sm0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        sm0Var.I0(false);
        sm0Var.M0(true, false);
        if (tL_error != null) {
            String str = tL_error.text;
            str.getClass();
            switch (str) {
                case "ADDRESS_CITY_INVALID":
                    sm0Var.J0(2);
                    break;
                case "ADDRESS_STREET_LINE1_INVALID":
                    sm0Var.J0(0);
                    break;
                case "ADDRESS_COUNTRY_INVALID":
                    sm0Var.J0(4);
                    break;
                case "REQ_INFO_NAME_INVALID":
                    sm0Var.J0(6);
                    break;
                case "ADDRESS_POSTCODE_INVALID":
                    sm0Var.J0(5);
                    break;
                case "ADDRESS_STATE_INVALID":
                    sm0Var.J0(3);
                    break;
                case "REQ_INFO_PHONE_INVALID":
                    sm0Var.J0(9);
                    break;
                case "ADDRESS_STREET_LINE2_INVALID":
                    sm0Var.J0(1);
                    break;
                case "REQ_INFO_EMAIL_INVALID":
                    sm0Var.J0(7);
                    break;
                default:
                    org.telegram.ui.Components.s4.e0(sm0Var.currentAccount, tL_error, sm0Var, tLObject, new Object[0]);
                    break;
            }
        }
    }

    public static /* synthetic */ void a0(sm0 sm0Var, TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo) {
        sm0Var.E0 = tL_payments_validatedRequestedInfo;
        if (sm0Var.C0.saved_info != null && !sm0Var.T0) {
            TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
            tL_payments_clearSavedInfo.info = true;
            ConnectionsManager.getInstance(sm0Var.currentAccount).sendRequest(tL_payments_clearSavedInfo, new ag.c3(21), sm0Var.W0 ? 8 : 0);
        }
        sm0Var.y0();
        sm0Var.I0(false);
        sm0Var.M0(true, false);
    }

    public static /* synthetic */ void b0(sm0 sm0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        sm0Var.I0(false);
        sm0Var.M0(true, false);
        if (tL_error != null) {
            org.telegram.ui.Components.s4.e0(sm0Var.currentAccount, tL_error, sm0Var, tLObject, new Object[0]);
        }
    }

    public static /* synthetic */ void c0(sm0 sm0Var, org.telegram.ui.Components.wb wbVar, boolean z10, TLRPC.Message message) {
        wbVar.b();
        if (!z10) {
            TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
            tL_payments_getPaymentReceipt.msg_id = message.id;
            tL_payments_getPaymentReceipt.peer = org.telegram.messenger.vp.r1(sm0Var.currentAccount).l1(message.peer_id);
            ConnectionsManager.getInstance(sm0Var.currentAccount).sendRequest(tL_payments_getPaymentReceipt, new ml0(sm0Var, 0), 2);
            return;
        }
        org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
        if (T != null) {
            T.presentFragment(un.ga(message.id, org.telegram.messenger.jj.B0(message)));
        }
    }

    public static void d0(sm0 sm0Var) {
        ConnectionsManager.getInstance(sm0Var.currentAccount).sendRequest(new TL_account.resendPasswordEmail(), new ag.c3(21), sm0Var.W0 ? 8 : 0);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sm0Var.getParentActivity());
        String L0 = org.telegram.messenger.cd.L0(2131746137, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.T = L0;
        x1Var.R = org.telegram.messenger.cd.L0(R.string.AppName, null);
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), null);
        sm0Var.showDialog(x1Var);
    }

    public static /* synthetic */ void e0(sm0 sm0Var, boolean z10, String str, String str2, TL_account.updatePasswordSettings updatepasswordsettings) {
        wd wdVar = new wd(sm0Var, z10, str, 5);
        if (z10) {
            ConnectionsManager.getInstance(sm0Var.currentAccount).sendRequest(updatepasswordsettings, wdVar, 10);
            return;
        }
        byte[] h12 = org.telegram.messenger.i0.h1(str2);
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = sm0Var.a0.new_algo;
        if (!(passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.text = "PASSWORD_HASH_INVALID";
            wdVar.run(null, tL_error);
            return;
        }
        updatepasswordsettings.new_settings.new_password_hash = org.telegram.messenger.aw.b(h12, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
        if (updatepasswordsettings.new_settings.new_password_hash == null) {
            TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
            tL_error2.text = "ALGO_INVALID";
            wdVar.run(null, tL_error2);
        }
        ConnectionsManager.getInstance(sm0Var.currentAccount).sendRequest(updatepasswordsettings, wdVar, 10);
    }

    public static /* synthetic */ void f0(sm0 sm0Var, TLRPC.TL_error tL_error, TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm) {
        org.telegram.ui.Components.s4.e0(sm0Var.currentAccount, tL_error, sm0Var, tL_payments_sendPaymentForm, new Object[0]);
        sm0Var.I0(false);
        sm0Var.M0(false, false);
        sm0Var.a1 = true;
        sm0Var.f1 = 4;
        rm0 rm0Var = sm0Var.Z0;
        if (rm0Var != null) {
            rm0Var.e(4);
        }
    }

    public static void g0(sm0 sm0Var, TLObject tLObject) {
        org.telegram.ui.ActionBar.k2 Q;
        if (tLObject instanceof TLRPC.TL_payments_paymentReceiptStars) {
            rh.h8.l1(sm0Var.getParentActivity(), sm0Var.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject, sm0Var.Y0);
            return;
        }
        if (!(tLObject instanceof TLRPC.PaymentReceipt) || (Q = LaunchActivity.Q()) == null) {
            return;
        }
        org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2();
        i2Var.a = true;
        sm0 sm0Var2 = new sm0((TLRPC.PaymentReceipt) tLObject);
        sm0Var2.c1 = sm0Var.c1;
        sm0Var2.d1 = sm0Var.d1;
        Q.showAsSheet(sm0Var2, i2Var);
    }

    public static void h0(sm0 sm0Var, TLObject tLObject, TLRPC.TL_error tL_error, TL_account.getTmpPassword gettmppassword) {
        sm0Var.M0(true, false);
        sm0Var.I0(false);
        if (tLObject != null) {
            sm0Var.v0 = true;
            org.telegram.messenger.d20.i(sm0Var.currentAccount).y = (TL_account.tmpPassword) tLObject;
            org.telegram.messenger.d20.i(sm0Var.currentAccount).v(false);
            sm0Var.y0();
            return;
        }
        if (!tL_error.text.equals("PASSWORD_HASH_INVALID")) {
            org.telegram.ui.Components.s4.e0(sm0Var.currentAccount, tL_error, sm0Var, gettmppassword, new Object[0]);
            return;
        }
        try {
            sm0Var.f[1].performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        org.telegram.messenger.i0.F3(3.25f, sm0Var.f[1], null);
        sm0Var.f[1].setText("");
    }

    public static void i0(sm0 sm0Var, TLObject tLObject) {
        org.telegram.ui.ActionBar.k2 Q;
        if (tLObject instanceof TLRPC.TL_payments_paymentReceiptStars) {
            rh.h8.l1(sm0Var.getParentActivity(), sm0Var.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject, sm0Var.Y0);
            return;
        }
        if (!(tLObject instanceof TLRPC.PaymentReceipt) || (Q = LaunchActivity.Q()) == null) {
            return;
        }
        org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2();
        i2Var.a = true;
        sm0 sm0Var2 = new sm0((TLRPC.PaymentReceipt) tLObject);
        sm0Var2.c1 = sm0Var.c1;
        sm0Var2.d1 = sm0Var.d1;
        Q.showAsSheet(sm0Var2, i2Var);
    }

    public static void j0(sm0 sm0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str, TL_account.getPassword getpassword) {
        if (tL_error != null) {
            org.telegram.ui.Components.s4.e0(sm0Var.currentAccount, tL_error, sm0Var, getpassword, new Object[0]);
            sm0Var.M0(true, false);
            sm0Var.I0(false);
            return;
        }
        TL_account.Password password = (TL_account.Password) tLObject;
        if (!TwoStepVerificationActivity.m0(password, false)) {
            org.telegram.ui.Components.s4.w0(sm0Var.getParentActivity(), org.telegram.messenger.cd.L0(2131743846, null), true);
        } else if (password.has_password) {
            Utilities.e.c(new qd0(sm0Var, password, org.telegram.messenger.i0.h1(str), 17));
        } else {
            sm0Var.v0 = false;
            sm0Var.y0();
        }
    }

    public static /* synthetic */ void k0(sm0 sm0Var, org.telegram.ui.Components.wb wbVar, boolean z10, TLRPC.Message[] messageArr) {
        wbVar.b();
        if (!z10) {
            TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
            tL_payments_getPaymentReceipt.msg_id = messageArr[0].id;
            tL_payments_getPaymentReceipt.peer = org.telegram.messenger.vp.r1(sm0Var.currentAccount).l1(messageArr[0].peer_id);
            ConnectionsManager.getInstance(sm0Var.currentAccount).sendRequest(tL_payments_getPaymentReceipt, new ml0(sm0Var, 2), 2);
            return;
        }
        org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
        if (T != null) {
            T.presentFragment(un.ga(messageArr[0].id, org.telegram.messenger.jj.B0(messageArr[0])));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00cc, code lost:
    
        if (r8.phone_requested == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00d8, code lost:
    
        if (r23.J0 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00e2, code lost:
    
        if (r2.invoice.flexible != false) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void l0(sm0 sm0Var, String str, View view) {
        int i10;
        org.telegram.ui.Cells.r6 r6Var = sm0Var.V;
        if (r6Var != null && !sm0Var.F) {
            sm0Var.Z = -sm0Var.Z;
            org.telegram.messenger.i0.F3(sm0Var.Z, r6Var.getTextView(), null);
            org.telegram.messenger.i0.F3(sm0Var.Z, sm0Var.V.getCheckBox(), null);
            try {
                sm0Var.V.performHapticFeedback(3, 2);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        boolean z10 = sm0Var.V0;
        int i11 = 1;
        if (z10 && sm0Var.C0.saved_info != null && sm0Var.I0 == null) {
            sm0Var.I0(true);
            uf0 uf0Var = new uf0(15, sm0Var, view);
            if (sm0Var.Q0) {
                return;
            }
            sm0Var.M0(true, true);
            TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo = new TLRPC.TL_payments_validateRequestedInfo();
            sm0Var.I0 = tL_payments_validateRequestedInfo;
            TLRPC.InputInvoice inputInvoice = sm0Var.b1;
            if (inputInvoice != null) {
                tL_payments_validateRequestedInfo.invoice = inputInvoice;
            } else if (sm0Var.N0 != null) {
                TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
                tL_inputInvoiceMessage.peer = sm0Var.getMessagesController().l1(sm0Var.N0.k.peer_id);
                tL_inputInvoiceMessage.msg_id = sm0Var.N0.f1();
                sm0Var.I0.invoice = tL_inputInvoiceMessage;
            } else {
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
                tL_inputInvoiceSlug.slug = sm0Var.O0;
                sm0Var.I0.invoice = tL_inputInvoiceSlug;
            }
            TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo2 = sm0Var.I0;
            tL_payments_validateRequestedInfo2.save = true;
            tL_payments_validateRequestedInfo2.info = sm0Var.C0.saved_info;
            ConnectionsManager.getInstance(sm0Var.currentAccount).sendRequest(tL_payments_validateRequestedInfo2, new aa(sm0Var, uf0Var, tL_payments_validateRequestedInfo2, 29), (sm0Var.W0 ? 8 : 0) | 2);
            return;
        }
        if (z10) {
            TLRPC.PaymentForm paymentForm = sm0Var.C0;
            TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo = paymentForm.saved_info;
            if (tL_paymentRequestedInfo == null) {
                TLRPC.TL_invoice tL_invoice = paymentForm.invoice;
                if (!tL_invoice.shipping_address_requested) {
                    if (!tL_invoice.email_requested) {
                        if (!tL_invoice.name_requested) {
                        }
                    }
                }
                if (tL_paymentRequestedInfo == null) {
                    TLRPC.TL_invoice tL_invoice2 = paymentForm.invoice;
                    if (tL_invoice2.shipping_address_requested || tL_invoice2.email_requested || tL_invoice2.name_requested || tL_invoice2.phone_requested) {
                        i10 = 0;
                        if (i10 != 2 && !paymentForm.additional_methods.isEmpty()) {
                            Objects.requireNonNull(view);
                            sm0Var.L0(new org.telegram.ui.Components.zt(0, view));
                            return;
                        } else {
                            sm0 sm0Var2 = new sm0(sm0Var.b1, sm0Var.C0, sm0Var.N0, sm0Var.O0, i10, sm0Var.E0, sm0Var.G0, sm0Var.H0, sm0Var.w0, sm0Var.x0, sm0Var.I0, sm0Var.U0, null, sm0Var.r0, sm0Var.W0);
                            sm0Var2.c1 = sm0Var.c1;
                            sm0Var2.d1 = sm0Var.d1;
                            sm0Var.presentFragment(sm0Var2);
                            return;
                        }
                    }
                }
                i10 = (sm0Var.y0 == null && sm0Var.w0 == null && sm0Var.J0 == null) ? 2 : 1;
                if (i10 != 2) {
                }
                sm0 sm0Var22 = new sm0(sm0Var.b1, sm0Var.C0, sm0Var.N0, sm0Var.O0, i10, sm0Var.E0, sm0Var.G0, sm0Var.H0, sm0Var.w0, sm0Var.x0, sm0Var.I0, sm0Var.U0, null, sm0Var.r0, sm0Var.W0);
                sm0Var22.c1 = sm0Var.c1;
                sm0Var22.d1 = sm0Var.d1;
                sm0Var.presentFragment(sm0Var22);
                return;
            }
            if (sm0Var.y0 == null) {
                if (sm0Var.w0 == null) {
                }
            }
            if (sm0Var.G0 == null) {
            }
        }
        if (!sm0Var.C0.password_missing && sm0Var.y0 != null) {
            if (org.telegram.messenger.d20.i(sm0Var.currentAccount).y != null && org.telegram.messenger.d20.i(sm0Var.currentAccount).y.valid_until < ConnectionsManager.getInstance(sm0Var.currentAccount).getCurrentTime() + 60) {
                org.telegram.messenger.d20.i(sm0Var.currentAccount).y = null;
                org.telegram.messenger.d20.i(sm0Var.currentAccount).v(false);
            }
            if (org.telegram.messenger.d20.i(sm0Var.currentAccount).y == null) {
                sm0Var.X0 = true;
                sm0 sm0Var3 = new sm0(sm0Var.b1, sm0Var.C0, sm0Var.N0, sm0Var.O0, 3, sm0Var.E0, sm0Var.G0, sm0Var.H0, null, sm0Var.x0, sm0Var.I0, sm0Var.U0, null, sm0Var.r0, sm0Var.W0);
                sm0Var3.c1 = sm0Var.c1;
                sm0Var3.d1 = sm0Var.d1;
                sm0Var.presentFragment(sm0Var3);
                sm0Var.X0 = false;
                return;
            }
            if (sm0Var.V0) {
                sm0Var.V0 = false;
                org.telegram.messenger.zs.f(sm0Var.currentAccount).n(sm0Var, org.telegram.messenger.zs.a1);
            }
        }
        TLRPC.User user = sm0Var.l0;
        if (user == null || user.verified) {
            sm0Var.N0(sm0Var.R0[0]);
            return;
        }
        String str2 = "payment_warning_" + sm0Var.l0.id;
        SharedPreferences sharedPreferences = org.telegram.messenger.vp.r1(sm0Var.currentAccount).e7;
        if (sharedPreferences.getBoolean(str2, false)) {
            sm0Var.N0(sm0Var.R0[0]);
            return;
        }
        sharedPreferences.edit().putBoolean(str2, true).commit();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sm0Var.getParentActivity());
        String L0 = org.telegram.messenger.cd.L0(2131747368, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.R = L0;
        x1Var.T = org.telegram.messenger.cd.a0("PaymentWarningText", null, 2131747367, sm0Var.p0, str);
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751771, null), new sl0(sm0Var, i11));
        sm0Var.showDialog(x1Var);
    }

    public static void m0(sm0 sm0Var, TLRPC.TL_error tL_error, boolean z10, TLObject tLObject, String str) {
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(sm0Var.currentAccount).sendRequest(new TL_account.getPassword(), new org.telegram.messenger.voip.u0(8, sm0Var, z10), 8);
            return;
        }
        sm0Var.M0(true, false);
        if (z10) {
            TL_account.Password password = sm0Var.a0;
            password.has_password = false;
            password.current_algo = null;
            sm0Var.T.a(password);
            sm0Var.finishFragment();
            return;
        }
        if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
            if (sm0Var.getParentActivity() == null) {
                return;
            }
            sm0Var.y0();
            return;
        }
        if (tL_error != null) {
            if (!tL_error.text.equals("EMAIL_UNCONFIRMED") && !tL_error.text.startsWith("EMAIL_UNCONFIRMED_")) {
                if (tL_error.text.equals("EMAIL_INVALID")) {
                    sm0Var.K0(org.telegram.messenger.cd.L0(R.string.AppName, null), org.telegram.messenger.cd.L0(2131747461, null));
                    return;
                } else if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                    sm0Var.K0(org.telegram.messenger.cd.L0(R.string.AppName, null), tL_error.text);
                    return;
                } else {
                    int intValue = Utilities.z(tL_error.text).intValue();
                    sm0Var.K0(org.telegram.messenger.cd.L0(R.string.AppName, null), org.telegram.messenger.cd.a0("FloodWaitTime", null, 2131750687, intValue < 60 ? org.telegram.messenger.cd.G(intValue, "Seconds", new Object[0]) : org.telegram.messenger.cd.G(intValue / 60, "Minutes", new Object[0])));
                    return;
                }
            }
            sm0Var.c0 = Utilities.z(tL_error.text).intValue();
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sm0Var.getParentActivity());
            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), new rv(29, sm0Var, str));
            String L0 = org.telegram.messenger.cd.L0(2131742846, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
            x1Var.T = L0;
            x1Var.R = org.telegram.messenger.cd.L0(2131742847, null);
            Dialog showDialog = sm0Var.showDialog(x1Var);
            if (showDialog != null) {
                showDialog.setCanceledOnTouchOutside(false);
                showDialog.setCancelable(false);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x020a, code lost:
    
        if (r9 == false) goto L96;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0278  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void n0(sm0 sm0Var) {
        Integer num;
        Integer num2;
        int i10;
        boolean z10;
        boolean z11;
        Integer num3;
        boolean z12;
        boolean z13;
        String[] split = sm0Var.f[1].getText().toString().split("/");
        if (split.length == 2) {
            Integer z14 = Utilities.z(split[0]);
            num2 = Utilities.z(split[1]);
            num = z14;
        } else {
            num = null;
            num2 = null;
        }
        oc.a aVar = new oc.a(sm0Var.f[0].getText().toString(), num, num2, sm0Var.f[3].getText().toString(), sm0Var.f[2].getText().toString(), null, null, null, null, sm0Var.f[5].getText().toString(), sm0Var.f[4].getText().toString(), null, null, null, null, null, null);
        sm0Var.x0 = aVar.a() + " *" + aVar.b();
        boolean z15 = num != null && num2 != null && org.telegram.messenger.d20.i(sm0Var.currentAccount).d().startsWith("7") && "smartglocal".equals(sm0Var.C0.native_provider) && (num2.intValue() > 22 || (num2.intValue() == 22 && num.intValue() > 1));
        String str = aVar.a;
        if (w7.m7.d(str)) {
            i10 = 0;
        } else {
            String replaceAll = str.trim().replaceAll("\\s+|-", "");
            if (!w7.m7.d(replaceAll) && replaceAll != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= replaceAll.length()) {
                        int length = replaceAll.length() - 1;
                        boolean z16 = true;
                        int i12 = 0;
                        while (true) {
                            if (length >= 0) {
                                char charAt = replaceAll.charAt(length);
                                if (!Character.isDigit(charAt)) {
                                    break;
                                }
                                int parseInt = Integer.parseInt("" + charAt);
                                boolean z17 = z16 ^ true;
                                if (!z16) {
                                    parseInt *= 2;
                                }
                                if (parseInt > 9) {
                                    parseInt -= 9;
                                }
                                i12 += parseInt;
                                length--;
                                z16 = z17;
                            } else if (i12 % 10 == 0) {
                                String a2 = aVar.a();
                                if (!"American Express".equals(a2) ? !(!"Diners Club".equals(a2) ? replaceAll.length() != 16 : replaceAll.length() != 14) : replaceAll.length() == 15) {
                                    int i13 = 12;
                                    if (!z15) {
                                        Integer num4 = aVar.c;
                                        if (num4 != null && num4.intValue() >= 1 && num4.intValue() <= 12 && (num3 = aVar.d) != null && w7.h7.a(num3.intValue()) >= hb.a.k0().get(1)) {
                                            if (num4 == null || num4.intValue() < 1 || num4.intValue() > 12 || num3 == null || w7.h7.a(num3.intValue()) < hb.a.k0().get(1)) {
                                                z12 = false;
                                            } else {
                                                int intValue = num3.intValue();
                                                int intValue2 = num4.intValue();
                                                if (w7.h7.a(intValue) >= hb.a.k0().get(1)) {
                                                    Calendar k02 = hb.a.k0();
                                                    if (w7.h7.a(intValue) != k02.get(1) || intValue2 >= k02.get(2) + 1) {
                                                        z13 = false;
                                                        z12 = !z13;
                                                    }
                                                }
                                                z13 = true;
                                                z12 = !z13;
                                            }
                                        }
                                        sm0Var.J0(1);
                                        return;
                                    }
                                    if (sm0Var.i0 && sm0Var.f[2].length() == 0) {
                                        sm0Var.J0(2);
                                        return;
                                    }
                                    String str2 = aVar.b;
                                    if (!w7.m7.d(str2)) {
                                        String trim = str2.trim();
                                        String a10 = aVar.a();
                                        boolean z18 = (a10 == null && trim.length() >= 3 && trim.length() <= 4) || ("American Express".equals(a10) && trim.length() == 4) || trim.length() == 3;
                                        if (trim != null) {
                                            for (int i14 = 0; i14 < trim.length(); i14++) {
                                                if (Character.isDigit(trim.charAt(i14))) {
                                                }
                                            }
                                            z10 = true;
                                            if (z10 && z18) {
                                                z11 = true;
                                                if (!z11) {
                                                    sm0Var.J0(3);
                                                    return;
                                                }
                                                if (sm0Var.g0 && sm0Var.f[4].length() == 0) {
                                                    sm0Var.J0(4);
                                                    return;
                                                }
                                                if (sm0Var.h0 && sm0Var.f[5].length() == 0) {
                                                    sm0Var.J0(5);
                                                    return;
                                                }
                                                sm0Var.M0(true, true);
                                                try {
                                                    if ("stripe".equals(sm0Var.C0.native_provider)) {
                                                        String str3 = sm0Var.j0;
                                                        a4.l lVar = new a4.l(new hb.a(i13), 29);
                                                        hb.a.E0(str3);
                                                        e eVar = new e(sm0Var, 27);
                                                        try {
                                                            hb.a.E0(str3);
                                                            new mc.a(lVar, str3, aVar, eVar).execute(new Void[0]);
                                                        } catch (nc.c e) {
                                                            eVar.d2(e);
                                                        }
                                                    } else if ("smartglocal".equals(sm0Var.C0.native_provider)) {
                                                        new km0(sm0Var, aVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                                                    }
                                                    return;
                                                } catch (Exception e7) {
                                                    org.telegram.messenger.f8.g(e7, true);
                                                    return;
                                                }
                                            }
                                        }
                                        z10 = false;
                                        if (z10) {
                                            z11 = true;
                                            if (!z11) {
                                            }
                                        }
                                    }
                                    z11 = false;
                                    if (!z11) {
                                    }
                                }
                            }
                        }
                    } else if (!Character.isDigit(replaceAll.charAt(i11))) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            i10 = 0;
        }
        sm0Var.J0(i10);
    }

    public static void o0(sm0 sm0Var) {
        if (org.telegram.messenger.d20.i(sm0Var.currentAccount).y != null && org.telegram.messenger.d20.i(sm0Var.currentAccount).y.valid_until < ConnectionsManager.getInstance(sm0Var.currentAccount).getCurrentTime() + 60) {
            org.telegram.messenger.d20.i(sm0Var.currentAccount).y = null;
            org.telegram.messenger.d20.i(sm0Var.currentAccount).v(false);
        }
        if (org.telegram.messenger.d20.i(sm0Var.currentAccount).y != null) {
            sm0Var.E0();
            return;
        }
        if (sm0Var.f[1].length() == 0) {
            try {
                sm0Var.f[1].performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            org.telegram.messenger.i0.F3(2.5f, sm0Var.f[1], null);
            return;
        }
        String obj = sm0Var.f[1].getText().toString();
        sm0Var.M0(true, true);
        sm0Var.I0(true);
        TL_account.getPassword getpassword = new TL_account.getPassword();
        ConnectionsManager.getInstance(sm0Var.currentAccount).sendRequest(getpassword, new aa(sm0Var, obj, getpassword, 28), (sm0Var.W0 ? 8 : 0) | 2);
    }

    public static void q0(sm0 sm0Var) {
        if (sm0Var.Q0) {
            return;
        }
        sm0Var.M0(true, true);
        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo = new TLRPC.TL_payments_validateRequestedInfo();
        sm0Var.I0 = tL_payments_validateRequestedInfo;
        TLRPC.InputInvoice inputInvoice = sm0Var.b1;
        if (inputInvoice != null) {
            tL_payments_validateRequestedInfo.invoice = inputInvoice;
        } else if (sm0Var.N0 != null) {
            TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
            tL_inputInvoiceMessage.peer = sm0Var.getMessagesController().l1(sm0Var.N0.k.peer_id);
            tL_inputInvoiceMessage.msg_id = sm0Var.N0.f1();
            sm0Var.I0.invoice = tL_inputInvoiceMessage;
        } else {
            TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
            tL_inputInvoiceSlug.slug = sm0Var.O0;
            sm0Var.I0.invoice = tL_inputInvoiceSlug;
        }
        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo2 = sm0Var.I0;
        tL_payments_validateRequestedInfo2.save = sm0Var.T0;
        tL_payments_validateRequestedInfo2.info = new TLRPC.TL_paymentRequestedInfo();
        if (sm0Var.C0.invoice.name_requested) {
            sm0Var.I0.info.name = sm0Var.f[6].getText().toString();
            sm0Var.I0.info.flags |= 1;
        }
        if (sm0Var.C0.invoice.phone_requested) {
            sm0Var.I0.info.phone = "+" + sm0Var.f[8].getText().toString() + sm0Var.f[9].getText().toString();
            TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo = sm0Var.I0.info;
            tL_paymentRequestedInfo.flags = tL_paymentRequestedInfo.flags | 2;
        }
        if (sm0Var.C0.invoice.email_requested) {
            sm0Var.I0.info.email = sm0Var.f[7].getText().toString().trim();
            sm0Var.I0.info.flags |= 4;
        }
        if (sm0Var.C0.invoice.shipping_address_requested) {
            sm0Var.I0.info.shipping_address = new TLRPC.TL_postAddress();
            sm0Var.I0.info.shipping_address.street_line1 = sm0Var.f[0].getText().toString();
            sm0Var.I0.info.shipping_address.street_line2 = sm0Var.f[1].getText().toString();
            sm0Var.I0.info.shipping_address.city = sm0Var.f[2].getText().toString();
            sm0Var.I0.info.shipping_address.state = sm0Var.f[3].getText().toString();
            TLRPC.TL_postAddress tL_postAddress = sm0Var.I0.info.shipping_address;
            String str = sm0Var.B0;
            if (str == null) {
                str = "";
            }
            tL_postAddress.country_iso2 = str;
            tL_postAddress.post_code = sm0Var.f[5].getText().toString();
            sm0Var.I0.info.flags |= 8;
        }
        ConnectionsManager.getInstance(sm0Var.currentAccount).sendRequest(sm0Var.I0, new org.telegram.ui.Components.t20(29, sm0Var, sm0Var.I0), (sm0Var.W0 ? 8 : 0) | 2);
    }

    public static JSONObject t0() {
        List asList = Arrays.asList("AMEX", "DISCOVER", "JCB", "MASTERCARD", "VISA");
        List asList2 = Arrays.asList("PAN_ONLY", "CRYPTOGRAM_3DS");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(TeXSymbolParser.TYPE_ATTR, "CARD");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("allowedAuthMethods", new JSONArray((Collection) asList2));
        jSONObject2.put("allowedCardNetworks", new JSONArray((Collection) asList));
        jSONObject.put("parameters", jSONObject2);
        return jSONObject;
    }

    public final void A0(Context context) {
        Optional empty;
        if (getParentActivity() == null) {
            return;
        }
        ae.j jVar = new ae.j();
        int i10 = this.C0.invoice.test ? 3 : 1;
        if (i10 != 2 && i10 != 1 && i10 != 3) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(i0.a.i(i10, "Invalid environment value "));
        }
        jVar.a = i10;
        this.e = new com.google.android.gms.internal.clearcut.v0(context, v8.p.a, new v8.o(jVar), com.google.android.gms.common.api.i.c);
        try {
            JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
            put.put("allowedPaymentMethods", new JSONArray().put(t0()));
            empty = Optional.of(put);
        } catch (JSONException unused) {
            empty = Optional.empty();
        }
        if (empty.isPresent()) {
            String jSONObject = ((JSONObject) empty.get()).toString();
            v8.e eVar = new v8.e();
            n6.l.h(jSONObject, "isReadyToPayRequestJson cannot be null!");
            eVar.f = jSONObject;
            com.google.android.gms.internal.clearcut.v0 v0Var = this.e;
            v0Var.getClass();
            com.google.android.gms.common.api.internal.v b10 = com.google.android.gms.common.api.internal.w.b();
            b10.a = 23705;
            b10.c = new n2.u(eVar, 29);
            v0Var.e(0, b10.a()).addOnCompleteListener(getParentActivity(), new sl0(this, 0));
        }
    }

    public final void B0() {
        if (this.e0) {
            return;
        }
        this.e0 = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new ml0(this, 3), 10);
    }

    public final boolean C0(org.telegram.ui.ActionBar.z4 z4Var, Activity activity) {
        int i10 = 0;
        if (this.b1 != null) {
            if (z4Var != null) {
                ArrayList arrayList = new ArrayList(z4Var.getFragmentStack());
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) obj;
                    if (k2Var instanceof sm0) {
                        k2Var.removeSelfFromStack();
                    }
                }
                return true;
            }
            return false;
        }
        String str = this.l0.username;
        if (((str != null && str.equalsIgnoreCase(getMessagesController().t6) && this.O0 == null) || (this.O0 != null && getMessagesController().u6 != null && Objects.equals(this.O0, getMessagesController().u6))) && z4Var != null) {
            ArrayList arrayList2 = new ArrayList(z4Var.getFragmentStack());
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                org.telegram.ui.ActionBar.k2 k2Var2 = (org.telegram.ui.ActionBar.k2) obj2;
                if ((k2Var2 instanceof un) || (k2Var2 instanceof PremiumPreviewFragment)) {
                    k2Var2.removeSelfFromStack();
                }
            }
            PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, null);
            premiumPreviewFragment.p0 = true;
            ((ActionBarLayout) z4Var).S(premiumPreviewFragment, !isFinishing());
            if (activity instanceof LaunchActivity) {
                try {
                    this.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                ((LaunchActivity) activity).x0.c(false);
            }
            return true;
        }
        return false;
    }

    public final void D0(org.telegram.ui.ActionBar.k2 k2Var) {
        org.telegram.messenger.i0.v1(this.fragmentView);
        if (k2Var instanceof sm0) {
            sm0 sm0Var = (sm0) k2Var;
            sm0Var.Z0 = this.Z0;
            sm0Var.Y0 = this.Y0;
            sm0Var.X0 = this.X0;
            sm0Var.y0 = this.y0;
        }
    }

    public final void E0() {
        String str;
        if (this.Q0) {
            return;
        }
        M0(false, true);
        TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm = new TLRPC.TL_payments_sendPaymentForm();
        TLRPC.InputInvoice inputInvoice = this.b1;
        if (inputInvoice != null) {
            tL_payments_sendPaymentForm.invoice = inputInvoice;
        } else if (this.N0 != null) {
            TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
            tL_inputInvoiceMessage.peer = getMessagesController().l1(this.N0.k.peer_id);
            tL_inputInvoiceMessage.msg_id = this.N0.f1();
            tL_payments_sendPaymentForm.invoice = tL_inputInvoiceMessage;
        } else {
            TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
            tL_inputInvoiceSlug.slug = this.O0;
            tL_payments_sendPaymentForm.invoice = tL_inputInvoiceSlug;
        }
        tL_payments_sendPaymentForm.form_id = this.C0.form_id;
        if (org.telegram.messenger.d20.i(this.currentAccount).y == null || this.y0 == null) {
            TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay = this.J0;
            if (tL_inputPaymentCredentialsGooglePay != null) {
                tL_payments_sendPaymentForm.credentials = tL_inputPaymentCredentialsGooglePay;
            } else {
                TLRPC.TL_inputPaymentCredentials tL_inputPaymentCredentials = new TLRPC.TL_inputPaymentCredentials();
                tL_payments_sendPaymentForm.credentials = tL_inputPaymentCredentials;
                tL_inputPaymentCredentials.save = this.U0;
                tL_inputPaymentCredentials.data = new TLRPC.TL_dataJSON();
                tL_payments_sendPaymentForm.credentials.data.data = this.w0;
            }
        } else {
            TLRPC.TL_inputPaymentCredentialsSaved tL_inputPaymentCredentialsSaved = new TLRPC.TL_inputPaymentCredentialsSaved();
            tL_payments_sendPaymentForm.credentials = tL_inputPaymentCredentialsSaved;
            tL_inputPaymentCredentialsSaved.id = this.y0.id;
            tL_inputPaymentCredentialsSaved.tmp_password = org.telegram.messenger.d20.i(this.currentAccount).y.tmp_password;
        }
        TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo = this.E0;
        if (tL_payments_validatedRequestedInfo != null && (str = tL_payments_validatedRequestedInfo.id) != null) {
            tL_payments_sendPaymentForm.requested_info_id = str;
            tL_payments_sendPaymentForm.flags = 1 | tL_payments_sendPaymentForm.flags;
        }
        TLRPC.TL_shippingOption tL_shippingOption = this.G0;
        if (tL_shippingOption != null) {
            tL_payments_sendPaymentForm.shipping_option_id = tL_shippingOption.id;
            tL_payments_sendPaymentForm.flags |= 2;
        }
        if ((this.C0.invoice.flags & 256) != 0) {
            Long l4 = this.H0;
            tL_payments_sendPaymentForm.tip_amount = l4 != null ? l4.longValue() : 0L;
            tL_payments_sendPaymentForm.flags |= 4;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_sendPaymentForm, new ul0(0, this, tL_payments_sendPaymentForm), (this.W0 ? 8 : 0) | 2);
    }

    public final void F0(boolean z10) {
        String str;
        String str2;
        int i10 = 1;
        if (!z10 && this.S.getVisibility() == 0) {
            String text = this.S.getText();
            if (text.length() == 0) {
                org.telegram.ui.Cells.n3 n3Var = this.S;
                try {
                    n3Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                org.telegram.messenger.i0.F3(2.5f, n3Var, null);
                return;
            } else {
                M0(true, true);
                TL_account.confirmPasswordEmail confirmpasswordemail = new TL_account.confirmPasswordEmail();
                confirmpasswordemail.code = text;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(confirmpasswordemail, new ml0(this, i10), 10);
                return;
            }
        }
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        if (z10) {
            this.n.setVisibility(0);
            TL_account.passwordInputSettings passwordinputsettings = new TL_account.passwordInputSettings();
            updatepasswordsettings.new_settings = passwordinputsettings;
            passwordinputsettings.flags = 2;
            passwordinputsettings.email = "";
            updatepasswordsettings.password = new TLRPC.TL_inputCheckPasswordEmpty();
            str2 = null;
            str = null;
        } else {
            String obj = this.f[0].getText().toString();
            if (TextUtils.isEmpty(obj)) {
                J0(0);
                return;
            }
            if (!obj.equals(this.f[1].getText().toString())) {
                try {
                    Toast.makeText(getParentActivity(), org.telegram.messenger.cd.L0(2131747462, null), 0).show();
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
                J0(1);
                return;
            }
            String obj2 = this.f[2].getText().toString();
            if (obj2.length() < 3) {
                J0(2);
                return;
            }
            int lastIndexOf = obj2.lastIndexOf(46);
            int lastIndexOf2 = obj2.lastIndexOf(64);
            if (lastIndexOf2 < 0 || lastIndexOf < lastIndexOf2) {
                J0(2);
                return;
            }
            updatepasswordsettings.password = new TLRPC.TL_inputCheckPasswordEmpty();
            TL_account.passwordInputSettings passwordinputsettings2 = new TL_account.passwordInputSettings();
            updatepasswordsettings.new_settings = passwordinputsettings2;
            int i11 = passwordinputsettings2.flags;
            passwordinputsettings2.flags = i11 | 1;
            passwordinputsettings2.hint = "";
            passwordinputsettings2.new_algo = this.a0.new_algo;
            passwordinputsettings2.flags = 3 | i11;
            passwordinputsettings2.email = obj2.trim();
            str = obj;
            str2 = obj2;
        }
        M0(true, true);
        Utilities.e.c(new ag.n0(this, z10, str2, str, updatepasswordsettings, 12));
    }

    public final void G0(TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo) {
        TLRPC.TL_postAddress tL_postAddress = tL_paymentRequestedInfo.shipping_address;
        org.telegram.ui.Cells.a9[] a9VarArr = this.Y;
        if (tL_postAddress != null) {
            String str = tL_postAddress.street_line1;
            String str2 = tL_postAddress.street_line2;
            String str3 = tL_postAddress.city;
            String str4 = tL_postAddress.state;
            String str5 = tL_postAddress.country_iso2;
            String str6 = tL_postAddress.post_code;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(" ");
            sb2.append(str2);
            sb2.append(", ");
            sb2.append(str3);
            c3.i0.r(sb2, ", ", str4, ", ", str5);
            a9VarArr[2].b(R.drawable.msg_payment_address, a1.g.r(sb2, ", ", str6), org.telegram.messenger.cd.L0(2131747397, null), true);
        }
        a9VarArr[2].setVisibility(tL_paymentRequestedInfo.shipping_address != null ? 0 : 8);
        String str7 = tL_paymentRequestedInfo.name;
        if (str7 != null) {
            a9VarArr[3].b(R.drawable.msg_contacts, str7, org.telegram.messenger.cd.L0(2131747428, null), true);
        }
        a9VarArr[3].setVisibility(tL_paymentRequestedInfo.name != null ? 0 : 8);
        if (tL_paymentRequestedInfo.phone != null) {
            a9VarArr[4].b(R.drawable.msg_calls, af.b.c().b(tL_paymentRequestedInfo.phone), org.telegram.messenger.cd.L0(2131747426, null), (tL_paymentRequestedInfo.email == null && this.G0 == null) ? false : true);
        }
        a9VarArr[4].setVisibility(tL_paymentRequestedInfo.phone != null ? 0 : 8);
        String str8 = tL_paymentRequestedInfo.email;
        if (str8 != null) {
            a9VarArr[5].b(R.drawable.msg_mention, str8, org.telegram.messenger.cd.L0(2131747431, null), this.G0 != null);
        }
        a9VarArr[5].setVisibility(tL_paymentRequestedInfo.email != null ? 0 : 8);
    }

    public final void H0(TL_account.Password password) {
        if (password == null || !password.has_password) {
            this.a0 = password;
            this.b0 = (password == null || TextUtils.isEmpty(password.email_unconfirmed_pattern)) ? false : true;
            O0();
        } else {
            if (getParentActivity() == null) {
                return;
            }
            y0();
        }
    }

    public final void I0(boolean z10) {
        this.P0 = z10;
        this.G = !z10;
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar != null && lVar.getBackButton() != null) {
            this.actionBar.getBackButton().setEnabled(!this.P0);
        }
        org.telegram.ui.Cells.a9 a9Var = this.Y[0];
        if (a9Var != null) {
            a9Var.setEnabled(!this.P0);
        }
    }

    public final void J0(int i10) {
        EditTextBoldCursor editTextBoldCursor = this.f[i10];
        try {
            editTextBoldCursor.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        org.telegram.messenger.i0.F3(2.5f, editTextBoldCursor, null);
    }

    public final void K0(String str, String str2) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.R = str;
        x1Var.T = str2;
        showDialog(x1Var);
    }

    public final void L0(Runnable runnable) {
        Integer valueOf = Integer.valueOf(R.drawable.msg_payment_card);
        org.telegram.ui.ActionBar.z2 h = org.telegram.messenger.z20.h(getParentActivity(), false, 1, null);
        h.O = org.telegram.messenger.cd.L0(2131747430, null);
        h.P = true;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = this.y0;
        if (tL_paymentSavedCredentialsCard != null) {
            arrayList.add(tL_paymentSavedCredentialsCard.title);
            arrayList2.add(valueOf);
        } else {
            String str = this.x0;
            if (str != null) {
                arrayList.add(str);
                arrayList2.add(valueOf);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList<TLRPC.TL_paymentSavedCredentialsCard> arrayList4 = this.C0.saved_credentials;
        int size = arrayList4.size();
        int i10 = 0;
        while (i10 < size) {
            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = arrayList4.get(i10);
            i10++;
            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard3 = tL_paymentSavedCredentialsCard2;
            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard4 = this.y0;
            if (tL_paymentSavedCredentialsCard4 == null || !Objects.equals(tL_paymentSavedCredentialsCard3.id, tL_paymentSavedCredentialsCard4.id)) {
                arrayList.add(tL_paymentSavedCredentialsCard3.title);
                arrayList2.add(valueOf);
                arrayList3.add(tL_paymentSavedCredentialsCard3);
            }
        }
        ArrayList<TLRPC.TL_paymentFormMethod> arrayList5 = this.C0.additional_methods;
        int size2 = arrayList5.size();
        int i11 = 0;
        while (i11 < size2) {
            TLRPC.TL_paymentFormMethod tL_paymentFormMethod = arrayList5.get(i11);
            i11++;
            arrayList.add(tL_paymentFormMethod.title);
            arrayList2.add(Integer.valueOf(R.drawable.msg_payment_provider));
        }
        arrayList.add(org.telegram.messenger.cd.L0(2131747429, null));
        arrayList2.add(Integer.valueOf(R.drawable.msg_addbot));
        int[] iArr = new int[arrayList2.size()];
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            iArr[i12] = ((Integer) arrayList2.get(i12)).intValue();
        }
        CharSequence[] charSequenceArr = (CharSequence[]) arrayList.toArray(new CharSequence[0]);
        org.telegram.ui.Components.t2 t2Var = new org.telegram.ui.Components.t2(this, runnable, arrayList3, arrayList, 1);
        h.L = charSequenceArr;
        h.M = iArr;
        h.K = t2Var;
        showDialog(h);
    }

    public final void M0(boolean z10, boolean z11) {
        AnimatorSet animatorSet = this.w;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        int i10 = 1;
        int i11 = 0;
        if (!z10 || this.n == null) {
            if (this.U != null) {
                this.w = new AnimatorSet();
                if (z11) {
                    this.s.setVisibility(0);
                    this.W.setEnabled(false);
                    AnimatorSet animatorSet2 = this.w;
                    TextView textView = this.U;
                    Property property = View.SCALE_X;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.1f);
                    TextView textView2 = this.U;
                    Property property2 = View.SCALE_Y;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, 0.1f);
                    TextView textView3 = this.U;
                    Property property3 = View.ALPHA;
                    animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.iq, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.iq, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.iq, Float>) property3, 1.0f));
                } else {
                    this.U.setVisibility(0);
                    this.W.setEnabled(true);
                    AnimatorSet animatorSet3 = this.w;
                    org.telegram.ui.Components.iq iqVar = this.s;
                    Property property4 = View.SCALE_X;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(iqVar, (Property<org.telegram.ui.Components.iq, Float>) property4, 0.1f);
                    org.telegram.ui.Components.iq iqVar2 = this.s;
                    Property property5 = View.SCALE_Y;
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(iqVar2, (Property<org.telegram.ui.Components.iq, Float>) property5, 0.1f);
                    org.telegram.ui.Components.iq iqVar3 = this.s;
                    Property property6 = View.ALPHA;
                    animatorSet3.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(iqVar3, (Property<org.telegram.ui.Components.iq, Float>) property6, 0.0f), ObjectAnimator.ofFloat(this.U, (Property<TextView, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.U, (Property<TextView, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.U, (Property<TextView, Float>) property6, 1.0f));
                }
                this.w.addListener(new lm0(this, z11, i10));
                this.w.setDuration(150L);
                this.w.start();
                return;
            }
            return;
        }
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.w = animatorSet4;
        if (z11) {
            this.r.setVisibility(0);
            this.n.setEnabled(false);
            AnimatorSet animatorSet5 = this.w;
            View contentView = this.n.getContentView();
            Property property7 = View.SCALE_X;
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(contentView, (Property<View, Float>) property7, 0.1f);
            View contentView2 = this.n.getContentView();
            Property property8 = View.SCALE_Y;
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(contentView2, (Property<View, Float>) property8, 0.1f);
            View contentView3 = this.n.getContentView();
            Property property9 = View.ALPHA;
            animatorSet5.playTogether(ofFloat5, ofFloat6, ObjectAnimator.ofFloat(contentView3, (Property<View, Float>) property9, 0.0f), ObjectAnimator.ofFloat(this.r, (Property<org.telegram.ui.Components.iq, Float>) property7, 1.0f), ObjectAnimator.ofFloat(this.r, (Property<org.telegram.ui.Components.iq, Float>) property8, 1.0f), ObjectAnimator.ofFloat(this.r, (Property<org.telegram.ui.Components.iq, Float>) property9, 1.0f));
        } else if (this.x != null) {
            animatorSet4.playTogether(ObjectAnimator.ofFloat(this.r, (Property<org.telegram.ui.Components.iq, Float>) View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.r, (Property<org.telegram.ui.Components.iq, Float>) View.SCALE_Y, 0.1f), ObjectAnimator.ofFloat(this.r, (Property<org.telegram.ui.Components.iq, Float>) View.ALPHA, 0.0f));
        } else {
            this.n.getContentView().setVisibility(0);
            this.n.setEnabled(true);
            AnimatorSet animatorSet6 = this.w;
            org.telegram.ui.Components.iq iqVar4 = this.r;
            Property property10 = View.SCALE_X;
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(iqVar4, (Property<org.telegram.ui.Components.iq, Float>) property10, 0.1f);
            org.telegram.ui.Components.iq iqVar5 = this.r;
            Property property11 = View.SCALE_Y;
            ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(iqVar5, (Property<org.telegram.ui.Components.iq, Float>) property11, 0.1f);
            org.telegram.ui.Components.iq iqVar6 = this.r;
            Property property12 = View.ALPHA;
            animatorSet6.playTogether(ofFloat7, ofFloat8, ObjectAnimator.ofFloat(iqVar6, (Property<org.telegram.ui.Components.iq, Float>) property12, 0.0f));
            if (!isFinishing()) {
                this.w.playTogether(ObjectAnimator.ofFloat(this.n.getContentView(), (Property<View, Float>) property10, 1.0f), ObjectAnimator.ofFloat(this.n.getContentView(), (Property<View, Float>) property11, 1.0f), ObjectAnimator.ofFloat(this.n.getContentView(), (Property<View, Float>) property12, 1.0f));
            }
        }
        this.w.addListener(new lm0(this, z11, i11));
        this.w.setDuration(150L);
        this.w.start();
    }

    public final void N0(String str) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String L0 = org.telegram.messenger.cd.L0(2131747370, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.R = L0;
        x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("PaymentTransactionMessage2", null, 2131747371, str, this.p0, this.q0));
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751771, null), new sl0(this, 5));
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
        showDialog(x1Var);
    }

    public final void O0() {
        if (this.u0 == 6) {
            org.telegram.ui.Cells.b9[] b9VarArr = this.M;
            if (b9VarArr[2] == null) {
                return;
            }
            int i10 = 0;
            this.n.setVisibility(0);
            TL_account.Password password = this.a0;
            ArrayList arrayList = this.J;
            org.telegram.ui.Cells.p4[] p4VarArr = this.I;
            org.telegram.ui.Cells.x9[] x9VarArr = this.N;
            if (password == null) {
                M0(true, true);
                b9VarArr[2].setVisibility(8);
                x9VarArr[0].setVisibility(8);
                x9VarArr[1].setVisibility(8);
                this.S.setVisibility(8);
                p4VarArr[0].setVisibility(8);
                p4VarArr[1].setVisibility(8);
                b9VarArr[0].setVisibility(8);
                for (int i11 = 0; i11 < 3; i11++) {
                    ((View) this.f[i11].getParent()).setVisibility(8);
                }
                while (i10 < arrayList.size()) {
                    ((View) arrayList.get(i10)).setVisibility(8);
                    i10++;
                }
                return;
            }
            M0(true, false);
            if (!this.b0) {
                b9VarArr[2].setVisibility(8);
                x9VarArr[0].setVisibility(8);
                x9VarArr[1].setVisibility(8);
                b9VarArr[1].setText(org.telegram.messenger.cd.L0(2131747407, null));
                this.S.setVisibility(8);
                p4VarArr[0].setVisibility(0);
                p4VarArr[1].setVisibility(0);
                b9VarArr[0].setVisibility(0);
                for (int i12 = 0; i12 < 3; i12++) {
                    ((View) this.f[i12].getParent()).setVisibility(0);
                }
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    ((View) arrayList.get(i13)).setVisibility(0);
                }
                return;
            }
            org.telegram.ui.Cells.b9 b9Var = b9VarArr[2];
            String str = this.a0.email_unconfirmed_pattern;
            if (str == null) {
                str = "";
            }
            b9Var.setText(org.telegram.messenger.cd.a0("EmailPasswordConfirmText2", null, 2131751200, str));
            b9VarArr[2].setVisibility(0);
            x9VarArr[0].setVisibility(0);
            x9VarArr[1].setVisibility(0);
            this.S.setVisibility(0);
            b9VarArr[1].setText("");
            p4VarArr[0].setVisibility(8);
            p4VarArr[1].setVisibility(8);
            b9VarArr[0].setVisibility(8);
            for (int i14 = 0; i14 < 3; i14++) {
                ((View) this.f[i14].getParent()).setVisibility(8);
            }
            while (i10 < arrayList.size()) {
                ((View) arrayList.get(i10)).setVisibility(8);
                i10++;
            }
        }
    }

    public final void P0() {
        org.telegram.ui.Cells.b9[] b9VarArr = this.M;
        if (b9VarArr[0] != null) {
            org.telegram.ui.Cells.c7[] c7VarArr = this.K;
            if (c7VarArr[2] == null) {
                return;
            }
            TLRPC.PaymentForm paymentForm = this.C0;
            if ((!paymentForm.password_missing && !paymentForm.can_save_credentials) || (this.x != null && this.z0)) {
                this.L.setVisibility(8);
                b9VarArr[0].setVisibility(8);
                org.telegram.ui.Cells.c7 c7Var = c7VarArr[2];
                org.telegram.ui.ActionBar.a7.a0(c7Var, c7Var.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.t6.b7);
                return;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.cd.L0(2131747437, null));
            if (this.C0.password_missing) {
                B0();
                spannableStringBuilder.append((CharSequence) "\n");
                int length = spannableStringBuilder.length();
                String L0 = org.telegram.messenger.cd.L0(2131747436, null);
                int indexOf = L0.indexOf(42);
                int lastIndexOf = L0.lastIndexOf(42);
                spannableStringBuilder.append((CharSequence) L0);
                if (indexOf != -1 && lastIndexOf != -1) {
                    int i10 = indexOf + length;
                    int i11 = lastIndexOf + length;
                    b9VarArr[0].getTextView().setMovementMethod(new org.telegram.messenger.e0(false));
                    spannableStringBuilder.replace(i11, i11 + 1, (CharSequence) "");
                    spannableStringBuilder.replace(i10, i10 + 1, (CharSequence) "");
                    spannableStringBuilder.setSpan(new pm0(this), i10, i11 - 1, 33);
                }
            }
            this.L.setEnabled(true);
            b9VarArr[0].setText(spannableStringBuilder);
            this.L.setVisibility(0);
            b9VarArr[0].setVisibility(0);
            org.telegram.ui.Cells.c7 c7Var2 = c7VarArr[2];
            org.telegram.ui.ActionBar.a7.a0(c7Var2, c7Var2.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.t6.b7);
        }
    }

    public final void Q0() {
        this.R0[0] = x0(this.t0);
        this.R.a(org.telegram.messenger.cd.L0(2131747369, null), this.R0[0], true);
        TextView textView = this.U;
        if (textView != null) {
            textView.setText(org.telegram.messenger.cd.a0("PaymentCheckoutPay", null, 2131747427, this.R0[0]));
        }
        if (this.s0 != null) {
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.t6.Si);
            int childCount = this.s0.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                TextView textView2 = (TextView) this.s0.getChildAt(i10);
                if (textView2.getTag().equals(this.H0)) {
                    org.telegram.ui.ActionBar.t6.C1(themedColor, textView2.getBackground());
                    org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.Ti, this.Y0);
                } else {
                    org.telegram.ui.ActionBar.t6.C1(536870911 & themedColor, textView2.getBackground());
                    org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.Z8, this.Y0);
                }
                textView2.invalidate();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.h7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.g7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.E7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.D7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.s8));
    }

    /* JADX WARN: Code restructure failed: missing block: B:178:0x031c, code lost:
    
        if (r10.email_requested == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:480:0x101b, code lost:
    
        if (r15.email_requested == false) goto L464;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0796  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x07b0  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x07c5  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x07dc  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0817  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0876  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0906  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0830  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x07e9  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x07a6  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0bb4  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0c19  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0c49  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0c77  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0d3c  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0c92  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0c4b  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0c26  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0c09  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0220  */
    /* JADX WARN: Type inference failed for: r3v231, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r3v235, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r3v236, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r3v272, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r4v163, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r4v304, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v305, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    @Override // org.telegram.ui.ActionBar.k2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        int i10;
        int i11;
        String str;
        int i12;
        String str2;
        String str3;
        char c10;
        TLRPC.PaymentForm paymentForm;
        SpannableStringBuilder spannableStringBuilder;
        TLRPC.PaymentForm paymentForm2;
        TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo;
        boolean z10;
        int i13;
        int i14;
        int i15;
        TLRPC.TL_invoice tL_invoice;
        org.telegram.ui.Cells.c7 c7Var;
        TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo2;
        TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo3;
        String str4;
        String str5;
        TelephonyManager telephonyManager;
        ?? frameLayout;
        int i16;
        int i17;
        TLRPC.TL_postAddress tL_postAddress;
        TLRPC.TL_postAddress tL_postAddress2;
        TLRPC.TL_postAddress tL_postAddress3;
        TLRPC.TL_postAddress tL_postAddress4;
        TLRPC.TL_postAddress tL_postAddress5;
        TLRPC.TL_postAddress tL_postAddress6;
        String str6;
        String str7;
        BufferedReader bufferedReader;
        switch (this.u0) {
            case 0:
                this.actionBar.setTitle(org.telegram.messenger.cd.K0(2131747391));
                break;
            case 1:
                this.actionBar.setTitle(org.telegram.messenger.cd.K0(2131747390));
                break;
            case 2:
            case 3:
                TLRPC.TL_paymentFormMethod tL_paymentFormMethod = this.F0;
                if (tL_paymentFormMethod != null && !TextUtils.isEmpty(tL_paymentFormMethod.title)) {
                    this.actionBar.setTitle(this.F0.title);
                    break;
                } else {
                    this.actionBar.setTitle(org.telegram.messenger.cd.K0(2131747441));
                    break;
                }
                break;
            case 4:
                if (this.C0.invoice.test) {
                    this.actionBar.setTitle("Test " + org.telegram.messenger.cd.K0(2131747434));
                    break;
                } else {
                    this.actionBar.setTitle(org.telegram.messenger.cd.K0(2131747434));
                    break;
                }
            case 5:
                if (this.C0.invoice.test) {
                    this.actionBar.setTitle("Test " + org.telegram.messenger.cd.K0(2131747398));
                    break;
                } else {
                    this.actionBar.setTitle(org.telegram.messenger.cd.K0(2131747398));
                    break;
                }
            case 6:
                this.actionBar.setTitle(org.telegram.messenger.cd.K0(2131747409));
                break;
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new fm0(this));
        org.telegram.ui.ActionBar.y p5 = this.actionBar.p();
        int i18 = this.u0;
        int i19 = 6;
        int i20 = 3;
        if (i18 == 0 || i18 == 1 || i18 == 2 || i18 == 3 || i18 == 4 || i18 == 6) {
            this.n = p5.h(1, R.drawable.ic_ab_done, org.telegram.messenger.cd.K0(2131751355), org.telegram.messenger.i0.L(56.0f));
            org.telegram.ui.Components.iq iqVar = new org.telegram.ui.Components.iq(context, 1);
            this.r = iqVar;
            iqVar.setAlpha(0.0f);
            this.r.setScaleX(0.1f);
            this.r.setScaleY(0.1f);
            this.r.setVisibility(4);
            this.n.addView(this.r, w7.b6.c(-1.0f, -1));
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.fragmentView = frameLayout2;
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.a7, frameLayout2, getResourceProvider());
        ScrollView scrollView = new ScrollView(context);
        this.E = scrollView;
        scrollView.setFillViewport(true);
        org.telegram.messenger.i0.y3(this.E, getThemedColor(org.telegram.ui.ActionBar.t6.s8));
        frameLayout2.addView(this.E, w7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, this.u0 == 4 ? 48.0f : 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.Q = linearLayout;
        linearLayout.setOrientation(1);
        int i21 = 0;
        this.Q.setClipChildren(false);
        int i22 = -2;
        this.E.addView(this.Q, new FrameLayout.LayoutParams(-1, -2));
        int i23 = this.u0;
        int i24 = 28;
        int i25 = 2;
        int i26 = 10;
        int i27 = 1;
        if (i23 == 0) {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().getAssets().open("countries.txt")));
            } catch (Exception e) {
                e = e;
                i13 = i21;
            }
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    String[] split = readLine.split(";");
                    this.a.add(i21, split[2]);
                    i13 = i21;
                    try {
                        this.b.put(split[2], split[i13]);
                        this.c.put(split[i13], split[2]);
                        hashMap2.put(split[1], split[2]);
                        if (split.length > 3) {
                            this.d.put(split[i13], split[3]);
                        }
                        hashMap.put(split[1], split[2]);
                        i21 = i13;
                    } catch (Exception e7) {
                        e = e7;
                    }
                } else {
                    i13 = i21;
                    bufferedReader.close();
                    Collections.sort(this.a, new f6(i24));
                    this.f = new EditTextBoldCursor[10];
                    i14 = i13;
                    while (i14 < i26) {
                        if (i14 == 0) {
                            this.I[i13] = new org.telegram.ui.Cells.p4(context, this.Y0);
                            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, this.I[i13], getResourceProvider());
                            this.I[i13].setText(org.telegram.messenger.cd.K0(2131747397));
                            this.Q.addView(this.I[i13], w7.b6.o(-1, -2));
                        } else if (i14 == i19) {
                            this.K[i13] = new org.telegram.ui.Cells.c7(context, (Object) null);
                            this.Q.addView(this.K[i13], w7.b6.o(-1, -2));
                            this.I[i27] = new org.telegram.ui.Cells.p4(context, this.Y0);
                            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, this.I[i27], getResourceProvider());
                            this.I[i27].setText(org.telegram.messenger.cd.K0(2131747387));
                            this.Q.addView(this.I[i27], w7.b6.o(-1, -2));
                        }
                        if (i14 == 8) {
                            frameLayout = new LinearLayout(context);
                            ?? r42 = i13;
                            frameLayout.setClipChildren(r42);
                            frameLayout.setOrientation(r42 == true ? 1 : 0);
                            this.Q.addView(frameLayout, w7.b6.o(-1, 50));
                            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, frameLayout, getResourceProvider());
                        } else if (i14 == 9) {
                            frameLayout = (ViewGroup) this.f[8].getParent();
                        } else {
                            frameLayout = new FrameLayout(context);
                            frameLayout.setClipChildren(false);
                            this.Q.addView(frameLayout, w7.b6.o(-1, 50));
                            int i28 = org.telegram.ui.ActionBar.t6.d6;
                            org.telegram.ui.ActionBar.a7.i(i28, frameLayout, getResourceProvider());
                            int i29 = i14 != 5 ? i27 : 0;
                            if (i29 != 0) {
                                if (i14 != 7 || this.C0.invoice.phone_requested) {
                                    if (i14 == i19) {
                                        TLRPC.TL_invoice tL_invoice2 = this.C0.invoice;
                                        if (!tL_invoice2.phone_requested) {
                                        }
                                    }
                                }
                                i29 = 0;
                            }
                            if (i29 != 0) {
                                org.telegram.ui.Components.bn bnVar = new org.telegram.ui.Components.bn(context, 14);
                                org.telegram.ui.ActionBar.a7.i(i28, bnVar, getResourceProvider());
                                this.J.add(bnVar);
                                frameLayout.addView(bnVar, new FrameLayout.LayoutParams(-1, i27, 83));
                            }
                        }
                        if (i14 == 9) {
                            this.f[i14] = new org.telegram.ui.Components.n30(context);
                        } else {
                            this.f[i14] = new EditTextBoldCursor(context);
                        }
                        this.f[i14].setTag(Integer.valueOf(i14));
                        this.f[i14].setTextSize(1, 16.0f);
                        org.telegram.ui.ActionBar.a7.E(this.f[i14], org.telegram.ui.ActionBar.t6.H6, getResourceProvider());
                        EditTextBoldCursor editTextBoldCursor = this.f[i14];
                        int i30 = org.telegram.ui.ActionBar.t6.G6;
                        org.telegram.ui.ActionBar.a7.V(editTextBoldCursor, i30, getResourceProvider());
                        this.f[i14].setBackgroundDrawable(null);
                        org.telegram.ui.ActionBar.a7.w(this.f[i14], i30, getResourceProvider());
                        this.f[i14].setCursorSize(org.telegram.messenger.i0.L(20.0f));
                        this.f[i14].setCursorWidth(1.5f);
                        if (i14 == 4) {
                            final int i31 = 0;
                            this.f[i14].setOnTouchListener(new View.OnTouchListener(this) { // from class: org.telegram.ui.ol0
                                public final /* synthetic */ sm0 b;

                                {
                                    this.b = this;
                                }

                                @Override // android.view.View.OnTouchListener
                                public final boolean onTouch(View view, MotionEvent motionEvent) {
                                    switch (i31) {
                                        case 0:
                                            sm0 sm0Var = this.b;
                                            if (sm0Var.getParentActivity() != null) {
                                                if (motionEvent.getAction() == 1) {
                                                    rt rtVar = new rt(null, false);
                                                    rtVar.n = true;
                                                    rtVar.r = new sl0(sm0Var, 4);
                                                    sm0Var.presentFragment(rtVar);
                                                }
                                                break;
                                            }
                                            break;
                                        default:
                                            sm0 sm0Var2 = this.b;
                                            if (sm0Var2.getParentActivity() != null) {
                                                if (motionEvent.getAction() == 1) {
                                                    rt rtVar2 = new rt(null, false);
                                                    rtVar2.n = true;
                                                    rtVar2.r = new sl0(sm0Var2, 2);
                                                    sm0Var2.presentFragment(rtVar2);
                                                }
                                                break;
                                            }
                                            break;
                                    }
                                    return true;
                                }
                            });
                            this.f[i14].setInputType(0);
                        }
                        if (i14 == 9 || i14 == 8) {
                            this.f[i14].setInputType(i20);
                        } else if (i14 == 7) {
                            this.f[i14].setInputType(1);
                        } else {
                            this.f[i14].setInputType(16385);
                        }
                        this.f[i14].setImeOptions(268435461);
                        switch (i14) {
                            case 0:
                                this.f[i14].setHint(org.telegram.messenger.cd.K0(2131747396));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo4 = this.C0.saved_info;
                                if (tL_paymentRequestedInfo4 != null && (tL_postAddress = tL_paymentRequestedInfo4.shipping_address) != null) {
                                    this.f[i14].setText(tL_postAddress.street_line1);
                                    break;
                                }
                                break;
                            case 1:
                                this.f[i14].setHint(org.telegram.messenger.cd.K0(2131747395));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo5 = this.C0.saved_info;
                                if (tL_paymentRequestedInfo5 != null && (tL_postAddress2 = tL_paymentRequestedInfo5.shipping_address) != null) {
                                    this.f[i14].setText(tL_postAddress2.street_line2);
                                    break;
                                }
                                break;
                            case 2:
                                this.f[i14].setHint(org.telegram.messenger.cd.K0(2131747394));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo6 = this.C0.saved_info;
                                if (tL_paymentRequestedInfo6 != null && (tL_postAddress3 = tL_paymentRequestedInfo6.shipping_address) != null) {
                                    this.f[i14].setText(tL_postAddress3.city);
                                    break;
                                }
                                break;
                            case 3:
                                this.f[i14].setHint(org.telegram.messenger.cd.K0(2131747384));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo7 = this.C0.saved_info;
                                if (tL_paymentRequestedInfo7 != null && (tL_postAddress4 = tL_paymentRequestedInfo7.shipping_address) != null) {
                                    this.f[i14].setText(tL_postAddress4.state);
                                    break;
                                }
                                break;
                            case 4:
                                this.f[i14].setHint(org.telegram.messenger.cd.K0(2131747393));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo8 = this.C0.saved_info;
                                if (tL_paymentRequestedInfo8 != null && (tL_postAddress5 = tL_paymentRequestedInfo8.shipping_address) != null) {
                                    String str8 = (String) hashMap2.get(tL_postAddress5.country_iso2);
                                    String str9 = this.C0.saved_info.shipping_address.country_iso2;
                                    this.B0 = str9;
                                    EditTextBoldCursor editTextBoldCursor2 = this.f[i14];
                                    if (str8 == null) {
                                        str8 = str9;
                                    }
                                    editTextBoldCursor2.setText(str8);
                                    break;
                                }
                                break;
                            case 5:
                                this.f[i14].setHint(org.telegram.messenger.cd.K0(2131747383));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo9 = this.C0.saved_info;
                                if (tL_paymentRequestedInfo9 != null && (tL_postAddress6 = tL_paymentRequestedInfo9.shipping_address) != null) {
                                    this.f[i14].setText(tL_postAddress6.post_code);
                                    break;
                                }
                                break;
                            case 6:
                                this.f[i14].setHint(org.telegram.messenger.cd.K0(2131747389));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo10 = this.C0.saved_info;
                                if (tL_paymentRequestedInfo10 != null && (str6 = tL_paymentRequestedInfo10.name) != null) {
                                    this.f[i14].setText(str6);
                                    break;
                                }
                                break;
                            case 7:
                                this.f[i14].setHint(org.telegram.messenger.cd.K0(2131747392));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo11 = this.C0.saved_info;
                                if (tL_paymentRequestedInfo11 != null && (str7 = tL_paymentRequestedInfo11.email) != null) {
                                    this.f[i14].setText(str7);
                                    break;
                                }
                                break;
                        }
                        EditTextBoldCursor editTextBoldCursor3 = this.f[i14];
                        editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                        if (i14 == 8) {
                            TextView textView = new TextView(context);
                            this.H = textView;
                            textView.setText("+");
                            org.telegram.ui.ActionBar.a7.V(this.H, i30, getResourceProvider());
                            this.H.setTextSize(1, 16.0f);
                            frameLayout.addView(this.H, w7.b6.k(21.0f, 12.0f, 0.0f, 6.0f, -2, -2));
                            this.f[i14].setPadding(org.telegram.messenger.i0.L(10.0f), 0, 0, 0);
                            this.f[i14].setGravity(19);
                            this.f[i14].setFilters(new InputFilter[]{new InputFilter.LengthFilter(5)});
                            frameLayout.addView(this.f[i14], w7.b6.k(0.0f, 12.0f, 21.0f, 6.0f, 55, -2));
                            this.f[i14].addTextChangedListener(new gm0(this, 1));
                        } else if (i14 == 9) {
                            this.f[i14].setPadding(0, 0, 0, 0);
                            this.f[i14].setGravity(19);
                            frameLayout.addView(this.f[i14], w7.b6.k(0.0f, 12.0f, 21.0f, 6.0f, -1, -2));
                            this.f[i14].addTextChangedListener(new yr(this, 4));
                        } else {
                            this.f[i14].setPadding(0, 0, 0, org.telegram.messenger.i0.L(6.0f));
                            this.f[i14].setGravity(org.telegram.messenger.cd.X ? 5 : i20);
                            frameLayout.addView(this.f[i14], w7.b6.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                        }
                        final int i32 = i25;
                        this.f[i14].setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.ql0
                            public final /* synthetic */ sm0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.widget.TextView.OnEditorActionListener
                            public final boolean onEditorAction(TextView textView2, int i33, KeyEvent keyEvent) {
                                EditTextBoldCursor[] editTextBoldCursorArr;
                                switch (i32) {
                                    case 0:
                                        sm0 sm0Var = this.b;
                                        if (i33 != 6) {
                                            sm0Var.getClass();
                                            break;
                                        } else {
                                            sm0Var.F0(false);
                                            break;
                                        }
                                    case 1:
                                        sm0 sm0Var2 = this.b;
                                        if (i33 != 6) {
                                            sm0Var2.getClass();
                                            if (i33 == 5) {
                                                int intValue = ((Integer) textView2.getTag()).intValue();
                                                if (intValue != 0) {
                                                    if (intValue == 1) {
                                                        sm0Var2.f[2].requestFocus();
                                                        break;
                                                    }
                                                } else {
                                                    sm0Var2.f[1].requestFocus();
                                                    break;
                                                }
                                            }
                                        } else {
                                            sm0Var2.n.performClick();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        sm0 sm0Var3 = this.b;
                                        sm0Var3.getClass();
                                        if (i33 != 5) {
                                            if (i33 == 6) {
                                                sm0Var3.n.performClick();
                                                break;
                                            }
                                        } else {
                                            int intValue2 = ((Integer) textView2.getTag()).intValue();
                                            while (true) {
                                                intValue2++;
                                                EditTextBoldCursor[] editTextBoldCursorArr2 = sm0Var3.f;
                                                if (intValue2 >= editTextBoldCursorArr2.length) {
                                                    break;
                                                } else if (intValue2 != 4 && ((View) editTextBoldCursorArr2[intValue2].getParent()).getVisibility() == 0) {
                                                    sm0Var3.f[intValue2].requestFocus();
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 3:
                                        sm0 sm0Var4 = this.b;
                                        sm0Var4.getClass();
                                        if (i33 != 5) {
                                            if (i33 == 6) {
                                                sm0Var4.n.performClick();
                                                break;
                                            }
                                        } else {
                                            int intValue3 = ((Integer) textView2.getTag()).intValue();
                                            do {
                                                int i34 = intValue3 + 1;
                                                editTextBoldCursorArr = sm0Var4.f;
                                                if (i34 >= editTextBoldCursorArr.length) {
                                                    break;
                                                } else {
                                                    intValue3 = i34 == 4 ? intValue3 + 2 : i34;
                                                }
                                            } while (((View) editTextBoldCursorArr[intValue3].getParent()).getVisibility() != 0);
                                            sm0Var4.f[intValue3].requestFocus();
                                            break;
                                        }
                                        break;
                                    default:
                                        sm0 sm0Var5 = this.b;
                                        if (i33 != 6) {
                                            sm0Var5.getClass();
                                            break;
                                        } else {
                                            sm0Var5.n.performClick();
                                            break;
                                        }
                                }
                                return false;
                            }
                        });
                        if (i14 == 9) {
                            TLRPC.TL_invoice tL_invoice3 = this.C0.invoice;
                            if (tL_invoice3.email_to_provider || tL_invoice3.phone_to_provider) {
                                TLRPC.User user = null;
                                int i33 = 0;
                                while (i33 < this.C0.users.size()) {
                                    TLRPC.User user2 = this.C0.users.get(i33);
                                    int i34 = i20;
                                    int i35 = i19;
                                    if (user2.id == this.C0.provider_id) {
                                        user = user2;
                                    }
                                    i33++;
                                    i20 = i34;
                                    i19 = i35;
                                }
                                i16 = i19;
                                i17 = i20;
                                String n10 = user != null ? org.telegram.messenger.i5.n(user.first_name, user.last_name) : "";
                                this.M[1] = new org.telegram.ui.Cells.b9(context, this.Y0);
                                org.telegram.ui.ActionBar.a7.a0(this.M[1], context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.t6.b7);
                                this.Q.addView(this.M[1], w7.b6.o(-1, -2));
                                TLRPC.TL_invoice tL_invoice4 = this.C0.invoice;
                                boolean z11 = tL_invoice4.email_to_provider;
                                if (z11 && tL_invoice4.phone_to_provider) {
                                    this.M[1].setText(org.telegram.messenger.cd.Y(2131747401, "PaymentPhoneEmailToProvider", n10));
                                } else if (z11) {
                                    this.M[1].setText(org.telegram.messenger.cd.Y(2131747419, "PaymentEmailToProvider", n10));
                                } else {
                                    this.M[1].setText(org.telegram.messenger.cd.Y(2131747400, "PaymentPhoneToProvider", n10));
                                }
                            } else {
                                this.K[1] = new org.telegram.ui.Cells.c7(context, (Object) null);
                                this.Q.addView(this.K[1], w7.b6.o(-1, -2));
                                i16 = i19;
                                i17 = i20;
                            }
                            org.telegram.ui.Cells.t8 t8Var = new org.telegram.ui.Cells.t8(context, this.Y0);
                            this.L = t8Var;
                            org.telegram.ui.ActionBar.a7.S(t8Var, org.telegram.ui.ActionBar.t6.N0(true), org.telegram.ui.ActionBar.a7.N(org.telegram.ui.ActionBar.t6.d6), org.telegram.ui.ActionBar.a7.N(org.telegram.ui.ActionBar.t6.i6));
                            this.L.f(org.telegram.messenger.cd.K0(2131747386), this.T0, false);
                            this.Q.addView(this.L, w7.b6.o(-1, -2));
                            this.L.setOnClickListener(new nl0(this, 9));
                            this.M[0] = new org.telegram.ui.Cells.b9(context, this.Y0);
                            org.telegram.ui.ActionBar.a7.a0(this.M[0], context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.t6.b7);
                            this.M[0].setText(org.telegram.messenger.cd.K0(2131747385));
                            this.Q.addView(this.M[0], w7.b6.o(-1, -2));
                        } else {
                            i16 = i19;
                            i17 = i20;
                        }
                        i14++;
                        i20 = i17;
                        i19 = i16;
                        i26 = 10;
                        i25 = 2;
                        i27 = 1;
                        i13 = 0;
                    }
                    int i36 = i19;
                    int i37 = i20;
                    if (this.C0.invoice.name_requested) {
                        i15 = 8;
                        ((ViewGroup) this.f[i36].getParent()).setVisibility(8);
                    } else {
                        i15 = 8;
                    }
                    if (!this.C0.invoice.phone_requested) {
                        ((ViewGroup) this.f[i15].getParent()).setVisibility(i15);
                    }
                    if (!this.C0.invoice.email_requested) {
                        ((ViewGroup) this.f[7].getParent()).setVisibility(i15);
                    }
                    tL_invoice = this.C0.invoice;
                    if (!tL_invoice.phone_requested) {
                        this.f[9].setImeOptions(268435462);
                    } else if (tL_invoice.email_requested) {
                        this.f[7].setImeOptions(268435462);
                    } else if (tL_invoice.name_requested) {
                        this.f[i36].setImeOptions(268435462);
                    } else {
                        this.f[5].setImeOptions(268435462);
                    }
                    c7Var = this.K[1];
                    if (c7Var == null) {
                        TLRPC.TL_invoice tL_invoice5 = this.C0.invoice;
                        c7Var.setVisibility((tL_invoice5.name_requested || tL_invoice5.phone_requested || tL_invoice5.email_requested) ? 0 : 8);
                    } else {
                        org.telegram.ui.Cells.b9 b9Var = this.M[1];
                        if (b9Var != null) {
                            TLRPC.TL_invoice tL_invoice6 = this.C0.invoice;
                            b9Var.setVisibility((tL_invoice6.name_requested || tL_invoice6.phone_requested || tL_invoice6.email_requested) ? 0 : 8);
                        }
                    }
                    org.telegram.ui.Cells.p4 p4Var = this.I[1];
                    TLRPC.TL_invoice tL_invoice7 = this.C0.invoice;
                    p4Var.setVisibility((!tL_invoice7.name_requested || tL_invoice7.phone_requested || tL_invoice7.email_requested) ? 0 : 8);
                    if (!this.C0.invoice.shipping_address_requested) {
                        this.I[0].setVisibility(8);
                        this.K[0].setVisibility(8);
                        ((ViewGroup) this.f[0].getParent()).setVisibility(8);
                        ((ViewGroup) this.f[1].getParent()).setVisibility(8);
                        ((ViewGroup) this.f[2].getParent()).setVisibility(8);
                        ((ViewGroup) this.f[i37].getParent()).setVisibility(8);
                        ((ViewGroup) this.f[4].getParent()).setVisibility(8);
                        ((ViewGroup) this.f[5].getParent()).setVisibility(8);
                    }
                    tL_paymentRequestedInfo2 = this.C0.saved_info;
                    if (tL_paymentRequestedInfo2 != null || TextUtils.isEmpty(tL_paymentRequestedInfo2.phone)) {
                        s0(null);
                    } else {
                        s0(this.C0.saved_info.phone);
                    }
                    if (this.f[8].length() == 0) {
                        TLRPC.PaymentForm paymentForm3 = this.C0;
                        if (paymentForm3.invoice.phone_requested && ((tL_paymentRequestedInfo3 = paymentForm3.saved_info) == null || TextUtils.isEmpty(tL_paymentRequestedInfo3.phone))) {
                            try {
                                telephonyManager = (TelephonyManager) org.telegram.messenger.w0.b.getSystemService("phone");
                            } catch (Exception e10) {
                                org.telegram.messenger.f8.f(e10);
                            }
                            if (telephonyManager != null) {
                                str4 = telephonyManager.getSimCountryIso().toUpperCase();
                                if (str4 != null && (str5 = (String) hashMap.get(str4)) != null && this.a.indexOf(str5) != -1) {
                                    this.f[8].setText((CharSequence) this.b.get(str5));
                                }
                            }
                            str4 = null;
                            if (str4 != null) {
                                this.f[8].setText((CharSequence) this.b.get(str5));
                            }
                        }
                    }
                }
                e = e7;
                org.telegram.messenger.f8.f(e);
                Collections.sort(this.a, new f6(i24));
                this.f = new EditTextBoldCursor[10];
                i14 = i13;
                while (i14 < i26) {
                }
                int i362 = i19;
                int i372 = i20;
                if (this.C0.invoice.name_requested) {
                }
                if (!this.C0.invoice.phone_requested) {
                }
                if (!this.C0.invoice.email_requested) {
                }
                tL_invoice = this.C0.invoice;
                if (!tL_invoice.phone_requested) {
                }
                c7Var = this.K[1];
                if (c7Var == null) {
                }
                org.telegram.ui.Cells.p4 p4Var2 = this.I[1];
                TLRPC.TL_invoice tL_invoice72 = this.C0.invoice;
                p4Var2.setVisibility((!tL_invoice72.name_requested || tL_invoice72.phone_requested || tL_invoice72.email_requested) ? 0 : 8);
                if (!this.C0.invoice.shipping_address_requested) {
                }
                tL_paymentRequestedInfo2 = this.C0.saved_info;
                if (tL_paymentRequestedInfo2 != null) {
                }
                s0(null);
                if (this.f[8].length() == 0) {
                }
            }
        } else {
            int i38 = 3;
            int i39 = 2131747435;
            if (i23 == 2) {
                if (this.C0.native_params != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(this.C0.native_params.data);
                        String optString = jSONObject.optString("google_pay_public_key");
                        if (!TextUtils.isEmpty(optString)) {
                            this.K0 = optString;
                        }
                        this.L0 = jSONObject.optString("acquirer_bank_country");
                        this.M0 = jSONObject.optJSONObject("gpay_parameters");
                    } catch (Exception e11) {
                        org.telegram.messenger.f8.f(e11);
                    }
                }
                if (this.S0 || this.F0 != null) {
                    if (this.K0 != null || this.M0 != null) {
                        A0(context);
                    }
                    r0(context);
                    this.Q.addView(this.O, w7.b6.o(-1, 50));
                    this.z0 = true;
                    M0(true, true);
                    this.r.setVisibility(0);
                    this.n.setEnabled(false);
                    this.n.getContentView().setVisibility(4);
                    org.telegram.messenger.i0.u(context, true);
                    org.telegram.ui.Components.f81 f81Var = new org.telegram.ui.Components.f81(this, context);
                    this.x = f81Var;
                    f81Var.getSettings().setJavaScriptEnabled(true);
                    this.x.getSettings().setDomStorageEnabled(true);
                    this.x.getSettings().setSupportZoom(true);
                    this.x.getSettings().setBuiltInZoomControls(true);
                    this.x.getSettings().setDisplayZoomControls(false);
                    this.x.getSettings().setUseWideViewPort(true);
                    this.x.getSettings().setMixedContentMode(0);
                    CookieManager.getInstance().setAcceptThirdPartyCookies(this.x, true);
                    this.x.addJavascriptInterface(new PaymentFormActivity$TelegramWebviewProxy(this), "TelegramWebviewProxy");
                    this.x.setWebViewClient(new em0(this, context, 1));
                    this.Q.addView(this.x, w7.b6.c(-2.0f, -1));
                    this.K[2] = new org.telegram.ui.Cells.c7(context, (Object) null);
                    this.Q.addView(this.K[2], w7.b6.o(-1, -2));
                    org.telegram.ui.Cells.t8 t8Var2 = new org.telegram.ui.Cells.t8(context, this.Y0);
                    this.L = t8Var2;
                    org.telegram.ui.ActionBar.a7.S(t8Var2, org.telegram.ui.ActionBar.t6.N0(true), org.telegram.ui.ActionBar.a7.N(org.telegram.ui.ActionBar.t6.d6), org.telegram.ui.ActionBar.a7.N(org.telegram.ui.ActionBar.t6.i6));
                    this.L.f(org.telegram.messenger.cd.K0(2131747438), this.U0, false);
                    this.Q.addView(this.L, w7.b6.o(-1, -2));
                    this.L.setOnClickListener(new nl0(this, 10));
                    this.M[0] = new org.telegram.ui.Cells.b9(context, this.Y0);
                    org.telegram.ui.ActionBar.a7.a0(this.M[0], context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.t6.b7);
                    P0();
                    this.Q.addView(this.M[0], w7.b6.o(-1, -2));
                } else {
                    if (this.C0.native_params != null) {
                        try {
                            JSONObject jSONObject2 = new JSONObject(this.C0.native_params.data);
                            try {
                                this.g0 = jSONObject2.getBoolean("need_country");
                            } catch (Exception unused) {
                                this.g0 = false;
                            }
                            try {
                                this.h0 = jSONObject2.getBoolean("need_zip");
                            } catch (Exception unused2) {
                                this.h0 = false;
                            }
                            try {
                                this.i0 = jSONObject2.getBoolean("need_cardholder_name");
                            } catch (Exception unused3) {
                                this.i0 = false;
                            }
                            if (jSONObject2.has("public_token")) {
                                this.j0 = jSONObject2.getString("public_token");
                            } else {
                                try {
                                    this.j0 = jSONObject2.getString("publishable_key");
                                } catch (Exception unused4) {
                                    this.j0 = "";
                                }
                            }
                            this.k0 = !jSONObject2.optBoolean("google_pay_hidden", false);
                        } catch (Exception e12) {
                            org.telegram.messenger.f8.f(e12);
                        }
                    }
                    if (this.k0 && ((!TextUtils.isEmpty(this.j0) && "stripe".equals(this.C0.native_provider)) || this.M0 != null)) {
                        A0(context);
                    }
                    int i40 = 6;
                    this.f = new EditTextBoldCursor[6];
                    int i41 = 0;
                    while (i41 < i40) {
                        if (i41 == 0) {
                            this.I[0] = new org.telegram.ui.Cells.p4(context, this.Y0);
                            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, this.I[0], getResourceProvider());
                            this.I[0].setText(org.telegram.messenger.cd.K0(2131747435));
                            this.Q.addView(this.I[0], w7.b6.o(-1, -2));
                        } else if (i41 == 4) {
                            this.I[1] = new org.telegram.ui.Cells.p4(context, this.Y0);
                            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, this.I[1], getResourceProvider());
                            this.I[1].setText(org.telegram.messenger.cd.K0(2131747444));
                            this.Q.addView(this.I[1], w7.b6.o(-1, -2));
                        }
                        boolean z12 = (i41 == i38 || i41 == 5 || (i41 == 4 && !this.h0)) ? false : true;
                        FrameLayout frameLayout3 = new FrameLayout(context);
                        frameLayout3.setClipChildren(false);
                        int i42 = org.telegram.ui.ActionBar.t6.d6;
                        org.telegram.ui.ActionBar.a7.i(i42, frameLayout3, getResourceProvider());
                        this.Q.addView(frameLayout3, w7.b6.o(-1, 50));
                        this.f[i41] = new EditTextBoldCursor(context);
                        this.f[i41].setTag(Integer.valueOf(i41));
                        this.f[i41].setTextSize(1, 16.0f);
                        org.telegram.ui.ActionBar.a7.E(this.f[i41], org.telegram.ui.ActionBar.t6.H6, getResourceProvider());
                        EditTextBoldCursor editTextBoldCursor4 = this.f[i41];
                        int i43 = org.telegram.ui.ActionBar.t6.G6;
                        org.telegram.ui.ActionBar.a7.V(editTextBoldCursor4, i43, getResourceProvider());
                        this.f[i41].setBackgroundDrawable(null);
                        org.telegram.ui.ActionBar.a7.w(this.f[i41], i43, getResourceProvider());
                        this.f[i41].setCursorSize(org.telegram.messenger.i0.L(20.0f));
                        this.f[i41].setCursorWidth(1.5f);
                        if (i41 == 3) {
                            this.f[i41].setFilters(new InputFilter[]{new InputFilter.LengthFilter(3)});
                            this.f[i41].setInputType(org.telegram.messenger.zs.O1);
                            this.f[i41].setTypeface(Typeface.DEFAULT);
                            this.f[i41].setTransformationMethod(PasswordTransformationMethod.getInstance());
                        } else if (i41 == 0) {
                            this.f[i41].setInputType(3);
                        } else if (i41 == 4) {
                            final int i44 = 1;
                            this.f[i41].setOnTouchListener(new View.OnTouchListener(this) { // from class: org.telegram.ui.ol0
                                public final /* synthetic */ sm0 b;

                                {
                                    this.b = this;
                                }

                                @Override // android.view.View.OnTouchListener
                                public final boolean onTouch(View view, MotionEvent motionEvent) {
                                    switch (i44) {
                                        case 0:
                                            sm0 sm0Var = this.b;
                                            if (sm0Var.getParentActivity() != null) {
                                                if (motionEvent.getAction() == 1) {
                                                    rt rtVar = new rt(null, false);
                                                    rtVar.n = true;
                                                    rtVar.r = new sl0(sm0Var, 4);
                                                    sm0Var.presentFragment(rtVar);
                                                }
                                                break;
                                            }
                                            break;
                                        default:
                                            sm0 sm0Var2 = this.b;
                                            if (sm0Var2.getParentActivity() != null) {
                                                if (motionEvent.getAction() == 1) {
                                                    rt rtVar2 = new rt(null, false);
                                                    rtVar2.n = true;
                                                    rtVar2.r = new sl0(sm0Var2, 2);
                                                    sm0Var2.presentFragment(rtVar2);
                                                }
                                                break;
                                            }
                                            break;
                                    }
                                    return true;
                                }
                            });
                            this.f[i41].setInputType(0);
                        } else if (i41 == 1) {
                            this.f[i41].setInputType(16386);
                        } else if (i41 == 2) {
                            this.f[i41].setInputType(4097);
                        } else {
                            this.f[i41].setInputType(16385);
                            this.f[i41].setImeOptions(268435461);
                            if (i41 != 0) {
                                this.f[i41].setHint(org.telegram.messenger.cd.K0(2131747439));
                            } else if (i41 == 1) {
                                this.f[i41].setHint(org.telegram.messenger.cd.K0(2131747442));
                            } else if (i41 == 2) {
                                this.f[i41].setHint(org.telegram.messenger.cd.K0(2131747440));
                            } else if (i41 == 3) {
                                this.f[i41].setHint(org.telegram.messenger.cd.K0(2131747443));
                            } else if (i41 == 4) {
                                this.f[i41].setHint(org.telegram.messenger.cd.K0(2131747393));
                            } else if (i41 == 5) {
                                this.f[i41].setHint(org.telegram.messenger.cd.K0(2131747383));
                            }
                            if (i41 != 0) {
                                this.f[i41].addTextChangedListener(new mm0(this));
                            } else if (i41 == 1) {
                                this.f[i41].addTextChangedListener(new nm0(this));
                            }
                            this.f[i41].setPadding(0, 0, 0, org.telegram.messenger.i0.L(6.0f));
                            this.f[i41].setGravity(!org.telegram.messenger.cd.X ? 5 : 3);
                            frameLayout3.addView(this.f[i41], w7.b6.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                            final int i45 = 3;
                            this.f[i41].setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.ql0
                                public final /* synthetic */ sm0 b;

                                {
                                    this.b = this;
                                }

                                @Override // android.widget.TextView.OnEditorActionListener
                                public final boolean onEditorAction(TextView textView2, int i332, KeyEvent keyEvent) {
                                    EditTextBoldCursor[] editTextBoldCursorArr;
                                    switch (i45) {
                                        case 0:
                                            sm0 sm0Var = this.b;
                                            if (i332 != 6) {
                                                sm0Var.getClass();
                                                break;
                                            } else {
                                                sm0Var.F0(false);
                                                break;
                                            }
                                        case 1:
                                            sm0 sm0Var2 = this.b;
                                            if (i332 != 6) {
                                                sm0Var2.getClass();
                                                if (i332 == 5) {
                                                    int intValue = ((Integer) textView2.getTag()).intValue();
                                                    if (intValue != 0) {
                                                        if (intValue == 1) {
                                                            sm0Var2.f[2].requestFocus();
                                                            break;
                                                        }
                                                    } else {
                                                        sm0Var2.f[1].requestFocus();
                                                        break;
                                                    }
                                                }
                                            } else {
                                                sm0Var2.n.performClick();
                                                break;
                                            }
                                            break;
                                        case 2:
                                            sm0 sm0Var3 = this.b;
                                            sm0Var3.getClass();
                                            if (i332 != 5) {
                                                if (i332 == 6) {
                                                    sm0Var3.n.performClick();
                                                    break;
                                                }
                                            } else {
                                                int intValue2 = ((Integer) textView2.getTag()).intValue();
                                                while (true) {
                                                    intValue2++;
                                                    EditTextBoldCursor[] editTextBoldCursorArr2 = sm0Var3.f;
                                                    if (intValue2 >= editTextBoldCursorArr2.length) {
                                                        break;
                                                    } else if (intValue2 != 4 && ((View) editTextBoldCursorArr2[intValue2].getParent()).getVisibility() == 0) {
                                                        sm0Var3.f[intValue2].requestFocus();
                                                        break;
                                                    }
                                                }
                                            }
                                            break;
                                        case 3:
                                            sm0 sm0Var4 = this.b;
                                            sm0Var4.getClass();
                                            if (i332 != 5) {
                                                if (i332 == 6) {
                                                    sm0Var4.n.performClick();
                                                    break;
                                                }
                                            } else {
                                                int intValue3 = ((Integer) textView2.getTag()).intValue();
                                                do {
                                                    int i342 = intValue3 + 1;
                                                    editTextBoldCursorArr = sm0Var4.f;
                                                    if (i342 >= editTextBoldCursorArr.length) {
                                                        break;
                                                    } else {
                                                        intValue3 = i342 == 4 ? intValue3 + 2 : i342;
                                                    }
                                                } while (((View) editTextBoldCursorArr[intValue3].getParent()).getVisibility() != 0);
                                                sm0Var4.f[intValue3].requestFocus();
                                                break;
                                            }
                                            break;
                                        default:
                                            sm0 sm0Var5 = this.b;
                                            if (i332 != 6) {
                                                sm0Var5.getClass();
                                                break;
                                            } else {
                                                sm0Var5.n.performClick();
                                                break;
                                            }
                                    }
                                    return false;
                                }
                            });
                            if (i41 != 3) {
                                this.K[0] = new org.telegram.ui.Cells.c7(context, (Object) null);
                                this.Q.addView(this.K[0], w7.b6.o(-1, -2));
                            } else if (i41 == 5) {
                                this.K[2] = new org.telegram.ui.Cells.c7(context, (Object) null);
                                this.Q.addView(this.K[2], w7.b6.o(-1, -2));
                                org.telegram.ui.Cells.t8 t8Var3 = new org.telegram.ui.Cells.t8(context, this.Y0);
                                this.L = t8Var3;
                                org.telegram.ui.ActionBar.a7.S(t8Var3, org.telegram.ui.ActionBar.t6.N0(true), org.telegram.ui.ActionBar.a7.N(i42), org.telegram.ui.ActionBar.a7.N(org.telegram.ui.ActionBar.t6.i6));
                                this.L.f(org.telegram.messenger.cd.K0(2131747438), this.U0, false);
                                this.Q.addView(this.L, w7.b6.o(-1, -2));
                                this.L.setOnClickListener(new nl0(this, 11));
                                this.M[0] = new org.telegram.ui.Cells.b9(context, this.Y0);
                                org.telegram.ui.ActionBar.a7.a0(this.M[0], context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.t6.b7);
                                P0();
                                this.Q.addView(this.M[0], w7.b6.o(-1, -2));
                            } else if (i41 == 0) {
                                r0(context);
                                frameLayout3.addView(this.O, w7.b6.d(-2, -2.0f, (org.telegram.messenger.cd.X ? 3 : 5) | 16, 0.0f, 0.0f, 4.0f, 0.0f));
                            }
                            if (z12) {
                                org.telegram.ui.Components.bn bnVar2 = new org.telegram.ui.Components.bn(context, 15);
                                org.telegram.ui.ActionBar.a7.i(i42, bnVar2, getResourceProvider());
                                this.J.add(bnVar2);
                                frameLayout3.addView(bnVar2, new FrameLayout.LayoutParams(-1, 1, 83));
                            }
                            if ((i41 == 4 && !this.g0) || ((i41 == 5 && !this.h0) || (i41 == 2 && !this.i0))) {
                                frameLayout3.setVisibility(8);
                            }
                            i41++;
                            i40 = 6;
                            i38 = 3;
                        }
                        this.f[i41].setImeOptions(268435461);
                        if (i41 != 0) {
                        }
                        if (i41 != 0) {
                        }
                        this.f[i41].setPadding(0, 0, 0, org.telegram.messenger.i0.L(6.0f));
                        this.f[i41].setGravity(!org.telegram.messenger.cd.X ? 5 : 3);
                        frameLayout3.addView(this.f[i41], w7.b6.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                        final int i452 = 3;
                        this.f[i41].setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.ql0
                            public final /* synthetic */ sm0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.widget.TextView.OnEditorActionListener
                            public final boolean onEditorAction(TextView textView2, int i332, KeyEvent keyEvent) {
                                EditTextBoldCursor[] editTextBoldCursorArr;
                                switch (i452) {
                                    case 0:
                                        sm0 sm0Var = this.b;
                                        if (i332 != 6) {
                                            sm0Var.getClass();
                                            break;
                                        } else {
                                            sm0Var.F0(false);
                                            break;
                                        }
                                    case 1:
                                        sm0 sm0Var2 = this.b;
                                        if (i332 != 6) {
                                            sm0Var2.getClass();
                                            if (i332 == 5) {
                                                int intValue = ((Integer) textView2.getTag()).intValue();
                                                if (intValue != 0) {
                                                    if (intValue == 1) {
                                                        sm0Var2.f[2].requestFocus();
                                                        break;
                                                    }
                                                } else {
                                                    sm0Var2.f[1].requestFocus();
                                                    break;
                                                }
                                            }
                                        } else {
                                            sm0Var2.n.performClick();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        sm0 sm0Var3 = this.b;
                                        sm0Var3.getClass();
                                        if (i332 != 5) {
                                            if (i332 == 6) {
                                                sm0Var3.n.performClick();
                                                break;
                                            }
                                        } else {
                                            int intValue2 = ((Integer) textView2.getTag()).intValue();
                                            while (true) {
                                                intValue2++;
                                                EditTextBoldCursor[] editTextBoldCursorArr2 = sm0Var3.f;
                                                if (intValue2 >= editTextBoldCursorArr2.length) {
                                                    break;
                                                } else if (intValue2 != 4 && ((View) editTextBoldCursorArr2[intValue2].getParent()).getVisibility() == 0) {
                                                    sm0Var3.f[intValue2].requestFocus();
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 3:
                                        sm0 sm0Var4 = this.b;
                                        sm0Var4.getClass();
                                        if (i332 != 5) {
                                            if (i332 == 6) {
                                                sm0Var4.n.performClick();
                                                break;
                                            }
                                        } else {
                                            int intValue3 = ((Integer) textView2.getTag()).intValue();
                                            do {
                                                int i342 = intValue3 + 1;
                                                editTextBoldCursorArr = sm0Var4.f;
                                                if (i342 >= editTextBoldCursorArr.length) {
                                                    break;
                                                } else {
                                                    intValue3 = i342 == 4 ? intValue3 + 2 : i342;
                                                }
                                            } while (((View) editTextBoldCursorArr[intValue3].getParent()).getVisibility() != 0);
                                            sm0Var4.f[intValue3].requestFocus();
                                            break;
                                        }
                                        break;
                                    default:
                                        sm0 sm0Var5 = this.b;
                                        if (i332 != 6) {
                                            sm0Var5.getClass();
                                            break;
                                        } else {
                                            sm0Var5.n.performClick();
                                            break;
                                        }
                                }
                                return false;
                            }
                        });
                        if (i41 != 3) {
                        }
                        if (z12) {
                        }
                        if (i41 == 4) {
                            frameLayout3.setVisibility(8);
                            i41++;
                            i40 = 6;
                            i38 = 3;
                        }
                        frameLayout3.setVisibility(8);
                        i41++;
                        i40 = 6;
                        i38 = 3;
                    }
                    if (!this.g0 && !this.h0) {
                        this.I[1].setVisibility(8);
                        this.K[0].setVisibility(8);
                    }
                    if (this.h0) {
                        this.f[5].setImeOptions(268435462);
                    } else {
                        this.f[3].setImeOptions(268435462);
                    }
                }
            } else {
                int i46 = 12;
                if (i23 == 1) {
                    ArrayList<TLRPC.TL_shippingOption> arrayList = this.E0.shipping_options;
                    int size = arrayList == null ? 0 : arrayList.size();
                    this.h = new org.telegram.ui.Cells.m6[size];
                    int i47 = 0;
                    while (i47 < size) {
                        TLRPC.TL_shippingOption tL_shippingOption = this.E0.shipping_options.get(i47);
                        this.h[i47] = new org.telegram.ui.Cells.m6(context);
                        this.h[i47].setTag(Integer.valueOf(i47));
                        org.telegram.ui.ActionBar.a7.S(this.h[i47], org.telegram.ui.ActionBar.t6.N0(true), org.telegram.ui.ActionBar.a7.N(org.telegram.ui.ActionBar.t6.d6), org.telegram.ui.ActionBar.a7.N(org.telegram.ui.ActionBar.t6.i6));
                        this.h[i47].c(a1.g.C(x0(tL_shippingOption.prices), " - ", tL_shippingOption.title), i47 == 0, i47 != size + (-1));
                        this.h[i47].setOnClickListener(new nl0(this, i46));
                        this.Q.addView(this.h[i47]);
                        i47++;
                    }
                    this.M[0] = new org.telegram.ui.Cells.b9(context, this.Y0);
                    org.telegram.ui.ActionBar.a7.a0(this.M[0], context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.t6.b7);
                    this.Q.addView(this.M[0], w7.b6.o(-1, -2));
                } else if (i23 == 3) {
                    this.f = new EditTextBoldCursor[2];
                    int i48 = 0;
                    for (int i49 = 2; i48 < i49; i49 = 2) {
                        if (i48 == 0) {
                            z10 = false;
                            this.I[0] = new org.telegram.ui.Cells.p4(context, this.Y0);
                            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, this.I[0], getResourceProvider());
                            this.I[0].setText(org.telegram.messenger.cd.K0(i39));
                            this.Q.addView(this.I[0], w7.b6.o(-1, -2));
                        } else {
                            z10 = false;
                        }
                        FrameLayout frameLayout4 = new FrameLayout(context);
                        frameLayout4.setClipChildren(z10);
                        this.Q.addView(frameLayout4, w7.b6.o(-1, 50));
                        int i50 = org.telegram.ui.ActionBar.t6.d6;
                        org.telegram.ui.ActionBar.a7.i(i50, frameLayout4, getResourceProvider());
                        boolean z13 = i48 != 1;
                        if (z13) {
                            if (i48 != 7 || this.C0.invoice.phone_requested) {
                                if (i48 == 6) {
                                    TLRPC.TL_invoice tL_invoice8 = this.C0.invoice;
                                    if (!tL_invoice8.phone_requested) {
                                    }
                                }
                            }
                            z13 = false;
                        }
                        if (z13) {
                            org.telegram.ui.Components.bn bnVar3 = new org.telegram.ui.Components.bn(context, i46);
                            org.telegram.ui.ActionBar.a7.i(i50, bnVar3, getResourceProvider());
                            this.J.add(bnVar3);
                            frameLayout4.addView(bnVar3, new FrameLayout.LayoutParams(-1, 1, 83));
                        }
                        this.f[i48] = new EditTextBoldCursor(context);
                        this.f[i48].setTag(Integer.valueOf(i48));
                        this.f[i48].setTextSize(1, 16.0f);
                        org.telegram.ui.ActionBar.a7.E(this.f[i48], org.telegram.ui.ActionBar.t6.H6, getResourceProvider());
                        EditTextBoldCursor editTextBoldCursor5 = this.f[i48];
                        int i51 = org.telegram.ui.ActionBar.t6.G6;
                        org.telegram.ui.ActionBar.a7.V(editTextBoldCursor5, i51, getResourceProvider());
                        this.f[i48].setBackgroundDrawable(null);
                        org.telegram.ui.ActionBar.a7.w(this.f[i48], i51, getResourceProvider());
                        this.f[i48].setCursorSize(org.telegram.messenger.i0.L(20.0f));
                        this.f[i48].setCursorWidth(1.5f);
                        if (i48 == 0) {
                            this.f[i48].setOnTouchListener(new org.telegram.ui.ActionBar.n2(28));
                            this.f[i48].setInputType(0);
                        } else {
                            this.f[i48].setInputType(org.telegram.messenger.zs.N1);
                            this.f[i48].setTypeface(Typeface.DEFAULT);
                        }
                        this.f[i48].setImeOptions(268435462);
                        if (i48 == 0) {
                            EditTextBoldCursor editTextBoldCursor6 = this.f[i48];
                            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = this.y0;
                            editTextBoldCursor6.setText(tL_paymentSavedCredentialsCard == null ? "" : tL_paymentSavedCredentialsCard.title);
                        } else if (i48 == 1) {
                            this.f[i48].setHint(org.telegram.messenger.cd.K0(2131748737));
                            this.f[i48].requestFocus();
                        }
                        this.f[i48].setPadding(0, 0, 0, org.telegram.messenger.i0.L(6.0f));
                        this.f[i48].setGravity(org.telegram.messenger.cd.X ? 5 : 3);
                        frameLayout4.addView(this.f[i48], w7.b6.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                        final int i52 = 4;
                        this.f[i48].setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.ql0
                            public final /* synthetic */ sm0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.widget.TextView.OnEditorActionListener
                            public final boolean onEditorAction(TextView textView2, int i332, KeyEvent keyEvent) {
                                EditTextBoldCursor[] editTextBoldCursorArr;
                                switch (i52) {
                                    case 0:
                                        sm0 sm0Var = this.b;
                                        if (i332 != 6) {
                                            sm0Var.getClass();
                                            break;
                                        } else {
                                            sm0Var.F0(false);
                                            break;
                                        }
                                    case 1:
                                        sm0 sm0Var2 = this.b;
                                        if (i332 != 6) {
                                            sm0Var2.getClass();
                                            if (i332 == 5) {
                                                int intValue = ((Integer) textView2.getTag()).intValue();
                                                if (intValue != 0) {
                                                    if (intValue == 1) {
                                                        sm0Var2.f[2].requestFocus();
                                                        break;
                                                    }
                                                } else {
                                                    sm0Var2.f[1].requestFocus();
                                                    break;
                                                }
                                            }
                                        } else {
                                            sm0Var2.n.performClick();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        sm0 sm0Var3 = this.b;
                                        sm0Var3.getClass();
                                        if (i332 != 5) {
                                            if (i332 == 6) {
                                                sm0Var3.n.performClick();
                                                break;
                                            }
                                        } else {
                                            int intValue2 = ((Integer) textView2.getTag()).intValue();
                                            while (true) {
                                                intValue2++;
                                                EditTextBoldCursor[] editTextBoldCursorArr2 = sm0Var3.f;
                                                if (intValue2 >= editTextBoldCursorArr2.length) {
                                                    break;
                                                } else if (intValue2 != 4 && ((View) editTextBoldCursorArr2[intValue2].getParent()).getVisibility() == 0) {
                                                    sm0Var3.f[intValue2].requestFocus();
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 3:
                                        sm0 sm0Var4 = this.b;
                                        sm0Var4.getClass();
                                        if (i332 != 5) {
                                            if (i332 == 6) {
                                                sm0Var4.n.performClick();
                                                break;
                                            }
                                        } else {
                                            int intValue3 = ((Integer) textView2.getTag()).intValue();
                                            do {
                                                int i342 = intValue3 + 1;
                                                editTextBoldCursorArr = sm0Var4.f;
                                                if (i342 >= editTextBoldCursorArr.length) {
                                                    break;
                                                } else {
                                                    intValue3 = i342 == 4 ? intValue3 + 2 : i342;
                                                }
                                            } while (((View) editTextBoldCursorArr[intValue3].getParent()).getVisibility() != 0);
                                            sm0Var4.f[intValue3].requestFocus();
                                            break;
                                        }
                                        break;
                                    default:
                                        sm0 sm0Var5 = this.b;
                                        if (i332 != 6) {
                                            sm0Var5.getClass();
                                            break;
                                        } else {
                                            sm0Var5.n.performClick();
                                            break;
                                        }
                                }
                                return false;
                            }
                        });
                        if (i48 == 1) {
                            this.M[0] = new org.telegram.ui.Cells.b9(context, this.Y0);
                            org.telegram.ui.Cells.b9 b9Var2 = this.M[0];
                            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = this.y0;
                            b9Var2.setText(org.telegram.messenger.cd.Y(2131747422, "PaymentConfirmationMessage", tL_paymentSavedCredentialsCard2 == null ? "" : tL_paymentSavedCredentialsCard2.title));
                            org.telegram.ui.Cells.b9 b9Var3 = this.M[0];
                            int i53 = org.telegram.ui.ActionBar.t6.b7;
                            org.telegram.ui.ActionBar.a7.a0(b9Var3, context, R.drawable.greydivider, i53);
                            this.Q.addView(this.M[0], w7.b6.o(-1, -2));
                            this.N[0] = new org.telegram.ui.Cells.x9(context, this.Y0);
                            org.telegram.ui.ActionBar.a7.S(this.N[0], org.telegram.ui.ActionBar.t6.N0(true), org.telegram.ui.ActionBar.a7.N(i50), org.telegram.ui.ActionBar.a7.N(org.telegram.ui.ActionBar.t6.i6));
                            this.N[0].b(org.telegram.messenger.cd.K0(2131747421), false);
                            this.Q.addView(this.N[0], w7.b6.o(-1, -2));
                            this.N[0].setOnClickListener(new nl0(this, 14));
                            this.M[1] = new org.telegram.ui.Cells.b9(context, this.Y0);
                            org.telegram.ui.ActionBar.a7.a0(this.M[1], context, R.drawable.greydivider_bottom, i53);
                            this.Q.addView(this.M[1], w7.b6.o(-1, -2));
                        }
                        i48++;
                        i46 = 12;
                        i39 = 2131747435;
                    }
                } else if (i23 == 4 || i23 == 5) {
                    org.telegram.ui.Cells.o5 o5Var = new org.telegram.ui.Cells.o5(context);
                    this.X = o5Var;
                    org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, o5Var, getResourceProvider());
                    org.telegram.messenger.jj jjVar = this.N0;
                    if (jjVar != null) {
                        this.X.b((TLRPC.TL_messageMediaInvoice) jjVar.k.media, this.p0);
                    } else {
                        TLRPC.PaymentReceipt paymentReceipt = this.D0;
                        if (paymentReceipt != null) {
                            this.X.c(paymentReceipt, this.p0);
                        } else if (this.O0 != null || this.b1 != null) {
                            org.telegram.ui.Cells.o5 o5Var2 = this.X;
                            TLRPC.PaymentForm paymentForm4 = this.C0;
                            o5Var2.a(paymentForm4.title, paymentForm4.description, paymentForm4.photo, this.p0, paymentForm4);
                        }
                    }
                    this.Q.addView(this.X, w7.b6.o(-1, -2));
                    this.K[0] = new org.telegram.ui.Cells.c7(context, (Object) null);
                    this.Q.addView(this.K[0], w7.b6.o(-1, -2));
                    ArrayList arrayList2 = new ArrayList(this.C0.invoice.prices);
                    this.t0 = arrayList2;
                    TLRPC.TL_shippingOption tL_shippingOption2 = this.G0;
                    if (tL_shippingOption2 != null) {
                        arrayList2.addAll(tL_shippingOption2.prices);
                    }
                    this.R0 = new String[1];
                    for (int i54 = 0; i54 < this.t0.size(); i54++) {
                        TLRPC.TL_labeledPrice tL_labeledPrice = (TLRPC.TL_labeledPrice) this.t0.get(i54);
                        org.telegram.ui.Cells.c9 c9Var = new org.telegram.ui.Cells.c9(context);
                        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, c9Var, getResourceProvider());
                        c9Var.a(tL_labeledPrice.label, org.telegram.messenger.cd.D0().p(tL_labeledPrice.amount, this.C0.invoice.currency), false);
                        this.Q.addView(c9Var);
                    }
                    if (this.u0 == 5 && this.H0 != null) {
                        org.telegram.ui.Cells.c9 c9Var2 = new org.telegram.ui.Cells.c9(context);
                        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, c9Var2, getResourceProvider());
                        c9Var2.a(org.telegram.messenger.cd.K0(2131747373), org.telegram.messenger.cd.D0().p(this.H0.longValue(), this.C0.invoice.currency), false);
                        this.Q.addView(c9Var2);
                    }
                    org.telegram.ui.Cells.c9 c9Var3 = new org.telegram.ui.Cells.c9(context);
                    this.R = c9Var3;
                    int i55 = org.telegram.ui.ActionBar.t6.d6;
                    org.telegram.ui.ActionBar.a7.i(i55, c9Var3, getResourceProvider());
                    this.R0[0] = x0(this.t0);
                    this.R.a(org.telegram.messenger.cd.K0(2131747369), this.R0[0], true);
                    float f7 = 14.0f;
                    if (this.u0 != 4 || (this.C0.invoice.flags & 256) == 0) {
                        i10 = 8;
                        i11 = -2;
                        str = "";
                        i12 = 5;
                    } else {
                        FrameLayout frameLayout5 = new FrameLayout(context);
                        frameLayout5.setClipChildren(false);
                        org.telegram.ui.ActionBar.a7.i(i55, frameLayout5, getResourceProvider());
                        this.Q.addView(frameLayout5, w7.b6.o(-1, this.C0.invoice.suggested_tip_amounts.isEmpty() ? 40 : 78));
                        frameLayout5.setOnClickListener(new nl0(this, 0));
                        org.telegram.ui.Cells.c9 c9Var4 = new org.telegram.ui.Cells.c9(context);
                        org.telegram.ui.ActionBar.a7.i(i55, c9Var4, getResourceProvider());
                        c9Var4.a(org.telegram.messenger.cd.K0(2131747372), "", false);
                        frameLayout5.addView(c9Var4);
                        this.f = new EditTextBoldCursor[]{new EditTextBoldCursor(context)};
                        this.f[0].setTag(0);
                        this.f[0].setTextSize(1, 16.0f);
                        EditTextBoldCursor editTextBoldCursor7 = this.f[0];
                        int i56 = org.telegram.ui.ActionBar.t6.z6;
                        org.telegram.ui.ActionBar.a7.E(editTextBoldCursor7, i56, getResourceProvider());
                        org.telegram.ui.ActionBar.a7.V(this.f[0], i56, getResourceProvider());
                        this.f[0].setBackgroundDrawable(null);
                        org.telegram.ui.ActionBar.a7.w(this.f[0], org.telegram.ui.ActionBar.t6.G6, getResourceProvider());
                        this.f[0].setCursorSize(org.telegram.messenger.i0.L(20.0f));
                        this.f[0].setCursorWidth(1.5f);
                        this.f[0].setInputType(3);
                        this.f[0].setImeOptions(268435462);
                        str = "";
                        this.f[0].setHint(org.telegram.messenger.cd.D0().p(0L, this.C0.invoice.currency));
                        this.f[0].setPadding(0, 0, 0, org.telegram.messenger.i0.L(6.0f));
                        this.f[0].setGravity(org.telegram.messenger.cd.X ? 3 : 5);
                        frameLayout5.addView(this.f[0], w7.b6.d(-1, -2.0f, 51, 21.0f, 9.0f, 21.0f, 1.0f));
                        this.f[0].addTextChangedListener(new wl0(this));
                        int i57 = 5;
                        this.f[0].setOnEditorActionListener(new ig.r(i57));
                        this.f[0].requestFocus();
                        if (this.C0.invoice.suggested_tip_amounts.isEmpty()) {
                            i10 = 8;
                            i11 = -2;
                            i12 = 5;
                        } else {
                            HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
                            horizontalScrollView.setHorizontalScrollBarEnabled(false);
                            horizontalScrollView.setVerticalScrollBarEnabled(false);
                            horizontalScrollView.setClipToPadding(false);
                            horizontalScrollView.setPadding(org.telegram.messenger.i0.L(21.0f), 0, org.telegram.messenger.i0.L(21.0f), 0);
                            horizontalScrollView.setFillViewport(true);
                            frameLayout5.addView(horizontalScrollView, w7.b6.d(-1, 30.0f, 51, 0.0f, 44.0f, 0.0f, 0.0f));
                            int[] iArr = new int[1];
                            int[] iArr2 = new int[1];
                            int size2 = this.C0.invoice.suggested_tip_amounts.size();
                            xl0 xl0Var = new xl0(context, size2, iArr, iArr2);
                            this.s0 = xl0Var;
                            xl0Var.setOrientation(0);
                            horizontalScrollView.addView(this.s0, w7.b6.x(-1, 30, 51));
                            int themedColor = getThemedColor(org.telegram.ui.ActionBar.t6.Si);
                            int i58 = 0;
                            while (i58 < size2) {
                                long longValue = org.telegram.messenger.cd.X ? this.C0.invoice.suggested_tip_amounts.get((size2 - i58) - 1).longValue() : this.C0.invoice.suggested_tip_amounts.get(i58).longValue();
                                String p9 = org.telegram.messenger.cd.D0().p(longValue, this.C0.invoice.currency);
                                TextView g10 = org.telegram.messenger.m5.g(context, 1, f7);
                                g10.setTypeface(org.telegram.messenger.i0.o());
                                g10.setLines(1);
                                g10.setTag(Long.valueOf(longValue));
                                g10.setMaxLines(1);
                                g10.setText(p9);
                                g10.setPadding(org.telegram.messenger.i0.L(15.0f), 0, org.telegram.messenger.i0.L(15.0f), 0);
                                org.telegram.ui.ActionBar.a7.V(g10, org.telegram.ui.ActionBar.t6.Z8, getResourceProvider());
                                g10.setBackground(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(15.0f), themedColor & 536870911));
                                g10.setSingleLine(true);
                                g10.setGravity(17);
                                this.s0.addView(g10, w7.b6.t(-2, -1, 19, 0, 0, i58 != size2 + (-1) ? 9 : 0, 0));
                                g10.setOnClickListener(new zn(this, g10, longValue, 5));
                                int L = org.telegram.messenger.i0.L(30.0f) + ((int) Math.ceil(g10.getPaint().measureText(p9)));
                                g10.setTag(R.id.width_tag, Integer.valueOf(L));
                                iArr[0] = Math.max(iArr[0], L);
                                iArr2[0] = iArr2[0] + L;
                                i58++;
                                i22 = -2;
                                i57 = 5;
                                f7 = 14.0f;
                            }
                            i11 = i22;
                            i12 = i57;
                            i10 = 8;
                        }
                    }
                    this.Q.addView(this.R);
                    this.K[2] = new org.telegram.ui.Cells.c7(context, (Object) null);
                    org.telegram.ui.ActionBar.a7.a0(this.K[2], context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.t6.b7);
                    this.Q.addView(this.K[2], w7.b6.o(-1, i11));
                    this.Y[0] = new yl0(context);
                    org.telegram.ui.ActionBar.a7.S(this.Y[0], org.telegram.ui.ActionBar.t6.N0(true), org.telegram.ui.ActionBar.a7.N(org.telegram.ui.ActionBar.t6.d6), org.telegram.ui.ActionBar.a7.N(org.telegram.ui.ActionBar.t6.i6));
                    org.telegram.ui.Cells.a9 a9Var = this.Y[0];
                    String str10 = this.x0;
                    a9Var.b(R.drawable.msg_payment_card, (str10 == null || str10.length() <= 1) ? this.x0 : this.x0.substring(0, 1).toUpperCase() + this.x0.substring(1), org.telegram.messenger.cd.K0(2131747430), true);
                    int i59 = ((this.V0 || this.W0) && ((str2 = this.x0) == null || str2.length() <= 1)) ? i10 : 0;
                    this.Y[0].setVisibility(i59);
                    this.Q.addView(this.Y[0]);
                    if (this.u0 == 4) {
                        this.Y[0].setOnClickListener(new nl0(this, 1));
                    }
                    TLRPC.User user3 = null;
                    for (int i60 = 0; i60 < this.C0.users.size(); i60++) {
                        TLRPC.User user4 = this.C0.users.get(i60);
                        if (user4.id == this.C0.provider_id) {
                            user3 = user4;
                        }
                    }
                    char c11 = 1;
                    this.Y[1] = new org.telegram.ui.Cells.a9(context);
                    org.telegram.ui.Cells.a9 a9Var2 = this.Y[1];
                    org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.t6.N0(true);
                    int i61 = org.telegram.ui.ActionBar.t6.d6;
                    org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i61);
                    int i62 = org.telegram.ui.ActionBar.t6.i6;
                    org.telegram.ui.ActionBar.a7.S(a9Var2, N0, N, org.telegram.ui.ActionBar.a7.N(i62));
                    if (user3 != null) {
                        org.telegram.ui.Cells.a9 a9Var3 = this.Y[1];
                        str3 = org.telegram.messenger.i5.n(user3.first_name, user3.last_name);
                        String K0 = org.telegram.messenger.cd.K0(2131747425);
                        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo = this.I0;
                        a9Var3.b(R.drawable.msg_payment_provider, str3, K0, ((tL_payments_validateRequestedInfo == null || (tL_payments_validateRequestedInfo.info.shipping_address == null && this.G0 == null)) && ((tL_paymentRequestedInfo = this.C0.saved_info) == null || tL_paymentRequestedInfo.shipping_address == null)) ? false : true);
                        c11 = 1;
                        this.Q.addView(this.Y[1]);
                    } else {
                        str3 = str;
                    }
                    this.Y[c11].setVisibility(user3 != null ? i59 : i10);
                    TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo2 = this.I0;
                    if (tL_payments_validateRequestedInfo2 != null || (this.V0 && (paymentForm2 = this.C0) != null && paymentForm2.saved_info != null)) {
                        TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo12 = tL_payments_validateRequestedInfo2 != null ? tL_payments_validateRequestedInfo2.info : this.C0.saved_info;
                        int i63 = 2;
                        this.Y[2] = new org.telegram.ui.Cells.a9(context);
                        this.Y[2].setVisibility(i10);
                        this.Q.addView(this.Y[2]);
                        if (tL_paymentRequestedInfo12.shipping_address != null) {
                            this.Y[2].setVisibility(0);
                            if (this.u0 == 4) {
                                org.telegram.ui.ActionBar.a7.S(this.Y[2], org.telegram.ui.ActionBar.t6.N0(true), org.telegram.ui.ActionBar.a7.N(i61), org.telegram.ui.ActionBar.a7.N(i62));
                                this.Y[2].setOnClickListener(new nl0(this, i63));
                            } else {
                                org.telegram.ui.ActionBar.a7.i(i61, this.Y[2], getResourceProvider());
                            }
                        }
                        int i64 = 3;
                        this.Y[3] = new org.telegram.ui.Cells.a9(context);
                        this.Y[3].setVisibility(i10);
                        this.Q.addView(this.Y[3]);
                        if (tL_paymentRequestedInfo12.name != null) {
                            this.Y[3].setVisibility(0);
                            if (this.u0 == 4) {
                                org.telegram.ui.ActionBar.a7.S(this.Y[3], org.telegram.ui.ActionBar.t6.N0(true), org.telegram.ui.ActionBar.a7.N(i61), org.telegram.ui.ActionBar.a7.N(i62));
                                this.Y[3].setOnClickListener(new nl0(this, i64));
                            } else {
                                org.telegram.ui.ActionBar.a7.i(i61, this.Y[3], getResourceProvider());
                            }
                        }
                        int i65 = 4;
                        this.Y[4] = new org.telegram.ui.Cells.a9(context);
                        this.Y[4].setVisibility(i10);
                        this.Q.addView(this.Y[4]);
                        if (tL_paymentRequestedInfo12.phone != null) {
                            this.Y[4].setVisibility(0);
                            if (this.u0 == 4) {
                                org.telegram.ui.ActionBar.a7.S(this.Y[4], org.telegram.ui.ActionBar.t6.N0(true), org.telegram.ui.ActionBar.a7.N(i61), org.telegram.ui.ActionBar.a7.N(i62));
                                this.Y[4].setOnClickListener(new nl0(this, i65));
                            } else {
                                org.telegram.ui.ActionBar.a7.i(i61, this.Y[4], getResourceProvider());
                            }
                        }
                        this.Y[i12] = new org.telegram.ui.Cells.a9(context);
                        this.Y[i12].setVisibility(i10);
                        this.Q.addView(this.Y[i12]);
                        if (tL_paymentRequestedInfo12.email != null) {
                            this.Y[i12].setVisibility(0);
                            if (this.u0 == 4) {
                                org.telegram.ui.ActionBar.a7.S(this.Y[i12], org.telegram.ui.ActionBar.t6.N0(true), org.telegram.ui.ActionBar.a7.N(i61), org.telegram.ui.ActionBar.a7.N(i62));
                                this.Y[i12].setOnClickListener(new nl0(this, i12));
                            } else {
                                org.telegram.ui.ActionBar.a7.i(i61, this.Y[i12], getResourceProvider());
                            }
                        }
                        if (this.G0 != null) {
                            this.Y[6] = new org.telegram.ui.Cells.a9(context);
                            org.telegram.ui.ActionBar.a7.i(i61, this.Y[6], getResourceProvider());
                            this.Y[6].b(R.drawable.msg_payment_delivery, this.G0.title, org.telegram.messenger.cd.K0(2131747424), false);
                            this.Q.addView(this.Y[6]);
                        }
                        G0(tL_paymentRequestedInfo12);
                    }
                    if (this.u0 == 4) {
                        this.F = !this.V0;
                        if (this.b1 instanceof TLRPC.TL_inputInvoiceStars) {
                            this.F = true;
                        }
                        this.W = new om0(this, context);
                        View view = new View(context);
                        org.telegram.ui.ActionBar.a7.R(view, org.telegram.ui.ActionBar.t6.h0(getThemedColor(i62), 2, -1), null, org.telegram.ui.ActionBar.a7.N(i62), this.Y0);
                        this.W.addView(view, w7.b6.c(-1.0f, -1));
                        frameLayout2.addView(this.W, w7.b6.e(-1, 48, 80));
                        this.W.setOnClickListener(new wu(24, this, str3));
                        TextView textView2 = new TextView(context);
                        this.U = textView2;
                        int i66 = org.telegram.ui.ActionBar.t6.Ti;
                        org.telegram.ui.ActionBar.a7.V(textView2, i66, getResourceProvider());
                        this.U.setText(org.telegram.messenger.cd.Z(2131747427, this.R0[0]));
                        this.U.setTextSize(1, 14.0f);
                        this.U.setGravity(17);
                        this.U.setTypeface(org.telegram.messenger.i0.o());
                        this.W.addView(this.U, w7.b6.c(-1.0f, -1));
                        org.telegram.ui.Components.iq iqVar2 = new org.telegram.ui.Components.iq(context, 0);
                        this.s = iqVar2;
                        iqVar2.setVisibility(4);
                        int themedColor2 = getThemedColor(i66);
                        this.s.a(805306367 & themedColor2, themedColor2);
                        this.W.addView(this.s, w7.b6.c(-1.0f, -1));
                        this.W.a(this.F, false);
                        this.U.setAlpha(!this.F ? 0.8f : 1.0f);
                        this.n.setEnabled(false);
                        this.n.getContentView().setVisibility(4);
                        org.telegram.messenger.i0.u(context, true);
                        try {
                            dm0 dm0Var = new dm0(context);
                            this.x = dm0Var;
                            dm0Var.setBackgroundColor(-1);
                            this.x.getSettings().setJavaScriptEnabled(true);
                            this.x.getSettings().setDomStorageEnabled(true);
                            this.x.getSettings().setSupportZoom(true);
                            this.x.getSettings().setBuiltInZoomControls(true);
                            this.x.getSettings().setDisplayZoomControls(false);
                            this.x.getSettings().setUseWideViewPort(true);
                            this.x.getSettings().setMixedContentMode(0);
                            CookieManager.getInstance().setAcceptThirdPartyCookies(this.x, true);
                            this.x.setWebViewClient(new em0(this, context, 0));
                        } catch (Exception e13) {
                            org.telegram.messenger.f8.f(e13);
                        }
                        this.V = null;
                        if (this.C0.invoice.terms_url != null) {
                            org.telegram.ui.Cells.r6 r6Var = new org.telegram.ui.Cells.r6(context, getResourceProvider());
                            this.V = r6Var;
                            r6Var.setChecked(this.F);
                            if (TextUtils.isEmpty(this.p0)) {
                                String K02 = org.telegram.messenger.cd.K0(2131747432);
                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(K02);
                                int indexOf = K02.indexOf(42);
                                int lastIndexOf = K02.lastIndexOf(42);
                                spannableStringBuilder = spannableStringBuilder2;
                                spannableStringBuilder = spannableStringBuilder2;
                                if (indexOf != -1 && lastIndexOf != -1) {
                                    SpannableString spannableString = new SpannableString(K02.substring(indexOf + 1, lastIndexOf));
                                    spannableString.setSpan(new org.telegram.ui.Components.e51(this.C0.invoice.terms_url), 0, spannableString.length(), 33);
                                    int i67 = lastIndexOf + 1;
                                    spannableStringBuilder2.replace(indexOf, i67, (CharSequence) spannableString);
                                    K02.substring(0, indexOf);
                                    spannableString.toString();
                                    K02.substring(i67);
                                    spannableStringBuilder = spannableStringBuilder2;
                                }
                            } else {
                                String K03 = org.telegram.messenger.cd.K0(2131747433);
                                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(K03);
                                int indexOf2 = K03.indexOf(42);
                                int lastIndexOf2 = K03.lastIndexOf(42);
                                if (indexOf2 != -1 && lastIndexOf2 != -1) {
                                    SpannableString spannableString2 = new SpannableString(K03.substring(indexOf2 + 1, lastIndexOf2));
                                    spannableString2.setSpan(new org.telegram.ui.Components.e51(this.C0.invoice.terms_url), 0, spannableString2.length(), 33);
                                    int i68 = lastIndexOf2 + 1;
                                    spannableStringBuilder3.replace(indexOf2, i68, (CharSequence) spannableString2);
                                    K03 = K03.substring(0, indexOf2) + ((Object) spannableString2) + K03.substring(i68);
                                }
                                int indexOf3 = K03.indexOf("%1$s");
                                spannableStringBuilder = spannableStringBuilder3;
                                if (indexOf3 != -1) {
                                    spannableStringBuilder3.replace(indexOf3, indexOf3 + 4, (CharSequence) this.p0);
                                    spannableStringBuilder3.setSpan(new org.telegram.ui.Components.x41(org.telegram.messenger.i0.o()), indexOf3, this.p0.length() + indexOf3, 33);
                                    spannableStringBuilder = spannableStringBuilder3;
                                }
                            }
                            this.V.setText(spannableStringBuilder);
                            org.telegram.ui.Cells.r6 r6Var2 = this.V;
                            int i69 = org.telegram.ui.ActionBar.t6.d6;
                            int themedColor3 = getThemedColor(i69);
                            int i70 = org.telegram.ui.ActionBar.t6.i6;
                            org.telegram.ui.ActionBar.a7.R(r6Var2, org.telegram.ui.ActionBar.t6.i0(themedColor3, getThemedColor(i70)), org.telegram.ui.ActionBar.a7.N(i69), org.telegram.ui.ActionBar.a7.N(i70), getResourceProvider());
                            this.V.setOnClickListener(new nl0(this, 6));
                            frameLayout2.addView(this.V, w7.b6.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 48.0f));
                        }
                        WebView webView = this.x;
                        if (webView != null) {
                            frameLayout2.addView(webView, w7.b6.c(-1.0f, -1));
                            this.x.setVisibility(i10);
                        }
                    }
                    this.K[1] = new org.telegram.ui.Cells.c7(context, (Object) null);
                    org.telegram.ui.ActionBar.a7.a0(this.K[1], context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.t6.b7);
                    if (i59 != 0 && this.u0 == 4 && this.I0 == null && ((paymentForm = this.C0) == null || paymentForm.saved_info == null)) {
                        c10 = 1;
                        this.K[1].setVisibility(i59);
                    } else {
                        c10 = 1;
                    }
                    this.Q.addView(this.K[c10], w7.b6.o(-1, i11));
                } else if (i23 == 6) {
                    org.telegram.ui.Cells.n3 n3Var = new org.telegram.ui.Cells.n3(context);
                    this.S = n3Var;
                    n3Var.a(org.telegram.messenger.cd.K0(2131747463));
                    org.telegram.ui.Cells.n3 n3Var2 = this.S;
                    int i71 = org.telegram.ui.ActionBar.t6.d6;
                    org.telegram.ui.ActionBar.a7.i(i71, n3Var2, getResourceProvider());
                    EditTextBoldCursor textView3 = this.S.getTextView();
                    textView3.setInputType(3);
                    textView3.setImeOptions(6);
                    final int i72 = 0;
                    textView3.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.ql0
                        public final /* synthetic */ sm0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.widget.TextView.OnEditorActionListener
                        public final boolean onEditorAction(TextView textView22, int i332, KeyEvent keyEvent) {
                            EditTextBoldCursor[] editTextBoldCursorArr;
                            switch (i72) {
                                case 0:
                                    sm0 sm0Var = this.b;
                                    if (i332 != 6) {
                                        sm0Var.getClass();
                                        break;
                                    } else {
                                        sm0Var.F0(false);
                                        break;
                                    }
                                case 1:
                                    sm0 sm0Var2 = this.b;
                                    if (i332 != 6) {
                                        sm0Var2.getClass();
                                        if (i332 == 5) {
                                            int intValue = ((Integer) textView22.getTag()).intValue();
                                            if (intValue != 0) {
                                                if (intValue == 1) {
                                                    sm0Var2.f[2].requestFocus();
                                                    break;
                                                }
                                            } else {
                                                sm0Var2.f[1].requestFocus();
                                                break;
                                            }
                                        }
                                    } else {
                                        sm0Var2.n.performClick();
                                        break;
                                    }
                                    break;
                                case 2:
                                    sm0 sm0Var3 = this.b;
                                    sm0Var3.getClass();
                                    if (i332 != 5) {
                                        if (i332 == 6) {
                                            sm0Var3.n.performClick();
                                            break;
                                        }
                                    } else {
                                        int intValue2 = ((Integer) textView22.getTag()).intValue();
                                        while (true) {
                                            intValue2++;
                                            EditTextBoldCursor[] editTextBoldCursorArr2 = sm0Var3.f;
                                            if (intValue2 >= editTextBoldCursorArr2.length) {
                                                break;
                                            } else if (intValue2 != 4 && ((View) editTextBoldCursorArr2[intValue2].getParent()).getVisibility() == 0) {
                                                sm0Var3.f[intValue2].requestFocus();
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 3:
                                    sm0 sm0Var4 = this.b;
                                    sm0Var4.getClass();
                                    if (i332 != 5) {
                                        if (i332 == 6) {
                                            sm0Var4.n.performClick();
                                            break;
                                        }
                                    } else {
                                        int intValue3 = ((Integer) textView22.getTag()).intValue();
                                        do {
                                            int i342 = intValue3 + 1;
                                            editTextBoldCursorArr = sm0Var4.f;
                                            if (i342 >= editTextBoldCursorArr.length) {
                                                break;
                                            } else {
                                                intValue3 = i342 == 4 ? intValue3 + 2 : i342;
                                            }
                                        } while (((View) editTextBoldCursorArr[intValue3].getParent()).getVisibility() != 0);
                                        sm0Var4.f[intValue3].requestFocus();
                                        break;
                                    }
                                    break;
                                default:
                                    sm0 sm0Var5 = this.b;
                                    if (i332 != 6) {
                                        sm0Var5.getClass();
                                        break;
                                    } else {
                                        sm0Var5.n.performClick();
                                        break;
                                    }
                            }
                            return false;
                        }
                    });
                    textView3.addTextChangedListener(new gm0(this, i72));
                    this.Q.addView(this.S, w7.b6.o(-1, -2));
                    this.M[2] = new org.telegram.ui.Cells.b9(context, this.Y0);
                    org.telegram.ui.ActionBar.a7.a0(this.M[2], context, R.drawable.greydivider, org.telegram.ui.ActionBar.t6.b7);
                    this.Q.addView(this.M[2], w7.b6.o(-1, -2));
                    this.N[1] = new org.telegram.ui.Cells.x9(context, this.Y0);
                    org.telegram.ui.Cells.x9 x9Var = this.N[1];
                    org.telegram.ui.Cells.y N02 = org.telegram.ui.ActionBar.t6.N0(true);
                    org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i71);
                    int i73 = org.telegram.ui.ActionBar.t6.i6;
                    org.telegram.ui.ActionBar.a7.S(x9Var, N02, N2, org.telegram.ui.ActionBar.a7.N(i73));
                    org.telegram.ui.Cells.x9 x9Var2 = this.N[1];
                    int i74 = org.telegram.ui.ActionBar.t6.G6;
                    x9Var2.setTag(Integer.valueOf(i74));
                    org.telegram.ui.ActionBar.a7.V(this.N[1].getTextView(), i74, getResourceProvider());
                    this.N[1].b(org.telegram.messenger.cd.K0(2131746138), true);
                    this.Q.addView(this.N[1], w7.b6.o(-1, -2));
                    this.N[1].setOnClickListener(new nl0(this, 7));
                    this.N[0] = new org.telegram.ui.Cells.x9(context, this.Y0);
                    org.telegram.ui.ActionBar.a7.S(this.N[0], org.telegram.ui.ActionBar.t6.N0(true), org.telegram.ui.ActionBar.a7.N(i71), org.telegram.ui.ActionBar.a7.N(i73));
                    org.telegram.ui.Cells.x9 x9Var3 = this.N[0];
                    int i75 = org.telegram.ui.ActionBar.t6.p7;
                    x9Var3.setTag(Integer.valueOf(i75));
                    org.telegram.ui.ActionBar.a7.V(this.N[0].getTextView(), i75, getResourceProvider());
                    this.N[0].b(org.telegram.messenger.cd.K0(2131754948), false);
                    this.Q.addView(this.N[0], w7.b6.o(-1, -2));
                    this.N[0].setOnClickListener(new nl0(this, 8));
                    this.f = new EditTextBoldCursor[3];
                    int i76 = 0;
                    for (int i77 = 3; i76 < i77; i77 = 3) {
                        if (i76 == 0) {
                            this.I[0] = new org.telegram.ui.Cells.p4(context, this.Y0);
                            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, this.I[0], getResourceProvider());
                            this.I[0].setText(org.telegram.messenger.cd.K0(2131747402));
                            this.Q.addView(this.I[0], w7.b6.o(-1, -2));
                        } else if (i76 == 2) {
                            this.I[1] = new org.telegram.ui.Cells.p4(context, this.Y0);
                            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, this.I[1], getResourceProvider());
                            this.I[1].setText(org.telegram.messenger.cd.K0(2131747406));
                            this.Q.addView(this.I[1], w7.b6.o(-1, -2));
                        }
                        FrameLayout frameLayout6 = new FrameLayout(context);
                        frameLayout6.setClipChildren(false);
                        this.Q.addView(frameLayout6, w7.b6.o(-1, 50));
                        int i78 = org.telegram.ui.ActionBar.t6.d6;
                        org.telegram.ui.ActionBar.a7.i(i78, frameLayout6, getResourceProvider());
                        if (i76 == 0) {
                            org.telegram.ui.Components.bn bnVar4 = new org.telegram.ui.Components.bn(context, 13);
                            org.telegram.ui.ActionBar.a7.i(i78, bnVar4, getResourceProvider());
                            this.J.add(bnVar4);
                            frameLayout6.addView(bnVar4, new FrameLayout.LayoutParams(-1, 1, 83));
                        }
                        this.f[i76] = new EditTextBoldCursor(context);
                        this.f[i76].setTag(Integer.valueOf(i76));
                        this.f[i76].setTextSize(1, 16.0f);
                        org.telegram.ui.ActionBar.a7.E(this.f[i76], org.telegram.ui.ActionBar.t6.H6, getResourceProvider());
                        EditTextBoldCursor editTextBoldCursor8 = this.f[i76];
                        int i79 = org.telegram.ui.ActionBar.t6.G6;
                        org.telegram.ui.ActionBar.a7.V(editTextBoldCursor8, i79, getResourceProvider());
                        this.f[i76].setBackgroundDrawable(null);
                        org.telegram.ui.ActionBar.a7.w(this.f[i76], i79, getResourceProvider());
                        this.f[i76].setCursorSize(org.telegram.messenger.i0.L(20.0f));
                        this.f[i76].setCursorWidth(1.5f);
                        if (i76 == 0 || i76 == 1) {
                            this.f[i76].setInputType(org.telegram.messenger.zs.N1);
                            this.f[i76].setTypeface(Typeface.DEFAULT);
                            this.f[i76].setImeOptions(268435461);
                        } else {
                            this.f[i76].setInputType(33);
                            this.f[i76].setImeOptions(268435462);
                        }
                        if (i76 == 0) {
                            this.f[i76].setHint(org.telegram.messenger.cd.K0(2131747405));
                            this.f[i76].requestFocus();
                        } else if (i76 == 1) {
                            this.f[i76].setHint(org.telegram.messenger.cd.K0(2131747403));
                        } else if (i76 == 2) {
                            this.f[i76].setHint(org.telegram.messenger.cd.K0(2131747408));
                        }
                        this.f[i76].setPadding(0, 0, 0, org.telegram.messenger.i0.L(6.0f));
                        this.f[i76].setGravity(org.telegram.messenger.cd.X ? 5 : 3);
                        frameLayout6.addView(this.f[i76], w7.b6.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                        final int i80 = 1;
                        this.f[i76].setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.ql0
                            public final /* synthetic */ sm0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.widget.TextView.OnEditorActionListener
                            public final boolean onEditorAction(TextView textView22, int i332, KeyEvent keyEvent) {
                                EditTextBoldCursor[] editTextBoldCursorArr;
                                switch (i80) {
                                    case 0:
                                        sm0 sm0Var = this.b;
                                        if (i332 != 6) {
                                            sm0Var.getClass();
                                            break;
                                        } else {
                                            sm0Var.F0(false);
                                            break;
                                        }
                                    case 1:
                                        sm0 sm0Var2 = this.b;
                                        if (i332 != 6) {
                                            sm0Var2.getClass();
                                            if (i332 == 5) {
                                                int intValue = ((Integer) textView22.getTag()).intValue();
                                                if (intValue != 0) {
                                                    if (intValue == 1) {
                                                        sm0Var2.f[2].requestFocus();
                                                        break;
                                                    }
                                                } else {
                                                    sm0Var2.f[1].requestFocus();
                                                    break;
                                                }
                                            }
                                        } else {
                                            sm0Var2.n.performClick();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        sm0 sm0Var3 = this.b;
                                        sm0Var3.getClass();
                                        if (i332 != 5) {
                                            if (i332 == 6) {
                                                sm0Var3.n.performClick();
                                                break;
                                            }
                                        } else {
                                            int intValue2 = ((Integer) textView22.getTag()).intValue();
                                            while (true) {
                                                intValue2++;
                                                EditTextBoldCursor[] editTextBoldCursorArr2 = sm0Var3.f;
                                                if (intValue2 >= editTextBoldCursorArr2.length) {
                                                    break;
                                                } else if (intValue2 != 4 && ((View) editTextBoldCursorArr2[intValue2].getParent()).getVisibility() == 0) {
                                                    sm0Var3.f[intValue2].requestFocus();
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 3:
                                        sm0 sm0Var4 = this.b;
                                        sm0Var4.getClass();
                                        if (i332 != 5) {
                                            if (i332 == 6) {
                                                sm0Var4.n.performClick();
                                                break;
                                            }
                                        } else {
                                            int intValue3 = ((Integer) textView22.getTag()).intValue();
                                            do {
                                                int i342 = intValue3 + 1;
                                                editTextBoldCursorArr = sm0Var4.f;
                                                if (i342 >= editTextBoldCursorArr.length) {
                                                    break;
                                                } else {
                                                    intValue3 = i342 == 4 ? intValue3 + 2 : i342;
                                                }
                                            } while (((View) editTextBoldCursorArr[intValue3].getParent()).getVisibility() != 0);
                                            sm0Var4.f[intValue3].requestFocus();
                                            break;
                                        }
                                        break;
                                    default:
                                        sm0 sm0Var5 = this.b;
                                        if (i332 != 6) {
                                            sm0Var5.getClass();
                                            break;
                                        } else {
                                            sm0Var5.n.performClick();
                                            break;
                                        }
                                }
                                return false;
                            }
                        });
                        if (i76 == 1) {
                            this.M[0] = new org.telegram.ui.Cells.b9(context, this.Y0);
                            this.M[0].setText(org.telegram.messenger.cd.K0(2131747404));
                            org.telegram.ui.ActionBar.a7.a0(this.M[0], context, R.drawable.greydivider, org.telegram.ui.ActionBar.t6.b7);
                            this.Q.addView(this.M[0], w7.b6.o(-1, -2));
                        } else if (i76 == 2) {
                            this.M[1] = new org.telegram.ui.Cells.b9(context, this.Y0);
                            this.M[1].setText(org.telegram.messenger.cd.K0(2131747407));
                            org.telegram.ui.ActionBar.a7.a0(this.M[1], context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.t6.b7);
                            this.Q.addView(this.M[1], w7.b6.o(-1, -2));
                        }
                        i76++;
                    }
                    O0();
                }
            }
        }
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.p0) {
            TLRPC.PaymentForm paymentForm = this.C0;
            paymentForm.password_missing = false;
            paymentForm.can_save_credentials = true;
            P0();
            return;
        }
        if (i10 == org.telegram.messenger.zs.r0) {
            TLRPC.PaymentForm paymentForm2 = this.C0;
            paymentForm2.password_missing = true;
            paymentForm2.can_save_credentials = false;
            P0();
            return;
        }
        if (i10 == org.telegram.messenger.zs.a1) {
            this.a1 = true;
            removeSelfFromStack();
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final org.telegram.ui.ActionBar.p6 getResourceProvider() {
        return this.Y0;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.E, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, TLObject.FLAG_27, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.D8));
        if (this.f != null) {
            int i10 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.f;
                if (i10 >= editTextBoldCursorArr.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.c7((View) editTextBoldCursorArr[i10].getParent(), 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.d6));
                i10++;
            }
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, TLObject.FLAG_23, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.H6));
        }
        if (this.h != null) {
            for (int i11 = 0; i11 < this.h.length; i11++) {
            }
        }
        int i12 = 0;
        while (true) {
            org.telegram.ui.Cells.p4[] p4VarArr = this.I;
            if (i12 >= p4VarArr.length) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.c7(p4VarArr[i12], 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.d6));
            i12++;
        }
        for (int i13 = 0; i13 < this.K.length; i13++) {
        }
        for (int i14 = 0; i14 < this.M.length; i14++) {
        }
        int i15 = 0;
        while (true) {
            ArrayList arrayList2 = this.J;
            if (i15 >= arrayList2.size()) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.c7((View) arrayList2.get(i15), 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.d6));
            i15++;
        }
        int i16 = 1;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.L, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.L, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.N6));
        for (int i17 = 0; i17 < this.N.length; i17++) {
        }
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.U, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.s6));
        while (true) {
            org.telegram.ui.Cells.a9[] a9VarArr = this.Y;
            if (i16 >= a9VarArr.length) {
                arrayList.add(new org.telegram.ui.ActionBar.c7(this.W, TLObject.FLAG_28, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.d6));
                arrayList.add(new org.telegram.ui.ActionBar.c7(this.W, TLObject.FLAG_28, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.i6));
                return arrayList;
            }
            arrayList.add(new org.telegram.ui.ActionBar.c7(a9VarArr[i16], 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.d6));
            i16++;
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.G;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        if (i10 == 991) {
            org.telegram.messenger.i0.g3(new org.telegram.ui.Components.ji0(this, i11, intent, 21));
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onBackPressed(boolean z10) {
        WebView webView = this.x;
        if (webView == null || !this.D) {
            return !this.P0;
        }
        if (z10) {
            webView.loadUrl(this.y);
            this.D = false;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.u0 == 4 && this.X0) {
            this.X0 = false;
            this.W.callOnClick();
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.p0);
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.r0);
        if (this.u0 != 4 || this.V0) {
            org.telegram.messenger.zs.f(this.currentAccount).b(this, org.telegram.messenger.zs.a1);
        }
        return super.onFragmentCreate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c5, code lost:
    
        if (r0 != 6) goto L56;
     */
    @Override // org.telegram.ui.ActionBar.k2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onFragmentDestroy() {
        qm0 qm0Var = this.T;
        if (qm0Var != null) {
            qm0Var.b();
        }
        int i10 = 0;
        org.telegram.messenger.i0.u(getParentActivity(), false);
        if (!this.a1) {
            this.f1 = 2;
            if (this.Z0 != null) {
                org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
                if (z4Var != null && z4Var.getFragmentStack() != null) {
                    int indexOf = this.parentLayout.getFragmentStack().indexOf(this);
                    if (indexOf == -1) {
                        indexOf = this.parentLayout.getFragmentStack().size();
                    }
                    while (true) {
                        if (i10 >= this.parentLayout.getFragmentStack().size()) {
                            i10 = indexOf;
                            break;
                        } else if (((org.telegram.ui.ActionBar.k2) this.parentLayout.getFragmentStack().get(i10)) instanceof sm0) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                    i10 -= indexOf;
                }
                if (i10 == 0) {
                    this.Z0.e(this.f1);
                }
            }
        }
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.p0);
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.r0);
        if (this.u0 != 4 || this.V0) {
            org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.a1);
        }
        WebView webView = this.x;
        if (webView != null) {
            try {
                ViewParent parent = webView.getParent();
                if (parent != null) {
                    ((ViewGroup) parent).removeView(this.x);
                }
                this.x.stopLoading();
                this.x.loadUrl("about:blank");
                this.y = null;
                this.x.destroy();
                this.x = null;
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
        try {
            int i11 = this.u0;
            if (i11 != 2) {
            }
        } catch (Throwable th2) {
            org.telegram.messenger.f8.g(th2, true);
        }
        if (org.telegram.messenger.tz.s.length() != 0) {
            if (org.telegram.messenger.tz.A) {
            }
            super.onFragmentDestroy();
            this.Q0 = true;
        }
        getParentActivity().getWindow().clearFlags(TLObject.FLAG_13);
        org.telegram.messenger.i0.h2();
        super.onFragmentDestroy();
        this.Q0 = true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onResume() {
        super.onResume();
        org.telegram.messenger.i0.Z2(getParentActivity(), this.classGuid);
        try {
            int i10 = this.u0;
            if ((i10 == 2 || i10 == 6) && !this.C0.invoice.test) {
                getParentActivity().getWindow().setFlags(TLObject.FLAG_13, TLObject.FLAG_13);
                org.telegram.messenger.i0.h2();
                return;
            }
            if (org.telegram.messenger.tz.s.length() != 0 && !org.telegram.messenger.tz.A) {
                return;
            }
            getParentActivity().getWindow().clearFlags(TLObject.FLAG_13);
            org.telegram.messenger.i0.h2();
        } catch (Throwable th2) {
            org.telegram.messenger.f8.g(th2, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onThemeColorsChanged() {
        try {
            ScrollView scrollView = this.E;
            if (scrollView != null) {
                org.telegram.messenger.i0.y3(scrollView, getThemedColor(org.telegram.ui.ActionBar.t6.s8));
            }
            if (this.f == null) {
                return;
            }
            getThemedColor(org.telegram.ui.ActionBar.t6.G6);
            int i10 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.f;
                if (i10 >= editTextBoldCursorArr.length) {
                    return;
                }
                EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i10];
                if (editTextBoldCursor != null) {
                    org.telegram.ui.ActionBar.a7.m(editTextBoldCursor, 30, org.telegram.ui.ActionBar.t6.G6, this.Y0);
                }
                i10++;
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 || z11) {
            return;
        }
        WebView webView = this.x;
        if (webView != null) {
            if (this.u0 != 4) {
                TLRPC.TL_paymentFormMethod tL_paymentFormMethod = this.F0;
                if (tL_paymentFormMethod != null) {
                    String str = tL_paymentFormMethod.url;
                    this.y = str;
                    webView.loadUrl(str);
                    return;
                } else {
                    String str2 = this.C0.url;
                    this.y = str2;
                    webView.loadUrl(str2);
                    return;
                }
            }
            return;
        }
        int i10 = this.u0;
        if (i10 == 2) {
            org.telegram.messenger.i0.h3(new rl0(this, 3), 100L);
            return;
        }
        if (i10 == 3) {
            this.f[1].requestFocus();
            org.telegram.messenger.i0.J3(this.f[1]);
            return;
        }
        if (i10 == 4) {
            EditTextBoldCursor[] editTextBoldCursorArr = this.f;
            if (editTextBoldCursorArr != null) {
                editTextBoldCursorArr[0].requestFocus();
                return;
            }
            return;
        }
        if (i10 != 6 || this.b0) {
            return;
        }
        this.f[0].requestFocus();
        org.telegram.messenger.i0.J3(this.f[0]);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean presentFragment(org.telegram.ui.ActionBar.k2 k2Var) {
        D0(k2Var);
        return super.presentFragment(k2Var);
    }

    public final void r0(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.O = frameLayout;
        org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.t6.N0(true);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(org.telegram.ui.ActionBar.t6.d6);
        org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(org.telegram.ui.ActionBar.t6.i6);
        frameLayout.setBackground(N0);
        org.telegram.ui.ActionBar.a7.k(frameLayout, N0, N, N2, null);
        this.O.setVisibility(8);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.P = frameLayout2;
        frameLayout2.setClickable(true);
        this.P.setFocusable(true);
        this.P.setBackgroundResource(R.drawable.googlepay_button_no_shadow_background);
        if (this.K0 == null) {
            this.P.setPadding(org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(2.0f));
        } else {
            this.P.setPadding(org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f));
        }
        this.O.addView(this.P, w7.b6.c(48.0f, -1));
        this.P.setOnClickListener(new nl0(this, 13));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setWeightSum(2.0f);
        linearLayout.setGravity(16);
        linearLayout.setOrientation(1);
        linearLayout.setDuplicateParentStateEnabled(true);
        this.P.addView(linearLayout, w7.b6.c(-1.0f, -1));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setDuplicateParentStateEnabled(true);
        imageView.setImageResource(R.drawable.buy_with_googlepay_button_content);
        linearLayout.addView(imageView, w7.b6.l(1.0f, -1, 0));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView2.setDuplicateParentStateEnabled(true);
        imageView2.setImageResource(R.drawable.googlepay_button_overlay);
        this.P.addView(imageView2, w7.b6.c(-1.0f, -1));
    }

    public final void s0(String str) {
        boolean z10;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) org.telegram.messenger.w0.b.getSystemService("phone");
            if (str == null && (telephonyManager.getSimState() == 1 || telephonyManager.getPhoneType() == 0)) {
                return;
            }
            boolean z11 = getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0;
            if (str != null || z11) {
                if (str == null) {
                    str = af.b.d(telephonyManager.getLine1Number(), false);
                }
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                int i10 = 4;
                String str2 = null;
                if (str.length() > 4) {
                    while (true) {
                        if (i10 < 1) {
                            z10 = false;
                            break;
                        }
                        String substring = str.substring(0, i10);
                        if (((String) this.c.get(substring)) != null) {
                            str2 = str.substring(i10);
                            this.f[8].setText(substring);
                            z10 = true;
                            break;
                        }
                        i10--;
                    }
                    if (!z10) {
                        str2 = str.substring(1);
                        this.f[8].setText(str.substring(0, 1));
                    }
                }
                if (str2 != null) {
                    this.f[9].setText(str2);
                    EditTextBoldCursor editTextBoldCursor = this.f[9];
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                }
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final long u0() {
        TLRPC.InputInvoice inputInvoice = this.b1;
        if (!(inputInvoice instanceof TLRPC.TL_inputInvoiceStars)) {
            return 0L;
        }
        TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose = ((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose;
        if (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGift) {
            return ((TLRPC.TL_inputStorePaymentStarsGift) inputStorePaymentPurpose).stars;
        }
        if (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsTopup) {
            return ((TLRPC.TL_inputStorePaymentStarsTopup) inputStorePaymentPurpose).stars;
        }
        if (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway) {
            return ((TLRPC.TL_inputStorePaymentStarsGiveaway) inputStorePaymentPurpose).stars;
        }
        return 0L;
    }

    public final long v0() {
        TLRPC.InputPeer inputPeer;
        TLRPC.InputInvoice inputInvoice = this.b1;
        if (!(inputInvoice instanceof TLRPC.TL_inputInvoiceStars)) {
            return 0L;
        }
        TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose = ((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose;
        if (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGift) {
            TLRPC.InputUser inputUser = ((TLRPC.TL_inputStorePaymentStarsGift) inputStorePaymentPurpose).user_id;
            if (inputUser != null) {
                return inputUser.user_id;
            }
            return 0L;
        }
        if (!(inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway) || (inputPeer = ((TLRPC.TL_inputStorePaymentStarsGiveaway) inputStorePaymentPurpose).boost_peer) == null) {
            return 0L;
        }
        return org.telegram.messenger.o5.n(inputPeer);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final String w0(ArrayList arrayList) {
        String str;
        double d;
        long j10 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            j10 += ((TLRPC.TL_labeledPrice) arrayList.get(i10)).amount;
        }
        org.telegram.messenger.cd.D0();
        String upperCase = this.C0.invoice.currency.toUpperCase();
        long abs = Math.abs(j10);
        upperCase.getClass();
        char c10 = 65535;
        switch (upperCase.hashCode()) {
            case 65726:
                if (upperCase.equals("BHD")) {
                    c10 = 0;
                    break;
                }
                break;
            case 65759:
                if (upperCase.equals("BIF")) {
                    c10 = 1;
                    break;
                }
                break;
            case 66267:
                if (upperCase.equals("BYR")) {
                    c10 = 2;
                    break;
                }
                break;
            case 66813:
                if (upperCase.equals("CLF")) {
                    c10 = 3;
                    break;
                }
                break;
            case 66823:
                if (upperCase.equals("CLP")) {
                    c10 = 4;
                    break;
                }
                break;
            case 67122:
                if (upperCase.equals("CVE")) {
                    c10 = 5;
                    break;
                }
                break;
            case 67712:
                if (upperCase.equals("DJF")) {
                    c10 = 6;
                    break;
                }
                break;
            case 70719:
                if (upperCase.equals("GNF")) {
                    c10 = 7;
                    break;
                }
                break;
            case 72732:
                if (upperCase.equals("IQD")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 72777:
                if (upperCase.equals("IRR")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 72801:
                if (upperCase.equals("ISK")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 73631:
                if (upperCase.equals("JOD")) {
                    c10 = 11;
                    break;
                }
                break;
            case 73683:
                if (upperCase.equals("JPY")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 74532:
                if (upperCase.equals("KMF")) {
                    c10 = '\r';
                    break;
                }
                break;
            case 74704:
                if (upperCase.equals("KRW")) {
                    c10 = 14;
                    break;
                }
                break;
            case 74840:
                if (upperCase.equals("KWD")) {
                    c10 = 15;
                    break;
                }
                break;
            case 75863:
                if (upperCase.equals("LYD")) {
                    c10 = 16;
                    break;
                }
                break;
            case 76263:
                if (upperCase.equals("MGA")) {
                    c10 = 17;
                    break;
                }
                break;
            case 76618:
                if (upperCase.equals("MRO")) {
                    c10 = 18;
                    break;
                }
                break;
            case 78388:
                if (upperCase.equals("OMR")) {
                    c10 = 19;
                    break;
                }
                break;
            case 79710:
                if (upperCase.equals("PYG")) {
                    c10 = 20;
                    break;
                }
                break;
            case 81569:
                if (upperCase.equals("RWF")) {
                    c10 = 21;
                    break;
                }
                break;
            case 83210:
                if (upperCase.equals("TND")) {
                    c10 = 22;
                    break;
                }
                break;
            case 83974:
                if (upperCase.equals("UGX")) {
                    c10 = 23;
                    break;
                }
                break;
            case 84517:
                if (upperCase.equals("UYI")) {
                    c10 = 24;
                    break;
                }
                break;
            case 85132:
                if (upperCase.equals("VND")) {
                    c10 = 25;
                    break;
                }
                break;
            case 85367:
                if (upperCase.equals("VUV")) {
                    c10 = 26;
                    break;
                }
                break;
            case 86653:
                if (upperCase.equals("XAF")) {
                    c10 = 27;
                    break;
                }
                break;
            case 87087:
                if (upperCase.equals("XOF")) {
                    c10 = 28;
                    break;
                }
                break;
            case 87118:
                if (upperCase.equals("XPF")) {
                    c10 = 29;
                    break;
                }
                break;
        }
        str = " %.0f";
        switch (c10) {
            case 0:
            case '\b':
            case 11:
            case 15:
            case 16:
            case 19:
            case 22:
                d = abs / 1000.0d;
                str = " %.3f";
                break;
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\n':
            case '\f':
            case '\r':
            case 14:
            case 17:
            case 20:
            case 21:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
                d = abs;
                break;
            case 3:
                d = abs / 10000.0d;
                str = " %.4f";
                break;
            case '\t':
                double d10 = abs / 100.0f;
                str = abs % 100 != 0 ? " %.2f" : " %.0f";
                d = d10;
                break;
            case 18:
                d = abs / 10.0d;
                str = " %.1f";
                break;
            default:
                d = abs / 100.0d;
                str = " %.2f";
                break;
        }
        return String.format(Locale.US, str, Double.valueOf(d)).trim();
    }

    public final String x0(ArrayList arrayList) {
        long j10 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            j10 += ((TLRPC.TL_labeledPrice) arrayList.get(i10)).amount;
        }
        Long l4 = this.H0;
        if (l4 != null) {
            j10 += l4.longValue();
        }
        return org.telegram.messenger.cd.D0().p(j10, this.C0.invoice.currency);
    }

    public final void y0() {
        int i10;
        int i11;
        boolean z10;
        int i12 = this.u0;
        if (i12 == 0) {
            qm0 qm0Var = this.T;
            if (qm0Var != null) {
                qm0Var.d(this.I0);
                finishFragment();
                return;
            }
            if (this.C0.invoice.flexible) {
                i10 = 1;
            } else if (this.y0 == null && this.w0 == null) {
                i10 = 2;
            } else {
                if (org.telegram.messenger.d20.i(this.currentAccount).y != null && org.telegram.messenger.d20.i(this.currentAccount).y.valid_until < ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() + 60) {
                    org.telegram.messenger.d20.i(this.currentAccount).y = null;
                    org.telegram.messenger.d20.i(this.currentAccount).v(false);
                }
                i10 = org.telegram.messenger.d20.i(this.currentAccount).y != null ? 4 : 3;
            }
            if (i10 == 2 && this.y0 == null && this.w0 == null && !this.C0.additional_methods.isEmpty()) {
                L0(new rl0(this, 0));
                return;
            }
            sm0 sm0Var = new sm0(this.b1, this.C0, this.N0, this.O0, i10, this.E0, null, null, this.w0, this.x0, this.I0, this.U0, this.J0, this.r0, this.W0);
            sm0Var.c1 = this.c1;
            sm0Var.d1 = this.d1;
            presentFragment(sm0Var, this.S0);
            return;
        }
        if (i12 == 1) {
            if (this.w0 == null && this.x0 == null) {
                if (this.y0 != null) {
                    if (org.telegram.messenger.d20.i(this.currentAccount).y != null && org.telegram.messenger.d20.i(this.currentAccount).y.valid_until < ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() + 60) {
                        org.telegram.messenger.d20.i(this.currentAccount).y = null;
                        org.telegram.messenger.d20.i(this.currentAccount).v(false);
                    }
                    if (org.telegram.messenger.d20.i(this.currentAccount).y == null) {
                        i11 = 3;
                    }
                } else {
                    i11 = 2;
                }
                if (i11 != 2 && this.x0 == null && this.y0 == null && this.w0 == null && !this.C0.additional_methods.isEmpty()) {
                    L0(new rl0(this, 0));
                    return;
                }
                sm0 sm0Var2 = new sm0(this.b1, this.C0, this.N0, this.O0, i11, this.E0, this.G0, this.H0, this.w0, this.x0, this.I0, this.U0, this.J0, this.r0, this.W0);
                sm0Var2.c1 = this.c1;
                sm0Var2.d1 = this.d1;
                presentFragment(sm0Var2, this.S0);
                return;
            }
            i11 = 4;
            if (i11 != 2) {
            }
            sm0 sm0Var22 = new sm0(this.b1, this.C0, this.N0, this.O0, i11, this.E0, this.G0, this.H0, this.w0, this.x0, this.I0, this.U0, this.J0, this.r0, this.W0);
            sm0Var22.c1 = this.c1;
            sm0Var22.d1 = this.d1;
            presentFragment(sm0Var22, this.S0);
            return;
        }
        if (i12 == 2) {
            TLRPC.PaymentForm paymentForm = this.C0;
            if (paymentForm.password_missing && (z10 = this.U0)) {
                sm0 sm0Var3 = new sm0(this.b1, paymentForm, this.N0, this.O0, 6, this.E0, this.G0, this.H0, this.w0, this.x0, this.I0, z10, this.J0, this.r0, this.W0);
                this.f0 = sm0Var3;
                sm0Var3.c1 = this.c1;
                sm0Var3.d1 = this.d1;
                sm0Var3.H0(this.a0);
                sm0 sm0Var4 = this.f0;
                sm0Var4.T = new jm0(this);
                presentFragment(sm0Var4, this.S0);
                return;
            }
            qm0 qm0Var2 = this.T;
            if (qm0Var2 != null) {
                qm0Var2.c(this.w0, this.x0, this.U0, this.J0, null);
                finishFragment();
                return;
            } else {
                sm0 sm0Var5 = new sm0(this.b1, paymentForm, this.N0, this.O0, 4, this.E0, this.G0, this.H0, this.w0, this.x0, this.I0, this.U0, this.J0, this.r0, this.W0);
                sm0Var5.c1 = this.c1;
                sm0Var5.d1 = this.d1;
                presentFragment(sm0Var5, this.S0);
                return;
            }
        }
        if (i12 == 3) {
            sm0 sm0Var6 = new sm0(this.b1, this.C0, this.N0, this.O0, this.v0 ? 4 : 2, this.E0, this.G0, this.H0, this.w0, this.x0, this.I0, this.U0, this.J0, this.r0, this.W0);
            sm0Var6.c1 = this.c1;
            sm0Var6.d1 = this.d1;
            presentFragment(sm0Var6, true);
            return;
        }
        if (i12 != 4) {
            if (i12 != 6) {
                return;
            }
            if (this.T.c(this.w0, this.x0, this.U0, this.J0, this.y0)) {
                finishFragment();
                return;
            }
            sm0 sm0Var7 = new sm0(this.b1, this.C0, this.N0, this.O0, 4, this.E0, this.G0, this.H0, this.w0, this.x0, this.I0, this.U0, this.J0, this.r0, false);
            sm0Var7.c1 = this.c1;
            sm0Var7.d1 = this.d1;
            presentFragment(sm0Var7, true);
            return;
        }
        boolean z11 = this.V0;
        int i13 = org.telegram.messenger.zs.a1;
        if (z11) {
            org.telegram.messenger.zs.f(this.currentAccount).n(this, i13);
        }
        org.telegram.messenger.zs.f(this.currentAccount).k(i13, new Object[0]);
        if (getMessagesController().m7 != null) {
            org.telegram.messenger.i0.h3(new rl0(this, 1), 500L);
        } else {
            if (C0(getParentLayout(), getParentActivity()) || isFinishing()) {
                return;
            }
            finishFragment();
        }
    }

    public final void z0(TLRPC.InputInvoice inputInvoice, TLRPC.PaymentForm paymentForm, org.telegram.messenger.jj jjVar, String str, int i10, TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo, TLRPC.TL_shippingOption tL_shippingOption, Long l4, String str2, String str3, TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, org.telegram.ui.ActionBar.k2 k2Var, boolean z11) {
        if (k2Var != null) {
            this.currentAccount = k2Var.getCurrentAccount();
        }
        this.u0 = i10;
        this.r0 = k2Var;
        this.w0 = str2;
        this.J0 = tL_inputPaymentCredentialsGooglePay;
        this.E0 = tL_payments_validatedRequestedInfo;
        this.C0 = paymentForm;
        this.G0 = tL_shippingOption;
        this.H0 = l4;
        this.N0 = jjVar;
        this.O0 = str;
        this.b1 = inputInvoice;
        this.U0 = z10;
        this.W0 = z11;
        this.S0 = ("stripe".equals(paymentForm.native_provider) || "smartglocal".equals(this.C0.native_provider)) ? false : true;
        TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(paymentForm.bot_id));
        this.l0 = Z1;
        if (Z1 != null) {
            this.p0 = Z1.first_name;
        } else {
            this.p0 = "";
        }
        this.q0 = paymentForm.title;
        this.I0 = tL_payments_validateRequestedInfo;
        this.T0 = true;
        if (z10 || this.u0 == 4) {
            this.U0 = z10;
        } else {
            this.U0 = !this.C0.saved_credentials.isEmpty();
        }
        if (str3 != null) {
            this.x0 = str3;
        } else {
            if (this.C0.saved_credentials.isEmpty()) {
                return;
            }
            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = this.C0.saved_credentials.get(0);
            this.y0 = tL_paymentSavedCredentialsCard;
            this.x0 = tL_paymentSavedCredentialsCard.title;
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean presentFragment(org.telegram.ui.ActionBar.k2 k2Var, boolean z10) {
        D0(k2Var);
        return super.presentFragment(k2Var, z10);
    }

    public sm0(TLRPC.PaymentForm paymentForm, org.telegram.messenger.jj jjVar, String str, org.telegram.ui.ActionBar.k2 k2Var) {
        super(null);
        this.a = new ArrayList();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.G = true;
        this.I = new org.telegram.ui.Cells.p4[3];
        this.J = new ArrayList();
        this.K = new org.telegram.ui.Cells.c7[3];
        this.M = new org.telegram.ui.Cells.b9[3];
        this.N = new org.telegram.ui.Cells.x9[2];
        this.Y = new org.telegram.ui.Cells.a9[7];
        this.Z = -4.5f;
        this.c0 = 6;
        this.V0 = true;
        z0(null, paymentForm, jjVar, str, 4, null, null, null, null, null, null, false, null, k2Var, false);
    }

    public sm0(TLRPC.PaymentReceipt paymentReceipt) {
        super(null);
        this.a = new ArrayList();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.G = true;
        this.I = new org.telegram.ui.Cells.p4[3];
        this.J = new ArrayList();
        this.K = new org.telegram.ui.Cells.c7[3];
        this.M = new org.telegram.ui.Cells.b9[3];
        this.N = new org.telegram.ui.Cells.x9[2];
        this.Y = new org.telegram.ui.Cells.a9[7];
        this.Z = -4.5f;
        this.c0 = 6;
        this.u0 = 5;
        TLRPC.PaymentForm paymentForm = new TLRPC.PaymentForm();
        this.C0 = paymentForm;
        this.D0 = paymentReceipt;
        paymentForm.bot_id = paymentReceipt.bot_id;
        paymentForm.invoice = paymentReceipt.invoice;
        paymentForm.provider_id = paymentReceipt.provider_id;
        paymentForm.users = paymentReceipt.users;
        this.G0 = paymentReceipt.shipping;
        long j10 = paymentReceipt.tip_amount;
        if (j10 != 0) {
            this.H0 = Long.valueOf(j10);
        }
        TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(paymentReceipt.bot_id));
        this.l0 = Z1;
        if (Z1 != null) {
            this.p0 = Z1.first_name;
        } else {
            this.p0 = "";
        }
        this.q0 = paymentReceipt.title;
        if (paymentReceipt.info != null) {
            this.I0 = new TLRPC.TL_payments_validateRequestedInfo();
            if (this.N0 != null) {
                TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
                tL_inputInvoiceMessage.peer = getMessagesController().i1(paymentReceipt.bot_id);
                this.I0.invoice = tL_inputInvoiceMessage;
            } else {
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
                tL_inputInvoiceSlug.slug = this.O0;
                this.I0.invoice = tL_inputInvoiceSlug;
            }
            this.I0.info = paymentReceipt.info;
        }
        this.x0 = paymentReceipt.credentials_title;
    }

    public sm0(TLRPC.PaymentForm paymentForm, TLRPC.InputInvoice inputInvoice, org.telegram.ui.ActionBar.k2 k2Var) {
        this(inputInvoice, paymentForm, null, null, 4, null, null, null, null, null, null, false, null, k2Var, false);
        this.V0 = true;
    }
}
