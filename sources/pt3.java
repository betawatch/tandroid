// default package

import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class pt3 implements u04 {
    public final /* synthetic */ rt3 a;

    public pt3(rt3 rt3Var) {
        this.a = rt3Var;
    }

    @Override // u04
    public final boolean A() {
        return false;
    }

    @Override // u04
    public final long a() {
        return 0L;
    }

    @Override // u04
    public final boolean b() {
        return false;
    }

    @Override // u04
    public final boolean c() {
        return false;
    }

    @Override // u04
    public final int f() {
        return 0;
    }

    @Override // u04
    public final boolean h() {
        return false;
    }

    @Override // u04
    public final void j(int i) {
        rt3 rt3Var = this.a;
        if (rt3Var.b()) {
            rt3Var.y = i != 0;
            rt3Var.y();
            cja cjaVar = rt3Var.f;
            if (cjaVar != null) {
                cjaVar.R();
            }
        }
    }

    @Override // u04
    public final boolean k() {
        return false;
    }

    @Override // u04
    public final boolean l() {
        mt3 mt3Var = this.a.a;
        if (mt3Var.length() == 0) {
            return false;
        }
        mt3Var.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // u04
    public final void m(String str) {
        mt3 mt3Var = this.a.a;
        int selectionEnd = mt3Var.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            CharSequence m = vu3.m(str, mt3Var.getPaint().getFontMetricsInt(), false, null, 0);
            mt3Var.setText(mt3Var.getText().insert(selectionEnd, m));
            int length = selectionEnd + m.length();
            mt3Var.setSelection(length, length);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // u04
    public final void n() {
        rt3 rt3Var = this.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, rt3Var.N, rt3Var.getContext());
        String M0 = k96.M0(2131752056, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        hdVar.U = k96.M0(2131752057, null);
        alertDialog$Builder.j(k96.M0(2131752087, null), new vu2(this, (byte) 27));
        alertDialog$Builder.g(k96.M0(2131752577, null), null);
        d dVar = rt3Var.h;
        if (dVar != null) {
            dVar.showDialog(hdVar);
        } else {
            alertDialog$Builder.o();
        }
    }

    @Override // u04
    public final float o() {
        return 0.0f;
    }

    @Override // u04
    public final void p() {
        d dVar = this.a.h;
        if (dVar == null) {
            new jh8((d) new hu0(this, (byte) 2), 11, false).show();
        } else {
            dVar.showDialog(new jh8(dVar, 11, false));
        }
    }

    @Override // u04
    public final void w(long j, TLRPC.Document document, String str, boolean z) {
        rt3 rt3Var = this.a;
        mt3 mt3Var = rt3Var.a;
        int selectionEnd = mt3Var.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            SpannableString spannableString = new SpannableString(str);
            gm gmVar = document != null ? new gm(document, mt3Var.getPaint().getFontMetricsInt()) : new gm(j, mt3Var.getPaint().getFontMetricsInt());
            gmVar.cacheType = rt3Var.d.c;
            spannableString.setSpan(gmVar, 0, spannableString.length(), 33);
            mt3Var.setText(mt3Var.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            mt3Var.setSelection(length, length);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // u04
    public final boolean z() {
        return this.a.y;
    }

    @Override // u04
    public final void t() {
    }

    @Override // u04
    public final void v() {
    }

    @Override // u04
    public final void g(d2c d2cVar) {
    }

    @Override // u04
    public final void i(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // u04
    public final void q(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // u04
    public final void r(int i) {
    }

    @Override // u04
    public final void s(ArrayList arrayList) {
    }

    @Override // u04
    public final void y(long j) {
    }

    @Override // u04
    public final void e(Object obj, Object obj2) {
    }

    @Override // u04
    public final void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z) {
    }

    @Override // u04
    public final void u(View view, Object obj, String str, Object obj2, boolean z, int i, int i2) {
    }

    @Override // u04
    public final void x(View view, TLRPC.Document document, String str, Object obj, g27 g27Var, boolean z, int i) {
    }
}
