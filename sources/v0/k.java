package v0;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.SpannableString;
import android.util.Log;
import b2.p1;
import com.google.android.gms.internal.cast.z5;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import e9.l0;
import e9.x1;
import java.io.File;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import org.telegram.messenger.GenericProvider;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.z1;
import u2.t1;
import yh.f4;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements q3.g, d9.k, Continuation, e2.j, r9.d, z1, GenericProvider, Vector.TLDeserializer {
    public final /* synthetic */ int a;

    public /* synthetic */ k(int i10) {
        this.a = i10;
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
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v32, types: [android.text.Spannable, android.text.SpannableString] */
    /* JADX WARN: Type inference failed for: r2v4 */
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
            case 5:
                return Long.valueOf(((z3.a) obj).b);
            case 6:
                return Long.valueOf(((z3.a) obj).c);
            case 7:
                return (w3.q) obj;
            case 8:
                t1 t1Var = (t1) obj;
                t1Var.getClass();
                Bundle bundle = new Bundle();
                String str4 = t1.e;
                x1 x1Var = t1Var.b;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(x1Var.d);
                l0 listIterator = x1Var.listIterator(0);
                while (listIterator.hasNext()) {
                    arrayList.add(((p1) listIterator.next()).c());
                }
                bundle.putParcelableArrayList(str4, arrayList);
                return bundle;
            case 16:
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
                            int i15 = bundle3.getInt(d2.d.a);
                            int i16 = bundle3.getInt(d2.d.b);
                            int i17 = bundle3.getInt(d2.d.c);
                            int i18 = bundle3.getInt(d2.d.d, -1);
                            Bundle bundle4 = bundle3.getBundle(d2.d.e);
                            if (i18 == i13) {
                                bundle4.getClass();
                                String string = bundle4.getString(d2.f.c);
                                string.getClass();
                                charSequence2.setSpan(new d2.f(string, bundle4.getInt(d2.f.d)), i15, i16, i17);
                            } else if (i18 == 2) {
                                bundle4.getClass();
                                charSequence2.setSpan(new d2.g(bundle4.getInt(d2.g.d), bundle4.getInt(d2.g.e), bundle4.getInt(d2.g.f)), i15, i16, i17);
                            } else if (i18 == 3) {
                                charSequence2.setSpan(new d2.e(), i15, i16, i17);
                            } else if (i18 == 4) {
                                bundle4.getClass();
                                String string2 = bundle4.getString(d2.h.b);
                                string2.getClass();
                                charSequence2.setSpan(new d2.h(string2), i15, i16, i17);
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
                        String str5 = d2.b.y;
                        containsKey = bundle2.containsKey(str5);
                        int i19 = TLObject.FLAG_31;
                        if (containsKey) {
                            String str6 = d2.b.z;
                            if (bundle2.containsKey(str6)) {
                                f7 = bundle2.getFloat(str5);
                                i10 = bundle2.getInt(str6);
                                String str7 = d2.b.A;
                                int i20 = bundle2.containsKey(str7) ? bundle2.getInt(str7) : Integer.MIN_VALUE;
                                String str8 = d2.b.B;
                                float f11 = bundle2.containsKey(str8) ? bundle2.getFloat(str8) : -3.4028235E38f;
                                String str9 = d2.b.C;
                                int i21 = bundle2.containsKey(str9) ? bundle2.getInt(str9) : Integer.MIN_VALUE;
                                str = d2.b.E;
                                if (bundle2.containsKey(str)) {
                                    String str10 = d2.b.D;
                                    if (bundle2.containsKey(str10)) {
                                        f10 = bundle2.getFloat(str);
                                        i11 = bundle2.getInt(str10);
                                        String str11 = d2.b.F;
                                        float f12 = !bundle2.containsKey(str11) ? bundle2.getFloat(str11) : -3.4028235E38f;
                                        String str12 = d2.b.G;
                                        float f13 = bundle2.containsKey(str12) ? bundle2.getFloat(str12) : -3.4028235E38f;
                                        str2 = d2.b.H;
                                        if (bundle2.containsKey(str2)) {
                                            i12 = -16777216;
                                            z10 = false;
                                        } else {
                                            i12 = bundle2.getInt(str2);
                                            z10 = true;
                                        }
                                        int i22 = i12;
                                        boolean z11 = bundle2.getBoolean(d2.b.I, false) ? false : z10;
                                        str3 = d2.b.J;
                                        if (bundle2.containsKey(str3)) {
                                            i19 = bundle2.getInt(str3);
                                        }
                                        int i23 = i19;
                                        String str13 = d2.b.K;
                                        float f14 = !bundle2.containsKey(str13) ? bundle2.getFloat(str13) : 0.0f;
                                        String str14 = d2.b.L;
                                        return new d2.b(charSequence, alignment2, alignment4, bitmap, f7, i10, i20, f11, i21, i11, f10, f12, f13, z11, i22, i23, f14, bundle2.containsKey(str14) ? bundle2.getInt(str14) : 0);
                                    }
                                }
                                f10 = -3.4028235E38f;
                                i11 = Integer.MIN_VALUE;
                                String str112 = d2.b.F;
                                if (!bundle2.containsKey(str112)) {
                                }
                                String str122 = d2.b.G;
                                float f132 = bundle2.containsKey(str122) ? bundle2.getFloat(str122) : -3.4028235E38f;
                                str2 = d2.b.H;
                                if (bundle2.containsKey(str2)) {
                                }
                                int i222 = i12;
                                if (bundle2.getBoolean(d2.b.I, false)) {
                                }
                                str3 = d2.b.J;
                                if (bundle2.containsKey(str3)) {
                                }
                                int i232 = i19;
                                String str132 = d2.b.K;
                                float f142 = !bundle2.containsKey(str132) ? bundle2.getFloat(str132) : 0.0f;
                                String str142 = d2.b.L;
                                return new d2.b(charSequence, alignment2, alignment4, bitmap, f7, i10, i20, f11, i21, i11, f10, f12, f132, z11, i222, i232, f142, bundle2.containsKey(str142) ? bundle2.getInt(str142) : 0);
                            }
                        }
                        f7 = -3.4028235E38f;
                        i10 = Integer.MIN_VALUE;
                        String str72 = d2.b.A;
                        if (bundle2.containsKey(str72)) {
                        }
                        String str82 = d2.b.B;
                        if (bundle2.containsKey(str82)) {
                        }
                        String str92 = d2.b.C;
                        if (bundle2.containsKey(str92)) {
                        }
                        str = d2.b.E;
                        if (bundle2.containsKey(str)) {
                        }
                        f10 = -3.4028235E38f;
                        i11 = Integer.MIN_VALUE;
                        String str1122 = d2.b.F;
                        if (!bundle2.containsKey(str1122)) {
                        }
                        String str1222 = d2.b.G;
                        float f1322 = bundle2.containsKey(str1222) ? bundle2.getFloat(str1222) : -3.4028235E38f;
                        str2 = d2.b.H;
                        if (bundle2.containsKey(str2)) {
                        }
                        int i2222 = i12;
                        if (bundle2.getBoolean(d2.b.I, false)) {
                        }
                        str3 = d2.b.J;
                        if (bundle2.containsKey(str3)) {
                        }
                        int i2322 = i19;
                        String str1322 = d2.b.K;
                        float f1422 = !bundle2.containsKey(str1322) ? bundle2.getFloat(str1322) : 0.0f;
                        String str1422 = d2.b.L;
                        return new d2.b(charSequence, alignment2, alignment4, bitmap, f7, i10, i20, f11, i21, i11, f10, f12, f1322, z11, i2222, i2322, f1422, bundle2.containsKey(str1422) ? bundle2.getInt(str1422) : 0);
                    }
                    bitmap = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
                }
                charSequence = null;
                String str52 = d2.b.y;
                containsKey = bundle2.containsKey(str52);
                int i192 = TLObject.FLAG_31;
                if (containsKey) {
                }
                f7 = -3.4028235E38f;
                i10 = Integer.MIN_VALUE;
                String str722 = d2.b.A;
                if (bundle2.containsKey(str722)) {
                }
                String str822 = d2.b.B;
                if (bundle2.containsKey(str822)) {
                }
                String str922 = d2.b.C;
                if (bundle2.containsKey(str922)) {
                }
                str = d2.b.E;
                if (bundle2.containsKey(str)) {
                }
                f10 = -3.4028235E38f;
                i11 = Integer.MIN_VALUE;
                String str11222 = d2.b.F;
                if (!bundle2.containsKey(str11222)) {
                }
                String str12222 = d2.b.G;
                float f13222 = bundle2.containsKey(str12222) ? bundle2.getFloat(str12222) : -3.4028235E38f;
                str2 = d2.b.H;
                if (bundle2.containsKey(str2)) {
                }
                int i22222 = i12;
                if (bundle2.getBoolean(d2.b.I, false)) {
                }
                str3 = d2.b.J;
                if (bundle2.containsKey(str3)) {
                }
                int i23222 = i192;
                String str13222 = d2.b.K;
                float f14222 = !bundle2.containsKey(str13222) ? bundle2.getFloat(str13222) : 0.0f;
                String str14222 = d2.b.L;
                return new d2.b(charSequence, alignment2, alignment4, bitmap, f7, i10, i20, f11, i21, i11, f10, f12, f13222, z11, i22222, i23222, f14222, bundle2.containsKey(str14222) ? bundle2.getInt(str14222) : 0);
            default:
                long j10 = ((z3.a) obj).b;
                if (j10 == -9223372036854775807L) {
                    j10 = 0;
                }
                return Long.valueOf(j10);
        }
    }

    @Override // q3.g
    public boolean b(int i10, int i11, int i12, int i13, int i14) {
        if (i11 == 67 && i12 == 79 && i13 == 77 && (i14 == 77 || i10 == 2)) {
            return true;
        }
        if (i11 == 77 && i12 == 76 && i13 == 76) {
            return i14 == 84 || i10 == 2;
        }
        return false;
    }

    @Override // org.telegram.tgnet.Vector.TLDeserializer
    public TLObject deserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
        return TLRPC.MessageReplyHeader.TLdeserialize(inputSerializedData, i10, z10);
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(c2 c2Var, int i10) {
        switch (this.a) {
            case 13:
                c2Var.dismiss();
                break;
            default:
                c2Var.dismiss();
                break;
        }
    }

    @Override // r9.d
    public Object j2(z5 z5Var) {
        Set y3 = z5Var.y(ya.a.class);
        ya.c cVar = ya.c.c;
        if (cVar == null) {
            synchronized (ya.c.class) {
                try {
                    cVar = ya.c.c;
                    if (cVar == null) {
                        cVar = new ya.c();
                        ya.c.c = cVar;
                    }
                } finally {
                }
            }
        }
        return new ya.b(y3, cVar);
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        int i10 = f4.k0;
        return 0;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        boolean z10;
        if (task.isSuccessful()) {
            x9.b bVar = (x9.b) task.getResult();
            String str = "Crashlytics report successfully enqueued to DataTransport: " + bVar.b;
            u9.b bVar2 = u9.b.a;
            bVar2.b(str);
            File file = bVar.c;
            z10 = true;
            if (file.delete()) {
                bVar2.b("Deleted report file: " + file.getPath());
            } else {
                bVar2.d("Crashlytics could not delete report file: " + file.getPath(), null);
            }
        } else {
            Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", task.getException());
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    public /* synthetic */ k(com.google.firebase.messaging.l lVar) {
        this.a = 10;
    }
}
