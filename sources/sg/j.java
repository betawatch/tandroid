package sg;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import com.google.android.exoplayer2.upstream.l;
import com.google.android.exoplayer2.upstream.m;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import w3.o;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements rg.b, j3.f, g4.g, p8.e, v2.g, l {
    public final /* synthetic */ int a;

    public /* synthetic */ j(int i10) {
        this.a = i10;
    }

    @Override // rg.b
    public Object a(Bitmap bitmap) {
        switch (this.a) {
            case 0:
                int i10 = 0;
                if (bitmap != null && !bitmap.isRecycled()) {
                    int height = bitmap.getHeight();
                    i10 = Utilities.averageBitmapColor(bitmap, 0, (height * 9) / 10, bitmap.getWidth(), height);
                }
                return Integer.valueOf(i10);
            default:
                int i11 = 0;
                if (bitmap != null && !bitmap.isRecycled()) {
                    i11 = Utilities.averageBitmapColor(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight() / 10);
                }
                return Integer.valueOf(i11);
        }
    }

    @Override // p8.e
    public Object apply(Object obj) {
        return (o) obj;
    }

    @Override // g4.g
    public boolean b(int i10, int i11, int i12, int i13, int i14) {
        if (i11 == 67 && i12 == 79 && i13 == 77 && (i14 == 77 || i10 == 2)) {
            return true;
        }
        if (i11 == 77 && i12 == 76 && i13 == 76) {
            return i14 == 84 || i10 == 2;
        }
        return false;
    }

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
    @Override // j3.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j3.g c(Bundle bundle) {
        float f9;
        int i10;
        String str;
        int i11;
        float f10;
        String str2;
        boolean z10;
        int i12;
        CharSequence charSequence = bundle.getCharSequence(t4.b.E);
        CharSequence charSequence2 = charSequence != null ? charSequence : null;
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(t4.b.F);
        Layout.Alignment alignment2 = alignment != null ? alignment : null;
        Layout.Alignment alignment3 = (Layout.Alignment) bundle.getSerializable(t4.b.G);
        Layout.Alignment alignment4 = alignment3 != null ? alignment3 : null;
        Bitmap bitmap = (Bitmap) bundle.getParcelable(t4.b.H);
        Bitmap bitmap2 = bitmap != null ? bitmap : null;
        String str3 = t4.b.I;
        if (bundle.containsKey(str3)) {
            String str4 = t4.b.J;
            if (bundle.containsKey(str4)) {
                f9 = bundle.getFloat(str3);
                i10 = bundle.getInt(str4);
                String str5 = t4.b.K;
                int i13 = !bundle.containsKey(str5) ? bundle.getInt(str5) : TLObject.FLAG_31;
                String str6 = t4.b.L;
                float f11 = !bundle.containsKey(str6) ? bundle.getFloat(str6) : -3.4028235E38f;
                String str7 = t4.b.M;
                int i14 = !bundle.containsKey(str7) ? bundle.getInt(str7) : TLObject.FLAG_31;
                str = t4.b.O;
                if (bundle.containsKey(str)) {
                    String str8 = t4.b.N;
                    if (bundle.containsKey(str8)) {
                        float f12 = bundle.getFloat(str);
                        i11 = bundle.getInt(str8);
                        f10 = f12;
                        String str9 = t4.b.P;
                        float f13 = bundle.containsKey(str9) ? bundle.getFloat(str9) : -3.4028235E38f;
                        String str10 = t4.b.Q;
                        float f14 = bundle.containsKey(str10) ? bundle.getFloat(str10) : -3.4028235E38f;
                        str2 = t4.b.R;
                        if (bundle.containsKey(str2)) {
                            z10 = true;
                            i12 = bundle.getInt(str2);
                        } else {
                            z10 = false;
                            i12 = -16777216;
                        }
                        boolean z11 = bundle.getBoolean(t4.b.S, false) ? z10 : false;
                        String str11 = t4.b.T;
                        int i15 = bundle.containsKey(str11) ? bundle.getInt(str11) : TLObject.FLAG_31;
                        String str12 = t4.b.U;
                        return new t4.b(charSequence2, alignment2, alignment4, bitmap2, f9, i10, i13, f11, i14, i11, f10, f13, f14, z11, i12, i15, bundle.containsKey(str12) ? bundle.getFloat(str12) : 0.0f);
                    }
                }
                i11 = TLObject.FLAG_31;
                f10 = -3.4028235E38f;
                String str92 = t4.b.P;
                if (bundle.containsKey(str92)) {
                }
                String str102 = t4.b.Q;
                if (bundle.containsKey(str102)) {
                }
                str2 = t4.b.R;
                if (bundle.containsKey(str2)) {
                }
                if (bundle.getBoolean(t4.b.S, false)) {
                }
                String str112 = t4.b.T;
                if (bundle.containsKey(str112)) {
                }
                String str122 = t4.b.U;
                return new t4.b(charSequence2, alignment2, alignment4, bitmap2, f9, i10, i13, f11, i14, i11, f10, f13, f14, z11, i12, i15, bundle.containsKey(str122) ? bundle.getFloat(str122) : 0.0f);
            }
        }
        f9 = -3.4028235E38f;
        i10 = TLObject.FLAG_31;
        String str52 = t4.b.K;
        if (!bundle.containsKey(str52)) {
        }
        String str62 = t4.b.L;
        if (!bundle.containsKey(str62)) {
        }
        String str72 = t4.b.M;
        if (!bundle.containsKey(str72)) {
        }
        str = t4.b.O;
        if (bundle.containsKey(str)) {
        }
        i11 = TLObject.FLAG_31;
        f10 = -3.4028235E38f;
        String str922 = t4.b.P;
        if (bundle.containsKey(str922)) {
        }
        String str1022 = t4.b.Q;
        if (bundle.containsKey(str1022)) {
        }
        str2 = t4.b.R;
        if (bundle.containsKey(str2)) {
        }
        if (bundle.getBoolean(t4.b.S, false)) {
        }
        String str1122 = t4.b.T;
        if (bundle.containsKey(str1122)) {
        }
        String str1222 = t4.b.U;
        return new t4.b(charSequence2, alignment2, alignment4, bitmap2, f9, i10, i13, f11, i14, i11, f10, f13, f14, z11, i12, i15, bundle.containsKey(str1222) ? bundle.getFloat(str1222) : 0.0f);
    }

    @Override // com.google.android.exoplayer2.upstream.l
    public m createDataSource() {
        return new com.google.android.exoplayer2.upstream.c(ApplicationLoader.applicationContext);
    }

    @Override // v2.g
    public void d(Exception exc) {
    }
}
