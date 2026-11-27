package org.telegram.utils.twidget;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Base64;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.ByteArrayOutputStream;
import java.net.URLDecoder;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
final class WidgetSandboxBackend implements s0d, wzc {
    private static final int MAX_CANVAS_WORDS = 2097152;
    private static final int MAX_COMPOSITION_LAYERS = 256;
    private static final int MAX_DISPLAY_OPS = 200000;
    private static final int MAX_FONTS = 4096;
    private static final int MAX_FRAMES_PER_SECOND = 240;
    private static final int MAX_IMAGES = 1024;
    static final long MAX_IMAGE_BYTES = 33554432;
    static final long MAX_IMAGE_PIXELS = 4194304;
    static final int MAX_JSON_DEPTH = 32;
    private static final int MAX_LAYERS = 256;
    private static final int MAX_LAYER_KEYS = 1024;
    private static final long MAX_LAYER_PIXELS = 33554432;
    private static final long MAX_LIST_BYTES = 8388608;
    private static final long MAX_PENDING_LAYER_BYTES = 16777216;
    private static final long MEMORY_BUDGET = 33554432;
    private long imageBytes;
    private long layerParseNanos;
    private int nextFont;
    private int nextRecord;
    private final z owner;
    private long pendingLayerBytes;
    private h1d text;
    private final Object recordLock = new Object();
    private final long[] recordTimes = new long[240];
    private final ConcurrentHashMap<Integer, Paint> fonts = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<Integer, Paint> deviceFonts = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<Integer, Bitmap> images = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<Integer, xzc> canvases = new ConcurrentHashMap<>();
    private final Object canvasLock = new Object();
    private final HashMap<Integer, yzc> pendingLayers = new HashMap<>();
    private HashMap<Long, o0d> layerContents = new HashMap<>();
    private final y painter = new y();

    public WidgetSandboxBackend(z zVar) {
        this.owner = zVar;
    }

