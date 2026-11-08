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
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class sc0 extends org.telegram.ui.Components.wt0 {
    public GoogleSignInAccount D;
    public final /* synthetic */ ce0 E;
    public final org.telegram.ui.Components.lb0 a;
    public final EditTextBoldCursor b;
    public final TextView c;
    public final org.telegram.ui.Components.w70 d;
    public final TextView e;
    public final org.telegram.ui.Components.d80 f;
    public final org.telegram.ui.Components.ch0 h;
    public Bundle n;
    public boolean r;
    public String s;
    public String w;
    public String x;
    public String y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public sc0(ce0 ce0Var, Context context) {
        super(context);
        int i7;
        this.E = ce0Var;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.ch0 ch0Var = new org.telegram.ui.Components.ch0(context);
        this.h = ch0Var;
        ch0Var.f(R.raw.tsv_setup_mail, 120, 120, null);
        ch0Var.setAutoRepeat(false);
        frameLayout.addView(ch0Var, c8.ha.e(120, 120, 1));
        if (!org.telegram.messenger.g0.O1()) {
            Point point = org.telegram.messenger.g0.q;
            if (point.x <= point.y || org.telegram.messenger.g0.Q1()) {
                i7 = 0;
                frameLayout.setVisibility(i7);
                addView(frameLayout, c8.ha.e(-1, -2, 1));
                TextView textView = new TextView(context);
                this.c = textView;
                com.google.android.recaptcha.internal.a.q(textView, 1, 18.0f);
                int i10 = 3;
                textView.setText(org.telegram.messenger.id.M0(ce0Var.F != 3 ? 2131751121 : 2131754441, null));
                textView.setGravity(17);
                textView.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                addView(textView, c8.ha.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
                org.telegram.ui.Components.w70 w70Var = new org.telegram.ui.Components.w70(context, null);
                this.d = w70Var;
                w70Var.setTextSize(1, 14.0f);
                w70Var.setGravity(17);
                w70Var.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                w70Var.setText(org.telegram.messenger.id.M0(2131754442, null));
                addView(w70Var, c8.ha.t(-2, -2, 1, 32, 8, 32, 0));
                org.telegram.ui.Components.lb0 lb0Var = new org.telegram.ui.Components.lb0(context, null);
                this.a = lb0Var;
                lb0Var.setText(org.telegram.messenger.id.M0(ce0Var.F != 3 ? 2131742810 : 2131742826, null));
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                this.b = editTextBoldCursor;
                editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setImeOptions(268435461);
                editTextBoldCursor.setTextSize(1, 17.0f);
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setInputType(33);
                int i11 = 7;
                editTextBoldCursor.setOnFocusChangeListener(new fd(this, i11));
                editTextBoldCursor.setBackground(null);
                editTextBoldCursor.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
                lb0Var.e(editTextBoldCursor);
                lb0Var.addView(editTextBoldCursor, c8.ha.e(-1, -2, 48));
                editTextBoldCursor.setOnEditorActionListener(new fa(this, i11));
                addView(lb0Var, c8.ha.k(16.0f, 24.0f, 16.0f, 0.0f, -1, 58));
                TextView textView2 = new TextView(context);
                this.e = textView2;
                textView2.setGravity(3);
                textView2.setTextSize(1, 14.0f);
                textView2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                textView2.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
                textView2.setMaxLines(2);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d ");
                Drawable drawable = context.getDrawable(R.drawable.googleg_standard_color_18);
                drawable.setBounds(0, org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(27.0f));
                spannableStringBuilder.setSpan(new ImageSpan(drawable, 0), 0, 1, 33);
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.iy(i10), 1, 2, 33);
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.id.M0(2131745324, null));
                textView2.setText(spannableStringBuilder);
                org.telegram.ui.Components.d80 d80Var = new org.telegram.ui.Components.d80(context);
                this.f = d80Var;
                addView(new Space(context), c8.ha.l(1.0f, 0, 0));
                FrameLayout frameLayout2 = new FrameLayout(context);
                frameLayout2.addView(textView2, c8.ha.d(-2, -2.0f, 83, 0.0f, 0.0f, 0.0f, 24.0f));
                frameLayout2.addView(d80Var, c8.ha.d(-2, 16.0f, 83, 0.0f, 0.0f, 0.0f, 70.0f));
                d80Var.setMeasureAfter(textView2);
                addView(frameLayout2, c8.ha.o(-1, -2));
                h6.m.g(frameLayout2);
                frameLayout2.setOnClickListener(new g40(this, 8));
            }
        }
        i7 = 8;
        frameLayout.setVisibility(i7);
        addView(frameLayout, c8.ha.e(-1, -2, 1));
        TextView textView3 = new TextView(context);
        this.c = textView3;
        com.google.android.recaptcha.internal.a.q(textView3, 1, 18.0f);
        int i102 = 3;
        textView3.setText(org.telegram.messenger.id.M0(ce0Var.F != 3 ? 2131751121 : 2131754441, null));
        textView3.setGravity(17);
        textView3.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        addView(textView3, c8.ha.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
        org.telegram.ui.Components.w70 w70Var2 = new org.telegram.ui.Components.w70(context, null);
        this.d = w70Var2;
        w70Var2.setTextSize(1, 14.0f);
        w70Var2.setGravity(17);
        w70Var2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        w70Var2.setText(org.telegram.messenger.id.M0(2131754442, null));
        addView(w70Var2, c8.ha.t(-2, -2, 1, 32, 8, 32, 0));
        org.telegram.ui.Components.lb0 lb0Var2 = new org.telegram.ui.Components.lb0(context, null);
        this.a = lb0Var2;
        lb0Var2.setText(org.telegram.messenger.id.M0(ce0Var.F != 3 ? 2131742810 : 2131742826, null));
        EditTextBoldCursor editTextBoldCursor2 = new EditTextBoldCursor(context);
        this.b = editTextBoldCursor2;
        editTextBoldCursor2.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        editTextBoldCursor2.setCursorWidth(1.5f);
        editTextBoldCursor2.setImeOptions(268435461);
        editTextBoldCursor2.setTextSize(1, 17.0f);
        editTextBoldCursor2.setMaxLines(1);
        editTextBoldCursor2.setInputType(33);
        int i112 = 7;
        editTextBoldCursor2.setOnFocusChangeListener(new fd(this, i112));
        editTextBoldCursor2.setBackground(null);
        editTextBoldCursor2.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        lb0Var2.e(editTextBoldCursor2);
        lb0Var2.addView(editTextBoldCursor2, c8.ha.e(-1, -2, 48));
        editTextBoldCursor2.setOnEditorActionListener(new fa(this, i112));
        addView(lb0Var2, c8.ha.k(16.0f, 24.0f, 16.0f, 0.0f, -1, 58));
        TextView textView22 = new TextView(context);
        this.e = textView22;
        textView22.setGravity(3);
        textView22.setTextSize(1, 14.0f);
        textView22.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        textView22.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        textView22.setMaxLines(2);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("d ");
        Drawable drawable2 = context.getDrawable(R.drawable.googleg_standard_color_18);
        drawable2.setBounds(0, org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(27.0f));
        spannableStringBuilder2.setSpan(new ImageSpan(drawable2, 0), 0, 1, 33);
        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.iy(i102), 1, 2, 33);
        spannableStringBuilder2.append((CharSequence) org.telegram.messenger.id.M0(2131745324, null));
        textView22.setText(spannableStringBuilder2);
        org.telegram.ui.Components.d80 d80Var2 = new org.telegram.ui.Components.d80(context);
        this.f = d80Var2;
        addView(new Space(context), c8.ha.l(1.0f, 0, 0));
        FrameLayout frameLayout22 = new FrameLayout(context);
        frameLayout22.addView(textView22, c8.ha.d(-2, -2.0f, 83, 0.0f, 0.0f, 0.0f, 24.0f));
        frameLayout22.addView(d80Var2, c8.ha.d(-2, 16.0f, 83, 0.0f, 0.0f, 0.0f, 70.0f));
        d80Var2.setMeasureAfter(textView22);
        addView(frameLayout22, c8.ha.o(-1, -2));
        h6.m.g(frameLayout22);
        frameLayout22.setOnClickListener(new g40(this, 8));
    }

    @Override // org.telegram.ui.Components.wt0
    public final boolean b() {
        return !this.E.h0;
    }

    @Override // org.telegram.ui.Components.wt0
    public String getHeaderName() {
        return org.telegram.messenger.id.M0(2131754441, "AddEmailTitle");
    }

    @Override // org.telegram.ui.Components.wt0
    public final void h(String str) {
        int i7;
        int i10;
        if (this.r) {
            return;
        }
        GoogleSignInAccount googleSignInAccount = this.D;
        String obj = googleSignInAccount != null ? googleSignInAccount.c : this.b.getText().toString();
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.s);
        bundle.putString("ephone", this.w);
        bundle.putString("phoneFormated", this.x);
        bundle.putString("phoneHash", this.y);
        bundle.putString("email", obj);
        bundle.putBoolean("setup", true);
        GoogleSignInAccount googleSignInAccount2 = this.D;
        ce0 ce0Var = this.E;
        if (googleSignInAccount2 != null) {
            TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
            if (ce0Var.F == 3) {
                verifyemail.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup.phone_number = this.x;
                tL_emailVerifyPurposeLoginSetup.phone_code_hash = this.y;
                verifyemail.purpose = tL_emailVerifyPurposeLoginSetup;
            }
            TLRPC.TL_emailVerificationGoogle tL_emailVerificationGoogle = new TLRPC.TL_emailVerificationGoogle();
            tL_emailVerificationGoogle.token = this.D.b;
            verifyemail.verification = tL_emailVerificationGoogle;
            this.D = null;
            i10 = ((org.telegram.ui.ActionBar.f2) ce0Var).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(verifyemail, new z9(this, bundle, verifyemail, 21), 10);
            return;
        }
        if (TextUtils.isEmpty(obj)) {
            n();
            return;
        }
        this.r = true;
        ce0Var.F1(0, true);
        TL_account.sendVerifyEmailCode sendverifyemailcode = new TL_account.sendVerifyEmailCode();
        if (ce0Var.F == 3) {
            sendverifyemailcode.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
        } else {
            TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup2 = new TLRPC.TL_emailVerifyPurposeLoginSetup();
            tL_emailVerifyPurposeLoginSetup2.phone_number = this.x;
            tL_emailVerifyPurposeLoginSetup2.phone_code_hash = this.y;
            sendverifyemailcode.purpose = tL_emailVerifyPurposeLoginSetup2;
        }
        sendverifyemailcode.email = obj;
        i7 = ((org.telegram.ui.ActionBar.f2) ce0Var).currentAccount;
        ConnectionsManager.getInstance(i7).sendRequest(sendverifyemailcode, new z9(this, bundle, sendverifyemailcode, 22), 10);
    }

    @Override // org.telegram.ui.Components.wt0
    public final void j() {
        org.telegram.messenger.g0.i3(new rc0(this, 0), ce0.y0);
    }

    @Override // org.telegram.ui.Components.wt0
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

    @Override // org.telegram.ui.Components.wt0
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

    @Override // org.telegram.ui.Components.wt0
    public final void m(Bundle bundle, boolean z9) {
        if (bundle == null) {
            return;
        }
        EditTextBoldCursor editTextBoldCursor = this.b;
        editTextBoldCursor.setText("");
        this.n = bundle;
        this.s = bundle.getString("phone");
        this.w = this.n.getString("ephone");
        this.x = this.n.getString("phoneFormated");
        this.y = this.n.getString("phoneHash");
        int i7 = (bundle.getBoolean("googleSignInAllowed") && org.telegram.messenger.tt.b.hasServices()) ? 0 : 8;
        this.f.setVisibility(i7);
        this.e.setVisibility(i7);
        ce0.b1(this.E, editTextBoldCursor);
        editTextBoldCursor.requestFocus();
    }

    public final void n() {
        org.telegram.ui.Components.lb0 lb0Var = this.a;
        ce0 ce0Var = this.E;
        if (ce0Var.getParentActivity() == null) {
            return;
        }
        try {
            lb0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        this.b.requestFocus();
        ce0.c1(ce0Var, lb0Var, true);
        postDelayed(new rc0(this, 1), 300L);
    }

    @Override // org.telegram.ui.Components.wt0
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.k6.G6;
        this.c.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i7, false));
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.D6, false);
        org.telegram.ui.Components.w70 w70Var = this.d;
        w70Var.setTextColor(x02);
        w70Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Uc, false));
        this.b.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i7, false));
        this.e.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.q6, false));
        this.f.updateColors();
        this.a.invalidate();
    }
}
