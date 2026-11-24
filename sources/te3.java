// default package

import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import j$.util.Comparator$-CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class te3 {
    public final ue3 a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public HashMap f;
    public CharSequence g;

    public te3(ue3 ue3Var) {
        this.a = ue3Var;
    }

    public final void a(int i, k27 k27Var, TLRPC.Chat chat) {
        int i2;
        ArrayList arrayList;
        long j;
        boolean z;
        int i3;
        boolean z2;
        int e1 = (k27Var == null || chat == null) ? 0 : k27Var.e1();
        if (this.b != e1 || this.e) {
            this.f = null;
            this.c = 0;
            this.d = false;
            this.e = false;
            this.b = e1;
            TextPaint textPaint = bkb.E0[0];
            if (chat != null) {
                ArrayList l = na7.q1(i).g4.l(chat.id);
                if (l == null || l.isEmpty()) {
                    if (na7.q1(i).g4.e(chat.id)) {
                        this.g = k96.M0(hc2.p0(chat) ? 2131747998 : 2131747945, null);
                        return;
                    }
                    na7.q1(i).g4.n(0, chat.id, true);
                    this.g = k96.M0(2131748587, null);
                    this.e = true;
                    return;
                }
                ArrayList arrayList2 = new ArrayList(l);
                Collections.sort(arrayList2, Comparator$-CC.comparingInt(new mm((byte) 4)));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (k27Var == null || hc2.p0(chat)) {
                    i2 = 1;
                    arrayList = arrayList2;
                    j = 0;
                    z = false;
                    i3 = 0;
                } else {
                    j = k27.b2(i, k27Var.k, true, false);
                    i2 = 1;
                    arrayList = arrayList2;
                    TLRPC.TL_forumTopic f = na7.q1(i).g4.f(chat.id, j);
                    if (f != null) {
                        CharSequence k = mm4.k(f, textPaint, null);
                        spannableStringBuilder.append(k);
                        i3 = f.unread_count > 0 ? k.length() : 0;
                        this.c = k.length();
                        if (k27Var.O3()) {
                            this.d = false;
                            z2 = false;
                        } else {
                            z2 = f.unread_count > 0;
                            this.d = z2;
                        }
                    } else {
                        this.d = false;
                        z2 = false;
                        i3 = 0;
                    }
                    if (z2) {
                        spannableStringBuilder.append((CharSequence) " ");
                        spannableStringBuilder.setSpan(new se3(gl.L(3.0f)), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (hc2.p0(chat)) {
                    this.f = new HashMap();
                    int i4 = 0;
                    while (i4 < Math.min(4, arrayList.size())) {
                        if (spannableStringBuilder.length() != 0) {
                            spannableStringBuilder.append((CharSequence) "  ");
                        }
                        ArrayList arrayList3 = arrayList;
                        long n = cf3.n(((TLRPC.TL_forumTopic) arrayList3.get(i4)).from_id);
                        ec0 ec0Var = new ec0(i, this.a);
                        ec0Var.h = false;
                        ec0Var.c(n);
                        this.f.put(Long.valueOf(n), ec0Var);
                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(cf3.k(y6c.t0, n));
                        valueOf.insert(0, (CharSequence) "  ");
                        valueOf.setSpan(ec0Var, 0, i2, 33);
                        spannableStringBuilder.append((CharSequence) valueOf);
                        i4++;
                        arrayList = arrayList3;
                        i2 = 1;
                    }
                } else {
                    ArrayList arrayList4 = arrayList;
                    boolean z3 = true;
                    for (int i5 = 0; i5 < Math.min(4, arrayList4.size()); i5++) {
                        TextPaint textPaint2 = textPaint;
                        if (((TLRPC.TL_forumTopic) arrayList4.get(i5)).id == j) {
                            textPaint = textPaint2;
                        } else {
                            if (spannableStringBuilder.length() != 0) {
                                if (z3 && z) {
                                    spannableStringBuilder.append((CharSequence) " ");
                                } else {
                                    spannableStringBuilder.append((CharSequence) ", ");
                                }
                            }
                            textPaint = textPaint2;
                            spannableStringBuilder.append(mm4.k((TLRPC.ForumTopic) arrayList4.get(i5), textPaint, null));
                            z3 = false;
                        }
                    }
                }
                if (i3 > 0) {
                    Typeface o = gl.o();
                    int i6 = bkb.W8;
                    z3c z3cVar = new z3c();
                    z3cVar.a = o;
                    z3cVar.c = i6;
                    z3cVar.b = bkb.w0(null, i6, false);
                    spannableStringBuilder.setSpan(z3cVar, 0, Math.min(spannableStringBuilder.length(), i3 + 2), 0);
                }
                this.g = spannableStringBuilder;
            }
        }
    }
}