    private static void assertWorker() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return;
        }
        grb.i("Native layout and recording must run off UI");
    }

    public static void checkJsonDepth(String str) {
        int length = str.length();
        int i = 0;
        boolean z = false;
        int i2 = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (z) {
                if (charAt == '\\') {
                    i++;
                } else if (charAt == '\"') {
                    z = false;
                }
            } else if (charAt == '\"') {
                z = true;
            } else if (charAt == '[' || charAt == '{') {
                i2++;
                if (i2 > 32) {
                    lq5.j("JSON nests too deep");
                    return;
                }
            } else if (charAt == ']' || charAt == '}') {
                if (i2 > 0) {
                    i2--;
                }
            } else if (charAt == '\'' || charAt == '/' || charAt == '#') {
                lq5.j("Not JSON");
                return;
            }
            i++;
        }
    }

    private void clearPendingLayers() {
        this.pendingLayers.clear();
        this.pendingLayerBytes = 0L;
        this.layerParseNanos = 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x0201, code lost:
    
        r14 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0258, code lost:
    
        r37 = r5;
        r31 = r14;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0136 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap decodeImage(String str, long j) {
        int i;
        Bitmap bitmap;
        int i2;
        int i3;
        long j2;
        byte[] bArr;
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr2;
        boolean z;
        int i4;
        ByteArrayOutputStream byteArrayOutputStream2;
        long j3;
        long j4;
        int i5;
        byte[] bArr3;
        int i6;
        boolean z2;
        int i7;
        long a;
        int i8;
        int indexOf = str.indexOf(44);
        if (!str.startsWith("data:") || indexOf < 0 || str.length() > 2097152) {
            return null;
        }
        String substring = str.substring(5, indexOf);
        if (substring.contains("svg")) {
            return null;
        }
        try {
            String substring2 = str.substring(indexOf + 1);
            byte[] decode = substring.contains(";base64") ? Base64.decode(substring2, 0) : URLDecoder.decode(substring2, "UTF-8").getBytes(StandardCharsets.ISO_8859_1);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
            int i9 = options.outWidth;
            if (i9 <= 0 || (i = options.outHeight) <= 0) {
                return null;
            }
            long j5 = i9 * i;
            if (j5 > MAX_IMAGE_PIXELS || j + (j5 << 2) > 33554432) {
                return null;
            }
            options.inJustDecodeBounds = false;
            int length = decode.length;
            if (length >= 33) {
                int i10 = 0;
                while (true) {
                    byte[] bArr4 = hid.a;
                    if (i10 < 8) {
                        if (decode[i10] != bArr4[i10]) {
                            break;
                        }
                        i10++;
                    } else if (hid.c(12, "IHDR", decode) && hid.a(8, decode) >= 13) {
                        long a2 = hid.a(16, decode);
                        long a3 = hid.a(20, decode);
                        int i11 = decode[24] & 255;
                        int i12 = decode[25] & 255;
                        int i13 = decode[28] & 255;
                        if (i12 != 0) {
                            i2 = 3;
                            if (i12 != 3) {
                                if (i12 != 2) {
                                    i2 = i12 == 4 ? 2 : i12 == 6 ? 4 : 0;
                                }
                                if (i2 != 0 && i13 == 0 && a2 > 0 && a3 > 0 && a2 * a3 <= MAX_IMAGE_PIXELS) {
                                    CRC32 crc32 = new CRC32();
                                    i3 = 8;
                                    while (true) {
                                        if (i3 + 12 <= length) {
                                            j2 = a3;
                                            bArr = bArr4;
                                            break;
                                        }
                                        bArr = bArr4;
                                        a = hid.a(i3, decode);
                                        i8 = i3;
                                        j2 = a3;
                                        if (a > (length - i3) - 12) {
                                            break;
                                        }
                                        int i14 = i8 + 4;
                                        if (hid.c(i14, "IEND", decode)) {
                                            break;
                                        }
                                        if (hid.c(i14, "IDAT", decode)) {
                                            crc32.reset();
                                            int i15 = (int) a;
                                            crc32.update(decode, i14, i15 + 4);
                                            if (crc32.getValue() != hid.a(i8 + 8 + i15, decode)) {
                                                break;
                                            }
                                        }
                                        i3 = ((int) a) + 12 + i8;
                                        bArr4 = bArr;
                                        a3 = j2;
                                    }
                                    int i16 = (int) (((((i2 * a2) * i11) + 7) / 8) + 1);
                                    byteArrayOutputStream = new ByteArrayOutputStream();
                                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                                    Inflater inflater = new Inflater(true);
                                    bArr2 = new byte[TLObject.FLAG_14];
                                    z = true;
                                    long j6 = 0;
                                    i4 = 8;
                                    while (true) {
                                        boolean z3 = z;
                                        if (i4 + 12 > length || j6 >= j2) {
                                            break;
                                        }
                                        j3 = a2;
                                        try {
                                            int a4 = (int) hid.a(i4, decode);
                                            if (a4 > (length - i4) - 12) {
                                                break;
                                            }
                                            int i17 = i4 + 4;
                                            if (hid.c(i17, "IEND", decode)) {
                                                break;
                                            }
                                            if (hid.c(i17, "IDAT", decode)) {
                                                int min = z3 ? Math.min(2, a4) : 0;
                                                inflater.setInput(decode, i4 + 8 + min, a4 - min);
                                                boolean z4 = false;
                                                while (!inflater.needsInput() && !inflater.finished() && !z4) {
                                                    try {
                                                        int inflate = inflater.inflate(bArr2);
                                                        if (inflate != 0 || !inflater.needsDictionary()) {
                                                            i5 = length;
                                                            byteArrayOutputStream.write(bArr2, 0, inflate);
                                                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                                                            while (true) {
                                                                if (j6 >= j2) {
                                                                    byteArrayOutputStream2 = byteArrayOutputStream;
                                                                    bArr3 = bArr2;
                                                                    i6 = a4;
                                                                    z2 = z4;
                                                                    i7 = inflate;
                                                                    break;
                                                                }
                                                                bArr3 = bArr2;
                                                                i6 = a4;
                                                                long j7 = i16;
                                                                long j8 = j6 * j7;
                                                                byteArrayOutputStream2 = byteArrayOutputStream;
                                                                z2 = z4;
                                                                i7 = inflate;
                                                                if (j8 < byteArray.length) {
                                                                    if ((byteArray[(int) j8] & 255) <= 4) {
                                                                        if (j8 + j7 > byteArray.length) {
                                                                            break;
                                                                        }
                                                                        j6++;
                                                                        z4 = z2;
                                                                        bArr2 = bArr3;
                                                                        a4 = i6;
                                                                        byteArrayOutputStream = byteArrayOutputStream2;
                                                                        inflate = i7;
                                                                    } else {
                                                                        z4 = true;
                                                                        break;
                                                                    }
                                                                } else {
                                                                    break;
                                                                }
                                                            }
                                                            if (i7 == 0) {
                                                                break;
                                                            }
                                                            length = i5;
                                                            bArr2 = bArr3;
                                                            a4 = i6;
                                                            byteArrayOutputStream = byteArrayOutputStream2;
                                                        } else {
                                                            break;
                                                        }
                                                    } catch (DataFormatException unused) {
                                                        byteArrayOutputStream2 = byteArrayOutputStream;
                                                        i5 = length;
                                                        bArr3 = bArr2;
                                                        i6 = a4;
                                                        z4 = true;
                                                    }
                                                }
                                                byteArrayOutputStream2 = byteArrayOutputStream;
                                                i5 = length;
                                                bArr3 = bArr2;
                                                i6 = a4;
                                                z4 = z4;
                                                if (z4) {
                                                    break;
                                                }
                                                z = false;
                                            } else {
                                                byteArrayOutputStream2 = byteArrayOutputStream;
                                                i5 = length;
                                                bArr3 = bArr2;
                                                i6 = a4;
                                                if (byteArrayOutputStream2.size() == 0 && !hid.c(i17, "IHDR", decode)) {
                                                    byteArrayOutputStream3.write(decode, i4, i6 + 12);
                                                }
                                                z = z3;
                                            }
                                            i4 += i6 + 12;
                                            length = i5;
                                            a2 = j3;
                                            bArr2 = bArr3;
                                            byteArrayOutputStream = byteArrayOutputStream2;
                                        } catch (Throwable th) {
                                            inflater.end();
                                            throw th;
                                        }
                                    }
                                    byteArrayOutputStream2 = byteArrayOutputStream;
                                    j4 = j6;
                                    inflater.end();
                                    if (j4 < j2) {
                                        Bitmap createBitmap = Bitmap.createBitmap((int) j3, (int) j2, Bitmap.Config.ARGB_8888);
                                        if (j4 != 0) {
                                            int i18 = (int) (i16 * j4);
                                            byte[] bArr5 = new byte[i18];
                                            System.arraycopy(byteArrayOutputStream2.toByteArray(), 0, bArr5, 0, i18);
                                            ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                                            byteArrayOutputStream4.write(bArr, 0, 8);
                                            byte[] bArr6 = new byte[13];
                                            System.arraycopy(decode, 16, bArr6, 0, 13);
                                            hid.b(j4, bArr6, 4);
                                            hid.d(byteArrayOutputStream4, "IHDR", bArr6, crc32);
                                            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
                                            byteArrayOutputStream4.write(byteArray2, 0, byteArray2.length);
                                            Deflater deflater = new Deflater();
                                            deflater.setInput(bArr5);
                                            deflater.finish();
                                            ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                                            byte[] bArr7 = new byte[TLObject.FLAG_13];
                                            while (!deflater.finished()) {
                                                byteArrayOutputStream5.write(bArr7, 0, deflater.deflate(bArr7));
                                            }
                                            deflater.end();
                                            hid.d(byteArrayOutputStream4, "IDAT", byteArrayOutputStream5.toByteArray(), crc32);
                                            hid.d(byteArrayOutputStream4, "IEND", new byte[0], crc32);
                                            byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                                            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(byteArray3, 0, byteArray3.length);
                                            if (decodeByteArray != null) {
                                                new Canvas(createBitmap).drawBitmap(decodeByteArray, 0.0f, 0.0f, (Paint) null);
                                                decodeByteArray.recycle();
                                            }
                                        }
                                        bitmap = createBitmap;
                                    }
                                }
                            }
                        }
                        i2 = 1;
                        if (i2 != 0) {
                            CRC32 crc322 = new CRC32();
                            i3 = 8;
                            while (true) {
                                if (i3 + 12 <= length) {
                                }
                                i3 = ((int) a) + 12 + i8;
                                bArr4 = bArr;
                                a3 = j2;
                            }
                            int i162 = (int) (((((i2 * a2) * i11) + 7) / 8) + 1);
                            byteArrayOutputStream = new ByteArrayOutputStream();
                            ByteArrayOutputStream byteArrayOutputStream32 = new ByteArrayOutputStream();
                            Inflater inflater2 = new Inflater(true);
                            bArr2 = new byte[TLObject.FLAG_14];
                            z = true;
                            long j62 = 0;
                            i4 = 8;
                            while (true) {
                                boolean z32 = z;
                                if (i4 + 12 > length) {
                                    break;
                                }
                                break;
                                i4 += i6 + 12;
                                length = i5;
                                a2 = j3;
                                bArr2 = bArr3;
                                byteArrayOutputStream = byteArrayOutputStream2;
                            }
                            byteArrayOutputStream2 = byteArrayOutputStream;
                            j4 = j62;
                            inflater2.end();
                            if (j4 < j2) {
                            }
                        }
                    }
                }
            }
            bitmap = null;
            return bitmap == null ? BitmapFactory.decodeByteArray(decode, 0, decode.length, options) : bitmap;
        } catch (Exception unused2) {
            return null;
        }
    }

    public static String featureSettings(String str) {
        if (str.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : str.split(",")) {
            if (str2.indexOf(61) == 4) {
                String substring = str2.substring(0, 4);
                String substring2 = str2.substring(5);
                if (substring.matches("[\\x20-\\x7e]{4}") && substring.indexOf(34) < 0 && substring2.matches("\\d{1,5}")) {
                    if (sb.length() > 0) {
                        sb.append(", ");
                    }
                    sb.append('\"');
                    sb.append(substring);
                    sb.append("\" ");
                    sb.append(substring2);
                }
            }
        }
        if (sb.length() == 0) {
            return null;
        }
        return sb.toString();
    }

    private long imageBytes() {
        long j;
        synchronized (this.images) {
            j = this.imageBytes;
        }
        return j;
    }

    private static boolean jsonSignal(int i) {
        return i == 3 || i == 4 || i == 5 || i == 8 || i == 12 || i == 18 || i == 19;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0188 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private b1d[] layers(JSONObject jSONObject, float f) {
        int i;
        HashMap<Long, o0d> hashMap;
        b1d[] b1dVarArr;
        int i2;
        int i3;
        JSONArray jSONArray;
        JSONArray optJSONArray;
        HashMap<Long, o0d> hashMap2;
        boolean z;
        JSONObject jSONObject2;
        JSONArray jSONArray2;
        long j;
        float[] fArr;
        float[] fArr2;
        int i4;
        int i5;
        d0d c0dVar;
        float f2 = f;
        JSONArray optJSONArray2 = jSONObject.optJSONArray("l");
        int min = optJSONArray2 == null ? 0 : Math.min(optJSONArray2.length(), 256);
        HashMap<Long, o0d> hashMap3 = new HashMap<>();
        b1d[] b1dVarArr2 = new b1d[min];
        int i6 = 0;
        int i7 = 0;
        long j2 = 0;
        while (true) {
            if (i6 >= min) {
                i = min;
                hashMap = hashMap3;
                b1dVarArr = b1dVarArr2;
                i2 = i7;
                break;
            }
            JSONObject optJSONObject = optJSONArray2.optJSONObject(i6);
            if (optJSONObject != null) {
                long optLong = optJSONObject.optLong("id");
                long optLong2 = optJSONObject.optLong("cv");
                JSONArray optJSONArray3 = optJSONObject.optJSONArray("b");
                if (optJSONArray3 != null && ((optJSONArray = optJSONObject.optJSONArray("k")) == null || optJSONArray.length() <= 8192)) {
                    o0d o0dVar = this.layerContents.get(Long.valueOf(optLong));
                    i3 = i6;
                    yzc yzcVar = this.pendingLayers.get(Integer.valueOf(i3));
                    if (yzcVar != null) {
                        int i8 = i7;
                        double d = f2;
                        int floor = (int) Math.floor(optJSONArray3.optDouble(0) * d);
                        i = min;
                        int floor2 = (int) Math.floor(optJSONArray3.optDouble(1) * d);
                        int ceil = (int) Math.ceil((optJSONArray3.optDouble(2) + optJSONArray3.optDouble(0)) * d);
                        hashMap = hashMap3;
                        int ceil2 = (int) Math.ceil((optJSONArray3.optDouble(3) + optJSONArray3.optDouble(1)) * d);
                        long j3 = ceil - floor;
                        long j4 = ceil2 - floor2;
                        if (j3 <= 0 || j4 <= 0 || j3 > 2147483647L || j4 > 2147483647L) {
                            jSONArray = optJSONArray2;
                            b1dVarArr = b1dVarArr2;
                            i2 = i8;
                            i7 = i2;
                            i6 = i3 + 1;
                            f2 = f;
                            hashMap3 = hashMap;
                            b1dVarArr2 = b1dVarArr;
                            min = i;
                            optJSONArray2 = jSONArray;
                        } else {
                            if (j3 * j4 > 33554432 - j2) {
                                b1dVarArr = b1dVarArr2;
                                i2 = i8;
                                break;
                            }
                            if (Build.VERSION.SDK_INT >= 29) {
                                i5 = ceil;
                                i4 = ceil2;
                                c0dVar = new b0d(floor, floor2, ceil, ceil2, "widget-sandbox-layer");
                            } else {
                                i4 = ceil2;
                                i5 = ceil;
                                c0dVar = new c0d(floor, floor2, i5, i4);
                            }
                            Canvas a = c0dVar.a();
                            try {
                                a.translate(-floor, -floor2);
                                a.scale(f2, f2);
                                jSONObject2 = optJSONObject;
                                b1dVarArr = b1dVarArr2;
                                jSONArray = optJSONArray2;
                                jSONArray2 = optJSONArray;
                                i2 = i8;
                                hashMap2 = hashMap;
                                this.painter.f(a, yzcVar, this, f2, floor / f2, floor2 / f2, i5 / f2, i4 / f2);
                                c0dVar.d();
                                o0dVar = new o0d(c0dVar, (int) optLong2);
                                z = true;
                                d0d d0dVar = o0dVar.a;
                                j = (d0dVar.c - d0dVar.a) * (d0dVar.d - d0dVar.b);
                                if (j <= 33554432 - j2) {
                                    hashMap = hashMap2;
                                    break;
                                }
                                j2 += j;
                                hashMap = hashMap2;
                                hashMap.put(Long.valueOf(optLong), o0dVar);
                                JSONArray optJSONArray4 = jSONObject2.optJSONArray("l");
                                float[] fArr3 = null;
                                if (optJSONArray4 != null) {
                                    float[] fArr4 = new float[4];
                                    y.d(optJSONArray4, fArr4, 4, new float[0]);
                                    JSONArray optJSONArray5 = jSONObject2.optJSONArray("q");
                                    if (optJSONArray5 != null) {
                                        fArr3 = new float[8];
                                        y.d(optJSONArray5, fArr3, 8, new float[0]);
                                    }
                                    fArr2 = fArr3;
                                    fArr = fArr4;
                                } else {
                                    fArr = null;
                                    fArr2 = null;
                                }
                                int length = jSONArray2 == null ? 0 : (jSONArray2.length() / 8) << 3;
                                float[] fArr5 = new float[length];
                                y.d(jSONArray2, fArr5, length, new float[0]);
                                i7 = i2 + 1;
                                b1dVarArr[i2] = new b1d(d0dVar, fArr, fArr2, jSONObject2.optDouble("ts"), jSONObject2.optDouble("td"), jSONObject2.optInt("tr") != 0 ? z : false, fArr5);
                                i6 = i3 + 1;
                                f2 = f;
                                hashMap3 = hashMap;
                                b1dVarArr2 = b1dVarArr;
                                min = i;
                                optJSONArray2 = jSONArray;
                            } catch (Throwable th) {
                                c0dVar.d();
                                throw th;
                            }
                        }
                    } else {
                        jSONArray = optJSONArray2;
                        i = min;
                        hashMap2 = hashMap3;
                        b1dVarArr = b1dVarArr2;
                        z = true;
                        i2 = i7;
                        jSONObject2 = optJSONObject;
                        jSONArray2 = optJSONArray;
                        if (o0dVar == null || o0dVar.b != ((int) optLong2)) {
                            hashMap = hashMap2;
                            i7 = i2;
                            i6 = i3 + 1;
                            f2 = f;
                            hashMap3 = hashMap;
                            b1dVarArr2 = b1dVarArr;
                            min = i;
                            optJSONArray2 = jSONArray;
                        }
                        d0d d0dVar2 = o0dVar.a;
                        j = (d0dVar2.c - d0dVar2.a) * (d0dVar2.d - d0dVar2.b);
                        if (j <= 33554432 - j2) {
                        }
                    }
                }
            }
            i3 = i6;
            jSONArray = optJSONArray2;
            i = min;
            hashMap = hashMap3;
            b1dVarArr = b1dVarArr2;
            i2 = i7;
            i7 = i2;
            i6 = i3 + 1;
            f2 = f;
            hashMap3 = hashMap;
            b1dVarArr2 = b1dVarArr;
            min = i;
            optJSONArray2 = jSONArray;
        }
        this.layerContents = hashMap;
        if (i2 == i) {
            return b1dVarArr;
        }
        b1d[] b1dVarArr3 = new b1d[i2];
        System.arraycopy(b1dVarArr, 0, b1dVarArr3, 0, i2);
        return b1dVarArr3;
    }

    public static float[] metrics(int i, Paint paint, float f, Rect rect) {
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        paint.getTextBounds("x", 0, 1, rect);
        float f2 = fontMetrics.ascent;
        float f3 = fontMetrics.descent;
        return new float[]{i, (-f2) / f, f3 / f, ((f3 - f2) + fontMetrics.leading) / f, rect.height() / f, paint.measureText("0") / f};
    }

    public static Paint[] paints(String str, float f, int i, boolean z, String str2, float f2) {
        if (f <= 0.0f || f > 10000.0f) {
            f = 16.0f;
        }
        Paint paint = new Paint(jn7.M1);
        paint.setTextSize(f);
        paint.setTypeface(typeface(str, i, z));
        String featureSettings = featureSettings(str2);
        if (featureSettings != null) {
            paint.setFontFeatureSettings(featureSettings);
        }
        Paint paint2 = new Paint(paint);
        paint2.setTextSize(f * f2);
        return new Paint[]{paint, paint2};
    }

    private void putImage(int i, Bitmap bitmap) {
        synchronized (this.images) {
            Bitmap put = this.images.put(Integer.valueOf(i), bitmap);
            long allocationByteCount = this.imageBytes + bitmap.getAllocationByteCount();
            this.imageBytes = allocationByteCount;
            if (put != null) {
                this.imageBytes = allocationByteCount - put.getAllocationByteCount();
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r1v1, types: [d0d] */
    /* JADX WARN: Type inference failed for: r1v2 */
    private void recordLocked(byte[] bArr, byte[] bArr2, double d, int i, int i2, float f, float f2, int i3, int i4) {
        int i5;
        int i6;
        d0d c0dVar;
        ?? r1 = bArr;
        if (r1.length > MAX_LIST_BYTES) {
            clearPendingLayers();
            lq5.j("Display list");
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long[] jArr = this.recordTimes;
        int i7 = this.nextRecord;
        if (elapsedRealtime - jArr[i7] < 1000) {
            clearPendingLayers();
            return;
        }
        jArr[i7] = elapsedRealtime;
        this.nextRecord = (i7 + 1) % jArr.length;
        this.owner.getClass();
        this.owner.getClass();
        Trace.beginSection("WidgetSandbox:Record");
        double nanoTime = d - (System.nanoTime() / 1.0E9d);
        if (Build.VERSION.SDK_INT >= 29) {
            c0dVar = new b0d(0, 0, i, i2, "widget-sandbox-content");
            i5 = i;
            i6 = i2;
        } else {
            i5 = i;
            i6 = i2;
            c0dVar = new c0d(0, 0, i5, i6);
        }
        d0d d0dVar = c0dVar;
        try {
            try {
                try {
                    yzc b = yzc.b(r1);
                    String text = text(bArr2);
                    checkJsonDepth(text);
                    JSONObject jSONObject = new JSONObject(text);
                    System.nanoTime();
                    this.painter.b(i5, i6);
                    Canvas a = d0dVar.a();
                    try {
                        a.scale(f, f);
                        this.painter.f(a, b, this, f, 0.0f, 0.0f, i5 / f, i6 / f);
                        d0dVar.d();
                        b1d[] layers = layers(jSONObject, f);
                        z zVar = this.owner;
                        System.nanoTime();
                        zVar.getClass();
                        zVar.S = null;
                        this.owner.c(d0dVar, layers, nanoTime, i, i6, f2, (System.nanoTime() - r10) / 1000000.0f, i3, i4, b.b, this.text);
                    } catch (Throwable th) {
                        d0dVar.d();
                        throw th;
                    }
                } finally {
                    clearPendingLayers();
                    Trace.endSection();
                }
            } catch (Exception e) {
                e = e;
                r1 = d0dVar;
                r1.b();
                throw e;
            }
        } catch (Exception e2) {
            e = e2;
            r1.b();
            throw e;
        }
    }

    private xzc reserveCanvas(int i, int i2, int i3) {
        xzc xzcVar;
        long j = i2 * i3;
        if (j > MAX_IMAGE_PIXELS) {
            lq5.j("Canvas dimensions");
            return null;
        }
        synchronized (this.canvasLock) {
            long j2 = j << 3;
            long imageBytes = imageBytes() + j2;
            for (Map.Entry<Integer, xzc> entry : this.canvases.entrySet()) {
                if (entry.getKey().intValue() != i) {
                    imageBytes += entry.getValue().W;
                }
            }
            if (imageBytes > 33554432) {
                throw new IllegalArgumentException("Canvas memory budget");
            }
            xzcVar = this.canvases.get(Integer.valueOf(i));
            if (xzcVar == null) {
                xzcVar = new xzc(i);
                this.canvases.put(Integer.valueOf(i), xzcVar);
            }
            xzcVar.W = j2;
        }
        return xzcVar;
    }

    public static String text(byte[] bArr) {
        return bArr == null ? "" : new String(bArr, StandardCharsets.UTF_8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x013f, code lost:
    
        r0 = r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface typeface(String str, int i, boolean z) {
        Typeface typeface;
        Typeface typeface2 = Typeface.SANS_SERIF;
        String[] split = str.split(",");
        int length = split.length;
        int i2 = 0;
        while (true) {
            if (i2 < length) {
                String lowerCase = split[i2].trim().replace("\"", "").replace("'", "").toLowerCase(Locale.ROOT);
                if (!lowerCase.isEmpty()) {
                    switch (lowerCase) {
                        case "sans-serif":
                        case "roboto":
                        case "ui-sans-serif":
                        case "blinkmacsystemfont":
                        case "helvetica neue":
                        case "arial":
                        case "inter":
                        case "segoe ui":
                        case "system-ui":
                        case "helvetica":
                        case "-apple-system":
                            typeface = Typeface.SANS_SERIF;
                            break;
                        case "monospace":
                        case "consolas":
                        case "courier new":
                        case "menlo":
                        case "ui-monospace":
                        case "sf mono":
                            typeface = Typeface.MONOSPACE;
                            break;
                        case "times new roman":
                        case "georgia":
                        case "serif":
                        case "times":
                        case "ui-serif":
                            typeface = Typeface.SERIF;
                            break;
                        default:
                            typeface2 = Typeface.create(lowerCase, 0);
                            if (typeface2 != Typeface.DEFAULT) {
                                break;
                            } else {
                                break;
                            }
                    }
                }
                i2++;
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return Typeface.create(typeface2, Math.max(1, Math.min(1000, i)), z);
        }
        return Typeface.create(typeface2, (i < 600 ? 0 : 1) | (z ? 2 : 0));
    }

    @Override // s0d
    public Bitmap canvas(int i) {
        xzc xzcVar = this.canvases.get(Integer.valueOf(i));
        if (xzcVar == null) {
            return null;
        }
        return xzcVar.j();
    }

    @Override // wzc
    public Bitmap canvasBitmap(int i) {
        xzc xzcVar = this.canvases.get(Integer.valueOf(i));
        if (xzcVar == null) {
            return null;
        }
        return xzcVar.j();
    }

    public byte[] canvasRead(int i, int i2, int i3, int i4, int i5) {
        int i6 = i2;
        assertWorker();
        if (i4 <= 0 || i5 <= 0 || i4 * i5 > MAX_IMAGE_PIXELS) {
            return null;
        }
        xzc xzcVar = this.canvases.get(Integer.valueOf(i));
        if (xzcVar == null) {
            return new byte[(i4 * i5) << 2];
        }
        synchronized (xzcVar) {
            byte[] bArr = new byte[(Math.max(i4, 0) * Math.max(i5, 0)) << 2];
            if (xzcVar.o == null) {
                return bArr;
            }
            int max = Math.max(0, i6);
            int max2 = Math.max(0, i3);
            int min = Math.min(xzcVar.o.getWidth(), i6 + i4);
            int min2 = Math.min(xzcVar.o.getHeight(), i5 + i3);
            if (min <= max || min2 <= max2) {
                return bArr;
            }
            int i7 = min - max;
            int i8 = min2 - max2;
            int[] iArr = new int[i7 * i8];
            xzcVar.o.getPixels(iArr, 0, i7, max, max2, i7, i8);
            int i9 = max2;
            while (i9 < min2) {
                int i10 = max;
                while (i10 < min) {
                    int i11 = iArr[(i10 - max) + ((i9 - max2) * i7)];
                    int i12 = ((i10 - i6) + ((i9 - i3) * i4)) << 2;
                    bArr[i12] = (byte) Color.red(i11);
                    bArr[i12 + 1] = (byte) Color.green(i11);
                    bArr[i12 + 2] = (byte) Color.blue(i11);
                    bArr[i12 + 3] = (byte) Color.alpha(i11);
                    i10++;
                    i6 = i2;
                }
                i9++;
                i6 = i2;
            }
            return bArr;
        }
    }

    public void canvasRelease(int i) {
        xzc remove;
        assertWorker();
        synchronized (this.canvasLock) {
            remove = this.canvases.remove(Integer.valueOf(i));
        }
        if (remove != null) {
            remove.i();
        }
    }

    public void canvasRun(int i, int i2, int i3, int[] iArr) {
        assertWorker();
        if (i2 <= 0 || i3 <= 0) {
            canvasRelease(i);
            return;
        }
        if (iArr.length > 2097152) {
            lq5.j("Canvas batch");
            return;
        }
        xzc reserveCanvas = reserveCanvas(i, i2, i3);
        synchronized (reserveCanvas) {
            Bitmap bitmap = reserveCanvas.o;
            if (bitmap == null || bitmap.getWidth() != i2 || reserveCanvas.o.getHeight() != i3) {
                Bitmap bitmap2 = reserveCanvas.o;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                reserveCanvas.o = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
                reserveCanvas.q = new Canvas(reserveCanvas.o);
            }
            reserveCanvas.t = iArr;
            reserveCanvas.u = 0;
            reserveCanvas.X = 0L;
            int saveCount = reserveCanvas.q.getSaveCount();
            while (true) {
                try {
                    try {
                        if (reserveCanvas.u >= iArr.length) {
                            break;
                        } else {
                            reserveCanvas.h(this);
                        }
                    } catch (ArrayIndexOutOfBoundsException unused) {
                        throw new IllegalArgumentException("Canvas batch: truncated");
                    }
                } finally {
                    reserveCanvas.q.restoreToCount(saveCount);
                    reserveCanvas.t = null;
                    reserveCanvas.r++;
                }
            }
        }
        if (this.canvases.get(Integer.valueOf(i)) != reserveCanvas) {
            reserveCanvas.i();
        }
    }

    public float[] createFont(byte[] bArr, float f, int i, boolean z, byte[] bArr2) {
        assertWorker();
        int i2 = this.nextFont + 1;
        this.nextFont = i2;
        return defineFont(i2, bArr, f, i, z, bArr2);
    }

    public float[] defineFont(int i, byte[] bArr, float f, int i2, boolean z, byte[] bArr2) {
        if (this.fonts.size() >= 4096 && !this.fonts.containsKey(Integer.valueOf(i))) {
            lq5.j("Too many fonts");
            return null;
        }
        Paint[] paints = paints(text(bArr), f, i2, z, text(bArr2), this.owner.l);
        this.fonts.put(Integer.valueOf(i), paints[0]);
        this.deviceFonts.put(Integer.valueOf(i), paints[1]);
        return metrics(i, paints[1], this.owner.l, new Rect());
    }

    public void defineImage(int i, int i2, int i3, byte[] bArr) {
        if (bArr == null || i2 <= 0 || i3 <= 0) {
            return;
        }
        long j = i2 * i3;
        if (j > MAX_IMAGE_PIXELS || bArr.length != (j << 2)) {
            return;
        }
        synchronized (this.images) {
            if (this.imageBytes + bArr.length > 33554432) {
                return;
            }
            if (this.images.size() < 1024 || this.images.containsKey(Integer.valueOf(i))) {
                this.imageBytes += bArr.length;
                try {
                    Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(bArr));
                    synchronized (this.images) {
                        if (this.images.put(Integer.valueOf(i), createBitmap) != null) {
                            this.imageBytes -= r6.getAllocationByteCount();
                        }
                    }
                } catch (Throwable th) {
                    synchronized (this.images) {
                        this.imageBytes -= bArr.length;
                        throw th;
                    }
                }
            }
        }
    }

    public void deleteFont(int i) {
        this.fonts.remove(Integer.valueOf(i));
        this.deviceFonts.remove(Integer.valueOf(i));
    }

    @Override // s0d
    public Paint deviceFont(int i) {
        return this.deviceFonts.get(Integer.valueOf(i));
    }

    @Override // wzc
    public Paint font(int i) {
        return this.fonts.get(Integer.valueOf(i));
    }

    public byte[] formatIntl(byte[] bArr) {
        return j00.d(text(bArr)).getBytes(StandardCharsets.UTF_8);
    }

    @Override // s0d, wzc
    public Bitmap image(int i) {
        return this.images.get(Integer.valueOf(i));
    }

    public float[] loadImage(int i, byte[] bArr) {
        Bitmap decodeImage = decodeImage(text(bArr), imageBytes());
        if (decodeImage == null) {
            return null;
        }
        putImage(i, decodeImage);
        return new float[]{decodeImage.getWidth(), decodeImage.getHeight()};
    }

    public void record(byte[] bArr, byte[] bArr2, double d, int i, int i2, float f, float f2, int i3, int i4) {
        assertWorker();
        synchronized (this.recordLock) {
            recordLocked(bArr, bArr2, d, i, i2, f, f2, i3, i4);
        }
    }

    public void recordLayer(int i, int i2, byte[] bArr) {
        assertWorker();
        long nanoTime = System.nanoTime();
        if (i < 0 || i >= 256 || bArr.length > MAX_LIST_BYTES) {
            lq5.j("Layer");
            return;
        }
        yzc b = yzc.b(bArr);
        synchronized (this.recordLock) {
            long j = this.pendingLayerBytes;
            if (bArr.length + j > MAX_PENDING_LAYER_BYTES) {
                clearPendingLayers();
                throw new IllegalArgumentException("Layers");
            }
            this.pendingLayerBytes = j + bArr.length;
            this.pendingLayers.put(Integer.valueOf(i), b);
            this.layerParseNanos = (System.nanoTime() - nanoTime) + this.layerParseNanos;
        }
    }

    public void selectableText(byte[] bArr) {
        h1d h1dVar;
        assertWorker();
        String text = text(bArr);
        checkJsonDepth(text);
        try {
            ConcurrentHashMap<Integer, Paint> concurrentHashMap = this.deviceFonts;
            Objects.requireNonNull(concurrentHashMap);
            h1dVar = h1d.a(text, new ftb(concurrentHashMap, (byte) 23), this.owner.l);
        } catch (Exception unused) {
            h1dVar = null;
        }
        synchronized (this.recordLock) {
            this.text = h1dVar;
        }
    }

    public z session() {
        return this.owner;
    }

    public void signal(int i, byte[] bArr) {
        JSONObject jSONObject;
        String string;
        boolean optBoolean;
        byte b;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean isEmpty;
        String text = text(bArr);
        if (jsonSignal(i)) {
            checkJsonDepth(text);
        }
        z zVar = this.owner;
        zVar.getClass();
        byte b2 = 6;
        try {
            if (i == 8) {
                if (text == null || text.length() > 98368) {
                    return;
                }
                JSONObject jSONObject2 = new JSONObject(text);
                String optString = jSONObject2.optString("area");
                JSONObject optJSONObject = jSONObject2.optJSONObject("values");
                if ("local".equals(optString) || "session".equals(optString)) {
                    synchronized (zVar.w) {
                        isEmpty = zVar.w.isEmpty();
                        HashMap hashMap = zVar.w;
                        if (optJSONObject == null) {
                            optJSONObject = new JSONObject();
                        }
                        hashMap.put(optString, optJSONObject);
                    }
                    if (isEmpty) {
                        zVar.a.post(new x0d(zVar, b2));
                        return;
                    }
                    return;
                }
                return;
            }
            if (i == 10 || zVar.A) {
                return;
            }
            if (i == 12 || i == 19) {
                JSONObject jSONObject3 = new JSONObject(text);
                long j = jSONObject3.getLong("id");
                if (i == 19) {
                    string = null;
                    jSONObject = jSONObject3.getJSONObject("call");
                    optBoolean = false;
                } else {
                    jSONObject = null;
                    string = jSONObject3.getString("data");
                    optBoolean = jSONObject3.optBoolean("wallet");
                }
                e0d e0dVar = zVar.d;
                if (i == 19 ? e0dVar.e(jSONObject.toString(), zVar.L) : e0dVar.d(string, optBoolean, zVar.L)) {
                    zVar.a.post(new ck2(zVar, i, j, jSONObject, string, optBoolean));
                    return;
                }
                long j2 = zVar.v;
                if (j2 != 0) {
                    zVar.c.a(j2, j, 3, null);
                    return;
                }
                return;
            }
            if (i == 13) {
                b = 7;
                if (text == null || text.length() > 256 || !zVar.d.c(zVar.L)) {
                    return;
                }
            } else {
                if (i != 14) {
                    if (i == 11) {
                        zVar.a.post(new cxc((Object) zVar, (Object) text, (byte) 15));
                        return;
                    }
                    if (i == 18) {
                        JSONObject jSONObject4 = new JSONObject(text);
                        zVar.S = new float[]{(float) jSONObject4.optDouble("receive"), (float) jSONObject4.optDouble("animate"), (float) jSONObject4.optDouble("paint"), (float) jSONObject4.optDouble("serialize"), 0.0f, 0.0f, (float) jSONObject4.optDouble("ticks"), (float) jSONObject4.optDouble("framesSent"), (float) jSONObject4.optDouble("opsLatency"), (float) jSONObject4.optDouble("validate", -1.0d), (float) jSONObject4.optDouble("hop", -1.0d)};
                        return;
                    }
                    byte b3 = 16;
                    if (i == 16 || i == 17 || i == 9) {
                        return;
                    }
                    if (i == 3) {
                        JSONObject jSONObject5 = new JSONObject(text);
                        zVar.a.post(new qf4(zVar, jSONObject5.optBoolean("x"), jSONObject5.optBoolean("y"), jSONObject5.optBoolean("hold"), (byte) 1));
                        return;
                    }
                    if (i == 4) {
                        JSONObject jSONObject6 = new JSONObject(text);
                        if (jSONObject6.optBoolean("loaded")) {
                            zVar.B = true;
                        }
                        if (!zVar.f0 && jSONObject6.has("engine")) {
                            zVar.f0 = true;
                            if (f11.a) {
                                cc4.b("widget engine: " + jSONObject6.optString("engine") + ", " + jSONObject6.optString("boot"));
                            }
                        }
                        zVar.G = "bottom".equals(jSONObject6.optString("resizeAnchor"));
                        if (jSONObject6.optBoolean("rendered") && !zVar.E) {
                            double optDouble = jSONObject6.optDouble("height", -1.0d);
                            double min = Math.min(zVar.e0 ? 4000.0f : 600.0f, Math.max(50.0f, zVar.t / zVar.l));
                            if (zVar.u && optDouble > 0.0d && Math.abs(min - optDouble) <= 1.0d) {
                                zVar.F = true;
                                if (zVar.D == 0) {
                                    zVar.D = SystemClock.uptimeMillis();
                                }
                            }
                            zVar.E = true;
                        }
                        synchronized (zVar.s) {
                            try {
                                if (zVar.A) {
                                    return;
                                }
                                zVar.P = jSONObject6;
                                if (!zVar.Q) {
                                    zVar.Q = true;
                                    zVar.a.post(zVar.V);
                                }
                                return;
                            } finally {
                            }
                        }
                    }
                    if (i == 5) {
                        JSONObject jSONObject7 = new JSONObject(text);
                        String optString2 = jSONObject7.optString("kind");
                        if ("openLink".equals(optString2) || "openTelegramLink".equals(optString2)) {
                            String optString3 = jSONObject7.optString("url");
                            boolean equals = "openTelegramLink".equals(optString2);
                            if (optString3 != null && optString3.length() <= 256 && optString3.length() >= 9 && optString3.regionMatches(true, 0, "https://", 0, 8)) {
                                int i2 = 8;
                                while (i2 < optString3.length() && "/?#".indexOf(optString3.charAt(i2)) < 0) {
                                    i2++;
                                }
                                String substring = optString3.substring(8, i2);
                                if (substring.indexOf(64) < 0) {
                                    int indexOf = substring.indexOf(58);
                                    if (indexOf >= 0) {
                                        substring = substring.substring(0, indexOf);
                                    }
                                    if (!substring.isEmpty() && substring.length() <= 253) {
                                        String[] split = substring.split("\\.", -1);
                                        int length = split.length;
                                        int i3 = 0;
                                        loop1: while (true) {
                                            if (i3 < length) {
                                                String str = split[i3];
                                                if (str.isEmpty() || str.length() > 63) {
                                                    break;
                                                }
                                                z = false;
                                                if (str.charAt(0) == '-' || str.charAt(str.length() - 1) == '-') {
                                                    break;
                                                }
                                                for (int i4 = 0; i4 < str.length(); i4++) {
                                                    char charAt = str.charAt(i4);
                                                    if ((charAt < 'a' || charAt > 'z') && ((charAt < '0' || charAt > '9') && charAt != '-')) {
                                                        break loop1;
                                                    }
                                                }
                                                i3++;
                                            } else {
                                                z = false;
                                                String[] strArr = e0d.m;
                                                boolean z5 = false;
                                                for (int i5 = 0; i5 < 3; i5++) {
                                                    String str2 = strArr[i5];
                                                    if (!substring.equals(str2)) {
                                                        if (!substring.endsWith("." + str2)) {
                                                            z4 = false;
                                                            z5 |= z4;
                                                        }
                                                    }
                                                    z4 = true;
                                                    z5 |= z4;
                                                }
                                                if (z5 == equals && zVar.d.c(zVar.L)) {
                                                    z2 = true;
                                                }
                                            }
                                        }
                                        z2 = z;
                                        z3 = z2;
                                    }
                                    z = false;
                                    z2 = z;
                                    z3 = z2;
                                }
                            }
                            z = false;
                            z2 = z;
                            z3 = z2;
                        } else {
                            z3 = "haptic".equals(optString2) ? zVar.d.a(zVar.L) : "ready".equals(optString2);
                        }
                        if (z3) {
                            zVar.a.post(new cxc(zVar, jSONObject7, b3));
                            return;
                        }
                        return;
                    }
                    return;
                }
                b = 7;
            }
            zVar.a.post(new mpc(zVar, i, text, b));
        } catch (Exception unused) {
        }
    }

    public void state(int i, float f) {
        z zVar = this.owner;
        if (zVar.A) {
            return;
        }
        if ((i & 8) != 0 && f == f) {
            zVar.q.set(f == 0.0f);
            zVar.x = f;
            if (zVar.y.compareAndSet(false, true)) {
                zVar.a.post(new x0d(zVar, (byte) 5));
            }
        }
        if ((i & 4) != 0) {
            zVar.o.set(false);
        }
        if ((i & 2) != 0) {
            zVar.n.set(true);
        }
        if ((i & 6) != 0) {
            zVar.a.removeCallbacks(zVar.W);
            zVar.a.post(zVar.W);
        }
        if ((i & 1) != 0) {
            zVar.p.set(true);
            zVar.a.post(zVar.d0);
        }
    }

    public float textWidth(int i, byte[] bArr) {
        Paint paint = this.deviceFonts.get(Integer.valueOf(i));
        if (paint == null) {
            return 0.0f;
        }
        return paint.measureText(text(bArr)) / this.owner.l;
    }
}
