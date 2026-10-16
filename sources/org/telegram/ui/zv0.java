package org.telegram.ui;

import android.app.Activity;
import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class zv0 implements org.telegram.ui.Components.wy {
    public final /* synthetic */ fw0 a;

    public zv0(fw0 fw0Var) {
        this.a = fw0Var;
    }

    @Override // org.telegram.ui.Components.wy
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.Components.wy
    public final /* synthetic */ long a() {
        return 0L;
    }

    @Override // org.telegram.ui.Components.wy
    public final /* synthetic */ boolean b() {
        return false;
    }

    @Override // org.telegram.ui.Components.wy
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Components.wy
    public final /* synthetic */ int f() {
        return 0;
    }

    @Override // org.telegram.ui.Components.wy
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // org.telegram.ui.Components.wy
    public final void i(int i10) {
        boolean z10 = i10 != 0;
        fw0 fw0Var = this.a;
        fw0Var.B0 = z10;
        fw0Var.e.requestLayout();
    }

    @Override // org.telegram.ui.Components.wy
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Components.wy
    public final boolean k() {
        EditTextBoldCursor editField = this.a.b0.getEditField();
        if (editField == null) {
            return false;
        }
        editField.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // org.telegram.ui.Components.wy
    public final void l(String str) {
        EditTextBoldCursor editField = this.a.b0.getEditField();
        if (editField == null) {
            return;
        }
        int selectionEnd = editField.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            CharSequence replaceEmoji = Emoji.replaceEmoji(str, editField.getPaint().getFontMetricsInt(), false);
            editField.setText(editField.getText().insert(selectionEnd, replaceEmoji));
            int length = selectionEnd + replaceEmoji.length();
            editField.setSelection(length, length);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.Components.wy
    public final void n() {
        org.telegram.ui.ActionBar.c6 c6Var;
        fw0 fw0Var = this.a;
        Activity parentActivity = fw0Var.getParentActivity();
        c6Var = ((org.telegram.ui.ActionBar.m2) fw0Var).resourceProvider;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity, 0, c6Var);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.ClearRecentEmojiTitle);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.ClearRecentEmojiText);
        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new lq0(this, 4));
        i2.d.r(R.string.Cancel, alertDialog$Builder, null);
    }

    @Override // org.telegram.ui.Components.wy
    public final /* synthetic */ float p() {
        return 0.0f;
    }

    @Override // org.telegram.ui.Components.wy
    public final void x(long j10, TLRPC.Document document, String str, boolean z10) {
        fw0 fw0Var = this.a;
        EditTextBoldCursor editField = fw0Var.b0.getEditField();
        if (editField == null) {
            return;
        }
        int selectionEnd = editField.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            SpannableString spannableString = new SpannableString(str);
            org.telegram.ui.Components.b6 b6Var = document != null ? new org.telegram.ui.Components.b6(document, editField.getPaint().getFontMetricsInt()) : new org.telegram.ui.Components.b6(j10, editField.getPaint().getFontMetricsInt());
            b6Var.cacheType = fw0Var.R.c;
            spannableString.setSpan(b6Var, 0, spannableString.length(), 33);
            editField.setText(editField.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            editField.setSelection(length, length);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.Components.wy
    public final boolean z() {
        return this.a.B0;
    }

    @Override // org.telegram.ui.Components.wy
    public final /* synthetic */ void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.wy
    public final /* synthetic */ void o(org.telegram.ui.Components.i61 i61Var) {
    }

    @Override // org.telegram.ui.Components.wy
    public final /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.Components.wy
    public final /* synthetic */ void r(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.wy
    public final /* synthetic */ void s(int i10) {
    }

    @Override // org.telegram.ui.Components.wy
    public final /* synthetic */ void t(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.wy
    public final /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.Components.wy
    public final /* synthetic */ void w() {
    }

    @Override // org.telegram.ui.Components.wy
    public final /* synthetic */ void y(long j10) {
    }

    @Override // org.telegram.ui.Components.wy
    public final /* synthetic */ void e(Object obj, Object obj2) {
    }

    @Override // org.telegram.ui.Components.wy
    public final /* synthetic */ void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.Components.wy
    public final /* synthetic */ void m(View view, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10) {
    }

    @Override // org.telegram.ui.Components.wy
    public final /* synthetic */ void v(View view, Object obj, String str, Object obj2, boolean z10, int i10, int i11) {
    }
}
