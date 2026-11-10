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
import android.os.RemoteException;
import android.os.SystemClock;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Base64;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.ByteArrayOutputStream;
import java.net.URLDecoder;
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
import org.telegram.messenger.id;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.py;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
final class WidgetSandboxBackend implements y0, g {
    private static final int MAX_CANVAS_WORDS = 2097152;
    private static final int MAX_DISPLAY_OPS = 200000;
    private static final int MAX_FONTS = 4096;
    private static final int MAX_FRAMES_PER_SECOND = 240;
    static final long MAX_IMAGE_BYTES = 33554432;
    static final long MAX_IMAGE_PIXELS = 4194304;
    private static final int MAX_LAYERS = 256;
    private static final long MAX_LIST_BYTES = 8388608;
    private static final long MEMORY_BUDGET = 33554432;
    private long imageBytes;
    private long layerParseNanos;
    private int nextFont;
    private int nextRecord;
    private final i1 owner;
    private n1 text;
    private final long[] recordTimes = new long[240];
    private final ConcurrentHashMap<Integer, Paint> fonts = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<Integer, Paint> deviceFonts = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<Integer, Bitmap> images = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<Integer, h> canvases = new ConcurrentHashMap<>();
    private final HashMap<Integer, i> pendingLayers = new HashMap<>();
    private HashMap<Long, s0> layerContents = new HashMap<>();
    private final z0 painter = new z0();

    public WidgetSandboxBackend(i1 i1Var) {
        this.owner = i1Var;
    }

