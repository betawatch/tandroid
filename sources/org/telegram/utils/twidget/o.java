package org.telegram.utils.twidget;

import android.graphics.fonts.Font;
import android.graphics.fonts.SystemFonts;
import android.os.Binder;
import android.os.Build;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.system.OsConstants;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class o extends Binder {
    public static final String[] b = {"/system/fonts", "/product/fonts", "/system_ext/fonts", "/vendor/fonts", "/odm/fonts", "/data/fonts/files"};
    public static final String[] c = {"/data/misc/zoneinfo/current/tzdata", "/apex/com.android.tzdata/etc/tz/tzdata", "/system/usr/share/zoneinfo/tzdata"};
    public static o d;
    public volatile String[] a;

    public static String a(String str) {
        try {
            return new File(str).getCanonicalPath();
        } catch (IOException unused) {
            return null;
        }
    }

    public static synchronized o b() {
        o oVar;
        synchronized (o.class) {
            oVar = d;
            if (oVar == null) {
                oVar = new o();
                oVar.attachInterface(null, "org.telegram.utils.twidget.WidgetFileGate");
                d = oVar;
            }
        }
        return oVar;
    }

    public final boolean c(String str) {
        String[] strArr = this.a;
        if (strArr == null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            String[] strArr2 = b;
            for (int i = 0; i < 6; i++) {
                linkedHashSet.add(strArr2[i]);
            }
            if (Build.VERSION.SDK_INT >= 29) {
                try {
                    Iterator<Font> it = SystemFonts.getAvailableFonts().iterator();
                    while (it.hasNext()) {
                        File file = fi7.f(it.next()).getFile();
                        if (file != null && file.getParent() != null) {
                            linkedHashSet.add(file.getParent());
                        }
                    }
                } catch (RuntimeException unused) {
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator it2 = linkedHashSet.iterator();
            while (it2.hasNext()) {
                String a = a((String) it2.next());
                if (a != null && !a.equals("/") && a.split("/").length >= 3 && !arrayList.contains(a)) {
                    arrayList.add(a);
                }
            }
            strArr = (String[]) arrayList.toArray(new String[0]);
            this.a = strArr;
        }
        for (String str2 : strArr) {
            if (str.startsWith(str2) && str.length() > str2.length() && str.charAt(str2.length()) == '/') {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0064, code lost:
    
        if (new java.io.File(r4).isFile() == false) goto L32;
     */
    @Override // android.os.Binder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str;
        int i3;
        int i4;
        if (i != 1 && i != 2) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        parcel.enforceInterface("org.telegram.utils.twidget.WidgetFileGate");
        byte[] createByteArray = parcel.createByteArray();
        int readInt = parcel.readInt();
        r2 = null;
        ParcelFileDescriptor open = null;
        String str2 = (createByteArray == null || createByteArray.length >= 4096) ? null : new String(createByteArray, StandardCharsets.UTF_8);
        int i5 = 0;
        if (str2 != null && str2.startsWith("/") && str2.indexOf(0) < 0 && (str = a(str2)) != null) {
            if (!c(str)) {
                for (int i6 = 0; i6 < 3; i6++) {
                    if (!str.equals(a(c[i6]))) {
                    }
                }
            }
        }
        str = null;
        if (i == 1) {
            if (str != null) {
                int i7 = OsConstants.O_CREAT | OsConstants.O_TRUNC | OsConstants.O_APPEND | 6291456;
                if ((OsConstants.O_ACCMODE & readInt) != OsConstants.O_RDONLY || (i7 & readInt) != 0) {
                    i5 = OsConstants.EACCES;
                } else if ((readInt & TLObject.FLAG_14) != 0) {
                    i5 = OsConstants.ENOTDIR;
                }
                i4 = i5;
            } else if (str2 == null) {
                i4 = OsConstants.EACCES;
            } else {
                String a = a(str2);
                i4 = (a == null || !c(a)) ? OsConstants.EACCES : OsConstants.ENOENT;
            }
            if (i4 == 0) {
                try {
                    open = ParcelFileDescriptor.open(new File(str), TLObject.FLAG_28);
                } catch (IOException unused) {
                    i4 = OsConstants.ENOENT;
                }
            }
            parcel2.writeInt(i4);
            if (open != null) {
                parcel2.writeInt(1);
                open.writeToParcel(parcel2, 1);
            }
        } else {
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            int[] iArr = new int[1];
            if (str != null) {
                i3 = 0;
            } else if (str2 == null) {
                i3 = OsConstants.EACCES;
            } else {
                String a2 = a(str2);
                i3 = (a2 == null || !c(a2)) ? OsConstants.EACCES : OsConstants.ENOENT;
            }
            iArr[0] = i3;
            byte[] statPath = i3 == 0 ? WidgetClientNative.statPath(str, readInt2, readInt, readInt3, iArr) : null;
            if (statPath == null && iArr[0] == 0) {
                iArr[0] = OsConstants.EIO;
            }
            parcel2.writeInt(iArr[0]);
            if (statPath != null) {
                parcel2.writeByteArray(statPath);
            }
        }
        return true;
    }
}
