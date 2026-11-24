// default package

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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class tz7 extends kla implements jm7, vlb {
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
    public final /* synthetic */ xz7 R;
    public String a;
    public String b;
    public final LinearLayout c;
    public EditTextBoldCursor[] d;
    public final TextView e;
    public final TextView f;
    public final ImageView h;
    public final wb n;
    public final wb r;
    public final uz7 s;
    public Timer w;
    public Timer x;
    public final Object y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tz7(xz7 xz7Var, Context context, int i) {
        super(context);
        float f;
        this.R = xz7Var;
        this.y = new Object();
        this.E = 60000;
        this.F = 15000;
        this.L = "";
        this.O = "*";
        this.M = i;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.e = textView;
        int i2 = cmb.C6;
        anb.X(textView, i2, null);
        textView.setTextSize(1, 14.0f);
        textView.setLineSpacing(gm.L(2.0f), 1.0f);
        TextView textView2 = new TextView(context);
        this.f = textView2;
        int i3 = cmb.F6;
        td4.x(textView2, i3, null, 1, 18.0f);
        textView2.setGravity(jb6.a0 ? 5 : 3);
        textView2.setLineSpacing(gm.L(2.0f), 1.0f);
        textView2.setGravity(49);
        if (i == 3) {
            textView.setGravity((jb6.a0 ? 5 : 3) | 48);
            FrameLayout frameLayout = new FrameLayout(context);
            addView(frameLayout, qoe.r(-2, -2, jb6.a0 ? 5 : 3));
            ImageView k = td4.k(context, R.drawable.phone_activate);
            boolean z = jb6.a0;
            if (z) {
                f = 2.0f;
                frameLayout.addView(k, qoe.d(64, 76.0f, 19, 2.0f, 2.0f, 0.0f, 0.0f));
                frameLayout.addView(textView, qoe.d(-1, -2.0f, jb6.a0 ? 5 : 3, 82.0f, 0.0f, 0.0f, 0.0f));
            } else {
                f = 2.0f;
                frameLayout.addView(textView, qoe.d(-1, -2.0f, z ? 5 : 3, 0.0f, 0.0f, 82.0f, 0.0f));
                frameLayout.addView(k, qoe.d(64, 76.0f, 21, 0.0f, 2.0f, 0.0f, 2.0f));
            }
        } else {
            f = 2.0f;
            textView.setGravity(49);
            FrameLayout frameLayout2 = new FrameLayout(context);
            addView(frameLayout2, qoe.r(-2, -2, 49));
            if (i == 1) {
                ImageView k2 = td4.k(context, R.drawable.sms_devices);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                anb.s(k2, i3, null, mode);
                frameLayout2.addView(k2, qoe.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                ImageView imageView = new ImageView(context);
                this.h = imageView;
                imageView.setImageResource(R.drawable.sms_bubble);
                anb.s(imageView, cmb.O9, null, mode);
                frameLayout2.addView(imageView, qoe.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                textView2.setText(jb6.M0(2131745306, null));
            } else {
                ImageView imageView2 = new ImageView(context);
                this.h = imageView2;
                imageView2.setImageResource(R.drawable.sms_code);
                anb.s(imageView2, cmb.O9, null, PorterDuff.Mode.MULTIPLY);
                frameLayout2.addView(imageView2, qoe.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                textView2.setText(jb6.M0(2131745300, null));
            }
            addView(textView2, qoe.t(-2, -2, 49, 0, 18, 0, 0));
            addView(textView, qoe.t(-2, -2, 49, 0, 17, 0, 0));
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.c = linearLayout;
        linearLayout.setOrientation(0);
        addView(linearLayout, qoe.r(-2, 36, 1));
        if (i == 3) {
            linearLayout.setVisibility(8);
        }
        wb wbVar = new wb(context, (byte) 27);
        this.n = wbVar;
        anb.X(wbVar, i2, null);
        wbVar.setLineSpacing(gm.L(f), 1.0f);
        if (i == 3) {
            wbVar.setTextSize(1, 14.0f);
            addView(wbVar, qoe.r(-2, -2, jb6.a0 ? 5 : 3));
            uz7 uz7Var = new uz7(context);
            Paint paint = new Paint();
            uz7Var.a = paint;
            Paint paint2 = new Paint();
            uz7Var.b = paint2;
            paint.setColor(cmb.w0(null, cmb.Wi, false));
            paint2.setColor(cmb.w0(null, cmb.Xi, false));
            this.s = uz7Var;
            wbVar.setGravity(jb6.a0 ? 5 : 3);
            addView(uz7Var, qoe.k(0.0f, 12.0f, 0.0f, 0.0f, -1, 3));
        } else {
            wbVar.setPadding(0, gm.L(f), 0, gm.L(10.0f));
            wbVar.setTextSize(1, 15.0f);
            wbVar.setGravity(49);
            addView(wbVar, qoe.r(-2, -2, 49));
        }
        wb wbVar2 = new wb(context, (byte) 28);
        this.r = wbVar2;
        anb.X(wbVar2, cmb.p6, null);
        wbVar2.setLineSpacing(gm.L(f), 1.0f);
        wbVar2.setPadding(0, gm.L(f), 0, gm.L(10.0f));
        wbVar2.setTextSize(1, 15.0f);
        wbVar2.setGravity(49);
        if (i == 1) {
            wbVar2.setText(jb6.M0(2131751380, null));
        } else {
            wbVar2.setText(jb6.M0(2131751386, null));
        }
        addView(wbVar2, qoe.r(-2, -2, 49));
        wbVar2.setOnClickListener(new m67(this, (byte) 9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getCode() {
        if (this.d == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            EditTextBoldCursor[] editTextBoldCursorArr = this.d;
            if (i >= editTextBoldCursorArr.length) {
                return sb.toString();
            }
            sb.append(r58.h(editTextBoldCursorArr[i].getText().toString(), false));
            i++;
        }
    }

    @Override // kla
    public final boolean b() {
        return true;
    }

    @Override // kla
    public final boolean d(boolean z) {
        int i;
        xz7 xz7Var = this.R;
        byte b = 0;
        if (!z) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xz7Var.getParentActivity());
            String M0 = jb6.M0(R.string.AppName, null);
            he heVar = alertDialog$Builder.a;
            heVar.S = M0;
            heVar.U = jb6.M0(2131744512, null);
            alertDialog$Builder.j(jb6.M0(2131751708, null), null);
            alertDialog$Builder.g(jb6.M0(2131744530, null), new pz7(this, b));
            xz7Var.showDialog(heVar);
            return false;
        }
        TLRPC.TL_auth_cancelCode tL_auth_cancelCode = new TLRPC.TL_auth_cancelCode();
        tL_auth_cancelCode.phone_number = this.a;
        tL_auth_cancelCode.phone_code_hash = this.b;
        i = ((d) xz7Var).currentAccount;
        ConnectionsManager.getInstance(i).sendRequest(tL_auth_cancelCode, new nf2(b), 2);
        r();
        q();
        int i2 = this.M;
        if (i2 == 2) {
            gm.y3(false);
            nm7.e().n(this, nm7.k4);
        } else if (i2 == 3) {
            gm.x3(false);
            nm7.e().n(this, nm7.l4);
        }
        this.J = false;
        return true;
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        if (!this.J || (editTextBoldCursorArr = this.d) == null) {
            return;
        }
        if (i == nm7.k4) {
            editTextBoldCursorArr[0].setText(String.valueOf(objArr[0]));
            h(null);
        } else if (i == nm7.l4) {
            String valueOf = String.valueOf(objArr[0]);
            if (gm.x(this.O, valueOf)) {
                this.I = true;
                this.d[0].setText(valueOf);
                this.I = false;
                h(null);
            }
        }
    }

    @Override // kla
    public final void e() {
        this.K = false;
    }

    @Override // kla
    public final void f() {
        int i = this.M;
        if (i == 2) {
            gm.y3(false);
            nm7.e().n(this, nm7.k4);
        } else if (i == 3) {
            gm.x3(false);
            nm7.e().n(this, nm7.l4);
        }
        this.J = false;
        r();
        q();
    }

    @Override // kla
    public final void h(String str) {
        int i;
        if (this.K) {
            return;
        }
        String code = getCode();
        if (TextUtils.isEmpty(code)) {
            gm.z3(this.c);
            return;
        }
        this.K = true;
        byte b = 2;
        int i2 = this.M;
        if (i2 == 2) {
            gm.y3(false);
            nm7.e().n(this, nm7.k4);
        } else if (i2 == 3) {
            gm.x3(false);
            nm7.e().n(this, nm7.l4);
        }
        this.J = false;
        xz7 xz7Var = this.R;
        xz7Var.Q1(true, true);
        TL_account.verifyPhone verifyphone = new TL_account.verifyPhone();
        verifyphone.phone_number = this.a;
        verifyphone.phone_code = code;
        verifyphone.phone_code_hash = this.b;
        r();
        xz7Var.B1();
        i = ((d) xz7Var).currentAccount;
        ConnectionsManager.getInstance(i).sendRequest(verifyphone, new jl7(this, verifyphone, b), 2);
    }

    @Override // kla
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
                gm.E3(this.d[length]);
                return;
            }
        }
    }

    @Override // kla
    public final void m(Bundle bundle, boolean z) {
        int i;
        int i2;
        if (bundle != null) {
            this.J = true;
            int i3 = this.M;
            if (i3 == 2) {
                gm.y3(true);
                nm7.e().a(this, nm7.k4);
            } else if (i3 == 3) {
                gm.x3(true);
                nm7.e().a(this, nm7.l4);
            }
            this.a = bundle.getString("phone");
            this.b = bundle.getString("phoneHash");
            int i4 = bundle.getInt("timeout");
            this.E = i4;
            this.Q = i4;
            this.N = bundle.getInt("nextType");
            this.O = bundle.getString("pattern");
            int i5 = bundle.getInt("length");
            this.P = i5;
            if (i5 == 0) {
                i5 = 5;
                this.P = 5;
            }
            EditTextBoldCursor[] editTextBoldCursorArr = this.d;
            CharSequence charSequence = "";
            if (editTextBoldCursorArr != null && editTextBoldCursorArr.length == i5) {
                int i6 = 0;
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr2 = this.d;
                    if (i6 >= editTextBoldCursorArr2.length) {
                        break;
                    }
                    editTextBoldCursorArr2[i6].setText("");
                    i6++;
                }
            } else {
                this.d = new EditTextBoldCursor[i5];
                final int i7 = 0;
                while (i7 < this.P) {
                    this.d[i7] = new EditTextBoldCursor(getContext());
                    EditTextBoldCursor editTextBoldCursor = this.d[i7];
                    int i8 = cmb.F6;
                    anb.X(editTextBoldCursor, i8, null);
                    anb.v(this.d[i7], i8, null);
                    this.d[i7].setCursorSize(gm.L(20.0f));
                    this.d[i7].setCursorWidth(1.5f);
                    Drawable mutate = getResources().getDrawable(R.drawable.search_dark_activated).mutate();
                    anb.x(this, mutate, cmb.k6, null, PorterDuff.Mode.MULTIPLY);
                    this.d[i7].setBackgroundDrawable(mutate);
                    this.d[i7].setImeOptions(268435461);
                    this.d[i7].setTextSize(1, 20.0f);
                    this.d[i7].setMaxLines(1);
                    this.d[i7].setTypeface(gm.o());
                    this.d[i7].setPadding(0, 0, 0, 0);
                    this.d[i7].setGravity(49);
                    EditTextBoldCursor[] editTextBoldCursorArr3 = this.d;
                    if (i3 == 3) {
                        editTextBoldCursorArr3[i7].setEnabled(false);
                        this.d[i7].setInputType(0);
                        this.d[i7].setVisibility(8);
                    } else {
                        editTextBoldCursorArr3[i7].setInputType(3);
                    }
                    this.c.addView(this.d[i7], qoe.t(34, 36, 1, 0, 0, i7 != this.P - 1 ? 7 : 0, 0));
                    this.d[i7].addTextChangedListener(new rz7(this, i7));
                    this.d[i7].setOnKeyListener(new View.OnKeyListener() { // from class: qz7
                        @Override // android.view.View.OnKeyListener
                        public final boolean onKey(View view, int i9, KeyEvent keyEvent) {
                            if (i9 != 67) {
                                return false;
                            }
                            tz7 tz7Var = tz7.this;
                            EditTextBoldCursor[] editTextBoldCursorArr4 = tz7Var.d;
                            int i10 = i7;
                            if (editTextBoldCursorArr4[i10].length() != 0 || i10 <= 0) {
                                return false;
                            }
                            int i11 = i10 - 1;
                            EditTextBoldCursor editTextBoldCursor2 = tz7Var.d[i11];
                            editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                            tz7Var.d[i11].requestFocus();
                            tz7Var.d[i11].dispatchKeyEvent(keyEvent);
                            return true;
                        }
                    });
                    this.d[i7].setOnEditorActionListener(new j(this, (byte) 19));
                    i7++;
                }
            }
            uz7 uz7Var = this.s;
            if (uz7Var != null) {
                uz7Var.setVisibility(this.N != 0 ? 0 : 8);
            }
            if (this.a == null) {
                return;
            }
            String l = mlb.l(new StringBuilder("+"), this.a, r58.f());
            if (i3 == 2) {
                charSequence = gm.S2(jb6.a0("SentSmsCode", null, 2131745301, jb6.a(l)));
            } else if (i3 == 3) {
                charSequence = gm.S2(jb6.a0("SentCallCode", null, 2131745304, jb6.a(l)));
            } else if (i3 == 4) {
                charSequence = gm.S2(jb6.a0("SentCallOnly", null, 2131745303, jb6.a(l)));
            }
            this.e.setText(charSequence);
            EditTextBoldCursor[] editTextBoldCursorArr4 = this.d;
            if (i3 != 3) {
                gm.E3(editTextBoldCursorArr4[0]);
                this.d[0].requestFocus();
            } else {
                gm.t1(editTextBoldCursorArr4[0]);
            }
            r();
            q();
            this.G = System.currentTimeMillis();
            wb wbVar = this.r;
            wb wbVar2 = this.n;
            if (i3 == 3) {
                int i9 = this.N;
                i = 2;
                if (i9 == 4 || i9 == 2) {
                    wbVar.setVisibility(8);
                    wbVar2.setVisibility(0);
                    int i10 = this.N;
                    if (i10 == 4) {
                        wbVar2.setText(jb6.a0("CallText", null, 2131752554, 1, 0));
                    } else if (i10 == 2) {
                        wbVar2.setText(jb6.a0("SmsText", null, 2131745029, 1, 0));
                    }
                    p();
                    return;
                }
            } else {
                i = 2;
            }
            if (i3 == i) {
                int i11 = this.N;
                i2 = 0;
                if (i11 == 4 || i11 == 3) {
                    Object[] objArr = new Object[i];
                    objArr[0] = 2;
                    objArr[1] = 0;
                    wbVar2.setText(jb6.a0("CallText", null, 2131752554, objArr));
                    wbVar.setVisibility(this.E < 1000 ? 0 : 8);
                    wbVar2.setVisibility(this.E < 1000 ? 8 : 0);
                    p();
                    return;
                }
            } else {
                i2 = 0;
            }
            if (i3 != 4 || this.N != 2) {
                wbVar2.setVisibility(8);
                wbVar.setVisibility(8);
                o();
                return;
            }
            Object[] objArr2 = new Object[2];
            objArr2[i2] = 2;
            objArr2[1] = 0;
            wbVar2.setText(jb6.a0("SmsText", null, 2131745029, objArr2));
            wbVar.setVisibility(this.E < 1000 ? i2 : 8);
            wbVar2.setVisibility(this.E < 1000 ? 8 : i2);
            p();
        }
    }

    public final void o() {
        if (this.x != null) {
            return;
        }
        this.F = 15000;
        this.x = new Timer();
        this.H = System.currentTimeMillis();
        this.x.schedule(new lx3(this, (byte) 2), 0L, 1000L);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        if (this.M == 3 || this.h == null) {
            return;
        }
        int bottom = this.e.getBottom();
        int measuredHeight = getMeasuredHeight() - bottom;
        wb wbVar = this.r;
        if (wbVar.getVisibility() == 0) {
            int measuredHeight2 = wbVar.getMeasuredHeight();
            i5 = (measuredHeight + bottom) - measuredHeight2;
            wbVar.layout(wbVar.getLeft(), i5, wbVar.getRight(), measuredHeight2 + i5);
        } else {
            wb wbVar2 = this.n;
            if (wbVar2.getVisibility() == 0) {
                int measuredHeight3 = wbVar2.getMeasuredHeight();
                i5 = (measuredHeight + bottom) - measuredHeight3;
                wbVar2.layout(wbVar2.getLeft(), i5, wbVar2.getRight(), measuredHeight3 + i5);
            } else {
                i5 = measuredHeight + bottom;
            }
        }
        LinearLayout linearLayout = this.c;
        int measuredHeight4 = linearLayout.getMeasuredHeight();
        int g = wi8.g(i5 - bottom, measuredHeight4, 2, bottom);
        linearLayout.layout(linearLayout.getLeft(), g, linearLayout.getRight(), measuredHeight4 + g);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        ImageView imageView;
        super.onMeasure(i, i2);
        if (this.M == 3 || (imageView = this.h) == null) {
            return;
        }
        int L = gm.L(35.0f) + this.e.getMeasuredHeight() + this.f.getMeasuredHeight() + imageView.getMeasuredHeight();
        int L2 = gm.L(80.0f);
        int L3 = gm.L(291.0f);
        xz7 xz7Var = this.R;
        if (xz7Var.t0 - L < L2) {
            setMeasuredDimension(getMeasuredWidth(), L + L2);
        } else {
            setMeasuredDimension(getMeasuredWidth(), Math.min(xz7Var.t0, L3));
        }
    }

    public final void p() {
        if (this.w != null) {
            return;
        }
        Timer timer = new Timer();
        this.w = timer;
        timer.schedule(new sz7(this), 0L, 1000L);
    }

    public final void q() {
        try {
            synchronized (this.y) {
                Timer timer = this.x;
                if (timer != null) {
                    timer.cancel();
                    this.x = null;
                }
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final void r() {
        try {
            synchronized (this.y) {
                Timer timer = this.w;
                if (timer != null) {
                    timer.cancel();
                    this.w = null;
                }
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final void s() {
        int i;
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.a);
        this.K = true;
        xz7 xz7Var = this.R;
        xz7Var.B1();
        TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
        tL_auth_resendCode.phone_number = this.a;
        tL_auth_resendCode.phone_code_hash = this.b;
        i = ((d) xz7Var).currentAccount;
        ConnectionsManager.getInstance(i).sendRequest(tL_auth_resendCode, new i65(this, bundle, tL_auth_resendCode, (byte) 24), 2);
    }

    @Override // kla
    public final void updateColors() {
        try {
            if (this.d == null) {
                return;
            }
            int i = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.d;
                if (i >= editTextBoldCursorArr.length) {
                    return;
                }
                EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i];
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.setCursorColor(cmb.w0(null, cmb.F6, false));
                }
                i++;
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }
}
