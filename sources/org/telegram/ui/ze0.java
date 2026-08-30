package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ze0 extends org.telegram.ui.Components.vv0 implements org.telegram.ui.Components.v40 {
    public String B;
    public String C;
    public Bundle D;
    public boolean E;
    public final org.telegram.ui.Components.gj0 F;
    public final org.telegram.ui.Components.gj0 G;
    public boolean H;
    public final org.telegram.ui.Components.w40 I;
    public TLRPC.FileLocation J;
    public TLRPC.FileLocation K;
    public final /* synthetic */ ng0 L;
    public final org.telegram.ui.Components.ad0 a;
    public final org.telegram.ui.Components.ad0 b;
    public final EditTextBoldCursor c;
    public final EditTextBoldCursor d;
    public final nh.y3 e;
    public final org.telegram.ui.Components.z8 f;
    public final eg.i0 h;
    public final kd n;
    public final ld r;
    public AnimatorSet s;
    public final TextView v;
    public final TextView w;
    public final TextView x;
    public final TextView y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ze0(ng0 ng0Var, Context context) {
        super(context);
        this.L = ng0Var;
        this.E = false;
        this.H = true;
        setOrientation(1);
        org.telegram.ui.Components.w40 w40Var = new org.telegram.ui.Components.w40(0, false, false);
        this.I = w40Var;
        w40Var.E = true;
        w40Var.G = false;
        w40Var.D = false;
        w40Var.H = false;
        w40Var.a = ng0Var;
        w40Var.b = this;
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, k7.b6.q(78, 78, 1));
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
        this.f = z8Var;
        nh.y3 y3Var = new nh.y3(this, context, 9);
        this.e = y3Var;
        y3Var.setRoundRadius(AndroidUtilities.dp(64.0f));
        z8Var.g(13);
        z8Var.n(5L, null, null);
        y3Var.setImageDrawable(z8Var);
        frameLayout.addView(y3Var, k7.b6.c(-1.0f, -1));
        Paint paint = new Paint(1);
        paint.setColor(1426063360);
        eg.i0 i0Var = new eg.i0(this, context, paint, 11);
        this.h = i0Var;
        frameLayout.addView(i0Var, k7.b6.c(-1.0f, -1));
        final int i10 = 0;
        i0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ue0
            public final /* synthetic */ ze0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        ze0 ze0Var = this.b;
                        kd kdVar = ze0Var.n;
                        org.telegram.ui.Components.gj0 gj0Var = ze0Var.F;
                        ze0Var.I.o(ze0Var.J != null, new md0(ze0Var, 1), new v5(ze0Var, 8), 0);
                        ze0Var.H = false;
                        kdVar.setAnimation(gj0Var);
                        gj0Var.K(0);
                        gj0Var.N(43);
                        kdVar.d();
                        break;
                    default:
                        ze0 ze0Var2 = this.b;
                        if (ze0Var2.L.S.getTag() == null) {
                            ze0Var2.c(false);
                            break;
                        }
                        break;
                }
            }
        });
        int i11 = R.raw.camera;
        org.telegram.ui.Components.gj0 gj0Var = new org.telegram.ui.Components.gj0(i11, String.valueOf(i11), AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f), false, null);
        this.F = gj0Var;
        int i12 = R.raw.camera_wait;
        this.G = new org.telegram.ui.Components.gj0(i12, String.valueOf(i12), AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f), false, null);
        kd kdVar = new kd(this, context, 3);
        this.n = kdVar;
        kdVar.setScaleType(ImageView.ScaleType.CENTER);
        kdVar.setAnimation(gj0Var);
        kdVar.setEnabled(false);
        kdVar.setClickable(false);
        frameLayout.addView(kdVar, k7.b6.c(-1.0f, -1));
        kdVar.addOnAttachStateChangeListener(new ye0(this));
        ld ldVar = new ld(this, context, 2);
        this.r = ldVar;
        ldVar.setSize(AndroidUtilities.dp(30.0f));
        ldVar.setProgressColor(-1);
        frameLayout.addView(ldVar, k7.b6.c(-1.0f, -1));
        p(false);
        TextView textView = new TextView(context);
        this.y = textView;
        textView.setText(LocaleController.getString(R.string.RegistrationProfileInfo));
        textView.setTextSize(1, 18.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView.setGravity(1);
        addView(textView, k7.b6.t(-2, -2, 1, 8, 12, 8, 0));
        TextView textView2 = new TextView(context);
        this.v = textView2;
        textView2.setText(LocaleController.getString("RegisterText2", R.string.RegisterText2));
        textView2.setGravity(1);
        textView2.setTextSize(1, 14.0f);
        textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView2, k7.b6.t(-2, -2, 1, 8, 6, 8, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        addView(frameLayout2, k7.b6.k(8.0f, 21.0f, 8.0f, 0.0f, -1, -2));
        org.telegram.ui.Components.ad0 ad0Var = new org.telegram.ui.Components.ad0(context, null);
        this.a = ad0Var;
        ad0Var.setText(LocaleController.getString(R.string.FirstName));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.c = editTextBoldCursor;
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435461);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setInputType(8192);
        final int i13 = 0;
        editTextBoldCursor.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: org.telegram.ui.ve0
            public final /* synthetic */ ze0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z4) {
                switch (i13) {
                    case 0:
                        org.telegram.ui.Components.ad0 ad0Var2 = this.b.a;
                        float f10 = z4 ? 1.0f : 0.0f;
                        ad0Var2.b(f10, f10, true);
                        break;
                    default:
                        org.telegram.ui.Components.ad0 ad0Var3 = this.b.b;
                        float f11 = z4 ? 1.0f : 0.0f;
                        ad0Var3.b(f11, f11, true);
                        break;
                }
            }
        });
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        ad0Var.e(editTextBoldCursor);
        ad0Var.addView(editTextBoldCursor, k7.b6.e(-1, -2, 48));
        final int i14 = 0;
        editTextBoldCursor.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.we0
            public final /* synthetic */ ze0 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView3, int i15, KeyEvent keyEvent) {
                switch (i14) {
                    case 0:
                        ze0 ze0Var = this.b;
                        if (i15 == 5) {
                            ze0Var.d.requestFocus();
                            return true;
                        }
                        ze0Var.getClass();
                        return false;
                    default:
                        ze0 ze0Var2 = this.b;
                        ze0Var2.getClass();
                        if (i15 != 6 && i15 != 5) {
                            return false;
                        }
                        ze0Var2.h(null);
                        return true;
                }
            }
        });
        org.telegram.ui.Components.ad0 ad0Var2 = new org.telegram.ui.Components.ad0(context, null);
        this.b = ad0Var2;
        ad0Var2.setText(LocaleController.getString(R.string.LastName));
        EditTextBoldCursor editTextBoldCursor2 = new EditTextBoldCursor(context);
        this.d = editTextBoldCursor2;
        editTextBoldCursor2.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor2.setCursorWidth(1.5f);
        editTextBoldCursor2.setImeOptions(268435462);
        editTextBoldCursor2.setTextSize(1, 17.0f);
        editTextBoldCursor2.setMaxLines(1);
        editTextBoldCursor2.setInputType(8192);
        final int i15 = 1;
        editTextBoldCursor2.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: org.telegram.ui.ve0
            public final /* synthetic */ ze0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z4) {
                switch (i15) {
                    case 0:
                        org.telegram.ui.Components.ad0 ad0Var22 = this.b.a;
                        float f10 = z4 ? 1.0f : 0.0f;
                        ad0Var22.b(f10, f10, true);
                        break;
                    default:
                        org.telegram.ui.Components.ad0 ad0Var3 = this.b.b;
                        float f11 = z4 ? 1.0f : 0.0f;
                        ad0Var3.b(f11, f11, true);
                        break;
                }
            }
        });
        editTextBoldCursor2.setBackground(null);
        editTextBoldCursor2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        ad0Var2.e(editTextBoldCursor2);
        ad0Var2.addView(editTextBoldCursor2, k7.b6.e(-1, -2, 48));
        final int i16 = 1;
        editTextBoldCursor2.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.we0
            public final /* synthetic */ ze0 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView3, int i152, KeyEvent keyEvent) {
                switch (i16) {
                    case 0:
                        ze0 ze0Var = this.b;
                        if (i152 == 5) {
                            ze0Var.d.requestFocus();
                            return true;
                        }
                        ze0Var.getClass();
                        return false;
                    default:
                        ze0 ze0Var2 = this.b;
                        ze0Var2.getClass();
                        if (i152 != 6 && i152 != 5) {
                            return false;
                        }
                        ze0Var2.h(null);
                        return true;
                }
            }
        });
        boolean isSmallScreen = AndroidUtilities.isSmallScreen();
        boolean hasFocus = editTextBoldCursor.hasFocus();
        boolean hasFocus2 = editTextBoldCursor2.hasFocus();
        frameLayout2.removeAllViews();
        if (isSmallScreen) {
            LinearLayout linearLayout = new LinearLayout(ng0Var.getParentActivity());
            linearLayout.setOrientation(0);
            ad0Var.setText(LocaleController.getString(R.string.FirstNameSmall));
            ad0Var2.setText(LocaleController.getString(R.string.LastNameSmall));
            linearLayout.addView(ad0Var, k7.b6.m(1.0f, 0, -2, 0, 8, 0));
            linearLayout.addView(ad0Var2, k7.b6.m(1.0f, 0, -2, 8, 0, 0));
            frameLayout2.addView(linearLayout);
            if (hasFocus) {
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
            } else if (hasFocus2) {
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor2);
            }
        } else {
            ad0Var.setText(LocaleController.getString(R.string.FirstName));
            ad0Var2.setText(LocaleController.getString(R.string.LastName));
            frameLayout2.addView(ad0Var, k7.b6.d(-1, -2.0f, 48, 8.0f, 0.0f, 8.0f, 0.0f));
            frameLayout2.addView(ad0Var2, k7.b6.d(-1, -2.0f, 48, 8.0f, 82.0f, 8.0f, 0.0f));
        }
        TextView textView3 = new TextView(context);
        this.w = textView3;
        textView3.setText(LocaleController.getString("CancelRegistration", R.string.CancelRegistration));
        textView3.setGravity((LocaleController.isRTL ? 5 : 3) | 1);
        textView3.setTextSize(1, 14.0f);
        textView3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView3.setPadding(0, AndroidUtilities.dp(24.0f), 0, 0);
        textView3.setVisibility(8);
        addView(textView3, k7.b6.t(-2, -2, (LocaleController.isRTL ? 5 : 3) | 48, 0, 20, 0, 0));
        final int i17 = 1;
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ue0
            public final /* synthetic */ ze0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i17) {
                    case 0:
                        ze0 ze0Var = this.b;
                        kd kdVar2 = ze0Var.n;
                        org.telegram.ui.Components.gj0 gj0Var2 = ze0Var.F;
                        ze0Var.I.o(ze0Var.J != null, new md0(ze0Var, 1), new v5(ze0Var, 8), 0);
                        ze0Var.H = false;
                        kdVar2.setAnimation(gj0Var2);
                        gj0Var2.K(0);
                        gj0Var2.N(43);
                        kdVar2.d();
                        break;
                    default:
                        ze0 ze0Var2 = this.b;
                        if (ze0Var2.L.S.getTag() == null) {
                            ze0Var2.c(false);
                            break;
                        }
                        break;
                }
            }
        });
        FrameLayout frameLayout3 = new FrameLayout(context);
        addView(frameLayout3, k7.b6.q(-1, -1, 83));
        TextView textView4 = new TextView(context);
        this.x = textView4;
        textView4.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        textView4.setTextSize(1, AndroidUtilities.isSmallScreen() ? 13.0f : 14.0f);
        textView4.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView4.setGravity(16);
        frameLayout3.addView(textView4, k7.b6.d(-2, 56.0f, 83, 14.0f, 0.0f, 70.0f, 32.0f));
        n7.qa.N0(textView4);
        String string = LocaleController.getString("TermsOfServiceLogin", R.string.TermsOfServiceLogin);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        int indexOf = string.indexOf(42);
        int lastIndexOf = string.lastIndexOf(42);
        if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
            spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
            spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
            spannableStringBuilder.setSpan(new eg.l0(this, 7), indexOf, lastIndexOf - 1, 33);
        }
        textView4.setText(spannableStringBuilder);
    }

    @Override // org.telegram.ui.Components.v40
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z4, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new rq(this, photoSize2, photoSize, 28));
    }

    @Override // org.telegram.ui.Components.vv0
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Components.vv0
    public final boolean c(boolean z4) {
        ng0 ng0Var = this.L;
        if (z4) {
            ng0Var.k1(true, true);
            this.E = false;
            this.D = null;
            return true;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ng0Var.getParentActivity());
        alertDialog$Builder.a.O = LocaleController.getString(R.string.Warning);
        alertDialog$Builder.a.Q = LocaleController.getString("AreYouSureRegistration", R.string.AreYouSureRegistration);
        alertDialog$Builder.h(LocaleController.getString("Stop", R.string.Stop), new te0(this, 0));
        alertDialog$Builder.k(LocaleController.getString("Continue", R.string.Continue), null);
        ng0Var.showDialog(alertDialog$Builder.a);
        return false;
    }

    @Override // org.telegram.ui.Components.vv0
    public final void d() {
        this.E = false;
    }

    @Override // org.telegram.ui.Components.v40
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.v40
    public /* bridge */ /* synthetic */ ju0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.vv0
    public String getHeaderName() {
        return LocaleController.getString("YourName", R.string.YourName);
    }

    @Override // org.telegram.ui.Components.v40
    public /* bridge */ /* synthetic */ String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.ui.Components.vv0
    public final void h(String str) {
        int i10;
        if (this.E) {
            return;
        }
        ng0 ng0Var = this.L;
        TLRPC.TL_help_termsOfService tL_help_termsOfService = ng0Var.m0;
        if (tL_help_termsOfService != null && tL_help_termsOfService.popup) {
            q(true);
            return;
        }
        EditTextBoldCursor editTextBoldCursor = this.c;
        if (editTextBoldCursor.length() == 0) {
            ng0.U0(ng0Var, this.a, true);
            return;
        }
        this.E = true;
        TLRPC.TL_auth_signUp tL_auth_signUp = new TLRPC.TL_auth_signUp();
        tL_auth_signUp.phone_code_hash = this.C;
        tL_auth_signUp.phone_number = this.B;
        tL_auth_signUp.first_name = editTextBoldCursor.getText().toString();
        tL_auth_signUp.last_name = this.d.getText().toString();
        ng0Var.n1(0, true);
        i10 = ((org.telegram.ui.ActionBar.p2) ng0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_signUp, new o(this, 11), 10);
    }

    @Override // org.telegram.ui.Components.vv0
    public final void j() {
        TextView textView = this.x;
        if (textView != null) {
            if (this.L.f) {
                textView.setAlpha(1.0f);
            } else {
                textView.setAlpha(0.0f);
                textView.animate().alpha(1.0f).setDuration(200L).setStartDelay(300L).setInterpolator(AndroidUtilities.decelerateInterpolator).start();
            }
        }
        EditTextBoldCursor editTextBoldCursor = this.c;
        if (editTextBoldCursor != null) {
            editTextBoldCursor.requestFocus();
            editTextBoldCursor.setSelection(editTextBoldCursor.length());
            AndroidUtilities.showKeyboard(editTextBoldCursor);
        }
        AndroidUtilities.runOnUIThread(new md0(this, 3), ng0.q0);
    }

    @Override // org.telegram.ui.Components.vv0
    public final void k(Bundle bundle) {
        byte[] decode;
        Bundle bundle2 = bundle.getBundle("registerview_params");
        this.D = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        try {
            String string = bundle.getString("terms");
            if (string != null && (decode = Base64.decode(string, 0)) != null) {
                SerializedData serializedData = new SerializedData(decode);
                this.L.m0 = TLRPC.TL_help_termsOfService.TLdeserialize(serializedData, serializedData.readInt32(false), false);
                serializedData.cleanup();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        String string2 = bundle.getString("registerview_first");
        if (string2 != null) {
            this.c.setText(string2);
        }
        String string3 = bundle.getString("registerview_last");
        if (string3 != null) {
            this.d.setText(string3);
        }
    }

    @Override // org.telegram.ui.Components.vv0
    public final void l(Bundle bundle) {
        String obj = this.c.getText().toString();
        if (obj.length() != 0) {
            bundle.putString("registerview_first", obj);
        }
        String obj2 = this.d.getText().toString();
        if (obj2.length() != 0) {
            bundle.putString("registerview_last", obj2);
        }
        ng0 ng0Var = this.L;
        TLRPC.TL_help_termsOfService tL_help_termsOfService = ng0Var.m0;
        if (tL_help_termsOfService != null) {
            SerializedData serializedData = new SerializedData(tL_help_termsOfService.getObjectSize());
            ng0Var.m0.serializeToStream(serializedData);
            bundle.putString("terms", Base64.encodeToString(serializedData.toByteArray(), 0));
            serializedData.cleanup();
        }
        Bundle bundle2 = this.D;
        if (bundle2 != null) {
            bundle.putBundle("registerview_params", bundle2);
        }
    }

    @Override // org.telegram.ui.Components.vv0
    public final void m(Bundle bundle, boolean z4) {
        if (bundle == null) {
            return;
        }
        this.c.setText("");
        this.d.setText("");
        this.B = bundle.getString("phoneFormated");
        this.C = bundle.getString("phoneHash");
        this.D = bundle;
    }

    @Override // org.telegram.ui.Components.vv0
    public final void n() {
        this.f.invalidateSelf();
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        this.y.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        int i11 = org.telegram.ui.ActionBar.j6.D6;
        this.v.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        EditTextBoldCursor editTextBoldCursor = this.c;
        editTextBoldCursor.setTextColor(w02);
        int i12 = org.telegram.ui.ActionBar.j6.l6;
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        int w03 = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        EditTextBoldCursor editTextBoldCursor2 = this.d;
        editTextBoldCursor2.setTextColor(w03);
        editTextBoldCursor2.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        this.w.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q6, false));
        int w04 = org.telegram.ui.ActionBar.j6.w0(null, i11, false);
        TextView textView = this.x;
        textView.setTextColor(w04);
        textView.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.J6, false));
        this.a.f();
        this.b.f();
    }

    public final void o() {
        this.x.animate().alpha(0.0f).setDuration(150L).setStartDelay(0L).setInterpolator(AndroidUtilities.accelerateInterpolator).start();
    }

    public final void p(boolean z4) {
        kd kdVar = this.n;
        if (kdVar == null) {
            return;
        }
        AnimatorSet animatorSet = this.s;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.s = null;
        }
        ld ldVar = this.r;
        if (!z4) {
            kdVar.setAlpha(1.0f);
            kdVar.setVisibility(0);
            ldVar.setAlpha(0.0f);
            ldVar.setVisibility(4);
            return;
        }
        this.s = new AnimatorSet();
        kdVar.setVisibility(0);
        AnimatorSet animatorSet2 = this.s;
        Property property = View.ALPHA;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(kdVar, (Property<kd, Float>) property, 1.0f), ObjectAnimator.ofFloat(ldVar, (Property<ld, Float>) property, 0.0f));
        this.s.setDuration(180L);
        this.s.addListener(new org.telegram.ui.Components.f91(this, 24));
        this.s.start();
    }

    public final void q(boolean z4) {
        ng0 ng0Var = this.L;
        if (ng0Var.m0 == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ng0Var.getParentActivity());
        alertDialog$Builder.a.O = LocaleController.getString("TermsOfService", R.string.TermsOfService);
        if (z4) {
            alertDialog$Builder.k(LocaleController.getString("Accept", R.string.Accept), new te0(this, 1));
            alertDialog$Builder.h(LocaleController.getString("Decline", R.string.Decline), new te0(this, 2));
        } else {
            alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), null);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ng0Var.m0.text);
        MessageObject.addEntitiesToText(spannableStringBuilder, ng0Var.m0.entities, false, false, false, false);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.Q = spannableStringBuilder;
        ng0Var.showDialog(d2Var);
    }

    @Override // org.telegram.ui.Components.v40
    public final /* synthetic */ boolean u() {
        return false;
    }

    @Override // org.telegram.ui.Components.v40
    public final /* synthetic */ void D(float f10) {
    }

    @Override // org.telegram.ui.Components.v40
    public final /* synthetic */ void P() {
    }

    @Override // org.telegram.ui.Components.v40
    public final /* synthetic */ void I(boolean z4, boolean z10) {
    }
}
