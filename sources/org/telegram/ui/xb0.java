package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class xb0 extends org.telegram.ui.Components.wt0 {
    public final /* synthetic */ ce0 D;
    public final EditTextBoldCursor a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final org.telegram.ui.Components.ch0 e;
    public Bundle f;
    public boolean h;
    public TL_account.Password n;
    public String r;
    public String s;
    public String w;
    public String x;
    public final org.telegram.ui.Components.lb0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:10:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xb0(ce0 ce0Var, Context context) {
        super(context);
        int i7;
        this.D = ce0Var;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.ch0 ch0Var = new org.telegram.ui.Components.ch0(context);
        this.e = ch0Var;
        ch0Var.f(R.raw.tsv_setup_intro, 120, 120, null);
        ch0Var.setAutoRepeat(false);
        frameLayout.addView(ch0Var, c8.ha.e(120, 120, 1));
        if (!org.telegram.messenger.g0.O1()) {
            Point point = org.telegram.messenger.g0.q;
            if (point.x <= point.y || org.telegram.messenger.g0.Q1()) {
                i7 = 0;
                frameLayout.setVisibility(i7);
                addView(frameLayout, c8.ha.e(-1, -2, 1));
                TextView textView = new TextView(context);
                this.d = textView;
                textView.setTextSize(1, 18.0f);
                textView.setTypeface(org.telegram.messenger.g0.o());
                textView.setText(org.telegram.messenger.hd.M0(2131742804, null));
                textView.setGravity(17);
                textView.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                addView(textView, c8.ha.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
                TextView textView2 = new TextView(context);
                this.b = textView2;
                textView2.setTextSize(1, 14.0f);
                textView2.setGravity(1);
                textView2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                textView2.setText(org.telegram.messenger.hd.M0(2131748723, null));
                addView(textView2, c8.ha.t(-2, -2, 1, 12, 8, 12, 0));
                org.telegram.ui.Components.lb0 lb0Var = new org.telegram.ui.Components.lb0(context, null);
                this.y = lb0Var;
                lb0Var.setText(org.telegram.messenger.hd.M0(2131751117, null));
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                this.a = editTextBoldCursor;
                editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setBackground(null);
                editTextBoldCursor.setImeOptions(268435461);
                editTextBoldCursor.setTextSize(1, 18.0f);
                editTextBoldCursor.setMaxLines(1);
                int L = org.telegram.messenger.g0.L(16.0f);
                editTextBoldCursor.setPadding(L, L, L, L);
                editTextBoldCursor.setInputType(org.telegram.messenger.qs.N1);
                editTextBoldCursor.setTransformationMethod(PasswordTransformationMethod.getInstance());
                editTextBoldCursor.setTypeface(Typeface.DEFAULT);
                int i10 = 5;
                editTextBoldCursor.setGravity(!org.telegram.messenger.hd.a0 ? 5 : 3);
                editTextBoldCursor.setOnFocusChangeListener(new fd(this, 4));
                lb0Var.e(editTextBoldCursor);
                lb0Var.addView(editTextBoldCursor, c8.ha.e(-1, -2, 48));
                editTextBoldCursor.setOnEditorActionListener(new fa(this, i10));
                addView(lb0Var, c8.ha.t(-1, -2, 1, 16, 32, 16, 0));
                TextView textView3 = new TextView(context);
                this.c = textView3;
                org.telegram.messenger.k5.m(textView3, 19, null, 2131750592);
                textView3.setTextSize(1, 15.0f);
                textView3.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                textView3.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
                FrameLayout frameLayout2 = new FrameLayout(context);
                frameLayout2.addView(textView3, c8.ha.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 32.0f));
                addView(frameLayout2, c8.ha.r(-1, -1, 80));
                h6.m.g(textView3);
                textView3.setOnClickListener(new org.telegram.ui.Components.n41(25, this, context));
            }
        }
        i7 = 8;
        frameLayout.setVisibility(i7);
        addView(frameLayout, c8.ha.e(-1, -2, 1));
        TextView textView4 = new TextView(context);
        this.d = textView4;
        textView4.setTextSize(1, 18.0f);
        textView4.setTypeface(org.telegram.messenger.g0.o());
        textView4.setText(org.telegram.messenger.hd.M0(2131742804, null));
        textView4.setGravity(17);
        textView4.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        addView(textView4, c8.ha.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
        TextView textView22 = new TextView(context);
        this.b = textView22;
        textView22.setTextSize(1, 14.0f);
        textView22.setGravity(1);
        textView22.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        textView22.setText(org.telegram.messenger.hd.M0(2131748723, null));
        addView(textView22, c8.ha.t(-2, -2, 1, 12, 8, 12, 0));
        org.telegram.ui.Components.lb0 lb0Var2 = new org.telegram.ui.Components.lb0(context, null);
        this.y = lb0Var2;
        lb0Var2.setText(org.telegram.messenger.hd.M0(2131751117, null));
        EditTextBoldCursor editTextBoldCursor2 = new EditTextBoldCursor(context);
        this.a = editTextBoldCursor2;
        editTextBoldCursor2.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        editTextBoldCursor2.setCursorWidth(1.5f);
        editTextBoldCursor2.setBackground(null);
        editTextBoldCursor2.setImeOptions(268435461);
        editTextBoldCursor2.setTextSize(1, 18.0f);
        editTextBoldCursor2.setMaxLines(1);
        int L2 = org.telegram.messenger.g0.L(16.0f);
        editTextBoldCursor2.setPadding(L2, L2, L2, L2);
        editTextBoldCursor2.setInputType(org.telegram.messenger.qs.N1);
        editTextBoldCursor2.setTransformationMethod(PasswordTransformationMethod.getInstance());
        editTextBoldCursor2.setTypeface(Typeface.DEFAULT);
        int i102 = 5;
        editTextBoldCursor2.setGravity(!org.telegram.messenger.hd.a0 ? 5 : 3);
        editTextBoldCursor2.setOnFocusChangeListener(new fd(this, 4));
        lb0Var2.e(editTextBoldCursor2);
        lb0Var2.addView(editTextBoldCursor2, c8.ha.e(-1, -2, 48));
        editTextBoldCursor2.setOnEditorActionListener(new fa(this, i102));
        addView(lb0Var2, c8.ha.t(-1, -2, 1, 16, 32, 16, 0));
        TextView textView32 = new TextView(context);
        this.c = textView32;
        org.telegram.messenger.k5.m(textView32, 19, null, 2131750592);
        textView32.setTextSize(1, 15.0f);
        textView32.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        textView32.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        FrameLayout frameLayout22 = new FrameLayout(context);
        frameLayout22.addView(textView32, c8.ha.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 32.0f));
        addView(frameLayout22, c8.ha.r(-1, -1, 80));
        h6.m.g(textView32);
        textView32.setOnClickListener(new org.telegram.ui.Components.n41(25, this, context));
    }

    @Override // org.telegram.ui.Components.wt0
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Components.wt0
    public final boolean c(boolean z9) {
        this.h = false;
        this.D.C1(true, true);
        this.f = null;
        return true;
    }

    @Override // org.telegram.ui.Components.wt0
    public final void d() {
        this.h = false;
    }

    @Override // org.telegram.ui.Components.wt0
    public String getHeaderName() {
        return org.telegram.messenger.hd.M0(2131748725, "LoginPassword");
    }

    @Override // org.telegram.ui.Components.wt0
    public final void h(String str) {
        if (this.h || this.n == null) {
            return;
        }
        String obj = this.a.getText().toString();
        if (obj.length() != 0) {
            this.h = true;
            this.D.F1(0, true);
            Utilities.e.c(new q10(26, this, obj));
        } else {
            ce0 ce0Var = this.D;
            if (ce0Var.getParentActivity() == null) {
                return;
            }
            ce0.c1(ce0Var, this.y, true);
        }
    }

    @Override // org.telegram.ui.Components.wt0
    public final void j() {
        org.telegram.messenger.g0.i3(new hz(this, 22), ce0.y0);
    }

    @Override // org.telegram.ui.Components.wt0
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("passview_params");
        this.f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("passview_code");
        if (string != null) {
            this.a.setText(string);
        }
    }

    @Override // org.telegram.ui.Components.wt0
    public final void l(Bundle bundle) {
        String obj = this.a.getText().toString();
        if (obj.length() != 0) {
            bundle.putString("passview_code", obj);
        }
        Bundle bundle2 = this.f;
        if (bundle2 != null) {
            bundle.putBundle("passview_params", bundle2);
        }
    }

    @Override // org.telegram.ui.Components.wt0
    public final void m(Bundle bundle, boolean z9) {
        if (bundle == null) {
            return;
        }
        boolean isEmpty = bundle.isEmpty();
        EditTextBoldCursor editTextBoldCursor = this.a;
        if (isEmpty) {
            org.telegram.messenger.g0.v1(editTextBoldCursor);
            return;
        }
        editTextBoldCursor.setText("");
        this.f = bundle;
        String string = bundle.getString("password");
        this.r = string;
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.v(string));
            this.n = TL_account.Password.TLdeserialize(serializedData, serializedData.readInt32(false), false);
        }
        this.s = bundle.getString("phoneFormated");
        this.w = bundle.getString("phoneHash");
        this.x = bundle.getString("code");
        TL_account.Password password = this.n;
        if (password == null || TextUtils.isEmpty(password.hint)) {
            editTextBoldCursor.setHint((CharSequence) null);
        } else {
            editTextBoldCursor.setHint(this.n.hint);
        }
    }

    @Override // org.telegram.ui.Components.wt0
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.k6.G6;
        this.d.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i7, false));
        this.b.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.D6, false));
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i7, false);
        EditTextBoldCursor editTextBoldCursor = this.a;
        editTextBoldCursor.setTextColor(x02);
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.k6.x0(null, i7, false));
        editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.H6, false));
        this.c.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.q6, false));
        this.y.f();
    }
}
