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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ve0 extends org.telegram.ui.Components.ax0 {
    public final /* synthetic */ gg0 E;
    public final org.telegram.ui.Components.rd0 a;
    public final EditTextBoldCursor b;
    public final TextView c;
    public final org.telegram.ui.Components.z90 d;
    public final TextView e;
    public final org.telegram.ui.Components.ga0 f;
    public final org.telegram.ui.Components.ak0 h;
    public Bundle n;
    public boolean r;
    public String s;
    public String v;
    public String w;
    public String x;
    public GoogleSignInAccount y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ve0(gg0 gg0Var, Context context) {
        super(context);
        int i10;
        this.E = gg0Var;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.ak0 ak0Var = new org.telegram.ui.Components.ak0(context);
        this.h = ak0Var;
        ak0Var.f(R.raw.tsv_setup_mail, 120, 120, null);
        ak0Var.setAutoRepeat(false);
        frameLayout.addView(ak0Var, org.telegram.ui.Components.gb1.i(120, 120, 1));
        if (!AndroidUtilities.isSmallScreen()) {
            Point point = AndroidUtilities.displaySize;
            if (point.x <= point.y || AndroidUtilities.isTablet()) {
                i10 = 0;
                frameLayout.setVisibility(i10);
                addView(frameLayout, org.telegram.ui.Components.gb1.i(-1, -2, 1));
                TextView textView = new TextView(context);
                this.c = textView;
                ic.a.o(18.0f, 1, textView);
                textView.setText(LocaleController.getString(gg0Var.F != 3 ? R.string.EnterNewEmail : R.string.AddEmailTitle));
                textView.setGravity(17);
                textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                addView(textView, org.telegram.ui.Components.gb1.h(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
                org.telegram.ui.Components.z90 z90Var = new org.telegram.ui.Components.z90(context, null);
                this.d = z90Var;
                z90Var.setTextSize(1, 14.0f);
                z90Var.setGravity(17);
                z90Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                z90Var.setText(LocaleController.getString(R.string.AddEmailSubtitle));
                addView(z90Var, org.telegram.ui.Components.gb1.x(-2, -2, 1, 32, 8, 32, 0));
                org.telegram.ui.Components.rd0 rd0Var = new org.telegram.ui.Components.rd0(context, null);
                this.a = rd0Var;
                rd0Var.setText(LocaleController.getString(gg0Var.F != 3 ? R.string.YourNewEmail : R.string.YourEmail));
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                this.b = editTextBoldCursor;
                editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setImeOptions(268435461);
                editTextBoldCursor.setTextSize(1, 17.0f);
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setInputType(33);
                int i11 = 7;
                editTextBoldCursor.setOnFocusChangeListener(new rd(this, i11));
                editTextBoldCursor.setBackground(null);
                editTextBoldCursor.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                rd0Var.e(editTextBoldCursor);
                rd0Var.addView(editTextBoldCursor, org.telegram.ui.Components.gb1.i(-1, -2, 48));
                editTextBoldCursor.setOnEditorActionListener(new la(this, i11));
                addView(rd0Var, org.telegram.ui.Components.gb1.o(16.0f, 24.0f, 16.0f, 0.0f, -1, 58));
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
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.tz(3), 1, 2, 33);
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.SignInWithGoogle));
                textView2.setText(spannableStringBuilder);
                org.telegram.ui.Components.ga0 ga0Var = new org.telegram.ui.Components.ga0(context);
                this.f = ga0Var;
                addView(new Space(context), org.telegram.ui.Components.gb1.p(1.0f, 0, 0));
                FrameLayout frameLayout2 = new FrameLayout(context);
                frameLayout2.addView(textView2, org.telegram.ui.Components.gb1.h(-2, -2.0f, 83, 0.0f, 0.0f, 0.0f, 24.0f));
                frameLayout2.addView(ga0Var, org.telegram.ui.Components.gb1.h(-2, 16.0f, 83, 0.0f, 0.0f, 0.0f, 70.0f));
                ga0Var.setMeasureAfter(textView2);
                addView(frameLayout2, org.telegram.ui.Components.gb1.r(-1, -2));
                k6.c.h(frameLayout2);
                frameLayout2.setOnClickListener(new x50(this, 9));
            }
        }
        i10 = 8;
        frameLayout.setVisibility(i10);
        addView(frameLayout, org.telegram.ui.Components.gb1.i(-1, -2, 1));
        TextView textView3 = new TextView(context);
        this.c = textView3;
        ic.a.o(18.0f, 1, textView3);
        textView3.setText(LocaleController.getString(gg0Var.F != 3 ? R.string.EnterNewEmail : R.string.AddEmailTitle));
        textView3.setGravity(17);
        textView3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView3, org.telegram.ui.Components.gb1.h(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
        org.telegram.ui.Components.z90 z90Var2 = new org.telegram.ui.Components.z90(context, null);
        this.d = z90Var2;
        z90Var2.setTextSize(1, 14.0f);
        z90Var2.setGravity(17);
        z90Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        z90Var2.setText(LocaleController.getString(R.string.AddEmailSubtitle));
        addView(z90Var2, org.telegram.ui.Components.gb1.x(-2, -2, 1, 32, 8, 32, 0));
        org.telegram.ui.Components.rd0 rd0Var2 = new org.telegram.ui.Components.rd0(context, null);
        this.a = rd0Var2;
        rd0Var2.setText(LocaleController.getString(gg0Var.F != 3 ? R.string.YourNewEmail : R.string.YourEmail));
        EditTextBoldCursor editTextBoldCursor2 = new EditTextBoldCursor(context);
        this.b = editTextBoldCursor2;
        editTextBoldCursor2.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor2.setCursorWidth(1.5f);
        editTextBoldCursor2.setImeOptions(268435461);
        editTextBoldCursor2.setTextSize(1, 17.0f);
        editTextBoldCursor2.setMaxLines(1);
        editTextBoldCursor2.setInputType(33);
        int i112 = 7;
        editTextBoldCursor2.setOnFocusChangeListener(new rd(this, i112));
        editTextBoldCursor2.setBackground(null);
        editTextBoldCursor2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        rd0Var2.e(editTextBoldCursor2);
        rd0Var2.addView(editTextBoldCursor2, org.telegram.ui.Components.gb1.i(-1, -2, 48));
        editTextBoldCursor2.setOnEditorActionListener(new la(this, i112));
        addView(rd0Var2, org.telegram.ui.Components.gb1.o(16.0f, 24.0f, 16.0f, 0.0f, -1, 58));
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
        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.tz(3), 1, 2, 33);
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.SignInWithGoogle));
        textView22.setText(spannableStringBuilder2);
        org.telegram.ui.Components.ga0 ga0Var2 = new org.telegram.ui.Components.ga0(context);
        this.f = ga0Var2;
        addView(new Space(context), org.telegram.ui.Components.gb1.p(1.0f, 0, 0));
        FrameLayout frameLayout22 = new FrameLayout(context);
        frameLayout22.addView(textView22, org.telegram.ui.Components.gb1.h(-2, -2.0f, 83, 0.0f, 0.0f, 0.0f, 24.0f));
        frameLayout22.addView(ga0Var2, org.telegram.ui.Components.gb1.h(-2, 16.0f, 83, 0.0f, 0.0f, 0.0f, 70.0f));
        ga0Var2.setMeasureAfter(textView22);
        addView(frameLayout22, org.telegram.ui.Components.gb1.r(-1, -2));
        k6.c.h(frameLayout22);
        frameLayout22.setOnClickListener(new x50(this, 9));
    }

    @Override // org.telegram.ui.Components.ax0
    public final boolean b() {
        return !this.E.h0;
    }

    @Override // org.telegram.ui.Components.ax0
    public String getHeaderName() {
        return LocaleController.getString("AddEmailTitle", R.string.AddEmailTitle);
    }

    @Override // org.telegram.ui.Components.ax0
    public final void h(String str) {
        int i10;
        int i11;
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
        gg0 gg0Var = this.E;
        if (googleSignInAccount2 != null) {
            TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
            if (gg0Var.F == 3) {
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
            i11 = ((org.telegram.ui.ActionBar.r2) gg0Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(verifyemail, new ea(this, bundle, verifyemail, 21), 10);
            return;
        }
        if (TextUtils.isEmpty(obj)) {
            n();
            return;
        }
        this.r = true;
        gg0Var.s1(0, true);
        TL_account.sendVerifyEmailCode sendverifyemailcode = new TL_account.sendVerifyEmailCode();
        if (gg0Var.F == 3) {
            sendverifyemailcode.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
        } else {
            TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup2 = new TLRPC.TL_emailVerifyPurposeLoginSetup();
            tL_emailVerifyPurposeLoginSetup2.phone_number = this.w;
            tL_emailVerifyPurposeLoginSetup2.phone_code_hash = this.x;
            sendverifyemailcode.purpose = tL_emailVerifyPurposeLoginSetup2;
        }
        sendverifyemailcode.email = obj;
        i10 = ((org.telegram.ui.ActionBar.r2) gg0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(sendverifyemailcode, new ea(this, bundle, sendverifyemailcode, 22), 10);
    }

    @Override // org.telegram.ui.Components.ax0
    public final void j() {
        AndroidUtilities.runOnUIThread(new te0(this, 0), gg0.x0);
    }

    @Override // org.telegram.ui.Components.ax0
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

    @Override // org.telegram.ui.Components.ax0
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

    @Override // org.telegram.ui.Components.ax0
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
        int i10 = (bundle.getBoolean("googleSignInAllowed") && PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices()) ? 0 : 8;
        this.f.setVisibility(i10);
        this.e.setVisibility(i10);
        gg0.W0(this.E, editTextBoldCursor);
        editTextBoldCursor.requestFocus();
    }

    public final void n() {
        org.telegram.ui.Components.rd0 rd0Var = this.a;
        gg0 gg0Var = this.E;
        if (gg0Var.getParentActivity() == null) {
            return;
        }
        try {
            rd0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        this.b.requestFocus();
        gg0.X0(gg0Var, rd0Var, true);
        postDelayed(new te0(this, 1), 300L);
    }

    @Override // org.telegram.ui.Components.ax0, org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        int i10 = org.telegram.ui.ActionBar.y6.G6;
        this.c.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, i10, false));
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.D6, false);
        org.telegram.ui.Components.z90 z90Var = this.d;
        z90Var.setTextColor(x02);
        z90Var.setLinkTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.gc, false));
        this.b.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, i10, false));
        this.e.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.q6, false));
        this.f.updateColors();
        this.a.invalidate();
    }
}