    private static void assertWorker() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Native layout and recording must run off UI");
        }
    }

    private void checkCanvasSize(int i7, int i10, int i11) {
        long j3 = i10 * i11;
        if (j3 > MAX_IMAGE_PIXELS) {
            throw new IllegalArgumentException("Canvas dimensions");
        }
        long j10 = (j3 * 8) + this.imageBytes;
        for (Map.Entry<Integer, h> entry : this.canvases.entrySet()) {
            if (entry.getKey().intValue() != i7) {
                j10 += entry.getValue().o == null ? 0L : r4.getWidth() * r3.o.getHeight() * 8;
            }
        }
        if (j10 > 33554432) {
            throw new IllegalArgumentException("Canvas memory budget");
        }
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
        int a10;
        int i13;
        int i14;
        byte[] bArr2;
        boolean z9;
        int i15;
        long a11;
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
            byte[] bArr3 = k.a;
            int length = decode.length;
            if (length >= 33) {
                int i17 = 0;
                while (true) {
                    if (i17 < 8) {
                        if (decode[i17] != bArr3[i17]) {
                            break;
                        }
                        i17++;
                    } else if (k.c(12, "IHDR", decode) && k.a(8, decode) >= 13) {
                        long a12 = k.a(16, decode);
                        long a13 = k.a(20, decode);
                        int i18 = decode[24] & 255;
                        int i19 = decode[25] & 255;
                        int i20 = decode[28] & 255;
                        if (i19 != 0) {
                            i10 = 3;
                            if (i19 != 3) {
                                if (i19 != 2) {
                                    i10 = i19 == 4 ? 2 : i19 == 6 ? 4 : 0;
                                }
                                if (i10 != 0 && i20 == 0 && a12 > 0 && a13 > 0 && a12 * a13 <= MAX_IMAGE_PIXELS) {
                                    CRC32 crc322 = new CRC32();
                                    i11 = 8;
                                    while (true) {
                                        str2 = "IEND";
                                        j10 = a13;
                                        if (i11 + 12 <= length) {
                                            j11 = a12;
                                            break;
                                        }
                                        a11 = k.a(i11, decode);
                                        j11 = a12;
                                        if (a11 <= (length - i11) - 12) {
                                            int i21 = i11 + 4;
                                            if (k.c(i21, "IEND", decode)) {
                                                break;
                                            }
                                            if (k.c(i21, "IDAT", decode)) {
                                                crc322.reset();
                                                int i22 = (int) a11;
                                                crc322.update(decode, i21, i22 + 4);
                                                if (crc322.getValue() != k.a(i11 + 8 + i22, decode)) {
                                                    break;
                                                }
                                            }
                                            i11 += ((int) a11) + 12;
                                            a13 = j10;
                                            a12 = j11;
                                        } else {
                                            break;
                                        }
                                    }
                                    int i23 = (int) (((((j11 * i10) * i18) + 7) / 8) + 1);
                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                    Inflater inflater2 = new Inflater(true);
                                    bArr = new byte[TLObject.FLAG_14];
                                    boolean z10 = true;
                                    long j13 = 0;
                                    i12 = 8;
                                    while (i12 + 12 <= length && j13 < j10) {
                                        byte[] bArr4 = bArr;
                                        try {
                                            a10 = (int) k.a(i12, decode);
                                            if (a10 <= (length - i12) - 12) {
                                                break;
                                            }
                                            int i24 = i12 + 4;
                                            if (k.c(i24, str2, decode)) {
                                                break;
                                            }
                                            if (k.c(i24, "IDAT", decode)) {
                                                int min = z10 ? Math.min(2, a10) : 0;
                                                inflater2.setInput(decode, i12 + 8 + min, a10 - min);
                                                boolean z11 = false;
                                                while (!inflater2.needsInput() && !inflater2.finished() && !z11) {
                                                    i13 = length;
                                                    bArr2 = bArr4;
                                                    try {
                                                        int inflate = inflater2.inflate(bArr2);
                                                        if (inflate == 0 && inflater2.needsDictionary()) {
                                                            crc32 = crc322;
                                                            str3 = str2;
                                                            z9 = z11;
                                                            inflater = inflater2;
                                                            i14 = a10;
                                                            break;
                                                        }
                                                        boolean z12 = z11;
                                                        byteArrayOutputStream.write(bArr2, 0, inflate);
                                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                                        while (true) {
                                                            if (j13 >= j10) {
                                                                crc32 = crc322;
                                                                str3 = str2;
                                                                i15 = inflate;
                                                                inflater = inflater2;
                                                                i14 = a10;
                                                                break;
                                                            }
                                                            inflater = inflater2;
                                                            i14 = a10;
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
                                                                    z11 = true;
                                                                    break;
                                                                }
                                                                if (j15 + j14 > byteArray.length) {
                                                                    break;
                                                                }
                                                                j13++;
                                                                inflater2 = inflater;
                                                                a10 = i14;
                                                                inflate = i15;
                                                                crc322 = crc32;
                                                                str2 = str3;
                                                            } catch (Throwable th2) {
                                                                th = th2;
                                                                inflater.end();
                                                                throw th;
                                                            }
                                                        }
                                                        z11 = z12;
                                                        if (i15 == 0) {
                                                            break;
                                                        }
                                                        bArr4 = bArr2;
                                                        length = i13;
                                                        inflater2 = inflater;
                                                        a10 = i14;
                                                        crc322 = crc32;
                                                        str2 = str3;
                                                    } catch (DataFormatException unused) {
                                                        crc32 = crc322;
                                                        str3 = str2;
                                                        inflater = inflater2;
                                                        i14 = a10;
                                                        z11 = true;
                                                    }
                                                }
                                                crc32 = crc322;
                                                str3 = str2;
                                                i13 = length;
                                                inflater = inflater2;
                                                i14 = a10;
                                                bArr2 = bArr4;
                                                z9 = z11;
                                                z11 = z9;
                                                if (z11) {
                                                    break;
                                                }
                                                bArr4 = bArr2;
                                                z10 = false;
                                            } else {
                                                crc32 = crc322;
                                                str3 = str2;
                                                i13 = length;
                                                inflater = inflater2;
                                                i14 = a10;
                                                if (byteArrayOutputStream.size() == 0 && !k.c(i24, "IHDR", decode)) {
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
                                            k.b(bArr6, 4, j12);
                                            CRC32 crc323 = crc32;
                                            k.d(byteArrayOutputStream3, "IHDR", bArr6, crc323);
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
                                            k.d(byteArrayOutputStream3, "IDAT", byteArrayOutputStream4.toByteArray(), crc323);
                                            k.d(byteArrayOutputStream3, str3, new byte[0], crc323);
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
                                j10 = a13;
                                if (i11 + 12 <= length) {
                                }
                                i11 += ((int) a11) + 12;
                                a13 = j10;
                                a12 = j11;
                            }
                            int i232 = (int) (((((j11 * i10) * i18) + 7) / 8) + 1);
                            ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                            ByteArrayOutputStream byteArrayOutputStream22 = new ByteArrayOutputStream();
                            Inflater inflater22 = new Inflater(true);
                            bArr = new byte[TLObject.FLAG_14];
                            boolean z102 = true;
                            long j132 = 0;
                            i12 = 8;
                            while (i12 + 12 <= length) {
                                byte[] bArr42 = bArr;
                                a10 = (int) k.a(i12, decode);
                                if (a10 <= (length - i12) - 12) {
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

    private h1[] layers(JSONObject jSONObject, float f10) {
        int i7;
        JSONArray jSONArray;
        int i10;
        long j3;
        float[] fArr;
        float[] fArr2;
        int i11;
        int i12;
        c0 b0Var;
        JSONArray optJSONArray = jSONObject.optJSONArray("l");
        int i13 = 0;
        int length = optJSONArray == null ? 0 : optJSONArray.length();
        HashMap<Long, s0> hashMap = new HashMap<>();
        h1[] h1VarArr = new h1[length];
        int i14 = 0;
        int i15 = 0;
        while (i14 < length) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i14);
            if (optJSONObject != null) {
                long optLong = optJSONObject.optLong("id");
                long optLong2 = optJSONObject.optLong("cv");
                JSONArray optJSONArray2 = optJSONObject.optJSONArray("b");
                if (optJSONArray2 != null) {
                    double optDouble = optJSONArray2.optDouble(i13);
                    i7 = length;
                    double d = f10;
                    jSONArray = optJSONArray;
                    int floor = (int) Math.floor(optDouble * d);
                    int floor2 = (int) Math.floor(optJSONArray2.optDouble(1) * d);
                    int ceil = (int) Math.ceil((optJSONArray2.optDouble(2) + optJSONArray2.optDouble(0)) * d);
                    int ceil2 = (int) Math.ceil((optJSONArray2.optDouble(3) + optJSONArray2.optDouble(1)) * d);
                    s0 s0Var = this.layerContents.get(Long.valueOf(optLong));
                    i iVar = this.pendingLayers.get(Integer.valueOf(i14));
                    if (iVar != null) {
                        if (Build.VERSION.SDK_INT >= 29) {
                            c0 a0Var = new a0("widget-sandbox-layer", floor, floor2, ceil, ceil2);
                            i12 = floor;
                            i11 = floor2;
                            i10 = i14;
                            j3 = optLong;
                            b0Var = a0Var;
                        } else {
                            i10 = i14;
                            j3 = optLong;
                            i11 = floor2;
                            i12 = floor;
                            b0Var = new b0(i12, i11, ceil, ceil2);
                        }
                        Canvas a10 = b0Var.a();
                        try {
                            a10.translate(-i12, -i11);
                            a10.scale(f10, f10);
                            this.painter.e(a10, iVar, this, f10);
                            b0Var.d();
                            s0Var = new s0(b0Var, (int) optLong2);
                        } catch (Throwable th2) {
                            b0Var.d();
                            throw th2;
                        }
                    } else {
                        i10 = i14;
                        j3 = optLong;
                        if (s0Var != null) {
                            if (s0Var.b != ((int) optLong2)) {
                            }
                        }
                        i14 = i10 + 1;
                        length = i7;
                        optJSONArray = jSONArray;
                        i13 = 0;
                    }
                    hashMap.put(Long.valueOf(j3), s0Var);
                    JSONArray optJSONArray3 = optJSONObject.optJSONArray("l");
                    float[] fArr3 = null;
                    if (optJSONArray3 != null) {
                        float[] fArr4 = new float[4];
                        z0.c(optJSONArray3, fArr4, 4, new float[0]);
                        JSONArray optJSONArray4 = optJSONObject.optJSONArray("q");
                        if (optJSONArray4 != null) {
                            fArr3 = new float[8];
                            z0.c(optJSONArray4, fArr3, 8, new float[0]);
                        }
                        fArr2 = fArr3;
                        fArr = fArr4;
                    } else {
                        fArr = null;
                        fArr2 = null;
                    }
                    JSONArray optJSONArray5 = optJSONObject.optJSONArray("k");
                    int length2 = optJSONArray5 == null ? 0 : (optJSONArray5.length() / 8) * 8;
                    float[] fArr5 = new float[length2];
                    z0.c(optJSONArray5, fArr5, length2, new float[0]);
                    int i16 = i15 + 1;
                    h1VarArr[i15] = new h1(s0Var.a, fArr, fArr2, optJSONObject.optDouble("ts"), optJSONObject.optDouble("td"), optJSONObject.optInt("tr") != 0, fArr5);
                    i15 = i16;
                    i14 = i10 + 1;
                    length = i7;
                    optJSONArray = jSONArray;
                    i13 = 0;
                }
            }
            jSONArray = optJSONArray;
            i7 = length;
            i10 = i14;
            i14 = i10 + 1;
            length = i7;
            optJSONArray = jSONArray;
            i13 = 0;
        }
        int i17 = length;
        this.layerContents = hashMap;
        if (i15 == i17) {
            return h1VarArr;
        }
        h1[] h1VarArr2 = new h1[i15];
        System.arraycopy(h1VarArr, 0, h1VarArr2, 0, i15);
        return h1VarArr2;
    }

    public static float[] metrics(int i7, Paint paint, float f10, Rect rect) {
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        paint.getTextBounds("x", 0, 1, rect);
        float f11 = fontMetrics.ascent;
        float f12 = fontMetrics.descent;
        return new float[]{i7, (-f11) / f10, f12 / f10, ((f12 - f11) + fontMetrics.leading) / f10, rect.height() / f10, paint.measureText("0") / f10};
    }

    public static Paint[] paints(String str, float f10, int i7, boolean z9, String str2, float f11) {
        if (f10 <= 0.0f || f10 > 10000.0f) {
            f10 = 16.0f;
        }
        Paint paint = new Paint(qs.N1);
        paint.setTextSize(f10);
        paint.setTypeface(typeface(str, i7, z9));
        String featureSettings = featureSettings(str2);
        if (featureSettings != null) {
            paint.setFontFeatureSettings(featureSettings);
        }
        Paint paint2 = new Paint(paint);
        paint2.setTextSize(f10 * f11);
        return new Paint[]{paint, paint2};
    }

    private void putImage(int i7, Bitmap bitmap) {
        Bitmap put = this.images.put(Integer.valueOf(i7), bitmap);
        long allocationByteCount = this.imageBytes + bitmap.getAllocationByteCount();
        this.imageBytes = allocationByteCount;
        if (put != null) {
            this.imageBytes = allocationByteCount - put.getAllocationByteCount();
        }
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
    public static Typeface typeface(String str, int i7, boolean z9) {
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
            return Typeface.create(typeface2, Math.max(1, Math.min(1000, i7)), z9);
        }
        return Typeface.create(typeface2, (i7 < 600 ? 0 : 1) | (z9 ? 2 : 0));
    }

    @Override // org.telegram.utils.twidget.y0
    public Bitmap canvas(int i7) {
        h hVar = this.canvases.get(Integer.valueOf(i7));
        if (hVar == null) {
            return null;
        }
        synchronized (hVar) {
            try {
                Bitmap bitmap = hVar.o;
                if (bitmap == null) {
                    return null;
                }
                if (hVar.s == hVar.r) {
                    if (hVar.p == null) {
                    }
                    return hVar.p;
                }
                hVar.p = bitmap.copy(Bitmap.Config.ARGB_8888, false);
                hVar.s = hVar.r;
                return hVar.p;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.telegram.utils.twidget.g
    public Bitmap canvasBitmap(int i7) {
        h hVar = this.canvases.get(Integer.valueOf(i7));
        if (hVar == null) {
            return null;
        }
        return hVar.o;
    }

    public byte[] canvasRead(int i7, int i10, int i11, int i12, int i13) {
        int i14 = i10;
        assertWorker();
        if (i12 <= 0 || i13 <= 0 || i12 * i13 > MAX_IMAGE_PIXELS) {
            return null;
        }
        h hVar = this.canvases.get(Integer.valueOf(i7));
        if (hVar == null) {
            return new byte[i12 * i13 * 4];
        }
        byte[] bArr = new byte[Math.max(i13, 0) * Math.max(i12, 0) * 4];
        if (hVar.o != null) {
            int max = Math.max(0, i14);
            int max2 = Math.max(0, i11);
            int min = Math.min(hVar.o.getWidth(), i14 + i12);
            int min2 = Math.min(hVar.o.getHeight(), i13 + i11);
            if (min > max && min2 > max2) {
                int i15 = min - max;
                int i16 = min2 - max2;
                int[] iArr = new int[i15 * i16];
                hVar.o.getPixels(iArr, 0, i15, max, max2, i15, i16);
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
            }
        }
        return bArr;
    }

    public void canvasRelease(int i7) {
        assertWorker();
        h remove = this.canvases.remove(Integer.valueOf(i7));
        if (remove != null) {
            synchronized (remove) {
                try {
                    Bitmap bitmap = remove.o;
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                    remove.o = null;
                    remove.q = null;
                    remove.p = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0065 A[Catch: all -> 0x0041, LOOP:0: B:19:0x0060->B:21:0x0065, LOOP_END, TryCatch #0 {all -> 0x0041, blocks: (B:11:0x002e, B:13:0x0032, B:15:0x0038, B:18:0x005b, B:19:0x0060, B:21:0x0065, B:23:0x0069, B:28:0x0043, B:30:0x0047, B:31:0x004a), top: B:10:0x002e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void canvasRun(int i7, int i10, int i11, int[] iArr) {
        assertWorker();
        if (i10 <= 0 || i11 <= 0) {
            canvasRelease(i7);
            return;
        }
        checkCanvasSize(i7, i10, i11);
        if (iArr.length > 2097152) {
            throw new IllegalArgumentException("Canvas batch");
        }
        h hVar = this.canvases.get(Integer.valueOf(i7));
        if (hVar == null) {
            hVar = new h(i7);
            this.canvases.put(Integer.valueOf(i7), hVar);
        }
        synchronized (hVar) {
            try {
                Bitmap bitmap = hVar.o;
                if (bitmap != null) {
                    if (bitmap.getWidth() == i10) {
                        if (hVar.o.getHeight() != i11) {
                        }
                        hVar.t = iArr;
                        hVar.u = 0;
                        while (hVar.u < iArr.length) {
                            hVar.g(this);
                        }
                        hVar.t = null;
                        hVar.r++;
                    }
                }
                Bitmap bitmap2 = hVar.o;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                hVar.o = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                hVar.q = new Canvas(hVar.o);
                hVar.t = iArr;
                hVar.u = 0;
                while (hVar.u < iArr.length) {
                }
                hVar.t = null;
                hVar.r++;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public float[] createFont(byte[] bArr, float f10, int i7, boolean z9, byte[] bArr2) {
        assertWorker();
        int i10 = this.nextFont + 1;
        this.nextFont = i10;
        return defineFont(i10, bArr, f10, i7, z9, bArr2);
    }

    public float[] defineFont(int i7, byte[] bArr, float f10, int i10, boolean z9, byte[] bArr2) {
        if (this.fonts.size() >= 4096 && !this.fonts.containsKey(Integer.valueOf(i7))) {
            throw new IllegalArgumentException("Too many fonts");
        }
        Paint[] paints = paints(text(bArr), f10, i10, z9, text(bArr2), this.owner.l);
        this.fonts.put(Integer.valueOf(i7), paints[0]);
        this.deviceFonts.put(Integer.valueOf(i7), paints[1]);
        return metrics(i7, paints[1], this.owner.l, new Rect());
    }

    public void defineImage(int i7, Bitmap bitmap) {
        if (bitmap == null || bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0 || bitmap.getWidth() * bitmap.getHeight() > MAX_IMAGE_PIXELS || this.imageBytes + bitmap.getAllocationByteCount() > 33554432) {
            return;
        }
        putImage(i7, bitmap);
    }

    public void deleteFont(int i7) {
        this.fonts.remove(Integer.valueOf(i7));
        this.deviceFonts.remove(Integer.valueOf(i7));
    }

    @Override // org.telegram.utils.twidget.y0
    public Paint deviceFont(int i7) {
        return this.deviceFonts.get(Integer.valueOf(i7));
    }

    @Override // org.telegram.utils.twidget.g
    public Paint font(int i7) {
        return this.fonts.get(Integer.valueOf(i7));
    }

    public byte[] formatIntl(byte[] bArr) {
        return t0.b(text(bArr)).getBytes(StandardCharsets.UTF_8);
    }

    @Override // org.telegram.utils.twidget.y0, org.telegram.utils.twidget.g
    public Bitmap image(int i7) {
        return this.images.get(Integer.valueOf(i7));
    }

    public float[] loadImage(int i7, byte[] bArr) {
        Bitmap decodeImage = decodeImage(text(bArr), this.imageBytes);
        if (decodeImage == null) {
            return null;
        }
        putImage(i7, decodeImage);
        return new float[]{decodeImage.getWidth(), decodeImage.getHeight()};
    }

    public void record(byte[] bArr, byte[] bArr2, double d, int i7, int i10, float f10, float f11, int i11, int i12) {
        c0 b0Var;
        int i13;
        int i14;
        assertWorker();
        if (bArr.length > MAX_LIST_BYTES) {
            this.pendingLayers.clear();
            throw new IllegalArgumentException("Display list");
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long[] jArr = this.recordTimes;
        int i15 = this.nextRecord;
        if (elapsedRealtime - jArr[i15] < 1000) {
            this.pendingLayers.clear();
            this.layerParseNanos = 0L;
            return;
        }
        jArr[i15] = elapsedRealtime;
        this.nextRecord = (i15 + 1) % jArr.length;
        this.owner.getClass();
        this.owner.getClass();
        Trace.beginSection("WidgetSandbox:Record");
        double nanoTime = d - (System.nanoTime() / 1.0E9d);
        if (Build.VERSION.SDK_INT >= 29) {
            b0Var = new a0("widget-sandbox-content", 0, 0, i7, i10);
            i13 = i7;
            i14 = i10;
        } else {
            i13 = i7;
            i14 = i10;
            b0Var = new b0(0, 0, i13, i14);
        }
        c0 c0Var = b0Var;
        try {
            try {
                i b10 = i.b(bArr);
                JSONObject jSONObject = new JSONObject(text(bArr2));
                System.nanoTime();
                Canvas a10 = c0Var.a();
                try {
                    a10.scale(f10, f10);
                    this.painter.e(a10, b10, this, f10);
                    c0Var.d();
                    h1[] layers = layers(jSONObject, f10);
                    i1 i1Var = this.owner;
                    System.nanoTime();
                    i1Var.getClass();
                    this.owner.b(c0Var, layers, nanoTime, i13, i14, f11, (System.nanoTime() - r3) / 1000000.0f, i11, i12, b10.b, this.text);
                } catch (Throwable th2) {
                    c0Var.d();
                    throw th2;
                }
            } finally {
                this.pendingLayers.clear();
                this.layerParseNanos = 0L;
                Trace.endSection();
            }
        } catch (Exception e10) {
            c0Var.b();
            throw e10;
        }
    }

    public void recordLayer(int i7, int i10, byte[] bArr) {
        assertWorker();
        long nanoTime = System.nanoTime();
        if (i7 < 0 || i7 >= 256 || bArr.length > MAX_LIST_BYTES) {
            throw new IllegalArgumentException("Layer");
        }
        this.pendingLayers.put(Integer.valueOf(i7), i.b(bArr));
        this.layerParseNanos = (System.nanoTime() - nanoTime) + this.layerParseNanos;
    }

    public void selectableText(byte[] bArr) {
        assertWorker();
        try {
            String text = text(bArr);
            ConcurrentHashMap<Integer, Paint> concurrentHashMap = this.deviceFonts;
            Objects.requireNonNull(concurrentHashMap);
            this.text = n1.a(text, new o(concurrentHashMap), this.owner.l);
        } catch (Exception unused) {
            this.text = null;
        }
    }

    public i1 session() {
        return this.owner;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void signal(final int i7, byte[] bArr) {
        JSONObject jSONObject;
        boolean z9;
        String str;
        boolean z10;
        final i1 i1Var = this.owner;
        final String text = text(bArr);
        i1Var.getClass();
        if (i7 == 8) {
            if (text == null || text.length() > 98368) {
                return;
            }
            final int i10 = 0;
            i1Var.a.post(new Runnable() { // from class: org.telegram.utils.twidget.d1
                @Override // java.lang.Runnable
                public final void run() {
                    v0 v0Var;
                    p71 p71Var;
                    switch (i10) {
                        case 0:
                            i1 i1Var2 = i1Var;
                            String str2 = text;
                            if (i1Var2.M != null) {
                                try {
                                    JSONObject jSONObject2 = new JSONObject(str2);
                                    JSONObject optJSONObject = jSONObject2.optJSONObject("values");
                                    v0 v0Var2 = i1Var2.M;
                                    String optString = jSONObject2.optString("area");
                                    if (optJSONObject == null) {
                                        optJSONObject = new JSONObject();
                                    }
                                    v0Var2.i(optString, optJSONObject);
                                    break;
                                } catch (Exception unused) {
                                    return;
                                }
                            }
                            break;
                        default:
                            i1 i1Var3 = i1Var;
                            String str3 = text;
                            if (!i1Var3.w && (v0Var = i1Var3.L) != null && (p71Var = v0Var.h) != null) {
                                if (p71Var.F || (p71Var.w && p71Var.E)) {
                                    p71Var.a.f(str3);
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
            return;
        }
        if (i7 == 10 || i1Var.w) {
            return;
        }
        try {
            if (i7 == 12 || i7 == 19) {
                JSONObject jSONObject2 = new JSONObject(text);
                long j3 = jSONObject2.getLong("id");
                if (i7 == 19) {
                    jSONObject = jSONObject2.getJSONObject("call");
                    z9 = false;
                    str = null;
                } else {
                    String string = jSONObject2.getString("data");
                    boolean optBoolean = jSONObject2.optBoolean("wallet");
                    jSONObject = null;
                    z9 = optBoolean;
                    str = string;
                }
                if (i7 == 19 ? i1Var.d.e(jSONObject.toString(), i1Var.F) : i1Var.d.d(str, z9, i1Var.F)) {
                    i1Var.a.post(new ni.b(i1Var, i7, j3, jSONObject, str, z9));
                    return;
                }
                long j10 = i1Var.v;
                if (j10 != 0) {
                    o0 o0Var = (o0) i1Var.c.e.get(Long.valueOf(j10));
                    b h12 = o0Var != null ? o0Var.h1() : null;
                    if (h12 == null) {
                        return;
                    }
                    h12.u(o0Var.d, j3, 3, null);
                    return;
                }
                return;
            }
            if (i7 == 13 || i7 == 14) {
                if (i7 == 13) {
                    if (text != null && text.length() <= 256) {
                        r6 = true;
                    }
                    if (!r6 || !i1Var.d.c(i1Var.F)) {
                        return;
                    }
                }
                i1Var.a.post(new Runnable() { // from class: org.telegram.utils.twidget.e1
                    @Override // java.lang.Runnable
                    public final void run() {
                        v0 v0Var;
                        i1 i1Var2 = i1Var;
                        int i11 = i7;
                        String str2 = text;
                        if (i1Var2.w || (v0Var = i1Var2.L) == null) {
                            return;
                        }
                        if (i11 != 13) {
                            boolean equals = "1".equals(str2);
                            if (v0Var.A == equals) {
                                return;
                            }
                            v0Var.A = equals;
                            if (v0Var.e != null) {
                                n0.E();
                                return;
                            }
                            return;
                        }
                        if (v0Var.e == null || TextUtils.isEmpty(str2)) {
                            return;
                        }
                        org.telegram.messenger.g0.g(str2);
                        f2 T = org.telegram.messenger.g0.I3() ? LaunchActivity.T() : null;
                        if (T == null) {
                            return;
                        }
                        if (str2.length() > 80) {
                            str2 = str2.substring(0, 80) + "…";
                        }
                        gc.a0(T).Q(R.raw.copy, 36, id.a0(null, null, 2131742866, str2)).j();
                    }
                });
                return;
            }
            if (i7 == 11) {
                final int i11 = 1;
                i1Var.a.post(new Runnable() { // from class: org.telegram.utils.twidget.d1
                    @Override // java.lang.Runnable
                    public final void run() {
                        v0 v0Var;
                        p71 p71Var;
                        switch (i11) {
                            case 0:
                                i1 i1Var2 = i1Var;
                                String str2 = text;
                                if (i1Var2.M != null) {
                                    try {
                                        JSONObject jSONObject22 = new JSONObject(str2);
                                        JSONObject optJSONObject = jSONObject22.optJSONObject("values");
                                        v0 v0Var2 = i1Var2.M;
                                        String optString = jSONObject22.optString("area");
                                        if (optJSONObject == null) {
                                            optJSONObject = new JSONObject();
                                        }
                                        v0Var2.i(optString, optJSONObject);
                                        break;
                                    } catch (Exception unused) {
                                        return;
                                    }
                                }
                                break;
                            default:
                                i1 i1Var3 = i1Var;
                                String str3 = text;
                                if (!i1Var3.w && (v0Var = i1Var3.L) != null && (p71Var = v0Var.h) != null) {
                                    if (p71Var.F || (p71Var.w && p71Var.E)) {
                                        p71Var.a.f(str3);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                return;
            }
            if (i7 == 18) {
                JSONObject jSONObject3 = new JSONObject(text);
                jSONObject3.optDouble("receive");
                jSONObject3.optDouble("animate");
                jSONObject3.optDouble("paint");
                jSONObject3.optDouble("serialize");
                jSONObject3.optDouble("ticks");
                jSONObject3.optDouble("framesSent");
                jSONObject3.optDouble("opsLatency");
                jSONObject3.optDouble("validate", -1.0d);
                jSONObject3.optDouble("hop", -1.0d);
                return;
            }
            if (i7 == 16 || i7 == 17 || i7 == 9) {
                return;
            }
            if (i7 == 6) {
                i1Var.o.set(false);
                i1Var.a.post(i1Var.P);
                return;
            }
            if (i7 == 1) {
                i1Var.p.set(true);
                i1Var.a.post(i1Var.T);
                return;
            }
            if (i7 == 2) {
                i1Var.n.set(true);
                i1Var.a.removeCallbacks(i1Var.P);
                i1Var.a.post(i1Var.P);
                return;
            }
            if (i7 == 3) {
                JSONObject jSONObject4 = new JSONObject(text);
                i1Var.a.post(new py(i1Var, jSONObject4.optBoolean("x"), jSONObject4.optBoolean("y"), jSONObject4.optBoolean("hold"), 2));
                return;
            }
            if (i7 == 4) {
                JSONObject jSONObject5 = new JSONObject(text);
                if (jSONObject5.optBoolean("loaded")) {
                    i1Var.x = true;
                }
                i1Var.A = "bottom".equals(jSONObject5.optString("resizeAnchor"));
                if (jSONObject5.optBoolean("rendered") && !i1Var.y) {
                    double optDouble = jSONObject5.optDouble("height", -1.0d);
                    double min = Math.min(600.0f, Math.max(50.0f, i1Var.t / i1Var.l));
                    if (i1Var.u && optDouble > 0.0d && Math.abs(min - optDouble) <= 1.0d) {
                        i1Var.z = true;
                    }
                    i1Var.y = true;
                }
                synchronized (i1Var.s) {
                    try {
                        if (i1Var.w) {
                            return;
                        }
                        i1Var.J = jSONObject5;
                        if (!i1Var.K) {
                            i1Var.K = true;
                            i1Var.a.post(i1Var.O);
                        }
                        return;
                    } finally {
                    }
                }
            }
            if (i7 != 5) {
                if (i7 == 7) {
                    float parseFloat = Float.parseFloat(text);
                    i1Var.q.set(parseFloat == 0.0f);
                    i1Var.a.post(new org.telegram.ui.b0(i1Var, parseFloat, 4));
                    return;
                }
                return;
            }
            JSONObject jSONObject6 = new JSONObject(text);
            String optString = jSONObject6.optString("kind");
            if ("openLink".equals(optString) || "openTelegramLink".equals(optString)) {
                String optString2 = jSONObject6.optString("url");
                boolean equals = "openTelegramLink".equals(optString);
                if (optString2 != null && optString2.length() <= 256 && optString2.length() >= 9 && optString2.regionMatches(true, 0, "https://", 0, 8)) {
                    int i12 = 8;
                    while (i12 < optString2.length() && "/?#".indexOf(optString2.charAt(i12)) < 0) {
                        i12++;
                    }
                    String substring = optString2.substring(8, i12);
                    if (substring.indexOf(64) < 0) {
                        int indexOf = substring.indexOf(58);
                        if (indexOf >= 0) {
                            substring = substring.substring(0, indexOf);
                        }
                        if (!substring.isEmpty() && substring.length() <= 253) {
                            String[] split = substring.split("\\.", -1);
                            int length = split.length;
                            int i13 = 0;
                            loop1: while (true) {
                                if (i13 < length) {
                                    String str2 = split[i13];
                                    if (str2.isEmpty() || str2.length() > 63 || str2.charAt(0) == '-' || str2.charAt(str2.length() - 1) == '-') {
                                        break;
                                    }
                                    for (int i14 = 0; i14 < str2.length(); i14++) {
                                        char charAt = str2.charAt(i14);
                                        if ((charAt < 'a' || charAt > 'z') && ((charAt < '0' || charAt > '9') && charAt != '-')) {
                                            break loop1;
                                        }
                                    }
                                    i13++;
                                } else {
                                    String[] strArr = d0.m;
                                    boolean z11 = false;
                                    for (int i15 = 0; i15 < 3; i15++) {
                                        String str3 = strArr[i15];
                                        if (!substring.equals(str3)) {
                                            if (!substring.endsWith("." + str3)) {
                                                z10 = false;
                                                z11 |= z10;
                                            }
                                        }
                                        z10 = true;
                                        z11 |= z10;
                                    }
                                    if (z11 == equals && i1Var.d.c(i1Var.F)) {
                                        r6 = true;
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                r6 = "haptic".equals(optString) ? i1Var.d.a(i1Var.F) : "ready".equals(optString);
            }
            i1Var.a.post(new f0(4, i1Var, jSONObject6));
        } catch (RemoteException | NumberFormatException | Exception unused) {
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
