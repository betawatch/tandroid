package vh;

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
import org.telegram.messenger.p6;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Components.w51;
import org.telegram.ui.zt0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class q5 implements c1 {
    public final /* synthetic */ v5 a;

    public q5(v5 v5Var) {
        this.a = v5Var;
    }

    @Override // vh.c1
    public final void D(CharSequence charSequence) {
        s5 s5Var = this.a.y;
        if (s5Var != null) {
            a3 a3Var = (a3) s5Var;
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            a3Var.a.t4(charSequence.toString());
        }
    }

    @Override // vh.c1
    public final boolean F(d1 d1Var) {
        a aVar;
        ClipData primaryClip;
        int indexOf;
        v5 v5Var = this.a;
        s5 s5Var = v5Var.y;
        if (s5Var != null && (aVar = v5Var.x) != null) {
            r3 r3Var = ((a3) s5Var).a;
            ClipboardManager clipboardManager = (ClipboardManager) r3Var.getContext().getSystemService("clipboard");
            if (clipboardManager != null && clipboardManager.hasPrimaryClip() && (primaryClip = clipboardManager.getPrimaryClip()) != null && primaryClip.getItemCount() != 0 && primaryClip.getDescription() != null && primaryClip.getDescription().hasMimeType("text/html")) {
                try {
                    String htmlText = primaryClip.getItemAt(0).getHtmlText();
                    if (!TextUtils.isEmpty(htmlText)) {
                        HashMap hashMap = new HashMap();
                        try {
                            ArrayList w42 = r3Var.w4(x3.z(htmlText, hashMap));
                            if (!w42.isEmpty() && ((w42.size() != 1 || !r3.F3((a) w42.get(0))) && (indexOf = r3Var.i3.indexOf(aVar)) >= 0)) {
                                int max = Math.max(0, Math.min(d1Var.getSelectionStart(), d1Var.getSelectionEnd()));
                                boolean I4 = r3Var.I4(indexOf, indexOf, max, Math.max(max, Math.max(d1Var.getSelectionStart(), d1Var.getSelectionEnd())), w42);
                                if (I4 && !hashMap.isEmpty()) {
                                    r3Var.j3.putAll(hashMap);
                                }
                                return I4;
                            }
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
        return false;
    }

    @Override // vh.c1
    public final void G(d1 d1Var) {
        int length;
        Spanned spanned;
        boolean z4;
        int i10;
        d1 editText;
        Editable text;
        v5 v5Var = this.a;
        if (v5Var.y == null || v5Var.x == null) {
            return;
        }
        String obj = d1Var.getText().toString();
        ((a3) v5Var.y).a.e3.s(v5Var, null);
        String b10 = v5.b(obj);
        if (b10 != null) {
            ArrayList a2 = k0.a(b10);
            if (!a2.isEmpty()) {
                v5Var.D((k0) a2.get(0));
                return;
            }
        }
        int q10 = v5.q(d1Var.getText().toString());
        if (q10 != 0) {
            ((a3) v5Var.y).c(v5Var.x, q10);
            return;
        }
        u5 r10 = v5.r(d1Var.getText().toString(), v5Var.x);
        if (r10 != null) {
            ((a3) v5Var.y).d(v5Var.x, r10.a, r10.b, r10.c, r10.d, r10.e);
            return;
        }
        if ((v5Var.x.b instanceof TL_iv.pageBlockPullquote) && v5Var.f.length() > 0) {
            v5Var.i();
            return;
        }
        s5 s5Var = v5Var.y;
        a aVar = v5Var.x;
        r3 r3Var = ((a3) s5Var).a;
        ArrayList arrayList = r3Var.m4;
        w51 w51Var = r3Var.V2;
        ArrayList arrayList2 = r3Var.i3;
        int indexOf = arrayList2.indexOf(aVar);
        if (indexOf < 0) {
            return;
        }
        c2 c2Var = r3Var.G3;
        if (c2Var != null) {
            c2Var.d();
        }
        View z12 = r3Var.z1(aVar);
        boolean z10 = z12 instanceof v5;
        if (z10) {
            d1 editText2 = ((v5) z12).getEditText();
            Spanned text2 = editText2.getText();
            length = editText2.getSelectionEnd();
            spanned = text2;
        } else {
            SpannableStringBuilder A = v5.A(aVar.b);
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
                r3Var.s4();
                w51Var.N(false);
                c2 c2Var2 = r3Var.G3;
                if (c2Var2 != null) {
                    c2Var2.h();
                }
                r3Var.post(new j2(r3Var, aVar, 27));
                return;
            }
            if (aVar.c > 0) {
                r3Var.t2(indexOf);
                r3Var.s4();
                w51Var.N(false);
                c2 c2Var3 = r3Var.G3;
                if (c2Var3 != null) {
                    c2Var3.h();
                }
                r3Var.post(new j2(r3Var, aVar, 28));
                return;
            }
        }
        CharSequence subSequence = spanned.subSequence(0, length);
        CharSequence subSequence2 = spanned.subSequence(length, spanned.length());
        TL_iv.PageBlock pageBlock = aVar.b;
        ArrayList arrayList4 = aVar.k;
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            long a10 = m0.a();
            TL_iv.RichText richText = ((TL_iv.pageBlockBlockquote) aVar.b).caption;
            if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
                r3Var.j3.put(Long.valueOf(a10), richText);
            }
            arrayList4.add(Long.valueOf(a10));
            aVar.b = new TL_iv.pageBlockParagraph();
            z4 = true;
        } else {
            z4 = false;
        }
        v5.d(aVar.b, subSequence);
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        v5.d(pageblockparagraph, subSequence2);
        int i11 = aVar.d;
        if (i11 > 0) {
            i11++;
        }
        a aVar2 = new a(pageblockparagraph, aVar.c, i11);
        aVar2.e = aVar.e;
        aVar2.k.addAll(arrayList4);
        int i12 = indexOf + 1;
        arrayList2.add(i12, aVar2);
        r3Var.s4();
        if (z4) {
            w51Var.N(false);
            c2 c2Var4 = r3Var.G3;
            if (c2Var4 != null) {
                c2Var4.h();
            }
            r3Var.post(new j2(r3Var, aVar2, 29));
            return;
        }
        if (z10 && (text = (editText = ((v5) z12).getEditText()).getText()) != null && length >= 0 && length < text.length()) {
            editText.h = true;
            text.delete(length, text.length());
            editText.h = false;
        }
        w51Var.S();
        r3Var.p4(i12);
        int indexOf2 = arrayList.indexOf(aVar2);
        if (indexOf2 < 0) {
            w51Var.l();
        } else {
            f2.t0 itemAnimator = r3Var.getItemAnimator();
            r3Var.setItemAnimator(null);
            w51Var.o(indexOf2);
            if (aVar.d > 0 && (i10 = indexOf2 + 1) < arrayList.size()) {
                w51Var.q(i10, (arrayList.size() - indexOf2) - 1);
            }
            r3Var.post(new t2(r3Var, itemAnimator, 0));
        }
        c2 c2Var5 = r3Var.G3;
        if (c2Var5 != null) {
            c2Var5.h();
        }
        r3Var.post(new u2(r3Var, aVar2, 0));
    }

    @Override // vh.c1
    public final void N(Editable editable) {
        a aVar;
        v5 v5Var = this.a;
        if (v5Var.x == null) {
            return;
        }
        v5Var.E(editable);
        v5Var.J();
        v5.d(v5Var.x.b, editable);
        v5Var.C();
        v5Var.G();
        int i10 = 0;
        if (v5Var.o() && !v5Var.l()) {
            ((TL_iv.pageBlockBlockquote) v5Var.x.b).collapsed = false;
        }
        v5Var.H();
        s5 s5Var = v5Var.y;
        if (s5Var != null) {
            r3 r3Var = ((a3) s5Var).a;
            c2 c2Var = r3Var.G3;
            if (c2Var != null) {
                c2Var.g();
            }
            r3Var.e3.onContentChanged();
        }
        s5 s5Var2 = v5Var.y;
        if (s5Var2 != null) {
            ((a3) s5Var2).a.e3.s(v5Var, v5.b(editable.toString()));
        }
        String obj = editable.toString();
        a aVar2 = v5Var.x;
        if (aVar2 != null && obj != null && aVar2.c == 0 && (aVar2.b instanceof TL_iv.pageBlockParagraph) && obj.equals("> ")) {
            i10 = 6;
        }
        if (i10 == 0 || v5Var.y == null) {
            u5 s6 = v5.s(editable.toString(), v5Var.x);
            if (s6 != null && v5Var.y != null) {
                v5Var.post(new tf.h1(this, v5Var.x, s6, 13));
            }
        } else {
            v5Var.post(new zt0(this, v5Var.x, i10, 20));
        }
        if (v5Var.Q || ((aVar = v5Var.x) != null && (aVar.b instanceof TL_iv.pageBlockPullquote))) {
            v5Var.invalidate();
        }
    }

    @Override // vh.c1
    public final void O(d1 d1Var, int i10, int i11) {
        s5 s5Var;
        m9 textSelectionHelper;
        v5 v5Var = this.a;
        if (v5Var.C || i10 == i11 || (s5Var = v5Var.y) == null || (textSelectionHelper = ((a3) s5Var).a.getTextSelectionHelper()) == null) {
            return;
        }
        v5Var.post(new p6(this, d1Var, i11, textSelectionHelper, i10, 7));
    }

    @Override // vh.c1
    public final boolean R(boolean z4) {
        a aVar;
        v5 v5Var = this.a;
        s5 s5Var = v5Var.y;
        if (s5Var == null || (aVar = v5Var.x) == null) {
            return false;
        }
        return ((a3) s5Var).a.W3(aVar, z4);
    }

    @Override // vh.c1
    public final void c(d1 d1Var) {
        s5 s5Var = this.a.y;
        if (s5Var != null) {
            r3 r3Var = ((a3) s5Var).a;
            r3.M1(r3Var, d1Var);
            r3Var.e3.e(d1Var, true);
        }
    }

    @Override // vh.c1
    public final boolean d() {
        v5 v5Var = this.a;
        s5 s5Var = v5Var.y;
        if (s5Var == null || v5Var.x == null) {
            return false;
        }
        return ((a3) s5Var).a.S4();
    }

    @Override // vh.c1
    public final void i(int i10, int i11) {
        c2 c2Var;
        v5 v5Var = this.a;
        s5 s5Var = v5Var.y;
        if (s5Var == null || v5Var.x == null || (c2Var = ((a3) s5Var).a.G3) == null) {
            return;
        }
        c2Var.f(i10, i11);
    }

    @Override // vh.c1
    public final boolean o(d1 d1Var) {
        a aVar;
        v5 v5Var = this.a;
        s5 s5Var = v5Var.y;
        if (s5Var == null || (aVar = v5Var.x) == null) {
            return false;
        }
        return r3.Q1(((a3) s5Var).a, aVar, false);
    }

    @Override // vh.c1
    public final void r() {
        a aVar;
        v5 v5Var = this.a;
        s5 s5Var = v5Var.y;
        if (s5Var == null || (aVar = v5Var.x) == null) {
            return;
        }
        r3.Q1(((a3) s5Var).a, aVar, true);
    }
}
