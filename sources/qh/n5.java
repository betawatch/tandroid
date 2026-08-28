package qh;

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
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Components.z41;
import org.telegram.ui.jh0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class n5 implements c1 {
    public final /* synthetic */ s5 a;

    public n5(s5 s5Var) {
        this.a = s5Var;
    }

    @Override // qh.c1
    public final boolean A(d1 d1Var) {
        a aVar;
        s5 s5Var = this.a;
        p5 p5Var = s5Var.y;
        if (p5Var == null || (aVar = s5Var.x) == null) {
            return false;
        }
        return o3.Q1(((x2) p5Var).a, aVar, false);
    }

    @Override // qh.c1
    public final void B1(Editable editable) {
        a aVar;
        s5 s5Var = this.a;
        if (s5Var.x == null) {
            return;
        }
        s5Var.E(editable);
        s5Var.J();
        s5.e(s5Var.x.b, editable);
        s5Var.C();
        s5Var.G();
        int i9 = 0;
        if (s5Var.o() && !s5Var.l()) {
            ((TL_iv.pageBlockBlockquote) s5Var.x.b).collapsed = false;
        }
        s5Var.H();
        p5 p5Var = s5Var.y;
        if (p5Var != null) {
            o3 o3Var = ((x2) p5Var).a;
            b2 b2Var = o3Var.F3;
            if (b2Var != null) {
                b2Var.g();
            }
            o3Var.d3.onContentChanged();
        }
        p5 p5Var2 = s5Var.y;
        if (p5Var2 != null) {
            ((x2) p5Var2).a.d3.c2(s5Var, s5.b(editable.toString()));
        }
        String obj = editable.toString();
        a aVar2 = s5Var.x;
        if (aVar2 != null && obj != null && aVar2.c == 0 && (aVar2.b instanceof TL_iv.pageBlockParagraph) && obj.equals("> ")) {
            i9 = 6;
        }
        if (i9 == 0 || s5Var.y == null) {
            r5 s10 = s5.s(editable.toString(), s5Var.x);
            if (s10 != null && s5Var.y != null) {
                s5Var.post(new pf.a(this, s5Var.x, s10, 11));
            }
        } else {
            s5Var.post(new jh0(this, s5Var.x, i9, 15));
        }
        if (s5Var.P || ((aVar = s5Var.x) != null && (aVar.b instanceof TL_iv.pageBlockPullquote))) {
            s5Var.invalidate();
        }
    }

    @Override // qh.c1
    public final void E(int i9, int i10) {
        b2 b2Var;
        s5 s5Var = this.a;
        p5 p5Var = s5Var.y;
        if (p5Var == null || s5Var.x == null || (b2Var = ((x2) p5Var).a.F3) == null) {
            return;
        }
        b2Var.f(i9, i10);
    }

    @Override // qh.c1
    public final void J0() {
        a aVar;
        s5 s5Var = this.a;
        p5 p5Var = s5Var.y;
        if (p5Var == null || (aVar = s5Var.x) == null) {
            return;
        }
        o3.Q1(((x2) p5Var).a, aVar, true);
    }

    @Override // qh.c1
    public final void L0(d1 d1Var) {
        int length;
        Spanned spanned;
        boolean z10;
        int i9;
        d1 editText;
        Editable text;
        s5 s5Var = this.a;
        if (s5Var.y == null || s5Var.x == null) {
            return;
        }
        String obj = d1Var.getText().toString();
        ((x2) s5Var.y).a.d3.c2(s5Var, null);
        String b10 = s5.b(obj);
        if (b10 != null) {
            ArrayList a2 = k0.a(b10);
            if (!a2.isEmpty()) {
                s5Var.D((k0) a2.get(0));
                return;
            }
        }
        int q10 = s5.q(d1Var.getText().toString());
        if (q10 != 0) {
            ((x2) s5Var.y).c(s5Var.x, q10);
            return;
        }
        r5 r10 = s5.r(d1Var.getText().toString(), s5Var.x);
        if (r10 != null) {
            ((x2) s5Var.y).d(s5Var.x, r10.a, r10.b, r10.c, r10.d, r10.e);
            return;
        }
        if ((s5Var.x.b instanceof TL_iv.pageBlockPullquote) && s5Var.f.length() > 0) {
            s5Var.i();
            return;
        }
        p5 p5Var = s5Var.y;
        a aVar = s5Var.x;
        o3 o3Var = ((x2) p5Var).a;
        ArrayList arrayList = o3Var.l4;
        z41 z41Var = o3Var.U2;
        ArrayList arrayList2 = o3Var.h3;
        int indexOf = arrayList2.indexOf(aVar);
        if (indexOf < 0) {
            return;
        }
        b2 b2Var = o3Var.F3;
        if (b2Var != null) {
            b2Var.d();
        }
        View z12 = o3Var.z1(aVar);
        boolean z11 = z12 instanceof s5;
        if (z11) {
            d1 editText2 = ((s5) z12).getEditText();
            Spanned text2 = editText2.getText();
            length = editText2.getSelectionEnd();
            spanned = text2;
        } else {
            SpannableStringBuilder A = s5.A(aVar.b);
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
                o3Var.s4();
                z41Var.N(false);
                b2 b2Var2 = o3Var.F3;
                if (b2Var2 != null) {
                    b2Var2.h();
                }
                o3Var.post(new i2(o3Var, aVar, 27));
                return;
            }
            if (aVar.c > 0) {
                o3Var.t2(indexOf);
                o3Var.s4();
                z41Var.N(false);
                b2 b2Var3 = o3Var.F3;
                if (b2Var3 != null) {
                    b2Var3.h();
                }
                o3Var.post(new i2(o3Var, aVar, 28));
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
                o3Var.i3.put(Long.valueOf(a3), richText);
            }
            arrayList4.add(Long.valueOf(a3));
            aVar.b = new TL_iv.pageBlockParagraph();
            z10 = true;
        } else {
            z10 = false;
        }
        s5.e(aVar.b, subSequence);
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        s5.e(pageblockparagraph, subSequence2);
        int i10 = aVar.d;
        if (i10 > 0) {
            i10++;
        }
        a aVar2 = new a(pageblockparagraph, aVar.c, i10);
        aVar2.e = aVar.e;
        aVar2.k.addAll(arrayList4);
        int i11 = indexOf + 1;
        arrayList2.add(i11, aVar2);
        o3Var.s4();
        if (z10) {
            z41Var.N(false);
            b2 b2Var4 = o3Var.F3;
            if (b2Var4 != null) {
                b2Var4.h();
            }
            o3Var.post(new i2(o3Var, aVar2, 29));
            return;
        }
        if (z11 && (text = (editText = ((s5) z12).getEditText()).getText()) != null && length >= 0 && length < text.length()) {
            editText.h = true;
            text.delete(length, text.length());
            editText.h = false;
        }
        z41Var.S();
        o3Var.p4(i11);
        int indexOf2 = arrayList.indexOf(aVar2);
        if (indexOf2 < 0) {
            z41Var.l();
        } else {
            f2.w0 itemAnimator = o3Var.getItemAnimator();
            o3Var.setItemAnimator(null);
            z41Var.o(indexOf2);
            if (aVar.d > 0 && (i9 = indexOf2 + 1) < arrayList.size()) {
                z41Var.q(i9, (arrayList.size() - indexOf2) - 1);
            }
            o3Var.post(new r2(o3Var, itemAnimator, 0));
        }
        b2 b2Var5 = o3Var.F3;
        if (b2Var5 != null) {
            b2Var5.h();
        }
        o3Var.post(new s2(o3Var, aVar2, 0));
    }

    @Override // qh.c1
    public final boolean T1(boolean z10) {
        a aVar;
        s5 s5Var = this.a;
        p5 p5Var = s5Var.y;
        if (p5Var == null || (aVar = s5Var.x) == null) {
            return false;
        }
        return ((x2) p5Var).a.W3(aVar, z10);
    }

    @Override // qh.c1
    public final boolean U1(d1 d1Var) {
        a aVar;
        ClipData primaryClip;
        int indexOf;
        s5 s5Var = this.a;
        p5 p5Var = s5Var.y;
        if (p5Var != null && (aVar = s5Var.x) != null) {
            o3 o3Var = ((x2) p5Var).a;
            ClipboardManager clipboardManager = (ClipboardManager) o3Var.getContext().getSystemService("clipboard");
            if (clipboardManager != null && clipboardManager.hasPrimaryClip() && (primaryClip = clipboardManager.getPrimaryClip()) != null && primaryClip.getItemCount() != 0 && primaryClip.getDescription() != null && primaryClip.getDescription().hasMimeType("text/html")) {
                try {
                    String htmlText = primaryClip.getItemAt(0).getHtmlText();
                    if (!TextUtils.isEmpty(htmlText)) {
                        HashMap hashMap = new HashMap();
                        try {
                            ArrayList w42 = o3Var.w4(u3.z(htmlText, hashMap));
                            if (!w42.isEmpty() && ((w42.size() != 1 || !o3.F3((a) w42.get(0))) && (indexOf = o3Var.h3.indexOf(aVar)) >= 0)) {
                                int max = Math.max(0, Math.min(d1Var.getSelectionStart(), d1Var.getSelectionEnd()));
                                boolean I4 = o3Var.I4(indexOf, indexOf, max, Math.max(max, Math.max(d1Var.getSelectionStart(), d1Var.getSelectionEnd())), w42);
                                if (I4 && !hashMap.isEmpty()) {
                                    o3Var.i3.putAll(hashMap);
                                }
                                return I4;
                            }
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
        return false;
    }

    @Override // qh.c1
    public final void d(d1 d1Var) {
        p5 p5Var = this.a.y;
        if (p5Var != null) {
            o3 o3Var = ((x2) p5Var).a;
            o3.M1(o3Var, d1Var);
            o3Var.d3.f1(d1Var, true);
        }
    }

    @Override // qh.c1
    public final void h1(CharSequence charSequence) {
        p5 p5Var = this.a.y;
        if (p5Var != null) {
            x2 x2Var = (x2) p5Var;
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            x2Var.a.t4(charSequence.toString());
        }
    }

    @Override // qh.c1
    public final void k1(d1 d1Var, int i9, int i10) {
        p5 p5Var;
        n9 textSelectionHelper;
        s5 s5Var = this.a;
        if (s5Var.B || i9 == i10 || (p5Var = s5Var.y) == null || (textSelectionHelper = ((x2) p5Var).a.getTextSelectionHelper()) == null) {
            return;
        }
        s5Var.post(new mh.l4(this, d1Var, i10, textSelectionHelper, i9, 7));
    }

    @Override // qh.c1
    public final boolean p() {
        s5 s5Var = this.a;
        p5 p5Var = s5Var.y;
        if (p5Var == null || s5Var.x == null) {
            return false;
        }
        return ((x2) p5Var).a.S4();
    }
}
