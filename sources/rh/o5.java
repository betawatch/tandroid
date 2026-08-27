package rh;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Components.b51;
import org.telegram.ui.ol0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class o5 implements c1 {
    public final /* synthetic */ t5 a;

    public o5(t5 t5Var) {
        this.a = t5Var;
    }

    @Override // rh.c1
    public final void B(int i10, int i11) {
        b2 b2Var;
        t5 t5Var = this.a;
        q5 q5Var = t5Var.y;
        if (q5Var == null || t5Var.x == null || (b2Var = ((y2) q5Var).a.F3) == null) {
            return;
        }
        b2Var.f(i10, i11);
    }

    @Override // rh.c1
    public final void K0() {
        a aVar;
        t5 t5Var = this.a;
        q5 q5Var = t5Var.y;
        if (q5Var == null || (aVar = t5Var.x) == null) {
            return;
        }
        p3.Q1(((y2) q5Var).a, aVar, true);
    }

    @Override // rh.c1
    public final void N1(d1 d1Var, int i10, int i11) {
        q5 q5Var;
        j9 textSelectionHelper;
        t5 t5Var = this.a;
        if (t5Var.B || i10 == i11 || (q5Var = t5Var.y) == null || (textSelectionHelper = ((y2) q5Var).a.getTextSelectionHelper()) == null) {
            return;
        }
        t5Var.post(new nh.j4(this, d1Var, i11, textSelectionHelper, i10, 7));
    }

    @Override // rh.c1
    public final boolean T1(boolean z10) {
        a aVar;
        t5 t5Var = this.a;
        q5 q5Var = t5Var.y;
        if (q5Var == null || (aVar = t5Var.x) == null) {
            return false;
        }
        return ((y2) q5Var).a.W3(aVar, z10);
    }

    @Override // rh.c1
    public final boolean f1(d1 d1Var) {
        a aVar;
        t5 t5Var = this.a;
        q5 q5Var = t5Var.y;
        if (q5Var == null || (aVar = t5Var.x) == null) {
            return false;
        }
        return p3.Q1(((y2) q5Var).a, aVar, false);
    }

    @Override // rh.c1
    public final void g(d1 d1Var) {
        q5 q5Var = this.a.y;
        if (q5Var != null) {
            p3 p3Var = ((y2) q5Var).a;
            p3.M1(p3Var, d1Var);
            p3Var.d3.n0(d1Var, true);
        }
    }

    @Override // rh.c1
    public final void g1(CharSequence charSequence) {
        q5 q5Var = this.a.y;
        if (q5Var != null) {
            y2 y2Var = (y2) q5Var;
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            y2Var.a.t4(charSequence.toString());
        }
    }

    @Override // rh.c1
    public final boolean n() {
        t5 t5Var = this.a;
        q5 q5Var = t5Var.y;
        if (q5Var == null || t5Var.x == null) {
            return false;
        }
        return ((y2) q5Var).a.S4();
    }

    @Override // rh.c1
    public final boolean o0(d1 d1Var) {
        a aVar;
        ClipData primaryClip;
        int indexOf;
        t5 t5Var = this.a;
        q5 q5Var = t5Var.y;
        if (q5Var != null && (aVar = t5Var.x) != null) {
            p3 p3Var = ((y2) q5Var).a;
            ClipboardManager clipboardManager = (ClipboardManager) p3Var.getContext().getSystemService("clipboard");
            if (clipboardManager != null && clipboardManager.hasPrimaryClip() && (primaryClip = clipboardManager.getPrimaryClip()) != null && primaryClip.getItemCount() != 0 && primaryClip.getDescription() != null && primaryClip.getDescription().hasMimeType("text/html")) {
                try {
                    String htmlText = primaryClip.getItemAt(0).getHtmlText();
                    if (!TextUtils.isEmpty(htmlText)) {
                        HashMap hashMap = new HashMap();
                        try {
                            ArrayList w42 = p3Var.w4(v3.z(htmlText, hashMap));
                            if (!w42.isEmpty() && ((w42.size() != 1 || !p3.F3((a) w42.get(0))) && (indexOf = p3Var.h3.indexOf(aVar)) >= 0)) {
                                int max = Math.max(0, Math.min(d1Var.getSelectionStart(), d1Var.getSelectionEnd()));
                                boolean I4 = p3Var.I4(indexOf, indexOf, max, Math.max(max, Math.max(d1Var.getSelectionStart(), d1Var.getSelectionEnd())), w42);
                                if (I4 && !hashMap.isEmpty()) {
                                    p3Var.i3.putAll(hashMap);
                                }
                                return I4;
                            }
                        } catch (Exception e9) {
                            FileLog.e(e9);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
        return false;
    }

    @Override // rh.c1
    public final void r1(Editable editable) {
        a aVar;
        t5 t5Var = this.a;
        if (t5Var.x == null) {
            return;
        }
        t5Var.E(editable);
        t5Var.J();
        t5.e(t5Var.x.b, editable);
        t5Var.C();
        t5Var.G();
        int i10 = 0;
        if (t5Var.o() && !t5Var.l()) {
            ((TL_iv.pageBlockBlockquote) t5Var.x.b).collapsed = false;
        }
        t5Var.H();
        q5 q5Var = t5Var.y;
        if (q5Var != null) {
            p3 p3Var = ((y2) q5Var).a;
            b2 b2Var = p3Var.F3;
            if (b2Var != null) {
                b2Var.g();
            }
            p3Var.d3.onContentChanged();
        }
        q5 q5Var2 = t5Var.y;
        if (q5Var2 != null) {
            ((y2) q5Var2).a.d3.a0(t5Var, t5.b(editable.toString()));
        }
        String obj = editable.toString();
        a aVar2 = t5Var.x;
        if (aVar2 != null && obj != null && aVar2.c == 0 && (aVar2.b instanceof TL_iv.pageBlockParagraph) && obj.equals("> ")) {
            i10 = 6;
        }
        if (i10 == 0 || t5Var.y == null) {
            s5 s10 = t5.s(editable.toString(), t5Var.x);
            if (s10 != null && t5Var.y != null) {
                t5Var.post(new qf.a(this, t5Var.x, s10, 11));
            }
        } else {
            t5Var.post(new ol0(this, t5Var.x, i10, 15));
        }
        if (t5Var.P || ((aVar = t5Var.x) != null && (aVar.b instanceof TL_iv.pageBlockPullquote))) {
            t5Var.invalidate();
        }
    }

    @Override // rh.c1
    public final void w1(d1 d1Var) {
        int length;
        Spanned spanned;
        boolean z10;
        int i10;
        d1 editText;
        Editable text;
        t5 t5Var = this.a;
        if (t5Var.y == null || t5Var.x == null) {
            return;
        }
        String obj = d1Var.getText().toString();
        ((y2) t5Var.y).a.d3.a0(t5Var, null);
        String b10 = t5.b(obj);
        if (b10 != null) {
            ArrayList a2 = k0.a(b10);
            if (!a2.isEmpty()) {
                t5Var.D((k0) a2.get(0));
                return;
            }
        }
        int q6 = t5.q(d1Var.getText().toString());
        if (q6 != 0) {
            ((y2) t5Var.y).c(t5Var.x, q6);
            return;
        }
        s5 r10 = t5.r(d1Var.getText().toString(), t5Var.x);
        if (r10 != null) {
            ((y2) t5Var.y).d(t5Var.x, r10.a, r10.b, r10.c, r10.d, r10.e);
            return;
        }
        if ((t5Var.x.b instanceof TL_iv.pageBlockPullquote) && t5Var.f.length() > 0) {
            t5Var.i();
            return;
        }
        q5 q5Var = t5Var.y;
        a aVar = t5Var.x;
        p3 p3Var = ((y2) q5Var).a;
        ArrayList arrayList = p3Var.l4;
        b51 b51Var = p3Var.U2;
        ArrayList arrayList2 = p3Var.h3;
        int indexOf = arrayList2.indexOf(aVar);
        if (indexOf < 0) {
            return;
        }
        b2 b2Var = p3Var.F3;
        if (b2Var != null) {
            b2Var.d();
        }
        View z12 = p3Var.z1(aVar);
        boolean z11 = z12 instanceof t5;
        if (z11) {
            d1 editText2 = ((t5) z12).getEditText();
            Spanned text2 = editText2.getText();
            length = editText2.getSelectionEnd();
            spanned = text2;
        } else {
            SpannableStringBuilder A = t5.A(aVar.b);
            length = A.length();
            spanned = A;
        }
        if (length < 0 || length > spanned.length()) {
            length = spanned.length();
        }
        if (spanned.length() == 0) {
            if (!aVar.k.isEmpty()) {
                ArrayList arrayList3 = aVar.k;
                arrayList3.remove(arrayList3.size() - 1);
                p3Var.s4();
                b51Var.N(false);
                b2 b2Var2 = p3Var.F3;
                if (b2Var2 != null) {
                    b2Var2.h();
                }
                p3Var.post(new i2(p3Var, aVar, 27));
                return;
            }
            if (aVar.c > 0) {
                p3Var.t2(indexOf);
                p3Var.s4();
                b51Var.N(false);
                b2 b2Var3 = p3Var.F3;
                if (b2Var3 != null) {
                    b2Var3.h();
                }
                p3Var.post(new i2(p3Var, aVar, 28));
                return;
            }
        }
        CharSequence subSequence = spanned.subSequence(0, length);
        CharSequence subSequence2 = spanned.subSequence(length, spanned.length());
        TL_iv.PageBlock pageBlock = aVar.b;
        ArrayList arrayList4 = aVar.k;
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            long a3 = m0.a();
            TL_iv.RichText richText = ((TL_iv.pageBlockBlockquote) aVar.b).caption;
            if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
                p3Var.i3.put(Long.valueOf(a3), richText);
            }
            arrayList4.add(Long.valueOf(a3));
            aVar.b = new TL_iv.pageBlockParagraph();
            z10 = true;
        } else {
            z10 = false;
        }
        t5.e(aVar.b, subSequence);
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        t5.e(pageblockparagraph, subSequence2);
        int i11 = aVar.d;
        if (i11 > 0) {
            i11++;
        }
        a aVar2 = new a(pageblockparagraph, aVar.c, i11);
        aVar2.e = aVar.e;
        aVar2.k.addAll(arrayList4);
        int i12 = indexOf + 1;
        arrayList2.add(i12, aVar2);
        p3Var.s4();
        if (z10) {
            b51Var.N(false);
            b2 b2Var4 = p3Var.F3;
            if (b2Var4 != null) {
                b2Var4.h();
            }
            p3Var.post(new i2(p3Var, aVar2, 29));
            return;
        }
        if (z11 && (text = (editText = ((t5) z12).getEditText()).getText()) != null && length >= 0 && length < text.length()) {
            editText.h = true;
            text.delete(length, text.length());
            editText.h = false;
        }
        b51Var.S();
        p3Var.p4(i12);
        int indexOf2 = arrayList.indexOf(aVar2);
        if (indexOf2 < 0) {
            b51Var.l();
        } else {
            f2.v0 itemAnimator = p3Var.getItemAnimator();
            p3Var.setItemAnimator(null);
            b51Var.o(indexOf2);
            if (aVar.d > 0 && (i10 = indexOf2 + 1) < arrayList.size()) {
                b51Var.q(i10, (arrayList.size() - indexOf2) - 1);
            }
            p3Var.post(new s2(p3Var, itemAnimator, 0));
        }
        b2 b2Var5 = p3Var.F3;
        if (b2Var5 != null) {
            b2Var5.h();
        }
        p3Var.post(new t2(p3Var, aVar2, 0));
    }
}
