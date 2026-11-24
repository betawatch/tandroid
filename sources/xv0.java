// default package

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.SparseArray;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationRepeat;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class xv0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;

    public /* synthetic */ xv0(int i, byte b) {
        this.a = b;
        this.b = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:262:0x052e, code lost:
    
        if (r0.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x0223, code lost:
    
        if (r0.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0179, code lost:
    
        if (r9 != null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0185, code lost:
    
        if (r1 == r3) goto L495;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0187, code lost:
    
        r0 = org.telegram.messenger.MediaController.Z1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0189, code lost:
    
        if (r0 == null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x018b, code lost:
    
        gl.r(r0);
        org.telegram.messenger.MediaController.Z1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0190, code lost:
    
        org.telegram.messenger.MediaController.N(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0193, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:?, code lost:
    
        return;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:131:0x020c A[Catch: all -> 0x04c6, TRY_ENTER, TryCatch #25 {all -> 0x04c6, blocks: (B:131:0x020c, B:269:0x0245, B:272:0x0256, B:446:0x0213, B:448:0x0219, B:450:0x021f), top: B:129:0x020a }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0517 A[Catch: all -> 0x06a7, TryCatch #5 {all -> 0x06a7, blocks: (B:137:0x050f, B:139:0x0517, B:160:0x0533, B:163:0x054b, B:257:0x051e, B:259:0x0524, B:261:0x052a), top: B:136:0x050f }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x06c1 A[LOOP:1: B:145:0x06bb->B:147:0x06c1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x06d9  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x06a0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x06ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x051e A[Catch: all -> 0x06a7, TryCatch #5 {all -> 0x06a7, blocks: (B:137:0x050f, B:139:0x0517, B:160:0x0533, B:163:0x054b, B:257:0x051e, B:259:0x0524, B:261:0x052a), top: B:136:0x050f }] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x04bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0264 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0503 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:445:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0213 A[Catch: all -> 0x04c6, TryCatch #25 {all -> 0x04c6, blocks: (B:131:0x020c, B:269:0x0245, B:272:0x0256, B:446:0x0213, B:448:0x0219, B:450:0x021f), top: B:129:0x020a }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0140 A[Catch: all -> 0x017c, TryCatch #20 {all -> 0x017c, blocks: (B:62:0x013a, B:64:0x0140, B:66:0x0146, B:68:0x014c, B:70:0x0158, B:72:0x016e, B:74:0x0174, B:86:0x0152), top: B:61:0x013a }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SparseArray sparseArray;
        String str;
        ArrayList arrayList;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        ArrayList arrayList2;
        SparseArray sparseArray2;
        String str9;
        boolean z;
        xl6 xl6Var;
        xl6 xl6Var2;
        Integer num;
        Cursor cursor;
        xl6 xl6Var3;
        xl6 xl6Var4;
        boolean z2;
        xl6 xl6Var5;
        int i;
        qt qtVar;
        int i2;
        Cursor query;
        Cursor cursor2;
        int i3;
        int i4;
        int i5;
        int i6;
        xl6 xl6Var6;
        xl6 xl6Var7;
        Context context;
        int i7;
        ArrayList arrayList3;
        Cursor query2;
        int columnIndex;
        int columnIndex2;
        int columnIndex3;
        int columnIndex4;
        int columnIndex5;
        int columnIndex6;
        int columnIndex7;
        int i8;
        int i9;
        int i10;
        xl6 xl6Var8;
        xl6 xl6Var9;
        int i11;
        int i12;
        int i13;
        Cursor cursor3;
        Cursor cursor4;
        int i14;
        Context context2;
        int i15;
        File O0;
        bwc bwcVar;
        byte b = 1;
        switch (this.a) {
            case 0:
                hq6.d0(this.b).G0(false, true, null);
                return;
            case 1:
                ConnectionsManager.lambda$onUpdate$13(this.b);
                return;
            case 2:
                ConnectionsManager.lambda$onSessionCreated$14(this.b);
                return;
            case 3:
                ConnectionsManager.lambda$onLogout$16(this.b);
                return;
            case 4:
                try {
                    ad7.Y(this.b).b.executeFast("DELETE FROM search_recent WHERE 1").stepThis().dispose();
                    return;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            case 5:
                int i16 = this.b;
                String str10 = LaunchActivity.C1;
                a.F = true;
                a.H = 0L;
                if (VoIPService.getSharedInstance() == null) {
                    na7.q1(i16).Z3 = false;
                    return;
                }
                return;
            case 6:
                int i17 = this.b;
                String[] strArr = MediaController.W1;
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = arrayList4;
                SparseArray sparseArray3 = new SparseArray();
                SparseArray sparseArray4 = new SparseArray();
                try {
                    StringBuilder sb = new StringBuilder();
                    sparseArray = sparseArray4;
                    try {
                        sb.append(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).getAbsolutePath());
                        sb.append("/Camera/");
                        str = sb.toString();
                    } catch (Exception e2) {
                        e = e2;
                        fa4.g(e, true);
                        str = null;
                        context = a.b;
                        i7 = Build.VERSION.SDK_INT;
                        arrayList3 = arrayList5;
                        if (i7 < 33) {
                        }
                    }
                } catch (Exception e3) {
                    e = e3;
                    sparseArray = sparseArray4;
                }
                try {
                    context = a.b;
                    i7 = Build.VERSION.SDK_INT;
                    arrayList3 = arrayList5;
                } catch (Throwable th) {
                    th = th;
                    arrayList = arrayList5;
                    str2 = "_data";
                    str3 = "bucket_display_name";
                    str4 = "_id";
                    str5 = "bucket_id";
                    str6 = "height";
                    str7 = "width";
                    str8 = "orientation";
                    arrayList2 = arrayList6;
                    sparseArray2 = sparseArray3;
                    str9 = str;
                }
                try {
                } catch (Throwable th2) {
                    th = th2;
                    str2 = "_data";
                    str3 = "bucket_display_name";
                    str4 = "_id";
                    str5 = "bucket_id";
                    str6 = "height";
                    str7 = "width";
                    str8 = "orientation";
                    arrayList2 = arrayList6;
                    sparseArray2 = sparseArray3;
                    str9 = str;
                    arrayList = arrayList3;
                    z = true;
                    xl6Var = null;
                    xl6Var2 = null;
                    num = null;
                    cursor = null;
                    try {
                        fa4.g(th, z);
                        if (cursor != null) {
                        }
                        xl6Var3 = xl6Var;
                        xl6Var4 = xl6Var2;
                        try {
                            Context context3 = a.b;
                            i2 = Build.VERSION.SDK_INT;
                            if (i2 < 33) {
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                        xl6 xl6Var10 = xl6Var4;
                        Integer num2 = num;
                        while (i < arrayList2.size()) {
                        }
                        qtVar = MediaController.e2;
                        if (qtVar != null) {
                        }
                        qt qtVar2 = new qt(i17, arrayList2, arrayList, num2, xl6Var10, xl6Var3, xl6Var5);
                        MediaController.e2 = qtVar2;
                        gl.e3(qtVar2, 0L);
                        return;
                    } catch (Throwable th4) {
                        boolean z3 = z;
                        if (cursor == null) {
                            throw th4;
                        }
                        try {
                            cursor.close();
                            throw th4;
                        } catch (Exception e4) {
                            fa4.g(e4, z3);
                            throw th4;
                        }
                    }
                }
                if (i7 < 33) {
                    if (context.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0) {
                        if (context.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
                            break;
                        }
                    }
                    query2 = MediaStore.Images.Media.query(context.getContentResolver(), MediaStore.Images.Media.EXTERNAL_CONTENT_URI, MediaController.W1, null, null, (i7 <= 28 ? "date_modified" : "datetaken").concat(" DESC"));
                    if (query2 == null) {
                    }
                    if (cursor != null) {
                    }
                    Context context32 = a.b;
                    i2 = Build.VERSION.SDK_INT;
                    if (i2 < 33) {
                    }
                    xl6 xl6Var102 = xl6Var4;
                    Integer num22 = num;
                    while (i < arrayList2.size()) {
                    }
                    qtVar = MediaController.e2;
                    if (qtVar != null) {
                    }
                    qt qtVar22 = new qt(i17, arrayList2, arrayList, num22, xl6Var102, xl6Var3, xl6Var5);
                    MediaController.e2 = qtVar22;
                    gl.e3(qtVar22, 0L);
                    return;
                }
                if (context.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                    str2 = "_data";
                    str3 = "bucket_display_name";
                    str4 = "_id";
                    str5 = "bucket_id";
                    str6 = "height";
                    str7 = "width";
                    str8 = "orientation";
                    arrayList2 = arrayList6;
                    sparseArray2 = sparseArray3;
                    str9 = str;
                    arrayList = arrayList3;
                    xl6Var3 = null;
                    xl6Var4 = null;
                    num = null;
                    cursor = null;
                    if (cursor != null) {
                        try {
                            cursor.close();
                        } catch (Exception e5) {
                            fa4.g(e5, true);
                        }
                    }
                    Context context322 = a.b;
                    i2 = Build.VERSION.SDK_INT;
                    if (i2 < 33) {
                        if (context322.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                            xl6Var5 = null;
                            if (cursor != null) {
                                try {
                                    cursor.close();
                                } catch (Exception e6) {
                                    e = e6;
                                    z2 = true;
                                    fa4.g(e, z2);
                                    xl6 xl6Var1022 = xl6Var4;
                                    Integer num222 = num;
                                    while (i < arrayList2.size()) {
                                    }
                                    qtVar = MediaController.e2;
                                    if (qtVar != null) {
                                    }
                                    qt qtVar222 = new qt(i17, arrayList2, arrayList, num222, xl6Var1022, xl6Var3, xl6Var5);
                                    MediaController.e2 = qtVar222;
                                    gl.e3(qtVar222, 0L);
                                    return;
                                }
                            }
                        }
                        ContentResolver contentResolver = a.b.getContentResolver();
                        Uri uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                        String[] strArr2 = MediaController.X1;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(i2 <= 28 ? "date_modified" : "datetaken");
                        sb2.append(" DESC");
                        query = MediaStore.Images.Media.query(contentResolver, uri, strArr2, null, null, sb2.toString());
                        if (query == null) {
                            try {
                                int columnIndex8 = query.getColumnIndex(str4);
                                int columnIndex9 = query.getColumnIndex(str5);
                                int columnIndex10 = query.getColumnIndex(str3);
                                int columnIndex11 = query.getColumnIndex(str2);
                                int columnIndex12 = query.getColumnIndex(i2 > 28 ? "date_modified" : "datetaken");
                                int columnIndex13 = query.getColumnIndex("duration");
                                int columnIndex14 = query.getColumnIndex(str7);
                                int columnIndex15 = query.getColumnIndex(str6);
                                int columnIndex16 = query.getColumnIndex("_size");
                                query.getColumnIndex(str8);
                                xl6 xl6Var11 = null;
                                while (query.moveToNext()) {
                                    try {
                                        String string = query.getString(columnIndex11);
                                        if (!TextUtils.isEmpty(string)) {
                                            int i18 = query.getInt(columnIndex8);
                                            int i19 = query.getInt(columnIndex9);
                                            String string2 = query.getString(columnIndex10);
                                            int i20 = columnIndex8;
                                            int i21 = columnIndex12;
                                            jm6 jm6Var = new jm6(i19, i18, query.getLong(columnIndex12), string, 0, (int) (query.getLong(columnIndex13) / 1000), true, query.getInt(columnIndex14), query.getInt(columnIndex15), query.getLong(columnIndex16));
                                            cursor2 = query;
                                            if (xl6Var11 == null) {
                                                i3 = columnIndex9;
                                                try {
                                                    i4 = columnIndex10;
                                                    i5 = columnIndex11;
                                                    xl6Var7 = new xl6(0, k96.M0(2131754284, null), jm6Var);
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    xl6Var5 = xl6Var11;
                                                    cursor = cursor2;
                                                    z2 = true;
                                                    try {
                                                        fa4.g(th, z2);
                                                        if (cursor != null) {
                                                            try {
                                                                cursor.close();
                                                            } catch (Exception e7) {
                                                                e = e7;
                                                                fa4.g(e, z2);
                                                                xl6 xl6Var10222 = xl6Var4;
                                                                Integer num2222 = num;
                                                                while (i < arrayList2.size()) {
                                                                }
                                                                qtVar = MediaController.e2;
                                                                if (qtVar != null) {
                                                                }
                                                                qt qtVar2222 = new qt(i17, arrayList2, arrayList, num2222, xl6Var10222, xl6Var3, xl6Var5);
                                                                MediaController.e2 = qtVar2222;
                                                                gl.e3(qtVar2222, 0L);
                                                                return;
                                                            }
                                                        }
                                                        xl6 xl6Var102222 = xl6Var4;
                                                        Integer num22222 = num;
                                                        while (i < arrayList2.size()) {
                                                        }
                                                        qtVar = MediaController.e2;
                                                        if (qtVar != null) {
                                                        }
                                                        qt qtVar22222 = new qt(i17, arrayList2, arrayList, num22222, xl6Var102222, xl6Var3, xl6Var5);
                                                        MediaController.e2 = qtVar22222;
                                                        gl.e3(qtVar22222, 0L);
                                                        return;
                                                    } finally {
                                                    }
                                                }
                                                try {
                                                    xl6Var7.b = true;
                                                    int i22 = xl6Var4 != null ? 1 : 0;
                                                    if (xl6Var3 != null) {
                                                        i22++;
                                                    }
                                                    arrayList2.add(i22, xl6Var7);
                                                    xl6Var11 = xl6Var7;
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    xl6Var5 = xl6Var7;
                                                    cursor = cursor2;
                                                    z2 = true;
                                                    fa4.g(th, z2);
                                                    if (cursor != null) {
                                                    }
                                                    xl6 xl6Var1022222 = xl6Var4;
                                                    Integer num222222 = num;
                                                    while (i < arrayList2.size()) {
                                                    }
                                                    qtVar = MediaController.e2;
                                                    if (qtVar != null) {
                                                    }
                                                    qt qtVar222222 = new qt(i17, arrayList2, arrayList, num222222, xl6Var1022222, xl6Var3, xl6Var5);
                                                    MediaController.e2 = qtVar222222;
                                                    gl.e3(qtVar222222, 0L);
                                                    return;
                                                }
                                            } else {
                                                i3 = columnIndex9;
                                                i4 = columnIndex10;
                                                i5 = columnIndex11;
                                            }
                                            if (xl6Var4 == null) {
                                                i6 = columnIndex13;
                                                xl6Var6 = new xl6(0, k96.M0(2131754296, null), jm6Var);
                                                try {
                                                    arrayList2.add(0, xl6Var6);
                                                } catch (Throwable th7) {
                                                    th = th7;
                                                    xl6Var4 = xl6Var6;
                                                    xl6Var5 = xl6Var11;
                                                    cursor = cursor2;
                                                    z2 = true;
                                                    fa4.g(th, z2);
                                                    if (cursor != null) {
                                                    }
                                                    xl6 xl6Var10222222 = xl6Var4;
                                                    Integer num2222222 = num;
                                                    while (i < arrayList2.size()) {
                                                    }
                                                    qtVar = MediaController.e2;
                                                    if (qtVar != null) {
                                                    }
                                                    qt qtVar2222222 = new qt(i17, arrayList2, arrayList, num2222222, xl6Var10222222, xl6Var3, xl6Var5);
                                                    MediaController.e2 = qtVar2222222;
                                                    gl.e3(qtVar2222222, 0L);
                                                    return;
                                                }
                                            } else {
                                                i6 = columnIndex13;
                                                xl6Var6 = xl6Var4;
                                            }
                                            xl6Var11.a(jm6Var);
                                            xl6Var6.a(jm6Var);
                                            xl6 xl6Var12 = (xl6) sparseArray2.get(i19);
                                            if (xl6Var12 == null) {
                                                xl6Var12 = new xl6(i19, string2, jm6Var);
                                                sparseArray2.put(i19, xl6Var12);
                                                if (num != null || str9 == null || string == null || !string.startsWith(str9)) {
                                                    arrayList2.add(xl6Var12);
                                                } else {
                                                    arrayList2.add(0, xl6Var12);
                                                    num = Integer.valueOf(i19);
                                                }
                                            }
                                            xl6Var12.a(jm6Var);
                                            xl6Var4 = xl6Var6;
                                            query = cursor2;
                                            columnIndex9 = i3;
                                            columnIndex8 = i20;
                                            columnIndex10 = i4;
                                            columnIndex11 = i5;
                                            columnIndex12 = i21;
                                            columnIndex13 = i6;
                                        }
                                    } catch (Throwable th8) {
                                        th = th8;
                                        cursor2 = query;
                                    }
                                }
                                xl6Var5 = xl6Var11;
                                cursor = query;
                                if (cursor != null) {
                                }
                            } catch (Throwable th9) {
                                th = th9;
                                cursor = query;
                                z2 = true;
                                xl6Var5 = null;
                                fa4.g(th, z2);
                                if (cursor != null) {
                                }
                                xl6 xl6Var102222222 = xl6Var4;
                                Integer num22222222 = num;
                                while (i < arrayList2.size()) {
                                }
                                qtVar = MediaController.e2;
                                if (qtVar != null) {
                                }
                                qt qtVar22222222 = new qt(i17, arrayList2, arrayList, num22222222, xl6Var102222222, xl6Var3, xl6Var5);
                                MediaController.e2 = qtVar22222222;
                                gl.e3(qtVar22222222, 0L);
                                return;
                            }
                        } else {
                            cursor = query;
                            xl6Var5 = null;
                            if (cursor != null) {
                            }
                        }
                    } else {
                        if (context322.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0) {
                            if (context322.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
                                break;
                            }
                        }
                        ContentResolver contentResolver2 = a.b.getContentResolver();
                        Uri uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                        String[] strArr22 = MediaController.X1;
                        StringBuilder sb22 = new StringBuilder();
                        sb22.append(i2 <= 28 ? "date_modified" : "datetaken");
                        sb22.append(" DESC");
                        query = MediaStore.Images.Media.query(contentResolver2, uri2, strArr22, null, null, sb22.toString());
                        if (query == null) {
                        }
                    }
                    xl6 xl6Var1022222222 = xl6Var4;
                    Integer num222222222 = num;
                    for (i = 0; i < arrayList2.size(); i++) {
                        Collections.sort(((xl6) arrayList2.get(i)).e, new el6((byte) 0));
                    }
                    qtVar = MediaController.e2;
                    if (qtVar != null) {
                        gl.r(qtVar);
                    }
                    qt qtVar222222222 = new qt(i17, arrayList2, arrayList, num222222222, xl6Var1022222222, xl6Var3, xl6Var5);
                    MediaController.e2 = qtVar222222222;
                    gl.e3(qtVar222222222, 0L);
                    return;
                }
                query2 = MediaStore.Images.Media.query(context.getContentResolver(), MediaStore.Images.Media.EXTERNAL_CONTENT_URI, MediaController.W1, null, null, (i7 <= 28 ? "date_modified" : "datetaken").concat(" DESC"));
                if (query2 == null) {
                    try {
                        int columnIndex17 = query2.getColumnIndex("_id");
                        str4 = "_id";
                        try {
                            columnIndex = query2.getColumnIndex("bucket_id");
                            str5 = "bucket_id";
                            try {
                                columnIndex2 = query2.getColumnIndex("bucket_display_name");
                                str3 = "bucket_display_name";
                                try {
                                    columnIndex3 = query2.getColumnIndex("_data");
                                    str2 = "_data";
                                    try {
                                        columnIndex4 = query2.getColumnIndex(i7 > 28 ? "date_modified" : "datetaken");
                                        columnIndex5 = query2.getColumnIndex("orientation");
                                        str8 = "orientation";
                                        try {
                                            columnIndex6 = query2.getColumnIndex("width");
                                            str7 = "width";
                                            try {
                                                columnIndex7 = query2.getColumnIndex("height");
                                                str6 = "height";
                                            } catch (Throwable th10) {
                                                th = th10;
                                                cursor = query2;
                                                str6 = "height";
                                            }
                                        } catch (Throwable th11) {
                                            th = th11;
                                            cursor = query2;
                                            str6 = "height";
                                            str7 = "width";
                                        }
                                    } catch (Throwable th12) {
                                        th = th12;
                                        cursor = query2;
                                        str6 = "height";
                                        str7 = "width";
                                        str8 = "orientation";
                                        arrayList2 = arrayList6;
                                        sparseArray2 = sparseArray3;
                                        str9 = str;
                                        arrayList = arrayList3;
                                        z = true;
                                        xl6Var = null;
                                        xl6Var2 = null;
                                        num = null;
                                        fa4.g(th, z);
                                        if (cursor != null) {
                                        }
                                        xl6Var3 = xl6Var;
                                        xl6Var4 = xl6Var2;
                                        Context context3222 = a.b;
                                        i2 = Build.VERSION.SDK_INT;
                                        if (i2 < 33) {
                                        }
                                        xl6 xl6Var10222222222 = xl6Var4;
                                        Integer num2222222222 = num;
                                        while (i < arrayList2.size()) {
                                        }
                                        qtVar = MediaController.e2;
                                        if (qtVar != null) {
                                        }
                                        qt qtVar2222222222 = new qt(i17, arrayList2, arrayList, num2222222222, xl6Var10222222222, xl6Var3, xl6Var5);
                                        MediaController.e2 = qtVar2222222222;
                                        gl.e3(qtVar2222222222, 0L);
                                        return;
                                    }
                                } catch (Throwable th13) {
                                    th = th13;
                                    cursor = query2;
                                    str2 = "_data";
                                }
                            } catch (Throwable th14) {
                                th = th14;
                                cursor = query2;
                                str2 = "_data";
                                str3 = "bucket_display_name";
                            }
                        } catch (Throwable th15) {
                            th = th15;
                            cursor = query2;
                            str2 = "_data";
                            str3 = "bucket_display_name";
                            str5 = "bucket_id";
                            str6 = "height";
                            str7 = "width";
                            str8 = "orientation";
                            arrayList2 = arrayList6;
                            sparseArray2 = sparseArray3;
                            str9 = str;
                            arrayList = arrayList3;
                            z = true;
                            xl6Var = null;
                            xl6Var2 = null;
                            num = null;
                            fa4.g(th, z);
                            if (cursor != null) {
                            }
                            xl6Var3 = xl6Var;
                            xl6Var4 = xl6Var2;
                            Context context32222 = a.b;
                            i2 = Build.VERSION.SDK_INT;
                            if (i2 < 33) {
                            }
                            xl6 xl6Var102222222222 = xl6Var4;
                            Integer num22222222222 = num;
                            while (i < arrayList2.size()) {
                            }
                            qtVar = MediaController.e2;
                            if (qtVar != null) {
                            }
                            qt qtVar22222222222 = new qt(i17, arrayList2, arrayList, num22222222222, xl6Var102222222222, xl6Var3, xl6Var5);
                            MediaController.e2 = qtVar22222222222;
                            gl.e3(qtVar22222222222, 0L);
                            return;
                        }
                        try {
                            int columnIndex18 = query2.getColumnIndex("_size");
                            xl6Var3 = null;
                            xl6Var4 = null;
                            num = null;
                            Integer num3 = null;
                            while (query2.moveToNext()) {
                                try {
                                    String string3 = query2.getString(columnIndex3);
                                    if (!TextUtils.isEmpty(string3)) {
                                        int i23 = query2.getInt(columnIndex17);
                                        int i24 = query2.getInt(columnIndex);
                                        int i25 = columnIndex17;
                                        String string4 = query2.getString(columnIndex2);
                                        jm6 jm6Var2 = new jm6(i24, i23, query2.getLong(columnIndex4), string3, query2.getInt(columnIndex5), 0, false, query2.getInt(columnIndex6), query2.getInt(columnIndex7), query2.getLong(columnIndex18));
                                        int i26 = columnIndex4;
                                        int i27 = columnIndex3;
                                        cursor = query2;
                                        if (xl6Var3 == null) {
                                            i8 = columnIndex;
                                            try {
                                                i9 = columnIndex5;
                                                i10 = columnIndex2;
                                                xl6Var8 = new xl6(0, k96.M0(2131754289, null), jm6Var2);
                                                arrayList = arrayList3;
                                                try {
                                                    arrayList.add(0, xl6Var8);
                                                } catch (Throwable th16) {
                                                    th = th16;
                                                    arrayList2 = arrayList6;
                                                    sparseArray2 = sparseArray3;
                                                    xl6Var2 = xl6Var4;
                                                    z = true;
                                                    xl6Var = xl6Var8;
                                                    str9 = str;
                                                    fa4.g(th, z);
                                                    if (cursor != null) {
                                                    }
                                                    xl6Var3 = xl6Var;
                                                    xl6Var4 = xl6Var2;
                                                    Context context322222 = a.b;
                                                    i2 = Build.VERSION.SDK_INT;
                                                    if (i2 < 33) {
                                                    }
                                                    xl6 xl6Var1022222222222 = xl6Var4;
                                                    Integer num222222222222 = num;
                                                    while (i < arrayList2.size()) {
                                                    }
                                                    qtVar = MediaController.e2;
                                                    if (qtVar != null) {
                                                    }
                                                    qt qtVar222222222222 = new qt(i17, arrayList2, arrayList, num222222222222, xl6Var1022222222222, xl6Var3, xl6Var5);
                                                    MediaController.e2 = qtVar222222222222;
                                                    gl.e3(qtVar222222222222, 0L);
                                                    return;
                                                }
                                            } catch (Throwable th17) {
                                                th = th17;
                                                arrayList = arrayList3;
                                                arrayList2 = arrayList6;
                                                sparseArray2 = sparseArray3;
                                                str9 = str;
                                                xl6Var = xl6Var3;
                                                xl6Var2 = xl6Var4;
                                                z = true;
                                                fa4.g(th, z);
                                                if (cursor != null) {
                                                }
                                                xl6Var3 = xl6Var;
                                                xl6Var4 = xl6Var2;
                                                Context context3222222 = a.b;
                                                i2 = Build.VERSION.SDK_INT;
                                                if (i2 < 33) {
                                                }
                                                xl6 xl6Var10222222222222 = xl6Var4;
                                                Integer num2222222222222 = num;
                                                while (i < arrayList2.size()) {
                                                }
                                                qtVar = MediaController.e2;
                                                if (qtVar != null) {
                                                }
                                                qt qtVar2222222222222 = new qt(i17, arrayList2, arrayList, num2222222222222, xl6Var10222222222222, xl6Var3, xl6Var5);
                                                MediaController.e2 = qtVar2222222222222;
                                                gl.e3(qtVar2222222222222, 0L);
                                                return;
                                            }
                                        } else {
                                            i8 = columnIndex;
                                            i9 = columnIndex5;
                                            i10 = columnIndex2;
                                            arrayList = arrayList3;
                                            xl6Var8 = xl6Var3;
                                        }
                                        if (xl6Var4 == null) {
                                            try {
                                                i11 = columnIndex18;
                                                i12 = columnIndex7;
                                                i13 = columnIndex6;
                                                xl6Var9 = new xl6(0, k96.M0(2131754296, null), jm6Var2);
                                                arrayList2 = arrayList6;
                                                try {
                                                    arrayList2.add(0, xl6Var9);
                                                } catch (Throwable th18) {
                                                    th = th18;
                                                    xl6Var = xl6Var8;
                                                    sparseArray2 = sparseArray3;
                                                    str9 = str;
                                                    z = true;
                                                    xl6Var2 = xl6Var9;
                                                    fa4.g(th, z);
                                                    if (cursor != null) {
                                                    }
                                                    xl6Var3 = xl6Var;
                                                    xl6Var4 = xl6Var2;
                                                    Context context32222222 = a.b;
                                                    i2 = Build.VERSION.SDK_INT;
                                                    if (i2 < 33) {
                                                    }
                                                    xl6 xl6Var102222222222222 = xl6Var4;
                                                    Integer num22222222222222 = num;
                                                    while (i < arrayList2.size()) {
                                                    }
                                                    qtVar = MediaController.e2;
                                                    if (qtVar != null) {
                                                    }
                                                    qt qtVar22222222222222 = new qt(i17, arrayList2, arrayList, num22222222222222, xl6Var102222222222222, xl6Var3, xl6Var5);
                                                    MediaController.e2 = qtVar22222222222222;
                                                    gl.e3(qtVar22222222222222, 0L);
                                                    return;
                                                }
                                            } catch (Throwable th19) {
                                                th = th19;
                                                arrayList2 = arrayList6;
                                                xl6Var = xl6Var8;
                                                sparseArray2 = sparseArray3;
                                                str9 = str;
                                                xl6Var2 = xl6Var4;
                                                z = true;
                                                fa4.g(th, z);
                                                if (cursor != null) {
                                                }
                                                xl6Var3 = xl6Var;
                                                xl6Var4 = xl6Var2;
                                                Context context322222222 = a.b;
                                                i2 = Build.VERSION.SDK_INT;
                                                if (i2 < 33) {
                                                }
                                                xl6 xl6Var1022222222222222 = xl6Var4;
                                                Integer num222222222222222 = num;
                                                while (i < arrayList2.size()) {
                                                }
                                                qtVar = MediaController.e2;
                                                if (qtVar != null) {
                                                }
                                                qt qtVar222222222222222 = new qt(i17, arrayList2, arrayList, num222222222222222, xl6Var1022222222222222, xl6Var3, xl6Var5);
                                                MediaController.e2 = qtVar222222222222222;
                                                gl.e3(qtVar222222222222222, 0L);
                                                return;
                                            }
                                        } else {
                                            i11 = columnIndex18;
                                            i12 = columnIndex7;
                                            i13 = columnIndex6;
                                            arrayList2 = arrayList6;
                                            xl6Var9 = xl6Var4;
                                        }
                                        try {
                                            if (xl6Var8.e.size() < 15) {
                                                jm6Var2.d();
                                            }
                                            xl6Var8.a(jm6Var2);
                                            xl6Var9.a(jm6Var2);
                                            sparseArray2 = sparseArray3;
                                            try {
                                                xl6 xl6Var13 = (xl6) sparseArray2.get(i24);
                                                if (xl6Var13 == null) {
                                                    xl6Var13 = new xl6(i24, string4, jm6Var2);
                                                    sparseArray2.put(i24, xl6Var13);
                                                    if (num != null || str == null || string3 == null) {
                                                        xl6Var = xl6Var8;
                                                        xl6Var2 = xl6Var9;
                                                        str9 = str;
                                                    } else {
                                                        xl6Var = xl6Var8;
                                                        str9 = str;
                                                        try {
                                                            if (string3.startsWith(str9)) {
                                                                xl6Var2 = xl6Var9;
                                                                try {
                                                                    arrayList2.add(0, xl6Var13);
                                                                    num = Integer.valueOf(i24);
                                                                } catch (Throwable th20) {
                                                                    th = th20;
                                                                    z = true;
                                                                    fa4.g(th, z);
                                                                    if (cursor != null) {
                                                                        try {
                                                                            cursor.close();
                                                                        } catch (Exception e8) {
                                                                            fa4.g(e8, z);
                                                                        }
                                                                    }
                                                                    xl6Var3 = xl6Var;
                                                                    xl6Var4 = xl6Var2;
                                                                    Context context3222222222 = a.b;
                                                                    i2 = Build.VERSION.SDK_INT;
                                                                    if (i2 < 33) {
                                                                    }
                                                                    xl6 xl6Var10222222222222222 = xl6Var4;
                                                                    Integer num2222222222222222 = num;
                                                                    while (i < arrayList2.size()) {
                                                                    }
                                                                    qtVar = MediaController.e2;
                                                                    if (qtVar != null) {
                                                                    }
                                                                    qt qtVar2222222222222222 = new qt(i17, arrayList2, arrayList, num2222222222222222, xl6Var10222222222222222, xl6Var3, xl6Var5);
                                                                    MediaController.e2 = qtVar2222222222222222;
                                                                    gl.e3(qtVar2222222222222222, 0L);
                                                                    return;
                                                                }
                                                            } else {
                                                                xl6Var2 = xl6Var9;
                                                            }
                                                        } catch (Throwable th21) {
                                                            th = th21;
                                                            xl6Var2 = xl6Var9;
                                                            z = true;
                                                            fa4.g(th, z);
                                                            if (cursor != null) {
                                                            }
                                                            xl6Var3 = xl6Var;
                                                            xl6Var4 = xl6Var2;
                                                            Context context32222222222 = a.b;
                                                            i2 = Build.VERSION.SDK_INT;
                                                            if (i2 < 33) {
                                                            }
                                                            xl6 xl6Var102222222222222222 = xl6Var4;
                                                            Integer num22222222222222222 = num;
                                                            while (i < arrayList2.size()) {
                                                            }
                                                            qtVar = MediaController.e2;
                                                            if (qtVar != null) {
                                                            }
                                                            qt qtVar22222222222222222 = new qt(i17, arrayList2, arrayList, num22222222222222222, xl6Var102222222222222222, xl6Var3, xl6Var5);
                                                            MediaController.e2 = qtVar22222222222222222;
                                                            gl.e3(qtVar22222222222222222, 0L);
                                                            return;
                                                        }
                                                    }
                                                    arrayList2.add(xl6Var13);
                                                } else {
                                                    xl6Var = xl6Var8;
                                                    xl6Var2 = xl6Var9;
                                                    str9 = str;
                                                }
                                                xl6Var13.a(jm6Var2);
                                                SparseArray sparseArray5 = sparseArray;
                                                xl6 xl6Var14 = (xl6) sparseArray5.get(i24);
                                                if (xl6Var14 == null) {
                                                    xl6Var14 = new xl6(i24, string4, jm6Var2);
                                                    sparseArray5.put(i24, xl6Var14);
                                                    if (num3 != null || str9 == null || string3 == null || !string3.startsWith(str9)) {
                                                        arrayList.add(xl6Var14);
                                                    } else {
                                                        arrayList.add(0, xl6Var14);
                                                        num3 = Integer.valueOf(i24);
                                                    }
                                                }
                                                xl6Var14.a(jm6Var2);
                                                str = str9;
                                                sparseArray = sparseArray5;
                                                xl6Var3 = xl6Var;
                                                xl6Var4 = xl6Var2;
                                                columnIndex17 = i25;
                                                columnIndex4 = i26;
                                                columnIndex3 = i27;
                                                query2 = cursor;
                                                columnIndex = i8;
                                                columnIndex2 = i10;
                                                columnIndex6 = i13;
                                                sparseArray3 = sparseArray2;
                                                arrayList6 = arrayList2;
                                                columnIndex18 = i11;
                                                columnIndex7 = i12;
                                                arrayList3 = arrayList;
                                                columnIndex5 = i9;
                                            } catch (Throwable th22) {
                                                th = th22;
                                                xl6Var = xl6Var8;
                                                xl6Var2 = xl6Var9;
                                                str9 = str;
                                            }
                                        } catch (Throwable th23) {
                                            th = th23;
                                            xl6Var = xl6Var8;
                                            sparseArray2 = sparseArray3;
                                            str9 = str;
                                        }
                                    }
                                } catch (Throwable th24) {
                                    th = th24;
                                    cursor = query2;
                                    arrayList2 = arrayList6;
                                    sparseArray2 = sparseArray3;
                                    str9 = str;
                                    arrayList = arrayList3;
                                }
                            }
                            cursor = query2;
                            arrayList2 = arrayList6;
                            sparseArray2 = sparseArray3;
                            str9 = str;
                            arrayList = arrayList3;
                        } catch (Throwable th25) {
                            th = th25;
                            cursor = query2;
                            arrayList2 = arrayList6;
                            sparseArray2 = sparseArray3;
                            str9 = str;
                            arrayList = arrayList3;
                            z = true;
                            xl6Var = null;
                            xl6Var2 = null;
                            num = null;
                            fa4.g(th, z);
                            if (cursor != null) {
                            }
                            xl6Var3 = xl6Var;
                            xl6Var4 = xl6Var2;
                            Context context322222222222 = a.b;
                            i2 = Build.VERSION.SDK_INT;
                            if (i2 < 33) {
                            }
                            xl6 xl6Var1022222222222222222 = xl6Var4;
                            Integer num222222222222222222 = num;
                            while (i < arrayList2.size()) {
                            }
                            qtVar = MediaController.e2;
                            if (qtVar != null) {
                            }
                            qt qtVar222222222222222222 = new qt(i17, arrayList2, arrayList, num222222222222222222, xl6Var1022222222222222222, xl6Var3, xl6Var5);
                            MediaController.e2 = qtVar222222222222222222;
                            gl.e3(qtVar222222222222222222, 0L);
                            return;
                        }
                    } catch (Throwable th26) {
                        th = th26;
                        cursor = query2;
                        str2 = "_data";
                        str3 = "bucket_display_name";
                        str4 = "_id";
                    }
                } else {
                    cursor = query2;
                    str2 = "_data";
                    str3 = "bucket_display_name";
                    str4 = "_id";
                    str5 = "bucket_id";
                    str6 = "height";
                    str7 = "width";
                    str8 = "orientation";
                    arrayList2 = arrayList6;
                    sparseArray2 = sparseArray3;
                    str9 = str;
                    arrayList = arrayList3;
                    xl6Var3 = null;
                    xl6Var4 = null;
                    num = null;
                }
                if (cursor != null) {
                }
                Context context3222222222222 = a.b;
                i2 = Build.VERSION.SDK_INT;
                if (i2 < 33) {
                }
                xl6 xl6Var10222222222222222222 = xl6Var4;
                Integer num2222222222222222222 = num;
                while (i < arrayList2.size()) {
                }
                qtVar = MediaController.e2;
                if (qtVar != null) {
                }
                qt qtVar2222222222222222222 = new qt(i17, arrayList2, arrayList, num2222222222222222222, xl6Var10222222222222222222, xl6Var3, xl6Var5);
                MediaController.e2 = qtVar2222222222222222222;
                gl.e3(qtVar2222222222222222222, 0L);
                return;
            case 7:
                int i28 = this.b;
                String[] strArr3 = MediaController.W1;
                try {
                    context2 = a.b;
                } catch (Throwable th27) {
                    th = th27;
                    cursor3 = null;
                }
                try {
                    if ((Build.VERSION.SDK_INT < 33 || !(context2.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0 || context2.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") == 0 || context2.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") == 0)) && context2.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                        cursor3 = null;
                    } else {
                        cursor3 = MediaStore.Images.Media.query(context2.getContentResolver(), MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new String[]{"COUNT(_id)"}, null, null, null);
                        if (cursor3 != null) {
                            try {
                            } catch (Throwable th28) {
                                th = th28;
                                try {
                                    fa4.g(th, true);
                                    if (cursor3 != null) {
                                        cursor3.close();
                                    }
                                    cursor4 = cursor3;
                                    i14 = 0;
                                    Context context4 = a.b;
                                    if (Build.VERSION.SDK_INT >= 33) {
                                    }
                                    i14 += cursor4.getInt(0);
                                    break;
                                } finally {
                                    if (cursor3 != null) {
                                        cursor3.close();
                                    }
                                }
                            }
                            if (cursor3.moveToNext()) {
                                i15 = cursor3.getInt(0);
                                if (cursor3 != null) {
                                    cursor3.close();
                                }
                                cursor4 = cursor3;
                                i14 = i15;
                                Context context42 = a.b;
                                if (((Build.VERSION.SDK_INT >= 33 && (context42.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0 || context42.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") == 0 || context42.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") == 0)) || context42.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) && (cursor4 = MediaStore.Images.Media.query(context42.getContentResolver(), MediaStore.Video.Media.EXTERNAL_CONTENT_URI, new String[]{"COUNT(_id)"}, null, null, null)) != null && cursor4.moveToNext()) {
                                    i14 += cursor4.getInt(0);
                                }
                            }
                        }
                    }
                    Context context422 = a.b;
                    if (Build.VERSION.SDK_INT >= 33) {
                        i14 += cursor4.getInt(0);
                    }
                    i14 += cursor4.getInt(0);
                } catch (Throwable th29) {
                    try {
                        fa4.g(th29, true);
                        break;
                    } finally {
                        if (cursor3 != null) {
                            cursor3.close();
                        }
                    }
                }
                i15 = 0;
                if (cursor3 != null) {
                }
                cursor4 = cursor3;
                i14 = i15;
                break;
            case 8:
                int i29 = this.b;
                int i30 = NotificationRepeat.a;
                im7.l0.c(new wl7(im7.n(i29), b));
                return;
            case 9:
                PushListenerController.lambda$processRemoteMessage$3(this.b);
                return;
            case 10:
                PushListenerController.lambda$processRemoteMessage$4(this.b);
                return;
            case 11:
                long j = this.b - 864000;
                try {
                    O0 = gl.O0();
                } catch (Throwable th30) {
                    fa4.g(th30, true);
                }
                if (O0 != null) {
                    Utilities.clearDir(O0.getAbsolutePath(), 0, j, false);
                    SharedPreferences.Editor edit = na7.c1().edit();
                    edit.putInt("lastLogsCheckTime", gba.H);
                    edit.apply();
                    return;
                }
                return;
            case 12:
                hq6.d0(this.b).D(5);
                return;
            case 13:
                String n = oo1.n(this.b, "/");
                vvc.x(n, vvc.b.keySet());
                vvc.x(n, vvc.c.keySet());
                vvc.x(n, vvc.d.keySet());
                return;
            default:
                int i31 = this.b;
                vvc.x(i31 + "/", vvc.b.keySet());
                for (svc svcVar : vvc.a.values()) {
                    if (svcVar.b == i31 && svcVar.v.isEmpty() && (bwcVar = svcVar.t) != null) {
                        bwcVar.m();
                        bwcVar.f = null;
                        bwcVar.h = 0;
                        bwcVar.j = 0;
                        bwcVar.k = false;
                    }
                }
                return;
        }
    }
}
