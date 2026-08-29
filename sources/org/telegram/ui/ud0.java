package org.telegram.ui;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ud0 extends org.telegram.ui.Components.mv0 {
    public final /* synthetic */ fg0 A;
    public final org.telegram.ui.Components.uc0[] a;
    public final EditTextBoldCursor[] b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final ImageView f;
    public String h;
    public String n;
    public String r;
    public TL_account.Password s;
    public Bundle v;
    public boolean w;
    public final int x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ud0(fg0 fg0Var, Context context, int i10) {
        super(context);
        this.A = fg0Var;
        this.x = i10;
        setOrientation(1);
        int i11 = i10 == 1 ? 1 : 2;
        this.b = new EditTextBoldCursor[i11];
        this.a = new org.telegram.ui.Components.uc0[i11];
        TextView textView = new TextView(context);
        this.c = textView;
        float f9 = 18.0f;
        textView.setTextSize(1, 18.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView.setGravity(49);
        textView.setText(LocaleController.getString(R.string.SetNewPassword));
        addView(textView, i7.f6.t(-2, -2, 1, 8, AndroidUtilities.isSmallScreen() ? 16 : 72, 8, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity(1);
        textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView2, i7.f6.t(-2, -2, 1, 8, 6, 8, 16));
        final int i12 = 0;
        while (i12 < this.b.length) {
            org.telegram.ui.Components.uc0 uc0Var = new org.telegram.ui.Components.uc0(context, null);
            this.a[i12] = uc0Var;
            uc0Var.setText(LocaleController.getString(i10 == 0 ? i12 == 0 ? R.string.PleaseEnterNewFirstPasswordHint : R.string.PleaseEnterNewSecondPasswordHint : R.string.PasswordHintPlaceholder));
            this.b[i12] = new EditTextBoldCursor(context);
            this.b[i12].setCursorSize(AndroidUtilities.dp(20.0f));
            this.b[i12].setCursorWidth(1.5f);
            this.b[i12].setImeOptions(268435461);
            this.b[i12].setTextSize(1, f9);
            this.b[i12].setMaxLines(1);
            this.b[i12].setBackground(null);
            int dp = AndroidUtilities.dp(16.0f);
            this.b[i12].setPadding(dp, dp, dp, dp);
            if (i10 == 0) {
                this.b[i12].setInputType(129);
                this.b[i12].setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            this.b[i12].setTypeface(Typeface.DEFAULT);
            this.b[i12].setGravity(LocaleController.isRTL ? 5 : 3);
            EditTextBoldCursor editTextBoldCursor = this.b[i12];
            boolean z10 = i12 == 0 && i10 == 0;
            editTextBoldCursor.addTextChangedListener(new bg.e4(this, z10));
            this.b[i12].setOnFocusChangeListener(new kd(uc0Var, 3));
            if (z10) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                linearLayout.setGravity(16);
                linearLayout.addView(this.b[i12], i7.f6.l(1.0f, 0, -2));
                ImageView imageView = new ImageView(context);
                this.f = imageView;
                imageView.setImageResource(R.drawable.msg_message);
                AndroidUtilities.updateViewVisibilityAnimated(imageView, true, 0.1f, false);
                final int i13 = 0;
                imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.rd0
                    public final /* synthetic */ ud0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i13) {
                            case 0:
                                ud0 ud0Var = this.b;
                                ImageView imageView2 = ud0Var.f;
                                EditTextBoldCursor[] editTextBoldCursorArr = ud0Var.b;
                                ud0Var.y = !ud0Var.y;
                                for (int i14 = 0; i14 < editTextBoldCursorArr.length; i14++) {
                                    int selectionStart = editTextBoldCursorArr[i14].getSelectionStart();
                                    int selectionEnd = editTextBoldCursorArr[i14].getSelectionEnd();
                                    editTextBoldCursorArr[i14].setInputType((ud0Var.y ? 144 : 128) | 1);
                                    editTextBoldCursorArr[i14].setSelection(selectionStart, selectionEnd);
                                }
                                imageView2.setTag(Boolean.valueOf(ud0Var.y));
                                imageView2.setColorFilter(org.telegram.ui.ActionBar.g6.w0(null, ud0Var.y ? org.telegram.ui.ActionBar.g6.l6 : org.telegram.ui.ActionBar.g6.H6, false));
                                break;
                            default:
                                ud0 ud0Var2 = this.b;
                                if (ud0Var2.x == 0) {
                                    ud0Var2.o(null, null);
                                    break;
                                } else {
                                    ud0Var2.o(ud0Var2.n, null);
                                    break;
                                }
                        }
                    }
                });
                linearLayout.addView(imageView, i7.f6.u(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
                uc0Var.addView(linearLayout, i7.f6.c(-2.0f, -1));
            } else {
                uc0Var.addView(this.b[i12], i7.f6.c(-2.0f, -1));
            }
            uc0Var.e(this.b[i12]);
            addView(uc0Var, i7.f6.t(-1, -2, 1, 16, 16, 16, 0));
            this.b[i12].setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.sd0
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView3, int i14, KeyEvent keyEvent) {
                    ud0 ud0Var = ud0.this;
                    if (i12 == 0) {
                        EditTextBoldCursor[] editTextBoldCursorArr = ud0Var.b;
                        if (editTextBoldCursorArr.length == 2) {
                            editTextBoldCursorArr[1].requestFocus();
                            return true;
                        }
                    }
                    if (i14 == 5) {
                        ud0Var.h(null);
                        return true;
                    }
                    ud0Var.getClass();
                    return false;
                }
            });
            i12++;
            f9 = 18.0f;
        }
        if (i10 == 0) {
            this.d.setText(LocaleController.getString("PleaseEnterNewFirstPasswordLogin", R.string.PleaseEnterNewFirstPasswordLogin));
        } else {
            this.d.setText(LocaleController.getString("PasswordHintTextLogin", R.string.PasswordHintTextLogin));
        }
        TextView textView3 = new TextView(context);
        this.e = textView3;
        textView3.setGravity(19);
        textView3.setTextSize(1, 15.0f);
        textView3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView3.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        textView3.setText(LocaleController.getString(R.string.YourEmailSkip));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(textView3, i7.f6.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 32.0f));
        addView(frameLayout, i7.f6.q(-1, -1, 80));
        oc.i.K1(textView3);
        final int i14 = 1;
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.rd0
            public final /* synthetic */ ud0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        ud0 ud0Var = this.b;
                        ImageView imageView2 = ud0Var.f;
                        EditTextBoldCursor[] editTextBoldCursorArr = ud0Var.b;
                        ud0Var.y = !ud0Var.y;
                        for (int i142 = 0; i142 < editTextBoldCursorArr.length; i142++) {
                            int selectionStart = editTextBoldCursorArr[i142].getSelectionStart();
                            int selectionEnd = editTextBoldCursorArr[i142].getSelectionEnd();
                            editTextBoldCursorArr[i142].setInputType((ud0Var.y ? 144 : 128) | 1);
                            editTextBoldCursorArr[i142].setSelection(selectionStart, selectionEnd);
                        }
                        imageView2.setTag(Boolean.valueOf(ud0Var.y));
                        imageView2.setColorFilter(org.telegram.ui.ActionBar.g6.w0(null, ud0Var.y ? org.telegram.ui.ActionBar.g6.l6 : org.telegram.ui.ActionBar.g6.H6, false));
                        break;
                    default:
                        ud0 ud0Var2 = this.b;
                        if (ud0Var2.x == 0) {
                            ud0Var2.o(null, null);
                            break;
                        } else {
                            ud0Var2.o(ud0Var2.n, null);
                            break;
                        }
                }
            }
        });
    }

    @Override // org.telegram.ui.Components.mv0
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Components.mv0
    public final boolean c(boolean z10) {
        this.A.k1(true, true);
        this.v = null;
        this.w = false;
        return true;
    }

    @Override // org.telegram.ui.Components.mv0
    public final void d() {
        this.w = false;
    }

    @Override // org.telegram.ui.Components.mv0
    public String getHeaderName() {
        return LocaleController.getString("NewPassword", R.string.NewPassword);
    }

    @Override // org.telegram.ui.Components.mv0
    public final void h(String str) {
        if (this.w) {
            return;
        }
        EditTextBoldCursor[] editTextBoldCursorArr = this.b;
        String obj = editTextBoldCursorArr[0].getText().toString();
        int length = obj.length();
        fg0 fg0Var = this.A;
        if (length == 0) {
            if (fg0Var.getParentActivity() == null) {
                return;
            }
            try {
                editTextBoldCursorArr[0].performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            AndroidUtilities.shakeView(editTextBoldCursorArr[0]);
            return;
        }
        if (this.x != 0) {
            this.w = true;
            fg0Var.n1(0, true);
            o(this.n, obj);
        } else {
            if (!obj.equals(editTextBoldCursorArr[1].getText().toString())) {
                if (fg0Var.getParentActivity() == null) {
                    return;
                }
                try {
                    editTextBoldCursorArr[1].performHapticFeedback(3, 2);
                } catch (Exception unused2) {
                }
                AndroidUtilities.shakeView(editTextBoldCursorArr[1]);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("emailCode", this.h);
            bundle.putString("new_password", obj);
            bundle.putString("password", this.r);
            fg0Var.u1(10, true, bundle, false);
        }
    }

    @Override // org.telegram.ui.Components.mv0
    public final void j() {
        AndroidUtilities.runOnUIThread(new q00(this, 18), fg0.p0);
    }

    @Override // org.telegram.ui.Components.mv0
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_params" + this.x);
        this.v = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
    }

    @Override // org.telegram.ui.Components.mv0
    public final void l(Bundle bundle) {
        if (this.v != null) {
            bundle.putBundle("recoveryview_params" + this.x, this.v);
        }
    }

    @Override // org.telegram.ui.Components.mv0
    public final void m(Bundle bundle, boolean z10) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        if (bundle == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            editTextBoldCursorArr = this.b;
            if (i10 >= editTextBoldCursorArr.length) {
                break;
            }
            editTextBoldCursorArr[i10].setText("");
            i10++;
        }
        this.v = bundle;
        this.h = bundle.getString("emailCode");
        String string = this.v.getString("password");
        this.r = string;
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
            TL_account.Password TLdeserialize = TL_account.Password.TLdeserialize(serializedData, serializedData.readInt32(false), false);
            this.s = TLdeserialize;
            TwoStepVerificationActivity.m0(TLdeserialize);
        }
        this.n = this.v.getString("new_password");
        fg0.T0(this.A, editTextBoldCursorArr[0]);
        editTextBoldCursorArr[0].requestFocus();
    }

    @Override // org.telegram.ui.Components.mv0
    public final void n() {
        this.c.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
        this.d.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.D6, false));
        for (EditTextBoldCursor editTextBoldCursor : this.b) {
            editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
            editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.l6, false));
        }
        for (org.telegram.ui.Components.uc0 uc0Var : this.a) {
            uc0Var.f();
        }
        this.e.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q6, false));
        ImageView imageView = this.f;
        if (imageView != null) {
            imageView.setColorFilter(org.telegram.ui.ActionBar.g6.w0(null, this.y ? org.telegram.ui.ActionBar.g6.l6 : org.telegram.ui.ActionBar.g6.H6, false));
            imageView.setBackground(org.telegram.ui.ActionBar.g6.f0(this.A.getThemedColor(org.telegram.ui.ActionBar.g6.i6), 1, -1));
        }
    }

    public final void o(String str, String str2) {
        TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
        tL_auth_recoverPassword.code = this.h;
        if (!TextUtils.isEmpty(str)) {
            tL_auth_recoverPassword.flags |= 1;
            TL_account.passwordInputSettings passwordinputsettings = new TL_account.passwordInputSettings();
            tL_auth_recoverPassword.new_settings = passwordinputsettings;
            passwordinputsettings.flags |= 1;
            passwordinputsettings.hint = str2 != null ? str2 : "";
            passwordinputsettings.new_algo = this.s.new_algo;
        }
        Utilities.globalQueue.postRunnable(new n20(this, str, str2, tL_auth_recoverPassword, 11));
    }
}
