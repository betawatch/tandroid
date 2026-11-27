// default package

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.OpusDred;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.AnimatedFileNative;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.p;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class oy6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ oy6(sp7 sp7Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.a = (byte) 13;
        this.b = sp7Var;
        this.d = arrayList;
        this.e = arrayList2;
        this.c = arrayList3;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(52:0|1|2|3|(2:273|274)|5|7|8|9|(3:11|12|13)(1:269)|14|(1:266)(2:17|(38:19|(1:21)(1:263)|(1:262)(2:24|(34:26|(1:28)(1:258)|(1:257)(2:31|(30:33|(1:35)(1:254)|(1:253)(2:38|(25:40|41|(5:184|185|(2:187|(14:189|190|191|192|193|194|(1:240)(4:198|199|200|201)|202|(1:236)(5:206|207|208|209|210)|211|212|(5:216|217|218|219|220)|230|228))|247|228)(1:43)|44|45|46|(9:47|(7:49|50|(1:52)(1:61)|53|54|(2:56|57)(2:59|60)|58)(1:70)|62|63|64|65|66|67|68)|71|(1:182)(1:77)|78|(2:(2:107|(1:109))(1:82)|83)(2:(7:115|116|(1:118)(6:171|172|173|174|175|176)|119|(5:123|(2:125|(1:126))|130|(1:132)(1:169)|(3:134|135|(2:137|138)))|170|(0))(1:113)|114)|(1:85)|86|(1:88)|(1:90)|91|(1:93)|(1:95)|97|98|99|100|101|67|68))|(1:251)|252|41|(0)(0)|44|45|46|(10:47|(0)(0)|62|63|64|65|66|67|68|58)|71|(1:73)|182|78|(0)(0)|(0)|86|(0)|(0)|91|(0)|(0)|97|98|99|100|101|67|68))|(1:256)|(0)(0)|(0)|253|(0)|252|41|(0)(0)|44|45|46|(10:47|(0)(0)|62|63|64|65|66|67|68|58)|71|(0)|182|78|(0)(0)|(0)|86|(0)|(0)|91|(0)|(0)|97|98|99|100|101|67|68))|(1:260)(1:261)|(0)(0)|(0)|257|(0)|(0)(0)|(0)|253|(0)|252|41|(0)(0)|44|45|46|(10:47|(0)(0)|62|63|64|65|66|67|68|58)|71|(0)|182|78|(0)(0)|(0)|86|(0)|(0)|91|(0)|(0)|97|98|99|100|101|67|68))|(1:265)|(0)(0)|(0)|262|(0)(0)|(0)(0)|(0)|257|(0)|(0)(0)|(0)|253|(0)|252|41|(0)(0)|44|45|46|(10:47|(0)(0)|62|63|64|65|66|67|68|58)|71|(0)|182|78|(0)(0)|(0)|86|(0)|(0)|91|(0)|(0)|97|98|99|100|101|67|68|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x059f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x05a1, code lost:
    
        cc4.g(r0, true);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03e9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0408 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0128 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c3 A[Catch: all -> 0x05ba, TryCatch #16 {all -> 0x05ba, blocks: (B:13:0x00a0, B:17:0x00b0, B:21:0x00c3, B:24:0x00cd, B:28:0x00e3, B:31:0x00f1, B:35:0x0104, B:38:0x010e, B:41:0x0120, B:185:0x0128, B:187:0x0136, B:191:0x0143, B:194:0x0152, B:196:0x015c, B:198:0x0167, B:201:0x0177, B:202:0x017e, B:204:0x0186, B:206:0x0192, B:209:0x01a4, B:212:0x01b5, B:214:0x01bd, B:216:0x01c9, B:219:0x01d8, B:227:0x0202, B:45:0x021a), top: B:12:0x00a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e3 A[Catch: all -> 0x05ba, TryCatch #16 {all -> 0x05ba, blocks: (B:13:0x00a0, B:17:0x00b0, B:21:0x00c3, B:24:0x00cd, B:28:0x00e3, B:31:0x00f1, B:35:0x0104, B:38:0x010e, B:41:0x0120, B:185:0x0128, B:187:0x0136, B:191:0x0143, B:194:0x0152, B:196:0x015c, B:198:0x0167, B:201:0x0177, B:202:0x017e, B:204:0x0186, B:206:0x0192, B:209:0x01a4, B:212:0x01b5, B:214:0x01bd, B:216:0x01c9, B:219:0x01d8, B:227:0x0202, B:45:0x021a), top: B:12:0x00a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ef A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0104 A[Catch: all -> 0x05ba, TryCatch #16 {all -> 0x05ba, blocks: (B:13:0x00a0, B:17:0x00b0, B:21:0x00c3, B:24:0x00cd, B:28:0x00e3, B:31:0x00f1, B:35:0x0104, B:38:0x010e, B:41:0x0120, B:185:0x0128, B:187:0x0136, B:191:0x0143, B:194:0x0152, B:196:0x015c, B:198:0x0167, B:201:0x0177, B:202:0x017e, B:204:0x0186, B:206:0x0192, B:209:0x01a4, B:212:0x01b5, B:214:0x01bd, B:216:0x01c9, B:219:0x01d8, B:227:0x0202, B:45:0x021a), top: B:12:0x00a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0276 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x029a A[EDGE_INSN: B:70:0x029a->B:71:0x029a BREAK  A[LOOP:0: B:47:0x0272->B:58:0x0290], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02a3 A[Catch: all -> 0x05b7, TryCatch #14 {all -> 0x05b7, blocks: (B:50:0x0276, B:54:0x0284, B:58:0x0290, B:71:0x029a, B:73:0x02a3, B:75:0x02ab, B:77:0x02b3, B:82:0x02bf, B:83:0x02ea, B:85:0x0417, B:86:0x0438, B:88:0x044f, B:90:0x046d, B:91:0x0492, B:93:0x0512, B:95:0x0535, B:107:0x02c5, B:109:0x02da, B:111:0x0303, B:138:0x03e9, B:142:0x03ef, B:153:0x0411, B:150:0x0408), top: B:49:0x0276, inners: #4, #22 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0417 A[Catch: all -> 0x05b7, TryCatch #14 {all -> 0x05b7, blocks: (B:50:0x0276, B:54:0x0284, B:58:0x0290, B:71:0x029a, B:73:0x02a3, B:75:0x02ab, B:77:0x02b3, B:82:0x02bf, B:83:0x02ea, B:85:0x0417, B:86:0x0438, B:88:0x044f, B:90:0x046d, B:91:0x0492, B:93:0x0512, B:95:0x0535, B:107:0x02c5, B:109:0x02da, B:111:0x0303, B:138:0x03e9, B:142:0x03ef, B:153:0x0411, B:150:0x0408), top: B:49:0x0276, inners: #4, #22 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x044f A[Catch: all -> 0x05b7, TryCatch #14 {all -> 0x05b7, blocks: (B:50:0x0276, B:54:0x0284, B:58:0x0290, B:71:0x029a, B:73:0x02a3, B:75:0x02ab, B:77:0x02b3, B:82:0x02bf, B:83:0x02ea, B:85:0x0417, B:86:0x0438, B:88:0x044f, B:90:0x046d, B:91:0x0492, B:93:0x0512, B:95:0x0535, B:107:0x02c5, B:109:0x02da, B:111:0x0303, B:138:0x03e9, B:142:0x03ef, B:153:0x0411, B:150:0x0408), top: B:49:0x0276, inners: #4, #22 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x046d A[Catch: all -> 0x05b7, TryCatch #14 {all -> 0x05b7, blocks: (B:50:0x0276, B:54:0x0284, B:58:0x0290, B:71:0x029a, B:73:0x02a3, B:75:0x02ab, B:77:0x02b3, B:82:0x02bf, B:83:0x02ea, B:85:0x0417, B:86:0x0438, B:88:0x044f, B:90:0x046d, B:91:0x0492, B:93:0x0512, B:95:0x0535, B:107:0x02c5, B:109:0x02da, B:111:0x0303, B:138:0x03e9, B:142:0x03ef, B:153:0x0411, B:150:0x0408), top: B:49:0x0276, inners: #4, #22 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0512 A[Catch: all -> 0x05b7, TryCatch #14 {all -> 0x05b7, blocks: (B:50:0x0276, B:54:0x0284, B:58:0x0290, B:71:0x029a, B:73:0x02a3, B:75:0x02ab, B:77:0x02b3, B:82:0x02bf, B:83:0x02ea, B:85:0x0417, B:86:0x0438, B:88:0x044f, B:90:0x046d, B:91:0x0492, B:93:0x0512, B:95:0x0535, B:107:0x02c5, B:109:0x02da, B:111:0x0303, B:138:0x03e9, B:142:0x03ef, B:153:0x0411, B:150:0x0408), top: B:49:0x0276, inners: #4, #22 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0535 A[Catch: all -> 0x05b7, TRY_LEAVE, TryCatch #14 {all -> 0x05b7, blocks: (B:50:0x0276, B:54:0x0284, B:58:0x0290, B:71:0x029a, B:73:0x02a3, B:75:0x02ab, B:77:0x02b3, B:82:0x02bf, B:83:0x02ea, B:85:0x0417, B:86:0x0438, B:88:0x044f, B:90:0x046d, B:91:0x0492, B:93:0x0512, B:95:0x0535, B:107:0x02c5, B:109:0x02da, B:111:0x0303, B:138:0x03e9, B:142:0x03ef, B:153:0x0411, B:150:0x0408), top: B:49:0x0276, inners: #4, #22 }] */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.nio.channels.FileChannel] */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r10v35 */
    /* JADX WARN: Type inference failed for: r10v37 */
    /* JADX WARN: Type inference failed for: r10v45 */
    /* JADX WARN: Type inference failed for: r10v47 */
    /* JADX WARN: Type inference failed for: r10v50 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r7v18, types: [ih7] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a() {
        ?? r10;
        uc7 uc7Var;
        znb znbVar;
        String str;
        String str2;
        boolean z;
        String str3;
        String[] strArr;
        SparseIntArray R0;
        int i;
        Bitmap a;
        Canvas canvas;
        Paint paint;
        int G0;
        int G02;
        int G03;
        int G04;
        int G05;
        int G06;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        String[] strArr2;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        String queryParameter;
        int i24;
        Drawable mutate;
        Drawable mutate2;
        Drawable mutate3;
        Drawable mutate4;
        int i25;
        t37[] t37VarArr;
        int i26;
        int i27;
        Bitmap bitmap;
        FileInputStream fileInputStream;
        File file;
        boolean z2;
        int i28;
        Bitmap decodeStream;
        int i29;
        ColorDrawable colorDrawable;
        avc d;
        uc7 uc7Var2 = (uc7) this.b;
        String str4 = (String) this.c;
        ynb ynbVar = (ynb) this.d;
        znb znbVar2 = (znb) this.e;
        int i30 = aob.a;
        try {
            strArr = new String[1];
            R0 = aob.R0(new File(str4), null, strArr);
            if (ynbVar != null) {
                try {
                    aob.G(R0, ynbVar.b);
                } catch (Throwable th) {
                    th = th;
                    str3 = null;
                    z = true;
                    uc7Var = uc7Var2;
                    znbVar = znbVar2;
                }
            }
            i = aob.km.get(aob.g5, -1);
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            a = lc1.a(560, 678);
            canvas = new Canvas(a);
            paint = new Paint();
            G0 = aob.G0(R0, aob.s8);
            G02 = aob.G0(R0, aob.v8);
            try {
                G03 = aob.G0(R0, aob.Je);
                G04 = aob.G0(R0, aob.Oe);
                G05 = aob.G0(R0, aob.ra);
                G06 = aob.G0(R0, aob.rb);
                R0.get(aob.ub);
                int i31 = R0.get(aob.Ee);
                i2 = R0.get(aob.Fe);
                i3 = i31;
                i4 = R0.get(aob.Ge);
                i5 = R0.get(aob.He);
                if (ynbVar != null) {
                    uc7Var = uc7Var2;
                    i6 = 0;
                    try {
                        i7 = (int) ynbVar.j;
                    } catch (Throwable th2) {
                        th = th2;
                        znbVar = znbVar2;
                        r10 = 0;
                        z = true;
                        str3 = r10;
                        cc4.g(th, z);
                        str2 = str3;
                        str = str2;
                        hl.c3(new tw4((Object) uc7Var, (Object) str, (Object) str4, (Object) ynbVar, (Object) znbVar, (byte) 23));
                    }
                } else {
                    uc7Var = uc7Var2;
                    i6 = 0;
                    i7 = 0;
                }
            } catch (Throwable th3) {
                th = th3;
                uc7Var = uc7Var2;
            }
        } catch (Throwable th4) {
            th = th4;
            r10 = 0;
            uc7Var = uc7Var2;
            znbVar = znbVar2;
        }
        if (i7 != 0 || ynbVar == null) {
            i8 = i7;
        } else {
            i8 = i7;
            if (ynbVar.j != 0) {
                i3 = i6;
                i9 = ynbVar == null ? (int) ynbVar.k : i6;
                if (i9 == 0 || ynbVar == null) {
                    i10 = i9;
                } else {
                    i10 = i9;
                    if (ynbVar.k != 0) {
                        i11 = i6;
                        if (ynbVar != null) {
                            i12 = i11;
                            i13 = (int) ynbVar.l;
                        } else {
                            i12 = i11;
                            i13 = i6;
                        }
                        if (i13 == 0 || ynbVar == null) {
                            i14 = i13;
                        } else {
                            i14 = i13;
                            if (ynbVar.l != 0) {
                                i4 = i6;
                                i15 = ynbVar == null ? (int) ynbVar.m : i6;
                                if (i15 == 0 || ynbVar == null) {
                                    i16 = i15;
                                } else {
                                    i16 = i15;
                                    if (ynbVar.m != 0) {
                                        i17 = i6;
                                        if (TextUtils.isEmpty(strArr[i6])) {
                                            i18 = i17;
                                            strArr2 = strArr;
                                            i19 = G03;
                                            i22 = i3;
                                            i23 = i4;
                                            i21 = i12;
                                        } else {
                                            try {
                                                queryParameter = Uri.parse(strArr[i6]).getQueryParameter("bg_color");
                                            } catch (Exception e) {
                                                e = e;
                                                i18 = i17;
                                                strArr2 = strArr;
                                            }
                                            if (ynbVar != null) {
                                                if (!TextUtils.isEmpty(queryParameter)) {
                                                    i18 = i17;
                                                    strArr2 = strArr;
                                                    try {
                                                        int parseInt = Integer.parseInt(queryParameter.substring(i6, 6), 16) | (-16777216);
                                                        try {
                                                            ynbVar.j = parseInt;
                                                            if (queryParameter.length() < 13 || !hl.Q1(queryParameter.charAt(6))) {
                                                                i24 = parseInt;
                                                                i20 = i12;
                                                            } else {
                                                                i20 = Integer.parseInt(queryParameter.substring(7, 13), 16) | (-16777216);
                                                                i24 = parseInt;
                                                                try {
                                                                    ynbVar.k = i20;
                                                                } catch (Exception e2) {
                                                                    e = e2;
                                                                    i19 = G03;
                                                                    i3 = i24;
                                                                    cc4.g(e, true);
                                                                    i21 = i20;
                                                                    i22 = i3;
                                                                    i23 = i4;
                                                                    int i32 = i18;
                                                                    mutate = a.b.getResources().getDrawable(R.drawable.preview_back).mutate();
                                                                    aob.A1(G02, mutate);
                                                                    mutate2 = a.b.getResources().getDrawable(R.drawable.preview_dots).mutate();
                                                                    aob.A1(G02, mutate2);
                                                                    mutate3 = a.b.getResources().getDrawable(R.drawable.preview_smile).mutate();
                                                                    aob.A1(G04, mutate3);
                                                                    int i33 = i19;
                                                                    mutate4 = a.b.getResources().getDrawable(R.drawable.preview_mic).mutate();
                                                                    aob.A1(G04, mutate4);
                                                                    i25 = 2;
                                                                    t37VarArr = new t37[2];
                                                                    znbVar = znbVar2;
                                                                    i26 = 0;
                                                                    while (true) {
                                                                        int i34 = i25;
                                                                        if (i26 >= i25) {
                                                                        }
                                                                        th = th;
                                                                        r10 = 0;
                                                                        z = true;
                                                                        str3 = r10;
                                                                        cc4.g(th, z);
                                                                        str2 = str3;
                                                                        str = str2;
                                                                        hl.c3(new tw4((Object) uc7Var, (Object) str, (Object) str4, (Object) ynbVar, (Object) znbVar, (byte) 23));
                                                                        aob.A1(r27 == 0 ? G05 : G06, r10);
                                                                        i26 = r27 + 1;
                                                                        i25 = i34;
                                                                        t37VarArr = r34;
                                                                    }
                                                                    t37[] t37VarArr2 = t37VarArr;
                                                                    RectF rectF = new RectF();
                                                                    if (ynbVar != null) {
                                                                    }
                                                                    if (i22 != 0) {
                                                                    }
                                                                    if (!z2) {
                                                                    }
                                                                    paint.setColor(G0);
                                                                    canvas.drawRect(0.0f, 0.0f, bitmap.getWidth(), 120.0f, paint);
                                                                    if (mutate != null) {
                                                                    }
                                                                    if (mutate2 != null) {
                                                                    }
                                                                    t37VarArr2[1].setBounds(jn7.q2, jn7.s3, bitmap.getWidth() - 20, jn7.e5);
                                                                    t37VarArr2[1].o(0, 560, 522);
                                                                    t37VarArr2[1].draw(canvas);
                                                                    t37VarArr2[1].setBounds(jn7.q2, 430, bitmap.getWidth() - 20, 522);
                                                                    t37VarArr2[1].o(430, 560, 522);
                                                                    t37VarArr2[1].draw(canvas);
                                                                    t37VarArr2[0].setBounds(20, jn7.t5, 399, 415);
                                                                    t37VarArr2[0].o(jn7.t5, 560, 522);
                                                                    t37VarArr2[0].draw(canvas);
                                                                    paint.setColor(i33);
                                                                    canvas.drawRect(0.0f, bitmap.getHeight() - 120, bitmap.getWidth(), bitmap.getHeight(), paint);
                                                                    if (mutate3 != null) {
                                                                    }
                                                                    if (mutate4 != null) {
                                                                    }
                                                                    r10 = 0;
                                                                    r10 = 0;
                                                                    str2 = null;
                                                                    canvas.setBitmap(null);
                                                                    File file2 = new File(xb4.z(4), "-2147483648_" + xea.p() + ".jpg");
                                                                    bitmap.compress(Bitmap.CompressFormat.JPEG, 80, new FileOutputStream(file2));
                                                                    xea.x();
                                                                    str = file2.getAbsolutePath();
                                                                    hl.c3(new tw4((Object) uc7Var, (Object) str, (Object) str4, (Object) ynbVar, (Object) znbVar, (byte) 23));
                                                                }
                                                            }
                                                            if (queryParameter.length() < 20 || !hl.Q1(queryParameter.charAt(13))) {
                                                                i19 = G03;
                                                                i12 = i20;
                                                            } else {
                                                                int parseInt2 = Integer.parseInt(queryParameter.substring(14, 20), 16) | (-16777216);
                                                                i19 = G03;
                                                                i12 = i20;
                                                                try {
                                                                    ynbVar.l = parseInt2;
                                                                    i4 = parseInt2;
                                                                } catch (Exception e3) {
                                                                    e = e3;
                                                                    i4 = parseInt2;
                                                                    i20 = i12;
                                                                    i3 = i24;
                                                                    cc4.g(e, true);
                                                                    i21 = i20;
                                                                    i22 = i3;
                                                                    i23 = i4;
                                                                    int i322 = i18;
                                                                    mutate = a.b.getResources().getDrawable(R.drawable.preview_back).mutate();
                                                                    aob.A1(G02, mutate);
                                                                    mutate2 = a.b.getResources().getDrawable(R.drawable.preview_dots).mutate();
                                                                    aob.A1(G02, mutate2);
                                                                    mutate3 = a.b.getResources().getDrawable(R.drawable.preview_smile).mutate();
                                                                    aob.A1(G04, mutate3);
                                                                    int i332 = i19;
                                                                    mutate4 = a.b.getResources().getDrawable(R.drawable.preview_mic).mutate();
                                                                    aob.A1(G04, mutate4);
                                                                    i25 = 2;
                                                                    t37VarArr = new t37[2];
                                                                    znbVar = znbVar2;
                                                                    i26 = 0;
                                                                    while (true) {
                                                                        int i342 = i25;
                                                                        if (i26 >= i25) {
                                                                        }
                                                                        th = th;
                                                                        r10 = 0;
                                                                        z = true;
                                                                        str3 = r10;
                                                                        cc4.g(th, z);
                                                                        str2 = str3;
                                                                        str = str2;
                                                                        hl.c3(new tw4((Object) uc7Var, (Object) str, (Object) str4, (Object) ynbVar, (Object) znbVar, (byte) 23));
                                                                        aob.A1(r27 == 0 ? G05 : G06, r10);
                                                                        i26 = r27 + 1;
                                                                        i25 = i342;
                                                                        t37VarArr = r34;
                                                                    }
                                                                    t37[] t37VarArr22 = t37VarArr;
                                                                    RectF rectF2 = new RectF();
                                                                    if (ynbVar != null) {
                                                                    }
                                                                    if (i22 != 0) {
                                                                    }
                                                                    if (!z2) {
                                                                    }
                                                                    paint.setColor(G0);
                                                                    canvas.drawRect(0.0f, 0.0f, bitmap.getWidth(), 120.0f, paint);
                                                                    if (mutate != null) {
                                                                    }
                                                                    if (mutate2 != null) {
                                                                    }
                                                                    t37VarArr22[1].setBounds(jn7.q2, jn7.s3, bitmap.getWidth() - 20, jn7.e5);
                                                                    t37VarArr22[1].o(0, 560, 522);
                                                                    t37VarArr22[1].draw(canvas);
                                                                    t37VarArr22[1].setBounds(jn7.q2, 430, bitmap.getWidth() - 20, 522);
                                                                    t37VarArr22[1].o(430, 560, 522);
                                                                    t37VarArr22[1].draw(canvas);
                                                                    t37VarArr22[0].setBounds(20, jn7.t5, 399, 415);
                                                                    t37VarArr22[0].o(jn7.t5, 560, 522);
                                                                    t37VarArr22[0].draw(canvas);
                                                                    paint.setColor(i332);
                                                                    canvas.drawRect(0.0f, bitmap.getHeight() - 120, bitmap.getWidth(), bitmap.getHeight(), paint);
                                                                    if (mutate3 != null) {
                                                                    }
                                                                    if (mutate4 != null) {
                                                                    }
                                                                    r10 = 0;
                                                                    r10 = 0;
                                                                    str2 = null;
                                                                    canvas.setBitmap(null);
                                                                    File file22 = new File(xb4.z(4), "-2147483648_" + xea.p() + ".jpg");
                                                                    bitmap.compress(Bitmap.CompressFormat.JPEG, 80, new FileOutputStream(file22));
                                                                    xea.x();
                                                                    str = file22.getAbsolutePath();
                                                                    hl.c3(new tw4((Object) uc7Var, (Object) str, (Object) str4, (Object) ynbVar, (Object) znbVar, (byte) 23));
                                                                }
                                                            }
                                                            try {
                                                                if (queryParameter.length() == 27 && hl.Q1(queryParameter.charAt(20))) {
                                                                    int parseInt3 = Integer.parseInt(queryParameter.substring(21), 16) | (-16777216);
                                                                    try {
                                                                        ynbVar.m = parseInt3;
                                                                        i18 = parseInt3;
                                                                    } catch (Exception e4) {
                                                                        e = e4;
                                                                        i18 = parseInt3;
                                                                        i20 = i12;
                                                                        i3 = i24;
                                                                        cc4.g(e, true);
                                                                        i21 = i20;
                                                                        i22 = i3;
                                                                        i23 = i4;
                                                                        int i3222 = i18;
                                                                        mutate = a.b.getResources().getDrawable(R.drawable.preview_back).mutate();
                                                                        aob.A1(G02, mutate);
                                                                        mutate2 = a.b.getResources().getDrawable(R.drawable.preview_dots).mutate();
                                                                        aob.A1(G02, mutate2);
                                                                        mutate3 = a.b.getResources().getDrawable(R.drawable.preview_smile).mutate();
                                                                        aob.A1(G04, mutate3);
                                                                        int i3322 = i19;
                                                                        mutate4 = a.b.getResources().getDrawable(R.drawable.preview_mic).mutate();
                                                                        aob.A1(G04, mutate4);
                                                                        i25 = 2;
                                                                        t37VarArr = new t37[2];
                                                                        znbVar = znbVar2;
                                                                        i26 = 0;
                                                                        while (true) {
                                                                            int i3422 = i25;
                                                                            if (i26 >= i25) {
                                                                            }
                                                                            th = th;
                                                                            r10 = 0;
                                                                            z = true;
                                                                            str3 = r10;
                                                                            cc4.g(th, z);
                                                                            str2 = str3;
                                                                            str = str2;
                                                                            hl.c3(new tw4((Object) uc7Var, (Object) str, (Object) str4, (Object) ynbVar, (Object) znbVar, (byte) 23));
                                                                            aob.A1(r27 == 0 ? G05 : G06, r10);
                                                                            i26 = r27 + 1;
                                                                            i25 = i3422;
                                                                            t37VarArr = r34;
                                                                        }
                                                                        t37[] t37VarArr222 = t37VarArr;
                                                                        RectF rectF22 = new RectF();
                                                                        if (ynbVar != null) {
                                                                        }
                                                                        if (i22 != 0) {
                                                                        }
                                                                        if (!z2) {
                                                                        }
                                                                        paint.setColor(G0);
                                                                        canvas.drawRect(0.0f, 0.0f, bitmap.getWidth(), 120.0f, paint);
                                                                        if (mutate != null) {
                                                                        }
                                                                        if (mutate2 != null) {
                                                                        }
                                                                        t37VarArr222[1].setBounds(jn7.q2, jn7.s3, bitmap.getWidth() - 20, jn7.e5);
                                                                        t37VarArr222[1].o(0, 560, 522);
                                                                        t37VarArr222[1].draw(canvas);
                                                                        t37VarArr222[1].setBounds(jn7.q2, 430, bitmap.getWidth() - 20, 522);
                                                                        t37VarArr222[1].o(430, 560, 522);
                                                                        t37VarArr222[1].draw(canvas);
                                                                        t37VarArr222[0].setBounds(20, jn7.t5, 399, 415);
                                                                        t37VarArr222[0].o(jn7.t5, 560, 522);
                                                                        t37VarArr222[0].draw(canvas);
                                                                        paint.setColor(i3322);
                                                                        canvas.drawRect(0.0f, bitmap.getHeight() - 120, bitmap.getWidth(), bitmap.getHeight(), paint);
                                                                        if (mutate3 != null) {
                                                                        }
                                                                        if (mutate4 != null) {
                                                                        }
                                                                        r10 = 0;
                                                                        r10 = 0;
                                                                        str2 = null;
                                                                        canvas.setBitmap(null);
                                                                        File file222 = new File(xb4.z(4), "-2147483648_" + xea.p() + ".jpg");
                                                                        bitmap.compress(Bitmap.CompressFormat.JPEG, 80, new FileOutputStream(file222));
                                                                        xea.x();
                                                                        str = file222.getAbsolutePath();
                                                                        hl.c3(new tw4((Object) uc7Var, (Object) str, (Object) str4, (Object) ynbVar, (Object) znbVar, (byte) 23));
                                                                    }
                                                                }
                                                                i20 = i12;
                                                                i3 = i24;
                                                            } catch (Exception e5) {
                                                                e = e5;
                                                            }
                                                        } catch (Exception e6) {
                                                            e = e6;
                                                            i24 = parseInt;
                                                            i19 = G03;
                                                        }
                                                    } catch (Exception e7) {
                                                        e = e7;
                                                        i19 = G03;
                                                        i20 = i12;
                                                        cc4.g(e, true);
                                                        i21 = i20;
                                                        i22 = i3;
                                                        i23 = i4;
                                                        int i32222 = i18;
                                                        mutate = a.b.getResources().getDrawable(R.drawable.preview_back).mutate();
                                                        aob.A1(G02, mutate);
                                                        mutate2 = a.b.getResources().getDrawable(R.drawable.preview_dots).mutate();
                                                        aob.A1(G02, mutate2);
                                                        mutate3 = a.b.getResources().getDrawable(R.drawable.preview_smile).mutate();
                                                        aob.A1(G04, mutate3);
                                                        int i33222 = i19;
                                                        mutate4 = a.b.getResources().getDrawable(R.drawable.preview_mic).mutate();
                                                        aob.A1(G04, mutate4);
                                                        i25 = 2;
                                                        t37VarArr = new t37[2];
                                                        znbVar = znbVar2;
                                                        i26 = 0;
                                                        while (true) {
                                                            int i34222 = i25;
                                                            if (i26 >= i25) {
                                                            }
                                                            th = th;
                                                            r10 = 0;
                                                            z = true;
                                                            str3 = r10;
                                                            cc4.g(th, z);
                                                            str2 = str3;
                                                            str = str2;
                                                            hl.c3(new tw4((Object) uc7Var, (Object) str, (Object) str4, (Object) ynbVar, (Object) znbVar, (byte) 23));
                                                            aob.A1(r27 == 0 ? G05 : G06, r10);
                                                            i26 = r27 + 1;
                                                            i25 = i34222;
                                                            t37VarArr = r34;
                                                        }
                                                        t37[] t37VarArr2222 = t37VarArr;
                                                        RectF rectF222 = new RectF();
                                                        if (ynbVar != null) {
                                                        }
                                                        if (i22 != 0) {
                                                        }
                                                        if (!z2) {
                                                        }
                                                        paint.setColor(G0);
                                                        canvas.drawRect(0.0f, 0.0f, bitmap.getWidth(), 120.0f, paint);
                                                        if (mutate != null) {
                                                        }
                                                        if (mutate2 != null) {
                                                        }
                                                        t37VarArr2222[1].setBounds(jn7.q2, jn7.s3, bitmap.getWidth() - 20, jn7.e5);
                                                        t37VarArr2222[1].o(0, 560, 522);
                                                        t37VarArr2222[1].draw(canvas);
                                                        t37VarArr2222[1].setBounds(jn7.q2, 430, bitmap.getWidth() - 20, 522);
                                                        t37VarArr2222[1].o(430, 560, 522);
                                                        t37VarArr2222[1].draw(canvas);
                                                        t37VarArr2222[0].setBounds(20, jn7.t5, 399, 415);
                                                        t37VarArr2222[0].o(jn7.t5, 560, 522);
                                                        t37VarArr2222[0].draw(canvas);
                                                        paint.setColor(i33222);
                                                        canvas.drawRect(0.0f, bitmap.getHeight() - 120, bitmap.getWidth(), bitmap.getHeight(), paint);
                                                        if (mutate3 != null) {
                                                        }
                                                        if (mutate4 != null) {
                                                        }
                                                        r10 = 0;
                                                        r10 = 0;
                                                        str2 = null;
                                                        canvas.setBitmap(null);
                                                        File file2222 = new File(xb4.z(4), "-2147483648_" + xea.p() + ".jpg");
                                                        bitmap.compress(Bitmap.CompressFormat.JPEG, 80, new FileOutputStream(file2222));
                                                        xea.x();
                                                        str = file2222.getAbsolutePath();
                                                        hl.c3(new tw4((Object) uc7Var, (Object) str, (Object) str4, (Object) ynbVar, (Object) znbVar, (byte) 23));
                                                    }
                                                    i21 = i20;
                                                    i22 = i3;
                                                    i23 = i4;
                                                }
                                            }
                                            i18 = i17;
                                            strArr2 = strArr;
                                            i19 = G03;
                                            i20 = i12;
                                            i21 = i20;
                                            i22 = i3;
                                            i23 = i4;
                                        }
                                        int i322222 = i18;
                                        mutate = a.b.getResources().getDrawable(R.drawable.preview_back).mutate();
                                        aob.A1(G02, mutate);
                                        mutate2 = a.b.getResources().getDrawable(R.drawable.preview_dots).mutate();
                                        aob.A1(G02, mutate2);
                                        mutate3 = a.b.getResources().getDrawable(R.drawable.preview_smile).mutate();
                                        aob.A1(G04, mutate3);
                                        int i332222 = i19;
                                        mutate4 = a.b.getResources().getDrawable(R.drawable.preview_mic).mutate();
                                        aob.A1(G04, mutate4);
                                        i25 = 2;
                                        t37VarArr = new t37[2];
                                        znbVar = znbVar2;
                                        i26 = 0;
                                        while (true) {
                                            int i342222 = i25;
                                            if (i26 >= i25) {
                                                break;
                                            }
                                            try {
                                                t37[] t37VarArr3 = t37VarArr;
                                                int i35 = i26;
                                                mnb mnbVar = new mnb(i26 == 1, R0, (byte) 0);
                                                t37VarArr3[i35] = mnbVar;
                                                aob.A1(i35 == 0 ? G05 : G06, mnbVar);
                                                i26 = i35 + 1;
                                                i25 = i342222;
                                                t37VarArr = t37VarArr3;
                                            } catch (Throwable th5) {
                                                th = th5;
                                            }
                                            th = th5;
                                            r10 = 0;
                                            z = true;
                                            str3 = r10;
                                            cc4.g(th, z);
                                            str2 = str3;
                                            str = str2;
                                            hl.c3(new tw4((Object) uc7Var, (Object) str, (Object) str4, (Object) ynbVar, (Object) znbVar, (byte) 23));
                                        }
                                        t37[] t37VarArr22222 = t37VarArr;
                                        RectF rectF2222 = new RectF();
                                        r10 = (ynbVar != null || TextUtils.isEmpty(ynbVar.o) || (d = nvc.d(ynbVar.o)) == null) ? 0 : d.a;
                                        if (i22 != 0) {
                                            if (i21 == 0 && r10 == 0) {
                                                colorDrawable = new ColorDrawable(i22);
                                            } else {
                                                R0.get(aob.Ie, -1);
                                                ?? ih7Var = new ih7(i22, i21, i23, i322222, true, false);
                                                colorDrawable = ih7Var;
                                                if (r10 != 0) {
                                                    ih7Var.r((int) (ynbVar.p * 100.0f), r10);
                                                    ih7Var.s(ih7Var.f());
                                                    colorDrawable = ih7Var;
                                                }
                                            }
                                            colorDrawable.setBounds(0, jn7.E1, a.getWidth(), a.getHeight() - jn7.E1);
                                            colorDrawable.draw(canvas);
                                            i27 = 120;
                                            bitmap = a;
                                            z2 = true;
                                        } else {
                                            if (i >= 0 || !TextUtils.isEmpty(strArr2[0])) {
                                                try {
                                                    BitmapFactory.Options options = new BitmapFactory.Options();
                                                    options.inJustDecodeBounds = true;
                                                    if (TextUtils.isEmpty(strArr2[0])) {
                                                        fileInputStream = new FileInputStream(str4);
                                                        try {
                                                            r10 = fileInputStream.getChannel();
                                                            i27 = 120;
                                                            bitmap = a;
                                                            try {
                                                                r10.position(i);
                                                                BitmapFactory.decodeStream(fileInputStream, null, options);
                                                                file = null;
                                                            } catch (Throwable th6) {
                                                                th = th6;
                                                                z = true;
                                                                try {
                                                                    try {
                                                                        cc4.g(th, true);
                                                                        if (fileInputStream != null) {
                                                                            try {
                                                                                fileInputStream.close();
                                                                            } catch (Exception e8) {
                                                                                cc4.g(e8, true);
                                                                            } catch (Throwable th7) {
                                                                                th = th7;
                                                                                str3 = null;
                                                                            }
                                                                        }
                                                                        z2 = false;
                                                                        if (!z2) {
                                                                        }
                                                                        paint.setColor(G0);
                                                                        canvas.drawRect(0.0f, 0.0f, bitmap.getWidth(), 120.0f, paint);
                                                                        if (mutate != null) {
                                                                        }
                                                                        if (mutate2 != null) {
                                                                        }
                                                                        t37VarArr22222[1].setBounds(jn7.q2, jn7.s3, bitmap.getWidth() - 20, jn7.e5);
                                                                        t37VarArr22222[1].o(0, 560, 522);
                                                                        t37VarArr22222[1].draw(canvas);
                                                                        t37VarArr22222[1].setBounds(jn7.q2, 430, bitmap.getWidth() - 20, 522);
                                                                        t37VarArr22222[1].o(430, 560, 522);
                                                                        t37VarArr22222[1].draw(canvas);
                                                                        t37VarArr22222[0].setBounds(20, jn7.t5, 399, 415);
                                                                        t37VarArr22222[0].o(jn7.t5, 560, 522);
                                                                        t37VarArr22222[0].draw(canvas);
                                                                        paint.setColor(i332222);
                                                                        canvas.drawRect(0.0f, bitmap.getHeight() - 120, bitmap.getWidth(), bitmap.getHeight(), paint);
                                                                        if (mutate3 != null) {
                                                                        }
                                                                        if (mutate4 != null) {
                                                                        }
                                                                        r10 = 0;
                                                                        r10 = 0;
                                                                        str2 = null;
                                                                        canvas.setBitmap(null);
                                                                        File file22222 = new File(xb4.z(4), "-2147483648_" + xea.p() + ".jpg");
                                                                        bitmap.compress(Bitmap.CompressFormat.JPEG, 80, new FileOutputStream(file22222));
                                                                        xea.x();
                                                                        str = file22222.getAbsolutePath();
                                                                    } finally {
                                                                    }
                                                                } catch (Throwable th8) {
                                                                    th = th8;
                                                                }
                                                                hl.c3(new tw4((Object) uc7Var, (Object) str, (Object) str4, (Object) ynbVar, (Object) znbVar, (byte) 23));
                                                            }
                                                        } catch (Throwable th9) {
                                                            th = th9;
                                                            i27 = 120;
                                                            bitmap = a;
                                                            z = true;
                                                            cc4.g(th, true);
                                                            if (fileInputStream != null) {
                                                            }
                                                            z2 = false;
                                                            if (!z2) {
                                                            }
                                                            paint.setColor(G0);
                                                            canvas.drawRect(0.0f, 0.0f, bitmap.getWidth(), 120.0f, paint);
                                                            if (mutate != null) {
                                                            }
                                                            if (mutate2 != null) {
                                                            }
                                                            t37VarArr22222[1].setBounds(jn7.q2, jn7.s3, bitmap.getWidth() - 20, jn7.e5);
                                                            t37VarArr22222[1].o(0, 560, 522);
                                                            t37VarArr22222[1].draw(canvas);
                                                            t37VarArr22222[1].setBounds(jn7.q2, 430, bitmap.getWidth() - 20, 522);
                                                            t37VarArr22222[1].o(430, 560, 522);
                                                            t37VarArr22222[1].draw(canvas);
                                                            t37VarArr22222[0].setBounds(20, jn7.t5, 399, 415);
                                                            t37VarArr22222[0].o(jn7.t5, 560, 522);
                                                            t37VarArr22222[0].draw(canvas);
                                                            paint.setColor(i332222);
                                                            canvas.drawRect(0.0f, bitmap.getHeight() - 120, bitmap.getWidth(), bitmap.getHeight(), paint);
                                                            if (mutate3 != null) {
                                                            }
                                                            if (mutate4 != null) {
                                                            }
                                                            r10 = 0;
                                                            r10 = 0;
                                                            str2 = null;
                                                            canvas.setBitmap(null);
                                                            File file222222 = new File(xb4.z(4), "-2147483648_" + xea.p() + ".jpg");
                                                            bitmap.compress(Bitmap.CompressFormat.JPEG, 80, new FileOutputStream(file222222));
                                                            xea.x();
                                                            str = file222222.getAbsolutePath();
                                                            hl.c3(new tw4((Object) uc7Var, (Object) str, (Object) str4, (Object) ynbVar, (Object) znbVar, (byte) 23));
                                                        }
                                                    } else {
                                                        File d2 = gvc.d(strArr2[0]);
                                                        BitmapFactory.decodeFile(d2.getAbsolutePath(), options);
                                                        file = d2;
                                                        i27 = 120;
                                                        bitmap = a;
                                                        fileInputStream = null;
                                                    }
                                                    int i36 = options.outWidth;
                                                    if (i36 > 0 && (i28 = options.outHeight) > 0) {
                                                        float min = Math.min(i36 / 560.0f, i28 / 560.0f);
                                                        options.inSampleSize = 1;
                                                        if (min > 1.0f) {
                                                            do {
                                                                i29 = options.inSampleSize << 1;
                                                                options.inSampleSize = i29;
                                                            } while (i29 < min);
                                                        }
                                                        options.inJustDecodeBounds = false;
                                                        if (file != null) {
                                                            decodeStream = BitmapFactory.decodeFile(file.getAbsolutePath(), options);
                                                        } else {
                                                            fileInputStream.getChannel().position(i);
                                                            decodeStream = BitmapFactory.decodeStream(fileInputStream, null, options);
                                                        }
                                                        if (decodeStream != null) {
                                                            Paint paint2 = new Paint();
                                                            paint2.setFilterBitmap(true);
                                                            float min2 = Math.min(decodeStream.getWidth() / 560.0f, decodeStream.getHeight() / 560.0f);
                                                            rectF2222.set(0.0f, 0.0f, decodeStream.getWidth() / min2, decodeStream.getHeight() / min2);
                                                            rectF2222.offset((bitmap.getWidth() - rectF2222.width()) / 2.0f, (bitmap.getHeight() - rectF2222.height()) / 2.0f);
                                                            r10 = 0;
                                                            canvas.drawBitmap(decodeStream, (Rect) null, rectF2222, paint2);
                                                            z2 = true;
                                                            if (fileInputStream != null) {
                                                                try {
                                                                    fileInputStream.close();
                                                                } catch (Exception e9) {
                                                                    cc4.g(e9, true);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    z2 = false;
                                                    if (fileInputStream != null) {
                                                    }
                                                } catch (Throwable th10) {
                                                    th = th10;
                                                    i27 = 120;
                                                    bitmap = a;
                                                    fileInputStream = null;
                                                }
                                            } else {
                                                i27 = 120;
                                                bitmap = a;
                                            }
                                            z2 = false;
                                        }
                                        if (!z2) {
                                            ih7 R = aob.R(bitmap.getWidth(), bitmap.getHeight() - 120);
                                            R.setBounds(0, i27, bitmap.getWidth(), bitmap.getHeight() - 120);
                                            R.draw(canvas);
                                        }
                                        paint.setColor(G0);
                                        canvas.drawRect(0.0f, 0.0f, bitmap.getWidth(), 120.0f, paint);
                                        if (mutate != null) {
                                            int intrinsicHeight = (120 - mutate.getIntrinsicHeight()) / 2;
                                            mutate.setBounds(13, intrinsicHeight, mutate.getIntrinsicWidth() + 13, mutate.getIntrinsicHeight() + intrinsicHeight);
                                            mutate.draw(canvas);
                                        }
                                        if (mutate2 != null) {
                                            int width = (bitmap.getWidth() - mutate2.getIntrinsicWidth()) - 10;
                                            int intrinsicHeight2 = (120 - mutate2.getIntrinsicHeight()) / 2;
                                            mutate2.setBounds(width, intrinsicHeight2, mutate2.getIntrinsicWidth() + width, mutate2.getIntrinsicHeight() + intrinsicHeight2);
                                            mutate2.draw(canvas);
                                        }
                                        t37VarArr22222[1].setBounds(jn7.q2, jn7.s3, bitmap.getWidth() - 20, jn7.e5);
                                        t37VarArr22222[1].o(0, 560, 522);
                                        t37VarArr22222[1].draw(canvas);
                                        t37VarArr22222[1].setBounds(jn7.q2, 430, bitmap.getWidth() - 20, 522);
                                        t37VarArr22222[1].o(430, 560, 522);
                                        t37VarArr22222[1].draw(canvas);
                                        t37VarArr22222[0].setBounds(20, jn7.t5, 399, 415);
                                        t37VarArr22222[0].o(jn7.t5, 560, 522);
                                        t37VarArr22222[0].draw(canvas);
                                        paint.setColor(i332222);
                                        canvas.drawRect(0.0f, bitmap.getHeight() - 120, bitmap.getWidth(), bitmap.getHeight(), paint);
                                        if (mutate3 != null) {
                                            int height = (bitmap.getHeight() - 120) + ((120 - mutate3.getIntrinsicHeight()) / 2);
                                            mutate3.setBounds(22, height, mutate3.getIntrinsicWidth() + 22, mutate3.getIntrinsicHeight() + height);
                                            mutate3.draw(canvas);
                                        }
                                        if (mutate4 != null) {
                                            int width2 = (bitmap.getWidth() - mutate4.getIntrinsicWidth()) - 22;
                                            int height2 = (bitmap.getHeight() - 120) + ((120 - mutate4.getIntrinsicHeight()) / 2);
                                            mutate4.setBounds(width2, height2, mutate4.getIntrinsicWidth() + width2, mutate4.getIntrinsicHeight() + height2);
                                            mutate4.draw(canvas);
                                        }
                                        r10 = 0;
                                        r10 = 0;
                                        str2 = null;
                                        canvas.setBitmap(null);
                                        File file2222222 = new File(xb4.z(4), "-2147483648_" + xea.p() + ".jpg");
                                        bitmap.compress(Bitmap.CompressFormat.JPEG, 80, new FileOutputStream(file2222222));
                                        xea.x();
                                        str = file2222222.getAbsolutePath();
                                        hl.c3(new tw4((Object) uc7Var, (Object) str, (Object) str4, (Object) ynbVar, (Object) znbVar, (byte) 23));
                                    }
                                }
                                if (i16 != 0) {
                                    i5 = i16;
                                }
                                i17 = i5;
                                if (TextUtils.isEmpty(strArr[i6])) {
                                }
                                int i3222222 = i18;
                                mutate = a.b.getResources().getDrawable(R.drawable.preview_back).mutate();
                                aob.A1(G02, mutate);
                                mutate2 = a.b.getResources().getDrawable(R.drawable.preview_dots).mutate();
                                aob.A1(G02, mutate2);
                                mutate3 = a.b.getResources().getDrawable(R.drawable.preview_smile).mutate();
                                aob.A1(G04, mutate3);
                                int i3322222 = i19;
                                mutate4 = a.b.getResources().getDrawable(R.drawable.preview_mic).mutate();
                                aob.A1(G04, mutate4);
                                i25 = 2;
                                t37VarArr = new t37[2];
                                znbVar = znbVar2;
                                i26 = 0;
                                while (true) {
                                    int i3422222 = i25;
                                    if (i26 >= i25) {
                                    }
                                    th = th5;
                                    r10 = 0;
                                    z = true;
                                    str3 = r10;
                                    cc4.g(th, z);
                                    str2 = str3;
                                    str = str2;
                                    hl.c3(new tw4((Object) uc7Var, (Object) str, (Object) str4, (Object) ynbVar, (Object) znbVar, (byte) 23));
                                    aob.A1(i35 == 0 ? G05 : G06, mnbVar);
                                    i26 = i35 + 1;
                                    i25 = i3422222;
                                    t37VarArr = t37VarArr3;
                                }
                                t37[] t37VarArr222222 = t37VarArr;
                                RectF rectF22222 = new RectF();
                                if (ynbVar != null) {
                                }
                                if (i22 != 0) {
                                }
                                if (!z2) {
                                }
                                paint.setColor(G0);
                                canvas.drawRect(0.0f, 0.0f, bitmap.getWidth(), 120.0f, paint);
                                if (mutate != null) {
                                }
                                if (mutate2 != null) {
                                }
                                t37VarArr222222[1].setBounds(jn7.q2, jn7.s3, bitmap.getWidth() - 20, jn7.e5);
                                t37VarArr222222[1].o(0, 560, 522);
                                t37VarArr222222[1].draw(canvas);
                                t37VarArr222222[1].setBounds(jn7.q2, 430, bitmap.getWidth() - 20, 522);
                                t37VarArr222222[1].o(430, 560, 522);
                                t37VarArr222222[1].draw(canvas);
                                t37VarArr222222[0].setBounds(20, jn7.t5, 399, 415);
                                t37VarArr222222[0].o(jn7.t5, 560, 522);
                                t37VarArr222222[0].draw(canvas);
                                paint.setColor(i3322222);
                                canvas.drawRect(0.0f, bitmap.getHeight() - 120, bitmap.getWidth(), bitmap.getHeight(), paint);
                                if (mutate3 != null) {
                                }
                                if (mutate4 != null) {
                                }
                                r10 = 0;
                                r10 = 0;
                                str2 = null;
                                canvas.setBitmap(null);
                                File file22222222 = new File(xb4.z(4), "-2147483648_" + xea.p() + ".jpg");
                                bitmap.compress(Bitmap.CompressFormat.JPEG, 80, new FileOutputStream(file22222222));
                                xea.x();
                                str = file22222222.getAbsolutePath();
                                hl.c3(new tw4((Object) uc7Var, (Object) str, (Object) str4, (Object) ynbVar, (Object) znbVar, (byte) 23));
                            }
                        }
                        if (i14 != 0) {
                            i4 = i14;
                        }
                        if (ynbVar == null) {
                        }
                        if (i15 == 0) {
                        }
                        i16 = i15;
                        if (i16 != 0) {
                        }
                        i17 = i5;
                        if (TextUtils.isEmpty(strArr[i6])) {
                        }
                        int i32222222 = i18;
                        mutate = a.b.getResources().getDrawable(R.drawable.preview_back).mutate();
                        aob.A1(G02, mutate);
                        mutate2 = a.b.getResources().getDrawable(R.drawable.preview_dots).mutate();
                        aob.A1(G02, mutate2);
                        mutate3 = a.b.getResources().getDrawable(R.drawable.preview_smile).mutate();
                        aob.A1(G04, mutate3);
                        int i33222222 = i19;
                        mutate4 = a.b.getResources().getDrawable(R.drawable.preview_mic).mutate();
                        aob.A1(G04, mutate4);
                        i25 = 2;
                        t37VarArr = new t37[2];
                        znbVar = znbVar2;
                        i26 = 0;
                        while (true) {
                            int i34222222 = i25;
                            if (i26 >= i25) {
                            }
                            th = th5;
                            r10 = 0;
                            z = true;
                            str3 = r10;
                            cc4.g(th, z);
                            str2 = str3;
                            str = str2;
                            hl.c3(new tw4((Object) uc7Var, (Object) str, (Object) str4, (Object) ynbVar, (Object) znbVar, (byte) 23));
                            aob.A1(i35 == 0 ? G05 : G06, mnbVar);
                            i26 = i35 + 1;
                            i25 = i34222222;
                            t37VarArr = t37VarArr3;
                        }
                        t37[] t37VarArr2222222 = t37VarArr;
                        RectF rectF222222 = new RectF();
                        if (ynbVar != null) {
                        }
                        if (i22 != 0) {
                        }
                        if (!z2) {
                        }
                        paint.setColor(G0);
                        canvas.drawRect(0.0f, 0.0f, bitmap.getWidth(), 120.0f, paint);
                        if (mutate != null) {
                        }
                        if (mutate2 != null) {
                        }
                        t37VarArr2222222[1].setBounds(jn7.q2, jn7.s3, bitmap.getWidth() - 20, jn7.e5);
                        t37VarArr2222222[1].o(0, 560, 522);
                        t37VarArr2222222[1].draw(canvas);
                        t37VarArr2222222[1].setBounds(jn7.q2, 430, bitmap.getWidth() - 20, 522);
                        t37VarArr2222222[1].o(430, 560, 522);
                        t37VarArr2222222[1].draw(canvas);
                        t37VarArr2222222[0].setBounds(20, jn7.t5, 399, 415);
                        t37VarArr2222222[0].o(jn7.t5, 560, 522);
                        t37VarArr2222222[0].draw(canvas);
                        paint.setColor(i33222222);
                        canvas.drawRect(0.0f, bitmap.getHeight() - 120, bitmap.getWidth(), bitmap.getHeight(), paint);
                        if (mutate3 != null) {
                        }
                        if (mutate4 != null) {
                        }
                        r10 = 0;
                        r10 = 0;
                        str2 = null;
                        canvas.setBitmap(null);
                        File file222222222 = new File(xb4.z(4), "-2147483648_" + xea.p() + ".jpg");
                        bitmap.compress(Bitmap.CompressFormat.JPEG, 80, new FileOutputStream(file222222222));
                        xea.x();
                        str = file222222222.getAbsolutePath();
                        hl.c3(new tw4((Object) uc7Var, (Object) str, (Object) str4, (Object) ynbVar, (Object) znbVar, (byte) 23));
                    }
                }
                i11 = i10 == 0 ? i10 : i2;
                if (ynbVar != null) {
                }
                if (i13 == 0) {
                }
                i14 = i13;
                if (i14 != 0) {
                }
                if (ynbVar == null) {
                }
                if (i15 == 0) {
                }
                i16 = i15;
                if (i16 != 0) {
                }
                i17 = i5;
                if (TextUtils.isEmpty(strArr[i6])) {
                }
                int i322222222 = i18;
                mutate = a.b.getResources().getDrawable(R.drawable.preview_back).mutate();
                aob.A1(G02, mutate);
                mutate2 = a.b.getResources().getDrawable(R.drawable.preview_dots).mutate();
                aob.A1(G02, mutate2);
                mutate3 = a.b.getResources().getDrawable(R.drawable.preview_smile).mutate();
                aob.A1(G04, mutate3);
                int i332222222 = i19;
                mutate4 = a.b.getResources().getDrawable(R.drawable.preview_mic).mutate();
                aob.A1(G04, mutate4);
                i25 = 2;
                t37VarArr = new t37[2];
                znbVar = znbVar2;
                i26 = 0;
                while (true) {
                    int i342222222 = i25;
                    if (i26 >= i25) {
                    }
                    th = th5;
                    r10 = 0;
                    z = true;
                    str3 = r10;
                    cc4.g(th, z);
                    str2 = str3;
                    str = str2;
                    hl.c3(new tw4((Object) uc7Var, (Object) str, (Object) str4, (Object) ynbVar, (Object) znbVar, (byte) 23));
                    aob.A1(i35 == 0 ? G05 : G06, mnbVar);
                    i26 = i35 + 1;
                    i25 = i342222222;
                    t37VarArr = t37VarArr3;
                }
                t37[] t37VarArr22222222 = t37VarArr;
                RectF rectF2222222 = new RectF();
                if (ynbVar != null) {
                }
                if (i22 != 0) {
                }
                if (!z2) {
                }
                paint.setColor(G0);
                canvas.drawRect(0.0f, 0.0f, bitmap.getWidth(), 120.0f, paint);
                if (mutate != null) {
                }
                if (mutate2 != null) {
                }
                t37VarArr22222222[1].setBounds(jn7.q2, jn7.s3, bitmap.getWidth() - 20, jn7.e5);
                t37VarArr22222222[1].o(0, 560, 522);
                t37VarArr22222222[1].draw(canvas);
                t37VarArr22222222[1].setBounds(jn7.q2, 430, bitmap.getWidth() - 20, 522);
                t37VarArr22222222[1].o(430, 560, 522);
                t37VarArr22222222[1].draw(canvas);
                t37VarArr22222222[0].setBounds(20, jn7.t5, 399, 415);
                t37VarArr22222222[0].o(jn7.t5, 560, 522);
                t37VarArr22222222[0].draw(canvas);
                paint.setColor(i332222222);
                canvas.drawRect(0.0f, bitmap.getHeight() - 120, bitmap.getWidth(), bitmap.getHeight(), paint);
                if (mutate3 != null) {
                }
                if (mutate4 != null) {
                }
                r10 = 0;
                r10 = 0;
                str2 = null;
                canvas.setBitmap(null);
                File file2222222222 = new File(xb4.z(4), "-2147483648_" + xea.p() + ".jpg");
                bitmap.compress(Bitmap.CompressFormat.JPEG, 80, new FileOutputStream(file2222222222));
                xea.x();
                str = file2222222222.getAbsolutePath();
                hl.c3(new tw4((Object) uc7Var, (Object) str, (Object) str4, (Object) ynbVar, (Object) znbVar, (byte) 23));
            }
        }
        if (i8 != 0) {
            i3 = i8;
        }
        if (ynbVar == null) {
        }
        if (i9 == 0) {
        }
        i10 = i9;
        if (i10 == 0) {
        }
        if (ynbVar != null) {
        }
        if (i13 == 0) {
        }
        i14 = i13;
        if (i14 != 0) {
        }
        if (ynbVar == null) {
        }
        if (i15 == 0) {
        }
        i16 = i15;
        if (i16 != 0) {
        }
        i17 = i5;
        if (TextUtils.isEmpty(strArr[i6])) {
        }
        int i3222222222 = i18;
        mutate = a.b.getResources().getDrawable(R.drawable.preview_back).mutate();
        aob.A1(G02, mutate);
        mutate2 = a.b.getResources().getDrawable(R.drawable.preview_dots).mutate();
        aob.A1(G02, mutate2);
        mutate3 = a.b.getResources().getDrawable(R.drawable.preview_smile).mutate();
        aob.A1(G04, mutate3);
        int i3322222222 = i19;
        mutate4 = a.b.getResources().getDrawable(R.drawable.preview_mic).mutate();
        aob.A1(G04, mutate4);
        i25 = 2;
        t37VarArr = new t37[2];
        znbVar = znbVar2;
        i26 = 0;
        while (true) {
            int i3422222222 = i25;
            if (i26 >= i25) {
            }
            th = th5;
            r10 = 0;
            z = true;
            str3 = r10;
            cc4.g(th, z);
            str2 = str3;
            str = str2;
            hl.c3(new tw4((Object) uc7Var, (Object) str, (Object) str4, (Object) ynbVar, (Object) znbVar, (byte) 23));
            aob.A1(i35 == 0 ? G05 : G06, mnbVar);
            i26 = i35 + 1;
            i25 = i3422222222;
            t37VarArr = t37VarArr3;
        }
        t37[] t37VarArr222222222 = t37VarArr;
        RectF rectF22222222 = new RectF();
        if (ynbVar != null) {
        }
        if (i22 != 0) {
        }
        if (!z2) {
        }
        paint.setColor(G0);
        canvas.drawRect(0.0f, 0.0f, bitmap.getWidth(), 120.0f, paint);
        if (mutate != null) {
        }
        if (mutate2 != null) {
        }
        t37VarArr222222222[1].setBounds(jn7.q2, jn7.s3, bitmap.getWidth() - 20, jn7.e5);
        t37VarArr222222222[1].o(0, 560, 522);
        t37VarArr222222222[1].draw(canvas);
        t37VarArr222222222[1].setBounds(jn7.q2, 430, bitmap.getWidth() - 20, 522);
        t37VarArr222222222[1].o(430, 560, 522);
        t37VarArr222222222[1].draw(canvas);
        t37VarArr222222222[0].setBounds(20, jn7.t5, 399, 415);
        t37VarArr222222222[0].o(jn7.t5, 560, 522);
        t37VarArr222222222[0].draw(canvas);
        paint.setColor(i3322222222);
        canvas.drawRect(0.0f, bitmap.getHeight() - 120, bitmap.getWidth(), bitmap.getHeight(), paint);
        if (mutate3 != null) {
        }
        if (mutate4 != null) {
        }
        r10 = 0;
        r10 = 0;
        str2 = null;
        canvas.setBitmap(null);
        File file22222222222 = new File(xb4.z(4), "-2147483648_" + xea.p() + ".jpg");
        bitmap.compress(Bitmap.CompressFormat.JPEG, 80, new FileOutputStream(file22222222222));
        xea.x();
        str = file22222222222.getAbsolutePath();
        hl.c3(new tw4((Object) uc7Var, (Object) str, (Object) str4, (Object) ynbVar, (Object) znbVar, (byte) 23));
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x001b, code lost:
    
        if (r6.length < 16) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void b() {
        SQLitePreparedStatement sQLitePreparedStatement;
        int length;
        SQLitePreparedStatement executeFast;
        kf7 kf7Var = (kf7) this.b;
        TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.c;
        TLRPC.User user = (TLRPC.User) this.d;
        TLRPC.TL_dialog tL_dialog = (TLRPC.TL_dialog) this.e;
        boolean z = true;
        try {
            try {
                byte[] bArr = encryptedChat.key_hash;
                if (bArr != null) {
                    try {
                    } catch (Exception e) {
                        e = e;
                        sQLitePreparedStatement = null;
                        try {
                            kf7Var.p(e, z);
                            if (sQLitePreparedStatement != null) {
                                sQLitePreparedStatement.dispose();
                                return;
                            }
                            return;
                        } catch (Throwable th) {
                            th = th;
                            if (sQLitePreparedStatement != null) {
                                sQLitePreparedStatement.dispose();
                            }
                            throw th;
                        }
                    }
                }
                byte[] bArr2 = encryptedChat.auth_key;
                if (bArr2 != null) {
                    Typeface typeface = hl.a;
                    byte[] bArr3 = new byte[16];
                    System.arraycopy(Utilities.n(bArr2), 0, bArr3, 0, 16);
                    encryptedChat.key_hash = bArr3;
                }
                SQLitePreparedStatement executeFast2 = kf7Var.b.executeFast("REPLACE INTO enc_chats VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                try {
                    try {
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(encryptedChat.getObjectSize());
                        byte[] bArr4 = encryptedChat.a_or_b;
                        if (bArr4 != null) {
                            try {
                                length = bArr4.length;
                            } catch (Exception e2) {
                                e = e2;
                                sQLitePreparedStatement = executeFast2;
                                kf7Var.p(e, z);
                                if (sQLitePreparedStatement != null) {
                                }
                            }
                        } else {
                            length = 1;
                        }
                        NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(length);
                        byte[] bArr5 = encryptedChat.auth_key;
                        NativeByteBuffer nativeByteBuffer3 = new NativeByteBuffer(bArr5 != null ? bArr5.length : 1);
                        byte[] bArr6 = encryptedChat.future_auth_key;
                        NativeByteBuffer nativeByteBuffer4 = new NativeByteBuffer(bArr6 != null ? bArr6.length : 1);
                        byte[] bArr7 = encryptedChat.key_hash;
                        NativeByteBuffer nativeByteBuffer5 = new NativeByteBuffer(bArr7 != null ? bArr7.length : 1);
                        encryptedChat.serializeToStream(nativeByteBuffer);
                        executeFast2.bindInteger(1, encryptedChat.id);
                        executeFast2.bindLong(2, user.id);
                        executeFast2.bindString(3, kf7.L(user));
                        executeFast2.bindByteBuffer(4, nativeByteBuffer);
                        byte[] bArr8 = encryptedChat.a_or_b;
                        if (bArr8 != null) {
                            nativeByteBuffer2.writeBytes(bArr8);
                        }
                        byte[] bArr9 = encryptedChat.auth_key;
                        if (bArr9 != null) {
                            nativeByteBuffer3.writeBytes(bArr9);
                        }
                        byte[] bArr10 = encryptedChat.future_auth_key;
                        if (bArr10 != null) {
                            nativeByteBuffer4.writeBytes(bArr10);
                        }
                        byte[] bArr11 = encryptedChat.key_hash;
                        if (bArr11 != null) {
                            nativeByteBuffer5.writeBytes(bArr11);
                        }
                        executeFast2.bindByteBuffer(5, nativeByteBuffer2);
                        executeFast2.bindByteBuffer(6, nativeByteBuffer3);
                        executeFast2.bindInteger(7, encryptedChat.ttl);
                        executeFast2.bindInteger(8, encryptedChat.layer);
                        executeFast2.bindInteger(9, encryptedChat.seq_in);
                        executeFast2.bindInteger(10, encryptedChat.seq_out);
                        executeFast2.bindInteger(11, (encryptedChat.key_use_count_in << 16) | encryptedChat.key_use_count_out);
                        executeFast2.bindLong(12, encryptedChat.exchange_id);
                        executeFast2.bindInteger(13, encryptedChat.key_create_date);
                        executeFast2.bindLong(14, encryptedChat.future_key_fingerprint);
                        executeFast2.bindByteBuffer(15, nativeByteBuffer4);
                        executeFast2.bindByteBuffer(16, nativeByteBuffer5);
                        executeFast2.bindInteger(17, encryptedChat.in_seq_no);
                        executeFast2.bindLong(18, encryptedChat.admin_id);
                        executeFast2.bindInteger(19, encryptedChat.mtproto_seq);
                        executeFast2.step();
                        executeFast2.dispose();
                        nativeByteBuffer.reuse();
                        nativeByteBuffer2.reuse();
                        nativeByteBuffer3.reuse();
                        nativeByteBuffer4.reuse();
                        nativeByteBuffer5.reuse();
                        executeFast = kf7Var.b.executeFast("REPLACE INTO dialogs VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                    } catch (Throwable th2) {
                        th = th2;
                        sQLitePreparedStatement = executeFast2;
                    }
                } catch (Exception e3) {
                    e = e3;
                    sQLitePreparedStatement = executeFast2;
                }
            } catch (Exception e4) {
                e = e4;
                z = true;
            }
        } catch (Throwable th3) {
            th = th3;
            sQLitePreparedStatement = null;
        }
        try {
            executeFast.bindLong(1, tL_dialog.id);
            executeFast.bindInteger(2, tL_dialog.last_message_date);
            executeFast.bindInteger(3, tL_dialog.unread_count);
            executeFast.bindInteger(4, tL_dialog.top_message);
            executeFast.bindInteger(5, tL_dialog.read_inbox_max_id);
            executeFast.bindInteger(6, tL_dialog.read_outbox_max_id);
            executeFast.bindInteger(7, 0);
            executeFast.bindInteger(8, tL_dialog.unread_mentions_count);
            executeFast.bindInteger(9, tL_dialog.pts);
            executeFast.bindInteger(10, 0);
            executeFast.bindInteger(11, tL_dialog.pinnedNum);
            executeFast.bindInteger(12, tL_dialog.flags);
            executeFast.bindInteger(13, tL_dialog.folder_id);
            executeFast.bindNull(14);
            executeFast.bindInteger(15, tL_dialog.unread_reactions_count);
            executeFast.bindInteger(16, 0);
            executeFast.bindInteger(17, tL_dialog.ttl_period);
            executeFast.bindInteger(18, tL_dialog.unread_poll_votes_count);
            executeFast.step();
            executeFast.dispose();
        } catch (Exception e5) {
            e = e5;
            sQLitePreparedStatement = executeFast;
            z = true;
            kf7Var.p(e, z);
            if (sQLitePreparedStatement != null) {
            }
        } catch (Throwable th4) {
            th = th4;
            sQLitePreparedStatement = executeFast;
            if (sQLitePreparedStatement != null) {
            }
            throw th;
        }
    }

    private final void c() {
        PhotoViewer photoViewer = (PhotoViewer) this.b;
        no6 no6Var = (no6) this.c;
        String str = (String) this.d;
        Bitmap bitmap = (Bitmap) this.e;
        Drawable[] drawableArr = PhotoViewer.d9;
        if (no6Var.g != null) {
            try {
                new File(no6Var.g).delete();
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
        no6Var.d = -1L;
        no6Var.g = str;
        no6Var.e = null;
        no6Var.f = null;
        photoViewer.p5.b.setLoading(false);
        ed8 ed8Var = photoViewer.d;
        if (ed8Var != null) {
            ed8Var.X(photoViewer.O4);
        }
        nb8 nb8Var = photoViewer.h1;
        if (nb8Var != null) {
            nb8Var.setImage(bitmap);
        }
        photoViewer.o2(0);
        CheckBox checkBox = photoViewer.O0;
        if (checkBox.y) {
            return;
        }
        checkBox.callOnClick();
    }

    private final void d() {
        PhotoViewer photoViewer = (PhotoViewer) this.b;
        no6 no6Var = (no6) this.c;
        no6 no6Var2 = (no6) this.d;
        String str = (String) this.e;
        Drawable[] drawableArr = PhotoViewer.d9;
        Bitmap decodeFile = BitmapFactory.decodeFile(no6Var.I);
        if (decodeFile == null) {
            hl.c3(new y98(photoViewer, (byte) 4));
            return;
        }
        int[] iArr = new int[11];
        AnimatedFileNative.d(no6Var2.I, iArr, 0L);
        int max = Math.max(iArr[1], no6Var2.F);
        int max2 = Math.max(iArr[2], no6Var2.G);
        if ((iArr[8] / 90) % 2 == 1) {
            max2 = max;
            max = max2;
        }
        float f = max;
        float f2 = max2;
        float max3 = Math.max(decodeFile.getWidth() / f, decodeFile.getHeight() / f2);
        int i = (int) (f * max3);
        int i2 = (int) (f2 * max3);
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, config);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        canvas.translate(createBitmap.getWidth() / 2, createBitmap.getHeight() / 2);
        float max4 = Math.max(createBitmap.getWidth() / decodeFile.getWidth(), createBitmap.getHeight() / decodeFile.getHeight());
        canvas.scale(max4, max4);
        canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2, (-decodeFile.getHeight()) / 2, paint);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
            createBitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
            fileOutputStream.close();
            Bitmap createBitmap2 = Bitmap.createBitmap(hl.L(26.0f), hl.L(26.0f), config);
            Canvas canvas2 = new Canvas(createBitmap2);
            canvas2.translate(createBitmap2.getWidth() / 2.0f, createBitmap2.getHeight() / 2.0f);
            float max5 = Math.max(createBitmap2.getWidth() / createBitmap.getWidth(), createBitmap2.getHeight() / createBitmap.getHeight());
            canvas2.scale(max5, max5);
            canvas2.drawBitmap(createBitmap, (-createBitmap.getWidth()) / 2.0f, (-createBitmap.getHeight()) / 2.0f, paint);
            hl.c3(new oy6(photoViewer, no6Var2, str, createBitmap2, (byte) 19));
        } catch (Exception e) {
            cc4.g(e, true);
            hl.c3(new y98(photoViewer, (byte) 5));
        }
    }

    private final void e() {
        PhotoViewer photoViewer = (PhotoViewer) this.b;
        Bitmap bitmap = (Bitmap) this.c;
        boolean[] zArr = (boolean[]) this.d;
        ra8 ra8Var = (ra8) this.e;
        Drawable[] drawableArr = PhotoViewer.d9;
        ImageView imageView = photoViewer.x3;
        if (imageView != null) {
            imageView.setImageBitmap(bitmap);
            photoViewer.x3.setVisibility(0);
            SurfaceView surfaceView = photoViewer.D2;
            if (surfaceView != null) {
                surfaceView.setVisibility(4);
            }
            if (zArr[0]) {
                return;
            }
            zArr[0] = true;
            ra8Var.run();
        }
    }

    private final void f() {
        gb8 gb8Var = (gb8) this.b;
        TLObject tLObject = (TLObject) this.c;
        yac yacVar = (yac) this.d;
        TLRPC.Photo photo = (TLRPC.Photo) this.e;
        PhotoViewer photoViewer = gb8Var.b;
        if (tLObject instanceof TLRPC.TL_photos_photo) {
            TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
            int i = photoViewer.U;
            ArrayList arrayList = photoViewer.e7;
            uc7.s1(i).j4(tL_photos_photo.users, false);
            TLRPC.User X1 = uc7.s1(photoViewer.U).X1(Long.valueOf(yacVar.n));
            if (tL_photos_photo.photo instanceof TLRPC.TL_photo) {
                int indexOf = arrayList.indexOf(photo);
                if (indexOf >= 0) {
                    arrayList.set(indexOf, tL_photos_photo.photo);
                }
                if (X1 != null) {
                    X1.photo.photo_id = tL_photos_photo.photo.id;
                    yacVar.v(X1);
                    yacVar.u(true);
                }
            }
        }
    }

    private final void g() {
        ((ij8) this.b).b0((TLRPC.TL_error) this.c, (TLObject) this.d, (TL_stars.updatePaidMessagesPrice) this.e);
    }

    private final void h() {
        mm8 mm8Var = (mm8) this.b;
        Bitmap[] bitmapArr = (Bitmap[]) this.c;
        c8b c8bVar = (c8b) this.d;
        boolean[] zArr = (boolean[]) this.e;
        tl0 tl0Var = mm8Var.H;
        Bitmap bitmap = mm8Var.a;
        if (bitmap != null && !bitmap.isRecycled()) {
            mm8Var.a.recycle();
        }
        Bitmap bitmap2 = bitmapArr[0];
        mm8Var.a = bitmap2;
        if (c8bVar != null && !c8bVar.c && c8bVar.K && bitmap2 != null) {
            c8bVar.k0 = bitmap2.getWidth();
            c8bVar.l0 = mm8Var.a.getHeight();
            c8bVar.z();
        }
        if (zArr[0] && c8bVar != null && tl0Var != null && mm8Var.a != null) {
            tl0Var.e();
            tl0Var.f(c8bVar.b(0.2f, mm8Var.a), false);
            bab babVar = mm8Var.w;
            if (babVar != null) {
                babVar.run();
            }
        }
        mm8Var.r();
        mm8Var.invalidate();
    }

    private final void i() {
        ((PrivacyControlActivity) this.b).D0((TLRPC.TL_error) this.c, (TLObject) this.d, (boolean[]) this.e);
    }

    private final void j() {
        PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
        id idVar = (id) this.c;
        TLObject tLObject = (TLObject) this.d;
        TL_account.setAccountTTL setaccountttl = (TL_account.setAccountTTL) this.e;
        privacySettingsActivity.getClass();
        try {
            idVar.dismiss();
        } catch (Exception e) {
            cc4.g(e, true);
        }
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            privacySettingsActivity.R = true;
            privacySettingsActivity.getContactsController().I = setaccountttl.ttl.days;
            privacySettingsActivity.a.f();
        }
    }

    private final void k() {
        ProfileActivity profileActivity = (ProfileActivity) this.b;
        String[] strArr = (String[]) this.c;
        String str = (String) this.d;
        String str2 = (String) this.e;
        RectF rectF = ProfileActivity.Z6;
        if (hl.C1(profileActivity.getParentActivity())) {
            r3c.R0(profileActivity.getParentActivity(), profileActivity, strArr[0], str, str2, new p12(profileActivity, (byte) 6), null);
        }
    }

    private final void l() {
        ProfileActivity profileActivity = (ProfileActivity) this.b;
        TLObject tLObject = (TLObject) this.c;
        TLRPC.TL_username tL_username = (TLRPC.TL_username) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
        RectF rectF = ProfileActivity.Z6;
        if (tLObject instanceof TL_fragment.TL_collectibleInfo) {
            br4.a(profileActivity.getParentActivity(), 0, tL_username.username, profileActivity.e1 != 0 ? profileActivity.getMessagesController().X1(Long.valueOf(profileActivity.e1)) : profileActivity.getMessagesController().M0(Long.valueOf(profileActivity.f1)), (TL_fragment.TL_collectibleInfo) tLObject, profileActivity.A0);
        } else {
            d31.e0(tL_error);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:253:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:257:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x089d  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x08a8  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x08bd  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x08d1  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0910  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0927  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x09ff  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x0a02  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x093d  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x08df  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x08e6  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x08fd  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x08f9  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x08d4  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x08ab  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x08a0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0180  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Bitmap bitmap;
        Bundle bundle;
        po5 po5Var;
        boolean z;
        boolean z2;
        nt6 nt6Var;
        CharSequence charSequence;
        char c;
        CharSequence charSequence2;
        int i;
        zh6 zh6Var;
        ArrayList arrayList;
        int i2;
        ls6 ls6Var;
        SQLitePreparedStatement sQLitePreparedStatement;
        boolean z3;
        int i3;
        boolean z4;
        TLRPC.Chat M0;
        String str;
        String M02;
        int i4;
        String str2;
        String a0;
        v21 I;
        z28 z28Var;
        z28 z28Var2;
        c8b c8bVar;
        File file;
        ArrayList arrayList2;
        TL_stories.StoryItem storyItem;
        int i5;
        kcb kcbVar;
        byte b = 5;
        long j = 0;
        SQLitePreparedStatement sQLitePreparedStatement2 = null;
        int i6 = 0;
        switch (this.a) {
            case 0:
                Bitmap bitmap2 = null;
                guc gucVar = (guc) this.b;
                AtomicInteger atomicInteger = (AtomicInteger) this.c;
                ArrayList arrayList3 = (ArrayList) this.d;
                ArrayList arrayList4 = (ArrayList) this.e;
                if (atomicInteger.incrementAndGet() == arrayList3.size()) {
                    ArrayList arrayList5 = new ArrayList();
                    int i7 = 0;
                    while (i7 < arrayList4.size()) {
                        x76 x76Var = (x76) arrayList4.get(i7);
                        if (x76Var != null) {
                            try {
                                bitmap = (Bitmap) fne.a(x76Var);
                            } catch (CancellationException | ExecutionException e) {
                                synchronized (efd.a) {
                                    Log.d("MediaSessionLegacyStub", efd.a("Failed to get bitmap", e));
                                }
                            }
                            ft6 ft6Var = (ft6) arrayList3.get(i7);
                            int i8 = n26.a;
                            String str3 = !ft6Var.a.equals("") ? bitmap2 : ft6Var.a;
                            nt6 nt6Var2 = ft6Var.d;
                            Bitmap bitmap3 = bitmap == null ? bitmap : bitmap2;
                            bundle = nt6Var2.K;
                            CharSequence charSequence3 = nt6Var2.a;
                            CharSequence charSequence4 = nt6Var2.g;
                            CharSequence charSequence5 = nt6Var2.f;
                            po5Var = nt6Var2.L;
                            Integer num = nt6Var2.J;
                            Integer num2 = nt6Var2.q;
                            if (bundle != null) {
                                bundle = new Bundle(bundle);
                            }
                            z = num2 == null && num2.intValue() != -1;
                            z2 = num == null;
                            if (!z || z2) {
                                if (bundle == null) {
                                    bundle = new Bundle();
                                }
                                if (z) {
                                    nt6Var = nt6Var2;
                                } else {
                                    num2.getClass();
                                    nt6Var = nt6Var2;
                                    bundle.putLong("android.media.extra.BT_FOLDER_TYPE", n26.a(num2.intValue()));
                                }
                                if (z2) {
                                    num.getClass();
                                    bundle.putLong("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT", num.intValue());
                                }
                            } else {
                                nt6Var = nt6Var2;
                            }
                            if (!po5Var.isEmpty()) {
                                if (bundle == null) {
                                    bundle = new Bundle();
                                }
                                bundle.putStringArrayList("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST", new ArrayList<>(po5Var));
                            }
                            nt6 nt6Var3 = nt6Var;
                            charSequence = nt6Var3.e;
                            if (charSequence == null) {
                                if (bundle == null) {
                                    bundle = new Bundle();
                                }
                                bundle.putCharSequence("androidx.media3.mediadescriptioncompat.title", charSequence3);
                            } else {
                                CharSequence[] charSequenceArr = new CharSequence[3];
                                int i9 = 0;
                                int i10 = 0;
                                for (int i11 = 3; i9 < i11; i11 = 3) {
                                    String[] strArr = pt6.d;
                                    if (i10 < strArr.length) {
                                        int i12 = i10 + 1;
                                        String str4 = strArr[i10];
                                        str4.getClass();
                                        switch (str4.hashCode()) {
                                            case -1853648227:
                                                if (str4.equals("android.media.metadata.ARTIST")) {
                                                    c = 0;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case -1850878751:
                                                if (str4.equals("android.media.metadata.AUTHOR")) {
                                                    c = 1;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case -1224124471:
                                                if (str4.equals("android.media.metadata.WRITER")) {
                                                    c = 2;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 194702059:
                                                if (str4.equals("android.media.metadata.DISPLAY_SUBTITLE")) {
                                                    c = 3;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 1058837545:
                                                if (str4.equals("android.media.metadata.DISPLAY_DESCRIPTION")) {
                                                    c = 4;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 1684534006:
                                                if (str4.equals("android.media.metadata.COMPOSER")) {
                                                    c = 5;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 1879671865:
                                                if (str4.equals("android.media.metadata.ALBUM")) {
                                                    c = 6;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 1897146402:
                                                if (str4.equals("android.media.metadata.TITLE")) {
                                                    c = 7;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 1965214221:
                                                if (str4.equals("android.media.metadata.ALBUM_ARTIST")) {
                                                    c = '\b';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            default:
                                                c = 65535;
                                                break;
                                        }
                                        switch (c) {
                                            case 0:
                                                charSequence2 = nt6Var3.b;
                                                break;
                                            case 1:
                                            default:
                                                charSequence2 = null;
                                                break;
                                            case 2:
                                                charSequence2 = nt6Var3.A;
                                                break;
                                            case 3:
                                                charSequence2 = charSequence5;
                                                break;
                                            case 4:
                                                charSequence2 = charSequence4;
                                                break;
                                            case 5:
                                                charSequence2 = nt6Var3.B;
                                                break;
                                            case 6:
                                                charSequence2 = nt6Var3.c;
                                                break;
                                            case 7:
                                                charSequence2 = charSequence3;
                                                break;
                                            case '\b':
                                                charSequence2 = nt6Var3.d;
                                                break;
                                        }
                                        if (!TextUtils.isEmpty(charSequence2)) {
                                            charSequenceArr[i9] = charSequence2;
                                            i9++;
                                        }
                                        i10 = i12;
                                    } else {
                                        charSequence = charSequenceArr[0];
                                        charSequence5 = charSequenceArr[1];
                                        charSequence4 = charSequenceArr[2];
                                    }
                                }
                                charSequence = charSequenceArr[0];
                                charSequence5 = charSequenceArr[1];
                                charSequence4 = charSequenceArr[2];
                            }
                            arrayList5.add(new ox6(new os6(str3, charSequence, charSequence5, charSequence4, bitmap3, nt6Var3.n, bundle, ft6Var.f.a), i7 != -1 ? -1L : i7));
                            i7++;
                            bitmap2 = null;
                        }
                        bitmap = bitmap2;
                        ft6 ft6Var2 = (ft6) arrayList3.get(i7);
                        int i82 = n26.a;
                        if (!ft6Var2.a.equals("")) {
                        }
                        nt6 nt6Var22 = ft6Var2.d;
                        if (bitmap == null) {
                        }
                        bundle = nt6Var22.K;
                        CharSequence charSequence32 = nt6Var22.a;
                        CharSequence charSequence42 = nt6Var22.g;
                        CharSequence charSequence52 = nt6Var22.f;
                        po5Var = nt6Var22.L;
                        Integer num3 = nt6Var22.J;
                        Integer num22 = nt6Var22.q;
                        if (bundle != null) {
                        }
                        if (num22 == null) {
                        }
                        if (num3 == null) {
                        }
                        if (z) {
                        }
                        if (bundle == null) {
                        }
                        if (z) {
                        }
                        if (z2) {
                        }
                        if (!po5Var.isEmpty()) {
                        }
                        nt6 nt6Var32 = nt6Var;
                        charSequence = nt6Var32.e;
                        if (charSequence == null) {
                        }
                        arrayList5.add(new ox6(new os6(str3, charSequence, charSequence52, charSequence42, bitmap3, nt6Var32.n, bundle, ft6Var2.f.a), i7 != -1 ? -1L : i7));
                        i7++;
                        bitmap2 = null;
                    }
                    ((qy6) gucVar.e).p.P(arrayList5);
                    return;
                }
                return;
            case 1:
                yx6 yx6Var = (yx6) this.b;
                nz6 nz6Var = (nz6) this.c;
                xw6 xw6Var = (xw6) this.d;
                List list = (List) this.e;
                if (yx6Var.i()) {
                    return;
                }
                yx6Var.t();
                nz6Var.a(yx6Var.t, xw6Var, list);
                return;
            case 2:
                sz6 sz6Var = (sz6) this.b;
                yx6 yx6Var2 = (yx6) this.c;
                xw6 xw6Var2 = (xw6) this.d;
                gk5 gk5Var = (gk5) this.e;
                if (yx6Var2.i()) {
                    sz6Var.c.remove(xw6Var2);
                    pye.a(gk5Var);
                    return;
                }
                x76 l = yx6Var2.l(xw6Var2);
                u8a u8aVar = new u8a();
                u8aVar.d = sz6Var;
                u8aVar.a = xw6Var2;
                u8aVar.b = yx6Var2;
                u8aVar.c = gk5Var;
                l.b(new xs4((Object) l, (Object) u8aVar, (byte) 0), new pe2(sz6Var, b));
                return;
            case 3:
                yx6 yx6Var3 = (yx6) this.b;
                gba gbaVar = (gba) this.c;
                ot2 ot2Var = (ot2) this.d;
                x76 x76Var2 = (x76) this.e;
                if (yx6Var3.i()) {
                    gbaVar.l(null);
                    return;
                }
                try {
                    ot2Var.accept(x76Var2);
                    gbaVar.l(null);
                    return;
                } catch (Throwable th) {
                    gbaVar.m(th);
                    return;
                }
            case 4:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
                c51 c51Var = (c51) this.c;
                q61 q61Var = (q61) this.d;
                Runnable runnable = (Runnable) this.e;
                if (tL_error != null) {
                    d31.Y().g0(tL_error, false);
                    return;
                }
                c51Var.setLoading(false);
                q61Var.dismiss();
                bs2.v(null, 2131746772, d31.Y(), R.raw.chats_infotip, 36);
                runnable.run();
                return;
            case 5:
                w67 w67Var = (w67) this.b;
                ok1 ok1Var = (ok1) this.c;
                String str5 = (String) this.d;
                v1b v1bVar = (v1b) this.e;
                z67 z67Var = w67Var.w.d;
                if (ok1Var != null) {
                    z67Var.w.l(str5, ok1Var);
                    if (!v1bVar.b && (i = v1bVar.a) >= 0) {
                        View m = z67Var.h.m(i);
                        if (m instanceof g1b) {
                            w67Var.r.e = ok1Var;
                            g1b g1bVar = (g1b) m;
                            g1bVar.b.u0.d(false, false);
                            g1bVar.g(false);
                        }
                    }
                }
                w67Var.f();
                return;
            case 6:
                uc7 uc7Var = (uc7) this.b;
                ArrayList arrayList6 = (ArrayList) this.d;
                TLRPC.updates_Difference updates_difference = (TLRPC.updates_Difference) this.c;
                zh6 zh6Var2 = (zh6) this.e;
                if (!arrayList6.isEmpty()) {
                    hl.c3(new yg6(uc7Var, arrayList6, updates_difference, (byte) 27));
                }
                uc7Var.getMessagesStorage().k1(updates_difference.new_messages, true, false, false, uc7Var.getDownloadController().l(), false, 0, 0L);
                for (int i13 = 0; i13 < zh6Var2.m(); i13++) {
                    long j2 = zh6Var2.j(i13);
                    ArrayList arrayList7 = (ArrayList) zh6Var2.n(i13);
                    uc7Var.getMediaDataController().Y0(arrayList7, j2, 0, 0L, new p77(uc7Var, j2, arrayList7, (byte) 4), 0, null);
                }
                return;
            case 7:
                uc7 uc7Var2 = (uc7) this.b;
                TLRPC.messages_Dialogs messages_dialogs = (TLRPC.messages_Dialogs) this.c;
                zh6 zh6Var3 = (zh6) this.d;
                zh6 zh6Var4 = (zh6) this.e;
                SparseBooleanArray sparseBooleanArray = uc7Var2.V1;
                SparseBooleanArray sparseBooleanArray2 = uc7Var2.U1;
                zh6 zh6Var5 = uc7Var2.T;
                SparseArray sparseArray = uc7Var2.V;
                zh6 zh6Var6 = uc7Var2.S;
                zh6 zh6Var7 = uc7Var2.R;
                ArrayList arrayList8 = uc7Var2.y;
                uc7Var2.e2 = false;
                uc7Var2.n(messages_dialogs.dialogs);
                ls6 mediaDataController = uc7Var2.getMediaDataController();
                mediaDataController.G(false);
                mediaDataController.L0();
                uc7Var2.j4(messages_dialogs.users, false);
                uc7Var2.c4(messages_dialogs.chats, false);
                int i14 = 0;
                while (i14 < arrayList8.size()) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList8.get(i14);
                    if (!wf3.B(dialog.id)) {
                        zh6Var7.l(dialog.id);
                        ArrayList arrayList9 = (ArrayList) zh6Var6.f(dialog.id);
                        zh6Var6.l(dialog.id);
                        if (arrayList9 != null) {
                            int i15 = 0;
                            while (i15 < arrayList9.size()) {
                                ArrayList arrayList10 = arrayList9;
                                r47 r47Var = (r47) arrayList10.get(i15);
                                if (r47Var != null) {
                                    i2 = i15;
                                    ls6Var = mediaDataController;
                                    if (r47Var.k.peer_id.channel_id == 0) {
                                        sparseArray.remove(r47Var.e1());
                                    }
                                    long j3 = r47Var.k.random_id;
                                    if (j3 != 0) {
                                        zh6Var5.l(j3);
                                    }
                                } else {
                                    i2 = i15;
                                    ls6Var = mediaDataController;
                                }
                                i15 = i2 + 1;
                                arrayList9 = arrayList10;
                                mediaDataController = ls6Var;
                            }
                        }
                    }
                    i14++;
                    mediaDataController = mediaDataController;
                }
                ls6 ls6Var2 = mediaDataController;
                int i16 = 0;
                while (i16 < zh6Var3.m()) {
                    long j4 = zh6Var3.j(i16);
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) zh6Var3.n(i16);
                    int i17 = i16;
                    ls6Var2.B1(dialog2.id, 0L, dialog2.draft);
                    TLRPC.DraftMessage draftMessage = dialog2.draft;
                    if (draftMessage instanceof TLRPC.TL_draftMessage) {
                        ls6Var2.U1(dialog2.id, 0L, draftMessage, null, false);
                    }
                    zh6Var7.k(j4, dialog2);
                    ArrayList arrayList11 = (ArrayList) zh6Var4.f(dialog2.id);
                    zh6Var6.k(j4, arrayList11);
                    if (arrayList11 != null) {
                        int i18 = 0;
                        while (i18 < arrayList11.size()) {
                            r47 r47Var2 = (r47) arrayList11.get(i18);
                            if (r47Var2 != null) {
                                zh6Var = zh6Var4;
                                arrayList = arrayList11;
                                if (r47Var2.k.peer_id.channel_id == 0) {
                                    sparseArray.put(r47Var2.e1(), r47Var2);
                                    uc7Var2.O = Math.min(uc7Var2.O, r47Var2.k.date);
                                    long j5 = r47Var2.k.random_id;
                                    if (j5 != 0) {
                                        zh6Var5.k(j5, r47Var2);
                                    }
                                }
                            } else {
                                zh6Var = zh6Var4;
                                arrayList = arrayList11;
                            }
                            i18++;
                            zh6Var4 = zh6Var;
                            arrayList11 = arrayList;
                        }
                    }
                    uc7Var2.j4.c(j4);
                    i16 = i17 + 1;
                    zh6Var4 = zh6Var4;
                }
                arrayList8.clear();
                int m2 = zh6Var7.m();
                for (int i19 = 0; i19 < m2; i19++) {
                    TLRPC.Dialog dialog3 = (TLRPC.Dialog) zh6Var7.n(i19);
                    if (uc7Var2.u0.h(dialog3.id) < 0) {
                        arrayList8.add(dialog3);
                    }
                }
                uc7Var2.h5(null);
                sparseBooleanArray2.put(0, true);
                sparseBooleanArray.put(0, false);
                sparseBooleanArray2.put(1, true);
                sparseBooleanArray.put(1, false);
                int m3 = uc7Var2.getUserConfig().m(0);
                long[] g = uc7Var2.getUserConfig().g(0);
                if (m3 < 400) {
                    long j6 = g[0];
                    if (j6 != -1 && j6 != 2147483647L) {
                        uc7Var2.d3(0, 0, 100, false, null);
                    }
                }
                uc7Var2.getNotificationCenter().k(3, new Object[0]);
                return;
            case 8:
                a();
                return;
            case 9:
                kf7 kf7Var = (kf7) this.b;
                LongSparseIntArray longSparseIntArray = (LongSparseIntArray) this.c;
                LongSparseIntArray longSparseIntArray2 = (LongSparseIntArray) this.d;
                SparseIntArray sparseIntArray = (SparseIntArray) this.e;
                kf7Var.getClass();
                try {
                    if (kf7.t0(longSparseIntArray)) {
                        i3 = 0;
                    } else {
                        SQLitePreparedStatement executeFast = kf7Var.b.executeFast("DELETE FROM unread_push_messages WHERE uid = ? AND mid <= ?");
                        int i20 = 0;
                        while (i20 < longSparseIntArray.size()) {
                            try {
                                long keyAt = longSparseIntArray.keyAt(i20);
                                int i21 = longSparseIntArray.get(keyAt);
                                SQLiteDatabase sQLiteDatabase = kf7Var.b;
                                Locale locale = Locale.US;
                                String str6 = "UPDATE messages_v2" + kf7Var.T + " SET read_state = read_state | 1 WHERE uid = %d AND mid > 0 AND mid <= %d AND read_state IN(0,2) AND out = 0";
                                Long valueOf = Long.valueOf(keyAt);
                                Integer valueOf2 = Integer.valueOf(i21);
                                int i22 = i6;
                                Object[] objArr = new Object[2];
                                objArr[i22] = valueOf;
                                objArr[1] = valueOf2;
                                sQLiteDatabase.executeFast(String.format(locale, str6, objArr)).stepThis().dispose();
                                executeFast.requery();
                                executeFast.bindLong(1, keyAt);
                                executeFast.bindInteger(2, i21);
                                executeFast.step();
                                i20++;
                                i6 = i22;
                            } catch (Exception e2) {
                                e = e2;
                                sQLitePreparedStatement = executeFast;
                                z3 = true;
                                try {
                                    kf7Var.p(e, z3);
                                    if (sQLitePreparedStatement == null) {
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (sQLitePreparedStatement != null) {
                                        sQLitePreparedStatement.dispose();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                sQLitePreparedStatement = executeFast;
                                if (sQLitePreparedStatement != null) {
                                }
                                throw th;
                            }
                        }
                        i3 = i6;
                        executeFast.dispose();
                    }
                    if (!kf7.t0(longSparseIntArray2)) {
                        for (int i23 = i3; i23 < longSparseIntArray2.size(); i23++) {
                            long keyAt2 = longSparseIntArray2.keyAt(i23);
                            int i24 = longSparseIntArray2.get(keyAt2);
                            SQLiteDatabase sQLiteDatabase2 = kf7Var.b;
                            Locale locale2 = Locale.US;
                            sQLiteDatabase2.executeFast("UPDATE messages_v2 SET read_state = read_state | 1 WHERE uid = " + keyAt2 + " AND mid > 0 AND mid <= " + i24 + " AND read_state IN(0,2) AND out = 1").stepThis().dispose();
                        }
                    }
                    if (sparseIntArray != null) {
                        if ((sparseIntArray.size() == 0 ? 1 : i3) == 0) {
                            for (int i25 = i3; i25 < sparseIntArray.size(); i25++) {
                                long E = wf3.E(sparseIntArray.keyAt(i25));
                                int valueAt = sparseIntArray.valueAt(i25);
                                SQLitePreparedStatement executeFast2 = kf7Var.b.executeFast("UPDATE messages_v2 SET read_state = read_state | 1 WHERE uid = ? AND date <= ? AND read_state IN(0,2) AND out = 1");
                                try {
                                    executeFast2.requery();
                                    executeFast2.bindLong(1, E);
                                    executeFast2.bindInteger(2, valueAt);
                                    executeFast2.step();
                                    executeFast2.dispose();
                                } catch (Exception e3) {
                                    e = e3;
                                    sQLitePreparedStatement = executeFast2;
                                    z3 = true;
                                    kf7Var.p(e, z3);
                                    if (sQLitePreparedStatement == null) {
                                        sQLitePreparedStatement.dispose();
                                        return;
                                    }
                                    return;
                                } catch (Throwable th4) {
                                    th = th4;
                                    sQLitePreparedStatement = executeFast2;
                                    if (sQLitePreparedStatement != null) {
                                    }
                                    throw th;
                                }
                            }
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Exception e4) {
                    e = e4;
                    z3 = true;
                    sQLitePreparedStatement = null;
                } catch (Throwable th5) {
                    th = th5;
                    sQLitePreparedStatement = null;
                }
            case 10:
                b();
                return;
            case 11:
                kf7 kf7Var2 = (kf7) this.b;
                TLRPC.Document document = (TLRPC.Document) this.c;
                String str7 = (String) this.d;
                String str8 = (String) this.e;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase3 = kf7Var2.b;
                        try {
                            if (document != null) {
                                sQLitePreparedStatement2 = sQLiteDatabase3.executeFast("UPDATE web_recent_v3 SET document = ? WHERE image_url = ?");
                                sQLitePreparedStatement2.requery();
                                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(document.getObjectSize());
                                document.serializeToStream(nativeByteBuffer);
                                sQLitePreparedStatement2.bindByteBuffer(1, nativeByteBuffer);
                                sQLitePreparedStatement2.bindString(2, str7);
                                sQLitePreparedStatement2.step();
                                sQLitePreparedStatement2.dispose();
                                nativeByteBuffer.reuse();
                            } else {
                                sQLitePreparedStatement2 = sQLiteDatabase3.executeFast("UPDATE web_recent_v3 SET local_url = ? WHERE image_url = ?");
                                sQLitePreparedStatement2.requery();
                                sQLitePreparedStatement2.bindString(1, str8);
                                sQLitePreparedStatement2.bindString(2, str7);
                                sQLitePreparedStatement2.step();
                                sQLitePreparedStatement2.dispose();
                            }
                        } catch (Exception e5) {
                            e = e5;
                            z4 = true;
                            kf7Var2.p(e, z4);
                            if (sQLitePreparedStatement2 == null) {
                                return;
                            }
                            sQLitePreparedStatement2.dispose();
                            return;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        if (sQLitePreparedStatement2 != null) {
                            sQLitePreparedStatement2.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e6) {
                    e = e6;
                    z4 = true;
                    sQLitePreparedStatement2 = null;
                } catch (Throwable th7) {
                    th = th7;
                    sQLitePreparedStatement2 = null;
                    if (sQLitePreparedStatement2 != null) {
                    }
                    throw th;
                }
                sQLitePreparedStatement2.dispose();
                return;
            case 12:
                ((NativeInstance) this.b).lambda$onAudioLevelsUpdated$1((int[]) this.c, (float[]) this.d, (boolean[]) this.e);
                return;
            case 13:
                sp7 sp7Var = (sp7) this.b;
                ArrayList arrayList12 = (ArrayList) this.d;
                ArrayList arrayList13 = (ArrayList) this.e;
                ArrayList arrayList14 = (ArrayList) this.c;
                sv9 sv9Var = sp7Var.h;
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = sp7Var.n;
                if (notificationsCustomSettingsActivity.f) {
                    sp7Var.f = null;
                    sp7Var.d = arrayList12;
                    sp7Var.e = arrayList13;
                    sv9Var.f(arrayList14, null);
                    if (notificationsCustomSettingsActivity.f && !sv9Var.e()) {
                        notificationsCustomSettingsActivity.c.c();
                    }
                    sp7Var.f();
                    return;
                }
                return;
            case 14:
                OpusDred.lambda$whenReadyForGroupCall$0((boolean[]) this.b, (Runnable[]) this.c, (Runnable[]) this.d, (Runnable) this.e);
                return;
            case 15:
                p pVar = (p) this.b;
                wk5 wk5Var = (wk5) this.c;
                Activity activity = (Activity) this.d;
                TLRPC.Message message = (TLRPC.Message) this.e;
                String str9 = "";
                pVar.b1 = true;
                pVar.g1 = 1;
                pVar.B0(wk5Var, activity);
                TLRPC.InputInvoice inputInvoice = pVar.c1;
                boolean z5 = inputInvoice instanceof TLRPC.TL_inputInvoiceStars;
                boolean z6 = z5 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGift);
                boolean z7 = z5 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway);
                if (!z5 && (z28Var2 = pVar.a1) != null) {
                    z28Var2.c(pVar.g1);
                }
                pVar.h0();
                if (z5 && (z28Var = pVar.a1) != null) {
                    z28Var.c(pVar.g1);
                }
                long e0 = pVar.e0();
                if (e0 > 0) {
                    str9 = lbc.l(pVar.getMessagesController().X1(Long.valueOf(e0)));
                } else if (e0 < 0 && (M0 = pVar.getMessagesController().M0(Long.valueOf(-e0))) != null) {
                    str9 = M0.title;
                }
                long d0 = pVar.d0();
                int i26 = z5 ? (z6 || z7) ? R.raw.stars_send : R.raw.stars_topup : R.raw.payment_success;
                if (z5) {
                    if (z7) {
                        i4 = 2131744749;
                        str = null;
                    } else {
                        str = null;
                        if (z6) {
                            i4 = 2131744757;
                        } else {
                            M02 = ob6.M0(2131744816, null);
                        }
                    }
                    M02 = ob6.M0(i4, str);
                } else {
                    M02 = null;
                }
                if (z5) {
                    a0 = z7 ? ob6.H(',', "StarsGiveawaySentPopupInfo", (int) d0) : ob6.K(z6 ? "StarsGiftSentPopupInfo" : "StarsAcquiredInfo", (int) d0, ',', str9);
                    str2 = null;
                } else {
                    str2 = null;
                    a0 = ob6.a0(null, null, 2131747128, pVar.S0[0], pVar.r0);
                }
                SpannableStringBuilder S2 = hl.S2(a0);
                e S = LaunchActivity.S();
                if (S != null) {
                    d31 b0 = d31.b0(S);
                    if (e0 == 0 || M02 == null || z7) {
                        String str10 = M02;
                        I = str10 != null ? b0.I(i26, str10, S2) : b0.Q(i26, 36, S2);
                    } else {
                        I = b0.L(i26, M02, S2, ob6.M0(2131743204, str2), new tz6((byte) 1, e0));
                    }
                    I.s = false;
                    I.j = 5000;
                    if (message != null) {
                        e73 e73Var = new e73(pVar, I, z6, message, (byte) 2);
                        z11 z11Var = I.e;
                        if (z11Var != null) {
                            z11Var.setOnClickListener(e73Var);
                        }
                    }
                    I.k(z7);
                    return;
                }
                return;
            case 16:
                ((p) this.b).k0((TLObject) this.c, (TLRPC.TL_error) this.d, (TL_account.getTmpPassword) this.e);
                return;
            case 17:
                j68 j68Var = (j68) this.b;
                Activity activity2 = (Activity) this.c;
                lcb lcbVar = (lcb) this.d;
                m68 m68Var = (m68) this.e;
                sbb C = sbb.C(activity2, j68Var.x.m2);
                d30 d30Var = j68Var.x.w2;
                if (d30Var != null && (kcbVar = (kcb) d30Var.c) != null) {
                    j = kcbVar.currentPosition;
                }
                ar3 ar3Var = uc7.s1(j68Var.x.m2).O1().w;
                TL_stories.StoryItem storyItem2 = j68Var.x.y1.a;
                long j7 = storyItem2.dialogId;
                ArrayList arrayList15 = ar3Var.b;
                int size = arrayList15.size();
                while (i6 < size) {
                    Object obj = arrayList15.get(i6);
                    int i27 = i6 + 1;
                    c8b c8bVar2 = (c8b) obj;
                    if (c8bVar2.g && storyItem2.id == c8bVar2.f && j7 == c8bVar2.e) {
                        TLRPC.MessageMedia messageMedia = storyItem2.media;
                        TLRPC.Document document2 = messageMedia.document;
                        if (document2 != null) {
                            i5 = i27;
                            long j8 = document2.id;
                            arrayList2 = arrayList15;
                            storyItem = storyItem2;
                            if (j8 != c8bVar2.H) {
                                continue;
                            }
                        } else {
                            arrayList2 = arrayList15;
                            storyItem = storyItem2;
                            i5 = i27;
                        }
                        TLRPC.Photo photo = messageMedia.photo;
                        if (photo == null || photo.id == c8bVar2.I) {
                            c8bVar2.h = true;
                            c8bVar = c8bVar2;
                            if (c8bVar != null || c8bVar.u || (file = c8bVar.L) == null || !file.exists()) {
                                c8bVar = c8b.n(j68Var.x.y1.f(), j68Var.x.y1.a);
                                c8bVar.e = j68Var.x.l1;
                            }
                            c8b g2 = c8bVar.g();
                            if (j68Var.x.A0()) {
                                o68 o68Var = j68Var.x;
                                g2.J0 = o68Var.l1;
                                g2.L0 = uc7.n5(o68Var.y1.a.media);
                                v5b v5bVar = lcbVar.O0;
                                if (v5bVar instanceof p5b) {
                                    g2.K0 = ((p5b) v5bVar).E;
                                }
                            }
                            C.R(nbb.d(lcbVar), g2, j);
                            C.R = new a68(j68Var, (byte) 2);
                            C.S = new b68(j68Var, m68Var, (byte) 1);
                            return;
                        }
                    } else {
                        arrayList2 = arrayList15;
                        storyItem = storyItem2;
                        i5 = i27;
                    }
                    i6 = i5;
                    storyItem2 = storyItem;
                    arrayList15 = arrayList2;
                }
                c8bVar = null;
                if (c8bVar != null) {
                }
                c8bVar = c8b.n(j68Var.x.y1.f(), j68Var.x.y1.a);
                c8bVar.e = j68Var.x.l1;
                c8b g22 = c8bVar.g();
                if (j68Var.x.A0()) {
                }
                C.R(nbb.d(lcbVar), g22, j);
                C.R = new a68(j68Var, (byte) 2);
                C.S = new b68(j68Var, m68Var, (byte) 1);
                return;
            case 18:
                j68 j68Var2 = (j68) this.b;
                TLObject tLObject = (TLObject) this.c;
                TL_stories.StoryItem storyItem3 = (TL_stories.StoryItem) this.d;
                pcc pccVar = (pcc) this.e;
                o68 o68Var2 = j68Var2.x;
                if (tLObject instanceof TL_stories.TL_stories_stories) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    uc7.s1(o68Var2.m2).j4(tL_stories_stories.users, false);
                    uc7.s1(o68Var2.m2).c4(tL_stories_stories.chats, false);
                    while (i6 < tL_stories_stories.stories.size()) {
                        if (tL_stories_stories.stories.get(i6).id == storyItem3.id) {
                            pccVar.a(tL_stories_stories.stories.get(i6).media.document);
                            return;
                        }
                        i6++;
                    }
                }
                pccVar.a(null);
                return;
            case 19:
                c();
                return;
            case 20:
                d();
                return;
            case 21:
                e();
                return;
            case 22:
                f();
                return;
            case 23:
                g();
                return;
            case 24:
                h();
                return;
            case 25:
                i();
                return;
            case 26:
                j();
                return;
            case 27:
                k();
                return;
            case 28:
                l();
                return;
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                int[] iArr = (int[]) this.e;
                RectF rectF = ProfileActivity.Z6;
                if (!(tLObject2 instanceof TLRPC.TL_boolTrue)) {
                    profileActivity.getClass();
                    d31.b0(profileActivity).g0(tL_error2, false);
                }
                if (profileActivity.r4 == iArr[0]) {
                    profileActivity.r4 = 0;
                    return;
                }
                return;
        }
    }

    public /* synthetic */ oy6(uc7 uc7Var, ArrayList arrayList, TLRPC.updates_Difference updates_difference, zh6 zh6Var) {
        this.a = (byte) 6;
        this.b = uc7Var;
        this.d = arrayList;
        this.c = updates_difference;
        this.e = zh6Var;
    }

    public /* synthetic */ oy6(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
