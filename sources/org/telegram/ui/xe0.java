package org.telegram.ui;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Timer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class xe0 extends org.telegram.ui.Components.fw0 {
    public int E;
    public int F;
    public String G;
    public String H;
    public String I;
    public String J;
    public String K;
    public Bundle L;
    public boolean M;
    public Timer N;
    public final Object O;
    public int P;
    public double Q;
    public boolean R;
    public Bundle S;
    public TLRPC.TL_auth_sentCode T;
    public final ue0 U;
    public final ue0 V;
    public float W;
    public final int a;
    public final /* synthetic */ xg0 a0;
    public final org.telegram.ui.Components.hd0 b;
    public final bi.t2 c;
    public final org.telegram.ui.Components.voip.m2 d;
    public final TextView e;
    public final TextView f;
    public final org.telegram.ui.Components.kj0 h;
    public final TextView n;
    public final TextView r;
    public final TextView s;
    public final xf0 v;
    public boolean w;
    public boolean x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xe0(xg0 xg0Var, Context context, int i10) {
        super(context);
        boolean z10;
        org.telegram.ui.ActionBar.f6 f6Var;
        this.a0 = xg0Var;
        this.w = true;
        this.x = false;
        this.y = false;
        this.O = new Object();
        this.P = 60000;
        this.U = new ue0(this, 1);
        this.V = new ue0(this, 2);
        this.W = -3.0f;
        this.a = i10;
        boolean z11 = i10 != 16;
        setOrientation(1);
        org.telegram.ui.Components.kj0 kj0Var = new org.telegram.ui.Components.kj0(context);
        this.h = kj0Var;
        kj0Var.setScaleType(ImageView.ScaleType.CENTER);
        kj0Var.f(R.raw.bubble, 95, 95, null);
        if (!AndroidUtilities.isSmallScreen()) {
            Point point = AndroidUtilities.displaySize;
            if (point.x <= point.y || AndroidUtilities.isTablet()) {
                z10 = false;
                kj0Var.setVisibility(!z10 ? 8 : 0);
                addView(kj0Var, w7.a6.t(95, 95, 1, 0, 10, 0, 5));
                TextView textView = new TextView(context);
                this.n = textView;
                textView.setTextSize(1, 18.0f);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                textView.setGravity(49);
                textView.setText(LocaleController.getString(z11 ? R.string.SMSWordTitle : R.string.SMSPhraseTitle));
                addView(textView, w7.a6.t(-2, -2, 1, 8, !z10 ? 25 : 0, 8, 0));
                TextView textView2 = new TextView(context);
                this.r = textView2;
                textView2.setTextSize(1, 14.0f);
                textView2.setGravity(1);
                textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                addView(textView2, w7.a6.t(-2, -2, 1, 8, 5, 8, 16));
                org.telegram.ui.Components.hd0 hd0Var = new org.telegram.ui.Components.hd0(context, null);
                this.b = hd0Var;
                hd0Var.setText(LocaleController.getString(z11 ? R.string.SMSWord : R.string.SMSPhrase));
                bi.t2 t2Var = new bi.t2(this, context, 8);
                this.c = t2Var;
                t2Var.setSingleLine();
                t2Var.setLines(1);
                t2Var.setCursorSize(AndroidUtilities.dp(20.0f));
                t2Var.setCursorWidth(1.5f);
                t2Var.setImeOptions(268435461);
                t2Var.setTextSize(1, 18.0f);
                t2Var.setMaxLines(1);
                t2Var.setBackground(null);
                t2Var.setHint(LocaleController.getString(z11 ? R.string.SMSWordHint : R.string.SMSPhraseHint));
                t2Var.addTextChangedListener(new org.telegram.ui.Cells.h3(this));
                t2Var.setEllipsizeByGradient(true);
                t2Var.setInputType(1);
                t2Var.setTypeface(Typeface.DEFAULT);
                t2Var.setGravity(!LocaleController.isRTL ? 5 : 3);
                t2Var.setOnFocusChangeListener(new qd(this, 5));
                TextView textView3 = new TextView(context);
                this.s = textView3;
                com.google.android.gms.internal.vision.e2.k(12.0f, 1, textView3);
                textView3.setPadding(org.telegram.ui.Cells.r6.b(10.0f, R.string.Paste, textView3), 0, AndroidUtilities.dp(10.0f), 0);
                textView3.setGravity(17);
                int i11 = org.telegram.ui.ActionBar.j6.o6;
                f6Var = ((org.telegram.ui.ActionBar.p2) xg0Var).resourceProvider;
                int v02 = org.telegram.ui.ActionBar.j6.v0(i11, f6Var);
                textView3.setTextColor(v02);
                int dp = AndroidUtilities.dp(6.0f);
                int l1 = org.telegram.ui.ActionBar.j6.l1(0.12f, v02);
                int l12 = org.telegram.ui.ActionBar.j6.l1(0.15f, v02);
                textView3.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, l1, l12, l12));
                w7.c6.b(textView3, 0.1f, 1.5f);
                t2Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.34f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.34f));
                final int i12 = 0;
                textView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ve0
                    public final /* synthetic */ xe0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        CharSequence charSequence;
                        int i13;
                        int i14;
                        TLRPC.TL_auth_sentCode tL_auth_sentCode;
                        switch (i12) {
                            case 0:
                                xe0 xe0Var = this.b;
                                bi.t2 t2Var2 = xe0Var.c;
                                try {
                                    charSequence = ((ClipboardManager) xe0Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(xe0Var.getContext());
                                } catch (Exception e) {
                                    FileLog.e(e);
                                    charSequence = null;
                                }
                                if (charSequence != null) {
                                    Editable text = t2Var2.getText();
                                    xe0Var.y = true;
                                    if (text != null) {
                                        int max = Math.max(0, t2Var2.getSelectionStart());
                                        text.replace(max, Math.max(max, t2Var2.getSelectionEnd()), charSequence);
                                    }
                                }
                                xe0Var.q(true);
                                break;
                            case 1:
                                this.b.c(true);
                                break;
                            default:
                                final xe0 xe0Var2 = this.b;
                                xg0 xg0Var2 = xe0Var2.a0;
                                xf0 xf0Var = xe0Var2.v;
                                if (xe0Var2.P <= 0 || xe0Var2.N == null) {
                                    Bundle bundle = xe0Var2.S;
                                    if (bundle != null && (tL_auth_sentCode = xe0Var2.T) != null) {
                                        xg0Var2.g1(bundle, tL_auth_sentCode, true);
                                        break;
                                    } else {
                                        int i15 = xe0Var2.E;
                                        if (i15 != 4 && i15 != 2 && i15 != 11 && i15 != 15) {
                                            if (i15 == 3) {
                                                AndroidUtilities.setWaitingForSms(false);
                                                if (!xe0Var2.R && !xe0Var2.M && !xg0Var2.o0) {
                                                    xe0Var2.M = true;
                                                    xf0Var.invalidate();
                                                    xf0Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.I6, false));
                                                    final Bundle bundle2 = new Bundle();
                                                    bundle2.putString("phone", xe0Var2.J);
                                                    bundle2.putString("ephone", xe0Var2.I);
                                                    bundle2.putString("phoneFormated", xe0Var2.G);
                                                    xe0Var2.R = true;
                                                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                                    tL_auth_resendCode.phone_number = xe0Var2.G;
                                                    tL_auth_resendCode.phone_code_hash = xe0Var2.H;
                                                    i14 = ((org.telegram.ui.ActionBar.p2) xg0Var2).currentAccount;
                                                    final int i16 = 1;
                                                    xg0Var2.n1(ConnectionsManager.getInstance(i14).sendRequest(tL_auth_resendCode, new RequestDelegate() { // from class: org.telegram.ui.re0
                                                        @Override // org.telegram.tgnet.RequestDelegate
                                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            switch (i16) {
                                                                case 0:
                                                                    AndroidUtilities.runOnUIThread(new te0(xe0Var2, tLObject, bundle2, tL_error));
                                                                    break;
                                                                default:
                                                                    AndroidUtilities.runOnUIThread(new te0(xe0Var2, tL_error, bundle2, tLObject));
                                                                    break;
                                                            }
                                                        }
                                                    }, 10), true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            xe0Var2.M = true;
                                            xf0Var.invalidate();
                                            xf0Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.I6, false));
                                            xf0Var.setTextSize(1, 15.0f);
                                            int i17 = xe0Var2.E;
                                            if (i17 == 4 || i17 == 11) {
                                                xf0Var.setText(LocaleController.getString(R.string.Calling));
                                            } else {
                                                xf0Var.setText(LocaleController.getString(R.string.SendingSms));
                                            }
                                            final Bundle bundle3 = new Bundle();
                                            bundle3.putString("phone", xe0Var2.J);
                                            bundle3.putString("ephone", xe0Var2.I);
                                            bundle3.putString("phoneFormated", xe0Var2.G);
                                            bundle3.putInt("prevType", xe0Var2.a);
                                            TLRPC.TL_auth_resendCode tL_auth_resendCode2 = new TLRPC.TL_auth_resendCode();
                                            tL_auth_resendCode2.phone_number = xe0Var2.G;
                                            tL_auth_resendCode2.phone_code_hash = xe0Var2.H;
                                            i13 = ((org.telegram.ui.ActionBar.p2) xg0Var2).currentAccount;
                                            final int i18 = 0;
                                            ConnectionsManager.getInstance(i13).sendRequest(tL_auth_resendCode2, new RequestDelegate() { // from class: org.telegram.ui.re0
                                                @Override // org.telegram.tgnet.RequestDelegate
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    switch (i18) {
                                                        case 0:
                                                            AndroidUtilities.runOnUIThread(new te0(xe0Var2, tLObject, bundle3, tL_error));
                                                            break;
                                                        default:
                                                            AndroidUtilities.runOnUIThread(new te0(xe0Var2, tL_error, bundle3, tLObject));
                                                            break;
                                                    }
                                                }
                                            }, 10);
                                            break;
                                        }
                                    }
                                }
                                break;
                        }
                    }
                });
                hd0Var.addView(t2Var, w7.a6.d(-1, -2.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
                hd0Var.e(t2Var);
                hd0Var.addView(textView3, w7.a6.d(-2, 26.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.addView(hd0Var, w7.a6.q(-1, -2, 1));
                addView(linearLayout, w7.a6.t(-1, -2, 1, 16, 3, 16, 0));
                t2Var.setOnEditorActionListener(new ja(this, 6));
                FrameLayout frameLayout = new FrameLayout(context);
                linearLayout.addView(frameLayout, w7.a6.n(-1, -2));
                org.telegram.ui.Components.voip.m2 m2Var = new org.telegram.ui.Components.voip.m2(xg0Var, context);
                this.d = m2Var;
                int i13 = org.telegram.ui.ActionBar.j6.I6;
                m2Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
                m2Var.setTextColor(xg0Var.getThemedColor(i13));
                m2Var.setTextSize(1, 14.0f);
                m2Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                m2Var.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
                final int i14 = 1;
                m2Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ve0
                    public final /* synthetic */ xe0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        CharSequence charSequence;
                        int i132;
                        int i142;
                        TLRPC.TL_auth_sentCode tL_auth_sentCode;
                        switch (i14) {
                            case 0:
                                xe0 xe0Var = this.b;
                                bi.t2 t2Var2 = xe0Var.c;
                                try {
                                    charSequence = ((ClipboardManager) xe0Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(xe0Var.getContext());
                                } catch (Exception e) {
                                    FileLog.e(e);
                                    charSequence = null;
                                }
                                if (charSequence != null) {
                                    Editable text = t2Var2.getText();
                                    xe0Var.y = true;
                                    if (text != null) {
                                        int max = Math.max(0, t2Var2.getSelectionStart());
                                        text.replace(max, Math.max(max, t2Var2.getSelectionEnd()), charSequence);
                                    }
                                }
                                xe0Var.q(true);
                                break;
                            case 1:
                                this.b.c(true);
                                break;
                            default:
                                final xe0 xe0Var2 = this.b;
                                xg0 xg0Var2 = xe0Var2.a0;
                                xf0 xf0Var = xe0Var2.v;
                                if (xe0Var2.P <= 0 || xe0Var2.N == null) {
                                    Bundle bundle = xe0Var2.S;
                                    if (bundle != null && (tL_auth_sentCode = xe0Var2.T) != null) {
                                        xg0Var2.g1(bundle, tL_auth_sentCode, true);
                                        break;
                                    } else {
                                        int i15 = xe0Var2.E;
                                        if (i15 != 4 && i15 != 2 && i15 != 11 && i15 != 15) {
                                            if (i15 == 3) {
                                                AndroidUtilities.setWaitingForSms(false);
                                                if (!xe0Var2.R && !xe0Var2.M && !xg0Var2.o0) {
                                                    xe0Var2.M = true;
                                                    xf0Var.invalidate();
                                                    xf0Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.I6, false));
                                                    final Bundle bundle2 = new Bundle();
                                                    bundle2.putString("phone", xe0Var2.J);
                                                    bundle2.putString("ephone", xe0Var2.I);
                                                    bundle2.putString("phoneFormated", xe0Var2.G);
                                                    xe0Var2.R = true;
                                                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                                    tL_auth_resendCode.phone_number = xe0Var2.G;
                                                    tL_auth_resendCode.phone_code_hash = xe0Var2.H;
                                                    i142 = ((org.telegram.ui.ActionBar.p2) xg0Var2).currentAccount;
                                                    final int i16 = 1;
                                                    xg0Var2.n1(ConnectionsManager.getInstance(i142).sendRequest(tL_auth_resendCode, new RequestDelegate() { // from class: org.telegram.ui.re0
                                                        @Override // org.telegram.tgnet.RequestDelegate
                                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            switch (i16) {
                                                                case 0:
                                                                    AndroidUtilities.runOnUIThread(new te0(xe0Var2, tLObject, bundle2, tL_error));
                                                                    break;
                                                                default:
                                                                    AndroidUtilities.runOnUIThread(new te0(xe0Var2, tL_error, bundle2, tLObject));
                                                                    break;
                                                            }
                                                        }
                                                    }, 10), true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            xe0Var2.M = true;
                                            xf0Var.invalidate();
                                            xf0Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.I6, false));
                                            xf0Var.setTextSize(1, 15.0f);
                                            int i17 = xe0Var2.E;
                                            if (i17 == 4 || i17 == 11) {
                                                xf0Var.setText(LocaleController.getString(R.string.Calling));
                                            } else {
                                                xf0Var.setText(LocaleController.getString(R.string.SendingSms));
                                            }
                                            final Bundle bundle3 = new Bundle();
                                            bundle3.putString("phone", xe0Var2.J);
                                            bundle3.putString("ephone", xe0Var2.I);
                                            bundle3.putString("phoneFormated", xe0Var2.G);
                                            bundle3.putInt("prevType", xe0Var2.a);
                                            TLRPC.TL_auth_resendCode tL_auth_resendCode2 = new TLRPC.TL_auth_resendCode();
                                            tL_auth_resendCode2.phone_number = xe0Var2.G;
                                            tL_auth_resendCode2.phone_code_hash = xe0Var2.H;
                                            i132 = ((org.telegram.ui.ActionBar.p2) xg0Var2).currentAccount;
                                            final int i18 = 0;
                                            ConnectionsManager.getInstance(i132).sendRequest(tL_auth_resendCode2, new RequestDelegate() { // from class: org.telegram.ui.re0
                                                @Override // org.telegram.tgnet.RequestDelegate
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    switch (i18) {
                                                        case 0:
                                                            AndroidUtilities.runOnUIThread(new te0(xe0Var2, tLObject, bundle3, tL_error));
                                                            break;
                                                        default:
                                                            AndroidUtilities.runOnUIThread(new te0(xe0Var2, tL_error, bundle3, tLObject));
                                                            break;
                                                    }
                                                }
                                            }, 10);
                                            break;
                                        }
                                    }
                                }
                                break;
                        }
                    }
                });
                addView(m2Var, w7.a6.t(-2, -2, 1, 0, 18, 0, 0));
                m2Var.setVisibility(8);
                TextView textView4 = new TextView(context);
                this.e = textView4;
                textView4.setPivotX(0.0f);
                textView4.setPivotY(0.0f);
                textView4.setText(LocaleController.getString(z11 ? R.string.SMSWordError : R.string.SMSPhraseError));
                textView4.setTextColor(xg0Var.getThemedColor(org.telegram.ui.ActionBar.j6.p7));
                textView4.setTextSize(1, 13.0f);
                frameLayout.addView(textView4, w7.a6.d(-1, -2.0f, 119, 16.0f, 8.0f, 16.0f, 8.0f));
                textView4.setAlpha(0.0f);
                textView4.setScaleX(0.8f);
                textView4.setScaleY(0.8f);
                textView4.setTranslationY(-AndroidUtilities.dp(4.0f));
                TextView textView5 = new TextView(context);
                this.f = textView5;
                textView5.setPivotX(0.0f);
                textView5.setPivotY(0.0f);
                textView5.setText(LocaleController.getString(z11 ? R.string.SMSWordPasteHint : R.string.SMSPhrasePasteHint));
                textView5.setTextColor(xg0Var.getThemedColor(org.telegram.ui.ActionBar.j6.y6));
                textView5.setTextSize(1, 13.0f);
                frameLayout.addView(textView5, w7.a6.d(-1, -2.0f, 119, 16.0f, 8.0f, 16.0f, 8.0f));
                xf0 xf0Var = new xf0(this, context);
                this.v = xf0Var;
                xf0Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
                xf0Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                xf0Var.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
                xf0Var.setTextSize(1, 15.0f);
                xf0Var.setGravity(19);
                final int i15 = 2;
                xf0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ve0
                    public final /* synthetic */ xe0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        CharSequence charSequence;
                        int i132;
                        int i142;
                        TLRPC.TL_auth_sentCode tL_auth_sentCode;
                        switch (i15) {
                            case 0:
                                xe0 xe0Var = this.b;
                                bi.t2 t2Var2 = xe0Var.c;
                                try {
                                    charSequence = ((ClipboardManager) xe0Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(xe0Var.getContext());
                                } catch (Exception e) {
                                    FileLog.e(e);
                                    charSequence = null;
                                }
                                if (charSequence != null) {
                                    Editable text = t2Var2.getText();
                                    xe0Var.y = true;
                                    if (text != null) {
                                        int max = Math.max(0, t2Var2.getSelectionStart());
                                        text.replace(max, Math.max(max, t2Var2.getSelectionEnd()), charSequence);
                                    }
                                }
                                xe0Var.q(true);
                                break;
                            case 1:
                                this.b.c(true);
                                break;
                            default:
                                final xe0 xe0Var2 = this.b;
                                xg0 xg0Var2 = xe0Var2.a0;
                                xf0 xf0Var2 = xe0Var2.v;
                                if (xe0Var2.P <= 0 || xe0Var2.N == null) {
                                    Bundle bundle = xe0Var2.S;
                                    if (bundle != null && (tL_auth_sentCode = xe0Var2.T) != null) {
                                        xg0Var2.g1(bundle, tL_auth_sentCode, true);
                                        break;
                                    } else {
                                        int i152 = xe0Var2.E;
                                        if (i152 != 4 && i152 != 2 && i152 != 11 && i152 != 15) {
                                            if (i152 == 3) {
                                                AndroidUtilities.setWaitingForSms(false);
                                                if (!xe0Var2.R && !xe0Var2.M && !xg0Var2.o0) {
                                                    xe0Var2.M = true;
                                                    xf0Var2.invalidate();
                                                    xf0Var2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.I6, false));
                                                    final Bundle bundle2 = new Bundle();
                                                    bundle2.putString("phone", xe0Var2.J);
                                                    bundle2.putString("ephone", xe0Var2.I);
                                                    bundle2.putString("phoneFormated", xe0Var2.G);
                                                    xe0Var2.R = true;
                                                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                                    tL_auth_resendCode.phone_number = xe0Var2.G;
                                                    tL_auth_resendCode.phone_code_hash = xe0Var2.H;
                                                    i142 = ((org.telegram.ui.ActionBar.p2) xg0Var2).currentAccount;
                                                    final int i16 = 1;
                                                    xg0Var2.n1(ConnectionsManager.getInstance(i142).sendRequest(tL_auth_resendCode, new RequestDelegate() { // from class: org.telegram.ui.re0
                                                        @Override // org.telegram.tgnet.RequestDelegate
                                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            switch (i16) {
                                                                case 0:
                                                                    AndroidUtilities.runOnUIThread(new te0(xe0Var2, tLObject, bundle2, tL_error));
                                                                    break;
                                                                default:
                                                                    AndroidUtilities.runOnUIThread(new te0(xe0Var2, tL_error, bundle2, tLObject));
                                                                    break;
                                                            }
                                                        }
                                                    }, 10), true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            xe0Var2.M = true;
                                            xf0Var2.invalidate();
                                            xf0Var2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.I6, false));
                                            xf0Var2.setTextSize(1, 15.0f);
                                            int i17 = xe0Var2.E;
                                            if (i17 == 4 || i17 == 11) {
                                                xf0Var2.setText(LocaleController.getString(R.string.Calling));
                                            } else {
                                                xf0Var2.setText(LocaleController.getString(R.string.SendingSms));
                                            }
                                            final Bundle bundle3 = new Bundle();
                                            bundle3.putString("phone", xe0Var2.J);
                                            bundle3.putString("ephone", xe0Var2.I);
                                            bundle3.putString("phoneFormated", xe0Var2.G);
                                            bundle3.putInt("prevType", xe0Var2.a);
                                            TLRPC.TL_auth_resendCode tL_auth_resendCode2 = new TLRPC.TL_auth_resendCode();
                                            tL_auth_resendCode2.phone_number = xe0Var2.G;
                                            tL_auth_resendCode2.phone_code_hash = xe0Var2.H;
                                            i132 = ((org.telegram.ui.ActionBar.p2) xg0Var2).currentAccount;
                                            final int i18 = 0;
                                            ConnectionsManager.getInstance(i132).sendRequest(tL_auth_resendCode2, new RequestDelegate() { // from class: org.telegram.ui.re0
                                                @Override // org.telegram.tgnet.RequestDelegate
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    switch (i18) {
                                                        case 0:
                                                            AndroidUtilities.runOnUIThread(new te0(xe0Var2, tLObject, bundle3, tL_error));
                                                            break;
                                                        default:
                                                            AndroidUtilities.runOnUIThread(new te0(xe0Var2, tL_error, bundle3, tLObject));
                                                            break;
                                                    }
                                                }
                                            }, 10);
                                            break;
                                        }
                                    }
                                }
                                break;
                        }
                    }
                });
                FrameLayout frameLayout2 = new FrameLayout(context);
                frameLayout2.addView(xf0Var, w7.a6.d(-1, 56.0f, 80, 6.0f, 0.0f, 60.0f, 28.0f));
                addView(frameLayout2, w7.a6.q(-1, -1, 80));
                og.u0.e(xf0Var);
            }
        }
        z10 = true;
        kj0Var.setVisibility(!z10 ? 8 : 0);
        addView(kj0Var, w7.a6.t(95, 95, 1, 0, 10, 0, 5));
        TextView textView6 = new TextView(context);
        this.n = textView6;
        textView6.setTextSize(1, 18.0f);
        textView6.setTypeface(AndroidUtilities.bold());
        textView6.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView6.setGravity(49);
        textView6.setText(LocaleController.getString(z11 ? R.string.SMSWordTitle : R.string.SMSPhraseTitle));
        addView(textView6, w7.a6.t(-2, -2, 1, 8, !z10 ? 25 : 0, 8, 0));
        TextView textView22 = new TextView(context);
        this.r = textView22;
        textView22.setTextSize(1, 14.0f);
        textView22.setGravity(1);
        textView22.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView22, w7.a6.t(-2, -2, 1, 8, 5, 8, 16));
        org.telegram.ui.Components.hd0 hd0Var2 = new org.telegram.ui.Components.hd0(context, null);
        this.b = hd0Var2;
        hd0Var2.setText(LocaleController.getString(z11 ? R.string.SMSWord : R.string.SMSPhrase));
        bi.t2 t2Var2 = new bi.t2(this, context, 8);
        this.c = t2Var2;
        t2Var2.setSingleLine();
        t2Var2.setLines(1);
        t2Var2.setCursorSize(AndroidUtilities.dp(20.0f));
        t2Var2.setCursorWidth(1.5f);
        t2Var2.setImeOptions(268435461);
        t2Var2.setTextSize(1, 18.0f);
        t2Var2.setMaxLines(1);
        t2Var2.setBackground(null);
        t2Var2.setHint(LocaleController.getString(z11 ? R.string.SMSWordHint : R.string.SMSPhraseHint));
        t2Var2.addTextChangedListener(new org.telegram.ui.Cells.h3(this));
        t2Var2.setEllipsizeByGradient(true);
        t2Var2.setInputType(1);
        t2Var2.setTypeface(Typeface.DEFAULT);
        t2Var2.setGravity(!LocaleController.isRTL ? 5 : 3);
        t2Var2.setOnFocusChangeListener(new qd(this, 5));
        TextView textView32 = new TextView(context);
        this.s = textView32;
        com.google.android.gms.internal.vision.e2.k(12.0f, 1, textView32);
        textView32.setPadding(org.telegram.ui.Cells.r6.b(10.0f, R.string.Paste, textView32), 0, AndroidUtilities.dp(10.0f), 0);
        textView32.setGravity(17);
        int i112 = org.telegram.ui.ActionBar.j6.o6;
        f6Var = ((org.telegram.ui.ActionBar.p2) xg0Var).resourceProvider;
        int v022 = org.telegram.ui.ActionBar.j6.v0(i112, f6Var);
        textView32.setTextColor(v022);
        int dp2 = AndroidUtilities.dp(6.0f);
        int l13 = org.telegram.ui.ActionBar.j6.l1(0.12f, v022);
        int l122 = org.telegram.ui.ActionBar.j6.l1(0.15f, v022);
        textView32.setBackground(org.telegram.ui.ActionBar.j6.i0(dp2, dp2, dp2, dp2, l13, l122, l122));
        w7.c6.b(textView32, 0.1f, 1.5f);
        t2Var2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.34f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.34f));
        final int i122 = 0;
        textView32.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ve0
            public final /* synthetic */ xe0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CharSequence charSequence;
                int i132;
                int i142;
                TLRPC.TL_auth_sentCode tL_auth_sentCode;
                switch (i122) {
                    case 0:
                        xe0 xe0Var = this.b;
                        bi.t2 t2Var22 = xe0Var.c;
                        try {
                            charSequence = ((ClipboardManager) xe0Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(xe0Var.getContext());
                        } catch (Exception e) {
                            FileLog.e(e);
                            charSequence = null;
                        }
                        if (charSequence != null) {
                            Editable text = t2Var22.getText();
                            xe0Var.y = true;
                            if (text != null) {
                                int max = Math.max(0, t2Var22.getSelectionStart());
                                text.replace(max, Math.max(max, t2Var22.getSelectionEnd()), charSequence);
                            }
                        }
                        xe0Var.q(true);
                        break;
                    case 1:
                        this.b.c(true);
                        break;
                    default:
                        final xe0 xe0Var2 = this.b;
                        xg0 xg0Var2 = xe0Var2.a0;
                        xf0 xf0Var2 = xe0Var2.v;
                        if (xe0Var2.P <= 0 || xe0Var2.N == null) {
                            Bundle bundle = xe0Var2.S;
                            if (bundle != null && (tL_auth_sentCode = xe0Var2.T) != null) {
                                xg0Var2.g1(bundle, tL_auth_sentCode, true);
                                break;
                            } else {
                                int i152 = xe0Var2.E;
                                if (i152 != 4 && i152 != 2 && i152 != 11 && i152 != 15) {
                                    if (i152 == 3) {
                                        AndroidUtilities.setWaitingForSms(false);
                                        if (!xe0Var2.R && !xe0Var2.M && !xg0Var2.o0) {
                                            xe0Var2.M = true;
                                            xf0Var2.invalidate();
                                            xf0Var2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.I6, false));
                                            final Bundle bundle2 = new Bundle();
                                            bundle2.putString("phone", xe0Var2.J);
                                            bundle2.putString("ephone", xe0Var2.I);
                                            bundle2.putString("phoneFormated", xe0Var2.G);
                                            xe0Var2.R = true;
                                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                            tL_auth_resendCode.phone_number = xe0Var2.G;
                                            tL_auth_resendCode.phone_code_hash = xe0Var2.H;
                                            i142 = ((org.telegram.ui.ActionBar.p2) xg0Var2).currentAccount;
                                            final int i16 = 1;
                                            xg0Var2.n1(ConnectionsManager.getInstance(i142).sendRequest(tL_auth_resendCode, new RequestDelegate() { // from class: org.telegram.ui.re0
                                                @Override // org.telegram.tgnet.RequestDelegate
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    switch (i16) {
                                                        case 0:
                                                            AndroidUtilities.runOnUIThread(new te0(xe0Var2, tLObject, bundle2, tL_error));
                                                            break;
                                                        default:
                                                            AndroidUtilities.runOnUIThread(new te0(xe0Var2, tL_error, bundle2, tLObject));
                                                            break;
                                                    }
                                                }
                                            }, 10), true);
                                            break;
                                        }
                                    }
                                } else {
                                    xe0Var2.M = true;
                                    xf0Var2.invalidate();
                                    xf0Var2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.I6, false));
                                    xf0Var2.setTextSize(1, 15.0f);
                                    int i17 = xe0Var2.E;
                                    if (i17 == 4 || i17 == 11) {
                                        xf0Var2.setText(LocaleController.getString(R.string.Calling));
                                    } else {
                                        xf0Var2.setText(LocaleController.getString(R.string.SendingSms));
                                    }
                                    final Bundle bundle3 = new Bundle();
                                    bundle3.putString("phone", xe0Var2.J);
                                    bundle3.putString("ephone", xe0Var2.I);
                                    bundle3.putString("phoneFormated", xe0Var2.G);
                                    bundle3.putInt("prevType", xe0Var2.a);
                                    TLRPC.TL_auth_resendCode tL_auth_resendCode2 = new TLRPC.TL_auth_resendCode();
                                    tL_auth_resendCode2.phone_number = xe0Var2.G;
                                    tL_auth_resendCode2.phone_code_hash = xe0Var2.H;
                                    i132 = ((org.telegram.ui.ActionBar.p2) xg0Var2).currentAccount;
                                    final int i18 = 0;
                                    ConnectionsManager.getInstance(i132).sendRequest(tL_auth_resendCode2, new RequestDelegate() { // from class: org.telegram.ui.re0
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            switch (i18) {
                                                case 0:
                                                    AndroidUtilities.runOnUIThread(new te0(xe0Var2, tLObject, bundle3, tL_error));
                                                    break;
                                                default:
                                                    AndroidUtilities.runOnUIThread(new te0(xe0Var2, tL_error, bundle3, tLObject));
                                                    break;
                                            }
                                        }
                                    }, 10);
                                    break;
                                }
                            }
                        }
                        break;
                }
            }
        });
        hd0Var2.addView(t2Var2, w7.a6.d(-1, -2.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        hd0Var2.e(t2Var2);
        hd0Var2.addView(textView32, w7.a6.d(-2, 26.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.addView(hd0Var2, w7.a6.q(-1, -2, 1));
        addView(linearLayout2, w7.a6.t(-1, -2, 1, 16, 3, 16, 0));
        t2Var2.setOnEditorActionListener(new ja(this, 6));
        FrameLayout frameLayout3 = new FrameLayout(context);
        linearLayout2.addView(frameLayout3, w7.a6.n(-1, -2));
        org.telegram.ui.Components.voip.m2 m2Var2 = new org.telegram.ui.Components.voip.m2(xg0Var, context);
        this.d = m2Var2;
        int i132 = org.telegram.ui.ActionBar.j6.I6;
        m2Var2.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, i132, false));
        m2Var2.setTextColor(xg0Var.getThemedColor(i132));
        m2Var2.setTextSize(1, 14.0f);
        m2Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        m2Var2.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
        final int i142 = 1;
        m2Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ve0
            public final /* synthetic */ xe0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CharSequence charSequence;
                int i1322;
                int i1422;
                TLRPC.TL_auth_sentCode tL_auth_sentCode;
                switch (i142) {
                    case 0:
                        xe0 xe0Var = this.b;
                        bi.t2 t2Var22 = xe0Var.c;
                        try {
                            charSequence = ((ClipboardManager) xe0Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(xe0Var.getContext());
                        } catch (Exception e) {
                            FileLog.e(e);
                            charSequence = null;
                        }
                        if (charSequence != null) {
                            Editable text = t2Var22.getText();
                            xe0Var.y = true;
                            if (text != null) {
                                int max = Math.max(0, t2Var22.getSelectionStart());
                                text.replace(max, Math.max(max, t2Var22.getSelectionEnd()), charSequence);
                            }
                        }
                        xe0Var.q(true);
                        break;
                    case 1:
                        this.b.c(true);
                        break;
                    default:
                        final xe0 xe0Var2 = this.b;
                        xg0 xg0Var2 = xe0Var2.a0;
                        xf0 xf0Var2 = xe0Var2.v;
                        if (xe0Var2.P <= 0 || xe0Var2.N == null) {
                            Bundle bundle = xe0Var2.S;
                            if (bundle != null && (tL_auth_sentCode = xe0Var2.T) != null) {
                                xg0Var2.g1(bundle, tL_auth_sentCode, true);
                                break;
                            } else {
                                int i152 = xe0Var2.E;
                                if (i152 != 4 && i152 != 2 && i152 != 11 && i152 != 15) {
                                    if (i152 == 3) {
                                        AndroidUtilities.setWaitingForSms(false);
                                        if (!xe0Var2.R && !xe0Var2.M && !xg0Var2.o0) {
                                            xe0Var2.M = true;
                                            xf0Var2.invalidate();
                                            xf0Var2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.I6, false));
                                            final Bundle bundle2 = new Bundle();
                                            bundle2.putString("phone", xe0Var2.J);
                                            bundle2.putString("ephone", xe0Var2.I);
                                            bundle2.putString("phoneFormated", xe0Var2.G);
                                            xe0Var2.R = true;
                                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                            tL_auth_resendCode.phone_number = xe0Var2.G;
                                            tL_auth_resendCode.phone_code_hash = xe0Var2.H;
                                            i1422 = ((org.telegram.ui.ActionBar.p2) xg0Var2).currentAccount;
                                            final int i16 = 1;
                                            xg0Var2.n1(ConnectionsManager.getInstance(i1422).sendRequest(tL_auth_resendCode, new RequestDelegate() { // from class: org.telegram.ui.re0
                                                @Override // org.telegram.tgnet.RequestDelegate
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    switch (i16) {
                                                        case 0:
                                                            AndroidUtilities.runOnUIThread(new te0(xe0Var2, tLObject, bundle2, tL_error));
                                                            break;
                                                        default:
                                                            AndroidUtilities.runOnUIThread(new te0(xe0Var2, tL_error, bundle2, tLObject));
                                                            break;
                                                    }
                                                }
                                            }, 10), true);
                                            break;
                                        }
                                    }
                                } else {
                                    xe0Var2.M = true;
                                    xf0Var2.invalidate();
                                    xf0Var2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.I6, false));
                                    xf0Var2.setTextSize(1, 15.0f);
                                    int i17 = xe0Var2.E;
                                    if (i17 == 4 || i17 == 11) {
                                        xf0Var2.setText(LocaleController.getString(R.string.Calling));
                                    } else {
                                        xf0Var2.setText(LocaleController.getString(R.string.SendingSms));
                                    }
                                    final Bundle bundle3 = new Bundle();
                                    bundle3.putString("phone", xe0Var2.J);
                                    bundle3.putString("ephone", xe0Var2.I);
                                    bundle3.putString("phoneFormated", xe0Var2.G);
                                    bundle3.putInt("prevType", xe0Var2.a);
                                    TLRPC.TL_auth_resendCode tL_auth_resendCode2 = new TLRPC.TL_auth_resendCode();
                                    tL_auth_resendCode2.phone_number = xe0Var2.G;
                                    tL_auth_resendCode2.phone_code_hash = xe0Var2.H;
                                    i1322 = ((org.telegram.ui.ActionBar.p2) xg0Var2).currentAccount;
                                    final int i18 = 0;
                                    ConnectionsManager.getInstance(i1322).sendRequest(tL_auth_resendCode2, new RequestDelegate() { // from class: org.telegram.ui.re0
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            switch (i18) {
                                                case 0:
                                                    AndroidUtilities.runOnUIThread(new te0(xe0Var2, tLObject, bundle3, tL_error));
                                                    break;
                                                default:
                                                    AndroidUtilities.runOnUIThread(new te0(xe0Var2, tL_error, bundle3, tLObject));
                                                    break;
                                            }
                                        }
                                    }, 10);
                                    break;
                                }
                            }
                        }
                        break;
                }
            }
        });
        addView(m2Var2, w7.a6.t(-2, -2, 1, 0, 18, 0, 0));
        m2Var2.setVisibility(8);
        TextView textView42 = new TextView(context);
        this.e = textView42;
        textView42.setPivotX(0.0f);
        textView42.setPivotY(0.0f);
        textView42.setText(LocaleController.getString(z11 ? R.string.SMSWordError : R.string.SMSPhraseError));
        textView42.setTextColor(xg0Var.getThemedColor(org.telegram.ui.ActionBar.j6.p7));
        textView42.setTextSize(1, 13.0f);
        frameLayout3.addView(textView42, w7.a6.d(-1, -2.0f, 119, 16.0f, 8.0f, 16.0f, 8.0f));
        textView42.setAlpha(0.0f);
        textView42.setScaleX(0.8f);
        textView42.setScaleY(0.8f);
        textView42.setTranslationY(-AndroidUtilities.dp(4.0f));
        TextView textView52 = new TextView(context);
        this.f = textView52;
        textView52.setPivotX(0.0f);
        textView52.setPivotY(0.0f);
        textView52.setText(LocaleController.getString(z11 ? R.string.SMSWordPasteHint : R.string.SMSPhrasePasteHint));
        textView52.setTextColor(xg0Var.getThemedColor(org.telegram.ui.ActionBar.j6.y6));
        textView52.setTextSize(1, 13.0f);
        frameLayout3.addView(textView52, w7.a6.d(-1, -2.0f, 119, 16.0f, 8.0f, 16.0f, 8.0f));
        xf0 xf0Var2 = new xf0(this, context);
        this.v = xf0Var2;
        xf0Var2.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, i132, false));
        xf0Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        xf0Var2.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
        xf0Var2.setTextSize(1, 15.0f);
        xf0Var2.setGravity(19);
        final int i152 = 2;
        xf0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ve0
            public final /* synthetic */ xe0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CharSequence charSequence;
                int i1322;
                int i1422;
                TLRPC.TL_auth_sentCode tL_auth_sentCode;
                switch (i152) {
                    case 0:
                        xe0 xe0Var = this.b;
                        bi.t2 t2Var22 = xe0Var.c;
                        try {
                            charSequence = ((ClipboardManager) xe0Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(xe0Var.getContext());
                        } catch (Exception e) {
                            FileLog.e(e);
                            charSequence = null;
                        }
                        if (charSequence != null) {
                            Editable text = t2Var22.getText();
                            xe0Var.y = true;
                            if (text != null) {
                                int max = Math.max(0, t2Var22.getSelectionStart());
                                text.replace(max, Math.max(max, t2Var22.getSelectionEnd()), charSequence);
                            }
                        }
                        xe0Var.q(true);
                        break;
                    case 1:
                        this.b.c(true);
                        break;
                    default:
                        final xe0 xe0Var2 = this.b;
                        xg0 xg0Var2 = xe0Var2.a0;
                        xf0 xf0Var22 = xe0Var2.v;
                        if (xe0Var2.P <= 0 || xe0Var2.N == null) {
                            Bundle bundle = xe0Var2.S;
                            if (bundle != null && (tL_auth_sentCode = xe0Var2.T) != null) {
                                xg0Var2.g1(bundle, tL_auth_sentCode, true);
                                break;
                            } else {
                                int i1522 = xe0Var2.E;
                                if (i1522 != 4 && i1522 != 2 && i1522 != 11 && i1522 != 15) {
                                    if (i1522 == 3) {
                                        AndroidUtilities.setWaitingForSms(false);
                                        if (!xe0Var2.R && !xe0Var2.M && !xg0Var2.o0) {
                                            xe0Var2.M = true;
                                            xf0Var22.invalidate();
                                            xf0Var22.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.I6, false));
                                            final Bundle bundle2 = new Bundle();
                                            bundle2.putString("phone", xe0Var2.J);
                                            bundle2.putString("ephone", xe0Var2.I);
                                            bundle2.putString("phoneFormated", xe0Var2.G);
                                            xe0Var2.R = true;
                                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                            tL_auth_resendCode.phone_number = xe0Var2.G;
                                            tL_auth_resendCode.phone_code_hash = xe0Var2.H;
                                            i1422 = ((org.telegram.ui.ActionBar.p2) xg0Var2).currentAccount;
                                            final int i16 = 1;
                                            xg0Var2.n1(ConnectionsManager.getInstance(i1422).sendRequest(tL_auth_resendCode, new RequestDelegate() { // from class: org.telegram.ui.re0
                                                @Override // org.telegram.tgnet.RequestDelegate
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    switch (i16) {
                                                        case 0:
                                                            AndroidUtilities.runOnUIThread(new te0(xe0Var2, tLObject, bundle2, tL_error));
                                                            break;
                                                        default:
                                                            AndroidUtilities.runOnUIThread(new te0(xe0Var2, tL_error, bundle2, tLObject));
                                                            break;
                                                    }
                                                }
                                            }, 10), true);
                                            break;
                                        }
                                    }
                                } else {
                                    xe0Var2.M = true;
                                    xf0Var22.invalidate();
                                    xf0Var22.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.I6, false));
                                    xf0Var22.setTextSize(1, 15.0f);
                                    int i17 = xe0Var2.E;
                                    if (i17 == 4 || i17 == 11) {
                                        xf0Var22.setText(LocaleController.getString(R.string.Calling));
                                    } else {
                                        xf0Var22.setText(LocaleController.getString(R.string.SendingSms));
                                    }
                                    final Bundle bundle3 = new Bundle();
                                    bundle3.putString("phone", xe0Var2.J);
                                    bundle3.putString("ephone", xe0Var2.I);
                                    bundle3.putString("phoneFormated", xe0Var2.G);
                                    bundle3.putInt("prevType", xe0Var2.a);
                                    TLRPC.TL_auth_resendCode tL_auth_resendCode2 = new TLRPC.TL_auth_resendCode();
                                    tL_auth_resendCode2.phone_number = xe0Var2.G;
                                    tL_auth_resendCode2.phone_code_hash = xe0Var2.H;
                                    i1322 = ((org.telegram.ui.ActionBar.p2) xg0Var2).currentAccount;
                                    final int i18 = 0;
                                    ConnectionsManager.getInstance(i1322).sendRequest(tL_auth_resendCode2, new RequestDelegate() { // from class: org.telegram.ui.re0
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            switch (i18) {
                                                case 0:
                                                    AndroidUtilities.runOnUIThread(new te0(xe0Var2, tLObject, bundle3, tL_error));
                                                    break;
                                                default:
                                                    AndroidUtilities.runOnUIThread(new te0(xe0Var2, tL_error, bundle3, tLObject));
                                                    break;
                                            }
                                        }
                                    }, 10);
                                    break;
                                }
                            }
                        }
                        break;
                }
            }
        });
        FrameLayout frameLayout22 = new FrameLayout(context);
        frameLayout22.addView(xf0Var2, w7.a6.d(-1, 56.0f, 80, 6.0f, 0.0f, 60.0f, 28.0f));
        addView(frameLayout22, w7.a6.q(-1, -1, 80));
        og.u0.e(xf0Var2);
    }

    public static String u(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length && str.charAt(i10) <= ' ') {
            i10++;
        }
        return (i10 > 0 || length < str.length()) ? str.substring(i10, length) : str;
    }

    @Override // org.telegram.ui.Components.fw0
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Components.fw0
    public final boolean c(boolean z10) {
        xg0 xg0Var = this.a0;
        xg0Var.k1(true, true);
        int i10 = this.F;
        if (i10 != 0) {
            xg0Var.u1(i10, true, null, true);
            return false;
        }
        this.L = null;
        this.R = false;
        return true;
    }

    @Override // org.telegram.ui.Components.fw0
    public final void d() {
        this.R = false;
    }

    @Override // org.telegram.ui.Components.fw0
    public final void g() {
        AndroidUtilities.cancelRunOnUIThread(this.U);
    }

    @Override // org.telegram.ui.Components.fw0
    public String getHeaderName() {
        return LocaleController.getString("NewPassword", R.string.NewPassword);
    }

    @Override // org.telegram.ui.Components.fw0
    public final void h(String str) {
        if (this.R) {
            return;
        }
        String obj = this.c.getText().toString();
        if (obj.length() == 0) {
            s(false);
            return;
        }
        if (!p(obj)) {
            s(true);
            return;
        }
        this.R = true;
        TLRPC.TL_auth_signIn tL_auth_signIn = new TLRPC.TL_auth_signIn();
        tL_auth_signIn.phone_number = this.G;
        tL_auth_signIn.phone_code = obj;
        tL_auth_signIn.phone_code_hash = this.H;
        tL_auth_signIn.flags |= 1;
        xg0 xg0Var = this.a0;
        xg0Var.n1(xg0Var.getConnectionsManager().sendRequest(tL_auth_signIn, new qe0(this, tL_auth_signIn, 0), 10), true);
        xg0Var.v1(true, true);
    }

    @Override // org.telegram.ui.Components.fw0
    public final void i() {
        q(true);
    }

    @Override // org.telegram.ui.Components.fw0
    public final void j() {
        AndroidUtilities.runOnUIThread(new ue0(this, 3), xg0.t0);
    }

    @Override // org.telegram.ui.Components.fw0
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_word" + this.a);
        this.L = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
    }

    @Override // org.telegram.ui.Components.fw0
    public final void l(Bundle bundle) {
        if (this.L != null) {
            bundle.putBundle("recoveryview_word" + this.a, this.L);
        }
    }

    @Override // org.telegram.ui.Components.fw0
    public final void m(Bundle bundle, boolean z10) {
        xf0 xf0Var = this.v;
        if (bundle == null) {
            if (this.S == null || this.T == null) {
                return;
            }
            xf0Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.I6, false));
            int i10 = this.E;
            xf0Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(i10 == 17 ? R.string.ReturnEnteringPhrase : i10 == 16 ? R.string.ReturnEnteringWord : i10 == 3 ? R.string.ReturnPhoneCall : R.string.ReturnEnteringSMS), true, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f)));
            return;
        }
        bi.t2 t2Var = this.c;
        t2Var.setText("");
        this.L = bundle;
        this.K = null;
        this.E = bundle.getInt("nextType");
        this.F = bundle.getInt("prevType", 0);
        this.I = bundle.getString("ephone");
        if (this.L.containsKey("beginning")) {
            this.K = this.L.getString("beginning");
        }
        this.G = bundle.getString("phoneFormated");
        this.H = bundle.getString("phoneHash");
        this.J = this.L.getString("phone");
        this.P = bundle.getInt("timeout");
        int i11 = this.F;
        org.telegram.ui.Components.voip.m2 m2Var = this.d;
        if (i11 == 17) {
            m2Var.setVisibility(0);
            m2Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.BackEnteringPhrase), true, AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(1.0f)));
        } else if (i11 == 16) {
            m2Var.setVisibility(0);
            m2Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.BackEnteringWord), true, AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(1.0f)));
        } else if (i11 == 1 || i11 == 2 || i11 == 4 || i11 == 3 || i11 == 15) {
            m2Var.setVisibility(0);
            m2Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.BackEnteringCode), true, AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(1.0f)));
        } else {
            m2Var.setVisibility(8);
        }
        this.S = null;
        this.T = null;
        this.R = false;
        this.M = false;
        xg0 xg0Var = this.a0;
        xg0Var.o0 = false;
        xf0Var.invalidate();
        boolean z11 = this.a != 16;
        String str = "+" + gf.b.c().b(gf.b.d(this.J, false));
        String str2 = this.K;
        TextView textView = this.r;
        if (str2 == null) {
            org.telegram.messenger.em.p(!z11 ? R.string.SMSWordText : R.string.SMSPhraseText, new Object[]{str}, textView);
        } else {
            org.telegram.messenger.em.p(!z11 ? R.string.SMSWordBeginningText : R.string.SMSPhraseBeginningText, new Object[]{str, str2}, textView);
        }
        xg0.T0(xg0Var, t2Var);
        t2Var.requestFocus();
        org.telegram.ui.Components.kj0 kj0Var = this.h;
        if (kj0Var.getAnimatedDrawable() != null) {
            kj0Var.getAnimatedDrawable().N(0, false, false);
        }
        AndroidUtilities.runOnUIThread(new i10(kj0Var, 20), 500L);
        q(false);
        o(false);
        this.Q = System.currentTimeMillis();
        int i12 = org.telegram.ui.ActionBar.j6.y6;
        xf0Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        int i13 = this.E;
        if (i13 != 2 && i13 != 4 && i13 != 3) {
            xf0Var.setVisibility(8);
            return;
        }
        if (this.N != null) {
            return;
        }
        xf0Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        xf0Var.setTag(R.id.color_key_tag, Integer.valueOf(i12));
        Timer timer = new Timer();
        this.N = timer;
        timer.schedule(new we0(this), 0L, 1000L);
    }

    @Override // org.telegram.ui.Components.fw0
    public final void n() {
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        xg0 xg0Var = this.a0;
        this.n.setTextColor(xg0Var.getThemedColor(i10));
        this.r.setTextColor(xg0Var.getThemedColor(org.telegram.ui.ActionBar.j6.D6));
        int themedColor = xg0Var.getThemedColor(i10);
        bi.t2 t2Var = this.c;
        t2Var.setTextColor(themedColor);
        t2Var.setCursorColor(xg0Var.getThemedColor(org.telegram.ui.ActionBar.j6.l6));
        t2Var.setHintTextColor(xg0Var.getThemedColor(org.telegram.ui.ActionBar.j6.H6));
        this.b.f();
    }

    public final void o(boolean z10) {
        this.x = z10;
        float f7 = 0.0f;
        float f10 = z10 ? 1.0f : 0.0f;
        this.b.a(f10);
        float f11 = (f10 * 0.1f) + 0.9f;
        ViewPropertyAnimator translationY = this.e.animate().scaleX(f11).scaleY(f11).alpha(f10).translationY((1.0f - f10) * AndroidUtilities.dp(-5.0f));
        org.telegram.ui.Components.wr wrVar = org.telegram.ui.Components.wr.h;
        org.telegram.messenger.em.q(translationY, wrVar, 290L);
        if (this.w && !this.x) {
            f7 = 1.0f;
        }
        float f12 = (0.1f * f7) + 0.9f;
        this.f.animate().scaleX(f12).scaleY(f12).alpha(f7).translationY((1.0f - f7) * AndroidUtilities.dp(this.x ? 5.0f : -5.0f)).setInterpolator(wrVar).setDuration(290L).start();
    }

    public final boolean p(String str) {
        if (this.K == null) {
            return true;
        }
        String lowerCase = u(str).toLowerCase();
        String lowerCase2 = this.K.toLowerCase();
        int min = Math.min(lowerCase.length(), lowerCase2.length());
        if (min <= 0) {
            return true;
        }
        return TextUtils.equals(lowerCase.substring(0, min), lowerCase2.substring(0, min));
    }

    public final void q(boolean z10) {
        ue0 ue0Var = this.U;
        AndroidUtilities.cancelRunOnUIThread(ue0Var);
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        boolean z11 = TextUtils.isEmpty(this.c.getText()) && clipboardManager != null && clipboardManager.hasPrimaryClip();
        if (this.w != z11) {
            this.w = z11;
            float f7 = 0.9f;
            TextView textView = this.s;
            TextView textView2 = this.f;
            float f10 = 0.0f;
            if (z10) {
                ViewPropertyAnimator scaleY = textView.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.7f).scaleY(z11 ? 1.0f : 0.7f);
                org.telegram.ui.Components.wr wrVar = org.telegram.ui.Components.wr.h;
                scaleY.setInterpolator(wrVar).setDuration(300L).start();
                ViewPropertyAnimator scaleX = textView2.animate().scaleX((!this.w || this.x) ? 0.9f : 1.0f);
                if (this.w && !this.x) {
                    f7 = 1.0f;
                }
                ViewPropertyAnimator alpha = scaleX.scaleY(f7).alpha((!this.w || this.x) ? 0.0f : 1.0f);
                if (!this.w || this.x) {
                    f10 = AndroidUtilities.dp(this.x ? 5.0f : -5.0f);
                }
                alpha.translationY(f10).setInterpolator(wrVar).setDuration(300L).start();
            } else {
                textView.setAlpha(z11 ? 1.0f : 0.0f);
                textView.setScaleX(z11 ? 1.0f : 0.7f);
                textView.setScaleY(z11 ? 1.0f : 0.7f);
                textView2.setScaleX((!this.w || this.x) ? 0.9f : 1.0f);
                if (this.w && !this.x) {
                    f7 = 1.0f;
                }
                textView2.setScaleY(f7);
                textView2.setAlpha((!this.w || this.x) ? 0.0f : 1.0f);
                if (!this.w || this.x) {
                    f10 = AndroidUtilities.dp(this.x ? 5.0f : -5.0f);
                }
                textView2.setTranslationY(f10);
            }
        }
        AndroidUtilities.runOnUIThread(ue0Var, 5000L);
    }

    public final void r() {
        xf0 xf0Var = this.v;
        int i10 = org.telegram.ui.ActionBar.j6.y6;
        xf0Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        this.v.setTag(R.id.color_key_tag, Integer.valueOf(i10));
        try {
            synchronized (this.O) {
                try {
                    Timer timer = this.N;
                    if (timer != null) {
                        timer.cancel();
                        this.N = null;
                    }
                } finally {
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void s(boolean z10) {
        bi.t2 t2Var = this.c;
        if (this.a0.getParentActivity() == null) {
            return;
        }
        try {
            t2Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        boolean z11 = this.a != 16;
        TextView textView = this.e;
        if (z10) {
            textView.setText(LocaleController.getString(!z11 ? R.string.SMSWordBeginningError : R.string.SMSPhraseBeginningError));
        } else if (TextUtils.isEmpty(t2Var.getText())) {
            textView.setText("");
        } else {
            textView.setText(LocaleController.getString(!z11 ? R.string.SMSWordError : R.string.SMSPhraseError));
        }
        if (!this.x && !this.y) {
            AndroidUtilities.shakeViewSpring(t2Var, this.W);
            AndroidUtilities.shakeViewSpring(textView, this.W);
        }
        ue0 ue0Var = this.V;
        AndroidUtilities.cancelRunOnUIThread(ue0Var);
        o(true);
        AndroidUtilities.runOnUIThread(ue0Var, 10000L);
        this.W = -this.W;
    }
}
