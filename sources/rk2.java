// default package

import android.R;
import android.util.Pair;
import androidx.car.app.model.Action;
import j$.util.Objects;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class rk2 {
    public static final byte[] a = {0, 0, 0, 1};
    public static final String[] b = {"", "A", "B", "C"};
    public static final Pattern c = Pattern.compile("^\\D?(\\d+)$");
    public static final byte[] d = {-75, 0, -112, 0, 1};

    public static String a(int i, int i2, int i3, int i4, boolean z, int[] iArr) {
        Object[] objArr = {b[i], Integer.valueOf(i2), Integer.valueOf(i3), Character.valueOf(z ? 'H' : 'L'), Integer.valueOf(i4)};
        String str = gcc.a;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i5 = 0; i5 < length; i5++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i5])));
        }
        return sb.toString();
    }

    public static Pair b(ko4 ko4Var) {
        boolean z;
        qk2 d2 = d(ko4Var);
        if (d2 == null || !(z = d2.c)) {
            return null;
        }
        yve.p(z);
        Integer valueOf = Integer.valueOf(d2.a);
        yve.p(z);
        return new Pair(valueOf, Integer.valueOf(d2.b));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x013e, code lost:
    
        if (r13.equals("L60") == false) goto L100;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static qk2 c(String str, String[] strArr, bm2 bm2Var) {
        int i;
        Integer num = null;
        if (strArr.length < 4) {
            bp1.s("Ignoring malformed HEVC codec string: ", str, "CodecSpecificDataUtil");
            return null;
        }
        Matcher matcher = c.matcher(strArr[1]);
        if (!matcher.matches()) {
            bp1.s("Ignoring malformed HEVC codec string: ", str, "CodecSpecificDataUtil");
            return null;
        }
        String group = matcher.group(1);
        boolean equals = "1".equals(group);
        char c2 = 6;
        qk2 qk2Var = qk2.d;
        if (equals) {
            i = 1;
        } else {
            if (!"2".equals(group)) {
                bp1.s("Unknown HEVC profile string: ", group, "CodecSpecificDataUtil");
                return qk2Var;
            }
            i = (bm2Var == null || bm2Var.c != 6) ? 2 : 4096;
        }
        String str2 = strArr[3];
        str2.getClass();
        switch (str2.hashCode()) {
            case 70821:
                if (str2.equals("H30")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 70914:
                if (str2.equals("H60")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 70917:
                if (str2.equals("H63")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 71007:
                if (str2.equals("H90")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 71010:
                if (str2.equals("H93")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 74665:
                if (str2.equals("L30")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 74758:
                break;
            case 74761:
                if (str2.equals("L63")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case 74851:
                if (str2.equals("L90")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case 74854:
                if (str2.equals("L93")) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            case 2193639:
                if (str2.equals("H120")) {
                    c2 = '\n';
                    break;
                }
                c2 = 65535;
                break;
            case 2193642:
                if (str2.equals("H123")) {
                    c2 = 11;
                    break;
                }
                c2 = 65535;
                break;
            case 2193732:
                if (str2.equals("H150")) {
                    c2 = '\f';
                    break;
                }
                c2 = 65535;
                break;
            case 2193735:
                if (str2.equals("H153")) {
                    c2 = '\r';
                    break;
                }
                c2 = 65535;
                break;
            case 2193738:
                if (str2.equals("H156")) {
                    c2 = 14;
                    break;
                }
                c2 = 65535;
                break;
            case 2193825:
                if (str2.equals("H180")) {
                    c2 = 15;
                    break;
                }
                c2 = 65535;
                break;
            case 2193828:
                if (str2.equals("H183")) {
                    c2 = 16;
                    break;
                }
                c2 = 65535;
                break;
            case 2193831:
                if (str2.equals("H186")) {
                    c2 = 17;
                    break;
                }
                c2 = 65535;
                break;
            case 2312803:
                if (str2.equals("L120")) {
                    c2 = 18;
                    break;
                }
                c2 = 65535;
                break;
            case 2312806:
                if (str2.equals("L123")) {
                    c2 = 19;
                    break;
                }
                c2 = 65535;
                break;
            case 2312896:
                if (str2.equals("L150")) {
                    c2 = 20;
                    break;
                }
                c2 = 65535;
                break;
            case 2312899:
                if (str2.equals("L153")) {
                    c2 = 21;
                    break;
                }
                c2 = 65535;
                break;
            case 2312902:
                if (str2.equals("L156")) {
                    c2 = 22;
                    break;
                }
                c2 = 65535;
                break;
            case 2312989:
                if (str2.equals("L180")) {
                    c2 = 23;
                    break;
                }
                c2 = 65535;
                break;
            case 2312992:
                if (str2.equals("L183")) {
                    c2 = 24;
                    break;
                }
                c2 = 65535;
                break;
            case 2312995:
                if (str2.equals("L186")) {
                    c2 = 25;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
                num = 2;
                break;
            case 1:
                num = 8;
                break;
            case 2:
                num = 32;
                break;
            case 3:
                num = 128;
                break;
            case 4:
                num = 512;
                break;
            case 5:
                num = 1;
                break;
            case 6:
                num = 4;
                break;
            case 7:
                num = 16;
                break;
            case '\b':
                num = 64;
                break;
            case '\t':
                num = 256;
                break;
            case '\n':
                num = 2048;
                break;
            case 11:
                num = Integer.valueOf(TLObject.FLAG_13);
                break;
            case '\f':
                num = 32768;
                break;
            case '\r':
                num = 131072;
                break;
            case 14:
                num = Integer.valueOf(TLObject.FLAG_19);
                break;
            case 15:
                num = Integer.valueOf(TLObject.FLAG_21);
                break;
            case 16:
                num = Integer.valueOf(TLObject.FLAG_23);
                break;
            case 17:
                num = 33554432;
                break;
            case 18:
                num = 1024;
                break;
            case 19:
                num = Integer.valueOf(TLObject.FLAG_12);
                break;
            case 20:
                num = Integer.valueOf(TLObject.FLAG_14);
                break;
            case 21:
                num = 65536;
                break;
            case 22:
                num = 262144;
                break;
            case 23:
                num = Integer.valueOf(TLObject.FLAG_20);
                break;
            case 24:
                num = Integer.valueOf(TLObject.FLAG_22);
                break;
            case 25:
                num = 16777216;
                break;
        }
        if (num != null) {
            return new qk2(i, num.intValue(), true);
        }
        efd.f("CodecSpecificDataUtil", "Unknown HEVC level string: ".concat(str2));
        return qk2Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x03e7, code lost:
    
        if (r1.equals("H83") != false) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x0664, code lost:
    
        if (r1.equals("mp4a") == false) goto L464;
     */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0625 A[Catch: NumberFormatException -> 0x063d, TryCatch #3 {NumberFormatException -> 0x063d, blocks: (B:381:0x05d8, B:383:0x05ec, B:394:0x060a, B:397:0x0625, B:399:0x0635), top: B:380:0x05d8 }] */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0635 A[Catch: NumberFormatException -> 0x063d, TRY_LEAVE, TryCatch #3 {NumberFormatException -> 0x063d, blocks: (B:381:0x05d8, B:383:0x05ec, B:394:0x060a, B:397:0x0625, B:399:0x0635), top: B:380:0x05d8 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static qk2 d(ko4 ko4Var) {
        char c2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int parseInt;
        int parseInt2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        char c3;
        char c4;
        Integer num;
        char c5;
        Integer num2 = 1024;
        Integer valueOf = Integer.valueOf(TLObject.FLAG_12);
        String str = ko4Var.l;
        String str2 = ko4Var.l;
        if (str == null) {
            return null;
        }
        String[] split = str.split("\\.");
        boolean equals = "video/dolby-vision".equals(ko4Var.t);
        qk2 qk2Var = qk2.d;
        char c6 = 3;
        if (equals) {
            if (split.length < 3) {
                bp1.s("Ignoring malformed Dolby Vision codec string: ", str2, "CodecSpecificDataUtil");
                return null;
            }
            Matcher matcher = c.matcher(split[1]);
            if (!matcher.matches()) {
                bp1.s("Ignoring malformed Dolby Vision codec string: ", str2, "CodecSpecificDataUtil");
                return null;
            }
            String group = matcher.group(1);
            group.getClass();
            switch (group.hashCode()) {
                case 1536:
                    if (group.equals("00")) {
                        c4 = 0;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1537:
                    if (group.equals("01")) {
                        c4 = 1;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1538:
                    if (group.equals("02")) {
                        c4 = 2;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1539:
                    if (group.equals("03")) {
                        c4 = 3;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1540:
                    if (group.equals("04")) {
                        c4 = 4;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1541:
                    if (group.equals("05")) {
                        c4 = 5;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1542:
                    if (group.equals("06")) {
                        c4 = 6;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1543:
                    if (group.equals("07")) {
                        c4 = 7;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1544:
                    if (group.equals("08")) {
                        c4 = '\b';
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1545:
                    if (group.equals("09")) {
                        c4 = '\t';
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1567:
                    if (group.equals("10")) {
                        c4 = '\n';
                        break;
                    }
                    c4 = 65535;
                    break;
                default:
                    c4 = 65535;
                    break;
            }
            switch (c4) {
                case 0:
                    num = 1;
                    break;
                case 1:
                    num = 2;
                    break;
                case 2:
                    num = 4;
                    break;
                case 3:
                    num = 8;
                    break;
                case 4:
                    num = 16;
                    break;
                case 5:
                    num = 32;
                    break;
                case 6:
                    num = 64;
                    break;
                case 7:
                    num = 128;
                    break;
                case '\b':
                    num = 256;
                    break;
                case '\t':
                    num = 512;
                    break;
                case '\n':
                    num = num2;
                    break;
                default:
                    num = null;
                    break;
            }
            if (num == null) {
                efd.f("CodecSpecificDataUtil", "Unknown Dolby Vision profile string: ".concat(group));
                return qk2Var;
            }
            String str3 = split[2];
            str3.getClass();
            switch (str3.hashCode()) {
                case 1537:
                    if (str3.equals("01")) {
                        c5 = 0;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1538:
                    if (str3.equals("02")) {
                        c5 = 1;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1539:
                    if (str3.equals("03")) {
                        c5 = 2;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1540:
                    if (str3.equals("04")) {
                        c5 = 3;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1541:
                    if (str3.equals("05")) {
                        c5 = 4;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1542:
                    if (str3.equals("06")) {
                        c5 = 5;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1543:
                    if (str3.equals("07")) {
                        c5 = 6;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1544:
                    if (str3.equals("08")) {
                        c5 = 7;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1545:
                    if (str3.equals("09")) {
                        c5 = '\b';
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1567:
                    if (str3.equals("10")) {
                        c5 = '\t';
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1568:
                    if (str3.equals("11")) {
                        c5 = '\n';
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1569:
                    if (str3.equals("12")) {
                        c5 = 11;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1570:
                    if (str3.equals("13")) {
                        c5 = '\f';
                        break;
                    }
                    c5 = 65535;
                    break;
                default:
                    c5 = 65535;
                    break;
            }
            switch (c5) {
                case 0:
                    num2 = 1;
                    break;
                case 1:
                    num2 = 2;
                    break;
                case 2:
                    num2 = 4;
                    break;
                case 3:
                    num2 = 8;
                    break;
                case 4:
                    num2 = 16;
                    break;
                case 5:
                    num2 = 32;
                    break;
                case 6:
                    num2 = 64;
                    break;
                case 7:
                    num2 = 128;
                    break;
                case '\b':
                    num2 = 256;
                    break;
                case '\t':
                    num2 = 512;
                    break;
                case '\n':
                    break;
                case 11:
                    num2 = 2048;
                    break;
                case '\f':
                    num2 = valueOf;
                    break;
                default:
                    num2 = null;
                    break;
            }
            if (num2 != null) {
                return new qk2(num.intValue(), num2.intValue(), true);
            }
            efd.f("CodecSpecificDataUtil", "Unknown Dolby Vision level string: ".concat(str3));
            return null;
        }
        String str4 = split[0];
        str4.getClass();
        switch (str4.hashCode()) {
            case 2986313:
                if (str4.equals("ac-4")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 3001066:
                if (str4.equals("apv1")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 3004662:
                if (str4.equals("av01")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 3006243:
                if (str4.equals("avc1")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 3006244:
                if (str4.equals("avc2")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 3199032:
                if (str4.equals("hev1")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 3214780:
                if (str4.equals("hvc1")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 3224753:
                if (str4.equals("iamf")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case 3356560:
                if (str4.equals("mp4a")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case 3475740:
                if (str4.equals("s263")) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            case 3624515:
                if (str4.equals("vp09")) {
                    c2 = '\n';
                    break;
                }
                c2 = 65535;
                break;
            case 3631854:
                if (str4.equals("vvc1")) {
                    c2 = 11;
                    break;
                }
                c2 = 65535;
                break;
            case 3632040:
                if (str4.equals("vvi1")) {
                    c2 = '\f';
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
                int i16 = 8;
                if (split.length != 4) {
                    bp1.s("Ignoring malformed AC-4 codec string: ", str2, "CodecSpecificDataUtil");
                    break;
                } else {
                    try {
                        int parseInt3 = Integer.parseInt(split[1]);
                        int parseInt4 = Integer.parseInt(split[2]);
                        int parseInt5 = Integer.parseInt(split[3]);
                        if (parseInt3 == 0) {
                            if (parseInt4 == 0) {
                                i = jn7.f4;
                            }
                            i = -1;
                        } else if (parseInt3 != 1) {
                            if (parseInt3 == 2) {
                                if (parseInt4 == 1) {
                                    i = 1026;
                                } else if (parseInt4 == 2) {
                                    i = 1028;
                                }
                            }
                            i = -1;
                        } else if (parseInt4 == 0) {
                            i = 513;
                        } else {
                            if (parseInt4 == 1) {
                                i = 514;
                            }
                            i = -1;
                        }
                        if (i != -1) {
                            if (parseInt5 == 0) {
                                i16 = 1;
                            } else if (parseInt5 == 1) {
                                i16 = 2;
                            } else if (parseInt5 == 2) {
                                i16 = 4;
                            } else if (parseInt5 != 3) {
                                i16 = parseInt5 != 4 ? -1 : 16;
                            }
                            if (i16 != -1) {
                                break;
                            } else {
                                c00.p(parseInt5, "Unknown AC-4 level: ", "CodecSpecificDataUtil");
                                break;
                            }
                        } else {
                            efd.f("CodecSpecificDataUtil", "Unknown AC-4 profile: " + parseInt3 + "." + parseInt4);
                            break;
                        }
                    } catch (NumberFormatException unused) {
                        bp1.s("Ignoring malformed AC-4 codec string: ", str2, "CodecSpecificDataUtil");
                        return null;
                    }
                }
            case 1:
                if (split.length < 4) {
                    bp1.s("Ignoring malformed APV codec string: ", str2, "CodecSpecificDataUtil");
                    break;
                } else {
                    try {
                        int parseInt6 = Integer.parseInt(split[1].substring(4));
                        int parseInt7 = Integer.parseInt(split[2].substring(4));
                        int parseInt8 = Integer.parseInt(split[3].substring(4));
                        if (parseInt6 != 33) {
                            if (parseInt6 != 44) {
                                c00.p(parseInt6, "Unrecognized APV profile: ", "CodecSpecificDataUtil");
                                break;
                            } else {
                                i2 = 8192;
                            }
                        } else {
                            i2 = 1;
                        }
                        switch (parseInt7) {
                            case jn7.S /* 30 */:
                                if (parseInt8 == 0) {
                                    i3 = jn7.f4;
                                    break;
                                } else if (parseInt8 == 1) {
                                    i3 = jn7.g4;
                                    break;
                                } else if (parseInt8 == 2) {
                                    i3 = jn7.i4;
                                    break;
                                } else if (parseInt8 == 3) {
                                    i3 = jn7.m4;
                                    break;
                                } else {
                                    c00.p(parseInt8, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                    i3 = -1;
                                    break;
                                }
                            case 33:
                                if (parseInt8 == 0) {
                                    i3 = 513;
                                    break;
                                } else if (parseInt8 == 1) {
                                    i3 = 514;
                                    break;
                                } else if (parseInt8 == 2) {
                                    i3 = 516;
                                    break;
                                } else if (parseInt8 == 3) {
                                    i3 = 520;
                                    break;
                                } else {
                                    c00.p(parseInt8, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                    i3 = -1;
                                    break;
                                }
                            case jn7.w0 /* 60 */:
                                if (parseInt8 == 0) {
                                    i3 = 1025;
                                    break;
                                } else if (parseInt8 == 1) {
                                    i3 = 1026;
                                    break;
                                } else if (parseInt8 == 2) {
                                    i3 = 1028;
                                    break;
                                } else if (parseInt8 == 3) {
                                    i3 = 1032;
                                    break;
                                } else {
                                    c00.p(parseInt8, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                    i3 = -1;
                                    break;
                                }
                            case jn7.z0 /* 63 */:
                                if (parseInt8 == 0) {
                                    i3 = 2049;
                                    break;
                                } else if (parseInt8 == 1) {
                                    i3 = 2050;
                                    break;
                                } else if (parseInt8 == 2) {
                                    i3 = 2052;
                                    break;
                                } else if (parseInt8 == 3) {
                                    i3 = 2056;
                                    break;
                                } else {
                                    c00.p(parseInt8, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                    i3 = -1;
                                    break;
                                }
                            case jn7.a1 /* 90 */:
                                if (parseInt8 == 0) {
                                    i3 = 4097;
                                    break;
                                } else if (parseInt8 == 1) {
                                    i3 = 4098;
                                    break;
                                } else if (parseInt8 == 2) {
                                    i3 = 4100;
                                    break;
                                } else if (parseInt8 == 3) {
                                    i3 = 4104;
                                    break;
                                } else {
                                    c00.p(parseInt8, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                    i3 = -1;
                                    break;
                                }
                            case jn7.d1 /* 93 */:
                                if (parseInt8 == 0) {
                                    i3 = 8193;
                                    break;
                                } else if (parseInt8 == 1) {
                                    i3 = 8194;
                                    break;
                                } else if (parseInt8 == 2) {
                                    i3 = 8196;
                                    break;
                                } else if (parseInt8 == 3) {
                                    i3 = 8200;
                                    break;
                                } else {
                                    c00.p(parseInt8, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                    i3 = -1;
                                    break;
                                }
                            case jn7.E1 /* 120 */:
                                if (parseInt8 == 0) {
                                    i3 = 16385;
                                    break;
                                } else if (parseInt8 == 1) {
                                    i3 = 16386;
                                    break;
                                } else if (parseInt8 == 2) {
                                    i3 = 16388;
                                    break;
                                } else if (parseInt8 == 3) {
                                    i3 = 16392;
                                    break;
                                } else {
                                    c00.p(parseInt8, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                    i3 = -1;
                                    break;
                                }
                            case jn7.G1 /* 123 */:
                                if (parseInt8 == 0) {
                                    i3 = 32769;
                                    break;
                                } else if (parseInt8 == 1) {
                                    i3 = 32770;
                                    break;
                                } else if (parseInt8 == 2) {
                                    i3 = 32772;
                                    break;
                                } else if (parseInt8 == 3) {
                                    i3 = 32776;
                                    break;
                                } else {
                                    c00.p(parseInt8, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                    i3 = -1;
                                    break;
                                }
                            case jn7.f2 /* 150 */:
                                if (parseInt8 == 0) {
                                    i3 = 65537;
                                    break;
                                } else if (parseInt8 == 1) {
                                    i3 = 65538;
                                    break;
                                } else if (parseInt8 == 2) {
                                    i3 = Action.TYPE_PAN;
                                    break;
                                } else if (parseInt8 == 3) {
                                    i3 = 65544;
                                    break;
                                } else {
                                    c00.p(parseInt8, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                    i3 = -1;
                                    break;
                                }
                            case jn7.i2 /* 153 */:
                                if (parseInt8 == 0) {
                                    i3 = 131073;
                                    break;
                                } else if (parseInt8 == 1) {
                                    i3 = 131074;
                                    break;
                                } else if (parseInt8 == 2) {
                                    i3 = 131076;
                                    break;
                                } else if (parseInt8 == 3) {
                                    i3 = 131080;
                                    break;
                                } else {
                                    c00.p(parseInt8, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                    i3 = -1;
                                    break;
                                }
                            case jn7.J2 /* 180 */:
                                if (parseInt8 == 0) {
                                    i3 = 262145;
                                    break;
                                } else if (parseInt8 == 1) {
                                    i3 = 262146;
                                    break;
                                } else if (parseInt8 == 2) {
                                    i3 = 262148;
                                    break;
                                } else if (parseInt8 == 3) {
                                    i3 = 262152;
                                    break;
                                } else {
                                    c00.p(parseInt8, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                    i3 = -1;
                                    break;
                                }
                            case jn7.M2 /* 183 */:
                                if (parseInt8 == 0) {
                                    i3 = 524289;
                                    break;
                                } else if (parseInt8 == 1) {
                                    i3 = 524290;
                                    break;
                                } else if (parseInt8 == 2) {
                                    i3 = 524292;
                                    break;
                                } else if (parseInt8 == 3) {
                                    i3 = 524296;
                                    break;
                                } else {
                                    c00.p(parseInt8, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                    i3 = -1;
                                    break;
                                }
                            case jn7.n3 /* 210 */:
                                if (parseInt8 == 0) {
                                    i3 = 1048577;
                                    break;
                                } else if (parseInt8 == 1) {
                                    i3 = 1048578;
                                    break;
                                } else if (parseInt8 == 2) {
                                    i3 = 1048580;
                                    break;
                                } else if (parseInt8 == 3) {
                                    i3 = 1048584;
                                    break;
                                } else {
                                    c00.p(parseInt8, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                    i3 = -1;
                                    break;
                                }
                            case jn7.p3 /* 213 */:
                                if (parseInt8 == 0) {
                                    i3 = 2097153;
                                    break;
                                } else if (parseInt8 == 1) {
                                    i3 = 2097154;
                                    break;
                                } else if (parseInt8 == 2) {
                                    i3 = 2097156;
                                    break;
                                } else if (parseInt8 == 3) {
                                    i3 = 2097160;
                                    break;
                                } else {
                                    c00.p(parseInt8, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                    i3 = -1;
                                    break;
                                }
                            default:
                                c00.p(parseInt7, "Unrecognized APV level index: ", "CodecSpecificDataUtil");
                                i3 = -1;
                                break;
                        }
                        if (i3 != -1) {
                            break;
                        }
                    } catch (NumberFormatException e) {
                        efd.g("CodecSpecificDataUtil", "Ignoring malformed APV codec string: " + str2, e);
                        return null;
                    }
                }
                break;
            case 2:
                bm2 bm2Var = ko4Var.L;
                if (split.length < 4) {
                    bp1.s("Ignoring malformed AV1 codec string: ", str2, "CodecSpecificDataUtil");
                    break;
                } else {
                    try {
                        int parseInt9 = Integer.parseInt(split[1]);
                        int parseInt10 = Integer.parseInt(split[2].substring(0, 2));
                        int parseInt11 = Integer.parseInt(split[3]);
                        if (parseInt9 == 0) {
                            int i17 = 8;
                            if (parseInt11 == 8) {
                                i4 = 1;
                            } else if (parseInt11 != 10) {
                                c00.p(parseInt11, "Unknown AV1 bit depth: ", "CodecSpecificDataUtil");
                                break;
                            } else {
                                i4 = (bm2Var == null || !(bm2Var.d != null || (i5 = bm2Var.c) == 7 || i5 == 6)) ? 2 : TLObject.FLAG_12;
                            }
                            switch (parseInt10) {
                                case 0:
                                    i17 = 1;
                                    break;
                                case 1:
                                    i17 = 2;
                                    break;
                                case 2:
                                    i17 = 4;
                                    break;
                                case 3:
                                    break;
                                case 4:
                                    i17 = 16;
                                    break;
                                case 5:
                                    i17 = 32;
                                    break;
                                case 6:
                                    i17 = 64;
                                    break;
                                case 7:
                                    i17 = 128;
                                    break;
                                case 8:
                                    i17 = 256;
                                    break;
                                case 9:
                                    i17 = 512;
                                    break;
                                case 10:
                                    i17 = 1024;
                                    break;
                                case 11:
                                    i17 = 2048;
                                    break;
                                case 12:
                                    i17 = TLObject.FLAG_12;
                                    break;
                                case 13:
                                    i17 = 8192;
                                    break;
                                case 14:
                                    i17 = 16384;
                                    break;
                                case 15:
                                    i17 = 32768;
                                    break;
                                case 16:
                                    i17 = 65536;
                                    break;
                                case 17:
                                    i17 = 131072;
                                    break;
                                case 18:
                                    i17 = 262144;
                                    break;
                                case 19:
                                    i17 = TLObject.FLAG_19;
                                    break;
                                case 20:
                                    i17 = TLObject.FLAG_20;
                                    break;
                                case 21:
                                    i17 = TLObject.FLAG_21;
                                    break;
                                case 22:
                                    i17 = TLObject.FLAG_22;
                                    break;
                                case 23:
                                    i17 = TLObject.FLAG_23;
                                    break;
                                default:
                                    i17 = -1;
                                    break;
                            }
                            if (i17 != -1) {
                                break;
                            } else {
                                c00.p(parseInt10, "Unknown AV1 level: ", "CodecSpecificDataUtil");
                                break;
                            }
                        } else {
                            c00.p(parseInt9, "Unknown AV1 profile: ", "CodecSpecificDataUtil");
                            break;
                        }
                    } catch (NumberFormatException unused2) {
                        bp1.s("Ignoring malformed AV1 codec string: ", str2, "CodecSpecificDataUtil");
                        return null;
                    }
                }
            case 3:
            case 4:
                if (split.length < 2) {
                    bp1.s("Ignoring malformed AVC codec string: ", str2, "CodecSpecificDataUtil");
                    break;
                } else {
                    try {
                        if (split[1].length() != 6) {
                            i6 = 16;
                            if (split.length < 3) {
                                efd.f("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: " + str2);
                                break;
                            } else {
                                parseInt = Integer.parseInt(split[1]);
                                parseInt2 = Integer.parseInt(split[2]);
                            }
                        } else {
                            i6 = 16;
                            parseInt = Integer.parseInt(split[1].substring(0, 2), 16);
                            parseInt2 = Integer.parseInt(split[1].substring(4), 16);
                        }
                        int i18 = parseInt != 66 ? parseInt != 77 ? parseInt != 88 ? parseInt != 100 ? parseInt != 110 ? parseInt != 122 ? parseInt != 244 ? -1 : 64 : 32 : i6 : 8 : 4 : 2 : 1;
                        if (i18 != -1) {
                            switch (parseInt2) {
                                case 10:
                                    i6 = 1;
                                    i7 = -1;
                                    break;
                                case 11:
                                    i7 = -1;
                                    i6 = 4;
                                    break;
                                case 12:
                                    i7 = -1;
                                    i6 = 8;
                                    break;
                                case 13:
                                    i7 = -1;
                                    break;
                                default:
                                    switch (parseInt2) {
                                        case 20:
                                            i7 = -1;
                                            i6 = 32;
                                            break;
                                        case 21:
                                            i7 = -1;
                                            i6 = 64;
                                            break;
                                        case 22:
                                            i7 = -1;
                                            i6 = 128;
                                            break;
                                        default:
                                            switch (parseInt2) {
                                                case jn7.S /* 30 */:
                                                    i7 = -1;
                                                    i6 = 256;
                                                    break;
                                                case 31:
                                                    i7 = -1;
                                                    i6 = 512;
                                                    break;
                                                case 32:
                                                    i7 = -1;
                                                    i6 = 1024;
                                                    break;
                                                default:
                                                    switch (parseInt2) {
                                                        case 40:
                                                            i7 = -1;
                                                            i6 = 2048;
                                                            break;
                                                        case 41:
                                                            i7 = -1;
                                                            i6 = TLObject.FLAG_12;
                                                            break;
                                                        case 42:
                                                            i6 = 8192;
                                                            i7 = -1;
                                                            break;
                                                        default:
                                                            switch (parseInt2) {
                                                                case 50:
                                                                    i6 = 16384;
                                                                    i7 = -1;
                                                                    break;
                                                                case jn7.n0 /* 51 */:
                                                                    i6 = 32768;
                                                                    i7 = -1;
                                                                    break;
                                                                case jn7.o0 /* 52 */:
                                                                    i6 = 65536;
                                                                    i7 = -1;
                                                                    break;
                                                                default:
                                                                    i7 = -1;
                                                                    i6 = -1;
                                                                    break;
                                                            }
                                                    }
                                            }
                                    }
                            }
                            if (i6 != i7) {
                                break;
                            } else {
                                c00.p(parseInt2, "Unknown AVC level: ", "CodecSpecificDataUtil");
                                break;
                            }
                        } else {
                            c00.p(parseInt, "Unknown AVC profile: ", "CodecSpecificDataUtil");
                            break;
                        }
                    } catch (NumberFormatException unused3) {
                        bp1.s("Ignoring malformed AVC codec string: ", str2, "CodecSpecificDataUtil");
                        return null;
                    }
                }
            case 7:
                if (split.length < 4) {
                    bp1.s("Ignoring malformed IAMF codec string: ", str2, "CodecSpecificDataUtil");
                    break;
                } else {
                    try {
                        int parseInt12 = Integer.parseInt(split[1]);
                        String str5 = split[3];
                        str5.getClass();
                        switch (str5.hashCode()) {
                            case 2464863:
                                if (str5.equals("Opus")) {
                                    c6 = 0;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case 3114792:
                                if (str5.equals("fLaC")) {
                                    c6 = 1;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case 3238865:
                                if (str5.equals("ipcm")) {
                                    c6 = 2;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case 3356560:
                                break;
                            default:
                                c6 = 65535;
                                break;
                        }
                        switch (c6) {
                            case 0:
                                if (parseInt12 == 0) {
                                    i8 = R.attr.label;
                                    break;
                                } else if (parseInt12 == 1) {
                                    i8 = R.id.checkbox;
                                    break;
                                } else if (parseInt12 == 2) {
                                    i8 = R.string.copy;
                                    break;
                                } else {
                                    c00.p(parseInt12, "Unrecognized IAMF Opus profile: ", "CodecSpecificDataUtil");
                                    i8 = -1;
                                    break;
                                }
                            case 1:
                                if (parseInt12 == 0) {
                                    i8 = R.attr.manageSpaceActivity;
                                    break;
                                } else if (parseInt12 == 1) {
                                    i8 = R.id.empty;
                                    break;
                                } else if (parseInt12 == 2) {
                                    i8 = R.string.defaultVoiceMailAlphaTag;
                                    break;
                                } else {
                                    c00.p(parseInt12, "Unrecognized IAMF FLAC profile: ", "CodecSpecificDataUtil");
                                    i8 = -1;
                                    break;
                                }
                            case 2:
                                if (parseInt12 == 0) {
                                    i8 = R.attr.writePermission;
                                    break;
                                } else if (parseInt12 == 1) {
                                    i8 = R.id.icon2;
                                    break;
                                } else if (parseInt12 == 2) {
                                    i8 = R.string.httpErrorUnsupportedScheme;
                                    break;
                                } else {
                                    c00.p(parseInt12, "Unrecognized IAMF PCM profile: ", "CodecSpecificDataUtil");
                                    i8 = -1;
                                    break;
                                }
                            case 3:
                                if (parseInt12 == 0) {
                                    i8 = R.attr.icon;
                                    break;
                                } else if (parseInt12 == 1) {
                                    i8 = R.id.content;
                                    break;
                                } else if (parseInt12 == 2) {
                                    i8 = R.string.copyUrl;
                                    break;
                                } else {
                                    c00.p(parseInt12, "Unrecognized IAMF AAC profile: ", "CodecSpecificDataUtil");
                                    i8 = -1;
                                    break;
                                }
                            default:
                                efd.f("CodecSpecificDataUtil", "Unrecognized codec identifier for IAMF auxiliary profile: ".concat(str5));
                                i8 = -1;
                                break;
                        }
                        if (i8 != -1) {
                            break;
                        }
                    } catch (NumberFormatException e2) {
                        efd.g("CodecSpecificDataUtil", "Ignoring malformed primary profile in IAMF codec string: " + split[1], e2);
                        return null;
                    }
                }
                break;
            case '\b':
                if (split.length == 3) {
                    try {
                        if ("audio/mp4a-latm".equals(dg7.e(Integer.parseInt(split[1], 16)))) {
                            int parseInt13 = Integer.parseInt(split[2]);
                            int i19 = 17;
                            if (parseInt13 != 17) {
                                if (parseInt13 != 20) {
                                    i19 = 23;
                                    if (parseInt13 != 23) {
                                        i19 = 29;
                                        if (parseInt13 != 29) {
                                            i19 = 39;
                                            if (parseInt13 != 39) {
                                                i19 = 42;
                                                if (parseInt13 != 42) {
                                                    switch (parseInt13) {
                                                        case 1:
                                                            i19 = 1;
                                                            break;
                                                        case 2:
                                                            i9 = -1;
                                                            i19 = 2;
                                                            break;
                                                        case 3:
                                                            i19 = 3;
                                                            break;
                                                        case 4:
                                                            i9 = -1;
                                                            i19 = 4;
                                                            break;
                                                        case 5:
                                                            i19 = 5;
                                                            break;
                                                        case 6:
                                                            i9 = -1;
                                                            i19 = 6;
                                                            break;
                                                        default:
                                                            i9 = -1;
                                                            i19 = -1;
                                                            break;
                                                    }
                                                    if (i19 == i9) {
                                                        break;
                                                    } else {
                                                        efd.f("CodecSpecificDataUtil", "Unrecognized MP4A profile: " + i19);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    i19 = 20;
                                }
                            }
                            i9 = -1;
                            if (i19 == i9) {
                            }
                        }
                    } catch (NumberFormatException unused4) {
                        bp1.s("Ignoring malformed MP4A codec string: ", str2, "CodecSpecificDataUtil");
                        break;
                    }
                } else {
                    bp1.s("Ignoring malformed MP4A codec string: ", str2, "CodecSpecificDataUtil");
                    break;
                }
                break;
            case '\t':
                if (split.length < 3) {
                    bp1.s("Ignoring malformed H263 codec string: ", str2, "CodecSpecificDataUtil");
                    break;
                } else {
                    try {
                        int parseInt14 = Integer.parseInt(split[1]);
                        int parseInt15 = Integer.parseInt(split[2]);
                        switch (parseInt14) {
                            case 0:
                                i10 = 1;
                                break;
                            case 1:
                                i10 = 2;
                                break;
                            case 2:
                                i10 = 4;
                                break;
                            case 3:
                                i10 = 8;
                                break;
                            case 4:
                                i10 = 16;
                                break;
                            case 5:
                                i10 = 32;
                                break;
                            case 6:
                                i10 = 64;
                                break;
                            case 7:
                                i10 = 128;
                                break;
                            case 8:
                                i10 = 256;
                                break;
                            default:
                                i10 = -1;
                                break;
                        }
                        if (i10 != -1) {
                            if (parseInt15 == 10) {
                                i11 = 1;
                                i12 = -1;
                            } else if (parseInt15 == 20) {
                                i12 = -1;
                                i11 = 2;
                            } else if (parseInt15 == 30) {
                                i12 = -1;
                                i11 = 4;
                            } else if (parseInt15 == 40) {
                                i12 = -1;
                                i11 = 8;
                            } else if (parseInt15 == 45) {
                                i12 = -1;
                                i11 = 16;
                            } else if (parseInt15 == 50) {
                                i12 = -1;
                                i11 = 32;
                            } else if (parseInt15 != 60) {
                                i12 = -1;
                                i11 = parseInt15 != 70 ? -1 : 128;
                            } else {
                                i12 = -1;
                                i11 = 64;
                            }
                            if (i11 != i12) {
                                break;
                            } else {
                                c00.p(parseInt15, "Unknown H263 level: ", "CodecSpecificDataUtil");
                                break;
                            }
                        } else {
                            c00.p(parseInt14, "Unknown H263 profile: ", "CodecSpecificDataUtil");
                            break;
                        }
                    } catch (NumberFormatException unused5) {
                        bp1.s("Ignoring malformed H263 codec string: ", str2, "CodecSpecificDataUtil");
                        return null;
                    }
                }
            case '\n':
                if (split.length < 3) {
                    bp1.s("Ignoring malformed VP9 codec string: ", str2, "CodecSpecificDataUtil");
                    break;
                } else {
                    try {
                        int parseInt16 = Integer.parseInt(split[1]);
                        int parseInt17 = Integer.parseInt(split[2]);
                        int i20 = parseInt16 != 0 ? parseInt16 != 1 ? parseInt16 != 2 ? parseInt16 != 3 ? -1 : 8 : 4 : 2 : 1;
                        if (i20 == -1) {
                            c00.p(parseInt16, "Unknown VP9 profile: ", "CodecSpecificDataUtil");
                            break;
                        } else {
                            if (parseInt17 != 10) {
                                if (parseInt17 == 11) {
                                    i14 = -1;
                                    i13 = 2;
                                } else if (parseInt17 == 20) {
                                    i14 = -1;
                                    i13 = 4;
                                } else if (parseInt17 == 21) {
                                    i14 = -1;
                                    i13 = 8;
                                } else if (parseInt17 == 30) {
                                    i14 = -1;
                                    i13 = 16;
                                } else if (parseInt17 == 31) {
                                    i14 = -1;
                                    i13 = 32;
                                } else if (parseInt17 == 40) {
                                    i14 = -1;
                                    i13 = 64;
                                } else if (parseInt17 == 41) {
                                    i14 = -1;
                                    i13 = 128;
                                } else if (parseInt17 == 50) {
                                    i14 = -1;
                                    i13 = 256;
                                } else if (parseInt17 != 51) {
                                    switch (parseInt17) {
                                        case jn7.w0 /* 60 */:
                                            i14 = -1;
                                            i13 = 2048;
                                            break;
                                        case jn7.x0 /* 61 */:
                                            i14 = -1;
                                            i13 = TLObject.FLAG_12;
                                            break;
                                        case jn7.y0 /* 62 */:
                                            i13 = 8192;
                                            break;
                                        default:
                                            i14 = -1;
                                            i13 = -1;
                                            break;
                                    }
                                } else {
                                    i14 = -1;
                                    i13 = 512;
                                }
                                if (i13 == i14) {
                                    break;
                                } else {
                                    c00.p(parseInt17, "Unknown VP9 level: ", "CodecSpecificDataUtil");
                                    break;
                                }
                            } else {
                                i13 = 1;
                            }
                            i14 = -1;
                            if (i13 == i14) {
                            }
                        }
                    } catch (NumberFormatException unused6) {
                        bp1.s("Ignoring malformed VP9 codec string: ", str2, "CodecSpecificDataUtil");
                        return null;
                    }
                }
            case 11:
            case '\f':
                bm2 bm2Var2 = ko4Var.L;
                if (split.length < 3) {
                    bp1.s("Ignoring malformed VVC codec string: ", str2, "CodecSpecificDataUtil");
                    break;
                } else {
                    try {
                        int parseInt18 = Integer.parseInt(split[1]);
                        if (parseInt18 != 1) {
                            if (parseInt18 != 65) {
                                efd.f("CodecSpecificDataUtil", "Unknown VVC profile IDC: " + split[1]);
                                break;
                            } else {
                                i15 = 4;
                            }
                        } else {
                            if (bm2Var2 != null) {
                                if (bm2Var2.c == 6) {
                                    i15 = TLObject.FLAG_12;
                                } else if (bm2Var2.e == 8) {
                                    i15 = 1;
                                }
                            }
                            i15 = 2;
                        }
                        String str6 = split[2];
                        str6.getClass();
                        switch (str6.hashCode()) {
                            case 70918:
                                if (str6.equals("H64")) {
                                    c3 = 0;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 70921:
                                if (str6.equals("H67")) {
                                    c3 = 1;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 70976:
                                if (str6.equals("H80")) {
                                    c3 = 2;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 70979:
                                break;
                            case 70982:
                                if (str6.equals("H86")) {
                                    c3 = 4;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 71013:
                                if (str6.equals("H96")) {
                                    c3 = 5;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 74609:
                                if (str6.equals("L16")) {
                                    c3 = 6;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 74667:
                                if (str6.equals("L32")) {
                                    c3 = 7;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 74670:
                                if (str6.equals("L35")) {
                                    c3 = '\b';
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 74704:
                                if (str6.equals("L48")) {
                                    c3 = '\t';
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 74728:
                                if (str6.equals("L51")) {
                                    c3 = '\n';
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 74762:
                                if (str6.equals("L64")) {
                                    c3 = 11;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 74765:
                                if (str6.equals("L67")) {
                                    c3 = '\f';
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 74820:
                                if (str6.equals("L80")) {
                                    c6 = '\r';
                                    c3 = c6;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 74823:
                                if (str6.equals("L83")) {
                                    c6 = 14;
                                    c3 = c6;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 74826:
                                if (str6.equals("L86")) {
                                    c6 = 15;
                                    c3 = c6;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 74857:
                                if (str6.equals("L96")) {
                                    c3 = 16;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 2193610:
                                if (str6.equals("H112")) {
                                    c6 = 17;
                                    c3 = c6;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 2193647:
                                if (str6.equals("H128")) {
                                    c6 = 18;
                                    c3 = c6;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 2193705:
                                if (str6.equals("H144")) {
                                    c6 = 19;
                                    c3 = c6;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 2312774:
                                if (str6.equals("L112")) {
                                    c3 = 20;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 2312811:
                                if (str6.equals("L128")) {
                                    c6 = 21;
                                    c3 = c6;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 2312869:
                                if (str6.equals("L144")) {
                                    c6 = 22;
                                    c3 = c6;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            default:
                                c3 = 65535;
                                break;
                        }
                        switch (c3) {
                            case 0:
                                num2 = 64;
                                break;
                            case 1:
                                num2 = 256;
                                break;
                            case 2:
                                break;
                            case 3:
                                num2 = valueOf;
                                break;
                            case 4:
                                num2 = Integer.valueOf(TLObject.FLAG_14);
                                break;
                            case 5:
                                num2 = 65536;
                                break;
                            case 6:
                                num2 = 1;
                                break;
                            case 7:
                                num2 = 2;
                                break;
                            case '\b':
                                num2 = 4;
                                break;
                            case '\t':
                                num2 = 8;
                                break;
                            case '\n':
                                num2 = 16;
                                break;
                            case 11:
                                num2 = 32;
                                break;
                            case '\f':
                                num2 = 128;
                                break;
                            case '\r':
                                num2 = 512;
                                break;
                            case 14:
                                num2 = 2048;
                                break;
                            case 15:
                                num2 = Integer.valueOf(TLObject.FLAG_13);
                                break;
                            case 16:
                                num2 = 32768;
                                break;
                            case 17:
                                num2 = 262144;
                                break;
                            case 18:
                                num2 = Integer.valueOf(TLObject.FLAG_20);
                                break;
                            case 19:
                                num2 = Integer.valueOf(TLObject.FLAG_22);
                                break;
                            case 20:
                                num2 = 131072;
                                break;
                            case 21:
                                num2 = Integer.valueOf(TLObject.FLAG_19);
                                break;
                            case 22:
                                num2 = Integer.valueOf(TLObject.FLAG_21);
                                break;
                            default:
                                num2 = null;
                                break;
                        }
                        if (num2 != null) {
                            break;
                        } else {
                            efd.f("CodecSpecificDataUtil", "Unknown VVC level string: ".concat(str6));
                            break;
                        }
                    } catch (NumberFormatException unused7) {
                        bp1.s("Ignoring malformed VVC codec string: ", str2, "CodecSpecificDataUtil");
                        return null;
                    }
                }
        }
        return null;
        return null;
    }

    public static boolean e(ko4 ko4Var) {
        int i;
        if (Objects.equals(ko4Var.t, "application/x-itut-t35")) {
            for (byte[] bArr : ko4Var.w) {
                int length = bArr.length;
                byte[] bArr2 = d;
                if (length >= bArr2.length) {
                    for (0; i < bArr2.length; i + 1) {
                        i = bArr[i] == bArr2[i] ? i + 1 : 0;
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
