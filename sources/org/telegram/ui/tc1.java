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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class tc1 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public String A;
    public m21 B;
    public boolean C;
    public SpannableStringBuilder D;
    public final boolean E;
    public final org.telegram.ui.ActionBar.f6 F;
    public final org.telegram.ui.ActionBar.e6 G;
    public final TLRPC.TL_theme H;
    public EditTextBoldCursor a;
    public EditTextBoldCursor b;
    public org.telegram.ui.ActionBar.v0 c;
    public org.telegram.ui.Cells.x8 d;
    public org.telegram.ui.Cells.x8 e;
    public org.telegram.ui.Cells.ba f;
    public org.telegram.ui.Cells.x9 h;
    public org.telegram.ui.Cells.x8 n;
    public org.telegram.ui.ActionBar.b2 r;
    public org.telegram.ui.Components.zm s;
    public org.telegram.ui.Cells.j4 v;
    public EditTextBoldCursor w;
    public LinearLayout x;
    public int y;

    public tc1(org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(null);
        this.F = f6Var;
        this.G = e6Var;
        this.H = e6Var != null ? e6Var.r : f6Var.B;
        this.currentAccount = e6Var != null ? e6Var.t : f6Var.A;
        this.E = z10;
    }

    public static /* synthetic */ void V(tc1 tc1Var, TLRPC.TL_theme tL_theme) {
        try {
            tc1Var.r.dismiss();
            tc1Var.r = null;
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        org.telegram.ui.ActionBar.g6.C1(tc1Var.F, tc1Var.G, tL_theme, tc1Var.currentAccount, false);
        tc1Var.finishFragment();
    }

    public static /* synthetic */ void W(tc1 tc1Var, TLRPC.TL_error tL_error, TL_account.updateTheme updatetheme) {
        try {
            tc1Var.r.dismiss();
            tc1Var.r = null;
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        org.telegram.ui.Components.y4.f0(tc1Var.currentAccount, tL_error, tc1Var, updatetheme, new Object[0]);
    }

    public static /* synthetic */ void X(tc1 tc1Var, String str) {
        TL_account.createTheme createtheme = new TL_account.createTheme();
        createtheme.slug = str;
        createtheme.title = "";
        createtheme.document = new TLRPC.TL_inputDocumentEmpty();
        tc1Var.y = ConnectionsManager.getInstance(tc1Var.currentAccount).sendRequest(createtheme, new v80(29, tc1Var, str), 2);
    }

    public static void Y(tc1 tc1Var) {
        org.telegram.ui.ActionBar.f6 f6Var = tc1Var.F;
        TLRPC.TL_theme tL_theme = tc1Var.H;
        if (tc1Var.Z(tc1Var.a.getText().toString(), true) && tc1Var.getParentActivity() != null) {
            if (tc1Var.b.length() == 0) {
                org.telegram.ui.Components.y4.u0(tc1Var, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.ThemeNameInvalid), null);
                return;
            }
            if (tc1Var.E) {
                String str = tL_theme.title;
                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(tc1Var.getParentActivity(), 3, null);
                tc1Var.r = b2Var;
                b2Var.setOnCancelListener(new qc1());
                tc1Var.r.show();
                String obj = tc1Var.b.getText().toString();
                tL_theme.title = obj;
                f6Var.a = obj;
                f6Var.B.slug = tc1Var.a.getText().toString();
                org.telegram.ui.ActionBar.g6.r1(f6Var, true, true, true);
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
            tc1Var.r = new org.telegram.ui.ActionBar.b2(tc1Var.getParentActivity(), 3, null);
            TL_account.updateTheme updatetheme = new TL_account.updateTheme();
            TLRPC.TL_inputTheme tL_inputTheme = new TLRPC.TL_inputTheme();
            tL_inputTheme.id = tL_theme.id;
            tL_inputTheme.access_hash = tL_theme.access_hash;
            updatetheme.theme = tL_inputTheme;
            updatetheme.format = "android";
            updatetheme.slug = obj2;
            int i10 = updatetheme.flags;
            updatetheme.title = obj3;
            updatetheme.flags = i10 | 3;
            int sendRequest = ConnectionsManager.getInstance(tc1Var.currentAccount).sendRequest(updatetheme, new rc1(0, tc1Var, updatetheme), 2);
            ConnectionsManager.getInstance(tc1Var.currentAccount).bindRequestToGuid(sendRequest, tc1Var.classGuid);
            tc1Var.r.setOnCancelListener(new hh.x(tc1Var, sendRequest, 9));
            tc1Var.r.show();
        }
    }

    public final boolean Z(String str, boolean z10) {
        String str2;
        m21 m21Var = this.B;
        if (m21Var != null) {
            AndroidUtilities.cancelRunOnUIThread(m21Var);
            this.B = null;
            this.A = null;
            if (this.y != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.y, true);
            }
        }
        if (str != null) {
            if (str.startsWith("_") || str.endsWith("_")) {
                a0(org.telegram.ui.ActionBar.g6.p7, LocaleController.getString(R.string.SetUrlInvalid));
                return false;
            }
            for (int i10 = 0; i10 < str.length(); i10++) {
                char charAt = str.charAt(i10);
                if (i10 == 0 && charAt >= '0' && charAt <= '9') {
                    if (z10) {
                        org.telegram.ui.Components.y4.u0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalidStartNumber), null);
                        return false;
                    }
                    a0(org.telegram.ui.ActionBar.g6.p7, LocaleController.getString(R.string.SetUrlInvalidStartNumber));
                    return false;
                }
                if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                    if (z10) {
                        org.telegram.ui.Components.y4.u0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalid), null);
                        return false;
                    }
                    a0(org.telegram.ui.ActionBar.g6.p7, LocaleController.getString(R.string.SetUrlInvalid));
                    return false;
                }
            }
        }
        if (str == null || str.length() < 5) {
            if (z10) {
                org.telegram.ui.Components.y4.u0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalidShort), null);
                return false;
            }
            a0(org.telegram.ui.ActionBar.g6.p7, LocaleController.getString(R.string.SetUrlInvalidShort));
            return false;
        }
        if (str.length() > 64) {
            if (z10) {
                org.telegram.ui.Components.y4.u0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalidLong), null);
                return false;
            }
            a0(org.telegram.ui.ActionBar.g6.p7, LocaleController.getString(R.string.SetUrlInvalidLong));
            return false;
        }
        if (!z10) {
            TLRPC.TL_theme tL_theme = this.H;
            if (tL_theme == null || (str2 = tL_theme.slug) == null) {
                str2 = "";
            }
            if (str.equals(str2)) {
                a0(org.telegram.ui.ActionBar.g6.w6, LocaleController.formatString("SetUrlAvailable", R.string.SetUrlAvailable, str));
                return true;
            }
            a0(org.telegram.ui.ActionBar.g6.F6, LocaleController.getString(R.string.SetUrlChecking));
            this.A = str;
            m21 m21Var2 = new m21(14, this, str);
            this.B = m21Var2;
            AndroidUtilities.runOnUIThread(m21Var2, 300L);
        }
        return true;
    }

    public final void a0(int i10, String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean z10 = this.E;
        if (isEmpty) {
            this.e.setVisibility(8);
            if (z10) {
                this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(getParentActivity(), R.drawable.greydivider, org.telegram.ui.ActionBar.g6.b7));
                return;
            } else {
                this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.b7));
                return;
            }
        }
        this.e.setVisibility(0);
        this.e.setText(str);
        this.e.setTag(Integer.valueOf(i10));
        this.e.setTextColorByKey(i10);
        if (z10) {
            this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(getParentActivity(), R.drawable.greydivider_top, org.telegram.ui.ActionBar.g6.b7));
        } else {
            this.d.setBackgroundDrawable(null);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        final int i10 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        boolean z10 = this.E;
        if (z10) {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewThemeTitle));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditThemeTitle));
        }
        this.actionBar.setActionBarMenuOnItemClick(new pb0(this, 29));
        this.c = this.actionBar.n().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        LinearLayout linearLayout = new LinearLayout(context);
        this.fragmentView = linearLayout;
        final int i11 = 0;
        linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.a7, false));
        LinearLayout linearLayout2 = (LinearLayout) this.fragmentView;
        linearLayout2.setOrientation(1);
        this.fragmentView.setOnTouchListener(new kh.e(2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.x = linearLayout3;
        linearLayout3.setOrientation(1);
        this.x.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
        linearLayout2.addView(this.x, h7.z5.n(-1, -2));
        org.telegram.ui.Cells.j4 j4Var = new org.telegram.ui.Cells.j4(context, 23);
        this.v = j4Var;
        j4Var.setText(LocaleController.getString(R.string.Info));
        this.x.addView(this.v);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.b = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.b;
        int i12 = org.telegram.ui.ActionBar.g6.H6;
        editTextBoldCursor2.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        EditTextBoldCursor editTextBoldCursor3 = this.b;
        int i13 = org.telegram.ui.ActionBar.g6.G6;
        editTextBoldCursor3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
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
        this.b.setCursorColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
        this.b.setCursorSize(AndroidUtilities.dp(20.0f));
        this.b.setCursorWidth(1.5f);
        this.x.addView(this.b, h7.z5.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        this.b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.oc1
            public final /* synthetic */ tc1 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i14, KeyEvent keyEvent) {
                org.telegram.ui.ActionBar.v0 v0Var;
                switch (i11) {
                    case 0:
                        tc1 tc1Var = this.b;
                        if (i14 == 6) {
                            AndroidUtilities.hideKeyboard(tc1Var.b);
                            return true;
                        }
                        tc1Var.getClass();
                        return false;
                    default:
                        if (i14 != 6 || (v0Var = this.b.c) == null) {
                            return false;
                        }
                        v0Var.performClick();
                        return true;
                }
            }
        });
        org.telegram.ui.Components.zm zmVar = new org.telegram.ui.Components.zm(context, 26);
        this.s = zmVar;
        this.x.addView(zmVar, new LinearLayout.LayoutParams(-1, 1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(0);
        this.x.addView(linearLayout4, h7.z5.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        EditTextBoldCursor editTextBoldCursor4 = new EditTextBoldCursor(context);
        this.w = editTextBoldCursor4;
        editTextBoldCursor4.setText(getMessagesController().linkPrefix + "/addtheme/");
        this.w.setTextSize(1, 18.0f);
        this.w.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        this.w.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
        this.w.setMaxLines(1);
        this.w.setLines(1);
        this.w.setEnabled(false);
        this.w.setBackgroundDrawable(null);
        this.w.setPadding(0, 0, 0, 0);
        this.w.setSingleLine(true);
        this.w.setInputType(163840);
        this.w.setImeOptions(6);
        linearLayout4.addView(this.w, h7.z5.n(-2, 50));
        EditTextBoldCursor editTextBoldCursor5 = new EditTextBoldCursor(context);
        this.a = editTextBoldCursor5;
        editTextBoldCursor5.setTextSize(1, 18.0f);
        this.a.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        this.a.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
        this.a.setMaxLines(1);
        this.a.setLines(1);
        this.a.setBackgroundDrawable(null);
        this.a.setPadding(0, 0, 0, 0);
        this.a.setSingleLine(true);
        this.a.setInputType(163872);
        this.a.setImeOptions(6);
        this.a.setHint(LocaleController.getString(R.string.SetUrlPlaceholder));
        this.a.setCursorColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
        this.a.setCursorSize(AndroidUtilities.dp(20.0f));
        this.a.setCursorWidth(1.5f);
        linearLayout4.addView(this.a, h7.z5.n(-1, 50));
        this.a.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.oc1
            public final /* synthetic */ tc1 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i14, KeyEvent keyEvent) {
                org.telegram.ui.ActionBar.v0 v0Var;
                switch (i10) {
                    case 0:
                        tc1 tc1Var = this.b;
                        if (i14 == 6) {
                            AndroidUtilities.hideKeyboard(tc1Var.b);
                            return true;
                        }
                        tc1Var.getClass();
                        return false;
                    default:
                        if (i14 != 6 || (v0Var = this.b.c) == null) {
                            return false;
                        }
                        v0Var.performClick();
                        return true;
                }
            }
        });
        this.a.addTextChangedListener(new sc1(this));
        if (z10) {
            this.a.setOnFocusChangeListener(new ld(this, 11));
        }
        org.telegram.ui.Cells.x8 x8Var = new org.telegram.ui.Cells.x8(context);
        this.e = x8Var;
        int i14 = R.drawable.greydivider_bottom;
        int i15 = org.telegram.ui.ActionBar.g6.b7;
        x8Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, i14, i15));
        this.e.setVisibility(8);
        this.e.setBottomPadding(0);
        linearLayout2.addView(this.e, h7.z5.n(-1, -2));
        org.telegram.ui.Cells.x8 x8Var2 = new org.telegram.ui.Cells.x8(context);
        this.d = x8Var2;
        x8Var2.getTextView().setMovementMethod(new org.telegram.ui.Components.av(2));
        this.d.getTextView().setHighlightColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.K6, false));
        if (z10) {
            this.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp)));
        } else {
            org.telegram.ui.Cells.x8 x8Var3 = this.d;
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeSetUrlHelp));
            this.D = replaceTags;
            x8Var3.setText(replaceTags);
        }
        linearLayout2.addView(this.d, h7.z5.n(-1, -2));
        if (z10) {
            this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider, i15));
            org.telegram.ui.Cells.ba baVar = new org.telegram.ui.Cells.ba(context, this.parentLayout, 1);
            this.f = baVar;
            linearLayout2.addView(baVar, h7.z5.n(-1, -2));
            org.telegram.ui.Cells.x9 x9Var = new org.telegram.ui.Cells.x9(context);
            this.h = x9Var;
            x9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(true));
            this.h.b(LocaleController.getString(R.string.UseDifferentTheme), false);
            linearLayout2.addView(this.h, h7.z5.n(-1, -2));
            this.h.setOnClickListener(new u70(27, this, context));
            org.telegram.ui.Cells.x8 x8Var4 = new org.telegram.ui.Cells.x8(context);
            this.n = x8Var4;
            x8Var4.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.UseDifferentThemeInfo)));
            this.n.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider_bottom, i15));
            linearLayout2.addView(this.n, h7.z5.n(-1, -2));
        } else {
            this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider_bottom, i15));
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
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.ActionBar.b2 b2Var;
        org.telegram.ui.ActionBar.b2 b2Var2;
        int i12 = NotificationCenter.themeUploadedToServer;
        org.telegram.ui.ActionBar.e6 e6Var = this.G;
        org.telegram.ui.ActionBar.f6 f6Var = this.F;
        if (i10 == i12) {
            org.telegram.ui.ActionBar.f6 f6Var2 = (org.telegram.ui.ActionBar.f6) objArr[0];
            org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) objArr[1];
            if (f6Var2 == f6Var && e6Var2 == e6Var && (b2Var2 = this.r) != null) {
                try {
                    b2Var2.dismiss();
                    this.r = null;
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
                org.telegram.ui.ActionBar.g6.t(f6Var, true, false);
                finishFragment();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.themeUploadError) {
            org.telegram.ui.ActionBar.f6 f6Var3 = (org.telegram.ui.ActionBar.f6) objArr[0];
            org.telegram.ui.ActionBar.e6 e6Var3 = (org.telegram.ui.ActionBar.e6) objArr[1];
            if (f6Var3 == f6Var && e6Var3 == e6Var && (b2Var = this.r) != null) {
                try {
                    b2Var.dismiss();
                    this.r = null;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.a7));
        LinearLayout linearLayout = this.x;
        int i10 = org.telegram.ui.ActionBar.g6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(linearLayout, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.L6));
        int i11 = org.telegram.ui.ActionBar.g6.b7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.n, 32, new Class[]{org.telegram.ui.Cells.x8.class}, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.g6.B6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.n, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 32, new Class[]{org.telegram.ui.Cells.x8.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.e, 32, new Class[]{org.telegram.ui.Cells.x8.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.e, 262144, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.p7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.e, 262144, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.F6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.e, 262144, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.w6));
        int i13 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 0, new Class[]{org.telegram.ui.Cells.x9.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, TLObject.FLAG_28, null, null, null, null, org.telegram.ui.ActionBar.g6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, TLObject.FLAG_28, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.a, 4, null, null, null, null, i13));
        EditTextBoldCursor editTextBoldCursor = this.a;
        int i14 = org.telegram.ui.ActionBar.g6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(editTextBoldCursor, TLObject.FLAG_23, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.a, 32, null, null, null, null, org.telegram.ui.ActionBar.g6.k6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.a, 65568, null, null, null, null, org.telegram.ui.ActionBar.g6.l6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.a, 4, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.a, TLObject.FLAG_23, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.a, 16777216, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 4, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, TLObject.FLAG_23, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 16777216, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.w, 4, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.w, TLObject.FLAG_23, null, null, null, null, i14));
        org.telegram.ui.Components.zm zmVar = this.s;
        Paint paint = org.telegram.ui.ActionBar.g6.k0;
        int i15 = org.telegram.ui.ActionBar.g6.d7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(zmVar, 0, null, paint, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.s, 1, null, org.telegram.ui.ActionBar.g6.k0, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.m3, org.telegram.ui.ActionBar.g6.q3}, null, org.telegram.ui.ActionBar.g6.ra));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.n3, org.telegram.ui.ActionBar.g6.r3}, null, org.telegram.ui.ActionBar.g6.dc));
        org.telegram.ui.Cells.ba baVar = this.f;
        Drawable[] drawableArr = org.telegram.ui.ActionBar.g6.m3.y;
        int i16 = org.telegram.ui.ActionBar.g6.ta;
        arrayList.add(new org.telegram.ui.ActionBar.i6(baVar, 0, null, null, drawableArr, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f, 0, null, null, org.telegram.ui.ActionBar.g6.q3.y, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.o3, org.telegram.ui.ActionBar.g6.s3}, null, org.telegram.ui.ActionBar.g6.Aa));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.o3, org.telegram.ui.ActionBar.g6.s3}, null, org.telegram.ui.ActionBar.g6.Da));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.o3, org.telegram.ui.ActionBar.g6.s3}, null, org.telegram.ui.ActionBar.g6.Ea));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.o3, org.telegram.ui.ActionBar.g6.s3}, null, org.telegram.ui.ActionBar.g6.Fa));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.p3, org.telegram.ui.ActionBar.g6.t3}, null, org.telegram.ui.ActionBar.g6.Ba));
        org.telegram.ui.Cells.ba baVar2 = this.f;
        Drawable[] drawableArr2 = org.telegram.ui.ActionBar.g6.o3.y;
        int i17 = org.telegram.ui.ActionBar.g6.Ca;
        arrayList.add(new org.telegram.ui.ActionBar.i6(baVar2, 0, null, null, drawableArr2, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f, 0, null, null, org.telegram.ui.ActionBar.g6.s3.y, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.ec));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.fc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.y3}, null, org.telegram.ui.ActionBar.g6.Ja));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.z3}, null, org.telegram.ui.ActionBar.g6.Ka));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.A3, org.telegram.ui.ActionBar.g6.C3}, null, org.telegram.ui.ActionBar.g6.La));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.B3, org.telegram.ui.ActionBar.g6.D3}, null, org.telegram.ui.ActionBar.g6.Ma));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.F3, org.telegram.ui.ActionBar.g6.G3}, null, org.telegram.ui.ActionBar.g6.sc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Uc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.ab));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.cb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Yc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.db));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.ad));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.fb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.nd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.sb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.od));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.nb));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.themeUploadedToServer);
        getNotificationCenter().addObserver(this, NotificationCenter.themeUploadError);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.themeUploadedToServer);
        getNotificationCenter().removeObserver(this, NotificationCenter.themeUploadError);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        if (!MessagesController.getGlobalMainSettings().getBoolean("view_animations", true) && this.E) {
            this.a.requestFocus();
            AndroidUtilities.showKeyboard(this.a);
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 || this.E) {
            return;
        }
        this.a.requestFocus();
        AndroidUtilities.showKeyboard(this.a);
    }
}
