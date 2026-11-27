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
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class vf6 extends cna {
    public final /* synthetic */ qh6 E;
    public final bf6 a;
    public final TextView b;
    public final TextView c;
    public final tpa d;
    public final e29 e;
    public Bundle f;
    public String h;
    public boolean n;
    public String r;
    public String s;
    public String w;
    public boolean x;
    public final tf6 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00df A[LOOP:0: B:9:0x00dd->B:10:0x00df, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public vf6(qh6 qh6Var, Context context) {
        super(context);
        int i;
        this.E = qh6Var;
        this.y = new tf6(this, (byte) 1);
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        e29 e29Var = new e29(context);
        this.e = e29Var;
        e29Var.f(R.raw.tsv_setup_mail, jn7.E1, jn7.E1, null);
        e29Var.setAutoRepeat(false);
        frameLayout.addView(e29Var, tre.e(jn7.E1, jn7.E1, 1));
        if (!hl.M1()) {
            Point point = hl.q;
            if (point.x <= point.y || hl.O1()) {
                i = 0;
                frameLayout.setVisibility(i);
                addView(frameLayout, tre.e(-1, -2, 1));
                TextView textView = new TextView(context);
                this.b = textView;
                textView.setTextSize(1, 18.0f);
                textView.setTypeface(hl.o());
                textView.setText(ob6.M0(2131751088, null));
                textView.setGravity(17);
                textView.setLineSpacing(hl.L(2.0f), 1.0f);
                addView(textView, tre.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
                TextView textView2 = new TextView(context);
                this.c = textView2;
                textView2.setTextSize(1, 14.0f);
                textView2.setGravity(17);
                textView2.setLineSpacing(hl.L(2.0f), 1.0f);
                textView2.setText(ob6.M0(2131745806, null));
                addView(textView2, tre.t(-2, -2, 1, 12, 8, 12, 0));
                bf6 bf6Var = new bf6((byte) 1, context, this);
                this.a = bf6Var;
                bf6Var.b(6, 1);
                for (ok2 ok2Var : bf6Var.f) {
                    ok2Var.setShowSoftInputOnFocusCompat(hl.A1());
                    ok2Var.addTextChangedListener(new c7(this, (byte) 28));
                    ok2Var.setOnFocusChangeListener(new ts0(this, (byte) 10));
                }
                addView(this.a, tre.t(-2, 42, 1, 0, 32, 0, 0));
                tpa tpaVar = new tpa(null, context, false);
                this.d = tpaVar;
                tpaVar.setGravity(17);
                tpaVar.setTextSize(1, 14.0f);
                tpaVar.setLineSpacing(hl.L(2.0f), 1.0f);
                tpaVar.setPadding(hl.L(16.0f), hl.L(16.0f), hl.L(16.0f), hl.L(16.0f));
                tpaVar.setMaxLines(2);
                tpaVar.setOnClickListener(new sa5(this, (byte) 21));
                FrameLayout frameLayout2 = new FrameLayout(context);
                frameLayout2.addView(tpaVar, tre.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 32.0f));
                addView(frameLayout2, tre.l(1.0f, -1, 0));
                ko9.e(tpaVar);
            }
        }
        i = 8;
        frameLayout.setVisibility(i);
        addView(frameLayout, tre.e(-1, -2, 1));
        TextView textView3 = new TextView(context);
        this.b = textView3;
        textView3.setTextSize(1, 18.0f);
        textView3.setTypeface(hl.o());
        textView3.setText(ob6.M0(2131751088, null));
        textView3.setGravity(17);
        textView3.setLineSpacing(hl.L(2.0f), 1.0f);
        addView(textView3, tre.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
        TextView textView22 = new TextView(context);
        this.c = textView22;
        textView22.setTextSize(1, 14.0f);
        textView22.setGravity(17);
        textView22.setLineSpacing(hl.L(2.0f), 1.0f);
        textView22.setText(ob6.M0(2131745806, null));
        addView(textView22, tre.t(-2, -2, 1, 12, 8, 12, 0));
        bf6 bf6Var2 = new bf6((byte) 1, context, this);
        this.a = bf6Var2;
        bf6Var2.b(6, 1);
        while (r12 < r11) {
        }
        addView(this.a, tre.t(-2, 42, 1, 0, 32, 0, 0));
        tpa tpaVar2 = new tpa(null, context, false);
        this.d = tpaVar2;
        tpaVar2.setGravity(17);
        tpaVar2.setTextSize(1, 14.0f);
        tpaVar2.setLineSpacing(hl.L(2.0f), 1.0f);
        tpaVar2.setPadding(hl.L(16.0f), hl.L(16.0f), hl.L(16.0f), hl.L(16.0f));
        tpaVar2.setMaxLines(2);
        tpaVar2.setOnClickListener(new sa5(this, (byte) 21));
        FrameLayout frameLayout22 = new FrameLayout(context);
        frameLayout22.addView(tpaVar2, tre.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 32.0f));
        addView(frameLayout22, tre.l(1.0f, -1, 0));
        ko9.e(tpaVar2);
    }

    @Override // cna
    public final boolean a() {
        return true;
    }

    @Override // cna
    public final boolean b() {
        return true;
    }

    @Override // cna
    public final boolean c(boolean z) {
        this.E.y1(true, true);
        this.f = null;
        this.n = false;
        return true;
    }

    @Override // cna
    public final void d() {
        this.n = false;
    }

    @Override // cna
    public String getHeaderName() {
        return ob6.M0(2131748480, "LoginPassword");
    }

    @Override // cna
    public final void h(String str) {
        int i;
        if (this.n) {
            return;
        }
        bf6 bf6Var = this.a;
        bf6Var.e = true;
        for (ok2 ok2Var : bf6Var.f) {
            ok2Var.B(0.0f);
        }
        String code = bf6Var.getCode();
        if (code.length() == 0) {
            n(false);
            return;
        }
        this.n = true;
        qh6 qh6Var = this.E;
        qh6Var.B1(0, true);
        TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
        tL_auth_checkRecoveryPassword.code = code;
        i = ((e) qh6Var).currentAccount;
        ConnectionsManager.getInstance(i).sendRequest(tL_auth_checkRecoveryPassword, new mw3(this, code, (byte) 20), 10);
    }

    @Override // cna
    public final void j() {
        hl.d3(new tf6(this, (byte) 0), qh6.A0);
    }

    @Override // cna
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

    @Override // cna
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

    @Override // cna
    public final void m(Bundle bundle, boolean z) {
        if (bundle == null) {
            return;
        }
        bf6 bf6Var = this.a;
        bf6Var.setText("");
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
            rmb rmbVar = new rmb();
            rmbVar.a |= 256;
            rmbVar.b = indexOf;
            int i = lastIndexOf + 1;
            rmbVar.c = i;
            valueOf.setSpan(new smb(rmbVar, 0), indexOf, i, 0);
        }
        this.d.setText(hl.m0(ob6.M0(2131745808, null), valueOf));
        this.E.M1(bf6Var);
        bf6Var.requestFocus();
    }

    public final void n(boolean z) {
        bf6 bf6Var = this.a;
        if (this.E.getParentActivity() == null) {
            return;
        }
        try {
            bf6Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (z) {
            for (ok2 ok2Var : bf6Var.f) {
                ok2Var.setText("");
            }
        }
        for (ok2 ok2Var2 : bf6Var.f) {
            ok2Var2.A(1.0f);
        }
        bf6Var.f[0].requestFocus();
        hl.A3(10.0f, bf6Var, new tf6(this, (byte) 2));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.y);
    }

    @Override // cna
    public final void updateColors() {
        this.b.setTextColor(aob.w0(null, aob.G6, false));
        this.c.setTextColor(aob.w0(null, aob.D6, false));
        this.d.setTextColor(aob.w0(null, aob.q6, false));
        this.a.invalidate();
    }
}
