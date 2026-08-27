package r4;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements h3.f, e4.g {
    public final /* synthetic */ int a;

    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0065  */
    @Override // h3.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h3.g a(Bundle bundle) {
        float f10;
        int i10;
        String str;
        int i11;
        float f11;
        String str2;
        boolean z10;
        int i12;
        CharSequence charSequence = bundle.getCharSequence(c.E);
        CharSequence charSequence2 = charSequence != null ? charSequence : null;
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(c.F);
        Layout.Alignment alignment2 = alignment != null ? alignment : null;
        Layout.Alignment alignment3 = (Layout.Alignment) bundle.getSerializable(c.G);
        Layout.Alignment alignment4 = alignment3 != null ? alignment3 : null;
        Bitmap bitmap = (Bitmap) bundle.getParcelable(c.H);
        Bitmap bitmap2 = bitmap != null ? bitmap : null;
        String str3 = c.I;
        if (bundle.containsKey(str3)) {
            String str4 = c.J;
            if (bundle.containsKey(str4)) {
                f10 = bundle.getFloat(str3);
                i10 = bundle.getInt(str4);
                String str5 = c.K;
                int i13 = !bundle.containsKey(str5) ? bundle.getInt(str5) : TLObject.FLAG_31;
                String str6 = c.L;
                float f12 = !bundle.containsKey(str6) ? bundle.getFloat(str6) : -3.4028235E38f;
                String str7 = c.M;
                int i14 = !bundle.containsKey(str7) ? bundle.getInt(str7) : TLObject.FLAG_31;
                str = c.O;
                if (bundle.containsKey(str)) {
                    String str8 = c.N;
                    if (bundle.containsKey(str8)) {
                        float f13 = bundle.getFloat(str);
                        i11 = bundle.getInt(str8);
                        f11 = f13;
                        String str9 = c.P;
                        float f14 = bundle.containsKey(str9) ? bundle.getFloat(str9) : -3.4028235E38f;
                        String str10 = c.Q;
                        float f15 = bundle.containsKey(str10) ? bundle.getFloat(str10) : -3.4028235E38f;
                        str2 = c.R;
                        if (bundle.containsKey(str2)) {
                            z10 = true;
                            i12 = bundle.getInt(str2);
                        } else {
                            z10 = false;
                            i12 = -16777216;
                        }
                        boolean z11 = bundle.getBoolean(c.S, false) ? z10 : false;
                        String str11 = c.T;
                        int i15 = bundle.containsKey(str11) ? bundle.getInt(str11) : TLObject.FLAG_31;
                        String str12 = c.U;
                        return new c(charSequence2, alignment2, alignment4, bitmap2, f10, i10, i13, f12, i14, i11, f11, f14, f15, z11, i12, i15, bundle.containsKey(str12) ? bundle.getFloat(str12) : 0.0f);
                    }
                }
                i11 = TLObject.FLAG_31;
                f11 = -3.4028235E38f;
                String str92 = c.P;
                if (bundle.containsKey(str92)) {
                }
                String str102 = c.Q;
                if (bundle.containsKey(str102)) {
                }
                str2 = c.R;
                if (bundle.containsKey(str2)) {
                }
                if (bundle.getBoolean(c.S, false)) {
                }
                String str112 = c.T;
                if (bundle.containsKey(str112)) {
                }
                String str122 = c.U;
                return new c(charSequence2, alignment2, alignment4, bitmap2, f10, i10, i13, f12, i14, i11, f11, f14, f15, z11, i12, i15, bundle.containsKey(str122) ? bundle.getFloat(str122) : 0.0f);
            }
        }
        f10 = -3.4028235E38f;
        i10 = TLObject.FLAG_31;
        String str52 = c.K;
        if (!bundle.containsKey(str52)) {
        }
        String str62 = c.L;
        if (!bundle.containsKey(str62)) {
        }
        String str72 = c.M;
        if (!bundle.containsKey(str72)) {
        }
        str = c.O;
        if (bundle.containsKey(str)) {
        }
        i11 = TLObject.FLAG_31;
        f11 = -3.4028235E38f;
        String str922 = c.P;
        if (bundle.containsKey(str922)) {
        }
        String str1022 = c.Q;
        if (bundle.containsKey(str1022)) {
        }
        str2 = c.R;
        if (bundle.containsKey(str2)) {
        }
        if (bundle.getBoolean(c.S, false)) {
        }
        String str1122 = c.T;
        if (bundle.containsKey(str1122)) {
        }
        String str1222 = c.U;
        return new c(charSequence2, alignment2, alignment4, bitmap2, f10, i10, i13, f12, i14, i11, f11, f14, f15, z11, i12, i15, bundle.containsKey(str1222) ? bundle.getFloat(str1222) : 0.0f);
    }

    @Override // e4.g
    public boolean c(int i10, int i11, int i12, int i13, int i14) {
        if (i11 == 67 && i12 == 79 && i13 == 77 && (i14 == 77 || i10 == 2)) {
            return true;
        }
        if (i11 == 77 && i12 == 76 && i13 == 76) {
            return i14 == 84 || i10 == 2;
        }
        return false;
    }
}
