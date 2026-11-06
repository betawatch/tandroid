package org.telegram.utils.twidget;

import android.content.Context;
import android.content.res.AssetManager;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public abstract class z {
    public static final ExecutorService a = Executors.newFixedThreadPool(2, new h2.l0(6));
    public static File b;

    public static synchronized File a(Context context) {
        int i7;
        int i10;
        char c10;
        AssetManager assetManager;
        int i11;
        synchronized (z.class) {
            try {
                File file = b;
                if (file != null) {
                    return file;
                }
                AssetManager assets = context.getApplicationContext().getAssets();
                InputStream open = assets.open("WidgetSandbox/manifest.txt");
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    int i12 = TLObject.FLAG_14;
                    byte[] bArr = new byte[TLObject.FLAG_14];
                    while (true) {
                        int read = open.read(bArr);
                        i7 = -1;
                        i10 = 0;
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    Charset charset = StandardCharsets.UTF_8;
                    String str = new String(byteArray, charset);
                    open.close();
                    byte[] digest = MessageDigest.getInstance("SHA-256").digest(str.getBytes(charset));
                    StringBuilder sb2 = new StringBuilder();
                    int i13 = 0;
                    while (true) {
                        c10 = 1;
                        if (i13 >= 12) {
                            break;
                        }
                        sb2.append(String.format("%02x", Integer.valueOf(digest[i13] & 255)));
                        i13++;
                    }
                    File file2 = new File(context.getFilesDir(), "widget-sandbox/" + ((Object) sb2));
                    File file3 = new File(file2, "ready");
                    if (!file3.isFile()) {
                        String[] split = str.split("\n");
                        int length = split.length;
                        int i14 = 0;
                        while (i14 < length) {
                            String str2 = split[i14];
                            if (str2.isEmpty()) {
                                assetManager = assets;
                                i11 = i10;
                            } else {
                                String[] split2 = str2.split(" ", 2);
                                String str3 = split2[c10];
                                if (str3.contains("..") || str3.startsWith("/")) {
                                    throw new IllegalArgumentException("Invalid bundle path");
                                }
                                File file4 = new File(file2, str3);
                                if (!file4.getParentFile().isDirectory() && !file4.getParentFile().mkdirs()) {
                                    throw new IllegalStateException("Cannot create bundle directory");
                                }
                                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                                open = assets.open("WidgetSandbox/WidgetJS/" + str3);
                                try {
                                    FileOutputStream fileOutputStream = new FileOutputStream(file4);
                                    try {
                                        byte[] bArr2 = new byte[i12];
                                        while (true) {
                                            int read2 = open.read(bArr2);
                                            if (read2 == i7) {
                                                break;
                                            }
                                            messageDigest.update(bArr2, i10, read2);
                                            fileOutputStream.write(bArr2, i10, read2);
                                        }
                                        fileOutputStream.close();
                                        open.close();
                                        StringBuilder sb3 = new StringBuilder();
                                        byte[] digest2 = messageDigest.digest();
                                        int length2 = digest2.length;
                                        int i15 = i10;
                                        while (i15 < length2) {
                                            AssetManager assetManager2 = assets;
                                            int i16 = i10;
                                            Object[] objArr = new Object[1];
                                            objArr[i16] = Integer.valueOf(digest2[i15] & 255);
                                            sb3.append(String.format("%02x", objArr));
                                            i15++;
                                            i10 = i16;
                                            assets = assetManager2;
                                        }
                                        assetManager = assets;
                                        i11 = i10;
                                        if (!split2[i11].equals(sb3.toString())) {
                                            throw new IllegalStateException("Bundle checksum mismatch: " + str3);
                                        }
                                    } catch (Throwable th2) {
                                        try {
                                            fileOutputStream.close();
                                            throw th2;
                                        } catch (Throwable th3) {
                                            th2.addSuppressed(th3);
                                            throw th2;
                                        }
                                    }
                                } finally {
                                }
                            }
                            i14++;
                            i10 = i11;
                            assets = assetManager;
                            i12 = TLObject.FLAG_14;
                            i7 = -1;
                            c10 = 1;
                        }
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file3);
                        try {
                            fileOutputStream2.write(1);
                            fileOutputStream2.close();
                        } finally {
                        }
                    }
                    b = file2;
                    return file2;
                } finally {
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
