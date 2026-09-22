package x2;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.SpannableString;
import b2.l1;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import e9.a1;
import e9.g0;
import java.util.ArrayList;
import java.util.Set;
import org.telegram.messenger.GenericProvider;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ih1;
import u2.p1;
import xh.h4;
import yh.y3;
import za.c0;
import za.i0;
import za.m0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements d9.e, q9.d, a2, GenericProvider, Vector.TLDeserializer {
    public final /* synthetic */ int a;

    public /* synthetic */ h(int i10) {
        this.a = i10;
    }

    public static /* bridge */ /* synthetic */ FingerprintManager a(Object obj) {
        return (FingerprintManager) obj;
    }

    @Override // q9.d
    public Object G(cf.c cVar) {
        za.l lVar;
        i0 i0Var;
        c0 c0Var;
        bb.h hVar;
        za.s sVar;
        m0 m0Var;
        switch (this.a) {
            case 1:
                Set x10 = cVar.x(xa.a.class);
                xa.c cVar2 = xa.c.c;
                if (cVar2 == null) {
                    synchronized (xa.c.class) {
                        try {
                            cVar2 = xa.c.c;
                            if (cVar2 == null) {
                                cVar2 = new xa.c(0);
                                xa.c.c = cVar2;
                            }
                        } finally {
                        }
                    }
                }
                return new xa.b(x10, cVar2);
            case 18:
                lVar = FirebaseSessionsRegistrar.getComponents$lambda-0(cVar);
                return lVar;
            case 19:
                i0Var = FirebaseSessionsRegistrar.getComponents$lambda-1(cVar);
                return i0Var;
            case 20:
                c0Var = FirebaseSessionsRegistrar.getComponents$lambda-2(cVar);
                return c0Var;
            case 21:
                hVar = FirebaseSessionsRegistrar.getComponents$lambda-3(cVar);
                return hVar;
            case 22:
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
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v30, types: [android.text.Spannable, android.text.SpannableString] */
    /* JADX WARN: Type inference failed for: r2v4 */
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
            case 0:
                p1 p1Var = (p1) obj;
                p1Var.getClass();
                Bundle bundle = new Bundle();
                String str4 = p1.e;
                a1 a1Var = p1Var.b;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(a1Var.d);
                g0 listIterator = a1Var.listIterator(0);
                while (listIterator.hasNext()) {
                    arrayList.add(((l1) listIterator.next()).c());
                }
                bundle.putParcelableArrayList(str4, arrayList);
                return bundle;
            case 9:
                Bundle bundle2 = (Bundle) obj;
                ?? charSequence2 = bundle2.getCharSequence(d2.b.s);
                int i13 = 1;
                if (charSequence2 != 0) {
                    ArrayList parcelableArrayList = bundle2.getParcelableArrayList(d2.b.t);
                    if (parcelableArrayList != null) {
                        charSequence2 = SpannableString.valueOf(charSequence2);
                        int size = parcelableArrayList.size();
                        int i14 = 0;
                        while (i14 < size) {
                            Object obj2 = parcelableArrayList.get(i14);
                            i14++;
                            Bundle bundle3 = (Bundle) obj2;
                            int i15 = bundle3.getInt(d2.e.a);
                            int i16 = bundle3.getInt(d2.e.b);
                            int i17 = bundle3.getInt(d2.e.c);
                            int i18 = bundle3.getInt(d2.e.d, -1);
                            Bundle bundle4 = bundle3.getBundle(d2.e.e);
                            if (i18 == i13) {
                                bundle4.getClass();
                                String string = bundle4.getString(d2.g.c);
                                string.getClass();
                                charSequence2.setSpan(new d2.g(string, bundle4.getInt(d2.g.d)), i15, i16, i17);
                            } else if (i18 == 2) {
                                bundle4.getClass();
                                charSequence2.setSpan(new d2.h(bundle4.getInt(d2.h.d), bundle4.getInt(d2.h.e), bundle4.getInt(d2.h.f)), i15, i16, i17);
                            } else if (i18 == 3) {
                                charSequence2.setSpan(new d2.f(), i15, i16, i17);
                            } else if (i18 == 4) {
                                bundle4.getClass();
                                String string2 = bundle4.getString(d2.i.b);
                                string2.getClass();
                                charSequence2.setSpan(new d2.i(string2), i15, i16, i17);
                            }
                            i13 = 1;
                        }
                    }
                } else {
                    charSequence2 = 0;
                }
                Layout.Alignment alignment = (Layout.Alignment) bundle2.getSerializable(d2.b.u);
                Layout.Alignment alignment2 = alignment != null ? alignment : null;
                Layout.Alignment alignment3 = (Layout.Alignment) bundle2.getSerializable(d2.b.v);
                Layout.Alignment alignment4 = alignment3 != null ? alignment3 : null;
                Bitmap bitmap2 = (Bitmap) bundle2.getParcelable(d2.b.w);
                if (bitmap2 != null) {
                    bitmap = bitmap2;
                } else {
                    byte[] byteArray = bundle2.getByteArray(d2.b.x);
                    if (byteArray == null) {
                        charSequence = charSequence2;
                        bitmap = null;
                        str = d2.b.y;
                        if (bundle2.containsKey(str)) {
                            String str5 = d2.b.z;
                            if (bundle2.containsKey(str5)) {
                                f7 = bundle2.getFloat(str);
                                i10 = bundle2.getInt(str5);
                                String str6 = d2.b.A;
                                int i19 = bundle2.containsKey(str6) ? bundle2.getInt(str6) : TLObject.FLAG_31;
                                String str7 = d2.b.B;
                                float f11 = bundle2.containsKey(str7) ? bundle2.getFloat(str7) : -3.4028235E38f;
                                String str8 = d2.b.C;
                                int i20 = bundle2.containsKey(str8) ? bundle2.getInt(str8) : TLObject.FLAG_31;
                                str2 = d2.b.E;
                                if (bundle2.containsKey(str2)) {
                                    String str9 = d2.b.D;
                                    if (bundle2.containsKey(str9)) {
                                        f10 = bundle2.getFloat(str2);
                                        i11 = bundle2.getInt(str9);
                                        String str10 = d2.b.F;
                                        float f12 = !bundle2.containsKey(str10) ? bundle2.getFloat(str10) : -3.4028235E38f;
                                        String str11 = d2.b.G;
                                        float f13 = !bundle2.containsKey(str11) ? bundle2.getFloat(str11) : -3.4028235E38f;
                                        str3 = d2.b.H;
                                        if (bundle2.containsKey(str3)) {
                                            z10 = false;
                                            i12 = -16777216;
                                        } else {
                                            i12 = bundle2.getInt(str3);
                                            z10 = true;
                                        }
                                        boolean z11 = bundle2.getBoolean(d2.b.I, false) ? false : z10;
                                        String str12 = d2.b.J;
                                        int i21 = !bundle2.containsKey(str12) ? bundle2.getInt(str12) : TLObject.FLAG_31;
                                        String str13 = d2.b.K;
                                        float f14 = !bundle2.containsKey(str13) ? bundle2.getFloat(str13) : 0.0f;
                                        String str14 = d2.b.L;
                                        return new d2.b(charSequence, alignment2, alignment4, bitmap, f7, i10, i19, f11, i20, i11, f10, f12, f13, z11, i12, i21, f14, !bundle2.containsKey(str14) ? bundle2.getInt(str14) : 0);
                                    }
                                }
                                i11 = TLObject.FLAG_31;
                                f10 = -3.4028235E38f;
                                String str102 = d2.b.F;
                                if (!bundle2.containsKey(str102)) {
                                }
                                String str112 = d2.b.G;
                                if (!bundle2.containsKey(str112)) {
                                }
                                str3 = d2.b.H;
                                if (bundle2.containsKey(str3)) {
                                }
                                if (bundle2.getBoolean(d2.b.I, false)) {
                                }
                                String str122 = d2.b.J;
                                if (!bundle2.containsKey(str122)) {
                                }
                                String str132 = d2.b.K;
                                if (!bundle2.containsKey(str132)) {
                                }
                                String str142 = d2.b.L;
                                return new d2.b(charSequence, alignment2, alignment4, bitmap, f7, i10, i19, f11, i20, i11, f10, f12, f13, z11, i12, i21, f14, !bundle2.containsKey(str142) ? bundle2.getInt(str142) : 0);
                            }
                        }
                        f7 = -3.4028235E38f;
                        i10 = TLObject.FLAG_31;
                        String str62 = d2.b.A;
                        if (bundle2.containsKey(str62)) {
                        }
                        String str72 = d2.b.B;
                        if (bundle2.containsKey(str72)) {
                        }
                        String str82 = d2.b.C;
                        if (bundle2.containsKey(str82)) {
                        }
                        str2 = d2.b.E;
                        if (bundle2.containsKey(str2)) {
                        }
                        i11 = TLObject.FLAG_31;
                        f10 = -3.4028235E38f;
                        String str1022 = d2.b.F;
                        if (!bundle2.containsKey(str1022)) {
                        }
                        String str1122 = d2.b.G;
                        if (!bundle2.containsKey(str1122)) {
                        }
                        str3 = d2.b.H;
                        if (bundle2.containsKey(str3)) {
                        }
                        if (bundle2.getBoolean(d2.b.I, false)) {
                        }
                        String str1222 = d2.b.J;
                        if (!bundle2.containsKey(str1222)) {
                        }
                        String str1322 = d2.b.K;
                        if (!bundle2.containsKey(str1322)) {
                        }
                        String str1422 = d2.b.L;
                        return new d2.b(charSequence, alignment2, alignment4, bitmap, f7, i10, i19, f11, i20, i11, f10, f12, f13, z11, i12, i21, f14, !bundle2.containsKey(str1422) ? bundle2.getInt(str1422) : 0);
                    }
                    bitmap = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
                }
                charSequence = null;
                str = d2.b.y;
                if (bundle2.containsKey(str)) {
                }
                f7 = -3.4028235E38f;
                i10 = TLObject.FLAG_31;
                String str622 = d2.b.A;
                if (bundle2.containsKey(str622)) {
                }
                String str722 = d2.b.B;
                if (bundle2.containsKey(str722)) {
                }
                String str822 = d2.b.C;
                if (bundle2.containsKey(str822)) {
                }
                str2 = d2.b.E;
                if (bundle2.containsKey(str2)) {
                }
                i11 = TLObject.FLAG_31;
                f10 = -3.4028235E38f;
                String str10222 = d2.b.F;
                if (!bundle2.containsKey(str10222)) {
                }
                String str11222 = d2.b.G;
                if (!bundle2.containsKey(str11222)) {
                }
                str3 = d2.b.H;
                if (bundle2.containsKey(str3)) {
                }
                if (bundle2.getBoolean(d2.b.I, false)) {
                }
                String str12222 = d2.b.J;
                if (!bundle2.containsKey(str12222)) {
                }
                String str13222 = d2.b.K;
                if (!bundle2.containsKey(str13222)) {
                }
                String str14222 = d2.b.L;
                return new d2.b(charSequence, alignment2, alignment4, bitmap, f7, i10, i19, f11, i20, i11, f10, f12, f13, z11, i12, i21, f14, !bundle2.containsKey(str14222) ? bundle2.getInt(str14222) : 0);
            default:
                long j3 = ((z3.a) obj).b;
                if (j3 == -9223372036854775807L) {
                    j3 = 0;
                }
                return Long.valueOf(j3);
        }
    }

    @Override // org.telegram.tgnet.Vector.TLDeserializer
    public TLObject deserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
        return TLRPC.MessageReplyHeader.TLdeserialize(inputSerializedData, i10, z10);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void k(b2 b2Var, int i10) {
        switch (this.a) {
            case 3:
                b2Var.dismiss();
                break;
            case 4:
                b2Var.dismiss();
                break;
            case 5:
            case 6:
            default:
                int i11 = y3.q1;
                break;
            case 7:
                y3.d2(new ih1(6, null));
                break;
        }
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        int i10 = h4.k0;
        return 0;
    }

    public /* synthetic */ h(y3 y3Var) {
        this.a = 7;
    }
}
