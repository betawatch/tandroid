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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class td6 extends jja {
    public final /* synthetic */ mf6 E;
    public final yc6 a;
    public final TextView b;
    public final TextView c;
    public final wla d;
    public final ry8 e;
    public Bundle f;
    public String h;
    public boolean n;
    public String r;
    public String s;
    public String w;
    public boolean x;
    public final rd6 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00df A[LOOP:0: B:9:0x00dd->B:10:0x00df, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public td6(mf6 mf6Var, Context context) {
        super(context);
        int i;
        this.E = mf6Var;
        this.y = new rd6(this, (byte) 1);
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        ry8 ry8Var = new ry8(context);
        this.e = ry8Var;
        ry8Var.f(R.raw.tsv_setup_mail, 120, 120, null);
        ry8Var.setAutoRepeat(false);
        frameLayout.addView(ry8Var, nme.e(120, 120, 1));
        if (!gl.M1()) {
            Point point = gl.q;
            if (point.x <= point.y || gl.O1()) {
                i = 0;
                frameLayout.setVisibility(i);
                addView(frameLayout, nme.e(-1, -2, 1));
                TextView textView = new TextView(context);
                this.b = textView;
                textView.setTextSize(1, 18.0f);
                textView.setTypeface(gl.o());
                textView.setText(k96.M0(2131751111, null));
                textView.setGravity(17);
                textView.setLineSpacing(gl.L(2.0f), 1.0f);
                addView(textView, nme.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
                TextView textView2 = new TextView(context);
                this.c = textView2;
                textView2.setTextSize(1, 14.0f);
                textView2.setGravity(17);
                textView2.setLineSpacing(gl.L(2.0f), 1.0f);
                textView2.setText(k96.M0(2131745886, null));
                addView(textView2, nme.t(-2, -2, 1, 12, 8, 12, 0));
                yc6 yc6Var = new yc6((byte) 1, context, this);
                this.a = yc6Var;
                yc6Var.b(6, 1);
                for (sj2 sj2Var : yc6Var.f) {
                    sj2Var.setShowSoftInputOnFocusCompat(gl.A1());
                    sj2Var.addTextChangedListener(new b7(this, (byte) 28));
                    sj2Var.setOnFocusChangeListener(new ls0(this, (byte) 10));
                }
                addView(this.a, nme.t(-2, 42, 1, 0, 32, 0, 0));
                wla wlaVar = new wla(null, context, false);
                this.d = wlaVar;
                wlaVar.setGravity(17);
                wlaVar.setTextSize(1, 14.0f);
                wlaVar.setLineSpacing(gl.L(2.0f), 1.0f);
                wlaVar.setPadding(gl.L(16.0f), gl.L(16.0f), gl.L(16.0f), gl.L(16.0f));
                wlaVar.setMaxLines(2);
                wlaVar.setOnClickListener(new b95(this, (byte) 20));
                FrameLayout frameLayout2 = new FrameLayout(context);
                frameLayout2.addView(wlaVar, nme.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 32.0f));
                addView(frameLayout2, nme.l(1.0f, -1, 0));
                vk9.c(wlaVar);
            }
        }
        i = 8;
        frameLayout.setVisibility(i);
        addView(frameLayout, nme.e(-1, -2, 1));
        TextView textView3 = new TextView(context);
        this.b = textView3;
        textView3.setTextSize(1, 18.0f);
        textView3.setTypeface(gl.o());
        textView3.setText(k96.M0(2131751111, null));
        textView3.setGravity(17);
        textView3.setLineSpacing(gl.L(2.0f), 1.0f);
        addView(textView3, nme.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
        TextView textView22 = new TextView(context);
        this.c = textView22;
        textView22.setTextSize(1, 14.0f);
        textView22.setGravity(17);
        textView22.setLineSpacing(gl.L(2.0f), 1.0f);
        textView22.setText(k96.M0(2131745886, null));
        addView(textView22, nme.t(-2, -2, 1, 12, 8, 12, 0));
        yc6 yc6Var2 = new yc6((byte) 1, context, this);
        this.a = yc6Var2;
        yc6Var2.b(6, 1);
        while (r12 < r11) {
        }
        addView(this.a, nme.t(-2, 42, 1, 0, 32, 0, 0));
        wla wlaVar2 = new wla(null, context, false);
        this.d = wlaVar2;
        wlaVar2.setGravity(17);
        wlaVar2.setTextSize(1, 14.0f);
        wlaVar2.setLineSpacing(gl.L(2.0f), 1.0f);
        wlaVar2.setPadding(gl.L(16.0f), gl.L(16.0f), gl.L(16.0f), gl.L(16.0f));
        wlaVar2.setMaxLines(2);
        wlaVar2.setOnClickListener(new b95(this, (byte) 20));
        FrameLayout frameLayout22 = new FrameLayout(context);
        frameLayout22.addView(wlaVar2, nme.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 32.0f));
        addView(frameLayout22, nme.l(1.0f, -1, 0));
        vk9.c(wlaVar2);
    }

    @Override // jja
    public final boolean a() {
        return true;
    }

    @Override // jja
    public final boolean b() {
        return true;
    }

    @Override // jja
    public final boolean d(boolean z) {
        this.E.x1(true, true);
        this.f = null;
        this.n = false;
        return true;
    }

    @Override // jja
    public final void e() {
        this.n = false;
    }

    @Override // jja
    public String getHeaderName() {
        return k96.M0(2131748534, "LoginPassword");
    }

    @Override // jja
    public final void h(String str) {
        int i;
        if (this.n) {
            return;
        }
        yc6 yc6Var = this.a;
        yc6Var.e = true;
        for (sj2 sj2Var : yc6Var.f) {
            sj2Var.B(0.0f);
        }
        String code = yc6Var.getCode();
        if (code.length() == 0) {
            n(false);
            return;
        }
        this.n = true;
        mf6 mf6Var = this.E;
        mf6Var.A1(0, true);
        TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
        tL_auth_checkRecoveryPassword.code = code;
        i = ((d) mf6Var).currentAccount;
        ConnectionsManager.getInstance(i).sendRequest(tL_auth_checkRecoveryPassword, new rv3(this, code, (byte) 20), 10);
    }

    @Override // jja
    public final void j() {
        gl.e3(new rd6(this, (byte) 0), mf6.A0);
    }

    @Override // jja
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

    @Override // jja
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

    @Override // jja
    public final void m(Bundle bundle, boolean z) {
        if (bundle == null) {
            return;
        }
        yc6 yc6Var = this.a;
        yc6Var.setText("");
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
            vib vibVar = new vib();
            vibVar.a |= 256;
            vibVar.b = indexOf;
            int i = lastIndexOf + 1;
            vibVar.c = i;
            valueOf.setSpan(new wib(vibVar, 0), indexOf, i, 0);
        }
        this.d.setText(gl.m0(k96.M0(2131745888, null), valueOf));
        this.E.L1(yc6Var);
        yc6Var.requestFocus();
    }

    public final void n(boolean z) {
        yc6 yc6Var = this.a;
        if (this.E.getParentActivity() == null) {
            return;
        }
        try {
            yc6Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (z) {
            for (sj2 sj2Var : yc6Var.f) {
                sj2Var.setText("");
            }
        }
        for (sj2 sj2Var2 : yc6Var.f) {
            sj2Var2.A(1.0f);
        }
        yc6Var.f[0].requestFocus();
        gl.B3(10.0f, yc6Var, new rd6(this, (byte) 2));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.y);
    }

    @Override // jja
    public final void updateColors() {
        this.b.setTextColor(bkb.w0(null, bkb.F6, false));
        this.c.setTextColor(bkb.w0(null, bkb.C6, false));
        this.d.setTextColor(bkb.w0(null, bkb.p6, false));
        this.a.invalidate();
    }
}
