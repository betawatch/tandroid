package ug;

import android.text.SpannableString;
import android.text.Spanned;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.f6;
import org.telegram.messenger.i6;
import org.telegram.messenger.vi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.Components.fx;
import org.telegram.ui.Components.n31;
import org.telegram.ui.Components.p5;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class z implements fx {
    public final /* synthetic */ f0 a;

    public z(f0 f0Var) {
        this.a = f0Var;
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
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Components.fx
    public final boolean k() {
        b editText = ((l2) this.a.C0).getEditText();
        if (editText == null || editText.length() == 0) {
            return false;
        }
        editText.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // org.telegram.ui.Components.fx
    public final void l(String str) {
        l2 l2Var;
        b editText;
        f6[] f6VarArr;
        j jVar = this.a.C0;
        if ((jVar instanceof l2) && (editText = (l2Var = (l2) jVar).getEditText()) != null) {
            int selectionEnd = editText.getSelectionEnd();
            if (selectionEnd < 0) {
                selectionEnd = 0;
            }
            try {
                CharSequence m10 = i6.m(str, l2Var.getFontMetricsInt(), false, null, 0);
                if ((m10 instanceof Spanned) && (f6VarArr = (f6[]) ((Spanned) m10).getSpans(0, m10.length(), f6.class)) != null) {
                    for (f6 f6Var : f6VarArr) {
                        f6Var.b = 0.85f;
                    }
                }
                editText.setText(editText.getText().insert(selectionEnd, m10));
                int length = selectionEnd + m10.length();
                editText.setSelection(length, length);
            } catch (Exception e10) {
                a8.g(e10, true);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.telegram.ui.Components.fx
    public final void n() {
        f0 f0Var = this.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, f0Var.getContext(), f0Var.A1);
        String M0 = bd.M0(2131752068, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.S = M0;
        s1Var.U = bd.M0(2131752069, null);
        alertDialog$Builder.k(bd.M0(2131752099, null), new e3(this, 20));
        alertDialog$Builder.h(bd.M0(2131752589, null), null);
        alertDialog$Builder.p();
    }

    @Override // org.telegram.ui.Components.fx
    public final /* synthetic */ float p() {
        return 0.0f;
    }

    @Override // org.telegram.ui.Components.fx
    public final void x(long j10, TLRPC.Document document, String str, boolean z10) {
        b editText = ((l2) this.a.C0).getEditText();
        if (editText == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(document != null ? new p5(document, editText.getPaint().getFontMetricsInt()) : new p5(j10, editText.getPaint().getFontMetricsInt()), 0, spannableString.length(), 33);
            editText.setText(editText.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            editText.setSelection(length, length);
        } catch (Exception e10) {
            a8.g(e10, true);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // org.telegram.ui.Components.fx
    public final /* synthetic */ boolean z() {
        return false;
    }

    @Override // org.telegram.ui.Components.fx
    public final /* synthetic */ void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.fx
    public final /* synthetic */ void i(int i3) {
    }

    @Override // org.telegram.ui.Components.fx
    public final /* synthetic */ void o(n31 n31Var) {
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
    public final void q() {
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
    public final /* synthetic */ void m(View view, TLRPC.Document document, String str, Object obj, vi viVar, boolean z10, int i3) {
    }

    @Override // org.telegram.ui.Components.fx
    public final /* synthetic */ void v(View view, Object obj, String str, Object obj2, boolean z10, int i3, int i10) {
    }
}
