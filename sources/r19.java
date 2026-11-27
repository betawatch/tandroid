// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class r19 implements LeadingMarginSpan {
    public final float[] E;
    public final Path F;
    public final Paint G;
    public final float[] H;
    public final Path I;
    public int J;
    public zb4 K;
    public SpannableString L;
    public final boolean a;
    public boolean b = true;
    public int c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean h;
    public boolean n;
    public boolean r;
    public final q19 s;
    public zk w;
    public final Drawable x;
    public final Paint y;

    public r19(boolean z, boolean z2, q19 q19Var) {
        Paint paint = new Paint(1);
        this.y = paint;
        this.E = new float[8];
        this.F = new Path();
        Paint paint2 = new Paint(1);
        this.G = paint2;
        this.H = new float[8];
        this.I = new Path();
        this.J = -1;
        this.a = z;
        this.s = q19Var;
        this.e = z2;
        this.x = c00.e(a.b, R.drawable.mini_quote);
        paint2.setColor(this.J);
        paint.setColor(vm2.o(this.J, 30));
    }

    public static void a(SpannableStringBuilder spannableStringBuilder) {
        TreeSet treeSet = new TreeSet();
        HashMap hashMap = new HashMap();
        q19[] q19VarArr = (q19[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), q19.class);
        int i = 0;
        while (true) {
            if (i >= q19VarArr.length) {
                break;
            }
            q19 q19Var = q19VarArr[i];
            int spanStart = spannableStringBuilder.getSpanStart(q19Var);
            int spanEnd = spannableStringBuilder.getSpanEnd(q19Var);
            treeSet.add(Integer.valueOf(spanStart));
            hashMap.put(Integer.valueOf(spanStart), Integer.valueOf((hashMap.containsKey(Integer.valueOf(spanStart)) ? ((Integer) hashMap.get(Integer.valueOf(spanStart))).intValue() : 0) | (q19Var.a.e ? 16 : 1)));
            treeSet.add(Integer.valueOf(spanEnd));
            hashMap.put(Integer.valueOf(spanEnd), Integer.valueOf((hashMap.containsKey(Integer.valueOf(spanEnd)) ? ((Integer) hashMap.get(Integer.valueOf(spanEnd))).intValue() : 0) | 2));
            spannableStringBuilder.removeSpan(q19Var);
            spannableStringBuilder.removeSpan(q19Var.a);
            i++;
        }
        Iterator it = treeSet.iterator();
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int intValue = num.intValue();
            int intValue2 = ((Integer) hashMap.get(num)).intValue();
            if (i2 != intValue) {
                int i4 = intValue - 1;
                int i5 = (i4 < 0 || i4 >= spannableStringBuilder.length() || spannableStringBuilder.charAt(i4) != '\n') ? intValue : intValue - 1;
                if (i3 > 0) {
                    c(spannableStringBuilder, i2, i5, z);
                }
                i2 = intValue + 1;
                if (i2 >= spannableStringBuilder.length() || spannableStringBuilder.charAt(intValue) != '\n') {
                    i2 = intValue;
                }
            }
            if ((intValue2 & 2) != 0) {
                i3--;
            }
            if ((intValue2 & 1) != 0 || (intValue2 & 16) != 0) {
                i3++;
                z = (intValue2 & 16) != 0;
            }
        }
        if (i2 >= spannableStringBuilder.length() || i3 <= 0) {
            return;
        }
        c(spannableStringBuilder, i2, spannableStringBuilder.length(), z);
    }

    public static void b(Spannable spannable, int i, int i2, boolean z) {
        r19[] r19VarArr = (r19[]) spannable.getSpans(i, i2, r19.class);
        if (r19VarArr == null || r19VarArr.length <= 0) {
            int j = Utilities.j(i, spannable.length(), 0);
            int j2 = Utilities.j(i2, spannable.length(), 0);
            q19 q19Var = new q19();
            r19 r19Var = new r19(false, z, q19Var);
            q19Var.a = r19Var;
            r19Var.c = j;
            r19Var.d = j2;
            spannable.setSpan(q19Var, j, j2, 33);
            spannable.setSpan(r19Var, j, j2, 33);
        }
    }

    public static int c(Editable editable, int i, int i2, boolean z) {
        if (editable == null) {
            return -1;
        }
        int j = Utilities.j(i, editable.length(), 0);
        int j2 = Utilities.j(i2, editable.length(), 0);
        if (j > 0 && editable.charAt(j - 1) != '\n') {
            editable.insert(j, "\n");
            j++;
            j2++;
        }
        int i3 = j2 + 1;
        if (j2 >= editable.length() || editable.charAt(j2) != '\n') {
            editable.insert(j2, "\n");
        }
        q19 q19Var = new q19();
        r19 r19Var = new r19(true, z, q19Var);
        q19Var.a = r19Var;
        r19Var.c = j;
        r19Var.d = j2;
        editable.setSpan(r19Var, Utilities.j(j, editable.length(), 0), Utilities.j(j2, editable.length(), 0), 33);
        editable.setSpan(q19Var, Utilities.j(j, editable.length(), 0), Utilities.j(j2, editable.length(), 0), 33);
        editable.insert(Utilities.j(j2, editable.length(), 0), "\ufeff");
        editable.delete(Utilities.j(j2, editable.length(), 0), Utilities.j(i3, editable.length(), 0));
        return i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList d(cu3 cu3Var, Layout layout, ArrayList arrayList, boolean[] zArr) {
        CharSequence charSequence;
        r19[] r19VarArr;
        boolean z;
        boolean z2;
        int lineStart;
        int i;
        boolean z3;
        int i2;
        cu3 cu3Var2 = cu3Var;
        if (layout != null) {
            CharSequence text = layout.getText();
            if (text != null && (text instanceof Spannable)) {
                Spannable spannable = (Spannable) text;
                if (arrayList != null) {
                    arrayList.clear();
                }
                boolean z4 = false;
                r19[] r19VarArr2 = (r19[]) spannable.getSpans(0, spannable.length(), r19.class);
                ArrayList arrayList2 = arrayList;
                int i3 = 0;
                while (i3 < r19VarArr2.length) {
                    r19 r19Var = r19VarArr2[i3];
                    boolean z5 = r19Var.n;
                    n19 n19Var = new n19(cu3Var2, layout, spannable, r19Var);
                    if (r19Var.a) {
                        int i4 = r19Var.c;
                        if (i4 == 0 || text.charAt(i4 - 1) == '\n') {
                            if (r19Var.d != text.length() && text.charAt(r19Var.d) != '\n') {
                                int i5 = r19Var.d;
                                while (i5 <= text.length() && i5 != text.length() && text.charAt(i5) != '\n') {
                                    i5++;
                                }
                                spannable.removeSpan(r19VarArr2[i3]);
                                spannable.removeSpan(r19VarArr2[i3].s);
                                spannable.setSpan(r19VarArr2[i3], r19Var.c, i5, 33);
                                spannable.setSpan(r19VarArr2[i3].s, r19Var.c, i5, 33);
                                n19Var = new n19(cu3Var2, layout, spannable, r19VarArr2[i3]);
                            }
                            boolean z6 = spannable instanceof SpannableStringBuilder;
                            r19 r19Var2 = n19Var.e;
                            if (z6) {
                                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) spannable;
                                int i6 = r19Var2.d - 1;
                                boolean z7 = (i6 < 0 || spannableStringBuilder.charAt(i6) != '\n') ? z4 : true;
                                if (n19Var.b()) {
                                    int i7 = r19Var2.d;
                                    if (i7 - 2 >= 0) {
                                        z = true;
                                        if (layout.getLineRight(layout.getLineForOffset(i7 - 1)) - hl.L(12.0f) > n19Var.d - (r19Var2.K != null ? (hl.L(23.66f) + r12.a) + (hl.L(3.333f) << 1) : hl.L(23.66f) + (hl.L(3.333f) << 1))) {
                                            z3 = true;
                                            if (z7 != z3) {
                                                int i8 = r19Var2.d;
                                                if (z7) {
                                                    i2 = i8 - 1;
                                                    spannableStringBuilder.delete(i8 - 1, i8);
                                                    charSequence = text;
                                                    r19VarArr = r19VarArr2;
                                                } else {
                                                    i2 = i8 + 2;
                                                    boolean z8 = (Selection.getSelectionStart(spannableStringBuilder) == r19Var2.d && Selection.getSelectionStart(spannableStringBuilder) == Selection.getSelectionEnd(spannableStringBuilder)) ? z : z4;
                                                    int i9 = r19Var2.d;
                                                    if (r19Var2.L == null) {
                                                        SpannableString spannableString = new SpannableString("\n");
                                                        r19Var2.L = spannableString;
                                                        charSequence = text;
                                                        r19VarArr = r19VarArr2;
                                                        spannableString.setSpan(new p19(), 0, r19Var2.L.length(), 33);
                                                    } else {
                                                        charSequence = text;
                                                        r19VarArr = r19VarArr2;
                                                    }
                                                    spannableStringBuilder.insert(i9, (CharSequence) r19Var2.L);
                                                    if (z8) {
                                                        int selectionStart = Selection.getSelectionStart(spannableStringBuilder);
                                                        int i10 = r19Var2.d;
                                                        if (selectionStart != i10) {
                                                            Selection.setSelection(spannableStringBuilder, i10, i10);
                                                        }
                                                    }
                                                }
                                                r19Var2.d = Math.min(i2, spannable.length());
                                                spannable.removeSpan(r19VarArr[i3]);
                                                spannable.removeSpan(r19VarArr[i3].s);
                                                spannable.setSpan(r19VarArr[i3], r19Var2.c, r19Var2.d, 33);
                                                spannable.setSpan(r19VarArr[i3].s, r19Var2.c, r19Var2.d, 33);
                                                if (zArr != null) {
                                                    zArr[0] = z;
                                                }
                                            } else {
                                                charSequence = text;
                                                r19VarArr = r19VarArr2;
                                            }
                                        }
                                        z3 = z4;
                                        if (z7 != z3) {
                                        }
                                    }
                                }
                                z = true;
                                z3 = z4;
                                if (z7 != z3) {
                                }
                            } else {
                                charSequence = text;
                                r19VarArr = r19VarArr2;
                                z = true;
                            }
                            zk zkVar = r19Var2.w;
                            if (zkVar != null) {
                                spannable.removeSpan(zkVar);
                            }
                            if (r19Var2.e && (lineStart = layout.getLineStart(Math.min(layout.getLineForOffset(r19Var2.c) + 3, layout.getLineCount()))) < (i = r19Var2.d)) {
                                zk zkVar2 = r19Var2.w;
                                if (zkVar2 == null) {
                                    zkVar2 = new zk(r19Var2);
                                    r19Var2.w = zkVar2;
                                }
                                spannable.setSpan(zkVar2, lineStart, i, 33);
                            }
                        } else {
                            spannable.removeSpan(r19VarArr2[i3]);
                            spannable.removeSpan(r19VarArr2[i3].s);
                            zk zkVar3 = r19VarArr2[i3].w;
                            if (zkVar3 != null) {
                                spannable.removeSpan(zkVar3);
                            }
                            charSequence = text;
                            r19VarArr = r19VarArr2;
                            z2 = z4;
                            i3++;
                            cu3Var2 = cu3Var;
                            z4 = z2;
                            text = charSequence;
                            r19VarArr2 = r19VarArr;
                        }
                    } else {
                        charSequence = text;
                        r19VarArr = r19VarArr2;
                        z = true;
                    }
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    if (r19VarArr[i3].n == z5 || zArr == null) {
                        z2 = false;
                    } else {
                        z2 = false;
                        zArr[0] = z;
                    }
                    arrayList2.add(n19Var);
                    i3++;
                    cu3Var2 = cu3Var;
                    z4 = z2;
                    text = charSequence;
                    r19VarArr2 = r19VarArr;
                }
                return arrayList2;
            }
            if (arrayList != null) {
                arrayList.clear();
            }
        } else if (arrayList != null) {
            arrayList.clear();
            return arrayList;
        }
        return arrayList;
    }

    public static ArrayList e(Layout layout, ArrayList arrayList) {
        if (layout != null) {
            CharSequence text = layout.getText();
            if (text != null && (text instanceof Spanned)) {
                Spanned spanned = (Spanned) text;
                if (arrayList != null) {
                    arrayList.clear();
                }
                for (r19 r19Var : (r19[]) spanned.getSpans(0, spanned.length(), r19.class)) {
                    boolean z = r19Var.n;
                    n19 n19Var = new n19(null, layout, spanned, r19Var);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(n19Var);
                }
                return arrayList;
            }
            if (arrayList != null) {
                arrayList.clear();
            }
        } else if (arrayList != null) {
            arrayList.clear();
            return arrayList;
        }
        return arrayList;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return hl.L(this.b ? 8.0f : 10.0f);
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
    }
}
