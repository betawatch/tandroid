package xg;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableString;
import android.view.View;
import d2.e;
import d2.f;
import d2.g;
import d2.h;
import d2.i;
import d9.k;
import e2.j;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import org.telegram.messenger.l9;
import org.telegram.messenger.p20;
import org.telegram.messenger.sc;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.x6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.mu0;
import org.telegram.ui.Components.nu0;
import org.telegram.ui.Components.ou0;
import r9.d;
import w7.b9;
import xh.e3;
import xh.h3;
import xh.m2;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements wg.c, p20, mu0, nu0, l9, j, k, d, x6 {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i10) {
        this.a = i10;
    }

    @Override // r9.d
    public Object K(bh.d dVar) {
        Set J = dVar.J(za.a.class);
        za.c cVar = za.c.c;
        if (cVar == null) {
            synchronized (za.c.class) {
                try {
                    cVar = za.c.c;
                    if (cVar == null) {
                        cVar = new za.c(0);
                        za.c.c = cVar;
                    }
                } finally {
                }
            }
        }
        return new za.b(J, cVar);
    }

    @Override // org.telegram.messenger.p20
    public Boolean a(a51 a51Var, View view, Integer num, Float f7, Float f10) {
        switch (this.a) {
            case 15:
                break;
            case 24:
                break;
        }
        return Boolean.FALSE;
    }

    @Override // e2.j
    public void accept(Object obj) {
        ((ExecutorService) obj).shutdown();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0134  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v31, types: [android.text.Spannable, android.text.SpannableString] */
    @Override // d9.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object apply(Object obj) {
        CharSequence charSequence;
        Bitmap bitmap;
        boolean containsKey;
        float f7;
        int i10;
        String str;
        float f10;
        int i11;
        String str2;
        int i12;
        boolean z10;
        String str3;
        switch (this.a) {
            case 26:
                Bundle bundle = (Bundle) obj;
                ?? charSequence2 = bundle.getCharSequence(d2.b.s);
                int i13 = 1;
                if (charSequence2 != 0) {
                    ArrayList parcelableArrayList = bundle.getParcelableArrayList(d2.b.t);
                    if (parcelableArrayList != null) {
                        charSequence2 = SpannableString.valueOf(charSequence2);
                        int size = parcelableArrayList.size();
                        int i14 = 0;
                        while (i14 < size) {
                            Object obj2 = parcelableArrayList.get(i14);
                            i14++;
                            Bundle bundle2 = (Bundle) obj2;
                            int i15 = bundle2.getInt(e.a);
                            int i16 = bundle2.getInt(e.b);
                            int i17 = bundle2.getInt(e.c);
                            int i18 = bundle2.getInt(e.d, -1);
                            Bundle bundle3 = bundle2.getBundle(e.e);
                            if (i18 == i13) {
                                bundle3.getClass();
                                String string = bundle3.getString(g.c);
                                string.getClass();
                                charSequence2.setSpan(new g(string, bundle3.getInt(g.d)), i15, i16, i17);
                            } else if (i18 == 2) {
                                bundle3.getClass();
                                charSequence2.setSpan(new h(bundle3.getInt(h.d), bundle3.getInt(h.e), bundle3.getInt(h.f)), i15, i16, i17);
                            } else if (i18 == 3) {
                                charSequence2.setSpan(new f(), i15, i16, i17);
                            } else if (i18 == 4) {
                                bundle3.getClass();
                                String string2 = bundle3.getString(i.b);
                                string2.getClass();
                                charSequence2.setSpan(new i(string2), i15, i16, i17);
                            }
                            i13 = 1;
                        }
                    }
                } else {
                    charSequence2 = 0;
                }
                Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(d2.b.u);
                Layout.Alignment alignment2 = alignment != null ? alignment : null;
                Layout.Alignment alignment3 = (Layout.Alignment) bundle.getSerializable(d2.b.v);
                Layout.Alignment alignment4 = alignment3 != null ? alignment3 : null;
                Bitmap bitmap2 = (Bitmap) bundle.getParcelable(d2.b.w);
                if (bitmap2 != null) {
                    bitmap = bitmap2;
                } else {
                    byte[] byteArray = bundle.getByteArray(d2.b.x);
                    if (byteArray == null) {
                        charSequence = charSequence2;
                        bitmap = null;
                        String str4 = d2.b.y;
                        containsKey = bundle.containsKey(str4);
                        int i19 = TLObject.FLAG_31;
                        if (containsKey) {
                            String str5 = d2.b.z;
                            if (bundle.containsKey(str5)) {
                                f7 = bundle.getFloat(str4);
                                i10 = bundle.getInt(str5);
                                String str6 = d2.b.A;
                                int i20 = bundle.containsKey(str6) ? bundle.getInt(str6) : Integer.MIN_VALUE;
                                String str7 = d2.b.B;
                                float f11 = bundle.containsKey(str7) ? bundle.getFloat(str7) : -3.4028235E38f;
                                String str8 = d2.b.C;
                                int i21 = bundle.containsKey(str8) ? bundle.getInt(str8) : Integer.MIN_VALUE;
                                str = d2.b.E;
                                if (bundle.containsKey(str)) {
                                    String str9 = d2.b.D;
                                    if (bundle.containsKey(str9)) {
                                        f10 = bundle.getFloat(str);
                                        i11 = bundle.getInt(str9);
                                        String str10 = d2.b.F;
                                        float f12 = !bundle.containsKey(str10) ? bundle.getFloat(str10) : -3.4028235E38f;
                                        String str11 = d2.b.G;
                                        float f13 = bundle.containsKey(str11) ? bundle.getFloat(str11) : -3.4028235E38f;
                                        str2 = d2.b.H;
                                        if (bundle.containsKey(str2)) {
                                            i12 = -16777216;
                                            z10 = false;
                                        } else {
                                            i12 = bundle.getInt(str2);
                                            z10 = true;
                                        }
                                        int i22 = i12;
                                        boolean z11 = bundle.getBoolean(d2.b.I, false) ? false : z10;
                                        str3 = d2.b.J;
                                        if (bundle.containsKey(str3)) {
                                            i19 = bundle.getInt(str3);
                                        }
                                        int i23 = i19;
                                        String str12 = d2.b.K;
                                        float f14 = !bundle.containsKey(str12) ? bundle.getFloat(str12) : 0.0f;
                                        String str13 = d2.b.L;
                                        return new d2.b(charSequence, alignment2, alignment4, bitmap, f7, i10, i20, f11, i21, i11, f10, f12, f13, z11, i22, i23, f14, bundle.containsKey(str13) ? bundle.getInt(str13) : 0);
                                    }
                                }
                                f10 = -3.4028235E38f;
                                i11 = Integer.MIN_VALUE;
                                String str102 = d2.b.F;
                                if (!bundle.containsKey(str102)) {
                                }
                                String str112 = d2.b.G;
                                float f132 = bundle.containsKey(str112) ? bundle.getFloat(str112) : -3.4028235E38f;
                                str2 = d2.b.H;
                                if (bundle.containsKey(str2)) {
                                }
                                int i222 = i12;
                                if (bundle.getBoolean(d2.b.I, false)) {
                                }
                                str3 = d2.b.J;
                                if (bundle.containsKey(str3)) {
                                }
                                int i232 = i19;
                                String str122 = d2.b.K;
                                float f142 = !bundle.containsKey(str122) ? bundle.getFloat(str122) : 0.0f;
                                String str132 = d2.b.L;
                                return new d2.b(charSequence, alignment2, alignment4, bitmap, f7, i10, i20, f11, i21, i11, f10, f12, f132, z11, i222, i232, f142, bundle.containsKey(str132) ? bundle.getInt(str132) : 0);
                            }
                        }
                        f7 = -3.4028235E38f;
                        i10 = Integer.MIN_VALUE;
                        String str62 = d2.b.A;
                        if (bundle.containsKey(str62)) {
                        }
                        String str72 = d2.b.B;
                        if (bundle.containsKey(str72)) {
                        }
                        String str82 = d2.b.C;
                        if (bundle.containsKey(str82)) {
                        }
                        str = d2.b.E;
                        if (bundle.containsKey(str)) {
                        }
                        f10 = -3.4028235E38f;
                        i11 = Integer.MIN_VALUE;
                        String str1022 = d2.b.F;
                        if (!bundle.containsKey(str1022)) {
                        }
                        String str1122 = d2.b.G;
                        float f1322 = bundle.containsKey(str1122) ? bundle.getFloat(str1122) : -3.4028235E38f;
                        str2 = d2.b.H;
                        if (bundle.containsKey(str2)) {
                        }
                        int i2222 = i12;
                        if (bundle.getBoolean(d2.b.I, false)) {
                        }
                        str3 = d2.b.J;
                        if (bundle.containsKey(str3)) {
                        }
                        int i2322 = i19;
                        String str1222 = d2.b.K;
                        float f1422 = !bundle.containsKey(str1222) ? bundle.getFloat(str1222) : 0.0f;
                        String str1322 = d2.b.L;
                        return new d2.b(charSequence, alignment2, alignment4, bitmap, f7, i10, i20, f11, i21, i11, f10, f12, f1322, z11, i2222, i2322, f1422, bundle.containsKey(str1322) ? bundle.getInt(str1322) : 0);
                    }
                    bitmap = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
                }
                charSequence = null;
                String str42 = d2.b.y;
                containsKey = bundle.containsKey(str42);
                int i192 = TLObject.FLAG_31;
                if (containsKey) {
                }
                f7 = -3.4028235E38f;
                i10 = Integer.MIN_VALUE;
                String str622 = d2.b.A;
                if (bundle.containsKey(str622)) {
                }
                String str722 = d2.b.B;
                if (bundle.containsKey(str722)) {
                }
                String str822 = d2.b.C;
                if (bundle.containsKey(str822)) {
                }
                str = d2.b.E;
                if (bundle.containsKey(str)) {
                }
                f10 = -3.4028235E38f;
                i11 = Integer.MIN_VALUE;
                String str10222 = d2.b.F;
                if (!bundle.containsKey(str10222)) {
                }
                String str11222 = d2.b.G;
                float f13222 = bundle.containsKey(str11222) ? bundle.getFloat(str11222) : -3.4028235E38f;
                str2 = d2.b.H;
                if (bundle.containsKey(str2)) {
                }
                int i22222 = i12;
                if (bundle.getBoolean(d2.b.I, false)) {
                }
                str3 = d2.b.J;
                if (bundle.containsKey(str3)) {
                }
                int i23222 = i192;
                String str12222 = d2.b.K;
                float f14222 = !bundle.containsKey(str12222) ? bundle.getFloat(str12222) : 0.0f;
                String str13222 = d2.b.L;
                return new d2.b(charSequence, alignment2, alignment4, bitmap, f7, i10, i20, f11, i21, i11, f10, f12, f13222, z11, i22222, i23222, f14222, bundle.containsKey(str13222) ? bundle.getInt(str13222) : 0);
            default:
                long j10 = ((z3.a) obj).b;
                if (j10 == -9223372036854775807L) {
                    j10 = 0;
                }
                return Long.valueOf(j10);
        }
    }

    @Override // org.telegram.ui.Components.nu0
    public void b(Object obj, float f7) {
        switch (this.a) {
            case 17:
                m2 m2Var = (m2) obj;
                m2Var.c = f7;
                m2Var.f.invalidate();
                m2Var.X.setAlpha(f7);
                m2Var.J();
                m2Var.H();
                break;
            case 18:
            default:
                ((h3) obj).setSwipeOffsetY(f7);
                break;
            case 19:
                ((e3) obj).setLoadProgress(f7);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.x6
    public int f(View view) {
        Drawable background = view.getBackground();
        if (!(background instanceof eq)) {
            return 0;
        }
        Drawable drawable = ((eq) background).a;
        if (drawable instanceof ColorDrawable) {
            return ((ColorDrawable) drawable).getColor();
        }
        return 0;
    }

    @Override // wg.c
    public int g(p6 p6Var, boolean z10) {
        switch (this.a) {
            case 0:
                return t6.r1(sc.e(262144) ? 0.85f : 0.76f, t6.w0(t6.tj, p6Var));
            case 1:
                return b9.n(sc.e(262144) ? 0.85f : 0.76f, t6.w0(t6.d6, p6Var), t6.w0(t6.Ge, p6Var));
            case 2:
                return b9.n(sc.e(262144) ? 0.85f : 0.8f, t6.w0(t6.a7, p6Var), t6.w0(t6.d6, p6Var));
            case 3:
                return 855638016;
            case 4:
                return TLObject.FLAG_30;
            case 5:
                return t6.r1(z10 ? 0.82f : 0.78f, t6.w0(t6.h5, p6Var));
            case 6:
                return t6.r1(0.075f, -16777216);
            case 7:
                return t6.r1(0.88f, t6.w0(t6.d6, p6Var));
            case 8:
                return b9.n(sc.e(262144) ? 0.85f : 0.76f, t6.w0(t6.d6, p6Var), t6.w0(t6.Ml, p6Var));
            case 9:
                return t6.r1(sc.e(262144) ? 0.85f : 0.76f, t6.w0(t6.d6, p6Var));
            case 10:
                return t6.r1(0.78f, t6.w0(t6.h5, p6Var));
            case 11:
                return t6.r1(0.7f, t6.w0(t6.d6, p6Var));
            case 12:
                sc.e(262144);
                return 0;
            case 13:
                return t6.r1(sc.e(262144) ? 0.85f : 0.76f, t6.w0(t6.d6, p6Var));
            default:
                if (!sc.e(256)) {
                    return t6.x0(null, t6.G8, false);
                }
                return t6.r1(z10 ? 0.85f : 0.825f, t6.x0(null, t6.G8, false));
        }
    }

    @Override // org.telegram.ui.Components.mu0
    public float get(Object obj) {
        switch (this.a) {
            case 16:
                return ((m2) obj).c;
            case 17:
            default:
                return ((h3) obj).getSwipeOffsetY();
            case 18:
                return ((e3) obj).c;
        }
    }

    @Override // org.telegram.messenger.l9
    public Object l(Object obj) {
        ou0 ou0Var = h3.b0;
        return Boolean.FALSE;
    }
}
