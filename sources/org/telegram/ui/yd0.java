package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class yd0 extends org.telegram.ui.Components.cv0 {
    public final EditTextBoldCursor a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final org.telegram.ui.Components.pi0 e;
    public Bundle f;
    public boolean h;
    public TL_account.Password n;
    public String r;
    public String s;
    public String v;
    public String w;
    public final org.telegram.ui.Components.fc0 x;
    public final /* synthetic */ fg0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:10:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public yd0(fg0 fg0Var, Context context) {
        super(context);
        int i9;
        this.y = fg0Var;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.pi0 pi0Var = new org.telegram.ui.Components.pi0(context);
        this.e = pi0Var;
        pi0Var.f(R.raw.tsv_setup_intro, 120, 120, null);
        pi0Var.setAutoRepeat(false);
        frameLayout.addView(pi0Var, g7.e6.e(120, 120, 1));
        if (!AndroidUtilities.isSmallScreen()) {
            Point point = AndroidUtilities.displaySize;
            if (point.x <= point.y || AndroidUtilities.isTablet()) {
                i9 = 0;
                frameLayout.setVisibility(i9);
                addView(frameLayout, g7.e6.e(-1, -2, 1));
                TextView textView = new TextView(context);
                this.d = textView;
                j3.r0.u(18.0f, 1, textView);
                textView.setText(LocaleController.getString(R.string.YourPasswordHeader));
                textView.setGravity(17);
                textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                addView(textView, g7.e6.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
                TextView textView2 = new TextView(context);
                this.b = textView2;
                textView2.setTextSize(1, 14.0f);
                textView2.setGravity(1);
                textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                textView2.setText(LocaleController.getString(R.string.LoginPasswordTextShort));
                addView(textView2, g7.e6.t(-2, -2, 1, 12, 8, 12, 0));
                org.telegram.ui.Components.fc0 fc0Var = new org.telegram.ui.Components.fc0(context, null);
                this.x = fc0Var;
                fc0Var.setText(LocaleController.getString(R.string.EnterPassword));
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                this.a = editTextBoldCursor;
                editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setBackground(null);
                editTextBoldCursor.setImeOptions(268435461);
                editTextBoldCursor.setTextSize(1, 18.0f);
                editTextBoldCursor.setMaxLines(1);
                int dp = AndroidUtilities.dp(16.0f);
                editTextBoldCursor.setPadding(dp, dp, dp, dp);
                editTextBoldCursor.setInputType(129);
                editTextBoldCursor.setTransformationMethod(PasswordTransformationMethod.getInstance());
                editTextBoldCursor.setTypeface(Typeface.DEFAULT);
                editTextBoldCursor.setGravity(!LocaleController.isRTL ? 5 : 3);
                editTextBoldCursor.setOnFocusChangeListener(new ld(this, 4));
                fc0Var.e(editTextBoldCursor);
                fc0Var.addView(editTextBoldCursor, g7.e6.e(-1, -2, 48));
                editTextBoldCursor.setOnEditorActionListener(new ea(this, 5));
                addView(fc0Var, g7.e6.t(-1, -2, 1, 16, 32, 16, 0));
                TextView textView3 = new TextView(context);
                this.c = textView3;
                textView3.setGravity(19);
                textView3.setText(LocaleController.getString(R.string.ForgotPassword));
                textView3.setTextSize(1, 15.0f);
                textView3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                textView3.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
                FrameLayout frameLayout2 = new FrameLayout(context);
                frameLayout2.addView(textView3, g7.e6.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 32.0f));
                addView(frameLayout2, g7.e6.q(-1, -1, 80));
                org.telegram.ui.Cells.e3.s2(textView3);
                textView3.setOnClickListener(new v80(6, this, context));
            }
        }
        i9 = 8;
        frameLayout.setVisibility(i9);
        addView(frameLayout, g7.e6.e(-1, -2, 1));
        TextView textView4 = new TextView(context);
        this.d = textView4;
        j3.r0.u(18.0f, 1, textView4);
        textView4.setText(LocaleController.getString(R.string.YourPasswordHeader));
        textView4.setGravity(17);
        textView4.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView4, g7.e6.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
        TextView textView22 = new TextView(context);
        this.b = textView22;
        textView22.setTextSize(1, 14.0f);
        textView22.setGravity(1);
        textView22.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView22.setText(LocaleController.getString(R.string.LoginPasswordTextShort));
        addView(textView22, g7.e6.t(-2, -2, 1, 12, 8, 12, 0));
        org.telegram.ui.Components.fc0 fc0Var2 = new org.telegram.ui.Components.fc0(context, null);
        this.x = fc0Var2;
        fc0Var2.setText(LocaleController.getString(R.string.EnterPassword));
        EditTextBoldCursor editTextBoldCursor2 = new EditTextBoldCursor(context);
        this.a = editTextBoldCursor2;
        editTextBoldCursor2.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor2.setCursorWidth(1.5f);
        editTextBoldCursor2.setBackground(null);
        editTextBoldCursor2.setImeOptions(268435461);
        editTextBoldCursor2.setTextSize(1, 18.0f);
        editTextBoldCursor2.setMaxLines(1);
        int dp2 = AndroidUtilities.dp(16.0f);
        editTextBoldCursor2.setPadding(dp2, dp2, dp2, dp2);
        editTextBoldCursor2.setInputType(129);
        editTextBoldCursor2.setTransformationMethod(PasswordTransformationMethod.getInstance());
        editTextBoldCursor2.setTypeface(Typeface.DEFAULT);
        editTextBoldCursor2.setGravity(!LocaleController.isRTL ? 5 : 3);
        editTextBoldCursor2.setOnFocusChangeListener(new ld(this, 4));
        fc0Var2.e(editTextBoldCursor2);
        fc0Var2.addView(editTextBoldCursor2, g7.e6.e(-1, -2, 48));
        editTextBoldCursor2.setOnEditorActionListener(new ea(this, 5));
        addView(fc0Var2, g7.e6.t(-1, -2, 1, 16, 32, 16, 0));
        TextView textView32 = new TextView(context);
        this.c = textView32;
        textView32.setGravity(19);
        textView32.setText(LocaleController.getString(R.string.ForgotPassword));
        textView32.setTextSize(1, 15.0f);
        textView32.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView32.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        FrameLayout frameLayout22 = new FrameLayout(context);
        frameLayout22.addView(textView32, g7.e6.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 32.0f));
        addView(frameLayout22, g7.e6.q(-1, -1, 80));
        org.telegram.ui.Cells.e3.s2(textView32);
        textView32.setOnClickListener(new v80(6, this, context));
    }

    @Override // org.telegram.ui.Components.cv0
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Components.cv0
    public final boolean c(boolean z10) {
        this.h = false;
        this.y.k1(true, true);
        this.f = null;
        return true;
    }

    @Override // org.telegram.ui.Components.cv0
    public final void d() {
        this.h = false;
    }

    @Override // org.telegram.ui.Components.cv0
    public String getHeaderName() {
        return LocaleController.getString("LoginPassword", R.string.LoginPassword);
    }

    @Override // org.telegram.ui.Components.cv0
    public final void h(String str) {
        if (this.h || this.n == null) {
            return;
        }
        String obj = this.a.getText().toString();
        if (obj.length() != 0) {
            this.h = true;
            this.y.n1(0, true);
            Utilities.globalQueue.postRunnable(new x20(25, this, obj));
        } else {
            fg0 fg0Var = this.y;
            if (fg0Var.getParentActivity() == null) {
                return;
            }
            fg0.U0(fg0Var, this.x, true);
        }
    }

    @Override // org.telegram.ui.Components.cv0
    public final void j() {
        AndroidUtilities.runOnUIThread(new o00(this, 19), fg0.p0);
    }

    @Override // org.telegram.ui.Components.cv0
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("passview_params");
        this.f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("passview_code");
        if (string != null) {
            this.a.setText(string);
        }
    }

    @Override // org.telegram.ui.Components.cv0
    public final void l(Bundle bundle) {
        String obj = this.a.getText().toString();
        if (obj.length() != 0) {
            bundle.putString("passview_code", obj);
        }
        Bundle bundle2 = this.f;
        if (bundle2 != null) {
            bundle.putBundle("passview_params", bundle2);
        }
    }

    @Override // org.telegram.ui.Components.cv0
    public final void m(Bundle bundle, boolean z10) {
        if (bundle == null) {
            return;
        }
        boolean isEmpty = bundle.isEmpty();
        EditTextBoldCursor editTextBoldCursor = this.a;
        if (isEmpty) {
            AndroidUtilities.hideKeyboard(editTextBoldCursor);
            return;
        }
        editTextBoldCursor.setText("");
        this.f = bundle;
        String string = bundle.getString("password");
        this.r = string;
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
            this.n = TL_account.Password.TLdeserialize(serializedData, serializedData.readInt32(false), false);
        }
        this.s = bundle.getString("phoneFormated");
        this.v = bundle.getString("phoneHash");
        this.w = bundle.getString("code");
        TL_account.Password password = this.n;
        if (password == null || TextUtils.isEmpty(password.hint)) {
            editTextBoldCursor.setHint((CharSequence) null);
        } else {
            editTextBoldCursor.setHint(this.n.hint);
        }
    }

    @Override // org.telegram.ui.Components.cv0
    public final void n() {
        int i9 = org.telegram.ui.ActionBar.f6.G6;
        this.d.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        this.b.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.D6, false));
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, i9, false);
        EditTextBoldCursor editTextBoldCursor = this.a;
        editTextBoldCursor.setTextColor(w02);
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.H6, false));
        this.c.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q6, false));
        this.x.f();
    }
}
