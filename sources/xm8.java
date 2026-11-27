// default package

import java.util.Arrays;
import java.util.HashMap;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class xm8 {
    public static final HashMap b;
    public final int[] a;

    static {
        HashMap hashMap = new HashMap();
        a(hashMap, 1, "keyword");
        a(hashMap, 2, "operator", "entity");
        a(hashMap, 3, "constant", "boolean");
        a(hashMap, 4, "string", "string-literal", "char", "template-string");
        a(hashMap, 5, "number");
        a(hashMap, 6, "comment", "block-comment", "comment-multiline", "prolog", "doctype", "cdata");
        a(hashMap, 7, "function", "function-definition", "function-variable", "function-name");
        a(hashMap, 8, "builtin", TeXSymbolParser.TYPE_ATTR);
        a(hashMap, 9, "class-name");
        a(hashMap, 10, "property");
        a(hashMap, 11, "attr-name");
        a(hashMap, 12, "attr-value");
        a(hashMap, 13, "selector");
        a(hashMap, 14, "tag");
        a(hashMap, 15, "symbol");
        a(hashMap, 16, "regex");
        a(hashMap, 17, "url");
        a(hashMap, 18, "atrule");
        a(hashMap, 19, "inserted");
        a(hashMap, 20, "deleted");
        a(hashMap, 21, "punctuation");
        a(hashMap, 256, "bold");
        a(hashMap, 512, "italic");
        a(hashMap, jn7.f4, "important");
        b = hashMap;
    }

    public xm8(String[] strArr) {
        this.a = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            int i2 = 0;
            for (String str : strArr[i].split("\\s+")) {
                Integer num = (Integer) b.get(str);
                if (num != null) {
                    i2 = ((i2 & jn7.d4) == 0 ? i2 | (num.intValue() & jn7.d4) : i2) | (num.intValue() & (-256));
                }
            }
            this.a[i] = i2;
        }
    }

    public static void a(HashMap hashMap, int i, String... strArr) {
        for (String str : strArr) {
            hashMap.put(str, Integer.valueOf(i));
        }
    }

    public final int[] b(j26 j26Var) {
        int[] iArr = (int[]) j26Var.b;
        int length = iArr.length / 5;
        boolean z = false;
        if (length == 0) {
            return new int[0];
        }
        int[] iArr2 = new int[length];
        int[] iArr3 = new int[length];
        int[] iArr4 = new int[length];
        ed edVar = new ed((byte) 13, z);
        edVar.c = new int[48];
        int i = -1;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = i2 * 5;
            int i5 = iArr[i4];
            int i6 = iArr[i4 + 1];
            while (true) {
                if (i >= 0) {
                    int i7 = iArr3[i];
                    if (i7 > i5) {
                        edVar.V(i3, i5, iArr4[i]);
                        break;
                    }
                    edVar.V(i3, i7, iArr4[i]);
                    i3 = iArr3[i];
                    i--;
                } else {
                    break;
                }
            }
            int i8 = iArr[i4 + 4];
            int i9 = i8 < 0 ? 0 : iArr2[i8];
            int i10 = iArr[i4 + 2];
            int[] iArr5 = this.a;
            int i11 = iArr5[i10];
            int i12 = iArr5[iArr[i4 + 3]];
            int i13 = i12 & jn7.d4;
            if (i13 == 0) {
                i13 = i11 & jn7.d4;
            }
            if (i13 == 0) {
                i13 = i9 & jn7.d4;
            }
            int i14 = i13 | ((i9 | i11 | i12) & (-256));
            iArr2[i2] = i14;
            i++;
            iArr3[i] = i6;
            iArr4[i] = i14;
            i2++;
            i3 = i5;
        }
        while (i >= 0) {
            edVar.V(i3, iArr3[i], iArr4[i]);
            i3 = iArr3[i];
            i--;
        }
        return Arrays.copyOf((int[]) edVar.c, edVar.b);
    }
}
