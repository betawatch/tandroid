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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class xe0 extends org.telegram.ui.Components.tv0 {
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
    public final /* synthetic */ wg0 a0;
    public final org.telegram.ui.Components.zc0 b;
    public final di.h2 c;
    public final org.telegram.ui.Components.voip.l2 d;
    public final TextView e;
    public final TextView f;
    public final org.telegram.ui.Components.aj0 h;
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
    public xe0(wg0 wg0Var, Context context, int i10) {
        super(context);
        boolean z10;
        org.telegram.ui.ActionBar.f6 f6Var;
        this.a0 = wg0Var;
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
        org.telegram.ui.Components.aj0 aj0Var = new org.telegram.ui.Components.aj0(context);
        this.h = aj0Var;
        aj0Var.setScaleType(ImageView.ScaleType.CENTER);
        aj0Var.f(R.raw.bubble, 95, 95, null);
        if (!AndroidUtilities.isSmallScreen()) {
            Point point = AndroidUtilities.displaySize;
            if (point.x <= point.y || AndroidUtilities.isTablet()) {
                z10 = false;
                aj0Var.setVisibility(!z10 ? 8 : 0);
                addView(aj0Var, w7.x5.t(95, 95, 1, 0, 10, 0, 5));
                TextView textView = new TextView(context);
                this.n = textView;
                textView.setTextSize(1, 18.0f);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                textView.setGravity(49);
                textView.setText(LocaleController.getString(z11 ? R.string.SMSWordTitle : R.string.SMSPhraseTitle));
                addView(textView, w7.x5.t(-2, -2, 1, 8, !z10 ? 25 : 0, 8, 0));
                TextView textView2 = new TextView(context);
                this.r = textView2;
                textView2.setTextSize(1, 14.0f);
                textView2.setGravity(1);
                textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                addView(textView2, w7.x5.t(-2, -2, 1, 8, 5, 8, 16));
                org.telegram.ui.Components.zc0 zc0Var = new org.telegram.ui.Components.zc0(context, null);
                this.b = zc0Var;
                zc0Var.setText(LocaleController.getString(z11 ? R.string.SMSWord : R.string.SMSPhrase));
                di.h2 h2Var = new di.h2(this, context, 8);
                this.c = h2Var;
                h2Var.setSingleLine();
                h2Var.setLines(1);
                h2Var.setCursorSize(AndroidUtilities.dp(20.0f));
                h2Var.setCursorWidth(1.5f);
                h2Var.setImeOptions(268435461);
                h2Var.setTextSize(1, 18.0f);
                h2Var.setMaxLines(1);
                h2Var.setBackground(null);
                h2Var.setHint(LocaleController.getString(z11 ? R.string.SMSWordHint : R.string.SMSPhraseHint));
                h2Var.addTextChangedListener(new org.telegram.ui.Cells.h3(this));
                h2Var.setEllipsizeByGradient(true);
                h2Var.setInputType(1);
                h2Var.setTypeface(Typeface.DEFAULT);
                h2Var.setGravity(!LocaleController.isRTL ? 5 : 3);
                h2Var.setOnFocusChangeListener(new pd(this, 5));
                TextView textView3 = new TextView(context);
                this.s = textView3;
                com.google.android.gms.internal.vision.e2.m(12.0f, 1, textView3);
                textView3.setPadding(org.telegram.ui.Cells.p6.b(10.0f, R.string.Paste, textView3), 0, AndroidUtilities.dp(10.0f), 0);
                textView3.setGravity(17);
                int i11 = org.telegram.ui.ActionBar.j6.o6;
                f6Var = ((org.telegram.ui.ActionBar.n2) wg0Var).resourceProvider;
                int v02 = org.telegram.ui.ActionBar.j6.v0(i11, f6Var);
                textView3.setTextColor(v02);
                int dp = AndroidUtilities.dp(6.0f);
                int l1 = org.telegram.ui.ActionBar.j6.l1(0.12f, v02);
                int l12 = org.telegram.ui.ActionBar.j6.l1(0.15f, v02);
                textView3.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, l1, l12, l12));
                w7.z5.b(textView3, 0.1f, 1.5f);
                h2Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.34f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.34f));
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
                                di.h2 h2Var2 = xe0Var.c;
                                try {
                                    charSequence = ((ClipboardManager) xe0Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(xe0Var.getContext());
                                } catch (Exception e7) {
                                    FileLog.e(e7);
                                    charSequence = null;
                                }
                                if (charSequence != null) {
                                    Editable text = h2Var2.getText();
                                    xe0Var.y = true;
                                    if (text != null) {
                                        int max = Math.max(0, h2Var2.getSelectionStart());
                                        text.replace(max, Math.max(max, h2Var2.getSelectionEnd()), charSequence);
                                    }
                                }
                                xe0Var.q(true);
                                break;
                            case 1:
                                this.b.c(true);
                                break;
                            default:
                                final xe0 xe0Var2 = this.b;
                                wg0 wg0Var2 = xe0Var2.a0;
                                xf0 xf0Var = xe0Var2.v;
                                if (xe0Var2.P <= 0 || xe0Var2.N == null) {
                                    Bundle bundle = xe0Var2.S;
                                    if (bundle != null && (tL_auth_sentCode = xe0Var2.T) != null) {
                                        wg0Var2.g1(bundle, tL_auth_sentCode, true);
                                        break;
                                    } else {
                                        int i15 = xe0Var2.E;
                                        if (i15 != 4 && i15 != 2 && i15 != 11 && i15 != 15) {
                                            if (i15 == 3) {
                                                AndroidUtilities.setWaitingForSms(false);
                                                if (!xe0Var2.R && !xe0Var2.M && !wg0Var2.o0) {
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
                                                    i14 = ((org.telegram.ui.ActionBar.n2) wg0Var2).currentAccount;
                                                    final int i16 = 1;
                                                    wg0Var2.n1(ConnectionsManager.getInstance(i14).sendRequest(tL_auth_resendCode, new RequestDelegate() { // from class: org.telegram.ui.re0
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
                                            i13 = ((org.telegram.ui.ActionBar.n2) wg0Var2).currentAccount;
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
                zc0Var.addView(h2Var, w7.x5.d(-1, -2.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
                zc0Var.e(h2Var);
                zc0Var.addView(textView3, w7.x5.d(-2, 26.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.addView(zc0Var, w7.x5.q(-1, -2, 1));
                addView(linearLayout, w7.x5.t(-1, -2, 1, 16, 3, 16, 0));
                h2Var.setOnEditorActionListener(new ia(this, 6));
                FrameLayout frameLayout = new FrameLayout(context);
                linearLayout.addView(frameLayout, w7.x5.n(-1, -2));
                org.telegram.ui.Components.voip.l2 l2Var = new org.telegram.ui.Components.voip.l2(wg0Var, context);
                this.d = l2Var;
                int i13 = org.telegram.ui.ActionBar.j6.I6;
                l2Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
                l2Var.setTextColor(wg0Var.getThemedColor(i13));
                l2Var.setTextSize(1, 14.0f);
                l2Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                l2Var.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
                final int i14 = 1;
                l2Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ve0
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
                                di.h2 h2Var2 = xe0Var.c;
                                try {
                                    charSequence = ((ClipboardManager) xe0Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(xe0Var.getContext());
                                } catch (Exception e7) {
                                    FileLog.e(e7);
                                    charSequence = null;
                                }
                                if (charSequence != null) {
                                    Editable text = h2Var2.getText();
                                    xe0Var.y = true;
                                    if (text != null) {
                                        int max = Math.max(0, h2Var2.getSelectionStart());
                                        text.replace(max, Math.max(max, h2Var2.getSelectionEnd()), charSequence);
                                    }
                                }
                                xe0Var.q(true);
                                break;
                            case 1:
                                this.b.c(true);
                                break;
                            default:
                                final xe0 xe0Var2 = this.b;
                                wg0 wg0Var2 = xe0Var2.a0;
                                xf0 xf0Var = xe0Var2.v;
                                if (xe0Var2.P <= 0 || xe0Var2.N == null) {
                                    Bundle bundle = xe0Var2.S;
                                    if (bundle != null && (tL_auth_sentCode = xe0Var2.T) != null) {
                                        wg0Var2.g1(bundle, tL_auth_sentCode, true);
                                        break;
                                    } else {
                                        int i15 = xe0Var2.E;
                                        if (i15 != 4 && i15 != 2 && i15 != 11 && i15 != 15) {
                                            if (i15 == 3) {
                                                AndroidUtilities.setWaitingForSms(false);
                                                if (!xe0Var2.R && !xe0Var2.M && !wg0Var2.o0) {
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
                                                    i142 = ((org.telegram.ui.ActionBar.n2) wg0Var2).currentAccount;
                                                    final int i16 = 1;
                                                    wg0Var2.n1(ConnectionsManager.getInstance(i142).sendRequest(tL_auth_resendCode, new RequestDelegate() { // from class: org.telegram.ui.re0
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
                                            i132 = ((org.telegram.ui.ActionBar.n2) wg0Var2).currentAccount;
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
                addView(l2Var, w7.x5.t(-2, -2, 1, 0, 18, 0, 0));
                l2Var.setVisibility(8);
                TextView textView4 = new TextView(context);
                this.e = textView4;
                textView4.setPivotX(0.0f);
                textView4.setPivotY(0.0f);
                textView4.setText(LocaleController.getString(z11 ? R.string.SMSWordError : R.string.SMSPhraseError));
                textView4.setTextColor(wg0Var.getThemedColor(org.telegram.ui.ActionBar.j6.p7));
                textView4.setTextSize(1, 13.0f);
                frameLayout.addView(textView4, w7.x5.d(-1, -2.0f, 119, 16.0f, 8.0f, 16.0f, 8.0f));
                textView4.setAlpha(0.0f);
                textView4.setScaleX(0.8f);
                textView4.setScaleY(0.8f);
                textView4.setTranslationY(-AndroidUtilities.dp(4.0f));
                TextView textView5 = new TextView(context);
                this.f = textView5;
                textView5.setPivotX(0.0f);
                textView5.setPivotY(0.0f);
                textView5.setText(LocaleController.getString(z11 ? R.string.SMSWordPasteHint : R.string.SMSPhrasePasteHint));
                textView5.setTextColor(wg0Var.getThemedColor(org.telegram.ui.ActionBar.j6.y6));
                textView5.setTextSize(1, 13.0f);
                frameLayout.addView(textView5, w7.x5.d(-1, -2.0f, 119, 16.0f, 8.0f, 16.0f, 8.0f));
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
                                di.h2 h2Var2 = xe0Var.c;
                                try {
                                    charSequence = ((ClipboardManager) xe0Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(xe0Var.getContext());
                                } catch (Exception e7) {
                                    FileLog.e(e7);
                                    charSequence = null;
                                }
                                if (charSequence != null) {
                                    Editable text = h2Var2.getText();
                                    xe0Var.y = true;
                                    if (text != null) {
                                        int max = Math.max(0, h2Var2.getSelectionStart());
                                        text.replace(max, Math.max(max, h2Var2.getSelectionEnd()), charSequence);
                                    }
                                }
                                xe0Var.q(true);
                                break;
                            case 1:
                                this.b.c(true);
                                break;
                            default:
                                final xe0 xe0Var2 = this.b;
                                wg0 wg0Var2 = xe0Var2.a0;
                                xf0 xf0Var2 = xe0Var2.v;
                                if (xe0Var2.P <= 0 || xe0Var2.N == null) {
                                    Bundle bundle = xe0Var2.S;
                                    if (bundle != null && (tL_auth_sentCode = xe0Var2.T) != null) {
                                        wg0Var2.g1(bundle, tL_auth_sentCode, true);
                                        break;
                                    } else {
                                        int i152 = xe0Var2.E;
                                        if (i152 != 4 && i152 != 2 && i152 != 11 && i152 != 15) {
                                            if (i152 == 3) {
                                                AndroidUtilities.setWaitingForSms(false);
                                                if (!xe0Var2.R && !xe0Var2.M && !wg0Var2.o0) {
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
                                                    i142 = ((org.telegram.ui.ActionBar.n2) wg0Var2).currentAccount;
                                                    final int i16 = 1;
                                                    wg0Var2.n1(ConnectionsManager.getInstance(i142).sendRequest(tL_auth_resendCode, new RequestDelegate() { // from class: org.telegram.ui.re0
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
                                            i132 = ((org.telegram.ui.ActionBar.n2) wg0Var2).currentAccount;
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
                frameLayout2.addView(xf0Var, w7.x5.d(-1, 56.0f, 80, 6.0f, 0.0f, 60.0f, 28.0f));
                addView(frameLayout2, w7.x5.q(-1, -1, 80));
                n7.z0.g(xf0Var);
            }
        }
        z10 = true;
        aj0Var.setVisibility(!z10 ? 8 : 0);
        addView(aj0Var, w7.x5.t(95, 95, 1, 0, 10, 0, 5));
        TextView textView6 = new TextView(context);
        this.n = textView6;
        textView6.setTextSize(1, 18.0f);
        textView6.setTypeface(AndroidUtilities.bold());
        textView6.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView6.setGravity(49);
        textView6.setText(LocaleController.getString(z11 ? R.string.SMSWordTitle : R.string.SMSPhraseTitle));
        addView(textView6, w7.x5.t(-2, -2, 1, 8, !z10 ? 25 : 0, 8, 0));
        TextView textView22 = new TextView(context);
        this.r = textView22;
        textView22.setTextSize(1, 14.0f);
        textView22.setGravity(1);
        textView22.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView22, w7.x5.t(-2, -2, 1, 8, 5, 8, 16));
        org.telegram.ui.Components.zc0 zc0Var2 = new org.telegram.ui.Components.zc0(context, null);
        this.b = zc0Var2;
        zc0Var2.setText(LocaleController.getString(z11 ? R.string.SMSWord : R.string.SMSPhrase));
        di.h2 h2Var2 = new di.h2(this, context, 8);
        this.c = h2Var2;
        h2Var2.setSingleLine();
        h2Var2.setLines(1);
        h2Var2.setCursorSize(AndroidUtilities.dp(20.0f));
        h2Var2.setCursorWidth(1.5f);
        h2Var2.setImeOptions(268435461);
        h2Var2.setTextSize(1, 18.0f);
        h2Var2.setMaxLines(1);
        h2Var2.setBackground(null);
        h2Var2.setHint(LocaleController.getString(z11 ? R.string.SMSWordHint : R.string.SMSPhraseHint));
        h2Var2.addTextChangedListener(new org.telegram.ui.Cells.h3(this));
        h2Var2.setEllipsizeByGradient(true);
        h2Var2.setInputType(1);
        h2Var2.setTypeface(Typeface.DEFAULT);
        h2Var2.setGravity(!LocaleController.isRTL ? 5 : 3);
        h2Var2.setOnFocusChangeListener(new pd(this, 5));
        TextView textView32 = new TextView(context);
        this.s = textView32;
        com.google.android.gms.internal.vision.e2.m(12.0f, 1, textView32);
        textView32.setPadding(org.telegram.ui.Cells.p6.b(10.0f, R.string.Paste, textView32), 0, AndroidUtilities.dp(10.0f), 0);
        textView32.setGravity(17);
        int i112 = org.telegram.ui.ActionBar.j6.o6;
        f6Var = ((org.telegram.ui.ActionBar.n2) wg0Var).resourceProvider;
        int v022 = org.telegram.ui.ActionBar.j6.v0(i112, f6Var);
        textView32.setTextColor(v022);
        int dp2 = AndroidUtilities.dp(6.0f);
        int l13 = org.telegram.ui.ActionBar.j6.l1(0.12f, v022);
        int l122 = org.telegram.ui.ActionBar.j6.l1(0.15f, v022);
        textView32.setBackground(org.telegram.ui.ActionBar.j6.i0(dp2, dp2, dp2, dp2, l13, l122, l122));
        w7.z5.b(textView32, 0.1f, 1.5f);
        h2Var2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.34f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.34f));
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
                        di.h2 h2Var22 = xe0Var.c;
                        try {
                            charSequence = ((ClipboardManager) xe0Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(xe0Var.getContext());
                        } catch (Exception e7) {
                            FileLog.e(e7);
                            charSequence = null;
                        }
                        if (charSequence != null) {
                            Editable text = h2Var22.getText();
                            xe0Var.y = true;
                            if (text != null) {
                                int max = Math.max(0, h2Var22.getSelectionStart());
                                text.replace(max, Math.max(max, h2Var22.getSelectionEnd()), charSequence);
                            }
                        }
                        xe0Var.q(true);
                        break;
                    case 1:
                        this.b.c(true);
                        break;
                    default:
                        final xe0 xe0Var2 = this.b;
                        wg0 wg0Var2 = xe0Var2.a0;
                        xf0 xf0Var2 = xe0Var2.v;
                        if (xe0Var2.P <= 0 || xe0Var2.N == null) {
                            Bundle bundle = xe0Var2.S;
                            if (bundle != null && (tL_auth_sentCode = xe0Var2.T) != null) {
                                wg0Var2.g1(bundle, tL_auth_sentCode, true);
                                break;
                            } else {
                                int i152 = xe0Var2.E;
                                if (i152 != 4 && i152 != 2 && i152 != 11 && i152 != 15) {
                                    if (i152 == 3) {
                                        AndroidUtilities.setWaitingForSms(false);
                                        if (!xe0Var2.R && !xe0Var2.M && !wg0Var2.o0) {
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
                                            i142 = ((org.telegram.ui.ActionBar.n2) wg0Var2).currentAccount;
                                            final int i16 = 1;
                                            wg0Var2.n1(ConnectionsManager.getInstance(i142).sendRequest(tL_auth_resendCode, new RequestDelegate() { // from class: org.telegram.ui.re0
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
                                    i132 = ((org.telegram.ui.ActionBar.n2) wg0Var2).currentAccount;
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
        zc0Var2.addView(h2Var2, w7.x5.d(-1, -2.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        zc0Var2.e(h2Var2);
        zc0Var2.addView(textView32, w7.x5.d(-2, 26.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.addView(zc0Var2, w7.x5.q(-1, -2, 1));
        addView(linearLayout2, w7.x5.t(-1, -2, 1, 16, 3, 16, 0));
        h2Var2.setOnEditorActionListener(new ia(this, 6));
        FrameLayout frameLayout3 = new FrameLayout(context);
        linearLayout2.addView(frameLayout3, w7.x5.n(-1, -2));
        org.telegram.ui.Components.voip.l2 l2Var2 = new org.telegram.ui.Components.voip.l2(wg0Var, context);
        this.d = l2Var2;
        int i132 = org.telegram.ui.ActionBar.j6.I6;
        l2Var2.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, i132, false));
        l2Var2.setTextColor(wg0Var.getThemedColor(i132));
        l2Var2.setTextSize(1, 14.0f);
        l2Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        l2Var2.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
        final int i142 = 1;
        l2Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ve0
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
                        di.h2 h2Var22 = xe0Var.c;
                        try {
                            charSequence = ((ClipboardManager) xe0Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(xe0Var.getContext());
                        } catch (Exception e7) {
                            FileLog.e(e7);
                            charSequence = null;
                        }
                        if (charSequence != null) {
                            Editable text = h2Var22.getText();
                            xe0Var.y = true;
                            if (text != null) {
                                int max = Math.max(0, h2Var22.getSelectionStart());
                                text.replace(max, Math.max(max, h2Var22.getSelectionEnd()), charSequence);
                            }
                        }
                        xe0Var.q(true);
                        break;
                    case 1:
                        this.b.c(true);
                        break;
                    default:
                        final xe0 xe0Var2 = this.b;
                        wg0 wg0Var2 = xe0Var2.a0;
                        xf0 xf0Var2 = xe0Var2.v;
                        if (xe0Var2.P <= 0 || xe0Var2.N == null) {
                            Bundle bundle = xe0Var2.S;
                            if (bundle != null && (tL_auth_sentCode = xe0Var2.T) != null) {
                                wg0Var2.g1(bundle, tL_auth_sentCode, true);
                                break;
                            } else {
                                int i152 = xe0Var2.E;
                                if (i152 != 4 && i152 != 2 && i152 != 11 && i152 != 15) {
                                    if (i152 == 3) {
                                        AndroidUtilities.setWaitingForSms(false);
                                        if (!xe0Var2.R && !xe0Var2.M && !wg0Var2.o0) {
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
                                            i1422 = ((org.telegram.ui.ActionBar.n2) wg0Var2).currentAccount;
                                            final int i16 = 1;
                                            wg0Var2.n1(ConnectionsManager.getInstance(i1422).sendRequest(tL_auth_resendCode, new RequestDelegate() { // from class: org.telegram.ui.re0
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
                                    i1322 = ((org.telegram.ui.ActionBar.n2) wg0Var2).currentAccount;
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
        addView(l2Var2, w7.x5.t(-2, -2, 1, 0, 18, 0, 0));
        l2Var2.setVisibility(8);
        TextView textView42 = new TextView(context);
        this.e = textView42;
        textView42.setPivotX(0.0f);
        textView42.setPivotY(0.0f);
        textView42.setText(LocaleController.getString(z11 ? R.string.SMSWordError : R.string.SMSPhraseError));
        textView42.setTextColor(wg0Var.getThemedColor(org.telegram.ui.ActionBar.j6.p7));
        textView42.setTextSize(1, 13.0f);
        frameLayout3.addView(textView42, w7.x5.d(-1, -2.0f, 119, 16.0f, 8.0f, 16.0f, 8.0f));
        textView42.setAlpha(0.0f);
        textView42.setScaleX(0.8f);
        textView42.setScaleY(0.8f);
        textView42.setTranslationY(-AndroidUtilities.dp(4.0f));
        TextView textView52 = new TextView(context);
        this.f = textView52;
        textView52.setPivotX(0.0f);
        textView52.setPivotY(0.0f);
        textView52.setText(LocaleController.getString(z11 ? R.string.SMSWordPasteHint : R.string.SMSPhrasePasteHint));
        textView52.setTextColor(wg0Var.getThemedColor(org.telegram.ui.ActionBar.j6.y6));
        textView52.setTextSize(1, 13.0f);
        frameLayout3.addView(textView52, w7.x5.d(-1, -2.0f, 119, 16.0f, 8.0f, 16.0f, 8.0f));
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
                        di.h2 h2Var22 = xe0Var.c;
                        try {
                            charSequence = ((ClipboardManager) xe0Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(xe0Var.getContext());
                        } catch (Exception e7) {
                            FileLog.e(e7);
                            charSequence = null;
                        }
                        if (charSequence != null) {
                            Editable text = h2Var22.getText();
                            xe0Var.y = true;
                            if (text != null) {
                                int max = Math.max(0, h2Var22.getSelectionStart());
                                text.replace(max, Math.max(max, h2Var22.getSelectionEnd()), charSequence);
                            }
                        }
                        xe0Var.q(true);
                        break;
                    case 1:
                        this.b.c(true);
                        break;
                    default:
                        final xe0 xe0Var2 = this.b;
                        wg0 wg0Var2 = xe0Var2.a0;
                        xf0 xf0Var22 = xe0Var2.v;
                        if (xe0Var2.P <= 0 || xe0Var2.N == null) {
                            Bundle bundle = xe0Var2.S;
                            if (bundle != null && (tL_auth_sentCode = xe0Var2.T) != null) {
                                wg0Var2.g1(bundle, tL_auth_sentCode, true);
                                break;
                            } else {
                                int i1522 = xe0Var2.E;
                                if (i1522 != 4 && i1522 != 2 && i1522 != 11 && i1522 != 15) {
                                    if (i1522 == 3) {
                                        AndroidUtilities.setWaitingForSms(false);
                                        if (!xe0Var2.R && !xe0Var2.M && !wg0Var2.o0) {
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
                                            i1422 = ((org.telegram.ui.ActionBar.n2) wg0Var2).currentAccount;
                                            final int i16 = 1;
                                            wg0Var2.n1(ConnectionsManager.getInstance(i1422).sendRequest(tL_auth_resendCode, new RequestDelegate() { // from class: org.telegram.ui.re0
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
                                    i1322 = ((org.telegram.ui.ActionBar.n2) wg0Var2).currentAccount;
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
        frameLayout22.addView(xf0Var2, w7.x5.d(-1, 56.0f, 80, 6.0f, 0.0f, 60.0f, 28.0f));
        addView(frameLayout22, w7.x5.q(-1, -1, 80));
        n7.z0.g(xf0Var2);
    }

    public static String u(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length && str.charAt(i10) <= ' ') {
            i10++;
        }
        return (i10 > 0 || length < str.length()) ? str.substring(i10, length) : str;
    }

    @Override // org.telegram.ui.Components.tv0
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Components.tv0
    public final boolean c(boolean z10) {
        wg0 wg0Var = this.a0;
        wg0Var.k1(true, true);
        int i10 = this.F;
        if (i10 != 0) {
            wg0Var.u1(i10, true, null, true);
            return false;
        }
        this.L = null;
        this.R = false;
        return true;
    }

    @Override // org.telegram.ui.Components.tv0
    public final void d() {
        this.R = false;
    }

    @Override // org.telegram.ui.Components.tv0
    public final void g() {
        AndroidUtilities.cancelRunOnUIThread(this.U);
    }

    @Override // org.telegram.ui.Components.tv0
    public String getHeaderName() {
        return LocaleController.getString("NewPassword", R.string.NewPassword);
    }

    @Override // org.telegram.ui.Components.tv0
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
        wg0 wg0Var = this.a0;
        wg0Var.n1(wg0Var.getConnectionsManager().sendRequest(tL_auth_signIn, new qe0(this, tL_auth_signIn, 0), 10), true);
        wg0Var.v1(true, true);
    }

    @Override // org.telegram.ui.Components.tv0
    public final void i() {
        q(true);
    }

    @Override // org.telegram.ui.Components.tv0
    public final void j() {
        AndroidUtilities.runOnUIThread(new ue0(this, 3), wg0.t0);
    }

    @Override // org.telegram.ui.Components.tv0
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_word" + this.a);
        this.L = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
    }

    @Override // org.telegram.ui.Components.tv0
    public final void l(Bundle bundle) {
        if (this.L != null) {
            bundle.putBundle("recoveryview_word" + this.a, this.L);
        }
    }

    @Override // org.telegram.ui.Components.tv0
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
        di.h2 h2Var = this.c;
        h2Var.setText("");
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
        org.telegram.ui.Components.voip.l2 l2Var = this.d;
        if (i11 == 17) {
            l2Var.setVisibility(0);
            l2Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.BackEnteringPhrase), true, AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(1.0f)));
        } else if (i11 == 16) {
            l2Var.setVisibility(0);
            l2Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.BackEnteringWord), true, AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(1.0f)));
        } else if (i11 == 1 || i11 == 2 || i11 == 4 || i11 == 3 || i11 == 15) {
            l2Var.setVisibility(0);
            l2Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.BackEnteringCode), true, AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(1.0f)));
        } else {
            l2Var.setVisibility(8);
        }
        this.S = null;
        this.T = null;
        this.R = false;
        this.M = false;
        wg0 wg0Var = this.a0;
        wg0Var.o0 = false;
        xf0Var.invalidate();
        boolean z11 = this.a != 16;
        String str = "+" + gf.b.c().b(gf.b.d(this.J, false));
        String str2 = this.K;
        TextView textView = this.r;
        if (str2 == null) {
            org.telegram.messenger.vl.p(!z11 ? R.string.SMSWordText : R.string.SMSPhraseText, new Object[]{str}, textView);
        } else {
            org.telegram.messenger.vl.p(!z11 ? R.string.SMSWordBeginningText : R.string.SMSPhraseBeginningText, new Object[]{str, str2}, textView);
        }
        wg0.T0(wg0Var, h2Var);
        h2Var.requestFocus();
        org.telegram.ui.Components.aj0 aj0Var = this.h;
        if (aj0Var.getAnimatedDrawable() != null) {
            aj0Var.getAnimatedDrawable().L(0, false, false);
        }
        AndroidUtilities.runOnUIThread(new g10(aj0Var, 20), 500L);
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

    @Override // org.telegram.ui.Components.tv0
    public final void n() {
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        wg0 wg0Var = this.a0;
        this.n.setTextColor(wg0Var.getThemedColor(i10));
        this.r.setTextColor(wg0Var.getThemedColor(org.telegram.ui.ActionBar.j6.D6));
        int themedColor = wg0Var.getThemedColor(i10);
        di.h2 h2Var = this.c;
        h2Var.setTextColor(themedColor);
        h2Var.setCursorColor(wg0Var.getThemedColor(org.telegram.ui.ActionBar.j6.l6));
        h2Var.setHintTextColor(wg0Var.getThemedColor(org.telegram.ui.ActionBar.j6.H6));
        this.b.f();
    }

    public final void o(boolean z10) {
        this.x = z10;
        float f7 = 0.0f;
        float f10 = z10 ? 1.0f : 0.0f;
        this.b.a(f10);
        float f11 = (f10 * 0.1f) + 0.9f;
        ViewPropertyAnimator translationY = this.e.animate().scaleX(f11).scaleY(f11).alpha(f10).translationY((1.0f - f10) * AndroidUtilities.dp(-5.0f));
        org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.h;
        org.telegram.messenger.vl.q(translationY, prVar, 290L);
        if (this.w && !this.x) {
            f7 = 1.0f;
        }
        float f12 = (0.1f * f7) + 0.9f;
        this.f.animate().scaleX(f12).scaleY(f12).alpha(f7).translationY((1.0f - f7) * AndroidUtilities.dp(this.x ? 5.0f : -5.0f)).setInterpolator(prVar).setDuration(290L).start();
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
                org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.h;
                scaleY.setInterpolator(prVar).setDuration(300L).start();
                ViewPropertyAnimator scaleX = textView2.animate().scaleX((!this.w || this.x) ? 0.9f : 1.0f);
                if (this.w && !this.x) {
                    f7 = 1.0f;
                }
                ViewPropertyAnimator alpha = scaleX.scaleY(f7).alpha((!this.w || this.x) ? 0.0f : 1.0f);
                if (!this.w || this.x) {
                    f10 = AndroidUtilities.dp(this.x ? 5.0f : -5.0f);
                }
                alpha.translationY(f10).setInterpolator(prVar).setDuration(300L).start();
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
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public final void s(boolean z10) {
        di.h2 h2Var = this.c;
        if (this.a0.getParentActivity() == null) {
            return;
        }
        try {
            h2Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        boolean z11 = this.a != 16;
        TextView textView = this.e;
        if (z10) {
            textView.setText(LocaleController.getString(!z11 ? R.string.SMSWordBeginningError : R.string.SMSPhraseBeginningError));
        } else if (TextUtils.isEmpty(h2Var.getText())) {
            textView.setText("");
        } else {
            textView.setText(LocaleController.getString(!z11 ? R.string.SMSWordError : R.string.SMSPhraseError));
        }
        if (!this.x && !this.y) {
            AndroidUtilities.shakeViewSpring(h2Var, this.W);
            AndroidUtilities.shakeViewSpring(textView, this.W);
        }
        ue0 ue0Var = this.V;
        AndroidUtilities.cancelRunOnUIThread(ue0Var);
        o(true);
        AndroidUtilities.runOnUIThread(ue0Var, 10000L);
        this.W = -this.W;
    }
}
