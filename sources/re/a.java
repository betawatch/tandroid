package re;

import android.graphics.Bitmap;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.RandomAccessFile;
import te.l;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class a {
    public String a;
    public long b;
    public String c;
    public String d;
    public String e;
    public String f;
    public short g;
    public String h;
    public String i;
    public short j;
    public short k;
    public String l;
    public String m;
    public String n;
    public Bitmap o;
    public Bitmap p;
    public File q;

    public static a a(File file) {
        byte b10;
        try {
            byte[] bArr = new byte[12];
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            randomAccessFile.readFully(bArr, 0, 8);
            randomAccessFile.close();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            if (bArr[4] == 102 && bArr[5] == 116 && bArr[6] == 121 && bArr[7] == 112) {
                return new se.a(bufferedInputStream);
            }
            if (bArr[0] == 102 && bArr[1] == 76 && bArr[2] == 97 && bArr[3] == 99) {
                b bVar = new b(file);
                if (bVar.s) {
                    return null;
                }
                return bVar;
            }
            if (!file.getAbsolutePath().endsWith("mp3") && (((b10 = bArr[0]) != 73 || bArr[1] != 68 || bArr[2] != 51) && (b10 != 84 || bArr[1] != 65 || bArr[2] != 71))) {
                b bVar2 = new b(file);
                if (bVar2.s) {
                    return null;
                }
                return bVar2;
            }
            return new l(bufferedInputStream, file.length());
        } catch (Exception unused) {
            return null;
        }
    }
}
