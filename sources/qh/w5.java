package qh;

import j$.util.Comparator$-CC;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.function.ToIntFunction;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class w5 {
    public final TL_iv.pageBlockTable a;
    public int b;
    public int c;
    public TL_iv.pageTableCell[][] d;
    public int[][] e;
    public int[][] f;
    public final ArrayList g = new ArrayList();

    public w5(TL_iv.pageBlockTable pageblocktable) {
        this.a = pageblocktable;
        i();
    }

    public static void c(TL_iv.pageTableCell pagetablecell, String str) {
        TL_iv.textPlain textplain = new TL_iv.textPlain();
        if (str == null) {
            str = "";
        }
        textplain.text = str;
        pagetablecell.text = textplain;
        int i9 = pagetablecell.flags;
        int i10 = i9 | 128;
        pagetablecell.flags = i10;
        pagetablecell.flags = pagetablecell.colspan > 1 ? i9 | 130 : i10 & (-3);
        pagetablecell.flags = pagetablecell.rowspan > 1 ? pagetablecell.flags | 4 : pagetablecell.flags & (-5);
    }

    public static void d(TL_iv.pageTableCell pagetablecell, CharSequence charSequence) {
        pagetablecell.text = u5.f(charSequence);
        int i9 = pagetablecell.flags;
        int i10 = i9 | 128;
        pagetablecell.flags = i10;
        pagetablecell.flags = pagetablecell.colspan > 1 ? i9 | 130 : i10 & (-3);
        pagetablecell.flags = pagetablecell.rowspan > 1 ? pagetablecell.flags | 4 : pagetablecell.flags & (-5);
    }

    public static int[][] e(int[][] iArr, int i9) {
        int[][] iArr2 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, iArr.length, i9);
        for (int i10 = 0; i10 < iArr.length; i10++) {
            int[] iArr3 = iArr[i10];
            int length = iArr3.length;
            System.arraycopy(iArr3, 0, iArr2[i10], 0, length);
            while (length < i9) {
                iArr2[i10][length] = -1;
                length++;
            }
        }
        return iArr2;
    }

    public static TL_iv.pageTableCell f() {
        TL_iv.pageTableCell pagetablecell = new TL_iv.pageTableCell();
        c(pagetablecell, "");
        return pagetablecell;
    }

    public static String g(TL_iv.pageTableCell pagetablecell) {
        TL_iv.RichText richText;
        return (pagetablecell == null || (richText = pagetablecell.text) == null) ? "" : u5.l(richText);
    }

    public static CharSequence h(TL_iv.pageTableCell pagetablecell) {
        TL_iv.RichText richText;
        return (pagetablecell == null || (richText = pagetablecell.text) == null) ? "" : u5.r(richText, null, true);
    }

    public static void k(TL_iv.pageTableCell pagetablecell, int i9) {
        if (pagetablecell == null) {
            return;
        }
        boolean z10 = i9 == 1;
        pagetablecell.align_center = z10;
        boolean z11 = i9 == 2;
        pagetablecell.align_right = z11;
        int i10 = pagetablecell.flags;
        pagetablecell.flags = z10 ? i10 | 8 : i10 & (-9);
        int i11 = pagetablecell.flags;
        pagetablecell.flags = z11 ? i11 | 16 : i11 & (-17);
    }

    public static void l(TL_iv.pageTableCell pagetablecell, boolean z10) {
        if (pagetablecell == null) {
            return;
        }
        pagetablecell.header = z10;
        pagetablecell.flags = z10 ? pagetablecell.flags | 1 : pagetablecell.flags & (-2);
    }

    public static void m(TL_iv.pageTableCell pagetablecell, int i9) {
        if (pagetablecell == null) {
            return;
        }
        boolean z10 = i9 == 1;
        pagetablecell.valign_middle = z10;
        boolean z11 = i9 == 2;
        pagetablecell.valign_bottom = z11;
        int i10 = pagetablecell.flags;
        pagetablecell.flags = z10 ? i10 | 32 : i10 & (-33);
        int i11 = pagetablecell.flags;
        pagetablecell.flags = z11 ? i11 | 64 : i11 & (-65);
    }

    public static int n(TL_iv.pageTableCell pagetablecell) {
        int i9 = pagetablecell.colspan;
        if (i9 != 0) {
            return i9;
        }
        return 1;
    }

    public static int o(TL_iv.pageTableCell pagetablecell) {
        int i9 = pagetablecell.rowspan;
        if (i9 != 0) {
            return i9;
        }
        return 1;
    }

    public final int a(TL_iv.pageTableCell pagetablecell) {
        for (int i9 = 0; i9 < this.b; i9++) {
            for (int i10 = 0; i10 < this.c; i10++) {
                if (this.d[i9][i10] == pagetablecell) {
                    return this.f[i9][i10];
                }
            }
        }
        return -1;
    }

    public final int b(TL_iv.pageTableCell pagetablecell) {
        for (int i9 = 0; i9 < this.b; i9++) {
            for (int i10 = 0; i10 < this.c; i10++) {
                if (this.d[i9][i10] == pagetablecell) {
                    return this.e[i9][i10];
                }
            }
        }
        return -1;
    }

    public final void i() {
        int i9;
        int i10;
        TL_iv.pageTableCell pagetablecell;
        int i11;
        int i12;
        TL_iv.pageBlockTable pageblocktable = this.a;
        ArrayList<TL_iv.pageTableRow> arrayList = pageblocktable.rows;
        this.b = arrayList == null ? 0 : arrayList.size();
        int i13 = 0;
        int i14 = 0;
        while (true) {
            i9 = this.b;
            if (i13 >= i9) {
                break;
            }
            TL_iv.pageTableRow pagetablerow = pageblocktable.rows.get(i13);
            int i15 = 0;
            for (int i16 = 0; i16 < pagetablerow.cells.size(); i16++) {
                i15 += n(pagetablerow.cells.get(i16));
            }
            if (i15 > i14) {
                i14 = i15;
            }
            i13++;
        }
        TL_iv.pageTableCell[][] pagetablecellArr = (TL_iv.pageTableCell[][]) Array.newInstance((Class<?>) TL_iv.pageTableCell.class, Math.max(i9, 1), Math.max(i14, 1));
        int[] iArr = {Math.max(this.b, 1), Math.max(i14, 1)};
        Class cls = Integer.TYPE;
        int[][] iArr2 = (int[][]) Array.newInstance((Class<?>) cls, iArr);
        int[][] iArr3 = (int[][]) Array.newInstance((Class<?>) cls, Math.max(this.b, 1), Math.max(i14, 1));
        for (int i17 = 0; i17 < iArr2.length; i17++) {
            for (int i18 = 0; i18 < iArr2[0].length; i18++) {
                iArr2[i17][i18] = -1;
                iArr3[i17][i18] = -1;
            }
        }
        int i19 = 0;
        int i20 = 0;
        while (true) {
            i10 = this.b;
            if (i19 >= i10) {
                break;
            }
            TL_iv.pageTableRow pagetablerow2 = pageblocktable.rows.get(i19);
            int i21 = 0;
            int i22 = 0;
            while (i21 < pagetablerow2.cells.size()) {
                TL_iv.pageTableCell pagetablecell2 = pagetablerow2.cells.get(i21);
                int n10 = n(pagetablecell2);
                int i23 = pagetablecell2.rowspan;
                if (i23 == 0) {
                    i23 = 1;
                }
                while (i22 < i14 && pagetablecellArr[i19][i22] != null) {
                    i22++;
                }
                int i24 = i22 + n10;
                if (i24 > i14) {
                    i14 = Math.max(i24, i14 * 2);
                    pagetablecell = pagetablecell2;
                    i11 = i23;
                    TL_iv.pageTableCell[][] pagetablecellArr2 = (TL_iv.pageTableCell[][]) Array.newInstance((Class<?>) TL_iv.pageTableCell.class, pagetablecellArr.length, i14);
                    int i25 = 0;
                    while (i25 < pagetablecellArr.length) {
                        TL_iv.pageTableCell[] pagetablecellArr3 = pagetablecellArr[i25];
                        int i26 = i25;
                        System.arraycopy(pagetablecellArr3, 0, pagetablecellArr2[i26], 0, pagetablecellArr3.length);
                        i25 = i26 + 1;
                        pagetablecellArr = pagetablecellArr;
                        i19 = i19;
                    }
                    i12 = i19;
                    iArr2 = e(iArr2, i14);
                    iArr3 = e(iArr3, i14);
                    pagetablecellArr = pagetablecellArr2;
                } else {
                    pagetablecell = pagetablecell2;
                    i11 = i23;
                    i12 = i19;
                }
                for (int i27 = i12; i27 < i12 + i11 && i27 < this.b; i27++) {
                    for (int i28 = i22; i28 < i24; i28++) {
                        pagetablecellArr[i27][i28] = pagetablecell;
                        iArr2[i27][i28] = i12;
                        iArr3[i27][i28] = i22;
                    }
                }
                if (i24 > i20) {
                    i20 = i24;
                }
                i21++;
                i22 = i24;
                i19 = i12;
            }
            i19++;
        }
        this.c = i20;
        this.d = (TL_iv.pageTableCell[][]) Array.newInstance((Class<?>) TL_iv.pageTableCell.class, Math.max(i10, 1), Math.max(this.c, 1));
        this.e = (int[][]) Array.newInstance((Class<?>) cls, Math.max(this.b, 1), Math.max(this.c, 1));
        this.f = (int[][]) Array.newInstance((Class<?>) cls, Math.max(this.b, 1), Math.max(this.c, 1));
        for (int i29 = 0; i29 < this.b; i29++) {
            for (int i30 = 0; i30 < this.c; i30++) {
                TL_iv.pageTableCell[][] pagetablecellArr4 = this.d;
                pagetablecellArr4[i29][i30] = pagetablecellArr[i29][i30];
                this.e[i29][i30] = iArr2[i29][i30];
                this.f[i29][i30] = iArr3[i29][i30];
                if (pagetablecellArr4[i29][i30] == null) {
                    TL_iv.pageTableCell f10 = f();
                    this.d[i29][i30] = f10;
                    this.e[i29][i30] = i29;
                    this.f[i29][i30] = i30;
                    pageblocktable.rows.get(i29).cells.add(f10);
                }
            }
        }
        ArrayList arrayList2 = this.g;
        arrayList2.clear();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (int i31 = 0; i31 < this.b; i31++) {
            int i32 = 0;
            while (true) {
                int i33 = this.c;
                if (i32 < i33) {
                    if (i31 >= 0 && i32 >= 0 && i31 < this.b && i32 < i33 && this.e[i31][i32] == i31 && this.f[i31][i32] == i32 && linkedHashSet.add(this.d[i31][i32])) {
                        arrayList2.add(this.d[i31][i32]);
                    }
                    i32++;
                }
            }
        }
    }

    public final void j(final IdentityHashMap identityHashMap, int i9) {
        TL_iv.pageBlockTable pageblocktable = this.a;
        pageblocktable.rows.clear();
        for (int i10 = 0; i10 < i9; i10++) {
            TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
            pagetablerow.cells = new ArrayList<>();
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : identityHashMap.entrySet()) {
                if (((int[]) entry.getValue())[0] == i10) {
                    arrayList.add((TL_iv.pageTableCell) entry.getKey());
                }
            }
            Collections.sort(arrayList, Comparator$-CC.comparingInt(new ToIntFunction() { // from class: qh.v5
                @Override // java.util.function.ToIntFunction
                public final int applyAsInt(Object obj) {
                    return ((int[]) identityHashMap.get((TL_iv.pageTableCell) obj))[1];
                }
            }));
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) obj;
                int[] iArr = (int[]) identityHashMap.get(pagetablecell);
                int i12 = iArr[2];
                if (i12 <= 1) {
                    i12 = 0;
                }
                pagetablecell.rowspan = i12;
                int i13 = iArr[3];
                if (i13 <= 1) {
                    i13 = 0;
                }
                pagetablecell.colspan = i13;
                pagetablecell.flags = i12 != 0 ? pagetablecell.flags | 4 : pagetablecell.flags & (-5);
                pagetablecell.flags = i13 != 0 ? pagetablecell.flags | 2 : pagetablecell.flags & (-3);
                pagetablerow.cells.add(pagetablecell);
            }
            pageblocktable.rows.add(pagetablerow);
        }
    }

    public final boolean p(TL_iv.pageTableCell pagetablecell) {
        int b10 = b(pagetablecell);
        int a2 = a(pagetablecell);
        if (b10 >= 0 && a2 >= 0) {
            int i9 = pagetablecell.rowspan;
            if (i9 == 0) {
                i9 = 1;
            }
            int i10 = pagetablecell.colspan;
            if (i10 == 0) {
                i10 = 1;
            }
            if (i9 > 1 || i10 > 1) {
                pagetablecell.rowspan = 0;
                pagetablecell.colspan = 0;
                pagetablecell.flags &= -7;
                for (int i11 = b10; i11 < b10 + i9 && i11 < this.b; i11++) {
                    TL_iv.pageTableRow pagetablerow = this.a.rows.get(i11);
                    ArrayList arrayList = new ArrayList();
                    ArrayList<TL_iv.pageTableCell> arrayList2 = pagetablerow.cells;
                    int size = arrayList2.size();
                    int i12 = 0;
                    while (i12 < size) {
                        TL_iv.pageTableCell pagetablecell2 = arrayList2.get(i12);
                        i12++;
                        TL_iv.pageTableCell pagetablecell3 = pagetablecell2;
                        arrayList.add(new Object[]{pagetablecell3, Integer.valueOf(a(pagetablecell3))});
                    }
                    for (int i13 = a2; i13 < a2 + i10; i13++) {
                        if (i11 != b10 || i13 != a2) {
                            TL_iv.pageTableCell pagetablecell4 = new TL_iv.pageTableCell();
                            pagetablecell4.header = pagetablecell.header;
                            pagetablecell4.align_center = pagetablecell.align_center;
                            pagetablecell4.align_right = pagetablecell.align_right;
                            pagetablecell4.valign_middle = pagetablecell.valign_middle;
                            pagetablecell4.valign_bottom = pagetablecell.valign_bottom;
                            c(pagetablecell4, "");
                            arrayList.add(new Object[]{pagetablecell4, Integer.valueOf(i13)});
                        }
                    }
                    Collections.sort(arrayList, Comparator$-CC.comparingInt(new ff.d(19)));
                    pagetablerow.cells.clear();
                    int size2 = arrayList.size();
                    int i14 = 0;
                    while (i14 < size2) {
                        Object obj = arrayList.get(i14);
                        i14++;
                        pagetablerow.cells.add((TL_iv.pageTableCell) ((Object[]) obj)[0]);
                    }
                }
                i();
                return true;
            }
        }
        return false;
    }
}
