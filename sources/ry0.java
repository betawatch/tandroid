// default package

import java.io.File;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class ry0 {
    public long a;
    public long b;

    public ry0() {
        this.a = -9223372036854775807L;
        this.b = -9223372036854775807L;
    }

    public static boolean a(int i) {
        return i == 0 || i == 4 || i == 8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x009e, code lost:
    
        r23 = r10;
        r25 = 8;
        r19 = null;
        r20 = 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ry0 b(File file) {
        long j;
        long j2;
        long j3;
        ry0 ry0Var;
        long j4;
        long j5;
        String str;
        zg2 zg2Var;
        long j6;
        RandomAccessFile randomAccessFile;
        j99 j99Var;
        int i;
        int i2;
        long length = file.length();
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "r");
        int i3 = 0;
        long j7 = 0;
        ByteBuffer byteBuffer = null;
        while (true) {
            if (i3 >= 64 || j7 + 8 > length) {
                break;
            }
            try {
                randomAccessFile2.seek(j7);
                ry0Var = null;
                j4 = 0;
                long readInt = randomAccessFile2.readInt() & 4294967295L;
                int readInt2 = randomAccessFile2.readInt();
                if (readInt != 1) {
                    if (readInt == 0) {
                        readInt = length - j7;
                    }
                    i2 = 8;
                } else {
                    if (16 + j7 > length) {
                        j2 = j7;
                        break;
                    }
                    readInt = randomAccessFile2.readLong();
                    i2 = 16;
                }
                if (j7 == 0 && readInt2 != 1718909296) {
                    break;
                }
                j2 = j7;
                long j8 = i2;
                if (readInt < j8 || readInt > length - j2) {
                    break;
                }
                if (readInt2 == 1835365473 && byteBuffer == null) {
                    j3 = 8;
                    long j9 = readInt - j8;
                    if (j9 <= 1048576) {
                        byte[] bArr = new byte[(int) j9];
                        randomAccessFile2.readFully(bArr);
                        byteBuffer = ByteBuffer.wrap(bArr);
                        j7 = j2 + readInt;
                        i3++;
                    }
                } else {
                    j3 = 8;
                }
                if (readInt2 != 1836086884) {
                    j7 = j2 + readInt;
                    i3++;
                } else if (readInt > j8) {
                    j5 = j2 + j8;
                }
            } finally {
            }
        }
        j3 = 8;
        j5 = -1;
        if (j2 != j4) {
            if (byteBuffer != null) {
                try {
                    str = d(randomAccessFile2, byteBuffer, length);
                } catch (Exception e) {
                    cc4.g(e, true);
                }
                randomAccessFile2.close();
                if (str != 0) {
                    try {
                        zg2Var = jid.a(str);
                    } catch (hy7 | NumberFormatException | XmlPullParserException unused) {
                        efd.f("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                    }
                    if (j5 <= j4 && zg2Var != 0) {
                        j99Var = (j99) zg2Var.c;
                        for (i = 0; i < j99Var.d; i++) {
                            nh7 nh7Var = (nh7) j99Var.get(i);
                            if ("MotionPhoto".equalsIgnoreCase(nh7Var.b)) {
                                long j10 = nh7Var.c;
                                if (j10 > j4 && j10 < length) {
                                    j5 = length - j10;
                                }
                            }
                        }
                    }
                    if (j5 > j4 && j5 + j3 <= length) {
                        randomAccessFile = new RandomAccessFile(file, "r");
                        try {
                            randomAccessFile.seek(4 + j5);
                            j = randomAccessFile.readInt() == 1718909296 ? j5 : -1L;
                            randomAccessFile.close();
                        } finally {
                        }
                    }
                    long j11 = j;
                    if (zg2Var != 0) {
                        long j12 = zg2Var.b;
                        if (j12 >= j4) {
                            j6 = j12;
                            return new ry0(j11, j6);
                        }
                    }
                    j6 = j4;
                    return new ry0(j11, j6);
                }
                zg2Var = ry0Var;
                if (j5 <= j4) {
                    j99Var = (j99) zg2Var.c;
                    while (i < j99Var.d) {
                    }
                }
                if (j5 > j4) {
                    randomAccessFile = new RandomAccessFile(file, "r");
                    randomAccessFile.seek(4 + j5);
                    if (randomAccessFile.readInt() == 1718909296) {
                    }
                    randomAccessFile.close();
                }
                long j112 = j;
                if (zg2Var != 0) {
                }
                j6 = j4;
                return new ry0(j112, j6);
            }
            str = ry0Var;
            randomAccessFile2.close();
            if (str != 0) {
            }
            zg2Var = ry0Var;
            if (j5 <= j4) {
            }
            if (j5 > j4) {
            }
            long j1122 = j;
            if (zg2Var != 0) {
            }
            j6 = j4;
            return new ry0(j1122, j6);
        }
        randomAccessFile2.close();
        return ry0Var;
    }

    public static long c(int i, ByteBuffer byteBuffer) {
        if (i == 4) {
            return byteBuffer.getInt() & 4294967295L;
        }
        if (i != 8) {
            return 0L;
        }
        return byteBuffer.getLong();
    }

    public static String d(RandomAccessFile randomAccessFile, ByteBuffer byteBuffer, long j) {
        long j2;
        int i;
        String str;
        long j3;
        int i2;
        int i3;
        long j4;
        char c = 4;
        byteBuffer.position(4);
        int i4 = -1;
        ByteBuffer byteBuffer2 = null;
        while (true) {
            char c2 = c;
            int i5 = 2;
            if (byteBuffer.remaining() < 8) {
                j2 = 4294967295L;
                i = 0;
                str = null;
                j3 = 1;
                break;
            }
            int position = byteBuffer.position();
            str = null;
            j3 = 1;
            long j5 = byteBuffer.getInt() & 4294967295L;
            int i6 = byteBuffer.getInt();
            if (j5 < 8) {
                j2 = 4294967295L;
                break;
            }
            j2 = 4294967295L;
            if (j5 > byteBuffer.limit() - position) {
                break;
            }
            ByteBuffer byteBuffer3 = (ByteBuffer) byteBuffer.duplicate().position(position + 8);
            int i7 = position + ((int) j5);
            ByteBuffer byteBuffer4 = (ByteBuffer) byteBuffer3.limit(i7);
            if (i6 == 1768517222) {
                int i8 = byteBuffer4.get() & 255;
                byteBuffer4.position(byteBuffer4.position() + 3);
                long j6 = i8 == 0 ? byteBuffer4.getShort() & 65535 : byteBuffer4.getInt() & 4294967295L;
                long j7 = 0;
                for (int i9 = 8; j7 < j6 && byteBuffer4.remaining() >= i9 && i4 < 0; i9 = 8) {
                    int position2 = byteBuffer4.position();
                    long j8 = j7;
                    long j9 = byteBuffer4.getInt() & 4294967295L;
                    int i10 = byteBuffer4.getInt();
                    if (j9 < 8 || j9 > byteBuffer4.limit() - position2) {
                        break;
                    }
                    if (i10 == 1768842853 && byteBuffer4.remaining() >= 12) {
                        int i11 = byteBuffer4.get() & 255;
                        byteBuffer4.position(byteBuffer4.position() + 3);
                        if (i11 >= i5) {
                            int i12 = i11 == i5 ? byteBuffer4.getShort() & 65535 : byteBuffer4.getInt();
                            byteBuffer4.getShort();
                            if (byteBuffer4.getInt() == 1835625829) {
                                int i13 = ((int) j9) + position2;
                                String[] strArr = new String[i5];
                                int i14 = 0;
                                while (i14 < i5 && byteBuffer4.position() < i13) {
                                    int position3 = byteBuffer4.position();
                                    while (byteBuffer4.position() < i13 && byteBuffer4.get() != 0) {
                                    }
                                    strArr[i14] = new String(byteBuffer4.array(), byteBuffer4.arrayOffset() + position3, Math.max(0, (byteBuffer4.position() - position3) - (byteBuffer4.get(byteBuffer4.position() + (-1)) == 0 ? 1 : 0)));
                                    i14++;
                                    i4 = i4;
                                    position2 = position2;
                                    j6 = j6;
                                    i5 = 2;
                                }
                                i2 = i4;
                                i3 = position2;
                                j4 = j6;
                                if ("application/rdf+xml".equalsIgnoreCase(strArr[1])) {
                                    i4 = i12;
                                    byteBuffer4.position(i3 + ((int) j9));
                                    j7 = j8 + 1;
                                    j6 = j4;
                                    i5 = 2;
                                }
                                i4 = i2;
                                byteBuffer4.position(i3 + ((int) j9));
                                j7 = j8 + 1;
                                j6 = j4;
                                i5 = 2;
                            }
                        }
                    }
                    i2 = i4;
                    i3 = position2;
                    j4 = j6;
                    i4 = i2;
                    byteBuffer4.position(i3 + ((int) j9));
                    j7 = j8 + 1;
                    j6 = j4;
                    i5 = 2;
                }
                i4 = i4;
            } else if (i6 == 1768714083) {
                byteBuffer2 = byteBuffer4;
            }
            byteBuffer.position(i7);
            c = c2;
        }
        i = 0;
        if (i4 >= 0 && byteBuffer2 != null) {
            int i15 = byteBuffer2.get() & 255;
            byteBuffer2.position(byteBuffer2.position() + 3);
            short s = byteBuffer2.getShort();
            int i16 = s & 65535;
            int i17 = (i16 >> 12) & 15;
            int i18 = (i16 >> 8) & 15;
            int i19 = (i16 >> 4) & 15;
            int i20 = (i15 == 1 || i15 == 2) ? s & 15 : i;
            if (a(i17) && a(i18) && a(i19) && a(i20)) {
                int i21 = i20 + i17 + i18;
                long j10 = i15 < 2 ? byteBuffer2.getShort() & 65535 : byteBuffer2.getInt() & j2;
                long j11 = 0;
                while (true) {
                    if (j11 >= j10) {
                        break;
                    }
                    int i22 = i15 < 2 ? byteBuffer2.getShort() & 65535 : byteBuffer2.getInt();
                    int i23 = (i15 == 1 || i15 == 2) ? byteBuffer2.getShort() & 15 : 0;
                    byteBuffer2.getShort();
                    long c3 = c(i19, byteBuffer2);
                    int i24 = byteBuffer2.getShort() & 65535;
                    long j12 = j11;
                    long j13 = j10;
                    if (i24 * i21 > byteBuffer2.remaining()) {
                        break;
                    }
                    if (i22 != i4) {
                        byteBuffer2.position((i24 * i21) + byteBuffer2.position());
                        j11 = j12 + j3;
                        j10 = j13;
                    } else if (i23 == 0 && i24 != 0 && i24 <= 64) {
                        long[] jArr = new long[i24];
                        long[] jArr2 = new long[i24];
                        long j14 = 0;
                        int i25 = 0;
                        while (true) {
                            if (i25 < i24) {
                                c(i20, byteBuffer2);
                                jArr[i25] = c(i17, byteBuffer2) + c3;
                                long c4 = c(i18, byteBuffer2);
                                jArr2[i25] = c4;
                                long j15 = jArr[i25];
                                if (j15 < 0 || c4 <= 0 || c4 > j - j15) {
                                    break;
                                }
                                j14 += c4;
                                i25++;
                            } else if (j14 <= 1048576) {
                                byte[] bArr = new byte[(int) j14];
                                int i26 = 0;
                                for (int i27 = 0; i27 < i24; i27++) {
                                    randomAccessFile.seek(jArr[i27]);
                                    randomAccessFile.readFully(bArr, i26, (int) jArr2[i27]);
                                    i26 += (int) jArr2[i27];
                                }
                                return new String(bArr, "UTF-8");
                            }
                        }
                    }
                }
            }
        }
        return str;
    }

    public /* synthetic */ ry0(long j, long j2) {
        this.a = j;
        this.b = j2;
    }
}
