package sg;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import j3.f;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.gv0;
import org.telegram.ui.Components.hv0;
import org.telegram.ui.Components.iv0;
import rg.c;
import sh.j3;
import sh.m3;
import sh.p2;
import v2.g;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements c, gv0, hv0, GenericProvider, f, c2, ug.b, g {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i10) {
        this.a = i10;
    }

    @Override // ug.b
    public Object a(Bitmap bitmap) {
        switch (this.a) {
            case 21:
                if (bitmap == null || bitmap.isRecycled()) {
                    return null;
                }
                Bitmap stackBlurBitmapWithScaleFactor = Utilities.stackBlurBitmapWithScaleFactor(bitmap, Math.max(bitmap.getWidth() / 90.0f, bitmap.getHeight() / 120.0f));
                stackBlurBitmapWithScaleFactor.setHasAlpha(false);
                return stackBlurBitmapWithScaleFactor;
            case 22:
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

    @Override // org.telegram.ui.Components.hv0
    public void b(Object obj, float f10) {
        switch (this.a) {
            case 4:
                p2 p2Var = (p2) obj;
                p2Var.b = f10;
                p2Var.e.invalidate();
                p2Var.T.setAlpha(f10);
                p2Var.E();
                p2Var.C();
                break;
            case 5:
            default:
                ((m3) obj).setSwipeOffsetY(f10);
                break;
            case 6:
                ((j3) obj).setLoadProgress(f10);
                break;
        }
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
        float f10;
        int i10;
        String str;
        int i11;
        float f11;
        String str2;
        boolean z4;
        int i12;
        CharSequence charSequence = bundle.getCharSequence(v4.b.F);
        CharSequence charSequence2 = charSequence != null ? charSequence : null;
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(v4.b.G);
        Layout.Alignment alignment2 = alignment != null ? alignment : null;
        Layout.Alignment alignment3 = (Layout.Alignment) bundle.getSerializable(v4.b.H);
        Layout.Alignment alignment4 = alignment3 != null ? alignment3 : null;
        Bitmap bitmap = (Bitmap) bundle.getParcelable(v4.b.I);
        Bitmap bitmap2 = bitmap != null ? bitmap : null;
        String str3 = v4.b.J;
        if (bundle.containsKey(str3)) {
            String str4 = v4.b.K;
            if (bundle.containsKey(str4)) {
                f10 = bundle.getFloat(str3);
                i10 = bundle.getInt(str4);
                String str5 = v4.b.L;
                int i13 = !bundle.containsKey(str5) ? bundle.getInt(str5) : TLObject.FLAG_31;
                String str6 = v4.b.M;
                float f12 = !bundle.containsKey(str6) ? bundle.getFloat(str6) : -3.4028235E38f;
                String str7 = v4.b.N;
                int i14 = !bundle.containsKey(str7) ? bundle.getInt(str7) : TLObject.FLAG_31;
                str = v4.b.P;
                if (bundle.containsKey(str)) {
                    String str8 = v4.b.O;
                    if (bundle.containsKey(str8)) {
                        float f13 = bundle.getFloat(str);
                        i11 = bundle.getInt(str8);
                        f11 = f13;
                        String str9 = v4.b.Q;
                        float f14 = bundle.containsKey(str9) ? bundle.getFloat(str9) : -3.4028235E38f;
                        String str10 = v4.b.R;
                        float f15 = bundle.containsKey(str10) ? bundle.getFloat(str10) : -3.4028235E38f;
                        str2 = v4.b.S;
                        if (bundle.containsKey(str2)) {
                            z4 = true;
                            i12 = bundle.getInt(str2);
                        } else {
                            z4 = false;
                            i12 = -16777216;
                        }
                        boolean z10 = bundle.getBoolean(v4.b.T, false) ? z4 : false;
                        String str11 = v4.b.U;
                        int i15 = bundle.containsKey(str11) ? bundle.getInt(str11) : TLObject.FLAG_31;
                        String str12 = v4.b.V;
                        return new v4.b(charSequence2, alignment2, alignment4, bitmap2, f10, i10, i13, f12, i14, i11, f11, f14, f15, z10, i12, i15, bundle.containsKey(str12) ? bundle.getFloat(str12) : 0.0f);
                    }
                }
                i11 = TLObject.FLAG_31;
                f11 = -3.4028235E38f;
                String str92 = v4.b.Q;
                if (bundle.containsKey(str92)) {
                }
                String str102 = v4.b.R;
                if (bundle.containsKey(str102)) {
                }
                str2 = v4.b.S;
                if (bundle.containsKey(str2)) {
                }
                if (bundle.getBoolean(v4.b.T, false)) {
                }
                String str112 = v4.b.U;
                if (bundle.containsKey(str112)) {
                }
                String str122 = v4.b.V;
                return new v4.b(charSequence2, alignment2, alignment4, bitmap2, f10, i10, i13, f12, i14, i11, f11, f14, f15, z10, i12, i15, bundle.containsKey(str122) ? bundle.getFloat(str122) : 0.0f);
            }
        }
        f10 = -3.4028235E38f;
        i10 = TLObject.FLAG_31;
        String str52 = v4.b.L;
        if (!bundle.containsKey(str52)) {
        }
        String str62 = v4.b.M;
        if (!bundle.containsKey(str62)) {
        }
        String str72 = v4.b.N;
        if (!bundle.containsKey(str72)) {
        }
        str = v4.b.P;
        if (bundle.containsKey(str)) {
        }
        i11 = TLObject.FLAG_31;
        f11 = -3.4028235E38f;
        String str922 = v4.b.Q;
        if (bundle.containsKey(str922)) {
        }
        String str1022 = v4.b.R;
        if (bundle.containsKey(str1022)) {
        }
        str2 = v4.b.S;
        if (bundle.containsKey(str2)) {
        }
        if (bundle.getBoolean(v4.b.T, false)) {
        }
        String str1122 = v4.b.U;
        if (bundle.containsKey(str1122)) {
        }
        String str1222 = v4.b.V;
        return new v4.b(charSequence2, alignment2, alignment4, bitmap2, f10, i10, i13, f12, i14, i11, f11, f14, f15, z10, i12, i15, bundle.containsKey(str1222) ? bundle.getFloat(str1222) : 0.0f);
    }

    @Override // rg.c
    public int g(g6 g6Var, boolean z4) {
        switch (this.a) {
            case 0:
                return k6.l1(0.7f, k6.v0(k6.d6, g6Var));
            case 1:
                LiteMode.isEnabled(262144);
                return 0;
            default:
                return k6.l1(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, k6.v0(k6.d6, g6Var));
        }
    }

    @Override // org.telegram.ui.Components.gv0
    public float get(Object obj) {
        switch (this.a) {
            case 3:
                return ((p2) obj).b;
            case 4:
            default:
                return ((m3) obj).getSwipeOffsetY();
            case 5:
                return ((j3) obj).c;
        }
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void j(d2 d2Var, int i10) {
        switch (this.a) {
            case 19:
                d2Var.dismiss();
                break;
            default:
                d2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        iv0 iv0Var = m3.V;
        return Boolean.FALSE;
    }

    @Override // v2.g
    public void d(Exception exc) {
    }
}
