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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class y71 extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.fs {
    public String E;
    public iy0 F;
    public boolean G;
    public SpannableStringBuilder H;
    public final boolean I;
    public final org.telegram.ui.ActionBar.m6 J;
    public final org.telegram.ui.ActionBar.k6 K;
    public final TLRPC.TL_theme L;
    public EditTextBoldCursor a;
    public EditTextBoldCursor b;
    public org.telegram.ui.ActionBar.q0 c;
    public org.telegram.ui.Cells.z8 d;
    public org.telegram.ui.Cells.z8 e;
    public org.telegram.ui.Cells.ba f;
    public org.telegram.ui.Cells.w9 h;
    public org.telegram.ui.Cells.z8 n;
    public org.telegram.ui.ActionBar.t1 r;
    public org.telegram.ui.Cells.o4 s;
    public EditTextBoldCursor w;
    public LinearLayout x;
    public int y;

    public y71(org.telegram.ui.ActionBar.m6 m6Var, org.telegram.ui.ActionBar.k6 k6Var, boolean z10) {
        super(null);
        this.J = m6Var;
        this.K = k6Var;
        this.L = k6Var != null ? k6Var.r : m6Var.G;
        this.currentAccount = k6Var != null ? k6Var.t : m6Var.F;
        this.I = z10;
    }

    public static void a0(y71 y71Var, TLRPC.TL_theme tL_theme) {
        try {
            y71Var.r.dismiss();
            y71Var.r = null;
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        org.telegram.ui.ActionBar.n6.I1(y71Var.J, y71Var.K, tL_theme, y71Var.currentAccount, false);
        y71Var.finishFragment();
    }

    public static void b0(y71 y71Var, TLRPC.TL_error tL_error, TL_account.updateTheme updatetheme) {
        try {
            y71Var.r.dismiss();
            y71Var.r = null;
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        org.telegram.ui.Components.b5.c0(y71Var.currentAccount, tL_error, y71Var, updatetheme, new Object[0]);
    }

    public static /* synthetic */ void c0(y71 y71Var, String str) {
        TL_account.createTheme createtheme = new TL_account.createTheme();
        createtheme.slug = str;
        createtheme.title = "";
        createtheme.document = new TLRPC.TL_inputDocumentEmpty();
        y71Var.y = ConnectionsManager.getInstance(y71Var.currentAccount).sendRequest(createtheme, new d31(3, y71Var, str), 2);
    }

    public static void d0(y71 y71Var) {
        org.telegram.ui.ActionBar.m6 m6Var = y71Var.J;
        TLRPC.TL_theme tL_theme = y71Var.L;
        if (y71Var.e0(y71Var.a.getText().toString(), true) && y71Var.getParentActivity() != null) {
            if (y71Var.b.length() == 0) {
                org.telegram.ui.Components.b5.r0(y71Var, org.telegram.messenger.gd.N0(2131743945, null), org.telegram.messenger.gd.N0(2131743932, null), null);
                return;
            }
            if (y71Var.I) {
                String str = tL_theme.title;
                org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, y71Var.getParentActivity(), null);
                y71Var.r = t1Var;
                t1Var.setOnCancelListener(new x71());
                y71Var.r.show();
                String obj = y71Var.b.getText().toString();
                tL_theme.title = obj;
                m6Var.a = obj;
                m6Var.G.slug = y71Var.a.getText().toString();
                org.telegram.ui.ActionBar.n6.x1(m6Var, true, true, true);
                return;
            }
            String str2 = tL_theme.slug;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = tL_theme.title;
            String str4 = str3 != null ? str3 : "";
            String obj2 = y71Var.a.getText().toString();
            String obj3 = y71Var.b.getText().toString();
            if (str2.equals(obj2) && str4.equals(obj3)) {
                y71Var.finishFragment();
                return;
            }
            y71Var.r = new org.telegram.ui.ActionBar.t1(3, y71Var.getParentActivity(), null);
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
            int sendRequest = ConnectionsManager.getInstance(y71Var.currentAccount).sendRequest(updatetheme, new d31(4, y71Var, updatetheme), 2);
            ConnectionsManager.getInstance(y71Var.currentAccount).bindRequestToGuid(sendRequest, y71Var.classGuid);
            y71Var.r.setOnCancelListener(new di.z(y71Var, sendRequest, 8));
            y71Var.r.show();
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.jd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Db));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Cb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Bb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ab));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.tb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.sb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.wb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.vb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.ub));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.ta));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Uc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.ra));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.w6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.F6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.s8));
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        final int i7 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        boolean z10 = this.I;
        if (z10) {
            this.actionBar.setTitle(org.telegram.messenger.gd.N0(2131748059, null));
        } else {
            this.actionBar.setTitle(org.telegram.messenger.gd.N0(2131751206, null));
        }
        this.actionBar.setActionBarMenuOnItemClick(new gs0(this, 17));
        this.c = this.actionBar.s().e(1, org.telegram.messenger.gd.N0(2131751342, null).toUpperCase());
        LinearLayout linearLayout = new LinearLayout(context);
        this.fragmentView = linearLayout;
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.a7, linearLayout, null);
        LinearLayout linearLayout2 = (LinearLayout) this.fragmentView;
        linearLayout2.setOrientation(1);
        this.fragmentView.setOnTouchListener(new gi.a(2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.x = linearLayout3;
        linearLayout3.setOrientation(1);
        LinearLayout linearLayout4 = this.x;
        int i10 = org.telegram.ui.ActionBar.n6.d6;
        org.telegram.ui.ActionBar.u6.h(i10, linearLayout4, null);
        linearLayout2.addView(this.x, c8.na.o(-1, -2));
        org.telegram.ui.Cells.o4 o4Var = new org.telegram.ui.Cells.o4(context, 23);
        this.s = o4Var;
        o4Var.setText(org.telegram.messenger.gd.N0(2131749004, null));
        this.x.addView(this.s);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.b = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.b;
        int i11 = org.telegram.ui.ActionBar.n6.H6;
        org.telegram.ui.ActionBar.u6.D(editTextBoldCursor2, i11, null);
        EditTextBoldCursor editTextBoldCursor3 = this.b;
        int i12 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.u6.U(editTextBoldCursor3, i12, null);
        this.b.setMaxLines(1);
        this.b.setLines(1);
        this.b.setGravity((org.telegram.messenger.gd.a0 ? 5 : 3) | 16);
        this.b.setBackgroundDrawable(null);
        final int i13 = 0;
        this.b.setPadding(0, 0, 0, 0);
        this.b.setSingleLine(true);
        this.b.setFilters(new InputFilter[]{new InputFilter.LengthFilter(128)});
        this.b.setInputType(163872);
        this.b.setImeOptions(6);
        this.b.setHint(org.telegram.messenger.gd.N0(2131743931, null));
        org.telegram.ui.ActionBar.u6.v(this.b, i12, null);
        this.b.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        this.b.setCursorWidth(1.5f);
        this.x.addView(this.b, c8.na.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        this.b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.w71
            public final /* synthetic */ y71 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i14, KeyEvent keyEvent) {
                org.telegram.ui.ActionBar.q0 q0Var;
                switch (i13) {
                    case 0:
                        y71 y71Var = this.b;
                        if (i14 == 6) {
                            org.telegram.messenger.g0.v1(y71Var.b);
                            return true;
                        }
                        y71Var.getClass();
                        return false;
                    default:
                        if (i14 != 6 || (q0Var = this.b.c) == null) {
                            return false;
                        }
                        q0Var.performClick();
                        return true;
                }
            }
        });
        this.x.addView(new org.telegram.ui.Components.in(context, 26), new LinearLayout.LayoutParams(-1, 1));
        LinearLayout linearLayout5 = new LinearLayout(context);
        linearLayout5.setOrientation(0);
        this.x.addView(linearLayout5, c8.na.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        EditTextBoldCursor editTextBoldCursor4 = new EditTextBoldCursor(context);
        this.w = editTextBoldCursor4;
        editTextBoldCursor4.setText(getMessagesController().X2 + "/addtheme/");
        this.w.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.u6.D(this.w, i11, null);
        org.telegram.ui.ActionBar.u6.U(this.w, i12, null);
        this.w.setMaxLines(1);
        this.w.setLines(1);
        this.w.setEnabled(false);
        this.w.setBackgroundDrawable(null);
        this.w.setPadding(0, 0, 0, 0);
        this.w.setSingleLine(true);
        this.w.setInputType(163840);
        this.w.setImeOptions(6);
        linearLayout5.addView(this.w, c8.na.o(-2, 50));
        EditTextBoldCursor editTextBoldCursor5 = new EditTextBoldCursor(context);
        this.a = editTextBoldCursor5;
        editTextBoldCursor5.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.u6.D(this.a, i11, null);
        org.telegram.ui.ActionBar.u6.U(this.a, i12, null);
        this.a.setMaxLines(1);
        this.a.setLines(1);
        this.a.setBackgroundDrawable(null);
        this.a.setPadding(0, 0, 0, 0);
        this.a.setSingleLine(true);
        this.a.setInputType(163872);
        this.a.setImeOptions(6);
        this.a.setHint(org.telegram.messenger.gd.N0(2131745305, null));
        org.telegram.ui.ActionBar.u6.v(this.a, i12, null);
        this.a.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        this.a.setCursorWidth(1.5f);
        linearLayout5.addView(this.a, c8.na.o(-1, 50));
        this.a.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.w71
            public final /* synthetic */ y71 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i14, KeyEvent keyEvent) {
                org.telegram.ui.ActionBar.q0 q0Var;
                switch (i7) {
                    case 0:
                        y71 y71Var = this.b;
                        if (i14 == 6) {
                            org.telegram.messenger.g0.v1(y71Var.b);
                            return true;
                        }
                        y71Var.getClass();
                        return false;
                    default:
                        if (i14 != 6 || (q0Var = this.b.c) == null) {
                            return false;
                        }
                        q0Var.performClick();
                        return true;
                }
            }
        });
        this.a.addTextChangedListener(new m0(this, 16));
        if (z10) {
            this.a.setOnFocusChangeListener(new ed(this, 11));
        }
        org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(context);
        this.e = z8Var;
        int i14 = org.telegram.ui.ActionBar.n6.b7;
        org.telegram.ui.ActionBar.u6.Z(z8Var, context, R.drawable.greydivider_bottom, i14);
        this.e.setVisibility(8);
        this.e.setBottomPadding(0);
        linearLayout2.addView(this.e, c8.na.o(-1, -2));
        org.telegram.ui.Cells.z8 z8Var2 = new org.telegram.ui.Cells.z8(context);
        this.d = z8Var2;
        z8Var2.getTextView().setMovementMethod(new org.telegram.messenger.c0(3));
        org.telegram.ui.ActionBar.u6.C(this.d.getTextView(), org.telegram.ui.ActionBar.n6.K6, null);
        if (z10) {
            this.d.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131743940, null)));
        } else {
            org.telegram.ui.Cells.z8 z8Var3 = this.d;
            SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131743899, null));
            this.H = W2;
            z8Var3.setText(W2);
        }
        linearLayout2.addView(this.d, c8.na.o(-1, -2));
        if (z10) {
            org.telegram.ui.ActionBar.u6.Z(this.d, context, R.drawable.greydivider, i14);
            org.telegram.ui.Cells.ba baVar = new org.telegram.ui.Cells.ba(context, this.parentLayout, 1);
            this.f = baVar;
            linearLayout2.addView(baVar, c8.na.o(-1, -2));
            org.telegram.ui.Cells.w9 w9Var = new org.telegram.ui.Cells.w9(context);
            this.h = w9Var;
            org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.n6.N0(true);
            org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i10);
            org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(org.telegram.ui.ActionBar.n6.i6);
            w9Var.setBackground(N0);
            org.telegram.ui.ActionBar.u6.j(w9Var, N0, M, M2, null);
            this.h.b(org.telegram.messenger.gd.N0(2131743552, null), false);
            linearLayout2.addView(this.h, c8.na.o(-1, -2));
            this.h.setOnClickListener(new ig0(16, this, context));
            org.telegram.ui.Cells.z8 z8Var4 = new org.telegram.ui.Cells.z8(context);
            this.n = z8Var4;
            z8Var4.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131743551, null)));
            org.telegram.ui.ActionBar.u6.Z(this.n, context, R.drawable.greydivider_bottom, i14);
            linearLayout2.addView(this.n, c8.na.o(-1, -2));
        } else {
            org.telegram.ui.ActionBar.u6.Z(this.d, context, R.drawable.greydivider_bottom, i14);
        }
        TLRPC.TL_theme tL_theme = this.L;
        if (tL_theme != null) {
            this.G = true;
            this.b.setText(tL_theme.title);
            EditTextBoldCursor editTextBoldCursor6 = this.b;
            editTextBoldCursor6.setSelection(editTextBoldCursor6.length());
            this.a.setText(tL_theme.slug);
            EditTextBoldCursor editTextBoldCursor7 = this.a;
            editTextBoldCursor7.setSelection(editTextBoldCursor7.length());
            this.G = false;
        }
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.ui.ActionBar.t1 t1Var;
        org.telegram.ui.ActionBar.t1 t1Var2;
        int i11 = org.telegram.messenger.ks.M2;
        org.telegram.ui.ActionBar.k6 k6Var = this.K;
        org.telegram.ui.ActionBar.m6 m6Var = this.J;
        if (i7 == i11) {
            org.telegram.ui.ActionBar.m6 m6Var2 = (org.telegram.ui.ActionBar.m6) objArr[0];
            org.telegram.ui.ActionBar.k6 k6Var2 = (org.telegram.ui.ActionBar.k6) objArr[1];
            if (m6Var2 == m6Var && k6Var2 == k6Var && (t1Var2 = this.r) != null) {
                try {
                    t1Var2.dismiss();
                    this.r = null;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                org.telegram.ui.ActionBar.n6.u(m6Var, true, false);
                finishFragment();
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ks.N2) {
            org.telegram.ui.ActionBar.m6 m6Var3 = (org.telegram.ui.ActionBar.m6) objArr[0];
            org.telegram.ui.ActionBar.k6 k6Var3 = (org.telegram.ui.ActionBar.k6) objArr[1];
            if (m6Var3 == m6Var && k6Var3 == k6Var && (t1Var = this.r) != null) {
                try {
                    t1Var.dismiss();
                    this.r = null;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
            }
        }
    }

    public final boolean e0(String str, boolean z10) {
        String str2;
        iy0 iy0Var = this.F;
        if (iy0Var != null) {
            org.telegram.messenger.g0.r(iy0Var);
            this.F = null;
            this.E = null;
            if (this.y != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.y, true);
            }
        }
        if (str != null) {
            if (str.startsWith("_") || str.endsWith("_")) {
                f0(org.telegram.ui.ActionBar.n6.p7, org.telegram.messenger.gd.N0(2131745309, null));
                return false;
            }
            for (int i7 = 0; i7 < str.length(); i7++) {
                char charAt = str.charAt(i7);
                if (i7 == 0 && charAt >= '0' && charAt <= '9') {
                    if (z10) {
                        org.telegram.ui.Components.b5.r0(this, org.telegram.messenger.gd.N0(2131743945, null), org.telegram.messenger.gd.N0(2131745306, null), null);
                        return false;
                    }
                    f0(org.telegram.ui.ActionBar.n6.p7, org.telegram.messenger.gd.N0(2131745306, null));
                    return false;
                }
                if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                    if (z10) {
                        org.telegram.ui.Components.b5.r0(this, org.telegram.messenger.gd.N0(2131743945, null), org.telegram.messenger.gd.N0(2131745309, null), null);
                        return false;
                    }
                    f0(org.telegram.ui.ActionBar.n6.p7, org.telegram.messenger.gd.N0(2131745309, null));
                    return false;
                }
            }
        }
        if (str == null || str.length() < 5) {
            if (z10) {
                org.telegram.ui.Components.b5.r0(this, org.telegram.messenger.gd.N0(2131743945, null), org.telegram.messenger.gd.N0(2131745307, null), null);
                return false;
            }
            f0(org.telegram.ui.ActionBar.n6.p7, org.telegram.messenger.gd.N0(2131745307, null));
            return false;
        }
        if (str.length() > 64) {
            if (z10) {
                org.telegram.ui.Components.b5.r0(this, org.telegram.messenger.gd.N0(2131743945, null), org.telegram.messenger.gd.N0(2131745308, null), null);
                return false;
            }
            f0(org.telegram.ui.ActionBar.n6.p7, org.telegram.messenger.gd.N0(2131745308, null));
            return false;
        }
        if (!z10) {
            TLRPC.TL_theme tL_theme = this.L;
            if (tL_theme == null || (str2 = tL_theme.slug) == null) {
                str2 = "";
            }
            if (str.equals(str2)) {
                f0(org.telegram.ui.ActionBar.n6.w6, org.telegram.messenger.gd.a0("SetUrlAvailable", null, 2131745312, str));
                return true;
            }
            f0(org.telegram.ui.ActionBar.n6.F6, org.telegram.messenger.gd.N0(2131745311, null));
            this.E = str;
            iy0 iy0Var2 = new iy0(13, this, str);
            this.F = iy0Var2;
            org.telegram.messenger.g0.h3(iy0Var2, 300L);
        }
        return true;
    }

    public final void f0(int i7, String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean z10 = this.I;
        if (isEmpty) {
            this.e.setVisibility(8);
            if (z10) {
                org.telegram.ui.ActionBar.u6.Z(this.d, getParentActivity(), R.drawable.greydivider, org.telegram.ui.ActionBar.n6.b7);
                return;
            } else {
                org.telegram.ui.ActionBar.u6.Z(this.d, getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.n6.b7);
                return;
            }
        }
        this.e.setVisibility(0);
        this.e.setText(str);
        this.e.setTag(Integer.valueOf(i7));
        this.e.setTextColorByKey(i7);
        if (z10) {
            org.telegram.ui.ActionBar.u6.Z(this.d, getParentActivity(), R.drawable.greydivider_top, org.telegram.ui.ActionBar.n6.b7);
        } else {
            this.d.setBackgroundDrawable(null);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.a, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.k6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.a, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.l6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Vc));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Ld));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Rb));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Nd));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Tb));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Pd));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Ub));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Rd));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Wb));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.ee));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.jc));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.fe));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.ec));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.ks.M2);
        getNotificationCenter().c(this, org.telegram.messenger.ks.N2);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.ks.M2);
        getNotificationCenter().n(this, org.telegram.messenger.ks.N2);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onResume() {
        super.onResume();
        if (!org.telegram.messenger.mp.g1().getBoolean("view_animations", true) && this.I) {
            this.a.requestFocus();
            org.telegram.messenger.g0.I3(this.a);
        }
        org.telegram.messenger.g0.Z2(getParentActivity(), this.classGuid);
        org.telegram.messenger.g0.B2(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            EditTextBoldCursor editTextBoldCursor = this.b;
            if (editTextBoldCursor != null) {
                org.telegram.ui.ActionBar.u6.l(editTextBoldCursor, 30, org.telegram.ui.ActionBar.n6.G6, null);
            }
            EditTextBoldCursor editTextBoldCursor2 = this.a;
            if (editTextBoldCursor2 != null) {
                org.telegram.ui.ActionBar.u6.l(editTextBoldCursor2, 30, org.telegram.ui.ActionBar.n6.G6, null);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 || this.I) {
            return;
        }
        this.a.requestFocus();
        org.telegram.messenger.g0.I3(this.a);
    }
}
