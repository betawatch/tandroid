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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class qe0 extends org.telegram.ui.Components.wv0 {
    public int B;
    public int C;
    public String D;
    public String E;
    public String F;
    public String G;
    public String H;
    public Bundle I;
    public boolean J;
    public Timer K;
    public final Object L;
    public int M;
    public double N;
    public boolean O;
    public Bundle P;
    public TLRPC.TL_auth_sentCode Q;
    public final ne0 R;
    public final ne0 S;
    public float T;
    public final /* synthetic */ og0 U;
    public final int a;
    public final org.telegram.ui.Components.cd0 b;
    public final lg.f c;
    public final org.telegram.ui.Components.voip.o2 d;
    public final TextView e;
    public final TextView f;
    public final org.telegram.ui.Components.lj0 h;
    public final TextView n;
    public final TextView r;
    public final TextView s;
    public final qf0 v;
    public boolean w;
    public boolean x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public qe0(og0 og0Var, Context context, int i10) {
        super(context);
        boolean z4;
        org.telegram.ui.ActionBar.g6 g6Var;
        this.U = og0Var;
        this.w = true;
        this.x = false;
        this.y = false;
        this.L = new Object();
        this.M = 60000;
        this.R = new ne0(this, 1);
        this.S = new ne0(this, 2);
        this.T = -3.0f;
        this.a = i10;
        boolean z10 = i10 != 16;
        setOrientation(1);
        org.telegram.ui.Components.lj0 lj0Var = new org.telegram.ui.Components.lj0(context);
        this.h = lj0Var;
        lj0Var.setScaleType(ImageView.ScaleType.CENTER);
        lj0Var.f(R.raw.bubble, 95, 95, null);
        if (!AndroidUtilities.isSmallScreen()) {
            Point point = AndroidUtilities.displaySize;
            if (point.x <= point.y || AndroidUtilities.isTablet()) {
                z4 = false;
                lj0Var.setVisibility(!z4 ? 8 : 0);
                addView(lj0Var, k7.c6.t(95, 95, 1, 0, 10, 0, 5));
                TextView textView = new TextView(context);
                this.n = textView;
                textView.setTextSize(1, 18.0f);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                textView.setGravity(49);
                textView.setText(LocaleController.getString(z10 ? R.string.SMSWordTitle : R.string.SMSPhraseTitle));
                addView(textView, k7.c6.t(-2, -2, 1, 8, !z4 ? 25 : 0, 8, 0));
                TextView textView2 = new TextView(context);
                this.r = textView2;
                textView2.setTextSize(1, 14.0f);
                textView2.setGravity(1);
                textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                addView(textView2, k7.c6.t(-2, -2, 1, 8, 5, 8, 16));
                org.telegram.ui.Components.cd0 cd0Var = new org.telegram.ui.Components.cd0(context, null);
                this.b = cd0Var;
                cd0Var.setText(LocaleController.getString(z10 ? R.string.SMSWord : R.string.SMSPhrase));
                lg.f fVar = new lg.f(this, context, 7);
                this.c = fVar;
                fVar.setSingleLine();
                fVar.setLines(1);
                fVar.setCursorSize(AndroidUtilities.dp(20.0f));
                fVar.setCursorWidth(1.5f);
                fVar.setImeOptions(268435461);
                fVar.setTextSize(1, 18.0f);
                fVar.setMaxLines(1);
                fVar.setBackground(null);
                fVar.setHint(LocaleController.getString(z10 ? R.string.SMSWordHint : R.string.SMSPhraseHint));
                fVar.addTextChangedListener(new org.telegram.ui.Cells.h3(this));
                fVar.setEllipsizeByGradient(true);
                fVar.setInputType(1);
                fVar.setTypeface(Typeface.DEFAULT);
                fVar.setGravity(!LocaleController.isRTL ? 5 : 3);
                fVar.setOnFocusChangeListener(new qd(this, 5));
                TextView textView3 = new TextView(context);
                this.s = textView3;
                yh.p(12.0f, 1, textView3);
                textView3.setPadding(b.e(10.0f, R.string.Paste, textView3), 0, AndroidUtilities.dp(10.0f), 0);
                textView3.setGravity(17);
                int i11 = org.telegram.ui.ActionBar.k6.o6;
                g6Var = ((org.telegram.ui.ActionBar.p2) og0Var).resourceProvider;
                int v02 = org.telegram.ui.ActionBar.k6.v0(i11, g6Var);
                textView3.setTextColor(v02);
                int dp = AndroidUtilities.dp(6.0f);
                int l1 = org.telegram.ui.ActionBar.k6.l1(0.12f, v02);
                int l12 = org.telegram.ui.ActionBar.k6.l1(0.15f, v02);
                textView3.setBackground(org.telegram.ui.ActionBar.k6.i0(dp, dp, dp, dp, l1, l12, l12));
                k7.e6.b(textView3, 0.1f, 1.5f);
                fVar.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.34f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.34f));
                final int i12 = 0;
                textView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.oe0
                    public final /* synthetic */ qe0 b;

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
                                qe0 qe0Var = this.b;
                                lg.f fVar2 = qe0Var.c;
                                try {
                                    charSequence = ((ClipboardManager) qe0Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(qe0Var.getContext());
                                } catch (Exception e6) {
                                    FileLog.e(e6);
                                    charSequence = null;
                                }
                                if (charSequence != null) {
                                    Editable text = fVar2.getText();
                                    qe0Var.y = true;
                                    if (text != null) {
                                        int max = Math.max(0, fVar2.getSelectionStart());
                                        text.replace(max, Math.max(max, fVar2.getSelectionEnd()), charSequence);
                                    }
                                }
                                qe0Var.q(true);
                                break;
                            case 1:
                                this.b.c(true);
                                break;
                            default:
                                final qe0 qe0Var2 = this.b;
                                og0 og0Var2 = qe0Var2.U;
                                qf0 qf0Var = qe0Var2.v;
                                if (qe0Var2.M <= 0 || qe0Var2.K == null) {
                                    Bundle bundle = qe0Var2.P;
                                    if (bundle != null && (tL_auth_sentCode = qe0Var2.Q) != null) {
                                        og0Var2.g1(bundle, tL_auth_sentCode, true);
                                        break;
                                    } else {
                                        int i15 = qe0Var2.B;
                                        if (i15 != 4 && i15 != 2 && i15 != 11 && i15 != 15) {
                                            if (i15 == 3) {
                                                AndroidUtilities.setWaitingForSms(false);
                                                if (!qe0Var2.O && !qe0Var2.J && !og0Var2.l0) {
                                                    qe0Var2.J = true;
                                                    qf0Var.invalidate();
                                                    qf0Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.I6, false));
                                                    final Bundle bundle2 = new Bundle();
                                                    bundle2.putString("phone", qe0Var2.G);
                                                    bundle2.putString("ephone", qe0Var2.F);
                                                    bundle2.putString("phoneFormated", qe0Var2.D);
                                                    qe0Var2.O = true;
                                                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                                    tL_auth_resendCode.phone_number = qe0Var2.D;
                                                    tL_auth_resendCode.phone_code_hash = qe0Var2.E;
                                                    i14 = ((org.telegram.ui.ActionBar.p2) og0Var2).currentAccount;
                                                    final int i16 = 1;
                                                    og0Var2.n1(ConnectionsManager.getInstance(i14).sendRequest(tL_auth_resendCode, new RequestDelegate() { // from class: org.telegram.ui.ke0
                                                        @Override // org.telegram.tgnet.RequestDelegate
                                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            switch (i16) {
                                                                case 0:
                                                                    AndroidUtilities.runOnUIThread(new me0(qe0Var2, tLObject, bundle2, tL_error));
                                                                    break;
                                                                default:
                                                                    AndroidUtilities.runOnUIThread(new me0(qe0Var2, tL_error, bundle2, tLObject));
                                                                    break;
                                                            }
                                                        }
                                                    }, 10), true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            qe0Var2.J = true;
                                            qf0Var.invalidate();
                                            qf0Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.I6, false));
                                            qf0Var.setTextSize(1, 15.0f);
                                            int i17 = qe0Var2.B;
                                            if (i17 == 4 || i17 == 11) {
                                                qf0Var.setText(LocaleController.getString(R.string.Calling));
                                            } else {
                                                qf0Var.setText(LocaleController.getString(R.string.SendingSms));
                                            }
                                            final Bundle bundle3 = new Bundle();
                                            bundle3.putString("phone", qe0Var2.G);
                                            bundle3.putString("ephone", qe0Var2.F);
                                            bundle3.putString("phoneFormated", qe0Var2.D);
                                            bundle3.putInt("prevType", qe0Var2.a);
                                            TLRPC.TL_auth_resendCode tL_auth_resendCode2 = new TLRPC.TL_auth_resendCode();
                                            tL_auth_resendCode2.phone_number = qe0Var2.D;
                                            tL_auth_resendCode2.phone_code_hash = qe0Var2.E;
                                            i13 = ((org.telegram.ui.ActionBar.p2) og0Var2).currentAccount;
                                            final int i18 = 0;
                                            ConnectionsManager.getInstance(i13).sendRequest(tL_auth_resendCode2, new RequestDelegate() { // from class: org.telegram.ui.ke0
                                                @Override // org.telegram.tgnet.RequestDelegate
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    switch (i18) {
                                                        case 0:
                                                            AndroidUtilities.runOnUIThread(new me0(qe0Var2, tLObject, bundle3, tL_error));
                                                            break;
                                                        default:
                                                            AndroidUtilities.runOnUIThread(new me0(qe0Var2, tL_error, bundle3, tLObject));
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
                cd0Var.addView(fVar, k7.c6.d(-1, -2.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
                cd0Var.e(fVar);
                cd0Var.addView(textView3, k7.c6.d(-2, 26.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.addView(cd0Var, k7.c6.q(-1, -2, 1));
                addView(linearLayout, k7.c6.t(-1, -2, 1, 16, 3, 16, 0));
                fVar.setOnEditorActionListener(new ha(this, 6));
                FrameLayout frameLayout = new FrameLayout(context);
                linearLayout.addView(frameLayout, k7.c6.n(-1, -2));
                org.telegram.ui.Components.voip.o2 o2Var = new org.telegram.ui.Components.voip.o2(og0Var, context);
                this.d = o2Var;
                int i13 = org.telegram.ui.ActionBar.k6.I6;
                o2Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.w0(null, i13, false));
                o2Var.setTextColor(og0Var.getThemedColor(i13));
                o2Var.setTextSize(1, 14.0f);
                o2Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                o2Var.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
                final int i14 = 1;
                o2Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.oe0
                    public final /* synthetic */ qe0 b;

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
                                qe0 qe0Var = this.b;
                                lg.f fVar2 = qe0Var.c;
                                try {
                                    charSequence = ((ClipboardManager) qe0Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(qe0Var.getContext());
                                } catch (Exception e6) {
                                    FileLog.e(e6);
                                    charSequence = null;
                                }
                                if (charSequence != null) {
                                    Editable text = fVar2.getText();
                                    qe0Var.y = true;
                                    if (text != null) {
                                        int max = Math.max(0, fVar2.getSelectionStart());
                                        text.replace(max, Math.max(max, fVar2.getSelectionEnd()), charSequence);
                                    }
                                }
                                qe0Var.q(true);
                                break;
                            case 1:
                                this.b.c(true);
                                break;
                            default:
                                final qe0 qe0Var2 = this.b;
                                og0 og0Var2 = qe0Var2.U;
                                qf0 qf0Var = qe0Var2.v;
                                if (qe0Var2.M <= 0 || qe0Var2.K == null) {
                                    Bundle bundle = qe0Var2.P;
                                    if (bundle != null && (tL_auth_sentCode = qe0Var2.Q) != null) {
                                        og0Var2.g1(bundle, tL_auth_sentCode, true);
                                        break;
                                    } else {
                                        int i15 = qe0Var2.B;
                                        if (i15 != 4 && i15 != 2 && i15 != 11 && i15 != 15) {
                                            if (i15 == 3) {
                                                AndroidUtilities.setWaitingForSms(false);
                                                if (!qe0Var2.O && !qe0Var2.J && !og0Var2.l0) {
                                                    qe0Var2.J = true;
                                                    qf0Var.invalidate();
                                                    qf0Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.I6, false));
                                                    final Bundle bundle2 = new Bundle();
                                                    bundle2.putString("phone", qe0Var2.G);
                                                    bundle2.putString("ephone", qe0Var2.F);
                                                    bundle2.putString("phoneFormated", qe0Var2.D);
                                                    qe0Var2.O = true;
                                                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                                    tL_auth_resendCode.phone_number = qe0Var2.D;
                                                    tL_auth_resendCode.phone_code_hash = qe0Var2.E;
                                                    i142 = ((org.telegram.ui.ActionBar.p2) og0Var2).currentAccount;
                                                    final int i16 = 1;
                                                    og0Var2.n1(ConnectionsManager.getInstance(i142).sendRequest(tL_auth_resendCode, new RequestDelegate() { // from class: org.telegram.ui.ke0
                                                        @Override // org.telegram.tgnet.RequestDelegate
                                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            switch (i16) {
                                                                case 0:
                                                                    AndroidUtilities.runOnUIThread(new me0(qe0Var2, tLObject, bundle2, tL_error));
                                                                    break;
                                                                default:
                                                                    AndroidUtilities.runOnUIThread(new me0(qe0Var2, tL_error, bundle2, tLObject));
                                                                    break;
                                                            }
                                                        }
                                                    }, 10), true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            qe0Var2.J = true;
                                            qf0Var.invalidate();
                                            qf0Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.I6, false));
                                            qf0Var.setTextSize(1, 15.0f);
                                            int i17 = qe0Var2.B;
                                            if (i17 == 4 || i17 == 11) {
                                                qf0Var.setText(LocaleController.getString(R.string.Calling));
                                            } else {
                                                qf0Var.setText(LocaleController.getString(R.string.SendingSms));
                                            }
                                            final Bundle bundle3 = new Bundle();
                                            bundle3.putString("phone", qe0Var2.G);
                                            bundle3.putString("ephone", qe0Var2.F);
                                            bundle3.putString("phoneFormated", qe0Var2.D);
                                            bundle3.putInt("prevType", qe0Var2.a);
                                            TLRPC.TL_auth_resendCode tL_auth_resendCode2 = new TLRPC.TL_auth_resendCode();
                                            tL_auth_resendCode2.phone_number = qe0Var2.D;
                                            tL_auth_resendCode2.phone_code_hash = qe0Var2.E;
                                            i132 = ((org.telegram.ui.ActionBar.p2) og0Var2).currentAccount;
                                            final int i18 = 0;
                                            ConnectionsManager.getInstance(i132).sendRequest(tL_auth_resendCode2, new RequestDelegate() { // from class: org.telegram.ui.ke0
                                                @Override // org.telegram.tgnet.RequestDelegate
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    switch (i18) {
                                                        case 0:
                                                            AndroidUtilities.runOnUIThread(new me0(qe0Var2, tLObject, bundle3, tL_error));
                                                            break;
                                                        default:
                                                            AndroidUtilities.runOnUIThread(new me0(qe0Var2, tL_error, bundle3, tLObject));
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
                addView(o2Var, k7.c6.t(-2, -2, 1, 0, 18, 0, 0));
                o2Var.setVisibility(8);
                TextView textView4 = new TextView(context);
                this.e = textView4;
                textView4.setPivotX(0.0f);
                textView4.setPivotY(0.0f);
                textView4.setText(LocaleController.getString(z10 ? R.string.SMSWordError : R.string.SMSPhraseError));
                textView4.setTextColor(og0Var.getThemedColor(org.telegram.ui.ActionBar.k6.p7));
                textView4.setTextSize(1, 13.0f);
                frameLayout.addView(textView4, k7.c6.d(-1, -2.0f, 119, 16.0f, 8.0f, 16.0f, 8.0f));
                textView4.setAlpha(0.0f);
                textView4.setScaleX(0.8f);
                textView4.setScaleY(0.8f);
                textView4.setTranslationY(-AndroidUtilities.dp(4.0f));
                TextView textView5 = new TextView(context);
                this.f = textView5;
                textView5.setPivotX(0.0f);
                textView5.setPivotY(0.0f);
                textView5.setText(LocaleController.getString(z10 ? R.string.SMSWordPasteHint : R.string.SMSPhrasePasteHint));
                textView5.setTextColor(og0Var.getThemedColor(org.telegram.ui.ActionBar.k6.y6));
                textView5.setTextSize(1, 13.0f);
                frameLayout.addView(textView5, k7.c6.d(-1, -2.0f, 119, 16.0f, 8.0f, 16.0f, 8.0f));
                qf0 qf0Var = new qf0(this, context);
                this.v = qf0Var;
                qf0Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.w0(null, i13, false));
                qf0Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                qf0Var.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
                qf0Var.setTextSize(1, 15.0f);
                qf0Var.setGravity(19);
                final int i15 = 2;
                qf0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.oe0
                    public final /* synthetic */ qe0 b;

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
                                qe0 qe0Var = this.b;
                                lg.f fVar2 = qe0Var.c;
                                try {
                                    charSequence = ((ClipboardManager) qe0Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(qe0Var.getContext());
                                } catch (Exception e6) {
                                    FileLog.e(e6);
                                    charSequence = null;
                                }
                                if (charSequence != null) {
                                    Editable text = fVar2.getText();
                                    qe0Var.y = true;
                                    if (text != null) {
                                        int max = Math.max(0, fVar2.getSelectionStart());
                                        text.replace(max, Math.max(max, fVar2.getSelectionEnd()), charSequence);
                                    }
                                }
                                qe0Var.q(true);
                                break;
                            case 1:
                                this.b.c(true);
                                break;
                            default:
                                final qe0 qe0Var2 = this.b;
                                og0 og0Var2 = qe0Var2.U;
                                qf0 qf0Var2 = qe0Var2.v;
                                if (qe0Var2.M <= 0 || qe0Var2.K == null) {
                                    Bundle bundle = qe0Var2.P;
                                    if (bundle != null && (tL_auth_sentCode = qe0Var2.Q) != null) {
                                        og0Var2.g1(bundle, tL_auth_sentCode, true);
                                        break;
                                    } else {
                                        int i152 = qe0Var2.B;
                                        if (i152 != 4 && i152 != 2 && i152 != 11 && i152 != 15) {
                                            if (i152 == 3) {
                                                AndroidUtilities.setWaitingForSms(false);
                                                if (!qe0Var2.O && !qe0Var2.J && !og0Var2.l0) {
                                                    qe0Var2.J = true;
                                                    qf0Var2.invalidate();
                                                    qf0Var2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.I6, false));
                                                    final Bundle bundle2 = new Bundle();
                                                    bundle2.putString("phone", qe0Var2.G);
                                                    bundle2.putString("ephone", qe0Var2.F);
                                                    bundle2.putString("phoneFormated", qe0Var2.D);
                                                    qe0Var2.O = true;
                                                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                                    tL_auth_resendCode.phone_number = qe0Var2.D;
                                                    tL_auth_resendCode.phone_code_hash = qe0Var2.E;
                                                    i142 = ((org.telegram.ui.ActionBar.p2) og0Var2).currentAccount;
                                                    final int i16 = 1;
                                                    og0Var2.n1(ConnectionsManager.getInstance(i142).sendRequest(tL_auth_resendCode, new RequestDelegate() { // from class: org.telegram.ui.ke0
                                                        @Override // org.telegram.tgnet.RequestDelegate
                                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            switch (i16) {
                                                                case 0:
                                                                    AndroidUtilities.runOnUIThread(new me0(qe0Var2, tLObject, bundle2, tL_error));
                                                                    break;
                                                                default:
                                                                    AndroidUtilities.runOnUIThread(new me0(qe0Var2, tL_error, bundle2, tLObject));
                                                                    break;
                                                            }
                                                        }
                                                    }, 10), true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            qe0Var2.J = true;
                                            qf0Var2.invalidate();
                                            qf0Var2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.I6, false));
                                            qf0Var2.setTextSize(1, 15.0f);
                                            int i17 = qe0Var2.B;
                                            if (i17 == 4 || i17 == 11) {
                                                qf0Var2.setText(LocaleController.getString(R.string.Calling));
                                            } else {
                                                qf0Var2.setText(LocaleController.getString(R.string.SendingSms));
                                            }
                                            final Bundle bundle3 = new Bundle();
                                            bundle3.putString("phone", qe0Var2.G);
                                            bundle3.putString("ephone", qe0Var2.F);
                                            bundle3.putString("phoneFormated", qe0Var2.D);
                                            bundle3.putInt("prevType", qe0Var2.a);
                                            TLRPC.TL_auth_resendCode tL_auth_resendCode2 = new TLRPC.TL_auth_resendCode();
                                            tL_auth_resendCode2.phone_number = qe0Var2.D;
                                            tL_auth_resendCode2.phone_code_hash = qe0Var2.E;
                                            i132 = ((org.telegram.ui.ActionBar.p2) og0Var2).currentAccount;
                                            final int i18 = 0;
                                            ConnectionsManager.getInstance(i132).sendRequest(tL_auth_resendCode2, new RequestDelegate() { // from class: org.telegram.ui.ke0
                                                @Override // org.telegram.tgnet.RequestDelegate
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    switch (i18) {
                                                        case 0:
                                                            AndroidUtilities.runOnUIThread(new me0(qe0Var2, tLObject, bundle3, tL_error));
                                                            break;
                                                        default:
                                                            AndroidUtilities.runOnUIThread(new me0(qe0Var2, tL_error, bundle3, tLObject));
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
                frameLayout2.addView(qf0Var, k7.c6.d(-1, 56.0f, 80, 6.0f, 0.0f, 60.0f, 28.0f));
                addView(frameLayout2, k7.c6.q(-1, -1, 80));
                n7.qa.M0(qf0Var);
            }
        }
        z4 = true;
        lj0Var.setVisibility(!z4 ? 8 : 0);
        addView(lj0Var, k7.c6.t(95, 95, 1, 0, 10, 0, 5));
        TextView textView6 = new TextView(context);
        this.n = textView6;
        textView6.setTextSize(1, 18.0f);
        textView6.setTypeface(AndroidUtilities.bold());
        textView6.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView6.setGravity(49);
        textView6.setText(LocaleController.getString(z10 ? R.string.SMSWordTitle : R.string.SMSPhraseTitle));
        addView(textView6, k7.c6.t(-2, -2, 1, 8, !z4 ? 25 : 0, 8, 0));
        TextView textView22 = new TextView(context);
        this.r = textView22;
        textView22.setTextSize(1, 14.0f);
        textView22.setGravity(1);
        textView22.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView22, k7.c6.t(-2, -2, 1, 8, 5, 8, 16));
        org.telegram.ui.Components.cd0 cd0Var2 = new org.telegram.ui.Components.cd0(context, null);
        this.b = cd0Var2;
        cd0Var2.setText(LocaleController.getString(z10 ? R.string.SMSWord : R.string.SMSPhrase));
        lg.f fVar2 = new lg.f(this, context, 7);
        this.c = fVar2;
        fVar2.setSingleLine();
        fVar2.setLines(1);
        fVar2.setCursorSize(AndroidUtilities.dp(20.0f));
        fVar2.setCursorWidth(1.5f);
        fVar2.setImeOptions(268435461);
        fVar2.setTextSize(1, 18.0f);
        fVar2.setMaxLines(1);
        fVar2.setBackground(null);
        fVar2.setHint(LocaleController.getString(z10 ? R.string.SMSWordHint : R.string.SMSPhraseHint));
        fVar2.addTextChangedListener(new org.telegram.ui.Cells.h3(this));
        fVar2.setEllipsizeByGradient(true);
        fVar2.setInputType(1);
        fVar2.setTypeface(Typeface.DEFAULT);
        fVar2.setGravity(!LocaleController.isRTL ? 5 : 3);
        fVar2.setOnFocusChangeListener(new qd(this, 5));
        TextView textView32 = new TextView(context);
        this.s = textView32;
        yh.p(12.0f, 1, textView32);
        textView32.setPadding(b.e(10.0f, R.string.Paste, textView32), 0, AndroidUtilities.dp(10.0f), 0);
        textView32.setGravity(17);
        int i112 = org.telegram.ui.ActionBar.k6.o6;
        g6Var = ((org.telegram.ui.ActionBar.p2) og0Var).resourceProvider;
        int v022 = org.telegram.ui.ActionBar.k6.v0(i112, g6Var);
        textView32.setTextColor(v022);
        int dp2 = AndroidUtilities.dp(6.0f);
        int l13 = org.telegram.ui.ActionBar.k6.l1(0.12f, v022);
        int l122 = org.telegram.ui.ActionBar.k6.l1(0.15f, v022);
        textView32.setBackground(org.telegram.ui.ActionBar.k6.i0(dp2, dp2, dp2, dp2, l13, l122, l122));
        k7.e6.b(textView32, 0.1f, 1.5f);
        fVar2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.34f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.34f));
        final int i122 = 0;
        textView32.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.oe0
            public final /* synthetic */ qe0 b;

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
                        qe0 qe0Var = this.b;
                        lg.f fVar22 = qe0Var.c;
                        try {
                            charSequence = ((ClipboardManager) qe0Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(qe0Var.getContext());
                        } catch (Exception e6) {
                            FileLog.e(e6);
                            charSequence = null;
                        }
                        if (charSequence != null) {
                            Editable text = fVar22.getText();
                            qe0Var.y = true;
                            if (text != null) {
                                int max = Math.max(0, fVar22.getSelectionStart());
                                text.replace(max, Math.max(max, fVar22.getSelectionEnd()), charSequence);
                            }
                        }
                        qe0Var.q(true);
                        break;
                    case 1:
                        this.b.c(true);
                        break;
                    default:
                        final qe0 qe0Var2 = this.b;
                        og0 og0Var2 = qe0Var2.U;
                        qf0 qf0Var2 = qe0Var2.v;
                        if (qe0Var2.M <= 0 || qe0Var2.K == null) {
                            Bundle bundle = qe0Var2.P;
                            if (bundle != null && (tL_auth_sentCode = qe0Var2.Q) != null) {
                                og0Var2.g1(bundle, tL_auth_sentCode, true);
                                break;
                            } else {
                                int i152 = qe0Var2.B;
                                if (i152 != 4 && i152 != 2 && i152 != 11 && i152 != 15) {
                                    if (i152 == 3) {
                                        AndroidUtilities.setWaitingForSms(false);
                                        if (!qe0Var2.O && !qe0Var2.J && !og0Var2.l0) {
                                            qe0Var2.J = true;
                                            qf0Var2.invalidate();
                                            qf0Var2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.I6, false));
                                            final Bundle bundle2 = new Bundle();
                                            bundle2.putString("phone", qe0Var2.G);
                                            bundle2.putString("ephone", qe0Var2.F);
                                            bundle2.putString("phoneFormated", qe0Var2.D);
                                            qe0Var2.O = true;
                                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                            tL_auth_resendCode.phone_number = qe0Var2.D;
                                            tL_auth_resendCode.phone_code_hash = qe0Var2.E;
                                            i142 = ((org.telegram.ui.ActionBar.p2) og0Var2).currentAccount;
                                            final int i16 = 1;
                                            og0Var2.n1(ConnectionsManager.getInstance(i142).sendRequest(tL_auth_resendCode, new RequestDelegate() { // from class: org.telegram.ui.ke0
                                                @Override // org.telegram.tgnet.RequestDelegate
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    switch (i16) {
                                                        case 0:
                                                            AndroidUtilities.runOnUIThread(new me0(qe0Var2, tLObject, bundle2, tL_error));
                                                            break;
                                                        default:
                                                            AndroidUtilities.runOnUIThread(new me0(qe0Var2, tL_error, bundle2, tLObject));
                                                            break;
                                                    }
                                                }
                                            }, 10), true);
                                            break;
                                        }
                                    }
                                } else {
                                    qe0Var2.J = true;
                                    qf0Var2.invalidate();
                                    qf0Var2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.I6, false));
                                    qf0Var2.setTextSize(1, 15.0f);
                                    int i17 = qe0Var2.B;
                                    if (i17 == 4 || i17 == 11) {
                                        qf0Var2.setText(LocaleController.getString(R.string.Calling));
                                    } else {
                                        qf0Var2.setText(LocaleController.getString(R.string.SendingSms));
                                    }
                                    final Bundle bundle3 = new Bundle();
                                    bundle3.putString("phone", qe0Var2.G);
                                    bundle3.putString("ephone", qe0Var2.F);
                                    bundle3.putString("phoneFormated", qe0Var2.D);
                                    bundle3.putInt("prevType", qe0Var2.a);
                                    TLRPC.TL_auth_resendCode tL_auth_resendCode2 = new TLRPC.TL_auth_resendCode();
                                    tL_auth_resendCode2.phone_number = qe0Var2.D;
                                    tL_auth_resendCode2.phone_code_hash = qe0Var2.E;
                                    i132 = ((org.telegram.ui.ActionBar.p2) og0Var2).currentAccount;
                                    final int i18 = 0;
                                    ConnectionsManager.getInstance(i132).sendRequest(tL_auth_resendCode2, new RequestDelegate() { // from class: org.telegram.ui.ke0
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            switch (i18) {
                                                case 0:
                                                    AndroidUtilities.runOnUIThread(new me0(qe0Var2, tLObject, bundle3, tL_error));
                                                    break;
                                                default:
                                                    AndroidUtilities.runOnUIThread(new me0(qe0Var2, tL_error, bundle3, tLObject));
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
        cd0Var2.addView(fVar2, k7.c6.d(-1, -2.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        cd0Var2.e(fVar2);
        cd0Var2.addView(textView32, k7.c6.d(-2, 26.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.addView(cd0Var2, k7.c6.q(-1, -2, 1));
        addView(linearLayout2, k7.c6.t(-1, -2, 1, 16, 3, 16, 0));
        fVar2.setOnEditorActionListener(new ha(this, 6));
        FrameLayout frameLayout3 = new FrameLayout(context);
        linearLayout2.addView(frameLayout3, k7.c6.n(-1, -2));
        org.telegram.ui.Components.voip.o2 o2Var2 = new org.telegram.ui.Components.voip.o2(og0Var, context);
        this.d = o2Var2;
        int i132 = org.telegram.ui.ActionBar.k6.I6;
        o2Var2.setLinkTextColor(org.telegram.ui.ActionBar.k6.w0(null, i132, false));
        o2Var2.setTextColor(og0Var.getThemedColor(i132));
        o2Var2.setTextSize(1, 14.0f);
        o2Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        o2Var2.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
        final int i142 = 1;
        o2Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.oe0
            public final /* synthetic */ qe0 b;

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
                        qe0 qe0Var = this.b;
                        lg.f fVar22 = qe0Var.c;
                        try {
                            charSequence = ((ClipboardManager) qe0Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(qe0Var.getContext());
                        } catch (Exception e6) {
                            FileLog.e(e6);
                            charSequence = null;
                        }
                        if (charSequence != null) {
                            Editable text = fVar22.getText();
                            qe0Var.y = true;
                            if (text != null) {
                                int max = Math.max(0, fVar22.getSelectionStart());
                                text.replace(max, Math.max(max, fVar22.getSelectionEnd()), charSequence);
                            }
                        }
                        qe0Var.q(true);
                        break;
                    case 1:
                        this.b.c(true);
                        break;
                    default:
                        final qe0 qe0Var2 = this.b;
                        og0 og0Var2 = qe0Var2.U;
                        qf0 qf0Var2 = qe0Var2.v;
                        if (qe0Var2.M <= 0 || qe0Var2.K == null) {
                            Bundle bundle = qe0Var2.P;
                            if (bundle != null && (tL_auth_sentCode = qe0Var2.Q) != null) {
                                og0Var2.g1(bundle, tL_auth_sentCode, true);
                                break;
                            } else {
                                int i152 = qe0Var2.B;
                                if (i152 != 4 && i152 != 2 && i152 != 11 && i152 != 15) {
                                    if (i152 == 3) {
                                        AndroidUtilities.setWaitingForSms(false);
                                        if (!qe0Var2.O && !qe0Var2.J && !og0Var2.l0) {
                                            qe0Var2.J = true;
                                            qf0Var2.invalidate();
                                            qf0Var2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.I6, false));
                                            final Bundle bundle2 = new Bundle();
                                            bundle2.putString("phone", qe0Var2.G);
                                            bundle2.putString("ephone", qe0Var2.F);
                                            bundle2.putString("phoneFormated", qe0Var2.D);
                                            qe0Var2.O = true;
                                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                            tL_auth_resendCode.phone_number = qe0Var2.D;
                                            tL_auth_resendCode.phone_code_hash = qe0Var2.E;
                                            i1422 = ((org.telegram.ui.ActionBar.p2) og0Var2).currentAccount;
                                            final int i16 = 1;
                                            og0Var2.n1(ConnectionsManager.getInstance(i1422).sendRequest(tL_auth_resendCode, new RequestDelegate() { // from class: org.telegram.ui.ke0
                                                @Override // org.telegram.tgnet.RequestDelegate
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    switch (i16) {
                                                        case 0:
                                                            AndroidUtilities.runOnUIThread(new me0(qe0Var2, tLObject, bundle2, tL_error));
                                                            break;
                                                        default:
                                                            AndroidUtilities.runOnUIThread(new me0(qe0Var2, tL_error, bundle2, tLObject));
                                                            break;
                                                    }
                                                }
                                            }, 10), true);
                                            break;
                                        }
                                    }
                                } else {
                                    qe0Var2.J = true;
                                    qf0Var2.invalidate();
                                    qf0Var2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.I6, false));
                                    qf0Var2.setTextSize(1, 15.0f);
                                    int i17 = qe0Var2.B;
                                    if (i17 == 4 || i17 == 11) {
                                        qf0Var2.setText(LocaleController.getString(R.string.Calling));
                                    } else {
                                        qf0Var2.setText(LocaleController.getString(R.string.SendingSms));
                                    }
                                    final Bundle bundle3 = new Bundle();
                                    bundle3.putString("phone", qe0Var2.G);
                                    bundle3.putString("ephone", qe0Var2.F);
                                    bundle3.putString("phoneFormated", qe0Var2.D);
                                    bundle3.putInt("prevType", qe0Var2.a);
                                    TLRPC.TL_auth_resendCode tL_auth_resendCode2 = new TLRPC.TL_auth_resendCode();
                                    tL_auth_resendCode2.phone_number = qe0Var2.D;
                                    tL_auth_resendCode2.phone_code_hash = qe0Var2.E;
                                    i1322 = ((org.telegram.ui.ActionBar.p2) og0Var2).currentAccount;
                                    final int i18 = 0;
                                    ConnectionsManager.getInstance(i1322).sendRequest(tL_auth_resendCode2, new RequestDelegate() { // from class: org.telegram.ui.ke0
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            switch (i18) {
                                                case 0:
                                                    AndroidUtilities.runOnUIThread(new me0(qe0Var2, tLObject, bundle3, tL_error));
                                                    break;
                                                default:
                                                    AndroidUtilities.runOnUIThread(new me0(qe0Var2, tL_error, bundle3, tLObject));
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
        addView(o2Var2, k7.c6.t(-2, -2, 1, 0, 18, 0, 0));
        o2Var2.setVisibility(8);
        TextView textView42 = new TextView(context);
        this.e = textView42;
        textView42.setPivotX(0.0f);
        textView42.setPivotY(0.0f);
        textView42.setText(LocaleController.getString(z10 ? R.string.SMSWordError : R.string.SMSPhraseError));
        textView42.setTextColor(og0Var.getThemedColor(org.telegram.ui.ActionBar.k6.p7));
        textView42.setTextSize(1, 13.0f);
        frameLayout3.addView(textView42, k7.c6.d(-1, -2.0f, 119, 16.0f, 8.0f, 16.0f, 8.0f));
        textView42.setAlpha(0.0f);
        textView42.setScaleX(0.8f);
        textView42.setScaleY(0.8f);
        textView42.setTranslationY(-AndroidUtilities.dp(4.0f));
        TextView textView52 = new TextView(context);
        this.f = textView52;
        textView52.setPivotX(0.0f);
        textView52.setPivotY(0.0f);
        textView52.setText(LocaleController.getString(z10 ? R.string.SMSWordPasteHint : R.string.SMSPhrasePasteHint));
        textView52.setTextColor(og0Var.getThemedColor(org.telegram.ui.ActionBar.k6.y6));
        textView52.setTextSize(1, 13.0f);
        frameLayout3.addView(textView52, k7.c6.d(-1, -2.0f, 119, 16.0f, 8.0f, 16.0f, 8.0f));
        qf0 qf0Var2 = new qf0(this, context);
        this.v = qf0Var2;
        qf0Var2.setLinkTextColor(org.telegram.ui.ActionBar.k6.w0(null, i132, false));
        qf0Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        qf0Var2.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
        qf0Var2.setTextSize(1, 15.0f);
        qf0Var2.setGravity(19);
        final int i152 = 2;
        qf0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.oe0
            public final /* synthetic */ qe0 b;

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
                        qe0 qe0Var = this.b;
                        lg.f fVar22 = qe0Var.c;
                        try {
                            charSequence = ((ClipboardManager) qe0Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(qe0Var.getContext());
                        } catch (Exception e6) {
                            FileLog.e(e6);
                            charSequence = null;
                        }
                        if (charSequence != null) {
                            Editable text = fVar22.getText();
                            qe0Var.y = true;
                            if (text != null) {
                                int max = Math.max(0, fVar22.getSelectionStart());
                                text.replace(max, Math.max(max, fVar22.getSelectionEnd()), charSequence);
                            }
                        }
                        qe0Var.q(true);
                        break;
                    case 1:
                        this.b.c(true);
                        break;
                    default:
                        final qe0 qe0Var2 = this.b;
                        og0 og0Var2 = qe0Var2.U;
                        qf0 qf0Var22 = qe0Var2.v;
                        if (qe0Var2.M <= 0 || qe0Var2.K == null) {
                            Bundle bundle = qe0Var2.P;
                            if (bundle != null && (tL_auth_sentCode = qe0Var2.Q) != null) {
                                og0Var2.g1(bundle, tL_auth_sentCode, true);
                                break;
                            } else {
                                int i1522 = qe0Var2.B;
                                if (i1522 != 4 && i1522 != 2 && i1522 != 11 && i1522 != 15) {
                                    if (i1522 == 3) {
                                        AndroidUtilities.setWaitingForSms(false);
                                        if (!qe0Var2.O && !qe0Var2.J && !og0Var2.l0) {
                                            qe0Var2.J = true;
                                            qf0Var22.invalidate();
                                            qf0Var22.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.I6, false));
                                            final Bundle bundle2 = new Bundle();
                                            bundle2.putString("phone", qe0Var2.G);
                                            bundle2.putString("ephone", qe0Var2.F);
                                            bundle2.putString("phoneFormated", qe0Var2.D);
                                            qe0Var2.O = true;
                                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                            tL_auth_resendCode.phone_number = qe0Var2.D;
                                            tL_auth_resendCode.phone_code_hash = qe0Var2.E;
                                            i1422 = ((org.telegram.ui.ActionBar.p2) og0Var2).currentAccount;
                                            final int i16 = 1;
                                            og0Var2.n1(ConnectionsManager.getInstance(i1422).sendRequest(tL_auth_resendCode, new RequestDelegate() { // from class: org.telegram.ui.ke0
                                                @Override // org.telegram.tgnet.RequestDelegate
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    switch (i16) {
                                                        case 0:
                                                            AndroidUtilities.runOnUIThread(new me0(qe0Var2, tLObject, bundle2, tL_error));
                                                            break;
                                                        default:
                                                            AndroidUtilities.runOnUIThread(new me0(qe0Var2, tL_error, bundle2, tLObject));
                                                            break;
                                                    }
                                                }
                                            }, 10), true);
                                            break;
                                        }
                                    }
                                } else {
                                    qe0Var2.J = true;
                                    qf0Var22.invalidate();
                                    qf0Var22.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.I6, false));
                                    qf0Var22.setTextSize(1, 15.0f);
                                    int i17 = qe0Var2.B;
                                    if (i17 == 4 || i17 == 11) {
                                        qf0Var22.setText(LocaleController.getString(R.string.Calling));
                                    } else {
                                        qf0Var22.setText(LocaleController.getString(R.string.SendingSms));
                                    }
                                    final Bundle bundle3 = new Bundle();
                                    bundle3.putString("phone", qe0Var2.G);
                                    bundle3.putString("ephone", qe0Var2.F);
                                    bundle3.putString("phoneFormated", qe0Var2.D);
                                    bundle3.putInt("prevType", qe0Var2.a);
                                    TLRPC.TL_auth_resendCode tL_auth_resendCode2 = new TLRPC.TL_auth_resendCode();
                                    tL_auth_resendCode2.phone_number = qe0Var2.D;
                                    tL_auth_resendCode2.phone_code_hash = qe0Var2.E;
                                    i1322 = ((org.telegram.ui.ActionBar.p2) og0Var2).currentAccount;
                                    final int i18 = 0;
                                    ConnectionsManager.getInstance(i1322).sendRequest(tL_auth_resendCode2, new RequestDelegate() { // from class: org.telegram.ui.ke0
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            switch (i18) {
                                                case 0:
                                                    AndroidUtilities.runOnUIThread(new me0(qe0Var2, tLObject, bundle3, tL_error));
                                                    break;
                                                default:
                                                    AndroidUtilities.runOnUIThread(new me0(qe0Var2, tL_error, bundle3, tLObject));
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
        frameLayout22.addView(qf0Var2, k7.c6.d(-1, 56.0f, 80, 6.0f, 0.0f, 60.0f, 28.0f));
        addView(frameLayout22, k7.c6.q(-1, -1, 80));
        n7.qa.M0(qf0Var2);
    }

    public static String t(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length && str.charAt(i10) <= ' ') {
            i10++;
        }
        return (i10 > 0 || length < str.length()) ? str.substring(i10, length) : str;
    }

    @Override // org.telegram.ui.Components.wv0
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Components.wv0
    public final boolean c(boolean z4) {
        og0 og0Var = this.U;
        og0Var.k1(true, true);
        int i10 = this.C;
        if (i10 != 0) {
            og0Var.u1(i10, true, null, true);
            return false;
        }
        this.I = null;
        this.O = false;
        return true;
    }

    @Override // org.telegram.ui.Components.wv0
    public final void d() {
        this.O = false;
    }

    @Override // org.telegram.ui.Components.wv0
    public final void g() {
        AndroidUtilities.cancelRunOnUIThread(this.R);
    }

    @Override // org.telegram.ui.Components.wv0
    public String getHeaderName() {
        return LocaleController.getString("NewPassword", R.string.NewPassword);
    }

    @Override // org.telegram.ui.Components.wv0
    public final void h(String str) {
        if (this.O) {
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
        this.O = true;
        TLRPC.TL_auth_signIn tL_auth_signIn = new TLRPC.TL_auth_signIn();
        tL_auth_signIn.phone_number = this.D;
        tL_auth_signIn.phone_code = obj;
        tL_auth_signIn.phone_code_hash = this.E;
        tL_auth_signIn.flags |= 1;
        og0 og0Var = this.U;
        og0Var.n1(og0Var.getConnectionsManager().sendRequest(tL_auth_signIn, new je0(this, tL_auth_signIn, 0), 10), true);
        og0Var.v1(true, true);
    }

    @Override // org.telegram.ui.Components.wv0
    public final void i() {
        q(true);
    }

    @Override // org.telegram.ui.Components.wv0
    public final void j() {
        AndroidUtilities.runOnUIThread(new ne0(this, 3), og0.q0);
    }

    @Override // org.telegram.ui.Components.wv0
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_word" + this.a);
        this.I = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
    }

    @Override // org.telegram.ui.Components.wv0
    public final void l(Bundle bundle) {
        if (this.I != null) {
            bundle.putBundle("recoveryview_word" + this.a, this.I);
        }
    }

    @Override // org.telegram.ui.Components.wv0
    public final void m(Bundle bundle, boolean z4) {
        qf0 qf0Var = this.v;
        if (bundle == null) {
            if (this.P == null || this.Q == null) {
                return;
            }
            qf0Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.I6, false));
            int i10 = this.B;
            qf0Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(i10 == 17 ? R.string.ReturnEnteringPhrase : i10 == 16 ? R.string.ReturnEnteringWord : i10 == 3 ? R.string.ReturnPhoneCall : R.string.ReturnEnteringSMS), true, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f)));
            return;
        }
        lg.f fVar = this.c;
        fVar.setText("");
        this.I = bundle;
        this.H = null;
        this.B = bundle.getInt("nextType");
        this.C = bundle.getInt("prevType", 0);
        this.F = bundle.getString("ephone");
        if (this.I.containsKey("beginning")) {
            this.H = this.I.getString("beginning");
        }
        this.D = bundle.getString("phoneFormated");
        this.E = bundle.getString("phoneHash");
        this.G = this.I.getString("phone");
        this.M = bundle.getInt("timeout");
        int i11 = this.C;
        org.telegram.ui.Components.voip.o2 o2Var = this.d;
        if (i11 == 17) {
            o2Var.setVisibility(0);
            o2Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.BackEnteringPhrase), true, AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(1.0f)));
        } else if (i11 == 16) {
            o2Var.setVisibility(0);
            o2Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.BackEnteringWord), true, AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(1.0f)));
        } else if (i11 == 1 || i11 == 2 || i11 == 4 || i11 == 3 || i11 == 15) {
            o2Var.setVisibility(0);
            o2Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.BackEnteringCode), true, AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(1.0f)));
        } else {
            o2Var.setVisibility(8);
        }
        this.P = null;
        this.Q = null;
        this.O = false;
        this.J = false;
        og0 og0Var = this.U;
        og0Var.l0 = false;
        qf0Var.invalidate();
        boolean z10 = this.a != 16;
        String str = "+" + se.b.c().b(se.b.d(this.G, false));
        String str2 = this.H;
        TextView textView = this.r;
        if (str2 == null) {
            b.o(!z10 ? R.string.SMSWordText : R.string.SMSPhraseText, new Object[]{str}, textView);
        } else {
            b.o(!z10 ? R.string.SMSWordBeginningText : R.string.SMSPhraseBeginningText, new Object[]{str, str2}, textView);
        }
        og0.T0(og0Var, fVar);
        fVar.requestFocus();
        org.telegram.ui.Components.lj0 lj0Var = this.h;
        if (lj0Var.getAnimatedDrawable() != null) {
            lj0Var.getAnimatedDrawable().L(0, false, false);
        }
        AndroidUtilities.runOnUIThread(new c10(lj0Var, 20), 500L);
        q(false);
        o(false);
        this.N = System.currentTimeMillis();
        int i12 = org.telegram.ui.ActionBar.k6.y6;
        qf0Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i12, false));
        int i13 = this.B;
        if (i13 != 2 && i13 != 4 && i13 != 3) {
            qf0Var.setVisibility(8);
            return;
        }
        if (this.K != null) {
            return;
        }
        qf0Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i12, false));
        qf0Var.setTag(R.id.color_key_tag, Integer.valueOf(i12));
        Timer timer = new Timer();
        this.K = timer;
        timer.schedule(new pe0(this), 0L, 1000L);
    }

    @Override // org.telegram.ui.Components.wv0
    public final void n() {
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        og0 og0Var = this.U;
        this.n.setTextColor(og0Var.getThemedColor(i10));
        this.r.setTextColor(og0Var.getThemedColor(org.telegram.ui.ActionBar.k6.D6));
        int themedColor = og0Var.getThemedColor(i10);
        lg.f fVar = this.c;
        fVar.setTextColor(themedColor);
        fVar.setCursorColor(og0Var.getThemedColor(org.telegram.ui.ActionBar.k6.l6));
        fVar.setHintTextColor(og0Var.getThemedColor(org.telegram.ui.ActionBar.k6.H6));
        this.b.f();
    }

    public final void o(boolean z4) {
        this.x = z4;
        float f10 = 0.0f;
        float f11 = z4 ? 1.0f : 0.0f;
        this.b.a(f11);
        float f12 = (f11 * 0.1f) + 0.9f;
        ViewPropertyAnimator translationY = this.e.animate().scaleX(f12).scaleY(f12).alpha(f11).translationY((1.0f - f11) * AndroidUtilities.dp(-5.0f));
        org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.h;
        b.p(translationY, prVar, 290L);
        if (this.w && !this.x) {
            f10 = 1.0f;
        }
        float f13 = (0.1f * f10) + 0.9f;
        this.f.animate().scaleX(f13).scaleY(f13).alpha(f10).translationY((1.0f - f10) * AndroidUtilities.dp(this.x ? 5.0f : -5.0f)).setInterpolator(prVar).setDuration(290L).start();
    }

    public final boolean p(String str) {
        if (this.H == null) {
            return true;
        }
        String lowerCase = t(str).toLowerCase();
        String lowerCase2 = this.H.toLowerCase();
        int min = Math.min(lowerCase.length(), lowerCase2.length());
        if (min <= 0) {
            return true;
        }
        return TextUtils.equals(lowerCase.substring(0, min), lowerCase2.substring(0, min));
    }

    public final void q(boolean z4) {
        ne0 ne0Var = this.R;
        AndroidUtilities.cancelRunOnUIThread(ne0Var);
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        boolean z10 = TextUtils.isEmpty(this.c.getText()) && clipboardManager != null && clipboardManager.hasPrimaryClip();
        if (this.w != z10) {
            this.w = z10;
            float f10 = 0.9f;
            TextView textView = this.s;
            TextView textView2 = this.f;
            float f11 = 0.0f;
            if (z4) {
                ViewPropertyAnimator scaleY = textView.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.7f).scaleY(z10 ? 1.0f : 0.7f);
                org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.h;
                scaleY.setInterpolator(prVar).setDuration(300L).start();
                ViewPropertyAnimator scaleX = textView2.animate().scaleX((!this.w || this.x) ? 0.9f : 1.0f);
                if (this.w && !this.x) {
                    f10 = 1.0f;
                }
                ViewPropertyAnimator alpha = scaleX.scaleY(f10).alpha((!this.w || this.x) ? 0.0f : 1.0f);
                if (!this.w || this.x) {
                    f11 = AndroidUtilities.dp(this.x ? 5.0f : -5.0f);
                }
                alpha.translationY(f11).setInterpolator(prVar).setDuration(300L).start();
            } else {
                textView.setAlpha(z10 ? 1.0f : 0.0f);
                textView.setScaleX(z10 ? 1.0f : 0.7f);
                textView.setScaleY(z10 ? 1.0f : 0.7f);
                textView2.setScaleX((!this.w || this.x) ? 0.9f : 1.0f);
                if (this.w && !this.x) {
                    f10 = 1.0f;
                }
                textView2.setScaleY(f10);
                textView2.setAlpha((!this.w || this.x) ? 0.0f : 1.0f);
                if (!this.w || this.x) {
                    f11 = AndroidUtilities.dp(this.x ? 5.0f : -5.0f);
                }
                textView2.setTranslationY(f11);
            }
        }
        AndroidUtilities.runOnUIThread(ne0Var, 5000L);
    }

    public final void r() {
        qf0 qf0Var = this.v;
        int i10 = org.telegram.ui.ActionBar.k6.y6;
        qf0Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i10, false));
        this.v.setTag(R.id.color_key_tag, Integer.valueOf(i10));
        try {
            synchronized (this.L) {
                try {
                    Timer timer = this.K;
                    if (timer != null) {
                        timer.cancel();
                        this.K = null;
                    }
                } finally {
                }
            }
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    public final void s(boolean z4) {
        lg.f fVar = this.c;
        if (this.U.getParentActivity() == null) {
            return;
        }
        try {
            fVar.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        boolean z10 = this.a != 16;
        TextView textView = this.e;
        if (z4) {
            textView.setText(LocaleController.getString(!z10 ? R.string.SMSWordBeginningError : R.string.SMSPhraseBeginningError));
        } else if (TextUtils.isEmpty(fVar.getText())) {
            textView.setText("");
        } else {
            textView.setText(LocaleController.getString(!z10 ? R.string.SMSWordError : R.string.SMSPhraseError));
        }
        if (!this.x && !this.y) {
            AndroidUtilities.shakeViewSpring(fVar, this.T);
            AndroidUtilities.shakeViewSpring(textView, this.T);
        }
        ne0 ne0Var = this.S;
        AndroidUtilities.cancelRunOnUIThread(ne0Var);
        o(true);
        AndroidUtilities.runOnUIThread(ne0Var, 10000L);
        this.T = -this.T;
    }
}
