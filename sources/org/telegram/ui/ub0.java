package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class ub0 extends org.telegram.ui.Components.wt0 {
    public boolean D;
    public int E;
    public int F;
    public final /* synthetic */ ce0 G;
    public final org.telegram.ui.Components.lb0[] a;
    public final EditTextBoldCursor[] b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final ImageView f;
    public String h;
    public String n;
    public String r;
    public TL_account.Password s;
    public Bundle w;
    public boolean x;
    public final int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ub0(ce0 ce0Var, Context context, int i7) {
        super(context);
        this.G = ce0Var;
        this.y = i7;
        final int i10 = 1;
        setOrientation(1);
        int i11 = i7 == 1 ? 1 : 2;
        this.b = new EditTextBoldCursor[i11];
        this.a = new org.telegram.ui.Components.lb0[i11];
        TextView textView = new TextView(context);
        this.c = textView;
        float f10 = 18.0f;
        textView.setTextSize(1, 18.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        float f11 = 2.0f;
        textView.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        textView.setGravity(49);
        textView.setText(org.telegram.messenger.hd.M0(2131745523, null));
        addView(textView, c8.ha.t(-2, -2, 1, 8, org.telegram.messenger.g0.O1() ? 16 : 72, 8, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity(1);
        textView2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        addView(textView2, c8.ha.t(-2, -2, 1, 8, 6, 8, 16));
        final int i12 = 0;
        final int i13 = 0;
        while (i13 < this.b.length) {
            org.telegram.ui.Components.lb0 lb0Var = new org.telegram.ui.Components.lb0(context, null);
            this.a[i13] = lb0Var;
            lb0Var.setText(org.telegram.messenger.hd.M0(i7 == 0 ? i13 == 0 ? 2131747209 : 2131747207 : 2131747441, null));
            this.b[i13] = new EditTextBoldCursor(context);
            this.b[i13].setCursorSize(org.telegram.messenger.g0.L(20.0f));
            this.b[i13].setCursorWidth(1.5f);
            this.b[i13].setImeOptions(268435461);
            this.b[i13].setTextSize(1, f10);
            this.b[i13].setMaxLines(1);
            this.b[i13].setBackground(null);
            int L = org.telegram.messenger.g0.L(16.0f);
            this.b[i13].setPadding(L, L, L, L);
            if (i7 == 0) {
                this.b[i13].setInputType(org.telegram.messenger.qs.N1);
                this.b[i13].setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            this.b[i13].setTypeface(Typeface.DEFAULT);
            int i14 = 3;
            this.b[i13].setGravity(org.telegram.messenger.hd.a0 ? 5 : 3);
            EditTextBoldCursor editTextBoldCursor = this.b[i13];
            boolean z9 = i13 == 0 && i7 == 0;
            float f12 = f11;
            editTextBoldCursor.addTextChangedListener(new tb0(this, z9));
            this.b[i13].setOnFocusChangeListener(new fd(lb0Var, i14));
            if (z9) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                linearLayout.setGravity(16);
                linearLayout.addView(this.b[i13], c8.ha.l(1.0f, 0, -2));
                ImageView imageView = new ImageView(context);
                this.f = imageView;
                imageView.setImageResource(R.drawable.msg_message);
                org.telegram.messenger.g0.Z3(imageView, true, 0.1f, true, false);
                imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.qb0
                    public final /* synthetic */ ub0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i12) {
                            case 0:
                                ub0 ub0Var = this.b;
                                ImageView imageView2 = ub0Var.f;
                                EditTextBoldCursor[] editTextBoldCursorArr = ub0Var.b;
                                ub0Var.D = !ub0Var.D;
                                for (int i15 = 0; i15 < editTextBoldCursorArr.length; i15++) {
                                    int selectionStart = editTextBoldCursorArr[i15].getSelectionStart();
                                    int selectionEnd = editTextBoldCursorArr[i15].getSelectionEnd();
                                    editTextBoldCursorArr[i15].setInputType((ub0Var.D ? org.telegram.messenger.qs.a2 : 128) | 1);
                                    editTextBoldCursorArr[i15].setSelection(selectionStart, selectionEnd);
                                }
                                imageView2.setTag(Boolean.valueOf(ub0Var.D));
                                org.telegram.ui.ActionBar.r6.t(imageView2, ub0Var.D ? org.telegram.ui.ActionBar.k6.l6 : org.telegram.ui.ActionBar.k6.H6, null, PorterDuff.Mode.SRC_ATOP);
                                break;
                            default:
                                ub0 ub0Var2 = this.b;
                                if (ub0Var2.y == 0) {
                                    ub0Var2.n(null, null);
                                    break;
                                } else {
                                    ub0Var2.n(ub0Var2.n, null);
                                    break;
                                }
                        }
                    }
                });
                linearLayout.addView(imageView, c8.ha.u(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
                lb0Var.addView(linearLayout, c8.ha.c(-2.0f, -1));
            } else {
                lb0Var.addView(this.b[i13], c8.ha.c(-2.0f, -1));
            }
            lb0Var.e(this.b[i13]);
            addView(lb0Var, c8.ha.t(-1, -2, 1, 16, 16, 16, 0));
            this.b[i13].setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.rb0
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView3, int i15, KeyEvent keyEvent) {
                    ub0 ub0Var = ub0.this;
                    if (i13 == 0) {
                        EditTextBoldCursor[] editTextBoldCursorArr = ub0Var.b;
                        if (editTextBoldCursorArr.length == 2) {
                            editTextBoldCursorArr[1].requestFocus();
                            return true;
                        }
                    }
                    if (i15 == 5) {
                        ub0Var.h(null);
                        return true;
                    }
                    ub0Var.getClass();
                    return false;
                }
            });
            i13++;
            f11 = f12;
            f10 = 18.0f;
        }
        float f13 = f11;
        if (i7 == 0) {
            this.d.setText(org.telegram.messenger.hd.M0(2131747208, "PleaseEnterNewFirstPasswordLogin"));
        } else {
            this.d.setText(org.telegram.messenger.hd.M0(2131747439, "PasswordHintTextLogin"));
        }
        TextView textView3 = new TextView(context);
        this.e = textView3;
        textView3.setGravity(19);
        textView3.setTextSize(1, 15.0f);
        textView3.setLineSpacing(org.telegram.messenger.g0.L(f13), 1.0f);
        textView3.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        textView3.setText(org.telegram.messenger.hd.M0(2131742818, null));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(textView3, c8.ha.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 32.0f));
        addView(frameLayout, c8.ha.r(-1, -1, 80));
        h6.m.g(textView3);
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.qb0
            public final /* synthetic */ ub0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        ub0 ub0Var = this.b;
                        ImageView imageView2 = ub0Var.f;
                        EditTextBoldCursor[] editTextBoldCursorArr = ub0Var.b;
                        ub0Var.D = !ub0Var.D;
                        for (int i15 = 0; i15 < editTextBoldCursorArr.length; i15++) {
                            int selectionStart = editTextBoldCursorArr[i15].getSelectionStart();
                            int selectionEnd = editTextBoldCursorArr[i15].getSelectionEnd();
                            editTextBoldCursorArr[i15].setInputType((ub0Var.D ? org.telegram.messenger.qs.a2 : 128) | 1);
                            editTextBoldCursorArr[i15].setSelection(selectionStart, selectionEnd);
                        }
                        imageView2.setTag(Boolean.valueOf(ub0Var.D));
                        org.telegram.ui.ActionBar.r6.t(imageView2, ub0Var.D ? org.telegram.ui.ActionBar.k6.l6 : org.telegram.ui.ActionBar.k6.H6, null, PorterDuff.Mode.SRC_ATOP);
                        break;
                    default:
                        ub0 ub0Var2 = this.b;
                        if (ub0Var2.y == 0) {
                            ub0Var2.n(null, null);
                            break;
                        } else {
                            ub0Var2.n(ub0Var2.n, null);
                            break;
                        }
                }
            }
        });
    }

    @Override // org.telegram.ui.Components.wt0
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Components.wt0
    public final boolean c(boolean z9) {
        this.G.C1(true, true);
        this.w = null;
        this.x = false;
        return true;
    }

    @Override // org.telegram.ui.Components.wt0
    public final void d() {
        this.x = false;
    }

    @Override // org.telegram.ui.Components.wt0
    public String getHeaderName() {
        return org.telegram.messenger.hd.M0(2131748265, "NewPassword");
    }

    @Override // org.telegram.ui.Components.wt0
    public final void h(String str) {
        if (this.x) {
            return;
        }
        EditTextBoldCursor[] editTextBoldCursorArr = this.b;
        String obj = editTextBoldCursorArr[0].getText().toString();
        int length = obj.length();
        ce0 ce0Var = this.G;
        if (length == 0) {
            if (ce0Var.getParentActivity() == null) {
                return;
            }
            try {
                editTextBoldCursorArr[0].performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            org.telegram.messenger.g0.F3(editTextBoldCursorArr[0]);
            return;
        }
        if (this.y != 0) {
            this.x = true;
            ce0Var.F1(0, true);
            n(this.n, obj);
        } else {
            if (!obj.equals(editTextBoldCursorArr[1].getText().toString())) {
                if (ce0Var.getParentActivity() == null) {
                    return;
                }
                try {
                    editTextBoldCursorArr[1].performHapticFeedback(3, 2);
                } catch (Exception unused2) {
                }
                org.telegram.messenger.g0.F3(editTextBoldCursorArr[1]);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("emailCode", this.h);
            bundle.putString("new_password", obj);
            bundle.putString("password", this.r);
            ce0Var.M1(10, true, bundle, false);
        }
    }

    @Override // org.telegram.ui.Components.wt0
    public final void j() {
        org.telegram.messenger.g0.i3(new hz(this, 21), ce0.y0);
    }

    @Override // org.telegram.ui.Components.wt0
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_params" + this.y);
        this.w = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
    }

    @Override // org.telegram.ui.Components.wt0
    public final void l(Bundle bundle) {
        if (this.w != null) {
            bundle.putBundle("recoveryview_params" + this.y, this.w);
        }
    }

    @Override // org.telegram.ui.Components.wt0
    public final void m(Bundle bundle, boolean z9) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        if (bundle == null) {
            return;
        }
        int i7 = 0;
        while (true) {
            editTextBoldCursorArr = this.b;
            if (i7 >= editTextBoldCursorArr.length) {
                break;
            }
            editTextBoldCursorArr[i7].setText("");
            i7++;
        }
        this.w = bundle;
        this.h = bundle.getString("emailCode");
        String string = this.w.getString("password");
        this.r = string;
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.v(string));
            TL_account.Password TLdeserialize = TL_account.Password.TLdeserialize(serializedData, serializedData.readInt32(false), false);
            this.s = TLdeserialize;
            TwoStepVerificationActivity.r0(TLdeserialize);
        }
        this.n = this.w.getString("new_password");
        ce0.b1(this.G, editTextBoldCursorArr[0]);
        editTextBoldCursorArr[0].requestFocus();
    }

    public final void n(String str, String str2) {
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
        Utilities.e.c(new org.telegram.ui.Components.kn0(this, str, str2, tL_auth_recoverPassword, 17));
    }

    @Override // org.telegram.ui.Components.wt0
    public final void updateColors() {
        this.c.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
        this.d.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.D6, false));
        for (EditTextBoldCursor editTextBoldCursor : this.b) {
            editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
            editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.l6, false));
        }
        for (org.telegram.ui.Components.lb0 lb0Var : this.a) {
            lb0Var.f();
        }
        this.e.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.q6, false));
        ImageView imageView = this.f;
        if (imageView != null) {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, this.D ? org.telegram.ui.ActionBar.k6.l6 : org.telegram.ui.ActionBar.k6.H6, false);
            ce0.u1(imageView, x02, this.E, PorterDuff.Mode.SRC_ATOP);
            this.E = x02;
            int themedColor = this.G.getThemedColor(org.telegram.ui.ActionBar.k6.i6);
            ce0.v1(imageView, themedColor, this.F);
            this.F = themedColor;
        }
    }
}
