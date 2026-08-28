package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Timer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class sm0 extends org.telegram.ui.Components.cv0 implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int N = 0;
    public int A;
    public double B;
    public double C;
    public boolean D;
    public boolean E;
    public boolean F;
    public String G;
    public final int H;
    public int I;
    public String J;
    public int K;
    public int L;
    public final /* synthetic */ wm0 M;
    public String a;
    public String b;
    public final LinearLayout c;
    public EditTextBoldCursor[] d;
    public final TextView e;
    public final TextView f;
    public final ImageView h;
    public final nd0 n;
    public final nd0 r;
    public final tm0 s;
    public Timer v;
    public Timer w;
    public final Object x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sm0(wm0 wm0Var, Context context, int i9) {
        super(context);
        this.M = wm0Var;
        this.x = new Object();
        this.y = 60000;
        this.A = 15000;
        this.G = "";
        this.J = "*";
        this.H = i9;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.e = textView;
        int i10 = org.telegram.ui.ActionBar.f6.D6;
        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
        textView.setTextSize(1, 14.0f);
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        TextView textView2 = new TextView(context);
        this.f = textView2;
        int i11 = org.telegram.ui.ActionBar.f6.G6;
        org.telegram.messenger.l0.q(textView2, org.telegram.ui.ActionBar.f6.w0(null, i11, false), 1, 18.0f);
        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
        textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView2.setGravity(49);
        if (i9 == 3) {
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            FrameLayout frameLayout = new FrameLayout(context);
            addView(frameLayout, g7.e6.q(-2, -2, LocaleController.isRTL ? 5 : 3));
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.phone_activate);
            boolean z10 = LocaleController.isRTL;
            if (z10) {
                frameLayout.addView(imageView, g7.e6.d(64, 76.0f, 19, 2.0f, 2.0f, 0.0f, 0.0f));
                frameLayout.addView(textView, g7.e6.d(-1, -2.0f, LocaleController.isRTL ? 5 : 3, 82.0f, 0.0f, 0.0f, 0.0f));
            } else {
                frameLayout.addView(textView, g7.e6.d(-1, -2.0f, z10 ? 5 : 3, 0.0f, 0.0f, 82.0f, 0.0f));
                frameLayout.addView(imageView, g7.e6.d(64, 76.0f, 21, 0.0f, 2.0f, 0.0f, 2.0f));
            }
        } else {
            textView.setGravity(49);
            FrameLayout frameLayout2 = new FrameLayout(context);
            addView(frameLayout2, g7.e6.q(-2, -2, 49));
            if (i9 == 1) {
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(R.drawable.sms_devices);
                int w02 = org.telegram.ui.ActionBar.f6.w0(null, i11, false);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                imageView2.setColorFilter(new PorterDuffColorFilter(w02, mode));
                frameLayout2.addView(imageView2, g7.e6.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                ImageView imageView3 = new ImageView(context);
                this.h = imageView3;
                imageView3.setImageResource(R.drawable.sms_bubble);
                imageView3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.P9, false), mode));
                frameLayout2.addView(imageView3, g7.e6.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                textView2.setText(LocaleController.getString(R.string.SentAppCodeTitle));
            } else {
                ImageView imageView4 = new ImageView(context);
                this.h = imageView4;
                imageView4.setImageResource(R.drawable.sms_code);
                imageView4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.P9, false), PorterDuff.Mode.MULTIPLY));
                frameLayout2.addView(imageView4, g7.e6.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                textView2.setText(LocaleController.getString(R.string.SentSmsCodeTitle));
            }
            addView(textView2, g7.e6.t(-2, -2, 49, 0, 18, 0, 0));
            addView(textView, g7.e6.t(-2, -2, 49, 0, 17, 0, 0));
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.c = linearLayout;
        linearLayout.setOrientation(0);
        addView(linearLayout, g7.e6.q(-2, 36, 1));
        if (i9 == 3) {
            linearLayout.setVisibility(8);
        }
        nd0 nd0Var = new nd0(context, 1);
        this.n = nd0Var;
        nd0Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
        nd0Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        if (i9 == 3) {
            nd0Var.setTextSize(1, 14.0f);
            addView(nd0Var, g7.e6.q(-2, -2, LocaleController.isRTL ? 5 : 3));
            tm0 tm0Var = new tm0(context);
            Paint paint = new Paint();
            tm0Var.a = paint;
            Paint paint2 = new Paint();
            tm0Var.b = paint2;
            paint.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.gi, false));
            paint2.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.hi, false));
            this.s = tm0Var;
            nd0Var.setGravity(LocaleController.isRTL ? 5 : 3);
            addView(tm0Var, g7.e6.k(0.0f, 12.0f, 0.0f, 0.0f, -1, 3));
        } else {
            nd0Var.setPadding(0, AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(10.0f));
            nd0Var.setTextSize(1, 15.0f);
            nd0Var.setGravity(49);
            addView(nd0Var, g7.e6.q(-2, -2, 49));
        }
        nd0 nd0Var2 = new nd0(context, 2);
        this.r = nd0Var2;
        nd0Var2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q6, false));
        nd0Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        nd0Var2.setPadding(0, AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(10.0f));
        nd0Var2.setTextSize(1, 15.0f);
        nd0Var2.setGravity(49);
        if (i9 == 1) {
            nd0Var2.setText(LocaleController.getString(R.string.DidNotGetTheCodeSms));
        } else {
            nd0Var2.setText(LocaleController.getString(R.string.DidNotGetTheCode));
        }
        addView(nd0Var2, g7.e6.q(-2, -2, 49));
        nd0Var2.setOnClickListener(new q50(this, 16));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getCode() {
        if (this.d == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int i9 = 0;
        while (true) {
            EditTextBoldCursor[] editTextBoldCursorArr = this.d;
            if (i9 >= editTextBoldCursorArr.length) {
                return sb2.toString();
            }
            sb2.append(ne.b.d(editTextBoldCursorArr[i9].getText().toString(), false));
            i9++;
        }
    }

    @Override // org.telegram.ui.Components.cv0
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Components.cv0
    public final boolean c(boolean z10) {
        int i9;
        wm0 wm0Var = this.M;
        if (!z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wm0Var.getParentActivity());
            alertDialog$Builder.a.N = LocaleController.getString(R.string.AppName);
            alertDialog$Builder.a.P = LocaleController.getString(R.string.StopVerification);
            alertDialog$Builder.k(LocaleController.getString(R.string.Continue), null);
            alertDialog$Builder.h(LocaleController.getString(R.string.Stop), new om0(this, 1));
            wm0Var.showDialog(alertDialog$Builder.a);
            return false;
        }
        TLRPC.TL_auth_cancelCode tL_auth_cancelCode = new TLRPC.TL_auth_cancelCode();
        tL_auth_cancelCode.phone_number = this.a;
        tL_auth_cancelCode.phone_code_hash = this.b;
        i9 = ((org.telegram.ui.ActionBar.o2) wm0Var).currentAccount;
        ConnectionsManager.getInstance(i9).sendRequest(tL_auth_cancelCode, new ih.q5(16), 2);
        s();
        r();
        int i10 = this.H;
        if (i10 == 2) {
            AndroidUtilities.setWaitingForSms(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
        } else if (i10 == 3) {
            AndroidUtilities.setWaitingForCall(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
        }
        this.E = false;
        return true;
    }

    @Override // org.telegram.ui.Components.cv0
    public final void d() {
        this.F = false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        if (!this.E || (editTextBoldCursorArr = this.d) == null) {
            return;
        }
        if (i9 == NotificationCenter.didReceiveSmsCode) {
            editTextBoldCursorArr[0].setText("" + objArr[0]);
            h(null);
            return;
        }
        if (i9 == NotificationCenter.didReceiveCall) {
            String str = "" + objArr[0];
            if (AndroidUtilities.checkPhonePattern(this.J, str)) {
                this.D = true;
                this.d[0].setText(str);
                this.D = false;
                h(null);
            }
        }
    }

    @Override // org.telegram.ui.Components.cv0
    public final void f() {
        int i9 = this.H;
        if (i9 == 2) {
            AndroidUtilities.setWaitingForSms(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
        } else if (i9 == 3) {
            AndroidUtilities.setWaitingForCall(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
        }
        this.E = false;
        s();
        r();
    }

    @Override // org.telegram.ui.Components.cv0
    public final void h(String str) {
        int i9;
        if (this.F) {
            return;
        }
        String code = getCode();
        if (TextUtils.isEmpty(code)) {
            AndroidUtilities.shakeView(this.c);
            return;
        }
        this.F = true;
        int i10 = this.H;
        if (i10 == 2) {
            AndroidUtilities.setWaitingForSms(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
        } else if (i10 == 3) {
            AndroidUtilities.setWaitingForCall(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
        }
        this.E = false;
        wm0 wm0Var = this.M;
        wm0Var.N1(true, true);
        TL_account.verifyPhone verifyphone = new TL_account.verifyPhone();
        verifyphone.phone_number = this.a;
        verifyphone.phone_code = code;
        verifyphone.phone_code_hash = this.b;
        s();
        wm0Var.y1();
        i9 = ((org.telegram.ui.ActionBar.o2) wm0Var).currentAccount;
        ConnectionsManager.getInstance(i9).sendRequest(verifyphone, new v40(15, this, verifyphone), 2);
    }

    @Override // org.telegram.ui.Components.cv0
    public final void j() {
        LinearLayout linearLayout = this.c;
        if (linearLayout == null || linearLayout.getVisibility() != 0) {
            return;
        }
        for (int length = this.d.length - 1; length >= 0; length--) {
            if (length == 0 || this.d[length].length() != 0) {
                this.d[length].requestFocus();
                EditTextBoldCursor editTextBoldCursor = this.d[length];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                AndroidUtilities.showKeyboard(this.d[length]);
                return;
            }
        }
    }

    @Override // org.telegram.ui.Components.cv0
    public final void m(Bundle bundle, boolean z10) {
        int i9;
        int i10;
        if (bundle == null) {
            return;
        }
        this.E = true;
        int i11 = this.H;
        if (i11 == 2) {
            AndroidUtilities.setWaitingForSms(true);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didReceiveSmsCode);
        } else if (i11 == 3) {
            AndroidUtilities.setWaitingForCall(true);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didReceiveCall);
        }
        this.a = bundle.getString("phone");
        this.b = bundle.getString("phoneHash");
        int i12 = bundle.getInt("timeout");
        this.y = i12;
        this.L = i12;
        this.I = bundle.getInt("nextType");
        this.J = bundle.getString("pattern");
        int i13 = bundle.getInt("length");
        this.K = i13;
        if (i13 == 0) {
            this.K = 5;
        }
        EditTextBoldCursor[] editTextBoldCursorArr = this.d;
        CharSequence charSequence = "";
        if (editTextBoldCursorArr != null && editTextBoldCursorArr.length == this.K) {
            int i14 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr2 = this.d;
                if (i14 >= editTextBoldCursorArr2.length) {
                    break;
                }
                editTextBoldCursorArr2[i14].setText("");
                i14++;
            }
        } else {
            this.d = new EditTextBoldCursor[this.K];
            final int i15 = 0;
            while (i15 < this.K) {
                this.d[i15] = new EditTextBoldCursor(getContext());
                EditTextBoldCursor editTextBoldCursor = this.d[i15];
                int i16 = org.telegram.ui.ActionBar.f6.G6;
                editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i16, false));
                this.d[i15].setCursorColor(org.telegram.ui.ActionBar.f6.w0(null, i16, false));
                this.d[i15].setCursorSize(AndroidUtilities.dp(20.0f));
                this.d[i15].setCursorWidth(1.5f);
                Drawable mutate = getResources().getDrawable(R.drawable.search_dark_activated).mutate();
                mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.l6, false), PorterDuff.Mode.MULTIPLY));
                this.d[i15].setBackgroundDrawable(mutate);
                this.d[i15].setImeOptions(268435461);
                this.d[i15].setTextSize(1, 20.0f);
                this.d[i15].setMaxLines(1);
                this.d[i15].setTypeface(AndroidUtilities.bold());
                this.d[i15].setPadding(0, 0, 0, 0);
                this.d[i15].setGravity(49);
                if (i11 == 3) {
                    this.d[i15].setEnabled(false);
                    this.d[i15].setInputType(0);
                    this.d[i15].setVisibility(8);
                } else {
                    this.d[i15].setInputType(3);
                }
                this.c.addView(this.d[i15], g7.e6.t(34, 36, 1, 0, 0, i15 != this.K - 1 ? 7 : 0, 0));
                this.d[i15].addTextChangedListener(new qm0(this, i15));
                this.d[i15].setOnKeyListener(new View.OnKeyListener() { // from class: org.telegram.ui.pm0
                    @Override // android.view.View.OnKeyListener
                    public final boolean onKey(View view, int i17, KeyEvent keyEvent) {
                        sm0 sm0Var = sm0.this;
                        if (i17 != 67) {
                            sm0Var.getClass();
                            return false;
                        }
                        EditTextBoldCursor[] editTextBoldCursorArr3 = sm0Var.d;
                        int i18 = i15;
                        if (editTextBoldCursorArr3[i18].length() != 0 || i18 <= 0) {
                            return false;
                        }
                        int i19 = i18 - 1;
                        EditTextBoldCursor editTextBoldCursor2 = sm0Var.d[i19];
                        editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                        sm0Var.d[i19].requestFocus();
                        sm0Var.d[i19].dispatchKeyEvent(keyEvent);
                        return true;
                    }
                });
                this.d[i15].setOnEditorActionListener(new ea(this, 9));
                i15++;
            }
        }
        tm0 tm0Var = this.s;
        if (tm0Var != null) {
            tm0Var.setVisibility(this.I != 0 ? 0 : 8);
        }
        if (this.a == null) {
            return;
        }
        String g10 = org.telegram.messenger.ll.g(new StringBuilder("+"), this.a, ne.b.c());
        if (i11 == 2) {
            charSequence = AndroidUtilities.replaceTags(LocaleController.formatString("SentSmsCode", R.string.SentSmsCode, LocaleController.addNbsp(g10)));
        } else if (i11 == 3) {
            charSequence = AndroidUtilities.replaceTags(LocaleController.formatString("SentCallCode", R.string.SentCallCode, LocaleController.addNbsp(g10)));
        } else if (i11 == 4) {
            charSequence = AndroidUtilities.replaceTags(LocaleController.formatString("SentCallOnly", R.string.SentCallOnly, LocaleController.addNbsp(g10)));
        }
        this.e.setText(charSequence);
        if (i11 != 3) {
            AndroidUtilities.showKeyboard(this.d[0]);
            this.d[0].requestFocus();
        } else {
            AndroidUtilities.hideKeyboard(this.d[0]);
        }
        s();
        r();
        this.B = System.currentTimeMillis();
        nd0 nd0Var = this.r;
        nd0 nd0Var2 = this.n;
        if (i11 == 3) {
            int i17 = this.I;
            i9 = 2;
            if (i17 == 4 || i17 == 2) {
                nd0Var.setVisibility(8);
                nd0Var2.setVisibility(0);
                int i18 = this.I;
                if (i18 == 4) {
                    nd0Var2.setText(LocaleController.formatString("CallText", R.string.CallText, 1, 0));
                } else if (i18 == 2) {
                    nd0Var2.setText(LocaleController.formatString("SmsText", R.string.SmsText, 1, 0));
                }
                q();
                return;
            }
        } else {
            i9 = 2;
        }
        if (i11 == i9 && ((i10 = this.I) == 4 || i10 == 3)) {
            int i19 = R.string.CallText;
            Object[] objArr = new Object[i9];
            objArr[0] = 2;
            objArr[1] = 0;
            nd0Var2.setText(LocaleController.formatString("CallText", i19, objArr));
            nd0Var.setVisibility(this.y < 1000 ? 0 : 8);
            nd0Var2.setVisibility(this.y < 1000 ? 8 : 0);
            q();
            return;
        }
        if (i11 != 4 || this.I != 2) {
            nd0Var2.setVisibility(8);
            nd0Var.setVisibility(8);
            p();
        } else {
            nd0Var2.setText(LocaleController.formatString("SmsText", R.string.SmsText, 2, 0));
            nd0Var.setVisibility(this.y < 1000 ? 0 : 8);
            nd0Var2.setVisibility(this.y < 1000 ? 8 : 0);
            q();
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int i13;
        super.onLayout(z10, i9, i10, i11, i12);
        if (this.H == 3 || this.h == null) {
            return;
        }
        int bottom = this.e.getBottom();
        int measuredHeight = getMeasuredHeight() - bottom;
        nd0 nd0Var = this.r;
        if (nd0Var.getVisibility() == 0) {
            int measuredHeight2 = nd0Var.getMeasuredHeight();
            i13 = (measuredHeight + bottom) - measuredHeight2;
            nd0Var.layout(nd0Var.getLeft(), i13, nd0Var.getRight(), measuredHeight2 + i13);
        } else {
            nd0 nd0Var2 = this.n;
            if (nd0Var2.getVisibility() == 0) {
                int measuredHeight3 = nd0Var2.getMeasuredHeight();
                i13 = (measuredHeight + bottom) - measuredHeight3;
                nd0Var2.layout(nd0Var2.getLeft(), i13, nd0Var2.getRight(), measuredHeight3 + i13);
            } else {
                i13 = measuredHeight + bottom;
            }
        }
        LinearLayout linearLayout = this.c;
        int measuredHeight4 = linearLayout.getMeasuredHeight();
        int d = j3.r0.d(i13 - bottom, measuredHeight4, 2, bottom);
        linearLayout.layout(linearLayout.getLeft(), d, linearLayout.getRight(), measuredHeight4 + d);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        ImageView imageView;
        super.onMeasure(i9, i10);
        if (this.H == 3 || (imageView = this.h) == null) {
            return;
        }
        int dp = AndroidUtilities.dp(35.0f) + this.e.getMeasuredHeight() + this.f.getMeasuredHeight() + imageView.getMeasuredHeight();
        int dp2 = AndroidUtilities.dp(80.0f);
        int dp3 = AndroidUtilities.dp(291.0f);
        wm0 wm0Var = this.M;
        if (wm0Var.o0 - dp < dp2) {
            setMeasuredDimension(getMeasuredWidth(), dp + dp2);
        } else {
            setMeasuredDimension(getMeasuredWidth(), Math.min(wm0Var.o0, dp3));
        }
    }

    public final void p() {
        if (this.w != null) {
            return;
        }
        this.A = 15000;
        this.w = new Timer();
        this.C = System.currentTimeMillis();
        this.w.schedule(new kh.j2(this, 4), 0L, 1000L);
    }

    public final void q() {
        if (this.v != null) {
            return;
        }
        Timer timer = new Timer();
        this.v = timer;
        timer.schedule(new rm0(this), 0L, 1000L);
    }

    public final void r() {
        try {
            synchronized (this.x) {
                try {
                    Timer timer = this.w;
                    if (timer != null) {
                        timer.cancel();
                        this.w = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public final void s() {
        try {
            synchronized (this.x) {
                try {
                    Timer timer = this.v;
                    if (timer != null) {
                        timer.cancel();
                        this.v = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public final void t() {
        int i9;
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.a);
        this.F = true;
        wm0 wm0Var = this.M;
        wm0Var.y1();
        TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
        tL_auth_resendCode.phone_number = this.a;
        tL_auth_resendCode.phone_code_hash = this.b;
        i9 = ((org.telegram.ui.ActionBar.o2) wm0Var).currentAccount;
        ConnectionsManager.getInstance(i9).sendRequest(tL_auth_resendCode, new y9(this, bundle, tL_auth_resendCode, 27), 2);
    }
}
