// default package

import android.graphics.Bitmap;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public abstract class sqc {
    public static final Pattern a = Pattern.compile("^(.+_\\d+_.+_v\\d+(_debug)?\\.jpg|-?\\d+_-?\\d+\\.jpg|wallpaper_thumb_-?\\d+\\.png)$");
    public static final Object b = new Object();
    public static volatile File c;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
    
        if (r1 == false) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(File file, File file2) {
        boolean z = false;
        if (file == null) {
            return false;
        }
        if (file.equals(file2)) {
            return true;
        }
        synchronized (b) {
            File file3 = new File(file2.getParentFile(), file2.getName() + ".tmp");
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file3);
                    try {
                        fileOutputStream.getChannel().transferFrom(fileInputStream.getChannel(), 0L, fileInputStream.getChannel().size());
                        fileOutputStream.getFD().sync();
                        fileOutputStream.close();
                        fileInputStream.close();
                        z = file3.renameTo(file2);
                    } finally {
                    }
                } finally {
                }
            } finally {
                try {
                    return z;
                } finally {
                }
            }
        }
        return z;
    }

    public static File b(String str) {
        File file = c;
        if (file == null) {
            file = new File(a.h(), "wallpaper");
            file.mkdirs();
            c = file;
        }
        if (str == null) {
            return new File(file, ".none");
        }
        File file2 = new File(file, str);
        if (file2.exists()) {
            return file2;
        }
        synchronized (b) {
            File file3 = new File(a.h(), str);
            return (!file3.isFile() || file2.exists() || file3.renameTo(file2)) ? file2 : file3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004a, code lost:
    
        if (r0 == false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean c(Bitmap bitmap, Bitmap.CompressFormat compressFormat, File file) {
        boolean z = false;
        if (bitmap == null) {
            return false;
        }
        synchronized (b) {
            File file2 = new File(file.getParentFile(), file.getName() + ".tmp");
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    if (!bitmap.compress(compressFormat, 87, fileOutputStream)) {
                        fileOutputStream.close();
                        return false;
                    }
                    fileOutputStream.flush();
                    fileOutputStream.getFD().sync();
                    fileOutputStream.close();
                    z = file2.renameTo(file);
                } finally {
                }
            } finally {
                try {
                    return z;
                } finally {
                }
            }
        }
    }

    public static File d(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = null;
        } else {
            str2 = Utilities.a(str) + ".wp";
        }
        return b(str2);
    }

    public static File e(String str) {
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        return b(str);
    }
}
