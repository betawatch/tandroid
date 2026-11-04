package org.telegram.ui;

import android.app.Activity;
import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class zq0 implements org.telegram.ui.Components.fx {
    public final /* synthetic */ fr0 a;

    public zq0(fr0 fr0Var) {
        this.a = fr0Var;
    }

    @Override // org.telegram.ui.Components.fx
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.Components.fx
    public final /* synthetic */ long a() {
        return 0L;
    }

    @Override // org.telegram.ui.Components.fx
    public final /* synthetic */ boolean b() {
        return false;
    }

    @Override // org.telegram.ui.Components.fx
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Components.fx
    public final /* synthetic */ int f() {
        return 0;
    }

    @Override // org.telegram.ui.Components.fx
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // org.telegram.ui.Components.fx
    public final void i(int i3) {
        boolean z10 = i3 != 0;
        fr0 fr0Var = this.a;
        fr0Var.C0 = z10;
        fr0Var.e.requestLayout();
    }

    @Override // org.telegram.ui.Components.fx
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Components.fx
    public final boolean k() {
        EditTextBoldCursor editField = this.a.c0.getEditField();
        if (editField == null) {
            return false;
        }
        editField.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // org.telegram.ui.Components.fx
    public final void l(String str) {
        EditTextBoldCursor editField = this.a.c0.getEditField();
        if (editField == null) {
            return;
        }
        int selectionEnd = editField.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            CharSequence m10 = org.telegram.messenger.i6.m(str, editField.getPaint().getFontMetricsInt(), false, null, 0);
            editField.setText(editField.getText().insert(selectionEnd, m10));
            int length = selectionEnd + m10.length();
            editField.setSelection(length, length);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.Components.fx
    public final void n() {
        org.telegram.ui.ActionBar.e6 e6Var;
        fr0 fr0Var = this.a;
        Activity parentActivity = fr0Var.getParentActivity();
        e6Var = ((org.telegram.ui.ActionBar.d2) fr0Var).resourceProvider;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, parentActivity, e6Var);
        String M0 = org.telegram.messenger.bd.M0(2131752068, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.S = M0;
        s1Var.U = org.telegram.messenger.bd.M0(2131752069, null);
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131752099, null), new ci0(this, 5));
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
        alertDialog$Builder.p();
    }

    @Override // org.telegram.ui.Components.fx
    public final /* synthetic */ float p() {
        return 0.0f;
    }

    @Override // org.telegram.ui.Components.fx
    public final void x(long j10, TLRPC.Document document, String str, boolean z10) {
        fr0 fr0Var = this.a;
        EditTextBoldCursor editField = fr0Var.c0.getEditField();
        if (editField == null) {
            return;
        }
        int selectionEnd = editField.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            SpannableString spannableString = new SpannableString(str);
            org.telegram.ui.Components.p5 p5Var = document != null ? new org.telegram.ui.Components.p5(document, editField.getPaint().getFontMetricsInt()) : new org.telegram.ui.Components.p5(j10, editField.getPaint().getFontMetricsInt());
            p5Var.cacheType = fr0Var.S.c;
            spannableString.setSpan(p5Var, 0, spannableString.length(), 33);
            editField.setText(editField.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            editField.setSelection(length, length);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.Components.fx
    public final boolean z() {
        return this.a.C0;
    }

    @Override // org.telegram.ui.Components.fx
    public final /* synthetic */ void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.fx
    public final /* synthetic */ void o(org.telegram.ui.Components.n31 n31Var) {
    }

    @Override // org.telegram.ui.Components.fx
    public final /* synthetic */ void r(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.fx
    public final /* synthetic */ void s(int i3) {
    }

    @Override // org.telegram.ui.Components.fx
    public final /* synthetic */ void t(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.fx
    public final /* synthetic */ void y(long j10) {
    }

    @Override // org.telegram.ui.Components.fx
    public final /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.Components.fx
    public final /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.Components.fx
    public final /* synthetic */ void w() {
    }

    @Override // org.telegram.ui.Components.fx
    public final /* synthetic */ void e(Object obj, Object obj2) {
    }

    @Override // org.telegram.ui.Components.fx
    public final /* synthetic */ void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.Components.fx
    public final /* synthetic */ void m(View view, TLRPC.Document document, String str, Object obj, org.telegram.messenger.vi viVar, boolean z10, int i3) {
    }

    @Override // org.telegram.ui.Components.fx
    public final /* synthetic */ void v(View view, Object obj, String str, Object obj2, boolean z10, int i3, int i10) {
    }
}
