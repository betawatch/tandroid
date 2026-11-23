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
import android.text.TextUtils;
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
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.Components.cz;
import org.telegram.ui.Components.lc;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
final class WidgetSandboxBackend implements g1, h {
    private static final int MAX_CANVAS_WORDS = 2097152;
    private static final int MAX_COMPOSITION_LAYERS = 256;
    private static final int MAX_DISPLAY_OPS = 200000;
    private static final int MAX_FONTS = 4096;
    private static final int MAX_FRAMES_PER_SECOND = 240;
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
    private final p1 owner;
    private long pendingLayerBytes;
    private v1 text;
    private final Object recordLock = new Object();
    private final long[] recordTimes = new long[240];
    private final ConcurrentHashMap<Integer, Paint> fonts = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<Integer, Paint> deviceFonts = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<Integer, Bitmap> images = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<Integer, i> canvases = new ConcurrentHashMap<>();
    private final Object canvasLock = new Object();
    private final HashMap<Integer, j> pendingLayers = new HashMap<>();
    private HashMap<Long, a1> layerContents = new HashMap<>();
    private final h1 painter = new h1();

    public WidgetSandboxBackend(p1 p1Var) {
        this.owner = p1Var;
    }

    private static void assertWorker() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Native layout and recording must run off UI");
        }
    }

    public static void checkJsonDepth(String str) {
        int length = str.length();
        int i7 = 0;
        boolean z10 = false;
        int i10 = 0;
        while (i7 < length) {
            char charAt = str.charAt(i7);
            if (z10) {
                if (charAt == '\\') {
                    i7++;
                } else if (charAt == '\"') {
                    z10 = false;
                }
            } else if (charAt == '\"') {
                z10 = true;
            } else if (charAt == '[' || charAt == '{') {
                i10++;
                if (i10 > 32) {
                    throw new IllegalArgumentException("JSON nests too deep");
                }
            } else if (charAt == ']' || charAt == '}') {
                if (i10 > 0) {
                    i10--;
                }
            } else if (charAt == '\'' || charAt == '/' || charAt == '#') {
                throw new IllegalArgumentException("Not JSON");
            }
            i7++;
        }
    }

    private void clearPendingLayers() {
        this.pendingLayers.clear();
        this.pendingLayerBytes = 0L;
        this.layerParseNanos = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01a0 A[EDGE_INSN: B:169:0x01a0->B:168:0x01a0 BREAK  A[LOOP:2: B:70:0x0183->B:102:0x0297], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0156 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0198 A[Catch: all -> 0x01b6, TryCatch #1 {all -> 0x01b6, blocks: (B:76:0x018d, B:78:0x0198, B:80:0x01a8, B:83:0x01b0, B:84:0x01be, B:85:0x01c8, B:87:0x01ce, B:92:0x01da, B:94:0x01e0, B:122:0x01f2), top: B:75:0x018d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap decodeImage(String str, long j3) {
        int i7;
        Bitmap bitmap;
        int i10;
        int i11;
        String str2;
        long j10;
        long j11;
        byte[] bArr;
        int i12;
        CRC32 crc32;
        String str3;
        Inflater inflater;
        long j12;
        int b10;
        int i13;
        int i14;
        byte[] bArr2;
        boolean z10;
        int i15;
        long b11;
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
            int i16 = options.outWidth;
            if (i16 <= 0 || (i7 = options.outHeight) <= 0 || i16 * i7 > MAX_IMAGE_PIXELS) {
                return null;
            }
            if ((i16 * i7 * 4) + j3 > 33554432) {
                return null;
            }
            options.inJustDecodeBounds = false;
            byte[] bArr3 = l.d;
            int length = decode.length;
            if (length >= 33) {
                int i17 = 0;
                while (true) {
                    if (i17 < 8) {
                        if (decode[i17] != bArr3[i17]) {
                            break;
                        }
                        i17++;
                    } else if (l.n(12, "IHDR", decode) && l.b(8, decode) >= 13) {
                        long b12 = l.b(16, decode);
                        long b13 = l.b(20, decode);
                        int i18 = decode[24] & 255;
                        int i19 = decode[25] & 255;
                        int i20 = decode[28] & 255;
                        if (i19 != 0) {
                            i10 = 3;
                            if (i19 != 3) {
                                if (i19 != 2) {
                                    i10 = i19 == 4 ? 2 : i19 == 6 ? 4 : 0;
                                }
                                if (i10 != 0 && i20 == 0 && b12 > 0 && b13 > 0 && b12 * b13 <= MAX_IMAGE_PIXELS) {
                                    CRC32 crc322 = new CRC32();
                                    i11 = 8;
                                    while (true) {
                                        str2 = "IEND";
                                        j10 = b13;
                                        if (i11 + 12 <= length) {
                                            j11 = b12;
                                            break;
                                        }
                                        b11 = l.b(i11, decode);
                                        j11 = b12;
                                        if (b11 <= (length - i11) - 12) {
                                            int i21 = i11 + 4;
                                            if (l.n(i21, "IEND", decode)) {
                                                break;
                                            }
                                            if (l.n(i21, "IDAT", decode)) {
                                                crc322.reset();
                                                int i22 = (int) b11;
                                                crc322.update(decode, i21, i22 + 4);
                                                if (crc322.getValue() != l.b(i11 + 8 + i22, decode)) {
                                                    break;
                                                }
                                            }
                                            i11 += ((int) b11) + 12;
                                            b13 = j10;
                                            b12 = j11;
                                        } else {
                                            break;
                                        }
                                    }
                                    int i23 = (int) (((((j11 * i10) * i18) + 7) / 8) + 1);
                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                    Inflater inflater2 = new Inflater(true);
                                    bArr = new byte[TLObject.FLAG_14];
                                    boolean z11 = true;
                                    long j13 = 0;
                                    i12 = 8;
                                    while (i12 + 12 <= length && j13 < j10) {
                                        byte[] bArr4 = bArr;
                                        try {
                                            b10 = (int) l.b(i12, decode);
                                            if (b10 <= (length - i12) - 12) {
                                                break;
                                            }
                                            int i24 = i12 + 4;
                                            if (l.n(i24, str2, decode)) {
                                                break;
                                            }
                                            if (l.n(i24, "IDAT", decode)) {
                                                int min = z11 ? Math.min(2, b10) : 0;
                                                inflater2.setInput(decode, i12 + 8 + min, b10 - min);
                                                boolean z12 = false;
                                                while (!inflater2.needsInput() && !inflater2.finished() && !z12) {
                                                    i13 = length;
                                                    bArr2 = bArr4;
                                                    try {
                                                        int inflate = inflater2.inflate(bArr2);
                                                        if (inflate == 0 && inflater2.needsDictionary()) {
                                                            crc32 = crc322;
                                                            str3 = str2;
                                                            z10 = z12;
                                                            inflater = inflater2;
                                                            i14 = b10;
                                                            break;
                                                        }
                                                        boolean z13 = z12;
                                                        byteArrayOutputStream.write(bArr2, 0, inflate);
                                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                                        while (true) {
                                                            if (j13 >= j10) {
                                                                crc32 = crc322;
                                                                str3 = str2;
                                                                i15 = inflate;
                                                                inflater = inflater2;
                                                                i14 = b10;
                                                                break;
                                                            }
                                                            inflater = inflater2;
                                                            i14 = b10;
                                                            long j14 = i23;
                                                            long j15 = j13 * j14;
                                                            i15 = inflate;
                                                            try {
                                                                crc32 = crc322;
                                                                str3 = str2;
                                                                if (j15 >= byteArray.length) {
                                                                    break;
                                                                }
                                                                if ((byteArray[(int) j15] & 255) > 4) {
                                                                    z12 = true;
                                                                    break;
                                                                }
                                                                if (j15 + j14 > byteArray.length) {
                                                                    break;
                                                                }
                                                                j13++;
                                                                inflater2 = inflater;
                                                                b10 = i14;
                                                                inflate = i15;
                                                                crc322 = crc32;
                                                                str2 = str3;
                                                            } catch (Throwable th2) {
                                                                th = th2;
                                                                inflater.end();
                                                                throw th;
                                                            }
                                                        }
                                                        z12 = z13;
                                                        if (i15 == 0) {
                                                            break;
                                                        }
                                                        bArr4 = bArr2;
                                                        length = i13;
                                                        inflater2 = inflater;
                                                        b10 = i14;
                                                        crc322 = crc32;
                                                        str2 = str3;
                                                    } catch (DataFormatException unused) {
                                                        crc32 = crc322;
                                                        str3 = str2;
                                                        inflater = inflater2;
                                                        i14 = b10;
                                                        z12 = true;
                                                    }
                                                }
                                                crc32 = crc322;
                                                str3 = str2;
                                                i13 = length;
                                                inflater = inflater2;
                                                i14 = b10;
                                                bArr2 = bArr4;
                                                z10 = z12;
                                                z12 = z10;
                                                if (z12) {
                                                    break;
                                                }
                                                bArr4 = bArr2;
                                                z11 = false;
                                            } else {
                                                crc32 = crc322;
                                                str3 = str2;
                                                i13 = length;
                                                inflater = inflater2;
                                                i14 = b10;
                                                if (byteArrayOutputStream.size() == 0 && !l.n(i24, "IHDR", decode)) {
                                                    byteArrayOutputStream2.write(decode, i12, i14 + 12);
                                                }
                                            }
                                            i12 += i14 + 12;
                                            length = i13;
                                            bArr = bArr4;
                                            inflater2 = inflater;
                                            crc322 = crc32;
                                            str2 = str3;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            inflater = inflater2;
                                        }
                                    }
                                    crc32 = crc322;
                                    str3 = str2;
                                    inflater = inflater2;
                                    j12 = j13;
                                    inflater.end();
                                    if (j12 < j10) {
                                        Bitmap createBitmap = Bitmap.createBitmap((int) j11, (int) j10, Bitmap.Config.ARGB_8888);
                                        if (j12 != 0) {
                                            int i25 = (int) (i23 * j12);
                                            byte[] bArr5 = new byte[i25];
                                            System.arraycopy(byteArrayOutputStream.toByteArray(), 0, bArr5, 0, i25);
                                            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                                            byteArrayOutputStream3.write(bArr3, 0, 8);
                                            byte[] bArr6 = new byte[13];
                                            System.arraycopy(decode, 16, bArr6, 0, 13);
                                            l.h(bArr6, 4, j12);
                                            CRC32 crc323 = crc32;
                                            l.q(byteArrayOutputStream3, "IHDR", bArr6, crc323);
                                            byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                                            byteArrayOutputStream3.write(byteArray2, 0, byteArray2.length);
                                            Deflater deflater = new Deflater();
                                            deflater.setInput(bArr5);
                                            deflater.finish();
                                            ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                                            byte[] bArr7 = new byte[TLObject.FLAG_13];
                                            while (!deflater.finished()) {
                                                byteArrayOutputStream4.write(bArr7, 0, deflater.deflate(bArr7));
                                            }
                                            deflater.end();
                                            l.q(byteArrayOutputStream3, "IDAT", byteArrayOutputStream4.toByteArray(), crc323);
                                            l.q(byteArrayOutputStream3, str3, new byte[0], crc323);
                                            byte[] byteArray3 = byteArrayOutputStream3.toByteArray();
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
                        i10 = 1;
                        if (i10 != 0) {
                            CRC32 crc3222 = new CRC32();
                            i11 = 8;
                            while (true) {
                                str2 = "IEND";
                                j10 = b13;
                                if (i11 + 12 <= length) {
                                }
                                i11 += ((int) b11) + 12;
                                b13 = j10;
                                b12 = j11;
                            }
                            int i232 = (int) (((((j11 * i10) * i18) + 7) / 8) + 1);
                            ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                            ByteArrayOutputStream byteArrayOutputStream22 = new ByteArrayOutputStream();
                            Inflater inflater22 = new Inflater(true);
                            bArr = new byte[TLObject.FLAG_14];
                            boolean z112 = true;
                            long j132 = 0;
                            i12 = 8;
                            while (i12 + 12 <= length) {
                                byte[] bArr42 = bArr;
                                b10 = (int) l.b(i12, decode);
                                if (b10 <= (length - i12) - 12) {
                                }
                            }
                            crc32 = crc3222;
                            str3 = str2;
                            inflater = inflater22;
                            j12 = j132;
                            inflater.end();
                            if (j12 < j10) {
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
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : str.split(",")) {
            if (str2.indexOf(61) == 4) {
                String substring = str2.substring(0, 4);
                String substring2 = str2.substring(5);
                if (substring.matches("[\\x20-\\x7e]{4}") && substring.indexOf(34) < 0 && substring2.matches("\\d{1,5}")) {
                    if (sb2.length() > 0) {
                        sb2.append(", ");
                    }
                    sb2.append('\"');
                    sb2.append(substring);
                    sb2.append("\" ");
                    sb2.append(substring2);
                }
            }
        }
        if (sb2.length() == 0) {
            return null;
        }
        return sb2.toString();
    }

    private long imageBytes() {
        long j3;
        synchronized (this.images) {
            j3 = this.imageBytes;
        }
        return j3;
    }

    private static boolean jsonSignal(int i7) {
        return i7 == 3 || i7 == 4 || i7 == 5 || i7 == 8 || i7 == 12 || i7 == 18 || i7 == 19;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0199 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private o1[] layers(JSONObject jSONObject, float f10) {
        int i7;
        HashMap<Long, a1> hashMap;
        o1[] o1VarArr;
        int i10;
        int i11;
        JSONArray jSONArray;
        HashMap<Long, a1> hashMap2;
        boolean z10;
        JSONObject jSONObject2;
        JSONArray jSONArray2;
        long j3;
        float[] fArr;
        float[] fArr2;
        int i12;
        int i13;
        d0 c0Var;
        float f11 = f10;
        JSONArray optJSONArray = jSONObject.optJSONArray("l");
        int min = optJSONArray == null ? 0 : Math.min(optJSONArray.length(), 256);
        HashMap<Long, a1> hashMap3 = new HashMap<>();
        o1[] o1VarArr2 = new o1[min];
        int i14 = 0;
        int i15 = 0;
        long j10 = 0;
        while (true) {
            if (i14 >= min) {
                i7 = min;
                hashMap = hashMap3;
                o1VarArr = o1VarArr2;
                i10 = i15;
                break;
            }
            JSONObject optJSONObject = optJSONArray.optJSONObject(i14);
            if (optJSONObject != null) {
                long optLong = optJSONObject.optLong("id");
                long optLong2 = optJSONObject.optLong("cv");
                JSONArray optJSONArray2 = optJSONObject.optJSONArray("b");
                if (optJSONArray2 != null) {
                    JSONArray optJSONArray3 = optJSONObject.optJSONArray("k");
                    if (optJSONArray3 == null || optJSONArray3.length() <= 8192) {
                        a1 a1Var = this.layerContents.get(Long.valueOf(optLong));
                        i11 = i14;
                        j jVar = this.pendingLayers.get(Integer.valueOf(i11));
                        if (jVar != null) {
                            int i16 = i15;
                            double d = f11;
                            int floor = (int) Math.floor(optJSONArray2.optDouble(0) * d);
                            i7 = min;
                            int floor2 = (int) Math.floor(optJSONArray2.optDouble(1) * d);
                            int ceil = (int) Math.ceil((optJSONArray2.optDouble(2) + optJSONArray2.optDouble(0)) * d);
                            hashMap = hashMap3;
                            int ceil2 = (int) Math.ceil((optJSONArray2.optDouble(3) + optJSONArray2.optDouble(1)) * d);
                            long j11 = ceil - floor;
                            long j12 = ceil2 - floor2;
                            if (j11 <= 0 || j12 <= 0 || j11 > 2147483647L || j12 > 2147483647L) {
                                jSONArray = optJSONArray;
                                o1VarArr = o1VarArr2;
                                i10 = i16;
                                i15 = i10;
                                i14 = i11 + 1;
                                f11 = f10;
                                hashMap3 = hashMap;
                                o1VarArr2 = o1VarArr;
                                min = i7;
                                optJSONArray = jSONArray;
                            } else {
                                if (j11 * j12 > 33554432 - j10) {
                                    o1VarArr = o1VarArr2;
                                    i10 = i16;
                                    break;
                                }
                                if (Build.VERSION.SDK_INT >= 29) {
                                    i13 = ceil;
                                    i12 = ceil2;
                                    c0Var = new b0("widget-sandbox-layer", floor, floor2, ceil, ceil2);
                                } else {
                                    i12 = ceil2;
                                    i13 = ceil;
                                    c0Var = new c0(floor, floor2, i13, i12);
                                }
                                Canvas a10 = c0Var.a();
                                try {
                                    a10.translate(-floor, -floor2);
                                    a10.scale(f11, f11);
                                    jSONObject2 = optJSONObject;
                                    o1VarArr = o1VarArr2;
                                    jSONArray = optJSONArray;
                                    jSONArray2 = optJSONArray3;
                                    i10 = i16;
                                    hashMap2 = hashMap;
                                    this.painter.f(a10, jVar, this, f11, floor / f11, floor2 / f11, i13 / f11, i12 / f11);
                                    c0Var.d();
                                    a1Var = new a1(c0Var, (int) optLong2);
                                    z10 = true;
                                    d0 d0Var = a1Var.a;
                                    j3 = (d0Var.c - d0Var.a) * (d0Var.d - d0Var.b);
                                    if (j3 <= 33554432 - j10) {
                                        hashMap = hashMap2;
                                        break;
                                    }
                                    j10 += j3;
                                    hashMap = hashMap2;
                                    hashMap.put(Long.valueOf(optLong), a1Var);
                                    JSONArray optJSONArray4 = jSONObject2.optJSONArray("l");
                                    float[] fArr3 = null;
                                    if (optJSONArray4 != null) {
                                        float[] fArr4 = new float[4];
                                        h1.d(optJSONArray4, fArr4, 4, new float[0]);
                                        JSONArray optJSONArray5 = jSONObject2.optJSONArray("q");
                                        if (optJSONArray5 != null) {
                                            fArr3 = new float[8];
                                            h1.d(optJSONArray5, fArr3, 8, new float[0]);
                                        }
                                        fArr2 = fArr3;
                                        fArr = fArr4;
                                    } else {
                                        fArr = null;
                                        fArr2 = null;
                                    }
                                    int length = jSONArray2 == null ? 0 : (jSONArray2.length() / 8) * 8;
                                    float[] fArr5 = new float[length];
                                    h1.d(jSONArray2, fArr5, length, new float[0]);
                                    i15 = i10 + 1;
                                    o1VarArr[i10] = new o1(d0Var, fArr, fArr2, jSONObject2.optDouble("ts"), jSONObject2.optDouble("td"), jSONObject2.optInt("tr") != 0 ? z10 : false, fArr5);
                                    i14 = i11 + 1;
                                    f11 = f10;
                                    hashMap3 = hashMap;
                                    o1VarArr2 = o1VarArr;
                                    min = i7;
                                    optJSONArray = jSONArray;
                                } catch (Throwable th2) {
                                    c0Var.d();
                                    throw th2;
                                }
                            }
                        } else {
                            jSONArray = optJSONArray;
                            i7 = min;
                            hashMap2 = hashMap3;
                            o1VarArr = o1VarArr2;
                            z10 = true;
                            i10 = i15;
                            jSONObject2 = optJSONObject;
                            jSONArray2 = optJSONArray3;
                            if (a1Var == null || a1Var.b != ((int) optLong2)) {
                                hashMap = hashMap2;
                                i15 = i10;
                                i14 = i11 + 1;
                                f11 = f10;
                                hashMap3 = hashMap;
                                o1VarArr2 = o1VarArr;
                                min = i7;
                                optJSONArray = jSONArray;
                            }
                            d0 d0Var2 = a1Var.a;
                            j3 = (d0Var2.c - d0Var2.a) * (d0Var2.d - d0Var2.b);
                            if (j3 <= 33554432 - j10) {
                            }
                        }
                    } else {
                        i11 = i14;
                        jSONArray = optJSONArray;
                        i7 = min;
                        hashMap = hashMap3;
                        o1VarArr = o1VarArr2;
                        i10 = i15;
                        i15 = i10;
                        i14 = i11 + 1;
                        f11 = f10;
                        hashMap3 = hashMap;
                        o1VarArr2 = o1VarArr;
                        min = i7;
                        optJSONArray = jSONArray;
                    }
                }
            }
            i11 = i14;
            jSONArray = optJSONArray;
            i7 = min;
            hashMap = hashMap3;
            o1VarArr = o1VarArr2;
            i10 = i15;
            i15 = i10;
            i14 = i11 + 1;
            f11 = f10;
            hashMap3 = hashMap;
            o1VarArr2 = o1VarArr;
            min = i7;
            optJSONArray = jSONArray;
        }
        this.layerContents = hashMap;
        if (i10 == i7) {
            return o1VarArr;
        }
        o1[] o1VarArr3 = new o1[i10];
        System.arraycopy(o1VarArr, 0, o1VarArr3, 0, i10);
        return o1VarArr3;
    }

    public static float[] metrics(int i7, Paint paint, float f10, Rect rect) {
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        paint.getTextBounds("x", 0, 1, rect);
        float f11 = fontMetrics.ascent;
        float f12 = fontMetrics.descent;
        return new float[]{i7, (-f11) / f10, f12 / f10, ((f12 - f11) + fontMetrics.leading) / f10, rect.height() / f10, paint.measureText("0") / f10};
    }

    public static Paint[] paints(String str, float f10, int i7, boolean z10, String str2, float f11) {
        if (f10 <= 0.0f || f10 > 10000.0f) {
            f10 = 16.0f;
        }
        Paint paint = new Paint(ls.N1);
        paint.setTextSize(f10);
        paint.setTypeface(typeface(str, i7, z10));
        String featureSettings = featureSettings(str2);
        if (featureSettings != null) {
            paint.setFontFeatureSettings(featureSettings);
        }
        Paint paint2 = new Paint(paint);
        paint2.setTextSize(f10 * f11);
        return new Paint[]{paint, paint2};
    }

    private void putImage(int i7, Bitmap bitmap) {
        synchronized (this.images) {
            try {
                Bitmap put = this.images.put(Integer.valueOf(i7), bitmap);
                long allocationByteCount = this.imageBytes + bitmap.getAllocationByteCount();
                this.imageBytes = allocationByteCount;
                if (put != null) {
                    this.imageBytes = allocationByteCount - put.getAllocationByteCount();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r1v2, types: [org.telegram.utils.twidget.d0] */
    /* JADX WARN: Type inference failed for: r1v3 */
    private void recordLocked(byte[] bArr, byte[] bArr2, double d, int i7, int i10, float f10, float f11, int i11, int i12) {
        int i13;
        int i14;
        d0 c0Var;
        ?? r12 = bArr;
        if (r12.length > MAX_LIST_BYTES) {
            clearPendingLayers();
            throw new IllegalArgumentException("Display list");
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long[] jArr = this.recordTimes;
        int i15 = this.nextRecord;
        if (elapsedRealtime - jArr[i15] < 1000) {
            clearPendingLayers();
            return;
        }
        jArr[i15] = elapsedRealtime;
        this.nextRecord = (i15 + 1) % jArr.length;
        this.owner.getClass();
        this.owner.getClass();
        Trace.beginSection("WidgetSandbox:Record");
        double nanoTime = d - (System.nanoTime() / 1.0E9d);
        if (Build.VERSION.SDK_INT >= 29) {
            c0Var = new b0("widget-sandbox-content", 0, 0, i7, i10);
            i14 = i10;
            i13 = i7;
        } else {
            i13 = i7;
            i14 = i10;
            c0Var = new c0(0, 0, i13, i14);
        }
        d0 d0Var = c0Var;
        try {
            try {
                try {
                    j b10 = j.b(r12);
                    String text = text(bArr2);
                    checkJsonDepth(text);
                    JSONObject jSONObject = new JSONObject(text);
                    System.nanoTime();
                    this.painter.b(i13, i14);
                    Canvas a10 = d0Var.a();
                    try {
                        a10.scale(f10, f10);
                        this.painter.f(a10, b10, this, f10, 0.0f, 0.0f, i13 / f10, i14 / f10);
                        d0Var.d();
                        o1[] layers = layers(jSONObject, f10);
                        p1 p1Var = this.owner;
                        System.nanoTime();
                        p1Var.getClass();
                        p1Var.S = null;
                        this.owner.c(d0Var, layers, nanoTime, i7, i14, f11, (System.nanoTime() - r10) / 1000000.0f, i11, i12, b10.b, this.text);
                    } catch (Throwable th2) {
                        d0Var.d();
                        throw th2;
                    }
                } finally {
                    clearPendingLayers();
                    Trace.endSection();
                }
            } catch (Exception e10) {
                e = e10;
                r12 = d0Var;
                r12.b();
                throw e;
            }
        } catch (Exception e11) {
            e = e11;
            r12.b();
            throw e;
        }
    }

    private i reserveCanvas(int i7, int i10, int i11) {
        i iVar;
        long j3 = i10 * i11;
        if (j3 > MAX_IMAGE_PIXELS) {
            throw new IllegalArgumentException("Canvas dimensions");
        }
        synchronized (this.canvasLock) {
            long j10 = j3 * 8;
            try {
                long imageBytes = imageBytes() + j10;
                for (Map.Entry<Integer, i> entry : this.canvases.entrySet()) {
                    if (entry.getKey().intValue() != i7) {
                        imageBytes += entry.getValue().W;
                    }
                }
                if (imageBytes > 33554432) {
                    throw new IllegalArgumentException("Canvas memory budget");
                }
                iVar = this.canvases.get(Integer.valueOf(i7));
                if (iVar == null) {
                    iVar = new i(i7);
                    this.canvases.put(Integer.valueOf(i7), iVar);
                }
                iVar.W = j10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iVar;
    }

    public static String text(byte[] bArr) {
        return bArr == null ? "" : new String(bArr, StandardCharsets.UTF_8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x0167, code lost:
    
        r0 = r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface typeface(String str, int i7, boolean z10) {
        Typeface typeface;
        Typeface typeface2 = Typeface.SANS_SERIF;
        String[] split = str.split(",");
        int length = split.length;
        int i10 = 0;
        while (true) {
            if (i10 < length) {
                String lowerCase = split[i10].trim().replace("\"", "").replace("'", "").toLowerCase(Locale.ROOT);
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
                i10++;
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return Typeface.create(typeface2, Math.max(1, Math.min(1000, i7)), z10);
        }
        return Typeface.create(typeface2, (i7 < 600 ? 0 : 1) | (z10 ? 2 : 0));
    }

    @Override // org.telegram.utils.twidget.g1
    public Bitmap canvas(int i7) {
        i iVar = this.canvases.get(Integer.valueOf(i7));
        if (iVar == null) {
            return null;
        }
        return iVar.j();
    }

    @Override // org.telegram.utils.twidget.h
    public Bitmap canvasBitmap(int i7) {
        i iVar = this.canvases.get(Integer.valueOf(i7));
        if (iVar == null) {
            return null;
        }
        return iVar.j();
    }

    public byte[] canvasRead(int i7, int i10, int i11, int i12, int i13) {
        int i14 = i10;
        assertWorker();
        if (i12 <= 0 || i13 <= 0 || i12 * i13 > MAX_IMAGE_PIXELS) {
            return null;
        }
        i iVar = this.canvases.get(Integer.valueOf(i7));
        if (iVar == null) {
            return new byte[i12 * i13 * 4];
        }
        synchronized (iVar) {
            byte[] bArr = new byte[Math.max(i12, 0) * Math.max(i13, 0) * 4];
            if (iVar.o == null) {
                return bArr;
            }
            int max = Math.max(0, i14);
            int max2 = Math.max(0, i11);
            int min = Math.min(iVar.o.getWidth(), i14 + i12);
            int min2 = Math.min(iVar.o.getHeight(), i13 + i11);
            if (min > max && min2 > max2) {
                int i15 = min - max;
                int i16 = min2 - max2;
                int[] iArr = new int[i15 * i16];
                iVar.o.getPixels(iArr, 0, i15, max, max2, i15, i16);
                int i17 = max2;
                while (i17 < min2) {
                    int i18 = max;
                    while (i18 < min) {
                        int i19 = iArr[(i18 - max) + ((i17 - max2) * i15)];
                        int i20 = ((i18 - i14) + ((i17 - i11) * i12)) * 4;
                        bArr[i20] = (byte) Color.red(i19);
                        bArr[i20 + 1] = (byte) Color.green(i19);
                        bArr[i20 + 2] = (byte) Color.blue(i19);
                        bArr[i20 + 3] = (byte) Color.alpha(i19);
                        i18++;
                        i14 = i10;
                    }
                    i17++;
                    i14 = i10;
                }
                return bArr;
            }
            return bArr;
        }
    }

    public void canvasRelease(int i7) {
        i remove;
        assertWorker();
        synchronized (this.canvasLock) {
            remove = this.canvases.remove(Integer.valueOf(i7));
        }
        if (remove != null) {
            remove.i();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055 A[Catch: all -> 0x0059, ArrayIndexOutOfBoundsException -> 0x0079, LOOP:0: B:17:0x004f->B:21:0x0055, LOOP_END, TRY_LEAVE, TryCatch #2 {all -> 0x0059, blocks: (B:19:0x0050, B:21:0x0055, B:32:0x0079, B:33:0x0080), top: B:18:0x0050, outer: #0, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b A[EDGE_INSN: B:22:0x005b->B:23:0x005b BREAK  A[LOOP:0: B:17:0x004f->B:21:0x0055], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void canvasRun(int i7, int i10, int i11, int[] iArr) {
        assertWorker();
        if (i10 <= 0 || i11 <= 0) {
            canvasRelease(i7);
            return;
        }
        if (iArr.length > 2097152) {
            throw new IllegalArgumentException("Canvas batch");
        }
        i reserveCanvas = reserveCanvas(i7, i10, i11);
        synchronized (reserveCanvas) {
            try {
                Bitmap bitmap = reserveCanvas.o;
                if (bitmap != null) {
                    if (bitmap.getWidth() == i10) {
                        if (reserveCanvas.o.getHeight() != i11) {
                        }
                        reserveCanvas.t = iArr;
                        reserveCanvas.u = 0;
                        reserveCanvas.X = 0L;
                        int saveCount = reserveCanvas.q.getSaveCount();
                        while (true) {
                            try {
                                try {
                                    if (reserveCanvas.u < iArr.length) {
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
                }
                Bitmap bitmap2 = reserveCanvas.o;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                reserveCanvas.o = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                reserveCanvas.q = new Canvas(reserveCanvas.o);
                reserveCanvas.t = iArr;
                reserveCanvas.u = 0;
                reserveCanvas.X = 0L;
                int saveCount2 = reserveCanvas.q.getSaveCount();
                while (true) {
                    if (reserveCanvas.u < iArr.length) {
                    }
                    reserveCanvas.h(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (this.canvases.get(Integer.valueOf(i7)) != reserveCanvas) {
            reserveCanvas.i();
        }
    }

    public float[] createFont(byte[] bArr, float f10, int i7, boolean z10, byte[] bArr2) {
        assertWorker();
        int i10 = this.nextFont + 1;
        this.nextFont = i10;
        return defineFont(i10, bArr, f10, i7, z10, bArr2);
    }

    public float[] defineFont(int i7, byte[] bArr, float f10, int i10, boolean z10, byte[] bArr2) {
        if (this.fonts.size() >= 4096 && !this.fonts.containsKey(Integer.valueOf(i7))) {
            throw new IllegalArgumentException("Too many fonts");
        }
        Paint[] paints = paints(text(bArr), f10, i10, z10, text(bArr2), this.owner.l);
        this.fonts.put(Integer.valueOf(i7), paints[0]);
        this.deviceFonts.put(Integer.valueOf(i7), paints[1]);
        return metrics(i7, paints[1], this.owner.l, new Rect());
    }

    public void defineImage(int i7, int i10, int i11, byte[] bArr) {
        if (bArr == null || i10 <= 0 || i11 <= 0) {
            return;
        }
        long j3 = i10 * i11;
        if (j3 > MAX_IMAGE_PIXELS || bArr.length != j3 * 4) {
            return;
        }
        synchronized (this.images) {
            try {
                long j10 = this.imageBytes;
                if (bArr.length + j10 > 33554432) {
                    return;
                }
                this.imageBytes = j10 + bArr.length;
                try {
                    Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(bArr));
                    synchronized (this.images) {
                        try {
                            if (this.images.put(Integer.valueOf(i7), createBitmap) != null) {
                                this.imageBytes -= r8.getAllocationByteCount();
                            }
                        } finally {
                        }
                    }
                } catch (Throwable th2) {
                    synchronized (this.images) {
                        this.imageBytes -= bArr.length;
                        throw th2;
                    }
                }
            } finally {
            }
        }
    }

    public void deleteFont(int i7) {
        this.fonts.remove(Integer.valueOf(i7));
        this.deviceFonts.remove(Integer.valueOf(i7));
    }

    @Override // org.telegram.utils.twidget.g1
    public Paint deviceFont(int i7) {
        return this.deviceFonts.get(Integer.valueOf(i7));
    }

    @Override // org.telegram.utils.twidget.h
    public Paint font(int i7) {
        return this.fonts.get(Integer.valueOf(i7));
    }

    public byte[] formatIntl(byte[] bArr) {
        return b1.b(text(bArr)).getBytes(StandardCharsets.UTF_8);
    }

    @Override // org.telegram.utils.twidget.g1, org.telegram.utils.twidget.h
    public Bitmap image(int i7) {
        return this.images.get(Integer.valueOf(i7));
    }

    public float[] loadImage(int i7, byte[] bArr) {
        Bitmap decodeImage = decodeImage(text(bArr), imageBytes());
        if (decodeImage == null) {
            return null;
        }
        putImage(i7, decodeImage);
        return new float[]{decodeImage.getWidth(), decodeImage.getHeight()};
    }

    public void record(byte[] bArr, byte[] bArr2, double d, int i7, int i10, float f10, float f11, int i11, int i12) {
        assertWorker();
        synchronized (this.recordLock) {
            recordLocked(bArr, bArr2, d, i7, i10, f10, f11, i11, i12);
        }
    }

    public void recordLayer(int i7, int i10, byte[] bArr) {
        assertWorker();
        long nanoTime = System.nanoTime();
        if (i7 < 0 || i7 >= 256 || bArr.length > MAX_LIST_BYTES) {
            throw new IllegalArgumentException("Layer");
        }
        j b10 = j.b(bArr);
        synchronized (this.recordLock) {
            try {
                long j3 = this.pendingLayerBytes;
                if (bArr.length + j3 > MAX_PENDING_LAYER_BYTES) {
                    clearPendingLayers();
                    throw new IllegalArgumentException("Layers");
                }
                this.pendingLayerBytes = j3 + bArr.length;
                this.pendingLayers.put(Integer.valueOf(i7), b10);
                this.layerParseNanos = (System.nanoTime() - nanoTime) + this.layerParseNanos;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void selectableText(byte[] bArr) {
        v1 v1Var;
        assertWorker();
        String text = text(bArr);
        checkJsonDepth(text);
        try {
            ConcurrentHashMap<Integer, Paint> concurrentHashMap = this.deviceFonts;
            Objects.requireNonNull(concurrentHashMap);
            v1Var = v1.a(text, new q(concurrentHashMap, 4), this.owner.l);
        } catch (Exception unused) {
            v1Var = null;
        }
        synchronized (this.recordLock) {
            this.text = v1Var;
        }
    }

    public p1 session() {
        return this.owner;
    }

    public void signal(final int i7, byte[] bArr) {
        boolean optBoolean;
        JSONObject jSONObject;
        String str;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean isEmpty;
        final String text = text(bArr);
        if (jsonSignal(i7)) {
            checkJsonDepth(text);
        }
        final p1 p1Var = this.owner;
        int i10 = 6;
        try {
            if (i7 == 8) {
                p1Var.getClass();
                if (text == null || text.length() > 98368) {
                    return;
                }
                JSONObject jSONObject2 = new JSONObject(text);
                String optString = jSONObject2.optString("area");
                JSONObject optJSONObject = jSONObject2.optJSONObject("values");
                if ("local".equals(optString) || "session".equals(optString)) {
                    synchronized (p1Var.w) {
                        try {
                            isEmpty = p1Var.w.isEmpty();
                            HashMap hashMap = p1Var.w;
                            if (optJSONObject == null) {
                                optJSONObject = new JSONObject();
                            }
                            hashMap.put(optString, optJSONObject);
                        } finally {
                        }
                    }
                    if (isEmpty) {
                        p1Var.a.post(new j1(p1Var, i10));
                        return;
                    }
                    return;
                }
                return;
            }
            if (i7 == 10) {
                p1Var.getClass();
                return;
            }
            if (p1Var.A) {
                return;
            }
            if (i7 == 12 || i7 == 19) {
                JSONObject jSONObject3 = new JSONObject(text);
                long j3 = jSONObject3.getLong("id");
                if (i7 == 19) {
                    str = null;
                    jSONObject = jSONObject3.getJSONObject("call");
                    optBoolean = false;
                } else {
                    String string = jSONObject3.getString("data");
                    optBoolean = jSONObject3.optBoolean("wallet");
                    jSONObject = null;
                    str = string;
                }
                e0 e0Var = p1Var.d;
                if (i7 == 19 ? e0Var.e(jSONObject.toString(), p1Var.L) : e0Var.d(str, optBoolean, p1Var.L)) {
                    p1Var.a.post(new org.telegram.messenger.voip.p(p1Var, i7, j3, jSONObject, str, optBoolean));
                    return;
                }
                long j10 = p1Var.v;
                if (j10 != 0) {
                    p1Var.c.a(j10, j3, 3, null);
                    return;
                }
                return;
            }
            if (i7 == 13 || i7 == 14) {
                if (i7 == 13) {
                    if (!(text != null && text.length() <= 256) || !p1Var.d.c(p1Var.L)) {
                        return;
                    }
                }
                p1Var.a.post(new Runnable() { // from class: org.telegram.utils.twidget.k1
                    @Override // java.lang.Runnable
                    public final void run() {
                        d1 d1Var;
                        p1 p1Var2 = p1.this;
                        int i11 = i7;
                        String str2 = text;
                        if (p1Var2.A || (d1Var = p1Var2.R) == null) {
                            return;
                        }
                        if (i11 != 13) {
                            boolean equals = "1".equals(str2);
                            if (d1Var.A == equals) {
                                return;
                            }
                            d1Var.A = equals;
                            sa.d dVar = d1Var.e;
                            if (dVar != null) {
                                dVar.getClass();
                                n0.E();
                                return;
                            }
                            return;
                        }
                        if (d1Var.e == null || TextUtils.isEmpty(str2)) {
                            return;
                        }
                        org.telegram.messenger.g0.g(str2);
                        g2 T = org.telegram.messenger.g0.G3() ? LaunchActivity.T() : null;
                        if (T == null) {
                            return;
                        }
                        if (str2.length() > 80) {
                            str2 = str2.substring(0, 80) + "…";
                        }
                        lc.b0(T).Q(R.raw.copy, 36, hd.a0(null, null, 2131742600, str2)).j();
                    }
                });
                return;
            }
            int i11 = 5;
            if (i7 == 11) {
                p1Var.a.post(new g0(i11, p1Var, text));
                return;
            }
            if (i7 == 18) {
                JSONObject jSONObject4 = new JSONObject(text);
                p1Var.S = new float[]{(float) jSONObject4.optDouble("receive"), (float) jSONObject4.optDouble("animate"), (float) jSONObject4.optDouble("paint"), (float) jSONObject4.optDouble("serialize"), 0.0f, 0.0f, (float) jSONObject4.optDouble("ticks"), (float) jSONObject4.optDouble("framesSent"), (float) jSONObject4.optDouble("opsLatency"), (float) jSONObject4.optDouble("validate", -1.0d), (float) jSONObject4.optDouble("hop", -1.0d)};
                return;
            }
            int i12 = 7;
            if (i7 != 16 && i7 != 17 && i7 != 9) {
                if (i7 == 3) {
                    JSONObject jSONObject5 = new JSONObject(text);
                    p1Var.a.post(new cz(p1Var, jSONObject5.optBoolean("x"), jSONObject5.optBoolean("y"), jSONObject5.optBoolean("hold"), 2));
                    return;
                }
                if (i7 == 4) {
                    JSONObject jSONObject6 = new JSONObject(text);
                    if (jSONObject6.optBoolean("loaded")) {
                        p1Var.B = true;
                    }
                    p1Var.G = "bottom".equals(jSONObject6.optString("resizeAnchor"));
                    if (jSONObject6.optBoolean("rendered") && !p1Var.E) {
                        double optDouble = jSONObject6.optDouble("height", -1.0d);
                        double min = Math.min(600.0f, Math.max(50.0f, p1Var.t / p1Var.l));
                        if (p1Var.u && optDouble > 0.0d && Math.abs(min - optDouble) <= 1.0d) {
                            p1Var.F = true;
                            if (p1Var.D == 0) {
                                p1Var.D = SystemClock.uptimeMillis();
                            }
                        }
                        p1Var.E = true;
                    }
                    synchronized (p1Var.s) {
                        try {
                            if (p1Var.A) {
                                return;
                            }
                            p1Var.P = jSONObject6;
                            if (!p1Var.Q) {
                                p1Var.Q = true;
                                p1Var.a.post(p1Var.V);
                            }
                            return;
                        } finally {
                        }
                    }
                }
                if (i7 == 5) {
                    JSONObject jSONObject7 = new JSONObject(text);
                    String optString2 = jSONObject7.optString("kind");
                    if ("openLink".equals(optString2) || "openTelegramLink".equals(optString2)) {
                        String optString3 = jSONObject7.optString("url");
                        boolean equals = "openTelegramLink".equals(optString2);
                        if (optString3 != null && optString3.length() <= 256 && optString3.length() >= 9 && optString3.regionMatches(true, 0, "https://", 0, 8)) {
                            int i13 = 8;
                            while (i13 < optString3.length() && "/?#".indexOf(optString3.charAt(i13)) < 0) {
                                i13++;
                            }
                            String substring = optString3.substring(8, i13);
                            if (substring.indexOf(64) < 0) {
                                int indexOf = substring.indexOf(58);
                                if (indexOf >= 0) {
                                    substring = substring.substring(0, indexOf);
                                }
                                if (!substring.isEmpty() && substring.length() <= 253) {
                                    String[] split = substring.split("\\.", -1);
                                    int length = split.length;
                                    int i14 = 0;
                                    loop1: while (true) {
                                        if (i14 < length) {
                                            String str2 = split[i14];
                                            if (str2.isEmpty() || str2.length() > 63) {
                                                break;
                                            }
                                            z10 = false;
                                            if (str2.charAt(0) == '-' || str2.charAt(str2.length() - 1) == '-') {
                                                break;
                                            }
                                            for (int i15 = 0; i15 < str2.length(); i15++) {
                                                char charAt = str2.charAt(i15);
                                                if ((charAt < 'a' || charAt > 'z') && ((charAt < '0' || charAt > '9') && charAt != '-')) {
                                                    break loop1;
                                                }
                                            }
                                            i14++;
                                        } else {
                                            z10 = false;
                                            String[] strArr = e0.m;
                                            boolean z14 = false;
                                            for (int i16 = 0; i16 < 3; i16++) {
                                                String str3 = strArr[i16];
                                                if (!substring.equals(str3)) {
                                                    if (!substring.endsWith("." + str3)) {
                                                        z13 = false;
                                                        z14 |= z13;
                                                    }
                                                }
                                                z13 = true;
                                                z14 |= z13;
                                            }
                                            if (z14 == equals && p1Var.d.c(p1Var.L)) {
                                                z11 = true;
                                            }
                                        }
                                    }
                                }
                                z10 = false;
                                z11 = z10;
                                z12 = z11;
                            }
                        }
                        z10 = false;
                        z11 = z10;
                        z12 = z11;
                    } else {
                        z12 = "haptic".equals(optString2) ? p1Var.d.a(p1Var.L) : "ready".equals(optString2);
                    }
                    if (z12) {
                        p1Var.a.post(new g0(i12, p1Var, jSONObject7));
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    public void state(int i7, float f10) {
        p1 p1Var = this.owner;
        if (p1Var.A) {
            return;
        }
        if ((i7 & 8) != 0 && f10 == f10) {
            p1Var.q.set(f10 == 0.0f);
            p1Var.x = f10;
            if (p1Var.y.compareAndSet(false, true)) {
                p1Var.a.post(new j1(p1Var, 5));
            }
        }
        if ((i7 & 4) != 0) {
            p1Var.o.set(false);
        }
        if ((i7 & 2) != 0) {
            p1Var.n.set(true);
        }
        if ((i7 & 6) != 0) {
            p1Var.a.removeCallbacks(p1Var.W);
            p1Var.a.post(p1Var.W);
        }
        if ((i7 & 1) != 0) {
            p1Var.p.set(true);
            p1Var.a.post(p1Var.d0);
        }
    }

    public float textWidth(int i7, byte[] bArr) {
        Paint paint = this.deviceFonts.get(Integer.valueOf(i7));
        if (paint == null) {
            return 0.0f;
        }
        return paint.measureText(text(bArr)) / this.owner.l;
    }
}
