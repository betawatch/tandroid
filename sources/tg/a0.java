package tg;

import android.text.SpannableString;
import android.text.Spanned;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.cj;
import org.telegram.messenger.g6;
import org.telegram.messenger.hd;
import org.telegram.messenger.j6;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.mx;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.x31;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class a0 implements mx {
    public final /* synthetic */ g0 a;

    public a0(g0 g0Var) {
        this.a = g0Var;
    }

    @Override // org.telegram.ui.Components.mx
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.Components.mx
    public final /* synthetic */ long a() {
        return 0L;
    }

    @Override // org.telegram.ui.Components.mx
    public final /* synthetic */ boolean b() {
        return false;
    }

    @Override // org.telegram.ui.Components.mx
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Components.mx
    public final /* synthetic */ int f() {
        return 0;
    }

    @Override // org.telegram.ui.Components.mx
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // org.telegram.ui.Components.mx
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Components.mx
    public final boolean k() {
        b editText = ((n2) this.a.C0).getEditText();
        if (editText == null || editText.length() == 0) {
            return false;
        }
        editText.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // org.telegram.ui.Components.mx
    public final void l(String str) {
        n2 n2Var;
        b editText;
        g6[] g6VarArr;
        j jVar = this.a.C0;
        if ((jVar instanceof n2) && (editText = (n2Var = (n2) jVar).getEditText()) != null) {
            int selectionEnd = editText.getSelectionEnd();
            if (selectionEnd < 0) {
                selectionEnd = 0;
            }
            try {
                CharSequence m10 = j6.m(str, n2Var.getFontMetricsInt(), false, null, 0);
                if ((m10 instanceof Spanned) && (g6VarArr = (g6[]) ((Spanned) m10).getSpans(0, m10.length(), g6.class)) != null) {
                    for (g6 g6Var : g6VarArr) {
                        g6Var.b = 0.85f;
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

    @Override // org.telegram.ui.Components.mx
    public final void n() {
        g0 g0Var = this.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, g0Var.getContext(), g0Var.A1);
        String M0 = hd.M0(2131752068, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = M0;
        t1Var.U = hd.M0(2131752069, null);
        alertDialog$Builder.k(hd.M0(2131752099, null), new org.telegram.ui.ActionBar.z(this, 27));
        alertDialog$Builder.h(hd.M0(2131752589, null), null);
        alertDialog$Builder.p();
    }

    @Override // org.telegram.ui.Components.mx
    public final /* synthetic */ float p() {
        return 0.0f;
    }

    @Override // org.telegram.ui.Components.mx
    public final void x(long j3, TLRPC.Document document, String str, boolean z10) {
        b editText = ((n2) this.a.C0).getEditText();
        if (editText == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(document != null ? new p5(document, editText.getPaint().getFontMetricsInt()) : new p5(j3, editText.getPaint().getFontMetricsInt()), 0, spannableString.length(), 33);
            editText.setText(editText.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            editText.setSelection(length, length);
        } catch (Exception e10) {
            a8.g(e10, true);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // org.telegram.ui.Components.mx
    public final /* synthetic */ boolean z() {
        return false;
    }

    @Override // org.telegram.ui.Components.mx
    public final /* synthetic */ void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.mx
    public final /* synthetic */ void i(int i7) {
    }

    @Override // org.telegram.ui.Components.mx
    public final /* synthetic */ void o(x31 x31Var) {
    }

    @Override // org.telegram.ui.Components.mx
    public final /* synthetic */ void r(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.mx
    public final /* synthetic */ void s(int i7) {
    }

    @Override // org.telegram.ui.Components.mx
    public final /* synthetic */ void t(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.mx
    public final /* synthetic */ void y(long j3) {
    }

    @Override // org.telegram.ui.Components.mx
    public final void q() {
    }

    @Override // org.telegram.ui.Components.mx
    public final /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.Components.mx
    public final /* synthetic */ void w() {
    }

    @Override // org.telegram.ui.Components.mx
    public final /* synthetic */ void e(Object obj, Object obj2) {
    }

    @Override // org.telegram.ui.Components.mx
    public final /* synthetic */ void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.Components.mx
    public final /* synthetic */ void m(View view, TLRPC.Document document, String str, Object obj, cj cjVar, boolean z10, int i7) {
    }

    @Override // org.telegram.ui.Components.mx
    public final /* synthetic */ void v(View view, Object obj, String str, Object obj2, boolean z10, int i7, int i10) {
    }
}
