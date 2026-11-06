package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class x71 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public String D;
    public by0 E;
    public boolean F;
    public SpannableStringBuilder G;
    public final boolean H;
    public final org.telegram.ui.ActionBar.j6 I;
    public final org.telegram.ui.ActionBar.h6 J;
    public final TLRPC.TL_theme K;
    public EditTextBoldCursor a;
    public EditTextBoldCursor b;
    public org.telegram.ui.ActionBar.r0 c;
    public org.telegram.ui.Cells.z8 d;
    public org.telegram.ui.Cells.z8 e;
    public org.telegram.ui.Cells.z9 f;
    public org.telegram.ui.Cells.w9 h;
    public org.telegram.ui.Cells.z8 n;
    public org.telegram.ui.ActionBar.u1 r;
    public org.telegram.ui.Cells.n4 s;
    public EditTextBoldCursor w;
    public LinearLayout x;
    public int y;

    public x71(org.telegram.ui.ActionBar.j6 j6Var, org.telegram.ui.ActionBar.h6 h6Var, boolean z9) {
        super(null);
        this.I = j6Var;
        this.J = h6Var;
        this.K = h6Var != null ? h6Var.r : j6Var.F;
        this.currentAccount = h6Var != null ? h6Var.t : j6Var.E;
        this.H = z9;
    }

    public static void a0(x71 x71Var, TLRPC.TL_theme tL_theme) {
        try {
            x71Var.r.dismiss();
            x71Var.r = null;
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        org.telegram.ui.ActionBar.k6.I1(x71Var.I, x71Var.J, tL_theme, x71Var.currentAccount, false);
        x71Var.finishFragment();
    }

    public static void b0(x71 x71Var, TLRPC.TL_error tL_error, TL_account.updateTheme updatetheme) {
        try {
            x71Var.r.dismiss();
            x71Var.r = null;
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        org.telegram.ui.Components.v4.c0(x71Var.currentAccount, tL_error, x71Var, updatetheme, new Object[0]);
    }

    public static /* synthetic */ void c0(x71 x71Var, String str) {
        TL_account.createTheme createtheme = new TL_account.createTheme();
        createtheme.slug = str;
        createtheme.title = "";
        createtheme.document = new TLRPC.TL_inputDocumentEmpty();
        x71Var.y = ConnectionsManager.getInstance(x71Var.currentAccount).sendRequest(createtheme, new n41(1, x71Var, str), 2);
    }

    public static void d0(x71 x71Var) {
        org.telegram.ui.ActionBar.j6 j6Var = x71Var.I;
        TLRPC.TL_theme tL_theme = x71Var.K;
        if (x71Var.e0(x71Var.a.getText().toString(), true) && x71Var.getParentActivity() != null) {
            if (x71Var.b.length() == 0) {
                org.telegram.ui.Components.v4.r0(x71Var, org.telegram.messenger.hd.M0(2131744191, null), org.telegram.messenger.hd.M0(2131744178, null), null);
                return;
            }
            if (x71Var.H) {
                String str = tL_theme.title;
                org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, x71Var.getParentActivity(), null);
                x71Var.r = u1Var;
                u1Var.setOnCancelListener(new w71());
                x71Var.r.show();
                String obj = x71Var.b.getText().toString();
                tL_theme.title = obj;
                j6Var.a = obj;
                j6Var.F.slug = x71Var.a.getText().toString();
                org.telegram.ui.ActionBar.k6.x1(j6Var, true, true, true);
                return;
            }
            String str2 = tL_theme.slug;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = tL_theme.title;
            String str4 = str3 != null ? str3 : "";
            String obj2 = x71Var.a.getText().toString();
            String obj3 = x71Var.b.getText().toString();
            if (str2.equals(obj2) && str4.equals(obj3)) {
                x71Var.finishFragment();
                return;
            }
            x71Var.r = new org.telegram.ui.ActionBar.u1(3, x71Var.getParentActivity(), null);
            TL_account.updateTheme updatetheme = new TL_account.updateTheme();
            TLRPC.TL_inputTheme tL_inputTheme = new TLRPC.TL_inputTheme();
            tL_inputTheme.id = tL_theme.id;
            tL_inputTheme.access_hash = tL_theme.access_hash;
            updatetheme.theme = tL_inputTheme;
            updatetheme.format = "android";
            updatetheme.slug = obj2;
            int i7 = updatetheme.flags;
            updatetheme.title = obj3;
            updatetheme.flags = i7 | 3;
            int sendRequest = ConnectionsManager.getInstance(x71Var.currentAccount).sendRequest(updatetheme, new n41(2, x71Var, updatetheme), 2);
            ConnectionsManager.getInstance(x71Var.currentAccount).bindRequestToGuid(sendRequest, x71Var.classGuid);
            x71Var.r.setOnCancelListener(new bi.g0(x71Var, sendRequest, 8));
            x71Var.r.show();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.gd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ab));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.zb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.yb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.xb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.qb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.pb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.tb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.sb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.ob));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.ta));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Rc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.ra));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.w6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.F6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.s8));
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        final int i7 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        boolean z9 = this.H;
        if (z9) {
            this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131748251, null));
        } else {
            this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131751219, null));
        }
        this.actionBar.setActionBarMenuOnItemClick(new nt0(this, 14));
        this.c = this.actionBar.q().e(1, org.telegram.messenger.hd.M0(2131751355, null).toUpperCase());
        LinearLayout linearLayout = new LinearLayout(context);
        this.fragmentView = linearLayout;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.a7, linearLayout, null);
        LinearLayout linearLayout2 = (LinearLayout) this.fragmentView;
        linearLayout2.setOrientation(1);
        this.fragmentView.setOnTouchListener(new ei.b(2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.x = linearLayout3;
        linearLayout3.setOrientation(1);
        LinearLayout linearLayout4 = this.x;
        int i10 = org.telegram.ui.ActionBar.k6.d6;
        org.telegram.ui.ActionBar.r6.i(i10, linearLayout4, null);
        linearLayout2.addView(this.x, c8.ha.o(-1, -2));
        org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context, 23);
        this.s = n4Var;
        n4Var.setText(org.telegram.messenger.hd.M0(2131749196, null));
        this.x.addView(this.s);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.b = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.b;
        int i11 = org.telegram.ui.ActionBar.k6.H6;
        org.telegram.ui.ActionBar.r6.E(editTextBoldCursor2, i11, null);
        EditTextBoldCursor editTextBoldCursor3 = this.b;
        int i12 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(editTextBoldCursor3, i12, null);
        this.b.setMaxLines(1);
        this.b.setLines(1);
        this.b.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 16);
        this.b.setBackgroundDrawable(null);
        final int i13 = 0;
        this.b.setPadding(0, 0, 0, 0);
        this.b.setSingleLine(true);
        this.b.setFilters(new InputFilter[]{new InputFilter.LengthFilter(128)});
        this.b.setInputType(163872);
        this.b.setImeOptions(6);
        this.b.setHint(org.telegram.messenger.hd.M0(2131744177, null));
        org.telegram.ui.ActionBar.r6.w(this.b, i12, null);
        this.b.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        this.b.setCursorWidth(1.5f);
        this.x.addView(this.b, c8.ha.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        this.b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.v71
            public final /* synthetic */ x71 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i14, KeyEvent keyEvent) {
                org.telegram.ui.ActionBar.r0 r0Var;
                switch (i13) {
                    case 0:
                        x71 x71Var = this.b;
                        if (i14 == 6) {
                            org.telegram.messenger.g0.v1(x71Var.b);
                            return true;
                        }
                        x71Var.getClass();
                        return false;
                    default:
                        if (i14 != 6 || (r0Var = this.b.c) == null) {
                            return false;
                        }
                        r0Var.performClick();
                        return true;
                }
            }
        });
        this.x.addView(new org.telegram.ui.Components.tm(context, 26), new LinearLayout.LayoutParams(-1, 1));
        LinearLayout linearLayout5 = new LinearLayout(context);
        linearLayout5.setOrientation(0);
        this.x.addView(linearLayout5, c8.ha.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        EditTextBoldCursor editTextBoldCursor4 = new EditTextBoldCursor(context);
        this.w = editTextBoldCursor4;
        editTextBoldCursor4.setText(getMessagesController().U2 + "/addtheme/");
        this.w.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.r6.E(this.w, i11, null);
        org.telegram.ui.ActionBar.r6.V(this.w, i12, null);
        this.w.setMaxLines(1);
        this.w.setLines(1);
        this.w.setEnabled(false);
        this.w.setBackgroundDrawable(null);
        this.w.setPadding(0, 0, 0, 0);
        this.w.setSingleLine(true);
        this.w.setInputType(163840);
        this.w.setImeOptions(6);
        linearLayout5.addView(this.w, c8.ha.o(-2, 50));
        EditTextBoldCursor editTextBoldCursor5 = new EditTextBoldCursor(context);
        this.a = editTextBoldCursor5;
        editTextBoldCursor5.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.r6.E(this.a, i11, null);
        org.telegram.ui.ActionBar.r6.V(this.a, i12, null);
        this.a.setMaxLines(1);
        this.a.setLines(1);
        this.a.setBackgroundDrawable(null);
        this.a.setPadding(0, 0, 0, 0);
        this.a.setSingleLine(true);
        this.a.setInputType(163872);
        this.a.setImeOptions(6);
        this.a.setHint(org.telegram.messenger.hd.M0(2131745502, null));
        org.telegram.ui.ActionBar.r6.w(this.a, i12, null);
        this.a.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        this.a.setCursorWidth(1.5f);
        linearLayout5.addView(this.a, c8.ha.o(-1, 50));
        this.a.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.v71
            public final /* synthetic */ x71 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i14, KeyEvent keyEvent) {
                org.telegram.ui.ActionBar.r0 r0Var;
                switch (i7) {
                    case 0:
                        x71 x71Var = this.b;
                        if (i14 == 6) {
                            org.telegram.messenger.g0.v1(x71Var.b);
                            return true;
                        }
                        x71Var.getClass();
                        return false;
                    default:
                        if (i14 != 6 || (r0Var = this.b.c) == null) {
                            return false;
                        }
                        r0Var.performClick();
                        return true;
                }
            }
        });
        this.a.addTextChangedListener(new m0(this, 16));
        if (z9) {
            this.a.setOnFocusChangeListener(new fd(this, 11));
        }
        org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(context);
        this.e = z8Var;
        int i14 = org.telegram.ui.ActionBar.k6.b7;
        org.telegram.ui.ActionBar.r6.a0(z8Var, context, R.drawable.greydivider_bottom, i14);
        this.e.setVisibility(8);
        this.e.setBottomPadding(0);
        linearLayout2.addView(this.e, c8.ha.o(-1, -2));
        org.telegram.ui.Cells.z8 z8Var2 = new org.telegram.ui.Cells.z8(context);
        this.d = z8Var2;
        z8Var2.getTextView().setMovementMethod(new org.telegram.messenger.c0(3));
        org.telegram.ui.ActionBar.r6.D(this.d.getTextView(), org.telegram.ui.ActionBar.k6.K6, null);
        if (z9) {
            this.d.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131744186, null)));
        } else {
            org.telegram.ui.Cells.z8 z8Var3 = this.d;
            SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131744145, null));
            this.G = X2;
            z8Var3.setText(X2);
        }
        linearLayout2.addView(this.d, c8.ha.o(-1, -2));
        if (z9) {
            org.telegram.ui.ActionBar.r6.a0(this.d, context, R.drawable.greydivider, i14);
            org.telegram.ui.Cells.z9 z9Var = new org.telegram.ui.Cells.z9(context, this.parentLayout, 1);
            this.f = z9Var;
            linearLayout2.addView(z9Var, c8.ha.o(-1, -2));
            org.telegram.ui.Cells.w9 w9Var = new org.telegram.ui.Cells.w9(context);
            this.h = w9Var;
            org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.k6.N0(true);
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i10);
            org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.i6);
            w9Var.setBackground(N0);
            org.telegram.ui.ActionBar.r6.k(w9Var, N0, N, N2, null);
            this.h.b(org.telegram.messenger.hd.M0(2131743800, null), false);
            linearLayout2.addView(this.h, c8.ha.o(-1, -2));
            this.h.setOnClickListener(new fk0(14, this, context));
            org.telegram.ui.Cells.z8 z8Var4 = new org.telegram.ui.Cells.z8(context);
            this.n = z8Var4;
            z8Var4.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131743799, null)));
            org.telegram.ui.ActionBar.r6.a0(this.n, context, R.drawable.greydivider_bottom, i14);
            linearLayout2.addView(this.n, c8.ha.o(-1, -2));
        } else {
            org.telegram.ui.ActionBar.r6.a0(this.d, context, R.drawable.greydivider_bottom, i14);
        }
        TLRPC.TL_theme tL_theme = this.K;
        if (tL_theme != null) {
            this.F = true;
            this.b.setText(tL_theme.title);
            EditTextBoldCursor editTextBoldCursor6 = this.b;
            editTextBoldCursor6.setSelection(editTextBoldCursor6.length());
            this.a.setText(tL_theme.slug);
            EditTextBoldCursor editTextBoldCursor7 = this.a;
            editTextBoldCursor7.setSelection(editTextBoldCursor7.length());
            this.F = false;
        }
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.ui.ActionBar.u1 u1Var;
        org.telegram.ui.ActionBar.u1 u1Var2;
        int i11 = org.telegram.messenger.qs.M2;
        org.telegram.ui.ActionBar.h6 h6Var = this.J;
        org.telegram.ui.ActionBar.j6 j6Var = this.I;
        if (i7 == i11) {
            org.telegram.ui.ActionBar.j6 j6Var2 = (org.telegram.ui.ActionBar.j6) objArr[0];
            org.telegram.ui.ActionBar.h6 h6Var2 = (org.telegram.ui.ActionBar.h6) objArr[1];
            if (j6Var2 == j6Var && h6Var2 == h6Var && (u1Var2 = this.r) != null) {
                try {
                    u1Var2.dismiss();
                    this.r = null;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                org.telegram.ui.ActionBar.k6.u(j6Var, true, false);
                finishFragment();
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.qs.N2) {
            org.telegram.ui.ActionBar.j6 j6Var3 = (org.telegram.ui.ActionBar.j6) objArr[0];
            org.telegram.ui.ActionBar.h6 h6Var3 = (org.telegram.ui.ActionBar.h6) objArr[1];
            if (j6Var3 == j6Var && h6Var3 == h6Var && (u1Var = this.r) != null) {
                try {
                    u1Var.dismiss();
                    this.r = null;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
            }
        }
    }

    public final boolean e0(String str, boolean z9) {
        String str2;
        by0 by0Var = this.E;
        if (by0Var != null) {
            org.telegram.messenger.g0.r(by0Var);
            this.E = null;
            this.D = null;
            if (this.y != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.y, true);
            }
        }
        if (str != null) {
            if (str.startsWith("_") || str.endsWith("_")) {
                f0(org.telegram.ui.ActionBar.k6.p7, org.telegram.messenger.hd.M0(2131745506, null));
                return false;
            }
            for (int i7 = 0; i7 < str.length(); i7++) {
                char charAt = str.charAt(i7);
                if (i7 == 0 && charAt >= '0' && charAt <= '9') {
                    if (z9) {
                        org.telegram.ui.Components.v4.r0(this, org.telegram.messenger.hd.M0(2131744191, null), org.telegram.messenger.hd.M0(2131745503, null), null);
                        return false;
                    }
                    f0(org.telegram.ui.ActionBar.k6.p7, org.telegram.messenger.hd.M0(2131745503, null));
                    return false;
                }
                if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                    if (z9) {
                        org.telegram.ui.Components.v4.r0(this, org.telegram.messenger.hd.M0(2131744191, null), org.telegram.messenger.hd.M0(2131745506, null), null);
                        return false;
                    }
                    f0(org.telegram.ui.ActionBar.k6.p7, org.telegram.messenger.hd.M0(2131745506, null));
                    return false;
                }
            }
        }
        if (str == null || str.length() < 5) {
            if (z9) {
                org.telegram.ui.Components.v4.r0(this, org.telegram.messenger.hd.M0(2131744191, null), org.telegram.messenger.hd.M0(2131745504, null), null);
                return false;
            }
            f0(org.telegram.ui.ActionBar.k6.p7, org.telegram.messenger.hd.M0(2131745504, null));
            return false;
        }
        if (str.length() > 64) {
            if (z9) {
                org.telegram.ui.Components.v4.r0(this, org.telegram.messenger.hd.M0(2131744191, null), org.telegram.messenger.hd.M0(2131745505, null), null);
                return false;
            }
            f0(org.telegram.ui.ActionBar.k6.p7, org.telegram.messenger.hd.M0(2131745505, null));
            return false;
        }
        if (!z9) {
            TLRPC.TL_theme tL_theme = this.K;
            if (tL_theme == null || (str2 = tL_theme.slug) == null) {
                str2 = "";
            }
            if (str.equals(str2)) {
                f0(org.telegram.ui.ActionBar.k6.w6, org.telegram.messenger.hd.a0("SetUrlAvailable", null, 2131745509, str));
                return true;
            }
            f0(org.telegram.ui.ActionBar.k6.F6, org.telegram.messenger.hd.M0(2131745508, null));
            this.D = str;
            by0 by0Var2 = new by0(15, this, str);
            this.E = by0Var2;
            org.telegram.messenger.g0.i3(by0Var2, 300L);
        }
        return true;
    }

    public final void f0(int i7, String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean z9 = this.H;
        if (isEmpty) {
            this.e.setVisibility(8);
            if (z9) {
                org.telegram.ui.ActionBar.r6.a0(this.d, getParentActivity(), R.drawable.greydivider, org.telegram.ui.ActionBar.k6.b7);
                return;
            } else {
                org.telegram.ui.ActionBar.r6.a0(this.d, getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7);
                return;
            }
        }
        this.e.setVisibility(0);
        this.e.setText(str);
        this.e.setTag(Integer.valueOf(i7));
        this.e.setTextColorByKey(i7);
        if (z9) {
            org.telegram.ui.ActionBar.r6.a0(this.d, getParentActivity(), R.drawable.greydivider_top, org.telegram.ui.ActionBar.k6.b7);
        } else {
            this.d.setBackgroundDrawable(null);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.k6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.l6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Sc));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Tc));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Id));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ob));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Kd));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Qb));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Md));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Rb));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Od));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Tb));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.be));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.gc));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.ce));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.bc));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.qs.M2);
        getNotificationCenter().c(this, org.telegram.messenger.qs.N2);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.qs.M2);
        getNotificationCenter().n(this, org.telegram.messenger.qs.N2);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onResume() {
        super.onResume();
        if (!org.telegram.messenger.qp.e1().getBoolean("view_animations", true) && this.H) {
            this.a.requestFocus();
            org.telegram.messenger.g0.K3(this.a);
        }
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        org.telegram.messenger.g0.B2(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            EditTextBoldCursor editTextBoldCursor = this.b;
            if (editTextBoldCursor != null) {
                org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 30, org.telegram.ui.ActionBar.k6.G6, null);
            }
            EditTextBoldCursor editTextBoldCursor2 = this.a;
            if (editTextBoldCursor2 != null) {
                org.telegram.ui.ActionBar.r6.m(editTextBoldCursor2, 30, org.telegram.ui.ActionBar.k6.G6, null);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        if (!z9 || this.H) {
            return;
        }
        this.a.requestFocus();
        org.telegram.messenger.g0.K3(this.a);
    }
}
