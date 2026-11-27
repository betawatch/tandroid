// default package

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class tn4 {
    public static final ji6 a = new ji6(2);
    public static final f03 b = new f03((byte) 20);

    public static fo4 a(Context context, List list) {
        fo4 fo4Var;
        q0f.a("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (true) {
                if (i >= list.size()) {
                    fo4Var = new fo4(arrayList);
                    break;
                }
                un4 un4Var = (un4) list.get(i);
                ProviderInfo b2 = b(context.getPackageManager(), un4Var, context.getResources());
                if (b2 == null) {
                    fo4Var = new fo4();
                    break;
                }
                arrayList.add(c(context, un4Var, b2.authority));
                i++;
            }
            return fo4Var;
        } finally {
            Trace.endSection();
        }
    }

    public static ProviderInfo b(PackageManager packageManager, un4 un4Var, Resources resources) {
        f03 f03Var = b;
        ji6 ji6Var = a;
        q0f.a("FontProvider.getProvider");
        try {
            List list = un4Var.d;
            String str = un4Var.a;
            String str2 = un4Var.b;
            if (list == null) {
                list = tme.b(resources, 0);
            }
            sn4 sn4Var = new sn4();
            sn4Var.a = str;
            sn4Var.b = str2;
            sn4Var.c = list;
            ProviderInfo providerInfo = (ProviderInfo) ji6Var.a(sn4Var);
            if (providerInfo == null) {
                providerInfo = packageManager.resolveContentProvider(str, 0);
                if (providerInfo == null) {
                    throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
                }
                if (!providerInfo.packageName.equals(str2)) {
                    throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
                }
                Signature[] signatureArr = packageManager.getPackageInfo(providerInfo.packageName, 64).signatures;
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArr) {
                    arrayList.add(signature.toByteArray());
                }
                Collections.sort(arrayList, f03Var);
                for (int i = 0; i < list.size(); i++) {
                    ArrayList arrayList2 = new ArrayList((Collection) list.get(i));
                    Collections.sort(arrayList2, f03Var);
                    if (arrayList.size() == arrayList2.size()) {
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            if (!Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2))) {
                                break;
                            }
                        }
                        ji6Var.b(sn4Var, providerInfo);
                    }
                }
                Trace.endSection();
                return null;
            }
            return providerInfo;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Finally extract failed */
    public static go4[] c(Context context, un4 un4Var, String str) {
        q0f.a("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri build = new Uri.Builder().scheme("content").authority(str).build();
            Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            rn4 xh4Var = Build.VERSION.SDK_INT < 24 ? new xh4(context, build) : new aj3(context, build);
            Cursor cursor = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                q0f.a("ContentQueryWrapper.query");
                try {
                    cursor = xh4Var.F(build, strArr, new String[]{un4Var.c});
                    Trace.endSection();
                    if (cursor != null && cursor.getCount() > 0) {
                        int columnIndex = cursor.getColumnIndex("result_code");
                        ArrayList arrayList2 = new ArrayList();
                        int columnIndex2 = cursor.getColumnIndex("_id");
                        int columnIndex3 = cursor.getColumnIndex("file_id");
                        int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursor.getColumnIndex("font_weight");
                        int columnIndex6 = cursor.getColumnIndex("font_italic");
                        while (cursor.moveToNext()) {
                            int i = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                            arrayList2.add(new go4(columnIndex3 == -1 ? ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3)), columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, i));
                        }
                        arrayList = arrayList2;
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    xh4Var.close();
                    return (go4[]) arrayList.toArray(new go4[0]);
                } finally {
                }
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                xh4Var.close();
                throw th;
            }
        } finally {
        }
    }
}
