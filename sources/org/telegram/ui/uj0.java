package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import java.util.Timer;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class uj0 extends org.telegram.ui.Components.vt0 implements org.telegram.messenger.cs, org.telegram.ui.ActionBar.z5 {
    public static final /* synthetic */ int S = 0;
    public int E;
    public int F;
    public double G;
    public double H;
    public boolean I;
    public boolean J;
    public boolean K;
    public String L;
    public final int M;
    public int N;
    public String O;
    public int P;
    public int Q;
    public final /* synthetic */ yj0 R;
    public String a;
    public String b;
    public final LinearLayout c;
    public EditTextBoldCursor[] d;
    public final TextView e;
    public final TextView f;
    public final ImageView h;
    public final jb0 n;
    public final jb0 r;
    public final vj0 s;
    public Timer w;
    public Timer x;
    public final Object y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uj0(yj0 yj0Var, Context context, int i3) {
        super(context);
        float f10;
        this.R = yj0Var;
        this.y = new Object();
        this.E = 60000;
        this.F = 15000;
        this.L = "";
        this.O = "*";
        this.M = i3;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.e = textView;
        int i10 = org.telegram.ui.ActionBar.k6.D6;
        org.telegram.ui.ActionBar.r6.V(textView, i10, null);
        textView.setTextSize(1, 14.0f);
        textView.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        TextView textView2 = new TextView(context);
        this.f = textView2;
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.messenger.k5.n(textView2, i11, null, 1, 18.0f);
        int i12 = 3;
        textView2.setGravity(org.telegram.messenger.bd.a0 ? 5 : 3);
        textView2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        textView2.setGravity(49);
        if (i3 == 3) {
            textView.setGravity((org.telegram.messenger.bd.a0 ? 5 : 3) | 48);
            FrameLayout frameLayout = new FrameLayout(context);
            addView(frameLayout, b8.mf.r(-2, -2, org.telegram.messenger.bd.a0 ? 5 : 3));
            ImageView e10 = org.telegram.messenger.camera.q.e(context, R.drawable.phone_activate);
            boolean z10 = org.telegram.messenger.bd.a0;
            if (z10) {
                f10 = 2.0f;
                frameLayout.addView(e10, b8.mf.d(64, 76.0f, 19, 2.0f, 2.0f, 0.0f, 0.0f));
                frameLayout.addView(textView, b8.mf.d(-1, -2.0f, org.telegram.messenger.bd.a0 ? 5 : 3, 82.0f, 0.0f, 0.0f, 0.0f));
            } else {
                f10 = 2.0f;
                frameLayout.addView(textView, b8.mf.d(-1, -2.0f, z10 ? 5 : 3, 0.0f, 0.0f, 82.0f, 0.0f));
                frameLayout.addView(e10, b8.mf.d(64, 76.0f, 21, 0.0f, 2.0f, 0.0f, 2.0f));
            }
        } else {
            f10 = 2.0f;
            textView.setGravity(49);
            FrameLayout frameLayout2 = new FrameLayout(context);
            addView(frameLayout2, b8.mf.r(-2, -2, 49));
            if (i3 == 1) {
                ImageView e11 = org.telegram.messenger.camera.q.e(context, R.drawable.sms_devices);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                org.telegram.ui.ActionBar.r6.t(e11, i11, null, mode);
                frameLayout2.addView(e11, b8.mf.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                ImageView imageView = new ImageView(context);
                this.h = imageView;
                imageView.setImageResource(R.drawable.sms_bubble);
                org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.P9, null, mode);
                frameLayout2.addView(imageView, b8.mf.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                textView2.setText(org.telegram.messenger.bd.M0(2131745582, null));
            } else {
                ImageView imageView2 = new ImageView(context);
                this.h = imageView2;
                imageView2.setImageResource(R.drawable.sms_code);
                org.telegram.ui.ActionBar.r6.t(imageView2, org.telegram.ui.ActionBar.k6.P9, null, PorterDuff.Mode.MULTIPLY);
                frameLayout2.addView(imageView2, b8.mf.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                textView2.setText(org.telegram.messenger.bd.M0(2131745576, null));
            }
            addView(textView2, b8.mf.t(-2, -2, 49, 0, 18, 0, 0));
            addView(textView, b8.mf.t(-2, -2, 49, 0, 17, 0, 0));
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.c = linearLayout;
        linearLayout.setOrientation(0);
        addView(linearLayout, b8.mf.r(-2, 36, 1));
        if (i3 == 3) {
            linearLayout.setVisibility(8);
        }
        jb0 jb0Var = new jb0(context, 2);
        this.n = jb0Var;
        org.telegram.ui.ActionBar.r6.V(jb0Var, i10, null);
        jb0Var.setLineSpacing(org.telegram.messenger.g0.L(f10), 1.0f);
        if (i3 == 3) {
            jb0Var.setTextSize(1, 14.0f);
            addView(jb0Var, b8.mf.r(-2, -2, org.telegram.messenger.bd.a0 ? 5 : 3));
            vj0 vj0Var = new vj0(context);
            Paint paint = new Paint();
            vj0Var.a = paint;
            Paint paint2 = new Paint();
            vj0Var.b = paint2;
            paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ui, false));
            paint2.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Vi, false));
            this.s = vj0Var;
            jb0Var.setGravity(org.telegram.messenger.bd.a0 ? 5 : 3);
            addView(vj0Var, b8.mf.k(0.0f, 12.0f, 0.0f, 0.0f, -1, 3));
        } else {
            jb0Var.setPadding(0, org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(10.0f));
            jb0Var.setTextSize(1, 15.0f);
            jb0Var.setGravity(49);
            addView(jb0Var, b8.mf.r(-2, -2, 49));
        }
        jb0 jb0Var2 = new jb0(context, i12);
        this.r = jb0Var2;
        org.telegram.ui.ActionBar.r6.V(jb0Var2, org.telegram.ui.ActionBar.k6.q6, null);
        jb0Var2.setLineSpacing(org.telegram.messenger.g0.L(f10), 1.0f);
        jb0Var2.setPadding(0, org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(10.0f));
        jb0Var2.setTextSize(1, 15.0f);
        jb0Var2.setGravity(49);
        if (i3 == 1) {
            jb0Var2.setText(org.telegram.messenger.bd.M0(2131751444, null));
        } else {
            jb0Var2.setText(org.telegram.messenger.bd.M0(2131751450, null));
        }
        addView(jb0Var2, b8.mf.r(-2, -2, 49));
        jb0Var2.setOnClickListener(new b40(this, 17));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getCode() {
        if (this.d == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int i3 = 0;
        while (true) {
            EditTextBoldCursor[] editTextBoldCursorArr = this.d;
            if (i3 >= editTextBoldCursorArr.length) {
                return sb2.toString();
            }
            sb2.append(mf.b.d(editTextBoldCursorArr[i3].getText().toString(), false));
            i3++;
        }
    }

    @Override // org.telegram.ui.Components.vt0
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Components.vt0
    public final boolean c(boolean z10) {
        int i3;
        int i10 = 1;
        yj0 yj0Var = this.R;
        if (!z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yj0Var.getParentActivity());
            String M0 = org.telegram.messenger.bd.M0(R.string.AppName, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
            s1Var.S = M0;
            s1Var.U = org.telegram.messenger.bd.M0(2131744833, null);
            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751771, null), null);
            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131744851, null), new qj0(this, i10));
            yj0Var.showDialog(s1Var);
            return false;
        }
        TLRPC.TL_auth_cancelCode tL_auth_cancelCode = new TLRPC.TL_auth_cancelCode();
        tL_auth_cancelCode.phone_number = this.a;
        tL_auth_cancelCode.phone_code_hash = this.b;
        i3 = ((org.telegram.ui.ActionBar.d2) yj0Var).currentAccount;
        ConnectionsManager.getInstance(i3).sendRequest(tL_auth_cancelCode, new ei.u5(25), 2);
        r();
        q();
        int i11 = this.M;
        if (i11 == 2) {
            org.telegram.messenger.g0.E3(false);
            org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.g4);
        } else if (i11 == 3) {
            org.telegram.messenger.g0.D3(false);
            org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.h4);
        }
        this.J = false;
        return true;
    }

    @Override // org.telegram.ui.Components.vt0
    public final void d() {
        this.K = false;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        if (!this.J || (editTextBoldCursorArr = this.d) == null) {
            return;
        }
        if (i3 == org.telegram.messenger.hs.g4) {
            editTextBoldCursorArr[0].setText("" + objArr[0]);
            h(null);
            return;
        }
        if (i3 == org.telegram.messenger.hs.h4) {
            String str = "" + objArr[0];
            if (org.telegram.messenger.g0.x(this.O, str)) {
                this.I = true;
                this.d[0].setText(str);
                this.I = false;
                h(null);
            }
        }
    }

    @Override // org.telegram.ui.Components.vt0
    public final void f() {
        int i3 = this.M;
        if (i3 == 2) {
            org.telegram.messenger.g0.E3(false);
            org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.g4);
        } else if (i3 == 3) {
            org.telegram.messenger.g0.D3(false);
            org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.h4);
        }
        this.J = false;
        r();
        q();
    }

    @Override // org.telegram.ui.Components.vt0
    public final void h(String str) {
        int i3;
        if (this.K) {
            return;
        }
        String code = getCode();
        if (TextUtils.isEmpty(code)) {
            org.telegram.messenger.g0.F3(this.c);
            return;
        }
        this.K = true;
        int i10 = this.M;
        if (i10 == 2) {
            org.telegram.messenger.g0.E3(false);
            org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.g4);
        } else if (i10 == 3) {
            org.telegram.messenger.g0.D3(false);
            org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.h4);
        }
        this.J = false;
        yj0 yj0Var = this.R;
        yj0Var.R1(true, true);
        TL_account.verifyPhone verifyphone = new TL_account.verifyPhone();
        verifyphone.phone_number = this.a;
        verifyphone.phone_code = code;
        verifyphone.phone_code_hash = this.b;
        r();
        yj0Var.C1();
        i3 = ((org.telegram.ui.ActionBar.d2) yj0Var).currentAccount;
        ConnectionsManager.getInstance(i3).sendRequest(verifyphone, new xy(17, this, verifyphone), 2);
    }

    @Override // org.telegram.ui.Components.vt0
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
                org.telegram.messenger.g0.K3(this.d[length]);
                return;
            }
        }
    }

    @Override // org.telegram.ui.Components.vt0
    public final void m(Bundle bundle, boolean z10) {
        int i3;
        int i10;
        if (bundle == null) {
            return;
        }
        this.J = true;
        int i11 = this.M;
        if (i11 == 2) {
            org.telegram.messenger.g0.E3(true);
            org.telegram.messenger.hs.e().b(this, org.telegram.messenger.hs.g4);
        } else if (i11 == 3) {
            org.telegram.messenger.g0.D3(true);
            org.telegram.messenger.hs.e().b(this, org.telegram.messenger.hs.h4);
        }
        this.a = bundle.getString("phone");
        this.b = bundle.getString("phoneHash");
        int i12 = bundle.getInt("timeout");
        this.E = i12;
        this.Q = i12;
        this.N = bundle.getInt("nextType");
        this.O = bundle.getString("pattern");
        int i13 = bundle.getInt("length");
        this.P = i13;
        if (i13 == 0) {
            this.P = 5;
        }
        EditTextBoldCursor[] editTextBoldCursorArr = this.d;
        CharSequence charSequence = "";
        if (editTextBoldCursorArr != null && editTextBoldCursorArr.length == this.P) {
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
            this.d = new EditTextBoldCursor[this.P];
            final int i15 = 0;
            while (i15 < this.P) {
                this.d[i15] = new EditTextBoldCursor(getContext());
                EditTextBoldCursor editTextBoldCursor = this.d[i15];
                int i16 = org.telegram.ui.ActionBar.k6.G6;
                org.telegram.ui.ActionBar.r6.V(editTextBoldCursor, i16, null);
                org.telegram.ui.ActionBar.r6.w(this.d[i15], i16, null);
                this.d[i15].setCursorSize(org.telegram.messenger.g0.L(20.0f));
                this.d[i15].setCursorWidth(1.5f);
                Drawable mutate = getResources().getDrawable(R.drawable.search_dark_activated).mutate();
                org.telegram.ui.ActionBar.r6.y(this, mutate, org.telegram.ui.ActionBar.k6.l6, null, PorterDuff.Mode.MULTIPLY);
                this.d[i15].setBackgroundDrawable(mutate);
                this.d[i15].setImeOptions(268435461);
                this.d[i15].setTextSize(1, 20.0f);
                this.d[i15].setMaxLines(1);
                this.d[i15].setTypeface(org.telegram.messenger.g0.o());
                this.d[i15].setPadding(0, 0, 0, 0);
                this.d[i15].setGravity(49);
                if (i11 == 3) {
                    this.d[i15].setEnabled(false);
                    this.d[i15].setInputType(0);
                    this.d[i15].setVisibility(8);
                } else {
                    this.d[i15].setInputType(3);
                }
                this.c.addView(this.d[i15], b8.mf.t(34, 36, 1, 0, 0, i15 != this.P - 1 ? 7 : 0, 0));
                this.d[i15].addTextChangedListener(new sj0(this, i15));
                this.d[i15].setOnKeyListener(new View.OnKeyListener() { // from class: org.telegram.ui.rj0
                    @Override // android.view.View.OnKeyListener
                    public final boolean onKey(View view, int i17, KeyEvent keyEvent) {
                        uj0 uj0Var = uj0.this;
                        if (i17 != 67) {
                            uj0Var.getClass();
                            return false;
                        }
                        EditTextBoldCursor[] editTextBoldCursorArr3 = uj0Var.d;
                        int i18 = i15;
                        if (editTextBoldCursorArr3[i18].length() != 0 || i18 <= 0) {
                            return false;
                        }
                        int i19 = i18 - 1;
                        EditTextBoldCursor editTextBoldCursor2 = uj0Var.d[i19];
                        editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                        uj0Var.d[i19].requestFocus();
                        uj0Var.d[i19].dispatchKeyEvent(keyEvent);
                        return true;
                    }
                });
                this.d[i15].setOnEditorActionListener(new ea(this, 9));
                i15++;
            }
        }
        vj0 vj0Var = this.s;
        if (vj0Var != null) {
            vj0Var.setVisibility(this.N != 0 ? 0 : 8);
        }
        if (this.a == null) {
            return;
        }
        String i17 = org.telegram.messenger.k5.i(new StringBuilder("+"), this.a, mf.b.c());
        if (i11 == 2) {
            charSequence = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("SentSmsCode", null, 2131745577, org.telegram.messenger.bd.a(i17)));
        } else if (i11 == 3) {
            charSequence = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("SentCallCode", null, 2131745580, org.telegram.messenger.bd.a(i17)));
        } else if (i11 == 4) {
            charSequence = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("SentCallOnly", null, 2131745579, org.telegram.messenger.bd.a(i17)));
        }
        this.e.setText(charSequence);
        if (i11 != 3) {
            org.telegram.messenger.g0.K3(this.d[0]);
            this.d[0].requestFocus();
        } else {
            org.telegram.messenger.g0.v1(this.d[0]);
        }
        r();
        q();
        this.G = System.currentTimeMillis();
        jb0 jb0Var = this.r;
        jb0 jb0Var2 = this.n;
        if (i11 == 3) {
            int i18 = this.N;
            i3 = 2;
            if (i18 == 4 || i18 == 2) {
                jb0Var.setVisibility(8);
                jb0Var2.setVisibility(0);
                int i19 = this.N;
                if (i19 == 4) {
                    jb0Var2.setText(org.telegram.messenger.bd.a0("CallText", null, 2131752601, 1, 0));
                } else if (i19 == 2) {
                    jb0Var2.setText(org.telegram.messenger.bd.a0("SmsText", null, 2131745305, 1, 0));
                }
                p();
                return;
            }
        } else {
            i3 = 2;
        }
        if (i11 == i3) {
            int i20 = this.N;
            i10 = 0;
            if (i20 == 4 || i20 == 3) {
                Object[] objArr = new Object[i3];
                objArr[0] = 2;
                objArr[1] = 0;
                jb0Var2.setText(org.telegram.messenger.bd.a0("CallText", null, 2131752601, objArr));
                jb0Var.setVisibility(this.E < 1000 ? 0 : 8);
                jb0Var2.setVisibility(this.E < 1000 ? 8 : 0);
                p();
                return;
            }
        } else {
            i10 = 0;
        }
        if (i11 != 4 || this.N != 2) {
            jb0Var2.setVisibility(8);
            jb0Var.setVisibility(8);
            o();
            return;
        }
        Object[] objArr2 = new Object[2];
        objArr2[i10] = 2;
        objArr2[1] = 0;
        jb0Var2.setText(org.telegram.messenger.bd.a0("SmsText", null, 2131745305, objArr2));
        jb0Var.setVisibility(this.E < 1000 ? i10 : 8);
        jb0Var2.setVisibility(this.E < 1000 ? 8 : i10);
        p();
    }

    public final void o() {
        if (this.x != null) {
            return;
        }
        this.F = 15000;
        this.x = new Timer();
        this.H = System.currentTimeMillis();
        this.x.schedule(new g6.q(this, 5), 0L, 1000L);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int i13;
        super.onLayout(z10, i3, i10, i11, i12);
        if (this.M == 3 || this.h == null) {
            return;
        }
        int bottom = this.e.getBottom();
        int measuredHeight = getMeasuredHeight() - bottom;
        jb0 jb0Var = this.r;
        if (jb0Var.getVisibility() == 0) {
            int measuredHeight2 = jb0Var.getMeasuredHeight();
            i13 = (measuredHeight + bottom) - measuredHeight2;
            jb0Var.layout(jb0Var.getLeft(), i13, jb0Var.getRight(), measuredHeight2 + i13);
        } else {
            jb0 jb0Var2 = this.n;
            if (jb0Var2.getVisibility() == 0) {
                int measuredHeight3 = jb0Var2.getMeasuredHeight();
                i13 = (measuredHeight + bottom) - measuredHeight3;
                jb0Var2.layout(jb0Var2.getLeft(), i13, jb0Var2.getRight(), measuredHeight3 + i13);
            } else {
                i13 = measuredHeight + bottom;
            }
        }
        LinearLayout linearLayout = this.c;
        int measuredHeight4 = linearLayout.getMeasuredHeight();
        int e10 = k2.p1.e(i13 - bottom, measuredHeight4, 2, bottom);
        linearLayout.layout(linearLayout.getLeft(), e10, linearLayout.getRight(), measuredHeight4 + e10);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        ImageView imageView;
        super.onMeasure(i3, i10);
        if (this.M == 3 || (imageView = this.h) == null) {
            return;
        }
        int L = org.telegram.messenger.g0.L(35.0f) + this.e.getMeasuredHeight() + this.f.getMeasuredHeight() + imageView.getMeasuredHeight();
        int L2 = org.telegram.messenger.g0.L(80.0f);
        int L3 = org.telegram.messenger.g0.L(291.0f);
        yj0 yj0Var = this.R;
        if (yj0Var.t0 - L < L2) {
            setMeasuredDimension(getMeasuredWidth(), L + L2);
        } else {
            setMeasuredDimension(getMeasuredWidth(), Math.min(yj0Var.t0, L3));
        }
    }

    public final void p() {
        if (this.w != null) {
            return;
        }
        Timer timer = new Timer();
        this.w = timer;
        timer.schedule(new tj0(this), 0L, 1000L);
    }

    public final void q() {
        try {
            synchronized (this.y) {
                try {
                    Timer timer = this.x;
                    if (timer != null) {
                        timer.cancel();
                        this.x = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void r() {
        try {
            synchronized (this.y) {
                try {
                    Timer timer = this.w;
                    if (timer != null) {
                        timer.cancel();
                        this.w = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void s() {
        int i3;
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.a);
        this.K = true;
        yj0 yj0Var = this.R;
        yj0Var.C1();
        TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
        tL_auth_resendCode.phone_number = this.a;
        tL_auth_resendCode.phone_code_hash = this.b;
        i3 = ((org.telegram.ui.ActionBar.d2) yj0Var).currentAccount;
        ConnectionsManager.getInstance(i3).sendRequest(tL_auth_resendCode, new y9(this, bundle, tL_auth_resendCode, 27), 2);
    }

    @Override // org.telegram.ui.Components.vt0
    public final void updateColors() {
        try {
            if (this.d == null) {
                return;
            }
            int i3 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.d;
                if (i3 >= editTextBoldCursorArr.length) {
                    return;
                }
                EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i3];
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
                }
                i3++;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
