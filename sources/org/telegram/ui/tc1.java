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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class tc1 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public String A;
    public n21 B;
    public boolean C;
    public SpannableStringBuilder D;
    public final boolean E;
    public final org.telegram.ui.ActionBar.e6 F;
    public final org.telegram.ui.ActionBar.d6 G;
    public final TLRPC.TL_theme H;
    public EditTextBoldCursor a;
    public EditTextBoldCursor b;
    public org.telegram.ui.ActionBar.w0 c;
    public org.telegram.ui.Cells.b9 d;
    public org.telegram.ui.Cells.b9 e;
    public org.telegram.ui.Cells.fa f;
    public org.telegram.ui.Cells.ba h;
    public org.telegram.ui.Cells.b9 n;
    public org.telegram.ui.ActionBar.c2 r;
    public org.telegram.ui.Components.an s;
    public org.telegram.ui.Cells.m4 v;
    public EditTextBoldCursor w;
    public LinearLayout x;
    public int y;

    public tc1(org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(null);
        this.F = e6Var;
        this.G = d6Var;
        this.H = d6Var != null ? d6Var.r : e6Var.B;
        this.currentAccount = d6Var != null ? d6Var.t : e6Var.A;
        this.E = z10;
    }

    public static /* synthetic */ void U(tc1 tc1Var, TLRPC.TL_theme tL_theme) {
        try {
            tc1Var.r.dismiss();
            tc1Var.r = null;
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        org.telegram.ui.ActionBar.f6.C1(tc1Var.F, tc1Var.G, tL_theme, tc1Var.currentAccount, false);
        tc1Var.finishFragment();
    }

    public static /* synthetic */ void V(tc1 tc1Var, TLRPC.TL_error tL_error, TL_account.updateTheme updatetheme) {
        try {
            tc1Var.r.dismiss();
            tc1Var.r = null;
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        org.telegram.ui.Components.y4.f0(tc1Var.currentAccount, tL_error, tc1Var, updatetheme, new Object[0]);
    }

    public static /* synthetic */ void W(tc1 tc1Var, String str) {
        TL_account.createTheme createtheme = new TL_account.createTheme();
        createtheme.slug = str;
        createtheme.title = "";
        createtheme.document = new TLRPC.TL_inputDocumentEmpty();
        tc1Var.y = ConnectionsManager.getInstance(tc1Var.currentAccount).sendRequest(createtheme, new o71(2, tc1Var, str), 2);
    }

    public static void X(tc1 tc1Var) {
        org.telegram.ui.ActionBar.e6 e6Var = tc1Var.F;
        TLRPC.TL_theme tL_theme = tc1Var.H;
        if (tc1Var.Y(tc1Var.a.getText().toString(), true) && tc1Var.getParentActivity() != null) {
            if (tc1Var.b.length() == 0) {
                org.telegram.ui.Components.y4.u0(tc1Var, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.ThemeNameInvalid), null);
                return;
            }
            if (tc1Var.E) {
                String str = tL_theme.title;
                org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(tc1Var.getParentActivity(), 3, null);
                tc1Var.r = c2Var;
                c2Var.setOnCancelListener(new rc1());
                tc1Var.r.show();
                String obj = tc1Var.b.getText().toString();
                tL_theme.title = obj;
                e6Var.a = obj;
                e6Var.B.slug = tc1Var.a.getText().toString();
                org.telegram.ui.ActionBar.f6.r1(e6Var, true, true, true);
                return;
            }
            String str2 = tL_theme.slug;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = tL_theme.title;
            String str4 = str3 != null ? str3 : "";
            String obj2 = tc1Var.a.getText().toString();
            String obj3 = tc1Var.b.getText().toString();
            if (str2.equals(obj2) && str4.equals(obj3)) {
                tc1Var.finishFragment();
                return;
            }
            tc1Var.r = new org.telegram.ui.ActionBar.c2(tc1Var.getParentActivity(), 3, null);
            TL_account.updateTheme updatetheme = new TL_account.updateTheme();
            TLRPC.TL_inputTheme tL_inputTheme = new TLRPC.TL_inputTheme();
            tL_inputTheme.id = tL_theme.id;
            tL_inputTheme.access_hash = tL_theme.access_hash;
            updatetheme.theme = tL_inputTheme;
            updatetheme.format = "android";
            updatetheme.slug = obj2;
            int i9 = updatetheme.flags;
            updatetheme.title = obj3;
            updatetheme.flags = i9 | 3;
            int sendRequest = ConnectionsManager.getInstance(tc1Var.currentAccount).sendRequest(updatetheme, new o71(3, tc1Var, updatetheme), 2);
            ConnectionsManager.getInstance(tc1Var.currentAccount).bindRequestToGuid(sendRequest, tc1Var.classGuid);
            tc1Var.r.setOnCancelListener(new gh.x(tc1Var, sendRequest, 9));
            tc1Var.r.show();
        }
    }

    public final boolean Y(String str, boolean z10) {
        String str2;
        n21 n21Var = this.B;
        if (n21Var != null) {
            AndroidUtilities.cancelRunOnUIThread(n21Var);
            this.B = null;
            this.A = null;
            if (this.y != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.y, true);
            }
        }
        if (str != null) {
            if (str.startsWith("_") || str.endsWith("_")) {
                Z(org.telegram.ui.ActionBar.f6.p7, LocaleController.getString(R.string.SetUrlInvalid));
                return false;
            }
            for (int i9 = 0; i9 < str.length(); i9++) {
                char charAt = str.charAt(i9);
                if (i9 == 0 && charAt >= '0' && charAt <= '9') {
                    if (z10) {
                        org.telegram.ui.Components.y4.u0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalidStartNumber), null);
                        return false;
                    }
                    Z(org.telegram.ui.ActionBar.f6.p7, LocaleController.getString(R.string.SetUrlInvalidStartNumber));
                    return false;
                }
                if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                    if (z10) {
                        org.telegram.ui.Components.y4.u0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalid), null);
                        return false;
                    }
                    Z(org.telegram.ui.ActionBar.f6.p7, LocaleController.getString(R.string.SetUrlInvalid));
                    return false;
                }
            }
        }
        if (str == null || str.length() < 5) {
            if (z10) {
                org.telegram.ui.Components.y4.u0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalidShort), null);
                return false;
            }
            Z(org.telegram.ui.ActionBar.f6.p7, LocaleController.getString(R.string.SetUrlInvalidShort));
            return false;
        }
        if (str.length() > 64) {
            if (z10) {
                org.telegram.ui.Components.y4.u0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalidLong), null);
                return false;
            }
            Z(org.telegram.ui.ActionBar.f6.p7, LocaleController.getString(R.string.SetUrlInvalidLong));
            return false;
        }
        if (!z10) {
            TLRPC.TL_theme tL_theme = this.H;
            if (tL_theme == null || (str2 = tL_theme.slug) == null) {
                str2 = "";
            }
            if (str.equals(str2)) {
                Z(org.telegram.ui.ActionBar.f6.w6, LocaleController.formatString("SetUrlAvailable", R.string.SetUrlAvailable, str));
                return true;
            }
            Z(org.telegram.ui.ActionBar.f6.F6, LocaleController.getString(R.string.SetUrlChecking));
            this.A = str;
            n21 n21Var2 = new n21(14, this, str);
            this.B = n21Var2;
            AndroidUtilities.runOnUIThread(n21Var2, 300L);
        }
        return true;
    }

    public final void Z(int i9, String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean z10 = this.E;
        if (isEmpty) {
            this.e.setVisibility(8);
            if (z10) {
                this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.V0(getParentActivity(), R.drawable.greydivider, org.telegram.ui.ActionBar.f6.b7));
                return;
            } else {
                this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.V0(getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.f6.b7));
                return;
            }
        }
        this.e.setVisibility(0);
        this.e.setText(str);
        this.e.setTag(Integer.valueOf(i9));
        this.e.setTextColorByKey(i9);
        if (z10) {
            this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.V0(getParentActivity(), R.drawable.greydivider_top, org.telegram.ui.ActionBar.f6.b7));
        } else {
            this.d.setBackgroundDrawable(null);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        final int i9 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        boolean z10 = this.E;
        if (z10) {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewThemeTitle));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditThemeTitle));
        }
        this.actionBar.setActionBarMenuOnItemClick(new cd0(this, 28));
        this.c = this.actionBar.n().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        LinearLayout linearLayout = new LinearLayout(context);
        this.fragmentView = linearLayout;
        final int i10 = 0;
        linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.a7, false));
        LinearLayout linearLayout2 = (LinearLayout) this.fragmentView;
        linearLayout2.setOrientation(1);
        this.fragmentView.setOnTouchListener(new jh.d(2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.x = linearLayout3;
        linearLayout3.setOrientation(1);
        this.x.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
        linearLayout2.addView(this.x, g7.e6.n(-1, -2));
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context, 23);
        this.v = m4Var;
        m4Var.setText(LocaleController.getString(R.string.Info));
        this.x.addView(this.v);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.b = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.b;
        int i11 = org.telegram.ui.ActionBar.f6.H6;
        editTextBoldCursor2.setHintTextColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
        EditTextBoldCursor editTextBoldCursor3 = this.b;
        int i12 = org.telegram.ui.ActionBar.f6.G6;
        editTextBoldCursor3.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
        this.b.setMaxLines(1);
        this.b.setLines(1);
        this.b.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        this.b.setBackgroundDrawable(null);
        this.b.setPadding(0, 0, 0, 0);
        this.b.setSingleLine(true);
        this.b.setFilters(new InputFilter[]{new InputFilter.LengthFilter(128)});
        this.b.setInputType(163872);
        this.b.setImeOptions(6);
        this.b.setHint(LocaleController.getString(R.string.ThemeNamePlaceholder));
        this.b.setCursorColor(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
        this.b.setCursorSize(AndroidUtilities.dp(20.0f));
        this.b.setCursorWidth(1.5f);
        this.x.addView(this.b, g7.e6.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        this.b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.pc1
            public final /* synthetic */ tc1 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
                org.telegram.ui.ActionBar.w0 w0Var;
                switch (i10) {
                    case 0:
                        tc1 tc1Var = this.b;
                        if (i13 == 6) {
                            AndroidUtilities.hideKeyboard(tc1Var.b);
                            return true;
                        }
                        tc1Var.getClass();
                        return false;
                    default:
                        if (i13 != 6 || (w0Var = this.b.c) == null) {
                            return false;
                        }
                        w0Var.performClick();
                        return true;
                }
            }
        });
        org.telegram.ui.Components.an anVar = new org.telegram.ui.Components.an(context, 28);
        this.s = anVar;
        this.x.addView(anVar, new LinearLayout.LayoutParams(-1, 1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(0);
        this.x.addView(linearLayout4, g7.e6.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        EditTextBoldCursor editTextBoldCursor4 = new EditTextBoldCursor(context);
        this.w = editTextBoldCursor4;
        editTextBoldCursor4.setText(getMessagesController().linkPrefix + "/addtheme/");
        this.w.setTextSize(1, 18.0f);
        this.w.setHintTextColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
        this.w.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
        this.w.setMaxLines(1);
        this.w.setLines(1);
        this.w.setEnabled(false);
        this.w.setBackgroundDrawable(null);
        this.w.setPadding(0, 0, 0, 0);
        this.w.setSingleLine(true);
        this.w.setInputType(163840);
        this.w.setImeOptions(6);
        linearLayout4.addView(this.w, g7.e6.n(-2, 50));
        EditTextBoldCursor editTextBoldCursor5 = new EditTextBoldCursor(context);
        this.a = editTextBoldCursor5;
        editTextBoldCursor5.setTextSize(1, 18.0f);
        this.a.setHintTextColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
        this.a.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
        this.a.setMaxLines(1);
        this.a.setLines(1);
        this.a.setBackgroundDrawable(null);
        this.a.setPadding(0, 0, 0, 0);
        this.a.setSingleLine(true);
        this.a.setInputType(163872);
        this.a.setImeOptions(6);
        this.a.setHint(LocaleController.getString(R.string.SetUrlPlaceholder));
        this.a.setCursorColor(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
        this.a.setCursorSize(AndroidUtilities.dp(20.0f));
        this.a.setCursorWidth(1.5f);
        linearLayout4.addView(this.a, g7.e6.n(-1, 50));
        this.a.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.pc1
            public final /* synthetic */ tc1 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
                org.telegram.ui.ActionBar.w0 w0Var;
                switch (i9) {
                    case 0:
                        tc1 tc1Var = this.b;
                        if (i13 == 6) {
                            AndroidUtilities.hideKeyboard(tc1Var.b);
                            return true;
                        }
                        tc1Var.getClass();
                        return false;
                    default:
                        if (i13 != 6 || (w0Var = this.b.c) == null) {
                            return false;
                        }
                        w0Var.performClick();
                        return true;
                }
            }
        });
        this.a.addTextChangedListener(new sc1(this));
        if (z10) {
            this.a.setOnFocusChangeListener(new ld(this, 11));
        }
        org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(context);
        this.e = b9Var;
        int i13 = R.drawable.greydivider_bottom;
        int i14 = org.telegram.ui.ActionBar.f6.b7;
        b9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.V0(context, i13, i14));
        this.e.setVisibility(8);
        this.e.setBottomPadding(0);
        linearLayout2.addView(this.e, g7.e6.n(-1, -2));
        org.telegram.ui.Cells.b9 b9Var2 = new org.telegram.ui.Cells.b9(context);
        this.d = b9Var2;
        b9Var2.getTextView().setMovementMethod(new org.telegram.ui.Components.bv(2));
        this.d.getTextView().setHighlightColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.K6, false));
        if (z10) {
            this.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp)));
        } else {
            org.telegram.ui.Cells.b9 b9Var3 = this.d;
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeSetUrlHelp));
            this.D = replaceTags;
            b9Var3.setText(replaceTags);
        }
        linearLayout2.addView(this.d, g7.e6.n(-1, -2));
        if (z10) {
            this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.V0(context, R.drawable.greydivider, i14));
            org.telegram.ui.Cells.fa faVar = new org.telegram.ui.Cells.fa(context, this.parentLayout, 1);
            this.f = faVar;
            linearLayout2.addView(faVar, g7.e6.n(-1, -2));
            org.telegram.ui.Cells.ba baVar = new org.telegram.ui.Cells.ba(context);
            this.h = baVar;
            baVar.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.K0(true));
            this.h.b(LocaleController.getString(R.string.UseDifferentTheme), false);
            linearLayout2.addView(this.h, g7.e6.n(-1, -2));
            this.h.setOnClickListener(new v80(26, this, context));
            org.telegram.ui.Cells.b9 b9Var4 = new org.telegram.ui.Cells.b9(context);
            this.n = b9Var4;
            b9Var4.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.UseDifferentThemeInfo)));
            this.n.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.V0(context, R.drawable.greydivider_bottom, i14));
            linearLayout2.addView(this.n, g7.e6.n(-1, -2));
        } else {
            this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.V0(context, R.drawable.greydivider_bottom, i14));
        }
        TLRPC.TL_theme tL_theme = this.H;
        if (tL_theme != null) {
            this.C = true;
            this.b.setText(tL_theme.title);
            EditTextBoldCursor editTextBoldCursor6 = this.b;
            editTextBoldCursor6.setSelection(editTextBoldCursor6.length());
            this.a.setText(tL_theme.slug);
            EditTextBoldCursor editTextBoldCursor7 = this.a;
            editTextBoldCursor7.setSelection(editTextBoldCursor7.length());
            this.C = false;
        }
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        org.telegram.ui.ActionBar.c2 c2Var;
        org.telegram.ui.ActionBar.c2 c2Var2;
        int i11 = NotificationCenter.themeUploadedToServer;
        org.telegram.ui.ActionBar.d6 d6Var = this.G;
        org.telegram.ui.ActionBar.e6 e6Var = this.F;
        if (i9 == i11) {
            org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) objArr[0];
            org.telegram.ui.ActionBar.d6 d6Var2 = (org.telegram.ui.ActionBar.d6) objArr[1];
            if (e6Var2 == e6Var && d6Var2 == d6Var && (c2Var2 = this.r) != null) {
                try {
                    c2Var2.dismiss();
                    this.r = null;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                org.telegram.ui.ActionBar.f6.t(e6Var, true, false);
                finishFragment();
                return;
            }
            return;
        }
        if (i9 == NotificationCenter.themeUploadError) {
            org.telegram.ui.ActionBar.e6 e6Var3 = (org.telegram.ui.ActionBar.e6) objArr[0];
            org.telegram.ui.ActionBar.d6 d6Var3 = (org.telegram.ui.ActionBar.d6) objArr[1];
            if (e6Var3 == e6Var && d6Var3 == d6Var && (c2Var = this.r) != null) {
                try {
                    c2Var.dismiss();
                    this.r = null;
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.a7));
        LinearLayout linearLayout = this.x;
        int i9 = org.telegram.ui.ActionBar.f6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(linearLayout, 1, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.v, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.L6));
        int i10 = org.telegram.ui.ActionBar.f6.b7;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.n, 32, new Class[]{org.telegram.ui.Cells.b9.class}, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.f6.B6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.n, 0, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 32, new Class[]{org.telegram.ui.Cells.b9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.e, 32, new Class[]{org.telegram.ui.Cells.b9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.e, 262144, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.p7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.e, 262144, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.F6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.e, 262144, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.w6));
        int i12 = org.telegram.ui.ActionBar.f6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.h, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.h, TLObject.FLAG_28, null, null, null, null, org.telegram.ui.ActionBar.f6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.h, TLObject.FLAG_28, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 4, null, null, null, null, i12));
        EditTextBoldCursor editTextBoldCursor = this.a;
        int i13 = org.telegram.ui.ActionBar.f6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(editTextBoldCursor, TLObject.FLAG_23, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 32, null, null, null, null, org.telegram.ui.ActionBar.f6.k6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 65568, null, null, null, null, org.telegram.ui.ActionBar.f6.l6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 4, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, TLObject.FLAG_23, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 16777216, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 4, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, TLObject.FLAG_23, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 16777216, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.w, 4, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.w, TLObject.FLAG_23, null, null, null, null, i13));
        org.telegram.ui.Components.an anVar = this.s;
        Paint paint = org.telegram.ui.ActionBar.f6.k0;
        int i14 = org.telegram.ui.ActionBar.f6.d7;
        arrayList.add(new org.telegram.ui.ActionBar.h6(anVar, 0, null, paint, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.s, 1, null, org.telegram.ui.ActionBar.f6.k0, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.f6.m3, org.telegram.ui.ActionBar.f6.q3}, null, org.telegram.ui.ActionBar.f6.ra));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.f6.n3, org.telegram.ui.ActionBar.f6.r3}, null, org.telegram.ui.ActionBar.f6.dc));
        org.telegram.ui.Cells.fa faVar = this.f;
        Drawable[] drawableArr = org.telegram.ui.ActionBar.f6.m3.y;
        int i15 = org.telegram.ui.ActionBar.f6.ta;
        arrayList.add(new org.telegram.ui.ActionBar.h6(faVar, 0, null, null, drawableArr, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f, 0, null, null, org.telegram.ui.ActionBar.f6.q3.y, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.f6.o3, org.telegram.ui.ActionBar.f6.s3}, null, org.telegram.ui.ActionBar.f6.Aa));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.f6.o3, org.telegram.ui.ActionBar.f6.s3}, null, org.telegram.ui.ActionBar.f6.Da));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.f6.o3, org.telegram.ui.ActionBar.f6.s3}, null, org.telegram.ui.ActionBar.f6.Ea));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.f6.o3, org.telegram.ui.ActionBar.f6.s3}, null, org.telegram.ui.ActionBar.f6.Fa));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.f6.p3, org.telegram.ui.ActionBar.f6.t3}, null, org.telegram.ui.ActionBar.f6.Ba));
        org.telegram.ui.Cells.fa faVar2 = this.f;
        Drawable[] drawableArr2 = org.telegram.ui.ActionBar.f6.o3.y;
        int i16 = org.telegram.ui.ActionBar.f6.Ca;
        arrayList.add(new org.telegram.ui.ActionBar.h6(faVar2, 0, null, null, drawableArr2, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f, 0, null, null, org.telegram.ui.ActionBar.f6.s3.y, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.ec));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.fc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.f6.y3}, null, org.telegram.ui.ActionBar.f6.Ja));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.f6.z3}, null, org.telegram.ui.ActionBar.f6.Ka));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.f6.A3, org.telegram.ui.ActionBar.f6.C3}, null, org.telegram.ui.ActionBar.f6.La));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.f6.B3, org.telegram.ui.ActionBar.f6.D3}, null, org.telegram.ui.ActionBar.f6.Ma));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.f6.F3, org.telegram.ui.ActionBar.f6.G3}, null, org.telegram.ui.ActionBar.f6.sc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.Uc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.ab));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.cb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.Yc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.db));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.ad));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.fb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.nd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.sb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.od));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.nb));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.themeUploadedToServer);
        getNotificationCenter().addObserver(this, NotificationCenter.themeUploadError);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.themeUploadedToServer);
        getNotificationCenter().removeObserver(this, NotificationCenter.themeUploadError);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        if (!MessagesController.getGlobalMainSettings().getBoolean("view_animations", true) && this.E) {
            this.a.requestFocus();
            AndroidUtilities.showKeyboard(this.a);
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 || this.E) {
            return;
        }
        this.a.requestFocus();
        AndroidUtilities.showKeyboard(this.a);
    }
}
