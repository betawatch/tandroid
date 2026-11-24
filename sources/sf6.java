// default package

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class sf6 extends kla {
    public final /* synthetic */ mh6 E;
    public final xe6 a;
    public final TextView b;
    public final TextView c;
    public final xna d;
    public final s09 e;
    public Bundle f;
    public String h;
    public boolean n;
    public String r;
    public String s;
    public String w;
    public boolean x;
    public final qf6 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00df A[LOOP:0: B:9:0x00dd->B:10:0x00df, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public sf6(mh6 mh6Var, Context context) {
        super(context);
        int i;
        this.E = mh6Var;
        this.y = new qf6(this, (byte) 1);
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        s09 s09Var = new s09(context);
        this.e = s09Var;
        s09Var.f(R.raw.tsv_setup_mail, nm7.E1, nm7.E1, null);
        s09Var.setAutoRepeat(false);
        frameLayout.addView(s09Var, qoe.e(nm7.E1, nm7.E1, 1));
        if (!gm.M1()) {
            Point point = gm.q;
            if (point.x <= point.y || gm.O1()) {
                i = 0;
                frameLayout.setVisibility(i);
                addView(frameLayout, qoe.e(-1, -2, 1));
                TextView textView = new TextView(context);
                this.b = textView;
                textView.setTextSize(1, 18.0f);
                textView.setTypeface(gm.o());
                textView.setText(jb6.M0(2131751060, null));
                textView.setGravity(17);
                textView.setLineSpacing(gm.L(2.0f), 1.0f);
                addView(textView, qoe.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
                TextView textView2 = new TextView(context);
                this.c = textView2;
                textView2.setTextSize(1, 14.0f);
                textView2.setGravity(17);
                textView2.setLineSpacing(gm.L(2.0f), 1.0f);
                textView2.setText(jb6.M0(2131745812, null));
                addView(textView2, qoe.t(-2, -2, 1, 12, 8, 12, 0));
                xe6 xe6Var = new xe6((byte) 1, context, this);
                this.a = xe6Var;
                xe6Var.b(6, 1);
                for (gl2 gl2Var : xe6Var.f) {
                    gl2Var.setShowSoftInputOnFocusCompat(gm.A1());
                    gl2Var.addTextChangedListener(new b7(this, (byte) 29));
                    gl2Var.setOnFocusChangeListener(new tt0(this, (byte) 10));
                }
                addView(this.a, qoe.t(-2, 42, 1, 0, 32, 0, 0));
                xna xnaVar = new xna(null, context, false);
                this.d = xnaVar;
                xnaVar.setGravity(17);
                xnaVar.setTextSize(1, 14.0f);
                xnaVar.setLineSpacing(gm.L(2.0f), 1.0f);
                xnaVar.setPadding(gm.L(16.0f), gm.L(16.0f), gm.L(16.0f), gm.L(16.0f));
                xnaVar.setMaxLines(2);
                xnaVar.setOnClickListener(new ca5(this, (byte) 23));
                FrameLayout frameLayout2 = new FrameLayout(context);
                frameLayout2.addView(xnaVar, qoe.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 32.0f));
                addView(frameLayout2, qoe.l(1.0f, -1, 0));
                wm9.c(xnaVar);
            }
        }
        i = 8;
        frameLayout.setVisibility(i);
        addView(frameLayout, qoe.e(-1, -2, 1));
        TextView textView3 = new TextView(context);
        this.b = textView3;
        textView3.setTextSize(1, 18.0f);
        textView3.setTypeface(gm.o());
        textView3.setText(jb6.M0(2131751060, null));
        textView3.setGravity(17);
        textView3.setLineSpacing(gm.L(2.0f), 1.0f);
        addView(textView3, qoe.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
        TextView textView22 = new TextView(context);
        this.c = textView22;
        textView22.setTextSize(1, 14.0f);
        textView22.setGravity(17);
        textView22.setLineSpacing(gm.L(2.0f), 1.0f);
        textView22.setText(jb6.M0(2131745812, null));
        addView(textView22, qoe.t(-2, -2, 1, 12, 8, 12, 0));
        xe6 xe6Var2 = new xe6((byte) 1, context, this);
        this.a = xe6Var2;
        xe6Var2.b(6, 1);
        while (r12 < r11) {
        }
        addView(this.a, qoe.t(-2, 42, 1, 0, 32, 0, 0));
        xna xnaVar2 = new xna(null, context, false);
        this.d = xnaVar2;
        xnaVar2.setGravity(17);
        xnaVar2.setTextSize(1, 14.0f);
        xnaVar2.setLineSpacing(gm.L(2.0f), 1.0f);
        xnaVar2.setPadding(gm.L(16.0f), gm.L(16.0f), gm.L(16.0f), gm.L(16.0f));
        xnaVar2.setMaxLines(2);
        xnaVar2.setOnClickListener(new ca5(this, (byte) 23));
        FrameLayout frameLayout22 = new FrameLayout(context);
        frameLayout22.addView(xnaVar2, qoe.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 32.0f));
        addView(frameLayout22, qoe.l(1.0f, -1, 0));
        wm9.c(xnaVar2);
    }

    @Override // kla
    public final boolean a() {
        return true;
    }

    @Override // kla
    public final boolean b() {
        return true;
    }

    @Override // kla
    public final boolean d(boolean z) {
        this.E.y1(true, true);
        this.f = null;
        this.n = false;
        return true;
    }

    @Override // kla
    public final void e() {
        this.n = false;
    }

    @Override // kla
    public String getHeaderName() {
        return jb6.M0(2131748483, "LoginPassword");
    }

    @Override // kla
    public final void h(String str) {
        int i;
        if (this.n) {
            return;
        }
        xe6 xe6Var = this.a;
        xe6Var.e = true;
        for (gl2 gl2Var : xe6Var.f) {
            gl2Var.B(0.0f);
        }
        String code = xe6Var.getCode();
        if (code.length() == 0) {
            n(false);
            return;
        }
        this.n = true;
        mh6 mh6Var = this.E;
        mh6Var.B1(0, true);
        TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
        tL_auth_checkRecoveryPassword.code = code;
        i = ((d) mh6Var).currentAccount;
        ConnectionsManager.getInstance(i).sendRequest(tL_auth_checkRecoveryPassword, new cx3(this, code, (byte) 20), 10);
    }

    @Override // kla
    public final void j() {
        gm.d3(new qf6(this, (byte) 0), mh6.A0);
    }

    @Override // kla
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_params");
        this.f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("recoveryview_code");
        if (string != null) {
            this.a.setText(string);
        }
    }

    @Override // kla
    public final void l(Bundle bundle) {
        String code = this.a.getCode();
        if (code != null && code.length() != 0) {
            bundle.putString("recoveryview_code", code);
        }
        Bundle bundle2 = this.f;
        if (bundle2 != null) {
            bundle.putBundle("recoveryview_params", bundle2);
        }
    }

    @Override // kla
    public final void m(Bundle bundle, boolean z) {
        if (bundle == null) {
            return;
        }
        xe6 xe6Var = this.a;
        xe6Var.setText("");
        this.f = bundle;
        this.h = bundle.getString("password");
        this.r = this.f.getString("requestPhone");
        this.s = this.f.getString("phoneHash");
        this.w = this.f.getString("phoneCode");
        String string = this.f.getString("email_unconfirmed_pattern");
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
        int indexOf = string.indexOf(42);
        int lastIndexOf = string.lastIndexOf(42);
        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
            wkb wkbVar = new wkb();
            wkbVar.a |= 256;
            wkbVar.b = indexOf;
            int i = lastIndexOf + 1;
            wkbVar.c = i;
            valueOf.setSpan(new xkb(wkbVar, 0), indexOf, i, 0);
        }
        this.d.setText(gm.m0(jb6.M0(2131745814, null), valueOf));
        this.E.M1(xe6Var);
        xe6Var.requestFocus();
    }

    public final void n(boolean z) {
        xe6 xe6Var = this.a;
        if (this.E.getParentActivity() == null) {
            return;
        }
        try {
            xe6Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (z) {
            for (gl2 gl2Var : xe6Var.f) {
                gl2Var.setText("");
            }
        }
        for (gl2 gl2Var2 : xe6Var.f) {
            gl2Var2.A(1.0f);
        }
        xe6Var.f[0].requestFocus();
        gm.A3(10.0f, xe6Var, new qf6(this, (byte) 2));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.y);
    }

    @Override // kla
    public final void updateColors() {
        this.b.setTextColor(cmb.w0(null, cmb.F6, false));
        this.c.setTextColor(cmb.w0(null, cmb.C6, false));
        this.d.setTextColor(cmb.w0(null, cmb.p6, false));
        this.a.invalidate();
    }
}
