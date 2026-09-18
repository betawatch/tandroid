package yh;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableString;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a2 implements org.telegram.ui.ActionBar.b2, d9.e, q9.d {
    public final /* synthetic */ int a;

    public /* synthetic */ a2(int i10) {
        this.a = i10;
    }

    @Override // q9.d
    public Object G(cf.c cVar) {
        za.l lVar;
        za.i0 i0Var;
        za.c0 c0Var;
        bb.h hVar;
        za.s sVar;
        za.m0 m0Var;
        switch (this.a) {
            case 10:
                lVar = FirebaseSessionsRegistrar.getComponents$lambda-0(cVar);
                return lVar;
            case 11:
                i0Var = FirebaseSessionsRegistrar.getComponents$lambda-1(cVar);
                return i0Var;
            case 12:
                c0Var = FirebaseSessionsRegistrar.getComponents$lambda-2(cVar);
                return c0Var;
            case 13:
                hVar = FirebaseSessionsRegistrar.getComponents$lambda-3(cVar);
                return hVar;
            case 14:
                sVar = FirebaseSessionsRegistrar.getComponents$lambda-4(cVar);
                return sVar;
            default:
                m0Var = FirebaseSessionsRegistrar.getComponents$lambda-5(cVar);
                return m0Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0137  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v29, types: [android.text.Spannable, android.text.SpannableString] */
    /* JADX WARN: Type inference failed for: r2v3 */
    @Override // d9.e, i5.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object apply(Object obj) {
        CharSequence charSequence;
        Bitmap bitmap;
        String str;
        float f7;
        int i10;
        String str2;
        int i11;
        float f10;
        String str3;
        boolean z10;
        int i12;
        switch (this.a) {
            case 1:
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
                            int i15 = bundle2.getInt(d2.e.a);
                            int i16 = bundle2.getInt(d2.e.b);
                            int i17 = bundle2.getInt(d2.e.c);
                            int i18 = bundle2.getInt(d2.e.d, -1);
                            Bundle bundle3 = bundle2.getBundle(d2.e.e);
                            if (i18 == i13) {
                                bundle3.getClass();
                                String string = bundle3.getString(d2.g.c);
                                string.getClass();
                                charSequence2.setSpan(new d2.g(string, bundle3.getInt(d2.g.d)), i15, i16, i17);
                            } else if (i18 == 2) {
                                bundle3.getClass();
                                charSequence2.setSpan(new d2.h(bundle3.getInt(d2.h.d), bundle3.getInt(d2.h.e), bundle3.getInt(d2.h.f)), i15, i16, i17);
                            } else if (i18 == 3) {
                                charSequence2.setSpan(new d2.f(), i15, i16, i17);
                            } else if (i18 == 4) {
                                bundle3.getClass();
                                String string2 = bundle3.getString(d2.i.b);
                                string2.getClass();
                                charSequence2.setSpan(new d2.i(string2), i15, i16, i17);
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
                        str = d2.b.y;
                        if (bundle.containsKey(str)) {
                            String str4 = d2.b.z;
                            if (bundle.containsKey(str4)) {
                                f7 = bundle.getFloat(str);
                                i10 = bundle.getInt(str4);
                                String str5 = d2.b.A;
                                int i19 = bundle.containsKey(str5) ? bundle.getInt(str5) : TLObject.FLAG_31;
                                String str6 = d2.b.B;
                                float f11 = bundle.containsKey(str6) ? bundle.getFloat(str6) : -3.4028235E38f;
                                String str7 = d2.b.C;
                                int i20 = bundle.containsKey(str7) ? bundle.getInt(str7) : TLObject.FLAG_31;
                                str2 = d2.b.E;
                                if (bundle.containsKey(str2)) {
                                    String str8 = d2.b.D;
                                    if (bundle.containsKey(str8)) {
                                        f10 = bundle.getFloat(str2);
                                        i11 = bundle.getInt(str8);
                                        String str9 = d2.b.F;
                                        float f12 = !bundle.containsKey(str9) ? bundle.getFloat(str9) : -3.4028235E38f;
                                        String str10 = d2.b.G;
                                        float f13 = !bundle.containsKey(str10) ? bundle.getFloat(str10) : -3.4028235E38f;
                                        str3 = d2.b.H;
                                        if (bundle.containsKey(str3)) {
                                            z10 = false;
                                            i12 = -16777216;
                                        } else {
                                            i12 = bundle.getInt(str3);
                                            z10 = true;
                                        }
                                        boolean z11 = bundle.getBoolean(d2.b.I, false) ? false : z10;
                                        String str11 = d2.b.J;
                                        int i21 = !bundle.containsKey(str11) ? bundle.getInt(str11) : TLObject.FLAG_31;
                                        String str12 = d2.b.K;
                                        float f14 = !bundle.containsKey(str12) ? bundle.getFloat(str12) : 0.0f;
                                        String str13 = d2.b.L;
                                        return new d2.b(charSequence, alignment2, alignment4, bitmap, f7, i10, i19, f11, i20, i11, f10, f12, f13, z11, i12, i21, f14, !bundle.containsKey(str13) ? bundle.getInt(str13) : 0);
                                    }
                                }
                                i11 = TLObject.FLAG_31;
                                f10 = -3.4028235E38f;
                                String str92 = d2.b.F;
                                if (!bundle.containsKey(str92)) {
                                }
                                String str102 = d2.b.G;
                                if (!bundle.containsKey(str102)) {
                                }
                                str3 = d2.b.H;
                                if (bundle.containsKey(str3)) {
                                }
                                if (bundle.getBoolean(d2.b.I, false)) {
                                }
                                String str112 = d2.b.J;
                                if (!bundle.containsKey(str112)) {
                                }
                                String str122 = d2.b.K;
                                if (!bundle.containsKey(str122)) {
                                }
                                String str132 = d2.b.L;
                                return new d2.b(charSequence, alignment2, alignment4, bitmap, f7, i10, i19, f11, i20, i11, f10, f12, f13, z11, i12, i21, f14, !bundle.containsKey(str132) ? bundle.getInt(str132) : 0);
                            }
                        }
                        f7 = -3.4028235E38f;
                        i10 = TLObject.FLAG_31;
                        String str52 = d2.b.A;
                        if (bundle.containsKey(str52)) {
                        }
                        String str62 = d2.b.B;
                        if (bundle.containsKey(str62)) {
                        }
                        String str72 = d2.b.C;
                        if (bundle.containsKey(str72)) {
                        }
                        str2 = d2.b.E;
                        if (bundle.containsKey(str2)) {
                        }
                        i11 = TLObject.FLAG_31;
                        f10 = -3.4028235E38f;
                        String str922 = d2.b.F;
                        if (!bundle.containsKey(str922)) {
                        }
                        String str1022 = d2.b.G;
                        if (!bundle.containsKey(str1022)) {
                        }
                        str3 = d2.b.H;
                        if (bundle.containsKey(str3)) {
                        }
                        if (bundle.getBoolean(d2.b.I, false)) {
                        }
                        String str1122 = d2.b.J;
                        if (!bundle.containsKey(str1122)) {
                        }
                        String str1222 = d2.b.K;
                        if (!bundle.containsKey(str1222)) {
                        }
                        String str1322 = d2.b.L;
                        return new d2.b(charSequence, alignment2, alignment4, bitmap, f7, i10, i19, f11, i20, i11, f10, f12, f13, z11, i12, i21, f14, !bundle.containsKey(str1322) ? bundle.getInt(str1322) : 0);
                    }
                    bitmap = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
                }
                charSequence = null;
                str = d2.b.y;
                if (bundle.containsKey(str)) {
                }
                f7 = -3.4028235E38f;
                i10 = TLObject.FLAG_31;
                String str522 = d2.b.A;
                if (bundle.containsKey(str522)) {
                }
                String str622 = d2.b.B;
                if (bundle.containsKey(str622)) {
                }
                String str722 = d2.b.C;
                if (bundle.containsKey(str722)) {
                }
                str2 = d2.b.E;
                if (bundle.containsKey(str2)) {
                }
                i11 = TLObject.FLAG_31;
                f10 = -3.4028235E38f;
                String str9222 = d2.b.F;
                if (!bundle.containsKey(str9222)) {
                }
                String str10222 = d2.b.G;
                if (!bundle.containsKey(str10222)) {
                }
                str3 = d2.b.H;
                if (bundle.containsKey(str3)) {
                }
                if (bundle.getBoolean(d2.b.I, false)) {
                }
                String str11222 = d2.b.J;
                if (!bundle.containsKey(str11222)) {
                }
                String str12222 = d2.b.K;
                if (!bundle.containsKey(str12222)) {
                }
                String str13222 = d2.b.L;
                return new d2.b(charSequence, alignment2, alignment4, bitmap, f7, i10, i19, f11, i20, i11, f10, f12, f13, z11, i12, i21, f14, !bundle.containsKey(str13222) ? bundle.getInt(str13222) : 0);
            default:
                long j3 = ((z3.a) obj).b;
                if (j3 == -9223372036854775807L) {
                    j3 = 0;
                }
                return Long.valueOf(j3);
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        int i11 = a4.q1;
    }
}
