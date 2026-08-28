package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.widget.FrameLayout;
import android.widget.Space;
import android.widget.TextView;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ue0 extends org.telegram.ui.Components.cv0 {
    public final /* synthetic */ fg0 A;
    public final org.telegram.ui.Components.fc0 a;
    public final EditTextBoldCursor b;
    public final TextView c;
    public final org.telegram.ui.Components.l80 d;
    public final TextView e;
    public final org.telegram.ui.Components.s80 f;
    public final org.telegram.ui.Components.pi0 h;
    public Bundle n;
    public boolean r;
    public String s;
    public String v;
    public String w;
    public String x;
    public GoogleSignInAccount y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ue0(fg0 fg0Var, Context context) {
        super(context);
        int i9;
        this.A = fg0Var;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.pi0 pi0Var = new org.telegram.ui.Components.pi0(context);
        this.h = pi0Var;
        pi0Var.f(R.raw.tsv_setup_mail, 120, 120, null);
        pi0Var.setAutoRepeat(false);
        frameLayout.addView(pi0Var, g7.e6.e(120, 120, 1));
        if (!AndroidUtilities.isSmallScreen()) {
            Point point = AndroidUtilities.displaySize;
            if (point.x <= point.y || AndroidUtilities.isTablet()) {
                i9 = 0;
                frameLayout.setVisibility(i9);
                addView(frameLayout, g7.e6.e(-1, -2, 1));
                TextView textView = new TextView(context);
                this.c = textView;
                j3.r0.u(18.0f, 1, textView);
                int i10 = 3;
                textView.setText(LocaleController.getString(fg0Var.B != 3 ? R.string.EnterNewEmail : R.string.AddEmailTitle));
                textView.setGravity(17);
                textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                addView(textView, g7.e6.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
                org.telegram.ui.Components.l80 l80Var = new org.telegram.ui.Components.l80(context, null);
                this.d = l80Var;
                l80Var.setTextSize(1, 14.0f);
                l80Var.setGravity(17);
                l80Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                l80Var.setText(LocaleController.getString(R.string.AddEmailSubtitle));
                addView(l80Var, g7.e6.t(-2, -2, 1, 32, 8, 32, 0));
                org.telegram.ui.Components.fc0 fc0Var = new org.telegram.ui.Components.fc0(context, null);
                this.a = fc0Var;
                fc0Var.setText(LocaleController.getString(fg0Var.B != 3 ? R.string.YourNewEmail : R.string.YourEmail));
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                this.b = editTextBoldCursor;
                editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setImeOptions(268435461);
                editTextBoldCursor.setTextSize(1, 17.0f);
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setInputType(33);
                int i11 = 7;
                editTextBoldCursor.setOnFocusChangeListener(new ld(this, i11));
                editTextBoldCursor.setBackground(null);
                editTextBoldCursor.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                fc0Var.e(editTextBoldCursor);
                fc0Var.addView(editTextBoldCursor, g7.e6.e(-1, -2, 48));
                editTextBoldCursor.setOnEditorActionListener(new ea(this, i11));
                addView(fc0Var, g7.e6.k(16.0f, 24.0f, 16.0f, 0.0f, -1, 58));
                TextView textView2 = new TextView(context);
                this.e = textView2;
                textView2.setGravity(3);
                textView2.setTextSize(1, 14.0f);
                textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                textView2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                textView2.setMaxLines(2);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d ");
                Drawable drawable = context.getDrawable(org.telegram.messenger.beta.R.drawable.googleg_standard_color_18);
                drawable.setBounds(0, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(27.0f));
                spannableStringBuilder.setSpan(new ImageSpan(drawable, 0), 0, 1, 33);
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.xy(i10), 1, 2, 33);
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.SignInWithGoogle));
                textView2.setText(spannableStringBuilder);
                org.telegram.ui.Components.s80 s80Var = new org.telegram.ui.Components.s80(context);
                this.f = s80Var;
                addView(new Space(context), g7.e6.l(1.0f, 0, 0));
                FrameLayout frameLayout2 = new FrameLayout(context);
                frameLayout2.addView(textView2, g7.e6.d(-2, -2.0f, 83, 0.0f, 0.0f, 0.0f, 24.0f));
                frameLayout2.addView(s80Var, g7.e6.d(-2, 16.0f, 83, 0.0f, 0.0f, 0.0f, 70.0f));
                s80Var.setMeasureAfter(textView2);
                addView(frameLayout2, g7.e6.n(-1, -2));
                org.telegram.ui.Cells.e3.s2(frameLayout2);
                frameLayout2.setOnClickListener(new q50(this, 8));
            }
        }
        i9 = 8;
        frameLayout.setVisibility(i9);
        addView(frameLayout, g7.e6.e(-1, -2, 1));
        TextView textView3 = new TextView(context);
        this.c = textView3;
        j3.r0.u(18.0f, 1, textView3);
        int i102 = 3;
        textView3.setText(LocaleController.getString(fg0Var.B != 3 ? R.string.EnterNewEmail : R.string.AddEmailTitle));
        textView3.setGravity(17);
        textView3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView3, g7.e6.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
        org.telegram.ui.Components.l80 l80Var2 = new org.telegram.ui.Components.l80(context, null);
        this.d = l80Var2;
        l80Var2.setTextSize(1, 14.0f);
        l80Var2.setGravity(17);
        l80Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        l80Var2.setText(LocaleController.getString(R.string.AddEmailSubtitle));
        addView(l80Var2, g7.e6.t(-2, -2, 1, 32, 8, 32, 0));
        org.telegram.ui.Components.fc0 fc0Var2 = new org.telegram.ui.Components.fc0(context, null);
        this.a = fc0Var2;
        fc0Var2.setText(LocaleController.getString(fg0Var.B != 3 ? R.string.YourNewEmail : R.string.YourEmail));
        EditTextBoldCursor editTextBoldCursor2 = new EditTextBoldCursor(context);
        this.b = editTextBoldCursor2;
        editTextBoldCursor2.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor2.setCursorWidth(1.5f);
        editTextBoldCursor2.setImeOptions(268435461);
        editTextBoldCursor2.setTextSize(1, 17.0f);
        editTextBoldCursor2.setMaxLines(1);
        editTextBoldCursor2.setInputType(33);
        int i112 = 7;
        editTextBoldCursor2.setOnFocusChangeListener(new ld(this, i112));
        editTextBoldCursor2.setBackground(null);
        editTextBoldCursor2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        fc0Var2.e(editTextBoldCursor2);
        fc0Var2.addView(editTextBoldCursor2, g7.e6.e(-1, -2, 48));
        editTextBoldCursor2.setOnEditorActionListener(new ea(this, i112));
        addView(fc0Var2, g7.e6.k(16.0f, 24.0f, 16.0f, 0.0f, -1, 58));
        TextView textView22 = new TextView(context);
        this.e = textView22;
        textView22.setGravity(3);
        textView22.setTextSize(1, 14.0f);
        textView22.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView22.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        textView22.setMaxLines(2);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("d ");
        Drawable drawable2 = context.getDrawable(org.telegram.messenger.beta.R.drawable.googleg_standard_color_18);
        drawable2.setBounds(0, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(27.0f));
        spannableStringBuilder2.setSpan(new ImageSpan(drawable2, 0), 0, 1, 33);
        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.xy(i102), 1, 2, 33);
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.SignInWithGoogle));
        textView22.setText(spannableStringBuilder2);
        org.telegram.ui.Components.s80 s80Var2 = new org.telegram.ui.Components.s80(context);
        this.f = s80Var2;
        addView(new Space(context), g7.e6.l(1.0f, 0, 0));
        FrameLayout frameLayout22 = new FrameLayout(context);
        frameLayout22.addView(textView22, g7.e6.d(-2, -2.0f, 83, 0.0f, 0.0f, 0.0f, 24.0f));
        frameLayout22.addView(s80Var2, g7.e6.d(-2, 16.0f, 83, 0.0f, 0.0f, 0.0f, 70.0f));
        s80Var2.setMeasureAfter(textView22);
        addView(frameLayout22, g7.e6.n(-1, -2));
        org.telegram.ui.Cells.e3.s2(frameLayout22);
        frameLayout22.setOnClickListener(new q50(this, 8));
    }

    @Override // org.telegram.ui.Components.cv0
    public final boolean b() {
        return !this.A.d0;
    }

    @Override // org.telegram.ui.Components.cv0
    public String getHeaderName() {
        return LocaleController.getString("AddEmailTitle", R.string.AddEmailTitle);
    }

    @Override // org.telegram.ui.Components.cv0
    public final void h(String str) {
        int i9;
        int i10;
        if (this.r) {
            return;
        }
        GoogleSignInAccount googleSignInAccount = this.y;
        String obj = googleSignInAccount != null ? googleSignInAccount.d : this.b.getText().toString();
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.s);
        bundle.putString("ephone", this.v);
        bundle.putString("phoneFormated", this.w);
        bundle.putString("phoneHash", this.x);
        bundle.putString("email", obj);
        bundle.putBoolean("setup", true);
        GoogleSignInAccount googleSignInAccount2 = this.y;
        fg0 fg0Var = this.A;
        if (googleSignInAccount2 != null) {
            TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
            if (fg0Var.B == 3) {
                verifyemail.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup.phone_number = this.w;
                tL_emailVerifyPurposeLoginSetup.phone_code_hash = this.x;
                verifyemail.purpose = tL_emailVerifyPurposeLoginSetup;
            }
            TLRPC.TL_emailVerificationGoogle tL_emailVerificationGoogle = new TLRPC.TL_emailVerificationGoogle();
            tL_emailVerificationGoogle.token = this.y.c;
            verifyemail.verification = tL_emailVerificationGoogle;
            this.y = null;
            i10 = ((org.telegram.ui.ActionBar.o2) fg0Var).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(verifyemail, new y9(this, bundle, verifyemail, 21), 10);
            return;
        }
        if (TextUtils.isEmpty(obj)) {
            o();
            return;
        }
        this.r = true;
        fg0Var.n1(0, true);
        TL_account.sendVerifyEmailCode sendverifyemailcode = new TL_account.sendVerifyEmailCode();
        if (fg0Var.B == 3) {
            sendverifyemailcode.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
        } else {
            TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup2 = new TLRPC.TL_emailVerifyPurposeLoginSetup();
            tL_emailVerifyPurposeLoginSetup2.phone_number = this.w;
            tL_emailVerifyPurposeLoginSetup2.phone_code_hash = this.x;
            sendverifyemailcode.purpose = tL_emailVerifyPurposeLoginSetup2;
        }
        sendverifyemailcode.email = obj;
        i9 = ((org.telegram.ui.ActionBar.o2) fg0Var).currentAccount;
        ConnectionsManager.getInstance(i9).sendRequest(sendverifyemailcode, new y9(this, bundle, sendverifyemailcode, 22), 10);
    }

    @Override // org.telegram.ui.Components.cv0
    public final void j() {
        AndroidUtilities.runOnUIThread(new se0(this, 0), fg0.p0);
    }

    @Override // org.telegram.ui.Components.cv0
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("emailsetup_params");
        this.n = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("emailsetup_email");
        if (string != null) {
            this.b.setText(string);
        }
    }

    @Override // org.telegram.ui.Components.cv0
    public final void l(Bundle bundle) {
        String obj = this.b.getText().toString();
        if (obj != null && obj.length() != 0) {
            bundle.putString("emailsetup_email", obj);
        }
        Bundle bundle2 = this.n;
        if (bundle2 != null) {
            bundle.putBundle("emailsetup_params", bundle2);
        }
    }

    @Override // org.telegram.ui.Components.cv0
    public final void m(Bundle bundle, boolean z10) {
        if (bundle == null) {
            return;
        }
        EditTextBoldCursor editTextBoldCursor = this.b;
        editTextBoldCursor.setText("");
        this.n = bundle;
        this.s = bundle.getString("phone");
        this.v = this.n.getString("ephone");
        this.w = this.n.getString("phoneFormated");
        this.x = this.n.getString("phoneHash");
        int i9 = (bundle.getBoolean("googleSignInAllowed") && PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices()) ? 0 : 8;
        this.f.setVisibility(i9);
        this.e.setVisibility(i9);
        fg0.T0(this.A, editTextBoldCursor);
        editTextBoldCursor.requestFocus();
    }

    @Override // org.telegram.ui.Components.cv0
    public final void n() {
        int i9 = org.telegram.ui.ActionBar.f6.G6;
        this.c.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.D6, false);
        org.telegram.ui.Components.l80 l80Var = this.d;
        l80Var.setTextColor(w02);
        l80Var.setLinkTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.gc, false));
        this.b.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        this.e.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q6, false));
        this.f.a();
        this.a.invalidate();
    }

    public final void o() {
        org.telegram.ui.Components.fc0 fc0Var = this.a;
        fg0 fg0Var = this.A;
        if (fg0Var.getParentActivity() == null) {
            return;
        }
        try {
            fc0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        this.b.requestFocus();
        fg0.U0(fg0Var, fc0Var, true);
        postDelayed(new se0(this, 1), 300L);
    }
}
