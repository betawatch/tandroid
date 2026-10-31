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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class zd0 extends org.telegram.ui.Components.zu0 {
    public GoogleSignInAccount D;
    public final /* synthetic */ hf0 E;
    public final org.telegram.ui.Components.ec0 a;
    public final EditTextBoldCursor b;
    public final TextView c;
    public final org.telegram.ui.Components.p80 d;
    public final TextView e;
    public final org.telegram.ui.Components.w80 f;
    public final org.telegram.ui.Components.ei0 h;
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
    public zd0(hf0 hf0Var, Context context) {
        super(context);
        int i10;
        this.E = hf0Var;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.ei0 ei0Var = new org.telegram.ui.Components.ei0(context);
        this.h = ei0Var;
        ei0Var.f(R.raw.tsv_setup_mail, 120, 120, null);
        ei0Var.setAutoRepeat(false);
        frameLayout.addView(ei0Var, w7.b6.e(120, 120, 1));
        if (!org.telegram.messenger.i0.O1()) {
            Point point = org.telegram.messenger.i0.q;
            if (point.x <= point.y || org.telegram.messenger.i0.Q1()) {
                i10 = 0;
                frameLayout.setVisibility(i10);
                addView(frameLayout, w7.b6.e(-1, -2, 1));
                TextView textView = new TextView(context);
                this.c = textView;
                sc.e.t(textView, 1, 18.0f);
                int i11 = 3;
                textView.setText(org.telegram.messenger.cd.L0(hf0Var.F != 3 ? 2131751121 : 2131754441, null));
                textView.setGravity(17);
                textView.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
                addView(textView, w7.b6.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
                org.telegram.ui.Components.p80 p80Var = new org.telegram.ui.Components.p80(context, null);
                this.d = p80Var;
                p80Var.setTextSize(1, 14.0f);
                p80Var.setGravity(17);
                p80Var.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
                p80Var.setText(org.telegram.messenger.cd.L0(2131754442, null));
                addView(p80Var, w7.b6.t(-2, -2, 1, 32, 8, 32, 0));
                org.telegram.ui.Components.ec0 ec0Var = new org.telegram.ui.Components.ec0(context, null);
                this.a = ec0Var;
                ec0Var.setText(org.telegram.messenger.cd.L0(hf0Var.F != 3 ? 2131742832 : 2131742848, null));
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                this.b = editTextBoldCursor;
                editTextBoldCursor.setCursorSize(org.telegram.messenger.i0.L(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setImeOptions(268435461);
                editTextBoldCursor.setTextSize(1, 17.0f);
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setInputType(33);
                int i12 = 7;
                editTextBoldCursor.setOnFocusChangeListener(new od(this, i12));
                editTextBoldCursor.setBackground(null);
                editTextBoldCursor.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f));
                ec0Var.e(editTextBoldCursor);
                ec0Var.addView(editTextBoldCursor, w7.b6.e(-1, -2, 48));
                editTextBoldCursor.setOnEditorActionListener(new ha(this, i12));
                addView(ec0Var, w7.b6.k(16.0f, 24.0f, 16.0f, 0.0f, -1, 58));
                TextView textView2 = new TextView(context);
                this.e = textView2;
                textView2.setGravity(3);
                textView2.setTextSize(1, 14.0f);
                textView2.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
                textView2.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f));
                textView2.setMaxLines(2);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d ");
                Drawable drawable = context.getDrawable(R.drawable.googleg_standard_color_18);
                drawable.setBounds(0, org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(27.0f));
                spannableStringBuilder.setSpan(new ImageSpan(drawable, 0), 0, 1, 33);
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.wy(i11), 1, 2, 33);
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.cd.L0(2131745339, null));
                textView2.setText(spannableStringBuilder);
                org.telegram.ui.Components.w80 w80Var = new org.telegram.ui.Components.w80(context);
                this.f = w80Var;
                addView(new Space(context), w7.b6.l(1.0f, 0, 0));
                FrameLayout frameLayout2 = new FrameLayout(context);
                frameLayout2.addView(textView2, w7.b6.d(-2, -2.0f, 83, 0.0f, 0.0f, 0.0f, 24.0f));
                frameLayout2.addView(w80Var, w7.b6.d(-2, 16.0f, 83, 0.0f, 0.0f, 0.0f, 70.0f));
                w80Var.setMeasureAfter(textView2);
                addView(frameLayout2, w7.b6.o(-1, -2));
                li.k.i(frameLayout2);
                frameLayout2.setOnClickListener(new f50(this, 8));
            }
        }
        i10 = 8;
        frameLayout.setVisibility(i10);
        addView(frameLayout, w7.b6.e(-1, -2, 1));
        TextView textView3 = new TextView(context);
        this.c = textView3;
        sc.e.t(textView3, 1, 18.0f);
        int i112 = 3;
        textView3.setText(org.telegram.messenger.cd.L0(hf0Var.F != 3 ? 2131751121 : 2131754441, null));
        textView3.setGravity(17);
        textView3.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
        addView(textView3, w7.b6.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
        org.telegram.ui.Components.p80 p80Var2 = new org.telegram.ui.Components.p80(context, null);
        this.d = p80Var2;
        p80Var2.setTextSize(1, 14.0f);
        p80Var2.setGravity(17);
        p80Var2.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
        p80Var2.setText(org.telegram.messenger.cd.L0(2131754442, null));
        addView(p80Var2, w7.b6.t(-2, -2, 1, 32, 8, 32, 0));
        org.telegram.ui.Components.ec0 ec0Var2 = new org.telegram.ui.Components.ec0(context, null);
        this.a = ec0Var2;
        ec0Var2.setText(org.telegram.messenger.cd.L0(hf0Var.F != 3 ? 2131742832 : 2131742848, null));
        EditTextBoldCursor editTextBoldCursor2 = new EditTextBoldCursor(context);
        this.b = editTextBoldCursor2;
        editTextBoldCursor2.setCursorSize(org.telegram.messenger.i0.L(20.0f));
        editTextBoldCursor2.setCursorWidth(1.5f);
        editTextBoldCursor2.setImeOptions(268435461);
        editTextBoldCursor2.setTextSize(1, 17.0f);
        editTextBoldCursor2.setMaxLines(1);
        editTextBoldCursor2.setInputType(33);
        int i122 = 7;
        editTextBoldCursor2.setOnFocusChangeListener(new od(this, i122));
        editTextBoldCursor2.setBackground(null);
        editTextBoldCursor2.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f));
        ec0Var2.e(editTextBoldCursor2);
        ec0Var2.addView(editTextBoldCursor2, w7.b6.e(-1, -2, 48));
        editTextBoldCursor2.setOnEditorActionListener(new ha(this, i122));
        addView(ec0Var2, w7.b6.k(16.0f, 24.0f, 16.0f, 0.0f, -1, 58));
        TextView textView22 = new TextView(context);
        this.e = textView22;
        textView22.setGravity(3);
        textView22.setTextSize(1, 14.0f);
        textView22.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
        textView22.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f));
        textView22.setMaxLines(2);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("d ");
        Drawable drawable2 = context.getDrawable(R.drawable.googleg_standard_color_18);
        drawable2.setBounds(0, org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(27.0f));
        spannableStringBuilder2.setSpan(new ImageSpan(drawable2, 0), 0, 1, 33);
        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.wy(i112), 1, 2, 33);
        spannableStringBuilder2.append((CharSequence) org.telegram.messenger.cd.L0(2131745339, null));
        textView22.setText(spannableStringBuilder2);
        org.telegram.ui.Components.w80 w80Var2 = new org.telegram.ui.Components.w80(context);
        this.f = w80Var2;
        addView(new Space(context), w7.b6.l(1.0f, 0, 0));
        FrameLayout frameLayout22 = new FrameLayout(context);
        frameLayout22.addView(textView22, w7.b6.d(-2, -2.0f, 83, 0.0f, 0.0f, 0.0f, 24.0f));
        frameLayout22.addView(w80Var2, w7.b6.d(-2, 16.0f, 83, 0.0f, 0.0f, 0.0f, 70.0f));
        w80Var2.setMeasureAfter(textView22);
        addView(frameLayout22, w7.b6.o(-1, -2));
        li.k.i(frameLayout22);
        frameLayout22.setOnClickListener(new f50(this, 8));
    }

    @Override // org.telegram.ui.Components.zu0
    public final boolean b() {
        return !this.E.h0;
    }

    @Override // org.telegram.ui.Components.zu0
    public String getHeaderName() {
        return org.telegram.messenger.cd.L0(2131754441, "AddEmailTitle");
    }

    @Override // org.telegram.ui.Components.zu0
    public final void h(String str) {
        int i10;
        int i11;
        if (this.r) {
            return;
        }
        GoogleSignInAccount googleSignInAccount = this.D;
        String obj = googleSignInAccount != null ? googleSignInAccount.d : this.b.getText().toString();
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.s);
        bundle.putString("ephone", this.w);
        bundle.putString("phoneFormated", this.x);
        bundle.putString("phoneHash", this.y);
        bundle.putString("email", obj);
        bundle.putBoolean("setup", true);
        GoogleSignInAccount googleSignInAccount2 = this.D;
        hf0 hf0Var = this.E;
        if (googleSignInAccount2 != null) {
            TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
            if (hf0Var.F == 3) {
                verifyemail.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup.phone_number = this.x;
                tL_emailVerifyPurposeLoginSetup.phone_code_hash = this.y;
                verifyemail.purpose = tL_emailVerifyPurposeLoginSetup;
            }
            TLRPC.TL_emailVerificationGoogle tL_emailVerificationGoogle = new TLRPC.TL_emailVerificationGoogle();
            tL_emailVerificationGoogle.token = this.D.c;
            verifyemail.verification = tL_emailVerificationGoogle;
            this.D = null;
            i11 = ((org.telegram.ui.ActionBar.k2) hf0Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(verifyemail, new aa(this, bundle, verifyemail, 21), 10);
            return;
        }
        if (TextUtils.isEmpty(obj)) {
            n();
            return;
        }
        this.r = true;
        hf0Var.v1(0, true);
        TL_account.sendVerifyEmailCode sendverifyemailcode = new TL_account.sendVerifyEmailCode();
        if (hf0Var.F == 3) {
            sendverifyemailcode.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
        } else {
            TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup2 = new TLRPC.TL_emailVerifyPurposeLoginSetup();
            tL_emailVerifyPurposeLoginSetup2.phone_number = this.x;
            tL_emailVerifyPurposeLoginSetup2.phone_code_hash = this.y;
            sendverifyemailcode.purpose = tL_emailVerifyPurposeLoginSetup2;
        }
        sendverifyemailcode.email = obj;
        i10 = ((org.telegram.ui.ActionBar.k2) hf0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(sendverifyemailcode, new aa(this, bundle, sendverifyemailcode, 22), 10);
    }

    @Override // org.telegram.ui.Components.zu0
    public final void j() {
        org.telegram.messenger.i0.h3(new yd0(this, 0), hf0.y0);
    }

    @Override // org.telegram.ui.Components.zu0
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

    @Override // org.telegram.ui.Components.zu0
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

    @Override // org.telegram.ui.Components.zu0
    public final void m(Bundle bundle, boolean z10) {
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
        int i10 = (bundle.getBoolean("googleSignInAllowed") && org.telegram.messenger.eu.b.hasServices()) ? 0 : 8;
        this.f.setVisibility(i10);
        this.e.setVisibility(i10);
        hf0.Z0(this.E, editTextBoldCursor);
        editTextBoldCursor.requestFocus();
    }

    public final void n() {
        org.telegram.ui.Components.ec0 ec0Var = this.a;
        hf0 hf0Var = this.E;
        if (hf0Var.getParentActivity() == null) {
            return;
        }
        try {
            ec0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        this.b.requestFocus();
        hf0.a1(hf0Var, ec0Var, true);
        postDelayed(new yd0(this, 1), 300L);
    }

    @Override // org.telegram.ui.Components.zu0
    public final void updateColors() {
        int i10 = org.telegram.ui.ActionBar.t6.G6;
        this.c.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i10, false));
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.D6, false);
        org.telegram.ui.Components.p80 p80Var = this.d;
        p80Var.setTextColor(x02);
        p80Var.setLinkTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Uc, false));
        this.b.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i10, false));
        this.e.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.q6, false));
        this.f.updateColors();
        this.a.invalidate();
    }
}
