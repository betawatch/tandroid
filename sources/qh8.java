// default package

import android.app.Activity;
import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class qh8 implements p14 {
    public final /* synthetic */ wh8 a;

    public qh8(wh8 wh8Var) {
        this.a = wh8Var;
    }

    @Override // p14
    public final boolean A() {
        return false;
    }

    @Override // p14
    public final long a() {
        return 0L;
    }

    @Override // p14
    public final boolean b() {
        return false;
    }

    @Override // p14
    public final boolean c() {
        return false;
    }

    @Override // p14
    public final int f() {
        return 0;
    }

    @Override // p14
    public final boolean h() {
        return false;
    }

    @Override // p14
    public final void j(int i) {
        boolean z = i != 0;
        wh8 wh8Var = this.a;
        wh8Var.C0 = z;
        wh8Var.e.requestLayout();
    }

    @Override // p14
    public final boolean k() {
        return false;
    }

    @Override // p14
    public final boolean l() {
        EditTextBoldCursor editField = this.a.c0.getEditField();
        if (editField == null) {
            return false;
        }
        editField.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // p14
    public final void m(String str) {
        EditTextBoldCursor editField = this.a.c0.getEditField();
        if (editField == null) {
            return;
        }
        int selectionEnd = editField.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            CharSequence m = pv3.m(str, editField.getPaint().getFontMetricsInt(), false, null, 0);
            editField.setText(editField.getText().insert(selectionEnd, m));
            int length = selectionEnd + m.length();
            editField.setSelection(length, length);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // p14
    public final void n() {
        vnb vnbVar;
        wh8 wh8Var = this.a;
        Activity parentActivity = wh8Var.getParentActivity();
        vnbVar = ((e) wh8Var).resourceProvider;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, parentActivity);
        String M0 = ob6.M0(2131752033, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        idVar.U = ob6.M0(2131752034, null);
        alertDialog$Builder.j(ob6.M0(2131752064, null), new jz7(this, (byte) 10));
        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
        alertDialog$Builder.o();
    }

    @Override // p14
    public final float o() {
        return 0.0f;
    }

    @Override // p14
    public final void w(long j, TLRPC.Document document, String str, boolean z) {
        wh8 wh8Var = this.a;
        EditTextBoldCursor editField = wh8Var.c0.getEditField();
        if (editField == null) {
            return;
        }
        int selectionEnd = editField.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            SpannableString spannableString = new SpannableString(str);
            hm hmVar = document != null ? new hm(document, editField.getPaint().getFontMetricsInt()) : new hm(j, editField.getPaint().getFontMetricsInt());
            hmVar.cacheType = wh8Var.S.c;
            spannableString.setSpan(hmVar, 0, spannableString.length(), 33);
            editField.setText(editField.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            editField.setSelection(length, length);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // p14
    public final boolean z() {
        return this.a.C0;
    }

    @Override // p14
    public final void p() {
    }

    @Override // p14
    public final void t() {
    }

    @Override // p14
    public final void v() {
    }

    @Override // p14
    public final void g(d6c d6cVar) {
    }

    @Override // p14
    public final void i(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // p14
    public final void q(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // p14
    public final void r(int i) {
    }

    @Override // p14
    public final void s(ArrayList arrayList) {
    }

    @Override // p14
    public final void y(long j) {
    }

    @Override // p14
    public final void e(Object obj, Object obj2) {
    }

    @Override // p14
    public final void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z) {
    }

    @Override // p14
    public final void u(View view, Object obj, String str, Object obj2, boolean z, int i, int i2) {
    }

    @Override // p14
    public final void x(View view, TLRPC.Document document, String str, Object obj, n47 n47Var, boolean z, int i) {
    }
}
