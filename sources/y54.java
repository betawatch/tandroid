// default package

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import j$.util.DesugarTimeZone;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class y54 {
    public static final String[] E;
    public static final int[] F;
    public static final byte[] G;
    public static final v54 H;
    public static final v54[][] I;
    public static final v54[] J;
    public static final HashMap[] K;
    public static final HashMap[] L;
    public static final HashSet M;
    public static final HashMap N;
    public static final Charset O;
    public static final byte[] P;
    public static final byte[] Q;
    public String a;
    public FileDescriptor b;
    public AssetManager.AssetInputStream c;
    public int d;
    public final HashMap[] e;
    public final HashSet f;
    public ByteOrder g;
    public boolean h;
    public int i;
    public int j;
    public int k;
    public int l;
    public static final boolean m = Log.isLoggable("ExifInterface", 3);
    public static final List n = Arrays.asList(1, 6, 3, 8);
    public static final List o = Arrays.asList(2, 7, 4, 5);
    public static final int[] p = {8, 8, 8};
    public static final int[] q = {8};
    public static final byte[] r = {-1, -40, -1};
    public static final byte[] s = {102, 116, 121, 112};
    public static final byte[] t = {109, 105, 102, 49};
    public static final byte[] u = {104, 101, 105, 99};
    public static final byte[] v = {79, 76, 89, 77, 80, 0};
    public static final byte[] w = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    public static final byte[] x = {-119, 80, 78, 71, 13, 10, 26, 10};
    public static final byte[] y = {101, 88, 73, 102};
    public static final byte[] z = {73, 72, 68, 82};
    public static final byte[] A = {73, 69, 78, 68};
    public static final byte[] B = {82, 73, 70, 70};
    public static final byte[] C = {87, 69, 66, 80};
    public static final byte[] D = {69, 88, 73, 70};

    static {
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        E = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        F = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        G = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        v54[] v54VarArr = {new v54("NewSubfileType", jn7.c4, 4), new v54("SubfileType", jn7.d4, 4), new v54(256, 3, 4, "ImageWidth"), new v54(jn7.f4, 3, 4, "ImageLength"), new v54("BitsPerSample", jn7.g4, 3), new v54("Compression", jn7.h4, 3), new v54("PhotometricInterpretation", jn7.k4, 3), new v54("ImageDescription", jn7.s4, 2), new v54("Make", jn7.t4, 2), new v54("Model", jn7.u4, 2), new v54(jn7.v4, 3, 4, "StripOffsets"), new v54("Orientation", jn7.w4, 3), new v54("SamplesPerPixel", jn7.z4, 3), new v54(jn7.A4, 3, 4, "RowsPerStrip"), new v54(jn7.B4, 3, 4, "StripByteCounts"), new v54("XResolution", jn7.E4, 5), new v54("YResolution", jn7.F4, 5), new v54("PlanarConfiguration", jn7.G4, 3), new v54("ResolutionUnit", jn7.S4, 3), new v54("TransferFunction", jn7.X4, 3), new v54("Software", jn7.b5, 2), new v54("DateTime", jn7.c5, 2), new v54("Artist", jn7.l5, 2), new v54("WhitePoint", jn7.o5, 5), new v54("PrimaryChromaticities", jn7.p5, 5), new v54("SubIFDPointer", jn7.A5, 4), new v54("JPEGInterchangeFormat", 513, 4), new v54("JPEGInterchangeFormatLength", 514, 4), new v54("YCbCrCoefficients", 529, 5), new v54("YCbCrSubSampling", 530, 3), new v54("YCbCrPositioning", 531, 3), new v54("ReferenceBlackWhite", 532, 5), new v54("Copyright", 33432, 2), new v54("ExifIFDPointer", 34665, 4), new v54("GPSInfoIFDPointer", 34853, 4), new v54("SensorTopBorder", 4, 4), new v54("SensorLeftBorder", 5, 4), new v54("SensorBottomBorder", 6, 4), new v54("SensorRightBorder", 7, 4), new v54("ISO", 23, 3), new v54("JpgFromRaw", 46, 7), new v54("Xmp", 700, 1)};
        v54[] v54VarArr2 = {new v54("ExposureTime", 33434, 5), new v54("FNumber", 33437, 5), new v54("ExposureProgram", 34850, 3), new v54("SpectralSensitivity", 34852, 2), new v54("PhotographicSensitivity", 34855, 3), new v54("OECF", 34856, 7), new v54("SensitivityType", 34864, 3), new v54("StandardOutputSensitivity", 34865, 4), new v54("RecommendedExposureIndex", 34866, 4), new v54("ISOSpeed", 34867, 4), new v54("ISOSpeedLatitudeyyy", 34868, 4), new v54("ISOSpeedLatitudezzz", 34869, 4), new v54("ExifVersion", 36864, 2), new v54("DateTimeOriginal", 36867, 2), new v54("DateTimeDigitized", 36868, 2), new v54("OffsetTime", 36880, 2), new v54("OffsetTimeOriginal", 36881, 2), new v54("OffsetTimeDigitized", 36882, 2), new v54("ComponentsConfiguration", 37121, 7), new v54("CompressedBitsPerPixel", 37122, 5), new v54("ShutterSpeedValue", 37377, 10), new v54("ApertureValue", 37378, 5), new v54("BrightnessValue", 37379, 10), new v54("ExposureBiasValue", 37380, 10), new v54("MaxApertureValue", 37381, 5), new v54("SubjectDistance", 37382, 5), new v54("MeteringMode", 37383, 3), new v54("LightSource", 37384, 3), new v54("Flash", 37385, 3), new v54("FocalLength", 37386, 5), new v54("SubjectArea", 37396, 3), new v54("MakerNote", 37500, 7), new v54("UserComment", 37510, 7), new v54("SubSecTime", 37520, 2), new v54("SubSecTimeOriginal", 37521, 2), new v54("SubSecTimeDigitized", 37522, 2), new v54("FlashpixVersion", 40960, 7), new v54("ColorSpace", 40961, 3), new v54(40962, 3, 4, "PixelXDimension"), new v54(40963, 3, 4, "PixelYDimension"), new v54("RelatedSoundFile", 40964, 2), new v54("InteroperabilityIFDPointer", 40965, 4), new v54("FlashEnergy", 41483, 5), new v54("SpatialFrequencyResponse", 41484, 7), new v54("FocalPlaneXResolution", 41486, 5), new v54("FocalPlaneYResolution", 41487, 5), new v54("FocalPlaneResolutionUnit", 41488, 3), new v54("SubjectLocation", 41492, 3), new v54("ExposureIndex", 41493, 5), new v54("SensingMethod", 41495, 3), new v54("FileSource", 41728, 7), new v54("SceneType", 41729, 7), new v54("CFAPattern", 41730, 7), new v54("CustomRendered", 41985, 3), new v54("ExposureMode", 41986, 3), new v54("WhiteBalance", 41987, 3), new v54("DigitalZoomRatio", 41988, 5), new v54("FocalLengthIn35mmFilm", 41989, 3), new v54("SceneCaptureType", 41990, 3), new v54("GainControl", 41991, 3), new v54("Contrast", 41992, 3), new v54("Saturation", 41993, 3), new v54("Sharpness", 41994, 3), new v54("DeviceSettingDescription", 41995, 7), new v54("SubjectDistanceRange", 41996, 3), new v54("ImageUniqueID", 42016, 2), new v54("CameraOwnerName", 42032, 2), new v54("BodySerialNumber", 42033, 2), new v54("LensSpecification", 42034, 5), new v54("LensMake", 42035, 2), new v54("LensModel", 42036, 2), new v54("Gamma", 42240, 5), new v54("DNGVersion", 50706, 1), new v54(50720, 3, 4, "DefaultCropSize")};
        v54[] v54VarArr3 = {new v54("GPSVersionID", 0, 1), new v54("GPSLatitudeRef", 1, 2), new v54(2, 5, 10, "GPSLatitude"), new v54("GPSLongitudeRef", 3, 2), new v54(4, 5, 10, "GPSLongitude"), new v54("GPSAltitudeRef", 5, 1), new v54("GPSAltitude", 6, 5), new v54("GPSTimeStamp", 7, 5), new v54("GPSSatellites", 8, 2), new v54("GPSStatus", 9, 2), new v54("GPSMeasureMode", 10, 2), new v54("GPSDOP", 11, 5), new v54("GPSSpeedRef", 12, 2), new v54("GPSSpeed", 13, 5), new v54("GPSTrackRef", 14, 2), new v54("GPSTrack", 15, 5), new v54("GPSImgDirectionRef", 16, 2), new v54("GPSImgDirection", 17, 5), new v54("GPSMapDatum", 18, 2), new v54("GPSDestLatitudeRef", 19, 2), new v54("GPSDestLatitude", 20, 5), new v54("GPSDestLongitudeRef", 21, 2), new v54("GPSDestLongitude", 22, 5), new v54("GPSDestBearingRef", 23, 2), new v54("GPSDestBearing", 24, 5), new v54("GPSDestDistanceRef", 25, 2), new v54("GPSDestDistance", 26, 5), new v54("GPSProcessingMethod", 27, 7), new v54("GPSAreaInformation", 28, 7), new v54("GPSDateStamp", 29, 2), new v54("GPSDifferential", 30, 3), new v54("GPSHPositioningError", 31, 5)};
        v54[] v54VarArr4 = {new v54("InteroperabilityIndex", 1, 2)};
        v54[] v54VarArr5 = {new v54("NewSubfileType", jn7.c4, 4), new v54("SubfileType", jn7.d4, 4), new v54(256, 3, 4, "ThumbnailImageWidth"), new v54(jn7.f4, 3, 4, "ThumbnailImageLength"), new v54("BitsPerSample", jn7.g4, 3), new v54("Compression", jn7.h4, 3), new v54("PhotometricInterpretation", jn7.k4, 3), new v54("ImageDescription", jn7.s4, 2), new v54("Make", jn7.t4, 2), new v54("Model", jn7.u4, 2), new v54(jn7.v4, 3, 4, "StripOffsets"), new v54("ThumbnailOrientation", jn7.w4, 3), new v54("SamplesPerPixel", jn7.z4, 3), new v54(jn7.A4, 3, 4, "RowsPerStrip"), new v54(jn7.B4, 3, 4, "StripByteCounts"), new v54("XResolution", jn7.E4, 5), new v54("YResolution", jn7.F4, 5), new v54("PlanarConfiguration", jn7.G4, 3), new v54("ResolutionUnit", jn7.S4, 3), new v54("TransferFunction", jn7.X4, 3), new v54("Software", jn7.b5, 2), new v54("DateTime", jn7.c5, 2), new v54("Artist", jn7.l5, 2), new v54("WhitePoint", jn7.o5, 5), new v54("PrimaryChromaticities", jn7.p5, 5), new v54("SubIFDPointer", jn7.A5, 4), new v54("JPEGInterchangeFormat", 513, 4), new v54("JPEGInterchangeFormatLength", 514, 4), new v54("YCbCrCoefficients", 529, 5), new v54("YCbCrSubSampling", 530, 3), new v54("YCbCrPositioning", 531, 3), new v54("ReferenceBlackWhite", 532, 5), new v54("Copyright", 33432, 2), new v54("ExifIFDPointer", 34665, 4), new v54("GPSInfoIFDPointer", 34853, 4), new v54("DNGVersion", 50706, 1), new v54(50720, 3, 4, "DefaultCropSize")};
        H = new v54("StripOffsets", jn7.v4, 3);
        I = new v54[][]{v54VarArr, v54VarArr2, v54VarArr3, v54VarArr4, v54VarArr5, v54VarArr, new v54[]{new v54("ThumbnailImage", 256, 7), new v54("CameraSettingsIFDPointer", 8224, 4), new v54("ImageProcessingIFDPointer", 8256, 4)}, new v54[]{new v54("PreviewImageStart", jn7.f4, 4), new v54("PreviewImageLength", jn7.g4, 4)}, new v54[]{new v54("AspectFrame", 4371, 3)}, new v54[]{new v54("ColorSpace", 55, 3)}};
        J = new v54[]{new v54("SubIFDPointer", jn7.A5, 4), new v54("ExifIFDPointer", 34665, 4), new v54("GPSInfoIFDPointer", 34853, 4), new v54("InteroperabilityIFDPointer", 40965, 4), new v54("CameraSettingsIFDPointer", 8224, 1), new v54("ImageProcessingIFDPointer", 8256, 1)};
        K = new HashMap[10];
        L = new HashMap[10];
        M = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        N = new HashMap();
        Charset forName = Charset.forName("US-ASCII");
        O = forName;
        P = "Exif\u0000\u0000".getBytes(forName);
        Q = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            v54[][] v54VarArr6 = I;
            if (i >= v54VarArr6.length) {
                HashMap hashMap = N;
                v54[] v54VarArr7 = J;
                hashMap.put(Integer.valueOf(v54VarArr7[0].a), 5);
                hashMap.put(Integer.valueOf(v54VarArr7[1].a), 1);
                hashMap.put(Integer.valueOf(v54VarArr7[2].a), 2);
                hashMap.put(Integer.valueOf(v54VarArr7[3].a), 3);
                hashMap.put(Integer.valueOf(v54VarArr7[4].a), 7);
                hashMap.put(Integer.valueOf(v54VarArr7[5].a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            K[i] = new HashMap();
            L[i] = new HashMap();
            for (v54 v54Var : v54VarArr6[i]) {
                K[i].put(Integer.valueOf(v54Var.a), v54Var);
                L[i].put(v54Var.b, v54Var);
            }
            i++;
        }
    }

    public y54(InputStream inputStream) {
        v54[][] v54VarArr = I;
        this.e = new HashMap[v54VarArr.length];
        this.f = new HashSet(v54VarArr.length);
        this.g = ByteOrder.BIG_ENDIAN;
        if (inputStream == null) {
            p3d.h("inputStream cannot be null");
            throw null;
        }
        this.a = null;
        if (inputStream instanceof AssetManager.AssetInputStream) {
            this.c = (AssetManager.AssetInputStream) inputStream;
            this.b = null;
        } else {
            if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                try {
                    z54.c(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                    this.c = null;
                    this.b = fileInputStream.getFD();
                } catch (Exception unused) {
                    if (m) {
                        Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                    }
                }
            }
            this.c = null;
            this.b = null;
        }
        q(inputStream);
    }

    public static ByteOrder t(t54 t54Var) {
        short readShort = t54Var.readShort();
        boolean z2 = m;
        if (readShort == 18761) {
            if (z2) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort != 19789) {
            su3.d(Integer.toHexString(readShort), "Invalid byte order: ");
            return null;
        }
        if (z2) {
            Log.d("ExifInterface", "readExifSegment: Byte Align MM");
        }
        return ByteOrder.BIG_ENDIAN;
    }

    public final void A() {
        y(0, 5);
        y(0, 4);
        y(5, 4);
        HashMap[] hashMapArr = this.e;
        u54 u54Var = (u54) hashMapArr[1].get("PixelXDimension");
        u54 u54Var2 = (u54) hashMapArr[1].get("PixelYDimension");
        if (u54Var != null && u54Var2 != null) {
            hashMapArr[0].put("ImageWidth", u54Var);
            hashMapArr[0].put("ImageLength", u54Var2);
        }
        if (hashMapArr[4].isEmpty() && p(hashMapArr[5])) {
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        if (!p(hashMapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        w(0, "ThumbnailOrientation", "Orientation");
        w(0, "ThumbnailImageLength", "ImageLength");
        w(0, "ThumbnailImageWidth", "ImageWidth");
        w(5, "ThumbnailOrientation", "Orientation");
        w(5, "ThumbnailImageLength", "ImageLength");
        w(5, "ThumbnailImageWidth", "ImageWidth");
        w(4, "Orientation", "ThumbnailOrientation");
        w(4, "ImageLength", "ThumbnailImageLength");
        w(4, "ImageWidth", "ThumbnailImageWidth");
    }

    public final void a() {
        String b = b("DateTimeOriginal");
        HashMap[] hashMapArr = this.e;
        if (b != null && b("DateTime") == null) {
            HashMap hashMap = hashMapArr[0];
            byte[] bytes = b.concat(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR).getBytes(O);
            hashMap.put("DateTime", new u54(2, bytes.length, bytes));
        }
        if (b("ImageWidth") == null) {
            hashMapArr[0].put("ImageWidth", u54.a(0L, this.g));
        }
        if (b("ImageLength") == null) {
            hashMapArr[0].put("ImageLength", u54.a(0L, this.g));
        }
        if (b("Orientation") == null) {
            hashMapArr[0].put("Orientation", u54.a(0L, this.g));
        }
        if (b("LightSource") == null) {
            hashMapArr[1].put("LightSource", u54.a(0L, this.g));
        }
    }

    public final String b(String str) {
        u54 d = d(str);
        if (d != null) {
            int i = d.a;
            if (!M.contains(str)) {
                return d.f(this.g);
            }
            if (str.equals("GPSTimeStamp")) {
                if (i != 5 && i != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i);
                    return null;
                }
                w54[] w54VarArr = (w54[]) d.g(this.g);
                if (w54VarArr == null || w54VarArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(w54VarArr));
                    return null;
                }
                w54 w54Var = w54VarArr[0];
                Integer valueOf = Integer.valueOf((int) (w54Var.a / w54Var.b));
                w54 w54Var2 = w54VarArr[1];
                Integer valueOf2 = Integer.valueOf((int) (w54Var2.a / w54Var2.b));
                w54 w54Var3 = w54VarArr[2];
                return String.format("%02d:%02d:%02d", valueOf, valueOf2, Integer.valueOf((int) (w54Var3.a / w54Var3.b)));
            }
            try {
                return Double.toString(d.d(this.g));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final int c() {
        u54 d = d("Orientation");
        if (d == null) {
            return 1;
        }
        try {
            return d.e(this.g);
        } catch (NumberFormatException unused) {
            return 1;
        }
    }

    public final u54 d(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (m) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < I.length; i++) {
            u54 u54Var = (u54) this.e[i].get(str);
            if (u54Var != null) {
                return u54Var;
            }
        }
        return null;
    }

    public final void e(x54 x54Var) {
        String str;
        String str2;
        String str3;
        if (Build.VERSION.SDK_INT < 28) {
            qyc.c("Reading EXIF from HEIF files is supported from SDK 28 and above");
            return;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                a64.a(mediaMetadataRetriever, new s54(x54Var));
                String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(extractMetadata3)) {
                    str = mediaMetadataRetriever.extractMetadata(29);
                    str2 = mediaMetadataRetriever.extractMetadata(30);
                    str3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(extractMetadata4)) {
                    str = mediaMetadataRetriever.extractMetadata(18);
                    str2 = mediaMetadataRetriever.extractMetadata(19);
                    str3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                }
                HashMap[] hashMapArr = this.e;
                if (str != null) {
                    hashMapArr[0].put("ImageWidth", u54.c(Integer.parseInt(str), this.g));
                }
                if (str2 != null) {
                    hashMapArr[0].put("ImageLength", u54.c(Integer.parseInt(str2), this.g));
                }
                if (str3 != null) {
                    int parseInt = Integer.parseInt(str3);
                    hashMapArr[0].put("Orientation", u54.c(parseInt != 90 ? parseInt != 180 ? parseInt != 270 ? 1 : 8 : 3 : 6, this.g));
                }
                if (extractMetadata != null && extractMetadata2 != null) {
                    int parseInt2 = Integer.parseInt(extractMetadata);
                    int parseInt3 = Integer.parseInt(extractMetadata2);
                    if (parseInt3 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    x54Var.b(parseInt2);
                    byte[] bArr = new byte[6];
                    if (x54Var.read(bArr) != 6) {
                        throw new IOException("Can't read identifier");
                    }
                    int i = parseInt2 + 6;
                    int i2 = parseInt3 - 6;
                    if (!Arrays.equals(bArr, P)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i2];
                    if (x54Var.read(bArr2) != i2) {
                        throw new IOException("Can't read exif");
                    }
                    this.i = i;
                    u(0, bArr2);
                }
                if (m) {
                    Log.d("ExifInterface", "Heif meta: " + str + "x" + str2 + ", rotation " + str3);
                }
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } finally {
            mediaMetadataRetriever.release();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x0194, code lost:
    
        r23.b = r22.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0198, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00aa A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(t54 t54Var, int i, int i2) {
        boolean z2 = m;
        if (z2) {
            Log.d("ExifInterface", "getJpegAttributes starting with: " + t54Var);
        }
        t54Var.b = ByteOrder.BIG_ENDIAN;
        byte readByte = t54Var.readByte();
        byte b = -1;
        if (readByte != -1) {
            su3.d(Integer.toHexString(readByte & 255), "Invalid marker: ");
            return;
        }
        if (t54Var.readByte() != -40) {
            su3.d(Integer.toHexString(readByte & 255), "Invalid marker: ");
            return;
        }
        int i3 = 2;
        int i4 = 2;
        while (true) {
            byte readByte2 = t54Var.readByte();
            if (readByte2 != b) {
                su3.d(Integer.toHexString(readByte2 & 255), "Invalid marker:");
                return;
            }
            byte readByte3 = t54Var.readByte();
            if (z2) {
                Log.d("ExifInterface", "Found JPEG segment indicator: " + Integer.toHexString(readByte3 & 255));
            }
            if (readByte3 != -39 && readByte3 != -38) {
                int readUnsignedShort = t54Var.readUnsignedShort();
                int i5 = readUnsignedShort - 2;
                int i6 = i4 + 4;
                if (z2) {
                    Log.d("ExifInterface", "JPEG segment: " + Integer.toHexString(readByte3 & 255) + " (length: " + readUnsignedShort + ")");
                }
                if (i5 < 0) {
                    su3.e("Invalid length");
                    return;
                }
                int i7 = 0;
                HashMap[] hashMapArr = this.e;
                if (readByte3 == -31) {
                    byte[] bArr = new byte[i5];
                    t54Var.readFully(bArr);
                    int i8 = i6 + i5;
                    byte[] bArr2 = P;
                    if (bArr2 != null && i5 >= bArr2.length) {
                        int i9 = 0;
                        while (i9 < bArr2.length) {
                            if (bArr[i9] == bArr2[i9]) {
                                i9++;
                                i7 = 0;
                            }
                        }
                        byte[] copyOfRange = Arrays.copyOfRange(bArr, bArr2.length, i5);
                        this.i = i + i6 + bArr2.length;
                        u(i2, copyOfRange);
                        x(new t54(copyOfRange));
                        i6 = i8;
                        i5 = 0;
                    }
                    byte[] bArr3 = Q;
                    if (bArr3 != null && i5 >= bArr3.length) {
                        int i10 = i7;
                        while (true) {
                            if (i10 >= bArr3.length) {
                                int length = i6 + bArr3.length;
                                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, bArr3.length, i5);
                                if (b("Xmp") == null) {
                                    hashMapArr[i7].put("Xmp", new u54(length, copyOfRange2, 1, copyOfRange2.length));
                                }
                            } else if (bArr[i10] == bArr3[i10]) {
                                i10++;
                            }
                        }
                    }
                    i6 = i8;
                    i5 = 0;
                } else if (readByte3 != -2) {
                    switch (readByte3) {
                        default:
                            switch (readByte3) {
                                default:
                                    switch (readByte3) {
                                        default:
                                            switch (readByte3) {
                                            }
                                        case -55:
                                        case -54:
                                        case -53:
                                            t54Var.a(1);
                                            hashMapArr[i2].put(i2 != 4 ? "ImageLength" : "ThumbnailImageLength", u54.a(t54Var.readUnsignedShort(), this.g));
                                            hashMapArr[i2].put(i2 != 4 ? "ImageWidth" : "ThumbnailImageWidth", u54.a(t54Var.readUnsignedShort(), this.g));
                                            i5 = readUnsignedShort - 7;
                                            break;
                                    }
                                case -59:
                                case -58:
                                case -57:
                                    break;
                            }
                        case -64:
                        case -63:
                        case -62:
                        case -61:
                            break;
                    }
                } else {
                    byte[] bArr4 = new byte[i5];
                    if (t54Var.read(bArr4) != i5) {
                        su3.e("Invalid exif");
                        return;
                    }
                    if (b("UserComment") == null) {
                        HashMap hashMap = hashMapArr[1];
                        Charset charset = O;
                        byte[] bytes = new String(bArr4, charset).concat(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR).getBytes(charset);
                        hashMap.put("UserComment", new u54(i3, bytes.length, bytes));
                    }
                    i5 = 0;
                }
                if (i5 < 0) {
                    su3.e("Invalid length");
                    return;
                }
                t54Var.a(i5);
                i4 = i6 + i5;
                i3 = 2;
                b = -1;
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:14|15|(4:16|17|18|19)|(6:21|(2:23|24)(1:145)|26|(1:28)|29|(11:31|(3:32|33|(4:35|36|37|(3:39|(1:56)(3:41|(1:43)(2:53|(1:55))|(3:46|47|48))|51)(1:57))(2:142|143))|58|59|60|61|62|63|(1:121)(1:67)|68|(1:70)(8:71|72|74|75|76|(1:78)|79|(1:81)(2:82|(2:83|(2:85|(4:88|89|(2:90|(2:92|(1:94)(1:95))(3:97|98|(2:99|(2:101|(1:104)(1:103))(2:105|106))))|96)(1:87))(2:107|108))))))|146|59|60|61|62|63|(1:65)|121|68|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x00f8, code lost:
    
        if (r3 != null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x00fa, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x00fd, code lost:
    
        r0 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x00ed, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x00ee, code lost:
    
        r4 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x00f1, code lost:
    
        if (r4 != null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x00f3, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x00f6, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x00f7, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x00f0, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x00c9, code lost:
    
        if (r7 != null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
    
        if (r8 < 16) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0101 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0103 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0133 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int g(BufferedInputStream bufferedInputStream) {
        int i;
        t54 t54Var;
        int i2;
        int i3;
        t54 t54Var2;
        long readInt;
        byte[] bArr;
        long j;
        bufferedInputStream.mark(5000);
        byte[] bArr2 = new byte[5000];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i4 = 0;
        while (true) {
            byte[] bArr3 = r;
            if (i4 >= bArr3.length) {
                return 4;
            }
            if (bArr2[i4] != bArr3[i4]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i5 = 0; i5 < bytes.length; i5++) {
                    if (bArr2[i5] != bytes[i5]) {
                        t54 t54Var3 = null;
                        try {
                            t54Var = new t54(bArr2);
                            try {
                                try {
                                    readInt = t54Var.readInt();
                                    bArr = new byte[4];
                                    t54Var.read(bArr);
                                } catch (Exception e) {
                                    e = e;
                                    i = 0;
                                }
                            } catch (Throwable th) {
                                th = th;
                                t54Var3 = t54Var;
                                if (t54Var3 != null) {
                                    t54Var3.close();
                                }
                                throw th;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            i = 0;
                            t54Var = null;
                        } catch (Throwable th2) {
                            th = th2;
                            if (t54Var3 != null) {
                            }
                            throw th;
                        }
                        if (Arrays.equals(bArr, s)) {
                            if (readInt == 1) {
                                readInt = t54Var.readLong();
                                j = 16;
                            } else {
                                j = 8;
                            }
                            if (readInt > 5000) {
                                readInt = 5000;
                            }
                            long j2 = readInt - j;
                            if (j2 >= 8) {
                                byte[] bArr4 = new byte[4];
                                long j3 = 0;
                                boolean z2 = false;
                                boolean z3 = false;
                                while (true) {
                                    if (j3 >= j2 / 4) {
                                        i = 0;
                                        break;
                                    }
                                    i = 0;
                                    try {
                                        if (t54Var.read(bArr4) != 4) {
                                            break;
                                        }
                                        if (j3 != 1) {
                                            if (Arrays.equals(bArr4, t)) {
                                                z2 = true;
                                            } else if (Arrays.equals(bArr4, u)) {
                                                z3 = true;
                                            }
                                            if (z2 && z3) {
                                                t54Var.close();
                                                return 12;
                                            }
                                        }
                                        j3++;
                                    } catch (Exception e3) {
                                        e = e3;
                                        if (m) {
                                            Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                                        }
                                    }
                                }
                                t54Var.close();
                                t54 t54Var4 = new t54(bArr2);
                                ByteOrder t2 = t(t54Var4);
                                this.g = t2;
                                t54Var4.b = t2;
                                short readShort = t54Var4.readShort();
                                i2 = (readShort != 20306 || readShort == 21330) ? 1 : i;
                                t54Var4.close();
                                if (i2 != 0) {
                                    return 7;
                                }
                                try {
                                    t54Var2 = new t54(bArr2);
                                } catch (Exception unused) {
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                                try {
                                    ByteOrder t3 = t(t54Var2);
                                    this.g = t3;
                                    t54Var2.b = t3;
                                    i3 = t54Var2.readShort() != 85 ? i : 1;
                                    t54Var2.close();
                                } catch (Exception unused2) {
                                    t54Var3 = t54Var2;
                                    if (t54Var3 != null) {
                                        t54Var3.close();
                                    }
                                    i3 = i;
                                    if (i3 == 0) {
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    t54Var3 = t54Var2;
                                    if (t54Var3 != null) {
                                        t54Var3.close();
                                    }
                                    throw th;
                                }
                                if (i3 == 0) {
                                    return 10;
                                }
                                int i6 = i;
                                while (true) {
                                    byte[] bArr5 = x;
                                    if (i6 >= bArr5.length) {
                                        return 13;
                                    }
                                    if (bArr2[i6] != bArr5[i6]) {
                                        int i7 = i;
                                        while (true) {
                                            byte[] bArr6 = B;
                                            if (i7 >= bArr6.length) {
                                                int i8 = i;
                                                while (true) {
                                                    byte[] bArr7 = C;
                                                    if (i8 >= bArr7.length) {
                                                        return 14;
                                                    }
                                                    if (bArr2[bArr6.length + i8 + 4] != bArr7[i8]) {
                                                        break;
                                                    }
                                                    i8++;
                                                }
                                            } else {
                                                if (bArr2[i7] != bArr6[i7]) {
                                                    break;
                                                }
                                                i7++;
                                            }
                                        }
                                        return i;
                                    }
                                    i6++;
                                }
                            }
                        }
                        t54Var.close();
                        i = 0;
                        t54 t54Var42 = new t54(bArr2);
                        ByteOrder t22 = t(t54Var42);
                        this.g = t22;
                        t54Var42.b = t22;
                        short readShort2 = t54Var42.readShort();
                        if (readShort2 != 20306) {
                        }
                        t54Var42.close();
                        if (i2 != 0) {
                        }
                    }
                }
                return 9;
            }
            i4++;
        }
    }

    public final void h(x54 x54Var) {
        int i;
        int i2;
        k(x54Var);
        HashMap[] hashMapArr = this.e;
        u54 u54Var = (u54) hashMapArr[1].get("MakerNote");
        if (u54Var != null) {
            x54 x54Var2 = new x54(u54Var.d);
            x54Var2.b = this.g;
            byte[] bArr = v;
            byte[] bArr2 = new byte[bArr.length];
            x54Var2.readFully(bArr2);
            x54Var2.b(0L);
            byte[] bArr3 = w;
            byte[] bArr4 = new byte[bArr3.length];
            x54Var2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                x54Var2.b(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                x54Var2.b(12L);
            }
            v(x54Var2, 6);
            u54 u54Var2 = (u54) hashMapArr[7].get("PreviewImageStart");
            u54 u54Var3 = (u54) hashMapArr[7].get("PreviewImageLength");
            if (u54Var2 != null && u54Var3 != null) {
                hashMapArr[5].put("JPEGInterchangeFormat", u54Var2);
                hashMapArr[5].put("JPEGInterchangeFormatLength", u54Var3);
            }
            u54 u54Var4 = (u54) hashMapArr[8].get("AspectFrame");
            if (u54Var4 != null) {
                int[] iArr = (int[]) u54Var4.g(this.g);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i3 = iArr[2];
                int i4 = iArr[0];
                if (i3 <= i4 || (i = iArr[3]) <= (i2 = iArr[1])) {
                    return;
                }
                int i5 = (i3 - i4) + 1;
                int i6 = (i - i2) + 1;
                if (i5 < i6) {
                    int i7 = i5 + i6;
                    i6 = i7 - i6;
                    i5 = i7 - i6;
                }
                u54 c = u54.c(i5, this.g);
                u54 c2 = u54.c(i6, this.g);
                hashMapArr[0].put("ImageWidth", c);
                hashMapArr[0].put("ImageLength", c2);
            }
        }
    }

    public final void i(t54 t54Var) {
        if (m) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + t54Var);
        }
        t54Var.b = ByteOrder.BIG_ENDIAN;
        byte[] bArr = x;
        t54Var.a(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int readInt = t54Var.readInt();
                byte[] bArr2 = new byte[4];
                if (t54Var.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i = length + 8;
                if (i == 16 && !Arrays.equals(bArr2, z)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, A)) {
                    return;
                }
                if (Arrays.equals(bArr2, y)) {
                    byte[] bArr3 = new byte[readInt];
                    if (t54Var.read(bArr3) != readInt) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + lke.a(bArr2));
                    }
                    int readInt2 = t54Var.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == readInt2) {
                        this.i = i;
                        u(0, bArr3);
                        A();
                        x(new t54(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                }
                int i2 = readInt + 4;
                t54Var.a(i2);
                length = i + i2;
            } catch (EOFException unused) {
                su3.e("Encountered corrupt PNG file.");
                return;
            }
        }
    }

    public final void j(t54 t54Var) {
        boolean z2 = m;
        if (z2) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + t54Var);
        }
        t54Var.a(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        t54Var.read(bArr);
        t54Var.read(bArr2);
        t54Var.read(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        t54Var.a(i - t54Var.c);
        t54Var.read(bArr4);
        f(new t54(bArr4), i, 5);
        t54Var.a(i3 - t54Var.c);
        t54Var.b = ByteOrder.BIG_ENDIAN;
        int readInt = t54Var.readInt();
        if (z2) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i4 = 0; i4 < readInt; i4++) {
            int readUnsignedShort = t54Var.readUnsignedShort();
            int readUnsignedShort2 = t54Var.readUnsignedShort();
            if (readUnsignedShort == H.a) {
                short readShort = t54Var.readShort();
                short readShort2 = t54Var.readShort();
                u54 c = u54.c(readShort, this.g);
                u54 c2 = u54.c(readShort2, this.g);
                HashMap[] hashMapArr = this.e;
                hashMapArr[0].put("ImageLength", c);
                hashMapArr[0].put("ImageWidth", c2);
                if (z2) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            t54Var.a(readUnsignedShort2);
        }
    }

    public final void k(x54 x54Var) {
        r(x54Var);
        v(x54Var, 0);
        z(x54Var, 0);
        z(x54Var, 5);
        z(x54Var, 4);
        A();
        if (this.d == 8) {
            HashMap[] hashMapArr = this.e;
            u54 u54Var = (u54) hashMapArr[1].get("MakerNote");
            if (u54Var != null) {
                x54 x54Var2 = new x54(u54Var.d);
                x54Var2.b = this.g;
                x54Var2.a(6);
                v(x54Var2, 9);
                u54 u54Var2 = (u54) hashMapArr[9].get("ColorSpace");
                if (u54Var2 != null) {
                    hashMapArr[1].put("ColorSpace", u54Var2);
                }
            }
        }
    }

    public final void l(x54 x54Var) {
        if (m) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + x54Var);
        }
        k(x54Var);
        HashMap[] hashMapArr = this.e;
        u54 u54Var = (u54) hashMapArr[0].get("JpgFromRaw");
        if (u54Var != null) {
            f(new t54(u54Var.d), (int) u54Var.c, 5);
        }
        u54 u54Var2 = (u54) hashMapArr[0].get("ISO");
        u54 u54Var3 = (u54) hashMapArr[1].get("PhotographicSensitivity");
        if (u54Var2 == null || u54Var3 != null) {
            return;
        }
        hashMapArr[1].put("PhotographicSensitivity", u54Var2);
    }

    public final void m(t54 t54Var) {
        if (m) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + t54Var);
        }
        t54Var.b = ByteOrder.LITTLE_ENDIAN;
        t54Var.a(B.length);
        int readInt = t54Var.readInt() + 8;
        byte[] bArr = C;
        t54Var.a(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (t54Var.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int readInt2 = t54Var.readInt();
                int i = length + 8;
                if (Arrays.equals(D, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    if (t54Var.read(bArr3) == readInt2) {
                        this.i = i;
                        u(0, bArr3);
                        x(new t54(bArr3));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + lke.a(bArr2));
                    }
                }
                if (readInt2 % 2 == 1) {
                    readInt2++;
                }
                length = i + readInt2;
                if (length == readInt) {
                    return;
                }
                if (length > readInt) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                t54Var.a(readInt2);
            } catch (EOFException unused) {
                su3.e("Encountered corrupt WebP file.");
                return;
            }
        }
    }

    public final void n(t54 t54Var, HashMap hashMap) {
        u54 u54Var = (u54) hashMap.get("JPEGInterchangeFormat");
        u54 u54Var2 = (u54) hashMap.get("JPEGInterchangeFormatLength");
        if (u54Var == null || u54Var2 == null) {
            return;
        }
        int e = u54Var.e(this.g);
        int e2 = u54Var2.e(this.g);
        if (this.d == 7) {
            e += this.j;
        }
        if (e > 0 && e2 > 0 && this.a == null && this.c == null && this.b == null) {
            t54Var.skip(e);
            t54Var.read(new byte[e2]);
        }
        if (m) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + e + ", length: " + e2);
        }
    }

    public final void o(String str) {
        boolean z2;
        if (str == null) {
            p3d.h("filename cannot be null");
            return;
        }
        FileInputStream fileInputStream = null;
        this.c = null;
        this.a = str;
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(str);
                try {
                    try {
                        z54.c(fileInputStream2.getFD(), 0L, OsConstants.SEEK_CUR);
                        z2 = true;
                    } catch (Exception unused) {
                        if (m) {
                            Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                        }
                        z2 = false;
                    }
                    if (z2) {
                        this.b = fileInputStream2.getFD();
                    } else {
                        this.b = null;
                    }
                    q(fileInputStream2);
                    try {
                        fileInputStream2.close();
                    } catch (Exception unused2) {
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (Exception unused3) {
                        }
                    }
                    throw th;
                }
            } catch (RuntimeException e) {
                throw e;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final boolean p(HashMap hashMap) {
        u54 u54Var = (u54) hashMap.get("ImageLength");
        u54 u54Var2 = (u54) hashMap.get("ImageWidth");
        if (u54Var == null || u54Var2 == null) {
            return false;
        }
        return u54Var.e(this.g) <= 512 && u54Var2.e(this.g) <= 512;
    }

    public final void q(InputStream inputStream) {
        boolean z2 = m;
        if (inputStream == null) {
            p3d.h("inputstream shouldn't be null");
            return;
        }
        for (int i = 0; i < I.length; i++) {
            try {
                try {
                    this.e[i] = new HashMap();
                } finally {
                    a();
                    if (z2) {
                        s();
                    }
                }
            } catch (IOException | UnsupportedOperationException e) {
                if (z2) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                a();
                if (z2) {
                    s();
                    return;
                }
                return;
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
        int g = g(bufferedInputStream);
        this.d = g;
        if (g == 4 || g == 9 || g == 13 || g == 14) {
            t54 t54Var = new t54(bufferedInputStream);
            int i2 = this.d;
            if (i2 == 4) {
                f(t54Var, 0, 0);
            } else if (i2 == 13) {
                i(t54Var);
            } else if (i2 == 9) {
                j(t54Var);
            } else if (i2 == 14) {
                m(t54Var);
            }
        } else {
            x54 x54Var = new x54(bufferedInputStream);
            int i3 = this.d;
            if (i3 == 12) {
                e(x54Var);
            } else if (i3 == 7) {
                h(x54Var);
            } else if (i3 == 10) {
                l(x54Var);
            } else {
                k(x54Var);
            }
            x54Var.b(this.i);
            x(x54Var);
        }
    }

    public final void r(x54 x54Var) {
        ByteOrder t2 = t(x54Var);
        this.g = t2;
        x54Var.b = t2;
        int readUnsignedShort = x54Var.readUnsignedShort();
        int i = this.d;
        if (i != 7 && i != 10 && readUnsignedShort != 42) {
            su3.d(Integer.toHexString(readUnsignedShort), "Invalid start code: ");
            return;
        }
        int readInt = x54Var.readInt();
        if (readInt < 8) {
            su3.e(uh9.k(readInt, "Invalid first Ifd offset: "));
            return;
        }
        int i2 = readInt - 8;
        if (i2 > 0) {
            x54Var.a(i2);
        }
    }

    public final void s() {
        int i = 0;
        while (true) {
            HashMap[] hashMapArr = this.e;
            if (i >= hashMapArr.length) {
                return;
            }
            StringBuilder m2 = uh9.m(i, "The size of tag group[", "]: ");
            m2.append(hashMapArr[i].size());
            Log.d("ExifInterface", m2.toString());
            for (Map.Entry entry : hashMapArr[i].entrySet()) {
                u54 u54Var = (u54) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + u54Var.toString() + ", tagValue: '" + u54Var.f(this.g) + "'");
            }
            i++;
        }
    }

    public final void u(int i, byte[] bArr) {
        x54 x54Var = new x54(bArr);
        r(x54Var);
        v(x54Var, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x029a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(x54 x54Var, int i) {
        HashMap[] hashMapArr;
        int i2;
        short s2;
        boolean z2;
        int i3;
        int i4;
        long j;
        long j2;
        boolean z3;
        int i5;
        short s3;
        int i6;
        long j3;
        HashMap[] hashMapArr2;
        int i7;
        int readUnsignedShort;
        long j4;
        int i8 = i;
        Integer valueOf = Integer.valueOf(x54Var.c);
        HashSet hashSet = this.f;
        hashSet.add(valueOf);
        short readShort = x54Var.readShort();
        boolean z4 = m;
        if (z4) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + ((int) readShort));
        }
        if (readShort > 0) {
            short s4 = 0;
            while (true) {
                hashMapArr = this.e;
                if (s4 >= readShort) {
                    break;
                }
                int readUnsignedShort2 = x54Var.readUnsignedShort();
                int readUnsignedShort3 = x54Var.readUnsignedShort();
                int readInt = x54Var.readInt();
                long j5 = x54Var.c + 4;
                v54 v54Var = (v54) K[i8].get(Integer.valueOf(readUnsignedShort2));
                if (z4) {
                    i2 = 3;
                    Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i8), Integer.valueOf(readUnsignedShort2), v54Var != null ? v54Var.b : null, Integer.valueOf(readUnsignedShort3), Integer.valueOf(readInt)));
                } else {
                    i2 = 3;
                }
                if (v54Var == null) {
                    if (z4) {
                        Log.d("ExifInterface", "Skip the tag entry since tag number is not defined: " + readUnsignedShort2);
                    }
                    s2 = readShort;
                    z2 = z4;
                } else {
                    if (readUnsignedShort3 > 0) {
                        if (readUnsignedShort3 < F.length) {
                            i4 = v54Var.c;
                            s2 = readShort;
                            if (i4 == 7 || readUnsignedShort3 == 7 || i4 == readUnsignedShort3 || (i5 = v54Var.d) == readUnsignedShort3) {
                                z2 = z4;
                            } else {
                                z2 = z4;
                                if (((i4 != 4 && i5 != 4) || readUnsignedShort3 != i2) && (((i4 != 9 && i5 != 9) || readUnsignedShort3 != 8) && ((i4 != 12 && i5 != 12) || readUnsignedShort3 != 11))) {
                                    if (z2) {
                                        StringBuilder sb = new StringBuilder("Skip the tag entry since data format (");
                                        sb.append(E[readUnsignedShort3]);
                                        sb.append(") is unexpected for tag: ");
                                        bs2.x(sb, v54Var.b, "ExifInterface");
                                    }
                                }
                            }
                            if (readUnsignedShort3 != 7) {
                                i4 = readUnsignedShort3;
                            }
                            i3 = readInt;
                            j = r9[i4] * i3;
                            if (j < 0 || j > 2147483647L) {
                                if (z2) {
                                    j2 = j;
                                    Log.d("ExifInterface", "Skip the tag entry since the number of components is invalid: " + i3);
                                } else {
                                    j2 = j;
                                }
                                z3 = false;
                                j = j2;
                            } else {
                                z3 = true;
                            }
                            if (z3) {
                                s3 = s4;
                                if (j > 4) {
                                    int readInt2 = x54Var.readInt();
                                    hashMapArr2 = hashMapArr;
                                    if (z2) {
                                        i7 = readUnsignedShort2;
                                        Log.d("ExifInterface", "seek to data offset: " + readInt2);
                                    } else {
                                        i7 = readUnsignedShort2;
                                    }
                                    if (this.d == 7) {
                                        if ("MakerNote".equals(v54Var.b)) {
                                            this.j = readInt2;
                                        } else if (i8 == 6 && "ThumbnailImage".equals(v54Var.b)) {
                                            this.k = readInt2;
                                            this.l = i3;
                                            u54 c = u54.c(6, this.g);
                                            i6 = i3;
                                            u54 a = u54.a(this.k, this.g);
                                            j3 = j5;
                                            u54 a2 = u54.a(this.l, this.g);
                                            hashMapArr2[4].put("Compression", c);
                                            hashMapArr2[4].put("JPEGInterchangeFormat", a);
                                            hashMapArr2[4].put("JPEGInterchangeFormatLength", a2);
                                            x54Var.b(readInt2);
                                        }
                                    }
                                    i6 = i3;
                                    j3 = j5;
                                    x54Var.b(readInt2);
                                } else {
                                    i6 = i3;
                                    j3 = j5;
                                    hashMapArr2 = hashMapArr;
                                    i7 = readUnsignedShort2;
                                }
                                Integer num = (Integer) N.get(Integer.valueOf(i7));
                                if (z2) {
                                    Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j);
                                }
                                if (num != null) {
                                    if (i4 != 3) {
                                        if (i4 == 4) {
                                            j4 = x54Var.readInt() & 4294967295L;
                                        } else if (i4 == 8) {
                                            readUnsignedShort = x54Var.readShort();
                                        } else if (i4 == 9 || i4 == 13) {
                                            readUnsignedShort = x54Var.readInt();
                                        } else {
                                            j4 = -1;
                                        }
                                        if (z2) {
                                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j4), v54Var.b));
                                        }
                                        if (j4 <= 0) {
                                            if (!hashSet.contains(Integer.valueOf((int) j4))) {
                                                x54Var.b(j4);
                                                v(x54Var, num.intValue());
                                            } else if (z2) {
                                                StringBuilder sb2 = new StringBuilder("Skip jump into the IFD since it has already been read: IfdType ");
                                                sb2.append(num);
                                                sb2.append(" (at ");
                                                sb2.append(j4);
                                                bs2.x(sb2, ")", "ExifInterface");
                                            }
                                        } else if (z2) {
                                            Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j4);
                                        }
                                        x54Var.b(j3);
                                    } else {
                                        readUnsignedShort = x54Var.readUnsignedShort();
                                    }
                                    j4 = readUnsignedShort;
                                    if (z2) {
                                    }
                                    if (j4 <= 0) {
                                    }
                                    x54Var.b(j3);
                                } else {
                                    long j6 = j3;
                                    int i9 = x54Var.c + this.i;
                                    byte[] bArr = new byte[(int) j];
                                    x54Var.readFully(bArr);
                                    u54 u54Var = new u54(i9, bArr, i4, i6);
                                    HashMap hashMap = hashMapArr2[i];
                                    String str = v54Var.b;
                                    hashMap.put(str, u54Var);
                                    if ("DNGVersion".equals(str)) {
                                        this.d = 3;
                                    }
                                    if ((("Make".equals(str) || "Model".equals(str)) && u54Var.f(this.g).contains("PENTAX")) || ("Compression".equals(str) && u54Var.e(this.g) == 65535)) {
                                        this.d = 8;
                                    }
                                    if (x54Var.c != j6) {
                                        x54Var.b(j6);
                                    }
                                }
                            } else {
                                x54Var.b(j5);
                                s3 = s4;
                            }
                            s4 = (short) (s3 + 1);
                            i8 = i;
                            readShort = s2;
                            z4 = z2;
                        }
                    }
                    s2 = readShort;
                    z2 = z4;
                    i3 = readInt;
                    if (z2) {
                        Log.d("ExifInterface", "Skip the tag entry since data format is invalid: " + readUnsignedShort3);
                    }
                    i4 = readUnsignedShort3;
                    z3 = false;
                    j = 0;
                    if (z3) {
                    }
                    s4 = (short) (s3 + 1);
                    i8 = i;
                    readShort = s2;
                    z4 = z2;
                }
                i3 = readInt;
                i4 = readUnsignedShort3;
                z3 = false;
                j = 0;
                if (z3) {
                }
                s4 = (short) (s3 + 1);
                i8 = i;
                readShort = s2;
                z4 = z2;
            }
            boolean z5 = z4;
            int readInt3 = x54Var.readInt();
            if (z5) {
                Log.d("ExifInterface", String.format("nextIfdOffset: %d", Integer.valueOf(readInt3)));
            }
            long j7 = readInt3;
            if (j7 <= 0) {
                if (z5) {
                    Log.d("ExifInterface", "Stop reading file since a wrong offset may cause an infinite loop: " + readInt3);
                    return;
                }
                return;
            }
            if (hashSet.contains(Integer.valueOf(readInt3))) {
                if (z5) {
                    Log.d("ExifInterface", "Stop reading file since re-reading an IFD may cause an infinite loop: " + readInt3);
                    return;
                }
                return;
            }
            x54Var.b(j7);
            if (hashMapArr[4].isEmpty()) {
                v(x54Var, 4);
            } else if (hashMapArr[5].isEmpty()) {
                v(x54Var, 5);
            }
        }
    }

    public final void w(int i, String str, String str2) {
        HashMap[] hashMapArr = this.e;
        if (hashMapArr[i].isEmpty() || hashMapArr[i].get(str) == null) {
            return;
        }
        HashMap hashMap = hashMapArr[i];
        hashMap.put(str2, hashMap.get(str));
        hashMapArr[i].remove(str);
    }

    public final void x(t54 t54Var) {
        u54 u54Var;
        int e;
        HashMap hashMap = this.e[4];
        u54 u54Var2 = (u54) hashMap.get("Compression");
        if (u54Var2 == null) {
            n(t54Var, hashMap);
            return;
        }
        int e2 = u54Var2.e(this.g);
        if (e2 != 1) {
            if (e2 == 6) {
                n(t54Var, hashMap);
                return;
            } else if (e2 != 7) {
                return;
            }
        }
        u54 u54Var3 = (u54) hashMap.get("BitsPerSample");
        if (u54Var3 != null) {
            int[] iArr = (int[]) u54Var3.g(this.g);
            int[] iArr2 = p;
            if (Arrays.equals(iArr2, iArr) || (this.d == 3 && (u54Var = (u54) hashMap.get("PhotometricInterpretation")) != null && (((e = u54Var.e(this.g)) == 1 && Arrays.equals(iArr, q)) || (e == 6 && Arrays.equals(iArr, iArr2))))) {
                u54 u54Var4 = (u54) hashMap.get("StripOffsets");
                u54 u54Var5 = (u54) hashMap.get("StripByteCounts");
                if (u54Var4 == null || u54Var5 == null) {
                    return;
                }
                long[] b = lke.b(u54Var4.g(this.g));
                long[] b2 = lke.b(u54Var5.g(this.g));
                if (b == null || b.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (b2 == null || b2.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (b.length != b2.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j = 0;
                for (long j2 : b2) {
                    j += j2;
                }
                byte[] bArr = new byte[(int) j];
                this.h = true;
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < b.length; i3++) {
                    int i4 = (int) b[i3];
                    int i5 = (int) b2[i3];
                    if (i3 < b.length - 1 && i4 + i5 != b[i3 + 1]) {
                        this.h = false;
                    }
                    int i6 = i4 - i;
                    if (i6 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    long j3 = i6;
                    if (t54Var.skip(j3) != j3) {
                        Log.d("ExifInterface", "Failed to skip " + i6 + " bytes.");
                        return;
                    }
                    int i7 = i + i6;
                    byte[] bArr2 = new byte[i5];
                    if (t54Var.read(bArr2) != i5) {
                        Log.d("ExifInterface", "Failed to read " + i5 + " bytes.");
                        return;
                    }
                    i = i7 + i5;
                    System.arraycopy(bArr2, 0, bArr, i2, i5);
                    i2 += i5;
                }
                if (this.h) {
                    long j4 = b[0];
                    return;
                }
                return;
            }
        }
        if (m) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    public final void y(int i, int i2) {
        HashMap[] hashMapArr = this.e;
        boolean isEmpty = hashMapArr[i].isEmpty();
        boolean z2 = m;
        if (isEmpty || hashMapArr[i2].isEmpty()) {
            if (z2) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        u54 u54Var = (u54) hashMapArr[i].get("ImageLength");
        u54 u54Var2 = (u54) hashMapArr[i].get("ImageWidth");
        u54 u54Var3 = (u54) hashMapArr[i2].get("ImageLength");
        u54 u54Var4 = (u54) hashMapArr[i2].get("ImageWidth");
        if (u54Var == null || u54Var2 == null) {
            if (z2) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (u54Var3 == null || u54Var4 == null) {
            if (z2) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int e = u54Var.e(this.g);
        int e2 = u54Var2.e(this.g);
        int e3 = u54Var3.e(this.g);
        int e4 = u54Var4.e(this.g);
        if (e >= e3 || e2 >= e4) {
            return;
        }
        HashMap hashMap = hashMapArr[i];
        hashMapArr[i] = hashMapArr[i2];
        hashMapArr[i2] = hashMap;
    }

    public final void z(x54 x54Var, int i) {
        u54 c;
        u54 c2;
        HashMap[] hashMapArr = this.e;
        u54 u54Var = (u54) hashMapArr[i].get("DefaultCropSize");
        u54 u54Var2 = (u54) hashMapArr[i].get("SensorTopBorder");
        u54 u54Var3 = (u54) hashMapArr[i].get("SensorLeftBorder");
        u54 u54Var4 = (u54) hashMapArr[i].get("SensorBottomBorder");
        u54 u54Var5 = (u54) hashMapArr[i].get("SensorRightBorder");
        if (u54Var != null) {
            int i2 = u54Var.a;
            ByteOrder byteOrder = this.g;
            if (i2 == 5) {
                w54[] w54VarArr = (w54[]) u54Var.g(byteOrder);
                if (w54VarArr == null || w54VarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(w54VarArr));
                    return;
                }
                c = u54.b(w54VarArr[0], this.g);
                c2 = u54.b(w54VarArr[1], this.g);
            } else {
                int[] iArr = (int[]) u54Var.g(byteOrder);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                c = u54.c(iArr[0], this.g);
                c2 = u54.c(iArr[1], this.g);
            }
            hashMapArr[i].put("ImageWidth", c);
            hashMapArr[i].put("ImageLength", c2);
            return;
        }
        if (u54Var2 != null && u54Var3 != null && u54Var4 != null && u54Var5 != null) {
            int e = u54Var2.e(this.g);
            int e2 = u54Var4.e(this.g);
            int e3 = u54Var5.e(this.g);
            int e4 = u54Var3.e(this.g);
            if (e2 <= e || e3 <= e4) {
                return;
            }
            u54 c3 = u54.c(e2 - e, this.g);
            u54 c4 = u54.c(e3 - e4, this.g);
            hashMapArr[i].put("ImageLength", c3);
            hashMapArr[i].put("ImageWidth", c4);
            return;
        }
        u54 u54Var6 = (u54) hashMapArr[i].get("ImageLength");
        u54 u54Var7 = (u54) hashMapArr[i].get("ImageWidth");
        if (u54Var6 == null || u54Var7 == null) {
            u54 u54Var8 = (u54) hashMapArr[i].get("JPEGInterchangeFormat");
            u54 u54Var9 = (u54) hashMapArr[i].get("JPEGInterchangeFormatLength");
            if (u54Var8 == null || u54Var9 == null) {
                return;
            }
            int e5 = u54Var8.e(this.g);
            int e6 = u54Var8.e(this.g);
            x54Var.b(e5);
            byte[] bArr = new byte[e6];
            x54Var.read(bArr);
            f(new t54(bArr), e5, i);
        }
    }

    public y54(String str) {
        v54[][] v54VarArr = I;
        this.e = new HashMap[v54VarArr.length];
        this.f = new HashSet(v54VarArr.length);
        this.g = ByteOrder.BIG_ENDIAN;
        if (str != null) {
            o(str);
        } else {
            p3d.h("filename cannot be null");
            throw null;
        }
    }

    public y54(File file) {
        v54[][] v54VarArr = I;
        this.e = new HashMap[v54VarArr.length];
        this.f = new HashSet(v54VarArr.length);
        this.g = ByteOrder.BIG_ENDIAN;
        if (file != null) {
            o(file.getAbsolutePath());
        } else {
            p3d.h("file cannot be null");
            throw null;
        }
    }
}
