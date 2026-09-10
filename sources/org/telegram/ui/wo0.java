package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.AsyncTask;
import android.os.Build;
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
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SRPHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class wo0 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public static final List g1 = Arrays.asList("http", "https");
    public static final List h1 = Collections.singletonList("tg");
    public wt A0;
    public String B0;
    public TLRPC.PaymentForm C0;
    public final TLRPC.PaymentReceipt D0;
    public ScrollView E;
    public TLRPC.TL_payments_validatedRequestedInfo E0;
    public boolean F;
    public TLRPC.TL_paymentFormMethod F0;
    public boolean G;
    public TLRPC.TL_shippingOption G0;
    public TextView H;
    public Long H0;
    public final org.telegram.ui.Cells.m4[] I;
    public TLRPC.TL_payments_validateRequestedInfo I0;
    public final ArrayList J;
    public TLRPC.TL_inputPaymentCredentialsGooglePay J0;
    public final org.telegram.ui.Cells.c7[] K;
    public String K0;
    public org.telegram.ui.Cells.x8 L;
    public String L0;
    public final org.telegram.ui.Cells.f9[] M;
    public JSONObject M0;
    public final org.telegram.ui.Cells.ga[] N;
    public MessageObject N0;
    public FrameLayout O;
    public String O0;
    public FrameLayout P;
    public boolean P0;
    public LinearLayout Q;
    public boolean Q0;
    public org.telegram.ui.Cells.g9 R;
    public String[] R0;
    public org.telegram.ui.Cells.j3 S;
    public boolean S0;
    public uo0 T;
    public boolean T0;
    public TextView U;
    public boolean U0;
    public org.telegram.ui.Cells.q6 V;
    public boolean V0;
    public so0 W;
    public boolean W0;
    public org.telegram.ui.Cells.l5 X;
    public boolean X0;
    public final org.telegram.ui.Cells.e9[] Y;
    public org.telegram.ui.ActionBar.f6 Y0;
    public float Z;
    public vo0 Z0;
    public final ArrayList a;
    public TL_account.Password a0;
    public boolean a1;
    public final HashMap b;
    public boolean b0;
    public TLRPC.InputInvoice b1;
    public final HashMap c;
    public int c0;
    public Utilities.Callback c1;
    public final HashMap d;
    public tn0 d0;
    public Utilities.Callback d1;
    public com.google.android.gms.internal.clearcut.v0 e;
    public boolean e0;
    public n20 e1;
    public EditTextBoldCursor[] f;
    public wo0 f0;
    public int f1;
    public boolean g0;
    public org.telegram.ui.Cells.l6[] h;
    public boolean h0;
    public boolean i0;
    public String j0;
    public boolean k0;
    public TLRPC.User l0;
    public boolean m0;
    public org.telegram.ui.ActionBar.w0 n;
    public boolean n0;
    public boolean o0;
    public String p0;
    public String q0;
    public org.telegram.ui.Components.zq r;
    public org.telegram.ui.ActionBar.p2 r0;
    public org.telegram.ui.Components.zq s;
    public zn0 s0;
    public ArrayList t0;
    public int u0;
    public AnimatorSet v;
    public boolean v0;
    public WebView w;
    public String w0;
    public String x;
    public String x0;
    public boolean y;
    public TLRPC.TL_paymentSavedCredentialsCard y0;
    public boolean z0;

    public wo0(TLRPC.InputInvoice inputInvoice, TLRPC.PaymentForm paymentForm, MessageObject messageObject, String str, int i10, TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo, TLRPC.TL_shippingOption tL_shippingOption, Long l4, String str2, String str3, TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, org.telegram.ui.ActionBar.p2 p2Var, boolean z11) {
        super(null);
        this.a = new ArrayList();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.G = true;
        this.I = new org.telegram.ui.Cells.m4[3];
        this.J = new ArrayList();
        this.K = new org.telegram.ui.Cells.c7[3];
        this.M = new org.telegram.ui.Cells.f9[3];
        this.N = new org.telegram.ui.Cells.ga[2];
        this.Y = new org.telegram.ui.Cells.e9[7];
        this.Z = -4.5f;
        this.c0 = 6;
        u0(inputInvoice, paymentForm, messageObject, str, i10, tL_payments_validatedRequestedInfo, tL_shippingOption, l4, str2, str3, tL_payments_validateRequestedInfo, z10, tL_inputPaymentCredentialsGooglePay, p2Var, z11);
    }

    public static /* synthetic */ void U(wo0 wo0Var, TL_account.Password password, byte[] bArr) {
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        byte[] x10 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow ? SRPHelper.getX(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
        TL_account.getTmpPassword gettmppassword = new TL_account.getTmpPassword();
        gettmppassword.period = 1800;
        rg0 rg0Var = new rg0(6, wo0Var, gettmppassword);
        TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = password.current_algo;
        if (!(passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.text = "PASSWORD_HASH_INVALID";
            rg0Var.run(null, tL_error);
            return;
        }
        TLRPC.TL_inputCheckPasswordSRP startCheck = SRPHelper.startCheck(x10, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
        gettmppassword.password = startCheck;
        if (startCheck != null) {
            ConnectionsManager.getInstance(wo0Var.currentAccount).sendRequest(gettmppassword, rg0Var, 10);
            return;
        }
        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
        tL_error2.text = "ALGO_INVALID";
        rg0Var.run(null, tL_error2);
    }

    public static /* synthetic */ void V(wo0 wo0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        wo0Var.D0(false);
        wo0Var.H0(true, false);
        if (tL_error != null) {
            String str = tL_error.text;
            str.getClass();
            switch (str) {
                case "ADDRESS_CITY_INVALID":
                    wo0Var.E0(2);
                    break;
                case "ADDRESS_STREET_LINE1_INVALID":
                    wo0Var.E0(0);
                    break;
                case "ADDRESS_COUNTRY_INVALID":
                    wo0Var.E0(4);
                    break;
                case "REQ_INFO_NAME_INVALID":
                    wo0Var.E0(6);
                    break;
                case "ADDRESS_POSTCODE_INVALID":
                    wo0Var.E0(5);
                    break;
                case "ADDRESS_STATE_INVALID":
                    wo0Var.E0(3);
                    break;
                case "REQ_INFO_PHONE_INVALID":
                    wo0Var.E0(9);
                    break;
                case "ADDRESS_STREET_LINE2_INVALID":
                    wo0Var.E0(1);
                    break;
                case "REQ_INFO_EMAIL_INVALID":
                    wo0Var.E0(7);
                    break;
                default:
                    org.telegram.ui.Components.d5.f0(wo0Var.currentAccount, tL_error, wo0Var, tLObject, new Object[0]);
                    break;
            }
        }
    }

    public static /* synthetic */ void W(wo0 wo0Var, TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo) {
        wo0Var.E0 = tL_payments_validatedRequestedInfo;
        if (wo0Var.C0.saved_info != null && !wo0Var.T0) {
            TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
            tL_payments_clearSavedInfo.info = true;
            ConnectionsManager.getInstance(wo0Var.currentAccount).sendRequest(tL_payments_clearSavedInfo, new bi.g1(16), wo0Var.W0 ? 8 : 0);
        }
        wo0Var.t0();
        wo0Var.D0(false);
        wo0Var.H0(true, false);
    }

    public static /* synthetic */ void X(wo0 wo0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        wo0Var.D0(false);
        wo0Var.H0(true, false);
        if (tL_error != null) {
            org.telegram.ui.Components.d5.f0(wo0Var.currentAccount, tL_error, wo0Var, tLObject, new Object[0]);
        }
    }

    public static /* synthetic */ void Y(wo0 wo0Var, org.telegram.ui.Components.pc pcVar, boolean z10, TLRPC.Message message) {
        pcVar.b();
        if (!z10) {
            TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
            tL_payments_getPaymentReceipt.msg_id = message.id;
            tL_payments_getPaymentReceipt.peer = MessagesController.getInstance(wo0Var.currentAccount).getInputPeer(message.peer_id);
            ConnectionsManager.getInstance(wo0Var.currentAccount).sendRequest(tL_payments_getPaymentReceipt, new wn0(wo0Var, 3), 2);
            return;
        }
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        if (U != null) {
            U.presentFragment(eo.Q9(message.id, MessageObject.getDialogId(message)));
        }
    }

    public static void Z(wo0 wo0Var) {
        ConnectionsManager.getInstance(wo0Var.currentAccount).sendRequest(new TL_account.resendPasswordEmail(), new bi.g1(16), wo0Var.W0 ? 8 : 0);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wo0Var.getParentActivity());
        alertDialog$Builder.a.T = LocaleController.getString(R.string.ResendCodeInfo);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        wo0Var.showDialog(alertDialog$Builder.a);
    }

    public static /* synthetic */ void a0(wo0 wo0Var, boolean z10, String str, String str2, TL_account.updatePasswordSettings updatepasswordsettings) {
        bi.f2 f2Var = new bi.f2(wo0Var, z10, str, 7);
        if (z10) {
            ConnectionsManager.getInstance(wo0Var.currentAccount).sendRequest(updatepasswordsettings, f2Var, 10);
            return;
        }
        byte[] stringBytes = AndroidUtilities.getStringBytes(str2);
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = wo0Var.a0.new_algo;
        if (!(passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.text = "PASSWORD_HASH_INVALID";
            f2Var.run(null, tL_error);
            return;
        }
        updatepasswordsettings.new_settings.new_password_hash = SRPHelper.getVBytes(stringBytes, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
        if (updatepasswordsettings.new_settings.new_password_hash == null) {
            TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
            tL_error2.text = "ALGO_INVALID";
            f2Var.run(null, tL_error2);
        }
        ConnectionsManager.getInstance(wo0Var.currentAccount).sendRequest(updatepasswordsettings, f2Var, 10);
    }

    public static /* synthetic */ void b0(wo0 wo0Var, TLRPC.TL_error tL_error, TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm) {
        org.telegram.ui.Components.d5.f0(wo0Var.currentAccount, tL_error, wo0Var, tL_payments_sendPaymentForm, new Object[0]);
        wo0Var.D0(false);
        wo0Var.H0(false, false);
        wo0Var.a1 = true;
        wo0Var.f1 = 4;
        vo0 vo0Var = wo0Var.Z0;
        if (vo0Var != null) {
            vo0Var.a(4);
        }
    }

    public static void c0(wo0 wo0Var, TLObject tLObject) {
        org.telegram.ui.ActionBar.p2 R;
        if (tLObject instanceof TLRPC.TL_payments_paymentReceiptStars) {
            xh.z7.j1(wo0Var.getParentActivity(), wo0Var.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject, wo0Var.Y0);
            return;
        }
        if (!(tLObject instanceof TLRPC.PaymentReceipt) || (R = LaunchActivity.R()) == null) {
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = new org.telegram.ui.ActionBar.n2();
        n2Var.a = true;
        wo0 wo0Var2 = new wo0((TLRPC.PaymentReceipt) tLObject);
        wo0Var2.c1 = wo0Var.c1;
        wo0Var2.d1 = wo0Var.d1;
        R.showAsSheet(wo0Var2, n2Var);
    }

    public static /* synthetic */ void d0(wo0 wo0Var, TLObject tLObject, TLRPC.TL_error tL_error, TL_account.getTmpPassword gettmppassword) {
        wo0Var.H0(true, false);
        wo0Var.D0(false);
        if (tLObject != null) {
            wo0Var.v0 = true;
            UserConfig.getInstance(wo0Var.currentAccount).tmpPassword = (TL_account.tmpPassword) tLObject;
            UserConfig.getInstance(wo0Var.currentAccount).saveConfig(false);
            wo0Var.t0();
            return;
        }
        if (!tL_error.text.equals("PASSWORD_HASH_INVALID")) {
            org.telegram.ui.Components.d5.f0(wo0Var.currentAccount, tL_error, wo0Var, gettmppassword, new Object[0]);
            return;
        }
        try {
            wo0Var.f[1].performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        AndroidUtilities.shakeViewSpring(wo0Var.f[1], 3.25f);
        wo0Var.f[1].setText("");
    }

    public static void e0(wo0 wo0Var, TLObject tLObject) {
        org.telegram.ui.ActionBar.p2 R;
        if (tLObject instanceof TLRPC.TL_payments_paymentReceiptStars) {
            xh.z7.j1(wo0Var.getParentActivity(), wo0Var.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject, wo0Var.Y0);
            return;
        }
        if (!(tLObject instanceof TLRPC.PaymentReceipt) || (R = LaunchActivity.R()) == null) {
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = new org.telegram.ui.ActionBar.n2();
        n2Var.a = true;
        wo0 wo0Var2 = new wo0((TLRPC.PaymentReceipt) tLObject);
        wo0Var2.c1 = wo0Var.c1;
        wo0Var2.d1 = wo0Var.d1;
        R.showAsSheet(wo0Var2, n2Var);
    }

    public static /* synthetic */ void f0(wo0 wo0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str, TL_account.getPassword getpassword) {
        if (tL_error != null) {
            org.telegram.ui.Components.d5.f0(wo0Var.currentAccount, tL_error, wo0Var, getpassword, new Object[0]);
            wo0Var.H0(true, false);
            wo0Var.D0(false);
            return;
        }
        TL_account.Password password = (TL_account.Password) tLObject;
        if (!TwoStepVerificationActivity.i0(password, false)) {
            org.telegram.ui.Components.d5.x0(wo0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
        } else if (password.has_password) {
            Utilities.globalQueue.postRunnable(new pf0(wo0Var, password, AndroidUtilities.getStringBytes(str), 14));
        } else {
            wo0Var.v0 = false;
            wo0Var.t0();
        }
    }

    public static /* synthetic */ void g0(wo0 wo0Var, org.telegram.ui.Components.pc pcVar, boolean z10, TLRPC.Message[] messageArr) {
        pcVar.b();
        if (!z10) {
            TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
            tL_payments_getPaymentReceipt.msg_id = messageArr[0].id;
            tL_payments_getPaymentReceipt.peer = MessagesController.getInstance(wo0Var.currentAccount).getInputPeer(messageArr[0].peer_id);
            ConnectionsManager.getInstance(wo0Var.currentAccount).sendRequest(tL_payments_getPaymentReceipt, new wn0(wo0Var, 2), 2);
            return;
        }
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        if (U != null) {
            U.presentFragment(eo.Q9(messageArr[0].id, MessageObject.getDialogId(messageArr[0])));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00cb, code lost:
    
        if (r7.phone_requested == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00d7, code lost:
    
        if (r23.J0 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00e1, code lost:
    
        if (r2.invoice.flexible != false) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void h0(wo0 wo0Var, String str, View view) {
        int i10;
        org.telegram.ui.Cells.q6 q6Var = wo0Var.V;
        if (q6Var != null && !wo0Var.F) {
            wo0Var.Z = -wo0Var.Z;
            AndroidUtilities.shakeViewSpring(q6Var.getTextView(), wo0Var.Z);
            AndroidUtilities.shakeViewSpring(wo0Var.V.getCheckBox(), wo0Var.Z);
            try {
                wo0Var.V.performHapticFeedback(3, 2);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        boolean z10 = wo0Var.V0;
        int i11 = 1;
        if (z10 && wo0Var.C0.saved_info != null && wo0Var.I0 == null) {
            wo0Var.D0(true);
            ak0 ak0Var = new ak0(9, wo0Var, view);
            if (wo0Var.Q0) {
                return;
            }
            wo0Var.H0(true, true);
            TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo = new TLRPC.TL_payments_validateRequestedInfo();
            wo0Var.I0 = tL_payments_validateRequestedInfo;
            TLRPC.InputInvoice inputInvoice = wo0Var.b1;
            if (inputInvoice != null) {
                tL_payments_validateRequestedInfo.invoice = inputInvoice;
            } else if (wo0Var.N0 != null) {
                TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
                tL_inputInvoiceMessage.peer = wo0Var.getMessagesController().getInputPeer(wo0Var.N0.messageOwner.peer_id);
                tL_inputInvoiceMessage.msg_id = wo0Var.N0.getId();
                wo0Var.I0.invoice = tL_inputInvoiceMessage;
            } else {
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
                tL_inputInvoiceSlug.slug = wo0Var.O0;
                wo0Var.I0.invoice = tL_inputInvoiceSlug;
            }
            TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo2 = wo0Var.I0;
            tL_payments_validateRequestedInfo2.save = true;
            tL_payments_validateRequestedInfo2.info = wo0Var.C0.saved_info;
            ConnectionsManager.getInstance(wo0Var.currentAccount).sendRequest(tL_payments_validateRequestedInfo2, new aa(wo0Var, ak0Var, tL_payments_validateRequestedInfo2, 29), (wo0Var.W0 ? 8 : 0) | 2);
            return;
        }
        if (z10) {
            TLRPC.PaymentForm paymentForm = wo0Var.C0;
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
                            wo0Var.G0(new org.telegram.ui.Components.ru(0, view));
                            return;
                        } else {
                            wo0 wo0Var2 = new wo0(wo0Var.b1, wo0Var.C0, wo0Var.N0, wo0Var.O0, i10, wo0Var.E0, wo0Var.G0, wo0Var.H0, wo0Var.w0, wo0Var.x0, wo0Var.I0, wo0Var.U0, null, wo0Var.r0, wo0Var.W0);
                            wo0Var2.c1 = wo0Var.c1;
                            wo0Var2.d1 = wo0Var.d1;
                            wo0Var.presentFragment(wo0Var2);
                            return;
                        }
                    }
                }
                i10 = (wo0Var.y0 == null && wo0Var.w0 == null && wo0Var.J0 == null) ? 2 : 1;
                if (i10 != 2) {
                }
                wo0 wo0Var22 = new wo0(wo0Var.b1, wo0Var.C0, wo0Var.N0, wo0Var.O0, i10, wo0Var.E0, wo0Var.G0, wo0Var.H0, wo0Var.w0, wo0Var.x0, wo0Var.I0, wo0Var.U0, null, wo0Var.r0, wo0Var.W0);
                wo0Var22.c1 = wo0Var.c1;
                wo0Var22.d1 = wo0Var.d1;
                wo0Var.presentFragment(wo0Var22);
                return;
            }
            if (wo0Var.y0 == null) {
                if (wo0Var.w0 == null) {
                }
            }
            if (wo0Var.G0 == null) {
            }
        }
        if (!wo0Var.C0.password_missing && wo0Var.y0 != null) {
            if (UserConfig.getInstance(wo0Var.currentAccount).tmpPassword != null && UserConfig.getInstance(wo0Var.currentAccount).tmpPassword.valid_until < ConnectionsManager.getInstance(wo0Var.currentAccount).getCurrentTime() + 60) {
                UserConfig.getInstance(wo0Var.currentAccount).tmpPassword = null;
                UserConfig.getInstance(wo0Var.currentAccount).saveConfig(false);
            }
            if (UserConfig.getInstance(wo0Var.currentAccount).tmpPassword == null) {
                wo0Var.X0 = true;
                wo0 wo0Var3 = new wo0(wo0Var.b1, wo0Var.C0, wo0Var.N0, wo0Var.O0, 3, wo0Var.E0, wo0Var.G0, wo0Var.H0, null, wo0Var.x0, wo0Var.I0, wo0Var.U0, null, wo0Var.r0, wo0Var.W0);
                wo0Var3.c1 = wo0Var.c1;
                wo0Var3.d1 = wo0Var.d1;
                wo0Var.presentFragment(wo0Var3);
                wo0Var.X0 = false;
                return;
            }
            if (wo0Var.V0) {
                wo0Var.V0 = false;
                NotificationCenter.getInstance(wo0Var.currentAccount).removeObserver(wo0Var, NotificationCenter.paymentFinished);
            }
        }
        TLRPC.User user = wo0Var.l0;
        if (user == null || user.verified) {
            wo0Var.I0(wo0Var.R0[0]);
            return;
        }
        String str2 = "payment_warning_" + wo0Var.l0.id;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(wo0Var.currentAccount);
        if (notificationsSettings.getBoolean(str2, false)) {
            wo0Var.I0(wo0Var.R0[0]);
            return;
        }
        notificationsSettings.edit().putBoolean(str2, true).commit();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wo0Var.getParentActivity());
        String string = LocaleController.getString(R.string.PaymentWarning);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.R = string;
        d2Var.T = LocaleController.formatString("PaymentWarningText", R.string.PaymentWarningText, wo0Var.p0, str);
        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new un0(wo0Var, i11));
        wo0Var.showDialog(d2Var);
    }

    public static void i0(wo0 wo0Var, TLRPC.TL_error tL_error, boolean z10, TLObject tLObject, String str) {
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(wo0Var.currentAccount).sendRequest(new TL_account.getPassword(), new bi.m4(10, wo0Var, z10), 8);
            return;
        }
        wo0Var.H0(true, false);
        if (z10) {
            TL_account.Password password = wo0Var.a0;
            password.has_password = false;
            password.current_algo = null;
            wo0Var.T.a(password);
            wo0Var.finishFragment();
            return;
        }
        if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
            if (wo0Var.getParentActivity() == null) {
                return;
            }
            wo0Var.t0();
            return;
        }
        if (tL_error != null) {
            if (!tL_error.text.equals("EMAIL_UNCONFIRMED") && !tL_error.text.startsWith("EMAIL_UNCONFIRMED_")) {
                if (tL_error.text.equals("EMAIL_INVALID")) {
                    wo0Var.F0(LocaleController.getString(R.string.AppName), LocaleController.getString(R.string.PasswordEmailInvalid));
                    return;
                } else if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                    wo0Var.F0(LocaleController.getString(R.string.AppName), tL_error.text);
                    return;
                } else {
                    int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                    wo0Var.F0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
                    return;
                }
            }
            wo0Var.c0 = Utilities.parseInt((CharSequence) tL_error.text).intValue();
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wo0Var.getParentActivity());
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), new l80(20, wo0Var, str));
            String string = LocaleController.getString(R.string.YourEmailAlmostThereText);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
            d2Var.T = string;
            d2Var.R = LocaleController.getString(R.string.YourEmailAlmostThere);
            Dialog showDialog = wo0Var.showDialog(d2Var);
            if (showDialog != null) {
                showDialog.setCanceledOnTouchOutside(false);
                showDialog.setCancelable(false);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0207, code lost:
    
        if (r5 == false) goto L94;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0275  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void j0(wo0 wo0Var) {
        Integer num;
        Integer num2;
        boolean z10;
        boolean z11;
        Integer num3;
        boolean z12;
        boolean z13;
        String[] split = wo0Var.f[1].getText().toString().split("/");
        if (split.length == 2) {
            Integer parseInt = Utilities.parseInt((CharSequence) split[0]);
            num2 = Utilities.parseInt((CharSequence) split[1]);
            num = parseInt;
        } else {
            num = null;
            num2 = null;
        }
        uc.a aVar = new uc.a(wo0Var.f[0].getText().toString(), num, num2, wo0Var.f[3].getText().toString(), wo0Var.f[2].getText().toString(), null, null, null, null, wo0Var.f[5].getText().toString(), wo0Var.f[4].getText().toString(), null, null, null, null, null, null);
        wo0Var.x0 = aVar.a() + " *" + aVar.b();
        boolean z14 = num != null && num2 != null && UserConfig.getInstance(wo0Var.currentAccount).getClientPhone().startsWith("7") && "smartglocal".equals(wo0Var.C0.native_provider) && (num2.intValue() > 22 || (num2.intValue() == 22 && num.intValue() > 1));
        String str = aVar.a;
        if (!w7.s8.d(str)) {
            String replaceAll = str.trim().replaceAll("\\s+|-", "");
            if (!w7.s8.d(replaceAll) && replaceAll != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= replaceAll.length()) {
                        int length = replaceAll.length() - 1;
                        int i11 = 0;
                        boolean z15 = true;
                        while (true) {
                            if (length >= 0) {
                                char charAt = replaceAll.charAt(length);
                                if (!Character.isDigit(charAt)) {
                                    break;
                                }
                                int parseInt2 = Integer.parseInt("" + charAt);
                                boolean z16 = z15 ^ true;
                                if (!z15) {
                                    parseInt2 *= 2;
                                }
                                if (parseInt2 > 9) {
                                    parseInt2 -= 9;
                                }
                                i11 += parseInt2;
                                length--;
                                z15 = z16;
                            } else if (i11 % 10 == 0) {
                                String a2 = aVar.a();
                                if (!"American Express".equals(a2) ? !(!"Diners Club".equals(a2) ? replaceAll.length() != 16 : replaceAll.length() != 14) : replaceAll.length() == 15) {
                                    if (!z14) {
                                        Integer num4 = aVar.c;
                                        if (num4 != null && num4.intValue() >= 1 && num4.intValue() <= 12 && (num3 = aVar.d) != null && w7.p8.a(num3.intValue()) >= ob.a.A2().get(1)) {
                                            if (num4 == null || num4.intValue() < 1 || num4.intValue() > 12 || num3 == null || w7.p8.a(num3.intValue()) < ob.a.A2().get(1)) {
                                                z12 = false;
                                            } else {
                                                int intValue = num3.intValue();
                                                int intValue2 = num4.intValue();
                                                if (w7.p8.a(intValue) >= ob.a.A2().get(1)) {
                                                    Calendar A2 = ob.a.A2();
                                                    if (w7.p8.a(intValue) != A2.get(1) || intValue2 >= A2.get(2) + 1) {
                                                        z13 = false;
                                                        z12 = !z13;
                                                    }
                                                }
                                                z13 = true;
                                                z12 = !z13;
                                            }
                                        }
                                        wo0Var.E0(1);
                                        return;
                                    }
                                    if (wo0Var.i0 && wo0Var.f[2].length() == 0) {
                                        wo0Var.E0(2);
                                        return;
                                    }
                                    String str2 = aVar.b;
                                    if (!w7.s8.d(str2)) {
                                        String trim = str2.trim();
                                        String a10 = aVar.a();
                                        boolean z17 = (a10 == null && trim.length() >= 3 && trim.length() <= 4) || ("American Express".equals(a10) && trim.length() == 4) || trim.length() == 3;
                                        if (trim != null) {
                                            for (int i12 = 0; i12 < trim.length(); i12++) {
                                                if (Character.isDigit(trim.charAt(i12))) {
                                                }
                                            }
                                            z10 = true;
                                            if (z10 && z17) {
                                                z11 = true;
                                                if (!z11) {
                                                    wo0Var.E0(3);
                                                    return;
                                                }
                                                if (wo0Var.g0 && wo0Var.f[4].length() == 0) {
                                                    wo0Var.E0(4);
                                                    return;
                                                }
                                                if (wo0Var.h0 && wo0Var.f[5].length() == 0) {
                                                    wo0Var.E0(5);
                                                    return;
                                                }
                                                wo0Var.H0(true, true);
                                                try {
                                                    if ("stripe".equals(wo0Var.C0.native_provider)) {
                                                        String str3 = wo0Var.j0;
                                                        o0.b bVar = new o0.b(new ob.a(22));
                                                        ob.a.C2(str3);
                                                        lo0 lo0Var = new lo0(wo0Var);
                                                        try {
                                                            ob.a.C2(str3);
                                                            new sc.a(bVar, str3, aVar, lo0Var).execute(new Void[0]);
                                                        } catch (tc.c e) {
                                                            lo0Var.a(e);
                                                        }
                                                    } else if ("smartglocal".equals(wo0Var.C0.native_provider)) {
                                                        new mo0(wo0Var, aVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                                                    }
                                                    return;
                                                } catch (Exception e7) {
                                                    FileLog.e(e7);
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
                    } else if (!Character.isDigit(replaceAll.charAt(i10))) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
        }
        wo0Var.E0(0);
    }

    public static void k0(wo0 wo0Var) {
        if (UserConfig.getInstance(wo0Var.currentAccount).tmpPassword != null && UserConfig.getInstance(wo0Var.currentAccount).tmpPassword.valid_until < ConnectionsManager.getInstance(wo0Var.currentAccount).getCurrentTime() + 60) {
            UserConfig.getInstance(wo0Var.currentAccount).tmpPassword = null;
            UserConfig.getInstance(wo0Var.currentAccount).saveConfig(false);
        }
        if (UserConfig.getInstance(wo0Var.currentAccount).tmpPassword != null) {
            wo0Var.z0();
            return;
        }
        if (wo0Var.f[1].length() == 0) {
            try {
                wo0Var.f[1].performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            AndroidUtilities.shakeViewSpring(wo0Var.f[1], 2.5f);
            return;
        }
        String obj = wo0Var.f[1].getText().toString();
        wo0Var.H0(true, true);
        wo0Var.D0(true);
        TL_account.getPassword getpassword = new TL_account.getPassword();
        ConnectionsManager.getInstance(wo0Var.currentAccount).sendRequest(getpassword, new aa(wo0Var, obj, getpassword, 28), (wo0Var.W0 ? 8 : 0) | 2);
    }

    public static void m0(wo0 wo0Var) {
        if (wo0Var.Q0) {
            return;
        }
        wo0Var.H0(true, true);
        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo = new TLRPC.TL_payments_validateRequestedInfo();
        wo0Var.I0 = tL_payments_validateRequestedInfo;
        TLRPC.InputInvoice inputInvoice = wo0Var.b1;
        if (inputInvoice != null) {
            tL_payments_validateRequestedInfo.invoice = inputInvoice;
        } else if (wo0Var.N0 != null) {
            TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
            tL_inputInvoiceMessage.peer = wo0Var.getMessagesController().getInputPeer(wo0Var.N0.messageOwner.peer_id);
            tL_inputInvoiceMessage.msg_id = wo0Var.N0.getId();
            wo0Var.I0.invoice = tL_inputInvoiceMessage;
        } else {
            TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
            tL_inputInvoiceSlug.slug = wo0Var.O0;
            wo0Var.I0.invoice = tL_inputInvoiceSlug;
        }
        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo2 = wo0Var.I0;
        tL_payments_validateRequestedInfo2.save = wo0Var.T0;
        tL_payments_validateRequestedInfo2.info = new TLRPC.TL_paymentRequestedInfo();
        if (wo0Var.C0.invoice.name_requested) {
            wo0Var.I0.info.name = wo0Var.f[6].getText().toString();
            wo0Var.I0.info.flags |= 1;
        }
        if (wo0Var.C0.invoice.phone_requested) {
            wo0Var.I0.info.phone = "+" + wo0Var.f[8].getText().toString() + wo0Var.f[9].getText().toString();
            TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo = wo0Var.I0.info;
            tL_paymentRequestedInfo.flags = tL_paymentRequestedInfo.flags | 2;
        }
        if (wo0Var.C0.invoice.email_requested) {
            wo0Var.I0.info.email = wo0Var.f[7].getText().toString().trim();
            wo0Var.I0.info.flags |= 4;
        }
        if (wo0Var.C0.invoice.shipping_address_requested) {
            wo0Var.I0.info.shipping_address = new TLRPC.TL_postAddress();
            wo0Var.I0.info.shipping_address.street_line1 = wo0Var.f[0].getText().toString();
            wo0Var.I0.info.shipping_address.street_line2 = wo0Var.f[1].getText().toString();
            wo0Var.I0.info.shipping_address.city = wo0Var.f[2].getText().toString();
            wo0Var.I0.info.shipping_address.state = wo0Var.f[3].getText().toString();
            TLRPC.TL_postAddress tL_postAddress = wo0Var.I0.info.shipping_address;
            String str = wo0Var.B0;
            if (str == null) {
                str = "";
            }
            tL_postAddress.country_iso2 = str;
            tL_postAddress.post_code = wo0Var.f[5].getText().toString();
            wo0Var.I0.info.flags |= 8;
        }
        ConnectionsManager.getInstance(wo0Var.currentAccount).sendRequest(wo0Var.I0, new rg0(4, wo0Var, wo0Var.I0), (wo0Var.W0 ? 8 : 0) | 2);
    }

    public static JSONObject p0() {
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

    public final void A0(boolean z10) {
        String str;
        String str2;
        if (!z10 && this.S.getVisibility() == 0) {
            String text = this.S.getText();
            if (text.length() == 0) {
                org.telegram.ui.Cells.j3 j3Var = this.S;
                try {
                    j3Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AndroidUtilities.shakeViewSpring(j3Var, 2.5f);
                return;
            } else {
                H0(true, true);
                TL_account.confirmPasswordEmail confirmpasswordemail = new TL_account.confirmPasswordEmail();
                confirmpasswordemail.code = text;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(confirmpasswordemail, new wn0(this, 0), 10);
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
            str = null;
            str2 = null;
        } else {
            String obj = this.f[0].getText().toString();
            if (TextUtils.isEmpty(obj)) {
                E0(0);
                return;
            }
            if (!obj.equals(this.f[1].getText().toString())) {
                try {
                    Toast.makeText(getParentActivity(), LocaleController.getString(R.string.PasswordDoNotMatch), 0).show();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                E0(1);
                return;
            }
            String obj2 = this.f[2].getText().toString();
            if (obj2.length() < 3) {
                E0(2);
                return;
            }
            int lastIndexOf = obj2.lastIndexOf(46);
            int lastIndexOf2 = obj2.lastIndexOf(64);
            if (lastIndexOf2 < 0 || lastIndexOf < lastIndexOf2) {
                E0(2);
                return;
            }
            updatepasswordsettings.password = new TLRPC.TL_inputCheckPasswordEmpty();
            TL_account.passwordInputSettings passwordinputsettings2 = new TL_account.passwordInputSettings();
            updatepasswordsettings.new_settings = passwordinputsettings2;
            int i10 = passwordinputsettings2.flags;
            passwordinputsettings2.flags = i10 | 1;
            passwordinputsettings2.hint = "";
            passwordinputsettings2.new_algo = this.a0.new_algo;
            passwordinputsettings2.flags = 3 | i10;
            passwordinputsettings2.email = obj2.trim();
            str = obj2;
            str2 = obj;
        }
        H0(true, true);
        Utilities.globalQueue.postRunnable(new bi.e2(this, z10, str, str2, updatepasswordsettings));
    }

    public final void B0(TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo) {
        TLRPC.TL_postAddress tL_postAddress = tL_paymentRequestedInfo.shipping_address;
        org.telegram.ui.Cells.e9[] e9VarArr = this.Y;
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
            a4.a.z(sb2, ", ", str4, ", ", str5);
            e9VarArr[2].b(R.drawable.msg_payment_address, a4.a.s(sb2, ", ", str6), LocaleController.getString(R.string.PaymentShippingAddress), true);
        }
        e9VarArr[2].setVisibility(tL_paymentRequestedInfo.shipping_address != null ? 0 : 8);
        String str7 = tL_paymentRequestedInfo.name;
        if (str7 != null) {
            e9VarArr[3].b(R.drawable.msg_contacts, str7, LocaleController.getString(R.string.PaymentCheckoutName), true);
        }
        e9VarArr[3].setVisibility(tL_paymentRequestedInfo.name != null ? 0 : 8);
        if (tL_paymentRequestedInfo.phone != null) {
            e9VarArr[4].b(R.drawable.msg_calls, gf.b.c().b(tL_paymentRequestedInfo.phone), LocaleController.getString(R.string.PaymentCheckoutPhoneNumber), (tL_paymentRequestedInfo.email == null && this.G0 == null) ? false : true);
        }
        e9VarArr[4].setVisibility(tL_paymentRequestedInfo.phone != null ? 0 : 8);
        String str8 = tL_paymentRequestedInfo.email;
        if (str8 != null) {
            e9VarArr[5].b(R.drawable.msg_mention, str8, LocaleController.getString(R.string.PaymentCheckoutEmail), this.G0 != null);
        }
        e9VarArr[5].setVisibility(tL_paymentRequestedInfo.email != null ? 0 : 8);
    }

    public final void C0(TL_account.Password password) {
        if (password == null || !password.has_password) {
            this.a0 = password;
            this.b0 = (password == null || TextUtils.isEmpty(password.email_unconfirmed_pattern)) ? false : true;
            J0();
        } else {
            if (getParentActivity() == null) {
                return;
            }
            t0();
        }
    }

    public final void D0(boolean z10) {
        this.P0 = z10;
        this.G = !z10;
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar != null && lVar.getBackButton() != null) {
            this.actionBar.getBackButton().setEnabled(!this.P0);
        }
        org.telegram.ui.Cells.e9 e9Var = this.Y[0];
        if (e9Var != null) {
            e9Var.setEnabled(!this.P0);
        }
    }

    public final void E0(int i10) {
        EditTextBoldCursor editTextBoldCursor = this.f[i10];
        try {
            editTextBoldCursor.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        AndroidUtilities.shakeViewSpring(editTextBoldCursor, 2.5f);
    }

    public final void F0(String str, String str2) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.R = str;
        d2Var.T = str2;
        showDialog(d2Var);
    }

    public final void G0(Runnable runnable) {
        org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, (Context) getParentActivity(), (org.telegram.ui.ActionBar.f6) null, false);
        h3Var.fixNavigationBar();
        h3Var.title = LocaleController.getString(R.string.PaymentCheckoutMethod);
        h3Var.bigTitle = true;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = this.y0;
        if (tL_paymentSavedCredentialsCard != null) {
            arrayList.add(tL_paymentSavedCredentialsCard.title);
            arrayList2.add(Integer.valueOf(R.drawable.msg_payment_card));
        } else {
            String str = this.x0;
            if (str != null) {
                arrayList.add(str);
                arrayList2.add(Integer.valueOf(R.drawable.msg_payment_card));
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
                arrayList2.add(Integer.valueOf(R.drawable.msg_payment_card));
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
        arrayList.add(LocaleController.getString(R.string.PaymentCheckoutMethodNewCard));
        arrayList2.add(Integer.valueOf(R.drawable.msg_addbot));
        int[] iArr = new int[arrayList2.size()];
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            iArr[i12] = ((Integer) arrayList2.get(i12)).intValue();
        }
        CharSequence[] charSequenceArr = (CharSequence[]) arrayList.toArray(new CharSequence[0]);
        org.telegram.ui.Components.a3 a3Var = new org.telegram.ui.Components.a3(this, runnable, arrayList3, arrayList, 1);
        h3Var.items = charSequenceArr;
        h3Var.itemIcons = iArr;
        h3Var.onClickListener = a3Var;
        showDialog(h3Var);
    }

    public final void H0(boolean z10, boolean z11) {
        AnimatorSet animatorSet = this.v;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        int i10 = 1;
        int i11 = 0;
        if (!z10 || this.n == null) {
            if (this.U != null) {
                this.v = new AnimatorSet();
                if (z11) {
                    this.s.setVisibility(0);
                    this.W.setEnabled(false);
                    AnimatorSet animatorSet2 = this.v;
                    TextView textView = this.U;
                    Property property = View.SCALE_X;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.1f);
                    TextView textView2 = this.U;
                    Property property2 = View.SCALE_Y;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, 0.1f);
                    TextView textView3 = this.U;
                    Property property3 = View.ALPHA;
                    animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.zq, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.zq, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.zq, Float>) property3, 1.0f));
                } else {
                    this.U.setVisibility(0);
                    this.W.setEnabled(true);
                    AnimatorSet animatorSet3 = this.v;
                    org.telegram.ui.Components.zq zqVar = this.s;
                    Property property4 = View.SCALE_X;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(zqVar, (Property<org.telegram.ui.Components.zq, Float>) property4, 0.1f);
                    org.telegram.ui.Components.zq zqVar2 = this.s;
                    Property property5 = View.SCALE_Y;
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(zqVar2, (Property<org.telegram.ui.Components.zq, Float>) property5, 0.1f);
                    org.telegram.ui.Components.zq zqVar3 = this.s;
                    Property property6 = View.ALPHA;
                    animatorSet3.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(zqVar3, (Property<org.telegram.ui.Components.zq, Float>) property6, 0.0f), ObjectAnimator.ofFloat(this.U, (Property<TextView, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.U, (Property<TextView, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.U, (Property<TextView, Float>) property6, 1.0f));
                }
                this.v.addListener(new no0(this, z11, i10));
                this.v.setDuration(150L);
                this.v.start();
                return;
            }
            return;
        }
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.v = animatorSet4;
        if (z11) {
            this.r.setVisibility(0);
            this.n.setEnabled(false);
            AnimatorSet animatorSet5 = this.v;
            View contentView = this.n.getContentView();
            Property property7 = View.SCALE_X;
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(contentView, (Property<View, Float>) property7, 0.1f);
            View contentView2 = this.n.getContentView();
            Property property8 = View.SCALE_Y;
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(contentView2, (Property<View, Float>) property8, 0.1f);
            View contentView3 = this.n.getContentView();
            Property property9 = View.ALPHA;
            animatorSet5.playTogether(ofFloat5, ofFloat6, ObjectAnimator.ofFloat(contentView3, (Property<View, Float>) property9, 0.0f), ObjectAnimator.ofFloat(this.r, (Property<org.telegram.ui.Components.zq, Float>) property7, 1.0f), ObjectAnimator.ofFloat(this.r, (Property<org.telegram.ui.Components.zq, Float>) property8, 1.0f), ObjectAnimator.ofFloat(this.r, (Property<org.telegram.ui.Components.zq, Float>) property9, 1.0f));
        } else if (this.w != null) {
            animatorSet4.playTogether(ObjectAnimator.ofFloat(this.r, (Property<org.telegram.ui.Components.zq, Float>) View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.r, (Property<org.telegram.ui.Components.zq, Float>) View.SCALE_Y, 0.1f), ObjectAnimator.ofFloat(this.r, (Property<org.telegram.ui.Components.zq, Float>) View.ALPHA, 0.0f));
        } else {
            this.n.getContentView().setVisibility(0);
            this.n.setEnabled(true);
            AnimatorSet animatorSet6 = this.v;
            org.telegram.ui.Components.zq zqVar4 = this.r;
            Property property10 = View.SCALE_X;
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(zqVar4, (Property<org.telegram.ui.Components.zq, Float>) property10, 0.1f);
            org.telegram.ui.Components.zq zqVar5 = this.r;
            Property property11 = View.SCALE_Y;
            ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(zqVar5, (Property<org.telegram.ui.Components.zq, Float>) property11, 0.1f);
            org.telegram.ui.Components.zq zqVar6 = this.r;
            Property property12 = View.ALPHA;
            animatorSet6.playTogether(ofFloat7, ofFloat8, ObjectAnimator.ofFloat(zqVar6, (Property<org.telegram.ui.Components.zq, Float>) property12, 0.0f));
            if (!isFinishing()) {
                this.v.playTogether(ObjectAnimator.ofFloat(this.n.getContentView(), (Property<View, Float>) property10, 1.0f), ObjectAnimator.ofFloat(this.n.getContentView(), (Property<View, Float>) property11, 1.0f), ObjectAnimator.ofFloat(this.n.getContentView(), (Property<View, Float>) property12, 1.0f));
            }
        }
        this.v.addListener(new no0(this, z11, i11));
        this.v.setDuration(150L);
        this.v.start();
    }

    public final void I0(String str) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String string = LocaleController.getString(R.string.PaymentTransactionReview);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.R = string;
        d2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("PaymentTransactionMessage2", R.string.PaymentTransactionMessage2, str, this.p0, this.q0));
        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new un0(this, 5));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(d2Var);
    }

    public final void J0() {
        if (this.u0 == 6) {
            org.telegram.ui.Cells.f9[] f9VarArr = this.M;
            if (f9VarArr[2] == null) {
                return;
            }
            int i10 = 0;
            this.n.setVisibility(0);
            TL_account.Password password = this.a0;
            ArrayList arrayList = this.J;
            org.telegram.ui.Cells.m4[] m4VarArr = this.I;
            org.telegram.ui.Cells.ga[] gaVarArr = this.N;
            if (password == null) {
                H0(true, true);
                f9VarArr[2].setVisibility(8);
                gaVarArr[0].setVisibility(8);
                gaVarArr[1].setVisibility(8);
                this.S.setVisibility(8);
                m4VarArr[0].setVisibility(8);
                m4VarArr[1].setVisibility(8);
                f9VarArr[0].setVisibility(8);
                for (int i11 = 0; i11 < 3; i11++) {
                    ((View) this.f[i11].getParent()).setVisibility(8);
                }
                while (i10 < arrayList.size()) {
                    ((View) arrayList.get(i10)).setVisibility(8);
                    i10++;
                }
                return;
            }
            H0(true, false);
            if (!this.b0) {
                f9VarArr[2].setVisibility(8);
                gaVarArr[0].setVisibility(8);
                gaVarArr[1].setVisibility(8);
                f9VarArr[1].setText(LocaleController.getString(R.string.PaymentPasswordEmailInfo));
                this.S.setVisibility(8);
                m4VarArr[0].setVisibility(0);
                m4VarArr[1].setVisibility(0);
                f9VarArr[0].setVisibility(0);
                for (int i12 = 0; i12 < 3; i12++) {
                    ((View) this.f[i12].getParent()).setVisibility(0);
                }
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    ((View) arrayList.get(i13)).setVisibility(0);
                }
                return;
            }
            org.telegram.ui.Cells.f9 f9Var = f9VarArr[2];
            int i14 = R.string.EmailPasswordConfirmText2;
            String str = this.a0.email_unconfirmed_pattern;
            if (str == null) {
                str = "";
            }
            f9Var.setText(LocaleController.formatString("EmailPasswordConfirmText2", i14, str));
            f9VarArr[2].setVisibility(0);
            gaVarArr[0].setVisibility(0);
            gaVarArr[1].setVisibility(0);
            this.S.setVisibility(0);
            f9VarArr[1].setText("");
            m4VarArr[0].setVisibility(8);
            m4VarArr[1].setVisibility(8);
            f9VarArr[0].setVisibility(8);
            for (int i15 = 0; i15 < 3; i15++) {
                ((View) this.f[i15].getParent()).setVisibility(8);
            }
            while (i10 < arrayList.size()) {
                ((View) arrayList.get(i10)).setVisibility(8);
                i10++;
            }
        }
    }

    public final void K0() {
        org.telegram.ui.Cells.f9[] f9VarArr = this.M;
        if (f9VarArr[0] != null) {
            org.telegram.ui.Cells.c7[] c7VarArr = this.K;
            if (c7VarArr[2] == null) {
                return;
            }
            TLRPC.PaymentForm paymentForm = this.C0;
            if ((!paymentForm.password_missing && !paymentForm.can_save_credentials) || (this.w != null && this.z0)) {
                this.L.setVisibility(8);
                f9VarArr[0].setVisibility(8);
                org.telegram.ui.Cells.c7 c7Var = c7VarArr[2];
                c7Var.setBackground(org.telegram.ui.ActionBar.j6.V0(c7Var.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.b7));
                return;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.PaymentCardSavePaymentInformationInfoLine1));
            if (this.C0.password_missing) {
                w0();
                spannableStringBuilder.append((CharSequence) "\n");
                int length = spannableStringBuilder.length();
                String string = LocaleController.getString(R.string.PaymentCardSavePaymentInformationInfoLine2);
                int indexOf = string.indexOf(42);
                int lastIndexOf = string.lastIndexOf(42);
                spannableStringBuilder.append((CharSequence) string);
                if (indexOf != -1 && lastIndexOf != -1) {
                    int i10 = indexOf + length;
                    int i11 = lastIndexOf + length;
                    f9VarArr[0].getTextView().setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                    spannableStringBuilder.replace(i11, i11 + 1, (CharSequence) "");
                    spannableStringBuilder.replace(i10, i10 + 1, (CharSequence) "");
                    spannableStringBuilder.setSpan(new to0(this), i10, i11 - 1, 33);
                }
            }
            this.L.setEnabled(true);
            f9VarArr[0].setText(spannableStringBuilder);
            this.L.setVisibility(0);
            f9VarArr[0].setVisibility(0);
            org.telegram.ui.Cells.c7 c7Var2 = c7VarArr[2];
            c7Var2.setBackground(org.telegram.ui.ActionBar.j6.V0(c7Var2.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.j6.b7));
        }
    }

    public final void L0() {
        this.R0[0] = s0(this.t0);
        this.R.a(LocaleController.getString(R.string.PaymentTransactionTotal), this.R0[0], true);
        TextView textView = this.U;
        if (textView != null) {
            textView.setText(LocaleController.formatString("PaymentCheckoutPay", R.string.PaymentCheckoutPay, this.R0[0]));
        }
        if (this.s0 != null) {
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.ei);
            int childCount = this.s0.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                TextView textView2 = (TextView) this.s0.getChildAt(i10);
                if (textView2.getTag().equals(this.H0)) {
                    org.telegram.ui.ActionBar.j6.w1(themedColor, textView2.getBackground());
                    textView2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.fi));
                } else {
                    org.telegram.ui.ActionBar.j6.w1(536870911 & themedColor, textView2.getBackground());
                    textView2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Z8));
                }
                textView2.invalidate();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:178:0x030e, code lost:
    
        if (r10.email_requested == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:481:0x0fe3, code lost:
    
        if (r11.email_requested == false) goto L466;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0773  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x078d  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x07a2  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x07b9  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x07f4  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0853  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x08e3  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x080d  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x07c6  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0783  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0b8a  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0bef  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0c1f  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0c4d  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0d11  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0c6a  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0c21  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0bfc  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0be0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0216  */
    /* JADX WARN: Type inference failed for: r3v244, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r3v248, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r3v249, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r3v285, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r4v147, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r4v291, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    @Override // org.telegram.ui.ActionBar.p2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        String str;
        String str2;
        String str3;
        char c10;
        TLRPC.PaymentForm paymentForm;
        SpannableStringBuilder spannableStringBuilder;
        TLRPC.PaymentForm paymentForm2;
        TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo;
        boolean z10;
        char c11;
        int i10;
        int i11;
        TLRPC.TL_invoice tL_invoice;
        org.telegram.ui.Cells.c7 c7Var;
        TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo2;
        TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo3;
        String str4;
        String str5;
        TelephonyManager telephonyManager;
        ?? frameLayout;
        boolean z11;
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
                this.actionBar.setTitle(LocaleController.getString(R.string.PaymentShippingInfo));
                break;
            case 1:
                this.actionBar.setTitle(LocaleController.getString(R.string.PaymentShippingMethod));
                break;
            case 2:
            case 3:
                TLRPC.TL_paymentFormMethod tL_paymentFormMethod = this.F0;
                if (tL_paymentFormMethod != null && !TextUtils.isEmpty(tL_paymentFormMethod.title)) {
                    this.actionBar.setTitle(this.F0.title);
                    break;
                } else {
                    this.actionBar.setTitle(LocaleController.getString(R.string.PaymentCardInfo));
                    break;
                }
                break;
            case 4:
                if (this.C0.invoice.test) {
                    this.actionBar.setTitle("Test " + LocaleController.getString(R.string.PaymentCheckout));
                    break;
                } else {
                    this.actionBar.setTitle(LocaleController.getString(R.string.PaymentCheckout));
                    break;
                }
            case 5:
                if (this.C0.invoice.test) {
                    this.actionBar.setTitle("Test " + LocaleController.getString(R.string.PaymentReceipt));
                    break;
                } else {
                    this.actionBar.setTitle(LocaleController.getString(R.string.PaymentReceipt));
                    break;
                }
            case 6:
                this.actionBar.setTitle(LocaleController.getString(R.string.PaymentPassword));
                break;
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ho0(this));
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        int i12 = this.u0;
        int i13 = 6;
        int i14 = 3;
        if (i12 == 0 || i12 == 1 || i12 == 2 || i12 == 3 || i12 == 4 || i12 == 6) {
            this.n = n10.h(1, R.drawable.ic_ab_done, LocaleController.getString(R.string.Done), AndroidUtilities.dp(56.0f));
            org.telegram.ui.Components.zq zqVar = new org.telegram.ui.Components.zq(context, 1);
            this.r = zqVar;
            zqVar.setAlpha(0.0f);
            this.r.setScaleX(0.1f);
            this.r.setScaleY(0.1f);
            this.r.setVisibility(4);
            this.n.addView(this.r, w7.a6.c(-1.0f, -1));
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.fragmentView = frameLayout2;
        frameLayout2.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.a7));
        ScrollView scrollView = new ScrollView(context);
        this.E = scrollView;
        scrollView.setFillViewport(true);
        AndroidUtilities.setScrollViewEdgeEffectColor(this.E, getThemedColor(org.telegram.ui.ActionBar.j6.s8));
        frameLayout2.addView(this.E, w7.a6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, this.u0 == 4 ? 48.0f : 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.Q = linearLayout;
        linearLayout.setOrientation(1);
        int i15 = 0;
        this.Q.setClipChildren(false);
        this.E.addView(this.Q, new FrameLayout.LayoutParams(-1, -2));
        int i16 = this.u0;
        int i17 = 18;
        int i18 = 10;
        char c12 = 1;
        if (i16 == 0) {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().getAssets().open("countries.txt")));
            } catch (Exception e) {
                e = e;
                c11 = 0;
            }
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    String[] split = readLine.split(";");
                    this.a.add(i15, split[2]);
                    c11 = 0;
                    try {
                        this.b.put(split[2], split[0]);
                        this.c.put(split[0], split[2]);
                        hashMap2.put(split[1], split[2]);
                        if (split.length > 3) {
                            this.d.put(split[0], split[3]);
                        }
                        hashMap.put(split[1], split[2]);
                        i15 = 0;
                    } catch (Exception e7) {
                        e = e7;
                    }
                } else {
                    c11 = 0;
                    bufferedReader.close();
                    Collections.sort(this.a, new org.telegram.ui.Components.m9(i17));
                    this.f = new EditTextBoldCursor[10];
                    i10 = 0;
                    while (i10 < i18) {
                        if (i10 == 0) {
                            this.I[c11] = new org.telegram.ui.Cells.m4(context, this.Y0);
                            this.I[c11].setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                            this.I[c11].setText(LocaleController.getString(R.string.PaymentShippingAddress));
                            this.Q.addView(this.I[c11], w7.a6.n(-1, -2));
                        } else if (i10 == i13) {
                            this.K[c11] = new org.telegram.ui.Cells.c7(context, (Object) null);
                            this.Q.addView(this.K[c11], w7.a6.n(-1, -2));
                            this.I[c12] = new org.telegram.ui.Cells.m4(context, this.Y0);
                            this.I[c12].setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                            this.I[c12].setText(LocaleController.getString(R.string.PaymentShippingReceiver));
                            this.Q.addView(this.I[c12], w7.a6.n(-1, -2));
                        }
                        if (i10 == 8) {
                            frameLayout = new LinearLayout(context);
                            frameLayout.setClipChildren(false);
                            frameLayout.setOrientation(0);
                            this.Q.addView(frameLayout, w7.a6.n(-1, 50));
                            frameLayout.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                        } else if (i10 == 9) {
                            frameLayout = (ViewGroup) this.f[8].getParent();
                        } else {
                            frameLayout = new FrameLayout(context);
                            frameLayout.setClipChildren(false);
                            this.Q.addView(frameLayout, w7.a6.n(-1, 50));
                            int i19 = org.telegram.ui.ActionBar.j6.d6;
                            frameLayout.setBackgroundColor(getThemedColor(i19));
                            boolean z12 = i10 != 5;
                            if (z12) {
                                if (i10 != 7 || this.C0.invoice.phone_requested) {
                                    if (i10 == i13) {
                                        TLRPC.TL_invoice tL_invoice2 = this.C0.invoice;
                                        if (!tL_invoice2.phone_requested) {
                                        }
                                    }
                                }
                                z12 = false;
                            }
                            if (z12) {
                                org.telegram.ui.Components.qn qnVar = new org.telegram.ui.Components.qn(context, 17);
                                qnVar.setBackgroundColor(getThemedColor(i19));
                                this.J.add(qnVar);
                                frameLayout.addView(qnVar, new FrameLayout.LayoutParams(-1, 1, 83));
                            }
                        }
                        if (i10 == 9) {
                            this.f[i10] = new org.telegram.ui.Components.p40(context);
                        } else {
                            this.f[i10] = new EditTextBoldCursor(context);
                        }
                        this.f[i10].setTag(Integer.valueOf(i10));
                        this.f[i10].setTextSize(1, 16.0f);
                        this.f[i10].setHintTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.H6));
                        EditTextBoldCursor editTextBoldCursor = this.f[i10];
                        int i20 = org.telegram.ui.ActionBar.j6.G6;
                        editTextBoldCursor.setTextColor(getThemedColor(i20));
                        this.f[i10].setBackgroundDrawable(null);
                        this.f[i10].setCursorColor(getThemedColor(i20));
                        this.f[i10].setCursorSize(AndroidUtilities.dp(20.0f));
                        this.f[i10].setCursorWidth(1.5f);
                        if (i10 == 4) {
                            final int i21 = 0;
                            this.f[i10].setOnTouchListener(new View.OnTouchListener(this) { // from class: org.telegram.ui.rn0
                                public final /* synthetic */ wo0 b;

                                {
                                    this.b = this;
                                }

                                @Override // android.view.View.OnTouchListener
                                public final boolean onTouch(View view, MotionEvent motionEvent) {
                                    switch (i21) {
                                        case 0:
                                            wo0 wo0Var = this.b;
                                            if (wo0Var.getParentActivity() != null) {
                                                if (motionEvent.getAction() == 1) {
                                                    bu buVar = new bu(null, false);
                                                    buVar.n = true;
                                                    buVar.r = new un0(wo0Var, 4);
                                                    wo0Var.presentFragment(buVar);
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            wo0 wo0Var2 = this.b;
                                            if (wo0Var2.getParentActivity() != null) {
                                                if (motionEvent.getAction() == 1) {
                                                    bu buVar2 = new bu(null, false);
                                                    buVar2.n = true;
                                                    buVar2.r = new un0(wo0Var2, 2);
                                                    wo0Var2.presentFragment(buVar2);
                                                    break;
                                                }
                                            }
                                            break;
                                    }
                                    return false;
                                }
                            });
                            this.f[i10].setInputType(0);
                        }
                        if (i10 == 9 || i10 == 8) {
                            this.f[i10].setInputType(i14);
                        } else if (i10 == 7) {
                            this.f[i10].setInputType(1);
                        } else {
                            this.f[i10].setInputType(16385);
                        }
                        this.f[i10].setImeOptions(268435461);
                        switch (i10) {
                            case 0:
                                this.f[i10].setHint(LocaleController.getString(R.string.PaymentShippingAddress1Placeholder));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo4 = this.C0.saved_info;
                                if (tL_paymentRequestedInfo4 != null && (tL_postAddress = tL_paymentRequestedInfo4.shipping_address) != null) {
                                    this.f[i10].setText(tL_postAddress.street_line1);
                                    break;
                                }
                                break;
                            case 1:
                                this.f[i10].setHint(LocaleController.getString(R.string.PaymentShippingAddress2Placeholder));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo5 = this.C0.saved_info;
                                if (tL_paymentRequestedInfo5 != null && (tL_postAddress2 = tL_paymentRequestedInfo5.shipping_address) != null) {
                                    this.f[i10].setText(tL_postAddress2.street_line2);
                                    break;
                                }
                                break;
                            case 2:
                                this.f[i10].setHint(LocaleController.getString(R.string.PaymentShippingCityPlaceholder));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo6 = this.C0.saved_info;
                                if (tL_paymentRequestedInfo6 != null && (tL_postAddress3 = tL_paymentRequestedInfo6.shipping_address) != null) {
                                    this.f[i10].setText(tL_postAddress3.city);
                                    break;
                                }
                                break;
                            case 3:
                                this.f[i10].setHint(LocaleController.getString(R.string.PaymentShippingStatePlaceholder));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo7 = this.C0.saved_info;
                                if (tL_paymentRequestedInfo7 != null && (tL_postAddress4 = tL_paymentRequestedInfo7.shipping_address) != null) {
                                    this.f[i10].setText(tL_postAddress4.state);
                                    break;
                                }
                                break;
                            case 4:
                                this.f[i10].setHint(LocaleController.getString(R.string.PaymentShippingCountry));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo8 = this.C0.saved_info;
                                if (tL_paymentRequestedInfo8 != null && (tL_postAddress5 = tL_paymentRequestedInfo8.shipping_address) != null) {
                                    String str8 = (String) hashMap2.get(tL_postAddress5.country_iso2);
                                    String str9 = this.C0.saved_info.shipping_address.country_iso2;
                                    this.B0 = str9;
                                    EditTextBoldCursor editTextBoldCursor2 = this.f[i10];
                                    if (str8 == null) {
                                        str8 = str9;
                                    }
                                    editTextBoldCursor2.setText(str8);
                                    break;
                                }
                                break;
                            case 5:
                                this.f[i10].setHint(LocaleController.getString(R.string.PaymentShippingZipPlaceholder));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo9 = this.C0.saved_info;
                                if (tL_paymentRequestedInfo9 != null && (tL_postAddress6 = tL_paymentRequestedInfo9.shipping_address) != null) {
                                    this.f[i10].setText(tL_postAddress6.post_code);
                                    break;
                                }
                                break;
                            case 6:
                                this.f[i10].setHint(LocaleController.getString(R.string.PaymentShippingName));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo10 = this.C0.saved_info;
                                if (tL_paymentRequestedInfo10 != null && (str6 = tL_paymentRequestedInfo10.name) != null) {
                                    this.f[i10].setText(str6);
                                    break;
                                }
                                break;
                            case 7:
                                this.f[i10].setHint(LocaleController.getString(R.string.PaymentShippingEmailPlaceholder));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo11 = this.C0.saved_info;
                                if (tL_paymentRequestedInfo11 != null && (str7 = tL_paymentRequestedInfo11.email) != null) {
                                    this.f[i10].setText(str7);
                                    break;
                                }
                                break;
                        }
                        EditTextBoldCursor editTextBoldCursor3 = this.f[i10];
                        editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                        if (i10 == 8) {
                            TextView textView = new TextView(context);
                            this.H = textView;
                            textView.setText("+");
                            this.H.setTextColor(getThemedColor(i20));
                            this.H.setTextSize(1, 16.0f);
                            frameLayout.addView(this.H, w7.a6.k(21.0f, 12.0f, 0.0f, 6.0f, -2, -2));
                            this.f[i10].setPadding(AndroidUtilities.dp(10.0f), 0, 0, 0);
                            this.f[i10].setGravity(19);
                            this.f[i10].setFilters(new InputFilter[]{new InputFilter.LengthFilter(5)});
                            frameLayout.addView(this.f[i10], w7.a6.k(0.0f, 12.0f, 21.0f, 6.0f, 55, -2));
                            this.f[i10].addTextChangedListener(new oo0(this));
                        } else if (i10 == 9) {
                            this.f[i10].setPadding(0, 0, 0, 0);
                            this.f[i10].setGravity(19);
                            frameLayout.addView(this.f[i10], w7.a6.k(0.0f, 12.0f, 21.0f, 6.0f, -1, -2));
                            this.f[i10].addTextChangedListener(new es(this, 4));
                        } else {
                            this.f[i10].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                            this.f[i10].setGravity(LocaleController.isRTL ? 5 : 3);
                            frameLayout.addView(this.f[i10], w7.a6.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                        }
                        final int i22 = 2;
                        this.f[i10].setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.sn0
                            public final /* synthetic */ wo0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.widget.TextView.OnEditorActionListener
                            public final boolean onEditorAction(TextView textView2, int i23, KeyEvent keyEvent) {
                                EditTextBoldCursor[] editTextBoldCursorArr;
                                switch (i22) {
                                    case 0:
                                        wo0 wo0Var = this.b;
                                        if (i23 != 6) {
                                            wo0Var.getClass();
                                            break;
                                        } else {
                                            wo0Var.A0(false);
                                            break;
                                        }
                                    case 1:
                                        wo0 wo0Var2 = this.b;
                                        if (i23 != 6) {
                                            wo0Var2.getClass();
                                            if (i23 == 5) {
                                                int intValue = ((Integer) textView2.getTag()).intValue();
                                                if (intValue != 0) {
                                                    if (intValue == 1) {
                                                        wo0Var2.f[2].requestFocus();
                                                        break;
                                                    }
                                                } else {
                                                    wo0Var2.f[1].requestFocus();
                                                    break;
                                                }
                                            }
                                        } else {
                                            wo0Var2.n.performClick();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        wo0 wo0Var3 = this.b;
                                        wo0Var3.getClass();
                                        if (i23 != 5) {
                                            if (i23 == 6) {
                                                wo0Var3.n.performClick();
                                                break;
                                            }
                                        } else {
                                            int intValue2 = ((Integer) textView2.getTag()).intValue();
                                            while (true) {
                                                intValue2++;
                                                EditTextBoldCursor[] editTextBoldCursorArr2 = wo0Var3.f;
                                                if (intValue2 >= editTextBoldCursorArr2.length) {
                                                    break;
                                                } else if (intValue2 != 4 && ((View) editTextBoldCursorArr2[intValue2].getParent()).getVisibility() == 0) {
                                                    wo0Var3.f[intValue2].requestFocus();
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 3:
                                        wo0 wo0Var4 = this.b;
                                        wo0Var4.getClass();
                                        if (i23 != 5) {
                                            if (i23 == 6) {
                                                wo0Var4.n.performClick();
                                                break;
                                            }
                                        } else {
                                            int intValue3 = ((Integer) textView2.getTag()).intValue();
                                            do {
                                                int i24 = intValue3 + 1;
                                                editTextBoldCursorArr = wo0Var4.f;
                                                if (i24 >= editTextBoldCursorArr.length) {
                                                    break;
                                                } else {
                                                    intValue3 = i24 == 4 ? intValue3 + 2 : i24;
                                                }
                                            } while (((View) editTextBoldCursorArr[intValue3].getParent()).getVisibility() != 0);
                                            wo0Var4.f[intValue3].requestFocus();
                                            break;
                                        }
                                        break;
                                    default:
                                        wo0 wo0Var5 = this.b;
                                        if (i23 != 6) {
                                            wo0Var5.getClass();
                                            break;
                                        } else {
                                            wo0Var5.n.performClick();
                                            break;
                                        }
                                }
                                return false;
                            }
                        });
                        if (i10 == 9) {
                            TLRPC.TL_invoice tL_invoice3 = this.C0.invoice;
                            if (tL_invoice3.email_to_provider || tL_invoice3.phone_to_provider) {
                                TLRPC.User user = null;
                                for (int i23 = 0; i23 < this.C0.users.size(); i23++) {
                                    TLRPC.User user2 = this.C0.users.get(i23);
                                    if (user2.id == this.C0.provider_id) {
                                        user = user2;
                                    }
                                }
                                String formatName = user != null ? ContactsController.formatName(user.first_name, user.last_name) : "";
                                z11 = true;
                                this.M[1] = new org.telegram.ui.Cells.f9(context, this.Y0);
                                this.M[1].setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.b7));
                                this.Q.addView(this.M[1], w7.a6.n(-1, -2));
                                TLRPC.TL_invoice tL_invoice4 = this.C0.invoice;
                                boolean z13 = tL_invoice4.email_to_provider;
                                if (z13 && tL_invoice4.phone_to_provider) {
                                    this.M[1].setText(LocaleController.formatString("PaymentPhoneEmailToProvider", R.string.PaymentPhoneEmailToProvider, formatName));
                                } else if (z13) {
                                    this.M[1].setText(LocaleController.formatString("PaymentEmailToProvider", R.string.PaymentEmailToProvider, formatName));
                                } else {
                                    this.M[1].setText(LocaleController.formatString("PaymentPhoneToProvider", R.string.PaymentPhoneToProvider, formatName));
                                }
                            } else {
                                this.K[1] = new org.telegram.ui.Cells.c7(context, (Object) null);
                                this.Q.addView(this.K[1], w7.a6.n(-1, -2));
                                z11 = true;
                            }
                            org.telegram.ui.Cells.x8 x8Var = new org.telegram.ui.Cells.x8(context, this.Y0);
                            this.L = x8Var;
                            x8Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(z11));
                            this.L.f(LocaleController.getString(R.string.PaymentShippingSave), this.T0, false);
                            this.Q.addView(this.L, w7.a6.n(-1, -2));
                            this.L.setOnClickListener(new qn0(this, 8));
                            this.M[0] = new org.telegram.ui.Cells.f9(context, this.Y0);
                            this.M[0].setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.b7));
                            this.M[0].setText(LocaleController.getString(R.string.PaymentShippingSaveInfo));
                            this.Q.addView(this.M[0], w7.a6.n(-1, -2));
                        }
                        i10++;
                        i13 = 6;
                        i14 = 3;
                        i18 = 10;
                        c12 = 1;
                        c11 = 0;
                    }
                    if (this.C0.invoice.name_requested) {
                        i11 = 8;
                        ((ViewGroup) this.f[6].getParent()).setVisibility(8);
                    } else {
                        i11 = 8;
                    }
                    if (!this.C0.invoice.phone_requested) {
                        ((ViewGroup) this.f[i11].getParent()).setVisibility(i11);
                    }
                    if (!this.C0.invoice.email_requested) {
                        ((ViewGroup) this.f[7].getParent()).setVisibility(i11);
                    }
                    tL_invoice = this.C0.invoice;
                    if (!tL_invoice.phone_requested) {
                        this.f[9].setImeOptions(268435462);
                    } else if (tL_invoice.email_requested) {
                        this.f[7].setImeOptions(268435462);
                    } else if (tL_invoice.name_requested) {
                        this.f[6].setImeOptions(268435462);
                    } else {
                        this.f[5].setImeOptions(268435462);
                    }
                    c7Var = this.K[1];
                    if (c7Var == null) {
                        TLRPC.TL_invoice tL_invoice5 = this.C0.invoice;
                        c7Var.setVisibility((tL_invoice5.name_requested || tL_invoice5.phone_requested || tL_invoice5.email_requested) ? 0 : 8);
                    } else {
                        org.telegram.ui.Cells.f9 f9Var = this.M[1];
                        if (f9Var != null) {
                            TLRPC.TL_invoice tL_invoice6 = this.C0.invoice;
                            f9Var.setVisibility((tL_invoice6.name_requested || tL_invoice6.phone_requested || tL_invoice6.email_requested) ? 0 : 8);
                        }
                    }
                    org.telegram.ui.Cells.m4 m4Var = this.I[1];
                    TLRPC.TL_invoice tL_invoice7 = this.C0.invoice;
                    m4Var.setVisibility((!tL_invoice7.name_requested || tL_invoice7.phone_requested || tL_invoice7.email_requested) ? 0 : 8);
                    if (!this.C0.invoice.shipping_address_requested) {
                        this.I[0].setVisibility(8);
                        this.K[0].setVisibility(8);
                        ((ViewGroup) this.f[0].getParent()).setVisibility(8);
                        ((ViewGroup) this.f[1].getParent()).setVisibility(8);
                        ((ViewGroup) this.f[2].getParent()).setVisibility(8);
                        ((ViewGroup) this.f[3].getParent()).setVisibility(8);
                        ((ViewGroup) this.f[4].getParent()).setVisibility(8);
                        ((ViewGroup) this.f[5].getParent()).setVisibility(8);
                    }
                    tL_paymentRequestedInfo2 = this.C0.saved_info;
                    if (tL_paymentRequestedInfo2 != null || TextUtils.isEmpty(tL_paymentRequestedInfo2.phone)) {
                        o0(null);
                    } else {
                        o0(this.C0.saved_info.phone);
                    }
                    if (this.f[8].length() == 0) {
                        TLRPC.PaymentForm paymentForm3 = this.C0;
                        if (paymentForm3.invoice.phone_requested && ((tL_paymentRequestedInfo3 = paymentForm3.saved_info) == null || TextUtils.isEmpty(tL_paymentRequestedInfo3.phone))) {
                            try {
                                telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
                            } catch (Exception e10) {
                                FileLog.e(e10);
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
                FileLog.e(e);
                Collections.sort(this.a, new org.telegram.ui.Components.m9(i17));
                this.f = new EditTextBoldCursor[10];
                i10 = 0;
                while (i10 < i18) {
                }
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
                org.telegram.ui.Cells.m4 m4Var2 = this.I[1];
                TLRPC.TL_invoice tL_invoice72 = this.C0.invoice;
                m4Var2.setVisibility((!tL_invoice72.name_requested || tL_invoice72.phone_requested || tL_invoice72.email_requested) ? 0 : 8);
                if (!this.C0.invoice.shipping_address_requested) {
                }
                tL_paymentRequestedInfo2 = this.C0.saved_info;
                if (tL_paymentRequestedInfo2 != null) {
                }
                o0(null);
                if (this.f[8].length() == 0) {
                }
            }
        } else if (i16 == 2) {
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
                    FileLog.e(e11);
                }
            }
            if (this.S0 || this.F0 != null) {
                if (this.K0 != null || this.M0 != null) {
                    v0(context);
                }
                n0(context);
                this.Q.addView(this.O, w7.a6.n(-1, 50));
                this.z0 = true;
                H0(true, true);
                this.r.setVisibility(0);
                this.n.setEnabled(false);
                this.n.getContentView().setVisibility(4);
                AndroidUtilities.checkAndroidTheme(context, true);
                org.telegram.ui.Components.h91 h91Var = new org.telegram.ui.Components.h91(this, context);
                this.w = h91Var;
                h91Var.getSettings().setJavaScriptEnabled(true);
                this.w.getSettings().setDomStorageEnabled(true);
                this.w.getSettings().setSupportZoom(true);
                this.w.getSettings().setBuiltInZoomControls(true);
                this.w.getSettings().setDisplayZoomControls(false);
                this.w.getSettings().setUseWideViewPort(true);
                this.w.getSettings().setMixedContentMode(0);
                CookieManager.getInstance().setAcceptThirdPartyCookies(this.w, true);
                this.w.addJavascriptInterface(new PaymentFormActivity$TelegramWebviewProxy(this), "TelegramWebviewProxy");
                this.w.setWebViewClient(new po0(this, context));
                this.Q.addView(this.w, w7.a6.c(-2.0f, -1));
                this.K[2] = new org.telegram.ui.Cells.c7(context, (Object) null);
                this.Q.addView(this.K[2], w7.a6.n(-1, -2));
                org.telegram.ui.Cells.x8 x8Var2 = new org.telegram.ui.Cells.x8(context, this.Y0);
                this.L = x8Var2;
                x8Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(true));
                this.L.f(LocaleController.getString(R.string.PaymentCardSavePaymentInformation), this.U0, false);
                this.Q.addView(this.L, w7.a6.n(-1, -2));
                this.L.setOnClickListener(new qn0(this, 9));
                this.M[0] = new org.telegram.ui.Cells.f9(context, this.Y0);
                this.M[0].setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.b7));
                K0();
                this.Q.addView(this.M[0], w7.a6.n(-1, -2));
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
                        FileLog.e(e12);
                    }
                }
                if (this.k0 && ((!TextUtils.isEmpty(this.j0) && "stripe".equals(this.C0.native_provider)) || this.M0 != null)) {
                    v0(context);
                }
                this.f = new EditTextBoldCursor[6];
                int i24 = 0;
                for (int i25 = 6; i24 < i25; i25 = 6) {
                    if (i24 == 0) {
                        this.I[0] = new org.telegram.ui.Cells.m4(context, this.Y0);
                        this.I[0].setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                        this.I[0].setText(LocaleController.getString(R.string.PaymentCardTitle));
                        this.Q.addView(this.I[0], w7.a6.n(-1, -2));
                    } else if (i24 == 4) {
                        this.I[1] = new org.telegram.ui.Cells.m4(context, this.Y0);
                        this.I[1].setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                        this.I[1].setText(LocaleController.getString(R.string.PaymentBillingAddress));
                        this.Q.addView(this.I[1], w7.a6.n(-1, -2));
                    }
                    boolean z14 = (i24 == 3 || i24 == 5 || (i24 == 4 && !this.h0)) ? false : true;
                    FrameLayout frameLayout3 = new FrameLayout(context);
                    frameLayout3.setClipChildren(false);
                    int i26 = org.telegram.ui.ActionBar.j6.d6;
                    frameLayout3.setBackgroundColor(getThemedColor(i26));
                    this.Q.addView(frameLayout3, w7.a6.n(-1, 50));
                    this.f[i24] = new EditTextBoldCursor(context);
                    this.f[i24].setTag(Integer.valueOf(i24));
                    this.f[i24].setTextSize(1, 16.0f);
                    this.f[i24].setHintTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.H6));
                    EditTextBoldCursor editTextBoldCursor4 = this.f[i24];
                    int i27 = org.telegram.ui.ActionBar.j6.G6;
                    editTextBoldCursor4.setTextColor(getThemedColor(i27));
                    this.f[i24].setBackgroundDrawable(null);
                    this.f[i24].setCursorColor(getThemedColor(i27));
                    this.f[i24].setCursorSize(AndroidUtilities.dp(20.0f));
                    this.f[i24].setCursorWidth(1.5f);
                    if (i24 == 3) {
                        this.f[i24].setFilters(new InputFilter[]{new InputFilter.LengthFilter(3)});
                        this.f[i24].setInputType(130);
                        this.f[i24].setTypeface(Typeface.DEFAULT);
                        this.f[i24].setTransformationMethod(PasswordTransformationMethod.getInstance());
                    } else if (i24 == 0) {
                        this.f[i24].setInputType(3);
                    } else if (i24 == 4) {
                        final int i28 = 1;
                        this.f[i24].setOnTouchListener(new View.OnTouchListener(this) { // from class: org.telegram.ui.rn0
                            public final /* synthetic */ wo0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnTouchListener
                            public final boolean onTouch(View view, MotionEvent motionEvent) {
                                switch (i28) {
                                    case 0:
                                        wo0 wo0Var = this.b;
                                        if (wo0Var.getParentActivity() != null) {
                                            if (motionEvent.getAction() == 1) {
                                                bu buVar = new bu(null, false);
                                                buVar.n = true;
                                                buVar.r = new un0(wo0Var, 4);
                                                wo0Var.presentFragment(buVar);
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        wo0 wo0Var2 = this.b;
                                        if (wo0Var2.getParentActivity() != null) {
                                            if (motionEvent.getAction() == 1) {
                                                bu buVar2 = new bu(null, false);
                                                buVar2.n = true;
                                                buVar2.r = new un0(wo0Var2, 2);
                                                wo0Var2.presentFragment(buVar2);
                                                break;
                                            }
                                        }
                                        break;
                                }
                                return false;
                            }
                        });
                        this.f[i24].setInputType(0);
                    } else if (i24 == 1) {
                        this.f[i24].setInputType(16386);
                    } else if (i24 == 2) {
                        this.f[i24].setInputType(4097);
                    } else {
                        this.f[i24].setInputType(16385);
                        this.f[i24].setImeOptions(268435461);
                        if (i24 != 0) {
                            this.f[i24].setHint(LocaleController.getString(R.string.PaymentCardNumber));
                        } else if (i24 == 1) {
                            this.f[i24].setHint(LocaleController.getString(R.string.PaymentCardExpireDate));
                        } else if (i24 == 2) {
                            this.f[i24].setHint(LocaleController.getString(R.string.PaymentCardName));
                        } else if (i24 == 3) {
                            this.f[i24].setHint(LocaleController.getString(R.string.PaymentCardCvv));
                        } else if (i24 == 4) {
                            this.f[i24].setHint(LocaleController.getString(R.string.PaymentShippingCountry));
                        } else if (i24 == 5) {
                            this.f[i24].setHint(LocaleController.getString(R.string.PaymentShippingZipPlaceholder));
                        }
                        if (i24 != 0) {
                            this.f[i24].addTextChangedListener(new qo0(this));
                        } else if (i24 == 1) {
                            this.f[i24].addTextChangedListener(new ro0(this));
                        }
                        this.f[i24].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                        this.f[i24].setGravity(!LocaleController.isRTL ? 5 : 3);
                        frameLayout3.addView(this.f[i24], w7.a6.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                        final int i29 = 3;
                        this.f[i24].setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.sn0
                            public final /* synthetic */ wo0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.widget.TextView.OnEditorActionListener
                            public final boolean onEditorAction(TextView textView2, int i232, KeyEvent keyEvent) {
                                EditTextBoldCursor[] editTextBoldCursorArr;
                                switch (i29) {
                                    case 0:
                                        wo0 wo0Var = this.b;
                                        if (i232 != 6) {
                                            wo0Var.getClass();
                                            break;
                                        } else {
                                            wo0Var.A0(false);
                                            break;
                                        }
                                    case 1:
                                        wo0 wo0Var2 = this.b;
                                        if (i232 != 6) {
                                            wo0Var2.getClass();
                                            if (i232 == 5) {
                                                int intValue = ((Integer) textView2.getTag()).intValue();
                                                if (intValue != 0) {
                                                    if (intValue == 1) {
                                                        wo0Var2.f[2].requestFocus();
                                                        break;
                                                    }
                                                } else {
                                                    wo0Var2.f[1].requestFocus();
                                                    break;
                                                }
                                            }
                                        } else {
                                            wo0Var2.n.performClick();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        wo0 wo0Var3 = this.b;
                                        wo0Var3.getClass();
                                        if (i232 != 5) {
                                            if (i232 == 6) {
                                                wo0Var3.n.performClick();
                                                break;
                                            }
                                        } else {
                                            int intValue2 = ((Integer) textView2.getTag()).intValue();
                                            while (true) {
                                                intValue2++;
                                                EditTextBoldCursor[] editTextBoldCursorArr2 = wo0Var3.f;
                                                if (intValue2 >= editTextBoldCursorArr2.length) {
                                                    break;
                                                } else if (intValue2 != 4 && ((View) editTextBoldCursorArr2[intValue2].getParent()).getVisibility() == 0) {
                                                    wo0Var3.f[intValue2].requestFocus();
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 3:
                                        wo0 wo0Var4 = this.b;
                                        wo0Var4.getClass();
                                        if (i232 != 5) {
                                            if (i232 == 6) {
                                                wo0Var4.n.performClick();
                                                break;
                                            }
                                        } else {
                                            int intValue3 = ((Integer) textView2.getTag()).intValue();
                                            do {
                                                int i242 = intValue3 + 1;
                                                editTextBoldCursorArr = wo0Var4.f;
                                                if (i242 >= editTextBoldCursorArr.length) {
                                                    break;
                                                } else {
                                                    intValue3 = i242 == 4 ? intValue3 + 2 : i242;
                                                }
                                            } while (((View) editTextBoldCursorArr[intValue3].getParent()).getVisibility() != 0);
                                            wo0Var4.f[intValue3].requestFocus();
                                            break;
                                        }
                                        break;
                                    default:
                                        wo0 wo0Var5 = this.b;
                                        if (i232 != 6) {
                                            wo0Var5.getClass();
                                            break;
                                        } else {
                                            wo0Var5.n.performClick();
                                            break;
                                        }
                                }
                                return false;
                            }
                        });
                        if (i24 != 3) {
                            this.K[0] = new org.telegram.ui.Cells.c7(context, (Object) null);
                            this.Q.addView(this.K[0], w7.a6.n(-1, -2));
                        } else if (i24 == 5) {
                            this.K[2] = new org.telegram.ui.Cells.c7(context, (Object) null);
                            this.Q.addView(this.K[2], w7.a6.n(-1, -2));
                            org.telegram.ui.Cells.x8 x8Var3 = new org.telegram.ui.Cells.x8(context, this.Y0);
                            this.L = x8Var3;
                            x8Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(true));
                            this.L.f(LocaleController.getString(R.string.PaymentCardSavePaymentInformation), this.U0, false);
                            this.Q.addView(this.L, w7.a6.n(-1, -2));
                            this.L.setOnClickListener(new qn0(this, 10));
                            this.M[0] = new org.telegram.ui.Cells.f9(context, this.Y0);
                            this.M[0].setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.b7));
                            K0();
                            this.Q.addView(this.M[0], w7.a6.n(-1, -2));
                        } else if (i24 == 0) {
                            n0(context);
                            frameLayout3.addView(this.O, w7.a6.d(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 16, 0.0f, 0.0f, 4.0f, 0.0f));
                        }
                        if (z14) {
                            org.telegram.ui.Components.qn qnVar2 = new org.telegram.ui.Components.qn(context, 18);
                            qnVar2.setBackgroundColor(getThemedColor(i26));
                            this.J.add(qnVar2);
                            frameLayout3.addView(qnVar2, new FrameLayout.LayoutParams(-1, 1, 83));
                        }
                        if ((i24 == 4 && !this.g0) || ((i24 == 5 && !this.h0) || (i24 == 2 && !this.i0))) {
                            frameLayout3.setVisibility(8);
                        }
                        i24++;
                    }
                    this.f[i24].setImeOptions(268435461);
                    if (i24 != 0) {
                    }
                    if (i24 != 0) {
                    }
                    this.f[i24].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                    this.f[i24].setGravity(!LocaleController.isRTL ? 5 : 3);
                    frameLayout3.addView(this.f[i24], w7.a6.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                    final int i292 = 3;
                    this.f[i24].setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.sn0
                        public final /* synthetic */ wo0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.widget.TextView.OnEditorActionListener
                        public final boolean onEditorAction(TextView textView2, int i232, KeyEvent keyEvent) {
                            EditTextBoldCursor[] editTextBoldCursorArr;
                            switch (i292) {
                                case 0:
                                    wo0 wo0Var = this.b;
                                    if (i232 != 6) {
                                        wo0Var.getClass();
                                        break;
                                    } else {
                                        wo0Var.A0(false);
                                        break;
                                    }
                                case 1:
                                    wo0 wo0Var2 = this.b;
                                    if (i232 != 6) {
                                        wo0Var2.getClass();
                                        if (i232 == 5) {
                                            int intValue = ((Integer) textView2.getTag()).intValue();
                                            if (intValue != 0) {
                                                if (intValue == 1) {
                                                    wo0Var2.f[2].requestFocus();
                                                    break;
                                                }
                                            } else {
                                                wo0Var2.f[1].requestFocus();
                                                break;
                                            }
                                        }
                                    } else {
                                        wo0Var2.n.performClick();
                                        break;
                                    }
                                    break;
                                case 2:
                                    wo0 wo0Var3 = this.b;
                                    wo0Var3.getClass();
                                    if (i232 != 5) {
                                        if (i232 == 6) {
                                            wo0Var3.n.performClick();
                                            break;
                                        }
                                    } else {
                                        int intValue2 = ((Integer) textView2.getTag()).intValue();
                                        while (true) {
                                            intValue2++;
                                            EditTextBoldCursor[] editTextBoldCursorArr2 = wo0Var3.f;
                                            if (intValue2 >= editTextBoldCursorArr2.length) {
                                                break;
                                            } else if (intValue2 != 4 && ((View) editTextBoldCursorArr2[intValue2].getParent()).getVisibility() == 0) {
                                                wo0Var3.f[intValue2].requestFocus();
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 3:
                                    wo0 wo0Var4 = this.b;
                                    wo0Var4.getClass();
                                    if (i232 != 5) {
                                        if (i232 == 6) {
                                            wo0Var4.n.performClick();
                                            break;
                                        }
                                    } else {
                                        int intValue3 = ((Integer) textView2.getTag()).intValue();
                                        do {
                                            int i242 = intValue3 + 1;
                                            editTextBoldCursorArr = wo0Var4.f;
                                            if (i242 >= editTextBoldCursorArr.length) {
                                                break;
                                            } else {
                                                intValue3 = i242 == 4 ? intValue3 + 2 : i242;
                                            }
                                        } while (((View) editTextBoldCursorArr[intValue3].getParent()).getVisibility() != 0);
                                        wo0Var4.f[intValue3].requestFocus();
                                        break;
                                    }
                                    break;
                                default:
                                    wo0 wo0Var5 = this.b;
                                    if (i232 != 6) {
                                        wo0Var5.getClass();
                                        break;
                                    } else {
                                        wo0Var5.n.performClick();
                                        break;
                                    }
                            }
                            return false;
                        }
                    });
                    if (i24 != 3) {
                    }
                    if (z14) {
                    }
                    if (i24 == 4) {
                        frameLayout3.setVisibility(8);
                        i24++;
                    }
                    frameLayout3.setVisibility(8);
                    i24++;
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
        } else if (i16 == 1) {
            ArrayList<TLRPC.TL_shippingOption> arrayList = this.E0.shipping_options;
            int size = arrayList == null ? 0 : arrayList.size();
            this.h = new org.telegram.ui.Cells.l6[size];
            int i30 = 0;
            while (i30 < size) {
                TLRPC.TL_shippingOption tL_shippingOption = this.E0.shipping_options.get(i30);
                this.h[i30] = new org.telegram.ui.Cells.l6(context);
                this.h[i30].setTag(Integer.valueOf(i30));
                this.h[i30].setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(true));
                this.h[i30].c(a4.a.C(s0(tL_shippingOption.prices), " - ", tL_shippingOption.title), i30 == 0, i30 != size + (-1));
                this.h[i30].setOnClickListener(new qn0(this, 11));
                this.Q.addView(this.h[i30]);
                i30++;
            }
            this.M[0] = new org.telegram.ui.Cells.f9(context, this.Y0);
            this.M[0].setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.b7));
            this.Q.addView(this.M[0], w7.a6.n(-1, -2));
        } else {
            int i31 = 13;
            if (i16 == 3) {
                this.f = new EditTextBoldCursor[2];
                int i32 = 0;
                for (int i33 = 2; i32 < i33; i33 = 2) {
                    if (i32 == 0) {
                        z10 = false;
                        this.I[0] = new org.telegram.ui.Cells.m4(context, this.Y0);
                        this.I[0].setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                        this.I[0].setText(LocaleController.getString(R.string.PaymentCardTitle));
                        this.Q.addView(this.I[0], w7.a6.n(-1, -2));
                    } else {
                        z10 = false;
                    }
                    FrameLayout frameLayout4 = new FrameLayout(context);
                    frameLayout4.setClipChildren(z10);
                    this.Q.addView(frameLayout4, w7.a6.n(-1, 50));
                    int i34 = org.telegram.ui.ActionBar.j6.d6;
                    frameLayout4.setBackgroundColor(getThemedColor(i34));
                    boolean z15 = i32 != 1;
                    if (z15) {
                        if (i32 != 7 || this.C0.invoice.phone_requested) {
                            if (i32 == 6) {
                                TLRPC.TL_invoice tL_invoice8 = this.C0.invoice;
                                if (!tL_invoice8.phone_requested) {
                                }
                            }
                        }
                        z15 = false;
                    }
                    if (z15) {
                        org.telegram.ui.Components.qn qnVar3 = new org.telegram.ui.Components.qn(context, 15);
                        qnVar3.setBackgroundColor(getThemedColor(i34));
                        this.J.add(qnVar3);
                        frameLayout4.addView(qnVar3, new FrameLayout.LayoutParams(-1, 1, 83));
                    }
                    this.f[i32] = new EditTextBoldCursor(context);
                    this.f[i32].setTag(Integer.valueOf(i32));
                    this.f[i32].setTextSize(1, 16.0f);
                    this.f[i32].setHintTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.H6));
                    EditTextBoldCursor editTextBoldCursor5 = this.f[i32];
                    int i35 = org.telegram.ui.ActionBar.j6.G6;
                    editTextBoldCursor5.setTextColor(getThemedColor(i35));
                    this.f[i32].setBackgroundDrawable(null);
                    this.f[i32].setCursorColor(getThemedColor(i35));
                    this.f[i32].setCursorSize(AndroidUtilities.dp(20.0f));
                    this.f[i32].setCursorWidth(1.5f);
                    if (i32 == 0) {
                        this.f[i32].setOnTouchListener(new ai.h(28));
                        this.f[i32].setInputType(0);
                    } else {
                        this.f[i32].setInputType(129);
                        this.f[i32].setTypeface(Typeface.DEFAULT);
                    }
                    this.f[i32].setImeOptions(268435462);
                    if (i32 == 0) {
                        EditTextBoldCursor editTextBoldCursor6 = this.f[i32];
                        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = this.y0;
                        editTextBoldCursor6.setText(tL_paymentSavedCredentialsCard == null ? "" : tL_paymentSavedCredentialsCard.title);
                    } else if (i32 == 1) {
                        this.f[i32].setHint(LocaleController.getString(R.string.LoginPassword));
                        this.f[i32].requestFocus();
                    }
                    this.f[i32].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                    this.f[i32].setGravity(LocaleController.isRTL ? 5 : 3);
                    frameLayout4.addView(this.f[i32], w7.a6.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                    final int i36 = 4;
                    this.f[i32].setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.sn0
                        public final /* synthetic */ wo0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.widget.TextView.OnEditorActionListener
                        public final boolean onEditorAction(TextView textView2, int i232, KeyEvent keyEvent) {
                            EditTextBoldCursor[] editTextBoldCursorArr;
                            switch (i36) {
                                case 0:
                                    wo0 wo0Var = this.b;
                                    if (i232 != 6) {
                                        wo0Var.getClass();
                                        break;
                                    } else {
                                        wo0Var.A0(false);
                                        break;
                                    }
                                case 1:
                                    wo0 wo0Var2 = this.b;
                                    if (i232 != 6) {
                                        wo0Var2.getClass();
                                        if (i232 == 5) {
                                            int intValue = ((Integer) textView2.getTag()).intValue();
                                            if (intValue != 0) {
                                                if (intValue == 1) {
                                                    wo0Var2.f[2].requestFocus();
                                                    break;
                                                }
                                            } else {
                                                wo0Var2.f[1].requestFocus();
                                                break;
                                            }
                                        }
                                    } else {
                                        wo0Var2.n.performClick();
                                        break;
                                    }
                                    break;
                                case 2:
                                    wo0 wo0Var3 = this.b;
                                    wo0Var3.getClass();
                                    if (i232 != 5) {
                                        if (i232 == 6) {
                                            wo0Var3.n.performClick();
                                            break;
                                        }
                                    } else {
                                        int intValue2 = ((Integer) textView2.getTag()).intValue();
                                        while (true) {
                                            intValue2++;
                                            EditTextBoldCursor[] editTextBoldCursorArr2 = wo0Var3.f;
                                            if (intValue2 >= editTextBoldCursorArr2.length) {
                                                break;
                                            } else if (intValue2 != 4 && ((View) editTextBoldCursorArr2[intValue2].getParent()).getVisibility() == 0) {
                                                wo0Var3.f[intValue2].requestFocus();
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 3:
                                    wo0 wo0Var4 = this.b;
                                    wo0Var4.getClass();
                                    if (i232 != 5) {
                                        if (i232 == 6) {
                                            wo0Var4.n.performClick();
                                            break;
                                        }
                                    } else {
                                        int intValue3 = ((Integer) textView2.getTag()).intValue();
                                        do {
                                            int i242 = intValue3 + 1;
                                            editTextBoldCursorArr = wo0Var4.f;
                                            if (i242 >= editTextBoldCursorArr.length) {
                                                break;
                                            } else {
                                                intValue3 = i242 == 4 ? intValue3 + 2 : i242;
                                            }
                                        } while (((View) editTextBoldCursorArr[intValue3].getParent()).getVisibility() != 0);
                                        wo0Var4.f[intValue3].requestFocus();
                                        break;
                                    }
                                    break;
                                default:
                                    wo0 wo0Var5 = this.b;
                                    if (i232 != 6) {
                                        wo0Var5.getClass();
                                        break;
                                    } else {
                                        wo0Var5.n.performClick();
                                        break;
                                    }
                            }
                            return false;
                        }
                    });
                    if (i32 == 1) {
                        this.M[0] = new org.telegram.ui.Cells.f9(context, this.Y0);
                        org.telegram.ui.Cells.f9 f9Var2 = this.M[0];
                        int i37 = R.string.PaymentConfirmationMessage;
                        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = this.y0;
                        f9Var2.setText(LocaleController.formatString("PaymentConfirmationMessage", i37, tL_paymentSavedCredentialsCard2 == null ? "" : tL_paymentSavedCredentialsCard2.title));
                        org.telegram.ui.Cells.f9 f9Var3 = this.M[0];
                        int i38 = R.drawable.greydivider;
                        int i39 = org.telegram.ui.ActionBar.j6.b7;
                        f9Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(context, i38, i39));
                        this.Q.addView(this.M[0], w7.a6.n(-1, -2));
                        this.N[0] = new org.telegram.ui.Cells.ga(context, this.Y0);
                        this.N[0].setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(true));
                        this.N[0].b(LocaleController.getString(R.string.PaymentConfirmationNewCard), false);
                        this.Q.addView(this.N[0], w7.a6.n(-1, -2));
                        this.N[0].setOnClickListener(new qn0(this, i31));
                        this.M[1] = new org.telegram.ui.Cells.f9(context, this.Y0);
                        this.M[1].setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, i39));
                        this.Q.addView(this.M[1], w7.a6.n(-1, -2));
                    }
                    i32++;
                }
            } else if (i16 == 4 || i16 == 5) {
                org.telegram.ui.Cells.l5 l5Var = new org.telegram.ui.Cells.l5(context);
                this.X = l5Var;
                l5Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                MessageObject messageObject = this.N0;
                if (messageObject != null) {
                    this.X.b((TLRPC.TL_messageMediaInvoice) messageObject.messageOwner.media, this.p0);
                } else {
                    TLRPC.PaymentReceipt paymentReceipt = this.D0;
                    if (paymentReceipt != null) {
                        this.X.c(paymentReceipt, this.p0);
                    } else if (this.O0 != null || this.b1 != null) {
                        org.telegram.ui.Cells.l5 l5Var2 = this.X;
                        TLRPC.PaymentForm paymentForm4 = this.C0;
                        l5Var2.a(paymentForm4.title, paymentForm4.description, paymentForm4.photo, this.p0, paymentForm4);
                    }
                }
                this.Q.addView(this.X, w7.a6.n(-1, -2));
                this.K[0] = new org.telegram.ui.Cells.c7(context, (Object) null);
                this.Q.addView(this.K[0], w7.a6.n(-1, -2));
                ArrayList arrayList2 = new ArrayList(this.C0.invoice.prices);
                this.t0 = arrayList2;
                TLRPC.TL_shippingOption tL_shippingOption2 = this.G0;
                if (tL_shippingOption2 != null) {
                    arrayList2.addAll(tL_shippingOption2.prices);
                }
                this.R0 = new String[1];
                for (int i40 = 0; i40 < this.t0.size(); i40++) {
                    TLRPC.TL_labeledPrice tL_labeledPrice = (TLRPC.TL_labeledPrice) this.t0.get(i40);
                    org.telegram.ui.Cells.g9 g9Var = new org.telegram.ui.Cells.g9(context);
                    g9Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                    g9Var.a(tL_labeledPrice.label, LocaleController.getInstance().formatCurrencyString(tL_labeledPrice.amount, this.C0.invoice.currency), false);
                    this.Q.addView(g9Var);
                }
                if (this.u0 == 5 && this.H0 != null) {
                    org.telegram.ui.Cells.g9 g9Var2 = new org.telegram.ui.Cells.g9(context);
                    g9Var2.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                    g9Var2.a(LocaleController.getString(R.string.PaymentTip), LocaleController.getInstance().formatCurrencyString(this.H0.longValue(), this.C0.invoice.currency), false);
                    this.Q.addView(g9Var2);
                }
                org.telegram.ui.Cells.g9 g9Var3 = new org.telegram.ui.Cells.g9(context);
                this.R = g9Var3;
                int i41 = org.telegram.ui.ActionBar.j6.d6;
                g9Var3.setBackgroundColor(getThemedColor(i41));
                this.R0[0] = s0(this.t0);
                this.R.a(LocaleController.getString(R.string.PaymentTransactionTotal), this.R0[0], true);
                float f7 = 14.0f;
                if (this.u0 != 4 || (this.C0.invoice.flags & 256) == 0) {
                    str = "";
                } else {
                    FrameLayout frameLayout5 = new FrameLayout(context);
                    frameLayout5.setClipChildren(false);
                    frameLayout5.setBackgroundColor(getThemedColor(i41));
                    this.Q.addView(frameLayout5, w7.a6.n(-1, this.C0.invoice.suggested_tip_amounts.isEmpty() ? 40 : 78));
                    frameLayout5.setOnClickListener(new qn0(this, 14));
                    org.telegram.ui.Cells.g9 g9Var4 = new org.telegram.ui.Cells.g9(context);
                    g9Var4.setBackgroundColor(getThemedColor(i41));
                    g9Var4.a(LocaleController.getString(R.string.PaymentTipOptional), "", false);
                    frameLayout5.addView(g9Var4);
                    this.f = new EditTextBoldCursor[]{new EditTextBoldCursor(context)};
                    this.f[0].setTag(0);
                    this.f[0].setTextSize(1, 16.0f);
                    EditTextBoldCursor editTextBoldCursor7 = this.f[0];
                    int i42 = org.telegram.ui.ActionBar.j6.z6;
                    editTextBoldCursor7.setHintTextColor(getThemedColor(i42));
                    this.f[0].setTextColor(getThemedColor(i42));
                    this.f[0].setBackgroundDrawable(null);
                    this.f[0].setCursorColor(getThemedColor(org.telegram.ui.ActionBar.j6.G6));
                    this.f[0].setCursorSize(AndroidUtilities.dp(20.0f));
                    this.f[0].setCursorWidth(1.5f);
                    this.f[0].setInputType(3);
                    this.f[0].setImeOptions(268435462);
                    str = "";
                    this.f[0].setHint(LocaleController.getInstance().formatCurrencyString(0L, this.C0.invoice.currency));
                    this.f[0].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                    this.f[0].setGravity(LocaleController.isRTL ? 3 : 5);
                    frameLayout5.addView(this.f[0], w7.a6.d(-1, -2.0f, 51, 21.0f, 9.0f, 21.0f, 1.0f));
                    this.f[0].addTextChangedListener(new yn0(this));
                    this.f[0].setOnEditorActionListener(new og.w(5));
                    this.f[0].requestFocus();
                    if (!this.C0.invoice.suggested_tip_amounts.isEmpty()) {
                        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
                        horizontalScrollView.setHorizontalScrollBarEnabled(false);
                        horizontalScrollView.setVerticalScrollBarEnabled(false);
                        horizontalScrollView.setClipToPadding(false);
                        horizontalScrollView.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                        horizontalScrollView.setFillViewport(true);
                        frameLayout5.addView(horizontalScrollView, w7.a6.d(-1, 30.0f, 51, 0.0f, 44.0f, 0.0f, 0.0f));
                        int[] iArr = new int[1];
                        int[] iArr2 = new int[1];
                        int size2 = this.C0.invoice.suggested_tip_amounts.size();
                        zn0 zn0Var = new zn0(context, size2, iArr, iArr2);
                        this.s0 = zn0Var;
                        zn0Var.setOrientation(0);
                        horizontalScrollView.addView(this.s0, w7.a6.x(-1, 30, 51));
                        int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.ei);
                        int i43 = 0;
                        while (i43 < size2) {
                            long longValue = LocaleController.isRTL ? this.C0.invoice.suggested_tip_amounts.get((size2 - i43) - 1).longValue() : this.C0.invoice.suggested_tip_amounts.get(i43).longValue();
                            String formatCurrencyString = LocaleController.getInstance().formatCurrencyString(longValue, this.C0.invoice.currency);
                            TextView g10 = org.telegram.messenger.a2.g(context, 1, f7);
                            g10.setTypeface(AndroidUtilities.bold());
                            g10.setLines(1);
                            g10.setTag(Long.valueOf(longValue));
                            g10.setMaxLines(1);
                            g10.setText(formatCurrencyString);
                            g10.setPadding(AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f), 0);
                            g10.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Z8));
                            g10.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(15.0f), themedColor & 536870911));
                            g10.setSingleLine(true);
                            g10.setGravity(17);
                            this.s0.addView(g10, w7.a6.t(-2, -1, 19, 0, 0, i43 != size2 + (-1) ? 9 : 0, 0));
                            g10.setOnClickListener(new jo(this, g10, longValue, 5));
                            int dp = AndroidUtilities.dp(30.0f) + ((int) Math.ceil(g10.getPaint().measureText(formatCurrencyString)));
                            g10.setTag(R.id.width_tag, Integer.valueOf(dp));
                            iArr[0] = Math.max(iArr[0], dp);
                            iArr2[0] = iArr2[0] + dp;
                            i43++;
                            f7 = 14.0f;
                        }
                    }
                }
                this.Q.addView(this.R);
                this.K[2] = new org.telegram.ui.Cells.c7(context, (Object) null);
                this.K[2].setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.b7));
                this.Q.addView(this.K[2], w7.a6.n(-1, -2));
                this.Y[0] = new ao0(context);
                this.Y[0].setBackground(org.telegram.ui.ActionBar.j6.K0(true));
                org.telegram.ui.Cells.e9 e9Var = this.Y[0];
                String str10 = this.x0;
                e9Var.b(R.drawable.msg_payment_card, (str10 == null || str10.length() <= 1) ? this.x0 : this.x0.substring(0, 1).toUpperCase() + this.x0.substring(1), LocaleController.getString(R.string.PaymentCheckoutMethod), true);
                int i44 = ((this.V0 || this.W0) && ((str2 = this.x0) == null || str2.length() <= 1)) ? 8 : 0;
                int i45 = 0;
                this.Y[0].setVisibility(i44);
                this.Q.addView(this.Y[0]);
                if (this.u0 == 4) {
                    this.Y[0].setOnClickListener(new qn0(this, i45));
                }
                TLRPC.User user3 = null;
                for (int i46 = 0; i46 < this.C0.users.size(); i46++) {
                    TLRPC.User user4 = this.C0.users.get(i46);
                    if (user4.id == this.C0.provider_id) {
                        user3 = user4;
                    }
                }
                char c13 = 1;
                this.Y[1] = new org.telegram.ui.Cells.e9(context);
                this.Y[1].setBackground(org.telegram.ui.ActionBar.j6.K0(true));
                if (user3 != null) {
                    org.telegram.ui.Cells.e9 e9Var2 = this.Y[1];
                    str3 = ContactsController.formatName(user3.first_name, user3.last_name);
                    String string = LocaleController.getString(R.string.PaymentCheckoutProvider);
                    int i47 = R.drawable.msg_payment_provider;
                    TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo = this.I0;
                    e9Var2.b(i47, str3, string, ((tL_payments_validateRequestedInfo == null || (tL_payments_validateRequestedInfo.info.shipping_address == null && this.G0 == null)) && ((tL_paymentRequestedInfo = this.C0.saved_info) == null || tL_paymentRequestedInfo.shipping_address == null)) ? false : true);
                    c13 = 1;
                    this.Q.addView(this.Y[1]);
                } else {
                    str3 = str;
                }
                this.Y[c13].setVisibility(user3 != null ? i44 : 8);
                TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo2 = this.I0;
                if (tL_payments_validateRequestedInfo2 != null || (this.V0 && (paymentForm2 = this.C0) != null && paymentForm2.saved_info != null)) {
                    TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo12 = tL_payments_validateRequestedInfo2 != null ? tL_payments_validateRequestedInfo2.info : this.C0.saved_info;
                    this.Y[2] = new org.telegram.ui.Cells.e9(context);
                    this.Y[2].setVisibility(8);
                    this.Q.addView(this.Y[2]);
                    if (tL_paymentRequestedInfo12.shipping_address != null) {
                        this.Y[2].setVisibility(0);
                        if (this.u0 == 4) {
                            this.Y[2].setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(true));
                            this.Y[2].setOnClickListener(new qn0(this, 1));
                        } else {
                            this.Y[2].setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                        }
                    }
                    this.Y[3] = new org.telegram.ui.Cells.e9(context);
                    this.Y[3].setVisibility(8);
                    this.Q.addView(this.Y[3]);
                    if (tL_paymentRequestedInfo12.name != null) {
                        this.Y[3].setVisibility(0);
                        if (this.u0 == 4) {
                            this.Y[3].setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(true));
                            this.Y[3].setOnClickListener(new qn0(this, 2));
                        } else {
                            this.Y[3].setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                        }
                    }
                    this.Y[4] = new org.telegram.ui.Cells.e9(context);
                    this.Y[4].setVisibility(8);
                    this.Q.addView(this.Y[4]);
                    if (tL_paymentRequestedInfo12.phone != null) {
                        this.Y[4].setVisibility(0);
                        if (this.u0 == 4) {
                            this.Y[4].setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(true));
                            this.Y[4].setOnClickListener(new qn0(this, 3));
                        } else {
                            this.Y[4].setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                        }
                    }
                    this.Y[5] = new org.telegram.ui.Cells.e9(context);
                    this.Y[5].setVisibility(8);
                    this.Q.addView(this.Y[5]);
                    if (tL_paymentRequestedInfo12.email != null) {
                        this.Y[5].setVisibility(0);
                        int i48 = 4;
                        if (this.u0 == 4) {
                            this.Y[5].setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(true));
                            this.Y[5].setOnClickListener(new qn0(this, i48));
                        } else {
                            this.Y[5].setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                        }
                    }
                    if (this.G0 != null) {
                        this.Y[6] = new org.telegram.ui.Cells.e9(context);
                        this.Y[6].setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                        this.Y[6].b(R.drawable.msg_payment_delivery, this.G0.title, LocaleController.getString(R.string.PaymentCheckoutShippingMethod), false);
                        this.Q.addView(this.Y[6]);
                    }
                    B0(tL_paymentRequestedInfo12);
                }
                if (this.u0 == 4) {
                    this.F = !this.V0;
                    if (this.b1 instanceof TLRPC.TL_inputInvoiceStars) {
                        this.F = true;
                    }
                    this.W = new so0(this, context);
                    View view = new View(context);
                    view.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(org.telegram.ui.ActionBar.j6.i6), 2, -1));
                    this.W.addView(view, w7.a6.c(-1.0f, -1));
                    frameLayout2.addView(this.W, w7.a6.e(-1, 48, 80));
                    this.W.setOnClickListener(new ow(21, this, str3));
                    TextView textView2 = new TextView(context);
                    this.U = textView2;
                    int i49 = org.telegram.ui.ActionBar.j6.fi;
                    textView2.setTextColor(getThemedColor(i49));
                    this.U.setText(LocaleController.formatString(R.string.PaymentCheckoutPay, this.R0[0]));
                    this.U.setTextSize(1, 14.0f);
                    this.U.setGravity(17);
                    this.U.setTypeface(AndroidUtilities.bold());
                    this.W.addView(this.U, w7.a6.c(-1.0f, -1));
                    org.telegram.ui.Components.zq zqVar2 = new org.telegram.ui.Components.zq(context, 0);
                    this.s = zqVar2;
                    zqVar2.setVisibility(4);
                    int themedColor2 = getThemedColor(i49);
                    this.s.a(805306367 & themedColor2, themedColor2);
                    this.W.addView(this.s, w7.a6.c(-1.0f, -1));
                    this.W.a(this.F, false);
                    this.U.setAlpha(!this.F ? 0.8f : 1.0f);
                    this.n.setEnabled(false);
                    this.n.getContentView().setVisibility(4);
                    AndroidUtilities.checkAndroidTheme(context, true);
                    try {
                        fo0 fo0Var = new fo0(context);
                        this.w = fo0Var;
                        fo0Var.setBackgroundColor(-1);
                        this.w.getSettings().setJavaScriptEnabled(true);
                        this.w.getSettings().setDomStorageEnabled(true);
                        this.w.getSettings().setSupportZoom(true);
                        this.w.getSettings().setBuiltInZoomControls(true);
                        this.w.getSettings().setDisplayZoomControls(false);
                        this.w.getSettings().setUseWideViewPort(true);
                        this.w.getSettings().setMixedContentMode(0);
                        CookieManager.getInstance().setAcceptThirdPartyCookies(this.w, true);
                        this.w.setWebViewClient(new go0(this, context));
                    } catch (Exception e13) {
                        FileLog.e(e13);
                    }
                    this.V = null;
                    if (this.C0.invoice.terms_url != null) {
                        org.telegram.ui.Cells.q6 q6Var = new org.telegram.ui.Cells.q6(context, getResourceProvider());
                        this.V = q6Var;
                        q6Var.setChecked(this.F);
                        if (TextUtils.isEmpty(this.p0)) {
                            String string2 = LocaleController.getString(R.string.PaymentCheckoutAcceptRecurrentFee);
                            spannableStringBuilder = new SpannableStringBuilder(string2);
                            int indexOf = string2.indexOf(42);
                            int lastIndexOf = string2.lastIndexOf(42);
                            if (indexOf != -1 && lastIndexOf != -1) {
                                SpannableString spannableString = new SpannableString(string2.substring(indexOf + 1, lastIndexOf));
                                spannableString.setSpan(new org.telegram.ui.Components.z51(this.C0.invoice.terms_url), 0, spannableString.length(), 33);
                                int i50 = lastIndexOf + 1;
                                spannableStringBuilder.replace(indexOf, i50, (CharSequence) spannableString);
                                string2.substring(0, indexOf);
                                spannableString.toString();
                                string2.substring(i50);
                            }
                        } else {
                            String string3 = LocaleController.getString(R.string.PaymentCheckoutAcceptRecurrent);
                            spannableStringBuilder = new SpannableStringBuilder(string3);
                            int indexOf2 = string3.indexOf(42);
                            int lastIndexOf2 = string3.lastIndexOf(42);
                            if (indexOf2 != -1 && lastIndexOf2 != -1) {
                                SpannableString spannableString2 = new SpannableString(string3.substring(indexOf2 + 1, lastIndexOf2));
                                spannableString2.setSpan(new org.telegram.ui.Components.z51(this.C0.invoice.terms_url), 0, spannableString2.length(), 33);
                                int i51 = lastIndexOf2 + 1;
                                spannableStringBuilder.replace(indexOf2, i51, (CharSequence) spannableString2);
                                string3 = string3.substring(0, indexOf2) + ((Object) spannableString2) + string3.substring(i51);
                            }
                            int indexOf3 = string3.indexOf("%1$s");
                            if (indexOf3 != -1) {
                                spannableStringBuilder.replace(indexOf3, indexOf3 + 4, (CharSequence) this.p0);
                                spannableStringBuilder.setSpan(new org.telegram.ui.Components.s51(AndroidUtilities.bold()), indexOf3, this.p0.length() + indexOf3, 33);
                            }
                        }
                        this.V.setText(spannableStringBuilder);
                        this.V.setBackground(org.telegram.ui.ActionBar.j6.g0(getThemedColor(org.telegram.ui.ActionBar.j6.d6), getThemedColor(org.telegram.ui.ActionBar.j6.i6)));
                        this.V.setOnClickListener(new qn0(this, 5));
                        frameLayout2.addView(this.V, w7.a6.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 48.0f));
                    }
                    WebView webView = this.w;
                    if (webView != null) {
                        frameLayout2.addView(webView, w7.a6.c(-1.0f, -1));
                        this.w.setVisibility(8);
                    }
                }
                this.K[1] = new org.telegram.ui.Cells.c7(context, (Object) null);
                this.K[1].setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.b7));
                if (i44 != 0 && this.u0 == 4 && this.I0 == null && ((paymentForm = this.C0) == null || paymentForm.saved_info == null)) {
                    c10 = 1;
                    this.K[1].setVisibility(i44);
                } else {
                    c10 = 1;
                }
                this.Q.addView(this.K[c10], w7.a6.n(-1, -2));
            } else if (i16 == 6) {
                org.telegram.ui.Cells.j3 j3Var = new org.telegram.ui.Cells.j3(context);
                this.S = j3Var;
                String string4 = LocaleController.getString(R.string.PasswordCode);
                EditTextBoldCursor editTextBoldCursor8 = j3Var.a;
                editTextBoldCursor8.setText("");
                editTextBoldCursor8.setHint(string4);
                final int i52 = 0;
                j3Var.b = false;
                j3Var.setWillNotDraw(true);
                this.S.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                EditTextBoldCursor textView3 = this.S.getTextView();
                textView3.setInputType(3);
                textView3.setImeOptions(6);
                textView3.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.sn0
                    public final /* synthetic */ wo0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.widget.TextView.OnEditorActionListener
                    public final boolean onEditorAction(TextView textView22, int i232, KeyEvent keyEvent) {
                        EditTextBoldCursor[] editTextBoldCursorArr;
                        switch (i52) {
                            case 0:
                                wo0 wo0Var = this.b;
                                if (i232 != 6) {
                                    wo0Var.getClass();
                                    break;
                                } else {
                                    wo0Var.A0(false);
                                    break;
                                }
                            case 1:
                                wo0 wo0Var2 = this.b;
                                if (i232 != 6) {
                                    wo0Var2.getClass();
                                    if (i232 == 5) {
                                        int intValue = ((Integer) textView22.getTag()).intValue();
                                        if (intValue != 0) {
                                            if (intValue == 1) {
                                                wo0Var2.f[2].requestFocus();
                                                break;
                                            }
                                        } else {
                                            wo0Var2.f[1].requestFocus();
                                            break;
                                        }
                                    }
                                } else {
                                    wo0Var2.n.performClick();
                                    break;
                                }
                                break;
                            case 2:
                                wo0 wo0Var3 = this.b;
                                wo0Var3.getClass();
                                if (i232 != 5) {
                                    if (i232 == 6) {
                                        wo0Var3.n.performClick();
                                        break;
                                    }
                                } else {
                                    int intValue2 = ((Integer) textView22.getTag()).intValue();
                                    while (true) {
                                        intValue2++;
                                        EditTextBoldCursor[] editTextBoldCursorArr2 = wo0Var3.f;
                                        if (intValue2 >= editTextBoldCursorArr2.length) {
                                            break;
                                        } else if (intValue2 != 4 && ((View) editTextBoldCursorArr2[intValue2].getParent()).getVisibility() == 0) {
                                            wo0Var3.f[intValue2].requestFocus();
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 3:
                                wo0 wo0Var4 = this.b;
                                wo0Var4.getClass();
                                if (i232 != 5) {
                                    if (i232 == 6) {
                                        wo0Var4.n.performClick();
                                        break;
                                    }
                                } else {
                                    int intValue3 = ((Integer) textView22.getTag()).intValue();
                                    do {
                                        int i242 = intValue3 + 1;
                                        editTextBoldCursorArr = wo0Var4.f;
                                        if (i242 >= editTextBoldCursorArr.length) {
                                            break;
                                        } else {
                                            intValue3 = i242 == 4 ? intValue3 + 2 : i242;
                                        }
                                    } while (((View) editTextBoldCursorArr[intValue3].getParent()).getVisibility() != 0);
                                    wo0Var4.f[intValue3].requestFocus();
                                    break;
                                }
                                break;
                            default:
                                wo0 wo0Var5 = this.b;
                                if (i232 != 6) {
                                    wo0Var5.getClass();
                                    break;
                                } else {
                                    wo0Var5.n.performClick();
                                    break;
                                }
                        }
                        return false;
                    }
                });
                textView3.addTextChangedListener(new m0(this, i31));
                this.Q.addView(this.S, w7.a6.n(-1, -2));
                this.M[2] = new org.telegram.ui.Cells.f9(context, this.Y0);
                this.M[2].setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.j6.b7));
                this.Q.addView(this.M[2], w7.a6.n(-1, -2));
                this.N[1] = new org.telegram.ui.Cells.ga(context, this.Y0);
                this.N[1].setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(true));
                org.telegram.ui.Cells.ga gaVar = this.N[1];
                int i53 = org.telegram.ui.ActionBar.j6.G6;
                gaVar.setTag(Integer.valueOf(i53));
                this.N[1].setTextColor(getThemedColor(i53));
                this.N[1].b(LocaleController.getString(R.string.ResendCode), true);
                this.Q.addView(this.N[1], w7.a6.n(-1, -2));
                this.N[1].setOnClickListener(new qn0(this, 6));
                this.N[0] = new org.telegram.ui.Cells.ga(context, this.Y0);
                this.N[0].setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(true));
                org.telegram.ui.Cells.ga gaVar2 = this.N[0];
                int i54 = org.telegram.ui.ActionBar.j6.p7;
                gaVar2.setTag(Integer.valueOf(i54));
                this.N[0].setTextColor(getThemedColor(i54));
                this.N[0].b(LocaleController.getString(R.string.AbortPassword), false);
                this.Q.addView(this.N[0], w7.a6.n(-1, -2));
                this.N[0].setOnClickListener(new qn0(this, 7));
                this.f = new EditTextBoldCursor[3];
                int i55 = 0;
                for (int i56 = 3; i55 < i56; i56 = 3) {
                    if (i55 == 0) {
                        this.I[0] = new org.telegram.ui.Cells.m4(context, this.Y0);
                        this.I[0].setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                        this.I[0].setText(LocaleController.getString(R.string.PaymentPasswordTitle));
                        this.Q.addView(this.I[0], w7.a6.n(-1, -2));
                    } else if (i55 == 2) {
                        this.I[1] = new org.telegram.ui.Cells.m4(context, this.Y0);
                        this.I[1].setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                        this.I[1].setText(LocaleController.getString(R.string.PaymentPasswordEmailTitle));
                        this.Q.addView(this.I[1], w7.a6.n(-1, -2));
                    }
                    FrameLayout frameLayout6 = new FrameLayout(context);
                    frameLayout6.setClipChildren(false);
                    this.Q.addView(frameLayout6, w7.a6.n(-1, 50));
                    int i57 = org.telegram.ui.ActionBar.j6.d6;
                    frameLayout6.setBackgroundColor(getThemedColor(i57));
                    if (i55 == 0) {
                        org.telegram.ui.Components.qn qnVar4 = new org.telegram.ui.Components.qn(context, 16);
                        qnVar4.setBackgroundColor(getThemedColor(i57));
                        this.J.add(qnVar4);
                        frameLayout6.addView(qnVar4, new FrameLayout.LayoutParams(-1, 1, 83));
                    }
                    this.f[i55] = new EditTextBoldCursor(context);
                    this.f[i55].setTag(Integer.valueOf(i55));
                    this.f[i55].setTextSize(1, 16.0f);
                    this.f[i55].setHintTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.H6));
                    EditTextBoldCursor editTextBoldCursor9 = this.f[i55];
                    int i58 = org.telegram.ui.ActionBar.j6.G6;
                    editTextBoldCursor9.setTextColor(getThemedColor(i58));
                    this.f[i55].setBackgroundDrawable(null);
                    this.f[i55].setCursorColor(getThemedColor(i58));
                    this.f[i55].setCursorSize(AndroidUtilities.dp(20.0f));
                    this.f[i55].setCursorWidth(1.5f);
                    if (i55 == 0 || i55 == 1) {
                        this.f[i55].setInputType(129);
                        this.f[i55].setTypeface(Typeface.DEFAULT);
                        this.f[i55].setImeOptions(268435461);
                    } else {
                        this.f[i55].setInputType(33);
                        this.f[i55].setImeOptions(268435462);
                    }
                    if (i55 == 0) {
                        this.f[i55].setHint(LocaleController.getString(R.string.PaymentPasswordEnter));
                        this.f[i55].requestFocus();
                    } else if (i55 == 1) {
                        this.f[i55].setHint(LocaleController.getString(R.string.PaymentPasswordReEnter));
                    } else if (i55 == 2) {
                        this.f[i55].setHint(LocaleController.getString(R.string.PaymentPasswordEmail));
                    }
                    this.f[i55].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                    this.f[i55].setGravity(LocaleController.isRTL ? 5 : 3);
                    frameLayout6.addView(this.f[i55], w7.a6.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                    final int i59 = 1;
                    this.f[i55].setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.sn0
                        public final /* synthetic */ wo0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.widget.TextView.OnEditorActionListener
                        public final boolean onEditorAction(TextView textView22, int i232, KeyEvent keyEvent) {
                            EditTextBoldCursor[] editTextBoldCursorArr;
                            switch (i59) {
                                case 0:
                                    wo0 wo0Var = this.b;
                                    if (i232 != 6) {
                                        wo0Var.getClass();
                                        break;
                                    } else {
                                        wo0Var.A0(false);
                                        break;
                                    }
                                case 1:
                                    wo0 wo0Var2 = this.b;
                                    if (i232 != 6) {
                                        wo0Var2.getClass();
                                        if (i232 == 5) {
                                            int intValue = ((Integer) textView22.getTag()).intValue();
                                            if (intValue != 0) {
                                                if (intValue == 1) {
                                                    wo0Var2.f[2].requestFocus();
                                                    break;
                                                }
                                            } else {
                                                wo0Var2.f[1].requestFocus();
                                                break;
                                            }
                                        }
                                    } else {
                                        wo0Var2.n.performClick();
                                        break;
                                    }
                                    break;
                                case 2:
                                    wo0 wo0Var3 = this.b;
                                    wo0Var3.getClass();
                                    if (i232 != 5) {
                                        if (i232 == 6) {
                                            wo0Var3.n.performClick();
                                            break;
                                        }
                                    } else {
                                        int intValue2 = ((Integer) textView22.getTag()).intValue();
                                        while (true) {
                                            intValue2++;
                                            EditTextBoldCursor[] editTextBoldCursorArr2 = wo0Var3.f;
                                            if (intValue2 >= editTextBoldCursorArr2.length) {
                                                break;
                                            } else if (intValue2 != 4 && ((View) editTextBoldCursorArr2[intValue2].getParent()).getVisibility() == 0) {
                                                wo0Var3.f[intValue2].requestFocus();
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 3:
                                    wo0 wo0Var4 = this.b;
                                    wo0Var4.getClass();
                                    if (i232 != 5) {
                                        if (i232 == 6) {
                                            wo0Var4.n.performClick();
                                            break;
                                        }
                                    } else {
                                        int intValue3 = ((Integer) textView22.getTag()).intValue();
                                        do {
                                            int i242 = intValue3 + 1;
                                            editTextBoldCursorArr = wo0Var4.f;
                                            if (i242 >= editTextBoldCursorArr.length) {
                                                break;
                                            } else {
                                                intValue3 = i242 == 4 ? intValue3 + 2 : i242;
                                            }
                                        } while (((View) editTextBoldCursorArr[intValue3].getParent()).getVisibility() != 0);
                                        wo0Var4.f[intValue3].requestFocus();
                                        break;
                                    }
                                    break;
                                default:
                                    wo0 wo0Var5 = this.b;
                                    if (i232 != 6) {
                                        wo0Var5.getClass();
                                        break;
                                    } else {
                                        wo0Var5.n.performClick();
                                        break;
                                    }
                            }
                            return false;
                        }
                    });
                    if (i55 == 1) {
                        this.M[0] = new org.telegram.ui.Cells.f9(context, this.Y0);
                        this.M[0].setText(LocaleController.getString(R.string.PaymentPasswordInfo));
                        this.M[0].setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.j6.b7));
                        this.Q.addView(this.M[0], w7.a6.n(-1, -2));
                    } else if (i55 == 2) {
                        this.M[1] = new org.telegram.ui.Cells.f9(context, this.Y0);
                        this.M[1].setText(LocaleController.getString(R.string.PaymentPasswordEmailInfo));
                        this.M[1].setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.b7));
                        this.Q.addView(this.M[1], w7.a6.n(-1, -2));
                    }
                    i55++;
                }
                J0();
            }
        }
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.twoStepPasswordChanged) {
            TLRPC.PaymentForm paymentForm = this.C0;
            paymentForm.password_missing = false;
            paymentForm.can_save_credentials = true;
            K0();
            return;
        }
        if (i10 == NotificationCenter.didRemoveTwoStepPassword) {
            TLRPC.PaymentForm paymentForm2 = this.C0;
            paymentForm2.password_missing = true;
            paymentForm2.can_save_credentials = false;
            K0();
            return;
        }
        if (i10 == NotificationCenter.paymentFinished) {
            this.a1 = true;
            removeSelfFromStack();
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final org.telegram.ui.ActionBar.f6 getResourceProvider() {
        return this.Y0;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.a7));
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.s8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(lVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, TLObject.FLAG_27, null, null, null, null, org.telegram.ui.ActionBar.j6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.j6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Q, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.k0, null, null, org.telegram.ui.ActionBar.j6.d7));
        org.telegram.ui.Components.zq zqVar = this.r;
        int i11 = org.telegram.ui.ActionBar.j6.D7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(zqVar, 0, null, null, null, null, i11));
        org.telegram.ui.Components.zq zqVar2 = this.r;
        int i12 = org.telegram.ui.ActionBar.j6.E7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(zqVar2, 0, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.s, 0, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.s, 0, null, null, null, null, i12));
        if (this.f != null) {
            int i13 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.f;
                if (i13 >= editTextBoldCursorArr.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.l6((View) editTextBoldCursorArr[i13].getParent(), 1, null, null, null, null, org.telegram.ui.ActionBar.j6.d6));
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.f[i13], 4, null, null, null, null, org.telegram.ui.ActionBar.j6.G6));
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.f[i13], TLObject.FLAG_23, null, null, null, null, org.telegram.ui.ActionBar.j6.H6));
                i13++;
            }
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.l6(null, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.l6(null, TLObject.FLAG_23, null, null, null, null, org.telegram.ui.ActionBar.j6.H6));
        }
        if (this.h != null) {
            int i14 = 0;
            while (true) {
                org.telegram.ui.Cells.l6[] l6VarArr = this.h;
                if (i14 >= l6VarArr.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.l6(l6VarArr[i14], TLObject.FLAG_28, null, null, null, null, org.telegram.ui.ActionBar.j6.d6));
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.h[i14], TLObject.FLAG_28, null, null, null, null, org.telegram.ui.ActionBar.j6.i6));
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.h[i14], 0, new Class[]{org.telegram.ui.Cells.l6.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.G6));
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.h[i14], 8192, new Class[]{org.telegram.ui.Cells.l6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.g7));
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.h[i14], 16384, new Class[]{org.telegram.ui.Cells.l6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.h7));
                i14++;
            }
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, new Class[]{org.telegram.ui.Cells.l6.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.l6(null, 8192, new Class[]{org.telegram.ui.Cells.l6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.g7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(null, 16384, new Class[]{org.telegram.ui.Cells.l6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.h7));
        }
        int i15 = 0;
        while (true) {
            org.telegram.ui.Cells.m4[] m4VarArr = this.I;
            if (i15 >= m4VarArr.length) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.l6(m4VarArr[i15], 1, null, null, null, null, org.telegram.ui.ActionBar.j6.d6));
            arrayList.add(new org.telegram.ui.ActionBar.l6(m4VarArr[i15], 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
            i15++;
        }
        int i16 = 0;
        while (true) {
            org.telegram.ui.Cells.c7[] c7VarArr = this.K;
            if (i16 >= c7VarArr.length) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.l6(c7VarArr[i16], 32, new Class[]{org.telegram.ui.Cells.c7.class}, null, null, null, org.telegram.ui.ActionBar.j6.b7));
            i16++;
        }
        int i17 = 0;
        while (true) {
            org.telegram.ui.Cells.f9[] f9VarArr = this.M;
            if (i17 >= f9VarArr.length) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.l6(f9VarArr[i17], 32, new Class[]{org.telegram.ui.Cells.f9.class}, null, null, null, org.telegram.ui.ActionBar.j6.b7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(f9VarArr[i17], 0, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
            arrayList.add(new org.telegram.ui.ActionBar.l6(f9VarArr[i17], 2, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.J6));
            i17++;
        }
        int i18 = 0;
        while (true) {
            ArrayList arrayList2 = this.J;
            if (i18 >= arrayList2.size()) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.l6((View) arrayList2.get(i18), 1, null, null, null, null, org.telegram.ui.ActionBar.j6.d6));
            i18++;
        }
        org.telegram.ui.Cells.j3 j3Var = this.S;
        int i19 = org.telegram.ui.ActionBar.j6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(j3Var, 1, null, null, null, null, i19));
        int i20 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 4, new Class[]{org.telegram.ui.Cells.j3.class}, new String[]{"textView"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, TLObject.FLAG_23, new Class[]{org.telegram.ui.Cells.j3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.H6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.H, 4, null, null, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.L, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.L, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.L, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.L, TLObject.FLAG_28, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.L, TLObject.FLAG_28, null, null, null, null, org.telegram.ui.ActionBar.j6.i6));
        int i21 = 0;
        while (true) {
            org.telegram.ui.Cells.ga[] gaVarArr = this.N;
            if (i21 >= gaVarArr.length) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.l6(gaVarArr[i21], TLObject.FLAG_28, null, null, null, null, org.telegram.ui.ActionBar.j6.d6));
            arrayList.add(new org.telegram.ui.ActionBar.l6(gaVarArr[i21], TLObject.FLAG_28, null, null, null, null, org.telegram.ui.ActionBar.j6.i6));
            arrayList.add(new org.telegram.ui.ActionBar.l6(gaVarArr[i21], 0, new Class[]{org.telegram.ui.Cells.ga.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.G6));
            i21++;
        }
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.U, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.s6));
        int i22 = org.telegram.ui.ActionBar.j6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Q, 16, new Class[]{org.telegram.ui.Cells.g9.class}, null, null, null, i22));
        int i23 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Q, 262144, new Class[]{org.telegram.ui.Cells.g9.class}, new String[]{"textView"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Q, 262144, new Class[]{org.telegram.ui.Cells.g9.class}, new String[]{"valueTextView"}, null, null, -1, null, i23));
        int i24 = org.telegram.ui.ActionBar.j6.z6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Q, 262144, new Class[]{org.telegram.ui.Cells.g9.class}, new String[]{"textView"}, null, null, -1, null, i24));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Q, 262144, new Class[]{org.telegram.ui.Cells.g9.class}, new String[]{"valueTextView"}, null, null, -1, null, i24));
        org.telegram.ui.Cells.e9[] e9VarArr = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.l6(e9VarArr[0], TLObject.FLAG_28, null, null, null, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e9VarArr[0], TLObject.FLAG_28, null, null, null, null, org.telegram.ui.ActionBar.j6.i6));
        for (int i25 = 1; i25 < e9VarArr.length; i25++) {
            arrayList.add(new org.telegram.ui.ActionBar.l6(e9VarArr[i25], 1, null, null, null, null, org.telegram.ui.ActionBar.j6.d6));
            arrayList.add(new org.telegram.ui.ActionBar.l6(e9VarArr[i25], 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.l6(e9VarArr[i25], 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.z6));
        }
        org.telegram.ui.Cells.l5 l5Var = this.X;
        int i26 = org.telegram.ui.ActionBar.j6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(l5Var, 1, null, null, null, null, i26));
        int i27 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.X, 0, new Class[]{org.telegram.ui.Cells.l5.class}, new String[]{"nameTextView"}, null, null, -1, null, i27));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.X, 0, new Class[]{org.telegram.ui.Cells.l5.class}, new String[]{"detailTextView"}, null, null, -1, null, i27));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.X, 0, new Class[]{org.telegram.ui.Cells.l5.class}, new String[]{"detailExTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.z6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.W, TLObject.FLAG_28, null, null, null, null, i26));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.W, TLObject.FLAG_28, null, null, null, null, org.telegram.ui.ActionBar.j6.i6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.G;
    }

    public final void n0(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.O = frameLayout;
        frameLayout.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(true));
        this.O.setVisibility(8);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.P = frameLayout2;
        frameLayout2.setClickable(true);
        this.P.setFocusable(true);
        this.P.setBackgroundResource(R.drawable.googlepay_button_no_shadow_background);
        if (this.K0 == null) {
            this.P.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f));
        } else {
            this.P.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        }
        this.O.addView(this.P, w7.a6.c(48.0f, -1));
        this.P.setOnClickListener(new qn0(this, 12));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setWeightSum(2.0f);
        linearLayout.setGravity(16);
        linearLayout.setOrientation(1);
        linearLayout.setDuplicateParentStateEnabled(true);
        this.P.addView(linearLayout, w7.a6.c(-1.0f, -1));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setDuplicateParentStateEnabled(true);
        imageView.setImageResource(R.drawable.buy_with_googlepay_button_content);
        linearLayout.addView(imageView, w7.a6.l(1.0f, -1, 0));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView2.setDuplicateParentStateEnabled(true);
        imageView2.setImageResource(R.drawable.googlepay_button_overlay);
        this.P.addView(imageView2, w7.a6.c(-1.0f, -1));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003a A[Catch: Exception -> 0x001a, TryCatch #0 {Exception -> 0x001a, blocks: (B:2:0x0000, B:4:0x000d, B:6:0x0013, B:12:0x001d, B:14:0x0024, B:22:0x003a, B:23:0x0042, B:25:0x0048, B:29:0x0054, B:33:0x0062, B:35:0x0075, B:31:0x006f, B:39:0x0086), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0048 A[Catch: Exception -> 0x001a, TryCatch #0 {Exception -> 0x001a, blocks: (B:2:0x0000, B:4:0x000d, B:6:0x0013, B:12:0x001d, B:14:0x0024, B:22:0x003a, B:23:0x0042, B:25:0x0048, B:29:0x0054, B:33:0x0062, B:35:0x0075, B:31:0x006f, B:39:0x0086), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o0(String str) {
        boolean z10;
        boolean z11;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
            if (str == null && (telephonyManager.getSimState() == 1 || telephonyManager.getPhoneType() == 0)) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 23 && getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") != 0) {
                z10 = false;
                if (str == null || z10) {
                    if (str == null) {
                        str = gf.b.d(telephonyManager.getLine1Number(), false);
                    }
                    if (TextUtils.isEmpty(str)) {
                        int i10 = 4;
                        String str2 = null;
                        if (str.length() > 4) {
                            while (true) {
                                if (i10 < 1) {
                                    z11 = false;
                                    break;
                                }
                                String substring = str.substring(0, i10);
                                if (((String) this.c.get(substring)) != null) {
                                    str2 = str.substring(i10);
                                    this.f[8].setText(substring);
                                    z11 = true;
                                    break;
                                }
                                i10--;
                            }
                            if (!z11) {
                                str2 = str.substring(1);
                                this.f[8].setText(str.substring(0, 1));
                            }
                        }
                        if (str2 != null) {
                            this.f[9].setText(str2);
                            EditTextBoldCursor editTextBoldCursor = this.f[9];
                            editTextBoldCursor.setSelection(editTextBoldCursor.length());
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            z10 = true;
            if (str == null) {
            }
            if (str == null) {
            }
            if (TextUtils.isEmpty(str)) {
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        if (i10 == 991) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.my(this, i11, intent, 29));
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onBackPressed(boolean z10) {
        WebView webView = this.w;
        if (webView == null || !this.y) {
            return !this.P0;
        }
        if (z10) {
            webView.loadUrl(this.x);
            this.y = false;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.u0 == 4 && this.X0) {
            this.X0 = false;
            this.W.callOnClick();
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.twoStepPasswordChanged);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.didRemoveTwoStepPassword);
        if (this.u0 != 4 || this.V0) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.paymentFinished);
        }
        return super.onFragmentCreate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c4, code lost:
    
        if (r0 != 6) goto L58;
     */
    @Override // org.telegram.ui.ActionBar.p2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onFragmentDestroy() {
        uo0 uo0Var = this.T;
        if (uo0Var != null) {
            uo0Var.b();
        }
        int i10 = 0;
        AndroidUtilities.checkAndroidTheme(getParentActivity(), false);
        if (!this.a1) {
            this.f1 = 2;
            if (this.Z0 != null) {
                org.telegram.ui.ActionBar.f5 f5Var = this.parentLayout;
                if (f5Var != null && f5Var.getFragmentStack() != null) {
                    int indexOf = this.parentLayout.getFragmentStack().indexOf(this);
                    if (indexOf == -1) {
                        indexOf = this.parentLayout.getFragmentStack().size();
                    }
                    while (true) {
                        if (i10 >= this.parentLayout.getFragmentStack().size()) {
                            i10 = indexOf;
                            break;
                        } else if (((org.telegram.ui.ActionBar.p2) this.parentLayout.getFragmentStack().get(i10)) instanceof wo0) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                    i10 -= indexOf;
                }
                if (i10 == 0) {
                    this.Z0.a(this.f1);
                }
            }
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.twoStepPasswordChanged);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.didRemoveTwoStepPassword);
        if (this.u0 != 4 || this.V0) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.paymentFinished);
        }
        WebView webView = this.w;
        if (webView != null) {
            try {
                ViewParent parent = webView.getParent();
                if (parent != null) {
                    ((ViewGroup) parent).removeView(this.w);
                }
                this.w.stopLoading();
                this.w.loadUrl("about:blank");
                this.x = null;
                this.w.destroy();
                this.w = null;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        try {
            int i11 = this.u0;
            if (i11 != 2) {
            }
            if (Build.VERSION.SDK_INT >= 23) {
                if (SharedConfig.passcodeHash.length() != 0) {
                    if (SharedConfig.allowScreenCapture) {
                    }
                }
                getParentActivity().getWindow().clearFlags(8192);
                AndroidUtilities.logFlagSecure();
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
        super.onFragmentDestroy();
        this.Q0 = true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onResume() {
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                int i10 = this.u0;
                if ((i10 == 2 || i10 == 6) && !this.C0.invoice.test) {
                    getParentActivity().getWindow().setFlags(8192, 8192);
                    AndroidUtilities.logFlagSecure();
                } else if (SharedConfig.passcodeHash.length() == 0 || SharedConfig.allowScreenCapture) {
                    getParentActivity().getWindow().clearFlags(8192);
                    AndroidUtilities.logFlagSecure();
                }
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 || z11) {
            return;
        }
        WebView webView = this.w;
        if (webView != null) {
            if (this.u0 != 4) {
                TLRPC.TL_paymentFormMethod tL_paymentFormMethod = this.F0;
                if (tL_paymentFormMethod != null) {
                    String str = tL_paymentFormMethod.url;
                    this.x = str;
                    webView.loadUrl(str);
                    return;
                } else {
                    String str2 = this.C0.url;
                    this.x = str2;
                    webView.loadUrl(str2);
                    return;
                }
            }
            return;
        }
        int i10 = this.u0;
        if (i10 == 2) {
            AndroidUtilities.runOnUIThread(new tn0(this, 0), 100L);
            return;
        }
        if (i10 == 3) {
            this.f[1].requestFocus();
            AndroidUtilities.showKeyboard(this.f[1]);
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
        AndroidUtilities.showKeyboard(this.f[0]);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean presentFragment(org.telegram.ui.ActionBar.p2 p2Var) {
        y0(p2Var);
        return super.presentFragment(p2Var);
    }

    public final long q0() {
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

    public final long r0() {
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
        return DialogObject.getPeerDialogId(inputPeer);
    }

    public final String s0(ArrayList arrayList) {
        long j3 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            j3 += ((TLRPC.TL_labeledPrice) arrayList.get(i10)).amount;
        }
        Long l4 = this.H0;
        if (l4 != null) {
            j3 += l4.longValue();
        }
        return LocaleController.getInstance().formatCurrencyString(j3, this.C0.invoice.currency);
    }

    public final void t0() {
        int i10;
        int i11;
        boolean z10;
        int i12 = this.u0;
        if (i12 == 0) {
            uo0 uo0Var = this.T;
            if (uo0Var != null) {
                uo0Var.d(this.I0);
                finishFragment();
                return;
            }
            if (this.C0.invoice.flexible) {
                i10 = 1;
            } else if (this.y0 == null && this.w0 == null) {
                i10 = 2;
            } else {
                if (UserConfig.getInstance(this.currentAccount).tmpPassword != null && UserConfig.getInstance(this.currentAccount).tmpPassword.valid_until < ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() + 60) {
                    UserConfig.getInstance(this.currentAccount).tmpPassword = null;
                    UserConfig.getInstance(this.currentAccount).saveConfig(false);
                }
                i10 = UserConfig.getInstance(this.currentAccount).tmpPassword != null ? 4 : 3;
            }
            if (i10 == 2 && this.y0 == null && this.w0 == null && !this.C0.additional_methods.isEmpty()) {
                G0(new tn0(this, 1));
                return;
            }
            wo0 wo0Var = new wo0(this.b1, this.C0, this.N0, this.O0, i10, this.E0, null, null, this.w0, this.x0, this.I0, this.U0, this.J0, this.r0, this.W0);
            wo0Var.c1 = this.c1;
            wo0Var.d1 = this.d1;
            presentFragment(wo0Var, this.S0);
            return;
        }
        if (i12 == 1) {
            if (this.w0 == null && this.x0 == null) {
                if (this.y0 != null) {
                    if (UserConfig.getInstance(this.currentAccount).tmpPassword != null && UserConfig.getInstance(this.currentAccount).tmpPassword.valid_until < ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() + 60) {
                        UserConfig.getInstance(this.currentAccount).tmpPassword = null;
                        UserConfig.getInstance(this.currentAccount).saveConfig(false);
                    }
                    if (UserConfig.getInstance(this.currentAccount).tmpPassword == null) {
                        i11 = 3;
                    }
                } else {
                    i11 = 2;
                }
                if (i11 != 2 && this.x0 == null && this.y0 == null && this.w0 == null && !this.C0.additional_methods.isEmpty()) {
                    G0(new tn0(this, 1));
                    return;
                }
                wo0 wo0Var2 = new wo0(this.b1, this.C0, this.N0, this.O0, i11, this.E0, this.G0, this.H0, this.w0, this.x0, this.I0, this.U0, this.J0, this.r0, this.W0);
                wo0Var2.c1 = this.c1;
                wo0Var2.d1 = this.d1;
                presentFragment(wo0Var2, this.S0);
                return;
            }
            i11 = 4;
            if (i11 != 2) {
            }
            wo0 wo0Var22 = new wo0(this.b1, this.C0, this.N0, this.O0, i11, this.E0, this.G0, this.H0, this.w0, this.x0, this.I0, this.U0, this.J0, this.r0, this.W0);
            wo0Var22.c1 = this.c1;
            wo0Var22.d1 = this.d1;
            presentFragment(wo0Var22, this.S0);
            return;
        }
        if (i12 == 2) {
            TLRPC.PaymentForm paymentForm = this.C0;
            if (paymentForm.password_missing && (z10 = this.U0)) {
                wo0 wo0Var3 = new wo0(this.b1, paymentForm, this.N0, this.O0, 6, this.E0, this.G0, this.H0, this.w0, this.x0, this.I0, z10, this.J0, this.r0, this.W0);
                this.f0 = wo0Var3;
                wo0Var3.c1 = this.c1;
                wo0Var3.d1 = this.d1;
                wo0Var3.C0(this.a0);
                wo0 wo0Var4 = this.f0;
                wo0Var4.T = new ko0(this);
                presentFragment(wo0Var4, this.S0);
                return;
            }
            uo0 uo0Var2 = this.T;
            if (uo0Var2 != null) {
                uo0Var2.c(this.w0, this.x0, this.U0, this.J0, null);
                finishFragment();
                return;
            } else {
                wo0 wo0Var5 = new wo0(this.b1, paymentForm, this.N0, this.O0, 4, this.E0, this.G0, this.H0, this.w0, this.x0, this.I0, this.U0, this.J0, this.r0, this.W0);
                wo0Var5.c1 = this.c1;
                wo0Var5.d1 = this.d1;
                presentFragment(wo0Var5, this.S0);
                return;
            }
        }
        if (i12 == 3) {
            wo0 wo0Var6 = new wo0(this.b1, this.C0, this.N0, this.O0, this.v0 ? 4 : 2, this.E0, this.G0, this.H0, this.w0, this.x0, this.I0, this.U0, this.J0, this.r0, this.W0);
            wo0Var6.c1 = this.c1;
            wo0Var6.d1 = this.d1;
            presentFragment(wo0Var6, true);
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
            wo0 wo0Var7 = new wo0(this.b1, this.C0, this.N0, this.O0, 4, this.E0, this.G0, this.H0, this.w0, this.x0, this.I0, this.U0, this.J0, this.r0, false);
            wo0Var7.c1 = this.c1;
            wo0Var7.d1 = this.d1;
            presentFragment(wo0Var7, true);
            return;
        }
        if (this.V0) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.paymentFinished);
        }
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.paymentFinished, new Object[0]);
        if (getMessagesController().newMessageCallback != null) {
            AndroidUtilities.runOnUIThread(new tn0(this, 2), 500L);
        } else {
            if (x0(getParentLayout(), getParentActivity()) || isFinishing()) {
                return;
            }
            finishFragment();
        }
    }

    public final void u0(TLRPC.InputInvoice inputInvoice, TLRPC.PaymentForm paymentForm, MessageObject messageObject, String str, int i10, TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo, TLRPC.TL_shippingOption tL_shippingOption, Long l4, String str2, String str3, TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, org.telegram.ui.ActionBar.p2 p2Var, boolean z11) {
        if (p2Var != null) {
            this.currentAccount = p2Var.getCurrentAccount();
        }
        this.u0 = i10;
        this.r0 = p2Var;
        this.w0 = str2;
        this.J0 = tL_inputPaymentCredentialsGooglePay;
        this.E0 = tL_payments_validatedRequestedInfo;
        this.C0 = paymentForm;
        this.G0 = tL_shippingOption;
        this.H0 = l4;
        this.N0 = messageObject;
        this.O0 = str;
        this.b1 = inputInvoice;
        this.U0 = z10;
        this.W0 = z11;
        this.S0 = ("stripe".equals(paymentForm.native_provider) || "smartglocal".equals(this.C0.native_provider)) ? false : true;
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(paymentForm.bot_id));
        this.l0 = user;
        if (user != null) {
            this.p0 = user.first_name;
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

    public final void v0(Context context) {
        Optional empty;
        if (getParentActivity() == null) {
            return;
        }
        com.google.android.gms.internal.cast.a aVar = new com.google.android.gms.internal.cast.a();
        int i10 = this.C0.invoice.test ? 3 : 1;
        if (i10 != 2 && i10 != 1 && i10 != 3) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(hc.b.j(i10, "Invalid environment value "));
        }
        aVar.a = i10;
        this.e = new com.google.android.gms.internal.clearcut.v0(context, v8.p.a, new v8.o(aVar), com.google.android.gms.common.api.i.c);
        try {
            JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
            put.put("allowedPaymentMethods", new JSONArray().put(p0()));
            empty = Optional.of(put);
        } catch (JSONException unused) {
            empty = Optional.empty();
        }
        if (empty.isPresent()) {
            String jSONObject = ((JSONObject) empty.get()).toString();
            v8.e eVar = new v8.e();
            n6.l.i(jSONObject, "isReadyToPayRequestJson cannot be null!");
            eVar.f = jSONObject;
            com.google.android.gms.internal.clearcut.v0 v0Var = this.e;
            v0Var.getClass();
            com.google.android.gms.common.api.internal.v e = com.google.android.gms.common.api.internal.w.e();
            e.a = 23705;
            e.c = new m.g3(eVar, 23);
            v0Var.e(0, e.a()).addOnCompleteListener(getParentActivity(), new un0(this, 0));
        }
    }

    public final void w0() {
        if (this.e0) {
            return;
        }
        this.e0 = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new wn0(this, 1), 10);
    }

    public final boolean x0(org.telegram.ui.ActionBar.f5 f5Var, Activity activity) {
        int i10 = 0;
        if (this.b1 != null) {
            if (f5Var != null) {
                ArrayList arrayList = new ArrayList(f5Var.getFragmentStack());
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj;
                    if (p2Var instanceof wo0) {
                        p2Var.removeSelfFromStack();
                    }
                }
                return true;
            }
            return false;
        }
        String str = this.l0.username;
        if (((str != null && str.equalsIgnoreCase(getMessagesController().premiumBotUsername) && this.O0 == null) || (this.O0 != null && getMessagesController().premiumInvoiceSlug != null && Objects.equals(this.O0, getMessagesController().premiumInvoiceSlug))) && f5Var != null) {
            ArrayList arrayList2 = new ArrayList(f5Var.getFragmentStack());
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                org.telegram.ui.ActionBar.p2 p2Var2 = (org.telegram.ui.ActionBar.p2) obj2;
                if ((p2Var2 instanceof eo) || (p2Var2 instanceof PremiumPreviewFragment)) {
                    p2Var2.removeSelfFromStack();
                }
            }
            PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, null);
            premiumPreviewFragment.p0 = true;
            ((ActionBarLayout) f5Var).Q(premiumPreviewFragment, !isFinishing());
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

    public final void y0(org.telegram.ui.ActionBar.p2 p2Var) {
        AndroidUtilities.hideKeyboard(this.fragmentView);
        if (p2Var instanceof wo0) {
            wo0 wo0Var = (wo0) p2Var;
            wo0Var.Z0 = this.Z0;
            wo0Var.Y0 = this.Y0;
            wo0Var.X0 = this.X0;
            wo0Var.y0 = this.y0;
        }
    }

    public final void z0() {
        String str;
        if (this.Q0) {
            return;
        }
        H0(false, true);
        TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm = new TLRPC.TL_payments_sendPaymentForm();
        TLRPC.InputInvoice inputInvoice = this.b1;
        if (inputInvoice != null) {
            tL_payments_sendPaymentForm.invoice = inputInvoice;
        } else if (this.N0 != null) {
            TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
            tL_inputInvoiceMessage.peer = getMessagesController().getInputPeer(this.N0.messageOwner.peer_id);
            tL_inputInvoiceMessage.msg_id = this.N0.getId();
            tL_payments_sendPaymentForm.invoice = tL_inputInvoiceMessage;
        } else {
            TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
            tL_inputInvoiceSlug.slug = this.O0;
            tL_payments_sendPaymentForm.invoice = tL_inputInvoiceSlug;
        }
        tL_payments_sendPaymentForm.form_id = this.C0.form_id;
        if (UserConfig.getInstance(this.currentAccount).tmpPassword == null || this.y0 == null) {
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
            tL_inputPaymentCredentialsSaved.tmp_password = UserConfig.getInstance(this.currentAccount).tmpPassword.tmp_password;
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
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_sendPaymentForm, new rg0(5, this, tL_payments_sendPaymentForm), (this.W0 ? 8 : 0) | 2);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean presentFragment(org.telegram.ui.ActionBar.p2 p2Var, boolean z10) {
        y0(p2Var);
        return super.presentFragment(p2Var, z10);
    }

    public wo0(TLRPC.PaymentForm paymentForm, MessageObject messageObject, String str, org.telegram.ui.ActionBar.p2 p2Var) {
        super(null);
        this.a = new ArrayList();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.G = true;
        this.I = new org.telegram.ui.Cells.m4[3];
        this.J = new ArrayList();
        this.K = new org.telegram.ui.Cells.c7[3];
        this.M = new org.telegram.ui.Cells.f9[3];
        this.N = new org.telegram.ui.Cells.ga[2];
        this.Y = new org.telegram.ui.Cells.e9[7];
        this.Z = -4.5f;
        this.c0 = 6;
        this.V0 = true;
        u0(null, paymentForm, messageObject, str, 4, null, null, null, null, null, null, false, null, p2Var, false);
    }

    public wo0(TLRPC.PaymentReceipt paymentReceipt) {
        super(null);
        this.a = new ArrayList();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.G = true;
        this.I = new org.telegram.ui.Cells.m4[3];
        this.J = new ArrayList();
        this.K = new org.telegram.ui.Cells.c7[3];
        this.M = new org.telegram.ui.Cells.f9[3];
        this.N = new org.telegram.ui.Cells.ga[2];
        this.Y = new org.telegram.ui.Cells.e9[7];
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
        long j3 = paymentReceipt.tip_amount;
        if (j3 != 0) {
            this.H0 = Long.valueOf(j3);
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(paymentReceipt.bot_id));
        this.l0 = user;
        if (user != null) {
            this.p0 = user.first_name;
        } else {
            this.p0 = "";
        }
        this.q0 = paymentReceipt.title;
        if (paymentReceipt.info != null) {
            this.I0 = new TLRPC.TL_payments_validateRequestedInfo();
            if (this.N0 != null) {
                TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
                tL_inputInvoiceMessage.peer = getMessagesController().getInputPeer(paymentReceipt.bot_id);
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

    public wo0(TLRPC.PaymentForm paymentForm, TLRPC.InputInvoice inputInvoice, org.telegram.ui.ActionBar.p2 p2Var) {
        this(inputInvoice, paymentForm, null, null, 4, null, null, null, null, null, null, false, null, p2Var, false);
        this.V0 = true;
    }
}
