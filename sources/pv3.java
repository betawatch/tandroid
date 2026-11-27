// default package

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.os.Build;
import android.text.Spannable;
import android.text.TextUtils;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class pv3 {
    public static final HashMap a = new HashMap();
    public static final int b;
    public static final int c;
    public static final Paint d;
    public static final int[] e;
    public static final Bitmap[][] f;
    public static final boolean[][] g;
    public static final HashMap h;
    public static final ArrayList i;
    public static final HashMap j;
    public static boolean k;
    public static final jm3 l;
    public static float m;
    public static boolean n;
    public static final String[] o;

    static {
        String[][] strArr = jx3.i;
        e = new int[]{strArr[0].length, strArr[1].length, strArr[2].length, strArr[3].length, strArr[4].length, strArr[5].length, strArr[6].length, strArr[7].length};
        f = new Bitmap[8][];
        g = new boolean[8][];
        h = new HashMap();
        i = new ArrayList();
        j = new HashMap();
        l = new jm3((byte) 6);
        n = true;
        o = new String[]{"😂", "😘", "❤", "😍", "😊", "😁", "👍", "☺", "😔", "😄", "😭", "💋", "😒", "😳", "😜", "🙈", "😉", "😃", "😢", "😝", "😱", "😡", "😏", "😞", "😅", "😚", "🙊", "😌", "😀", "😋", "😆", "👌", "😐", "😕"};
        b = hl.L(20.0f);
        c = hl.L(hl.O1() ? 40.0f : 34.0f);
        int i2 = 0;
        while (true) {
            Bitmap[][] bitmapArr = f;
            if (i2 >= bitmapArr.length) {
                break;
            }
            int i3 = e[i2];
            bitmapArr[i2] = new Bitmap[i3];
            g[i2] = new boolean[i3];
            i2++;
        }
        int i4 = 0;
        while (true) {
            char[] cArr = jx3.a;
            if (i4 >= 8) {
                Paint paint = new Paint();
                d = paint;
                paint.setColor(0);
                return;
            }
            int i5 = 0;
            while (true) {
                String[] strArr2 = jx3.i[i4];
                if (i5 < strArr2.length) {
                    HashMap hashMap = a;
                    String str = strArr2[i5];
                    kv3 kv3Var = new kv3();
                    kv3Var.a = (byte) i4;
                    kv3Var.b = (short) i5;
                    hashMap.put(str, kv3Var);
                    i5++;
                }
            }
            i4++;
        }
    }

    public static void a(String str) {
        HashMap hashMap = h;
        Integer num = (Integer) hashMap.get(str);
        if (num == null) {
            num = 0;
        }
        if (num.intValue() == 0 && hashMap.size() >= 48) {
            ArrayList arrayList = i;
            hashMap.remove((String) c00.g(1, arrayList));
            arrayList.set(arrayList.size() - 1, str);
        }
        hashMap.put(str, Integer.valueOf(num.intValue() + 1));
    }

    public static boolean b(CharSequence charSequence) {
        return charSequence != null && charSequence.length() > 2 && charSequence.charAt(charSequence.length() - 2) == 8205 && charSequence.charAt(charSequence.length() - 1) == 10145;
    }

    public static String c(String str) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            char charAt = str.charAt(i2);
            if (charAt < 55356 || charAt > 55358) {
                if (charAt == 8419) {
                    break;
                }
                if (charAt >= 8252 && charAt <= 12953 && jx3.j.containsKey(Character.valueOf(charAt))) {
                    i2++;
                    str = str.substring(0, i2) + "️" + str.substring(i2);
                    length++;
                }
            } else if (charAt != 55356 || i2 >= length - 1) {
                i2++;
            } else {
                int i3 = i2 + 1;
                char charAt2 = str.charAt(i3);
                if (charAt2 == 56879 || charAt2 == 56324 || charAt2 == 56858 || charAt2 == 56703) {
                    i2 += 2;
                    str = str.substring(0, i2) + "️" + str.substring(i2);
                    length++;
                } else {
                    i2 = i3;
                }
            }
            i2++;
        }
        return str;
    }

    public static boolean d(CharSequence charSequence) {
        int[] iArr = new int[1];
        j(charSequence, iArr);
        return iArr[0] > 0;
    }

    public static kv3 e(CharSequence charSequence) {
        CharSequence charSequence2;
        if (b(charSequence)) {
            charSequence = charSequence.subSequence(0, charSequence.length() - 2);
        }
        HashMap hashMap = a;
        kv3 kv3Var = (kv3) hashMap.get(charSequence);
        return (kv3Var != null || (charSequence2 = (CharSequence) jx3.n.get(charSequence)) == null) ? kv3Var : (kv3) hashMap.get(charSequence2);
    }

    public static lv3 f(String str) {
        CharSequence charSequence;
        lv3 a2 = jr2.a(str, null, null);
        if (a2 != null) {
            int i2 = b;
            a2.setBounds(0, 0, i2, i2);
        } else {
            a2 = null;
        }
        if (a2 == null) {
            a2 = g(str);
        }
        if (a2 == null && (charSequence = (CharSequence) jx3.n.get(str)) != null) {
            a2 = g(charSequence);
        }
        if (a2 == null) {
            return null;
        }
        int i3 = c;
        a2.setBounds(0, 0, i3, i3);
        a2.a = true;
        return a2;
    }

    public static lv3 g(CharSequence charSequence) {
        hr2 a2;
        kv3 e2 = e(charSequence);
        int i2 = b;
        if (e2 == null) {
            if (charSequence == null || (a2 = jr2.a(charSequence.toString(), null, null)) == null) {
                return null;
            }
            a2.setBounds(0, 0, i2, i2);
            return a2;
        }
        boolean b2 = b(charSequence);
        ov3 ov3Var = new ov3();
        ov3Var.c = e2;
        ov3Var.d = b2;
        ov3Var.setBounds(0, 0, i2, i2);
        return ov3Var;
    }

    public static boolean h(CharSequence charSequence) {
        CharSequence charSequence2;
        if (TextUtils.isEmpty(charSequence)) {
            return false;
        }
        HashMap hashMap = a;
        kv3 kv3Var = (kv3) hashMap.get(charSequence);
        if (kv3Var == null && (charSequence2 = (CharSequence) jx3.n.get(charSequence)) != null) {
            kv3Var = (kv3) hashMap.get(charSequence2);
        }
        return kv3Var != null;
    }

    public static void i(final byte b2, final short s) {
        if (f[b2][s] == null) {
            boolean[] zArr = g[b2];
            if (zArr[s]) {
                return;
            }
            zArr[s] = true;
            Utilities.e.c(new Runnable() { // from class: jv3
                @Override // java.lang.Runnable
                public final void run() {
                    Bitmap bitmap;
                    byte b3 = b2;
                    short s2 = s;
                    try {
                        bitmap = qx3.a.h(b3, s2);
                    } catch (Exception e2) {
                        cc4.g(e2, true);
                        bitmap = null;
                    }
                    if (bitmap != null) {
                        pv3.f[b3][s2] = bitmap;
                        jm3 jm3Var = pv3.l;
                        hl.r(jm3Var);
                        hl.c3(jm3Var);
                    }
                    pv3.g[b3][s2] = false;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x027c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01a0 A[Catch: Exception -> 0x0284, TryCatch #0 {Exception -> 0x0284, blocks: (B:9:0x002c, B:24:0x011d, B:36:0x01a0, B:38:0x01a4, B:42:0x01b1, B:44:0x01b7, B:46:0x020c, B:63:0x01df, B:65:0x01e3, B:79:0x01f8, B:81:0x01fc, B:96:0x0217, B:98:0x021f, B:100:0x0223, B:102:0x022e, B:106:0x023c, B:109:0x024c, B:111:0x0256, B:113:0x0259, B:114:0x0273, B:120:0x0148, B:122:0x014f, B:124:0x015b, B:128:0x016b, B:130:0x0171, B:131:0x0178, B:133:0x0180, B:134:0x0187, B:136:0x0191, B:163:0x0076, B:209:0x00d6), top: B:8:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0215 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x021f A[Catch: Exception -> 0x0284, TryCatch #0 {Exception -> 0x0284, blocks: (B:9:0x002c, B:24:0x011d, B:36:0x01a0, B:38:0x01a4, B:42:0x01b1, B:44:0x01b7, B:46:0x020c, B:63:0x01df, B:65:0x01e3, B:79:0x01f8, B:81:0x01fc, B:96:0x0217, B:98:0x021f, B:100:0x0223, B:102:0x022e, B:106:0x023c, B:109:0x024c, B:111:0x0256, B:113:0x0259, B:114:0x0273, B:120:0x0148, B:122:0x014f, B:124:0x015b, B:128:0x016b, B:130:0x0171, B:131:0x0178, B:133:0x0180, B:134:0x0187, B:136:0x0191, B:163:0x0076, B:209:0x00d6), top: B:8:0x002c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList j(CharSequence charSequence, int[] iArr) {
        boolean z;
        boolean z2;
        char charAt;
        boolean z3;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        char charAt2;
        int i8;
        int i9;
        ArrayList arrayList = new ArrayList();
        if (charSequence != null && charSequence.length() > 0) {
            StringBuilder sb = new StringBuilder(16);
            int length = charSequence.length();
            int i10 = -1;
            int[] iArr2 = iArr;
            int i11 = -1;
            int i12 = 0;
            int i13 = 0;
            long j2 = 0;
            int i14 = 0;
            boolean z4 = false;
            boolean z5 = false;
            while (i13 < length) {
                try {
                    char charAt3 = charSequence.charAt(i13);
                    if ((charAt3 >= 55356 && charAt3 <= 55358) || (j2 != 0 && (j2 & (-4294967296L)) == 0 && (j2 & 65535) == 55356 && charAt3 >= 56806 && charAt3 <= 56831)) {
                        if (i11 == i10) {
                            i11 = i13;
                        } else if (z4) {
                            i11 = i13;
                            i14 = 0;
                            z4 = false;
                        }
                        try {
                            sb.append(charAt3);
                            i14++;
                            j2 = (j2 << 16) | charAt3;
                        } catch (Exception e2) {
                            e = e2;
                            z = true;
                            cc4.g(e, z);
                            if (iArr2 != null) {
                                iArr2[0] = 0;
                            }
                            return arrayList;
                        }
                    } else if ((sb.length() > 0 && (charAt3 == 9792 || charAt3 == 9794 || charAt3 == 9877)) || (j2 > 0 && (61440 & charAt3) == 53248)) {
                        sb.append(charAt3);
                        i14++;
                        z5 = true;
                        j2 = 0;
                    } else if (charAt3 == 8419) {
                        if (i13 > 0 && (((charAt = charSequence.charAt(i12)) >= '0' && charAt <= '9') || charAt == '#' || charAt == '*')) {
                            i14 = (i13 - i12) + 1;
                            sb.append(charAt);
                            sb.append(charAt3);
                            z5 = true;
                            i11 = i12;
                            z4 = false;
                        }
                    } else if ((charAt3 == 169 || charAt3 == 174 || (charAt3 >= 8252 && charAt3 <= 12953)) && jx3.k.containsKey(Character.valueOf(charAt3))) {
                        if (i11 == -1) {
                            i11 = i13;
                        } else if (z4) {
                            i11 = i13;
                            i14 = 0;
                            z4 = false;
                        }
                        i14++;
                        sb.append(charAt3);
                        z5 = true;
                    } else {
                        if (i11 != -1) {
                            sb.setLength(0);
                            z2 = false;
                            i11 = -1;
                            i14 = 0;
                            z4 = false;
                            z5 = false;
                        } else if (charAt3 != 65039 && charAt3 != '\n' && charAt3 != ' ' && charAt3 != '\t') {
                            z2 = true;
                        }
                        if (z5 || (i9 = i13 + 2) >= length) {
                            z3 = z2;
                        } else {
                            int i15 = i13 + 1;
                            char charAt4 = charSequence.charAt(i15);
                            z3 = z2;
                            if (charAt4 == 55356) {
                                char charAt5 = charSequence.charAt(i9);
                                if (charAt5 >= 57339 && charAt5 <= 57343) {
                                    sb.append(charSequence.subSequence(i15, i13 + 3));
                                    i14 += 2;
                                    i2 = i9;
                                    i3 = i2;
                                    i4 = 0;
                                    while (i4 < 3) {
                                        int i16 = i3 + 1;
                                        if (i16 < length) {
                                            char charAt6 = charSequence.charAt(i16);
                                            i8 = i2;
                                            if (i4 == 1) {
                                                if (charAt6 == 8205 && sb.length() > 0) {
                                                    sb.append(charAt6);
                                                    i14++;
                                                    i3 = i16;
                                                    z5 = false;
                                                    z3 = false;
                                                }
                                            } else if (charAt3 == '*' || charAt3 == '#' || (charAt3 >= '0' && charAt3 <= '9')) {
                                                if (charAt6 >= 65024 && charAt6 <= 65039) {
                                                    i14++;
                                                    if (!z5) {
                                                        z5 = i3 + 2 >= length;
                                                    }
                                                    i3 = i16;
                                                    i11 = i8;
                                                    z4 = true;
                                                }
                                            } else if (i11 != -1 && charAt6 >= 65024 && charAt6 <= 65039) {
                                                i14++;
                                                if (!z5) {
                                                    z5 = i3 + 2 >= length;
                                                }
                                                i3 = i16;
                                            }
                                        } else {
                                            i8 = i2;
                                        }
                                        i4++;
                                        i2 = i8;
                                    }
                                    int i17 = i2;
                                    if (z3 && iArr2 != null) {
                                        iArr2[0] = 0;
                                        iArr2 = null;
                                    }
                                    if (z5 && (i6 = i3 + 2) < length) {
                                        i7 = i3 + 1;
                                        if (charSequence.charAt(i7) == 55356 && (charAt2 = charSequence.charAt(i6)) >= 57339 && charAt2 <= 57343) {
                                            sb.append(charSequence.subSequence(i7, i3 + 3));
                                            i14 += 2;
                                            i3 = i6;
                                        }
                                    }
                                    if (z5) {
                                        if (iArr2 != null) {
                                            iArr2[0] = iArr2[0] + 1;
                                        }
                                        if (i11 >= 0 && (i5 = i14 + i11) <= length) {
                                            CharSequence subSequence = sb.subSequence(0, sb.length());
                                            nv3 nv3Var = new nv3();
                                            nv3Var.a = i11;
                                            nv3Var.b = i5;
                                            nv3Var.c = subSequence;
                                            arrayList.add(nv3Var);
                                        }
                                        sb.setLength(0);
                                        i11 = -1;
                                        i14 = 0;
                                        z4 = false;
                                        z5 = false;
                                    }
                                    i13 = i3 + 1;
                                    i12 = i17;
                                    i10 = -1;
                                }
                            } else if (sb.length() >= 2 && sb.charAt(0) == 55356 && sb.charAt(1) == 57332 && charAt4 == 56128) {
                                do {
                                    if (i15 < charSequence.length()) {
                                        sb.append(charSequence.charAt(i15));
                                    }
                                    i13 = i15 + 1;
                                    if (i13 < charSequence.length()) {
                                        sb.append(charSequence.charAt(i13));
                                    }
                                    i14 += 2;
                                    i15 += 2;
                                    if (i15 >= charSequence.length()) {
                                        break;
                                    }
                                } while (charSequence.charAt(i15) == 56128);
                            }
                        }
                        i2 = i13;
                        i3 = i2;
                        i4 = 0;
                        while (i4 < 3) {
                        }
                        int i172 = i2;
                        if (z3) {
                            iArr2[0] = 0;
                            iArr2 = null;
                        }
                        if (z5) {
                            i7 = i3 + 1;
                            if (charSequence.charAt(i7) == 55356) {
                                sb.append(charSequence.subSequence(i7, i3 + 3));
                                i14 += 2;
                                i3 = i6;
                            }
                        }
                        if (z5) {
                        }
                        i13 = i3 + 1;
                        i12 = i172;
                        i10 = -1;
                    }
                    z2 = false;
                    if (z5) {
                    }
                    z3 = z2;
                    i2 = i13;
                    i3 = i2;
                    i4 = 0;
                    while (i4 < 3) {
                    }
                    int i1722 = i2;
                    if (z3) {
                    }
                    if (z5) {
                    }
                    if (z5) {
                    }
                    i13 = i3 + 1;
                    i12 = i1722;
                    i10 = -1;
                } catch (Exception e3) {
                    e = e3;
                    z = true;
                }
            }
            if (iArr2 != null && sb.length() != 0) {
                iArr2[0] = 0;
            }
        }
        return arrayList;
    }

    public static void k(CharSequence charSequence) {
        kv3 e2 = e(charSequence);
        if (e2 != null) {
            i(e2.a, e2.b);
        }
    }

    public static CharSequence l(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt, boolean z) {
        return m(charSequence, fontMetricsInt, z, null, 0);
    }

    public static CharSequence m(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt, boolean z, int[] iArr, int i2) {
        return n(charSequence, fontMetricsInt, z, iArr, i2, 1.0f, 0);
    }

    public static CharSequence n(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt, boolean z, int[] iArr, int i2, float f2, int i3) {
        int i4;
        int i5;
        if (xea.Q0 || charSequence == null || charSequence.length() == 0) {
            return charSequence;
        }
        Spannable newSpannable = (z || !(charSequence instanceof Spannable)) ? Spannable.Factory.getInstance().newSpannable(charSequence) : (Spannable) charSequence;
        ArrayList j2 = j(newSpannable, iArr);
        if (j2.isEmpty()) {
            return charSequence;
        }
        hm[] hmVarArr = (hm[]) newSpannable.getSpans(0, newSpannable.length(), hm.class);
        wm2[] wm2VarArr = (wm2[]) newSpannable.getSpans(0, newSpannable.length(), wm2.class);
        int i6 = (xea.o() >= 2 ? 100 : 50) - i3;
        for (int i7 = 0; i7 < j2.size(); i7++) {
            try {
                nv3 nv3Var = (nv3) j2.get(i7);
                if (hmVarArr != null && hmVarArr.length > 0) {
                    for (hm hmVar : hmVarArr) {
                        i5 = (hmVar != null && newSpannable.getSpanStart(hmVar) == nv3Var.a && newSpannable.getSpanEnd(hmVar) == nv3Var.b) ? 0 : i5 + 1;
                    }
                }
                if (wm2VarArr != null && wm2VarArr.length > 0) {
                    for (wm2 wm2Var : wm2VarArr) {
                        i4 = (wm2Var != null && newSpannable.getSpanStart(wm2Var) == nv3Var.a && newSpannable.getSpanEnd(wm2Var) == nv3Var.b) ? 0 : i4 + 1;
                    }
                }
                lv3 g2 = g(nv3Var.c);
                if (g2 != null) {
                    mv3 mv3Var = new mv3(g2, i2);
                    mv3Var.b = 1.0f;
                    mv3Var.c = hl.L(20.0f);
                    mv3Var.a = fontMetricsInt;
                    if (fontMetricsInt != null) {
                        int abs = Math.abs(mv3Var.a.ascent) + Math.abs(fontMetricsInt.descent);
                        mv3Var.c = abs;
                        if (abs == 0) {
                            mv3Var.c = hl.L(20.0f);
                        }
                    }
                    CharSequence charSequence2 = nv3Var.c;
                    mv3Var.d = charSequence2 == null ? null : charSequence2.toString();
                    mv3Var.b = f2;
                    newSpannable.setSpan(mv3Var, nv3Var.a, nv3Var.b, 33);
                }
            } catch (Exception e2) {
                cc4.g(e2, true);
            }
            if (Build.VERSION.SDK_INT >= 29 && i7 + 1 >= i6) {
                break;
            }
        }
        return newSpannable;
    }

    public static CharSequence o(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt, int i2, Runnable runnable) {
        TLRPC.Document document;
        int i3;
        if (xea.Q0 || charSequence == null || charSequence.length() == 0) {
            return charSequence;
        }
        int i4 = yac.t0;
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
        tL_inputStickerSetShortName.short_name = "RestrictedEmoji";
        TLRPC.TL_messages_stickerSet m0 = ls6.d0(i4).m0(tL_inputStickerSetShortName, 0, false, true, runnable == null ? null : new zj3(runnable, (byte) 5));
        Spannable newSpannable = charSequence instanceof Spannable ? (Spannable) charSequence : Spannable.Factory.getInstance().newSpannable(charSequence.toString());
        ArrayList j2 = j(newSpannable, null);
        if (j2.isEmpty()) {
            return charSequence;
        }
        hm[] hmVarArr = (hm[]) newSpannable.getSpans(0, newSpannable.length(), hm.class);
        int i5 = xea.o() >= 2 ? 100 : 50;
        for (int i6 = 0; i6 < j2.size(); i6++) {
            try {
                nv3 nv3Var = (nv3) j2.get(i6);
                if (hmVarArr != null) {
                    for (hm hmVar : hmVarArr) {
                        i3 = (hmVar != null && newSpannable.getSpanStart(hmVar) == nv3Var.a && newSpannable.getSpanEnd(hmVar) == nv3Var.b) ? 0 : i3 + 1;
                    }
                }
                if (m0 != null) {
                    ArrayList<TLRPC.Document> arrayList = m0.documents;
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        TLRPC.Document document2 = arrayList.get(i7);
                        i7++;
                        document = document2;
                        if (r47.V(document, null, null).contains(nv3Var.c)) {
                            break;
                        }
                    }
                }
                document = null;
                hm hmVar2 = document != null ? new hm(document, fontMetricsInt) : new hm(0L, fontMetricsInt);
                hmVar2.emoji = nv3Var.c.toString();
                hmVar2.cacheType = i2;
                newSpannable.setSpan(hmVar2, nv3Var.a, nv3Var.b, 33);
            } catch (Exception e2) {
                cc4.g(e2, true);
            }
            if (Build.VERSION.SDK_INT >= 29 && i6 + 1 >= i5) {
                break;
            }
        }
        return newSpannable;
    }

    public static CharSequence p(CharSequence charSequence, TextView textView, Runnable runnable) {
        return o(charSequence, textView.getPaint().getFontMetricsInt(), 20, runnable);
    }

    public static void q() {
        SharedPreferences d1 = uc7.d1();
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : j.entrySet()) {
            if (sb.length() != 0) {
                sb.append(",");
            }
            sb.append((String) entry.getKey());
            sb.append("=");
            sb.append((String) entry.getValue());
        }
        d1.edit().putString("color", sb.toString()).commit();
    }

    public static void r() {
        SharedPreferences d1 = uc7.d1();
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : h.entrySet()) {
            if (sb.length() != 0) {
                sb.append(",");
            }
            sb.append((String) entry.getKey());
            sb.append("=");
            sb.append(entry.getValue());
        }
        d1.edit().putString("emojis2", sb.toString()).commit();
    }

    public static void s() {
        ArrayList arrayList = i;
        arrayList.clear();
        Iterator it = h.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Map.Entry) it.next()).getKey());
        }
        Collections.sort(arrayList, new f03((byte) 14));
        while (arrayList.size() > 48) {
            qd4.v(1, arrayList);
        }
    }
}
