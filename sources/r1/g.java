package r1;

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
import k7.s6;
import kf.k0;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class g {
    public static final String[] E;
    public static final int[] F;
    public static final byte[] G;
    public static final d H;
    public static final d[][] I;
    public static final d[] J;
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
        d[] dVarArr = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d(256, 3, "ImageWidth", 4), new d(257, 3, "ImageLength", 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d(273, 3, "StripOffsets", 4), new d("Orientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d(278, 3, "RowsPerStrip", 4), new d(279, 3, "StripByteCounts", 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("SensorTopBorder", 4, 4), new d("SensorLeftBorder", 5, 4), new d("SensorBottomBorder", 6, 4), new d("SensorRightBorder", 7, 4), new d("ISO", 23, 3), new d("JpgFromRaw", 46, 7), new d("Xmp", 700, 1)};
        d[] dVarArr2 = {new d("ExposureTime", 33434, 5), new d("FNumber", 33437, 5), new d("ExposureProgram", 34850, 3), new d("SpectralSensitivity", 34852, 2), new d("PhotographicSensitivity", 34855, 3), new d("OECF", 34856, 7), new d("SensitivityType", 34864, 3), new d("StandardOutputSensitivity", 34865, 4), new d("RecommendedExposureIndex", 34866, 4), new d("ISOSpeed", 34867, 4), new d("ISOSpeedLatitudeyyy", 34868, 4), new d("ISOSpeedLatitudezzz", 34869, 4), new d("ExifVersion", 36864, 2), new d("DateTimeOriginal", 36867, 2), new d("DateTimeDigitized", 36868, 2), new d("OffsetTime", 36880, 2), new d("OffsetTimeOriginal", 36881, 2), new d("OffsetTimeDigitized", 36882, 2), new d("ComponentsConfiguration", 37121, 7), new d("CompressedBitsPerPixel", 37122, 5), new d("ShutterSpeedValue", 37377, 10), new d("ApertureValue", 37378, 5), new d("BrightnessValue", 37379, 10), new d("ExposureBiasValue", 37380, 10), new d("MaxApertureValue", 37381, 5), new d("SubjectDistance", 37382, 5), new d("MeteringMode", 37383, 3), new d("LightSource", 37384, 3), new d("Flash", 37385, 3), new d("FocalLength", 37386, 5), new d("SubjectArea", 37396, 3), new d("MakerNote", 37500, 7), new d("UserComment", 37510, 7), new d("SubSecTime", 37520, 2), new d("SubSecTimeOriginal", 37521, 2), new d("SubSecTimeDigitized", 37522, 2), new d("FlashpixVersion", 40960, 7), new d("ColorSpace", 40961, 3), new d(40962, 3, "PixelXDimension", 4), new d(40963, 3, "PixelYDimension", 4), new d("RelatedSoundFile", 40964, 2), new d("InteroperabilityIFDPointer", 40965, 4), new d("FlashEnergy", 41483, 5), new d("SpatialFrequencyResponse", 41484, 7), new d("FocalPlaneXResolution", 41486, 5), new d("FocalPlaneYResolution", 41487, 5), new d("FocalPlaneResolutionUnit", 41488, 3), new d("SubjectLocation", 41492, 3), new d("ExposureIndex", 41493, 5), new d("SensingMethod", 41495, 3), new d("FileSource", 41728, 7), new d("SceneType", 41729, 7), new d("CFAPattern", 41730, 7), new d("CustomRendered", 41985, 3), new d("ExposureMode", 41986, 3), new d("WhiteBalance", 41987, 3), new d("DigitalZoomRatio", 41988, 5), new d("FocalLengthIn35mmFilm", 41989, 3), new d("SceneCaptureType", 41990, 3), new d("GainControl", 41991, 3), new d("Contrast", 41992, 3), new d("Saturation", 41993, 3), new d("Sharpness", 41994, 3), new d("DeviceSettingDescription", 41995, 7), new d("SubjectDistanceRange", 41996, 3), new d("ImageUniqueID", 42016, 2), new d("CameraOwnerName", 42032, 2), new d("BodySerialNumber", 42033, 2), new d("LensSpecification", 42034, 5), new d("LensMake", 42035, 2), new d("LensModel", 42036, 2), new d("Gamma", 42240, 5), new d("DNGVersion", 50706, 1), new d(50720, 3, "DefaultCropSize", 4)};
        d[] dVarArr3 = {new d("GPSVersionID", 0, 1), new d("GPSLatitudeRef", 1, 2), new d(2, 5, "GPSLatitude", 10), new d("GPSLongitudeRef", 3, 2), new d(4, 5, "GPSLongitude", 10), new d("GPSAltitudeRef", 5, 1), new d("GPSAltitude", 6, 5), new d("GPSTimeStamp", 7, 5), new d("GPSSatellites", 8, 2), new d("GPSStatus", 9, 2), new d("GPSMeasureMode", 10, 2), new d("GPSDOP", 11, 5), new d("GPSSpeedRef", 12, 2), new d("GPSSpeed", 13, 5), new d("GPSTrackRef", 14, 2), new d("GPSTrack", 15, 5), new d("GPSImgDirectionRef", 16, 2), new d("GPSImgDirection", 17, 5), new d("GPSMapDatum", 18, 2), new d("GPSDestLatitudeRef", 19, 2), new d("GPSDestLatitude", 20, 5), new d("GPSDestLongitudeRef", 21, 2), new d("GPSDestLongitude", 22, 5), new d("GPSDestBearingRef", 23, 2), new d("GPSDestBearing", 24, 5), new d("GPSDestDistanceRef", 25, 2), new d("GPSDestDistance", 26, 5), new d("GPSProcessingMethod", 27, 7), new d("GPSAreaInformation", 28, 7), new d("GPSDateStamp", 29, 2), new d("GPSDifferential", 30, 3), new d("GPSHPositioningError", 31, 5)};
        d[] dVarArr4 = {new d("InteroperabilityIndex", 1, 2)};
        d[] dVarArr5 = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d(256, 3, "ThumbnailImageWidth", 4), new d(257, 3, "ThumbnailImageLength", 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d(273, 3, "StripOffsets", 4), new d("ThumbnailOrientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d(278, 3, "RowsPerStrip", 4), new d(279, 3, "StripByteCounts", 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("DNGVersion", 50706, 1), new d(50720, 3, "DefaultCropSize", 4)};
        H = new d("StripOffsets", 273, 3);
        I = new d[][]{dVarArr, dVarArr2, dVarArr3, dVarArr4, dVarArr5, dVarArr, new d[]{new d("ThumbnailImage", 256, 7), new d("CameraSettingsIFDPointer", 8224, 4), new d("ImageProcessingIFDPointer", 8256, 4)}, new d[]{new d("PreviewImageStart", 257, 4), new d("PreviewImageLength", 258, 4)}, new d[]{new d("AspectFrame", 4371, 3)}, new d[]{new d("ColorSpace", 55, 3)}};
        J = new d[]{new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1)};
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
        int i10 = 0;
        while (true) {
            d[][] dVarArr6 = I;
            if (i10 >= dVarArr6.length) {
                HashMap hashMap = N;
                d[] dVarArr7 = J;
                hashMap.put(Integer.valueOf(dVarArr7[0].a), 5);
                hashMap.put(Integer.valueOf(dVarArr7[1].a), 1);
                hashMap.put(Integer.valueOf(dVarArr7[2].a), 2);
                hashMap.put(Integer.valueOf(dVarArr7[3].a), 3);
                hashMap.put(Integer.valueOf(dVarArr7[4].a), 7);
                hashMap.put(Integer.valueOf(dVarArr7[5].a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            K[i10] = new HashMap();
            L[i10] = new HashMap();
            for (d dVar : dVarArr6[i10]) {
                K[i10].put(Integer.valueOf(dVar.a), dVar);
                L[i10].put(dVar.b, dVar);
            }
            i10++;
        }
    }

    public g(File file) {
        d[][] dVarArr = I;
        this.e = new HashMap[dVarArr.length];
        this.f = new HashSet(dVarArr.length);
        this.g = ByteOrder.BIG_ENDIAN;
        if (file == null) {
            throw new NullPointerException("file cannot be null");
        }
        n(file.getAbsolutePath());
    }

    public static ByteOrder s(b bVar) {
        short readShort = bVar.readShort();
        boolean z4 = m;
        if (readShort == 18761) {
            if (z4) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            if (z4) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
    }

    public final void a() {
        String b10 = b("DateTimeOriginal");
        HashMap[] hashMapArr = this.e;
        if (b10 != null && b("DateTime") == null) {
            HashMap hashMap = hashMapArr[0];
            byte[] bytes = b10.concat(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR).getBytes(O);
            hashMap.put("DateTime", new c(2, bytes.length, bytes));
        }
        if (b("ImageWidth") == null) {
            hashMapArr[0].put("ImageWidth", c.a(0L, this.g));
        }
        if (b("ImageLength") == null) {
            hashMapArr[0].put("ImageLength", c.a(0L, this.g));
        }
        if (b("Orientation") == null) {
            hashMapArr[0].put("Orientation", c.a(0L, this.g));
        }
        if (b("LightSource") == null) {
            hashMapArr[1].put("LightSource", c.a(0L, this.g));
        }
    }

    public final String b(String str) {
        c c3 = c(str);
        if (c3 != null) {
            int i10 = c3.a;
            if (!M.contains(str)) {
                return c3.f(this.g);
            }
            if (str.equals("GPSTimeStamp")) {
                if (i10 != 5 && i10 != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i10);
                    return null;
                }
                e[] eVarArr = (e[]) c3.g(this.g);
                if (eVarArr == null || eVarArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(eVarArr));
                    return null;
                }
                e eVar = eVarArr[0];
                Integer valueOf = Integer.valueOf((int) (eVar.a / eVar.b));
                e eVar2 = eVarArr[1];
                Integer valueOf2 = Integer.valueOf((int) (eVar2.a / eVar2.b));
                e eVar3 = eVarArr[2];
                return String.format("%02d:%02d:%02d", valueOf, valueOf2, Integer.valueOf((int) (eVar3.a / eVar3.b)));
            }
            try {
                return Double.toString(c3.d(this.g));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final c c(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (m) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i10 = 0; i10 < I.length; i10++) {
            c cVar = (c) this.e[i10].get(str);
            if (cVar != null) {
                return cVar;
            }
        }
        return null;
    }

    public final void d(f fVar) {
        String str;
        String str2;
        String str3;
        if (Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                i.a(mediaMetadataRetriever, new a(fVar));
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
                    hashMapArr[0].put("ImageWidth", c.c(Integer.parseInt(str), this.g));
                }
                if (str2 != null) {
                    hashMapArr[0].put("ImageLength", c.c(Integer.parseInt(str2), this.g));
                }
                if (str3 != null) {
                    int parseInt = Integer.parseInt(str3);
                    hashMapArr[0].put("Orientation", c.c(parseInt != 90 ? parseInt != 180 ? parseInt != 270 ? 1 : 8 : 3 : 6, this.g));
                }
                if (extractMetadata != null && extractMetadata2 != null) {
                    int parseInt2 = Integer.parseInt(extractMetadata);
                    int parseInt3 = Integer.parseInt(extractMetadata2);
                    if (parseInt3 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    fVar.b(parseInt2);
                    byte[] bArr = new byte[6];
                    if (fVar.read(bArr) != 6) {
                        throw new IOException("Can't read identifier");
                    }
                    int i10 = parseInt2 + 6;
                    int i11 = parseInt3 - 6;
                    if (!Arrays.equals(bArr, P)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i11];
                    if (fVar.read(bArr2) != i11) {
                        throw new IOException("Can't read exif");
                    }
                    this.i = i10;
                    t(0, bArr2);
                }
                if (m) {
                    Log.d("ExifInterface", "Heif meta: " + str + "x" + str2 + ", rotation " + str3);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th2) {
            mediaMetadataRetriever.release();
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x01a2, code lost:
    
        r23.b = r22.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01a6, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x018e A[LOOP:0: B:9:0x0034->B:32:0x018e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0196 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(b bVar, int i10, int i11) {
        boolean z4 = m;
        if (z4) {
            Log.d("ExifInterface", "getJpegAttributes starting with: " + bVar);
        }
        bVar.b = ByteOrder.BIG_ENDIAN;
        byte readByte = bVar.readByte();
        byte b10 = -1;
        if (readByte != -1) {
            throw new IOException("Invalid marker: " + Integer.toHexString(readByte & 255));
        }
        if (bVar.readByte() != -40) {
            throw new IOException("Invalid marker: " + Integer.toHexString(readByte & 255));
        }
        int i12 = 2;
        int i13 = 2;
        while (true) {
            byte readByte2 = bVar.readByte();
            if (readByte2 != b10) {
                throw new IOException("Invalid marker:" + Integer.toHexString(readByte2 & 255));
            }
            byte readByte3 = bVar.readByte();
            if (z4) {
                Log.d("ExifInterface", "Found JPEG segment indicator: " + Integer.toHexString(readByte3 & 255));
            }
            if (readByte3 != -39 && readByte3 != -38) {
                int readUnsignedShort = bVar.readUnsignedShort();
                int i14 = readUnsignedShort - 2;
                int i15 = i13 + 4;
                if (z4) {
                    Log.d("ExifInterface", "JPEG segment: " + Integer.toHexString(readByte3 & 255) + " (length: " + readUnsignedShort + ")");
                }
                if (i14 < 0) {
                    throw new IOException("Invalid length");
                }
                char c3 = 0;
                HashMap[] hashMapArr = this.e;
                if (readByte3 == -31) {
                    byte[] bArr = new byte[i14];
                    bVar.readFully(bArr);
                    int i16 = i15 + i14;
                    byte[] bArr2 = P;
                    if (bArr2 != null && i14 >= bArr2.length) {
                        int i17 = 0;
                        while (i17 < bArr2.length) {
                            if (bArr[i17] == bArr2[i17]) {
                                i17++;
                                c3 = 0;
                            }
                        }
                        byte[] copyOfRange = Arrays.copyOfRange(bArr, bArr2.length, i14);
                        this.i = i10 + i15 + bArr2.length;
                        t(i11, copyOfRange);
                        w(new b(copyOfRange));
                        i15 = i16;
                    }
                    byte[] bArr3 = Q;
                    if (bArr3 != null && i14 >= bArr3.length) {
                        int i18 = 0;
                        while (true) {
                            if (i18 >= bArr3.length) {
                                int length = i15 + bArr3.length;
                                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, bArr3.length, i14);
                                if (b("Xmp") == null) {
                                    hashMapArr[c3].put("Xmp", new c(length, copyOfRange2, 1, copyOfRange2.length));
                                }
                            } else if (bArr[i18] == bArr3[i18]) {
                                i18++;
                            }
                        }
                    }
                    i15 = i16;
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
                                            bVar.a(1);
                                            hashMapArr[i11].put(i11 != 4 ? "ImageLength" : "ThumbnailImageLength", c.a(bVar.readUnsignedShort(), this.g));
                                            hashMapArr[i11].put(i11 != 4 ? "ImageWidth" : "ThumbnailImageWidth", c.a(bVar.readUnsignedShort(), this.g));
                                            i14 = readUnsignedShort - 7;
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
                    if (i14 >= 0) {
                        throw new IOException("Invalid length");
                    }
                    bVar.a(i14);
                    i13 = i15 + i14;
                    i12 = 2;
                    b10 = -1;
                } else {
                    byte[] bArr4 = new byte[i14];
                    if (bVar.read(bArr4) != i14) {
                        throw new IOException("Invalid exif");
                    }
                    if (b("UserComment") == null) {
                        HashMap hashMap = hashMapArr[1];
                        Charset charset = O;
                        byte[] bytes = new String(bArr4, charset).concat(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR).getBytes(charset);
                        hashMap.put("UserComment", new c(i12, bytes.length, bytes));
                    }
                }
                i14 = 0;
                if (i14 >= 0) {
                }
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:14|15|(4:16|17|18|19)|(16:107|(2:109|110)(1:153)|112|113|(1:115)|116|(3:119|120|(4:125|(3:130|(1:132)(2:140|(1:142))|(3:135|136|137))(2:127|128)|129|121))|118|22|23|24|25|26|(1:92)(1:30)|31|(1:33)(8:35|36|37|38|39|(1:41)(1:77)|42|(1:44)(3:45|(2:46|(2:48|(2:51|52)(1:50))(2:75|76))|(1:54)(4:55|(2:56|(2:58|(1:61)(1:60))(3:66|67|(2:68|(1:74)(2:70|(1:73)(1:72)))))|62|(1:64)(1:65)))))|21|22|23|24|25|26|(1:28)|92|31|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(17:14|15|16|17|18|19|(16:107|(2:109|110)(1:153)|112|113|(1:115)|116|(3:119|120|(4:125|(3:130|(1:132)(2:140|(1:142))|(3:135|136|137))(2:127|128)|129|121))|118|22|23|24|25|26|(1:92)(1:30)|31|(1:33)(8:35|36|37|38|39|(1:41)(1:77)|42|(1:44)(3:45|(2:46|(2:48|(2:51|52)(1:50))(2:75|76))|(1:54)(4:55|(2:56|(2:58|(1:61)(1:60))(3:66|67|(2:68|(1:74)(2:70|(1:73)(1:72)))))|62|(1:64)(1:65)))))|21|22|23|24|25|26|(1:28)|92|31|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x00fd, code lost:
    
        if (r5 != null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x00ff, code lost:
    
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0102, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x00fa, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x00f7, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x00f8, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0061, code lost:
    
        if (r9 < 16) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x00ce, code lost:
    
        if (r8 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0103, code lost:
    
        if (r2 != null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0105, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0108, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x00f2, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x00f3, code lost:
    
        r5 = r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0143 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(BufferedInputStream bufferedInputStream) {
        b bVar;
        int i10;
        b bVar2;
        boolean z4;
        b bVar3;
        b bVar4;
        boolean z10;
        boolean z11;
        long readInt;
        byte[] bArr;
        long j10;
        bufferedInputStream.mark(5000);
        byte[] bArr2 = new byte[5000];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i11 = 0;
        while (true) {
            byte[] bArr3 = r;
            if (i11 >= bArr3.length) {
                return 4;
            }
            if (bArr2[i11] != bArr3[i11]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i12 = 0; i12 < bytes.length; i12++) {
                    if (bArr2[i12] != bytes[i12]) {
                        boolean z12 = true;
                        try {
                            bVar2 = new b(bArr2);
                            try {
                                try {
                                    readInt = bVar2.readInt();
                                    bArr = new byte[4];
                                    bVar2.read(bArr);
                                } catch (Exception e) {
                                    e = e;
                                    i10 = 0;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                bVar = bVar2;
                                if (bVar != null) {
                                    bVar.close();
                                }
                                throw th;
                            }
                        } catch (Exception e6) {
                            e = e6;
                            i10 = 0;
                            bVar2 = null;
                        } catch (Throwable th3) {
                            th = th3;
                            bVar = null;
                        }
                        if (Arrays.equals(bArr, s)) {
                            if (readInt == 1) {
                                readInt = bVar2.readLong();
                                j10 = 16;
                            } else {
                                j10 = 8;
                            }
                            i10 = 0;
                            long j11 = 5000;
                            if (readInt > j11) {
                                readInt = j11;
                            }
                            long j12 = readInt - j10;
                            if (j12 >= 8) {
                                try {
                                    byte[] bArr4 = new byte[4];
                                    boolean z13 = false;
                                    boolean z14 = false;
                                    for (long j13 = 0; j13 < j12 / 4 && bVar2.read(bArr4) == 4; j13++) {
                                        if (j13 != 1) {
                                            if (Arrays.equals(bArr4, t)) {
                                                z13 = true;
                                            } else if (Arrays.equals(bArr4, u)) {
                                                z14 = true;
                                            }
                                            if (z13 && z14) {
                                                bVar2.close();
                                                return 12;
                                            }
                                        }
                                    }
                                } catch (Exception e10) {
                                    e = e10;
                                    if (m) {
                                        Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                                    }
                                }
                            }
                            bVar2.close();
                            b bVar5 = new b(bArr2);
                            ByteOrder s6 = s(bVar5);
                            this.g = s6;
                            bVar5.b = s6;
                            short readShort = bVar5.readShort();
                            z4 = readShort != 20306 || readShort == 21330;
                            bVar5.close();
                            if (z4) {
                                return 7;
                            }
                            try {
                                b bVar6 = new b(bArr2);
                                try {
                                    ByteOrder s9 = s(bVar6);
                                    this.g = s9;
                                    bVar6.b = s9;
                                    z10 = bVar6.readShort() == 85;
                                    bVar6.close();
                                } catch (Exception unused) {
                                    bVar4 = bVar6;
                                    if (bVar4 != null) {
                                        bVar4.close();
                                    }
                                    z10 = false;
                                    if (!z10) {
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    bVar3 = bVar6;
                                    if (bVar3 != null) {
                                        bVar3.close();
                                    }
                                    throw th;
                                }
                            } catch (Exception unused2) {
                                bVar4 = null;
                            } catch (Throwable th5) {
                                th = th5;
                                bVar3 = null;
                            }
                            if (!z10) {
                                return 10;
                            }
                            int i13 = 0;
                            while (true) {
                                byte[] bArr5 = x;
                                if (i13 >= bArr5.length) {
                                    z11 = true;
                                    break;
                                }
                                if (bArr2[i13] != bArr5[i13]) {
                                    z11 = false;
                                    break;
                                }
                                i13++;
                            }
                            if (z11) {
                                return 13;
                            }
                            int i14 = 0;
                            while (true) {
                                byte[] bArr6 = B;
                                if (i14 >= bArr6.length) {
                                    int i15 = 0;
                                    while (true) {
                                        byte[] bArr7 = C;
                                        if (i15 >= bArr7.length) {
                                            break;
                                        }
                                        if (bArr2[bArr6.length + i15 + 4] != bArr7[i15]) {
                                            break;
                                        }
                                        i15++;
                                    }
                                } else {
                                    if (bArr2[i14] != bArr6[i14]) {
                                        break;
                                    }
                                    i14++;
                                }
                            }
                            z12 = false;
                            if (z12) {
                                return 14;
                            }
                            return i10;
                        }
                        bVar2.close();
                        i10 = 0;
                        b bVar52 = new b(bArr2);
                        ByteOrder s62 = s(bVar52);
                        this.g = s62;
                        bVar52.b = s62;
                        short readShort2 = bVar52.readShort();
                        if (readShort2 != 20306) {
                        }
                        bVar52.close();
                        if (z4) {
                        }
                    }
                }
                return 9;
            }
            i11++;
        }
    }

    public final void g(f fVar) {
        int i10;
        int i11;
        j(fVar);
        HashMap[] hashMapArr = this.e;
        c cVar = (c) hashMapArr[1].get("MakerNote");
        if (cVar != null) {
            f fVar2 = new f(cVar.d);
            fVar2.b = this.g;
            byte[] bArr = v;
            byte[] bArr2 = new byte[bArr.length];
            fVar2.readFully(bArr2);
            fVar2.b(0L);
            byte[] bArr3 = w;
            byte[] bArr4 = new byte[bArr3.length];
            fVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                fVar2.b(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                fVar2.b(12L);
            }
            u(fVar2, 6);
            c cVar2 = (c) hashMapArr[7].get("PreviewImageStart");
            c cVar3 = (c) hashMapArr[7].get("PreviewImageLength");
            if (cVar2 != null && cVar3 != null) {
                hashMapArr[5].put("JPEGInterchangeFormat", cVar2);
                hashMapArr[5].put("JPEGInterchangeFormatLength", cVar3);
            }
            c cVar4 = (c) hashMapArr[8].get("AspectFrame");
            if (cVar4 != null) {
                int[] iArr = (int[]) cVar4.g(this.g);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i12 = iArr[2];
                int i13 = iArr[0];
                if (i12 <= i13 || (i10 = iArr[3]) <= (i11 = iArr[1])) {
                    return;
                }
                int i14 = (i12 - i13) + 1;
                int i15 = (i10 - i11) + 1;
                if (i14 < i15) {
                    int i16 = i14 + i15;
                    i15 = i16 - i15;
                    i14 = i16 - i15;
                }
                c c3 = c.c(i14, this.g);
                c c10 = c.c(i15, this.g);
                hashMapArr[0].put("ImageWidth", c3);
                hashMapArr[0].put("ImageLength", c10);
            }
        }
    }

    public final void h(b bVar) {
        if (m) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.b = ByteOrder.BIG_ENDIAN;
        byte[] bArr = x;
        bVar.a(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int readInt = bVar.readInt();
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i10 = length + 8;
                if (i10 == 16 && !Arrays.equals(bArr2, z)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, A)) {
                    return;
                }
                if (Arrays.equals(bArr2, y)) {
                    byte[] bArr3 = new byte[readInt];
                    if (bVar.read(bArr3) != readInt) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + s6.a(bArr2));
                    }
                    int readInt2 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == readInt2) {
                        this.i = i10;
                        t(0, bArr3);
                        z();
                        w(new b(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                }
                int i11 = readInt + 4;
                bVar.a(i11);
                length = i10 + i11;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void i(b bVar) {
        boolean z4 = m;
        if (z4) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.a(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.read(bArr);
        bVar.read(bArr2);
        bVar.read(bArr3);
        int i10 = ByteBuffer.wrap(bArr).getInt();
        int i11 = ByteBuffer.wrap(bArr2).getInt();
        int i12 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i11];
        bVar.a(i10 - bVar.c);
        bVar.read(bArr4);
        e(new b(bArr4), i10, 5);
        bVar.a(i12 - bVar.c);
        bVar.b = ByteOrder.BIG_ENDIAN;
        int readInt = bVar.readInt();
        if (z4) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i13 = 0; i13 < readInt; i13++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == H.a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                c c3 = c.c(readShort, this.g);
                c c10 = c.c(readShort2, this.g);
                HashMap[] hashMapArr = this.e;
                hashMapArr[0].put("ImageLength", c3);
                hashMapArr[0].put("ImageWidth", c10);
                if (z4) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            bVar.a(readUnsignedShort2);
        }
    }

    public final void j(f fVar) {
        q(fVar);
        u(fVar, 0);
        y(fVar, 0);
        y(fVar, 5);
        y(fVar, 4);
        z();
        if (this.d == 8) {
            HashMap[] hashMapArr = this.e;
            c cVar = (c) hashMapArr[1].get("MakerNote");
            if (cVar != null) {
                f fVar2 = new f(cVar.d);
                fVar2.b = this.g;
                fVar2.a(6);
                u(fVar2, 9);
                c cVar2 = (c) hashMapArr[9].get("ColorSpace");
                if (cVar2 != null) {
                    hashMapArr[1].put("ColorSpace", cVar2);
                }
            }
        }
    }

    public final void k(f fVar) {
        if (m) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + fVar);
        }
        j(fVar);
        HashMap[] hashMapArr = this.e;
        c cVar = (c) hashMapArr[0].get("JpgFromRaw");
        if (cVar != null) {
            e(new b(cVar.d), (int) cVar.c, 5);
        }
        c cVar2 = (c) hashMapArr[0].get("ISO");
        c cVar3 = (c) hashMapArr[1].get("PhotographicSensitivity");
        if (cVar2 == null || cVar3 != null) {
            return;
        }
        hashMapArr[1].put("PhotographicSensitivity", cVar2);
    }

    public final void l(b bVar) {
        if (m) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.b = ByteOrder.LITTLE_ENDIAN;
        bVar.a(B.length);
        int readInt = bVar.readInt() + 8;
        byte[] bArr = C;
        bVar.a(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int readInt2 = bVar.readInt();
                int i10 = length + 8;
                if (Arrays.equals(D, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    if (bVar.read(bArr3) == readInt2) {
                        this.i = i10;
                        t(0, bArr3);
                        w(new b(bArr3));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + s6.a(bArr2));
                    }
                }
                if (readInt2 % 2 == 1) {
                    readInt2++;
                }
                length = i10 + readInt2;
                if (length == readInt) {
                    return;
                }
                if (length > readInt) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.a(readInt2);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void m(b bVar, HashMap hashMap) {
        c cVar = (c) hashMap.get("JPEGInterchangeFormat");
        c cVar2 = (c) hashMap.get("JPEGInterchangeFormatLength");
        if (cVar == null || cVar2 == null) {
            return;
        }
        int e = cVar.e(this.g);
        int e6 = cVar2.e(this.g);
        if (this.d == 7) {
            e += this.j;
        }
        if (e > 0 && e6 > 0 && this.a == null && this.c == null && this.b == null) {
            bVar.skip(e);
            bVar.read(new byte[e6]);
        }
        if (m) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + e + ", length: " + e6);
        }
    }

    public final void n(String str) {
        FileInputStream fileInputStream;
        boolean z4;
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        FileInputStream fileInputStream2 = null;
        this.c = null;
        this.a = str;
        try {
            fileInputStream = new FileInputStream(str);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            try {
                h.c(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                z4 = true;
            } catch (Exception unused) {
                if (m) {
                    Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                }
                z4 = false;
            }
            if (z4) {
                this.b = fileInputStream.getFD();
            } else {
                this.b = null;
            }
            p(fileInputStream);
            try {
                fileInputStream.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused2) {
            }
        } catch (Throwable th3) {
            th = th3;
            fileInputStream2 = fileInputStream;
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (RuntimeException e6) {
                    throw e6;
                } catch (Exception unused3) {
                }
            }
            throw th;
        }
    }

    public final boolean o(HashMap hashMap) {
        c cVar = (c) hashMap.get("ImageLength");
        c cVar2 = (c) hashMap.get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            return false;
        }
        return cVar.e(this.g) <= 512 && cVar2.e(this.g) <= 512;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0091 A[Catch: all -> 0x0017, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0017, blocks: (B:5:0x0006, B:7:0x000b, B:9:0x0020, B:15:0x003d, B:17:0x0048, B:18:0x005e, B:27:0x004f, B:30:0x0057, B:31:0x005b, B:32:0x0068, B:34:0x0071, B:36:0x0077, B:38:0x007d, B:40:0x0083, B:50:0x0091), top: B:4:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(InputStream inputStream) {
        boolean z4 = m;
        if (inputStream == null) {
            throw new NullPointerException("inputstream shouldn't be null");
        }
        for (int i10 = 0; i10 < I.length; i10++) {
            try {
                try {
                    this.e[i10] = new HashMap();
                } catch (Throwable th2) {
                    a();
                    if (z4) {
                        r();
                    }
                    throw th2;
                }
            } catch (IOException e) {
                e = e;
                if (z4) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                a();
                if (z4) {
                    return;
                }
                r();
                return;
            } catch (UnsupportedOperationException e6) {
                e = e6;
                if (z4) {
                }
                a();
                if (z4) {
                }
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
        int f10 = f(bufferedInputStream);
        this.d = f10;
        if (f10 != 4 && f10 != 9 && f10 != 13 && f10 != 14) {
            f fVar = new f(bufferedInputStream);
            int i11 = this.d;
            if (i11 == 12) {
                d(fVar);
            } else if (i11 == 7) {
                g(fVar);
            } else if (i11 == 10) {
                k(fVar);
            } else {
                j(fVar);
            }
            fVar.b(this.i);
            w(fVar);
            a();
            if (z4) {
                return;
            }
            r();
            return;
        }
        b bVar = new b(bufferedInputStream);
        int i12 = this.d;
        if (i12 == 4) {
            e(bVar, 0, 0);
        } else if (i12 == 13) {
            h(bVar);
        } else if (i12 == 9) {
            i(bVar);
        } else if (i12 == 14) {
            l(bVar);
        }
        a();
        if (z4) {
        }
    }

    public final void q(f fVar) {
        ByteOrder s6 = s(fVar);
        this.g = s6;
        fVar.b = s6;
        int readUnsignedShort = fVar.readUnsignedShort();
        int i10 = this.d;
        if (i10 != 7 && i10 != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = fVar.readInt();
        if (readInt < 8) {
            throw new IOException(k0.j(readInt, "Invalid first Ifd offset: "));
        }
        int i11 = readInt - 8;
        if (i11 > 0) {
            fVar.a(i11);
        }
    }

    public final void r() {
        int i10 = 0;
        while (true) {
            HashMap[] hashMapArr = this.e;
            if (i10 >= hashMapArr.length) {
                return;
            }
            StringBuilder m9 = k0.m(i10, "The size of tag group[", "]: ");
            m9.append(hashMapArr[i10].size());
            Log.d("ExifInterface", m9.toString());
            for (Map.Entry entry : hashMapArr[i10].entrySet()) {
                c cVar = (c) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + cVar.toString() + ", tagValue: '" + cVar.f(this.g) + "'");
            }
            i10++;
        }
    }

    public final void t(int i10, byte[] bArr) {
        f fVar = new f(bArr);
        q(fVar);
        u(fVar, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(f fVar, int i10) {
        HashMap[] hashMapArr;
        short s6;
        boolean z4;
        int i11;
        int i12;
        long j10;
        long j11;
        boolean z10;
        int i13;
        int i14;
        short s9;
        long j12;
        HashMap[] hashMapArr2;
        int i15;
        int readUnsignedShort;
        long j13;
        int i16 = i10;
        Integer valueOf = Integer.valueOf(fVar.c);
        HashSet hashSet = this.f;
        hashSet.add(valueOf);
        short readShort = fVar.readShort();
        boolean z11 = m;
        if (z11) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + ((int) readShort));
        }
        if (readShort <= 0) {
            return;
        }
        short s10 = 0;
        while (true) {
            hashMapArr = this.e;
            if (s10 >= readShort) {
                break;
            }
            int readUnsignedShort2 = fVar.readUnsignedShort();
            int readUnsignedShort3 = fVar.readUnsignedShort();
            int readInt = fVar.readInt();
            long j14 = fVar.c + 4;
            d dVar = (d) K[i16].get(Integer.valueOf(readUnsignedShort2));
            if (z11) {
                Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i16), Integer.valueOf(readUnsignedShort2), dVar != null ? dVar.b : null, Integer.valueOf(readUnsignedShort3), Integer.valueOf(readInt)));
            }
            if (dVar == null) {
                if (z11) {
                    Log.d("ExifInterface", "Skip the tag entry since tag number is not defined: " + readUnsignedShort2);
                }
                s6 = readShort;
                z4 = z11;
            } else {
                if (readUnsignedShort3 > 0) {
                    if (readUnsignedShort3 < F.length) {
                        i12 = dVar.c;
                        s6 = readShort;
                        if (i12 == 7 || readUnsignedShort3 == 7 || i12 == readUnsignedShort3 || (i13 = dVar.d) == readUnsignedShort3) {
                            z4 = z11;
                        } else {
                            z4 = z11;
                            if (((i12 != 4 && i13 != 4) || readUnsignedShort3 != 3) && (((i12 != 9 && i13 != 9) || readUnsignedShort3 != 8) && ((i12 != 12 && i13 != 12) || readUnsignedShort3 != 11))) {
                                if (z4) {
                                    Log.d("ExifInterface", "Skip the tag entry since data format (" + E[readUnsignedShort3] + ") is unexpected for tag: " + dVar.b);
                                }
                            }
                        }
                        if (readUnsignedShort3 != 7) {
                            i12 = readUnsignedShort3;
                        }
                        i11 = readInt;
                        j10 = r9[i12] * i11;
                        if (j10 < 0 || j10 > 2147483647L) {
                            if (z4) {
                                j11 = j10;
                                Log.d("ExifInterface", "Skip the tag entry since the number of components is invalid: " + i11);
                            } else {
                                j11 = j10;
                            }
                            j10 = j11;
                            z10 = false;
                            if (z10) {
                                fVar.b(j14);
                                s9 = s10;
                            } else {
                                if (j10 > 4) {
                                    s9 = s10;
                                    int readInt2 = fVar.readInt();
                                    hashMapArr2 = hashMapArr;
                                    if (z4) {
                                        i15 = readUnsignedShort2;
                                        Log.d("ExifInterface", "seek to data offset: " + readInt2);
                                    } else {
                                        i15 = readUnsignedShort2;
                                    }
                                    if (this.d == 7) {
                                        if ("MakerNote".equals(dVar.b)) {
                                            this.j = readInt2;
                                        } else if (i16 == 6 && "ThumbnailImage".equals(dVar.b)) {
                                            this.k = readInt2;
                                            this.l = i11;
                                            c c3 = c.c(6, this.g);
                                            i14 = i11;
                                            c a2 = c.a(this.k, this.g);
                                            j12 = j14;
                                            c a10 = c.a(this.l, this.g);
                                            hashMapArr2[4].put("Compression", c3);
                                            hashMapArr2[4].put("JPEGInterchangeFormat", a2);
                                            hashMapArr2[4].put("JPEGInterchangeFormatLength", a10);
                                            fVar.b(readInt2);
                                        }
                                    }
                                    i14 = i11;
                                    j12 = j14;
                                    fVar.b(readInt2);
                                } else {
                                    i14 = i11;
                                    s9 = s10;
                                    j12 = j14;
                                    hashMapArr2 = hashMapArr;
                                    i15 = readUnsignedShort2;
                                }
                                Integer num = (Integer) N.get(Integer.valueOf(i15));
                                if (z4) {
                                    Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j10);
                                }
                                if (num != null) {
                                    if (i12 != 3) {
                                        if (i12 == 4) {
                                            j13 = fVar.readInt() & 4294967295L;
                                        } else if (i12 == 8) {
                                            readUnsignedShort = fVar.readShort();
                                        } else if (i12 == 9 || i12 == 13) {
                                            readUnsignedShort = fVar.readInt();
                                        } else {
                                            j13 = -1;
                                        }
                                        if (z4) {
                                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j13), dVar.b));
                                        }
                                        if (j13 <= 0) {
                                            if (!hashSet.contains(Integer.valueOf((int) j13))) {
                                                fVar.b(j13);
                                                u(fVar, num.intValue());
                                            } else if (z4) {
                                                Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j13 + ")");
                                            }
                                        } else if (z4) {
                                            Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j13);
                                        }
                                        fVar.b(j12);
                                    } else {
                                        readUnsignedShort = fVar.readUnsignedShort();
                                    }
                                    j13 = readUnsignedShort;
                                    if (z4) {
                                    }
                                    if (j13 <= 0) {
                                    }
                                    fVar.b(j12);
                                } else {
                                    long j15 = j12;
                                    int i17 = fVar.c + this.i;
                                    byte[] bArr = new byte[(int) j10];
                                    fVar.readFully(bArr);
                                    c cVar = new c(i17, bArr, i12, i14);
                                    HashMap hashMap = hashMapArr2[i10];
                                    String str = dVar.b;
                                    hashMap.put(str, cVar);
                                    if ("DNGVersion".equals(str)) {
                                        this.d = 3;
                                    }
                                    if ((("Make".equals(str) || "Model".equals(str)) && cVar.f(this.g).contains("PENTAX")) || ("Compression".equals(str) && cVar.e(this.g) == 65535)) {
                                        this.d = 8;
                                    }
                                    if (fVar.c != j15) {
                                        fVar.b(j15);
                                    }
                                }
                            }
                            s10 = (short) (s9 + 1);
                            i16 = i10;
                            readShort = s6;
                            z11 = z4;
                        } else {
                            z10 = true;
                            if (z10) {
                            }
                            s10 = (short) (s9 + 1);
                            i16 = i10;
                            readShort = s6;
                            z11 = z4;
                        }
                    }
                }
                s6 = readShort;
                z4 = z11;
                i11 = readInt;
                if (z4) {
                    Log.d("ExifInterface", "Skip the tag entry since data format is invalid: " + readUnsignedShort3);
                }
                i12 = readUnsignedShort3;
                j10 = 0;
                z10 = false;
                if (z10) {
                }
                s10 = (short) (s9 + 1);
                i16 = i10;
                readShort = s6;
                z11 = z4;
            }
            i11 = readInt;
            i12 = readUnsignedShort3;
            j10 = 0;
            z10 = false;
            if (z10) {
            }
            s10 = (short) (s9 + 1);
            i16 = i10;
            readShort = s6;
            z11 = z4;
        }
        boolean z12 = z11;
        int readInt3 = fVar.readInt();
        if (z12) {
            Log.d("ExifInterface", String.format("nextIfdOffset: %d", Integer.valueOf(readInt3)));
        }
        long j16 = readInt3;
        if (j16 <= 0) {
            if (z12) {
                Log.d("ExifInterface", "Stop reading file since a wrong offset may cause an infinite loop: " + readInt3);
                return;
            }
            return;
        }
        if (hashSet.contains(Integer.valueOf(readInt3))) {
            if (z12) {
                Log.d("ExifInterface", "Stop reading file since re-reading an IFD may cause an infinite loop: " + readInt3);
                return;
            }
            return;
        }
        fVar.b(j16);
        if (hashMapArr[4].isEmpty()) {
            u(fVar, 4);
        } else if (hashMapArr[5].isEmpty()) {
            u(fVar, 5);
        }
    }

    public final void v(int i10, String str, String str2) {
        HashMap[] hashMapArr = this.e;
        if (hashMapArr[i10].isEmpty() || hashMapArr[i10].get(str) == null) {
            return;
        }
        HashMap hashMap = hashMapArr[i10];
        hashMap.put(str2, hashMap.get(str));
        hashMapArr[i10].remove(str);
    }

    public final void w(b bVar) {
        c cVar;
        int e;
        HashMap hashMap = this.e[4];
        c cVar2 = (c) hashMap.get("Compression");
        if (cVar2 == null) {
            m(bVar, hashMap);
            return;
        }
        int e6 = cVar2.e(this.g);
        int i10 = 1;
        if (e6 != 1) {
            if (e6 == 6) {
                m(bVar, hashMap);
                return;
            } else if (e6 != 7) {
                return;
            }
        }
        c cVar3 = (c) hashMap.get("BitsPerSample");
        if (cVar3 != null) {
            int[] iArr = (int[]) cVar3.g(this.g);
            int[] iArr2 = p;
            if (Arrays.equals(iArr2, iArr) || (this.d == 3 && (cVar = (c) hashMap.get("PhotometricInterpretation")) != null && (((e = cVar.e(this.g)) == 1 && Arrays.equals(iArr, q)) || (e == 6 && Arrays.equals(iArr, iArr2))))) {
                c cVar4 = (c) hashMap.get("StripOffsets");
                c cVar5 = (c) hashMap.get("StripByteCounts");
                if (cVar4 == null || cVar5 == null) {
                    return;
                }
                long[] b10 = s6.b(cVar4.g(this.g));
                long[] b11 = s6.b(cVar5.g(this.g));
                if (b10 == null || b10.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (b11 == null || b11.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (b10.length != b11.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j10 = 0;
                for (long j11 : b11) {
                    j10 += j11;
                }
                byte[] bArr = new byte[(int) j10];
                this.h = true;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                while (i11 < b10.length) {
                    int i14 = (int) b10[i11];
                    int i15 = (int) b11[i11];
                    if (i11 < b10.length - i10 && i14 + i15 != b10[i11 + 1]) {
                        this.h = false;
                    }
                    int i16 = i14 - i12;
                    if (i16 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    long j12 = i16;
                    if (bVar.skip(j12) != j12) {
                        Log.d("ExifInterface", "Failed to skip " + i16 + " bytes.");
                        return;
                    }
                    int i17 = i12 + i16;
                    byte[] bArr2 = new byte[i15];
                    if (bVar.read(bArr2) != i15) {
                        Log.d("ExifInterface", "Failed to read " + i15 + " bytes.");
                        return;
                    }
                    i12 = i17 + i15;
                    System.arraycopy(bArr2, 0, bArr, i13, i15);
                    i13 += i15;
                    i11++;
                    i10 = 1;
                }
                if (this.h) {
                    long j13 = b10[0];
                    return;
                }
                return;
            }
        }
        if (m) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    public final void x(int i10, int i11) {
        HashMap[] hashMapArr = this.e;
        boolean isEmpty = hashMapArr[i10].isEmpty();
        boolean z4 = m;
        if (isEmpty || hashMapArr[i11].isEmpty()) {
            if (z4) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        c cVar = (c) hashMapArr[i10].get("ImageLength");
        c cVar2 = (c) hashMapArr[i10].get("ImageWidth");
        c cVar3 = (c) hashMapArr[i11].get("ImageLength");
        c cVar4 = (c) hashMapArr[i11].get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            if (z4) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (cVar3 == null || cVar4 == null) {
            if (z4) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int e = cVar.e(this.g);
        int e6 = cVar2.e(this.g);
        int e10 = cVar3.e(this.g);
        int e11 = cVar4.e(this.g);
        if (e >= e10 || e6 >= e11) {
            return;
        }
        HashMap hashMap = hashMapArr[i10];
        hashMapArr[i10] = hashMapArr[i11];
        hashMapArr[i11] = hashMap;
    }

    public final void y(f fVar, int i10) {
        c c3;
        c c10;
        HashMap[] hashMapArr = this.e;
        c cVar = (c) hashMapArr[i10].get("DefaultCropSize");
        c cVar2 = (c) hashMapArr[i10].get("SensorTopBorder");
        c cVar3 = (c) hashMapArr[i10].get("SensorLeftBorder");
        c cVar4 = (c) hashMapArr[i10].get("SensorBottomBorder");
        c cVar5 = (c) hashMapArr[i10].get("SensorRightBorder");
        if (cVar != null) {
            if (cVar.a == 5) {
                e[] eVarArr = (e[]) cVar.g(this.g);
                if (eVarArr == null || eVarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(eVarArr));
                    return;
                }
                c3 = c.b(eVarArr[0], this.g);
                c10 = c.b(eVarArr[1], this.g);
            } else {
                int[] iArr = (int[]) cVar.g(this.g);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                c3 = c.c(iArr[0], this.g);
                c10 = c.c(iArr[1], this.g);
            }
            hashMapArr[i10].put("ImageWidth", c3);
            hashMapArr[i10].put("ImageLength", c10);
            return;
        }
        if (cVar2 != null && cVar3 != null && cVar4 != null && cVar5 != null) {
            int e = cVar2.e(this.g);
            int e6 = cVar4.e(this.g);
            int e10 = cVar5.e(this.g);
            int e11 = cVar3.e(this.g);
            if (e6 <= e || e10 <= e11) {
                return;
            }
            c c11 = c.c(e6 - e, this.g);
            c c12 = c.c(e10 - e11, this.g);
            hashMapArr[i10].put("ImageLength", c11);
            hashMapArr[i10].put("ImageWidth", c12);
            return;
        }
        c cVar6 = (c) hashMapArr[i10].get("ImageLength");
        c cVar7 = (c) hashMapArr[i10].get("ImageWidth");
        if (cVar6 == null || cVar7 == null) {
            c cVar8 = (c) hashMapArr[i10].get("JPEGInterchangeFormat");
            c cVar9 = (c) hashMapArr[i10].get("JPEGInterchangeFormatLength");
            if (cVar8 == null || cVar9 == null) {
                return;
            }
            int e12 = cVar8.e(this.g);
            int e13 = cVar8.e(this.g);
            fVar.b(e12);
            byte[] bArr = new byte[e13];
            fVar.read(bArr);
            e(new b(bArr), e12, i10);
        }
    }

    public final void z() {
        x(0, 5);
        x(0, 4);
        x(5, 4);
        HashMap[] hashMapArr = this.e;
        c cVar = (c) hashMapArr[1].get("PixelXDimension");
        c cVar2 = (c) hashMapArr[1].get("PixelYDimension");
        if (cVar != null && cVar2 != null) {
            hashMapArr[0].put("ImageWidth", cVar);
            hashMapArr[0].put("ImageLength", cVar2);
        }
        if (hashMapArr[4].isEmpty() && o(hashMapArr[5])) {
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        if (!o(hashMapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        v(0, "ThumbnailOrientation", "Orientation");
        v(0, "ThumbnailImageLength", "ImageLength");
        v(0, "ThumbnailImageWidth", "ImageWidth");
        v(5, "ThumbnailOrientation", "Orientation");
        v(5, "ThumbnailImageLength", "ImageLength");
        v(5, "ThumbnailImageWidth", "ImageWidth");
        v(4, "Orientation", "ThumbnailOrientation");
        v(4, "ImageLength", "ThumbnailImageLength");
        v(4, "ImageWidth", "ThumbnailImageWidth");
    }

    public g(String str) {
        d[][] dVarArr = I;
        this.e = new HashMap[dVarArr.length];
        this.f = new HashSet(dVarArr.length);
        this.g = ByteOrder.BIG_ENDIAN;
        if (str != null) {
            n(str);
            return;
        }
        throw new NullPointerException("filename cannot be null");
    }

    public g(InputStream inputStream) {
        d[][] dVarArr = I;
        this.e = new HashMap[dVarArr.length];
        this.f = new HashSet(dVarArr.length);
        this.g = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            this.a = null;
            if (inputStream instanceof AssetManager.AssetInputStream) {
                this.c = (AssetManager.AssetInputStream) inputStream;
                this.b = null;
            } else {
                if (inputStream instanceof FileInputStream) {
                    FileInputStream fileInputStream = (FileInputStream) inputStream;
                    try {
                        h.c(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
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
            p(inputStream);
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }
}
