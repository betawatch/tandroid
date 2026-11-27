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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class x08 extends cna implements fn7, snb {
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
    public final /* synthetic */ b18 R;
    public String a;
    public String b;
    public final LinearLayout c;
    public EditTextBoldCursor[] d;
    public final TextView e;
    public final TextView f;
    public final ImageView h;
    public final xb n;
    public final xb r;
    public final y08 s;
    public Timer w;
    public Timer x;
    public final Object y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x08(b18 b18Var, Context context, int i) {
        super(context);
        float f;
        float f2;
        this.R = b18Var;
        this.y = new Object();
        this.E = 60000;
        this.F = 15000;
        this.L = "";
        this.O = "*";
        this.M = i;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.e = textView;
        int i2 = aob.D6;
        yob.X(textView, i2, null);
        textView.setTextSize(1, 14.0f);
        textView.setLineSpacing(hl.L(2.0f), 1.0f);
        TextView textView2 = new TextView(context);
        this.f = textView2;
        int i3 = aob.G6;
        qd4.w(textView2, i3, null, 1, 18.0f);
        textView2.setGravity(ob6.a0 ? 5 : 3);
        textView2.setLineSpacing(hl.L(2.0f), 1.0f);
        textView2.setGravity(49);
        if (i == 3) {
            textView.setGravity((ob6.a0 ? 5 : 3) | 48);
            FrameLayout frameLayout = new FrameLayout(context);
            addView(frameLayout, tre.r(-2, -2, ob6.a0 ? 5 : 3));
            ImageView k = qd4.k(context, R.drawable.phone_activate);
            boolean z = ob6.a0;
            if (z) {
                f = 2.0f;
                frameLayout.addView(k, tre.d(64, 76.0f, 19, 2.0f, 2.0f, 0.0f, 0.0f));
                frameLayout.addView(textView, tre.d(-1, -2.0f, ob6.a0 ? 5 : 3, 82.0f, 0.0f, 0.0f, 0.0f));
            } else {
                f = 2.0f;
                frameLayout.addView(textView, tre.d(-1, -2.0f, z ? 5 : 3, 0.0f, 0.0f, 82.0f, 0.0f));
                frameLayout.addView(k, tre.d(64, 76.0f, 21, 0.0f, 2.0f, 0.0f, 2.0f));
            }
        } else {
            f = 2.0f;
            textView.setGravity(49);
            FrameLayout frameLayout2 = new FrameLayout(context);
            addView(frameLayout2, tre.r(-2, -2, 49));
            if (i == 1) {
                ImageView k2 = qd4.k(context, R.drawable.sms_devices);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                yob.s(k2, i3, null, mode);
                frameLayout2.addView(k2, tre.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                ImageView imageView = new ImageView(context);
                this.h = imageView;
                imageView.setImageResource(R.drawable.sms_bubble);
                yob.s(imageView, aob.P9, null, mode);
                frameLayout2.addView(imageView, tre.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                textView2.setText(ob6.M0(2131745300, null));
            } else {
                ImageView imageView2 = new ImageView(context);
                this.h = imageView2;
                imageView2.setImageResource(R.drawable.sms_code);
                yob.s(imageView2, aob.P9, null, PorterDuff.Mode.MULTIPLY);
                frameLayout2.addView(imageView2, tre.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                textView2.setText(ob6.M0(2131745294, null));
            }
            addView(textView2, tre.t(-2, -2, 49, 0, 18, 0, 0));
            addView(textView, tre.t(-2, -2, 49, 0, 17, 0, 0));
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.c = linearLayout;
        linearLayout.setOrientation(0);
        addView(linearLayout, tre.r(-2, 36, 1));
        byte b = 8;
        if (i == 3) {
            linearLayout.setVisibility(8);
        }
        xb xbVar = new xb(context, (byte) 27);
        this.n = xbVar;
        yob.X(xbVar, i2, null);
        xbVar.setLineSpacing(hl.L(f), 1.0f);
        if (i == 3) {
            xbVar.setTextSize(1, 14.0f);
            addView(xbVar, tre.r(-2, -2, ob6.a0 ? 5 : 3));
            y08 y08Var = new y08(context);
            Paint paint = new Paint();
            y08Var.a = paint;
            Paint paint2 = new Paint();
            y08Var.b = paint2;
            f2 = 10.0f;
            paint.setColor(aob.w0(null, aob.Xi, false));
            paint2.setColor(aob.w0(null, aob.Yi, false));
            this.s = y08Var;
            xbVar.setGravity(ob6.a0 ? 5 : 3);
            addView(y08Var, tre.k(0.0f, 12.0f, 0.0f, 0.0f, -1, 3));
        } else {
            f2 = 10.0f;
            xbVar.setPadding(0, hl.L(f), 0, hl.L(10.0f));
            xbVar.setTextSize(1, 15.0f);
            xbVar.setGravity(49);
            addView(xbVar, tre.r(-2, -2, 49));
        }
        xb xbVar2 = new xb(context, (byte) 28);
        this.r = xbVar2;
        yob.X(xbVar2, aob.q6, null);
        xbVar2.setLineSpacing(hl.L(f), 1.0f);
        xbVar2.setPadding(0, hl.L(f), 0, hl.L(f2));
        xbVar2.setTextSize(1, 15.0f);
        xbVar2.setGravity(49);
        if (i == 1) {
            xbVar2.setText(ob6.M0(2131751408, null));
        } else {
            xbVar2.setText(ob6.M0(2131751414, null));
        }
        addView(xbVar2, tre.r(-2, -2, 49));
        xbVar2.setOnClickListener(new am7(this, b));
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
            sb.append(f78.h(editTextBoldCursorArr[i].getText().toString(), false));
            i++;
        }
    }

    @Override // cna
    public final boolean b() {
        return true;
    }

    @Override // cna
    public final boolean c(boolean z) {
        int i;
        b18 b18Var = this.R;
        byte b = 0;
        if (!z) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(b18Var.getParentActivity());
            String M0 = ob6.M0(R.string.AppName, null);
            id idVar = alertDialog$Builder.a;
            idVar.S = M0;
            idVar.U = ob6.M0(2131744480, null);
            alertDialog$Builder.j(ob6.M0(2131751736, null), null);
            alertDialog$Builder.g(ob6.M0(2131744498, null), new t08(this, b));
            b18Var.showDialog(idVar);
            return false;
        }
        TLRPC.TL_auth_cancelCode tL_auth_cancelCode = new TLRPC.TL_auth_cancelCode();
        tL_auth_cancelCode.phone_number = this.a;
        tL_auth_cancelCode.phone_code_hash = this.b;
        i = ((e) b18Var).currentAccount;
        ConnectionsManager.getInstance(i).sendRequest(tL_auth_cancelCode, new xe2(b), 2);
        r();
        q();
        int i2 = this.M;
        if (i2 == 2) {
            hl.y3(false);
            jn7.e().n(this, jn7.j4);
        } else if (i2 == 3) {
            hl.x3(false);
            jn7.e().n(this, jn7.k4);
        }
        this.J = false;
        return true;
    }

    @Override // cna
    public final void d() {
        this.K = false;
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        if (!this.J || (editTextBoldCursorArr = this.d) == null) {
            return;
        }
        if (i == jn7.j4) {
            editTextBoldCursorArr[0].setText(String.valueOf(objArr[0]));
            h(null);
        } else if (i == jn7.k4) {
            String valueOf = String.valueOf(objArr[0]);
            if (hl.x(this.O, valueOf)) {
                this.I = true;
                this.d[0].setText(valueOf);
                this.I = false;
                h(null);
            }
        }
    }

    @Override // cna
    public final void e() {
        int i = this.M;
        if (i == 2) {
            hl.y3(false);
            jn7.e().n(this, jn7.j4);
        } else if (i == 3) {
            hl.x3(false);
            jn7.e().n(this, jn7.k4);
        }
        this.J = false;
        r();
        q();
    }

    @Override // cna
    public final void h(String str) {
        int i;
        if (this.K) {
            return;
        }
        String code = getCode();
        if (TextUtils.isEmpty(code)) {
            hl.z3(this.c);
            return;
        }
        this.K = true;
        byte b = 3;
        int i2 = this.M;
        if (i2 == 2) {
            hl.y3(false);
            jn7.e().n(this, jn7.j4);
        } else if (i2 == 3) {
            hl.x3(false);
            jn7.e().n(this, jn7.k4);
        }
        this.J = false;
        b18 b18Var = this.R;
        b18Var.Q1(true, true);
        TL_account.verifyPhone verifyphone = new TL_account.verifyPhone();
        verifyphone.phone_number = this.a;
        verifyphone.phone_code = code;
        verifyphone.phone_code_hash = this.b;
        r();
        b18Var.B1();
        i = ((e) b18Var).currentAccount;
        ConnectionsManager.getInstance(i).sendRequest(verifyphone, new ol7(this, verifyphone, b), 2);
    }

    @Override // cna
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
                hl.E3(this.d[length]);
                return;
            }
        }
    }

    @Override // cna
    public final void m(Bundle bundle, boolean z) {
        int i;
        int i2;
        if (bundle != null) {
            this.J = true;
            int i3 = this.M;
            if (i3 == 2) {
                hl.y3(true);
                jn7.e().a(this, jn7.j4);
            } else if (i3 == 3) {
                hl.x3(true);
                jn7.e().a(this, jn7.k4);
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
                    int i8 = aob.G6;
                    yob.X(editTextBoldCursor, i8, null);
                    yob.v(this.d[i7], i8, null);
                    this.d[i7].setCursorSize(hl.L(20.0f));
                    this.d[i7].setCursorWidth(1.5f);
                    Drawable mutate = getResources().getDrawable(R.drawable.search_dark_activated).mutate();
                    yob.x(this, mutate, aob.l6, null, PorterDuff.Mode.MULTIPLY);
                    this.d[i7].setBackgroundDrawable(mutate);
                    this.d[i7].setImeOptions(268435461);
                    this.d[i7].setTextSize(1, 20.0f);
                    this.d[i7].setMaxLines(1);
                    this.d[i7].setTypeface(hl.o());
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
                    this.c.addView(this.d[i7], tre.t(34, 36, 1, 0, 0, i7 != this.P - 1 ? 7 : 0, 0));
                    this.d[i7].addTextChangedListener(new v08(this, i7));
                    this.d[i7].setOnKeyListener(new View.OnKeyListener() { // from class: u08
                        @Override // android.view.View.OnKeyListener
                        public final boolean onKey(View view, int i9, KeyEvent keyEvent) {
                            if (i9 != 67) {
                                return false;
                            }
                            x08 x08Var = x08.this;
                            EditTextBoldCursor[] editTextBoldCursorArr4 = x08Var.d;
                            int i10 = i7;
                            if (editTextBoldCursorArr4[i10].length() != 0 || i10 <= 0) {
                                return false;
                            }
                            int i11 = i10 - 1;
                            EditTextBoldCursor editTextBoldCursor2 = x08Var.d[i11];
                            editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                            x08Var.d[i11].requestFocus();
                            x08Var.d[i11].dispatchKeyEvent(keyEvent);
                            return true;
                        }
                    });
                    this.d[i7].setOnEditorActionListener(new j(this, (byte) 18));
                    i7++;
                }
            }
            y08 y08Var = this.s;
            if (y08Var != null) {
                y08Var.setVisibility(this.N != 0 ? 0 : 8);
            }
            if (this.a == null) {
                return;
            }
            String k = xnb.k(new StringBuilder("+"), this.a, f78.f());
            if (i3 == 2) {
                charSequence = hl.S2(ob6.a0("SentSmsCode", null, 2131745295, ob6.a(k)));
            } else if (i3 == 3) {
                charSequence = hl.S2(ob6.a0("SentCallCode", null, 2131745298, ob6.a(k)));
            } else if (i3 == 4) {
                charSequence = hl.S2(ob6.a0("SentCallOnly", null, 2131745297, ob6.a(k)));
            }
            this.e.setText(charSequence);
            EditTextBoldCursor[] editTextBoldCursorArr4 = this.d;
            if (i3 != 3) {
                hl.E3(editTextBoldCursorArr4[0]);
                this.d[0].requestFocus();
            } else {
                hl.t1(editTextBoldCursorArr4[0]);
            }
            r();
            q();
            this.G = System.currentTimeMillis();
            xb xbVar = this.r;
            xb xbVar2 = this.n;
            if (i3 == 3) {
                int i9 = this.N;
                i = 2;
                if (i9 == 4 || i9 == 2) {
                    xbVar.setVisibility(8);
                    xbVar2.setVisibility(0);
                    int i10 = this.N;
                    if (i10 == 4) {
                        xbVar2.setText(ob6.a0("CallText", null, 2131752582, 1, 0));
                    } else if (i10 == 2) {
                        xbVar2.setText(ob6.a0("SmsText", null, 2131745023, 1, 0));
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
                    xbVar2.setText(ob6.a0("CallText", null, 2131752582, objArr));
                    xbVar.setVisibility(this.E < 1000 ? 0 : 8);
                    xbVar2.setVisibility(this.E < 1000 ? 8 : 0);
                    p();
                    return;
                }
            } else {
                i2 = 0;
            }
            if (i3 != 4 || this.N != 2) {
                xbVar2.setVisibility(8);
                xbVar.setVisibility(8);
                o();
                return;
            }
            Object[] objArr2 = new Object[2];
            objArr2[i2] = 2;
            objArr2[1] = 0;
            xbVar2.setText(ob6.a0("SmsText", null, 2131745023, objArr2));
            xbVar.setVisibility(this.E < 1000 ? i2 : 8);
            xbVar2.setVisibility(this.E < 1000 ? 8 : i2);
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
        this.x.schedule(new vw3(this, (byte) 2), 0L, 1000L);
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
        xb xbVar = this.r;
        if (xbVar.getVisibility() == 0) {
            int measuredHeight2 = xbVar.getMeasuredHeight();
            i5 = (measuredHeight + bottom) - measuredHeight2;
            xbVar.layout(xbVar.getLeft(), i5, xbVar.getRight(), measuredHeight2 + i5);
        } else {
            xb xbVar2 = this.n;
            if (xbVar2.getVisibility() == 0) {
                int measuredHeight3 = xbVar2.getMeasuredHeight();
                i5 = (measuredHeight + bottom) - measuredHeight3;
                xbVar2.layout(xbVar2.getLeft(), i5, xbVar2.getRight(), measuredHeight3 + i5);
            } else {
                i5 = measuredHeight + bottom;
            }
        }
        LinearLayout linearLayout = this.c;
        int measuredHeight4 = linearLayout.getMeasuredHeight();
        int g = ik8.g(i5 - bottom, measuredHeight4, 2, bottom);
        linearLayout.layout(linearLayout.getLeft(), g, linearLayout.getRight(), measuredHeight4 + g);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        ImageView imageView;
        super.onMeasure(i, i2);
        if (this.M == 3 || (imageView = this.h) == null) {
            return;
        }
        int L = hl.L(35.0f) + this.e.getMeasuredHeight() + this.f.getMeasuredHeight() + imageView.getMeasuredHeight();
        int L2 = hl.L(80.0f);
        int L3 = hl.L(291.0f);
        b18 b18Var = this.R;
        if (b18Var.t0 - L < L2) {
            setMeasuredDimension(getMeasuredWidth(), L + L2);
        } else {
            setMeasuredDimension(getMeasuredWidth(), Math.min(b18Var.t0, L3));
        }
    }

    public final void p() {
        if (this.w != null) {
            return;
        }
        Timer timer = new Timer();
        this.w = timer;
        timer.schedule(new w08(this), 0L, 1000L);
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
            cc4.g(e, true);
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
            cc4.g(e, true);
        }
    }

    public final void s() {
        int i;
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.a);
        this.K = true;
        b18 b18Var = this.R;
        b18Var.B1();
        TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
        tL_auth_resendCode.phone_number = this.a;
        tL_auth_resendCode.phone_code_hash = this.b;
        i = ((e) b18Var).currentAccount;
        ConnectionsManager.getInstance(i).sendRequest(tL_auth_resendCode, new m65(this, bundle, tL_auth_resendCode, (byte) 24), 2);
    }

    @Override // cna
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
                    editTextBoldCursor.setCursorColor(aob.w0(null, aob.G6, false));
                }
                i++;
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }
}
