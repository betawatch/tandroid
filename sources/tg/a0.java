package tg;

import android.text.SpannableString;
import android.text.Spanned;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.ej;
import org.telegram.messenger.f6;
import org.telegram.messenger.i6;
import org.telegram.messenger.id;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.m3;
import org.telegram.ui.Components.ix;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.u31;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class a0 implements ix {
    public final /* synthetic */ g0 a;

    public a0(g0 g0Var) {
        this.a = g0Var;
    }

    @Override // org.telegram.ui.Components.ix
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.Components.ix
    public final /* synthetic */ long a() {
        return 0L;
    }

    @Override // org.telegram.ui.Components.ix
    public final /* synthetic */ boolean b() {
        return false;
    }

    @Override // org.telegram.ui.Components.ix
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Components.ix
    public final /* synthetic */ int f() {
        return 0;
    }

    @Override // org.telegram.ui.Components.ix
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // org.telegram.ui.Components.ix
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Components.ix
    public final boolean k() {
        b editText = ((k2) this.a.B0).getEditText();
        if (editText == null || editText.length() == 0) {
            return false;
        }
        editText.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // org.telegram.ui.Components.ix
    public final void l(String str) {
        k2 k2Var;
        b editText;
        f6[] f6VarArr;
        j jVar = this.a.B0;
        if ((jVar instanceof k2) && (editText = (k2Var = (k2) jVar).getEditText()) != null) {
            int selectionEnd = editText.getSelectionEnd();
            if (selectionEnd < 0) {
                selectionEnd = 0;
            }
            try {
                CharSequence m10 = i6.m(str, k2Var.getFontMetricsInt(), false, null, 0);
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

    @Override // org.telegram.ui.Components.ix
    public final void n() {
        g0 g0Var = this.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, g0Var.getContext(), g0Var.z1);
        String M0 = id.M0(2131752068, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = M0;
        u1Var.T = id.M0(2131752069, null);
        alertDialog$Builder.k(id.M0(2131752099, null), new m3(this, 22));
        alertDialog$Builder.h(id.M0(2131752589, null), null);
        alertDialog$Builder.p();
    }

    @Override // org.telegram.ui.Components.ix
    public final /* synthetic */ float p() {
        return 0.0f;
    }

    @Override // org.telegram.ui.Components.ix
    public final void x(long j3, TLRPC.Document document, String str, boolean z9) {
        b editText = ((k2) this.a.B0).getEditText();
        if (editText == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(document != null ? new r5(document, editText.getPaint().getFontMetricsInt()) : new r5(j3, editText.getPaint().getFontMetricsInt()), 0, spannableString.length(), 33);
            editText.setText(editText.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            editText.setSelection(length, length);
        } catch (Exception e10) {
            a8.g(e10, true);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // org.telegram.ui.Components.ix
    public final /* synthetic */ boolean z() {
        return false;
    }

    @Override // org.telegram.ui.Components.ix
    public final /* synthetic */ void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.ix
    public final /* synthetic */ void i(int i7) {
    }

    @Override // org.telegram.ui.Components.ix
    public final /* synthetic */ void o(u31 u31Var) {
    }

    @Override // org.telegram.ui.Components.ix
    public final /* synthetic */ void r(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.ix
    public final /* synthetic */ void s(int i7) {
    }

    @Override // org.telegram.ui.Components.ix
    public final /* synthetic */ void t(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.ix
    public final /* synthetic */ void y(long j3) {
    }

    @Override // org.telegram.ui.Components.ix
    public final void q() {
    }

    @Override // org.telegram.ui.Components.ix
    public final /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.Components.ix
    public final /* synthetic */ void w() {
    }

    @Override // org.telegram.ui.Components.ix
    public final /* synthetic */ void e(Object obj, Object obj2) {
    }

    @Override // org.telegram.ui.Components.ix
    public final /* synthetic */ void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z9) {
    }

    @Override // org.telegram.ui.Components.ix
    public final /* synthetic */ void m(View view, TLRPC.Document document, String str, Object obj, ej ejVar, boolean z9, int i7) {
    }

    @Override // org.telegram.ui.Components.ix
    public final /* synthetic */ void v(View view, Object obj, String str, Object obj2, boolean z9, int i7, int i10) {
    }
}
